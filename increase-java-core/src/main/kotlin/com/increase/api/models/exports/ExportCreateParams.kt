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
import java.time.LocalDate
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
     * Options for the created export. Required if `category` is equal to `account_statement_bai2`.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accountStatementBai2(): Optional<AccountStatementBai2> = body.accountStatementBai2()

    /**
     * Options for the created export. Required if `category` is equal to `account_statement_ofx`.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accountStatementOfx(): Optional<AccountStatementOfx> = body.accountStatementOfx()

    /**
     * Options for the created export. Required if `category` is equal to
     * `account_verification_letter`.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accountVerificationLetter(): Optional<AccountVerificationLetter> =
        body.accountVerificationLetter()

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
     * Options for the created export. Required if `category` is equal to `funding_instructions`.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fundingInstructions(): Optional<FundingInstructions> = body.fundingInstructions()

    /**
     * Options for the created export. Required if `category` is equal to `transaction_csv`.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun transactionCsv(): Optional<TransactionCsv> = body.transactionCsv()

    /**
     * Options for the created export. Required if `category` is equal to `vendor_csv`.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun vendorCsv(): Optional<VendorCsv> = body.vendorCsv()

    /**
     * Options for the created export. Required if `category` is equal to `voided_check`.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun voidedCheck(): Optional<VoidedCheck> = body.voidedCheck()

    /**
     * Returns the raw JSON value of [category].
     *
     * Unlike [category], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _category(): JsonField<Category> = body._category()

    /**
     * Returns the raw JSON value of [accountStatementBai2].
     *
     * Unlike [accountStatementBai2], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _accountStatementBai2(): JsonField<AccountStatementBai2> = body._accountStatementBai2()

    /**
     * Returns the raw JSON value of [accountStatementOfx].
     *
     * Unlike [accountStatementOfx], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _accountStatementOfx(): JsonField<AccountStatementOfx> = body._accountStatementOfx()

    /**
     * Returns the raw JSON value of [accountVerificationLetter].
     *
     * Unlike [accountVerificationLetter], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _accountVerificationLetter(): JsonField<AccountVerificationLetter> =
        body._accountVerificationLetter()

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
     * Returns the raw JSON value of [fundingInstructions].
     *
     * Unlike [fundingInstructions], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _fundingInstructions(): JsonField<FundingInstructions> = body._fundingInstructions()

    /**
     * Returns the raw JSON value of [transactionCsv].
     *
     * Unlike [transactionCsv], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _transactionCsv(): JsonField<TransactionCsv> = body._transactionCsv()

    /**
     * Returns the raw JSON value of [vendorCsv].
     *
     * Unlike [vendorCsv], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _vendorCsv(): JsonField<VendorCsv> = body._vendorCsv()

    /**
     * Returns the raw JSON value of [voidedCheck].
     *
     * Unlike [voidedCheck], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _voidedCheck(): JsonField<VoidedCheck> = body._voidedCheck()

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
         * - [accountStatementBai2]
         * - [accountStatementOfx]
         * - [accountVerificationLetter]
         * - [balanceCsv]
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
         * `account_statement_bai2`.
         */
        fun accountStatementBai2(accountStatementBai2: AccountStatementBai2) = apply {
            body.accountStatementBai2(accountStatementBai2)
        }

        /**
         * Sets [Builder.accountStatementBai2] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountStatementBai2] with a well-typed
         * [AccountStatementBai2] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun accountStatementBai2(accountStatementBai2: JsonField<AccountStatementBai2>) = apply {
            body.accountStatementBai2(accountStatementBai2)
        }

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

        /**
         * Options for the created export. Required if `category` is equal to
         * `account_verification_letter`.
         */
        fun accountVerificationLetter(accountVerificationLetter: AccountVerificationLetter) =
            apply {
                body.accountVerificationLetter(accountVerificationLetter)
            }

        /**
         * Sets [Builder.accountVerificationLetter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountVerificationLetter] with a well-typed
         * [AccountVerificationLetter] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun accountVerificationLetter(
            accountVerificationLetter: JsonField<AccountVerificationLetter>
        ) = apply { body.accountVerificationLetter(accountVerificationLetter) }

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

        /**
         * Options for the created export. Required if `category` is equal to
         * `funding_instructions`.
         */
        fun fundingInstructions(fundingInstructions: FundingInstructions) = apply {
            body.fundingInstructions(fundingInstructions)
        }

        /**
         * Sets [Builder.fundingInstructions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fundingInstructions] with a well-typed
         * [FundingInstructions] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun fundingInstructions(fundingInstructions: JsonField<FundingInstructions>) = apply {
            body.fundingInstructions(fundingInstructions)
        }

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
        fun vendorCsv(vendorCsv: VendorCsv) = apply { body.vendorCsv(vendorCsv) }

        /**
         * Sets [Builder.vendorCsv] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vendorCsv] with a well-typed [VendorCsv] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun vendorCsv(vendorCsv: JsonField<VendorCsv>) = apply { body.vendorCsv(vendorCsv) }

        /** Options for the created export. Required if `category` is equal to `voided_check`. */
        fun voidedCheck(voidedCheck: VoidedCheck) = apply { body.voidedCheck(voidedCheck) }

        /**
         * Sets [Builder.voidedCheck] to an arbitrary JSON value.
         *
         * You should usually call [Builder.voidedCheck] with a well-typed [VoidedCheck] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun voidedCheck(voidedCheck: JsonField<VoidedCheck>) = apply {
            body.voidedCheck(voidedCheck)
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
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val category: JsonField<Category>,
        private val accountStatementBai2: JsonField<AccountStatementBai2>,
        private val accountStatementOfx: JsonField<AccountStatementOfx>,
        private val accountVerificationLetter: JsonField<AccountVerificationLetter>,
        private val balanceCsv: JsonField<BalanceCsv>,
        private val bookkeepingAccountBalanceCsv: JsonField<BookkeepingAccountBalanceCsv>,
        private val entityCsv: JsonField<EntityCsv>,
        private val fundingInstructions: JsonField<FundingInstructions>,
        private val transactionCsv: JsonField<TransactionCsv>,
        private val vendorCsv: JsonField<VendorCsv>,
        private val voidedCheck: JsonField<VoidedCheck>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("category")
            @ExcludeMissing
            category: JsonField<Category> = JsonMissing.of(),
            @JsonProperty("account_statement_bai2")
            @ExcludeMissing
            accountStatementBai2: JsonField<AccountStatementBai2> = JsonMissing.of(),
            @JsonProperty("account_statement_ofx")
            @ExcludeMissing
            accountStatementOfx: JsonField<AccountStatementOfx> = JsonMissing.of(),
            @JsonProperty("account_verification_letter")
            @ExcludeMissing
            accountVerificationLetter: JsonField<AccountVerificationLetter> = JsonMissing.of(),
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
            @JsonProperty("funding_instructions")
            @ExcludeMissing
            fundingInstructions: JsonField<FundingInstructions> = JsonMissing.of(),
            @JsonProperty("transaction_csv")
            @ExcludeMissing
            transactionCsv: JsonField<TransactionCsv> = JsonMissing.of(),
            @JsonProperty("vendor_csv")
            @ExcludeMissing
            vendorCsv: JsonField<VendorCsv> = JsonMissing.of(),
            @JsonProperty("voided_check")
            @ExcludeMissing
            voidedCheck: JsonField<VoidedCheck> = JsonMissing.of(),
        ) : this(
            category,
            accountStatementBai2,
            accountStatementOfx,
            accountVerificationLetter,
            balanceCsv,
            bookkeepingAccountBalanceCsv,
            entityCsv,
            fundingInstructions,
            transactionCsv,
            vendorCsv,
            voidedCheck,
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
         * `account_statement_bai2`.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun accountStatementBai2(): Optional<AccountStatementBai2> =
            accountStatementBai2.getOptional("account_statement_bai2")

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
         * Options for the created export. Required if `category` is equal to
         * `account_verification_letter`.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun accountVerificationLetter(): Optional<AccountVerificationLetter> =
            accountVerificationLetter.getOptional("account_verification_letter")

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
         * Options for the created export. Required if `category` is equal to
         * `funding_instructions`.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun fundingInstructions(): Optional<FundingInstructions> =
            fundingInstructions.getOptional("funding_instructions")

        /**
         * Options for the created export. Required if `category` is equal to `transaction_csv`.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun transactionCsv(): Optional<TransactionCsv> =
            transactionCsv.getOptional("transaction_csv")

        /**
         * Options for the created export. Required if `category` is equal to `vendor_csv`.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun vendorCsv(): Optional<VendorCsv> = vendorCsv.getOptional("vendor_csv")

        /**
         * Options for the created export. Required if `category` is equal to `voided_check`.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun voidedCheck(): Optional<VoidedCheck> = voidedCheck.getOptional("voided_check")

        /**
         * Returns the raw JSON value of [category].
         *
         * Unlike [category], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("category") @ExcludeMissing fun _category(): JsonField<Category> = category

        /**
         * Returns the raw JSON value of [accountStatementBai2].
         *
         * Unlike [accountStatementBai2], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("account_statement_bai2")
        @ExcludeMissing
        fun _accountStatementBai2(): JsonField<AccountStatementBai2> = accountStatementBai2

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
         * Returns the raw JSON value of [accountVerificationLetter].
         *
         * Unlike [accountVerificationLetter], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("account_verification_letter")
        @ExcludeMissing
        fun _accountVerificationLetter(): JsonField<AccountVerificationLetter> =
            accountVerificationLetter

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
         * Returns the raw JSON value of [fundingInstructions].
         *
         * Unlike [fundingInstructions], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("funding_instructions")
        @ExcludeMissing
        fun _fundingInstructions(): JsonField<FundingInstructions> = fundingInstructions

        /**
         * Returns the raw JSON value of [transactionCsv].
         *
         * Unlike [transactionCsv], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("transaction_csv")
        @ExcludeMissing
        fun _transactionCsv(): JsonField<TransactionCsv> = transactionCsv

        /**
         * Returns the raw JSON value of [vendorCsv].
         *
         * Unlike [vendorCsv], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("vendor_csv")
        @ExcludeMissing
        fun _vendorCsv(): JsonField<VendorCsv> = vendorCsv

        /**
         * Returns the raw JSON value of [voidedCheck].
         *
         * Unlike [voidedCheck], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("voided_check")
        @ExcludeMissing
        fun _voidedCheck(): JsonField<VoidedCheck> = voidedCheck

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
            private var accountStatementBai2: JsonField<AccountStatementBai2> = JsonMissing.of()
            private var accountStatementOfx: JsonField<AccountStatementOfx> = JsonMissing.of()
            private var accountVerificationLetter: JsonField<AccountVerificationLetter> =
                JsonMissing.of()
            private var balanceCsv: JsonField<BalanceCsv> = JsonMissing.of()
            private var bookkeepingAccountBalanceCsv: JsonField<BookkeepingAccountBalanceCsv> =
                JsonMissing.of()
            private var entityCsv: JsonField<EntityCsv> = JsonMissing.of()
            private var fundingInstructions: JsonField<FundingInstructions> = JsonMissing.of()
            private var transactionCsv: JsonField<TransactionCsv> = JsonMissing.of()
            private var vendorCsv: JsonField<VendorCsv> = JsonMissing.of()
            private var voidedCheck: JsonField<VoidedCheck> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                category = body.category
                accountStatementBai2 = body.accountStatementBai2
                accountStatementOfx = body.accountStatementOfx
                accountVerificationLetter = body.accountVerificationLetter
                balanceCsv = body.balanceCsv
                bookkeepingAccountBalanceCsv = body.bookkeepingAccountBalanceCsv
                entityCsv = body.entityCsv
                fundingInstructions = body.fundingInstructions
                transactionCsv = body.transactionCsv
                vendorCsv = body.vendorCsv
                voidedCheck = body.voidedCheck
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
             * `account_statement_bai2`.
             */
            fun accountStatementBai2(accountStatementBai2: AccountStatementBai2) =
                accountStatementBai2(JsonField.of(accountStatementBai2))

            /**
             * Sets [Builder.accountStatementBai2] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountStatementBai2] with a well-typed
             * [AccountStatementBai2] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun accountStatementBai2(accountStatementBai2: JsonField<AccountStatementBai2>) =
                apply {
                    this.accountStatementBai2 = accountStatementBai2
                }

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

            /**
             * Options for the created export. Required if `category` is equal to
             * `account_verification_letter`.
             */
            fun accountVerificationLetter(accountVerificationLetter: AccountVerificationLetter) =
                accountVerificationLetter(JsonField.of(accountVerificationLetter))

            /**
             * Sets [Builder.accountVerificationLetter] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountVerificationLetter] with a well-typed
             * [AccountVerificationLetter] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun accountVerificationLetter(
                accountVerificationLetter: JsonField<AccountVerificationLetter>
            ) = apply { this.accountVerificationLetter = accountVerificationLetter }

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
             * Options for the created export. Required if `category` is equal to
             * `funding_instructions`.
             */
            fun fundingInstructions(fundingInstructions: FundingInstructions) =
                fundingInstructions(JsonField.of(fundingInstructions))

            /**
             * Sets [Builder.fundingInstructions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fundingInstructions] with a well-typed
             * [FundingInstructions] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun fundingInstructions(fundingInstructions: JsonField<FundingInstructions>) = apply {
                this.fundingInstructions = fundingInstructions
            }

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
            fun vendorCsv(vendorCsv: VendorCsv) = vendorCsv(JsonField.of(vendorCsv))

            /**
             * Sets [Builder.vendorCsv] to an arbitrary JSON value.
             *
             * You should usually call [Builder.vendorCsv] with a well-typed [VendorCsv] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun vendorCsv(vendorCsv: JsonField<VendorCsv>) = apply { this.vendorCsv = vendorCsv }

            /**
             * Options for the created export. Required if `category` is equal to `voided_check`.
             */
            fun voidedCheck(voidedCheck: VoidedCheck) = voidedCheck(JsonField.of(voidedCheck))

            /**
             * Sets [Builder.voidedCheck] to an arbitrary JSON value.
             *
             * You should usually call [Builder.voidedCheck] with a well-typed [VoidedCheck] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun voidedCheck(voidedCheck: JsonField<VoidedCheck>) = apply {
                this.voidedCheck = voidedCheck
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
             * .category()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("category", category),
                    accountStatementBai2,
                    accountStatementOfx,
                    accountVerificationLetter,
                    balanceCsv,
                    bookkeepingAccountBalanceCsv,
                    entityCsv,
                    fundingInstructions,
                    transactionCsv,
                    vendorCsv,
                    voidedCheck,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            category().validate()
            accountStatementBai2().ifPresent { it.validate() }
            accountStatementOfx().ifPresent { it.validate() }
            accountVerificationLetter().ifPresent { it.validate() }
            balanceCsv().ifPresent { it.validate() }
            bookkeepingAccountBalanceCsv().ifPresent { it.validate() }
            entityCsv().ifPresent { it.validate() }
            fundingInstructions().ifPresent { it.validate() }
            transactionCsv().ifPresent { it.validate() }
            vendorCsv().ifPresent { it.validate() }
            voidedCheck().ifPresent { it.validate() }
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
                (accountStatementBai2.asKnown().getOrNull()?.validity() ?: 0) +
                (accountStatementOfx.asKnown().getOrNull()?.validity() ?: 0) +
                (accountVerificationLetter.asKnown().getOrNull()?.validity() ?: 0) +
                (balanceCsv.asKnown().getOrNull()?.validity() ?: 0) +
                (bookkeepingAccountBalanceCsv.asKnown().getOrNull()?.validity() ?: 0) +
                (entityCsv.asKnown().getOrNull()?.validity() ?: 0) +
                (fundingInstructions.asKnown().getOrNull()?.validity() ?: 0) +
                (transactionCsv.asKnown().getOrNull()?.validity() ?: 0) +
                (vendorCsv.asKnown().getOrNull()?.validity() ?: 0) +
                (voidedCheck.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                category == other.category &&
                accountStatementBai2 == other.accountStatementBai2 &&
                accountStatementOfx == other.accountStatementOfx &&
                accountVerificationLetter == other.accountVerificationLetter &&
                balanceCsv == other.balanceCsv &&
                bookkeepingAccountBalanceCsv == other.bookkeepingAccountBalanceCsv &&
                entityCsv == other.entityCsv &&
                fundingInstructions == other.fundingInstructions &&
                transactionCsv == other.transactionCsv &&
                vendorCsv == other.vendorCsv &&
                voidedCheck == other.voidedCheck &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                category,
                accountStatementBai2,
                accountStatementOfx,
                accountVerificationLetter,
                balanceCsv,
                bookkeepingAccountBalanceCsv,
                entityCsv,
                fundingInstructions,
                transactionCsv,
                vendorCsv,
                voidedCheck,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{category=$category, accountStatementBai2=$accountStatementBai2, accountStatementOfx=$accountStatementOfx, accountVerificationLetter=$accountVerificationLetter, balanceCsv=$balanceCsv, bookkeepingAccountBalanceCsv=$bookkeepingAccountBalanceCsv, entityCsv=$entityCsv, fundingInstructions=$fundingInstructions, transactionCsv=$transactionCsv, vendorCsv=$vendorCsv, voidedCheck=$voidedCheck, additionalProperties=$additionalProperties}"
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

            /** A PDF of an account verification letter. */
            @JvmField val ACCOUNT_VERIFICATION_LETTER = of("account_verification_letter")

            /** A PDF of funding instructions. */
            @JvmField val FUNDING_INSTRUCTIONS = of("funding_instructions")

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
            /** A PDF of an account verification letter. */
            ACCOUNT_VERIFICATION_LETTER,
            /** A PDF of funding instructions. */
            FUNDING_INSTRUCTIONS,
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
            /** A PDF of an account verification letter. */
            ACCOUNT_VERIFICATION_LETTER,
            /** A PDF of funding instructions. */
            FUNDING_INSTRUCTIONS,
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
                ACCOUNT_VERIFICATION_LETTER -> Value.ACCOUNT_VERIFICATION_LETTER
                FUNDING_INSTRUCTIONS -> Value.FUNDING_INSTRUCTIONS
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
                ACCOUNT_VERIFICATION_LETTER -> Known.ACCOUNT_VERIFICATION_LETTER
                FUNDING_INSTRUCTIONS -> Known.FUNDING_INSTRUCTIONS
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

    /**
     * Options for the created export. Required if `category` is equal to `account_statement_bai2`.
     */
    class AccountStatementBai2
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val accountId: JsonField<String>,
        private val effectiveDate: JsonField<LocalDate>,
        private val programId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("account_id")
            @ExcludeMissing
            accountId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("effective_date")
            @ExcludeMissing
            effectiveDate: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("program_id")
            @ExcludeMissing
            programId: JsonField<String> = JsonMissing.of(),
        ) : this(accountId, effectiveDate, programId, mutableMapOf())

        /**
         * The Account to create a BAI2 report for. If not provided, all open accounts will be
         * included.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun accountId(): Optional<String> = accountId.getOptional("account_id")

        /**
         * The date to create a BAI2 report for. If not provided, the current date will be used. The
         * timezone is UTC. If the current date is used, the report will include intraday balances,
         * otherwise it will include end-of-day balances for the provided date.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun effectiveDate(): Optional<LocalDate> = effectiveDate.getOptional("effective_date")

        /**
         * The Program to create a BAI2 report for. If not provided, all open accounts will be
         * included.
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
         * Returns the raw JSON value of [effectiveDate].
         *
         * Unlike [effectiveDate], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("effective_date")
        @ExcludeMissing
        fun _effectiveDate(): JsonField<LocalDate> = effectiveDate

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

            /** Returns a mutable builder for constructing an instance of [AccountStatementBai2]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [AccountStatementBai2]. */
        class Builder internal constructor() {

            private var accountId: JsonField<String> = JsonMissing.of()
            private var effectiveDate: JsonField<LocalDate> = JsonMissing.of()
            private var programId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(accountStatementBai2: AccountStatementBai2) = apply {
                accountId = accountStatementBai2.accountId
                effectiveDate = accountStatementBai2.effectiveDate
                programId = accountStatementBai2.programId
                additionalProperties = accountStatementBai2.additionalProperties.toMutableMap()
            }

            /**
             * The Account to create a BAI2 report for. If not provided, all open accounts will be
             * included.
             */
            fun accountId(accountId: String) = accountId(JsonField.of(accountId))

            /**
             * Sets [Builder.accountId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

            /**
             * The date to create a BAI2 report for. If not provided, the current date will be used.
             * The timezone is UTC. If the current date is used, the report will include intraday
             * balances, otherwise it will include end-of-day balances for the provided date.
             */
            fun effectiveDate(effectiveDate: LocalDate) = effectiveDate(JsonField.of(effectiveDate))

            /**
             * Sets [Builder.effectiveDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.effectiveDate] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun effectiveDate(effectiveDate: JsonField<LocalDate>) = apply {
                this.effectiveDate = effectiveDate
            }

            /**
             * The Program to create a BAI2 report for. If not provided, all open accounts will be
             * included.
             */
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
             * Returns an immutable instance of [AccountStatementBai2].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): AccountStatementBai2 =
                AccountStatementBai2(
                    accountId,
                    effectiveDate,
                    programId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): AccountStatementBai2 = apply {
            if (validated) {
                return@apply
            }

            accountId()
            effectiveDate()
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
                (if (effectiveDate.asKnown().isPresent) 1 else 0) +
                (if (programId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AccountStatementBai2 &&
                accountId == other.accountId &&
                effectiveDate == other.effectiveDate &&
                programId == other.programId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(accountId, effectiveDate, programId, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AccountStatementBai2{accountId=$accountId, effectiveDate=$effectiveDate, programId=$programId, additionalProperties=$additionalProperties}"
    }

    /**
     * Options for the created export. Required if `category` is equal to `account_statement_ofx`.
     */
    class AccountStatementOfx
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
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
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AccountStatementOfx &&
                accountId == other.accountId &&
                createdAt == other.createdAt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(accountId, createdAt, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AccountStatementOfx{accountId=$accountId, createdAt=$createdAt, additionalProperties=$additionalProperties}"
    }

    /**
     * Options for the created export. Required if `category` is equal to
     * `account_verification_letter`.
     */
    class AccountVerificationLetter
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val accountNumberId: JsonField<String>,
        private val balanceDate: JsonField<LocalDate>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("account_number_id")
            @ExcludeMissing
            accountNumberId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("balance_date")
            @ExcludeMissing
            balanceDate: JsonField<LocalDate> = JsonMissing.of(),
        ) : this(accountNumberId, balanceDate, mutableMapOf())

        /**
         * The Account Number to create a letter for.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun accountNumberId(): String = accountNumberId.getRequired("account_number_id")

        /**
         * The date of the balance to include in the letter. Defaults to the current date.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun balanceDate(): Optional<LocalDate> = balanceDate.getOptional("balance_date")

        /**
         * Returns the raw JSON value of [accountNumberId].
         *
         * Unlike [accountNumberId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("account_number_id")
        @ExcludeMissing
        fun _accountNumberId(): JsonField<String> = accountNumberId

        /**
         * Returns the raw JSON value of [balanceDate].
         *
         * Unlike [balanceDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("balance_date")
        @ExcludeMissing
        fun _balanceDate(): JsonField<LocalDate> = balanceDate

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
             * [AccountVerificationLetter].
             *
             * The following fields are required:
             * ```java
             * .accountNumberId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [AccountVerificationLetter]. */
        class Builder internal constructor() {

            private var accountNumberId: JsonField<String>? = null
            private var balanceDate: JsonField<LocalDate> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(accountVerificationLetter: AccountVerificationLetter) = apply {
                accountNumberId = accountVerificationLetter.accountNumberId
                balanceDate = accountVerificationLetter.balanceDate
                additionalProperties = accountVerificationLetter.additionalProperties.toMutableMap()
            }

            /** The Account Number to create a letter for. */
            fun accountNumberId(accountNumberId: String) =
                accountNumberId(JsonField.of(accountNumberId))

            /**
             * Sets [Builder.accountNumberId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountNumberId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accountNumberId(accountNumberId: JsonField<String>) = apply {
                this.accountNumberId = accountNumberId
            }

            /** The date of the balance to include in the letter. Defaults to the current date. */
            fun balanceDate(balanceDate: LocalDate) = balanceDate(JsonField.of(balanceDate))

            /**
             * Sets [Builder.balanceDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.balanceDate] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun balanceDate(balanceDate: JsonField<LocalDate>) = apply {
                this.balanceDate = balanceDate
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
             * Returns an immutable instance of [AccountVerificationLetter].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .accountNumberId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): AccountVerificationLetter =
                AccountVerificationLetter(
                    checkRequired("accountNumberId", accountNumberId),
                    balanceDate,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): AccountVerificationLetter = apply {
            if (validated) {
                return@apply
            }

            accountNumberId()
            balanceDate()
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
            (if (accountNumberId.asKnown().isPresent) 1 else 0) +
                (if (balanceDate.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AccountVerificationLetter &&
                accountNumberId == other.accountNumberId &&
                balanceDate == other.balanceDate &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(accountNumberId, balanceDate, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AccountVerificationLetter{accountNumberId=$accountNumberId, balanceDate=$balanceDate, additionalProperties=$additionalProperties}"
    }

    /** Options for the created export. Required if `category` is equal to `balance_csv`. */
    class BalanceCsv
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
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
         * Filter exported Balances to the specified Account.
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

            /** Returns a mutable builder for constructing an instance of [BalanceCsv]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [BalanceCsv]. */
        class Builder internal constructor() {

            private var accountId: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<CreatedAt> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(balanceCsv: BalanceCsv) = apply {
                accountId = balanceCsv.accountId
                createdAt = balanceCsv.createdAt
                additionalProperties = balanceCsv.additionalProperties.toMutableMap()
            }

            /** Filter exported Balances to the specified Account. */
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
             * Returns an immutable instance of [BalanceCsv].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): BalanceCsv =
                BalanceCsv(accountId, createdAt, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): BalanceCsv = apply {
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
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is BalanceCsv &&
                accountId == other.accountId &&
                createdAt == other.createdAt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(accountId, createdAt, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "BalanceCsv{accountId=$accountId, createdAt=$createdAt, additionalProperties=$additionalProperties}"
    }

    /**
     * Options for the created export. Required if `category` is equal to
     * `bookkeeping_account_balance_csv`.
     */
    class BookkeepingAccountBalanceCsv
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
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
         * Filter exported Bookkeeping Account Balances to the specified Bookkeeping Account.
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

            /**
             * Filter exported Bookkeeping Account Balances to the specified Bookkeeping Account.
             */
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
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is BookkeepingAccountBalanceCsv &&
                bookkeepingAccountId == other.bookkeepingAccountId &&
                createdAt == other.createdAt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(bookkeepingAccountId, createdAt, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "BookkeepingAccountBalanceCsv{bookkeepingAccountId=$bookkeepingAccountId, createdAt=$createdAt, additionalProperties=$additionalProperties}"
    }

    /** Options for the created export. Required if `category` is equal to `entity_csv`. */
    class EntityCsv
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(private val additionalProperties: MutableMap<String, JsonValue>) {

        @JsonCreator private constructor() : this(mutableMapOf())

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

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(entityCsv: EntityCsv) = apply {
                additionalProperties = entityCsv.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [EntityCsv].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): EntityCsv = EntityCsv(additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): EntityCsv = apply {
            if (validated) {
                return@apply
            }

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
        @JvmSynthetic internal fun validity(): Int = 0

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is EntityCsv && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "EntityCsv{additionalProperties=$additionalProperties}"
    }

    /**
     * Options for the created export. Required if `category` is equal to `funding_instructions`.
     */
    class FundingInstructions
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val accountNumberId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("account_number_id")
            @ExcludeMissing
            accountNumberId: JsonField<String> = JsonMissing.of()
        ) : this(accountNumberId, mutableMapOf())

        /**
         * The Account Number to create funding instructions for.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun accountNumberId(): String = accountNumberId.getRequired("account_number_id")

        /**
         * Returns the raw JSON value of [accountNumberId].
         *
         * Unlike [accountNumberId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("account_number_id")
        @ExcludeMissing
        fun _accountNumberId(): JsonField<String> = accountNumberId

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
             * Returns a mutable builder for constructing an instance of [FundingInstructions].
             *
             * The following fields are required:
             * ```java
             * .accountNumberId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [FundingInstructions]. */
        class Builder internal constructor() {

            private var accountNumberId: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(fundingInstructions: FundingInstructions) = apply {
                accountNumberId = fundingInstructions.accountNumberId
                additionalProperties = fundingInstructions.additionalProperties.toMutableMap()
            }

            /** The Account Number to create funding instructions for. */
            fun accountNumberId(accountNumberId: String) =
                accountNumberId(JsonField.of(accountNumberId))

            /**
             * Sets [Builder.accountNumberId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountNumberId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accountNumberId(accountNumberId: JsonField<String>) = apply {
                this.accountNumberId = accountNumberId
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
             * Returns an immutable instance of [FundingInstructions].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .accountNumberId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): FundingInstructions =
                FundingInstructions(
                    checkRequired("accountNumberId", accountNumberId),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): FundingInstructions = apply {
            if (validated) {
                return@apply
            }

            accountNumberId()
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
        internal fun validity(): Int = (if (accountNumberId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is FundingInstructions &&
                accountNumberId == other.accountNumberId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(accountNumberId, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "FundingInstructions{accountNumberId=$accountNumberId, additionalProperties=$additionalProperties}"
    }

    /** Options for the created export. Required if `category` is equal to `transaction_csv`. */
    class TransactionCsv
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
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

            /** Returns a mutable builder for constructing an instance of [TransactionCsv]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [TransactionCsv]. */
        class Builder internal constructor() {

            private var accountId: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<CreatedAt> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(transactionCsv: TransactionCsv) = apply {
                accountId = transactionCsv.accountId
                createdAt = transactionCsv.createdAt
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
                TransactionCsv(accountId, createdAt, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): TransactionCsv = apply {
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
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is TransactionCsv &&
                accountId == other.accountId &&
                createdAt == other.createdAt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(accountId, createdAt, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "TransactionCsv{accountId=$accountId, createdAt=$createdAt, additionalProperties=$additionalProperties}"
    }

    /** Options for the created export. Required if `category` is equal to `vendor_csv`. */
    class VendorCsv
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(private val additionalProperties: MutableMap<String, JsonValue>) {

        @JsonCreator private constructor() : this(mutableMapOf())

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

            /** Returns a mutable builder for constructing an instance of [VendorCsv]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [VendorCsv]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(vendorCsv: VendorCsv) = apply {
                additionalProperties = vendorCsv.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [VendorCsv].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): VendorCsv = VendorCsv(additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): VendorCsv = apply {
            if (validated) {
                return@apply
            }

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
        @JvmSynthetic internal fun validity(): Int = 0

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is VendorCsv && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "VendorCsv{additionalProperties=$additionalProperties}"
    }

    /** Options for the created export. Required if `category` is equal to `voided_check`. */
    class VoidedCheck
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val accountNumberId: JsonField<String>,
        private val payer: JsonField<List<Payer>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("account_number_id")
            @ExcludeMissing
            accountNumberId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("payer") @ExcludeMissing payer: JsonField<List<Payer>> = JsonMissing.of(),
        ) : this(accountNumberId, payer, mutableMapOf())

        /**
         * The Account Number for the voided check.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun accountNumberId(): String = accountNumberId.getRequired("account_number_id")

        /**
         * The payer information to be printed on the check.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun payer(): Optional<List<Payer>> = payer.getOptional("payer")

        /**
         * Returns the raw JSON value of [accountNumberId].
         *
         * Unlike [accountNumberId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("account_number_id")
        @ExcludeMissing
        fun _accountNumberId(): JsonField<String> = accountNumberId

        /**
         * Returns the raw JSON value of [payer].
         *
         * Unlike [payer], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("payer") @ExcludeMissing fun _payer(): JsonField<List<Payer>> = payer

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
             * Returns a mutable builder for constructing an instance of [VoidedCheck].
             *
             * The following fields are required:
             * ```java
             * .accountNumberId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [VoidedCheck]. */
        class Builder internal constructor() {

            private var accountNumberId: JsonField<String>? = null
            private var payer: JsonField<MutableList<Payer>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(voidedCheck: VoidedCheck) = apply {
                accountNumberId = voidedCheck.accountNumberId
                payer = voidedCheck.payer.map { it.toMutableList() }
                additionalProperties = voidedCheck.additionalProperties.toMutableMap()
            }

            /** The Account Number for the voided check. */
            fun accountNumberId(accountNumberId: String) =
                accountNumberId(JsonField.of(accountNumberId))

            /**
             * Sets [Builder.accountNumberId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountNumberId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accountNumberId(accountNumberId: JsonField<String>) = apply {
                this.accountNumberId = accountNumberId
            }

            /** The payer information to be printed on the check. */
            fun payer(payer: List<Payer>) = payer(JsonField.of(payer))

            /**
             * Sets [Builder.payer] to an arbitrary JSON value.
             *
             * You should usually call [Builder.payer] with a well-typed `List<Payer>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun payer(payer: JsonField<List<Payer>>) = apply {
                this.payer = payer.map { it.toMutableList() }
            }

            /**
             * Adds a single [Payer] to [Builder.payer].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addPayer(payer: Payer) = apply {
                this.payer =
                    (this.payer ?: JsonField.of(mutableListOf())).also {
                        checkKnown("payer", it).add(payer)
                    }
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
             * Returns an immutable instance of [VoidedCheck].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .accountNumberId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): VoidedCheck =
                VoidedCheck(
                    checkRequired("accountNumberId", accountNumberId),
                    (payer ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): VoidedCheck = apply {
            if (validated) {
                return@apply
            }

            accountNumberId()
            payer().ifPresent { it.forEach { it.validate() } }
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
            (if (accountNumberId.asKnown().isPresent) 1 else 0) +
                (payer.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        class Payer
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val line: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("line") @ExcludeMissing line: JsonField<String> = JsonMissing.of()
            ) : this(line, mutableMapOf())

            /**
             * The contents of the line.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun line(): String = line.getRequired("line")

            /**
             * Returns the raw JSON value of [line].
             *
             * Unlike [line], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("line") @ExcludeMissing fun _line(): JsonField<String> = line

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
                 * Returns a mutable builder for constructing an instance of [Payer].
                 *
                 * The following fields are required:
                 * ```java
                 * .line()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Payer]. */
            class Builder internal constructor() {

                private var line: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(payer: Payer) = apply {
                    line = payer.line
                    additionalProperties = payer.additionalProperties.toMutableMap()
                }

                /** The contents of the line. */
                fun line(line: String) = line(JsonField.of(line))

                /**
                 * Sets [Builder.line] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.line] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun line(line: JsonField<String>) = apply { this.line = line }

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
                 * Returns an immutable instance of [Payer].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .line()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Payer =
                    Payer(checkRequired("line", line), additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Payer = apply {
                if (validated) {
                    return@apply
                }

                line()
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
            @JvmSynthetic internal fun validity(): Int = (if (line.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Payer &&
                    line == other.line &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(line, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Payer{line=$line, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is VoidedCheck &&
                accountNumberId == other.accountNumberId &&
                payer == other.payer &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(accountNumberId, payer, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "VoidedCheck{accountNumberId=$accountNumberId, payer=$payer, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExportCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ExportCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
