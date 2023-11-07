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
import java.util.ArrayList;
import java.util.List;
import se.telia.infonova.model.BalanceV1DomainBalanceParameter;
import se.telia.infonova.model.CommonsTimeInterval;

/**
 * BalanceV1DomainBalance
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-07T15:46:38.398+01:00")
public class BalanceV1DomainBalance {
  @JsonProperty("balanceParameters")
  private List<BalanceV1DomainBalanceParameter> balanceParameters = null;

  @JsonProperty("billingAccount")
  private String billingAccount = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("reference")
  private String reference = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("validFor")
  private CommonsTimeInterval validFor = null;

  @JsonProperty("value")
  private java.math.BigDecimal value = null;

  public BalanceV1DomainBalance balanceParameters(List<BalanceV1DomainBalanceParameter> balanceParameters) {
    this.balanceParameters = balanceParameters;
    return this;
  }

  public BalanceV1DomainBalance addBalanceParametersItem(BalanceV1DomainBalanceParameter balanceParametersItem) {
    if (this.balanceParameters == null) {
      this.balanceParameters = new ArrayList<BalanceV1DomainBalanceParameter>();
    }
    this.balanceParameters.add(balanceParametersItem);
    return this;
  }

   /**
   * Get balanceParameters
   * @return balanceParameters
  **/
  @ApiModelProperty(value = "")
  public List<BalanceV1DomainBalanceParameter> getBalanceParameters() {
    return balanceParameters;
  }

  public void setBalanceParameters(List<BalanceV1DomainBalanceParameter> balanceParameters) {
    this.balanceParameters = balanceParameters;
  }

  public BalanceV1DomainBalance billingAccount(String billingAccount) {
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

  public BalanceV1DomainBalance id(String id) {
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

  public BalanceV1DomainBalance reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * Get reference
   * @return reference
  **/
  @ApiModelProperty(value = "")
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public BalanceV1DomainBalance type(String type) {
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

  public BalanceV1DomainBalance validFor(CommonsTimeInterval validFor) {
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

  public BalanceV1DomainBalance value(java.math.BigDecimal value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(value = "")
  public java.math.BigDecimal getValue() {
    return value;
  }

  public void setValue(java.math.BigDecimal value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BalanceV1DomainBalance balanceV1DomainBalance = (BalanceV1DomainBalance) o;
    return Objects.equals(this.balanceParameters, balanceV1DomainBalance.balanceParameters) &&
        Objects.equals(this.billingAccount, balanceV1DomainBalance.billingAccount) &&
        Objects.equals(this.id, balanceV1DomainBalance.id) &&
        Objects.equals(this.reference, balanceV1DomainBalance.reference) &&
        Objects.equals(this.type, balanceV1DomainBalance.type) &&
        Objects.equals(this.validFor, balanceV1DomainBalance.validFor) &&
        Objects.equals(this.value, balanceV1DomainBalance.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balanceParameters, billingAccount, id, reference, type, validFor, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BalanceV1DomainBalance {\n");
    
    sb.append("    balanceParameters: ").append(toIndentedString(balanceParameters)).append("\n");
    sb.append("    billingAccount: ").append(toIndentedString(billingAccount)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
