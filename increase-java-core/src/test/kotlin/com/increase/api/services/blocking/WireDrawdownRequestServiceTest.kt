// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.wiredrawdownrequests.WireDrawdownRequestCreateParams
import com.increase.api.models.wiredrawdownrequests.WireDrawdownRequestListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class WireDrawdownRequestServiceTest {

    @Test
    fun create() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val wireDrawdownRequestService = client.wireDrawdownRequests()

        val wireDrawdownRequest =
            wireDrawdownRequestService.create(
                WireDrawdownRequestCreateParams.builder()
                    .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                    .amount(10000L)
                    .creditorAddress(
                        WireDrawdownRequestCreateParams.CreditorAddress.builder()
                            .city("New York")
                            .country("US")
                            .line1("33 Liberty Street")
                            .line2("x")
                            .postalCode("10045")
                            .state("NY")
                            .build()
                    )
                    .creditorName("National Phonograph Company")
                    .debtorAddress(
                        WireDrawdownRequestCreateParams.DebtorAddress.builder()
                            .city("New York")
                            .country("US")
                            .line1("33 Liberty Street")
                            .line2("x")
                            .postalCode("10045")
                            .state("NY")
                            .build()
                    )
                    .debtorName("Ian Crease")
                    .unstructuredRemittanceInformation("Invoice 29582")
                    .debtorAccountNumber("987654321")
                    .debtorExternalAccountId("debtor_external_account_id")
                    .debtorRoutingNumber("101050001")
                    .build()
            )

        wireDrawdownRequest.validate()
    }

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val wireDrawdownRequestService = client.wireDrawdownRequests()

        val wireDrawdownRequest =
            wireDrawdownRequestService.retrieve("wire_drawdown_request_q6lmocus3glo0lr2bfv3")

        wireDrawdownRequest.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val wireDrawdownRequestService = client.wireDrawdownRequests()

        val wireDrawdownRequests =
            wireDrawdownRequestService.list(
                WireDrawdownRequestListParams.builder()
                    .cursor("cursor")
                    .idempotencyKey("x")
                    .limit(1L)
                    .status(
                        WireDrawdownRequestListParams.Status.builder()
                            .addIn(WireDrawdownRequestListParams.Status.In.PENDING_SUBMISSION)
                            .build()
                    )
                    .build()
            )

        wireDrawdownRequests.validate()
    }
}
