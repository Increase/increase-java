// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.carddisputes

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.Params
import com.increase.api.core.checkRequired
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.errors.IncreaseInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

/** Create a Card Dispute */
class CardDisputeCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The Transaction you wish to dispute. This Transaction must have a `source_type` of
     * `card_settlement`.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun disputedTransactionId(): String = body.disputedTransactionId()

    /**
     * Why you are disputing this Transaction.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun explanation(): String = body.explanation()

    /**
     * The monetary amount of the part of the transaction that is being disputed. This is optional
     * and will default to the full amount of the transaction if not provided. If provided, the
     * amount must be less than or equal to the amount of the transaction.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun amount(): Optional<Long> = body.amount()

    /**
     * Returns the raw JSON value of [disputedTransactionId].
     *
     * Unlike [disputedTransactionId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _disputedTransactionId(): JsonField<String> = body._disputedTransactionId()

    /**
     * Returns the raw JSON value of [explanation].
     *
     * Unlike [explanation], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _explanation(): JsonField<String> = body._explanation()

    /**
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _amount(): JsonField<Long> = body._amount()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CardDisputeCreateParams].
         *
         * The following fields are required:
         * ```java
         * .disputedTransactionId()
         * .explanation()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CardDisputeCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(cardDisputeCreateParams: CardDisputeCreateParams) = apply {
            body = cardDisputeCreateParams.body.toBuilder()
            additionalHeaders = cardDisputeCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = cardDisputeCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [disputedTransactionId]
         * - [explanation]
         * - [amount]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * The Transaction you wish to dispute. This Transaction must have a `source_type` of
         * `card_settlement`.
         */
        fun disputedTransactionId(disputedTransactionId: String) = apply {
            body.disputedTransactionId(disputedTransactionId)
        }

        /**
         * Sets [Builder.disputedTransactionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.disputedTransactionId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun disputedTransactionId(disputedTransactionId: JsonField<String>) = apply {
            body.disputedTransactionId(disputedTransactionId)
        }

        /** Why you are disputing this Transaction. */
        fun explanation(explanation: String) = apply { body.explanation(explanation) }

        /**
         * Sets [Builder.explanation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.explanation] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun explanation(explanation: JsonField<String>) = apply { body.explanation(explanation) }

        /**
         * The monetary amount of the part of the transaction that is being disputed. This is
         * optional and will default to the full amount of the transaction if not provided. If
         * provided, the amount must be less than or equal to the amount of the transaction.
         */
        fun amount(amount: Long) = apply { body.amount(amount) }

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<Long>) = apply { body.amount(amount) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAlladditional_body_properties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAlladditional_body_properties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAlladditional_body_properties(keys: Set<String>) = apply {
            body.removeAlladditional_body_properties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAlladditional_headers(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAlladditional_headers(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putadditional_headers(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAlladditional_headers(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAlladditional_headers(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceadditional_headers(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceadditional_headers(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAlladditional_headers(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAlladditional_headers(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeadditional_headers(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAlladditional_headers(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAlladditional_query_params(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAlladditional_query_params(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putadditional_query_params(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAlladditional_query_params(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAlladditional_query_params(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceadditional_query_params(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceadditional_query_params(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAlladditional_query_params(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAlladditional_query_params(
            additionalQueryParams: Map<String, Iterable<String>>
        ) = apply { this.additionalQueryParams.replaceAll(additionalQueryParams) }

        fun removeadditional_query_params(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAlladditional_query_params(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [CardDisputeCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .disputedTransactionId()
         * .explanation()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CardDisputeCreateParams =
            CardDisputeCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val disputedTransactionId: JsonField<String>,
        private val explanation: JsonField<String>,
        private val amount: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("disputed_transaction_id")
            @ExcludeMissing
            disputedTransactionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("explanation")
            @ExcludeMissing
            explanation: JsonField<String> = JsonMissing.of(),
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
        ) : this(disputedTransactionId, explanation, amount, mutableMapOf())

        /**
         * The Transaction you wish to dispute. This Transaction must have a `source_type` of
         * `card_settlement`.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun disputedTransactionId(): String =
            disputedTransactionId.getRequired("disputed_transaction_id")

        /**
         * Why you are disputing this Transaction.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun explanation(): String = explanation.getRequired("explanation")

        /**
         * The monetary amount of the part of the transaction that is being disputed. This is
         * optional and will default to the full amount of the transaction if not provided. If
         * provided, the amount must be less than or equal to the amount of the transaction.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun amount(): Optional<Long> = amount.getOptional("amount")

        /**
         * Returns the raw JSON value of [disputedTransactionId].
         *
         * Unlike [disputedTransactionId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("disputed_transaction_id")
        @ExcludeMissing
        fun _disputedTransactionId(): JsonField<String> = disputedTransactionId

        /**
         * Returns the raw JSON value of [explanation].
         *
         * Unlike [explanation], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("explanation")
        @ExcludeMissing
        fun _explanation(): JsonField<String> = explanation

        /**
         * Returns the raw JSON value of [amount].
         *
         * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .disputedTransactionId()
             * .explanation()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var disputedTransactionId: JsonField<String>? = null
            private var explanation: JsonField<String>? = null
            private var amount: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                disputedTransactionId = body.disputedTransactionId
                explanation = body.explanation
                amount = body.amount
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * The Transaction you wish to dispute. This Transaction must have a `source_type` of
             * `card_settlement`.
             */
            fun disputedTransactionId(disputedTransactionId: String) =
                disputedTransactionId(JsonField.of(disputedTransactionId))

            /**
             * Sets [Builder.disputedTransactionId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.disputedTransactionId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun disputedTransactionId(disputedTransactionId: JsonField<String>) = apply {
                this.disputedTransactionId = disputedTransactionId
            }

            /** Why you are disputing this Transaction. */
            fun explanation(explanation: String) = explanation(JsonField.of(explanation))

            /**
             * Sets [Builder.explanation] to an arbitrary JSON value.
             *
             * You should usually call [Builder.explanation] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun explanation(explanation: JsonField<String>) = apply {
                this.explanation = explanation
            }

            /**
             * The monetary amount of the part of the transaction that is being disputed. This is
             * optional and will default to the full amount of the transaction if not provided. If
             * provided, the amount must be less than or equal to the amount of the transaction.
             */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAlladditional_properties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAlladditional_properties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAlladditional_properties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .disputedTransactionId()
             * .explanation()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("disputedTransactionId", disputedTransactionId),
                    checkRequired("explanation", explanation),
                    amount,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            disputedTransactionId()
            explanation()
            amount()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: IncreaseInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (disputedTransactionId.asKnown().isPresent) 1 else 0) +
                (if (explanation.asKnown().isPresent) 1 else 0) +
                (if (amount.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                disputedTransactionId == other.disputedTransactionId &&
                explanation == other.explanation &&
                amount == other.amount &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(disputedTransactionId, explanation, amount, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{disputedTransactionId=$disputedTransactionId, explanation=$explanation, amount=$amount, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CardDisputeCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "CardDisputeCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
