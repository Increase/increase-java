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
import com.increase.api.models.CheckDeposit
import com.increase.api.models.CheckDepositCreateParams
import com.increase.api.models.CheckDepositListPage
import com.increase.api.models.CheckDepositListParams
import com.increase.api.models.CheckDepositRetrieveParams

class CheckDepositServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CheckDepositService {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<CheckDeposit> =
        jsonHandler<CheckDeposit>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create a Check Deposit */
    override fun create(
        params: CheckDepositCreateParams,
        requestOptions: RequestOptions,
    ): CheckDeposit {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("check_deposits")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { createHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation!!) {
                    it.validate()
                }
            }
    }

    private val retrieveHandler: Handler<CheckDeposit> =
        jsonHandler<CheckDeposit>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retrieve a Check Deposit */
    override fun retrieve(
        params: CheckDepositRetrieveParams,
        requestOptions: RequestOptions,
    ): CheckDeposit {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("check_deposits", params.getPathParam(0))
                .build()
                .prepare(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { retrieveHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation!!) {
                    it.validate()
                }
            }
    }

    private val listHandler: Handler<CheckDepositListPage.Response> =
        jsonHandler<CheckDepositListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List Check Deposits */
    override fun list(
        params: CheckDepositListParams,
        requestOptions: RequestOptions,
    ): CheckDepositListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("check_deposits")
                .build()
                .prepare(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { listHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation!!) {
                    it.validate()
                }
            }
            .let { CheckDepositListPage.of(this, params, it) }
    }
}
