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
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.apache.fineract.client.models.PostHolidaysRequestOffices;

/**
 * PostHolidaysRequest
 */
@ApiModel(description = "PostHolidaysRequest")

public class PostHolidaysRequest {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DATE_FORMAT = "dateFormat";
  @SerializedName(SERIALIZED_NAME_DATE_FORMAT)
  private String dateFormat;

  public static final String SERIALIZED_NAME_LOCALE = "locale";
  @SerializedName(SERIALIZED_NAME_LOCALE)
  private String locale;

  public static final String SERIALIZED_NAME_FROM_DATE = "fromDate";
  @SerializedName(SERIALIZED_NAME_FROM_DATE)
  private Date fromDate;

  public static final String SERIALIZED_NAME_TO_DATE = "toDate";
  @SerializedName(SERIALIZED_NAME_TO_DATE)
  private Date toDate;

  public static final String SERIALIZED_NAME_REPAYMENTS_RESCHEDULED_TO = "repaymentsRescheduledTo";
  @SerializedName(SERIALIZED_NAME_REPAYMENTS_RESCHEDULED_TO)
  private Date repaymentsRescheduledTo;

  public static final String SERIALIZED_NAME_OFFICES = "offices";
  @SerializedName(SERIALIZED_NAME_OFFICES)
  private List<PostHolidaysRequestOffices> offices = null;


  public PostHolidaysRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Good Friday", value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public PostHolidaysRequest description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Good Friday", value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public PostHolidaysRequest dateFormat(String dateFormat) {
    
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


  public PostHolidaysRequest locale(String locale) {
    
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


  public PostHolidaysRequest fromDate(Date fromDate) {
    
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


  public PostHolidaysRequest toDate(Date toDate) {
    
    this.toDate = toDate;
    return this;
  }

   /**
   * Get toDate
   * @return toDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Date getToDate() {
    return toDate;
  }


  public void setToDate(Date toDate) {
    this.toDate = toDate;
  }


  public PostHolidaysRequest repaymentsRescheduledTo(Date repaymentsRescheduledTo) {
    
    this.repaymentsRescheduledTo = repaymentsRescheduledTo;
    return this;
  }

   /**
   * Get repaymentsRescheduledTo
   * @return repaymentsRescheduledTo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Date getRepaymentsRescheduledTo() {
    return repaymentsRescheduledTo;
  }


  public void setRepaymentsRescheduledTo(Date repaymentsRescheduledTo) {
    this.repaymentsRescheduledTo = repaymentsRescheduledTo;
  }


  public PostHolidaysRequest offices(List<PostHolidaysRequestOffices> offices) {
    
    this.offices = offices;
    return this;
  }

  public PostHolidaysRequest addOfficesItem(PostHolidaysRequestOffices officesItem) {
    if (this.offices == null) {
      this.offices = new ArrayList<PostHolidaysRequestOffices>();
    }
    this.offices.add(officesItem);
    return this;
  }

   /**
   * Get offices
   * @return offices
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<PostHolidaysRequestOffices> getOffices() {
    return offices;
  }


  public void setOffices(List<PostHolidaysRequestOffices> offices) {
    this.offices = offices;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostHolidaysRequest postHolidaysRequest = (PostHolidaysRequest) o;
    return Objects.equals(this.name, postHolidaysRequest.name) &&
        Objects.equals(this.description, postHolidaysRequest.description) &&
        Objects.equals(this.dateFormat, postHolidaysRequest.dateFormat) &&
        Objects.equals(this.locale, postHolidaysRequest.locale) &&
        Objects.equals(this.fromDate, postHolidaysRequest.fromDate) &&
        Objects.equals(this.toDate, postHolidaysRequest.toDate) &&
        Objects.equals(this.repaymentsRescheduledTo, postHolidaysRequest.repaymentsRescheduledTo) &&
        Objects.equals(this.offices, postHolidaysRequest.offices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, dateFormat, locale, fromDate, toDate, repaymentsRescheduledTo, offices);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostHolidaysRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dateFormat: ").append(toIndentedString(dateFormat)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    fromDate: ").append(toIndentedString(fromDate)).append("\n");
    sb.append("    toDate: ").append(toIndentedString(toDate)).append("\n");
    sb.append("    repaymentsRescheduledTo: ").append(toIndentedString(repaymentsRescheduledTo)).append("\n");
    sb.append("    offices: ").append(toIndentedString(offices)).append("\n");
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

