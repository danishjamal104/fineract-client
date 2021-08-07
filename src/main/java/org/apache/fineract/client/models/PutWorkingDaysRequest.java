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
import org.apache.fineract.client.models.EnumOptionData;

/**
 * PutWorkingDaysRequest
 */
@ApiModel(description = "PutWorkingDaysRequest")

public class PutWorkingDaysRequest {
  public static final String SERIALIZED_NAME_RECURRENCE = "recurrence";
  @SerializedName(SERIALIZED_NAME_RECURRENCE)
  private String recurrence;

  public static final String SERIALIZED_NAME_LOCALE = "locale";
  @SerializedName(SERIALIZED_NAME_LOCALE)
  private String locale;

  public static final String SERIALIZED_NAME_REPAYMENT_RESCHEDULE_TYPE = "repaymentRescheduleType";
  @SerializedName(SERIALIZED_NAME_REPAYMENT_RESCHEDULE_TYPE)
  private EnumOptionData repaymentRescheduleType;

  public static final String SERIALIZED_NAME_EXTEND_TERM_FOR_DAILY_REPAYMENTS = "extendTermForDailyRepayments";
  @SerializedName(SERIALIZED_NAME_EXTEND_TERM_FOR_DAILY_REPAYMENTS)
  private Boolean extendTermForDailyRepayments;


  public PutWorkingDaysRequest recurrence(String recurrence) {
    
    this.recurrence = recurrence;
    return this;
  }

   /**
   * Get recurrence
   * @return recurrence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "FREQ=WEEKLY;INTERVAL=1;BYDAY=MO,TU,WE,TH,FR", value = "")

  public String getRecurrence() {
    return recurrence;
  }


  public void setRecurrence(String recurrence) {
    this.recurrence = recurrence;
  }


  public PutWorkingDaysRequest locale(String locale) {
    
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


  public PutWorkingDaysRequest repaymentRescheduleType(EnumOptionData repaymentRescheduleType) {
    
    this.repaymentRescheduleType = repaymentRescheduleType;
    return this;
  }

   /**
   * Get repaymentRescheduleType
   * @return repaymentRescheduleType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EnumOptionData getRepaymentRescheduleType() {
    return repaymentRescheduleType;
  }


  public void setRepaymentRescheduleType(EnumOptionData repaymentRescheduleType) {
    this.repaymentRescheduleType = repaymentRescheduleType;
  }


  public PutWorkingDaysRequest extendTermForDailyRepayments(Boolean extendTermForDailyRepayments) {
    
    this.extendTermForDailyRepayments = extendTermForDailyRepayments;
    return this;
  }

   /**
   * Get extendTermForDailyRepayments
   * @return extendTermForDailyRepayments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getExtendTermForDailyRepayments() {
    return extendTermForDailyRepayments;
  }


  public void setExtendTermForDailyRepayments(Boolean extendTermForDailyRepayments) {
    this.extendTermForDailyRepayments = extendTermForDailyRepayments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PutWorkingDaysRequest putWorkingDaysRequest = (PutWorkingDaysRequest) o;
    return Objects.equals(this.recurrence, putWorkingDaysRequest.recurrence) &&
        Objects.equals(this.locale, putWorkingDaysRequest.locale) &&
        Objects.equals(this.repaymentRescheduleType, putWorkingDaysRequest.repaymentRescheduleType) &&
        Objects.equals(this.extendTermForDailyRepayments, putWorkingDaysRequest.extendTermForDailyRepayments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recurrence, locale, repaymentRescheduleType, extendTermForDailyRepayments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PutWorkingDaysRequest {\n");
    sb.append("    recurrence: ").append(toIndentedString(recurrence)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    repaymentRescheduleType: ").append(toIndentedString(repaymentRescheduleType)).append("\n");
    sb.append("    extendTermForDailyRepayments: ").append(toIndentedString(extendTermForDailyRepayments)).append("\n");
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

