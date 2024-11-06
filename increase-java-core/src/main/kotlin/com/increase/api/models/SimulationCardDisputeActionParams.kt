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
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.core.toImmutable
import com.increase.api.errors.IncreaseInvalidDataException
import com.increase.api.models.*
import java.util.Objects
import java.util.Optional

class SimulationCardDisputeActionParams
constructor(
    private val cardDisputeId: String,
    private val status: Status,
    private val explanation: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun cardDisputeId(): String = cardDisputeId

    fun status(): Status = status

    fun explanation(): Optional<String> = Optional.ofNullable(explanation)

    @JvmSynthetic
    internal fun getBody(): SimulationCardDisputeActionBody {
        return SimulationCardDisputeActionBody(
            status,
            explanation,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> cardDisputeId
            else -> ""
        }
    }

    @JsonDeserialize(builder = SimulationCardDisputeActionBody.Builder::class)
    @NoAutoDetect
    class SimulationCardDisputeActionBody
    internal constructor(
        private val status: Status?,
        private val explanation: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The status to move the dispute to. */
        @JsonProperty("status") fun status(): Status? = status

        /** Why the dispute was rejected. Not required for accepting disputes. */
        @JsonProperty("explanation") fun explanation(): String? = explanation

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var status: Status? = null
            private var explanation: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(simulationCardDisputeActionBody: SimulationCardDisputeActionBody) =
                apply {
                    this.status = simulationCardDisputeActionBody.status
                    this.explanation = simulationCardDisputeActionBody.explanation
                    additionalProperties(simulationCardDisputeActionBody.additionalProperties)
                }

            /** The status to move the dispute to. */
            @JsonProperty("status") fun status(status: Status) = apply { this.status = status }

            /** Why the dispute was rejected. Not required for accepting disputes. */
            @JsonProperty("explanation")
            fun explanation(explanation: String) = apply { this.explanation = explanation }

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

            fun build(): SimulationCardDisputeActionBody =
                SimulationCardDisputeActionBody(
                    checkNotNull(status) { "`status` is required but was not set" },
                    explanation,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is SimulationCardDisputeActionBody && this.status == other.status && this.explanation == other.explanation && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(status, explanation, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "SimulationCardDisputeActionBody{status=$status, explanation=$explanation, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SimulationCardDisputeActionParams && this.cardDisputeId == other.cardDisputeId && this.status == other.status && this.explanation == other.explanation && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(cardDisputeId, status, explanation, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "SimulationCardDisputeActionParams{cardDisputeId=$cardDisputeId, status=$status, explanation=$explanation, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var cardDisputeId: String? = null
        private var status: Status? = null
        private var explanation: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(simulationCardDisputeActionParams: SimulationCardDisputeActionParams) =
            apply {
                this.cardDisputeId = simulationCardDisputeActionParams.cardDisputeId
                this.status = simulationCardDisputeActionParams.status
                this.explanation = simulationCardDisputeActionParams.explanation
                additionalHeaders(simulationCardDisputeActionParams.additionalHeaders)
                additionalQueryParams(simulationCardDisputeActionParams.additionalQueryParams)
                additionalBodyProperties(simulationCardDisputeActionParams.additionalBodyProperties)
            }

        /** The dispute you would like to action. */
        fun cardDisputeId(cardDisputeId: String) = apply { this.cardDisputeId = cardDisputeId }

        /** The status to move the dispute to. */
        fun status(status: Status) = apply { this.status = status }

        /** Why the dispute was rejected. Not required for accepting disputes. */
        fun explanation(explanation: String) = apply { this.explanation = explanation }

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

        fun build(): SimulationCardDisputeActionParams =
            SimulationCardDisputeActionParams(
                checkNotNull(cardDisputeId) { "`cardDisputeId` is required but was not set" },
                checkNotNull(status) { "`status` is required but was not set" },
                explanation,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Status && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField
            val PENDING_USER_INFORMATION = Status(JsonField.of("pending_user_information"))

            @JvmField val ACCEPTED = Status(JsonField.of("accepted"))

            @JvmField val REJECTED = Status(JsonField.of("rejected"))

            @JvmField val LOST = Status(JsonField.of("lost"))

            @JvmField val WON = Status(JsonField.of("won"))

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            PENDING_USER_INFORMATION,
            ACCEPTED,
            REJECTED,
            LOST,
            WON,
        }

        enum class Value {
            PENDING_USER_INFORMATION,
            ACCEPTED,
            REJECTED,
            LOST,
            WON,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                PENDING_USER_INFORMATION -> Value.PENDING_USER_INFORMATION
                ACCEPTED -> Value.ACCEPTED
                REJECTED -> Value.REJECTED
                LOST -> Value.LOST
                WON -> Value.WON
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                PENDING_USER_INFORMATION -> Known.PENDING_USER_INFORMATION
                ACCEPTED -> Known.ACCEPTED
                REJECTED -> Known.REJECTED
                LOST -> Known.LOST
                WON -> Known.WON
                else -> throw IncreaseInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
