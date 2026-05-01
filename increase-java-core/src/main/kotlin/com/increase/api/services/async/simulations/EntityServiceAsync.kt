// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.entities.Entity
import com.increase.api.models.simulations.entities.EntityValidationParams
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

    /**
     * Set the status for an
     * [Entity's validation](/documentation/api/entities#entity-object.validation). In production,
     * Know Your Customer validations
     * [run automatically](/documentation/entity-validation#entity-validation). While developing, it
     * can be helpful to override the behavior in Sandbox.
     */
    fun validation(entityId: String, params: EntityValidationParams): CompletableFuture<Entity> =
        validation(entityId, params, RequestOptions.none())

    /** @see validation */
    fun validation(
        entityId: String,
        params: EntityValidationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Entity> =
        validation(params.toBuilder().entityId(entityId).build(), requestOptions)

    /** @see validation */
    fun validation(params: EntityValidationParams): CompletableFuture<Entity> =
        validation(params, RequestOptions.none())

    /** @see validation */
    fun validation(
        params: EntityValidationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Entity>

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
         * Returns a raw HTTP response for `post /simulations/entities/{entity_id}/validation`, but
         * is otherwise the same as [EntityServiceAsync.validation].
         */
        fun validation(
            entityId: String,
            params: EntityValidationParams,
        ): CompletableFuture<HttpResponseFor<Entity>> =
            validation(entityId, params, RequestOptions.none())

        /** @see validation */
        fun validation(
            entityId: String,
            params: EntityValidationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Entity>> =
            validation(params.toBuilder().entityId(entityId).build(), requestOptions)

        /** @see validation */
        fun validation(params: EntityValidationParams): CompletableFuture<HttpResponseFor<Entity>> =
            validation(params, RequestOptions.none())

        /** @see validation */
        fun validation(
            params: EntityValidationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Entity>>
    }
}
