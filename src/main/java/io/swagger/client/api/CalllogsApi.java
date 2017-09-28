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

package io.swagger.client.api;

import io.swagger.client.ApiInvoker;
import io.swagger.client.ApiException;
import io.swagger.client.Pair;

import io.swagger.client.model.*;

import java.util.*;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import io.swagger.client.model.CallLogFull;
import io.swagger.client.model.ListCallLogs;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class CalllogsApi {
  String basePath = "https://api.phone.com/v4";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public void addHeader(String key, String value) {
    getInvoker().addDefaultHeader(key, value);
  }

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }

  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public String getBasePath() {
    return basePath;
  }

  /**
  * Show details of an individual Call Log entry
  * Show details of an individual Call Log entry. See Call Logs for more detail.
   * @param accountId Account ID
   * @param callId Call ID
   * @return CallLogFull
  */
  public CallLogFull getAccountCallLogs (Integer accountId, String callId) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accountId' when calling getAccountCallLogs",
        new ApiException(400, "Missing the required parameter 'accountId' when calling getAccountCallLogs"));
    }
    // verify the required parameter 'callId' is set
    if (callId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'callId' when calling getAccountCallLogs",
        new ApiException(400, "Missing the required parameter 'callId' when calling getAccountCallLogs"));
    }

    // create path and map variables
    String path = "/accounts/{account_id}/call-logs/{call_id}".replaceAll("\\{" + "account_id" + "\\}", apiInvoker.escapeString(accountId.toString())).replaceAll("\\{" + "call_id" + "\\}", apiInvoker.escapeString(callId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] { "apiKey" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (CallLogFull) ApiInvoker.deserialize(localVarResponse, "", CallLogFull.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * Show details of an individual Call Log entry
   * Show details of an individual Call Log entry. See Call Logs for more detail.
   * @param accountId Account ID   * @param callId Call ID
  */
  public void getAccountCallLogs (Integer accountId, String callId, final Response.Listener<CallLogFull> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accountId' when calling getAccountCallLogs",
        new ApiException(400, "Missing the required parameter 'accountId' when calling getAccountCallLogs"));
    }
    // verify the required parameter 'callId' is set
    if (callId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'callId' when calling getAccountCallLogs",
        new ApiException(400, "Missing the required parameter 'callId' when calling getAccountCallLogs"));
    }

    // create path and map variables
    String path = "/accounts/{account_id}/call-logs/{call_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "account_id" + "\\}", apiInvoker.escapeString(accountId.toString())).replaceAll("\\{" + "call_id" + "\\}", apiInvoker.escapeString(callId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] { "apiKey" };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((CallLogFull) ApiInvoker.deserialize(localVarResponse,  "", CallLogFull.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Get a list of call details associated with your account
  * Get a list of call details associated with your account. See Call Logs for more detail.
   * @param accountId Account ID
   * @param filtersId ID filter
   * @param filtersStartTime Call start time filter
   * @param filtersCreatedAt Call log creation time filter
   * @param filtersDirection Call direction filter: in or out
   * @param filtersCalledNumber Called number
   * @param filtersType Call type, such as &#39;call&#39;, &#39;fax&#39;, &#39;audiogram&#39;
   * @param filtersExtension Extension filter
   * @param sortId ID sorting
   * @param sortStartTime Sorting by call start time: asc or desc
   * @param sortCreatedAt Sorting by call log creation time: asc or desc
   * @param limit Max results
   * @param offset Results to skip
   * @param fields Field set
   * @return ListCallLogs
  */
  public ListCallLogs listAccountCallLogs (Integer accountId, List<String> filtersId, List<String> filtersStartTime, String filtersCreatedAt, String filtersDirection, String filtersCalledNumber, String filtersType, List<String> filtersExtension, String sortId, String sortStartTime, String sortCreatedAt, Integer limit, Integer offset, String fields) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accountId' when calling listAccountCallLogs",
        new ApiException(400, "Missing the required parameter 'accountId' when calling listAccountCallLogs"));
    }

    // create path and map variables
    String path = "/accounts/{account_id}/call-logs".replaceAll("\\{" + "account_id" + "\\}", apiInvoker.escapeString(accountId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "filters[id]", filtersId));
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "filters[start_time]", filtersStartTime));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "filters[created_at]", filtersCreatedAt));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "filters[direction]", filtersDirection));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "filters[called_number]", filtersCalledNumber));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "filters[type]", filtersType));
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "filters[extension]", filtersExtension));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "sort[id]", sortId));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "sort[start_time]", sortStartTime));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "sort[created_at]", sortCreatedAt));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "offset", offset));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "fields", fields));
    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] { "apiKey" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (ListCallLogs) ApiInvoker.deserialize(localVarResponse, "", ListCallLogs.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * Get a list of call details associated with your account
   * Get a list of call details associated with your account. See Call Logs for more detail.
   * @param accountId Account ID   * @param filtersId ID filter   * @param filtersStartTime Call start time filter   * @param filtersCreatedAt Call log creation time filter   * @param filtersDirection Call direction filter: in or out   * @param filtersCalledNumber Called number   * @param filtersType Call type, such as &#39;call&#39;, &#39;fax&#39;, &#39;audiogram&#39;   * @param filtersExtension Extension filter   * @param sortId ID sorting   * @param sortStartTime Sorting by call start time: asc or desc   * @param sortCreatedAt Sorting by call log creation time: asc or desc   * @param limit Max results   * @param offset Results to skip   * @param fields Field set
  */
  public void listAccountCallLogs (Integer accountId, List<String> filtersId, List<String> filtersStartTime, String filtersCreatedAt, String filtersDirection, String filtersCalledNumber, String filtersType, List<String> filtersExtension, String sortId, String sortStartTime, String sortCreatedAt, Integer limit, Integer offset, String fields, final Response.Listener<ListCallLogs> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accountId' when calling listAccountCallLogs",
        new ApiException(400, "Missing the required parameter 'accountId' when calling listAccountCallLogs"));
    }

    // create path and map variables
    String path = "/accounts/{account_id}/call-logs".replaceAll("\\{format\\}","json").replaceAll("\\{" + "account_id" + "\\}", apiInvoker.escapeString(accountId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "filters[id]", filtersId));
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "filters[start_time]", filtersStartTime));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "filters[created_at]", filtersCreatedAt));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "filters[direction]", filtersDirection));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "filters[called_number]", filtersCalledNumber));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "filters[type]", filtersType));
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "filters[extension]", filtersExtension));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "sort[id]", sortId));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "sort[start_time]", sortStartTime));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "sort[created_at]", sortCreatedAt));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "offset", offset));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "fields", fields));


    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] { "apiKey" };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((ListCallLogs) ApiInvoker.deserialize(localVarResponse,  "", ListCallLogs.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
}
