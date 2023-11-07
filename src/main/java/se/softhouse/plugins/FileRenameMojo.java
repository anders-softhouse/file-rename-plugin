package se.softhouse.plugins;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;

import java.util.List;

@Mojo(name = "rename", defaultPhase = LifecyclePhase.GENERATE_SOURCES)
public class FileRenameMojo extends AbstractMojo {

    @Parameter(defaultValue = "${project}", required = true, readonly = true)
    MavenProject project;

    @Parameter( name = "sourceDir", property = "sourceDir", required = false)
    String sourceDir;

    @Parameter( name = "targetDir", property = "targetDir", required = false)
    String targetDir;

    @Parameter( name = "rules", property = "rules")
    private List< Rule > rules;


    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().info("SOURCE: " + sourceDir);
        getLog().info("TARGET: " + targetDir);

        for( Rule rule : rules ) {
            getLog().info("RULE: " + rule.getFileRegex());
        }
    }

}
