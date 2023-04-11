@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async.simulations

import com.fasterxml.jackson.databind.json.JsonMapper
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import kotlin.LazyThreadSafetyMode.PUBLICATION
import java.time.LocalDate
import java.time.Duration
import java.time.OffsetDateTime
import java.util.Base64
import java.util.Optional
import java.util.UUID
import java.util.concurrent.CompletableFuture
import java.util.stream.Stream
import com.increase.api.core.NoAutoDetect
import com.increase.api.errors.IncreaseInvalidDataException
import com.increase.api.models.CheckTransfer
import com.increase.api.models.SimulationsCheckTransferDepositParams
import com.increase.api.models.SimulationsCheckTransferMailParams
import com.increase.api.models.SimulationsCheckTransferReturnParams
import com.increase.api.core.ClientOptions
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.core.JsonField
import com.increase.api.core.RequestOptions
import com.increase.api.errors.IncreaseError
import com.increase.api.services.emptyHandler
import com.increase.api.services.errorHandler
import com.increase.api.services.json
import com.increase.api.services.jsonHandler
import com.increase.api.services.stringHandler
import com.increase.api.services.withErrorHandler

interface CheckTransferServiceAsync {

    /**
     * Simulates a [Check Transfer](#check-transfers) being deposited at a bank. This
     * transfer must first have a `status` of `mailed`.
     */
    @JvmOverloads
    fun deposit(params: SimulationsCheckTransferDepositParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<CheckTransfer>

    /**
     * Simulates the mailing of a [Check Transfer](#check-transfers), which happens
     * once per weekday in production but can be sped up in sandbox. This transfer must
     * first have a `status` of `pending_approval` or `pending_submission`.
     */
    @JvmOverloads
    fun mail(params: SimulationsCheckTransferMailParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<CheckTransfer>

    /**
     * Simulates a [Check Transfer](#check-transfers) being returned via USPS to
     * Increase. This transfer must first have a `status` of `mailed`.
     */
    @JvmOverloads
    fun return_(params: SimulationsCheckTransferReturnParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<CheckTransfer>
}
