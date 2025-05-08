// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

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
import com.increase.api.core.http.json
import com.increase.api.core.http.parseable
import com.increase.api.core.prepareAsync
import com.increase.api.models.achprenotifications.AchPrenotification
import com.increase.api.models.achprenotifications.AchPrenotificationCreateParams
import com.increase.api.models.achprenotifications.AchPrenotificationListPageAsync
import com.increase.api.models.achprenotifications.AchPrenotificationListPageResponse
import com.increase.api.models.achprenotifications.AchPrenotificationListParams
import com.increase.api.models.achprenotifications.AchPrenotificationRetrieveParams
import java.util.concurrent.CompletableFuture
import kotlin.jvm.optionals.getOrNull

class AchPrenotificationServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : AchPrenotificationServiceAsync {

    private val withRawResponse: AchPrenotificationServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AchPrenotificationServiceAsync.WithRawResponse = withRawResponse

    override fun create(
        params: AchPrenotificationCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AchPrenotification> =
        // post /ach_prenotifications
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: AchPrenotificationRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AchPrenotification> =
        // get /ach_prenotifications/{ach_prenotification_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: AchPrenotificationListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AchPrenotificationListPageAsync> =
        // get /ach_prenotifications
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AchPrenotificationServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<AchPrenotification> =
            jsonHandler<AchPrenotification>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: AchPrenotificationCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AchPrenotification>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("ach_prenotifications")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveHandler: Handler<AchPrenotification> =
            jsonHandler<AchPrenotification>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: AchPrenotificationRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AchPrenotification>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("achPrenotificationId", params.achPrenotificationId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("ach_prenotifications", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
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

        private val listHandler: Handler<AchPrenotificationListPageResponse> =
            jsonHandler<AchPrenotificationListPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: AchPrenotificationListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AchPrenotificationListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("ach_prenotifications")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                AchPrenotificationListPageAsync.builder()
                                    .service(AchPrenotificationServiceAsyncImpl(clientOptions))
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }
    }
}
