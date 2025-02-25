// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.RealTimePaymentsRequestForPaymentCreateParams
import com.increase.api.models.RealTimePaymentsRequestForPaymentRetrieveParams
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
                    .amount(100L)
                    .debtor(
                        RealTimePaymentsRequestForPaymentCreateParams.Debtor.builder()
                            .address(
                                RealTimePaymentsRequestForPaymentCreateParams.Debtor.Address
                                    .builder()
                                    .country("US")
                                    .city("x")
                                    .postCode("x")
                                    .streetName("Liberty Street")
                                    .build()
                            )
                            .name("Ian Crease")
                            .build()
                    )
                    .destinationAccountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                    .expiresAt(LocalDate.parse("2026-12-31"))
                    .remittanceInformation("Invoice 29582")
                    .sourceAccountNumber("987654321")
                    .sourceRoutingNumber("101050001")
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
                    .requestForPaymentId("real_time_payments_transfer_iyuhl5kdn7ssmup83mvq")
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
        val realTimePaymentsRequestForPaymentList = realTimePaymentsRequestForPaymentService.list()
        println(realTimePaymentsRequestForPaymentList)
        realTimePaymentsRequestForPaymentList.data().forEach { it.validate() }
    }
}
