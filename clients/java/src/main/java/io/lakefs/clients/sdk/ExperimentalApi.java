/*
 * lakeFS API
 * lakeFS HTTP API
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.lakefs.clients.sdk;

import io.lakefs.clients.sdk.ApiCallback;
import io.lakefs.clients.sdk.ApiClient;
import io.lakefs.clients.sdk.ApiException;
import io.lakefs.clients.sdk.ApiResponse;
import io.lakefs.clients.sdk.Configuration;
import io.lakefs.clients.sdk.Pair;
import io.lakefs.clients.sdk.ProgressRequestBody;
import io.lakefs.clients.sdk.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.lakefs.clients.sdk.model.Error;
import io.lakefs.clients.sdk.model.OTFDiffs;
import io.lakefs.clients.sdk.model.OtfDiffList;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExperimentalApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ExperimentalApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ExperimentalApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call getOtfDiffsCall(final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/otf/diffs";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "basic_auth", "cookie_auth", "oidc_auth", "saml_auth", "jwt_token" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getOtfDiffsValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return getOtfDiffsCall(_callback);

    }


    private ApiResponse<OTFDiffs> getOtfDiffsWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getOtfDiffsValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<OTFDiffs>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getOtfDiffsAsync(final ApiCallback<OTFDiffs> _callback) throws ApiException {

        okhttp3.Call localVarCall = getOtfDiffsValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<OTFDiffs>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIgetOtfDiffsRequest {

        private APIgetOtfDiffsRequest() {
        }

        /**
         * Build call for getOtfDiffs
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> available Open Table Format diffs </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
            <tr><td> 420 </td><td> too many requests </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Internal Server Error </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getOtfDiffsCall(_callback);
        }

        /**
         * Execute getOtfDiffs request
         * @return OTFDiffs
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> available Open Table Format diffs </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
            <tr><td> 420 </td><td> too many requests </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Internal Server Error </td><td>  -  </td></tr>
         </table>
         */
        public OTFDiffs execute() throws ApiException {
            ApiResponse<OTFDiffs> localVarResp = getOtfDiffsWithHttpInfo();
            return localVarResp.getData();
        }

        /**
         * Execute getOtfDiffs request with HTTP info returned
         * @return ApiResponse&lt;OTFDiffs&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> available Open Table Format diffs </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
            <tr><td> 420 </td><td> too many requests </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Internal Server Error </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<OTFDiffs> executeWithHttpInfo() throws ApiException {
            return getOtfDiffsWithHttpInfo();
        }

        /**
         * Execute getOtfDiffs request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> available Open Table Format diffs </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
            <tr><td> 420 </td><td> too many requests </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Internal Server Error </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<OTFDiffs> _callback) throws ApiException {
            return getOtfDiffsAsync(_callback);
        }
    }

    /**
     * get the available Open Table Format diffs
     * 
     * @return APIgetOtfDiffsRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> available Open Table Format diffs </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 420 </td><td> too many requests </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public APIgetOtfDiffsRequest getOtfDiffs() {
        return new APIgetOtfDiffsRequest();
    }
    private okhttp3.Call otfDiffCall(String repository, String leftRef, String rightRef, String tablePath, String type, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/repositories/{repository}/otf/refs/{left_ref}/diff/{right_ref}"
            .replace("{" + "repository" + "}", localVarApiClient.escapeString(repository.toString()))
            .replace("{" + "left_ref" + "}", localVarApiClient.escapeString(leftRef.toString()))
            .replace("{" + "right_ref" + "}", localVarApiClient.escapeString(rightRef.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (tablePath != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("table_path", tablePath));
        }

        if (type != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("type", type));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "basic_auth", "cookie_auth", "oidc_auth", "saml_auth", "jwt_token" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call otfDiffValidateBeforeCall(String repository, String leftRef, String rightRef, String tablePath, String type, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'repository' is set
        if (repository == null) {
            throw new ApiException("Missing the required parameter 'repository' when calling otfDiff(Async)");
        }

        // verify the required parameter 'leftRef' is set
        if (leftRef == null) {
            throw new ApiException("Missing the required parameter 'leftRef' when calling otfDiff(Async)");
        }

        // verify the required parameter 'rightRef' is set
        if (rightRef == null) {
            throw new ApiException("Missing the required parameter 'rightRef' when calling otfDiff(Async)");
        }

        // verify the required parameter 'tablePath' is set
        if (tablePath == null) {
            throw new ApiException("Missing the required parameter 'tablePath' when calling otfDiff(Async)");
        }

        // verify the required parameter 'type' is set
        if (type == null) {
            throw new ApiException("Missing the required parameter 'type' when calling otfDiff(Async)");
        }

        return otfDiffCall(repository, leftRef, rightRef, tablePath, type, _callback);

    }


    private ApiResponse<OtfDiffList> otfDiffWithHttpInfo(String repository, String leftRef, String rightRef, String tablePath, String type) throws ApiException {
        okhttp3.Call localVarCall = otfDiffValidateBeforeCall(repository, leftRef, rightRef, tablePath, type, null);
        Type localVarReturnType = new TypeToken<OtfDiffList>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call otfDiffAsync(String repository, String leftRef, String rightRef, String tablePath, String type, final ApiCallback<OtfDiffList> _callback) throws ApiException {

        okhttp3.Call localVarCall = otfDiffValidateBeforeCall(repository, leftRef, rightRef, tablePath, type, _callback);
        Type localVarReturnType = new TypeToken<OtfDiffList>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIotfDiffRequest {
        private final String repository;
        private final String leftRef;
        private final String rightRef;
        private final String tablePath;
        private final String type;

        private APIotfDiffRequest(String repository, String leftRef, String rightRef, String tablePath, String type) {
            this.repository = repository;
            this.leftRef = leftRef;
            this.rightRef = rightRef;
            this.tablePath = tablePath;
            this.type = type;
        }

        /**
         * Build call for otfDiff
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> diff list </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Resource Not Found </td><td>  -  </td></tr>
            <tr><td> 412 </td><td> Precondition Failed </td><td>  -  </td></tr>
            <tr><td> 420 </td><td> too many requests </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Internal Server Error </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return otfDiffCall(repository, leftRef, rightRef, tablePath, type, _callback);
        }

        /**
         * Execute otfDiff request
         * @return OtfDiffList
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> diff list </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Resource Not Found </td><td>  -  </td></tr>
            <tr><td> 412 </td><td> Precondition Failed </td><td>  -  </td></tr>
            <tr><td> 420 </td><td> too many requests </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Internal Server Error </td><td>  -  </td></tr>
         </table>
         */
        public OtfDiffList execute() throws ApiException {
            ApiResponse<OtfDiffList> localVarResp = otfDiffWithHttpInfo(repository, leftRef, rightRef, tablePath, type);
            return localVarResp.getData();
        }

        /**
         * Execute otfDiff request with HTTP info returned
         * @return ApiResponse&lt;OtfDiffList&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> diff list </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Resource Not Found </td><td>  -  </td></tr>
            <tr><td> 412 </td><td> Precondition Failed </td><td>  -  </td></tr>
            <tr><td> 420 </td><td> too many requests </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Internal Server Error </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<OtfDiffList> executeWithHttpInfo() throws ApiException {
            return otfDiffWithHttpInfo(repository, leftRef, rightRef, tablePath, type);
        }

        /**
         * Execute otfDiff request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> diff list </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Resource Not Found </td><td>  -  </td></tr>
            <tr><td> 412 </td><td> Precondition Failed </td><td>  -  </td></tr>
            <tr><td> 420 </td><td> too many requests </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Internal Server Error </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<OtfDiffList> _callback) throws ApiException {
            return otfDiffAsync(repository, leftRef, rightRef, tablePath, type, _callback);
        }
    }

    /**
     * perform otf diff
     * 
     * @param repository  (required)
     * @param leftRef  (required)
     * @param rightRef  (required)
     * @param tablePath a path to the table location under the specified ref. (required)
     * @param type the type of otf (required)
     * @return APIotfDiffRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> diff list </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Resource Not Found </td><td>  -  </td></tr>
        <tr><td> 412 </td><td> Precondition Failed </td><td>  -  </td></tr>
        <tr><td> 420 </td><td> too many requests </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public APIotfDiffRequest otfDiff(String repository, String leftRef, String rightRef, String tablePath, String type) {
        return new APIotfDiffRequest(repository, leftRef, rightRef, tablePath, type);
    }
}
