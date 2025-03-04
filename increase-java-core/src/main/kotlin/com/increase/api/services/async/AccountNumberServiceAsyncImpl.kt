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
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.core.http.parseable
import com.increase.api.core.json
import com.increase.api.core.prepareAsync
import com.increase.api.errors.IncreaseError
import com.increase.api.models.AccountNumber
import com.increase.api.models.AccountNumberCreateParams
import com.increase.api.models.AccountNumberListPageAsync
import com.increase.api.models.AccountNumberListParams
import com.increase.api.models.AccountNumberRetrieveParams
import com.increase.api.models.AccountNumberUpdateParams
import java.util.concurrent.CompletableFuture

class AccountNumberServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AccountNumberServiceAsync {

    private val withRawResponse: AccountNumberServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AccountNumberServiceAsync.WithRawResponse = withRawResponse

    override fun create(
        params: AccountNumberCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AccountNumber> =
        // post /account_numbers
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: AccountNumberRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AccountNumber> =
        // get /account_numbers/{account_number_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: AccountNumberUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AccountNumber> =
        // patch /account_numbers/{account_number_id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: AccountNumberListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AccountNumberListPageAsync> =
        // get /account_numbers
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AccountNumberServiceAsync.WithRawResponse {

        private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<AccountNumber> =
            jsonHandler<AccountNumber>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: AccountNumberCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AccountNumber>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("account_numbers")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveHandler: Handler<AccountNumber> =
            jsonHandler<AccountNumber>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: AccountNumberRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AccountNumber>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("account_numbers", params.getPathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateHandler: Handler<AccountNumber> =
            jsonHandler<AccountNumber>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: AccountNumberUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AccountNumber>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .addPathSegments("account_numbers", params.getPathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<AccountNumberListPageAsync.Response> =
            jsonHandler<AccountNumberListPageAsync.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: AccountNumberListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AccountNumberListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("account_numbers")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                AccountNumberListPageAsync.of(
                                    AccountNumberServiceAsyncImpl(clientOptions),
                                    params,
                                    it,
                                )
                            }
                    }
                }
        }
    }
}
