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
import com.increase.api.models.simulations.wiredrawdownrequests.WireDrawdownRequestRefuseParams
import com.increase.api.models.simulations.wiredrawdownrequests.WireDrawdownRequestSubmitParams
import com.increase.api.models.wiredrawdownrequests.WireDrawdownRequest
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class WireDrawdownRequestServiceImpl
internal constructor(private val clientOptions: ClientOptions) : WireDrawdownRequestService {

    private val withRawResponse: WireDrawdownRequestService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): WireDrawdownRequestService.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): WireDrawdownRequestService =
        WireDrawdownRequestServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun refuse(
        params: WireDrawdownRequestRefuseParams,
        requestOptions: RequestOptions,
    ): WireDrawdownRequest =
        // post /simulations/wire_drawdown_requests/{wire_drawdown_request_id}/refuse
        withRawResponse().refuse(params, requestOptions).parse()

    override fun submit(
        params: WireDrawdownRequestSubmitParams,
        requestOptions: RequestOptions,
    ): WireDrawdownRequest =
        // post /simulations/wire_drawdown_requests/{wire_drawdown_request_id}/submit
        withRawResponse().submit(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        WireDrawdownRequestService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WireDrawdownRequestService.WithRawResponse =
            WireDrawdownRequestServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val refuseHandler: Handler<WireDrawdownRequest> =
            jsonHandler<WireDrawdownRequest>(clientOptions.jsonMapper)

        override fun refuse(
            params: WireDrawdownRequestRefuseParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WireDrawdownRequest> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("wireDrawdownRequestId", params.wireDrawdownRequestId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "simulations",
                        "wire_drawdown_requests",
                        params._pathParam(0),
                        "refuse",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { refuseHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val submitHandler: Handler<WireDrawdownRequest> =
            jsonHandler<WireDrawdownRequest>(clientOptions.jsonMapper)

        override fun submit(
            params: WireDrawdownRequestSubmitParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WireDrawdownRequest> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("wireDrawdownRequestId", params.wireDrawdownRequestId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "simulations",
                        "wire_drawdown_requests",
                        params._pathParam(0),
                        "submit",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
