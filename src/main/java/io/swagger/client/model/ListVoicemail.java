/**
 * Phone.com API
 * This is a Phone.com api Swagger definition
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apisupport@phone.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import io.swagger.client.model.FilterVoicemailArray;
import io.swagger.client.model.SortIdCreatedAt;
import io.swagger.client.model.VoicemailFull;
import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ListVoicemail {
  
  @SerializedName("filters")
  private FilterVoicemailArray filters = null;
  @SerializedName("sort")
  private SortIdCreatedAt sort = null;
  @SerializedName("total")
  private Integer total = null;
  @SerializedName("offset")
  private Integer offset = null;
  @SerializedName("limit")
  private Integer limit = null;
  @SerializedName("items")
  private List<VoicemailFull> items = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public FilterVoicemailArray getFilters() {
    return filters;
  }
  public void setFilters(FilterVoicemailArray filters) {
    this.filters = filters;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public SortIdCreatedAt getSort() {
    return sort;
  }
  public void setSort(SortIdCreatedAt sort) {
    this.sort = sort;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getTotal() {
    return total;
  }
  public void setTotal(Integer total) {
    this.total = total;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getOffset() {
    return offset;
  }
  public void setOffset(Integer offset) {
    this.offset = offset;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getLimit() {
    return limit;
  }
  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<VoicemailFull> getItems() {
    return items;
  }
  public void setItems(List<VoicemailFull> items) {
    this.items = items;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListVoicemail listVoicemail = (ListVoicemail) o;
    return (this.filters == null ? listVoicemail.filters == null : this.filters.equals(listVoicemail.filters)) &&
        (this.sort == null ? listVoicemail.sort == null : this.sort.equals(listVoicemail.sort)) &&
        (this.total == null ? listVoicemail.total == null : this.total.equals(listVoicemail.total)) &&
        (this.offset == null ? listVoicemail.offset == null : this.offset.equals(listVoicemail.offset)) &&
        (this.limit == null ? listVoicemail.limit == null : this.limit.equals(listVoicemail.limit)) &&
        (this.items == null ? listVoicemail.items == null : this.items.equals(listVoicemail.items));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.filters == null ? 0: this.filters.hashCode());
    result = 31 * result + (this.sort == null ? 0: this.sort.hashCode());
    result = 31 * result + (this.total == null ? 0: this.total.hashCode());
    result = 31 * result + (this.offset == null ? 0: this.offset.hashCode());
    result = 31 * result + (this.limit == null ? 0: this.limit.hashCode());
    result = 31 * result + (this.items == null ? 0: this.items.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListVoicemail {\n");
    
    sb.append("  filters: ").append(filters).append("\n");
    sb.append("  sort: ").append(sort).append("\n");
    sb.append("  total: ").append(total).append("\n");
    sb.append("  offset: ").append(offset).append("\n");
    sb.append("  limit: ").append(limit).append("\n");
    sb.append("  items: ").append(items).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
