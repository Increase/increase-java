// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

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
import com.increase.api.models.achtransfers.AchTransfer
import com.increase.api.models.simulations.achtransfers.AchTransferAcknowledgeParams
import com.increase.api.models.simulations.achtransfers.AchTransferCreateNotificationOfChangeParams
import com.increase.api.models.simulations.achtransfers.AchTransferReturnParams
import com.increase.api.models.simulations.achtransfers.AchTransferSettleParams
import com.increase.api.models.simulations.achtransfers.AchTransferSubmitParams
import java.util.concurrent.CompletableFuture
import kotlin.jvm.optionals.getOrNull

class AchTransferServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AchTransferServiceAsync {

    private val withRawResponse: AchTransferServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AchTransferServiceAsync.WithRawResponse = withRawResponse

    override fun acknowledge(
        params: AchTransferAcknowledgeParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AchTransfer> =
        // post /simulations/ach_transfers/{ach_transfer_id}/acknowledge
        withRawResponse().acknowledge(params, requestOptions).thenApply { it.parse() }

    override fun createNotificationOfChange(
        params: AchTransferCreateNotificationOfChangeParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AchTransfer> =
        // post /simulations/ach_transfers/{ach_transfer_id}/create_notification_of_change
        withRawResponse().createNotificationOfChange(params, requestOptions).thenApply {
            it.parse()
        }

    override fun return_(
        params: AchTransferReturnParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AchTransfer> =
        // post /simulations/ach_transfers/{ach_transfer_id}/return
        withRawResponse().return_(params, requestOptions).thenApply { it.parse() }

    override fun settle(
        params: AchTransferSettleParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AchTransfer> =
        // post /simulations/ach_transfers/{ach_transfer_id}/settle
        withRawResponse().settle(params, requestOptions).thenApply { it.parse() }

    override fun submit(
        params: AchTransferSubmitParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AchTransfer> =
        // post /simulations/ach_transfers/{ach_transfer_id}/submit
        withRawResponse().submit(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AchTransferServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val acknowledgeHandler: Handler<AchTransfer> =
            jsonHandler<AchTransfer>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun acknowledge(
            params: AchTransferAcknowledgeParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AchTransfer>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("achTransferId", params.achTransferId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "simulations",
                        "ach_transfers",
                        params._pathParam(0),
                        "acknowledge",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { acknowledgeHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val createNotificationOfChangeHandler: Handler<AchTransfer> =
            jsonHandler<AchTransfer>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun createNotificationOfChange(
            params: AchTransferCreateNotificationOfChangeParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AchTransfer>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("achTransferId", params.achTransferId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "simulations",
                        "ach_transfers",
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

        private val returnHandler: Handler<AchTransfer> =
            jsonHandler<AchTransfer>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun return_(
            params: AchTransferReturnParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AchTransfer>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("achTransferId", params.achTransferId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("simulations", "ach_transfers", params._pathParam(0), "return")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
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

        private val settleHandler: Handler<AchTransfer> =
            jsonHandler<AchTransfer>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun settle(
            params: AchTransferSettleParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AchTransfer>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("achTransferId", params.achTransferId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("simulations", "ach_transfers", params._pathParam(0), "settle")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { settleHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val submitHandler: Handler<AchTransfer> =
            jsonHandler<AchTransfer>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun submit(
            params: AchTransferSubmitParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AchTransfer>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("achTransferId", params.achTransferId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("simulations", "ach_transfers", params._pathParam(0), "submit")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
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
}
