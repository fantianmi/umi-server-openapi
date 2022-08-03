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
 * GameItem
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-08-03T15:10:02.892036+08:00[Asia/Shanghai]")
public class GameItem {

  @JsonProperty("id")
  private Long id;

  @JsonProperty("gameId")
  private Long gameId;

  @JsonProperty("name")
  private String name;

  @JsonProperty("pictureUrl")
  private String pictureUrl;

  @JsonProperty("price")
  private Long price;

  public GameItem id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Id of the game item.
   * @return id
  */
  
  @Schema(name = "id", description = "Id of the game item.", required = false)
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public GameItem gameId(Long gameId) {
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

  public GameItem name(String name) {
    this.name = name;
    return this;
  }

  /**
   * name of the item
   * @return name
  */
  
  @Schema(name = "name", description = "name of the item", required = false)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GameItem pictureUrl(String pictureUrl) {
    this.pictureUrl = pictureUrl;
    return this;
  }

  /**
   * url of the picture
   * @return pictureUrl
  */
  
  @Schema(name = "pictureUrl", description = "url of the picture", required = false)
  public String getPictureUrl() {
    return pictureUrl;
  }

  public void setPictureUrl(String pictureUrl) {
    this.pictureUrl = pictureUrl;
  }

  public GameItem price(Long price) {
    this.price = price;
    return this;
  }

  /**
   * price of this item.
   * @return price
  */
  
  @Schema(name = "price", description = "price of this item.", required = false)
  public Long getPrice() {
    return price;
  }

  public void setPrice(Long price) {
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
    GameItem gameItem = (GameItem) o;
    return Objects.equals(this.id, gameItem.id) &&
        Objects.equals(this.gameId, gameItem.gameId) &&
        Objects.equals(this.name, gameItem.name) &&
        Objects.equals(this.pictureUrl, gameItem.pictureUrl) &&
        Objects.equals(this.price, gameItem.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, gameId, name, pictureUrl, price);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GameItem {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    gameId: ").append(toIndentedString(gameId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pictureUrl: ").append(toIndentedString(pictureUrl)).append("\n");
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

