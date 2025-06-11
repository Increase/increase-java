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
import com.increase.api.models.cardpurchasesupplements.CardPurchaseSupplement
import com.increase.api.models.cardpurchasesupplements.CardPurchaseSupplementListPage
import com.increase.api.models.cardpurchasesupplements.CardPurchaseSupplementListPageResponse
import com.increase.api.models.cardpurchasesupplements.CardPurchaseSupplementListParams
import com.increase.api.models.cardpurchasesupplements.CardPurchaseSupplementRetrieveParams
import kotlin.jvm.optionals.getOrNull

class CardPurchaseSupplementServiceImpl
internal constructor(private val clientOptions: ClientOptions) : CardPurchaseSupplementService {

    private val withRawResponse: CardPurchaseSupplementService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CardPurchaseSupplementService.WithRawResponse = withRawResponse

    override fun retrieve(
        params: CardPurchaseSupplementRetrieveParams,
        requestOptions: RequestOptions,
    ): CardPurchaseSupplement =
        // get /card_purchase_supplements/{card_purchase_supplement_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: CardPurchaseSupplementListParams,
        requestOptions: RequestOptions,
    ): CardPurchaseSupplementListPage =
        // get /card_purchase_supplements
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CardPurchaseSupplementService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<CardPurchaseSupplement> =
            jsonHandler<CardPurchaseSupplement>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: CardPurchaseSupplementRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardPurchaseSupplement> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("cardPurchaseSupplementId", params.cardPurchaseSupplementId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("card_purchase_supplements", params._pathParam(0))
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

        private val listHandler: Handler<CardPurchaseSupplementListPageResponse> =
            jsonHandler<CardPurchaseSupplementListPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: CardPurchaseSupplementListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardPurchaseSupplementListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("card_purchase_supplements")
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
                        CardPurchaseSupplementListPage.builder()
                            .service(CardPurchaseSupplementServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
