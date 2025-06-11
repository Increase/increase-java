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
import com.increase.api.models.cardpayments.CardPayment
import com.increase.api.models.cardpayments.CardPaymentListPage
import com.increase.api.models.cardpayments.CardPaymentListPageResponse
import com.increase.api.models.cardpayments.CardPaymentListParams
import com.increase.api.models.cardpayments.CardPaymentRetrieveParams
import kotlin.jvm.optionals.getOrNull

class CardPaymentServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CardPaymentService {

    private val withRawResponse: CardPaymentService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CardPaymentService.WithRawResponse = withRawResponse

    override fun retrieve(
        params: CardPaymentRetrieveParams,
        requestOptions: RequestOptions,
    ): CardPayment =
        // get /card_payments/{card_payment_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: CardPaymentListParams,
        requestOptions: RequestOptions,
    ): CardPaymentListPage =
        // get /card_payments
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CardPaymentService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<CardPayment> =
            jsonHandler<CardPayment>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: CardPaymentRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardPayment> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("cardPaymentId", params.cardPaymentId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("card_payments", params._pathParam(0))
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

        private val listHandler: Handler<CardPaymentListPageResponse> =
            jsonHandler<CardPaymentListPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: CardPaymentListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardPaymentListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("card_payments")
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
                        CardPaymentListPage.builder()
                            .service(CardPaymentServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
