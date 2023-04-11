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
import com.increase.api.models.AchTransfer
import com.increase.api.models.AchTransferSimulation
import com.increase.api.models.SimulationsAchTransferCreateInboundParams
import com.increase.api.models.SimulationsAchTransferReturnParams
import com.increase.api.models.SimulationsAchTransferSubmitParams
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

interface AchTransferServiceAsync {

    /**
     * Simulates an inbound ACH transfer to your account. This imitates initiating a
     * transaction to an Increase account from a different financial institution. The
     * transfer may be either a credit or a debit depending on if the `amount` is
     * positive or negative. The result of calling this API will be either a
     * [Transaction](#transactions) or a [Declined Transaction](#declined-transactions)
     * depending on whether or not the transfer is allowed.
     */
    @JvmOverloads
    fun createInbound(params: SimulationsAchTransferCreateInboundParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<AchTransferSimulation>

    /**
     * Simulates the return of an [ACH Transfer](#ach-transfers) by the Federal Reserve
     * due to an error condition. This will also create a Transaction to account for
     * the returned funds. This transfer must first have a `status` of `submitted`.
     */
    @JvmOverloads
    fun return_(params: SimulationsAchTransferReturnParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<AchTransfer>

    /**
     * Simulates the submission of an [ACH Transfer](#ach-transfers) to the Federal
     * Reserve. This transfer must first have a `status` of `pending_approval` or
     * `pending_submission`. In production, Increase submits ACH Transfers to the
     * Federal Reserve three times per day on weekdays. Since sandbox ACH Transfers are
     * not submitted to the Federal Reserve, this endpoint allows you to skip that
     * delay and transition the ACH Transfer to a status of `submitted`.
     */
    @JvmOverloads
    fun submit(params: SimulationsAchTransferSubmitParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<AchTransfer>
}
