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
 * ApiModelV1CommonsDomainFundReference
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-07T15:46:38.398+01:00")
public class ApiModelV1CommonsDomainFundReference {
  @JsonProperty("billingAccount")
  private String billingAccount = null;

  @JsonProperty("id")
  private String id = null;

  public ApiModelV1CommonsDomainFundReference billingAccount(String billingAccount) {
    this.billingAccount = billingAccount;
    return this;
  }

   /**
   * Get billingAccount
   * @return billingAccount
  **/
  @ApiModelProperty(value = "")
  public String getBillingAccount() {
    return billingAccount;
  }

  public void setBillingAccount(String billingAccount) {
    this.billingAccount = billingAccount;
  }

  public ApiModelV1CommonsDomainFundReference id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiModelV1CommonsDomainFundReference apiModelV1CommonsDomainFundReference = (ApiModelV1CommonsDomainFundReference) o;
    return Objects.equals(this.billingAccount, apiModelV1CommonsDomainFundReference.billingAccount) &&
        Objects.equals(this.id, apiModelV1CommonsDomainFundReference.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingAccount, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiModelV1CommonsDomainFundReference {\n");
    
    sb.append("    billingAccount: ").append(toIndentedString(billingAccount)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
