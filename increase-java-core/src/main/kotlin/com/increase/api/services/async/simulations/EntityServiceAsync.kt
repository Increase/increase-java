// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.entities.Entity
import com.increase.api.models.simulations.entities.EntityUpdateValidationParams
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
     * Simulate updates to an
     * [Entity's validation](/documentation/api/entities#entity-object.validation). In production,
     * Know Your Customer validations
     * [run automatically](/documentation/entity-validation#entity-validation) for eligible
     * programs. While developing, use this API to simulate issues with information submissions.
     */
    fun updateValidation(
        entityId: String,
        params: EntityUpdateValidationParams,
    ): CompletableFuture<Entity> = updateValidation(entityId, params, RequestOptions.none())

    /** @see updateValidation */
    fun updateValidation(
        entityId: String,
        params: EntityUpdateValidationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Entity> =
        updateValidation(params.toBuilder().entityId(entityId).build(), requestOptions)

    /** @see updateValidation */
    fun updateValidation(params: EntityUpdateValidationParams): CompletableFuture<Entity> =
        updateValidation(params, RequestOptions.none())

    /** @see updateValidation */
    fun updateValidation(
        params: EntityUpdateValidationParams,
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
         * Returns a raw HTTP response for `post
         * /simulations/entities/{entity_id}/update_validation`, but is otherwise the same as
         * [EntityServiceAsync.updateValidation].
         */
        fun updateValidation(
            entityId: String,
            params: EntityUpdateValidationParams,
        ): CompletableFuture<HttpResponseFor<Entity>> =
            updateValidation(entityId, params, RequestOptions.none())

        /** @see updateValidation */
        fun updateValidation(
            entityId: String,
            params: EntityUpdateValidationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Entity>> =
            updateValidation(params.toBuilder().entityId(entityId).build(), requestOptions)

        /** @see updateValidation */
        fun updateValidation(
            params: EntityUpdateValidationParams
        ): CompletableFuture<HttpResponseFor<Entity>> =
            updateValidation(params, RequestOptions.none())

        /** @see updateValidation */
        fun updateValidation(
            params: EntityUpdateValidationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Entity>>
    }
}
