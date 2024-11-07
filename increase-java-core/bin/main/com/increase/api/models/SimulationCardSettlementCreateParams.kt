// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.core.toImmutable
import com.increase.api.models.*
import java.util.Objects
import java.util.Optional

class SimulationCardSettlementCreateParams
constructor(
    private val cardId: String,
    private val pendingTransactionId: String,
    private val amount: Long?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun cardId(): String = cardId

    fun pendingTransactionId(): String = pendingTransactionId

    fun amount(): Optional<Long> = Optional.ofNullable(amount)

    @JvmSynthetic
    internal fun getBody(): SimulationCardSettlementCreateBody {
        return SimulationCardSettlementCreateBody(
            cardId,
            pendingTransactionId,
            amount,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @JsonDeserialize(builder = SimulationCardSettlementCreateBody.Builder::class)
    @NoAutoDetect
    class SimulationCardSettlementCreateBody
    internal constructor(
        private val cardId: String?,
        private val pendingTransactionId: String?,
        private val amount: Long?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

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

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var cardId: String? = null
            private var pendingTransactionId: String? = null
            private var amount: Long? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                simulationCardSettlementCreateBody: SimulationCardSettlementCreateBody
            ) = apply {
                this.cardId = simulationCardSettlementCreateBody.cardId
                this.pendingTransactionId = simulationCardSettlementCreateBody.pendingTransactionId
                this.amount = simulationCardSettlementCreateBody.amount
                additionalProperties(simulationCardSettlementCreateBody.additionalProperties)
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

            fun build(): SimulationCardSettlementCreateBody =
                SimulationCardSettlementCreateBody(
                    checkNotNull(cardId) { "`cardId` is required but was not set" },
                    checkNotNull(pendingTransactionId) {
                        "`pendingTransactionId` is required but was not set"
                    },
                    amount,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is SimulationCardSettlementCreateBody && this.cardId == other.cardId && this.pendingTransactionId == other.pendingTransactionId && this.amount == other.amount && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(cardId, pendingTransactionId, amount, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "SimulationCardSettlementCreateBody{cardId=$cardId, pendingTransactionId=$pendingTransactionId, amount=$amount, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SimulationCardSettlementCreateParams && this.cardId == other.cardId && this.pendingTransactionId == other.pendingTransactionId && this.amount == other.amount && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(cardId, pendingTransactionId, amount, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "SimulationCardSettlementCreateParams{cardId=$cardId, pendingTransactionId=$pendingTransactionId, amount=$amount, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var cardId: String? = null
        private var pendingTransactionId: String? = null
        private var amount: Long? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            simulationCardSettlementCreateParams: SimulationCardSettlementCreateParams
        ) = apply {
            this.cardId = simulationCardSettlementCreateParams.cardId
            this.pendingTransactionId = simulationCardSettlementCreateParams.pendingTransactionId
            this.amount = simulationCardSettlementCreateParams.amount
            additionalHeaders(simulationCardSettlementCreateParams.additionalHeaders)
            additionalQueryParams(simulationCardSettlementCreateParams.additionalQueryParams)
            additionalBodyProperties(simulationCardSettlementCreateParams.additionalBodyProperties)
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

        fun build(): SimulationCardSettlementCreateParams =
            SimulationCardSettlementCreateParams(
                checkNotNull(cardId) { "`cardId` is required but was not set" },
                checkNotNull(pendingTransactionId) {
                    "`pendingTransactionId` is required but was not set"
                },
                amount,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }
}
