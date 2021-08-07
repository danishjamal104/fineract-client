/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
/*
 * Apache Fineract
 * Apache Fineract is a secure, multi-tenanted microfinance platform  The goal of the Apache Fineract API is to empower developers to build apps on top of the Apache Fineract Platform<br>The [reference app](https://cui.fineract.dev) (username: mifos, password: password) works on the same demo tenant as the interactive links in this documentation  - The API is organized around [REST](https://en.wikipedia.org/wiki/Representational_state_transfer) - Find out more about Apache Fineract [here](/fineract-provider/api-docs/apiLive.htm#top) - You can [Try The API From Your Browser](/fineract-provider/api-docs/apiLive.htm#interact) - The Generic Options are available [here](/fineract-provider/api-docs/apiLive.htm#genopts) - Find out more about [Updating Dates and Numbers](/fineract-provider/api-docs/apiLive.htm#dates_and_numbers) - For the Authentication and the Basic of HTTP and HTTPS refer [here](/fineract-provider/api-docs/apiLive.htm#authentication_overview) - Check about ERROR codes [here](/fineract-provider/api-docs/apiLive.htm#errors)  Please refer to the [old documentation](/fineract-provider/api-docs/apiLive.htm) for any documentation queries
 *
 * The version of the OpenAPI document: 1.5.0-dirty
 * Contact: dev@fineract.apache.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.apache.fineract.client.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.fineract.client.models.GetSelfClientsLoanAccounts;
import org.apache.fineract.client.models.GetSelfClientsSavingsAccounts;

/**
 * GetSelfClientsClientIdAccountsResponse
 */
@ApiModel(description = "GetSelfClientsClientIdAccountsResponse")

public class GetSelfClientsClientIdAccountsResponse {
  public static final String SERIALIZED_NAME_LOAN_ACCOUNTS = "loanAccounts";
  @SerializedName(SERIALIZED_NAME_LOAN_ACCOUNTS)
  private List<GetSelfClientsLoanAccounts> loanAccounts = null;

  public static final String SERIALIZED_NAME_SAVINGS_ACCOUNTS = "savingsAccounts";
  @SerializedName(SERIALIZED_NAME_SAVINGS_ACCOUNTS)
  private List<GetSelfClientsSavingsAccounts> savingsAccounts = null;


  public GetSelfClientsClientIdAccountsResponse loanAccounts(List<GetSelfClientsLoanAccounts> loanAccounts) {
    
    this.loanAccounts = loanAccounts;
    return this;
  }

  public GetSelfClientsClientIdAccountsResponse addLoanAccountsItem(GetSelfClientsLoanAccounts loanAccountsItem) {
    if (this.loanAccounts == null) {
      this.loanAccounts = new ArrayList<GetSelfClientsLoanAccounts>();
    }
    this.loanAccounts.add(loanAccountsItem);
    return this;
  }

   /**
   * Get loanAccounts
   * @return loanAccounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<GetSelfClientsLoanAccounts> getLoanAccounts() {
    return loanAccounts;
  }


  public void setLoanAccounts(List<GetSelfClientsLoanAccounts> loanAccounts) {
    this.loanAccounts = loanAccounts;
  }


  public GetSelfClientsClientIdAccountsResponse savingsAccounts(List<GetSelfClientsSavingsAccounts> savingsAccounts) {
    
    this.savingsAccounts = savingsAccounts;
    return this;
  }

  public GetSelfClientsClientIdAccountsResponse addSavingsAccountsItem(GetSelfClientsSavingsAccounts savingsAccountsItem) {
    if (this.savingsAccounts == null) {
      this.savingsAccounts = new ArrayList<GetSelfClientsSavingsAccounts>();
    }
    this.savingsAccounts.add(savingsAccountsItem);
    return this;
  }

   /**
   * Get savingsAccounts
   * @return savingsAccounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<GetSelfClientsSavingsAccounts> getSavingsAccounts() {
    return savingsAccounts;
  }


  public void setSavingsAccounts(List<GetSelfClientsSavingsAccounts> savingsAccounts) {
    this.savingsAccounts = savingsAccounts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetSelfClientsClientIdAccountsResponse getSelfClientsClientIdAccountsResponse = (GetSelfClientsClientIdAccountsResponse) o;
    return Objects.equals(this.loanAccounts, getSelfClientsClientIdAccountsResponse.loanAccounts) &&
        Objects.equals(this.savingsAccounts, getSelfClientsClientIdAccountsResponse.savingsAccounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loanAccounts, savingsAccounts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSelfClientsClientIdAccountsResponse {\n");
    sb.append("    loanAccounts: ").append(toIndentedString(loanAccounts)).append("\n");
    sb.append("    savingsAccounts: ").append(toIndentedString(savingsAccounts)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

