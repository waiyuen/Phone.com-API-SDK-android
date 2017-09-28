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

import io.swagger.client.model.ExpressServiceCodeFull;
import io.swagger.client.model.ListExpressServiceCodes;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class ExpressservicecodesApi {
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
  * Show details of an account Express Service Code
  * This service shows the details of an Account Express Service Code.
   * @param accountId Account ID
   * @param codeId Device ID
   * @return ExpressServiceCodeFull
  */
  public ExpressServiceCodeFull getAccountExpressSrvCode (Integer accountId, Integer codeId) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accountId' when calling getAccountExpressSrvCode",
        new ApiException(400, "Missing the required parameter 'accountId' when calling getAccountExpressSrvCode"));
    }
    // verify the required parameter 'codeId' is set
    if (codeId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'codeId' when calling getAccountExpressSrvCode",
        new ApiException(400, "Missing the required parameter 'codeId' when calling getAccountExpressSrvCode"));
    }

    // create path and map variables
    String path = "/accounts/{account_id}/express-service-codes/{code_id}".replaceAll("\\{" + "account_id" + "\\}", apiInvoker.escapeString(accountId.toString())).replaceAll("\\{" + "code_id" + "\\}", apiInvoker.escapeString(codeId.toString()));

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
         return (ExpressServiceCodeFull) ApiInvoker.deserialize(localVarResponse, "", ExpressServiceCodeFull.class);
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
   * Show details of an account Express Service Code
   * This service shows the details of an Account Express Service Code.
   * @param accountId Account ID   * @param codeId Device ID
  */
  public void getAccountExpressSrvCode (Integer accountId, Integer codeId, final Response.Listener<ExpressServiceCodeFull> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accountId' when calling getAccountExpressSrvCode",
        new ApiException(400, "Missing the required parameter 'accountId' when calling getAccountExpressSrvCode"));
    }
    // verify the required parameter 'codeId' is set
    if (codeId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'codeId' when calling getAccountExpressSrvCode",
        new ApiException(400, "Missing the required parameter 'codeId' when calling getAccountExpressSrvCode"));
    }

    // create path and map variables
    String path = "/accounts/{account_id}/express-service-codes/{code_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "account_id" + "\\}", apiInvoker.escapeString(accountId.toString())).replaceAll("\\{" + "code_id" + "\\}", apiInvoker.escapeString(codeId.toString()));

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
              responseListener.onResponse((ExpressServiceCodeFull) ApiInvoker.deserialize(localVarResponse,  "", ExpressServiceCodeFull.class));
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
  * Get the Express Service Code associated with your account in list format.
  * Get the Express Service Code associated with your account in list format. See Express Service Codes for more detail.
   * @param accountId Account ID
   * @param filtersId ID filter
   * @return ListExpressServiceCodes
  */
  public ListExpressServiceCodes listAccountExpressSrvCodes (Integer accountId, List<String> filtersId) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accountId' when calling listAccountExpressSrvCodes",
        new ApiException(400, "Missing the required parameter 'accountId' when calling listAccountExpressSrvCodes"));
    }

    // create path and map variables
    String path = "/accounts/{account_id}/express-service-codes".replaceAll("\\{" + "account_id" + "\\}", apiInvoker.escapeString(accountId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "filters[id]", filtersId));
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
         return (ListExpressServiceCodes) ApiInvoker.deserialize(localVarResponse, "", ListExpressServiceCodes.class);
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
   * Get the Express Service Code associated with your account in list format.
   * Get the Express Service Code associated with your account in list format. See Express Service Codes for more detail.
   * @param accountId Account ID   * @param filtersId ID filter
  */
  public void listAccountExpressSrvCodes (Integer accountId, List<String> filtersId, final Response.Listener<ListExpressServiceCodes> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accountId' when calling listAccountExpressSrvCodes",
        new ApiException(400, "Missing the required parameter 'accountId' when calling listAccountExpressSrvCodes"));
    }

    // create path and map variables
    String path = "/accounts/{account_id}/express-service-codes".replaceAll("\\{format\\}","json").replaceAll("\\{" + "account_id" + "\\}", apiInvoker.escapeString(accountId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "filters[id]", filtersId));


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
              responseListener.onResponse((ListExpressServiceCodes) ApiInvoker.deserialize(localVarResponse,  "", ListExpressServiceCodes.class));
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
