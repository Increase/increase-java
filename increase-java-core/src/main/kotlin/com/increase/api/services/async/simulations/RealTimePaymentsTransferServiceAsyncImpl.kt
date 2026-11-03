// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.checkRequired
import com.increase.api.core.handlers.errorBodyHandler
import com.increase.api.core.handlers.errorHandler
import com.increase.api.core.handlers.jsonHandler
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.core.http.json
import com.increase.api.core.http.parseable
import com.increase.api.core.prepareAsync
import com.increase.api.models.realtimepaymentstransfers.RealTimePaymentsTransfer
import com.increase.api.models.simulations.realtimepaymentstransfers.RealTimePaymentsTransferCompleteParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class RealTimePaymentsTransferServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) :
    RealTimePaymentsTransferServiceAsync {

    private val withRawResponse: RealTimePaymentsTransferServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RealTimePaymentsTransferServiceAsync.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): RealTimePaymentsTransferServiceAsync =
        RealTimePaymentsTransferServiceAsyncImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun complete(
        params: RealTimePaymentsTransferCompleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RealTimePaymentsTransfer> =
        // post /simulations/real_time_payments_transfers/{real_time_payments_transfer_id}/complete
        withRawResponse().complete(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RealTimePaymentsTransferServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RealTimePaymentsTransferServiceAsync.WithRawResponse =
            RealTimePaymentsTransferServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val completeHandler: Handler<RealTimePaymentsTransfer> =
            jsonHandler<RealTimePaymentsTransfer>(clientOptions.jsonMapper)

        override fun complete(
            params: RealTimePaymentsTransferCompleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RealTimePaymentsTransfer>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired(
                "realTimePaymentsTransferId",
                params.realTimePaymentsTransferId().getOrNull(),
            )
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "simulations",
                        "real_time_payments_transfers",
                        params._pathParam(0),
                        "complete",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
