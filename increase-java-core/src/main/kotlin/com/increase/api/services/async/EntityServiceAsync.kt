// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.entities.Entity
import com.increase.api.models.entities.EntityArchiveBeneficialOwnerParams
import com.increase.api.models.entities.EntityArchiveParams
import com.increase.api.models.entities.EntityConfirmParams
import com.increase.api.models.entities.EntityCreateBeneficialOwnerParams
import com.increase.api.models.entities.EntityCreateParams
import com.increase.api.models.entities.EntityListPageAsync
import com.increase.api.models.entities.EntityListParams
import com.increase.api.models.entities.EntityRetrieveParams
import com.increase.api.models.entities.EntityUpdateAddressParams
import com.increase.api.models.entities.EntityUpdateBeneficialOwnerAddressParams
import com.increase.api.models.entities.EntityUpdateIndustryCodeParams
import java.util.concurrent.CompletableFuture

interface EntityServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create an Entity */
    fun create(params: EntityCreateParams): CompletableFuture<Entity> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: EntityCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Entity>

    /** Retrieve an Entity */
    fun retrieve(entityId: String): CompletableFuture<Entity> =
        retrieve(entityId, EntityRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        entityId: String,
        params: EntityRetrieveParams = EntityRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Entity> =
        retrieve(params.toBuilder().entityId(entityId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        entityId: String,
        params: EntityRetrieveParams = EntityRetrieveParams.none(),
    ): CompletableFuture<Entity> = retrieve(entityId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: EntityRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Entity>

    /** @see [retrieve] */
    fun retrieve(params: EntityRetrieveParams): CompletableFuture<Entity> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(entityId: String, requestOptions: RequestOptions): CompletableFuture<Entity> =
        retrieve(entityId, EntityRetrieveParams.none(), requestOptions)

    /** List Entities */
    fun list(): CompletableFuture<EntityListPageAsync> = list(EntityListParams.none())

    /** @see [list] */
    fun list(
        params: EntityListParams = EntityListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EntityListPageAsync>

    /** @see [list] */
    fun list(
        params: EntityListParams = EntityListParams.none()
    ): CompletableFuture<EntityListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<EntityListPageAsync> =
        list(EntityListParams.none(), requestOptions)

    /** Archive an Entity */
    fun archive(entityId: String): CompletableFuture<Entity> =
        archive(entityId, EntityArchiveParams.none())

    /** @see [archive] */
    fun archive(
        entityId: String,
        params: EntityArchiveParams = EntityArchiveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Entity> =
        archive(params.toBuilder().entityId(entityId).build(), requestOptions)

    /** @see [archive] */
    fun archive(
        entityId: String,
        params: EntityArchiveParams = EntityArchiveParams.none(),
    ): CompletableFuture<Entity> = archive(entityId, params, RequestOptions.none())

    /** @see [archive] */
    fun archive(
        params: EntityArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Entity>

    /** @see [archive] */
    fun archive(params: EntityArchiveParams): CompletableFuture<Entity> =
        archive(params, RequestOptions.none())

    /** @see [archive] */
    fun archive(entityId: String, requestOptions: RequestOptions): CompletableFuture<Entity> =
        archive(entityId, EntityArchiveParams.none(), requestOptions)

    /** Archive a beneficial owner for a corporate Entity */
    fun archiveBeneficialOwner(
        entityId: String,
        params: EntityArchiveBeneficialOwnerParams,
    ): CompletableFuture<Entity> = archiveBeneficialOwner(entityId, params, RequestOptions.none())

    /** @see [archiveBeneficialOwner] */
    fun archiveBeneficialOwner(
        entityId: String,
        params: EntityArchiveBeneficialOwnerParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Entity> =
        archiveBeneficialOwner(params.toBuilder().entityId(entityId).build(), requestOptions)

    /** @see [archiveBeneficialOwner] */
    fun archiveBeneficialOwner(
        params: EntityArchiveBeneficialOwnerParams
    ): CompletableFuture<Entity> = archiveBeneficialOwner(params, RequestOptions.none())

    /** @see [archiveBeneficialOwner] */
    fun archiveBeneficialOwner(
        params: EntityArchiveBeneficialOwnerParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Entity>

    /**
     * Depending on your program, you may be required to re-confirm an Entity's details on a
     * recurring basis. After making any required updates, call this endpoint to record that your
     * user confirmed their details.
     */
    fun confirm(entityId: String): CompletableFuture<Entity> =
        confirm(entityId, EntityConfirmParams.none())

    /** @see [confirm] */
    fun confirm(
        entityId: String,
        params: EntityConfirmParams = EntityConfirmParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Entity> =
        confirm(params.toBuilder().entityId(entityId).build(), requestOptions)

    /** @see [confirm] */
    fun confirm(
        entityId: String,
        params: EntityConfirmParams = EntityConfirmParams.none(),
    ): CompletableFuture<Entity> = confirm(entityId, params, RequestOptions.none())

    /** @see [confirm] */
    fun confirm(
        params: EntityConfirmParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Entity>

    /** @see [confirm] */
    fun confirm(params: EntityConfirmParams): CompletableFuture<Entity> =
        confirm(params, RequestOptions.none())

    /** @see [confirm] */
    fun confirm(entityId: String, requestOptions: RequestOptions): CompletableFuture<Entity> =
        confirm(entityId, EntityConfirmParams.none(), requestOptions)

    /** Create a beneficial owner for a corporate Entity */
    fun createBeneficialOwner(
        entityId: String,
        params: EntityCreateBeneficialOwnerParams,
    ): CompletableFuture<Entity> = createBeneficialOwner(entityId, params, RequestOptions.none())

    /** @see [createBeneficialOwner] */
    fun createBeneficialOwner(
        entityId: String,
        params: EntityCreateBeneficialOwnerParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Entity> =
        createBeneficialOwner(params.toBuilder().entityId(entityId).build(), requestOptions)

    /** @see [createBeneficialOwner] */
    fun createBeneficialOwner(
        params: EntityCreateBeneficialOwnerParams
    ): CompletableFuture<Entity> = createBeneficialOwner(params, RequestOptions.none())

    /** @see [createBeneficialOwner] */
    fun createBeneficialOwner(
        params: EntityCreateBeneficialOwnerParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Entity>

    /** Update a Natural Person or Corporation's address */
    fun updateAddress(
        entityId: String,
        params: EntityUpdateAddressParams,
    ): CompletableFuture<Entity> = updateAddress(entityId, params, RequestOptions.none())

    /** @see [updateAddress] */
    fun updateAddress(
        entityId: String,
        params: EntityUpdateAddressParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Entity> =
        updateAddress(params.toBuilder().entityId(entityId).build(), requestOptions)

    /** @see [updateAddress] */
    fun updateAddress(params: EntityUpdateAddressParams): CompletableFuture<Entity> =
        updateAddress(params, RequestOptions.none())

    /** @see [updateAddress] */
    fun updateAddress(
        params: EntityUpdateAddressParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Entity>

    /** Update the address for a beneficial owner belonging to a corporate Entity */
    fun updateBeneficialOwnerAddress(
        entityId: String,
        params: EntityUpdateBeneficialOwnerAddressParams,
    ): CompletableFuture<Entity> =
        updateBeneficialOwnerAddress(entityId, params, RequestOptions.none())

    /** @see [updateBeneficialOwnerAddress] */
    fun updateBeneficialOwnerAddress(
        entityId: String,
        params: EntityUpdateBeneficialOwnerAddressParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Entity> =
        updateBeneficialOwnerAddress(params.toBuilder().entityId(entityId).build(), requestOptions)

    /** @see [updateBeneficialOwnerAddress] */
    fun updateBeneficialOwnerAddress(
        params: EntityUpdateBeneficialOwnerAddressParams
    ): CompletableFuture<Entity> = updateBeneficialOwnerAddress(params, RequestOptions.none())

    /** @see [updateBeneficialOwnerAddress] */
    fun updateBeneficialOwnerAddress(
        params: EntityUpdateBeneficialOwnerAddressParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Entity>

    /** Update the industry code for a corporate Entity */
    fun updateIndustryCode(
        entityId: String,
        params: EntityUpdateIndustryCodeParams,
    ): CompletableFuture<Entity> = updateIndustryCode(entityId, params, RequestOptions.none())

    /** @see [updateIndustryCode] */
    fun updateIndustryCode(
        entityId: String,
        params: EntityUpdateIndustryCodeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Entity> =
        updateIndustryCode(params.toBuilder().entityId(entityId).build(), requestOptions)

    /** @see [updateIndustryCode] */
    fun updateIndustryCode(params: EntityUpdateIndustryCodeParams): CompletableFuture<Entity> =
        updateIndustryCode(params, RequestOptions.none())

    /** @see [updateIndustryCode] */
    fun updateIndustryCode(
        params: EntityUpdateIndustryCodeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Entity>

    /**
     * A view of [EntityServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /entities`, but is otherwise the same as
         * [EntityServiceAsync.create].
         */
        @MustBeClosed
        fun create(params: EntityCreateParams): CompletableFuture<HttpResponseFor<Entity>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: EntityCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Entity>>

        /**
         * Returns a raw HTTP response for `get /entities/{entity_id}`, but is otherwise the same as
         * [EntityServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(entityId: String): CompletableFuture<HttpResponseFor<Entity>> =
            retrieve(entityId, EntityRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            entityId: String,
            params: EntityRetrieveParams = EntityRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Entity>> =
            retrieve(params.toBuilder().entityId(entityId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            entityId: String,
            params: EntityRetrieveParams = EntityRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<Entity>> =
            retrieve(entityId, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: EntityRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Entity>>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: EntityRetrieveParams): CompletableFuture<HttpResponseFor<Entity>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            entityId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Entity>> =
            retrieve(entityId, EntityRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /entities`, but is otherwise the same as
         * [EntityServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<EntityListPageAsync>> =
            list(EntityListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: EntityListParams = EntityListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EntityListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: EntityListParams = EntityListParams.none()
        ): CompletableFuture<HttpResponseFor<EntityListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<EntityListPageAsync>> =
            list(EntityListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /entities/{entity_id}/archive`, but is otherwise
         * the same as [EntityServiceAsync.archive].
         */
        @MustBeClosed
        fun archive(entityId: String): CompletableFuture<HttpResponseFor<Entity>> =
            archive(entityId, EntityArchiveParams.none())

        /** @see [archive] */
        @MustBeClosed
        fun archive(
            entityId: String,
            params: EntityArchiveParams = EntityArchiveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Entity>> =
            archive(params.toBuilder().entityId(entityId).build(), requestOptions)

        /** @see [archive] */
        @MustBeClosed
        fun archive(
            entityId: String,
            params: EntityArchiveParams = EntityArchiveParams.none(),
        ): CompletableFuture<HttpResponseFor<Entity>> =
            archive(entityId, params, RequestOptions.none())

        /** @see [archive] */
        @MustBeClosed
        fun archive(
            params: EntityArchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Entity>>

        /** @see [archive] */
        @MustBeClosed
        fun archive(params: EntityArchiveParams): CompletableFuture<HttpResponseFor<Entity>> =
            archive(params, RequestOptions.none())

        /** @see [archive] */
        @MustBeClosed
        fun archive(
            entityId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Entity>> =
            archive(entityId, EntityArchiveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /entities/{entity_id}/archive_beneficial_owner`,
         * but is otherwise the same as [EntityServiceAsync.archiveBeneficialOwner].
         */
        @MustBeClosed
        fun archiveBeneficialOwner(
            entityId: String,
            params: EntityArchiveBeneficialOwnerParams,
        ): CompletableFuture<HttpResponseFor<Entity>> =
            archiveBeneficialOwner(entityId, params, RequestOptions.none())

        /** @see [archiveBeneficialOwner] */
        @MustBeClosed
        fun archiveBeneficialOwner(
            entityId: String,
            params: EntityArchiveBeneficialOwnerParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Entity>> =
            archiveBeneficialOwner(params.toBuilder().entityId(entityId).build(), requestOptions)

        /** @see [archiveBeneficialOwner] */
        @MustBeClosed
        fun archiveBeneficialOwner(
            params: EntityArchiveBeneficialOwnerParams
        ): CompletableFuture<HttpResponseFor<Entity>> =
            archiveBeneficialOwner(params, RequestOptions.none())

        /** @see [archiveBeneficialOwner] */
        @MustBeClosed
        fun archiveBeneficialOwner(
            params: EntityArchiveBeneficialOwnerParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Entity>>

        /**
         * Returns a raw HTTP response for `post /entities/{entity_id}/confirm`, but is otherwise
         * the same as [EntityServiceAsync.confirm].
         */
        @MustBeClosed
        fun confirm(entityId: String): CompletableFuture<HttpResponseFor<Entity>> =
            confirm(entityId, EntityConfirmParams.none())

        /** @see [confirm] */
        @MustBeClosed
        fun confirm(
            entityId: String,
            params: EntityConfirmParams = EntityConfirmParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Entity>> =
            confirm(params.toBuilder().entityId(entityId).build(), requestOptions)

        /** @see [confirm] */
        @MustBeClosed
        fun confirm(
            entityId: String,
            params: EntityConfirmParams = EntityConfirmParams.none(),
        ): CompletableFuture<HttpResponseFor<Entity>> =
            confirm(entityId, params, RequestOptions.none())

        /** @see [confirm] */
        @MustBeClosed
        fun confirm(
            params: EntityConfirmParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Entity>>

        /** @see [confirm] */
        @MustBeClosed
        fun confirm(params: EntityConfirmParams): CompletableFuture<HttpResponseFor<Entity>> =
            confirm(params, RequestOptions.none())

        /** @see [confirm] */
        @MustBeClosed
        fun confirm(
            entityId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Entity>> =
            confirm(entityId, EntityConfirmParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /entities/{entity_id}/create_beneficial_owner`, but
         * is otherwise the same as [EntityServiceAsync.createBeneficialOwner].
         */
        @MustBeClosed
        fun createBeneficialOwner(
            entityId: String,
            params: EntityCreateBeneficialOwnerParams,
        ): CompletableFuture<HttpResponseFor<Entity>> =
            createBeneficialOwner(entityId, params, RequestOptions.none())

        /** @see [createBeneficialOwner] */
        @MustBeClosed
        fun createBeneficialOwner(
            entityId: String,
            params: EntityCreateBeneficialOwnerParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Entity>> =
            createBeneficialOwner(params.toBuilder().entityId(entityId).build(), requestOptions)

        /** @see [createBeneficialOwner] */
        @MustBeClosed
        fun createBeneficialOwner(
            params: EntityCreateBeneficialOwnerParams
        ): CompletableFuture<HttpResponseFor<Entity>> =
            createBeneficialOwner(params, RequestOptions.none())

        /** @see [createBeneficialOwner] */
        @MustBeClosed
        fun createBeneficialOwner(
            params: EntityCreateBeneficialOwnerParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Entity>>

        /**
         * Returns a raw HTTP response for `post /entities/{entity_id}/update_address`, but is
         * otherwise the same as [EntityServiceAsync.updateAddress].
         */
        @MustBeClosed
        fun updateAddress(
            entityId: String,
            params: EntityUpdateAddressParams,
        ): CompletableFuture<HttpResponseFor<Entity>> =
            updateAddress(entityId, params, RequestOptions.none())

        /** @see [updateAddress] */
        @MustBeClosed
        fun updateAddress(
            entityId: String,
            params: EntityUpdateAddressParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Entity>> =
            updateAddress(params.toBuilder().entityId(entityId).build(), requestOptions)

        /** @see [updateAddress] */
        @MustBeClosed
        fun updateAddress(
            params: EntityUpdateAddressParams
        ): CompletableFuture<HttpResponseFor<Entity>> = updateAddress(params, RequestOptions.none())

        /** @see [updateAddress] */
        @MustBeClosed
        fun updateAddress(
            params: EntityUpdateAddressParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Entity>>

        /**
         * Returns a raw HTTP response for `post
         * /entities/{entity_id}/update_beneficial_owner_address`, but is otherwise the same as
         * [EntityServiceAsync.updateBeneficialOwnerAddress].
         */
        @MustBeClosed
        fun updateBeneficialOwnerAddress(
            entityId: String,
            params: EntityUpdateBeneficialOwnerAddressParams,
        ): CompletableFuture<HttpResponseFor<Entity>> =
            updateBeneficialOwnerAddress(entityId, params, RequestOptions.none())

        /** @see [updateBeneficialOwnerAddress] */
        @MustBeClosed
        fun updateBeneficialOwnerAddress(
            entityId: String,
            params: EntityUpdateBeneficialOwnerAddressParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Entity>> =
            updateBeneficialOwnerAddress(
                params.toBuilder().entityId(entityId).build(),
                requestOptions,
            )

        /** @see [updateBeneficialOwnerAddress] */
        @MustBeClosed
        fun updateBeneficialOwnerAddress(
            params: EntityUpdateBeneficialOwnerAddressParams
        ): CompletableFuture<HttpResponseFor<Entity>> =
            updateBeneficialOwnerAddress(params, RequestOptions.none())

        /** @see [updateBeneficialOwnerAddress] */
        @MustBeClosed
        fun updateBeneficialOwnerAddress(
            params: EntityUpdateBeneficialOwnerAddressParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Entity>>

        /**
         * Returns a raw HTTP response for `post /entities/{entity_id}/update_industry_code`, but is
         * otherwise the same as [EntityServiceAsync.updateIndustryCode].
         */
        @MustBeClosed
        fun updateIndustryCode(
            entityId: String,
            params: EntityUpdateIndustryCodeParams,
        ): CompletableFuture<HttpResponseFor<Entity>> =
            updateIndustryCode(entityId, params, RequestOptions.none())

        /** @see [updateIndustryCode] */
        @MustBeClosed
        fun updateIndustryCode(
            entityId: String,
            params: EntityUpdateIndustryCodeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Entity>> =
            updateIndustryCode(params.toBuilder().entityId(entityId).build(), requestOptions)

        /** @see [updateIndustryCode] */
        @MustBeClosed
        fun updateIndustryCode(
            params: EntityUpdateIndustryCodeParams
        ): CompletableFuture<HttpResponseFor<Entity>> =
            updateIndustryCode(params, RequestOptions.none())

        /** @see [updateIndustryCode] */
        @MustBeClosed
        fun updateIndustryCode(
            params: EntityUpdateIndustryCodeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Entity>>
    }
}
