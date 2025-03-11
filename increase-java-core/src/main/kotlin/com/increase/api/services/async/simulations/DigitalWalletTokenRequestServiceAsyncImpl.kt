// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

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
import com.increase.api.models.simulations.digitalwallettokenrequests.DigitalWalletTokenRequestCreateParams
import com.increase.api.models.simulations.digitalwallettokenrequests.DigitalWalletTokenRequestCreateResponse
import java.util.concurrent.CompletableFuture

class DigitalWalletTokenRequestServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : DigitalWalletTokenRequestServiceAsync {

    private val withRawResponse: DigitalWalletTokenRequestServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): DigitalWalletTokenRequestServiceAsync.WithRawResponse = withRawResponse

    override fun create(params: DigitalWalletTokenRequestCreateParams, requestOptions: RequestOptions): CompletableFuture<DigitalWalletTokenRequestCreateResponse> =
        // post /simulations/digital_wallet_token_requests
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : DigitalWalletTokenRequestServiceAsync.WithRawResponse {

        private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<DigitalWalletTokenRequestCreateResponse> = jsonHandler<DigitalWalletTokenRequestCreateResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(params: DigitalWalletTokenRequestCreateParams, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<DigitalWalletTokenRequestCreateResponse>> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .addPathSegments("simulations", "digital_wallet_token_requests")
            .body(json(clientOptions.jsonMapper, params._body()))
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          return request.thenComposeAsync { clientOptions.httpClient.executeAsync(
            it, requestOptions
          ) }.thenApply { response -> response.parseable {
              response.use {
                  createHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
          } }
        }
    }
}
