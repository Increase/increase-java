package com.increase.api.services.blocking

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.errors.IncreaseError
import com.increase.api.models.InboundAchTransfer
import com.increase.api.models.InboundAchTransferListPage
import com.increase.api.models.InboundAchTransferListParams
import com.increase.api.models.InboundAchTransferRetrieveParams
import com.increase.api.services.errorHandler
import com.increase.api.services.jsonHandler
import com.increase.api.services.withErrorHandler

class InboundAchTransferServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : InboundAchTransferService {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<InboundAchTransfer> =
        jsonHandler<InboundAchTransfer>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retrieve an Inbound ACH Transfer */
    override fun retrieve(
        params: InboundAchTransferRetrieveParams,
        requestOptions: RequestOptions
    ): InboundAchTransfer {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("inbound_ach_transfers", params.getPathParam(0))
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listHandler: Handler<InboundAchTransferListPage.Response> =
        jsonHandler<InboundAchTransferListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List Inbound ACH Transfers */
    override fun list(
        params: InboundAchTransferListParams,
        requestOptions: RequestOptions
    ): InboundAchTransferListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("inbound_ach_transfers")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { InboundAchTransferListPage.of(this, params, it) }
        }
    }
}
