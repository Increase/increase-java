// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

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
import com.increase.api.core.prepareAsync
import com.increase.api.models.inboundachtransfers.InboundAchTransfer
import com.increase.api.models.inboundachtransfers.InboundAchTransferCreateNotificationOfChangeParams
import com.increase.api.models.inboundachtransfers.InboundAchTransferDeclineParams
import com.increase.api.models.inboundachtransfers.InboundAchTransferListPageAsync
import com.increase.api.models.inboundachtransfers.InboundAchTransferListPageResponse
import com.increase.api.models.inboundachtransfers.InboundAchTransferListParams
import com.increase.api.models.inboundachtransfers.InboundAchTransferRetrieveParams
import com.increase.api.models.inboundachtransfers.InboundAchTransferTransferReturnParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class InboundAchTransferServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : InboundAchTransferServiceAsync {

    private val withRawResponse: InboundAchTransferServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): InboundAchTransferServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): InboundAchTransferServiceAsync =
        InboundAchTransferServiceAsyncImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun retrieve(
        params: InboundAchTransferRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InboundAchTransfer> =
        // get /inbound_ach_transfers/{inbound_ach_transfer_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: InboundAchTransferListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InboundAchTransferListPageAsync> =
        // get /inbound_ach_transfers
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun createNotificationOfChange(
        params: InboundAchTransferCreateNotificationOfChangeParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InboundAchTransfer> =
        // post /inbound_ach_transfers/{inbound_ach_transfer_id}/create_notification_of_change
        withRawResponse().createNotificationOfChange(params, requestOptions).thenApply {
            it.parse()
        }

    override fun decline(
        params: InboundAchTransferDeclineParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InboundAchTransfer> =
        // post /inbound_ach_transfers/{inbound_ach_transfer_id}/decline
        withRawResponse().decline(params, requestOptions).thenApply { it.parse() }

    override fun transferReturn(
        params: InboundAchTransferTransferReturnParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InboundAchTransfer> =
        // post /inbound_ach_transfers/{inbound_ach_transfer_id}/transfer_return
        withRawResponse().transferReturn(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InboundAchTransferServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InboundAchTransferServiceAsync.WithRawResponse =
            InboundAchTransferServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<InboundAchTransfer> =
            jsonHandler<InboundAchTransfer>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: InboundAchTransferRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InboundAchTransfer>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("inboundAchTransferId", params.inboundAchTransferId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("inbound_ach_transfers", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
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

        private val listHandler: Handler<InboundAchTransferListPageResponse> =
            jsonHandler<InboundAchTransferListPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: InboundAchTransferListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InboundAchTransferListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("inbound_ach_transfers")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                InboundAchTransferListPageAsync.builder()
                                    .service(InboundAchTransferServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val createNotificationOfChangeHandler: Handler<InboundAchTransfer> =
            jsonHandler<InboundAchTransfer>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun createNotificationOfChange(
            params: InboundAchTransferCreateNotificationOfChangeParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InboundAchTransfer>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("inboundAchTransferId", params.inboundAchTransferId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "inbound_ach_transfers",
                        params._pathParam(0),
                        "create_notification_of_change",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { createNotificationOfChangeHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val declineHandler: Handler<InboundAchTransfer> =
            jsonHandler<InboundAchTransfer>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun decline(
            params: InboundAchTransferDeclineParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InboundAchTransfer>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("inboundAchTransferId", params.inboundAchTransferId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("inbound_ach_transfers", params._pathParam(0), "decline")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { declineHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val transferReturnHandler: Handler<InboundAchTransfer> =
            jsonHandler<InboundAchTransfer>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun transferReturn(
            params: InboundAchTransferTransferReturnParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InboundAchTransfer>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("inboundAchTransferId", params.inboundAchTransferId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "inbound_ach_transfers",
                        params._pathParam(0),
                        "transfer_return",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { transferReturnHandler.handle(it) }
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
