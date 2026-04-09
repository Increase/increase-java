// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.entityonboardingsessions.EntityOnboardingSession
import com.increase.api.models.simulations.entityonboardingsessions.EntityOnboardingSessionSubmitParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface EntityOnboardingSessionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EntityOnboardingSessionServiceAsync

    /**
     * Simulates the submission of an [Entity Onboarding Session](#entity-onboarding-sessions). This
     * session must have a `status` of `active`. After submission, the session will transition to
     * `expired` and a new Entity will be created.
     */
    fun submit(entityOnboardingSessionId: String): CompletableFuture<EntityOnboardingSession> =
        submit(entityOnboardingSessionId, EntityOnboardingSessionSubmitParams.none())

    /** @see submit */
    fun submit(
        entityOnboardingSessionId: String,
        params: EntityOnboardingSessionSubmitParams = EntityOnboardingSessionSubmitParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EntityOnboardingSession> =
        submit(
            params.toBuilder().entityOnboardingSessionId(entityOnboardingSessionId).build(),
            requestOptions,
        )

    /** @see submit */
    fun submit(
        entityOnboardingSessionId: String,
        params: EntityOnboardingSessionSubmitParams = EntityOnboardingSessionSubmitParams.none(),
    ): CompletableFuture<EntityOnboardingSession> =
        submit(entityOnboardingSessionId, params, RequestOptions.none())

    /** @see submit */
    fun submit(
        params: EntityOnboardingSessionSubmitParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EntityOnboardingSession>

    /** @see submit */
    fun submit(
        params: EntityOnboardingSessionSubmitParams
    ): CompletableFuture<EntityOnboardingSession> = submit(params, RequestOptions.none())

    /** @see submit */
    fun submit(
        entityOnboardingSessionId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<EntityOnboardingSession> =
        submit(
            entityOnboardingSessionId,
            EntityOnboardingSessionSubmitParams.none(),
            requestOptions,
        )

    /**
     * A view of [EntityOnboardingSessionServiceAsync] that provides access to raw HTTP responses
     * for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EntityOnboardingSessionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /simulations/entity_onboarding_sessions/{entity_onboarding_session_id}/submit`, but is
         * otherwise the same as [EntityOnboardingSessionServiceAsync.submit].
         */
        fun submit(
            entityOnboardingSessionId: String
        ): CompletableFuture<HttpResponseFor<EntityOnboardingSession>> =
            submit(entityOnboardingSessionId, EntityOnboardingSessionSubmitParams.none())

        /** @see submit */
        fun submit(
            entityOnboardingSessionId: String,
            params: EntityOnboardingSessionSubmitParams =
                EntityOnboardingSessionSubmitParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EntityOnboardingSession>> =
            submit(
                params.toBuilder().entityOnboardingSessionId(entityOnboardingSessionId).build(),
                requestOptions,
            )

        /** @see submit */
        fun submit(
            entityOnboardingSessionId: String,
            params: EntityOnboardingSessionSubmitParams = EntityOnboardingSessionSubmitParams.none(),
        ): CompletableFuture<HttpResponseFor<EntityOnboardingSession>> =
            submit(entityOnboardingSessionId, params, RequestOptions.none())

        /** @see submit */
        fun submit(
            params: EntityOnboardingSessionSubmitParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EntityOnboardingSession>>

        /** @see submit */
        fun submit(
            params: EntityOnboardingSessionSubmitParams
        ): CompletableFuture<HttpResponseFor<EntityOnboardingSession>> =
            submit(params, RequestOptions.none())

        /** @see submit */
        fun submit(
            entityOnboardingSessionId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EntityOnboardingSession>> =
            submit(
                entityOnboardingSessionId,
                EntityOnboardingSessionSubmitParams.none(),
                requestOptions,
            )
    }
}
