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

class CardDisputeCreateParams
constructor(
    private val disputedTransactionId: String,
    private val explanation: String,
    private val amount: Long?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun disputedTransactionId(): String = disputedTransactionId

    fun explanation(): String = explanation

    fun amount(): Optional<Long> = Optional.ofNullable(amount)

    @JvmSynthetic
    internal fun getBody(): CardDisputeCreateBody {
        return CardDisputeCreateBody(
            disputedTransactionId,
            explanation,
            amount,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = CardDisputeCreateBody.Builder::class)
    @NoAutoDetect
    class CardDisputeCreateBody
    internal constructor(
        private val disputedTransactionId: String?,
        private val explanation: String?,
        private val amount: Long?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /**
         * The Transaction you wish to dispute. This Transaction must have a `source_type` of
         * `card_settlement`.
         */
        @JsonProperty("disputed_transaction_id")
        fun disputedTransactionId(): String? = disputedTransactionId

        /** Why you are disputing this Transaction. */
        @JsonProperty("explanation") fun explanation(): String? = explanation

        /**
         * The monetary amount of the part of the transaction that is being disputed. This is
         * optional and will default to the full amount of the transaction if not provided. If
         * provided, the amount must be less than or equal to the amount of the transaction.
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

            private var disputedTransactionId: String? = null
            private var explanation: String? = null
            private var amount: Long? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(cardDisputeCreateBody: CardDisputeCreateBody) = apply {
                this.disputedTransactionId = cardDisputeCreateBody.disputedTransactionId
                this.explanation = cardDisputeCreateBody.explanation
                this.amount = cardDisputeCreateBody.amount
                additionalProperties(cardDisputeCreateBody.additionalProperties)
            }

            /**
             * The Transaction you wish to dispute. This Transaction must have a `source_type` of
             * `card_settlement`.
             */
            @JsonProperty("disputed_transaction_id")
            fun disputedTransactionId(disputedTransactionId: String) = apply {
                this.disputedTransactionId = disputedTransactionId
            }

            /** Why you are disputing this Transaction. */
            @JsonProperty("explanation")
            fun explanation(explanation: String) = apply { this.explanation = explanation }

            /**
             * The monetary amount of the part of the transaction that is being disputed. This is
             * optional and will default to the full amount of the transaction if not provided. If
             * provided, the amount must be less than or equal to the amount of the transaction.
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

            fun build(): CardDisputeCreateBody =
                CardDisputeCreateBody(
                    checkNotNull(disputedTransactionId) {
                        "`disputedTransactionId` is required but was not set"
                    },
                    checkNotNull(explanation) { "`explanation` is required but was not set" },
                    amount,
                    additionalProperties.toUnmodifiable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CardDisputeCreateBody &&
                this.disputedTransactionId == other.disputedTransactionId &&
                this.explanation == other.explanation &&
                this.amount == other.amount &&
                this.additionalProperties == other.additionalProperties
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        disputedTransactionId,
                        explanation,
                        amount,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "CardDisputeCreateBody{disputedTransactionId=$disputedTransactionId, explanation=$explanation, amount=$amount, additionalProperties=$additionalProperties}"
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CardDisputeCreateParams &&
            this.disputedTransactionId == other.disputedTransactionId &&
            this.explanation == other.explanation &&
            this.amount == other.amount &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            disputedTransactionId,
            explanation,
            amount,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "CardDisputeCreateParams{disputedTransactionId=$disputedTransactionId, explanation=$explanation, amount=$amount, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var disputedTransactionId: String? = null
        private var explanation: String? = null
        private var amount: Long? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(cardDisputeCreateParams: CardDisputeCreateParams) = apply {
            this.disputedTransactionId = cardDisputeCreateParams.disputedTransactionId
            this.explanation = cardDisputeCreateParams.explanation
            this.amount = cardDisputeCreateParams.amount
            additionalQueryParams(cardDisputeCreateParams.additionalQueryParams)
            additionalHeaders(cardDisputeCreateParams.additionalHeaders)
            additionalBodyProperties(cardDisputeCreateParams.additionalBodyProperties)
        }

        /**
         * The Transaction you wish to dispute. This Transaction must have a `source_type` of
         * `card_settlement`.
         */
        fun disputedTransactionId(disputedTransactionId: String) = apply {
            this.disputedTransactionId = disputedTransactionId
        }

        /** Why you are disputing this Transaction. */
        fun explanation(explanation: String) = apply { this.explanation = explanation }

        /**
         * The monetary amount of the part of the transaction that is being disputed. This is
         * optional and will default to the full amount of the transaction if not provided. If
         * provided, the amount must be less than or equal to the amount of the transaction.
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

        fun build(): CardDisputeCreateParams =
            CardDisputeCreateParams(
                checkNotNull(disputedTransactionId) {
                    "`disputedTransactionId` is required but was not set"
                },
                checkNotNull(explanation) { "`explanation` is required but was not set" },
                amount,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }
}
