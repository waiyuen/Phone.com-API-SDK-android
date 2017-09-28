/**
 * Phone.com API
 * This is a Phone.com api Swagger definition
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apisupport@phone.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class CreatePricingParams {
  
  @SerializedName("pricing_id")
  private Integer pricingId = null;
  @SerializedName("reason")
  private String reason = null;
  @SerializedName("expire_date")
  private Integer expireDate = null;

  /**
   * Pricing plan code
   **/
  @ApiModelProperty(value = "Pricing plan code")
  public Integer getPricingId() {
    return pricingId;
  }
  public void setPricingId(Integer pricingId) {
    this.pricingId = pricingId;
  }

  /**
   * Reason this pricing plan is added to the subaccount
   **/
  @ApiModelProperty(value = "Reason this pricing plan is added to the subaccount")
  public String getReason() {
    return reason;
  }
  public void setReason(String reason) {
    this.reason = reason;
  }

  /**
   * Pricing plan expiration time in UNIX format. Disregard or set it to null for plan which never expires
   **/
  @ApiModelProperty(value = "Pricing plan expiration time in UNIX format. Disregard or set it to null for plan which never expires")
  public Integer getExpireDate() {
    return expireDate;
  }
  public void setExpireDate(Integer expireDate) {
    this.expireDate = expireDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatePricingParams createPricingParams = (CreatePricingParams) o;
    return (this.pricingId == null ? createPricingParams.pricingId == null : this.pricingId.equals(createPricingParams.pricingId)) &&
        (this.reason == null ? createPricingParams.reason == null : this.reason.equals(createPricingParams.reason)) &&
        (this.expireDate == null ? createPricingParams.expireDate == null : this.expireDate.equals(createPricingParams.expireDate));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pricingId == null ? 0: this.pricingId.hashCode());
    result = 31 * result + (this.reason == null ? 0: this.reason.hashCode());
    result = 31 * result + (this.expireDate == null ? 0: this.expireDate.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePricingParams {\n");
    
    sb.append("  pricingId: ").append(pricingId).append("\n");
    sb.append("  reason: ").append(reason).append("\n");
    sb.append("  expireDate: ").append(expireDate).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
