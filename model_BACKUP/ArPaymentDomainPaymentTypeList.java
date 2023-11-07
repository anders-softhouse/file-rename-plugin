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
import se.telia.infonova.model.ArPaymentDomainPaymentType;

/**
 * ArPaymentDomainPaymentTypeList
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-07T15:46:38.398+01:00")
public class ArPaymentDomainPaymentTypeList {
  @JsonProperty("list")
  private List<ArPaymentDomainPaymentType> _list = null;

  public ArPaymentDomainPaymentTypeList _list(List<ArPaymentDomainPaymentType> _list) {
    this._list = _list;
    return this;
  }

  public ArPaymentDomainPaymentTypeList addListItem(ArPaymentDomainPaymentType _listItem) {
    if (this._list == null) {
      this._list = new ArrayList<ArPaymentDomainPaymentType>();
    }
    this._list.add(_listItem);
    return this;
  }

   /**
   * Get _list
   * @return _list
  **/
  @ApiModelProperty(value = "")
  public List<ArPaymentDomainPaymentType> getList() {
    return _list;
  }

  public void setList(List<ArPaymentDomainPaymentType> _list) {
    this._list = _list;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArPaymentDomainPaymentTypeList arPaymentDomainPaymentTypeList = (ArPaymentDomainPaymentTypeList) o;
    return Objects.equals(this._list, arPaymentDomainPaymentTypeList._list);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_list);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArPaymentDomainPaymentTypeList {\n");
    
    sb.append("    _list: ").append(toIndentedString(_list)).append("\n");
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
