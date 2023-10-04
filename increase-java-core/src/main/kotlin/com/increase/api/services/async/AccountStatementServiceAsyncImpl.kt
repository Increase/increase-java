// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.errors.IncreaseError
import com.increase.api.models.AccountStatement
import com.increase.api.models.AccountStatementListPageAsync
import com.increase.api.models.AccountStatementListParams
import com.increase.api.models.AccountStatementRetrieveParams
import com.increase.api.services.errorHandler
import com.increase.api.services.jsonHandler
import com.increase.api.services.withErrorHandler
import java.util.concurrent.CompletableFuture

class AccountStatementServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : AccountStatementServiceAsync {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<AccountStatement> =
        jsonHandler<AccountStatement>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retrieve an Account Statement */
    override fun retrieve(
        params: AccountStatementRetrieveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<AccountStatement> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("account_statements", params.getPathParam(0))
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listHandler: Handler<AccountStatementListPageAsync.Response> =
        jsonHandler<AccountStatementListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List Account Statements */
    override fun list(
        params: AccountStatementListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<AccountStatementListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("account_statements")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { AccountStatementListPageAsync.of(this, params, it) }
        }
    }
}
