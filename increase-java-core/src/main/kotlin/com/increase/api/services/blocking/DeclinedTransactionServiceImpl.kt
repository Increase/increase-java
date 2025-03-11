// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.handlers.errorHandler
import com.increase.api.core.handlers.jsonHandler
import com.increase.api.core.handlers.withErrorHandler
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.core.http.parseable
import com.increase.api.core.prepare
import com.increase.api.errors.IncreaseError
import com.increase.api.models.declinedtransactions.DeclinedTransaction
import com.increase.api.models.declinedtransactions.DeclinedTransactionListPage
import com.increase.api.models.declinedtransactions.DeclinedTransactionListParams
import com.increase.api.models.declinedtransactions.DeclinedTransactionRetrieveParams

class DeclinedTransactionServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : DeclinedTransactionService {

    private val withRawResponse: DeclinedTransactionService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): DeclinedTransactionService.WithRawResponse = withRawResponse

    override fun retrieve(params: DeclinedTransactionRetrieveParams, requestOptions: RequestOptions): DeclinedTransaction =
        // get /declined_transactions/{declined_transaction_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(params: DeclinedTransactionListParams, requestOptions: RequestOptions): DeclinedTransactionListPage =
        // get /declined_transactions
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : DeclinedTransactionService.WithRawResponse {

        private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<DeclinedTransaction> = jsonHandler<DeclinedTransaction>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(params: DeclinedTransactionRetrieveParams, requestOptions: RequestOptions): HttpResponseFor<DeclinedTransaction> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .addPathSegments("declined_transactions", params.getPathParam(0))
            .build()
            .prepare(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.execute(
            request, requestOptions
          )
          return response.parseable {
              response.use {
                  retrieveHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
          }
        }

        private val listHandler: Handler<DeclinedTransactionListPage.Response> = jsonHandler<DeclinedTransactionListPage.Response>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun list(params: DeclinedTransactionListParams, requestOptions: RequestOptions): HttpResponseFor<DeclinedTransactionListPage> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .addPathSegments("declined_transactions")
            .build()
            .prepare(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.execute(
            request, requestOptions
          )
          return response.parseable {
              response.use {
                  listHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
              .let {
                  DeclinedTransactionListPage.of(DeclinedTransactionServiceImpl(clientOptions), params, it)
              }
          }
        }
    }
}
