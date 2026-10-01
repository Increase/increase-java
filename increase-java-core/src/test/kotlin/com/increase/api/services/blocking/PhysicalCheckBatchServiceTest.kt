// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.physicalcheckbatches.PhysicalCheckBatchCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PhysicalCheckBatchServiceTest {

    @Test
    fun create() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val physicalCheckBatchService = client.physicalCheckBatches()

        val physicalCheckBatch =
            physicalCheckBatchService.create(
                PhysicalCheckBatchCreateParams.builder()
                    .mailingAddress(
                        PhysicalCheckBatchCreateParams.MailingAddress.builder()
                            .city("New York")
                            .line1("33 Liberty Street")
                            .name("Ian Crease")
                            .postalCode("10045")
                            .state("NY")
                            .line2("line2")
                            .phone("x")
                            .build()
                    )
                    .returnAddress(
                        PhysicalCheckBatchCreateParams.ReturnAddress.builder()
                            .city("New York")
                            .line1("33 Liberty Street")
                            .name("National Phonograph Company")
                            .postalCode("10045")
                            .state("NY")
                            .line2("line2")
                            .phone("x")
                            .build()
                    )
                    .shippingMethod(PhysicalCheckBatchCreateParams.ShippingMethod.USPS_FIRST_CLASS)
                    .build()
            )

        physicalCheckBatch.validate()
    }

    @Test
    fun cancel() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val physicalCheckBatchService = client.physicalCheckBatches()

        val physicalCheckBatch =
            physicalCheckBatchService.cancel("physical_check_batch_yzdwjhdbw0in6191whce")

        physicalCheckBatch.validate()
    }

    @Test
    fun complete() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val physicalCheckBatchService = client.physicalCheckBatches()

        val physicalCheckBatch =
            physicalCheckBatchService.complete("physical_check_batch_yzdwjhdbw0in6191whce")

        physicalCheckBatch.validate()
    }
}
