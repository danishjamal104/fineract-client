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
import org.apache.fineract.client.models.CodeValueData;
import org.apache.fineract.client.models.EnumOptionData;

/**
 * GetGLAccountsResponse
 */
@ApiModel(description = "GetGLAccountsResponse")

public class GetGLAccountsResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PARENT_ID = "parentId";
  @SerializedName(SERIALIZED_NAME_PARENT_ID)
  private Long parentId;

  public static final String SERIALIZED_NAME_GL_CODE = "glCode";
  @SerializedName(SERIALIZED_NAME_GL_CODE)
  private String glCode;

  public static final String SERIALIZED_NAME_DISABLED = "disabled";
  @SerializedName(SERIALIZED_NAME_DISABLED)
  private Boolean disabled;

  public static final String SERIALIZED_NAME_MANUAL_ENTRIES_ALLOWED = "manualEntriesAllowed";
  @SerializedName(SERIALIZED_NAME_MANUAL_ENTRIES_ALLOWED)
  private Boolean manualEntriesAllowed;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private EnumOptionData type;

  public static final String SERIALIZED_NAME_USAGE = "usage";
  @SerializedName(SERIALIZED_NAME_USAGE)
  private EnumOptionData usage;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_NAME_DECORATED = "nameDecorated";
  @SerializedName(SERIALIZED_NAME_NAME_DECORATED)
  private String nameDecorated;

  public static final String SERIALIZED_NAME_TAG_ID = "tagId";
  @SerializedName(SERIALIZED_NAME_TAG_ID)
  private CodeValueData tagId;

  public static final String SERIALIZED_NAME_ORGANIZATION_RUNNING_BALANCE = "organizationRunningBalance";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION_RUNNING_BALANCE)
  private Long organizationRunningBalance;


  public GetGLAccountsResponse id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "16", value = "")

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public GetGLAccountsResponse name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Cash", value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public GetGLAccountsResponse parentId(Long parentId) {
    
    this.parentId = parentId;
    return this;
  }

   /**
   * Get parentId
   * @return parentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Long getParentId() {
    return parentId;
  }


  public void setParentId(Long parentId) {
    this.parentId = parentId;
  }


  public GetGLAccountsResponse glCode(String glCode) {
    
    this.glCode = glCode;
    return this;
  }

   /**
   * Get glCode
   * @return glCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100001", value = "")

  public String getGlCode() {
    return glCode;
  }


  public void setGlCode(String glCode) {
    this.glCode = glCode;
  }


  public GetGLAccountsResponse disabled(Boolean disabled) {
    
    this.disabled = disabled;
    return this;
  }

   /**
   * Get disabled
   * @return disabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getDisabled() {
    return disabled;
  }


  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }


  public GetGLAccountsResponse manualEntriesAllowed(Boolean manualEntriesAllowed) {
    
    this.manualEntriesAllowed = manualEntriesAllowed;
    return this;
  }

   /**
   * Get manualEntriesAllowed
   * @return manualEntriesAllowed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getManualEntriesAllowed() {
    return manualEntriesAllowed;
  }


  public void setManualEntriesAllowed(Boolean manualEntriesAllowed) {
    this.manualEntriesAllowed = manualEntriesAllowed;
  }


  public GetGLAccountsResponse type(EnumOptionData type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EnumOptionData getType() {
    return type;
  }


  public void setType(EnumOptionData type) {
    this.type = type;
  }


  public GetGLAccountsResponse usage(EnumOptionData usage) {
    
    this.usage = usage;
    return this;
  }

   /**
   * Get usage
   * @return usage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EnumOptionData getUsage() {
    return usage;
  }


  public void setUsage(EnumOptionData usage) {
    this.usage = usage;
  }


  public GetGLAccountsResponse description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Desc", value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public GetGLAccountsResponse nameDecorated(String nameDecorated) {
    
    this.nameDecorated = nameDecorated;
    return this;
  }

   /**
   * Get nameDecorated
   * @return nameDecorated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "....Cash", value = "")

  public String getNameDecorated() {
    return nameDecorated;
  }


  public void setNameDecorated(String nameDecorated) {
    this.nameDecorated = nameDecorated;
  }


  public GetGLAccountsResponse tagId(CodeValueData tagId) {
    
    this.tagId = tagId;
    return this;
  }

   /**
   * Get tagId
   * @return tagId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CodeValueData getTagId() {
    return tagId;
  }


  public void setTagId(CodeValueData tagId) {
    this.tagId = tagId;
  }


  public GetGLAccountsResponse organizationRunningBalance(Long organizationRunningBalance) {
    
    this.organizationRunningBalance = organizationRunningBalance;
    return this;
  }

   /**
   * Get organizationRunningBalance
   * @return organizationRunningBalance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "118437", value = "")

  public Long getOrganizationRunningBalance() {
    return organizationRunningBalance;
  }


  public void setOrganizationRunningBalance(Long organizationRunningBalance) {
    this.organizationRunningBalance = organizationRunningBalance;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetGLAccountsResponse getGLAccountsResponse = (GetGLAccountsResponse) o;
    return Objects.equals(this.id, getGLAccountsResponse.id) &&
        Objects.equals(this.name, getGLAccountsResponse.name) &&
        Objects.equals(this.parentId, getGLAccountsResponse.parentId) &&
        Objects.equals(this.glCode, getGLAccountsResponse.glCode) &&
        Objects.equals(this.disabled, getGLAccountsResponse.disabled) &&
        Objects.equals(this.manualEntriesAllowed, getGLAccountsResponse.manualEntriesAllowed) &&
        Objects.equals(this.type, getGLAccountsResponse.type) &&
        Objects.equals(this.usage, getGLAccountsResponse.usage) &&
        Objects.equals(this.description, getGLAccountsResponse.description) &&
        Objects.equals(this.nameDecorated, getGLAccountsResponse.nameDecorated) &&
        Objects.equals(this.tagId, getGLAccountsResponse.tagId) &&
        Objects.equals(this.organizationRunningBalance, getGLAccountsResponse.organizationRunningBalance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, parentId, glCode, disabled, manualEntriesAllowed, type, usage, description, nameDecorated, tagId, organizationRunningBalance);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetGLAccountsResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    glCode: ").append(toIndentedString(glCode)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    manualEntriesAllowed: ").append(toIndentedString(manualEntriesAllowed)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    nameDecorated: ").append(toIndentedString(nameDecorated)).append("\n");
    sb.append("    tagId: ").append(toIndentedString(tagId)).append("\n");
    sb.append("    organizationRunningBalance: ").append(toIndentedString(organizationRunningBalance)).append("\n");
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

