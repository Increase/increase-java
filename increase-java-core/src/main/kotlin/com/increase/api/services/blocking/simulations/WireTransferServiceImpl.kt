// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

import com.increase.api.core.ClientOptions
import com.increase.api.core.JsonValue
import com.increase.api.core.RequestOptions
import com.increase.api.core.checkRequired
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
import com.increase.api.models.simulations.wiretransfers.WireTransferReverseParams
import com.increase.api.models.simulations.wiretransfers.WireTransferSubmitParams
import com.increase.api.models.wiretransfers.WireTransfer
import kotlin.jvm.optionals.getOrNull

class WireTransferServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    WireTransferService {

    private val withRawResponse: WireTransferService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): WireTransferService.WithRawResponse = withRawResponse

    override fun reverse(
        params: WireTransferReverseParams,
        requestOptions: RequestOptions,
    ): WireTransfer =
        // post /simulations/wire_transfers/{wire_transfer_id}/reverse
        withRawResponse().reverse(params, requestOptions).parse()

    override fun submit(
        params: WireTransferSubmitParams,
        requestOptions: RequestOptions,
    ): WireTransfer =
        // post /simulations/wire_transfers/{wire_transfer_id}/submit
        withRawResponse().submit(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        WireTransferService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val reverseHandler: Handler<WireTransfer> =
            jsonHandler<WireTransfer>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun reverse(
            params: WireTransferReverseParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WireTransfer> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("wireTransferId", params.wireTransferId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "simulations",
                        "wire_transfers",
                        params._pathParam(0),
                        "reverse",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { reverseHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val submitHandler: Handler<WireTransfer> =
            jsonHandler<WireTransfer>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun submit(
            params: WireTransferSubmitParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WireTransfer> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("wireTransferId", params.wireTransferId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "simulations",
                        "wire_transfers",
                        params._pathParam(0),
                        "submit",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { submitHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
