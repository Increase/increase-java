// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

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
import com.increase.api.models.simulations.entityonboardingsessions.EntityOnboardingSessionSubmitParams
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

    override fun submit(
        params: EntityOnboardingSessionSubmitParams,
        requestOptions: RequestOptions,
    ): EntityOnboardingSession =
        // post /simulations/entity_onboarding_sessions/{entity_onboarding_session_id}/submit
        withRawResponse().submit(params, requestOptions).parse()

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

        private val submitHandler: Handler<EntityOnboardingSession> =
            jsonHandler<EntityOnboardingSession>(clientOptions.jsonMapper)

        override fun submit(
            params: EntityOnboardingSessionSubmitParams,
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
                    .addPathSegments(
                        "simulations",
                        "entity_onboarding_sessions",
                        params._pathParam(0),
                        "submit",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { submitHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
