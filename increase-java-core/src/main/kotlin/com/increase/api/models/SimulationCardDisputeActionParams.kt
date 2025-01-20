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
import java.util.Optional

/**
 * After a [Card Dispute](#card-disputes) is created in production, the dispute will be reviewed.
 * Since no review happens in sandbox, this endpoint simulates moving a Card Dispute into a rejected
 * or accepted state. A Card Dispute can only be actioned one time and must have a status of
 * `pending_reviewing`.
 */
class SimulationCardDisputeActionParams
constructor(
    private val cardDisputeId: String,
    private val body: SimulationCardDisputeActionBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    /** The dispute you would like to action. */
    fun cardDisputeId(): String = cardDisputeId

    /** The status to move the dispute to. */
    fun status(): Status = body.status()

    /** Why the dispute was rejected. Not required for accepting disputes. */
    fun explanation(): Optional<String> = body.explanation()

    /** The status to move the dispute to. */
    fun _status(): JsonField<Status> = body._status()

    /** Why the dispute was rejected. Not required for accepting disputes. */
    fun _explanation(): JsonField<String> = body._explanation()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun getBody(): SimulationCardDisputeActionBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> cardDisputeId
            else -> ""
        }
    }

    @NoAutoDetect
    class SimulationCardDisputeActionBody
    @JsonCreator
    internal constructor(
        @JsonProperty("status")
        @ExcludeMissing
        private val status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("explanation")
        @ExcludeMissing
        private val explanation: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The status to move the dispute to. */
        fun status(): Status = status.getRequired("status")

        /** Why the dispute was rejected. Not required for accepting disputes. */
        fun explanation(): Optional<String> =
            Optional.ofNullable(explanation.getNullable("explanation"))

        /** The status to move the dispute to. */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

        /** Why the dispute was rejected. Not required for accepting disputes. */
        @JsonProperty("explanation")
        @ExcludeMissing
        fun _explanation(): JsonField<String> = explanation

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): SimulationCardDisputeActionBody = apply {
            if (validated) {
                return@apply
            }

            status()
            explanation()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var status: JsonField<Status>? = null
            private var explanation: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(simulationCardDisputeActionBody: SimulationCardDisputeActionBody) =
                apply {
                    status = simulationCardDisputeActionBody.status
                    explanation = simulationCardDisputeActionBody.explanation
                    additionalProperties =
                        simulationCardDisputeActionBody.additionalProperties.toMutableMap()
                }

            /** The status to move the dispute to. */
            fun status(status: Status) = status(JsonField.of(status))

            /** The status to move the dispute to. */
            fun status(status: JsonField<Status>) = apply { this.status = status }

            /** Why the dispute was rejected. Not required for accepting disputes. */
            fun explanation(explanation: String) = explanation(JsonField.of(explanation))

            /** Why the dispute was rejected. Not required for accepting disputes. */
            fun explanation(explanation: JsonField<String>) = apply {
                this.explanation = explanation
            }

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

            fun build(): SimulationCardDisputeActionBody =
                SimulationCardDisputeActionBody(
                    checkRequired("status", status),
                    explanation,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is SimulationCardDisputeActionBody && status == other.status && explanation == other.explanation && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(status, explanation, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SimulationCardDisputeActionBody{status=$status, explanation=$explanation, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var cardDisputeId: String? = null
        private var body: SimulationCardDisputeActionBody.Builder =
            SimulationCardDisputeActionBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(simulationCardDisputeActionParams: SimulationCardDisputeActionParams) =
            apply {
                cardDisputeId = simulationCardDisputeActionParams.cardDisputeId
                body = simulationCardDisputeActionParams.body.toBuilder()
                additionalHeaders = simulationCardDisputeActionParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    simulationCardDisputeActionParams.additionalQueryParams.toBuilder()
            }

        /** The dispute you would like to action. */
        fun cardDisputeId(cardDisputeId: String) = apply { this.cardDisputeId = cardDisputeId }

        /** The status to move the dispute to. */
        fun status(status: Status) = apply { body.status(status) }

        /** The status to move the dispute to. */
        fun status(status: JsonField<Status>) = apply { body.status(status) }

        /** Why the dispute was rejected. Not required for accepting disputes. */
        fun explanation(explanation: String) = apply { body.explanation(explanation) }

        /** Why the dispute was rejected. Not required for accepting disputes. */
        fun explanation(explanation: JsonField<String>) = apply { body.explanation(explanation) }

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

        fun build(): SimulationCardDisputeActionParams =
            SimulationCardDisputeActionParams(
                checkRequired("cardDisputeId", cardDisputeId),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    /** The status to move the dispute to. */
    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            /** Increase has requested more information related to the Card Dispute from you. */
            @JvmField val PENDING_USER_INFORMATION = of("pending_user_information")

            /**
             * The Card Dispute has been accepted and your funds have been returned. The card
             * dispute will eventually transition into `won` or `lost` depending on the outcome.
             */
            @JvmField val ACCEPTED = of("accepted")

            /** The Card Dispute has been rejected. */
            @JvmField val REJECTED = of("rejected")

            /**
             * The Card Dispute has been lost and funds previously credited from the acceptance have
             * been debited.
             */
            @JvmField val LOST = of("lost")

            /** The Card Dispute has been won and no further action can be taken. */
            @JvmField val WON = of("won")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            /** Increase has requested more information related to the Card Dispute from you. */
            PENDING_USER_INFORMATION,
            /**
             * The Card Dispute has been accepted and your funds have been returned. The card
             * dispute will eventually transition into `won` or `lost` depending on the outcome.
             */
            ACCEPTED,
            /** The Card Dispute has been rejected. */
            REJECTED,
            /**
             * The Card Dispute has been lost and funds previously credited from the acceptance have
             * been debited.
             */
            LOST,
            /** The Card Dispute has been won and no further action can be taken. */
            WON,
        }

        enum class Value {
            /** Increase has requested more information related to the Card Dispute from you. */
            PENDING_USER_INFORMATION,
            /**
             * The Card Dispute has been accepted and your funds have been returned. The card
             * dispute will eventually transition into `won` or `lost` depending on the outcome.
             */
            ACCEPTED,
            /** The Card Dispute has been rejected. */
            REJECTED,
            /**
             * The Card Dispute has been lost and funds previously credited from the acceptance have
             * been debited.
             */
            LOST,
            /** The Card Dispute has been won and no further action can be taken. */
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SimulationCardDisputeActionParams && cardDisputeId == other.cardDisputeId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(cardDisputeId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "SimulationCardDisputeActionParams{cardDisputeId=$cardDisputeId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
