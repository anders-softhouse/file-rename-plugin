package se.softhouse.plugins;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;

import java.io.File;

import java.util.List;
import java.util.ArrayList;

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
        List<File> filesCurrated = new ArrayList<>();

        for (File file : filesCurrated) {

            if (file.isFile()) {
                filesCurrated.add(file);
            }

        }

        for (File file : filesCurrated) {

            for (Rule rule : rules) {

                if(  ) {

                }

                getLog().info("RULE: " + rule.getFileRegex());
            }

        }

    }

}
