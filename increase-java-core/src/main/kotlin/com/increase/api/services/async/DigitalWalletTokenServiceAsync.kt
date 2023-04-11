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
import com.increase.api.models.DigitalWalletToken
import com.increase.api.models.DigitalWalletTokenListPageAsync
import com.increase.api.models.DigitalWalletTokenListParams
import com.increase.api.models.DigitalWalletTokenRetrieveParams
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

interface DigitalWalletTokenServiceAsync {

    /** Retrieve a Digital Wallet Token */
    @JvmOverloads
    fun retrieve(params: DigitalWalletTokenRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<DigitalWalletToken>

    /** List Digital Wallet Tokens */
    @JvmOverloads
    fun list(params: DigitalWalletTokenListParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<DigitalWalletTokenListPageAsync>
}
