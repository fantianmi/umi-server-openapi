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
 * Bid
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-08-03T15:10:02.892036+08:00[Asia/Shanghai]")
public class Bid {

  @JsonProperty("id")
  private Long id;

  @JsonProperty("nftId")
  private Integer nftId;

  @JsonProperty("price")
  private Float price;

  @JsonProperty("seller")
  private String seller;

  @JsonProperty("createTimestamp")
  private Long createTimestamp;

  @JsonProperty("expireTimestamp")
  private Long expireTimestamp;

  public Bid id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Id of bid
   * @return id
  */
  
  @Schema(name = "id", description = "Id of bid", required = false)
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Bid nftId(Integer nftId) {
    this.nftId = nftId;
    return this;
  }

  /**
   * NFT 数据库对应ID
   * @return nftId
  */
  
  @Schema(name = "nftId", description = "NFT 数据库对应ID", required = false)
  public Integer getNftId() {
    return nftId;
  }

  public void setNftId(Integer nftId) {
    this.nftId = nftId;
  }

  public Bid price(Float price) {
    this.price = price;
    return this;
  }

  /**
   * price of deal
   * @return price
  */
  
  @Schema(name = "price", description = "price of deal", required = false)
  public Float getPrice() {
    return price;
  }

  public void setPrice(Float price) {
    this.price = price;
  }

  public Bid seller(String seller) {
    this.seller = seller;
    return this;
  }

  /**
   * subscriber of user 用户唯一标识
   * @return seller
  */
  
  @Schema(name = "seller", description = "subscriber of user 用户唯一标识", required = false)
  public String getSeller() {
    return seller;
  }

  public void setSeller(String seller) {
    this.seller = seller;
  }

  public Bid createTimestamp(Long createTimestamp) {
    this.createTimestamp = createTimestamp;
    return this;
  }

  /**
   * 创建时间
   * @return createTimestamp
  */
  
  @Schema(name = "createTimestamp", description = "创建时间", required = false)
  public Long getCreateTimestamp() {
    return createTimestamp;
  }

  public void setCreateTimestamp(Long createTimestamp) {
    this.createTimestamp = createTimestamp;
  }

  public Bid expireTimestamp(Long expireTimestamp) {
    this.expireTimestamp = expireTimestamp;
    return this;
  }

  /**
   * 过期时间
   * @return expireTimestamp
  */
  
  @Schema(name = "expireTimestamp", description = "过期时间", required = false)
  public Long getExpireTimestamp() {
    return expireTimestamp;
  }

  public void setExpireTimestamp(Long expireTimestamp) {
    this.expireTimestamp = expireTimestamp;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Bid bid = (Bid) o;
    return Objects.equals(this.id, bid.id) &&
        Objects.equals(this.nftId, bid.nftId) &&
        Objects.equals(this.price, bid.price) &&
        Objects.equals(this.seller, bid.seller) &&
        Objects.equals(this.createTimestamp, bid.createTimestamp) &&
        Objects.equals(this.expireTimestamp, bid.expireTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nftId, price, seller, createTimestamp, expireTimestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Bid {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nftId: ").append(toIndentedString(nftId)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    seller: ").append(toIndentedString(seller)).append("\n");
    sb.append("    createTimestamp: ").append(toIndentedString(createTimestamp)).append("\n");
    sb.append("    expireTimestamp: ").append(toIndentedString(expireTimestamp)).append("\n");
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

