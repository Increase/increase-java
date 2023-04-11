package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.toUnmodifiable
import com.increase.api.errors.IncreaseInvalidDataException
import com.increase.api.models.*
import java.util.Objects
import java.util.Optional

class SimulationsCardDisputeActionParams
constructor(
    private val cardDisputeId: String,
    private val status: Status,
    private val explanation: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun cardDisputeId(): String = cardDisputeId

    fun status(): Status = status

    fun explanation(): Optional<String> = Optional.ofNullable(explanation)

    @JvmSynthetic
    internal fun getBody(): SimulationsCardDisputeActionBody {
        return SimulationsCardDisputeActionBody(
            status,
            explanation,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> cardDisputeId
            else -> ""
        }
    }

    @JsonDeserialize(builder = SimulationsCardDisputeActionBody.Builder::class)
    @NoAutoDetect
    class SimulationsCardDisputeActionBody
    internal constructor(
        private val status: Status?,
        private val explanation: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** The status to move the dispute to. */
        @JsonProperty("status") fun status(): Status? = status

        /** Why the dispute was rejected. Not required for accepting disputes. */
        @JsonProperty("explanation") fun explanation(): String? = explanation

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SimulationsCardDisputeActionBody &&
                this.status == other.status &&
                this.explanation == other.explanation &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        status,
                        explanation,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "SimulationsCardDisputeActionBody{status=$status, explanation=$explanation, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var status: Status? = null
            private var explanation: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(simulationsCardDisputeActionBody: SimulationsCardDisputeActionBody) =
                apply {
                    this.status = simulationsCardDisputeActionBody.status
                    this.explanation = simulationsCardDisputeActionBody.explanation
                    additionalProperties(simulationsCardDisputeActionBody.additionalProperties)
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

            fun build(): SimulationsCardDisputeActionBody =
                SimulationsCardDisputeActionBody(
                    checkNotNull(status) { "`status` is required but was not set" },
                    explanation,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SimulationsCardDisputeActionParams &&
            this.cardDisputeId == other.cardDisputeId &&
            this.status == other.status &&
            this.explanation == other.explanation &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            cardDisputeId,
            status,
            explanation,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "SimulationsCardDisputeActionParams{cardDisputeId=$cardDisputeId, status=$status, explanation=$explanation, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var cardDisputeId: String? = null
        private var status: Status? = null
        private var explanation: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(simulationsCardDisputeActionParams: SimulationsCardDisputeActionParams) =
            apply {
                this.cardDisputeId = simulationsCardDisputeActionParams.cardDisputeId
                this.status = simulationsCardDisputeActionParams.status
                this.explanation = simulationsCardDisputeActionParams.explanation
                additionalQueryParams(simulationsCardDisputeActionParams.additionalQueryParams)
                additionalHeaders(simulationsCardDisputeActionParams.additionalHeaders)
                additionalBodyProperties(
                    simulationsCardDisputeActionParams.additionalBodyProperties
                )
            }

        /** The dispute you would like to action. */
        fun cardDisputeId(cardDisputeId: String) = apply { this.cardDisputeId = cardDisputeId }

        /** The status to move the dispute to. */
        fun status(status: Status) = apply { this.status = status }

        /** Why the dispute was rejected. Not required for accepting disputes. */
        fun explanation(explanation: String) = apply { this.explanation = explanation }

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

        fun build(): SimulationsCardDisputeActionParams =
            SimulationsCardDisputeActionParams(
                checkNotNull(cardDisputeId) { "`cardDisputeId` is required but was not set" },
                checkNotNull(status) { "`status` is required but was not set" },
                explanation,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Status && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val ACCEPTED = Status(JsonField.of("accepted"))

            @JvmField val REJECTED = Status(JsonField.of("rejected"))

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            ACCEPTED,
            REJECTED,
        }

        enum class Value {
            ACCEPTED,
            REJECTED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ACCEPTED -> Value.ACCEPTED
                REJECTED -> Value.REJECTED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ACCEPTED -> Known.ACCEPTED
                REJECTED -> Known.REJECTED
                else -> throw IncreaseInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
