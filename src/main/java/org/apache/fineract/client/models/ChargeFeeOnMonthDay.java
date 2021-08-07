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
 * ChargeFeeOnMonthDay
 */

public class ChargeFeeOnMonthDay {
  /**
   * Gets or Sets month
   */
  @JsonAdapter(MonthEnum.Adapter.class)
  public enum MonthEnum {
    JANUARY("JANUARY"),
    
    FEBRUARY("FEBRUARY"),
    
    MARCH("MARCH"),
    
    APRIL("APRIL"),
    
    MAY("MAY"),
    
    JUNE("JUNE"),
    
    JULY("JULY"),
    
    AUGUST("AUGUST"),
    
    SEPTEMBER("SEPTEMBER"),
    
    OCTOBER("OCTOBER"),
    
    NOVEMBER("NOVEMBER"),
    
    DECEMBER("DECEMBER");

    private String value;

    MonthEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MonthEnum fromValue(String value) {
      for (MonthEnum b : MonthEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<MonthEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MonthEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MonthEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return MonthEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_MONTH = "month";
  @SerializedName(SERIALIZED_NAME_MONTH)
  private MonthEnum month;

  public static final String SERIALIZED_NAME_MONTH_VALUE = "monthValue";
  @SerializedName(SERIALIZED_NAME_MONTH_VALUE)
  private Integer monthValue;

  public static final String SERIALIZED_NAME_DAY_OF_MONTH = "dayOfMonth";
  @SerializedName(SERIALIZED_NAME_DAY_OF_MONTH)
  private Integer dayOfMonth;


  public ChargeFeeOnMonthDay month(MonthEnum month) {
    
    this.month = month;
    return this;
  }

   /**
   * Get month
   * @return month
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MonthEnum getMonth() {
    return month;
  }


  public void setMonth(MonthEnum month) {
    this.month = month;
  }


  public ChargeFeeOnMonthDay monthValue(Integer monthValue) {
    
    this.monthValue = monthValue;
    return this;
  }

   /**
   * Get monthValue
   * @return monthValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMonthValue() {
    return monthValue;
  }


  public void setMonthValue(Integer monthValue) {
    this.monthValue = monthValue;
  }


  public ChargeFeeOnMonthDay dayOfMonth(Integer dayOfMonth) {
    
    this.dayOfMonth = dayOfMonth;
    return this;
  }

   /**
   * Get dayOfMonth
   * @return dayOfMonth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getDayOfMonth() {
    return dayOfMonth;
  }


  public void setDayOfMonth(Integer dayOfMonth) {
    this.dayOfMonth = dayOfMonth;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChargeFeeOnMonthDay chargeFeeOnMonthDay = (ChargeFeeOnMonthDay) o;
    return Objects.equals(this.month, chargeFeeOnMonthDay.month) &&
        Objects.equals(this.monthValue, chargeFeeOnMonthDay.monthValue) &&
        Objects.equals(this.dayOfMonth, chargeFeeOnMonthDay.dayOfMonth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(month, monthValue, dayOfMonth);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChargeFeeOnMonthDay {\n");
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
    sb.append("    monthValue: ").append(toIndentedString(monthValue)).append("\n");
    sb.append("    dayOfMonth: ").append(toIndentedString(dayOfMonth)).append("\n");
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

