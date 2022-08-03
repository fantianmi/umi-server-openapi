package io.umiverse.gateway.openapi.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * UserEditRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-08-03T15:10:02.892036+08:00[Asia/Shanghai]")
public class UserEditRequest {

  @JsonProperty("userName")
  private String userName;

  @JsonProperty("picture")
  private String picture;

  public UserEditRequest userName(String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * change user name .
   * @return userName
  */
  
  @Schema(name = "userName", description = "change user name .", required = false)
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public UserEditRequest picture(String picture) {
    this.picture = picture;
    return this;
  }

  /**
   * the unique picture for user.
   * @return picture
  */
  
  @Schema(name = "picture", description = "the unique picture for user.", required = false)
  public String getPicture() {
    return picture;
  }

  public void setPicture(String picture) {
    this.picture = picture;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserEditRequest userEditRequest = (UserEditRequest) o;
    return Objects.equals(this.userName, userEditRequest.userName) &&
        Objects.equals(this.picture, userEditRequest.picture);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userName, picture);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserEditRequest {\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    picture: ").append(toIndentedString(picture)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

