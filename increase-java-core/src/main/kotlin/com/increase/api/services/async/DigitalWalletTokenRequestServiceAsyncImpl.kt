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
import com.increase.api.core.http.parseable
import com.increase.api.core.prepareAsync
import com.increase.api.models.digitalwallettokenrequests.DigitalWalletTokenRequest
import com.increase.api.models.digitalwallettokenrequests.DigitalWalletTokenRequestListPageAsync
import com.increase.api.models.digitalwallettokenrequests.DigitalWalletTokenRequestListPageResponse
import com.increase.api.models.digitalwallettokenrequests.DigitalWalletTokenRequestListParams
import com.increase.api.models.digitalwallettokenrequests.DigitalWalletTokenRequestRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class DigitalWalletTokenRequestServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) :
    DigitalWalletTokenRequestServiceAsync {

    private val withRawResponse: DigitalWalletTokenRequestServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DigitalWalletTokenRequestServiceAsync.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): DigitalWalletTokenRequestServiceAsync =
        DigitalWalletTokenRequestServiceAsyncImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun retrieve(
        params: DigitalWalletTokenRequestRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DigitalWalletTokenRequest> =
        // get /digital_wallet_token_requests/{digital_wallet_token_request_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: DigitalWalletTokenRequestListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DigitalWalletTokenRequestListPageAsync> =
        // get /digital_wallet_token_requests
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DigitalWalletTokenRequestServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DigitalWalletTokenRequestServiceAsync.WithRawResponse =
            DigitalWalletTokenRequestServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<DigitalWalletTokenRequest> =
            jsonHandler<DigitalWalletTokenRequest>(clientOptions.jsonMapper)

        override fun retrieve(
            params: DigitalWalletTokenRequestRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DigitalWalletTokenRequest>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired(
                "digitalWalletTokenRequestId",
                params.digitalWalletTokenRequestId().getOrNull(),
            )
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("digital_wallet_token_requests", params._pathParam(0))
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

        private val listHandler: Handler<DigitalWalletTokenRequestListPageResponse> =
            jsonHandler<DigitalWalletTokenRequestListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: DigitalWalletTokenRequestListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DigitalWalletTokenRequestListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("digital_wallet_token_requests")
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
                                DigitalWalletTokenRequestListPageAsync.builder()
                                    .service(
                                        DigitalWalletTokenRequestServiceAsyncImpl(clientOptions)
                                    )
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }
    }
}
