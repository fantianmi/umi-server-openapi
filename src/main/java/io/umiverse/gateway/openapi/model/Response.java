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
 * Response
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-08-03T15:10:02.892036+08:00[Asia/Shanghai]")
public class Response {

  @JsonProperty("data")
  private Object data;

  @JsonProperty("message")
  private String message;

  public Response data(Object data) {
    this.data = data;
    return this;
  }

  /**
   * return data of response
   * @return data
  */
  
  @Schema(name = "data", description = "return data of response", required = false)
  public Object getData() {
    return data;
  }

  public void setData(Object data) {
    this.data = data;
  }

  public Response message(String message) {
    this.message = message;
    return this;
  }

  /**
   * message of response
   * @return message
  */
  
  @Schema(name = "message", description = "message of response", required = false)
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Response response = (Response) o;
    return Objects.equals(this.data, response.data) &&
        Objects.equals(this.message, response.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Response {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

