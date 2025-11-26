// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

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
import com.increase.api.models.inboundcheckdeposits.InboundCheckDeposit
import com.increase.api.models.inboundcheckdeposits.InboundCheckDepositDeclineParams
import com.increase.api.models.inboundcheckdeposits.InboundCheckDepositListParams
import com.increase.api.models.inboundcheckdeposits.InboundCheckDepositListResponse
import com.increase.api.models.inboundcheckdeposits.InboundCheckDepositRetrieveParams
import com.increase.api.models.inboundcheckdeposits.InboundCheckDepositReturnParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class InboundCheckDepositServiceImpl
internal constructor(private val clientOptions: ClientOptions) : InboundCheckDepositService {

    private val withRawResponse: InboundCheckDepositService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): InboundCheckDepositService.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): InboundCheckDepositService =
        InboundCheckDepositServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: InboundCheckDepositRetrieveParams,
        requestOptions: RequestOptions,
    ): InboundCheckDeposit =
        // get /inbound_check_deposits/{inbound_check_deposit_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: InboundCheckDepositListParams,
        requestOptions: RequestOptions,
    ): InboundCheckDepositListResponse =
        // get /inbound_check_deposits
        withRawResponse().list(params, requestOptions).parse()

    override fun decline(
        params: InboundCheckDepositDeclineParams,
        requestOptions: RequestOptions,
    ): InboundCheckDeposit =
        // post /inbound_check_deposits/{inbound_check_deposit_id}/decline
        withRawResponse().decline(params, requestOptions).parse()

    override fun return_(
        params: InboundCheckDepositReturnParams,
        requestOptions: RequestOptions,
    ): InboundCheckDeposit =
        // post /inbound_check_deposits/{inbound_check_deposit_id}/return
        withRawResponse().return_(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InboundCheckDepositService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InboundCheckDepositService.WithRawResponse =
            InboundCheckDepositServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<InboundCheckDeposit> =
            jsonHandler<InboundCheckDeposit>(clientOptions.jsonMapper)

        override fun retrieve(
            params: InboundCheckDepositRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InboundCheckDeposit> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("inboundCheckDepositId", params.inboundCheckDepositId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("inbound_check_deposits", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<InboundCheckDepositListResponse> =
            jsonHandler<InboundCheckDepositListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: InboundCheckDepositListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InboundCheckDepositListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("inbound_check_deposits")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val declineHandler: Handler<InboundCheckDeposit> =
            jsonHandler<InboundCheckDeposit>(clientOptions.jsonMapper)

        override fun decline(
            params: InboundCheckDepositDeclineParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InboundCheckDeposit> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("inboundCheckDepositId", params.inboundCheckDepositId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("inbound_check_deposits", params._pathParam(0), "decline")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { declineHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val returnHandler: Handler<InboundCheckDeposit> =
            jsonHandler<InboundCheckDeposit>(clientOptions.jsonMapper)

        override fun return_(
            params: InboundCheckDepositReturnParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InboundCheckDeposit> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("inboundCheckDepositId", params.inboundCheckDepositId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("inbound_check_deposits", params._pathParam(0), "return")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { returnHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
