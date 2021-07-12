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
import java.util.Date;

/**
 * GetSelfClientsTimeline
 */

public class GetSelfClientsTimeline {
  public static final String SERIALIZED_NAME_SUBMITTED_ON_DATE = "submittedOnDate";
  @SerializedName(SERIALIZED_NAME_SUBMITTED_ON_DATE)
  private Date submittedOnDate;

  public static final String SERIALIZED_NAME_SUBMITTED_BY_USERNAME = "submittedByUsername";
  @SerializedName(SERIALIZED_NAME_SUBMITTED_BY_USERNAME)
  private String submittedByUsername;

  public static final String SERIALIZED_NAME_SUBMITTED_BY_FIRSTNAME = "submittedByFirstname";
  @SerializedName(SERIALIZED_NAME_SUBMITTED_BY_FIRSTNAME)
  private String submittedByFirstname;

  public static final String SERIALIZED_NAME_SUBMITTED_BY_LASTNAME = "submittedByLastname";
  @SerializedName(SERIALIZED_NAME_SUBMITTED_BY_LASTNAME)
  private String submittedByLastname;

  public static final String SERIALIZED_NAME_ACTIVATED_ON_DATE = "activatedOnDate";
  @SerializedName(SERIALIZED_NAME_ACTIVATED_ON_DATE)
  private Date activatedOnDate;

  public static final String SERIALIZED_NAME_ACTIVATED_BY_USERNAME = "activatedByUsername";
  @SerializedName(SERIALIZED_NAME_ACTIVATED_BY_USERNAME)
  private String activatedByUsername;

  public static final String SERIALIZED_NAME_ACTIVATED_BY_FIRSTNAME = "activatedByFirstname";
  @SerializedName(SERIALIZED_NAME_ACTIVATED_BY_FIRSTNAME)
  private String activatedByFirstname;

  public static final String SERIALIZED_NAME_ACTIVATED_BY_LASTNAME = "activatedByLastname";
  @SerializedName(SERIALIZED_NAME_ACTIVATED_BY_LASTNAME)
  private String activatedByLastname;


  public GetSelfClientsTimeline submittedOnDate(Date submittedOnDate) {
    
    this.submittedOnDate = submittedOnDate;
    return this;
  }

   /**
   * Get submittedOnDate
   * @return submittedOnDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Date getSubmittedOnDate() {
    return submittedOnDate;
  }


  public void setSubmittedOnDate(Date submittedOnDate) {
    this.submittedOnDate = submittedOnDate;
  }


  public GetSelfClientsTimeline submittedByUsername(String submittedByUsername) {
    
    this.submittedByUsername = submittedByUsername;
    return this;
  }

   /**
   * Get submittedByUsername
   * @return submittedByUsername
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "mifos", value = "")

  public String getSubmittedByUsername() {
    return submittedByUsername;
  }


  public void setSubmittedByUsername(String submittedByUsername) {
    this.submittedByUsername = submittedByUsername;
  }


  public GetSelfClientsTimeline submittedByFirstname(String submittedByFirstname) {
    
    this.submittedByFirstname = submittedByFirstname;
    return this;
  }

   /**
   * Get submittedByFirstname
   * @return submittedByFirstname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "App", value = "")

  public String getSubmittedByFirstname() {
    return submittedByFirstname;
  }


  public void setSubmittedByFirstname(String submittedByFirstname) {
    this.submittedByFirstname = submittedByFirstname;
  }


  public GetSelfClientsTimeline submittedByLastname(String submittedByLastname) {
    
    this.submittedByLastname = submittedByLastname;
    return this;
  }

   /**
   * Get submittedByLastname
   * @return submittedByLastname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Administrator", value = "")

  public String getSubmittedByLastname() {
    return submittedByLastname;
  }


  public void setSubmittedByLastname(String submittedByLastname) {
    this.submittedByLastname = submittedByLastname;
  }


  public GetSelfClientsTimeline activatedOnDate(Date activatedOnDate) {
    
    this.activatedOnDate = activatedOnDate;
    return this;
  }

   /**
   * Get activatedOnDate
   * @return activatedOnDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Date getActivatedOnDate() {
    return activatedOnDate;
  }


  public void setActivatedOnDate(Date activatedOnDate) {
    this.activatedOnDate = activatedOnDate;
  }


  public GetSelfClientsTimeline activatedByUsername(String activatedByUsername) {
    
    this.activatedByUsername = activatedByUsername;
    return this;
  }

   /**
   * Get activatedByUsername
   * @return activatedByUsername
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "mifos", value = "")

  public String getActivatedByUsername() {
    return activatedByUsername;
  }


  public void setActivatedByUsername(String activatedByUsername) {
    this.activatedByUsername = activatedByUsername;
  }


  public GetSelfClientsTimeline activatedByFirstname(String activatedByFirstname) {
    
    this.activatedByFirstname = activatedByFirstname;
    return this;
  }

   /**
   * Get activatedByFirstname
   * @return activatedByFirstname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "App", value = "")

  public String getActivatedByFirstname() {
    return activatedByFirstname;
  }


  public void setActivatedByFirstname(String activatedByFirstname) {
    this.activatedByFirstname = activatedByFirstname;
  }


  public GetSelfClientsTimeline activatedByLastname(String activatedByLastname) {
    
    this.activatedByLastname = activatedByLastname;
    return this;
  }

   /**
   * Get activatedByLastname
   * @return activatedByLastname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Administrator", value = "")

  public String getActivatedByLastname() {
    return activatedByLastname;
  }


  public void setActivatedByLastname(String activatedByLastname) {
    this.activatedByLastname = activatedByLastname;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetSelfClientsTimeline getSelfClientsTimeline = (GetSelfClientsTimeline) o;
    return Objects.equals(this.submittedOnDate, getSelfClientsTimeline.submittedOnDate) &&
        Objects.equals(this.submittedByUsername, getSelfClientsTimeline.submittedByUsername) &&
        Objects.equals(this.submittedByFirstname, getSelfClientsTimeline.submittedByFirstname) &&
        Objects.equals(this.submittedByLastname, getSelfClientsTimeline.submittedByLastname) &&
        Objects.equals(this.activatedOnDate, getSelfClientsTimeline.activatedOnDate) &&
        Objects.equals(this.activatedByUsername, getSelfClientsTimeline.activatedByUsername) &&
        Objects.equals(this.activatedByFirstname, getSelfClientsTimeline.activatedByFirstname) &&
        Objects.equals(this.activatedByLastname, getSelfClientsTimeline.activatedByLastname);
  }

  @Override
  public int hashCode() {
    return Objects.hash(submittedOnDate, submittedByUsername, submittedByFirstname, submittedByLastname, activatedOnDate, activatedByUsername, activatedByFirstname, activatedByLastname);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSelfClientsTimeline {\n");
    sb.append("    submittedOnDate: ").append(toIndentedString(submittedOnDate)).append("\n");
    sb.append("    submittedByUsername: ").append(toIndentedString(submittedByUsername)).append("\n");
    sb.append("    submittedByFirstname: ").append(toIndentedString(submittedByFirstname)).append("\n");
    sb.append("    submittedByLastname: ").append(toIndentedString(submittedByLastname)).append("\n");
    sb.append("    activatedOnDate: ").append(toIndentedString(activatedOnDate)).append("\n");
    sb.append("    activatedByUsername: ").append(toIndentedString(activatedByUsername)).append("\n");
    sb.append("    activatedByFirstname: ").append(toIndentedString(activatedByFirstname)).append("\n");
    sb.append("    activatedByLastname: ").append(toIndentedString(activatedByLastname)).append("\n");
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

