// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.pendingtransactions

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
 * Pending Transactions are potential future additions and removals of money from your bank account.
 */
class PendingTransaction
private constructor(
    private val id: JsonField<String>,
    private val accountId: JsonField<String>,
    private val amount: JsonField<Long>,
    private val completedAt: JsonField<OffsetDateTime>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val currency: JsonField<Currency>,
    private val description: JsonField<String>,
    private val routeId: JsonField<String>,
    private val routeType: JsonField<RouteType>,
    private val source: JsonField<Source>,
    private val status: JsonField<Status>,
    private val type: JsonField<Type>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("account_id") @ExcludeMissing accountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("completed_at")
        @ExcludeMissing
        completedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<Currency> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("route_id") @ExcludeMissing routeId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("route_type")
        @ExcludeMissing
        routeType: JsonField<RouteType> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<Source> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
    ) : this(
        id,
        accountId,
        amount,
        completedAt,
        createdAt,
        currency,
        description,
        routeId,
        routeType,
        source,
        status,
        type,
        mutableMapOf(),
    )

    /**
     * The Pending Transaction identifier.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The identifier for the account this Pending Transaction belongs to.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountId(): String = accountId.getRequired("account_id")

    /**
     * The Pending Transaction amount in the minor unit of its currency. For dollars, for example,
     * this is cents.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amount(): Long = amount.getRequired("amount")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date on which the Pending Transaction
     * was completed.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun completedAt(): Optional<OffsetDateTime> = completedAt.getOptional("completed_at")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date on which the Pending Transaction
     * occurred.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the Pending Transaction's
     * currency. This will match the currency on the Pending Transaction's Account.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currency(): Currency = currency.getRequired("currency")

    /**
     * For a Pending Transaction related to a transfer, this is the description you provide. For a
     * Pending Transaction related to a payment, this is the description the vendor provides.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun description(): String = description.getRequired("description")

    /**
     * The identifier for the route this Pending Transaction came through. Routes are things like
     * cards and ACH details.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun routeId(): Optional<String> = routeId.getOptional("route_id")

    /**
     * The type of the route this Pending Transaction came through.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun routeType(): Optional<RouteType> = routeType.getOptional("route_type")

    /**
     * This is an object giving more details on the network-level event that caused the Pending
     * Transaction. For example, for a card transaction this lists the merchant's industry and
     * location.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun source(): Source = source.getRequired("source")

    /**
     * Whether the Pending Transaction has been confirmed and has an associated Transaction.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `pending_transaction`.
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
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

    /**
     * Returns the raw JSON value of [completedAt].
     *
     * Unlike [completedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("completed_at")
    @ExcludeMissing
    fun _completedAt(): JsonField<OffsetDateTime> = completedAt

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
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [routeId].
     *
     * Unlike [routeId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("route_id") @ExcludeMissing fun _routeId(): JsonField<String> = routeId

    /**
     * Returns the raw JSON value of [routeType].
     *
     * Unlike [routeType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("route_type") @ExcludeMissing fun _routeType(): JsonField<RouteType> = routeType

    /**
     * Returns the raw JSON value of [source].
     *
     * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("source") @ExcludeMissing fun _source(): JsonField<Source> = source

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
         * Returns a mutable builder for constructing an instance of [PendingTransaction].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .accountId()
         * .amount()
         * .completedAt()
         * .createdAt()
         * .currency()
         * .description()
         * .routeId()
         * .routeType()
         * .source()
         * .status()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PendingTransaction]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var accountId: JsonField<String>? = null
        private var amount: JsonField<Long>? = null
        private var completedAt: JsonField<OffsetDateTime>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var currency: JsonField<Currency>? = null
        private var description: JsonField<String>? = null
        private var routeId: JsonField<String>? = null
        private var routeType: JsonField<RouteType>? = null
        private var source: JsonField<Source>? = null
        private var status: JsonField<Status>? = null
        private var type: JsonField<Type>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(pendingTransaction: PendingTransaction) = apply {
            id = pendingTransaction.id
            accountId = pendingTransaction.accountId
            amount = pendingTransaction.amount
            completedAt = pendingTransaction.completedAt
            createdAt = pendingTransaction.createdAt
            currency = pendingTransaction.currency
            description = pendingTransaction.description
            routeId = pendingTransaction.routeId
            routeType = pendingTransaction.routeType
            source = pendingTransaction.source
            status = pendingTransaction.status
            type = pendingTransaction.type
            additionalProperties = pendingTransaction.additionalProperties.toMutableMap()
        }

        /** The Pending Transaction identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The identifier for the account this Pending Transaction belongs to. */
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
         * The Pending Transaction amount in the minor unit of its currency. For dollars, for
         * example, this is cents.
         */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date on which the Pending
         * Transaction was completed.
         */
        fun completedAt(completedAt: OffsetDateTime?) =
            completedAt(JsonField.ofNullable(completedAt))

        /** Alias for calling [Builder.completedAt] with `completedAt.orElse(null)`. */
        fun completedAt(completedAt: Optional<OffsetDateTime>) =
            completedAt(completedAt.getOrNull())

        /**
         * Sets [Builder.completedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.completedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun completedAt(completedAt: JsonField<OffsetDateTime>) = apply {
            this.completedAt = completedAt
        }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date on which the Pending
         * Transaction occurred.
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

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the Pending Transaction's
         * currency. This will match the currency on the Pending Transaction's Account.
         */
        fun currency(currency: Currency) = currency(JsonField.of(currency))

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [Currency] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

        /**
         * For a Pending Transaction related to a transfer, this is the description you provide. For
         * a Pending Transaction related to a payment, this is the description the vendor provides.
         */
        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /**
         * The identifier for the route this Pending Transaction came through. Routes are things
         * like cards and ACH details.
         */
        fun routeId(routeId: String?) = routeId(JsonField.ofNullable(routeId))

        /** Alias for calling [Builder.routeId] with `routeId.orElse(null)`. */
        fun routeId(routeId: Optional<String>) = routeId(routeId.getOrNull())

        /**
         * Sets [Builder.routeId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.routeId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun routeId(routeId: JsonField<String>) = apply { this.routeId = routeId }

        /** The type of the route this Pending Transaction came through. */
        fun routeType(routeType: RouteType?) = routeType(JsonField.ofNullable(routeType))

        /** Alias for calling [Builder.routeType] with `routeType.orElse(null)`. */
        fun routeType(routeType: Optional<RouteType>) = routeType(routeType.getOrNull())

        /**
         * Sets [Builder.routeType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.routeType] with a well-typed [RouteType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun routeType(routeType: JsonField<RouteType>) = apply { this.routeType = routeType }

        /**
         * This is an object giving more details on the network-level event that caused the Pending
         * Transaction. For example, for a card transaction this lists the merchant's industry and
         * location.
         */
        fun source(source: Source) = source(JsonField.of(source))

        /**
         * Sets [Builder.source] to an arbitrary JSON value.
         *
         * You should usually call [Builder.source] with a well-typed [Source] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun source(source: JsonField<Source>) = apply { this.source = source }

        /** Whether the Pending Transaction has been confirmed and has an associated Transaction. */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `pending_transaction`.
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
         * Returns an immutable instance of [PendingTransaction].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .accountId()
         * .amount()
         * .completedAt()
         * .createdAt()
         * .currency()
         * .description()
         * .routeId()
         * .routeType()
         * .source()
         * .status()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PendingTransaction =
            PendingTransaction(
                checkRequired("id", id),
                checkRequired("accountId", accountId),
                checkRequired("amount", amount),
                checkRequired("completedAt", completedAt),
                checkRequired("createdAt", createdAt),
                checkRequired("currency", currency),
                checkRequired("description", description),
                checkRequired("routeId", routeId),
                checkRequired("routeType", routeType),
                checkRequired("source", source),
                checkRequired("status", status),
                checkRequired("type", type),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PendingTransaction = apply {
        if (validated) {
            return@apply
        }

        id()
        accountId()
        amount()
        completedAt()
        createdAt()
        currency().validate()
        description()
        routeId()
        routeType().ifPresent { it.validate() }
        source().validate()
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
            (if (accountId.asKnown().isPresent) 1 else 0) +
            (if (amount.asKnown().isPresent) 1 else 0) +
            (if (completedAt.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (currency.asKnown().getOrNull()?.validity() ?: 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (routeId.asKnown().isPresent) 1 else 0) +
            (routeType.asKnown().getOrNull()?.validity() ?: 0) +
            (source.asKnown().getOrNull()?.validity() ?: 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0)

    /**
     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the Pending Transaction's
     * currency. This will match the currency on the Pending Transaction's Account.
     */
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

            return /* spotless:off */ other is Currency && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The type of the route this Pending Transaction came through. */
    class RouteType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            /** An Account Number. */
            @JvmField val ACCOUNT_NUMBER = of("account_number")

            /** A Card. */
            @JvmField val CARD = of("card")

            /** A Lockbox. */
            @JvmField val LOCKBOX = of("lockbox")

            @JvmStatic fun of(value: String) = RouteType(JsonField.of(value))
        }

        /** An enum containing [RouteType]'s known values. */
        enum class Known {
            /** An Account Number. */
            ACCOUNT_NUMBER,
            /** A Card. */
            CARD,
            /** A Lockbox. */
            LOCKBOX,
        }

        /**
         * An enum containing [RouteType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [RouteType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            /** An Account Number. */
            ACCOUNT_NUMBER,
            /** A Card. */
            CARD,
            /** A Lockbox. */
            LOCKBOX,
            /**
             * An enum member indicating that [RouteType] was instantiated with an unknown value.
             */
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
                ACCOUNT_NUMBER -> Value.ACCOUNT_NUMBER
                CARD -> Value.CARD
                LOCKBOX -> Value.LOCKBOX
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
                ACCOUNT_NUMBER -> Known.ACCOUNT_NUMBER
                CARD -> Known.CARD
                LOCKBOX -> Known.LOCKBOX
                else -> throw IncreaseInvalidDataException("Unknown RouteType: $value")
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

        fun validate(): RouteType = apply {
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

            return /* spotless:off */ other is RouteType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * This is an object giving more details on the network-level event that caused the Pending
     * Transaction. For example, for a card transaction this lists the merchant's industry and
     * location.
     */
    class Source
    private constructor(
        private val accountTransferInstruction: JsonField<AccountTransferInstruction>,
        private val achTransferInstruction: JsonField<AchTransferInstruction>,
        private val cardAuthorization: JsonField<CardAuthorization>,
        private val category: JsonField<Category>,
        private val checkDepositInstruction: JsonField<CheckDepositInstruction>,
        private val checkTransferInstruction: JsonField<CheckTransferInstruction>,
        private val inboundFundsHold: JsonField<InboundFundsHold>,
        private val inboundWireTransferReversal: JsonField<InboundWireTransferReversal>,
        private val other: JsonValue,
        private val realTimePaymentsTransferInstruction:
            JsonField<RealTimePaymentsTransferInstruction>,
        private val wireTransferInstruction: JsonField<WireTransferInstruction>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("account_transfer_instruction")
            @ExcludeMissing
            accountTransferInstruction: JsonField<AccountTransferInstruction> = JsonMissing.of(),
            @JsonProperty("ach_transfer_instruction")
            @ExcludeMissing
            achTransferInstruction: JsonField<AchTransferInstruction> = JsonMissing.of(),
            @JsonProperty("card_authorization")
            @ExcludeMissing
            cardAuthorization: JsonField<CardAuthorization> = JsonMissing.of(),
            @JsonProperty("category")
            @ExcludeMissing
            category: JsonField<Category> = JsonMissing.of(),
            @JsonProperty("check_deposit_instruction")
            @ExcludeMissing
            checkDepositInstruction: JsonField<CheckDepositInstruction> = JsonMissing.of(),
            @JsonProperty("check_transfer_instruction")
            @ExcludeMissing
            checkTransferInstruction: JsonField<CheckTransferInstruction> = JsonMissing.of(),
            @JsonProperty("inbound_funds_hold")
            @ExcludeMissing
            inboundFundsHold: JsonField<InboundFundsHold> = JsonMissing.of(),
            @JsonProperty("inbound_wire_transfer_reversal")
            @ExcludeMissing
            inboundWireTransferReversal: JsonField<InboundWireTransferReversal> = JsonMissing.of(),
            @JsonProperty("other") @ExcludeMissing other: JsonValue = JsonMissing.of(),
            @JsonProperty("real_time_payments_transfer_instruction")
            @ExcludeMissing
            realTimePaymentsTransferInstruction: JsonField<RealTimePaymentsTransferInstruction> =
                JsonMissing.of(),
            @JsonProperty("wire_transfer_instruction")
            @ExcludeMissing
            wireTransferInstruction: JsonField<WireTransferInstruction> = JsonMissing.of(),
        ) : this(
            accountTransferInstruction,
            achTransferInstruction,
            cardAuthorization,
            category,
            checkDepositInstruction,
            checkTransferInstruction,
            inboundFundsHold,
            inboundWireTransferReversal,
            other,
            realTimePaymentsTransferInstruction,
            wireTransferInstruction,
            mutableMapOf(),
        )

        /**
         * An Account Transfer Instruction object. This field will be present in the JSON response
         * if and only if `category` is equal to `account_transfer_instruction`.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun accountTransferInstruction(): Optional<AccountTransferInstruction> =
            accountTransferInstruction.getOptional("account_transfer_instruction")

        /**
         * An ACH Transfer Instruction object. This field will be present in the JSON response if
         * and only if `category` is equal to `ach_transfer_instruction`.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun achTransferInstruction(): Optional<AchTransferInstruction> =
            achTransferInstruction.getOptional("ach_transfer_instruction")

        /**
         * A Card Authorization object. This field will be present in the JSON response if and only
         * if `category` is equal to `card_authorization`. Card Authorizations are temporary holds
         * placed on a customers funds with the intent to later clear a transaction.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun cardAuthorization(): Optional<CardAuthorization> =
            cardAuthorization.getOptional("card_authorization")

        /**
         * The type of the resource. We may add additional possible values for this enum over time;
         * your application should be able to handle such additions gracefully.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun category(): Category = category.getRequired("category")

        /**
         * A Check Deposit Instruction object. This field will be present in the JSON response if
         * and only if `category` is equal to `check_deposit_instruction`.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun checkDepositInstruction(): Optional<CheckDepositInstruction> =
            checkDepositInstruction.getOptional("check_deposit_instruction")

        /**
         * A Check Transfer Instruction object. This field will be present in the JSON response if
         * and only if `category` is equal to `check_transfer_instruction`.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun checkTransferInstruction(): Optional<CheckTransferInstruction> =
            checkTransferInstruction.getOptional("check_transfer_instruction")

        /**
         * An Inbound Funds Hold object. This field will be present in the JSON response if and only
         * if `category` is equal to `inbound_funds_hold`. We hold funds for certain transaction
         * types to account for return windows where funds might still be clawed back by the sending
         * institution.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun inboundFundsHold(): Optional<InboundFundsHold> =
            inboundFundsHold.getOptional("inbound_funds_hold")

        /**
         * An Inbound Wire Transfer Reversal object. This field will be present in the JSON response
         * if and only if `category` is equal to `inbound_wire_transfer_reversal`. An Inbound Wire
         * Transfer Reversal is created when Increase has received a wire and the User requests that
         * it be reversed.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun inboundWireTransferReversal(): Optional<InboundWireTransferReversal> =
            inboundWireTransferReversal.getOptional("inbound_wire_transfer_reversal")

        /**
         * If the category of this Transaction source is equal to `other`, this field will contain
         * an empty object, otherwise it will contain null.
         */
        @JsonProperty("other") @ExcludeMissing fun _other(): JsonValue = other

        /**
         * A Real-Time Payments Transfer Instruction object. This field will be present in the JSON
         * response if and only if `category` is equal to `real_time_payments_transfer_instruction`.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun realTimePaymentsTransferInstruction(): Optional<RealTimePaymentsTransferInstruction> =
            realTimePaymentsTransferInstruction.getOptional(
                "real_time_payments_transfer_instruction"
            )

        /**
         * A Wire Transfer Instruction object. This field will be present in the JSON response if
         * and only if `category` is equal to `wire_transfer_instruction`.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun wireTransferInstruction(): Optional<WireTransferInstruction> =
            wireTransferInstruction.getOptional("wire_transfer_instruction")

        /**
         * Returns the raw JSON value of [accountTransferInstruction].
         *
         * Unlike [accountTransferInstruction], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("account_transfer_instruction")
        @ExcludeMissing
        fun _accountTransferInstruction(): JsonField<AccountTransferInstruction> =
            accountTransferInstruction

        /**
         * Returns the raw JSON value of [achTransferInstruction].
         *
         * Unlike [achTransferInstruction], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("ach_transfer_instruction")
        @ExcludeMissing
        fun _achTransferInstruction(): JsonField<AchTransferInstruction> = achTransferInstruction

        /**
         * Returns the raw JSON value of [cardAuthorization].
         *
         * Unlike [cardAuthorization], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("card_authorization")
        @ExcludeMissing
        fun _cardAuthorization(): JsonField<CardAuthorization> = cardAuthorization

        /**
         * Returns the raw JSON value of [category].
         *
         * Unlike [category], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("category") @ExcludeMissing fun _category(): JsonField<Category> = category

        /**
         * Returns the raw JSON value of [checkDepositInstruction].
         *
         * Unlike [checkDepositInstruction], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("check_deposit_instruction")
        @ExcludeMissing
        fun _checkDepositInstruction(): JsonField<CheckDepositInstruction> = checkDepositInstruction

        /**
         * Returns the raw JSON value of [checkTransferInstruction].
         *
         * Unlike [checkTransferInstruction], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("check_transfer_instruction")
        @ExcludeMissing
        fun _checkTransferInstruction(): JsonField<CheckTransferInstruction> =
            checkTransferInstruction

        /**
         * Returns the raw JSON value of [inboundFundsHold].
         *
         * Unlike [inboundFundsHold], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("inbound_funds_hold")
        @ExcludeMissing
        fun _inboundFundsHold(): JsonField<InboundFundsHold> = inboundFundsHold

        /**
         * Returns the raw JSON value of [inboundWireTransferReversal].
         *
         * Unlike [inboundWireTransferReversal], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("inbound_wire_transfer_reversal")
        @ExcludeMissing
        fun _inboundWireTransferReversal(): JsonField<InboundWireTransferReversal> =
            inboundWireTransferReversal

        /**
         * Returns the raw JSON value of [realTimePaymentsTransferInstruction].
         *
         * Unlike [realTimePaymentsTransferInstruction], this method doesn't throw if the JSON field
         * has an unexpected type.
         */
        @JsonProperty("real_time_payments_transfer_instruction")
        @ExcludeMissing
        fun _realTimePaymentsTransferInstruction(): JsonField<RealTimePaymentsTransferInstruction> =
            realTimePaymentsTransferInstruction

        /**
         * Returns the raw JSON value of [wireTransferInstruction].
         *
         * Unlike [wireTransferInstruction], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("wire_transfer_instruction")
        @ExcludeMissing
        fun _wireTransferInstruction(): JsonField<WireTransferInstruction> = wireTransferInstruction

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
             * Returns a mutable builder for constructing an instance of [Source].
             *
             * The following fields are required:
             * ```java
             * .accountTransferInstruction()
             * .achTransferInstruction()
             * .cardAuthorization()
             * .category()
             * .checkDepositInstruction()
             * .checkTransferInstruction()
             * .inboundFundsHold()
             * .inboundWireTransferReversal()
             * .other()
             * .realTimePaymentsTransferInstruction()
             * .wireTransferInstruction()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Source]. */
        class Builder internal constructor() {

            private var accountTransferInstruction: JsonField<AccountTransferInstruction>? = null
            private var achTransferInstruction: JsonField<AchTransferInstruction>? = null
            private var cardAuthorization: JsonField<CardAuthorization>? = null
            private var category: JsonField<Category>? = null
            private var checkDepositInstruction: JsonField<CheckDepositInstruction>? = null
            private var checkTransferInstruction: JsonField<CheckTransferInstruction>? = null
            private var inboundFundsHold: JsonField<InboundFundsHold>? = null
            private var inboundWireTransferReversal: JsonField<InboundWireTransferReversal>? = null
            private var other: JsonValue? = null
            private var realTimePaymentsTransferInstruction:
                JsonField<RealTimePaymentsTransferInstruction>? =
                null
            private var wireTransferInstruction: JsonField<WireTransferInstruction>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(source: Source) = apply {
                accountTransferInstruction = source.accountTransferInstruction
                achTransferInstruction = source.achTransferInstruction
                cardAuthorization = source.cardAuthorization
                category = source.category
                checkDepositInstruction = source.checkDepositInstruction
                checkTransferInstruction = source.checkTransferInstruction
                inboundFundsHold = source.inboundFundsHold
                inboundWireTransferReversal = source.inboundWireTransferReversal
                other = source.other
                realTimePaymentsTransferInstruction = source.realTimePaymentsTransferInstruction
                wireTransferInstruction = source.wireTransferInstruction
                additionalProperties = source.additionalProperties.toMutableMap()
            }

            /**
             * An Account Transfer Instruction object. This field will be present in the JSON
             * response if and only if `category` is equal to `account_transfer_instruction`.
             */
            fun accountTransferInstruction(
                accountTransferInstruction: AccountTransferInstruction?
            ) = accountTransferInstruction(JsonField.ofNullable(accountTransferInstruction))

            /**
             * Alias for calling [Builder.accountTransferInstruction] with
             * `accountTransferInstruction.orElse(null)`.
             */
            fun accountTransferInstruction(
                accountTransferInstruction: Optional<AccountTransferInstruction>
            ) = accountTransferInstruction(accountTransferInstruction.getOrNull())

            /**
             * Sets [Builder.accountTransferInstruction] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountTransferInstruction] with a well-typed
             * [AccountTransferInstruction] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun accountTransferInstruction(
                accountTransferInstruction: JsonField<AccountTransferInstruction>
            ) = apply { this.accountTransferInstruction = accountTransferInstruction }

            /**
             * An ACH Transfer Instruction object. This field will be present in the JSON response
             * if and only if `category` is equal to `ach_transfer_instruction`.
             */
            fun achTransferInstruction(achTransferInstruction: AchTransferInstruction?) =
                achTransferInstruction(JsonField.ofNullable(achTransferInstruction))

            /**
             * Alias for calling [Builder.achTransferInstruction] with
             * `achTransferInstruction.orElse(null)`.
             */
            fun achTransferInstruction(achTransferInstruction: Optional<AchTransferInstruction>) =
                achTransferInstruction(achTransferInstruction.getOrNull())

            /**
             * Sets [Builder.achTransferInstruction] to an arbitrary JSON value.
             *
             * You should usually call [Builder.achTransferInstruction] with a well-typed
             * [AchTransferInstruction] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun achTransferInstruction(achTransferInstruction: JsonField<AchTransferInstruction>) =
                apply {
                    this.achTransferInstruction = achTransferInstruction
                }

            /**
             * A Card Authorization object. This field will be present in the JSON response if and
             * only if `category` is equal to `card_authorization`. Card Authorizations are
             * temporary holds placed on a customers funds with the intent to later clear a
             * transaction.
             */
            fun cardAuthorization(cardAuthorization: CardAuthorization?) =
                cardAuthorization(JsonField.ofNullable(cardAuthorization))

            /**
             * Alias for calling [Builder.cardAuthorization] with `cardAuthorization.orElse(null)`.
             */
            fun cardAuthorization(cardAuthorization: Optional<CardAuthorization>) =
                cardAuthorization(cardAuthorization.getOrNull())

            /**
             * Sets [Builder.cardAuthorization] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cardAuthorization] with a well-typed
             * [CardAuthorization] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun cardAuthorization(cardAuthorization: JsonField<CardAuthorization>) = apply {
                this.cardAuthorization = cardAuthorization
            }

            /**
             * The type of the resource. We may add additional possible values for this enum over
             * time; your application should be able to handle such additions gracefully.
             */
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
             * A Check Deposit Instruction object. This field will be present in the JSON response
             * if and only if `category` is equal to `check_deposit_instruction`.
             */
            fun checkDepositInstruction(checkDepositInstruction: CheckDepositInstruction?) =
                checkDepositInstruction(JsonField.ofNullable(checkDepositInstruction))

            /**
             * Alias for calling [Builder.checkDepositInstruction] with
             * `checkDepositInstruction.orElse(null)`.
             */
            fun checkDepositInstruction(
                checkDepositInstruction: Optional<CheckDepositInstruction>
            ) = checkDepositInstruction(checkDepositInstruction.getOrNull())

            /**
             * Sets [Builder.checkDepositInstruction] to an arbitrary JSON value.
             *
             * You should usually call [Builder.checkDepositInstruction] with a well-typed
             * [CheckDepositInstruction] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun checkDepositInstruction(
                checkDepositInstruction: JsonField<CheckDepositInstruction>
            ) = apply { this.checkDepositInstruction = checkDepositInstruction }

            /**
             * A Check Transfer Instruction object. This field will be present in the JSON response
             * if and only if `category` is equal to `check_transfer_instruction`.
             */
            fun checkTransferInstruction(checkTransferInstruction: CheckTransferInstruction?) =
                checkTransferInstruction(JsonField.ofNullable(checkTransferInstruction))

            /**
             * Alias for calling [Builder.checkTransferInstruction] with
             * `checkTransferInstruction.orElse(null)`.
             */
            fun checkTransferInstruction(
                checkTransferInstruction: Optional<CheckTransferInstruction>
            ) = checkTransferInstruction(checkTransferInstruction.getOrNull())

            /**
             * Sets [Builder.checkTransferInstruction] to an arbitrary JSON value.
             *
             * You should usually call [Builder.checkTransferInstruction] with a well-typed
             * [CheckTransferInstruction] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun checkTransferInstruction(
                checkTransferInstruction: JsonField<CheckTransferInstruction>
            ) = apply { this.checkTransferInstruction = checkTransferInstruction }

            /**
             * An Inbound Funds Hold object. This field will be present in the JSON response if and
             * only if `category` is equal to `inbound_funds_hold`. We hold funds for certain
             * transaction types to account for return windows where funds might still be clawed
             * back by the sending institution.
             */
            fun inboundFundsHold(inboundFundsHold: InboundFundsHold?) =
                inboundFundsHold(JsonField.ofNullable(inboundFundsHold))

            /**
             * Alias for calling [Builder.inboundFundsHold] with `inboundFundsHold.orElse(null)`.
             */
            fun inboundFundsHold(inboundFundsHold: Optional<InboundFundsHold>) =
                inboundFundsHold(inboundFundsHold.getOrNull())

            /**
             * Sets [Builder.inboundFundsHold] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inboundFundsHold] with a well-typed
             * [InboundFundsHold] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun inboundFundsHold(inboundFundsHold: JsonField<InboundFundsHold>) = apply {
                this.inboundFundsHold = inboundFundsHold
            }

            /**
             * An Inbound Wire Transfer Reversal object. This field will be present in the JSON
             * response if and only if `category` is equal to `inbound_wire_transfer_reversal`. An
             * Inbound Wire Transfer Reversal is created when Increase has received a wire and the
             * User requests that it be reversed.
             */
            fun inboundWireTransferReversal(
                inboundWireTransferReversal: InboundWireTransferReversal?
            ) = inboundWireTransferReversal(JsonField.ofNullable(inboundWireTransferReversal))

            /**
             * Alias for calling [Builder.inboundWireTransferReversal] with
             * `inboundWireTransferReversal.orElse(null)`.
             */
            fun inboundWireTransferReversal(
                inboundWireTransferReversal: Optional<InboundWireTransferReversal>
            ) = inboundWireTransferReversal(inboundWireTransferReversal.getOrNull())

            /**
             * Sets [Builder.inboundWireTransferReversal] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inboundWireTransferReversal] with a well-typed
             * [InboundWireTransferReversal] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun inboundWireTransferReversal(
                inboundWireTransferReversal: JsonField<InboundWireTransferReversal>
            ) = apply { this.inboundWireTransferReversal = inboundWireTransferReversal }

            /**
             * If the category of this Transaction source is equal to `other`, this field will
             * contain an empty object, otherwise it will contain null.
             */
            fun other(other: JsonValue) = apply { this.other = other }

            /**
             * A Real-Time Payments Transfer Instruction object. This field will be present in the
             * JSON response if and only if `category` is equal to
             * `real_time_payments_transfer_instruction`.
             */
            fun realTimePaymentsTransferInstruction(
                realTimePaymentsTransferInstruction: RealTimePaymentsTransferInstruction?
            ) =
                realTimePaymentsTransferInstruction(
                    JsonField.ofNullable(realTimePaymentsTransferInstruction)
                )

            /**
             * Alias for calling [Builder.realTimePaymentsTransferInstruction] with
             * `realTimePaymentsTransferInstruction.orElse(null)`.
             */
            fun realTimePaymentsTransferInstruction(
                realTimePaymentsTransferInstruction: Optional<RealTimePaymentsTransferInstruction>
            ) = realTimePaymentsTransferInstruction(realTimePaymentsTransferInstruction.getOrNull())

            /**
             * Sets [Builder.realTimePaymentsTransferInstruction] to an arbitrary JSON value.
             *
             * You should usually call [Builder.realTimePaymentsTransferInstruction] with a
             * well-typed [RealTimePaymentsTransferInstruction] value instead. This method is
             * primarily for setting the field to an undocumented or not yet supported value.
             */
            fun realTimePaymentsTransferInstruction(
                realTimePaymentsTransferInstruction: JsonField<RealTimePaymentsTransferInstruction>
            ) = apply {
                this.realTimePaymentsTransferInstruction = realTimePaymentsTransferInstruction
            }

            /**
             * A Wire Transfer Instruction object. This field will be present in the JSON response
             * if and only if `category` is equal to `wire_transfer_instruction`.
             */
            fun wireTransferInstruction(wireTransferInstruction: WireTransferInstruction?) =
                wireTransferInstruction(JsonField.ofNullable(wireTransferInstruction))

            /**
             * Alias for calling [Builder.wireTransferInstruction] with
             * `wireTransferInstruction.orElse(null)`.
             */
            fun wireTransferInstruction(
                wireTransferInstruction: Optional<WireTransferInstruction>
            ) = wireTransferInstruction(wireTransferInstruction.getOrNull())

            /**
             * Sets [Builder.wireTransferInstruction] to an arbitrary JSON value.
             *
             * You should usually call [Builder.wireTransferInstruction] with a well-typed
             * [WireTransferInstruction] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun wireTransferInstruction(
                wireTransferInstruction: JsonField<WireTransferInstruction>
            ) = apply { this.wireTransferInstruction = wireTransferInstruction }

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
             * Returns an immutable instance of [Source].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .accountTransferInstruction()
             * .achTransferInstruction()
             * .cardAuthorization()
             * .category()
             * .checkDepositInstruction()
             * .checkTransferInstruction()
             * .inboundFundsHold()
             * .inboundWireTransferReversal()
             * .other()
             * .realTimePaymentsTransferInstruction()
             * .wireTransferInstruction()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Source =
                Source(
                    checkRequired("accountTransferInstruction", accountTransferInstruction),
                    checkRequired("achTransferInstruction", achTransferInstruction),
                    checkRequired("cardAuthorization", cardAuthorization),
                    checkRequired("category", category),
                    checkRequired("checkDepositInstruction", checkDepositInstruction),
                    checkRequired("checkTransferInstruction", checkTransferInstruction),
                    checkRequired("inboundFundsHold", inboundFundsHold),
                    checkRequired("inboundWireTransferReversal", inboundWireTransferReversal),
                    checkRequired("other", other),
                    checkRequired(
                        "realTimePaymentsTransferInstruction",
                        realTimePaymentsTransferInstruction,
                    ),
                    checkRequired("wireTransferInstruction", wireTransferInstruction),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Source = apply {
            if (validated) {
                return@apply
            }

            accountTransferInstruction().ifPresent { it.validate() }
            achTransferInstruction().ifPresent { it.validate() }
            cardAuthorization().ifPresent { it.validate() }
            category().validate()
            checkDepositInstruction().ifPresent { it.validate() }
            checkTransferInstruction().ifPresent { it.validate() }
            inboundFundsHold().ifPresent { it.validate() }
            inboundWireTransferReversal().ifPresent { it.validate() }
            realTimePaymentsTransferInstruction().ifPresent { it.validate() }
            wireTransferInstruction().ifPresent { it.validate() }
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
            (accountTransferInstruction.asKnown().getOrNull()?.validity() ?: 0) +
                (achTransferInstruction.asKnown().getOrNull()?.validity() ?: 0) +
                (cardAuthorization.asKnown().getOrNull()?.validity() ?: 0) +
                (category.asKnown().getOrNull()?.validity() ?: 0) +
                (checkDepositInstruction.asKnown().getOrNull()?.validity() ?: 0) +
                (checkTransferInstruction.asKnown().getOrNull()?.validity() ?: 0) +
                (inboundFundsHold.asKnown().getOrNull()?.validity() ?: 0) +
                (inboundWireTransferReversal.asKnown().getOrNull()?.validity() ?: 0) +
                (realTimePaymentsTransferInstruction.asKnown().getOrNull()?.validity() ?: 0) +
                (wireTransferInstruction.asKnown().getOrNull()?.validity() ?: 0)

        /**
         * An Account Transfer Instruction object. This field will be present in the JSON response
         * if and only if `category` is equal to `account_transfer_instruction`.
         */
        class AccountTransferInstruction
        private constructor(
            private val amount: JsonField<Long>,
            private val currency: JsonField<Currency>,
            private val transferId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("currency")
                @ExcludeMissing
                currency: JsonField<Currency> = JsonMissing.of(),
                @JsonProperty("transfer_id")
                @ExcludeMissing
                transferId: JsonField<String> = JsonMissing.of(),
            ) : this(amount, currency, transferId, mutableMapOf())

            /**
             * The pending amount in the minor unit of the transaction's currency. For dollars, for
             * example, this is cents.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun amount(): Long = amount.getRequired("amount")

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the destination
             * account currency.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun currency(): Currency = currency.getRequired("currency")

            /**
             * The identifier of the Account Transfer that led to this Pending Transaction.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun transferId(): String = transferId.getRequired("transfer_id")

            /**
             * Returns the raw JSON value of [amount].
             *
             * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

            /**
             * Returns the raw JSON value of [currency].
             *
             * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("currency")
            @ExcludeMissing
            fun _currency(): JsonField<Currency> = currency

            /**
             * Returns the raw JSON value of [transferId].
             *
             * Unlike [transferId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("transfer_id")
            @ExcludeMissing
            fun _transferId(): JsonField<String> = transferId

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
                 * [AccountTransferInstruction].
                 *
                 * The following fields are required:
                 * ```java
                 * .amount()
                 * .currency()
                 * .transferId()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [AccountTransferInstruction]. */
            class Builder internal constructor() {

                private var amount: JsonField<Long>? = null
                private var currency: JsonField<Currency>? = null
                private var transferId: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(accountTransferInstruction: AccountTransferInstruction) = apply {
                    amount = accountTransferInstruction.amount
                    currency = accountTransferInstruction.currency
                    transferId = accountTransferInstruction.transferId
                    additionalProperties =
                        accountTransferInstruction.additionalProperties.toMutableMap()
                }

                /**
                 * The pending amount in the minor unit of the transaction's currency. For dollars,
                 * for example, this is cents.
                 */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /**
                 * Sets [Builder.amount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amount] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the destination
                 * account currency.
                 */
                fun currency(currency: Currency) = currency(JsonField.of(currency))

                /**
                 * Sets [Builder.currency] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.currency] with a well-typed [Currency] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                /** The identifier of the Account Transfer that led to this Pending Transaction. */
                fun transferId(transferId: String) = transferId(JsonField.of(transferId))

                /**
                 * Sets [Builder.transferId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.transferId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun transferId(transferId: JsonField<String>) = apply {
                    this.transferId = transferId
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
                 * Returns an immutable instance of [AccountTransferInstruction].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .amount()
                 * .currency()
                 * .transferId()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): AccountTransferInstruction =
                    AccountTransferInstruction(
                        checkRequired("amount", amount),
                        checkRequired("currency", currency),
                        checkRequired("transferId", transferId),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): AccountTransferInstruction = apply {
                if (validated) {
                    return@apply
                }

                amount()
                currency().validate()
                transferId()
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
                (if (amount.asKnown().isPresent) 1 else 0) +
                    (currency.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (transferId.asKnown().isPresent) 1 else 0)

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the destination
             * account currency.
             */
            class Currency @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

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
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
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
                    /**
                     * An enum member indicating that [Currency] was instantiated with an unknown
                     * value.
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
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws IncreaseInvalidDataException if this class instance's value is a not a
                 *   known member.
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

                    return /* spotless:off */ other is Currency && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is AccountTransferInstruction && amount == other.amount && currency == other.currency && transferId == other.transferId && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(amount, currency, transferId, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AccountTransferInstruction{amount=$amount, currency=$currency, transferId=$transferId, additionalProperties=$additionalProperties}"
        }

        /**
         * An ACH Transfer Instruction object. This field will be present in the JSON response if
         * and only if `category` is equal to `ach_transfer_instruction`.
         */
        class AchTransferInstruction
        private constructor(
            private val amount: JsonField<Long>,
            private val transferId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("transfer_id")
                @ExcludeMissing
                transferId: JsonField<String> = JsonMissing.of(),
            ) : this(amount, transferId, mutableMapOf())

            /**
             * The pending amount in USD cents.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun amount(): Long = amount.getRequired("amount")

            /**
             * The identifier of the ACH Transfer that led to this Pending Transaction.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun transferId(): String = transferId.getRequired("transfer_id")

            /**
             * Returns the raw JSON value of [amount].
             *
             * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

            /**
             * Returns the raw JSON value of [transferId].
             *
             * Unlike [transferId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("transfer_id")
            @ExcludeMissing
            fun _transferId(): JsonField<String> = transferId

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
                 * [AchTransferInstruction].
                 *
                 * The following fields are required:
                 * ```java
                 * .amount()
                 * .transferId()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [AchTransferInstruction]. */
            class Builder internal constructor() {

                private var amount: JsonField<Long>? = null
                private var transferId: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(achTransferInstruction: AchTransferInstruction) = apply {
                    amount = achTransferInstruction.amount
                    transferId = achTransferInstruction.transferId
                    additionalProperties =
                        achTransferInstruction.additionalProperties.toMutableMap()
                }

                /** The pending amount in USD cents. */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /**
                 * Sets [Builder.amount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amount] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /** The identifier of the ACH Transfer that led to this Pending Transaction. */
                fun transferId(transferId: String) = transferId(JsonField.of(transferId))

                /**
                 * Sets [Builder.transferId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.transferId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun transferId(transferId: JsonField<String>) = apply {
                    this.transferId = transferId
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
                 * Returns an immutable instance of [AchTransferInstruction].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .amount()
                 * .transferId()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): AchTransferInstruction =
                    AchTransferInstruction(
                        checkRequired("amount", amount),
                        checkRequired("transferId", transferId),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): AchTransferInstruction = apply {
                if (validated) {
                    return@apply
                }

                amount()
                transferId()
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
                (if (amount.asKnown().isPresent) 1 else 0) +
                    (if (transferId.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is AchTransferInstruction && amount == other.amount && transferId == other.transferId && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(amount, transferId, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AchTransferInstruction{amount=$amount, transferId=$transferId, additionalProperties=$additionalProperties}"
        }

        /**
         * A Card Authorization object. This field will be present in the JSON response if and only
         * if `category` is equal to `card_authorization`. Card Authorizations are temporary holds
         * placed on a customers funds with the intent to later clear a transaction.
         */
        class CardAuthorization
        private constructor(
            private val id: JsonField<String>,
            private val actioner: JsonField<Actioner>,
            private val amount: JsonField<Long>,
            private val cardPaymentId: JsonField<String>,
            private val currency: JsonField<Currency>,
            private val digitalWalletTokenId: JsonField<String>,
            private val direction: JsonField<Direction>,
            private val expiresAt: JsonField<OffsetDateTime>,
            private val merchantAcceptorId: JsonField<String>,
            private val merchantCategoryCode: JsonField<String>,
            private val merchantCity: JsonField<String>,
            private val merchantCountry: JsonField<String>,
            private val merchantDescriptor: JsonField<String>,
            private val merchantPostalCode: JsonField<String>,
            private val merchantState: JsonField<String>,
            private val networkDetails: JsonField<NetworkDetails>,
            private val networkIdentifiers: JsonField<NetworkIdentifiers>,
            private val networkRiskScore: JsonField<Long>,
            private val pendingTransactionId: JsonField<String>,
            private val physicalCardId: JsonField<String>,
            private val presentmentAmount: JsonField<Long>,
            private val presentmentCurrency: JsonField<String>,
            private val processingCategory: JsonField<ProcessingCategory>,
            private val realTimeDecisionId: JsonField<String>,
            private val terminalId: JsonField<String>,
            private val type: JsonField<Type>,
            private val verification: JsonField<Verification>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("actioner")
                @ExcludeMissing
                actioner: JsonField<Actioner> = JsonMissing.of(),
                @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("card_payment_id")
                @ExcludeMissing
                cardPaymentId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("currency")
                @ExcludeMissing
                currency: JsonField<Currency> = JsonMissing.of(),
                @JsonProperty("digital_wallet_token_id")
                @ExcludeMissing
                digitalWalletTokenId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("direction")
                @ExcludeMissing
                direction: JsonField<Direction> = JsonMissing.of(),
                @JsonProperty("expires_at")
                @ExcludeMissing
                expiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("merchant_acceptor_id")
                @ExcludeMissing
                merchantAcceptorId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("merchant_category_code")
                @ExcludeMissing
                merchantCategoryCode: JsonField<String> = JsonMissing.of(),
                @JsonProperty("merchant_city")
                @ExcludeMissing
                merchantCity: JsonField<String> = JsonMissing.of(),
                @JsonProperty("merchant_country")
                @ExcludeMissing
                merchantCountry: JsonField<String> = JsonMissing.of(),
                @JsonProperty("merchant_descriptor")
                @ExcludeMissing
                merchantDescriptor: JsonField<String> = JsonMissing.of(),
                @JsonProperty("merchant_postal_code")
                @ExcludeMissing
                merchantPostalCode: JsonField<String> = JsonMissing.of(),
                @JsonProperty("merchant_state")
                @ExcludeMissing
                merchantState: JsonField<String> = JsonMissing.of(),
                @JsonProperty("network_details")
                @ExcludeMissing
                networkDetails: JsonField<NetworkDetails> = JsonMissing.of(),
                @JsonProperty("network_identifiers")
                @ExcludeMissing
                networkIdentifiers: JsonField<NetworkIdentifiers> = JsonMissing.of(),
                @JsonProperty("network_risk_score")
                @ExcludeMissing
                networkRiskScore: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("pending_transaction_id")
                @ExcludeMissing
                pendingTransactionId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("physical_card_id")
                @ExcludeMissing
                physicalCardId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("presentment_amount")
                @ExcludeMissing
                presentmentAmount: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("presentment_currency")
                @ExcludeMissing
                presentmentCurrency: JsonField<String> = JsonMissing.of(),
                @JsonProperty("processing_category")
                @ExcludeMissing
                processingCategory: JsonField<ProcessingCategory> = JsonMissing.of(),
                @JsonProperty("real_time_decision_id")
                @ExcludeMissing
                realTimeDecisionId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("terminal_id")
                @ExcludeMissing
                terminalId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
                @JsonProperty("verification")
                @ExcludeMissing
                verification: JsonField<Verification> = JsonMissing.of(),
            ) : this(
                id,
                actioner,
                amount,
                cardPaymentId,
                currency,
                digitalWalletTokenId,
                direction,
                expiresAt,
                merchantAcceptorId,
                merchantCategoryCode,
                merchantCity,
                merchantCountry,
                merchantDescriptor,
                merchantPostalCode,
                merchantState,
                networkDetails,
                networkIdentifiers,
                networkRiskScore,
                pendingTransactionId,
                physicalCardId,
                presentmentAmount,
                presentmentCurrency,
                processingCategory,
                realTimeDecisionId,
                terminalId,
                type,
                verification,
                mutableMapOf(),
            )

            /**
             * The Card Authorization identifier.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * Whether this authorization was approved by Increase, the card network through
             * stand-in processing, or the user through a real-time decision.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun actioner(): Actioner = actioner.getRequired("actioner")

            /**
             * The pending amount in the minor unit of the transaction's currency. For dollars, for
             * example, this is cents.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun amount(): Long = amount.getRequired("amount")

            /**
             * The ID of the Card Payment this transaction belongs to.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun cardPaymentId(): String = cardPaymentId.getRequired("card_payment_id")

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
             * currency.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun currency(): Currency = currency.getRequired("currency")

            /**
             * If the authorization was made via a Digital Wallet Token (such as an Apple Pay
             * purchase), the identifier of the token that was used.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun digitalWalletTokenId(): Optional<String> =
                digitalWalletTokenId.getOptional("digital_wallet_token_id")

            /**
             * The direction describes the direction the funds will move, either from the cardholder
             * to the merchant or from the merchant to the cardholder.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun direction(): Direction = direction.getRequired("direction")

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) when this authorization will
             * expire and the pending transaction will be released.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun expiresAt(): OffsetDateTime = expiresAt.getRequired("expires_at")

            /**
             * The merchant identifier (commonly abbreviated as MID) of the merchant the card is
             * transacting with.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun merchantAcceptorId(): String =
                merchantAcceptorId.getRequired("merchant_acceptor_id")

            /**
             * The Merchant Category Code (commonly abbreviated as MCC) of the merchant the card is
             * transacting with.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun merchantCategoryCode(): String =
                merchantCategoryCode.getRequired("merchant_category_code")

            /**
             * The city the merchant resides in.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun merchantCity(): Optional<String> = merchantCity.getOptional("merchant_city")

            /**
             * The country the merchant resides in.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun merchantCountry(): String = merchantCountry.getRequired("merchant_country")

            /**
             * The merchant descriptor of the merchant the card is transacting with.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun merchantDescriptor(): String = merchantDescriptor.getRequired("merchant_descriptor")

            /**
             * The merchant's postal code. For US merchants this is either a 5-digit or 9-digit ZIP
             * code, where the first 5 and last 4 are separated by a dash.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun merchantPostalCode(): Optional<String> =
                merchantPostalCode.getOptional("merchant_postal_code")

            /**
             * The state the merchant resides in.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun merchantState(): Optional<String> = merchantState.getOptional("merchant_state")

            /**
             * Fields specific to the `network`.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun networkDetails(): NetworkDetails = networkDetails.getRequired("network_details")

            /**
             * Network-specific identifiers for a specific request or transaction.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun networkIdentifiers(): NetworkIdentifiers =
                networkIdentifiers.getRequired("network_identifiers")

            /**
             * The risk score generated by the card network. For Visa this is the Visa Advanced
             * Authorization risk score, from 0 to 99, where 99 is the riskiest.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun networkRiskScore(): Optional<Long> =
                networkRiskScore.getOptional("network_risk_score")

            /**
             * The identifier of the Pending Transaction associated with this Transaction.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun pendingTransactionId(): Optional<String> =
                pendingTransactionId.getOptional("pending_transaction_id")

            /**
             * If the authorization was made in-person with a physical card, the Physical Card that
             * was used.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun physicalCardId(): Optional<String> = physicalCardId.getOptional("physical_card_id")

            /**
             * The pending amount in the minor unit of the transaction's presentment currency.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun presentmentAmount(): Long = presentmentAmount.getRequired("presentment_amount")

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
             * presentment currency.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun presentmentCurrency(): String =
                presentmentCurrency.getRequired("presentment_currency")

            /**
             * The processing category describes the intent behind the authorization, such as
             * whether it was used for bill payments or an automatic fuel dispenser.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun processingCategory(): ProcessingCategory =
                processingCategory.getRequired("processing_category")

            /**
             * The identifier of the Real-Time Decision sent to approve or decline this transaction.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun realTimeDecisionId(): Optional<String> =
                realTimeDecisionId.getOptional("real_time_decision_id")

            /**
             * The terminal identifier (commonly abbreviated as TID) of the terminal the card is
             * transacting with.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun terminalId(): Optional<String> = terminalId.getOptional("terminal_id")

            /**
             * A constant representing the object's type. For this resource it will always be
             * `card_authorization`.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): Type = type.getRequired("type")

            /**
             * Fields related to verification of cardholder-provided values.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun verification(): Verification = verification.getRequired("verification")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [actioner].
             *
             * Unlike [actioner], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("actioner")
            @ExcludeMissing
            fun _actioner(): JsonField<Actioner> = actioner

            /**
             * Returns the raw JSON value of [amount].
             *
             * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

            /**
             * Returns the raw JSON value of [cardPaymentId].
             *
             * Unlike [cardPaymentId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("card_payment_id")
            @ExcludeMissing
            fun _cardPaymentId(): JsonField<String> = cardPaymentId

            /**
             * Returns the raw JSON value of [currency].
             *
             * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("currency")
            @ExcludeMissing
            fun _currency(): JsonField<Currency> = currency

            /**
             * Returns the raw JSON value of [digitalWalletTokenId].
             *
             * Unlike [digitalWalletTokenId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("digital_wallet_token_id")
            @ExcludeMissing
            fun _digitalWalletTokenId(): JsonField<String> = digitalWalletTokenId

            /**
             * Returns the raw JSON value of [direction].
             *
             * Unlike [direction], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("direction")
            @ExcludeMissing
            fun _direction(): JsonField<Direction> = direction

            /**
             * Returns the raw JSON value of [expiresAt].
             *
             * Unlike [expiresAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("expires_at")
            @ExcludeMissing
            fun _expiresAt(): JsonField<OffsetDateTime> = expiresAt

            /**
             * Returns the raw JSON value of [merchantAcceptorId].
             *
             * Unlike [merchantAcceptorId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("merchant_acceptor_id")
            @ExcludeMissing
            fun _merchantAcceptorId(): JsonField<String> = merchantAcceptorId

            /**
             * Returns the raw JSON value of [merchantCategoryCode].
             *
             * Unlike [merchantCategoryCode], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("merchant_category_code")
            @ExcludeMissing
            fun _merchantCategoryCode(): JsonField<String> = merchantCategoryCode

            /**
             * Returns the raw JSON value of [merchantCity].
             *
             * Unlike [merchantCity], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("merchant_city")
            @ExcludeMissing
            fun _merchantCity(): JsonField<String> = merchantCity

            /**
             * Returns the raw JSON value of [merchantCountry].
             *
             * Unlike [merchantCountry], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("merchant_country")
            @ExcludeMissing
            fun _merchantCountry(): JsonField<String> = merchantCountry

            /**
             * Returns the raw JSON value of [merchantDescriptor].
             *
             * Unlike [merchantDescriptor], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("merchant_descriptor")
            @ExcludeMissing
            fun _merchantDescriptor(): JsonField<String> = merchantDescriptor

            /**
             * Returns the raw JSON value of [merchantPostalCode].
             *
             * Unlike [merchantPostalCode], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("merchant_postal_code")
            @ExcludeMissing
            fun _merchantPostalCode(): JsonField<String> = merchantPostalCode

            /**
             * Returns the raw JSON value of [merchantState].
             *
             * Unlike [merchantState], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("merchant_state")
            @ExcludeMissing
            fun _merchantState(): JsonField<String> = merchantState

            /**
             * Returns the raw JSON value of [networkDetails].
             *
             * Unlike [networkDetails], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("network_details")
            @ExcludeMissing
            fun _networkDetails(): JsonField<NetworkDetails> = networkDetails

            /**
             * Returns the raw JSON value of [networkIdentifiers].
             *
             * Unlike [networkIdentifiers], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("network_identifiers")
            @ExcludeMissing
            fun _networkIdentifiers(): JsonField<NetworkIdentifiers> = networkIdentifiers

            /**
             * Returns the raw JSON value of [networkRiskScore].
             *
             * Unlike [networkRiskScore], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("network_risk_score")
            @ExcludeMissing
            fun _networkRiskScore(): JsonField<Long> = networkRiskScore

            /**
             * Returns the raw JSON value of [pendingTransactionId].
             *
             * Unlike [pendingTransactionId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("pending_transaction_id")
            @ExcludeMissing
            fun _pendingTransactionId(): JsonField<String> = pendingTransactionId

            /**
             * Returns the raw JSON value of [physicalCardId].
             *
             * Unlike [physicalCardId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("physical_card_id")
            @ExcludeMissing
            fun _physicalCardId(): JsonField<String> = physicalCardId

            /**
             * Returns the raw JSON value of [presentmentAmount].
             *
             * Unlike [presentmentAmount], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("presentment_amount")
            @ExcludeMissing
            fun _presentmentAmount(): JsonField<Long> = presentmentAmount

            /**
             * Returns the raw JSON value of [presentmentCurrency].
             *
             * Unlike [presentmentCurrency], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("presentment_currency")
            @ExcludeMissing
            fun _presentmentCurrency(): JsonField<String> = presentmentCurrency

            /**
             * Returns the raw JSON value of [processingCategory].
             *
             * Unlike [processingCategory], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("processing_category")
            @ExcludeMissing
            fun _processingCategory(): JsonField<ProcessingCategory> = processingCategory

            /**
             * Returns the raw JSON value of [realTimeDecisionId].
             *
             * Unlike [realTimeDecisionId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("real_time_decision_id")
            @ExcludeMissing
            fun _realTimeDecisionId(): JsonField<String> = realTimeDecisionId

            /**
             * Returns the raw JSON value of [terminalId].
             *
             * Unlike [terminalId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("terminal_id")
            @ExcludeMissing
            fun _terminalId(): JsonField<String> = terminalId

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            /**
             * Returns the raw JSON value of [verification].
             *
             * Unlike [verification], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("verification")
            @ExcludeMissing
            fun _verification(): JsonField<Verification> = verification

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
                 * Returns a mutable builder for constructing an instance of [CardAuthorization].
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .actioner()
                 * .amount()
                 * .cardPaymentId()
                 * .currency()
                 * .digitalWalletTokenId()
                 * .direction()
                 * .expiresAt()
                 * .merchantAcceptorId()
                 * .merchantCategoryCode()
                 * .merchantCity()
                 * .merchantCountry()
                 * .merchantDescriptor()
                 * .merchantPostalCode()
                 * .merchantState()
                 * .networkDetails()
                 * .networkIdentifiers()
                 * .networkRiskScore()
                 * .pendingTransactionId()
                 * .physicalCardId()
                 * .presentmentAmount()
                 * .presentmentCurrency()
                 * .processingCategory()
                 * .realTimeDecisionId()
                 * .terminalId()
                 * .type()
                 * .verification()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [CardAuthorization]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var actioner: JsonField<Actioner>? = null
                private var amount: JsonField<Long>? = null
                private var cardPaymentId: JsonField<String>? = null
                private var currency: JsonField<Currency>? = null
                private var digitalWalletTokenId: JsonField<String>? = null
                private var direction: JsonField<Direction>? = null
                private var expiresAt: JsonField<OffsetDateTime>? = null
                private var merchantAcceptorId: JsonField<String>? = null
                private var merchantCategoryCode: JsonField<String>? = null
                private var merchantCity: JsonField<String>? = null
                private var merchantCountry: JsonField<String>? = null
                private var merchantDescriptor: JsonField<String>? = null
                private var merchantPostalCode: JsonField<String>? = null
                private var merchantState: JsonField<String>? = null
                private var networkDetails: JsonField<NetworkDetails>? = null
                private var networkIdentifiers: JsonField<NetworkIdentifiers>? = null
                private var networkRiskScore: JsonField<Long>? = null
                private var pendingTransactionId: JsonField<String>? = null
                private var physicalCardId: JsonField<String>? = null
                private var presentmentAmount: JsonField<Long>? = null
                private var presentmentCurrency: JsonField<String>? = null
                private var processingCategory: JsonField<ProcessingCategory>? = null
                private var realTimeDecisionId: JsonField<String>? = null
                private var terminalId: JsonField<String>? = null
                private var type: JsonField<Type>? = null
                private var verification: JsonField<Verification>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(cardAuthorization: CardAuthorization) = apply {
                    id = cardAuthorization.id
                    actioner = cardAuthorization.actioner
                    amount = cardAuthorization.amount
                    cardPaymentId = cardAuthorization.cardPaymentId
                    currency = cardAuthorization.currency
                    digitalWalletTokenId = cardAuthorization.digitalWalletTokenId
                    direction = cardAuthorization.direction
                    expiresAt = cardAuthorization.expiresAt
                    merchantAcceptorId = cardAuthorization.merchantAcceptorId
                    merchantCategoryCode = cardAuthorization.merchantCategoryCode
                    merchantCity = cardAuthorization.merchantCity
                    merchantCountry = cardAuthorization.merchantCountry
                    merchantDescriptor = cardAuthorization.merchantDescriptor
                    merchantPostalCode = cardAuthorization.merchantPostalCode
                    merchantState = cardAuthorization.merchantState
                    networkDetails = cardAuthorization.networkDetails
                    networkIdentifiers = cardAuthorization.networkIdentifiers
                    networkRiskScore = cardAuthorization.networkRiskScore
                    pendingTransactionId = cardAuthorization.pendingTransactionId
                    physicalCardId = cardAuthorization.physicalCardId
                    presentmentAmount = cardAuthorization.presentmentAmount
                    presentmentCurrency = cardAuthorization.presentmentCurrency
                    processingCategory = cardAuthorization.processingCategory
                    realTimeDecisionId = cardAuthorization.realTimeDecisionId
                    terminalId = cardAuthorization.terminalId
                    type = cardAuthorization.type
                    verification = cardAuthorization.verification
                    additionalProperties = cardAuthorization.additionalProperties.toMutableMap()
                }

                /** The Card Authorization identifier. */
                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                /**
                 * Whether this authorization was approved by Increase, the card network through
                 * stand-in processing, or the user through a real-time decision.
                 */
                fun actioner(actioner: Actioner) = actioner(JsonField.of(actioner))

                /**
                 * Sets [Builder.actioner] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.actioner] with a well-typed [Actioner] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun actioner(actioner: JsonField<Actioner>) = apply { this.actioner = actioner }

                /**
                 * The pending amount in the minor unit of the transaction's currency. For dollars,
                 * for example, this is cents.
                 */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /**
                 * Sets [Builder.amount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amount] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /** The ID of the Card Payment this transaction belongs to. */
                fun cardPaymentId(cardPaymentId: String) =
                    cardPaymentId(JsonField.of(cardPaymentId))

                /**
                 * Sets [Builder.cardPaymentId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cardPaymentId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun cardPaymentId(cardPaymentId: JsonField<String>) = apply {
                    this.cardPaymentId = cardPaymentId
                }

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
                 * currency.
                 */
                fun currency(currency: Currency) = currency(JsonField.of(currency))

                /**
                 * Sets [Builder.currency] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.currency] with a well-typed [Currency] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                /**
                 * If the authorization was made via a Digital Wallet Token (such as an Apple Pay
                 * purchase), the identifier of the token that was used.
                 */
                fun digitalWalletTokenId(digitalWalletTokenId: String?) =
                    digitalWalletTokenId(JsonField.ofNullable(digitalWalletTokenId))

                /**
                 * Alias for calling [Builder.digitalWalletTokenId] with
                 * `digitalWalletTokenId.orElse(null)`.
                 */
                fun digitalWalletTokenId(digitalWalletTokenId: Optional<String>) =
                    digitalWalletTokenId(digitalWalletTokenId.getOrNull())

                /**
                 * Sets [Builder.digitalWalletTokenId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.digitalWalletTokenId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun digitalWalletTokenId(digitalWalletTokenId: JsonField<String>) = apply {
                    this.digitalWalletTokenId = digitalWalletTokenId
                }

                /**
                 * The direction describes the direction the funds will move, either from the
                 * cardholder to the merchant or from the merchant to the cardholder.
                 */
                fun direction(direction: Direction) = direction(JsonField.of(direction))

                /**
                 * Sets [Builder.direction] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.direction] with a well-typed [Direction] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun direction(direction: JsonField<Direction>) = apply {
                    this.direction = direction
                }

                /**
                 * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) when this authorization
                 * will expire and the pending transaction will be released.
                 */
                fun expiresAt(expiresAt: OffsetDateTime) = expiresAt(JsonField.of(expiresAt))

                /**
                 * Sets [Builder.expiresAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.expiresAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply {
                    this.expiresAt = expiresAt
                }

                /**
                 * The merchant identifier (commonly abbreviated as MID) of the merchant the card is
                 * transacting with.
                 */
                fun merchantAcceptorId(merchantAcceptorId: String) =
                    merchantAcceptorId(JsonField.of(merchantAcceptorId))

                /**
                 * Sets [Builder.merchantAcceptorId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.merchantAcceptorId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun merchantAcceptorId(merchantAcceptorId: JsonField<String>) = apply {
                    this.merchantAcceptorId = merchantAcceptorId
                }

                /**
                 * The Merchant Category Code (commonly abbreviated as MCC) of the merchant the card
                 * is transacting with.
                 */
                fun merchantCategoryCode(merchantCategoryCode: String) =
                    merchantCategoryCode(JsonField.of(merchantCategoryCode))

                /**
                 * Sets [Builder.merchantCategoryCode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.merchantCategoryCode] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun merchantCategoryCode(merchantCategoryCode: JsonField<String>) = apply {
                    this.merchantCategoryCode = merchantCategoryCode
                }

                /** The city the merchant resides in. */
                fun merchantCity(merchantCity: String?) =
                    merchantCity(JsonField.ofNullable(merchantCity))

                /** Alias for calling [Builder.merchantCity] with `merchantCity.orElse(null)`. */
                fun merchantCity(merchantCity: Optional<String>) =
                    merchantCity(merchantCity.getOrNull())

                /**
                 * Sets [Builder.merchantCity] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.merchantCity] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun merchantCity(merchantCity: JsonField<String>) = apply {
                    this.merchantCity = merchantCity
                }

                /** The country the merchant resides in. */
                fun merchantCountry(merchantCountry: String) =
                    merchantCountry(JsonField.of(merchantCountry))

                /**
                 * Sets [Builder.merchantCountry] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.merchantCountry] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun merchantCountry(merchantCountry: JsonField<String>) = apply {
                    this.merchantCountry = merchantCountry
                }

                /** The merchant descriptor of the merchant the card is transacting with. */
                fun merchantDescriptor(merchantDescriptor: String) =
                    merchantDescriptor(JsonField.of(merchantDescriptor))

                /**
                 * Sets [Builder.merchantDescriptor] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.merchantDescriptor] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun merchantDescriptor(merchantDescriptor: JsonField<String>) = apply {
                    this.merchantDescriptor = merchantDescriptor
                }

                /**
                 * The merchant's postal code. For US merchants this is either a 5-digit or 9-digit
                 * ZIP code, where the first 5 and last 4 are separated by a dash.
                 */
                fun merchantPostalCode(merchantPostalCode: String?) =
                    merchantPostalCode(JsonField.ofNullable(merchantPostalCode))

                /**
                 * Alias for calling [Builder.merchantPostalCode] with
                 * `merchantPostalCode.orElse(null)`.
                 */
                fun merchantPostalCode(merchantPostalCode: Optional<String>) =
                    merchantPostalCode(merchantPostalCode.getOrNull())

                /**
                 * Sets [Builder.merchantPostalCode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.merchantPostalCode] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun merchantPostalCode(merchantPostalCode: JsonField<String>) = apply {
                    this.merchantPostalCode = merchantPostalCode
                }

                /** The state the merchant resides in. */
                fun merchantState(merchantState: String?) =
                    merchantState(JsonField.ofNullable(merchantState))

                /** Alias for calling [Builder.merchantState] with `merchantState.orElse(null)`. */
                fun merchantState(merchantState: Optional<String>) =
                    merchantState(merchantState.getOrNull())

                /**
                 * Sets [Builder.merchantState] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.merchantState] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun merchantState(merchantState: JsonField<String>) = apply {
                    this.merchantState = merchantState
                }

                /** Fields specific to the `network`. */
                fun networkDetails(networkDetails: NetworkDetails) =
                    networkDetails(JsonField.of(networkDetails))

                /**
                 * Sets [Builder.networkDetails] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.networkDetails] with a well-typed
                 * [NetworkDetails] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun networkDetails(networkDetails: JsonField<NetworkDetails>) = apply {
                    this.networkDetails = networkDetails
                }

                /** Network-specific identifiers for a specific request or transaction. */
                fun networkIdentifiers(networkIdentifiers: NetworkIdentifiers) =
                    networkIdentifiers(JsonField.of(networkIdentifiers))

                /**
                 * Sets [Builder.networkIdentifiers] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.networkIdentifiers] with a well-typed
                 * [NetworkIdentifiers] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun networkIdentifiers(networkIdentifiers: JsonField<NetworkIdentifiers>) = apply {
                    this.networkIdentifiers = networkIdentifiers
                }

                /**
                 * The risk score generated by the card network. For Visa this is the Visa Advanced
                 * Authorization risk score, from 0 to 99, where 99 is the riskiest.
                 */
                fun networkRiskScore(networkRiskScore: Long?) =
                    networkRiskScore(JsonField.ofNullable(networkRiskScore))

                /**
                 * Alias for [Builder.networkRiskScore].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun networkRiskScore(networkRiskScore: Long) =
                    networkRiskScore(networkRiskScore as Long?)

                /**
                 * Alias for calling [Builder.networkRiskScore] with
                 * `networkRiskScore.orElse(null)`.
                 */
                fun networkRiskScore(networkRiskScore: Optional<Long>) =
                    networkRiskScore(networkRiskScore.getOrNull())

                /**
                 * Sets [Builder.networkRiskScore] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.networkRiskScore] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun networkRiskScore(networkRiskScore: JsonField<Long>) = apply {
                    this.networkRiskScore = networkRiskScore
                }

                /** The identifier of the Pending Transaction associated with this Transaction. */
                fun pendingTransactionId(pendingTransactionId: String?) =
                    pendingTransactionId(JsonField.ofNullable(pendingTransactionId))

                /**
                 * Alias for calling [Builder.pendingTransactionId] with
                 * `pendingTransactionId.orElse(null)`.
                 */
                fun pendingTransactionId(pendingTransactionId: Optional<String>) =
                    pendingTransactionId(pendingTransactionId.getOrNull())

                /**
                 * Sets [Builder.pendingTransactionId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.pendingTransactionId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun pendingTransactionId(pendingTransactionId: JsonField<String>) = apply {
                    this.pendingTransactionId = pendingTransactionId
                }

                /**
                 * If the authorization was made in-person with a physical card, the Physical Card
                 * that was used.
                 */
                fun physicalCardId(physicalCardId: String?) =
                    physicalCardId(JsonField.ofNullable(physicalCardId))

                /**
                 * Alias for calling [Builder.physicalCardId] with `physicalCardId.orElse(null)`.
                 */
                fun physicalCardId(physicalCardId: Optional<String>) =
                    physicalCardId(physicalCardId.getOrNull())

                /**
                 * Sets [Builder.physicalCardId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.physicalCardId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun physicalCardId(physicalCardId: JsonField<String>) = apply {
                    this.physicalCardId = physicalCardId
                }

                /**
                 * The pending amount in the minor unit of the transaction's presentment currency.
                 */
                fun presentmentAmount(presentmentAmount: Long) =
                    presentmentAmount(JsonField.of(presentmentAmount))

                /**
                 * Sets [Builder.presentmentAmount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.presentmentAmount] with a well-typed [Long]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun presentmentAmount(presentmentAmount: JsonField<Long>) = apply {
                    this.presentmentAmount = presentmentAmount
                }

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
                 * presentment currency.
                 */
                fun presentmentCurrency(presentmentCurrency: String) =
                    presentmentCurrency(JsonField.of(presentmentCurrency))

                /**
                 * Sets [Builder.presentmentCurrency] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.presentmentCurrency] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun presentmentCurrency(presentmentCurrency: JsonField<String>) = apply {
                    this.presentmentCurrency = presentmentCurrency
                }

                /**
                 * The processing category describes the intent behind the authorization, such as
                 * whether it was used for bill payments or an automatic fuel dispenser.
                 */
                fun processingCategory(processingCategory: ProcessingCategory) =
                    processingCategory(JsonField.of(processingCategory))

                /**
                 * Sets [Builder.processingCategory] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.processingCategory] with a well-typed
                 * [ProcessingCategory] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun processingCategory(processingCategory: JsonField<ProcessingCategory>) = apply {
                    this.processingCategory = processingCategory
                }

                /**
                 * The identifier of the Real-Time Decision sent to approve or decline this
                 * transaction.
                 */
                fun realTimeDecisionId(realTimeDecisionId: String?) =
                    realTimeDecisionId(JsonField.ofNullable(realTimeDecisionId))

                /**
                 * Alias for calling [Builder.realTimeDecisionId] with
                 * `realTimeDecisionId.orElse(null)`.
                 */
                fun realTimeDecisionId(realTimeDecisionId: Optional<String>) =
                    realTimeDecisionId(realTimeDecisionId.getOrNull())

                /**
                 * Sets [Builder.realTimeDecisionId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.realTimeDecisionId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun realTimeDecisionId(realTimeDecisionId: JsonField<String>) = apply {
                    this.realTimeDecisionId = realTimeDecisionId
                }

                /**
                 * The terminal identifier (commonly abbreviated as TID) of the terminal the card is
                 * transacting with.
                 */
                fun terminalId(terminalId: String?) = terminalId(JsonField.ofNullable(terminalId))

                /** Alias for calling [Builder.terminalId] with `terminalId.orElse(null)`. */
                fun terminalId(terminalId: Optional<String>) = terminalId(terminalId.getOrNull())

                /**
                 * Sets [Builder.terminalId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.terminalId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun terminalId(terminalId: JsonField<String>) = apply {
                    this.terminalId = terminalId
                }

                /**
                 * A constant representing the object's type. For this resource it will always be
                 * `card_authorization`.
                 */
                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

                /** Fields related to verification of cardholder-provided values. */
                fun verification(verification: Verification) =
                    verification(JsonField.of(verification))

                /**
                 * Sets [Builder.verification] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.verification] with a well-typed [Verification]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun verification(verification: JsonField<Verification>) = apply {
                    this.verification = verification
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
                 * Returns an immutable instance of [CardAuthorization].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .actioner()
                 * .amount()
                 * .cardPaymentId()
                 * .currency()
                 * .digitalWalletTokenId()
                 * .direction()
                 * .expiresAt()
                 * .merchantAcceptorId()
                 * .merchantCategoryCode()
                 * .merchantCity()
                 * .merchantCountry()
                 * .merchantDescriptor()
                 * .merchantPostalCode()
                 * .merchantState()
                 * .networkDetails()
                 * .networkIdentifiers()
                 * .networkRiskScore()
                 * .pendingTransactionId()
                 * .physicalCardId()
                 * .presentmentAmount()
                 * .presentmentCurrency()
                 * .processingCategory()
                 * .realTimeDecisionId()
                 * .terminalId()
                 * .type()
                 * .verification()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): CardAuthorization =
                    CardAuthorization(
                        checkRequired("id", id),
                        checkRequired("actioner", actioner),
                        checkRequired("amount", amount),
                        checkRequired("cardPaymentId", cardPaymentId),
                        checkRequired("currency", currency),
                        checkRequired("digitalWalletTokenId", digitalWalletTokenId),
                        checkRequired("direction", direction),
                        checkRequired("expiresAt", expiresAt),
                        checkRequired("merchantAcceptorId", merchantAcceptorId),
                        checkRequired("merchantCategoryCode", merchantCategoryCode),
                        checkRequired("merchantCity", merchantCity),
                        checkRequired("merchantCountry", merchantCountry),
                        checkRequired("merchantDescriptor", merchantDescriptor),
                        checkRequired("merchantPostalCode", merchantPostalCode),
                        checkRequired("merchantState", merchantState),
                        checkRequired("networkDetails", networkDetails),
                        checkRequired("networkIdentifiers", networkIdentifiers),
                        checkRequired("networkRiskScore", networkRiskScore),
                        checkRequired("pendingTransactionId", pendingTransactionId),
                        checkRequired("physicalCardId", physicalCardId),
                        checkRequired("presentmentAmount", presentmentAmount),
                        checkRequired("presentmentCurrency", presentmentCurrency),
                        checkRequired("processingCategory", processingCategory),
                        checkRequired("realTimeDecisionId", realTimeDecisionId),
                        checkRequired("terminalId", terminalId),
                        checkRequired("type", type),
                        checkRequired("verification", verification),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): CardAuthorization = apply {
                if (validated) {
                    return@apply
                }

                id()
                actioner().validate()
                amount()
                cardPaymentId()
                currency().validate()
                digitalWalletTokenId()
                direction().validate()
                expiresAt()
                merchantAcceptorId()
                merchantCategoryCode()
                merchantCity()
                merchantCountry()
                merchantDescriptor()
                merchantPostalCode()
                merchantState()
                networkDetails().validate()
                networkIdentifiers().validate()
                networkRiskScore()
                pendingTransactionId()
                physicalCardId()
                presentmentAmount()
                presentmentCurrency()
                processingCategory().validate()
                realTimeDecisionId()
                terminalId()
                type().validate()
                verification().validate()
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
                (if (id.asKnown().isPresent) 1 else 0) +
                    (actioner.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (amount.asKnown().isPresent) 1 else 0) +
                    (if (cardPaymentId.asKnown().isPresent) 1 else 0) +
                    (currency.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (digitalWalletTokenId.asKnown().isPresent) 1 else 0) +
                    (direction.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (expiresAt.asKnown().isPresent) 1 else 0) +
                    (if (merchantAcceptorId.asKnown().isPresent) 1 else 0) +
                    (if (merchantCategoryCode.asKnown().isPresent) 1 else 0) +
                    (if (merchantCity.asKnown().isPresent) 1 else 0) +
                    (if (merchantCountry.asKnown().isPresent) 1 else 0) +
                    (if (merchantDescriptor.asKnown().isPresent) 1 else 0) +
                    (if (merchantPostalCode.asKnown().isPresent) 1 else 0) +
                    (if (merchantState.asKnown().isPresent) 1 else 0) +
                    (networkDetails.asKnown().getOrNull()?.validity() ?: 0) +
                    (networkIdentifiers.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (networkRiskScore.asKnown().isPresent) 1 else 0) +
                    (if (pendingTransactionId.asKnown().isPresent) 1 else 0) +
                    (if (physicalCardId.asKnown().isPresent) 1 else 0) +
                    (if (presentmentAmount.asKnown().isPresent) 1 else 0) +
                    (if (presentmentCurrency.asKnown().isPresent) 1 else 0) +
                    (processingCategory.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (realTimeDecisionId.asKnown().isPresent) 1 else 0) +
                    (if (terminalId.asKnown().isPresent) 1 else 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0) +
                    (verification.asKnown().getOrNull()?.validity() ?: 0)

            /**
             * Whether this authorization was approved by Increase, the card network through
             * stand-in processing, or the user through a real-time decision.
             */
            class Actioner @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

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

                    /** This object was actioned by the user through a real-time decision. */
                    @JvmField val USER = of("user")

                    /** This object was actioned by Increase without user intervention. */
                    @JvmField val INCREASE = of("increase")

                    /** This object was actioned by the network, through stand-in processing. */
                    @JvmField val NETWORK = of("network")

                    @JvmStatic fun of(value: String) = Actioner(JsonField.of(value))
                }

                /** An enum containing [Actioner]'s known values. */
                enum class Known {
                    /** This object was actioned by the user through a real-time decision. */
                    USER,
                    /** This object was actioned by Increase without user intervention. */
                    INCREASE,
                    /** This object was actioned by the network, through stand-in processing. */
                    NETWORK,
                }

                /**
                 * An enum containing [Actioner]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Actioner] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    /** This object was actioned by the user through a real-time decision. */
                    USER,
                    /** This object was actioned by Increase without user intervention. */
                    INCREASE,
                    /** This object was actioned by the network, through stand-in processing. */
                    NETWORK,
                    /**
                     * An enum member indicating that [Actioner] was instantiated with an unknown
                     * value.
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
                        USER -> Value.USER
                        INCREASE -> Value.INCREASE
                        NETWORK -> Value.NETWORK
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
                        USER -> Known.USER
                        INCREASE -> Known.INCREASE
                        NETWORK -> Known.NETWORK
                        else -> throw IncreaseInvalidDataException("Unknown Actioner: $value")
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

                fun validate(): Actioner = apply {
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

                    return /* spotless:off */ other is Actioner && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
             * currency.
             */
            class Currency @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

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
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
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
                    /**
                     * An enum member indicating that [Currency] was instantiated with an unknown
                     * value.
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
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws IncreaseInvalidDataException if this class instance's value is a not a
                 *   known member.
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

                    return /* spotless:off */ other is Currency && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /**
             * The direction describes the direction the funds will move, either from the cardholder
             * to the merchant or from the merchant to the cardholder.
             */
            class Direction @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

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

                    /** A regular card authorization where funds are debited from the cardholder. */
                    @JvmField val SETTLEMENT = of("settlement")

                    /**
                     * A refund card authorization, sometimes referred to as a credit voucher
                     * authorization, where funds are credited to the cardholder.
                     */
                    @JvmField val REFUND = of("refund")

                    @JvmStatic fun of(value: String) = Direction(JsonField.of(value))
                }

                /** An enum containing [Direction]'s known values. */
                enum class Known {
                    /** A regular card authorization where funds are debited from the cardholder. */
                    SETTLEMENT,
                    /**
                     * A refund card authorization, sometimes referred to as a credit voucher
                     * authorization, where funds are credited to the cardholder.
                     */
                    REFUND,
                }

                /**
                 * An enum containing [Direction]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Direction] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    /** A regular card authorization where funds are debited from the cardholder. */
                    SETTLEMENT,
                    /**
                     * A refund card authorization, sometimes referred to as a credit voucher
                     * authorization, where funds are credited to the cardholder.
                     */
                    REFUND,
                    /**
                     * An enum member indicating that [Direction] was instantiated with an unknown
                     * value.
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
                        SETTLEMENT -> Value.SETTLEMENT
                        REFUND -> Value.REFUND
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
                        SETTLEMENT -> Known.SETTLEMENT
                        REFUND -> Known.REFUND
                        else -> throw IncreaseInvalidDataException("Unknown Direction: $value")
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

                fun validate(): Direction = apply {
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

                    return /* spotless:off */ other is Direction && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** Fields specific to the `network`. */
            class NetworkDetails
            private constructor(
                private val category: JsonField<Category>,
                private val visa: JsonField<Visa>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("category")
                    @ExcludeMissing
                    category: JsonField<Category> = JsonMissing.of(),
                    @JsonProperty("visa") @ExcludeMissing visa: JsonField<Visa> = JsonMissing.of(),
                ) : this(category, visa, mutableMapOf())

                /**
                 * The payment network used to process this card authorization.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun category(): Category = category.getRequired("category")

                /**
                 * Fields specific to the `visa` network.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun visa(): Optional<Visa> = visa.getOptional("visa")

                /**
                 * Returns the raw JSON value of [category].
                 *
                 * Unlike [category], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("category")
                @ExcludeMissing
                fun _category(): JsonField<Category> = category

                /**
                 * Returns the raw JSON value of [visa].
                 *
                 * Unlike [visa], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("visa") @ExcludeMissing fun _visa(): JsonField<Visa> = visa

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
                     * Returns a mutable builder for constructing an instance of [NetworkDetails].
                     *
                     * The following fields are required:
                     * ```java
                     * .category()
                     * .visa()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [NetworkDetails]. */
                class Builder internal constructor() {

                    private var category: JsonField<Category>? = null
                    private var visa: JsonField<Visa>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(networkDetails: NetworkDetails) = apply {
                        category = networkDetails.category
                        visa = networkDetails.visa
                        additionalProperties = networkDetails.additionalProperties.toMutableMap()
                    }

                    /** The payment network used to process this card authorization. */
                    fun category(category: Category) = category(JsonField.of(category))

                    /**
                     * Sets [Builder.category] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.category] with a well-typed [Category] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun category(category: JsonField<Category>) = apply { this.category = category }

                    /** Fields specific to the `visa` network. */
                    fun visa(visa: Visa?) = visa(JsonField.ofNullable(visa))

                    /** Alias for calling [Builder.visa] with `visa.orElse(null)`. */
                    fun visa(visa: Optional<Visa>) = visa(visa.getOrNull())

                    /**
                     * Sets [Builder.visa] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.visa] with a well-typed [Visa] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun visa(visa: JsonField<Visa>) = apply { this.visa = visa }

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
                     * Returns an immutable instance of [NetworkDetails].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .category()
                     * .visa()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): NetworkDetails =
                        NetworkDetails(
                            checkRequired("category", category),
                            checkRequired("visa", visa),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): NetworkDetails = apply {
                    if (validated) {
                        return@apply
                    }

                    category().validate()
                    visa().ifPresent { it.validate() }
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
                        (visa.asKnown().getOrNull()?.validity() ?: 0)

                /** The payment network used to process this card authorization. */
                class Category
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        /** Visa */
                        @JvmField val VISA = of("visa")

                        @JvmStatic fun of(value: String) = Category(JsonField.of(value))
                    }

                    /** An enum containing [Category]'s known values. */
                    enum class Known {
                        /** Visa */
                        VISA
                    }

                    /**
                     * An enum containing [Category]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [Category] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        /** Visa */
                        VISA,
                        /**
                         * An enum member indicating that [Category] was instantiated with an
                         * unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            VISA -> Value.VISA
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws IncreaseInvalidDataException if this class instance's value is a not
                     *   a known member.
                     */
                    fun known(): Known =
                        when (this) {
                            VISA -> Known.VISA
                            else -> throw IncreaseInvalidDataException("Unknown Category: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws IncreaseInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Category && value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                /** Fields specific to the `visa` network. */
                class Visa
                private constructor(
                    private val electronicCommerceIndicator: JsonField<ElectronicCommerceIndicator>,
                    private val pointOfServiceEntryMode: JsonField<PointOfServiceEntryMode>,
                    private val standInProcessingReason: JsonField<StandInProcessingReason>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("electronic_commerce_indicator")
                        @ExcludeMissing
                        electronicCommerceIndicator: JsonField<ElectronicCommerceIndicator> =
                            JsonMissing.of(),
                        @JsonProperty("point_of_service_entry_mode")
                        @ExcludeMissing
                        pointOfServiceEntryMode: JsonField<PointOfServiceEntryMode> =
                            JsonMissing.of(),
                        @JsonProperty("stand_in_processing_reason")
                        @ExcludeMissing
                        standInProcessingReason: JsonField<StandInProcessingReason> =
                            JsonMissing.of(),
                    ) : this(
                        electronicCommerceIndicator,
                        pointOfServiceEntryMode,
                        standInProcessingReason,
                        mutableMapOf(),
                    )

                    /**
                     * For electronic commerce transactions, this identifies the level of security
                     * used in obtaining the customer's payment credential. For mail or telephone
                     * order transactions, identifies the type of mail or telephone order.
                     *
                     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun electronicCommerceIndicator(): Optional<ElectronicCommerceIndicator> =
                        electronicCommerceIndicator.getOptional("electronic_commerce_indicator")

                    /**
                     * The method used to enter the cardholder's primary account number and card
                     * expiration date.
                     *
                     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun pointOfServiceEntryMode(): Optional<PointOfServiceEntryMode> =
                        pointOfServiceEntryMode.getOptional("point_of_service_entry_mode")

                    /**
                     * Only present when `actioner: network`. Describes why a card authorization was
                     * approved or declined by Visa through stand-in processing.
                     *
                     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun standInProcessingReason(): Optional<StandInProcessingReason> =
                        standInProcessingReason.getOptional("stand_in_processing_reason")

                    /**
                     * Returns the raw JSON value of [electronicCommerceIndicator].
                     *
                     * Unlike [electronicCommerceIndicator], this method doesn't throw if the JSON
                     * field has an unexpected type.
                     */
                    @JsonProperty("electronic_commerce_indicator")
                    @ExcludeMissing
                    fun _electronicCommerceIndicator(): JsonField<ElectronicCommerceIndicator> =
                        electronicCommerceIndicator

                    /**
                     * Returns the raw JSON value of [pointOfServiceEntryMode].
                     *
                     * Unlike [pointOfServiceEntryMode], this method doesn't throw if the JSON field
                     * has an unexpected type.
                     */
                    @JsonProperty("point_of_service_entry_mode")
                    @ExcludeMissing
                    fun _pointOfServiceEntryMode(): JsonField<PointOfServiceEntryMode> =
                        pointOfServiceEntryMode

                    /**
                     * Returns the raw JSON value of [standInProcessingReason].
                     *
                     * Unlike [standInProcessingReason], this method doesn't throw if the JSON field
                     * has an unexpected type.
                     */
                    @JsonProperty("stand_in_processing_reason")
                    @ExcludeMissing
                    fun _standInProcessingReason(): JsonField<StandInProcessingReason> =
                        standInProcessingReason

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
                         * Returns a mutable builder for constructing an instance of [Visa].
                         *
                         * The following fields are required:
                         * ```java
                         * .electronicCommerceIndicator()
                         * .pointOfServiceEntryMode()
                         * .standInProcessingReason()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Visa]. */
                    class Builder internal constructor() {

                        private var electronicCommerceIndicator:
                            JsonField<ElectronicCommerceIndicator>? =
                            null
                        private var pointOfServiceEntryMode: JsonField<PointOfServiceEntryMode>? =
                            null
                        private var standInProcessingReason: JsonField<StandInProcessingReason>? =
                            null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(visa: Visa) = apply {
                            electronicCommerceIndicator = visa.electronicCommerceIndicator
                            pointOfServiceEntryMode = visa.pointOfServiceEntryMode
                            standInProcessingReason = visa.standInProcessingReason
                            additionalProperties = visa.additionalProperties.toMutableMap()
                        }

                        /**
                         * For electronic commerce transactions, this identifies the level of
                         * security used in obtaining the customer's payment credential. For mail or
                         * telephone order transactions, identifies the type of mail or telephone
                         * order.
                         */
                        fun electronicCommerceIndicator(
                            electronicCommerceIndicator: ElectronicCommerceIndicator?
                        ) =
                            electronicCommerceIndicator(
                                JsonField.ofNullable(electronicCommerceIndicator)
                            )

                        /**
                         * Alias for calling [Builder.electronicCommerceIndicator] with
                         * `electronicCommerceIndicator.orElse(null)`.
                         */
                        fun electronicCommerceIndicator(
                            electronicCommerceIndicator: Optional<ElectronicCommerceIndicator>
                        ) = electronicCommerceIndicator(electronicCommerceIndicator.getOrNull())

                        /**
                         * Sets [Builder.electronicCommerceIndicator] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.electronicCommerceIndicator] with a
                         * well-typed [ElectronicCommerceIndicator] value instead. This method is
                         * primarily for setting the field to an undocumented or not yet supported
                         * value.
                         */
                        fun electronicCommerceIndicator(
                            electronicCommerceIndicator: JsonField<ElectronicCommerceIndicator>
                        ) = apply { this.electronicCommerceIndicator = electronicCommerceIndicator }

                        /**
                         * The method used to enter the cardholder's primary account number and card
                         * expiration date.
                         */
                        fun pointOfServiceEntryMode(
                            pointOfServiceEntryMode: PointOfServiceEntryMode?
                        ) = pointOfServiceEntryMode(JsonField.ofNullable(pointOfServiceEntryMode))

                        /**
                         * Alias for calling [Builder.pointOfServiceEntryMode] with
                         * `pointOfServiceEntryMode.orElse(null)`.
                         */
                        fun pointOfServiceEntryMode(
                            pointOfServiceEntryMode: Optional<PointOfServiceEntryMode>
                        ) = pointOfServiceEntryMode(pointOfServiceEntryMode.getOrNull())

                        /**
                         * Sets [Builder.pointOfServiceEntryMode] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.pointOfServiceEntryMode] with a
                         * well-typed [PointOfServiceEntryMode] value instead. This method is
                         * primarily for setting the field to an undocumented or not yet supported
                         * value.
                         */
                        fun pointOfServiceEntryMode(
                            pointOfServiceEntryMode: JsonField<PointOfServiceEntryMode>
                        ) = apply { this.pointOfServiceEntryMode = pointOfServiceEntryMode }

                        /**
                         * Only present when `actioner: network`. Describes why a card authorization
                         * was approved or declined by Visa through stand-in processing.
                         */
                        fun standInProcessingReason(
                            standInProcessingReason: StandInProcessingReason?
                        ) = standInProcessingReason(JsonField.ofNullable(standInProcessingReason))

                        /**
                         * Alias for calling [Builder.standInProcessingReason] with
                         * `standInProcessingReason.orElse(null)`.
                         */
                        fun standInProcessingReason(
                            standInProcessingReason: Optional<StandInProcessingReason>
                        ) = standInProcessingReason(standInProcessingReason.getOrNull())

                        /**
                         * Sets [Builder.standInProcessingReason] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.standInProcessingReason] with a
                         * well-typed [StandInProcessingReason] value instead. This method is
                         * primarily for setting the field to an undocumented or not yet supported
                         * value.
                         */
                        fun standInProcessingReason(
                            standInProcessingReason: JsonField<StandInProcessingReason>
                        ) = apply { this.standInProcessingReason = standInProcessingReason }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Visa].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .electronicCommerceIndicator()
                         * .pointOfServiceEntryMode()
                         * .standInProcessingReason()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): Visa =
                            Visa(
                                checkRequired(
                                    "electronicCommerceIndicator",
                                    electronicCommerceIndicator,
                                ),
                                checkRequired("pointOfServiceEntryMode", pointOfServiceEntryMode),
                                checkRequired("standInProcessingReason", standInProcessingReason),
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): Visa = apply {
                        if (validated) {
                            return@apply
                        }

                        electronicCommerceIndicator().ifPresent { it.validate() }
                        pointOfServiceEntryMode().ifPresent { it.validate() }
                        standInProcessingReason().ifPresent { it.validate() }
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
                        (electronicCommerceIndicator.asKnown().getOrNull()?.validity() ?: 0) +
                            (pointOfServiceEntryMode.asKnown().getOrNull()?.validity() ?: 0) +
                            (standInProcessingReason.asKnown().getOrNull()?.validity() ?: 0)

                    /**
                     * For electronic commerce transactions, this identifies the level of security
                     * used in obtaining the customer's payment credential. For mail or telephone
                     * order transactions, identifies the type of mail or telephone order.
                     */
                    class ElectronicCommerceIndicator
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            /**
                             * Single transaction of a mail/phone order: Use to indicate that the
                             * transaction is a mail/phone order purchase, not a recurring
                             * transaction or installment payment. For domestic transactions in the
                             * US region, this value may also indicate one bill payment transaction
                             * in the card-present or card-absent environments.
                             */
                            @JvmField val MAIL_PHONE_ORDER = of("mail_phone_order")

                            /**
                             * Recurring transaction: Payment indicator used to indicate a recurring
                             * transaction that originates from an acquirer in the US region.
                             */
                            @JvmField val RECURRING = of("recurring")

                            /**
                             * Installment payment: Payment indicator used to indicate one purchase
                             * of goods or services that is billed to the account in multiple
                             * charges over a period of time agreed upon by the cardholder and
                             * merchant from transactions that originate from an acquirer in the US
                             * region.
                             */
                            @JvmField val INSTALLMENT = of("installment")

                            /**
                             * Unknown classification: other mail order: Use to indicate that the
                             * type of mail/telephone order is unknown.
                             */
                            @JvmField val UNKNOWN_MAIL_PHONE_ORDER = of("unknown_mail_phone_order")

                            /**
                             * Secure electronic commerce transaction: Use to indicate that the
                             * electronic commerce transaction has been authenticated using e.g.,
                             * 3-D Secure
                             */
                            @JvmField
                            val SECURE_ELECTRONIC_COMMERCE = of("secure_electronic_commerce")

                            /**
                             * Non-authenticated security transaction at a 3-D Secure-capable
                             * merchant, and merchant attempted to authenticate the cardholder using
                             * 3-D Secure: Use to identify an electronic commerce transaction where
                             * the merchant attempted to authenticate the cardholder using 3-D
                             * Secure, but was unable to complete the authentication because the
                             * issuer or cardholder does not participate in the 3-D Secure program.
                             */
                            @JvmField
                            val NON_AUTHENTICATED_SECURITY_TRANSACTION_AT_3DS_CAPABLE_MERCHANT =
                                of("non_authenticated_security_transaction_at_3ds_capable_merchant")

                            /**
                             * Non-authenticated security transaction: Use to identify an electronic
                             * commerce transaction that uses data encryption for security however ,
                             * cardholder authentication is not performed using 3-D Secure.
                             */
                            @JvmField
                            val NON_AUTHENTICATED_SECURITY_TRANSACTION =
                                of("non_authenticated_security_transaction")

                            /**
                             * Non-secure transaction: Use to identify an electronic commerce
                             * transaction that has no data protection.
                             */
                            @JvmField val NON_SECURE_TRANSACTION = of("non_secure_transaction")

                            @JvmStatic
                            fun of(value: String) = ElectronicCommerceIndicator(JsonField.of(value))
                        }

                        /** An enum containing [ElectronicCommerceIndicator]'s known values. */
                        enum class Known {
                            /**
                             * Single transaction of a mail/phone order: Use to indicate that the
                             * transaction is a mail/phone order purchase, not a recurring
                             * transaction or installment payment. For domestic transactions in the
                             * US region, this value may also indicate one bill payment transaction
                             * in the card-present or card-absent environments.
                             */
                            MAIL_PHONE_ORDER,
                            /**
                             * Recurring transaction: Payment indicator used to indicate a recurring
                             * transaction that originates from an acquirer in the US region.
                             */
                            RECURRING,
                            /**
                             * Installment payment: Payment indicator used to indicate one purchase
                             * of goods or services that is billed to the account in multiple
                             * charges over a period of time agreed upon by the cardholder and
                             * merchant from transactions that originate from an acquirer in the US
                             * region.
                             */
                            INSTALLMENT,
                            /**
                             * Unknown classification: other mail order: Use to indicate that the
                             * type of mail/telephone order is unknown.
                             */
                            UNKNOWN_MAIL_PHONE_ORDER,
                            /**
                             * Secure electronic commerce transaction: Use to indicate that the
                             * electronic commerce transaction has been authenticated using e.g.,
                             * 3-D Secure
                             */
                            SECURE_ELECTRONIC_COMMERCE,
                            /**
                             * Non-authenticated security transaction at a 3-D Secure-capable
                             * merchant, and merchant attempted to authenticate the cardholder using
                             * 3-D Secure: Use to identify an electronic commerce transaction where
                             * the merchant attempted to authenticate the cardholder using 3-D
                             * Secure, but was unable to complete the authentication because the
                             * issuer or cardholder does not participate in the 3-D Secure program.
                             */
                            NON_AUTHENTICATED_SECURITY_TRANSACTION_AT_3DS_CAPABLE_MERCHANT,
                            /**
                             * Non-authenticated security transaction: Use to identify an electronic
                             * commerce transaction that uses data encryption for security however ,
                             * cardholder authentication is not performed using 3-D Secure.
                             */
                            NON_AUTHENTICATED_SECURITY_TRANSACTION,
                            /**
                             * Non-secure transaction: Use to identify an electronic commerce
                             * transaction that has no data protection.
                             */
                            NON_SECURE_TRANSACTION,
                        }

                        /**
                         * An enum containing [ElectronicCommerceIndicator]'s known values, as well
                         * as an [_UNKNOWN] member.
                         *
                         * An instance of [ElectronicCommerceIndicator] can contain an unknown value
                         * in a couple of cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            /**
                             * Single transaction of a mail/phone order: Use to indicate that the
                             * transaction is a mail/phone order purchase, not a recurring
                             * transaction or installment payment. For domestic transactions in the
                             * US region, this value may also indicate one bill payment transaction
                             * in the card-present or card-absent environments.
                             */
                            MAIL_PHONE_ORDER,
                            /**
                             * Recurring transaction: Payment indicator used to indicate a recurring
                             * transaction that originates from an acquirer in the US region.
                             */
                            RECURRING,
                            /**
                             * Installment payment: Payment indicator used to indicate one purchase
                             * of goods or services that is billed to the account in multiple
                             * charges over a period of time agreed upon by the cardholder and
                             * merchant from transactions that originate from an acquirer in the US
                             * region.
                             */
                            INSTALLMENT,
                            /**
                             * Unknown classification: other mail order: Use to indicate that the
                             * type of mail/telephone order is unknown.
                             */
                            UNKNOWN_MAIL_PHONE_ORDER,
                            /**
                             * Secure electronic commerce transaction: Use to indicate that the
                             * electronic commerce transaction has been authenticated using e.g.,
                             * 3-D Secure
                             */
                            SECURE_ELECTRONIC_COMMERCE,
                            /**
                             * Non-authenticated security transaction at a 3-D Secure-capable
                             * merchant, and merchant attempted to authenticate the cardholder using
                             * 3-D Secure: Use to identify an electronic commerce transaction where
                             * the merchant attempted to authenticate the cardholder using 3-D
                             * Secure, but was unable to complete the authentication because the
                             * issuer or cardholder does not participate in the 3-D Secure program.
                             */
                            NON_AUTHENTICATED_SECURITY_TRANSACTION_AT_3DS_CAPABLE_MERCHANT,
                            /**
                             * Non-authenticated security transaction: Use to identify an electronic
                             * commerce transaction that uses data encryption for security however ,
                             * cardholder authentication is not performed using 3-D Secure.
                             */
                            NON_AUTHENTICATED_SECURITY_TRANSACTION,
                            /**
                             * Non-secure transaction: Use to identify an electronic commerce
                             * transaction that has no data protection.
                             */
                            NON_SECURE_TRANSACTION,
                            /**
                             * An enum member indicating that [ElectronicCommerceIndicator] was
                             * instantiated with an unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                MAIL_PHONE_ORDER -> Value.MAIL_PHONE_ORDER
                                RECURRING -> Value.RECURRING
                                INSTALLMENT -> Value.INSTALLMENT
                                UNKNOWN_MAIL_PHONE_ORDER -> Value.UNKNOWN_MAIL_PHONE_ORDER
                                SECURE_ELECTRONIC_COMMERCE -> Value.SECURE_ELECTRONIC_COMMERCE
                                NON_AUTHENTICATED_SECURITY_TRANSACTION_AT_3DS_CAPABLE_MERCHANT ->
                                    Value
                                        .NON_AUTHENTICATED_SECURITY_TRANSACTION_AT_3DS_CAPABLE_MERCHANT
                                NON_AUTHENTICATED_SECURITY_TRANSACTION ->
                                    Value.NON_AUTHENTICATED_SECURITY_TRANSACTION
                                NON_SECURE_TRANSACTION -> Value.NON_SECURE_TRANSACTION
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws IncreaseInvalidDataException if this class instance's value is a
                         *   not a known member.
                         */
                        fun known(): Known =
                            when (this) {
                                MAIL_PHONE_ORDER -> Known.MAIL_PHONE_ORDER
                                RECURRING -> Known.RECURRING
                                INSTALLMENT -> Known.INSTALLMENT
                                UNKNOWN_MAIL_PHONE_ORDER -> Known.UNKNOWN_MAIL_PHONE_ORDER
                                SECURE_ELECTRONIC_COMMERCE -> Known.SECURE_ELECTRONIC_COMMERCE
                                NON_AUTHENTICATED_SECURITY_TRANSACTION_AT_3DS_CAPABLE_MERCHANT ->
                                    Known
                                        .NON_AUTHENTICATED_SECURITY_TRANSACTION_AT_3DS_CAPABLE_MERCHANT
                                NON_AUTHENTICATED_SECURITY_TRANSACTION ->
                                    Known.NON_AUTHENTICATED_SECURITY_TRANSACTION
                                NON_SECURE_TRANSACTION -> Known.NON_SECURE_TRANSACTION
                                else ->
                                    throw IncreaseInvalidDataException(
                                        "Unknown ElectronicCommerceIndicator: $value"
                                    )
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws IncreaseInvalidDataException if this class instance's value does
                         *   not have the expected primitive type.
                         */
                        fun asString(): String =
                            _value().asString().orElseThrow {
                                IncreaseInvalidDataException("Value is not a String")
                            }

                        private var validated: Boolean = false

                        fun validate(): ElectronicCommerceIndicator = apply {
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is ElectronicCommerceIndicator && value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    /**
                     * The method used to enter the cardholder's primary account number and card
                     * expiration date.
                     */
                    class PointOfServiceEntryMode
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            /** Unknown */
                            @JvmField val UNKNOWN = of("unknown")

                            /** Manual key entry */
                            @JvmField val MANUAL = of("manual")

                            /** Magnetic stripe read, without card verification value */
                            @JvmField val MAGNETIC_STRIPE_NO_CVV = of("magnetic_stripe_no_cvv")

                            /** Optical code */
                            @JvmField val OPTICAL_CODE = of("optical_code")

                            /** Contact chip card */
                            @JvmField val INTEGRATED_CIRCUIT_CARD = of("integrated_circuit_card")

                            /** Contactless read of chip card */
                            @JvmField val CONTACTLESS = of("contactless")

                            /**
                             * Transaction initiated using a credential that has previously been
                             * stored on file
                             */
                            @JvmField val CREDENTIAL_ON_FILE = of("credential_on_file")

                            /** Magnetic stripe read */
                            @JvmField val MAGNETIC_STRIPE = of("magnetic_stripe")

                            /** Contactless read of magnetic stripe data */
                            @JvmField
                            val CONTACTLESS_MAGNETIC_STRIPE = of("contactless_magnetic_stripe")

                            /** Contact chip card, without card verification value */
                            @JvmField
                            val INTEGRATED_CIRCUIT_CARD_NO_CVV =
                                of("integrated_circuit_card_no_cvv")

                            @JvmStatic
                            fun of(value: String) = PointOfServiceEntryMode(JsonField.of(value))
                        }

                        /** An enum containing [PointOfServiceEntryMode]'s known values. */
                        enum class Known {
                            /** Unknown */
                            UNKNOWN,
                            /** Manual key entry */
                            MANUAL,
                            /** Magnetic stripe read, without card verification value */
                            MAGNETIC_STRIPE_NO_CVV,
                            /** Optical code */
                            OPTICAL_CODE,
                            /** Contact chip card */
                            INTEGRATED_CIRCUIT_CARD,
                            /** Contactless read of chip card */
                            CONTACTLESS,
                            /**
                             * Transaction initiated using a credential that has previously been
                             * stored on file
                             */
                            CREDENTIAL_ON_FILE,
                            /** Magnetic stripe read */
                            MAGNETIC_STRIPE,
                            /** Contactless read of magnetic stripe data */
                            CONTACTLESS_MAGNETIC_STRIPE,
                            /** Contact chip card, without card verification value */
                            INTEGRATED_CIRCUIT_CARD_NO_CVV,
                        }

                        /**
                         * An enum containing [PointOfServiceEntryMode]'s known values, as well as
                         * an [_UNKNOWN] member.
                         *
                         * An instance of [PointOfServiceEntryMode] can contain an unknown value in
                         * a couple of cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            /** Unknown */
                            UNKNOWN,
                            /** Manual key entry */
                            MANUAL,
                            /** Magnetic stripe read, without card verification value */
                            MAGNETIC_STRIPE_NO_CVV,
                            /** Optical code */
                            OPTICAL_CODE,
                            /** Contact chip card */
                            INTEGRATED_CIRCUIT_CARD,
                            /** Contactless read of chip card */
                            CONTACTLESS,
                            /**
                             * Transaction initiated using a credential that has previously been
                             * stored on file
                             */
                            CREDENTIAL_ON_FILE,
                            /** Magnetic stripe read */
                            MAGNETIC_STRIPE,
                            /** Contactless read of magnetic stripe data */
                            CONTACTLESS_MAGNETIC_STRIPE,
                            /** Contact chip card, without card verification value */
                            INTEGRATED_CIRCUIT_CARD_NO_CVV,
                            /**
                             * An enum member indicating that [PointOfServiceEntryMode] was
                             * instantiated with an unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                UNKNOWN -> Value.UNKNOWN
                                MANUAL -> Value.MANUAL
                                MAGNETIC_STRIPE_NO_CVV -> Value.MAGNETIC_STRIPE_NO_CVV
                                OPTICAL_CODE -> Value.OPTICAL_CODE
                                INTEGRATED_CIRCUIT_CARD -> Value.INTEGRATED_CIRCUIT_CARD
                                CONTACTLESS -> Value.CONTACTLESS
                                CREDENTIAL_ON_FILE -> Value.CREDENTIAL_ON_FILE
                                MAGNETIC_STRIPE -> Value.MAGNETIC_STRIPE
                                CONTACTLESS_MAGNETIC_STRIPE -> Value.CONTACTLESS_MAGNETIC_STRIPE
                                INTEGRATED_CIRCUIT_CARD_NO_CVV ->
                                    Value.INTEGRATED_CIRCUIT_CARD_NO_CVV
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws IncreaseInvalidDataException if this class instance's value is a
                         *   not a known member.
                         */
                        fun known(): Known =
                            when (this) {
                                UNKNOWN -> Known.UNKNOWN
                                MANUAL -> Known.MANUAL
                                MAGNETIC_STRIPE_NO_CVV -> Known.MAGNETIC_STRIPE_NO_CVV
                                OPTICAL_CODE -> Known.OPTICAL_CODE
                                INTEGRATED_CIRCUIT_CARD -> Known.INTEGRATED_CIRCUIT_CARD
                                CONTACTLESS -> Known.CONTACTLESS
                                CREDENTIAL_ON_FILE -> Known.CREDENTIAL_ON_FILE
                                MAGNETIC_STRIPE -> Known.MAGNETIC_STRIPE
                                CONTACTLESS_MAGNETIC_STRIPE -> Known.CONTACTLESS_MAGNETIC_STRIPE
                                INTEGRATED_CIRCUIT_CARD_NO_CVV ->
                                    Known.INTEGRATED_CIRCUIT_CARD_NO_CVV
                                else ->
                                    throw IncreaseInvalidDataException(
                                        "Unknown PointOfServiceEntryMode: $value"
                                    )
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws IncreaseInvalidDataException if this class instance's value does
                         *   not have the expected primitive type.
                         */
                        fun asString(): String =
                            _value().asString().orElseThrow {
                                IncreaseInvalidDataException("Value is not a String")
                            }

                        private var validated: Boolean = false

                        fun validate(): PointOfServiceEntryMode = apply {
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is PointOfServiceEntryMode && value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    /**
                     * Only present when `actioner: network`. Describes why a card authorization was
                     * approved or declined by Visa through stand-in processing.
                     */
                    class StandInProcessingReason
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            /** Increase failed to process the authorization in a timely manner. */
                            @JvmField val ISSUER_ERROR = of("issuer_error")

                            /**
                             * The physical card read had an invalid CVV, dCVV, or authorization
                             * request cryptogram.
                             */
                            @JvmField val INVALID_PHYSICAL_CARD = of("invalid_physical_card")

                            /** The 3DS cardholder authentication verification value was invalid. */
                            @JvmField
                            val INVALID_CARDHOLDER_AUTHENTICATION_VERIFICATION_VALUE =
                                of("invalid_cardholder_authentication_verification_value")

                            /**
                             * An internal Visa error occurred. Visa uses this reason code for
                             * certain expected occurrences as well, such as Application Transaction
                             * Counter (ATC) replays.
                             */
                            @JvmField val INTERNAL_VISA_ERROR = of("internal_visa_error")

                            /**
                             * The merchant has enabled Visa's Transaction Advisory Service and
                             * requires further authentication to perform the transaction. In
                             * practice this is often utilized at fuel pumps to tell the cardholder
                             * to see the cashier.
                             */
                            @JvmField
                            val MERCHANT_TRANSACTION_ADVISORY_SERVICE_AUTHENTICATION_REQUIRED =
                                of("merchant_transaction_advisory_service_authentication_required")

                            /**
                             * The transaction was blocked by Visa's Payment Fraud Disruption
                             * service due to fraudulent Acquirer behavior, such as card testing.
                             */
                            @JvmField
                            val PAYMENT_FRAUD_DISRUPTION_ACQUIRER_BLOCK =
                                of("payment_fraud_disruption_acquirer_block")

                            /** An unspecific reason for stand-in processing. */
                            @JvmField val OTHER = of("other")

                            @JvmStatic
                            fun of(value: String) = StandInProcessingReason(JsonField.of(value))
                        }

                        /** An enum containing [StandInProcessingReason]'s known values. */
                        enum class Known {
                            /** Increase failed to process the authorization in a timely manner. */
                            ISSUER_ERROR,
                            /**
                             * The physical card read had an invalid CVV, dCVV, or authorization
                             * request cryptogram.
                             */
                            INVALID_PHYSICAL_CARD,
                            /** The 3DS cardholder authentication verification value was invalid. */
                            INVALID_CARDHOLDER_AUTHENTICATION_VERIFICATION_VALUE,
                            /**
                             * An internal Visa error occurred. Visa uses this reason code for
                             * certain expected occurrences as well, such as Application Transaction
                             * Counter (ATC) replays.
                             */
                            INTERNAL_VISA_ERROR,
                            /**
                             * The merchant has enabled Visa's Transaction Advisory Service and
                             * requires further authentication to perform the transaction. In
                             * practice this is often utilized at fuel pumps to tell the cardholder
                             * to see the cashier.
                             */
                            MERCHANT_TRANSACTION_ADVISORY_SERVICE_AUTHENTICATION_REQUIRED,
                            /**
                             * The transaction was blocked by Visa's Payment Fraud Disruption
                             * service due to fraudulent Acquirer behavior, such as card testing.
                             */
                            PAYMENT_FRAUD_DISRUPTION_ACQUIRER_BLOCK,
                            /** An unspecific reason for stand-in processing. */
                            OTHER,
                        }

                        /**
                         * An enum containing [StandInProcessingReason]'s known values, as well as
                         * an [_UNKNOWN] member.
                         *
                         * An instance of [StandInProcessingReason] can contain an unknown value in
                         * a couple of cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            /** Increase failed to process the authorization in a timely manner. */
                            ISSUER_ERROR,
                            /**
                             * The physical card read had an invalid CVV, dCVV, or authorization
                             * request cryptogram.
                             */
                            INVALID_PHYSICAL_CARD,
                            /** The 3DS cardholder authentication verification value was invalid. */
                            INVALID_CARDHOLDER_AUTHENTICATION_VERIFICATION_VALUE,
                            /**
                             * An internal Visa error occurred. Visa uses this reason code for
                             * certain expected occurrences as well, such as Application Transaction
                             * Counter (ATC) replays.
                             */
                            INTERNAL_VISA_ERROR,
                            /**
                             * The merchant has enabled Visa's Transaction Advisory Service and
                             * requires further authentication to perform the transaction. In
                             * practice this is often utilized at fuel pumps to tell the cardholder
                             * to see the cashier.
                             */
                            MERCHANT_TRANSACTION_ADVISORY_SERVICE_AUTHENTICATION_REQUIRED,
                            /**
                             * The transaction was blocked by Visa's Payment Fraud Disruption
                             * service due to fraudulent Acquirer behavior, such as card testing.
                             */
                            PAYMENT_FRAUD_DISRUPTION_ACQUIRER_BLOCK,
                            /** An unspecific reason for stand-in processing. */
                            OTHER,
                            /**
                             * An enum member indicating that [StandInProcessingReason] was
                             * instantiated with an unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                ISSUER_ERROR -> Value.ISSUER_ERROR
                                INVALID_PHYSICAL_CARD -> Value.INVALID_PHYSICAL_CARD
                                INVALID_CARDHOLDER_AUTHENTICATION_VERIFICATION_VALUE ->
                                    Value.INVALID_CARDHOLDER_AUTHENTICATION_VERIFICATION_VALUE
                                INTERNAL_VISA_ERROR -> Value.INTERNAL_VISA_ERROR
                                MERCHANT_TRANSACTION_ADVISORY_SERVICE_AUTHENTICATION_REQUIRED ->
                                    Value
                                        .MERCHANT_TRANSACTION_ADVISORY_SERVICE_AUTHENTICATION_REQUIRED
                                PAYMENT_FRAUD_DISRUPTION_ACQUIRER_BLOCK ->
                                    Value.PAYMENT_FRAUD_DISRUPTION_ACQUIRER_BLOCK
                                OTHER -> Value.OTHER
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws IncreaseInvalidDataException if this class instance's value is a
                         *   not a known member.
                         */
                        fun known(): Known =
                            when (this) {
                                ISSUER_ERROR -> Known.ISSUER_ERROR
                                INVALID_PHYSICAL_CARD -> Known.INVALID_PHYSICAL_CARD
                                INVALID_CARDHOLDER_AUTHENTICATION_VERIFICATION_VALUE ->
                                    Known.INVALID_CARDHOLDER_AUTHENTICATION_VERIFICATION_VALUE
                                INTERNAL_VISA_ERROR -> Known.INTERNAL_VISA_ERROR
                                MERCHANT_TRANSACTION_ADVISORY_SERVICE_AUTHENTICATION_REQUIRED ->
                                    Known
                                        .MERCHANT_TRANSACTION_ADVISORY_SERVICE_AUTHENTICATION_REQUIRED
                                PAYMENT_FRAUD_DISRUPTION_ACQUIRER_BLOCK ->
                                    Known.PAYMENT_FRAUD_DISRUPTION_ACQUIRER_BLOCK
                                OTHER -> Known.OTHER
                                else ->
                                    throw IncreaseInvalidDataException(
                                        "Unknown StandInProcessingReason: $value"
                                    )
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws IncreaseInvalidDataException if this class instance's value does
                         *   not have the expected primitive type.
                         */
                        fun asString(): String =
                            _value().asString().orElseThrow {
                                IncreaseInvalidDataException("Value is not a String")
                            }

                        private var validated: Boolean = false

                        fun validate(): StandInProcessingReason = apply {
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is StandInProcessingReason && value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Visa && electronicCommerceIndicator == other.electronicCommerceIndicator && pointOfServiceEntryMode == other.pointOfServiceEntryMode && standInProcessingReason == other.standInProcessingReason && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(electronicCommerceIndicator, pointOfServiceEntryMode, standInProcessingReason, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Visa{electronicCommerceIndicator=$electronicCommerceIndicator, pointOfServiceEntryMode=$pointOfServiceEntryMode, standInProcessingReason=$standInProcessingReason, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is NetworkDetails && category == other.category && visa == other.visa && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(category, visa, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "NetworkDetails{category=$category, visa=$visa, additionalProperties=$additionalProperties}"
            }

            /** Network-specific identifiers for a specific request or transaction. */
            class NetworkIdentifiers
            private constructor(
                private val retrievalReferenceNumber: JsonField<String>,
                private val traceNumber: JsonField<String>,
                private val transactionId: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("retrieval_reference_number")
                    @ExcludeMissing
                    retrievalReferenceNumber: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("trace_number")
                    @ExcludeMissing
                    traceNumber: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("transaction_id")
                    @ExcludeMissing
                    transactionId: JsonField<String> = JsonMissing.of(),
                ) : this(retrievalReferenceNumber, traceNumber, transactionId, mutableMapOf())

                /**
                 * A life-cycle identifier used across e.g., an authorization and a reversal.
                 * Expected to be unique per acquirer within a window of time. For some card
                 * networks the retrieval reference number includes the trace counter.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun retrievalReferenceNumber(): Optional<String> =
                    retrievalReferenceNumber.getOptional("retrieval_reference_number")

                /**
                 * A counter used to verify an individual authorization. Expected to be unique per
                 * acquirer within a window of time.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun traceNumber(): Optional<String> = traceNumber.getOptional("trace_number")

                /**
                 * A globally unique transaction identifier provided by the card network, used
                 * across multiple life-cycle requests.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun transactionId(): Optional<String> = transactionId.getOptional("transaction_id")

                /**
                 * Returns the raw JSON value of [retrievalReferenceNumber].
                 *
                 * Unlike [retrievalReferenceNumber], this method doesn't throw if the JSON field
                 * has an unexpected type.
                 */
                @JsonProperty("retrieval_reference_number")
                @ExcludeMissing
                fun _retrievalReferenceNumber(): JsonField<String> = retrievalReferenceNumber

                /**
                 * Returns the raw JSON value of [traceNumber].
                 *
                 * Unlike [traceNumber], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("trace_number")
                @ExcludeMissing
                fun _traceNumber(): JsonField<String> = traceNumber

                /**
                 * Returns the raw JSON value of [transactionId].
                 *
                 * Unlike [transactionId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("transaction_id")
                @ExcludeMissing
                fun _transactionId(): JsonField<String> = transactionId

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
                     * [NetworkIdentifiers].
                     *
                     * The following fields are required:
                     * ```java
                     * .retrievalReferenceNumber()
                     * .traceNumber()
                     * .transactionId()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [NetworkIdentifiers]. */
                class Builder internal constructor() {

                    private var retrievalReferenceNumber: JsonField<String>? = null
                    private var traceNumber: JsonField<String>? = null
                    private var transactionId: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(networkIdentifiers: NetworkIdentifiers) = apply {
                        retrievalReferenceNumber = networkIdentifiers.retrievalReferenceNumber
                        traceNumber = networkIdentifiers.traceNumber
                        transactionId = networkIdentifiers.transactionId
                        additionalProperties =
                            networkIdentifiers.additionalProperties.toMutableMap()
                    }

                    /**
                     * A life-cycle identifier used across e.g., an authorization and a reversal.
                     * Expected to be unique per acquirer within a window of time. For some card
                     * networks the retrieval reference number includes the trace counter.
                     */
                    fun retrievalReferenceNumber(retrievalReferenceNumber: String?) =
                        retrievalReferenceNumber(JsonField.ofNullable(retrievalReferenceNumber))

                    /**
                     * Alias for calling [Builder.retrievalReferenceNumber] with
                     * `retrievalReferenceNumber.orElse(null)`.
                     */
                    fun retrievalReferenceNumber(retrievalReferenceNumber: Optional<String>) =
                        retrievalReferenceNumber(retrievalReferenceNumber.getOrNull())

                    /**
                     * Sets [Builder.retrievalReferenceNumber] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.retrievalReferenceNumber] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun retrievalReferenceNumber(retrievalReferenceNumber: JsonField<String>) =
                        apply {
                            this.retrievalReferenceNumber = retrievalReferenceNumber
                        }

                    /**
                     * A counter used to verify an individual authorization. Expected to be unique
                     * per acquirer within a window of time.
                     */
                    fun traceNumber(traceNumber: String?) =
                        traceNumber(JsonField.ofNullable(traceNumber))

                    /** Alias for calling [Builder.traceNumber] with `traceNumber.orElse(null)`. */
                    fun traceNumber(traceNumber: Optional<String>) =
                        traceNumber(traceNumber.getOrNull())

                    /**
                     * Sets [Builder.traceNumber] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.traceNumber] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun traceNumber(traceNumber: JsonField<String>) = apply {
                        this.traceNumber = traceNumber
                    }

                    /**
                     * A globally unique transaction identifier provided by the card network, used
                     * across multiple life-cycle requests.
                     */
                    fun transactionId(transactionId: String?) =
                        transactionId(JsonField.ofNullable(transactionId))

                    /**
                     * Alias for calling [Builder.transactionId] with `transactionId.orElse(null)`.
                     */
                    fun transactionId(transactionId: Optional<String>) =
                        transactionId(transactionId.getOrNull())

                    /**
                     * Sets [Builder.transactionId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.transactionId] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun transactionId(transactionId: JsonField<String>) = apply {
                        this.transactionId = transactionId
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
                     * Returns an immutable instance of [NetworkIdentifiers].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .retrievalReferenceNumber()
                     * .traceNumber()
                     * .transactionId()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): NetworkIdentifiers =
                        NetworkIdentifiers(
                            checkRequired("retrievalReferenceNumber", retrievalReferenceNumber),
                            checkRequired("traceNumber", traceNumber),
                            checkRequired("transactionId", transactionId),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): NetworkIdentifiers = apply {
                    if (validated) {
                        return@apply
                    }

                    retrievalReferenceNumber()
                    traceNumber()
                    transactionId()
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
                    (if (retrievalReferenceNumber.asKnown().isPresent) 1 else 0) +
                        (if (traceNumber.asKnown().isPresent) 1 else 0) +
                        (if (transactionId.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is NetworkIdentifiers && retrievalReferenceNumber == other.retrievalReferenceNumber && traceNumber == other.traceNumber && transactionId == other.transactionId && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(retrievalReferenceNumber, traceNumber, transactionId, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "NetworkIdentifiers{retrievalReferenceNumber=$retrievalReferenceNumber, traceNumber=$traceNumber, transactionId=$transactionId, additionalProperties=$additionalProperties}"
            }

            /**
             * The processing category describes the intent behind the authorization, such as
             * whether it was used for bill payments or an automatic fuel dispenser.
             */
            class ProcessingCategory
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

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

                    /**
                     * Account funding transactions are transactions used to e.g., fund an account
                     * or transfer funds between accounts.
                     */
                    @JvmField val ACCOUNT_FUNDING = of("account_funding")

                    /**
                     * Automatic fuel dispenser authorizations occur when a card is used at a gas
                     * pump, prior to the actual transaction amount being known. They are followed
                     * by an advice message that updates the amount of the pending transaction.
                     */
                    @JvmField val AUTOMATIC_FUEL_DISPENSER = of("automatic_fuel_dispenser")

                    /** A transaction used to pay a bill. */
                    @JvmField val BILL_PAYMENT = of("bill_payment")

                    /** A regular purchase. */
                    @JvmField val PURCHASE = of("purchase")

                    /**
                     * Quasi-cash transactions represent purchases of items which may be convertible
                     * to cash.
                     */
                    @JvmField val QUASI_CASH = of("quasi_cash")

                    /**
                     * A refund card authorization, sometimes referred to as a credit voucher
                     * authorization, where funds are credited to the cardholder.
                     */
                    @JvmField val REFUND = of("refund")

                    @JvmStatic fun of(value: String) = ProcessingCategory(JsonField.of(value))
                }

                /** An enum containing [ProcessingCategory]'s known values. */
                enum class Known {
                    /**
                     * Account funding transactions are transactions used to e.g., fund an account
                     * or transfer funds between accounts.
                     */
                    ACCOUNT_FUNDING,
                    /**
                     * Automatic fuel dispenser authorizations occur when a card is used at a gas
                     * pump, prior to the actual transaction amount being known. They are followed
                     * by an advice message that updates the amount of the pending transaction.
                     */
                    AUTOMATIC_FUEL_DISPENSER,
                    /** A transaction used to pay a bill. */
                    BILL_PAYMENT,
                    /** A regular purchase. */
                    PURCHASE,
                    /**
                     * Quasi-cash transactions represent purchases of items which may be convertible
                     * to cash.
                     */
                    QUASI_CASH,
                    /**
                     * A refund card authorization, sometimes referred to as a credit voucher
                     * authorization, where funds are credited to the cardholder.
                     */
                    REFUND,
                }

                /**
                 * An enum containing [ProcessingCategory]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [ProcessingCategory] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    /**
                     * Account funding transactions are transactions used to e.g., fund an account
                     * or transfer funds between accounts.
                     */
                    ACCOUNT_FUNDING,
                    /**
                     * Automatic fuel dispenser authorizations occur when a card is used at a gas
                     * pump, prior to the actual transaction amount being known. They are followed
                     * by an advice message that updates the amount of the pending transaction.
                     */
                    AUTOMATIC_FUEL_DISPENSER,
                    /** A transaction used to pay a bill. */
                    BILL_PAYMENT,
                    /** A regular purchase. */
                    PURCHASE,
                    /**
                     * Quasi-cash transactions represent purchases of items which may be convertible
                     * to cash.
                     */
                    QUASI_CASH,
                    /**
                     * A refund card authorization, sometimes referred to as a credit voucher
                     * authorization, where funds are credited to the cardholder.
                     */
                    REFUND,
                    /**
                     * An enum member indicating that [ProcessingCategory] was instantiated with an
                     * unknown value.
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
                        ACCOUNT_FUNDING -> Value.ACCOUNT_FUNDING
                        AUTOMATIC_FUEL_DISPENSER -> Value.AUTOMATIC_FUEL_DISPENSER
                        BILL_PAYMENT -> Value.BILL_PAYMENT
                        PURCHASE -> Value.PURCHASE
                        QUASI_CASH -> Value.QUASI_CASH
                        REFUND -> Value.REFUND
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
                        ACCOUNT_FUNDING -> Known.ACCOUNT_FUNDING
                        AUTOMATIC_FUEL_DISPENSER -> Known.AUTOMATIC_FUEL_DISPENSER
                        BILL_PAYMENT -> Known.BILL_PAYMENT
                        PURCHASE -> Known.PURCHASE
                        QUASI_CASH -> Known.QUASI_CASH
                        REFUND -> Known.REFUND
                        else ->
                            throw IncreaseInvalidDataException("Unknown ProcessingCategory: $value")
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

                fun validate(): ProcessingCategory = apply {
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

                    return /* spotless:off */ other is ProcessingCategory && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /**
             * A constant representing the object's type. For this resource it will always be
             * `card_authorization`.
             */
            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

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

                    @JvmField val CARD_AUTHORIZATION = of("card_authorization")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    CARD_AUTHORIZATION
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    CARD_AUTHORIZATION,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
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
                        CARD_AUTHORIZATION -> Value.CARD_AUTHORIZATION
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
                        CARD_AUTHORIZATION -> Known.CARD_AUTHORIZATION
                        else -> throw IncreaseInvalidDataException("Unknown Type: $value")
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

                    return /* spotless:off */ other is Type && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** Fields related to verification of cardholder-provided values. */
            class Verification
            private constructor(
                private val cardVerificationCode: JsonField<CardVerificationCode>,
                private val cardholderAddress: JsonField<CardholderAddress>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("card_verification_code")
                    @ExcludeMissing
                    cardVerificationCode: JsonField<CardVerificationCode> = JsonMissing.of(),
                    @JsonProperty("cardholder_address")
                    @ExcludeMissing
                    cardholderAddress: JsonField<CardholderAddress> = JsonMissing.of(),
                ) : this(cardVerificationCode, cardholderAddress, mutableMapOf())

                /**
                 * Fields related to verification of the Card Verification Code, a 3-digit code on
                 * the back of the card.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun cardVerificationCode(): CardVerificationCode =
                    cardVerificationCode.getRequired("card_verification_code")

                /**
                 * Cardholder address provided in the authorization request and the address on file
                 * we verified it against.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun cardholderAddress(): CardholderAddress =
                    cardholderAddress.getRequired("cardholder_address")

                /**
                 * Returns the raw JSON value of [cardVerificationCode].
                 *
                 * Unlike [cardVerificationCode], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("card_verification_code")
                @ExcludeMissing
                fun _cardVerificationCode(): JsonField<CardVerificationCode> = cardVerificationCode

                /**
                 * Returns the raw JSON value of [cardholderAddress].
                 *
                 * Unlike [cardholderAddress], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("cardholder_address")
                @ExcludeMissing
                fun _cardholderAddress(): JsonField<CardholderAddress> = cardholderAddress

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
                     * Returns a mutable builder for constructing an instance of [Verification].
                     *
                     * The following fields are required:
                     * ```java
                     * .cardVerificationCode()
                     * .cardholderAddress()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Verification]. */
                class Builder internal constructor() {

                    private var cardVerificationCode: JsonField<CardVerificationCode>? = null
                    private var cardholderAddress: JsonField<CardholderAddress>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(verification: Verification) = apply {
                        cardVerificationCode = verification.cardVerificationCode
                        cardholderAddress = verification.cardholderAddress
                        additionalProperties = verification.additionalProperties.toMutableMap()
                    }

                    /**
                     * Fields related to verification of the Card Verification Code, a 3-digit code
                     * on the back of the card.
                     */
                    fun cardVerificationCode(cardVerificationCode: CardVerificationCode) =
                        cardVerificationCode(JsonField.of(cardVerificationCode))

                    /**
                     * Sets [Builder.cardVerificationCode] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.cardVerificationCode] with a well-typed
                     * [CardVerificationCode] value instead. This method is primarily for setting
                     * the field to an undocumented or not yet supported value.
                     */
                    fun cardVerificationCode(
                        cardVerificationCode: JsonField<CardVerificationCode>
                    ) = apply { this.cardVerificationCode = cardVerificationCode }

                    /**
                     * Cardholder address provided in the authorization request and the address on
                     * file we verified it against.
                     */
                    fun cardholderAddress(cardholderAddress: CardholderAddress) =
                        cardholderAddress(JsonField.of(cardholderAddress))

                    /**
                     * Sets [Builder.cardholderAddress] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.cardholderAddress] with a well-typed
                     * [CardholderAddress] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun cardholderAddress(cardholderAddress: JsonField<CardholderAddress>) = apply {
                        this.cardholderAddress = cardholderAddress
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
                     * Returns an immutable instance of [Verification].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .cardVerificationCode()
                     * .cardholderAddress()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Verification =
                        Verification(
                            checkRequired("cardVerificationCode", cardVerificationCode),
                            checkRequired("cardholderAddress", cardholderAddress),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Verification = apply {
                    if (validated) {
                        return@apply
                    }

                    cardVerificationCode().validate()
                    cardholderAddress().validate()
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
                    (cardVerificationCode.asKnown().getOrNull()?.validity() ?: 0) +
                        (cardholderAddress.asKnown().getOrNull()?.validity() ?: 0)

                /**
                 * Fields related to verification of the Card Verification Code, a 3-digit code on
                 * the back of the card.
                 */
                class CardVerificationCode
                private constructor(
                    private val result: JsonField<Result>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("result")
                        @ExcludeMissing
                        result: JsonField<Result> = JsonMissing.of()
                    ) : this(result, mutableMapOf())

                    /**
                     * The result of verifying the Card Verification Code.
                     *
                     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun result(): Result = result.getRequired("result")

                    /**
                     * Returns the raw JSON value of [result].
                     *
                     * Unlike [result], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("result")
                    @ExcludeMissing
                    fun _result(): JsonField<Result> = result

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
                         * [CardVerificationCode].
                         *
                         * The following fields are required:
                         * ```java
                         * .result()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [CardVerificationCode]. */
                    class Builder internal constructor() {

                        private var result: JsonField<Result>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(cardVerificationCode: CardVerificationCode) = apply {
                            result = cardVerificationCode.result
                            additionalProperties =
                                cardVerificationCode.additionalProperties.toMutableMap()
                        }

                        /** The result of verifying the Card Verification Code. */
                        fun result(result: Result) = result(JsonField.of(result))

                        /**
                         * Sets [Builder.result] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.result] with a well-typed [Result] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun result(result: JsonField<Result>) = apply { this.result = result }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [CardVerificationCode].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .result()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): CardVerificationCode =
                            CardVerificationCode(
                                checkRequired("result", result),
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): CardVerificationCode = apply {
                        if (validated) {
                            return@apply
                        }

                        result().validate()
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
                    internal fun validity(): Int = (result.asKnown().getOrNull()?.validity() ?: 0)

                    /** The result of verifying the Card Verification Code. */
                    class Result
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            /**
                             * No card verification code was provided in the authorization request.
                             */
                            @JvmField val NOT_CHECKED = of("not_checked")

                            /** The card verification code matched the one on file. */
                            @JvmField val MATCH = of("match")

                            /** The card verification code did not match the one on file. */
                            @JvmField val NO_MATCH = of("no_match")

                            @JvmStatic fun of(value: String) = Result(JsonField.of(value))
                        }

                        /** An enum containing [Result]'s known values. */
                        enum class Known {
                            /**
                             * No card verification code was provided in the authorization request.
                             */
                            NOT_CHECKED,
                            /** The card verification code matched the one on file. */
                            MATCH,
                            /** The card verification code did not match the one on file. */
                            NO_MATCH,
                        }

                        /**
                         * An enum containing [Result]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Result] can contain an unknown value in a couple of
                         * cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            /**
                             * No card verification code was provided in the authorization request.
                             */
                            NOT_CHECKED,
                            /** The card verification code matched the one on file. */
                            MATCH,
                            /** The card verification code did not match the one on file. */
                            NO_MATCH,
                            /**
                             * An enum member indicating that [Result] was instantiated with an
                             * unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                NOT_CHECKED -> Value.NOT_CHECKED
                                MATCH -> Value.MATCH
                                NO_MATCH -> Value.NO_MATCH
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws IncreaseInvalidDataException if this class instance's value is a
                         *   not a known member.
                         */
                        fun known(): Known =
                            when (this) {
                                NOT_CHECKED -> Known.NOT_CHECKED
                                MATCH -> Known.MATCH
                                NO_MATCH -> Known.NO_MATCH
                                else -> throw IncreaseInvalidDataException("Unknown Result: $value")
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws IncreaseInvalidDataException if this class instance's value does
                         *   not have the expected primitive type.
                         */
                        fun asString(): String =
                            _value().asString().orElseThrow {
                                IncreaseInvalidDataException("Value is not a String")
                            }

                        private var validated: Boolean = false

                        fun validate(): Result = apply {
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Result && value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is CardVerificationCode && result == other.result && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(result, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "CardVerificationCode{result=$result, additionalProperties=$additionalProperties}"
                }

                /**
                 * Cardholder address provided in the authorization request and the address on file
                 * we verified it against.
                 */
                class CardholderAddress
                private constructor(
                    private val actualLine1: JsonField<String>,
                    private val actualPostalCode: JsonField<String>,
                    private val providedLine1: JsonField<String>,
                    private val providedPostalCode: JsonField<String>,
                    private val result: JsonField<Result>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("actual_line1")
                        @ExcludeMissing
                        actualLine1: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("actual_postal_code")
                        @ExcludeMissing
                        actualPostalCode: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("provided_line1")
                        @ExcludeMissing
                        providedLine1: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("provided_postal_code")
                        @ExcludeMissing
                        providedPostalCode: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("result")
                        @ExcludeMissing
                        result: JsonField<Result> = JsonMissing.of(),
                    ) : this(
                        actualLine1,
                        actualPostalCode,
                        providedLine1,
                        providedPostalCode,
                        result,
                        mutableMapOf(),
                    )

                    /**
                     * Line 1 of the address on file for the cardholder.
                     *
                     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun actualLine1(): Optional<String> = actualLine1.getOptional("actual_line1")

                    /**
                     * The postal code of the address on file for the cardholder.
                     *
                     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun actualPostalCode(): Optional<String> =
                        actualPostalCode.getOptional("actual_postal_code")

                    /**
                     * The cardholder address line 1 provided for verification in the authorization
                     * request.
                     *
                     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun providedLine1(): Optional<String> =
                        providedLine1.getOptional("provided_line1")

                    /**
                     * The postal code provided for verification in the authorization request.
                     *
                     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun providedPostalCode(): Optional<String> =
                        providedPostalCode.getOptional("provided_postal_code")

                    /**
                     * The address verification result returned to the card network.
                     *
                     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun result(): Result = result.getRequired("result")

                    /**
                     * Returns the raw JSON value of [actualLine1].
                     *
                     * Unlike [actualLine1], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("actual_line1")
                    @ExcludeMissing
                    fun _actualLine1(): JsonField<String> = actualLine1

                    /**
                     * Returns the raw JSON value of [actualPostalCode].
                     *
                     * Unlike [actualPostalCode], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("actual_postal_code")
                    @ExcludeMissing
                    fun _actualPostalCode(): JsonField<String> = actualPostalCode

                    /**
                     * Returns the raw JSON value of [providedLine1].
                     *
                     * Unlike [providedLine1], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("provided_line1")
                    @ExcludeMissing
                    fun _providedLine1(): JsonField<String> = providedLine1

                    /**
                     * Returns the raw JSON value of [providedPostalCode].
                     *
                     * Unlike [providedPostalCode], this method doesn't throw if the JSON field has
                     * an unexpected type.
                     */
                    @JsonProperty("provided_postal_code")
                    @ExcludeMissing
                    fun _providedPostalCode(): JsonField<String> = providedPostalCode

                    /**
                     * Returns the raw JSON value of [result].
                     *
                     * Unlike [result], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("result")
                    @ExcludeMissing
                    fun _result(): JsonField<Result> = result

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
                         * [CardholderAddress].
                         *
                         * The following fields are required:
                         * ```java
                         * .actualLine1()
                         * .actualPostalCode()
                         * .providedLine1()
                         * .providedPostalCode()
                         * .result()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [CardholderAddress]. */
                    class Builder internal constructor() {

                        private var actualLine1: JsonField<String>? = null
                        private var actualPostalCode: JsonField<String>? = null
                        private var providedLine1: JsonField<String>? = null
                        private var providedPostalCode: JsonField<String>? = null
                        private var result: JsonField<Result>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(cardholderAddress: CardholderAddress) = apply {
                            actualLine1 = cardholderAddress.actualLine1
                            actualPostalCode = cardholderAddress.actualPostalCode
                            providedLine1 = cardholderAddress.providedLine1
                            providedPostalCode = cardholderAddress.providedPostalCode
                            result = cardholderAddress.result
                            additionalProperties =
                                cardholderAddress.additionalProperties.toMutableMap()
                        }

                        /** Line 1 of the address on file for the cardholder. */
                        fun actualLine1(actualLine1: String?) =
                            actualLine1(JsonField.ofNullable(actualLine1))

                        /**
                         * Alias for calling [Builder.actualLine1] with `actualLine1.orElse(null)`.
                         */
                        fun actualLine1(actualLine1: Optional<String>) =
                            actualLine1(actualLine1.getOrNull())

                        /**
                         * Sets [Builder.actualLine1] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.actualLine1] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun actualLine1(actualLine1: JsonField<String>) = apply {
                            this.actualLine1 = actualLine1
                        }

                        /** The postal code of the address on file for the cardholder. */
                        fun actualPostalCode(actualPostalCode: String?) =
                            actualPostalCode(JsonField.ofNullable(actualPostalCode))

                        /**
                         * Alias for calling [Builder.actualPostalCode] with
                         * `actualPostalCode.orElse(null)`.
                         */
                        fun actualPostalCode(actualPostalCode: Optional<String>) =
                            actualPostalCode(actualPostalCode.getOrNull())

                        /**
                         * Sets [Builder.actualPostalCode] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.actualPostalCode] with a well-typed
                         * [String] value instead. This method is primarily for setting the field to
                         * an undocumented or not yet supported value.
                         */
                        fun actualPostalCode(actualPostalCode: JsonField<String>) = apply {
                            this.actualPostalCode = actualPostalCode
                        }

                        /**
                         * The cardholder address line 1 provided for verification in the
                         * authorization request.
                         */
                        fun providedLine1(providedLine1: String?) =
                            providedLine1(JsonField.ofNullable(providedLine1))

                        /**
                         * Alias for calling [Builder.providedLine1] with
                         * `providedLine1.orElse(null)`.
                         */
                        fun providedLine1(providedLine1: Optional<String>) =
                            providedLine1(providedLine1.getOrNull())

                        /**
                         * Sets [Builder.providedLine1] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.providedLine1] with a well-typed
                         * [String] value instead. This method is primarily for setting the field to
                         * an undocumented or not yet supported value.
                         */
                        fun providedLine1(providedLine1: JsonField<String>) = apply {
                            this.providedLine1 = providedLine1
                        }

                        /**
                         * The postal code provided for verification in the authorization request.
                         */
                        fun providedPostalCode(providedPostalCode: String?) =
                            providedPostalCode(JsonField.ofNullable(providedPostalCode))

                        /**
                         * Alias for calling [Builder.providedPostalCode] with
                         * `providedPostalCode.orElse(null)`.
                         */
                        fun providedPostalCode(providedPostalCode: Optional<String>) =
                            providedPostalCode(providedPostalCode.getOrNull())

                        /**
                         * Sets [Builder.providedPostalCode] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.providedPostalCode] with a well-typed
                         * [String] value instead. This method is primarily for setting the field to
                         * an undocumented or not yet supported value.
                         */
                        fun providedPostalCode(providedPostalCode: JsonField<String>) = apply {
                            this.providedPostalCode = providedPostalCode
                        }

                        /** The address verification result returned to the card network. */
                        fun result(result: Result) = result(JsonField.of(result))

                        /**
                         * Sets [Builder.result] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.result] with a well-typed [Result] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun result(result: JsonField<Result>) = apply { this.result = result }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [CardholderAddress].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .actualLine1()
                         * .actualPostalCode()
                         * .providedLine1()
                         * .providedPostalCode()
                         * .result()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): CardholderAddress =
                            CardholderAddress(
                                checkRequired("actualLine1", actualLine1),
                                checkRequired("actualPostalCode", actualPostalCode),
                                checkRequired("providedLine1", providedLine1),
                                checkRequired("providedPostalCode", providedPostalCode),
                                checkRequired("result", result),
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): CardholderAddress = apply {
                        if (validated) {
                            return@apply
                        }

                        actualLine1()
                        actualPostalCode()
                        providedLine1()
                        providedPostalCode()
                        result().validate()
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
                        (if (actualLine1.asKnown().isPresent) 1 else 0) +
                            (if (actualPostalCode.asKnown().isPresent) 1 else 0) +
                            (if (providedLine1.asKnown().isPresent) 1 else 0) +
                            (if (providedPostalCode.asKnown().isPresent) 1 else 0) +
                            (result.asKnown().getOrNull()?.validity() ?: 0)

                    /** The address verification result returned to the card network. */
                    class Result
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            /** No address was provided in the authorization request. */
                            @JvmField val NOT_CHECKED = of("not_checked")

                            /** Postal code matches, but the street address was not verified. */
                            @JvmField
                            val POSTAL_CODE_MATCH_ADDRESS_NOT_CHECKED =
                                of("postal_code_match_address_not_checked")

                            /** Postal code matches, but the street address does not match. */
                            @JvmField
                            val POSTAL_CODE_MATCH_ADDRESS_NO_MATCH =
                                of("postal_code_match_address_no_match")

                            /** Postal code does not match, but the street address matches. */
                            @JvmField
                            val POSTAL_CODE_NO_MATCH_ADDRESS_MATCH =
                                of("postal_code_no_match_address_match")

                            /** Postal code and street address match. */
                            @JvmField val MATCH = of("match")

                            /** Postal code and street address do not match. */
                            @JvmField val NO_MATCH = of("no_match")

                            @JvmStatic fun of(value: String) = Result(JsonField.of(value))
                        }

                        /** An enum containing [Result]'s known values. */
                        enum class Known {
                            /** No address was provided in the authorization request. */
                            NOT_CHECKED,
                            /** Postal code matches, but the street address was not verified. */
                            POSTAL_CODE_MATCH_ADDRESS_NOT_CHECKED,
                            /** Postal code matches, but the street address does not match. */
                            POSTAL_CODE_MATCH_ADDRESS_NO_MATCH,
                            /** Postal code does not match, but the street address matches. */
                            POSTAL_CODE_NO_MATCH_ADDRESS_MATCH,
                            /** Postal code and street address match. */
                            MATCH,
                            /** Postal code and street address do not match. */
                            NO_MATCH,
                        }

                        /**
                         * An enum containing [Result]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Result] can contain an unknown value in a couple of
                         * cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            /** No address was provided in the authorization request. */
                            NOT_CHECKED,
                            /** Postal code matches, but the street address was not verified. */
                            POSTAL_CODE_MATCH_ADDRESS_NOT_CHECKED,
                            /** Postal code matches, but the street address does not match. */
                            POSTAL_CODE_MATCH_ADDRESS_NO_MATCH,
                            /** Postal code does not match, but the street address matches. */
                            POSTAL_CODE_NO_MATCH_ADDRESS_MATCH,
                            /** Postal code and street address match. */
                            MATCH,
                            /** Postal code and street address do not match. */
                            NO_MATCH,
                            /**
                             * An enum member indicating that [Result] was instantiated with an
                             * unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                NOT_CHECKED -> Value.NOT_CHECKED
                                POSTAL_CODE_MATCH_ADDRESS_NOT_CHECKED ->
                                    Value.POSTAL_CODE_MATCH_ADDRESS_NOT_CHECKED
                                POSTAL_CODE_MATCH_ADDRESS_NO_MATCH ->
                                    Value.POSTAL_CODE_MATCH_ADDRESS_NO_MATCH
                                POSTAL_CODE_NO_MATCH_ADDRESS_MATCH ->
                                    Value.POSTAL_CODE_NO_MATCH_ADDRESS_MATCH
                                MATCH -> Value.MATCH
                                NO_MATCH -> Value.NO_MATCH
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws IncreaseInvalidDataException if this class instance's value is a
                         *   not a known member.
                         */
                        fun known(): Known =
                            when (this) {
                                NOT_CHECKED -> Known.NOT_CHECKED
                                POSTAL_CODE_MATCH_ADDRESS_NOT_CHECKED ->
                                    Known.POSTAL_CODE_MATCH_ADDRESS_NOT_CHECKED
                                POSTAL_CODE_MATCH_ADDRESS_NO_MATCH ->
                                    Known.POSTAL_CODE_MATCH_ADDRESS_NO_MATCH
                                POSTAL_CODE_NO_MATCH_ADDRESS_MATCH ->
                                    Known.POSTAL_CODE_NO_MATCH_ADDRESS_MATCH
                                MATCH -> Known.MATCH
                                NO_MATCH -> Known.NO_MATCH
                                else -> throw IncreaseInvalidDataException("Unknown Result: $value")
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws IncreaseInvalidDataException if this class instance's value does
                         *   not have the expected primitive type.
                         */
                        fun asString(): String =
                            _value().asString().orElseThrow {
                                IncreaseInvalidDataException("Value is not a String")
                            }

                        private var validated: Boolean = false

                        fun validate(): Result = apply {
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Result && value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is CardholderAddress && actualLine1 == other.actualLine1 && actualPostalCode == other.actualPostalCode && providedLine1 == other.providedLine1 && providedPostalCode == other.providedPostalCode && result == other.result && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(actualLine1, actualPostalCode, providedLine1, providedPostalCode, result, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "CardholderAddress{actualLine1=$actualLine1, actualPostalCode=$actualPostalCode, providedLine1=$providedLine1, providedPostalCode=$providedPostalCode, result=$result, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Verification && cardVerificationCode == other.cardVerificationCode && cardholderAddress == other.cardholderAddress && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(cardVerificationCode, cardholderAddress, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Verification{cardVerificationCode=$cardVerificationCode, cardholderAddress=$cardholderAddress, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is CardAuthorization && id == other.id && actioner == other.actioner && amount == other.amount && cardPaymentId == other.cardPaymentId && currency == other.currency && digitalWalletTokenId == other.digitalWalletTokenId && direction == other.direction && expiresAt == other.expiresAt && merchantAcceptorId == other.merchantAcceptorId && merchantCategoryCode == other.merchantCategoryCode && merchantCity == other.merchantCity && merchantCountry == other.merchantCountry && merchantDescriptor == other.merchantDescriptor && merchantPostalCode == other.merchantPostalCode && merchantState == other.merchantState && networkDetails == other.networkDetails && networkIdentifiers == other.networkIdentifiers && networkRiskScore == other.networkRiskScore && pendingTransactionId == other.pendingTransactionId && physicalCardId == other.physicalCardId && presentmentAmount == other.presentmentAmount && presentmentCurrency == other.presentmentCurrency && processingCategory == other.processingCategory && realTimeDecisionId == other.realTimeDecisionId && terminalId == other.terminalId && type == other.type && verification == other.verification && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, actioner, amount, cardPaymentId, currency, digitalWalletTokenId, direction, expiresAt, merchantAcceptorId, merchantCategoryCode, merchantCity, merchantCountry, merchantDescriptor, merchantPostalCode, merchantState, networkDetails, networkIdentifiers, networkRiskScore, pendingTransactionId, physicalCardId, presentmentAmount, presentmentCurrency, processingCategory, realTimeDecisionId, terminalId, type, verification, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CardAuthorization{id=$id, actioner=$actioner, amount=$amount, cardPaymentId=$cardPaymentId, currency=$currency, digitalWalletTokenId=$digitalWalletTokenId, direction=$direction, expiresAt=$expiresAt, merchantAcceptorId=$merchantAcceptorId, merchantCategoryCode=$merchantCategoryCode, merchantCity=$merchantCity, merchantCountry=$merchantCountry, merchantDescriptor=$merchantDescriptor, merchantPostalCode=$merchantPostalCode, merchantState=$merchantState, networkDetails=$networkDetails, networkIdentifiers=$networkIdentifiers, networkRiskScore=$networkRiskScore, pendingTransactionId=$pendingTransactionId, physicalCardId=$physicalCardId, presentmentAmount=$presentmentAmount, presentmentCurrency=$presentmentCurrency, processingCategory=$processingCategory, realTimeDecisionId=$realTimeDecisionId, terminalId=$terminalId, type=$type, verification=$verification, additionalProperties=$additionalProperties}"
        }

        /**
         * The type of the resource. We may add additional possible values for this enum over time;
         * your application should be able to handle such additions gracefully.
         */
        class Category @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

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

                /**
                 * Account Transfer Instruction: details will be under the
                 * `account_transfer_instruction` object.
                 */
                @JvmField val ACCOUNT_TRANSFER_INSTRUCTION = of("account_transfer_instruction")

                /**
                 * ACH Transfer Instruction: details will be under the `ach_transfer_instruction`
                 * object.
                 */
                @JvmField val ACH_TRANSFER_INSTRUCTION = of("ach_transfer_instruction")

                /** Card Authorization: details will be under the `card_authorization` object. */
                @JvmField val CARD_AUTHORIZATION = of("card_authorization")

                /**
                 * Check Deposit Instruction: details will be under the `check_deposit_instruction`
                 * object.
                 */
                @JvmField val CHECK_DEPOSIT_INSTRUCTION = of("check_deposit_instruction")

                /**
                 * Check Transfer Instruction: details will be under the
                 * `check_transfer_instruction` object.
                 */
                @JvmField val CHECK_TRANSFER_INSTRUCTION = of("check_transfer_instruction")

                /** Inbound Funds Hold: details will be under the `inbound_funds_hold` object. */
                @JvmField val INBOUND_FUNDS_HOLD = of("inbound_funds_hold")

                /**
                 * Real-Time Payments Transfer Instruction: details will be under the
                 * `real_time_payments_transfer_instruction` object.
                 */
                @JvmField
                val REAL_TIME_PAYMENTS_TRANSFER_INSTRUCTION =
                    of("real_time_payments_transfer_instruction")

                /**
                 * Wire Transfer Instruction: details will be under the `wire_transfer_instruction`
                 * object.
                 */
                @JvmField val WIRE_TRANSFER_INSTRUCTION = of("wire_transfer_instruction")

                /**
                 * Inbound Wire Transfer Reversal: details will be under the
                 * `inbound_wire_transfer_reversal` object.
                 */
                @JvmField val INBOUND_WIRE_TRANSFER_REVERSAL = of("inbound_wire_transfer_reversal")

                /** The Pending Transaction was made for an undocumented or deprecated reason. */
                @JvmField val OTHER = of("other")

                @JvmStatic fun of(value: String) = Category(JsonField.of(value))
            }

            /** An enum containing [Category]'s known values. */
            enum class Known {
                /**
                 * Account Transfer Instruction: details will be under the
                 * `account_transfer_instruction` object.
                 */
                ACCOUNT_TRANSFER_INSTRUCTION,
                /**
                 * ACH Transfer Instruction: details will be under the `ach_transfer_instruction`
                 * object.
                 */
                ACH_TRANSFER_INSTRUCTION,
                /** Card Authorization: details will be under the `card_authorization` object. */
                CARD_AUTHORIZATION,
                /**
                 * Check Deposit Instruction: details will be under the `check_deposit_instruction`
                 * object.
                 */
                CHECK_DEPOSIT_INSTRUCTION,
                /**
                 * Check Transfer Instruction: details will be under the
                 * `check_transfer_instruction` object.
                 */
                CHECK_TRANSFER_INSTRUCTION,
                /** Inbound Funds Hold: details will be under the `inbound_funds_hold` object. */
                INBOUND_FUNDS_HOLD,
                /**
                 * Real-Time Payments Transfer Instruction: details will be under the
                 * `real_time_payments_transfer_instruction` object.
                 */
                REAL_TIME_PAYMENTS_TRANSFER_INSTRUCTION,
                /**
                 * Wire Transfer Instruction: details will be under the `wire_transfer_instruction`
                 * object.
                 */
                WIRE_TRANSFER_INSTRUCTION,
                /**
                 * Inbound Wire Transfer Reversal: details will be under the
                 * `inbound_wire_transfer_reversal` object.
                 */
                INBOUND_WIRE_TRANSFER_REVERSAL,
                /** The Pending Transaction was made for an undocumented or deprecated reason. */
                OTHER,
            }

            /**
             * An enum containing [Category]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Category] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /**
                 * Account Transfer Instruction: details will be under the
                 * `account_transfer_instruction` object.
                 */
                ACCOUNT_TRANSFER_INSTRUCTION,
                /**
                 * ACH Transfer Instruction: details will be under the `ach_transfer_instruction`
                 * object.
                 */
                ACH_TRANSFER_INSTRUCTION,
                /** Card Authorization: details will be under the `card_authorization` object. */
                CARD_AUTHORIZATION,
                /**
                 * Check Deposit Instruction: details will be under the `check_deposit_instruction`
                 * object.
                 */
                CHECK_DEPOSIT_INSTRUCTION,
                /**
                 * Check Transfer Instruction: details will be under the
                 * `check_transfer_instruction` object.
                 */
                CHECK_TRANSFER_INSTRUCTION,
                /** Inbound Funds Hold: details will be under the `inbound_funds_hold` object. */
                INBOUND_FUNDS_HOLD,
                /**
                 * Real-Time Payments Transfer Instruction: details will be under the
                 * `real_time_payments_transfer_instruction` object.
                 */
                REAL_TIME_PAYMENTS_TRANSFER_INSTRUCTION,
                /**
                 * Wire Transfer Instruction: details will be under the `wire_transfer_instruction`
                 * object.
                 */
                WIRE_TRANSFER_INSTRUCTION,
                /**
                 * Inbound Wire Transfer Reversal: details will be under the
                 * `inbound_wire_transfer_reversal` object.
                 */
                INBOUND_WIRE_TRANSFER_REVERSAL,
                /** The Pending Transaction was made for an undocumented or deprecated reason. */
                OTHER,
                /**
                 * An enum member indicating that [Category] was instantiated with an unknown value.
                 */
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
                    ACCOUNT_TRANSFER_INSTRUCTION -> Value.ACCOUNT_TRANSFER_INSTRUCTION
                    ACH_TRANSFER_INSTRUCTION -> Value.ACH_TRANSFER_INSTRUCTION
                    CARD_AUTHORIZATION -> Value.CARD_AUTHORIZATION
                    CHECK_DEPOSIT_INSTRUCTION -> Value.CHECK_DEPOSIT_INSTRUCTION
                    CHECK_TRANSFER_INSTRUCTION -> Value.CHECK_TRANSFER_INSTRUCTION
                    INBOUND_FUNDS_HOLD -> Value.INBOUND_FUNDS_HOLD
                    REAL_TIME_PAYMENTS_TRANSFER_INSTRUCTION ->
                        Value.REAL_TIME_PAYMENTS_TRANSFER_INSTRUCTION
                    WIRE_TRANSFER_INSTRUCTION -> Value.WIRE_TRANSFER_INSTRUCTION
                    INBOUND_WIRE_TRANSFER_REVERSAL -> Value.INBOUND_WIRE_TRANSFER_REVERSAL
                    OTHER -> Value.OTHER
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
                    ACCOUNT_TRANSFER_INSTRUCTION -> Known.ACCOUNT_TRANSFER_INSTRUCTION
                    ACH_TRANSFER_INSTRUCTION -> Known.ACH_TRANSFER_INSTRUCTION
                    CARD_AUTHORIZATION -> Known.CARD_AUTHORIZATION
                    CHECK_DEPOSIT_INSTRUCTION -> Known.CHECK_DEPOSIT_INSTRUCTION
                    CHECK_TRANSFER_INSTRUCTION -> Known.CHECK_TRANSFER_INSTRUCTION
                    INBOUND_FUNDS_HOLD -> Known.INBOUND_FUNDS_HOLD
                    REAL_TIME_PAYMENTS_TRANSFER_INSTRUCTION ->
                        Known.REAL_TIME_PAYMENTS_TRANSFER_INSTRUCTION
                    WIRE_TRANSFER_INSTRUCTION -> Known.WIRE_TRANSFER_INSTRUCTION
                    INBOUND_WIRE_TRANSFER_REVERSAL -> Known.INBOUND_WIRE_TRANSFER_REVERSAL
                    OTHER -> Known.OTHER
                    else -> throw IncreaseInvalidDataException("Unknown Category: $value")
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
         * A Check Deposit Instruction object. This field will be present in the JSON response if
         * and only if `category` is equal to `check_deposit_instruction`.
         */
        class CheckDepositInstruction
        private constructor(
            private val amount: JsonField<Long>,
            private val backImageFileId: JsonField<String>,
            private val checkDepositId: JsonField<String>,
            private val currency: JsonField<Currency>,
            private val frontImageFileId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("back_image_file_id")
                @ExcludeMissing
                backImageFileId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("check_deposit_id")
                @ExcludeMissing
                checkDepositId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("currency")
                @ExcludeMissing
                currency: JsonField<Currency> = JsonMissing.of(),
                @JsonProperty("front_image_file_id")
                @ExcludeMissing
                frontImageFileId: JsonField<String> = JsonMissing.of(),
            ) : this(
                amount,
                backImageFileId,
                checkDepositId,
                currency,
                frontImageFileId,
                mutableMapOf(),
            )

            /**
             * The pending amount in USD cents.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun amount(): Long = amount.getRequired("amount")

            /**
             * The identifier of the File containing the image of the back of the check that was
             * deposited.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun backImageFileId(): Optional<String> =
                backImageFileId.getOptional("back_image_file_id")

            /**
             * The identifier of the Check Deposit.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun checkDepositId(): Optional<String> = checkDepositId.getOptional("check_deposit_id")

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
             * currency.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun currency(): Currency = currency.getRequired("currency")

            /**
             * The identifier of the File containing the image of the front of the check that was
             * deposited.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun frontImageFileId(): String = frontImageFileId.getRequired("front_image_file_id")

            /**
             * Returns the raw JSON value of [amount].
             *
             * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

            /**
             * Returns the raw JSON value of [backImageFileId].
             *
             * Unlike [backImageFileId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("back_image_file_id")
            @ExcludeMissing
            fun _backImageFileId(): JsonField<String> = backImageFileId

            /**
             * Returns the raw JSON value of [checkDepositId].
             *
             * Unlike [checkDepositId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("check_deposit_id")
            @ExcludeMissing
            fun _checkDepositId(): JsonField<String> = checkDepositId

            /**
             * Returns the raw JSON value of [currency].
             *
             * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("currency")
            @ExcludeMissing
            fun _currency(): JsonField<Currency> = currency

            /**
             * Returns the raw JSON value of [frontImageFileId].
             *
             * Unlike [frontImageFileId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("front_image_file_id")
            @ExcludeMissing
            fun _frontImageFileId(): JsonField<String> = frontImageFileId

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
                 * [CheckDepositInstruction].
                 *
                 * The following fields are required:
                 * ```java
                 * .amount()
                 * .backImageFileId()
                 * .checkDepositId()
                 * .currency()
                 * .frontImageFileId()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [CheckDepositInstruction]. */
            class Builder internal constructor() {

                private var amount: JsonField<Long>? = null
                private var backImageFileId: JsonField<String>? = null
                private var checkDepositId: JsonField<String>? = null
                private var currency: JsonField<Currency>? = null
                private var frontImageFileId: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(checkDepositInstruction: CheckDepositInstruction) = apply {
                    amount = checkDepositInstruction.amount
                    backImageFileId = checkDepositInstruction.backImageFileId
                    checkDepositId = checkDepositInstruction.checkDepositId
                    currency = checkDepositInstruction.currency
                    frontImageFileId = checkDepositInstruction.frontImageFileId
                    additionalProperties =
                        checkDepositInstruction.additionalProperties.toMutableMap()
                }

                /** The pending amount in USD cents. */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /**
                 * Sets [Builder.amount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amount] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /**
                 * The identifier of the File containing the image of the back of the check that was
                 * deposited.
                 */
                fun backImageFileId(backImageFileId: String?) =
                    backImageFileId(JsonField.ofNullable(backImageFileId))

                /**
                 * Alias for calling [Builder.backImageFileId] with `backImageFileId.orElse(null)`.
                 */
                fun backImageFileId(backImageFileId: Optional<String>) =
                    backImageFileId(backImageFileId.getOrNull())

                /**
                 * Sets [Builder.backImageFileId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.backImageFileId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun backImageFileId(backImageFileId: JsonField<String>) = apply {
                    this.backImageFileId = backImageFileId
                }

                /** The identifier of the Check Deposit. */
                fun checkDepositId(checkDepositId: String?) =
                    checkDepositId(JsonField.ofNullable(checkDepositId))

                /**
                 * Alias for calling [Builder.checkDepositId] with `checkDepositId.orElse(null)`.
                 */
                fun checkDepositId(checkDepositId: Optional<String>) =
                    checkDepositId(checkDepositId.getOrNull())

                /**
                 * Sets [Builder.checkDepositId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.checkDepositId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun checkDepositId(checkDepositId: JsonField<String>) = apply {
                    this.checkDepositId = checkDepositId
                }

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
                 * currency.
                 */
                fun currency(currency: Currency) = currency(JsonField.of(currency))

                /**
                 * Sets [Builder.currency] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.currency] with a well-typed [Currency] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                /**
                 * The identifier of the File containing the image of the front of the check that
                 * was deposited.
                 */
                fun frontImageFileId(frontImageFileId: String) =
                    frontImageFileId(JsonField.of(frontImageFileId))

                /**
                 * Sets [Builder.frontImageFileId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.frontImageFileId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun frontImageFileId(frontImageFileId: JsonField<String>) = apply {
                    this.frontImageFileId = frontImageFileId
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
                 * Returns an immutable instance of [CheckDepositInstruction].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .amount()
                 * .backImageFileId()
                 * .checkDepositId()
                 * .currency()
                 * .frontImageFileId()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): CheckDepositInstruction =
                    CheckDepositInstruction(
                        checkRequired("amount", amount),
                        checkRequired("backImageFileId", backImageFileId),
                        checkRequired("checkDepositId", checkDepositId),
                        checkRequired("currency", currency),
                        checkRequired("frontImageFileId", frontImageFileId),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): CheckDepositInstruction = apply {
                if (validated) {
                    return@apply
                }

                amount()
                backImageFileId()
                checkDepositId()
                currency().validate()
                frontImageFileId()
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
                (if (amount.asKnown().isPresent) 1 else 0) +
                    (if (backImageFileId.asKnown().isPresent) 1 else 0) +
                    (if (checkDepositId.asKnown().isPresent) 1 else 0) +
                    (currency.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (frontImageFileId.asKnown().isPresent) 1 else 0)

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
             * currency.
             */
            class Currency @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

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
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
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
                    /**
                     * An enum member indicating that [Currency] was instantiated with an unknown
                     * value.
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
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws IncreaseInvalidDataException if this class instance's value is a not a
                 *   known member.
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

                    return /* spotless:off */ other is Currency && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is CheckDepositInstruction && amount == other.amount && backImageFileId == other.backImageFileId && checkDepositId == other.checkDepositId && currency == other.currency && frontImageFileId == other.frontImageFileId && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(amount, backImageFileId, checkDepositId, currency, frontImageFileId, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CheckDepositInstruction{amount=$amount, backImageFileId=$backImageFileId, checkDepositId=$checkDepositId, currency=$currency, frontImageFileId=$frontImageFileId, additionalProperties=$additionalProperties}"
        }

        /**
         * A Check Transfer Instruction object. This field will be present in the JSON response if
         * and only if `category` is equal to `check_transfer_instruction`.
         */
        class CheckTransferInstruction
        private constructor(
            private val amount: JsonField<Long>,
            private val currency: JsonField<Currency>,
            private val transferId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("currency")
                @ExcludeMissing
                currency: JsonField<Currency> = JsonMissing.of(),
                @JsonProperty("transfer_id")
                @ExcludeMissing
                transferId: JsonField<String> = JsonMissing.of(),
            ) : this(amount, currency, transferId, mutableMapOf())

            /**
             * The transfer amount in USD cents.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun amount(): Long = amount.getRequired("amount")

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the check's currency.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun currency(): Currency = currency.getRequired("currency")

            /**
             * The identifier of the Check Transfer that led to this Pending Transaction.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun transferId(): String = transferId.getRequired("transfer_id")

            /**
             * Returns the raw JSON value of [amount].
             *
             * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

            /**
             * Returns the raw JSON value of [currency].
             *
             * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("currency")
            @ExcludeMissing
            fun _currency(): JsonField<Currency> = currency

            /**
             * Returns the raw JSON value of [transferId].
             *
             * Unlike [transferId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("transfer_id")
            @ExcludeMissing
            fun _transferId(): JsonField<String> = transferId

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
                 * [CheckTransferInstruction].
                 *
                 * The following fields are required:
                 * ```java
                 * .amount()
                 * .currency()
                 * .transferId()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [CheckTransferInstruction]. */
            class Builder internal constructor() {

                private var amount: JsonField<Long>? = null
                private var currency: JsonField<Currency>? = null
                private var transferId: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(checkTransferInstruction: CheckTransferInstruction) = apply {
                    amount = checkTransferInstruction.amount
                    currency = checkTransferInstruction.currency
                    transferId = checkTransferInstruction.transferId
                    additionalProperties =
                        checkTransferInstruction.additionalProperties.toMutableMap()
                }

                /** The transfer amount in USD cents. */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /**
                 * Sets [Builder.amount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amount] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the check's
                 * currency.
                 */
                fun currency(currency: Currency) = currency(JsonField.of(currency))

                /**
                 * Sets [Builder.currency] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.currency] with a well-typed [Currency] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                /** The identifier of the Check Transfer that led to this Pending Transaction. */
                fun transferId(transferId: String) = transferId(JsonField.of(transferId))

                /**
                 * Sets [Builder.transferId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.transferId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun transferId(transferId: JsonField<String>) = apply {
                    this.transferId = transferId
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
                 * Returns an immutable instance of [CheckTransferInstruction].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .amount()
                 * .currency()
                 * .transferId()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): CheckTransferInstruction =
                    CheckTransferInstruction(
                        checkRequired("amount", amount),
                        checkRequired("currency", currency),
                        checkRequired("transferId", transferId),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): CheckTransferInstruction = apply {
                if (validated) {
                    return@apply
                }

                amount()
                currency().validate()
                transferId()
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
                (if (amount.asKnown().isPresent) 1 else 0) +
                    (currency.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (transferId.asKnown().isPresent) 1 else 0)

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the check's currency.
             */
            class Currency @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

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
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
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
                    /**
                     * An enum member indicating that [Currency] was instantiated with an unknown
                     * value.
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
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws IncreaseInvalidDataException if this class instance's value is a not a
                 *   known member.
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

                    return /* spotless:off */ other is Currency && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is CheckTransferInstruction && amount == other.amount && currency == other.currency && transferId == other.transferId && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(amount, currency, transferId, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CheckTransferInstruction{amount=$amount, currency=$currency, transferId=$transferId, additionalProperties=$additionalProperties}"
        }

        /**
         * An Inbound Funds Hold object. This field will be present in the JSON response if and only
         * if `category` is equal to `inbound_funds_hold`. We hold funds for certain transaction
         * types to account for return windows where funds might still be clawed back by the sending
         * institution.
         */
        class InboundFundsHold
        private constructor(
            private val id: JsonField<String>,
            private val amount: JsonField<Long>,
            private val automaticallyReleasesAt: JsonField<OffsetDateTime>,
            private val createdAt: JsonField<OffsetDateTime>,
            private val currency: JsonField<Currency>,
            private val heldTransactionId: JsonField<String>,
            private val pendingTransactionId: JsonField<String>,
            private val releasedAt: JsonField<OffsetDateTime>,
            private val status: JsonField<Status>,
            private val type: JsonField<Type>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("automatically_releases_at")
                @ExcludeMissing
                automaticallyReleasesAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("created_at")
                @ExcludeMissing
                createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("currency")
                @ExcludeMissing
                currency: JsonField<Currency> = JsonMissing.of(),
                @JsonProperty("held_transaction_id")
                @ExcludeMissing
                heldTransactionId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("pending_transaction_id")
                @ExcludeMissing
                pendingTransactionId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("released_at")
                @ExcludeMissing
                releasedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("status")
                @ExcludeMissing
                status: JsonField<Status> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            ) : this(
                id,
                amount,
                automaticallyReleasesAt,
                createdAt,
                currency,
                heldTransactionId,
                pendingTransactionId,
                releasedAt,
                status,
                type,
                mutableMapOf(),
            )

            /**
             * The Inbound Funds Hold identifier.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * The held amount in the minor unit of the account's currency. For dollars, for
             * example, this is cents.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun amount(): Long = amount.getRequired("amount")

            /**
             * When the hold will be released automatically. Certain conditions may cause it to be
             * released before this time.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun automaticallyReleasesAt(): OffsetDateTime =
                automaticallyReleasesAt.getRequired("automatically_releases_at")

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the hold was
             * created.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the hold's currency.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun currency(): Currency = currency.getRequired("currency")

            /**
             * The ID of the Transaction for which funds were held.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun heldTransactionId(): Optional<String> =
                heldTransactionId.getOptional("held_transaction_id")

            /**
             * The ID of the Pending Transaction representing the held funds.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun pendingTransactionId(): Optional<String> =
                pendingTransactionId.getOptional("pending_transaction_id")

            /**
             * When the hold was released (if it has been released).
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun releasedAt(): Optional<OffsetDateTime> = releasedAt.getOptional("released_at")

            /**
             * The status of the hold.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun status(): Status = status.getRequired("status")

            /**
             * A constant representing the object's type. For this resource it will always be
             * `inbound_funds_hold`.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): Type = type.getRequired("type")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [amount].
             *
             * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

            /**
             * Returns the raw JSON value of [automaticallyReleasesAt].
             *
             * Unlike [automaticallyReleasesAt], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("automatically_releases_at")
            @ExcludeMissing
            fun _automaticallyReleasesAt(): JsonField<OffsetDateTime> = automaticallyReleasesAt

            /**
             * Returns the raw JSON value of [createdAt].
             *
             * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("created_at")
            @ExcludeMissing
            fun _createdAt(): JsonField<OffsetDateTime> = createdAt

            /**
             * Returns the raw JSON value of [currency].
             *
             * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("currency")
            @ExcludeMissing
            fun _currency(): JsonField<Currency> = currency

            /**
             * Returns the raw JSON value of [heldTransactionId].
             *
             * Unlike [heldTransactionId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("held_transaction_id")
            @ExcludeMissing
            fun _heldTransactionId(): JsonField<String> = heldTransactionId

            /**
             * Returns the raw JSON value of [pendingTransactionId].
             *
             * Unlike [pendingTransactionId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("pending_transaction_id")
            @ExcludeMissing
            fun _pendingTransactionId(): JsonField<String> = pendingTransactionId

            /**
             * Returns the raw JSON value of [releasedAt].
             *
             * Unlike [releasedAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("released_at")
            @ExcludeMissing
            fun _releasedAt(): JsonField<OffsetDateTime> = releasedAt

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
                 * Returns a mutable builder for constructing an instance of [InboundFundsHold].
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .amount()
                 * .automaticallyReleasesAt()
                 * .createdAt()
                 * .currency()
                 * .heldTransactionId()
                 * .pendingTransactionId()
                 * .releasedAt()
                 * .status()
                 * .type()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [InboundFundsHold]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var amount: JsonField<Long>? = null
                private var automaticallyReleasesAt: JsonField<OffsetDateTime>? = null
                private var createdAt: JsonField<OffsetDateTime>? = null
                private var currency: JsonField<Currency>? = null
                private var heldTransactionId: JsonField<String>? = null
                private var pendingTransactionId: JsonField<String>? = null
                private var releasedAt: JsonField<OffsetDateTime>? = null
                private var status: JsonField<Status>? = null
                private var type: JsonField<Type>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(inboundFundsHold: InboundFundsHold) = apply {
                    id = inboundFundsHold.id
                    amount = inboundFundsHold.amount
                    automaticallyReleasesAt = inboundFundsHold.automaticallyReleasesAt
                    createdAt = inboundFundsHold.createdAt
                    currency = inboundFundsHold.currency
                    heldTransactionId = inboundFundsHold.heldTransactionId
                    pendingTransactionId = inboundFundsHold.pendingTransactionId
                    releasedAt = inboundFundsHold.releasedAt
                    status = inboundFundsHold.status
                    type = inboundFundsHold.type
                    additionalProperties = inboundFundsHold.additionalProperties.toMutableMap()
                }

                /** The Inbound Funds Hold identifier. */
                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                /**
                 * The held amount in the minor unit of the account's currency. For dollars, for
                 * example, this is cents.
                 */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /**
                 * Sets [Builder.amount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amount] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /**
                 * When the hold will be released automatically. Certain conditions may cause it to
                 * be released before this time.
                 */
                fun automaticallyReleasesAt(automaticallyReleasesAt: OffsetDateTime) =
                    automaticallyReleasesAt(JsonField.of(automaticallyReleasesAt))

                /**
                 * Sets [Builder.automaticallyReleasesAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.automaticallyReleasesAt] with a well-typed
                 * [OffsetDateTime] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun automaticallyReleasesAt(automaticallyReleasesAt: JsonField<OffsetDateTime>) =
                    apply {
                        this.automaticallyReleasesAt = automaticallyReleasesAt
                    }

                /**
                 * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the hold was
                 * created.
                 */
                fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

                /**
                 * Sets [Builder.createdAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                    this.createdAt = createdAt
                }

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the hold's
                 * currency.
                 */
                fun currency(currency: Currency) = currency(JsonField.of(currency))

                /**
                 * Sets [Builder.currency] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.currency] with a well-typed [Currency] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                /** The ID of the Transaction for which funds were held. */
                fun heldTransactionId(heldTransactionId: String?) =
                    heldTransactionId(JsonField.ofNullable(heldTransactionId))

                /**
                 * Alias for calling [Builder.heldTransactionId] with
                 * `heldTransactionId.orElse(null)`.
                 */
                fun heldTransactionId(heldTransactionId: Optional<String>) =
                    heldTransactionId(heldTransactionId.getOrNull())

                /**
                 * Sets [Builder.heldTransactionId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.heldTransactionId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun heldTransactionId(heldTransactionId: JsonField<String>) = apply {
                    this.heldTransactionId = heldTransactionId
                }

                /** The ID of the Pending Transaction representing the held funds. */
                fun pendingTransactionId(pendingTransactionId: String?) =
                    pendingTransactionId(JsonField.ofNullable(pendingTransactionId))

                /**
                 * Alias for calling [Builder.pendingTransactionId] with
                 * `pendingTransactionId.orElse(null)`.
                 */
                fun pendingTransactionId(pendingTransactionId: Optional<String>) =
                    pendingTransactionId(pendingTransactionId.getOrNull())

                /**
                 * Sets [Builder.pendingTransactionId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.pendingTransactionId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun pendingTransactionId(pendingTransactionId: JsonField<String>) = apply {
                    this.pendingTransactionId = pendingTransactionId
                }

                /** When the hold was released (if it has been released). */
                fun releasedAt(releasedAt: OffsetDateTime?) =
                    releasedAt(JsonField.ofNullable(releasedAt))

                /** Alias for calling [Builder.releasedAt] with `releasedAt.orElse(null)`. */
                fun releasedAt(releasedAt: Optional<OffsetDateTime>) =
                    releasedAt(releasedAt.getOrNull())

                /**
                 * Sets [Builder.releasedAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.releasedAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun releasedAt(releasedAt: JsonField<OffsetDateTime>) = apply {
                    this.releasedAt = releasedAt
                }

                /** The status of the hold. */
                fun status(status: Status) = status(JsonField.of(status))

                /**
                 * Sets [Builder.status] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.status] with a well-typed [Status] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun status(status: JsonField<Status>) = apply { this.status = status }

                /**
                 * A constant representing the object's type. For this resource it will always be
                 * `inbound_funds_hold`.
                 */
                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

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
                 * Returns an immutable instance of [InboundFundsHold].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .amount()
                 * .automaticallyReleasesAt()
                 * .createdAt()
                 * .currency()
                 * .heldTransactionId()
                 * .pendingTransactionId()
                 * .releasedAt()
                 * .status()
                 * .type()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): InboundFundsHold =
                    InboundFundsHold(
                        checkRequired("id", id),
                        checkRequired("amount", amount),
                        checkRequired("automaticallyReleasesAt", automaticallyReleasesAt),
                        checkRequired("createdAt", createdAt),
                        checkRequired("currency", currency),
                        checkRequired("heldTransactionId", heldTransactionId),
                        checkRequired("pendingTransactionId", pendingTransactionId),
                        checkRequired("releasedAt", releasedAt),
                        checkRequired("status", status),
                        checkRequired("type", type),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): InboundFundsHold = apply {
                if (validated) {
                    return@apply
                }

                id()
                amount()
                automaticallyReleasesAt()
                createdAt()
                currency().validate()
                heldTransactionId()
                pendingTransactionId()
                releasedAt()
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (id.asKnown().isPresent) 1 else 0) +
                    (if (amount.asKnown().isPresent) 1 else 0) +
                    (if (automaticallyReleasesAt.asKnown().isPresent) 1 else 0) +
                    (if (createdAt.asKnown().isPresent) 1 else 0) +
                    (currency.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (heldTransactionId.asKnown().isPresent) 1 else 0) +
                    (if (pendingTransactionId.asKnown().isPresent) 1 else 0) +
                    (if (releasedAt.asKnown().isPresent) 1 else 0) +
                    (status.asKnown().getOrNull()?.validity() ?: 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0)

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the hold's currency.
             */
            class Currency @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

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
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
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
                    /**
                     * An enum member indicating that [Currency] was instantiated with an unknown
                     * value.
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
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws IncreaseInvalidDataException if this class instance's value is a not a
                 *   known member.
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

                    return /* spotless:off */ other is Currency && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** The status of the hold. */
            class Status @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

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

                    /** Funds are still being held. */
                    @JvmField val HELD = of("held")

                    /** Funds have been released. */
                    @JvmField val COMPLETE = of("complete")

                    @JvmStatic fun of(value: String) = Status(JsonField.of(value))
                }

                /** An enum containing [Status]'s known values. */
                enum class Known {
                    /** Funds are still being held. */
                    HELD,
                    /** Funds have been released. */
                    COMPLETE,
                }

                /**
                 * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Status] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    /** Funds are still being held. */
                    HELD,
                    /** Funds have been released. */
                    COMPLETE,
                    /**
                     * An enum member indicating that [Status] was instantiated with an unknown
                     * value.
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
                        HELD -> Value.HELD
                        COMPLETE -> Value.COMPLETE
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
                        HELD -> Known.HELD
                        COMPLETE -> Known.COMPLETE
                        else -> throw IncreaseInvalidDataException("Unknown Status: $value")
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

                    return /* spotless:off */ other is Status && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /**
             * A constant representing the object's type. For this resource it will always be
             * `inbound_funds_hold`.
             */
            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

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

                    @JvmField val INBOUND_FUNDS_HOLD = of("inbound_funds_hold")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    INBOUND_FUNDS_HOLD
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    INBOUND_FUNDS_HOLD,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
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
                        INBOUND_FUNDS_HOLD -> Value.INBOUND_FUNDS_HOLD
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
                        INBOUND_FUNDS_HOLD -> Known.INBOUND_FUNDS_HOLD
                        else -> throw IncreaseInvalidDataException("Unknown Type: $value")
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

                    return /* spotless:off */ other is Type && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is InboundFundsHold && id == other.id && amount == other.amount && automaticallyReleasesAt == other.automaticallyReleasesAt && createdAt == other.createdAt && currency == other.currency && heldTransactionId == other.heldTransactionId && pendingTransactionId == other.pendingTransactionId && releasedAt == other.releasedAt && status == other.status && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, amount, automaticallyReleasesAt, createdAt, currency, heldTransactionId, pendingTransactionId, releasedAt, status, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "InboundFundsHold{id=$id, amount=$amount, automaticallyReleasesAt=$automaticallyReleasesAt, createdAt=$createdAt, currency=$currency, heldTransactionId=$heldTransactionId, pendingTransactionId=$pendingTransactionId, releasedAt=$releasedAt, status=$status, type=$type, additionalProperties=$additionalProperties}"
        }

        /**
         * An Inbound Wire Transfer Reversal object. This field will be present in the JSON response
         * if and only if `category` is equal to `inbound_wire_transfer_reversal`. An Inbound Wire
         * Transfer Reversal is created when Increase has received a wire and the User requests that
         * it be reversed.
         */
        class InboundWireTransferReversal
        private constructor(
            private val inboundWireTransferId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("inbound_wire_transfer_id")
                @ExcludeMissing
                inboundWireTransferId: JsonField<String> = JsonMissing.of()
            ) : this(inboundWireTransferId, mutableMapOf())

            /**
             * The ID of the Inbound Wire Transfer that is being reversed.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun inboundWireTransferId(): String =
                inboundWireTransferId.getRequired("inbound_wire_transfer_id")

            /**
             * Returns the raw JSON value of [inboundWireTransferId].
             *
             * Unlike [inboundWireTransferId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("inbound_wire_transfer_id")
            @ExcludeMissing
            fun _inboundWireTransferId(): JsonField<String> = inboundWireTransferId

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
                 * [InboundWireTransferReversal].
                 *
                 * The following fields are required:
                 * ```java
                 * .inboundWireTransferId()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [InboundWireTransferReversal]. */
            class Builder internal constructor() {

                private var inboundWireTransferId: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(inboundWireTransferReversal: InboundWireTransferReversal) =
                    apply {
                        inboundWireTransferId = inboundWireTransferReversal.inboundWireTransferId
                        additionalProperties =
                            inboundWireTransferReversal.additionalProperties.toMutableMap()
                    }

                /** The ID of the Inbound Wire Transfer that is being reversed. */
                fun inboundWireTransferId(inboundWireTransferId: String) =
                    inboundWireTransferId(JsonField.of(inboundWireTransferId))

                /**
                 * Sets [Builder.inboundWireTransferId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.inboundWireTransferId] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun inboundWireTransferId(inboundWireTransferId: JsonField<String>) = apply {
                    this.inboundWireTransferId = inboundWireTransferId
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
                 * Returns an immutable instance of [InboundWireTransferReversal].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .inboundWireTransferId()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): InboundWireTransferReversal =
                    InboundWireTransferReversal(
                        checkRequired("inboundWireTransferId", inboundWireTransferId),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): InboundWireTransferReversal = apply {
                if (validated) {
                    return@apply
                }

                inboundWireTransferId()
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
            internal fun validity(): Int = (if (inboundWireTransferId.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is InboundWireTransferReversal && inboundWireTransferId == other.inboundWireTransferId && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(inboundWireTransferId, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "InboundWireTransferReversal{inboundWireTransferId=$inboundWireTransferId, additionalProperties=$additionalProperties}"
        }

        /**
         * A Real-Time Payments Transfer Instruction object. This field will be present in the JSON
         * response if and only if `category` is equal to `real_time_payments_transfer_instruction`.
         */
        class RealTimePaymentsTransferInstruction
        private constructor(
            private val amount: JsonField<Long>,
            private val transferId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("transfer_id")
                @ExcludeMissing
                transferId: JsonField<String> = JsonMissing.of(),
            ) : this(amount, transferId, mutableMapOf())

            /**
             * The transfer amount in USD cents.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun amount(): Long = amount.getRequired("amount")

            /**
             * The identifier of the Real-Time Payments Transfer that led to this Pending
             * Transaction.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun transferId(): String = transferId.getRequired("transfer_id")

            /**
             * Returns the raw JSON value of [amount].
             *
             * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

            /**
             * Returns the raw JSON value of [transferId].
             *
             * Unlike [transferId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("transfer_id")
            @ExcludeMissing
            fun _transferId(): JsonField<String> = transferId

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
                 * [RealTimePaymentsTransferInstruction].
                 *
                 * The following fields are required:
                 * ```java
                 * .amount()
                 * .transferId()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [RealTimePaymentsTransferInstruction]. */
            class Builder internal constructor() {

                private var amount: JsonField<Long>? = null
                private var transferId: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    realTimePaymentsTransferInstruction: RealTimePaymentsTransferInstruction
                ) = apply {
                    amount = realTimePaymentsTransferInstruction.amount
                    transferId = realTimePaymentsTransferInstruction.transferId
                    additionalProperties =
                        realTimePaymentsTransferInstruction.additionalProperties.toMutableMap()
                }

                /** The transfer amount in USD cents. */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /**
                 * Sets [Builder.amount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amount] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /**
                 * The identifier of the Real-Time Payments Transfer that led to this Pending
                 * Transaction.
                 */
                fun transferId(transferId: String) = transferId(JsonField.of(transferId))

                /**
                 * Sets [Builder.transferId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.transferId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun transferId(transferId: JsonField<String>) = apply {
                    this.transferId = transferId
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
                 * Returns an immutable instance of [RealTimePaymentsTransferInstruction].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .amount()
                 * .transferId()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): RealTimePaymentsTransferInstruction =
                    RealTimePaymentsTransferInstruction(
                        checkRequired("amount", amount),
                        checkRequired("transferId", transferId),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): RealTimePaymentsTransferInstruction = apply {
                if (validated) {
                    return@apply
                }

                amount()
                transferId()
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
                (if (amount.asKnown().isPresent) 1 else 0) +
                    (if (transferId.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is RealTimePaymentsTransferInstruction && amount == other.amount && transferId == other.transferId && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(amount, transferId, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "RealTimePaymentsTransferInstruction{amount=$amount, transferId=$transferId, additionalProperties=$additionalProperties}"
        }

        /**
         * A Wire Transfer Instruction object. This field will be present in the JSON response if
         * and only if `category` is equal to `wire_transfer_instruction`.
         */
        class WireTransferInstruction
        private constructor(
            private val accountNumber: JsonField<String>,
            private val amount: JsonField<Long>,
            private val messageToRecipient: JsonField<String>,
            private val routingNumber: JsonField<String>,
            private val transferId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("account_number")
                @ExcludeMissing
                accountNumber: JsonField<String> = JsonMissing.of(),
                @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("message_to_recipient")
                @ExcludeMissing
                messageToRecipient: JsonField<String> = JsonMissing.of(),
                @JsonProperty("routing_number")
                @ExcludeMissing
                routingNumber: JsonField<String> = JsonMissing.of(),
                @JsonProperty("transfer_id")
                @ExcludeMissing
                transferId: JsonField<String> = JsonMissing.of(),
            ) : this(
                accountNumber,
                amount,
                messageToRecipient,
                routingNumber,
                transferId,
                mutableMapOf(),
            )

            /**
             * The account number for the destination account.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun accountNumber(): String = accountNumber.getRequired("account_number")

            /**
             * The transfer amount in USD cents.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun amount(): Long = amount.getRequired("amount")

            /**
             * The message that will show on the recipient's bank statement.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun messageToRecipient(): String =
                messageToRecipient.getRequired("message_to_recipient")

            /**
             * The American Bankers' Association (ABA) Routing Transit Number (RTN) for the
             * destination account.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun routingNumber(): String = routingNumber.getRequired("routing_number")

            /**
             * The identifier of the Wire Transfer that led to this Pending Transaction.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun transferId(): String = transferId.getRequired("transfer_id")

            /**
             * Returns the raw JSON value of [accountNumber].
             *
             * Unlike [accountNumber], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("account_number")
            @ExcludeMissing
            fun _accountNumber(): JsonField<String> = accountNumber

            /**
             * Returns the raw JSON value of [amount].
             *
             * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

            /**
             * Returns the raw JSON value of [messageToRecipient].
             *
             * Unlike [messageToRecipient], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("message_to_recipient")
            @ExcludeMissing
            fun _messageToRecipient(): JsonField<String> = messageToRecipient

            /**
             * Returns the raw JSON value of [routingNumber].
             *
             * Unlike [routingNumber], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("routing_number")
            @ExcludeMissing
            fun _routingNumber(): JsonField<String> = routingNumber

            /**
             * Returns the raw JSON value of [transferId].
             *
             * Unlike [transferId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("transfer_id")
            @ExcludeMissing
            fun _transferId(): JsonField<String> = transferId

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
                 * [WireTransferInstruction].
                 *
                 * The following fields are required:
                 * ```java
                 * .accountNumber()
                 * .amount()
                 * .messageToRecipient()
                 * .routingNumber()
                 * .transferId()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [WireTransferInstruction]. */
            class Builder internal constructor() {

                private var accountNumber: JsonField<String>? = null
                private var amount: JsonField<Long>? = null
                private var messageToRecipient: JsonField<String>? = null
                private var routingNumber: JsonField<String>? = null
                private var transferId: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(wireTransferInstruction: WireTransferInstruction) = apply {
                    accountNumber = wireTransferInstruction.accountNumber
                    amount = wireTransferInstruction.amount
                    messageToRecipient = wireTransferInstruction.messageToRecipient
                    routingNumber = wireTransferInstruction.routingNumber
                    transferId = wireTransferInstruction.transferId
                    additionalProperties =
                        wireTransferInstruction.additionalProperties.toMutableMap()
                }

                /** The account number for the destination account. */
                fun accountNumber(accountNumber: String) =
                    accountNumber(JsonField.of(accountNumber))

                /**
                 * Sets [Builder.accountNumber] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.accountNumber] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun accountNumber(accountNumber: JsonField<String>) = apply {
                    this.accountNumber = accountNumber
                }

                /** The transfer amount in USD cents. */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /**
                 * Sets [Builder.amount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amount] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /** The message that will show on the recipient's bank statement. */
                fun messageToRecipient(messageToRecipient: String) =
                    messageToRecipient(JsonField.of(messageToRecipient))

                /**
                 * Sets [Builder.messageToRecipient] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.messageToRecipient] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun messageToRecipient(messageToRecipient: JsonField<String>) = apply {
                    this.messageToRecipient = messageToRecipient
                }

                /**
                 * The American Bankers' Association (ABA) Routing Transit Number (RTN) for the
                 * destination account.
                 */
                fun routingNumber(routingNumber: String) =
                    routingNumber(JsonField.of(routingNumber))

                /**
                 * Sets [Builder.routingNumber] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.routingNumber] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun routingNumber(routingNumber: JsonField<String>) = apply {
                    this.routingNumber = routingNumber
                }

                /** The identifier of the Wire Transfer that led to this Pending Transaction. */
                fun transferId(transferId: String) = transferId(JsonField.of(transferId))

                /**
                 * Sets [Builder.transferId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.transferId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun transferId(transferId: JsonField<String>) = apply {
                    this.transferId = transferId
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
                 * Returns an immutable instance of [WireTransferInstruction].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .accountNumber()
                 * .amount()
                 * .messageToRecipient()
                 * .routingNumber()
                 * .transferId()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): WireTransferInstruction =
                    WireTransferInstruction(
                        checkRequired("accountNumber", accountNumber),
                        checkRequired("amount", amount),
                        checkRequired("messageToRecipient", messageToRecipient),
                        checkRequired("routingNumber", routingNumber),
                        checkRequired("transferId", transferId),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): WireTransferInstruction = apply {
                if (validated) {
                    return@apply
                }

                accountNumber()
                amount()
                messageToRecipient()
                routingNumber()
                transferId()
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
                (if (accountNumber.asKnown().isPresent) 1 else 0) +
                    (if (amount.asKnown().isPresent) 1 else 0) +
                    (if (messageToRecipient.asKnown().isPresent) 1 else 0) +
                    (if (routingNumber.asKnown().isPresent) 1 else 0) +
                    (if (transferId.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is WireTransferInstruction && accountNumber == other.accountNumber && amount == other.amount && messageToRecipient == other.messageToRecipient && routingNumber == other.routingNumber && transferId == other.transferId && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(accountNumber, amount, messageToRecipient, routingNumber, transferId, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "WireTransferInstruction{accountNumber=$accountNumber, amount=$amount, messageToRecipient=$messageToRecipient, routingNumber=$routingNumber, transferId=$transferId, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Source && accountTransferInstruction == other.accountTransferInstruction && achTransferInstruction == other.achTransferInstruction && cardAuthorization == other.cardAuthorization && category == other.category && checkDepositInstruction == other.checkDepositInstruction && checkTransferInstruction == other.checkTransferInstruction && inboundFundsHold == other.inboundFundsHold && inboundWireTransferReversal == other.inboundWireTransferReversal && this.other == other.other && realTimePaymentsTransferInstruction == other.realTimePaymentsTransferInstruction && wireTransferInstruction == other.wireTransferInstruction && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(accountTransferInstruction, achTransferInstruction, cardAuthorization, category, checkDepositInstruction, checkTransferInstruction, inboundFundsHold, inboundWireTransferReversal, other, realTimePaymentsTransferInstruction, wireTransferInstruction, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Source{accountTransferInstruction=$accountTransferInstruction, achTransferInstruction=$achTransferInstruction, cardAuthorization=$cardAuthorization, category=$category, checkDepositInstruction=$checkDepositInstruction, checkTransferInstruction=$checkTransferInstruction, inboundFundsHold=$inboundFundsHold, inboundWireTransferReversal=$inboundWireTransferReversal, other=$other, realTimePaymentsTransferInstruction=$realTimePaymentsTransferInstruction, wireTransferInstruction=$wireTransferInstruction, additionalProperties=$additionalProperties}"
    }

    /** Whether the Pending Transaction has been confirmed and has an associated Transaction. */
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

            /** The Pending Transaction is still awaiting confirmation. */
            @JvmField val PENDING = of("pending")

            /**
             * The Pending Transaction is confirmed. An associated Transaction exists for this
             * object. The Pending Transaction will no longer count against your balance and can
             * generally be hidden from UIs, etc.
             */
            @JvmField val COMPLETE = of("complete")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            /** The Pending Transaction is still awaiting confirmation. */
            PENDING,
            /**
             * The Pending Transaction is confirmed. An associated Transaction exists for this
             * object. The Pending Transaction will no longer count against your balance and can
             * generally be hidden from UIs, etc.
             */
            COMPLETE,
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
            /** The Pending Transaction is still awaiting confirmation. */
            PENDING,
            /**
             * The Pending Transaction is confirmed. An associated Transaction exists for this
             * object. The Pending Transaction will no longer count against your balance and can
             * generally be hidden from UIs, etc.
             */
            COMPLETE,
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

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * A constant representing the object's type. For this resource it will always be
     * `pending_transaction`.
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

            @JvmField val PENDING_TRANSACTION = of("pending_transaction")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            PENDING_TRANSACTION
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
            PENDING_TRANSACTION,
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
                PENDING_TRANSACTION -> Value.PENDING_TRANSACTION
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
                PENDING_TRANSACTION -> Known.PENDING_TRANSACTION
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

            return /* spotless:off */ other is Type && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PendingTransaction && id == other.id && accountId == other.accountId && amount == other.amount && completedAt == other.completedAt && createdAt == other.createdAt && currency == other.currency && description == other.description && routeId == other.routeId && routeType == other.routeType && source == other.source && status == other.status && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, accountId, amount, completedAt, createdAt, currency, description, routeId, routeType, source, status, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PendingTransaction{id=$id, accountId=$accountId, amount=$amount, completedAt=$completedAt, createdAt=$createdAt, currency=$currency, description=$description, routeId=$routeId, routeType=$routeType, source=$source, status=$status, type=$type, additionalProperties=$additionalProperties}"
}
