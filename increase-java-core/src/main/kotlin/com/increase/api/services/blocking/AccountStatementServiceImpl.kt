// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.core.ClientOptions
import com.increase.api.core.JsonValue
import com.increase.api.core.RequestOptions
import com.increase.api.core.checkRequired
import com.increase.api.core.handlers.errorHandler
import com.increase.api.core.handlers.jsonHandler
import com.increase.api.core.handlers.withErrorHandler
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.core.http.parseable
import com.increase.api.core.prepare
import com.increase.api.models.accountstatements.AccountStatement
import com.increase.api.models.accountstatements.AccountStatementListPage
import com.increase.api.models.accountstatements.AccountStatementListPageResponse
import com.increase.api.models.accountstatements.AccountStatementListParams
import com.increase.api.models.accountstatements.AccountStatementRetrieveParams
import kotlin.jvm.optionals.getOrNull

class AccountStatementServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AccountStatementService {

    private val withRawResponse: AccountStatementService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AccountStatementService.WithRawResponse = withRawResponse

    override fun retrieve(
        params: AccountStatementRetrieveParams,
        requestOptions: RequestOptions,
    ): AccountStatement =
        // get /account_statements/{account_statement_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: AccountStatementListParams,
        requestOptions: RequestOptions,
    ): AccountStatementListPage =
        // get /account_statements
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AccountStatementService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<AccountStatement> =
            jsonHandler<AccountStatement>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: AccountStatementRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountStatement> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("accountStatementId", params.accountStatementId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("account_statements", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<AccountStatementListPageResponse> =
            jsonHandler<AccountStatementListPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: AccountStatementListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountStatementListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("account_statements")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        AccountStatementListPage.builder()
                            .service(AccountStatementServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
