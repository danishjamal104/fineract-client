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
import java.util.List;
import org.apache.fineract.client.models.GetAccountTransfersPageItems;

/**
 * GetAccountTransfersResponse
 */
@ApiModel(description = "GetAccountTransfersResponse")

public class GetAccountTransfersResponse {
  public static final String SERIALIZED_NAME_TOTAL_FILTERED_RECORDS = "totalFilteredRecords";
  @SerializedName(SERIALIZED_NAME_TOTAL_FILTERED_RECORDS)
  private Integer totalFilteredRecords;

  public static final String SERIALIZED_NAME_PAGE_ITEMS = "pageItems";
  @SerializedName(SERIALIZED_NAME_PAGE_ITEMS)
  private List<GetAccountTransfersPageItems> pageItems = null;


  public GetAccountTransfersResponse totalFilteredRecords(Integer totalFilteredRecords) {
    
    this.totalFilteredRecords = totalFilteredRecords;
    return this;
  }

   /**
   * Get totalFilteredRecords
   * @return totalFilteredRecords
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4", value = "")

  public Integer getTotalFilteredRecords() {
    return totalFilteredRecords;
  }


  public void setTotalFilteredRecords(Integer totalFilteredRecords) {
    this.totalFilteredRecords = totalFilteredRecords;
  }


  public GetAccountTransfersResponse pageItems(List<GetAccountTransfersPageItems> pageItems) {
    
    this.pageItems = pageItems;
    return this;
  }

  public GetAccountTransfersResponse addPageItemsItem(GetAccountTransfersPageItems pageItemsItem) {
    if (this.pageItems == null) {
      this.pageItems = new ArrayList<GetAccountTransfersPageItems>();
    }
    this.pageItems.add(pageItemsItem);
    return this;
  }

   /**
   * Get pageItems
   * @return pageItems
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<GetAccountTransfersPageItems> getPageItems() {
    return pageItems;
  }


  public void setPageItems(List<GetAccountTransfersPageItems> pageItems) {
    this.pageItems = pageItems;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAccountTransfersResponse getAccountTransfersResponse = (GetAccountTransfersResponse) o;
    return Objects.equals(this.totalFilteredRecords, getAccountTransfersResponse.totalFilteredRecords) &&
        Objects.equals(this.pageItems, getAccountTransfersResponse.pageItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalFilteredRecords, pageItems);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAccountTransfersResponse {\n");
    sb.append("    totalFilteredRecords: ").append(toIndentedString(totalFilteredRecords)).append("\n");
    sb.append("    pageItems: ").append(toIndentedString(pageItems)).append("\n");
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

