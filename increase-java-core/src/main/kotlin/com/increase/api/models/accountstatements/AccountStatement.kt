// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.accountstatements

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.increase.api.core.Enum
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.checkRequired
import com.increase.api.errors.IncreaseInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Account Statements are generated monthly for every active Account. You can access the statement's
 * data via the API or retrieve a PDF with its details via its associated File.
 */
class AccountStatement
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val accountId: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val endingBalance: JsonField<Long>,
    private val fileId: JsonField<String>,
    private val loan: JsonField<Loan>,
    private val startingBalance: JsonField<Long>,
    private val statementPeriodEnd: JsonField<OffsetDateTime>,
    private val statementPeriodStart: JsonField<OffsetDateTime>,
    private val type: JsonField<Type>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("account_id") @ExcludeMissing accountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("ending_balance")
        @ExcludeMissing
        endingBalance: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("file_id") @ExcludeMissing fileId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("loan") @ExcludeMissing loan: JsonField<Loan> = JsonMissing.of(),
        @JsonProperty("starting_balance")
        @ExcludeMissing
        startingBalance: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("statement_period_end")
        @ExcludeMissing
        statementPeriodEnd: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("statement_period_start")
        @ExcludeMissing
        statementPeriodStart: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
    ) : this(
        id,
        accountId,
        createdAt,
        endingBalance,
        fileId,
        loan,
        startingBalance,
        statementPeriodEnd,
        statementPeriodStart,
        type,
        mutableMapOf(),
    )

    /**
     * The Account Statement identifier.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The identifier for the Account this Account Statement belongs to.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountId(): String = accountId.getRequired("account_id")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Account Statement
     * was created.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * The Account's balance at the end of its statement period.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun endingBalance(): Long = endingBalance.getRequired("ending_balance")

    /**
     * The identifier of the File containing a PDF of the statement.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun fileId(): String = fileId.getRequired("file_id")

    /**
     * The loan balances.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun loan(): Optional<Loan> = loan.getOptional("loan")

    /**
     * The Account's balance at the start of its statement period.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun startingBalance(): Long = startingBalance.getRequired("starting_balance")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time representing the end of the
     * period the Account Statement covers.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun statementPeriodEnd(): OffsetDateTime =
        statementPeriodEnd.getRequired("statement_period_end")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time representing the start of the
     * period the Account Statement covers.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun statementPeriodStart(): OffsetDateTime =
        statementPeriodStart.getRequired("statement_period_start")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `account_statement`.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

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
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [endingBalance].
     *
     * Unlike [endingBalance], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ending_balance")
    @ExcludeMissing
    fun _endingBalance(): JsonField<Long> = endingBalance

    /**
     * Returns the raw JSON value of [fileId].
     *
     * Unlike [fileId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("file_id") @ExcludeMissing fun _fileId(): JsonField<String> = fileId

    /**
     * Returns the raw JSON value of [loan].
     *
     * Unlike [loan], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("loan") @ExcludeMissing fun _loan(): JsonField<Loan> = loan

    /**
     * Returns the raw JSON value of [startingBalance].
     *
     * Unlike [startingBalance], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("starting_balance")
    @ExcludeMissing
    fun _startingBalance(): JsonField<Long> = startingBalance

    /**
     * Returns the raw JSON value of [statementPeriodEnd].
     *
     * Unlike [statementPeriodEnd], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("statement_period_end")
    @ExcludeMissing
    fun _statementPeriodEnd(): JsonField<OffsetDateTime> = statementPeriodEnd

    /**
     * Returns the raw JSON value of [statementPeriodStart].
     *
     * Unlike [statementPeriodStart], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("statement_period_start")
    @ExcludeMissing
    fun _statementPeriodStart(): JsonField<OffsetDateTime> = statementPeriodStart

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
         * Returns a mutable builder for constructing an instance of [AccountStatement].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .accountId()
         * .createdAt()
         * .endingBalance()
         * .fileId()
         * .loan()
         * .startingBalance()
         * .statementPeriodEnd()
         * .statementPeriodStart()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AccountStatement]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var accountId: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var endingBalance: JsonField<Long>? = null
        private var fileId: JsonField<String>? = null
        private var loan: JsonField<Loan>? = null
        private var startingBalance: JsonField<Long>? = null
        private var statementPeriodEnd: JsonField<OffsetDateTime>? = null
        private var statementPeriodStart: JsonField<OffsetDateTime>? = null
        private var type: JsonField<Type>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(accountStatement: AccountStatement) = apply {
            id = accountStatement.id
            accountId = accountStatement.accountId
            createdAt = accountStatement.createdAt
            endingBalance = accountStatement.endingBalance
            fileId = accountStatement.fileId
            loan = accountStatement.loan
            startingBalance = accountStatement.startingBalance
            statementPeriodEnd = accountStatement.statementPeriodEnd
            statementPeriodStart = accountStatement.statementPeriodStart
            type = accountStatement.type
            additionalProperties = accountStatement.additionalProperties.toMutableMap()
        }

        /** The Account Statement identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The identifier for the Account this Account Statement belongs to. */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /**
         * Sets [Builder.accountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Account
         * Statement was created.
         */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The Account's balance at the end of its statement period. */
        fun endingBalance(endingBalance: Long) = endingBalance(JsonField.of(endingBalance))

        /**
         * Sets [Builder.endingBalance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endingBalance] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun endingBalance(endingBalance: JsonField<Long>) = apply {
            this.endingBalance = endingBalance
        }

        /** The identifier of the File containing a PDF of the statement. */
        fun fileId(fileId: String) = fileId(JsonField.of(fileId))

        /**
         * Sets [Builder.fileId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fileId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fileId(fileId: JsonField<String>) = apply { this.fileId = fileId }

        /** The loan balances. */
        fun loan(loan: Loan?) = loan(JsonField.ofNullable(loan))

        /** Alias for calling [Builder.loan] with `loan.orElse(null)`. */
        fun loan(loan: Optional<Loan>) = loan(loan.getOrNull())

        /**
         * Sets [Builder.loan] to an arbitrary JSON value.
         *
         * You should usually call [Builder.loan] with a well-typed [Loan] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun loan(loan: JsonField<Loan>) = apply { this.loan = loan }

        /** The Account's balance at the start of its statement period. */
        fun startingBalance(startingBalance: Long) = startingBalance(JsonField.of(startingBalance))

        /**
         * Sets [Builder.startingBalance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startingBalance] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun startingBalance(startingBalance: JsonField<Long>) = apply {
            this.startingBalance = startingBalance
        }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time representing the end of the
         * period the Account Statement covers.
         */
        fun statementPeriodEnd(statementPeriodEnd: OffsetDateTime) =
            statementPeriodEnd(JsonField.of(statementPeriodEnd))

        /**
         * Sets [Builder.statementPeriodEnd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.statementPeriodEnd] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun statementPeriodEnd(statementPeriodEnd: JsonField<OffsetDateTime>) = apply {
            this.statementPeriodEnd = statementPeriodEnd
        }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time representing the start of the
         * period the Account Statement covers.
         */
        fun statementPeriodStart(statementPeriodStart: OffsetDateTime) =
            statementPeriodStart(JsonField.of(statementPeriodStart))

        /**
         * Sets [Builder.statementPeriodStart] to an arbitrary JSON value.
         *
         * You should usually call [Builder.statementPeriodStart] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun statementPeriodStart(statementPeriodStart: JsonField<OffsetDateTime>) = apply {
            this.statementPeriodStart = statementPeriodStart
        }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `account_statement`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

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
         * Returns an immutable instance of [AccountStatement].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .accountId()
         * .createdAt()
         * .endingBalance()
         * .fileId()
         * .loan()
         * .startingBalance()
         * .statementPeriodEnd()
         * .statementPeriodStart()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AccountStatement =
            AccountStatement(
                checkRequired("id", id),
                checkRequired("accountId", accountId),
                checkRequired("createdAt", createdAt),
                checkRequired("endingBalance", endingBalance),
                checkRequired("fileId", fileId),
                checkRequired("loan", loan),
                checkRequired("startingBalance", startingBalance),
                checkRequired("statementPeriodEnd", statementPeriodEnd),
                checkRequired("statementPeriodStart", statementPeriodStart),
                checkRequired("type", type),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AccountStatement = apply {
        if (validated) {
            return@apply
        }

        id()
        accountId()
        createdAt()
        endingBalance()
        fileId()
        loan().ifPresent { it.validate() }
        startingBalance()
        statementPeriodEnd()
        statementPeriodStart()
        type().validate()
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
            (if (accountId.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (endingBalance.asKnown().isPresent) 1 else 0) +
            (if (fileId.asKnown().isPresent) 1 else 0) +
            (loan.asKnown().getOrNull()?.validity() ?: 0) +
            (if (startingBalance.asKnown().isPresent) 1 else 0) +
            (if (statementPeriodEnd.asKnown().isPresent) 1 else 0) +
            (if (statementPeriodStart.asKnown().isPresent) 1 else 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0)

    /** The loan balances. */
    class Loan
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val dueAt: JsonField<OffsetDateTime>,
        private val dueBalance: JsonField<Long>,
        private val pastDueBalance: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("due_at")
            @ExcludeMissing
            dueAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("due_balance")
            @ExcludeMissing
            dueBalance: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("past_due_balance")
            @ExcludeMissing
            pastDueBalance: JsonField<Long> = JsonMissing.of(),
        ) : this(dueAt, dueBalance, pastDueBalance, mutableMapOf())

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the loan payment is
         * due.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun dueAt(): Optional<OffsetDateTime> = dueAt.getOptional("due_at")

        /**
         * The total amount due on the loan.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun dueBalance(): Long = dueBalance.getRequired("due_balance")

        /**
         * The amount past due on the loan.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun pastDueBalance(): Long = pastDueBalance.getRequired("past_due_balance")

        /**
         * Returns the raw JSON value of [dueAt].
         *
         * Unlike [dueAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("due_at") @ExcludeMissing fun _dueAt(): JsonField<OffsetDateTime> = dueAt

        /**
         * Returns the raw JSON value of [dueBalance].
         *
         * Unlike [dueBalance], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("due_balance") @ExcludeMissing fun _dueBalance(): JsonField<Long> = dueBalance

        /**
         * Returns the raw JSON value of [pastDueBalance].
         *
         * Unlike [pastDueBalance], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("past_due_balance")
        @ExcludeMissing
        fun _pastDueBalance(): JsonField<Long> = pastDueBalance

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
             * Returns a mutable builder for constructing an instance of [Loan].
             *
             * The following fields are required:
             * ```java
             * .dueAt()
             * .dueBalance()
             * .pastDueBalance()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Loan]. */
        class Builder internal constructor() {

            private var dueAt: JsonField<OffsetDateTime>? = null
            private var dueBalance: JsonField<Long>? = null
            private var pastDueBalance: JsonField<Long>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(loan: Loan) = apply {
                dueAt = loan.dueAt
                dueBalance = loan.dueBalance
                pastDueBalance = loan.pastDueBalance
                additionalProperties = loan.additionalProperties.toMutableMap()
            }

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the loan payment
             * is due.
             */
            fun dueAt(dueAt: OffsetDateTime?) = dueAt(JsonField.ofNullable(dueAt))

            /** Alias for calling [Builder.dueAt] with `dueAt.orElse(null)`. */
            fun dueAt(dueAt: Optional<OffsetDateTime>) = dueAt(dueAt.getOrNull())

            /**
             * Sets [Builder.dueAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dueAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dueAt(dueAt: JsonField<OffsetDateTime>) = apply { this.dueAt = dueAt }

            /** The total amount due on the loan. */
            fun dueBalance(dueBalance: Long) = dueBalance(JsonField.of(dueBalance))

            /**
             * Sets [Builder.dueBalance] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dueBalance] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dueBalance(dueBalance: JsonField<Long>) = apply { this.dueBalance = dueBalance }

            /** The amount past due on the loan. */
            fun pastDueBalance(pastDueBalance: Long) = pastDueBalance(JsonField.of(pastDueBalance))

            /**
             * Sets [Builder.pastDueBalance] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pastDueBalance] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pastDueBalance(pastDueBalance: JsonField<Long>) = apply {
                this.pastDueBalance = pastDueBalance
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
             * Returns an immutable instance of [Loan].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .dueAt()
             * .dueBalance()
             * .pastDueBalance()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Loan =
                Loan(
                    checkRequired("dueAt", dueAt),
                    checkRequired("dueBalance", dueBalance),
                    checkRequired("pastDueBalance", pastDueBalance),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Loan = apply {
            if (validated) {
                return@apply
            }

            dueAt()
            dueBalance()
            pastDueBalance()
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
            (if (dueAt.asKnown().isPresent) 1 else 0) +
                (if (dueBalance.asKnown().isPresent) 1 else 0) +
                (if (pastDueBalance.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Loan &&
                dueAt == other.dueAt &&
                dueBalance == other.dueBalance &&
                pastDueBalance == other.pastDueBalance &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(dueAt, dueBalance, pastDueBalance, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Loan{dueAt=$dueAt, dueBalance=$dueBalance, pastDueBalance=$pastDueBalance, additionalProperties=$additionalProperties}"
    }

    /**
     * A constant representing the object's type. For this resource it will always be
     * `account_statement`.
     */
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

            @JvmField val ACCOUNT_STATEMENT = of("account_statement")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            ACCOUNT_STATEMENT
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
            ACCOUNT_STATEMENT,
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
                ACCOUNT_STATEMENT -> Value.ACCOUNT_STATEMENT
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
                ACCOUNT_STATEMENT -> Known.ACCOUNT_STATEMENT
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AccountStatement &&
            id == other.id &&
            accountId == other.accountId &&
            createdAt == other.createdAt &&
            endingBalance == other.endingBalance &&
            fileId == other.fileId &&
            loan == other.loan &&
            startingBalance == other.startingBalance &&
            statementPeriodEnd == other.statementPeriodEnd &&
            statementPeriodStart == other.statementPeriodStart &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            accountId,
            createdAt,
            endingBalance,
            fileId,
            loan,
            startingBalance,
            statementPeriodEnd,
            statementPeriodStart,
            type,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AccountStatement{id=$id, accountId=$accountId, createdAt=$createdAt, endingBalance=$endingBalance, fileId=$fileId, loan=$loan, startingBalance=$startingBalance, statementPeriodEnd=$statementPeriodEnd, statementPeriodStart=$statementPeriodStart, type=$type, additionalProperties=$additionalProperties}"
}
