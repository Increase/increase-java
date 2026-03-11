// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.beneficialowners.BeneficialOwnerListPage
import com.increase.api.models.beneficialowners.BeneficialOwnerListParams
import com.increase.api.models.beneficialowners.BeneficialOwnerRetrieveParams
import com.increase.api.models.beneficialowners.BeneficialOwnerUpdateParams
import com.increase.api.models.beneficialowners.EntityBeneficialOwner
import java.util.function.Consumer

interface BeneficialOwnerService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BeneficialOwnerService

    /** Retrieve a Beneficial Owner */
    fun retrieve(entityBeneficialOwnerId: String): EntityBeneficialOwner =
        retrieve(entityBeneficialOwnerId, BeneficialOwnerRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        entityBeneficialOwnerId: String,
        params: BeneficialOwnerRetrieveParams = BeneficialOwnerRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EntityBeneficialOwner =
        retrieve(
            params.toBuilder().entityBeneficialOwnerId(entityBeneficialOwnerId).build(),
            requestOptions,
        )

    /** @see retrieve */
    fun retrieve(
        entityBeneficialOwnerId: String,
        params: BeneficialOwnerRetrieveParams = BeneficialOwnerRetrieveParams.none(),
    ): EntityBeneficialOwner = retrieve(entityBeneficialOwnerId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: BeneficialOwnerRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EntityBeneficialOwner

    /** @see retrieve */
    fun retrieve(params: BeneficialOwnerRetrieveParams): EntityBeneficialOwner =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        entityBeneficialOwnerId: String,
        requestOptions: RequestOptions,
    ): EntityBeneficialOwner =
        retrieve(entityBeneficialOwnerId, BeneficialOwnerRetrieveParams.none(), requestOptions)

    /** Update a Beneficial Owner */
    fun update(entityBeneficialOwnerId: String): EntityBeneficialOwner =
        update(entityBeneficialOwnerId, BeneficialOwnerUpdateParams.none())

    /** @see update */
    fun update(
        entityBeneficialOwnerId: String,
        params: BeneficialOwnerUpdateParams = BeneficialOwnerUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EntityBeneficialOwner =
        update(
            params.toBuilder().entityBeneficialOwnerId(entityBeneficialOwnerId).build(),
            requestOptions,
        )

    /** @see update */
    fun update(
        entityBeneficialOwnerId: String,
        params: BeneficialOwnerUpdateParams = BeneficialOwnerUpdateParams.none(),
    ): EntityBeneficialOwner = update(entityBeneficialOwnerId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: BeneficialOwnerUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EntityBeneficialOwner

    /** @see update */
    fun update(params: BeneficialOwnerUpdateParams): EntityBeneficialOwner =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        entityBeneficialOwnerId: String,
        requestOptions: RequestOptions,
    ): EntityBeneficialOwner =
        update(entityBeneficialOwnerId, BeneficialOwnerUpdateParams.none(), requestOptions)

    /** List Beneficial Owners */
    fun list(params: BeneficialOwnerListParams): BeneficialOwnerListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: BeneficialOwnerListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BeneficialOwnerListPage

    /**
     * A view of [BeneficialOwnerService] that provides access to raw HTTP responses for each
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
        ): BeneficialOwnerService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /entity_beneficial_owners/{entity_beneficial_owner_id}`, but is otherwise the same as
         * [BeneficialOwnerService.retrieve].
         */
        @MustBeClosed
        fun retrieve(entityBeneficialOwnerId: String): HttpResponseFor<EntityBeneficialOwner> =
            retrieve(entityBeneficialOwnerId, BeneficialOwnerRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            entityBeneficialOwnerId: String,
            params: BeneficialOwnerRetrieveParams = BeneficialOwnerRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EntityBeneficialOwner> =
            retrieve(
                params.toBuilder().entityBeneficialOwnerId(entityBeneficialOwnerId).build(),
                requestOptions,
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            entityBeneficialOwnerId: String,
            params: BeneficialOwnerRetrieveParams = BeneficialOwnerRetrieveParams.none(),
        ): HttpResponseFor<EntityBeneficialOwner> =
            retrieve(entityBeneficialOwnerId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: BeneficialOwnerRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EntityBeneficialOwner>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: BeneficialOwnerRetrieveParams
        ): HttpResponseFor<EntityBeneficialOwner> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            entityBeneficialOwnerId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EntityBeneficialOwner> =
            retrieve(entityBeneficialOwnerId, BeneficialOwnerRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch
         * /entity_beneficial_owners/{entity_beneficial_owner_id}`, but is otherwise the same as
         * [BeneficialOwnerService.update].
         */
        @MustBeClosed
        fun update(entityBeneficialOwnerId: String): HttpResponseFor<EntityBeneficialOwner> =
            update(entityBeneficialOwnerId, BeneficialOwnerUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            entityBeneficialOwnerId: String,
            params: BeneficialOwnerUpdateParams = BeneficialOwnerUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EntityBeneficialOwner> =
            update(
                params.toBuilder().entityBeneficialOwnerId(entityBeneficialOwnerId).build(),
                requestOptions,
            )

        /** @see update */
        @MustBeClosed
        fun update(
            entityBeneficialOwnerId: String,
            params: BeneficialOwnerUpdateParams = BeneficialOwnerUpdateParams.none(),
        ): HttpResponseFor<EntityBeneficialOwner> =
            update(entityBeneficialOwnerId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: BeneficialOwnerUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EntityBeneficialOwner>

        /** @see update */
        @MustBeClosed
        fun update(params: BeneficialOwnerUpdateParams): HttpResponseFor<EntityBeneficialOwner> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            entityBeneficialOwnerId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EntityBeneficialOwner> =
            update(entityBeneficialOwnerId, BeneficialOwnerUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /entity_beneficial_owners`, but is otherwise the
         * same as [BeneficialOwnerService.list].
         */
        @MustBeClosed
        fun list(params: BeneficialOwnerListParams): HttpResponseFor<BeneficialOwnerListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: BeneficialOwnerListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BeneficialOwnerListPage>
    }
}
