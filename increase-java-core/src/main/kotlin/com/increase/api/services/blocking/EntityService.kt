// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.Entity
import com.increase.api.models.EntityArchiveBeneficialOwnerParams
import com.increase.api.models.EntityArchiveParams
import com.increase.api.models.EntityConfirmParams
import com.increase.api.models.EntityCreateBeneficialOwnerParams
import com.increase.api.models.EntityCreateParams
import com.increase.api.models.EntityListPage
import com.increase.api.models.EntityListParams
import com.increase.api.models.EntityRetrieveParams
import com.increase.api.models.EntityUpdateAddressParams
import com.increase.api.models.EntityUpdateBeneficialOwnerAddressParams
import com.increase.api.models.EntityUpdateIndustryCodeParams

interface EntityService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create an Entity */
    @JvmOverloads
    fun create(
        params: EntityCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Entity

    /** Retrieve an Entity */
    @JvmOverloads
    fun retrieve(
        params: EntityRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Entity

    /** List Entities */
    @JvmOverloads
    fun list(
        params: EntityListParams = EntityListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EntityListPage

    /** List Entities */
    fun list(requestOptions: RequestOptions): EntityListPage =
        list(EntityListParams.none(), requestOptions)

    /** Archive an Entity */
    @JvmOverloads
    fun archive(
        params: EntityArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Entity

    /** Archive a beneficial owner for a corporate Entity */
    @JvmOverloads
    fun archiveBeneficialOwner(
        params: EntityArchiveBeneficialOwnerParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Entity

    /**
     * Depending on your program, you may be required to re-confirm an Entity's details on a
     * recurring basis. After making any required updates, call this endpoint to record that your
     * user confirmed their details.
     */
    @JvmOverloads
    fun confirm(
        params: EntityConfirmParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Entity

    /** Create a beneficial owner for a corporate Entity */
    @JvmOverloads
    fun createBeneficialOwner(
        params: EntityCreateBeneficialOwnerParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Entity

    /** Update a Natural Person or Corporation's address */
    @JvmOverloads
    fun updateAddress(
        params: EntityUpdateAddressParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Entity

    /** Update the address for a beneficial owner belonging to a corporate Entity */
    @JvmOverloads
    fun updateBeneficialOwnerAddress(
        params: EntityUpdateBeneficialOwnerAddressParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Entity

    /** Update the industry code for a corporate Entity */
    @JvmOverloads
    fun updateIndustryCode(
        params: EntityUpdateIndustryCodeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Entity

    /** A view of [EntityService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /entities`, but is otherwise the same as
         * [EntityService.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: EntityCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Entity>

        /**
         * Returns a raw HTTP response for `get /entities/{entity_id}`, but is otherwise the same as
         * [EntityService.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: EntityRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Entity>

        /**
         * Returns a raw HTTP response for `get /entities`, but is otherwise the same as
         * [EntityService.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: EntityListParams = EntityListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EntityListPage>

        /**
         * Returns a raw HTTP response for `get /entities`, but is otherwise the same as
         * [EntityService.list].
         */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<EntityListPage> =
            list(EntityListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /entities/{entity_id}/archive`, but is otherwise
         * the same as [EntityService.archive].
         */
        @JvmOverloads
        @MustBeClosed
        fun archive(
            params: EntityArchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Entity>

        /**
         * Returns a raw HTTP response for `post /entities/{entity_id}/archive_beneficial_owner`,
         * but is otherwise the same as [EntityService.archiveBeneficialOwner].
         */
        @JvmOverloads
        @MustBeClosed
        fun archiveBeneficialOwner(
            params: EntityArchiveBeneficialOwnerParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Entity>

        /**
         * Returns a raw HTTP response for `post /entities/{entity_id}/confirm`, but is otherwise
         * the same as [EntityService.confirm].
         */
        @JvmOverloads
        @MustBeClosed
        fun confirm(
            params: EntityConfirmParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Entity>

        /**
         * Returns a raw HTTP response for `post /entities/{entity_id}/create_beneficial_owner`, but
         * is otherwise the same as [EntityService.createBeneficialOwner].
         */
        @JvmOverloads
        @MustBeClosed
        fun createBeneficialOwner(
            params: EntityCreateBeneficialOwnerParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Entity>

        /**
         * Returns a raw HTTP response for `post /entities/{entity_id}/update_address`, but is
         * otherwise the same as [EntityService.updateAddress].
         */
        @JvmOverloads
        @MustBeClosed
        fun updateAddress(
            params: EntityUpdateAddressParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Entity>

        /**
         * Returns a raw HTTP response for `post
         * /entities/{entity_id}/update_beneficial_owner_address`, but is otherwise the same as
         * [EntityService.updateBeneficialOwnerAddress].
         */
        @JvmOverloads
        @MustBeClosed
        fun updateBeneficialOwnerAddress(
            params: EntityUpdateBeneficialOwnerAddressParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Entity>

        /**
         * Returns a raw HTTP response for `post /entities/{entity_id}/update_industry_code`, but is
         * otherwise the same as [EntityService.updateIndustryCode].
         */
        @JvmOverloads
        @MustBeClosed
        fun updateIndustryCode(
            params: EntityUpdateIndustryCodeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Entity>
    }
}
