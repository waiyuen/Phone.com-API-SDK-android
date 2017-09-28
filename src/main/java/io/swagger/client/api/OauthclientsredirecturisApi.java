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

import io.swagger.client.model.CreateRedirectUriParams;
import io.swagger.client.model.DeleteEntry;
import io.swagger.client.model.ListOauthClientsRedirectUris;
import io.swagger.client.model.OauthClientRedirectUriFull;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class OauthclientsredirecturisApi {
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
  * Create an OAuth Client Redirect URI record.
  * Create an OAuth Client Redirect URI record.
   * @param accountId Account ID
   * @param clientId Client ID
   * @param data Redirect Uri data
   * @return OauthClientRedirectUriFull
  */
  public OauthClientRedirectUriFull createAccountOauthClientsRedirectUri (Integer accountId, Integer clientId, CreateRedirectUriParams data) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = data;
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accountId' when calling createAccountOauthClientsRedirectUri",
        new ApiException(400, "Missing the required parameter 'accountId' when calling createAccountOauthClientsRedirectUri"));
    }
    // verify the required parameter 'clientId' is set
    if (clientId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'clientId' when calling createAccountOauthClientsRedirectUri",
        new ApiException(400, "Missing the required parameter 'clientId' when calling createAccountOauthClientsRedirectUri"));
    }

    // create path and map variables
    String path = "/accounts/{account_id}/oauth/clients/{client_id}/redirect-uris".replaceAll("\\{" + "account_id" + "\\}", apiInvoker.escapeString(accountId.toString())).replaceAll("\\{" + "client_id" + "\\}", apiInvoker.escapeString(clientId.toString()));

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
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (OauthClientRedirectUriFull) ApiInvoker.deserialize(localVarResponse, "", OauthClientRedirectUriFull.class);
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
   * Create an OAuth Client Redirect URI record.
   * Create an OAuth Client Redirect URI record.
   * @param accountId Account ID   * @param clientId Client ID   * @param data Redirect Uri data
  */
  public void createAccountOauthClientsRedirectUri (Integer accountId, Integer clientId, CreateRedirectUriParams data, final Response.Listener<OauthClientRedirectUriFull> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = data;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accountId' when calling createAccountOauthClientsRedirectUri",
        new ApiException(400, "Missing the required parameter 'accountId' when calling createAccountOauthClientsRedirectUri"));
    }
    // verify the required parameter 'clientId' is set
    if (clientId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'clientId' when calling createAccountOauthClientsRedirectUri",
        new ApiException(400, "Missing the required parameter 'clientId' when calling createAccountOauthClientsRedirectUri"));
    }

    // create path and map variables
    String path = "/accounts/{account_id}/oauth/clients/{client_id}/redirect-uris".replaceAll("\\{format\\}","json").replaceAll("\\{" + "account_id" + "\\}", apiInvoker.escapeString(accountId.toString())).replaceAll("\\{" + "client_id" + "\\}", apiInvoker.escapeString(clientId.toString()));

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
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((OauthClientRedirectUriFull) ApiInvoker.deserialize(localVarResponse,  "", OauthClientRedirectUriFull.class));
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
  * Delete an OAuth Client Redirect URI record.
  * Delete an OAuth Client Redirect URI record.
   * @param accountId Account ID
   * @param clientId Client ID
   * @param uriId Redirect URI ID
   * @return DeleteEntry
  */
  public DeleteEntry deleteAccountOauthClientsRedirectUri (Integer accountId, Integer clientId, Integer uriId) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accountId' when calling deleteAccountOauthClientsRedirectUri",
        new ApiException(400, "Missing the required parameter 'accountId' when calling deleteAccountOauthClientsRedirectUri"));
    }
    // verify the required parameter 'clientId' is set
    if (clientId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'clientId' when calling deleteAccountOauthClientsRedirectUri",
        new ApiException(400, "Missing the required parameter 'clientId' when calling deleteAccountOauthClientsRedirectUri"));
    }
    // verify the required parameter 'uriId' is set
    if (uriId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'uriId' when calling deleteAccountOauthClientsRedirectUri",
        new ApiException(400, "Missing the required parameter 'uriId' when calling deleteAccountOauthClientsRedirectUri"));
    }

    // create path and map variables
    String path = "/accounts/{account_id}/oauth/clients/{client_id}/redirect-uris/{uri_id}".replaceAll("\\{" + "account_id" + "\\}", apiInvoker.escapeString(accountId.toString())).replaceAll("\\{" + "client_id" + "\\}", apiInvoker.escapeString(clientId.toString())).replaceAll("\\{" + "uri_id" + "\\}", apiInvoker.escapeString(uriId.toString()));

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
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (DeleteEntry) ApiInvoker.deserialize(localVarResponse, "", DeleteEntry.class);
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
   * Delete an OAuth Client Redirect URI record.
   * Delete an OAuth Client Redirect URI record.
   * @param accountId Account ID   * @param clientId Client ID   * @param uriId Redirect URI ID
  */
  public void deleteAccountOauthClientsRedirectUri (Integer accountId, Integer clientId, Integer uriId, final Response.Listener<DeleteEntry> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accountId' when calling deleteAccountOauthClientsRedirectUri",
        new ApiException(400, "Missing the required parameter 'accountId' when calling deleteAccountOauthClientsRedirectUri"));
    }
    // verify the required parameter 'clientId' is set
    if (clientId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'clientId' when calling deleteAccountOauthClientsRedirectUri",
        new ApiException(400, "Missing the required parameter 'clientId' when calling deleteAccountOauthClientsRedirectUri"));
    }
    // verify the required parameter 'uriId' is set
    if (uriId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'uriId' when calling deleteAccountOauthClientsRedirectUri",
        new ApiException(400, "Missing the required parameter 'uriId' when calling deleteAccountOauthClientsRedirectUri"));
    }

    // create path and map variables
    String path = "/accounts/{account_id}/oauth/clients/{client_id}/redirect-uris/{uri_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "account_id" + "\\}", apiInvoker.escapeString(accountId.toString())).replaceAll("\\{" + "client_id" + "\\}", apiInvoker.escapeString(clientId.toString())).replaceAll("\\{" + "uri_id" + "\\}", apiInvoker.escapeString(uriId.toString()));

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
      apiInvoker.invokeAPI(basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((DeleteEntry) ApiInvoker.deserialize(localVarResponse,  "", DeleteEntry.class));
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
  * Get details of an OAuth Client Redirect URI record.
  * Get details of an OAuth Client Redirect URI record.
   * @param accountId Account ID
   * @param clientId Client ID
   * @param uriId Redirect URI ID
   * @return OauthClientRedirectUriFull
  */
  public OauthClientRedirectUriFull getAccountOauthClientsRedirectUri (Integer accountId, Integer clientId, Integer uriId) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accountId' when calling getAccountOauthClientsRedirectUri",
        new ApiException(400, "Missing the required parameter 'accountId' when calling getAccountOauthClientsRedirectUri"));
    }
    // verify the required parameter 'clientId' is set
    if (clientId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'clientId' when calling getAccountOauthClientsRedirectUri",
        new ApiException(400, "Missing the required parameter 'clientId' when calling getAccountOauthClientsRedirectUri"));
    }
    // verify the required parameter 'uriId' is set
    if (uriId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'uriId' when calling getAccountOauthClientsRedirectUri",
        new ApiException(400, "Missing the required parameter 'uriId' when calling getAccountOauthClientsRedirectUri"));
    }

    // create path and map variables
    String path = "/accounts/{account_id}/oauth/clients/{client_id}/redirect-uris/{uri_id}".replaceAll("\\{" + "account_id" + "\\}", apiInvoker.escapeString(accountId.toString())).replaceAll("\\{" + "client_id" + "\\}", apiInvoker.escapeString(clientId.toString())).replaceAll("\\{" + "uri_id" + "\\}", apiInvoker.escapeString(uriId.toString()));

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
         return (OauthClientRedirectUriFull) ApiInvoker.deserialize(localVarResponse, "", OauthClientRedirectUriFull.class);
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
   * Get details of an OAuth Client Redirect URI record.
   * Get details of an OAuth Client Redirect URI record.
   * @param accountId Account ID   * @param clientId Client ID   * @param uriId Redirect URI ID
  */
  public void getAccountOauthClientsRedirectUri (Integer accountId, Integer clientId, Integer uriId, final Response.Listener<OauthClientRedirectUriFull> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accountId' when calling getAccountOauthClientsRedirectUri",
        new ApiException(400, "Missing the required parameter 'accountId' when calling getAccountOauthClientsRedirectUri"));
    }
    // verify the required parameter 'clientId' is set
    if (clientId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'clientId' when calling getAccountOauthClientsRedirectUri",
        new ApiException(400, "Missing the required parameter 'clientId' when calling getAccountOauthClientsRedirectUri"));
    }
    // verify the required parameter 'uriId' is set
    if (uriId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'uriId' when calling getAccountOauthClientsRedirectUri",
        new ApiException(400, "Missing the required parameter 'uriId' when calling getAccountOauthClientsRedirectUri"));
    }

    // create path and map variables
    String path = "/accounts/{account_id}/oauth/clients/{client_id}/redirect-uris/{uri_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "account_id" + "\\}", apiInvoker.escapeString(accountId.toString())).replaceAll("\\{" + "client_id" + "\\}", apiInvoker.escapeString(clientId.toString())).replaceAll("\\{" + "uri_id" + "\\}", apiInvoker.escapeString(uriId.toString()));

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
              responseListener.onResponse((OauthClientRedirectUriFull) ApiInvoker.deserialize(localVarResponse,  "", OauthClientRedirectUriFull.class));
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
  * Get a list of OAuth Client Redirect URIs for an account.
  * Get a list of OAuth Client Redirect URIs for an account.
   * @param accountId Account ID
   * @param clientId Client ID
   * @param filtersId ID filter
   * @param sortId ID sorting
   * @param limit Max results
   * @param offset Results to skip
   * @param fields Field set
   * @return ListOauthClientsRedirectUris
  */
  public ListOauthClientsRedirectUris listAccountOauthClientsRedirectUris (Integer accountId, Integer clientId, List<String> filtersId, String sortId, Integer limit, Integer offset, String fields) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accountId' when calling listAccountOauthClientsRedirectUris",
        new ApiException(400, "Missing the required parameter 'accountId' when calling listAccountOauthClientsRedirectUris"));
    }
    // verify the required parameter 'clientId' is set
    if (clientId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'clientId' when calling listAccountOauthClientsRedirectUris",
        new ApiException(400, "Missing the required parameter 'clientId' when calling listAccountOauthClientsRedirectUris"));
    }

    // create path and map variables
    String path = "/accounts/{account_id}/oauth/clients/{client_id}/redirect-uris".replaceAll("\\{" + "account_id" + "\\}", apiInvoker.escapeString(accountId.toString())).replaceAll("\\{" + "client_id" + "\\}", apiInvoker.escapeString(clientId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "filters[id]", filtersId));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "sort[id]", sortId));
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
         return (ListOauthClientsRedirectUris) ApiInvoker.deserialize(localVarResponse, "", ListOauthClientsRedirectUris.class);
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
   * Get a list of OAuth Client Redirect URIs for an account.
   * Get a list of OAuth Client Redirect URIs for an account.
   * @param accountId Account ID   * @param clientId Client ID   * @param filtersId ID filter   * @param sortId ID sorting   * @param limit Max results   * @param offset Results to skip   * @param fields Field set
  */
  public void listAccountOauthClientsRedirectUris (Integer accountId, Integer clientId, List<String> filtersId, String sortId, Integer limit, Integer offset, String fields, final Response.Listener<ListOauthClientsRedirectUris> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'accountId' when calling listAccountOauthClientsRedirectUris",
        new ApiException(400, "Missing the required parameter 'accountId' when calling listAccountOauthClientsRedirectUris"));
    }
    // verify the required parameter 'clientId' is set
    if (clientId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'clientId' when calling listAccountOauthClientsRedirectUris",
        new ApiException(400, "Missing the required parameter 'clientId' when calling listAccountOauthClientsRedirectUris"));
    }

    // create path and map variables
    String path = "/accounts/{account_id}/oauth/clients/{client_id}/redirect-uris".replaceAll("\\{format\\}","json").replaceAll("\\{" + "account_id" + "\\}", apiInvoker.escapeString(accountId.toString())).replaceAll("\\{" + "client_id" + "\\}", apiInvoker.escapeString(clientId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "filters[id]", filtersId));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "sort[id]", sortId));
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
              responseListener.onResponse((ListOauthClientsRedirectUris) ApiInvoker.deserialize(localVarResponse,  "", ListOauthClientsRedirectUris.class));
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