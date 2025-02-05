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
import com.increase.api.core.json
import com.increase.api.core.prepareAsync
import com.increase.api.errors.IncreaseError
import com.increase.api.models.InboundCheckDeposit
import com.increase.api.models.InboundCheckDepositDeclineParams
import com.increase.api.models.InboundCheckDepositListPageAsync
import com.increase.api.models.InboundCheckDepositListParams
import com.increase.api.models.InboundCheckDepositRetrieveParams
import com.increase.api.models.InboundCheckDepositReturnParams
import java.util.concurrent.CompletableFuture

class InboundCheckDepositServiceAsyncImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : InboundCheckDepositServiceAsync {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<InboundCheckDeposit> =
        jsonHandler<InboundCheckDeposit>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retrieve an Inbound Check Deposit */
    override fun retrieve(
        params: InboundCheckDepositRetrieveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<InboundCheckDeposit> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("inbound_check_deposits", params.getPathParam(0))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }

    private val listHandler: Handler<InboundCheckDepositListPageAsync.Response> =
        jsonHandler<InboundCheckDepositListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List Inbound Check Deposits */
    override fun list(
        params: InboundCheckDepositListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<InboundCheckDepositListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("inbound_check_deposits")
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
                    .let { InboundCheckDepositListPageAsync.of(this, params, it) }
            }
    }

    private val declineHandler: Handler<InboundCheckDeposit> =
        jsonHandler<InboundCheckDeposit>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Decline an Inbound Check Deposit */
    override fun decline(
        params: InboundCheckDepositDeclineParams,
        requestOptions: RequestOptions
    ): CompletableFuture<InboundCheckDeposit> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("inbound_check_deposits", params.getPathParam(0), "decline")
                .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { declineHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }

    private val returnHandler: Handler<InboundCheckDeposit> =
        jsonHandler<InboundCheckDeposit>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Return an Inbound Check Deposit */
    override fun return_(
        params: InboundCheckDepositReturnParams,
        requestOptions: RequestOptions
    ): CompletableFuture<InboundCheckDeposit> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("inbound_check_deposits", params.getPathParam(0), "return")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { returnHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }
}
