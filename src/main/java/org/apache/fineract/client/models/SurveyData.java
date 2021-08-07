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
import java.util.Date;
import java.util.List;
import org.apache.fineract.client.models.ComponentData;
import org.apache.fineract.client.models.QuestionData;

/**
 * SurveyData
 */

public class SurveyData {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_COMPONENT_DATAS = "componentDatas";
  @SerializedName(SERIALIZED_NAME_COMPONENT_DATAS)
  private List<ComponentData> componentDatas = null;

  public static final String SERIALIZED_NAME_QUESTION_DATAS = "questionDatas";
  @SerializedName(SERIALIZED_NAME_QUESTION_DATAS)
  private List<QuestionData> questionDatas = null;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "countryCode";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  private String countryCode;

  public static final String SERIALIZED_NAME_VALID_FROM = "validFrom";
  @SerializedName(SERIALIZED_NAME_VALID_FROM)
  private Date validFrom;

  public static final String SERIALIZED_NAME_VALID_TO = "validTo";
  @SerializedName(SERIALIZED_NAME_VALID_TO)
  private Date validTo;


  public SurveyData id(Long id) {
    
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


  public SurveyData componentDatas(List<ComponentData> componentDatas) {
    
    this.componentDatas = componentDatas;
    return this;
  }

  public SurveyData addComponentDatasItem(ComponentData componentDatasItem) {
    if (this.componentDatas == null) {
      this.componentDatas = new ArrayList<ComponentData>();
    }
    this.componentDatas.add(componentDatasItem);
    return this;
  }

   /**
   * Get componentDatas
   * @return componentDatas
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ComponentData> getComponentDatas() {
    return componentDatas;
  }


  public void setComponentDatas(List<ComponentData> componentDatas) {
    this.componentDatas = componentDatas;
  }


  public SurveyData questionDatas(List<QuestionData> questionDatas) {
    
    this.questionDatas = questionDatas;
    return this;
  }

  public SurveyData addQuestionDatasItem(QuestionData questionDatasItem) {
    if (this.questionDatas == null) {
      this.questionDatas = new ArrayList<QuestionData>();
    }
    this.questionDatas.add(questionDatasItem);
    return this;
  }

   /**
   * Get questionDatas
   * @return questionDatas
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<QuestionData> getQuestionDatas() {
    return questionDatas;
  }


  public void setQuestionDatas(List<QuestionData> questionDatas) {
    this.questionDatas = questionDatas;
  }


  public SurveyData key(String key) {
    
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


  public SurveyData name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public SurveyData description(String description) {
    
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


  public SurveyData countryCode(String countryCode) {
    
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Get countryCode
   * @return countryCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCountryCode() {
    return countryCode;
  }


  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  public SurveyData validFrom(Date validFrom) {
    
    this.validFrom = validFrom;
    return this;
  }

   /**
   * Get validFrom
   * @return validFrom
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Date getValidFrom() {
    return validFrom;
  }


  public void setValidFrom(Date validFrom) {
    this.validFrom = validFrom;
  }


  public SurveyData validTo(Date validTo) {
    
    this.validTo = validTo;
    return this;
  }

   /**
   * Get validTo
   * @return validTo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Date getValidTo() {
    return validTo;
  }


  public void setValidTo(Date validTo) {
    this.validTo = validTo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SurveyData surveyData = (SurveyData) o;
    return Objects.equals(this.id, surveyData.id) &&
        Objects.equals(this.componentDatas, surveyData.componentDatas) &&
        Objects.equals(this.questionDatas, surveyData.questionDatas) &&
        Objects.equals(this.key, surveyData.key) &&
        Objects.equals(this.name, surveyData.name) &&
        Objects.equals(this.description, surveyData.description) &&
        Objects.equals(this.countryCode, surveyData.countryCode) &&
        Objects.equals(this.validFrom, surveyData.validFrom) &&
        Objects.equals(this.validTo, surveyData.validTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, componentDatas, questionDatas, key, name, description, countryCode, validFrom, validTo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SurveyData {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    componentDatas: ").append(toIndentedString(componentDatas)).append("\n");
    sb.append("    questionDatas: ").append(toIndentedString(questionDatas)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    validFrom: ").append(toIndentedString(validFrom)).append("\n");
    sb.append("    validTo: ").append(toIndentedString(validTo)).append("\n");
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

