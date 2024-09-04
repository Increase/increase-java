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
import com.increase.api.models.WireTransfer
import com.increase.api.models.WireTransferApproveParams
import com.increase.api.models.WireTransferCancelParams
import com.increase.api.models.WireTransferCreateParams
import com.increase.api.models.WireTransferListPage
import com.increase.api.models.WireTransferListParams
import com.increase.api.models.WireTransferRetrieveParams
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

interface WireTransferService {

    /** Create a Wire Transfer */
    @JvmOverloads
    fun create(params: WireTransferCreateParams, requestOptions: RequestOptions = RequestOptions.none()): WireTransfer

    /** Retrieve a Wire Transfer */
    @JvmOverloads
    fun retrieve(params: WireTransferRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): WireTransfer

    /** List Wire Transfers */
    @JvmOverloads
    fun list(params: WireTransferListParams, requestOptions: RequestOptions = RequestOptions.none()): WireTransferListPage

    /** Approve a Wire Transfer */
    @JvmOverloads
    fun approve(params: WireTransferApproveParams, requestOptions: RequestOptions = RequestOptions.none()): WireTransfer

    /** Cancel a pending Wire Transfer */
    @JvmOverloads
    fun cancel(params: WireTransferCancelParams, requestOptions: RequestOptions = RequestOptions.none()): WireTransfer
}
