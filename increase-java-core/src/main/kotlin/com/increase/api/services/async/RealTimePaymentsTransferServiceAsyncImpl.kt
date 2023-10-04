// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.errors.IncreaseError
import com.increase.api.models.RealTimePaymentsTransfer
import com.increase.api.models.RealTimePaymentsTransferCreateParams
import com.increase.api.models.RealTimePaymentsTransferListPageAsync
import com.increase.api.models.RealTimePaymentsTransferListParams
import com.increase.api.models.RealTimePaymentsTransferRetrieveParams
import com.increase.api.services.errorHandler
import com.increase.api.services.json
import com.increase.api.services.jsonHandler
import com.increase.api.services.withErrorHandler
import java.util.concurrent.CompletableFuture

class RealTimePaymentsTransferServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : RealTimePaymentsTransferServiceAsync {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<RealTimePaymentsTransfer> =
        jsonHandler<RealTimePaymentsTransfer>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Create a Real-Time Payments Transfer */
    override fun create(
        params: RealTimePaymentsTransferCreateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<RealTimePaymentsTransfer> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("real_time_payments_transfers")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { createHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val retrieveHandler: Handler<RealTimePaymentsTransfer> =
        jsonHandler<RealTimePaymentsTransfer>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Retrieve a Real-Time Payments Transfer */
    override fun retrieve(
        params: RealTimePaymentsTransferRetrieveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<RealTimePaymentsTransfer> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("real_time_payments_transfers", params.getPathParam(0))
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listHandler: Handler<RealTimePaymentsTransferListPageAsync.Response> =
        jsonHandler<RealTimePaymentsTransferListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List Real-Time Payments Transfers */
    override fun list(
        params: RealTimePaymentsTransferListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<RealTimePaymentsTransferListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("real_time_payments_transfers")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { RealTimePaymentsTransferListPageAsync.of(this, params, it) }
        }
    }
}
