// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.simulations.interestpayments

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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional

/**
 * Simulates an interest payment to your account. In production, this happens automatically on the
 * first of each month.
 */
class InterestPaymentCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The identifier of the Account the Interest Payment should be paid to is for.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountId(): String = body.accountId()

    /**
     * The interest amount in cents. Must be positive.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amount(): Long = body.amount()

    /**
     * The identifier of the Account the Interest accrued on. Defaults to `account_id`.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accruedOnAccountId(): Optional<String> = body.accruedOnAccountId()

    /**
     * The end of the interest period. If not provided, defaults to the current time.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun periodEnd(): Optional<OffsetDateTime> = body.periodEnd()

    /**
     * The start of the interest period. If not provided, defaults to the current time.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun periodStart(): Optional<OffsetDateTime> = body.periodStart()

    /**
     * Returns the raw JSON value of [accountId].
     *
     * Unlike [accountId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _accountId(): JsonField<String> = body._accountId()

    /**
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _amount(): JsonField<Long> = body._amount()

    /**
     * Returns the raw JSON value of [accruedOnAccountId].
     *
     * Unlike [accruedOnAccountId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _accruedOnAccountId(): JsonField<String> = body._accruedOnAccountId()

    /**
     * Returns the raw JSON value of [periodEnd].
     *
     * Unlike [periodEnd], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _periodEnd(): JsonField<OffsetDateTime> = body._periodEnd()

    /**
     * Returns the raw JSON value of [periodStart].
     *
     * Unlike [periodStart], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _periodStart(): JsonField<OffsetDateTime> = body._periodStart()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [InterestPaymentCreateParams].
         *
         * The following fields are required:
         * ```java
         * .accountId()
         * .amount()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InterestPaymentCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(interestPaymentCreateParams: InterestPaymentCreateParams) = apply {
            body = interestPaymentCreateParams.body.toBuilder()
            additionalHeaders = interestPaymentCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = interestPaymentCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [accountId]
         * - [amount]
         * - [accruedOnAccountId]
         * - [periodEnd]
         * - [periodStart]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The identifier of the Account the Interest Payment should be paid to is for. */
        fun accountId(accountId: String) = apply { body.accountId(accountId) }

        /**
         * Sets [Builder.accountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accountId(accountId: JsonField<String>) = apply { body.accountId(accountId) }

        /** The interest amount in cents. Must be positive. */
        fun amount(amount: Long) = apply { body.amount(amount) }

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<Long>) = apply { body.amount(amount) }

        /** The identifier of the Account the Interest accrued on. Defaults to `account_id`. */
        fun accruedOnAccountId(accruedOnAccountId: String) = apply {
            body.accruedOnAccountId(accruedOnAccountId)
        }

        /**
         * Sets [Builder.accruedOnAccountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accruedOnAccountId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun accruedOnAccountId(accruedOnAccountId: JsonField<String>) = apply {
            body.accruedOnAccountId(accruedOnAccountId)
        }

        /** The end of the interest period. If not provided, defaults to the current time. */
        fun periodEnd(periodEnd: OffsetDateTime) = apply { body.periodEnd(periodEnd) }

        /**
         * Sets [Builder.periodEnd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.periodEnd] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun periodEnd(periodEnd: JsonField<OffsetDateTime>) = apply { body.periodEnd(periodEnd) }

        /** The start of the interest period. If not provided, defaults to the current time. */
        fun periodStart(periodStart: OffsetDateTime) = apply { body.periodStart(periodStart) }

        /**
         * Sets [Builder.periodStart] to an arbitrary JSON value.
         *
         * You should usually call [Builder.periodStart] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun periodStart(periodStart: JsonField<OffsetDateTime>) = apply {
            body.periodStart(periodStart)
        }

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

        /**
         * Returns an immutable instance of [InterestPaymentCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .accountId()
         * .amount()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): InterestPaymentCreateParams =
            InterestPaymentCreateParams(
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
        private val accountId: JsonField<String>,
        private val amount: JsonField<Long>,
        private val accruedOnAccountId: JsonField<String>,
        private val periodEnd: JsonField<OffsetDateTime>,
        private val periodStart: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("account_id")
            @ExcludeMissing
            accountId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("accrued_on_account_id")
            @ExcludeMissing
            accruedOnAccountId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("period_end")
            @ExcludeMissing
            periodEnd: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("period_start")
            @ExcludeMissing
            periodStart: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(accountId, amount, accruedOnAccountId, periodEnd, periodStart, mutableMapOf())

        /**
         * The identifier of the Account the Interest Payment should be paid to is for.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun accountId(): String = accountId.getRequired("account_id")

        /**
         * The interest amount in cents. Must be positive.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun amount(): Long = amount.getRequired("amount")

        /**
         * The identifier of the Account the Interest accrued on. Defaults to `account_id`.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun accruedOnAccountId(): Optional<String> =
            accruedOnAccountId.getOptional("accrued_on_account_id")

        /**
         * The end of the interest period. If not provided, defaults to the current time.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun periodEnd(): Optional<OffsetDateTime> = periodEnd.getOptional("period_end")

        /**
         * The start of the interest period. If not provided, defaults to the current time.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun periodStart(): Optional<OffsetDateTime> = periodStart.getOptional("period_start")

        /**
         * Returns the raw JSON value of [accountId].
         *
         * Unlike [accountId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("account_id") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

        /**
         * Returns the raw JSON value of [amount].
         *
         * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

        /**
         * Returns the raw JSON value of [accruedOnAccountId].
         *
         * Unlike [accruedOnAccountId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("accrued_on_account_id")
        @ExcludeMissing
        fun _accruedOnAccountId(): JsonField<String> = accruedOnAccountId

        /**
         * Returns the raw JSON value of [periodEnd].
         *
         * Unlike [periodEnd], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("period_end")
        @ExcludeMissing
        fun _periodEnd(): JsonField<OffsetDateTime> = periodEnd

        /**
         * Returns the raw JSON value of [periodStart].
         *
         * Unlike [periodStart], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("period_start")
        @ExcludeMissing
        fun _periodStart(): JsonField<OffsetDateTime> = periodStart

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
             * .accountId()
             * .amount()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var accountId: JsonField<String>? = null
            private var amount: JsonField<Long>? = null
            private var accruedOnAccountId: JsonField<String> = JsonMissing.of()
            private var periodEnd: JsonField<OffsetDateTime> = JsonMissing.of()
            private var periodStart: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                accountId = body.accountId
                amount = body.amount
                accruedOnAccountId = body.accruedOnAccountId
                periodEnd = body.periodEnd
                periodStart = body.periodStart
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The identifier of the Account the Interest Payment should be paid to is for. */
            fun accountId(accountId: String) = accountId(JsonField.of(accountId))

            /**
             * Sets [Builder.accountId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

            /** The interest amount in cents. Must be positive. */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            /** The identifier of the Account the Interest accrued on. Defaults to `account_id`. */
            fun accruedOnAccountId(accruedOnAccountId: String) =
                accruedOnAccountId(JsonField.of(accruedOnAccountId))

            /**
             * Sets [Builder.accruedOnAccountId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accruedOnAccountId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accruedOnAccountId(accruedOnAccountId: JsonField<String>) = apply {
                this.accruedOnAccountId = accruedOnAccountId
            }

            /** The end of the interest period. If not provided, defaults to the current time. */
            fun periodEnd(periodEnd: OffsetDateTime) = periodEnd(JsonField.of(periodEnd))

            /**
             * Sets [Builder.periodEnd] to an arbitrary JSON value.
             *
             * You should usually call [Builder.periodEnd] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun periodEnd(periodEnd: JsonField<OffsetDateTime>) = apply {
                this.periodEnd = periodEnd
            }

            /** The start of the interest period. If not provided, defaults to the current time. */
            fun periodStart(periodStart: OffsetDateTime) = periodStart(JsonField.of(periodStart))

            /**
             * Sets [Builder.periodStart] to an arbitrary JSON value.
             *
             * You should usually call [Builder.periodStart] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun periodStart(periodStart: JsonField<OffsetDateTime>) = apply {
                this.periodStart = periodStart
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

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .accountId()
             * .amount()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("accountId", accountId),
                    checkRequired("amount", amount),
                    accruedOnAccountId,
                    periodEnd,
                    periodStart,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            accountId()
            amount()
            accruedOnAccountId()
            periodEnd()
            periodStart()
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
            (if (accountId.asKnown().isPresent) 1 else 0) +
                (if (amount.asKnown().isPresent) 1 else 0) +
                (if (accruedOnAccountId.asKnown().isPresent) 1 else 0) +
                (if (periodEnd.asKnown().isPresent) 1 else 0) +
                (if (periodStart.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && accountId == other.accountId && amount == other.amount && accruedOnAccountId == other.accruedOnAccountId && periodEnd == other.periodEnd && periodStart == other.periodStart && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(accountId, amount, accruedOnAccountId, periodEnd, periodStart, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{accountId=$accountId, amount=$amount, accruedOnAccountId=$accruedOnAccountId, periodEnd=$periodEnd, periodStart=$periodStart, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InterestPaymentCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "InterestPaymentCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
