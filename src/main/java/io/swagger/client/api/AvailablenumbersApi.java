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

import io.swagger.client.model.ListAvailableNumbers;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class AvailablenumbersApi {
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
  * 
  * 
   * @param filtersPhoneNumber Phone number filter
   * @param filtersCountryCode Country Code filter
   * @param filtersNpa Area Code filter (North America only)
   * @param filtersNxx 2nd set of 3 digits filter (North America only)
   * @param filtersXxxx NANP XXXX filter
   * @param filtersCity City filter
   * @param filtersProvince State or Province (postal code) filter
   * @param filtersCountry Country (postal code) filter
   * @param filtersPrice Price filter
   * @param filtersCategory Category filter
   * @param sortInternal Internal (quasi-random) sorting
   * @param sortPrice Price sorting
   * @param sortPhoneNumber Phone number sorting
   * @param limit Max results
   * @param offset Results to skip
   * @param fields Field set
   * @return ListAvailableNumbers
  */
  public ListAvailableNumbers listAvailablePhoneNumbers (List<String> filtersPhoneNumber, List<String> filtersCountryCode, List<String> filtersNpa, List<String> filtersNxx, List<String> filtersXxxx, List<String> filtersCity, List<String> filtersProvince, List<String> filtersCountry, List<String> filtersPrice, List<String> filtersCategory, String sortInternal, String sortPrice, String sortPhoneNumber, Integer limit, Integer offset, String fields) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = null;

    // create path and map variables
    String path = "/phone-numbers/available";

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "filters[phone_number]", filtersPhoneNumber));
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "filters[country_code]", filtersCountryCode));
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "filters[npa]", filtersNpa));
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "filters[nxx]", filtersNxx));
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "filters[xxxx]", filtersXxxx));
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "filters[city]", filtersCity));
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "filters[province]", filtersProvince));
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "filters[country]", filtersCountry));
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "filters[price]", filtersPrice));
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "filters[category]", filtersCategory));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "sort[internal]", sortInternal));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "sort[price]", sortPrice));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "sort[phone_number]", sortPhoneNumber));
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
         return (ListAvailableNumbers) ApiInvoker.deserialize(localVarResponse, "", ListAvailableNumbers.class);
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
   * 
   * 
   * @param filtersPhoneNumber Phone number filter   * @param filtersCountryCode Country Code filter   * @param filtersNpa Area Code filter (North America only)   * @param filtersNxx 2nd set of 3 digits filter (North America only)   * @param filtersXxxx NANP XXXX filter   * @param filtersCity City filter   * @param filtersProvince State or Province (postal code) filter   * @param filtersCountry Country (postal code) filter   * @param filtersPrice Price filter   * @param filtersCategory Category filter   * @param sortInternal Internal (quasi-random) sorting   * @param sortPrice Price sorting   * @param sortPhoneNumber Phone number sorting   * @param limit Max results   * @param offset Results to skip   * @param fields Field set
  */
  public void listAvailablePhoneNumbers (List<String> filtersPhoneNumber, List<String> filtersCountryCode, List<String> filtersNpa, List<String> filtersNxx, List<String> filtersXxxx, List<String> filtersCity, List<String> filtersProvince, List<String> filtersCountry, List<String> filtersPrice, List<String> filtersCategory, String sortInternal, String sortPrice, String sortPhoneNumber, Integer limit, Integer offset, String fields, final Response.Listener<ListAvailableNumbers> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;


    // create path and map variables
    String path = "/phone-numbers/available".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "filters[phone_number]", filtersPhoneNumber));
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "filters[country_code]", filtersCountryCode));
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "filters[npa]", filtersNpa));
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "filters[nxx]", filtersNxx));
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "filters[xxxx]", filtersXxxx));
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "filters[city]", filtersCity));
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "filters[province]", filtersProvince));
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "filters[country]", filtersCountry));
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "filters[price]", filtersPrice));
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "filters[category]", filtersCategory));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "sort[internal]", sortInternal));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "sort[price]", sortPrice));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "sort[phone_number]", sortPhoneNumber));
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
              responseListener.onResponse((ListAvailableNumbers) ApiInvoker.deserialize(localVarResponse,  "", ListAvailableNumbers.class));
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
