// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.core.ClientOptions
import com.increase.api.core.JsonValue
import com.increase.api.core.RequestOptions
import com.increase.api.core.handlers.errorHandler
import com.increase.api.core.handlers.jsonHandler
import com.increase.api.core.handlers.withErrorHandler
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.core.http.json
import com.increase.api.core.http.parseable
import com.increase.api.core.prepare
import com.increase.api.models.accountnumbers.AccountNumber
import com.increase.api.models.accountnumbers.AccountNumberCreateParams
import com.increase.api.models.accountnumbers.AccountNumberListPage
import com.increase.api.models.accountnumbers.AccountNumberListParams
import com.increase.api.models.accountnumbers.AccountNumberRetrieveParams
import com.increase.api.models.accountnumbers.AccountNumberUpdateParams

class AccountNumberServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AccountNumberService {

    private val withRawResponse: AccountNumberService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AccountNumberService.WithRawResponse = withRawResponse

    override fun create(
        params: AccountNumberCreateParams,
        requestOptions: RequestOptions,
    ): AccountNumber =
        // post /account_numbers
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: AccountNumberRetrieveParams,
        requestOptions: RequestOptions,
    ): AccountNumber =
        // get /account_numbers/{account_number_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: AccountNumberUpdateParams,
        requestOptions: RequestOptions,
    ): AccountNumber =
        // patch /account_numbers/{account_number_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: AccountNumberListParams,
        requestOptions: RequestOptions,
    ): AccountNumberListPage =
        // get /account_numbers
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AccountNumberService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<AccountNumber> =
            jsonHandler<AccountNumber>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: AccountNumberCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountNumber> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("account_numbers")
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

        private val retrieveHandler: Handler<AccountNumber> =
            jsonHandler<AccountNumber>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: AccountNumberRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountNumber> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("account_numbers", params._pathParam(0))
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

        private val updateHandler: Handler<AccountNumber> =
            jsonHandler<AccountNumber>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: AccountNumberUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountNumber> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .addPathSegments("account_numbers", params._pathParam(0))
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

        private val listHandler: Handler<AccountNumberListPage.Response> =
            jsonHandler<AccountNumberListPage.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: AccountNumberListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountNumberListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("account_numbers")
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
                        AccountNumberListPage.of(
                            AccountNumberServiceImpl(clientOptions),
                            params,
                            it,
                        )
                    }
            }
        }
    }
}
