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
import com.increase.api.models.inboundcheckdeposits.InboundCheckDeposit
import com.increase.api.models.inboundcheckdeposits.InboundCheckDepositDeclineParams
import com.increase.api.models.inboundcheckdeposits.InboundCheckDepositListPageAsync
import com.increase.api.models.inboundcheckdeposits.InboundCheckDepositListPageResponse
import com.increase.api.models.inboundcheckdeposits.InboundCheckDepositListParams
import com.increase.api.models.inboundcheckdeposits.InboundCheckDepositRetrieveParams
import com.increase.api.models.inboundcheckdeposits.InboundCheckDepositReturnParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class InboundCheckDepositServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : InboundCheckDepositServiceAsync {

    private val withRawResponse: InboundCheckDepositServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): InboundCheckDepositServiceAsync.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): InboundCheckDepositServiceAsync =
        InboundCheckDepositServiceAsyncImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun retrieve(
        params: InboundCheckDepositRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InboundCheckDeposit> =
        // get /inbound_check_deposits/{inbound_check_deposit_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: InboundCheckDepositListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InboundCheckDepositListPageAsync> =
        // get /inbound_check_deposits
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun decline(
        params: InboundCheckDepositDeclineParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InboundCheckDeposit> =
        // post /inbound_check_deposits/{inbound_check_deposit_id}/decline
        withRawResponse().decline(params, requestOptions).thenApply { it.parse() }

    override fun return_(
        params: InboundCheckDepositReturnParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InboundCheckDeposit> =
        // post /inbound_check_deposits/{inbound_check_deposit_id}/return
        withRawResponse().return_(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InboundCheckDepositServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InboundCheckDepositServiceAsync.WithRawResponse =
            InboundCheckDepositServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<InboundCheckDeposit> =
            jsonHandler<InboundCheckDeposit>(clientOptions.jsonMapper)

        override fun retrieve(
            params: InboundCheckDepositRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InboundCheckDeposit>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("inboundCheckDepositId", params.inboundCheckDepositId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("inbound_check_deposits", params._pathParam(0))
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

        private val listHandler: Handler<InboundCheckDepositListPageResponse> =
            jsonHandler<InboundCheckDepositListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: InboundCheckDepositListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InboundCheckDepositListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("inbound_check_deposits")
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
                            .let {
                                InboundCheckDepositListPageAsync.builder()
                                    .service(InboundCheckDepositServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val declineHandler: Handler<InboundCheckDeposit> =
            jsonHandler<InboundCheckDeposit>(clientOptions.jsonMapper)

        override fun decline(
            params: InboundCheckDepositDeclineParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InboundCheckDeposit>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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

        private val returnHandler: Handler<InboundCheckDeposit> =
            jsonHandler<InboundCheckDeposit>(clientOptions.jsonMapper)

        override fun return_(
            params: InboundCheckDepositReturnParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InboundCheckDeposit>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
