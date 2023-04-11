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
import com.increase.api.models.CheckTransfer
import com.increase.api.models.SimulationsCheckTransferDepositParams
import com.increase.api.models.SimulationsCheckTransferMailParams
import com.increase.api.models.SimulationsCheckTransferReturnParams
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

class CheckTransferServiceImpl constructor(private val clientOptions: ClientOptions,) : CheckTransferService {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val depositHandler: Handler<CheckTransfer> =
    jsonHandler<CheckTransfer>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /**
     * Simulates a [Check Transfer](#check-transfers) being deposited at a bank. This
     * transfer must first have a `status` of `mailed`.
     */
    override fun deposit(
        params: SimulationsCheckTransferDepositParams,
        requestOptions: RequestOptions
    ): CheckTransfer {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments(
                    "simulations",
                    "check_transfers",
                    params.getPathParam(0),
                    "deposit"
                )
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .apply { params.getBody().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .let { depositHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
        .build()
      return clientOptions.httpClient.execute(request, requestOptions)
      .let { response -> 
          response.let {
              depositHandler.handle(it)
          }
          .apply  {
              if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                validate()
              }
          }
      }
    }

    private val mailHandler: Handler<CheckTransfer> =
    jsonHandler<CheckTransfer>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /**
     * Simulates the mailing of a [Check Transfer](#check-transfers), which happens
     * once per weekday in production but can be sped up in sandbox. This transfer must
     * first have a `status` of `pending_approval` or `pending_submission`.
     */
    override fun mail(
        params: SimulationsCheckTransferMailParams,
        requestOptions: RequestOptions
    ): CheckTransfer {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("simulations", "check_transfers", params.getPathParam(0), "mail")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .apply { params.getBody().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .let { mailHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
        .build()
      return clientOptions.httpClient.execute(request, requestOptions)
      .let { response -> 
          response.let {
              mailHandler.handle(it)
          }
          .apply  {
              if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                validate()
              }
          }
      }
    }

    private val returnHandler: Handler<CheckTransfer> =
    jsonHandler<CheckTransfer>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /**
     * Simulates a [Check Transfer](#check-transfers) being returned via USPS to
     * Increase. This transfer must first have a `status` of `mailed`.
     */
    override fun return_(
        params: SimulationsCheckTransferReturnParams,
        requestOptions: RequestOptions
    ): CheckTransfer {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("simulations", "check_transfers", params.getPathParam(0), "return")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .let { returnHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
