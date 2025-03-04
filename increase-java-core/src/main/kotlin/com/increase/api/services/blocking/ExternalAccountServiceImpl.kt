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
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.core.http.parseable
import com.increase.api.core.json
import com.increase.api.core.prepare
import com.increase.api.errors.IncreaseError
import com.increase.api.models.ExternalAccount
import com.increase.api.models.ExternalAccountCreateParams
import com.increase.api.models.ExternalAccountListPage
import com.increase.api.models.ExternalAccountListParams
import com.increase.api.models.ExternalAccountRetrieveParams
import com.increase.api.models.ExternalAccountUpdateParams

class ExternalAccountServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ExternalAccountService {

    private val withRawResponse: ExternalAccountService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ExternalAccountService.WithRawResponse = withRawResponse

    override fun create(
        params: ExternalAccountCreateParams,
        requestOptions: RequestOptions,
    ): ExternalAccount =
        // post /external_accounts
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: ExternalAccountRetrieveParams,
        requestOptions: RequestOptions,
    ): ExternalAccount =
        // get /external_accounts/{external_account_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: ExternalAccountUpdateParams,
        requestOptions: RequestOptions,
    ): ExternalAccount =
        // patch /external_accounts/{external_account_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: ExternalAccountListParams,
        requestOptions: RequestOptions,
    ): ExternalAccountListPage =
        // get /external_accounts
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ExternalAccountService.WithRawResponse {

        private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<ExternalAccount> =
            jsonHandler<ExternalAccount>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: ExternalAccountCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExternalAccount> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("external_accounts")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<ExternalAccount> =
            jsonHandler<ExternalAccount>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: ExternalAccountRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExternalAccount> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("external_accounts", params.getPathParam(0))
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

        private val updateHandler: Handler<ExternalAccount> =
            jsonHandler<ExternalAccount>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: ExternalAccountUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExternalAccount> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .addPathSegments("external_accounts", params.getPathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<ExternalAccountListPage.Response> =
            jsonHandler<ExternalAccountListPage.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: ExternalAccountListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExternalAccountListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("external_accounts")
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
                        ExternalAccountListPage.of(
                            ExternalAccountServiceImpl(clientOptions),
                            params,
                            it,
                        )
                    }
            }
        }
    }
}
