/*
 * Infonova API Swagger
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package se.telia.infonova.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ApiModelV1CommonsDomainOverrider
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-07T15:46:38.398+01:00")
public class ApiModelV1CommonsDomainOverrider {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("validityPeriod")
  private String validityPeriod = null;

  public ApiModelV1CommonsDomainOverrider name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ApiModelV1CommonsDomainOverrider validityPeriod(String validityPeriod) {
    this.validityPeriod = validityPeriod;
    return this;
  }

   /**
   * Get validityPeriod
   * @return validityPeriod
  **/
  @ApiModelProperty(value = "")
  public String getValidityPeriod() {
    return validityPeriod;
  }

  public void setValidityPeriod(String validityPeriod) {
    this.validityPeriod = validityPeriod;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiModelV1CommonsDomainOverrider apiModelV1CommonsDomainOverrider = (ApiModelV1CommonsDomainOverrider) o;
    return Objects.equals(this.name, apiModelV1CommonsDomainOverrider.name) &&
        Objects.equals(this.validityPeriod, apiModelV1CommonsDomainOverrider.validityPeriod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, validityPeriod);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiModelV1CommonsDomainOverrider {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    validityPeriod: ").append(toIndentedString(validityPeriod)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

