// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

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
import com.increase.api.models.CardPurchaseSupplement
import com.increase.api.models.CardPurchaseSupplementListPageAsync
import com.increase.api.models.CardPurchaseSupplementListParams
import com.increase.api.models.CardPurchaseSupplementRetrieveParams
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

class CardPurchaseSupplementServiceAsyncImpl constructor(private val clientOptions: ClientOptions, ) : CardPurchaseSupplementServiceAsync {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<CardPurchaseSupplement> =
    jsonHandler<CardPurchaseSupplement>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /** Retrieve a Card Purchase Supplement */
    override fun retrieve(params: CardPurchaseSupplementRetrieveParams, requestOptions: RequestOptions): CompletableFuture<CardPurchaseSupplement> {
      val request = HttpRequest.builder()
        .method(HttpMethod.GET)
        .addPathSegments("card_purchase_supplements", params.getPathParam(0))
        .putAllQueryParams(clientOptions.queryParams)
        .putAllQueryParams(params.getQueryParams())
        .putAllHeaders(clientOptions.headers)
        .putAllHeaders(params.getHeaders())
        .build()
      return clientOptions.httpClient.executeAsync(request, requestOptions)
      .thenApply { response -> 
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

    private val listHandler: Handler<CardPurchaseSupplementListPageAsync.Response> =
    jsonHandler<CardPurchaseSupplementListPageAsync.Response>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /** List Card Purchase Supplements */
    override fun list(params: CardPurchaseSupplementListParams, requestOptions: RequestOptions): CompletableFuture<CardPurchaseSupplementListPageAsync> {
      val request = HttpRequest.builder()
        .method(HttpMethod.GET)
        .addPathSegments("card_purchase_supplements")
        .putAllQueryParams(clientOptions.queryParams)
        .putAllQueryParams(params.getQueryParams())
        .putAllHeaders(clientOptions.headers)
        .putAllHeaders(params.getHeaders())
        .build()
      return clientOptions.httpClient.executeAsync(request, requestOptions)
      .thenApply { response -> 
          response.use {
              listHandler.handle(it)
          }
          .apply  {
              if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                validate()
              }
          }
          .let {
              CardPurchaseSupplementListPageAsync.of(this, params, it)
          }
      }
    }
}
