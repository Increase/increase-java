package com.increase.api.services.async

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.errors.IncreaseError
import com.increase.api.models.CardProfile
import com.increase.api.models.CardProfileCreateParams
import com.increase.api.models.CardProfileListPageAsync
import com.increase.api.models.CardProfileListParams
import com.increase.api.models.CardProfileRetrieveParams
import com.increase.api.services.errorHandler
import com.increase.api.services.json
import com.increase.api.services.jsonHandler
import com.increase.api.services.withErrorHandler
import java.util.concurrent.CompletableFuture

class CardProfileServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : CardProfileServiceAsync {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<CardProfile> =
        jsonHandler<CardProfile>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create a Card Profile */
    override fun create(
        params: CardProfileCreateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<CardProfile> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("card_profiles")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request).thenApply { response ->
            response
                .let { createHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val retrieveHandler: Handler<CardProfile> =
        jsonHandler<CardProfile>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retrieve a Card Profile */
    override fun retrieve(
        params: CardProfileRetrieveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<CardProfile> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("card_profiles", params.getPathParam(0))
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request).thenApply { response ->
            response
                .let { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listHandler: Handler<CardProfileListPageAsync.Response> =
        jsonHandler<CardProfileListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List Card Profiles */
    override fun list(
        params: CardProfileListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<CardProfileListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("card_profiles")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request).thenApply { response ->
            response
                .let { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { CardProfileListPageAsync.of(this, params, it) }
        }
    }
}
