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

import io.swagger.client.model.Address;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ContactAccount {
  
  @SerializedName("name")
  private String name = null;
  @SerializedName("company")
  private String company = null;
  @SerializedName("address")
  private Address address = null;
  @SerializedName("phone")
  private String phone = null;
  @SerializedName("fax")
  private String fax = null;
  @SerializedName("primary_email")
  private String primaryEmail = null;
  @SerializedName("alternate_email")
  private String alternateEmail = null;

  /**
   * Name. Required.
   **/
  @ApiModelProperty(value = "Name. Required.")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Company name
   **/
  @ApiModelProperty(value = "Company name")
  public String getCompany() {
    return company;
  }
  public void setCompany(String company) {
    this.company = company;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Address getAddress() {
    return address;
  }
  public void setAddress(Address address) {
    this.address = address;
  }

  /**
   * Phone number. Required.
   **/
  @ApiModelProperty(value = "Phone number. Required.")
  public String getPhone() {
    return phone;
  }
  public void setPhone(String phone) {
    this.phone = phone;
  }

  /**
   * Fax number
   **/
  @ApiModelProperty(value = "Fax number")
  public String getFax() {
    return fax;
  }
  public void setFax(String fax) {
    this.fax = fax;
  }

  /**
   * Primary email address. Required.
   **/
  @ApiModelProperty(value = "Primary email address. Required.")
  public String getPrimaryEmail() {
    return primaryEmail;
  }
  public void setPrimaryEmail(String primaryEmail) {
    this.primaryEmail = primaryEmail;
  }

  /**
   * Alternate email address
   **/
  @ApiModelProperty(value = "Alternate email address")
  public String getAlternateEmail() {
    return alternateEmail;
  }
  public void setAlternateEmail(String alternateEmail) {
    this.alternateEmail = alternateEmail;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactAccount contactAccount = (ContactAccount) o;
    return (this.name == null ? contactAccount.name == null : this.name.equals(contactAccount.name)) &&
        (this.company == null ? contactAccount.company == null : this.company.equals(contactAccount.company)) &&
        (this.address == null ? contactAccount.address == null : this.address.equals(contactAccount.address)) &&
        (this.phone == null ? contactAccount.phone == null : this.phone.equals(contactAccount.phone)) &&
        (this.fax == null ? contactAccount.fax == null : this.fax.equals(contactAccount.fax)) &&
        (this.primaryEmail == null ? contactAccount.primaryEmail == null : this.primaryEmail.equals(contactAccount.primaryEmail)) &&
        (this.alternateEmail == null ? contactAccount.alternateEmail == null : this.alternateEmail.equals(contactAccount.alternateEmail));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.company == null ? 0: this.company.hashCode());
    result = 31 * result + (this.address == null ? 0: this.address.hashCode());
    result = 31 * result + (this.phone == null ? 0: this.phone.hashCode());
    result = 31 * result + (this.fax == null ? 0: this.fax.hashCode());
    result = 31 * result + (this.primaryEmail == null ? 0: this.primaryEmail.hashCode());
    result = 31 * result + (this.alternateEmail == null ? 0: this.alternateEmail.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactAccount {\n");
    
    sb.append("  name: ").append(name).append("\n");
    sb.append("  company: ").append(company).append("\n");
    sb.append("  address: ").append(address).append("\n");
    sb.append("  phone: ").append(phone).append("\n");
    sb.append("  fax: ").append(fax).append("\n");
    sb.append("  primaryEmail: ").append(primaryEmail).append("\n");
    sb.append("  alternateEmail: ").append(alternateEmail).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
