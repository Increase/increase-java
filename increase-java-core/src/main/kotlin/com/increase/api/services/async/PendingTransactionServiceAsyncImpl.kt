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
import com.increase.api.core.prepareAsync
import com.increase.api.errors.IncreaseError
import com.increase.api.models.PendingTransaction
import com.increase.api.models.PendingTransactionListPageAsync
import com.increase.api.models.PendingTransactionListParams
import com.increase.api.models.PendingTransactionRetrieveParams
import java.util.concurrent.CompletableFuture

class PendingTransactionServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : PendingTransactionServiceAsync {

    private val withRawResponse: PendingTransactionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PendingTransactionServiceAsync.WithRawResponse = withRawResponse

    override fun retrieve(
        params: PendingTransactionRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PendingTransaction> =
        // get /pending_transactions/{pending_transaction_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: PendingTransactionListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PendingTransactionListPageAsync> =
        // get /pending_transactions
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PendingTransactionServiceAsync.WithRawResponse {

        private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<PendingTransaction> =
            jsonHandler<PendingTransaction>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: PendingTransactionRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PendingTransaction>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("pending_transactions", params.getPathParam(0))
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

        private val listHandler: Handler<PendingTransactionListPageAsync.Response> =
            jsonHandler<PendingTransactionListPageAsync.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: PendingTransactionListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PendingTransactionListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("pending_transactions")
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
                                PendingTransactionListPageAsync.of(
                                    PendingTransactionServiceAsyncImpl(clientOptions),
                                    params,
                                    it,
                                )
                            }
                    }
                }
        }
    }
}
