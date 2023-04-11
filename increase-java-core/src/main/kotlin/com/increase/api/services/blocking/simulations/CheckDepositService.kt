@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking.simulations

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
import com.increase.api.models.CheckDeposit
import com.increase.api.models.SimulationsCheckDepositRejectParams
import com.increase.api.models.SimulationsCheckDepositReturnParams
import com.increase.api.models.SimulationsCheckDepositSubmitParams
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

interface CheckDepositService {

    /**
     * Simulates the rejection of a [Check Deposit](#check-deposits) by Increase due to
     * factors like poor image quality. This Check Deposit must first have a `status`
     * of `pending`.
     */
    @JvmOverloads
    fun reject(params: SimulationsCheckDepositRejectParams, requestOptions: RequestOptions = RequestOptions.none()): CheckDeposit

    /**
     * Simulates the return of a [Check Deposit](#check-deposits). This Check Deposit
     * must first have a `status` of `submitted`.
     */
    @JvmOverloads
    fun return_(params: SimulationsCheckDepositReturnParams, requestOptions: RequestOptions = RequestOptions.none()): CheckDeposit

    /**
     * Simulates the submission of a [Check Deposit](#check-deposits) to the Federal
     * Reserve. This Check Deposit must first have a `status` of `pending`.
     */
    @JvmOverloads
    fun submit(params: SimulationsCheckDepositSubmitParams, requestOptions: RequestOptions = RequestOptions.none()): CheckDeposit
}
