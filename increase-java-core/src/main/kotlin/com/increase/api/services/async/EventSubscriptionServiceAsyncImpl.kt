// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

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
import com.increase.api.core.prepareAsync
import com.increase.api.models.eventsubscriptions.EventSubscription
import com.increase.api.models.eventsubscriptions.EventSubscriptionCreateParams
import com.increase.api.models.eventsubscriptions.EventSubscriptionListPageAsync
import com.increase.api.models.eventsubscriptions.EventSubscriptionListPageResponse
import com.increase.api.models.eventsubscriptions.EventSubscriptionListParams
import com.increase.api.models.eventsubscriptions.EventSubscriptionRetrieveParams
import com.increase.api.models.eventsubscriptions.EventSubscriptionUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class EventSubscriptionServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : EventSubscriptionServiceAsync {

    private val withRawResponse: EventSubscriptionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): EventSubscriptionServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): EventSubscriptionServiceAsync =
        EventSubscriptionServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: EventSubscriptionCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EventSubscription> =
        // post /event_subscriptions
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: EventSubscriptionRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EventSubscription> =
        // get /event_subscriptions/{event_subscription_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: EventSubscriptionUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EventSubscription> =
        // patch /event_subscriptions/{event_subscription_id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: EventSubscriptionListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EventSubscriptionListPageAsync> =
        // get /event_subscriptions
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EventSubscriptionServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EventSubscriptionServiceAsync.WithRawResponse =
            EventSubscriptionServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<EventSubscription> =
            jsonHandler<EventSubscription>(clientOptions.jsonMapper)

        override fun create(
            params: EventSubscriptionCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EventSubscription>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("event_subscriptions")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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

        private val retrieveHandler: Handler<EventSubscription> =
            jsonHandler<EventSubscription>(clientOptions.jsonMapper)

        override fun retrieve(
            params: EventSubscriptionRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EventSubscription>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("eventSubscriptionId", params.eventSubscriptionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("event_subscriptions", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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

        private val updateHandler: Handler<EventSubscription> =
            jsonHandler<EventSubscription>(clientOptions.jsonMapper)

        override fun update(
            params: EventSubscriptionUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EventSubscription>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<EventSubscriptionListPageResponse> =
            jsonHandler<EventSubscriptionListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: EventSubscriptionListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EventSubscriptionListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("event_subscriptions")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                EventSubscriptionListPageAsync.builder()
                                    .service(EventSubscriptionServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }
    }
}
