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
import com.increase.api.models.InboundAchTransfer
import com.increase.api.models.InboundAchTransferCreateNotificationOfChangeParams
import com.increase.api.models.InboundAchTransferDeclineParams
import com.increase.api.models.InboundAchTransferListPage
import com.increase.api.models.InboundAchTransferListParams
import com.increase.api.models.InboundAchTransferRetrieveParams
import com.increase.api.models.InboundAchTransferTransferReturnParams
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

interface InboundAchTransferService {

    /** Retrieve an Inbound ACH Transfer */
    @JvmOverloads
    fun retrieve(params: InboundAchTransferRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): InboundAchTransfer

    /** List Inbound ACH Transfers */
    @JvmOverloads
    fun list(params: InboundAchTransferListParams, requestOptions: RequestOptions = RequestOptions.none()): InboundAchTransferListPage

    /** Create a notification of change for an Inbound ACH Transfer */
    @JvmOverloads
    fun createNotificationOfChange(params: InboundAchTransferCreateNotificationOfChangeParams, requestOptions: RequestOptions = RequestOptions.none()): InboundAchTransfer

    /** Decline an Inbound ACH Transfer */
    @JvmOverloads
    fun decline(params: InboundAchTransferDeclineParams, requestOptions: RequestOptions = RequestOptions.none()): InboundAchTransfer

    /** Return an Inbound ACH Transfer */
    @JvmOverloads
    fun transferReturn(params: InboundAchTransferTransferReturnParams, requestOptions: RequestOptions = RequestOptions.none()): InboundAchTransfer
}
