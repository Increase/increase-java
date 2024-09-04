// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking

import com.fasterxml.jackson.databind.json.JsonMapper
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import kotlin.LazyThreadSafetyMode.PUBLICATION
import java.time.LocalDate
import java.time.Duration
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Base64
import java.util.Optional
import java.util.UUID
import java.util.concurrent.CompletableFuture
import java.util.stream.Stream
import com.increase.api.core.Enum
import com.increase.api.core.NoAutoDetect
import com.increase.api.errors.IncreaseInvalidDataException
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
import com.increase.api.core.ClientOptions
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.core.http.BinaryResponseContent
import com.increase.api.core.JsonField
import com.increase.api.core.JsonValue
import com.increase.api.core.RequestOptions
import com.increase.api.errors.IncreaseError
import com.increase.api.services.emptyHandler
import com.increase.api.services.errorHandler
import com.increase.api.services.json
import com.increase.api.services.jsonHandler
import com.increase.api.services.multipartFormData
import com.increase.api.services.stringHandler
import com.increase.api.services.binaryHandler
import com.increase.api.services.withErrorHandler

interface EntityService {

    /** Create an Entity */
    @JvmOverloads
    fun create(params: EntityCreateParams, requestOptions: RequestOptions = RequestOptions.none()): Entity

    /** Retrieve an Entity */
    @JvmOverloads
    fun retrieve(params: EntityRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): Entity

    /** List Entities */
    @JvmOverloads
    fun list(params: EntityListParams, requestOptions: RequestOptions = RequestOptions.none()): EntityListPage

    /** Archive an Entity */
    @JvmOverloads
    fun archive(params: EntityArchiveParams, requestOptions: RequestOptions = RequestOptions.none()): Entity

    /** Archive a beneficial owner for a corporate Entity */
    @JvmOverloads
    fun archiveBeneficialOwner(params: EntityArchiveBeneficialOwnerParams, requestOptions: RequestOptions = RequestOptions.none()): Entity

    /**
     * Depending on your program, you may be required to re-confirm an Entity's details
     * on a recurring basis. After making any required updates, call this endpoint to
     * record that your user confirmed their details.
     */
    @JvmOverloads
    fun confirm(params: EntityConfirmParams, requestOptions: RequestOptions = RequestOptions.none()): Entity

    /** Create a beneficial owner for a corporate Entity */
    @JvmOverloads
    fun createBeneficialOwner(params: EntityCreateBeneficialOwnerParams, requestOptions: RequestOptions = RequestOptions.none()): Entity

    /** Update a Natural Person or Corporation's address */
    @JvmOverloads
    fun updateAddress(params: EntityUpdateAddressParams, requestOptions: RequestOptions = RequestOptions.none()): Entity

    /** Update the address for a beneficial owner belonging to a corporate Entity */
    @JvmOverloads
    fun updateBeneficialOwnerAddress(params: EntityUpdateBeneficialOwnerAddressParams, requestOptions: RequestOptions = RequestOptions.none()): Entity

    /** Update the industry code for a corporate Entity */
    @JvmOverloads
    fun updateIndustryCode(params: EntityUpdateIndustryCodeParams, requestOptions: RequestOptions = RequestOptions.none()): Entity
}
