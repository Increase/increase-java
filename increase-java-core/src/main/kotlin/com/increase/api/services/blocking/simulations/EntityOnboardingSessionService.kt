// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.entityonboardingsessions.EntityOnboardingSession
import com.increase.api.models.simulations.entityonboardingsessions.EntityOnboardingSessionSubmitParams
import java.util.function.Consumer

interface EntityOnboardingSessionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EntityOnboardingSessionService

    /**
     * Simulates the submission of an [Entity Onboarding Session](#entity-onboarding-sessions). This
     * session must have a `status` of `active`. After submission, the session will transition to
     * `expired` and a new Entity will be created.
     */
    fun submit(entityOnboardingSessionId: String): EntityOnboardingSession =
        submit(entityOnboardingSessionId, EntityOnboardingSessionSubmitParams.none())

    /** @see submit */
    fun submit(
        entityOnboardingSessionId: String,
        params: EntityOnboardingSessionSubmitParams = EntityOnboardingSessionSubmitParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EntityOnboardingSession =
        submit(
            params.toBuilder().entityOnboardingSessionId(entityOnboardingSessionId).build(),
            requestOptions,
        )

    /** @see submit */
    fun submit(
        entityOnboardingSessionId: String,
        params: EntityOnboardingSessionSubmitParams = EntityOnboardingSessionSubmitParams.none(),
    ): EntityOnboardingSession = submit(entityOnboardingSessionId, params, RequestOptions.none())

    /** @see submit */
    fun submit(
        params: EntityOnboardingSessionSubmitParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EntityOnboardingSession

    /** @see submit */
    fun submit(params: EntityOnboardingSessionSubmitParams): EntityOnboardingSession =
        submit(params, RequestOptions.none())

    /** @see submit */
    fun submit(
        entityOnboardingSessionId: String,
        requestOptions: RequestOptions,
    ): EntityOnboardingSession =
        submit(
            entityOnboardingSessionId,
            EntityOnboardingSessionSubmitParams.none(),
            requestOptions,
        )

    /**
     * A view of [EntityOnboardingSessionService] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EntityOnboardingSessionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /simulations/entity_onboarding_sessions/{entity_onboarding_session_id}/submit`, but is
         * otherwise the same as [EntityOnboardingSessionService.submit].
         */
        @MustBeClosed
        fun submit(entityOnboardingSessionId: String): HttpResponseFor<EntityOnboardingSession> =
            submit(entityOnboardingSessionId, EntityOnboardingSessionSubmitParams.none())

        /** @see submit */
        @MustBeClosed
        fun submit(
            entityOnboardingSessionId: String,
            params: EntityOnboardingSessionSubmitParams =
                EntityOnboardingSessionSubmitParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EntityOnboardingSession> =
            submit(
                params.toBuilder().entityOnboardingSessionId(entityOnboardingSessionId).build(),
                requestOptions,
            )

        /** @see submit */
        @MustBeClosed
        fun submit(
            entityOnboardingSessionId: String,
            params: EntityOnboardingSessionSubmitParams = EntityOnboardingSessionSubmitParams.none(),
        ): HttpResponseFor<EntityOnboardingSession> =
            submit(entityOnboardingSessionId, params, RequestOptions.none())

        /** @see submit */
        @MustBeClosed
        fun submit(
            params: EntityOnboardingSessionSubmitParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EntityOnboardingSession>

        /** @see submit */
        @MustBeClosed
        fun submit(
            params: EntityOnboardingSessionSubmitParams
        ): HttpResponseFor<EntityOnboardingSession> = submit(params, RequestOptions.none())

        /** @see submit */
        @MustBeClosed
        fun submit(
            entityOnboardingSessionId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EntityOnboardingSession> =
            submit(
                entityOnboardingSessionId,
                EntityOnboardingSessionSubmitParams.none(),
                requestOptions,
            )
    }
}
