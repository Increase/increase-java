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
import com.increase.api.core.toUnmodifiable
import com.increase.api.errors.IncreaseInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

/**
 * Pending Transactions are potential future additions and removals of money from your bank account.
 */
@JsonDeserialize(builder = PendingTransaction.Builder::class)
@NoAutoDetect
class PendingTransaction
private constructor(
    private val accountId: JsonField<String>,
    private val amount: JsonField<Long>,
    private val completedAt: JsonField<OffsetDateTime>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val currency: JsonField<Currency>,
    private val description: JsonField<String>,
    private val id: JsonField<String>,
    private val routeId: JsonField<String>,
    private val routeType: JsonField<RouteType>,
    private val source: JsonField<Source>,
    private val status: JsonField<Status>,
    private val type: JsonField<Type>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /** The identifier for the account this Pending Transaction belongs to. */
    fun accountId(): String = accountId.getRequired("account_id")

    /**
     * The Pending Transaction amount in the minor unit of its currency. For dollars, for example,
     * this is cents.
     */
    fun amount(): Long = amount.getRequired("amount")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date on which the Pending Transaction
     * was completed.
     */
    fun completedAt(): Optional<OffsetDateTime> =
        Optional.ofNullable(completedAt.getNullable("completed_at"))

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date on which the Pending Transaction
     * occurred.
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the Pending Transaction's
     * currency. This will match the currency on the Pending Transaction's Account.
     */
    fun currency(): Currency = currency.getRequired("currency")

    /**
     * For a Pending Transaction related to a transfer, this is the description you provide. For a
     * Pending Transaction related to a payment, this is the description the vendor provides.
     */
    fun description(): String = description.getRequired("description")

    /** The Pending Transaction identifier. */
    fun id(): String = id.getRequired("id")

    /**
     * The identifier for the route this Pending Transaction came through. Routes are things like
     * cards and ACH details.
     */
    fun routeId(): Optional<String> = Optional.ofNullable(routeId.getNullable("route_id"))

    /** The type of the route this Pending Transaction came through. */
    fun routeType(): Optional<RouteType> = Optional.ofNullable(routeType.getNullable("route_type"))

    /**
     * This is an object giving more details on the network-level event that caused the Pending
     * Transaction. For example, for a card transaction this lists the merchant's industry and
     * location.
     */
    fun source(): Source = source.getRequired("source")

    /** Whether the Pending Transaction has been confirmed and has an associated Transaction. */
    fun status(): Status = status.getRequired("status")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `pending_transaction`.
     */
    fun type(): Type = type.getRequired("type")

    /** The identifier for the account this Pending Transaction belongs to. */
    @JsonProperty("account_id") @ExcludeMissing fun _accountId() = accountId

    /**
     * The Pending Transaction amount in the minor unit of its currency. For dollars, for example,
     * this is cents.
     */
    @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date on which the Pending Transaction
     * was completed.
     */
    @JsonProperty("completed_at") @ExcludeMissing fun _completedAt() = completedAt

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date on which the Pending Transaction
     * occurred.
     */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    /**
     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the Pending Transaction's
     * currency. This will match the currency on the Pending Transaction's Account.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

    /**
     * For a Pending Transaction related to a transfer, this is the description you provide. For a
     * Pending Transaction related to a payment, this is the description the vendor provides.
     */
    @JsonProperty("description") @ExcludeMissing fun _description() = description

    /** The Pending Transaction identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /**
     * The identifier for the route this Pending Transaction came through. Routes are things like
     * cards and ACH details.
     */
    @JsonProperty("route_id") @ExcludeMissing fun _routeId() = routeId

    /** The type of the route this Pending Transaction came through. */
    @JsonProperty("route_type") @ExcludeMissing fun _routeType() = routeType

    /**
     * This is an object giving more details on the network-level event that caused the Pending
     * Transaction. For example, for a card transaction this lists the merchant's industry and
     * location.
     */
    @JsonProperty("source") @ExcludeMissing fun _source() = source

    /** Whether the Pending Transaction has been confirmed and has an associated Transaction. */
    @JsonProperty("status") @ExcludeMissing fun _status() = status

    /**
     * A constant representing the object's type. For this resource it will always be
     * `pending_transaction`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): PendingTransaction = apply {
        if (!validated) {
            accountId()
            amount()
            completedAt()
            createdAt()
            currency()
            description()
            id()
            routeId()
            routeType()
            source().validate()
            status()
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
        private var completedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var currency: JsonField<Currency> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var id: JsonField<String> = JsonMissing.of()
        private var routeId: JsonField<String> = JsonMissing.of()
        private var routeType: JsonField<RouteType> = JsonMissing.of()
        private var source: JsonField<Source> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(pendingTransaction: PendingTransaction) = apply {
            this.accountId = pendingTransaction.accountId
            this.amount = pendingTransaction.amount
            this.completedAt = pendingTransaction.completedAt
            this.createdAt = pendingTransaction.createdAt
            this.currency = pendingTransaction.currency
            this.description = pendingTransaction.description
            this.id = pendingTransaction.id
            this.routeId = pendingTransaction.routeId
            this.routeType = pendingTransaction.routeType
            this.source = pendingTransaction.source
            this.status = pendingTransaction.status
            this.type = pendingTransaction.type
            additionalProperties(pendingTransaction.additionalProperties)
        }

        /** The identifier for the account this Pending Transaction belongs to. */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /** The identifier for the account this Pending Transaction belongs to. */
        @JsonProperty("account_id")
        @ExcludeMissing
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        /**
         * The Pending Transaction amount in the minor unit of its currency. For dollars, for
         * example, this is cents.
         */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /**
         * The Pending Transaction amount in the minor unit of its currency. For dollars, for
         * example, this is cents.
         */
        @JsonProperty("amount")
        @ExcludeMissing
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date on which the Pending
         * Transaction was completed.
         */
        fun completedAt(completedAt: OffsetDateTime) = completedAt(JsonField.of(completedAt))

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date on which the Pending
         * Transaction was completed.
         */
        @JsonProperty("completed_at")
        @ExcludeMissing
        fun completedAt(completedAt: JsonField<OffsetDateTime>) = apply {
            this.completedAt = completedAt
        }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date on which the Pending
         * Transaction occurred.
         */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date on which the Pending
         * Transaction occurred.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the Pending Transaction's
         * currency. This will match the currency on the Pending Transaction's Account.
         */
        fun currency(currency: Currency) = currency(JsonField.of(currency))

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the Pending Transaction's
         * currency. This will match the currency on the Pending Transaction's Account.
         */
        @JsonProperty("currency")
        @ExcludeMissing
        fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

        /**
         * For a Pending Transaction related to a transfer, this is the description you provide. For
         * a Pending Transaction related to a payment, this is the description the vendor provides.
         */
        fun description(description: String) = description(JsonField.of(description))

        /**
         * For a Pending Transaction related to a transfer, this is the description you provide. For
         * a Pending Transaction related to a payment, this is the description the vendor provides.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** The Pending Transaction identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The Pending Transaction identifier. */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * The identifier for the route this Pending Transaction came through. Routes are things
         * like cards and ACH details.
         */
        fun routeId(routeId: String) = routeId(JsonField.of(routeId))

        /**
         * The identifier for the route this Pending Transaction came through. Routes are things
         * like cards and ACH details.
         */
        @JsonProperty("route_id")
        @ExcludeMissing
        fun routeId(routeId: JsonField<String>) = apply { this.routeId = routeId }

        /** The type of the route this Pending Transaction came through. */
        fun routeType(routeType: RouteType) = routeType(JsonField.of(routeType))

        /** The type of the route this Pending Transaction came through. */
        @JsonProperty("route_type")
        @ExcludeMissing
        fun routeType(routeType: JsonField<RouteType>) = apply { this.routeType = routeType }

        /**
         * This is an object giving more details on the network-level event that caused the Pending
         * Transaction. For example, for a card transaction this lists the merchant's industry and
         * location.
         */
        fun source(source: Source) = source(JsonField.of(source))

        /**
         * This is an object giving more details on the network-level event that caused the Pending
         * Transaction. For example, for a card transaction this lists the merchant's industry and
         * location.
         */
        @JsonProperty("source")
        @ExcludeMissing
        fun source(source: JsonField<Source>) = apply { this.source = source }

        /** Whether the Pending Transaction has been confirmed and has an associated Transaction. */
        fun status(status: Status) = status(JsonField.of(status))

        /** Whether the Pending Transaction has been confirmed and has an associated Transaction. */
        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `pending_transaction`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be
         * `pending_transaction`.
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

        fun build(): PendingTransaction =
            PendingTransaction(
                accountId,
                amount,
                completedAt,
                createdAt,
                currency,
                description,
                id,
                routeId,
                routeType,
                source,
                status,
                type,
                additionalProperties.toUnmodifiable(),
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
     * This is an object giving more details on the network-level event that caused the Pending
     * Transaction. For example, for a card transaction this lists the merchant's industry and
     * location.
     */
    @JsonDeserialize(builder = Source.Builder::class)
    @NoAutoDetect
    class Source
    private constructor(
        private val accountTransferInstruction: JsonField<AccountTransferInstruction>,
        private val achTransferInstruction: JsonField<AchTransferInstruction>,
        private val cardAuthorization: JsonField<CardAuthorization>,
        private val category: JsonField<Category>,
        private val checkDepositInstruction: JsonField<CheckDepositInstruction>,
        private val checkTransferInstruction: JsonField<CheckTransferInstruction>,
        private val inboundFundsHold: JsonField<InboundFundsHold>,
        private val other: JsonValue,
        private val realTimePaymentsTransferInstruction:
            JsonField<RealTimePaymentsTransferInstruction>,
        private val wireTransferInstruction: JsonField<WireTransferInstruction>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        /**
         * An Account Transfer Instruction object. This field will be present in the JSON response
         * if and only if `category` is equal to `account_transfer_instruction`.
         */
        fun accountTransferInstruction(): Optional<AccountTransferInstruction> =
            Optional.ofNullable(
                accountTransferInstruction.getNullable("account_transfer_instruction")
            )

        /**
         * An ACH Transfer Instruction object. This field will be present in the JSON response if
         * and only if `category` is equal to `ach_transfer_instruction`.
         */
        fun achTransferInstruction(): Optional<AchTransferInstruction> =
            Optional.ofNullable(achTransferInstruction.getNullable("ach_transfer_instruction"))

        /**
         * A Card Authorization object. This field will be present in the JSON response if and only
         * if `category` is equal to `card_authorization`.
         */
        fun cardAuthorization(): Optional<CardAuthorization> =
            Optional.ofNullable(cardAuthorization.getNullable("card_authorization"))

        /**
         * The type of the resource. We may add additional possible values for this enum over time;
         * your application should be able to handle such additions gracefully.
         */
        fun category(): Category = category.getRequired("category")

        /**
         * A Check Deposit Instruction object. This field will be present in the JSON response if
         * and only if `category` is equal to `check_deposit_instruction`.
         */
        fun checkDepositInstruction(): Optional<CheckDepositInstruction> =
            Optional.ofNullable(checkDepositInstruction.getNullable("check_deposit_instruction"))

        /**
         * A Check Transfer Instruction object. This field will be present in the JSON response if
         * and only if `category` is equal to `check_transfer_instruction`.
         */
        fun checkTransferInstruction(): Optional<CheckTransferInstruction> =
            Optional.ofNullable(checkTransferInstruction.getNullable("check_transfer_instruction"))

        /**
         * An Inbound Funds Hold object. This field will be present in the JSON response if and only
         * if `category` is equal to `inbound_funds_hold`.
         */
        fun inboundFundsHold(): Optional<InboundFundsHold> =
            Optional.ofNullable(inboundFundsHold.getNullable("inbound_funds_hold"))

        /**
         * A Real-Time Payments Transfer Instruction object. This field will be present in the JSON
         * response if and only if `category` is equal to `real_time_payments_transfer_instruction`.
         */
        fun realTimePaymentsTransferInstruction(): Optional<RealTimePaymentsTransferInstruction> =
            Optional.ofNullable(
                realTimePaymentsTransferInstruction.getNullable(
                    "real_time_payments_transfer_instruction"
                )
            )

        /**
         * A Wire Transfer Instruction object. This field will be present in the JSON response if
         * and only if `category` is equal to `wire_transfer_instruction`.
         */
        fun wireTransferInstruction(): Optional<WireTransferInstruction> =
            Optional.ofNullable(wireTransferInstruction.getNullable("wire_transfer_instruction"))

        /**
         * An Account Transfer Instruction object. This field will be present in the JSON response
         * if and only if `category` is equal to `account_transfer_instruction`.
         */
        @JsonProperty("account_transfer_instruction")
        @ExcludeMissing
        fun _accountTransferInstruction() = accountTransferInstruction

        /**
         * An ACH Transfer Instruction object. This field will be present in the JSON response if
         * and only if `category` is equal to `ach_transfer_instruction`.
         */
        @JsonProperty("ach_transfer_instruction")
        @ExcludeMissing
        fun _achTransferInstruction() = achTransferInstruction

        /**
         * A Card Authorization object. This field will be present in the JSON response if and only
         * if `category` is equal to `card_authorization`.
         */
        @JsonProperty("card_authorization")
        @ExcludeMissing
        fun _cardAuthorization() = cardAuthorization

        /**
         * The type of the resource. We may add additional possible values for this enum over time;
         * your application should be able to handle such additions gracefully.
         */
        @JsonProperty("category") @ExcludeMissing fun _category() = category

        /**
         * A Check Deposit Instruction object. This field will be present in the JSON response if
         * and only if `category` is equal to `check_deposit_instruction`.
         */
        @JsonProperty("check_deposit_instruction")
        @ExcludeMissing
        fun _checkDepositInstruction() = checkDepositInstruction

        /**
         * A Check Transfer Instruction object. This field will be present in the JSON response if
         * and only if `category` is equal to `check_transfer_instruction`.
         */
        @JsonProperty("check_transfer_instruction")
        @ExcludeMissing
        fun _checkTransferInstruction() = checkTransferInstruction

        /**
         * An Inbound Funds Hold object. This field will be present in the JSON response if and only
         * if `category` is equal to `inbound_funds_hold`.
         */
        @JsonProperty("inbound_funds_hold")
        @ExcludeMissing
        fun _inboundFundsHold() = inboundFundsHold

        /**
         * If the category of this Transaction source is equal to `other`, this field will contain
         * an empty object, otherwise it will contain null.
         */
        @JsonProperty("other") @ExcludeMissing fun _other() = other

        /**
         * A Real-Time Payments Transfer Instruction object. This field will be present in the JSON
         * response if and only if `category` is equal to `real_time_payments_transfer_instruction`.
         */
        @JsonProperty("real_time_payments_transfer_instruction")
        @ExcludeMissing
        fun _realTimePaymentsTransferInstruction() = realTimePaymentsTransferInstruction

        /**
         * A Wire Transfer Instruction object. This field will be present in the JSON response if
         * and only if `category` is equal to `wire_transfer_instruction`.
         */
        @JsonProperty("wire_transfer_instruction")
        @ExcludeMissing
        fun _wireTransferInstruction() = wireTransferInstruction

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Source = apply {
            if (!validated) {
                accountTransferInstruction().map { it.validate() }
                achTransferInstruction().map { it.validate() }
                cardAuthorization().map { it.validate() }
                category()
                checkDepositInstruction().map { it.validate() }
                checkTransferInstruction().map { it.validate() }
                inboundFundsHold().map { it.validate() }
                realTimePaymentsTransferInstruction().map { it.validate() }
                wireTransferInstruction().map { it.validate() }
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var accountTransferInstruction: JsonField<AccountTransferInstruction> =
                JsonMissing.of()
            private var achTransferInstruction: JsonField<AchTransferInstruction> = JsonMissing.of()
            private var cardAuthorization: JsonField<CardAuthorization> = JsonMissing.of()
            private var category: JsonField<Category> = JsonMissing.of()
            private var checkDepositInstruction: JsonField<CheckDepositInstruction> =
                JsonMissing.of()
            private var checkTransferInstruction: JsonField<CheckTransferInstruction> =
                JsonMissing.of()
            private var inboundFundsHold: JsonField<InboundFundsHold> = JsonMissing.of()
            private var other: JsonValue = JsonMissing.of()
            private var realTimePaymentsTransferInstruction:
                JsonField<RealTimePaymentsTransferInstruction> =
                JsonMissing.of()
            private var wireTransferInstruction: JsonField<WireTransferInstruction> =
                JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(source: Source) = apply {
                this.accountTransferInstruction = source.accountTransferInstruction
                this.achTransferInstruction = source.achTransferInstruction
                this.cardAuthorization = source.cardAuthorization
                this.category = source.category
                this.checkDepositInstruction = source.checkDepositInstruction
                this.checkTransferInstruction = source.checkTransferInstruction
                this.inboundFundsHold = source.inboundFundsHold
                this.other = source.other
                this.realTimePaymentsTransferInstruction =
                    source.realTimePaymentsTransferInstruction
                this.wireTransferInstruction = source.wireTransferInstruction
                additionalProperties(source.additionalProperties)
            }

            /**
             * An Account Transfer Instruction object. This field will be present in the JSON
             * response if and only if `category` is equal to `account_transfer_instruction`.
             */
            fun accountTransferInstruction(accountTransferInstruction: AccountTransferInstruction) =
                accountTransferInstruction(JsonField.of(accountTransferInstruction))

            /**
             * An Account Transfer Instruction object. This field will be present in the JSON
             * response if and only if `category` is equal to `account_transfer_instruction`.
             */
            @JsonProperty("account_transfer_instruction")
            @ExcludeMissing
            fun accountTransferInstruction(
                accountTransferInstruction: JsonField<AccountTransferInstruction>
            ) = apply { this.accountTransferInstruction = accountTransferInstruction }

            /**
             * An ACH Transfer Instruction object. This field will be present in the JSON response
             * if and only if `category` is equal to `ach_transfer_instruction`.
             */
            fun achTransferInstruction(achTransferInstruction: AchTransferInstruction) =
                achTransferInstruction(JsonField.of(achTransferInstruction))

            /**
             * An ACH Transfer Instruction object. This field will be present in the JSON response
             * if and only if `category` is equal to `ach_transfer_instruction`.
             */
            @JsonProperty("ach_transfer_instruction")
            @ExcludeMissing
            fun achTransferInstruction(achTransferInstruction: JsonField<AchTransferInstruction>) =
                apply {
                    this.achTransferInstruction = achTransferInstruction
                }

            /**
             * A Card Authorization object. This field will be present in the JSON response if and
             * only if `category` is equal to `card_authorization`.
             */
            fun cardAuthorization(cardAuthorization: CardAuthorization) =
                cardAuthorization(JsonField.of(cardAuthorization))

            /**
             * A Card Authorization object. This field will be present in the JSON response if and
             * only if `category` is equal to `card_authorization`.
             */
            @JsonProperty("card_authorization")
            @ExcludeMissing
            fun cardAuthorization(cardAuthorization: JsonField<CardAuthorization>) = apply {
                this.cardAuthorization = cardAuthorization
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
             * A Check Deposit Instruction object. This field will be present in the JSON response
             * if and only if `category` is equal to `check_deposit_instruction`.
             */
            fun checkDepositInstruction(checkDepositInstruction: CheckDepositInstruction) =
                checkDepositInstruction(JsonField.of(checkDepositInstruction))

            /**
             * A Check Deposit Instruction object. This field will be present in the JSON response
             * if and only if `category` is equal to `check_deposit_instruction`.
             */
            @JsonProperty("check_deposit_instruction")
            @ExcludeMissing
            fun checkDepositInstruction(
                checkDepositInstruction: JsonField<CheckDepositInstruction>
            ) = apply { this.checkDepositInstruction = checkDepositInstruction }

            /**
             * A Check Transfer Instruction object. This field will be present in the JSON response
             * if and only if `category` is equal to `check_transfer_instruction`.
             */
            fun checkTransferInstruction(checkTransferInstruction: CheckTransferInstruction) =
                checkTransferInstruction(JsonField.of(checkTransferInstruction))

            /**
             * A Check Transfer Instruction object. This field will be present in the JSON response
             * if and only if `category` is equal to `check_transfer_instruction`.
             */
            @JsonProperty("check_transfer_instruction")
            @ExcludeMissing
            fun checkTransferInstruction(
                checkTransferInstruction: JsonField<CheckTransferInstruction>
            ) = apply { this.checkTransferInstruction = checkTransferInstruction }

            /**
             * An Inbound Funds Hold object. This field will be present in the JSON response if and
             * only if `category` is equal to `inbound_funds_hold`.
             */
            fun inboundFundsHold(inboundFundsHold: InboundFundsHold) =
                inboundFundsHold(JsonField.of(inboundFundsHold))

            /**
             * An Inbound Funds Hold object. This field will be present in the JSON response if and
             * only if `category` is equal to `inbound_funds_hold`.
             */
            @JsonProperty("inbound_funds_hold")
            @ExcludeMissing
            fun inboundFundsHold(inboundFundsHold: JsonField<InboundFundsHold>) = apply {
                this.inboundFundsHold = inboundFundsHold
            }

            /**
             * If the category of this Transaction source is equal to `other`, this field will
             * contain an empty object, otherwise it will contain null.
             */
            @JsonProperty("other")
            @ExcludeMissing
            fun other(other: JsonValue) = apply { this.other = other }

            /**
             * A Real-Time Payments Transfer Instruction object. This field will be present in the
             * JSON response if and only if `category` is equal to
             * `real_time_payments_transfer_instruction`.
             */
            fun realTimePaymentsTransferInstruction(
                realTimePaymentsTransferInstruction: RealTimePaymentsTransferInstruction
            ) =
                realTimePaymentsTransferInstruction(
                    JsonField.of(realTimePaymentsTransferInstruction)
                )

            /**
             * A Real-Time Payments Transfer Instruction object. This field will be present in the
             * JSON response if and only if `category` is equal to
             * `real_time_payments_transfer_instruction`.
             */
            @JsonProperty("real_time_payments_transfer_instruction")
            @ExcludeMissing
            fun realTimePaymentsTransferInstruction(
                realTimePaymentsTransferInstruction: JsonField<RealTimePaymentsTransferInstruction>
            ) = apply {
                this.realTimePaymentsTransferInstruction = realTimePaymentsTransferInstruction
            }

            /**
             * A Wire Transfer Instruction object. This field will be present in the JSON response
             * if and only if `category` is equal to `wire_transfer_instruction`.
             */
            fun wireTransferInstruction(wireTransferInstruction: WireTransferInstruction) =
                wireTransferInstruction(JsonField.of(wireTransferInstruction))

            /**
             * A Wire Transfer Instruction object. This field will be present in the JSON response
             * if and only if `category` is equal to `wire_transfer_instruction`.
             */
            @JsonProperty("wire_transfer_instruction")
            @ExcludeMissing
            fun wireTransferInstruction(
                wireTransferInstruction: JsonField<WireTransferInstruction>
            ) = apply { this.wireTransferInstruction = wireTransferInstruction }

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
                    accountTransferInstruction,
                    achTransferInstruction,
                    cardAuthorization,
                    category,
                    checkDepositInstruction,
                    checkTransferInstruction,
                    inboundFundsHold,
                    other,
                    realTimePaymentsTransferInstruction,
                    wireTransferInstruction,
                    additionalProperties.toUnmodifiable(),
                )
        }

        /**
         * An Account Transfer Instruction object. This field will be present in the JSON response
         * if and only if `category` is equal to `account_transfer_instruction`.
         */
        @JsonDeserialize(builder = AccountTransferInstruction.Builder::class)
        @NoAutoDetect
        class AccountTransferInstruction
        private constructor(
            private val amount: JsonField<Long>,
            private val currency: JsonField<Currency>,
            private val transferId: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            /**
             * The pending amount in the minor unit of the transaction's currency. For dollars, for
             * example, this is cents.
             */
            fun amount(): Long = amount.getRequired("amount")

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the destination
             * account currency.
             */
            fun currency(): Currency = currency.getRequired("currency")

            /** The identifier of the Account Transfer that led to this Pending Transaction. */
            fun transferId(): String = transferId.getRequired("transfer_id")

            /**
             * The pending amount in the minor unit of the transaction's currency. For dollars, for
             * example, this is cents.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the destination
             * account currency.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            /** The identifier of the Account Transfer that led to this Pending Transaction. */
            @JsonProperty("transfer_id") @ExcludeMissing fun _transferId() = transferId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): AccountTransferInstruction = apply {
                if (!validated) {
                    amount()
                    currency()
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
                private var currency: JsonField<Currency> = JsonMissing.of()
                private var transferId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(accountTransferInstruction: AccountTransferInstruction) = apply {
                    this.amount = accountTransferInstruction.amount
                    this.currency = accountTransferInstruction.currency
                    this.transferId = accountTransferInstruction.transferId
                    additionalProperties(accountTransferInstruction.additionalProperties)
                }

                /**
                 * The pending amount in the minor unit of the transaction's currency. For dollars,
                 * for example, this is cents.
                 */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /**
                 * The pending amount in the minor unit of the transaction's currency. For dollars,
                 * for example, this is cents.
                 */
                @JsonProperty("amount")
                @ExcludeMissing
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

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

                /** The identifier of the Account Transfer that led to this Pending Transaction. */
                fun transferId(transferId: String) = transferId(JsonField.of(transferId))

                /** The identifier of the Account Transfer that led to this Pending Transaction. */
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

                fun build(): AccountTransferInstruction =
                    AccountTransferInstruction(
                        amount,
                        currency,
                        transferId,
                        additionalProperties.toUnmodifiable(),
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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is AccountTransferInstruction && this.amount == other.amount && this.currency == other.currency && this.transferId == other.transferId && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(amount, currency, transferId, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "AccountTransferInstruction{amount=$amount, currency=$currency, transferId=$transferId, additionalProperties=$additionalProperties}"
        }

        /**
         * An ACH Transfer Instruction object. This field will be present in the JSON response if
         * and only if `category` is equal to `ach_transfer_instruction`.
         */
        @JsonDeserialize(builder = AchTransferInstruction.Builder::class)
        @NoAutoDetect
        class AchTransferInstruction
        private constructor(
            private val amount: JsonField<Long>,
            private val transferId: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            /** The pending amount in USD cents. */
            fun amount(): Long = amount.getRequired("amount")

            /** The identifier of the ACH Transfer that led to this Pending Transaction. */
            fun transferId(): String = transferId.getRequired("transfer_id")

            /** The pending amount in USD cents. */
            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            /** The identifier of the ACH Transfer that led to this Pending Transaction. */
            @JsonProperty("transfer_id") @ExcludeMissing fun _transferId() = transferId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): AchTransferInstruction = apply {
                if (!validated) {
                    amount()
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
                private var transferId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(achTransferInstruction: AchTransferInstruction) = apply {
                    this.amount = achTransferInstruction.amount
                    this.transferId = achTransferInstruction.transferId
                    additionalProperties(achTransferInstruction.additionalProperties)
                }

                /** The pending amount in USD cents. */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /** The pending amount in USD cents. */
                @JsonProperty("amount")
                @ExcludeMissing
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /** The identifier of the ACH Transfer that led to this Pending Transaction. */
                fun transferId(transferId: String) = transferId(JsonField.of(transferId))

                /** The identifier of the ACH Transfer that led to this Pending Transaction. */
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

                fun build(): AchTransferInstruction =
                    AchTransferInstruction(
                        amount,
                        transferId,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is AchTransferInstruction && this.amount == other.amount && this.transferId == other.transferId && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(amount, transferId, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "AchTransferInstruction{amount=$amount, transferId=$transferId, additionalProperties=$additionalProperties}"
        }

        /**
         * A Card Authorization object. This field will be present in the JSON response if and only
         * if `category` is equal to `card_authorization`.
         */
        @JsonDeserialize(builder = CardAuthorization.Builder::class)
        @NoAutoDetect
        class CardAuthorization
        private constructor(
            private val actioner: JsonField<Actioner>,
            private val amount: JsonField<Long>,
            private val cardPaymentId: JsonField<String>,
            private val currency: JsonField<Currency>,
            private val digitalWalletTokenId: JsonField<String>,
            private val direction: JsonField<Direction>,
            private val expiresAt: JsonField<OffsetDateTime>,
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
            private val pendingTransactionId: JsonField<String>,
            private val physicalCardId: JsonField<String>,
            private val presentmentAmount: JsonField<Long>,
            private val presentmentCurrency: JsonField<String>,
            private val processingCategory: JsonField<ProcessingCategory>,
            private val realTimeDecisionId: JsonField<String>,
            private val type: JsonField<Type>,
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
             * The pending amount in the minor unit of the transaction's currency. For dollars, for
             * example, this is cents.
             */
            fun amount(): Long = amount.getRequired("amount")

            /** The ID of the Card Payment this transaction belongs to. */
            fun cardPaymentId(): String = cardPaymentId.getRequired("card_payment_id")

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
             * currency.
             */
            fun currency(): Currency = currency.getRequired("currency")

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
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) when this authorization will
             * expire and the pending transaction will be released.
             */
            fun expiresAt(): OffsetDateTime = expiresAt.getRequired("expires_at")

            /** The Card Authorization identifier. */
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

            /** The identifier of the Pending Transaction associated with this Transaction. */
            fun pendingTransactionId(): Optional<String> =
                Optional.ofNullable(pendingTransactionId.getNullable("pending_transaction_id"))

            /**
             * If the authorization was made in-person with a physical card, the Physical Card that
             * was used.
             */
            fun physicalCardId(): Optional<String> =
                Optional.ofNullable(physicalCardId.getNullable("physical_card_id"))

            /** The pending amount in the minor unit of the transaction's presentment currency. */
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

            /**
             * A constant representing the object's type. For this resource it will always be
             * `card_authorization`.
             */
            fun type(): Type = type.getRequired("type")

            /** Fields related to verification of cardholder-provided values. */
            fun verification(): Verification = verification.getRequired("verification")

            /**
             * Whether this authorization was approved by Increase, the card network through
             * stand-in processing, or the user through a real-time decision.
             */
            @JsonProperty("actioner") @ExcludeMissing fun _actioner() = actioner

            /**
             * The pending amount in the minor unit of the transaction's currency. For dollars, for
             * example, this is cents.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            /** The ID of the Card Payment this transaction belongs to. */
            @JsonProperty("card_payment_id") @ExcludeMissing fun _cardPaymentId() = cardPaymentId

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
             * currency.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

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

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) when this authorization will
             * expire and the pending transaction will be released.
             */
            @JsonProperty("expires_at") @ExcludeMissing fun _expiresAt() = expiresAt

            /** The Card Authorization identifier. */
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

            /** The identifier of the Pending Transaction associated with this Transaction. */
            @JsonProperty("pending_transaction_id")
            @ExcludeMissing
            fun _pendingTransactionId() = pendingTransactionId

            /**
             * If the authorization was made in-person with a physical card, the Physical Card that
             * was used.
             */
            @JsonProperty("physical_card_id") @ExcludeMissing fun _physicalCardId() = physicalCardId

            /** The pending amount in the minor unit of the transaction's presentment currency. */
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

            /**
             * A constant representing the object's type. For this resource it will always be
             * `card_authorization`.
             */
            @JsonProperty("type") @ExcludeMissing fun _type() = type

            /** Fields related to verification of cardholder-provided values. */
            @JsonProperty("verification") @ExcludeMissing fun _verification() = verification

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): CardAuthorization = apply {
                if (!validated) {
                    actioner()
                    amount()
                    cardPaymentId()
                    currency()
                    digitalWalletTokenId()
                    direction()
                    expiresAt()
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
                    pendingTransactionId()
                    physicalCardId()
                    presentmentAmount()
                    presentmentCurrency()
                    processingCategory()
                    realTimeDecisionId()
                    type()
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
                private var digitalWalletTokenId: JsonField<String> = JsonMissing.of()
                private var direction: JsonField<Direction> = JsonMissing.of()
                private var expiresAt: JsonField<OffsetDateTime> = JsonMissing.of()
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
                private var pendingTransactionId: JsonField<String> = JsonMissing.of()
                private var physicalCardId: JsonField<String> = JsonMissing.of()
                private var presentmentAmount: JsonField<Long> = JsonMissing.of()
                private var presentmentCurrency: JsonField<String> = JsonMissing.of()
                private var processingCategory: JsonField<ProcessingCategory> = JsonMissing.of()
                private var realTimeDecisionId: JsonField<String> = JsonMissing.of()
                private var type: JsonField<Type> = JsonMissing.of()
                private var verification: JsonField<Verification> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(cardAuthorization: CardAuthorization) = apply {
                    this.actioner = cardAuthorization.actioner
                    this.amount = cardAuthorization.amount
                    this.cardPaymentId = cardAuthorization.cardPaymentId
                    this.currency = cardAuthorization.currency
                    this.digitalWalletTokenId = cardAuthorization.digitalWalletTokenId
                    this.direction = cardAuthorization.direction
                    this.expiresAt = cardAuthorization.expiresAt
                    this.id = cardAuthorization.id
                    this.merchantAcceptorId = cardAuthorization.merchantAcceptorId
                    this.merchantCategoryCode = cardAuthorization.merchantCategoryCode
                    this.merchantCity = cardAuthorization.merchantCity
                    this.merchantCountry = cardAuthorization.merchantCountry
                    this.merchantDescriptor = cardAuthorization.merchantDescriptor
                    this.merchantPostalCode = cardAuthorization.merchantPostalCode
                    this.merchantState = cardAuthorization.merchantState
                    this.networkDetails = cardAuthorization.networkDetails
                    this.networkIdentifiers = cardAuthorization.networkIdentifiers
                    this.networkRiskScore = cardAuthorization.networkRiskScore
                    this.pendingTransactionId = cardAuthorization.pendingTransactionId
                    this.physicalCardId = cardAuthorization.physicalCardId
                    this.presentmentAmount = cardAuthorization.presentmentAmount
                    this.presentmentCurrency = cardAuthorization.presentmentCurrency
                    this.processingCategory = cardAuthorization.processingCategory
                    this.realTimeDecisionId = cardAuthorization.realTimeDecisionId
                    this.type = cardAuthorization.type
                    this.verification = cardAuthorization.verification
                    additionalProperties(cardAuthorization.additionalProperties)
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
                 * The pending amount in the minor unit of the transaction's currency. For dollars,
                 * for example, this is cents.
                 */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /**
                 * The pending amount in the minor unit of the transaction's currency. For dollars,
                 * for example, this is cents.
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
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
                 * currency.
                 */
                fun currency(currency: Currency) = currency(JsonField.of(currency))

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
                 * currency.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

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

                /**
                 * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) when this authorization
                 * will expire and the pending transaction will be released.
                 */
                fun expiresAt(expiresAt: OffsetDateTime) = expiresAt(JsonField.of(expiresAt))

                /**
                 * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) when this authorization
                 * will expire and the pending transaction will be released.
                 */
                @JsonProperty("expires_at")
                @ExcludeMissing
                fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply {
                    this.expiresAt = expiresAt
                }

                /** The Card Authorization identifier. */
                fun id(id: String) = id(JsonField.of(id))

                /** The Card Authorization identifier. */
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

                /** The identifier of the Pending Transaction associated with this Transaction. */
                fun pendingTransactionId(pendingTransactionId: String) =
                    pendingTransactionId(JsonField.of(pendingTransactionId))

                /** The identifier of the Pending Transaction associated with this Transaction. */
                @JsonProperty("pending_transaction_id")
                @ExcludeMissing
                fun pendingTransactionId(pendingTransactionId: JsonField<String>) = apply {
                    this.pendingTransactionId = pendingTransactionId
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
                 * The pending amount in the minor unit of the transaction's presentment currency.
                 */
                fun presentmentAmount(presentmentAmount: Long) =
                    presentmentAmount(JsonField.of(presentmentAmount))

                /**
                 * The pending amount in the minor unit of the transaction's presentment currency.
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

                /**
                 * A constant representing the object's type. For this resource it will always be
                 * `card_authorization`.
                 */
                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * A constant representing the object's type. For this resource it will always be
                 * `card_authorization`.
                 */
                @JsonProperty("type")
                @ExcludeMissing
                fun type(type: JsonField<Type>) = apply { this.type = type }

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

                fun build(): CardAuthorization =
                    CardAuthorization(
                        actioner,
                        amount,
                        cardPaymentId,
                        currency,
                        digitalWalletTokenId,
                        direction,
                        expiresAt,
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
                        pendingTransactionId,
                        physicalCardId,
                        presentmentAmount,
                        presentmentCurrency,
                        processingCategory,
                        realTimeDecisionId,
                        type,
                        verification,
                        additionalProperties.toUnmodifiable(),
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
                            additionalProperties.toUnmodifiable(),
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

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): Visa = apply {
                        if (!validated) {
                            electronicCommerceIndicator()
                            pointOfServiceEntryMode()
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
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(visa: Visa) = apply {
                            this.electronicCommerceIndicator = visa.electronicCommerceIndicator
                            this.pointOfServiceEntryMode = visa.pointOfServiceEntryMode
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
                                additionalProperties.toUnmodifiable(),
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

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Visa && this.electronicCommerceIndicator == other.electronicCommerceIndicator && this.pointOfServiceEntryMode == other.pointOfServiceEntryMode && this.additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    private var hashCode: Int = 0

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode = /* spotless:off */ Objects.hash(electronicCommerceIndicator, pointOfServiceEntryMode, additionalProperties) /* spotless:on */
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "Visa{electronicCommerceIndicator=$electronicCommerceIndicator, pointOfServiceEntryMode=$pointOfServiceEntryMode, additionalProperties=$additionalProperties}"
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
                            additionalProperties.toUnmodifiable(),
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

                    @JvmField val CARD_AUTHORIZATION = Type(JsonField.of("card_authorization"))

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                enum class Known {
                    CARD_AUTHORIZATION,
                }

                enum class Value {
                    CARD_AUTHORIZATION,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        CARD_AUTHORIZATION -> Value.CARD_AUTHORIZATION
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        CARD_AUTHORIZATION -> Known.CARD_AUTHORIZATION
                        else -> throw IncreaseInvalidDataException("Unknown Type: $value")
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
                            additionalProperties.toUnmodifiable(),
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
                            CardVerificationCode(result, additionalProperties.toUnmodifiable())
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
                                additionalProperties.toUnmodifiable(),
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

                return /* spotless:off */ other is CardAuthorization && this.actioner == other.actioner && this.amount == other.amount && this.cardPaymentId == other.cardPaymentId && this.currency == other.currency && this.digitalWalletTokenId == other.digitalWalletTokenId && this.direction == other.direction && this.expiresAt == other.expiresAt && this.id == other.id && this.merchantAcceptorId == other.merchantAcceptorId && this.merchantCategoryCode == other.merchantCategoryCode && this.merchantCity == other.merchantCity && this.merchantCountry == other.merchantCountry && this.merchantDescriptor == other.merchantDescriptor && this.merchantPostalCode == other.merchantPostalCode && this.merchantState == other.merchantState && this.networkDetails == other.networkDetails && this.networkIdentifiers == other.networkIdentifiers && this.networkRiskScore == other.networkRiskScore && this.pendingTransactionId == other.pendingTransactionId && this.physicalCardId == other.physicalCardId && this.presentmentAmount == other.presentmentAmount && this.presentmentCurrency == other.presentmentCurrency && this.processingCategory == other.processingCategory && this.realTimeDecisionId == other.realTimeDecisionId && this.type == other.type && this.verification == other.verification && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(actioner, amount, cardPaymentId, currency, digitalWalletTokenId, direction, expiresAt, id, merchantAcceptorId, merchantCategoryCode, merchantCity, merchantCountry, merchantDescriptor, merchantPostalCode, merchantState, networkDetails, networkIdentifiers, networkRiskScore, pendingTransactionId, physicalCardId, presentmentAmount, presentmentCurrency, processingCategory, realTimeDecisionId, type, verification, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "CardAuthorization{actioner=$actioner, amount=$amount, cardPaymentId=$cardPaymentId, currency=$currency, digitalWalletTokenId=$digitalWalletTokenId, direction=$direction, expiresAt=$expiresAt, id=$id, merchantAcceptorId=$merchantAcceptorId, merchantCategoryCode=$merchantCategoryCode, merchantCity=$merchantCity, merchantCountry=$merchantCountry, merchantDescriptor=$merchantDescriptor, merchantPostalCode=$merchantPostalCode, merchantState=$merchantState, networkDetails=$networkDetails, networkIdentifiers=$networkIdentifiers, networkRiskScore=$networkRiskScore, pendingTransactionId=$pendingTransactionId, physicalCardId=$physicalCardId, presentmentAmount=$presentmentAmount, presentmentCurrency=$presentmentCurrency, processingCategory=$processingCategory, realTimeDecisionId=$realTimeDecisionId, type=$type, verification=$verification, additionalProperties=$additionalProperties}"
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

                @JvmField
                val ACCOUNT_TRANSFER_INSTRUCTION =
                    Category(JsonField.of("account_transfer_instruction"))

                @JvmField
                val ACH_TRANSFER_INSTRUCTION = Category(JsonField.of("ach_transfer_instruction"))

                @JvmField val CARD_AUTHORIZATION = Category(JsonField.of("card_authorization"))

                @JvmField
                val CHECK_DEPOSIT_INSTRUCTION = Category(JsonField.of("check_deposit_instruction"))

                @JvmField
                val CHECK_TRANSFER_INSTRUCTION =
                    Category(JsonField.of("check_transfer_instruction"))

                @JvmField val INBOUND_FUNDS_HOLD = Category(JsonField.of("inbound_funds_hold"))

                @JvmField
                val REAL_TIME_PAYMENTS_TRANSFER_INSTRUCTION =
                    Category(JsonField.of("real_time_payments_transfer_instruction"))

                @JvmField
                val WIRE_TRANSFER_INSTRUCTION = Category(JsonField.of("wire_transfer_instruction"))

                @JvmField val OTHER = Category(JsonField.of("other"))

                @JvmStatic fun of(value: String) = Category(JsonField.of(value))
            }

            enum class Known {
                ACCOUNT_TRANSFER_INSTRUCTION,
                ACH_TRANSFER_INSTRUCTION,
                CARD_AUTHORIZATION,
                CHECK_DEPOSIT_INSTRUCTION,
                CHECK_TRANSFER_INSTRUCTION,
                INBOUND_FUNDS_HOLD,
                REAL_TIME_PAYMENTS_TRANSFER_INSTRUCTION,
                WIRE_TRANSFER_INSTRUCTION,
                OTHER,
            }

            enum class Value {
                ACCOUNT_TRANSFER_INSTRUCTION,
                ACH_TRANSFER_INSTRUCTION,
                CARD_AUTHORIZATION,
                CHECK_DEPOSIT_INSTRUCTION,
                CHECK_TRANSFER_INSTRUCTION,
                INBOUND_FUNDS_HOLD,
                REAL_TIME_PAYMENTS_TRANSFER_INSTRUCTION,
                WIRE_TRANSFER_INSTRUCTION,
                OTHER,
                _UNKNOWN,
            }

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
                    OTHER -> Value.OTHER
                    else -> Value._UNKNOWN
                }

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
                    OTHER -> Known.OTHER
                    else -> throw IncreaseInvalidDataException("Unknown Category: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        /**
         * A Check Deposit Instruction object. This field will be present in the JSON response if
         * and only if `category` is equal to `check_deposit_instruction`.
         */
        @JsonDeserialize(builder = CheckDepositInstruction.Builder::class)
        @NoAutoDetect
        class CheckDepositInstruction
        private constructor(
            private val amount: JsonField<Long>,
            private val backImageFileId: JsonField<String>,
            private val checkDepositId: JsonField<String>,
            private val currency: JsonField<Currency>,
            private val frontImageFileId: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            /** The pending amount in USD cents. */
            fun amount(): Long = amount.getRequired("amount")

            /**
             * The identifier of the File containing the image of the back of the check that was
             * deposited.
             */
            fun backImageFileId(): Optional<String> =
                Optional.ofNullable(backImageFileId.getNullable("back_image_file_id"))

            /** The identifier of the Check Deposit. */
            fun checkDepositId(): Optional<String> =
                Optional.ofNullable(checkDepositId.getNullable("check_deposit_id"))

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
             * currency.
             */
            fun currency(): Currency = currency.getRequired("currency")

            /**
             * The identifier of the File containing the image of the front of the check that was
             * deposited.
             */
            fun frontImageFileId(): String = frontImageFileId.getRequired("front_image_file_id")

            /** The pending amount in USD cents. */
            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            /**
             * The identifier of the File containing the image of the back of the check that was
             * deposited.
             */
            @JsonProperty("back_image_file_id")
            @ExcludeMissing
            fun _backImageFileId() = backImageFileId

            /** The identifier of the Check Deposit. */
            @JsonProperty("check_deposit_id") @ExcludeMissing fun _checkDepositId() = checkDepositId

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
             * currency.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            /**
             * The identifier of the File containing the image of the front of the check that was
             * deposited.
             */
            @JsonProperty("front_image_file_id")
            @ExcludeMissing
            fun _frontImageFileId() = frontImageFileId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): CheckDepositInstruction = apply {
                if (!validated) {
                    amount()
                    backImageFileId()
                    checkDepositId()
                    currency()
                    frontImageFileId()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var amount: JsonField<Long> = JsonMissing.of()
                private var backImageFileId: JsonField<String> = JsonMissing.of()
                private var checkDepositId: JsonField<String> = JsonMissing.of()
                private var currency: JsonField<Currency> = JsonMissing.of()
                private var frontImageFileId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(checkDepositInstruction: CheckDepositInstruction) = apply {
                    this.amount = checkDepositInstruction.amount
                    this.backImageFileId = checkDepositInstruction.backImageFileId
                    this.checkDepositId = checkDepositInstruction.checkDepositId
                    this.currency = checkDepositInstruction.currency
                    this.frontImageFileId = checkDepositInstruction.frontImageFileId
                    additionalProperties(checkDepositInstruction.additionalProperties)
                }

                /** The pending amount in USD cents. */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /** The pending amount in USD cents. */
                @JsonProperty("amount")
                @ExcludeMissing
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /**
                 * The identifier of the File containing the image of the back of the check that was
                 * deposited.
                 */
                fun backImageFileId(backImageFileId: String) =
                    backImageFileId(JsonField.of(backImageFileId))

                /**
                 * The identifier of the File containing the image of the back of the check that was
                 * deposited.
                 */
                @JsonProperty("back_image_file_id")
                @ExcludeMissing
                fun backImageFileId(backImageFileId: JsonField<String>) = apply {
                    this.backImageFileId = backImageFileId
                }

                /** The identifier of the Check Deposit. */
                fun checkDepositId(checkDepositId: String) =
                    checkDepositId(JsonField.of(checkDepositId))

                /** The identifier of the Check Deposit. */
                @JsonProperty("check_deposit_id")
                @ExcludeMissing
                fun checkDepositId(checkDepositId: JsonField<String>) = apply {
                    this.checkDepositId = checkDepositId
                }

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
                 * currency.
                 */
                fun currency(currency: Currency) = currency(JsonField.of(currency))

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
                 * currency.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                /**
                 * The identifier of the File containing the image of the front of the check that
                 * was deposited.
                 */
                fun frontImageFileId(frontImageFileId: String) =
                    frontImageFileId(JsonField.of(frontImageFileId))

                /**
                 * The identifier of the File containing the image of the front of the check that
                 * was deposited.
                 */
                @JsonProperty("front_image_file_id")
                @ExcludeMissing
                fun frontImageFileId(frontImageFileId: JsonField<String>) = apply {
                    this.frontImageFileId = frontImageFileId
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

                fun build(): CheckDepositInstruction =
                    CheckDepositInstruction(
                        amount,
                        backImageFileId,
                        checkDepositId,
                        currency,
                        frontImageFileId,
                        additionalProperties.toUnmodifiable(),
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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is CheckDepositInstruction && this.amount == other.amount && this.backImageFileId == other.backImageFileId && this.checkDepositId == other.checkDepositId && this.currency == other.currency && this.frontImageFileId == other.frontImageFileId && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(amount, backImageFileId, checkDepositId, currency, frontImageFileId, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "CheckDepositInstruction{amount=$amount, backImageFileId=$backImageFileId, checkDepositId=$checkDepositId, currency=$currency, frontImageFileId=$frontImageFileId, additionalProperties=$additionalProperties}"
        }

        /**
         * A Check Transfer Instruction object. This field will be present in the JSON response if
         * and only if `category` is equal to `check_transfer_instruction`.
         */
        @JsonDeserialize(builder = CheckTransferInstruction.Builder::class)
        @NoAutoDetect
        class CheckTransferInstruction
        private constructor(
            private val amount: JsonField<Long>,
            private val currency: JsonField<Currency>,
            private val transferId: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            /** The transfer amount in USD cents. */
            fun amount(): Long = amount.getRequired("amount")

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the check's currency.
             */
            fun currency(): Currency = currency.getRequired("currency")

            /** The identifier of the Check Transfer that led to this Pending Transaction. */
            fun transferId(): String = transferId.getRequired("transfer_id")

            /** The transfer amount in USD cents. */
            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the check's currency.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            /** The identifier of the Check Transfer that led to this Pending Transaction. */
            @JsonProperty("transfer_id") @ExcludeMissing fun _transferId() = transferId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): CheckTransferInstruction = apply {
                if (!validated) {
                    amount()
                    currency()
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
                private var currency: JsonField<Currency> = JsonMissing.of()
                private var transferId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(checkTransferInstruction: CheckTransferInstruction) = apply {
                    this.amount = checkTransferInstruction.amount
                    this.currency = checkTransferInstruction.currency
                    this.transferId = checkTransferInstruction.transferId
                    additionalProperties(checkTransferInstruction.additionalProperties)
                }

                /** The transfer amount in USD cents. */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /** The transfer amount in USD cents. */
                @JsonProperty("amount")
                @ExcludeMissing
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

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

                /** The identifier of the Check Transfer that led to this Pending Transaction. */
                fun transferId(transferId: String) = transferId(JsonField.of(transferId))

                /** The identifier of the Check Transfer that led to this Pending Transaction. */
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

                fun build(): CheckTransferInstruction =
                    CheckTransferInstruction(
                        amount,
                        currency,
                        transferId,
                        additionalProperties.toUnmodifiable(),
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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is CheckTransferInstruction && this.amount == other.amount && this.currency == other.currency && this.transferId == other.transferId && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(amount, currency, transferId, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "CheckTransferInstruction{amount=$amount, currency=$currency, transferId=$transferId, additionalProperties=$additionalProperties}"
        }

        /**
         * An Inbound Funds Hold object. This field will be present in the JSON response if and only
         * if `category` is equal to `inbound_funds_hold`.
         */
        @JsonDeserialize(builder = InboundFundsHold.Builder::class)
        @NoAutoDetect
        class InboundFundsHold
        private constructor(
            private val amount: JsonField<Long>,
            private val automaticallyReleasesAt: JsonField<OffsetDateTime>,
            private val createdAt: JsonField<OffsetDateTime>,
            private val currency: JsonField<Currency>,
            private val heldTransactionId: JsonField<String>,
            private val id: JsonField<String>,
            private val pendingTransactionId: JsonField<String>,
            private val releasedAt: JsonField<OffsetDateTime>,
            private val status: JsonField<Status>,
            private val type: JsonField<Type>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            /**
             * The held amount in the minor unit of the account's currency. For dollars, for
             * example, this is cents.
             */
            fun amount(): Long = amount.getRequired("amount")

            /**
             * When the hold will be released automatically. Certain conditions may cause it to be
             * released before this time.
             */
            fun automaticallyReleasesAt(): OffsetDateTime =
                automaticallyReleasesAt.getRequired("automatically_releases_at")

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the hold was
             * created.
             */
            fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the hold's currency.
             */
            fun currency(): Currency = currency.getRequired("currency")

            /** The ID of the Transaction for which funds were held. */
            fun heldTransactionId(): Optional<String> =
                Optional.ofNullable(heldTransactionId.getNullable("held_transaction_id"))

            /** The Inbound Funds Hold identifier. */
            fun id(): String = id.getRequired("id")

            /** The ID of the Pending Transaction representing the held funds. */
            fun pendingTransactionId(): Optional<String> =
                Optional.ofNullable(pendingTransactionId.getNullable("pending_transaction_id"))

            /** When the hold was released (if it has been released). */
            fun releasedAt(): Optional<OffsetDateTime> =
                Optional.ofNullable(releasedAt.getNullable("released_at"))

            /** The status of the hold. */
            fun status(): Status = status.getRequired("status")

            /**
             * A constant representing the object's type. For this resource it will always be
             * `inbound_funds_hold`.
             */
            fun type(): Type = type.getRequired("type")

            /**
             * The held amount in the minor unit of the account's currency. For dollars, for
             * example, this is cents.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            /**
             * When the hold will be released automatically. Certain conditions may cause it to be
             * released before this time.
             */
            @JsonProperty("automatically_releases_at")
            @ExcludeMissing
            fun _automaticallyReleasesAt() = automaticallyReleasesAt

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the hold was
             * created.
             */
            @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the hold's currency.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            /** The ID of the Transaction for which funds were held. */
            @JsonProperty("held_transaction_id")
            @ExcludeMissing
            fun _heldTransactionId() = heldTransactionId

            /** The Inbound Funds Hold identifier. */
            @JsonProperty("id") @ExcludeMissing fun _id() = id

            /** The ID of the Pending Transaction representing the held funds. */
            @JsonProperty("pending_transaction_id")
            @ExcludeMissing
            fun _pendingTransactionId() = pendingTransactionId

            /** When the hold was released (if it has been released). */
            @JsonProperty("released_at") @ExcludeMissing fun _releasedAt() = releasedAt

            /** The status of the hold. */
            @JsonProperty("status") @ExcludeMissing fun _status() = status

            /**
             * A constant representing the object's type. For this resource it will always be
             * `inbound_funds_hold`.
             */
            @JsonProperty("type") @ExcludeMissing fun _type() = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): InboundFundsHold = apply {
                if (!validated) {
                    amount()
                    automaticallyReleasesAt()
                    createdAt()
                    currency()
                    heldTransactionId()
                    id()
                    pendingTransactionId()
                    releasedAt()
                    status()
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
                private var automaticallyReleasesAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var currency: JsonField<Currency> = JsonMissing.of()
                private var heldTransactionId: JsonField<String> = JsonMissing.of()
                private var id: JsonField<String> = JsonMissing.of()
                private var pendingTransactionId: JsonField<String> = JsonMissing.of()
                private var releasedAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var status: JsonField<Status> = JsonMissing.of()
                private var type: JsonField<Type> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(inboundFundsHold: InboundFundsHold) = apply {
                    this.amount = inboundFundsHold.amount
                    this.automaticallyReleasesAt = inboundFundsHold.automaticallyReleasesAt
                    this.createdAt = inboundFundsHold.createdAt
                    this.currency = inboundFundsHold.currency
                    this.heldTransactionId = inboundFundsHold.heldTransactionId
                    this.id = inboundFundsHold.id
                    this.pendingTransactionId = inboundFundsHold.pendingTransactionId
                    this.releasedAt = inboundFundsHold.releasedAt
                    this.status = inboundFundsHold.status
                    this.type = inboundFundsHold.type
                    additionalProperties(inboundFundsHold.additionalProperties)
                }

                /**
                 * The held amount in the minor unit of the account's currency. For dollars, for
                 * example, this is cents.
                 */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /**
                 * The held amount in the minor unit of the account's currency. For dollars, for
                 * example, this is cents.
                 */
                @JsonProperty("amount")
                @ExcludeMissing
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /**
                 * When the hold will be released automatically. Certain conditions may cause it to
                 * be released before this time.
                 */
                fun automaticallyReleasesAt(automaticallyReleasesAt: OffsetDateTime) =
                    automaticallyReleasesAt(JsonField.of(automaticallyReleasesAt))

                /**
                 * When the hold will be released automatically. Certain conditions may cause it to
                 * be released before this time.
                 */
                @JsonProperty("automatically_releases_at")
                @ExcludeMissing
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
                 * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the hold was
                 * created.
                 */
                @JsonProperty("created_at")
                @ExcludeMissing
                fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                    this.createdAt = createdAt
                }

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the hold's
                 * currency.
                 */
                fun currency(currency: Currency) = currency(JsonField.of(currency))

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the hold's
                 * currency.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                /** The ID of the Transaction for which funds were held. */
                fun heldTransactionId(heldTransactionId: String) =
                    heldTransactionId(JsonField.of(heldTransactionId))

                /** The ID of the Transaction for which funds were held. */
                @JsonProperty("held_transaction_id")
                @ExcludeMissing
                fun heldTransactionId(heldTransactionId: JsonField<String>) = apply {
                    this.heldTransactionId = heldTransactionId
                }

                /** The Inbound Funds Hold identifier. */
                fun id(id: String) = id(JsonField.of(id))

                /** The Inbound Funds Hold identifier. */
                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                /** The ID of the Pending Transaction representing the held funds. */
                fun pendingTransactionId(pendingTransactionId: String) =
                    pendingTransactionId(JsonField.of(pendingTransactionId))

                /** The ID of the Pending Transaction representing the held funds. */
                @JsonProperty("pending_transaction_id")
                @ExcludeMissing
                fun pendingTransactionId(pendingTransactionId: JsonField<String>) = apply {
                    this.pendingTransactionId = pendingTransactionId
                }

                /** When the hold was released (if it has been released). */
                fun releasedAt(releasedAt: OffsetDateTime) = releasedAt(JsonField.of(releasedAt))

                /** When the hold was released (if it has been released). */
                @JsonProperty("released_at")
                @ExcludeMissing
                fun releasedAt(releasedAt: JsonField<OffsetDateTime>) = apply {
                    this.releasedAt = releasedAt
                }

                /** The status of the hold. */
                fun status(status: Status) = status(JsonField.of(status))

                /** The status of the hold. */
                @JsonProperty("status")
                @ExcludeMissing
                fun status(status: JsonField<Status>) = apply { this.status = status }

                /**
                 * A constant representing the object's type. For this resource it will always be
                 * `inbound_funds_hold`.
                 */
                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * A constant representing the object's type. For this resource it will always be
                 * `inbound_funds_hold`.
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

                fun build(): InboundFundsHold =
                    InboundFundsHold(
                        amount,
                        automaticallyReleasesAt,
                        createdAt,
                        currency,
                        heldTransactionId,
                        id,
                        pendingTransactionId,
                        releasedAt,
                        status,
                        type,
                        additionalProperties.toUnmodifiable(),
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

            class Status
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Status && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    @JvmField val HELD = Status(JsonField.of("held"))

                    @JvmField val COMPLETE = Status(JsonField.of("complete"))

                    @JvmStatic fun of(value: String) = Status(JsonField.of(value))
                }

                enum class Known {
                    HELD,
                    COMPLETE,
                }

                enum class Value {
                    HELD,
                    COMPLETE,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        HELD -> Value.HELD
                        COMPLETE -> Value.COMPLETE
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        HELD -> Known.HELD
                        COMPLETE -> Known.COMPLETE
                        else -> throw IncreaseInvalidDataException("Unknown Status: $value")
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

                    @JvmField val INBOUND_FUNDS_HOLD = Type(JsonField.of("inbound_funds_hold"))

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                enum class Known {
                    INBOUND_FUNDS_HOLD,
                }

                enum class Value {
                    INBOUND_FUNDS_HOLD,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        INBOUND_FUNDS_HOLD -> Value.INBOUND_FUNDS_HOLD
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        INBOUND_FUNDS_HOLD -> Known.INBOUND_FUNDS_HOLD
                        else -> throw IncreaseInvalidDataException("Unknown Type: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is InboundFundsHold && this.amount == other.amount && this.automaticallyReleasesAt == other.automaticallyReleasesAt && this.createdAt == other.createdAt && this.currency == other.currency && this.heldTransactionId == other.heldTransactionId && this.id == other.id && this.pendingTransactionId == other.pendingTransactionId && this.releasedAt == other.releasedAt && this.status == other.status && this.type == other.type && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(amount, automaticallyReleasesAt, createdAt, currency, heldTransactionId, id, pendingTransactionId, releasedAt, status, type, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "InboundFundsHold{amount=$amount, automaticallyReleasesAt=$automaticallyReleasesAt, createdAt=$createdAt, currency=$currency, heldTransactionId=$heldTransactionId, id=$id, pendingTransactionId=$pendingTransactionId, releasedAt=$releasedAt, status=$status, type=$type, additionalProperties=$additionalProperties}"
        }

        /**
         * A Real-Time Payments Transfer Instruction object. This field will be present in the JSON
         * response if and only if `category` is equal to `real_time_payments_transfer_instruction`.
         */
        @JsonDeserialize(builder = RealTimePaymentsTransferInstruction.Builder::class)
        @NoAutoDetect
        class RealTimePaymentsTransferInstruction
        private constructor(
            private val amount: JsonField<Long>,
            private val transferId: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            /** The transfer amount in USD cents. */
            fun amount(): Long = amount.getRequired("amount")

            /**
             * The identifier of the Real-Time Payments Transfer that led to this Pending
             * Transaction.
             */
            fun transferId(): String = transferId.getRequired("transfer_id")

            /** The transfer amount in USD cents. */
            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            /**
             * The identifier of the Real-Time Payments Transfer that led to this Pending
             * Transaction.
             */
            @JsonProperty("transfer_id") @ExcludeMissing fun _transferId() = transferId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): RealTimePaymentsTransferInstruction = apply {
                if (!validated) {
                    amount()
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
                private var transferId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    realTimePaymentsTransferInstruction: RealTimePaymentsTransferInstruction
                ) = apply {
                    this.amount = realTimePaymentsTransferInstruction.amount
                    this.transferId = realTimePaymentsTransferInstruction.transferId
                    additionalProperties(realTimePaymentsTransferInstruction.additionalProperties)
                }

                /** The transfer amount in USD cents. */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /** The transfer amount in USD cents. */
                @JsonProperty("amount")
                @ExcludeMissing
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /**
                 * The identifier of the Real-Time Payments Transfer that led to this Pending
                 * Transaction.
                 */
                fun transferId(transferId: String) = transferId(JsonField.of(transferId))

                /**
                 * The identifier of the Real-Time Payments Transfer that led to this Pending
                 * Transaction.
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

                fun build(): RealTimePaymentsTransferInstruction =
                    RealTimePaymentsTransferInstruction(
                        amount,
                        transferId,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is RealTimePaymentsTransferInstruction && this.amount == other.amount && this.transferId == other.transferId && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(amount, transferId, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "RealTimePaymentsTransferInstruction{amount=$amount, transferId=$transferId, additionalProperties=$additionalProperties}"
        }

        /**
         * A Wire Transfer Instruction object. This field will be present in the JSON response if
         * and only if `category` is equal to `wire_transfer_instruction`.
         */
        @JsonDeserialize(builder = WireTransferInstruction.Builder::class)
        @NoAutoDetect
        class WireTransferInstruction
        private constructor(
            private val accountNumber: JsonField<String>,
            private val amount: JsonField<Long>,
            private val messageToRecipient: JsonField<String>,
            private val routingNumber: JsonField<String>,
            private val transferId: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            /** The account number for the destination account. */
            fun accountNumber(): String = accountNumber.getRequired("account_number")

            /** The transfer amount in USD cents. */
            fun amount(): Long = amount.getRequired("amount")

            /** The message that will show on the recipient's bank statement. */
            fun messageToRecipient(): String =
                messageToRecipient.getRequired("message_to_recipient")

            /**
             * The American Bankers' Association (ABA) Routing Transit Number (RTN) for the
             * destination account.
             */
            fun routingNumber(): String = routingNumber.getRequired("routing_number")

            /** The identifier of the Wire Transfer that led to this Pending Transaction. */
            fun transferId(): String = transferId.getRequired("transfer_id")

            /** The account number for the destination account. */
            @JsonProperty("account_number") @ExcludeMissing fun _accountNumber() = accountNumber

            /** The transfer amount in USD cents. */
            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            /** The message that will show on the recipient's bank statement. */
            @JsonProperty("message_to_recipient")
            @ExcludeMissing
            fun _messageToRecipient() = messageToRecipient

            /**
             * The American Bankers' Association (ABA) Routing Transit Number (RTN) for the
             * destination account.
             */
            @JsonProperty("routing_number") @ExcludeMissing fun _routingNumber() = routingNumber

            /** The identifier of the Wire Transfer that led to this Pending Transaction. */
            @JsonProperty("transfer_id") @ExcludeMissing fun _transferId() = transferId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): WireTransferInstruction = apply {
                if (!validated) {
                    accountNumber()
                    amount()
                    messageToRecipient()
                    routingNumber()
                    transferId()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var accountNumber: JsonField<String> = JsonMissing.of()
                private var amount: JsonField<Long> = JsonMissing.of()
                private var messageToRecipient: JsonField<String> = JsonMissing.of()
                private var routingNumber: JsonField<String> = JsonMissing.of()
                private var transferId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(wireTransferInstruction: WireTransferInstruction) = apply {
                    this.accountNumber = wireTransferInstruction.accountNumber
                    this.amount = wireTransferInstruction.amount
                    this.messageToRecipient = wireTransferInstruction.messageToRecipient
                    this.routingNumber = wireTransferInstruction.routingNumber
                    this.transferId = wireTransferInstruction.transferId
                    additionalProperties(wireTransferInstruction.additionalProperties)
                }

                /** The account number for the destination account. */
                fun accountNumber(accountNumber: String) =
                    accountNumber(JsonField.of(accountNumber))

                /** The account number for the destination account. */
                @JsonProperty("account_number")
                @ExcludeMissing
                fun accountNumber(accountNumber: JsonField<String>) = apply {
                    this.accountNumber = accountNumber
                }

                /** The transfer amount in USD cents. */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /** The transfer amount in USD cents. */
                @JsonProperty("amount")
                @ExcludeMissing
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /** The message that will show on the recipient's bank statement. */
                fun messageToRecipient(messageToRecipient: String) =
                    messageToRecipient(JsonField.of(messageToRecipient))

                /** The message that will show on the recipient's bank statement. */
                @JsonProperty("message_to_recipient")
                @ExcludeMissing
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
                 * The American Bankers' Association (ABA) Routing Transit Number (RTN) for the
                 * destination account.
                 */
                @JsonProperty("routing_number")
                @ExcludeMissing
                fun routingNumber(routingNumber: JsonField<String>) = apply {
                    this.routingNumber = routingNumber
                }

                /** The identifier of the Wire Transfer that led to this Pending Transaction. */
                fun transferId(transferId: String) = transferId(JsonField.of(transferId))

                /** The identifier of the Wire Transfer that led to this Pending Transaction. */
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

                fun build(): WireTransferInstruction =
                    WireTransferInstruction(
                        accountNumber,
                        amount,
                        messageToRecipient,
                        routingNumber,
                        transferId,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is WireTransferInstruction && this.accountNumber == other.accountNumber && this.amount == other.amount && this.messageToRecipient == other.messageToRecipient && this.routingNumber == other.routingNumber && this.transferId == other.transferId && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(accountNumber, amount, messageToRecipient, routingNumber, transferId, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "WireTransferInstruction{accountNumber=$accountNumber, amount=$amount, messageToRecipient=$messageToRecipient, routingNumber=$routingNumber, transferId=$transferId, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Source && this.accountTransferInstruction == other.accountTransferInstruction && this.achTransferInstruction == other.achTransferInstruction && this.cardAuthorization == other.cardAuthorization && this.category == other.category && this.checkDepositInstruction == other.checkDepositInstruction && this.checkTransferInstruction == other.checkTransferInstruction && this.inboundFundsHold == other.inboundFundsHold && this.other == other.other && this.realTimePaymentsTransferInstruction == other.realTimePaymentsTransferInstruction && this.wireTransferInstruction == other.wireTransferInstruction && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(accountTransferInstruction, achTransferInstruction, cardAuthorization, category, checkDepositInstruction, checkTransferInstruction, inboundFundsHold, other, realTimePaymentsTransferInstruction, wireTransferInstruction, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "Source{accountTransferInstruction=$accountTransferInstruction, achTransferInstruction=$achTransferInstruction, cardAuthorization=$cardAuthorization, category=$category, checkDepositInstruction=$checkDepositInstruction, checkTransferInstruction=$checkTransferInstruction, inboundFundsHold=$inboundFundsHold, other=$other, realTimePaymentsTransferInstruction=$realTimePaymentsTransferInstruction, wireTransferInstruction=$wireTransferInstruction, additionalProperties=$additionalProperties}"
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Status && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val PENDING = Status(JsonField.of("pending"))

            @JvmField val COMPLETE = Status(JsonField.of("complete"))

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            PENDING,
            COMPLETE,
        }

        enum class Value {
            PENDING,
            COMPLETE,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                PENDING -> Value.PENDING
                COMPLETE -> Value.COMPLETE
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                PENDING -> Known.PENDING
                COMPLETE -> Known.COMPLETE
                else -> throw IncreaseInvalidDataException("Unknown Status: $value")
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

            @JvmField val PENDING_TRANSACTION = Type(JsonField.of("pending_transaction"))

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            PENDING_TRANSACTION,
        }

        enum class Value {
            PENDING_TRANSACTION,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                PENDING_TRANSACTION -> Value.PENDING_TRANSACTION
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                PENDING_TRANSACTION -> Known.PENDING_TRANSACTION
                else -> throw IncreaseInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PendingTransaction && this.accountId == other.accountId && this.amount == other.amount && this.completedAt == other.completedAt && this.createdAt == other.createdAt && this.currency == other.currency && this.description == other.description && this.id == other.id && this.routeId == other.routeId && this.routeType == other.routeType && this.source == other.source && this.status == other.status && this.type == other.type && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(accountId, amount, completedAt, createdAt, currency, description, id, routeId, routeType, source, status, type, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "PendingTransaction{accountId=$accountId, amount=$amount, completedAt=$completedAt, createdAt=$createdAt, currency=$currency, description=$description, id=$id, routeId=$routeId, routeType=$routeType, source=$source, status=$status, type=$type, additionalProperties=$additionalProperties}"
}
