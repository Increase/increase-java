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
import com.increase.api.models.DigitalCardProfile
import com.increase.api.models.DigitalCardProfileArchiveParams
import com.increase.api.models.DigitalCardProfileCloneParams
import com.increase.api.models.DigitalCardProfileCreateParams
import com.increase.api.models.DigitalCardProfileListPage
import com.increase.api.models.DigitalCardProfileListParams
import com.increase.api.models.DigitalCardProfileRetrieveParams

class DigitalCardProfileServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    DigitalCardProfileService {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<DigitalCardProfile> =
        jsonHandler<DigitalCardProfile>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create a Digital Card Profile */
    override fun create(
        params: DigitalCardProfileCreateParams,
        requestOptions: RequestOptions,
    ): DigitalCardProfile {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("digital_card_profiles")
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

    private val retrieveHandler: Handler<DigitalCardProfile> =
        jsonHandler<DigitalCardProfile>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retrieve a Digital Card Profile */
    override fun retrieve(
        params: DigitalCardProfileRetrieveParams,
        requestOptions: RequestOptions,
    ): DigitalCardProfile {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("digital_card_profiles", params.getPathParam(0))
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

    private val listHandler: Handler<DigitalCardProfileListPage.Response> =
        jsonHandler<DigitalCardProfileListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List Card Profiles */
    override fun list(
        params: DigitalCardProfileListParams,
        requestOptions: RequestOptions,
    ): DigitalCardProfileListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("digital_card_profiles")
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
            .let { DigitalCardProfileListPage.of(this, params, it) }
    }

    private val archiveHandler: Handler<DigitalCardProfile> =
        jsonHandler<DigitalCardProfile>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Archive a Digital Card Profile */
    override fun archive(
        params: DigitalCardProfileArchiveParams,
        requestOptions: RequestOptions,
    ): DigitalCardProfile {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("digital_card_profiles", params.getPathParam(0), "archive")
                .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
                .prepare(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { archiveHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation!!) {
                    it.validate()
                }
            }
    }

    private val cloneHandler: Handler<DigitalCardProfile> =
        jsonHandler<DigitalCardProfile>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Clones a Digital Card Profile */
    override fun clone(
        params: DigitalCardProfileCloneParams,
        requestOptions: RequestOptions,
    ): DigitalCardProfile {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("digital_card_profiles", params.getPathParam(0), "clone")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { cloneHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation!!) {
                    it.validate()
                }
            }
    }
}
