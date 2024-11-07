// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.core.http.Headers
import com.increase.api.errors.IncreaseException
import com.increase.api.models.*
import java.time.Clock
import java.time.Instant
import java.time.ZoneOffset
import org.assertj.core.api.Assertions.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class WebhookServiceTest {

    @Test
    fun unwrapConfiguredSecret() {
        val client =
            IncreaseOkHttpClient.builder()
                .apiKey("test-api-key")
                .webhookSecret("whsec_zlFsbBZ8Xcodlpcu6NDTdSzZRLSdhkst")
                .clock(Clock.fixed(Instant.parse("2022-01-31T23:59:59Z"), ZoneOffset.UTC))
                .build()

        val payload = "{\"id\":\"event_123abc\",\"created_at\":\"2020-01-31T23:59:59Z\"}"
        val headers =
            Headers.builder()
                .put(
                    "Increase-Webhook-Signature",
                    "t=2022-01-31T23:59:59Z,v1=3f9c3dcc820ca3adfae8e196d05b09dfef63b91db5ce5ac1407090f2aa424a6f"
                )
                .build()

        val event = client.webhooks().unwrap(payload, headers, null)

        assertThat(event).isNotNull()
    }

    @Test
    fun unwrapPassedSecret() {
        val client =
            IncreaseOkHttpClient.builder()
                .apiKey("test-api-key")
                .clock(Clock.fixed(Instant.parse("2022-01-31T23:59:59Z"), ZoneOffset.UTC))
                .build()

        val payload = "{\"id\":\"event_123abc\",\"created_at\":\"2020-01-31T23:59:59Z\"}"
        val headers =
            Headers.builder()
                .put(
                    "Increase-Webhook-Signature",
                    "t=2022-01-31T23:59:59Z,v1=3f9c3dcc820ca3adfae8e196d05b09dfef63b91db5ce5ac1407090f2aa424a6f"
                )
                .build()

        val event =
            client.webhooks().unwrap(payload, headers, "whsec_zlFsbBZ8Xcodlpcu6NDTdSzZRLSdhkst")

        assertThat(event).isNotNull()
    }

    @Test
    fun noSecret() {
        val client =
            IncreaseOkHttpClient.builder()
                .apiKey("test-api-key")
                .clock(Clock.fixed(Instant.parse("2022-01-31T23:59:59Z"), ZoneOffset.UTC))
                .build()

        val payload = "{\"id\":\"event_123abc\",\"created_at\":\"2020-01-31T23:59:59Z\"}"
        val headers =
            Headers.builder()
                .put(
                    "Increase-Webhook-Signature",
                    "t=2022-01-31T23:59:59Z,v1=3f9c3dcc820ca3adfae8e196d05b09dfef63b91db5ce5ac1407090f2aa424a6f"
                )
                .build()

        val event = client.webhooks().unwrap(payload, headers, null)

        assertThat(event).isNotNull()
    }

    @Test
    fun verifySignature() {
        val client =
            IncreaseOkHttpClient.builder()
                .apiKey("test-api-key")
                .clock(Clock.fixed(Instant.parse("2022-01-31T23:59:59Z"), ZoneOffset.UTC))
                .build()

        val payload = "{\"id\":\"event_123abc\",\"created_at\":\"2020-01-31T23:59:59Z\"}"
        val webhookTimestamp = "2022-01-31T23:59:59Z"
        val webhookSignature = "bf127c54744439c2890b36028a8c734856776db3ed1e2632fc548e5f834a1f57"
        val headers =
            Headers.builder()
                .put("Increase-Webhook-Signature", "t=$webhookTimestamp,v1=$webhookSignature")
                .build()

        assertThatCode {
                client
                    .webhooks()
                    .verifySignature(payload, headers, "5WbX5kEWLlfzsGNjH64I8lOOqUB6e8FH")
            }
            .doesNotThrowAnyException()

        assertThatThrownBy { client.webhooks().verifySignature(payload, headers, "other") }
            .isInstanceOf(IncreaseException::class.java)
            .hasMessage("The given webhook signature does not match the expected signature")
    }
}
