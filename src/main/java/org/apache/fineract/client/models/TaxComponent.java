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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.apache.fineract.client.models.AppUser;
import org.apache.fineract.client.models.GLAccount;
import org.apache.fineract.client.models.TaxComponentHistory;
import org.apache.fineract.client.models.TaxGroupMappings;

/**
 * TaxComponent
 */

public class TaxComponent {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_CREATED_BY = "createdBy";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private AppUser createdBy;

  public static final String SERIALIZED_NAME_CREATED_DATE = "createdDate";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  private Date createdDate;

  public static final String SERIALIZED_NAME_LAST_MODIFIED_BY = "lastModifiedBy";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_BY)
  private AppUser lastModifiedBy;

  public static final String SERIALIZED_NAME_LAST_MODIFIED_DATE = "lastModifiedDate";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_DATE)
  private Date lastModifiedDate;

  public static final String SERIALIZED_NAME_PERCENTAGE = "percentage";
  @SerializedName(SERIALIZED_NAME_PERCENTAGE)
  private BigDecimal percentage;

  public static final String SERIALIZED_NAME_DEBIT_ACCOUNT_TYPE = "debitAccountType";
  @SerializedName(SERIALIZED_NAME_DEBIT_ACCOUNT_TYPE)
  private Integer debitAccountType;

  public static final String SERIALIZED_NAME_DEBIT_ACOUNT = "debitAcount";
  @SerializedName(SERIALIZED_NAME_DEBIT_ACOUNT)
  private GLAccount debitAcount;

  public static final String SERIALIZED_NAME_CREDIT_ACCOUNT_TYPE = "creditAccountType";
  @SerializedName(SERIALIZED_NAME_CREDIT_ACCOUNT_TYPE)
  private Integer creditAccountType;

  public static final String SERIALIZED_NAME_CREDIT_ACOUNT = "creditAcount";
  @SerializedName(SERIALIZED_NAME_CREDIT_ACOUNT)
  private GLAccount creditAcount;

  public static final String SERIALIZED_NAME_TAX_COMPONENT_HISTORIES = "taxComponentHistories";
  @SerializedName(SERIALIZED_NAME_TAX_COMPONENT_HISTORIES)
  private List<TaxComponentHistory> taxComponentHistories = null;

  public static final String SERIALIZED_NAME_TAX_GROUP_MAPPINGS = "taxGroupMappings";
  @SerializedName(SERIALIZED_NAME_TAX_GROUP_MAPPINGS)
  private List<TaxGroupMappings> taxGroupMappings = null;

  public static final String SERIALIZED_NAME_NEW = "new";
  @SerializedName(SERIALIZED_NAME_NEW)
  private Boolean _new;


  public TaxComponent id(Long id) {
    
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


  public TaxComponent createdBy(AppUser createdBy) {
    
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AppUser getCreatedBy() {
    return createdBy;
  }


  public void setCreatedBy(AppUser createdBy) {
    this.createdBy = createdBy;
  }


  public TaxComponent createdDate(Date createdDate) {
    
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Get createdDate
   * @return createdDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Date getCreatedDate() {
    return createdDate;
  }


  public void setCreatedDate(Date createdDate) {
    this.createdDate = createdDate;
  }


  public TaxComponent lastModifiedBy(AppUser lastModifiedBy) {
    
    this.lastModifiedBy = lastModifiedBy;
    return this;
  }

   /**
   * Get lastModifiedBy
   * @return lastModifiedBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AppUser getLastModifiedBy() {
    return lastModifiedBy;
  }


  public void setLastModifiedBy(AppUser lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
  }


  public TaxComponent lastModifiedDate(Date lastModifiedDate) {
    
    this.lastModifiedDate = lastModifiedDate;
    return this;
  }

   /**
   * Get lastModifiedDate
   * @return lastModifiedDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Date getLastModifiedDate() {
    return lastModifiedDate;
  }


  public void setLastModifiedDate(Date lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
  }


  public TaxComponent percentage(BigDecimal percentage) {
    
    this.percentage = percentage;
    return this;
  }

   /**
   * Get percentage
   * @return percentage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getPercentage() {
    return percentage;
  }


  public void setPercentage(BigDecimal percentage) {
    this.percentage = percentage;
  }


  public TaxComponent debitAccountType(Integer debitAccountType) {
    
    this.debitAccountType = debitAccountType;
    return this;
  }

   /**
   * Get debitAccountType
   * @return debitAccountType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getDebitAccountType() {
    return debitAccountType;
  }


  public void setDebitAccountType(Integer debitAccountType) {
    this.debitAccountType = debitAccountType;
  }


  public TaxComponent debitAcount(GLAccount debitAcount) {
    
    this.debitAcount = debitAcount;
    return this;
  }

   /**
   * Get debitAcount
   * @return debitAcount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GLAccount getDebitAcount() {
    return debitAcount;
  }


  public void setDebitAcount(GLAccount debitAcount) {
    this.debitAcount = debitAcount;
  }


  public TaxComponent creditAccountType(Integer creditAccountType) {
    
    this.creditAccountType = creditAccountType;
    return this;
  }

   /**
   * Get creditAccountType
   * @return creditAccountType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCreditAccountType() {
    return creditAccountType;
  }


  public void setCreditAccountType(Integer creditAccountType) {
    this.creditAccountType = creditAccountType;
  }


  public TaxComponent creditAcount(GLAccount creditAcount) {
    
    this.creditAcount = creditAcount;
    return this;
  }

   /**
   * Get creditAcount
   * @return creditAcount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GLAccount getCreditAcount() {
    return creditAcount;
  }


  public void setCreditAcount(GLAccount creditAcount) {
    this.creditAcount = creditAcount;
  }


  public TaxComponent taxComponentHistories(List<TaxComponentHistory> taxComponentHistories) {
    
    this.taxComponentHistories = taxComponentHistories;
    return this;
  }

  public TaxComponent addTaxComponentHistoriesItem(TaxComponentHistory taxComponentHistoriesItem) {
    if (this.taxComponentHistories == null) {
      this.taxComponentHistories = new ArrayList<TaxComponentHistory>();
    }
    this.taxComponentHistories.add(taxComponentHistoriesItem);
    return this;
  }

   /**
   * Get taxComponentHistories
   * @return taxComponentHistories
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<TaxComponentHistory> getTaxComponentHistories() {
    return taxComponentHistories;
  }


  public void setTaxComponentHistories(List<TaxComponentHistory> taxComponentHistories) {
    this.taxComponentHistories = taxComponentHistories;
  }


  public TaxComponent taxGroupMappings(List<TaxGroupMappings> taxGroupMappings) {
    
    this.taxGroupMappings = taxGroupMappings;
    return this;
  }

  public TaxComponent addTaxGroupMappingsItem(TaxGroupMappings taxGroupMappingsItem) {
    if (this.taxGroupMappings == null) {
      this.taxGroupMappings = new ArrayList<TaxGroupMappings>();
    }
    this.taxGroupMappings.add(taxGroupMappingsItem);
    return this;
  }

   /**
   * Get taxGroupMappings
   * @return taxGroupMappings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<TaxGroupMappings> getTaxGroupMappings() {
    return taxGroupMappings;
  }


  public void setTaxGroupMappings(List<TaxGroupMappings> taxGroupMappings) {
    this.taxGroupMappings = taxGroupMappings;
  }


  public TaxComponent _new(Boolean _new) {
    
    this._new = _new;
    return this;
  }

   /**
   * Get _new
   * @return _new
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getNew() {
    return _new;
  }


  public void setNew(Boolean _new) {
    this._new = _new;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxComponent taxComponent = (TaxComponent) o;
    return Objects.equals(this.id, taxComponent.id) &&
        Objects.equals(this.createdBy, taxComponent.createdBy) &&
        Objects.equals(this.createdDate, taxComponent.createdDate) &&
        Objects.equals(this.lastModifiedBy, taxComponent.lastModifiedBy) &&
        Objects.equals(this.lastModifiedDate, taxComponent.lastModifiedDate) &&
        Objects.equals(this.percentage, taxComponent.percentage) &&
        Objects.equals(this.debitAccountType, taxComponent.debitAccountType) &&
        Objects.equals(this.debitAcount, taxComponent.debitAcount) &&
        Objects.equals(this.creditAccountType, taxComponent.creditAccountType) &&
        Objects.equals(this.creditAcount, taxComponent.creditAcount) &&
        Objects.equals(this.taxComponentHistories, taxComponent.taxComponentHistories) &&
        Objects.equals(this.taxGroupMappings, taxComponent.taxGroupMappings) &&
        Objects.equals(this._new, taxComponent._new);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdBy, createdDate, lastModifiedBy, lastModifiedDate, percentage, debitAccountType, debitAcount, creditAccountType, creditAcount, taxComponentHistories, taxGroupMappings, _new);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxComponent {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    lastModifiedBy: ").append(toIndentedString(lastModifiedBy)).append("\n");
    sb.append("    lastModifiedDate: ").append(toIndentedString(lastModifiedDate)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
    sb.append("    debitAccountType: ").append(toIndentedString(debitAccountType)).append("\n");
    sb.append("    debitAcount: ").append(toIndentedString(debitAcount)).append("\n");
    sb.append("    creditAccountType: ").append(toIndentedString(creditAccountType)).append("\n");
    sb.append("    creditAcount: ").append(toIndentedString(creditAcount)).append("\n");
    sb.append("    taxComponentHistories: ").append(toIndentedString(taxComponentHistories)).append("\n");
    sb.append("    taxGroupMappings: ").append(toIndentedString(taxGroupMappings)).append("\n");
    sb.append("    _new: ").append(toIndentedString(_new)).append("\n");
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

