package com.increase.api.services.blocking.simulations

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
import com.increase.api.models.InboundRealTimePaymentsTransferSimulationResult
import com.increase.api.models.SimulationsRealTimePaymentsTransferCreateInboundParams
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

class RealTimePaymentsTransferServiceImpl constructor(private val clientOptions: ClientOptions,) : RealTimePaymentsTransferService {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val createInboundHandler: Handler<InboundRealTimePaymentsTransferSimulationResult> =
    jsonHandler<InboundRealTimePaymentsTransferSimulationResult>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /**
     * Simulates an inbound Real Time Payments transfer to your account. Real Time
     * Payments are a beta feature.
     */
    override fun createInbound(
        params: SimulationsRealTimePaymentsTransferCreateInboundParams,
        requestOptions: RequestOptions
    ): InboundRealTimePaymentsTransferSimulationResult {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("simulations", "inbound_real_time_payments_transfers")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .let { createInboundHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
