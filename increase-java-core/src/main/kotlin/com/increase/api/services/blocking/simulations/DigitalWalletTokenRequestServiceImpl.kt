// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

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
import com.increase.api.core.prepare
import com.increase.api.models.simulations.digitalwallettokenrequests.DigitalWalletTokenRequestCreateParams
import com.increase.api.models.simulations.digitalwallettokenrequests.DigitalWalletTokenRequestCreateResponse
import java.util.function.Consumer

class DigitalWalletTokenRequestServiceImpl
internal constructor(private val clientOptions: ClientOptions) : DigitalWalletTokenRequestService {

    private val withRawResponse: DigitalWalletTokenRequestService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DigitalWalletTokenRequestService.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): DigitalWalletTokenRequestService =
        DigitalWalletTokenRequestServiceImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun create(
        params: DigitalWalletTokenRequestCreateParams,
        requestOptions: RequestOptions,
    ): DigitalWalletTokenRequestCreateResponse =
        // post /simulations/digital_wallet_token_requests
        withRawResponse().create(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DigitalWalletTokenRequestService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DigitalWalletTokenRequestService.WithRawResponse =
            DigitalWalletTokenRequestServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<DigitalWalletTokenRequestCreateResponse> =
            jsonHandler<DigitalWalletTokenRequestCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: DigitalWalletTokenRequestCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DigitalWalletTokenRequestCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("simulations", "digital_wallet_token_requests")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
