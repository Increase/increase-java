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
import com.increase.api.models.CheckDeposit
import com.increase.api.models.CheckDepositCreateParams
import com.increase.api.models.CheckDepositListPage
import com.increase.api.models.CheckDepositListParams
import com.increase.api.models.CheckDepositRetrieveParams

class CheckDepositServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CheckDepositService {

    private val withRawResponse: CheckDepositService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CheckDepositService.WithRawResponse = withRawResponse

    override fun create(
        params: CheckDepositCreateParams,
        requestOptions: RequestOptions,
    ): CheckDeposit =
        // post /check_deposits
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: CheckDepositRetrieveParams,
        requestOptions: RequestOptions,
    ): CheckDeposit =
        // get /check_deposits/{check_deposit_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: CheckDepositListParams,
        requestOptions: RequestOptions,
    ): CheckDepositListPage =
        // get /check_deposits
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CheckDepositService.WithRawResponse {

        private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<CheckDeposit> =
            jsonHandler<CheckDeposit>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: CheckDepositCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CheckDeposit> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("check_deposits")
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

        private val retrieveHandler: Handler<CheckDeposit> =
            jsonHandler<CheckDeposit>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: CheckDepositRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CheckDeposit> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("check_deposits", params.getPathParam(0))
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

        private val listHandler: Handler<CheckDepositListPage.Response> =
            jsonHandler<CheckDepositListPage.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: CheckDepositListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CheckDepositListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("check_deposits")
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
                        CheckDepositListPage.of(CheckDepositServiceImpl(clientOptions), params, it)
                    }
            }
        }
    }
}
