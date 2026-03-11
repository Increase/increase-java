// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.beneficialowners.BeneficialOwnerListPageAsync
import com.increase.api.models.beneficialowners.BeneficialOwnerListParams
import com.increase.api.models.beneficialowners.BeneficialOwnerRetrieveParams
import com.increase.api.models.beneficialowners.BeneficialOwnerUpdateParams
import com.increase.api.models.beneficialowners.EntityBeneficialOwner
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface BeneficialOwnerServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BeneficialOwnerServiceAsync

    /** Retrieve a Beneficial Owner */
    fun retrieve(entityBeneficialOwnerId: String): CompletableFuture<EntityBeneficialOwner> =
        retrieve(entityBeneficialOwnerId, BeneficialOwnerRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        entityBeneficialOwnerId: String,
        params: BeneficialOwnerRetrieveParams = BeneficialOwnerRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EntityBeneficialOwner> =
        retrieve(
            params.toBuilder().entityBeneficialOwnerId(entityBeneficialOwnerId).build(),
            requestOptions,
        )

    /** @see retrieve */
    fun retrieve(
        entityBeneficialOwnerId: String,
        params: BeneficialOwnerRetrieveParams = BeneficialOwnerRetrieveParams.none(),
    ): CompletableFuture<EntityBeneficialOwner> =
        retrieve(entityBeneficialOwnerId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: BeneficialOwnerRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EntityBeneficialOwner>

    /** @see retrieve */
    fun retrieve(params: BeneficialOwnerRetrieveParams): CompletableFuture<EntityBeneficialOwner> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        entityBeneficialOwnerId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<EntityBeneficialOwner> =
        retrieve(entityBeneficialOwnerId, BeneficialOwnerRetrieveParams.none(), requestOptions)

    /** Update a Beneficial Owner */
    fun update(entityBeneficialOwnerId: String): CompletableFuture<EntityBeneficialOwner> =
        update(entityBeneficialOwnerId, BeneficialOwnerUpdateParams.none())

    /** @see update */
    fun update(
        entityBeneficialOwnerId: String,
        params: BeneficialOwnerUpdateParams = BeneficialOwnerUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EntityBeneficialOwner> =
        update(
            params.toBuilder().entityBeneficialOwnerId(entityBeneficialOwnerId).build(),
            requestOptions,
        )

    /** @see update */
    fun update(
        entityBeneficialOwnerId: String,
        params: BeneficialOwnerUpdateParams = BeneficialOwnerUpdateParams.none(),
    ): CompletableFuture<EntityBeneficialOwner> =
        update(entityBeneficialOwnerId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: BeneficialOwnerUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EntityBeneficialOwner>

    /** @see update */
    fun update(params: BeneficialOwnerUpdateParams): CompletableFuture<EntityBeneficialOwner> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        entityBeneficialOwnerId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<EntityBeneficialOwner> =
        update(entityBeneficialOwnerId, BeneficialOwnerUpdateParams.none(), requestOptions)

    /** List Beneficial Owners */
    fun list(params: BeneficialOwnerListParams): CompletableFuture<BeneficialOwnerListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: BeneficialOwnerListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BeneficialOwnerListPageAsync>

    /**
     * A view of [BeneficialOwnerServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BeneficialOwnerServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /entity_beneficial_owners/{entity_beneficial_owner_id}`, but is otherwise the same as
         * [BeneficialOwnerServiceAsync.retrieve].
         */
        fun retrieve(
            entityBeneficialOwnerId: String
        ): CompletableFuture<HttpResponseFor<EntityBeneficialOwner>> =
            retrieve(entityBeneficialOwnerId, BeneficialOwnerRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            entityBeneficialOwnerId: String,
            params: BeneficialOwnerRetrieveParams = BeneficialOwnerRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EntityBeneficialOwner>> =
            retrieve(
                params.toBuilder().entityBeneficialOwnerId(entityBeneficialOwnerId).build(),
                requestOptions,
            )

        /** @see retrieve */
        fun retrieve(
            entityBeneficialOwnerId: String,
            params: BeneficialOwnerRetrieveParams = BeneficialOwnerRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<EntityBeneficialOwner>> =
            retrieve(entityBeneficialOwnerId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: BeneficialOwnerRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EntityBeneficialOwner>>

        /** @see retrieve */
        fun retrieve(
            params: BeneficialOwnerRetrieveParams
        ): CompletableFuture<HttpResponseFor<EntityBeneficialOwner>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            entityBeneficialOwnerId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EntityBeneficialOwner>> =
            retrieve(entityBeneficialOwnerId, BeneficialOwnerRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch
         * /entity_beneficial_owners/{entity_beneficial_owner_id}`, but is otherwise the same as
         * [BeneficialOwnerServiceAsync.update].
         */
        fun update(
            entityBeneficialOwnerId: String
        ): CompletableFuture<HttpResponseFor<EntityBeneficialOwner>> =
            update(entityBeneficialOwnerId, BeneficialOwnerUpdateParams.none())

        /** @see update */
        fun update(
            entityBeneficialOwnerId: String,
            params: BeneficialOwnerUpdateParams = BeneficialOwnerUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EntityBeneficialOwner>> =
            update(
                params.toBuilder().entityBeneficialOwnerId(entityBeneficialOwnerId).build(),
                requestOptions,
            )

        /** @see update */
        fun update(
            entityBeneficialOwnerId: String,
            params: BeneficialOwnerUpdateParams = BeneficialOwnerUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<EntityBeneficialOwner>> =
            update(entityBeneficialOwnerId, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: BeneficialOwnerUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EntityBeneficialOwner>>

        /** @see update */
        fun update(
            params: BeneficialOwnerUpdateParams
        ): CompletableFuture<HttpResponseFor<EntityBeneficialOwner>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            entityBeneficialOwnerId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EntityBeneficialOwner>> =
            update(entityBeneficialOwnerId, BeneficialOwnerUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /entity_beneficial_owners`, but is otherwise the
         * same as [BeneficialOwnerServiceAsync.list].
         */
        fun list(
            params: BeneficialOwnerListParams
        ): CompletableFuture<HttpResponseFor<BeneficialOwnerListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: BeneficialOwnerListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BeneficialOwnerListPageAsync>>
    }
}
