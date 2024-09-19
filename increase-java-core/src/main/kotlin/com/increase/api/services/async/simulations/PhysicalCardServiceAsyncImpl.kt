// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

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
import com.increase.api.models.PhysicalCard
import com.increase.api.models.SimulationPhysicalCardAdvanceShipmentParams
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

class PhysicalCardServiceAsyncImpl constructor(private val clientOptions: ClientOptions, ) : PhysicalCardServiceAsync {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val advanceShipmentHandler: Handler<PhysicalCard> =
    jsonHandler<PhysicalCard>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /**
     * This endpoint allows you to simulate advancing the shipment status of a Physical
     * Card, to simulate e.g., that a physical card was attempted shipped but then
     * failed delivery.
     */
    override fun advanceShipment(params: SimulationPhysicalCardAdvanceShipmentParams, requestOptions: RequestOptions): CompletableFuture<PhysicalCard> {
      val request = HttpRequest.builder()
        .method(HttpMethod.POST)
        .addPathSegments("simulations", "physical_cards", params.getPathParam(0), "advance_shipment")
        .putAllQueryParams(clientOptions.queryParams)
        .putAllQueryParams(params.getQueryParams())
        .putAllHeaders(clientOptions.headers)
        .putAllHeaders(params.getHeaders())
        .body(json(clientOptions.jsonMapper, params.getBody()))
        .build()
      return clientOptions.httpClient.executeAsync(request, requestOptions)
      .thenApply { response -> 
          response.use {
              advanceShipmentHandler.handle(it)
          }
          .apply  {
              if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                validate()
              }
          }
      }
    }
}
