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
import com.increase.api.models.checktransfers.CheckTransfer
import com.increase.api.models.checktransfers.CheckTransferApproveParams
import com.increase.api.models.checktransfers.CheckTransferCancelParams
import com.increase.api.models.checktransfers.CheckTransferCreateParams
import com.increase.api.models.checktransfers.CheckTransferListPage
import com.increase.api.models.checktransfers.CheckTransferListPageResponse
import com.increase.api.models.checktransfers.CheckTransferListParams
import com.increase.api.models.checktransfers.CheckTransferRetrieveParams
import com.increase.api.models.checktransfers.CheckTransferStopPaymentParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class CheckTransferServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CheckTransferService {

    private val withRawResponse: CheckTransferService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CheckTransferService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CheckTransferService =
        CheckTransferServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: CheckTransferCreateParams,
        requestOptions: RequestOptions,
    ): CheckTransfer =
        // post /check_transfers
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: CheckTransferRetrieveParams,
        requestOptions: RequestOptions,
    ): CheckTransfer =
        // get /check_transfers/{check_transfer_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: CheckTransferListParams,
        requestOptions: RequestOptions,
    ): CheckTransferListPage =
        // get /check_transfers
        withRawResponse().list(params, requestOptions).parse()

    override fun approve(
        params: CheckTransferApproveParams,
        requestOptions: RequestOptions,
    ): CheckTransfer =
        // post /check_transfers/{check_transfer_id}/approve
        withRawResponse().approve(params, requestOptions).parse()

    override fun cancel(
        params: CheckTransferCancelParams,
        requestOptions: RequestOptions,
    ): CheckTransfer =
        // post /check_transfers/{check_transfer_id}/cancel
        withRawResponse().cancel(params, requestOptions).parse()

    override fun stopPayment(
        params: CheckTransferStopPaymentParams,
        requestOptions: RequestOptions,
    ): CheckTransfer =
        // post /check_transfers/{check_transfer_id}/stop_payment
        withRawResponse().stopPayment(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CheckTransferService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CheckTransferService.WithRawResponse =
            CheckTransferServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<CheckTransfer> =
            jsonHandler<CheckTransfer>(clientOptions.jsonMapper)

        override fun create(
            params: CheckTransferCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CheckTransfer> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("check_transfers")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<CheckTransfer> =
            jsonHandler<CheckTransfer>(clientOptions.jsonMapper)

        override fun retrieve(
            params: CheckTransferRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CheckTransfer> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("checkTransferId", params.checkTransferId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("check_transfers", params._pathParam(0))
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

        private val listHandler: Handler<CheckTransferListPageResponse> =
            jsonHandler<CheckTransferListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: CheckTransferListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CheckTransferListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("check_transfers")
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
                    .let {
                        CheckTransferListPage.builder()
                            .service(CheckTransferServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val approveHandler: Handler<CheckTransfer> =
            jsonHandler<CheckTransfer>(clientOptions.jsonMapper)

        override fun approve(
            params: CheckTransferApproveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CheckTransfer> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("checkTransferId", params.checkTransferId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("check_transfers", params._pathParam(0), "approve")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { approveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val cancelHandler: Handler<CheckTransfer> =
            jsonHandler<CheckTransfer>(clientOptions.jsonMapper)

        override fun cancel(
            params: CheckTransferCancelParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CheckTransfer> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("checkTransferId", params.checkTransferId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("check_transfers", params._pathParam(0), "cancel")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { cancelHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val stopPaymentHandler: Handler<CheckTransfer> =
            jsonHandler<CheckTransfer>(clientOptions.jsonMapper)

        override fun stopPayment(
            params: CheckTransferStopPaymentParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CheckTransfer> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("checkTransferId", params.checkTransferId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("check_transfers", params._pathParam(0), "stop_payment")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { stopPaymentHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
