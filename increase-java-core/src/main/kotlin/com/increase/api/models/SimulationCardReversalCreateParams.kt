// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.toUnmodifiable
import com.increase.api.models.*
import java.util.Objects
import java.util.Optional

class SimulationCardReversalCreateParams
constructor(
    private val cardPaymentId: String,
    private val amount: Long?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun cardPaymentId(): String = cardPaymentId

    fun amount(): Optional<Long> = Optional.ofNullable(amount)

    @JvmSynthetic
    internal fun getBody(): SimulationCardReversalCreateBody {
        return SimulationCardReversalCreateBody(
            cardPaymentId,
            amount,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = SimulationCardReversalCreateBody.Builder::class)
    @NoAutoDetect
    class SimulationCardReversalCreateBody
    internal constructor(
        private val cardPaymentId: String?,
        private val amount: Long?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The identifier of the Card Payment to create a reversal on. */
        @JsonProperty("card_payment_id") fun cardPaymentId(): String? = cardPaymentId

        /**
         * The amount of the reversal in minor units in the card authorization's currency. This
         * defaults to the authorization amount.
         */
        @JsonProperty("amount") fun amount(): Long? = amount

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var cardPaymentId: String? = null
            private var amount: Long? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(simulationCardReversalCreateBody: SimulationCardReversalCreateBody) =
                apply {
                    this.cardPaymentId = simulationCardReversalCreateBody.cardPaymentId
                    this.amount = simulationCardReversalCreateBody.amount
                    additionalProperties(simulationCardReversalCreateBody.additionalProperties)
                }

            /** The identifier of the Card Payment to create a reversal on. */
            @JsonProperty("card_payment_id")
            fun cardPaymentId(cardPaymentId: String) = apply { this.cardPaymentId = cardPaymentId }

            /**
             * The amount of the reversal in minor units in the card authorization's currency. This
             * defaults to the authorization amount.
             */
            @JsonProperty("amount") fun amount(amount: Long) = apply { this.amount = amount }

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

            fun build(): SimulationCardReversalCreateBody =
                SimulationCardReversalCreateBody(
                    checkNotNull(cardPaymentId) { "`cardPaymentId` is required but was not set" },
                    amount,
                    additionalProperties.toUnmodifiable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is SimulationCardReversalCreateBody && this.cardPaymentId == other.cardPaymentId && this.amount == other.amount && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(cardPaymentId, amount, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "SimulationCardReversalCreateBody{cardPaymentId=$cardPaymentId, amount=$amount, additionalProperties=$additionalProperties}"
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SimulationCardReversalCreateParams && this.cardPaymentId == other.cardPaymentId && this.amount == other.amount && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(cardPaymentId, amount, additionalQueryParams, additionalHeaders, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "SimulationCardReversalCreateParams{cardPaymentId=$cardPaymentId, amount=$amount, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var cardPaymentId: String? = null
        private var amount: Long? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(simulationCardReversalCreateParams: SimulationCardReversalCreateParams) =
            apply {
                this.cardPaymentId = simulationCardReversalCreateParams.cardPaymentId
                this.amount = simulationCardReversalCreateParams.amount
                additionalQueryParams(simulationCardReversalCreateParams.additionalQueryParams)
                additionalHeaders(simulationCardReversalCreateParams.additionalHeaders)
                additionalBodyProperties(
                    simulationCardReversalCreateParams.additionalBodyProperties
                )
            }

        /** The identifier of the Card Payment to create a reversal on. */
        fun cardPaymentId(cardPaymentId: String) = apply { this.cardPaymentId = cardPaymentId }

        /**
         * The amount of the reversal in minor units in the card authorization's currency. This
         * defaults to the authorization amount.
         */
        fun amount(amount: Long) = apply { this.amount = amount }

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

        fun build(): SimulationCardReversalCreateParams =
            SimulationCardReversalCreateParams(
                checkNotNull(cardPaymentId) { "`cardPaymentId` is required but was not set" },
                amount,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }
}
