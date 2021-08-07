# AuditsApi

All URIs are relative to *https://localhost:8443/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**retrieveAuditEntries**](AuditsApi.md#retrieveAuditEntries) | **GET** audits | List Audits
[**retrieveAuditEntry**](AuditsApi.md#retrieveAuditEntry) | **GET** audits/{auditId} | Retrieve an Audit Entry
[**retrieveAuditSearchTemplate**](AuditsApi.md#retrieveAuditSearchTemplate) | **GET** audits/searchtemplate | Audit Search Template



## retrieveAuditEntries

> List&lt;GetMakerCheckerResponse&gt; retrieveAuditEntries(actionName, entityName, resourceId, makerId, makerDateTimeFrom, makerDateTimeTo, checkerId, checkerDateTimeFrom, checkerDateTimeTo, processingResult, officeId, groupId, clientId, loanid, savingsAccountId, paged, offset, limit, orderBy, sortOrder)

List Audits

Get a 200 list of audits that match the criteria supplied and sorted by audit id in descending order, and are within the requestors&#39; data scope. Also it supports pagination and sorting  Example Requests:  audits  audits?fields&#x3D;madeOnDate,maker,processingResult  audits?makerDateTimeFrom&#x3D;2013-03-25 08:00:00&amp;makerDateTimeTo&#x3D;2013-04-04 18:00:00  audits?officeId&#x3D;1  audits?officeId&#x3D;1&amp;includeJson&#x3D;true

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.AuditsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8443/fineract-provider/api/v1");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        // Configure API key authorization: tenantid
        ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
        tenantid.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tenantid.setApiKeyPrefix("Token");

        AuditsApi apiInstance = new AuditsApi(defaultClient);
        String actionName = "actionName_example"; // String | actionName
        String entityName = "entityName_example"; // String | entityName
        Long resourceId = 56L; // Long | resourceId
        Long makerId = 56L; // Long | makerId
        String makerDateTimeFrom = "makerDateTimeFrom_example"; // String | makerDateTimeFrom
        String makerDateTimeTo = "makerDateTimeTo_example"; // String | makerDateTimeTo
        Long checkerId = 56L; // Long | checkerId
        String checkerDateTimeFrom = "checkerDateTimeFrom_example"; // String | checkerDateTimeFrom
        String checkerDateTimeTo = "checkerDateTimeTo_example"; // String | checkerDateTimeTo
        Integer processingResult = 56; // Integer | processingResult
        Integer officeId = 56; // Integer | officeId
        Integer groupId = 56; // Integer | groupId
        Integer clientId = 56; // Integer | clientId
        Integer loanid = 56; // Integer | loanid
        Integer savingsAccountId = 56; // Integer | savingsAccountId
        Boolean paged = true; // Boolean | paged
        Integer offset = 56; // Integer | offset
        Integer limit = 56; // Integer | limit
        String orderBy = "orderBy_example"; // String | orderBy
        String sortOrder = "sortOrder_example"; // String | sortOrder
        try {
            List<GetMakerCheckerResponse> result = apiInstance.retrieveAuditEntries(actionName, entityName, resourceId, makerId, makerDateTimeFrom, makerDateTimeTo, checkerId, checkerDateTimeFrom, checkerDateTimeTo, processingResult, officeId, groupId, clientId, loanid, savingsAccountId, paged, offset, limit, orderBy, sortOrder);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuditsApi#retrieveAuditEntries");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **actionName** | **String**| actionName | [optional]
 **entityName** | **String**| entityName | [optional]
 **resourceId** | **Long**| resourceId | [optional]
 **makerId** | **Long**| makerId | [optional]
 **makerDateTimeFrom** | **String**| makerDateTimeFrom | [optional]
 **makerDateTimeTo** | **String**| makerDateTimeTo | [optional]
 **checkerId** | **Long**| checkerId | [optional]
 **checkerDateTimeFrom** | **String**| checkerDateTimeFrom | [optional]
 **checkerDateTimeTo** | **String**| checkerDateTimeTo | [optional]
 **processingResult** | **Integer**| processingResult | [optional]
 **officeId** | **Integer**| officeId | [optional]
 **groupId** | **Integer**| groupId | [optional]
 **clientId** | **Integer**| clientId | [optional]
 **loanid** | **Integer**| loanid | [optional]
 **savingsAccountId** | **Integer**| savingsAccountId | [optional]
 **paged** | **Boolean**| paged | [optional]
 **offset** | **Integer**| offset | [optional]
 **limit** | **Integer**| limit | [optional]
 **orderBy** | **String**| orderBy | [optional]
 **sortOrder** | **String**| sortOrder | [optional]

### Return type

[**List&lt;GetMakerCheckerResponse&gt;**](GetMakerCheckerResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## retrieveAuditEntry

> GetMakerCheckerResponse retrieveAuditEntry(auditId)

Retrieve an Audit Entry

Example Requests:  audits/20 audits/20?fields&#x3D;madeOnDate,maker,processingResult

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.AuditsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8443/fineract-provider/api/v1");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        // Configure API key authorization: tenantid
        ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
        tenantid.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tenantid.setApiKeyPrefix("Token");

        AuditsApi apiInstance = new AuditsApi(defaultClient);
        Long auditId = 56L; // Long | auditId
        try {
            GetMakerCheckerResponse result = apiInstance.retrieveAuditEntry(auditId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuditsApi#retrieveAuditEntry");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **auditId** | **Long**| auditId |

### Return type

[**GetMakerCheckerResponse**](GetMakerCheckerResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## retrieveAuditSearchTemplate

> GetMakerCheckersSearchTemplateResponse retrieveAuditSearchTemplate()

Audit Search Template

This is a convenience resource. It can be useful when building an Audit Search UI. \&quot;appUsers\&quot; are data scoped to the office/branch the requestor is associated with.  Example Requests:  audits/searchtemplate audits/searchtemplate?fields&#x3D;actionNames

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.AuditsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8443/fineract-provider/api/v1");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        // Configure API key authorization: tenantid
        ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
        tenantid.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tenantid.setApiKeyPrefix("Token");

        AuditsApi apiInstance = new AuditsApi(defaultClient);
        try {
            GetMakerCheckersSearchTemplateResponse result = apiInstance.retrieveAuditSearchTemplate();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuditsApi#retrieveAuditSearchTemplate");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**GetMakerCheckersSearchTemplateResponse**](GetMakerCheckersSearchTemplateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

