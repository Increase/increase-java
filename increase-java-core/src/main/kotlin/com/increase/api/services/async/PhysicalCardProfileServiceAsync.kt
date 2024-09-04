// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async

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
import com.increase.api.models.PhysicalCardProfile
import com.increase.api.models.PhysicalCardProfileArchiveParams
import com.increase.api.models.PhysicalCardProfileCloneParams
import com.increase.api.models.PhysicalCardProfileCreateParams
import com.increase.api.models.PhysicalCardProfileListPageAsync
import com.increase.api.models.PhysicalCardProfileListParams
import com.increase.api.models.PhysicalCardProfileRetrieveParams
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

interface PhysicalCardProfileServiceAsync {

    /** Create a Physical Card Profile */
    @JvmOverloads
    fun create(params: PhysicalCardProfileCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<PhysicalCardProfile>

    /** Retrieve a Card Profile */
    @JvmOverloads
    fun retrieve(params: PhysicalCardProfileRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<PhysicalCardProfile>

    /** List Physical Card Profiles */
    @JvmOverloads
    fun list(params: PhysicalCardProfileListParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<PhysicalCardProfileListPageAsync>

    /** Archive a Physical Card Profile */
    @JvmOverloads
    fun archive(params: PhysicalCardProfileArchiveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<PhysicalCardProfile>

    /** Clone a Physical Card Profile */
    @JvmOverloads
    fun clone(params: PhysicalCardProfileCloneParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<PhysicalCardProfile>
}
