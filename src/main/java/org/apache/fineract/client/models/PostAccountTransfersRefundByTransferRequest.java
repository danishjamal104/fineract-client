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

/**
 * PostAccountTransfersRefundByTransferRequest
 */
@ApiModel(description = "PostAccountTransfersRefundByTransferRequest")

public class PostAccountTransfersRefundByTransferRequest {
  public static final String SERIALIZED_NAME_FROM_ACCOUNT_ID = "fromAccountId";
  @SerializedName(SERIALIZED_NAME_FROM_ACCOUNT_ID)
  private Integer fromAccountId;

  public static final String SERIALIZED_NAME_FROM_ACCOUNT_TYPE = "fromAccountType";
  @SerializedName(SERIALIZED_NAME_FROM_ACCOUNT_TYPE)
  private Integer fromAccountType;

  public static final String SERIALIZED_NAME_TO_OFFICE_ID = "toOfficeId";
  @SerializedName(SERIALIZED_NAME_TO_OFFICE_ID)
  private Integer toOfficeId;

  public static final String SERIALIZED_NAME_TO_CLIENT_ID = "toClientId";
  @SerializedName(SERIALIZED_NAME_TO_CLIENT_ID)
  private Integer toClientId;

  public static final String SERIALIZED_NAME_TO_ACCOUNT_TYPE = "toAccountType";
  @SerializedName(SERIALIZED_NAME_TO_ACCOUNT_TYPE)
  private Integer toAccountType;

  public static final String SERIALIZED_NAME_TO_ACCOUNT_ID = "toAccountId";
  @SerializedName(SERIALIZED_NAME_TO_ACCOUNT_ID)
  private Integer toAccountId;

  public static final String SERIALIZED_NAME_TRANSFER_AMOUNT = "transferAmount";
  @SerializedName(SERIALIZED_NAME_TRANSFER_AMOUNT)
  private Float transferAmount;

  public static final String SERIALIZED_NAME_TRANSFER_DATE = "transferDate";
  @SerializedName(SERIALIZED_NAME_TRANSFER_DATE)
  private String transferDate;

  public static final String SERIALIZED_NAME_TRANSFER_DESCRIPTION = "transferDescription";
  @SerializedName(SERIALIZED_NAME_TRANSFER_DESCRIPTION)
  private String transferDescription;

  public static final String SERIALIZED_NAME_LOCALE = "locale";
  @SerializedName(SERIALIZED_NAME_LOCALE)
  private String locale;

  public static final String SERIALIZED_NAME_DATE_FORMAT = "dateFormat";
  @SerializedName(SERIALIZED_NAME_DATE_FORMAT)
  private String dateFormat;

  public static final String SERIALIZED_NAME_FROM_CLIENT_ID = "fromClientId";
  @SerializedName(SERIALIZED_NAME_FROM_CLIENT_ID)
  private Integer fromClientId;

  public static final String SERIALIZED_NAME_FROM_OFFICE_ID = "fromOfficeId";
  @SerializedName(SERIALIZED_NAME_FROM_OFFICE_ID)
  private Integer fromOfficeId;


  public PostAccountTransfersRefundByTransferRequest fromAccountId(Integer fromAccountId) {
    
    this.fromAccountId = fromAccountId;
    return this;
  }

   /**
   * Get fromAccountId
   * @return fromAccountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "")

  public Integer getFromAccountId() {
    return fromAccountId;
  }


  public void setFromAccountId(Integer fromAccountId) {
    this.fromAccountId = fromAccountId;
  }


  public PostAccountTransfersRefundByTransferRequest fromAccountType(Integer fromAccountType) {
    
    this.fromAccountType = fromAccountType;
    return this;
  }

   /**
   * Get fromAccountType
   * @return fromAccountType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getFromAccountType() {
    return fromAccountType;
  }


  public void setFromAccountType(Integer fromAccountType) {
    this.fromAccountType = fromAccountType;
  }


  public PostAccountTransfersRefundByTransferRequest toOfficeId(Integer toOfficeId) {
    
    this.toOfficeId = toOfficeId;
    return this;
  }

   /**
   * Get toOfficeId
   * @return toOfficeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getToOfficeId() {
    return toOfficeId;
  }


  public void setToOfficeId(Integer toOfficeId) {
    this.toOfficeId = toOfficeId;
  }


  public PostAccountTransfersRefundByTransferRequest toClientId(Integer toClientId) {
    
    this.toClientId = toClientId;
    return this;
  }

   /**
   * Get toClientId
   * @return toClientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getToClientId() {
    return toClientId;
  }


  public void setToClientId(Integer toClientId) {
    this.toClientId = toClientId;
  }


  public PostAccountTransfersRefundByTransferRequest toAccountType(Integer toAccountType) {
    
    this.toAccountType = toAccountType;
    return this;
  }

   /**
   * Get toAccountType
   * @return toAccountType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "")

  public Integer getToAccountType() {
    return toAccountType;
  }


  public void setToAccountType(Integer toAccountType) {
    this.toAccountType = toAccountType;
  }


  public PostAccountTransfersRefundByTransferRequest toAccountId(Integer toAccountId) {
    
    this.toAccountId = toAccountId;
    return this;
  }

   /**
   * Get toAccountId
   * @return toAccountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getToAccountId() {
    return toAccountId;
  }


  public void setToAccountId(Integer toAccountId) {
    this.toAccountId = toAccountId;
  }


  public PostAccountTransfersRefundByTransferRequest transferAmount(Float transferAmount) {
    
    this.transferAmount = transferAmount;
    return this;
  }

   /**
   * Get transferAmount
   * @return transferAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "130", value = "")

  public Float getTransferAmount() {
    return transferAmount;
  }


  public void setTransferAmount(Float transferAmount) {
    this.transferAmount = transferAmount;
  }


  public PostAccountTransfersRefundByTransferRequest transferDate(String transferDate) {
    
    this.transferDate = transferDate;
    return this;
  }

   /**
   * Get transferDate
   * @return transferDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "31 October 2014", value = "")

  public String getTransferDate() {
    return transferDate;
  }


  public void setTransferDate(String transferDate) {
    this.transferDate = transferDate;
  }


  public PostAccountTransfersRefundByTransferRequest transferDescription(String transferDescription) {
    
    this.transferDescription = transferDescription;
    return this;
  }

   /**
   * Get transferDescription
   * @return transferDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Transfer refund to my savings account", value = "")

  public String getTransferDescription() {
    return transferDescription;
  }


  public void setTransferDescription(String transferDescription) {
    this.transferDescription = transferDescription;
  }


  public PostAccountTransfersRefundByTransferRequest locale(String locale) {
    
    this.locale = locale;
    return this;
  }

   /**
   * Get locale
   * @return locale
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "en", value = "")

  public String getLocale() {
    return locale;
  }


  public void setLocale(String locale) {
    this.locale = locale;
  }


  public PostAccountTransfersRefundByTransferRequest dateFormat(String dateFormat) {
    
    this.dateFormat = dateFormat;
    return this;
  }

   /**
   * Get dateFormat
   * @return dateFormat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "dd MMMM yyyy", value = "")

  public String getDateFormat() {
    return dateFormat;
  }


  public void setDateFormat(String dateFormat) {
    this.dateFormat = dateFormat;
  }


  public PostAccountTransfersRefundByTransferRequest fromClientId(Integer fromClientId) {
    
    this.fromClientId = fromClientId;
    return this;
  }

   /**
   * Get fromClientId
   * @return fromClientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getFromClientId() {
    return fromClientId;
  }


  public void setFromClientId(Integer fromClientId) {
    this.fromClientId = fromClientId;
  }


  public PostAccountTransfersRefundByTransferRequest fromOfficeId(Integer fromOfficeId) {
    
    this.fromOfficeId = fromOfficeId;
    return this;
  }

   /**
   * Get fromOfficeId
   * @return fromOfficeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getFromOfficeId() {
    return fromOfficeId;
  }


  public void setFromOfficeId(Integer fromOfficeId) {
    this.fromOfficeId = fromOfficeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostAccountTransfersRefundByTransferRequest postAccountTransfersRefundByTransferRequest = (PostAccountTransfersRefundByTransferRequest) o;
    return Objects.equals(this.fromAccountId, postAccountTransfersRefundByTransferRequest.fromAccountId) &&
        Objects.equals(this.fromAccountType, postAccountTransfersRefundByTransferRequest.fromAccountType) &&
        Objects.equals(this.toOfficeId, postAccountTransfersRefundByTransferRequest.toOfficeId) &&
        Objects.equals(this.toClientId, postAccountTransfersRefundByTransferRequest.toClientId) &&
        Objects.equals(this.toAccountType, postAccountTransfersRefundByTransferRequest.toAccountType) &&
        Objects.equals(this.toAccountId, postAccountTransfersRefundByTransferRequest.toAccountId) &&
        Objects.equals(this.transferAmount, postAccountTransfersRefundByTransferRequest.transferAmount) &&
        Objects.equals(this.transferDate, postAccountTransfersRefundByTransferRequest.transferDate) &&
        Objects.equals(this.transferDescription, postAccountTransfersRefundByTransferRequest.transferDescription) &&
        Objects.equals(this.locale, postAccountTransfersRefundByTransferRequest.locale) &&
        Objects.equals(this.dateFormat, postAccountTransfersRefundByTransferRequest.dateFormat) &&
        Objects.equals(this.fromClientId, postAccountTransfersRefundByTransferRequest.fromClientId) &&
        Objects.equals(this.fromOfficeId, postAccountTransfersRefundByTransferRequest.fromOfficeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromAccountId, fromAccountType, toOfficeId, toClientId, toAccountType, toAccountId, transferAmount, transferDate, transferDescription, locale, dateFormat, fromClientId, fromOfficeId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostAccountTransfersRefundByTransferRequest {\n");
    sb.append("    fromAccountId: ").append(toIndentedString(fromAccountId)).append("\n");
    sb.append("    fromAccountType: ").append(toIndentedString(fromAccountType)).append("\n");
    sb.append("    toOfficeId: ").append(toIndentedString(toOfficeId)).append("\n");
    sb.append("    toClientId: ").append(toIndentedString(toClientId)).append("\n");
    sb.append("    toAccountType: ").append(toIndentedString(toAccountType)).append("\n");
    sb.append("    toAccountId: ").append(toIndentedString(toAccountId)).append("\n");
    sb.append("    transferAmount: ").append(toIndentedString(transferAmount)).append("\n");
    sb.append("    transferDate: ").append(toIndentedString(transferDate)).append("\n");
    sb.append("    transferDescription: ").append(toIndentedString(transferDescription)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    dateFormat: ").append(toIndentedString(dateFormat)).append("\n");
    sb.append("    fromClientId: ").append(toIndentedString(fromClientId)).append("\n");
    sb.append("    fromOfficeId: ").append(toIndentedString(fromOfficeId)).append("\n");
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

