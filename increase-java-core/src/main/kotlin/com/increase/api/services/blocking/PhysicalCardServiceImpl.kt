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
import com.increase.api.core.json
import com.increase.api.core.prepare
import com.increase.api.errors.IncreaseError
import com.increase.api.models.PhysicalCard
import com.increase.api.models.PhysicalCardCreateParams
import com.increase.api.models.PhysicalCardListPage
import com.increase.api.models.PhysicalCardListParams
import com.increase.api.models.PhysicalCardRetrieveParams
import com.increase.api.models.PhysicalCardUpdateParams

class PhysicalCardServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PhysicalCardService {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<PhysicalCard> =
        jsonHandler<PhysicalCard>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create a Physical Card */
    override fun create(
        params: PhysicalCardCreateParams,
        requestOptions: RequestOptions,
    ): PhysicalCard {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("physical_cards")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { createHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation!!) {
                    it.validate()
                }
            }
    }

    private val retrieveHandler: Handler<PhysicalCard> =
        jsonHandler<PhysicalCard>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retrieve a Physical Card */
    override fun retrieve(
        params: PhysicalCardRetrieveParams,
        requestOptions: RequestOptions,
    ): PhysicalCard {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("physical_cards", params.getPathParam(0))
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

    private val updateHandler: Handler<PhysicalCard> =
        jsonHandler<PhysicalCard>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Update a Physical Card */
    override fun update(
        params: PhysicalCardUpdateParams,
        requestOptions: RequestOptions,
    ): PhysicalCard {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PATCH)
                .addPathSegments("physical_cards", params.getPathParam(0))
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { updateHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation!!) {
                    it.validate()
                }
            }
    }

    private val listHandler: Handler<PhysicalCardListPage.Response> =
        jsonHandler<PhysicalCardListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List Physical Cards */
    override fun list(
        params: PhysicalCardListParams,
        requestOptions: RequestOptions,
    ): PhysicalCardListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("physical_cards")
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
            .let { PhysicalCardListPage.of(this, params, it) }
    }
}
