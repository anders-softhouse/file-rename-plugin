package se.softhouse.plugins;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;

import java.io.*;
import java.nio.file.*;

import java.util.*;
import java.util.regex.*;

@Mojo(name = "rename", defaultPhase = LifecyclePhase.GENERATE_SOURCES)
public class FileRenameMojo extends AbstractMojo {

    @Parameter(defaultValue = "${project}", required = true, readonly = true)
    MavenProject project;

    @Parameter(name = "sourceDir", property = "sourceDir", required = false)
    String sourceDir;

    @Parameter(name = "targetDir", property = "targetDir", required = false)
    String targetDir;

    @Parameter(name = "rules", property = "rules")
    private List<Rule> rules;

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {

        // Make sure directory paths are absolute. Check if relative and if so add base
        // directory.
        File source = new File(sourceDir);

        if (!source.isAbsolute()) {
            source = new File(project.getBasedir() + File.separator + sourceDir);
        }

        File target = new File(targetDir);

        if (!target.isAbsolute()) {
            target = new File(project.getBasedir() + File.separator + targetDir);
        }

        getLog().info("SOURCE: " + source.getAbsolutePath());
        getLog().info("TARGET: " + target.getAbsolutePath());

        File[] files = source.listFiles();

        getLog().info("Antal filer: " + files.length);
        List<File> filesCurrated = new ArrayList<>();

        // Currently we are only listing files. In the future we may recursively go into
        // sub-directories as well.
        for (File file : files) {

            if (file.isFile()) {
                filesCurrated.add(file);
            }

        }

        // For each file in the source directory, loop through eaqch rule and see if
        // file name or file content needs to change.
        for (File file : filesCurrated) {

            for (Rule rule : rules) {

                // If part of content matches regex, update content to new format ( every
                // occurance )
                String content = null;

                try {
                    content = new String(Files.readAllBytes(file.toPath()));
                    Matcher contentMatcher = Pattern.compile(rule.getContentRegex()).matcher(content);

                    if (contentMatcher.find()) {
                        getLog().info("FOUND CONTENT");
                        String newString = rule.getContentSubstitution();

                        for (int index = 0; index <= contentMatcher.groupCount(); index++) {
                            String name = index + "";
                            String value = contentMatcher.group(index);

                            newString = newString.replaceAll("\\^" + name + "\\$", value);
                        }

                        content = content.replaceAll(rule.getContentRegex(), newString);

                        getLog().info("CONTENT: " + content);

                        try {
                            Files.write(Paths.get(file.getAbsolutePath()), content.getBytes(),
                                    StandardOpenOption.TRUNCATE_EXISTING);
                        } catch (IOException e) {
                            e.printStackTrace();
                        } catch (UnsupportedOperationException e) {
                            e.printStackTrace();
                        } catch (SecurityException e) {
                            e.printStackTrace();
                        }

                    } else {
                        getLog().info("NOOOOOOOOOOOOOOOOOOOOOOOOOOO CONTENT");
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }

                // If file name matches regex, change file name to new format
                String fileName = file.getName();
                getLog().info("File: " + fileName);

                String newFileName = null;

                if (fileName.matches(rule.getFileRegex())) {
                    Pattern pattern = Pattern.compile(rule.getFileRegex());

                    Matcher matcher = pattern.matcher(fileName);
                    matcher.find();

                    newFileName = rule.getFileSubstitution();

                    for (int index = 0; index <= matcher.groupCount(); index++) {
                        String name = index + "";
                        String value = matcher.group(index);

                        newFileName = newFileName.replaceAll("\\^" + name + "\\$", value);
                    }

                    String newFullFileName = source.getAbsolutePath() + File.separator + newFileName;

                    try {
                        file.renameTo(new File(newFullFileName));
                    } catch (SecurityException e) {
                        e.printStackTrace();
                    }

                    getLog().info("NEW FILE NAME: " + newFileName);
                }

                getLog().info("RULE: " + rule.getFileRegex());
            }

        }

    }

}
