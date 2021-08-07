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
import org.apache.fineract.client.models.Header;
import org.apache.fineract.client.models.PostBodyRequestSwagger;

/**
 * PostBatchesRequest
 */
@ApiModel(description = "PostBatchesRequest")

public class PostBatchesRequest {
  public static final String SERIALIZED_NAME_REQUEST_ID = "requestId";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private Long requestId;

  public static final String SERIALIZED_NAME_RELATIVE_URL = "relativeUrl";
  @SerializedName(SERIALIZED_NAME_RELATIVE_URL)
  private String relativeUrl;

  public static final String SERIALIZED_NAME_METHOD = "method";
  @SerializedName(SERIALIZED_NAME_METHOD)
  private String method;

  public static final String SERIALIZED_NAME_HEADERS = "headers";
  @SerializedName(SERIALIZED_NAME_HEADERS)
  private List<Header> headers = null;

  public static final String SERIALIZED_NAME_REFERENCE = "reference";
  @SerializedName(SERIALIZED_NAME_REFERENCE)
  private Long reference;

  public static final String SERIALIZED_NAME_BODY = "body";
  @SerializedName(SERIALIZED_NAME_BODY)
  private PostBodyRequestSwagger body;


  public PostBatchesRequest requestId(Long requestId) {
    
    this.requestId = requestId;
    return this;
  }

   /**
   * Get requestId
   * @return requestId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Long getRequestId() {
    return requestId;
  }


  public void setRequestId(Long requestId) {
    this.requestId = requestId;
  }


  public PostBatchesRequest relativeUrl(String relativeUrl) {
    
    this.relativeUrl = relativeUrl;
    return this;
  }

   /**
   * Get relativeUrl
   * @return relativeUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "clients", value = "")

  public String getRelativeUrl() {
    return relativeUrl;
  }


  public void setRelativeUrl(String relativeUrl) {
    this.relativeUrl = relativeUrl;
  }


  public PostBatchesRequest method(String method) {
    
    this.method = method;
    return this;
  }

   /**
   * Get method
   * @return method
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "POST", value = "")

  public String getMethod() {
    return method;
  }


  public void setMethod(String method) {
    this.method = method;
  }


  public PostBatchesRequest headers(List<Header> headers) {
    
    this.headers = headers;
    return this;
  }

  public PostBatchesRequest addHeadersItem(Header headersItem) {
    if (this.headers == null) {
      this.headers = new ArrayList<Header>();
    }
    this.headers.add(headersItem);
    return this;
  }

   /**
   * Get headers
   * @return headers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Header> getHeaders() {
    return headers;
  }


  public void setHeaders(List<Header> headers) {
    this.headers = headers;
  }


  public PostBatchesRequest reference(Long reference) {
    
    this.reference = reference;
    return this;
  }

   /**
   * Get reference
   * @return reference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Long getReference() {
    return reference;
  }


  public void setReference(Long reference) {
    this.reference = reference;
  }


  public PostBatchesRequest body(PostBodyRequestSwagger body) {
    
    this.body = body;
    return this;
  }

   /**
   * Get body
   * @return body
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PostBodyRequestSwagger getBody() {
    return body;
  }


  public void setBody(PostBodyRequestSwagger body) {
    this.body = body;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostBatchesRequest postBatchesRequest = (PostBatchesRequest) o;
    return Objects.equals(this.requestId, postBatchesRequest.requestId) &&
        Objects.equals(this.relativeUrl, postBatchesRequest.relativeUrl) &&
        Objects.equals(this.method, postBatchesRequest.method) &&
        Objects.equals(this.headers, postBatchesRequest.headers) &&
        Objects.equals(this.reference, postBatchesRequest.reference) &&
        Objects.equals(this.body, postBatchesRequest.body);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, relativeUrl, method, headers, reference, body);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostBatchesRequest {\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    relativeUrl: ").append(toIndentedString(relativeUrl)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
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

