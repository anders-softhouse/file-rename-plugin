package se.softhouse.plugins;

import org.apache.maven.plugins.annotations.Parameter;

import lombok.Getter;

@Getter
public class Rule {

    @Parameter( name = "fileRegex", property = "fileRegex" )
    private String fileRegex;

    @Parameter( name = "fileSubstitution", property = "fileSubstitution" )
    private String fileSubstitution;

    @Parameter( name = "contentRegex", property = "contentRegex" )
    private String contentRegex;

    @Parameter( name = "contentSubstitution", property = "contentSubstitution" )
    private String contentSubstitution;
    
}
