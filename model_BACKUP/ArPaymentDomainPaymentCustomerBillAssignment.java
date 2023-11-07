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
import se.telia.infonova.model.ApiModelV1CommonsDomainValue;

/**
 * ArPaymentDomainPaymentCustomerBillAssignment
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-07T15:46:38.398+01:00")
public class ArPaymentDomainPaymentCustomerBillAssignment {
  @JsonProperty("amount")
  private ApiModelV1CommonsDomainValue amount = null;

  @JsonProperty("customerBill")
  private String customerBill = null;

  @JsonProperty("payment")
  private String payment = null;

  public ArPaymentDomainPaymentCustomerBillAssignment amount(ApiModelV1CommonsDomainValue amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(value = "")
  public ApiModelV1CommonsDomainValue getAmount() {
    return amount;
  }

  public void setAmount(ApiModelV1CommonsDomainValue amount) {
    this.amount = amount;
  }

  public ArPaymentDomainPaymentCustomerBillAssignment customerBill(String customerBill) {
    this.customerBill = customerBill;
    return this;
  }

   /**
   * Get customerBill
   * @return customerBill
  **/
  @ApiModelProperty(value = "")
  public String getCustomerBill() {
    return customerBill;
  }

  public void setCustomerBill(String customerBill) {
    this.customerBill = customerBill;
  }

  public ArPaymentDomainPaymentCustomerBillAssignment payment(String payment) {
    this.payment = payment;
    return this;
  }

   /**
   * Get payment
   * @return payment
  **/
  @ApiModelProperty(value = "")
  public String getPayment() {
    return payment;
  }

  public void setPayment(String payment) {
    this.payment = payment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArPaymentDomainPaymentCustomerBillAssignment arPaymentDomainPaymentCustomerBillAssignment = (ArPaymentDomainPaymentCustomerBillAssignment) o;
    return Objects.equals(this.amount, arPaymentDomainPaymentCustomerBillAssignment.amount) &&
        Objects.equals(this.customerBill, arPaymentDomainPaymentCustomerBillAssignment.customerBill) &&
        Objects.equals(this.payment, arPaymentDomainPaymentCustomerBillAssignment.payment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, customerBill, payment);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArPaymentDomainPaymentCustomerBillAssignment {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    customerBill: ").append(toIndentedString(customerBill)).append("\n");
    sb.append("    payment: ").append(toIndentedString(payment)).append("\n");
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

