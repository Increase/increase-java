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
import com.increase.api.core.json
import com.increase.api.errors.IncreaseError
import com.increase.api.models.CheckTransfer
import com.increase.api.models.CheckTransferApproveParams
import com.increase.api.models.CheckTransferCancelParams
import com.increase.api.models.CheckTransferCreateParams
import com.increase.api.models.CheckTransferListPage
import com.increase.api.models.CheckTransferListParams
import com.increase.api.models.CheckTransferRetrieveParams
import com.increase.api.models.CheckTransferStopPaymentParams

class CheckTransferServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : CheckTransferService {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<CheckTransfer> =
        jsonHandler<CheckTransfer>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create a Check Transfer */
    override fun create(
        params: CheckTransferCreateParams,
        requestOptions: RequestOptions
    ): CheckTransfer {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("check_transfers")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
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

    private val retrieveHandler: Handler<CheckTransfer> =
        jsonHandler<CheckTransfer>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retrieve a Check Transfer */
    override fun retrieve(
        params: CheckTransferRetrieveParams,
        requestOptions: RequestOptions
    ): CheckTransfer {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("check_transfers", params.getPathParam(0))
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
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

    private val listHandler: Handler<CheckTransferListPage.Response> =
        jsonHandler<CheckTransferListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List Check Transfers */
    override fun list(
        params: CheckTransferListParams,
        requestOptions: RequestOptions
    ): CheckTransferListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("check_transfers")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { CheckTransferListPage.of(this, params, it) }
        }
    }

    private val approveHandler: Handler<CheckTransfer> =
        jsonHandler<CheckTransfer>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Approve a Check Transfer */
    override fun approve(
        params: CheckTransferApproveParams,
        requestOptions: RequestOptions
    ): CheckTransfer {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("check_transfers", params.getPathParam(0), "approve")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
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

    private val cancelHandler: Handler<CheckTransfer> =
        jsonHandler<CheckTransfer>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Cancel a pending Check Transfer */
    override fun cancel(
        params: CheckTransferCancelParams,
        requestOptions: RequestOptions
    ): CheckTransfer {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("check_transfers", params.getPathParam(0), "cancel")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
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

    private val stopPaymentHandler: Handler<CheckTransfer> =
        jsonHandler<CheckTransfer>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Request a stop payment on a Check Transfer */
    override fun stopPayment(
        params: CheckTransferStopPaymentParams,
        requestOptions: RequestOptions
    ): CheckTransfer {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("check_transfers", params.getPathParam(0), "stop_payment")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { stopPaymentHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
