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

class SimulationCardSettlementParams
constructor(
    private val cardId: String,
    private val pendingTransactionId: String,
    private val amount: Long?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun cardId(): String = cardId

    fun pendingTransactionId(): String = pendingTransactionId

    fun amount(): Optional<Long> = Optional.ofNullable(amount)

    @JvmSynthetic
    internal fun getBody(): SimulationCardSettlementBody {
        return SimulationCardSettlementBody(
            cardId,
            pendingTransactionId,
            amount,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = SimulationCardSettlementBody.Builder::class)
    @NoAutoDetect
    class SimulationCardSettlementBody
    internal constructor(
        private val cardId: String?,
        private val pendingTransactionId: String?,
        private val amount: Long?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** The identifier of the Card to create a settlement on. */
        @JsonProperty("card_id") fun cardId(): String? = cardId

        /**
         * The identifier of the Pending Transaction for the Card Authorization you wish to settle.
         */
        @JsonProperty("pending_transaction_id")
        fun pendingTransactionId(): String? = pendingTransactionId

        /**
         * The amount to be settled. This defaults to the amount of the Pending Transaction being
         * settled.
         */
        @JsonProperty("amount") fun amount(): Long? = amount

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SimulationCardSettlementBody &&
                this.cardId == other.cardId &&
                this.pendingTransactionId == other.pendingTransactionId &&
                this.amount == other.amount &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        cardId,
                        pendingTransactionId,
                        amount,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "SimulationCardSettlementBody{cardId=$cardId, pendingTransactionId=$pendingTransactionId, amount=$amount, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var cardId: String? = null
            private var pendingTransactionId: String? = null
            private var amount: Long? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(simulationCardSettlementBody: SimulationCardSettlementBody) = apply {
                this.cardId = simulationCardSettlementBody.cardId
                this.pendingTransactionId = simulationCardSettlementBody.pendingTransactionId
                this.amount = simulationCardSettlementBody.amount
                additionalProperties(simulationCardSettlementBody.additionalProperties)
            }

            /** The identifier of the Card to create a settlement on. */
            @JsonProperty("card_id") fun cardId(cardId: String) = apply { this.cardId = cardId }

            /**
             * The identifier of the Pending Transaction for the Card Authorization you wish to
             * settle.
             */
            @JsonProperty("pending_transaction_id")
            fun pendingTransactionId(pendingTransactionId: String) = apply {
                this.pendingTransactionId = pendingTransactionId
            }

            /**
             * The amount to be settled. This defaults to the amount of the Pending Transaction
             * being settled.
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

            fun build(): SimulationCardSettlementBody =
                SimulationCardSettlementBody(
                    checkNotNull(cardId) { "`cardId` is required but was not set" },
                    checkNotNull(pendingTransactionId) {
                        "`pendingTransactionId` is required but was not set"
                    },
                    amount,
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

        return other is SimulationCardSettlementParams &&
            this.cardId == other.cardId &&
            this.pendingTransactionId == other.pendingTransactionId &&
            this.amount == other.amount &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            cardId,
            pendingTransactionId,
            amount,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "SimulationCardSettlementParams{cardId=$cardId, pendingTransactionId=$pendingTransactionId, amount=$amount, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var cardId: String? = null
        private var pendingTransactionId: String? = null
        private var amount: Long? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(simulationCardSettlementParams: SimulationCardSettlementParams) = apply {
            this.cardId = simulationCardSettlementParams.cardId
            this.pendingTransactionId = simulationCardSettlementParams.pendingTransactionId
            this.amount = simulationCardSettlementParams.amount
            additionalQueryParams(simulationCardSettlementParams.additionalQueryParams)
            additionalHeaders(simulationCardSettlementParams.additionalHeaders)
            additionalBodyProperties(simulationCardSettlementParams.additionalBodyProperties)
        }

        /** The identifier of the Card to create a settlement on. */
        fun cardId(cardId: String) = apply { this.cardId = cardId }

        /**
         * The identifier of the Pending Transaction for the Card Authorization you wish to settle.
         */
        fun pendingTransactionId(pendingTransactionId: String) = apply {
            this.pendingTransactionId = pendingTransactionId
        }

        /**
         * The amount to be settled. This defaults to the amount of the Pending Transaction being
         * settled.
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

        fun build(): SimulationCardSettlementParams =
            SimulationCardSettlementParams(
                checkNotNull(cardId) { "`cardId` is required but was not set" },
                checkNotNull(pendingTransactionId) {
                    "`pendingTransactionId` is required but was not set"
                },
                amount,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }
}
