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
 * user balance info
 */

@Schema(name = "BalanceInfo", description = "user balance info")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-08-03T15:10:02.892036+08:00[Asia/Shanghai]")
public class BalanceInfo {

  @JsonProperty("account")
  private String account;

  @JsonProperty("value")
  private Long value;

  public BalanceInfo account(String account) {
    this.account = account;
    return this;
  }

  /**
   * account of user web3Auth.
   * @return account
  */
  
  @Schema(name = "account", description = "account of user web3Auth.", required = false)
  public String getAccount() {
    return account;
  }

  public void setAccount(String account) {
    this.account = account;
  }

  public BalanceInfo value(Long value) {
    this.value = value;
    return this;
  }

  /**
   * quantity of user account.
   * @return value
  */
  
  @Schema(name = "value", description = "quantity of user account.", required = false)
  public Long getValue() {
    return value;
  }

  public void setValue(Long value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BalanceInfo balanceInfo = (BalanceInfo) o;
    return Objects.equals(this.account, balanceInfo.account) &&
        Objects.equals(this.value, balanceInfo.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BalanceInfo {\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

