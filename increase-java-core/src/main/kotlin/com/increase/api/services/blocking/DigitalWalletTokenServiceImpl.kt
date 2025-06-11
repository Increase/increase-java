// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

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
import com.increase.api.core.http.parseable
import com.increase.api.core.prepare
import com.increase.api.models.digitalwallettokens.DigitalWalletToken
import com.increase.api.models.digitalwallettokens.DigitalWalletTokenListPage
import com.increase.api.models.digitalwallettokens.DigitalWalletTokenListPageResponse
import com.increase.api.models.digitalwallettokens.DigitalWalletTokenListParams
import com.increase.api.models.digitalwallettokens.DigitalWalletTokenRetrieveParams
import kotlin.jvm.optionals.getOrNull

class DigitalWalletTokenServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    DigitalWalletTokenService {

    private val withRawResponse: DigitalWalletTokenService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DigitalWalletTokenService.WithRawResponse = withRawResponse

    override fun retrieve(
        params: DigitalWalletTokenRetrieveParams,
        requestOptions: RequestOptions,
    ): DigitalWalletToken =
        // get /digital_wallet_tokens/{digital_wallet_token_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: DigitalWalletTokenListParams,
        requestOptions: RequestOptions,
    ): DigitalWalletTokenListPage =
        // get /digital_wallet_tokens
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DigitalWalletTokenService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<DigitalWalletToken> =
            jsonHandler<DigitalWalletToken>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: DigitalWalletTokenRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DigitalWalletToken> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("digitalWalletTokenId", params.digitalWalletTokenId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("digital_wallet_tokens", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<DigitalWalletTokenListPageResponse> =
            jsonHandler<DigitalWalletTokenListPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: DigitalWalletTokenListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DigitalWalletTokenListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("digital_wallet_tokens")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        DigitalWalletTokenListPage.builder()
                            .service(DigitalWalletTokenServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
