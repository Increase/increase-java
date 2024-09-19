// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

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
import com.increase.api.models.SimulationWireTransferReverseParams
import com.increase.api.models.SimulationWireTransferSubmitParams
import com.increase.api.models.WireTransfer
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

class WireTransferServiceImpl constructor(private val clientOptions: ClientOptions, ) : WireTransferService {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val reverseHandler: Handler<WireTransfer> =
    jsonHandler<WireTransfer>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /**
     * Simulates the reversal of a [Wire Transfer](#wire-transfers) by the Federal
     * Reserve due to error conditions. This will also create a
     * [Transaction](#transaction) to account for the returned funds. This Wire
     * Transfer must first have a `status` of `complete`.
     */
    override fun reverse(params: SimulationWireTransferReverseParams, requestOptions: RequestOptions): WireTransfer {
      val request = HttpRequest.builder()
        .method(HttpMethod.POST)
        .addPathSegments("simulations", "wire_transfers", params.getPathParam(0), "reverse")
        .putAllQueryParams(clientOptions.queryParams)
        .putAllQueryParams(params.getQueryParams())
        .putAllHeaders(clientOptions.headers)
        .putAllHeaders(params.getHeaders())
        .apply {
            params.getBody().ifPresent {
                body(json(clientOptions.jsonMapper, it))
            }
        }
        .build()
      return clientOptions.httpClient.execute(request, requestOptions)
      .let { response -> 
          response.use {
              reverseHandler.handle(it)
          }
          .apply  {
              if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                validate()
              }
          }
      }
    }

    private val submitHandler: Handler<WireTransfer> =
    jsonHandler<WireTransfer>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /**
     * Simulates the submission of a [Wire Transfer](#wire-transfers) to the Federal
     * Reserve. This transfer must first have a `status` of `pending_approval` or
     * `pending_creating`.
     */
    override fun submit(params: SimulationWireTransferSubmitParams, requestOptions: RequestOptions): WireTransfer {
      val request = HttpRequest.builder()
        .method(HttpMethod.POST)
        .addPathSegments("simulations", "wire_transfers", params.getPathParam(0), "submit")
        .putAllQueryParams(clientOptions.queryParams)
        .putAllQueryParams(params.getQueryParams())
        .putAllHeaders(clientOptions.headers)
        .putAllHeaders(params.getHeaders())
        .apply {
            params.getBody().ifPresent {
                body(json(clientOptions.jsonMapper, it))
            }
        }
        .build()
      return clientOptions.httpClient.execute(request, requestOptions)
      .let { response -> 
          response.use {
              submitHandler.handle(it)
          }
          .apply  {
              if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                validate()
              }
          }
      }
    }
}
