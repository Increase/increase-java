// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

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
import com.increase.api.models.AccountStatement
import com.increase.api.models.SimulationAccountStatementCreateParams

class AccountStatementServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AccountStatementService {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<AccountStatement> =
        jsonHandler<AccountStatement>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Simulates an [Account Statement](#account-statements) being created for an account. In
     * production, Account Statements are generated once per month.
     */
    override fun create(
        params: SimulationAccountStatementCreateParams,
        requestOptions: RequestOptions,
    ): AccountStatement {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("simulations", "account_statements")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { createHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }
}
