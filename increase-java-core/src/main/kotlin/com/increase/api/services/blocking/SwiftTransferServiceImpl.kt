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
import com.increase.api.models.swifttransfers.SwiftTransfer
import com.increase.api.models.swifttransfers.SwiftTransferApproveParams
import com.increase.api.models.swifttransfers.SwiftTransferCancelParams
import com.increase.api.models.swifttransfers.SwiftTransferCreateParams
import com.increase.api.models.swifttransfers.SwiftTransferListPage
import com.increase.api.models.swifttransfers.SwiftTransferListPageResponse
import com.increase.api.models.swifttransfers.SwiftTransferListParams
import com.increase.api.models.swifttransfers.SwiftTransferRetrieveParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SwiftTransferServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SwiftTransferService {

    private val withRawResponse: SwiftTransferService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SwiftTransferService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SwiftTransferService =
        SwiftTransferServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: SwiftTransferCreateParams,
        requestOptions: RequestOptions,
    ): SwiftTransfer =
        // post /swift_transfers
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: SwiftTransferRetrieveParams,
        requestOptions: RequestOptions,
    ): SwiftTransfer =
        // get /swift_transfers/{swift_transfer_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: SwiftTransferListParams,
        requestOptions: RequestOptions,
    ): SwiftTransferListPage =
        // get /swift_transfers
        withRawResponse().list(params, requestOptions).parse()

    override fun approve(
        params: SwiftTransferApproveParams,
        requestOptions: RequestOptions,
    ): SwiftTransfer =
        // post /swift_transfers/{swift_transfer_id}/approve
        withRawResponse().approve(params, requestOptions).parse()

    override fun cancel(
        params: SwiftTransferCancelParams,
        requestOptions: RequestOptions,
    ): SwiftTransfer =
        // post /swift_transfers/{swift_transfer_id}/cancel
        withRawResponse().cancel(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SwiftTransferService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SwiftTransferService.WithRawResponse =
            SwiftTransferServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<SwiftTransfer> =
            jsonHandler<SwiftTransfer>(clientOptions.jsonMapper)

        override fun create(
            params: SwiftTransferCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SwiftTransfer> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("swift_transfers")
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

        private val retrieveHandler: Handler<SwiftTransfer> =
            jsonHandler<SwiftTransfer>(clientOptions.jsonMapper)

        override fun retrieve(
            params: SwiftTransferRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SwiftTransfer> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("swiftTransferId", params.swiftTransferId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("swift_transfers", params._pathParam(0))
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

        private val listHandler: Handler<SwiftTransferListPageResponse> =
            jsonHandler<SwiftTransferListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: SwiftTransferListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SwiftTransferListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("swift_transfers")
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
                    .let {
                        SwiftTransferListPage.builder()
                            .service(SwiftTransferServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val approveHandler: Handler<SwiftTransfer> =
            jsonHandler<SwiftTransfer>(clientOptions.jsonMapper)

        override fun approve(
            params: SwiftTransferApproveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SwiftTransfer> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("swiftTransferId", params.swiftTransferId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("swift_transfers", params._pathParam(0), "approve")
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

        private val cancelHandler: Handler<SwiftTransfer> =
            jsonHandler<SwiftTransfer>(clientOptions.jsonMapper)

        override fun cancel(
            params: SwiftTransferCancelParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SwiftTransfer> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("swiftTransferId", params.swiftTransferId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("swift_transfers", params._pathParam(0), "cancel")
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
