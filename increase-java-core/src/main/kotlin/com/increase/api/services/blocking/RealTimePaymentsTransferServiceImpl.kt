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
import com.increase.api.core.http.json
import com.increase.api.core.http.parseable
import com.increase.api.core.prepare
import com.increase.api.errors.IncreaseError
import com.increase.api.models.RealTimePaymentsTransfer
import com.increase.api.models.RealTimePaymentsTransferCreateParams
import com.increase.api.models.RealTimePaymentsTransferListPage
import com.increase.api.models.RealTimePaymentsTransferListParams
import com.increase.api.models.RealTimePaymentsTransferRetrieveParams

class RealTimePaymentsTransferServiceImpl
internal constructor(private val clientOptions: ClientOptions) : RealTimePaymentsTransferService {

    private val withRawResponse: RealTimePaymentsTransferService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RealTimePaymentsTransferService.WithRawResponse =
        withRawResponse

    override fun create(
        params: RealTimePaymentsTransferCreateParams,
        requestOptions: RequestOptions,
    ): RealTimePaymentsTransfer =
        // post /real_time_payments_transfers
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: RealTimePaymentsTransferRetrieveParams,
        requestOptions: RequestOptions,
    ): RealTimePaymentsTransfer =
        // get /real_time_payments_transfers/{real_time_payments_transfer_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: RealTimePaymentsTransferListParams,
        requestOptions: RequestOptions,
    ): RealTimePaymentsTransferListPage =
        // get /real_time_payments_transfers
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RealTimePaymentsTransferService.WithRawResponse {

        private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<RealTimePaymentsTransfer> =
            jsonHandler<RealTimePaymentsTransfer>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: RealTimePaymentsTransferCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RealTimePaymentsTransfer> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("real_time_payments_transfers")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<RealTimePaymentsTransfer> =
            jsonHandler<RealTimePaymentsTransfer>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: RealTimePaymentsTransferRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RealTimePaymentsTransfer> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("real_time_payments_transfers", params.getPathParam(0))
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

        private val listHandler: Handler<RealTimePaymentsTransferListPage.Response> =
            jsonHandler<RealTimePaymentsTransferListPage.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: RealTimePaymentsTransferListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RealTimePaymentsTransferListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("real_time_payments_transfers")
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
                        RealTimePaymentsTransferListPage.of(
                            RealTimePaymentsTransferServiceImpl(clientOptions),
                            params,
                            it,
                        )
                    }
            }
        }
    }
}
