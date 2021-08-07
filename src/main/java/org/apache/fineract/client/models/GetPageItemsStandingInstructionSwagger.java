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
import java.util.Date;
import org.apache.fineract.client.models.GetFromAccountStandingInstructionSwagger;
import org.apache.fineract.client.models.GetFromAccountTypeStandingInstructionSwagger;
import org.apache.fineract.client.models.GetFromClientStandingInstructionSwagger;
import org.apache.fineract.client.models.GetFromOfficeStandingInstructionSwagger;
import org.apache.fineract.client.models.GetInstructionTypeStandingInstructionSwagger;
import org.apache.fineract.client.models.GetPriorityStandingInstructionSwagger;
import org.apache.fineract.client.models.GetRecurrenceFrequencyStandingInstructionSwagger;
import org.apache.fineract.client.models.GetRecurrenceTypeStandingInstructionSwagger;
import org.apache.fineract.client.models.GetStatusStandingInstructionSwagger;
import org.apache.fineract.client.models.GetToAccountStandingInstructionSwagger;
import org.apache.fineract.client.models.GetToAccountTypeStandingInstructionSwagger;
import org.apache.fineract.client.models.GetToClientStandingInstructionSwagger;
import org.apache.fineract.client.models.GetToOfficeStandingInstructionSwagger;
import org.apache.fineract.client.models.GetTransferTypeStandingInstructionSwagger;

/**
 * GetPageItemsStandingInstructionSwagger
 */

public class GetPageItemsStandingInstructionSwagger {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_ACCOUNT_DETAIL_ID = "accountDetailId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_DETAIL_ID)
  private Long accountDetailId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_FROM_OFFICE = "fromOffice";
  @SerializedName(SERIALIZED_NAME_FROM_OFFICE)
  private GetFromOfficeStandingInstructionSwagger fromOffice;

  public static final String SERIALIZED_NAME_FROM_CLIENT = "fromClient";
  @SerializedName(SERIALIZED_NAME_FROM_CLIENT)
  private GetFromClientStandingInstructionSwagger fromClient;

  public static final String SERIALIZED_NAME_FROM_ACCOUNT_TYPE = "fromAccountType";
  @SerializedName(SERIALIZED_NAME_FROM_ACCOUNT_TYPE)
  private GetFromAccountTypeStandingInstructionSwagger fromAccountType;

  public static final String SERIALIZED_NAME_FROM_ACCOUNT = "fromAccount";
  @SerializedName(SERIALIZED_NAME_FROM_ACCOUNT)
  private GetFromAccountStandingInstructionSwagger fromAccount;

  public static final String SERIALIZED_NAME_TO_OFFICE = "toOffice";
  @SerializedName(SERIALIZED_NAME_TO_OFFICE)
  private GetToOfficeStandingInstructionSwagger toOffice;

  public static final String SERIALIZED_NAME_TO_CLIENT = "toClient";
  @SerializedName(SERIALIZED_NAME_TO_CLIENT)
  private GetToClientStandingInstructionSwagger toClient;

  public static final String SERIALIZED_NAME_TO_ACCOUNT_TYPE = "toAccountType";
  @SerializedName(SERIALIZED_NAME_TO_ACCOUNT_TYPE)
  private GetToAccountTypeStandingInstructionSwagger toAccountType;

  public static final String SERIALIZED_NAME_TO_ACCOUNT = "toAccount";
  @SerializedName(SERIALIZED_NAME_TO_ACCOUNT)
  private GetToAccountStandingInstructionSwagger toAccount;

  public static final String SERIALIZED_NAME_TRANSFER_TYPE = "transferType";
  @SerializedName(SERIALIZED_NAME_TRANSFER_TYPE)
  private GetTransferTypeStandingInstructionSwagger transferType;

  public static final String SERIALIZED_NAME_PRIORITY = "priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  private GetPriorityStandingInstructionSwagger priority;

  public static final String SERIALIZED_NAME_INSTRUCTION_TYPE = "instructionType";
  @SerializedName(SERIALIZED_NAME_INSTRUCTION_TYPE)
  private GetInstructionTypeStandingInstructionSwagger instructionType;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private GetStatusStandingInstructionSwagger status;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Float amount;

  public static final String SERIALIZED_NAME_VALID_FROM = "validFrom";
  @SerializedName(SERIALIZED_NAME_VALID_FROM)
  private Date validFrom;

  public static final String SERIALIZED_NAME_RECURRENCE_TYPE = "recurrenceType";
  @SerializedName(SERIALIZED_NAME_RECURRENCE_TYPE)
  private GetRecurrenceTypeStandingInstructionSwagger recurrenceType;

  public static final String SERIALIZED_NAME_RECURRENCE_FREQUENCY = "recurrenceFrequency";
  @SerializedName(SERIALIZED_NAME_RECURRENCE_FREQUENCY)
  private GetRecurrenceFrequencyStandingInstructionSwagger recurrenceFrequency;

  public static final String SERIALIZED_NAME_RECURRENCE_INTERVAL = "recurrenceInterval";
  @SerializedName(SERIALIZED_NAME_RECURRENCE_INTERVAL)
  private Integer recurrenceInterval;

  public static final String SERIALIZED_NAME_RECURRENCE_ON_MONTH_DAY = "recurrenceOnMonthDay";
  @SerializedName(SERIALIZED_NAME_RECURRENCE_ON_MONTH_DAY)
  private Date recurrenceOnMonthDay;


  public GetPageItemsStandingInstructionSwagger id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public GetPageItemsStandingInstructionSwagger accountDetailId(Long accountDetailId) {
    
    this.accountDetailId = accountDetailId;
    return this;
  }

   /**
   * Get accountDetailId
   * @return accountDetailId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "6", value = "")

  public Long getAccountDetailId() {
    return accountDetailId;
  }


  public void setAccountDetailId(Long accountDetailId) {
    this.accountDetailId = accountDetailId;
  }


  public GetPageItemsStandingInstructionSwagger name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "test standing", value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public GetPageItemsStandingInstructionSwagger fromOffice(GetFromOfficeStandingInstructionSwagger fromOffice) {
    
    this.fromOffice = fromOffice;
    return this;
  }

   /**
   * Get fromOffice
   * @return fromOffice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetFromOfficeStandingInstructionSwagger getFromOffice() {
    return fromOffice;
  }


  public void setFromOffice(GetFromOfficeStandingInstructionSwagger fromOffice) {
    this.fromOffice = fromOffice;
  }


  public GetPageItemsStandingInstructionSwagger fromClient(GetFromClientStandingInstructionSwagger fromClient) {
    
    this.fromClient = fromClient;
    return this;
  }

   /**
   * Get fromClient
   * @return fromClient
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetFromClientStandingInstructionSwagger getFromClient() {
    return fromClient;
  }


  public void setFromClient(GetFromClientStandingInstructionSwagger fromClient) {
    this.fromClient = fromClient;
  }


  public GetPageItemsStandingInstructionSwagger fromAccountType(GetFromAccountTypeStandingInstructionSwagger fromAccountType) {
    
    this.fromAccountType = fromAccountType;
    return this;
  }

   /**
   * Get fromAccountType
   * @return fromAccountType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetFromAccountTypeStandingInstructionSwagger getFromAccountType() {
    return fromAccountType;
  }


  public void setFromAccountType(GetFromAccountTypeStandingInstructionSwagger fromAccountType) {
    this.fromAccountType = fromAccountType;
  }


  public GetPageItemsStandingInstructionSwagger fromAccount(GetFromAccountStandingInstructionSwagger fromAccount) {
    
    this.fromAccount = fromAccount;
    return this;
  }

   /**
   * Get fromAccount
   * @return fromAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetFromAccountStandingInstructionSwagger getFromAccount() {
    return fromAccount;
  }


  public void setFromAccount(GetFromAccountStandingInstructionSwagger fromAccount) {
    this.fromAccount = fromAccount;
  }


  public GetPageItemsStandingInstructionSwagger toOffice(GetToOfficeStandingInstructionSwagger toOffice) {
    
    this.toOffice = toOffice;
    return this;
  }

   /**
   * Get toOffice
   * @return toOffice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetToOfficeStandingInstructionSwagger getToOffice() {
    return toOffice;
  }


  public void setToOffice(GetToOfficeStandingInstructionSwagger toOffice) {
    this.toOffice = toOffice;
  }


  public GetPageItemsStandingInstructionSwagger toClient(GetToClientStandingInstructionSwagger toClient) {
    
    this.toClient = toClient;
    return this;
  }

   /**
   * Get toClient
   * @return toClient
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetToClientStandingInstructionSwagger getToClient() {
    return toClient;
  }


  public void setToClient(GetToClientStandingInstructionSwagger toClient) {
    this.toClient = toClient;
  }


  public GetPageItemsStandingInstructionSwagger toAccountType(GetToAccountTypeStandingInstructionSwagger toAccountType) {
    
    this.toAccountType = toAccountType;
    return this;
  }

   /**
   * Get toAccountType
   * @return toAccountType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetToAccountTypeStandingInstructionSwagger getToAccountType() {
    return toAccountType;
  }


  public void setToAccountType(GetToAccountTypeStandingInstructionSwagger toAccountType) {
    this.toAccountType = toAccountType;
  }


  public GetPageItemsStandingInstructionSwagger toAccount(GetToAccountStandingInstructionSwagger toAccount) {
    
    this.toAccount = toAccount;
    return this;
  }

   /**
   * Get toAccount
   * @return toAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetToAccountStandingInstructionSwagger getToAccount() {
    return toAccount;
  }


  public void setToAccount(GetToAccountStandingInstructionSwagger toAccount) {
    this.toAccount = toAccount;
  }


  public GetPageItemsStandingInstructionSwagger transferType(GetTransferTypeStandingInstructionSwagger transferType) {
    
    this.transferType = transferType;
    return this;
  }

   /**
   * Get transferType
   * @return transferType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetTransferTypeStandingInstructionSwagger getTransferType() {
    return transferType;
  }


  public void setTransferType(GetTransferTypeStandingInstructionSwagger transferType) {
    this.transferType = transferType;
  }


  public GetPageItemsStandingInstructionSwagger priority(GetPriorityStandingInstructionSwagger priority) {
    
    this.priority = priority;
    return this;
  }

   /**
   * Get priority
   * @return priority
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetPriorityStandingInstructionSwagger getPriority() {
    return priority;
  }


  public void setPriority(GetPriorityStandingInstructionSwagger priority) {
    this.priority = priority;
  }


  public GetPageItemsStandingInstructionSwagger instructionType(GetInstructionTypeStandingInstructionSwagger instructionType) {
    
    this.instructionType = instructionType;
    return this;
  }

   /**
   * Get instructionType
   * @return instructionType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetInstructionTypeStandingInstructionSwagger getInstructionType() {
    return instructionType;
  }


  public void setInstructionType(GetInstructionTypeStandingInstructionSwagger instructionType) {
    this.instructionType = instructionType;
  }


  public GetPageItemsStandingInstructionSwagger status(GetStatusStandingInstructionSwagger status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetStatusStandingInstructionSwagger getStatus() {
    return status;
  }


  public void setStatus(GetStatusStandingInstructionSwagger status) {
    this.status = status;
  }


  public GetPageItemsStandingInstructionSwagger amount(Float amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "150.0", value = "")

  public Float getAmount() {
    return amount;
  }


  public void setAmount(Float amount) {
    this.amount = amount;
  }


  public GetPageItemsStandingInstructionSwagger validFrom(Date validFrom) {
    
    this.validFrom = validFrom;
    return this;
  }

   /**
   * Get validFrom
   * @return validFrom
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Date getValidFrom() {
    return validFrom;
  }


  public void setValidFrom(Date validFrom) {
    this.validFrom = validFrom;
  }


  public GetPageItemsStandingInstructionSwagger recurrenceType(GetRecurrenceTypeStandingInstructionSwagger recurrenceType) {
    
    this.recurrenceType = recurrenceType;
    return this;
  }

   /**
   * Get recurrenceType
   * @return recurrenceType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetRecurrenceTypeStandingInstructionSwagger getRecurrenceType() {
    return recurrenceType;
  }


  public void setRecurrenceType(GetRecurrenceTypeStandingInstructionSwagger recurrenceType) {
    this.recurrenceType = recurrenceType;
  }


  public GetPageItemsStandingInstructionSwagger recurrenceFrequency(GetRecurrenceFrequencyStandingInstructionSwagger recurrenceFrequency) {
    
    this.recurrenceFrequency = recurrenceFrequency;
    return this;
  }

   /**
   * Get recurrenceFrequency
   * @return recurrenceFrequency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetRecurrenceFrequencyStandingInstructionSwagger getRecurrenceFrequency() {
    return recurrenceFrequency;
  }


  public void setRecurrenceFrequency(GetRecurrenceFrequencyStandingInstructionSwagger recurrenceFrequency) {
    this.recurrenceFrequency = recurrenceFrequency;
  }


  public GetPageItemsStandingInstructionSwagger recurrenceInterval(Integer recurrenceInterval) {
    
    this.recurrenceInterval = recurrenceInterval;
    return this;
  }

   /**
   * Get recurrenceInterval
   * @return recurrenceInterval
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getRecurrenceInterval() {
    return recurrenceInterval;
  }


  public void setRecurrenceInterval(Integer recurrenceInterval) {
    this.recurrenceInterval = recurrenceInterval;
  }


  public GetPageItemsStandingInstructionSwagger recurrenceOnMonthDay(Date recurrenceOnMonthDay) {
    
    this.recurrenceOnMonthDay = recurrenceOnMonthDay;
    return this;
  }

   /**
   * Get recurrenceOnMonthDay
   * @return recurrenceOnMonthDay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Date getRecurrenceOnMonthDay() {
    return recurrenceOnMonthDay;
  }


  public void setRecurrenceOnMonthDay(Date recurrenceOnMonthDay) {
    this.recurrenceOnMonthDay = recurrenceOnMonthDay;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetPageItemsStandingInstructionSwagger getPageItemsStandingInstructionSwagger = (GetPageItemsStandingInstructionSwagger) o;
    return Objects.equals(this.id, getPageItemsStandingInstructionSwagger.id) &&
        Objects.equals(this.accountDetailId, getPageItemsStandingInstructionSwagger.accountDetailId) &&
        Objects.equals(this.name, getPageItemsStandingInstructionSwagger.name) &&
        Objects.equals(this.fromOffice, getPageItemsStandingInstructionSwagger.fromOffice) &&
        Objects.equals(this.fromClient, getPageItemsStandingInstructionSwagger.fromClient) &&
        Objects.equals(this.fromAccountType, getPageItemsStandingInstructionSwagger.fromAccountType) &&
        Objects.equals(this.fromAccount, getPageItemsStandingInstructionSwagger.fromAccount) &&
        Objects.equals(this.toOffice, getPageItemsStandingInstructionSwagger.toOffice) &&
        Objects.equals(this.toClient, getPageItemsStandingInstructionSwagger.toClient) &&
        Objects.equals(this.toAccountType, getPageItemsStandingInstructionSwagger.toAccountType) &&
        Objects.equals(this.toAccount, getPageItemsStandingInstructionSwagger.toAccount) &&
        Objects.equals(this.transferType, getPageItemsStandingInstructionSwagger.transferType) &&
        Objects.equals(this.priority, getPageItemsStandingInstructionSwagger.priority) &&
        Objects.equals(this.instructionType, getPageItemsStandingInstructionSwagger.instructionType) &&
        Objects.equals(this.status, getPageItemsStandingInstructionSwagger.status) &&
        Objects.equals(this.amount, getPageItemsStandingInstructionSwagger.amount) &&
        Objects.equals(this.validFrom, getPageItemsStandingInstructionSwagger.validFrom) &&
        Objects.equals(this.recurrenceType, getPageItemsStandingInstructionSwagger.recurrenceType) &&
        Objects.equals(this.recurrenceFrequency, getPageItemsStandingInstructionSwagger.recurrenceFrequency) &&
        Objects.equals(this.recurrenceInterval, getPageItemsStandingInstructionSwagger.recurrenceInterval) &&
        Objects.equals(this.recurrenceOnMonthDay, getPageItemsStandingInstructionSwagger.recurrenceOnMonthDay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, accountDetailId, name, fromOffice, fromClient, fromAccountType, fromAccount, toOffice, toClient, toAccountType, toAccount, transferType, priority, instructionType, status, amount, validFrom, recurrenceType, recurrenceFrequency, recurrenceInterval, recurrenceOnMonthDay);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPageItemsStandingInstructionSwagger {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    accountDetailId: ").append(toIndentedString(accountDetailId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    fromOffice: ").append(toIndentedString(fromOffice)).append("\n");
    sb.append("    fromClient: ").append(toIndentedString(fromClient)).append("\n");
    sb.append("    fromAccountType: ").append(toIndentedString(fromAccountType)).append("\n");
    sb.append("    fromAccount: ").append(toIndentedString(fromAccount)).append("\n");
    sb.append("    toOffice: ").append(toIndentedString(toOffice)).append("\n");
    sb.append("    toClient: ").append(toIndentedString(toClient)).append("\n");
    sb.append("    toAccountType: ").append(toIndentedString(toAccountType)).append("\n");
    sb.append("    toAccount: ").append(toIndentedString(toAccount)).append("\n");
    sb.append("    transferType: ").append(toIndentedString(transferType)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    instructionType: ").append(toIndentedString(instructionType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    validFrom: ").append(toIndentedString(validFrom)).append("\n");
    sb.append("    recurrenceType: ").append(toIndentedString(recurrenceType)).append("\n");
    sb.append("    recurrenceFrequency: ").append(toIndentedString(recurrenceFrequency)).append("\n");
    sb.append("    recurrenceInterval: ").append(toIndentedString(recurrenceInterval)).append("\n");
    sb.append("    recurrenceOnMonthDay: ").append(toIndentedString(recurrenceOnMonthDay)).append("\n");
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

