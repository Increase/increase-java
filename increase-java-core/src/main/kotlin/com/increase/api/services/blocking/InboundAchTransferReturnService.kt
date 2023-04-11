@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking

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
import com.increase.api.models.InboundAchTransferReturn
import com.increase.api.models.InboundAchTransferReturnCreateParams
import com.increase.api.models.InboundAchTransferReturnListPage
import com.increase.api.models.InboundAchTransferReturnListParams
import com.increase.api.models.InboundAchTransferReturnRetrieveParams
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

interface InboundAchTransferReturnService {

    /** Create an ACH Return */
    @JvmOverloads
    fun create(params: InboundAchTransferReturnCreateParams, requestOptions: RequestOptions = RequestOptions.none()): InboundAchTransferReturn

    /** Retrieve an Inbound ACH Transfer Return */
    @JvmOverloads
    fun retrieve(params: InboundAchTransferReturnRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): InboundAchTransferReturn

    /** List Inbound ACH Transfer Returns */
    @JvmOverloads
    fun list(params: InboundAchTransferReturnListParams, requestOptions: RequestOptions = RequestOptions.none()): InboundAchTransferReturnListPage
}
