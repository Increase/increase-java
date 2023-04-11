@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async

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
import com.increase.api.models.CheckTransferApproveParams
import com.increase.api.models.CheckTransferCancelParams
import com.increase.api.models.CheckTransferCreateParams
import com.increase.api.models.CheckTransferListPageAsync
import com.increase.api.models.CheckTransferListParams
import com.increase.api.models.CheckTransferRetrieveParams
import com.increase.api.models.CheckTransferStopPaymentParams
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

    /** Create a Check Transfer */
    @JvmOverloads
    fun create(params: CheckTransferCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<CheckTransfer>

    /** Retrieve a Check Transfer */
    @JvmOverloads
    fun retrieve(params: CheckTransferRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<CheckTransfer>

    /** List Check Transfers */
    @JvmOverloads
    fun list(params: CheckTransferListParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<CheckTransferListPageAsync>

    /** Approve a Check Transfer */
    @JvmOverloads
    fun approve(params: CheckTransferApproveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<CheckTransfer>

    /** Cancel a pending Check Transfer */
    @JvmOverloads
    fun cancel(params: CheckTransferCancelParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<CheckTransfer>

    /** Request a stop payment on a Check Transfer */
    @JvmOverloads
    fun stopPayment(params: CheckTransferStopPaymentParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<CheckTransfer>
}
