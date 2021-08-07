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

/**
 * GetReportsResponse
 */
@ApiModel(description = "GetReportsResponse")

public class GetReportsResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_REPORT_NAME = "reportName";
  @SerializedName(SERIALIZED_NAME_REPORT_NAME)
  private String reportName;

  public static final String SERIALIZED_NAME_REPORT_TYPE = "reportType";
  @SerializedName(SERIALIZED_NAME_REPORT_TYPE)
  private String reportType;

  public static final String SERIALIZED_NAME_REPORT_SUB_TYPE = "reportSubType";
  @SerializedName(SERIALIZED_NAME_REPORT_SUB_TYPE)
  private String reportSubType;

  public static final String SERIALIZED_NAME_REPORT_CATEGORY = "reportCategory";
  @SerializedName(SERIALIZED_NAME_REPORT_CATEGORY)
  private String reportCategory;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_REPORT_SQL = "reportSql";
  @SerializedName(SERIALIZED_NAME_REPORT_SQL)
  private String reportSql;

  public static final String SERIALIZED_NAME_CORE_REPORT = "coreReport";
  @SerializedName(SERIALIZED_NAME_CORE_REPORT)
  private Boolean coreReport;

  public static final String SERIALIZED_NAME_USE_REPORT = "useReport";
  @SerializedName(SERIALIZED_NAME_USE_REPORT)
  private Boolean useReport;

  public static final String SERIALIZED_NAME_REPORT_PARAMETERS = "reportParameters";
  @SerializedName(SERIALIZED_NAME_REPORT_PARAMETERS)
  private List<Object> reportParameters = null;


  public GetReportsResponse id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public GetReportsResponse reportName(String reportName) {
    
    this.reportName = reportName;
    return this;
  }

   /**
   * Get reportName
   * @return reportName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Client Listing", value = "")

  public String getReportName() {
    return reportName;
  }


  public void setReportName(String reportName) {
    this.reportName = reportName;
  }


  public GetReportsResponse reportType(String reportType) {
    
    this.reportType = reportType;
    return this;
  }

   /**
   * Get reportType
   * @return reportType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Table", value = "")

  public String getReportType() {
    return reportType;
  }


  public void setReportType(String reportType) {
    this.reportType = reportType;
  }


  public GetReportsResponse reportSubType(String reportSubType) {
    
    this.reportSubType = reportSubType;
    return this;
  }

   /**
   * Get reportSubType
   * @return reportSubType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getReportSubType() {
    return reportSubType;
  }


  public void setReportSubType(String reportSubType) {
    this.reportSubType = reportSubType;
  }


  public GetReportsResponse reportCategory(String reportCategory) {
    
    this.reportCategory = reportCategory;
    return this;
  }

   /**
   * Get reportCategory
   * @return reportCategory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Client", value = "")

  public String getReportCategory() {
    return reportCategory;
  }


  public void setReportCategory(String reportCategory) {
    this.reportCategory = reportCategory;
  }


  public GetReportsResponse description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Individual Client Report Lists the small number of defined fields on the client table.  Would expect to copy this report and add any one to one additional data for specific tenant needs. Can be run for any size MFI but you expect it only to be run within a branch for larger ones.  Depending on how many columns are displayed, there is probably is a limit of about 20/50k clients returned for html display (export to excel doesnt have that client browser/memory impact).", value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public GetReportsResponse reportSql(String reportSql) {
    
    this.reportSql = reportSql;
    return this;
  }

   /**
   * Get reportSql
   * @return reportSql
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getReportSql() {
    return reportSql;
  }


  public void setReportSql(String reportSql) {
    this.reportSql = reportSql;
  }


  public GetReportsResponse coreReport(Boolean coreReport) {
    
    this.coreReport = coreReport;
    return this;
  }

   /**
   * Get coreReport
   * @return coreReport
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getCoreReport() {
    return coreReport;
  }


  public void setCoreReport(Boolean coreReport) {
    this.coreReport = coreReport;
  }


  public GetReportsResponse useReport(Boolean useReport) {
    
    this.useReport = useReport;
    return this;
  }

   /**
   * Get useReport
   * @return useReport
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getUseReport() {
    return useReport;
  }


  public void setUseReport(Boolean useReport) {
    this.useReport = useReport;
  }


  public GetReportsResponse reportParameters(List<Object> reportParameters) {
    
    this.reportParameters = reportParameters;
    return this;
  }

  public GetReportsResponse addReportParametersItem(Object reportParametersItem) {
    if (this.reportParameters == null) {
      this.reportParameters = new ArrayList<Object>();
    }
    this.reportParameters.add(reportParametersItem);
    return this;
  }

   /**
   * Get reportParameters
   * @return reportParameters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Object> getReportParameters() {
    return reportParameters;
  }


  public void setReportParameters(List<Object> reportParameters) {
    this.reportParameters = reportParameters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetReportsResponse getReportsResponse = (GetReportsResponse) o;
    return Objects.equals(this.id, getReportsResponse.id) &&
        Objects.equals(this.reportName, getReportsResponse.reportName) &&
        Objects.equals(this.reportType, getReportsResponse.reportType) &&
        Objects.equals(this.reportSubType, getReportsResponse.reportSubType) &&
        Objects.equals(this.reportCategory, getReportsResponse.reportCategory) &&
        Objects.equals(this.description, getReportsResponse.description) &&
        Objects.equals(this.reportSql, getReportsResponse.reportSql) &&
        Objects.equals(this.coreReport, getReportsResponse.coreReport) &&
        Objects.equals(this.useReport, getReportsResponse.useReport) &&
        Objects.equals(this.reportParameters, getReportsResponse.reportParameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, reportName, reportType, reportSubType, reportCategory, description, reportSql, coreReport, useReport, reportParameters);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetReportsResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    reportName: ").append(toIndentedString(reportName)).append("\n");
    sb.append("    reportType: ").append(toIndentedString(reportType)).append("\n");
    sb.append("    reportSubType: ").append(toIndentedString(reportSubType)).append("\n");
    sb.append("    reportCategory: ").append(toIndentedString(reportCategory)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    reportSql: ").append(toIndentedString(reportSql)).append("\n");
    sb.append("    coreReport: ").append(toIndentedString(coreReport)).append("\n");
    sb.append("    useReport: ").append(toIndentedString(useReport)).append("\n");
    sb.append("    reportParameters: ").append(toIndentedString(reportParameters)).append("\n");
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

