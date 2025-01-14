// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.increase.api.core.Enum
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.checkRequired
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.core.immutableEmptyMap
import com.increase.api.core.toImmutable
import com.increase.api.errors.IncreaseInvalidDataException
import java.util.Objects

/** Return an Inbound Check Deposit */
class InboundCheckDepositReturnParams
constructor(
    private val inboundCheckDepositId: String,
    private val body: InboundCheckDepositReturnBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    /** The identifier of the Inbound Check Deposit to return. */
    fun inboundCheckDepositId(): String = inboundCheckDepositId

    /** The reason to return the Inbound Check Deposit. */
    fun reason(): Reason = body.reason()

    /** The reason to return the Inbound Check Deposit. */
    fun _reason(): JsonField<Reason> = body._reason()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun getBody(): InboundCheckDepositReturnBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> inboundCheckDepositId
            else -> ""
        }
    }

    @NoAutoDetect
    class InboundCheckDepositReturnBody
    @JsonCreator
    internal constructor(
        @JsonProperty("reason")
        @ExcludeMissing
        private val reason: JsonField<Reason> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The reason to return the Inbound Check Deposit. */
        fun reason(): Reason = reason.getRequired("reason")

        /** The reason to return the Inbound Check Deposit. */
        @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<Reason> = reason

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): InboundCheckDepositReturnBody = apply {
            if (validated) {
                return@apply
            }

            reason()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var reason: JsonField<Reason>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(inboundCheckDepositReturnBody: InboundCheckDepositReturnBody) =
                apply {
                    reason = inboundCheckDepositReturnBody.reason
                    additionalProperties =
                        inboundCheckDepositReturnBody.additionalProperties.toMutableMap()
                }

            /** The reason to return the Inbound Check Deposit. */
            fun reason(reason: Reason) = reason(JsonField.of(reason))

            /** The reason to return the Inbound Check Deposit. */
            fun reason(reason: JsonField<Reason>) = apply { this.reason = reason }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            fun build(): InboundCheckDepositReturnBody =
                InboundCheckDepositReturnBody(
                    checkRequired("reason", reason),
                    additionalProperties.toImmutable()
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is InboundCheckDepositReturnBody && reason == other.reason && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(reason, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "InboundCheckDepositReturnBody{reason=$reason, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var inboundCheckDepositId: String? = null
        private var body: InboundCheckDepositReturnBody.Builder =
            InboundCheckDepositReturnBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(inboundCheckDepositReturnParams: InboundCheckDepositReturnParams) =
            apply {
                inboundCheckDepositId = inboundCheckDepositReturnParams.inboundCheckDepositId
                body = inboundCheckDepositReturnParams.body.toBuilder()
                additionalHeaders = inboundCheckDepositReturnParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    inboundCheckDepositReturnParams.additionalQueryParams.toBuilder()
            }

        /** The identifier of the Inbound Check Deposit to return. */
        fun inboundCheckDepositId(inboundCheckDepositId: String) = apply {
            this.inboundCheckDepositId = inboundCheckDepositId
        }

        /** The reason to return the Inbound Check Deposit. */
        fun reason(reason: Reason) = apply { body.reason(reason) }

        /** The reason to return the Inbound Check Deposit. */
        fun reason(reason: JsonField<Reason>) = apply { body.reason(reason) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        fun build(): InboundCheckDepositReturnParams =
            InboundCheckDepositReturnParams(
                checkRequired("inboundCheckDepositId", inboundCheckDepositId),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    class Reason
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val ALTERED_OR_FICTITIOUS = of("altered_or_fictitious")

            @JvmField val NOT_AUTHORIZED = of("not_authorized")

            @JvmField val DUPLICATE_PRESENTMENT = of("duplicate_presentment")

            @JvmField val ENDORSEMENT_MISSING = of("endorsement_missing")

            @JvmField val ENDORSEMENT_IRREGULAR = of("endorsement_irregular")

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Reason && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InboundCheckDepositReturnParams && inboundCheckDepositId == other.inboundCheckDepositId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(inboundCheckDepositId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "InboundCheckDepositReturnParams{inboundCheckDepositId=$inboundCheckDepositId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
