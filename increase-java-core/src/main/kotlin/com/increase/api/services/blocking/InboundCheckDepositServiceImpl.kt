// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

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
import com.increase.api.core.prepare
import com.increase.api.errors.IncreaseError
import com.increase.api.models.InboundCheckDeposit
import com.increase.api.models.InboundCheckDepositDeclineParams
import com.increase.api.models.InboundCheckDepositListPage
import com.increase.api.models.InboundCheckDepositListParams
import com.increase.api.models.InboundCheckDepositRetrieveParams
import com.increase.api.models.InboundCheckDepositReturnParams

class InboundCheckDepositServiceImpl
internal constructor(private val clientOptions: ClientOptions) : InboundCheckDepositService {

    private val withRawResponse: InboundCheckDepositService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): InboundCheckDepositService.WithRawResponse = withRawResponse

    override fun retrieve(
        params: InboundCheckDepositRetrieveParams,
        requestOptions: RequestOptions,
    ): InboundCheckDeposit =
        // get /inbound_check_deposits/{inbound_check_deposit_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: InboundCheckDepositListParams,
        requestOptions: RequestOptions,
    ): InboundCheckDepositListPage =
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

        private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<InboundCheckDeposit> =
            jsonHandler<InboundCheckDeposit>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: InboundCheckDepositRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InboundCheckDeposit> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("inbound_check_deposits", params.getPathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<InboundCheckDepositListPage.Response> =
            jsonHandler<InboundCheckDepositListPage.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: InboundCheckDepositListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InboundCheckDepositListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("inbound_check_deposits")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        InboundCheckDepositListPage.of(
                            InboundCheckDepositServiceImpl(clientOptions),
                            params,
                            it,
                        )
                    }
            }
        }

        private val declineHandler: Handler<InboundCheckDeposit> =
            jsonHandler<InboundCheckDeposit>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun decline(
            params: InboundCheckDepositDeclineParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InboundCheckDeposit> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("inbound_check_deposits", params.getPathParam(0), "decline")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
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
                .withErrorHandler(errorHandler)

        override fun return_(
            params: InboundCheckDepositReturnParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InboundCheckDeposit> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("inbound_check_deposits", params.getPathParam(0), "return")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
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
