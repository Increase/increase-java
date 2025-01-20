// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.handlers.errorHandler
import com.increase.api.core.handlers.jsonHandler
import com.increase.api.core.handlers.withErrorHandler
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.core.json
import com.increase.api.errors.IncreaseError
import com.increase.api.models.AccountNumber
import com.increase.api.models.AccountNumberCreateParams
import com.increase.api.models.AccountNumberListPage
import com.increase.api.models.AccountNumberListParams
import com.increase.api.models.AccountNumberRetrieveParams
import com.increase.api.models.AccountNumberUpdateParams

class AccountNumberServiceImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : AccountNumberService {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<AccountNumber> =
        jsonHandler<AccountNumber>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create an Account Number */
    override fun create(
        params: AccountNumberCreateParams,
        requestOptions: RequestOptions
    ): AccountNumber {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("account_numbers")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { createHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val retrieveHandler: Handler<AccountNumber> =
        jsonHandler<AccountNumber>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retrieve an Account Number */
    override fun retrieve(
        params: AccountNumberRetrieveParams,
        requestOptions: RequestOptions
    ): AccountNumber {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("account_numbers", params.getPathParam(0))
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val updateHandler: Handler<AccountNumber> =
        jsonHandler<AccountNumber>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Update an Account Number */
    override fun update(
        params: AccountNumberUpdateParams,
        requestOptions: RequestOptions
    ): AccountNumber {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PATCH)
                .addPathSegments("account_numbers", params.getPathParam(0))
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { updateHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listHandler: Handler<AccountNumberListPage.Response> =
        jsonHandler<AccountNumberListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List Account Numbers */
    override fun list(
        params: AccountNumberListParams,
        requestOptions: RequestOptions
    ): AccountNumberListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("account_numbers")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { AccountNumberListPage.of(this, params, it) }
        }
    }
}
