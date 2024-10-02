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

class InboundCheckDepositReturnParams
constructor(
    private val inboundCheckDepositId: String,
    private val reason: Reason,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun inboundCheckDepositId(): String = inboundCheckDepositId

    fun reason(): Reason = reason

    @JvmSynthetic
    internal fun getBody(): InboundCheckDepositReturnBody {
        return InboundCheckDepositReturnBody(reason, additionalBodyProperties)
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> inboundCheckDepositId
            else -> ""
        }
    }

    @JsonDeserialize(builder = InboundCheckDepositReturnBody.Builder::class)
    @NoAutoDetect
    class InboundCheckDepositReturnBody
    internal constructor(
        private val reason: Reason?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The reason to return the Inbound Check Deposit. */
        @JsonProperty("reason") fun reason(): Reason? = reason

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var reason: Reason? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(inboundCheckDepositReturnBody: InboundCheckDepositReturnBody) =
                apply {
                    this.reason = inboundCheckDepositReturnBody.reason
                    additionalProperties(inboundCheckDepositReturnBody.additionalProperties)
                }

            /** The reason to return the Inbound Check Deposit. */
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

            fun build(): InboundCheckDepositReturnBody =
                InboundCheckDepositReturnBody(
                    checkNotNull(reason) { "`reason` is required but was not set" },
                    additionalProperties.toUnmodifiable()
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is InboundCheckDepositReturnBody &&
                this.reason == other.reason &&
                this.additionalProperties == other.additionalProperties
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(reason, additionalProperties)
            }
            return hashCode
        }

        override fun toString() =
            "InboundCheckDepositReturnBody{reason=$reason, additionalProperties=$additionalProperties}"
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InboundCheckDepositReturnParams &&
            this.inboundCheckDepositId == other.inboundCheckDepositId &&
            this.reason == other.reason &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            inboundCheckDepositId,
            reason,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "InboundCheckDepositReturnParams{inboundCheckDepositId=$inboundCheckDepositId, reason=$reason, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var inboundCheckDepositId: String? = null
        private var reason: Reason? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(inboundCheckDepositReturnParams: InboundCheckDepositReturnParams) =
            apply {
                this.inboundCheckDepositId = inboundCheckDepositReturnParams.inboundCheckDepositId
                this.reason = inboundCheckDepositReturnParams.reason
                additionalQueryParams(inboundCheckDepositReturnParams.additionalQueryParams)
                additionalHeaders(inboundCheckDepositReturnParams.additionalHeaders)
                additionalBodyProperties(inboundCheckDepositReturnParams.additionalBodyProperties)
            }

        /** The identifier of the Inbound Check Deposit to return. */
        fun inboundCheckDepositId(inboundCheckDepositId: String) = apply {
            this.inboundCheckDepositId = inboundCheckDepositId
        }

        /** The reason to return the Inbound Check Deposit. */
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

        fun build(): InboundCheckDepositReturnParams =
            InboundCheckDepositReturnParams(
                checkNotNull(inboundCheckDepositId) {
                    "`inboundCheckDepositId` is required but was not set"
                },
                checkNotNull(reason) { "`reason` is required but was not set" },
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

            @JvmField val ALTERED_OR_FICTITIOUS = Reason(JsonField.of("altered_or_fictitious"))

            @JvmField val NOT_AUTHORIZED = Reason(JsonField.of("not_authorized"))

            @JvmField val DUPLICATE_PRESENTMENT = Reason(JsonField.of("duplicate_presentment"))

            @JvmField val ENDORSEMENT_MISSING = Reason(JsonField.of("endorsement_missing"))

            @JvmField val ENDORSEMENT_IRREGULAR = Reason(JsonField.of("endorsement_irregular"))

            @JvmStatic fun of(value: String) = Reason(JsonField.of(value))
        }

        enum class Known {
            ALTERED_OR_FICTITIOUS,
            NOT_AUTHORIZED,
            DUPLICATE_PRESENTMENT,
            ENDORSEMENT_MISSING,
            ENDORSEMENT_IRREGULAR,
        }

        enum class Value {
            ALTERED_OR_FICTITIOUS,
            NOT_AUTHORIZED,
            DUPLICATE_PRESENTMENT,
            ENDORSEMENT_MISSING,
            ENDORSEMENT_IRREGULAR,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ALTERED_OR_FICTITIOUS -> Value.ALTERED_OR_FICTITIOUS
                NOT_AUTHORIZED -> Value.NOT_AUTHORIZED
                DUPLICATE_PRESENTMENT -> Value.DUPLICATE_PRESENTMENT
                ENDORSEMENT_MISSING -> Value.ENDORSEMENT_MISSING
                ENDORSEMENT_IRREGULAR -> Value.ENDORSEMENT_IRREGULAR
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ALTERED_OR_FICTITIOUS -> Known.ALTERED_OR_FICTITIOUS
                NOT_AUTHORIZED -> Known.NOT_AUTHORIZED
                DUPLICATE_PRESENTMENT -> Known.DUPLICATE_PRESENTMENT
                ENDORSEMENT_MISSING -> Known.ENDORSEMENT_MISSING
                ENDORSEMENT_IRREGULAR -> Known.ENDORSEMENT_IRREGULAR
                else -> throw IncreaseInvalidDataException("Unknown Reason: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
