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
import com.increase.api.models.achtransfers.AchTransfer
import com.increase.api.models.achtransfers.AchTransferApproveParams
import com.increase.api.models.achtransfers.AchTransferCancelParams
import com.increase.api.models.achtransfers.AchTransferCreateParams
import com.increase.api.models.achtransfers.AchTransferListParams
import com.increase.api.models.achtransfers.AchTransferListResponse
import com.increase.api.models.achtransfers.AchTransferRetrieveParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class AchTransferServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AchTransferService {

    private val withRawResponse: AchTransferService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AchTransferService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AchTransferService =
        AchTransferServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: AchTransferCreateParams,
        requestOptions: RequestOptions,
    ): AchTransfer =
        // post /ach_transfers
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: AchTransferRetrieveParams,
        requestOptions: RequestOptions,
    ): AchTransfer =
        // get /ach_transfers/{ach_transfer_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: AchTransferListParams,
        requestOptions: RequestOptions,
    ): AchTransferListResponse =
        // get /ach_transfers
        withRawResponse().list(params, requestOptions).parse()

    override fun approve(
        params: AchTransferApproveParams,
        requestOptions: RequestOptions,
    ): AchTransfer =
        // post /ach_transfers/{ach_transfer_id}/approve
        withRawResponse().approve(params, requestOptions).parse()

    override fun cancel(
        params: AchTransferCancelParams,
        requestOptions: RequestOptions,
    ): AchTransfer =
        // post /ach_transfers/{ach_transfer_id}/cancel
        withRawResponse().cancel(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AchTransferService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AchTransferService.WithRawResponse =
            AchTransferServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<AchTransfer> =
            jsonHandler<AchTransfer>(clientOptions.jsonMapper)

        override fun create(
            params: AchTransferCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AchTransfer> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ach_transfers")
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

        private val retrieveHandler: Handler<AchTransfer> =
            jsonHandler<AchTransfer>(clientOptions.jsonMapper)

        override fun retrieve(
            params: AchTransferRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AchTransfer> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("achTransferId", params.achTransferId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ach_transfers", params._pathParam(0))
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

        private val listHandler: Handler<AchTransferListResponse> =
            jsonHandler<AchTransferListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: AchTransferListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AchTransferListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ach_transfers")
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

        private val approveHandler: Handler<AchTransfer> =
            jsonHandler<AchTransfer>(clientOptions.jsonMapper)

        override fun approve(
            params: AchTransferApproveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AchTransfer> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("achTransferId", params.achTransferId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ach_transfers", params._pathParam(0), "approve")
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

        private val cancelHandler: Handler<AchTransfer> =
            jsonHandler<AchTransfer>(clientOptions.jsonMapper)

        override fun cancel(
            params: AchTransferCancelParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AchTransfer> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("achTransferId", params.achTransferId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ach_transfers", params._pathParam(0), "cancel")
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
