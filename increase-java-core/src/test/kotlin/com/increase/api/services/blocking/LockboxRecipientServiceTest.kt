// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.lockboxrecipients.LockboxRecipientCreateParams
import com.increase.api.models.lockboxrecipients.LockboxRecipientUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class LockboxRecipientServiceTest {

    @Test
    fun create() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val lockboxRecipientService = client.lockboxRecipients()

        val lockboxRecipient =
            lockboxRecipientService.create(
                LockboxRecipientCreateParams.builder()
                    .accountId("account_in71c4amph0vgo2qllky")
                    .lockboxAddressId("lockbox_address_lw6sbzl9ol5dfd8hdml6")
                    .description("x")
                    .recipientName("Ian Crease")
                    .build()
            )

        lockboxRecipient.validate()
    }

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val lockboxRecipientService = client.lockboxRecipients()

        val lockboxRecipient = lockboxRecipientService.retrieve("lockbox_3xt21ok13q19advds4t5")

        lockboxRecipient.validate()
    }

    @Test
    fun update() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val lockboxRecipientService = client.lockboxRecipients()

        val lockboxRecipient =
            lockboxRecipientService.update(
                LockboxRecipientUpdateParams.builder()
                    .lockboxRecipientId("lockbox_3xt21ok13q19advds4t5")
                    .description("x")
                    .recipientName("x")
                    .status(LockboxRecipientUpdateParams.Status.ACTIVE)
                    .build()
            )

        lockboxRecipient.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val lockboxRecipientService = client.lockboxRecipients()

        val page = lockboxRecipientService.list()

        page.response().validate()
    }
}
