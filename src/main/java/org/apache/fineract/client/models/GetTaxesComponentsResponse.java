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
import java.util.Date;
import java.util.List;
import org.apache.fineract.client.models.GetTaxesComponentsCreditAccount;
import org.apache.fineract.client.models.GetTaxesComponentsCreditAccountType;

/**
 * GetTaxesComponentsResponse
 */
@ApiModel(description = "GetTaxesComponentsResponse")

public class GetTaxesComponentsResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PERCENTAGE = "percentage";
  @SerializedName(SERIALIZED_NAME_PERCENTAGE)
  private Float percentage;

  public static final String SERIALIZED_NAME_CREDIT_ACCOUNT_TYPE = "creditAccountType";
  @SerializedName(SERIALIZED_NAME_CREDIT_ACCOUNT_TYPE)
  private GetTaxesComponentsCreditAccountType creditAccountType;

  public static final String SERIALIZED_NAME_CREDIT_ACCOUNT = "creditAccount";
  @SerializedName(SERIALIZED_NAME_CREDIT_ACCOUNT)
  private GetTaxesComponentsCreditAccount creditAccount;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private Date startDate;

  public static final String SERIALIZED_NAME_TAX_COMPONENTS_HISTORIES = "taxComponentsHistories";
  @SerializedName(SERIALIZED_NAME_TAX_COMPONENTS_HISTORIES)
  private List<Object> taxComponentsHistories = null;


  public GetTaxesComponentsResponse id(Integer id) {
    
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


  public GetTaxesComponentsResponse name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "tax component 1", value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public GetTaxesComponentsResponse percentage(Float percentage) {
    
    this.percentage = percentage;
    return this;
  }

   /**
   * Get percentage
   * @return percentage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10.0", value = "")

  public Float getPercentage() {
    return percentage;
  }


  public void setPercentage(Float percentage) {
    this.percentage = percentage;
  }


  public GetTaxesComponentsResponse creditAccountType(GetTaxesComponentsCreditAccountType creditAccountType) {
    
    this.creditAccountType = creditAccountType;
    return this;
  }

   /**
   * Get creditAccountType
   * @return creditAccountType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetTaxesComponentsCreditAccountType getCreditAccountType() {
    return creditAccountType;
  }


  public void setCreditAccountType(GetTaxesComponentsCreditAccountType creditAccountType) {
    this.creditAccountType = creditAccountType;
  }


  public GetTaxesComponentsResponse creditAccount(GetTaxesComponentsCreditAccount creditAccount) {
    
    this.creditAccount = creditAccount;
    return this;
  }

   /**
   * Get creditAccount
   * @return creditAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetTaxesComponentsCreditAccount getCreditAccount() {
    return creditAccount;
  }


  public void setCreditAccount(GetTaxesComponentsCreditAccount creditAccount) {
    this.creditAccount = creditAccount;
  }


  public GetTaxesComponentsResponse startDate(Date startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Date getStartDate() {
    return startDate;
  }


  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }


  public GetTaxesComponentsResponse taxComponentsHistories(List<Object> taxComponentsHistories) {
    
    this.taxComponentsHistories = taxComponentsHistories;
    return this;
  }

  public GetTaxesComponentsResponse addTaxComponentsHistoriesItem(Object taxComponentsHistoriesItem) {
    if (this.taxComponentsHistories == null) {
      this.taxComponentsHistories = new ArrayList<Object>();
    }
    this.taxComponentsHistories.add(taxComponentsHistoriesItem);
    return this;
  }

   /**
   * Get taxComponentsHistories
   * @return taxComponentsHistories
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Object> getTaxComponentsHistories() {
    return taxComponentsHistories;
  }


  public void setTaxComponentsHistories(List<Object> taxComponentsHistories) {
    this.taxComponentsHistories = taxComponentsHistories;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTaxesComponentsResponse getTaxesComponentsResponse = (GetTaxesComponentsResponse) o;
    return Objects.equals(this.id, getTaxesComponentsResponse.id) &&
        Objects.equals(this.name, getTaxesComponentsResponse.name) &&
        Objects.equals(this.percentage, getTaxesComponentsResponse.percentage) &&
        Objects.equals(this.creditAccountType, getTaxesComponentsResponse.creditAccountType) &&
        Objects.equals(this.creditAccount, getTaxesComponentsResponse.creditAccount) &&
        Objects.equals(this.startDate, getTaxesComponentsResponse.startDate) &&
        Objects.equals(this.taxComponentsHistories, getTaxesComponentsResponse.taxComponentsHistories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, percentage, creditAccountType, creditAccount, startDate, taxComponentsHistories);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTaxesComponentsResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
    sb.append("    creditAccountType: ").append(toIndentedString(creditAccountType)).append("\n");
    sb.append("    creditAccount: ").append(toIndentedString(creditAccount)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    taxComponentsHistories: ").append(toIndentedString(taxComponentsHistories)).append("\n");
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

