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

import io.swagger.client.model.PricingObject;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * The Full Pricing Object is identical to the Pricing Summary Object. The Pricing Summary Object is used to briefly represent a pricing plan. Here are the properties:
 **/
@ApiModel(description = "The Full Pricing Object is identical to the Pricing Summary Object. The Pricing Summary Object is used to briefly represent a pricing plan. Here are the properties:")
public class PricingFull {
  
  @SerializedName("id")
  private Integer id = null;
  @SerializedName("pricing")
  private PricingObject pricing = null;
  @SerializedName("voip_id")
  private Integer voipId = null;
  @SerializedName("reason")
  private String reason = null;
  @SerializedName("who")
  private String who = null;
  @SerializedName("expire_date")
  private String expireDate = null;

  /**
   * Integer ID of this object.
   **/
  @ApiModelProperty(value = "Integer ID of this object.")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * Pricing Object
   **/
  @ApiModelProperty(value = "Pricing Object")
  public PricingObject getPricing() {
    return pricing;
  }
  public void setPricing(PricingObject pricing) {
    this.pricing = pricing;
  }

  /**
   * Phone.com API Account (VoIP) ID
   **/
  @ApiModelProperty(value = "Phone.com API Account (VoIP) ID")
  public Integer getVoipId() {
    return voipId;
  }
  public void setVoipId(Integer voipId) {
    this.voipId = voipId;
  }

  /**
   * Reason this pricing plan is applied
   **/
  @ApiModelProperty(value = "Reason this pricing plan is applied")
  public String getReason() {
    return reason;
  }
  public void setReason(String reason) {
    this.reason = reason;
  }

  /**
   * Name of the person / process who added this pricing plan to the subaccount
   **/
  @ApiModelProperty(value = "Name of the person / process who added this pricing plan to the subaccount")
  public String getWho() {
    return who;
  }
  public void setWho(String who) {
    this.who = who;
  }

  /**
   * Pricing plan expiration timestamp in unix format. If pricing plan never expires, this item will not be returned
   **/
  @ApiModelProperty(value = "Pricing plan expiration timestamp in unix format. If pricing plan never expires, this item will not be returned")
  public String getExpireDate() {
    return expireDate;
  }
  public void setExpireDate(String expireDate) {
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
    PricingFull pricingFull = (PricingFull) o;
    return (this.id == null ? pricingFull.id == null : this.id.equals(pricingFull.id)) &&
        (this.pricing == null ? pricingFull.pricing == null : this.pricing.equals(pricingFull.pricing)) &&
        (this.voipId == null ? pricingFull.voipId == null : this.voipId.equals(pricingFull.voipId)) &&
        (this.reason == null ? pricingFull.reason == null : this.reason.equals(pricingFull.reason)) &&
        (this.who == null ? pricingFull.who == null : this.who.equals(pricingFull.who)) &&
        (this.expireDate == null ? pricingFull.expireDate == null : this.expireDate.equals(pricingFull.expireDate));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.pricing == null ? 0: this.pricing.hashCode());
    result = 31 * result + (this.voipId == null ? 0: this.voipId.hashCode());
    result = 31 * result + (this.reason == null ? 0: this.reason.hashCode());
    result = 31 * result + (this.who == null ? 0: this.who.hashCode());
    result = 31 * result + (this.expireDate == null ? 0: this.expireDate.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PricingFull {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  pricing: ").append(pricing).append("\n");
    sb.append("  voipId: ").append(voipId).append("\n");
    sb.append("  reason: ").append(reason).append("\n");
    sb.append("  who: ").append(who).append("\n");
    sb.append("  expireDate: ").append(expireDate).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}