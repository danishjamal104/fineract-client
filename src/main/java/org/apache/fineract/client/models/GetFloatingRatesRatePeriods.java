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
 * GetFloatingRatesRatePeriods
 */

public class GetFloatingRatesRatePeriods {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_FROM_DATE = "fromDate";
  @SerializedName(SERIALIZED_NAME_FROM_DATE)
  private String fromDate;

  public static final String SERIALIZED_NAME_INTEREST_RATE = "interestRate";
  @SerializedName(SERIALIZED_NAME_INTEREST_RATE)
  private Double interestRate;

  public static final String SERIALIZED_NAME_IS_DIFFERENTIAL_TO_BASE_LENDING_RATE = "isDifferentialToBaseLendingRate";
  @SerializedName(SERIALIZED_NAME_IS_DIFFERENTIAL_TO_BASE_LENDING_RATE)
  private Boolean isDifferentialToBaseLendingRate;

  public static final String SERIALIZED_NAME_IS_ACTIVE = "isActive";
  @SerializedName(SERIALIZED_NAME_IS_ACTIVE)
  private Boolean isActive;

  public static final String SERIALIZED_NAME_CREATED_BY = "createdBy";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private String createdBy;

  public static final String SERIALIZED_NAME_CREATED_ON = "createdOn";
  @SerializedName(SERIALIZED_NAME_CREATED_ON)
  private String createdOn;

  public static final String SERIALIZED_NAME_MODIFIED_BY = "modifiedBy";
  @SerializedName(SERIALIZED_NAME_MODIFIED_BY)
  private String modifiedBy;

  public static final String SERIALIZED_NAME_MODIFIED_ON = "modifiedOn";
  @SerializedName(SERIALIZED_NAME_MODIFIED_ON)
  private String modifiedOn;


  public GetFloatingRatesRatePeriods id(Integer id) {
    
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


  public GetFloatingRatesRatePeriods fromDate(String fromDate) {
    
    this.fromDate = fromDate;
    return this;
  }

   /**
   * Get fromDate
   * @return fromDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Dec 15, 2015", value = "")

  public String getFromDate() {
    return fromDate;
  }


  public void setFromDate(String fromDate) {
    this.fromDate = fromDate;
  }


  public GetFloatingRatesRatePeriods interestRate(Double interestRate) {
    
    this.interestRate = interestRate;
    return this;
  }

   /**
   * Get interestRate
   * @return interestRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "11", value = "")

  public Double getInterestRate() {
    return interestRate;
  }


  public void setInterestRate(Double interestRate) {
    this.interestRate = interestRate;
  }


  public GetFloatingRatesRatePeriods isDifferentialToBaseLendingRate(Boolean isDifferentialToBaseLendingRate) {
    
    this.isDifferentialToBaseLendingRate = isDifferentialToBaseLendingRate;
    return this;
  }

   /**
   * Get isDifferentialToBaseLendingRate
   * @return isDifferentialToBaseLendingRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getIsDifferentialToBaseLendingRate() {
    return isDifferentialToBaseLendingRate;
  }


  public void setIsDifferentialToBaseLendingRate(Boolean isDifferentialToBaseLendingRate) {
    this.isDifferentialToBaseLendingRate = isDifferentialToBaseLendingRate;
  }


  public GetFloatingRatesRatePeriods isActive(Boolean isActive) {
    
    this.isActive = isActive;
    return this;
  }

   /**
   * Get isActive
   * @return isActive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getIsActive() {
    return isActive;
  }


  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }


  public GetFloatingRatesRatePeriods createdBy(String createdBy) {
    
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "mifos", value = "")

  public String getCreatedBy() {
    return createdBy;
  }


  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }


  public GetFloatingRatesRatePeriods createdOn(String createdOn) {
    
    this.createdOn = createdOn;
    return this;
  }

   /**
   * Get createdOn
   * @return createdOn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Nov 18, 2015", value = "")

  public String getCreatedOn() {
    return createdOn;
  }


  public void setCreatedOn(String createdOn) {
    this.createdOn = createdOn;
  }


  public GetFloatingRatesRatePeriods modifiedBy(String modifiedBy) {
    
    this.modifiedBy = modifiedBy;
    return this;
  }

   /**
   * Get modifiedBy
   * @return modifiedBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "mifos", value = "")

  public String getModifiedBy() {
    return modifiedBy;
  }


  public void setModifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
  }


  public GetFloatingRatesRatePeriods modifiedOn(String modifiedOn) {
    
    this.modifiedOn = modifiedOn;
    return this;
  }

   /**
   * Get modifiedOn
   * @return modifiedOn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Nov 18, 2015", value = "")

  public String getModifiedOn() {
    return modifiedOn;
  }


  public void setModifiedOn(String modifiedOn) {
    this.modifiedOn = modifiedOn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetFloatingRatesRatePeriods getFloatingRatesRatePeriods = (GetFloatingRatesRatePeriods) o;
    return Objects.equals(this.id, getFloatingRatesRatePeriods.id) &&
        Objects.equals(this.fromDate, getFloatingRatesRatePeriods.fromDate) &&
        Objects.equals(this.interestRate, getFloatingRatesRatePeriods.interestRate) &&
        Objects.equals(this.isDifferentialToBaseLendingRate, getFloatingRatesRatePeriods.isDifferentialToBaseLendingRate) &&
        Objects.equals(this.isActive, getFloatingRatesRatePeriods.isActive) &&
        Objects.equals(this.createdBy, getFloatingRatesRatePeriods.createdBy) &&
        Objects.equals(this.createdOn, getFloatingRatesRatePeriods.createdOn) &&
        Objects.equals(this.modifiedBy, getFloatingRatesRatePeriods.modifiedBy) &&
        Objects.equals(this.modifiedOn, getFloatingRatesRatePeriods.modifiedOn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, fromDate, interestRate, isDifferentialToBaseLendingRate, isActive, createdBy, createdOn, modifiedBy, modifiedOn);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFloatingRatesRatePeriods {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    fromDate: ").append(toIndentedString(fromDate)).append("\n");
    sb.append("    interestRate: ").append(toIndentedString(interestRate)).append("\n");
    sb.append("    isDifferentialToBaseLendingRate: ").append(toIndentedString(isDifferentialToBaseLendingRate)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    modifiedOn: ").append(toIndentedString(modifiedOn)).append("\n");
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

