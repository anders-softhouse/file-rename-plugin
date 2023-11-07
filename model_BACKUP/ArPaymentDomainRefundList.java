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
import se.telia.infonova.model.ArPaymentDomainPaymentListPaginationInformation;
import se.telia.infonova.model.ArPaymentDomainRefund;

/**
 * ArPaymentDomainRefundList
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-07T15:46:38.398+01:00")
public class ArPaymentDomainRefundList {
  @JsonProperty("list")
  private List<ArPaymentDomainRefund> _list = null;

  @JsonProperty("paginationInformation")
  private ArPaymentDomainPaymentListPaginationInformation paginationInformation = null;

  public ArPaymentDomainRefundList _list(List<ArPaymentDomainRefund> _list) {
    this._list = _list;
    return this;
  }

  public ArPaymentDomainRefundList addListItem(ArPaymentDomainRefund _listItem) {
    if (this._list == null) {
      this._list = new ArrayList<ArPaymentDomainRefund>();
    }
    this._list.add(_listItem);
    return this;
  }

   /**
   * Get _list
   * @return _list
  **/
  @ApiModelProperty(value = "")
  public List<ArPaymentDomainRefund> getList() {
    return _list;
  }

  public void setList(List<ArPaymentDomainRefund> _list) {
    this._list = _list;
  }

  public ArPaymentDomainRefundList paginationInformation(ArPaymentDomainPaymentListPaginationInformation paginationInformation) {
    this.paginationInformation = paginationInformation;
    return this;
  }

   /**
   * Get paginationInformation
   * @return paginationInformation
  **/
  @ApiModelProperty(value = "")
  public ArPaymentDomainPaymentListPaginationInformation getPaginationInformation() {
    return paginationInformation;
  }

  public void setPaginationInformation(ArPaymentDomainPaymentListPaginationInformation paginationInformation) {
    this.paginationInformation = paginationInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArPaymentDomainRefundList arPaymentDomainRefundList = (ArPaymentDomainRefundList) o;
    return Objects.equals(this._list, arPaymentDomainRefundList._list) &&
        Objects.equals(this.paginationInformation, arPaymentDomainRefundList.paginationInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_list, paginationInformation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArPaymentDomainRefundList {\n");
    
    sb.append("    _list: ").append(toIndentedString(_list)).append("\n");
    sb.append("    paginationInformation: ").append(toIndentedString(paginationInformation)).append("\n");
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
