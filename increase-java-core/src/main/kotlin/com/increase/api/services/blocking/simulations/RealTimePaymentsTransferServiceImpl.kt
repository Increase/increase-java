// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.handlers.errorHandler
import com.increase.api.core.handlers.jsonHandler
import com.increase.api.core.handlers.withErrorHandler
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.core.http.json
import com.increase.api.core.http.parseable
import com.increase.api.core.prepare
import com.increase.api.errors.IncreaseError
import com.increase.api.models.realtimepaymentstransfers.RealTimePaymentsTransfer
import com.increase.api.models.simulations.realtimepaymentstransfers.RealTimePaymentsTransferCompleteParams

class RealTimePaymentsTransferServiceImpl
internal constructor(private val clientOptions: ClientOptions) : RealTimePaymentsTransferService {

    private val withRawResponse: RealTimePaymentsTransferService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RealTimePaymentsTransferService.WithRawResponse =
        withRawResponse

    override fun complete(
        params: RealTimePaymentsTransferCompleteParams,
        requestOptions: RequestOptions,
    ): RealTimePaymentsTransfer =
        // post /simulations/real_time_payments_transfers/{real_time_payments_transfer_id}/complete
        withRawResponse().complete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RealTimePaymentsTransferService.WithRawResponse {

        private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

        private val completeHandler: Handler<RealTimePaymentsTransfer> =
            jsonHandler<RealTimePaymentsTransfer>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun complete(
            params: RealTimePaymentsTransferCompleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RealTimePaymentsTransfer> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
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
