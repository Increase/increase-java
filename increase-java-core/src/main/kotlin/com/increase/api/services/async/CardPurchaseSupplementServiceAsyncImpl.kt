// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

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
import com.increase.api.core.prepareAsync
import com.increase.api.models.cardpurchasesupplements.CardPurchaseSupplement
import com.increase.api.models.cardpurchasesupplements.CardPurchaseSupplementListPageAsync
import com.increase.api.models.cardpurchasesupplements.CardPurchaseSupplementListPageResponse
import com.increase.api.models.cardpurchasesupplements.CardPurchaseSupplementListParams
import com.increase.api.models.cardpurchasesupplements.CardPurchaseSupplementRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class CardPurchaseSupplementServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) :
    CardPurchaseSupplementServiceAsync {

    private val withRawResponse: CardPurchaseSupplementServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CardPurchaseSupplementServiceAsync.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): CardPurchaseSupplementServiceAsync =
        CardPurchaseSupplementServiceAsyncImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun retrieve(
        params: CardPurchaseSupplementRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CardPurchaseSupplement> =
        // get /card_purchase_supplements/{card_purchase_supplement_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: CardPurchaseSupplementListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CardPurchaseSupplementListPageAsync> =
        // get /card_purchase_supplements
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CardPurchaseSupplementServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CardPurchaseSupplementServiceAsync.WithRawResponse =
            CardPurchaseSupplementServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<CardPurchaseSupplement> =
            jsonHandler<CardPurchaseSupplement>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: CardPurchaseSupplementRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CardPurchaseSupplement>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("cardPurchaseSupplementId", params.cardPurchaseSupplementId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("card_purchase_supplements", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
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

        private val listHandler: Handler<CardPurchaseSupplementListPageResponse> =
            jsonHandler<CardPurchaseSupplementListPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: CardPurchaseSupplementListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CardPurchaseSupplementListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("card_purchase_supplements")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                CardPurchaseSupplementListPageAsync.builder()
                                    .service(CardPurchaseSupplementServiceAsyncImpl(clientOptions))
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
