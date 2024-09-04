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
import com.increase.api.models.Account
import com.increase.api.models.AccountBalanceParams
import com.increase.api.models.AccountCloseParams
import com.increase.api.models.AccountCreateParams
import com.increase.api.models.AccountListPage
import com.increase.api.models.AccountListParams
import com.increase.api.models.AccountRetrieveParams
import com.increase.api.models.AccountUpdateParams
import com.increase.api.models.BalanceLookup
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

interface AccountService {

    /** Create an Account */
    @JvmOverloads
    fun create(params: AccountCreateParams, requestOptions: RequestOptions = RequestOptions.none()): Account

    /** Retrieve an Account */
    @JvmOverloads
    fun retrieve(params: AccountRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): Account

    /** Update an Account */
    @JvmOverloads
    fun update(params: AccountUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): Account

    /** List Accounts */
    @JvmOverloads
    fun list(params: AccountListParams, requestOptions: RequestOptions = RequestOptions.none()): AccountListPage

    /** Retrieve an Account Balance */
    @JvmOverloads
    fun balance(params: AccountBalanceParams, requestOptions: RequestOptions = RequestOptions.none()): BalanceLookup

    /** Close an Account */
    @JvmOverloads
    fun close(params: AccountCloseParams, requestOptions: RequestOptions = RequestOptions.none()): Account
}
