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

import io.swagger.client.model.RuleSetAction;
import io.swagger.client.model.RuleSetFilter;
import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class RuleSet {
  
  @SerializedName("filter")
  private RuleSetFilter filter = null;
  @SerializedName("actions")
  private List<RuleSetAction> actions = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public RuleSetFilter getFilter() {
    return filter;
  }
  public void setFilter(RuleSetFilter filter) {
    this.filter = filter;
  }

  /**
   * Array of Action Objects. Required. Routes have rule sets, and rule sets have one or more actions. The supported actions are described below:
   **/
  @ApiModelProperty(value = "Array of Action Objects. Required. Routes have rule sets, and rule sets have one or more actions. The supported actions are described below:")
  public List<RuleSetAction> getActions() {
    return actions;
  }
  public void setActions(List<RuleSetAction> actions) {
    this.actions = actions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RuleSet ruleSet = (RuleSet) o;
    return (this.filter == null ? ruleSet.filter == null : this.filter.equals(ruleSet.filter)) &&
        (this.actions == null ? ruleSet.actions == null : this.actions.equals(ruleSet.actions));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.filter == null ? 0: this.filter.hashCode());
    result = 31 * result + (this.actions == null ? 0: this.actions.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuleSet {\n");
    
    sb.append("  filter: ").append(filter).append("\n");
    sb.append("  actions: ").append(actions).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}