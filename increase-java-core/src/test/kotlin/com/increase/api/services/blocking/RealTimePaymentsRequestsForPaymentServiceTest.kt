// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.realtimepaymentsrequestsforpayment.RealTimePaymentsRequestsForPaymentCancelParams
import com.increase.api.models.realtimepaymentsrequestsforpayment.RealTimePaymentsRequestsForPaymentCreateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class RealTimePaymentsRequestsForPaymentServiceTest {

    @Test
    fun create() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val realTimePaymentsRequestsForPaymentService = client.realTimePaymentsRequestsForPayment()

        val realTimePaymentsRequestForPayment =
            realTimePaymentsRequestsForPaymentService.create(
                RealTimePaymentsRequestsForPaymentCreateParams.builder()
                    .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                    .amount(100L)
                    .debtor(
                        RealTimePaymentsRequestsForPaymentCreateParams.Debtor.builder()
                            .address(
                                RealTimePaymentsRequestsForPaymentCreateParams.Debtor.Address
                                    .builder()
                                    .country("US")
                                    .addressLine2("x")
                                    .buildingNumber("x")
                                    .city("x")
                                    .postalCode("x")
                                    .state("xx")
                                    .streetName("Liberty Street")
                                    .build()
                            )
                            .name("Ian Crease")
                            .build()
                    )
                    .debtorAccountNumber("987654321")
                    .debtorRoutingNumber("101050001")
                    .expiresAt(OffsetDateTime.parse("2020-02-14T23:59:59Z"))
                    .requestedExecutionAt(OffsetDateTime.parse("2020-02-07T23:59:59Z"))
                    .unstructuredRemittanceInformation("Invoice 29582")
                    .creditorName("National Phonograph Company")
                    .build()
            )

        realTimePaymentsRequestForPayment.validate()
    }

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val realTimePaymentsRequestsForPaymentService = client.realTimePaymentsRequestsForPayment()

        val realTimePaymentsRequestForPayment =
            realTimePaymentsRequestsForPaymentService.retrieve(
                "real_time_payments_request_for_payment_28kcliz1oevcnqyn9qp7"
            )

        realTimePaymentsRequestForPayment.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val realTimePaymentsRequestsForPaymentService = client.realTimePaymentsRequestsForPayment()

        val page = realTimePaymentsRequestsForPaymentService.list()

        page.response().validate()
    }

    @Test
    fun cancel() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val realTimePaymentsRequestsForPaymentService = client.realTimePaymentsRequestsForPayment()

        val realTimePaymentsRequestForPayment =
            realTimePaymentsRequestsForPaymentService.cancel(
                RealTimePaymentsRequestsForPaymentCancelParams.builder()
                    .realTimePaymentsRequestForPaymentId(
                        "real_time_payments_request_for_payment_28kcliz1oevcnqyn9qp7"
                    )
                    .additionalInformation("x")
                    .reason(
                        RealTimePaymentsRequestsForPaymentCancelParams.Reason.REQUESTED_BY_CUSTOMER
                    )
                    .build()
            )

        realTimePaymentsRequestForPayment.validate()
    }
}
