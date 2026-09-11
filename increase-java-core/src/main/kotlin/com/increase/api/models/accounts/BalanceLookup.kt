// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.accounts

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
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Represents a request to look up the balance of an Account at a given point in time. */
class BalanceLookup
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val accountId: JsonField<String>,
    private val availableBalance: JsonField<Long>,
    private val currentBalance: JsonField<Long>,
    private val loan: JsonField<Loan>,
    private val type: JsonField<Type>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("account_id") @ExcludeMissing accountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("available_balance")
        @ExcludeMissing
        availableBalance: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("current_balance")
        @ExcludeMissing
        currentBalance: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("loan") @ExcludeMissing loan: JsonField<Loan> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
    ) : this(accountId, availableBalance, currentBalance, loan, type, mutableMapOf())

    /**
     * The identifier for the account for which the balance was queried.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountId(): String = accountId.getRequired("account_id")

    /**
     * The Account's available balance, representing the current balance less any open Pending
     * Transactions on the Account.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun availableBalance(): Long = availableBalance.getRequired("available_balance")

    /**
     * The Account's current balance, representing the sum of all posted Transactions on the
     * Account.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currentBalance(): Long = currentBalance.getRequired("current_balance")

    /**
     * The loan balances for the Account.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun loan(): Optional<Loan> = loan.getOptional("loan")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `balance_lookup`.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * Returns the raw JSON value of [accountId].
     *
     * Unlike [accountId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("account_id") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

    /**
     * Returns the raw JSON value of [availableBalance].
     *
     * Unlike [availableBalance], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("available_balance")
    @ExcludeMissing
    fun _availableBalance(): JsonField<Long> = availableBalance

    /**
     * Returns the raw JSON value of [currentBalance].
     *
     * Unlike [currentBalance], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("current_balance")
    @ExcludeMissing
    fun _currentBalance(): JsonField<Long> = currentBalance

    /**
     * Returns the raw JSON value of [loan].
     *
     * Unlike [loan], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("loan") @ExcludeMissing fun _loan(): JsonField<Loan> = loan

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
         * Returns a mutable builder for constructing an instance of [BalanceLookup].
         *
         * The following fields are required:
         * ```java
         * .accountId()
         * .availableBalance()
         * .currentBalance()
         * .loan()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BalanceLookup]. */
    class Builder internal constructor() {

        private var accountId: JsonField<String>? = null
        private var availableBalance: JsonField<Long>? = null
        private var currentBalance: JsonField<Long>? = null
        private var loan: JsonField<Loan>? = null
        private var type: JsonField<Type>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(balanceLookup: BalanceLookup) = apply {
            accountId = balanceLookup.accountId
            availableBalance = balanceLookup.availableBalance
            currentBalance = balanceLookup.currentBalance
            loan = balanceLookup.loan
            type = balanceLookup.type
            additionalProperties = balanceLookup.additionalProperties.toMutableMap()
        }

        /** The identifier for the account for which the balance was queried. */
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
         * The Account's available balance, representing the current balance less any open Pending
         * Transactions on the Account.
         */
        fun availableBalance(availableBalance: Long) =
            availableBalance(JsonField.of(availableBalance))

        /**
         * Sets [Builder.availableBalance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.availableBalance] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun availableBalance(availableBalance: JsonField<Long>) = apply {
            this.availableBalance = availableBalance
        }

        /**
         * The Account's current balance, representing the sum of all posted Transactions on the
         * Account.
         */
        fun currentBalance(currentBalance: Long) = currentBalance(JsonField.of(currentBalance))

        /**
         * Sets [Builder.currentBalance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currentBalance] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun currentBalance(currentBalance: JsonField<Long>) = apply {
            this.currentBalance = currentBalance
        }

        /** The loan balances for the Account. */
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

        /**
         * A constant representing the object's type. For this resource it will always be
         * `balance_lookup`.
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
         * Returns an immutable instance of [BalanceLookup].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .accountId()
         * .availableBalance()
         * .currentBalance()
         * .loan()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BalanceLookup =
            BalanceLookup(
                checkRequired("accountId", accountId),
                checkRequired("availableBalance", availableBalance),
                checkRequired("currentBalance", currentBalance),
                checkRequired("loan", loan),
                checkRequired("type", type),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws IncreaseInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): BalanceLookup = apply {
        if (validated) {
            return@apply
        }

        accountId()
        availableBalance()
        currentBalance()
        loan().ifPresent { it.validate() }
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
        (if (accountId.asKnown().isPresent) 1 else 0) +
            (if (availableBalance.asKnown().isPresent) 1 else 0) +
            (if (currentBalance.asKnown().isPresent) 1 else 0) +
            (loan.asKnown().getOrNull()?.validity() ?: 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0)

    /** The loan balances for the Account. */
    class Loan
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val dueFees: JsonField<Long>,
        private val dueInterest: JsonField<Long>,
        private val duePrincipal: JsonField<Long>,
        private val notDueFees: JsonField<Long>,
        private val notDueInterest: JsonField<Long>,
        private val notDuePrincipal: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("due_fees") @ExcludeMissing dueFees: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("due_interest")
            @ExcludeMissing
            dueInterest: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("due_principal")
            @ExcludeMissing
            duePrincipal: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("not_due_fees")
            @ExcludeMissing
            notDueFees: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("not_due_interest")
            @ExcludeMissing
            notDueInterest: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("not_due_principal")
            @ExcludeMissing
            notDuePrincipal: JsonField<Long> = JsonMissing.of(),
        ) : this(
            dueFees,
            dueInterest,
            duePrincipal,
            notDueFees,
            notDueInterest,
            notDuePrincipal,
            mutableMapOf(),
        )

        /**
         * The fees on the loan that are due and unpaid.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun dueFees(): Optional<Long> = dueFees.getOptional("due_fees")

        /**
         * The interest on the loan that is due and unpaid.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun dueInterest(): Optional<Long> = dueInterest.getOptional("due_interest")

        /**
         * The principal on the loan that is due and unpaid.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun duePrincipal(): Optional<Long> = duePrincipal.getOptional("due_principal")

        /**
         * The fees on the loan that are not yet due.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun notDueFees(): Optional<Long> = notDueFees.getOptional("not_due_fees")

        /**
         * The interest on the loan that is not yet due.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun notDueInterest(): Optional<Long> = notDueInterest.getOptional("not_due_interest")

        /**
         * The principal on the loan that is not yet due.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun notDuePrincipal(): Optional<Long> = notDuePrincipal.getOptional("not_due_principal")

        /**
         * Returns the raw JSON value of [dueFees].
         *
         * Unlike [dueFees], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("due_fees") @ExcludeMissing fun _dueFees(): JsonField<Long> = dueFees

        /**
         * Returns the raw JSON value of [dueInterest].
         *
         * Unlike [dueInterest], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("due_interest")
        @ExcludeMissing
        fun _dueInterest(): JsonField<Long> = dueInterest

        /**
         * Returns the raw JSON value of [duePrincipal].
         *
         * Unlike [duePrincipal], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("due_principal")
        @ExcludeMissing
        fun _duePrincipal(): JsonField<Long> = duePrincipal

        /**
         * Returns the raw JSON value of [notDueFees].
         *
         * Unlike [notDueFees], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("not_due_fees")
        @ExcludeMissing
        fun _notDueFees(): JsonField<Long> = notDueFees

        /**
         * Returns the raw JSON value of [notDueInterest].
         *
         * Unlike [notDueInterest], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("not_due_interest")
        @ExcludeMissing
        fun _notDueInterest(): JsonField<Long> = notDueInterest

        /**
         * Returns the raw JSON value of [notDuePrincipal].
         *
         * Unlike [notDuePrincipal], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("not_due_principal")
        @ExcludeMissing
        fun _notDuePrincipal(): JsonField<Long> = notDuePrincipal

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
             * .dueFees()
             * .dueInterest()
             * .duePrincipal()
             * .notDueFees()
             * .notDueInterest()
             * .notDuePrincipal()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Loan]. */
        class Builder internal constructor() {

            private var dueFees: JsonField<Long>? = null
            private var dueInterest: JsonField<Long>? = null
            private var duePrincipal: JsonField<Long>? = null
            private var notDueFees: JsonField<Long>? = null
            private var notDueInterest: JsonField<Long>? = null
            private var notDuePrincipal: JsonField<Long>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(loan: Loan) = apply {
                dueFees = loan.dueFees
                dueInterest = loan.dueInterest
                duePrincipal = loan.duePrincipal
                notDueFees = loan.notDueFees
                notDueInterest = loan.notDueInterest
                notDuePrincipal = loan.notDuePrincipal
                additionalProperties = loan.additionalProperties.toMutableMap()
            }

            /** The fees on the loan that are due and unpaid. */
            fun dueFees(dueFees: Long?) = dueFees(JsonField.ofNullable(dueFees))

            /**
             * Alias for [Builder.dueFees].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun dueFees(dueFees: Long) = dueFees(dueFees as Long?)

            /** Alias for calling [Builder.dueFees] with `dueFees.orElse(null)`. */
            fun dueFees(dueFees: Optional<Long>) = dueFees(dueFees.getOrNull())

            /**
             * Sets [Builder.dueFees] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dueFees] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dueFees(dueFees: JsonField<Long>) = apply { this.dueFees = dueFees }

            /** The interest on the loan that is due and unpaid. */
            fun dueInterest(dueInterest: Long?) = dueInterest(JsonField.ofNullable(dueInterest))

            /**
             * Alias for [Builder.dueInterest].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun dueInterest(dueInterest: Long) = dueInterest(dueInterest as Long?)

            /** Alias for calling [Builder.dueInterest] with `dueInterest.orElse(null)`. */
            fun dueInterest(dueInterest: Optional<Long>) = dueInterest(dueInterest.getOrNull())

            /**
             * Sets [Builder.dueInterest] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dueInterest] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dueInterest(dueInterest: JsonField<Long>) = apply { this.dueInterest = dueInterest }

            /** The principal on the loan that is due and unpaid. */
            fun duePrincipal(duePrincipal: Long?) = duePrincipal(JsonField.ofNullable(duePrincipal))

            /**
             * Alias for [Builder.duePrincipal].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun duePrincipal(duePrincipal: Long) = duePrincipal(duePrincipal as Long?)

            /** Alias for calling [Builder.duePrincipal] with `duePrincipal.orElse(null)`. */
            fun duePrincipal(duePrincipal: Optional<Long>) = duePrincipal(duePrincipal.getOrNull())

            /**
             * Sets [Builder.duePrincipal] to an arbitrary JSON value.
             *
             * You should usually call [Builder.duePrincipal] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun duePrincipal(duePrincipal: JsonField<Long>) = apply {
                this.duePrincipal = duePrincipal
            }

            /** The fees on the loan that are not yet due. */
            fun notDueFees(notDueFees: Long?) = notDueFees(JsonField.ofNullable(notDueFees))

            /**
             * Alias for [Builder.notDueFees].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun notDueFees(notDueFees: Long) = notDueFees(notDueFees as Long?)

            /** Alias for calling [Builder.notDueFees] with `notDueFees.orElse(null)`. */
            fun notDueFees(notDueFees: Optional<Long>) = notDueFees(notDueFees.getOrNull())

            /**
             * Sets [Builder.notDueFees] to an arbitrary JSON value.
             *
             * You should usually call [Builder.notDueFees] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun notDueFees(notDueFees: JsonField<Long>) = apply { this.notDueFees = notDueFees }

            /** The interest on the loan that is not yet due. */
            fun notDueInterest(notDueInterest: Long?) =
                notDueInterest(JsonField.ofNullable(notDueInterest))

            /**
             * Alias for [Builder.notDueInterest].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun notDueInterest(notDueInterest: Long) = notDueInterest(notDueInterest as Long?)

            /** Alias for calling [Builder.notDueInterest] with `notDueInterest.orElse(null)`. */
            fun notDueInterest(notDueInterest: Optional<Long>) =
                notDueInterest(notDueInterest.getOrNull())

            /**
             * Sets [Builder.notDueInterest] to an arbitrary JSON value.
             *
             * You should usually call [Builder.notDueInterest] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun notDueInterest(notDueInterest: JsonField<Long>) = apply {
                this.notDueInterest = notDueInterest
            }

            /** The principal on the loan that is not yet due. */
            fun notDuePrincipal(notDuePrincipal: Long?) =
                notDuePrincipal(JsonField.ofNullable(notDuePrincipal))

            /**
             * Alias for [Builder.notDuePrincipal].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun notDuePrincipal(notDuePrincipal: Long) = notDuePrincipal(notDuePrincipal as Long?)

            /** Alias for calling [Builder.notDuePrincipal] with `notDuePrincipal.orElse(null)`. */
            fun notDuePrincipal(notDuePrincipal: Optional<Long>) =
                notDuePrincipal(notDuePrincipal.getOrNull())

            /**
             * Sets [Builder.notDuePrincipal] to an arbitrary JSON value.
             *
             * You should usually call [Builder.notDuePrincipal] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun notDuePrincipal(notDuePrincipal: JsonField<Long>) = apply {
                this.notDuePrincipal = notDuePrincipal
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
             * .dueFees()
             * .dueInterest()
             * .duePrincipal()
             * .notDueFees()
             * .notDueInterest()
             * .notDuePrincipal()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Loan =
                Loan(
                    checkRequired("dueFees", dueFees),
                    checkRequired("dueInterest", dueInterest),
                    checkRequired("duePrincipal", duePrincipal),
                    checkRequired("notDueFees", notDueFees),
                    checkRequired("notDueInterest", notDueInterest),
                    checkRequired("notDuePrincipal", notDuePrincipal),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws IncreaseInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Loan = apply {
            if (validated) {
                return@apply
            }

            dueFees()
            dueInterest()
            duePrincipal()
            notDueFees()
            notDueInterest()
            notDuePrincipal()
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
            (if (dueFees.asKnown().isPresent) 1 else 0) +
                (if (dueInterest.asKnown().isPresent) 1 else 0) +
                (if (duePrincipal.asKnown().isPresent) 1 else 0) +
                (if (notDueFees.asKnown().isPresent) 1 else 0) +
                (if (notDueInterest.asKnown().isPresent) 1 else 0) +
                (if (notDuePrincipal.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Loan &&
                dueFees == other.dueFees &&
                dueInterest == other.dueInterest &&
                duePrincipal == other.duePrincipal &&
                notDueFees == other.notDueFees &&
                notDueInterest == other.notDueInterest &&
                notDuePrincipal == other.notDuePrincipal &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                dueFees,
                dueInterest,
                duePrincipal,
                notDueFees,
                notDueInterest,
                notDuePrincipal,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Loan{dueFees=$dueFees, dueInterest=$dueInterest, duePrincipal=$duePrincipal, notDueFees=$notDueFees, notDueInterest=$notDueInterest, notDuePrincipal=$notDuePrincipal, additionalProperties=$additionalProperties}"
    }

    /**
     * A constant representing the object's type. For this resource it will always be
     * `balance_lookup`.
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

            @JvmField val BALANCE_LOOKUP = of("balance_lookup")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            BALANCE_LOOKUP
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
            BALANCE_LOOKUP,
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
                BALANCE_LOOKUP -> Value.BALANCE_LOOKUP
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
                BALANCE_LOOKUP -> Known.BALANCE_LOOKUP
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws IncreaseInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
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

        return other is BalanceLookup &&
            accountId == other.accountId &&
            availableBalance == other.availableBalance &&
            currentBalance == other.currentBalance &&
            loan == other.loan &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(accountId, availableBalance, currentBalance, loan, type, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BalanceLookup{accountId=$accountId, availableBalance=$availableBalance, currentBalance=$currentBalance, loan=$loan, type=$type, additionalProperties=$additionalProperties}"
}
