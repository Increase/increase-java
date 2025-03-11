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
import com.increase.api.models.checktransfers.CheckTransfer
import com.increase.api.models.simulations.checktransfers.CheckTransferMailParams

class CheckTransferServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : CheckTransferService {

    private val withRawResponse: CheckTransferService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): CheckTransferService.WithRawResponse = withRawResponse

    override fun mail(params: CheckTransferMailParams, requestOptions: RequestOptions): CheckTransfer =
        // post /simulations/check_transfers/{check_transfer_id}/mail
        withRawResponse().mail(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : CheckTransferService.WithRawResponse {

        private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

        private val mailHandler: Handler<CheckTransfer> = jsonHandler<CheckTransfer>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun mail(params: CheckTransferMailParams, requestOptions: RequestOptions): HttpResponseFor<CheckTransfer> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .addPathSegments("simulations", "check_transfers", params.getPathParam(0), "mail")
            .apply { params._body().ifPresent{ body(json(clientOptions.jsonMapper, it)) } }
            .build()
            .prepare(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.execute(
            request, requestOptions
          )
          return response.parseable {
              response.use {
                  mailHandler.handle(it)
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
