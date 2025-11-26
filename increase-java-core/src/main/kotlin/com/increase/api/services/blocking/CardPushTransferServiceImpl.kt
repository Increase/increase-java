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
import com.increase.api.models.cardpushtransfers.CardPushTransfer
import com.increase.api.models.cardpushtransfers.CardPushTransferApproveParams
import com.increase.api.models.cardpushtransfers.CardPushTransferCancelParams
import com.increase.api.models.cardpushtransfers.CardPushTransferCreateParams
import com.increase.api.models.cardpushtransfers.CardPushTransferListParams
import com.increase.api.models.cardpushtransfers.CardPushTransferListResponse
import com.increase.api.models.cardpushtransfers.CardPushTransferRetrieveParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class CardPushTransferServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CardPushTransferService {

    private val withRawResponse: CardPushTransferService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CardPushTransferService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CardPushTransferService =
        CardPushTransferServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: CardPushTransferCreateParams,
        requestOptions: RequestOptions,
    ): CardPushTransfer =
        // post /card_push_transfers
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: CardPushTransferRetrieveParams,
        requestOptions: RequestOptions,
    ): CardPushTransfer =
        // get /card_push_transfers/{card_push_transfer_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: CardPushTransferListParams,
        requestOptions: RequestOptions,
    ): CardPushTransferListResponse =
        // get /card_push_transfers
        withRawResponse().list(params, requestOptions).parse()

    override fun approve(
        params: CardPushTransferApproveParams,
        requestOptions: RequestOptions,
    ): CardPushTransfer =
        // post /card_push_transfers/{card_push_transfer_id}/approve
        withRawResponse().approve(params, requestOptions).parse()

    override fun cancel(
        params: CardPushTransferCancelParams,
        requestOptions: RequestOptions,
    ): CardPushTransfer =
        // post /card_push_transfers/{card_push_transfer_id}/cancel
        withRawResponse().cancel(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CardPushTransferService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CardPushTransferService.WithRawResponse =
            CardPushTransferServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<CardPushTransfer> =
            jsonHandler<CardPushTransfer>(clientOptions.jsonMapper)

        override fun create(
            params: CardPushTransferCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardPushTransfer> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("card_push_transfers")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<CardPushTransfer> =
            jsonHandler<CardPushTransfer>(clientOptions.jsonMapper)

        override fun retrieve(
            params: CardPushTransferRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardPushTransfer> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("cardPushTransferId", params.cardPushTransferId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("card_push_transfers", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<CardPushTransferListResponse> =
            jsonHandler<CardPushTransferListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: CardPushTransferListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardPushTransferListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("card_push_transfers")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val approveHandler: Handler<CardPushTransfer> =
            jsonHandler<CardPushTransfer>(clientOptions.jsonMapper)

        override fun approve(
            params: CardPushTransferApproveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardPushTransfer> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("cardPushTransferId", params.cardPushTransferId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("card_push_transfers", params._pathParam(0), "approve")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { approveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val cancelHandler: Handler<CardPushTransfer> =
            jsonHandler<CardPushTransfer>(clientOptions.jsonMapper)

        override fun cancel(
            params: CardPushTransferCancelParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardPushTransfer> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("cardPushTransferId", params.cardPushTransferId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("card_push_transfers", params._pathParam(0), "cancel")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { cancelHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
