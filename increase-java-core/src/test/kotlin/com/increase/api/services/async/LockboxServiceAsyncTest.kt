// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.lockboxes.LockboxCreateParams
import com.increase.api.models.lockboxes.LockboxListParams
import com.increase.api.models.lockboxes.LockboxUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class LockboxServiceAsyncTest {

    @Test
    fun create() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val lockboxServiceAsync = client.lockboxes()

        val lockboxFuture =
            lockboxServiceAsync.create(
                LockboxCreateParams.builder()
                    .accountId("account_in71c4amph0vgo2qllky")
                    .description("Rent payments")
                    .recipientName("x")
                    .build()
            )

        val lockbox = lockboxFuture.get()
        lockbox.validate()
    }

    @Test
    fun retrieve() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val lockboxServiceAsync = client.lockboxes()

        val lockboxFuture = lockboxServiceAsync.retrieve("lockbox_3xt21ok13q19advds4t5")

        val lockbox = lockboxFuture.get()
        lockbox.validate()
    }

    @Test
    fun update() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val lockboxServiceAsync = client.lockboxes()

        val lockboxFuture =
            lockboxServiceAsync.update(
                LockboxUpdateParams.builder()
                    .lockboxId("lockbox_3xt21ok13q19advds4t5")
                    .checkDepositBehavior(LockboxUpdateParams.CheckDepositBehavior.DISABLED)
                    .description("x")
                    .recipientName("x")
                    .build()
            )

        val lockbox = lockboxFuture.get()
        lockbox.validate()
    }

    @Test
    fun list() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val lockboxServiceAsync = client.lockboxes()

        val lockboxesFuture =
            lockboxServiceAsync.list(
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

        val lockboxes = lockboxesFuture.get()
        lockboxes.validate()
    }
}
