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
import com.increase.api.models.CardProfile
import com.increase.api.models.CardProfileCreateParams
import com.increase.api.models.CardProfileListPageAsync
import com.increase.api.models.CardProfileListParams
import com.increase.api.models.CardProfileRetrieveParams
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

interface CardProfileServiceAsync {

    /** Create a Card Profile */
    @JvmOverloads
    fun create(params: CardProfileCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<CardProfile>

    /** Retrieve a Card Profile */
    @JvmOverloads
    fun retrieve(params: CardProfileRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<CardProfile>

    /** List Card Profiles */
    @JvmOverloads
    fun list(params: CardProfileListParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<CardProfileListPageAsync>
}
