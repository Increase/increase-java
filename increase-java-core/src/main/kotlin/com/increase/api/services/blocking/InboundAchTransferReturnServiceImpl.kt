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

class InboundAchTransferReturnServiceImpl constructor(private val clientOptions: ClientOptions,) : InboundAchTransferReturnService {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<InboundAchTransferReturn> =
    jsonHandler<InboundAchTransferReturn>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /** Create an ACH Return */
    override fun create(
        params: InboundAchTransferReturnCreateParams,
        requestOptions: RequestOptions
    ): InboundAchTransferReturn {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("inbound_ach_transfer_returns")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .let { createHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val retrieveHandler: Handler<InboundAchTransferReturn> =
    jsonHandler<InboundAchTransferReturn>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /** Retrieve an Inbound ACH Transfer Return */
    override fun retrieve(
        params: InboundAchTransferReturnRetrieveParams,
        requestOptions: RequestOptions
    ): InboundAchTransferReturn {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("inbound_ach_transfer_returns", params.getPathParam(0))
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .let { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listHandler: Handler<InboundAchTransferReturnListPage.Response> =
    jsonHandler<InboundAchTransferReturnListPage.Response>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /** List Inbound ACH Transfer Returns */
    override fun list(
        params: InboundAchTransferReturnListParams,
        requestOptions: RequestOptions
    ): InboundAchTransferReturnListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("inbound_ach_transfer_returns")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .let { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { InboundAchTransferReturnListPage.of(this, params, it) }
        }
    }
}
