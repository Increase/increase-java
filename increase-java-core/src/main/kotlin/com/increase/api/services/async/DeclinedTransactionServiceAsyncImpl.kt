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
import com.increase.api.core.prepareAsync
import com.increase.api.errors.IncreaseError
import com.increase.api.models.DeclinedTransaction
import com.increase.api.models.DeclinedTransactionListPageAsync
import com.increase.api.models.DeclinedTransactionListParams
import com.increase.api.models.DeclinedTransactionRetrieveParams
import java.util.concurrent.CompletableFuture

class DeclinedTransactionServiceAsyncImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : DeclinedTransactionServiceAsync {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<DeclinedTransaction> =
        jsonHandler<DeclinedTransaction>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retrieve a Declined Transaction */
    override fun retrieve(
        params: DeclinedTransactionRetrieveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<DeclinedTransaction> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("declined_transactions", params.getPathParam(0))
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

    private val listHandler: Handler<DeclinedTransactionListPageAsync.Response> =
        jsonHandler<DeclinedTransactionListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List Declined Transactions */
    override fun list(
        params: DeclinedTransactionListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<DeclinedTransactionListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("declined_transactions")
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
                    .let { DeclinedTransactionListPageAsync.of(this, params, it) }
            }
    }
}
