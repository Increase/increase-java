package com.increase.api.services.blocking

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.errors.IncreaseError
import com.increase.api.models.AchTransfer
import com.increase.api.models.AchTransferApproveParams
import com.increase.api.models.AchTransferCancelParams
import com.increase.api.models.AchTransferCreateParams
import com.increase.api.models.AchTransferListPage
import com.increase.api.models.AchTransferListParams
import com.increase.api.models.AchTransferRetrieveParams
import com.increase.api.services.errorHandler
import com.increase.api.services.json
import com.increase.api.services.jsonHandler
import com.increase.api.services.withErrorHandler

class AchTransferServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : AchTransferService {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<AchTransfer> =
        jsonHandler<AchTransfer>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create an ACH Transfer */
    override fun create(
        params: AchTransferCreateParams,
        requestOptions: RequestOptions
    ): AchTransfer {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("ach_transfers")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { createHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val retrieveHandler: Handler<AchTransfer> =
        jsonHandler<AchTransfer>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retrieve an ACH Transfer */
    override fun retrieve(
        params: AchTransferRetrieveParams,
        requestOptions: RequestOptions
    ): AchTransfer {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("ach_transfers", params.getPathParam(0))
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

    private val listHandler: Handler<AchTransferListPage.Response> =
        jsonHandler<AchTransferListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List ACH Transfers */
    override fun list(
        params: AchTransferListParams,
        requestOptions: RequestOptions
    ): AchTransferListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("ach_transfers")
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
                .let { AchTransferListPage.of(this, params, it) }
        }
    }

    private val approveHandler: Handler<AchTransfer> =
        jsonHandler<AchTransfer>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Approves an ACH Transfer in a pending_approval state. */
    override fun approve(
        params: AchTransferApproveParams,
        requestOptions: RequestOptions
    ): AchTransfer {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("ach_transfers", params.getPathParam(0), "approve")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .apply { params.getBody().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { approveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val cancelHandler: Handler<AchTransfer> =
        jsonHandler<AchTransfer>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Cancels an ACH Transfer in a pending_approval state. */
    override fun cancel(
        params: AchTransferCancelParams,
        requestOptions: RequestOptions
    ): AchTransfer {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("ach_transfers", params.getPathParam(0), "cancel")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .apply { params.getBody().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { cancelHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
