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
import com.increase.api.core.http.json
import com.increase.api.core.http.parseable
import com.increase.api.core.prepare
import com.increase.api.errors.IncreaseError
import com.increase.api.models.RealTimePaymentsRequestForPayment
import com.increase.api.models.RealTimePaymentsRequestForPaymentCreateParams
import com.increase.api.models.RealTimePaymentsRequestForPaymentListPage
import com.increase.api.models.RealTimePaymentsRequestForPaymentListParams
import com.increase.api.models.RealTimePaymentsRequestForPaymentRetrieveParams

class RealTimePaymentsRequestForPaymentServiceImpl
internal constructor(private val clientOptions: ClientOptions) :
    RealTimePaymentsRequestForPaymentService {

    private val withRawResponse: RealTimePaymentsRequestForPaymentService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RealTimePaymentsRequestForPaymentService.WithRawResponse =
        withRawResponse

    override fun create(
        params: RealTimePaymentsRequestForPaymentCreateParams,
        requestOptions: RequestOptions,
    ): RealTimePaymentsRequestForPayment =
        // post /real_time_payments_request_for_payments
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: RealTimePaymentsRequestForPaymentRetrieveParams,
        requestOptions: RequestOptions,
    ): RealTimePaymentsRequestForPayment =
        // get /real_time_payments_request_for_payments/{request_for_payment_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: RealTimePaymentsRequestForPaymentListParams,
        requestOptions: RequestOptions,
    ): RealTimePaymentsRequestForPaymentListPage =
        // get /real_time_payments_request_for_payments
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RealTimePaymentsRequestForPaymentService.WithRawResponse {

        private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<RealTimePaymentsRequestForPayment> =
            jsonHandler<RealTimePaymentsRequestForPayment>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: RealTimePaymentsRequestForPaymentCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RealTimePaymentsRequestForPayment> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("real_time_payments_request_for_payments")
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

        private val retrieveHandler: Handler<RealTimePaymentsRequestForPayment> =
            jsonHandler<RealTimePaymentsRequestForPayment>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: RealTimePaymentsRequestForPaymentRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RealTimePaymentsRequestForPayment> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "real_time_payments_request_for_payments",
                        params.getPathParam(0),
                    )
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

        private val listHandler: Handler<RealTimePaymentsRequestForPaymentListPage.Response> =
            jsonHandler<RealTimePaymentsRequestForPaymentListPage.Response>(
                    clientOptions.jsonMapper
                )
                .withErrorHandler(errorHandler)

        override fun list(
            params: RealTimePaymentsRequestForPaymentListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RealTimePaymentsRequestForPaymentListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("real_time_payments_request_for_payments")
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
                        RealTimePaymentsRequestForPaymentListPage.of(
                            RealTimePaymentsRequestForPaymentServiceImpl(clientOptions),
                            params,
                            it,
                        )
                    }
            }
        }
    }
}
