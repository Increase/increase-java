// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.core.ClientOptions
import com.increase.api.core.JsonValue
import com.increase.api.core.RequestOptions
import com.increase.api.core.handlers.errorHandler
import com.increase.api.core.handlers.jsonHandler
import com.increase.api.core.handlers.withErrorHandler
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.core.http.json
import com.increase.api.core.http.parseable
import com.increase.api.core.prepare
import com.increase.api.models.achprenotifications.AchPrenotification
import com.increase.api.models.achprenotifications.AchPrenotificationCreateParams
import com.increase.api.models.achprenotifications.AchPrenotificationListPage
import com.increase.api.models.achprenotifications.AchPrenotificationListPageResponse
import com.increase.api.models.achprenotifications.AchPrenotificationListParams
import com.increase.api.models.achprenotifications.AchPrenotificationRetrieveParams

class AchPrenotificationServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AchPrenotificationService {

    private val withRawResponse: AchPrenotificationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AchPrenotificationService.WithRawResponse = withRawResponse

    override fun create(
        params: AchPrenotificationCreateParams,
        requestOptions: RequestOptions,
    ): AchPrenotification =
        // post /ach_prenotifications
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: AchPrenotificationRetrieveParams,
        requestOptions: RequestOptions,
    ): AchPrenotification =
        // get /ach_prenotifications/{ach_prenotification_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: AchPrenotificationListParams,
        requestOptions: RequestOptions,
    ): AchPrenotificationListPage =
        // get /ach_prenotifications
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AchPrenotificationService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<AchPrenotification> =
            jsonHandler<AchPrenotification>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: AchPrenotificationCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AchPrenotification> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("ach_prenotifications")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<AchPrenotification> =
            jsonHandler<AchPrenotification>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: AchPrenotificationRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AchPrenotification> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("ach_prenotifications", params._pathParam(0))
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

        private val listHandler: Handler<AchPrenotificationListPageResponse> =
            jsonHandler<AchPrenotificationListPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: AchPrenotificationListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AchPrenotificationListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("ach_prenotifications")
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
                        AchPrenotificationListPage.of(
                            AchPrenotificationServiceImpl(clientOptions),
                            params,
                            it,
                        )
                    }
            }
        }
    }
}
