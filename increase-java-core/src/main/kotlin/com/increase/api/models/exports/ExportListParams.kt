// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.exports

import com.fasterxml.jackson.annotation.JsonCreator
import com.increase.api.core.Enum
import com.increase.api.core.JsonField
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

/** List Exports */
class ExportListParams
private constructor(
    private val category: Category?,
    private val createdAt: CreatedAt?,
    private val cursor: String?,
    private val form1099Int: Form1099Int?,
    private val form1099Misc: Form1099Misc?,
    private val idempotencyKey: String?,
    private val limit: Long?,
    private val status: Status?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Filter Exports for those with the specified category. */
    fun category(): Optional<Category> = Optional.ofNullable(category)

    fun createdAt(): Optional<CreatedAt> = Optional.ofNullable(createdAt)

    /** Return the page of entries after this one. */
    fun cursor(): Optional<String> = Optional.ofNullable(cursor)

    fun form1099Int(): Optional<Form1099Int> = Optional.ofNullable(form1099Int)

    fun form1099Misc(): Optional<Form1099Misc> = Optional.ofNullable(form1099Misc)

    /**
     * Filter records to the one with the specified `idempotency_key` you chose for that object.
     * This value is unique across Increase and is used to ensure that a request is only processed
     * once. Learn more about [idempotency](https://increase.com/documentation/idempotency-keys).
     */
    fun idempotencyKey(): Optional<String> = Optional.ofNullable(idempotencyKey)

    /** Limit the size of the list that is returned. The default (and maximum) is 100 objects. */
    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    fun status(): Optional<Status> = Optional.ofNullable(status)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): ExportListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [ExportListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExportListParams]. */
    class Builder internal constructor() {

        private var category: Category? = null
        private var createdAt: CreatedAt? = null
        private var cursor: String? = null
        private var form1099Int: Form1099Int? = null
        private var form1099Misc: Form1099Misc? = null
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
            form1099Int = exportListParams.form1099Int
            form1099Misc = exportListParams.form1099Misc
            idempotencyKey = exportListParams.idempotencyKey
            limit = exportListParams.limit
            status = exportListParams.status
            additionalHeaders = exportListParams.additionalHeaders.toBuilder()
            additionalQueryParams = exportListParams.additionalQueryParams.toBuilder()
        }

        /** Filter Exports for those with the specified category. */
        fun category(category: Category?) = apply { this.category = category }

        /** Alias for calling [Builder.category] with `category.orElse(null)`. */
        fun category(category: Optional<Category>) = category(category.getOrNull())

        fun createdAt(createdAt: CreatedAt?) = apply { this.createdAt = createdAt }

        /** Alias for calling [Builder.createdAt] with `createdAt.orElse(null)`. */
        fun createdAt(createdAt: Optional<CreatedAt>) = createdAt(createdAt.getOrNull())

        /** Return the page of entries after this one. */
        fun cursor(cursor: String?) = apply { this.cursor = cursor }

        /** Alias for calling [Builder.cursor] with `cursor.orElse(null)`. */
        fun cursor(cursor: Optional<String>) = cursor(cursor.getOrNull())

        fun form1099Int(form1099Int: Form1099Int?) = apply { this.form1099Int = form1099Int }

        /** Alias for calling [Builder.form1099Int] with `form1099Int.orElse(null)`. */
        fun form1099Int(form1099Int: Optional<Form1099Int>) = form1099Int(form1099Int.getOrNull())

        fun form1099Misc(form1099Misc: Form1099Misc?) = apply { this.form1099Misc = form1099Misc }

        /** Alias for calling [Builder.form1099Misc] with `form1099Misc.orElse(null)`. */
        fun form1099Misc(form1099Misc: Optional<Form1099Misc>) =
            form1099Misc(form1099Misc.getOrNull())

        /**
         * Filter records to the one with the specified `idempotency_key` you chose for that object.
         * This value is unique across Increase and is used to ensure that a request is only
         * processed once. Learn more about
         * [idempotency](https://increase.com/documentation/idempotency-keys).
         */
        fun idempotencyKey(idempotencyKey: String?) = apply { this.idempotencyKey = idempotencyKey }

        /** Alias for calling [Builder.idempotencyKey] with `idempotencyKey.orElse(null)`. */
        fun idempotencyKey(idempotencyKey: Optional<String>) =
            idempotencyKey(idempotencyKey.getOrNull())

        /**
         * Limit the size of the list that is returned. The default (and maximum) is 100 objects.
         */
        fun limit(limit: Long?) = apply { this.limit = limit }

        /**
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Long) = limit(limit as Long?)

        /** Alias for calling [Builder.limit] with `limit.orElse(null)`. */
        fun limit(limit: Optional<Long>) = limit(limit.getOrNull())

        fun status(status: Status?) = apply { this.status = status }

        /** Alias for calling [Builder.status] with `status.orElse(null)`. */
        fun status(status: Optional<Status>) = status(status.getOrNull())

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
         * Returns an immutable instance of [ExportListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ExportListParams =
            ExportListParams(
                category,
                createdAt,
                cursor,
                form1099Int,
                form1099Misc,
                idempotencyKey,
                limit,
                status,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                category?.let { put("category", it.toString()) }
                createdAt?.let {
                    it.after().ifPresent {
                        put("created_at.after", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                    }
                    it.before().ifPresent {
                        put("created_at.before", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                    }
                    it.onOrAfter().ifPresent {
                        put(
                            "created_at.on_or_after",
                            DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it),
                        )
                    }
                    it.onOrBefore().ifPresent {
                        put(
                            "created_at.on_or_before",
                            DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it),
                        )
                    }
                    it._additionalProperties().keys().forEach { key ->
                        it._additionalProperties().values(key).forEach { value ->
                            put("created_at.$key", value)
                        }
                    }
                }
                cursor?.let { put("cursor", it) }
                form1099Int?.let {
                    it.accountId().ifPresent { put("form_1099_int.account_id", it) }
                    it._additionalProperties().keys().forEach { key ->
                        it._additionalProperties().values(key).forEach { value ->
                            put("form_1099_int.$key", value)
                        }
                    }
                }
                form1099Misc?.let {
                    it.accountId().ifPresent { put("form_1099_misc.account_id", it) }
                    it._additionalProperties().keys().forEach { key ->
                        it._additionalProperties().values(key).forEach { value ->
                            put("form_1099_misc.$key", value)
                        }
                    }
                }
                idempotencyKey?.let { put("idempotency_key", it) }
                limit?.let { put("limit", it.toString()) }
                status?.let {
                    it.in_().ifPresent { put("status.in", it.joinToString(",") { it.toString() }) }
                    it._additionalProperties().keys().forEach { key ->
                        it._additionalProperties().values(key).forEach { value ->
                            put("status.$key", value)
                        }
                    }
                }
                putAll(additionalQueryParams)
            }
            .build()

    /** Filter Exports for those with the specified category. */
    class Category @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            /**
             * Export an Open Financial Exchange (OFX) file of transactions and balances for a given
             * time range and Account.
             */
            @JvmField val ACCOUNT_STATEMENT_OFX = of("account_statement_ofx")

            /**
             * Export a BAI2 file of transactions and balances for a given date and optional
             * Account.
             */
            @JvmField val ACCOUNT_STATEMENT_BAI2 = of("account_statement_bai2")

            /** Export a CSV of all transactions for a given time range. */
            @JvmField val TRANSACTION_CSV = of("transaction_csv")

            /** Export a CSV of account balances for the dates in a given range. */
            @JvmField val BALANCE_CSV = of("balance_csv")

            /** Export a CSV of bookkeeping account balances for the dates in a given range. */
            @JvmField val BOOKKEEPING_ACCOUNT_BALANCE_CSV = of("bookkeeping_account_balance_csv")

            /** Export a CSV of entities with a given status. */
            @JvmField val ENTITY_CSV = of("entity_csv")

            /** Export a CSV of vendors added to the third-party risk management dashboard. */
            @JvmField val VENDOR_CSV = of("vendor_csv")

            /**
             * Certain dashboard tables are available as CSV exports. This export cannot be created
             * via the API.
             */
            @JvmField val DASHBOARD_TABLE_CSV = of("dashboard_table_csv")

            /** A PDF of an account verification letter. */
            @JvmField val ACCOUNT_VERIFICATION_LETTER = of("account_verification_letter")

            /** A PDF of funding instructions. */
            @JvmField val FUNDING_INSTRUCTIONS = of("funding_instructions")

            /** A PDF of an Internal Revenue Service Form 1099-INT. */
            @JvmField val FORM_1099_INT = of("form_1099_int")

            /** A PDF of an Internal Revenue Service Form 1099-MISC. */
            @JvmField val FORM_1099_MISC = of("form_1099_misc")

            /**
             * Export a CSV of fees. The time range must not include any fees that are part of an
             * open fee statement.
             */
            @JvmField val FEE_CSV = of("fee_csv")

            /** A PDF of a voided check. */
            @JvmField val VOIDED_CHECK = of("voided_check")

            @JvmStatic fun of(value: String) = Category(JsonField.of(value))
        }

        /** An enum containing [Category]'s known values. */
        enum class Known {
            /**
             * Export an Open Financial Exchange (OFX) file of transactions and balances for a given
             * time range and Account.
             */
            ACCOUNT_STATEMENT_OFX,
            /**
             * Export a BAI2 file of transactions and balances for a given date and optional
             * Account.
             */
            ACCOUNT_STATEMENT_BAI2,
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
             * Certain dashboard tables are available as CSV exports. This export cannot be created
             * via the API.
             */
            DASHBOARD_TABLE_CSV,
            /** A PDF of an account verification letter. */
            ACCOUNT_VERIFICATION_LETTER,
            /** A PDF of funding instructions. */
            FUNDING_INSTRUCTIONS,
            /** A PDF of an Internal Revenue Service Form 1099-INT. */
            FORM_1099_INT,
            /** A PDF of an Internal Revenue Service Form 1099-MISC. */
            FORM_1099_MISC,
            /**
             * Export a CSV of fees. The time range must not include any fees that are part of an
             * open fee statement.
             */
            FEE_CSV,
            /** A PDF of a voided check. */
            VOIDED_CHECK,
        }

        /**
         * An enum containing [Category]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Category] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            /**
             * Export an Open Financial Exchange (OFX) file of transactions and balances for a given
             * time range and Account.
             */
            ACCOUNT_STATEMENT_OFX,
            /**
             * Export a BAI2 file of transactions and balances for a given date and optional
             * Account.
             */
            ACCOUNT_STATEMENT_BAI2,
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
             * Certain dashboard tables are available as CSV exports. This export cannot be created
             * via the API.
             */
            DASHBOARD_TABLE_CSV,
            /** A PDF of an account verification letter. */
            ACCOUNT_VERIFICATION_LETTER,
            /** A PDF of funding instructions. */
            FUNDING_INSTRUCTIONS,
            /** A PDF of an Internal Revenue Service Form 1099-INT. */
            FORM_1099_INT,
            /** A PDF of an Internal Revenue Service Form 1099-MISC. */
            FORM_1099_MISC,
            /**
             * Export a CSV of fees. The time range must not include any fees that are part of an
             * open fee statement.
             */
            FEE_CSV,
            /** A PDF of a voided check. */
            VOIDED_CHECK,
            /** An enum member indicating that [Category] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                ACCOUNT_STATEMENT_OFX -> Value.ACCOUNT_STATEMENT_OFX
                ACCOUNT_STATEMENT_BAI2 -> Value.ACCOUNT_STATEMENT_BAI2
                TRANSACTION_CSV -> Value.TRANSACTION_CSV
                BALANCE_CSV -> Value.BALANCE_CSV
                BOOKKEEPING_ACCOUNT_BALANCE_CSV -> Value.BOOKKEEPING_ACCOUNT_BALANCE_CSV
                ENTITY_CSV -> Value.ENTITY_CSV
                VENDOR_CSV -> Value.VENDOR_CSV
                DASHBOARD_TABLE_CSV -> Value.DASHBOARD_TABLE_CSV
                ACCOUNT_VERIFICATION_LETTER -> Value.ACCOUNT_VERIFICATION_LETTER
                FUNDING_INSTRUCTIONS -> Value.FUNDING_INSTRUCTIONS
                FORM_1099_INT -> Value.FORM_1099_INT
                FORM_1099_MISC -> Value.FORM_1099_MISC
                FEE_CSV -> Value.FEE_CSV
                VOIDED_CHECK -> Value.VOIDED_CHECK
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws IncreaseInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                ACCOUNT_STATEMENT_OFX -> Known.ACCOUNT_STATEMENT_OFX
                ACCOUNT_STATEMENT_BAI2 -> Known.ACCOUNT_STATEMENT_BAI2
                TRANSACTION_CSV -> Known.TRANSACTION_CSV
                BALANCE_CSV -> Known.BALANCE_CSV
                BOOKKEEPING_ACCOUNT_BALANCE_CSV -> Known.BOOKKEEPING_ACCOUNT_BALANCE_CSV
                ENTITY_CSV -> Known.ENTITY_CSV
                VENDOR_CSV -> Known.VENDOR_CSV
                DASHBOARD_TABLE_CSV -> Known.DASHBOARD_TABLE_CSV
                ACCOUNT_VERIFICATION_LETTER -> Known.ACCOUNT_VERIFICATION_LETTER
                FUNDING_INSTRUCTIONS -> Known.FUNDING_INSTRUCTIONS
                FORM_1099_INT -> Known.FORM_1099_INT
                FORM_1099_MISC -> Known.FORM_1099_MISC
                FEE_CSV -> Known.FEE_CSV
                VOIDED_CHECK -> Known.VOIDED_CHECK
                else -> throw IncreaseInvalidDataException("Unknown Category: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws IncreaseInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                IncreaseInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        fun validate(): Category = apply {
            if (validated) {
                return@apply
            }

            known()
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
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Category && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
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

        /** Query params to send with the request. */
        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [CreatedAt]. */
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

            /** Alias for calling [Builder.after] with `after.orElse(null)`. */
            fun after(after: Optional<OffsetDateTime>) = after(after.getOrNull())

            /**
             * Return results before this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            fun before(before: OffsetDateTime?) = apply { this.before = before }

            /** Alias for calling [Builder.before] with `before.orElse(null)`. */
            fun before(before: Optional<OffsetDateTime>) = before(before.getOrNull())

            /**
             * Return results on or after this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            fun onOrAfter(onOrAfter: OffsetDateTime?) = apply { this.onOrAfter = onOrAfter }

            /** Alias for calling [Builder.onOrAfter] with `onOrAfter.orElse(null)`. */
            fun onOrAfter(onOrAfter: Optional<OffsetDateTime>) = onOrAfter(onOrAfter.getOrNull())

            /**
             * Return results on or before this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            fun onOrBefore(onOrBefore: OffsetDateTime?) = apply { this.onOrBefore = onOrBefore }

            /** Alias for calling [Builder.onOrBefore] with `onOrBefore.orElse(null)`. */
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

            /**
             * Returns an immutable instance of [CreatedAt].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): CreatedAt =
                CreatedAt(after, before, onOrAfter, onOrBefore, additionalProperties.build())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CreatedAt &&
                after == other.after &&
                before == other.before &&
                onOrAfter == other.onOrAfter &&
                onOrBefore == other.onOrBefore &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(after, before, onOrAfter, onOrBefore, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CreatedAt{after=$after, before=$before, onOrAfter=$onOrAfter, onOrBefore=$onOrBefore, additionalProperties=$additionalProperties}"
    }

    class Form1099Int
    private constructor(
        private val accountId: String?,
        private val additionalProperties: QueryParams,
    ) {

        /** Filter Form 1099-INT Exports to those for the specified Account. */
        fun accountId(): Optional<String> = Optional.ofNullable(accountId)

        /** Query params to send with the request. */
        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Form1099Int]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Form1099Int]. */
        class Builder internal constructor() {

            private var accountId: String? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(form1099Int: Form1099Int) = apply {
                accountId = form1099Int.accountId
                additionalProperties = form1099Int.additionalProperties.toBuilder()
            }

            /** Filter Form 1099-INT Exports to those for the specified Account. */
            fun accountId(accountId: String?) = apply { this.accountId = accountId }

            /** Alias for calling [Builder.accountId] with `accountId.orElse(null)`. */
            fun accountId(accountId: Optional<String>) = accountId(accountId.getOrNull())

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

            /**
             * Returns an immutable instance of [Form1099Int].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Form1099Int = Form1099Int(accountId, additionalProperties.build())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Form1099Int &&
                accountId == other.accountId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(accountId, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Form1099Int{accountId=$accountId, additionalProperties=$additionalProperties}"
    }

    class Form1099Misc
    private constructor(
        private val accountId: String?,
        private val additionalProperties: QueryParams,
    ) {

        /** Filter Form 1099-MISC Exports to those for the specified Account. */
        fun accountId(): Optional<String> = Optional.ofNullable(accountId)

        /** Query params to send with the request. */
        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Form1099Misc]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Form1099Misc]. */
        class Builder internal constructor() {

            private var accountId: String? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(form1099Misc: Form1099Misc) = apply {
                accountId = form1099Misc.accountId
                additionalProperties = form1099Misc.additionalProperties.toBuilder()
            }

            /** Filter Form 1099-MISC Exports to those for the specified Account. */
            fun accountId(accountId: String?) = apply { this.accountId = accountId }

            /** Alias for calling [Builder.accountId] with `accountId.orElse(null)`. */
            fun accountId(accountId: Optional<String>) = accountId(accountId.getOrNull())

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

            /**
             * Returns an immutable instance of [Form1099Misc].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Form1099Misc = Form1099Misc(accountId, additionalProperties.build())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Form1099Misc &&
                accountId == other.accountId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(accountId, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Form1099Misc{accountId=$accountId, additionalProperties=$additionalProperties}"
    }

    class Status
    private constructor(private val in_: List<In>?, private val additionalProperties: QueryParams) {

        /**
         * Filter Exports for those with the specified status or statuses. For GET requests, this
         * should be encoded as a comma-delimited string, such as `?in=one,two,three`.
         */
        fun in_(): Optional<List<In>> = Optional.ofNullable(in_)

        /** Query params to send with the request. */
        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Status]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Status]. */
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

            /** Alias for calling [Builder.in_] with `in_.orElse(null)`. */
            fun in_(in_: Optional<List<In>>) = in_(in_.getOrNull())

            /**
             * Adds a single [In] to [Builder.in_].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
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

            /**
             * Returns an immutable instance of [Status].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Status = Status(in_?.toImmutable(), additionalProperties.build())
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

            /** An enum containing [In]'s known values. */
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
                /** Increase is generating the export. */
                PENDING,
                /** The export has been successfully generated. */
                COMPLETE,
                /**
                 * The export failed to generate. Increase will reach out to you to resolve the
                 * issue.
                 */
                FAILED,
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
                    PENDING -> Value.PENDING
                    COMPLETE -> Value.COMPLETE
                    FAILED -> Value.FAILED
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
                    PENDING -> Known.PENDING
                    COMPLETE -> Known.COMPLETE
                    FAILED -> Known.FAILED
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

            private var validated: Boolean = false

            fun validate(): In = apply {
                if (validated) {
                    return@apply
                }

                known()
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
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is In && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Status &&
                in_ == other.in_ &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(in_, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Status{in_=$in_, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExportListParams &&
            category == other.category &&
            createdAt == other.createdAt &&
            cursor == other.cursor &&
            form1099Int == other.form1099Int &&
            form1099Misc == other.form1099Misc &&
            idempotencyKey == other.idempotencyKey &&
            limit == other.limit &&
            status == other.status &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            category,
            createdAt,
            cursor,
            form1099Int,
            form1099Misc,
            idempotencyKey,
            limit,
            status,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "ExportListParams{category=$category, createdAt=$createdAt, cursor=$cursor, form1099Int=$form1099Int, form1099Misc=$form1099Misc, idempotencyKey=$idempotencyKey, limit=$limit, status=$status, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
