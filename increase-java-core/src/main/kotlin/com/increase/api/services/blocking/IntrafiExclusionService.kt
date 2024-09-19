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
import com.increase.api.models.IntrafiExclusion
import com.increase.api.models.IntrafiExclusionArchiveParams
import com.increase.api.models.IntrafiExclusionCreateParams
import com.increase.api.models.IntrafiExclusionListPage
import com.increase.api.models.IntrafiExclusionListParams
import com.increase.api.models.IntrafiExclusionRetrieveParams
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

interface IntrafiExclusionService {

    /** Create an IntraFi Exclusion */
    @JvmOverloads
    fun create(params: IntrafiExclusionCreateParams, requestOptions: RequestOptions = RequestOptions.none()): IntrafiExclusion

    /** Get an IntraFi Exclusion */
    @JvmOverloads
    fun retrieve(params: IntrafiExclusionRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): IntrafiExclusion

    /** List IntraFi Exclusions */
    @JvmOverloads
    fun list(params: IntrafiExclusionListParams, requestOptions: RequestOptions = RequestOptions.none()): IntrafiExclusionListPage

    /** Archive an IntraFi Exclusion */
    @JvmOverloads
    fun archive(params: IntrafiExclusionArchiveParams, requestOptions: RequestOptions = RequestOptions.none()): IntrafiExclusion
}
