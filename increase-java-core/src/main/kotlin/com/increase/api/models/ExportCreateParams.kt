// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.increase.api.core.Enum
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.core.immutableEmptyMap
import com.increase.api.core.toImmutable
import com.increase.api.errors.IncreaseInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

class ExportCreateParams
constructor(
    private val body: ExportCreateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    /** The type of Export to create. */
    fun category(): Category = body.category()

    /**
     * Options for the created export. Required if `category` is equal to `account_statement_ofx`.
     */
    fun accountStatementOfx(): Optional<AccountStatementOfx> = body.accountStatementOfx()

    /** Options for the created export. Required if `category` is equal to `balance_csv`. */
    fun balanceCsv(): Optional<BalanceCsv> = body.balanceCsv()

    /**
     * Options for the created export. Required if `category` is equal to
     * `bookkeeping_account_balance_csv`.
     */
    fun bookkeepingAccountBalanceCsv(): Optional<BookkeepingAccountBalanceCsv> =
        body.bookkeepingAccountBalanceCsv()

    /** Options for the created export. Required if `category` is equal to `entity_csv`. */
    fun entityCsv(): Optional<EntityCsv> = body.entityCsv()

    /** Options for the created export. Required if `category` is equal to `transaction_csv`. */
    fun transactionCsv(): Optional<TransactionCsv> = body.transactionCsv()

    /** Options for the created export. Required if `category` is equal to `vendor_csv`. */
    fun vendorCsv(): Optional<JsonValue> = body.vendorCsv()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    @JvmSynthetic internal fun getBody(): ExportCreateBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class ExportCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("category") private val category: Category,
        @JsonProperty("account_statement_ofx")
        private val accountStatementOfx: AccountStatementOfx?,
        @JsonProperty("balance_csv") private val balanceCsv: BalanceCsv?,
        @JsonProperty("bookkeeping_account_balance_csv")
        private val bookkeepingAccountBalanceCsv: BookkeepingAccountBalanceCsv?,
        @JsonProperty("entity_csv") private val entityCsv: EntityCsv?,
        @JsonProperty("transaction_csv") private val transactionCsv: TransactionCsv?,
        @JsonProperty("vendor_csv") private val vendorCsv: JsonValue?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The type of Export to create. */
        @JsonProperty("category") fun category(): Category = category

        /**
         * Options for the created export. Required if `category` is equal to
         * `account_statement_ofx`.
         */
        @JsonProperty("account_statement_ofx")
        fun accountStatementOfx(): Optional<AccountStatementOfx> =
            Optional.ofNullable(accountStatementOfx)

        /** Options for the created export. Required if `category` is equal to `balance_csv`. */
        @JsonProperty("balance_csv")
        fun balanceCsv(): Optional<BalanceCsv> = Optional.ofNullable(balanceCsv)

        /**
         * Options for the created export. Required if `category` is equal to
         * `bookkeeping_account_balance_csv`.
         */
        @JsonProperty("bookkeeping_account_balance_csv")
        fun bookkeepingAccountBalanceCsv(): Optional<BookkeepingAccountBalanceCsv> =
            Optional.ofNullable(bookkeepingAccountBalanceCsv)

        /** Options for the created export. Required if `category` is equal to `entity_csv`. */
        @JsonProperty("entity_csv")
        fun entityCsv(): Optional<EntityCsv> = Optional.ofNullable(entityCsv)

        /** Options for the created export. Required if `category` is equal to `transaction_csv`. */
        @JsonProperty("transaction_csv")
        fun transactionCsv(): Optional<TransactionCsv> = Optional.ofNullable(transactionCsv)

        /** Options for the created export. Required if `category` is equal to `vendor_csv`. */
        @JsonProperty("vendor_csv")
        fun vendorCsv(): Optional<JsonValue> = Optional.ofNullable(vendorCsv)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var category: Category? = null
            private var accountStatementOfx: AccountStatementOfx? = null
            private var balanceCsv: BalanceCsv? = null
            private var bookkeepingAccountBalanceCsv: BookkeepingAccountBalanceCsv? = null
            private var entityCsv: EntityCsv? = null
            private var transactionCsv: TransactionCsv? = null
            private var vendorCsv: JsonValue? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(exportCreateBody: ExportCreateBody) = apply {
                category = exportCreateBody.category
                accountStatementOfx = exportCreateBody.accountStatementOfx
                balanceCsv = exportCreateBody.balanceCsv
                bookkeepingAccountBalanceCsv = exportCreateBody.bookkeepingAccountBalanceCsv
                entityCsv = exportCreateBody.entityCsv
                transactionCsv = exportCreateBody.transactionCsv
                vendorCsv = exportCreateBody.vendorCsv
                additionalProperties = exportCreateBody.additionalProperties.toMutableMap()
            }

            /** The type of Export to create. */
            fun category(category: Category) = apply { this.category = category }

            /**
             * Options for the created export. Required if `category` is equal to
             * `account_statement_ofx`.
             */
            fun accountStatementOfx(accountStatementOfx: AccountStatementOfx?) = apply {
                this.accountStatementOfx = accountStatementOfx
            }

            /**
             * Options for the created export. Required if `category` is equal to
             * `account_statement_ofx`.
             */
            fun accountStatementOfx(accountStatementOfx: Optional<AccountStatementOfx>) =
                accountStatementOfx(accountStatementOfx.orElse(null))

            /** Options for the created export. Required if `category` is equal to `balance_csv`. */
            fun balanceCsv(balanceCsv: BalanceCsv?) = apply { this.balanceCsv = balanceCsv }

            /** Options for the created export. Required if `category` is equal to `balance_csv`. */
            fun balanceCsv(balanceCsv: Optional<BalanceCsv>) = balanceCsv(balanceCsv.orElse(null))

            /**
             * Options for the created export. Required if `category` is equal to
             * `bookkeeping_account_balance_csv`.
             */
            fun bookkeepingAccountBalanceCsv(
                bookkeepingAccountBalanceCsv: BookkeepingAccountBalanceCsv?
            ) = apply { this.bookkeepingAccountBalanceCsv = bookkeepingAccountBalanceCsv }

            /**
             * Options for the created export. Required if `category` is equal to
             * `bookkeeping_account_balance_csv`.
             */
            fun bookkeepingAccountBalanceCsv(
                bookkeepingAccountBalanceCsv: Optional<BookkeepingAccountBalanceCsv>
            ) = bookkeepingAccountBalanceCsv(bookkeepingAccountBalanceCsv.orElse(null))

            /** Options for the created export. Required if `category` is equal to `entity_csv`. */
            fun entityCsv(entityCsv: EntityCsv?) = apply { this.entityCsv = entityCsv }

            /** Options for the created export. Required if `category` is equal to `entity_csv`. */
            fun entityCsv(entityCsv: Optional<EntityCsv>) = entityCsv(entityCsv.orElse(null))

            /**
             * Options for the created export. Required if `category` is equal to `transaction_csv`.
             */
            fun transactionCsv(transactionCsv: TransactionCsv?) = apply {
                this.transactionCsv = transactionCsv
            }

            /**
             * Options for the created export. Required if `category` is equal to `transaction_csv`.
             */
            fun transactionCsv(transactionCsv: Optional<TransactionCsv>) =
                transactionCsv(transactionCsv.orElse(null))

            /** Options for the created export. Required if `category` is equal to `vendor_csv`. */
            fun vendorCsv(vendorCsv: JsonValue?) = apply { this.vendorCsv = vendorCsv }

            /** Options for the created export. Required if `category` is equal to `vendor_csv`. */
            fun vendorCsv(vendorCsv: Optional<JsonValue>) = vendorCsv(vendorCsv.orElse(null))

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

            fun build(): ExportCreateBody =
                ExportCreateBody(
                    checkNotNull(category) { "`category` is required but was not set" },
                    accountStatementOfx,
                    balanceCsv,
                    bookkeepingAccountBalanceCsv,
                    entityCsv,
                    transactionCsv,
                    vendorCsv,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ExportCreateBody && category == other.category && accountStatementOfx == other.accountStatementOfx && balanceCsv == other.balanceCsv && bookkeepingAccountBalanceCsv == other.bookkeepingAccountBalanceCsv && entityCsv == other.entityCsv && transactionCsv == other.transactionCsv && vendorCsv == other.vendorCsv && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(category, accountStatementOfx, balanceCsv, bookkeepingAccountBalanceCsv, entityCsv, transactionCsv, vendorCsv, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ExportCreateBody{category=$category, accountStatementOfx=$accountStatementOfx, balanceCsv=$balanceCsv, bookkeepingAccountBalanceCsv=$bookkeepingAccountBalanceCsv, entityCsv=$entityCsv, transactionCsv=$transactionCsv, vendorCsv=$vendorCsv, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var body: ExportCreateBody.Builder = ExportCreateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(exportCreateParams: ExportCreateParams) = apply {
            body = exportCreateParams.body.toBuilder()
            additionalHeaders = exportCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = exportCreateParams.additionalQueryParams.toBuilder()
        }

        /** The type of Export to create. */
        fun category(category: Category) = apply { body.category(category) }

        /**
         * Options for the created export. Required if `category` is equal to
         * `account_statement_ofx`.
         */
        fun accountStatementOfx(accountStatementOfx: AccountStatementOfx?) = apply {
            body.accountStatementOfx(accountStatementOfx)
        }

        /**
         * Options for the created export. Required if `category` is equal to
         * `account_statement_ofx`.
         */
        fun accountStatementOfx(accountStatementOfx: Optional<AccountStatementOfx>) =
            accountStatementOfx(accountStatementOfx.orElse(null))

        /** Options for the created export. Required if `category` is equal to `balance_csv`. */
        fun balanceCsv(balanceCsv: BalanceCsv?) = apply { body.balanceCsv(balanceCsv) }

        /** Options for the created export. Required if `category` is equal to `balance_csv`. */
        fun balanceCsv(balanceCsv: Optional<BalanceCsv>) = balanceCsv(balanceCsv.orElse(null))

        /**
         * Options for the created export. Required if `category` is equal to
         * `bookkeeping_account_balance_csv`.
         */
        fun bookkeepingAccountBalanceCsv(
            bookkeepingAccountBalanceCsv: BookkeepingAccountBalanceCsv?
        ) = apply { body.bookkeepingAccountBalanceCsv(bookkeepingAccountBalanceCsv) }

        /**
         * Options for the created export. Required if `category` is equal to
         * `bookkeeping_account_balance_csv`.
         */
        fun bookkeepingAccountBalanceCsv(
            bookkeepingAccountBalanceCsv: Optional<BookkeepingAccountBalanceCsv>
        ) = bookkeepingAccountBalanceCsv(bookkeepingAccountBalanceCsv.orElse(null))

        /** Options for the created export. Required if `category` is equal to `entity_csv`. */
        fun entityCsv(entityCsv: EntityCsv?) = apply { body.entityCsv(entityCsv) }

        /** Options for the created export. Required if `category` is equal to `entity_csv`. */
        fun entityCsv(entityCsv: Optional<EntityCsv>) = entityCsv(entityCsv.orElse(null))

        /** Options for the created export. Required if `category` is equal to `transaction_csv`. */
        fun transactionCsv(transactionCsv: TransactionCsv?) = apply {
            body.transactionCsv(transactionCsv)
        }

        /** Options for the created export. Required if `category` is equal to `transaction_csv`. */
        fun transactionCsv(transactionCsv: Optional<TransactionCsv>) =
            transactionCsv(transactionCsv.orElse(null))

        /** Options for the created export. Required if `category` is equal to `vendor_csv`. */
        fun vendorCsv(vendorCsv: JsonValue?) = apply { body.vendorCsv(vendorCsv) }

        /** Options for the created export. Required if `category` is equal to `vendor_csv`. */
        fun vendorCsv(vendorCsv: Optional<JsonValue>) = vendorCsv(vendorCsv.orElse(null))

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

        fun build(): ExportCreateParams =
            ExportCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    class Category
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val ACCOUNT_STATEMENT_OFX = of("account_statement_ofx")

            @JvmField val TRANSACTION_CSV = of("transaction_csv")

            @JvmField val BALANCE_CSV = of("balance_csv")

            @JvmField val BOOKKEEPING_ACCOUNT_BALANCE_CSV = of("bookkeeping_account_balance_csv")

            @JvmField val ENTITY_CSV = of("entity_csv")

            @JvmField val VENDOR_CSV = of("vendor_csv")

            @JvmStatic fun of(value: String) = Category(JsonField.of(value))
        }

        enum class Known {
            ACCOUNT_STATEMENT_OFX,
            TRANSACTION_CSV,
            BALANCE_CSV,
            BOOKKEEPING_ACCOUNT_BALANCE_CSV,
            ENTITY_CSV,
            VENDOR_CSV,
        }

        enum class Value {
            ACCOUNT_STATEMENT_OFX,
            TRANSACTION_CSV,
            BALANCE_CSV,
            BOOKKEEPING_ACCOUNT_BALANCE_CSV,
            ENTITY_CSV,
            VENDOR_CSV,
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
                else -> throw IncreaseInvalidDataException("Unknown Category: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Category && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Options for the created export. Required if `category` is equal to `account_statement_ofx`.
     */
    @NoAutoDetect
    class AccountStatementOfx
    @JsonCreator
    private constructor(
        @JsonProperty("account_id") private val accountId: String,
        @JsonProperty("created_at") private val createdAt: CreatedAt?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The Account to create a statement for. */
        @JsonProperty("account_id") fun accountId(): String = accountId

        /** Filter results by time range on the `created_at` attribute. */
        @JsonProperty("created_at")
        fun createdAt(): Optional<CreatedAt> = Optional.ofNullable(createdAt)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var accountId: String? = null
            private var createdAt: CreatedAt? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(accountStatementOfx: AccountStatementOfx) = apply {
                accountId = accountStatementOfx.accountId
                createdAt = accountStatementOfx.createdAt
                additionalProperties = accountStatementOfx.additionalProperties.toMutableMap()
            }

            /** The Account to create a statement for. */
            fun accountId(accountId: String) = apply { this.accountId = accountId }

            /** Filter results by time range on the `created_at` attribute. */
            fun createdAt(createdAt: CreatedAt?) = apply { this.createdAt = createdAt }

            /** Filter results by time range on the `created_at` attribute. */
            fun createdAt(createdAt: Optional<CreatedAt>) = createdAt(createdAt.orElse(null))

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

            fun build(): AccountStatementOfx =
                AccountStatementOfx(
                    checkNotNull(accountId) { "`accountId` is required but was not set" },
                    createdAt,
                    additionalProperties.toImmutable(),
                )
        }

        /** Filter results by time range on the `created_at` attribute. */
        @NoAutoDetect
        class CreatedAt
        @JsonCreator
        private constructor(
            @JsonProperty("after") private val after: OffsetDateTime?,
            @JsonProperty("before") private val before: OffsetDateTime?,
            @JsonProperty("on_or_after") private val onOrAfter: OffsetDateTime?,
            @JsonProperty("on_or_before") private val onOrBefore: OffsetDateTime?,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /**
             * Return results after this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            @JsonProperty("after")
            fun after(): Optional<OffsetDateTime> = Optional.ofNullable(after)

            /**
             * Return results before this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            @JsonProperty("before")
            fun before(): Optional<OffsetDateTime> = Optional.ofNullable(before)

            /**
             * Return results on or after this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            @JsonProperty("on_or_after")
            fun onOrAfter(): Optional<OffsetDateTime> = Optional.ofNullable(onOrAfter)

            /**
             * Return results on or before this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            @JsonProperty("on_or_before")
            fun onOrBefore(): Optional<OffsetDateTime> = Optional.ofNullable(onOrBefore)

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var after: OffsetDateTime? = null
                private var before: OffsetDateTime? = null
                private var onOrAfter: OffsetDateTime? = null
                private var onOrBefore: OffsetDateTime? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(createdAt: CreatedAt) = apply {
                    after = createdAt.after
                    before = createdAt.before
                    onOrAfter = createdAt.onOrAfter
                    onOrBefore = createdAt.onOrBefore
                    additionalProperties = createdAt.additionalProperties.toMutableMap()
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
                 * Return results on or after this
                 * [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) timestamp.
                 */
                fun onOrAfter(onOrAfter: OffsetDateTime?) = apply { this.onOrAfter = onOrAfter }

                /**
                 * Return results on or after this
                 * [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) timestamp.
                 */
                fun onOrAfter(onOrAfter: Optional<OffsetDateTime>) =
                    onOrAfter(onOrAfter.orElse(null))

                /**
                 * Return results on or before this
                 * [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) timestamp.
                 */
                fun onOrBefore(onOrBefore: OffsetDateTime?) = apply { this.onOrBefore = onOrBefore }

                /**
                 * Return results on or before this
                 * [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) timestamp.
                 */
                fun onOrBefore(onOrBefore: Optional<OffsetDateTime>) =
                    onOrBefore(onOrBefore.orElse(null))

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): CreatedAt =
                    CreatedAt(
                        after,
                        before,
                        onOrAfter,
                        onOrBefore,
                        additionalProperties.toImmutable(),
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

            return /* spotless:off */ other is AccountStatementOfx && accountId == other.accountId && createdAt == other.createdAt && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(accountId, createdAt, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AccountStatementOfx{accountId=$accountId, createdAt=$createdAt, additionalProperties=$additionalProperties}"
    }

    /** Options for the created export. Required if `category` is equal to `balance_csv`. */
    @NoAutoDetect
    class BalanceCsv
    @JsonCreator
    private constructor(
        @JsonProperty("account_id") private val accountId: String?,
        @JsonProperty("created_at") private val createdAt: CreatedAt?,
        @JsonProperty("program_id") private val programId: String?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Filter exported Transactions to the specified Account. */
        @JsonProperty("account_id")
        fun accountId(): Optional<String> = Optional.ofNullable(accountId)

        /** Filter results by time range on the `created_at` attribute. */
        @JsonProperty("created_at")
        fun createdAt(): Optional<CreatedAt> = Optional.ofNullable(createdAt)

        /** Filter exported Transactions to the specified Program. */
        @JsonProperty("program_id")
        fun programId(): Optional<String> = Optional.ofNullable(programId)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var accountId: String? = null
            private var createdAt: CreatedAt? = null
            private var programId: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(balanceCsv: BalanceCsv) = apply {
                accountId = balanceCsv.accountId
                createdAt = balanceCsv.createdAt
                programId = balanceCsv.programId
                additionalProperties = balanceCsv.additionalProperties.toMutableMap()
            }

            /** Filter exported Transactions to the specified Account. */
            fun accountId(accountId: String?) = apply { this.accountId = accountId }

            /** Filter exported Transactions to the specified Account. */
            fun accountId(accountId: Optional<String>) = accountId(accountId.orElse(null))

            /** Filter results by time range on the `created_at` attribute. */
            fun createdAt(createdAt: CreatedAt?) = apply { this.createdAt = createdAt }

            /** Filter results by time range on the `created_at` attribute. */
            fun createdAt(createdAt: Optional<CreatedAt>) = createdAt(createdAt.orElse(null))

            /** Filter exported Transactions to the specified Program. */
            fun programId(programId: String?) = apply { this.programId = programId }

            /** Filter exported Transactions to the specified Program. */
            fun programId(programId: Optional<String>) = programId(programId.orElse(null))

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

            fun build(): BalanceCsv =
                BalanceCsv(
                    accountId,
                    createdAt,
                    programId,
                    additionalProperties.toImmutable(),
                )
        }

        /** Filter results by time range on the `created_at` attribute. */
        @NoAutoDetect
        class CreatedAt
        @JsonCreator
        private constructor(
            @JsonProperty("after") private val after: OffsetDateTime?,
            @JsonProperty("before") private val before: OffsetDateTime?,
            @JsonProperty("on_or_after") private val onOrAfter: OffsetDateTime?,
            @JsonProperty("on_or_before") private val onOrBefore: OffsetDateTime?,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /**
             * Return results after this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            @JsonProperty("after")
            fun after(): Optional<OffsetDateTime> = Optional.ofNullable(after)

            /**
             * Return results before this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            @JsonProperty("before")
            fun before(): Optional<OffsetDateTime> = Optional.ofNullable(before)

            /**
             * Return results on or after this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            @JsonProperty("on_or_after")
            fun onOrAfter(): Optional<OffsetDateTime> = Optional.ofNullable(onOrAfter)

            /**
             * Return results on or before this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            @JsonProperty("on_or_before")
            fun onOrBefore(): Optional<OffsetDateTime> = Optional.ofNullable(onOrBefore)

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var after: OffsetDateTime? = null
                private var before: OffsetDateTime? = null
                private var onOrAfter: OffsetDateTime? = null
                private var onOrBefore: OffsetDateTime? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(createdAt: CreatedAt) = apply {
                    after = createdAt.after
                    before = createdAt.before
                    onOrAfter = createdAt.onOrAfter
                    onOrBefore = createdAt.onOrBefore
                    additionalProperties = createdAt.additionalProperties.toMutableMap()
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
                 * Return results on or after this
                 * [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) timestamp.
                 */
                fun onOrAfter(onOrAfter: OffsetDateTime?) = apply { this.onOrAfter = onOrAfter }

                /**
                 * Return results on or after this
                 * [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) timestamp.
                 */
                fun onOrAfter(onOrAfter: Optional<OffsetDateTime>) =
                    onOrAfter(onOrAfter.orElse(null))

                /**
                 * Return results on or before this
                 * [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) timestamp.
                 */
                fun onOrBefore(onOrBefore: OffsetDateTime?) = apply { this.onOrBefore = onOrBefore }

                /**
                 * Return results on or before this
                 * [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) timestamp.
                 */
                fun onOrBefore(onOrBefore: Optional<OffsetDateTime>) =
                    onOrBefore(onOrBefore.orElse(null))

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): CreatedAt =
                    CreatedAt(
                        after,
                        before,
                        onOrAfter,
                        onOrBefore,
                        additionalProperties.toImmutable(),
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

            return /* spotless:off */ other is BalanceCsv && accountId == other.accountId && createdAt == other.createdAt && programId == other.programId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(accountId, createdAt, programId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "BalanceCsv{accountId=$accountId, createdAt=$createdAt, programId=$programId, additionalProperties=$additionalProperties}"
    }

    /**
     * Options for the created export. Required if `category` is equal to
     * `bookkeeping_account_balance_csv`.
     */
    @NoAutoDetect
    class BookkeepingAccountBalanceCsv
    @JsonCreator
    private constructor(
        @JsonProperty("bookkeeping_account_id") private val bookkeepingAccountId: String?,
        @JsonProperty("created_at") private val createdAt: CreatedAt?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Filter exported Transactions to the specified Bookkeeping Account. */
        @JsonProperty("bookkeeping_account_id")
        fun bookkeepingAccountId(): Optional<String> = Optional.ofNullable(bookkeepingAccountId)

        /** Filter results by time range on the `created_at` attribute. */
        @JsonProperty("created_at")
        fun createdAt(): Optional<CreatedAt> = Optional.ofNullable(createdAt)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var bookkeepingAccountId: String? = null
            private var createdAt: CreatedAt? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(bookkeepingAccountBalanceCsv: BookkeepingAccountBalanceCsv) = apply {
                bookkeepingAccountId = bookkeepingAccountBalanceCsv.bookkeepingAccountId
                createdAt = bookkeepingAccountBalanceCsv.createdAt
                additionalProperties =
                    bookkeepingAccountBalanceCsv.additionalProperties.toMutableMap()
            }

            /** Filter exported Transactions to the specified Bookkeeping Account. */
            fun bookkeepingAccountId(bookkeepingAccountId: String?) = apply {
                this.bookkeepingAccountId = bookkeepingAccountId
            }

            /** Filter exported Transactions to the specified Bookkeeping Account. */
            fun bookkeepingAccountId(bookkeepingAccountId: Optional<String>) =
                bookkeepingAccountId(bookkeepingAccountId.orElse(null))

            /** Filter results by time range on the `created_at` attribute. */
            fun createdAt(createdAt: CreatedAt?) = apply { this.createdAt = createdAt }

            /** Filter results by time range on the `created_at` attribute. */
            fun createdAt(createdAt: Optional<CreatedAt>) = createdAt(createdAt.orElse(null))

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

            fun build(): BookkeepingAccountBalanceCsv =
                BookkeepingAccountBalanceCsv(
                    bookkeepingAccountId,
                    createdAt,
                    additionalProperties.toImmutable(),
                )
        }

        /** Filter results by time range on the `created_at` attribute. */
        @NoAutoDetect
        class CreatedAt
        @JsonCreator
        private constructor(
            @JsonProperty("after") private val after: OffsetDateTime?,
            @JsonProperty("before") private val before: OffsetDateTime?,
            @JsonProperty("on_or_after") private val onOrAfter: OffsetDateTime?,
            @JsonProperty("on_or_before") private val onOrBefore: OffsetDateTime?,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /**
             * Return results after this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            @JsonProperty("after")
            fun after(): Optional<OffsetDateTime> = Optional.ofNullable(after)

            /**
             * Return results before this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            @JsonProperty("before")
            fun before(): Optional<OffsetDateTime> = Optional.ofNullable(before)

            /**
             * Return results on or after this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            @JsonProperty("on_or_after")
            fun onOrAfter(): Optional<OffsetDateTime> = Optional.ofNullable(onOrAfter)

            /**
             * Return results on or before this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            @JsonProperty("on_or_before")
            fun onOrBefore(): Optional<OffsetDateTime> = Optional.ofNullable(onOrBefore)

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var after: OffsetDateTime? = null
                private var before: OffsetDateTime? = null
                private var onOrAfter: OffsetDateTime? = null
                private var onOrBefore: OffsetDateTime? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(createdAt: CreatedAt) = apply {
                    after = createdAt.after
                    before = createdAt.before
                    onOrAfter = createdAt.onOrAfter
                    onOrBefore = createdAt.onOrBefore
                    additionalProperties = createdAt.additionalProperties.toMutableMap()
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
                 * Return results on or after this
                 * [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) timestamp.
                 */
                fun onOrAfter(onOrAfter: OffsetDateTime?) = apply { this.onOrAfter = onOrAfter }

                /**
                 * Return results on or after this
                 * [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) timestamp.
                 */
                fun onOrAfter(onOrAfter: Optional<OffsetDateTime>) =
                    onOrAfter(onOrAfter.orElse(null))

                /**
                 * Return results on or before this
                 * [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) timestamp.
                 */
                fun onOrBefore(onOrBefore: OffsetDateTime?) = apply { this.onOrBefore = onOrBefore }

                /**
                 * Return results on or before this
                 * [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) timestamp.
                 */
                fun onOrBefore(onOrBefore: Optional<OffsetDateTime>) =
                    onOrBefore(onOrBefore.orElse(null))

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): CreatedAt =
                    CreatedAt(
                        after,
                        before,
                        onOrAfter,
                        onOrBefore,
                        additionalProperties.toImmutable(),
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

            return /* spotless:off */ other is BookkeepingAccountBalanceCsv && bookkeepingAccountId == other.bookkeepingAccountId && createdAt == other.createdAt && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(bookkeepingAccountId, createdAt, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "BookkeepingAccountBalanceCsv{bookkeepingAccountId=$bookkeepingAccountId, createdAt=$createdAt, additionalProperties=$additionalProperties}"
    }

    /** Options for the created export. Required if `category` is equal to `entity_csv`. */
    @NoAutoDetect
    class EntityCsv
    @JsonCreator
    private constructor(
        @JsonProperty("status") private val status: Status?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Entity statuses to filter by. */
        @JsonProperty("status") fun status(): Optional<Status> = Optional.ofNullable(status)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var status: Status? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(entityCsv: EntityCsv) = apply {
                status = entityCsv.status
                additionalProperties = entityCsv.additionalProperties.toMutableMap()
            }

            /** Entity statuses to filter by. */
            fun status(status: Status?) = apply { this.status = status }

            /** Entity statuses to filter by. */
            fun status(status: Optional<Status>) = status(status.orElse(null))

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

            fun build(): EntityCsv = EntityCsv(status, additionalProperties.toImmutable())
        }

        /** Entity statuses to filter by. */
        @NoAutoDetect
        class Status
        @JsonCreator
        private constructor(
            @JsonProperty("in") private val in_: List<In>,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /**
             * Entity statuses to filter by. For GET requests, this should be encoded as a
             * comma-delimited string, such as `?in=one,two,three`.
             */
            @JsonProperty("in") fun in_(): List<In> = in_

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var in_: MutableList<In>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(status: Status) = apply {
                    in_ = status.in_.toMutableList()
                    additionalProperties = status.additionalProperties.toMutableMap()
                }

                /**
                 * Entity statuses to filter by. For GET requests, this should be encoded as a
                 * comma-delimited string, such as `?in=one,two,three`.
                 */
                fun in_(in_: List<In>) = apply { this.in_ = in_.toMutableList() }

                /**
                 * Entity statuses to filter by. For GET requests, this should be encoded as a
                 * comma-delimited string, such as `?in=one,two,three`.
                 */
                fun addIn(in_: In) = apply {
                    this.in_ = (this.in_ ?: mutableListOf()).apply { add(in_) }
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): Status =
                    Status(
                        checkNotNull(in_) { "`in_` is required but was not set" }.toImmutable(),
                        additionalProperties.toImmutable()
                    )
            }

            class In
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val ACTIVE = of("active")

                    @JvmField val ARCHIVED = of("archived")

                    @JvmField val DISABLED = of("disabled")

                    @JvmStatic fun of(value: String) = In(JsonField.of(value))
                }

                enum class Known {
                    ACTIVE,
                    ARCHIVED,
                    DISABLED,
                }

                enum class Value {
                    ACTIVE,
                    ARCHIVED,
                    DISABLED,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        ACTIVE -> Value.ACTIVE
                        ARCHIVED -> Value.ARCHIVED
                        DISABLED -> Value.DISABLED
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        ACTIVE -> Known.ACTIVE
                        ARCHIVED -> Known.ARCHIVED
                        DISABLED -> Known.DISABLED
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

            return /* spotless:off */ other is EntityCsv && status == other.status && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(status, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "EntityCsv{status=$status, additionalProperties=$additionalProperties}"
    }

    /** Options for the created export. Required if `category` is equal to `transaction_csv`. */
    @NoAutoDetect
    class TransactionCsv
    @JsonCreator
    private constructor(
        @JsonProperty("account_id") private val accountId: String?,
        @JsonProperty("created_at") private val createdAt: CreatedAt?,
        @JsonProperty("program_id") private val programId: String?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Filter exported Transactions to the specified Account. */
        @JsonProperty("account_id")
        fun accountId(): Optional<String> = Optional.ofNullable(accountId)

        /** Filter results by time range on the `created_at` attribute. */
        @JsonProperty("created_at")
        fun createdAt(): Optional<CreatedAt> = Optional.ofNullable(createdAt)

        /** Filter exported Transactions to the specified Program. */
        @JsonProperty("program_id")
        fun programId(): Optional<String> = Optional.ofNullable(programId)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var accountId: String? = null
            private var createdAt: CreatedAt? = null
            private var programId: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(transactionCsv: TransactionCsv) = apply {
                accountId = transactionCsv.accountId
                createdAt = transactionCsv.createdAt
                programId = transactionCsv.programId
                additionalProperties = transactionCsv.additionalProperties.toMutableMap()
            }

            /** Filter exported Transactions to the specified Account. */
            fun accountId(accountId: String?) = apply { this.accountId = accountId }

            /** Filter exported Transactions to the specified Account. */
            fun accountId(accountId: Optional<String>) = accountId(accountId.orElse(null))

            /** Filter results by time range on the `created_at` attribute. */
            fun createdAt(createdAt: CreatedAt?) = apply { this.createdAt = createdAt }

            /** Filter results by time range on the `created_at` attribute. */
            fun createdAt(createdAt: Optional<CreatedAt>) = createdAt(createdAt.orElse(null))

            /** Filter exported Transactions to the specified Program. */
            fun programId(programId: String?) = apply { this.programId = programId }

            /** Filter exported Transactions to the specified Program. */
            fun programId(programId: Optional<String>) = programId(programId.orElse(null))

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

            fun build(): TransactionCsv =
                TransactionCsv(
                    accountId,
                    createdAt,
                    programId,
                    additionalProperties.toImmutable(),
                )
        }

        /** Filter results by time range on the `created_at` attribute. */
        @NoAutoDetect
        class CreatedAt
        @JsonCreator
        private constructor(
            @JsonProperty("after") private val after: OffsetDateTime?,
            @JsonProperty("before") private val before: OffsetDateTime?,
            @JsonProperty("on_or_after") private val onOrAfter: OffsetDateTime?,
            @JsonProperty("on_or_before") private val onOrBefore: OffsetDateTime?,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /**
             * Return results after this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            @JsonProperty("after")
            fun after(): Optional<OffsetDateTime> = Optional.ofNullable(after)

            /**
             * Return results before this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            @JsonProperty("before")
            fun before(): Optional<OffsetDateTime> = Optional.ofNullable(before)

            /**
             * Return results on or after this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            @JsonProperty("on_or_after")
            fun onOrAfter(): Optional<OffsetDateTime> = Optional.ofNullable(onOrAfter)

            /**
             * Return results on or before this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            @JsonProperty("on_or_before")
            fun onOrBefore(): Optional<OffsetDateTime> = Optional.ofNullable(onOrBefore)

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var after: OffsetDateTime? = null
                private var before: OffsetDateTime? = null
                private var onOrAfter: OffsetDateTime? = null
                private var onOrBefore: OffsetDateTime? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(createdAt: CreatedAt) = apply {
                    after = createdAt.after
                    before = createdAt.before
                    onOrAfter = createdAt.onOrAfter
                    onOrBefore = createdAt.onOrBefore
                    additionalProperties = createdAt.additionalProperties.toMutableMap()
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
                 * Return results on or after this
                 * [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) timestamp.
                 */
                fun onOrAfter(onOrAfter: OffsetDateTime?) = apply { this.onOrAfter = onOrAfter }

                /**
                 * Return results on or after this
                 * [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) timestamp.
                 */
                fun onOrAfter(onOrAfter: Optional<OffsetDateTime>) =
                    onOrAfter(onOrAfter.orElse(null))

                /**
                 * Return results on or before this
                 * [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) timestamp.
                 */
                fun onOrBefore(onOrBefore: OffsetDateTime?) = apply { this.onOrBefore = onOrBefore }

                /**
                 * Return results on or before this
                 * [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) timestamp.
                 */
                fun onOrBefore(onOrBefore: Optional<OffsetDateTime>) =
                    onOrBefore(onOrBefore.orElse(null))

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): CreatedAt =
                    CreatedAt(
                        after,
                        before,
                        onOrAfter,
                        onOrBefore,
                        additionalProperties.toImmutable(),
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

            return /* spotless:off */ other is TransactionCsv && accountId == other.accountId && createdAt == other.createdAt && programId == other.programId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(accountId, createdAt, programId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "TransactionCsv{accountId=$accountId, createdAt=$createdAt, programId=$programId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ExportCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ExportCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
