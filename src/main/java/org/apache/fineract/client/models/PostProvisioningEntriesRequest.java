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
 * PostProvisioningEntriesRequest
 */
@ApiModel(description = "PostProvisioningEntriesRequest")

public class PostProvisioningEntriesRequest {
  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private String date;

  public static final String SERIALIZED_NAME_LOCALE = "locale";
  @SerializedName(SERIALIZED_NAME_LOCALE)
  private String locale;

  public static final String SERIALIZED_NAME_DATE_FORMAT = "dateFormat";
  @SerializedName(SERIALIZED_NAME_DATE_FORMAT)
  private String dateFormat;

  public static final String SERIALIZED_NAME_CREATEJOURNALENTRIES = "createjournalentries";
  @SerializedName(SERIALIZED_NAME_CREATEJOURNALENTRIES)
  private String createjournalentries;

  public static final String SERIALIZED_NAME_PROVISIONINGENTRY = "provisioningentry";
  @SerializedName(SERIALIZED_NAME_PROVISIONINGENTRY)
  private String provisioningentry;

  public static final String SERIALIZED_NAME_ENTRIES = "entries";
  @SerializedName(SERIALIZED_NAME_ENTRIES)
  private String entries;


  public PostProvisioningEntriesRequest date(String date) {
    
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "16 October 2015", value = "")

  public String getDate() {
    return date;
  }


  public void setDate(String date) {
    this.date = date;
  }


  public PostProvisioningEntriesRequest locale(String locale) {
    
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


  public PostProvisioningEntriesRequest dateFormat(String dateFormat) {
    
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


  public PostProvisioningEntriesRequest createjournalentries(String createjournalentries) {
    
    this.createjournalentries = createjournalentries;
    return this;
  }

   /**
   * Get createjournalentries
   * @return createjournalentries
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public String getCreatejournalentries() {
    return createjournalentries;
  }


  public void setCreatejournalentries(String createjournalentries) {
    this.createjournalentries = createjournalentries;
  }


  public PostProvisioningEntriesRequest provisioningentry(String provisioningentry) {
    
    this.provisioningentry = provisioningentry;
    return this;
  }

   /**
   * Get provisioningentry
   * @return provisioningentry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProvisioningentry() {
    return provisioningentry;
  }


  public void setProvisioningentry(String provisioningentry) {
    this.provisioningentry = provisioningentry;
  }


  public PostProvisioningEntriesRequest entries(String entries) {
    
    this.entries = entries;
    return this;
  }

   /**
   * Get entries
   * @return entries
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEntries() {
    return entries;
  }


  public void setEntries(String entries) {
    this.entries = entries;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostProvisioningEntriesRequest postProvisioningEntriesRequest = (PostProvisioningEntriesRequest) o;
    return Objects.equals(this.date, postProvisioningEntriesRequest.date) &&
        Objects.equals(this.locale, postProvisioningEntriesRequest.locale) &&
        Objects.equals(this.dateFormat, postProvisioningEntriesRequest.dateFormat) &&
        Objects.equals(this.createjournalentries, postProvisioningEntriesRequest.createjournalentries) &&
        Objects.equals(this.provisioningentry, postProvisioningEntriesRequest.provisioningentry) &&
        Objects.equals(this.entries, postProvisioningEntriesRequest.entries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, locale, dateFormat, createjournalentries, provisioningentry, entries);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostProvisioningEntriesRequest {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    dateFormat: ").append(toIndentedString(dateFormat)).append("\n");
    sb.append("    createjournalentries: ").append(toIndentedString(createjournalentries)).append("\n");
    sb.append("    provisioningentry: ").append(toIndentedString(provisioningentry)).append("\n");
    sb.append("    entries: ").append(toIndentedString(entries)).append("\n");
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

