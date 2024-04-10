// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.increase.api.core.Enum
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.toUnmodifiable
import com.increase.api.errors.IncreaseInvalidDataException
import com.increase.api.models.*
import java.util.Objects
import java.util.Optional

class CheckTransferStopPaymentParams
constructor(
    private val checkTransferId: String,
    private val reason: Reason?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun checkTransferId(): String = checkTransferId

    fun reason(): Optional<Reason> = Optional.ofNullable(reason)

    @JvmSynthetic
    internal fun getBody(): CheckTransferStopPaymentBody {
        return CheckTransferStopPaymentBody(reason, additionalBodyProperties)
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> checkTransferId
            else -> ""
        }
    }

    @JsonDeserialize(builder = CheckTransferStopPaymentBody.Builder::class)
    @NoAutoDetect
    class CheckTransferStopPaymentBody
    internal constructor(
        private val reason: Reason?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** The reason why this transfer should be stopped. */
        @JsonProperty("reason") fun reason(): Reason? = reason

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CheckTransferStopPaymentBody &&
                this.reason == other.reason &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(reason, additionalProperties)
            }
            return hashCode
        }

        override fun toString() =
            "CheckTransferStopPaymentBody{reason=$reason, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var reason: Reason? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(checkTransferStopPaymentBody: CheckTransferStopPaymentBody) = apply {
                this.reason = checkTransferStopPaymentBody.reason
                additionalProperties(checkTransferStopPaymentBody.additionalProperties)
            }

            /** The reason why this transfer should be stopped. */
            @JsonProperty("reason") fun reason(reason: Reason) = apply { this.reason = reason }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): CheckTransferStopPaymentBody =
                CheckTransferStopPaymentBody(reason, additionalProperties.toUnmodifiable())
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CheckTransferStopPaymentParams &&
            this.checkTransferId == other.checkTransferId &&
            this.reason == other.reason &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            checkTransferId,
            reason,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "CheckTransferStopPaymentParams{checkTransferId=$checkTransferId, reason=$reason, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var checkTransferId: String? = null
        private var reason: Reason? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(checkTransferStopPaymentParams: CheckTransferStopPaymentParams) = apply {
            this.checkTransferId = checkTransferStopPaymentParams.checkTransferId
            this.reason = checkTransferStopPaymentParams.reason
            additionalQueryParams(checkTransferStopPaymentParams.additionalQueryParams)
            additionalHeaders(checkTransferStopPaymentParams.additionalHeaders)
            additionalBodyProperties(checkTransferStopPaymentParams.additionalBodyProperties)
        }

        /** The identifier of the Check Transfer. */
        fun checkTransferId(checkTransferId: String) = apply {
            this.checkTransferId = checkTransferId
        }

        /** The reason why this transfer should be stopped. */
        fun reason(reason: Reason) = apply { this.reason = reason }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): CheckTransferStopPaymentParams =
            CheckTransferStopPaymentParams(
                checkNotNull(checkTransferId) { "`checkTransferId` is required but was not set" },
                reason,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    class Reason
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Reason && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val MAIL_DELIVERY_FAILED = Reason(JsonField.of("mail_delivery_failed"))

            @JvmField val NOT_AUTHORIZED = Reason(JsonField.of("not_authorized"))

            @JvmField val UNKNOWN = Reason(JsonField.of("unknown"))

            @JvmStatic fun of(value: String) = Reason(JsonField.of(value))
        }

        enum class Known {
            MAIL_DELIVERY_FAILED,
            NOT_AUTHORIZED,
            UNKNOWN,
        }

        enum class Value {
            MAIL_DELIVERY_FAILED,
            NOT_AUTHORIZED,
            UNKNOWN,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                MAIL_DELIVERY_FAILED -> Value.MAIL_DELIVERY_FAILED
                NOT_AUTHORIZED -> Value.NOT_AUTHORIZED
                UNKNOWN -> Value.UNKNOWN
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                MAIL_DELIVERY_FAILED -> Known.MAIL_DELIVERY_FAILED
                NOT_AUTHORIZED -> Known.NOT_AUTHORIZED
                UNKNOWN -> Known.UNKNOWN
                else -> throw IncreaseInvalidDataException("Unknown Reason: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
