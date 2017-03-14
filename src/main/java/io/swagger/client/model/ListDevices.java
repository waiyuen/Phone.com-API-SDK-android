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

import io.swagger.client.model.DeviceFull;
import io.swagger.client.model.FilterIdNameArray;
import io.swagger.client.model.SortIdName;
import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ListDevices {
  
  @SerializedName("filters")
  private FilterIdNameArray filters = null;
  @SerializedName("sort")
  private SortIdName sort = null;
  @SerializedName("total")
  private Integer total = null;
  @SerializedName("offset")
  private Integer offset = null;
  @SerializedName("limit")
  private Integer limit = null;
  @SerializedName("items")
  private List<DeviceFull> items = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public FilterIdNameArray getFilters() {
    return filters;
  }
  public void setFilters(FilterIdNameArray filters) {
    this.filters = filters;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public SortIdName getSort() {
    return sort;
  }
  public void setSort(SortIdName sort) {
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
  public List<DeviceFull> getItems() {
    return items;
  }
  public void setItems(List<DeviceFull> items) {
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
    ListDevices listDevices = (ListDevices) o;
    return (this.filters == null ? listDevices.filters == null : this.filters.equals(listDevices.filters)) &&
        (this.sort == null ? listDevices.sort == null : this.sort.equals(listDevices.sort)) &&
        (this.total == null ? listDevices.total == null : this.total.equals(listDevices.total)) &&
        (this.offset == null ? listDevices.offset == null : this.offset.equals(listDevices.offset)) &&
        (this.limit == null ? listDevices.limit == null : this.limit.equals(listDevices.limit)) &&
        (this.items == null ? listDevices.items == null : this.items.equals(listDevices.items));
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
    sb.append("class ListDevices {\n");
    
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