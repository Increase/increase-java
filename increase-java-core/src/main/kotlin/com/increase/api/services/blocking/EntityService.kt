// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking

import com.increase.api.core.RequestOptions
import com.increase.api.models.Entity
import com.increase.api.models.EntityArchiveParams
import com.increase.api.models.EntityConfirmParams
import com.increase.api.models.EntityCreateParams
import com.increase.api.models.EntityListPage
import com.increase.api.models.EntityListParams
import com.increase.api.models.EntityRetrieveParams
import com.increase.api.models.EntityUpdateAddressParams
import com.increase.api.services.blocking.entities.BeneficialOwnerService
import com.increase.api.services.blocking.entities.IndustryCodeService
import com.increase.api.services.blocking.entities.SupplementalDocumentService

interface EntityService {

    fun beneficialOwners(): BeneficialOwnerService

    fun supplementalDocuments(): SupplementalDocumentService

    fun industryCode(): IndustryCodeService

    /** Create an Entity */
    @JvmOverloads
    fun create(
        params: EntityCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Entity

    /** Retrieve an Entity */
    @JvmOverloads
    fun retrieve(
        params: EntityRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Entity

    /** List Entities */
    @JvmOverloads
    fun list(
        params: EntityListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): EntityListPage

    /** Archive an Entity */
    @JvmOverloads
    fun archive(
        params: EntityArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Entity

    /**
     * Depending on your program, you may be required to re-confirm an Entity's details on a
     * recurring basis. After making any required updates, call this endpoint to record that your
     * user confirmed their details.
     */
    @JvmOverloads
    fun confirm(
        params: EntityConfirmParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Entity

    /** Update a Natural Person or Corporation's address */
    @JvmOverloads
    fun updateAddress(
        params: EntityUpdateAddressParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Entity
}
