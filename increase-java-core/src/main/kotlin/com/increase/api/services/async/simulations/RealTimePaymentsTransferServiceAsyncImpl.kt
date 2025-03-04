// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

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
import com.increase.api.models.RealTimePaymentsTransfer
import com.increase.api.models.SimulationRealTimePaymentsTransferCompleteParams
import java.util.concurrent.CompletableFuture

class RealTimePaymentsTransferServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) :
    RealTimePaymentsTransferServiceAsync {

    private val withRawResponse: RealTimePaymentsTransferServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RealTimePaymentsTransferServiceAsync.WithRawResponse =
        withRawResponse

    override fun complete(
        params: SimulationRealTimePaymentsTransferCompleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RealTimePaymentsTransfer> =
        // post /simulations/real_time_payments_transfers/{real_time_payments_transfer_id}/complete
        withRawResponse().complete(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RealTimePaymentsTransferServiceAsync.WithRawResponse {

        private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

        private val completeHandler: Handler<RealTimePaymentsTransfer> =
            jsonHandler<RealTimePaymentsTransfer>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun complete(
            params: SimulationRealTimePaymentsTransferCompleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RealTimePaymentsTransfer>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "simulations",
                        "real_time_payments_transfers",
                        params.getPathParam(0),
                        "complete",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { completeHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }
    }
}
