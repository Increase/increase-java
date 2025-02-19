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
import com.increase.api.core.json
import com.increase.api.core.prepareAsync
import com.increase.api.errors.IncreaseError
import com.increase.api.models.AchPrenotification
import com.increase.api.models.AchPrenotificationCreateParams
import com.increase.api.models.AchPrenotificationListPageAsync
import com.increase.api.models.AchPrenotificationListParams
import com.increase.api.models.AchPrenotificationRetrieveParams
import java.util.concurrent.CompletableFuture

class AchPrenotificationServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : AchPrenotificationServiceAsync {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<AchPrenotification> =
        jsonHandler<AchPrenotification>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create an ACH Prenotification */
    override fun create(
        params: AchPrenotificationCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AchPrenotification> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("ach_prenotifications")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }

    private val retrieveHandler: Handler<AchPrenotification> =
        jsonHandler<AchPrenotification>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retrieve an ACH Prenotification */
    override fun retrieve(
        params: AchPrenotificationRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AchPrenotification> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("ach_prenotifications", params.getPathParam(0))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }

    private val listHandler: Handler<AchPrenotificationListPageAsync.Response> =
        jsonHandler<AchPrenotificationListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List ACH Prenotifications */
    override fun list(
        params: AchPrenotificationListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AchPrenotificationListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("ach_prenotifications")
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
                    .let { AchPrenotificationListPageAsync.of(this, params, it) }
            }
    }
}
