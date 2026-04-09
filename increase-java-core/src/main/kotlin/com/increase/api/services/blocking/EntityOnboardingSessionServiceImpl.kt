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
import com.increase.api.models.entityonboardingsessions.EntityOnboardingSession
import com.increase.api.models.entityonboardingsessions.EntityOnboardingSessionCreateParams
import com.increase.api.models.entityonboardingsessions.EntityOnboardingSessionExpireParams
import com.increase.api.models.entityonboardingsessions.EntityOnboardingSessionListPage
import com.increase.api.models.entityonboardingsessions.EntityOnboardingSessionListPageResponse
import com.increase.api.models.entityonboardingsessions.EntityOnboardingSessionListParams
import com.increase.api.models.entityonboardingsessions.EntityOnboardingSessionRetrieveParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class EntityOnboardingSessionServiceImpl
internal constructor(private val clientOptions: ClientOptions) : EntityOnboardingSessionService {

    private val withRawResponse: EntityOnboardingSessionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): EntityOnboardingSessionService.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): EntityOnboardingSessionService =
        EntityOnboardingSessionServiceImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun create(
        params: EntityOnboardingSessionCreateParams,
        requestOptions: RequestOptions,
    ): EntityOnboardingSession =
        // post /entity_onboarding_sessions
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: EntityOnboardingSessionRetrieveParams,
        requestOptions: RequestOptions,
    ): EntityOnboardingSession =
        // get /entity_onboarding_sessions/{entity_onboarding_session_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: EntityOnboardingSessionListParams,
        requestOptions: RequestOptions,
    ): EntityOnboardingSessionListPage =
        // get /entity_onboarding_sessions
        withRawResponse().list(params, requestOptions).parse()

    override fun expire(
        params: EntityOnboardingSessionExpireParams,
        requestOptions: RequestOptions,
    ): EntityOnboardingSession =
        // post /entity_onboarding_sessions/{entity_onboarding_session_id}/expire
        withRawResponse().expire(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EntityOnboardingSessionService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EntityOnboardingSessionService.WithRawResponse =
            EntityOnboardingSessionServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<EntityOnboardingSession> =
            jsonHandler<EntityOnboardingSession>(clientOptions.jsonMapper)

        override fun create(
            params: EntityOnboardingSessionCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EntityOnboardingSession> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("entity_onboarding_sessions")
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

        private val retrieveHandler: Handler<EntityOnboardingSession> =
            jsonHandler<EntityOnboardingSession>(clientOptions.jsonMapper)

        override fun retrieve(
            params: EntityOnboardingSessionRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EntityOnboardingSession> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired(
                "entityOnboardingSessionId",
                params.entityOnboardingSessionId().getOrNull(),
            )
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("entity_onboarding_sessions", params._pathParam(0))
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

        private val listHandler: Handler<EntityOnboardingSessionListPageResponse> =
            jsonHandler<EntityOnboardingSessionListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: EntityOnboardingSessionListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EntityOnboardingSessionListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("entity_onboarding_sessions")
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
                        EntityOnboardingSessionListPage.builder()
                            .service(EntityOnboardingSessionServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val expireHandler: Handler<EntityOnboardingSession> =
            jsonHandler<EntityOnboardingSession>(clientOptions.jsonMapper)

        override fun expire(
            params: EntityOnboardingSessionExpireParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EntityOnboardingSession> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired(
                "entityOnboardingSessionId",
                params.entityOnboardingSessionId().getOrNull(),
            )
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("entity_onboarding_sessions", params._pathParam(0), "expire")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { expireHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
