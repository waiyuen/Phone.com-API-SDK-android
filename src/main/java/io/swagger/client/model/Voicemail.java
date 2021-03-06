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

import io.swagger.client.model.Greeting;
import io.swagger.client.model.Notification;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Voicemail Object. See below for details.
 **/
@ApiModel(description = "Voicemail Object. See below for details.")
public class Voicemail {
  
  @SerializedName("enabled")
  private Boolean enabled = null;
  @SerializedName("password")
  private String password = null;
  @SerializedName("greeting")
  private Greeting greeting = null;
  @SerializedName("attachments")
  private String attachments = null;
  @SerializedName("notifications")
  private Notification notifications = null;
  @SerializedName("transcription")
  private String transcription = null;

  /**
   * Whether voicemail is enabled. Boolean.
   **/
  @ApiModelProperty(value = "Whether voicemail is enabled. Boolean.")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  /**
   * Password for accessing voicemail box. Must be digits only.
   **/
  @ApiModelProperty(value = "Password for accessing voicemail box. Must be digits only.")
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Greeting getGreeting() {
    return greeting;
  }
  public void setGreeting(Greeting greeting) {
    this.greeting = greeting;
  }

  /**
   * If notification emails are being used, this defines the format of the audio attachments. Can be \"wav\" for WAV format, \"mp3\" for MP3 format, or NULL to disable attachments.
   **/
  @ApiModelProperty(value = "If notification emails are being used, this defines the format of the audio attachments. Can be \"wav\" for WAV format, \"mp3\" for MP3 format, or NULL to disable attachments.")
  public String getAttachments() {
    return attachments;
  }
  public void setAttachments(String attachments) {
    this.attachments = attachments;
  }

  /**
   * Voicemail Notifications Object. See below for details. Can be set to NULL to disable notifications.
   **/
  @ApiModelProperty(value = "Voicemail Notifications Object. See below for details. Can be set to NULL to disable notifications.")
  public Notification getNotifications() {
    return notifications;
  }
  public void setNotifications(Notification notifications) {
    this.notifications = notifications;
  }

  /**
   * Type of voicemail transcription to use. Can be \"human\" for high-quality manual transcriptions by human operators, \"automated\" for machine-generated transcriptions, or NULL to omit trancriptions. Changing this option will affect your monthly bill. Please see our Control Panel or contact Customer Service for details.
   **/
  @ApiModelProperty(value = "Type of voicemail transcription to use. Can be \"human\" for high-quality manual transcriptions by human operators, \"automated\" for machine-generated transcriptions, or NULL to omit trancriptions. Changing this option will affect your monthly bill. Please see our Control Panel or contact Customer Service for details.")
  public String getTranscription() {
    return transcription;
  }
  public void setTranscription(String transcription) {
    this.transcription = transcription;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Voicemail voicemail = (Voicemail) o;
    return (this.enabled == null ? voicemail.enabled == null : this.enabled.equals(voicemail.enabled)) &&
        (this.password == null ? voicemail.password == null : this.password.equals(voicemail.password)) &&
        (this.greeting == null ? voicemail.greeting == null : this.greeting.equals(voicemail.greeting)) &&
        (this.attachments == null ? voicemail.attachments == null : this.attachments.equals(voicemail.attachments)) &&
        (this.notifications == null ? voicemail.notifications == null : this.notifications.equals(voicemail.notifications)) &&
        (this.transcription == null ? voicemail.transcription == null : this.transcription.equals(voicemail.transcription));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.enabled == null ? 0: this.enabled.hashCode());
    result = 31 * result + (this.password == null ? 0: this.password.hashCode());
    result = 31 * result + (this.greeting == null ? 0: this.greeting.hashCode());
    result = 31 * result + (this.attachments == null ? 0: this.attachments.hashCode());
    result = 31 * result + (this.notifications == null ? 0: this.notifications.hashCode());
    result = 31 * result + (this.transcription == null ? 0: this.transcription.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Voicemail {\n");
    
    sb.append("  enabled: ").append(enabled).append("\n");
    sb.append("  password: ").append(password).append("\n");
    sb.append("  greeting: ").append(greeting).append("\n");
    sb.append("  attachments: ").append(attachments).append("\n");
    sb.append("  notifications: ").append(notifications).append("\n");
    sb.append("  transcription: ").append(transcription).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
