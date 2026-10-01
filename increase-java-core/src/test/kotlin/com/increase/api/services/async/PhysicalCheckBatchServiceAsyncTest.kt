// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.physicalcheckbatches.PhysicalCheckBatchCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PhysicalCheckBatchServiceAsyncTest {

    @Test
    fun create() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val physicalCheckBatchServiceAsync = client.physicalCheckBatches()

        val physicalCheckBatchFuture =
            physicalCheckBatchServiceAsync.create(
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

        val physicalCheckBatch = physicalCheckBatchFuture.get()
        physicalCheckBatch.validate()
    }

    @Test
    fun cancel() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val physicalCheckBatchServiceAsync = client.physicalCheckBatches()

        val physicalCheckBatchFuture =
            physicalCheckBatchServiceAsync.cancel("physical_check_batch_yzdwjhdbw0in6191whce")

        val physicalCheckBatch = physicalCheckBatchFuture.get()
        physicalCheckBatch.validate()
    }

    @Test
    fun complete() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val physicalCheckBatchServiceAsync = client.physicalCheckBatches()

        val physicalCheckBatchFuture =
            physicalCheckBatchServiceAsync.complete("physical_check_batch_yzdwjhdbw0in6191whce")

        val physicalCheckBatch = physicalCheckBatchFuture.get()
        physicalCheckBatch.validate()
    }
}
