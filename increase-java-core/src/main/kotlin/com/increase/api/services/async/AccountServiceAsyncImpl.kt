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
import com.increase.api.models.Account
import com.increase.api.models.AccountBalanceParams
import com.increase.api.models.AccountCloseParams
import com.increase.api.models.AccountCreateParams
import com.increase.api.models.AccountListPageAsync
import com.increase.api.models.AccountListParams
import com.increase.api.models.AccountRetrieveParams
import com.increase.api.models.AccountUpdateParams
import com.increase.api.models.BalanceLookup
import java.util.concurrent.CompletableFuture

class AccountServiceAsyncImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : AccountServiceAsync {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<Account> =
        jsonHandler<Account>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create an Account */
    override fun create(
        params: AccountCreateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<Account> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("accounts")
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

    private val retrieveHandler: Handler<Account> =
        jsonHandler<Account>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retrieve an Account */
    override fun retrieve(
        params: AccountRetrieveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<Account> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("accounts", params.getPathParam(0))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }

    private val updateHandler: Handler<Account> =
        jsonHandler<Account>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Update an Account */
    override fun update(
        params: AccountUpdateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<Account> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PATCH)
                .addPathSegments("accounts", params.getPathParam(0))
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

    private val listHandler: Handler<AccountListPageAsync.Response> =
        jsonHandler<AccountListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List Accounts */
    override fun list(
        params: AccountListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<AccountListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("accounts")
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
                    .let { AccountListPageAsync.of(this, params, it) }
            }
    }

    private val balanceHandler: Handler<BalanceLookup> =
        jsonHandler<BalanceLookup>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retrieve an Account Balance */
    override fun balance(
        params: AccountBalanceParams,
        requestOptions: RequestOptions
    ): CompletableFuture<BalanceLookup> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("accounts", params.getPathParam(0), "balance")
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

    private val closeHandler: Handler<Account> =
        jsonHandler<Account>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Close an Account */
    override fun close(
        params: AccountCloseParams,
        requestOptions: RequestOptions
    ): CompletableFuture<Account> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("accounts", params.getPathParam(0), "close")
                .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { closeHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }
}
