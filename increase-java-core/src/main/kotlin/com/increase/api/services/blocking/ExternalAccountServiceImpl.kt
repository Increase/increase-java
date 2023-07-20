package com.increase.api.services.blocking

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.errors.IncreaseError
import com.increase.api.models.ExternalAccount
import com.increase.api.models.ExternalAccountCreateParams
import com.increase.api.models.ExternalAccountListPage
import com.increase.api.models.ExternalAccountListParams
import com.increase.api.models.ExternalAccountRetrieveParams
import com.increase.api.models.ExternalAccountUpdateParams
import com.increase.api.services.errorHandler
import com.increase.api.services.json
import com.increase.api.services.jsonHandler
import com.increase.api.services.withErrorHandler

class ExternalAccountServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : ExternalAccountService {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<ExternalAccount> =
        jsonHandler<ExternalAccount>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create an External Account */
    override fun create(
        params: ExternalAccountCreateParams,
        requestOptions: RequestOptions
    ): ExternalAccount {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("external_accounts")
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

    private val retrieveHandler: Handler<ExternalAccount> =
        jsonHandler<ExternalAccount>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retrieve an External Account */
    override fun retrieve(
        params: ExternalAccountRetrieveParams,
        requestOptions: RequestOptions
    ): ExternalAccount {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("external_accounts", params.getPathParam(0))
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

    private val updateHandler: Handler<ExternalAccount> =
        jsonHandler<ExternalAccount>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Update an External Account */
    override fun update(
        params: ExternalAccountUpdateParams,
        requestOptions: RequestOptions
    ): ExternalAccount {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PATCH)
                .addPathSegments("external_accounts", params.getPathParam(0))
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { updateHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listHandler: Handler<ExternalAccountListPage.Response> =
        jsonHandler<ExternalAccountListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List External Accounts */
    override fun list(
        params: ExternalAccountListParams,
        requestOptions: RequestOptions
    ): ExternalAccountListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("external_accounts")
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
                .let { ExternalAccountListPage.of(this, params, it) }
        }
    }
}
