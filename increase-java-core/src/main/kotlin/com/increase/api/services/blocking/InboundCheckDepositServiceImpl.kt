// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.errors.IncreaseError
import com.increase.api.models.InboundCheckDeposit
import com.increase.api.models.InboundCheckDepositListPage
import com.increase.api.models.InboundCheckDepositListParams
import com.increase.api.models.InboundCheckDepositRetrieveParams
import com.increase.api.services.errorHandler
import com.increase.api.services.jsonHandler
import com.increase.api.services.withErrorHandler

class InboundCheckDepositServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : InboundCheckDepositService {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<InboundCheckDeposit> =
        jsonHandler<InboundCheckDeposit>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retrieve an Inbound Check Deposit */
    override fun retrieve(
        params: InboundCheckDepositRetrieveParams,
        requestOptions: RequestOptions
    ): InboundCheckDeposit {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("inbound_check_deposits", params.getPathParam(0))
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

    private val listHandler: Handler<InboundCheckDepositListPage.Response> =
        jsonHandler<InboundCheckDepositListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List Inbound Check Deposits */
    override fun list(
        params: InboundCheckDepositListParams,
        requestOptions: RequestOptions
    ): InboundCheckDepositListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("inbound_check_deposits")
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
                .let { InboundCheckDepositListPage.of(this, params, it) }
        }
    }
}
