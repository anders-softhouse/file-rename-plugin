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
 * ArPaymentDomainRefundPaymentAssignment
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-07T15:46:38.398+01:00")
public class ArPaymentDomainRefundPaymentAssignment {
  @JsonProperty("payment")
  private String payment = null;

  @JsonProperty("refund")
  private String refund = null;

  public ArPaymentDomainRefundPaymentAssignment payment(String payment) {
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

  public ArPaymentDomainRefundPaymentAssignment refund(String refund) {
    this.refund = refund;
    return this;
  }

   /**
   * Get refund
   * @return refund
  **/
  @ApiModelProperty(value = "")
  public String getRefund() {
    return refund;
  }

  public void setRefund(String refund) {
    this.refund = refund;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArPaymentDomainRefundPaymentAssignment arPaymentDomainRefundPaymentAssignment = (ArPaymentDomainRefundPaymentAssignment) o;
    return Objects.equals(this.payment, arPaymentDomainRefundPaymentAssignment.payment) &&
        Objects.equals(this.refund, arPaymentDomainRefundPaymentAssignment.refund);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payment, refund);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArPaymentDomainRefundPaymentAssignment {\n");
    
    sb.append("    payment: ").append(toIndentedString(payment)).append("\n");
    sb.append("    refund: ").append(toIndentedString(refund)).append("\n");
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

