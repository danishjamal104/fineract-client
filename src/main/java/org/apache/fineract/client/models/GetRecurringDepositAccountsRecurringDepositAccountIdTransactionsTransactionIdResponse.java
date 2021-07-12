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
 * The version of the OpenAPI document: 1.5.0-23-g1ac2469-dirty
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
import java.util.Date;
import org.apache.fineract.client.models.GetRecurringPaymentDetailData;
import org.apache.fineract.client.models.GetRecurringTransactionsCurrency;
import org.apache.fineract.client.models.GetRecurringTransactionsTransactionType;

/**
 * GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse
 */
@ApiModel(description = "GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse")

public class GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_TRANSACTION_TYPE = "transactionType";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_TYPE)
  private GetRecurringTransactionsTransactionType transactionType;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private Integer accountId;

  public static final String SERIALIZED_NAME_ACCOUNT_NO = "accountNo";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NO)
  private String accountNo;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private Date date;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private GetRecurringTransactionsCurrency currency;

  public static final String SERIALIZED_NAME_PAYMENT_DETAIL_DATA = "paymentDetailData";
  @SerializedName(SERIALIZED_NAME_PAYMENT_DETAIL_DATA)
  private GetRecurringPaymentDetailData paymentDetailData;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Float amount;

  public static final String SERIALIZED_NAME_RUNNING_BALANCE = "runningBalance";
  @SerializedName(SERIALIZED_NAME_RUNNING_BALANCE)
  private Integer runningBalance;

  public static final String SERIALIZED_NAME_REVERSED = "reversed";
  @SerializedName(SERIALIZED_NAME_REVERSED)
  private Boolean reversed;


  public GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse id(Integer id) {
    
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


  public GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse transactionType(GetRecurringTransactionsTransactionType transactionType) {
    
    this.transactionType = transactionType;
    return this;
  }

   /**
   * Get transactionType
   * @return transactionType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetRecurringTransactionsTransactionType getTransactionType() {
    return transactionType;
  }


  public void setTransactionType(GetRecurringTransactionsTransactionType transactionType) {
    this.transactionType = transactionType;
  }


  public GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse accountId(Integer accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getAccountId() {
    return accountId;
  }


  public void setAccountId(Integer accountId) {
    this.accountId = accountId;
  }


  public GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse accountNo(String accountNo) {
    
    this.accountNo = accountNo;
    return this;
  }

   /**
   * Get accountNo
   * @return accountNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "000000001", value = "")

  public String getAccountNo() {
    return accountNo;
  }


  public void setAccountNo(String accountNo) {
    this.accountNo = accountNo;
  }


  public GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse date(Date date) {
    
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Date getDate() {
    return date;
  }


  public void setDate(Date date) {
    this.date = date;
  }


  public GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse currency(GetRecurringTransactionsCurrency currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetRecurringTransactionsCurrency getCurrency() {
    return currency;
  }


  public void setCurrency(GetRecurringTransactionsCurrency currency) {
    this.currency = currency;
  }


  public GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse paymentDetailData(GetRecurringPaymentDetailData paymentDetailData) {
    
    this.paymentDetailData = paymentDetailData;
    return this;
  }

   /**
   * Get paymentDetailData
   * @return paymentDetailData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetRecurringPaymentDetailData getPaymentDetailData() {
    return paymentDetailData;
  }


  public void setPaymentDetailData(GetRecurringPaymentDetailData paymentDetailData) {
    this.paymentDetailData = paymentDetailData;
  }


  public GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse amount(Float amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5000", value = "")

  public Float getAmount() {
    return amount;
  }


  public void setAmount(Float amount) {
    this.amount = amount;
  }


  public GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse runningBalance(Integer runningBalance) {
    
    this.runningBalance = runningBalance;
    return this;
  }

   /**
   * Get runningBalance
   * @return runningBalance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public Integer getRunningBalance() {
    return runningBalance;
  }


  public void setRunningBalance(Integer runningBalance) {
    this.runningBalance = runningBalance;
  }


  public GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse reversed(Boolean reversed) {
    
    this.reversed = reversed;
    return this;
  }

   /**
   * Get reversed
   * @return reversed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getReversed() {
    return reversed;
  }


  public void setReversed(Boolean reversed) {
    this.reversed = reversed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse getRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse = (GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse) o;
    return Objects.equals(this.id, getRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse.id) &&
        Objects.equals(this.transactionType, getRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse.transactionType) &&
        Objects.equals(this.accountId, getRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse.accountId) &&
        Objects.equals(this.accountNo, getRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse.accountNo) &&
        Objects.equals(this.date, getRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse.date) &&
        Objects.equals(this.currency, getRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse.currency) &&
        Objects.equals(this.paymentDetailData, getRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse.paymentDetailData) &&
        Objects.equals(this.amount, getRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse.amount) &&
        Objects.equals(this.runningBalance, getRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse.runningBalance) &&
        Objects.equals(this.reversed, getRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse.reversed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, transactionType, accountId, accountNo, date, currency, paymentDetailData, amount, runningBalance, reversed);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountNo: ").append(toIndentedString(accountNo)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    paymentDetailData: ").append(toIndentedString(paymentDetailData)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    runningBalance: ").append(toIndentedString(runningBalance)).append("\n");
    sb.append("    reversed: ").append(toIndentedString(reversed)).append("\n");
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

