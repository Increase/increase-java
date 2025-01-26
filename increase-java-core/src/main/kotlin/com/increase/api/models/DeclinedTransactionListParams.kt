// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.increase.api.core.Enum
import com.increase.api.core.JsonField
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.core.toImmutable
import com.increase.api.errors.IncreaseInvalidDataException
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional

/** List Declined Transactions */
class DeclinedTransactionListParams
private constructor(
    private val accountId: String?,
    private val category: Category?,
    private val createdAt: CreatedAt?,
    private val cursor: String?,
    private val limit: Long?,
    private val routeId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    /** Filter Declined Transactions to ones belonging to the specified Account. */
    fun accountId(): Optional<String> = Optional.ofNullable(accountId)

    fun category(): Optional<Category> = Optional.ofNullable(category)

    fun createdAt(): Optional<CreatedAt> = Optional.ofNullable(createdAt)

    /** Return the page of entries after this one. */
    fun cursor(): Optional<String> = Optional.ofNullable(cursor)

    /** Limit the size of the list that is returned. The default (and maximum) is 100 objects. */
    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    /** Filter Declined Transactions to those belonging to the specified route. */
    fun routeId(): Optional<String> = Optional.ofNullable(routeId)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic
    internal fun getQueryParams(): QueryParams {
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

        @JvmStatic fun builder() = Builder()
    }

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
        internal fun from(declinedTransactionListParams: DeclinedTransactionListParams) = apply {
            accountId = declinedTransactionListParams.accountId
            category = declinedTransactionListParams.category
            createdAt = declinedTransactionListParams.createdAt
            cursor = declinedTransactionListParams.cursor
            limit = declinedTransactionListParams.limit
            routeId = declinedTransactionListParams.routeId
            additionalHeaders = declinedTransactionListParams.additionalHeaders.toBuilder()
            additionalQueryParams = declinedTransactionListParams.additionalQueryParams.toBuilder()
        }

        /** Filter Declined Transactions to ones belonging to the specified Account. */
        fun accountId(accountId: String?) = apply { this.accountId = accountId }

        /** Filter Declined Transactions to ones belonging to the specified Account. */
        fun accountId(accountId: Optional<String>) = accountId(accountId.orElse(null))

        fun category(category: Category?) = apply { this.category = category }

        fun category(category: Optional<Category>) = category(category.orElse(null))

        fun createdAt(createdAt: CreatedAt?) = apply { this.createdAt = createdAt }

        fun createdAt(createdAt: Optional<CreatedAt>) = createdAt(createdAt.orElse(null))

        /** Return the page of entries after this one. */
        fun cursor(cursor: String?) = apply { this.cursor = cursor }

        /** Return the page of entries after this one. */
        fun cursor(cursor: Optional<String>) = cursor(cursor.orElse(null))

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
        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun limit(limit: Optional<Long>) = limit(limit.orElse(null) as Long?)

        /** Filter Declined Transactions to those belonging to the specified route. */
        fun routeId(routeId: String?) = apply { this.routeId = routeId }

        /** Filter Declined Transactions to those belonging to the specified route. */
        fun routeId(routeId: Optional<String>) = routeId(routeId.orElse(null))

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

        fun build(): DeclinedTransactionListParams =
            DeclinedTransactionListParams(
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
    private constructor(
        private val in_: List<In>?,
        private val additionalProperties: QueryParams,
    ) {

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
            fun in_(in_: Optional<List<In>>) = in_(in_.orElse(null))

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

        class In
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                /** ACH Decline: details will be under the `ach_decline` object. */
                @JvmField val ACH_DECLINE = of("ach_decline")

                /** Card Decline: details will be under the `card_decline` object. */
                @JvmField val CARD_DECLINE = of("card_decline")

                /** Check Decline: details will be under the `check_decline` object. */
                @JvmField val CHECK_DECLINE = of("check_decline")

                /**
                 * Inbound Real-Time Payments Transfer Decline: details will be under the
                 * `inbound_real_time_payments_transfer_decline` object.
                 */
                @JvmField
                val INBOUND_REAL_TIME_PAYMENTS_TRANSFER_DECLINE =
                    of("inbound_real_time_payments_transfer_decline")

                /** Wire Decline: details will be under the `wire_decline` object. */
                @JvmField val WIRE_DECLINE = of("wire_decline")

                /**
                 * Check Deposit Rejection: details will be under the `check_deposit_rejection`
                 * object.
                 */
                @JvmField val CHECK_DEPOSIT_REJECTION = of("check_deposit_rejection")

                /** The Declined Transaction was made for an undocumented or deprecated reason. */
                @JvmField val OTHER = of("other")

                @JvmStatic fun of(value: String) = In(JsonField.of(value))
            }

            enum class Known {
                /** ACH Decline: details will be under the `ach_decline` object. */
                ACH_DECLINE,
                /** Card Decline: details will be under the `card_decline` object. */
                CARD_DECLINE,
                /** Check Decline: details will be under the `check_decline` object. */
                CHECK_DECLINE,
                /**
                 * Inbound Real-Time Payments Transfer Decline: details will be under the
                 * `inbound_real_time_payments_transfer_decline` object.
                 */
                INBOUND_REAL_TIME_PAYMENTS_TRANSFER_DECLINE,
                /** Wire Decline: details will be under the `wire_decline` object. */
                WIRE_DECLINE,
                /**
                 * Check Deposit Rejection: details will be under the `check_deposit_rejection`
                 * object.
                 */
                CHECK_DEPOSIT_REJECTION,
                /** The Declined Transaction was made for an undocumented or deprecated reason. */
                OTHER,
            }

            enum class Value {
                /** ACH Decline: details will be under the `ach_decline` object. */
                ACH_DECLINE,
                /** Card Decline: details will be under the `card_decline` object. */
                CARD_DECLINE,
                /** Check Decline: details will be under the `check_decline` object. */
                CHECK_DECLINE,
                /**
                 * Inbound Real-Time Payments Transfer Decline: details will be under the
                 * `inbound_real_time_payments_transfer_decline` object.
                 */
                INBOUND_REAL_TIME_PAYMENTS_TRANSFER_DECLINE,
                /** Wire Decline: details will be under the `wire_decline` object. */
                WIRE_DECLINE,
                /**
                 * Check Deposit Rejection: details will be under the `check_deposit_rejection`
                 * object.
                 */
                CHECK_DEPOSIT_REJECTION,
                /** The Declined Transaction was made for an undocumented or deprecated reason. */
                OTHER,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    ACH_DECLINE -> Value.ACH_DECLINE
                    CARD_DECLINE -> Value.CARD_DECLINE
                    CHECK_DECLINE -> Value.CHECK_DECLINE
                    INBOUND_REAL_TIME_PAYMENTS_TRANSFER_DECLINE ->
                        Value.INBOUND_REAL_TIME_PAYMENTS_TRANSFER_DECLINE
                    WIRE_DECLINE -> Value.WIRE_DECLINE
                    CHECK_DEPOSIT_REJECTION -> Value.CHECK_DEPOSIT_REJECTION
                    OTHER -> Value.OTHER
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    ACH_DECLINE -> Known.ACH_DECLINE
                    CARD_DECLINE -> Known.CARD_DECLINE
                    CHECK_DECLINE -> Known.CHECK_DECLINE
                    INBOUND_REAL_TIME_PAYMENTS_TRANSFER_DECLINE ->
                        Known.INBOUND_REAL_TIME_PAYMENTS_TRANSFER_DECLINE
                    WIRE_DECLINE -> Known.WIRE_DECLINE
                    CHECK_DEPOSIT_REJECTION -> Known.CHECK_DEPOSIT_REJECTION
                    OTHER -> Known.OTHER
                    else -> throw IncreaseInvalidDataException("Unknown In: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

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
            fun after(after: Optional<OffsetDateTime>) = after(after.orElse(null))

            /**
             * Return results before this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            fun before(before: OffsetDateTime?) = apply { this.before = before }

            /**
             * Return results before this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            fun before(before: Optional<OffsetDateTime>) = before(before.orElse(null))

            /**
             * Return results on or after this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            fun onOrAfter(onOrAfter: OffsetDateTime?) = apply { this.onOrAfter = onOrAfter }

            /**
             * Return results on or after this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            fun onOrAfter(onOrAfter: Optional<OffsetDateTime>) = onOrAfter(onOrAfter.orElse(null))

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
                onOrBefore(onOrBefore.orElse(null))

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
                CreatedAt(
                    after,
                    before,
                    onOrAfter,
                    onOrBefore,
                    additionalProperties.build(),
                )
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

        return /* spotless:off */ other is DeclinedTransactionListParams && accountId == other.accountId && category == other.category && createdAt == other.createdAt && cursor == other.cursor && limit == other.limit && routeId == other.routeId && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(accountId, category, createdAt, cursor, limit, routeId, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "DeclinedTransactionListParams{accountId=$accountId, category=$category, createdAt=$createdAt, cursor=$cursor, limit=$limit, routeId=$routeId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
