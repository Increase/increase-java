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
import com.increase.api.models.AccountNumber
import com.increase.api.models.AccountNumberCreateParams
import com.increase.api.models.AccountNumberListPageAsync
import com.increase.api.models.AccountNumberListParams
import com.increase.api.models.AccountNumberRetrieveParams
import com.increase.api.models.AccountNumberUpdateParams
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

interface AccountNumberServiceAsync {

    /** Create an Account Number */
    @JvmOverloads
    fun create(params: AccountNumberCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<AccountNumber>

    /** Retrieve an Account Number */
    @JvmOverloads
    fun retrieve(params: AccountNumberRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<AccountNumber>

    /** Update an Account Number */
    @JvmOverloads
    fun update(params: AccountNumberUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<AccountNumber>

    /** List Account Numbers */
    @JvmOverloads
    fun list(params: AccountNumberListParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<AccountNumberListPageAsync>
}
