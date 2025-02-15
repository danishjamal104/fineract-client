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
 * The version of the OpenAPI document: 1.5.0-39-gc7b9611-dirty
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
 * PostLoanProductsRequest
 */
@ApiModel(description = "PostLoanProductsRequest")

public class PostLoanProductsRequest {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SHORT_NAME = "shortName";
  @SerializedName(SERIALIZED_NAME_SHORT_NAME)
  private String shortName;

  public static final String SERIALIZED_NAME_CURRENCY_CODE = "currencyCode";
  @SerializedName(SERIALIZED_NAME_CURRENCY_CODE)
  private String currencyCode;

  public static final String SERIALIZED_NAME_LOCALE = "locale";
  @SerializedName(SERIALIZED_NAME_LOCALE)
  private String locale;

  public static final String SERIALIZED_NAME_DIGITS_AFTER_DECIMAL = "digitsAfterDecimal";
  @SerializedName(SERIALIZED_NAME_DIGITS_AFTER_DECIMAL)
  private Integer digitsAfterDecimal;

  public static final String SERIALIZED_NAME_IN_MULTIPLES_OF = "inMultiplesOf";
  @SerializedName(SERIALIZED_NAME_IN_MULTIPLES_OF)
  private Integer inMultiplesOf;

  public static final String SERIALIZED_NAME_PRINCIPAL = "principal";
  @SerializedName(SERIALIZED_NAME_PRINCIPAL)
  private Double principal;

  public static final String SERIALIZED_NAME_NUMBER_OF_REPAYMENTS = "numberOfRepayments";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_REPAYMENTS)
  private Integer numberOfRepayments;

  public static final String SERIALIZED_NAME_REPAYMENT_EVERY = "repaymentEvery";
  @SerializedName(SERIALIZED_NAME_REPAYMENT_EVERY)
  private Integer repaymentEvery;

  public static final String SERIALIZED_NAME_REPAYMENT_FREQUENCY_TYPE = "repaymentFrequencyType";
  @SerializedName(SERIALIZED_NAME_REPAYMENT_FREQUENCY_TYPE)
  private Integer repaymentFrequencyType;

  public static final String SERIALIZED_NAME_TRANSACTION_PROCESSING_STRATEGY_ID = "transactionProcessingStrategyId";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_PROCESSING_STRATEGY_ID)
  private Integer transactionProcessingStrategyId;

  public static final String SERIALIZED_NAME_INTEREST_RATE_PER_PERIOD = "interestRatePerPeriod";
  @SerializedName(SERIALIZED_NAME_INTEREST_RATE_PER_PERIOD)
  private Double interestRatePerPeriod;

  public static final String SERIALIZED_NAME_INTEREST_RATE_FREQUENCY_TYPE = "interestRateFrequencyType";
  @SerializedName(SERIALIZED_NAME_INTEREST_RATE_FREQUENCY_TYPE)
  private Integer interestRateFrequencyType;

  public static final String SERIALIZED_NAME_AMORTIZATION_TYPE = "amortizationType";
  @SerializedName(SERIALIZED_NAME_AMORTIZATION_TYPE)
  private Integer amortizationType;

  public static final String SERIALIZED_NAME_INTEREST_TYPE = "interestType";
  @SerializedName(SERIALIZED_NAME_INTEREST_TYPE)
  private Integer interestType;

  public static final String SERIALIZED_NAME_INTEREST_CALCULATION_PERIOD_TYPE = "interestCalculationPeriodType";
  @SerializedName(SERIALIZED_NAME_INTEREST_CALCULATION_PERIOD_TYPE)
  private Integer interestCalculationPeriodType;

  public static final String SERIALIZED_NAME_DAYS_IN_MONTH_TYPE = "daysInMonthType";
  @SerializedName(SERIALIZED_NAME_DAYS_IN_MONTH_TYPE)
  private Integer daysInMonthType;

  public static final String SERIALIZED_NAME_DAYS_IN_YEAR_TYPE = "daysInYearType";
  @SerializedName(SERIALIZED_NAME_DAYS_IN_YEAR_TYPE)
  private Integer daysInYearType;

  public static final String SERIALIZED_NAME_IS_INTEREST_RECALCULATION_ENABLED = "isInterestRecalculationEnabled";
  @SerializedName(SERIALIZED_NAME_IS_INTEREST_RECALCULATION_ENABLED)
  private Boolean isInterestRecalculationEnabled;

  public static final String SERIALIZED_NAME_ACCOUNTING_RULE = "accountingRule";
  @SerializedName(SERIALIZED_NAME_ACCOUNTING_RULE)
  private Integer accountingRule;

  public static final String SERIALIZED_NAME_FUND_SOURCE_ACCOUNT_ID = "fundSourceAccountId";
  @SerializedName(SERIALIZED_NAME_FUND_SOURCE_ACCOUNT_ID)
  private Integer fundSourceAccountId;

  public static final String SERIALIZED_NAME_LOAN_PORTFOLIO_ACCOUNT_ID = "loanPortfolioAccountId";
  @SerializedName(SERIALIZED_NAME_LOAN_PORTFOLIO_ACCOUNT_ID)
  private Integer loanPortfolioAccountId;

  public static final String SERIALIZED_NAME_RECEIVABLE_INTEREST_ACCOUNT_ID = "receivableInterestAccountId";
  @SerializedName(SERIALIZED_NAME_RECEIVABLE_INTEREST_ACCOUNT_ID)
  private Integer receivableInterestAccountId;

  public static final String SERIALIZED_NAME_RECEIVABLE_FEE_ACCOUNT_ID = "receivableFeeAccountId";
  @SerializedName(SERIALIZED_NAME_RECEIVABLE_FEE_ACCOUNT_ID)
  private Integer receivableFeeAccountId;

  public static final String SERIALIZED_NAME_RECEIVABLE_PENALTY_ACCOUNT_ID = "receivablePenaltyAccountId";
  @SerializedName(SERIALIZED_NAME_RECEIVABLE_PENALTY_ACCOUNT_ID)
  private Integer receivablePenaltyAccountId;

  public static final String SERIALIZED_NAME_INTEREST_ON_LOAN_ACCOUNT_ID = "interestOnLoanAccountId";
  @SerializedName(SERIALIZED_NAME_INTEREST_ON_LOAN_ACCOUNT_ID)
  private Integer interestOnLoanAccountId;

  public static final String SERIALIZED_NAME_INCOME_FROM_FEE_ACCOUNT_ID = "incomeFromFeeAccountId";
  @SerializedName(SERIALIZED_NAME_INCOME_FROM_FEE_ACCOUNT_ID)
  private Integer incomeFromFeeAccountId;

  public static final String SERIALIZED_NAME_INCOME_FROM_PENALTY_ACCOUNT_ID = "incomeFromPenaltyAccountId";
  @SerializedName(SERIALIZED_NAME_INCOME_FROM_PENALTY_ACCOUNT_ID)
  private Integer incomeFromPenaltyAccountId;

  public static final String SERIALIZED_NAME_OVERPAYMENT_LIABILITY_ACCOUNT_ID = "overpaymentLiabilityAccountId";
  @SerializedName(SERIALIZED_NAME_OVERPAYMENT_LIABILITY_ACCOUNT_ID)
  private Integer overpaymentLiabilityAccountId;

  public static final String SERIALIZED_NAME_WRITE_OFF_ACCOUNT_ID = "writeOffAccountId";
  @SerializedName(SERIALIZED_NAME_WRITE_OFF_ACCOUNT_ID)
  private Integer writeOffAccountId;


  public PostLoanProductsRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "LP Accrual Accounting", value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public PostLoanProductsRequest shortName(String shortName) {
    
    this.shortName = shortName;
    return this;
  }

   /**
   * Get shortName
   * @return shortName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "LPAA", value = "")

  public String getShortName() {
    return shortName;
  }


  public void setShortName(String shortName) {
    this.shortName = shortName;
  }


  public PostLoanProductsRequest currencyCode(String currencyCode) {
    
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Get currencyCode
   * @return currencyCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "USD", value = "")

  public String getCurrencyCode() {
    return currencyCode;
  }


  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }


  public PostLoanProductsRequest locale(String locale) {
    
    this.locale = locale;
    return this;
  }

   /**
   * Get locale
   * @return locale
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "en_GB", value = "")

  public String getLocale() {
    return locale;
  }


  public void setLocale(String locale) {
    this.locale = locale;
  }


  public PostLoanProductsRequest digitsAfterDecimal(Integer digitsAfterDecimal) {
    
    this.digitsAfterDecimal = digitsAfterDecimal;
    return this;
  }

   /**
   * Get digitsAfterDecimal
   * @return digitsAfterDecimal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "")

  public Integer getDigitsAfterDecimal() {
    return digitsAfterDecimal;
  }


  public void setDigitsAfterDecimal(Integer digitsAfterDecimal) {
    this.digitsAfterDecimal = digitsAfterDecimal;
  }


  public PostLoanProductsRequest inMultiplesOf(Integer inMultiplesOf) {
    
    this.inMultiplesOf = inMultiplesOf;
    return this;
  }

   /**
   * Get inMultiplesOf
   * @return inMultiplesOf
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public Integer getInMultiplesOf() {
    return inMultiplesOf;
  }


  public void setInMultiplesOf(Integer inMultiplesOf) {
    this.inMultiplesOf = inMultiplesOf;
  }


  public PostLoanProductsRequest principal(Double principal) {
    
    this.principal = principal;
    return this;
  }

   /**
   * Get principal
   * @return principal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getPrincipal() {
    return principal;
  }


  public void setPrincipal(Double principal) {
    this.principal = principal;
  }


  public PostLoanProductsRequest numberOfRepayments(Integer numberOfRepayments) {
    
    this.numberOfRepayments = numberOfRepayments;
    return this;
  }

   /**
   * Get numberOfRepayments
   * @return numberOfRepayments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12", value = "")

  public Integer getNumberOfRepayments() {
    return numberOfRepayments;
  }


  public void setNumberOfRepayments(Integer numberOfRepayments) {
    this.numberOfRepayments = numberOfRepayments;
  }


  public PostLoanProductsRequest repaymentEvery(Integer repaymentEvery) {
    
    this.repaymentEvery = repaymentEvery;
    return this;
  }

   /**
   * Get repaymentEvery
   * @return repaymentEvery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getRepaymentEvery() {
    return repaymentEvery;
  }


  public void setRepaymentEvery(Integer repaymentEvery) {
    this.repaymentEvery = repaymentEvery;
  }


  public PostLoanProductsRequest repaymentFrequencyType(Integer repaymentFrequencyType) {
    
    this.repaymentFrequencyType = repaymentFrequencyType;
    return this;
  }

   /**
   * Get repaymentFrequencyType
   * @return repaymentFrequencyType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "")

  public Integer getRepaymentFrequencyType() {
    return repaymentFrequencyType;
  }


  public void setRepaymentFrequencyType(Integer repaymentFrequencyType) {
    this.repaymentFrequencyType = repaymentFrequencyType;
  }


  public PostLoanProductsRequest transactionProcessingStrategyId(Integer transactionProcessingStrategyId) {
    
    this.transactionProcessingStrategyId = transactionProcessingStrategyId;
    return this;
  }

   /**
   * Get transactionProcessingStrategyId
   * @return transactionProcessingStrategyId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getTransactionProcessingStrategyId() {
    return transactionProcessingStrategyId;
  }


  public void setTransactionProcessingStrategyId(Integer transactionProcessingStrategyId) {
    this.transactionProcessingStrategyId = transactionProcessingStrategyId;
  }


  public PostLoanProductsRequest interestRatePerPeriod(Double interestRatePerPeriod) {
    
    this.interestRatePerPeriod = interestRatePerPeriod;
    return this;
  }

   /**
   * Get interestRatePerPeriod
   * @return interestRatePerPeriod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1.75", value = "")

  public Double getInterestRatePerPeriod() {
    return interestRatePerPeriod;
  }


  public void setInterestRatePerPeriod(Double interestRatePerPeriod) {
    this.interestRatePerPeriod = interestRatePerPeriod;
  }


  public PostLoanProductsRequest interestRateFrequencyType(Integer interestRateFrequencyType) {
    
    this.interestRateFrequencyType = interestRateFrequencyType;
    return this;
  }

   /**
   * Get interestRateFrequencyType
   * @return interestRateFrequencyType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "")

  public Integer getInterestRateFrequencyType() {
    return interestRateFrequencyType;
  }


  public void setInterestRateFrequencyType(Integer interestRateFrequencyType) {
    this.interestRateFrequencyType = interestRateFrequencyType;
  }


  public PostLoanProductsRequest amortizationType(Integer amortizationType) {
    
    this.amortizationType = amortizationType;
    return this;
  }

   /**
   * Get amortizationType
   * @return amortizationType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getAmortizationType() {
    return amortizationType;
  }


  public void setAmortizationType(Integer amortizationType) {
    this.amortizationType = amortizationType;
  }


  public PostLoanProductsRequest interestType(Integer interestType) {
    
    this.interestType = interestType;
    return this;
  }

   /**
   * Get interestType
   * @return interestType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public Integer getInterestType() {
    return interestType;
  }


  public void setInterestType(Integer interestType) {
    this.interestType = interestType;
  }


  public PostLoanProductsRequest interestCalculationPeriodType(Integer interestCalculationPeriodType) {
    
    this.interestCalculationPeriodType = interestCalculationPeriodType;
    return this;
  }

   /**
   * Get interestCalculationPeriodType
   * @return interestCalculationPeriodType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getInterestCalculationPeriodType() {
    return interestCalculationPeriodType;
  }


  public void setInterestCalculationPeriodType(Integer interestCalculationPeriodType) {
    this.interestCalculationPeriodType = interestCalculationPeriodType;
  }


  public PostLoanProductsRequest daysInMonthType(Integer daysInMonthType) {
    
    this.daysInMonthType = daysInMonthType;
    return this;
  }

   /**
   * Get daysInMonthType
   * @return daysInMonthType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getDaysInMonthType() {
    return daysInMonthType;
  }


  public void setDaysInMonthType(Integer daysInMonthType) {
    this.daysInMonthType = daysInMonthType;
  }


  public PostLoanProductsRequest daysInYearType(Integer daysInYearType) {
    
    this.daysInYearType = daysInYearType;
    return this;
  }

   /**
   * Get daysInYearType
   * @return daysInYearType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getDaysInYearType() {
    return daysInYearType;
  }


  public void setDaysInYearType(Integer daysInYearType) {
    this.daysInYearType = daysInYearType;
  }


  public PostLoanProductsRequest isInterestRecalculationEnabled(Boolean isInterestRecalculationEnabled) {
    
    this.isInterestRecalculationEnabled = isInterestRecalculationEnabled;
    return this;
  }

   /**
   * Get isInterestRecalculationEnabled
   * @return isInterestRecalculationEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getIsInterestRecalculationEnabled() {
    return isInterestRecalculationEnabled;
  }


  public void setIsInterestRecalculationEnabled(Boolean isInterestRecalculationEnabled) {
    this.isInterestRecalculationEnabled = isInterestRecalculationEnabled;
  }


  public PostLoanProductsRequest accountingRule(Integer accountingRule) {
    
    this.accountingRule = accountingRule;
    return this;
  }

   /**
   * Get accountingRule
   * @return accountingRule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3", value = "")

  public Integer getAccountingRule() {
    return accountingRule;
  }


  public void setAccountingRule(Integer accountingRule) {
    this.accountingRule = accountingRule;
  }


  public PostLoanProductsRequest fundSourceAccountId(Integer fundSourceAccountId) {
    
    this.fundSourceAccountId = fundSourceAccountId;
    return this;
  }

   /**
   * Get fundSourceAccountId
   * @return fundSourceAccountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4", value = "")

  public Integer getFundSourceAccountId() {
    return fundSourceAccountId;
  }


  public void setFundSourceAccountId(Integer fundSourceAccountId) {
    this.fundSourceAccountId = fundSourceAccountId;
  }


  public PostLoanProductsRequest loanPortfolioAccountId(Integer loanPortfolioAccountId) {
    
    this.loanPortfolioAccountId = loanPortfolioAccountId;
    return this;
  }

   /**
   * Get loanPortfolioAccountId
   * @return loanPortfolioAccountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8", value = "")

  public Integer getLoanPortfolioAccountId() {
    return loanPortfolioAccountId;
  }


  public void setLoanPortfolioAccountId(Integer loanPortfolioAccountId) {
    this.loanPortfolioAccountId = loanPortfolioAccountId;
  }


  public PostLoanProductsRequest receivableInterestAccountId(Integer receivableInterestAccountId) {
    
    this.receivableInterestAccountId = receivableInterestAccountId;
    return this;
  }

   /**
   * Get receivableInterestAccountId
   * @return receivableInterestAccountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "9", value = "")

  public Integer getReceivableInterestAccountId() {
    return receivableInterestAccountId;
  }


  public void setReceivableInterestAccountId(Integer receivableInterestAccountId) {
    this.receivableInterestAccountId = receivableInterestAccountId;
  }


  public PostLoanProductsRequest receivableFeeAccountId(Integer receivableFeeAccountId) {
    
    this.receivableFeeAccountId = receivableFeeAccountId;
    return this;
  }

   /**
   * Get receivableFeeAccountId
   * @return receivableFeeAccountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "11", value = "")

  public Integer getReceivableFeeAccountId() {
    return receivableFeeAccountId;
  }


  public void setReceivableFeeAccountId(Integer receivableFeeAccountId) {
    this.receivableFeeAccountId = receivableFeeAccountId;
  }


  public PostLoanProductsRequest receivablePenaltyAccountId(Integer receivablePenaltyAccountId) {
    
    this.receivablePenaltyAccountId = receivablePenaltyAccountId;
    return this;
  }

   /**
   * Get receivablePenaltyAccountId
   * @return receivablePenaltyAccountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "")

  public Integer getReceivablePenaltyAccountId() {
    return receivablePenaltyAccountId;
  }


  public void setReceivablePenaltyAccountId(Integer receivablePenaltyAccountId) {
    this.receivablePenaltyAccountId = receivablePenaltyAccountId;
  }


  public PostLoanProductsRequest interestOnLoanAccountId(Integer interestOnLoanAccountId) {
    
    this.interestOnLoanAccountId = interestOnLoanAccountId;
    return this;
  }

   /**
   * Get interestOnLoanAccountId
   * @return interestOnLoanAccountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "34", value = "")

  public Integer getInterestOnLoanAccountId() {
    return interestOnLoanAccountId;
  }


  public void setInterestOnLoanAccountId(Integer interestOnLoanAccountId) {
    this.interestOnLoanAccountId = interestOnLoanAccountId;
  }


  public PostLoanProductsRequest incomeFromFeeAccountId(Integer incomeFromFeeAccountId) {
    
    this.incomeFromFeeAccountId = incomeFromFeeAccountId;
    return this;
  }

   /**
   * Get incomeFromFeeAccountId
   * @return incomeFromFeeAccountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "37", value = "")

  public Integer getIncomeFromFeeAccountId() {
    return incomeFromFeeAccountId;
  }


  public void setIncomeFromFeeAccountId(Integer incomeFromFeeAccountId) {
    this.incomeFromFeeAccountId = incomeFromFeeAccountId;
  }


  public PostLoanProductsRequest incomeFromPenaltyAccountId(Integer incomeFromPenaltyAccountId) {
    
    this.incomeFromPenaltyAccountId = incomeFromPenaltyAccountId;
    return this;
  }

   /**
   * Get incomeFromPenaltyAccountId
   * @return incomeFromPenaltyAccountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "35", value = "")

  public Integer getIncomeFromPenaltyAccountId() {
    return incomeFromPenaltyAccountId;
  }


  public void setIncomeFromPenaltyAccountId(Integer incomeFromPenaltyAccountId) {
    this.incomeFromPenaltyAccountId = incomeFromPenaltyAccountId;
  }


  public PostLoanProductsRequest overpaymentLiabilityAccountId(Integer overpaymentLiabilityAccountId) {
    
    this.overpaymentLiabilityAccountId = overpaymentLiabilityAccountId;
    return this;
  }

   /**
   * Get overpaymentLiabilityAccountId
   * @return overpaymentLiabilityAccountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "")

  public Integer getOverpaymentLiabilityAccountId() {
    return overpaymentLiabilityAccountId;
  }


  public void setOverpaymentLiabilityAccountId(Integer overpaymentLiabilityAccountId) {
    this.overpaymentLiabilityAccountId = overpaymentLiabilityAccountId;
  }


  public PostLoanProductsRequest writeOffAccountId(Integer writeOffAccountId) {
    
    this.writeOffAccountId = writeOffAccountId;
    return this;
  }

   /**
   * Get writeOffAccountId
   * @return writeOffAccountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "41", value = "")

  public Integer getWriteOffAccountId() {
    return writeOffAccountId;
  }


  public void setWriteOffAccountId(Integer writeOffAccountId) {
    this.writeOffAccountId = writeOffAccountId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostLoanProductsRequest postLoanProductsRequest = (PostLoanProductsRequest) o;
    return Objects.equals(this.name, postLoanProductsRequest.name) &&
        Objects.equals(this.shortName, postLoanProductsRequest.shortName) &&
        Objects.equals(this.currencyCode, postLoanProductsRequest.currencyCode) &&
        Objects.equals(this.locale, postLoanProductsRequest.locale) &&
        Objects.equals(this.digitsAfterDecimal, postLoanProductsRequest.digitsAfterDecimal) &&
        Objects.equals(this.inMultiplesOf, postLoanProductsRequest.inMultiplesOf) &&
        Objects.equals(this.principal, postLoanProductsRequest.principal) &&
        Objects.equals(this.numberOfRepayments, postLoanProductsRequest.numberOfRepayments) &&
        Objects.equals(this.repaymentEvery, postLoanProductsRequest.repaymentEvery) &&
        Objects.equals(this.repaymentFrequencyType, postLoanProductsRequest.repaymentFrequencyType) &&
        Objects.equals(this.transactionProcessingStrategyId, postLoanProductsRequest.transactionProcessingStrategyId) &&
        Objects.equals(this.interestRatePerPeriod, postLoanProductsRequest.interestRatePerPeriod) &&
        Objects.equals(this.interestRateFrequencyType, postLoanProductsRequest.interestRateFrequencyType) &&
        Objects.equals(this.amortizationType, postLoanProductsRequest.amortizationType) &&
        Objects.equals(this.interestType, postLoanProductsRequest.interestType) &&
        Objects.equals(this.interestCalculationPeriodType, postLoanProductsRequest.interestCalculationPeriodType) &&
        Objects.equals(this.daysInMonthType, postLoanProductsRequest.daysInMonthType) &&
        Objects.equals(this.daysInYearType, postLoanProductsRequest.daysInYearType) &&
        Objects.equals(this.isInterestRecalculationEnabled, postLoanProductsRequest.isInterestRecalculationEnabled) &&
        Objects.equals(this.accountingRule, postLoanProductsRequest.accountingRule) &&
        Objects.equals(this.fundSourceAccountId, postLoanProductsRequest.fundSourceAccountId) &&
        Objects.equals(this.loanPortfolioAccountId, postLoanProductsRequest.loanPortfolioAccountId) &&
        Objects.equals(this.receivableInterestAccountId, postLoanProductsRequest.receivableInterestAccountId) &&
        Objects.equals(this.receivableFeeAccountId, postLoanProductsRequest.receivableFeeAccountId) &&
        Objects.equals(this.receivablePenaltyAccountId, postLoanProductsRequest.receivablePenaltyAccountId) &&
        Objects.equals(this.interestOnLoanAccountId, postLoanProductsRequest.interestOnLoanAccountId) &&
        Objects.equals(this.incomeFromFeeAccountId, postLoanProductsRequest.incomeFromFeeAccountId) &&
        Objects.equals(this.incomeFromPenaltyAccountId, postLoanProductsRequest.incomeFromPenaltyAccountId) &&
        Objects.equals(this.overpaymentLiabilityAccountId, postLoanProductsRequest.overpaymentLiabilityAccountId) &&
        Objects.equals(this.writeOffAccountId, postLoanProductsRequest.writeOffAccountId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, shortName, currencyCode, locale, digitsAfterDecimal, inMultiplesOf, principal, numberOfRepayments, repaymentEvery, repaymentFrequencyType, transactionProcessingStrategyId, interestRatePerPeriod, interestRateFrequencyType, amortizationType, interestType, interestCalculationPeriodType, daysInMonthType, daysInYearType, isInterestRecalculationEnabled, accountingRule, fundSourceAccountId, loanPortfolioAccountId, receivableInterestAccountId, receivableFeeAccountId, receivablePenaltyAccountId, interestOnLoanAccountId, incomeFromFeeAccountId, incomeFromPenaltyAccountId, overpaymentLiabilityAccountId, writeOffAccountId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostLoanProductsRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    digitsAfterDecimal: ").append(toIndentedString(digitsAfterDecimal)).append("\n");
    sb.append("    inMultiplesOf: ").append(toIndentedString(inMultiplesOf)).append("\n");
    sb.append("    principal: ").append(toIndentedString(principal)).append("\n");
    sb.append("    numberOfRepayments: ").append(toIndentedString(numberOfRepayments)).append("\n");
    sb.append("    repaymentEvery: ").append(toIndentedString(repaymentEvery)).append("\n");
    sb.append("    repaymentFrequencyType: ").append(toIndentedString(repaymentFrequencyType)).append("\n");
    sb.append("    transactionProcessingStrategyId: ").append(toIndentedString(transactionProcessingStrategyId)).append("\n");
    sb.append("    interestRatePerPeriod: ").append(toIndentedString(interestRatePerPeriod)).append("\n");
    sb.append("    interestRateFrequencyType: ").append(toIndentedString(interestRateFrequencyType)).append("\n");
    sb.append("    amortizationType: ").append(toIndentedString(amortizationType)).append("\n");
    sb.append("    interestType: ").append(toIndentedString(interestType)).append("\n");
    sb.append("    interestCalculationPeriodType: ").append(toIndentedString(interestCalculationPeriodType)).append("\n");
    sb.append("    daysInMonthType: ").append(toIndentedString(daysInMonthType)).append("\n");
    sb.append("    daysInYearType: ").append(toIndentedString(daysInYearType)).append("\n");
    sb.append("    isInterestRecalculationEnabled: ").append(toIndentedString(isInterestRecalculationEnabled)).append("\n");
    sb.append("    accountingRule: ").append(toIndentedString(accountingRule)).append("\n");
    sb.append("    fundSourceAccountId: ").append(toIndentedString(fundSourceAccountId)).append("\n");
    sb.append("    loanPortfolioAccountId: ").append(toIndentedString(loanPortfolioAccountId)).append("\n");
    sb.append("    receivableInterestAccountId: ").append(toIndentedString(receivableInterestAccountId)).append("\n");
    sb.append("    receivableFeeAccountId: ").append(toIndentedString(receivableFeeAccountId)).append("\n");
    sb.append("    receivablePenaltyAccountId: ").append(toIndentedString(receivablePenaltyAccountId)).append("\n");
    sb.append("    interestOnLoanAccountId: ").append(toIndentedString(interestOnLoanAccountId)).append("\n");
    sb.append("    incomeFromFeeAccountId: ").append(toIndentedString(incomeFromFeeAccountId)).append("\n");
    sb.append("    incomeFromPenaltyAccountId: ").append(toIndentedString(incomeFromPenaltyAccountId)).append("\n");
    sb.append("    overpaymentLiabilityAccountId: ").append(toIndentedString(overpaymentLiabilityAccountId)).append("\n");
    sb.append("    writeOffAccountId: ").append(toIndentedString(writeOffAccountId)).append("\n");
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

