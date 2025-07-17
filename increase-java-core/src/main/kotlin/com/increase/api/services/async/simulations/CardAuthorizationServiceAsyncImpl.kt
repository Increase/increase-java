// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
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
import com.increase.api.models.simulations.cardauthorizations.CardAuthorizationCreateParams
import com.increase.api.models.simulations.cardauthorizations.CardAuthorizationCreateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class CardAuthorizationServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : CardAuthorizationServiceAsync {

    private val withRawResponse: CardAuthorizationServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CardAuthorizationServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): CardAuthorizationServiceAsync =
        CardAuthorizationServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: CardAuthorizationCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CardAuthorizationCreateResponse> =
        // post /simulations/card_authorizations
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CardAuthorizationServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CardAuthorizationServiceAsync.WithRawResponse =
            CardAuthorizationServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<CardAuthorizationCreateResponse> =
            jsonHandler<CardAuthorizationCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: CardAuthorizationCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CardAuthorizationCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("simulations", "card_authorizations")
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
    }
}
