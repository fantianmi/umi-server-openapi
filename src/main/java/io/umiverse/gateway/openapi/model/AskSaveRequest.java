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
 * AskSaveRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-08-03T15:10:02.892036+08:00[Asia/Shanghai]")
public class AskSaveRequest {

  @JsonProperty("nftId")
  private Integer nftId;

  @JsonProperty("price")
  private Float price = null;

  public AskSaveRequest nftId(Integer nftId) {
    this.nftId = nftId;
    return this;
  }

  /**
   * NFT 数据库对应ID
   * @return nftId
  */
  @NotNull 
  @Schema(name = "nftId", description = "NFT 数据库对应ID", required = true)
  public Integer getNftId() {
    return nftId;
  }

  public void setNftId(Integer nftId) {
    this.nftId = nftId;
  }

  public AskSaveRequest price(Float price) {
    this.price = price;
    return this;
  }

  /**
   * 出价
   * @return price
  */
  @NotNull 
  @Schema(name = "price", description = "出价", required = true)
  public Float getPrice() {
    return price;
  }

  public void setPrice(Float price) {
    this.price = price;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AskSaveRequest askSaveRequest = (AskSaveRequest) o;
    return Objects.equals(this.nftId, askSaveRequest.nftId) &&
        Objects.equals(this.price, askSaveRequest.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nftId, price);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AskSaveRequest {\n");
    sb.append("    nftId: ").append(toIndentedString(nftId)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
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

