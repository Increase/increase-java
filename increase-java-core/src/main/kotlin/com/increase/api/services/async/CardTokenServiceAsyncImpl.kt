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
import com.increase.api.models.cardtokens.CardToken
import com.increase.api.models.cardtokens.CardTokenCapabilities
import com.increase.api.models.cardtokens.CardTokenCapabilitiesParams
import com.increase.api.models.cardtokens.CardTokenListPageAsync
import com.increase.api.models.cardtokens.CardTokenListPageResponse
import com.increase.api.models.cardtokens.CardTokenListParams
import com.increase.api.models.cardtokens.CardTokenRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class CardTokenServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CardTokenServiceAsync {

    private val withRawResponse: CardTokenServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CardTokenServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CardTokenServiceAsync =
        CardTokenServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: CardTokenRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CardToken> =
        // get /card_tokens/{card_token_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: CardTokenListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CardTokenListPageAsync> =
        // get /card_tokens
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun capabilities(
        params: CardTokenCapabilitiesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CardTokenCapabilities> =
        // get /card_tokens/{card_token_id}/capabilities
        withRawResponse().capabilities(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CardTokenServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CardTokenServiceAsync.WithRawResponse =
            CardTokenServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<CardToken> =
            jsonHandler<CardToken>(clientOptions.jsonMapper)

        override fun retrieve(
            params: CardTokenRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CardToken>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("cardTokenId", params.cardTokenId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("card_tokens", params._pathParam(0))
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

        private val listHandler: Handler<CardTokenListPageResponse> =
            jsonHandler<CardTokenListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: CardTokenListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CardTokenListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("card_tokens")
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
                                CardTokenListPageAsync.builder()
                                    .service(CardTokenServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val capabilitiesHandler: Handler<CardTokenCapabilities> =
            jsonHandler<CardTokenCapabilities>(clientOptions.jsonMapper)

        override fun capabilities(
            params: CardTokenCapabilitiesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CardTokenCapabilities>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("cardTokenId", params.cardTokenId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("card_tokens", params._pathParam(0), "capabilities")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { capabilitiesHandler.handle(it) }
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
