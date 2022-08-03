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
 * BidAcceptRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-08-03T15:10:02.892036+08:00[Asia/Shanghai]")
public class BidAcceptRequest {

  @JsonProperty("nftId")
  private Integer nftId;

  @JsonProperty("bidId")
  private Integer bidId;

  public BidAcceptRequest nftId(Integer nftId) {
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

  public BidAcceptRequest bidId(Integer bidId) {
    this.bidId = bidId;
    return this;
  }

  /**
   * NFT 的出价ID
   * @return bidId
  */
  @NotNull 
  @Schema(name = "bidId", description = "NFT 的出价ID", required = true)
  public Integer getBidId() {
    return bidId;
  }

  public void setBidId(Integer bidId) {
    this.bidId = bidId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BidAcceptRequest bidAcceptRequest = (BidAcceptRequest) o;
    return Objects.equals(this.nftId, bidAcceptRequest.nftId) &&
        Objects.equals(this.bidId, bidAcceptRequest.bidId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nftId, bidId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BidAcceptRequest {\n");
    sb.append("    nftId: ").append(toIndentedString(nftId)).append("\n");
    sb.append("    bidId: ").append(toIndentedString(bidId)).append("\n");
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

