// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.entities.Entity
import com.increase.api.models.entities.EntityArchiveParams
import com.increase.api.models.entities.EntityCreateParams
import com.increase.api.models.entities.EntityListPageAsync
import com.increase.api.models.entities.EntityListParams
import com.increase.api.models.entities.EntityRetrieveParams
import com.increase.api.models.entities.EntityUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface EntityServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EntityServiceAsync

    /** Create an Entity */
    fun create(params: EntityCreateParams): CompletableFuture<Entity> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: EntityCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Entity>

    /** Retrieve an Entity */
    fun retrieve(entityId: String): CompletableFuture<Entity> =
        retrieve(entityId, EntityRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        entityId: String,
        params: EntityRetrieveParams = EntityRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Entity> =
        retrieve(params.toBuilder().entityId(entityId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        entityId: String,
        params: EntityRetrieveParams = EntityRetrieveParams.none(),
    ): CompletableFuture<Entity> = retrieve(entityId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: EntityRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Entity>

    /** @see retrieve */
    fun retrieve(params: EntityRetrieveParams): CompletableFuture<Entity> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(entityId: String, requestOptions: RequestOptions): CompletableFuture<Entity> =
        retrieve(entityId, EntityRetrieveParams.none(), requestOptions)

    /** Update an Entity */
    fun update(entityId: String): CompletableFuture<Entity> =
        update(entityId, EntityUpdateParams.none())

    /** @see update */
    fun update(
        entityId: String,
        params: EntityUpdateParams = EntityUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Entity> =
        update(params.toBuilder().entityId(entityId).build(), requestOptions)

    /** @see update */
    fun update(
        entityId: String,
        params: EntityUpdateParams = EntityUpdateParams.none(),
    ): CompletableFuture<Entity> = update(entityId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: EntityUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Entity>

    /** @see update */
    fun update(params: EntityUpdateParams): CompletableFuture<Entity> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(entityId: String, requestOptions: RequestOptions): CompletableFuture<Entity> =
        update(entityId, EntityUpdateParams.none(), requestOptions)

    /** List Entities */
    fun list(): CompletableFuture<EntityListPageAsync> = list(EntityListParams.none())

    /** @see list */
    fun list(
        params: EntityListParams = EntityListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EntityListPageAsync>

    /** @see list */
    fun list(
        params: EntityListParams = EntityListParams.none()
    ): CompletableFuture<EntityListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<EntityListPageAsync> =
        list(EntityListParams.none(), requestOptions)

    /** Archive an Entity */
    fun archive(entityId: String): CompletableFuture<Entity> =
        archive(entityId, EntityArchiveParams.none())

    /** @see archive */
    fun archive(
        entityId: String,
        params: EntityArchiveParams = EntityArchiveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Entity> =
        archive(params.toBuilder().entityId(entityId).build(), requestOptions)

    /** @see archive */
    fun archive(
        entityId: String,
        params: EntityArchiveParams = EntityArchiveParams.none(),
    ): CompletableFuture<Entity> = archive(entityId, params, RequestOptions.none())

    /** @see archive */
    fun archive(
        params: EntityArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Entity>

    /** @see archive */
    fun archive(params: EntityArchiveParams): CompletableFuture<Entity> =
        archive(params, RequestOptions.none())

    /** @see archive */
    fun archive(entityId: String, requestOptions: RequestOptions): CompletableFuture<Entity> =
        archive(entityId, EntityArchiveParams.none(), requestOptions)

    /**
     * A view of [EntityServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EntityServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /entities`, but is otherwise the same as
         * [EntityServiceAsync.create].
         */
        fun create(params: EntityCreateParams): CompletableFuture<HttpResponseFor<Entity>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: EntityCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Entity>>

        /**
         * Returns a raw HTTP response for `get /entities/{entity_id}`, but is otherwise the same as
         * [EntityServiceAsync.retrieve].
         */
        fun retrieve(entityId: String): CompletableFuture<HttpResponseFor<Entity>> =
            retrieve(entityId, EntityRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            entityId: String,
            params: EntityRetrieveParams = EntityRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Entity>> =
            retrieve(params.toBuilder().entityId(entityId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            entityId: String,
            params: EntityRetrieveParams = EntityRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<Entity>> =
            retrieve(entityId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: EntityRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Entity>>

        /** @see retrieve */
        fun retrieve(params: EntityRetrieveParams): CompletableFuture<HttpResponseFor<Entity>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            entityId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Entity>> =
            retrieve(entityId, EntityRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /entities/{entity_id}`, but is otherwise the same
         * as [EntityServiceAsync.update].
         */
        fun update(entityId: String): CompletableFuture<HttpResponseFor<Entity>> =
            update(entityId, EntityUpdateParams.none())

        /** @see update */
        fun update(
            entityId: String,
            params: EntityUpdateParams = EntityUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Entity>> =
            update(params.toBuilder().entityId(entityId).build(), requestOptions)

        /** @see update */
        fun update(
            entityId: String,
            params: EntityUpdateParams = EntityUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<Entity>> =
            update(entityId, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: EntityUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Entity>>

        /** @see update */
        fun update(params: EntityUpdateParams): CompletableFuture<HttpResponseFor<Entity>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            entityId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Entity>> =
            update(entityId, EntityUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /entities`, but is otherwise the same as
         * [EntityServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<EntityListPageAsync>> =
            list(EntityListParams.none())

        /** @see list */
        fun list(
            params: EntityListParams = EntityListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EntityListPageAsync>>

        /** @see list */
        fun list(
            params: EntityListParams = EntityListParams.none()
        ): CompletableFuture<HttpResponseFor<EntityListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<EntityListPageAsync>> =
            list(EntityListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /entities/{entity_id}/archive`, but is otherwise
         * the same as [EntityServiceAsync.archive].
         */
        fun archive(entityId: String): CompletableFuture<HttpResponseFor<Entity>> =
            archive(entityId, EntityArchiveParams.none())

        /** @see archive */
        fun archive(
            entityId: String,
            params: EntityArchiveParams = EntityArchiveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Entity>> =
            archive(params.toBuilder().entityId(entityId).build(), requestOptions)

        /** @see archive */
        fun archive(
            entityId: String,
            params: EntityArchiveParams = EntityArchiveParams.none(),
        ): CompletableFuture<HttpResponseFor<Entity>> =
            archive(entityId, params, RequestOptions.none())

        /** @see archive */
        fun archive(
            params: EntityArchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Entity>>

        /** @see archive */
        fun archive(params: EntityArchiveParams): CompletableFuture<HttpResponseFor<Entity>> =
            archive(params, RequestOptions.none())

        /** @see archive */
        fun archive(
            entityId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Entity>> =
            archive(entityId, EntityArchiveParams.none(), requestOptions)
    }
}
