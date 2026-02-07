// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.declinedtransactions

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
 * Declined Transactions are refused additions and removals of money from your bank account. For
 * example, Declined Transactions are caused when your Account has an insufficient balance or your
 * Limits are triggered.
 */
class DeclinedTransaction
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val accountId: JsonField<String>,
    private val amount: JsonField<Long>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val currency: JsonField<Currency>,
    private val description: JsonField<String>,
    private val routeId: JsonField<String>,
    private val routeType: JsonField<RouteType>,
    private val source: JsonField<Source>,
    private val type: JsonField<Type>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("account_id") @ExcludeMissing accountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
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
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
    ) : this(
        id,
        accountId,
        amount,
        createdAt,
        currency,
        description,
        routeId,
        routeType,
        source,
        type,
        mutableMapOf(),
    )

    /**
     * The Declined Transaction identifier.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The identifier for the Account the Declined Transaction belongs to.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountId(): String = accountId.getRequired("account_id")

    /**
     * The Declined Transaction amount in the minor unit of its currency. For dollars, for example,
     * this is cents.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amount(): Long = amount.getRequired("amount")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date on which the Transaction
     * occurred.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the Declined Transaction's
     * currency. This will match the currency on the Declined Transaction's Account.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currency(): Currency = currency.getRequired("currency")

    /**
     * This is the description the vendor provides.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun description(): String = description.getRequired("description")

    /**
     * The identifier for the route this Declined Transaction came through. Routes are things like
     * cards and ACH details.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun routeId(): Optional<String> = routeId.getOptional("route_id")

    /**
     * The type of the route this Declined Transaction came through.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun routeType(): Optional<RouteType> = routeType.getOptional("route_type")

    /**
     * This is an object giving more details on the network-level event that caused the Declined
     * Transaction. For example, for a card transaction this lists the merchant's industry and
     * location. Note that for backwards compatibility reasons, additional undocumented keys may
     * appear in this object. These should be treated as deprecated and will be removed in the
     * future.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun source(): Source = source.getRequired("source")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `declined_transaction`.
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
         * Returns a mutable builder for constructing an instance of [DeclinedTransaction].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .accountId()
         * .amount()
         * .createdAt()
         * .currency()
         * .description()
         * .routeId()
         * .routeType()
         * .source()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DeclinedTransaction]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var accountId: JsonField<String>? = null
        private var amount: JsonField<Long>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var currency: JsonField<Currency>? = null
        private var description: JsonField<String>? = null
        private var routeId: JsonField<String>? = null
        private var routeType: JsonField<RouteType>? = null
        private var source: JsonField<Source>? = null
        private var type: JsonField<Type>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(declinedTransaction: DeclinedTransaction) = apply {
            id = declinedTransaction.id
            accountId = declinedTransaction.accountId
            amount = declinedTransaction.amount
            createdAt = declinedTransaction.createdAt
            currency = declinedTransaction.currency
            description = declinedTransaction.description
            routeId = declinedTransaction.routeId
            routeType = declinedTransaction.routeType
            source = declinedTransaction.source
            type = declinedTransaction.type
            additionalProperties = declinedTransaction.additionalProperties.toMutableMap()
        }

        /** The Declined Transaction identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The identifier for the Account the Declined Transaction belongs to. */
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
         * The Declined Transaction amount in the minor unit of its currency. For dollars, for
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
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date on which the Transaction
         * occurred.
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
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the Declined
         * Transaction's currency. This will match the currency on the Declined Transaction's
         * Account.
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

        /** This is the description the vendor provides. */
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
         * The identifier for the route this Declined Transaction came through. Routes are things
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

        /** The type of the route this Declined Transaction came through. */
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
         * This is an object giving more details on the network-level event that caused the Declined
         * Transaction. For example, for a card transaction this lists the merchant's industry and
         * location. Note that for backwards compatibility reasons, additional undocumented keys may
         * appear in this object. These should be treated as deprecated and will be removed in the
         * future.
         */
        fun source(source: Source) = source(JsonField.of(source))

        /**
         * Sets [Builder.source] to an arbitrary JSON value.
         *
         * You should usually call [Builder.source] with a well-typed [Source] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun source(source: JsonField<Source>) = apply { this.source = source }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `declined_transaction`.
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
         * Returns an immutable instance of [DeclinedTransaction].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .accountId()
         * .amount()
         * .createdAt()
         * .currency()
         * .description()
         * .routeId()
         * .routeType()
         * .source()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DeclinedTransaction =
            DeclinedTransaction(
                checkRequired("id", id),
                checkRequired("accountId", accountId),
                checkRequired("amount", amount),
                checkRequired("createdAt", createdAt),
                checkRequired("currency", currency),
                checkRequired("description", description),
                checkRequired("routeId", routeId),
                checkRequired("routeType", routeType),
                checkRequired("source", source),
                checkRequired("type", type),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): DeclinedTransaction = apply {
        if (validated) {
            return@apply
        }

        id()
        accountId()
        amount()
        createdAt()
        currency().validate()
        description()
        routeId()
        routeType().ifPresent { it.validate() }
        source().validate()
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
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (currency.asKnown().getOrNull()?.validity() ?: 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (routeId.asKnown().isPresent) 1 else 0) +
            (routeType.asKnown().getOrNull()?.validity() ?: 0) +
            (source.asKnown().getOrNull()?.validity() ?: 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0)

    /**
     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the Declined Transaction's
     * currency. This will match the currency on the Declined Transaction's Account.
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

            /** US Dollar (USD) */
            @JvmField val USD = of("USD")

            @JvmStatic fun of(value: String) = Currency(JsonField.of(value))
        }

        /** An enum containing [Currency]'s known values. */
        enum class Known {
            /** US Dollar (USD) */
            USD
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

    /** The type of the route this Declined Transaction came through. */
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

            return other is RouteType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * This is an object giving more details on the network-level event that caused the Declined
     * Transaction. For example, for a card transaction this lists the merchant's industry and
     * location. Note that for backwards compatibility reasons, additional undocumented keys may
     * appear in this object. These should be treated as deprecated and will be removed in the
     * future.
     */
    class Source
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val category: JsonField<Category>,
        private val achDecline: JsonField<AchDecline>,
        private val cardDecline: JsonField<CardDecline>,
        private val checkDecline: JsonField<CheckDecline>,
        private val checkDepositRejection: JsonField<CheckDepositRejection>,
        private val inboundFednowTransferDecline: JsonField<InboundFednowTransferDecline>,
        private val inboundRealTimePaymentsTransferDecline:
            JsonField<InboundRealTimePaymentsTransferDecline>,
        private val other: JsonField<Other>,
        private val wireDecline: JsonField<WireDecline>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("category")
            @ExcludeMissing
            category: JsonField<Category> = JsonMissing.of(),
            @JsonProperty("ach_decline")
            @ExcludeMissing
            achDecline: JsonField<AchDecline> = JsonMissing.of(),
            @JsonProperty("card_decline")
            @ExcludeMissing
            cardDecline: JsonField<CardDecline> = JsonMissing.of(),
            @JsonProperty("check_decline")
            @ExcludeMissing
            checkDecline: JsonField<CheckDecline> = JsonMissing.of(),
            @JsonProperty("check_deposit_rejection")
            @ExcludeMissing
            checkDepositRejection: JsonField<CheckDepositRejection> = JsonMissing.of(),
            @JsonProperty("inbound_fednow_transfer_decline")
            @ExcludeMissing
            inboundFednowTransferDecline: JsonField<InboundFednowTransferDecline> =
                JsonMissing.of(),
            @JsonProperty("inbound_real_time_payments_transfer_decline")
            @ExcludeMissing
            inboundRealTimePaymentsTransferDecline:
                JsonField<InboundRealTimePaymentsTransferDecline> =
                JsonMissing.of(),
            @JsonProperty("other") @ExcludeMissing other: JsonField<Other> = JsonMissing.of(),
            @JsonProperty("wire_decline")
            @ExcludeMissing
            wireDecline: JsonField<WireDecline> = JsonMissing.of(),
        ) : this(
            category,
            achDecline,
            cardDecline,
            checkDecline,
            checkDepositRejection,
            inboundFednowTransferDecline,
            inboundRealTimePaymentsTransferDecline,
            other,
            wireDecline,
            mutableMapOf(),
        )

        /**
         * The type of the resource. We may add additional possible values for this enum over time;
         * your application should be able to handle such additions gracefully.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun category(): Category = category.getRequired("category")

        /**
         * An ACH Decline object. This field will be present in the JSON response if and only if
         * `category` is equal to `ach_decline`.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun achDecline(): Optional<AchDecline> = achDecline.getOptional("ach_decline")

        /**
         * A Card Decline object. This field will be present in the JSON response if and only if
         * `category` is equal to `card_decline`.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun cardDecline(): Optional<CardDecline> = cardDecline.getOptional("card_decline")

        /**
         * A Check Decline object. This field will be present in the JSON response if and only if
         * `category` is equal to `check_decline`.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun checkDecline(): Optional<CheckDecline> = checkDecline.getOptional("check_decline")

        /**
         * A Check Deposit Rejection object. This field will be present in the JSON response if and
         * only if `category` is equal to `check_deposit_rejection`.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun checkDepositRejection(): Optional<CheckDepositRejection> =
            checkDepositRejection.getOptional("check_deposit_rejection")

        /**
         * An Inbound FedNow Transfer Decline object. This field will be present in the JSON
         * response if and only if `category` is equal to `inbound_fednow_transfer_decline`.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun inboundFednowTransferDecline(): Optional<InboundFednowTransferDecline> =
            inboundFednowTransferDecline.getOptional("inbound_fednow_transfer_decline")

        /**
         * An Inbound Real-Time Payments Transfer Decline object. This field will be present in the
         * JSON response if and only if `category` is equal to
         * `inbound_real_time_payments_transfer_decline`.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun inboundRealTimePaymentsTransferDecline():
            Optional<InboundRealTimePaymentsTransferDecline> =
            inboundRealTimePaymentsTransferDecline.getOptional(
                "inbound_real_time_payments_transfer_decline"
            )

        /**
         * If the category of this Transaction source is equal to `other`, this field will contain
         * an empty object, otherwise it will contain null.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun other(): Optional<Other> = other.getOptional("other")

        /**
         * A Wire Decline object. This field will be present in the JSON response if and only if
         * `category` is equal to `wire_decline`.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun wireDecline(): Optional<WireDecline> = wireDecline.getOptional("wire_decline")

        /**
         * Returns the raw JSON value of [category].
         *
         * Unlike [category], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("category") @ExcludeMissing fun _category(): JsonField<Category> = category

        /**
         * Returns the raw JSON value of [achDecline].
         *
         * Unlike [achDecline], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ach_decline")
        @ExcludeMissing
        fun _achDecline(): JsonField<AchDecline> = achDecline

        /**
         * Returns the raw JSON value of [cardDecline].
         *
         * Unlike [cardDecline], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("card_decline")
        @ExcludeMissing
        fun _cardDecline(): JsonField<CardDecline> = cardDecline

        /**
         * Returns the raw JSON value of [checkDecline].
         *
         * Unlike [checkDecline], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("check_decline")
        @ExcludeMissing
        fun _checkDecline(): JsonField<CheckDecline> = checkDecline

        /**
         * Returns the raw JSON value of [checkDepositRejection].
         *
         * Unlike [checkDepositRejection], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("check_deposit_rejection")
        @ExcludeMissing
        fun _checkDepositRejection(): JsonField<CheckDepositRejection> = checkDepositRejection

        /**
         * Returns the raw JSON value of [inboundFednowTransferDecline].
         *
         * Unlike [inboundFednowTransferDecline], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("inbound_fednow_transfer_decline")
        @ExcludeMissing
        fun _inboundFednowTransferDecline(): JsonField<InboundFednowTransferDecline> =
            inboundFednowTransferDecline

        /**
         * Returns the raw JSON value of [inboundRealTimePaymentsTransferDecline].
         *
         * Unlike [inboundRealTimePaymentsTransferDecline], this method doesn't throw if the JSON
         * field has an unexpected type.
         */
        @JsonProperty("inbound_real_time_payments_transfer_decline")
        @ExcludeMissing
        fun _inboundRealTimePaymentsTransferDecline():
            JsonField<InboundRealTimePaymentsTransferDecline> =
            inboundRealTimePaymentsTransferDecline

        /**
         * Returns the raw JSON value of [other].
         *
         * Unlike [other], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("other") @ExcludeMissing fun _other(): JsonField<Other> = other

        /**
         * Returns the raw JSON value of [wireDecline].
         *
         * Unlike [wireDecline], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("wire_decline")
        @ExcludeMissing
        fun _wireDecline(): JsonField<WireDecline> = wireDecline

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
             * .category()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Source]. */
        class Builder internal constructor() {

            private var category: JsonField<Category>? = null
            private var achDecline: JsonField<AchDecline> = JsonMissing.of()
            private var cardDecline: JsonField<CardDecline> = JsonMissing.of()
            private var checkDecline: JsonField<CheckDecline> = JsonMissing.of()
            private var checkDepositRejection: JsonField<CheckDepositRejection> = JsonMissing.of()
            private var inboundFednowTransferDecline: JsonField<InboundFednowTransferDecline> =
                JsonMissing.of()
            private var inboundRealTimePaymentsTransferDecline:
                JsonField<InboundRealTimePaymentsTransferDecline> =
                JsonMissing.of()
            private var other: JsonField<Other> = JsonMissing.of()
            private var wireDecline: JsonField<WireDecline> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(source: Source) = apply {
                category = source.category
                achDecline = source.achDecline
                cardDecline = source.cardDecline
                checkDecline = source.checkDecline
                checkDepositRejection = source.checkDepositRejection
                inboundFednowTransferDecline = source.inboundFednowTransferDecline
                inboundRealTimePaymentsTransferDecline =
                    source.inboundRealTimePaymentsTransferDecline
                other = source.other
                wireDecline = source.wireDecline
                additionalProperties = source.additionalProperties.toMutableMap()
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
             * An ACH Decline object. This field will be present in the JSON response if and only if
             * `category` is equal to `ach_decline`.
             */
            fun achDecline(achDecline: AchDecline?) = achDecline(JsonField.ofNullable(achDecline))

            /** Alias for calling [Builder.achDecline] with `achDecline.orElse(null)`. */
            fun achDecline(achDecline: Optional<AchDecline>) = achDecline(achDecline.getOrNull())

            /**
             * Sets [Builder.achDecline] to an arbitrary JSON value.
             *
             * You should usually call [Builder.achDecline] with a well-typed [AchDecline] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun achDecline(achDecline: JsonField<AchDecline>) = apply {
                this.achDecline = achDecline
            }

            /**
             * A Card Decline object. This field will be present in the JSON response if and only if
             * `category` is equal to `card_decline`.
             */
            fun cardDecline(cardDecline: CardDecline?) =
                cardDecline(JsonField.ofNullable(cardDecline))

            /** Alias for calling [Builder.cardDecline] with `cardDecline.orElse(null)`. */
            fun cardDecline(cardDecline: Optional<CardDecline>) =
                cardDecline(cardDecline.getOrNull())

            /**
             * Sets [Builder.cardDecline] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cardDecline] with a well-typed [CardDecline] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cardDecline(cardDecline: JsonField<CardDecline>) = apply {
                this.cardDecline = cardDecline
            }

            /**
             * A Check Decline object. This field will be present in the JSON response if and only
             * if `category` is equal to `check_decline`.
             */
            fun checkDecline(checkDecline: CheckDecline?) =
                checkDecline(JsonField.ofNullable(checkDecline))

            /** Alias for calling [Builder.checkDecline] with `checkDecline.orElse(null)`. */
            fun checkDecline(checkDecline: Optional<CheckDecline>) =
                checkDecline(checkDecline.getOrNull())

            /**
             * Sets [Builder.checkDecline] to an arbitrary JSON value.
             *
             * You should usually call [Builder.checkDecline] with a well-typed [CheckDecline] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun checkDecline(checkDecline: JsonField<CheckDecline>) = apply {
                this.checkDecline = checkDecline
            }

            /**
             * A Check Deposit Rejection object. This field will be present in the JSON response if
             * and only if `category` is equal to `check_deposit_rejection`.
             */
            fun checkDepositRejection(checkDepositRejection: CheckDepositRejection?) =
                checkDepositRejection(JsonField.ofNullable(checkDepositRejection))

            /**
             * Alias for calling [Builder.checkDepositRejection] with
             * `checkDepositRejection.orElse(null)`.
             */
            fun checkDepositRejection(checkDepositRejection: Optional<CheckDepositRejection>) =
                checkDepositRejection(checkDepositRejection.getOrNull())

            /**
             * Sets [Builder.checkDepositRejection] to an arbitrary JSON value.
             *
             * You should usually call [Builder.checkDepositRejection] with a well-typed
             * [CheckDepositRejection] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun checkDepositRejection(checkDepositRejection: JsonField<CheckDepositRejection>) =
                apply {
                    this.checkDepositRejection = checkDepositRejection
                }

            /**
             * An Inbound FedNow Transfer Decline object. This field will be present in the JSON
             * response if and only if `category` is equal to `inbound_fednow_transfer_decline`.
             */
            fun inboundFednowTransferDecline(
                inboundFednowTransferDecline: InboundFednowTransferDecline?
            ) = inboundFednowTransferDecline(JsonField.ofNullable(inboundFednowTransferDecline))

            /**
             * Alias for calling [Builder.inboundFednowTransferDecline] with
             * `inboundFednowTransferDecline.orElse(null)`.
             */
            fun inboundFednowTransferDecline(
                inboundFednowTransferDecline: Optional<InboundFednowTransferDecline>
            ) = inboundFednowTransferDecline(inboundFednowTransferDecline.getOrNull())

            /**
             * Sets [Builder.inboundFednowTransferDecline] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inboundFednowTransferDecline] with a well-typed
             * [InboundFednowTransferDecline] value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun inboundFednowTransferDecline(
                inboundFednowTransferDecline: JsonField<InboundFednowTransferDecline>
            ) = apply { this.inboundFednowTransferDecline = inboundFednowTransferDecline }

            /**
             * An Inbound Real-Time Payments Transfer Decline object. This field will be present in
             * the JSON response if and only if `category` is equal to
             * `inbound_real_time_payments_transfer_decline`.
             */
            fun inboundRealTimePaymentsTransferDecline(
                inboundRealTimePaymentsTransferDecline: InboundRealTimePaymentsTransferDecline?
            ) =
                inboundRealTimePaymentsTransferDecline(
                    JsonField.ofNullable(inboundRealTimePaymentsTransferDecline)
                )

            /**
             * Alias for calling [Builder.inboundRealTimePaymentsTransferDecline] with
             * `inboundRealTimePaymentsTransferDecline.orElse(null)`.
             */
            fun inboundRealTimePaymentsTransferDecline(
                inboundRealTimePaymentsTransferDecline:
                    Optional<InboundRealTimePaymentsTransferDecline>
            ) =
                inboundRealTimePaymentsTransferDecline(
                    inboundRealTimePaymentsTransferDecline.getOrNull()
                )

            /**
             * Sets [Builder.inboundRealTimePaymentsTransferDecline] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inboundRealTimePaymentsTransferDecline] with a
             * well-typed [InboundRealTimePaymentsTransferDecline] value instead. This method is
             * primarily for setting the field to an undocumented or not yet supported value.
             */
            fun inboundRealTimePaymentsTransferDecline(
                inboundRealTimePaymentsTransferDecline:
                    JsonField<InboundRealTimePaymentsTransferDecline>
            ) = apply {
                this.inboundRealTimePaymentsTransferDecline = inboundRealTimePaymentsTransferDecline
            }

            /**
             * If the category of this Transaction source is equal to `other`, this field will
             * contain an empty object, otherwise it will contain null.
             */
            fun other(other: Other?) = other(JsonField.ofNullable(other))

            /** Alias for calling [Builder.other] with `other.orElse(null)`. */
            fun other(other: Optional<Other>) = other(other.getOrNull())

            /**
             * Sets [Builder.other] to an arbitrary JSON value.
             *
             * You should usually call [Builder.other] with a well-typed [Other] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun other(other: JsonField<Other>) = apply { this.other = other }

            /**
             * A Wire Decline object. This field will be present in the JSON response if and only if
             * `category` is equal to `wire_decline`.
             */
            fun wireDecline(wireDecline: WireDecline?) =
                wireDecline(JsonField.ofNullable(wireDecline))

            /** Alias for calling [Builder.wireDecline] with `wireDecline.orElse(null)`. */
            fun wireDecline(wireDecline: Optional<WireDecline>) =
                wireDecline(wireDecline.getOrNull())

            /**
             * Sets [Builder.wireDecline] to an arbitrary JSON value.
             *
             * You should usually call [Builder.wireDecline] with a well-typed [WireDecline] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun wireDecline(wireDecline: JsonField<WireDecline>) = apply {
                this.wireDecline = wireDecline
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
             * Returns an immutable instance of [Source].
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
            fun build(): Source =
                Source(
                    checkRequired("category", category),
                    achDecline,
                    cardDecline,
                    checkDecline,
                    checkDepositRejection,
                    inboundFednowTransferDecline,
                    inboundRealTimePaymentsTransferDecline,
                    other,
                    wireDecline,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Source = apply {
            if (validated) {
                return@apply
            }

            category().validate()
            achDecline().ifPresent { it.validate() }
            cardDecline().ifPresent { it.validate() }
            checkDecline().ifPresent { it.validate() }
            checkDepositRejection().ifPresent { it.validate() }
            inboundFednowTransferDecline().ifPresent { it.validate() }
            inboundRealTimePaymentsTransferDecline().ifPresent { it.validate() }
            other().ifPresent { it.validate() }
            wireDecline().ifPresent { it.validate() }
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
                (achDecline.asKnown().getOrNull()?.validity() ?: 0) +
                (cardDecline.asKnown().getOrNull()?.validity() ?: 0) +
                (checkDecline.asKnown().getOrNull()?.validity() ?: 0) +
                (checkDepositRejection.asKnown().getOrNull()?.validity() ?: 0) +
                (inboundFednowTransferDecline.asKnown().getOrNull()?.validity() ?: 0) +
                (inboundRealTimePaymentsTransferDecline.asKnown().getOrNull()?.validity() ?: 0) +
                (other.asKnown().getOrNull()?.validity() ?: 0) +
                (wireDecline.asKnown().getOrNull()?.validity() ?: 0)

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

                /** ACH Decline: details will be under the `ach_decline` object. */
                @JvmField val ACH_DECLINE = of("ach_decline")

                /** Card Decline: details will be under the `card_decline` object. */
                @JvmField val CARD_DECLINE = of("card_decline")

                /** Check Decline: details will be under the `check_decline` object. */
                @JvmField val CHECK_DECLINE = of("check_decline")

                /**
                 * Inbound Real-Time Payments Transfer Decline: details will be under the
                 * `inbound_real_time_payments_transfer_decline` object.
                 */
                @JvmField
                val INBOUND_REAL_TIME_PAYMENTS_TRANSFER_DECLINE =
                    of("inbound_real_time_payments_transfer_decline")

                /**
                 * Inbound FedNow Transfer Decline: details will be under the
                 * `inbound_fednow_transfer_decline` object.
                 */
                @JvmField
                val INBOUND_FEDNOW_TRANSFER_DECLINE = of("inbound_fednow_transfer_decline")

                /** Wire Decline: details will be under the `wire_decline` object. */
                @JvmField val WIRE_DECLINE = of("wire_decline")

                /**
                 * Check Deposit Rejection: details will be under the `check_deposit_rejection`
                 * object.
                 */
                @JvmField val CHECK_DEPOSIT_REJECTION = of("check_deposit_rejection")

                /** The Declined Transaction was made for an undocumented or deprecated reason. */
                @JvmField val OTHER = of("other")

                @JvmStatic fun of(value: String) = Category(JsonField.of(value))
            }

            /** An enum containing [Category]'s known values. */
            enum class Known {
                /** ACH Decline: details will be under the `ach_decline` object. */
                ACH_DECLINE,
                /** Card Decline: details will be under the `card_decline` object. */
                CARD_DECLINE,
                /** Check Decline: details will be under the `check_decline` object. */
                CHECK_DECLINE,
                /**
                 * Inbound Real-Time Payments Transfer Decline: details will be under the
                 * `inbound_real_time_payments_transfer_decline` object.
                 */
                INBOUND_REAL_TIME_PAYMENTS_TRANSFER_DECLINE,
                /**
                 * Inbound FedNow Transfer Decline: details will be under the
                 * `inbound_fednow_transfer_decline` object.
                 */
                INBOUND_FEDNOW_TRANSFER_DECLINE,
                /** Wire Decline: details will be under the `wire_decline` object. */
                WIRE_DECLINE,
                /**
                 * Check Deposit Rejection: details will be under the `check_deposit_rejection`
                 * object.
                 */
                CHECK_DEPOSIT_REJECTION,
                /** The Declined Transaction was made for an undocumented or deprecated reason. */
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
                /** ACH Decline: details will be under the `ach_decline` object. */
                ACH_DECLINE,
                /** Card Decline: details will be under the `card_decline` object. */
                CARD_DECLINE,
                /** Check Decline: details will be under the `check_decline` object. */
                CHECK_DECLINE,
                /**
                 * Inbound Real-Time Payments Transfer Decline: details will be under the
                 * `inbound_real_time_payments_transfer_decline` object.
                 */
                INBOUND_REAL_TIME_PAYMENTS_TRANSFER_DECLINE,
                /**
                 * Inbound FedNow Transfer Decline: details will be under the
                 * `inbound_fednow_transfer_decline` object.
                 */
                INBOUND_FEDNOW_TRANSFER_DECLINE,
                /** Wire Decline: details will be under the `wire_decline` object. */
                WIRE_DECLINE,
                /**
                 * Check Deposit Rejection: details will be under the `check_deposit_rejection`
                 * object.
                 */
                CHECK_DEPOSIT_REJECTION,
                /** The Declined Transaction was made for an undocumented or deprecated reason. */
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
                    ACH_DECLINE -> Value.ACH_DECLINE
                    CARD_DECLINE -> Value.CARD_DECLINE
                    CHECK_DECLINE -> Value.CHECK_DECLINE
                    INBOUND_REAL_TIME_PAYMENTS_TRANSFER_DECLINE ->
                        Value.INBOUND_REAL_TIME_PAYMENTS_TRANSFER_DECLINE
                    INBOUND_FEDNOW_TRANSFER_DECLINE -> Value.INBOUND_FEDNOW_TRANSFER_DECLINE
                    WIRE_DECLINE -> Value.WIRE_DECLINE
                    CHECK_DEPOSIT_REJECTION -> Value.CHECK_DEPOSIT_REJECTION
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
                    ACH_DECLINE -> Known.ACH_DECLINE
                    CARD_DECLINE -> Known.CARD_DECLINE
                    CHECK_DECLINE -> Known.CHECK_DECLINE
                    INBOUND_REAL_TIME_PAYMENTS_TRANSFER_DECLINE ->
                        Known.INBOUND_REAL_TIME_PAYMENTS_TRANSFER_DECLINE
                    INBOUND_FEDNOW_TRANSFER_DECLINE -> Known.INBOUND_FEDNOW_TRANSFER_DECLINE
                    WIRE_DECLINE -> Known.WIRE_DECLINE
                    CHECK_DEPOSIT_REJECTION -> Known.CHECK_DEPOSIT_REJECTION
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

                return other is Category && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * An ACH Decline object. This field will be present in the JSON response if and only if
         * `category` is equal to `ach_decline`.
         */
        class AchDecline
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val id: JsonField<String>,
            private val amount: JsonField<Long>,
            private val inboundAchTransferId: JsonField<String>,
            private val originatorCompanyDescriptiveDate: JsonField<String>,
            private val originatorCompanyDiscretionaryData: JsonField<String>,
            private val originatorCompanyId: JsonField<String>,
            private val originatorCompanyName: JsonField<String>,
            private val reason: JsonField<Reason>,
            private val receiverIdNumber: JsonField<String>,
            private val receiverName: JsonField<String>,
            private val traceNumber: JsonField<String>,
            private val type: JsonField<Type>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("inbound_ach_transfer_id")
                @ExcludeMissing
                inboundAchTransferId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("originator_company_descriptive_date")
                @ExcludeMissing
                originatorCompanyDescriptiveDate: JsonField<String> = JsonMissing.of(),
                @JsonProperty("originator_company_discretionary_data")
                @ExcludeMissing
                originatorCompanyDiscretionaryData: JsonField<String> = JsonMissing.of(),
                @JsonProperty("originator_company_id")
                @ExcludeMissing
                originatorCompanyId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("originator_company_name")
                @ExcludeMissing
                originatorCompanyName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("reason")
                @ExcludeMissing
                reason: JsonField<Reason> = JsonMissing.of(),
                @JsonProperty("receiver_id_number")
                @ExcludeMissing
                receiverIdNumber: JsonField<String> = JsonMissing.of(),
                @JsonProperty("receiver_name")
                @ExcludeMissing
                receiverName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("trace_number")
                @ExcludeMissing
                traceNumber: JsonField<String> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            ) : this(
                id,
                amount,
                inboundAchTransferId,
                originatorCompanyDescriptiveDate,
                originatorCompanyDiscretionaryData,
                originatorCompanyId,
                originatorCompanyName,
                reason,
                receiverIdNumber,
                receiverName,
                traceNumber,
                type,
                mutableMapOf(),
            )

            /**
             * The ACH Decline's identifier.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * The declined amount in USD cents.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun amount(): Long = amount.getRequired("amount")

            /**
             * The identifier of the Inbound ACH Transfer object associated with this decline.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun inboundAchTransferId(): String =
                inboundAchTransferId.getRequired("inbound_ach_transfer_id")

            /**
             * The descriptive date of the transfer.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun originatorCompanyDescriptiveDate(): Optional<String> =
                originatorCompanyDescriptiveDate.getOptional("originator_company_descriptive_date")

            /**
             * The additional information included with the transfer.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun originatorCompanyDiscretionaryData(): Optional<String> =
                originatorCompanyDiscretionaryData.getOptional(
                    "originator_company_discretionary_data"
                )

            /**
             * The identifier of the company that initiated the transfer.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun originatorCompanyId(): String =
                originatorCompanyId.getRequired("originator_company_id")

            /**
             * The name of the company that initiated the transfer.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun originatorCompanyName(): String =
                originatorCompanyName.getRequired("originator_company_name")

            /**
             * Why the ACH transfer was declined.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun reason(): Reason = reason.getRequired("reason")

            /**
             * The id of the receiver of the transfer.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun receiverIdNumber(): Optional<String> =
                receiverIdNumber.getOptional("receiver_id_number")

            /**
             * The name of the receiver of the transfer.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun receiverName(): Optional<String> = receiverName.getOptional("receiver_name")

            /**
             * The trace number of the transfer.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun traceNumber(): String = traceNumber.getRequired("trace_number")

            /**
             * A constant representing the object's type. For this resource it will always be
             * `ach_decline`.
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
             * Returns the raw JSON value of [inboundAchTransferId].
             *
             * Unlike [inboundAchTransferId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("inbound_ach_transfer_id")
            @ExcludeMissing
            fun _inboundAchTransferId(): JsonField<String> = inboundAchTransferId

            /**
             * Returns the raw JSON value of [originatorCompanyDescriptiveDate].
             *
             * Unlike [originatorCompanyDescriptiveDate], this method doesn't throw if the JSON
             * field has an unexpected type.
             */
            @JsonProperty("originator_company_descriptive_date")
            @ExcludeMissing
            fun _originatorCompanyDescriptiveDate(): JsonField<String> =
                originatorCompanyDescriptiveDate

            /**
             * Returns the raw JSON value of [originatorCompanyDiscretionaryData].
             *
             * Unlike [originatorCompanyDiscretionaryData], this method doesn't throw if the JSON
             * field has an unexpected type.
             */
            @JsonProperty("originator_company_discretionary_data")
            @ExcludeMissing
            fun _originatorCompanyDiscretionaryData(): JsonField<String> =
                originatorCompanyDiscretionaryData

            /**
             * Returns the raw JSON value of [originatorCompanyId].
             *
             * Unlike [originatorCompanyId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("originator_company_id")
            @ExcludeMissing
            fun _originatorCompanyId(): JsonField<String> = originatorCompanyId

            /**
             * Returns the raw JSON value of [originatorCompanyName].
             *
             * Unlike [originatorCompanyName], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("originator_company_name")
            @ExcludeMissing
            fun _originatorCompanyName(): JsonField<String> = originatorCompanyName

            /**
             * Returns the raw JSON value of [reason].
             *
             * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<Reason> = reason

            /**
             * Returns the raw JSON value of [receiverIdNumber].
             *
             * Unlike [receiverIdNumber], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("receiver_id_number")
            @ExcludeMissing
            fun _receiverIdNumber(): JsonField<String> = receiverIdNumber

            /**
             * Returns the raw JSON value of [receiverName].
             *
             * Unlike [receiverName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("receiver_name")
            @ExcludeMissing
            fun _receiverName(): JsonField<String> = receiverName

            /**
             * Returns the raw JSON value of [traceNumber].
             *
             * Unlike [traceNumber], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("trace_number")
            @ExcludeMissing
            fun _traceNumber(): JsonField<String> = traceNumber

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
                 * Returns a mutable builder for constructing an instance of [AchDecline].
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .amount()
                 * .inboundAchTransferId()
                 * .originatorCompanyDescriptiveDate()
                 * .originatorCompanyDiscretionaryData()
                 * .originatorCompanyId()
                 * .originatorCompanyName()
                 * .reason()
                 * .receiverIdNumber()
                 * .receiverName()
                 * .traceNumber()
                 * .type()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [AchDecline]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var amount: JsonField<Long>? = null
                private var inboundAchTransferId: JsonField<String>? = null
                private var originatorCompanyDescriptiveDate: JsonField<String>? = null
                private var originatorCompanyDiscretionaryData: JsonField<String>? = null
                private var originatorCompanyId: JsonField<String>? = null
                private var originatorCompanyName: JsonField<String>? = null
                private var reason: JsonField<Reason>? = null
                private var receiverIdNumber: JsonField<String>? = null
                private var receiverName: JsonField<String>? = null
                private var traceNumber: JsonField<String>? = null
                private var type: JsonField<Type>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(achDecline: AchDecline) = apply {
                    id = achDecline.id
                    amount = achDecline.amount
                    inboundAchTransferId = achDecline.inboundAchTransferId
                    originatorCompanyDescriptiveDate = achDecline.originatorCompanyDescriptiveDate
                    originatorCompanyDiscretionaryData =
                        achDecline.originatorCompanyDiscretionaryData
                    originatorCompanyId = achDecline.originatorCompanyId
                    originatorCompanyName = achDecline.originatorCompanyName
                    reason = achDecline.reason
                    receiverIdNumber = achDecline.receiverIdNumber
                    receiverName = achDecline.receiverName
                    traceNumber = achDecline.traceNumber
                    type = achDecline.type
                    additionalProperties = achDecline.additionalProperties.toMutableMap()
                }

                /** The ACH Decline's identifier. */
                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                /** The declined amount in USD cents. */
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
                 * The identifier of the Inbound ACH Transfer object associated with this decline.
                 */
                fun inboundAchTransferId(inboundAchTransferId: String) =
                    inboundAchTransferId(JsonField.of(inboundAchTransferId))

                /**
                 * Sets [Builder.inboundAchTransferId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.inboundAchTransferId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun inboundAchTransferId(inboundAchTransferId: JsonField<String>) = apply {
                    this.inboundAchTransferId = inboundAchTransferId
                }

                /** The descriptive date of the transfer. */
                fun originatorCompanyDescriptiveDate(originatorCompanyDescriptiveDate: String?) =
                    originatorCompanyDescriptiveDate(
                        JsonField.ofNullable(originatorCompanyDescriptiveDate)
                    )

                /**
                 * Alias for calling [Builder.originatorCompanyDescriptiveDate] with
                 * `originatorCompanyDescriptiveDate.orElse(null)`.
                 */
                fun originatorCompanyDescriptiveDate(
                    originatorCompanyDescriptiveDate: Optional<String>
                ) = originatorCompanyDescriptiveDate(originatorCompanyDescriptiveDate.getOrNull())

                /**
                 * Sets [Builder.originatorCompanyDescriptiveDate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.originatorCompanyDescriptiveDate] with a
                 * well-typed [String] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun originatorCompanyDescriptiveDate(
                    originatorCompanyDescriptiveDate: JsonField<String>
                ) = apply {
                    this.originatorCompanyDescriptiveDate = originatorCompanyDescriptiveDate
                }

                /** The additional information included with the transfer. */
                fun originatorCompanyDiscretionaryData(
                    originatorCompanyDiscretionaryData: String?
                ) =
                    originatorCompanyDiscretionaryData(
                        JsonField.ofNullable(originatorCompanyDiscretionaryData)
                    )

                /**
                 * Alias for calling [Builder.originatorCompanyDiscretionaryData] with
                 * `originatorCompanyDiscretionaryData.orElse(null)`.
                 */
                fun originatorCompanyDiscretionaryData(
                    originatorCompanyDiscretionaryData: Optional<String>
                ) =
                    originatorCompanyDiscretionaryData(
                        originatorCompanyDiscretionaryData.getOrNull()
                    )

                /**
                 * Sets [Builder.originatorCompanyDiscretionaryData] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.originatorCompanyDiscretionaryData] with a
                 * well-typed [String] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun originatorCompanyDiscretionaryData(
                    originatorCompanyDiscretionaryData: JsonField<String>
                ) = apply {
                    this.originatorCompanyDiscretionaryData = originatorCompanyDiscretionaryData
                }

                /** The identifier of the company that initiated the transfer. */
                fun originatorCompanyId(originatorCompanyId: String) =
                    originatorCompanyId(JsonField.of(originatorCompanyId))

                /**
                 * Sets [Builder.originatorCompanyId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.originatorCompanyId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun originatorCompanyId(originatorCompanyId: JsonField<String>) = apply {
                    this.originatorCompanyId = originatorCompanyId
                }

                /** The name of the company that initiated the transfer. */
                fun originatorCompanyName(originatorCompanyName: String) =
                    originatorCompanyName(JsonField.of(originatorCompanyName))

                /**
                 * Sets [Builder.originatorCompanyName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.originatorCompanyName] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun originatorCompanyName(originatorCompanyName: JsonField<String>) = apply {
                    this.originatorCompanyName = originatorCompanyName
                }

                /** Why the ACH transfer was declined. */
                fun reason(reason: Reason) = reason(JsonField.of(reason))

                /**
                 * Sets [Builder.reason] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.reason] with a well-typed [Reason] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun reason(reason: JsonField<Reason>) = apply { this.reason = reason }

                /** The id of the receiver of the transfer. */
                fun receiverIdNumber(receiverIdNumber: String?) =
                    receiverIdNumber(JsonField.ofNullable(receiverIdNumber))

                /**
                 * Alias for calling [Builder.receiverIdNumber] with
                 * `receiverIdNumber.orElse(null)`.
                 */
                fun receiverIdNumber(receiverIdNumber: Optional<String>) =
                    receiverIdNumber(receiverIdNumber.getOrNull())

                /**
                 * Sets [Builder.receiverIdNumber] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.receiverIdNumber] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun receiverIdNumber(receiverIdNumber: JsonField<String>) = apply {
                    this.receiverIdNumber = receiverIdNumber
                }

                /** The name of the receiver of the transfer. */
                fun receiverName(receiverName: String?) =
                    receiverName(JsonField.ofNullable(receiverName))

                /** Alias for calling [Builder.receiverName] with `receiverName.orElse(null)`. */
                fun receiverName(receiverName: Optional<String>) =
                    receiverName(receiverName.getOrNull())

                /**
                 * Sets [Builder.receiverName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.receiverName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun receiverName(receiverName: JsonField<String>) = apply {
                    this.receiverName = receiverName
                }

                /** The trace number of the transfer. */
                fun traceNumber(traceNumber: String) = traceNumber(JsonField.of(traceNumber))

                /**
                 * Sets [Builder.traceNumber] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.traceNumber] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun traceNumber(traceNumber: JsonField<String>) = apply {
                    this.traceNumber = traceNumber
                }

                /**
                 * A constant representing the object's type. For this resource it will always be
                 * `ach_decline`.
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
                 * Returns an immutable instance of [AchDecline].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .amount()
                 * .inboundAchTransferId()
                 * .originatorCompanyDescriptiveDate()
                 * .originatorCompanyDiscretionaryData()
                 * .originatorCompanyId()
                 * .originatorCompanyName()
                 * .reason()
                 * .receiverIdNumber()
                 * .receiverName()
                 * .traceNumber()
                 * .type()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): AchDecline =
                    AchDecline(
                        checkRequired("id", id),
                        checkRequired("amount", amount),
                        checkRequired("inboundAchTransferId", inboundAchTransferId),
                        checkRequired(
                            "originatorCompanyDescriptiveDate",
                            originatorCompanyDescriptiveDate,
                        ),
                        checkRequired(
                            "originatorCompanyDiscretionaryData",
                            originatorCompanyDiscretionaryData,
                        ),
                        checkRequired("originatorCompanyId", originatorCompanyId),
                        checkRequired("originatorCompanyName", originatorCompanyName),
                        checkRequired("reason", reason),
                        checkRequired("receiverIdNumber", receiverIdNumber),
                        checkRequired("receiverName", receiverName),
                        checkRequired("traceNumber", traceNumber),
                        checkRequired("type", type),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): AchDecline = apply {
                if (validated) {
                    return@apply
                }

                id()
                amount()
                inboundAchTransferId()
                originatorCompanyDescriptiveDate()
                originatorCompanyDiscretionaryData()
                originatorCompanyId()
                originatorCompanyName()
                reason().validate()
                receiverIdNumber()
                receiverName()
                traceNumber()
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
                    (if (inboundAchTransferId.asKnown().isPresent) 1 else 0) +
                    (if (originatorCompanyDescriptiveDate.asKnown().isPresent) 1 else 0) +
                    (if (originatorCompanyDiscretionaryData.asKnown().isPresent) 1 else 0) +
                    (if (originatorCompanyId.asKnown().isPresent) 1 else 0) +
                    (if (originatorCompanyName.asKnown().isPresent) 1 else 0) +
                    (reason.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (receiverIdNumber.asKnown().isPresent) 1 else 0) +
                    (if (receiverName.asKnown().isPresent) 1 else 0) +
                    (if (traceNumber.asKnown().isPresent) 1 else 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0)

            /** Why the ACH transfer was declined. */
            class Reason @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    /** The account number is canceled. */
                    @JvmField val ACH_ROUTE_CANCELED = of("ach_route_canceled")

                    /** The account number is disabled. */
                    @JvmField val ACH_ROUTE_DISABLED = of("ach_route_disabled")

                    /** The transaction would cause an Increase limit to be exceeded. */
                    @JvmField val BREACHES_LIMIT = of("breaches_limit")

                    /** The account's entity is not active. */
                    @JvmField val ENTITY_NOT_ACTIVE = of("entity_not_active")

                    /** Your account is inactive. */
                    @JvmField val GROUP_LOCKED = of("group_locked")

                    /** The transaction is not allowed per Increase's terms. */
                    @JvmField val TRANSACTION_NOT_ALLOWED = of("transaction_not_allowed")

                    /** Your integration declined this transfer via the API. */
                    @JvmField val USER_INITIATED = of("user_initiated")

                    /** Your account contains insufficient funds. */
                    @JvmField val INSUFFICIENT_FUNDS = of("insufficient_funds")

                    /**
                     * The originating financial institution asked for this transfer to be returned.
                     * The receiving bank is complying with the request.
                     */
                    @JvmField val RETURNED_PER_ODFI_REQUEST = of("returned_per_odfi_request")

                    /** The customer no longer authorizes this transaction. */
                    @JvmField
                    val AUTHORIZATION_REVOKED_BY_CUSTOMER = of("authorization_revoked_by_customer")

                    /** The customer asked for the payment to be stopped. */
                    @JvmField val PAYMENT_STOPPED = of("payment_stopped")

                    /** The customer advises that the debit was unauthorized. */
                    @JvmField
                    val CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE =
                        of("customer_advised_unauthorized_improper_ineligible_or_incomplete")

                    /** The payee is deceased. */
                    @JvmField
                    val REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY =
                        of("representative_payee_deceased_or_unable_to_continue_in_that_capacity")

                    /** The account holder is deceased. */
                    @JvmField
                    val BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED =
                        of("beneficiary_or_account_holder_deceased")

                    /** The customer refused a credit entry. */
                    @JvmField
                    val CREDIT_ENTRY_REFUSED_BY_RECEIVER = of("credit_entry_refused_by_receiver")

                    /** The account holder identified this transaction as a duplicate. */
                    @JvmField val DUPLICATE_ENTRY = of("duplicate_entry")

                    /** The corporate customer no longer authorizes this transaction. */
                    @JvmField
                    val CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED =
                        of("corporate_customer_advised_not_authorized")

                    @JvmStatic fun of(value: String) = Reason(JsonField.of(value))
                }

                /** An enum containing [Reason]'s known values. */
                enum class Known {
                    /** The account number is canceled. */
                    ACH_ROUTE_CANCELED,
                    /** The account number is disabled. */
                    ACH_ROUTE_DISABLED,
                    /** The transaction would cause an Increase limit to be exceeded. */
                    BREACHES_LIMIT,
                    /** The account's entity is not active. */
                    ENTITY_NOT_ACTIVE,
                    /** Your account is inactive. */
                    GROUP_LOCKED,
                    /** The transaction is not allowed per Increase's terms. */
                    TRANSACTION_NOT_ALLOWED,
                    /** Your integration declined this transfer via the API. */
                    USER_INITIATED,
                    /** Your account contains insufficient funds. */
                    INSUFFICIENT_FUNDS,
                    /**
                     * The originating financial institution asked for this transfer to be returned.
                     * The receiving bank is complying with the request.
                     */
                    RETURNED_PER_ODFI_REQUEST,
                    /** The customer no longer authorizes this transaction. */
                    AUTHORIZATION_REVOKED_BY_CUSTOMER,
                    /** The customer asked for the payment to be stopped. */
                    PAYMENT_STOPPED,
                    /** The customer advises that the debit was unauthorized. */
                    CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE,
                    /** The payee is deceased. */
                    REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY,
                    /** The account holder is deceased. */
                    BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED,
                    /** The customer refused a credit entry. */
                    CREDIT_ENTRY_REFUSED_BY_RECEIVER,
                    /** The account holder identified this transaction as a duplicate. */
                    DUPLICATE_ENTRY,
                    /** The corporate customer no longer authorizes this transaction. */
                    CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED,
                }

                /**
                 * An enum containing [Reason]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Reason] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    /** The account number is canceled. */
                    ACH_ROUTE_CANCELED,
                    /** The account number is disabled. */
                    ACH_ROUTE_DISABLED,
                    /** The transaction would cause an Increase limit to be exceeded. */
                    BREACHES_LIMIT,
                    /** The account's entity is not active. */
                    ENTITY_NOT_ACTIVE,
                    /** Your account is inactive. */
                    GROUP_LOCKED,
                    /** The transaction is not allowed per Increase's terms. */
                    TRANSACTION_NOT_ALLOWED,
                    /** Your integration declined this transfer via the API. */
                    USER_INITIATED,
                    /** Your account contains insufficient funds. */
                    INSUFFICIENT_FUNDS,
                    /**
                     * The originating financial institution asked for this transfer to be returned.
                     * The receiving bank is complying with the request.
                     */
                    RETURNED_PER_ODFI_REQUEST,
                    /** The customer no longer authorizes this transaction. */
                    AUTHORIZATION_REVOKED_BY_CUSTOMER,
                    /** The customer asked for the payment to be stopped. */
                    PAYMENT_STOPPED,
                    /** The customer advises that the debit was unauthorized. */
                    CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE,
                    /** The payee is deceased. */
                    REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY,
                    /** The account holder is deceased. */
                    BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED,
                    /** The customer refused a credit entry. */
                    CREDIT_ENTRY_REFUSED_BY_RECEIVER,
                    /** The account holder identified this transaction as a duplicate. */
                    DUPLICATE_ENTRY,
                    /** The corporate customer no longer authorizes this transaction. */
                    CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED,
                    /**
                     * An enum member indicating that [Reason] was instantiated with an unknown
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
                        ACH_ROUTE_CANCELED -> Value.ACH_ROUTE_CANCELED
                        ACH_ROUTE_DISABLED -> Value.ACH_ROUTE_DISABLED
                        BREACHES_LIMIT -> Value.BREACHES_LIMIT
                        ENTITY_NOT_ACTIVE -> Value.ENTITY_NOT_ACTIVE
                        GROUP_LOCKED -> Value.GROUP_LOCKED
                        TRANSACTION_NOT_ALLOWED -> Value.TRANSACTION_NOT_ALLOWED
                        USER_INITIATED -> Value.USER_INITIATED
                        INSUFFICIENT_FUNDS -> Value.INSUFFICIENT_FUNDS
                        RETURNED_PER_ODFI_REQUEST -> Value.RETURNED_PER_ODFI_REQUEST
                        AUTHORIZATION_REVOKED_BY_CUSTOMER -> Value.AUTHORIZATION_REVOKED_BY_CUSTOMER
                        PAYMENT_STOPPED -> Value.PAYMENT_STOPPED
                        CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE ->
                            Value.CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE
                        REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY ->
                            Value
                                .REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY
                        BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED ->
                            Value.BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED
                        CREDIT_ENTRY_REFUSED_BY_RECEIVER -> Value.CREDIT_ENTRY_REFUSED_BY_RECEIVER
                        DUPLICATE_ENTRY -> Value.DUPLICATE_ENTRY
                        CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED ->
                            Value.CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED
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
                        ACH_ROUTE_CANCELED -> Known.ACH_ROUTE_CANCELED
                        ACH_ROUTE_DISABLED -> Known.ACH_ROUTE_DISABLED
                        BREACHES_LIMIT -> Known.BREACHES_LIMIT
                        ENTITY_NOT_ACTIVE -> Known.ENTITY_NOT_ACTIVE
                        GROUP_LOCKED -> Known.GROUP_LOCKED
                        TRANSACTION_NOT_ALLOWED -> Known.TRANSACTION_NOT_ALLOWED
                        USER_INITIATED -> Known.USER_INITIATED
                        INSUFFICIENT_FUNDS -> Known.INSUFFICIENT_FUNDS
                        RETURNED_PER_ODFI_REQUEST -> Known.RETURNED_PER_ODFI_REQUEST
                        AUTHORIZATION_REVOKED_BY_CUSTOMER -> Known.AUTHORIZATION_REVOKED_BY_CUSTOMER
                        PAYMENT_STOPPED -> Known.PAYMENT_STOPPED
                        CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE ->
                            Known.CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE
                        REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY ->
                            Known
                                .REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY
                        BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED ->
                            Known.BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED
                        CREDIT_ENTRY_REFUSED_BY_RECEIVER -> Known.CREDIT_ENTRY_REFUSED_BY_RECEIVER
                        DUPLICATE_ENTRY -> Known.DUPLICATE_ENTRY
                        CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED ->
                            Known.CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED
                        else -> throw IncreaseInvalidDataException("Unknown Reason: $value")
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

                fun validate(): Reason = apply {
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

                    return other is Reason && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /**
             * A constant representing the object's type. For this resource it will always be
             * `ach_decline`.
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

                    @JvmField val ACH_DECLINE = of("ach_decline")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    ACH_DECLINE
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
                    ACH_DECLINE,
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
                        ACH_DECLINE -> Value.ACH_DECLINE
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
                        ACH_DECLINE -> Known.ACH_DECLINE
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

                    return other is Type && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is AchDecline &&
                    id == other.id &&
                    amount == other.amount &&
                    inboundAchTransferId == other.inboundAchTransferId &&
                    originatorCompanyDescriptiveDate == other.originatorCompanyDescriptiveDate &&
                    originatorCompanyDiscretionaryData ==
                        other.originatorCompanyDiscretionaryData &&
                    originatorCompanyId == other.originatorCompanyId &&
                    originatorCompanyName == other.originatorCompanyName &&
                    reason == other.reason &&
                    receiverIdNumber == other.receiverIdNumber &&
                    receiverName == other.receiverName &&
                    traceNumber == other.traceNumber &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    id,
                    amount,
                    inboundAchTransferId,
                    originatorCompanyDescriptiveDate,
                    originatorCompanyDiscretionaryData,
                    originatorCompanyId,
                    originatorCompanyName,
                    reason,
                    receiverIdNumber,
                    receiverName,
                    traceNumber,
                    type,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AchDecline{id=$id, amount=$amount, inboundAchTransferId=$inboundAchTransferId, originatorCompanyDescriptiveDate=$originatorCompanyDescriptiveDate, originatorCompanyDiscretionaryData=$originatorCompanyDiscretionaryData, originatorCompanyId=$originatorCompanyId, originatorCompanyName=$originatorCompanyName, reason=$reason, receiverIdNumber=$receiverIdNumber, receiverName=$receiverName, traceNumber=$traceNumber, type=$type, additionalProperties=$additionalProperties}"
        }

        /**
         * A Card Decline object. This field will be present in the JSON response if and only if
         * `category` is equal to `card_decline`.
         */
        class CardDecline
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val id: JsonField<String>,
            private val actioner: JsonField<Actioner>,
            private val additionalAmounts: JsonField<AdditionalAmounts>,
            private val amount: JsonField<Long>,
            private val cardPaymentId: JsonField<String>,
            private val currency: JsonField<Currency>,
            private val declinedTransactionId: JsonField<String>,
            private val digitalWalletTokenId: JsonField<String>,
            private val direction: JsonField<Direction>,
            private val incrementedCardAuthorizationId: JsonField<String>,
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
            private val physicalCardId: JsonField<String>,
            private val presentmentAmount: JsonField<Long>,
            private val presentmentCurrency: JsonField<String>,
            private val processingCategory: JsonField<ProcessingCategory>,
            private val realTimeDecisionId: JsonField<String>,
            private val realTimeDecisionReason: JsonField<RealTimeDecisionReason>,
            private val reason: JsonField<Reason>,
            private val terminalId: JsonField<String>,
            private val verification: JsonField<Verification>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("actioner")
                @ExcludeMissing
                actioner: JsonField<Actioner> = JsonMissing.of(),
                @JsonProperty("additional_amounts")
                @ExcludeMissing
                additionalAmounts: JsonField<AdditionalAmounts> = JsonMissing.of(),
                @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("card_payment_id")
                @ExcludeMissing
                cardPaymentId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("currency")
                @ExcludeMissing
                currency: JsonField<Currency> = JsonMissing.of(),
                @JsonProperty("declined_transaction_id")
                @ExcludeMissing
                declinedTransactionId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("digital_wallet_token_id")
                @ExcludeMissing
                digitalWalletTokenId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("direction")
                @ExcludeMissing
                direction: JsonField<Direction> = JsonMissing.of(),
                @JsonProperty("incremented_card_authorization_id")
                @ExcludeMissing
                incrementedCardAuthorizationId: JsonField<String> = JsonMissing.of(),
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
                @JsonProperty("real_time_decision_reason")
                @ExcludeMissing
                realTimeDecisionReason: JsonField<RealTimeDecisionReason> = JsonMissing.of(),
                @JsonProperty("reason")
                @ExcludeMissing
                reason: JsonField<Reason> = JsonMissing.of(),
                @JsonProperty("terminal_id")
                @ExcludeMissing
                terminalId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("verification")
                @ExcludeMissing
                verification: JsonField<Verification> = JsonMissing.of(),
            ) : this(
                id,
                actioner,
                additionalAmounts,
                amount,
                cardPaymentId,
                currency,
                declinedTransactionId,
                digitalWalletTokenId,
                direction,
                incrementedCardAuthorizationId,
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
                physicalCardId,
                presentmentAmount,
                presentmentCurrency,
                processingCategory,
                realTimeDecisionId,
                realTimeDecisionReason,
                reason,
                terminalId,
                verification,
                mutableMapOf(),
            )

            /**
             * The Card Decline identifier.
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
             * Additional amounts associated with the card authorization, such as ATM surcharges
             * fees. These are usually a subset of the `amount` field and are used to provide more
             * detailed information about the transaction.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun additionalAmounts(): AdditionalAmounts =
                additionalAmounts.getRequired("additional_amounts")

            /**
             * The declined amount in the minor unit of the destination account currency. For
             * dollars, for example, this is cents.
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
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the destination
             * account currency.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun currency(): Currency = currency.getRequired("currency")

            /**
             * The identifier of the declined transaction created for this Card Decline.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun declinedTransactionId(): String =
                declinedTransactionId.getRequired("declined_transaction_id")

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
             * The identifier of the card authorization this request attempted to incrementally
             * authorize.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun incrementedCardAuthorizationId(): Optional<String> =
                incrementedCardAuthorizationId.getOptional("incremented_card_authorization_id")

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
             * Authorization risk score, from 0 to 99, where 99 is the riskiest. For Pulse the score
             * is from 0 to 999, where 999 is the riskiest.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun networkRiskScore(): Optional<Long> =
                networkRiskScore.getOptional("network_risk_score")

            /**
             * If the authorization was made in-person with a physical card, the Physical Card that
             * was used.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun physicalCardId(): Optional<String> = physicalCardId.getOptional("physical_card_id")

            /**
             * The declined amount in the minor unit of the transaction's presentment currency.
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
             * This is present if a specific decline reason was given in the real-time decision.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun realTimeDecisionReason(): Optional<RealTimeDecisionReason> =
                realTimeDecisionReason.getOptional("real_time_decision_reason")

            /**
             * Why the transaction was declined.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun reason(): Reason = reason.getRequired("reason")

            /**
             * The terminal identifier (commonly abbreviated as TID) of the terminal the card is
             * transacting with.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun terminalId(): Optional<String> = terminalId.getOptional("terminal_id")

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
             * Returns the raw JSON value of [additionalAmounts].
             *
             * Unlike [additionalAmounts], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("additional_amounts")
            @ExcludeMissing
            fun _additionalAmounts(): JsonField<AdditionalAmounts> = additionalAmounts

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
             * Returns the raw JSON value of [declinedTransactionId].
             *
             * Unlike [declinedTransactionId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("declined_transaction_id")
            @ExcludeMissing
            fun _declinedTransactionId(): JsonField<String> = declinedTransactionId

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
             * Returns the raw JSON value of [incrementedCardAuthorizationId].
             *
             * Unlike [incrementedCardAuthorizationId], this method doesn't throw if the JSON field
             * has an unexpected type.
             */
            @JsonProperty("incremented_card_authorization_id")
            @ExcludeMissing
            fun _incrementedCardAuthorizationId(): JsonField<String> =
                incrementedCardAuthorizationId

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
             * Returns the raw JSON value of [realTimeDecisionReason].
             *
             * Unlike [realTimeDecisionReason], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("real_time_decision_reason")
            @ExcludeMissing
            fun _realTimeDecisionReason(): JsonField<RealTimeDecisionReason> =
                realTimeDecisionReason

            /**
             * Returns the raw JSON value of [reason].
             *
             * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<Reason> = reason

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
                 * Returns a mutable builder for constructing an instance of [CardDecline].
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .actioner()
                 * .additionalAmounts()
                 * .amount()
                 * .cardPaymentId()
                 * .currency()
                 * .declinedTransactionId()
                 * .digitalWalletTokenId()
                 * .direction()
                 * .incrementedCardAuthorizationId()
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
                 * .physicalCardId()
                 * .presentmentAmount()
                 * .presentmentCurrency()
                 * .processingCategory()
                 * .realTimeDecisionId()
                 * .realTimeDecisionReason()
                 * .reason()
                 * .terminalId()
                 * .verification()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [CardDecline]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var actioner: JsonField<Actioner>? = null
                private var additionalAmounts: JsonField<AdditionalAmounts>? = null
                private var amount: JsonField<Long>? = null
                private var cardPaymentId: JsonField<String>? = null
                private var currency: JsonField<Currency>? = null
                private var declinedTransactionId: JsonField<String>? = null
                private var digitalWalletTokenId: JsonField<String>? = null
                private var direction: JsonField<Direction>? = null
                private var incrementedCardAuthorizationId: JsonField<String>? = null
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
                private var physicalCardId: JsonField<String>? = null
                private var presentmentAmount: JsonField<Long>? = null
                private var presentmentCurrency: JsonField<String>? = null
                private var processingCategory: JsonField<ProcessingCategory>? = null
                private var realTimeDecisionId: JsonField<String>? = null
                private var realTimeDecisionReason: JsonField<RealTimeDecisionReason>? = null
                private var reason: JsonField<Reason>? = null
                private var terminalId: JsonField<String>? = null
                private var verification: JsonField<Verification>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(cardDecline: CardDecline) = apply {
                    id = cardDecline.id
                    actioner = cardDecline.actioner
                    additionalAmounts = cardDecline.additionalAmounts
                    amount = cardDecline.amount
                    cardPaymentId = cardDecline.cardPaymentId
                    currency = cardDecline.currency
                    declinedTransactionId = cardDecline.declinedTransactionId
                    digitalWalletTokenId = cardDecline.digitalWalletTokenId
                    direction = cardDecline.direction
                    incrementedCardAuthorizationId = cardDecline.incrementedCardAuthorizationId
                    merchantAcceptorId = cardDecline.merchantAcceptorId
                    merchantCategoryCode = cardDecline.merchantCategoryCode
                    merchantCity = cardDecline.merchantCity
                    merchantCountry = cardDecline.merchantCountry
                    merchantDescriptor = cardDecline.merchantDescriptor
                    merchantPostalCode = cardDecline.merchantPostalCode
                    merchantState = cardDecline.merchantState
                    networkDetails = cardDecline.networkDetails
                    networkIdentifiers = cardDecline.networkIdentifiers
                    networkRiskScore = cardDecline.networkRiskScore
                    physicalCardId = cardDecline.physicalCardId
                    presentmentAmount = cardDecline.presentmentAmount
                    presentmentCurrency = cardDecline.presentmentCurrency
                    processingCategory = cardDecline.processingCategory
                    realTimeDecisionId = cardDecline.realTimeDecisionId
                    realTimeDecisionReason = cardDecline.realTimeDecisionReason
                    reason = cardDecline.reason
                    terminalId = cardDecline.terminalId
                    verification = cardDecline.verification
                    additionalProperties = cardDecline.additionalProperties.toMutableMap()
                }

                /** The Card Decline identifier. */
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
                 * Additional amounts associated with the card authorization, such as ATM surcharges
                 * fees. These are usually a subset of the `amount` field and are used to provide
                 * more detailed information about the transaction.
                 */
                fun additionalAmounts(additionalAmounts: AdditionalAmounts) =
                    additionalAmounts(JsonField.of(additionalAmounts))

                /**
                 * Sets [Builder.additionalAmounts] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.additionalAmounts] with a well-typed
                 * [AdditionalAmounts] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun additionalAmounts(additionalAmounts: JsonField<AdditionalAmounts>) = apply {
                    this.additionalAmounts = additionalAmounts
                }

                /**
                 * The declined amount in the minor unit of the destination account currency. For
                 * dollars, for example, this is cents.
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

                /** The identifier of the declined transaction created for this Card Decline. */
                fun declinedTransactionId(declinedTransactionId: String) =
                    declinedTransactionId(JsonField.of(declinedTransactionId))

                /**
                 * Sets [Builder.declinedTransactionId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.declinedTransactionId] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun declinedTransactionId(declinedTransactionId: JsonField<String>) = apply {
                    this.declinedTransactionId = declinedTransactionId
                }

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
                 * The identifier of the card authorization this request attempted to incrementally
                 * authorize.
                 */
                fun incrementedCardAuthorizationId(incrementedCardAuthorizationId: String?) =
                    incrementedCardAuthorizationId(
                        JsonField.ofNullable(incrementedCardAuthorizationId)
                    )

                /**
                 * Alias for calling [Builder.incrementedCardAuthorizationId] with
                 * `incrementedCardAuthorizationId.orElse(null)`.
                 */
                fun incrementedCardAuthorizationId(
                    incrementedCardAuthorizationId: Optional<String>
                ) = incrementedCardAuthorizationId(incrementedCardAuthorizationId.getOrNull())

                /**
                 * Sets [Builder.incrementedCardAuthorizationId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.incrementedCardAuthorizationId] with a
                 * well-typed [String] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun incrementedCardAuthorizationId(
                    incrementedCardAuthorizationId: JsonField<String>
                ) = apply { this.incrementedCardAuthorizationId = incrementedCardAuthorizationId }

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
                 * Authorization risk score, from 0 to 99, where 99 is the riskiest. For Pulse the
                 * score is from 0 to 999, where 999 is the riskiest.
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
                 * The declined amount in the minor unit of the transaction's presentment currency.
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
                 * This is present if a specific decline reason was given in the real-time decision.
                 */
                fun realTimeDecisionReason(realTimeDecisionReason: RealTimeDecisionReason?) =
                    realTimeDecisionReason(JsonField.ofNullable(realTimeDecisionReason))

                /**
                 * Alias for calling [Builder.realTimeDecisionReason] with
                 * `realTimeDecisionReason.orElse(null)`.
                 */
                fun realTimeDecisionReason(
                    realTimeDecisionReason: Optional<RealTimeDecisionReason>
                ) = realTimeDecisionReason(realTimeDecisionReason.getOrNull())

                /**
                 * Sets [Builder.realTimeDecisionReason] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.realTimeDecisionReason] with a well-typed
                 * [RealTimeDecisionReason] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun realTimeDecisionReason(
                    realTimeDecisionReason: JsonField<RealTimeDecisionReason>
                ) = apply { this.realTimeDecisionReason = realTimeDecisionReason }

                /** Why the transaction was declined. */
                fun reason(reason: Reason) = reason(JsonField.of(reason))

                /**
                 * Sets [Builder.reason] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.reason] with a well-typed [Reason] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun reason(reason: JsonField<Reason>) = apply { this.reason = reason }

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
                 * Returns an immutable instance of [CardDecline].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .actioner()
                 * .additionalAmounts()
                 * .amount()
                 * .cardPaymentId()
                 * .currency()
                 * .declinedTransactionId()
                 * .digitalWalletTokenId()
                 * .direction()
                 * .incrementedCardAuthorizationId()
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
                 * .physicalCardId()
                 * .presentmentAmount()
                 * .presentmentCurrency()
                 * .processingCategory()
                 * .realTimeDecisionId()
                 * .realTimeDecisionReason()
                 * .reason()
                 * .terminalId()
                 * .verification()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): CardDecline =
                    CardDecline(
                        checkRequired("id", id),
                        checkRequired("actioner", actioner),
                        checkRequired("additionalAmounts", additionalAmounts),
                        checkRequired("amount", amount),
                        checkRequired("cardPaymentId", cardPaymentId),
                        checkRequired("currency", currency),
                        checkRequired("declinedTransactionId", declinedTransactionId),
                        checkRequired("digitalWalletTokenId", digitalWalletTokenId),
                        checkRequired("direction", direction),
                        checkRequired(
                            "incrementedCardAuthorizationId",
                            incrementedCardAuthorizationId,
                        ),
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
                        checkRequired("physicalCardId", physicalCardId),
                        checkRequired("presentmentAmount", presentmentAmount),
                        checkRequired("presentmentCurrency", presentmentCurrency),
                        checkRequired("processingCategory", processingCategory),
                        checkRequired("realTimeDecisionId", realTimeDecisionId),
                        checkRequired("realTimeDecisionReason", realTimeDecisionReason),
                        checkRequired("reason", reason),
                        checkRequired("terminalId", terminalId),
                        checkRequired("verification", verification),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): CardDecline = apply {
                if (validated) {
                    return@apply
                }

                id()
                actioner().validate()
                additionalAmounts().validate()
                amount()
                cardPaymentId()
                currency().validate()
                declinedTransactionId()
                digitalWalletTokenId()
                direction().validate()
                incrementedCardAuthorizationId()
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
                physicalCardId()
                presentmentAmount()
                presentmentCurrency()
                processingCategory().validate()
                realTimeDecisionId()
                realTimeDecisionReason().ifPresent { it.validate() }
                reason().validate()
                terminalId()
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
                    (additionalAmounts.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (amount.asKnown().isPresent) 1 else 0) +
                    (if (cardPaymentId.asKnown().isPresent) 1 else 0) +
                    (currency.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (declinedTransactionId.asKnown().isPresent) 1 else 0) +
                    (if (digitalWalletTokenId.asKnown().isPresent) 1 else 0) +
                    (direction.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (incrementedCardAuthorizationId.asKnown().isPresent) 1 else 0) +
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
                    (if (physicalCardId.asKnown().isPresent) 1 else 0) +
                    (if (presentmentAmount.asKnown().isPresent) 1 else 0) +
                    (if (presentmentCurrency.asKnown().isPresent) 1 else 0) +
                    (processingCategory.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (realTimeDecisionId.asKnown().isPresent) 1 else 0) +
                    (realTimeDecisionReason.asKnown().getOrNull()?.validity() ?: 0) +
                    (reason.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (terminalId.asKnown().isPresent) 1 else 0) +
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

                    return other is Actioner && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /**
             * Additional amounts associated with the card authorization, such as ATM surcharges
             * fees. These are usually a subset of the `amount` field and are used to provide more
             * detailed information about the transaction.
             */
            class AdditionalAmounts
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val clinic: JsonField<Clinic>,
                private val dental: JsonField<Dental>,
                private val original: JsonField<Original>,
                private val prescription: JsonField<Prescription>,
                private val surcharge: JsonField<Surcharge>,
                private val totalCumulative: JsonField<TotalCumulative>,
                private val totalHealthcare: JsonField<TotalHealthcare>,
                private val transit: JsonField<Transit>,
                private val unknown: JsonField<Unknown>,
                private val vision: JsonField<Vision>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("clinic")
                    @ExcludeMissing
                    clinic: JsonField<Clinic> = JsonMissing.of(),
                    @JsonProperty("dental")
                    @ExcludeMissing
                    dental: JsonField<Dental> = JsonMissing.of(),
                    @JsonProperty("original")
                    @ExcludeMissing
                    original: JsonField<Original> = JsonMissing.of(),
                    @JsonProperty("prescription")
                    @ExcludeMissing
                    prescription: JsonField<Prescription> = JsonMissing.of(),
                    @JsonProperty("surcharge")
                    @ExcludeMissing
                    surcharge: JsonField<Surcharge> = JsonMissing.of(),
                    @JsonProperty("total_cumulative")
                    @ExcludeMissing
                    totalCumulative: JsonField<TotalCumulative> = JsonMissing.of(),
                    @JsonProperty("total_healthcare")
                    @ExcludeMissing
                    totalHealthcare: JsonField<TotalHealthcare> = JsonMissing.of(),
                    @JsonProperty("transit")
                    @ExcludeMissing
                    transit: JsonField<Transit> = JsonMissing.of(),
                    @JsonProperty("unknown")
                    @ExcludeMissing
                    unknown: JsonField<Unknown> = JsonMissing.of(),
                    @JsonProperty("vision")
                    @ExcludeMissing
                    vision: JsonField<Vision> = JsonMissing.of(),
                ) : this(
                    clinic,
                    dental,
                    original,
                    prescription,
                    surcharge,
                    totalCumulative,
                    totalHealthcare,
                    transit,
                    unknown,
                    vision,
                    mutableMapOf(),
                )

                /**
                 * The part of this transaction amount that was for clinic-related services.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun clinic(): Optional<Clinic> = clinic.getOptional("clinic")

                /**
                 * The part of this transaction amount that was for dental-related services.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun dental(): Optional<Dental> = dental.getOptional("dental")

                /**
                 * The original pre-authorized amount.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun original(): Optional<Original> = original.getOptional("original")

                /**
                 * The part of this transaction amount that was for healthcare prescriptions.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun prescription(): Optional<Prescription> =
                    prescription.getOptional("prescription")

                /**
                 * The surcharge amount charged for this transaction by the merchant.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun surcharge(): Optional<Surcharge> = surcharge.getOptional("surcharge")

                /**
                 * The total amount of a series of incremental authorizations, optionally provided.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun totalCumulative(): Optional<TotalCumulative> =
                    totalCumulative.getOptional("total_cumulative")

                /**
                 * The total amount of healthcare-related additional amounts.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun totalHealthcare(): Optional<TotalHealthcare> =
                    totalHealthcare.getOptional("total_healthcare")

                /**
                 * The part of this transaction amount that was for transit-related services.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun transit(): Optional<Transit> = transit.getOptional("transit")

                /**
                 * An unknown additional amount.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun unknown(): Optional<Unknown> = unknown.getOptional("unknown")

                /**
                 * The part of this transaction amount that was for vision-related services.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun vision(): Optional<Vision> = vision.getOptional("vision")

                /**
                 * Returns the raw JSON value of [clinic].
                 *
                 * Unlike [clinic], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("clinic") @ExcludeMissing fun _clinic(): JsonField<Clinic> = clinic

                /**
                 * Returns the raw JSON value of [dental].
                 *
                 * Unlike [dental], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("dental") @ExcludeMissing fun _dental(): JsonField<Dental> = dental

                /**
                 * Returns the raw JSON value of [original].
                 *
                 * Unlike [original], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("original")
                @ExcludeMissing
                fun _original(): JsonField<Original> = original

                /**
                 * Returns the raw JSON value of [prescription].
                 *
                 * Unlike [prescription], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("prescription")
                @ExcludeMissing
                fun _prescription(): JsonField<Prescription> = prescription

                /**
                 * Returns the raw JSON value of [surcharge].
                 *
                 * Unlike [surcharge], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("surcharge")
                @ExcludeMissing
                fun _surcharge(): JsonField<Surcharge> = surcharge

                /**
                 * Returns the raw JSON value of [totalCumulative].
                 *
                 * Unlike [totalCumulative], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("total_cumulative")
                @ExcludeMissing
                fun _totalCumulative(): JsonField<TotalCumulative> = totalCumulative

                /**
                 * Returns the raw JSON value of [totalHealthcare].
                 *
                 * Unlike [totalHealthcare], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("total_healthcare")
                @ExcludeMissing
                fun _totalHealthcare(): JsonField<TotalHealthcare> = totalHealthcare

                /**
                 * Returns the raw JSON value of [transit].
                 *
                 * Unlike [transit], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("transit")
                @ExcludeMissing
                fun _transit(): JsonField<Transit> = transit

                /**
                 * Returns the raw JSON value of [unknown].
                 *
                 * Unlike [unknown], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("unknown")
                @ExcludeMissing
                fun _unknown(): JsonField<Unknown> = unknown

                /**
                 * Returns the raw JSON value of [vision].
                 *
                 * Unlike [vision], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("vision") @ExcludeMissing fun _vision(): JsonField<Vision> = vision

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
                     * [AdditionalAmounts].
                     *
                     * The following fields are required:
                     * ```java
                     * .clinic()
                     * .dental()
                     * .original()
                     * .prescription()
                     * .surcharge()
                     * .totalCumulative()
                     * .totalHealthcare()
                     * .transit()
                     * .unknown()
                     * .vision()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [AdditionalAmounts]. */
                class Builder internal constructor() {

                    private var clinic: JsonField<Clinic>? = null
                    private var dental: JsonField<Dental>? = null
                    private var original: JsonField<Original>? = null
                    private var prescription: JsonField<Prescription>? = null
                    private var surcharge: JsonField<Surcharge>? = null
                    private var totalCumulative: JsonField<TotalCumulative>? = null
                    private var totalHealthcare: JsonField<TotalHealthcare>? = null
                    private var transit: JsonField<Transit>? = null
                    private var unknown: JsonField<Unknown>? = null
                    private var vision: JsonField<Vision>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(additionalAmounts: AdditionalAmounts) = apply {
                        clinic = additionalAmounts.clinic
                        dental = additionalAmounts.dental
                        original = additionalAmounts.original
                        prescription = additionalAmounts.prescription
                        surcharge = additionalAmounts.surcharge
                        totalCumulative = additionalAmounts.totalCumulative
                        totalHealthcare = additionalAmounts.totalHealthcare
                        transit = additionalAmounts.transit
                        unknown = additionalAmounts.unknown
                        vision = additionalAmounts.vision
                        additionalProperties = additionalAmounts.additionalProperties.toMutableMap()
                    }

                    /** The part of this transaction amount that was for clinic-related services. */
                    fun clinic(clinic: Clinic?) = clinic(JsonField.ofNullable(clinic))

                    /** Alias for calling [Builder.clinic] with `clinic.orElse(null)`. */
                    fun clinic(clinic: Optional<Clinic>) = clinic(clinic.getOrNull())

                    /**
                     * Sets [Builder.clinic] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.clinic] with a well-typed [Clinic] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun clinic(clinic: JsonField<Clinic>) = apply { this.clinic = clinic }

                    /** The part of this transaction amount that was for dental-related services. */
                    fun dental(dental: Dental?) = dental(JsonField.ofNullable(dental))

                    /** Alias for calling [Builder.dental] with `dental.orElse(null)`. */
                    fun dental(dental: Optional<Dental>) = dental(dental.getOrNull())

                    /**
                     * Sets [Builder.dental] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.dental] with a well-typed [Dental] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun dental(dental: JsonField<Dental>) = apply { this.dental = dental }

                    /** The original pre-authorized amount. */
                    fun original(original: Original?) = original(JsonField.ofNullable(original))

                    /** Alias for calling [Builder.original] with `original.orElse(null)`. */
                    fun original(original: Optional<Original>) = original(original.getOrNull())

                    /**
                     * Sets [Builder.original] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.original] with a well-typed [Original] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun original(original: JsonField<Original>) = apply { this.original = original }

                    /**
                     * The part of this transaction amount that was for healthcare prescriptions.
                     */
                    fun prescription(prescription: Prescription?) =
                        prescription(JsonField.ofNullable(prescription))

                    /**
                     * Alias for calling [Builder.prescription] with `prescription.orElse(null)`.
                     */
                    fun prescription(prescription: Optional<Prescription>) =
                        prescription(prescription.getOrNull())

                    /**
                     * Sets [Builder.prescription] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.prescription] with a well-typed
                     * [Prescription] value instead. This method is primarily for setting the field
                     * to an undocumented or not yet supported value.
                     */
                    fun prescription(prescription: JsonField<Prescription>) = apply {
                        this.prescription = prescription
                    }

                    /** The surcharge amount charged for this transaction by the merchant. */
                    fun surcharge(surcharge: Surcharge?) =
                        surcharge(JsonField.ofNullable(surcharge))

                    /** Alias for calling [Builder.surcharge] with `surcharge.orElse(null)`. */
                    fun surcharge(surcharge: Optional<Surcharge>) = surcharge(surcharge.getOrNull())

                    /**
                     * Sets [Builder.surcharge] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.surcharge] with a well-typed [Surcharge]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun surcharge(surcharge: JsonField<Surcharge>) = apply {
                        this.surcharge = surcharge
                    }

                    /**
                     * The total amount of a series of incremental authorizations, optionally
                     * provided.
                     */
                    fun totalCumulative(totalCumulative: TotalCumulative?) =
                        totalCumulative(JsonField.ofNullable(totalCumulative))

                    /**
                     * Alias for calling [Builder.totalCumulative] with
                     * `totalCumulative.orElse(null)`.
                     */
                    fun totalCumulative(totalCumulative: Optional<TotalCumulative>) =
                        totalCumulative(totalCumulative.getOrNull())

                    /**
                     * Sets [Builder.totalCumulative] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.totalCumulative] with a well-typed
                     * [TotalCumulative] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun totalCumulative(totalCumulative: JsonField<TotalCumulative>) = apply {
                        this.totalCumulative = totalCumulative
                    }

                    /** The total amount of healthcare-related additional amounts. */
                    fun totalHealthcare(totalHealthcare: TotalHealthcare?) =
                        totalHealthcare(JsonField.ofNullable(totalHealthcare))

                    /**
                     * Alias for calling [Builder.totalHealthcare] with
                     * `totalHealthcare.orElse(null)`.
                     */
                    fun totalHealthcare(totalHealthcare: Optional<TotalHealthcare>) =
                        totalHealthcare(totalHealthcare.getOrNull())

                    /**
                     * Sets [Builder.totalHealthcare] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.totalHealthcare] with a well-typed
                     * [TotalHealthcare] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun totalHealthcare(totalHealthcare: JsonField<TotalHealthcare>) = apply {
                        this.totalHealthcare = totalHealthcare
                    }

                    /**
                     * The part of this transaction amount that was for transit-related services.
                     */
                    fun transit(transit: Transit?) = transit(JsonField.ofNullable(transit))

                    /** Alias for calling [Builder.transit] with `transit.orElse(null)`. */
                    fun transit(transit: Optional<Transit>) = transit(transit.getOrNull())

                    /**
                     * Sets [Builder.transit] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.transit] with a well-typed [Transit] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun transit(transit: JsonField<Transit>) = apply { this.transit = transit }

                    /** An unknown additional amount. */
                    fun unknown(unknown: Unknown?) = unknown(JsonField.ofNullable(unknown))

                    /** Alias for calling [Builder.unknown] with `unknown.orElse(null)`. */
                    fun unknown(unknown: Optional<Unknown>) = unknown(unknown.getOrNull())

                    /**
                     * Sets [Builder.unknown] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.unknown] with a well-typed [Unknown] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun unknown(unknown: JsonField<Unknown>) = apply { this.unknown = unknown }

                    /** The part of this transaction amount that was for vision-related services. */
                    fun vision(vision: Vision?) = vision(JsonField.ofNullable(vision))

                    /** Alias for calling [Builder.vision] with `vision.orElse(null)`. */
                    fun vision(vision: Optional<Vision>) = vision(vision.getOrNull())

                    /**
                     * Sets [Builder.vision] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.vision] with a well-typed [Vision] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun vision(vision: JsonField<Vision>) = apply { this.vision = vision }

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
                     * Returns an immutable instance of [AdditionalAmounts].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .clinic()
                     * .dental()
                     * .original()
                     * .prescription()
                     * .surcharge()
                     * .totalCumulative()
                     * .totalHealthcare()
                     * .transit()
                     * .unknown()
                     * .vision()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): AdditionalAmounts =
                        AdditionalAmounts(
                            checkRequired("clinic", clinic),
                            checkRequired("dental", dental),
                            checkRequired("original", original),
                            checkRequired("prescription", prescription),
                            checkRequired("surcharge", surcharge),
                            checkRequired("totalCumulative", totalCumulative),
                            checkRequired("totalHealthcare", totalHealthcare),
                            checkRequired("transit", transit),
                            checkRequired("unknown", unknown),
                            checkRequired("vision", vision),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): AdditionalAmounts = apply {
                    if (validated) {
                        return@apply
                    }

                    clinic().ifPresent { it.validate() }
                    dental().ifPresent { it.validate() }
                    original().ifPresent { it.validate() }
                    prescription().ifPresent { it.validate() }
                    surcharge().ifPresent { it.validate() }
                    totalCumulative().ifPresent { it.validate() }
                    totalHealthcare().ifPresent { it.validate() }
                    transit().ifPresent { it.validate() }
                    unknown().ifPresent { it.validate() }
                    vision().ifPresent { it.validate() }
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
                    (clinic.asKnown().getOrNull()?.validity() ?: 0) +
                        (dental.asKnown().getOrNull()?.validity() ?: 0) +
                        (original.asKnown().getOrNull()?.validity() ?: 0) +
                        (prescription.asKnown().getOrNull()?.validity() ?: 0) +
                        (surcharge.asKnown().getOrNull()?.validity() ?: 0) +
                        (totalCumulative.asKnown().getOrNull()?.validity() ?: 0) +
                        (totalHealthcare.asKnown().getOrNull()?.validity() ?: 0) +
                        (transit.asKnown().getOrNull()?.validity() ?: 0) +
                        (unknown.asKnown().getOrNull()?.validity() ?: 0) +
                        (vision.asKnown().getOrNull()?.validity() ?: 0)

                /** The part of this transaction amount that was for clinic-related services. */
                class Clinic
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val amount: JsonField<Long>,
                    private val currency: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("amount")
                        @ExcludeMissing
                        amount: JsonField<Long> = JsonMissing.of(),
                        @JsonProperty("currency")
                        @ExcludeMissing
                        currency: JsonField<String> = JsonMissing.of(),
                    ) : this(amount, currency, mutableMapOf())

                    /**
                     * The amount in minor units of the `currency` field. The amount is positive if
                     * it is added to the amount (such as an ATM surcharge fee) and negative if it
                     * is subtracted from the amount (such as a discount).
                     *
                     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun amount(): Long = amount.getRequired("amount")

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                     * additional amount's currency.
                     *
                     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun currency(): String = currency.getRequired("currency")

                    /**
                     * Returns the raw JSON value of [amount].
                     *
                     * Unlike [amount], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

                    /**
                     * Returns the raw JSON value of [currency].
                     *
                     * Unlike [currency], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("currency")
                    @ExcludeMissing
                    fun _currency(): JsonField<String> = currency

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
                         * Returns a mutable builder for constructing an instance of [Clinic].
                         *
                         * The following fields are required:
                         * ```java
                         * .amount()
                         * .currency()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Clinic]. */
                    class Builder internal constructor() {

                        private var amount: JsonField<Long>? = null
                        private var currency: JsonField<String>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(clinic: Clinic) = apply {
                            amount = clinic.amount
                            currency = clinic.currency
                            additionalProperties = clinic.additionalProperties.toMutableMap()
                        }

                        /**
                         * The amount in minor units of the `currency` field. The amount is positive
                         * if it is added to the amount (such as an ATM surcharge fee) and negative
                         * if it is subtracted from the amount (such as a discount).
                         */
                        fun amount(amount: Long) = amount(JsonField.of(amount))

                        /**
                         * Sets [Builder.amount] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.amount] with a well-typed [Long] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                         * additional amount's currency.
                         */
                        fun currency(currency: String) = currency(JsonField.of(currency))

                        /**
                         * Sets [Builder.currency] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.currency] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun currency(currency: JsonField<String>) = apply {
                            this.currency = currency
                        }

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
                         * Returns an immutable instance of [Clinic].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .amount()
                         * .currency()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): Clinic =
                            Clinic(
                                checkRequired("amount", amount),
                                checkRequired("currency", currency),
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): Clinic = apply {
                        if (validated) {
                            return@apply
                        }

                        amount()
                        currency()
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
                            (if (currency.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Clinic &&
                            amount == other.amount &&
                            currency == other.currency &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(amount, currency, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Clinic{amount=$amount, currency=$currency, additionalProperties=$additionalProperties}"
                }

                /** The part of this transaction amount that was for dental-related services. */
                class Dental
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val amount: JsonField<Long>,
                    private val currency: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("amount")
                        @ExcludeMissing
                        amount: JsonField<Long> = JsonMissing.of(),
                        @JsonProperty("currency")
                        @ExcludeMissing
                        currency: JsonField<String> = JsonMissing.of(),
                    ) : this(amount, currency, mutableMapOf())

                    /**
                     * The amount in minor units of the `currency` field. The amount is positive if
                     * it is added to the amount (such as an ATM surcharge fee) and negative if it
                     * is subtracted from the amount (such as a discount).
                     *
                     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun amount(): Long = amount.getRequired("amount")

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                     * additional amount's currency.
                     *
                     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun currency(): String = currency.getRequired("currency")

                    /**
                     * Returns the raw JSON value of [amount].
                     *
                     * Unlike [amount], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

                    /**
                     * Returns the raw JSON value of [currency].
                     *
                     * Unlike [currency], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("currency")
                    @ExcludeMissing
                    fun _currency(): JsonField<String> = currency

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
                         * Returns a mutable builder for constructing an instance of [Dental].
                         *
                         * The following fields are required:
                         * ```java
                         * .amount()
                         * .currency()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Dental]. */
                    class Builder internal constructor() {

                        private var amount: JsonField<Long>? = null
                        private var currency: JsonField<String>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(dental: Dental) = apply {
                            amount = dental.amount
                            currency = dental.currency
                            additionalProperties = dental.additionalProperties.toMutableMap()
                        }

                        /**
                         * The amount in minor units of the `currency` field. The amount is positive
                         * if it is added to the amount (such as an ATM surcharge fee) and negative
                         * if it is subtracted from the amount (such as a discount).
                         */
                        fun amount(amount: Long) = amount(JsonField.of(amount))

                        /**
                         * Sets [Builder.amount] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.amount] with a well-typed [Long] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                         * additional amount's currency.
                         */
                        fun currency(currency: String) = currency(JsonField.of(currency))

                        /**
                         * Sets [Builder.currency] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.currency] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun currency(currency: JsonField<String>) = apply {
                            this.currency = currency
                        }

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
                         * Returns an immutable instance of [Dental].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .amount()
                         * .currency()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): Dental =
                            Dental(
                                checkRequired("amount", amount),
                                checkRequired("currency", currency),
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): Dental = apply {
                        if (validated) {
                            return@apply
                        }

                        amount()
                        currency()
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
                            (if (currency.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Dental &&
                            amount == other.amount &&
                            currency == other.currency &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(amount, currency, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Dental{amount=$amount, currency=$currency, additionalProperties=$additionalProperties}"
                }

                /** The original pre-authorized amount. */
                class Original
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val amount: JsonField<Long>,
                    private val currency: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("amount")
                        @ExcludeMissing
                        amount: JsonField<Long> = JsonMissing.of(),
                        @JsonProperty("currency")
                        @ExcludeMissing
                        currency: JsonField<String> = JsonMissing.of(),
                    ) : this(amount, currency, mutableMapOf())

                    /**
                     * The amount in minor units of the `currency` field. The amount is positive if
                     * it is added to the amount (such as an ATM surcharge fee) and negative if it
                     * is subtracted from the amount (such as a discount).
                     *
                     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun amount(): Long = amount.getRequired("amount")

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                     * additional amount's currency.
                     *
                     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun currency(): String = currency.getRequired("currency")

                    /**
                     * Returns the raw JSON value of [amount].
                     *
                     * Unlike [amount], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

                    /**
                     * Returns the raw JSON value of [currency].
                     *
                     * Unlike [currency], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("currency")
                    @ExcludeMissing
                    fun _currency(): JsonField<String> = currency

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
                         * Returns a mutable builder for constructing an instance of [Original].
                         *
                         * The following fields are required:
                         * ```java
                         * .amount()
                         * .currency()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Original]. */
                    class Builder internal constructor() {

                        private var amount: JsonField<Long>? = null
                        private var currency: JsonField<String>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(original: Original) = apply {
                            amount = original.amount
                            currency = original.currency
                            additionalProperties = original.additionalProperties.toMutableMap()
                        }

                        /**
                         * The amount in minor units of the `currency` field. The amount is positive
                         * if it is added to the amount (such as an ATM surcharge fee) and negative
                         * if it is subtracted from the amount (such as a discount).
                         */
                        fun amount(amount: Long) = amount(JsonField.of(amount))

                        /**
                         * Sets [Builder.amount] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.amount] with a well-typed [Long] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                         * additional amount's currency.
                         */
                        fun currency(currency: String) = currency(JsonField.of(currency))

                        /**
                         * Sets [Builder.currency] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.currency] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun currency(currency: JsonField<String>) = apply {
                            this.currency = currency
                        }

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
                         * Returns an immutable instance of [Original].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .amount()
                         * .currency()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): Original =
                            Original(
                                checkRequired("amount", amount),
                                checkRequired("currency", currency),
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): Original = apply {
                        if (validated) {
                            return@apply
                        }

                        amount()
                        currency()
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
                            (if (currency.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Original &&
                            amount == other.amount &&
                            currency == other.currency &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(amount, currency, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Original{amount=$amount, currency=$currency, additionalProperties=$additionalProperties}"
                }

                /** The part of this transaction amount that was for healthcare prescriptions. */
                class Prescription
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val amount: JsonField<Long>,
                    private val currency: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("amount")
                        @ExcludeMissing
                        amount: JsonField<Long> = JsonMissing.of(),
                        @JsonProperty("currency")
                        @ExcludeMissing
                        currency: JsonField<String> = JsonMissing.of(),
                    ) : this(amount, currency, mutableMapOf())

                    /**
                     * The amount in minor units of the `currency` field. The amount is positive if
                     * it is added to the amount (such as an ATM surcharge fee) and negative if it
                     * is subtracted from the amount (such as a discount).
                     *
                     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun amount(): Long = amount.getRequired("amount")

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                     * additional amount's currency.
                     *
                     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun currency(): String = currency.getRequired("currency")

                    /**
                     * Returns the raw JSON value of [amount].
                     *
                     * Unlike [amount], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

                    /**
                     * Returns the raw JSON value of [currency].
                     *
                     * Unlike [currency], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("currency")
                    @ExcludeMissing
                    fun _currency(): JsonField<String> = currency

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
                         * Returns a mutable builder for constructing an instance of [Prescription].
                         *
                         * The following fields are required:
                         * ```java
                         * .amount()
                         * .currency()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Prescription]. */
                    class Builder internal constructor() {

                        private var amount: JsonField<Long>? = null
                        private var currency: JsonField<String>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(prescription: Prescription) = apply {
                            amount = prescription.amount
                            currency = prescription.currency
                            additionalProperties = prescription.additionalProperties.toMutableMap()
                        }

                        /**
                         * The amount in minor units of the `currency` field. The amount is positive
                         * if it is added to the amount (such as an ATM surcharge fee) and negative
                         * if it is subtracted from the amount (such as a discount).
                         */
                        fun amount(amount: Long) = amount(JsonField.of(amount))

                        /**
                         * Sets [Builder.amount] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.amount] with a well-typed [Long] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                         * additional amount's currency.
                         */
                        fun currency(currency: String) = currency(JsonField.of(currency))

                        /**
                         * Sets [Builder.currency] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.currency] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun currency(currency: JsonField<String>) = apply {
                            this.currency = currency
                        }

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
                         * Returns an immutable instance of [Prescription].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .amount()
                         * .currency()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): Prescription =
                            Prescription(
                                checkRequired("amount", amount),
                                checkRequired("currency", currency),
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): Prescription = apply {
                        if (validated) {
                            return@apply
                        }

                        amount()
                        currency()
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
                            (if (currency.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Prescription &&
                            amount == other.amount &&
                            currency == other.currency &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(amount, currency, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Prescription{amount=$amount, currency=$currency, additionalProperties=$additionalProperties}"
                }

                /** The surcharge amount charged for this transaction by the merchant. */
                class Surcharge
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val amount: JsonField<Long>,
                    private val currency: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("amount")
                        @ExcludeMissing
                        amount: JsonField<Long> = JsonMissing.of(),
                        @JsonProperty("currency")
                        @ExcludeMissing
                        currency: JsonField<String> = JsonMissing.of(),
                    ) : this(amount, currency, mutableMapOf())

                    /**
                     * The amount in minor units of the `currency` field. The amount is positive if
                     * it is added to the amount (such as an ATM surcharge fee) and negative if it
                     * is subtracted from the amount (such as a discount).
                     *
                     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun amount(): Long = amount.getRequired("amount")

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                     * additional amount's currency.
                     *
                     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun currency(): String = currency.getRequired("currency")

                    /**
                     * Returns the raw JSON value of [amount].
                     *
                     * Unlike [amount], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

                    /**
                     * Returns the raw JSON value of [currency].
                     *
                     * Unlike [currency], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("currency")
                    @ExcludeMissing
                    fun _currency(): JsonField<String> = currency

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
                         * Returns a mutable builder for constructing an instance of [Surcharge].
                         *
                         * The following fields are required:
                         * ```java
                         * .amount()
                         * .currency()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Surcharge]. */
                    class Builder internal constructor() {

                        private var amount: JsonField<Long>? = null
                        private var currency: JsonField<String>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(surcharge: Surcharge) = apply {
                            amount = surcharge.amount
                            currency = surcharge.currency
                            additionalProperties = surcharge.additionalProperties.toMutableMap()
                        }

                        /**
                         * The amount in minor units of the `currency` field. The amount is positive
                         * if it is added to the amount (such as an ATM surcharge fee) and negative
                         * if it is subtracted from the amount (such as a discount).
                         */
                        fun amount(amount: Long) = amount(JsonField.of(amount))

                        /**
                         * Sets [Builder.amount] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.amount] with a well-typed [Long] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                         * additional amount's currency.
                         */
                        fun currency(currency: String) = currency(JsonField.of(currency))

                        /**
                         * Sets [Builder.currency] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.currency] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun currency(currency: JsonField<String>) = apply {
                            this.currency = currency
                        }

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
                         * Returns an immutable instance of [Surcharge].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .amount()
                         * .currency()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): Surcharge =
                            Surcharge(
                                checkRequired("amount", amount),
                                checkRequired("currency", currency),
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): Surcharge = apply {
                        if (validated) {
                            return@apply
                        }

                        amount()
                        currency()
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
                            (if (currency.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Surcharge &&
                            amount == other.amount &&
                            currency == other.currency &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(amount, currency, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Surcharge{amount=$amount, currency=$currency, additionalProperties=$additionalProperties}"
                }

                /**
                 * The total amount of a series of incremental authorizations, optionally provided.
                 */
                class TotalCumulative
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val amount: JsonField<Long>,
                    private val currency: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("amount")
                        @ExcludeMissing
                        amount: JsonField<Long> = JsonMissing.of(),
                        @JsonProperty("currency")
                        @ExcludeMissing
                        currency: JsonField<String> = JsonMissing.of(),
                    ) : this(amount, currency, mutableMapOf())

                    /**
                     * The amount in minor units of the `currency` field. The amount is positive if
                     * it is added to the amount (such as an ATM surcharge fee) and negative if it
                     * is subtracted from the amount (such as a discount).
                     *
                     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun amount(): Long = amount.getRequired("amount")

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                     * additional amount's currency.
                     *
                     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun currency(): String = currency.getRequired("currency")

                    /**
                     * Returns the raw JSON value of [amount].
                     *
                     * Unlike [amount], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

                    /**
                     * Returns the raw JSON value of [currency].
                     *
                     * Unlike [currency], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("currency")
                    @ExcludeMissing
                    fun _currency(): JsonField<String> = currency

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
                         * [TotalCumulative].
                         *
                         * The following fields are required:
                         * ```java
                         * .amount()
                         * .currency()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [TotalCumulative]. */
                    class Builder internal constructor() {

                        private var amount: JsonField<Long>? = null
                        private var currency: JsonField<String>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(totalCumulative: TotalCumulative) = apply {
                            amount = totalCumulative.amount
                            currency = totalCumulative.currency
                            additionalProperties =
                                totalCumulative.additionalProperties.toMutableMap()
                        }

                        /**
                         * The amount in minor units of the `currency` field. The amount is positive
                         * if it is added to the amount (such as an ATM surcharge fee) and negative
                         * if it is subtracted from the amount (such as a discount).
                         */
                        fun amount(amount: Long) = amount(JsonField.of(amount))

                        /**
                         * Sets [Builder.amount] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.amount] with a well-typed [Long] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                         * additional amount's currency.
                         */
                        fun currency(currency: String) = currency(JsonField.of(currency))

                        /**
                         * Sets [Builder.currency] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.currency] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun currency(currency: JsonField<String>) = apply {
                            this.currency = currency
                        }

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
                         * Returns an immutable instance of [TotalCumulative].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .amount()
                         * .currency()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): TotalCumulative =
                            TotalCumulative(
                                checkRequired("amount", amount),
                                checkRequired("currency", currency),
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): TotalCumulative = apply {
                        if (validated) {
                            return@apply
                        }

                        amount()
                        currency()
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
                            (if (currency.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is TotalCumulative &&
                            amount == other.amount &&
                            currency == other.currency &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(amount, currency, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "TotalCumulative{amount=$amount, currency=$currency, additionalProperties=$additionalProperties}"
                }

                /** The total amount of healthcare-related additional amounts. */
                class TotalHealthcare
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val amount: JsonField<Long>,
                    private val currency: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("amount")
                        @ExcludeMissing
                        amount: JsonField<Long> = JsonMissing.of(),
                        @JsonProperty("currency")
                        @ExcludeMissing
                        currency: JsonField<String> = JsonMissing.of(),
                    ) : this(amount, currency, mutableMapOf())

                    /**
                     * The amount in minor units of the `currency` field. The amount is positive if
                     * it is added to the amount (such as an ATM surcharge fee) and negative if it
                     * is subtracted from the amount (such as a discount).
                     *
                     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun amount(): Long = amount.getRequired("amount")

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                     * additional amount's currency.
                     *
                     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun currency(): String = currency.getRequired("currency")

                    /**
                     * Returns the raw JSON value of [amount].
                     *
                     * Unlike [amount], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

                    /**
                     * Returns the raw JSON value of [currency].
                     *
                     * Unlike [currency], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("currency")
                    @ExcludeMissing
                    fun _currency(): JsonField<String> = currency

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
                         * [TotalHealthcare].
                         *
                         * The following fields are required:
                         * ```java
                         * .amount()
                         * .currency()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [TotalHealthcare]. */
                    class Builder internal constructor() {

                        private var amount: JsonField<Long>? = null
                        private var currency: JsonField<String>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(totalHealthcare: TotalHealthcare) = apply {
                            amount = totalHealthcare.amount
                            currency = totalHealthcare.currency
                            additionalProperties =
                                totalHealthcare.additionalProperties.toMutableMap()
                        }

                        /**
                         * The amount in minor units of the `currency` field. The amount is positive
                         * if it is added to the amount (such as an ATM surcharge fee) and negative
                         * if it is subtracted from the amount (such as a discount).
                         */
                        fun amount(amount: Long) = amount(JsonField.of(amount))

                        /**
                         * Sets [Builder.amount] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.amount] with a well-typed [Long] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                         * additional amount's currency.
                         */
                        fun currency(currency: String) = currency(JsonField.of(currency))

                        /**
                         * Sets [Builder.currency] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.currency] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun currency(currency: JsonField<String>) = apply {
                            this.currency = currency
                        }

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
                         * Returns an immutable instance of [TotalHealthcare].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .amount()
                         * .currency()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): TotalHealthcare =
                            TotalHealthcare(
                                checkRequired("amount", amount),
                                checkRequired("currency", currency),
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): TotalHealthcare = apply {
                        if (validated) {
                            return@apply
                        }

                        amount()
                        currency()
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
                            (if (currency.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is TotalHealthcare &&
                            amount == other.amount &&
                            currency == other.currency &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(amount, currency, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "TotalHealthcare{amount=$amount, currency=$currency, additionalProperties=$additionalProperties}"
                }

                /** The part of this transaction amount that was for transit-related services. */
                class Transit
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val amount: JsonField<Long>,
                    private val currency: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("amount")
                        @ExcludeMissing
                        amount: JsonField<Long> = JsonMissing.of(),
                        @JsonProperty("currency")
                        @ExcludeMissing
                        currency: JsonField<String> = JsonMissing.of(),
                    ) : this(amount, currency, mutableMapOf())

                    /**
                     * The amount in minor units of the `currency` field. The amount is positive if
                     * it is added to the amount (such as an ATM surcharge fee) and negative if it
                     * is subtracted from the amount (such as a discount).
                     *
                     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun amount(): Long = amount.getRequired("amount")

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                     * additional amount's currency.
                     *
                     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun currency(): String = currency.getRequired("currency")

                    /**
                     * Returns the raw JSON value of [amount].
                     *
                     * Unlike [amount], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

                    /**
                     * Returns the raw JSON value of [currency].
                     *
                     * Unlike [currency], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("currency")
                    @ExcludeMissing
                    fun _currency(): JsonField<String> = currency

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
                         * Returns a mutable builder for constructing an instance of [Transit].
                         *
                         * The following fields are required:
                         * ```java
                         * .amount()
                         * .currency()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Transit]. */
                    class Builder internal constructor() {

                        private var amount: JsonField<Long>? = null
                        private var currency: JsonField<String>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(transit: Transit) = apply {
                            amount = transit.amount
                            currency = transit.currency
                            additionalProperties = transit.additionalProperties.toMutableMap()
                        }

                        /**
                         * The amount in minor units of the `currency` field. The amount is positive
                         * if it is added to the amount (such as an ATM surcharge fee) and negative
                         * if it is subtracted from the amount (such as a discount).
                         */
                        fun amount(amount: Long) = amount(JsonField.of(amount))

                        /**
                         * Sets [Builder.amount] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.amount] with a well-typed [Long] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                         * additional amount's currency.
                         */
                        fun currency(currency: String) = currency(JsonField.of(currency))

                        /**
                         * Sets [Builder.currency] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.currency] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun currency(currency: JsonField<String>) = apply {
                            this.currency = currency
                        }

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
                         * Returns an immutable instance of [Transit].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .amount()
                         * .currency()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): Transit =
                            Transit(
                                checkRequired("amount", amount),
                                checkRequired("currency", currency),
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): Transit = apply {
                        if (validated) {
                            return@apply
                        }

                        amount()
                        currency()
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
                            (if (currency.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Transit &&
                            amount == other.amount &&
                            currency == other.currency &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(amount, currency, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Transit{amount=$amount, currency=$currency, additionalProperties=$additionalProperties}"
                }

                /** An unknown additional amount. */
                class Unknown
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val amount: JsonField<Long>,
                    private val currency: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("amount")
                        @ExcludeMissing
                        amount: JsonField<Long> = JsonMissing.of(),
                        @JsonProperty("currency")
                        @ExcludeMissing
                        currency: JsonField<String> = JsonMissing.of(),
                    ) : this(amount, currency, mutableMapOf())

                    /**
                     * The amount in minor units of the `currency` field. The amount is positive if
                     * it is added to the amount (such as an ATM surcharge fee) and negative if it
                     * is subtracted from the amount (such as a discount).
                     *
                     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun amount(): Long = amount.getRequired("amount")

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                     * additional amount's currency.
                     *
                     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun currency(): String = currency.getRequired("currency")

                    /**
                     * Returns the raw JSON value of [amount].
                     *
                     * Unlike [amount], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

                    /**
                     * Returns the raw JSON value of [currency].
                     *
                     * Unlike [currency], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("currency")
                    @ExcludeMissing
                    fun _currency(): JsonField<String> = currency

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
                         * Returns a mutable builder for constructing an instance of [Unknown].
                         *
                         * The following fields are required:
                         * ```java
                         * .amount()
                         * .currency()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Unknown]. */
                    class Builder internal constructor() {

                        private var amount: JsonField<Long>? = null
                        private var currency: JsonField<String>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(unknown: Unknown) = apply {
                            amount = unknown.amount
                            currency = unknown.currency
                            additionalProperties = unknown.additionalProperties.toMutableMap()
                        }

                        /**
                         * The amount in minor units of the `currency` field. The amount is positive
                         * if it is added to the amount (such as an ATM surcharge fee) and negative
                         * if it is subtracted from the amount (such as a discount).
                         */
                        fun amount(amount: Long) = amount(JsonField.of(amount))

                        /**
                         * Sets [Builder.amount] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.amount] with a well-typed [Long] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                         * additional amount's currency.
                         */
                        fun currency(currency: String) = currency(JsonField.of(currency))

                        /**
                         * Sets [Builder.currency] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.currency] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun currency(currency: JsonField<String>) = apply {
                            this.currency = currency
                        }

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
                         * Returns an immutable instance of [Unknown].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .amount()
                         * .currency()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): Unknown =
                            Unknown(
                                checkRequired("amount", amount),
                                checkRequired("currency", currency),
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): Unknown = apply {
                        if (validated) {
                            return@apply
                        }

                        amount()
                        currency()
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
                            (if (currency.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Unknown &&
                            amount == other.amount &&
                            currency == other.currency &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(amount, currency, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Unknown{amount=$amount, currency=$currency, additionalProperties=$additionalProperties}"
                }

                /** The part of this transaction amount that was for vision-related services. */
                class Vision
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val amount: JsonField<Long>,
                    private val currency: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("amount")
                        @ExcludeMissing
                        amount: JsonField<Long> = JsonMissing.of(),
                        @JsonProperty("currency")
                        @ExcludeMissing
                        currency: JsonField<String> = JsonMissing.of(),
                    ) : this(amount, currency, mutableMapOf())

                    /**
                     * The amount in minor units of the `currency` field. The amount is positive if
                     * it is added to the amount (such as an ATM surcharge fee) and negative if it
                     * is subtracted from the amount (such as a discount).
                     *
                     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun amount(): Long = amount.getRequired("amount")

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                     * additional amount's currency.
                     *
                     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun currency(): String = currency.getRequired("currency")

                    /**
                     * Returns the raw JSON value of [amount].
                     *
                     * Unlike [amount], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

                    /**
                     * Returns the raw JSON value of [currency].
                     *
                     * Unlike [currency], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("currency")
                    @ExcludeMissing
                    fun _currency(): JsonField<String> = currency

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
                         * Returns a mutable builder for constructing an instance of [Vision].
                         *
                         * The following fields are required:
                         * ```java
                         * .amount()
                         * .currency()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Vision]. */
                    class Builder internal constructor() {

                        private var amount: JsonField<Long>? = null
                        private var currency: JsonField<String>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(vision: Vision) = apply {
                            amount = vision.amount
                            currency = vision.currency
                            additionalProperties = vision.additionalProperties.toMutableMap()
                        }

                        /**
                         * The amount in minor units of the `currency` field. The amount is positive
                         * if it is added to the amount (such as an ATM surcharge fee) and negative
                         * if it is subtracted from the amount (such as a discount).
                         */
                        fun amount(amount: Long) = amount(JsonField.of(amount))

                        /**
                         * Sets [Builder.amount] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.amount] with a well-typed [Long] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                         * additional amount's currency.
                         */
                        fun currency(currency: String) = currency(JsonField.of(currency))

                        /**
                         * Sets [Builder.currency] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.currency] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun currency(currency: JsonField<String>) = apply {
                            this.currency = currency
                        }

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
                         * Returns an immutable instance of [Vision].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .amount()
                         * .currency()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): Vision =
                            Vision(
                                checkRequired("amount", amount),
                                checkRequired("currency", currency),
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): Vision = apply {
                        if (validated) {
                            return@apply
                        }

                        amount()
                        currency()
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
                            (if (currency.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Vision &&
                            amount == other.amount &&
                            currency == other.currency &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(amount, currency, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Vision{amount=$amount, currency=$currency, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is AdditionalAmounts &&
                        clinic == other.clinic &&
                        dental == other.dental &&
                        original == other.original &&
                        prescription == other.prescription &&
                        surcharge == other.surcharge &&
                        totalCumulative == other.totalCumulative &&
                        totalHealthcare == other.totalHealthcare &&
                        transit == other.transit &&
                        unknown == other.unknown &&
                        vision == other.vision &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        clinic,
                        dental,
                        original,
                        prescription,
                        surcharge,
                        totalCumulative,
                        totalHealthcare,
                        transit,
                        unknown,
                        vision,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "AdditionalAmounts{clinic=$clinic, dental=$dental, original=$original, prescription=$prescription, surcharge=$surcharge, totalCumulative=$totalCumulative, totalHealthcare=$totalHealthcare, transit=$transit, unknown=$unknown, vision=$vision, additionalProperties=$additionalProperties}"
            }

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

                    /** US Dollar (USD) */
                    @JvmField val USD = of("USD")

                    @JvmStatic fun of(value: String) = Currency(JsonField.of(value))
                }

                /** An enum containing [Currency]'s known values. */
                enum class Known {
                    /** US Dollar (USD) */
                    USD
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

                    return other is Currency && value == other.value
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

                    return other is Direction && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** Fields specific to the `network`. */
            class NetworkDetails
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val category: JsonField<Category>,
                private val pulse: JsonField<Pulse>,
                private val visa: JsonField<Visa>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("category")
                    @ExcludeMissing
                    category: JsonField<Category> = JsonMissing.of(),
                    @JsonProperty("pulse")
                    @ExcludeMissing
                    pulse: JsonField<Pulse> = JsonMissing.of(),
                    @JsonProperty("visa") @ExcludeMissing visa: JsonField<Visa> = JsonMissing.of(),
                ) : this(category, pulse, visa, mutableMapOf())

                /**
                 * The payment network used to process this card authorization.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun category(): Category = category.getRequired("category")

                /**
                 * Fields specific to the `pulse` network.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun pulse(): Optional<Pulse> = pulse.getOptional("pulse")

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
                 * Returns the raw JSON value of [pulse].
                 *
                 * Unlike [pulse], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("pulse") @ExcludeMissing fun _pulse(): JsonField<Pulse> = pulse

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
                     * .pulse()
                     * .visa()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [NetworkDetails]. */
                class Builder internal constructor() {

                    private var category: JsonField<Category>? = null
                    private var pulse: JsonField<Pulse>? = null
                    private var visa: JsonField<Visa>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(networkDetails: NetworkDetails) = apply {
                        category = networkDetails.category
                        pulse = networkDetails.pulse
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

                    /** Fields specific to the `pulse` network. */
                    fun pulse(pulse: Pulse?) = pulse(JsonField.ofNullable(pulse))

                    /** Alias for calling [Builder.pulse] with `pulse.orElse(null)`. */
                    fun pulse(pulse: Optional<Pulse>) = pulse(pulse.getOrNull())

                    /**
                     * Sets [Builder.pulse] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.pulse] with a well-typed [Pulse] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun pulse(pulse: JsonField<Pulse>) = apply { this.pulse = pulse }

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
                     * .pulse()
                     * .visa()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): NetworkDetails =
                        NetworkDetails(
                            checkRequired("category", category),
                            checkRequired("pulse", pulse),
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
                    pulse().ifPresent { it.validate() }
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
                        (pulse.asKnown().getOrNull()?.validity() ?: 0) +
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

                        /** Pulse */
                        @JvmField val PULSE = of("pulse")

                        @JvmStatic fun of(value: String) = Category(JsonField.of(value))
                    }

                    /** An enum containing [Category]'s known values. */
                    enum class Known {
                        /** Visa */
                        VISA,
                        /** Pulse */
                        PULSE,
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
                        /** Pulse */
                        PULSE,
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
                            PULSE -> Value.PULSE
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
                            PULSE -> Known.PULSE
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

                        return other is Category && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                /** Fields specific to the `pulse` network. */
                class Pulse
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val additionalProperties: MutableMap<String, JsonValue>
                ) {

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

                        /** Returns a mutable builder for constructing an instance of [Pulse]. */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Pulse]. */
                    class Builder internal constructor() {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(pulse: Pulse) = apply {
                            additionalProperties = pulse.additionalProperties.toMutableMap()
                        }

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
                         * Returns an immutable instance of [Pulse].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): Pulse = Pulse(additionalProperties.toMutableMap())
                    }

                    private var validated: Boolean = false

                    fun validate(): Pulse = apply {
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

                        return other is Pulse && additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                    override fun hashCode(): Int = hashCode

                    override fun toString() = "Pulse{additionalProperties=$additionalProperties}"
                }

                /** Fields specific to the `visa` network. */
                class Visa
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
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
                             * commerce transaction that uses data encryption for security however,
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
                             * commerce transaction that uses data encryption for security however,
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
                             * commerce transaction that uses data encryption for security however,
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

                            return other is ElectronicCommerceIndicator && value == other.value
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

                            return other is PointOfServiceEntryMode && value == other.value
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

                            return other is StandInProcessingReason && value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Visa &&
                            electronicCommerceIndicator == other.electronicCommerceIndicator &&
                            pointOfServiceEntryMode == other.pointOfServiceEntryMode &&
                            standInProcessingReason == other.standInProcessingReason &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(
                            electronicCommerceIndicator,
                            pointOfServiceEntryMode,
                            standInProcessingReason,
                            additionalProperties,
                        )
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Visa{electronicCommerceIndicator=$electronicCommerceIndicator, pointOfServiceEntryMode=$pointOfServiceEntryMode, standInProcessingReason=$standInProcessingReason, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is NetworkDetails &&
                        category == other.category &&
                        pulse == other.pulse &&
                        visa == other.visa &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(category, pulse, visa, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "NetworkDetails{category=$category, pulse=$pulse, visa=$visa, additionalProperties=$additionalProperties}"
            }

            /** Network-specific identifiers for a specific request or transaction. */
            class NetworkIdentifiers
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val authorizationIdentificationResponse: JsonField<String>,
                private val retrievalReferenceNumber: JsonField<String>,
                private val traceNumber: JsonField<String>,
                private val transactionId: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("authorization_identification_response")
                    @ExcludeMissing
                    authorizationIdentificationResponse: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("retrieval_reference_number")
                    @ExcludeMissing
                    retrievalReferenceNumber: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("trace_number")
                    @ExcludeMissing
                    traceNumber: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("transaction_id")
                    @ExcludeMissing
                    transactionId: JsonField<String> = JsonMissing.of(),
                ) : this(
                    authorizationIdentificationResponse,
                    retrievalReferenceNumber,
                    traceNumber,
                    transactionId,
                    mutableMapOf(),
                )

                /**
                 * The randomly generated 6-character Authorization Identification Response code
                 * sent back to the acquirer in an approved response.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun authorizationIdentificationResponse(): Optional<String> =
                    authorizationIdentificationResponse.getOptional(
                        "authorization_identification_response"
                    )

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
                 * Returns the raw JSON value of [authorizationIdentificationResponse].
                 *
                 * Unlike [authorizationIdentificationResponse], this method doesn't throw if the
                 * JSON field has an unexpected type.
                 */
                @JsonProperty("authorization_identification_response")
                @ExcludeMissing
                fun _authorizationIdentificationResponse(): JsonField<String> =
                    authorizationIdentificationResponse

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
                     * .authorizationIdentificationResponse()
                     * .retrievalReferenceNumber()
                     * .traceNumber()
                     * .transactionId()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [NetworkIdentifiers]. */
                class Builder internal constructor() {

                    private var authorizationIdentificationResponse: JsonField<String>? = null
                    private var retrievalReferenceNumber: JsonField<String>? = null
                    private var traceNumber: JsonField<String>? = null
                    private var transactionId: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(networkIdentifiers: NetworkIdentifiers) = apply {
                        authorizationIdentificationResponse =
                            networkIdentifiers.authorizationIdentificationResponse
                        retrievalReferenceNumber = networkIdentifiers.retrievalReferenceNumber
                        traceNumber = networkIdentifiers.traceNumber
                        transactionId = networkIdentifiers.transactionId
                        additionalProperties =
                            networkIdentifiers.additionalProperties.toMutableMap()
                    }

                    /**
                     * The randomly generated 6-character Authorization Identification Response code
                     * sent back to the acquirer in an approved response.
                     */
                    fun authorizationIdentificationResponse(
                        authorizationIdentificationResponse: String?
                    ) =
                        authorizationIdentificationResponse(
                            JsonField.ofNullable(authorizationIdentificationResponse)
                        )

                    /**
                     * Alias for calling [Builder.authorizationIdentificationResponse] with
                     * `authorizationIdentificationResponse.orElse(null)`.
                     */
                    fun authorizationIdentificationResponse(
                        authorizationIdentificationResponse: Optional<String>
                    ) =
                        authorizationIdentificationResponse(
                            authorizationIdentificationResponse.getOrNull()
                        )

                    /**
                     * Sets [Builder.authorizationIdentificationResponse] to an arbitrary JSON
                     * value.
                     *
                     * You should usually call [Builder.authorizationIdentificationResponse] with a
                     * well-typed [String] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun authorizationIdentificationResponse(
                        authorizationIdentificationResponse: JsonField<String>
                    ) = apply {
                        this.authorizationIdentificationResponse =
                            authorizationIdentificationResponse
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
                     * .authorizationIdentificationResponse()
                     * .retrievalReferenceNumber()
                     * .traceNumber()
                     * .transactionId()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): NetworkIdentifiers =
                        NetworkIdentifiers(
                            checkRequired(
                                "authorizationIdentificationResponse",
                                authorizationIdentificationResponse,
                            ),
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

                    authorizationIdentificationResponse()
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
                    (if (authorizationIdentificationResponse.asKnown().isPresent) 1 else 0) +
                        (if (retrievalReferenceNumber.asKnown().isPresent) 1 else 0) +
                        (if (traceNumber.asKnown().isPresent) 1 else 0) +
                        (if (transactionId.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is NetworkIdentifiers &&
                        authorizationIdentificationResponse ==
                            other.authorizationIdentificationResponse &&
                        retrievalReferenceNumber == other.retrievalReferenceNumber &&
                        traceNumber == other.traceNumber &&
                        transactionId == other.transactionId &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        authorizationIdentificationResponse,
                        retrievalReferenceNumber,
                        traceNumber,
                        transactionId,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "NetworkIdentifiers{authorizationIdentificationResponse=$authorizationIdentificationResponse, retrievalReferenceNumber=$retrievalReferenceNumber, traceNumber=$traceNumber, transactionId=$transactionId, additionalProperties=$additionalProperties}"
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

                    /** Original credit transactions are used to send money to a cardholder. */
                    @JvmField val ORIGINAL_CREDIT = of("original_credit")

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

                    /**
                     * Cash disbursement transactions are used to withdraw cash from an ATM or a
                     * point of sale.
                     */
                    @JvmField val CASH_DISBURSEMENT = of("cash_disbursement")

                    /**
                     * A balance inquiry transaction is used to check the balance of an account
                     * associated with a card.
                     */
                    @JvmField val BALANCE_INQUIRY = of("balance_inquiry")

                    /** The processing category is unknown. */
                    @JvmField val UNKNOWN = of("unknown")

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
                    /** Original credit transactions are used to send money to a cardholder. */
                    ORIGINAL_CREDIT,
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
                     * Cash disbursement transactions are used to withdraw cash from an ATM or a
                     * point of sale.
                     */
                    CASH_DISBURSEMENT,
                    /**
                     * A balance inquiry transaction is used to check the balance of an account
                     * associated with a card.
                     */
                    BALANCE_INQUIRY,
                    /** The processing category is unknown. */
                    UNKNOWN,
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
                    /** Original credit transactions are used to send money to a cardholder. */
                    ORIGINAL_CREDIT,
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
                     * Cash disbursement transactions are used to withdraw cash from an ATM or a
                     * point of sale.
                     */
                    CASH_DISBURSEMENT,
                    /**
                     * A balance inquiry transaction is used to check the balance of an account
                     * associated with a card.
                     */
                    BALANCE_INQUIRY,
                    /** The processing category is unknown. */
                    UNKNOWN,
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
                        ORIGINAL_CREDIT -> Value.ORIGINAL_CREDIT
                        PURCHASE -> Value.PURCHASE
                        QUASI_CASH -> Value.QUASI_CASH
                        REFUND -> Value.REFUND
                        CASH_DISBURSEMENT -> Value.CASH_DISBURSEMENT
                        BALANCE_INQUIRY -> Value.BALANCE_INQUIRY
                        UNKNOWN -> Value.UNKNOWN
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
                        ORIGINAL_CREDIT -> Known.ORIGINAL_CREDIT
                        PURCHASE -> Known.PURCHASE
                        QUASI_CASH -> Known.QUASI_CASH
                        REFUND -> Known.REFUND
                        CASH_DISBURSEMENT -> Known.CASH_DISBURSEMENT
                        BALANCE_INQUIRY -> Known.BALANCE_INQUIRY
                        UNKNOWN -> Known.UNKNOWN
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

                    return other is ProcessingCategory && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** This is present if a specific decline reason was given in the real-time decision. */
            class RealTimeDecisionReason
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
                     * The cardholder does not have sufficient funds to cover the transaction. The
                     * merchant may attempt to process the transaction again.
                     */
                    @JvmField val INSUFFICIENT_FUNDS = of("insufficient_funds")

                    /**
                     * This type of transaction is not allowed for this card. This transaction
                     * should not be retried.
                     */
                    @JvmField val TRANSACTION_NEVER_ALLOWED = of("transaction_never_allowed")

                    /**
                     * The transaction amount exceeds the cardholder's approval limit. The merchant
                     * may attempt to process the transaction again.
                     */
                    @JvmField val EXCEEDS_APPROVAL_LIMIT = of("exceeds_approval_limit")

                    /**
                     * The card has been temporarily disabled or not yet activated. The merchant may
                     * attempt to process the transaction again.
                     */
                    @JvmField val CARD_TEMPORARILY_DISABLED = of("card_temporarily_disabled")

                    /**
                     * The transaction is suspected to be fraudulent. The merchant may attempt to
                     * process the transaction again.
                     */
                    @JvmField val SUSPECTED_FRAUD = of("suspected_fraud")

                    /**
                     * The transaction was declined for another reason. The merchant may attempt to
                     * process the transaction again. This should be used sparingly.
                     */
                    @JvmField val OTHER = of("other")

                    @JvmStatic fun of(value: String) = RealTimeDecisionReason(JsonField.of(value))
                }

                /** An enum containing [RealTimeDecisionReason]'s known values. */
                enum class Known {
                    /**
                     * The cardholder does not have sufficient funds to cover the transaction. The
                     * merchant may attempt to process the transaction again.
                     */
                    INSUFFICIENT_FUNDS,
                    /**
                     * This type of transaction is not allowed for this card. This transaction
                     * should not be retried.
                     */
                    TRANSACTION_NEVER_ALLOWED,
                    /**
                     * The transaction amount exceeds the cardholder's approval limit. The merchant
                     * may attempt to process the transaction again.
                     */
                    EXCEEDS_APPROVAL_LIMIT,
                    /**
                     * The card has been temporarily disabled or not yet activated. The merchant may
                     * attempt to process the transaction again.
                     */
                    CARD_TEMPORARILY_DISABLED,
                    /**
                     * The transaction is suspected to be fraudulent. The merchant may attempt to
                     * process the transaction again.
                     */
                    SUSPECTED_FRAUD,
                    /**
                     * The transaction was declined for another reason. The merchant may attempt to
                     * process the transaction again. This should be used sparingly.
                     */
                    OTHER,
                }

                /**
                 * An enum containing [RealTimeDecisionReason]'s known values, as well as an
                 * [_UNKNOWN] member.
                 *
                 * An instance of [RealTimeDecisionReason] can contain an unknown value in a couple
                 * of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    /**
                     * The cardholder does not have sufficient funds to cover the transaction. The
                     * merchant may attempt to process the transaction again.
                     */
                    INSUFFICIENT_FUNDS,
                    /**
                     * This type of transaction is not allowed for this card. This transaction
                     * should not be retried.
                     */
                    TRANSACTION_NEVER_ALLOWED,
                    /**
                     * The transaction amount exceeds the cardholder's approval limit. The merchant
                     * may attempt to process the transaction again.
                     */
                    EXCEEDS_APPROVAL_LIMIT,
                    /**
                     * The card has been temporarily disabled or not yet activated. The merchant may
                     * attempt to process the transaction again.
                     */
                    CARD_TEMPORARILY_DISABLED,
                    /**
                     * The transaction is suspected to be fraudulent. The merchant may attempt to
                     * process the transaction again.
                     */
                    SUSPECTED_FRAUD,
                    /**
                     * The transaction was declined for another reason. The merchant may attempt to
                     * process the transaction again. This should be used sparingly.
                     */
                    OTHER,
                    /**
                     * An enum member indicating that [RealTimeDecisionReason] was instantiated with
                     * an unknown value.
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
                        INSUFFICIENT_FUNDS -> Value.INSUFFICIENT_FUNDS
                        TRANSACTION_NEVER_ALLOWED -> Value.TRANSACTION_NEVER_ALLOWED
                        EXCEEDS_APPROVAL_LIMIT -> Value.EXCEEDS_APPROVAL_LIMIT
                        CARD_TEMPORARILY_DISABLED -> Value.CARD_TEMPORARILY_DISABLED
                        SUSPECTED_FRAUD -> Value.SUSPECTED_FRAUD
                        OTHER -> Value.OTHER
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
                        INSUFFICIENT_FUNDS -> Known.INSUFFICIENT_FUNDS
                        TRANSACTION_NEVER_ALLOWED -> Known.TRANSACTION_NEVER_ALLOWED
                        EXCEEDS_APPROVAL_LIMIT -> Known.EXCEEDS_APPROVAL_LIMIT
                        CARD_TEMPORARILY_DISABLED -> Known.CARD_TEMPORARILY_DISABLED
                        SUSPECTED_FRAUD -> Known.SUSPECTED_FRAUD
                        OTHER -> Known.OTHER
                        else ->
                            throw IncreaseInvalidDataException(
                                "Unknown RealTimeDecisionReason: $value"
                            )
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

                fun validate(): RealTimeDecisionReason = apply {
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

                    return other is RealTimeDecisionReason && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** Why the transaction was declined. */
            class Reason @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    /** The account has been closed. */
                    @JvmField val ACCOUNT_CLOSED = of("account_closed")

                    /** The Card was not active. */
                    @JvmField val CARD_NOT_ACTIVE = of("card_not_active")

                    /** The Card has been canceled. */
                    @JvmField val CARD_CANCELED = of("card_canceled")

                    /** The Physical Card was not active. */
                    @JvmField val PHYSICAL_CARD_NOT_ACTIVE = of("physical_card_not_active")

                    /** The account's entity was not active. */
                    @JvmField val ENTITY_NOT_ACTIVE = of("entity_not_active")

                    /** The account was inactive. */
                    @JvmField val GROUP_LOCKED = of("group_locked")

                    /** The Card's Account did not have a sufficient available balance. */
                    @JvmField val INSUFFICIENT_FUNDS = of("insufficient_funds")

                    /** The given CVV2 did not match the card's value. */
                    @JvmField val CVV2_MISMATCH = of("cvv2_mismatch")

                    /** The given PIN did not match the card's value. */
                    @JvmField val PIN_MISMATCH = of("pin_mismatch")

                    /**
                     * The given expiration date did not match the card's value. Only applies when a
                     * CVV2 is present.
                     */
                    @JvmField val CARD_EXPIRATION_MISMATCH = of("card_expiration_mismatch")

                    /** The attempted card transaction is not allowed per Increase's terms. */
                    @JvmField val TRANSACTION_NOT_ALLOWED = of("transaction_not_allowed")

                    /** The transaction was blocked by a Limit. */
                    @JvmField val BREACHES_LIMIT = of("breaches_limit")

                    /** Your application declined the transaction via webhook. */
                    @JvmField val WEBHOOK_DECLINED = of("webhook_declined")

                    /** Your application webhook did not respond without the required timeout. */
                    @JvmField val WEBHOOK_TIMED_OUT = of("webhook_timed_out")

                    /** Declined by stand-in processing. */
                    @JvmField
                    val DECLINED_BY_STAND_IN_PROCESSING = of("declined_by_stand_in_processing")

                    /**
                     * The card read had an invalid CVV, dCVV, or authorization request cryptogram.
                     */
                    @JvmField val INVALID_PHYSICAL_CARD = of("invalid_physical_card")

                    /**
                     * The original card authorization for this incremental authorization does not
                     * exist.
                     */
                    @JvmField
                    val MISSING_ORIGINAL_AUTHORIZATION = of("missing_original_authorization")

                    /** The transaction was declined because the 3DS authentication failed. */
                    @JvmField val FAILED_3DS_AUTHENTICATION = of("failed_3ds_authentication")

                    /**
                     * The transaction was suspected to be used by a card tester to test for valid
                     * card numbers.
                     */
                    @JvmField val SUSPECTED_CARD_TESTING = of("suspected_card_testing")

                    /**
                     * The transaction was suspected to be fraudulent. Please reach out to
                     * support@increase.com for more information.
                     */
                    @JvmField val SUSPECTED_FRAUD = of("suspected_fraud")

                    @JvmStatic fun of(value: String) = Reason(JsonField.of(value))
                }

                /** An enum containing [Reason]'s known values. */
                enum class Known {
                    /** The account has been closed. */
                    ACCOUNT_CLOSED,
                    /** The Card was not active. */
                    CARD_NOT_ACTIVE,
                    /** The Card has been canceled. */
                    CARD_CANCELED,
                    /** The Physical Card was not active. */
                    PHYSICAL_CARD_NOT_ACTIVE,
                    /** The account's entity was not active. */
                    ENTITY_NOT_ACTIVE,
                    /** The account was inactive. */
                    GROUP_LOCKED,
                    /** The Card's Account did not have a sufficient available balance. */
                    INSUFFICIENT_FUNDS,
                    /** The given CVV2 did not match the card's value. */
                    CVV2_MISMATCH,
                    /** The given PIN did not match the card's value. */
                    PIN_MISMATCH,
                    /**
                     * The given expiration date did not match the card's value. Only applies when a
                     * CVV2 is present.
                     */
                    CARD_EXPIRATION_MISMATCH,
                    /** The attempted card transaction is not allowed per Increase's terms. */
                    TRANSACTION_NOT_ALLOWED,
                    /** The transaction was blocked by a Limit. */
                    BREACHES_LIMIT,
                    /** Your application declined the transaction via webhook. */
                    WEBHOOK_DECLINED,
                    /** Your application webhook did not respond without the required timeout. */
                    WEBHOOK_TIMED_OUT,
                    /** Declined by stand-in processing. */
                    DECLINED_BY_STAND_IN_PROCESSING,
                    /**
                     * The card read had an invalid CVV, dCVV, or authorization request cryptogram.
                     */
                    INVALID_PHYSICAL_CARD,
                    /**
                     * The original card authorization for this incremental authorization does not
                     * exist.
                     */
                    MISSING_ORIGINAL_AUTHORIZATION,
                    /** The transaction was declined because the 3DS authentication failed. */
                    FAILED_3DS_AUTHENTICATION,
                    /**
                     * The transaction was suspected to be used by a card tester to test for valid
                     * card numbers.
                     */
                    SUSPECTED_CARD_TESTING,
                    /**
                     * The transaction was suspected to be fraudulent. Please reach out to
                     * support@increase.com for more information.
                     */
                    SUSPECTED_FRAUD,
                }

                /**
                 * An enum containing [Reason]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Reason] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    /** The account has been closed. */
                    ACCOUNT_CLOSED,
                    /** The Card was not active. */
                    CARD_NOT_ACTIVE,
                    /** The Card has been canceled. */
                    CARD_CANCELED,
                    /** The Physical Card was not active. */
                    PHYSICAL_CARD_NOT_ACTIVE,
                    /** The account's entity was not active. */
                    ENTITY_NOT_ACTIVE,
                    /** The account was inactive. */
                    GROUP_LOCKED,
                    /** The Card's Account did not have a sufficient available balance. */
                    INSUFFICIENT_FUNDS,
                    /** The given CVV2 did not match the card's value. */
                    CVV2_MISMATCH,
                    /** The given PIN did not match the card's value. */
                    PIN_MISMATCH,
                    /**
                     * The given expiration date did not match the card's value. Only applies when a
                     * CVV2 is present.
                     */
                    CARD_EXPIRATION_MISMATCH,
                    /** The attempted card transaction is not allowed per Increase's terms. */
                    TRANSACTION_NOT_ALLOWED,
                    /** The transaction was blocked by a Limit. */
                    BREACHES_LIMIT,
                    /** Your application declined the transaction via webhook. */
                    WEBHOOK_DECLINED,
                    /** Your application webhook did not respond without the required timeout. */
                    WEBHOOK_TIMED_OUT,
                    /** Declined by stand-in processing. */
                    DECLINED_BY_STAND_IN_PROCESSING,
                    /**
                     * The card read had an invalid CVV, dCVV, or authorization request cryptogram.
                     */
                    INVALID_PHYSICAL_CARD,
                    /**
                     * The original card authorization for this incremental authorization does not
                     * exist.
                     */
                    MISSING_ORIGINAL_AUTHORIZATION,
                    /** The transaction was declined because the 3DS authentication failed. */
                    FAILED_3DS_AUTHENTICATION,
                    /**
                     * The transaction was suspected to be used by a card tester to test for valid
                     * card numbers.
                     */
                    SUSPECTED_CARD_TESTING,
                    /**
                     * The transaction was suspected to be fraudulent. Please reach out to
                     * support@increase.com for more information.
                     */
                    SUSPECTED_FRAUD,
                    /**
                     * An enum member indicating that [Reason] was instantiated with an unknown
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
                        ACCOUNT_CLOSED -> Value.ACCOUNT_CLOSED
                        CARD_NOT_ACTIVE -> Value.CARD_NOT_ACTIVE
                        CARD_CANCELED -> Value.CARD_CANCELED
                        PHYSICAL_CARD_NOT_ACTIVE -> Value.PHYSICAL_CARD_NOT_ACTIVE
                        ENTITY_NOT_ACTIVE -> Value.ENTITY_NOT_ACTIVE
                        GROUP_LOCKED -> Value.GROUP_LOCKED
                        INSUFFICIENT_FUNDS -> Value.INSUFFICIENT_FUNDS
                        CVV2_MISMATCH -> Value.CVV2_MISMATCH
                        PIN_MISMATCH -> Value.PIN_MISMATCH
                        CARD_EXPIRATION_MISMATCH -> Value.CARD_EXPIRATION_MISMATCH
                        TRANSACTION_NOT_ALLOWED -> Value.TRANSACTION_NOT_ALLOWED
                        BREACHES_LIMIT -> Value.BREACHES_LIMIT
                        WEBHOOK_DECLINED -> Value.WEBHOOK_DECLINED
                        WEBHOOK_TIMED_OUT -> Value.WEBHOOK_TIMED_OUT
                        DECLINED_BY_STAND_IN_PROCESSING -> Value.DECLINED_BY_STAND_IN_PROCESSING
                        INVALID_PHYSICAL_CARD -> Value.INVALID_PHYSICAL_CARD
                        MISSING_ORIGINAL_AUTHORIZATION -> Value.MISSING_ORIGINAL_AUTHORIZATION
                        FAILED_3DS_AUTHENTICATION -> Value.FAILED_3DS_AUTHENTICATION
                        SUSPECTED_CARD_TESTING -> Value.SUSPECTED_CARD_TESTING
                        SUSPECTED_FRAUD -> Value.SUSPECTED_FRAUD
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
                        ACCOUNT_CLOSED -> Known.ACCOUNT_CLOSED
                        CARD_NOT_ACTIVE -> Known.CARD_NOT_ACTIVE
                        CARD_CANCELED -> Known.CARD_CANCELED
                        PHYSICAL_CARD_NOT_ACTIVE -> Known.PHYSICAL_CARD_NOT_ACTIVE
                        ENTITY_NOT_ACTIVE -> Known.ENTITY_NOT_ACTIVE
                        GROUP_LOCKED -> Known.GROUP_LOCKED
                        INSUFFICIENT_FUNDS -> Known.INSUFFICIENT_FUNDS
                        CVV2_MISMATCH -> Known.CVV2_MISMATCH
                        PIN_MISMATCH -> Known.PIN_MISMATCH
                        CARD_EXPIRATION_MISMATCH -> Known.CARD_EXPIRATION_MISMATCH
                        TRANSACTION_NOT_ALLOWED -> Known.TRANSACTION_NOT_ALLOWED
                        BREACHES_LIMIT -> Known.BREACHES_LIMIT
                        WEBHOOK_DECLINED -> Known.WEBHOOK_DECLINED
                        WEBHOOK_TIMED_OUT -> Known.WEBHOOK_TIMED_OUT
                        DECLINED_BY_STAND_IN_PROCESSING -> Known.DECLINED_BY_STAND_IN_PROCESSING
                        INVALID_PHYSICAL_CARD -> Known.INVALID_PHYSICAL_CARD
                        MISSING_ORIGINAL_AUTHORIZATION -> Known.MISSING_ORIGINAL_AUTHORIZATION
                        FAILED_3DS_AUTHENTICATION -> Known.FAILED_3DS_AUTHENTICATION
                        SUSPECTED_CARD_TESTING -> Known.SUSPECTED_CARD_TESTING
                        SUSPECTED_FRAUD -> Known.SUSPECTED_FRAUD
                        else -> throw IncreaseInvalidDataException("Unknown Reason: $value")
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

                fun validate(): Reason = apply {
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

                    return other is Reason && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** Fields related to verification of cardholder-provided values. */
            class Verification
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val cardVerificationCode: JsonField<CardVerificationCode>,
                private val cardholderAddress: JsonField<CardholderAddress>,
                private val cardholderName: JsonField<CardholderName>,
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
                    @JsonProperty("cardholder_name")
                    @ExcludeMissing
                    cardholderName: JsonField<CardholderName> = JsonMissing.of(),
                ) : this(cardVerificationCode, cardholderAddress, cardholderName, mutableMapOf())

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
                 * Cardholder name provided in the authorization request.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun cardholderName(): Optional<CardholderName> =
                    cardholderName.getOptional("cardholder_name")

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

                /**
                 * Returns the raw JSON value of [cardholderName].
                 *
                 * Unlike [cardholderName], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("cardholder_name")
                @ExcludeMissing
                fun _cardholderName(): JsonField<CardholderName> = cardholderName

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
                     * .cardholderName()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Verification]. */
                class Builder internal constructor() {

                    private var cardVerificationCode: JsonField<CardVerificationCode>? = null
                    private var cardholderAddress: JsonField<CardholderAddress>? = null
                    private var cardholderName: JsonField<CardholderName>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(verification: Verification) = apply {
                        cardVerificationCode = verification.cardVerificationCode
                        cardholderAddress = verification.cardholderAddress
                        cardholderName = verification.cardholderName
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

                    /** Cardholder name provided in the authorization request. */
                    fun cardholderName(cardholderName: CardholderName?) =
                        cardholderName(JsonField.ofNullable(cardholderName))

                    /**
                     * Alias for calling [Builder.cardholderName] with
                     * `cardholderName.orElse(null)`.
                     */
                    fun cardholderName(cardholderName: Optional<CardholderName>) =
                        cardholderName(cardholderName.getOrNull())

                    /**
                     * Sets [Builder.cardholderName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.cardholderName] with a well-typed
                     * [CardholderName] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun cardholderName(cardholderName: JsonField<CardholderName>) = apply {
                        this.cardholderName = cardholderName
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
                     * .cardholderName()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Verification =
                        Verification(
                            checkRequired("cardVerificationCode", cardVerificationCode),
                            checkRequired("cardholderAddress", cardholderAddress),
                            checkRequired("cardholderName", cardholderName),
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
                    cardholderName().ifPresent { it.validate() }
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
                        (cardholderAddress.asKnown().getOrNull()?.validity() ?: 0) +
                        (cardholderName.asKnown().getOrNull()?.validity() ?: 0)

                /**
                 * Fields related to verification of the Card Verification Code, a 3-digit code on
                 * the back of the card.
                 */
                class CardVerificationCode
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
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

                            return other is Result && value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is CardVerificationCode &&
                            result == other.result &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy { Objects.hash(result, additionalProperties) }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "CardVerificationCode{result=$result, additionalProperties=$additionalProperties}"
                }

                /**
                 * Cardholder address provided in the authorization request and the address on file
                 * we verified it against.
                 */
                class CardholderAddress
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
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

                            /** No address information was provided in the authorization request. */
                            @JvmField val NOT_CHECKED = of("not_checked")

                            /**
                             * Postal code matches, but the street address does not match or was not
                             * provided.
                             */
                            @JvmField
                            val POSTAL_CODE_MATCH_ADDRESS_NO_MATCH =
                                of("postal_code_match_address_no_match")

                            /**
                             * Postal code does not match, but the street address matches or was not
                             * provided.
                             */
                            @JvmField
                            val POSTAL_CODE_NO_MATCH_ADDRESS_MATCH =
                                of("postal_code_no_match_address_match")

                            /** Postal code and street address match. */
                            @JvmField val MATCH = of("match")

                            /** Postal code and street address do not match. */
                            @JvmField val NO_MATCH = of("no_match")

                            /**
                             * Postal code matches, but the street address was not verified.
                             * (deprecated)
                             */
                            @JvmField
                            val POSTAL_CODE_MATCH_ADDRESS_NOT_CHECKED =
                                of("postal_code_match_address_not_checked")

                            @JvmStatic fun of(value: String) = Result(JsonField.of(value))
                        }

                        /** An enum containing [Result]'s known values. */
                        enum class Known {
                            /** No address information was provided in the authorization request. */
                            NOT_CHECKED,
                            /**
                             * Postal code matches, but the street address does not match or was not
                             * provided.
                             */
                            POSTAL_CODE_MATCH_ADDRESS_NO_MATCH,
                            /**
                             * Postal code does not match, but the street address matches or was not
                             * provided.
                             */
                            POSTAL_CODE_NO_MATCH_ADDRESS_MATCH,
                            /** Postal code and street address match. */
                            MATCH,
                            /** Postal code and street address do not match. */
                            NO_MATCH,
                            /**
                             * Postal code matches, but the street address was not verified.
                             * (deprecated)
                             */
                            POSTAL_CODE_MATCH_ADDRESS_NOT_CHECKED,
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
                            /** No address information was provided in the authorization request. */
                            NOT_CHECKED,
                            /**
                             * Postal code matches, but the street address does not match or was not
                             * provided.
                             */
                            POSTAL_CODE_MATCH_ADDRESS_NO_MATCH,
                            /**
                             * Postal code does not match, but the street address matches or was not
                             * provided.
                             */
                            POSTAL_CODE_NO_MATCH_ADDRESS_MATCH,
                            /** Postal code and street address match. */
                            MATCH,
                            /** Postal code and street address do not match. */
                            NO_MATCH,
                            /**
                             * Postal code matches, but the street address was not verified.
                             * (deprecated)
                             */
                            POSTAL_CODE_MATCH_ADDRESS_NOT_CHECKED,
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
                                POSTAL_CODE_MATCH_ADDRESS_NO_MATCH ->
                                    Value.POSTAL_CODE_MATCH_ADDRESS_NO_MATCH
                                POSTAL_CODE_NO_MATCH_ADDRESS_MATCH ->
                                    Value.POSTAL_CODE_NO_MATCH_ADDRESS_MATCH
                                MATCH -> Value.MATCH
                                NO_MATCH -> Value.NO_MATCH
                                POSTAL_CODE_MATCH_ADDRESS_NOT_CHECKED ->
                                    Value.POSTAL_CODE_MATCH_ADDRESS_NOT_CHECKED
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
                                POSTAL_CODE_MATCH_ADDRESS_NO_MATCH ->
                                    Known.POSTAL_CODE_MATCH_ADDRESS_NO_MATCH
                                POSTAL_CODE_NO_MATCH_ADDRESS_MATCH ->
                                    Known.POSTAL_CODE_NO_MATCH_ADDRESS_MATCH
                                MATCH -> Known.MATCH
                                NO_MATCH -> Known.NO_MATCH
                                POSTAL_CODE_MATCH_ADDRESS_NOT_CHECKED ->
                                    Known.POSTAL_CODE_MATCH_ADDRESS_NOT_CHECKED
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

                            return other is Result && value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is CardholderAddress &&
                            actualLine1 == other.actualLine1 &&
                            actualPostalCode == other.actualPostalCode &&
                            providedLine1 == other.providedLine1 &&
                            providedPostalCode == other.providedPostalCode &&
                            result == other.result &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(
                            actualLine1,
                            actualPostalCode,
                            providedLine1,
                            providedPostalCode,
                            result,
                            additionalProperties,
                        )
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "CardholderAddress{actualLine1=$actualLine1, actualPostalCode=$actualPostalCode, providedLine1=$providedLine1, providedPostalCode=$providedPostalCode, result=$result, additionalProperties=$additionalProperties}"
                }

                /** Cardholder name provided in the authorization request. */
                class CardholderName
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val providedFirstName: JsonField<String>,
                    private val providedLastName: JsonField<String>,
                    private val providedMiddleName: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("provided_first_name")
                        @ExcludeMissing
                        providedFirstName: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("provided_last_name")
                        @ExcludeMissing
                        providedLastName: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("provided_middle_name")
                        @ExcludeMissing
                        providedMiddleName: JsonField<String> = JsonMissing.of(),
                    ) : this(
                        providedFirstName,
                        providedLastName,
                        providedMiddleName,
                        mutableMapOf(),
                    )

                    /**
                     * The first name provided for verification in the authorization request.
                     *
                     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun providedFirstName(): Optional<String> =
                        providedFirstName.getOptional("provided_first_name")

                    /**
                     * The last name provided for verification in the authorization request.
                     *
                     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun providedLastName(): Optional<String> =
                        providedLastName.getOptional("provided_last_name")

                    /**
                     * The middle name provided for verification in the authorization request.
                     *
                     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun providedMiddleName(): Optional<String> =
                        providedMiddleName.getOptional("provided_middle_name")

                    /**
                     * Returns the raw JSON value of [providedFirstName].
                     *
                     * Unlike [providedFirstName], this method doesn't throw if the JSON field has
                     * an unexpected type.
                     */
                    @JsonProperty("provided_first_name")
                    @ExcludeMissing
                    fun _providedFirstName(): JsonField<String> = providedFirstName

                    /**
                     * Returns the raw JSON value of [providedLastName].
                     *
                     * Unlike [providedLastName], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("provided_last_name")
                    @ExcludeMissing
                    fun _providedLastName(): JsonField<String> = providedLastName

                    /**
                     * Returns the raw JSON value of [providedMiddleName].
                     *
                     * Unlike [providedMiddleName], this method doesn't throw if the JSON field has
                     * an unexpected type.
                     */
                    @JsonProperty("provided_middle_name")
                    @ExcludeMissing
                    fun _providedMiddleName(): JsonField<String> = providedMiddleName

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
                         * [CardholderName].
                         *
                         * The following fields are required:
                         * ```java
                         * .providedFirstName()
                         * .providedLastName()
                         * .providedMiddleName()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [CardholderName]. */
                    class Builder internal constructor() {

                        private var providedFirstName: JsonField<String>? = null
                        private var providedLastName: JsonField<String>? = null
                        private var providedMiddleName: JsonField<String>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(cardholderName: CardholderName) = apply {
                            providedFirstName = cardholderName.providedFirstName
                            providedLastName = cardholderName.providedLastName
                            providedMiddleName = cardholderName.providedMiddleName
                            additionalProperties =
                                cardholderName.additionalProperties.toMutableMap()
                        }

                        /**
                         * The first name provided for verification in the authorization request.
                         */
                        fun providedFirstName(providedFirstName: String?) =
                            providedFirstName(JsonField.ofNullable(providedFirstName))

                        /**
                         * Alias for calling [Builder.providedFirstName] with
                         * `providedFirstName.orElse(null)`.
                         */
                        fun providedFirstName(providedFirstName: Optional<String>) =
                            providedFirstName(providedFirstName.getOrNull())

                        /**
                         * Sets [Builder.providedFirstName] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.providedFirstName] with a well-typed
                         * [String] value instead. This method is primarily for setting the field to
                         * an undocumented or not yet supported value.
                         */
                        fun providedFirstName(providedFirstName: JsonField<String>) = apply {
                            this.providedFirstName = providedFirstName
                        }

                        /** The last name provided for verification in the authorization request. */
                        fun providedLastName(providedLastName: String?) =
                            providedLastName(JsonField.ofNullable(providedLastName))

                        /**
                         * Alias for calling [Builder.providedLastName] with
                         * `providedLastName.orElse(null)`.
                         */
                        fun providedLastName(providedLastName: Optional<String>) =
                            providedLastName(providedLastName.getOrNull())

                        /**
                         * Sets [Builder.providedLastName] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.providedLastName] with a well-typed
                         * [String] value instead. This method is primarily for setting the field to
                         * an undocumented or not yet supported value.
                         */
                        fun providedLastName(providedLastName: JsonField<String>) = apply {
                            this.providedLastName = providedLastName
                        }

                        /**
                         * The middle name provided for verification in the authorization request.
                         */
                        fun providedMiddleName(providedMiddleName: String?) =
                            providedMiddleName(JsonField.ofNullable(providedMiddleName))

                        /**
                         * Alias for calling [Builder.providedMiddleName] with
                         * `providedMiddleName.orElse(null)`.
                         */
                        fun providedMiddleName(providedMiddleName: Optional<String>) =
                            providedMiddleName(providedMiddleName.getOrNull())

                        /**
                         * Sets [Builder.providedMiddleName] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.providedMiddleName] with a well-typed
                         * [String] value instead. This method is primarily for setting the field to
                         * an undocumented or not yet supported value.
                         */
                        fun providedMiddleName(providedMiddleName: JsonField<String>) = apply {
                            this.providedMiddleName = providedMiddleName
                        }

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
                         * Returns an immutable instance of [CardholderName].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .providedFirstName()
                         * .providedLastName()
                         * .providedMiddleName()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): CardholderName =
                            CardholderName(
                                checkRequired("providedFirstName", providedFirstName),
                                checkRequired("providedLastName", providedLastName),
                                checkRequired("providedMiddleName", providedMiddleName),
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): CardholderName = apply {
                        if (validated) {
                            return@apply
                        }

                        providedFirstName()
                        providedLastName()
                        providedMiddleName()
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
                        (if (providedFirstName.asKnown().isPresent) 1 else 0) +
                            (if (providedLastName.asKnown().isPresent) 1 else 0) +
                            (if (providedMiddleName.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is CardholderName &&
                            providedFirstName == other.providedFirstName &&
                            providedLastName == other.providedLastName &&
                            providedMiddleName == other.providedMiddleName &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(
                            providedFirstName,
                            providedLastName,
                            providedMiddleName,
                            additionalProperties,
                        )
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "CardholderName{providedFirstName=$providedFirstName, providedLastName=$providedLastName, providedMiddleName=$providedMiddleName, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Verification &&
                        cardVerificationCode == other.cardVerificationCode &&
                        cardholderAddress == other.cardholderAddress &&
                        cardholderName == other.cardholderName &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        cardVerificationCode,
                        cardholderAddress,
                        cardholderName,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Verification{cardVerificationCode=$cardVerificationCode, cardholderAddress=$cardholderAddress, cardholderName=$cardholderName, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CardDecline &&
                    id == other.id &&
                    actioner == other.actioner &&
                    additionalAmounts == other.additionalAmounts &&
                    amount == other.amount &&
                    cardPaymentId == other.cardPaymentId &&
                    currency == other.currency &&
                    declinedTransactionId == other.declinedTransactionId &&
                    digitalWalletTokenId == other.digitalWalletTokenId &&
                    direction == other.direction &&
                    incrementedCardAuthorizationId == other.incrementedCardAuthorizationId &&
                    merchantAcceptorId == other.merchantAcceptorId &&
                    merchantCategoryCode == other.merchantCategoryCode &&
                    merchantCity == other.merchantCity &&
                    merchantCountry == other.merchantCountry &&
                    merchantDescriptor == other.merchantDescriptor &&
                    merchantPostalCode == other.merchantPostalCode &&
                    merchantState == other.merchantState &&
                    networkDetails == other.networkDetails &&
                    networkIdentifiers == other.networkIdentifiers &&
                    networkRiskScore == other.networkRiskScore &&
                    physicalCardId == other.physicalCardId &&
                    presentmentAmount == other.presentmentAmount &&
                    presentmentCurrency == other.presentmentCurrency &&
                    processingCategory == other.processingCategory &&
                    realTimeDecisionId == other.realTimeDecisionId &&
                    realTimeDecisionReason == other.realTimeDecisionReason &&
                    reason == other.reason &&
                    terminalId == other.terminalId &&
                    verification == other.verification &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    id,
                    actioner,
                    additionalAmounts,
                    amount,
                    cardPaymentId,
                    currency,
                    declinedTransactionId,
                    digitalWalletTokenId,
                    direction,
                    incrementedCardAuthorizationId,
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
                    physicalCardId,
                    presentmentAmount,
                    presentmentCurrency,
                    processingCategory,
                    realTimeDecisionId,
                    realTimeDecisionReason,
                    reason,
                    terminalId,
                    verification,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CardDecline{id=$id, actioner=$actioner, additionalAmounts=$additionalAmounts, amount=$amount, cardPaymentId=$cardPaymentId, currency=$currency, declinedTransactionId=$declinedTransactionId, digitalWalletTokenId=$digitalWalletTokenId, direction=$direction, incrementedCardAuthorizationId=$incrementedCardAuthorizationId, merchantAcceptorId=$merchantAcceptorId, merchantCategoryCode=$merchantCategoryCode, merchantCity=$merchantCity, merchantCountry=$merchantCountry, merchantDescriptor=$merchantDescriptor, merchantPostalCode=$merchantPostalCode, merchantState=$merchantState, networkDetails=$networkDetails, networkIdentifiers=$networkIdentifiers, networkRiskScore=$networkRiskScore, physicalCardId=$physicalCardId, presentmentAmount=$presentmentAmount, presentmentCurrency=$presentmentCurrency, processingCategory=$processingCategory, realTimeDecisionId=$realTimeDecisionId, realTimeDecisionReason=$realTimeDecisionReason, reason=$reason, terminalId=$terminalId, verification=$verification, additionalProperties=$additionalProperties}"
        }

        /**
         * A Check Decline object. This field will be present in the JSON response if and only if
         * `category` is equal to `check_decline`.
         */
        class CheckDecline
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val amount: JsonField<Long>,
            private val auxiliaryOnUs: JsonField<String>,
            private val backImageFileId: JsonField<String>,
            private val checkTransferId: JsonField<String>,
            private val frontImageFileId: JsonField<String>,
            private val inboundCheckDepositId: JsonField<String>,
            private val reason: JsonField<Reason>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("auxiliary_on_us")
                @ExcludeMissing
                auxiliaryOnUs: JsonField<String> = JsonMissing.of(),
                @JsonProperty("back_image_file_id")
                @ExcludeMissing
                backImageFileId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("check_transfer_id")
                @ExcludeMissing
                checkTransferId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("front_image_file_id")
                @ExcludeMissing
                frontImageFileId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("inbound_check_deposit_id")
                @ExcludeMissing
                inboundCheckDepositId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("reason") @ExcludeMissing reason: JsonField<Reason> = JsonMissing.of(),
            ) : this(
                amount,
                auxiliaryOnUs,
                backImageFileId,
                checkTransferId,
                frontImageFileId,
                inboundCheckDepositId,
                reason,
                mutableMapOf(),
            )

            /**
             * The declined amount in USD cents.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun amount(): Long = amount.getRequired("amount")

            /**
             * A computer-readable number printed on the MICR line of business checks, usually the
             * check number. This is useful for positive pay checks, but can be unreliably
             * transmitted by the bank of first deposit.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun auxiliaryOnUs(): Optional<String> = auxiliaryOnUs.getOptional("auxiliary_on_us")

            /**
             * The identifier of the API File object containing an image of the back of the declined
             * check.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun backImageFileId(): Optional<String> =
                backImageFileId.getOptional("back_image_file_id")

            /**
             * The identifier of the Check Transfer object associated with this decline.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun checkTransferId(): Optional<String> =
                checkTransferId.getOptional("check_transfer_id")

            /**
             * The identifier of the API File object containing an image of the front of the
             * declined check.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun frontImageFileId(): Optional<String> =
                frontImageFileId.getOptional("front_image_file_id")

            /**
             * The identifier of the Inbound Check Deposit object associated with this decline.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun inboundCheckDepositId(): Optional<String> =
                inboundCheckDepositId.getOptional("inbound_check_deposit_id")

            /**
             * Why the check was declined.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun reason(): Reason = reason.getRequired("reason")

            /**
             * Returns the raw JSON value of [amount].
             *
             * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

            /**
             * Returns the raw JSON value of [auxiliaryOnUs].
             *
             * Unlike [auxiliaryOnUs], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("auxiliary_on_us")
            @ExcludeMissing
            fun _auxiliaryOnUs(): JsonField<String> = auxiliaryOnUs

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
             * Returns the raw JSON value of [checkTransferId].
             *
             * Unlike [checkTransferId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("check_transfer_id")
            @ExcludeMissing
            fun _checkTransferId(): JsonField<String> = checkTransferId

            /**
             * Returns the raw JSON value of [frontImageFileId].
             *
             * Unlike [frontImageFileId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("front_image_file_id")
            @ExcludeMissing
            fun _frontImageFileId(): JsonField<String> = frontImageFileId

            /**
             * Returns the raw JSON value of [inboundCheckDepositId].
             *
             * Unlike [inboundCheckDepositId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("inbound_check_deposit_id")
            @ExcludeMissing
            fun _inboundCheckDepositId(): JsonField<String> = inboundCheckDepositId

            /**
             * Returns the raw JSON value of [reason].
             *
             * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<Reason> = reason

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
                 * Returns a mutable builder for constructing an instance of [CheckDecline].
                 *
                 * The following fields are required:
                 * ```java
                 * .amount()
                 * .auxiliaryOnUs()
                 * .backImageFileId()
                 * .checkTransferId()
                 * .frontImageFileId()
                 * .inboundCheckDepositId()
                 * .reason()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [CheckDecline]. */
            class Builder internal constructor() {

                private var amount: JsonField<Long>? = null
                private var auxiliaryOnUs: JsonField<String>? = null
                private var backImageFileId: JsonField<String>? = null
                private var checkTransferId: JsonField<String>? = null
                private var frontImageFileId: JsonField<String>? = null
                private var inboundCheckDepositId: JsonField<String>? = null
                private var reason: JsonField<Reason>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(checkDecline: CheckDecline) = apply {
                    amount = checkDecline.amount
                    auxiliaryOnUs = checkDecline.auxiliaryOnUs
                    backImageFileId = checkDecline.backImageFileId
                    checkTransferId = checkDecline.checkTransferId
                    frontImageFileId = checkDecline.frontImageFileId
                    inboundCheckDepositId = checkDecline.inboundCheckDepositId
                    reason = checkDecline.reason
                    additionalProperties = checkDecline.additionalProperties.toMutableMap()
                }

                /** The declined amount in USD cents. */
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
                 * A computer-readable number printed on the MICR line of business checks, usually
                 * the check number. This is useful for positive pay checks, but can be unreliably
                 * transmitted by the bank of first deposit.
                 */
                fun auxiliaryOnUs(auxiliaryOnUs: String?) =
                    auxiliaryOnUs(JsonField.ofNullable(auxiliaryOnUs))

                /** Alias for calling [Builder.auxiliaryOnUs] with `auxiliaryOnUs.orElse(null)`. */
                fun auxiliaryOnUs(auxiliaryOnUs: Optional<String>) =
                    auxiliaryOnUs(auxiliaryOnUs.getOrNull())

                /**
                 * Sets [Builder.auxiliaryOnUs] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.auxiliaryOnUs] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun auxiliaryOnUs(auxiliaryOnUs: JsonField<String>) = apply {
                    this.auxiliaryOnUs = auxiliaryOnUs
                }

                /**
                 * The identifier of the API File object containing an image of the back of the
                 * declined check.
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

                /** The identifier of the Check Transfer object associated with this decline. */
                fun checkTransferId(checkTransferId: String?) =
                    checkTransferId(JsonField.ofNullable(checkTransferId))

                /**
                 * Alias for calling [Builder.checkTransferId] with `checkTransferId.orElse(null)`.
                 */
                fun checkTransferId(checkTransferId: Optional<String>) =
                    checkTransferId(checkTransferId.getOrNull())

                /**
                 * Sets [Builder.checkTransferId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.checkTransferId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun checkTransferId(checkTransferId: JsonField<String>) = apply {
                    this.checkTransferId = checkTransferId
                }

                /**
                 * The identifier of the API File object containing an image of the front of the
                 * declined check.
                 */
                fun frontImageFileId(frontImageFileId: String?) =
                    frontImageFileId(JsonField.ofNullable(frontImageFileId))

                /**
                 * Alias for calling [Builder.frontImageFileId] with
                 * `frontImageFileId.orElse(null)`.
                 */
                fun frontImageFileId(frontImageFileId: Optional<String>) =
                    frontImageFileId(frontImageFileId.getOrNull())

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

                /**
                 * The identifier of the Inbound Check Deposit object associated with this decline.
                 */
                fun inboundCheckDepositId(inboundCheckDepositId: String?) =
                    inboundCheckDepositId(JsonField.ofNullable(inboundCheckDepositId))

                /**
                 * Alias for calling [Builder.inboundCheckDepositId] with
                 * `inboundCheckDepositId.orElse(null)`.
                 */
                fun inboundCheckDepositId(inboundCheckDepositId: Optional<String>) =
                    inboundCheckDepositId(inboundCheckDepositId.getOrNull())

                /**
                 * Sets [Builder.inboundCheckDepositId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.inboundCheckDepositId] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun inboundCheckDepositId(inboundCheckDepositId: JsonField<String>) = apply {
                    this.inboundCheckDepositId = inboundCheckDepositId
                }

                /** Why the check was declined. */
                fun reason(reason: Reason) = reason(JsonField.of(reason))

                /**
                 * Sets [Builder.reason] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.reason] with a well-typed [Reason] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun reason(reason: JsonField<Reason>) = apply { this.reason = reason }

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
                 * Returns an immutable instance of [CheckDecline].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .amount()
                 * .auxiliaryOnUs()
                 * .backImageFileId()
                 * .checkTransferId()
                 * .frontImageFileId()
                 * .inboundCheckDepositId()
                 * .reason()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): CheckDecline =
                    CheckDecline(
                        checkRequired("amount", amount),
                        checkRequired("auxiliaryOnUs", auxiliaryOnUs),
                        checkRequired("backImageFileId", backImageFileId),
                        checkRequired("checkTransferId", checkTransferId),
                        checkRequired("frontImageFileId", frontImageFileId),
                        checkRequired("inboundCheckDepositId", inboundCheckDepositId),
                        checkRequired("reason", reason),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): CheckDecline = apply {
                if (validated) {
                    return@apply
                }

                amount()
                auxiliaryOnUs()
                backImageFileId()
                checkTransferId()
                frontImageFileId()
                inboundCheckDepositId()
                reason().validate()
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
                    (if (auxiliaryOnUs.asKnown().isPresent) 1 else 0) +
                    (if (backImageFileId.asKnown().isPresent) 1 else 0) +
                    (if (checkTransferId.asKnown().isPresent) 1 else 0) +
                    (if (frontImageFileId.asKnown().isPresent) 1 else 0) +
                    (if (inboundCheckDepositId.asKnown().isPresent) 1 else 0) +
                    (reason.asKnown().getOrNull()?.validity() ?: 0)

            /** Why the check was declined. */
            class Reason @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    /** The account number is disabled. */
                    @JvmField val ACH_ROUTE_DISABLED = of("ach_route_disabled")

                    /** The account number is canceled. */
                    @JvmField val ACH_ROUTE_CANCELED = of("ach_route_canceled")

                    /** The deposited check was altered or fictitious. */
                    @JvmField val ALTERED_OR_FICTITIOUS = of("altered_or_fictitious")

                    /** The transaction would cause a limit to be exceeded. */
                    @JvmField val BREACHES_LIMIT = of("breaches_limit")

                    /** The check was not endorsed by the payee. */
                    @JvmField val ENDORSEMENT_IRREGULAR = of("endorsement_irregular")

                    /** The account's entity is not active. */
                    @JvmField val ENTITY_NOT_ACTIVE = of("entity_not_active")

                    /** Your account is inactive. */
                    @JvmField val GROUP_LOCKED = of("group_locked")

                    /** Your account contains insufficient funds. */
                    @JvmField val INSUFFICIENT_FUNDS = of("insufficient_funds")

                    /** Stop payment requested for this check. */
                    @JvmField val STOP_PAYMENT_REQUESTED = of("stop_payment_requested")

                    /** The check was a duplicate deposit. */
                    @JvmField val DUPLICATE_PRESENTMENT = of("duplicate_presentment")

                    /** The check was not authorized. */
                    @JvmField val NOT_AUTHORIZED = of("not_authorized")

                    /**
                     * The amount the receiving bank is attempting to deposit does not match the
                     * amount on the check.
                     */
                    @JvmField val AMOUNT_MISMATCH = of("amount_mismatch")

                    /** The check attempting to be deposited does not belong to Increase. */
                    @JvmField val NOT_OUR_ITEM = of("not_our_item")

                    /** The account number on the check does not exist at Increase. */
                    @JvmField val NO_ACCOUNT_NUMBER_FOUND = of("no_account_number_found")

                    /** The check is not readable. Please refer to the image. */
                    @JvmField val REFER_TO_IMAGE = of("refer_to_image")

                    /** The check cannot be processed. This is rare: please contact support. */
                    @JvmField val UNABLE_TO_PROCESS = of("unable_to_process")

                    /** The check image is unusable. */
                    @JvmField val UNUSABLE_IMAGE = of("unusable_image")

                    /** Your integration declined this check via the API. */
                    @JvmField val USER_INITIATED = of("user_initiated")

                    @JvmStatic fun of(value: String) = Reason(JsonField.of(value))
                }

                /** An enum containing [Reason]'s known values. */
                enum class Known {
                    /** The account number is disabled. */
                    ACH_ROUTE_DISABLED,
                    /** The account number is canceled. */
                    ACH_ROUTE_CANCELED,
                    /** The deposited check was altered or fictitious. */
                    ALTERED_OR_FICTITIOUS,
                    /** The transaction would cause a limit to be exceeded. */
                    BREACHES_LIMIT,
                    /** The check was not endorsed by the payee. */
                    ENDORSEMENT_IRREGULAR,
                    /** The account's entity is not active. */
                    ENTITY_NOT_ACTIVE,
                    /** Your account is inactive. */
                    GROUP_LOCKED,
                    /** Your account contains insufficient funds. */
                    INSUFFICIENT_FUNDS,
                    /** Stop payment requested for this check. */
                    STOP_PAYMENT_REQUESTED,
                    /** The check was a duplicate deposit. */
                    DUPLICATE_PRESENTMENT,
                    /** The check was not authorized. */
                    NOT_AUTHORIZED,
                    /**
                     * The amount the receiving bank is attempting to deposit does not match the
                     * amount on the check.
                     */
                    AMOUNT_MISMATCH,
                    /** The check attempting to be deposited does not belong to Increase. */
                    NOT_OUR_ITEM,
                    /** The account number on the check does not exist at Increase. */
                    NO_ACCOUNT_NUMBER_FOUND,
                    /** The check is not readable. Please refer to the image. */
                    REFER_TO_IMAGE,
                    /** The check cannot be processed. This is rare: please contact support. */
                    UNABLE_TO_PROCESS,
                    /** The check image is unusable. */
                    UNUSABLE_IMAGE,
                    /** Your integration declined this check via the API. */
                    USER_INITIATED,
                }

                /**
                 * An enum containing [Reason]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Reason] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    /** The account number is disabled. */
                    ACH_ROUTE_DISABLED,
                    /** The account number is canceled. */
                    ACH_ROUTE_CANCELED,
                    /** The deposited check was altered or fictitious. */
                    ALTERED_OR_FICTITIOUS,
                    /** The transaction would cause a limit to be exceeded. */
                    BREACHES_LIMIT,
                    /** The check was not endorsed by the payee. */
                    ENDORSEMENT_IRREGULAR,
                    /** The account's entity is not active. */
                    ENTITY_NOT_ACTIVE,
                    /** Your account is inactive. */
                    GROUP_LOCKED,
                    /** Your account contains insufficient funds. */
                    INSUFFICIENT_FUNDS,
                    /** Stop payment requested for this check. */
                    STOP_PAYMENT_REQUESTED,
                    /** The check was a duplicate deposit. */
                    DUPLICATE_PRESENTMENT,
                    /** The check was not authorized. */
                    NOT_AUTHORIZED,
                    /**
                     * The amount the receiving bank is attempting to deposit does not match the
                     * amount on the check.
                     */
                    AMOUNT_MISMATCH,
                    /** The check attempting to be deposited does not belong to Increase. */
                    NOT_OUR_ITEM,
                    /** The account number on the check does not exist at Increase. */
                    NO_ACCOUNT_NUMBER_FOUND,
                    /** The check is not readable. Please refer to the image. */
                    REFER_TO_IMAGE,
                    /** The check cannot be processed. This is rare: please contact support. */
                    UNABLE_TO_PROCESS,
                    /** The check image is unusable. */
                    UNUSABLE_IMAGE,
                    /** Your integration declined this check via the API. */
                    USER_INITIATED,
                    /**
                     * An enum member indicating that [Reason] was instantiated with an unknown
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
                        ACH_ROUTE_DISABLED -> Value.ACH_ROUTE_DISABLED
                        ACH_ROUTE_CANCELED -> Value.ACH_ROUTE_CANCELED
                        ALTERED_OR_FICTITIOUS -> Value.ALTERED_OR_FICTITIOUS
                        BREACHES_LIMIT -> Value.BREACHES_LIMIT
                        ENDORSEMENT_IRREGULAR -> Value.ENDORSEMENT_IRREGULAR
                        ENTITY_NOT_ACTIVE -> Value.ENTITY_NOT_ACTIVE
                        GROUP_LOCKED -> Value.GROUP_LOCKED
                        INSUFFICIENT_FUNDS -> Value.INSUFFICIENT_FUNDS
                        STOP_PAYMENT_REQUESTED -> Value.STOP_PAYMENT_REQUESTED
                        DUPLICATE_PRESENTMENT -> Value.DUPLICATE_PRESENTMENT
                        NOT_AUTHORIZED -> Value.NOT_AUTHORIZED
                        AMOUNT_MISMATCH -> Value.AMOUNT_MISMATCH
                        NOT_OUR_ITEM -> Value.NOT_OUR_ITEM
                        NO_ACCOUNT_NUMBER_FOUND -> Value.NO_ACCOUNT_NUMBER_FOUND
                        REFER_TO_IMAGE -> Value.REFER_TO_IMAGE
                        UNABLE_TO_PROCESS -> Value.UNABLE_TO_PROCESS
                        UNUSABLE_IMAGE -> Value.UNUSABLE_IMAGE
                        USER_INITIATED -> Value.USER_INITIATED
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
                        ACH_ROUTE_DISABLED -> Known.ACH_ROUTE_DISABLED
                        ACH_ROUTE_CANCELED -> Known.ACH_ROUTE_CANCELED
                        ALTERED_OR_FICTITIOUS -> Known.ALTERED_OR_FICTITIOUS
                        BREACHES_LIMIT -> Known.BREACHES_LIMIT
                        ENDORSEMENT_IRREGULAR -> Known.ENDORSEMENT_IRREGULAR
                        ENTITY_NOT_ACTIVE -> Known.ENTITY_NOT_ACTIVE
                        GROUP_LOCKED -> Known.GROUP_LOCKED
                        INSUFFICIENT_FUNDS -> Known.INSUFFICIENT_FUNDS
                        STOP_PAYMENT_REQUESTED -> Known.STOP_PAYMENT_REQUESTED
                        DUPLICATE_PRESENTMENT -> Known.DUPLICATE_PRESENTMENT
                        NOT_AUTHORIZED -> Known.NOT_AUTHORIZED
                        AMOUNT_MISMATCH -> Known.AMOUNT_MISMATCH
                        NOT_OUR_ITEM -> Known.NOT_OUR_ITEM
                        NO_ACCOUNT_NUMBER_FOUND -> Known.NO_ACCOUNT_NUMBER_FOUND
                        REFER_TO_IMAGE -> Known.REFER_TO_IMAGE
                        UNABLE_TO_PROCESS -> Known.UNABLE_TO_PROCESS
                        UNUSABLE_IMAGE -> Known.UNUSABLE_IMAGE
                        USER_INITIATED -> Known.USER_INITIATED
                        else -> throw IncreaseInvalidDataException("Unknown Reason: $value")
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

                fun validate(): Reason = apply {
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

                    return other is Reason && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CheckDecline &&
                    amount == other.amount &&
                    auxiliaryOnUs == other.auxiliaryOnUs &&
                    backImageFileId == other.backImageFileId &&
                    checkTransferId == other.checkTransferId &&
                    frontImageFileId == other.frontImageFileId &&
                    inboundCheckDepositId == other.inboundCheckDepositId &&
                    reason == other.reason &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    amount,
                    auxiliaryOnUs,
                    backImageFileId,
                    checkTransferId,
                    frontImageFileId,
                    inboundCheckDepositId,
                    reason,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CheckDecline{amount=$amount, auxiliaryOnUs=$auxiliaryOnUs, backImageFileId=$backImageFileId, checkTransferId=$checkTransferId, frontImageFileId=$frontImageFileId, inboundCheckDepositId=$inboundCheckDepositId, reason=$reason, additionalProperties=$additionalProperties}"
        }

        /**
         * A Check Deposit Rejection object. This field will be present in the JSON response if and
         * only if `category` is equal to `check_deposit_rejection`.
         */
        class CheckDepositRejection
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val amount: JsonField<Long>,
            private val checkDepositId: JsonField<String>,
            private val currency: JsonField<Currency>,
            private val declinedTransactionId: JsonField<String>,
            private val reason: JsonField<Reason>,
            private val rejectedAt: JsonField<OffsetDateTime>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("check_deposit_id")
                @ExcludeMissing
                checkDepositId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("currency")
                @ExcludeMissing
                currency: JsonField<Currency> = JsonMissing.of(),
                @JsonProperty("declined_transaction_id")
                @ExcludeMissing
                declinedTransactionId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("reason")
                @ExcludeMissing
                reason: JsonField<Reason> = JsonMissing.of(),
                @JsonProperty("rejected_at")
                @ExcludeMissing
                rejectedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            ) : this(
                amount,
                checkDepositId,
                currency,
                declinedTransactionId,
                reason,
                rejectedAt,
                mutableMapOf(),
            )

            /**
             * The rejected amount in the minor unit of check's currency. For dollars, for example,
             * this is cents.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun amount(): Long = amount.getRequired("amount")

            /**
             * The identifier of the Check Deposit that was rejected.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun checkDepositId(): String = checkDepositId.getRequired("check_deposit_id")

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the check's currency.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun currency(): Currency = currency.getRequired("currency")

            /**
             * The identifier of the associated declined transaction.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun declinedTransactionId(): String =
                declinedTransactionId.getRequired("declined_transaction_id")

            /**
             * Why the check deposit was rejected.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun reason(): Reason = reason.getRequired("reason")

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * check deposit was rejected.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun rejectedAt(): OffsetDateTime = rejectedAt.getRequired("rejected_at")

            /**
             * Returns the raw JSON value of [amount].
             *
             * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

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
             * Returns the raw JSON value of [declinedTransactionId].
             *
             * Unlike [declinedTransactionId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("declined_transaction_id")
            @ExcludeMissing
            fun _declinedTransactionId(): JsonField<String> = declinedTransactionId

            /**
             * Returns the raw JSON value of [reason].
             *
             * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<Reason> = reason

            /**
             * Returns the raw JSON value of [rejectedAt].
             *
             * Unlike [rejectedAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("rejected_at")
            @ExcludeMissing
            fun _rejectedAt(): JsonField<OffsetDateTime> = rejectedAt

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
                 * [CheckDepositRejection].
                 *
                 * The following fields are required:
                 * ```java
                 * .amount()
                 * .checkDepositId()
                 * .currency()
                 * .declinedTransactionId()
                 * .reason()
                 * .rejectedAt()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [CheckDepositRejection]. */
            class Builder internal constructor() {

                private var amount: JsonField<Long>? = null
                private var checkDepositId: JsonField<String>? = null
                private var currency: JsonField<Currency>? = null
                private var declinedTransactionId: JsonField<String>? = null
                private var reason: JsonField<Reason>? = null
                private var rejectedAt: JsonField<OffsetDateTime>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(checkDepositRejection: CheckDepositRejection) = apply {
                    amount = checkDepositRejection.amount
                    checkDepositId = checkDepositRejection.checkDepositId
                    currency = checkDepositRejection.currency
                    declinedTransactionId = checkDepositRejection.declinedTransactionId
                    reason = checkDepositRejection.reason
                    rejectedAt = checkDepositRejection.rejectedAt
                    additionalProperties = checkDepositRejection.additionalProperties.toMutableMap()
                }

                /**
                 * The rejected amount in the minor unit of check's currency. For dollars, for
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

                /** The identifier of the Check Deposit that was rejected. */
                fun checkDepositId(checkDepositId: String) =
                    checkDepositId(JsonField.of(checkDepositId))

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

                /** The identifier of the associated declined transaction. */
                fun declinedTransactionId(declinedTransactionId: String) =
                    declinedTransactionId(JsonField.of(declinedTransactionId))

                /**
                 * Sets [Builder.declinedTransactionId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.declinedTransactionId] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun declinedTransactionId(declinedTransactionId: JsonField<String>) = apply {
                    this.declinedTransactionId = declinedTransactionId
                }

                /** Why the check deposit was rejected. */
                fun reason(reason: Reason) = reason(JsonField.of(reason))

                /**
                 * Sets [Builder.reason] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.reason] with a well-typed [Reason] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun reason(reason: JsonField<Reason>) = apply { this.reason = reason }

                /**
                 * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
                 * check deposit was rejected.
                 */
                fun rejectedAt(rejectedAt: OffsetDateTime) = rejectedAt(JsonField.of(rejectedAt))

                /**
                 * Sets [Builder.rejectedAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.rejectedAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun rejectedAt(rejectedAt: JsonField<OffsetDateTime>) = apply {
                    this.rejectedAt = rejectedAt
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
                 * Returns an immutable instance of [CheckDepositRejection].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .amount()
                 * .checkDepositId()
                 * .currency()
                 * .declinedTransactionId()
                 * .reason()
                 * .rejectedAt()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): CheckDepositRejection =
                    CheckDepositRejection(
                        checkRequired("amount", amount),
                        checkRequired("checkDepositId", checkDepositId),
                        checkRequired("currency", currency),
                        checkRequired("declinedTransactionId", declinedTransactionId),
                        checkRequired("reason", reason),
                        checkRequired("rejectedAt", rejectedAt),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): CheckDepositRejection = apply {
                if (validated) {
                    return@apply
                }

                amount()
                checkDepositId()
                currency().validate()
                declinedTransactionId()
                reason().validate()
                rejectedAt()
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
                    (if (checkDepositId.asKnown().isPresent) 1 else 0) +
                    (currency.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (declinedTransactionId.asKnown().isPresent) 1 else 0) +
                    (reason.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (rejectedAt.asKnown().isPresent) 1 else 0)

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

                    /** US Dollar (USD) */
                    @JvmField val USD = of("USD")

                    @JvmStatic fun of(value: String) = Currency(JsonField.of(value))
                }

                /** An enum containing [Currency]'s known values. */
                enum class Known {
                    /** US Dollar (USD) */
                    USD
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

                    return other is Currency && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** Why the check deposit was rejected. */
            class Reason @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    /** The check's image is incomplete. */
                    @JvmField val INCOMPLETE_IMAGE = of("incomplete_image")

                    /** This is a duplicate check submission. */
                    @JvmField val DUPLICATE = of("duplicate")

                    /** This check has poor image quality. */
                    @JvmField val POOR_IMAGE_QUALITY = of("poor_image_quality")

                    /** The check was deposited with the incorrect amount. */
                    @JvmField val INCORRECT_AMOUNT = of("incorrect_amount")

                    /** The check is made out to someone other than the account holder. */
                    @JvmField val INCORRECT_RECIPIENT = of("incorrect_recipient")

                    /** This check was not eligible for mobile deposit. */
                    @JvmField
                    val NOT_ELIGIBLE_FOR_MOBILE_DEPOSIT = of("not_eligible_for_mobile_deposit")

                    /** This check is missing at least one required field. */
                    @JvmField
                    val MISSING_REQUIRED_DATA_ELEMENTS = of("missing_required_data_elements")

                    /** This check is suspected to be fraudulent. */
                    @JvmField val SUSPECTED_FRAUD = of("suspected_fraud")

                    /** This check's deposit window has expired. */
                    @JvmField val DEPOSIT_WINDOW_EXPIRED = of("deposit_window_expired")

                    /** The check was rejected at the user's request. */
                    @JvmField val REQUESTED_BY_USER = of("requested_by_user")

                    /** The check was rejected for an unknown reason. */
                    @JvmField val UNKNOWN = of("unknown")

                    @JvmStatic fun of(value: String) = Reason(JsonField.of(value))
                }

                /** An enum containing [Reason]'s known values. */
                enum class Known {
                    /** The check's image is incomplete. */
                    INCOMPLETE_IMAGE,
                    /** This is a duplicate check submission. */
                    DUPLICATE,
                    /** This check has poor image quality. */
                    POOR_IMAGE_QUALITY,
                    /** The check was deposited with the incorrect amount. */
                    INCORRECT_AMOUNT,
                    /** The check is made out to someone other than the account holder. */
                    INCORRECT_RECIPIENT,
                    /** This check was not eligible for mobile deposit. */
                    NOT_ELIGIBLE_FOR_MOBILE_DEPOSIT,
                    /** This check is missing at least one required field. */
                    MISSING_REQUIRED_DATA_ELEMENTS,
                    /** This check is suspected to be fraudulent. */
                    SUSPECTED_FRAUD,
                    /** This check's deposit window has expired. */
                    DEPOSIT_WINDOW_EXPIRED,
                    /** The check was rejected at the user's request. */
                    REQUESTED_BY_USER,
                    /** The check was rejected for an unknown reason. */
                    UNKNOWN,
                }

                /**
                 * An enum containing [Reason]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Reason] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    /** The check's image is incomplete. */
                    INCOMPLETE_IMAGE,
                    /** This is a duplicate check submission. */
                    DUPLICATE,
                    /** This check has poor image quality. */
                    POOR_IMAGE_QUALITY,
                    /** The check was deposited with the incorrect amount. */
                    INCORRECT_AMOUNT,
                    /** The check is made out to someone other than the account holder. */
                    INCORRECT_RECIPIENT,
                    /** This check was not eligible for mobile deposit. */
                    NOT_ELIGIBLE_FOR_MOBILE_DEPOSIT,
                    /** This check is missing at least one required field. */
                    MISSING_REQUIRED_DATA_ELEMENTS,
                    /** This check is suspected to be fraudulent. */
                    SUSPECTED_FRAUD,
                    /** This check's deposit window has expired. */
                    DEPOSIT_WINDOW_EXPIRED,
                    /** The check was rejected at the user's request. */
                    REQUESTED_BY_USER,
                    /** The check was rejected for an unknown reason. */
                    UNKNOWN,
                    /**
                     * An enum member indicating that [Reason] was instantiated with an unknown
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
                        INCOMPLETE_IMAGE -> Value.INCOMPLETE_IMAGE
                        DUPLICATE -> Value.DUPLICATE
                        POOR_IMAGE_QUALITY -> Value.POOR_IMAGE_QUALITY
                        INCORRECT_AMOUNT -> Value.INCORRECT_AMOUNT
                        INCORRECT_RECIPIENT -> Value.INCORRECT_RECIPIENT
                        NOT_ELIGIBLE_FOR_MOBILE_DEPOSIT -> Value.NOT_ELIGIBLE_FOR_MOBILE_DEPOSIT
                        MISSING_REQUIRED_DATA_ELEMENTS -> Value.MISSING_REQUIRED_DATA_ELEMENTS
                        SUSPECTED_FRAUD -> Value.SUSPECTED_FRAUD
                        DEPOSIT_WINDOW_EXPIRED -> Value.DEPOSIT_WINDOW_EXPIRED
                        REQUESTED_BY_USER -> Value.REQUESTED_BY_USER
                        UNKNOWN -> Value.UNKNOWN
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
                        INCOMPLETE_IMAGE -> Known.INCOMPLETE_IMAGE
                        DUPLICATE -> Known.DUPLICATE
                        POOR_IMAGE_QUALITY -> Known.POOR_IMAGE_QUALITY
                        INCORRECT_AMOUNT -> Known.INCORRECT_AMOUNT
                        INCORRECT_RECIPIENT -> Known.INCORRECT_RECIPIENT
                        NOT_ELIGIBLE_FOR_MOBILE_DEPOSIT -> Known.NOT_ELIGIBLE_FOR_MOBILE_DEPOSIT
                        MISSING_REQUIRED_DATA_ELEMENTS -> Known.MISSING_REQUIRED_DATA_ELEMENTS
                        SUSPECTED_FRAUD -> Known.SUSPECTED_FRAUD
                        DEPOSIT_WINDOW_EXPIRED -> Known.DEPOSIT_WINDOW_EXPIRED
                        REQUESTED_BY_USER -> Known.REQUESTED_BY_USER
                        UNKNOWN -> Known.UNKNOWN
                        else -> throw IncreaseInvalidDataException("Unknown Reason: $value")
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

                fun validate(): Reason = apply {
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

                    return other is Reason && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CheckDepositRejection &&
                    amount == other.amount &&
                    checkDepositId == other.checkDepositId &&
                    currency == other.currency &&
                    declinedTransactionId == other.declinedTransactionId &&
                    reason == other.reason &&
                    rejectedAt == other.rejectedAt &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    amount,
                    checkDepositId,
                    currency,
                    declinedTransactionId,
                    reason,
                    rejectedAt,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CheckDepositRejection{amount=$amount, checkDepositId=$checkDepositId, currency=$currency, declinedTransactionId=$declinedTransactionId, reason=$reason, rejectedAt=$rejectedAt, additionalProperties=$additionalProperties}"
        }

        /**
         * An Inbound FedNow Transfer Decline object. This field will be present in the JSON
         * response if and only if `category` is equal to `inbound_fednow_transfer_decline`.
         */
        class InboundFednowTransferDecline
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val reason: JsonField<Reason>,
            private val transferId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("reason")
                @ExcludeMissing
                reason: JsonField<Reason> = JsonMissing.of(),
                @JsonProperty("transfer_id")
                @ExcludeMissing
                transferId: JsonField<String> = JsonMissing.of(),
            ) : this(reason, transferId, mutableMapOf())

            /**
             * Why the transfer was declined.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun reason(): Reason = reason.getRequired("reason")

            /**
             * The identifier of the FedNow Transfer that led to this declined transaction.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun transferId(): String = transferId.getRequired("transfer_id")

            /**
             * Returns the raw JSON value of [reason].
             *
             * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<Reason> = reason

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
                 * [InboundFednowTransferDecline].
                 *
                 * The following fields are required:
                 * ```java
                 * .reason()
                 * .transferId()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [InboundFednowTransferDecline]. */
            class Builder internal constructor() {

                private var reason: JsonField<Reason>? = null
                private var transferId: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(inboundFednowTransferDecline: InboundFednowTransferDecline) =
                    apply {
                        reason = inboundFednowTransferDecline.reason
                        transferId = inboundFednowTransferDecline.transferId
                        additionalProperties =
                            inboundFednowTransferDecline.additionalProperties.toMutableMap()
                    }

                /** Why the transfer was declined. */
                fun reason(reason: Reason) = reason(JsonField.of(reason))

                /**
                 * Sets [Builder.reason] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.reason] with a well-typed [Reason] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun reason(reason: JsonField<Reason>) = apply { this.reason = reason }

                /** The identifier of the FedNow Transfer that led to this declined transaction. */
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
                 * Returns an immutable instance of [InboundFednowTransferDecline].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .reason()
                 * .transferId()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): InboundFednowTransferDecline =
                    InboundFednowTransferDecline(
                        checkRequired("reason", reason),
                        checkRequired("transferId", transferId),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): InboundFednowTransferDecline = apply {
                if (validated) {
                    return@apply
                }

                reason().validate()
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
                (reason.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (transferId.asKnown().isPresent) 1 else 0)

            /** Why the transfer was declined. */
            class Reason @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    /** The account number is canceled. */
                    @JvmField val ACCOUNT_NUMBER_CANCELED = of("account_number_canceled")

                    /** The account number is disabled. */
                    @JvmField val ACCOUNT_NUMBER_DISABLED = of("account_number_disabled")

                    /** Your account is restricted. */
                    @JvmField val ACCOUNT_RESTRICTED = of("account_restricted")

                    /** Your account is inactive. */
                    @JvmField val GROUP_LOCKED = of("group_locked")

                    /** The account's entity is not active. */
                    @JvmField val ENTITY_NOT_ACTIVE = of("entity_not_active")

                    /** Your account is not enabled to receive FedNow transfers. */
                    @JvmField val FEDNOW_NOT_ENABLED = of("fednow_not_enabled")

                    @JvmStatic fun of(value: String) = Reason(JsonField.of(value))
                }

                /** An enum containing [Reason]'s known values. */
                enum class Known {
                    /** The account number is canceled. */
                    ACCOUNT_NUMBER_CANCELED,
                    /** The account number is disabled. */
                    ACCOUNT_NUMBER_DISABLED,
                    /** Your account is restricted. */
                    ACCOUNT_RESTRICTED,
                    /** Your account is inactive. */
                    GROUP_LOCKED,
                    /** The account's entity is not active. */
                    ENTITY_NOT_ACTIVE,
                    /** Your account is not enabled to receive FedNow transfers. */
                    FEDNOW_NOT_ENABLED,
                }

                /**
                 * An enum containing [Reason]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Reason] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    /** The account number is canceled. */
                    ACCOUNT_NUMBER_CANCELED,
                    /** The account number is disabled. */
                    ACCOUNT_NUMBER_DISABLED,
                    /** Your account is restricted. */
                    ACCOUNT_RESTRICTED,
                    /** Your account is inactive. */
                    GROUP_LOCKED,
                    /** The account's entity is not active. */
                    ENTITY_NOT_ACTIVE,
                    /** Your account is not enabled to receive FedNow transfers. */
                    FEDNOW_NOT_ENABLED,
                    /**
                     * An enum member indicating that [Reason] was instantiated with an unknown
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
                        ACCOUNT_NUMBER_CANCELED -> Value.ACCOUNT_NUMBER_CANCELED
                        ACCOUNT_NUMBER_DISABLED -> Value.ACCOUNT_NUMBER_DISABLED
                        ACCOUNT_RESTRICTED -> Value.ACCOUNT_RESTRICTED
                        GROUP_LOCKED -> Value.GROUP_LOCKED
                        ENTITY_NOT_ACTIVE -> Value.ENTITY_NOT_ACTIVE
                        FEDNOW_NOT_ENABLED -> Value.FEDNOW_NOT_ENABLED
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
                        ACCOUNT_NUMBER_CANCELED -> Known.ACCOUNT_NUMBER_CANCELED
                        ACCOUNT_NUMBER_DISABLED -> Known.ACCOUNT_NUMBER_DISABLED
                        ACCOUNT_RESTRICTED -> Known.ACCOUNT_RESTRICTED
                        GROUP_LOCKED -> Known.GROUP_LOCKED
                        ENTITY_NOT_ACTIVE -> Known.ENTITY_NOT_ACTIVE
                        FEDNOW_NOT_ENABLED -> Known.FEDNOW_NOT_ENABLED
                        else -> throw IncreaseInvalidDataException("Unknown Reason: $value")
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

                fun validate(): Reason = apply {
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

                    return other is Reason && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is InboundFednowTransferDecline &&
                    reason == other.reason &&
                    transferId == other.transferId &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(reason, transferId, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "InboundFednowTransferDecline{reason=$reason, transferId=$transferId, additionalProperties=$additionalProperties}"
        }

        /**
         * An Inbound Real-Time Payments Transfer Decline object. This field will be present in the
         * JSON response if and only if `category` is equal to
         * `inbound_real_time_payments_transfer_decline`.
         */
        class InboundRealTimePaymentsTransferDecline
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val amount: JsonField<Long>,
            private val creditorName: JsonField<String>,
            private val currency: JsonField<Currency>,
            private val debtorAccountNumber: JsonField<String>,
            private val debtorName: JsonField<String>,
            private val debtorRoutingNumber: JsonField<String>,
            private val reason: JsonField<Reason>,
            private val remittanceInformation: JsonField<String>,
            private val transactionIdentification: JsonField<String>,
            private val transferId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("creditor_name")
                @ExcludeMissing
                creditorName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("currency")
                @ExcludeMissing
                currency: JsonField<Currency> = JsonMissing.of(),
                @JsonProperty("debtor_account_number")
                @ExcludeMissing
                debtorAccountNumber: JsonField<String> = JsonMissing.of(),
                @JsonProperty("debtor_name")
                @ExcludeMissing
                debtorName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("debtor_routing_number")
                @ExcludeMissing
                debtorRoutingNumber: JsonField<String> = JsonMissing.of(),
                @JsonProperty("reason")
                @ExcludeMissing
                reason: JsonField<Reason> = JsonMissing.of(),
                @JsonProperty("remittance_information")
                @ExcludeMissing
                remittanceInformation: JsonField<String> = JsonMissing.of(),
                @JsonProperty("transaction_identification")
                @ExcludeMissing
                transactionIdentification: JsonField<String> = JsonMissing.of(),
                @JsonProperty("transfer_id")
                @ExcludeMissing
                transferId: JsonField<String> = JsonMissing.of(),
            ) : this(
                amount,
                creditorName,
                currency,
                debtorAccountNumber,
                debtorName,
                debtorRoutingNumber,
                reason,
                remittanceInformation,
                transactionIdentification,
                transferId,
                mutableMapOf(),
            )

            /**
             * The declined amount in the minor unit of the destination account currency. For
             * dollars, for example, this is cents.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun amount(): Long = amount.getRequired("amount")

            /**
             * The name the sender of the transfer specified as the recipient of the transfer.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun creditorName(): String = creditorName.getRequired("creditor_name")

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code of the declined
             * transfer's currency. This will always be "USD" for a Real-Time Payments transfer.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun currency(): Currency = currency.getRequired("currency")

            /**
             * The account number of the account that sent the transfer.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun debtorAccountNumber(): String =
                debtorAccountNumber.getRequired("debtor_account_number")

            /**
             * The name provided by the sender of the transfer.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun debtorName(): String = debtorName.getRequired("debtor_name")

            /**
             * The routing number of the account that sent the transfer.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun debtorRoutingNumber(): String =
                debtorRoutingNumber.getRequired("debtor_routing_number")

            /**
             * Why the transfer was declined.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun reason(): Reason = reason.getRequired("reason")

            /**
             * Additional information included with the transfer.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun remittanceInformation(): Optional<String> =
                remittanceInformation.getOptional("remittance_information")

            /**
             * The Real-Time Payments network identification of the declined transfer.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun transactionIdentification(): String =
                transactionIdentification.getRequired("transaction_identification")

            /**
             * The identifier of the Real-Time Payments Transfer that led to this Transaction.
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
             * Returns the raw JSON value of [creditorName].
             *
             * Unlike [creditorName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("creditor_name")
            @ExcludeMissing
            fun _creditorName(): JsonField<String> = creditorName

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
             * Returns the raw JSON value of [debtorAccountNumber].
             *
             * Unlike [debtorAccountNumber], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("debtor_account_number")
            @ExcludeMissing
            fun _debtorAccountNumber(): JsonField<String> = debtorAccountNumber

            /**
             * Returns the raw JSON value of [debtorName].
             *
             * Unlike [debtorName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("debtor_name")
            @ExcludeMissing
            fun _debtorName(): JsonField<String> = debtorName

            /**
             * Returns the raw JSON value of [debtorRoutingNumber].
             *
             * Unlike [debtorRoutingNumber], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("debtor_routing_number")
            @ExcludeMissing
            fun _debtorRoutingNumber(): JsonField<String> = debtorRoutingNumber

            /**
             * Returns the raw JSON value of [reason].
             *
             * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<Reason> = reason

            /**
             * Returns the raw JSON value of [remittanceInformation].
             *
             * Unlike [remittanceInformation], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("remittance_information")
            @ExcludeMissing
            fun _remittanceInformation(): JsonField<String> = remittanceInformation

            /**
             * Returns the raw JSON value of [transactionIdentification].
             *
             * Unlike [transactionIdentification], this method doesn't throw if the JSON field has
             * an unexpected type.
             */
            @JsonProperty("transaction_identification")
            @ExcludeMissing
            fun _transactionIdentification(): JsonField<String> = transactionIdentification

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
                 * [InboundRealTimePaymentsTransferDecline].
                 *
                 * The following fields are required:
                 * ```java
                 * .amount()
                 * .creditorName()
                 * .currency()
                 * .debtorAccountNumber()
                 * .debtorName()
                 * .debtorRoutingNumber()
                 * .reason()
                 * .remittanceInformation()
                 * .transactionIdentification()
                 * .transferId()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [InboundRealTimePaymentsTransferDecline]. */
            class Builder internal constructor() {

                private var amount: JsonField<Long>? = null
                private var creditorName: JsonField<String>? = null
                private var currency: JsonField<Currency>? = null
                private var debtorAccountNumber: JsonField<String>? = null
                private var debtorName: JsonField<String>? = null
                private var debtorRoutingNumber: JsonField<String>? = null
                private var reason: JsonField<Reason>? = null
                private var remittanceInformation: JsonField<String>? = null
                private var transactionIdentification: JsonField<String>? = null
                private var transferId: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    inboundRealTimePaymentsTransferDecline: InboundRealTimePaymentsTransferDecline
                ) = apply {
                    amount = inboundRealTimePaymentsTransferDecline.amount
                    creditorName = inboundRealTimePaymentsTransferDecline.creditorName
                    currency = inboundRealTimePaymentsTransferDecline.currency
                    debtorAccountNumber = inboundRealTimePaymentsTransferDecline.debtorAccountNumber
                    debtorName = inboundRealTimePaymentsTransferDecline.debtorName
                    debtorRoutingNumber = inboundRealTimePaymentsTransferDecline.debtorRoutingNumber
                    reason = inboundRealTimePaymentsTransferDecline.reason
                    remittanceInformation =
                        inboundRealTimePaymentsTransferDecline.remittanceInformation
                    transactionIdentification =
                        inboundRealTimePaymentsTransferDecline.transactionIdentification
                    transferId = inboundRealTimePaymentsTransferDecline.transferId
                    additionalProperties =
                        inboundRealTimePaymentsTransferDecline.additionalProperties.toMutableMap()
                }

                /**
                 * The declined amount in the minor unit of the destination account currency. For
                 * dollars, for example, this is cents.
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
                 * The name the sender of the transfer specified as the recipient of the transfer.
                 */
                fun creditorName(creditorName: String) = creditorName(JsonField.of(creditorName))

                /**
                 * Sets [Builder.creditorName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.creditorName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun creditorName(creditorName: JsonField<String>) = apply {
                    this.creditorName = creditorName
                }

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code of the declined
                 * transfer's currency. This will always be "USD" for a Real-Time Payments transfer.
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

                /** The account number of the account that sent the transfer. */
                fun debtorAccountNumber(debtorAccountNumber: String) =
                    debtorAccountNumber(JsonField.of(debtorAccountNumber))

                /**
                 * Sets [Builder.debtorAccountNumber] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.debtorAccountNumber] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun debtorAccountNumber(debtorAccountNumber: JsonField<String>) = apply {
                    this.debtorAccountNumber = debtorAccountNumber
                }

                /** The name provided by the sender of the transfer. */
                fun debtorName(debtorName: String) = debtorName(JsonField.of(debtorName))

                /**
                 * Sets [Builder.debtorName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.debtorName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun debtorName(debtorName: JsonField<String>) = apply {
                    this.debtorName = debtorName
                }

                /** The routing number of the account that sent the transfer. */
                fun debtorRoutingNumber(debtorRoutingNumber: String) =
                    debtorRoutingNumber(JsonField.of(debtorRoutingNumber))

                /**
                 * Sets [Builder.debtorRoutingNumber] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.debtorRoutingNumber] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun debtorRoutingNumber(debtorRoutingNumber: JsonField<String>) = apply {
                    this.debtorRoutingNumber = debtorRoutingNumber
                }

                /** Why the transfer was declined. */
                fun reason(reason: Reason) = reason(JsonField.of(reason))

                /**
                 * Sets [Builder.reason] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.reason] with a well-typed [Reason] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun reason(reason: JsonField<Reason>) = apply { this.reason = reason }

                /** Additional information included with the transfer. */
                fun remittanceInformation(remittanceInformation: String?) =
                    remittanceInformation(JsonField.ofNullable(remittanceInformation))

                /**
                 * Alias for calling [Builder.remittanceInformation] with
                 * `remittanceInformation.orElse(null)`.
                 */
                fun remittanceInformation(remittanceInformation: Optional<String>) =
                    remittanceInformation(remittanceInformation.getOrNull())

                /**
                 * Sets [Builder.remittanceInformation] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.remittanceInformation] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun remittanceInformation(remittanceInformation: JsonField<String>) = apply {
                    this.remittanceInformation = remittanceInformation
                }

                /** The Real-Time Payments network identification of the declined transfer. */
                fun transactionIdentification(transactionIdentification: String) =
                    transactionIdentification(JsonField.of(transactionIdentification))

                /**
                 * Sets [Builder.transactionIdentification] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.transactionIdentification] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun transactionIdentification(transactionIdentification: JsonField<String>) =
                    apply {
                        this.transactionIdentification = transactionIdentification
                    }

                /**
                 * The identifier of the Real-Time Payments Transfer that led to this Transaction.
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
                 * Returns an immutable instance of [InboundRealTimePaymentsTransferDecline].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .amount()
                 * .creditorName()
                 * .currency()
                 * .debtorAccountNumber()
                 * .debtorName()
                 * .debtorRoutingNumber()
                 * .reason()
                 * .remittanceInformation()
                 * .transactionIdentification()
                 * .transferId()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): InboundRealTimePaymentsTransferDecline =
                    InboundRealTimePaymentsTransferDecline(
                        checkRequired("amount", amount),
                        checkRequired("creditorName", creditorName),
                        checkRequired("currency", currency),
                        checkRequired("debtorAccountNumber", debtorAccountNumber),
                        checkRequired("debtorName", debtorName),
                        checkRequired("debtorRoutingNumber", debtorRoutingNumber),
                        checkRequired("reason", reason),
                        checkRequired("remittanceInformation", remittanceInformation),
                        checkRequired("transactionIdentification", transactionIdentification),
                        checkRequired("transferId", transferId),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): InboundRealTimePaymentsTransferDecline = apply {
                if (validated) {
                    return@apply
                }

                amount()
                creditorName()
                currency().validate()
                debtorAccountNumber()
                debtorName()
                debtorRoutingNumber()
                reason().validate()
                remittanceInformation()
                transactionIdentification()
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
                    (if (creditorName.asKnown().isPresent) 1 else 0) +
                    (currency.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (debtorAccountNumber.asKnown().isPresent) 1 else 0) +
                    (if (debtorName.asKnown().isPresent) 1 else 0) +
                    (if (debtorRoutingNumber.asKnown().isPresent) 1 else 0) +
                    (reason.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (remittanceInformation.asKnown().isPresent) 1 else 0) +
                    (if (transactionIdentification.asKnown().isPresent) 1 else 0) +
                    (if (transferId.asKnown().isPresent) 1 else 0)

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code of the declined
             * transfer's currency. This will always be "USD" for a Real-Time Payments transfer.
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

                    /** US Dollar (USD) */
                    @JvmField val USD = of("USD")

                    @JvmStatic fun of(value: String) = Currency(JsonField.of(value))
                }

                /** An enum containing [Currency]'s known values. */
                enum class Known {
                    /** US Dollar (USD) */
                    USD
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

                    return other is Currency && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** Why the transfer was declined. */
            class Reason @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    /** The account number is canceled. */
                    @JvmField val ACCOUNT_NUMBER_CANCELED = of("account_number_canceled")

                    /** The account number is disabled. */
                    @JvmField val ACCOUNT_NUMBER_DISABLED = of("account_number_disabled")

                    /** Your account is restricted. */
                    @JvmField val ACCOUNT_RESTRICTED = of("account_restricted")

                    /** Your account is inactive. */
                    @JvmField val GROUP_LOCKED = of("group_locked")

                    /** The account's entity is not active. */
                    @JvmField val ENTITY_NOT_ACTIVE = of("entity_not_active")

                    /** Your account is not enabled to receive Real-Time Payments transfers. */
                    @JvmField
                    val REAL_TIME_PAYMENTS_NOT_ENABLED = of("real_time_payments_not_enabled")

                    @JvmStatic fun of(value: String) = Reason(JsonField.of(value))
                }

                /** An enum containing [Reason]'s known values. */
                enum class Known {
                    /** The account number is canceled. */
                    ACCOUNT_NUMBER_CANCELED,
                    /** The account number is disabled. */
                    ACCOUNT_NUMBER_DISABLED,
                    /** Your account is restricted. */
                    ACCOUNT_RESTRICTED,
                    /** Your account is inactive. */
                    GROUP_LOCKED,
                    /** The account's entity is not active. */
                    ENTITY_NOT_ACTIVE,
                    /** Your account is not enabled to receive Real-Time Payments transfers. */
                    REAL_TIME_PAYMENTS_NOT_ENABLED,
                }

                /**
                 * An enum containing [Reason]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Reason] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    /** The account number is canceled. */
                    ACCOUNT_NUMBER_CANCELED,
                    /** The account number is disabled. */
                    ACCOUNT_NUMBER_DISABLED,
                    /** Your account is restricted. */
                    ACCOUNT_RESTRICTED,
                    /** Your account is inactive. */
                    GROUP_LOCKED,
                    /** The account's entity is not active. */
                    ENTITY_NOT_ACTIVE,
                    /** Your account is not enabled to receive Real-Time Payments transfers. */
                    REAL_TIME_PAYMENTS_NOT_ENABLED,
                    /**
                     * An enum member indicating that [Reason] was instantiated with an unknown
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
                        ACCOUNT_NUMBER_CANCELED -> Value.ACCOUNT_NUMBER_CANCELED
                        ACCOUNT_NUMBER_DISABLED -> Value.ACCOUNT_NUMBER_DISABLED
                        ACCOUNT_RESTRICTED -> Value.ACCOUNT_RESTRICTED
                        GROUP_LOCKED -> Value.GROUP_LOCKED
                        ENTITY_NOT_ACTIVE -> Value.ENTITY_NOT_ACTIVE
                        REAL_TIME_PAYMENTS_NOT_ENABLED -> Value.REAL_TIME_PAYMENTS_NOT_ENABLED
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
                        ACCOUNT_NUMBER_CANCELED -> Known.ACCOUNT_NUMBER_CANCELED
                        ACCOUNT_NUMBER_DISABLED -> Known.ACCOUNT_NUMBER_DISABLED
                        ACCOUNT_RESTRICTED -> Known.ACCOUNT_RESTRICTED
                        GROUP_LOCKED -> Known.GROUP_LOCKED
                        ENTITY_NOT_ACTIVE -> Known.ENTITY_NOT_ACTIVE
                        REAL_TIME_PAYMENTS_NOT_ENABLED -> Known.REAL_TIME_PAYMENTS_NOT_ENABLED
                        else -> throw IncreaseInvalidDataException("Unknown Reason: $value")
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

                fun validate(): Reason = apply {
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

                    return other is Reason && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is InboundRealTimePaymentsTransferDecline &&
                    amount == other.amount &&
                    creditorName == other.creditorName &&
                    currency == other.currency &&
                    debtorAccountNumber == other.debtorAccountNumber &&
                    debtorName == other.debtorName &&
                    debtorRoutingNumber == other.debtorRoutingNumber &&
                    reason == other.reason &&
                    remittanceInformation == other.remittanceInformation &&
                    transactionIdentification == other.transactionIdentification &&
                    transferId == other.transferId &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    amount,
                    creditorName,
                    currency,
                    debtorAccountNumber,
                    debtorName,
                    debtorRoutingNumber,
                    reason,
                    remittanceInformation,
                    transactionIdentification,
                    transferId,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "InboundRealTimePaymentsTransferDecline{amount=$amount, creditorName=$creditorName, currency=$currency, debtorAccountNumber=$debtorAccountNumber, debtorName=$debtorName, debtorRoutingNumber=$debtorRoutingNumber, reason=$reason, remittanceInformation=$remittanceInformation, transactionIdentification=$transactionIdentification, transferId=$transferId, additionalProperties=$additionalProperties}"
        }

        /**
         * If the category of this Transaction source is equal to `other`, this field will contain
         * an empty object, otherwise it will contain null.
         */
        class Other
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

                /** Returns a mutable builder for constructing an instance of [Other]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Other]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(other: Other) = apply {
                    additionalProperties = other.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [Other].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Other = Other(additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Other = apply {
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

                return other is Other && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "Other{additionalProperties=$additionalProperties}"
        }

        /**
         * A Wire Decline object. This field will be present in the JSON response if and only if
         * `category` is equal to `wire_decline`.
         */
        class WireDecline
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val inboundWireTransferId: JsonField<String>,
            private val reason: JsonField<Reason>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("inbound_wire_transfer_id")
                @ExcludeMissing
                inboundWireTransferId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("reason") @ExcludeMissing reason: JsonField<Reason> = JsonMissing.of(),
            ) : this(inboundWireTransferId, reason, mutableMapOf())

            /**
             * The identifier of the Inbound Wire Transfer that was declined.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun inboundWireTransferId(): String =
                inboundWireTransferId.getRequired("inbound_wire_transfer_id")

            /**
             * Why the wire transfer was declined.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun reason(): Reason = reason.getRequired("reason")

            /**
             * Returns the raw JSON value of [inboundWireTransferId].
             *
             * Unlike [inboundWireTransferId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("inbound_wire_transfer_id")
            @ExcludeMissing
            fun _inboundWireTransferId(): JsonField<String> = inboundWireTransferId

            /**
             * Returns the raw JSON value of [reason].
             *
             * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<Reason> = reason

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
                 * Returns a mutable builder for constructing an instance of [WireDecline].
                 *
                 * The following fields are required:
                 * ```java
                 * .inboundWireTransferId()
                 * .reason()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [WireDecline]. */
            class Builder internal constructor() {

                private var inboundWireTransferId: JsonField<String>? = null
                private var reason: JsonField<Reason>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(wireDecline: WireDecline) = apply {
                    inboundWireTransferId = wireDecline.inboundWireTransferId
                    reason = wireDecline.reason
                    additionalProperties = wireDecline.additionalProperties.toMutableMap()
                }

                /** The identifier of the Inbound Wire Transfer that was declined. */
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

                /** Why the wire transfer was declined. */
                fun reason(reason: Reason) = reason(JsonField.of(reason))

                /**
                 * Sets [Builder.reason] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.reason] with a well-typed [Reason] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun reason(reason: JsonField<Reason>) = apply { this.reason = reason }

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
                 * Returns an immutable instance of [WireDecline].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .inboundWireTransferId()
                 * .reason()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): WireDecline =
                    WireDecline(
                        checkRequired("inboundWireTransferId", inboundWireTransferId),
                        checkRequired("reason", reason),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): WireDecline = apply {
                if (validated) {
                    return@apply
                }

                inboundWireTransferId()
                reason().validate()
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
                (if (inboundWireTransferId.asKnown().isPresent) 1 else 0) +
                    (reason.asKnown().getOrNull()?.validity() ?: 0)

            /** Why the wire transfer was declined. */
            class Reason @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    /** The account number is canceled. */
                    @JvmField val ACCOUNT_NUMBER_CANCELED = of("account_number_canceled")

                    /** The account number is disabled. */
                    @JvmField val ACCOUNT_NUMBER_DISABLED = of("account_number_disabled")

                    /** The account's entity is not active. */
                    @JvmField val ENTITY_NOT_ACTIVE = of("entity_not_active")

                    /** Your account is inactive. */
                    @JvmField val GROUP_LOCKED = of("group_locked")

                    /** The beneficiary account number does not exist. */
                    @JvmField val NO_ACCOUNT_NUMBER = of("no_account_number")

                    /** The transaction is not allowed per Increase's terms. */
                    @JvmField val TRANSACTION_NOT_ALLOWED = of("transaction_not_allowed")

                    @JvmStatic fun of(value: String) = Reason(JsonField.of(value))
                }

                /** An enum containing [Reason]'s known values. */
                enum class Known {
                    /** The account number is canceled. */
                    ACCOUNT_NUMBER_CANCELED,
                    /** The account number is disabled. */
                    ACCOUNT_NUMBER_DISABLED,
                    /** The account's entity is not active. */
                    ENTITY_NOT_ACTIVE,
                    /** Your account is inactive. */
                    GROUP_LOCKED,
                    /** The beneficiary account number does not exist. */
                    NO_ACCOUNT_NUMBER,
                    /** The transaction is not allowed per Increase's terms. */
                    TRANSACTION_NOT_ALLOWED,
                }

                /**
                 * An enum containing [Reason]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Reason] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    /** The account number is canceled. */
                    ACCOUNT_NUMBER_CANCELED,
                    /** The account number is disabled. */
                    ACCOUNT_NUMBER_DISABLED,
                    /** The account's entity is not active. */
                    ENTITY_NOT_ACTIVE,
                    /** Your account is inactive. */
                    GROUP_LOCKED,
                    /** The beneficiary account number does not exist. */
                    NO_ACCOUNT_NUMBER,
                    /** The transaction is not allowed per Increase's terms. */
                    TRANSACTION_NOT_ALLOWED,
                    /**
                     * An enum member indicating that [Reason] was instantiated with an unknown
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
                        ACCOUNT_NUMBER_CANCELED -> Value.ACCOUNT_NUMBER_CANCELED
                        ACCOUNT_NUMBER_DISABLED -> Value.ACCOUNT_NUMBER_DISABLED
                        ENTITY_NOT_ACTIVE -> Value.ENTITY_NOT_ACTIVE
                        GROUP_LOCKED -> Value.GROUP_LOCKED
                        NO_ACCOUNT_NUMBER -> Value.NO_ACCOUNT_NUMBER
                        TRANSACTION_NOT_ALLOWED -> Value.TRANSACTION_NOT_ALLOWED
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
                        ACCOUNT_NUMBER_CANCELED -> Known.ACCOUNT_NUMBER_CANCELED
                        ACCOUNT_NUMBER_DISABLED -> Known.ACCOUNT_NUMBER_DISABLED
                        ENTITY_NOT_ACTIVE -> Known.ENTITY_NOT_ACTIVE
                        GROUP_LOCKED -> Known.GROUP_LOCKED
                        NO_ACCOUNT_NUMBER -> Known.NO_ACCOUNT_NUMBER
                        TRANSACTION_NOT_ALLOWED -> Known.TRANSACTION_NOT_ALLOWED
                        else -> throw IncreaseInvalidDataException("Unknown Reason: $value")
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

                fun validate(): Reason = apply {
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

                    return other is Reason && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is WireDecline &&
                    inboundWireTransferId == other.inboundWireTransferId &&
                    reason == other.reason &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(inboundWireTransferId, reason, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "WireDecline{inboundWireTransferId=$inboundWireTransferId, reason=$reason, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Source &&
                category == other.category &&
                achDecline == other.achDecline &&
                cardDecline == other.cardDecline &&
                checkDecline == other.checkDecline &&
                checkDepositRejection == other.checkDepositRejection &&
                inboundFednowTransferDecline == other.inboundFednowTransferDecline &&
                inboundRealTimePaymentsTransferDecline ==
                    other.inboundRealTimePaymentsTransferDecline &&
                this.other == other.other &&
                wireDecline == other.wireDecline &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                category,
                achDecline,
                cardDecline,
                checkDecline,
                checkDepositRejection,
                inboundFednowTransferDecline,
                inboundRealTimePaymentsTransferDecline,
                other,
                wireDecline,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Source{category=$category, achDecline=$achDecline, cardDecline=$cardDecline, checkDecline=$checkDecline, checkDepositRejection=$checkDepositRejection, inboundFednowTransferDecline=$inboundFednowTransferDecline, inboundRealTimePaymentsTransferDecline=$inboundRealTimePaymentsTransferDecline, other=$other, wireDecline=$wireDecline, additionalProperties=$additionalProperties}"
    }

    /**
     * A constant representing the object's type. For this resource it will always be
     * `declined_transaction`.
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

            @JvmField val DECLINED_TRANSACTION = of("declined_transaction")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            DECLINED_TRANSACTION
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
            DECLINED_TRANSACTION,
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
                DECLINED_TRANSACTION -> Value.DECLINED_TRANSACTION
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
                DECLINED_TRANSACTION -> Known.DECLINED_TRANSACTION
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

        return other is DeclinedTransaction &&
            id == other.id &&
            accountId == other.accountId &&
            amount == other.amount &&
            createdAt == other.createdAt &&
            currency == other.currency &&
            description == other.description &&
            routeId == other.routeId &&
            routeType == other.routeType &&
            source == other.source &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            accountId,
            amount,
            createdAt,
            currency,
            description,
            routeId,
            routeType,
            source,
            type,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DeclinedTransaction{id=$id, accountId=$accountId, amount=$amount, createdAt=$createdAt, currency=$currency, description=$description, routeId=$routeId, routeType=$routeType, source=$source, type=$type, additionalProperties=$additionalProperties}"
}
