// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.increase.api.core.Enum
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
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
@JsonDeserialize(builder = DeclinedTransaction.Builder::class)
@NoAutoDetect
class DeclinedTransaction
private constructor(
    private val accountId: JsonField<String>,
    private val amount: JsonField<Long>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val currency: JsonField<Currency>,
    private val description: JsonField<String>,
    private val id: JsonField<String>,
    private val routeId: JsonField<String>,
    private val routeType: JsonField<RouteType>,
    private val source: JsonField<Source>,
    private val type: JsonField<Type>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

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

    /** The Declined Transaction identifier. */
    fun id(): String = id.getRequired("id")

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

    /** The identifier for the Account the Declined Transaction belongs to. */
    @JsonProperty("account_id") @ExcludeMissing fun _accountId() = accountId

    /**
     * The Declined Transaction amount in the minor unit of its currency. For dollars, for example,
     * this is cents.
     */
    @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date on which the Transaction
     * occurred.
     */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    /**
     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the Declined Transaction's
     * currency. This will match the currency on the Declined Transaction's Account.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

    /** This is the description the vendor provides. */
    @JsonProperty("description") @ExcludeMissing fun _description() = description

    /** The Declined Transaction identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /**
     * The identifier for the route this Declined Transaction came through. Routes are things like
     * cards and ACH details.
     */
    @JsonProperty("route_id") @ExcludeMissing fun _routeId() = routeId

    /** The type of the route this Declined Transaction came through. */
    @JsonProperty("route_type") @ExcludeMissing fun _routeType() = routeType

    /**
     * This is an object giving more details on the network-level event that caused the Declined
     * Transaction. For example, for a card transaction this lists the merchant's industry and
     * location. Note that for backwards compatibility reasons, additional undocumented keys may
     * appear in this object. These should be treated as deprecated and will be removed in the
     * future.
     */
    @JsonProperty("source") @ExcludeMissing fun _source() = source

    /**
     * A constant representing the object's type. For this resource it will always be
     * `declined_transaction`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): DeclinedTransaction = apply {
        if (!validated) {
            accountId()
            amount()
            createdAt()
            currency()
            description()
            id()
            routeId()
            routeType()
            source().validate()
            type()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var accountId: JsonField<String> = JsonMissing.of()
        private var amount: JsonField<Long> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var currency: JsonField<Currency> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var id: JsonField<String> = JsonMissing.of()
        private var routeId: JsonField<String> = JsonMissing.of()
        private var routeType: JsonField<RouteType> = JsonMissing.of()
        private var source: JsonField<Source> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(declinedTransaction: DeclinedTransaction) = apply {
            this.accountId = declinedTransaction.accountId
            this.amount = declinedTransaction.amount
            this.createdAt = declinedTransaction.createdAt
            this.currency = declinedTransaction.currency
            this.description = declinedTransaction.description
            this.id = declinedTransaction.id
            this.routeId = declinedTransaction.routeId
            this.routeType = declinedTransaction.routeType
            this.source = declinedTransaction.source
            this.type = declinedTransaction.type
            additionalProperties(declinedTransaction.additionalProperties)
        }

        /** The identifier for the Account the Declined Transaction belongs to. */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /** The identifier for the Account the Declined Transaction belongs to. */
        @JsonProperty("account_id")
        @ExcludeMissing
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
        @JsonProperty("amount")
        @ExcludeMissing
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
        @JsonProperty("created_at")
        @ExcludeMissing
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
        @JsonProperty("currency")
        @ExcludeMissing
        fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

        /** This is the description the vendor provides. */
        fun description(description: String) = description(JsonField.of(description))

        /** This is the description the vendor provides. */
        @JsonProperty("description")
        @ExcludeMissing
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** The Declined Transaction identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The Declined Transaction identifier. */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * The identifier for the route this Declined Transaction came through. Routes are things
         * like cards and ACH details.
         */
        fun routeId(routeId: String) = routeId(JsonField.of(routeId))

        /**
         * The identifier for the route this Declined Transaction came through. Routes are things
         * like cards and ACH details.
         */
        @JsonProperty("route_id")
        @ExcludeMissing
        fun routeId(routeId: JsonField<String>) = apply { this.routeId = routeId }

        /** The type of the route this Declined Transaction came through. */
        fun routeType(routeType: RouteType) = routeType(JsonField.of(routeType))

        /** The type of the route this Declined Transaction came through. */
        @JsonProperty("route_type")
        @ExcludeMissing
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
        @JsonProperty("source")
        @ExcludeMissing
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
        @JsonProperty("type")
        @ExcludeMissing
        fun type(type: JsonField<Type>) = apply { this.type = type }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            this.additionalProperties.putAll(additionalProperties)
        }

        @JsonAnySetter
        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            this.additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun build(): DeclinedTransaction =
            DeclinedTransaction(
                accountId,
                amount,
                createdAt,
                currency,
                description,
                id,
                routeId,
                routeType,
                source,
                type,
                additionalProperties.toImmutable(),
            )
    }

    class Currency
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Currency && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val CAD = Currency(JsonField.of("CAD"))

            @JvmField val CHF = Currency(JsonField.of("CHF"))

            @JvmField val EUR = Currency(JsonField.of("EUR"))

            @JvmField val GBP = Currency(JsonField.of("GBP"))

            @JvmField val JPY = Currency(JsonField.of("JPY"))

            @JvmField val USD = Currency(JsonField.of("USD"))

            @JvmStatic fun of(value: String) = Currency(JsonField.of(value))
        }

        enum class Known {
            CAD,
            CHF,
            EUR,
            GBP,
            JPY,
            USD,
        }

        enum class Value {
            CAD,
            CHF,
            EUR,
            GBP,
            JPY,
            USD,
            _UNKNOWN,
        }

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

        fun asString(): String = _value().asStringOrThrow()
    }

    class RouteType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is RouteType && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val ACCOUNT_NUMBER = RouteType(JsonField.of("account_number"))

            @JvmField val CARD = RouteType(JsonField.of("card"))

            @JvmField val LOCKBOX = RouteType(JsonField.of("lockbox"))

            @JvmStatic fun of(value: String) = RouteType(JsonField.of(value))
        }

        enum class Known {
            ACCOUNT_NUMBER,
            CARD,
            LOCKBOX,
        }

        enum class Value {
            ACCOUNT_NUMBER,
            CARD,
            LOCKBOX,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ACCOUNT_NUMBER -> Value.ACCOUNT_NUMBER
                CARD -> Value.CARD
                LOCKBOX -> Value.LOCKBOX
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ACCOUNT_NUMBER -> Known.ACCOUNT_NUMBER
                CARD -> Known.CARD
                LOCKBOX -> Known.LOCKBOX
                else -> throw IncreaseInvalidDataException("Unknown RouteType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    /**
     * This is an object giving more details on the network-level event that caused the Declined
     * Transaction. For example, for a card transaction this lists the merchant's industry and
     * location. Note that for backwards compatibility reasons, additional undocumented keys may
     * appear in this object. These should be treated as deprecated and will be removed in the
     * future.
     */
    @JsonDeserialize(builder = Source.Builder::class)
    @NoAutoDetect
    class Source
    private constructor(
        private val achDecline: JsonField<AchDecline>,
        private val cardDecline: JsonField<CardDecline>,
        private val category: JsonField<Category>,
        private val checkDecline: JsonField<CheckDecline>,
        private val checkDepositRejection: JsonField<CheckDepositRejection>,
        private val inboundRealTimePaymentsTransferDecline:
            JsonField<InboundRealTimePaymentsTransferDecline>,
        private val other: JsonValue,
        private val wireDecline: JsonField<WireDecline>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

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
         * A Wire Decline object. This field will be present in the JSON response if and only if
         * `category` is equal to `wire_decline`.
         */
        fun wireDecline(): Optional<WireDecline> =
            Optional.ofNullable(wireDecline.getNullable("wire_decline"))

        /**
         * An ACH Decline object. This field will be present in the JSON response if and only if
         * `category` is equal to `ach_decline`.
         */
        @JsonProperty("ach_decline") @ExcludeMissing fun _achDecline() = achDecline

        /**
         * A Card Decline object. This field will be present in the JSON response if and only if
         * `category` is equal to `card_decline`.
         */
        @JsonProperty("card_decline") @ExcludeMissing fun _cardDecline() = cardDecline

        /**
         * The type of the resource. We may add additional possible values for this enum over time;
         * your application should be able to handle such additions gracefully.
         */
        @JsonProperty("category") @ExcludeMissing fun _category() = category

        /**
         * A Check Decline object. This field will be present in the JSON response if and only if
         * `category` is equal to `check_decline`.
         */
        @JsonProperty("check_decline") @ExcludeMissing fun _checkDecline() = checkDecline

        /**
         * A Check Deposit Rejection object. This field will be present in the JSON response if and
         * only if `category` is equal to `check_deposit_rejection`.
         */
        @JsonProperty("check_deposit_rejection")
        @ExcludeMissing
        fun _checkDepositRejection() = checkDepositRejection

        /**
         * An Inbound Real-Time Payments Transfer Decline object. This field will be present in the
         * JSON response if and only if `category` is equal to
         * `inbound_real_time_payments_transfer_decline`.
         */
        @JsonProperty("inbound_real_time_payments_transfer_decline")
        @ExcludeMissing
        fun _inboundRealTimePaymentsTransferDecline() = inboundRealTimePaymentsTransferDecline

        /**
         * If the category of this Transaction source is equal to `other`, this field will contain
         * an empty object, otherwise it will contain null.
         */
        @JsonProperty("other") @ExcludeMissing fun _other() = other

        /**
         * A Wire Decline object. This field will be present in the JSON response if and only if
         * `category` is equal to `wire_decline`.
         */
        @JsonProperty("wire_decline") @ExcludeMissing fun _wireDecline() = wireDecline

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Source = apply {
            if (!validated) {
                achDecline().map { it.validate() }
                cardDecline().map { it.validate() }
                category()
                checkDecline().map { it.validate() }
                checkDepositRejection().map { it.validate() }
                inboundRealTimePaymentsTransferDecline().map { it.validate() }
                wireDecline().map { it.validate() }
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var achDecline: JsonField<AchDecline> = JsonMissing.of()
            private var cardDecline: JsonField<CardDecline> = JsonMissing.of()
            private var category: JsonField<Category> = JsonMissing.of()
            private var checkDecline: JsonField<CheckDecline> = JsonMissing.of()
            private var checkDepositRejection: JsonField<CheckDepositRejection> = JsonMissing.of()
            private var inboundRealTimePaymentsTransferDecline:
                JsonField<InboundRealTimePaymentsTransferDecline> =
                JsonMissing.of()
            private var other: JsonValue = JsonMissing.of()
            private var wireDecline: JsonField<WireDecline> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(source: Source) = apply {
                this.achDecline = source.achDecline
                this.cardDecline = source.cardDecline
                this.category = source.category
                this.checkDecline = source.checkDecline
                this.checkDepositRejection = source.checkDepositRejection
                this.inboundRealTimePaymentsTransferDecline =
                    source.inboundRealTimePaymentsTransferDecline
                this.other = source.other
                this.wireDecline = source.wireDecline
                additionalProperties(source.additionalProperties)
            }

            /**
             * An ACH Decline object. This field will be present in the JSON response if and only if
             * `category` is equal to `ach_decline`.
             */
            fun achDecline(achDecline: AchDecline) = achDecline(JsonField.of(achDecline))

            /**
             * An ACH Decline object. This field will be present in the JSON response if and only if
             * `category` is equal to `ach_decline`.
             */
            @JsonProperty("ach_decline")
            @ExcludeMissing
            fun achDecline(achDecline: JsonField<AchDecline>) = apply {
                this.achDecline = achDecline
            }

            /**
             * A Card Decline object. This field will be present in the JSON response if and only if
             * `category` is equal to `card_decline`.
             */
            fun cardDecline(cardDecline: CardDecline) = cardDecline(JsonField.of(cardDecline))

            /**
             * A Card Decline object. This field will be present in the JSON response if and only if
             * `category` is equal to `card_decline`.
             */
            @JsonProperty("card_decline")
            @ExcludeMissing
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
            @JsonProperty("category")
            @ExcludeMissing
            fun category(category: JsonField<Category>) = apply { this.category = category }

            /**
             * A Check Decline object. This field will be present in the JSON response if and only
             * if `category` is equal to `check_decline`.
             */
            fun checkDecline(checkDecline: CheckDecline) = checkDecline(JsonField.of(checkDecline))

            /**
             * A Check Decline object. This field will be present in the JSON response if and only
             * if `category` is equal to `check_decline`.
             */
            @JsonProperty("check_decline")
            @ExcludeMissing
            fun checkDecline(checkDecline: JsonField<CheckDecline>) = apply {
                this.checkDecline = checkDecline
            }

            /**
             * A Check Deposit Rejection object. This field will be present in the JSON response if
             * and only if `category` is equal to `check_deposit_rejection`.
             */
            fun checkDepositRejection(checkDepositRejection: CheckDepositRejection) =
                checkDepositRejection(JsonField.of(checkDepositRejection))

            /**
             * A Check Deposit Rejection object. This field will be present in the JSON response if
             * and only if `category` is equal to `check_deposit_rejection`.
             */
            @JsonProperty("check_deposit_rejection")
            @ExcludeMissing
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
                inboundRealTimePaymentsTransferDecline: InboundRealTimePaymentsTransferDecline
            ) =
                inboundRealTimePaymentsTransferDecline(
                    JsonField.of(inboundRealTimePaymentsTransferDecline)
                )

            /**
             * An Inbound Real-Time Payments Transfer Decline object. This field will be present in
             * the JSON response if and only if `category` is equal to
             * `inbound_real_time_payments_transfer_decline`.
             */
            @JsonProperty("inbound_real_time_payments_transfer_decline")
            @ExcludeMissing
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
            @JsonProperty("other")
            @ExcludeMissing
            fun other(other: JsonValue) = apply { this.other = other }

            /**
             * A Wire Decline object. This field will be present in the JSON response if and only if
             * `category` is equal to `wire_decline`.
             */
            fun wireDecline(wireDecline: WireDecline) = wireDecline(JsonField.of(wireDecline))

            /**
             * A Wire Decline object. This field will be present in the JSON response if and only if
             * `category` is equal to `wire_decline`.
             */
            @JsonProperty("wire_decline")
            @ExcludeMissing
            fun wireDecline(wireDecline: JsonField<WireDecline>) = apply {
                this.wireDecline = wireDecline
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): Source =
                Source(
                    achDecline,
                    cardDecline,
                    category,
                    checkDecline,
                    checkDepositRejection,
                    inboundRealTimePaymentsTransferDecline,
                    other,
                    wireDecline,
                    additionalProperties.toImmutable(),
                )
        }

        /**
         * An ACH Decline object. This field will be present in the JSON response if and only if
         * `category` is equal to `ach_decline`.
         */
        @JsonDeserialize(builder = AchDecline.Builder::class)
        @NoAutoDetect
        class AchDecline
        private constructor(
            private val amount: JsonField<Long>,
            private val id: JsonField<String>,
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
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            /** The declined amount in USD cents. */
            fun amount(): Long = amount.getRequired("amount")

            /** The ACH Decline's identifier. */
            fun id(): String = id.getRequired("id")

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

            /** The declined amount in USD cents. */
            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            /** The ACH Decline's identifier. */
            @JsonProperty("id") @ExcludeMissing fun _id() = id

            /** The identifier of the Inbound ACH Transfer object associated with this decline. */
            @JsonProperty("inbound_ach_transfer_id")
            @ExcludeMissing
            fun _inboundAchTransferId() = inboundAchTransferId

            /** The descriptive date of the transfer. */
            @JsonProperty("originator_company_descriptive_date")
            @ExcludeMissing
            fun _originatorCompanyDescriptiveDate() = originatorCompanyDescriptiveDate

            /** The additional information included with the transfer. */
            @JsonProperty("originator_company_discretionary_data")
            @ExcludeMissing
            fun _originatorCompanyDiscretionaryData() = originatorCompanyDiscretionaryData

            /** The identifier of the company that initiated the transfer. */
            @JsonProperty("originator_company_id")
            @ExcludeMissing
            fun _originatorCompanyId() = originatorCompanyId

            /** The name of the company that initiated the transfer. */
            @JsonProperty("originator_company_name")
            @ExcludeMissing
            fun _originatorCompanyName() = originatorCompanyName

            /** Why the ACH transfer was declined. */
            @JsonProperty("reason") @ExcludeMissing fun _reason() = reason

            /** The id of the receiver of the transfer. */
            @JsonProperty("receiver_id_number")
            @ExcludeMissing
            fun _receiverIdNumber() = receiverIdNumber

            /** The name of the receiver of the transfer. */
            @JsonProperty("receiver_name") @ExcludeMissing fun _receiverName() = receiverName

            /** The trace number of the transfer. */
            @JsonProperty("trace_number") @ExcludeMissing fun _traceNumber() = traceNumber

            /**
             * A constant representing the object's type. For this resource it will always be
             * `ach_decline`.
             */
            @JsonProperty("type") @ExcludeMissing fun _type() = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): AchDecline = apply {
                if (!validated) {
                    amount()
                    id()
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
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var amount: JsonField<Long> = JsonMissing.of()
                private var id: JsonField<String> = JsonMissing.of()
                private var inboundAchTransferId: JsonField<String> = JsonMissing.of()
                private var originatorCompanyDescriptiveDate: JsonField<String> = JsonMissing.of()
                private var originatorCompanyDiscretionaryData: JsonField<String> = JsonMissing.of()
                private var originatorCompanyId: JsonField<String> = JsonMissing.of()
                private var originatorCompanyName: JsonField<String> = JsonMissing.of()
                private var reason: JsonField<Reason> = JsonMissing.of()
                private var receiverIdNumber: JsonField<String> = JsonMissing.of()
                private var receiverName: JsonField<String> = JsonMissing.of()
                private var traceNumber: JsonField<String> = JsonMissing.of()
                private var type: JsonField<Type> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(achDecline: AchDecline) = apply {
                    this.amount = achDecline.amount
                    this.id = achDecline.id
                    this.inboundAchTransferId = achDecline.inboundAchTransferId
                    this.originatorCompanyDescriptiveDate =
                        achDecline.originatorCompanyDescriptiveDate
                    this.originatorCompanyDiscretionaryData =
                        achDecline.originatorCompanyDiscretionaryData
                    this.originatorCompanyId = achDecline.originatorCompanyId
                    this.originatorCompanyName = achDecline.originatorCompanyName
                    this.reason = achDecline.reason
                    this.receiverIdNumber = achDecline.receiverIdNumber
                    this.receiverName = achDecline.receiverName
                    this.traceNumber = achDecline.traceNumber
                    this.type = achDecline.type
                    additionalProperties(achDecline.additionalProperties)
                }

                /** The declined amount in USD cents. */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /** The declined amount in USD cents. */
                @JsonProperty("amount")
                @ExcludeMissing
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /** The ACH Decline's identifier. */
                fun id(id: String) = id(JsonField.of(id))

                /** The ACH Decline's identifier. */
                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                /**
                 * The identifier of the Inbound ACH Transfer object associated with this decline.
                 */
                fun inboundAchTransferId(inboundAchTransferId: String) =
                    inboundAchTransferId(JsonField.of(inboundAchTransferId))

                /**
                 * The identifier of the Inbound ACH Transfer object associated with this decline.
                 */
                @JsonProperty("inbound_ach_transfer_id")
                @ExcludeMissing
                fun inboundAchTransferId(inboundAchTransferId: JsonField<String>) = apply {
                    this.inboundAchTransferId = inboundAchTransferId
                }

                /** The descriptive date of the transfer. */
                fun originatorCompanyDescriptiveDate(originatorCompanyDescriptiveDate: String) =
                    originatorCompanyDescriptiveDate(JsonField.of(originatorCompanyDescriptiveDate))

                /** The descriptive date of the transfer. */
                @JsonProperty("originator_company_descriptive_date")
                @ExcludeMissing
                fun originatorCompanyDescriptiveDate(
                    originatorCompanyDescriptiveDate: JsonField<String>
                ) = apply {
                    this.originatorCompanyDescriptiveDate = originatorCompanyDescriptiveDate
                }

                /** The additional information included with the transfer. */
                fun originatorCompanyDiscretionaryData(originatorCompanyDiscretionaryData: String) =
                    originatorCompanyDiscretionaryData(
                        JsonField.of(originatorCompanyDiscretionaryData)
                    )

                /** The additional information included with the transfer. */
                @JsonProperty("originator_company_discretionary_data")
                @ExcludeMissing
                fun originatorCompanyDiscretionaryData(
                    originatorCompanyDiscretionaryData: JsonField<String>
                ) = apply {
                    this.originatorCompanyDiscretionaryData = originatorCompanyDiscretionaryData
                }

                /** The identifier of the company that initiated the transfer. */
                fun originatorCompanyId(originatorCompanyId: String) =
                    originatorCompanyId(JsonField.of(originatorCompanyId))

                /** The identifier of the company that initiated the transfer. */
                @JsonProperty("originator_company_id")
                @ExcludeMissing
                fun originatorCompanyId(originatorCompanyId: JsonField<String>) = apply {
                    this.originatorCompanyId = originatorCompanyId
                }

                /** The name of the company that initiated the transfer. */
                fun originatorCompanyName(originatorCompanyName: String) =
                    originatorCompanyName(JsonField.of(originatorCompanyName))

                /** The name of the company that initiated the transfer. */
                @JsonProperty("originator_company_name")
                @ExcludeMissing
                fun originatorCompanyName(originatorCompanyName: JsonField<String>) = apply {
                    this.originatorCompanyName = originatorCompanyName
                }

                /** Why the ACH transfer was declined. */
                fun reason(reason: Reason) = reason(JsonField.of(reason))

                /** Why the ACH transfer was declined. */
                @JsonProperty("reason")
                @ExcludeMissing
                fun reason(reason: JsonField<Reason>) = apply { this.reason = reason }

                /** The id of the receiver of the transfer. */
                fun receiverIdNumber(receiverIdNumber: String) =
                    receiverIdNumber(JsonField.of(receiverIdNumber))

                /** The id of the receiver of the transfer. */
                @JsonProperty("receiver_id_number")
                @ExcludeMissing
                fun receiverIdNumber(receiverIdNumber: JsonField<String>) = apply {
                    this.receiverIdNumber = receiverIdNumber
                }

                /** The name of the receiver of the transfer. */
                fun receiverName(receiverName: String) = receiverName(JsonField.of(receiverName))

                /** The name of the receiver of the transfer. */
                @JsonProperty("receiver_name")
                @ExcludeMissing
                fun receiverName(receiverName: JsonField<String>) = apply {
                    this.receiverName = receiverName
                }

                /** The trace number of the transfer. */
                fun traceNumber(traceNumber: String) = traceNumber(JsonField.of(traceNumber))

                /** The trace number of the transfer. */
                @JsonProperty("trace_number")
                @ExcludeMissing
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
                @JsonProperty("type")
                @ExcludeMissing
                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): AchDecline =
                    AchDecline(
                        amount,
                        id,
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
                        additionalProperties.toImmutable(),
                    )
            }

            class Reason
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Reason && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    @JvmField val ACH_ROUTE_CANCELED = Reason(JsonField.of("ach_route_canceled"))

                    @JvmField val ACH_ROUTE_DISABLED = Reason(JsonField.of("ach_route_disabled"))

                    @JvmField val BREACHES_LIMIT = Reason(JsonField.of("breaches_limit"))

                    @JvmField val ENTITY_NOT_ACTIVE = Reason(JsonField.of("entity_not_active"))

                    @JvmField val GROUP_LOCKED = Reason(JsonField.of("group_locked"))

                    @JvmField
                    val TRANSACTION_NOT_ALLOWED = Reason(JsonField.of("transaction_not_allowed"))

                    @JvmField val USER_INITIATED = Reason(JsonField.of("user_initiated"))

                    @JvmField val INSUFFICIENT_FUNDS = Reason(JsonField.of("insufficient_funds"))

                    @JvmField
                    val RETURNED_PER_ODFI_REQUEST =
                        Reason(JsonField.of("returned_per_odfi_request"))

                    @JvmField
                    val AUTHORIZATION_REVOKED_BY_CUSTOMER =
                        Reason(JsonField.of("authorization_revoked_by_customer"))

                    @JvmField val PAYMENT_STOPPED = Reason(JsonField.of("payment_stopped"))

                    @JvmField
                    val CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE =
                        Reason(
                            JsonField.of(
                                "customer_advised_unauthorized_improper_ineligible_or_incomplete"
                            )
                        )

                    @JvmField
                    val REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY =
                        Reason(
                            JsonField.of(
                                "representative_payee_deceased_or_unable_to_continue_in_that_capacity"
                            )
                        )

                    @JvmField
                    val BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED =
                        Reason(JsonField.of("beneficiary_or_account_holder_deceased"))

                    @JvmField
                    val CREDIT_ENTRY_REFUSED_BY_RECEIVER =
                        Reason(JsonField.of("credit_entry_refused_by_receiver"))

                    @JvmField val DUPLICATE_ENTRY = Reason(JsonField.of("duplicate_entry"))

                    @JvmField
                    val CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED =
                        Reason(JsonField.of("corporate_customer_advised_not_authorized"))

                    @JvmStatic fun of(value: String) = Reason(JsonField.of(value))
                }

                enum class Known {
                    ACH_ROUTE_CANCELED,
                    ACH_ROUTE_DISABLED,
                    BREACHES_LIMIT,
                    ENTITY_NOT_ACTIVE,
                    GROUP_LOCKED,
                    TRANSACTION_NOT_ALLOWED,
                    USER_INITIATED,
                    INSUFFICIENT_FUNDS,
                    RETURNED_PER_ODFI_REQUEST,
                    AUTHORIZATION_REVOKED_BY_CUSTOMER,
                    PAYMENT_STOPPED,
                    CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE,
                    REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY,
                    BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED,
                    CREDIT_ENTRY_REFUSED_BY_RECEIVER,
                    DUPLICATE_ENTRY,
                    CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED,
                }

                enum class Value {
                    ACH_ROUTE_CANCELED,
                    ACH_ROUTE_DISABLED,
                    BREACHES_LIMIT,
                    ENTITY_NOT_ACTIVE,
                    GROUP_LOCKED,
                    TRANSACTION_NOT_ALLOWED,
                    USER_INITIATED,
                    INSUFFICIENT_FUNDS,
                    RETURNED_PER_ODFI_REQUEST,
                    AUTHORIZATION_REVOKED_BY_CUSTOMER,
                    PAYMENT_STOPPED,
                    CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE,
                    REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY,
                    BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED,
                    CREDIT_ENTRY_REFUSED_BY_RECEIVER,
                    DUPLICATE_ENTRY,
                    CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED,
                    _UNKNOWN,
                }

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

                fun asString(): String = _value().asStringOrThrow()
            }

            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Type && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    @JvmField val ACH_DECLINE = Type(JsonField.of("ach_decline"))

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                enum class Known {
                    ACH_DECLINE,
                }

                enum class Value {
                    ACH_DECLINE,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        ACH_DECLINE -> Value.ACH_DECLINE
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        ACH_DECLINE -> Known.ACH_DECLINE
                        else -> throw IncreaseInvalidDataException("Unknown Type: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is AchDecline && this.amount == other.amount && this.id == other.id && this.inboundAchTransferId == other.inboundAchTransferId && this.originatorCompanyDescriptiveDate == other.originatorCompanyDescriptiveDate && this.originatorCompanyDiscretionaryData == other.originatorCompanyDiscretionaryData && this.originatorCompanyId == other.originatorCompanyId && this.originatorCompanyName == other.originatorCompanyName && this.reason == other.reason && this.receiverIdNumber == other.receiverIdNumber && this.receiverName == other.receiverName && this.traceNumber == other.traceNumber && this.type == other.type && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(amount, id, inboundAchTransferId, originatorCompanyDescriptiveDate, originatorCompanyDiscretionaryData, originatorCompanyId, originatorCompanyName, reason, receiverIdNumber, receiverName, traceNumber, type, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "AchDecline{amount=$amount, id=$id, inboundAchTransferId=$inboundAchTransferId, originatorCompanyDescriptiveDate=$originatorCompanyDescriptiveDate, originatorCompanyDiscretionaryData=$originatorCompanyDiscretionaryData, originatorCompanyId=$originatorCompanyId, originatorCompanyName=$originatorCompanyName, reason=$reason, receiverIdNumber=$receiverIdNumber, receiverName=$receiverName, traceNumber=$traceNumber, type=$type, additionalProperties=$additionalProperties}"
        }

        /**
         * A Card Decline object. This field will be present in the JSON response if and only if
         * `category` is equal to `card_decline`.
         */
        @JsonDeserialize(builder = CardDecline.Builder::class)
        @NoAutoDetect
        class CardDecline
        private constructor(
            private val actioner: JsonField<Actioner>,
            private val amount: JsonField<Long>,
            private val cardPaymentId: JsonField<String>,
            private val currency: JsonField<Currency>,
            private val declinedTransactionId: JsonField<String>,
            private val digitalWalletTokenId: JsonField<String>,
            private val direction: JsonField<Direction>,
            private val id: JsonField<String>,
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
            private val reason: JsonField<Reason>,
            private val verification: JsonField<Verification>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

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

            /** The Card Decline identifier. */
            fun id(): String = id.getRequired("id")

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
            fun merchantCategoryCode(): Optional<String> =
                Optional.ofNullable(merchantCategoryCode.getNullable("merchant_category_code"))

            /** The city the merchant resides in. */
            fun merchantCity(): Optional<String> =
                Optional.ofNullable(merchantCity.getNullable("merchant_city"))

            /** The country the merchant resides in. */
            fun merchantCountry(): Optional<String> =
                Optional.ofNullable(merchantCountry.getNullable("merchant_country"))

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

            /** Why the transaction was declined. */
            fun reason(): Reason = reason.getRequired("reason")

            /** Fields related to verification of cardholder-provided values. */
            fun verification(): Verification = verification.getRequired("verification")

            /**
             * Whether this authorization was approved by Increase, the card network through
             * stand-in processing, or the user through a real-time decision.
             */
            @JsonProperty("actioner") @ExcludeMissing fun _actioner() = actioner

            /**
             * The declined amount in the minor unit of the destination account currency. For
             * dollars, for example, this is cents.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            /** The ID of the Card Payment this transaction belongs to. */
            @JsonProperty("card_payment_id") @ExcludeMissing fun _cardPaymentId() = cardPaymentId

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the destination
             * account currency.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            /** The identifier of the declined transaction created for this Card Decline. */
            @JsonProperty("declined_transaction_id")
            @ExcludeMissing
            fun _declinedTransactionId() = declinedTransactionId

            /**
             * If the authorization was made via a Digital Wallet Token (such as an Apple Pay
             * purchase), the identifier of the token that was used.
             */
            @JsonProperty("digital_wallet_token_id")
            @ExcludeMissing
            fun _digitalWalletTokenId() = digitalWalletTokenId

            /**
             * The direction describes the direction the funds will move, either from the cardholder
             * to the merchant or from the merchant to the cardholder.
             */
            @JsonProperty("direction") @ExcludeMissing fun _direction() = direction

            /** The Card Decline identifier. */
            @JsonProperty("id") @ExcludeMissing fun _id() = id

            /**
             * The merchant identifier (commonly abbreviated as MID) of the merchant the card is
             * transacting with.
             */
            @JsonProperty("merchant_acceptor_id")
            @ExcludeMissing
            fun _merchantAcceptorId() = merchantAcceptorId

            /**
             * The Merchant Category Code (commonly abbreviated as MCC) of the merchant the card is
             * transacting with.
             */
            @JsonProperty("merchant_category_code")
            @ExcludeMissing
            fun _merchantCategoryCode() = merchantCategoryCode

            /** The city the merchant resides in. */
            @JsonProperty("merchant_city") @ExcludeMissing fun _merchantCity() = merchantCity

            /** The country the merchant resides in. */
            @JsonProperty("merchant_country")
            @ExcludeMissing
            fun _merchantCountry() = merchantCountry

            /** The merchant descriptor of the merchant the card is transacting with. */
            @JsonProperty("merchant_descriptor")
            @ExcludeMissing
            fun _merchantDescriptor() = merchantDescriptor

            /**
             * The merchant's postal code. For US merchants this is either a 5-digit or 9-digit ZIP
             * code, where the first 5 and last 4 are separated by a dash.
             */
            @JsonProperty("merchant_postal_code")
            @ExcludeMissing
            fun _merchantPostalCode() = merchantPostalCode

            /** The state the merchant resides in. */
            @JsonProperty("merchant_state") @ExcludeMissing fun _merchantState() = merchantState

            /** Fields specific to the `network`. */
            @JsonProperty("network_details") @ExcludeMissing fun _networkDetails() = networkDetails

            /** Network-specific identifiers for a specific request or transaction. */
            @JsonProperty("network_identifiers")
            @ExcludeMissing
            fun _networkIdentifiers() = networkIdentifiers

            /**
             * The risk score generated by the card network. For Visa this is the Visa Advanced
             * Authorization risk score, from 0 to 99, where 99 is the riskiest.
             */
            @JsonProperty("network_risk_score")
            @ExcludeMissing
            fun _networkRiskScore() = networkRiskScore

            /**
             * If the authorization was made in-person with a physical card, the Physical Card that
             * was used.
             */
            @JsonProperty("physical_card_id") @ExcludeMissing fun _physicalCardId() = physicalCardId

            /** The declined amount in the minor unit of the transaction's presentment currency. */
            @JsonProperty("presentment_amount")
            @ExcludeMissing
            fun _presentmentAmount() = presentmentAmount

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
             * presentment currency.
             */
            @JsonProperty("presentment_currency")
            @ExcludeMissing
            fun _presentmentCurrency() = presentmentCurrency

            /**
             * The processing category describes the intent behind the authorization, such as
             * whether it was used for bill payments or an automatic fuel dispenser.
             */
            @JsonProperty("processing_category")
            @ExcludeMissing
            fun _processingCategory() = processingCategory

            /**
             * The identifier of the Real-Time Decision sent to approve or decline this transaction.
             */
            @JsonProperty("real_time_decision_id")
            @ExcludeMissing
            fun _realTimeDecisionId() = realTimeDecisionId

            /** Why the transaction was declined. */
            @JsonProperty("reason") @ExcludeMissing fun _reason() = reason

            /** Fields related to verification of cardholder-provided values. */
            @JsonProperty("verification") @ExcludeMissing fun _verification() = verification

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): CardDecline = apply {
                if (!validated) {
                    actioner()
                    amount()
                    cardPaymentId()
                    currency()
                    declinedTransactionId()
                    digitalWalletTokenId()
                    direction()
                    id()
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
                    reason()
                    verification().validate()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var actioner: JsonField<Actioner> = JsonMissing.of()
                private var amount: JsonField<Long> = JsonMissing.of()
                private var cardPaymentId: JsonField<String> = JsonMissing.of()
                private var currency: JsonField<Currency> = JsonMissing.of()
                private var declinedTransactionId: JsonField<String> = JsonMissing.of()
                private var digitalWalletTokenId: JsonField<String> = JsonMissing.of()
                private var direction: JsonField<Direction> = JsonMissing.of()
                private var id: JsonField<String> = JsonMissing.of()
                private var merchantAcceptorId: JsonField<String> = JsonMissing.of()
                private var merchantCategoryCode: JsonField<String> = JsonMissing.of()
                private var merchantCity: JsonField<String> = JsonMissing.of()
                private var merchantCountry: JsonField<String> = JsonMissing.of()
                private var merchantDescriptor: JsonField<String> = JsonMissing.of()
                private var merchantPostalCode: JsonField<String> = JsonMissing.of()
                private var merchantState: JsonField<String> = JsonMissing.of()
                private var networkDetails: JsonField<NetworkDetails> = JsonMissing.of()
                private var networkIdentifiers: JsonField<NetworkIdentifiers> = JsonMissing.of()
                private var networkRiskScore: JsonField<Long> = JsonMissing.of()
                private var physicalCardId: JsonField<String> = JsonMissing.of()
                private var presentmentAmount: JsonField<Long> = JsonMissing.of()
                private var presentmentCurrency: JsonField<String> = JsonMissing.of()
                private var processingCategory: JsonField<ProcessingCategory> = JsonMissing.of()
                private var realTimeDecisionId: JsonField<String> = JsonMissing.of()
                private var reason: JsonField<Reason> = JsonMissing.of()
                private var verification: JsonField<Verification> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(cardDecline: CardDecline) = apply {
                    this.actioner = cardDecline.actioner
                    this.amount = cardDecline.amount
                    this.cardPaymentId = cardDecline.cardPaymentId
                    this.currency = cardDecline.currency
                    this.declinedTransactionId = cardDecline.declinedTransactionId
                    this.digitalWalletTokenId = cardDecline.digitalWalletTokenId
                    this.direction = cardDecline.direction
                    this.id = cardDecline.id
                    this.merchantAcceptorId = cardDecline.merchantAcceptorId
                    this.merchantCategoryCode = cardDecline.merchantCategoryCode
                    this.merchantCity = cardDecline.merchantCity
                    this.merchantCountry = cardDecline.merchantCountry
                    this.merchantDescriptor = cardDecline.merchantDescriptor
                    this.merchantPostalCode = cardDecline.merchantPostalCode
                    this.merchantState = cardDecline.merchantState
                    this.networkDetails = cardDecline.networkDetails
                    this.networkIdentifiers = cardDecline.networkIdentifiers
                    this.networkRiskScore = cardDecline.networkRiskScore
                    this.physicalCardId = cardDecline.physicalCardId
                    this.presentmentAmount = cardDecline.presentmentAmount
                    this.presentmentCurrency = cardDecline.presentmentCurrency
                    this.processingCategory = cardDecline.processingCategory
                    this.realTimeDecisionId = cardDecline.realTimeDecisionId
                    this.reason = cardDecline.reason
                    this.verification = cardDecline.verification
                    additionalProperties(cardDecline.additionalProperties)
                }

                /**
                 * Whether this authorization was approved by Increase, the card network through
                 * stand-in processing, or the user through a real-time decision.
                 */
                fun actioner(actioner: Actioner) = actioner(JsonField.of(actioner))

                /**
                 * Whether this authorization was approved by Increase, the card network through
                 * stand-in processing, or the user through a real-time decision.
                 */
                @JsonProperty("actioner")
                @ExcludeMissing
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
                @JsonProperty("amount")
                @ExcludeMissing
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /** The ID of the Card Payment this transaction belongs to. */
                fun cardPaymentId(cardPaymentId: String) =
                    cardPaymentId(JsonField.of(cardPaymentId))

                /** The ID of the Card Payment this transaction belongs to. */
                @JsonProperty("card_payment_id")
                @ExcludeMissing
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
                @JsonProperty("currency")
                @ExcludeMissing
                fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                /** The identifier of the declined transaction created for this Card Decline. */
                fun declinedTransactionId(declinedTransactionId: String) =
                    declinedTransactionId(JsonField.of(declinedTransactionId))

                /** The identifier of the declined transaction created for this Card Decline. */
                @JsonProperty("declined_transaction_id")
                @ExcludeMissing
                fun declinedTransactionId(declinedTransactionId: JsonField<String>) = apply {
                    this.declinedTransactionId = declinedTransactionId
                }

                /**
                 * If the authorization was made via a Digital Wallet Token (such as an Apple Pay
                 * purchase), the identifier of the token that was used.
                 */
                fun digitalWalletTokenId(digitalWalletTokenId: String) =
                    digitalWalletTokenId(JsonField.of(digitalWalletTokenId))

                /**
                 * If the authorization was made via a Digital Wallet Token (such as an Apple Pay
                 * purchase), the identifier of the token that was used.
                 */
                @JsonProperty("digital_wallet_token_id")
                @ExcludeMissing
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
                @JsonProperty("direction")
                @ExcludeMissing
                fun direction(direction: JsonField<Direction>) = apply {
                    this.direction = direction
                }

                /** The Card Decline identifier. */
                fun id(id: String) = id(JsonField.of(id))

                /** The Card Decline identifier. */
                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

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
                @JsonProperty("merchant_acceptor_id")
                @ExcludeMissing
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
                @JsonProperty("merchant_category_code")
                @ExcludeMissing
                fun merchantCategoryCode(merchantCategoryCode: JsonField<String>) = apply {
                    this.merchantCategoryCode = merchantCategoryCode
                }

                /** The city the merchant resides in. */
                fun merchantCity(merchantCity: String) = merchantCity(JsonField.of(merchantCity))

                /** The city the merchant resides in. */
                @JsonProperty("merchant_city")
                @ExcludeMissing
                fun merchantCity(merchantCity: JsonField<String>) = apply {
                    this.merchantCity = merchantCity
                }

                /** The country the merchant resides in. */
                fun merchantCountry(merchantCountry: String) =
                    merchantCountry(JsonField.of(merchantCountry))

                /** The country the merchant resides in. */
                @JsonProperty("merchant_country")
                @ExcludeMissing
                fun merchantCountry(merchantCountry: JsonField<String>) = apply {
                    this.merchantCountry = merchantCountry
                }

                /** The merchant descriptor of the merchant the card is transacting with. */
                fun merchantDescriptor(merchantDescriptor: String) =
                    merchantDescriptor(JsonField.of(merchantDescriptor))

                /** The merchant descriptor of the merchant the card is transacting with. */
                @JsonProperty("merchant_descriptor")
                @ExcludeMissing
                fun merchantDescriptor(merchantDescriptor: JsonField<String>) = apply {
                    this.merchantDescriptor = merchantDescriptor
                }

                /**
                 * The merchant's postal code. For US merchants this is either a 5-digit or 9-digit
                 * ZIP code, where the first 5 and last 4 are separated by a dash.
                 */
                fun merchantPostalCode(merchantPostalCode: String) =
                    merchantPostalCode(JsonField.of(merchantPostalCode))

                /**
                 * The merchant's postal code. For US merchants this is either a 5-digit or 9-digit
                 * ZIP code, where the first 5 and last 4 are separated by a dash.
                 */
                @JsonProperty("merchant_postal_code")
                @ExcludeMissing
                fun merchantPostalCode(merchantPostalCode: JsonField<String>) = apply {
                    this.merchantPostalCode = merchantPostalCode
                }

                /** The state the merchant resides in. */
                fun merchantState(merchantState: String) =
                    merchantState(JsonField.of(merchantState))

                /** The state the merchant resides in. */
                @JsonProperty("merchant_state")
                @ExcludeMissing
                fun merchantState(merchantState: JsonField<String>) = apply {
                    this.merchantState = merchantState
                }

                /** Fields specific to the `network`. */
                fun networkDetails(networkDetails: NetworkDetails) =
                    networkDetails(JsonField.of(networkDetails))

                /** Fields specific to the `network`. */
                @JsonProperty("network_details")
                @ExcludeMissing
                fun networkDetails(networkDetails: JsonField<NetworkDetails>) = apply {
                    this.networkDetails = networkDetails
                }

                /** Network-specific identifiers for a specific request or transaction. */
                fun networkIdentifiers(networkIdentifiers: NetworkIdentifiers) =
                    networkIdentifiers(JsonField.of(networkIdentifiers))

                /** Network-specific identifiers for a specific request or transaction. */
                @JsonProperty("network_identifiers")
                @ExcludeMissing
                fun networkIdentifiers(networkIdentifiers: JsonField<NetworkIdentifiers>) = apply {
                    this.networkIdentifiers = networkIdentifiers
                }

                /**
                 * The risk score generated by the card network. For Visa this is the Visa Advanced
                 * Authorization risk score, from 0 to 99, where 99 is the riskiest.
                 */
                fun networkRiskScore(networkRiskScore: Long) =
                    networkRiskScore(JsonField.of(networkRiskScore))

                /**
                 * The risk score generated by the card network. For Visa this is the Visa Advanced
                 * Authorization risk score, from 0 to 99, where 99 is the riskiest.
                 */
                @JsonProperty("network_risk_score")
                @ExcludeMissing
                fun networkRiskScore(networkRiskScore: JsonField<Long>) = apply {
                    this.networkRiskScore = networkRiskScore
                }

                /**
                 * If the authorization was made in-person with a physical card, the Physical Card
                 * that was used.
                 */
                fun physicalCardId(physicalCardId: String) =
                    physicalCardId(JsonField.of(physicalCardId))

                /**
                 * If the authorization was made in-person with a physical card, the Physical Card
                 * that was used.
                 */
                @JsonProperty("physical_card_id")
                @ExcludeMissing
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
                @JsonProperty("presentment_amount")
                @ExcludeMissing
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
                @JsonProperty("presentment_currency")
                @ExcludeMissing
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
                @JsonProperty("processing_category")
                @ExcludeMissing
                fun processingCategory(processingCategory: JsonField<ProcessingCategory>) = apply {
                    this.processingCategory = processingCategory
                }

                /**
                 * The identifier of the Real-Time Decision sent to approve or decline this
                 * transaction.
                 */
                fun realTimeDecisionId(realTimeDecisionId: String) =
                    realTimeDecisionId(JsonField.of(realTimeDecisionId))

                /**
                 * The identifier of the Real-Time Decision sent to approve or decline this
                 * transaction.
                 */
                @JsonProperty("real_time_decision_id")
                @ExcludeMissing
                fun realTimeDecisionId(realTimeDecisionId: JsonField<String>) = apply {
                    this.realTimeDecisionId = realTimeDecisionId
                }

                /** Why the transaction was declined. */
                fun reason(reason: Reason) = reason(JsonField.of(reason))

                /** Why the transaction was declined. */
                @JsonProperty("reason")
                @ExcludeMissing
                fun reason(reason: JsonField<Reason>) = apply { this.reason = reason }

                /** Fields related to verification of cardholder-provided values. */
                fun verification(verification: Verification) =
                    verification(JsonField.of(verification))

                /** Fields related to verification of cardholder-provided values. */
                @JsonProperty("verification")
                @ExcludeMissing
                fun verification(verification: JsonField<Verification>) = apply {
                    this.verification = verification
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): CardDecline =
                    CardDecline(
                        actioner,
                        amount,
                        cardPaymentId,
                        currency,
                        declinedTransactionId,
                        digitalWalletTokenId,
                        direction,
                        id,
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
                        reason,
                        verification,
                        additionalProperties.toImmutable(),
                    )
            }

            class Actioner
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Actioner && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    @JvmField val USER = Actioner(JsonField.of("user"))

                    @JvmField val INCREASE = Actioner(JsonField.of("increase"))

                    @JvmField val NETWORK = Actioner(JsonField.of("network"))

                    @JvmStatic fun of(value: String) = Actioner(JsonField.of(value))
                }

                enum class Known {
                    USER,
                    INCREASE,
                    NETWORK,
                }

                enum class Value {
                    USER,
                    INCREASE,
                    NETWORK,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        USER -> Value.USER
                        INCREASE -> Value.INCREASE
                        NETWORK -> Value.NETWORK
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        USER -> Known.USER
                        INCREASE -> Known.INCREASE
                        NETWORK -> Known.NETWORK
                        else -> throw IncreaseInvalidDataException("Unknown Actioner: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            class Currency
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Currency && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    @JvmField val CAD = Currency(JsonField.of("CAD"))

                    @JvmField val CHF = Currency(JsonField.of("CHF"))

                    @JvmField val EUR = Currency(JsonField.of("EUR"))

                    @JvmField val GBP = Currency(JsonField.of("GBP"))

                    @JvmField val JPY = Currency(JsonField.of("JPY"))

                    @JvmField val USD = Currency(JsonField.of("USD"))

                    @JvmStatic fun of(value: String) = Currency(JsonField.of(value))
                }

                enum class Known {
                    CAD,
                    CHF,
                    EUR,
                    GBP,
                    JPY,
                    USD,
                }

                enum class Value {
                    CAD,
                    CHF,
                    EUR,
                    GBP,
                    JPY,
                    USD,
                    _UNKNOWN,
                }

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

                fun asString(): String = _value().asStringOrThrow()
            }

            class Direction
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Direction && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    @JvmField val SETTLEMENT = Direction(JsonField.of("settlement"))

                    @JvmField val REFUND = Direction(JsonField.of("refund"))

                    @JvmStatic fun of(value: String) = Direction(JsonField.of(value))
                }

                enum class Known {
                    SETTLEMENT,
                    REFUND,
                }

                enum class Value {
                    SETTLEMENT,
                    REFUND,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        SETTLEMENT -> Value.SETTLEMENT
                        REFUND -> Value.REFUND
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        SETTLEMENT -> Known.SETTLEMENT
                        REFUND -> Known.REFUND
                        else -> throw IncreaseInvalidDataException("Unknown Direction: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            /** Fields specific to the `network`. */
            @JsonDeserialize(builder = NetworkDetails.Builder::class)
            @NoAutoDetect
            class NetworkDetails
            private constructor(
                private val category: JsonField<Category>,
                private val visa: JsonField<Visa>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                /** The payment network used to process this card authorization. */
                fun category(): Category = category.getRequired("category")

                /** Fields specific to the `visa` network. */
                fun visa(): Optional<Visa> = Optional.ofNullable(visa.getNullable("visa"))

                /** The payment network used to process this card authorization. */
                @JsonProperty("category") @ExcludeMissing fun _category() = category

                /** Fields specific to the `visa` network. */
                @JsonProperty("visa") @ExcludeMissing fun _visa() = visa

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): NetworkDetails = apply {
                    if (!validated) {
                        category()
                        visa().map { it.validate() }
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var category: JsonField<Category> = JsonMissing.of()
                    private var visa: JsonField<Visa> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(networkDetails: NetworkDetails) = apply {
                        this.category = networkDetails.category
                        this.visa = networkDetails.visa
                        additionalProperties(networkDetails.additionalProperties)
                    }

                    /** The payment network used to process this card authorization. */
                    fun category(category: Category) = category(JsonField.of(category))

                    /** The payment network used to process this card authorization. */
                    @JsonProperty("category")
                    @ExcludeMissing
                    fun category(category: JsonField<Category>) = apply { this.category = category }

                    /** Fields specific to the `visa` network. */
                    fun visa(visa: Visa) = visa(JsonField.of(visa))

                    /** Fields specific to the `visa` network. */
                    @JsonProperty("visa")
                    @ExcludeMissing
                    fun visa(visa: JsonField<Visa>) = apply { this.visa = visa }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): NetworkDetails =
                        NetworkDetails(
                            category,
                            visa,
                            additionalProperties.toImmutable(),
                        )
                }

                class Category
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Category && this.value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        @JvmField val VISA = Category(JsonField.of("visa"))

                        @JvmStatic fun of(value: String) = Category(JsonField.of(value))
                    }

                    enum class Known {
                        VISA,
                    }

                    enum class Value {
                        VISA,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            VISA -> Value.VISA
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            VISA -> Known.VISA
                            else -> throw IncreaseInvalidDataException("Unknown Category: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }

                /** Fields specific to the `visa` network. */
                @JsonDeserialize(builder = Visa.Builder::class)
                @NoAutoDetect
                class Visa
                private constructor(
                    private val electronicCommerceIndicator: JsonField<ElectronicCommerceIndicator>,
                    private val pointOfServiceEntryMode: JsonField<PointOfServiceEntryMode>,
                    private val standInProcessingReason: JsonField<StandInProcessingReason>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

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
                    fun _electronicCommerceIndicator() = electronicCommerceIndicator

                    /**
                     * The method used to enter the cardholder's primary account number and card
                     * expiration date.
                     */
                    @JsonProperty("point_of_service_entry_mode")
                    @ExcludeMissing
                    fun _pointOfServiceEntryMode() = pointOfServiceEntryMode

                    /**
                     * Only present when `actioner: network`. Describes why a card authorization was
                     * approved or declined by Visa through stand-in processing.
                     */
                    @JsonProperty("stand_in_processing_reason")
                    @ExcludeMissing
                    fun _standInProcessingReason() = standInProcessingReason

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): Visa = apply {
                        if (!validated) {
                            electronicCommerceIndicator()
                            pointOfServiceEntryMode()
                            standInProcessingReason()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var electronicCommerceIndicator:
                            JsonField<ElectronicCommerceIndicator> =
                            JsonMissing.of()
                        private var pointOfServiceEntryMode: JsonField<PointOfServiceEntryMode> =
                            JsonMissing.of()
                        private var standInProcessingReason: JsonField<StandInProcessingReason> =
                            JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(visa: Visa) = apply {
                            this.electronicCommerceIndicator = visa.electronicCommerceIndicator
                            this.pointOfServiceEntryMode = visa.pointOfServiceEntryMode
                            this.standInProcessingReason = visa.standInProcessingReason
                            additionalProperties(visa.additionalProperties)
                        }

                        /**
                         * For electronic commerce transactions, this identifies the level of
                         * security used in obtaining the customer's payment credential. For mail or
                         * telephone order transactions, identifies the type of mail or telephone
                         * order.
                         */
                        fun electronicCommerceIndicator(
                            electronicCommerceIndicator: ElectronicCommerceIndicator
                        ) = electronicCommerceIndicator(JsonField.of(electronicCommerceIndicator))

                        /**
                         * For electronic commerce transactions, this identifies the level of
                         * security used in obtaining the customer's payment credential. For mail or
                         * telephone order transactions, identifies the type of mail or telephone
                         * order.
                         */
                        @JsonProperty("electronic_commerce_indicator")
                        @ExcludeMissing
                        fun electronicCommerceIndicator(
                            electronicCommerceIndicator: JsonField<ElectronicCommerceIndicator>
                        ) = apply { this.electronicCommerceIndicator = electronicCommerceIndicator }

                        /**
                         * The method used to enter the cardholder's primary account number and card
                         * expiration date.
                         */
                        fun pointOfServiceEntryMode(
                            pointOfServiceEntryMode: PointOfServiceEntryMode
                        ) = pointOfServiceEntryMode(JsonField.of(pointOfServiceEntryMode))

                        /**
                         * The method used to enter the cardholder's primary account number and card
                         * expiration date.
                         */
                        @JsonProperty("point_of_service_entry_mode")
                        @ExcludeMissing
                        fun pointOfServiceEntryMode(
                            pointOfServiceEntryMode: JsonField<PointOfServiceEntryMode>
                        ) = apply { this.pointOfServiceEntryMode = pointOfServiceEntryMode }

                        /**
                         * Only present when `actioner: network`. Describes why a card authorization
                         * was approved or declined by Visa through stand-in processing.
                         */
                        fun standInProcessingReason(
                            standInProcessingReason: StandInProcessingReason
                        ) = standInProcessingReason(JsonField.of(standInProcessingReason))

                        /**
                         * Only present when `actioner: network`. Describes why a card authorization
                         * was approved or declined by Visa through stand-in processing.
                         */
                        @JsonProperty("stand_in_processing_reason")
                        @ExcludeMissing
                        fun standInProcessingReason(
                            standInProcessingReason: JsonField<StandInProcessingReason>
                        ) = apply { this.standInProcessingReason = standInProcessingReason }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): Visa =
                            Visa(
                                electronicCommerceIndicator,
                                pointOfServiceEntryMode,
                                standInProcessingReason,
                                additionalProperties.toImmutable(),
                            )
                    }

                    class ElectronicCommerceIndicator
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is ElectronicCommerceIndicator && this.value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()

                        companion object {

                            @JvmField
                            val MAIL_PHONE_ORDER =
                                ElectronicCommerceIndicator(JsonField.of("mail_phone_order"))

                            @JvmField
                            val RECURRING = ElectronicCommerceIndicator(JsonField.of("recurring"))

                            @JvmField
                            val INSTALLMENT =
                                ElectronicCommerceIndicator(JsonField.of("installment"))

                            @JvmField
                            val UNKNOWN_MAIL_PHONE_ORDER =
                                ElectronicCommerceIndicator(
                                    JsonField.of("unknown_mail_phone_order")
                                )

                            @JvmField
                            val SECURE_ELECTRONIC_COMMERCE =
                                ElectronicCommerceIndicator(
                                    JsonField.of("secure_electronic_commerce")
                                )

                            @JvmField
                            val NON_AUTHENTICATED_SECURITY_TRANSACTION_AT_3DS_CAPABLE_MERCHANT =
                                ElectronicCommerceIndicator(
                                    JsonField.of(
                                        "non_authenticated_security_transaction_at_3ds_capable_merchant"
                                    )
                                )

                            @JvmField
                            val NON_AUTHENTICATED_SECURITY_TRANSACTION =
                                ElectronicCommerceIndicator(
                                    JsonField.of("non_authenticated_security_transaction")
                                )

                            @JvmField
                            val NON_SECURE_TRANSACTION =
                                ElectronicCommerceIndicator(JsonField.of("non_secure_transaction"))

                            @JvmStatic
                            fun of(value: String) = ElectronicCommerceIndicator(JsonField.of(value))
                        }

                        enum class Known {
                            MAIL_PHONE_ORDER,
                            RECURRING,
                            INSTALLMENT,
                            UNKNOWN_MAIL_PHONE_ORDER,
                            SECURE_ELECTRONIC_COMMERCE,
                            NON_AUTHENTICATED_SECURITY_TRANSACTION_AT_3DS_CAPABLE_MERCHANT,
                            NON_AUTHENTICATED_SECURITY_TRANSACTION,
                            NON_SECURE_TRANSACTION,
                        }

                        enum class Value {
                            MAIL_PHONE_ORDER,
                            RECURRING,
                            INSTALLMENT,
                            UNKNOWN_MAIL_PHONE_ORDER,
                            SECURE_ELECTRONIC_COMMERCE,
                            NON_AUTHENTICATED_SECURITY_TRANSACTION_AT_3DS_CAPABLE_MERCHANT,
                            NON_AUTHENTICATED_SECURITY_TRANSACTION,
                            NON_SECURE_TRANSACTION,
                            _UNKNOWN,
                        }

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

                        fun asString(): String = _value().asStringOrThrow()
                    }

                    class PointOfServiceEntryMode
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is PointOfServiceEntryMode && this.value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()

                        companion object {

                            @JvmField val UNKNOWN = PointOfServiceEntryMode(JsonField.of("unknown"))

                            @JvmField val MANUAL = PointOfServiceEntryMode(JsonField.of("manual"))

                            @JvmField
                            val MAGNETIC_STRIPE_NO_CVV =
                                PointOfServiceEntryMode(JsonField.of("magnetic_stripe_no_cvv"))

                            @JvmField
                            val OPTICAL_CODE = PointOfServiceEntryMode(JsonField.of("optical_code"))

                            @JvmField
                            val INTEGRATED_CIRCUIT_CARD =
                                PointOfServiceEntryMode(JsonField.of("integrated_circuit_card"))

                            @JvmField
                            val CONTACTLESS = PointOfServiceEntryMode(JsonField.of("contactless"))

                            @JvmField
                            val CREDENTIAL_ON_FILE =
                                PointOfServiceEntryMode(JsonField.of("credential_on_file"))

                            @JvmField
                            val MAGNETIC_STRIPE =
                                PointOfServiceEntryMode(JsonField.of("magnetic_stripe"))

                            @JvmField
                            val CONTACTLESS_MAGNETIC_STRIPE =
                                PointOfServiceEntryMode(JsonField.of("contactless_magnetic_stripe"))

                            @JvmField
                            val INTEGRATED_CIRCUIT_CARD_NO_CVV =
                                PointOfServiceEntryMode(
                                    JsonField.of("integrated_circuit_card_no_cvv")
                                )

                            @JvmStatic
                            fun of(value: String) = PointOfServiceEntryMode(JsonField.of(value))
                        }

                        enum class Known {
                            UNKNOWN,
                            MANUAL,
                            MAGNETIC_STRIPE_NO_CVV,
                            OPTICAL_CODE,
                            INTEGRATED_CIRCUIT_CARD,
                            CONTACTLESS,
                            CREDENTIAL_ON_FILE,
                            MAGNETIC_STRIPE,
                            CONTACTLESS_MAGNETIC_STRIPE,
                            INTEGRATED_CIRCUIT_CARD_NO_CVV,
                        }

                        enum class Value {
                            UNKNOWN,
                            MANUAL,
                            MAGNETIC_STRIPE_NO_CVV,
                            OPTICAL_CODE,
                            INTEGRATED_CIRCUIT_CARD,
                            CONTACTLESS,
                            CREDENTIAL_ON_FILE,
                            MAGNETIC_STRIPE,
                            CONTACTLESS_MAGNETIC_STRIPE,
                            INTEGRATED_CIRCUIT_CARD_NO_CVV,
                            _UNKNOWN,
                        }

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

                        fun asString(): String = _value().asStringOrThrow()
                    }

                    class StandInProcessingReason
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is StandInProcessingReason && this.value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()

                        companion object {

                            @JvmField
                            val ISSUER_ERROR = StandInProcessingReason(JsonField.of("issuer_error"))

                            @JvmField
                            val INVALID_PHYSICAL_CARD =
                                StandInProcessingReason(JsonField.of("invalid_physical_card"))

                            @JvmField
                            val INVALID_CARDHOLDER_AUTHENTICATION_VERIFICATION_VALUE =
                                StandInProcessingReason(
                                    JsonField.of(
                                        "invalid_cardholder_authentication_verification_value"
                                    )
                                )

                            @JvmField
                            val INTERNAL_VISA_ERROR =
                                StandInProcessingReason(JsonField.of("internal_visa_error"))

                            @JvmField
                            val MERCHANT_TRANSACTION_ADVISORY_SERVICE_AUTHENTICATION_REQUIRED =
                                StandInProcessingReason(
                                    JsonField.of(
                                        "merchant_transaction_advisory_service_authentication_required"
                                    )
                                )

                            @JvmField val OTHER = StandInProcessingReason(JsonField.of("other"))

                            @JvmStatic
                            fun of(value: String) = StandInProcessingReason(JsonField.of(value))
                        }

                        enum class Known {
                            ISSUER_ERROR,
                            INVALID_PHYSICAL_CARD,
                            INVALID_CARDHOLDER_AUTHENTICATION_VERIFICATION_VALUE,
                            INTERNAL_VISA_ERROR,
                            MERCHANT_TRANSACTION_ADVISORY_SERVICE_AUTHENTICATION_REQUIRED,
                            OTHER,
                        }

                        enum class Value {
                            ISSUER_ERROR,
                            INVALID_PHYSICAL_CARD,
                            INVALID_CARDHOLDER_AUTHENTICATION_VERIFICATION_VALUE,
                            INTERNAL_VISA_ERROR,
                            MERCHANT_TRANSACTION_ADVISORY_SERVICE_AUTHENTICATION_REQUIRED,
                            OTHER,
                            _UNKNOWN,
                        }

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
                                OTHER -> Value.OTHER
                                else -> Value._UNKNOWN
                            }

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
                                OTHER -> Known.OTHER
                                else ->
                                    throw IncreaseInvalidDataException(
                                        "Unknown StandInProcessingReason: $value"
                                    )
                            }

                        fun asString(): String = _value().asStringOrThrow()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Visa && this.electronicCommerceIndicator == other.electronicCommerceIndicator && this.pointOfServiceEntryMode == other.pointOfServiceEntryMode && this.standInProcessingReason == other.standInProcessingReason && this.additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    private var hashCode: Int = 0

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode = /* spotless:off */ Objects.hash(electronicCommerceIndicator, pointOfServiceEntryMode, standInProcessingReason, additionalProperties) /* spotless:on */
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "Visa{electronicCommerceIndicator=$electronicCommerceIndicator, pointOfServiceEntryMode=$pointOfServiceEntryMode, standInProcessingReason=$standInProcessingReason, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is NetworkDetails && this.category == other.category && this.visa == other.visa && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(category, visa, additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "NetworkDetails{category=$category, visa=$visa, additionalProperties=$additionalProperties}"
            }

            /** Network-specific identifiers for a specific request or transaction. */
            @JsonDeserialize(builder = NetworkIdentifiers.Builder::class)
            @NoAutoDetect
            class NetworkIdentifiers
            private constructor(
                private val retrievalReferenceNumber: JsonField<String>,
                private val traceNumber: JsonField<String>,
                private val transactionId: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

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
                fun _retrievalReferenceNumber() = retrievalReferenceNumber

                /**
                 * A counter used to verify an individual authorization. Expected to be unique per
                 * acquirer within a window of time.
                 */
                @JsonProperty("trace_number") @ExcludeMissing fun _traceNumber() = traceNumber

                /**
                 * A globally unique transaction identifier provided by the card network, used
                 * across multiple life-cycle requests.
                 */
                @JsonProperty("transaction_id") @ExcludeMissing fun _transactionId() = transactionId

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): NetworkIdentifiers = apply {
                    if (!validated) {
                        retrievalReferenceNumber()
                        traceNumber()
                        transactionId()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var retrievalReferenceNumber: JsonField<String> = JsonMissing.of()
                    private var traceNumber: JsonField<String> = JsonMissing.of()
                    private var transactionId: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(networkIdentifiers: NetworkIdentifiers) = apply {
                        this.retrievalReferenceNumber = networkIdentifiers.retrievalReferenceNumber
                        this.traceNumber = networkIdentifiers.traceNumber
                        this.transactionId = networkIdentifiers.transactionId
                        additionalProperties(networkIdentifiers.additionalProperties)
                    }

                    /**
                     * A life-cycle identifier used across e.g., an authorization and a reversal.
                     * Expected to be unique per acquirer within a window of time. For some card
                     * networks the retrieval reference number includes the trace counter.
                     */
                    fun retrievalReferenceNumber(retrievalReferenceNumber: String) =
                        retrievalReferenceNumber(JsonField.of(retrievalReferenceNumber))

                    /**
                     * A life-cycle identifier used across e.g., an authorization and a reversal.
                     * Expected to be unique per acquirer within a window of time. For some card
                     * networks the retrieval reference number includes the trace counter.
                     */
                    @JsonProperty("retrieval_reference_number")
                    @ExcludeMissing
                    fun retrievalReferenceNumber(retrievalReferenceNumber: JsonField<String>) =
                        apply {
                            this.retrievalReferenceNumber = retrievalReferenceNumber
                        }

                    /**
                     * A counter used to verify an individual authorization. Expected to be unique
                     * per acquirer within a window of time.
                     */
                    fun traceNumber(traceNumber: String) = traceNumber(JsonField.of(traceNumber))

                    /**
                     * A counter used to verify an individual authorization. Expected to be unique
                     * per acquirer within a window of time.
                     */
                    @JsonProperty("trace_number")
                    @ExcludeMissing
                    fun traceNumber(traceNumber: JsonField<String>) = apply {
                        this.traceNumber = traceNumber
                    }

                    /**
                     * A globally unique transaction identifier provided by the card network, used
                     * across multiple life-cycle requests.
                     */
                    fun transactionId(transactionId: String) =
                        transactionId(JsonField.of(transactionId))

                    /**
                     * A globally unique transaction identifier provided by the card network, used
                     * across multiple life-cycle requests.
                     */
                    @JsonProperty("transaction_id")
                    @ExcludeMissing
                    fun transactionId(transactionId: JsonField<String>) = apply {
                        this.transactionId = transactionId
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): NetworkIdentifiers =
                        NetworkIdentifiers(
                            retrievalReferenceNumber,
                            traceNumber,
                            transactionId,
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is NetworkIdentifiers && this.retrievalReferenceNumber == other.retrievalReferenceNumber && this.traceNumber == other.traceNumber && this.transactionId == other.transactionId && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(retrievalReferenceNumber, traceNumber, transactionId, additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "NetworkIdentifiers{retrievalReferenceNumber=$retrievalReferenceNumber, traceNumber=$traceNumber, transactionId=$transactionId, additionalProperties=$additionalProperties}"
            }

            class ProcessingCategory
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is ProcessingCategory && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    @JvmField
                    val ACCOUNT_FUNDING = ProcessingCategory(JsonField.of("account_funding"))

                    @JvmField
                    val AUTOMATIC_FUEL_DISPENSER =
                        ProcessingCategory(JsonField.of("automatic_fuel_dispenser"))

                    @JvmField val BILL_PAYMENT = ProcessingCategory(JsonField.of("bill_payment"))

                    @JvmField val PURCHASE = ProcessingCategory(JsonField.of("purchase"))

                    @JvmField val QUASI_CASH = ProcessingCategory(JsonField.of("quasi_cash"))

                    @JvmField val REFUND = ProcessingCategory(JsonField.of("refund"))

                    @JvmStatic fun of(value: String) = ProcessingCategory(JsonField.of(value))
                }

                enum class Known {
                    ACCOUNT_FUNDING,
                    AUTOMATIC_FUEL_DISPENSER,
                    BILL_PAYMENT,
                    PURCHASE,
                    QUASI_CASH,
                    REFUND,
                }

                enum class Value {
                    ACCOUNT_FUNDING,
                    AUTOMATIC_FUEL_DISPENSER,
                    BILL_PAYMENT,
                    PURCHASE,
                    QUASI_CASH,
                    REFUND,
                    _UNKNOWN,
                }

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

                fun asString(): String = _value().asStringOrThrow()
            }

            class Reason
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Reason && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    @JvmField val CARD_NOT_ACTIVE = Reason(JsonField.of("card_not_active"))

                    @JvmField
                    val PHYSICAL_CARD_NOT_ACTIVE = Reason(JsonField.of("physical_card_not_active"))

                    @JvmField val ENTITY_NOT_ACTIVE = Reason(JsonField.of("entity_not_active"))

                    @JvmField val GROUP_LOCKED = Reason(JsonField.of("group_locked"))

                    @JvmField val INSUFFICIENT_FUNDS = Reason(JsonField.of("insufficient_funds"))

                    @JvmField val CVV2_MISMATCH = Reason(JsonField.of("cvv2_mismatch"))

                    @JvmField
                    val CARD_EXPIRATION_MISMATCH = Reason(JsonField.of("card_expiration_mismatch"))

                    @JvmField
                    val TRANSACTION_NOT_ALLOWED = Reason(JsonField.of("transaction_not_allowed"))

                    @JvmField val BREACHES_LIMIT = Reason(JsonField.of("breaches_limit"))

                    @JvmField val WEBHOOK_DECLINED = Reason(JsonField.of("webhook_declined"))

                    @JvmField val WEBHOOK_TIMED_OUT = Reason(JsonField.of("webhook_timed_out"))

                    @JvmField
                    val DECLINED_BY_STAND_IN_PROCESSING =
                        Reason(JsonField.of("declined_by_stand_in_processing"))

                    @JvmField
                    val INVALID_PHYSICAL_CARD = Reason(JsonField.of("invalid_physical_card"))

                    @JvmField
                    val MISSING_ORIGINAL_AUTHORIZATION =
                        Reason(JsonField.of("missing_original_authorization"))

                    @JvmField val SUSPECTED_FRAUD = Reason(JsonField.of("suspected_fraud"))

                    @JvmStatic fun of(value: String) = Reason(JsonField.of(value))
                }

                enum class Known {
                    CARD_NOT_ACTIVE,
                    PHYSICAL_CARD_NOT_ACTIVE,
                    ENTITY_NOT_ACTIVE,
                    GROUP_LOCKED,
                    INSUFFICIENT_FUNDS,
                    CVV2_MISMATCH,
                    CARD_EXPIRATION_MISMATCH,
                    TRANSACTION_NOT_ALLOWED,
                    BREACHES_LIMIT,
                    WEBHOOK_DECLINED,
                    WEBHOOK_TIMED_OUT,
                    DECLINED_BY_STAND_IN_PROCESSING,
                    INVALID_PHYSICAL_CARD,
                    MISSING_ORIGINAL_AUTHORIZATION,
                    SUSPECTED_FRAUD,
                }

                enum class Value {
                    CARD_NOT_ACTIVE,
                    PHYSICAL_CARD_NOT_ACTIVE,
                    ENTITY_NOT_ACTIVE,
                    GROUP_LOCKED,
                    INSUFFICIENT_FUNDS,
                    CVV2_MISMATCH,
                    CARD_EXPIRATION_MISMATCH,
                    TRANSACTION_NOT_ALLOWED,
                    BREACHES_LIMIT,
                    WEBHOOK_DECLINED,
                    WEBHOOK_TIMED_OUT,
                    DECLINED_BY_STAND_IN_PROCESSING,
                    INVALID_PHYSICAL_CARD,
                    MISSING_ORIGINAL_AUTHORIZATION,
                    SUSPECTED_FRAUD,
                    _UNKNOWN,
                }

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

                fun asString(): String = _value().asStringOrThrow()
            }

            /** Fields related to verification of cardholder-provided values. */
            @JsonDeserialize(builder = Verification.Builder::class)
            @NoAutoDetect
            class Verification
            private constructor(
                private val cardVerificationCode: JsonField<CardVerificationCode>,
                private val cardholderAddress: JsonField<CardholderAddress>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

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
                fun _cardVerificationCode() = cardVerificationCode

                /**
                 * Cardholder address provided in the authorization request and the address on file
                 * we verified it against.
                 */
                @JsonProperty("cardholder_address")
                @ExcludeMissing
                fun _cardholderAddress() = cardholderAddress

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Verification = apply {
                    if (!validated) {
                        cardVerificationCode().validate()
                        cardholderAddress().validate()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var cardVerificationCode: JsonField<CardVerificationCode> =
                        JsonMissing.of()
                    private var cardholderAddress: JsonField<CardholderAddress> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(verification: Verification) = apply {
                        this.cardVerificationCode = verification.cardVerificationCode
                        this.cardholderAddress = verification.cardholderAddress
                        additionalProperties(verification.additionalProperties)
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
                    @JsonProperty("card_verification_code")
                    @ExcludeMissing
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
                    @JsonProperty("cardholder_address")
                    @ExcludeMissing
                    fun cardholderAddress(cardholderAddress: JsonField<CardholderAddress>) = apply {
                        this.cardholderAddress = cardholderAddress
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): Verification =
                        Verification(
                            cardVerificationCode,
                            cardholderAddress,
                            additionalProperties.toImmutable(),
                        )
                }

                /**
                 * Fields related to verification of the Card Verification Code, a 3-digit code on
                 * the back of the card.
                 */
                @JsonDeserialize(builder = CardVerificationCode.Builder::class)
                @NoAutoDetect
                class CardVerificationCode
                private constructor(
                    private val result: JsonField<Result>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    /** The result of verifying the Card Verification Code. */
                    fun result(): Result = result.getRequired("result")

                    /** The result of verifying the Card Verification Code. */
                    @JsonProperty("result") @ExcludeMissing fun _result() = result

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): CardVerificationCode = apply {
                        if (!validated) {
                            result()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var result: JsonField<Result> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(cardVerificationCode: CardVerificationCode) = apply {
                            this.result = cardVerificationCode.result
                            additionalProperties(cardVerificationCode.additionalProperties)
                        }

                        /** The result of verifying the Card Verification Code. */
                        fun result(result: Result) = result(JsonField.of(result))

                        /** The result of verifying the Card Verification Code. */
                        @JsonProperty("result")
                        @ExcludeMissing
                        fun result(result: JsonField<Result>) = apply { this.result = result }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): CardVerificationCode =
                            CardVerificationCode(result, additionalProperties.toImmutable())
                    }

                    class Result
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Result && this.value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()

                        companion object {

                            @JvmField val NOT_CHECKED = Result(JsonField.of("not_checked"))

                            @JvmField val MATCH = Result(JsonField.of("match"))

                            @JvmField val NO_MATCH = Result(JsonField.of("no_match"))

                            @JvmStatic fun of(value: String) = Result(JsonField.of(value))
                        }

                        enum class Known {
                            NOT_CHECKED,
                            MATCH,
                            NO_MATCH,
                        }

                        enum class Value {
                            NOT_CHECKED,
                            MATCH,
                            NO_MATCH,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                NOT_CHECKED -> Value.NOT_CHECKED
                                MATCH -> Value.MATCH
                                NO_MATCH -> Value.NO_MATCH
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                NOT_CHECKED -> Known.NOT_CHECKED
                                MATCH -> Known.MATCH
                                NO_MATCH -> Known.NO_MATCH
                                else -> throw IncreaseInvalidDataException("Unknown Result: $value")
                            }

                        fun asString(): String = _value().asStringOrThrow()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is CardVerificationCode && this.result == other.result && this.additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    private var hashCode: Int = 0

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode = /* spotless:off */ Objects.hash(result, additionalProperties) /* spotless:on */
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "CardVerificationCode{result=$result, additionalProperties=$additionalProperties}"
                }

                /**
                 * Cardholder address provided in the authorization request and the address on file
                 * we verified it against.
                 */
                @JsonDeserialize(builder = CardholderAddress.Builder::class)
                @NoAutoDetect
                class CardholderAddress
                private constructor(
                    private val actualLine1: JsonField<String>,
                    private val actualPostalCode: JsonField<String>,
                    private val providedLine1: JsonField<String>,
                    private val providedPostalCode: JsonField<String>,
                    private val result: JsonField<Result>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

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
                    @JsonProperty("actual_line1") @ExcludeMissing fun _actualLine1() = actualLine1

                    /** The postal code of the address on file for the cardholder. */
                    @JsonProperty("actual_postal_code")
                    @ExcludeMissing
                    fun _actualPostalCode() = actualPostalCode

                    /**
                     * The cardholder address line 1 provided for verification in the authorization
                     * request.
                     */
                    @JsonProperty("provided_line1")
                    @ExcludeMissing
                    fun _providedLine1() = providedLine1

                    /** The postal code provided for verification in the authorization request. */
                    @JsonProperty("provided_postal_code")
                    @ExcludeMissing
                    fun _providedPostalCode() = providedPostalCode

                    /** The address verification result returned to the card network. */
                    @JsonProperty("result") @ExcludeMissing fun _result() = result

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): CardholderAddress = apply {
                        if (!validated) {
                            actualLine1()
                            actualPostalCode()
                            providedLine1()
                            providedPostalCode()
                            result()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var actualLine1: JsonField<String> = JsonMissing.of()
                        private var actualPostalCode: JsonField<String> = JsonMissing.of()
                        private var providedLine1: JsonField<String> = JsonMissing.of()
                        private var providedPostalCode: JsonField<String> = JsonMissing.of()
                        private var result: JsonField<Result> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(cardholderAddress: CardholderAddress) = apply {
                            this.actualLine1 = cardholderAddress.actualLine1
                            this.actualPostalCode = cardholderAddress.actualPostalCode
                            this.providedLine1 = cardholderAddress.providedLine1
                            this.providedPostalCode = cardholderAddress.providedPostalCode
                            this.result = cardholderAddress.result
                            additionalProperties(cardholderAddress.additionalProperties)
                        }

                        /** Line 1 of the address on file for the cardholder. */
                        fun actualLine1(actualLine1: String) =
                            actualLine1(JsonField.of(actualLine1))

                        /** Line 1 of the address on file for the cardholder. */
                        @JsonProperty("actual_line1")
                        @ExcludeMissing
                        fun actualLine1(actualLine1: JsonField<String>) = apply {
                            this.actualLine1 = actualLine1
                        }

                        /** The postal code of the address on file for the cardholder. */
                        fun actualPostalCode(actualPostalCode: String) =
                            actualPostalCode(JsonField.of(actualPostalCode))

                        /** The postal code of the address on file for the cardholder. */
                        @JsonProperty("actual_postal_code")
                        @ExcludeMissing
                        fun actualPostalCode(actualPostalCode: JsonField<String>) = apply {
                            this.actualPostalCode = actualPostalCode
                        }

                        /**
                         * The cardholder address line 1 provided for verification in the
                         * authorization request.
                         */
                        fun providedLine1(providedLine1: String) =
                            providedLine1(JsonField.of(providedLine1))

                        /**
                         * The cardholder address line 1 provided for verification in the
                         * authorization request.
                         */
                        @JsonProperty("provided_line1")
                        @ExcludeMissing
                        fun providedLine1(providedLine1: JsonField<String>) = apply {
                            this.providedLine1 = providedLine1
                        }

                        /**
                         * The postal code provided for verification in the authorization request.
                         */
                        fun providedPostalCode(providedPostalCode: String) =
                            providedPostalCode(JsonField.of(providedPostalCode))

                        /**
                         * The postal code provided for verification in the authorization request.
                         */
                        @JsonProperty("provided_postal_code")
                        @ExcludeMissing
                        fun providedPostalCode(providedPostalCode: JsonField<String>) = apply {
                            this.providedPostalCode = providedPostalCode
                        }

                        /** The address verification result returned to the card network. */
                        fun result(result: Result) = result(JsonField.of(result))

                        /** The address verification result returned to the card network. */
                        @JsonProperty("result")
                        @ExcludeMissing
                        fun result(result: JsonField<Result>) = apply { this.result = result }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): CardholderAddress =
                            CardholderAddress(
                                actualLine1,
                                actualPostalCode,
                                providedLine1,
                                providedPostalCode,
                                result,
                                additionalProperties.toImmutable(),
                            )
                    }

                    class Result
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Result && this.value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()

                        companion object {

                            @JvmField val NOT_CHECKED = Result(JsonField.of("not_checked"))

                            @JvmField
                            val POSTAL_CODE_MATCH_ADDRESS_NOT_CHECKED =
                                Result(JsonField.of("postal_code_match_address_not_checked"))

                            @JvmField
                            val POSTAL_CODE_MATCH_ADDRESS_NO_MATCH =
                                Result(JsonField.of("postal_code_match_address_no_match"))

                            @JvmField
                            val POSTAL_CODE_NO_MATCH_ADDRESS_MATCH =
                                Result(JsonField.of("postal_code_no_match_address_match"))

                            @JvmField val MATCH = Result(JsonField.of("match"))

                            @JvmField val NO_MATCH = Result(JsonField.of("no_match"))

                            @JvmStatic fun of(value: String) = Result(JsonField.of(value))
                        }

                        enum class Known {
                            NOT_CHECKED,
                            POSTAL_CODE_MATCH_ADDRESS_NOT_CHECKED,
                            POSTAL_CODE_MATCH_ADDRESS_NO_MATCH,
                            POSTAL_CODE_NO_MATCH_ADDRESS_MATCH,
                            MATCH,
                            NO_MATCH,
                        }

                        enum class Value {
                            NOT_CHECKED,
                            POSTAL_CODE_MATCH_ADDRESS_NOT_CHECKED,
                            POSTAL_CODE_MATCH_ADDRESS_NO_MATCH,
                            POSTAL_CODE_NO_MATCH_ADDRESS_MATCH,
                            MATCH,
                            NO_MATCH,
                            _UNKNOWN,
                        }

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

                        fun asString(): String = _value().asStringOrThrow()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is CardholderAddress && this.actualLine1 == other.actualLine1 && this.actualPostalCode == other.actualPostalCode && this.providedLine1 == other.providedLine1 && this.providedPostalCode == other.providedPostalCode && this.result == other.result && this.additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    private var hashCode: Int = 0

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode = /* spotless:off */ Objects.hash(actualLine1, actualPostalCode, providedLine1, providedPostalCode, result, additionalProperties) /* spotless:on */
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "CardholderAddress{actualLine1=$actualLine1, actualPostalCode=$actualPostalCode, providedLine1=$providedLine1, providedPostalCode=$providedPostalCode, result=$result, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Verification && this.cardVerificationCode == other.cardVerificationCode && this.cardholderAddress == other.cardholderAddress && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(cardVerificationCode, cardholderAddress, additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "Verification{cardVerificationCode=$cardVerificationCode, cardholderAddress=$cardholderAddress, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is CardDecline && this.actioner == other.actioner && this.amount == other.amount && this.cardPaymentId == other.cardPaymentId && this.currency == other.currency && this.declinedTransactionId == other.declinedTransactionId && this.digitalWalletTokenId == other.digitalWalletTokenId && this.direction == other.direction && this.id == other.id && this.merchantAcceptorId == other.merchantAcceptorId && this.merchantCategoryCode == other.merchantCategoryCode && this.merchantCity == other.merchantCity && this.merchantCountry == other.merchantCountry && this.merchantDescriptor == other.merchantDescriptor && this.merchantPostalCode == other.merchantPostalCode && this.merchantState == other.merchantState && this.networkDetails == other.networkDetails && this.networkIdentifiers == other.networkIdentifiers && this.networkRiskScore == other.networkRiskScore && this.physicalCardId == other.physicalCardId && this.presentmentAmount == other.presentmentAmount && this.presentmentCurrency == other.presentmentCurrency && this.processingCategory == other.processingCategory && this.realTimeDecisionId == other.realTimeDecisionId && this.reason == other.reason && this.verification == other.verification && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(actioner, amount, cardPaymentId, currency, declinedTransactionId, digitalWalletTokenId, direction, id, merchantAcceptorId, merchantCategoryCode, merchantCity, merchantCountry, merchantDescriptor, merchantPostalCode, merchantState, networkDetails, networkIdentifiers, networkRiskScore, physicalCardId, presentmentAmount, presentmentCurrency, processingCategory, realTimeDecisionId, reason, verification, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "CardDecline{actioner=$actioner, amount=$amount, cardPaymentId=$cardPaymentId, currency=$currency, declinedTransactionId=$declinedTransactionId, digitalWalletTokenId=$digitalWalletTokenId, direction=$direction, id=$id, merchantAcceptorId=$merchantAcceptorId, merchantCategoryCode=$merchantCategoryCode, merchantCity=$merchantCity, merchantCountry=$merchantCountry, merchantDescriptor=$merchantDescriptor, merchantPostalCode=$merchantPostalCode, merchantState=$merchantState, networkDetails=$networkDetails, networkIdentifiers=$networkIdentifiers, networkRiskScore=$networkRiskScore, physicalCardId=$physicalCardId, presentmentAmount=$presentmentAmount, presentmentCurrency=$presentmentCurrency, processingCategory=$processingCategory, realTimeDecisionId=$realTimeDecisionId, reason=$reason, verification=$verification, additionalProperties=$additionalProperties}"
        }

        class Category
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Category && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val ACH_DECLINE = Category(JsonField.of("ach_decline"))

                @JvmField val CARD_DECLINE = Category(JsonField.of("card_decline"))

                @JvmField val CHECK_DECLINE = Category(JsonField.of("check_decline"))

                @JvmField
                val INBOUND_REAL_TIME_PAYMENTS_TRANSFER_DECLINE =
                    Category(JsonField.of("inbound_real_time_payments_transfer_decline"))

                @JvmField val WIRE_DECLINE = Category(JsonField.of("wire_decline"))

                @JvmField
                val CHECK_DEPOSIT_REJECTION = Category(JsonField.of("check_deposit_rejection"))

                @JvmField val OTHER = Category(JsonField.of("other"))

                @JvmStatic fun of(value: String) = Category(JsonField.of(value))
            }

            enum class Known {
                ACH_DECLINE,
                CARD_DECLINE,
                CHECK_DECLINE,
                INBOUND_REAL_TIME_PAYMENTS_TRANSFER_DECLINE,
                WIRE_DECLINE,
                CHECK_DEPOSIT_REJECTION,
                OTHER,
            }

            enum class Value {
                ACH_DECLINE,
                CARD_DECLINE,
                CHECK_DECLINE,
                INBOUND_REAL_TIME_PAYMENTS_TRANSFER_DECLINE,
                WIRE_DECLINE,
                CHECK_DEPOSIT_REJECTION,
                OTHER,
                _UNKNOWN,
            }

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

            fun asString(): String = _value().asStringOrThrow()
        }

        /**
         * A Check Decline object. This field will be present in the JSON response if and only if
         * `category` is equal to `check_decline`.
         */
        @JsonDeserialize(builder = CheckDecline.Builder::class)
        @NoAutoDetect
        class CheckDecline
        private constructor(
            private val amount: JsonField<Long>,
            private val auxiliaryOnUs: JsonField<String>,
            private val backImageFileId: JsonField<String>,
            private val checkTransferId: JsonField<String>,
            private val frontImageFileId: JsonField<String>,
            private val inboundCheckDepositId: JsonField<String>,
            private val reason: JsonField<Reason>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

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
            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            /**
             * A computer-readable number printed on the MICR line of business checks, usually the
             * check number. This is useful for positive pay checks, but can be unreliably
             * transmitted by the bank of first deposit.
             */
            @JsonProperty("auxiliary_on_us") @ExcludeMissing fun _auxiliaryOnUs() = auxiliaryOnUs

            /**
             * The identifier of the API File object containing an image of the back of the declined
             * check.
             */
            @JsonProperty("back_image_file_id")
            @ExcludeMissing
            fun _backImageFileId() = backImageFileId

            /** The identifier of the Check Transfer object associated with this decline. */
            @JsonProperty("check_transfer_id")
            @ExcludeMissing
            fun _checkTransferId() = checkTransferId

            /**
             * The identifier of the API File object containing an image of the front of the
             * declined check.
             */
            @JsonProperty("front_image_file_id")
            @ExcludeMissing
            fun _frontImageFileId() = frontImageFileId

            /** The identifier of the Inbound Check Deposit object associated with this decline. */
            @JsonProperty("inbound_check_deposit_id")
            @ExcludeMissing
            fun _inboundCheckDepositId() = inboundCheckDepositId

            /** Why the check was declined. */
            @JsonProperty("reason") @ExcludeMissing fun _reason() = reason

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): CheckDecline = apply {
                if (!validated) {
                    amount()
                    auxiliaryOnUs()
                    backImageFileId()
                    checkTransferId()
                    frontImageFileId()
                    inboundCheckDepositId()
                    reason()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var amount: JsonField<Long> = JsonMissing.of()
                private var auxiliaryOnUs: JsonField<String> = JsonMissing.of()
                private var backImageFileId: JsonField<String> = JsonMissing.of()
                private var checkTransferId: JsonField<String> = JsonMissing.of()
                private var frontImageFileId: JsonField<String> = JsonMissing.of()
                private var inboundCheckDepositId: JsonField<String> = JsonMissing.of()
                private var reason: JsonField<Reason> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(checkDecline: CheckDecline) = apply {
                    this.amount = checkDecline.amount
                    this.auxiliaryOnUs = checkDecline.auxiliaryOnUs
                    this.backImageFileId = checkDecline.backImageFileId
                    this.checkTransferId = checkDecline.checkTransferId
                    this.frontImageFileId = checkDecline.frontImageFileId
                    this.inboundCheckDepositId = checkDecline.inboundCheckDepositId
                    this.reason = checkDecline.reason
                    additionalProperties(checkDecline.additionalProperties)
                }

                /** The declined amount in USD cents. */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /** The declined amount in USD cents. */
                @JsonProperty("amount")
                @ExcludeMissing
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /**
                 * A computer-readable number printed on the MICR line of business checks, usually
                 * the check number. This is useful for positive pay checks, but can be unreliably
                 * transmitted by the bank of first deposit.
                 */
                fun auxiliaryOnUs(auxiliaryOnUs: String) =
                    auxiliaryOnUs(JsonField.of(auxiliaryOnUs))

                /**
                 * A computer-readable number printed on the MICR line of business checks, usually
                 * the check number. This is useful for positive pay checks, but can be unreliably
                 * transmitted by the bank of first deposit.
                 */
                @JsonProperty("auxiliary_on_us")
                @ExcludeMissing
                fun auxiliaryOnUs(auxiliaryOnUs: JsonField<String>) = apply {
                    this.auxiliaryOnUs = auxiliaryOnUs
                }

                /**
                 * The identifier of the API File object containing an image of the back of the
                 * declined check.
                 */
                fun backImageFileId(backImageFileId: String) =
                    backImageFileId(JsonField.of(backImageFileId))

                /**
                 * The identifier of the API File object containing an image of the back of the
                 * declined check.
                 */
                @JsonProperty("back_image_file_id")
                @ExcludeMissing
                fun backImageFileId(backImageFileId: JsonField<String>) = apply {
                    this.backImageFileId = backImageFileId
                }

                /** The identifier of the Check Transfer object associated with this decline. */
                fun checkTransferId(checkTransferId: String) =
                    checkTransferId(JsonField.of(checkTransferId))

                /** The identifier of the Check Transfer object associated with this decline. */
                @JsonProperty("check_transfer_id")
                @ExcludeMissing
                fun checkTransferId(checkTransferId: JsonField<String>) = apply {
                    this.checkTransferId = checkTransferId
                }

                /**
                 * The identifier of the API File object containing an image of the front of the
                 * declined check.
                 */
                fun frontImageFileId(frontImageFileId: String) =
                    frontImageFileId(JsonField.of(frontImageFileId))

                /**
                 * The identifier of the API File object containing an image of the front of the
                 * declined check.
                 */
                @JsonProperty("front_image_file_id")
                @ExcludeMissing
                fun frontImageFileId(frontImageFileId: JsonField<String>) = apply {
                    this.frontImageFileId = frontImageFileId
                }

                /**
                 * The identifier of the Inbound Check Deposit object associated with this decline.
                 */
                fun inboundCheckDepositId(inboundCheckDepositId: String) =
                    inboundCheckDepositId(JsonField.of(inboundCheckDepositId))

                /**
                 * The identifier of the Inbound Check Deposit object associated with this decline.
                 */
                @JsonProperty("inbound_check_deposit_id")
                @ExcludeMissing
                fun inboundCheckDepositId(inboundCheckDepositId: JsonField<String>) = apply {
                    this.inboundCheckDepositId = inboundCheckDepositId
                }

                /** Why the check was declined. */
                fun reason(reason: Reason) = reason(JsonField.of(reason))

                /** Why the check was declined. */
                @JsonProperty("reason")
                @ExcludeMissing
                fun reason(reason: JsonField<Reason>) = apply { this.reason = reason }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): CheckDecline =
                    CheckDecline(
                        amount,
                        auxiliaryOnUs,
                        backImageFileId,
                        checkTransferId,
                        frontImageFileId,
                        inboundCheckDepositId,
                        reason,
                        additionalProperties.toImmutable(),
                    )
            }

            class Reason
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Reason && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    @JvmField val ACH_ROUTE_DISABLED = Reason(JsonField.of("ach_route_disabled"))

                    @JvmField val ACH_ROUTE_CANCELED = Reason(JsonField.of("ach_route_canceled"))

                    @JvmField
                    val ALTERED_OR_FICTITIOUS = Reason(JsonField.of("altered_or_fictitious"))

                    @JvmField val BREACHES_LIMIT = Reason(JsonField.of("breaches_limit"))

                    @JvmField
                    val ENDORSEMENT_IRREGULAR = Reason(JsonField.of("endorsement_irregular"))

                    @JvmField val ENTITY_NOT_ACTIVE = Reason(JsonField.of("entity_not_active"))

                    @JvmField val GROUP_LOCKED = Reason(JsonField.of("group_locked"))

                    @JvmField val INSUFFICIENT_FUNDS = Reason(JsonField.of("insufficient_funds"))

                    @JvmField
                    val STOP_PAYMENT_REQUESTED = Reason(JsonField.of("stop_payment_requested"))

                    @JvmField
                    val DUPLICATE_PRESENTMENT = Reason(JsonField.of("duplicate_presentment"))

                    @JvmField val NOT_AUTHORIZED = Reason(JsonField.of("not_authorized"))

                    @JvmField val AMOUNT_MISMATCH = Reason(JsonField.of("amount_mismatch"))

                    @JvmField val NOT_OUR_ITEM = Reason(JsonField.of("not_our_item"))

                    @JvmField
                    val NO_ACCOUNT_NUMBER_FOUND = Reason(JsonField.of("no_account_number_found"))

                    @JvmField val REFER_TO_IMAGE = Reason(JsonField.of("refer_to_image"))

                    @JvmField val UNABLE_TO_PROCESS = Reason(JsonField.of("unable_to_process"))

                    @JvmField val USER_INITIATED = Reason(JsonField.of("user_initiated"))

                    @JvmStatic fun of(value: String) = Reason(JsonField.of(value))
                }

                enum class Known {
                    ACH_ROUTE_DISABLED,
                    ACH_ROUTE_CANCELED,
                    ALTERED_OR_FICTITIOUS,
                    BREACHES_LIMIT,
                    ENDORSEMENT_IRREGULAR,
                    ENTITY_NOT_ACTIVE,
                    GROUP_LOCKED,
                    INSUFFICIENT_FUNDS,
                    STOP_PAYMENT_REQUESTED,
                    DUPLICATE_PRESENTMENT,
                    NOT_AUTHORIZED,
                    AMOUNT_MISMATCH,
                    NOT_OUR_ITEM,
                    NO_ACCOUNT_NUMBER_FOUND,
                    REFER_TO_IMAGE,
                    UNABLE_TO_PROCESS,
                    USER_INITIATED,
                }

                enum class Value {
                    ACH_ROUTE_DISABLED,
                    ACH_ROUTE_CANCELED,
                    ALTERED_OR_FICTITIOUS,
                    BREACHES_LIMIT,
                    ENDORSEMENT_IRREGULAR,
                    ENTITY_NOT_ACTIVE,
                    GROUP_LOCKED,
                    INSUFFICIENT_FUNDS,
                    STOP_PAYMENT_REQUESTED,
                    DUPLICATE_PRESENTMENT,
                    NOT_AUTHORIZED,
                    AMOUNT_MISMATCH,
                    NOT_OUR_ITEM,
                    NO_ACCOUNT_NUMBER_FOUND,
                    REFER_TO_IMAGE,
                    UNABLE_TO_PROCESS,
                    USER_INITIATED,
                    _UNKNOWN,
                }

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

                fun asString(): String = _value().asStringOrThrow()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is CheckDecline && this.amount == other.amount && this.auxiliaryOnUs == other.auxiliaryOnUs && this.backImageFileId == other.backImageFileId && this.checkTransferId == other.checkTransferId && this.frontImageFileId == other.frontImageFileId && this.inboundCheckDepositId == other.inboundCheckDepositId && this.reason == other.reason && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(amount, auxiliaryOnUs, backImageFileId, checkTransferId, frontImageFileId, inboundCheckDepositId, reason, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "CheckDecline{amount=$amount, auxiliaryOnUs=$auxiliaryOnUs, backImageFileId=$backImageFileId, checkTransferId=$checkTransferId, frontImageFileId=$frontImageFileId, inboundCheckDepositId=$inboundCheckDepositId, reason=$reason, additionalProperties=$additionalProperties}"
        }

        /**
         * A Check Deposit Rejection object. This field will be present in the JSON response if and
         * only if `category` is equal to `check_deposit_rejection`.
         */
        @JsonDeserialize(builder = CheckDepositRejection.Builder::class)
        @NoAutoDetect
        class CheckDepositRejection
        private constructor(
            private val amount: JsonField<Long>,
            private val checkDepositId: JsonField<String>,
            private val currency: JsonField<Currency>,
            private val declinedTransactionId: JsonField<String>,
            private val reason: JsonField<Reason>,
            private val rejectedAt: JsonField<OffsetDateTime>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

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
            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            /** The identifier of the Check Deposit that was rejected. */
            @JsonProperty("check_deposit_id") @ExcludeMissing fun _checkDepositId() = checkDepositId

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the check's currency.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            /** The identifier of the associated declined transaction. */
            @JsonProperty("declined_transaction_id")
            @ExcludeMissing
            fun _declinedTransactionId() = declinedTransactionId

            /** Why the check deposit was rejected. */
            @JsonProperty("reason") @ExcludeMissing fun _reason() = reason

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * check deposit was rejected.
             */
            @JsonProperty("rejected_at") @ExcludeMissing fun _rejectedAt() = rejectedAt

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): CheckDepositRejection = apply {
                if (!validated) {
                    amount()
                    checkDepositId()
                    currency()
                    declinedTransactionId()
                    reason()
                    rejectedAt()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var amount: JsonField<Long> = JsonMissing.of()
                private var checkDepositId: JsonField<String> = JsonMissing.of()
                private var currency: JsonField<Currency> = JsonMissing.of()
                private var declinedTransactionId: JsonField<String> = JsonMissing.of()
                private var reason: JsonField<Reason> = JsonMissing.of()
                private var rejectedAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(checkDepositRejection: CheckDepositRejection) = apply {
                    this.amount = checkDepositRejection.amount
                    this.checkDepositId = checkDepositRejection.checkDepositId
                    this.currency = checkDepositRejection.currency
                    this.declinedTransactionId = checkDepositRejection.declinedTransactionId
                    this.reason = checkDepositRejection.reason
                    this.rejectedAt = checkDepositRejection.rejectedAt
                    additionalProperties(checkDepositRejection.additionalProperties)
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
                @JsonProperty("amount")
                @ExcludeMissing
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /** The identifier of the Check Deposit that was rejected. */
                fun checkDepositId(checkDepositId: String) =
                    checkDepositId(JsonField.of(checkDepositId))

                /** The identifier of the Check Deposit that was rejected. */
                @JsonProperty("check_deposit_id")
                @ExcludeMissing
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
                @JsonProperty("currency")
                @ExcludeMissing
                fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                /** The identifier of the associated declined transaction. */
                fun declinedTransactionId(declinedTransactionId: String) =
                    declinedTransactionId(JsonField.of(declinedTransactionId))

                /** The identifier of the associated declined transaction. */
                @JsonProperty("declined_transaction_id")
                @ExcludeMissing
                fun declinedTransactionId(declinedTransactionId: JsonField<String>) = apply {
                    this.declinedTransactionId = declinedTransactionId
                }

                /** Why the check deposit was rejected. */
                fun reason(reason: Reason) = reason(JsonField.of(reason))

                /** Why the check deposit was rejected. */
                @JsonProperty("reason")
                @ExcludeMissing
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
                @JsonProperty("rejected_at")
                @ExcludeMissing
                fun rejectedAt(rejectedAt: JsonField<OffsetDateTime>) = apply {
                    this.rejectedAt = rejectedAt
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): CheckDepositRejection =
                    CheckDepositRejection(
                        amount,
                        checkDepositId,
                        currency,
                        declinedTransactionId,
                        reason,
                        rejectedAt,
                        additionalProperties.toImmutable(),
                    )
            }

            class Currency
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Currency && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    @JvmField val CAD = Currency(JsonField.of("CAD"))

                    @JvmField val CHF = Currency(JsonField.of("CHF"))

                    @JvmField val EUR = Currency(JsonField.of("EUR"))

                    @JvmField val GBP = Currency(JsonField.of("GBP"))

                    @JvmField val JPY = Currency(JsonField.of("JPY"))

                    @JvmField val USD = Currency(JsonField.of("USD"))

                    @JvmStatic fun of(value: String) = Currency(JsonField.of(value))
                }

                enum class Known {
                    CAD,
                    CHF,
                    EUR,
                    GBP,
                    JPY,
                    USD,
                }

                enum class Value {
                    CAD,
                    CHF,
                    EUR,
                    GBP,
                    JPY,
                    USD,
                    _UNKNOWN,
                }

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

                fun asString(): String = _value().asStringOrThrow()
            }

            class Reason
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Reason && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    @JvmField val INCOMPLETE_IMAGE = Reason(JsonField.of("incomplete_image"))

                    @JvmField val DUPLICATE = Reason(JsonField.of("duplicate"))

                    @JvmField val POOR_IMAGE_QUALITY = Reason(JsonField.of("poor_image_quality"))

                    @JvmField val INCORRECT_AMOUNT = Reason(JsonField.of("incorrect_amount"))

                    @JvmField val INCORRECT_RECIPIENT = Reason(JsonField.of("incorrect_recipient"))

                    @JvmField
                    val NOT_ELIGIBLE_FOR_MOBILE_DEPOSIT =
                        Reason(JsonField.of("not_eligible_for_mobile_deposit"))

                    @JvmField
                    val MISSING_REQUIRED_DATA_ELEMENTS =
                        Reason(JsonField.of("missing_required_data_elements"))

                    @JvmField val SUSPECTED_FRAUD = Reason(JsonField.of("suspected_fraud"))

                    @JvmField
                    val DEPOSIT_WINDOW_EXPIRED = Reason(JsonField.of("deposit_window_expired"))

                    @JvmField val REQUESTED_BY_USER = Reason(JsonField.of("requested_by_user"))

                    @JvmField val UNKNOWN = Reason(JsonField.of("unknown"))

                    @JvmStatic fun of(value: String) = Reason(JsonField.of(value))
                }

                enum class Known {
                    INCOMPLETE_IMAGE,
                    DUPLICATE,
                    POOR_IMAGE_QUALITY,
                    INCORRECT_AMOUNT,
                    INCORRECT_RECIPIENT,
                    NOT_ELIGIBLE_FOR_MOBILE_DEPOSIT,
                    MISSING_REQUIRED_DATA_ELEMENTS,
                    SUSPECTED_FRAUD,
                    DEPOSIT_WINDOW_EXPIRED,
                    REQUESTED_BY_USER,
                    UNKNOWN,
                }

                enum class Value {
                    INCOMPLETE_IMAGE,
                    DUPLICATE,
                    POOR_IMAGE_QUALITY,
                    INCORRECT_AMOUNT,
                    INCORRECT_RECIPIENT,
                    NOT_ELIGIBLE_FOR_MOBILE_DEPOSIT,
                    MISSING_REQUIRED_DATA_ELEMENTS,
                    SUSPECTED_FRAUD,
                    DEPOSIT_WINDOW_EXPIRED,
                    REQUESTED_BY_USER,
                    UNKNOWN,
                    _UNKNOWN,
                }

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

                fun asString(): String = _value().asStringOrThrow()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is CheckDepositRejection && this.amount == other.amount && this.checkDepositId == other.checkDepositId && this.currency == other.currency && this.declinedTransactionId == other.declinedTransactionId && this.reason == other.reason && this.rejectedAt == other.rejectedAt && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(amount, checkDepositId, currency, declinedTransactionId, reason, rejectedAt, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "CheckDepositRejection{amount=$amount, checkDepositId=$checkDepositId, currency=$currency, declinedTransactionId=$declinedTransactionId, reason=$reason, rejectedAt=$rejectedAt, additionalProperties=$additionalProperties}"
        }

        /**
         * An Inbound Real-Time Payments Transfer Decline object. This field will be present in the
         * JSON response if and only if `category` is equal to
         * `inbound_real_time_payments_transfer_decline`.
         */
        @JsonDeserialize(builder = InboundRealTimePaymentsTransferDecline.Builder::class)
        @NoAutoDetect
        class InboundRealTimePaymentsTransferDecline
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
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

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
            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            /** The name the sender of the transfer specified as the recipient of the transfer. */
            @JsonProperty("creditor_name") @ExcludeMissing fun _creditorName() = creditorName

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code of the declined
             * transfer's currency. This will always be "USD" for a Real-Time Payments transfer.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            /** The account number of the account that sent the transfer. */
            @JsonProperty("debtor_account_number")
            @ExcludeMissing
            fun _debtorAccountNumber() = debtorAccountNumber

            /** The name provided by the sender of the transfer. */
            @JsonProperty("debtor_name") @ExcludeMissing fun _debtorName() = debtorName

            /** The routing number of the account that sent the transfer. */
            @JsonProperty("debtor_routing_number")
            @ExcludeMissing
            fun _debtorRoutingNumber() = debtorRoutingNumber

            /** Why the transfer was declined. */
            @JsonProperty("reason") @ExcludeMissing fun _reason() = reason

            /** Additional information included with the transfer. */
            @JsonProperty("remittance_information")
            @ExcludeMissing
            fun _remittanceInformation() = remittanceInformation

            /** The Real-Time Payments network identification of the declined transfer. */
            @JsonProperty("transaction_identification")
            @ExcludeMissing
            fun _transactionIdentification() = transactionIdentification

            /** The identifier of the Real-Time Payments Transfer that led to this Transaction. */
            @JsonProperty("transfer_id") @ExcludeMissing fun _transferId() = transferId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): InboundRealTimePaymentsTransferDecline = apply {
                if (!validated) {
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
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var amount: JsonField<Long> = JsonMissing.of()
                private var creditorName: JsonField<String> = JsonMissing.of()
                private var currency: JsonField<Currency> = JsonMissing.of()
                private var debtorAccountNumber: JsonField<String> = JsonMissing.of()
                private var debtorName: JsonField<String> = JsonMissing.of()
                private var debtorRoutingNumber: JsonField<String> = JsonMissing.of()
                private var reason: JsonField<Reason> = JsonMissing.of()
                private var remittanceInformation: JsonField<String> = JsonMissing.of()
                private var transactionIdentification: JsonField<String> = JsonMissing.of()
                private var transferId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    inboundRealTimePaymentsTransferDecline: InboundRealTimePaymentsTransferDecline
                ) = apply {
                    this.amount = inboundRealTimePaymentsTransferDecline.amount
                    this.creditorName = inboundRealTimePaymentsTransferDecline.creditorName
                    this.currency = inboundRealTimePaymentsTransferDecline.currency
                    this.debtorAccountNumber =
                        inboundRealTimePaymentsTransferDecline.debtorAccountNumber
                    this.debtorName = inboundRealTimePaymentsTransferDecline.debtorName
                    this.debtorRoutingNumber =
                        inboundRealTimePaymentsTransferDecline.debtorRoutingNumber
                    this.reason = inboundRealTimePaymentsTransferDecline.reason
                    this.remittanceInformation =
                        inboundRealTimePaymentsTransferDecline.remittanceInformation
                    this.transactionIdentification =
                        inboundRealTimePaymentsTransferDecline.transactionIdentification
                    this.transferId = inboundRealTimePaymentsTransferDecline.transferId
                    additionalProperties(
                        inboundRealTimePaymentsTransferDecline.additionalProperties
                    )
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
                @JsonProperty("amount")
                @ExcludeMissing
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /**
                 * The name the sender of the transfer specified as the recipient of the transfer.
                 */
                fun creditorName(creditorName: String) = creditorName(JsonField.of(creditorName))

                /**
                 * The name the sender of the transfer specified as the recipient of the transfer.
                 */
                @JsonProperty("creditor_name")
                @ExcludeMissing
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
                @JsonProperty("currency")
                @ExcludeMissing
                fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                /** The account number of the account that sent the transfer. */
                fun debtorAccountNumber(debtorAccountNumber: String) =
                    debtorAccountNumber(JsonField.of(debtorAccountNumber))

                /** The account number of the account that sent the transfer. */
                @JsonProperty("debtor_account_number")
                @ExcludeMissing
                fun debtorAccountNumber(debtorAccountNumber: JsonField<String>) = apply {
                    this.debtorAccountNumber = debtorAccountNumber
                }

                /** The name provided by the sender of the transfer. */
                fun debtorName(debtorName: String) = debtorName(JsonField.of(debtorName))

                /** The name provided by the sender of the transfer. */
                @JsonProperty("debtor_name")
                @ExcludeMissing
                fun debtorName(debtorName: JsonField<String>) = apply {
                    this.debtorName = debtorName
                }

                /** The routing number of the account that sent the transfer. */
                fun debtorRoutingNumber(debtorRoutingNumber: String) =
                    debtorRoutingNumber(JsonField.of(debtorRoutingNumber))

                /** The routing number of the account that sent the transfer. */
                @JsonProperty("debtor_routing_number")
                @ExcludeMissing
                fun debtorRoutingNumber(debtorRoutingNumber: JsonField<String>) = apply {
                    this.debtorRoutingNumber = debtorRoutingNumber
                }

                /** Why the transfer was declined. */
                fun reason(reason: Reason) = reason(JsonField.of(reason))

                /** Why the transfer was declined. */
                @JsonProperty("reason")
                @ExcludeMissing
                fun reason(reason: JsonField<Reason>) = apply { this.reason = reason }

                /** Additional information included with the transfer. */
                fun remittanceInformation(remittanceInformation: String) =
                    remittanceInformation(JsonField.of(remittanceInformation))

                /** Additional information included with the transfer. */
                @JsonProperty("remittance_information")
                @ExcludeMissing
                fun remittanceInformation(remittanceInformation: JsonField<String>) = apply {
                    this.remittanceInformation = remittanceInformation
                }

                /** The Real-Time Payments network identification of the declined transfer. */
                fun transactionIdentification(transactionIdentification: String) =
                    transactionIdentification(JsonField.of(transactionIdentification))

                /** The Real-Time Payments network identification of the declined transfer. */
                @JsonProperty("transaction_identification")
                @ExcludeMissing
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
                @JsonProperty("transfer_id")
                @ExcludeMissing
                fun transferId(transferId: JsonField<String>) = apply {
                    this.transferId = transferId
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): InboundRealTimePaymentsTransferDecline =
                    InboundRealTimePaymentsTransferDecline(
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
                        additionalProperties.toImmutable(),
                    )
            }

            class Currency
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Currency && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    @JvmField val CAD = Currency(JsonField.of("CAD"))

                    @JvmField val CHF = Currency(JsonField.of("CHF"))

                    @JvmField val EUR = Currency(JsonField.of("EUR"))

                    @JvmField val GBP = Currency(JsonField.of("GBP"))

                    @JvmField val JPY = Currency(JsonField.of("JPY"))

                    @JvmField val USD = Currency(JsonField.of("USD"))

                    @JvmStatic fun of(value: String) = Currency(JsonField.of(value))
                }

                enum class Known {
                    CAD,
                    CHF,
                    EUR,
                    GBP,
                    JPY,
                    USD,
                }

                enum class Value {
                    CAD,
                    CHF,
                    EUR,
                    GBP,
                    JPY,
                    USD,
                    _UNKNOWN,
                }

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

                fun asString(): String = _value().asStringOrThrow()
            }

            class Reason
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Reason && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    @JvmField
                    val ACCOUNT_NUMBER_CANCELED = Reason(JsonField.of("account_number_canceled"))

                    @JvmField
                    val ACCOUNT_NUMBER_DISABLED = Reason(JsonField.of("account_number_disabled"))

                    @JvmField val ACCOUNT_RESTRICTED = Reason(JsonField.of("account_restricted"))

                    @JvmField val GROUP_LOCKED = Reason(JsonField.of("group_locked"))

                    @JvmField val ENTITY_NOT_ACTIVE = Reason(JsonField.of("entity_not_active"))

                    @JvmField
                    val REAL_TIME_PAYMENTS_NOT_ENABLED =
                        Reason(JsonField.of("real_time_payments_not_enabled"))

                    @JvmStatic fun of(value: String) = Reason(JsonField.of(value))
                }

                enum class Known {
                    ACCOUNT_NUMBER_CANCELED,
                    ACCOUNT_NUMBER_DISABLED,
                    ACCOUNT_RESTRICTED,
                    GROUP_LOCKED,
                    ENTITY_NOT_ACTIVE,
                    REAL_TIME_PAYMENTS_NOT_ENABLED,
                }

                enum class Value {
                    ACCOUNT_NUMBER_CANCELED,
                    ACCOUNT_NUMBER_DISABLED,
                    ACCOUNT_RESTRICTED,
                    GROUP_LOCKED,
                    ENTITY_NOT_ACTIVE,
                    REAL_TIME_PAYMENTS_NOT_ENABLED,
                    _UNKNOWN,
                }

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

                fun asString(): String = _value().asStringOrThrow()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is InboundRealTimePaymentsTransferDecline && this.amount == other.amount && this.creditorName == other.creditorName && this.currency == other.currency && this.debtorAccountNumber == other.debtorAccountNumber && this.debtorName == other.debtorName && this.debtorRoutingNumber == other.debtorRoutingNumber && this.reason == other.reason && this.remittanceInformation == other.remittanceInformation && this.transactionIdentification == other.transactionIdentification && this.transferId == other.transferId && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(amount, creditorName, currency, debtorAccountNumber, debtorName, debtorRoutingNumber, reason, remittanceInformation, transactionIdentification, transferId, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "InboundRealTimePaymentsTransferDecline{amount=$amount, creditorName=$creditorName, currency=$currency, debtorAccountNumber=$debtorAccountNumber, debtorName=$debtorName, debtorRoutingNumber=$debtorRoutingNumber, reason=$reason, remittanceInformation=$remittanceInformation, transactionIdentification=$transactionIdentification, transferId=$transferId, additionalProperties=$additionalProperties}"
        }

        /**
         * A Wire Decline object. This field will be present in the JSON response if and only if
         * `category` is equal to `wire_decline`.
         */
        @JsonDeserialize(builder = WireDecline.Builder::class)
        @NoAutoDetect
        class WireDecline
        private constructor(
            private val inboundWireTransferId: JsonField<String>,
            private val reason: JsonField<Reason>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            /** The identifier of the Inbound Wire Transfer that was declined. */
            fun inboundWireTransferId(): String =
                inboundWireTransferId.getRequired("inbound_wire_transfer_id")

            /** Why the wire transfer was declined. */
            fun reason(): Reason = reason.getRequired("reason")

            /** The identifier of the Inbound Wire Transfer that was declined. */
            @JsonProperty("inbound_wire_transfer_id")
            @ExcludeMissing
            fun _inboundWireTransferId() = inboundWireTransferId

            /** Why the wire transfer was declined. */
            @JsonProperty("reason") @ExcludeMissing fun _reason() = reason

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): WireDecline = apply {
                if (!validated) {
                    inboundWireTransferId()
                    reason()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var inboundWireTransferId: JsonField<String> = JsonMissing.of()
                private var reason: JsonField<Reason> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(wireDecline: WireDecline) = apply {
                    this.inboundWireTransferId = wireDecline.inboundWireTransferId
                    this.reason = wireDecline.reason
                    additionalProperties(wireDecline.additionalProperties)
                }

                /** The identifier of the Inbound Wire Transfer that was declined. */
                fun inboundWireTransferId(inboundWireTransferId: String) =
                    inboundWireTransferId(JsonField.of(inboundWireTransferId))

                /** The identifier of the Inbound Wire Transfer that was declined. */
                @JsonProperty("inbound_wire_transfer_id")
                @ExcludeMissing
                fun inboundWireTransferId(inboundWireTransferId: JsonField<String>) = apply {
                    this.inboundWireTransferId = inboundWireTransferId
                }

                /** Why the wire transfer was declined. */
                fun reason(reason: Reason) = reason(JsonField.of(reason))

                /** Why the wire transfer was declined. */
                @JsonProperty("reason")
                @ExcludeMissing
                fun reason(reason: JsonField<Reason>) = apply { this.reason = reason }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): WireDecline =
                    WireDecline(
                        inboundWireTransferId,
                        reason,
                        additionalProperties.toImmutable(),
                    )
            }

            class Reason
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Reason && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    @JvmField
                    val ACCOUNT_NUMBER_CANCELED = Reason(JsonField.of("account_number_canceled"))

                    @JvmField
                    val ACCOUNT_NUMBER_DISABLED = Reason(JsonField.of("account_number_disabled"))

                    @JvmField val ENTITY_NOT_ACTIVE = Reason(JsonField.of("entity_not_active"))

                    @JvmField val GROUP_LOCKED = Reason(JsonField.of("group_locked"))

                    @JvmField val NO_ACCOUNT_NUMBER = Reason(JsonField.of("no_account_number"))

                    @JvmField
                    val TRANSACTION_NOT_ALLOWED = Reason(JsonField.of("transaction_not_allowed"))

                    @JvmStatic fun of(value: String) = Reason(JsonField.of(value))
                }

                enum class Known {
                    ACCOUNT_NUMBER_CANCELED,
                    ACCOUNT_NUMBER_DISABLED,
                    ENTITY_NOT_ACTIVE,
                    GROUP_LOCKED,
                    NO_ACCOUNT_NUMBER,
                    TRANSACTION_NOT_ALLOWED,
                }

                enum class Value {
                    ACCOUNT_NUMBER_CANCELED,
                    ACCOUNT_NUMBER_DISABLED,
                    ENTITY_NOT_ACTIVE,
                    GROUP_LOCKED,
                    NO_ACCOUNT_NUMBER,
                    TRANSACTION_NOT_ALLOWED,
                    _UNKNOWN,
                }

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

                fun asString(): String = _value().asStringOrThrow()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is WireDecline && this.inboundWireTransferId == other.inboundWireTransferId && this.reason == other.reason && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(inboundWireTransferId, reason, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "WireDecline{inboundWireTransferId=$inboundWireTransferId, reason=$reason, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Source && this.achDecline == other.achDecline && this.cardDecline == other.cardDecline && this.category == other.category && this.checkDecline == other.checkDecline && this.checkDepositRejection == other.checkDepositRejection && this.inboundRealTimePaymentsTransferDecline == other.inboundRealTimePaymentsTransferDecline && this.other == other.other && this.wireDecline == other.wireDecline && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(achDecline, cardDecline, category, checkDecline, checkDepositRejection, inboundRealTimePaymentsTransferDecline, other, wireDecline, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "Source{achDecline=$achDecline, cardDecline=$cardDecline, category=$category, checkDecline=$checkDecline, checkDepositRejection=$checkDepositRejection, inboundRealTimePaymentsTransferDecline=$inboundRealTimePaymentsTransferDecline, other=$other, wireDecline=$wireDecline, additionalProperties=$additionalProperties}"
    }

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Type && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val DECLINED_TRANSACTION = Type(JsonField.of("declined_transaction"))

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            DECLINED_TRANSACTION,
        }

        enum class Value {
            DECLINED_TRANSACTION,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                DECLINED_TRANSACTION -> Value.DECLINED_TRANSACTION
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                DECLINED_TRANSACTION -> Known.DECLINED_TRANSACTION
                else -> throw IncreaseInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DeclinedTransaction && this.accountId == other.accountId && this.amount == other.amount && this.createdAt == other.createdAt && this.currency == other.currency && this.description == other.description && this.id == other.id && this.routeId == other.routeId && this.routeType == other.routeType && this.source == other.source && this.type == other.type && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(accountId, amount, createdAt, currency, description, id, routeId, routeType, source, type, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "DeclinedTransaction{accountId=$accountId, amount=$amount, createdAt=$createdAt, currency=$currency, description=$description, id=$id, routeId=$routeId, routeType=$routeType, source=$source, type=$type, additionalProperties=$additionalProperties}"
}
