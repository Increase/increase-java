// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.fasterxml.jackson.core.JsonProcessingException
import com.google.common.io.BaseEncoding
import com.increase.api.core.ClientOptions
import com.increase.api.core.JsonValue
import com.increase.api.core.getRequiredHeader
import com.increase.api.core.handlers.errorHandler
import com.increase.api.core.http.Headers
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.errors.IncreaseError
import com.increase.api.errors.IncreaseException
import java.time.Instant
import javax.crypto.Mac
import javax.crypto.spec.SecretKeySpec
import kotlin.jvm.optionals.getOrNull

class WebhookServiceAsyncImpl constructor(private val clientOptions: ClientOptions) :
    WebhookServiceAsync {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    override fun unwrap(payload: String, headers: Headers, secret: String?): JsonValue {
        if (secret != null) {
            verifySignature(payload, headers, secret)
        }

        return try {
            clientOptions.jsonMapper.readValue(payload, JsonValue::class.java)
        } catch (e: JsonProcessingException) {
            throw IncreaseException("Invalid event payload", e)
        }
    }

    override fun verifySignature(payload: String, headers: Headers, secret: String?) {
        val webhookSecret =
            secret
                ?: clientOptions.webhookSecret().getOrNull()
                ?: throw IncreaseException(
                    "The webhook secret must either be set using the env var, INCREASE_WEBHOOK_SECRET, on the client class, or passed to this method"
                )

        val msgSignatureRaw = headers.getRequiredHeader("Increase-Webhook-Signature")
        val msgSignatureParts =
            msgSignatureRaw.split(",", "=").chunked(2) { it[0] to it[1] }.toMap()
        val msgTimestamp = msgSignatureParts["t"]
        val msgSignature = msgSignatureParts["v1"]

        try {
            Instant.parse(msgTimestamp)
        } catch (e: RuntimeException) {
            throw IncreaseException("Invalid signature headers", e)
        }

        val mac = Mac.getInstance("HmacSHA256")
        mac.init(SecretKeySpec(webhookSecret.toByteArray(), "HmacSHA256"))
        val expectedSignature = mac.doFinal("$msgTimestamp.$payload".toByteArray())
        val expectedSignatureStr = BaseEncoding.base16().lowerCase().encode(expectedSignature)

        if (msgSignature == expectedSignatureStr) {
            return
        }

        throw IncreaseException("The given webhook signature does not match the expected signature")
    }
}
