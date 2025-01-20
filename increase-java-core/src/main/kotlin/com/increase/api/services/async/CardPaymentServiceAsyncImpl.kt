// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.handlers.errorHandler
import com.increase.api.core.handlers.jsonHandler
import com.increase.api.core.handlers.withErrorHandler
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.errors.IncreaseError
import com.increase.api.models.CardPayment
import com.increase.api.models.CardPaymentListPageAsync
import com.increase.api.models.CardPaymentListParams
import com.increase.api.models.CardPaymentRetrieveParams
import java.util.concurrent.CompletableFuture

class CardPaymentServiceAsyncImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : CardPaymentServiceAsync {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<CardPayment> =
        jsonHandler<CardPayment>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retrieve a Card Payment */
    override fun retrieve(
        params: CardPaymentRetrieveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<CardPayment> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("card_payments", params.getPathParam(0))
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listHandler: Handler<CardPaymentListPageAsync.Response> =
        jsonHandler<CardPaymentListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List Card Payments */
    override fun list(
        params: CardPaymentListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<CardPaymentListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("card_payments")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { CardPaymentListPageAsync.of(this, params, it) }
        }
    }
}
