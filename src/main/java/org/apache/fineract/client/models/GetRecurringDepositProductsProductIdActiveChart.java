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
import org.apache.fineract.client.models.GetRecurringDepositProductsProductIdChartSlabs;
import org.apache.fineract.client.models.GetRecurringDepositProductsProductIdPeriodType;

/**
 * GetRecurringDepositProductsProductIdActiveChart
 */

public class GetRecurringDepositProductsProductIdActiveChart {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_FROM_DATE = "fromDate";
  @SerializedName(SERIALIZED_NAME_FROM_DATE)
  private Date fromDate;

  public static final String SERIALIZED_NAME_SAVINGS_PRODUCT_ID = "savingsProductId";
  @SerializedName(SERIALIZED_NAME_SAVINGS_PRODUCT_ID)
  private Integer savingsProductId;

  public static final String SERIALIZED_NAME_SAVINGS_PRODUCT_NAME = "savingsProductName";
  @SerializedName(SERIALIZED_NAME_SAVINGS_PRODUCT_NAME)
  private String savingsProductName;

  public static final String SERIALIZED_NAME_CHART_SLABS = "chartSlabs";
  @SerializedName(SERIALIZED_NAME_CHART_SLABS)
  private List<GetRecurringDepositProductsProductIdChartSlabs> chartSlabs = null;

  public static final String SERIALIZED_NAME_PERIOD_TYPES = "periodTypes";
  @SerializedName(SERIALIZED_NAME_PERIOD_TYPES)
  private List<GetRecurringDepositProductsProductIdPeriodType> periodTypes = null;


  public GetRecurringDepositProductsProductIdActiveChart id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8", value = "")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public GetRecurringDepositProductsProductIdActiveChart fromDate(Date fromDate) {
    
    this.fromDate = fromDate;
    return this;
  }

   /**
   * Get fromDate
   * @return fromDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Date getFromDate() {
    return fromDate;
  }


  public void setFromDate(Date fromDate) {
    this.fromDate = fromDate;
  }


  public GetRecurringDepositProductsProductIdActiveChart savingsProductId(Integer savingsProductId) {
    
    this.savingsProductId = savingsProductId;
    return this;
  }

   /**
   * Get savingsProductId
   * @return savingsProductId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8", value = "")

  public Integer getSavingsProductId() {
    return savingsProductId;
  }


  public void setSavingsProductId(Integer savingsProductId) {
    this.savingsProductId = savingsProductId;
  }


  public GetRecurringDepositProductsProductIdActiveChart savingsProductName(String savingsProductName) {
    
    this.savingsProductName = savingsProductName;
    return this;
  }

   /**
   * Get savingsProductName
   * @return savingsProductName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Recurring deposit product", value = "")

  public String getSavingsProductName() {
    return savingsProductName;
  }


  public void setSavingsProductName(String savingsProductName) {
    this.savingsProductName = savingsProductName;
  }


  public GetRecurringDepositProductsProductIdActiveChart chartSlabs(List<GetRecurringDepositProductsProductIdChartSlabs> chartSlabs) {
    
    this.chartSlabs = chartSlabs;
    return this;
  }

  public GetRecurringDepositProductsProductIdActiveChart addChartSlabsItem(GetRecurringDepositProductsProductIdChartSlabs chartSlabsItem) {
    if (this.chartSlabs == null) {
      this.chartSlabs = new ArrayList<GetRecurringDepositProductsProductIdChartSlabs>();
    }
    this.chartSlabs.add(chartSlabsItem);
    return this;
  }

   /**
   * Get chartSlabs
   * @return chartSlabs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<GetRecurringDepositProductsProductIdChartSlabs> getChartSlabs() {
    return chartSlabs;
  }


  public void setChartSlabs(List<GetRecurringDepositProductsProductIdChartSlabs> chartSlabs) {
    this.chartSlabs = chartSlabs;
  }


  public GetRecurringDepositProductsProductIdActiveChart periodTypes(List<GetRecurringDepositProductsProductIdPeriodType> periodTypes) {
    
    this.periodTypes = periodTypes;
    return this;
  }

  public GetRecurringDepositProductsProductIdActiveChart addPeriodTypesItem(GetRecurringDepositProductsProductIdPeriodType periodTypesItem) {
    if (this.periodTypes == null) {
      this.periodTypes = new ArrayList<GetRecurringDepositProductsProductIdPeriodType>();
    }
    this.periodTypes.add(periodTypesItem);
    return this;
  }

   /**
   * Get periodTypes
   * @return periodTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<GetRecurringDepositProductsProductIdPeriodType> getPeriodTypes() {
    return periodTypes;
  }


  public void setPeriodTypes(List<GetRecurringDepositProductsProductIdPeriodType> periodTypes) {
    this.periodTypes = periodTypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetRecurringDepositProductsProductIdActiveChart getRecurringDepositProductsProductIdActiveChart = (GetRecurringDepositProductsProductIdActiveChart) o;
    return Objects.equals(this.id, getRecurringDepositProductsProductIdActiveChart.id) &&
        Objects.equals(this.fromDate, getRecurringDepositProductsProductIdActiveChart.fromDate) &&
        Objects.equals(this.savingsProductId, getRecurringDepositProductsProductIdActiveChart.savingsProductId) &&
        Objects.equals(this.savingsProductName, getRecurringDepositProductsProductIdActiveChart.savingsProductName) &&
        Objects.equals(this.chartSlabs, getRecurringDepositProductsProductIdActiveChart.chartSlabs) &&
        Objects.equals(this.periodTypes, getRecurringDepositProductsProductIdActiveChart.periodTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, fromDate, savingsProductId, savingsProductName, chartSlabs, periodTypes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRecurringDepositProductsProductIdActiveChart {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    fromDate: ").append(toIndentedString(fromDate)).append("\n");
    sb.append("    savingsProductId: ").append(toIndentedString(savingsProductId)).append("\n");
    sb.append("    savingsProductName: ").append(toIndentedString(savingsProductName)).append("\n");
    sb.append("    chartSlabs: ").append(toIndentedString(chartSlabs)).append("\n");
    sb.append("    periodTypes: ").append(toIndentedString(periodTypes)).append("\n");
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

