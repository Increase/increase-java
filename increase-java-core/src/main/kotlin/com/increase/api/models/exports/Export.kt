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
import com.increase.api.core.checkKnown
import com.increase.api.core.checkRequired
import com.increase.api.core.toImmutable
import com.increase.api.errors.IncreaseInvalidDataException
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Exports are generated files. Some exports can contain a lot of data, like a CSV of your
 * transactions. Others can be a single document, like a tax form. Since they can take a while, they
 * are generated asynchronously. We send a webhook when they are ready. For more information, please
 * read our [Exports documentation](https://increase.com/documentation/exports).
 */
class Export
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val accountStatementBai2: JsonField<AccountStatementBai2>,
    private val accountStatementOfx: JsonField<AccountStatementOfx>,
    private val accountVerificationLetter: JsonField<AccountVerificationLetter>,
    private val balanceCsv: JsonField<BalanceCsv>,
    private val bookkeepingAccountBalanceCsv: JsonField<BookkeepingAccountBalanceCsv>,
    private val category: JsonField<Category>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val dashboardTableCsv: JsonField<DashboardTableCsv>,
    private val entityCsv: JsonField<EntityCsv>,
    private val feeCsv: JsonField<FeeCsv>,
    private val form1099Int: JsonField<Form1099Int>,
    private val form1099Misc: JsonField<Form1099Misc>,
    private val fundingInstructions: JsonField<FundingInstructions>,
    private val idempotencyKey: JsonField<String>,
    private val result: JsonField<Result>,
    private val status: JsonField<Status>,
    private val transactionCsv: JsonField<TransactionCsv>,
    private val type: JsonField<Type>,
    private val vendorCsv: JsonField<VendorCsv>,
    private val voidedCheck: JsonField<VoidedCheck>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
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
        bookkeepingAccountBalanceCsv: JsonField<BookkeepingAccountBalanceCsv> = JsonMissing.of(),
        @JsonProperty("category") @ExcludeMissing category: JsonField<Category> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("dashboard_table_csv")
        @ExcludeMissing
        dashboardTableCsv: JsonField<DashboardTableCsv> = JsonMissing.of(),
        @JsonProperty("entity_csv")
        @ExcludeMissing
        entityCsv: JsonField<EntityCsv> = JsonMissing.of(),
        @JsonProperty("fee_csv") @ExcludeMissing feeCsv: JsonField<FeeCsv> = JsonMissing.of(),
        @JsonProperty("form_1099_int")
        @ExcludeMissing
        form1099Int: JsonField<Form1099Int> = JsonMissing.of(),
        @JsonProperty("form_1099_misc")
        @ExcludeMissing
        form1099Misc: JsonField<Form1099Misc> = JsonMissing.of(),
        @JsonProperty("funding_instructions")
        @ExcludeMissing
        fundingInstructions: JsonField<FundingInstructions> = JsonMissing.of(),
        @JsonProperty("idempotency_key")
        @ExcludeMissing
        idempotencyKey: JsonField<String> = JsonMissing.of(),
        @JsonProperty("result") @ExcludeMissing result: JsonField<Result> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("transaction_csv")
        @ExcludeMissing
        transactionCsv: JsonField<TransactionCsv> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("vendor_csv")
        @ExcludeMissing
        vendorCsv: JsonField<VendorCsv> = JsonMissing.of(),
        @JsonProperty("voided_check")
        @ExcludeMissing
        voidedCheck: JsonField<VoidedCheck> = JsonMissing.of(),
    ) : this(
        id,
        accountStatementBai2,
        accountStatementOfx,
        accountVerificationLetter,
        balanceCsv,
        bookkeepingAccountBalanceCsv,
        category,
        createdAt,
        dashboardTableCsv,
        entityCsv,
        feeCsv,
        form1099Int,
        form1099Misc,
        fundingInstructions,
        idempotencyKey,
        result,
        status,
        transactionCsv,
        type,
        vendorCsv,
        voidedCheck,
        mutableMapOf(),
    )

    /**
     * The Export identifier.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Details of the account statement BAI2 export. This field will be present when the `category`
     * is equal to `account_statement_bai2`.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accountStatementBai2(): Optional<AccountStatementBai2> =
        accountStatementBai2.getOptional("account_statement_bai2")

    /**
     * Details of the account statement OFX export. This field will be present when the `category`
     * is equal to `account_statement_ofx`.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accountStatementOfx(): Optional<AccountStatementOfx> =
        accountStatementOfx.getOptional("account_statement_ofx")

    /**
     * Details of the account verification letter export. This field will be present when the
     * `category` is equal to `account_verification_letter`.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accountVerificationLetter(): Optional<AccountVerificationLetter> =
        accountVerificationLetter.getOptional("account_verification_letter")

    /**
     * Details of the balance CSV export. This field will be present when the `category` is equal to
     * `balance_csv`.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun balanceCsv(): Optional<BalanceCsv> = balanceCsv.getOptional("balance_csv")

    /**
     * Details of the bookkeeping account balance CSV export. This field will be present when the
     * `category` is equal to `bookkeeping_account_balance_csv`.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun bookkeepingAccountBalanceCsv(): Optional<BookkeepingAccountBalanceCsv> =
        bookkeepingAccountBalanceCsv.getOptional("bookkeeping_account_balance_csv")

    /**
     * The category of the Export. We may add additional possible values for this enum over time;
     * your application should be able to handle that gracefully.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun category(): Category = category.getRequired("category")

    /**
     * The time the Export was created.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * Details of the dashboard table CSV export. This field will be present when the `category` is
     * equal to `dashboard_table_csv`.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dashboardTableCsv(): Optional<DashboardTableCsv> =
        dashboardTableCsv.getOptional("dashboard_table_csv")

    /**
     * Details of the entity CSV export. This field will be present when the `category` is equal to
     * `entity_csv`.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun entityCsv(): Optional<EntityCsv> = entityCsv.getOptional("entity_csv")

    /**
     * Details of the fee CSV export. This field will be present when the `category` is equal to
     * `fee_csv`.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun feeCsv(): Optional<FeeCsv> = feeCsv.getOptional("fee_csv")

    /**
     * Details of the Form 1099-INT export. This field will be present when the `category` is equal
     * to `form_1099_int`.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun form1099Int(): Optional<Form1099Int> = form1099Int.getOptional("form_1099_int")

    /**
     * Details of the Form 1099-MISC export. This field will be present when the `category` is equal
     * to `form_1099_misc`.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun form1099Misc(): Optional<Form1099Misc> = form1099Misc.getOptional("form_1099_misc")

    /**
     * Details of the funding instructions export. This field will be present when the `category` is
     * equal to `funding_instructions`.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fundingInstructions(): Optional<FundingInstructions> =
        fundingInstructions.getOptional("funding_instructions")

    /**
     * The idempotency key you chose for this object. This value is unique across Increase and is
     * used to ensure that a request is only processed once. Learn more about
     * [idempotency](https://increase.com/documentation/idempotency-keys).
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun idempotencyKey(): Optional<String> = idempotencyKey.getOptional("idempotency_key")

    /**
     * The result of the Export. This will be present when the Export's status transitions to
     * `complete`.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun result(): Optional<Result> = result.getOptional("result")

    /**
     * The status of the Export.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * Details of the transaction CSV export. This field will be present when the `category` is
     * equal to `transaction_csv`.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun transactionCsv(): Optional<TransactionCsv> = transactionCsv.getOptional("transaction_csv")

    /**
     * A constant representing the object's type. For this resource it will always be `export`.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * Details of the vendor CSV export. This field will be present when the `category` is equal to
     * `vendor_csv`.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun vendorCsv(): Optional<VendorCsv> = vendorCsv.getOptional("vendor_csv")

    /**
     * Details of the voided check export. This field will be present when the `category` is equal
     * to `voided_check`.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun voidedCheck(): Optional<VoidedCheck> = voidedCheck.getOptional("voided_check")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [accountStatementBai2].
     *
     * Unlike [accountStatementBai2], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("account_statement_bai2")
    @ExcludeMissing
    fun _accountStatementBai2(): JsonField<AccountStatementBai2> = accountStatementBai2

    /**
     * Returns the raw JSON value of [accountStatementOfx].
     *
     * Unlike [accountStatementOfx], this method doesn't throw if the JSON field has an unexpected
     * type.
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
     * Returns the raw JSON value of [category].
     *
     * Unlike [category], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("category") @ExcludeMissing fun _category(): JsonField<Category> = category

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [dashboardTableCsv].
     *
     * Unlike [dashboardTableCsv], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("dashboard_table_csv")
    @ExcludeMissing
    fun _dashboardTableCsv(): JsonField<DashboardTableCsv> = dashboardTableCsv

    /**
     * Returns the raw JSON value of [entityCsv].
     *
     * Unlike [entityCsv], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("entity_csv") @ExcludeMissing fun _entityCsv(): JsonField<EntityCsv> = entityCsv

    /**
     * Returns the raw JSON value of [feeCsv].
     *
     * Unlike [feeCsv], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fee_csv") @ExcludeMissing fun _feeCsv(): JsonField<FeeCsv> = feeCsv

    /**
     * Returns the raw JSON value of [form1099Int].
     *
     * Unlike [form1099Int], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("form_1099_int")
    @ExcludeMissing
    fun _form1099Int(): JsonField<Form1099Int> = form1099Int

    /**
     * Returns the raw JSON value of [form1099Misc].
     *
     * Unlike [form1099Misc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("form_1099_misc")
    @ExcludeMissing
    fun _form1099Misc(): JsonField<Form1099Misc> = form1099Misc

    /**
     * Returns the raw JSON value of [fundingInstructions].
     *
     * Unlike [fundingInstructions], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("funding_instructions")
    @ExcludeMissing
    fun _fundingInstructions(): JsonField<FundingInstructions> = fundingInstructions

    /**
     * Returns the raw JSON value of [idempotencyKey].
     *
     * Unlike [idempotencyKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idempotency_key")
    @ExcludeMissing
    fun _idempotencyKey(): JsonField<String> = idempotencyKey

    /**
     * Returns the raw JSON value of [result].
     *
     * Unlike [result], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("result") @ExcludeMissing fun _result(): JsonField<Result> = result

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [transactionCsv].
     *
     * Unlike [transactionCsv], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("transaction_csv")
    @ExcludeMissing
    fun _transactionCsv(): JsonField<TransactionCsv> = transactionCsv

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    /**
     * Returns the raw JSON value of [vendorCsv].
     *
     * Unlike [vendorCsv], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("vendor_csv") @ExcludeMissing fun _vendorCsv(): JsonField<VendorCsv> = vendorCsv

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
         * Returns a mutable builder for constructing an instance of [Export].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .accountStatementBai2()
         * .accountStatementOfx()
         * .accountVerificationLetter()
         * .balanceCsv()
         * .bookkeepingAccountBalanceCsv()
         * .category()
         * .createdAt()
         * .dashboardTableCsv()
         * .entityCsv()
         * .feeCsv()
         * .form1099Int()
         * .form1099Misc()
         * .fundingInstructions()
         * .idempotencyKey()
         * .result()
         * .status()
         * .transactionCsv()
         * .type()
         * .vendorCsv()
         * .voidedCheck()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Export]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var accountStatementBai2: JsonField<AccountStatementBai2>? = null
        private var accountStatementOfx: JsonField<AccountStatementOfx>? = null
        private var accountVerificationLetter: JsonField<AccountVerificationLetter>? = null
        private var balanceCsv: JsonField<BalanceCsv>? = null
        private var bookkeepingAccountBalanceCsv: JsonField<BookkeepingAccountBalanceCsv>? = null
        private var category: JsonField<Category>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var dashboardTableCsv: JsonField<DashboardTableCsv>? = null
        private var entityCsv: JsonField<EntityCsv>? = null
        private var feeCsv: JsonField<FeeCsv>? = null
        private var form1099Int: JsonField<Form1099Int>? = null
        private var form1099Misc: JsonField<Form1099Misc>? = null
        private var fundingInstructions: JsonField<FundingInstructions>? = null
        private var idempotencyKey: JsonField<String>? = null
        private var result: JsonField<Result>? = null
        private var status: JsonField<Status>? = null
        private var transactionCsv: JsonField<TransactionCsv>? = null
        private var type: JsonField<Type>? = null
        private var vendorCsv: JsonField<VendorCsv>? = null
        private var voidedCheck: JsonField<VoidedCheck>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(export: Export) = apply {
            id = export.id
            accountStatementBai2 = export.accountStatementBai2
            accountStatementOfx = export.accountStatementOfx
            accountVerificationLetter = export.accountVerificationLetter
            balanceCsv = export.balanceCsv
            bookkeepingAccountBalanceCsv = export.bookkeepingAccountBalanceCsv
            category = export.category
            createdAt = export.createdAt
            dashboardTableCsv = export.dashboardTableCsv
            entityCsv = export.entityCsv
            feeCsv = export.feeCsv
            form1099Int = export.form1099Int
            form1099Misc = export.form1099Misc
            fundingInstructions = export.fundingInstructions
            idempotencyKey = export.idempotencyKey
            result = export.result
            status = export.status
            transactionCsv = export.transactionCsv
            type = export.type
            vendorCsv = export.vendorCsv
            voidedCheck = export.voidedCheck
            additionalProperties = export.additionalProperties.toMutableMap()
        }

        /** The Export identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * Details of the account statement BAI2 export. This field will be present when the
         * `category` is equal to `account_statement_bai2`.
         */
        fun accountStatementBai2(accountStatementBai2: AccountStatementBai2?) =
            accountStatementBai2(JsonField.ofNullable(accountStatementBai2))

        /**
         * Alias for calling [Builder.accountStatementBai2] with
         * `accountStatementBai2.orElse(null)`.
         */
        fun accountStatementBai2(accountStatementBai2: Optional<AccountStatementBai2>) =
            accountStatementBai2(accountStatementBai2.getOrNull())

        /**
         * Sets [Builder.accountStatementBai2] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountStatementBai2] with a well-typed
         * [AccountStatementBai2] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun accountStatementBai2(accountStatementBai2: JsonField<AccountStatementBai2>) = apply {
            this.accountStatementBai2 = accountStatementBai2
        }

        /**
         * Details of the account statement OFX export. This field will be present when the
         * `category` is equal to `account_statement_ofx`.
         */
        fun accountStatementOfx(accountStatementOfx: AccountStatementOfx?) =
            accountStatementOfx(JsonField.ofNullable(accountStatementOfx))

        /**
         * Alias for calling [Builder.accountStatementOfx] with `accountStatementOfx.orElse(null)`.
         */
        fun accountStatementOfx(accountStatementOfx: Optional<AccountStatementOfx>) =
            accountStatementOfx(accountStatementOfx.getOrNull())

        /**
         * Sets [Builder.accountStatementOfx] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountStatementOfx] with a well-typed
         * [AccountStatementOfx] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun accountStatementOfx(accountStatementOfx: JsonField<AccountStatementOfx>) = apply {
            this.accountStatementOfx = accountStatementOfx
        }

        /**
         * Details of the account verification letter export. This field will be present when the
         * `category` is equal to `account_verification_letter`.
         */
        fun accountVerificationLetter(accountVerificationLetter: AccountVerificationLetter?) =
            accountVerificationLetter(JsonField.ofNullable(accountVerificationLetter))

        /**
         * Alias for calling [Builder.accountVerificationLetter] with
         * `accountVerificationLetter.orElse(null)`.
         */
        fun accountVerificationLetter(
            accountVerificationLetter: Optional<AccountVerificationLetter>
        ) = accountVerificationLetter(accountVerificationLetter.getOrNull())

        /**
         * Sets [Builder.accountVerificationLetter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountVerificationLetter] with a well-typed
         * [AccountVerificationLetter] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun accountVerificationLetter(
            accountVerificationLetter: JsonField<AccountVerificationLetter>
        ) = apply { this.accountVerificationLetter = accountVerificationLetter }

        /**
         * Details of the balance CSV export. This field will be present when the `category` is
         * equal to `balance_csv`.
         */
        fun balanceCsv(balanceCsv: BalanceCsv?) = balanceCsv(JsonField.ofNullable(balanceCsv))

        /** Alias for calling [Builder.balanceCsv] with `balanceCsv.orElse(null)`. */
        fun balanceCsv(balanceCsv: Optional<BalanceCsv>) = balanceCsv(balanceCsv.getOrNull())

        /**
         * Sets [Builder.balanceCsv] to an arbitrary JSON value.
         *
         * You should usually call [Builder.balanceCsv] with a well-typed [BalanceCsv] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun balanceCsv(balanceCsv: JsonField<BalanceCsv>) = apply { this.balanceCsv = balanceCsv }

        /**
         * Details of the bookkeeping account balance CSV export. This field will be present when
         * the `category` is equal to `bookkeeping_account_balance_csv`.
         */
        fun bookkeepingAccountBalanceCsv(
            bookkeepingAccountBalanceCsv: BookkeepingAccountBalanceCsv?
        ) = bookkeepingAccountBalanceCsv(JsonField.ofNullable(bookkeepingAccountBalanceCsv))

        /**
         * Alias for calling [Builder.bookkeepingAccountBalanceCsv] with
         * `bookkeepingAccountBalanceCsv.orElse(null)`.
         */
        fun bookkeepingAccountBalanceCsv(
            bookkeepingAccountBalanceCsv: Optional<BookkeepingAccountBalanceCsv>
        ) = bookkeepingAccountBalanceCsv(bookkeepingAccountBalanceCsv.getOrNull())

        /**
         * Sets [Builder.bookkeepingAccountBalanceCsv] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bookkeepingAccountBalanceCsv] with a well-typed
         * [BookkeepingAccountBalanceCsv] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun bookkeepingAccountBalanceCsv(
            bookkeepingAccountBalanceCsv: JsonField<BookkeepingAccountBalanceCsv>
        ) = apply { this.bookkeepingAccountBalanceCsv = bookkeepingAccountBalanceCsv }

        /**
         * The category of the Export. We may add additional possible values for this enum over
         * time; your application should be able to handle that gracefully.
         */
        fun category(category: Category) = category(JsonField.of(category))

        /**
         * Sets [Builder.category] to an arbitrary JSON value.
         *
         * You should usually call [Builder.category] with a well-typed [Category] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun category(category: JsonField<Category>) = apply { this.category = category }

        /** The time the Export was created. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /**
         * Details of the dashboard table CSV export. This field will be present when the `category`
         * is equal to `dashboard_table_csv`.
         */
        fun dashboardTableCsv(dashboardTableCsv: DashboardTableCsv?) =
            dashboardTableCsv(JsonField.ofNullable(dashboardTableCsv))

        /** Alias for calling [Builder.dashboardTableCsv] with `dashboardTableCsv.orElse(null)`. */
        fun dashboardTableCsv(dashboardTableCsv: Optional<DashboardTableCsv>) =
            dashboardTableCsv(dashboardTableCsv.getOrNull())

        /**
         * Sets [Builder.dashboardTableCsv] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dashboardTableCsv] with a well-typed [DashboardTableCsv]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun dashboardTableCsv(dashboardTableCsv: JsonField<DashboardTableCsv>) = apply {
            this.dashboardTableCsv = dashboardTableCsv
        }

        /**
         * Details of the entity CSV export. This field will be present when the `category` is equal
         * to `entity_csv`.
         */
        fun entityCsv(entityCsv: EntityCsv?) = entityCsv(JsonField.ofNullable(entityCsv))

        /** Alias for calling [Builder.entityCsv] with `entityCsv.orElse(null)`. */
        fun entityCsv(entityCsv: Optional<EntityCsv>) = entityCsv(entityCsv.getOrNull())

        /**
         * Sets [Builder.entityCsv] to an arbitrary JSON value.
         *
         * You should usually call [Builder.entityCsv] with a well-typed [EntityCsv] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun entityCsv(entityCsv: JsonField<EntityCsv>) = apply { this.entityCsv = entityCsv }

        /**
         * Details of the fee CSV export. This field will be present when the `category` is equal to
         * `fee_csv`.
         */
        fun feeCsv(feeCsv: FeeCsv?) = feeCsv(JsonField.ofNullable(feeCsv))

        /** Alias for calling [Builder.feeCsv] with `feeCsv.orElse(null)`. */
        fun feeCsv(feeCsv: Optional<FeeCsv>) = feeCsv(feeCsv.getOrNull())

        /**
         * Sets [Builder.feeCsv] to an arbitrary JSON value.
         *
         * You should usually call [Builder.feeCsv] with a well-typed [FeeCsv] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun feeCsv(feeCsv: JsonField<FeeCsv>) = apply { this.feeCsv = feeCsv }

        /**
         * Details of the Form 1099-INT export. This field will be present when the `category` is
         * equal to `form_1099_int`.
         */
        fun form1099Int(form1099Int: Form1099Int?) = form1099Int(JsonField.ofNullable(form1099Int))

        /** Alias for calling [Builder.form1099Int] with `form1099Int.orElse(null)`. */
        fun form1099Int(form1099Int: Optional<Form1099Int>) = form1099Int(form1099Int.getOrNull())

        /**
         * Sets [Builder.form1099Int] to an arbitrary JSON value.
         *
         * You should usually call [Builder.form1099Int] with a well-typed [Form1099Int] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun form1099Int(form1099Int: JsonField<Form1099Int>) = apply {
            this.form1099Int = form1099Int
        }

        /**
         * Details of the Form 1099-MISC export. This field will be present when the `category` is
         * equal to `form_1099_misc`.
         */
        fun form1099Misc(form1099Misc: Form1099Misc?) =
            form1099Misc(JsonField.ofNullable(form1099Misc))

        /** Alias for calling [Builder.form1099Misc] with `form1099Misc.orElse(null)`. */
        fun form1099Misc(form1099Misc: Optional<Form1099Misc>) =
            form1099Misc(form1099Misc.getOrNull())

        /**
         * Sets [Builder.form1099Misc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.form1099Misc] with a well-typed [Form1099Misc] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun form1099Misc(form1099Misc: JsonField<Form1099Misc>) = apply {
            this.form1099Misc = form1099Misc
        }

        /**
         * Details of the funding instructions export. This field will be present when the
         * `category` is equal to `funding_instructions`.
         */
        fun fundingInstructions(fundingInstructions: FundingInstructions?) =
            fundingInstructions(JsonField.ofNullable(fundingInstructions))

        /**
         * Alias for calling [Builder.fundingInstructions] with `fundingInstructions.orElse(null)`.
         */
        fun fundingInstructions(fundingInstructions: Optional<FundingInstructions>) =
            fundingInstructions(fundingInstructions.getOrNull())

        /**
         * Sets [Builder.fundingInstructions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fundingInstructions] with a well-typed
         * [FundingInstructions] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun fundingInstructions(fundingInstructions: JsonField<FundingInstructions>) = apply {
            this.fundingInstructions = fundingInstructions
        }

        /**
         * The idempotency key you chose for this object. This value is unique across Increase and
         * is used to ensure that a request is only processed once. Learn more about
         * [idempotency](https://increase.com/documentation/idempotency-keys).
         */
        fun idempotencyKey(idempotencyKey: String?) =
            idempotencyKey(JsonField.ofNullable(idempotencyKey))

        /** Alias for calling [Builder.idempotencyKey] with `idempotencyKey.orElse(null)`. */
        fun idempotencyKey(idempotencyKey: Optional<String>) =
            idempotencyKey(idempotencyKey.getOrNull())

        /**
         * Sets [Builder.idempotencyKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idempotencyKey] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun idempotencyKey(idempotencyKey: JsonField<String>) = apply {
            this.idempotencyKey = idempotencyKey
        }

        /**
         * The result of the Export. This will be present when the Export's status transitions to
         * `complete`.
         */
        fun result(result: Result?) = result(JsonField.ofNullable(result))

        /** Alias for calling [Builder.result] with `result.orElse(null)`. */
        fun result(result: Optional<Result>) = result(result.getOrNull())

        /**
         * Sets [Builder.result] to an arbitrary JSON value.
         *
         * You should usually call [Builder.result] with a well-typed [Result] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun result(result: JsonField<Result>) = apply { this.result = result }

        /** The status of the Export. */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /**
         * Details of the transaction CSV export. This field will be present when the `category` is
         * equal to `transaction_csv`.
         */
        fun transactionCsv(transactionCsv: TransactionCsv?) =
            transactionCsv(JsonField.ofNullable(transactionCsv))

        /** Alias for calling [Builder.transactionCsv] with `transactionCsv.orElse(null)`. */
        fun transactionCsv(transactionCsv: Optional<TransactionCsv>) =
            transactionCsv(transactionCsv.getOrNull())

        /**
         * Sets [Builder.transactionCsv] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transactionCsv] with a well-typed [TransactionCsv] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun transactionCsv(transactionCsv: JsonField<TransactionCsv>) = apply {
            this.transactionCsv = transactionCsv
        }

        /**
         * A constant representing the object's type. For this resource it will always be `export`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /**
         * Details of the vendor CSV export. This field will be present when the `category` is equal
         * to `vendor_csv`.
         */
        fun vendorCsv(vendorCsv: VendorCsv?) = vendorCsv(JsonField.ofNullable(vendorCsv))

        /** Alias for calling [Builder.vendorCsv] with `vendorCsv.orElse(null)`. */
        fun vendorCsv(vendorCsv: Optional<VendorCsv>) = vendorCsv(vendorCsv.getOrNull())

        /**
         * Sets [Builder.vendorCsv] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vendorCsv] with a well-typed [VendorCsv] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun vendorCsv(vendorCsv: JsonField<VendorCsv>) = apply { this.vendorCsv = vendorCsv }

        /**
         * Details of the voided check export. This field will be present when the `category` is
         * equal to `voided_check`.
         */
        fun voidedCheck(voidedCheck: VoidedCheck?) = voidedCheck(JsonField.ofNullable(voidedCheck))

        /** Alias for calling [Builder.voidedCheck] with `voidedCheck.orElse(null)`. */
        fun voidedCheck(voidedCheck: Optional<VoidedCheck>) = voidedCheck(voidedCheck.getOrNull())

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
         * Returns an immutable instance of [Export].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .accountStatementBai2()
         * .accountStatementOfx()
         * .accountVerificationLetter()
         * .balanceCsv()
         * .bookkeepingAccountBalanceCsv()
         * .category()
         * .createdAt()
         * .dashboardTableCsv()
         * .entityCsv()
         * .feeCsv()
         * .form1099Int()
         * .form1099Misc()
         * .fundingInstructions()
         * .idempotencyKey()
         * .result()
         * .status()
         * .transactionCsv()
         * .type()
         * .vendorCsv()
         * .voidedCheck()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Export =
            Export(
                checkRequired("id", id),
                checkRequired("accountStatementBai2", accountStatementBai2),
                checkRequired("accountStatementOfx", accountStatementOfx),
                checkRequired("accountVerificationLetter", accountVerificationLetter),
                checkRequired("balanceCsv", balanceCsv),
                checkRequired("bookkeepingAccountBalanceCsv", bookkeepingAccountBalanceCsv),
                checkRequired("category", category),
                checkRequired("createdAt", createdAt),
                checkRequired("dashboardTableCsv", dashboardTableCsv),
                checkRequired("entityCsv", entityCsv),
                checkRequired("feeCsv", feeCsv),
                checkRequired("form1099Int", form1099Int),
                checkRequired("form1099Misc", form1099Misc),
                checkRequired("fundingInstructions", fundingInstructions),
                checkRequired("idempotencyKey", idempotencyKey),
                checkRequired("result", result),
                checkRequired("status", status),
                checkRequired("transactionCsv", transactionCsv),
                checkRequired("type", type),
                checkRequired("vendorCsv", vendorCsv),
                checkRequired("voidedCheck", voidedCheck),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Export = apply {
        if (validated) {
            return@apply
        }

        id()
        accountStatementBai2().ifPresent { it.validate() }
        accountStatementOfx().ifPresent { it.validate() }
        accountVerificationLetter().ifPresent { it.validate() }
        balanceCsv().ifPresent { it.validate() }
        bookkeepingAccountBalanceCsv().ifPresent { it.validate() }
        category().validate()
        createdAt()
        dashboardTableCsv().ifPresent { it.validate() }
        entityCsv().ifPresent { it.validate() }
        feeCsv().ifPresent { it.validate() }
        form1099Int().ifPresent { it.validate() }
        form1099Misc().ifPresent { it.validate() }
        fundingInstructions().ifPresent { it.validate() }
        idempotencyKey()
        result().ifPresent { it.validate() }
        status().validate()
        transactionCsv().ifPresent { it.validate() }
        type().validate()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (id.asKnown().isPresent) 1 else 0) +
            (accountStatementBai2.asKnown().getOrNull()?.validity() ?: 0) +
            (accountStatementOfx.asKnown().getOrNull()?.validity() ?: 0) +
            (accountVerificationLetter.asKnown().getOrNull()?.validity() ?: 0) +
            (balanceCsv.asKnown().getOrNull()?.validity() ?: 0) +
            (bookkeepingAccountBalanceCsv.asKnown().getOrNull()?.validity() ?: 0) +
            (category.asKnown().getOrNull()?.validity() ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (dashboardTableCsv.asKnown().getOrNull()?.validity() ?: 0) +
            (entityCsv.asKnown().getOrNull()?.validity() ?: 0) +
            (feeCsv.asKnown().getOrNull()?.validity() ?: 0) +
            (form1099Int.asKnown().getOrNull()?.validity() ?: 0) +
            (form1099Misc.asKnown().getOrNull()?.validity() ?: 0) +
            (fundingInstructions.asKnown().getOrNull()?.validity() ?: 0) +
            (if (idempotencyKey.asKnown().isPresent) 1 else 0) +
            (result.asKnown().getOrNull()?.validity() ?: 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (transactionCsv.asKnown().getOrNull()?.validity() ?: 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0) +
            (vendorCsv.asKnown().getOrNull()?.validity() ?: 0) +
            (voidedCheck.asKnown().getOrNull()?.validity() ?: 0)

    /**
     * Details of the account statement BAI2 export. This field will be present when the `category`
     * is equal to `account_statement_bai2`.
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
         * Filter results by Account.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun accountId(): Optional<String> = accountId.getOptional("account_id")

        /**
         * The date for which to retrieve the balance.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun effectiveDate(): Optional<LocalDate> = effectiveDate.getOptional("effective_date")

        /**
         * Filter results by Program.
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

            /**
             * Returns a mutable builder for constructing an instance of [AccountStatementBai2].
             *
             * The following fields are required:
             * ```java
             * .accountId()
             * .effectiveDate()
             * .programId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [AccountStatementBai2]. */
        class Builder internal constructor() {

            private var accountId: JsonField<String>? = null
            private var effectiveDate: JsonField<LocalDate>? = null
            private var programId: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(accountStatementBai2: AccountStatementBai2) = apply {
                accountId = accountStatementBai2.accountId
                effectiveDate = accountStatementBai2.effectiveDate
                programId = accountStatementBai2.programId
                additionalProperties = accountStatementBai2.additionalProperties.toMutableMap()
            }

            /** Filter results by Account. */
            fun accountId(accountId: String?) = accountId(JsonField.ofNullable(accountId))

            /** Alias for calling [Builder.accountId] with `accountId.orElse(null)`. */
            fun accountId(accountId: Optional<String>) = accountId(accountId.getOrNull())

            /**
             * Sets [Builder.accountId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

            /** The date for which to retrieve the balance. */
            fun effectiveDate(effectiveDate: LocalDate?) =
                effectiveDate(JsonField.ofNullable(effectiveDate))

            /** Alias for calling [Builder.effectiveDate] with `effectiveDate.orElse(null)`. */
            fun effectiveDate(effectiveDate: Optional<LocalDate>) =
                effectiveDate(effectiveDate.getOrNull())

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

            /** Filter results by Program. */
            fun programId(programId: String?) = programId(JsonField.ofNullable(programId))

            /** Alias for calling [Builder.programId] with `programId.orElse(null)`. */
            fun programId(programId: Optional<String>) = programId(programId.getOrNull())

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
             *
             * The following fields are required:
             * ```java
             * .accountId()
             * .effectiveDate()
             * .programId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): AccountStatementBai2 =
                AccountStatementBai2(
                    checkRequired("accountId", accountId),
                    checkRequired("effectiveDate", effectiveDate),
                    checkRequired("programId", programId),
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
     * Details of the account statement OFX export. This field will be present when the `category`
     * is equal to `account_statement_ofx`.
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
         * Filter transactions by their created date.
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
             * .createdAt()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [AccountStatementOfx]. */
        class Builder internal constructor() {

            private var accountId: JsonField<String>? = null
            private var createdAt: JsonField<CreatedAt>? = null
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

            /** Filter transactions by their created date. */
            fun createdAt(createdAt: CreatedAt?) = createdAt(JsonField.ofNullable(createdAt))

            /** Alias for calling [Builder.createdAt] with `createdAt.orElse(null)`. */
            fun createdAt(createdAt: Optional<CreatedAt>) = createdAt(createdAt.getOrNull())

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
             * .createdAt()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): AccountStatementOfx =
                AccountStatementOfx(
                    checkRequired("accountId", accountId),
                    checkRequired("createdAt", createdAt),
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

        /** Filter transactions by their created date. */
        class CreatedAt
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val after: JsonField<OffsetDateTime>,
            private val before: JsonField<OffsetDateTime>,
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
            ) : this(after, before, mutableMapOf())

            /**
             * Filter results to transactions created after this time.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun after(): Optional<OffsetDateTime> = after.getOptional("after")

            /**
             * Filter results to transactions created before this time.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun before(): Optional<OffsetDateTime> = before.getOptional("before")

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
                 * Returns a mutable builder for constructing an instance of [CreatedAt].
                 *
                 * The following fields are required:
                 * ```java
                 * .after()
                 * .before()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [CreatedAt]. */
            class Builder internal constructor() {

                private var after: JsonField<OffsetDateTime>? = null
                private var before: JsonField<OffsetDateTime>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(createdAt: CreatedAt) = apply {
                    after = createdAt.after
                    before = createdAt.before
                    additionalProperties = createdAt.additionalProperties.toMutableMap()
                }

                /** Filter results to transactions created after this time. */
                fun after(after: OffsetDateTime?) = after(JsonField.ofNullable(after))

                /** Alias for calling [Builder.after] with `after.orElse(null)`. */
                fun after(after: Optional<OffsetDateTime>) = after(after.getOrNull())

                /**
                 * Sets [Builder.after] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.after] with a well-typed [OffsetDateTime] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun after(after: JsonField<OffsetDateTime>) = apply { this.after = after }

                /** Filter results to transactions created before this time. */
                fun before(before: OffsetDateTime?) = before(JsonField.ofNullable(before))

                /** Alias for calling [Builder.before] with `before.orElse(null)`. */
                fun before(before: Optional<OffsetDateTime>) = before(before.getOrNull())

                /**
                 * Sets [Builder.before] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.before] with a well-typed [OffsetDateTime] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun before(before: JsonField<OffsetDateTime>) = apply { this.before = before }

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
                 *
                 * The following fields are required:
                 * ```java
                 * .after()
                 * .before()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): CreatedAt =
                    CreatedAt(
                        checkRequired("after", after),
                        checkRequired("before", before),
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
                    (if (before.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CreatedAt &&
                    after == other.after &&
                    before == other.before &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(after, before, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CreatedAt{after=$after, before=$before, additionalProperties=$additionalProperties}"
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
     * Details of the account verification letter export. This field will be present when the
     * `category` is equal to `account_verification_letter`.
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
         * The date of the balance to include in the letter.
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
             * .balanceDate()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [AccountVerificationLetter]. */
        class Builder internal constructor() {

            private var accountNumberId: JsonField<String>? = null
            private var balanceDate: JsonField<LocalDate>? = null
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

            /** The date of the balance to include in the letter. */
            fun balanceDate(balanceDate: LocalDate?) =
                balanceDate(JsonField.ofNullable(balanceDate))

            /** Alias for calling [Builder.balanceDate] with `balanceDate.orElse(null)`. */
            fun balanceDate(balanceDate: Optional<LocalDate>) = balanceDate(balanceDate.getOrNull())

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
             * .balanceDate()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): AccountVerificationLetter =
                AccountVerificationLetter(
                    checkRequired("accountNumberId", accountNumberId),
                    checkRequired("balanceDate", balanceDate),
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

    /**
     * Details of the balance CSV export. This field will be present when the `category` is equal to
     * `balance_csv`.
     */
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
         * Filter results by Account.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun accountId(): Optional<String> = accountId.getOptional("account_id")

        /**
         * Filter balances by their created date.
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
             * Returns a mutable builder for constructing an instance of [BalanceCsv].
             *
             * The following fields are required:
             * ```java
             * .accountId()
             * .createdAt()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [BalanceCsv]. */
        class Builder internal constructor() {

            private var accountId: JsonField<String>? = null
            private var createdAt: JsonField<CreatedAt>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(balanceCsv: BalanceCsv) = apply {
                accountId = balanceCsv.accountId
                createdAt = balanceCsv.createdAt
                additionalProperties = balanceCsv.additionalProperties.toMutableMap()
            }

            /** Filter results by Account. */
            fun accountId(accountId: String?) = accountId(JsonField.ofNullable(accountId))

            /** Alias for calling [Builder.accountId] with `accountId.orElse(null)`. */
            fun accountId(accountId: Optional<String>) = accountId(accountId.getOrNull())

            /**
             * Sets [Builder.accountId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

            /** Filter balances by their created date. */
            fun createdAt(createdAt: CreatedAt?) = createdAt(JsonField.ofNullable(createdAt))

            /** Alias for calling [Builder.createdAt] with `createdAt.orElse(null)`. */
            fun createdAt(createdAt: Optional<CreatedAt>) = createdAt(createdAt.getOrNull())

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
             *
             * The following fields are required:
             * ```java
             * .accountId()
             * .createdAt()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): BalanceCsv =
                BalanceCsv(
                    checkRequired("accountId", accountId),
                    checkRequired("createdAt", createdAt),
                    additionalProperties.toMutableMap(),
                )
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

        /** Filter balances by their created date. */
        class CreatedAt
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val after: JsonField<OffsetDateTime>,
            private val before: JsonField<OffsetDateTime>,
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
            ) : this(after, before, mutableMapOf())

            /**
             * Filter balances created after this time.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun after(): Optional<OffsetDateTime> = after.getOptional("after")

            /**
             * Filter balances created before this time.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun before(): Optional<OffsetDateTime> = before.getOptional("before")

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
                 * Returns a mutable builder for constructing an instance of [CreatedAt].
                 *
                 * The following fields are required:
                 * ```java
                 * .after()
                 * .before()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [CreatedAt]. */
            class Builder internal constructor() {

                private var after: JsonField<OffsetDateTime>? = null
                private var before: JsonField<OffsetDateTime>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(createdAt: CreatedAt) = apply {
                    after = createdAt.after
                    before = createdAt.before
                    additionalProperties = createdAt.additionalProperties.toMutableMap()
                }

                /** Filter balances created after this time. */
                fun after(after: OffsetDateTime?) = after(JsonField.ofNullable(after))

                /** Alias for calling [Builder.after] with `after.orElse(null)`. */
                fun after(after: Optional<OffsetDateTime>) = after(after.getOrNull())

                /**
                 * Sets [Builder.after] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.after] with a well-typed [OffsetDateTime] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun after(after: JsonField<OffsetDateTime>) = apply { this.after = after }

                /** Filter balances created before this time. */
                fun before(before: OffsetDateTime?) = before(JsonField.ofNullable(before))

                /** Alias for calling [Builder.before] with `before.orElse(null)`. */
                fun before(before: Optional<OffsetDateTime>) = before(before.getOrNull())

                /**
                 * Sets [Builder.before] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.before] with a well-typed [OffsetDateTime] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun before(before: JsonField<OffsetDateTime>) = apply { this.before = before }

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
                 *
                 * The following fields are required:
                 * ```java
                 * .after()
                 * .before()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): CreatedAt =
                    CreatedAt(
                        checkRequired("after", after),
                        checkRequired("before", before),
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
                    (if (before.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CreatedAt &&
                    after == other.after &&
                    before == other.before &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(after, before, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CreatedAt{after=$after, before=$before, additionalProperties=$additionalProperties}"
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
     * Details of the bookkeeping account balance CSV export. This field will be present when the
     * `category` is equal to `bookkeeping_account_balance_csv`.
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
         * Filter results by Bookkeeping Account.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun bookkeepingAccountId(): Optional<String> =
            bookkeepingAccountId.getOptional("bookkeeping_account_id")

        /**
         * Filter balances by their created date.
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
             *
             * The following fields are required:
             * ```java
             * .bookkeepingAccountId()
             * .createdAt()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [BookkeepingAccountBalanceCsv]. */
        class Builder internal constructor() {

            private var bookkeepingAccountId: JsonField<String>? = null
            private var createdAt: JsonField<CreatedAt>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(bookkeepingAccountBalanceCsv: BookkeepingAccountBalanceCsv) = apply {
                bookkeepingAccountId = bookkeepingAccountBalanceCsv.bookkeepingAccountId
                createdAt = bookkeepingAccountBalanceCsv.createdAt
                additionalProperties =
                    bookkeepingAccountBalanceCsv.additionalProperties.toMutableMap()
            }

            /** Filter results by Bookkeeping Account. */
            fun bookkeepingAccountId(bookkeepingAccountId: String?) =
                bookkeepingAccountId(JsonField.ofNullable(bookkeepingAccountId))

            /**
             * Alias for calling [Builder.bookkeepingAccountId] with
             * `bookkeepingAccountId.orElse(null)`.
             */
            fun bookkeepingAccountId(bookkeepingAccountId: Optional<String>) =
                bookkeepingAccountId(bookkeepingAccountId.getOrNull())

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

            /** Filter balances by their created date. */
            fun createdAt(createdAt: CreatedAt?) = createdAt(JsonField.ofNullable(createdAt))

            /** Alias for calling [Builder.createdAt] with `createdAt.orElse(null)`. */
            fun createdAt(createdAt: Optional<CreatedAt>) = createdAt(createdAt.getOrNull())

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
             *
             * The following fields are required:
             * ```java
             * .bookkeepingAccountId()
             * .createdAt()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): BookkeepingAccountBalanceCsv =
                BookkeepingAccountBalanceCsv(
                    checkRequired("bookkeepingAccountId", bookkeepingAccountId),
                    checkRequired("createdAt", createdAt),
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

        /** Filter balances by their created date. */
        class CreatedAt
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val after: JsonField<OffsetDateTime>,
            private val before: JsonField<OffsetDateTime>,
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
            ) : this(after, before, mutableMapOf())

            /**
             * Filter balances created after this time.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun after(): Optional<OffsetDateTime> = after.getOptional("after")

            /**
             * Filter balances created before this time.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun before(): Optional<OffsetDateTime> = before.getOptional("before")

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
                 * Returns a mutable builder for constructing an instance of [CreatedAt].
                 *
                 * The following fields are required:
                 * ```java
                 * .after()
                 * .before()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [CreatedAt]. */
            class Builder internal constructor() {

                private var after: JsonField<OffsetDateTime>? = null
                private var before: JsonField<OffsetDateTime>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(createdAt: CreatedAt) = apply {
                    after = createdAt.after
                    before = createdAt.before
                    additionalProperties = createdAt.additionalProperties.toMutableMap()
                }

                /** Filter balances created after this time. */
                fun after(after: OffsetDateTime?) = after(JsonField.ofNullable(after))

                /** Alias for calling [Builder.after] with `after.orElse(null)`. */
                fun after(after: Optional<OffsetDateTime>) = after(after.getOrNull())

                /**
                 * Sets [Builder.after] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.after] with a well-typed [OffsetDateTime] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun after(after: JsonField<OffsetDateTime>) = apply { this.after = after }

                /** Filter balances created before this time. */
                fun before(before: OffsetDateTime?) = before(JsonField.ofNullable(before))

                /** Alias for calling [Builder.before] with `before.orElse(null)`. */
                fun before(before: Optional<OffsetDateTime>) = before(before.getOrNull())

                /**
                 * Sets [Builder.before] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.before] with a well-typed [OffsetDateTime] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun before(before: JsonField<OffsetDateTime>) = apply { this.before = before }

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
                 *
                 * The following fields are required:
                 * ```java
                 * .after()
                 * .before()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): CreatedAt =
                    CreatedAt(
                        checkRequired("after", after),
                        checkRequired("before", before),
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
                    (if (before.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CreatedAt &&
                    after == other.after &&
                    before == other.before &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(after, before, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CreatedAt{after=$after, before=$before, additionalProperties=$additionalProperties}"
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

    /**
     * The category of the Export. We may add additional possible values for this enum over time;
     * your application should be able to handle that gracefully.
     */
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

    /**
     * Details of the dashboard table CSV export. This field will be present when the `category` is
     * equal to `dashboard_table_csv`.
     */
    class DashboardTableCsv
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

            /** Returns a mutable builder for constructing an instance of [DashboardTableCsv]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [DashboardTableCsv]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(dashboardTableCsv: DashboardTableCsv) = apply {
                additionalProperties = dashboardTableCsv.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [DashboardTableCsv].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): DashboardTableCsv = DashboardTableCsv(additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): DashboardTableCsv = apply {
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

            return other is DashboardTableCsv && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "DashboardTableCsv{additionalProperties=$additionalProperties}"
    }

    /**
     * Details of the entity CSV export. This field will be present when the `category` is equal to
     * `entity_csv`.
     */
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
     * Details of the fee CSV export. This field will be present when the `category` is equal to
     * `fee_csv`.
     */
    class FeeCsv
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val createdAt: JsonField<CreatedAt>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<CreatedAt> = JsonMissing.of()
        ) : this(createdAt, mutableMapOf())

        /**
         * Filter fees by their created date. The time range must not include any fees that are part
         * of an open fee statement.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun createdAt(): Optional<CreatedAt> = createdAt.getOptional("created_at")

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
             * Returns a mutable builder for constructing an instance of [FeeCsv].
             *
             * The following fields are required:
             * ```java
             * .createdAt()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [FeeCsv]. */
        class Builder internal constructor() {

            private var createdAt: JsonField<CreatedAt>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(feeCsv: FeeCsv) = apply {
                createdAt = feeCsv.createdAt
                additionalProperties = feeCsv.additionalProperties.toMutableMap()
            }

            /**
             * Filter fees by their created date. The time range must not include any fees that are
             * part of an open fee statement.
             */
            fun createdAt(createdAt: CreatedAt?) = createdAt(JsonField.ofNullable(createdAt))

            /** Alias for calling [Builder.createdAt] with `createdAt.orElse(null)`. */
            fun createdAt(createdAt: Optional<CreatedAt>) = createdAt(createdAt.getOrNull())

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
             * Returns an immutable instance of [FeeCsv].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .createdAt()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): FeeCsv =
                FeeCsv(checkRequired("createdAt", createdAt), additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): FeeCsv = apply {
            if (validated) {
                return@apply
            }

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
        internal fun validity(): Int = (createdAt.asKnown().getOrNull()?.validity() ?: 0)

        /**
         * Filter fees by their created date. The time range must not include any fees that are part
         * of an open fee statement.
         */
        class CreatedAt
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val after: JsonField<OffsetDateTime>,
            private val before: JsonField<OffsetDateTime>,
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
            ) : this(after, before, mutableMapOf())

            /**
             * Filter fees created after this time.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun after(): Optional<OffsetDateTime> = after.getOptional("after")

            /**
             * Filter fees created before this time.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun before(): Optional<OffsetDateTime> = before.getOptional("before")

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
                 * Returns a mutable builder for constructing an instance of [CreatedAt].
                 *
                 * The following fields are required:
                 * ```java
                 * .after()
                 * .before()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [CreatedAt]. */
            class Builder internal constructor() {

                private var after: JsonField<OffsetDateTime>? = null
                private var before: JsonField<OffsetDateTime>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(createdAt: CreatedAt) = apply {
                    after = createdAt.after
                    before = createdAt.before
                    additionalProperties = createdAt.additionalProperties.toMutableMap()
                }

                /** Filter fees created after this time. */
                fun after(after: OffsetDateTime?) = after(JsonField.ofNullable(after))

                /** Alias for calling [Builder.after] with `after.orElse(null)`. */
                fun after(after: Optional<OffsetDateTime>) = after(after.getOrNull())

                /**
                 * Sets [Builder.after] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.after] with a well-typed [OffsetDateTime] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun after(after: JsonField<OffsetDateTime>) = apply { this.after = after }

                /** Filter fees created before this time. */
                fun before(before: OffsetDateTime?) = before(JsonField.ofNullable(before))

                /** Alias for calling [Builder.before] with `before.orElse(null)`. */
                fun before(before: Optional<OffsetDateTime>) = before(before.getOrNull())

                /**
                 * Sets [Builder.before] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.before] with a well-typed [OffsetDateTime] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun before(before: JsonField<OffsetDateTime>) = apply { this.before = before }

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
                 *
                 * The following fields are required:
                 * ```java
                 * .after()
                 * .before()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): CreatedAt =
                    CreatedAt(
                        checkRequired("after", after),
                        checkRequired("before", before),
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
                    (if (before.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CreatedAt &&
                    after == other.after &&
                    before == other.before &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(after, before, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CreatedAt{after=$after, before=$before, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is FeeCsv &&
                createdAt == other.createdAt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(createdAt, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "FeeCsv{createdAt=$createdAt, additionalProperties=$additionalProperties}"
    }

    /**
     * Details of the Form 1099-INT export. This field will be present when the `category` is equal
     * to `form_1099_int`.
     */
    class Form1099Int
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val accountId: JsonField<String>,
        private val corrected: JsonField<Boolean>,
        private val description: JsonField<String>,
        private val year: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("account_id")
            @ExcludeMissing
            accountId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("corrected")
            @ExcludeMissing
            corrected: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("year") @ExcludeMissing year: JsonField<Long> = JsonMissing.of(),
        ) : this(accountId, corrected, description, year, mutableMapOf())

        /**
         * The Account the tax form is for.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun accountId(): String = accountId.getRequired("account_id")

        /**
         * Whether the tax form is a corrected form.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun corrected(): Boolean = corrected.getRequired("corrected")

        /**
         * A description of the tax form.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun description(): String = description.getRequired("description")

        /**
         * The tax year for the tax form.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun year(): Long = year.getRequired("year")

        /**
         * Returns the raw JSON value of [accountId].
         *
         * Unlike [accountId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("account_id") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

        /**
         * Returns the raw JSON value of [corrected].
         *
         * Unlike [corrected], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("corrected") @ExcludeMissing fun _corrected(): JsonField<Boolean> = corrected

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [year].
         *
         * Unlike [year], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("year") @ExcludeMissing fun _year(): JsonField<Long> = year

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
             * Returns a mutable builder for constructing an instance of [Form1099Int].
             *
             * The following fields are required:
             * ```java
             * .accountId()
             * .corrected()
             * .description()
             * .year()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Form1099Int]. */
        class Builder internal constructor() {

            private var accountId: JsonField<String>? = null
            private var corrected: JsonField<Boolean>? = null
            private var description: JsonField<String>? = null
            private var year: JsonField<Long>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(form1099Int: Form1099Int) = apply {
                accountId = form1099Int.accountId
                corrected = form1099Int.corrected
                description = form1099Int.description
                year = form1099Int.year
                additionalProperties = form1099Int.additionalProperties.toMutableMap()
            }

            /** The Account the tax form is for. */
            fun accountId(accountId: String) = accountId(JsonField.of(accountId))

            /**
             * Sets [Builder.accountId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

            /** Whether the tax form is a corrected form. */
            fun corrected(corrected: Boolean) = corrected(JsonField.of(corrected))

            /**
             * Sets [Builder.corrected] to an arbitrary JSON value.
             *
             * You should usually call [Builder.corrected] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun corrected(corrected: JsonField<Boolean>) = apply { this.corrected = corrected }

            /** A description of the tax form. */
            fun description(description: String) = description(JsonField.of(description))

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /** The tax year for the tax form. */
            fun year(year: Long) = year(JsonField.of(year))

            /**
             * Sets [Builder.year] to an arbitrary JSON value.
             *
             * You should usually call [Builder.year] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun year(year: JsonField<Long>) = apply { this.year = year }

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
             * Returns an immutable instance of [Form1099Int].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .accountId()
             * .corrected()
             * .description()
             * .year()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Form1099Int =
                Form1099Int(
                    checkRequired("accountId", accountId),
                    checkRequired("corrected", corrected),
                    checkRequired("description", description),
                    checkRequired("year", year),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Form1099Int = apply {
            if (validated) {
                return@apply
            }

            accountId()
            corrected()
            description()
            year()
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
                (if (corrected.asKnown().isPresent) 1 else 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (if (year.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Form1099Int &&
                accountId == other.accountId &&
                corrected == other.corrected &&
                description == other.description &&
                year == other.year &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(accountId, corrected, description, year, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Form1099Int{accountId=$accountId, corrected=$corrected, description=$description, year=$year, additionalProperties=$additionalProperties}"
    }

    /**
     * Details of the Form 1099-MISC export. This field will be present when the `category` is equal
     * to `form_1099_misc`.
     */
    class Form1099Misc
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val accountId: JsonField<String>,
        private val corrected: JsonField<Boolean>,
        private val year: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("account_id")
            @ExcludeMissing
            accountId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("corrected")
            @ExcludeMissing
            corrected: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("year") @ExcludeMissing year: JsonField<Long> = JsonMissing.of(),
        ) : this(accountId, corrected, year, mutableMapOf())

        /**
         * The Account the tax form is for.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun accountId(): String = accountId.getRequired("account_id")

        /**
         * Whether the tax form is a corrected form.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun corrected(): Boolean = corrected.getRequired("corrected")

        /**
         * The tax year for the tax form.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun year(): Long = year.getRequired("year")

        /**
         * Returns the raw JSON value of [accountId].
         *
         * Unlike [accountId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("account_id") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

        /**
         * Returns the raw JSON value of [corrected].
         *
         * Unlike [corrected], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("corrected") @ExcludeMissing fun _corrected(): JsonField<Boolean> = corrected

        /**
         * Returns the raw JSON value of [year].
         *
         * Unlike [year], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("year") @ExcludeMissing fun _year(): JsonField<Long> = year

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
             * Returns a mutable builder for constructing an instance of [Form1099Misc].
             *
             * The following fields are required:
             * ```java
             * .accountId()
             * .corrected()
             * .year()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Form1099Misc]. */
        class Builder internal constructor() {

            private var accountId: JsonField<String>? = null
            private var corrected: JsonField<Boolean>? = null
            private var year: JsonField<Long>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(form1099Misc: Form1099Misc) = apply {
                accountId = form1099Misc.accountId
                corrected = form1099Misc.corrected
                year = form1099Misc.year
                additionalProperties = form1099Misc.additionalProperties.toMutableMap()
            }

            /** The Account the tax form is for. */
            fun accountId(accountId: String) = accountId(JsonField.of(accountId))

            /**
             * Sets [Builder.accountId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

            /** Whether the tax form is a corrected form. */
            fun corrected(corrected: Boolean) = corrected(JsonField.of(corrected))

            /**
             * Sets [Builder.corrected] to an arbitrary JSON value.
             *
             * You should usually call [Builder.corrected] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun corrected(corrected: JsonField<Boolean>) = apply { this.corrected = corrected }

            /** The tax year for the tax form. */
            fun year(year: Long) = year(JsonField.of(year))

            /**
             * Sets [Builder.year] to an arbitrary JSON value.
             *
             * You should usually call [Builder.year] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun year(year: JsonField<Long>) = apply { this.year = year }

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
             * Returns an immutable instance of [Form1099Misc].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .accountId()
             * .corrected()
             * .year()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Form1099Misc =
                Form1099Misc(
                    checkRequired("accountId", accountId),
                    checkRequired("corrected", corrected),
                    checkRequired("year", year),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Form1099Misc = apply {
            if (validated) {
                return@apply
            }

            accountId()
            corrected()
            year()
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
                (if (corrected.asKnown().isPresent) 1 else 0) +
                (if (year.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Form1099Misc &&
                accountId == other.accountId &&
                corrected == other.corrected &&
                year == other.year &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(accountId, corrected, year, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Form1099Misc{accountId=$accountId, corrected=$corrected, year=$year, additionalProperties=$additionalProperties}"
    }

    /**
     * Details of the funding instructions export. This field will be present when the `category` is
     * equal to `funding_instructions`.
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

    /**
     * The result of the Export. This will be present when the Export's status transitions to
     * `complete`.
     */
    class Result
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val fileId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("file_id") @ExcludeMissing fileId: JsonField<String> = JsonMissing.of()
        ) : this(fileId, mutableMapOf())

        /**
         * The File containing the contents of the Export.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun fileId(): String = fileId.getRequired("file_id")

        /**
         * Returns the raw JSON value of [fileId].
         *
         * Unlike [fileId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("file_id") @ExcludeMissing fun _fileId(): JsonField<String> = fileId

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
             * Returns a mutable builder for constructing an instance of [Result].
             *
             * The following fields are required:
             * ```java
             * .fileId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Result]. */
        class Builder internal constructor() {

            private var fileId: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(result: Result) = apply {
                fileId = result.fileId
                additionalProperties = result.additionalProperties.toMutableMap()
            }

            /** The File containing the contents of the Export. */
            fun fileId(fileId: String) = fileId(JsonField.of(fileId))

            /**
             * Sets [Builder.fileId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fileId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fileId(fileId: JsonField<String>) = apply { this.fileId = fileId }

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
             * Returns an immutable instance of [Result].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .fileId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Result =
                Result(checkRequired("fileId", fileId), additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Result = apply {
            if (validated) {
                return@apply
            }

            fileId()
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
        @JvmSynthetic internal fun validity(): Int = (if (fileId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Result &&
                fileId == other.fileId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(fileId, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Result{fileId=$fileId, additionalProperties=$additionalProperties}"
    }

    /** The status of the Export. */
    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            /** Increase is generating the export. */
            @JvmField val PENDING = of("pending")

            /** The export has been successfully generated. */
            @JvmField val COMPLETE = of("complete")

            /**
             * The export failed to generate. Increase will reach out to you to resolve the issue.
             */
            @JvmField val FAILED = of("failed")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            /** Increase is generating the export. */
            PENDING,
            /** The export has been successfully generated. */
            COMPLETE,
            /**
             * The export failed to generate. Increase will reach out to you to resolve the issue.
             */
            FAILED,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            /** Increase is generating the export. */
            PENDING,
            /** The export has been successfully generated. */
            COMPLETE,
            /**
             * The export failed to generate. Increase will reach out to you to resolve the issue.
             */
            FAILED,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
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
                PENDING -> Value.PENDING
                COMPLETE -> Value.COMPLETE
                FAILED -> Value.FAILED
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
                PENDING -> Known.PENDING
                COMPLETE -> Known.COMPLETE
                FAILED -> Known.FAILED
                else -> throw IncreaseInvalidDataException("Unknown Status: $value")
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

        fun validate(): Status = apply {
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

            return other is Status && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Details of the transaction CSV export. This field will be present when the `category` is
     * equal to `transaction_csv`.
     */
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
         * Filter results by Account.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun accountId(): Optional<String> = accountId.getOptional("account_id")

        /**
         * Filter transactions by their created date.
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
             * Returns a mutable builder for constructing an instance of [TransactionCsv].
             *
             * The following fields are required:
             * ```java
             * .accountId()
             * .createdAt()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [TransactionCsv]. */
        class Builder internal constructor() {

            private var accountId: JsonField<String>? = null
            private var createdAt: JsonField<CreatedAt>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(transactionCsv: TransactionCsv) = apply {
                accountId = transactionCsv.accountId
                createdAt = transactionCsv.createdAt
                additionalProperties = transactionCsv.additionalProperties.toMutableMap()
            }

            /** Filter results by Account. */
            fun accountId(accountId: String?) = accountId(JsonField.ofNullable(accountId))

            /** Alias for calling [Builder.accountId] with `accountId.orElse(null)`. */
            fun accountId(accountId: Optional<String>) = accountId(accountId.getOrNull())

            /**
             * Sets [Builder.accountId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

            /** Filter transactions by their created date. */
            fun createdAt(createdAt: CreatedAt?) = createdAt(JsonField.ofNullable(createdAt))

            /** Alias for calling [Builder.createdAt] with `createdAt.orElse(null)`. */
            fun createdAt(createdAt: Optional<CreatedAt>) = createdAt(createdAt.getOrNull())

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
             *
             * The following fields are required:
             * ```java
             * .accountId()
             * .createdAt()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): TransactionCsv =
                TransactionCsv(
                    checkRequired("accountId", accountId),
                    checkRequired("createdAt", createdAt),
                    additionalProperties.toMutableMap(),
                )
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

        /** Filter transactions by their created date. */
        class CreatedAt
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val after: JsonField<OffsetDateTime>,
            private val before: JsonField<OffsetDateTime>,
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
            ) : this(after, before, mutableMapOf())

            /**
             * Filter transactions created after this time.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun after(): Optional<OffsetDateTime> = after.getOptional("after")

            /**
             * Filter transactions created before this time.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun before(): Optional<OffsetDateTime> = before.getOptional("before")

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
                 * Returns a mutable builder for constructing an instance of [CreatedAt].
                 *
                 * The following fields are required:
                 * ```java
                 * .after()
                 * .before()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [CreatedAt]. */
            class Builder internal constructor() {

                private var after: JsonField<OffsetDateTime>? = null
                private var before: JsonField<OffsetDateTime>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(createdAt: CreatedAt) = apply {
                    after = createdAt.after
                    before = createdAt.before
                    additionalProperties = createdAt.additionalProperties.toMutableMap()
                }

                /** Filter transactions created after this time. */
                fun after(after: OffsetDateTime?) = after(JsonField.ofNullable(after))

                /** Alias for calling [Builder.after] with `after.orElse(null)`. */
                fun after(after: Optional<OffsetDateTime>) = after(after.getOrNull())

                /**
                 * Sets [Builder.after] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.after] with a well-typed [OffsetDateTime] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun after(after: JsonField<OffsetDateTime>) = apply { this.after = after }

                /** Filter transactions created before this time. */
                fun before(before: OffsetDateTime?) = before(JsonField.ofNullable(before))

                /** Alias for calling [Builder.before] with `before.orElse(null)`. */
                fun before(before: Optional<OffsetDateTime>) = before(before.getOrNull())

                /**
                 * Sets [Builder.before] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.before] with a well-typed [OffsetDateTime] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun before(before: JsonField<OffsetDateTime>) = apply { this.before = before }

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
                 *
                 * The following fields are required:
                 * ```java
                 * .after()
                 * .before()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): CreatedAt =
                    CreatedAt(
                        checkRequired("after", after),
                        checkRequired("before", before),
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
                    (if (before.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CreatedAt &&
                    after == other.after &&
                    before == other.before &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(after, before, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CreatedAt{after=$after, before=$before, additionalProperties=$additionalProperties}"
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

    /** A constant representing the object's type. For this resource it will always be `export`. */
    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val EXPORT = of("export")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            EXPORT
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            EXPORT,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                EXPORT -> Value.EXPORT
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
                EXPORT -> Known.EXPORT
                else -> throw IncreaseInvalidDataException("Unknown Type: $value")
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

        fun validate(): Type = apply {
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

            return other is Type && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Details of the vendor CSV export. This field will be present when the `category` is equal to
     * `vendor_csv`.
     */
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

    /**
     * Details of the voided check export. This field will be present when the `category` is equal
     * to `voided_check`.
     */
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
         * The payer information printed on the check.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun payer(): List<Payer> = payer.getRequired("payer")

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
             * .payer()
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

            /** The payer information printed on the check. */
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
             * .payer()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): VoidedCheck =
                VoidedCheck(
                    checkRequired("accountNumberId", accountNumberId),
                    checkRequired("payer", payer).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): VoidedCheck = apply {
            if (validated) {
                return@apply
            }

            accountNumberId()
            payer().forEach { it.validate() }
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

        return other is Export &&
            id == other.id &&
            accountStatementBai2 == other.accountStatementBai2 &&
            accountStatementOfx == other.accountStatementOfx &&
            accountVerificationLetter == other.accountVerificationLetter &&
            balanceCsv == other.balanceCsv &&
            bookkeepingAccountBalanceCsv == other.bookkeepingAccountBalanceCsv &&
            category == other.category &&
            createdAt == other.createdAt &&
            dashboardTableCsv == other.dashboardTableCsv &&
            entityCsv == other.entityCsv &&
            feeCsv == other.feeCsv &&
            form1099Int == other.form1099Int &&
            form1099Misc == other.form1099Misc &&
            fundingInstructions == other.fundingInstructions &&
            idempotencyKey == other.idempotencyKey &&
            result == other.result &&
            status == other.status &&
            transactionCsv == other.transactionCsv &&
            type == other.type &&
            vendorCsv == other.vendorCsv &&
            voidedCheck == other.voidedCheck &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            accountStatementBai2,
            accountStatementOfx,
            accountVerificationLetter,
            balanceCsv,
            bookkeepingAccountBalanceCsv,
            category,
            createdAt,
            dashboardTableCsv,
            entityCsv,
            feeCsv,
            form1099Int,
            form1099Misc,
            fundingInstructions,
            idempotencyKey,
            result,
            status,
            transactionCsv,
            type,
            vendorCsv,
            voidedCheck,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Export{id=$id, accountStatementBai2=$accountStatementBai2, accountStatementOfx=$accountStatementOfx, accountVerificationLetter=$accountVerificationLetter, balanceCsv=$balanceCsv, bookkeepingAccountBalanceCsv=$bookkeepingAccountBalanceCsv, category=$category, createdAt=$createdAt, dashboardTableCsv=$dashboardTableCsv, entityCsv=$entityCsv, feeCsv=$feeCsv, form1099Int=$form1099Int, form1099Misc=$form1099Misc, fundingInstructions=$fundingInstructions, idempotencyKey=$idempotencyKey, result=$result, status=$status, transactionCsv=$transactionCsv, type=$type, vendorCsv=$vendorCsv, voidedCheck=$voidedCheck, additionalProperties=$additionalProperties}"
}
