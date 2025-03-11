// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.handlers.errorHandler
import com.increase.api.core.handlers.jsonHandler
import com.increase.api.core.handlers.withErrorHandler
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.core.http.json
import com.increase.api.core.http.parseable
import com.increase.api.core.prepare
import com.increase.api.errors.IncreaseError
import com.increase.api.models.simulations.interestpayments.InterestPaymentCreateParams
import com.increase.api.models.transactions.Transaction

class InterestPaymentServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : InterestPaymentService {

    private val withRawResponse: InterestPaymentService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): InterestPaymentService.WithRawResponse = withRawResponse

    override fun create(params: InterestPaymentCreateParams, requestOptions: RequestOptions): Transaction =
        // post /simulations/interest_payments
        withRawResponse().create(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : InterestPaymentService.WithRawResponse {

        private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<Transaction> = jsonHandler<Transaction>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(params: InterestPaymentCreateParams, requestOptions: RequestOptions): HttpResponseFor<Transaction> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .addPathSegments("simulations", "interest_payments")
            .body(json(clientOptions.jsonMapper, params._body()))
            .build()
            .prepare(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.execute(
            request, requestOptions
          )
          return response.parseable {
              response.use {
                  createHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
          }
        }
    }
}
