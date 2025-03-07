// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.increase.api.core.Enum
import com.increase.api.core.JsonField
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.Params
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.core.toImmutable
import com.increase.api.errors.IncreaseInvalidDataException
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** List Transactions */
class TransactionListParams
private constructor(
    private val accountId: String?,
    private val category: Category?,
    private val createdAt: CreatedAt?,
    private val cursor: String?,
    private val limit: Long?,
    private val routeId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Filter Transactions for those belonging to the specified Account. */
    fun accountId(): Optional<String> = Optional.ofNullable(accountId)

    fun category(): Optional<Category> = Optional.ofNullable(category)

    fun createdAt(): Optional<CreatedAt> = Optional.ofNullable(createdAt)

    /** Return the page of entries after this one. */
    fun cursor(): Optional<String> = Optional.ofNullable(cursor)

    /** Limit the size of the list that is returned. The default (and maximum) is 100 objects. */
    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    /**
     * Filter Transactions for those belonging to the specified route. This could be a Card ID or an
     * Account Number ID.
     */
    fun routeId(): Optional<String> = Optional.ofNullable(routeId)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.accountId?.let { queryParams.put("account_id", listOf(it.toString())) }
        this.category?.forEachQueryParam { key, values -> queryParams.put("category.$key", values) }
        this.createdAt?.forEachQueryParam { key, values ->
            queryParams.put("created_at.$key", values)
        }
        this.cursor?.let { queryParams.put("cursor", listOf(it.toString())) }
        this.limit?.let { queryParams.put("limit", listOf(it.toString())) }
        this.routeId?.let { queryParams.put("route_id", listOf(it.toString())) }
        queryParams.putAll(additionalQueryParams)
        return queryParams.build()
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): TransactionListParams = builder().build()

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TransactionListParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var accountId: String? = null
        private var category: Category? = null
        private var createdAt: CreatedAt? = null
        private var cursor: String? = null
        private var limit: Long? = null
        private var routeId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(transactionListParams: TransactionListParams) = apply {
            accountId = transactionListParams.accountId
            category = transactionListParams.category
            createdAt = transactionListParams.createdAt
            cursor = transactionListParams.cursor
            limit = transactionListParams.limit
            routeId = transactionListParams.routeId
            additionalHeaders = transactionListParams.additionalHeaders.toBuilder()
            additionalQueryParams = transactionListParams.additionalQueryParams.toBuilder()
        }

        /** Filter Transactions for those belonging to the specified Account. */
        fun accountId(accountId: String?) = apply { this.accountId = accountId }

        /** Filter Transactions for those belonging to the specified Account. */
        fun accountId(accountId: Optional<String>) = accountId(accountId.getOrNull())

        fun category(category: Category?) = apply { this.category = category }

        fun category(category: Optional<Category>) = category(category.getOrNull())

        fun createdAt(createdAt: CreatedAt?) = apply { this.createdAt = createdAt }

        fun createdAt(createdAt: Optional<CreatedAt>) = createdAt(createdAt.getOrNull())

        /** Return the page of entries after this one. */
        fun cursor(cursor: String?) = apply { this.cursor = cursor }

        /** Return the page of entries after this one. */
        fun cursor(cursor: Optional<String>) = cursor(cursor.getOrNull())

        /**
         * Limit the size of the list that is returned. The default (and maximum) is 100 objects.
         */
        fun limit(limit: Long?) = apply { this.limit = limit }

        /**
         * Limit the size of the list that is returned. The default (and maximum) is 100 objects.
         */
        fun limit(limit: Long) = limit(limit as Long?)

        /**
         * Limit the size of the list that is returned. The default (and maximum) is 100 objects.
         */
        fun limit(limit: Optional<Long>) = limit(limit.getOrNull())

        /**
         * Filter Transactions for those belonging to the specified route. This could be a Card ID
         * or an Account Number ID.
         */
        fun routeId(routeId: String?) = apply { this.routeId = routeId }

        /**
         * Filter Transactions for those belonging to the specified route. This could be a Card ID
         * or an Account Number ID.
         */
        fun routeId(routeId: Optional<String>) = routeId(routeId.getOrNull())

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

        fun build(): TransactionListParams =
            TransactionListParams(
                accountId,
                category,
                createdAt,
                cursor,
                limit,
                routeId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    class Category
    private constructor(private val in_: List<In>?, private val additionalProperties: QueryParams) {

        /**
         * Return results whose value is in the provided list. For GET requests, this should be
         * encoded as a comma-delimited string, such as `?in=one,two,three`.
         */
        fun in_(): Optional<List<In>> = Optional.ofNullable(in_)

        fun _additionalProperties(): QueryParams = additionalProperties

        @JvmSynthetic
        internal fun forEachQueryParam(putParam: (String, List<String>) -> Unit) {
            this.in_?.let { putParam("in", listOf(it.joinToString(separator = ","))) }
            additionalProperties.keys().forEach { putParam(it, additionalProperties.values(it)) }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Category]. */
        class Builder internal constructor() {

            private var in_: MutableList<In>? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(category: Category) = apply {
                in_ = category.in_?.toMutableList()
                additionalProperties = category.additionalProperties.toBuilder()
            }

            /**
             * Return results whose value is in the provided list. For GET requests, this should be
             * encoded as a comma-delimited string, such as `?in=one,two,three`.
             */
            fun in_(in_: List<In>?) = apply { this.in_ = in_?.toMutableList() }

            /**
             * Return results whose value is in the provided list. For GET requests, this should be
             * encoded as a comma-delimited string, such as `?in=one,two,three`.
             */
            fun in_(in_: Optional<List<In>>) = in_(in_.getOrNull())

            /**
             * Return results whose value is in the provided list. For GET requests, this should be
             * encoded as a comma-delimited string, such as `?in=one,two,three`.
             */
            fun addIn(in_: In) = apply {
                this.in_ = (this.in_ ?: mutableListOf()).apply { add(in_) }
            }

            fun additionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun additionalProperties(additionalProperties: Map<String, Iterable<String>>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: String) = apply {
                additionalProperties.put(key, value)
            }

            fun putAdditionalProperties(key: String, values: Iterable<String>) = apply {
                additionalProperties.put(key, values)
            }

            fun putAllAdditionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, Iterable<String>>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun replaceAdditionalProperties(key: String, value: String) = apply {
                additionalProperties.replace(key, value)
            }

            fun replaceAdditionalProperties(key: String, values: Iterable<String>) = apply {
                additionalProperties.replace(key, values)
            }

            fun replaceAllAdditionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.replaceAll(additionalProperties)
            }

            fun replaceAllAdditionalProperties(
                additionalProperties: Map<String, Iterable<String>>
            ) = apply { this.additionalProperties.replaceAll(additionalProperties) }

            fun removeAdditionalProperties(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                additionalProperties.removeAll(keys)
            }

            fun build(): Category = Category(in_?.toImmutable(), additionalProperties.build())
        }

        class In @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                /**
                 * Account Transfer Intention: details will be under the
                 * `account_transfer_intention` object.
                 */
                @JvmField val ACCOUNT_TRANSFER_INTENTION = of("account_transfer_intention")

                /**
                 * ACH Transfer Intention: details will be under the `ach_transfer_intention`
                 * object.
                 */
                @JvmField val ACH_TRANSFER_INTENTION = of("ach_transfer_intention")

                /**
                 * ACH Transfer Rejection: details will be under the `ach_transfer_rejection`
                 * object.
                 */
                @JvmField val ACH_TRANSFER_REJECTION = of("ach_transfer_rejection")

                /** ACH Transfer Return: details will be under the `ach_transfer_return` object. */
                @JvmField val ACH_TRANSFER_RETURN = of("ach_transfer_return")

                /** Cashback Payment: details will be under the `cashback_payment` object. */
                @JvmField val CASHBACK_PAYMENT = of("cashback_payment")

                /**
                 * Card Dispute Acceptance: details will be under the `card_dispute_acceptance`
                 * object.
                 */
                @JvmField val CARD_DISPUTE_ACCEPTANCE = of("card_dispute_acceptance")

                /** Card Dispute Loss: details will be under the `card_dispute_loss` object. */
                @JvmField val CARD_DISPUTE_LOSS = of("card_dispute_loss")

                /** Card Refund: details will be under the `card_refund` object. */
                @JvmField val CARD_REFUND = of("card_refund")

                /** Card Settlement: details will be under the `card_settlement` object. */
                @JvmField val CARD_SETTLEMENT = of("card_settlement")

                /**
                 * Card Revenue Payment: details will be under the `card_revenue_payment` object.
                 */
                @JvmField val CARD_REVENUE_PAYMENT = of("card_revenue_payment")

                /**
                 * Check Deposit Acceptance: details will be under the `check_deposit_acceptance`
                 * object.
                 */
                @JvmField val CHECK_DEPOSIT_ACCEPTANCE = of("check_deposit_acceptance")

                /**
                 * Check Deposit Return: details will be under the `check_deposit_return` object.
                 */
                @JvmField val CHECK_DEPOSIT_RETURN = of("check_deposit_return")

                /**
                 * Check Transfer Deposit: details will be under the `check_transfer_deposit`
                 * object.
                 */
                @JvmField val CHECK_TRANSFER_DEPOSIT = of("check_transfer_deposit")

                /** Fee Payment: details will be under the `fee_payment` object. */
                @JvmField val FEE_PAYMENT = of("fee_payment")

                /**
                 * Inbound ACH Transfer Intention: details will be under the `inbound_ach_transfer`
                 * object.
                 */
                @JvmField val INBOUND_ACH_TRANSFER = of("inbound_ach_transfer")

                /**
                 * Inbound ACH Transfer Return Intention: details will be under the
                 * `inbound_ach_transfer_return_intention` object.
                 */
                @JvmField
                val INBOUND_ACH_TRANSFER_RETURN_INTENTION =
                    of("inbound_ach_transfer_return_intention")

                /**
                 * Inbound Check Deposit Return Intention: details will be under the
                 * `inbound_check_deposit_return_intention` object.
                 */
                @JvmField
                val INBOUND_CHECK_DEPOSIT_RETURN_INTENTION =
                    of("inbound_check_deposit_return_intention")

                /**
                 * Inbound Check Adjustment: details will be under the `inbound_check_adjustment`
                 * object.
                 */
                @JvmField val INBOUND_CHECK_ADJUSTMENT = of("inbound_check_adjustment")

                /**
                 * Inbound Real-Time Payments Transfer Confirmation: details will be under the
                 * `inbound_real_time_payments_transfer_confirmation` object.
                 */
                @JvmField
                val INBOUND_REAL_TIME_PAYMENTS_TRANSFER_CONFIRMATION =
                    of("inbound_real_time_payments_transfer_confirmation")

                /**
                 * Inbound Real-Time Payments Transfer Decline: details will be under the
                 * `inbound_real_time_payments_transfer_decline` object.
                 */
                @JvmField
                val INBOUND_REAL_TIME_PAYMENTS_TRANSFER_DECLINE =
                    of("inbound_real_time_payments_transfer_decline")

                /**
                 * Inbound Wire Reversal: details will be under the `inbound_wire_reversal` object.
                 */
                @JvmField val INBOUND_WIRE_REVERSAL = of("inbound_wire_reversal")

                /**
                 * Inbound Wire Transfer Intention: details will be under the
                 * `inbound_wire_transfer` object.
                 */
                @JvmField val INBOUND_WIRE_TRANSFER = of("inbound_wire_transfer")

                /**
                 * Inbound Wire Transfer Reversal Intention: details will be under the
                 * `inbound_wire_transfer_reversal` object.
                 */
                @JvmField val INBOUND_WIRE_TRANSFER_REVERSAL = of("inbound_wire_transfer_reversal")

                /** Interest Payment: details will be under the `interest_payment` object. */
                @JvmField val INTEREST_PAYMENT = of("interest_payment")

                /** Internal Source: details will be under the `internal_source` object. */
                @JvmField val INTERNAL_SOURCE = of("internal_source")

                /**
                 * Real-Time Payments Transfer Acknowledgement: details will be under the
                 * `real_time_payments_transfer_acknowledgement` object.
                 */
                @JvmField
                val REAL_TIME_PAYMENTS_TRANSFER_ACKNOWLEDGEMENT =
                    of("real_time_payments_transfer_acknowledgement")

                /** Sample Funds: details will be under the `sample_funds` object. */
                @JvmField val SAMPLE_FUNDS = of("sample_funds")

                /**
                 * Wire Transfer Intention: details will be under the `wire_transfer_intention`
                 * object.
                 */
                @JvmField val WIRE_TRANSFER_INTENTION = of("wire_transfer_intention")

                /** The Transaction was made for an undocumented or deprecated reason. */
                @JvmField val OTHER = of("other")

                @JvmStatic fun of(value: String) = In(JsonField.of(value))
            }

            /** An enum containing [In]'s known values. */
            enum class Known {
                /**
                 * Account Transfer Intention: details will be under the
                 * `account_transfer_intention` object.
                 */
                ACCOUNT_TRANSFER_INTENTION,
                /**
                 * ACH Transfer Intention: details will be under the `ach_transfer_intention`
                 * object.
                 */
                ACH_TRANSFER_INTENTION,
                /**
                 * ACH Transfer Rejection: details will be under the `ach_transfer_rejection`
                 * object.
                 */
                ACH_TRANSFER_REJECTION,
                /** ACH Transfer Return: details will be under the `ach_transfer_return` object. */
                ACH_TRANSFER_RETURN,
                /** Cashback Payment: details will be under the `cashback_payment` object. */
                CASHBACK_PAYMENT,
                /**
                 * Card Dispute Acceptance: details will be under the `card_dispute_acceptance`
                 * object.
                 */
                CARD_DISPUTE_ACCEPTANCE,
                /** Card Dispute Loss: details will be under the `card_dispute_loss` object. */
                CARD_DISPUTE_LOSS,
                /** Card Refund: details will be under the `card_refund` object. */
                CARD_REFUND,
                /** Card Settlement: details will be under the `card_settlement` object. */
                CARD_SETTLEMENT,
                /**
                 * Card Revenue Payment: details will be under the `card_revenue_payment` object.
                 */
                CARD_REVENUE_PAYMENT,
                /**
                 * Check Deposit Acceptance: details will be under the `check_deposit_acceptance`
                 * object.
                 */
                CHECK_DEPOSIT_ACCEPTANCE,
                /**
                 * Check Deposit Return: details will be under the `check_deposit_return` object.
                 */
                CHECK_DEPOSIT_RETURN,
                /**
                 * Check Transfer Deposit: details will be under the `check_transfer_deposit`
                 * object.
                 */
                CHECK_TRANSFER_DEPOSIT,
                /** Fee Payment: details will be under the `fee_payment` object. */
                FEE_PAYMENT,
                /**
                 * Inbound ACH Transfer Intention: details will be under the `inbound_ach_transfer`
                 * object.
                 */
                INBOUND_ACH_TRANSFER,
                /**
                 * Inbound ACH Transfer Return Intention: details will be under the
                 * `inbound_ach_transfer_return_intention` object.
                 */
                INBOUND_ACH_TRANSFER_RETURN_INTENTION,
                /**
                 * Inbound Check Deposit Return Intention: details will be under the
                 * `inbound_check_deposit_return_intention` object.
                 */
                INBOUND_CHECK_DEPOSIT_RETURN_INTENTION,
                /**
                 * Inbound Check Adjustment: details will be under the `inbound_check_adjustment`
                 * object.
                 */
                INBOUND_CHECK_ADJUSTMENT,
                /**
                 * Inbound Real-Time Payments Transfer Confirmation: details will be under the
                 * `inbound_real_time_payments_transfer_confirmation` object.
                 */
                INBOUND_REAL_TIME_PAYMENTS_TRANSFER_CONFIRMATION,
                /**
                 * Inbound Real-Time Payments Transfer Decline: details will be under the
                 * `inbound_real_time_payments_transfer_decline` object.
                 */
                INBOUND_REAL_TIME_PAYMENTS_TRANSFER_DECLINE,
                /**
                 * Inbound Wire Reversal: details will be under the `inbound_wire_reversal` object.
                 */
                INBOUND_WIRE_REVERSAL,
                /**
                 * Inbound Wire Transfer Intention: details will be under the
                 * `inbound_wire_transfer` object.
                 */
                INBOUND_WIRE_TRANSFER,
                /**
                 * Inbound Wire Transfer Reversal Intention: details will be under the
                 * `inbound_wire_transfer_reversal` object.
                 */
                INBOUND_WIRE_TRANSFER_REVERSAL,
                /** Interest Payment: details will be under the `interest_payment` object. */
                INTEREST_PAYMENT,
                /** Internal Source: details will be under the `internal_source` object. */
                INTERNAL_SOURCE,
                /**
                 * Real-Time Payments Transfer Acknowledgement: details will be under the
                 * `real_time_payments_transfer_acknowledgement` object.
                 */
                REAL_TIME_PAYMENTS_TRANSFER_ACKNOWLEDGEMENT,
                /** Sample Funds: details will be under the `sample_funds` object. */
                SAMPLE_FUNDS,
                /**
                 * Wire Transfer Intention: details will be under the `wire_transfer_intention`
                 * object.
                 */
                WIRE_TRANSFER_INTENTION,
                /** The Transaction was made for an undocumented or deprecated reason. */
                OTHER,
            }

            /**
             * An enum containing [In]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [In] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /**
                 * Account Transfer Intention: details will be under the
                 * `account_transfer_intention` object.
                 */
                ACCOUNT_TRANSFER_INTENTION,
                /**
                 * ACH Transfer Intention: details will be under the `ach_transfer_intention`
                 * object.
                 */
                ACH_TRANSFER_INTENTION,
                /**
                 * ACH Transfer Rejection: details will be under the `ach_transfer_rejection`
                 * object.
                 */
                ACH_TRANSFER_REJECTION,
                /** ACH Transfer Return: details will be under the `ach_transfer_return` object. */
                ACH_TRANSFER_RETURN,
                /** Cashback Payment: details will be under the `cashback_payment` object. */
                CASHBACK_PAYMENT,
                /**
                 * Card Dispute Acceptance: details will be under the `card_dispute_acceptance`
                 * object.
                 */
                CARD_DISPUTE_ACCEPTANCE,
                /** Card Dispute Loss: details will be under the `card_dispute_loss` object. */
                CARD_DISPUTE_LOSS,
                /** Card Refund: details will be under the `card_refund` object. */
                CARD_REFUND,
                /** Card Settlement: details will be under the `card_settlement` object. */
                CARD_SETTLEMENT,
                /**
                 * Card Revenue Payment: details will be under the `card_revenue_payment` object.
                 */
                CARD_REVENUE_PAYMENT,
                /**
                 * Check Deposit Acceptance: details will be under the `check_deposit_acceptance`
                 * object.
                 */
                CHECK_DEPOSIT_ACCEPTANCE,
                /**
                 * Check Deposit Return: details will be under the `check_deposit_return` object.
                 */
                CHECK_DEPOSIT_RETURN,
                /**
                 * Check Transfer Deposit: details will be under the `check_transfer_deposit`
                 * object.
                 */
                CHECK_TRANSFER_DEPOSIT,
                /** Fee Payment: details will be under the `fee_payment` object. */
                FEE_PAYMENT,
                /**
                 * Inbound ACH Transfer Intention: details will be under the `inbound_ach_transfer`
                 * object.
                 */
                INBOUND_ACH_TRANSFER,
                /**
                 * Inbound ACH Transfer Return Intention: details will be under the
                 * `inbound_ach_transfer_return_intention` object.
                 */
                INBOUND_ACH_TRANSFER_RETURN_INTENTION,
                /**
                 * Inbound Check Deposit Return Intention: details will be under the
                 * `inbound_check_deposit_return_intention` object.
                 */
                INBOUND_CHECK_DEPOSIT_RETURN_INTENTION,
                /**
                 * Inbound Check Adjustment: details will be under the `inbound_check_adjustment`
                 * object.
                 */
                INBOUND_CHECK_ADJUSTMENT,
                /**
                 * Inbound Real-Time Payments Transfer Confirmation: details will be under the
                 * `inbound_real_time_payments_transfer_confirmation` object.
                 */
                INBOUND_REAL_TIME_PAYMENTS_TRANSFER_CONFIRMATION,
                /**
                 * Inbound Real-Time Payments Transfer Decline: details will be under the
                 * `inbound_real_time_payments_transfer_decline` object.
                 */
                INBOUND_REAL_TIME_PAYMENTS_TRANSFER_DECLINE,
                /**
                 * Inbound Wire Reversal: details will be under the `inbound_wire_reversal` object.
                 */
                INBOUND_WIRE_REVERSAL,
                /**
                 * Inbound Wire Transfer Intention: details will be under the
                 * `inbound_wire_transfer` object.
                 */
                INBOUND_WIRE_TRANSFER,
                /**
                 * Inbound Wire Transfer Reversal Intention: details will be under the
                 * `inbound_wire_transfer_reversal` object.
                 */
                INBOUND_WIRE_TRANSFER_REVERSAL,
                /** Interest Payment: details will be under the `interest_payment` object. */
                INTEREST_PAYMENT,
                /** Internal Source: details will be under the `internal_source` object. */
                INTERNAL_SOURCE,
                /**
                 * Real-Time Payments Transfer Acknowledgement: details will be under the
                 * `real_time_payments_transfer_acknowledgement` object.
                 */
                REAL_TIME_PAYMENTS_TRANSFER_ACKNOWLEDGEMENT,
                /** Sample Funds: details will be under the `sample_funds` object. */
                SAMPLE_FUNDS,
                /**
                 * Wire Transfer Intention: details will be under the `wire_transfer_intention`
                 * object.
                 */
                WIRE_TRANSFER_INTENTION,
                /** The Transaction was made for an undocumented or deprecated reason. */
                OTHER,
                /** An enum member indicating that [In] was instantiated with an unknown value. */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    ACCOUNT_TRANSFER_INTENTION -> Value.ACCOUNT_TRANSFER_INTENTION
                    ACH_TRANSFER_INTENTION -> Value.ACH_TRANSFER_INTENTION
                    ACH_TRANSFER_REJECTION -> Value.ACH_TRANSFER_REJECTION
                    ACH_TRANSFER_RETURN -> Value.ACH_TRANSFER_RETURN
                    CASHBACK_PAYMENT -> Value.CASHBACK_PAYMENT
                    CARD_DISPUTE_ACCEPTANCE -> Value.CARD_DISPUTE_ACCEPTANCE
                    CARD_DISPUTE_LOSS -> Value.CARD_DISPUTE_LOSS
                    CARD_REFUND -> Value.CARD_REFUND
                    CARD_SETTLEMENT -> Value.CARD_SETTLEMENT
                    CARD_REVENUE_PAYMENT -> Value.CARD_REVENUE_PAYMENT
                    CHECK_DEPOSIT_ACCEPTANCE -> Value.CHECK_DEPOSIT_ACCEPTANCE
                    CHECK_DEPOSIT_RETURN -> Value.CHECK_DEPOSIT_RETURN
                    CHECK_TRANSFER_DEPOSIT -> Value.CHECK_TRANSFER_DEPOSIT
                    FEE_PAYMENT -> Value.FEE_PAYMENT
                    INBOUND_ACH_TRANSFER -> Value.INBOUND_ACH_TRANSFER
                    INBOUND_ACH_TRANSFER_RETURN_INTENTION ->
                        Value.INBOUND_ACH_TRANSFER_RETURN_INTENTION
                    INBOUND_CHECK_DEPOSIT_RETURN_INTENTION ->
                        Value.INBOUND_CHECK_DEPOSIT_RETURN_INTENTION
                    INBOUND_CHECK_ADJUSTMENT -> Value.INBOUND_CHECK_ADJUSTMENT
                    INBOUND_REAL_TIME_PAYMENTS_TRANSFER_CONFIRMATION ->
                        Value.INBOUND_REAL_TIME_PAYMENTS_TRANSFER_CONFIRMATION
                    INBOUND_REAL_TIME_PAYMENTS_TRANSFER_DECLINE ->
                        Value.INBOUND_REAL_TIME_PAYMENTS_TRANSFER_DECLINE
                    INBOUND_WIRE_REVERSAL -> Value.INBOUND_WIRE_REVERSAL
                    INBOUND_WIRE_TRANSFER -> Value.INBOUND_WIRE_TRANSFER
                    INBOUND_WIRE_TRANSFER_REVERSAL -> Value.INBOUND_WIRE_TRANSFER_REVERSAL
                    INTEREST_PAYMENT -> Value.INTEREST_PAYMENT
                    INTERNAL_SOURCE -> Value.INTERNAL_SOURCE
                    REAL_TIME_PAYMENTS_TRANSFER_ACKNOWLEDGEMENT ->
                        Value.REAL_TIME_PAYMENTS_TRANSFER_ACKNOWLEDGEMENT
                    SAMPLE_FUNDS -> Value.SAMPLE_FUNDS
                    WIRE_TRANSFER_INTENTION -> Value.WIRE_TRANSFER_INTENTION
                    OTHER -> Value.OTHER
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws IncreaseInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    ACCOUNT_TRANSFER_INTENTION -> Known.ACCOUNT_TRANSFER_INTENTION
                    ACH_TRANSFER_INTENTION -> Known.ACH_TRANSFER_INTENTION
                    ACH_TRANSFER_REJECTION -> Known.ACH_TRANSFER_REJECTION
                    ACH_TRANSFER_RETURN -> Known.ACH_TRANSFER_RETURN
                    CASHBACK_PAYMENT -> Known.CASHBACK_PAYMENT
                    CARD_DISPUTE_ACCEPTANCE -> Known.CARD_DISPUTE_ACCEPTANCE
                    CARD_DISPUTE_LOSS -> Known.CARD_DISPUTE_LOSS
                    CARD_REFUND -> Known.CARD_REFUND
                    CARD_SETTLEMENT -> Known.CARD_SETTLEMENT
                    CARD_REVENUE_PAYMENT -> Known.CARD_REVENUE_PAYMENT
                    CHECK_DEPOSIT_ACCEPTANCE -> Known.CHECK_DEPOSIT_ACCEPTANCE
                    CHECK_DEPOSIT_RETURN -> Known.CHECK_DEPOSIT_RETURN
                    CHECK_TRANSFER_DEPOSIT -> Known.CHECK_TRANSFER_DEPOSIT
                    FEE_PAYMENT -> Known.FEE_PAYMENT
                    INBOUND_ACH_TRANSFER -> Known.INBOUND_ACH_TRANSFER
                    INBOUND_ACH_TRANSFER_RETURN_INTENTION ->
                        Known.INBOUND_ACH_TRANSFER_RETURN_INTENTION
                    INBOUND_CHECK_DEPOSIT_RETURN_INTENTION ->
                        Known.INBOUND_CHECK_DEPOSIT_RETURN_INTENTION
                    INBOUND_CHECK_ADJUSTMENT -> Known.INBOUND_CHECK_ADJUSTMENT
                    INBOUND_REAL_TIME_PAYMENTS_TRANSFER_CONFIRMATION ->
                        Known.INBOUND_REAL_TIME_PAYMENTS_TRANSFER_CONFIRMATION
                    INBOUND_REAL_TIME_PAYMENTS_TRANSFER_DECLINE ->
                        Known.INBOUND_REAL_TIME_PAYMENTS_TRANSFER_DECLINE
                    INBOUND_WIRE_REVERSAL -> Known.INBOUND_WIRE_REVERSAL
                    INBOUND_WIRE_TRANSFER -> Known.INBOUND_WIRE_TRANSFER
                    INBOUND_WIRE_TRANSFER_REVERSAL -> Known.INBOUND_WIRE_TRANSFER_REVERSAL
                    INTEREST_PAYMENT -> Known.INTEREST_PAYMENT
                    INTERNAL_SOURCE -> Known.INTERNAL_SOURCE
                    REAL_TIME_PAYMENTS_TRANSFER_ACKNOWLEDGEMENT ->
                        Known.REAL_TIME_PAYMENTS_TRANSFER_ACKNOWLEDGEMENT
                    SAMPLE_FUNDS -> Known.SAMPLE_FUNDS
                    WIRE_TRANSFER_INTENTION -> Known.WIRE_TRANSFER_INTENTION
                    OTHER -> Known.OTHER
                    else -> throw IncreaseInvalidDataException("Unknown In: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws IncreaseInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    IncreaseInvalidDataException("Value is not a String")
                }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is In && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Category && in_ == other.in_ && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(in_, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Category{in_=$in_, additionalProperties=$additionalProperties}"
    }

    class CreatedAt
    private constructor(
        private val after: OffsetDateTime?,
        private val before: OffsetDateTime?,
        private val onOrAfter: OffsetDateTime?,
        private val onOrBefore: OffsetDateTime?,
        private val additionalProperties: QueryParams,
    ) {

        /**
         * Return results after this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) timestamp.
         */
        fun after(): Optional<OffsetDateTime> = Optional.ofNullable(after)

        /**
         * Return results before this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) timestamp.
         */
        fun before(): Optional<OffsetDateTime> = Optional.ofNullable(before)

        /**
         * Return results on or after this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
         * timestamp.
         */
        fun onOrAfter(): Optional<OffsetDateTime> = Optional.ofNullable(onOrAfter)

        /**
         * Return results on or before this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
         * timestamp.
         */
        fun onOrBefore(): Optional<OffsetDateTime> = Optional.ofNullable(onOrBefore)

        fun _additionalProperties(): QueryParams = additionalProperties

        @JvmSynthetic
        internal fun forEachQueryParam(putParam: (String, List<String>) -> Unit) {
            this.after?.let {
                putParam("after", listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)))
            }
            this.before?.let {
                putParam("before", listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)))
            }
            this.onOrAfter?.let {
                putParam("on_or_after", listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)))
            }
            this.onOrBefore?.let {
                putParam("on_or_before", listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)))
            }
            additionalProperties.keys().forEach { putParam(it, additionalProperties.values(it)) }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CreatedAt]. */
        class Builder internal constructor() {

            private var after: OffsetDateTime? = null
            private var before: OffsetDateTime? = null
            private var onOrAfter: OffsetDateTime? = null
            private var onOrBefore: OffsetDateTime? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(createdAt: CreatedAt) = apply {
                after = createdAt.after
                before = createdAt.before
                onOrAfter = createdAt.onOrAfter
                onOrBefore = createdAt.onOrBefore
                additionalProperties = createdAt.additionalProperties.toBuilder()
            }

            /**
             * Return results after this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            fun after(after: OffsetDateTime?) = apply { this.after = after }

            /**
             * Return results after this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            fun after(after: Optional<OffsetDateTime>) = after(after.getOrNull())

            /**
             * Return results before this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            fun before(before: OffsetDateTime?) = apply { this.before = before }

            /**
             * Return results before this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            fun before(before: Optional<OffsetDateTime>) = before(before.getOrNull())

            /**
             * Return results on or after this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            fun onOrAfter(onOrAfter: OffsetDateTime?) = apply { this.onOrAfter = onOrAfter }

            /**
             * Return results on or after this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            fun onOrAfter(onOrAfter: Optional<OffsetDateTime>) = onOrAfter(onOrAfter.getOrNull())

            /**
             * Return results on or before this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            fun onOrBefore(onOrBefore: OffsetDateTime?) = apply { this.onOrBefore = onOrBefore }

            /**
             * Return results on or before this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            fun onOrBefore(onOrBefore: Optional<OffsetDateTime>) =
                onOrBefore(onOrBefore.getOrNull())

            fun additionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun additionalProperties(additionalProperties: Map<String, Iterable<String>>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: String) = apply {
                additionalProperties.put(key, value)
            }

            fun putAdditionalProperties(key: String, values: Iterable<String>) = apply {
                additionalProperties.put(key, values)
            }

            fun putAllAdditionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, Iterable<String>>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun replaceAdditionalProperties(key: String, value: String) = apply {
                additionalProperties.replace(key, value)
            }

            fun replaceAdditionalProperties(key: String, values: Iterable<String>) = apply {
                additionalProperties.replace(key, values)
            }

            fun replaceAllAdditionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.replaceAll(additionalProperties)
            }

            fun replaceAllAdditionalProperties(
                additionalProperties: Map<String, Iterable<String>>
            ) = apply { this.additionalProperties.replaceAll(additionalProperties) }

            fun removeAdditionalProperties(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                additionalProperties.removeAll(keys)
            }

            fun build(): CreatedAt =
                CreatedAt(after, before, onOrAfter, onOrBefore, additionalProperties.build())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CreatedAt && after == other.after && before == other.before && onOrAfter == other.onOrAfter && onOrBefore == other.onOrBefore && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(after, before, onOrAfter, onOrBefore, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CreatedAt{after=$after, before=$before, onOrAfter=$onOrAfter, onOrBefore=$onOrBefore, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is TransactionListParams && accountId == other.accountId && category == other.category && createdAt == other.createdAt && cursor == other.cursor && limit == other.limit && routeId == other.routeId && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(accountId, category, createdAt, cursor, limit, routeId, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "TransactionListParams{accountId=$accountId, category=$category, createdAt=$createdAt, cursor=$cursor, limit=$limit, routeId=$routeId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
