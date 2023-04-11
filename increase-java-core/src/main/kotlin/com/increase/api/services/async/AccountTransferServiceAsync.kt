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
import com.increase.api.models.AccountTransfer
import com.increase.api.models.AccountTransferApproveParams
import com.increase.api.models.AccountTransferCancelParams
import com.increase.api.models.AccountTransferCreateParams
import com.increase.api.models.AccountTransferListPageAsync
import com.increase.api.models.AccountTransferListParams
import com.increase.api.models.AccountTransferRetrieveParams
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

interface AccountTransferServiceAsync {

    /** Create an Account Transfer */
    @JvmOverloads
    fun create(params: AccountTransferCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<AccountTransfer>

    /** Retrieve an Account Transfer */
    @JvmOverloads
    fun retrieve(params: AccountTransferRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<AccountTransfer>

    /** List Account Transfers */
    @JvmOverloads
    fun list(params: AccountTransferListParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<AccountTransferListPageAsync>

    /** Approve an Account Transfer */
    @JvmOverloads
    fun approve(params: AccountTransferApproveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<AccountTransfer>

    /** Cancel an Account Transfer */
    @JvmOverloads
    fun cancel(params: AccountTransferCancelParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<AccountTransfer>
}
