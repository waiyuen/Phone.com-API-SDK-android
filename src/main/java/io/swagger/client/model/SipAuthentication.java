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

/**
 * A SIP Authentication Properties Object. See below for details. Read-only.
 **/
@ApiModel(description = "A SIP Authentication Properties Object. See below for details. Read-only.")
public class SipAuthentication {
  
  @SerializedName("host")
  private String host = null;
  @SerializedName("port")
  private Integer port = null;
  @SerializedName("username")
  private String username = null;
  @SerializedName("password")
  private String password = null;

  /**
   * Hostname
   **/
  @ApiModelProperty(value = "Hostname")
  public String getHost() {
    return host;
  }
  public void setHost(String host) {
    this.host = host;
  }

  /**
   * Port number
   **/
  @ApiModelProperty(value = "Port number")
  public Integer getPort() {
    return port;
  }
  public void setPort(Integer port) {
    this.port = port;
  }

  /**
   * Username. This is the ID of the device.
   **/
  @ApiModelProperty(value = "Username. This is the ID of the device.")
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }

  /**
   * Password.
   **/
  @ApiModelProperty(value = "Password.")
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SipAuthentication sipAuthentication = (SipAuthentication) o;
    return (this.host == null ? sipAuthentication.host == null : this.host.equals(sipAuthentication.host)) &&
        (this.port == null ? sipAuthentication.port == null : this.port.equals(sipAuthentication.port)) &&
        (this.username == null ? sipAuthentication.username == null : this.username.equals(sipAuthentication.username)) &&
        (this.password == null ? sipAuthentication.password == null : this.password.equals(sipAuthentication.password));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.host == null ? 0: this.host.hashCode());
    result = 31 * result + (this.port == null ? 0: this.port.hashCode());
    result = 31 * result + (this.username == null ? 0: this.username.hashCode());
    result = 31 * result + (this.password == null ? 0: this.password.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SipAuthentication {\n");
    
    sb.append("  host: ").append(host).append("\n");
    sb.append("  port: ").append(port).append("\n");
    sb.append("  username: ").append(username).append("\n");
    sb.append("  password: ").append(password).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}