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
import org.apache.fineract.client.models.GetFixedDepositAccountsAccountChart;
import org.apache.fineract.client.models.GetFixedDepositAccountsAccountIdCurrency;
import org.apache.fineract.client.models.GetFixedDepositAccountsAccountIdSummary;
import org.apache.fineract.client.models.GetFixedDepositAccountsDepositPeriodFrequency;
import org.apache.fineract.client.models.GetFixedDepositAccountsInterestCalculationDaysInYearType;
import org.apache.fineract.client.models.GetFixedDepositAccountsInterestCalculationType;
import org.apache.fineract.client.models.GetFixedDepositAccountsInterestCompoundingPeriodType;
import org.apache.fineract.client.models.GetFixedDepositAccountsInterestPostingPeriodType;
import org.apache.fineract.client.models.GetFixedDepositAccountsMaxDepositTermType;
import org.apache.fineract.client.models.GetFixedDepositAccountsMinDepositTermType;
import org.apache.fineract.client.models.GetFixedDepositAccountsStatus;
import org.apache.fineract.client.models.GetFixedDepositAccountsTimeline;

/**
 * GetFixedDepositAccountsAccountIdResponse
 */
@ApiModel(description = "GetFixedDepositAccountsAccountIdResponse")

public class GetFixedDepositAccountsAccountIdResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_ACCOUNT_NO = "accountNo";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NO)
  private Long accountNo;

  public static final String SERIALIZED_NAME_EXTERNAL_ID = "externalId";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ID)
  private String externalId;

  public static final String SERIALIZED_NAME_CLIENT_ID = "clientId";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private Integer clientId;

  public static final String SERIALIZED_NAME_CLIENT_NAME = "clientName";
  @SerializedName(SERIALIZED_NAME_CLIENT_NAME)
  private String clientName;

  public static final String SERIALIZED_NAME_SAVINGS_PRODUCT_ID = "savingsProductId";
  @SerializedName(SERIALIZED_NAME_SAVINGS_PRODUCT_ID)
  private Integer savingsProductId;

  public static final String SERIALIZED_NAME_SAVINGS_PRODUCT_NAME = "savingsProductName";
  @SerializedName(SERIALIZED_NAME_SAVINGS_PRODUCT_NAME)
  private String savingsProductName;

  public static final String SERIALIZED_NAME_FIELD_OFFICER_ID = "fieldOfficerId";
  @SerializedName(SERIALIZED_NAME_FIELD_OFFICER_ID)
  private Integer fieldOfficerId;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private GetFixedDepositAccountsStatus status;

  public static final String SERIALIZED_NAME_TIMELINE = "timeline";
  @SerializedName(SERIALIZED_NAME_TIMELINE)
  private GetFixedDepositAccountsTimeline timeline;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private GetFixedDepositAccountsAccountIdCurrency currency;

  public static final String SERIALIZED_NAME_INTEREST_COMPOUNDING_PERIOD_TYPE = "interestCompoundingPeriodType";
  @SerializedName(SERIALIZED_NAME_INTEREST_COMPOUNDING_PERIOD_TYPE)
  private GetFixedDepositAccountsInterestCompoundingPeriodType interestCompoundingPeriodType;

  public static final String SERIALIZED_NAME_INTEREST_POSTING_PERIOD_TYPE = "interestPostingPeriodType";
  @SerializedName(SERIALIZED_NAME_INTEREST_POSTING_PERIOD_TYPE)
  private GetFixedDepositAccountsInterestPostingPeriodType interestPostingPeriodType;

  public static final String SERIALIZED_NAME_INTEREST_CALCULATION_TYPE = "interestCalculationType";
  @SerializedName(SERIALIZED_NAME_INTEREST_CALCULATION_TYPE)
  private GetFixedDepositAccountsInterestCalculationType interestCalculationType;

  public static final String SERIALIZED_NAME_INTEREST_CALCULATION_DAYS_IN_YEAR_TYPE = "interestCalculationDaysInYearType";
  @SerializedName(SERIALIZED_NAME_INTEREST_CALCULATION_DAYS_IN_YEAR_TYPE)
  private GetFixedDepositAccountsInterestCalculationDaysInYearType interestCalculationDaysInYearType;

  public static final String SERIALIZED_NAME_INTEREST_FREE_PERIOD_APPLICABLE = "interestFreePeriodApplicable";
  @SerializedName(SERIALIZED_NAME_INTEREST_FREE_PERIOD_APPLICABLE)
  private Boolean interestFreePeriodApplicable;

  public static final String SERIALIZED_NAME_PRE_CLOSURE_PENAL_APPLICABLE = "preClosurePenalApplicable";
  @SerializedName(SERIALIZED_NAME_PRE_CLOSURE_PENAL_APPLICABLE)
  private Boolean preClosurePenalApplicable;

  public static final String SERIALIZED_NAME_MIN_DEPOSIT_TERM = "minDepositTerm";
  @SerializedName(SERIALIZED_NAME_MIN_DEPOSIT_TERM)
  private Integer minDepositTerm;

  public static final String SERIALIZED_NAME_MAX_DEPOSIT_TERM = "maxDepositTerm";
  @SerializedName(SERIALIZED_NAME_MAX_DEPOSIT_TERM)
  private Integer maxDepositTerm;

  public static final String SERIALIZED_NAME_MIN_DEPOSIT_TERM_TYPE = "minDepositTermType";
  @SerializedName(SERIALIZED_NAME_MIN_DEPOSIT_TERM_TYPE)
  private GetFixedDepositAccountsMinDepositTermType minDepositTermType;

  public static final String SERIALIZED_NAME_MAX_DEPOSIT_TERM_TYPE = "maxDepositTermType";
  @SerializedName(SERIALIZED_NAME_MAX_DEPOSIT_TERM_TYPE)
  private GetFixedDepositAccountsMaxDepositTermType maxDepositTermType;

  public static final String SERIALIZED_NAME_DEPOSIT_AMOUNT = "depositAmount";
  @SerializedName(SERIALIZED_NAME_DEPOSIT_AMOUNT)
  private Float depositAmount;

  public static final String SERIALIZED_NAME_MATURITY_AMOUNT = "maturityAmount";
  @SerializedName(SERIALIZED_NAME_MATURITY_AMOUNT)
  private Float maturityAmount;

  public static final String SERIALIZED_NAME_MATURITY_DATE = "maturityDate";
  @SerializedName(SERIALIZED_NAME_MATURITY_DATE)
  private Date maturityDate;

  public static final String SERIALIZED_NAME_DEPOSIT_PERIOD = "depositPeriod";
  @SerializedName(SERIALIZED_NAME_DEPOSIT_PERIOD)
  private Integer depositPeriod;

  public static final String SERIALIZED_NAME_DEPOSIT_PERIOD_FREQUENCY = "depositPeriodFrequency";
  @SerializedName(SERIALIZED_NAME_DEPOSIT_PERIOD_FREQUENCY)
  private GetFixedDepositAccountsDepositPeriodFrequency depositPeriodFrequency;

  public static final String SERIALIZED_NAME_SUMMARY = "summary";
  @SerializedName(SERIALIZED_NAME_SUMMARY)
  private GetFixedDepositAccountsAccountIdSummary summary;

  public static final String SERIALIZED_NAME_ACCOUNT_CHART = "accountChart";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_CHART)
  private GetFixedDepositAccountsAccountChart accountChart;


  public GetFixedDepositAccountsAccountIdResponse id(Integer id) {
    
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


  public GetFixedDepositAccountsAccountIdResponse accountNo(Long accountNo) {
    
    this.accountNo = accountNo;
    return this;
  }

   /**
   * Get accountNo
   * @return accountNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getAccountNo() {
    return accountNo;
  }


  public void setAccountNo(Long accountNo) {
    this.accountNo = accountNo;
  }


  public GetFixedDepositAccountsAccountIdResponse externalId(String externalId) {
    
    this.externalId = externalId;
    return this;
  }

   /**
   * Get externalId
   * @return externalId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "FD-23", value = "")

  public String getExternalId() {
    return externalId;
  }


  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }


  public GetFixedDepositAccountsAccountIdResponse clientId(Integer clientId) {
    
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


  public GetFixedDepositAccountsAccountIdResponse clientName(String clientName) {
    
    this.clientName = clientName;
    return this;
  }

   /**
   * Get clientName
   * @return clientName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Sangamesh N", value = "")

  public String getClientName() {
    return clientName;
  }


  public void setClientName(String clientName) {
    this.clientName = clientName;
  }


  public GetFixedDepositAccountsAccountIdResponse savingsProductId(Integer savingsProductId) {
    
    this.savingsProductId = savingsProductId;
    return this;
  }

   /**
   * Get savingsProductId
   * @return savingsProductId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3", value = "")

  public Integer getSavingsProductId() {
    return savingsProductId;
  }


  public void setSavingsProductId(Integer savingsProductId) {
    this.savingsProductId = savingsProductId;
  }


  public GetFixedDepositAccountsAccountIdResponse savingsProductName(String savingsProductName) {
    
    this.savingsProductName = savingsProductName;
    return this;
  }

   /**
   * Get savingsProductName
   * @return savingsProductName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "FD01", value = "")

  public String getSavingsProductName() {
    return savingsProductName;
  }


  public void setSavingsProductName(String savingsProductName) {
    this.savingsProductName = savingsProductName;
  }


  public GetFixedDepositAccountsAccountIdResponse fieldOfficerId(Integer fieldOfficerId) {
    
    this.fieldOfficerId = fieldOfficerId;
    return this;
  }

   /**
   * Get fieldOfficerId
   * @return fieldOfficerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public Integer getFieldOfficerId() {
    return fieldOfficerId;
  }


  public void setFieldOfficerId(Integer fieldOfficerId) {
    this.fieldOfficerId = fieldOfficerId;
  }


  public GetFixedDepositAccountsAccountIdResponse status(GetFixedDepositAccountsStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetFixedDepositAccountsStatus getStatus() {
    return status;
  }


  public void setStatus(GetFixedDepositAccountsStatus status) {
    this.status = status;
  }


  public GetFixedDepositAccountsAccountIdResponse timeline(GetFixedDepositAccountsTimeline timeline) {
    
    this.timeline = timeline;
    return this;
  }

   /**
   * Get timeline
   * @return timeline
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetFixedDepositAccountsTimeline getTimeline() {
    return timeline;
  }


  public void setTimeline(GetFixedDepositAccountsTimeline timeline) {
    this.timeline = timeline;
  }


  public GetFixedDepositAccountsAccountIdResponse currency(GetFixedDepositAccountsAccountIdCurrency currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetFixedDepositAccountsAccountIdCurrency getCurrency() {
    return currency;
  }


  public void setCurrency(GetFixedDepositAccountsAccountIdCurrency currency) {
    this.currency = currency;
  }


  public GetFixedDepositAccountsAccountIdResponse interestCompoundingPeriodType(GetFixedDepositAccountsInterestCompoundingPeriodType interestCompoundingPeriodType) {
    
    this.interestCompoundingPeriodType = interestCompoundingPeriodType;
    return this;
  }

   /**
   * Get interestCompoundingPeriodType
   * @return interestCompoundingPeriodType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetFixedDepositAccountsInterestCompoundingPeriodType getInterestCompoundingPeriodType() {
    return interestCompoundingPeriodType;
  }


  public void setInterestCompoundingPeriodType(GetFixedDepositAccountsInterestCompoundingPeriodType interestCompoundingPeriodType) {
    this.interestCompoundingPeriodType = interestCompoundingPeriodType;
  }


  public GetFixedDepositAccountsAccountIdResponse interestPostingPeriodType(GetFixedDepositAccountsInterestPostingPeriodType interestPostingPeriodType) {
    
    this.interestPostingPeriodType = interestPostingPeriodType;
    return this;
  }

   /**
   * Get interestPostingPeriodType
   * @return interestPostingPeriodType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetFixedDepositAccountsInterestPostingPeriodType getInterestPostingPeriodType() {
    return interestPostingPeriodType;
  }


  public void setInterestPostingPeriodType(GetFixedDepositAccountsInterestPostingPeriodType interestPostingPeriodType) {
    this.interestPostingPeriodType = interestPostingPeriodType;
  }


  public GetFixedDepositAccountsAccountIdResponse interestCalculationType(GetFixedDepositAccountsInterestCalculationType interestCalculationType) {
    
    this.interestCalculationType = interestCalculationType;
    return this;
  }

   /**
   * Get interestCalculationType
   * @return interestCalculationType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetFixedDepositAccountsInterestCalculationType getInterestCalculationType() {
    return interestCalculationType;
  }


  public void setInterestCalculationType(GetFixedDepositAccountsInterestCalculationType interestCalculationType) {
    this.interestCalculationType = interestCalculationType;
  }


  public GetFixedDepositAccountsAccountIdResponse interestCalculationDaysInYearType(GetFixedDepositAccountsInterestCalculationDaysInYearType interestCalculationDaysInYearType) {
    
    this.interestCalculationDaysInYearType = interestCalculationDaysInYearType;
    return this;
  }

   /**
   * Get interestCalculationDaysInYearType
   * @return interestCalculationDaysInYearType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetFixedDepositAccountsInterestCalculationDaysInYearType getInterestCalculationDaysInYearType() {
    return interestCalculationDaysInYearType;
  }


  public void setInterestCalculationDaysInYearType(GetFixedDepositAccountsInterestCalculationDaysInYearType interestCalculationDaysInYearType) {
    this.interestCalculationDaysInYearType = interestCalculationDaysInYearType;
  }


  public GetFixedDepositAccountsAccountIdResponse interestFreePeriodApplicable(Boolean interestFreePeriodApplicable) {
    
    this.interestFreePeriodApplicable = interestFreePeriodApplicable;
    return this;
  }

   /**
   * Get interestFreePeriodApplicable
   * @return interestFreePeriodApplicable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getInterestFreePeriodApplicable() {
    return interestFreePeriodApplicable;
  }


  public void setInterestFreePeriodApplicable(Boolean interestFreePeriodApplicable) {
    this.interestFreePeriodApplicable = interestFreePeriodApplicable;
  }


  public GetFixedDepositAccountsAccountIdResponse preClosurePenalApplicable(Boolean preClosurePenalApplicable) {
    
    this.preClosurePenalApplicable = preClosurePenalApplicable;
    return this;
  }

   /**
   * Get preClosurePenalApplicable
   * @return preClosurePenalApplicable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getPreClosurePenalApplicable() {
    return preClosurePenalApplicable;
  }


  public void setPreClosurePenalApplicable(Boolean preClosurePenalApplicable) {
    this.preClosurePenalApplicable = preClosurePenalApplicable;
  }


  public GetFixedDepositAccountsAccountIdResponse minDepositTerm(Integer minDepositTerm) {
    
    this.minDepositTerm = minDepositTerm;
    return this;
  }

   /**
   * Get minDepositTerm
   * @return minDepositTerm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3", value = "")

  public Integer getMinDepositTerm() {
    return minDepositTerm;
  }


  public void setMinDepositTerm(Integer minDepositTerm) {
    this.minDepositTerm = minDepositTerm;
  }


  public GetFixedDepositAccountsAccountIdResponse maxDepositTerm(Integer maxDepositTerm) {
    
    this.maxDepositTerm = maxDepositTerm;
    return this;
  }

   /**
   * Get maxDepositTerm
   * @return maxDepositTerm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4", value = "")

  public Integer getMaxDepositTerm() {
    return maxDepositTerm;
  }


  public void setMaxDepositTerm(Integer maxDepositTerm) {
    this.maxDepositTerm = maxDepositTerm;
  }


  public GetFixedDepositAccountsAccountIdResponse minDepositTermType(GetFixedDepositAccountsMinDepositTermType minDepositTermType) {
    
    this.minDepositTermType = minDepositTermType;
    return this;
  }

   /**
   * Get minDepositTermType
   * @return minDepositTermType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetFixedDepositAccountsMinDepositTermType getMinDepositTermType() {
    return minDepositTermType;
  }


  public void setMinDepositTermType(GetFixedDepositAccountsMinDepositTermType minDepositTermType) {
    this.minDepositTermType = minDepositTermType;
  }


  public GetFixedDepositAccountsAccountIdResponse maxDepositTermType(GetFixedDepositAccountsMaxDepositTermType maxDepositTermType) {
    
    this.maxDepositTermType = maxDepositTermType;
    return this;
  }

   /**
   * Get maxDepositTermType
   * @return maxDepositTermType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetFixedDepositAccountsMaxDepositTermType getMaxDepositTermType() {
    return maxDepositTermType;
  }


  public void setMaxDepositTermType(GetFixedDepositAccountsMaxDepositTermType maxDepositTermType) {
    this.maxDepositTermType = maxDepositTermType;
  }


  public GetFixedDepositAccountsAccountIdResponse depositAmount(Float depositAmount) {
    
    this.depositAmount = depositAmount;
    return this;
  }

   /**
   * Get depositAmount
   * @return depositAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5000", value = "")

  public Float getDepositAmount() {
    return depositAmount;
  }


  public void setDepositAmount(Float depositAmount) {
    this.depositAmount = depositAmount;
  }


  public GetFixedDepositAccountsAccountIdResponse maturityAmount(Float maturityAmount) {
    
    this.maturityAmount = maturityAmount;
    return this;
  }

   /**
   * Get maturityAmount
   * @return maturityAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5140.25", value = "")

  public Float getMaturityAmount() {
    return maturityAmount;
  }


  public void setMaturityAmount(Float maturityAmount) {
    this.maturityAmount = maturityAmount;
  }


  public GetFixedDepositAccountsAccountIdResponse maturityDate(Date maturityDate) {
    
    this.maturityDate = maturityDate;
    return this;
  }

   /**
   * Get maturityDate
   * @return maturityDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Date getMaturityDate() {
    return maturityDate;
  }


  public void setMaturityDate(Date maturityDate) {
    this.maturityDate = maturityDate;
  }


  public GetFixedDepositAccountsAccountIdResponse depositPeriod(Integer depositPeriod) {
    
    this.depositPeriod = depositPeriod;
    return this;
  }

   /**
   * Get depositPeriod
   * @return depositPeriod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "6", value = "")

  public Integer getDepositPeriod() {
    return depositPeriod;
  }


  public void setDepositPeriod(Integer depositPeriod) {
    this.depositPeriod = depositPeriod;
  }


  public GetFixedDepositAccountsAccountIdResponse depositPeriodFrequency(GetFixedDepositAccountsDepositPeriodFrequency depositPeriodFrequency) {
    
    this.depositPeriodFrequency = depositPeriodFrequency;
    return this;
  }

   /**
   * Get depositPeriodFrequency
   * @return depositPeriodFrequency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetFixedDepositAccountsDepositPeriodFrequency getDepositPeriodFrequency() {
    return depositPeriodFrequency;
  }


  public void setDepositPeriodFrequency(GetFixedDepositAccountsDepositPeriodFrequency depositPeriodFrequency) {
    this.depositPeriodFrequency = depositPeriodFrequency;
  }


  public GetFixedDepositAccountsAccountIdResponse summary(GetFixedDepositAccountsAccountIdSummary summary) {
    
    this.summary = summary;
    return this;
  }

   /**
   * Get summary
   * @return summary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetFixedDepositAccountsAccountIdSummary getSummary() {
    return summary;
  }


  public void setSummary(GetFixedDepositAccountsAccountIdSummary summary) {
    this.summary = summary;
  }


  public GetFixedDepositAccountsAccountIdResponse accountChart(GetFixedDepositAccountsAccountChart accountChart) {
    
    this.accountChart = accountChart;
    return this;
  }

   /**
   * Get accountChart
   * @return accountChart
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GetFixedDepositAccountsAccountChart getAccountChart() {
    return accountChart;
  }


  public void setAccountChart(GetFixedDepositAccountsAccountChart accountChart) {
    this.accountChart = accountChart;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetFixedDepositAccountsAccountIdResponse getFixedDepositAccountsAccountIdResponse = (GetFixedDepositAccountsAccountIdResponse) o;
    return Objects.equals(this.id, getFixedDepositAccountsAccountIdResponse.id) &&
        Objects.equals(this.accountNo, getFixedDepositAccountsAccountIdResponse.accountNo) &&
        Objects.equals(this.externalId, getFixedDepositAccountsAccountIdResponse.externalId) &&
        Objects.equals(this.clientId, getFixedDepositAccountsAccountIdResponse.clientId) &&
        Objects.equals(this.clientName, getFixedDepositAccountsAccountIdResponse.clientName) &&
        Objects.equals(this.savingsProductId, getFixedDepositAccountsAccountIdResponse.savingsProductId) &&
        Objects.equals(this.savingsProductName, getFixedDepositAccountsAccountIdResponse.savingsProductName) &&
        Objects.equals(this.fieldOfficerId, getFixedDepositAccountsAccountIdResponse.fieldOfficerId) &&
        Objects.equals(this.status, getFixedDepositAccountsAccountIdResponse.status) &&
        Objects.equals(this.timeline, getFixedDepositAccountsAccountIdResponse.timeline) &&
        Objects.equals(this.currency, getFixedDepositAccountsAccountIdResponse.currency) &&
        Objects.equals(this.interestCompoundingPeriodType, getFixedDepositAccountsAccountIdResponse.interestCompoundingPeriodType) &&
        Objects.equals(this.interestPostingPeriodType, getFixedDepositAccountsAccountIdResponse.interestPostingPeriodType) &&
        Objects.equals(this.interestCalculationType, getFixedDepositAccountsAccountIdResponse.interestCalculationType) &&
        Objects.equals(this.interestCalculationDaysInYearType, getFixedDepositAccountsAccountIdResponse.interestCalculationDaysInYearType) &&
        Objects.equals(this.interestFreePeriodApplicable, getFixedDepositAccountsAccountIdResponse.interestFreePeriodApplicable) &&
        Objects.equals(this.preClosurePenalApplicable, getFixedDepositAccountsAccountIdResponse.preClosurePenalApplicable) &&
        Objects.equals(this.minDepositTerm, getFixedDepositAccountsAccountIdResponse.minDepositTerm) &&
        Objects.equals(this.maxDepositTerm, getFixedDepositAccountsAccountIdResponse.maxDepositTerm) &&
        Objects.equals(this.minDepositTermType, getFixedDepositAccountsAccountIdResponse.minDepositTermType) &&
        Objects.equals(this.maxDepositTermType, getFixedDepositAccountsAccountIdResponse.maxDepositTermType) &&
        Objects.equals(this.depositAmount, getFixedDepositAccountsAccountIdResponse.depositAmount) &&
        Objects.equals(this.maturityAmount, getFixedDepositAccountsAccountIdResponse.maturityAmount) &&
        Objects.equals(this.maturityDate, getFixedDepositAccountsAccountIdResponse.maturityDate) &&
        Objects.equals(this.depositPeriod, getFixedDepositAccountsAccountIdResponse.depositPeriod) &&
        Objects.equals(this.depositPeriodFrequency, getFixedDepositAccountsAccountIdResponse.depositPeriodFrequency) &&
        Objects.equals(this.summary, getFixedDepositAccountsAccountIdResponse.summary) &&
        Objects.equals(this.accountChart, getFixedDepositAccountsAccountIdResponse.accountChart);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, accountNo, externalId, clientId, clientName, savingsProductId, savingsProductName, fieldOfficerId, status, timeline, currency, interestCompoundingPeriodType, interestPostingPeriodType, interestCalculationType, interestCalculationDaysInYearType, interestFreePeriodApplicable, preClosurePenalApplicable, minDepositTerm, maxDepositTerm, minDepositTermType, maxDepositTermType, depositAmount, maturityAmount, maturityDate, depositPeriod, depositPeriodFrequency, summary, accountChart);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFixedDepositAccountsAccountIdResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    accountNo: ").append(toIndentedString(accountNo)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientName: ").append(toIndentedString(clientName)).append("\n");
    sb.append("    savingsProductId: ").append(toIndentedString(savingsProductId)).append("\n");
    sb.append("    savingsProductName: ").append(toIndentedString(savingsProductName)).append("\n");
    sb.append("    fieldOfficerId: ").append(toIndentedString(fieldOfficerId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    timeline: ").append(toIndentedString(timeline)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    interestCompoundingPeriodType: ").append(toIndentedString(interestCompoundingPeriodType)).append("\n");
    sb.append("    interestPostingPeriodType: ").append(toIndentedString(interestPostingPeriodType)).append("\n");
    sb.append("    interestCalculationType: ").append(toIndentedString(interestCalculationType)).append("\n");
    sb.append("    interestCalculationDaysInYearType: ").append(toIndentedString(interestCalculationDaysInYearType)).append("\n");
    sb.append("    interestFreePeriodApplicable: ").append(toIndentedString(interestFreePeriodApplicable)).append("\n");
    sb.append("    preClosurePenalApplicable: ").append(toIndentedString(preClosurePenalApplicable)).append("\n");
    sb.append("    minDepositTerm: ").append(toIndentedString(minDepositTerm)).append("\n");
    sb.append("    maxDepositTerm: ").append(toIndentedString(maxDepositTerm)).append("\n");
    sb.append("    minDepositTermType: ").append(toIndentedString(minDepositTermType)).append("\n");
    sb.append("    maxDepositTermType: ").append(toIndentedString(maxDepositTermType)).append("\n");
    sb.append("    depositAmount: ").append(toIndentedString(depositAmount)).append("\n");
    sb.append("    maturityAmount: ").append(toIndentedString(maturityAmount)).append("\n");
    sb.append("    maturityDate: ").append(toIndentedString(maturityDate)).append("\n");
    sb.append("    depositPeriod: ").append(toIndentedString(depositPeriod)).append("\n");
    sb.append("    depositPeriodFrequency: ").append(toIndentedString(depositPeriodFrequency)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    accountChart: ").append(toIndentedString(accountChart)).append("\n");
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

