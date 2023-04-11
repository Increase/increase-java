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
import com.increase.api.models.Limit
import com.increase.api.models.LimitCreateParams
import com.increase.api.models.LimitListPageAsync
import com.increase.api.models.LimitListParams
import com.increase.api.models.LimitRetrieveParams
import com.increase.api.models.LimitUpdateParams
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

interface LimitServiceAsync {

    /** Create a Limit */
    @JvmOverloads
    fun create(params: LimitCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Limit>

    /** Retrieve a Limit */
    @JvmOverloads
    fun retrieve(params: LimitRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Limit>

    /** Update a Limit */
    @JvmOverloads
    fun update(params: LimitUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Limit>

    /** List Limits */
    @JvmOverloads
    fun list(params: LimitListParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<LimitListPageAsync>
}
