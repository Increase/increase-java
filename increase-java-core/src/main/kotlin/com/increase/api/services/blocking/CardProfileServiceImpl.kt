package com.increase.api.services.blocking

import com.fasterxml.jackson.databind.json.JsonMapper
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import kotlin.LazyThreadSafetyMode.PUBLICATION
import java.time.LocalDate
import java.time.Duration
import java.time.OffsetDateTime
import java.util.Base64
import java.util.Optional
import java.util.UUID
import java.util.concurrent.CompletableFuture
import java.util.stream.Stream
import com.increase.api.core.NoAutoDetect
import com.increase.api.errors.IncreaseInvalidDataException
import com.increase.api.models.CardProfile
import com.increase.api.models.CardProfileCreateParams
import com.increase.api.models.CardProfileListPage
import com.increase.api.models.CardProfileListParams
import com.increase.api.models.CardProfileRetrieveParams
import com.increase.api.core.ClientOptions
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.core.JsonField
import com.increase.api.core.RequestOptions
import com.increase.api.errors.IncreaseError
import com.increase.api.services.emptyHandler
import com.increase.api.services.errorHandler
import com.increase.api.services.json
import com.increase.api.services.jsonHandler
import com.increase.api.services.stringHandler
import com.increase.api.services.withErrorHandler

class CardProfileServiceImpl constructor(private val clientOptions: ClientOptions,) : CardProfileService {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<CardProfile> =
    jsonHandler<CardProfile>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /** Create a Card Profile */
    override fun create(
        params: CardProfileCreateParams,
        requestOptions: RequestOptions
    ): CardProfile {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("card_profiles")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
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
    jsonHandler<CardProfile>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /** Retrieve a Card Profile */
    override fun retrieve(
        params: CardProfileRetrieveParams,
        requestOptions: RequestOptions
    ): CardProfile {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("card_profiles", params.getPathParam(0))
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .let { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listHandler: Handler<CardProfileListPage.Response> =
    jsonHandler<CardProfileListPage.Response>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /** List Card Profiles */
    override fun list(
        params: CardProfileListParams,
        requestOptions: RequestOptions
    ): CardProfileListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("card_profiles")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .let { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { CardProfileListPage.of(this, params, it) }
        }
    }
}
