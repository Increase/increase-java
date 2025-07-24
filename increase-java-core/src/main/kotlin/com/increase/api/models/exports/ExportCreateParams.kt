// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.exports

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.increase.api.core.Enum
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.Params
import com.increase.api.core.checkKnown
import com.increase.api.core.checkRequired
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.core.toImmutable
import com.increase.api.errors.IncreaseInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Create an Export */
class ExportCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The type of Export to create.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun category(): Category = body.category()

    /**
     * Options for the created export. Required if `category` is equal to `account_statement_ofx`.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accountStatementOfx(): Optional<AccountStatementOfx> = body.accountStatementOfx()

    /**
     * Options for the created export. Required if `category` is equal to `balance_csv`.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun balanceCsv(): Optional<BalanceCsv> = body.balanceCsv()

    /**
     * Options for the created export. Required if `category` is equal to
     * `bookkeeping_account_balance_csv`.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun bookkeepingAccountBalanceCsv(): Optional<BookkeepingAccountBalanceCsv> =
        body.bookkeepingAccountBalanceCsv()

    /**
     * Options for the created export. Required if `category` is equal to `entity_csv`.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun entityCsv(): Optional<EntityCsv> = body.entityCsv()

    /**
     * Options for the created export. Required if `category` is equal to `transaction_csv`.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun transactionCsv(): Optional<TransactionCsv> = body.transactionCsv()

    /** Options for the created export. Required if `category` is equal to `vendor_csv`. */
    fun _vendorCsv(): JsonValue = body._vendorCsv()

    /**
     * Returns the raw JSON value of [category].
     *
     * Unlike [category], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _category(): JsonField<Category> = body._category()

    /**
     * Returns the raw JSON value of [accountStatementOfx].
     *
     * Unlike [accountStatementOfx], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _accountStatementOfx(): JsonField<AccountStatementOfx> = body._accountStatementOfx()

    /**
     * Returns the raw JSON value of [balanceCsv].
     *
     * Unlike [balanceCsv], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _balanceCsv(): JsonField<BalanceCsv> = body._balanceCsv()

    /**
     * Returns the raw JSON value of [bookkeepingAccountBalanceCsv].
     *
     * Unlike [bookkeepingAccountBalanceCsv], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _bookkeepingAccountBalanceCsv(): JsonField<BookkeepingAccountBalanceCsv> =
        body._bookkeepingAccountBalanceCsv()

    /**
     * Returns the raw JSON value of [entityCsv].
     *
     * Unlike [entityCsv], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _entityCsv(): JsonField<EntityCsv> = body._entityCsv()

    /**
     * Returns the raw JSON value of [transactionCsv].
     *
     * Unlike [transactionCsv], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _transactionCsv(): JsonField<TransactionCsv> = body._transactionCsv()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ExportCreateParams].
         *
         * The following fields are required:
         * ```java
         * .category()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExportCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(exportCreateParams: ExportCreateParams) = apply {
            body = exportCreateParams.body.toBuilder()
            additionalHeaders = exportCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = exportCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [category]
         * - [accountStatementOfx]
         * - [balanceCsv]
         * - [bookkeepingAccountBalanceCsv]
         * - [entityCsv]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The type of Export to create. */
        fun category(category: Category) = apply { body.category(category) }

        /**
         * Sets [Builder.category] to an arbitrary JSON value.
         *
         * You should usually call [Builder.category] with a well-typed [Category] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun category(category: JsonField<Category>) = apply { body.category(category) }

        /**
         * Options for the created export. Required if `category` is equal to
         * `account_statement_ofx`.
         */
        fun accountStatementOfx(accountStatementOfx: AccountStatementOfx) = apply {
            body.accountStatementOfx(accountStatementOfx)
        }

        /**
         * Sets [Builder.accountStatementOfx] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountStatementOfx] with a well-typed
         * [AccountStatementOfx] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun accountStatementOfx(accountStatementOfx: JsonField<AccountStatementOfx>) = apply {
            body.accountStatementOfx(accountStatementOfx)
        }

        /** Options for the created export. Required if `category` is equal to `balance_csv`. */
        fun balanceCsv(balanceCsv: BalanceCsv) = apply { body.balanceCsv(balanceCsv) }

        /**
         * Sets [Builder.balanceCsv] to an arbitrary JSON value.
         *
         * You should usually call [Builder.balanceCsv] with a well-typed [BalanceCsv] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun balanceCsv(balanceCsv: JsonField<BalanceCsv>) = apply { body.balanceCsv(balanceCsv) }

        /**
         * Options for the created export. Required if `category` is equal to
         * `bookkeeping_account_balance_csv`.
         */
        fun bookkeepingAccountBalanceCsv(
            bookkeepingAccountBalanceCsv: BookkeepingAccountBalanceCsv
        ) = apply { body.bookkeepingAccountBalanceCsv(bookkeepingAccountBalanceCsv) }

        /**
         * Sets [Builder.bookkeepingAccountBalanceCsv] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bookkeepingAccountBalanceCsv] with a well-typed
         * [BookkeepingAccountBalanceCsv] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun bookkeepingAccountBalanceCsv(
            bookkeepingAccountBalanceCsv: JsonField<BookkeepingAccountBalanceCsv>
        ) = apply { body.bookkeepingAccountBalanceCsv(bookkeepingAccountBalanceCsv) }

        /** Options for the created export. Required if `category` is equal to `entity_csv`. */
        fun entityCsv(entityCsv: EntityCsv) = apply { body.entityCsv(entityCsv) }

        /**
         * Sets [Builder.entityCsv] to an arbitrary JSON value.
         *
         * You should usually call [Builder.entityCsv] with a well-typed [EntityCsv] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun entityCsv(entityCsv: JsonField<EntityCsv>) = apply { body.entityCsv(entityCsv) }

        /** Options for the created export. Required if `category` is equal to `transaction_csv`. */
        fun transactionCsv(transactionCsv: TransactionCsv) = apply {
            body.transactionCsv(transactionCsv)
        }

        /**
         * Sets [Builder.transactionCsv] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transactionCsv] with a well-typed [TransactionCsv] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
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

        /**
         * Returns an immutable instance of [ExportCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .category()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ExportCreateParams =
            ExportCreateParams(
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
        private val category: JsonField<Category>,
        private val accountStatementOfx: JsonField<AccountStatementOfx>,
        private val balanceCsv: JsonField<BalanceCsv>,
        private val bookkeepingAccountBalanceCsv: JsonField<BookkeepingAccountBalanceCsv>,
        private val entityCsv: JsonField<EntityCsv>,
        private val transactionCsv: JsonField<TransactionCsv>,
        private val vendorCsv: JsonValue,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("category")
            @ExcludeMissing
            category: JsonField<Category> = JsonMissing.of(),
            @JsonProperty("account_statement_ofx")
            @ExcludeMissing
            accountStatementOfx: JsonField<AccountStatementOfx> = JsonMissing.of(),
            @JsonProperty("balance_csv")
            @ExcludeMissing
            balanceCsv: JsonField<BalanceCsv> = JsonMissing.of(),
            @JsonProperty("bookkeeping_account_balance_csv")
            @ExcludeMissing
            bookkeepingAccountBalanceCsv: JsonField<BookkeepingAccountBalanceCsv> =
                JsonMissing.of(),
            @JsonProperty("entity_csv")
            @ExcludeMissing
            entityCsv: JsonField<EntityCsv> = JsonMissing.of(),
            @JsonProperty("transaction_csv")
            @ExcludeMissing
            transactionCsv: JsonField<TransactionCsv> = JsonMissing.of(),
            @JsonProperty("vendor_csv") @ExcludeMissing vendorCsv: JsonValue = JsonMissing.of(),
        ) : this(
            category,
            accountStatementOfx,
            balanceCsv,
            bookkeepingAccountBalanceCsv,
            entityCsv,
            transactionCsv,
            vendorCsv,
            mutableMapOf(),
        )

        /**
         * The type of Export to create.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun category(): Category = category.getRequired("category")

        /**
         * Options for the created export. Required if `category` is equal to
         * `account_statement_ofx`.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun accountStatementOfx(): Optional<AccountStatementOfx> =
            accountStatementOfx.getOptional("account_statement_ofx")

        /**
         * Options for the created export. Required if `category` is equal to `balance_csv`.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun balanceCsv(): Optional<BalanceCsv> = balanceCsv.getOptional("balance_csv")

        /**
         * Options for the created export. Required if `category` is equal to
         * `bookkeeping_account_balance_csv`.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun bookkeepingAccountBalanceCsv(): Optional<BookkeepingAccountBalanceCsv> =
            bookkeepingAccountBalanceCsv.getOptional("bookkeeping_account_balance_csv")

        /**
         * Options for the created export. Required if `category` is equal to `entity_csv`.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun entityCsv(): Optional<EntityCsv> = entityCsv.getOptional("entity_csv")

        /**
         * Options for the created export. Required if `category` is equal to `transaction_csv`.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun transactionCsv(): Optional<TransactionCsv> =
            transactionCsv.getOptional("transaction_csv")

        /** Options for the created export. Required if `category` is equal to `vendor_csv`. */
        @JsonProperty("vendor_csv") @ExcludeMissing fun _vendorCsv(): JsonValue = vendorCsv

        /**
         * Returns the raw JSON value of [category].
         *
         * Unlike [category], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("category") @ExcludeMissing fun _category(): JsonField<Category> = category

        /**
         * Returns the raw JSON value of [accountStatementOfx].
         *
         * Unlike [accountStatementOfx], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("account_statement_ofx")
        @ExcludeMissing
        fun _accountStatementOfx(): JsonField<AccountStatementOfx> = accountStatementOfx

        /**
         * Returns the raw JSON value of [balanceCsv].
         *
         * Unlike [balanceCsv], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("balance_csv")
        @ExcludeMissing
        fun _balanceCsv(): JsonField<BalanceCsv> = balanceCsv

        /**
         * Returns the raw JSON value of [bookkeepingAccountBalanceCsv].
         *
         * Unlike [bookkeepingAccountBalanceCsv], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("bookkeeping_account_balance_csv")
        @ExcludeMissing
        fun _bookkeepingAccountBalanceCsv(): JsonField<BookkeepingAccountBalanceCsv> =
            bookkeepingAccountBalanceCsv

        /**
         * Returns the raw JSON value of [entityCsv].
         *
         * Unlike [entityCsv], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("entity_csv")
        @ExcludeMissing
        fun _entityCsv(): JsonField<EntityCsv> = entityCsv

        /**
         * Returns the raw JSON value of [transactionCsv].
         *
         * Unlike [transactionCsv], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("transaction_csv")
        @ExcludeMissing
        fun _transactionCsv(): JsonField<TransactionCsv> = transactionCsv

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
             * .category()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
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
            internal fun from(body: Body) = apply {
                category = body.category
                accountStatementOfx = body.accountStatementOfx
                balanceCsv = body.balanceCsv
                bookkeepingAccountBalanceCsv = body.bookkeepingAccountBalanceCsv
                entityCsv = body.entityCsv
                transactionCsv = body.transactionCsv
                vendorCsv = body.vendorCsv
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The type of Export to create. */
            fun category(category: Category) = category(JsonField.of(category))

            /**
             * Sets [Builder.category] to an arbitrary JSON value.
             *
             * You should usually call [Builder.category] with a well-typed [Category] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun category(category: JsonField<Category>) = apply { this.category = category }

            /**
             * Options for the created export. Required if `category` is equal to
             * `account_statement_ofx`.
             */
            fun accountStatementOfx(accountStatementOfx: AccountStatementOfx) =
                accountStatementOfx(JsonField.of(accountStatementOfx))

            /**
             * Sets [Builder.accountStatementOfx] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountStatementOfx] with a well-typed
             * [AccountStatementOfx] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun accountStatementOfx(accountStatementOfx: JsonField<AccountStatementOfx>) = apply {
                this.accountStatementOfx = accountStatementOfx
            }

            /** Options for the created export. Required if `category` is equal to `balance_csv`. */
            fun balanceCsv(balanceCsv: BalanceCsv) = balanceCsv(JsonField.of(balanceCsv))

            /**
             * Sets [Builder.balanceCsv] to an arbitrary JSON value.
             *
             * You should usually call [Builder.balanceCsv] with a well-typed [BalanceCsv] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
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
             * Sets [Builder.bookkeepingAccountBalanceCsv] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bookkeepingAccountBalanceCsv] with a well-typed
             * [BookkeepingAccountBalanceCsv] value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun bookkeepingAccountBalanceCsv(
                bookkeepingAccountBalanceCsv: JsonField<BookkeepingAccountBalanceCsv>
            ) = apply { this.bookkeepingAccountBalanceCsv = bookkeepingAccountBalanceCsv }

            /** Options for the created export. Required if `category` is equal to `entity_csv`. */
            fun entityCsv(entityCsv: EntityCsv) = entityCsv(JsonField.of(entityCsv))

            /**
             * Sets [Builder.entityCsv] to an arbitrary JSON value.
             *
             * You should usually call [Builder.entityCsv] with a well-typed [EntityCsv] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun entityCsv(entityCsv: JsonField<EntityCsv>) = apply { this.entityCsv = entityCsv }

            /**
             * Options for the created export. Required if `category` is equal to `transaction_csv`.
             */
            fun transactionCsv(transactionCsv: TransactionCsv) =
                transactionCsv(JsonField.of(transactionCsv))

            /**
             * Sets [Builder.transactionCsv] to an arbitrary JSON value.
             *
             * You should usually call [Builder.transactionCsv] with a well-typed [TransactionCsv]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .category()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("category", category),
                    accountStatementOfx,
                    balanceCsv,
                    bookkeepingAccountBalanceCsv,
                    entityCsv,
                    transactionCsv,
                    vendorCsv,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            category().validate()
            accountStatementOfx().ifPresent { it.validate() }
            balanceCsv().ifPresent { it.validate() }
            bookkeepingAccountBalanceCsv().ifPresent { it.validate() }
            entityCsv().ifPresent { it.validate() }
            transactionCsv().ifPresent { it.validate() }
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
            (category.asKnown().getOrNull()?.validity() ?: 0) +
                (accountStatementOfx.asKnown().getOrNull()?.validity() ?: 0) +
                (balanceCsv.asKnown().getOrNull()?.validity() ?: 0) +
                (bookkeepingAccountBalanceCsv.asKnown().getOrNull()?.validity() ?: 0) +
                (entityCsv.asKnown().getOrNull()?.validity() ?: 0) +
                (transactionCsv.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && category == other.category && accountStatementOfx == other.accountStatementOfx && balanceCsv == other.balanceCsv && bookkeepingAccountBalanceCsv == other.bookkeepingAccountBalanceCsv && entityCsv == other.entityCsv && transactionCsv == other.transactionCsv && vendorCsv == other.vendorCsv && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(category, accountStatementOfx, balanceCsv, bookkeepingAccountBalanceCsv, entityCsv, transactionCsv, vendorCsv, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{category=$category, accountStatementOfx=$accountStatementOfx, balanceCsv=$balanceCsv, bookkeepingAccountBalanceCsv=$bookkeepingAccountBalanceCsv, entityCsv=$entityCsv, transactionCsv=$transactionCsv, vendorCsv=$vendorCsv, additionalProperties=$additionalProperties}"
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

            return /* spotless:off */ other is Category && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Options for the created export. Required if `category` is equal to `account_statement_ofx`.
     */
    class AccountStatementOfx
    private constructor(
        private val accountId: JsonField<String>,
        private val createdAt: JsonField<CreatedAt>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("account_id")
            @ExcludeMissing
            accountId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<CreatedAt> = JsonMissing.of(),
        ) : this(accountId, createdAt, mutableMapOf())

        /**
         * The Account to create a statement for.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun accountId(): String = accountId.getRequired("account_id")

        /**
         * Filter results by time range on the `created_at` attribute.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun createdAt(): Optional<CreatedAt> = createdAt.getOptional("created_at")

        /**
         * Returns the raw JSON value of [accountId].
         *
         * Unlike [accountId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("account_id") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<CreatedAt> = createdAt

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
             * Returns a mutable builder for constructing an instance of [AccountStatementOfx].
             *
             * The following fields are required:
             * ```java
             * .accountId()
             * ```
             */
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

            /**
             * Sets [Builder.accountId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

            /** Filter results by time range on the `created_at` attribute. */
            fun createdAt(createdAt: CreatedAt) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [CreatedAt] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
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

            /**
             * Returns an immutable instance of [AccountStatementOfx].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .accountId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): AccountStatementOfx =
                AccountStatementOfx(
                    checkRequired("accountId", accountId),
                    createdAt,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): AccountStatementOfx = apply {
            if (validated) {
                return@apply
            }

            accountId()
            createdAt().ifPresent { it.validate() }
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
                (createdAt.asKnown().getOrNull()?.validity() ?: 0)

        /** Filter results by time range on the `created_at` attribute. */
        class CreatedAt
        private constructor(
            private val after: JsonField<OffsetDateTime>,
            private val before: JsonField<OffsetDateTime>,
            private val onOrAfter: JsonField<OffsetDateTime>,
            private val onOrBefore: JsonField<OffsetDateTime>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("after")
                @ExcludeMissing
                after: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("before")
                @ExcludeMissing
                before: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("on_or_after")
                @ExcludeMissing
                onOrAfter: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("on_or_before")
                @ExcludeMissing
                onOrBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
            ) : this(after, before, onOrAfter, onOrBefore, mutableMapOf())

            /**
             * Return results after this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun after(): Optional<OffsetDateTime> = after.getOptional("after")

            /**
             * Return results before this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun before(): Optional<OffsetDateTime> = before.getOptional("before")

            /**
             * Return results on or after this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun onOrAfter(): Optional<OffsetDateTime> = onOrAfter.getOptional("on_or_after")

            /**
             * Return results on or before this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun onOrBefore(): Optional<OffsetDateTime> = onOrBefore.getOptional("on_or_before")

            /**
             * Returns the raw JSON value of [after].
             *
             * Unlike [after], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("after") @ExcludeMissing fun _after(): JsonField<OffsetDateTime> = after

            /**
             * Returns the raw JSON value of [before].
             *
             * Unlike [before], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("before")
            @ExcludeMissing
            fun _before(): JsonField<OffsetDateTime> = before

            /**
             * Returns the raw JSON value of [onOrAfter].
             *
             * Unlike [onOrAfter], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("on_or_after")
            @ExcludeMissing
            fun _onOrAfter(): JsonField<OffsetDateTime> = onOrAfter

            /**
             * Returns the raw JSON value of [onOrBefore].
             *
             * Unlike [onOrBefore], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("on_or_before")
            @ExcludeMissing
            fun _onOrBefore(): JsonField<OffsetDateTime> = onOrBefore

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

                /** Returns a mutable builder for constructing an instance of [CreatedAt]. */
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
                 * Sets [Builder.after] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.after] with a well-typed [OffsetDateTime] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun after(after: JsonField<OffsetDateTime>) = apply { this.after = after }

                /**
                 * Return results before this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
                 * timestamp.
                 */
                fun before(before: OffsetDateTime) = before(JsonField.of(before))

                /**
                 * Sets [Builder.before] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.before] with a well-typed [OffsetDateTime] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun before(before: JsonField<OffsetDateTime>) = apply { this.before = before }

                /**
                 * Return results on or after this
                 * [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) timestamp.
                 */
                fun onOrAfter(onOrAfter: OffsetDateTime) = onOrAfter(JsonField.of(onOrAfter))

                /**
                 * Sets [Builder.onOrAfter] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.onOrAfter] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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
                 * Sets [Builder.onOrBefore] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.onOrBefore] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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

                /**
                 * Returns an immutable instance of [CreatedAt].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): CreatedAt =
                    CreatedAt(
                        after,
                        before,
                        onOrAfter,
                        onOrBefore,
                        additionalProperties.toMutableMap(),
                    )
            }

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
                (if (after.asKnown().isPresent) 1 else 0) +
                    (if (before.asKnown().isPresent) 1 else 0) +
                    (if (onOrAfter.asKnown().isPresent) 1 else 0) +
                    (if (onOrBefore.asKnown().isPresent) 1 else 0)

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
    class BalanceCsv
    private constructor(
        private val accountId: JsonField<String>,
        private val createdAt: JsonField<CreatedAt>,
        private val programId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("account_id")
            @ExcludeMissing
            accountId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<CreatedAt> = JsonMissing.of(),
            @JsonProperty("program_id")
            @ExcludeMissing
            programId: JsonField<String> = JsonMissing.of(),
        ) : this(accountId, createdAt, programId, mutableMapOf())

        /**
         * Filter exported Transactions to the specified Account.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun accountId(): Optional<String> = accountId.getOptional("account_id")

        /**
         * Filter results by time range on the `created_at` attribute.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun createdAt(): Optional<CreatedAt> = createdAt.getOptional("created_at")

        /**
         * Filter exported Transactions to the specified Program.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun programId(): Optional<String> = programId.getOptional("program_id")

        /**
         * Returns the raw JSON value of [accountId].
         *
         * Unlike [accountId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("account_id") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<CreatedAt> = createdAt

        /**
         * Returns the raw JSON value of [programId].
         *
         * Unlike [programId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("program_id") @ExcludeMissing fun _programId(): JsonField<String> = programId

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

            /** Returns a mutable builder for constructing an instance of [BalanceCsv]. */
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

            /**
             * Sets [Builder.accountId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

            /** Filter results by time range on the `created_at` attribute. */
            fun createdAt(createdAt: CreatedAt) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [CreatedAt] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<CreatedAt>) = apply { this.createdAt = createdAt }

            /** Filter exported Transactions to the specified Program. */
            fun programId(programId: String) = programId(JsonField.of(programId))

            /**
             * Sets [Builder.programId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.programId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
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

            /**
             * Returns an immutable instance of [BalanceCsv].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): BalanceCsv =
                BalanceCsv(accountId, createdAt, programId, additionalProperties.toMutableMap())
        }

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
                (createdAt.asKnown().getOrNull()?.validity() ?: 0) +
                (if (programId.asKnown().isPresent) 1 else 0)

        /** Filter results by time range on the `created_at` attribute. */
        class CreatedAt
        private constructor(
            private val after: JsonField<OffsetDateTime>,
            private val before: JsonField<OffsetDateTime>,
            private val onOrAfter: JsonField<OffsetDateTime>,
            private val onOrBefore: JsonField<OffsetDateTime>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("after")
                @ExcludeMissing
                after: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("before")
                @ExcludeMissing
                before: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("on_or_after")
                @ExcludeMissing
                onOrAfter: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("on_or_before")
                @ExcludeMissing
                onOrBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
            ) : this(after, before, onOrAfter, onOrBefore, mutableMapOf())

            /**
             * Return results after this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun after(): Optional<OffsetDateTime> = after.getOptional("after")

            /**
             * Return results before this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun before(): Optional<OffsetDateTime> = before.getOptional("before")

            /**
             * Return results on or after this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun onOrAfter(): Optional<OffsetDateTime> = onOrAfter.getOptional("on_or_after")

            /**
             * Return results on or before this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun onOrBefore(): Optional<OffsetDateTime> = onOrBefore.getOptional("on_or_before")

            /**
             * Returns the raw JSON value of [after].
             *
             * Unlike [after], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("after") @ExcludeMissing fun _after(): JsonField<OffsetDateTime> = after

            /**
             * Returns the raw JSON value of [before].
             *
             * Unlike [before], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("before")
            @ExcludeMissing
            fun _before(): JsonField<OffsetDateTime> = before

            /**
             * Returns the raw JSON value of [onOrAfter].
             *
             * Unlike [onOrAfter], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("on_or_after")
            @ExcludeMissing
            fun _onOrAfter(): JsonField<OffsetDateTime> = onOrAfter

            /**
             * Returns the raw JSON value of [onOrBefore].
             *
             * Unlike [onOrBefore], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("on_or_before")
            @ExcludeMissing
            fun _onOrBefore(): JsonField<OffsetDateTime> = onOrBefore

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

                /** Returns a mutable builder for constructing an instance of [CreatedAt]. */
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
                 * Sets [Builder.after] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.after] with a well-typed [OffsetDateTime] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun after(after: JsonField<OffsetDateTime>) = apply { this.after = after }

                /**
                 * Return results before this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
                 * timestamp.
                 */
                fun before(before: OffsetDateTime) = before(JsonField.of(before))

                /**
                 * Sets [Builder.before] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.before] with a well-typed [OffsetDateTime] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun before(before: JsonField<OffsetDateTime>) = apply { this.before = before }

                /**
                 * Return results on or after this
                 * [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) timestamp.
                 */
                fun onOrAfter(onOrAfter: OffsetDateTime) = onOrAfter(JsonField.of(onOrAfter))

                /**
                 * Sets [Builder.onOrAfter] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.onOrAfter] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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
                 * Sets [Builder.onOrBefore] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.onOrBefore] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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

                /**
                 * Returns an immutable instance of [CreatedAt].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): CreatedAt =
                    CreatedAt(
                        after,
                        before,
                        onOrAfter,
                        onOrBefore,
                        additionalProperties.toMutableMap(),
                    )
            }

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
                (if (after.asKnown().isPresent) 1 else 0) +
                    (if (before.asKnown().isPresent) 1 else 0) +
                    (if (onOrAfter.asKnown().isPresent) 1 else 0) +
                    (if (onOrBefore.asKnown().isPresent) 1 else 0)

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
    class BookkeepingAccountBalanceCsv
    private constructor(
        private val bookkeepingAccountId: JsonField<String>,
        private val createdAt: JsonField<CreatedAt>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("bookkeeping_account_id")
            @ExcludeMissing
            bookkeepingAccountId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<CreatedAt> = JsonMissing.of(),
        ) : this(bookkeepingAccountId, createdAt, mutableMapOf())

        /**
         * Filter exported Transactions to the specified Bookkeeping Account.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun bookkeepingAccountId(): Optional<String> =
            bookkeepingAccountId.getOptional("bookkeeping_account_id")

        /**
         * Filter results by time range on the `created_at` attribute.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun createdAt(): Optional<CreatedAt> = createdAt.getOptional("created_at")

        /**
         * Returns the raw JSON value of [bookkeepingAccountId].
         *
         * Unlike [bookkeepingAccountId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("bookkeeping_account_id")
        @ExcludeMissing
        fun _bookkeepingAccountId(): JsonField<String> = bookkeepingAccountId

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<CreatedAt> = createdAt

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
             * Returns a mutable builder for constructing an instance of
             * [BookkeepingAccountBalanceCsv].
             */
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

            /**
             * Sets [Builder.bookkeepingAccountId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bookkeepingAccountId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun bookkeepingAccountId(bookkeepingAccountId: JsonField<String>) = apply {
                this.bookkeepingAccountId = bookkeepingAccountId
            }

            /** Filter results by time range on the `created_at` attribute. */
            fun createdAt(createdAt: CreatedAt) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [CreatedAt] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
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

            /**
             * Returns an immutable instance of [BookkeepingAccountBalanceCsv].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): BookkeepingAccountBalanceCsv =
                BookkeepingAccountBalanceCsv(
                    bookkeepingAccountId,
                    createdAt,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): BookkeepingAccountBalanceCsv = apply {
            if (validated) {
                return@apply
            }

            bookkeepingAccountId()
            createdAt().ifPresent { it.validate() }
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
            (if (bookkeepingAccountId.asKnown().isPresent) 1 else 0) +
                (createdAt.asKnown().getOrNull()?.validity() ?: 0)

        /** Filter results by time range on the `created_at` attribute. */
        class CreatedAt
        private constructor(
            private val after: JsonField<OffsetDateTime>,
            private val before: JsonField<OffsetDateTime>,
            private val onOrAfter: JsonField<OffsetDateTime>,
            private val onOrBefore: JsonField<OffsetDateTime>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("after")
                @ExcludeMissing
                after: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("before")
                @ExcludeMissing
                before: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("on_or_after")
                @ExcludeMissing
                onOrAfter: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("on_or_before")
                @ExcludeMissing
                onOrBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
            ) : this(after, before, onOrAfter, onOrBefore, mutableMapOf())

            /**
             * Return results after this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun after(): Optional<OffsetDateTime> = after.getOptional("after")

            /**
             * Return results before this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun before(): Optional<OffsetDateTime> = before.getOptional("before")

            /**
             * Return results on or after this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun onOrAfter(): Optional<OffsetDateTime> = onOrAfter.getOptional("on_or_after")

            /**
             * Return results on or before this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun onOrBefore(): Optional<OffsetDateTime> = onOrBefore.getOptional("on_or_before")

            /**
             * Returns the raw JSON value of [after].
             *
             * Unlike [after], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("after") @ExcludeMissing fun _after(): JsonField<OffsetDateTime> = after

            /**
             * Returns the raw JSON value of [before].
             *
             * Unlike [before], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("before")
            @ExcludeMissing
            fun _before(): JsonField<OffsetDateTime> = before

            /**
             * Returns the raw JSON value of [onOrAfter].
             *
             * Unlike [onOrAfter], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("on_or_after")
            @ExcludeMissing
            fun _onOrAfter(): JsonField<OffsetDateTime> = onOrAfter

            /**
             * Returns the raw JSON value of [onOrBefore].
             *
             * Unlike [onOrBefore], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("on_or_before")
            @ExcludeMissing
            fun _onOrBefore(): JsonField<OffsetDateTime> = onOrBefore

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

                /** Returns a mutable builder for constructing an instance of [CreatedAt]. */
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
                 * Sets [Builder.after] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.after] with a well-typed [OffsetDateTime] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun after(after: JsonField<OffsetDateTime>) = apply { this.after = after }

                /**
                 * Return results before this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
                 * timestamp.
                 */
                fun before(before: OffsetDateTime) = before(JsonField.of(before))

                /**
                 * Sets [Builder.before] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.before] with a well-typed [OffsetDateTime] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun before(before: JsonField<OffsetDateTime>) = apply { this.before = before }

                /**
                 * Return results on or after this
                 * [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) timestamp.
                 */
                fun onOrAfter(onOrAfter: OffsetDateTime) = onOrAfter(JsonField.of(onOrAfter))

                /**
                 * Sets [Builder.onOrAfter] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.onOrAfter] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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
                 * Sets [Builder.onOrBefore] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.onOrBefore] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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

                /**
                 * Returns an immutable instance of [CreatedAt].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): CreatedAt =
                    CreatedAt(
                        after,
                        before,
                        onOrAfter,
                        onOrBefore,
                        additionalProperties.toMutableMap(),
                    )
            }

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
                (if (after.asKnown().isPresent) 1 else 0) +
                    (if (before.asKnown().isPresent) 1 else 0) +
                    (if (onOrAfter.asKnown().isPresent) 1 else 0) +
                    (if (onOrBefore.asKnown().isPresent) 1 else 0)

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
    class EntityCsv
    private constructor(
        private val status: JsonField<Status>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of()
        ) : this(status, mutableMapOf())

        /**
         * Entity statuses to filter by.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun status(): Optional<Status> = status.getOptional("status")

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

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

            /** Returns a mutable builder for constructing an instance of [EntityCsv]. */
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

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
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

            /**
             * Returns an immutable instance of [EntityCsv].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): EntityCsv = EntityCsv(status, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): EntityCsv = apply {
            if (validated) {
                return@apply
            }

            status().ifPresent { it.validate() }
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
        @JvmSynthetic internal fun validity(): Int = (status.asKnown().getOrNull()?.validity() ?: 0)

        /** Entity statuses to filter by. */
        class Status
        private constructor(
            private val in_: JsonField<List<In>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("in") @ExcludeMissing in_: JsonField<List<In>> = JsonMissing.of()
            ) : this(in_, mutableMapOf())

            /**
             * Entity statuses to filter by. For GET requests, this should be encoded as a
             * comma-delimited string, such as `?in=one,two,three`.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun in_(): List<In> = in_.getRequired("in")

            /**
             * Returns the raw JSON value of [in_].
             *
             * Unlike [in_], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("in") @ExcludeMissing fun _in_(): JsonField<List<In>> = in_

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
                 * Returns a mutable builder for constructing an instance of [Status].
                 *
                 * The following fields are required:
                 * ```java
                 * .in_()
                 * ```
                 */
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
                 * Sets [Builder.in_] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.in_] with a well-typed `List<In>` value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun in_(in_: JsonField<List<In>>) = apply {
                    this.in_ = in_.map { it.toMutableList() }
                }

                /**
                 * Adds a single [In] to [Builder.in_].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addIn(in_: In) = apply {
                    this.in_ =
                        (this.in_ ?: JsonField.of(mutableListOf())).also {
                            checkKnown("in_", it).add(in_)
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

                /**
                 * Returns an immutable instance of [Status].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .in_()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Status =
                    Status(
                        checkRequired("in_", in_).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Status = apply {
                if (validated) {
                    return@apply
                }

                in_().forEach { it.validate() }
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
                (in_.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

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

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws IncreaseInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
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
    class TransactionCsv
    private constructor(
        private val accountId: JsonField<String>,
        private val createdAt: JsonField<CreatedAt>,
        private val programId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("account_id")
            @ExcludeMissing
            accountId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<CreatedAt> = JsonMissing.of(),
            @JsonProperty("program_id")
            @ExcludeMissing
            programId: JsonField<String> = JsonMissing.of(),
        ) : this(accountId, createdAt, programId, mutableMapOf())

        /**
         * Filter exported Transactions to the specified Account.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun accountId(): Optional<String> = accountId.getOptional("account_id")

        /**
         * Filter results by time range on the `created_at` attribute.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun createdAt(): Optional<CreatedAt> = createdAt.getOptional("created_at")

        /**
         * Filter exported Transactions to the specified Program.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun programId(): Optional<String> = programId.getOptional("program_id")

        /**
         * Returns the raw JSON value of [accountId].
         *
         * Unlike [accountId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("account_id") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<CreatedAt> = createdAt

        /**
         * Returns the raw JSON value of [programId].
         *
         * Unlike [programId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("program_id") @ExcludeMissing fun _programId(): JsonField<String> = programId

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

            /** Returns a mutable builder for constructing an instance of [TransactionCsv]. */
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

            /**
             * Sets [Builder.accountId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

            /** Filter results by time range on the `created_at` attribute. */
            fun createdAt(createdAt: CreatedAt) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [CreatedAt] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<CreatedAt>) = apply { this.createdAt = createdAt }

            /** Filter exported Transactions to the specified Program. */
            fun programId(programId: String) = programId(JsonField.of(programId))

            /**
             * Sets [Builder.programId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.programId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
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

            /**
             * Returns an immutable instance of [TransactionCsv].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): TransactionCsv =
                TransactionCsv(accountId, createdAt, programId, additionalProperties.toMutableMap())
        }

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
                (createdAt.asKnown().getOrNull()?.validity() ?: 0) +
                (if (programId.asKnown().isPresent) 1 else 0)

        /** Filter results by time range on the `created_at` attribute. */
        class CreatedAt
        private constructor(
            private val after: JsonField<OffsetDateTime>,
            private val before: JsonField<OffsetDateTime>,
            private val onOrAfter: JsonField<OffsetDateTime>,
            private val onOrBefore: JsonField<OffsetDateTime>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("after")
                @ExcludeMissing
                after: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("before")
                @ExcludeMissing
                before: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("on_or_after")
                @ExcludeMissing
                onOrAfter: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("on_or_before")
                @ExcludeMissing
                onOrBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
            ) : this(after, before, onOrAfter, onOrBefore, mutableMapOf())

            /**
             * Return results after this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun after(): Optional<OffsetDateTime> = after.getOptional("after")

            /**
             * Return results before this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun before(): Optional<OffsetDateTime> = before.getOptional("before")

            /**
             * Return results on or after this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun onOrAfter(): Optional<OffsetDateTime> = onOrAfter.getOptional("on_or_after")

            /**
             * Return results on or before this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * timestamp.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun onOrBefore(): Optional<OffsetDateTime> = onOrBefore.getOptional("on_or_before")

            /**
             * Returns the raw JSON value of [after].
             *
             * Unlike [after], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("after") @ExcludeMissing fun _after(): JsonField<OffsetDateTime> = after

            /**
             * Returns the raw JSON value of [before].
             *
             * Unlike [before], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("before")
            @ExcludeMissing
            fun _before(): JsonField<OffsetDateTime> = before

            /**
             * Returns the raw JSON value of [onOrAfter].
             *
             * Unlike [onOrAfter], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("on_or_after")
            @ExcludeMissing
            fun _onOrAfter(): JsonField<OffsetDateTime> = onOrAfter

            /**
             * Returns the raw JSON value of [onOrBefore].
             *
             * Unlike [onOrBefore], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("on_or_before")
            @ExcludeMissing
            fun _onOrBefore(): JsonField<OffsetDateTime> = onOrBefore

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

                /** Returns a mutable builder for constructing an instance of [CreatedAt]. */
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
                 * Sets [Builder.after] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.after] with a well-typed [OffsetDateTime] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun after(after: JsonField<OffsetDateTime>) = apply { this.after = after }

                /**
                 * Return results before this [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
                 * timestamp.
                 */
                fun before(before: OffsetDateTime) = before(JsonField.of(before))

                /**
                 * Sets [Builder.before] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.before] with a well-typed [OffsetDateTime] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun before(before: JsonField<OffsetDateTime>) = apply { this.before = before }

                /**
                 * Return results on or after this
                 * [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) timestamp.
                 */
                fun onOrAfter(onOrAfter: OffsetDateTime) = onOrAfter(JsonField.of(onOrAfter))

                /**
                 * Sets [Builder.onOrAfter] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.onOrAfter] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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
                 * Sets [Builder.onOrBefore] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.onOrBefore] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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

                /**
                 * Returns an immutable instance of [CreatedAt].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): CreatedAt =
                    CreatedAt(
                        after,
                        before,
                        onOrAfter,
                        onOrBefore,
                        additionalProperties.toMutableMap(),
                    )
            }

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
                (if (after.asKnown().isPresent) 1 else 0) +
                    (if (before.asKnown().isPresent) 1 else 0) +
                    (if (onOrAfter.asKnown().isPresent) 1 else 0) +
                    (if (onOrBefore.asKnown().isPresent) 1 else 0)

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
