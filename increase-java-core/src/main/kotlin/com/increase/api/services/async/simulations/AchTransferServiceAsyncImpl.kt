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
import com.increase.api.models.AchTransfer
import com.increase.api.models.SimulationAchTransferAcknowledgeParams
import com.increase.api.models.SimulationAchTransferCreateNotificationOfChangeParams
import com.increase.api.models.SimulationAchTransferReturnParams
import com.increase.api.models.SimulationAchTransferSubmitParams
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

class AchTransferServiceAsyncImpl constructor(private val clientOptions: ClientOptions, ) : AchTransferServiceAsync {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val acknowledgeHandler: Handler<AchTransfer> =
    jsonHandler<AchTransfer>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /**
     * Simulates the acknowledgement of an [ACH Transfer](#ach-transfers) by the
     * Federal Reserve. This transfer must first have a `status` of `submitted` . In
     * production, the Federal Reserve generally acknowledges submitted ACH files
     * within 30 minutes. Since sandbox ACH Transfers are not submitted to the Federal
     * Reserve, this endpoint allows you to skip that delay and add the acknowledgment
     * subresource to the ACH Transfer.
     */
    override fun acknowledge(params: SimulationAchTransferAcknowledgeParams, requestOptions: RequestOptions): CompletableFuture<AchTransfer> {
      val request = HttpRequest.builder()
        .method(HttpMethod.POST)
        .addPathSegments("simulations", "ach_transfers", params.getPathParam(0), "acknowledge")
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
      return clientOptions.httpClient.executeAsync(request, requestOptions)
      .thenApply { response -> 
          response.use {
              acknowledgeHandler.handle(it)
          }
          .apply  {
              if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                validate()
              }
          }
      }
    }

    private val createNotificationOfChangeHandler: Handler<AchTransfer> =
    jsonHandler<AchTransfer>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /**
     * Simulates receiving a Notification of Change for an
     * [ACH Transfer](#ach-transfers).
     */
    override fun createNotificationOfChange(params: SimulationAchTransferCreateNotificationOfChangeParams, requestOptions: RequestOptions): CompletableFuture<AchTransfer> {
      val request = HttpRequest.builder()
        .method(HttpMethod.POST)
        .addPathSegments("simulations", "ach_transfers", params.getPathParam(0), "create_notification_of_change")
        .putAllQueryParams(clientOptions.queryParams)
        .putAllQueryParams(params.getQueryParams())
        .putAllHeaders(clientOptions.headers)
        .putAllHeaders(params.getHeaders())
        .body(json(clientOptions.jsonMapper, params.getBody()))
        .build()
      return clientOptions.httpClient.executeAsync(request, requestOptions)
      .thenApply { response -> 
          response.use {
              createNotificationOfChangeHandler.handle(it)
          }
          .apply  {
              if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                validate()
              }
          }
      }
    }

    private val returnHandler: Handler<AchTransfer> =
    jsonHandler<AchTransfer>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /**
     * Simulates the return of an [ACH Transfer](#ach-transfers) by the Federal Reserve
     * due to an error condition. This will also create a Transaction to account for
     * the returned funds. This transfer must first have a `status` of `submitted`.
     */
    override fun return_(params: SimulationAchTransferReturnParams, requestOptions: RequestOptions): CompletableFuture<AchTransfer> {
      val request = HttpRequest.builder()
        .method(HttpMethod.POST)
        .addPathSegments("simulations", "ach_transfers", params.getPathParam(0), "return")
        .putAllQueryParams(clientOptions.queryParams)
        .putAllQueryParams(params.getQueryParams())
        .putAllHeaders(clientOptions.headers)
        .putAllHeaders(params.getHeaders())
        .body(json(clientOptions.jsonMapper, params.getBody()))
        .build()
      return clientOptions.httpClient.executeAsync(request, requestOptions)
      .thenApply { response -> 
          response.use {
              returnHandler.handle(it)
          }
          .apply  {
              if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                validate()
              }
          }
      }
    }

    private val submitHandler: Handler<AchTransfer> =
    jsonHandler<AchTransfer>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /**
     * Simulates the submission of an [ACH Transfer](#ach-transfers) to the Federal
     * Reserve. This transfer must first have a `status` of `pending_approval` or
     * `pending_submission`. In production, Increase submits ACH Transfers to the
     * Federal Reserve three times per day on weekdays. Since sandbox ACH Transfers are
     * not submitted to the Federal Reserve, this endpoint allows you to skip that
     * delay and transition the ACH Transfer to a status of `submitted`.
     */
    override fun submit(params: SimulationAchTransferSubmitParams, requestOptions: RequestOptions): CompletableFuture<AchTransfer> {
      val request = HttpRequest.builder()
        .method(HttpMethod.POST)
        .addPathSegments("simulations", "ach_transfers", params.getPathParam(0), "submit")
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
      return clientOptions.httpClient.executeAsync(request, requestOptions)
      .thenApply { response -> 
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
