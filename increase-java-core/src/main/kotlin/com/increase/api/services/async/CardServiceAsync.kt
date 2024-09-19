// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async

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
import com.increase.api.models.Card
import com.increase.api.models.CardCreateParams
import com.increase.api.models.CardDetails
import com.increase.api.models.CardDetailsParams
import com.increase.api.models.CardListPageAsync
import com.increase.api.models.CardListParams
import com.increase.api.models.CardRetrieveParams
import com.increase.api.models.CardUpdateParams
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

interface CardServiceAsync {

    /** Create a Card */
    @JvmOverloads
    fun create(params: CardCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Card>

    /** Retrieve a Card */
    @JvmOverloads
    fun retrieve(params: CardRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Card>

    /** Update a Card */
    @JvmOverloads
    fun update(params: CardUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Card>

    /** List Cards */
    @JvmOverloads
    fun list(params: CardListParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<CardListPageAsync>

    /** Retrieve sensitive details for a Card */
    @JvmOverloads
    fun details(params: CardDetailsParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<CardDetails>
}
