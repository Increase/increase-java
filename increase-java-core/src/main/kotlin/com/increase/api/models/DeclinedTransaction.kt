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
import com.increase.api.core.checkRequired
import com.increase.api.core.immutableEmptyMap
import com.increase.api.core.toImmutable
import com.increase.api.errors.IncreaseInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

/**
 * Declined Transactions are refused additions and removals of money from your bank account. For
 * example, Declined Transactions are caused when your Account has an insufficient balance or your
 * Limits are triggered.
 */
@NoAutoDetect
class DeclinedTransaction
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("account_id")
    @ExcludeMissing
    private val accountId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("amount") @ExcludeMissing private val amount: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("currency")
    @ExcludeMissing
    private val currency: JsonField<Currency> = JsonMissing.of(),
    @JsonProperty("description")
    @ExcludeMissing
    private val description: JsonField<String> = JsonMissing.of(),
    @JsonProperty("route_id")
    @ExcludeMissing
    private val routeId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("route_type")
    @ExcludeMissing
    private val routeType: JsonField<RouteType> = JsonMissing.of(),
    @JsonProperty("source")
    @ExcludeMissing
    private val source: JsonField<Source> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The Declined Transaction identifier. */
    fun id(): String = id.getRequired("id")

    /** The identifier for the Account the Declined Transaction belongs to. */
    fun accountId(): String = accountId.getRequired("account_id")

    /**
     * The Declined Transaction amount in the minor unit of its currency. For dollars, for example,
     * this is cents.
     */
    fun amount(): Long = amount.getRequired("amount")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date on which the Transaction
     * occurred.
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the Declined Transaction's
     * currency. This will match the currency on the Declined Transaction's Account.
     */
    fun currency(): Currency = currency.getRequired("currency")

    /** This is the description the vendor provides. */
    fun description(): String = description.getRequired("description")

    /**
     * The identifier for the route this Declined Transaction came through. Routes are things like
     * cards and ACH details.
     */
    fun routeId(): Optional<String> = Optional.ofNullable(routeId.getNullable("route_id"))

    /** The type of the route this Declined Transaction came through. */
    fun routeType(): Optional<RouteType> = Optional.ofNullable(routeType.getNullable("route_type"))

    /**
     * This is an object giving more details on the network-level event that caused the Declined
     * Transaction. For example, for a card transaction this lists the merchant's industry and
     * location. Note that for backwards compatibility reasons, additional undocumented keys may
     * appear in this object. These should be treated as deprecated and will be removed in the
     * future.
     */
    fun source(): Source = source.getRequired("source")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `declined_transaction`.
     */
    fun type(): Type = type.getRequired("type")

    /** The Declined Transaction identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /** The identifier for the Account the Declined Transaction belongs to. */
    @JsonProperty("account_id") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

    /**
     * The Declined Transaction amount in the minor unit of its currency. For dollars, for example,
     * this is cents.
     */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date on which the Transaction
     * occurred.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the Declined Transaction's
     * currency. This will match the currency on the Declined Transaction's Account.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<Currency> = currency

    /** This is the description the vendor provides. */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * The identifier for the route this Declined Transaction came through. Routes are things like
     * cards and ACH details.
     */
    @JsonProperty("route_id") @ExcludeMissing fun _routeId(): JsonField<String> = routeId

    /** The type of the route this Declined Transaction came through. */
    @JsonProperty("route_type") @ExcludeMissing fun _routeType(): JsonField<RouteType> = routeType

    /**
     * This is an object giving more details on the network-level event that caused the Declined
     * Transaction. For example, for a card transaction this lists the merchant's industry and
     * location. Note that for backwards compatibility reasons, additional undocumented keys may
     * appear in this object. These should be treated as deprecated and will be removed in the
     * future.
     */
    @JsonProperty("source") @ExcludeMissing fun _source(): JsonField<Source> = source

    /**
     * A constant representing the object's type. For this resource it will always be
     * `declined_transaction`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): DeclinedTransaction = apply {
        if (validated) {
            return@apply
        }

        id()
        accountId()
        amount()
        createdAt()
        currency()
        description()
        routeId()
        routeType()
        source().validate()
        type()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

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

        /** The Declined Transaction identifier. */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The identifier for the Account the Declined Transaction belongs to. */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /** The identifier for the Account the Declined Transaction belongs to. */
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        /**
         * The Declined Transaction amount in the minor unit of its currency. For dollars, for
         * example, this is cents.
         */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /**
         * The Declined Transaction amount in the minor unit of its currency. For dollars, for
         * example, this is cents.
         */
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date on which the Transaction
         * occurred.
         */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date on which the Transaction
         * occurred.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the Declined
         * Transaction's currency. This will match the currency on the Declined Transaction's
         * Account.
         */
        fun currency(currency: Currency) = currency(JsonField.of(currency))

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the Declined
         * Transaction's currency. This will match the currency on the Declined Transaction's
         * Account.
         */
        fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

        /** This is the description the vendor provides. */
        fun description(description: String) = description(JsonField.of(description))

        /** This is the description the vendor provides. */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /**
         * The identifier for the route this Declined Transaction came through. Routes are things
         * like cards and ACH details.
         */
        fun routeId(routeId: String?) = routeId(JsonField.ofNullable(routeId))

        /**
         * The identifier for the route this Declined Transaction came through. Routes are things
         * like cards and ACH details.
         */
        fun routeId(routeId: Optional<String>) = routeId(routeId.orElse(null))

        /**
         * The identifier for the route this Declined Transaction came through. Routes are things
         * like cards and ACH details.
         */
        fun routeId(routeId: JsonField<String>) = apply { this.routeId = routeId }

        /** The type of the route this Declined Transaction came through. */
        fun routeType(routeType: RouteType?) = routeType(JsonField.ofNullable(routeType))

        /** The type of the route this Declined Transaction came through. */
        fun routeType(routeType: Optional<RouteType>) = routeType(routeType.orElse(null))

        /** The type of the route this Declined Transaction came through. */
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
         * This is an object giving more details on the network-level event that caused the Declined
         * Transaction. For example, for a card transaction this lists the merchant's industry and
         * location. Note that for backwards compatibility reasons, additional undocumented keys may
         * appear in this object. These should be treated as deprecated and will be removed in the
         * future.
         */
        fun source(source: JsonField<Source>) = apply { this.source = source }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `declined_transaction`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be
         * `declined_transaction`.
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
                additionalProperties.toImmutable(),
            )
    }

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Currency && value == other.value /* spotless:on */
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
     * This is an object giving more details on the network-level event that caused the Declined
     * Transaction. For example, for a card transaction this lists the merchant's industry and
     * location. Note that for backwards compatibility reasons, additional undocumented keys may
     * appear in this object. These should be treated as deprecated and will be removed in the
     * future.
     */
    @NoAutoDetect
    class Source
    @JsonCreator
    private constructor(
        @JsonProperty("ach_decline")
        @ExcludeMissing
        private val achDecline: JsonField<AchDecline> = JsonMissing.of(),
        @JsonProperty("card_decline")
        @ExcludeMissing
        private val cardDecline: JsonField<CardDecline> = JsonMissing.of(),
        @JsonProperty("category")
        @ExcludeMissing
        private val category: JsonField<Category> = JsonMissing.of(),
        @JsonProperty("check_decline")
        @ExcludeMissing
        private val checkDecline: JsonField<CheckDecline> = JsonMissing.of(),
        @JsonProperty("check_deposit_rejection")
        @ExcludeMissing
        private val checkDepositRejection: JsonField<CheckDepositRejection> = JsonMissing.of(),
        @JsonProperty("inbound_real_time_payments_transfer_decline")
        @ExcludeMissing
        private val inboundRealTimePaymentsTransferDecline:
            JsonField<InboundRealTimePaymentsTransferDecline> =
            JsonMissing.of(),
        @JsonProperty("other") @ExcludeMissing private val other: JsonValue = JsonMissing.of(),
        @JsonProperty("wire_decline")
        @ExcludeMissing
        private val wireDecline: JsonField<WireDecline> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * An ACH Decline object. This field will be present in the JSON response if and only if
         * `category` is equal to `ach_decline`.
         */
        fun achDecline(): Optional<AchDecline> =
            Optional.ofNullable(achDecline.getNullable("ach_decline"))

        /**
         * A Card Decline object. This field will be present in the JSON response if and only if
         * `category` is equal to `card_decline`.
         */
        fun cardDecline(): Optional<CardDecline> =
            Optional.ofNullable(cardDecline.getNullable("card_decline"))

        /**
         * The type of the resource. We may add additional possible values for this enum over time;
         * your application should be able to handle such additions gracefully.
         */
        fun category(): Category = category.getRequired("category")

        /**
         * A Check Decline object. This field will be present in the JSON response if and only if
         * `category` is equal to `check_decline`.
         */
        fun checkDecline(): Optional<CheckDecline> =
            Optional.ofNullable(checkDecline.getNullable("check_decline"))

        /**
         * A Check Deposit Rejection object. This field will be present in the JSON response if and
         * only if `category` is equal to `check_deposit_rejection`.
         */
        fun checkDepositRejection(): Optional<CheckDepositRejection> =
            Optional.ofNullable(checkDepositRejection.getNullable("check_deposit_rejection"))

        /**
         * An Inbound Real-Time Payments Transfer Decline object. This field will be present in the
         * JSON response if and only if `category` is equal to
         * `inbound_real_time_payments_transfer_decline`.
         */
        fun inboundRealTimePaymentsTransferDecline():
            Optional<InboundRealTimePaymentsTransferDecline> =
            Optional.ofNullable(
                inboundRealTimePaymentsTransferDecline.getNullable(
                    "inbound_real_time_payments_transfer_decline"
                )
            )

        /**
         * If the category of this Transaction source is equal to `other`, this field will contain
         * an empty object, otherwise it will contain null.
         */
        @JsonProperty("other") @ExcludeMissing fun _other(): JsonValue = other

        /**
         * A Wire Decline object. This field will be present in the JSON response if and only if
         * `category` is equal to `wire_decline`.
         */
        fun wireDecline(): Optional<WireDecline> =
            Optional.ofNullable(wireDecline.getNullable("wire_decline"))

        /**
         * An ACH Decline object. This field will be present in the JSON response if and only if
         * `category` is equal to `ach_decline`.
         */
        @JsonProperty("ach_decline")
        @ExcludeMissing
        fun _achDecline(): JsonField<AchDecline> = achDecline

        /**
         * A Card Decline object. This field will be present in the JSON response if and only if
         * `category` is equal to `card_decline`.
         */
        @JsonProperty("card_decline")
        @ExcludeMissing
        fun _cardDecline(): JsonField<CardDecline> = cardDecline

        /**
         * The type of the resource. We may add additional possible values for this enum over time;
         * your application should be able to handle such additions gracefully.
         */
        @JsonProperty("category") @ExcludeMissing fun _category(): JsonField<Category> = category

        /**
         * A Check Decline object. This field will be present in the JSON response if and only if
         * `category` is equal to `check_decline`.
         */
        @JsonProperty("check_decline")
        @ExcludeMissing
        fun _checkDecline(): JsonField<CheckDecline> = checkDecline

        /**
         * A Check Deposit Rejection object. This field will be present in the JSON response if and
         * only if `category` is equal to `check_deposit_rejection`.
         */
        @JsonProperty("check_deposit_rejection")
        @ExcludeMissing
        fun _checkDepositRejection(): JsonField<CheckDepositRejection> = checkDepositRejection

        /**
         * An Inbound Real-Time Payments Transfer Decline object. This field will be present in the
         * JSON response if and only if `category` is equal to
         * `inbound_real_time_payments_transfer_decline`.
         */
        @JsonProperty("inbound_real_time_payments_transfer_decline")
        @ExcludeMissing
        fun _inboundRealTimePaymentsTransferDecline():
            JsonField<InboundRealTimePaymentsTransferDecline> =
            inboundRealTimePaymentsTransferDecline

        /**
         * A Wire Decline object. This field will be present in the JSON response if and only if
         * `category` is equal to `wire_decline`.
         */
        @JsonProperty("wire_decline")
        @ExcludeMissing
        fun _wireDecline(): JsonField<WireDecline> = wireDecline

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Source = apply {
            if (validated) {
                return@apply
            }

            achDecline().ifPresent { it.validate() }
            cardDecline().ifPresent { it.validate() }
            category()
            checkDecline().ifPresent { it.validate() }
            checkDepositRejection().ifPresent { it.validate() }
            inboundRealTimePaymentsTransferDecline().ifPresent { it.validate() }
            wireDecline().ifPresent { it.validate() }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Source]. */
        class Builder internal constructor() {

            private var achDecline: JsonField<AchDecline>? = null
            private var cardDecline: JsonField<CardDecline>? = null
            private var category: JsonField<Category>? = null
            private var checkDecline: JsonField<CheckDecline>? = null
            private var checkDepositRejection: JsonField<CheckDepositRejection>? = null
            private var inboundRealTimePaymentsTransferDecline:
                JsonField<InboundRealTimePaymentsTransferDecline>? =
                null
            private var other: JsonValue? = null
            private var wireDecline: JsonField<WireDecline>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(source: Source) = apply {
                achDecline = source.achDecline
                cardDecline = source.cardDecline
                category = source.category
                checkDecline = source.checkDecline
                checkDepositRejection = source.checkDepositRejection
                inboundRealTimePaymentsTransferDecline =
                    source.inboundRealTimePaymentsTransferDecline
                other = source.other
                wireDecline = source.wireDecline
                additionalProperties = source.additionalProperties.toMutableMap()
            }

            /**
             * An ACH Decline object. This field will be present in the JSON response if and only if
             * `category` is equal to `ach_decline`.
             */
            fun achDecline(achDecline: AchDecline?) = achDecline(JsonField.ofNullable(achDecline))

            /**
             * An ACH Decline object. This field will be present in the JSON response if and only if
             * `category` is equal to `ach_decline`.
             */
            fun achDecline(achDecline: Optional<AchDecline>) = achDecline(achDecline.orElse(null))

            /**
             * An ACH Decline object. This field will be present in the JSON response if and only if
             * `category` is equal to `ach_decline`.
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

            /**
             * A Card Decline object. This field will be present in the JSON response if and only if
             * `category` is equal to `card_decline`.
             */
            fun cardDecline(cardDecline: Optional<CardDecline>) =
                cardDecline(cardDecline.orElse(null))

            /**
             * A Card Decline object. This field will be present in the JSON response if and only if
             * `category` is equal to `card_decline`.
             */
            fun cardDecline(cardDecline: JsonField<CardDecline>) = apply {
                this.cardDecline = cardDecline
            }

            /**
             * The type of the resource. We may add additional possible values for this enum over
             * time; your application should be able to handle such additions gracefully.
             */
            fun category(category: Category) = category(JsonField.of(category))

            /**
             * The type of the resource. We may add additional possible values for this enum over
             * time; your application should be able to handle such additions gracefully.
             */
            fun category(category: JsonField<Category>) = apply { this.category = category }

            /**
             * A Check Decline object. This field will be present in the JSON response if and only
             * if `category` is equal to `check_decline`.
             */
            fun checkDecline(checkDecline: CheckDecline?) =
                checkDecline(JsonField.ofNullable(checkDecline))

            /**
             * A Check Decline object. This field will be present in the JSON response if and only
             * if `category` is equal to `check_decline`.
             */
            fun checkDecline(checkDecline: Optional<CheckDecline>) =
                checkDecline(checkDecline.orElse(null))

            /**
             * A Check Decline object. This field will be present in the JSON response if and only
             * if `category` is equal to `check_decline`.
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
             * A Check Deposit Rejection object. This field will be present in the JSON response if
             * and only if `category` is equal to `check_deposit_rejection`.
             */
            fun checkDepositRejection(checkDepositRejection: Optional<CheckDepositRejection>) =
                checkDepositRejection(checkDepositRejection.orElse(null))

            /**
             * A Check Deposit Rejection object. This field will be present in the JSON response if
             * and only if `category` is equal to `check_deposit_rejection`.
             */
            fun checkDepositRejection(checkDepositRejection: JsonField<CheckDepositRejection>) =
                apply {
                    this.checkDepositRejection = checkDepositRejection
                }

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
             * An Inbound Real-Time Payments Transfer Decline object. This field will be present in
             * the JSON response if and only if `category` is equal to
             * `inbound_real_time_payments_transfer_decline`.
             */
            fun inboundRealTimePaymentsTransferDecline(
                inboundRealTimePaymentsTransferDecline:
                    Optional<InboundRealTimePaymentsTransferDecline>
            ) =
                inboundRealTimePaymentsTransferDecline(
                    inboundRealTimePaymentsTransferDecline.orElse(null)
                )

            /**
             * An Inbound Real-Time Payments Transfer Decline object. This field will be present in
             * the JSON response if and only if `category` is equal to
             * `inbound_real_time_payments_transfer_decline`.
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
            fun other(other: JsonValue) = apply { this.other = other }

            /**
             * A Wire Decline object. This field will be present in the JSON response if and only if
             * `category` is equal to `wire_decline`.
             */
            fun wireDecline(wireDecline: WireDecline?) =
                wireDecline(JsonField.ofNullable(wireDecline))

            /**
             * A Wire Decline object. This field will be present in the JSON response if and only if
             * `category` is equal to `wire_decline`.
             */
            fun wireDecline(wireDecline: Optional<WireDecline>) =
                wireDecline(wireDecline.orElse(null))

            /**
             * A Wire Decline object. This field will be present in the JSON response if and only if
             * `category` is equal to `wire_decline`.
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

            fun build(): Source =
                Source(
                    checkRequired("achDecline", achDecline),
                    checkRequired("cardDecline", cardDecline),
                    checkRequired("category", category),
                    checkRequired("checkDecline", checkDecline),
                    checkRequired("checkDepositRejection", checkDepositRejection),
                    checkRequired(
                        "inboundRealTimePaymentsTransferDecline",
                        inboundRealTimePaymentsTransferDecline,
                    ),
                    checkRequired("other", other),
                    checkRequired("wireDecline", wireDecline),
                    additionalProperties.toImmutable(),
                )
        }

        /**
         * An ACH Decline object. This field will be present in the JSON response if and only if
         * `category` is equal to `ach_decline`.
         */
        @NoAutoDetect
        class AchDecline
        @JsonCreator
        private constructor(
            @JsonProperty("id")
            @ExcludeMissing
            private val id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("amount")
            @ExcludeMissing
            private val amount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("inbound_ach_transfer_id")
            @ExcludeMissing
            private val inboundAchTransferId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("originator_company_descriptive_date")
            @ExcludeMissing
            private val originatorCompanyDescriptiveDate: JsonField<String> = JsonMissing.of(),
            @JsonProperty("originator_company_discretionary_data")
            @ExcludeMissing
            private val originatorCompanyDiscretionaryData: JsonField<String> = JsonMissing.of(),
            @JsonProperty("originator_company_id")
            @ExcludeMissing
            private val originatorCompanyId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("originator_company_name")
            @ExcludeMissing
            private val originatorCompanyName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("reason")
            @ExcludeMissing
            private val reason: JsonField<Reason> = JsonMissing.of(),
            @JsonProperty("receiver_id_number")
            @ExcludeMissing
            private val receiverIdNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("receiver_name")
            @ExcludeMissing
            private val receiverName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("trace_number")
            @ExcludeMissing
            private val traceNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type")
            @ExcludeMissing
            private val type: JsonField<Type> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The ACH Decline's identifier. */
            fun id(): String = id.getRequired("id")

            /** The declined amount in USD cents. */
            fun amount(): Long = amount.getRequired("amount")

            /** The identifier of the Inbound ACH Transfer object associated with this decline. */
            fun inboundAchTransferId(): String =
                inboundAchTransferId.getRequired("inbound_ach_transfer_id")

            /** The descriptive date of the transfer. */
            fun originatorCompanyDescriptiveDate(): Optional<String> =
                Optional.ofNullable(
                    originatorCompanyDescriptiveDate.getNullable(
                        "originator_company_descriptive_date"
                    )
                )

            /** The additional information included with the transfer. */
            fun originatorCompanyDiscretionaryData(): Optional<String> =
                Optional.ofNullable(
                    originatorCompanyDiscretionaryData.getNullable(
                        "originator_company_discretionary_data"
                    )
                )

            /** The identifier of the company that initiated the transfer. */
            fun originatorCompanyId(): String =
                originatorCompanyId.getRequired("originator_company_id")

            /** The name of the company that initiated the transfer. */
            fun originatorCompanyName(): String =
                originatorCompanyName.getRequired("originator_company_name")

            /** Why the ACH transfer was declined. */
            fun reason(): Reason = reason.getRequired("reason")

            /** The id of the receiver of the transfer. */
            fun receiverIdNumber(): Optional<String> =
                Optional.ofNullable(receiverIdNumber.getNullable("receiver_id_number"))

            /** The name of the receiver of the transfer. */
            fun receiverName(): Optional<String> =
                Optional.ofNullable(receiverName.getNullable("receiver_name"))

            /** The trace number of the transfer. */
            fun traceNumber(): String = traceNumber.getRequired("trace_number")

            /**
             * A constant representing the object's type. For this resource it will always be
             * `ach_decline`.
             */
            fun type(): Type = type.getRequired("type")

            /** The ACH Decline's identifier. */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /** The declined amount in USD cents. */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

            /** The identifier of the Inbound ACH Transfer object associated with this decline. */
            @JsonProperty("inbound_ach_transfer_id")
            @ExcludeMissing
            fun _inboundAchTransferId(): JsonField<String> = inboundAchTransferId

            /** The descriptive date of the transfer. */
            @JsonProperty("originator_company_descriptive_date")
            @ExcludeMissing
            fun _originatorCompanyDescriptiveDate(): JsonField<String> =
                originatorCompanyDescriptiveDate

            /** The additional information included with the transfer. */
            @JsonProperty("originator_company_discretionary_data")
            @ExcludeMissing
            fun _originatorCompanyDiscretionaryData(): JsonField<String> =
                originatorCompanyDiscretionaryData

            /** The identifier of the company that initiated the transfer. */
            @JsonProperty("originator_company_id")
            @ExcludeMissing
            fun _originatorCompanyId(): JsonField<String> = originatorCompanyId

            /** The name of the company that initiated the transfer. */
            @JsonProperty("originator_company_name")
            @ExcludeMissing
            fun _originatorCompanyName(): JsonField<String> = originatorCompanyName

            /** Why the ACH transfer was declined. */
            @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<Reason> = reason

            /** The id of the receiver of the transfer. */
            @JsonProperty("receiver_id_number")
            @ExcludeMissing
            fun _receiverIdNumber(): JsonField<String> = receiverIdNumber

            /** The name of the receiver of the transfer. */
            @JsonProperty("receiver_name")
            @ExcludeMissing
            fun _receiverName(): JsonField<String> = receiverName

            /** The trace number of the transfer. */
            @JsonProperty("trace_number")
            @ExcludeMissing
            fun _traceNumber(): JsonField<String> = traceNumber

            /**
             * A constant representing the object's type. For this resource it will always be
             * `ach_decline`.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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
                reason()
                receiverIdNumber()
                receiverName()
                traceNumber()
                type()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

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

                /** The ACH Decline's identifier. */
                fun id(id: JsonField<String>) = apply { this.id = id }

                /** The declined amount in USD cents. */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /** The declined amount in USD cents. */
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /**
                 * The identifier of the Inbound ACH Transfer object associated with this decline.
                 */
                fun inboundAchTransferId(inboundAchTransferId: String) =
                    inboundAchTransferId(JsonField.of(inboundAchTransferId))

                /**
                 * The identifier of the Inbound ACH Transfer object associated with this decline.
                 */
                fun inboundAchTransferId(inboundAchTransferId: JsonField<String>) = apply {
                    this.inboundAchTransferId = inboundAchTransferId
                }

                /** The descriptive date of the transfer. */
                fun originatorCompanyDescriptiveDate(originatorCompanyDescriptiveDate: String?) =
                    originatorCompanyDescriptiveDate(
                        JsonField.ofNullable(originatorCompanyDescriptiveDate)
                    )

                /** The descriptive date of the transfer. */
                fun originatorCompanyDescriptiveDate(
                    originatorCompanyDescriptiveDate: Optional<String>
                ) = originatorCompanyDescriptiveDate(originatorCompanyDescriptiveDate.orElse(null))

                /** The descriptive date of the transfer. */
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

                /** The additional information included with the transfer. */
                fun originatorCompanyDiscretionaryData(
                    originatorCompanyDiscretionaryData: Optional<String>
                ) =
                    originatorCompanyDiscretionaryData(
                        originatorCompanyDiscretionaryData.orElse(null)
                    )

                /** The additional information included with the transfer. */
                fun originatorCompanyDiscretionaryData(
                    originatorCompanyDiscretionaryData: JsonField<String>
                ) = apply {
                    this.originatorCompanyDiscretionaryData = originatorCompanyDiscretionaryData
                }

                /** The identifier of the company that initiated the transfer. */
                fun originatorCompanyId(originatorCompanyId: String) =
                    originatorCompanyId(JsonField.of(originatorCompanyId))

                /** The identifier of the company that initiated the transfer. */
                fun originatorCompanyId(originatorCompanyId: JsonField<String>) = apply {
                    this.originatorCompanyId = originatorCompanyId
                }

                /** The name of the company that initiated the transfer. */
                fun originatorCompanyName(originatorCompanyName: String) =
                    originatorCompanyName(JsonField.of(originatorCompanyName))

                /** The name of the company that initiated the transfer. */
                fun originatorCompanyName(originatorCompanyName: JsonField<String>) = apply {
                    this.originatorCompanyName = originatorCompanyName
                }

                /** Why the ACH transfer was declined. */
                fun reason(reason: Reason) = reason(JsonField.of(reason))

                /** Why the ACH transfer was declined. */
                fun reason(reason: JsonField<Reason>) = apply { this.reason = reason }

                /** The id of the receiver of the transfer. */
                fun receiverIdNumber(receiverIdNumber: String?) =
                    receiverIdNumber(JsonField.ofNullable(receiverIdNumber))

                /** The id of the receiver of the transfer. */
                fun receiverIdNumber(receiverIdNumber: Optional<String>) =
                    receiverIdNumber(receiverIdNumber.orElse(null))

                /** The id of the receiver of the transfer. */
                fun receiverIdNumber(receiverIdNumber: JsonField<String>) = apply {
                    this.receiverIdNumber = receiverIdNumber
                }

                /** The name of the receiver of the transfer. */
                fun receiverName(receiverName: String?) =
                    receiverName(JsonField.ofNullable(receiverName))

                /** The name of the receiver of the transfer. */
                fun receiverName(receiverName: Optional<String>) =
                    receiverName(receiverName.orElse(null))

                /** The name of the receiver of the transfer. */
                fun receiverName(receiverName: JsonField<String>) = apply {
                    this.receiverName = receiverName
                }

                /** The trace number of the transfer. */
                fun traceNumber(traceNumber: String) = traceNumber(JsonField.of(traceNumber))

                /** The trace number of the transfer. */
                fun traceNumber(traceNumber: JsonField<String>) = apply {
                    this.traceNumber = traceNumber
                }

                /**
                 * A constant representing the object's type. For this resource it will always be
                 * `ach_decline`.
                 */
                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * A constant representing the object's type. For this resource it will always be
                 * `ach_decline`.
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
                        additionalProperties.toImmutable(),
                    )
            }

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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Reason && value == other.value /* spotless:on */
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

                return /* spotless:off */ other is AchDecline && id == other.id && amount == other.amount && inboundAchTransferId == other.inboundAchTransferId && originatorCompanyDescriptiveDate == other.originatorCompanyDescriptiveDate && originatorCompanyDiscretionaryData == other.originatorCompanyDiscretionaryData && originatorCompanyId == other.originatorCompanyId && originatorCompanyName == other.originatorCompanyName && reason == other.reason && receiverIdNumber == other.receiverIdNumber && receiverName == other.receiverName && traceNumber == other.traceNumber && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, amount, inboundAchTransferId, originatorCompanyDescriptiveDate, originatorCompanyDiscretionaryData, originatorCompanyId, originatorCompanyName, reason, receiverIdNumber, receiverName, traceNumber, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AchDecline{id=$id, amount=$amount, inboundAchTransferId=$inboundAchTransferId, originatorCompanyDescriptiveDate=$originatorCompanyDescriptiveDate, originatorCompanyDiscretionaryData=$originatorCompanyDiscretionaryData, originatorCompanyId=$originatorCompanyId, originatorCompanyName=$originatorCompanyName, reason=$reason, receiverIdNumber=$receiverIdNumber, receiverName=$receiverName, traceNumber=$traceNumber, type=$type, additionalProperties=$additionalProperties}"
        }

        /**
         * A Card Decline object. This field will be present in the JSON response if and only if
         * `category` is equal to `card_decline`.
         */
        @NoAutoDetect
        class CardDecline
        @JsonCreator
        private constructor(
            @JsonProperty("id")
            @ExcludeMissing
            private val id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("actioner")
            @ExcludeMissing
            private val actioner: JsonField<Actioner> = JsonMissing.of(),
            @JsonProperty("amount")
            @ExcludeMissing
            private val amount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("card_payment_id")
            @ExcludeMissing
            private val cardPaymentId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("currency")
            @ExcludeMissing
            private val currency: JsonField<Currency> = JsonMissing.of(),
            @JsonProperty("declined_transaction_id")
            @ExcludeMissing
            private val declinedTransactionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("digital_wallet_token_id")
            @ExcludeMissing
            private val digitalWalletTokenId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("direction")
            @ExcludeMissing
            private val direction: JsonField<Direction> = JsonMissing.of(),
            @JsonProperty("merchant_acceptor_id")
            @ExcludeMissing
            private val merchantAcceptorId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("merchant_category_code")
            @ExcludeMissing
            private val merchantCategoryCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("merchant_city")
            @ExcludeMissing
            private val merchantCity: JsonField<String> = JsonMissing.of(),
            @JsonProperty("merchant_country")
            @ExcludeMissing
            private val merchantCountry: JsonField<String> = JsonMissing.of(),
            @JsonProperty("merchant_descriptor")
            @ExcludeMissing
            private val merchantDescriptor: JsonField<String> = JsonMissing.of(),
            @JsonProperty("merchant_postal_code")
            @ExcludeMissing
            private val merchantPostalCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("merchant_state")
            @ExcludeMissing
            private val merchantState: JsonField<String> = JsonMissing.of(),
            @JsonProperty("network_details")
            @ExcludeMissing
            private val networkDetails: JsonField<NetworkDetails> = JsonMissing.of(),
            @JsonProperty("network_identifiers")
            @ExcludeMissing
            private val networkIdentifiers: JsonField<NetworkIdentifiers> = JsonMissing.of(),
            @JsonProperty("network_risk_score")
            @ExcludeMissing
            private val networkRiskScore: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("physical_card_id")
            @ExcludeMissing
            private val physicalCardId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("presentment_amount")
            @ExcludeMissing
            private val presentmentAmount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("presentment_currency")
            @ExcludeMissing
            private val presentmentCurrency: JsonField<String> = JsonMissing.of(),
            @JsonProperty("processing_category")
            @ExcludeMissing
            private val processingCategory: JsonField<ProcessingCategory> = JsonMissing.of(),
            @JsonProperty("real_time_decision_id")
            @ExcludeMissing
            private val realTimeDecisionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("real_time_decision_reason")
            @ExcludeMissing
            private val realTimeDecisionReason: JsonField<RealTimeDecisionReason> =
                JsonMissing.of(),
            @JsonProperty("reason")
            @ExcludeMissing
            private val reason: JsonField<Reason> = JsonMissing.of(),
            @JsonProperty("terminal_id")
            @ExcludeMissing
            private val terminalId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("verification")
            @ExcludeMissing
            private val verification: JsonField<Verification> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The Card Decline identifier. */
            fun id(): String = id.getRequired("id")

            /**
             * Whether this authorization was approved by Increase, the card network through
             * stand-in processing, or the user through a real-time decision.
             */
            fun actioner(): Actioner = actioner.getRequired("actioner")

            /**
             * The declined amount in the minor unit of the destination account currency. For
             * dollars, for example, this is cents.
             */
            fun amount(): Long = amount.getRequired("amount")

            /** The ID of the Card Payment this transaction belongs to. */
            fun cardPaymentId(): String = cardPaymentId.getRequired("card_payment_id")

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the destination
             * account currency.
             */
            fun currency(): Currency = currency.getRequired("currency")

            /** The identifier of the declined transaction created for this Card Decline. */
            fun declinedTransactionId(): String =
                declinedTransactionId.getRequired("declined_transaction_id")

            /**
             * If the authorization was made via a Digital Wallet Token (such as an Apple Pay
             * purchase), the identifier of the token that was used.
             */
            fun digitalWalletTokenId(): Optional<String> =
                Optional.ofNullable(digitalWalletTokenId.getNullable("digital_wallet_token_id"))

            /**
             * The direction describes the direction the funds will move, either from the cardholder
             * to the merchant or from the merchant to the cardholder.
             */
            fun direction(): Direction = direction.getRequired("direction")

            /**
             * The merchant identifier (commonly abbreviated as MID) of the merchant the card is
             * transacting with.
             */
            fun merchantAcceptorId(): String =
                merchantAcceptorId.getRequired("merchant_acceptor_id")

            /**
             * The Merchant Category Code (commonly abbreviated as MCC) of the merchant the card is
             * transacting with.
             */
            fun merchantCategoryCode(): String =
                merchantCategoryCode.getRequired("merchant_category_code")

            /** The city the merchant resides in. */
            fun merchantCity(): Optional<String> =
                Optional.ofNullable(merchantCity.getNullable("merchant_city"))

            /** The country the merchant resides in. */
            fun merchantCountry(): String = merchantCountry.getRequired("merchant_country")

            /** The merchant descriptor of the merchant the card is transacting with. */
            fun merchantDescriptor(): String = merchantDescriptor.getRequired("merchant_descriptor")

            /**
             * The merchant's postal code. For US merchants this is either a 5-digit or 9-digit ZIP
             * code, where the first 5 and last 4 are separated by a dash.
             */
            fun merchantPostalCode(): Optional<String> =
                Optional.ofNullable(merchantPostalCode.getNullable("merchant_postal_code"))

            /** The state the merchant resides in. */
            fun merchantState(): Optional<String> =
                Optional.ofNullable(merchantState.getNullable("merchant_state"))

            /** Fields specific to the `network`. */
            fun networkDetails(): NetworkDetails = networkDetails.getRequired("network_details")

            /** Network-specific identifiers for a specific request or transaction. */
            fun networkIdentifiers(): NetworkIdentifiers =
                networkIdentifiers.getRequired("network_identifiers")

            /**
             * The risk score generated by the card network. For Visa this is the Visa Advanced
             * Authorization risk score, from 0 to 99, where 99 is the riskiest.
             */
            fun networkRiskScore(): Optional<Long> =
                Optional.ofNullable(networkRiskScore.getNullable("network_risk_score"))

            /**
             * If the authorization was made in-person with a physical card, the Physical Card that
             * was used.
             */
            fun physicalCardId(): Optional<String> =
                Optional.ofNullable(physicalCardId.getNullable("physical_card_id"))

            /** The declined amount in the minor unit of the transaction's presentment currency. */
            fun presentmentAmount(): Long = presentmentAmount.getRequired("presentment_amount")

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
             * presentment currency.
             */
            fun presentmentCurrency(): String =
                presentmentCurrency.getRequired("presentment_currency")

            /**
             * The processing category describes the intent behind the authorization, such as
             * whether it was used for bill payments or an automatic fuel dispenser.
             */
            fun processingCategory(): ProcessingCategory =
                processingCategory.getRequired("processing_category")

            /**
             * The identifier of the Real-Time Decision sent to approve or decline this transaction.
             */
            fun realTimeDecisionId(): Optional<String> =
                Optional.ofNullable(realTimeDecisionId.getNullable("real_time_decision_id"))

            /** This is present if a specific decline reason was given in the real-time decision. */
            fun realTimeDecisionReason(): Optional<RealTimeDecisionReason> =
                Optional.ofNullable(realTimeDecisionReason.getNullable("real_time_decision_reason"))

            /** Why the transaction was declined. */
            fun reason(): Reason = reason.getRequired("reason")

            /**
             * The terminal identifier (commonly abbreviated as TID) of the terminal the card is
             * transacting with.
             */
            fun terminalId(): Optional<String> =
                Optional.ofNullable(terminalId.getNullable("terminal_id"))

            /** Fields related to verification of cardholder-provided values. */
            fun verification(): Verification = verification.getRequired("verification")

            /** The Card Decline identifier. */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Whether this authorization was approved by Increase, the card network through
             * stand-in processing, or the user through a real-time decision.
             */
            @JsonProperty("actioner")
            @ExcludeMissing
            fun _actioner(): JsonField<Actioner> = actioner

            /**
             * The declined amount in the minor unit of the destination account currency. For
             * dollars, for example, this is cents.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

            /** The ID of the Card Payment this transaction belongs to. */
            @JsonProperty("card_payment_id")
            @ExcludeMissing
            fun _cardPaymentId(): JsonField<String> = cardPaymentId

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the destination
             * account currency.
             */
            @JsonProperty("currency")
            @ExcludeMissing
            fun _currency(): JsonField<Currency> = currency

            /** The identifier of the declined transaction created for this Card Decline. */
            @JsonProperty("declined_transaction_id")
            @ExcludeMissing
            fun _declinedTransactionId(): JsonField<String> = declinedTransactionId

            /**
             * If the authorization was made via a Digital Wallet Token (such as an Apple Pay
             * purchase), the identifier of the token that was used.
             */
            @JsonProperty("digital_wallet_token_id")
            @ExcludeMissing
            fun _digitalWalletTokenId(): JsonField<String> = digitalWalletTokenId

            /**
             * The direction describes the direction the funds will move, either from the cardholder
             * to the merchant or from the merchant to the cardholder.
             */
            @JsonProperty("direction")
            @ExcludeMissing
            fun _direction(): JsonField<Direction> = direction

            /**
             * The merchant identifier (commonly abbreviated as MID) of the merchant the card is
             * transacting with.
             */
            @JsonProperty("merchant_acceptor_id")
            @ExcludeMissing
            fun _merchantAcceptorId(): JsonField<String> = merchantAcceptorId

            /**
             * The Merchant Category Code (commonly abbreviated as MCC) of the merchant the card is
             * transacting with.
             */
            @JsonProperty("merchant_category_code")
            @ExcludeMissing
            fun _merchantCategoryCode(): JsonField<String> = merchantCategoryCode

            /** The city the merchant resides in. */
            @JsonProperty("merchant_city")
            @ExcludeMissing
            fun _merchantCity(): JsonField<String> = merchantCity

            /** The country the merchant resides in. */
            @JsonProperty("merchant_country")
            @ExcludeMissing
            fun _merchantCountry(): JsonField<String> = merchantCountry

            /** The merchant descriptor of the merchant the card is transacting with. */
            @JsonProperty("merchant_descriptor")
            @ExcludeMissing
            fun _merchantDescriptor(): JsonField<String> = merchantDescriptor

            /**
             * The merchant's postal code. For US merchants this is either a 5-digit or 9-digit ZIP
             * code, where the first 5 and last 4 are separated by a dash.
             */
            @JsonProperty("merchant_postal_code")
            @ExcludeMissing
            fun _merchantPostalCode(): JsonField<String> = merchantPostalCode

            /** The state the merchant resides in. */
            @JsonProperty("merchant_state")
            @ExcludeMissing
            fun _merchantState(): JsonField<String> = merchantState

            /** Fields specific to the `network`. */
            @JsonProperty("network_details")
            @ExcludeMissing
            fun _networkDetails(): JsonField<NetworkDetails> = networkDetails

            /** Network-specific identifiers for a specific request or transaction. */
            @JsonProperty("network_identifiers")
            @ExcludeMissing
            fun _networkIdentifiers(): JsonField<NetworkIdentifiers> = networkIdentifiers

            /**
             * The risk score generated by the card network. For Visa this is the Visa Advanced
             * Authorization risk score, from 0 to 99, where 99 is the riskiest.
             */
            @JsonProperty("network_risk_score")
            @ExcludeMissing
            fun _networkRiskScore(): JsonField<Long> = networkRiskScore

            /**
             * If the authorization was made in-person with a physical card, the Physical Card that
             * was used.
             */
            @JsonProperty("physical_card_id")
            @ExcludeMissing
            fun _physicalCardId(): JsonField<String> = physicalCardId

            /** The declined amount in the minor unit of the transaction's presentment currency. */
            @JsonProperty("presentment_amount")
            @ExcludeMissing
            fun _presentmentAmount(): JsonField<Long> = presentmentAmount

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
             * presentment currency.
             */
            @JsonProperty("presentment_currency")
            @ExcludeMissing
            fun _presentmentCurrency(): JsonField<String> = presentmentCurrency

            /**
             * The processing category describes the intent behind the authorization, such as
             * whether it was used for bill payments or an automatic fuel dispenser.
             */
            @JsonProperty("processing_category")
            @ExcludeMissing
            fun _processingCategory(): JsonField<ProcessingCategory> = processingCategory

            /**
             * The identifier of the Real-Time Decision sent to approve or decline this transaction.
             */
            @JsonProperty("real_time_decision_id")
            @ExcludeMissing
            fun _realTimeDecisionId(): JsonField<String> = realTimeDecisionId

            /** This is present if a specific decline reason was given in the real-time decision. */
            @JsonProperty("real_time_decision_reason")
            @ExcludeMissing
            fun _realTimeDecisionReason(): JsonField<RealTimeDecisionReason> =
                realTimeDecisionReason

            /** Why the transaction was declined. */
            @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<Reason> = reason

            /**
             * The terminal identifier (commonly abbreviated as TID) of the terminal the card is
             * transacting with.
             */
            @JsonProperty("terminal_id")
            @ExcludeMissing
            fun _terminalId(): JsonField<String> = terminalId

            /** Fields related to verification of cardholder-provided values. */
            @JsonProperty("verification")
            @ExcludeMissing
            fun _verification(): JsonField<Verification> = verification

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): CardDecline = apply {
                if (validated) {
                    return@apply
                }

                id()
                actioner()
                amount()
                cardPaymentId()
                currency()
                declinedTransactionId()
                digitalWalletTokenId()
                direction()
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
                processingCategory()
                realTimeDecisionId()
                realTimeDecisionReason()
                reason()
                terminalId()
                verification().validate()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [CardDecline]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var actioner: JsonField<Actioner>? = null
                private var amount: JsonField<Long>? = null
                private var cardPaymentId: JsonField<String>? = null
                private var currency: JsonField<Currency>? = null
                private var declinedTransactionId: JsonField<String>? = null
                private var digitalWalletTokenId: JsonField<String>? = null
                private var direction: JsonField<Direction>? = null
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
                    amount = cardDecline.amount
                    cardPaymentId = cardDecline.cardPaymentId
                    currency = cardDecline.currency
                    declinedTransactionId = cardDecline.declinedTransactionId
                    digitalWalletTokenId = cardDecline.digitalWalletTokenId
                    direction = cardDecline.direction
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

                /** The Card Decline identifier. */
                fun id(id: JsonField<String>) = apply { this.id = id }

                /**
                 * Whether this authorization was approved by Increase, the card network through
                 * stand-in processing, or the user through a real-time decision.
                 */
                fun actioner(actioner: Actioner) = actioner(JsonField.of(actioner))

                /**
                 * Whether this authorization was approved by Increase, the card network through
                 * stand-in processing, or the user through a real-time decision.
                 */
                fun actioner(actioner: JsonField<Actioner>) = apply { this.actioner = actioner }

                /**
                 * The declined amount in the minor unit of the destination account currency. For
                 * dollars, for example, this is cents.
                 */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /**
                 * The declined amount in the minor unit of the destination account currency. For
                 * dollars, for example, this is cents.
                 */
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /** The ID of the Card Payment this transaction belongs to. */
                fun cardPaymentId(cardPaymentId: String) =
                    cardPaymentId(JsonField.of(cardPaymentId))

                /** The ID of the Card Payment this transaction belongs to. */
                fun cardPaymentId(cardPaymentId: JsonField<String>) = apply {
                    this.cardPaymentId = cardPaymentId
                }

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the destination
                 * account currency.
                 */
                fun currency(currency: Currency) = currency(JsonField.of(currency))

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the destination
                 * account currency.
                 */
                fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                /** The identifier of the declined transaction created for this Card Decline. */
                fun declinedTransactionId(declinedTransactionId: String) =
                    declinedTransactionId(JsonField.of(declinedTransactionId))

                /** The identifier of the declined transaction created for this Card Decline. */
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
                 * If the authorization was made via a Digital Wallet Token (such as an Apple Pay
                 * purchase), the identifier of the token that was used.
                 */
                fun digitalWalletTokenId(digitalWalletTokenId: Optional<String>) =
                    digitalWalletTokenId(digitalWalletTokenId.orElse(null))

                /**
                 * If the authorization was made via a Digital Wallet Token (such as an Apple Pay
                 * purchase), the identifier of the token that was used.
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
                 * The direction describes the direction the funds will move, either from the
                 * cardholder to the merchant or from the merchant to the cardholder.
                 */
                fun direction(direction: JsonField<Direction>) = apply {
                    this.direction = direction
                }

                /**
                 * The merchant identifier (commonly abbreviated as MID) of the merchant the card is
                 * transacting with.
                 */
                fun merchantAcceptorId(merchantAcceptorId: String) =
                    merchantAcceptorId(JsonField.of(merchantAcceptorId))

                /**
                 * The merchant identifier (commonly abbreviated as MID) of the merchant the card is
                 * transacting with.
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
                 * The Merchant Category Code (commonly abbreviated as MCC) of the merchant the card
                 * is transacting with.
                 */
                fun merchantCategoryCode(merchantCategoryCode: JsonField<String>) = apply {
                    this.merchantCategoryCode = merchantCategoryCode
                }

                /** The city the merchant resides in. */
                fun merchantCity(merchantCity: String?) =
                    merchantCity(JsonField.ofNullable(merchantCity))

                /** The city the merchant resides in. */
                fun merchantCity(merchantCity: Optional<String>) =
                    merchantCity(merchantCity.orElse(null))

                /** The city the merchant resides in. */
                fun merchantCity(merchantCity: JsonField<String>) = apply {
                    this.merchantCity = merchantCity
                }

                /** The country the merchant resides in. */
                fun merchantCountry(merchantCountry: String) =
                    merchantCountry(JsonField.of(merchantCountry))

                /** The country the merchant resides in. */
                fun merchantCountry(merchantCountry: JsonField<String>) = apply {
                    this.merchantCountry = merchantCountry
                }

                /** The merchant descriptor of the merchant the card is transacting with. */
                fun merchantDescriptor(merchantDescriptor: String) =
                    merchantDescriptor(JsonField.of(merchantDescriptor))

                /** The merchant descriptor of the merchant the card is transacting with. */
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
                 * The merchant's postal code. For US merchants this is either a 5-digit or 9-digit
                 * ZIP code, where the first 5 and last 4 are separated by a dash.
                 */
                fun merchantPostalCode(merchantPostalCode: Optional<String>) =
                    merchantPostalCode(merchantPostalCode.orElse(null))

                /**
                 * The merchant's postal code. For US merchants this is either a 5-digit or 9-digit
                 * ZIP code, where the first 5 and last 4 are separated by a dash.
                 */
                fun merchantPostalCode(merchantPostalCode: JsonField<String>) = apply {
                    this.merchantPostalCode = merchantPostalCode
                }

                /** The state the merchant resides in. */
                fun merchantState(merchantState: String?) =
                    merchantState(JsonField.ofNullable(merchantState))

                /** The state the merchant resides in. */
                fun merchantState(merchantState: Optional<String>) =
                    merchantState(merchantState.orElse(null))

                /** The state the merchant resides in. */
                fun merchantState(merchantState: JsonField<String>) = apply {
                    this.merchantState = merchantState
                }

                /** Fields specific to the `network`. */
                fun networkDetails(networkDetails: NetworkDetails) =
                    networkDetails(JsonField.of(networkDetails))

                /** Fields specific to the `network`. */
                fun networkDetails(networkDetails: JsonField<NetworkDetails>) = apply {
                    this.networkDetails = networkDetails
                }

                /** Network-specific identifiers for a specific request or transaction. */
                fun networkIdentifiers(networkIdentifiers: NetworkIdentifiers) =
                    networkIdentifiers(JsonField.of(networkIdentifiers))

                /** Network-specific identifiers for a specific request or transaction. */
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
                 * The risk score generated by the card network. For Visa this is the Visa Advanced
                 * Authorization risk score, from 0 to 99, where 99 is the riskiest.
                 */
                fun networkRiskScore(networkRiskScore: Long) =
                    networkRiskScore(networkRiskScore as Long?)

                /**
                 * The risk score generated by the card network. For Visa this is the Visa Advanced
                 * Authorization risk score, from 0 to 99, where 99 is the riskiest.
                 */
                @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
                fun networkRiskScore(networkRiskScore: Optional<Long>) =
                    networkRiskScore(networkRiskScore.orElse(null) as Long?)

                /**
                 * The risk score generated by the card network. For Visa this is the Visa Advanced
                 * Authorization risk score, from 0 to 99, where 99 is the riskiest.
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
                 * If the authorization was made in-person with a physical card, the Physical Card
                 * that was used.
                 */
                fun physicalCardId(physicalCardId: Optional<String>) =
                    physicalCardId(physicalCardId.orElse(null))

                /**
                 * If the authorization was made in-person with a physical card, the Physical Card
                 * that was used.
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
                 * The declined amount in the minor unit of the transaction's presentment currency.
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
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
                 * presentment currency.
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
                 * The processing category describes the intent behind the authorization, such as
                 * whether it was used for bill payments or an automatic fuel dispenser.
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
                 * The identifier of the Real-Time Decision sent to approve or decline this
                 * transaction.
                 */
                fun realTimeDecisionId(realTimeDecisionId: Optional<String>) =
                    realTimeDecisionId(realTimeDecisionId.orElse(null))

                /**
                 * The identifier of the Real-Time Decision sent to approve or decline this
                 * transaction.
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
                 * This is present if a specific decline reason was given in the real-time decision.
                 */
                fun realTimeDecisionReason(
                    realTimeDecisionReason: Optional<RealTimeDecisionReason>
                ) = realTimeDecisionReason(realTimeDecisionReason.orElse(null))

                /**
                 * This is present if a specific decline reason was given in the real-time decision.
                 */
                fun realTimeDecisionReason(
                    realTimeDecisionReason: JsonField<RealTimeDecisionReason>
                ) = apply { this.realTimeDecisionReason = realTimeDecisionReason }

                /** Why the transaction was declined. */
                fun reason(reason: Reason) = reason(JsonField.of(reason))

                /** Why the transaction was declined. */
                fun reason(reason: JsonField<Reason>) = apply { this.reason = reason }

                /**
                 * The terminal identifier (commonly abbreviated as TID) of the terminal the card is
                 * transacting with.
                 */
                fun terminalId(terminalId: String?) = terminalId(JsonField.ofNullable(terminalId))

                /**
                 * The terminal identifier (commonly abbreviated as TID) of the terminal the card is
                 * transacting with.
                 */
                fun terminalId(terminalId: Optional<String>) = terminalId(terminalId.orElse(null))

                /**
                 * The terminal identifier (commonly abbreviated as TID) of the terminal the card is
                 * transacting with.
                 */
                fun terminalId(terminalId: JsonField<String>) = apply {
                    this.terminalId = terminalId
                }

                /** Fields related to verification of cardholder-provided values. */
                fun verification(verification: Verification) =
                    verification(JsonField.of(verification))

                /** Fields related to verification of cardholder-provided values. */
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

                fun build(): CardDecline =
                    CardDecline(
                        checkRequired("id", id),
                        checkRequired("actioner", actioner),
                        checkRequired("amount", amount),
                        checkRequired("cardPaymentId", cardPaymentId),
                        checkRequired("currency", currency),
                        checkRequired("declinedTransactionId", declinedTransactionId),
                        checkRequired("digitalWalletTokenId", digitalWalletTokenId),
                        checkRequired("direction", direction),
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
                        additionalProperties.toImmutable(),
                    )
            }

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
            @NoAutoDetect
            class NetworkDetails
            @JsonCreator
            private constructor(
                @JsonProperty("category")
                @ExcludeMissing
                private val category: JsonField<Category> = JsonMissing.of(),
                @JsonProperty("visa")
                @ExcludeMissing
                private val visa: JsonField<Visa> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /** The payment network used to process this card authorization. */
                fun category(): Category = category.getRequired("category")

                /** Fields specific to the `visa` network. */
                fun visa(): Optional<Visa> = Optional.ofNullable(visa.getNullable("visa"))

                /** The payment network used to process this card authorization. */
                @JsonProperty("category")
                @ExcludeMissing
                fun _category(): JsonField<Category> = category

                /** Fields specific to the `visa` network. */
                @JsonProperty("visa") @ExcludeMissing fun _visa(): JsonField<Visa> = visa

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): NetworkDetails = apply {
                    if (validated) {
                        return@apply
                    }

                    category()
                    visa().ifPresent { it.validate() }
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

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

                    /** The payment network used to process this card authorization. */
                    fun category(category: JsonField<Category>) = apply { this.category = category }

                    /** Fields specific to the `visa` network. */
                    fun visa(visa: Visa?) = visa(JsonField.ofNullable(visa))

                    /** Fields specific to the `visa` network. */
                    fun visa(visa: Optional<Visa>) = visa(visa.orElse(null))

                    /** Fields specific to the `visa` network. */
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

                    fun build(): NetworkDetails =
                        NetworkDetails(
                            checkRequired("category", category),
                            checkRequired("visa", visa),
                            additionalProperties.toImmutable(),
                        )
                }

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
                @NoAutoDetect
                class Visa
                @JsonCreator
                private constructor(
                    @JsonProperty("electronic_commerce_indicator")
                    @ExcludeMissing
                    private val electronicCommerceIndicator:
                        JsonField<ElectronicCommerceIndicator> =
                        JsonMissing.of(),
                    @JsonProperty("point_of_service_entry_mode")
                    @ExcludeMissing
                    private val pointOfServiceEntryMode: JsonField<PointOfServiceEntryMode> =
                        JsonMissing.of(),
                    @JsonProperty("stand_in_processing_reason")
                    @ExcludeMissing
                    private val standInProcessingReason: JsonField<StandInProcessingReason> =
                        JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    /**
                     * For electronic commerce transactions, this identifies the level of security
                     * used in obtaining the customer's payment credential. For mail or telephone
                     * order transactions, identifies the type of mail or telephone order.
                     */
                    fun electronicCommerceIndicator(): Optional<ElectronicCommerceIndicator> =
                        Optional.ofNullable(
                            electronicCommerceIndicator.getNullable("electronic_commerce_indicator")
                        )

                    /**
                     * The method used to enter the cardholder's primary account number and card
                     * expiration date.
                     */
                    fun pointOfServiceEntryMode(): Optional<PointOfServiceEntryMode> =
                        Optional.ofNullable(
                            pointOfServiceEntryMode.getNullable("point_of_service_entry_mode")
                        )

                    /**
                     * Only present when `actioner: network`. Describes why a card authorization was
                     * approved or declined by Visa through stand-in processing.
                     */
                    fun standInProcessingReason(): Optional<StandInProcessingReason> =
                        Optional.ofNullable(
                            standInProcessingReason.getNullable("stand_in_processing_reason")
                        )

                    /**
                     * For electronic commerce transactions, this identifies the level of security
                     * used in obtaining the customer's payment credential. For mail or telephone
                     * order transactions, identifies the type of mail or telephone order.
                     */
                    @JsonProperty("electronic_commerce_indicator")
                    @ExcludeMissing
                    fun _electronicCommerceIndicator(): JsonField<ElectronicCommerceIndicator> =
                        electronicCommerceIndicator

                    /**
                     * The method used to enter the cardholder's primary account number and card
                     * expiration date.
                     */
                    @JsonProperty("point_of_service_entry_mode")
                    @ExcludeMissing
                    fun _pointOfServiceEntryMode(): JsonField<PointOfServiceEntryMode> =
                        pointOfServiceEntryMode

                    /**
                     * Only present when `actioner: network`. Describes why a card authorization was
                     * approved or declined by Visa through stand-in processing.
                     */
                    @JsonProperty("stand_in_processing_reason")
                    @ExcludeMissing
                    fun _standInProcessingReason(): JsonField<StandInProcessingReason> =
                        standInProcessingReason

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): Visa = apply {
                        if (validated) {
                            return@apply
                        }

                        electronicCommerceIndicator()
                        pointOfServiceEntryMode()
                        standInProcessingReason()
                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

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
                         * For electronic commerce transactions, this identifies the level of
                         * security used in obtaining the customer's payment credential. For mail or
                         * telephone order transactions, identifies the type of mail or telephone
                         * order.
                         */
                        fun electronicCommerceIndicator(
                            electronicCommerceIndicator: Optional<ElectronicCommerceIndicator>
                        ) = electronicCommerceIndicator(electronicCommerceIndicator.orElse(null))

                        /**
                         * For electronic commerce transactions, this identifies the level of
                         * security used in obtaining the customer's payment credential. For mail or
                         * telephone order transactions, identifies the type of mail or telephone
                         * order.
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
                         * The method used to enter the cardholder's primary account number and card
                         * expiration date.
                         */
                        fun pointOfServiceEntryMode(
                            pointOfServiceEntryMode: Optional<PointOfServiceEntryMode>
                        ) = pointOfServiceEntryMode(pointOfServiceEntryMode.orElse(null))

                        /**
                         * The method used to enter the cardholder's primary account number and card
                         * expiration date.
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
                         * Only present when `actioner: network`. Describes why a card authorization
                         * was approved or declined by Visa through stand-in processing.
                         */
                        fun standInProcessingReason(
                            standInProcessingReason: Optional<StandInProcessingReason>
                        ) = standInProcessingReason(standInProcessingReason.orElse(null))

                        /**
                         * Only present when `actioner: network`. Describes why a card authorization
                         * was approved or declined by Visa through stand-in processing.
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

                        fun build(): Visa =
                            Visa(
                                checkRequired(
                                    "electronicCommerceIndicator",
                                    electronicCommerceIndicator,
                                ),
                                checkRequired("pointOfServiceEntryMode", pointOfServiceEntryMode),
                                checkRequired("standInProcessingReason", standInProcessingReason),
                                additionalProperties.toImmutable(),
                            )
                    }

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
            @NoAutoDetect
            class NetworkIdentifiers
            @JsonCreator
            private constructor(
                @JsonProperty("retrieval_reference_number")
                @ExcludeMissing
                private val retrievalReferenceNumber: JsonField<String> = JsonMissing.of(),
                @JsonProperty("trace_number")
                @ExcludeMissing
                private val traceNumber: JsonField<String> = JsonMissing.of(),
                @JsonProperty("transaction_id")
                @ExcludeMissing
                private val transactionId: JsonField<String> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /**
                 * A life-cycle identifier used across e.g., an authorization and a reversal.
                 * Expected to be unique per acquirer within a window of time. For some card
                 * networks the retrieval reference number includes the trace counter.
                 */
                fun retrievalReferenceNumber(): Optional<String> =
                    Optional.ofNullable(
                        retrievalReferenceNumber.getNullable("retrieval_reference_number")
                    )

                /**
                 * A counter used to verify an individual authorization. Expected to be unique per
                 * acquirer within a window of time.
                 */
                fun traceNumber(): Optional<String> =
                    Optional.ofNullable(traceNumber.getNullable("trace_number"))

                /**
                 * A globally unique transaction identifier provided by the card network, used
                 * across multiple life-cycle requests.
                 */
                fun transactionId(): Optional<String> =
                    Optional.ofNullable(transactionId.getNullable("transaction_id"))

                /**
                 * A life-cycle identifier used across e.g., an authorization and a reversal.
                 * Expected to be unique per acquirer within a window of time. For some card
                 * networks the retrieval reference number includes the trace counter.
                 */
                @JsonProperty("retrieval_reference_number")
                @ExcludeMissing
                fun _retrievalReferenceNumber(): JsonField<String> = retrievalReferenceNumber

                /**
                 * A counter used to verify an individual authorization. Expected to be unique per
                 * acquirer within a window of time.
                 */
                @JsonProperty("trace_number")
                @ExcludeMissing
                fun _traceNumber(): JsonField<String> = traceNumber

                /**
                 * A globally unique transaction identifier provided by the card network, used
                 * across multiple life-cycle requests.
                 */
                @JsonProperty("transaction_id")
                @ExcludeMissing
                fun _transactionId(): JsonField<String> = transactionId

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

                fun toBuilder() = Builder().from(this)

                companion object {

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
                     * A life-cycle identifier used across e.g., an authorization and a reversal.
                     * Expected to be unique per acquirer within a window of time. For some card
                     * networks the retrieval reference number includes the trace counter.
                     */
                    fun retrievalReferenceNumber(retrievalReferenceNumber: Optional<String>) =
                        retrievalReferenceNumber(retrievalReferenceNumber.orElse(null))

                    /**
                     * A life-cycle identifier used across e.g., an authorization and a reversal.
                     * Expected to be unique per acquirer within a window of time. For some card
                     * networks the retrieval reference number includes the trace counter.
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

                    /**
                     * A counter used to verify an individual authorization. Expected to be unique
                     * per acquirer within a window of time.
                     */
                    fun traceNumber(traceNumber: Optional<String>) =
                        traceNumber(traceNumber.orElse(null))

                    /**
                     * A counter used to verify an individual authorization. Expected to be unique
                     * per acquirer within a window of time.
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
                     * A globally unique transaction identifier provided by the card network, used
                     * across multiple life-cycle requests.
                     */
                    fun transactionId(transactionId: Optional<String>) =
                        transactionId(transactionId.orElse(null))

                    /**
                     * A globally unique transaction identifier provided by the card network, used
                     * across multiple life-cycle requests.
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

                    fun build(): NetworkIdentifiers =
                        NetworkIdentifiers(
                            checkRequired("retrievalReferenceNumber", retrievalReferenceNumber),
                            checkRequired("traceNumber", traceNumber),
                            checkRequired("transactionId", transactionId),
                            additionalProperties.toImmutable(),
                        )
                }

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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is ProcessingCategory && value == other.value /* spotless:on */
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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is RealTimeDecisionReason && value == other.value /* spotless:on */
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

                    /** The Card was not active. */
                    @JvmField val CARD_NOT_ACTIVE = of("card_not_active")

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

                    /**
                     * The transaction was suspected to be fraudulent. Please reach out to
                     * support@increase.com for more information.
                     */
                    @JvmField val SUSPECTED_FRAUD = of("suspected_fraud")

                    @JvmStatic fun of(value: String) = Reason(JsonField.of(value))
                }

                /** An enum containing [Reason]'s known values. */
                enum class Known {
                    /** The Card was not active. */
                    CARD_NOT_ACTIVE,
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
                    /** The Card was not active. */
                    CARD_NOT_ACTIVE,
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
                        CARD_NOT_ACTIVE -> Value.CARD_NOT_ACTIVE
                        PHYSICAL_CARD_NOT_ACTIVE -> Value.PHYSICAL_CARD_NOT_ACTIVE
                        ENTITY_NOT_ACTIVE -> Value.ENTITY_NOT_ACTIVE
                        GROUP_LOCKED -> Value.GROUP_LOCKED
                        INSUFFICIENT_FUNDS -> Value.INSUFFICIENT_FUNDS
                        CVV2_MISMATCH -> Value.CVV2_MISMATCH
                        CARD_EXPIRATION_MISMATCH -> Value.CARD_EXPIRATION_MISMATCH
                        TRANSACTION_NOT_ALLOWED -> Value.TRANSACTION_NOT_ALLOWED
                        BREACHES_LIMIT -> Value.BREACHES_LIMIT
                        WEBHOOK_DECLINED -> Value.WEBHOOK_DECLINED
                        WEBHOOK_TIMED_OUT -> Value.WEBHOOK_TIMED_OUT
                        DECLINED_BY_STAND_IN_PROCESSING -> Value.DECLINED_BY_STAND_IN_PROCESSING
                        INVALID_PHYSICAL_CARD -> Value.INVALID_PHYSICAL_CARD
                        MISSING_ORIGINAL_AUTHORIZATION -> Value.MISSING_ORIGINAL_AUTHORIZATION
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
                        CARD_NOT_ACTIVE -> Known.CARD_NOT_ACTIVE
                        PHYSICAL_CARD_NOT_ACTIVE -> Known.PHYSICAL_CARD_NOT_ACTIVE
                        ENTITY_NOT_ACTIVE -> Known.ENTITY_NOT_ACTIVE
                        GROUP_LOCKED -> Known.GROUP_LOCKED
                        INSUFFICIENT_FUNDS -> Known.INSUFFICIENT_FUNDS
                        CVV2_MISMATCH -> Known.CVV2_MISMATCH
                        CARD_EXPIRATION_MISMATCH -> Known.CARD_EXPIRATION_MISMATCH
                        TRANSACTION_NOT_ALLOWED -> Known.TRANSACTION_NOT_ALLOWED
                        BREACHES_LIMIT -> Known.BREACHES_LIMIT
                        WEBHOOK_DECLINED -> Known.WEBHOOK_DECLINED
                        WEBHOOK_TIMED_OUT -> Known.WEBHOOK_TIMED_OUT
                        DECLINED_BY_STAND_IN_PROCESSING -> Known.DECLINED_BY_STAND_IN_PROCESSING
                        INVALID_PHYSICAL_CARD -> Known.INVALID_PHYSICAL_CARD
                        MISSING_ORIGINAL_AUTHORIZATION -> Known.MISSING_ORIGINAL_AUTHORIZATION
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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Reason && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** Fields related to verification of cardholder-provided values. */
            @NoAutoDetect
            class Verification
            @JsonCreator
            private constructor(
                @JsonProperty("card_verification_code")
                @ExcludeMissing
                private val cardVerificationCode: JsonField<CardVerificationCode> =
                    JsonMissing.of(),
                @JsonProperty("cardholder_address")
                @ExcludeMissing
                private val cardholderAddress: JsonField<CardholderAddress> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /**
                 * Fields related to verification of the Card Verification Code, a 3-digit code on
                 * the back of the card.
                 */
                fun cardVerificationCode(): CardVerificationCode =
                    cardVerificationCode.getRequired("card_verification_code")

                /**
                 * Cardholder address provided in the authorization request and the address on file
                 * we verified it against.
                 */
                fun cardholderAddress(): CardholderAddress =
                    cardholderAddress.getRequired("cardholder_address")

                /**
                 * Fields related to verification of the Card Verification Code, a 3-digit code on
                 * the back of the card.
                 */
                @JsonProperty("card_verification_code")
                @ExcludeMissing
                fun _cardVerificationCode(): JsonField<CardVerificationCode> = cardVerificationCode

                /**
                 * Cardholder address provided in the authorization request and the address on file
                 * we verified it against.
                 */
                @JsonProperty("cardholder_address")
                @ExcludeMissing
                fun _cardholderAddress(): JsonField<CardholderAddress> = cardholderAddress

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): Verification = apply {
                    if (validated) {
                        return@apply
                    }

                    cardVerificationCode().validate()
                    cardholderAddress().validate()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

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
                     * Fields related to verification of the Card Verification Code, a 3-digit code
                     * on the back of the card.
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
                     * Cardholder address provided in the authorization request and the address on
                     * file we verified it against.
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

                    fun build(): Verification =
                        Verification(
                            checkRequired("cardVerificationCode", cardVerificationCode),
                            checkRequired("cardholderAddress", cardholderAddress),
                            additionalProperties.toImmutable(),
                        )
                }

                /**
                 * Fields related to verification of the Card Verification Code, a 3-digit code on
                 * the back of the card.
                 */
                @NoAutoDetect
                class CardVerificationCode
                @JsonCreator
                private constructor(
                    @JsonProperty("result")
                    @ExcludeMissing
                    private val result: JsonField<Result> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    /** The result of verifying the Card Verification Code. */
                    fun result(): Result = result.getRequired("result")

                    /** The result of verifying the Card Verification Code. */
                    @JsonProperty("result")
                    @ExcludeMissing
                    fun _result(): JsonField<Result> = result

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): CardVerificationCode = apply {
                        if (validated) {
                            return@apply
                        }

                        result()
                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

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

                        /** The result of verifying the Card Verification Code. */
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

                        fun build(): CardVerificationCode =
                            CardVerificationCode(
                                checkRequired("result", result),
                                additionalProperties.toImmutable(),
                            )
                    }

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
                @NoAutoDetect
                class CardholderAddress
                @JsonCreator
                private constructor(
                    @JsonProperty("actual_line1")
                    @ExcludeMissing
                    private val actualLine1: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("actual_postal_code")
                    @ExcludeMissing
                    private val actualPostalCode: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("provided_line1")
                    @ExcludeMissing
                    private val providedLine1: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("provided_postal_code")
                    @ExcludeMissing
                    private val providedPostalCode: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("result")
                    @ExcludeMissing
                    private val result: JsonField<Result> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    /** Line 1 of the address on file for the cardholder. */
                    fun actualLine1(): Optional<String> =
                        Optional.ofNullable(actualLine1.getNullable("actual_line1"))

                    /** The postal code of the address on file for the cardholder. */
                    fun actualPostalCode(): Optional<String> =
                        Optional.ofNullable(actualPostalCode.getNullable("actual_postal_code"))

                    /**
                     * The cardholder address line 1 provided for verification in the authorization
                     * request.
                     */
                    fun providedLine1(): Optional<String> =
                        Optional.ofNullable(providedLine1.getNullable("provided_line1"))

                    /** The postal code provided for verification in the authorization request. */
                    fun providedPostalCode(): Optional<String> =
                        Optional.ofNullable(providedPostalCode.getNullable("provided_postal_code"))

                    /** The address verification result returned to the card network. */
                    fun result(): Result = result.getRequired("result")

                    /** Line 1 of the address on file for the cardholder. */
                    @JsonProperty("actual_line1")
                    @ExcludeMissing
                    fun _actualLine1(): JsonField<String> = actualLine1

                    /** The postal code of the address on file for the cardholder. */
                    @JsonProperty("actual_postal_code")
                    @ExcludeMissing
                    fun _actualPostalCode(): JsonField<String> = actualPostalCode

                    /**
                     * The cardholder address line 1 provided for verification in the authorization
                     * request.
                     */
                    @JsonProperty("provided_line1")
                    @ExcludeMissing
                    fun _providedLine1(): JsonField<String> = providedLine1

                    /** The postal code provided for verification in the authorization request. */
                    @JsonProperty("provided_postal_code")
                    @ExcludeMissing
                    fun _providedPostalCode(): JsonField<String> = providedPostalCode

                    /** The address verification result returned to the card network. */
                    @JsonProperty("result")
                    @ExcludeMissing
                    fun _result(): JsonField<Result> = result

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): CardholderAddress = apply {
                        if (validated) {
                            return@apply
                        }

                        actualLine1()
                        actualPostalCode()
                        providedLine1()
                        providedPostalCode()
                        result()
                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

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

                        /** Line 1 of the address on file for the cardholder. */
                        fun actualLine1(actualLine1: Optional<String>) =
                            actualLine1(actualLine1.orElse(null))

                        /** Line 1 of the address on file for the cardholder. */
                        fun actualLine1(actualLine1: JsonField<String>) = apply {
                            this.actualLine1 = actualLine1
                        }

                        /** The postal code of the address on file for the cardholder. */
                        fun actualPostalCode(actualPostalCode: String?) =
                            actualPostalCode(JsonField.ofNullable(actualPostalCode))

                        /** The postal code of the address on file for the cardholder. */
                        fun actualPostalCode(actualPostalCode: Optional<String>) =
                            actualPostalCode(actualPostalCode.orElse(null))

                        /** The postal code of the address on file for the cardholder. */
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
                         * The cardholder address line 1 provided for verification in the
                         * authorization request.
                         */
                        fun providedLine1(providedLine1: Optional<String>) =
                            providedLine1(providedLine1.orElse(null))

                        /**
                         * The cardholder address line 1 provided for verification in the
                         * authorization request.
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
                         * The postal code provided for verification in the authorization request.
                         */
                        fun providedPostalCode(providedPostalCode: Optional<String>) =
                            providedPostalCode(providedPostalCode.orElse(null))

                        /**
                         * The postal code provided for verification in the authorization request.
                         */
                        fun providedPostalCode(providedPostalCode: JsonField<String>) = apply {
                            this.providedPostalCode = providedPostalCode
                        }

                        /** The address verification result returned to the card network. */
                        fun result(result: Result) = result(JsonField.of(result))

                        /** The address verification result returned to the card network. */
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

                        fun build(): CardholderAddress =
                            CardholderAddress(
                                checkRequired("actualLine1", actualLine1),
                                checkRequired("actualPostalCode", actualPostalCode),
                                checkRequired("providedLine1", providedLine1),
                                checkRequired("providedPostalCode", providedPostalCode),
                                checkRequired("result", result),
                                additionalProperties.toImmutable(),
                            )
                    }

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

                            /** No adress was provided in the authorization request. */
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
                            /** No adress was provided in the authorization request. */
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
                            /** No adress was provided in the authorization request. */
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

                return /* spotless:off */ other is CardDecline && id == other.id && actioner == other.actioner && amount == other.amount && cardPaymentId == other.cardPaymentId && currency == other.currency && declinedTransactionId == other.declinedTransactionId && digitalWalletTokenId == other.digitalWalletTokenId && direction == other.direction && merchantAcceptorId == other.merchantAcceptorId && merchantCategoryCode == other.merchantCategoryCode && merchantCity == other.merchantCity && merchantCountry == other.merchantCountry && merchantDescriptor == other.merchantDescriptor && merchantPostalCode == other.merchantPostalCode && merchantState == other.merchantState && networkDetails == other.networkDetails && networkIdentifiers == other.networkIdentifiers && networkRiskScore == other.networkRiskScore && physicalCardId == other.physicalCardId && presentmentAmount == other.presentmentAmount && presentmentCurrency == other.presentmentCurrency && processingCategory == other.processingCategory && realTimeDecisionId == other.realTimeDecisionId && realTimeDecisionReason == other.realTimeDecisionReason && reason == other.reason && terminalId == other.terminalId && verification == other.verification && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, actioner, amount, cardPaymentId, currency, declinedTransactionId, digitalWalletTokenId, direction, merchantAcceptorId, merchantCategoryCode, merchantCity, merchantCountry, merchantDescriptor, merchantPostalCode, merchantState, networkDetails, networkIdentifiers, networkRiskScore, physicalCardId, presentmentAmount, presentmentCurrency, processingCategory, realTimeDecisionId, realTimeDecisionReason, reason, terminalId, verification, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CardDecline{id=$id, actioner=$actioner, amount=$amount, cardPaymentId=$cardPaymentId, currency=$currency, declinedTransactionId=$declinedTransactionId, digitalWalletTokenId=$digitalWalletTokenId, direction=$direction, merchantAcceptorId=$merchantAcceptorId, merchantCategoryCode=$merchantCategoryCode, merchantCity=$merchantCity, merchantCountry=$merchantCountry, merchantDescriptor=$merchantDescriptor, merchantPostalCode=$merchantPostalCode, merchantState=$merchantState, networkDetails=$networkDetails, networkIdentifiers=$networkIdentifiers, networkRiskScore=$networkRiskScore, physicalCardId=$physicalCardId, presentmentAmount=$presentmentAmount, presentmentCurrency=$presentmentCurrency, processingCategory=$processingCategory, realTimeDecisionId=$realTimeDecisionId, realTimeDecisionReason=$realTimeDecisionReason, reason=$reason, terminalId=$terminalId, verification=$verification, additionalProperties=$additionalProperties}"
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
         * A Check Decline object. This field will be present in the JSON response if and only if
         * `category` is equal to `check_decline`.
         */
        @NoAutoDetect
        class CheckDecline
        @JsonCreator
        private constructor(
            @JsonProperty("amount")
            @ExcludeMissing
            private val amount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("auxiliary_on_us")
            @ExcludeMissing
            private val auxiliaryOnUs: JsonField<String> = JsonMissing.of(),
            @JsonProperty("back_image_file_id")
            @ExcludeMissing
            private val backImageFileId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("check_transfer_id")
            @ExcludeMissing
            private val checkTransferId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("front_image_file_id")
            @ExcludeMissing
            private val frontImageFileId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("inbound_check_deposit_id")
            @ExcludeMissing
            private val inboundCheckDepositId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("reason")
            @ExcludeMissing
            private val reason: JsonField<Reason> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The declined amount in USD cents. */
            fun amount(): Long = amount.getRequired("amount")

            /**
             * A computer-readable number printed on the MICR line of business checks, usually the
             * check number. This is useful for positive pay checks, but can be unreliably
             * transmitted by the bank of first deposit.
             */
            fun auxiliaryOnUs(): Optional<String> =
                Optional.ofNullable(auxiliaryOnUs.getNullable("auxiliary_on_us"))

            /**
             * The identifier of the API File object containing an image of the back of the declined
             * check.
             */
            fun backImageFileId(): Optional<String> =
                Optional.ofNullable(backImageFileId.getNullable("back_image_file_id"))

            /** The identifier of the Check Transfer object associated with this decline. */
            fun checkTransferId(): Optional<String> =
                Optional.ofNullable(checkTransferId.getNullable("check_transfer_id"))

            /**
             * The identifier of the API File object containing an image of the front of the
             * declined check.
             */
            fun frontImageFileId(): Optional<String> =
                Optional.ofNullable(frontImageFileId.getNullable("front_image_file_id"))

            /** The identifier of the Inbound Check Deposit object associated with this decline. */
            fun inboundCheckDepositId(): Optional<String> =
                Optional.ofNullable(inboundCheckDepositId.getNullable("inbound_check_deposit_id"))

            /** Why the check was declined. */
            fun reason(): Reason = reason.getRequired("reason")

            /** The declined amount in USD cents. */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

            /**
             * A computer-readable number printed on the MICR line of business checks, usually the
             * check number. This is useful for positive pay checks, but can be unreliably
             * transmitted by the bank of first deposit.
             */
            @JsonProperty("auxiliary_on_us")
            @ExcludeMissing
            fun _auxiliaryOnUs(): JsonField<String> = auxiliaryOnUs

            /**
             * The identifier of the API File object containing an image of the back of the declined
             * check.
             */
            @JsonProperty("back_image_file_id")
            @ExcludeMissing
            fun _backImageFileId(): JsonField<String> = backImageFileId

            /** The identifier of the Check Transfer object associated with this decline. */
            @JsonProperty("check_transfer_id")
            @ExcludeMissing
            fun _checkTransferId(): JsonField<String> = checkTransferId

            /**
             * The identifier of the API File object containing an image of the front of the
             * declined check.
             */
            @JsonProperty("front_image_file_id")
            @ExcludeMissing
            fun _frontImageFileId(): JsonField<String> = frontImageFileId

            /** The identifier of the Inbound Check Deposit object associated with this decline. */
            @JsonProperty("inbound_check_deposit_id")
            @ExcludeMissing
            fun _inboundCheckDepositId(): JsonField<String> = inboundCheckDepositId

            /** Why the check was declined. */
            @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<Reason> = reason

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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
                reason()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

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

                /** The declined amount in USD cents. */
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /**
                 * A computer-readable number printed on the MICR line of business checks, usually
                 * the check number. This is useful for positive pay checks, but can be unreliably
                 * transmitted by the bank of first deposit.
                 */
                fun auxiliaryOnUs(auxiliaryOnUs: String?) =
                    auxiliaryOnUs(JsonField.ofNullable(auxiliaryOnUs))

                /**
                 * A computer-readable number printed on the MICR line of business checks, usually
                 * the check number. This is useful for positive pay checks, but can be unreliably
                 * transmitted by the bank of first deposit.
                 */
                fun auxiliaryOnUs(auxiliaryOnUs: Optional<String>) =
                    auxiliaryOnUs(auxiliaryOnUs.orElse(null))

                /**
                 * A computer-readable number printed on the MICR line of business checks, usually
                 * the check number. This is useful for positive pay checks, but can be unreliably
                 * transmitted by the bank of first deposit.
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
                 * The identifier of the API File object containing an image of the back of the
                 * declined check.
                 */
                fun backImageFileId(backImageFileId: Optional<String>) =
                    backImageFileId(backImageFileId.orElse(null))

                /**
                 * The identifier of the API File object containing an image of the back of the
                 * declined check.
                 */
                fun backImageFileId(backImageFileId: JsonField<String>) = apply {
                    this.backImageFileId = backImageFileId
                }

                /** The identifier of the Check Transfer object associated with this decline. */
                fun checkTransferId(checkTransferId: String?) =
                    checkTransferId(JsonField.ofNullable(checkTransferId))

                /** The identifier of the Check Transfer object associated with this decline. */
                fun checkTransferId(checkTransferId: Optional<String>) =
                    checkTransferId(checkTransferId.orElse(null))

                /** The identifier of the Check Transfer object associated with this decline. */
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
                 * The identifier of the API File object containing an image of the front of the
                 * declined check.
                 */
                fun frontImageFileId(frontImageFileId: Optional<String>) =
                    frontImageFileId(frontImageFileId.orElse(null))

                /**
                 * The identifier of the API File object containing an image of the front of the
                 * declined check.
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
                 * The identifier of the Inbound Check Deposit object associated with this decline.
                 */
                fun inboundCheckDepositId(inboundCheckDepositId: Optional<String>) =
                    inboundCheckDepositId(inboundCheckDepositId.orElse(null))

                /**
                 * The identifier of the Inbound Check Deposit object associated with this decline.
                 */
                fun inboundCheckDepositId(inboundCheckDepositId: JsonField<String>) = apply {
                    this.inboundCheckDepositId = inboundCheckDepositId
                }

                /** Why the check was declined. */
                fun reason(reason: Reason) = reason(JsonField.of(reason))

                /** Why the check was declined. */
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

                fun build(): CheckDecline =
                    CheckDecline(
                        checkRequired("amount", amount),
                        checkRequired("auxiliaryOnUs", auxiliaryOnUs),
                        checkRequired("backImageFileId", backImageFileId),
                        checkRequired("checkTransferId", checkTransferId),
                        checkRequired("frontImageFileId", frontImageFileId),
                        checkRequired("inboundCheckDepositId", inboundCheckDepositId),
                        checkRequired("reason", reason),
                        additionalProperties.toImmutable(),
                    )
            }

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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Reason && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is CheckDecline && amount == other.amount && auxiliaryOnUs == other.auxiliaryOnUs && backImageFileId == other.backImageFileId && checkTransferId == other.checkTransferId && frontImageFileId == other.frontImageFileId && inboundCheckDepositId == other.inboundCheckDepositId && reason == other.reason && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(amount, auxiliaryOnUs, backImageFileId, checkTransferId, frontImageFileId, inboundCheckDepositId, reason, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CheckDecline{amount=$amount, auxiliaryOnUs=$auxiliaryOnUs, backImageFileId=$backImageFileId, checkTransferId=$checkTransferId, frontImageFileId=$frontImageFileId, inboundCheckDepositId=$inboundCheckDepositId, reason=$reason, additionalProperties=$additionalProperties}"
        }

        /**
         * A Check Deposit Rejection object. This field will be present in the JSON response if and
         * only if `category` is equal to `check_deposit_rejection`.
         */
        @NoAutoDetect
        class CheckDepositRejection
        @JsonCreator
        private constructor(
            @JsonProperty("amount")
            @ExcludeMissing
            private val amount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("check_deposit_id")
            @ExcludeMissing
            private val checkDepositId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("currency")
            @ExcludeMissing
            private val currency: JsonField<Currency> = JsonMissing.of(),
            @JsonProperty("declined_transaction_id")
            @ExcludeMissing
            private val declinedTransactionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("reason")
            @ExcludeMissing
            private val reason: JsonField<Reason> = JsonMissing.of(),
            @JsonProperty("rejected_at")
            @ExcludeMissing
            private val rejectedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /**
             * The rejected amount in the minor unit of check's currency. For dollars, for example,
             * this is cents.
             */
            fun amount(): Long = amount.getRequired("amount")

            /** The identifier of the Check Deposit that was rejected. */
            fun checkDepositId(): String = checkDepositId.getRequired("check_deposit_id")

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the check's currency.
             */
            fun currency(): Currency = currency.getRequired("currency")

            /** The identifier of the associated declined transaction. */
            fun declinedTransactionId(): String =
                declinedTransactionId.getRequired("declined_transaction_id")

            /** Why the check deposit was rejected. */
            fun reason(): Reason = reason.getRequired("reason")

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * check deposit was rejected.
             */
            fun rejectedAt(): OffsetDateTime = rejectedAt.getRequired("rejected_at")

            /**
             * The rejected amount in the minor unit of check's currency. For dollars, for example,
             * this is cents.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

            /** The identifier of the Check Deposit that was rejected. */
            @JsonProperty("check_deposit_id")
            @ExcludeMissing
            fun _checkDepositId(): JsonField<String> = checkDepositId

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the check's currency.
             */
            @JsonProperty("currency")
            @ExcludeMissing
            fun _currency(): JsonField<Currency> = currency

            /** The identifier of the associated declined transaction. */
            @JsonProperty("declined_transaction_id")
            @ExcludeMissing
            fun _declinedTransactionId(): JsonField<String> = declinedTransactionId

            /** Why the check deposit was rejected. */
            @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<Reason> = reason

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * check deposit was rejected.
             */
            @JsonProperty("rejected_at")
            @ExcludeMissing
            fun _rejectedAt(): JsonField<OffsetDateTime> = rejectedAt

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): CheckDepositRejection = apply {
                if (validated) {
                    return@apply
                }

                amount()
                checkDepositId()
                currency()
                declinedTransactionId()
                reason()
                rejectedAt()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

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
                 * The rejected amount in the minor unit of check's currency. For dollars, for
                 * example, this is cents.
                 */
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /** The identifier of the Check Deposit that was rejected. */
                fun checkDepositId(checkDepositId: String) =
                    checkDepositId(JsonField.of(checkDepositId))

                /** The identifier of the Check Deposit that was rejected. */
                fun checkDepositId(checkDepositId: JsonField<String>) = apply {
                    this.checkDepositId = checkDepositId
                }

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the check's
                 * currency.
                 */
                fun currency(currency: Currency) = currency(JsonField.of(currency))

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the check's
                 * currency.
                 */
                fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                /** The identifier of the associated declined transaction. */
                fun declinedTransactionId(declinedTransactionId: String) =
                    declinedTransactionId(JsonField.of(declinedTransactionId))

                /** The identifier of the associated declined transaction. */
                fun declinedTransactionId(declinedTransactionId: JsonField<String>) = apply {
                    this.declinedTransactionId = declinedTransactionId
                }

                /** Why the check deposit was rejected. */
                fun reason(reason: Reason) = reason(JsonField.of(reason))

                /** Why the check deposit was rejected. */
                fun reason(reason: JsonField<Reason>) = apply { this.reason = reason }

                /**
                 * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
                 * check deposit was rejected.
                 */
                fun rejectedAt(rejectedAt: OffsetDateTime) = rejectedAt(JsonField.of(rejectedAt))

                /**
                 * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
                 * check deposit was rejected.
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

                fun build(): CheckDepositRejection =
                    CheckDepositRejection(
                        checkRequired("amount", amount),
                        checkRequired("checkDepositId", checkDepositId),
                        checkRequired("currency", currency),
                        checkRequired("declinedTransactionId", declinedTransactionId),
                        checkRequired("reason", reason),
                        checkRequired("rejectedAt", rejectedAt),
                        additionalProperties.toImmutable(),
                    )
            }

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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Currency && value == other.value /* spotless:on */
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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Reason && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is CheckDepositRejection && amount == other.amount && checkDepositId == other.checkDepositId && currency == other.currency && declinedTransactionId == other.declinedTransactionId && reason == other.reason && rejectedAt == other.rejectedAt && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(amount, checkDepositId, currency, declinedTransactionId, reason, rejectedAt, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CheckDepositRejection{amount=$amount, checkDepositId=$checkDepositId, currency=$currency, declinedTransactionId=$declinedTransactionId, reason=$reason, rejectedAt=$rejectedAt, additionalProperties=$additionalProperties}"
        }

        /**
         * An Inbound Real-Time Payments Transfer Decline object. This field will be present in the
         * JSON response if and only if `category` is equal to
         * `inbound_real_time_payments_transfer_decline`.
         */
        @NoAutoDetect
        class InboundRealTimePaymentsTransferDecline
        @JsonCreator
        private constructor(
            @JsonProperty("amount")
            @ExcludeMissing
            private val amount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("creditor_name")
            @ExcludeMissing
            private val creditorName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("currency")
            @ExcludeMissing
            private val currency: JsonField<Currency> = JsonMissing.of(),
            @JsonProperty("debtor_account_number")
            @ExcludeMissing
            private val debtorAccountNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("debtor_name")
            @ExcludeMissing
            private val debtorName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("debtor_routing_number")
            @ExcludeMissing
            private val debtorRoutingNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("reason")
            @ExcludeMissing
            private val reason: JsonField<Reason> = JsonMissing.of(),
            @JsonProperty("remittance_information")
            @ExcludeMissing
            private val remittanceInformation: JsonField<String> = JsonMissing.of(),
            @JsonProperty("transaction_identification")
            @ExcludeMissing
            private val transactionIdentification: JsonField<String> = JsonMissing.of(),
            @JsonProperty("transfer_id")
            @ExcludeMissing
            private val transferId: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /**
             * The declined amount in the minor unit of the destination account currency. For
             * dollars, for example, this is cents.
             */
            fun amount(): Long = amount.getRequired("amount")

            /** The name the sender of the transfer specified as the recipient of the transfer. */
            fun creditorName(): String = creditorName.getRequired("creditor_name")

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code of the declined
             * transfer's currency. This will always be "USD" for a Real-Time Payments transfer.
             */
            fun currency(): Currency = currency.getRequired("currency")

            /** The account number of the account that sent the transfer. */
            fun debtorAccountNumber(): String =
                debtorAccountNumber.getRequired("debtor_account_number")

            /** The name provided by the sender of the transfer. */
            fun debtorName(): String = debtorName.getRequired("debtor_name")

            /** The routing number of the account that sent the transfer. */
            fun debtorRoutingNumber(): String =
                debtorRoutingNumber.getRequired("debtor_routing_number")

            /** Why the transfer was declined. */
            fun reason(): Reason = reason.getRequired("reason")

            /** Additional information included with the transfer. */
            fun remittanceInformation(): Optional<String> =
                Optional.ofNullable(remittanceInformation.getNullable("remittance_information"))

            /** The Real-Time Payments network identification of the declined transfer. */
            fun transactionIdentification(): String =
                transactionIdentification.getRequired("transaction_identification")

            /** The identifier of the Real-Time Payments Transfer that led to this Transaction. */
            fun transferId(): String = transferId.getRequired("transfer_id")

            /**
             * The declined amount in the minor unit of the destination account currency. For
             * dollars, for example, this is cents.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

            /** The name the sender of the transfer specified as the recipient of the transfer. */
            @JsonProperty("creditor_name")
            @ExcludeMissing
            fun _creditorName(): JsonField<String> = creditorName

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code of the declined
             * transfer's currency. This will always be "USD" for a Real-Time Payments transfer.
             */
            @JsonProperty("currency")
            @ExcludeMissing
            fun _currency(): JsonField<Currency> = currency

            /** The account number of the account that sent the transfer. */
            @JsonProperty("debtor_account_number")
            @ExcludeMissing
            fun _debtorAccountNumber(): JsonField<String> = debtorAccountNumber

            /** The name provided by the sender of the transfer. */
            @JsonProperty("debtor_name")
            @ExcludeMissing
            fun _debtorName(): JsonField<String> = debtorName

            /** The routing number of the account that sent the transfer. */
            @JsonProperty("debtor_routing_number")
            @ExcludeMissing
            fun _debtorRoutingNumber(): JsonField<String> = debtorRoutingNumber

            /** Why the transfer was declined. */
            @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<Reason> = reason

            /** Additional information included with the transfer. */
            @JsonProperty("remittance_information")
            @ExcludeMissing
            fun _remittanceInformation(): JsonField<String> = remittanceInformation

            /** The Real-Time Payments network identification of the declined transfer. */
            @JsonProperty("transaction_identification")
            @ExcludeMissing
            fun _transactionIdentification(): JsonField<String> = transactionIdentification

            /** The identifier of the Real-Time Payments Transfer that led to this Transaction. */
            @JsonProperty("transfer_id")
            @ExcludeMissing
            fun _transferId(): JsonField<String> = transferId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): InboundRealTimePaymentsTransferDecline = apply {
                if (validated) {
                    return@apply
                }

                amount()
                creditorName()
                currency()
                debtorAccountNumber()
                debtorName()
                debtorRoutingNumber()
                reason()
                remittanceInformation()
                transactionIdentification()
                transferId()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

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
                 * The declined amount in the minor unit of the destination account currency. For
                 * dollars, for example, this is cents.
                 */
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /**
                 * The name the sender of the transfer specified as the recipient of the transfer.
                 */
                fun creditorName(creditorName: String) = creditorName(JsonField.of(creditorName))

                /**
                 * The name the sender of the transfer specified as the recipient of the transfer.
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
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code of the declined
                 * transfer's currency. This will always be "USD" for a Real-Time Payments transfer.
                 */
                fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                /** The account number of the account that sent the transfer. */
                fun debtorAccountNumber(debtorAccountNumber: String) =
                    debtorAccountNumber(JsonField.of(debtorAccountNumber))

                /** The account number of the account that sent the transfer. */
                fun debtorAccountNumber(debtorAccountNumber: JsonField<String>) = apply {
                    this.debtorAccountNumber = debtorAccountNumber
                }

                /** The name provided by the sender of the transfer. */
                fun debtorName(debtorName: String) = debtorName(JsonField.of(debtorName))

                /** The name provided by the sender of the transfer. */
                fun debtorName(debtorName: JsonField<String>) = apply {
                    this.debtorName = debtorName
                }

                /** The routing number of the account that sent the transfer. */
                fun debtorRoutingNumber(debtorRoutingNumber: String) =
                    debtorRoutingNumber(JsonField.of(debtorRoutingNumber))

                /** The routing number of the account that sent the transfer. */
                fun debtorRoutingNumber(debtorRoutingNumber: JsonField<String>) = apply {
                    this.debtorRoutingNumber = debtorRoutingNumber
                }

                /** Why the transfer was declined. */
                fun reason(reason: Reason) = reason(JsonField.of(reason))

                /** Why the transfer was declined. */
                fun reason(reason: JsonField<Reason>) = apply { this.reason = reason }

                /** Additional information included with the transfer. */
                fun remittanceInformation(remittanceInformation: String?) =
                    remittanceInformation(JsonField.ofNullable(remittanceInformation))

                /** Additional information included with the transfer. */
                fun remittanceInformation(remittanceInformation: Optional<String>) =
                    remittanceInformation(remittanceInformation.orElse(null))

                /** Additional information included with the transfer. */
                fun remittanceInformation(remittanceInformation: JsonField<String>) = apply {
                    this.remittanceInformation = remittanceInformation
                }

                /** The Real-Time Payments network identification of the declined transfer. */
                fun transactionIdentification(transactionIdentification: String) =
                    transactionIdentification(JsonField.of(transactionIdentification))

                /** The Real-Time Payments network identification of the declined transfer. */
                fun transactionIdentification(transactionIdentification: JsonField<String>) =
                    apply {
                        this.transactionIdentification = transactionIdentification
                    }

                /**
                 * The identifier of the Real-Time Payments Transfer that led to this Transaction.
                 */
                fun transferId(transferId: String) = transferId(JsonField.of(transferId))

                /**
                 * The identifier of the Real-Time Payments Transfer that led to this Transaction.
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
                        additionalProperties.toImmutable(),
                    )
            }

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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Currency && value == other.value /* spotless:on */
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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Reason && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is InboundRealTimePaymentsTransferDecline && amount == other.amount && creditorName == other.creditorName && currency == other.currency && debtorAccountNumber == other.debtorAccountNumber && debtorName == other.debtorName && debtorRoutingNumber == other.debtorRoutingNumber && reason == other.reason && remittanceInformation == other.remittanceInformation && transactionIdentification == other.transactionIdentification && transferId == other.transferId && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(amount, creditorName, currency, debtorAccountNumber, debtorName, debtorRoutingNumber, reason, remittanceInformation, transactionIdentification, transferId, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "InboundRealTimePaymentsTransferDecline{amount=$amount, creditorName=$creditorName, currency=$currency, debtorAccountNumber=$debtorAccountNumber, debtorName=$debtorName, debtorRoutingNumber=$debtorRoutingNumber, reason=$reason, remittanceInformation=$remittanceInformation, transactionIdentification=$transactionIdentification, transferId=$transferId, additionalProperties=$additionalProperties}"
        }

        /**
         * A Wire Decline object. This field will be present in the JSON response if and only if
         * `category` is equal to `wire_decline`.
         */
        @NoAutoDetect
        class WireDecline
        @JsonCreator
        private constructor(
            @JsonProperty("inbound_wire_transfer_id")
            @ExcludeMissing
            private val inboundWireTransferId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("reason")
            @ExcludeMissing
            private val reason: JsonField<Reason> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The identifier of the Inbound Wire Transfer that was declined. */
            fun inboundWireTransferId(): String =
                inboundWireTransferId.getRequired("inbound_wire_transfer_id")

            /** Why the wire transfer was declined. */
            fun reason(): Reason = reason.getRequired("reason")

            /** The identifier of the Inbound Wire Transfer that was declined. */
            @JsonProperty("inbound_wire_transfer_id")
            @ExcludeMissing
            fun _inboundWireTransferId(): JsonField<String> = inboundWireTransferId

            /** Why the wire transfer was declined. */
            @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<Reason> = reason

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): WireDecline = apply {
                if (validated) {
                    return@apply
                }

                inboundWireTransferId()
                reason()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

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

                /** The identifier of the Inbound Wire Transfer that was declined. */
                fun inboundWireTransferId(inboundWireTransferId: JsonField<String>) = apply {
                    this.inboundWireTransferId = inboundWireTransferId
                }

                /** Why the wire transfer was declined. */
                fun reason(reason: Reason) = reason(JsonField.of(reason))

                /** Why the wire transfer was declined. */
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

                fun build(): WireDecline =
                    WireDecline(
                        checkRequired("inboundWireTransferId", inboundWireTransferId),
                        checkRequired("reason", reason),
                        additionalProperties.toImmutable(),
                    )
            }

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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Reason && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is WireDecline && inboundWireTransferId == other.inboundWireTransferId && reason == other.reason && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(inboundWireTransferId, reason, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "WireDecline{inboundWireTransferId=$inboundWireTransferId, reason=$reason, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Source && achDecline == other.achDecline && cardDecline == other.cardDecline && category == other.category && checkDecline == other.checkDecline && checkDepositRejection == other.checkDepositRejection && inboundRealTimePaymentsTransferDecline == other.inboundRealTimePaymentsTransferDecline && this.other == other.other && wireDecline == other.wireDecline && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(achDecline, cardDecline, category, checkDecline, checkDepositRejection, inboundRealTimePaymentsTransferDecline, other, wireDecline, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Source{achDecline=$achDecline, cardDecline=$cardDecline, category=$category, checkDecline=$checkDecline, checkDepositRejection=$checkDepositRejection, inboundRealTimePaymentsTransferDecline=$inboundRealTimePaymentsTransferDecline, other=$other, wireDecline=$wireDecline, additionalProperties=$additionalProperties}"
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

        return /* spotless:off */ other is DeclinedTransaction && id == other.id && accountId == other.accountId && amount == other.amount && createdAt == other.createdAt && currency == other.currency && description == other.description && routeId == other.routeId && routeType == other.routeType && source == other.source && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, accountId, amount, createdAt, currency, description, routeId, routeType, source, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DeclinedTransaction{id=$id, accountId=$accountId, amount=$amount, createdAt=$createdAt, currency=$currency, description=$description, routeId=$routeId, routeType=$routeType, source=$source, type=$type, additionalProperties=$additionalProperties}"
}
