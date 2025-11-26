// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.checkRequired
import com.increase.api.core.handlers.errorBodyHandler
import com.increase.api.core.handlers.errorHandler
import com.increase.api.core.handlers.jsonHandler
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.core.http.json
import com.increase.api.core.http.parseable
import com.increase.api.core.prepare
import com.increase.api.models.eventsubscriptions.EventSubscription
import com.increase.api.models.eventsubscriptions.EventSubscriptionCreateParams
import com.increase.api.models.eventsubscriptions.EventSubscriptionListParams
import com.increase.api.models.eventsubscriptions.EventSubscriptionListResponse
import com.increase.api.models.eventsubscriptions.EventSubscriptionRetrieveParams
import com.increase.api.models.eventsubscriptions.EventSubscriptionUpdateParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class EventSubscriptionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    EventSubscriptionService {

    private val withRawResponse: EventSubscriptionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): EventSubscriptionService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EventSubscriptionService =
        EventSubscriptionServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: EventSubscriptionCreateParams,
        requestOptions: RequestOptions,
    ): EventSubscription =
        // post /event_subscriptions
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: EventSubscriptionRetrieveParams,
        requestOptions: RequestOptions,
    ): EventSubscription =
        // get /event_subscriptions/{event_subscription_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: EventSubscriptionUpdateParams,
        requestOptions: RequestOptions,
    ): EventSubscription =
        // patch /event_subscriptions/{event_subscription_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: EventSubscriptionListParams,
        requestOptions: RequestOptions,
    ): EventSubscriptionListResponse =
        // get /event_subscriptions
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EventSubscriptionService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EventSubscriptionService.WithRawResponse =
            EventSubscriptionServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<EventSubscription> =
            jsonHandler<EventSubscription>(clientOptions.jsonMapper)

        override fun create(
            params: EventSubscriptionCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EventSubscription> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("event_subscriptions")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<EventSubscription> =
            jsonHandler<EventSubscription>(clientOptions.jsonMapper)

        override fun retrieve(
            params: EventSubscriptionRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EventSubscription> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("eventSubscriptionId", params.eventSubscriptionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("event_subscriptions", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<EventSubscription> =
            jsonHandler<EventSubscription>(clientOptions.jsonMapper)

        override fun update(
            params: EventSubscriptionUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EventSubscription> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("eventSubscriptionId", params.eventSubscriptionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("event_subscriptions", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<EventSubscriptionListResponse> =
            jsonHandler<EventSubscriptionListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: EventSubscriptionListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EventSubscriptionListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("event_subscriptions")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
