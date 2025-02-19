// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.handlers.errorHandler
import com.increase.api.core.handlers.jsonHandler
import com.increase.api.core.handlers.withErrorHandler
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.core.json
import com.increase.api.core.prepareAsync
import com.increase.api.errors.IncreaseError
import com.increase.api.models.BookkeepingAccount
import com.increase.api.models.BookkeepingAccountBalanceParams
import com.increase.api.models.BookkeepingAccountCreateParams
import com.increase.api.models.BookkeepingAccountListPageAsync
import com.increase.api.models.BookkeepingAccountListParams
import com.increase.api.models.BookkeepingAccountUpdateParams
import com.increase.api.models.BookkeepingBalanceLookup
import java.util.concurrent.CompletableFuture

class BookkeepingAccountServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : BookkeepingAccountServiceAsync {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<BookkeepingAccount> =
        jsonHandler<BookkeepingAccount>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create a Bookkeeping Account */
    override fun create(
        params: BookkeepingAccountCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BookkeepingAccount> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("bookkeeping_accounts")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }

    private val updateHandler: Handler<BookkeepingAccount> =
        jsonHandler<BookkeepingAccount>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Update a Bookkeeping Account */
    override fun update(
        params: BookkeepingAccountUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BookkeepingAccount> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PATCH)
                .addPathSegments("bookkeeping_accounts", params.getPathParam(0))
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }

    private val listHandler: Handler<BookkeepingAccountListPageAsync.Response> =
        jsonHandler<BookkeepingAccountListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List Bookkeeping Accounts */
    override fun list(
        params: BookkeepingAccountListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BookkeepingAccountListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("bookkeeping_accounts")
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
                    .let { BookkeepingAccountListPageAsync.of(this, params, it) }
            }
    }

    private val balanceHandler: Handler<BookkeepingBalanceLookup> =
        jsonHandler<BookkeepingBalanceLookup>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Retrieve a Bookkeeping Account Balance */
    override fun balance(
        params: BookkeepingAccountBalanceParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BookkeepingBalanceLookup> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("bookkeeping_accounts", params.getPathParam(0), "balance")
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { balanceHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }
}
