// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.*
import com.increase.api.models.RealTimePaymentsRequestForPaymentListParams
import java.time.LocalDate
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class RealTimePaymentsRequestForPaymentServiceTest {

    @Test
    fun callCreate() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val realTimePaymentsRequestForPaymentService = client.realTimePaymentsRequestForPayments()
        val realTimePaymentsRequestForPayment =
            realTimePaymentsRequestForPaymentService.create(
                RealTimePaymentsRequestForPaymentCreateParams.builder()
                    .amount(123L)
                    .debtor(
                        RealTimePaymentsRequestForPaymentCreateParams.Debtor.builder()
                            .address(
                                RealTimePaymentsRequestForPaymentCreateParams.Debtor.Address
                                    .builder()
                                    .country("x")
                                    .city("x")
                                    .postCode("x")
                                    .streetName("x")
                                    .build()
                            )
                            .name("x")
                            .build()
                    )
                    .destinationAccountNumberId("destination_account_number_id")
                    .expiresAt(LocalDate.parse("2019-12-27"))
                    .remittanceInformation("x")
                    .sourceAccountNumber("x")
                    .sourceRoutingNumber("xxxxxxxxx")
                    .build()
            )
        println(realTimePaymentsRequestForPayment)
        realTimePaymentsRequestForPayment.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val realTimePaymentsRequestForPaymentService = client.realTimePaymentsRequestForPayments()
        val realTimePaymentsRequestForPayment =
            realTimePaymentsRequestForPaymentService.retrieve(
                RealTimePaymentsRequestForPaymentRetrieveParams.builder()
                    .requestForPaymentId("request_for_payment_id")
                    .build()
            )
        println(realTimePaymentsRequestForPayment)
        realTimePaymentsRequestForPayment.validate()
    }

    @Test
    fun callList() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val realTimePaymentsRequestForPaymentService = client.realTimePaymentsRequestForPayments()
        val realTimePaymentsRequestForPaymentList =
            realTimePaymentsRequestForPaymentService.list(
                RealTimePaymentsRequestForPaymentListParams.builder().build()
            )
        println(realTimePaymentsRequestForPaymentList)
        realTimePaymentsRequestForPaymentList.data().forEach { it.validate() }
    }
}
