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
import com.increase.api.models.PhysicalCard
import com.increase.api.models.PhysicalCardCreateParams
import com.increase.api.models.PhysicalCardListPage
import com.increase.api.models.PhysicalCardListParams
import com.increase.api.models.PhysicalCardRetrieveParams
import com.increase.api.models.PhysicalCardUpdateParams
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

interface PhysicalCardService {

    /** Create a Physical Card */
    @JvmOverloads
    fun create(params: PhysicalCardCreateParams, requestOptions: RequestOptions = RequestOptions.none()): PhysicalCard

    /** Retrieve a Physical Card */
    @JvmOverloads
    fun retrieve(params: PhysicalCardRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): PhysicalCard

    /** Update a Physical Card */
    @JvmOverloads
    fun update(params: PhysicalCardUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): PhysicalCard

    /** List Physical Cards */
    @JvmOverloads
    fun list(params: PhysicalCardListParams, requestOptions: RequestOptions = RequestOptions.none()): PhysicalCardListPage
}
