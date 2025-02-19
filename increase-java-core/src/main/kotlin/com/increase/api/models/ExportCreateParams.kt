// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.increase.api.core.Enum
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.Params
import com.increase.api.core.checkRequired
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.core.immutableEmptyMap
import com.increase.api.core.toImmutable
import com.increase.api.errors.IncreaseInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

/** Create an Export */
class ExportCreateParams
private constructor(
    private val body: ExportCreateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

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
    fun _vendorCsv(): JsonValue = body._vendorCsv()

    /** The type of Export to create. */
    fun _category(): JsonField<Category> = body._category()

    /**
     * Options for the created export. Required if `category` is equal to `account_statement_ofx`.
     */
    fun _accountStatementOfx(): JsonField<AccountStatementOfx> = body._accountStatementOfx()

    /** Options for the created export. Required if `category` is equal to `balance_csv`. */
    fun _balanceCsv(): JsonField<BalanceCsv> = body._balanceCsv()

    /**
     * Options for the created export. Required if `category` is equal to
     * `bookkeeping_account_balance_csv`.
     */
    fun _bookkeepingAccountBalanceCsv(): JsonField<BookkeepingAccountBalanceCsv> =
        body._bookkeepingAccountBalanceCsv()

    /** Options for the created export. Required if `category` is equal to `entity_csv`. */
    fun _entityCsv(): JsonField<EntityCsv> = body._entityCsv()

    /** Options for the created export. Required if `category` is equal to `transaction_csv`. */
    fun _transactionCsv(): JsonField<TransactionCsv> = body._transactionCsv()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun _body(): ExportCreateBody = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class ExportCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("category")
        @ExcludeMissing
        private val category: JsonField<Category> = JsonMissing.of(),
        @JsonProperty("account_statement_ofx")
        @ExcludeMissing
        private val accountStatementOfx: JsonField<AccountStatementOfx> = JsonMissing.of(),
        @JsonProperty("balance_csv")
        @ExcludeMissing
        private val balanceCsv: JsonField<BalanceCsv> = JsonMissing.of(),
        @JsonProperty("bookkeeping_account_balance_csv")
        @ExcludeMissing
        private val bookkeepingAccountBalanceCsv: JsonField<BookkeepingAccountBalanceCsv> =
            JsonMissing.of(),
        @JsonProperty("entity_csv")
        @ExcludeMissing
        private val entityCsv: JsonField<EntityCsv> = JsonMissing.of(),
        @JsonProperty("transaction_csv")
        @ExcludeMissing
        private val transactionCsv: JsonField<TransactionCsv> = JsonMissing.of(),
        @JsonProperty("vendor_csv")
        @ExcludeMissing
        private val vendorCsv: JsonValue = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The type of Export to create. */
        fun category(): Category = category.getRequired("category")

        /**
         * Options for the created export. Required if `category` is equal to
         * `account_statement_ofx`.
         */
        fun accountStatementOfx(): Optional<AccountStatementOfx> =
            Optional.ofNullable(accountStatementOfx.getNullable("account_statement_ofx"))

        /** Options for the created export. Required if `category` is equal to `balance_csv`. */
        fun balanceCsv(): Optional<BalanceCsv> =
            Optional.ofNullable(balanceCsv.getNullable("balance_csv"))

        /**
         * Options for the created export. Required if `category` is equal to
         * `bookkeeping_account_balance_csv`.
         */
        fun bookkeepingAccountBalanceCsv(): Optional<BookkeepingAccountBalanceCsv> =
            Optional.ofNullable(
                bookkeepingAccountBalanceCsv.getNullable("bookkeeping_account_balance_csv")
            )

        /** Options for the created export. Required if `category` is equal to `entity_csv`. */
        fun entityCsv(): Optional<EntityCsv> =
            Optional.ofNullable(entityCsv.getNullable("entity_csv"))

        /** Options for the created export. Required if `category` is equal to `transaction_csv`. */
        fun transactionCsv(): Optional<TransactionCsv> =
            Optional.ofNullable(transactionCsv.getNullable("transaction_csv"))

        /** Options for the created export. Required if `category` is equal to `vendor_csv`. */
        @JsonProperty("vendor_csv") @ExcludeMissing fun _vendorCsv(): JsonValue = vendorCsv

        /** The type of Export to create. */
        @JsonProperty("category") @ExcludeMissing fun _category(): JsonField<Category> = category

        /**
         * Options for the created export. Required if `category` is equal to
         * `account_statement_ofx`.
         */
        @JsonProperty("account_statement_ofx")
        @ExcludeMissing
        fun _accountStatementOfx(): JsonField<AccountStatementOfx> = accountStatementOfx

        /** Options for the created export. Required if `category` is equal to `balance_csv`. */
        @JsonProperty("balance_csv")
        @ExcludeMissing
        fun _balanceCsv(): JsonField<BalanceCsv> = balanceCsv

        /**
         * Options for the created export. Required if `category` is equal to
         * `bookkeeping_account_balance_csv`.
         */
        @JsonProperty("bookkeeping_account_balance_csv")
        @ExcludeMissing
        fun _bookkeepingAccountBalanceCsv(): JsonField<BookkeepingAccountBalanceCsv> =
            bookkeepingAccountBalanceCsv

        /** Options for the created export. Required if `category` is equal to `entity_csv`. */
        @JsonProperty("entity_csv")
        @ExcludeMissing
        fun _entityCsv(): JsonField<EntityCsv> = entityCsv

        /** Options for the created export. Required if `category` is equal to `transaction_csv`. */
        @JsonProperty("transaction_csv")
        @ExcludeMissing
        fun _transactionCsv(): JsonField<TransactionCsv> = transactionCsv

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): ExportCreateBody = apply {
            if (validated) {
                return@apply
            }

            category()
            accountStatementOfx().ifPresent { it.validate() }
            balanceCsv().ifPresent { it.validate() }
            bookkeepingAccountBalanceCsv().ifPresent { it.validate() }
            entityCsv().ifPresent { it.validate() }
            transactionCsv().ifPresent { it.validate() }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ExportCreateBody]. */
        class Builder internal constructor() {

            private var category: JsonField<Category>? = null
            private var accountStatementOfx: JsonField<AccountStatementOfx> = JsonMissing.of()
            private var balanceCsv: JsonField<BalanceCsv> = JsonMissing.of()
            private var bookkeepingAccountBalanceCsv: JsonField<BookkeepingAccountBalanceCsv> =
                JsonMissing.of()
            private var entityCsv: JsonField<EntityCsv> = JsonMissing.of()
            private var transactionCsv: JsonField<TransactionCsv> = JsonMissing.of()
            private var vendorCsv: JsonValue = JsonMissing.of()
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
            fun category(category: Category) = category(JsonField.of(category))

            /** The type of Export to create. */
            fun category(category: JsonField<Category>) = apply { this.category = category }

            /**
             * Options for the created export. Required if `category` is equal to
             * `account_statement_ofx`.
             */
            fun accountStatementOfx(accountStatementOfx: AccountStatementOfx) =
                accountStatementOfx(JsonField.of(accountStatementOfx))

            /**
             * Options for the created export. Required if `category` is equal to
             * `account_statement_ofx`.
             */
            fun accountStatementOfx(accountStatementOfx: JsonField<AccountStatementOfx>) = apply {
                this.accountStatementOfx = accountStatementOfx
            }

            /** Options for the created export. Required if `category` is equal to `balance_csv`. */
            fun balanceCsv(balanceCsv: BalanceCsv) = balanceCsv(JsonField.of(balanceCsv))

            /** Options for the created export. Required if `category` is equal to `balance_csv`. */
            fun balanceCsv(balanceCsv: JsonField<BalanceCsv>) = apply {
                this.balanceCsv = balanceCsv
            }

            /**
             * Options for the created export. Required if `category` is equal to
             * `bookkeeping_account_balance_csv`.
             */
            fun bookkeepingAccountBalanceCsv(
                bookkeepingAccountBalanceCsv: BookkeepingAccountBalanceCsv
            ) = bookkeepingAccountBalanceCsv(JsonField.of(bookkeepingAccountBalanceCsv))

            /**
             * Options for the created export. Required if `category` is equal to
             * `bookkeeping_account_balance_csv`.
             */
            fun bookkeepingAccountBalanceCsv(
                bookkeepingAccountBalanceCsv: JsonField<BookkeepingAccountBalanceCsv>
            ) = apply { this.bookkeepingAccountBalanceCsv = bookkeepingAccountBalanceCsv }

            /** Options for the created export. Required if `category` is equal to `entity_csv`. */
            fun entityCsv(entityCsv: EntityCsv) = entityCsv(JsonField.of(entityCsv))

            /** Options for the created export. Required if `category` is equal to `entity_csv`. */
            fun entityCsv(entityCsv: JsonField<EntityCsv>) = apply { this.entityCsv = entityCsv }

            /**
             * Options for the created export. Required if `category` is equal to `transaction_csv`.
             */
            fun transactionCsv(transactionCsv: TransactionCsv) =
                transactionCsv(JsonField.of(transactionCsv))

            /**
             * Options for the created export. Required if `category` is equal to `transaction_csv`.
             */
            fun transactionCsv(transactionCsv: JsonField<TransactionCsv>) = apply {
                this.transactionCsv = transactionCsv
            }

            /** Options for the created export. Required if `category` is equal to `vendor_csv`. */
            fun vendorCsv(vendorCsv: JsonValue) = apply { this.vendorCsv = vendorCsv }

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
                    checkRequired("category", category),
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

    /** A builder for [ExportCreateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

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

        /** The type of Export to create. */
        fun category(category: JsonField<Category>) = apply { body.category(category) }

        /**
         * Options for the created export. Required if `category` is equal to
         * `account_statement_ofx`.
         */
        fun accountStatementOfx(accountStatementOfx: AccountStatementOfx) = apply {
            body.accountStatementOfx(accountStatementOfx)
        }

        /**
         * Options for the created export. Required if `category` is equal to
         * `account_statement_ofx`.
         */
        fun accountStatementOfx(accountStatementOfx: JsonField<AccountStatementOfx>) = apply {
            body.accountStatementOfx(accountStatementOfx)
        }

        /** Options for the created export. Required if `category` is equal to `balance_csv`. */
        fun balanceCsv(balanceCsv: BalanceCsv) = apply { body.balanceCsv(balanceCsv) }

        /** Options for the created export. Required if `category` is equal to `balance_csv`. */
        fun balanceCsv(balanceCsv: JsonField<BalanceCsv>) = apply { body.balanceCsv(balanceCsv) }

        /**
         * Options for the created export. Required if `category` is equal to
         * `bookkeeping_account_balance_csv`.
         */
        fun bookkeepingAccountBalanceCsv(
            bookkeepingAccountBalanceCsv: BookkeepingAccountBalanceCsv
        ) = apply { body.bookkeepingAccountBalanceCsv(bookkeepingAccountBalanceCsv) }

        /**
         * Options for the created export. Required if `category` is equal to
         * `bookkeeping_account_balance_csv`.
         */
        fun bookkeepingAccountBalanceCsv(
            bookkeepingAccountBalanceCsv: JsonField<BookkeepingAccountBalanceCsv>
        ) = apply { body.bookkeepingAccountBalanceCsv(bookkeepingAccountBalanceCsv) }

        /** Options for the created export. Required if `category` is equal to `entity_csv`. */
        fun entityCsv(entityCsv: EntityCsv) = apply { body.entityCsv(entityCsv) }

        /** Options for the created export. Required if `category` is equal to `entity_csv`. */
        fun entityCsv(entityCsv: JsonField<EntityCsv>) = apply { body.entityCsv(entityCsv) }

        /** Options for the created export. Required if `category` is equal to `transaction_csv`. */
        fun transactionCsv(transactionCsv: TransactionCsv) = apply {
            body.transactionCsv(transactionCsv)
        }

        /** Options for the created export. Required if `category` is equal to `transaction_csv`. */
        fun transactionCsv(transactionCsv: JsonField<TransactionCsv>) = apply {
            body.transactionCsv(transactionCsv)
        }

        /** Options for the created export. Required if `category` is equal to `vendor_csv`. */
        fun vendorCsv(vendorCsv: JsonValue) = apply { body.vendorCsv(vendorCsv) }

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

        fun build(): ExportCreateParams =
            ExportCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    /** The type of Export to create. */
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

            @JvmStatic fun of(value: String) = Category(JsonField.of(value))
        }

        /** An enum containing [Category]'s known values. */
        enum class Known {
            /**
             * Export an Open Financial Exchange (OFX) file of transactions and balances for a given
             * time range and Account.
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
                TRANSACTION_CSV -> Value.TRANSACTION_CSV
                BALANCE_CSV -> Value.BALANCE_CSV
                BOOKKEEPING_ACCOUNT_BALANCE_CSV -> Value.BOOKKEEPING_ACCOUNT_BALANCE_CSV
                ENTITY_CSV -> Value.ENTITY_CSV
                VENDOR_CSV -> Value.VENDOR_CSV
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
        @JsonProperty("account_id")
        @ExcludeMissing
        private val accountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        private val createdAt: JsonField<CreatedAt> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The Account to create a statement for. */
        fun accountId(): String = accountId.getRequired("account_id")

        /** Filter results by time range on the `created_at` attribute. */
        fun createdAt(): Optional<CreatedAt> =
            Optional.ofNullable(createdAt.getNullable("created_at"))

        /** The Account to create a statement for. */
        @JsonProperty("account_id") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

        /** Filter results by time range on the `created_at` attribute. */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<CreatedAt> = createdAt

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): AccountStatementOfx = apply {
            if (validated) {
                return@apply
            }

            accountId()
            createdAt().ifPresent { it.validate() }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [AccountStatementOfx]. */
        class Builder internal constructor() {

            private var accountId: JsonField<String>? = null
            private var createdAt: JsonField<CreatedAt> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(accountStatementOfx: AccountStatementOfx) = apply {
                accountId = accountStatementOfx.accountId
                createdAt = accountStatementOfx.createdAt
                additionalProperties = accountStatementOfx.additionalProperties.toMutableMap()
            }

            /** The Account to create a statement for. */
            fun accountId(accountId: String) = accountId(JsonField.of(accountId))

            /** The Account to create a statement for. */
            fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

            /** Filter results by time range on the `created_at` attribute. */
            fun createdAt(createdAt: CreatedAt) = createdAt(JsonField.of(createdAt))

            /** Filter results by time range on the `created_at` attribute. */
            fun createdAt(createdAt: JsonField<CreatedAt>) = apply { this.createdAt = createdAt }

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
                    checkRequired("accountId", accountId),
                    createdAt,
                    additionalProperties.toImmutable(),
                )
        }

        /** Filter results by time range on the `created_at` attribute. */
        @NoAutoDetect
        class CreatedAt
        @JsonCreator
        private constructor(
            @JsonProperty("after")
            @ExcludeMissing
            private val after: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("before")
            @ExcludeMissing
            private val before: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("on_or_after")
            @ExcludeMissing
            private val onOrAfter: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("on_or_before")
            @ExcludeMissing
            private val onOrBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /**
             * Return results after this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            fun after(): Optional<OffsetDateTime> = Optional.ofNullable(after.getNullable("after"))

            /**
             * Return results before this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            fun before(): Optional<OffsetDateTime> =
                Optional.ofNullable(before.getNullable("before"))

            /**
             * Return results on or after this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            fun onOrAfter(): Optional<OffsetDateTime> =
                Optional.ofNullable(onOrAfter.getNullable("on_or_after"))

            /**
             * Return results on or before this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            fun onOrBefore(): Optional<OffsetDateTime> =
                Optional.ofNullable(onOrBefore.getNullable("on_or_before"))

            /**
             * Return results after this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            @JsonProperty("after") @ExcludeMissing fun _after(): JsonField<OffsetDateTime> = after

            /**
             * Return results before this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            @JsonProperty("before")
            @ExcludeMissing
            fun _before(): JsonField<OffsetDateTime> = before

            /**
             * Return results on or after this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            @JsonProperty("on_or_after")
            @ExcludeMissing
            fun _onOrAfter(): JsonField<OffsetDateTime> = onOrAfter

            /**
             * Return results on or before this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            @JsonProperty("on_or_before")
            @ExcludeMissing
            fun _onOrBefore(): JsonField<OffsetDateTime> = onOrBefore

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): CreatedAt = apply {
                if (validated) {
                    return@apply
                }

                after()
                before()
                onOrAfter()
                onOrBefore()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [CreatedAt]. */
            class Builder internal constructor() {

                private var after: JsonField<OffsetDateTime> = JsonMissing.of()
                private var before: JsonField<OffsetDateTime> = JsonMissing.of()
                private var onOrAfter: JsonField<OffsetDateTime> = JsonMissing.of()
                private var onOrBefore: JsonField<OffsetDateTime> = JsonMissing.of()
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
                fun after(after: OffsetDateTime) = after(JsonField.of(after))

                /**
                 * Return results after this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
                 * timestamp.
                 */
                fun after(after: JsonField<OffsetDateTime>) = apply { this.after = after }

                /**
                 * Return results before this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
                 * timestamp.
                 */
                fun before(before: OffsetDateTime) = before(JsonField.of(before))

                /**
                 * Return results before this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
                 * timestamp.
                 */
                fun before(before: JsonField<OffsetDateTime>) = apply { this.before = before }

                /**
                 * Return results on or after this
                 * [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) timestamp.
                 */
                fun onOrAfter(onOrAfter: OffsetDateTime) = onOrAfter(JsonField.of(onOrAfter))

                /**
                 * Return results on or after this
                 * [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) timestamp.
                 */
                fun onOrAfter(onOrAfter: JsonField<OffsetDateTime>) = apply {
                    this.onOrAfter = onOrAfter
                }

                /**
                 * Return results on or before this
                 * [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) timestamp.
                 */
                fun onOrBefore(onOrBefore: OffsetDateTime) = onOrBefore(JsonField.of(onOrBefore))

                /**
                 * Return results on or before this
                 * [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) timestamp.
                 */
                fun onOrBefore(onOrBefore: JsonField<OffsetDateTime>) = apply {
                    this.onOrBefore = onOrBefore
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
        @JsonProperty("account_id")
        @ExcludeMissing
        private val accountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        private val createdAt: JsonField<CreatedAt> = JsonMissing.of(),
        @JsonProperty("program_id")
        @ExcludeMissing
        private val programId: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Filter exported Transactions to the specified Account. */
        fun accountId(): Optional<String> = Optional.ofNullable(accountId.getNullable("account_id"))

        /** Filter results by time range on the `created_at` attribute. */
        fun createdAt(): Optional<CreatedAt> =
            Optional.ofNullable(createdAt.getNullable("created_at"))

        /** Filter exported Transactions to the specified Program. */
        fun programId(): Optional<String> = Optional.ofNullable(programId.getNullable("program_id"))

        /** Filter exported Transactions to the specified Account. */
        @JsonProperty("account_id") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

        /** Filter results by time range on the `created_at` attribute. */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<CreatedAt> = createdAt

        /** Filter exported Transactions to the specified Program. */
        @JsonProperty("program_id") @ExcludeMissing fun _programId(): JsonField<String> = programId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): BalanceCsv = apply {
            if (validated) {
                return@apply
            }

            accountId()
            createdAt().ifPresent { it.validate() }
            programId()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [BalanceCsv]. */
        class Builder internal constructor() {

            private var accountId: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<CreatedAt> = JsonMissing.of()
            private var programId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(balanceCsv: BalanceCsv) = apply {
                accountId = balanceCsv.accountId
                createdAt = balanceCsv.createdAt
                programId = balanceCsv.programId
                additionalProperties = balanceCsv.additionalProperties.toMutableMap()
            }

            /** Filter exported Transactions to the specified Account. */
            fun accountId(accountId: String) = accountId(JsonField.of(accountId))

            /** Filter exported Transactions to the specified Account. */
            fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

            /** Filter results by time range on the `created_at` attribute. */
            fun createdAt(createdAt: CreatedAt) = createdAt(JsonField.of(createdAt))

            /** Filter results by time range on the `created_at` attribute. */
            fun createdAt(createdAt: JsonField<CreatedAt>) = apply { this.createdAt = createdAt }

            /** Filter exported Transactions to the specified Program. */
            fun programId(programId: String) = programId(JsonField.of(programId))

            /** Filter exported Transactions to the specified Program. */
            fun programId(programId: JsonField<String>) = apply { this.programId = programId }

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
                BalanceCsv(accountId, createdAt, programId, additionalProperties.toImmutable())
        }

        /** Filter results by time range on the `created_at` attribute. */
        @NoAutoDetect
        class CreatedAt
        @JsonCreator
        private constructor(
            @JsonProperty("after")
            @ExcludeMissing
            private val after: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("before")
            @ExcludeMissing
            private val before: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("on_or_after")
            @ExcludeMissing
            private val onOrAfter: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("on_or_before")
            @ExcludeMissing
            private val onOrBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /**
             * Return results after this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            fun after(): Optional<OffsetDateTime> = Optional.ofNullable(after.getNullable("after"))

            /**
             * Return results before this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            fun before(): Optional<OffsetDateTime> =
                Optional.ofNullable(before.getNullable("before"))

            /**
             * Return results on or after this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            fun onOrAfter(): Optional<OffsetDateTime> =
                Optional.ofNullable(onOrAfter.getNullable("on_or_after"))

            /**
             * Return results on or before this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            fun onOrBefore(): Optional<OffsetDateTime> =
                Optional.ofNullable(onOrBefore.getNullable("on_or_before"))

            /**
             * Return results after this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            @JsonProperty("after") @ExcludeMissing fun _after(): JsonField<OffsetDateTime> = after

            /**
             * Return results before this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            @JsonProperty("before")
            @ExcludeMissing
            fun _before(): JsonField<OffsetDateTime> = before

            /**
             * Return results on or after this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            @JsonProperty("on_or_after")
            @ExcludeMissing
            fun _onOrAfter(): JsonField<OffsetDateTime> = onOrAfter

            /**
             * Return results on or before this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            @JsonProperty("on_or_before")
            @ExcludeMissing
            fun _onOrBefore(): JsonField<OffsetDateTime> = onOrBefore

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): CreatedAt = apply {
                if (validated) {
                    return@apply
                }

                after()
                before()
                onOrAfter()
                onOrBefore()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [CreatedAt]. */
            class Builder internal constructor() {

                private var after: JsonField<OffsetDateTime> = JsonMissing.of()
                private var before: JsonField<OffsetDateTime> = JsonMissing.of()
                private var onOrAfter: JsonField<OffsetDateTime> = JsonMissing.of()
                private var onOrBefore: JsonField<OffsetDateTime> = JsonMissing.of()
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
                fun after(after: OffsetDateTime) = after(JsonField.of(after))

                /**
                 * Return results after this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
                 * timestamp.
                 */
                fun after(after: JsonField<OffsetDateTime>) = apply { this.after = after }

                /**
                 * Return results before this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
                 * timestamp.
                 */
                fun before(before: OffsetDateTime) = before(JsonField.of(before))

                /**
                 * Return results before this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
                 * timestamp.
                 */
                fun before(before: JsonField<OffsetDateTime>) = apply { this.before = before }

                /**
                 * Return results on or after this
                 * [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) timestamp.
                 */
                fun onOrAfter(onOrAfter: OffsetDateTime) = onOrAfter(JsonField.of(onOrAfter))

                /**
                 * Return results on or after this
                 * [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) timestamp.
                 */
                fun onOrAfter(onOrAfter: JsonField<OffsetDateTime>) = apply {
                    this.onOrAfter = onOrAfter
                }

                /**
                 * Return results on or before this
                 * [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) timestamp.
                 */
                fun onOrBefore(onOrBefore: OffsetDateTime) = onOrBefore(JsonField.of(onOrBefore))

                /**
                 * Return results on or before this
                 * [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) timestamp.
                 */
                fun onOrBefore(onOrBefore: JsonField<OffsetDateTime>) = apply {
                    this.onOrBefore = onOrBefore
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
        @JsonProperty("bookkeeping_account_id")
        @ExcludeMissing
        private val bookkeepingAccountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        private val createdAt: JsonField<CreatedAt> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Filter exported Transactions to the specified Bookkeeping Account. */
        fun bookkeepingAccountId(): Optional<String> =
            Optional.ofNullable(bookkeepingAccountId.getNullable("bookkeeping_account_id"))

        /** Filter results by time range on the `created_at` attribute. */
        fun createdAt(): Optional<CreatedAt> =
            Optional.ofNullable(createdAt.getNullable("created_at"))

        /** Filter exported Transactions to the specified Bookkeeping Account. */
        @JsonProperty("bookkeeping_account_id")
        @ExcludeMissing
        fun _bookkeepingAccountId(): JsonField<String> = bookkeepingAccountId

        /** Filter results by time range on the `created_at` attribute. */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<CreatedAt> = createdAt

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): BookkeepingAccountBalanceCsv = apply {
            if (validated) {
                return@apply
            }

            bookkeepingAccountId()
            createdAt().ifPresent { it.validate() }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [BookkeepingAccountBalanceCsv]. */
        class Builder internal constructor() {

            private var bookkeepingAccountId: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<CreatedAt> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(bookkeepingAccountBalanceCsv: BookkeepingAccountBalanceCsv) = apply {
                bookkeepingAccountId = bookkeepingAccountBalanceCsv.bookkeepingAccountId
                createdAt = bookkeepingAccountBalanceCsv.createdAt
                additionalProperties =
                    bookkeepingAccountBalanceCsv.additionalProperties.toMutableMap()
            }

            /** Filter exported Transactions to the specified Bookkeeping Account. */
            fun bookkeepingAccountId(bookkeepingAccountId: String) =
                bookkeepingAccountId(JsonField.of(bookkeepingAccountId))

            /** Filter exported Transactions to the specified Bookkeeping Account. */
            fun bookkeepingAccountId(bookkeepingAccountId: JsonField<String>) = apply {
                this.bookkeepingAccountId = bookkeepingAccountId
            }

            /** Filter results by time range on the `created_at` attribute. */
            fun createdAt(createdAt: CreatedAt) = createdAt(JsonField.of(createdAt))

            /** Filter results by time range on the `created_at` attribute. */
            fun createdAt(createdAt: JsonField<CreatedAt>) = apply { this.createdAt = createdAt }

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
            @JsonProperty("after")
            @ExcludeMissing
            private val after: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("before")
            @ExcludeMissing
            private val before: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("on_or_after")
            @ExcludeMissing
            private val onOrAfter: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("on_or_before")
            @ExcludeMissing
            private val onOrBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /**
             * Return results after this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            fun after(): Optional<OffsetDateTime> = Optional.ofNullable(after.getNullable("after"))

            /**
             * Return results before this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            fun before(): Optional<OffsetDateTime> =
                Optional.ofNullable(before.getNullable("before"))

            /**
             * Return results on or after this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            fun onOrAfter(): Optional<OffsetDateTime> =
                Optional.ofNullable(onOrAfter.getNullable("on_or_after"))

            /**
             * Return results on or before this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            fun onOrBefore(): Optional<OffsetDateTime> =
                Optional.ofNullable(onOrBefore.getNullable("on_or_before"))

            /**
             * Return results after this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            @JsonProperty("after") @ExcludeMissing fun _after(): JsonField<OffsetDateTime> = after

            /**
             * Return results before this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            @JsonProperty("before")
            @ExcludeMissing
            fun _before(): JsonField<OffsetDateTime> = before

            /**
             * Return results on or after this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            @JsonProperty("on_or_after")
            @ExcludeMissing
            fun _onOrAfter(): JsonField<OffsetDateTime> = onOrAfter

            /**
             * Return results on or before this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            @JsonProperty("on_or_before")
            @ExcludeMissing
            fun _onOrBefore(): JsonField<OffsetDateTime> = onOrBefore

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): CreatedAt = apply {
                if (validated) {
                    return@apply
                }

                after()
                before()
                onOrAfter()
                onOrBefore()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [CreatedAt]. */
            class Builder internal constructor() {

                private var after: JsonField<OffsetDateTime> = JsonMissing.of()
                private var before: JsonField<OffsetDateTime> = JsonMissing.of()
                private var onOrAfter: JsonField<OffsetDateTime> = JsonMissing.of()
                private var onOrBefore: JsonField<OffsetDateTime> = JsonMissing.of()
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
                fun after(after: OffsetDateTime) = after(JsonField.of(after))

                /**
                 * Return results after this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
                 * timestamp.
                 */
                fun after(after: JsonField<OffsetDateTime>) = apply { this.after = after }

                /**
                 * Return results before this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
                 * timestamp.
                 */
                fun before(before: OffsetDateTime) = before(JsonField.of(before))

                /**
                 * Return results before this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
                 * timestamp.
                 */
                fun before(before: JsonField<OffsetDateTime>) = apply { this.before = before }

                /**
                 * Return results on or after this
                 * [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) timestamp.
                 */
                fun onOrAfter(onOrAfter: OffsetDateTime) = onOrAfter(JsonField.of(onOrAfter))

                /**
                 * Return results on or after this
                 * [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) timestamp.
                 */
                fun onOrAfter(onOrAfter: JsonField<OffsetDateTime>) = apply {
                    this.onOrAfter = onOrAfter
                }

                /**
                 * Return results on or before this
                 * [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) timestamp.
                 */
                fun onOrBefore(onOrBefore: OffsetDateTime) = onOrBefore(JsonField.of(onOrBefore))

                /**
                 * Return results on or before this
                 * [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) timestamp.
                 */
                fun onOrBefore(onOrBefore: JsonField<OffsetDateTime>) = apply {
                    this.onOrBefore = onOrBefore
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
        @JsonProperty("status")
        @ExcludeMissing
        private val status: JsonField<Status> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Entity statuses to filter by. */
        fun status(): Optional<Status> = Optional.ofNullable(status.getNullable("status"))

        /** Entity statuses to filter by. */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): EntityCsv = apply {
            if (validated) {
                return@apply
            }

            status().ifPresent { it.validate() }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [EntityCsv]. */
        class Builder internal constructor() {

            private var status: JsonField<Status> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(entityCsv: EntityCsv) = apply {
                status = entityCsv.status
                additionalProperties = entityCsv.additionalProperties.toMutableMap()
            }

            /** Entity statuses to filter by. */
            fun status(status: Status) = status(JsonField.of(status))

            /** Entity statuses to filter by. */
            fun status(status: JsonField<Status>) = apply { this.status = status }

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
            @JsonProperty("in")
            @ExcludeMissing
            private val in_: JsonField<List<In>> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /**
             * Entity statuses to filter by. For GET requests, this should be encoded as a
             * comma-delimited string, such as `?in=one,two,three`.
             */
            fun in_(): List<In> = in_.getRequired("in")

            /**
             * Entity statuses to filter by. For GET requests, this should be encoded as a
             * comma-delimited string, such as `?in=one,two,three`.
             */
            @JsonProperty("in") @ExcludeMissing fun _in_(): JsonField<List<In>> = in_

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Status = apply {
                if (validated) {
                    return@apply
                }

                in_()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Status]. */
            class Builder internal constructor() {

                private var in_: JsonField<MutableList<In>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(status: Status) = apply {
                    in_ = status.in_.map { it.toMutableList() }
                    additionalProperties = status.additionalProperties.toMutableMap()
                }

                /**
                 * Entity statuses to filter by. For GET requests, this should be encoded as a
                 * comma-delimited string, such as `?in=one,two,three`.
                 */
                fun in_(in_: List<In>) = in_(JsonField.of(in_))

                /**
                 * Entity statuses to filter by. For GET requests, this should be encoded as a
                 * comma-delimited string, such as `?in=one,two,three`.
                 */
                fun in_(in_: JsonField<List<In>>) = apply {
                    this.in_ = in_.map { it.toMutableList() }
                }

                /**
                 * Entity statuses to filter by. For GET requests, this should be encoded as a
                 * comma-delimited string, such as `?in=one,two,three`.
                 */
                fun addIn(in_: In) = apply {
                    this.in_ =
                        (this.in_ ?: JsonField.of(mutableListOf())).apply {
                            asKnown()
                                .orElseThrow {
                                    IllegalStateException(
                                        "Field was set to non-list type: ${javaClass.simpleName}"
                                    )
                                }
                                .add(in_)
                        }
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
                        checkRequired("in_", in_).map { it.toImmutable() },
                        additionalProperties.toImmutable(),
                    )
            }

            class In @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    /** The entity is active. */
                    @JvmField val ACTIVE = of("active")

                    /** The entity is archived, and can no longer be used to create accounts. */
                    @JvmField val ARCHIVED = of("archived")

                    /**
                     * The entity is temporarily disabled and cannot be used for financial activity.
                     */
                    @JvmField val DISABLED = of("disabled")

                    @JvmStatic fun of(value: String) = In(JsonField.of(value))
                }

                /** An enum containing [In]'s known values. */
                enum class Known {
                    /** The entity is active. */
                    ACTIVE,
                    /** The entity is archived, and can no longer be used to create accounts. */
                    ARCHIVED,
                    /**
                     * The entity is temporarily disabled and cannot be used for financial activity.
                     */
                    DISABLED,
                }

                /**
                 * An enum containing [In]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [In] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    /** The entity is active. */
                    ACTIVE,
                    /** The entity is archived, and can no longer be used to create accounts. */
                    ARCHIVED,
                    /**
                     * The entity is temporarily disabled and cannot be used for financial activity.
                     */
                    DISABLED,
                    /**
                     * An enum member indicating that [In] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        ACTIVE -> Value.ACTIVE
                        ARCHIVED -> Value.ARCHIVED
                        DISABLED -> Value.DISABLED
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws IncreaseInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
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
        @JsonProperty("account_id")
        @ExcludeMissing
        private val accountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        private val createdAt: JsonField<CreatedAt> = JsonMissing.of(),
        @JsonProperty("program_id")
        @ExcludeMissing
        private val programId: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Filter exported Transactions to the specified Account. */
        fun accountId(): Optional<String> = Optional.ofNullable(accountId.getNullable("account_id"))

        /** Filter results by time range on the `created_at` attribute. */
        fun createdAt(): Optional<CreatedAt> =
            Optional.ofNullable(createdAt.getNullable("created_at"))

        /** Filter exported Transactions to the specified Program. */
        fun programId(): Optional<String> = Optional.ofNullable(programId.getNullable("program_id"))

        /** Filter exported Transactions to the specified Account. */
        @JsonProperty("account_id") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

        /** Filter results by time range on the `created_at` attribute. */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<CreatedAt> = createdAt

        /** Filter exported Transactions to the specified Program. */
        @JsonProperty("program_id") @ExcludeMissing fun _programId(): JsonField<String> = programId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): TransactionCsv = apply {
            if (validated) {
                return@apply
            }

            accountId()
            createdAt().ifPresent { it.validate() }
            programId()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [TransactionCsv]. */
        class Builder internal constructor() {

            private var accountId: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<CreatedAt> = JsonMissing.of()
            private var programId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(transactionCsv: TransactionCsv) = apply {
                accountId = transactionCsv.accountId
                createdAt = transactionCsv.createdAt
                programId = transactionCsv.programId
                additionalProperties = transactionCsv.additionalProperties.toMutableMap()
            }

            /** Filter exported Transactions to the specified Account. */
            fun accountId(accountId: String) = accountId(JsonField.of(accountId))

            /** Filter exported Transactions to the specified Account. */
            fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

            /** Filter results by time range on the `created_at` attribute. */
            fun createdAt(createdAt: CreatedAt) = createdAt(JsonField.of(createdAt))

            /** Filter results by time range on the `created_at` attribute. */
            fun createdAt(createdAt: JsonField<CreatedAt>) = apply { this.createdAt = createdAt }

            /** Filter exported Transactions to the specified Program. */
            fun programId(programId: String) = programId(JsonField.of(programId))

            /** Filter exported Transactions to the specified Program. */
            fun programId(programId: JsonField<String>) = apply { this.programId = programId }

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
                TransactionCsv(accountId, createdAt, programId, additionalProperties.toImmutable())
        }

        /** Filter results by time range on the `created_at` attribute. */
        @NoAutoDetect
        class CreatedAt
        @JsonCreator
        private constructor(
            @JsonProperty("after")
            @ExcludeMissing
            private val after: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("before")
            @ExcludeMissing
            private val before: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("on_or_after")
            @ExcludeMissing
            private val onOrAfter: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("on_or_before")
            @ExcludeMissing
            private val onOrBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /**
             * Return results after this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            fun after(): Optional<OffsetDateTime> = Optional.ofNullable(after.getNullable("after"))

            /**
             * Return results before this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            fun before(): Optional<OffsetDateTime> =
                Optional.ofNullable(before.getNullable("before"))

            /**
             * Return results on or after this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            fun onOrAfter(): Optional<OffsetDateTime> =
                Optional.ofNullable(onOrAfter.getNullable("on_or_after"))

            /**
             * Return results on or before this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            fun onOrBefore(): Optional<OffsetDateTime> =
                Optional.ofNullable(onOrBefore.getNullable("on_or_before"))

            /**
             * Return results after this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            @JsonProperty("after") @ExcludeMissing fun _after(): JsonField<OffsetDateTime> = after

            /**
             * Return results before this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            @JsonProperty("before")
            @ExcludeMissing
            fun _before(): JsonField<OffsetDateTime> = before

            /**
             * Return results on or after this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            @JsonProperty("on_or_after")
            @ExcludeMissing
            fun _onOrAfter(): JsonField<OffsetDateTime> = onOrAfter

            /**
             * Return results on or before this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             */
            @JsonProperty("on_or_before")
            @ExcludeMissing
            fun _onOrBefore(): JsonField<OffsetDateTime> = onOrBefore

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): CreatedAt = apply {
                if (validated) {
                    return@apply
                }

                after()
                before()
                onOrAfter()
                onOrBefore()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [CreatedAt]. */
            class Builder internal constructor() {

                private var after: JsonField<OffsetDateTime> = JsonMissing.of()
                private var before: JsonField<OffsetDateTime> = JsonMissing.of()
                private var onOrAfter: JsonField<OffsetDateTime> = JsonMissing.of()
                private var onOrBefore: JsonField<OffsetDateTime> = JsonMissing.of()
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
                fun after(after: OffsetDateTime) = after(JsonField.of(after))

                /**
                 * Return results after this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
                 * timestamp.
                 */
                fun after(after: JsonField<OffsetDateTime>) = apply { this.after = after }

                /**
                 * Return results before this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
                 * timestamp.
                 */
                fun before(before: OffsetDateTime) = before(JsonField.of(before))

                /**
                 * Return results before this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
                 * timestamp.
                 */
                fun before(before: JsonField<OffsetDateTime>) = apply { this.before = before }

                /**
                 * Return results on or after this
                 * [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) timestamp.
                 */
                fun onOrAfter(onOrAfter: OffsetDateTime) = onOrAfter(JsonField.of(onOrAfter))

                /**
                 * Return results on or after this
                 * [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) timestamp.
                 */
                fun onOrAfter(onOrAfter: JsonField<OffsetDateTime>) = apply {
                    this.onOrAfter = onOrAfter
                }

                /**
                 * Return results on or before this
                 * [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) timestamp.
                 */
                fun onOrBefore(onOrBefore: OffsetDateTime) = onOrBefore(JsonField.of(onOrBefore))

                /**
                 * Return results on or before this
                 * [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) timestamp.
                 */
                fun onOrBefore(onOrBefore: JsonField<OffsetDateTime>) = apply {
                    this.onOrBefore = onOrBefore
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
