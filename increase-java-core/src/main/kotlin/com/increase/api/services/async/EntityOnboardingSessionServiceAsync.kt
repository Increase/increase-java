// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.entityonboardingsessions.EntityOnboardingSession
import com.increase.api.models.entityonboardingsessions.EntityOnboardingSessionCreateParams
import com.increase.api.models.entityonboardingsessions.EntityOnboardingSessionExpireParams
import com.increase.api.models.entityonboardingsessions.EntityOnboardingSessionListPageAsync
import com.increase.api.models.entityonboardingsessions.EntityOnboardingSessionListParams
import com.increase.api.models.entityonboardingsessions.EntityOnboardingSessionRetrieveParams
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

    /** Create an Entity Onboarding Session */
    fun create(
        params: EntityOnboardingSessionCreateParams
    ): CompletableFuture<EntityOnboardingSession> = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: EntityOnboardingSessionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EntityOnboardingSession>

    /** Retrieve an Entity Onboarding Session */
    fun retrieve(entityOnboardingSessionId: String): CompletableFuture<EntityOnboardingSession> =
        retrieve(entityOnboardingSessionId, EntityOnboardingSessionRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        entityOnboardingSessionId: String,
        params: EntityOnboardingSessionRetrieveParams =
            EntityOnboardingSessionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EntityOnboardingSession> =
        retrieve(
            params.toBuilder().entityOnboardingSessionId(entityOnboardingSessionId).build(),
            requestOptions,
        )

    /** @see retrieve */
    fun retrieve(
        entityOnboardingSessionId: String,
        params: EntityOnboardingSessionRetrieveParams = EntityOnboardingSessionRetrieveParams.none(),
    ): CompletableFuture<EntityOnboardingSession> =
        retrieve(entityOnboardingSessionId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: EntityOnboardingSessionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EntityOnboardingSession>

    /** @see retrieve */
    fun retrieve(
        params: EntityOnboardingSessionRetrieveParams
    ): CompletableFuture<EntityOnboardingSession> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        entityOnboardingSessionId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<EntityOnboardingSession> =
        retrieve(
            entityOnboardingSessionId,
            EntityOnboardingSessionRetrieveParams.none(),
            requestOptions,
        )

    /** List Entity Onboarding Session */
    fun list(): CompletableFuture<EntityOnboardingSessionListPageAsync> =
        list(EntityOnboardingSessionListParams.none())

    /** @see list */
    fun list(
        params: EntityOnboardingSessionListParams = EntityOnboardingSessionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EntityOnboardingSessionListPageAsync>

    /** @see list */
    fun list(
        params: EntityOnboardingSessionListParams = EntityOnboardingSessionListParams.none()
    ): CompletableFuture<EntityOnboardingSessionListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        requestOptions: RequestOptions
    ): CompletableFuture<EntityOnboardingSessionListPageAsync> =
        list(EntityOnboardingSessionListParams.none(), requestOptions)

    /** Expire an Entity Onboarding Session */
    fun expire(entityOnboardingSessionId: String): CompletableFuture<EntityOnboardingSession> =
        expire(entityOnboardingSessionId, EntityOnboardingSessionExpireParams.none())

    /** @see expire */
    fun expire(
        entityOnboardingSessionId: String,
        params: EntityOnboardingSessionExpireParams = EntityOnboardingSessionExpireParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EntityOnboardingSession> =
        expire(
            params.toBuilder().entityOnboardingSessionId(entityOnboardingSessionId).build(),
            requestOptions,
        )

    /** @see expire */
    fun expire(
        entityOnboardingSessionId: String,
        params: EntityOnboardingSessionExpireParams = EntityOnboardingSessionExpireParams.none(),
    ): CompletableFuture<EntityOnboardingSession> =
        expire(entityOnboardingSessionId, params, RequestOptions.none())

    /** @see expire */
    fun expire(
        params: EntityOnboardingSessionExpireParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EntityOnboardingSession>

    /** @see expire */
    fun expire(
        params: EntityOnboardingSessionExpireParams
    ): CompletableFuture<EntityOnboardingSession> = expire(params, RequestOptions.none())

    /** @see expire */
    fun expire(
        entityOnboardingSessionId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<EntityOnboardingSession> =
        expire(
            entityOnboardingSessionId,
            EntityOnboardingSessionExpireParams.none(),
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
         * Returns a raw HTTP response for `post /entity_onboarding_sessions`, but is otherwise the
         * same as [EntityOnboardingSessionServiceAsync.create].
         */
        fun create(
            params: EntityOnboardingSessionCreateParams
        ): CompletableFuture<HttpResponseFor<EntityOnboardingSession>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: EntityOnboardingSessionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EntityOnboardingSession>>

        /**
         * Returns a raw HTTP response for `get
         * /entity_onboarding_sessions/{entity_onboarding_session_id}`, but is otherwise the same as
         * [EntityOnboardingSessionServiceAsync.retrieve].
         */
        fun retrieve(
            entityOnboardingSessionId: String
        ): CompletableFuture<HttpResponseFor<EntityOnboardingSession>> =
            retrieve(entityOnboardingSessionId, EntityOnboardingSessionRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            entityOnboardingSessionId: String,
            params: EntityOnboardingSessionRetrieveParams =
                EntityOnboardingSessionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EntityOnboardingSession>> =
            retrieve(
                params.toBuilder().entityOnboardingSessionId(entityOnboardingSessionId).build(),
                requestOptions,
            )

        /** @see retrieve */
        fun retrieve(
            entityOnboardingSessionId: String,
            params: EntityOnboardingSessionRetrieveParams =
                EntityOnboardingSessionRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<EntityOnboardingSession>> =
            retrieve(entityOnboardingSessionId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: EntityOnboardingSessionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EntityOnboardingSession>>

        /** @see retrieve */
        fun retrieve(
            params: EntityOnboardingSessionRetrieveParams
        ): CompletableFuture<HttpResponseFor<EntityOnboardingSession>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            entityOnboardingSessionId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EntityOnboardingSession>> =
            retrieve(
                entityOnboardingSessionId,
                EntityOnboardingSessionRetrieveParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /entity_onboarding_sessions`, but is otherwise the
         * same as [EntityOnboardingSessionServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<EntityOnboardingSessionListPageAsync>> =
            list(EntityOnboardingSessionListParams.none())

        /** @see list */
        fun list(
            params: EntityOnboardingSessionListParams = EntityOnboardingSessionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EntityOnboardingSessionListPageAsync>>

        /** @see list */
        fun list(
            params: EntityOnboardingSessionListParams = EntityOnboardingSessionListParams.none()
        ): CompletableFuture<HttpResponseFor<EntityOnboardingSessionListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<EntityOnboardingSessionListPageAsync>> =
            list(EntityOnboardingSessionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /entity_onboarding_sessions/{entity_onboarding_session_id}/expire`, but is otherwise the
         * same as [EntityOnboardingSessionServiceAsync.expire].
         */
        fun expire(
            entityOnboardingSessionId: String
        ): CompletableFuture<HttpResponseFor<EntityOnboardingSession>> =
            expire(entityOnboardingSessionId, EntityOnboardingSessionExpireParams.none())

        /** @see expire */
        fun expire(
            entityOnboardingSessionId: String,
            params: EntityOnboardingSessionExpireParams =
                EntityOnboardingSessionExpireParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EntityOnboardingSession>> =
            expire(
                params.toBuilder().entityOnboardingSessionId(entityOnboardingSessionId).build(),
                requestOptions,
            )

        /** @see expire */
        fun expire(
            entityOnboardingSessionId: String,
            params: EntityOnboardingSessionExpireParams = EntityOnboardingSessionExpireParams.none(),
        ): CompletableFuture<HttpResponseFor<EntityOnboardingSession>> =
            expire(entityOnboardingSessionId, params, RequestOptions.none())

        /** @see expire */
        fun expire(
            params: EntityOnboardingSessionExpireParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EntityOnboardingSession>>

        /** @see expire */
        fun expire(
            params: EntityOnboardingSessionExpireParams
        ): CompletableFuture<HttpResponseFor<EntityOnboardingSession>> =
            expire(params, RequestOptions.none())

        /** @see expire */
        fun expire(
            entityOnboardingSessionId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EntityOnboardingSession>> =
            expire(
                entityOnboardingSessionId,
                EntityOnboardingSessionExpireParams.none(),
                requestOptions,
            )
    }
}
