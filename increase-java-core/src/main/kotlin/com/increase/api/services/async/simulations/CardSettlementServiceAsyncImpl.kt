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
import com.increase.api.models.SimulationCardSettlementCreateParams
import com.increase.api.models.Transaction
import java.util.concurrent.CompletableFuture

class CardSettlementServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : CardSettlementServiceAsync {

    private val withRawResponse: CardSettlementServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CardSettlementServiceAsync.WithRawResponse = withRawResponse

    override fun create(
        params: SimulationCardSettlementCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Transaction> =
        // post /simulations/card_settlements
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CardSettlementServiceAsync.WithRawResponse {

        private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<Transaction> =
            jsonHandler<Transaction>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: SimulationCardSettlementCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Transaction>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("simulations", "card_settlements")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
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
