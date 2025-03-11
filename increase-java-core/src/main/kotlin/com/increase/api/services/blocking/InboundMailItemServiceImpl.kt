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
import com.increase.api.models.inboundmailitems.InboundMailItem
import com.increase.api.models.inboundmailitems.InboundMailItemListPage
import com.increase.api.models.inboundmailitems.InboundMailItemListParams
import com.increase.api.models.inboundmailitems.InboundMailItemRetrieveParams

class InboundMailItemServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : InboundMailItemService {

    private val withRawResponse: InboundMailItemService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): InboundMailItemService.WithRawResponse = withRawResponse

    override fun retrieve(params: InboundMailItemRetrieveParams, requestOptions: RequestOptions): InboundMailItem =
        // get /inbound_mail_items/{inbound_mail_item_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(params: InboundMailItemListParams, requestOptions: RequestOptions): InboundMailItemListPage =
        // get /inbound_mail_items
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : InboundMailItemService.WithRawResponse {

        private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<InboundMailItem> = jsonHandler<InboundMailItem>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(params: InboundMailItemRetrieveParams, requestOptions: RequestOptions): HttpResponseFor<InboundMailItem> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .addPathSegments("inbound_mail_items", params.getPathParam(0))
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

        private val listHandler: Handler<InboundMailItemListPage.Response> = jsonHandler<InboundMailItemListPage.Response>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun list(params: InboundMailItemListParams, requestOptions: RequestOptions): HttpResponseFor<InboundMailItemListPage> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .addPathSegments("inbound_mail_items")
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
                  InboundMailItemListPage.of(InboundMailItemServiceImpl(clientOptions), params, it)
              }
          }
        }
    }
}
