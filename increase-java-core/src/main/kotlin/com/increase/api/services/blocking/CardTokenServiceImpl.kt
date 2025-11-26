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
import com.increase.api.core.http.parseable
import com.increase.api.core.prepare
import com.increase.api.models.cardtokens.CardToken
import com.increase.api.models.cardtokens.CardTokenCapabilities
import com.increase.api.models.cardtokens.CardTokenCapabilitiesParams
import com.increase.api.models.cardtokens.CardTokenListParams
import com.increase.api.models.cardtokens.CardTokenListResponse
import com.increase.api.models.cardtokens.CardTokenRetrieveParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class CardTokenServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CardTokenService {

    private val withRawResponse: CardTokenService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CardTokenService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CardTokenService =
        CardTokenServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: CardTokenRetrieveParams,
        requestOptions: RequestOptions,
    ): CardToken =
        // get /card_tokens/{card_token_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: CardTokenListParams,
        requestOptions: RequestOptions,
    ): CardTokenListResponse =
        // get /card_tokens
        withRawResponse().list(params, requestOptions).parse()

    override fun capabilities(
        params: CardTokenCapabilitiesParams,
        requestOptions: RequestOptions,
    ): CardTokenCapabilities =
        // get /card_tokens/{card_token_id}/capabilities
        withRawResponse().capabilities(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CardTokenService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CardTokenService.WithRawResponse =
            CardTokenServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<CardToken> =
            jsonHandler<CardToken>(clientOptions.jsonMapper)

        override fun retrieve(
            params: CardTokenRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardToken> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("cardTokenId", params.cardTokenId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("card_tokens", params._pathParam(0))
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

        private val listHandler: Handler<CardTokenListResponse> =
            jsonHandler<CardTokenListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: CardTokenListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardTokenListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("card_tokens")
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
            }
        }

        private val capabilitiesHandler: Handler<CardTokenCapabilities> =
            jsonHandler<CardTokenCapabilities>(clientOptions.jsonMapper)

        override fun capabilities(
            params: CardTokenCapabilitiesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardTokenCapabilities> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("cardTokenId", params.cardTokenId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("card_tokens", params._pathParam(0), "capabilities")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
