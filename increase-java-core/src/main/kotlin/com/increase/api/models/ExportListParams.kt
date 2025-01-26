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

/** List Exports */
class ExportListParams
private constructor(
    private val category: Category?,
    private val createdAt: CreatedAt?,
    private val cursor: String?,
    private val idempotencyKey: String?,
    private val limit: Long?,
    private val status: Status?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun category(): Optional<Category> = Optional.ofNullable(category)

    fun createdAt(): Optional<CreatedAt> = Optional.ofNullable(createdAt)

    /** Return the page of entries after this one. */
    fun cursor(): Optional<String> = Optional.ofNullable(cursor)

    /**
     * Filter records to the one with the specified `idempotency_key` you chose for that object.
     * This value is unique across Increase and is used to ensure that a request is only processed
     * once. Learn more about [idempotency](https://increase.com/documentation/idempotency-keys).
     */
    fun idempotencyKey(): Optional<String> = Optional.ofNullable(idempotencyKey)

    /** Limit the size of the list that is returned. The default (and maximum) is 100 objects. */
    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    fun status(): Optional<Status> = Optional.ofNullable(status)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic
    internal fun getQueryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.category?.forEachQueryParam { key, values -> queryParams.put("category.$key", values) }
        this.createdAt?.forEachQueryParam { key, values ->
            queryParams.put("created_at.$key", values)
        }
        this.cursor?.let { queryParams.put("cursor", listOf(it.toString())) }
        this.idempotencyKey?.let { queryParams.put("idempotency_key", listOf(it.toString())) }
        this.limit?.let { queryParams.put("limit", listOf(it.toString())) }
        this.status?.forEachQueryParam { key, values -> queryParams.put("status.$key", values) }
        queryParams.putAll(additionalQueryParams)
        return queryParams.build()
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder internal constructor() {

        private var category: Category? = null
        private var createdAt: CreatedAt? = null
        private var cursor: String? = null
        private var idempotencyKey: String? = null
        private var limit: Long? = null
        private var status: Status? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(exportListParams: ExportListParams) = apply {
            category = exportListParams.category
            createdAt = exportListParams.createdAt
            cursor = exportListParams.cursor
            idempotencyKey = exportListParams.idempotencyKey
            limit = exportListParams.limit
            status = exportListParams.status
            additionalHeaders = exportListParams.additionalHeaders.toBuilder()
            additionalQueryParams = exportListParams.additionalQueryParams.toBuilder()
        }

        fun category(category: Category?) = apply { this.category = category }

        fun category(category: Optional<Category>) = category(category.orElse(null))

        fun createdAt(createdAt: CreatedAt?) = apply { this.createdAt = createdAt }

        fun createdAt(createdAt: Optional<CreatedAt>) = createdAt(createdAt.orElse(null))

        /** Return the page of entries after this one. */
        fun cursor(cursor: String?) = apply { this.cursor = cursor }

        /** Return the page of entries after this one. */
        fun cursor(cursor: Optional<String>) = cursor(cursor.orElse(null))

        /**
         * Filter records to the one with the specified `idempotency_key` you chose for that object.
         * This value is unique across Increase and is used to ensure that a request is only
         * processed once. Learn more about
         * [idempotency](https://increase.com/documentation/idempotency-keys).
         */
        fun idempotencyKey(idempotencyKey: String?) = apply { this.idempotencyKey = idempotencyKey }

        /**
         * Filter records to the one with the specified `idempotency_key` you chose for that object.
         * This value is unique across Increase and is used to ensure that a request is only
         * processed once. Learn more about
         * [idempotency](https://increase.com/documentation/idempotency-keys).
         */
        fun idempotencyKey(idempotencyKey: Optional<String>) =
            idempotencyKey(idempotencyKey.orElse(null))

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

        fun status(status: Status?) = apply { this.status = status }

        fun status(status: Optional<Status>) = status(status.orElse(null))

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

        fun build(): ExportListParams =
            ExportListParams(
                category,
                createdAt,
                cursor,
                idempotencyKey,
                limit,
                status,
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
         * Filter Exports for those with the specified category or categories. For GET requests,
         * this should be encoded as a comma-delimited string, such as `?in=one,two,three`.
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
             * Filter Exports for those with the specified category or categories. For GET requests,
             * this should be encoded as a comma-delimited string, such as `?in=one,two,three`.
             */
            fun in_(in_: List<In>?) = apply { this.in_ = in_?.toMutableList() }

            /**
             * Filter Exports for those with the specified category or categories. For GET requests,
             * this should be encoded as a comma-delimited string, such as `?in=one,two,three`.
             */
            fun in_(in_: Optional<List<In>>) = in_(in_.orElse(null))

            /**
             * Filter Exports for those with the specified category or categories. For GET requests,
             * this should be encoded as a comma-delimited string, such as `?in=one,two,three`.
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

                /**
                 * Export an Open Financial Exchange (OFX) file of transactions and balances for a
                 * given time range and Account.
                 */
                @JvmField val ACCOUNT_STATEMENT_OFX = of("account_statement_ofx")

                /** Export a CSV of all transactions for a given time range. */
                @JvmField val TRANSACTION_CSV = of("transaction_csv")

                /** Export a CSV of account balances for the dates in a given range. */
                @JvmField val BALANCE_CSV = of("balance_csv")

                /** Export a CSV of bookkeeping account balances for the dates in a given range. */
                @JvmField
                val BOOKKEEPING_ACCOUNT_BALANCE_CSV = of("bookkeeping_account_balance_csv")

                /** Export a CSV of entities with a given status. */
                @JvmField val ENTITY_CSV = of("entity_csv")

                /** Export a CSV of vendors added to the third-party risk management dashboard. */
                @JvmField val VENDOR_CSV = of("vendor_csv")

                /**
                 * Certain dashboard tables are available as CSV exports. This export cannot be
                 * created via the API.
                 */
                @JvmField val DASHBOARD_TABLE_CSV = of("dashboard_table_csv")

                @JvmStatic fun of(value: String) = In(JsonField.of(value))
            }

            enum class Known {
                /**
                 * Export an Open Financial Exchange (OFX) file of transactions and balances for a
                 * given time range and Account.
                 */
                ACCOUNT_STATEMENT_OFX,
                /** Export a CSV of all transactions for a given time range. */
                TRANSACTION_CSV,
                /** Export a CSV of account balances for the dates in a given range. */
                BALANCE_CSV,
                /** Export a CSV of bookkeeping account balances for the dates in a given range. */
                BOOKKEEPING_ACCOUNT_BALANCE_CSV,
                /** Export a CSV of entities with a given status. */
                ENTITY_CSV,
                /** Export a CSV of vendors added to the third-party risk management dashboard. */
                VENDOR_CSV,
                /**
                 * Certain dashboard tables are available as CSV exports. This export cannot be
                 * created via the API.
                 */
                DASHBOARD_TABLE_CSV,
            }

            enum class Value {
                /**
                 * Export an Open Financial Exchange (OFX) file of transactions and balances for a
                 * given time range and Account.
                 */
                ACCOUNT_STATEMENT_OFX,
                /** Export a CSV of all transactions for a given time range. */
                TRANSACTION_CSV,
                /** Export a CSV of account balances for the dates in a given range. */
                BALANCE_CSV,
                /** Export a CSV of bookkeeping account balances for the dates in a given range. */
                BOOKKEEPING_ACCOUNT_BALANCE_CSV,
                /** Export a CSV of entities with a given status. */
                ENTITY_CSV,
                /** Export a CSV of vendors added to the third-party risk management dashboard. */
                VENDOR_CSV,
                /**
                 * Certain dashboard tables are available as CSV exports. This export cannot be
                 * created via the API.
                 */
                DASHBOARD_TABLE_CSV,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    ACCOUNT_STATEMENT_OFX -> Value.ACCOUNT_STATEMENT_OFX
                    TRANSACTION_CSV -> Value.TRANSACTION_CSV
                    BALANCE_CSV -> Value.BALANCE_CSV
                    BOOKKEEPING_ACCOUNT_BALANCE_CSV -> Value.BOOKKEEPING_ACCOUNT_BALANCE_CSV
                    ENTITY_CSV -> Value.ENTITY_CSV
                    VENDOR_CSV -> Value.VENDOR_CSV
                    DASHBOARD_TABLE_CSV -> Value.DASHBOARD_TABLE_CSV
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    ACCOUNT_STATEMENT_OFX -> Known.ACCOUNT_STATEMENT_OFX
                    TRANSACTION_CSV -> Known.TRANSACTION_CSV
                    BALANCE_CSV -> Known.BALANCE_CSV
                    BOOKKEEPING_ACCOUNT_BALANCE_CSV -> Known.BOOKKEEPING_ACCOUNT_BALANCE_CSV
                    ENTITY_CSV -> Known.ENTITY_CSV
                    VENDOR_CSV -> Known.VENDOR_CSV
                    DASHBOARD_TABLE_CSV -> Known.DASHBOARD_TABLE_CSV
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

    class Status
    private constructor(
        private val in_: List<In>?,
        private val additionalProperties: QueryParams,
    ) {

        /**
         * Filter Exports for those with the specified status or statuses. For GET requests, this
         * should be encoded as a comma-delimited string, such as `?in=one,two,three`.
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
            internal fun from(status: Status) = apply {
                in_ = status.in_?.toMutableList()
                additionalProperties = status.additionalProperties.toBuilder()
            }

            /**
             * Filter Exports for those with the specified status or statuses. For GET requests,
             * this should be encoded as a comma-delimited string, such as `?in=one,two,three`.
             */
            fun in_(in_: List<In>?) = apply { this.in_ = in_?.toMutableList() }

            /**
             * Filter Exports for those with the specified status or statuses. For GET requests,
             * this should be encoded as a comma-delimited string, such as `?in=one,two,three`.
             */
            fun in_(in_: Optional<List<In>>) = in_(in_.orElse(null))

            /**
             * Filter Exports for those with the specified status or statuses. For GET requests,
             * this should be encoded as a comma-delimited string, such as `?in=one,two,three`.
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

            fun build(): Status = Status(in_?.toImmutable(), additionalProperties.build())
        }

        class In
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                /** Increase is generating the export. */
                @JvmField val PENDING = of("pending")

                /** The export has been successfully generated. */
                @JvmField val COMPLETE = of("complete")

                /**
                 * The export failed to generate. Increase will reach out to you to resolve the
                 * issue.
                 */
                @JvmField val FAILED = of("failed")

                @JvmStatic fun of(value: String) = In(JsonField.of(value))
            }

            enum class Known {
                /** Increase is generating the export. */
                PENDING,
                /** The export has been successfully generated. */
                COMPLETE,
                /**
                 * The export failed to generate. Increase will reach out to you to resolve the
                 * issue.
                 */
                FAILED,
            }

            enum class Value {
                /** Increase is generating the export. */
                PENDING,
                /** The export has been successfully generated. */
                COMPLETE,
                /**
                 * The export failed to generate. Increase will reach out to you to resolve the
                 * issue.
                 */
                FAILED,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    PENDING -> Value.PENDING
                    COMPLETE -> Value.COMPLETE
                    FAILED -> Value.FAILED
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    PENDING -> Known.PENDING
                    COMPLETE -> Known.COMPLETE
                    FAILED -> Known.FAILED
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

            return /* spotless:off */ other is Status && in_ == other.in_ && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(in_, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Status{in_=$in_, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ExportListParams && category == other.category && createdAt == other.createdAt && cursor == other.cursor && idempotencyKey == other.idempotencyKey && limit == other.limit && status == other.status && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(category, createdAt, cursor, idempotencyKey, limit, status, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ExportListParams{category=$category, createdAt=$createdAt, cursor=$cursor, idempotencyKey=$idempotencyKey, limit=$limit, status=$status, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
