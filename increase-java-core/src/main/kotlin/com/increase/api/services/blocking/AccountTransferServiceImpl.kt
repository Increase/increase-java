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
import com.increase.api.models.AccountTransfer
import com.increase.api.models.AccountTransferApproveParams
import com.increase.api.models.AccountTransferCancelParams
import com.increase.api.models.AccountTransferCreateParams
import com.increase.api.models.AccountTransferListPage
import com.increase.api.models.AccountTransferListParams
import com.increase.api.models.AccountTransferRetrieveParams
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

class AccountTransferServiceImpl constructor(private val clientOptions: ClientOptions,) : AccountTransferService {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<AccountTransfer> =
    jsonHandler<AccountTransfer>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /** Create an Account Transfer */
    override fun create(
        params: AccountTransferCreateParams,
        requestOptions: RequestOptions
    ): AccountTransfer {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("account_transfers")
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

    private val retrieveHandler: Handler<AccountTransfer> =
    jsonHandler<AccountTransfer>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /** Retrieve an Account Transfer */
    override fun retrieve(
        params: AccountTransferRetrieveParams,
        requestOptions: RequestOptions
    ): AccountTransfer {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("account_transfers", params.getPathParam(0))
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

    private val listHandler: Handler<AccountTransferListPage.Response> =
    jsonHandler<AccountTransferListPage.Response>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /** List Account Transfers */
    override fun list(
        params: AccountTransferListParams,
        requestOptions: RequestOptions
    ): AccountTransferListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("account_transfers")
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
                .let { AccountTransferListPage.of(this, params, it) }
        }
    }

    private val approveHandler: Handler<AccountTransfer> =
    jsonHandler<AccountTransfer>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /** Approve an Account Transfer */
    override fun approve(
        params: AccountTransferApproveParams,
        requestOptions: RequestOptions
    ): AccountTransfer {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("account_transfers", params.getPathParam(0), "approve")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .apply { params.getBody().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .let { approveHandler.handle(it) }
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
              approveHandler.handle(it)
          }
          .apply  {
              if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                validate()
              }
          }
      }
    }

    private val cancelHandler: Handler<AccountTransfer> =
    jsonHandler<AccountTransfer>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /** Cancel an Account Transfer */
    override fun cancel(
        params: AccountTransferCancelParams,
        requestOptions: RequestOptions
    ): AccountTransfer {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("account_transfers", params.getPathParam(0), "cancel")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .apply { params.getBody().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .let { cancelHandler.handle(it) }
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
              cancelHandler.handle(it)
          }
          .apply  {
              if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                validate()
              }
          }
      }
    }
}
