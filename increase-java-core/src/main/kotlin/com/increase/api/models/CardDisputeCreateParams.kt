// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.core.immutableEmptyMap
import com.increase.api.core.toImmutable
import java.util.Objects
import java.util.Optional

class CardDisputeCreateParams
constructor(
    private val disputedTransactionId: String,
    private val explanation: String,
    private val amount: Long?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun disputedTransactionId(): String = disputedTransactionId

    fun explanation(): String = explanation

    fun amount(): Optional<Long> = Optional.ofNullable(amount)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    @JvmSynthetic
    internal fun getBody(): CardDisputeCreateBody {
        return CardDisputeCreateBody(
            disputedTransactionId,
            explanation,
            amount,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class CardDisputeCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("disputed_transaction_id") private val disputedTransactionId: String,
        @JsonProperty("explanation") private val explanation: String,
        @JsonProperty("amount") private val amount: Long?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * The Transaction you wish to dispute. This Transaction must have a `source_type` of
         * `card_settlement`.
         */
        @JsonProperty("disputed_transaction_id")
        fun disputedTransactionId(): String = disputedTransactionId

        /** Why you are disputing this Transaction. */
        @JsonProperty("explanation") fun explanation(): String = explanation

        /**
         * The monetary amount of the part of the transaction that is being disputed. This is
         * optional and will default to the full amount of the transaction if not provided. If
         * provided, the amount must be less than or equal to the amount of the transaction.
         */
        @JsonProperty("amount") fun amount(): Optional<Long> = Optional.ofNullable(amount)

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
                disputedTransactionId = cardDisputeCreateBody.disputedTransactionId
                explanation = cardDisputeCreateBody.explanation
                amount = cardDisputeCreateBody.amount
                additionalProperties = cardDisputeCreateBody.additionalProperties.toMutableMap()
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

            fun build(): CardDisputeCreateBody =
                CardDisputeCreateBody(
                    checkNotNull(disputedTransactionId) {
                        "`disputedTransactionId` is required but was not set"
                    },
                    checkNotNull(explanation) { "`explanation` is required but was not set" },
                    amount,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CardDisputeCreateBody && disputedTransactionId == other.disputedTransactionId && explanation == other.explanation && amount == other.amount && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(disputedTransactionId, explanation, amount, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CardDisputeCreateBody{disputedTransactionId=$disputedTransactionId, explanation=$explanation, amount=$amount, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var disputedTransactionId: String? = null
        private var explanation: String? = null
        private var amount: Long? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(cardDisputeCreateParams: CardDisputeCreateParams) = apply {
            disputedTransactionId = cardDisputeCreateParams.disputedTransactionId
            explanation = cardDisputeCreateParams.explanation
            amount = cardDisputeCreateParams.amount
            additionalHeaders = cardDisputeCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = cardDisputeCreateParams.additionalQueryParams.toBuilder()
            additionalBodyProperties =
                cardDisputeCreateParams.additionalBodyProperties.toMutableMap()
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
            putAllAdditionalBodyProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            additionalBodyProperties.remove(key)
        }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalBodyProperty)
        }

        fun build(): CardDisputeCreateParams =
            CardDisputeCreateParams(
                checkNotNull(disputedTransactionId) {
                    "`disputedTransactionId` is required but was not set"
                },
                checkNotNull(explanation) { "`explanation` is required but was not set" },
                amount,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CardDisputeCreateParams && disputedTransactionId == other.disputedTransactionId && explanation == other.explanation && amount == other.amount && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(disputedTransactionId, explanation, amount, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "CardDisputeCreateParams{disputedTransactionId=$disputedTransactionId, explanation=$explanation, amount=$amount, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
