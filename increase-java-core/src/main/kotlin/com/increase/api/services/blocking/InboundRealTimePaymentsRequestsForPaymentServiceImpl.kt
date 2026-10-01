// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.checkRequired
import com.increase.api.core.handlers.errorBodyHandler
import com.increase.api.core.handlers.errorHandler
import com.increase.api.core.handlers.jsonHandler
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.core.http.parseable
import com.increase.api.core.prepare
import com.increase.api.models.inboundrealtimepaymentsrequestsforpayment.InboundRealTimePaymentsRequestForPayment
import com.increase.api.models.inboundrealtimepaymentsrequestsforpayment.InboundRealTimePaymentsRequestsForPaymentListPage
import com.increase.api.models.inboundrealtimepaymentsrequestsforpayment.InboundRealTimePaymentsRequestsForPaymentListPageResponse
import com.increase.api.models.inboundrealtimepaymentsrequestsforpayment.InboundRealTimePaymentsRequestsForPaymentListParams
import com.increase.api.models.inboundrealtimepaymentsrequestsforpayment.InboundRealTimePaymentsRequestsForPaymentRetrieveParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class InboundRealTimePaymentsRequestsForPaymentServiceImpl
internal constructor(private val clientOptions: ClientOptions) :
    InboundRealTimePaymentsRequestsForPaymentService {

    private val withRawResponse:
        InboundRealTimePaymentsRequestsForPaymentService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse():
        InboundRealTimePaymentsRequestsForPaymentService.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): InboundRealTimePaymentsRequestsForPaymentService =
        InboundRealTimePaymentsRequestsForPaymentServiceImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun retrieve(
        params: InboundRealTimePaymentsRequestsForPaymentRetrieveParams,
        requestOptions: RequestOptions,
    ): InboundRealTimePaymentsRequestForPayment =
        // get
        // /inbound_real_time_payments_requests_for_payment/{inbound_real_time_payments_request_for_payment_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: InboundRealTimePaymentsRequestsForPaymentListParams,
        requestOptions: RequestOptions,
    ): InboundRealTimePaymentsRequestsForPaymentListPage =
        // get /inbound_real_time_payments_requests_for_payment
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InboundRealTimePaymentsRequestsForPaymentService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InboundRealTimePaymentsRequestsForPaymentService.WithRawResponse =
            InboundRealTimePaymentsRequestsForPaymentServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<InboundRealTimePaymentsRequestForPayment> =
            jsonHandler<InboundRealTimePaymentsRequestForPayment>(clientOptions.jsonMapper)

        override fun retrieve(
            params: InboundRealTimePaymentsRequestsForPaymentRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InboundRealTimePaymentsRequestForPayment> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired(
                "inboundRealTimePaymentsRequestForPaymentId",
                params.inboundRealTimePaymentsRequestForPaymentId().getOrNull(),
            )
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "inbound_real_time_payments_requests_for_payment",
                        params._pathParam(0),
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler:
            Handler<InboundRealTimePaymentsRequestsForPaymentListPageResponse> =
            jsonHandler<InboundRealTimePaymentsRequestsForPaymentListPageResponse>(
                clientOptions.jsonMapper
            )

        override fun list(
            params: InboundRealTimePaymentsRequestsForPaymentListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InboundRealTimePaymentsRequestsForPaymentListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("inbound_real_time_payments_requests_for_payment")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        InboundRealTimePaymentsRequestsForPaymentListPage.builder()
                            .service(
                                InboundRealTimePaymentsRequestsForPaymentServiceImpl(clientOptions)
                            )
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
