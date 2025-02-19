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
import com.increase.api.core.prepare
import com.increase.api.errors.IncreaseError
import com.increase.api.models.InboundCheckDeposit
import com.increase.api.models.InboundCheckDepositDeclineParams
import com.increase.api.models.InboundCheckDepositListPage
import com.increase.api.models.InboundCheckDepositListParams
import com.increase.api.models.InboundCheckDepositRetrieveParams
import com.increase.api.models.InboundCheckDepositReturnParams

class InboundCheckDepositServiceImpl
internal constructor(private val clientOptions: ClientOptions) : InboundCheckDepositService {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<InboundCheckDeposit> =
        jsonHandler<InboundCheckDeposit>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retrieve an Inbound Check Deposit */
    override fun retrieve(
        params: InboundCheckDepositRetrieveParams,
        requestOptions: RequestOptions,
    ): InboundCheckDeposit {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("inbound_check_deposits", params.getPathParam(0))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { retrieveHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val listHandler: Handler<InboundCheckDepositListPage.Response> =
        jsonHandler<InboundCheckDepositListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List Inbound Check Deposits */
    override fun list(
        params: InboundCheckDepositListParams,
        requestOptions: RequestOptions,
    ): InboundCheckDepositListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("inbound_check_deposits")
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { listHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
            .let { InboundCheckDepositListPage.of(this, params, it) }
    }

    private val declineHandler: Handler<InboundCheckDeposit> =
        jsonHandler<InboundCheckDeposit>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Decline an Inbound Check Deposit */
    override fun decline(
        params: InboundCheckDepositDeclineParams,
        requestOptions: RequestOptions,
    ): InboundCheckDeposit {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("inbound_check_deposits", params.getPathParam(0), "decline")
                .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { declineHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val returnHandler: Handler<InboundCheckDeposit> =
        jsonHandler<InboundCheckDeposit>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Return an Inbound Check Deposit */
    override fun return_(
        params: InboundCheckDepositReturnParams,
        requestOptions: RequestOptions,
    ): InboundCheckDeposit {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("inbound_check_deposits", params.getPathParam(0), "return")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { returnHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }
}
