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
import org.apache.fineract.client.models.GetAccountsChargesCurrency;
import org.apache.fineract.client.models.GetAccountsTypePurchasedShares;
import org.apache.fineract.client.models.GetAccountsTypeStatus;
import org.apache.fineract.client.models.GetAccountsTypeSummary;
import org.apache.fineract.client.models.GetAccountsTypeTimeline;

/**
 * GetAccountsPageItems
 */

public class GetAccountsPageItems {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_ACCOUNT_NO = "accountNo";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NO)
  private Long accountNo;

  public static final String SERIALIZED_NAME_CLIENT_ID = "clientId";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private Integer clientId;

  public static final String SERIALIZED_NAME_CLIENT_NAME = "clientName";
  @SerializedName(SERIALIZED_NAME_CLIENT_NAME)
  private String clientName;

  public static final String SERIALIZED_NAME_PRODUCT_ID = "productId";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ID)
  private Integer productId;

  public static final String SERIALIZED_NAME_PRODUCT_NAME = "productName";
  @SerializedName(SERIALIZED_NAME_PRODUCT_NAME)
  private String productName;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private GetAccountsTypeStatus status;

  public static final String SERIALIZED_NAME_TIMELINE = "timeline";
  @SerializedName(SERIALIZED_NAME_TIMELINE)
  private GetAccountsTypeTimeline timeline;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private GetAccountsChargesCurrency currency;

  public static final String SERIALIZED_NAME_PURCHASED_SHARES = "purchasedShares";
  @SerializedName(SERIALIZED_NAME_PURCHASED_SHARES)
  private List<GetAccountsTypePurchasedShares> purchasedShares = null;

  public static final String SERIALIZED_NAME_SUMMARY = "summary";
  @SerializedName(SERIALIZED_NAME_SUMMARY)
  private GetAccountsTypeSummary summary;


  public GetAccountsPageItems id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public GetAccountsPageItems accountNo(Long accountNo) {
    
    this.accountNo = accountNo;
    return this;
  }

   /**
   * Get accountNo
   * @return accountNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Long getAccountNo() {
    return accountNo;
  }


  public void setAccountNo(Long accountNo) {
    this.accountNo = accountNo;
  }


  public GetAccountsPageItems clientId(Integer clientId) {
    
    this.clientId = clientId;
    return this;
  }

   /**
   * Get clientId
   * @return clientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getClientId() {
    return clientId;
  }


  public void setClientId(Integer clientId) {
    this.clientId = clientId;
  }


  public GetAccountsPageItems clientName(String clientName) {
    
    this.clientName = clientName;
    return this;
  }

   /**
   * Get clientName
   * @return clientName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Client Name", value = "")

  public String getClientName() {
    return clientName;
  }


  public void setClientName(String clientName) {
    this.clientName = clientName;
  }


  public GetAccountsPageItems productId(Integer productId) {
    
    this.productId = productId;
    return this;
  }

   /**
   * Get productId
   * @return productId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getProductId() {
    return productId;
  }


  public void setProductId(Integer productId) {
    this.productId = productId;
  }


  public GetAccountsPageItems productName(String productName) {
    
    this.productName = productName;
    return this;
  }

   /**
   * Get productName
   * @return productName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Share Product Name", value = "")

  public String getProductName() {
    return productName;
  }


  public void setProductName(String productName) {
    this.productName = productName;
  }


  public GetAccountsPageItems status(GetAccountsTypeStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetAccountsTypeStatus getStatus() {
    return status;
  }


  public void setStatus(GetAccountsTypeStatus status) {
    this.status = status;
  }


  public GetAccountsPageItems timeline(GetAccountsTypeTimeline timeline) {
    
    this.timeline = timeline;
    return this;
  }

   /**
   * Get timeline
   * @return timeline
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetAccountsTypeTimeline getTimeline() {
    return timeline;
  }


  public void setTimeline(GetAccountsTypeTimeline timeline) {
    this.timeline = timeline;
  }


  public GetAccountsPageItems currency(GetAccountsChargesCurrency currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetAccountsChargesCurrency getCurrency() {
    return currency;
  }


  public void setCurrency(GetAccountsChargesCurrency currency) {
    this.currency = currency;
  }


  public GetAccountsPageItems purchasedShares(List<GetAccountsTypePurchasedShares> purchasedShares) {
    
    this.purchasedShares = purchasedShares;
    return this;
  }

  public GetAccountsPageItems addPurchasedSharesItem(GetAccountsTypePurchasedShares purchasedSharesItem) {
    if (this.purchasedShares == null) {
      this.purchasedShares = new ArrayList<GetAccountsTypePurchasedShares>();
    }
    this.purchasedShares.add(purchasedSharesItem);
    return this;
  }

   /**
   * Get purchasedShares
   * @return purchasedShares
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<GetAccountsTypePurchasedShares> getPurchasedShares() {
    return purchasedShares;
  }


  public void setPurchasedShares(List<GetAccountsTypePurchasedShares> purchasedShares) {
    this.purchasedShares = purchasedShares;
  }


  public GetAccountsPageItems summary(GetAccountsTypeSummary summary) {
    
    this.summary = summary;
    return this;
  }

   /**
   * Get summary
   * @return summary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetAccountsTypeSummary getSummary() {
    return summary;
  }


  public void setSummary(GetAccountsTypeSummary summary) {
    this.summary = summary;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAccountsPageItems getAccountsPageItems = (GetAccountsPageItems) o;
    return Objects.equals(this.id, getAccountsPageItems.id) &&
        Objects.equals(this.accountNo, getAccountsPageItems.accountNo) &&
        Objects.equals(this.clientId, getAccountsPageItems.clientId) &&
        Objects.equals(this.clientName, getAccountsPageItems.clientName) &&
        Objects.equals(this.productId, getAccountsPageItems.productId) &&
        Objects.equals(this.productName, getAccountsPageItems.productName) &&
        Objects.equals(this.status, getAccountsPageItems.status) &&
        Objects.equals(this.timeline, getAccountsPageItems.timeline) &&
        Objects.equals(this.currency, getAccountsPageItems.currency) &&
        Objects.equals(this.purchasedShares, getAccountsPageItems.purchasedShares) &&
        Objects.equals(this.summary, getAccountsPageItems.summary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, accountNo, clientId, clientName, productId, productName, status, timeline, currency, purchasedShares, summary);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAccountsPageItems {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    accountNo: ").append(toIndentedString(accountNo)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientName: ").append(toIndentedString(clientName)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    timeline: ").append(toIndentedString(timeline)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    purchasedShares: ").append(toIndentedString(purchasedShares)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
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

