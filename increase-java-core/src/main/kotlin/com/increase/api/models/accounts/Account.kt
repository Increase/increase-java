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
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Accounts are your bank accounts with Increase. They store money, receive transfers, and send
 * payments. They earn interest and have depository insurance.
 */
class Account
private constructor(
    private val id: JsonField<String>,
    private val bank: JsonField<Bank>,
    private val closedAt: JsonField<OffsetDateTime>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val currency: JsonField<Currency>,
    private val entityId: JsonField<String>,
    private val idempotencyKey: JsonField<String>,
    private val informationalEntityId: JsonField<String>,
    private val interestAccrued: JsonField<String>,
    private val interestAccruedAt: JsonField<LocalDate>,
    private val interestRate: JsonField<String>,
    private val name: JsonField<String>,
    private val programId: JsonField<String>,
    private val status: JsonField<Status>,
    private val type: JsonField<Type>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("bank") @ExcludeMissing bank: JsonField<Bank> = JsonMissing.of(),
        @JsonProperty("closed_at")
        @ExcludeMissing
        closedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<Currency> = JsonMissing.of(),
        @JsonProperty("entity_id") @ExcludeMissing entityId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("idempotency_key")
        @ExcludeMissing
        idempotencyKey: JsonField<String> = JsonMissing.of(),
        @JsonProperty("informational_entity_id")
        @ExcludeMissing
        informationalEntityId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("interest_accrued")
        @ExcludeMissing
        interestAccrued: JsonField<String> = JsonMissing.of(),
        @JsonProperty("interest_accrued_at")
        @ExcludeMissing
        interestAccruedAt: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("interest_rate")
        @ExcludeMissing
        interestRate: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("program_id") @ExcludeMissing programId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
    ) : this(
        id,
        bank,
        closedAt,
        createdAt,
        currency,
        entityId,
        idempotencyKey,
        informationalEntityId,
        interestAccrued,
        interestAccruedAt,
        interestRate,
        name,
        programId,
        status,
        type,
        mutableMapOf(),
    )

    /**
     * The Account identifier.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The bank the Account is with.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun bank(): Bank = bank.getRequired("bank")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Account was closed.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun closedAt(): Optional<OffsetDateTime> = closedAt.getOptional("closed_at")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Account was created.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the Account currency.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currency(): Currency = currency.getRequired("currency")

    /**
     * The identifier for the Entity the Account belongs to.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun entityId(): Optional<String> = entityId.getOptional("entity_id")

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
     * The identifier of an Entity that, while not owning the Account, is associated with its
     * activity.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun informationalEntityId(): Optional<String> =
        informationalEntityId.getOptional("informational_entity_id")

    /**
     * The interest accrued but not yet paid, expressed as a string containing a floating-point
     * value.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun interestAccrued(): String = interestAccrued.getRequired("interest_accrued")

    /**
     * The latest [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date on which interest was
     * accrued.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun interestAccruedAt(): Optional<LocalDate> =
        interestAccruedAt.getOptional("interest_accrued_at")

    /**
     * The Interest Rate currently being earned on the account, as a string containing a decimal
     * number. For example, a 1% interest rate would be represented as "0.01".
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun interestRate(): String = interestRate.getRequired("interest_rate")

    /**
     * The name you choose for the Account.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * The identifier of the Program determining the compliance and commercial terms of this
     * Account.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun programId(): String = programId.getRequired("program_id")

    /**
     * The status of the Account.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * A constant representing the object's type. For this resource it will always be `account`.
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
     * Returns the raw JSON value of [bank].
     *
     * Unlike [bank], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bank") @ExcludeMissing fun _bank(): JsonField<Bank> = bank

    /**
     * Returns the raw JSON value of [closedAt].
     *
     * Unlike [closedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("closed_at") @ExcludeMissing fun _closedAt(): JsonField<OffsetDateTime> = closedAt

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<Currency> = currency

    /**
     * Returns the raw JSON value of [entityId].
     *
     * Unlike [entityId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("entity_id") @ExcludeMissing fun _entityId(): JsonField<String> = entityId

    /**
     * Returns the raw JSON value of [idempotencyKey].
     *
     * Unlike [idempotencyKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idempotency_key")
    @ExcludeMissing
    fun _idempotencyKey(): JsonField<String> = idempotencyKey

    /**
     * Returns the raw JSON value of [informationalEntityId].
     *
     * Unlike [informationalEntityId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("informational_entity_id")
    @ExcludeMissing
    fun _informationalEntityId(): JsonField<String> = informationalEntityId

    /**
     * Returns the raw JSON value of [interestAccrued].
     *
     * Unlike [interestAccrued], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("interest_accrued")
    @ExcludeMissing
    fun _interestAccrued(): JsonField<String> = interestAccrued

    /**
     * Returns the raw JSON value of [interestAccruedAt].
     *
     * Unlike [interestAccruedAt], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("interest_accrued_at")
    @ExcludeMissing
    fun _interestAccruedAt(): JsonField<LocalDate> = interestAccruedAt

    /**
     * Returns the raw JSON value of [interestRate].
     *
     * Unlike [interestRate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("interest_rate")
    @ExcludeMissing
    fun _interestRate(): JsonField<String> = interestRate

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [programId].
     *
     * Unlike [programId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("program_id") @ExcludeMissing fun _programId(): JsonField<String> = programId

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

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
         * Returns a mutable builder for constructing an instance of [Account].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .bank()
         * .closedAt()
         * .createdAt()
         * .currency()
         * .entityId()
         * .idempotencyKey()
         * .informationalEntityId()
         * .interestAccrued()
         * .interestAccruedAt()
         * .interestRate()
         * .name()
         * .programId()
         * .status()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Account]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var bank: JsonField<Bank>? = null
        private var closedAt: JsonField<OffsetDateTime>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var currency: JsonField<Currency>? = null
        private var entityId: JsonField<String>? = null
        private var idempotencyKey: JsonField<String>? = null
        private var informationalEntityId: JsonField<String>? = null
        private var interestAccrued: JsonField<String>? = null
        private var interestAccruedAt: JsonField<LocalDate>? = null
        private var interestRate: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var programId: JsonField<String>? = null
        private var status: JsonField<Status>? = null
        private var type: JsonField<Type>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(account: Account) = apply {
            id = account.id
            bank = account.bank
            closedAt = account.closedAt
            createdAt = account.createdAt
            currency = account.currency
            entityId = account.entityId
            idempotencyKey = account.idempotencyKey
            informationalEntityId = account.informationalEntityId
            interestAccrued = account.interestAccrued
            interestAccruedAt = account.interestAccruedAt
            interestRate = account.interestRate
            name = account.name
            programId = account.programId
            status = account.status
            type = account.type
            additionalProperties = account.additionalProperties.toMutableMap()
        }

        /** The Account identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The bank the Account is with. */
        fun bank(bank: Bank) = bank(JsonField.of(bank))

        /**
         * Sets [Builder.bank] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bank] with a well-typed [Bank] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun bank(bank: JsonField<Bank>) = apply { this.bank = bank }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Account was
         * closed.
         */
        fun closedAt(closedAt: OffsetDateTime?) = closedAt(JsonField.ofNullable(closedAt))

        /** Alias for calling [Builder.closedAt] with `closedAt.orElse(null)`. */
        fun closedAt(closedAt: Optional<OffsetDateTime>) = closedAt(closedAt.getOrNull())

        /**
         * Sets [Builder.closedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.closedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun closedAt(closedAt: JsonField<OffsetDateTime>) = apply { this.closedAt = closedAt }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Account was
         * created.
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

        /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the Account currency. */
        fun currency(currency: Currency) = currency(JsonField.of(currency))

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [Currency] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

        /** The identifier for the Entity the Account belongs to. */
        fun entityId(entityId: String?) = entityId(JsonField.ofNullable(entityId))

        /** Alias for calling [Builder.entityId] with `entityId.orElse(null)`. */
        fun entityId(entityId: Optional<String>) = entityId(entityId.getOrNull())

        /**
         * Sets [Builder.entityId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.entityId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun entityId(entityId: JsonField<String>) = apply { this.entityId = entityId }

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
         * The identifier of an Entity that, while not owning the Account, is associated with its
         * activity.
         */
        fun informationalEntityId(informationalEntityId: String?) =
            informationalEntityId(JsonField.ofNullable(informationalEntityId))

        /**
         * Alias for calling [Builder.informationalEntityId] with
         * `informationalEntityId.orElse(null)`.
         */
        fun informationalEntityId(informationalEntityId: Optional<String>) =
            informationalEntityId(informationalEntityId.getOrNull())

        /**
         * Sets [Builder.informationalEntityId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.informationalEntityId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun informationalEntityId(informationalEntityId: JsonField<String>) = apply {
            this.informationalEntityId = informationalEntityId
        }

        /**
         * The interest accrued but not yet paid, expressed as a string containing a floating-point
         * value.
         */
        fun interestAccrued(interestAccrued: String) =
            interestAccrued(JsonField.of(interestAccrued))

        /**
         * Sets [Builder.interestAccrued] to an arbitrary JSON value.
         *
         * You should usually call [Builder.interestAccrued] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun interestAccrued(interestAccrued: JsonField<String>) = apply {
            this.interestAccrued = interestAccrued
        }

        /**
         * The latest [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date on which interest was
         * accrued.
         */
        fun interestAccruedAt(interestAccruedAt: LocalDate?) =
            interestAccruedAt(JsonField.ofNullable(interestAccruedAt))

        /** Alias for calling [Builder.interestAccruedAt] with `interestAccruedAt.orElse(null)`. */
        fun interestAccruedAt(interestAccruedAt: Optional<LocalDate>) =
            interestAccruedAt(interestAccruedAt.getOrNull())

        /**
         * Sets [Builder.interestAccruedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.interestAccruedAt] with a well-typed [LocalDate] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun interestAccruedAt(interestAccruedAt: JsonField<LocalDate>) = apply {
            this.interestAccruedAt = interestAccruedAt
        }

        /**
         * The Interest Rate currently being earned on the account, as a string containing a decimal
         * number. For example, a 1% interest rate would be represented as "0.01".
         */
        fun interestRate(interestRate: String) = interestRate(JsonField.of(interestRate))

        /**
         * Sets [Builder.interestRate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.interestRate] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun interestRate(interestRate: JsonField<String>) = apply {
            this.interestRate = interestRate
        }

        /** The name you choose for the Account. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /**
         * The identifier of the Program determining the compliance and commercial terms of this
         * Account.
         */
        fun programId(programId: String) = programId(JsonField.of(programId))

        /**
         * Sets [Builder.programId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.programId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun programId(programId: JsonField<String>) = apply { this.programId = programId }

        /** The status of the Account. */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /**
         * A constant representing the object's type. For this resource it will always be `account`.
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
         * Returns an immutable instance of [Account].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .bank()
         * .closedAt()
         * .createdAt()
         * .currency()
         * .entityId()
         * .idempotencyKey()
         * .informationalEntityId()
         * .interestAccrued()
         * .interestAccruedAt()
         * .interestRate()
         * .name()
         * .programId()
         * .status()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Account =
            Account(
                checkRequired("id", id),
                checkRequired("bank", bank),
                checkRequired("closedAt", closedAt),
                checkRequired("createdAt", createdAt),
                checkRequired("currency", currency),
                checkRequired("entityId", entityId),
                checkRequired("idempotencyKey", idempotencyKey),
                checkRequired("informationalEntityId", informationalEntityId),
                checkRequired("interestAccrued", interestAccrued),
                checkRequired("interestAccruedAt", interestAccruedAt),
                checkRequired("interestRate", interestRate),
                checkRequired("name", name),
                checkRequired("programId", programId),
                checkRequired("status", status),
                checkRequired("type", type),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Account = apply {
        if (validated) {
            return@apply
        }

        id()
        bank().validate()
        closedAt()
        createdAt()
        currency().validate()
        entityId()
        idempotencyKey()
        informationalEntityId()
        interestAccrued()
        interestAccruedAt()
        interestRate()
        name()
        programId()
        status().validate()
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
            (bank.asKnown().getOrNull()?.validity() ?: 0) +
            (if (closedAt.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (currency.asKnown().getOrNull()?.validity() ?: 0) +
            (if (entityId.asKnown().isPresent) 1 else 0) +
            (if (idempotencyKey.asKnown().isPresent) 1 else 0) +
            (if (informationalEntityId.asKnown().isPresent) 1 else 0) +
            (if (interestAccrued.asKnown().isPresent) 1 else 0) +
            (if (interestAccruedAt.asKnown().isPresent) 1 else 0) +
            (if (interestRate.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (programId.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0)

    /** The bank the Account is with. */
    class Bank @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            /** Core Bank */
            @JvmField val CORE_BANK = of("core_bank")

            /** First Internet Bank of Indiana */
            @JvmField val FIRST_INTERNET_BANK = of("first_internet_bank")

            /** Grasshopper Bank */
            @JvmField val GRASSHOPPER_BANK = of("grasshopper_bank")

            @JvmStatic fun of(value: String) = Bank(JsonField.of(value))
        }

        /** An enum containing [Bank]'s known values. */
        enum class Known {
            /** Core Bank */
            CORE_BANK,
            /** First Internet Bank of Indiana */
            FIRST_INTERNET_BANK,
            /** Grasshopper Bank */
            GRASSHOPPER_BANK,
        }

        /**
         * An enum containing [Bank]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Bank] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            /** Core Bank */
            CORE_BANK,
            /** First Internet Bank of Indiana */
            FIRST_INTERNET_BANK,
            /** Grasshopper Bank */
            GRASSHOPPER_BANK,
            /** An enum member indicating that [Bank] was instantiated with an unknown value. */
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
                CORE_BANK -> Value.CORE_BANK
                FIRST_INTERNET_BANK -> Value.FIRST_INTERNET_BANK
                GRASSHOPPER_BANK -> Value.GRASSHOPPER_BANK
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
                CORE_BANK -> Known.CORE_BANK
                FIRST_INTERNET_BANK -> Known.FIRST_INTERNET_BANK
                GRASSHOPPER_BANK -> Known.GRASSHOPPER_BANK
                else -> throw IncreaseInvalidDataException("Unknown Bank: $value")
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

        fun validate(): Bank = apply {
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

            return other is Bank && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the Account currency. */
    class Currency @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            /** Canadian Dollar (CAD) */
            @JvmField val CAD = of("CAD")

            /** Swiss Franc (CHF) */
            @JvmField val CHF = of("CHF")

            /** Euro (EUR) */
            @JvmField val EUR = of("EUR")

            /** British Pound (GBP) */
            @JvmField val GBP = of("GBP")

            /** Japanese Yen (JPY) */
            @JvmField val JPY = of("JPY")

            /** US Dollar (USD) */
            @JvmField val USD = of("USD")

            @JvmStatic fun of(value: String) = Currency(JsonField.of(value))
        }

        /** An enum containing [Currency]'s known values. */
        enum class Known {
            /** Canadian Dollar (CAD) */
            CAD,
            /** Swiss Franc (CHF) */
            CHF,
            /** Euro (EUR) */
            EUR,
            /** British Pound (GBP) */
            GBP,
            /** Japanese Yen (JPY) */
            JPY,
            /** US Dollar (USD) */
            USD,
        }

        /**
         * An enum containing [Currency]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Currency] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            /** Canadian Dollar (CAD) */
            CAD,
            /** Swiss Franc (CHF) */
            CHF,
            /** Euro (EUR) */
            EUR,
            /** British Pound (GBP) */
            GBP,
            /** Japanese Yen (JPY) */
            JPY,
            /** US Dollar (USD) */
            USD,
            /** An enum member indicating that [Currency] was instantiated with an unknown value. */
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
                CAD -> Value.CAD
                CHF -> Value.CHF
                EUR -> Value.EUR
                GBP -> Value.GBP
                JPY -> Value.JPY
                USD -> Value.USD
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
                CAD -> Known.CAD
                CHF -> Known.CHF
                EUR -> Known.EUR
                GBP -> Known.GBP
                JPY -> Known.JPY
                USD -> Known.USD
                else -> throw IncreaseInvalidDataException("Unknown Currency: $value")
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

        fun validate(): Currency = apply {
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

            return other is Currency && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The status of the Account. */
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

            /** Closed Accounts on which no new activity can occur. */
            @JvmField val CLOSED = of("closed")

            /** Open Accounts that are ready to use. */
            @JvmField val OPEN = of("open")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            /** Closed Accounts on which no new activity can occur. */
            CLOSED,
            /** Open Accounts that are ready to use. */
            OPEN,
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
            /** Closed Accounts on which no new activity can occur. */
            CLOSED,
            /** Open Accounts that are ready to use. */
            OPEN,
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
                CLOSED -> Value.CLOSED
                OPEN -> Value.OPEN
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
                CLOSED -> Known.CLOSED
                OPEN -> Known.OPEN
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

    /** A constant representing the object's type. For this resource it will always be `account`. */
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

            @JvmField val ACCOUNT = of("account")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            ACCOUNT
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
            ACCOUNT,
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
                ACCOUNT -> Value.ACCOUNT
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
                ACCOUNT -> Known.ACCOUNT
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

        return other is Account &&
            id == other.id &&
            bank == other.bank &&
            closedAt == other.closedAt &&
            createdAt == other.createdAt &&
            currency == other.currency &&
            entityId == other.entityId &&
            idempotencyKey == other.idempotencyKey &&
            informationalEntityId == other.informationalEntityId &&
            interestAccrued == other.interestAccrued &&
            interestAccruedAt == other.interestAccruedAt &&
            interestRate == other.interestRate &&
            name == other.name &&
            programId == other.programId &&
            status == other.status &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            bank,
            closedAt,
            createdAt,
            currency,
            entityId,
            idempotencyKey,
            informationalEntityId,
            interestAccrued,
            interestAccruedAt,
            interestRate,
            name,
            programId,
            status,
            type,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Account{id=$id, bank=$bank, closedAt=$closedAt, createdAt=$createdAt, currency=$currency, entityId=$entityId, idempotencyKey=$idempotencyKey, informationalEntityId=$informationalEntityId, interestAccrued=$interestAccrued, interestAccruedAt=$interestAccruedAt, interestRate=$interestRate, name=$name, programId=$programId, status=$status, type=$type, additionalProperties=$additionalProperties}"
}
