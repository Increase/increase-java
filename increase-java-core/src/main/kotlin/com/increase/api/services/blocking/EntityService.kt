// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.entities.Entity
import com.increase.api.models.entities.EntityArchiveBeneficialOwnerParams
import com.increase.api.models.entities.EntityArchiveParams
import com.increase.api.models.entities.EntityConfirmParams
import com.increase.api.models.entities.EntityCreateBeneficialOwnerParams
import com.increase.api.models.entities.EntityCreateParams
import com.increase.api.models.entities.EntityListPage
import com.increase.api.models.entities.EntityListParams
import com.increase.api.models.entities.EntityRetrieveParams
import com.increase.api.models.entities.EntityUpdateAddressParams
import com.increase.api.models.entities.EntityUpdateBeneficialOwnerAddressParams
import com.increase.api.models.entities.EntityUpdateIndustryCodeParams
import java.util.function.Consumer

interface EntityService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EntityService

    /** Create an Entity */
    fun create(params: EntityCreateParams): Entity = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: EntityCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Entity

    /** Retrieve an Entity */
    fun retrieve(entityId: String): Entity = retrieve(entityId, EntityRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        entityId: String,
        params: EntityRetrieveParams = EntityRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Entity = retrieve(params.toBuilder().entityId(entityId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        entityId: String,
        params: EntityRetrieveParams = EntityRetrieveParams.none(),
    ): Entity = retrieve(entityId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: EntityRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Entity

    /** @see retrieve */
    fun retrieve(params: EntityRetrieveParams): Entity = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(entityId: String, requestOptions: RequestOptions): Entity =
        retrieve(entityId, EntityRetrieveParams.none(), requestOptions)

    /** List Entities */
    fun list(): EntityListPage = list(EntityListParams.none())

    /** @see list */
    fun list(
        params: EntityListParams = EntityListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EntityListPage

    /** @see list */
    fun list(params: EntityListParams = EntityListParams.none()): EntityListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): EntityListPage =
        list(EntityListParams.none(), requestOptions)

    /** Archive an Entity */
    fun archive(entityId: String): Entity = archive(entityId, EntityArchiveParams.none())

    /** @see archive */
    fun archive(
        entityId: String,
        params: EntityArchiveParams = EntityArchiveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Entity = archive(params.toBuilder().entityId(entityId).build(), requestOptions)

    /** @see archive */
    fun archive(
        entityId: String,
        params: EntityArchiveParams = EntityArchiveParams.none(),
    ): Entity = archive(entityId, params, RequestOptions.none())

    /** @see archive */
    fun archive(
        params: EntityArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Entity

    /** @see archive */
    fun archive(params: EntityArchiveParams): Entity = archive(params, RequestOptions.none())

    /** @see archive */
    fun archive(entityId: String, requestOptions: RequestOptions): Entity =
        archive(entityId, EntityArchiveParams.none(), requestOptions)

    /** Archive a beneficial owner for a corporate Entity */
    fun archiveBeneficialOwner(
        entityId: String,
        params: EntityArchiveBeneficialOwnerParams,
    ): Entity = archiveBeneficialOwner(entityId, params, RequestOptions.none())

    /** @see archiveBeneficialOwner */
    fun archiveBeneficialOwner(
        entityId: String,
        params: EntityArchiveBeneficialOwnerParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Entity =
        archiveBeneficialOwner(params.toBuilder().entityId(entityId).build(), requestOptions)

    /** @see archiveBeneficialOwner */
    fun archiveBeneficialOwner(params: EntityArchiveBeneficialOwnerParams): Entity =
        archiveBeneficialOwner(params, RequestOptions.none())

    /** @see archiveBeneficialOwner */
    fun archiveBeneficialOwner(
        params: EntityArchiveBeneficialOwnerParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Entity

    /**
     * Depending on your program, you may be required to re-confirm an Entity's details on a
     * recurring basis. After making any required updates, call this endpoint to record that your
     * user confirmed their details.
     */
    fun confirm(entityId: String): Entity = confirm(entityId, EntityConfirmParams.none())

    /** @see confirm */
    fun confirm(
        entityId: String,
        params: EntityConfirmParams = EntityConfirmParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Entity = confirm(params.toBuilder().entityId(entityId).build(), requestOptions)

    /** @see confirm */
    fun confirm(
        entityId: String,
        params: EntityConfirmParams = EntityConfirmParams.none(),
    ): Entity = confirm(entityId, params, RequestOptions.none())

    /** @see confirm */
    fun confirm(
        params: EntityConfirmParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Entity

    /** @see confirm */
    fun confirm(params: EntityConfirmParams): Entity = confirm(params, RequestOptions.none())

    /** @see confirm */
    fun confirm(entityId: String, requestOptions: RequestOptions): Entity =
        confirm(entityId, EntityConfirmParams.none(), requestOptions)

    /** Create a beneficial owner for a corporate Entity */
    fun createBeneficialOwner(entityId: String, params: EntityCreateBeneficialOwnerParams): Entity =
        createBeneficialOwner(entityId, params, RequestOptions.none())

    /** @see createBeneficialOwner */
    fun createBeneficialOwner(
        entityId: String,
        params: EntityCreateBeneficialOwnerParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Entity = createBeneficialOwner(params.toBuilder().entityId(entityId).build(), requestOptions)

    /** @see createBeneficialOwner */
    fun createBeneficialOwner(params: EntityCreateBeneficialOwnerParams): Entity =
        createBeneficialOwner(params, RequestOptions.none())

    /** @see createBeneficialOwner */
    fun createBeneficialOwner(
        params: EntityCreateBeneficialOwnerParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Entity

    /** Update a Natural Person or Corporation's address */
    fun updateAddress(entityId: String, params: EntityUpdateAddressParams): Entity =
        updateAddress(entityId, params, RequestOptions.none())

    /** @see updateAddress */
    fun updateAddress(
        entityId: String,
        params: EntityUpdateAddressParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Entity = updateAddress(params.toBuilder().entityId(entityId).build(), requestOptions)

    /** @see updateAddress */
    fun updateAddress(params: EntityUpdateAddressParams): Entity =
        updateAddress(params, RequestOptions.none())

    /** @see updateAddress */
    fun updateAddress(
        params: EntityUpdateAddressParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Entity

    /** Update the address for a beneficial owner belonging to a corporate Entity */
    fun updateBeneficialOwnerAddress(
        entityId: String,
        params: EntityUpdateBeneficialOwnerAddressParams,
    ): Entity = updateBeneficialOwnerAddress(entityId, params, RequestOptions.none())

    /** @see updateBeneficialOwnerAddress */
    fun updateBeneficialOwnerAddress(
        entityId: String,
        params: EntityUpdateBeneficialOwnerAddressParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Entity =
        updateBeneficialOwnerAddress(params.toBuilder().entityId(entityId).build(), requestOptions)

    /** @see updateBeneficialOwnerAddress */
    fun updateBeneficialOwnerAddress(params: EntityUpdateBeneficialOwnerAddressParams): Entity =
        updateBeneficialOwnerAddress(params, RequestOptions.none())

    /** @see updateBeneficialOwnerAddress */
    fun updateBeneficialOwnerAddress(
        params: EntityUpdateBeneficialOwnerAddressParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Entity

    /** Update the industry code for a corporate Entity */
    fun updateIndustryCode(entityId: String, params: EntityUpdateIndustryCodeParams): Entity =
        updateIndustryCode(entityId, params, RequestOptions.none())

    /** @see updateIndustryCode */
    fun updateIndustryCode(
        entityId: String,
        params: EntityUpdateIndustryCodeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Entity = updateIndustryCode(params.toBuilder().entityId(entityId).build(), requestOptions)

    /** @see updateIndustryCode */
    fun updateIndustryCode(params: EntityUpdateIndustryCodeParams): Entity =
        updateIndustryCode(params, RequestOptions.none())

    /** @see updateIndustryCode */
    fun updateIndustryCode(
        params: EntityUpdateIndustryCodeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Entity

    /** A view of [EntityService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): EntityService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /entities`, but is otherwise the same as
         * [EntityService.create].
         */
        @MustBeClosed
        fun create(params: EntityCreateParams): HttpResponseFor<Entity> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: EntityCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Entity>

        /**
         * Returns a raw HTTP response for `get /entities/{entity_id}`, but is otherwise the same as
         * [EntityService.retrieve].
         */
        @MustBeClosed
        fun retrieve(entityId: String): HttpResponseFor<Entity> =
            retrieve(entityId, EntityRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            entityId: String,
            params: EntityRetrieveParams = EntityRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Entity> =
            retrieve(params.toBuilder().entityId(entityId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            entityId: String,
            params: EntityRetrieveParams = EntityRetrieveParams.none(),
        ): HttpResponseFor<Entity> = retrieve(entityId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: EntityRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Entity>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: EntityRetrieveParams): HttpResponseFor<Entity> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(entityId: String, requestOptions: RequestOptions): HttpResponseFor<Entity> =
            retrieve(entityId, EntityRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /entities`, but is otherwise the same as
         * [EntityService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<EntityListPage> = list(EntityListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: EntityListParams = EntityListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EntityListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: EntityListParams = EntityListParams.none()
        ): HttpResponseFor<EntityListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<EntityListPage> =
            list(EntityListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /entities/{entity_id}/archive`, but is otherwise
         * the same as [EntityService.archive].
         */
        @MustBeClosed
        fun archive(entityId: String): HttpResponseFor<Entity> =
            archive(entityId, EntityArchiveParams.none())

        /** @see archive */
        @MustBeClosed
        fun archive(
            entityId: String,
            params: EntityArchiveParams = EntityArchiveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Entity> =
            archive(params.toBuilder().entityId(entityId).build(), requestOptions)

        /** @see archive */
        @MustBeClosed
        fun archive(
            entityId: String,
            params: EntityArchiveParams = EntityArchiveParams.none(),
        ): HttpResponseFor<Entity> = archive(entityId, params, RequestOptions.none())

        /** @see archive */
        @MustBeClosed
        fun archive(
            params: EntityArchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Entity>

        /** @see archive */
        @MustBeClosed
        fun archive(params: EntityArchiveParams): HttpResponseFor<Entity> =
            archive(params, RequestOptions.none())

        /** @see archive */
        @MustBeClosed
        fun archive(entityId: String, requestOptions: RequestOptions): HttpResponseFor<Entity> =
            archive(entityId, EntityArchiveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /entities/{entity_id}/archive_beneficial_owner`,
         * but is otherwise the same as [EntityService.archiveBeneficialOwner].
         */
        @MustBeClosed
        fun archiveBeneficialOwner(
            entityId: String,
            params: EntityArchiveBeneficialOwnerParams,
        ): HttpResponseFor<Entity> = archiveBeneficialOwner(entityId, params, RequestOptions.none())

        /** @see archiveBeneficialOwner */
        @MustBeClosed
        fun archiveBeneficialOwner(
            entityId: String,
            params: EntityArchiveBeneficialOwnerParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Entity> =
            archiveBeneficialOwner(params.toBuilder().entityId(entityId).build(), requestOptions)

        /** @see archiveBeneficialOwner */
        @MustBeClosed
        fun archiveBeneficialOwner(
            params: EntityArchiveBeneficialOwnerParams
        ): HttpResponseFor<Entity> = archiveBeneficialOwner(params, RequestOptions.none())

        /** @see archiveBeneficialOwner */
        @MustBeClosed
        fun archiveBeneficialOwner(
            params: EntityArchiveBeneficialOwnerParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Entity>

        /**
         * Returns a raw HTTP response for `post /entities/{entity_id}/confirm`, but is otherwise
         * the same as [EntityService.confirm].
         */
        @MustBeClosed
        fun confirm(entityId: String): HttpResponseFor<Entity> =
            confirm(entityId, EntityConfirmParams.none())

        /** @see confirm */
        @MustBeClosed
        fun confirm(
            entityId: String,
            params: EntityConfirmParams = EntityConfirmParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Entity> =
            confirm(params.toBuilder().entityId(entityId).build(), requestOptions)

        /** @see confirm */
        @MustBeClosed
        fun confirm(
            entityId: String,
            params: EntityConfirmParams = EntityConfirmParams.none(),
        ): HttpResponseFor<Entity> = confirm(entityId, params, RequestOptions.none())

        /** @see confirm */
        @MustBeClosed
        fun confirm(
            params: EntityConfirmParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Entity>

        /** @see confirm */
        @MustBeClosed
        fun confirm(params: EntityConfirmParams): HttpResponseFor<Entity> =
            confirm(params, RequestOptions.none())

        /** @see confirm */
        @MustBeClosed
        fun confirm(entityId: String, requestOptions: RequestOptions): HttpResponseFor<Entity> =
            confirm(entityId, EntityConfirmParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /entities/{entity_id}/create_beneficial_owner`, but
         * is otherwise the same as [EntityService.createBeneficialOwner].
         */
        @MustBeClosed
        fun createBeneficialOwner(
            entityId: String,
            params: EntityCreateBeneficialOwnerParams,
        ): HttpResponseFor<Entity> = createBeneficialOwner(entityId, params, RequestOptions.none())

        /** @see createBeneficialOwner */
        @MustBeClosed
        fun createBeneficialOwner(
            entityId: String,
            params: EntityCreateBeneficialOwnerParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Entity> =
            createBeneficialOwner(params.toBuilder().entityId(entityId).build(), requestOptions)

        /** @see createBeneficialOwner */
        @MustBeClosed
        fun createBeneficialOwner(
            params: EntityCreateBeneficialOwnerParams
        ): HttpResponseFor<Entity> = createBeneficialOwner(params, RequestOptions.none())

        /** @see createBeneficialOwner */
        @MustBeClosed
        fun createBeneficialOwner(
            params: EntityCreateBeneficialOwnerParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Entity>

        /**
         * Returns a raw HTTP response for `post /entities/{entity_id}/update_address`, but is
         * otherwise the same as [EntityService.updateAddress].
         */
        @MustBeClosed
        fun updateAddress(
            entityId: String,
            params: EntityUpdateAddressParams,
        ): HttpResponseFor<Entity> = updateAddress(entityId, params, RequestOptions.none())

        /** @see updateAddress */
        @MustBeClosed
        fun updateAddress(
            entityId: String,
            params: EntityUpdateAddressParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Entity> =
            updateAddress(params.toBuilder().entityId(entityId).build(), requestOptions)

        /** @see updateAddress */
        @MustBeClosed
        fun updateAddress(params: EntityUpdateAddressParams): HttpResponseFor<Entity> =
            updateAddress(params, RequestOptions.none())

        /** @see updateAddress */
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
        @MustBeClosed
        fun updateBeneficialOwnerAddress(
            entityId: String,
            params: EntityUpdateBeneficialOwnerAddressParams,
        ): HttpResponseFor<Entity> =
            updateBeneficialOwnerAddress(entityId, params, RequestOptions.none())

        /** @see updateBeneficialOwnerAddress */
        @MustBeClosed
        fun updateBeneficialOwnerAddress(
            entityId: String,
            params: EntityUpdateBeneficialOwnerAddressParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Entity> =
            updateBeneficialOwnerAddress(
                params.toBuilder().entityId(entityId).build(),
                requestOptions,
            )

        /** @see updateBeneficialOwnerAddress */
        @MustBeClosed
        fun updateBeneficialOwnerAddress(
            params: EntityUpdateBeneficialOwnerAddressParams
        ): HttpResponseFor<Entity> = updateBeneficialOwnerAddress(params, RequestOptions.none())

        /** @see updateBeneficialOwnerAddress */
        @MustBeClosed
        fun updateBeneficialOwnerAddress(
            params: EntityUpdateBeneficialOwnerAddressParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Entity>

        /**
         * Returns a raw HTTP response for `post /entities/{entity_id}/update_industry_code`, but is
         * otherwise the same as [EntityService.updateIndustryCode].
         */
        @MustBeClosed
        fun updateIndustryCode(
            entityId: String,
            params: EntityUpdateIndustryCodeParams,
        ): HttpResponseFor<Entity> = updateIndustryCode(entityId, params, RequestOptions.none())

        /** @see updateIndustryCode */
        @MustBeClosed
        fun updateIndustryCode(
            entityId: String,
            params: EntityUpdateIndustryCodeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Entity> =
            updateIndustryCode(params.toBuilder().entityId(entityId).build(), requestOptions)

        /** @see updateIndustryCode */
        @MustBeClosed
        fun updateIndustryCode(params: EntityUpdateIndustryCodeParams): HttpResponseFor<Entity> =
            updateIndustryCode(params, RequestOptions.none())

        /** @see updateIndustryCode */
        @MustBeClosed
        fun updateIndustryCode(
            params: EntityUpdateIndustryCodeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Entity>
    }
}
