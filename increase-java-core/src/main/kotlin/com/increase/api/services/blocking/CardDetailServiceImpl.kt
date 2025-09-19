// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.checkRequired
import com.increase.api.core.handlers.errorBodyHandler
import com.increase.api.core.handlers.errorHandler
import com.increase.api.core.handlers.jsonHandler
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.core.http.json
import com.increase.api.core.http.parseable
import com.increase.api.core.prepare
import com.increase.api.models.carddetails.CardDetailCreateDetailsIframeParams
import com.increase.api.models.carddetails.CardDetailDetailsParams
import com.increase.api.models.carddetails.CardDetailUpdateParams
import com.increase.api.models.carddetails.CardDetails
import com.increase.api.models.carddetails.CardIframeUrl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class CardDetailServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CardDetailService {

    private val withRawResponse: CardDetailService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CardDetailService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CardDetailService =
        CardDetailServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun update(
        params: CardDetailUpdateParams,
        requestOptions: RequestOptions,
    ): CardDetails =
        // patch /cards/{card_id}/details
        withRawResponse().update(params, requestOptions).parse()

    override fun createDetailsIframe(
        params: CardDetailCreateDetailsIframeParams,
        requestOptions: RequestOptions,
    ): CardIframeUrl =
        // post /cards/{card_id}/create_details_iframe
        withRawResponse().createDetailsIframe(params, requestOptions).parse()

    override fun details(
        params: CardDetailDetailsParams,
        requestOptions: RequestOptions,
    ): CardDetails =
        // get /cards/{card_id}/details
        withRawResponse().details(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CardDetailService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CardDetailService.WithRawResponse =
            CardDetailServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val updateHandler: Handler<CardDetails> =
            jsonHandler<CardDetails>(clientOptions.jsonMapper)

        override fun update(
            params: CardDetailUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardDetails> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("cardId", params.cardId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cards", params._pathParam(0), "details")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val createDetailsIframeHandler: Handler<CardIframeUrl> =
            jsonHandler<CardIframeUrl>(clientOptions.jsonMapper)

        override fun createDetailsIframe(
            params: CardDetailCreateDetailsIframeParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardIframeUrl> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("cardId", params.cardId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cards", params._pathParam(0), "create_details_iframe")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createDetailsIframeHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val detailsHandler: Handler<CardDetails> =
            jsonHandler<CardDetails>(clientOptions.jsonMapper)

        override fun details(
            params: CardDetailDetailsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardDetails> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("cardId", params.cardId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cards", params._pathParam(0), "details")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { detailsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
