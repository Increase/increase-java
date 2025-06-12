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
import com.increase.api.core.http.json
import com.increase.api.core.http.parseable
import com.increase.api.core.prepare
import com.increase.api.models.checkdeposits.CheckDeposit
import com.increase.api.models.checkdeposits.CheckDepositCreateParams
import com.increase.api.models.checkdeposits.CheckDepositListPage
import com.increase.api.models.checkdeposits.CheckDepositListPageResponse
import com.increase.api.models.checkdeposits.CheckDepositListParams
import com.increase.api.models.checkdeposits.CheckDepositRetrieveParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class CheckDepositServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CheckDepositService {

    private val withRawResponse: CheckDepositService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CheckDepositService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CheckDepositService =
        CheckDepositServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

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

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CheckDepositService.WithRawResponse =
            CheckDepositServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<CheckDeposit> =
            jsonHandler<CheckDeposit>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: CheckDepositCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CheckDeposit> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
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
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("checkDepositId", params.checkDepositId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("check_deposits", params._pathParam(0))
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

        private val listHandler: Handler<CheckDepositListPageResponse> =
            jsonHandler<CheckDepositListPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: CheckDepositListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CheckDepositListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
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
                        CheckDepositListPage.builder()
                            .service(CheckDepositServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
