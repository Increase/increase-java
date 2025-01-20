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
import com.increase.api.models.BookkeepingAccount
import com.increase.api.models.BookkeepingAccountBalanceParams
import com.increase.api.models.BookkeepingAccountCreateParams
import com.increase.api.models.BookkeepingAccountListPage
import com.increase.api.models.BookkeepingAccountListParams
import com.increase.api.models.BookkeepingAccountUpdateParams
import com.increase.api.models.BookkeepingBalanceLookup

class BookkeepingAccountServiceImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : BookkeepingAccountService {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<BookkeepingAccount> =
        jsonHandler<BookkeepingAccount>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create a Bookkeeping Account */
    override fun create(
        params: BookkeepingAccountCreateParams,
        requestOptions: RequestOptions
    ): BookkeepingAccount {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("bookkeeping_accounts")
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

    private val updateHandler: Handler<BookkeepingAccount> =
        jsonHandler<BookkeepingAccount>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Update a Bookkeeping Account */
    override fun update(
        params: BookkeepingAccountUpdateParams,
        requestOptions: RequestOptions
    ): BookkeepingAccount {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PATCH)
                .addPathSegments("bookkeeping_accounts", params.getPathParam(0))
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

    private val listHandler: Handler<BookkeepingAccountListPage.Response> =
        jsonHandler<BookkeepingAccountListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List Bookkeeping Accounts */
    override fun list(
        params: BookkeepingAccountListParams,
        requestOptions: RequestOptions
    ): BookkeepingAccountListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("bookkeeping_accounts")
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
                .let { BookkeepingAccountListPage.of(this, params, it) }
        }
    }

    private val balanceHandler: Handler<BookkeepingBalanceLookup> =
        jsonHandler<BookkeepingBalanceLookup>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Retrieve a Bookkeeping Account Balance */
    override fun balance(
        params: BookkeepingAccountBalanceParams,
        requestOptions: RequestOptions
    ): BookkeepingBalanceLookup {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("bookkeeping_accounts", params.getPathParam(0), "balance")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { balanceHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
