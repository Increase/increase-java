// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

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
import com.increase.api.core.prepare
import com.increase.api.models.simulations.inboundfundsholds.InboundFundsHoldReleaseParams
import com.increase.api.models.simulations.inboundfundsholds.InboundFundsHoldReleaseResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class InboundFundsHoldServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    InboundFundsHoldService {

    private val withRawResponse: InboundFundsHoldService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): InboundFundsHoldService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): InboundFundsHoldService =
        InboundFundsHoldServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun release(
        params: InboundFundsHoldReleaseParams,
        requestOptions: RequestOptions,
    ): InboundFundsHoldReleaseResponse =
        // post /simulations/inbound_funds_holds/{inbound_funds_hold_id}/release
        withRawResponse().release(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InboundFundsHoldService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InboundFundsHoldService.WithRawResponse =
            InboundFundsHoldServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val releaseHandler: Handler<InboundFundsHoldReleaseResponse> =
            jsonHandler<InboundFundsHoldReleaseResponse>(clientOptions.jsonMapper)

        override fun release(
            params: InboundFundsHoldReleaseParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InboundFundsHoldReleaseResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("inboundFundsHoldId", params.inboundFundsHoldId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "simulations",
                        "inbound_funds_holds",
                        params._pathParam(0),
                        "release",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { releaseHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
