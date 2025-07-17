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
import com.increase.api.models.cardpayments.CardPayment
import com.increase.api.models.cardpayments.CardPaymentListPageAsync
import com.increase.api.models.cardpayments.CardPaymentListPageResponse
import com.increase.api.models.cardpayments.CardPaymentListParams
import com.increase.api.models.cardpayments.CardPaymentRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class CardPaymentServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CardPaymentServiceAsync {

    private val withRawResponse: CardPaymentServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CardPaymentServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CardPaymentServiceAsync =
        CardPaymentServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: CardPaymentRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CardPayment> =
        // get /card_payments/{card_payment_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: CardPaymentListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CardPaymentListPageAsync> =
        // get /card_payments
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CardPaymentServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CardPaymentServiceAsync.WithRawResponse =
            CardPaymentServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<CardPayment> =
            jsonHandler<CardPayment>(clientOptions.jsonMapper)

        override fun retrieve(
            params: CardPaymentRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CardPayment>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("cardPaymentId", params.cardPaymentId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("card_payments", params._pathParam(0))
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

        private val listHandler: Handler<CardPaymentListPageResponse> =
            jsonHandler<CardPaymentListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: CardPaymentListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CardPaymentListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("card_payments")
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
                                CardPaymentListPageAsync.builder()
                                    .service(CardPaymentServiceAsyncImpl(clientOptions))
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
