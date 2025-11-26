// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.lockboxes.LockboxCreateParams
import com.increase.api.models.lockboxes.LockboxListParams
import com.increase.api.models.lockboxes.LockboxUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class LockboxServiceTest {

    @Test
    fun create() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val lockboxService = client.lockboxes()

        val lockbox =
            lockboxService.create(
                LockboxCreateParams.builder()
                    .accountId("account_in71c4amph0vgo2qllky")
                    .description("Rent payments")
                    .recipientName("x")
                    .build()
            )

        lockbox.validate()
    }

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val lockboxService = client.lockboxes()

        val lockbox = lockboxService.retrieve("lockbox_3xt21ok13q19advds4t5")

        lockbox.validate()
    }

    @Test
    fun update() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val lockboxService = client.lockboxes()

        val lockbox =
            lockboxService.update(
                LockboxUpdateParams.builder()
                    .lockboxId("lockbox_3xt21ok13q19advds4t5")
                    .checkDepositBehavior(LockboxUpdateParams.CheckDepositBehavior.DISABLED)
                    .description("x")
                    .recipientName("x")
                    .build()
            )

        lockbox.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val lockboxService = client.lockboxes()

        val lockboxes =
            lockboxService.list(
                LockboxListParams.builder()
                    .accountId("account_id")
                    .createdAt(
                        LockboxListParams.CreatedAt.builder()
                            .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .cursor("cursor")
                    .idempotencyKey("x")
                    .limit(1L)
                    .build()
            )

        lockboxes.validate()
    }
}
