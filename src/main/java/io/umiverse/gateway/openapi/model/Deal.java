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
 * Deal
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-08-03T15:10:02.892036+08:00[Asia/Shanghai]")
public class Deal {

  @JsonProperty("id")
  private Long id;

  @JsonProperty("txHash")
  private String txHash;

  @JsonProperty("tokenId")
  private Long tokenId;

  @JsonProperty("price")
  private Float price;

  @JsonProperty("seller")
  private String seller;

  @JsonProperty("buyer")
  private String buyer;

  @JsonProperty("dealTimestamp")
  private Long dealTimestamp;

  public Deal id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Id of deal
   * @return id
  */
  
  @Schema(name = "id", description = "Id of deal", required = false)
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Deal txHash(String txHash) {
    this.txHash = txHash;
    return this;
  }

  /**
   * txHash of the trade
   * @return txHash
  */
  
  @Schema(name = "txHash", description = "txHash of the trade", required = false)
  public String getTxHash() {
    return txHash;
  }

  public void setTxHash(String txHash) {
    this.txHash = txHash;
  }

  public Deal tokenId(Long tokenId) {
    this.tokenId = tokenId;
    return this;
  }

  /**
   * tokenId of the nft.
   * @return tokenId
  */
  
  @Schema(name = "tokenId", description = "tokenId of the nft.", required = false)
  public Long getTokenId() {
    return tokenId;
  }

  public void setTokenId(Long tokenId) {
    this.tokenId = tokenId;
  }

  public Deal price(Float price) {
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

  public Deal seller(String seller) {
    this.seller = seller;
    return this;
  }

  /**
   * address of seller
   * @return seller
  */
  
  @Schema(name = "seller", description = "address of seller", required = false)
  public String getSeller() {
    return seller;
  }

  public void setSeller(String seller) {
    this.seller = seller;
  }

  public Deal buyer(String buyer) {
    this.buyer = buyer;
    return this;
  }

  /**
   * address of buyer
   * @return buyer
  */
  
  @Schema(name = "buyer", description = "address of buyer", required = false)
  public String getBuyer() {
    return buyer;
  }

  public void setBuyer(String buyer) {
    this.buyer = buyer;
  }

  public Deal dealTimestamp(Long dealTimestamp) {
    this.dealTimestamp = dealTimestamp;
    return this;
  }

  /**
   * deal time.
   * @return dealTimestamp
  */
  
  @Schema(name = "dealTimestamp", description = "deal time.", required = false)
  public Long getDealTimestamp() {
    return dealTimestamp;
  }

  public void setDealTimestamp(Long dealTimestamp) {
    this.dealTimestamp = dealTimestamp;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Deal deal = (Deal) o;
    return Objects.equals(this.id, deal.id) &&
        Objects.equals(this.txHash, deal.txHash) &&
        Objects.equals(this.tokenId, deal.tokenId) &&
        Objects.equals(this.price, deal.price) &&
        Objects.equals(this.seller, deal.seller) &&
        Objects.equals(this.buyer, deal.buyer) &&
        Objects.equals(this.dealTimestamp, deal.dealTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, txHash, tokenId, price, seller, buyer, dealTimestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Deal {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    txHash: ").append(toIndentedString(txHash)).append("\n");
    sb.append("    tokenId: ").append(toIndentedString(tokenId)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    seller: ").append(toIndentedString(seller)).append("\n");
    sb.append("    buyer: ").append(toIndentedString(buyer)).append("\n");
    sb.append("    dealTimestamp: ").append(toIndentedString(dealTimestamp)).append("\n");
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

