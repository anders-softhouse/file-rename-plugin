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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import se.telia.infonova.model.CommonsTimeInterval;

/**
 * ArPaymentDomainBillingAccountPaymentMethod
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-07T15:46:38.398+01:00")
public class ArPaymentDomainBillingAccountPaymentMethod {
  @JsonProperty("billingAccount")
  private String billingAccount = null;

  @JsonProperty("details")
  private Map<String, String> details = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("state")
  private String state = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("uniqueReference")
  private String uniqueReference = null;

  @JsonProperty("validFor")
  private CommonsTimeInterval validFor = null;

  public ArPaymentDomainBillingAccountPaymentMethod billingAccount(String billingAccount) {
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

  public ArPaymentDomainBillingAccountPaymentMethod details(Map<String, String> details) {
    this.details = details;
    return this;
  }

  public ArPaymentDomainBillingAccountPaymentMethod putDetailsItem(String key, String detailsItem) {
    if (this.details == null) {
      this.details = new HashMap<String, String>();
    }
    this.details.put(key, detailsItem);
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @ApiModelProperty(value = "")
  public Map<String, String> getDetails() {
    return details;
  }

  public void setDetails(Map<String, String> details) {
    this.details = details;
  }

  public ArPaymentDomainBillingAccountPaymentMethod id(String id) {
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

  public ArPaymentDomainBillingAccountPaymentMethod state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(value = "")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public ArPaymentDomainBillingAccountPaymentMethod type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ArPaymentDomainBillingAccountPaymentMethod uniqueReference(String uniqueReference) {
    this.uniqueReference = uniqueReference;
    return this;
  }

   /**
   * Get uniqueReference
   * @return uniqueReference
  **/
  @ApiModelProperty(value = "")
  public String getUniqueReference() {
    return uniqueReference;
  }

  public void setUniqueReference(String uniqueReference) {
    this.uniqueReference = uniqueReference;
  }

  public ArPaymentDomainBillingAccountPaymentMethod validFor(CommonsTimeInterval validFor) {
    this.validFor = validFor;
    return this;
  }

   /**
   * Get validFor
   * @return validFor
  **/
  @ApiModelProperty(value = "")
  public CommonsTimeInterval getValidFor() {
    return validFor;
  }

  public void setValidFor(CommonsTimeInterval validFor) {
    this.validFor = validFor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArPaymentDomainBillingAccountPaymentMethod arPaymentDomainBillingAccountPaymentMethod = (ArPaymentDomainBillingAccountPaymentMethod) o;
    return Objects.equals(this.billingAccount, arPaymentDomainBillingAccountPaymentMethod.billingAccount) &&
        Objects.equals(this.details, arPaymentDomainBillingAccountPaymentMethod.details) &&
        Objects.equals(this.id, arPaymentDomainBillingAccountPaymentMethod.id) &&
        Objects.equals(this.state, arPaymentDomainBillingAccountPaymentMethod.state) &&
        Objects.equals(this.type, arPaymentDomainBillingAccountPaymentMethod.type) &&
        Objects.equals(this.uniqueReference, arPaymentDomainBillingAccountPaymentMethod.uniqueReference) &&
        Objects.equals(this.validFor, arPaymentDomainBillingAccountPaymentMethod.validFor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingAccount, details, id, state, type, uniqueReference, validFor);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArPaymentDomainBillingAccountPaymentMethod {\n");
    
    sb.append("    billingAccount: ").append(toIndentedString(billingAccount)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    uniqueReference: ").append(toIndentedString(uniqueReference)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
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

