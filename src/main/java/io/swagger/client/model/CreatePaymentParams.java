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
public class CreatePaymentParams {
  
  @SerializedName("nickname")
  private String nickname = null;
  @SerializedName("status")
  private String status = null;
  @SerializedName("type")
  private String type = null;
  @SerializedName("cc_token")
  private String ccToken = null;

  /**
   * Name of payment method
   **/
  @ApiModelProperty(value = "Name of payment method")
  public String getNickname() {
    return nickname;
  }
  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  /**
   * primary, onfile or hidden
   **/
  @ApiModelProperty(value = "primary, onfile or hidden")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Credit Card Type
   **/
  @ApiModelProperty(value = "Credit Card Type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Credit Card Token. Token is obtained by entering credit card info via the Credit Card Entry Form
   **/
  @ApiModelProperty(value = "Credit Card Token. Token is obtained by entering credit card info via the Credit Card Entry Form")
  public String getCcToken() {
    return ccToken;
  }
  public void setCcToken(String ccToken) {
    this.ccToken = ccToken;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatePaymentParams createPaymentParams = (CreatePaymentParams) o;
    return (this.nickname == null ? createPaymentParams.nickname == null : this.nickname.equals(createPaymentParams.nickname)) &&
        (this.status == null ? createPaymentParams.status == null : this.status.equals(createPaymentParams.status)) &&
        (this.type == null ? createPaymentParams.type == null : this.type.equals(createPaymentParams.type)) &&
        (this.ccToken == null ? createPaymentParams.ccToken == null : this.ccToken.equals(createPaymentParams.ccToken));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.nickname == null ? 0: this.nickname.hashCode());
    result = 31 * result + (this.status == null ? 0: this.status.hashCode());
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    result = 31 * result + (this.ccToken == null ? 0: this.ccToken.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePaymentParams {\n");
    
    sb.append("  nickname: ").append(nickname).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  ccToken: ").append(ccToken).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
