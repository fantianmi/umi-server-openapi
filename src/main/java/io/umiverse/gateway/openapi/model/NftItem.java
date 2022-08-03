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
 * NftItem
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-08-03T15:10:02.892036+08:00[Asia/Shanghai]")
public class NftItem {

  @JsonProperty("id")
  private Long id;

  @JsonProperty("gameId")
  private Long gameId;

  @JsonProperty("tokenId")
  private Long tokenId;

  @JsonProperty("name")
  private String name;

  @JsonProperty("description")
  private String description;

  @JsonProperty("image")
  private String image;

  @JsonProperty("animationUrl")
  private String animationUrl;

  @JsonProperty("externalUrl")
  private String externalUrl;

  @JsonProperty("itemType")
  private String itemType;

  @JsonProperty("suggestedPrice")
  private Float suggestedPrice;

  @JsonProperty("price")
  private Float price;

  @JsonProperty("gasFee")
  private Float gasFee;

  @JsonProperty("priceChange")
  private Float priceChange;

  @JsonProperty("owner")
  private String owner;

  @JsonProperty("lockState")
  private String lockState;

  @JsonProperty("tradeState")
  private Integer tradeState;

  public NftItem id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Id of nft item
   * @return id
  */
  
  @Schema(name = "id", description = "Id of nft item", required = false)
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public NftItem gameId(Long gameId) {
    this.gameId = gameId;
    return this;
  }

  /**
   * Id of the game.
   * @return gameId
  */
  
  @Schema(name = "gameId", description = "Id of the game.", required = false)
  public Long getGameId() {
    return gameId;
  }

  public void setGameId(Long gameId) {
    this.gameId = gameId;
  }

  public NftItem tokenId(Long tokenId) {
    this.tokenId = tokenId;
    return this;
  }

  /**
   * tokenId of nft item ( base on contract data)\\
   * @return tokenId
  */
  
  @Schema(name = "tokenId", description = "tokenId of nft item ( base on contract data)\\", required = false)
  public Long getTokenId() {
    return tokenId;
  }

  public void setTokenId(Long tokenId) {
    this.tokenId = tokenId;
  }

  public NftItem name(String name) {
    this.name = name;
    return this;
  }

  /**
   * name of nft
   * @return name
  */
  
  @Schema(name = "name", description = "name of nft", required = false)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public NftItem description(String description) {
    this.description = description;
    return this;
  }

  /**
   * description of nft
   * @return description
  */
  
  @Schema(name = "description", description = "description of nft", required = false)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public NftItem image(String image) {
    this.image = image;
    return this;
  }

  /**
   * url of image
   * @return image
  */
  
  @Schema(name = "image", description = "url of image", required = false)
  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public NftItem animationUrl(String animationUrl) {
    this.animationUrl = animationUrl;
    return this;
  }

  /**
   * url of animation source, base on metadata
   * @return animationUrl
  */
  
  @Schema(name = "animationUrl", description = "url of animation source, base on metadata", required = false)
  public String getAnimationUrl() {
    return animationUrl;
  }

  public void setAnimationUrl(String animationUrl) {
    this.animationUrl = animationUrl;
  }

  public NftItem externalUrl(String externalUrl) {
    this.externalUrl = externalUrl;
    return this;
  }

  /**
   * link of nft, base on metadata
   * @return externalUrl
  */
  
  @Schema(name = "externalUrl", description = "link of nft, base on metadata", required = false)
  public String getExternalUrl() {
    return externalUrl;
  }

  public void setExternalUrl(String externalUrl) {
    this.externalUrl = externalUrl;
  }

  public NftItem itemType(String itemType) {
    this.itemType = itemType;
    return this;
  }

  /**
   * nft item type
   * @return itemType
  */
  
  @Schema(name = "itemType", description = "nft item type", required = false)
  public String getItemType() {
    return itemType;
  }

  public void setItemType(String itemType) {
    this.itemType = itemType;
  }

  public NftItem suggestedPrice(Float suggestedPrice) {
    this.suggestedPrice = suggestedPrice;
    return this;
  }

  /**
   * suggested price of this item
   * @return suggestedPrice
  */
  
  @Schema(name = "suggestedPrice", description = "suggested price of this item", required = false)
  public Float getSuggestedPrice() {
    return suggestedPrice;
  }

  public void setSuggestedPrice(Float suggestedPrice) {
    this.suggestedPrice = suggestedPrice;
  }

  public NftItem price(Float price) {
    this.price = price;
    return this;
  }

  /**
   * latest price of this item
   * @return price
  */
  
  @Schema(name = "price", description = "latest price of this item", required = false)
  public Float getPrice() {
    return price;
  }

  public void setPrice(Float price) {
    this.price = price;
  }

  public NftItem gasFee(Float gasFee) {
    this.gasFee = gasFee;
    return this;
  }

  /**
   * gas fee of this item
   * @return gasFee
  */
  
  @Schema(name = "gasFee", description = "gas fee of this item", required = false)
  public Float getGasFee() {
    return gasFee;
  }

  public void setGasFee(Float gasFee) {
    this.gasFee = gasFee;
  }

  public NftItem priceChange(Float priceChange) {
    this.priceChange = priceChange;
    return this;
  }

  /**
   * Fluctuation range(Chg)
   * @return priceChange
  */
  
  @Schema(name = "priceChange", description = "Fluctuation range(Chg)", required = false)
  public Float getPriceChange() {
    return priceChange;
  }

  public void setPriceChange(Float priceChange) {
    this.priceChange = priceChange;
  }

  public NftItem owner(String owner) {
    this.owner = owner;
    return this;
  }

  /**
   * the nft owner address
   * @return owner
  */
  
  @Schema(name = "owner", description = "the nft owner address", required = false)
  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public NftItem lockState(String lockState) {
    this.lockState = lockState;
    return this;
  }

  /**
   * the nft lock state
   * @return lockState
  */
  
  @Schema(name = "lockState", description = "the nft lock state", required = false)
  public String getLockState() {
    return lockState;
  }

  public void setLockState(String lockState) {
    this.lockState = lockState;
  }

  public NftItem tradeState(Integer tradeState) {
    this.tradeState = tradeState;
    return this;
  }

  /**
   * NFT状态 0 准备;1 测试;2 公开
   * @return tradeState
  */
  
  @Schema(name = "tradeState", description = "NFT状态 0 准备;1 测试;2 公开", required = false)
  public Integer getTradeState() {
    return tradeState;
  }

  public void setTradeState(Integer tradeState) {
    this.tradeState = tradeState;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NftItem nftItem = (NftItem) o;
    return Objects.equals(this.id, nftItem.id) &&
        Objects.equals(this.gameId, nftItem.gameId) &&
        Objects.equals(this.tokenId, nftItem.tokenId) &&
        Objects.equals(this.name, nftItem.name) &&
        Objects.equals(this.description, nftItem.description) &&
        Objects.equals(this.image, nftItem.image) &&
        Objects.equals(this.animationUrl, nftItem.animationUrl) &&
        Objects.equals(this.externalUrl, nftItem.externalUrl) &&
        Objects.equals(this.itemType, nftItem.itemType) &&
        Objects.equals(this.suggestedPrice, nftItem.suggestedPrice) &&
        Objects.equals(this.price, nftItem.price) &&
        Objects.equals(this.gasFee, nftItem.gasFee) &&
        Objects.equals(this.priceChange, nftItem.priceChange) &&
        Objects.equals(this.owner, nftItem.owner) &&
        Objects.equals(this.lockState, nftItem.lockState) &&
        Objects.equals(this.tradeState, nftItem.tradeState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, gameId, tokenId, name, description, image, animationUrl, externalUrl, itemType, suggestedPrice, price, gasFee, priceChange, owner, lockState, tradeState);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NftItem {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    gameId: ").append(toIndentedString(gameId)).append("\n");
    sb.append("    tokenId: ").append(toIndentedString(tokenId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    animationUrl: ").append(toIndentedString(animationUrl)).append("\n");
    sb.append("    externalUrl: ").append(toIndentedString(externalUrl)).append("\n");
    sb.append("    itemType: ").append(toIndentedString(itemType)).append("\n");
    sb.append("    suggestedPrice: ").append(toIndentedString(suggestedPrice)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    gasFee: ").append(toIndentedString(gasFee)).append("\n");
    sb.append("    priceChange: ").append(toIndentedString(priceChange)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    lockState: ").append(toIndentedString(lockState)).append("\n");
    sb.append("    tradeState: ").append(toIndentedString(tradeState)).append("\n");
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

