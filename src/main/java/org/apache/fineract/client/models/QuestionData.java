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
import org.apache.fineract.client.models.ResponseData;

/**
 * QuestionData
 */

public class QuestionData {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_RESPONSE_DATAS = "responseDatas";
  @SerializedName(SERIALIZED_NAME_RESPONSE_DATAS)
  private List<ResponseData> responseDatas = null;

  public static final String SERIALIZED_NAME_COMPONENT_KEY = "componentKey";
  @SerializedName(SERIALIZED_NAME_COMPONENT_KEY)
  private String componentKey;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SEQUENCE_NO = "sequenceNo";
  @SerializedName(SERIALIZED_NAME_SEQUENCE_NO)
  private Integer sequenceNo;


  public QuestionData id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public QuestionData responseDatas(List<ResponseData> responseDatas) {
    
    this.responseDatas = responseDatas;
    return this;
  }

  public QuestionData addResponseDatasItem(ResponseData responseDatasItem) {
    if (this.responseDatas == null) {
      this.responseDatas = new ArrayList<ResponseData>();
    }
    this.responseDatas.add(responseDatasItem);
    return this;
  }

   /**
   * Get responseDatas
   * @return responseDatas
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ResponseData> getResponseDatas() {
    return responseDatas;
  }


  public void setResponseDatas(List<ResponseData> responseDatas) {
    this.responseDatas = responseDatas;
  }


  public QuestionData componentKey(String componentKey) {
    
    this.componentKey = componentKey;
    return this;
  }

   /**
   * Get componentKey
   * @return componentKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getComponentKey() {
    return componentKey;
  }


  public void setComponentKey(String componentKey) {
    this.componentKey = componentKey;
  }


  public QuestionData key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public QuestionData text(String text) {
    
    this.text = text;
    return this;
  }

   /**
   * Get text
   * @return text
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getText() {
    return text;
  }


  public void setText(String text) {
    this.text = text;
  }


  public QuestionData description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public QuestionData sequenceNo(Integer sequenceNo) {
    
    this.sequenceNo = sequenceNo;
    return this;
  }

   /**
   * Get sequenceNo
   * @return sequenceNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSequenceNo() {
    return sequenceNo;
  }


  public void setSequenceNo(Integer sequenceNo) {
    this.sequenceNo = sequenceNo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuestionData questionData = (QuestionData) o;
    return Objects.equals(this.id, questionData.id) &&
        Objects.equals(this.responseDatas, questionData.responseDatas) &&
        Objects.equals(this.componentKey, questionData.componentKey) &&
        Objects.equals(this.key, questionData.key) &&
        Objects.equals(this.text, questionData.text) &&
        Objects.equals(this.description, questionData.description) &&
        Objects.equals(this.sequenceNo, questionData.sequenceNo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, responseDatas, componentKey, key, text, description, sequenceNo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuestionData {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    responseDatas: ").append(toIndentedString(responseDatas)).append("\n");
    sb.append("    componentKey: ").append(toIndentedString(componentKey)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    sequenceNo: ").append(toIndentedString(sequenceNo)).append("\n");
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

