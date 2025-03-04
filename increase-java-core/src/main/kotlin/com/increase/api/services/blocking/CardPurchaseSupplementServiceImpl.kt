// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.handlers.errorHandler
import com.increase.api.core.handlers.jsonHandler
import com.increase.api.core.handlers.withErrorHandler
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.core.prepare
import com.increase.api.errors.IncreaseError
import com.increase.api.models.CardPurchaseSupplement
import com.increase.api.models.CardPurchaseSupplementListPage
import com.increase.api.models.CardPurchaseSupplementListParams
import com.increase.api.models.CardPurchaseSupplementRetrieveParams

class CardPurchaseSupplementServiceImpl
internal constructor(private val clientOptions: ClientOptions) : CardPurchaseSupplementService {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<CardPurchaseSupplement> =
        jsonHandler<CardPurchaseSupplement>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retrieve a Card Purchase Supplement */
    override fun retrieve(
        params: CardPurchaseSupplementRetrieveParams,
        requestOptions: RequestOptions,
    ): CardPurchaseSupplement {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("card_purchase_supplements", params.getPathParam(0))
                .build()
                .prepare(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { retrieveHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation!!) {
                    it.validate()
                }
            }
    }

    private val listHandler: Handler<CardPurchaseSupplementListPage.Response> =
        jsonHandler<CardPurchaseSupplementListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List Card Purchase Supplements */
    override fun list(
        params: CardPurchaseSupplementListParams,
        requestOptions: RequestOptions,
    ): CardPurchaseSupplementListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("card_purchase_supplements")
                .build()
                .prepare(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { listHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation!!) {
                    it.validate()
                }
            }
            .let { CardPurchaseSupplementListPage.of(this, params, it) }
    }
}
