// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

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
import com.increase.api.models.DigitalWalletToken
import com.increase.api.models.DigitalWalletTokenListPage
import com.increase.api.models.DigitalWalletTokenListParams
import com.increase.api.models.DigitalWalletTokenRetrieveParams
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

class DigitalWalletTokenServiceImpl constructor(private val clientOptions: ClientOptions, ) : DigitalWalletTokenService {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<DigitalWalletToken> =
    jsonHandler<DigitalWalletToken>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /** Retrieve a Digital Wallet Token */
    override fun retrieve(params: DigitalWalletTokenRetrieveParams, requestOptions: RequestOptions): DigitalWalletToken {
      val request = HttpRequest.builder()
        .method(HttpMethod.GET)
        .addPathSegments("digital_wallet_tokens", params.getPathParam(0))
        .putAllQueryParams(clientOptions.queryParams)
        .putAllQueryParams(params.getQueryParams())
        .putAllHeaders(clientOptions.headers)
        .putAllHeaders(params.getHeaders())
        .build()
      return clientOptions.httpClient.execute(request, requestOptions)
      .let { response -> 
          response.use {
              retrieveHandler.handle(it)
          }
          .apply  {
              if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                validate()
              }
          }
      }
    }

    private val listHandler: Handler<DigitalWalletTokenListPage.Response> =
    jsonHandler<DigitalWalletTokenListPage.Response>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /** List Digital Wallet Tokens */
    override fun list(params: DigitalWalletTokenListParams, requestOptions: RequestOptions): DigitalWalletTokenListPage {
      val request = HttpRequest.builder()
        .method(HttpMethod.GET)
        .addPathSegments("digital_wallet_tokens")
        .putAllQueryParams(clientOptions.queryParams)
        .putAllQueryParams(params.getQueryParams())
        .putAllHeaders(clientOptions.headers)
        .putAllHeaders(params.getHeaders())
        .build()
      return clientOptions.httpClient.execute(request, requestOptions)
      .let { response -> 
          response.use {
              listHandler.handle(it)
          }
          .apply  {
              if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                validate()
              }
          }
          .let {
              DigitalWalletTokenListPage.of(this, params, it)
          }
      }
    }
}
