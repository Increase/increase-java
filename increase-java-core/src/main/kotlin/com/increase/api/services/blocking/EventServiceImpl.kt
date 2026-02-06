// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.UnwrapWebhookParams
import com.increase.api.core.checkRequired
import com.increase.api.core.handlers.errorBodyHandler
import com.increase.api.core.handlers.errorHandler
import com.increase.api.core.handlers.jsonHandler
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.core.http.parseable
import com.increase.api.core.prepare
import com.increase.api.errors.IncreaseInvalidDataException
import com.increase.api.errors.IncreaseWebhookException
import com.increase.api.models.events.Event
import com.increase.api.models.events.EventListPage
import com.increase.api.models.events.EventListPageResponse
import com.increase.api.models.events.EventListParams
import com.increase.api.models.events.EventRetrieveParams
import com.increase.api.models.events.UnwrapWebhookEvent
import com.standardwebhooks.Webhook
import com.standardwebhooks.exceptions.WebhookVerificationException
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class EventServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    EventService {

    private val withRawResponse: EventService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): EventService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EventService =
        EventServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(params: EventRetrieveParams, requestOptions: RequestOptions): Event =
        // get /events/{event_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(params: EventListParams, requestOptions: RequestOptions): EventListPage =
        // get /events
        withRawResponse().list(params, requestOptions).parse()

    override fun unwrap(body: String): UnwrapWebhookEvent =
        try {
            clientOptions.jsonMapper.readValue(body, jacksonTypeRef<UnwrapWebhookEvent>())
        } catch (e: Exception) {
            throw IncreaseInvalidDataException("Error parsing body", e)
        }

    override fun unwrap(unwrapParams: UnwrapWebhookParams): UnwrapWebhookEvent {
        val headers = unwrapParams.headers().getOrNull()
        if (headers != null) {
            try {
                val webhookSecret =
                    checkRequired(
                        "webhookSecret",
                        unwrapParams.secret().getOrNull()
                            ?: clientOptions.webhookSecret().getOrNull(),
                    )
                val headersMap =
                    headers.names().associateWith { name -> headers.values(name) }.toMap()

                val webhook = Webhook(webhookSecret)
                webhook.verify(unwrapParams.body(), headersMap)
            } catch (e: WebhookVerificationException) {
                throw IncreaseWebhookException("Could not verify webhook event signature", e)
            }
        }
        return unwrap(unwrapParams.body())
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EventService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EventService.WithRawResponse =
            EventServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<Event> = jsonHandler<Event>(clientOptions.jsonMapper)

        override fun retrieve(
            params: EventRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Event> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("eventId", params.eventId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("events", params._pathParam(0))
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

        private val listHandler: Handler<EventListPageResponse> =
            jsonHandler<EventListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: EventListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EventListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("events")
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
                    .let {
                        EventListPage.builder()
                            .service(EventServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
