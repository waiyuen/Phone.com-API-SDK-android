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
public class PatchSmsParams {
  
  @SerializedName("is_new")
  private String isNew = null;

  /**
   * Status of SMS
   **/
  @ApiModelProperty(value = "Status of SMS")
  public String getIsNew() {
    return isNew;
  }
  public void setIsNew(String isNew) {
    this.isNew = isNew;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatchSmsParams patchSmsParams = (PatchSmsParams) o;
    return (this.isNew == null ? patchSmsParams.isNew == null : this.isNew.equals(patchSmsParams.isNew));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.isNew == null ? 0: this.isNew.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchSmsParams {\n");
    
    sb.append("  isNew: ").append(isNew).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}