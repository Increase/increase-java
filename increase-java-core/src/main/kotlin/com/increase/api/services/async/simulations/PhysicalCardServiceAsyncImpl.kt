// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

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
import com.increase.api.models.physicalcards.PhysicalCard
import com.increase.api.models.simulations.physicalcards.PhysicalCardAdvanceShipmentParams
import com.increase.api.models.simulations.physicalcards.PhysicalCardCreateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class PhysicalCardServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    PhysicalCardServiceAsync {

    private val withRawResponse: PhysicalCardServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PhysicalCardServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PhysicalCardServiceAsync =
        PhysicalCardServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: PhysicalCardCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PhysicalCard> =
        // post /simulations/physical_cards/{physical_card_id}/tracking_updates
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun advanceShipment(
        params: PhysicalCardAdvanceShipmentParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PhysicalCard> =
        // post /simulations/physical_cards/{physical_card_id}/advance_shipment
        withRawResponse().advanceShipment(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PhysicalCardServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PhysicalCardServiceAsync.WithRawResponse =
            PhysicalCardServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<PhysicalCard> =
            jsonHandler<PhysicalCard>(clientOptions.jsonMapper)

        override fun create(
            params: PhysicalCardCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PhysicalCard>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("physicalCardId", params.physicalCardId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "simulations",
                        "physical_cards",
                        params._pathParam(0),
                        "tracking_updates",
                    )
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

        private val advanceShipmentHandler: Handler<PhysicalCard> =
            jsonHandler<PhysicalCard>(clientOptions.jsonMapper)

        override fun advanceShipment(
            params: PhysicalCardAdvanceShipmentParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PhysicalCard>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("physicalCardId", params.physicalCardId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "simulations",
                        "physical_cards",
                        params._pathParam(0),
                        "advance_shipment",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { advanceShipmentHandler.handle(it) }
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
