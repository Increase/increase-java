// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

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
import com.increase.api.models.realtimepaymentstransfers.RealTimePaymentsTransferApproveParams
import com.increase.api.models.realtimepaymentstransfers.RealTimePaymentsTransferCancelParams
import com.increase.api.models.realtimepaymentstransfers.RealTimePaymentsTransferCreateParams
import com.increase.api.models.realtimepaymentstransfers.RealTimePaymentsTransferListParams
import com.increase.api.models.realtimepaymentstransfers.RealTimePaymentsTransferListResponse
import com.increase.api.models.realtimepaymentstransfers.RealTimePaymentsTransferRetrieveParams
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

    override fun create(
        params: RealTimePaymentsTransferCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RealTimePaymentsTransfer> =
        // post /real_time_payments_transfers
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: RealTimePaymentsTransferRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RealTimePaymentsTransfer> =
        // get /real_time_payments_transfers/{real_time_payments_transfer_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: RealTimePaymentsTransferListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RealTimePaymentsTransferListResponse> =
        // get /real_time_payments_transfers
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun approve(
        params: RealTimePaymentsTransferApproveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RealTimePaymentsTransfer> =
        // post /real_time_payments_transfers/{real_time_payments_transfer_id}/approve
        withRawResponse().approve(params, requestOptions).thenApply { it.parse() }

    override fun cancel(
        params: RealTimePaymentsTransferCancelParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RealTimePaymentsTransfer> =
        // post /real_time_payments_transfers/{real_time_payments_transfer_id}/cancel
        withRawResponse().cancel(params, requestOptions).thenApply { it.parse() }

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

        private val createHandler: Handler<RealTimePaymentsTransfer> =
            jsonHandler<RealTimePaymentsTransfer>(clientOptions.jsonMapper)

        override fun create(
            params: RealTimePaymentsTransferCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RealTimePaymentsTransfer>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("real_time_payments_transfers")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveHandler: Handler<RealTimePaymentsTransfer> =
            jsonHandler<RealTimePaymentsTransfer>(clientOptions.jsonMapper)

        override fun retrieve(
            params: RealTimePaymentsTransferRetrieveParams,
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
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("real_time_payments_transfers", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<RealTimePaymentsTransferListResponse> =
            jsonHandler<RealTimePaymentsTransferListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: RealTimePaymentsTransferListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RealTimePaymentsTransferListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("real_time_payments_transfers")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val approveHandler: Handler<RealTimePaymentsTransfer> =
            jsonHandler<RealTimePaymentsTransfer>(clientOptions.jsonMapper)

        override fun approve(
            params: RealTimePaymentsTransferApproveParams,
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
                        "real_time_payments_transfers",
                        params._pathParam(0),
                        "approve",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { approveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val cancelHandler: Handler<RealTimePaymentsTransfer> =
            jsonHandler<RealTimePaymentsTransfer>(clientOptions.jsonMapper)

        override fun cancel(
            params: RealTimePaymentsTransferCancelParams,
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
                    .addPathSegments("real_time_payments_transfers", params._pathParam(0), "cancel")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { cancelHandler.handle(it) }
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
