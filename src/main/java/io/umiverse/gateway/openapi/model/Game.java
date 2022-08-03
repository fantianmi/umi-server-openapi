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
 * Game
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-08-03T15:10:02.892036+08:00[Asia/Shanghai]")
public class Game {

  @JsonProperty("id")
  private Long id;

  @JsonProperty("nid")
  private String nid;

  @JsonProperty("name")
  private String name;

  @JsonProperty("shortName")
  private String shortName;

  @JsonProperty("category")
  private String category;

  @JsonProperty("slogan")
  private String slogan;

  @JsonProperty("description")
  private String description;

  @JsonProperty("introduction")
  private String introduction;

  @JsonProperty("iconUrl")
  private String iconUrl;

  @JsonProperty("faviconUrl")
  private String faviconUrl;

  @JsonProperty("screenshot")
  private String screenshot;

  @JsonProperty("coverImageUrl")
  private String coverImageUrl;

  @JsonProperty("email")
  private String email;

  @JsonProperty("company")
  private String company;

  @JsonProperty("twitter")
  private String twitter;

  @JsonProperty("facebook")
  private String facebook;

  @JsonProperty("line")
  private String line;

  @JsonProperty("cdnUrl")
  private String cdnUrl;

  @JsonProperty("gameServerUrl")
  private String gameServerUrl;

  @JsonProperty("callbackUrl")
  private String callbackUrl;

  @JsonProperty("state")
  private Integer state;

  @JsonProperty("highlightType")
  private Integer highlightType;

  @JsonProperty("orderWeight")
  private Integer orderWeight;

  @JsonProperty("secret")
  private String secret;

  @JsonProperty("createTimestamp")
  private Long createTimestamp;

  public Game id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * GameId saved in system
   * @return id
  */
  
  @Schema(name = "id", description = "GameId saved in system", required = false)
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Game nid(String nid) {
    this.nid = nid;
    return this;
  }

  /**
   * 游戏版本号
   * @return nid
  */
  
  @Schema(name = "nid", description = "游戏版本号", required = false)
  public String getNid() {
    return nid;
  }

  public void setNid(String nid) {
    this.nid = nid;
  }

  public Game name(String name) {
    this.name = name;
    return this;
  }

  /**
   * 游戏名
   * @return name
  */
  
  @Schema(name = "name", description = "游戏名", required = false)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Game shortName(String shortName) {
    this.shortName = shortName;
    return this;
  }

  /**
   * 游戏短名
   * @return shortName
  */
  
  @Schema(name = "shortName", description = "游戏短名", required = false)
  public String getShortName() {
    return shortName;
  }

  public void setShortName(String shortName) {
    this.shortName = shortName;
  }

  public Game category(String category) {
    this.category = category;
    return this;
  }

  /**
   * 游戏分类
   * @return category
  */
  
  @Schema(name = "category", description = "游戏分类", required = false)
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public Game slogan(String slogan) {
    this.slogan = slogan;
    return this;
  }

  /**
   * 标题下短句
   * @return slogan
  */
  
  @Schema(name = "slogan", description = "标题下短句", required = false)
  public String getSlogan() {
    return slogan;
  }

  public void setSlogan(String slogan) {
    this.slogan = slogan;
  }

  public Game description(String description) {
    this.description = description;
    return this;
  }

  /**
   * 中篇描述
   * @return description
  */
  
  @Schema(name = "description", description = "中篇描述", required = false)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Game introduction(String introduction) {
    this.introduction = introduction;
    return this;
  }

  /**
   * 详细页用长篇介绍
   * @return introduction
  */
  
  @Schema(name = "introduction", description = "详细页用长篇介绍", required = false)
  public String getIntroduction() {
    return introduction;
  }

  public void setIntroduction(String introduction) {
    this.introduction = introduction;
  }

  public Game iconUrl(String iconUrl) {
    this.iconUrl = iconUrl;
    return this;
  }

  /**
   * icon
   * @return iconUrl
  */
  
  @Schema(name = "iconUrl", description = "icon", required = false)
  public String getIconUrl() {
    return iconUrl;
  }

  public void setIconUrl(String iconUrl) {
    this.iconUrl = iconUrl;
  }

  public Game faviconUrl(String faviconUrl) {
    this.faviconUrl = faviconUrl;
    return this;
  }

  /**
   * small favicon
   * @return faviconUrl
  */
  
  @Schema(name = "faviconUrl", description = "small favicon", required = false)
  public String getFaviconUrl() {
    return faviconUrl;
  }

  public void setFaviconUrl(String faviconUrl) {
    this.faviconUrl = faviconUrl;
  }

  public Game screenshot(String screenshot) {
    this.screenshot = screenshot;
    return this;
  }

  /**
   * list of 5 pics
   * @return screenshot
  */
  
  @Schema(name = "screenshot", description = "list of 5 pics", required = false)
  public String getScreenshot() {
    return screenshot;
  }

  public void setScreenshot(String screenshot) {
    this.screenshot = screenshot;
  }

  public Game coverImageUrl(String coverImageUrl) {
    this.coverImageUrl = coverImageUrl;
    return this;
  }

  /**
   * 封面图片
   * @return coverImageUrl
  */
  
  @Schema(name = "coverImageUrl", description = "封面图片", required = false)
  public String getCoverImageUrl() {
    return coverImageUrl;
  }

  public void setCoverImageUrl(String coverImageUrl) {
    this.coverImageUrl = coverImageUrl;
  }

  public Game email(String email) {
    this.email = email;
    return this;
  }

  /**
   * 游戏CP公司邮箱
   * @return email
  */
  
  @Schema(name = "email", description = "游戏CP公司邮箱", required = false)
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Game company(String company) {
    this.company = company;
    return this;
  }

  /**
   * Company name of the game.
   * @return company
  */
  
  @Schema(name = "company", description = "Company name of the game.", required = false)
  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public Game twitter(String twitter) {
    this.twitter = twitter;
    return this;
  }

  /**
   * Company twitter.
   * @return twitter
  */
  
  @Schema(name = "twitter", description = "Company twitter.", required = false)
  public String getTwitter() {
    return twitter;
  }

  public void setTwitter(String twitter) {
    this.twitter = twitter;
  }

  public Game facebook(String facebook) {
    this.facebook = facebook;
    return this;
  }

  /**
   * facebook
   * @return facebook
  */
  
  @Schema(name = "facebook", description = "facebook", required = false)
  public String getFacebook() {
    return facebook;
  }

  public void setFacebook(String facebook) {
    this.facebook = facebook;
  }

  public Game line(String line) {
    this.line = line;
    return this;
  }

  /**
   * line
   * @return line
  */
  
  @Schema(name = "line", description = "line", required = false)
  public String getLine() {
    return line;
  }

  public void setLine(String line) {
    this.line = line;
  }

  public Game cdnUrl(String cdnUrl) {
    this.cdnUrl = cdnUrl;
    return this;
  }

  /**
   * Cdn download url.
   * @return cdnUrl
  */
  
  @Schema(name = "cdnUrl", description = "Cdn download url.", required = false)
  public String getCdnUrl() {
    return cdnUrl;
  }

  public void setCdnUrl(String cdnUrl) {
    this.cdnUrl = cdnUrl;
  }

  public Game gameServerUrl(String gameServerUrl) {
    this.gameServerUrl = gameServerUrl;
    return this;
  }

  /**
   * 游戏服务器Url
   * @return gameServerUrl
  */
  
  @Schema(name = "gameServerUrl", description = "游戏服务器Url", required = false)
  public String getGameServerUrl() {
    return gameServerUrl;
  }

  public void setGameServerUrl(String gameServerUrl) {
    this.gameServerUrl = gameServerUrl;
  }

  public Game callbackUrl(String callbackUrl) {
    this.callbackUrl = callbackUrl;
    return this;
  }

  /**
   * Call back url.
   * @return callbackUrl
  */
  
  @Schema(name = "callbackUrl", description = "Call back url.", required = false)
  public String getCallbackUrl() {
    return callbackUrl;
  }

  public void setCallbackUrl(String callbackUrl) {
    this.callbackUrl = callbackUrl;
  }

  public Game state(Integer state) {
    this.state = state;
    return this;
  }

  /**
   * 游戏状态 0 准备;1 测试;2 公开
   * @return state
  */
  
  @Schema(name = "state", description = "游戏状态 0 准备;1 测试;2 公开", required = false)
  public Integer getState() {
    return state;
  }

  public void setState(Integer state) {
    this.state = state;
  }

  public Game highlightType(Integer highlightType) {
    this.highlightType = highlightType;
    return this;
  }

  /**
   * 列表中的高亮,Normal\\New\\Hot
   * @return highlightType
  */
  
  @Schema(name = "highlightType", description = "列表中的高亮,Normal\\New\\Hot", required = false)
  public Integer getHighlightType() {
    return highlightType;
  }

  public void setHighlightType(Integer highlightType) {
    this.highlightType = highlightType;
  }

  public Game orderWeight(Integer orderWeight) {
    this.orderWeight = orderWeight;
    return this;
  }

  /**
   * 游戏列表中排列顺序
   * @return orderWeight
  */
  
  @Schema(name = "orderWeight", description = "游戏列表中排列顺序", required = false)
  public Integer getOrderWeight() {
    return orderWeight;
  }

  public void setOrderWeight(Integer orderWeight) {
    this.orderWeight = orderWeight;
  }

  public Game secret(String secret) {
    this.secret = secret;
    return this;
  }

  /**
   * 游戏验证用secret,与id并用
   * @return secret
  */
  
  @Schema(name = "secret", description = "游戏验证用secret,与id并用", required = false)
  public String getSecret() {
    return secret;
  }

  public void setSecret(String secret) {
    this.secret = secret;
  }

  public Game createTimestamp(Long createTimestamp) {
    this.createTimestamp = createTimestamp;
    return this;
  }

  /**
   * created time.
   * @return createTimestamp
  */
  
  @Schema(name = "createTimestamp", description = "created time.", required = false)
  public Long getCreateTimestamp() {
    return createTimestamp;
  }

  public void setCreateTimestamp(Long createTimestamp) {
    this.createTimestamp = createTimestamp;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Game game = (Game) o;
    return Objects.equals(this.id, game.id) &&
        Objects.equals(this.nid, game.nid) &&
        Objects.equals(this.name, game.name) &&
        Objects.equals(this.shortName, game.shortName) &&
        Objects.equals(this.category, game.category) &&
        Objects.equals(this.slogan, game.slogan) &&
        Objects.equals(this.description, game.description) &&
        Objects.equals(this.introduction, game.introduction) &&
        Objects.equals(this.iconUrl, game.iconUrl) &&
        Objects.equals(this.faviconUrl, game.faviconUrl) &&
        Objects.equals(this.screenshot, game.screenshot) &&
        Objects.equals(this.coverImageUrl, game.coverImageUrl) &&
        Objects.equals(this.email, game.email) &&
        Objects.equals(this.company, game.company) &&
        Objects.equals(this.twitter, game.twitter) &&
        Objects.equals(this.facebook, game.facebook) &&
        Objects.equals(this.line, game.line) &&
        Objects.equals(this.cdnUrl, game.cdnUrl) &&
        Objects.equals(this.gameServerUrl, game.gameServerUrl) &&
        Objects.equals(this.callbackUrl, game.callbackUrl) &&
        Objects.equals(this.state, game.state) &&
        Objects.equals(this.highlightType, game.highlightType) &&
        Objects.equals(this.orderWeight, game.orderWeight) &&
        Objects.equals(this.secret, game.secret) &&
        Objects.equals(this.createTimestamp, game.createTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nid, name, shortName, category, slogan, description, introduction, iconUrl, faviconUrl, screenshot, coverImageUrl, email, company, twitter, facebook, line, cdnUrl, gameServerUrl, callbackUrl, state, highlightType, orderWeight, secret, createTimestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Game {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nid: ").append(toIndentedString(nid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    slogan: ").append(toIndentedString(slogan)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    introduction: ").append(toIndentedString(introduction)).append("\n");
    sb.append("    iconUrl: ").append(toIndentedString(iconUrl)).append("\n");
    sb.append("    faviconUrl: ").append(toIndentedString(faviconUrl)).append("\n");
    sb.append("    screenshot: ").append(toIndentedString(screenshot)).append("\n");
    sb.append("    coverImageUrl: ").append(toIndentedString(coverImageUrl)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    twitter: ").append(toIndentedString(twitter)).append("\n");
    sb.append("    facebook: ").append(toIndentedString(facebook)).append("\n");
    sb.append("    line: ").append(toIndentedString(line)).append("\n");
    sb.append("    cdnUrl: ").append(toIndentedString(cdnUrl)).append("\n");
    sb.append("    gameServerUrl: ").append(toIndentedString(gameServerUrl)).append("\n");
    sb.append("    callbackUrl: ").append(toIndentedString(callbackUrl)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    highlightType: ").append(toIndentedString(highlightType)).append("\n");
    sb.append("    orderWeight: ").append(toIndentedString(orderWeight)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    createTimestamp: ").append(toIndentedString(createTimestamp)).append("\n");
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

