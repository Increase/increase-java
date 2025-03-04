// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

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
import com.increase.api.core.prepareAsync
import com.increase.api.errors.IncreaseError
import com.increase.api.models.InboundAchTransfer
import com.increase.api.models.InboundAchTransferCreateNotificationOfChangeParams
import com.increase.api.models.InboundAchTransferDeclineParams
import com.increase.api.models.InboundAchTransferListPageAsync
import com.increase.api.models.InboundAchTransferListParams
import com.increase.api.models.InboundAchTransferRetrieveParams
import com.increase.api.models.InboundAchTransferTransferReturnParams
import java.util.concurrent.CompletableFuture

class InboundAchTransferServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : InboundAchTransferServiceAsync {

    private val withRawResponse: InboundAchTransferServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): InboundAchTransferServiceAsync.WithRawResponse = withRawResponse

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

        private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<InboundAchTransfer> =
            jsonHandler<InboundAchTransfer>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: InboundAchTransferRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InboundAchTransfer>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("inbound_ach_transfers", params.getPathParam(0))
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

        private val listHandler: Handler<InboundAchTransferListPageAsync.Response> =
            jsonHandler<InboundAchTransferListPageAsync.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: InboundAchTransferListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InboundAchTransferListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
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
                                InboundAchTransferListPageAsync.of(
                                    InboundAchTransferServiceAsyncImpl(clientOptions),
                                    params,
                                    it,
                                )
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
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "inbound_ach_transfers",
                        params.getPathParam(0),
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
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("inbound_ach_transfers", params.getPathParam(0), "decline")
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
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "inbound_ach_transfers",
                        params.getPathParam(0),
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
