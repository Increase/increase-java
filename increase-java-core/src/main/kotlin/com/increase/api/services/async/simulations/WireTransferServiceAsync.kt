// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async.simulations

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
import com.increase.api.models.SimulationWireTransferReverseParams
import com.increase.api.models.SimulationWireTransferSubmitParams
import com.increase.api.models.WireTransfer
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

interface WireTransferServiceAsync {

    /**
     * Simulates the reversal of a [Wire Transfer](#wire-transfers) by the Federal
     * Reserve due to error conditions. This will also create a
     * [Transaction](#transaction) to account for the returned funds. This Wire
     * Transfer must first have a `status` of `complete`.
     */
    @JvmOverloads
    fun reverse(params: SimulationWireTransferReverseParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<WireTransfer>

    /**
     * Simulates the submission of a [Wire Transfer](#wire-transfers) to the Federal
     * Reserve. This transfer must first have a `status` of `pending_approval` or
     * `pending_creating`.
     */
    @JvmOverloads
    fun submit(params: SimulationWireTransferSubmitParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<WireTransfer>
}
