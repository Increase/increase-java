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
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

/**
 * Transactions are the immutable additions and removals of money from your bank account. They're
 * the equivalent of line items on your bank statement.
 */
@JsonDeserialize(builder = Transaction.Builder::class)
@NoAutoDetect
class Transaction
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

    private var hashCode: Int = 0

    /** The identifier for the Account the Transaction belongs to. */
    fun accountId(): String = accountId.getRequired("account_id")

    /**
     * The Transaction amount in the minor unit of its currency. For dollars, for example, this is
     * cents.
     */
    fun amount(): Long = amount.getRequired("amount")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date on which the Transaction
     * occurred.
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the Transaction's currency.
     * This will match the currency on the Transaction's Account.
     */
    fun currency(): Currency = currency.getRequired("currency")

    /**
     * An informational message describing this transaction. Use the fields in `source` to get more
     * detailed information. This field appears as the line-item on the statement.
     */
    fun description(): String = description.getRequired("description")

    /** The Transaction identifier. */
    fun id(): String = id.getRequired("id")

    /**
     * The identifier for the route this Transaction came through. Routes are things like cards and
     * ACH details.
     */
    fun routeId(): Optional<String> = Optional.ofNullable(routeId.getNullable("route_id"))

    /** The type of the route this Transaction came through. */
    fun routeType(): Optional<RouteType> = Optional.ofNullable(routeType.getNullable("route_type"))

    /**
     * This is an object giving more details on the network-level event that caused the Transaction.
     * Note that for backwards compatibility reasons, additional undocumented keys may appear in
     * this object. These should be treated as deprecated and will be removed in the future.
     */
    fun source(): Source = source.getRequired("source")

    /**
     * A constant representing the object's type. For this resource it will always be `transaction`.
     */
    fun type(): Type = type.getRequired("type")

    /** The identifier for the Account the Transaction belongs to. */
    @JsonProperty("account_id") @ExcludeMissing fun _accountId() = accountId

    /**
     * The Transaction amount in the minor unit of its currency. For dollars, for example, this is
     * cents.
     */
    @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date on which the Transaction
     * occurred.
     */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    /**
     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the Transaction's currency.
     * This will match the currency on the Transaction's Account.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

    /**
     * An informational message describing this transaction. Use the fields in `source` to get more
     * detailed information. This field appears as the line-item on the statement.
     */
    @JsonProperty("description") @ExcludeMissing fun _description() = description

    /** The Transaction identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /**
     * The identifier for the route this Transaction came through. Routes are things like cards and
     * ACH details.
     */
    @JsonProperty("route_id") @ExcludeMissing fun _routeId() = routeId

    /** The type of the route this Transaction came through. */
    @JsonProperty("route_type") @ExcludeMissing fun _routeType() = routeType

    /**
     * This is an object giving more details on the network-level event that caused the Transaction.
     * Note that for backwards compatibility reasons, additional undocumented keys may appear in
     * this object. These should be treated as deprecated and will be removed in the future.
     */
    @JsonProperty("source") @ExcludeMissing fun _source() = source

    /**
     * A constant representing the object's type. For this resource it will always be `transaction`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): Transaction = apply {
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Transaction &&
            this.accountId == other.accountId &&
            this.amount == other.amount &&
            this.createdAt == other.createdAt &&
            this.currency == other.currency &&
            this.description == other.description &&
            this.id == other.id &&
            this.routeId == other.routeId &&
            this.routeType == other.routeType &&
            this.source == other.source &&
            this.type == other.type &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
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
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "Transaction{accountId=$accountId, amount=$amount, createdAt=$createdAt, currency=$currency, description=$description, id=$id, routeId=$routeId, routeType=$routeType, source=$source, type=$type, additionalProperties=$additionalProperties}"

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
        internal fun from(transaction: Transaction) = apply {
            this.accountId = transaction.accountId
            this.amount = transaction.amount
            this.createdAt = transaction.createdAt
            this.currency = transaction.currency
            this.description = transaction.description
            this.id = transaction.id
            this.routeId = transaction.routeId
            this.routeType = transaction.routeType
            this.source = transaction.source
            this.type = transaction.type
            additionalProperties(transaction.additionalProperties)
        }

        /** The identifier for the Account the Transaction belongs to. */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /** The identifier for the Account the Transaction belongs to. */
        @JsonProperty("account_id")
        @ExcludeMissing
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        /**
         * The Transaction amount in the minor unit of its currency. For dollars, for example, this
         * is cents.
         */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /**
         * The Transaction amount in the minor unit of its currency. For dollars, for example, this
         * is cents.
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
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the Transaction's
         * currency. This will match the currency on the Transaction's Account.
         */
        fun currency(currency: Currency) = currency(JsonField.of(currency))

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the Transaction's
         * currency. This will match the currency on the Transaction's Account.
         */
        @JsonProperty("currency")
        @ExcludeMissing
        fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

        /**
         * An informational message describing this transaction. Use the fields in `source` to get
         * more detailed information. This field appears as the line-item on the statement.
         */
        fun description(description: String) = description(JsonField.of(description))

        /**
         * An informational message describing this transaction. Use the fields in `source` to get
         * more detailed information. This field appears as the line-item on the statement.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** The Transaction identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The Transaction identifier. */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * The identifier for the route this Transaction came through. Routes are things like cards
         * and ACH details.
         */
        fun routeId(routeId: String) = routeId(JsonField.of(routeId))

        /**
         * The identifier for the route this Transaction came through. Routes are things like cards
         * and ACH details.
         */
        @JsonProperty("route_id")
        @ExcludeMissing
        fun routeId(routeId: JsonField<String>) = apply { this.routeId = routeId }

        /** The type of the route this Transaction came through. */
        fun routeType(routeType: RouteType) = routeType(JsonField.of(routeType))

        /** The type of the route this Transaction came through. */
        @JsonProperty("route_type")
        @ExcludeMissing
        fun routeType(routeType: JsonField<RouteType>) = apply { this.routeType = routeType }

        /**
         * This is an object giving more details on the network-level event that caused the
         * Transaction. Note that for backwards compatibility reasons, additional undocumented keys
         * may appear in this object. These should be treated as deprecated and will be removed in
         * the future.
         */
        fun source(source: Source) = source(JsonField.of(source))

        /**
         * This is an object giving more details on the network-level event that caused the
         * Transaction. Note that for backwards compatibility reasons, additional undocumented keys
         * may appear in this object. These should be treated as deprecated and will be removed in
         * the future.
         */
        @JsonProperty("source")
        @ExcludeMissing
        fun source(source: JsonField<Source>) = apply { this.source = source }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `transaction`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be
         * `transaction`.
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

        fun build(): Transaction =
            Transaction(
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

            return other is Currency && this.value == other.value
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

            return other is RouteType && this.value == other.value
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
     * This is an object giving more details on the network-level event that caused the Transaction.
     * Note that for backwards compatibility reasons, additional undocumented keys may appear in
     * this object. These should be treated as deprecated and will be removed in the future.
     */
    @JsonDeserialize(builder = Source.Builder::class)
    @NoAutoDetect
    class Source
    private constructor(
        private val accountTransferIntention: JsonField<AccountTransferIntention>,
        private val achTransferIntention: JsonField<AchTransferIntention>,
        private val achTransferRejection: JsonField<AchTransferRejection>,
        private val achTransferReturn: JsonField<AchTransferReturn>,
        private val cardDisputeAcceptance: JsonField<CardDisputeAcceptance>,
        private val cardDisputeLoss: JsonField<CardDisputeLoss>,
        private val cardRefund: JsonField<CardRefund>,
        private val cardRevenuePayment: JsonField<CardRevenuePayment>,
        private val cardSettlement: JsonField<CardSettlement>,
        private val cashbackPayment: JsonField<CashbackPayment>,
        private val category: JsonField<Category>,
        private val checkDepositAcceptance: JsonField<CheckDepositAcceptance>,
        private val checkDepositReturn: JsonField<CheckDepositReturn>,
        private val checkTransferDeposit: JsonField<CheckTransferDeposit>,
        private val feePayment: JsonField<FeePayment>,
        private val inboundAchTransfer: JsonField<InboundAchTransfer>,
        private val inboundRealTimePaymentsTransferConfirmation:
            JsonField<InboundRealTimePaymentsTransferConfirmation>,
        private val inboundRealTimePaymentsTransferDecline:
            JsonField<InboundRealTimePaymentsTransferDecline>,
        private val inboundWireReversal: JsonField<InboundWireReversal>,
        private val inboundWireTransfer: JsonField<InboundWireTransfer>,
        private val interestPayment: JsonField<InterestPayment>,
        private val internalSource: JsonField<InternalSource>,
        private val other: JsonValue,
        private val realTimePaymentsTransferAcknowledgement:
            JsonField<RealTimePaymentsTransferAcknowledgement>,
        private val sampleFunds: JsonField<SampleFunds>,
        private val wireTransferIntention: JsonField<WireTransferIntention>,
        private val wireTransferRejection: JsonField<WireTransferRejection>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /**
         * An Account Transfer Intention object. This field will be present in the JSON response if
         * and only if `category` is equal to `account_transfer_intention`.
         */
        fun accountTransferIntention(): Optional<AccountTransferIntention> =
            Optional.ofNullable(accountTransferIntention.getNullable("account_transfer_intention"))

        /**
         * An ACH Transfer Intention object. This field will be present in the JSON response if and
         * only if `category` is equal to `ach_transfer_intention`.
         */
        fun achTransferIntention(): Optional<AchTransferIntention> =
            Optional.ofNullable(achTransferIntention.getNullable("ach_transfer_intention"))

        /**
         * An ACH Transfer Rejection object. This field will be present in the JSON response if and
         * only if `category` is equal to `ach_transfer_rejection`.
         */
        fun achTransferRejection(): Optional<AchTransferRejection> =
            Optional.ofNullable(achTransferRejection.getNullable("ach_transfer_rejection"))

        /**
         * An ACH Transfer Return object. This field will be present in the JSON response if and
         * only if `category` is equal to `ach_transfer_return`.
         */
        fun achTransferReturn(): Optional<AchTransferReturn> =
            Optional.ofNullable(achTransferReturn.getNullable("ach_transfer_return"))

        /**
         * A Card Dispute Acceptance object. This field will be present in the JSON response if and
         * only if `category` is equal to `card_dispute_acceptance`.
         */
        fun cardDisputeAcceptance(): Optional<CardDisputeAcceptance> =
            Optional.ofNullable(cardDisputeAcceptance.getNullable("card_dispute_acceptance"))

        /**
         * A Card Dispute Loss object. This field will be present in the JSON response if and only
         * if `category` is equal to `card_dispute_loss`.
         */
        fun cardDisputeLoss(): Optional<CardDisputeLoss> =
            Optional.ofNullable(cardDisputeLoss.getNullable("card_dispute_loss"))

        /**
         * A Card Refund object. This field will be present in the JSON response if and only if
         * `category` is equal to `card_refund`.
         */
        fun cardRefund(): Optional<CardRefund> =
            Optional.ofNullable(cardRefund.getNullable("card_refund"))

        /**
         * A Card Revenue Payment object. This field will be present in the JSON response if and
         * only if `category` is equal to `card_revenue_payment`.
         */
        fun cardRevenuePayment(): Optional<CardRevenuePayment> =
            Optional.ofNullable(cardRevenuePayment.getNullable("card_revenue_payment"))

        /**
         * A Card Settlement object. This field will be present in the JSON response if and only if
         * `category` is equal to `card_settlement`.
         */
        fun cardSettlement(): Optional<CardSettlement> =
            Optional.ofNullable(cardSettlement.getNullable("card_settlement"))

        /**
         * A Cashback Payment object. This field will be present in the JSON response if and only if
         * `category` is equal to `cashback_payment`.
         */
        fun cashbackPayment(): Optional<CashbackPayment> =
            Optional.ofNullable(cashbackPayment.getNullable("cashback_payment"))

        /**
         * The type of the resource. We may add additional possible values for this enum over time;
         * your application should be able to handle such additions gracefully.
         */
        fun category(): Category = category.getRequired("category")

        /**
         * A Check Deposit Acceptance object. This field will be present in the JSON response if and
         * only if `category` is equal to `check_deposit_acceptance`.
         */
        fun checkDepositAcceptance(): Optional<CheckDepositAcceptance> =
            Optional.ofNullable(checkDepositAcceptance.getNullable("check_deposit_acceptance"))

        /**
         * A Check Deposit Return object. This field will be present in the JSON response if and
         * only if `category` is equal to `check_deposit_return`.
         */
        fun checkDepositReturn(): Optional<CheckDepositReturn> =
            Optional.ofNullable(checkDepositReturn.getNullable("check_deposit_return"))

        /**
         * A Check Transfer Deposit object. This field will be present in the JSON response if and
         * only if `category` is equal to `check_transfer_deposit`.
         */
        fun checkTransferDeposit(): Optional<CheckTransferDeposit> =
            Optional.ofNullable(checkTransferDeposit.getNullable("check_transfer_deposit"))

        /**
         * A Fee Payment object. This field will be present in the JSON response if and only if
         * `category` is equal to `fee_payment`.
         */
        fun feePayment(): Optional<FeePayment> =
            Optional.ofNullable(feePayment.getNullable("fee_payment"))

        /**
         * An Inbound ACH Transfer Intention object. This field will be present in the JSON response
         * if and only if `category` is equal to `inbound_ach_transfer`.
         */
        fun inboundAchTransfer(): Optional<InboundAchTransfer> =
            Optional.ofNullable(inboundAchTransfer.getNullable("inbound_ach_transfer"))

        /**
         * An Inbound Real-Time Payments Transfer Confirmation object. This field will be present in
         * the JSON response if and only if `category` is equal to
         * `inbound_real_time_payments_transfer_confirmation`.
         */
        fun inboundRealTimePaymentsTransferConfirmation():
            Optional<InboundRealTimePaymentsTransferConfirmation> =
            Optional.ofNullable(
                inboundRealTimePaymentsTransferConfirmation.getNullable(
                    "inbound_real_time_payments_transfer_confirmation"
                )
            )

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
         * An Inbound Wire Reversal object. This field will be present in the JSON response if and
         * only if `category` is equal to `inbound_wire_reversal`.
         */
        fun inboundWireReversal(): Optional<InboundWireReversal> =
            Optional.ofNullable(inboundWireReversal.getNullable("inbound_wire_reversal"))

        /**
         * An Inbound Wire Transfer Intention object. This field will be present in the JSON
         * response if and only if `category` is equal to `inbound_wire_transfer`.
         */
        fun inboundWireTransfer(): Optional<InboundWireTransfer> =
            Optional.ofNullable(inboundWireTransfer.getNullable("inbound_wire_transfer"))

        /**
         * An Interest Payment object. This field will be present in the JSON response if and only
         * if `category` is equal to `interest_payment`.
         */
        fun interestPayment(): Optional<InterestPayment> =
            Optional.ofNullable(interestPayment.getNullable("interest_payment"))

        /**
         * An Internal Source object. This field will be present in the JSON response if and only if
         * `category` is equal to `internal_source`.
         */
        fun internalSource(): Optional<InternalSource> =
            Optional.ofNullable(internalSource.getNullable("internal_source"))

        /**
         * A Real-Time Payments Transfer Acknowledgement object. This field will be present in the
         * JSON response if and only if `category` is equal to
         * `real_time_payments_transfer_acknowledgement`.
         */
        fun realTimePaymentsTransferAcknowledgement():
            Optional<RealTimePaymentsTransferAcknowledgement> =
            Optional.ofNullable(
                realTimePaymentsTransferAcknowledgement.getNullable(
                    "real_time_payments_transfer_acknowledgement"
                )
            )

        /**
         * A Sample Funds object. This field will be present in the JSON response if and only if
         * `category` is equal to `sample_funds`.
         */
        fun sampleFunds(): Optional<SampleFunds> =
            Optional.ofNullable(sampleFunds.getNullable("sample_funds"))

        /**
         * A Wire Transfer Intention object. This field will be present in the JSON response if and
         * only if `category` is equal to `wire_transfer_intention`.
         */
        fun wireTransferIntention(): Optional<WireTransferIntention> =
            Optional.ofNullable(wireTransferIntention.getNullable("wire_transfer_intention"))

        /**
         * A Wire Transfer Rejection object. This field will be present in the JSON response if and
         * only if `category` is equal to `wire_transfer_rejection`.
         */
        fun wireTransferRejection(): Optional<WireTransferRejection> =
            Optional.ofNullable(wireTransferRejection.getNullable("wire_transfer_rejection"))

        /**
         * An Account Transfer Intention object. This field will be present in the JSON response if
         * and only if `category` is equal to `account_transfer_intention`.
         */
        @JsonProperty("account_transfer_intention")
        @ExcludeMissing
        fun _accountTransferIntention() = accountTransferIntention

        /**
         * An ACH Transfer Intention object. This field will be present in the JSON response if and
         * only if `category` is equal to `ach_transfer_intention`.
         */
        @JsonProperty("ach_transfer_intention")
        @ExcludeMissing
        fun _achTransferIntention() = achTransferIntention

        /**
         * An ACH Transfer Rejection object. This field will be present in the JSON response if and
         * only if `category` is equal to `ach_transfer_rejection`.
         */
        @JsonProperty("ach_transfer_rejection")
        @ExcludeMissing
        fun _achTransferRejection() = achTransferRejection

        /**
         * An ACH Transfer Return object. This field will be present in the JSON response if and
         * only if `category` is equal to `ach_transfer_return`.
         */
        @JsonProperty("ach_transfer_return")
        @ExcludeMissing
        fun _achTransferReturn() = achTransferReturn

        /**
         * A Card Dispute Acceptance object. This field will be present in the JSON response if and
         * only if `category` is equal to `card_dispute_acceptance`.
         */
        @JsonProperty("card_dispute_acceptance")
        @ExcludeMissing
        fun _cardDisputeAcceptance() = cardDisputeAcceptance

        /**
         * A Card Dispute Loss object. This field will be present in the JSON response if and only
         * if `category` is equal to `card_dispute_loss`.
         */
        @JsonProperty("card_dispute_loss") @ExcludeMissing fun _cardDisputeLoss() = cardDisputeLoss

        /**
         * A Card Refund object. This field will be present in the JSON response if and only if
         * `category` is equal to `card_refund`.
         */
        @JsonProperty("card_refund") @ExcludeMissing fun _cardRefund() = cardRefund

        /**
         * A Card Revenue Payment object. This field will be present in the JSON response if and
         * only if `category` is equal to `card_revenue_payment`.
         */
        @JsonProperty("card_revenue_payment")
        @ExcludeMissing
        fun _cardRevenuePayment() = cardRevenuePayment

        /**
         * A Card Settlement object. This field will be present in the JSON response if and only if
         * `category` is equal to `card_settlement`.
         */
        @JsonProperty("card_settlement") @ExcludeMissing fun _cardSettlement() = cardSettlement

        /**
         * A Cashback Payment object. This field will be present in the JSON response if and only if
         * `category` is equal to `cashback_payment`.
         */
        @JsonProperty("cashback_payment") @ExcludeMissing fun _cashbackPayment() = cashbackPayment

        /**
         * The type of the resource. We may add additional possible values for this enum over time;
         * your application should be able to handle such additions gracefully.
         */
        @JsonProperty("category") @ExcludeMissing fun _category() = category

        /**
         * A Check Deposit Acceptance object. This field will be present in the JSON response if and
         * only if `category` is equal to `check_deposit_acceptance`.
         */
        @JsonProperty("check_deposit_acceptance")
        @ExcludeMissing
        fun _checkDepositAcceptance() = checkDepositAcceptance

        /**
         * A Check Deposit Return object. This field will be present in the JSON response if and
         * only if `category` is equal to `check_deposit_return`.
         */
        @JsonProperty("check_deposit_return")
        @ExcludeMissing
        fun _checkDepositReturn() = checkDepositReturn

        /**
         * A Check Transfer Deposit object. This field will be present in the JSON response if and
         * only if `category` is equal to `check_transfer_deposit`.
         */
        @JsonProperty("check_transfer_deposit")
        @ExcludeMissing
        fun _checkTransferDeposit() = checkTransferDeposit

        /**
         * A Fee Payment object. This field will be present in the JSON response if and only if
         * `category` is equal to `fee_payment`.
         */
        @JsonProperty("fee_payment") @ExcludeMissing fun _feePayment() = feePayment

        /**
         * An Inbound ACH Transfer Intention object. This field will be present in the JSON response
         * if and only if `category` is equal to `inbound_ach_transfer`.
         */
        @JsonProperty("inbound_ach_transfer")
        @ExcludeMissing
        fun _inboundAchTransfer() = inboundAchTransfer

        /**
         * An Inbound Real-Time Payments Transfer Confirmation object. This field will be present in
         * the JSON response if and only if `category` is equal to
         * `inbound_real_time_payments_transfer_confirmation`.
         */
        @JsonProperty("inbound_real_time_payments_transfer_confirmation")
        @ExcludeMissing
        fun _inboundRealTimePaymentsTransferConfirmation() =
            inboundRealTimePaymentsTransferConfirmation

        /**
         * An Inbound Real-Time Payments Transfer Decline object. This field will be present in the
         * JSON response if and only if `category` is equal to
         * `inbound_real_time_payments_transfer_decline`.
         */
        @JsonProperty("inbound_real_time_payments_transfer_decline")
        @ExcludeMissing
        fun _inboundRealTimePaymentsTransferDecline() = inboundRealTimePaymentsTransferDecline

        /**
         * An Inbound Wire Reversal object. This field will be present in the JSON response if and
         * only if `category` is equal to `inbound_wire_reversal`.
         */
        @JsonProperty("inbound_wire_reversal")
        @ExcludeMissing
        fun _inboundWireReversal() = inboundWireReversal

        /**
         * An Inbound Wire Transfer Intention object. This field will be present in the JSON
         * response if and only if `category` is equal to `inbound_wire_transfer`.
         */
        @JsonProperty("inbound_wire_transfer")
        @ExcludeMissing
        fun _inboundWireTransfer() = inboundWireTransfer

        /**
         * An Interest Payment object. This field will be present in the JSON response if and only
         * if `category` is equal to `interest_payment`.
         */
        @JsonProperty("interest_payment") @ExcludeMissing fun _interestPayment() = interestPayment

        /**
         * An Internal Source object. This field will be present in the JSON response if and only if
         * `category` is equal to `internal_source`.
         */
        @JsonProperty("internal_source") @ExcludeMissing fun _internalSource() = internalSource

        /**
         * If the category of this Transaction source is equal to `other`, this field will contain
         * an empty object, otherwise it will contain null.
         */
        @JsonProperty("other") @ExcludeMissing fun _other() = other

        /**
         * A Real-Time Payments Transfer Acknowledgement object. This field will be present in the
         * JSON response if and only if `category` is equal to
         * `real_time_payments_transfer_acknowledgement`.
         */
        @JsonProperty("real_time_payments_transfer_acknowledgement")
        @ExcludeMissing
        fun _realTimePaymentsTransferAcknowledgement() = realTimePaymentsTransferAcknowledgement

        /**
         * A Sample Funds object. This field will be present in the JSON response if and only if
         * `category` is equal to `sample_funds`.
         */
        @JsonProperty("sample_funds") @ExcludeMissing fun _sampleFunds() = sampleFunds

        /**
         * A Wire Transfer Intention object. This field will be present in the JSON response if and
         * only if `category` is equal to `wire_transfer_intention`.
         */
        @JsonProperty("wire_transfer_intention")
        @ExcludeMissing
        fun _wireTransferIntention() = wireTransferIntention

        /**
         * A Wire Transfer Rejection object. This field will be present in the JSON response if and
         * only if `category` is equal to `wire_transfer_rejection`.
         */
        @JsonProperty("wire_transfer_rejection")
        @ExcludeMissing
        fun _wireTransferRejection() = wireTransferRejection

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Source = apply {
            if (!validated) {
                accountTransferIntention().map { it.validate() }
                achTransferIntention().map { it.validate() }
                achTransferRejection().map { it.validate() }
                achTransferReturn().map { it.validate() }
                cardDisputeAcceptance().map { it.validate() }
                cardDisputeLoss().map { it.validate() }
                cardRefund().map { it.validate() }
                cardRevenuePayment().map { it.validate() }
                cardSettlement().map { it.validate() }
                cashbackPayment().map { it.validate() }
                category()
                checkDepositAcceptance().map { it.validate() }
                checkDepositReturn().map { it.validate() }
                checkTransferDeposit().map { it.validate() }
                feePayment().map { it.validate() }
                inboundAchTransfer().map { it.validate() }
                inboundRealTimePaymentsTransferConfirmation().map { it.validate() }
                inboundRealTimePaymentsTransferDecline().map { it.validate() }
                inboundWireReversal().map { it.validate() }
                inboundWireTransfer().map { it.validate() }
                interestPayment().map { it.validate() }
                internalSource().map { it.validate() }
                realTimePaymentsTransferAcknowledgement().map { it.validate() }
                sampleFunds().map { it.validate() }
                wireTransferIntention().map { it.validate() }
                wireTransferRejection().map { it.validate() }
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Source &&
                this.accountTransferIntention == other.accountTransferIntention &&
                this.achTransferIntention == other.achTransferIntention &&
                this.achTransferRejection == other.achTransferRejection &&
                this.achTransferReturn == other.achTransferReturn &&
                this.cardDisputeAcceptance == other.cardDisputeAcceptance &&
                this.cardDisputeLoss == other.cardDisputeLoss &&
                this.cardRefund == other.cardRefund &&
                this.cardRevenuePayment == other.cardRevenuePayment &&
                this.cardSettlement == other.cardSettlement &&
                this.cashbackPayment == other.cashbackPayment &&
                this.category == other.category &&
                this.checkDepositAcceptance == other.checkDepositAcceptance &&
                this.checkDepositReturn == other.checkDepositReturn &&
                this.checkTransferDeposit == other.checkTransferDeposit &&
                this.feePayment == other.feePayment &&
                this.inboundAchTransfer == other.inboundAchTransfer &&
                this.inboundRealTimePaymentsTransferConfirmation ==
                    other.inboundRealTimePaymentsTransferConfirmation &&
                this.inboundRealTimePaymentsTransferDecline ==
                    other.inboundRealTimePaymentsTransferDecline &&
                this.inboundWireReversal == other.inboundWireReversal &&
                this.inboundWireTransfer == other.inboundWireTransfer &&
                this.interestPayment == other.interestPayment &&
                this.internalSource == other.internalSource &&
                this.other == other.other &&
                this.realTimePaymentsTransferAcknowledgement ==
                    other.realTimePaymentsTransferAcknowledgement &&
                this.sampleFunds == other.sampleFunds &&
                this.wireTransferIntention == other.wireTransferIntention &&
                this.wireTransferRejection == other.wireTransferRejection &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        accountTransferIntention,
                        achTransferIntention,
                        achTransferRejection,
                        achTransferReturn,
                        cardDisputeAcceptance,
                        cardDisputeLoss,
                        cardRefund,
                        cardRevenuePayment,
                        cardSettlement,
                        cashbackPayment,
                        category,
                        checkDepositAcceptance,
                        checkDepositReturn,
                        checkTransferDeposit,
                        feePayment,
                        inboundAchTransfer,
                        inboundRealTimePaymentsTransferConfirmation,
                        inboundRealTimePaymentsTransferDecline,
                        inboundWireReversal,
                        inboundWireTransfer,
                        interestPayment,
                        internalSource,
                        other,
                        realTimePaymentsTransferAcknowledgement,
                        sampleFunds,
                        wireTransferIntention,
                        wireTransferRejection,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Source{accountTransferIntention=$accountTransferIntention, achTransferIntention=$achTransferIntention, achTransferRejection=$achTransferRejection, achTransferReturn=$achTransferReturn, cardDisputeAcceptance=$cardDisputeAcceptance, cardDisputeLoss=$cardDisputeLoss, cardRefund=$cardRefund, cardRevenuePayment=$cardRevenuePayment, cardSettlement=$cardSettlement, cashbackPayment=$cashbackPayment, category=$category, checkDepositAcceptance=$checkDepositAcceptance, checkDepositReturn=$checkDepositReturn, checkTransferDeposit=$checkTransferDeposit, feePayment=$feePayment, inboundAchTransfer=$inboundAchTransfer, inboundRealTimePaymentsTransferConfirmation=$inboundRealTimePaymentsTransferConfirmation, inboundRealTimePaymentsTransferDecline=$inboundRealTimePaymentsTransferDecline, inboundWireReversal=$inboundWireReversal, inboundWireTransfer=$inboundWireTransfer, interestPayment=$interestPayment, internalSource=$internalSource, other=$other, realTimePaymentsTransferAcknowledgement=$realTimePaymentsTransferAcknowledgement, sampleFunds=$sampleFunds, wireTransferIntention=$wireTransferIntention, wireTransferRejection=$wireTransferRejection, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var accountTransferIntention: JsonField<AccountTransferIntention> =
                JsonMissing.of()
            private var achTransferIntention: JsonField<AchTransferIntention> = JsonMissing.of()
            private var achTransferRejection: JsonField<AchTransferRejection> = JsonMissing.of()
            private var achTransferReturn: JsonField<AchTransferReturn> = JsonMissing.of()
            private var cardDisputeAcceptance: JsonField<CardDisputeAcceptance> = JsonMissing.of()
            private var cardDisputeLoss: JsonField<CardDisputeLoss> = JsonMissing.of()
            private var cardRefund: JsonField<CardRefund> = JsonMissing.of()
            private var cardRevenuePayment: JsonField<CardRevenuePayment> = JsonMissing.of()
            private var cardSettlement: JsonField<CardSettlement> = JsonMissing.of()
            private var cashbackPayment: JsonField<CashbackPayment> = JsonMissing.of()
            private var category: JsonField<Category> = JsonMissing.of()
            private var checkDepositAcceptance: JsonField<CheckDepositAcceptance> = JsonMissing.of()
            private var checkDepositReturn: JsonField<CheckDepositReturn> = JsonMissing.of()
            private var checkTransferDeposit: JsonField<CheckTransferDeposit> = JsonMissing.of()
            private var feePayment: JsonField<FeePayment> = JsonMissing.of()
            private var inboundAchTransfer: JsonField<InboundAchTransfer> = JsonMissing.of()
            private var inboundRealTimePaymentsTransferConfirmation:
                JsonField<InboundRealTimePaymentsTransferConfirmation> =
                JsonMissing.of()
            private var inboundRealTimePaymentsTransferDecline:
                JsonField<InboundRealTimePaymentsTransferDecline> =
                JsonMissing.of()
            private var inboundWireReversal: JsonField<InboundWireReversal> = JsonMissing.of()
            private var inboundWireTransfer: JsonField<InboundWireTransfer> = JsonMissing.of()
            private var interestPayment: JsonField<InterestPayment> = JsonMissing.of()
            private var internalSource: JsonField<InternalSource> = JsonMissing.of()
            private var other: JsonValue = JsonMissing.of()
            private var realTimePaymentsTransferAcknowledgement:
                JsonField<RealTimePaymentsTransferAcknowledgement> =
                JsonMissing.of()
            private var sampleFunds: JsonField<SampleFunds> = JsonMissing.of()
            private var wireTransferIntention: JsonField<WireTransferIntention> = JsonMissing.of()
            private var wireTransferRejection: JsonField<WireTransferRejection> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(source: Source) = apply {
                this.accountTransferIntention = source.accountTransferIntention
                this.achTransferIntention = source.achTransferIntention
                this.achTransferRejection = source.achTransferRejection
                this.achTransferReturn = source.achTransferReturn
                this.cardDisputeAcceptance = source.cardDisputeAcceptance
                this.cardDisputeLoss = source.cardDisputeLoss
                this.cardRefund = source.cardRefund
                this.cardRevenuePayment = source.cardRevenuePayment
                this.cardSettlement = source.cardSettlement
                this.cashbackPayment = source.cashbackPayment
                this.category = source.category
                this.checkDepositAcceptance = source.checkDepositAcceptance
                this.checkDepositReturn = source.checkDepositReturn
                this.checkTransferDeposit = source.checkTransferDeposit
                this.feePayment = source.feePayment
                this.inboundAchTransfer = source.inboundAchTransfer
                this.inboundRealTimePaymentsTransferConfirmation =
                    source.inboundRealTimePaymentsTransferConfirmation
                this.inboundRealTimePaymentsTransferDecline =
                    source.inboundRealTimePaymentsTransferDecline
                this.inboundWireReversal = source.inboundWireReversal
                this.inboundWireTransfer = source.inboundWireTransfer
                this.interestPayment = source.interestPayment
                this.internalSource = source.internalSource
                this.other = source.other
                this.realTimePaymentsTransferAcknowledgement =
                    source.realTimePaymentsTransferAcknowledgement
                this.sampleFunds = source.sampleFunds
                this.wireTransferIntention = source.wireTransferIntention
                this.wireTransferRejection = source.wireTransferRejection
                additionalProperties(source.additionalProperties)
            }

            /**
             * An Account Transfer Intention object. This field will be present in the JSON response
             * if and only if `category` is equal to `account_transfer_intention`.
             */
            fun accountTransferIntention(accountTransferIntention: AccountTransferIntention) =
                accountTransferIntention(JsonField.of(accountTransferIntention))

            /**
             * An Account Transfer Intention object. This field will be present in the JSON response
             * if and only if `category` is equal to `account_transfer_intention`.
             */
            @JsonProperty("account_transfer_intention")
            @ExcludeMissing
            fun accountTransferIntention(
                accountTransferIntention: JsonField<AccountTransferIntention>
            ) = apply { this.accountTransferIntention = accountTransferIntention }

            /**
             * An ACH Transfer Intention object. This field will be present in the JSON response if
             * and only if `category` is equal to `ach_transfer_intention`.
             */
            fun achTransferIntention(achTransferIntention: AchTransferIntention) =
                achTransferIntention(JsonField.of(achTransferIntention))

            /**
             * An ACH Transfer Intention object. This field will be present in the JSON response if
             * and only if `category` is equal to `ach_transfer_intention`.
             */
            @JsonProperty("ach_transfer_intention")
            @ExcludeMissing
            fun achTransferIntention(achTransferIntention: JsonField<AchTransferIntention>) =
                apply {
                    this.achTransferIntention = achTransferIntention
                }

            /**
             * An ACH Transfer Rejection object. This field will be present in the JSON response if
             * and only if `category` is equal to `ach_transfer_rejection`.
             */
            fun achTransferRejection(achTransferRejection: AchTransferRejection) =
                achTransferRejection(JsonField.of(achTransferRejection))

            /**
             * An ACH Transfer Rejection object. This field will be present in the JSON response if
             * and only if `category` is equal to `ach_transfer_rejection`.
             */
            @JsonProperty("ach_transfer_rejection")
            @ExcludeMissing
            fun achTransferRejection(achTransferRejection: JsonField<AchTransferRejection>) =
                apply {
                    this.achTransferRejection = achTransferRejection
                }

            /**
             * An ACH Transfer Return object. This field will be present in the JSON response if and
             * only if `category` is equal to `ach_transfer_return`.
             */
            fun achTransferReturn(achTransferReturn: AchTransferReturn) =
                achTransferReturn(JsonField.of(achTransferReturn))

            /**
             * An ACH Transfer Return object. This field will be present in the JSON response if and
             * only if `category` is equal to `ach_transfer_return`.
             */
            @JsonProperty("ach_transfer_return")
            @ExcludeMissing
            fun achTransferReturn(achTransferReturn: JsonField<AchTransferReturn>) = apply {
                this.achTransferReturn = achTransferReturn
            }

            /**
             * A Card Dispute Acceptance object. This field will be present in the JSON response if
             * and only if `category` is equal to `card_dispute_acceptance`.
             */
            fun cardDisputeAcceptance(cardDisputeAcceptance: CardDisputeAcceptance) =
                cardDisputeAcceptance(JsonField.of(cardDisputeAcceptance))

            /**
             * A Card Dispute Acceptance object. This field will be present in the JSON response if
             * and only if `category` is equal to `card_dispute_acceptance`.
             */
            @JsonProperty("card_dispute_acceptance")
            @ExcludeMissing
            fun cardDisputeAcceptance(cardDisputeAcceptance: JsonField<CardDisputeAcceptance>) =
                apply {
                    this.cardDisputeAcceptance = cardDisputeAcceptance
                }

            /**
             * A Card Dispute Loss object. This field will be present in the JSON response if and
             * only if `category` is equal to `card_dispute_loss`.
             */
            fun cardDisputeLoss(cardDisputeLoss: CardDisputeLoss) =
                cardDisputeLoss(JsonField.of(cardDisputeLoss))

            /**
             * A Card Dispute Loss object. This field will be present in the JSON response if and
             * only if `category` is equal to `card_dispute_loss`.
             */
            @JsonProperty("card_dispute_loss")
            @ExcludeMissing
            fun cardDisputeLoss(cardDisputeLoss: JsonField<CardDisputeLoss>) = apply {
                this.cardDisputeLoss = cardDisputeLoss
            }

            /**
             * A Card Refund object. This field will be present in the JSON response if and only if
             * `category` is equal to `card_refund`.
             */
            fun cardRefund(cardRefund: CardRefund) = cardRefund(JsonField.of(cardRefund))

            /**
             * A Card Refund object. This field will be present in the JSON response if and only if
             * `category` is equal to `card_refund`.
             */
            @JsonProperty("card_refund")
            @ExcludeMissing
            fun cardRefund(cardRefund: JsonField<CardRefund>) = apply {
                this.cardRefund = cardRefund
            }

            /**
             * A Card Revenue Payment object. This field will be present in the JSON response if and
             * only if `category` is equal to `card_revenue_payment`.
             */
            fun cardRevenuePayment(cardRevenuePayment: CardRevenuePayment) =
                cardRevenuePayment(JsonField.of(cardRevenuePayment))

            /**
             * A Card Revenue Payment object. This field will be present in the JSON response if and
             * only if `category` is equal to `card_revenue_payment`.
             */
            @JsonProperty("card_revenue_payment")
            @ExcludeMissing
            fun cardRevenuePayment(cardRevenuePayment: JsonField<CardRevenuePayment>) = apply {
                this.cardRevenuePayment = cardRevenuePayment
            }

            /**
             * A Card Settlement object. This field will be present in the JSON response if and only
             * if `category` is equal to `card_settlement`.
             */
            fun cardSettlement(cardSettlement: CardSettlement) =
                cardSettlement(JsonField.of(cardSettlement))

            /**
             * A Card Settlement object. This field will be present in the JSON response if and only
             * if `category` is equal to `card_settlement`.
             */
            @JsonProperty("card_settlement")
            @ExcludeMissing
            fun cardSettlement(cardSettlement: JsonField<CardSettlement>) = apply {
                this.cardSettlement = cardSettlement
            }

            /**
             * A Cashback Payment object. This field will be present in the JSON response if and
             * only if `category` is equal to `cashback_payment`.
             */
            fun cashbackPayment(cashbackPayment: CashbackPayment) =
                cashbackPayment(JsonField.of(cashbackPayment))

            /**
             * A Cashback Payment object. This field will be present in the JSON response if and
             * only if `category` is equal to `cashback_payment`.
             */
            @JsonProperty("cashback_payment")
            @ExcludeMissing
            fun cashbackPayment(cashbackPayment: JsonField<CashbackPayment>) = apply {
                this.cashbackPayment = cashbackPayment
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
             * A Check Deposit Acceptance object. This field will be present in the JSON response if
             * and only if `category` is equal to `check_deposit_acceptance`.
             */
            fun checkDepositAcceptance(checkDepositAcceptance: CheckDepositAcceptance) =
                checkDepositAcceptance(JsonField.of(checkDepositAcceptance))

            /**
             * A Check Deposit Acceptance object. This field will be present in the JSON response if
             * and only if `category` is equal to `check_deposit_acceptance`.
             */
            @JsonProperty("check_deposit_acceptance")
            @ExcludeMissing
            fun checkDepositAcceptance(checkDepositAcceptance: JsonField<CheckDepositAcceptance>) =
                apply {
                    this.checkDepositAcceptance = checkDepositAcceptance
                }

            /**
             * A Check Deposit Return object. This field will be present in the JSON response if and
             * only if `category` is equal to `check_deposit_return`.
             */
            fun checkDepositReturn(checkDepositReturn: CheckDepositReturn) =
                checkDepositReturn(JsonField.of(checkDepositReturn))

            /**
             * A Check Deposit Return object. This field will be present in the JSON response if and
             * only if `category` is equal to `check_deposit_return`.
             */
            @JsonProperty("check_deposit_return")
            @ExcludeMissing
            fun checkDepositReturn(checkDepositReturn: JsonField<CheckDepositReturn>) = apply {
                this.checkDepositReturn = checkDepositReturn
            }

            /**
             * A Check Transfer Deposit object. This field will be present in the JSON response if
             * and only if `category` is equal to `check_transfer_deposit`.
             */
            fun checkTransferDeposit(checkTransferDeposit: CheckTransferDeposit) =
                checkTransferDeposit(JsonField.of(checkTransferDeposit))

            /**
             * A Check Transfer Deposit object. This field will be present in the JSON response if
             * and only if `category` is equal to `check_transfer_deposit`.
             */
            @JsonProperty("check_transfer_deposit")
            @ExcludeMissing
            fun checkTransferDeposit(checkTransferDeposit: JsonField<CheckTransferDeposit>) =
                apply {
                    this.checkTransferDeposit = checkTransferDeposit
                }

            /**
             * A Fee Payment object. This field will be present in the JSON response if and only if
             * `category` is equal to `fee_payment`.
             */
            fun feePayment(feePayment: FeePayment) = feePayment(JsonField.of(feePayment))

            /**
             * A Fee Payment object. This field will be present in the JSON response if and only if
             * `category` is equal to `fee_payment`.
             */
            @JsonProperty("fee_payment")
            @ExcludeMissing
            fun feePayment(feePayment: JsonField<FeePayment>) = apply {
                this.feePayment = feePayment
            }

            /**
             * An Inbound ACH Transfer Intention object. This field will be present in the JSON
             * response if and only if `category` is equal to `inbound_ach_transfer`.
             */
            fun inboundAchTransfer(inboundAchTransfer: InboundAchTransfer) =
                inboundAchTransfer(JsonField.of(inboundAchTransfer))

            /**
             * An Inbound ACH Transfer Intention object. This field will be present in the JSON
             * response if and only if `category` is equal to `inbound_ach_transfer`.
             */
            @JsonProperty("inbound_ach_transfer")
            @ExcludeMissing
            fun inboundAchTransfer(inboundAchTransfer: JsonField<InboundAchTransfer>) = apply {
                this.inboundAchTransfer = inboundAchTransfer
            }

            /**
             * An Inbound Real-Time Payments Transfer Confirmation object. This field will be
             * present in the JSON response if and only if `category` is equal to
             * `inbound_real_time_payments_transfer_confirmation`.
             */
            fun inboundRealTimePaymentsTransferConfirmation(
                inboundRealTimePaymentsTransferConfirmation:
                    InboundRealTimePaymentsTransferConfirmation
            ) =
                inboundRealTimePaymentsTransferConfirmation(
                    JsonField.of(inboundRealTimePaymentsTransferConfirmation)
                )

            /**
             * An Inbound Real-Time Payments Transfer Confirmation object. This field will be
             * present in the JSON response if and only if `category` is equal to
             * `inbound_real_time_payments_transfer_confirmation`.
             */
            @JsonProperty("inbound_real_time_payments_transfer_confirmation")
            @ExcludeMissing
            fun inboundRealTimePaymentsTransferConfirmation(
                inboundRealTimePaymentsTransferConfirmation:
                    JsonField<InboundRealTimePaymentsTransferConfirmation>
            ) = apply {
                this.inboundRealTimePaymentsTransferConfirmation =
                    inboundRealTimePaymentsTransferConfirmation
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
             * An Inbound Wire Reversal object. This field will be present in the JSON response if
             * and only if `category` is equal to `inbound_wire_reversal`.
             */
            fun inboundWireReversal(inboundWireReversal: InboundWireReversal) =
                inboundWireReversal(JsonField.of(inboundWireReversal))

            /**
             * An Inbound Wire Reversal object. This field will be present in the JSON response if
             * and only if `category` is equal to `inbound_wire_reversal`.
             */
            @JsonProperty("inbound_wire_reversal")
            @ExcludeMissing
            fun inboundWireReversal(inboundWireReversal: JsonField<InboundWireReversal>) = apply {
                this.inboundWireReversal = inboundWireReversal
            }

            /**
             * An Inbound Wire Transfer Intention object. This field will be present in the JSON
             * response if and only if `category` is equal to `inbound_wire_transfer`.
             */
            fun inboundWireTransfer(inboundWireTransfer: InboundWireTransfer) =
                inboundWireTransfer(JsonField.of(inboundWireTransfer))

            /**
             * An Inbound Wire Transfer Intention object. This field will be present in the JSON
             * response if and only if `category` is equal to `inbound_wire_transfer`.
             */
            @JsonProperty("inbound_wire_transfer")
            @ExcludeMissing
            fun inboundWireTransfer(inboundWireTransfer: JsonField<InboundWireTransfer>) = apply {
                this.inboundWireTransfer = inboundWireTransfer
            }

            /**
             * An Interest Payment object. This field will be present in the JSON response if and
             * only if `category` is equal to `interest_payment`.
             */
            fun interestPayment(interestPayment: InterestPayment) =
                interestPayment(JsonField.of(interestPayment))

            /**
             * An Interest Payment object. This field will be present in the JSON response if and
             * only if `category` is equal to `interest_payment`.
             */
            @JsonProperty("interest_payment")
            @ExcludeMissing
            fun interestPayment(interestPayment: JsonField<InterestPayment>) = apply {
                this.interestPayment = interestPayment
            }

            /**
             * An Internal Source object. This field will be present in the JSON response if and
             * only if `category` is equal to `internal_source`.
             */
            fun internalSource(internalSource: InternalSource) =
                internalSource(JsonField.of(internalSource))

            /**
             * An Internal Source object. This field will be present in the JSON response if and
             * only if `category` is equal to `internal_source`.
             */
            @JsonProperty("internal_source")
            @ExcludeMissing
            fun internalSource(internalSource: JsonField<InternalSource>) = apply {
                this.internalSource = internalSource
            }

            /**
             * If the category of this Transaction source is equal to `other`, this field will
             * contain an empty object, otherwise it will contain null.
             */
            @JsonProperty("other")
            @ExcludeMissing
            fun other(other: JsonValue) = apply { this.other = other }

            /**
             * A Real-Time Payments Transfer Acknowledgement object. This field will be present in
             * the JSON response if and only if `category` is equal to
             * `real_time_payments_transfer_acknowledgement`.
             */
            fun realTimePaymentsTransferAcknowledgement(
                realTimePaymentsTransferAcknowledgement: RealTimePaymentsTransferAcknowledgement
            ) =
                realTimePaymentsTransferAcknowledgement(
                    JsonField.of(realTimePaymentsTransferAcknowledgement)
                )

            /**
             * A Real-Time Payments Transfer Acknowledgement object. This field will be present in
             * the JSON response if and only if `category` is equal to
             * `real_time_payments_transfer_acknowledgement`.
             */
            @JsonProperty("real_time_payments_transfer_acknowledgement")
            @ExcludeMissing
            fun realTimePaymentsTransferAcknowledgement(
                realTimePaymentsTransferAcknowledgement:
                    JsonField<RealTimePaymentsTransferAcknowledgement>
            ) = apply {
                this.realTimePaymentsTransferAcknowledgement =
                    realTimePaymentsTransferAcknowledgement
            }

            /**
             * A Sample Funds object. This field will be present in the JSON response if and only if
             * `category` is equal to `sample_funds`.
             */
            fun sampleFunds(sampleFunds: SampleFunds) = sampleFunds(JsonField.of(sampleFunds))

            /**
             * A Sample Funds object. This field will be present in the JSON response if and only if
             * `category` is equal to `sample_funds`.
             */
            @JsonProperty("sample_funds")
            @ExcludeMissing
            fun sampleFunds(sampleFunds: JsonField<SampleFunds>) = apply {
                this.sampleFunds = sampleFunds
            }

            /**
             * A Wire Transfer Intention object. This field will be present in the JSON response if
             * and only if `category` is equal to `wire_transfer_intention`.
             */
            fun wireTransferIntention(wireTransferIntention: WireTransferIntention) =
                wireTransferIntention(JsonField.of(wireTransferIntention))

            /**
             * A Wire Transfer Intention object. This field will be present in the JSON response if
             * and only if `category` is equal to `wire_transfer_intention`.
             */
            @JsonProperty("wire_transfer_intention")
            @ExcludeMissing
            fun wireTransferIntention(wireTransferIntention: JsonField<WireTransferIntention>) =
                apply {
                    this.wireTransferIntention = wireTransferIntention
                }

            /**
             * A Wire Transfer Rejection object. This field will be present in the JSON response if
             * and only if `category` is equal to `wire_transfer_rejection`.
             */
            fun wireTransferRejection(wireTransferRejection: WireTransferRejection) =
                wireTransferRejection(JsonField.of(wireTransferRejection))

            /**
             * A Wire Transfer Rejection object. This field will be present in the JSON response if
             * and only if `category` is equal to `wire_transfer_rejection`.
             */
            @JsonProperty("wire_transfer_rejection")
            @ExcludeMissing
            fun wireTransferRejection(wireTransferRejection: JsonField<WireTransferRejection>) =
                apply {
                    this.wireTransferRejection = wireTransferRejection
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
                    accountTransferIntention,
                    achTransferIntention,
                    achTransferRejection,
                    achTransferReturn,
                    cardDisputeAcceptance,
                    cardDisputeLoss,
                    cardRefund,
                    cardRevenuePayment,
                    cardSettlement,
                    cashbackPayment,
                    category,
                    checkDepositAcceptance,
                    checkDepositReturn,
                    checkTransferDeposit,
                    feePayment,
                    inboundAchTransfer,
                    inboundRealTimePaymentsTransferConfirmation,
                    inboundRealTimePaymentsTransferDecline,
                    inboundWireReversal,
                    inboundWireTransfer,
                    interestPayment,
                    internalSource,
                    other,
                    realTimePaymentsTransferAcknowledgement,
                    sampleFunds,
                    wireTransferIntention,
                    wireTransferRejection,
                    additionalProperties.toUnmodifiable(),
                )
        }

        /**
         * An Account Transfer Intention object. This field will be present in the JSON response if
         * and only if `category` is equal to `account_transfer_intention`.
         */
        @JsonDeserialize(builder = AccountTransferIntention.Builder::class)
        @NoAutoDetect
        class AccountTransferIntention
        private constructor(
            private val amount: JsonField<Long>,
            private val currency: JsonField<Currency>,
            private val description: JsonField<String>,
            private val destinationAccountId: JsonField<String>,
            private val sourceAccountId: JsonField<String>,
            private val transferId: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

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

            /** The description you chose to give the transfer. */
            fun description(): String = description.getRequired("description")

            /** The identifier of the Account to where the Account Transfer was sent. */
            fun destinationAccountId(): String =
                destinationAccountId.getRequired("destination_account_id")

            /** The identifier of the Account from where the Account Transfer was sent. */
            fun sourceAccountId(): String = sourceAccountId.getRequired("source_account_id")

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

            /** The description you chose to give the transfer. */
            @JsonProperty("description") @ExcludeMissing fun _description() = description

            /** The identifier of the Account to where the Account Transfer was sent. */
            @JsonProperty("destination_account_id")
            @ExcludeMissing
            fun _destinationAccountId() = destinationAccountId

            /** The identifier of the Account from where the Account Transfer was sent. */
            @JsonProperty("source_account_id")
            @ExcludeMissing
            fun _sourceAccountId() = sourceAccountId

            /** The identifier of the Account Transfer that led to this Pending Transaction. */
            @JsonProperty("transfer_id") @ExcludeMissing fun _transferId() = transferId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): AccountTransferIntention = apply {
                if (!validated) {
                    amount()
                    currency()
                    description()
                    destinationAccountId()
                    sourceAccountId()
                    transferId()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is AccountTransferIntention &&
                    this.amount == other.amount &&
                    this.currency == other.currency &&
                    this.description == other.description &&
                    this.destinationAccountId == other.destinationAccountId &&
                    this.sourceAccountId == other.sourceAccountId &&
                    this.transferId == other.transferId &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            amount,
                            currency,
                            description,
                            destinationAccountId,
                            sourceAccountId,
                            transferId,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "AccountTransferIntention{amount=$amount, currency=$currency, description=$description, destinationAccountId=$destinationAccountId, sourceAccountId=$sourceAccountId, transferId=$transferId, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var amount: JsonField<Long> = JsonMissing.of()
                private var currency: JsonField<Currency> = JsonMissing.of()
                private var description: JsonField<String> = JsonMissing.of()
                private var destinationAccountId: JsonField<String> = JsonMissing.of()
                private var sourceAccountId: JsonField<String> = JsonMissing.of()
                private var transferId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(accountTransferIntention: AccountTransferIntention) = apply {
                    this.amount = accountTransferIntention.amount
                    this.currency = accountTransferIntention.currency
                    this.description = accountTransferIntention.description
                    this.destinationAccountId = accountTransferIntention.destinationAccountId
                    this.sourceAccountId = accountTransferIntention.sourceAccountId
                    this.transferId = accountTransferIntention.transferId
                    additionalProperties(accountTransferIntention.additionalProperties)
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

                /** The description you chose to give the transfer. */
                fun description(description: String) = description(JsonField.of(description))

                /** The description you chose to give the transfer. */
                @JsonProperty("description")
                @ExcludeMissing
                fun description(description: JsonField<String>) = apply {
                    this.description = description
                }

                /** The identifier of the Account to where the Account Transfer was sent. */
                fun destinationAccountId(destinationAccountId: String) =
                    destinationAccountId(JsonField.of(destinationAccountId))

                /** The identifier of the Account to where the Account Transfer was sent. */
                @JsonProperty("destination_account_id")
                @ExcludeMissing
                fun destinationAccountId(destinationAccountId: JsonField<String>) = apply {
                    this.destinationAccountId = destinationAccountId
                }

                /** The identifier of the Account from where the Account Transfer was sent. */
                fun sourceAccountId(sourceAccountId: String) =
                    sourceAccountId(JsonField.of(sourceAccountId))

                /** The identifier of the Account from where the Account Transfer was sent. */
                @JsonProperty("source_account_id")
                @ExcludeMissing
                fun sourceAccountId(sourceAccountId: JsonField<String>) = apply {
                    this.sourceAccountId = sourceAccountId
                }

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

                fun build(): AccountTransferIntention =
                    AccountTransferIntention(
                        amount,
                        currency,
                        description,
                        destinationAccountId,
                        sourceAccountId,
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

                    return other is Currency && this.value == other.value
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
        }

        /**
         * An ACH Transfer Intention object. This field will be present in the JSON response if and
         * only if `category` is equal to `ach_transfer_intention`.
         */
        @JsonDeserialize(builder = AchTransferIntention.Builder::class)
        @NoAutoDetect
        class AchTransferIntention
        private constructor(
            private val accountNumber: JsonField<String>,
            private val amount: JsonField<Long>,
            private val routingNumber: JsonField<String>,
            private val statementDescriptor: JsonField<String>,
            private val transferId: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** The account number for the destination account. */
            fun accountNumber(): String = accountNumber.getRequired("account_number")

            /**
             * The amount in the minor unit of the transaction's currency. For dollars, for example,
             * this is cents.
             */
            fun amount(): Long = amount.getRequired("amount")

            /**
             * The American Bankers' Association (ABA) Routing Transit Number (RTN) for the
             * destination account.
             */
            fun routingNumber(): String = routingNumber.getRequired("routing_number")

            /** A description set when the ACH Transfer was created. */
            fun statementDescriptor(): String =
                statementDescriptor.getRequired("statement_descriptor")

            /** The identifier of the ACH Transfer that led to this Transaction. */
            fun transferId(): String = transferId.getRequired("transfer_id")

            /** The account number for the destination account. */
            @JsonProperty("account_number") @ExcludeMissing fun _accountNumber() = accountNumber

            /**
             * The amount in the minor unit of the transaction's currency. For dollars, for example,
             * this is cents.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            /**
             * The American Bankers' Association (ABA) Routing Transit Number (RTN) for the
             * destination account.
             */
            @JsonProperty("routing_number") @ExcludeMissing fun _routingNumber() = routingNumber

            /** A description set when the ACH Transfer was created. */
            @JsonProperty("statement_descriptor")
            @ExcludeMissing
            fun _statementDescriptor() = statementDescriptor

            /** The identifier of the ACH Transfer that led to this Transaction. */
            @JsonProperty("transfer_id") @ExcludeMissing fun _transferId() = transferId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): AchTransferIntention = apply {
                if (!validated) {
                    accountNumber()
                    amount()
                    routingNumber()
                    statementDescriptor()
                    transferId()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is AchTransferIntention &&
                    this.accountNumber == other.accountNumber &&
                    this.amount == other.amount &&
                    this.routingNumber == other.routingNumber &&
                    this.statementDescriptor == other.statementDescriptor &&
                    this.transferId == other.transferId &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            accountNumber,
                            amount,
                            routingNumber,
                            statementDescriptor,
                            transferId,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "AchTransferIntention{accountNumber=$accountNumber, amount=$amount, routingNumber=$routingNumber, statementDescriptor=$statementDescriptor, transferId=$transferId, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var accountNumber: JsonField<String> = JsonMissing.of()
                private var amount: JsonField<Long> = JsonMissing.of()
                private var routingNumber: JsonField<String> = JsonMissing.of()
                private var statementDescriptor: JsonField<String> = JsonMissing.of()
                private var transferId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(achTransferIntention: AchTransferIntention) = apply {
                    this.accountNumber = achTransferIntention.accountNumber
                    this.amount = achTransferIntention.amount
                    this.routingNumber = achTransferIntention.routingNumber
                    this.statementDescriptor = achTransferIntention.statementDescriptor
                    this.transferId = achTransferIntention.transferId
                    additionalProperties(achTransferIntention.additionalProperties)
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

                /**
                 * The amount in the minor unit of the transaction's currency. For dollars, for
                 * example, this is cents.
                 */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /**
                 * The amount in the minor unit of the transaction's currency. For dollars, for
                 * example, this is cents.
                 */
                @JsonProperty("amount")
                @ExcludeMissing
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

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

                /** A description set when the ACH Transfer was created. */
                fun statementDescriptor(statementDescriptor: String) =
                    statementDescriptor(JsonField.of(statementDescriptor))

                /** A description set when the ACH Transfer was created. */
                @JsonProperty("statement_descriptor")
                @ExcludeMissing
                fun statementDescriptor(statementDescriptor: JsonField<String>) = apply {
                    this.statementDescriptor = statementDescriptor
                }

                /** The identifier of the ACH Transfer that led to this Transaction. */
                fun transferId(transferId: String) = transferId(JsonField.of(transferId))

                /** The identifier of the ACH Transfer that led to this Transaction. */
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

                fun build(): AchTransferIntention =
                    AchTransferIntention(
                        accountNumber,
                        amount,
                        routingNumber,
                        statementDescriptor,
                        transferId,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        /**
         * An ACH Transfer Rejection object. This field will be present in the JSON response if and
         * only if `category` is equal to `ach_transfer_rejection`.
         */
        @JsonDeserialize(builder = AchTransferRejection.Builder::class)
        @NoAutoDetect
        class AchTransferRejection
        private constructor(
            private val transferId: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** The identifier of the ACH Transfer that led to this Transaction. */
            fun transferId(): String = transferId.getRequired("transfer_id")

            /** The identifier of the ACH Transfer that led to this Transaction. */
            @JsonProperty("transfer_id") @ExcludeMissing fun _transferId() = transferId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): AchTransferRejection = apply {
                if (!validated) {
                    transferId()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is AchTransferRejection &&
                    this.transferId == other.transferId &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = Objects.hash(transferId, additionalProperties)
                }
                return hashCode
            }

            override fun toString() =
                "AchTransferRejection{transferId=$transferId, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var transferId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(achTransferRejection: AchTransferRejection) = apply {
                    this.transferId = achTransferRejection.transferId
                    additionalProperties(achTransferRejection.additionalProperties)
                }

                /** The identifier of the ACH Transfer that led to this Transaction. */
                fun transferId(transferId: String) = transferId(JsonField.of(transferId))

                /** The identifier of the ACH Transfer that led to this Transaction. */
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

                fun build(): AchTransferRejection =
                    AchTransferRejection(transferId, additionalProperties.toUnmodifiable())
            }
        }

        /**
         * An ACH Transfer Return object. This field will be present in the JSON response if and
         * only if `category` is equal to `ach_transfer_return`.
         */
        @JsonDeserialize(builder = AchTransferReturn.Builder::class)
        @NoAutoDetect
        class AchTransferReturn
        private constructor(
            private val createdAt: JsonField<OffsetDateTime>,
            private val rawReturnReasonCode: JsonField<String>,
            private val returnReasonCode: JsonField<ReturnReasonCode>,
            private val traceNumber: JsonField<String>,
            private val transactionId: JsonField<String>,
            private val transferId: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * transfer was created.
             */
            fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

            /** The three character ACH return code, in the range R01 to R85. */
            fun rawReturnReasonCode(): String =
                rawReturnReasonCode.getRequired("raw_return_reason_code")

            /**
             * Why the ACH Transfer was returned. This reason code is sent by the receiving bank
             * back to Increase.
             */
            fun returnReasonCode(): ReturnReasonCode =
                returnReasonCode.getRequired("return_reason_code")

            /**
             * A 15 digit number that was generated by the bank that initiated the return. The trace
             * number of the return is different than that of the original transfer. ACH trace
             * numbers are not unique, but along with the amount and date this number can be used to
             * identify the ACH return at the bank that initiated it.
             */
            fun traceNumber(): String = traceNumber.getRequired("trace_number")

            /** The identifier of the Transaction associated with this return. */
            fun transactionId(): String = transactionId.getRequired("transaction_id")

            /** The identifier of the ACH Transfer associated with this return. */
            fun transferId(): String = transferId.getRequired("transfer_id")

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * transfer was created.
             */
            @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

            /** The three character ACH return code, in the range R01 to R85. */
            @JsonProperty("raw_return_reason_code")
            @ExcludeMissing
            fun _rawReturnReasonCode() = rawReturnReasonCode

            /**
             * Why the ACH Transfer was returned. This reason code is sent by the receiving bank
             * back to Increase.
             */
            @JsonProperty("return_reason_code")
            @ExcludeMissing
            fun _returnReasonCode() = returnReasonCode

            /**
             * A 15 digit number that was generated by the bank that initiated the return. The trace
             * number of the return is different than that of the original transfer. ACH trace
             * numbers are not unique, but along with the amount and date this number can be used to
             * identify the ACH return at the bank that initiated it.
             */
            @JsonProperty("trace_number") @ExcludeMissing fun _traceNumber() = traceNumber

            /** The identifier of the Transaction associated with this return. */
            @JsonProperty("transaction_id") @ExcludeMissing fun _transactionId() = transactionId

            /** The identifier of the ACH Transfer associated with this return. */
            @JsonProperty("transfer_id") @ExcludeMissing fun _transferId() = transferId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): AchTransferReturn = apply {
                if (!validated) {
                    createdAt()
                    rawReturnReasonCode()
                    returnReasonCode()
                    traceNumber()
                    transactionId()
                    transferId()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is AchTransferReturn &&
                    this.createdAt == other.createdAt &&
                    this.rawReturnReasonCode == other.rawReturnReasonCode &&
                    this.returnReasonCode == other.returnReasonCode &&
                    this.traceNumber == other.traceNumber &&
                    this.transactionId == other.transactionId &&
                    this.transferId == other.transferId &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            createdAt,
                            rawReturnReasonCode,
                            returnReasonCode,
                            traceNumber,
                            transactionId,
                            transferId,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "AchTransferReturn{createdAt=$createdAt, rawReturnReasonCode=$rawReturnReasonCode, returnReasonCode=$returnReasonCode, traceNumber=$traceNumber, transactionId=$transactionId, transferId=$transferId, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var rawReturnReasonCode: JsonField<String> = JsonMissing.of()
                private var returnReasonCode: JsonField<ReturnReasonCode> = JsonMissing.of()
                private var traceNumber: JsonField<String> = JsonMissing.of()
                private var transactionId: JsonField<String> = JsonMissing.of()
                private var transferId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(achTransferReturn: AchTransferReturn) = apply {
                    this.createdAt = achTransferReturn.createdAt
                    this.rawReturnReasonCode = achTransferReturn.rawReturnReasonCode
                    this.returnReasonCode = achTransferReturn.returnReasonCode
                    this.traceNumber = achTransferReturn.traceNumber
                    this.transactionId = achTransferReturn.transactionId
                    this.transferId = achTransferReturn.transferId
                    additionalProperties(achTransferReturn.additionalProperties)
                }

                /**
                 * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
                 * transfer was created.
                 */
                fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

                /**
                 * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
                 * transfer was created.
                 */
                @JsonProperty("created_at")
                @ExcludeMissing
                fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                    this.createdAt = createdAt
                }

                /** The three character ACH return code, in the range R01 to R85. */
                fun rawReturnReasonCode(rawReturnReasonCode: String) =
                    rawReturnReasonCode(JsonField.of(rawReturnReasonCode))

                /** The three character ACH return code, in the range R01 to R85. */
                @JsonProperty("raw_return_reason_code")
                @ExcludeMissing
                fun rawReturnReasonCode(rawReturnReasonCode: JsonField<String>) = apply {
                    this.rawReturnReasonCode = rawReturnReasonCode
                }

                /**
                 * Why the ACH Transfer was returned. This reason code is sent by the receiving bank
                 * back to Increase.
                 */
                fun returnReasonCode(returnReasonCode: ReturnReasonCode) =
                    returnReasonCode(JsonField.of(returnReasonCode))

                /**
                 * Why the ACH Transfer was returned. This reason code is sent by the receiving bank
                 * back to Increase.
                 */
                @JsonProperty("return_reason_code")
                @ExcludeMissing
                fun returnReasonCode(returnReasonCode: JsonField<ReturnReasonCode>) = apply {
                    this.returnReasonCode = returnReasonCode
                }

                /**
                 * A 15 digit number that was generated by the bank that initiated the return. The
                 * trace number of the return is different than that of the original transfer. ACH
                 * trace numbers are not unique, but along with the amount and date this number can
                 * be used to identify the ACH return at the bank that initiated it.
                 */
                fun traceNumber(traceNumber: String) = traceNumber(JsonField.of(traceNumber))

                /**
                 * A 15 digit number that was generated by the bank that initiated the return. The
                 * trace number of the return is different than that of the original transfer. ACH
                 * trace numbers are not unique, but along with the amount and date this number can
                 * be used to identify the ACH return at the bank that initiated it.
                 */
                @JsonProperty("trace_number")
                @ExcludeMissing
                fun traceNumber(traceNumber: JsonField<String>) = apply {
                    this.traceNumber = traceNumber
                }

                /** The identifier of the Transaction associated with this return. */
                fun transactionId(transactionId: String) =
                    transactionId(JsonField.of(transactionId))

                /** The identifier of the Transaction associated with this return. */
                @JsonProperty("transaction_id")
                @ExcludeMissing
                fun transactionId(transactionId: JsonField<String>) = apply {
                    this.transactionId = transactionId
                }

                /** The identifier of the ACH Transfer associated with this return. */
                fun transferId(transferId: String) = transferId(JsonField.of(transferId))

                /** The identifier of the ACH Transfer associated with this return. */
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

                fun build(): AchTransferReturn =
                    AchTransferReturn(
                        createdAt,
                        rawReturnReasonCode,
                        returnReasonCode,
                        traceNumber,
                        transactionId,
                        transferId,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class ReturnReasonCode
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ReturnReasonCode && this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    @JvmField
                    val INSUFFICIENT_FUND = ReturnReasonCode(JsonField.of("insufficient_fund"))

                    @JvmField val NO_ACCOUNT = ReturnReasonCode(JsonField.of("no_account"))

                    @JvmField val ACCOUNT_CLOSED = ReturnReasonCode(JsonField.of("account_closed"))

                    @JvmField
                    val INVALID_ACCOUNT_NUMBER_STRUCTURE =
                        ReturnReasonCode(JsonField.of("invalid_account_number_structure"))

                    @JvmField
                    val ACCOUNT_FROZEN_ENTRY_RETURNED_PER_OFAC_INSTRUCTION =
                        ReturnReasonCode(
                            JsonField.of("account_frozen_entry_returned_per_ofac_instruction")
                        )

                    @JvmField
                    val CREDIT_ENTRY_REFUSED_BY_RECEIVER =
                        ReturnReasonCode(JsonField.of("credit_entry_refused_by_receiver"))

                    @JvmField
                    val UNAUTHORIZED_DEBIT_TO_CONSUMER_ACCOUNT_USING_CORPORATE_SEC_CODE =
                        ReturnReasonCode(
                            JsonField.of(
                                "unauthorized_debit_to_consumer_account_using_corporate_sec_code"
                            )
                        )

                    @JvmField
                    val CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED =
                        ReturnReasonCode(JsonField.of("corporate_customer_advised_not_authorized"))

                    @JvmField
                    val PAYMENT_STOPPED = ReturnReasonCode(JsonField.of("payment_stopped"))

                    @JvmField
                    val NON_TRANSACTION_ACCOUNT =
                        ReturnReasonCode(JsonField.of("non_transaction_account"))

                    @JvmField
                    val UNCOLLECTED_FUNDS = ReturnReasonCode(JsonField.of("uncollected_funds"))

                    @JvmField
                    val ROUTING_NUMBER_CHECK_DIGIT_ERROR =
                        ReturnReasonCode(JsonField.of("routing_number_check_digit_error"))

                    @JvmField
                    val CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE =
                        ReturnReasonCode(
                            JsonField.of(
                                "customer_advised_unauthorized_improper_ineligible_or_incomplete"
                            )
                        )

                    @JvmField
                    val AMOUNT_FIELD_ERROR = ReturnReasonCode(JsonField.of("amount_field_error"))

                    @JvmField
                    val AUTHORIZATION_REVOKED_BY_CUSTOMER =
                        ReturnReasonCode(JsonField.of("authorization_revoked_by_customer"))

                    @JvmField
                    val INVALID_ACH_ROUTING_NUMBER =
                        ReturnReasonCode(JsonField.of("invalid_ach_routing_number"))

                    @JvmField
                    val FILE_RECORD_EDIT_CRITERIA =
                        ReturnReasonCode(JsonField.of("file_record_edit_criteria"))

                    @JvmField
                    val ENR_INVALID_INDIVIDUAL_NAME =
                        ReturnReasonCode(JsonField.of("enr_invalid_individual_name"))

                    @JvmField
                    val RETURNED_PER_ODFI_REQUEST =
                        ReturnReasonCode(JsonField.of("returned_per_odfi_request"))

                    @JvmField
                    val LIMITED_PARTICIPATION_DFI =
                        ReturnReasonCode(JsonField.of("limited_participation_dfi"))

                    @JvmField
                    val INCORRECTLY_CODED_OUTBOUND_INTERNATIONAL_PAYMENT =
                        ReturnReasonCode(
                            JsonField.of("incorrectly_coded_outbound_international_payment")
                        )

                    @JvmField
                    val ACCOUNT_SOLD_TO_ANOTHER_DFI =
                        ReturnReasonCode(JsonField.of("account_sold_to_another_dfi"))

                    @JvmField val ADDENDA_ERROR = ReturnReasonCode(JsonField.of("addenda_error"))

                    @JvmField
                    val BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED =
                        ReturnReasonCode(JsonField.of("beneficiary_or_account_holder_deceased"))

                    @JvmField
                    val CUSTOMER_ADVISED_NOT_WITHIN_AUTHORIZATION_TERMS =
                        ReturnReasonCode(
                            JsonField.of("customer_advised_not_within_authorization_terms")
                        )

                    @JvmField
                    val CORRECTED_RETURN = ReturnReasonCode(JsonField.of("corrected_return"))

                    @JvmField
                    val DUPLICATE_ENTRY = ReturnReasonCode(JsonField.of("duplicate_entry"))

                    @JvmField
                    val DUPLICATE_RETURN = ReturnReasonCode(JsonField.of("duplicate_return"))

                    @JvmField
                    val ENR_DUPLICATE_ENROLLMENT =
                        ReturnReasonCode(JsonField.of("enr_duplicate_enrollment"))

                    @JvmField
                    val ENR_INVALID_DFI_ACCOUNT_NUMBER =
                        ReturnReasonCode(JsonField.of("enr_invalid_dfi_account_number"))

                    @JvmField
                    val ENR_INVALID_INDIVIDUAL_ID_NUMBER =
                        ReturnReasonCode(JsonField.of("enr_invalid_individual_id_number"))

                    @JvmField
                    val ENR_INVALID_REPRESENTATIVE_PAYEE_INDICATOR =
                        ReturnReasonCode(JsonField.of("enr_invalid_representative_payee_indicator"))

                    @JvmField
                    val ENR_INVALID_TRANSACTION_CODE =
                        ReturnReasonCode(JsonField.of("enr_invalid_transaction_code"))

                    @JvmField
                    val ENR_RETURN_OF_ENR_ENTRY =
                        ReturnReasonCode(JsonField.of("enr_return_of_enr_entry"))

                    @JvmField
                    val ENR_ROUTING_NUMBER_CHECK_DIGIT_ERROR =
                        ReturnReasonCode(JsonField.of("enr_routing_number_check_digit_error"))

                    @JvmField
                    val ENTRY_NOT_PROCESSED_BY_GATEWAY =
                        ReturnReasonCode(JsonField.of("entry_not_processed_by_gateway"))

                    @JvmField val FIELD_ERROR = ReturnReasonCode(JsonField.of("field_error"))

                    @JvmField
                    val FOREIGN_RECEIVING_DFI_UNABLE_TO_SETTLE =
                        ReturnReasonCode(JsonField.of("foreign_receiving_dfi_unable_to_settle"))

                    @JvmField
                    val IAT_ENTRY_CODING_ERROR =
                        ReturnReasonCode(JsonField.of("iat_entry_coding_error"))

                    @JvmField
                    val IMPROPER_EFFECTIVE_ENTRY_DATE =
                        ReturnReasonCode(JsonField.of("improper_effective_entry_date"))

                    @JvmField
                    val IMPROPER_SOURCE_DOCUMENT_SOURCE_DOCUMENT_PRESENTED =
                        ReturnReasonCode(
                            JsonField.of("improper_source_document_source_document_presented")
                        )

                    @JvmField
                    val INVALID_COMPANY_ID = ReturnReasonCode(JsonField.of("invalid_company_id"))

                    @JvmField
                    val INVALID_FOREIGN_RECEIVING_DFI_IDENTIFICATION =
                        ReturnReasonCode(
                            JsonField.of("invalid_foreign_receiving_dfi_identification")
                        )

                    @JvmField
                    val INVALID_INDIVIDUAL_ID_NUMBER =
                        ReturnReasonCode(JsonField.of("invalid_individual_id_number"))

                    @JvmField
                    val ITEM_AND_RCK_ENTRY_PRESENTED_FOR_PAYMENT =
                        ReturnReasonCode(JsonField.of("item_and_rck_entry_presented_for_payment"))

                    @JvmField
                    val ITEM_RELATED_TO_RCK_ENTRY_IS_INELIGIBLE =
                        ReturnReasonCode(JsonField.of("item_related_to_rck_entry_is_ineligible"))

                    @JvmField
                    val MANDATORY_FIELD_ERROR =
                        ReturnReasonCode(JsonField.of("mandatory_field_error"))

                    @JvmField
                    val MISROUTED_DISHONORED_RETURN =
                        ReturnReasonCode(JsonField.of("misrouted_dishonored_return"))

                    @JvmField
                    val MISROUTED_RETURN = ReturnReasonCode(JsonField.of("misrouted_return"))

                    @JvmField
                    val NO_ERRORS_FOUND = ReturnReasonCode(JsonField.of("no_errors_found"))

                    @JvmField
                    val NON_ACCEPTANCE_OF_R62_DISHONORED_RETURN =
                        ReturnReasonCode(JsonField.of("non_acceptance_of_r62_dishonored_return"))

                    @JvmField
                    val NON_PARTICIPANT_IN_IAT_PROGRAM =
                        ReturnReasonCode(JsonField.of("non_participant_in_iat_program"))

                    @JvmField
                    val PERMISSIBLE_RETURN_ENTRY =
                        ReturnReasonCode(JsonField.of("permissible_return_entry"))

                    @JvmField
                    val PERMISSIBLE_RETURN_ENTRY_NOT_ACCEPTED =
                        ReturnReasonCode(JsonField.of("permissible_return_entry_not_accepted"))

                    @JvmField
                    val RDFI_NON_SETTLEMENT = ReturnReasonCode(JsonField.of("rdfi_non_settlement"))

                    @JvmField
                    val RDFI_PARTICIPANT_IN_CHECK_TRUNCATION_PROGRAM =
                        ReturnReasonCode(
                            JsonField.of("rdfi_participant_in_check_truncation_program")
                        )

                    @JvmField
                    val REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY =
                        ReturnReasonCode(
                            JsonField.of(
                                "representative_payee_deceased_or_unable_to_continue_in_that_capacity"
                            )
                        )

                    @JvmField
                    val RETURN_NOT_A_DUPLICATE =
                        ReturnReasonCode(JsonField.of("return_not_a_duplicate"))

                    @JvmField
                    val RETURN_OF_ERRONEOUS_OR_REVERSING_DEBIT =
                        ReturnReasonCode(JsonField.of("return_of_erroneous_or_reversing_debit"))

                    @JvmField
                    val RETURN_OF_IMPROPER_CREDIT_ENTRY =
                        ReturnReasonCode(JsonField.of("return_of_improper_credit_entry"))

                    @JvmField
                    val RETURN_OF_IMPROPER_DEBIT_ENTRY =
                        ReturnReasonCode(JsonField.of("return_of_improper_debit_entry"))

                    @JvmField
                    val RETURN_OF_XCK_ENTRY = ReturnReasonCode(JsonField.of("return_of_xck_entry"))

                    @JvmField
                    val SOURCE_DOCUMENT_PRESENTED_FOR_PAYMENT =
                        ReturnReasonCode(JsonField.of("source_document_presented_for_payment"))

                    @JvmField
                    val STATE_LAW_AFFECTING_RCK_ACCEPTANCE =
                        ReturnReasonCode(JsonField.of("state_law_affecting_rck_acceptance"))

                    @JvmField
                    val STOP_PAYMENT_ON_ITEM_RELATED_TO_RCK_ENTRY =
                        ReturnReasonCode(JsonField.of("stop_payment_on_item_related_to_rck_entry"))

                    @JvmField
                    val STOP_PAYMENT_ON_SOURCE_DOCUMENT =
                        ReturnReasonCode(JsonField.of("stop_payment_on_source_document"))

                    @JvmField
                    val TIMELY_ORIGINAL_RETURN =
                        ReturnReasonCode(JsonField.of("timely_original_return"))

                    @JvmField
                    val TRACE_NUMBER_ERROR = ReturnReasonCode(JsonField.of("trace_number_error"))

                    @JvmField
                    val UNTIMELY_DISHONORED_RETURN =
                        ReturnReasonCode(JsonField.of("untimely_dishonored_return"))

                    @JvmField
                    val UNTIMELY_RETURN = ReturnReasonCode(JsonField.of("untimely_return"))

                    @JvmStatic fun of(value: String) = ReturnReasonCode(JsonField.of(value))
                }

                enum class Known {
                    INSUFFICIENT_FUND,
                    NO_ACCOUNT,
                    ACCOUNT_CLOSED,
                    INVALID_ACCOUNT_NUMBER_STRUCTURE,
                    ACCOUNT_FROZEN_ENTRY_RETURNED_PER_OFAC_INSTRUCTION,
                    CREDIT_ENTRY_REFUSED_BY_RECEIVER,
                    UNAUTHORIZED_DEBIT_TO_CONSUMER_ACCOUNT_USING_CORPORATE_SEC_CODE,
                    CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED,
                    PAYMENT_STOPPED,
                    NON_TRANSACTION_ACCOUNT,
                    UNCOLLECTED_FUNDS,
                    ROUTING_NUMBER_CHECK_DIGIT_ERROR,
                    CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE,
                    AMOUNT_FIELD_ERROR,
                    AUTHORIZATION_REVOKED_BY_CUSTOMER,
                    INVALID_ACH_ROUTING_NUMBER,
                    FILE_RECORD_EDIT_CRITERIA,
                    ENR_INVALID_INDIVIDUAL_NAME,
                    RETURNED_PER_ODFI_REQUEST,
                    LIMITED_PARTICIPATION_DFI,
                    INCORRECTLY_CODED_OUTBOUND_INTERNATIONAL_PAYMENT,
                    ACCOUNT_SOLD_TO_ANOTHER_DFI,
                    ADDENDA_ERROR,
                    BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED,
                    CUSTOMER_ADVISED_NOT_WITHIN_AUTHORIZATION_TERMS,
                    CORRECTED_RETURN,
                    DUPLICATE_ENTRY,
                    DUPLICATE_RETURN,
                    ENR_DUPLICATE_ENROLLMENT,
                    ENR_INVALID_DFI_ACCOUNT_NUMBER,
                    ENR_INVALID_INDIVIDUAL_ID_NUMBER,
                    ENR_INVALID_REPRESENTATIVE_PAYEE_INDICATOR,
                    ENR_INVALID_TRANSACTION_CODE,
                    ENR_RETURN_OF_ENR_ENTRY,
                    ENR_ROUTING_NUMBER_CHECK_DIGIT_ERROR,
                    ENTRY_NOT_PROCESSED_BY_GATEWAY,
                    FIELD_ERROR,
                    FOREIGN_RECEIVING_DFI_UNABLE_TO_SETTLE,
                    IAT_ENTRY_CODING_ERROR,
                    IMPROPER_EFFECTIVE_ENTRY_DATE,
                    IMPROPER_SOURCE_DOCUMENT_SOURCE_DOCUMENT_PRESENTED,
                    INVALID_COMPANY_ID,
                    INVALID_FOREIGN_RECEIVING_DFI_IDENTIFICATION,
                    INVALID_INDIVIDUAL_ID_NUMBER,
                    ITEM_AND_RCK_ENTRY_PRESENTED_FOR_PAYMENT,
                    ITEM_RELATED_TO_RCK_ENTRY_IS_INELIGIBLE,
                    MANDATORY_FIELD_ERROR,
                    MISROUTED_DISHONORED_RETURN,
                    MISROUTED_RETURN,
                    NO_ERRORS_FOUND,
                    NON_ACCEPTANCE_OF_R62_DISHONORED_RETURN,
                    NON_PARTICIPANT_IN_IAT_PROGRAM,
                    PERMISSIBLE_RETURN_ENTRY,
                    PERMISSIBLE_RETURN_ENTRY_NOT_ACCEPTED,
                    RDFI_NON_SETTLEMENT,
                    RDFI_PARTICIPANT_IN_CHECK_TRUNCATION_PROGRAM,
                    REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY,
                    RETURN_NOT_A_DUPLICATE,
                    RETURN_OF_ERRONEOUS_OR_REVERSING_DEBIT,
                    RETURN_OF_IMPROPER_CREDIT_ENTRY,
                    RETURN_OF_IMPROPER_DEBIT_ENTRY,
                    RETURN_OF_XCK_ENTRY,
                    SOURCE_DOCUMENT_PRESENTED_FOR_PAYMENT,
                    STATE_LAW_AFFECTING_RCK_ACCEPTANCE,
                    STOP_PAYMENT_ON_ITEM_RELATED_TO_RCK_ENTRY,
                    STOP_PAYMENT_ON_SOURCE_DOCUMENT,
                    TIMELY_ORIGINAL_RETURN,
                    TRACE_NUMBER_ERROR,
                    UNTIMELY_DISHONORED_RETURN,
                    UNTIMELY_RETURN,
                }

                enum class Value {
                    INSUFFICIENT_FUND,
                    NO_ACCOUNT,
                    ACCOUNT_CLOSED,
                    INVALID_ACCOUNT_NUMBER_STRUCTURE,
                    ACCOUNT_FROZEN_ENTRY_RETURNED_PER_OFAC_INSTRUCTION,
                    CREDIT_ENTRY_REFUSED_BY_RECEIVER,
                    UNAUTHORIZED_DEBIT_TO_CONSUMER_ACCOUNT_USING_CORPORATE_SEC_CODE,
                    CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED,
                    PAYMENT_STOPPED,
                    NON_TRANSACTION_ACCOUNT,
                    UNCOLLECTED_FUNDS,
                    ROUTING_NUMBER_CHECK_DIGIT_ERROR,
                    CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE,
                    AMOUNT_FIELD_ERROR,
                    AUTHORIZATION_REVOKED_BY_CUSTOMER,
                    INVALID_ACH_ROUTING_NUMBER,
                    FILE_RECORD_EDIT_CRITERIA,
                    ENR_INVALID_INDIVIDUAL_NAME,
                    RETURNED_PER_ODFI_REQUEST,
                    LIMITED_PARTICIPATION_DFI,
                    INCORRECTLY_CODED_OUTBOUND_INTERNATIONAL_PAYMENT,
                    ACCOUNT_SOLD_TO_ANOTHER_DFI,
                    ADDENDA_ERROR,
                    BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED,
                    CUSTOMER_ADVISED_NOT_WITHIN_AUTHORIZATION_TERMS,
                    CORRECTED_RETURN,
                    DUPLICATE_ENTRY,
                    DUPLICATE_RETURN,
                    ENR_DUPLICATE_ENROLLMENT,
                    ENR_INVALID_DFI_ACCOUNT_NUMBER,
                    ENR_INVALID_INDIVIDUAL_ID_NUMBER,
                    ENR_INVALID_REPRESENTATIVE_PAYEE_INDICATOR,
                    ENR_INVALID_TRANSACTION_CODE,
                    ENR_RETURN_OF_ENR_ENTRY,
                    ENR_ROUTING_NUMBER_CHECK_DIGIT_ERROR,
                    ENTRY_NOT_PROCESSED_BY_GATEWAY,
                    FIELD_ERROR,
                    FOREIGN_RECEIVING_DFI_UNABLE_TO_SETTLE,
                    IAT_ENTRY_CODING_ERROR,
                    IMPROPER_EFFECTIVE_ENTRY_DATE,
                    IMPROPER_SOURCE_DOCUMENT_SOURCE_DOCUMENT_PRESENTED,
                    INVALID_COMPANY_ID,
                    INVALID_FOREIGN_RECEIVING_DFI_IDENTIFICATION,
                    INVALID_INDIVIDUAL_ID_NUMBER,
                    ITEM_AND_RCK_ENTRY_PRESENTED_FOR_PAYMENT,
                    ITEM_RELATED_TO_RCK_ENTRY_IS_INELIGIBLE,
                    MANDATORY_FIELD_ERROR,
                    MISROUTED_DISHONORED_RETURN,
                    MISROUTED_RETURN,
                    NO_ERRORS_FOUND,
                    NON_ACCEPTANCE_OF_R62_DISHONORED_RETURN,
                    NON_PARTICIPANT_IN_IAT_PROGRAM,
                    PERMISSIBLE_RETURN_ENTRY,
                    PERMISSIBLE_RETURN_ENTRY_NOT_ACCEPTED,
                    RDFI_NON_SETTLEMENT,
                    RDFI_PARTICIPANT_IN_CHECK_TRUNCATION_PROGRAM,
                    REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY,
                    RETURN_NOT_A_DUPLICATE,
                    RETURN_OF_ERRONEOUS_OR_REVERSING_DEBIT,
                    RETURN_OF_IMPROPER_CREDIT_ENTRY,
                    RETURN_OF_IMPROPER_DEBIT_ENTRY,
                    RETURN_OF_XCK_ENTRY,
                    SOURCE_DOCUMENT_PRESENTED_FOR_PAYMENT,
                    STATE_LAW_AFFECTING_RCK_ACCEPTANCE,
                    STOP_PAYMENT_ON_ITEM_RELATED_TO_RCK_ENTRY,
                    STOP_PAYMENT_ON_SOURCE_DOCUMENT,
                    TIMELY_ORIGINAL_RETURN,
                    TRACE_NUMBER_ERROR,
                    UNTIMELY_DISHONORED_RETURN,
                    UNTIMELY_RETURN,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        INSUFFICIENT_FUND -> Value.INSUFFICIENT_FUND
                        NO_ACCOUNT -> Value.NO_ACCOUNT
                        ACCOUNT_CLOSED -> Value.ACCOUNT_CLOSED
                        INVALID_ACCOUNT_NUMBER_STRUCTURE -> Value.INVALID_ACCOUNT_NUMBER_STRUCTURE
                        ACCOUNT_FROZEN_ENTRY_RETURNED_PER_OFAC_INSTRUCTION ->
                            Value.ACCOUNT_FROZEN_ENTRY_RETURNED_PER_OFAC_INSTRUCTION
                        CREDIT_ENTRY_REFUSED_BY_RECEIVER -> Value.CREDIT_ENTRY_REFUSED_BY_RECEIVER
                        UNAUTHORIZED_DEBIT_TO_CONSUMER_ACCOUNT_USING_CORPORATE_SEC_CODE ->
                            Value.UNAUTHORIZED_DEBIT_TO_CONSUMER_ACCOUNT_USING_CORPORATE_SEC_CODE
                        CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED ->
                            Value.CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED
                        PAYMENT_STOPPED -> Value.PAYMENT_STOPPED
                        NON_TRANSACTION_ACCOUNT -> Value.NON_TRANSACTION_ACCOUNT
                        UNCOLLECTED_FUNDS -> Value.UNCOLLECTED_FUNDS
                        ROUTING_NUMBER_CHECK_DIGIT_ERROR -> Value.ROUTING_NUMBER_CHECK_DIGIT_ERROR
                        CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE ->
                            Value.CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE
                        AMOUNT_FIELD_ERROR -> Value.AMOUNT_FIELD_ERROR
                        AUTHORIZATION_REVOKED_BY_CUSTOMER -> Value.AUTHORIZATION_REVOKED_BY_CUSTOMER
                        INVALID_ACH_ROUTING_NUMBER -> Value.INVALID_ACH_ROUTING_NUMBER
                        FILE_RECORD_EDIT_CRITERIA -> Value.FILE_RECORD_EDIT_CRITERIA
                        ENR_INVALID_INDIVIDUAL_NAME -> Value.ENR_INVALID_INDIVIDUAL_NAME
                        RETURNED_PER_ODFI_REQUEST -> Value.RETURNED_PER_ODFI_REQUEST
                        LIMITED_PARTICIPATION_DFI -> Value.LIMITED_PARTICIPATION_DFI
                        INCORRECTLY_CODED_OUTBOUND_INTERNATIONAL_PAYMENT ->
                            Value.INCORRECTLY_CODED_OUTBOUND_INTERNATIONAL_PAYMENT
                        ACCOUNT_SOLD_TO_ANOTHER_DFI -> Value.ACCOUNT_SOLD_TO_ANOTHER_DFI
                        ADDENDA_ERROR -> Value.ADDENDA_ERROR
                        BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED ->
                            Value.BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED
                        CUSTOMER_ADVISED_NOT_WITHIN_AUTHORIZATION_TERMS ->
                            Value.CUSTOMER_ADVISED_NOT_WITHIN_AUTHORIZATION_TERMS
                        CORRECTED_RETURN -> Value.CORRECTED_RETURN
                        DUPLICATE_ENTRY -> Value.DUPLICATE_ENTRY
                        DUPLICATE_RETURN -> Value.DUPLICATE_RETURN
                        ENR_DUPLICATE_ENROLLMENT -> Value.ENR_DUPLICATE_ENROLLMENT
                        ENR_INVALID_DFI_ACCOUNT_NUMBER -> Value.ENR_INVALID_DFI_ACCOUNT_NUMBER
                        ENR_INVALID_INDIVIDUAL_ID_NUMBER -> Value.ENR_INVALID_INDIVIDUAL_ID_NUMBER
                        ENR_INVALID_REPRESENTATIVE_PAYEE_INDICATOR ->
                            Value.ENR_INVALID_REPRESENTATIVE_PAYEE_INDICATOR
                        ENR_INVALID_TRANSACTION_CODE -> Value.ENR_INVALID_TRANSACTION_CODE
                        ENR_RETURN_OF_ENR_ENTRY -> Value.ENR_RETURN_OF_ENR_ENTRY
                        ENR_ROUTING_NUMBER_CHECK_DIGIT_ERROR ->
                            Value.ENR_ROUTING_NUMBER_CHECK_DIGIT_ERROR
                        ENTRY_NOT_PROCESSED_BY_GATEWAY -> Value.ENTRY_NOT_PROCESSED_BY_GATEWAY
                        FIELD_ERROR -> Value.FIELD_ERROR
                        FOREIGN_RECEIVING_DFI_UNABLE_TO_SETTLE ->
                            Value.FOREIGN_RECEIVING_DFI_UNABLE_TO_SETTLE
                        IAT_ENTRY_CODING_ERROR -> Value.IAT_ENTRY_CODING_ERROR
                        IMPROPER_EFFECTIVE_ENTRY_DATE -> Value.IMPROPER_EFFECTIVE_ENTRY_DATE
                        IMPROPER_SOURCE_DOCUMENT_SOURCE_DOCUMENT_PRESENTED ->
                            Value.IMPROPER_SOURCE_DOCUMENT_SOURCE_DOCUMENT_PRESENTED
                        INVALID_COMPANY_ID -> Value.INVALID_COMPANY_ID
                        INVALID_FOREIGN_RECEIVING_DFI_IDENTIFICATION ->
                            Value.INVALID_FOREIGN_RECEIVING_DFI_IDENTIFICATION
                        INVALID_INDIVIDUAL_ID_NUMBER -> Value.INVALID_INDIVIDUAL_ID_NUMBER
                        ITEM_AND_RCK_ENTRY_PRESENTED_FOR_PAYMENT ->
                            Value.ITEM_AND_RCK_ENTRY_PRESENTED_FOR_PAYMENT
                        ITEM_RELATED_TO_RCK_ENTRY_IS_INELIGIBLE ->
                            Value.ITEM_RELATED_TO_RCK_ENTRY_IS_INELIGIBLE
                        MANDATORY_FIELD_ERROR -> Value.MANDATORY_FIELD_ERROR
                        MISROUTED_DISHONORED_RETURN -> Value.MISROUTED_DISHONORED_RETURN
                        MISROUTED_RETURN -> Value.MISROUTED_RETURN
                        NO_ERRORS_FOUND -> Value.NO_ERRORS_FOUND
                        NON_ACCEPTANCE_OF_R62_DISHONORED_RETURN ->
                            Value.NON_ACCEPTANCE_OF_R62_DISHONORED_RETURN
                        NON_PARTICIPANT_IN_IAT_PROGRAM -> Value.NON_PARTICIPANT_IN_IAT_PROGRAM
                        PERMISSIBLE_RETURN_ENTRY -> Value.PERMISSIBLE_RETURN_ENTRY
                        PERMISSIBLE_RETURN_ENTRY_NOT_ACCEPTED ->
                            Value.PERMISSIBLE_RETURN_ENTRY_NOT_ACCEPTED
                        RDFI_NON_SETTLEMENT -> Value.RDFI_NON_SETTLEMENT
                        RDFI_PARTICIPANT_IN_CHECK_TRUNCATION_PROGRAM ->
                            Value.RDFI_PARTICIPANT_IN_CHECK_TRUNCATION_PROGRAM
                        REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY ->
                            Value
                                .REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY
                        RETURN_NOT_A_DUPLICATE -> Value.RETURN_NOT_A_DUPLICATE
                        RETURN_OF_ERRONEOUS_OR_REVERSING_DEBIT ->
                            Value.RETURN_OF_ERRONEOUS_OR_REVERSING_DEBIT
                        RETURN_OF_IMPROPER_CREDIT_ENTRY -> Value.RETURN_OF_IMPROPER_CREDIT_ENTRY
                        RETURN_OF_IMPROPER_DEBIT_ENTRY -> Value.RETURN_OF_IMPROPER_DEBIT_ENTRY
                        RETURN_OF_XCK_ENTRY -> Value.RETURN_OF_XCK_ENTRY
                        SOURCE_DOCUMENT_PRESENTED_FOR_PAYMENT ->
                            Value.SOURCE_DOCUMENT_PRESENTED_FOR_PAYMENT
                        STATE_LAW_AFFECTING_RCK_ACCEPTANCE ->
                            Value.STATE_LAW_AFFECTING_RCK_ACCEPTANCE
                        STOP_PAYMENT_ON_ITEM_RELATED_TO_RCK_ENTRY ->
                            Value.STOP_PAYMENT_ON_ITEM_RELATED_TO_RCK_ENTRY
                        STOP_PAYMENT_ON_SOURCE_DOCUMENT -> Value.STOP_PAYMENT_ON_SOURCE_DOCUMENT
                        TIMELY_ORIGINAL_RETURN -> Value.TIMELY_ORIGINAL_RETURN
                        TRACE_NUMBER_ERROR -> Value.TRACE_NUMBER_ERROR
                        UNTIMELY_DISHONORED_RETURN -> Value.UNTIMELY_DISHONORED_RETURN
                        UNTIMELY_RETURN -> Value.UNTIMELY_RETURN
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        INSUFFICIENT_FUND -> Known.INSUFFICIENT_FUND
                        NO_ACCOUNT -> Known.NO_ACCOUNT
                        ACCOUNT_CLOSED -> Known.ACCOUNT_CLOSED
                        INVALID_ACCOUNT_NUMBER_STRUCTURE -> Known.INVALID_ACCOUNT_NUMBER_STRUCTURE
                        ACCOUNT_FROZEN_ENTRY_RETURNED_PER_OFAC_INSTRUCTION ->
                            Known.ACCOUNT_FROZEN_ENTRY_RETURNED_PER_OFAC_INSTRUCTION
                        CREDIT_ENTRY_REFUSED_BY_RECEIVER -> Known.CREDIT_ENTRY_REFUSED_BY_RECEIVER
                        UNAUTHORIZED_DEBIT_TO_CONSUMER_ACCOUNT_USING_CORPORATE_SEC_CODE ->
                            Known.UNAUTHORIZED_DEBIT_TO_CONSUMER_ACCOUNT_USING_CORPORATE_SEC_CODE
                        CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED ->
                            Known.CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED
                        PAYMENT_STOPPED -> Known.PAYMENT_STOPPED
                        NON_TRANSACTION_ACCOUNT -> Known.NON_TRANSACTION_ACCOUNT
                        UNCOLLECTED_FUNDS -> Known.UNCOLLECTED_FUNDS
                        ROUTING_NUMBER_CHECK_DIGIT_ERROR -> Known.ROUTING_NUMBER_CHECK_DIGIT_ERROR
                        CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE ->
                            Known.CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE
                        AMOUNT_FIELD_ERROR -> Known.AMOUNT_FIELD_ERROR
                        AUTHORIZATION_REVOKED_BY_CUSTOMER -> Known.AUTHORIZATION_REVOKED_BY_CUSTOMER
                        INVALID_ACH_ROUTING_NUMBER -> Known.INVALID_ACH_ROUTING_NUMBER
                        FILE_RECORD_EDIT_CRITERIA -> Known.FILE_RECORD_EDIT_CRITERIA
                        ENR_INVALID_INDIVIDUAL_NAME -> Known.ENR_INVALID_INDIVIDUAL_NAME
                        RETURNED_PER_ODFI_REQUEST -> Known.RETURNED_PER_ODFI_REQUEST
                        LIMITED_PARTICIPATION_DFI -> Known.LIMITED_PARTICIPATION_DFI
                        INCORRECTLY_CODED_OUTBOUND_INTERNATIONAL_PAYMENT ->
                            Known.INCORRECTLY_CODED_OUTBOUND_INTERNATIONAL_PAYMENT
                        ACCOUNT_SOLD_TO_ANOTHER_DFI -> Known.ACCOUNT_SOLD_TO_ANOTHER_DFI
                        ADDENDA_ERROR -> Known.ADDENDA_ERROR
                        BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED ->
                            Known.BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED
                        CUSTOMER_ADVISED_NOT_WITHIN_AUTHORIZATION_TERMS ->
                            Known.CUSTOMER_ADVISED_NOT_WITHIN_AUTHORIZATION_TERMS
                        CORRECTED_RETURN -> Known.CORRECTED_RETURN
                        DUPLICATE_ENTRY -> Known.DUPLICATE_ENTRY
                        DUPLICATE_RETURN -> Known.DUPLICATE_RETURN
                        ENR_DUPLICATE_ENROLLMENT -> Known.ENR_DUPLICATE_ENROLLMENT
                        ENR_INVALID_DFI_ACCOUNT_NUMBER -> Known.ENR_INVALID_DFI_ACCOUNT_NUMBER
                        ENR_INVALID_INDIVIDUAL_ID_NUMBER -> Known.ENR_INVALID_INDIVIDUAL_ID_NUMBER
                        ENR_INVALID_REPRESENTATIVE_PAYEE_INDICATOR ->
                            Known.ENR_INVALID_REPRESENTATIVE_PAYEE_INDICATOR
                        ENR_INVALID_TRANSACTION_CODE -> Known.ENR_INVALID_TRANSACTION_CODE
                        ENR_RETURN_OF_ENR_ENTRY -> Known.ENR_RETURN_OF_ENR_ENTRY
                        ENR_ROUTING_NUMBER_CHECK_DIGIT_ERROR ->
                            Known.ENR_ROUTING_NUMBER_CHECK_DIGIT_ERROR
                        ENTRY_NOT_PROCESSED_BY_GATEWAY -> Known.ENTRY_NOT_PROCESSED_BY_GATEWAY
                        FIELD_ERROR -> Known.FIELD_ERROR
                        FOREIGN_RECEIVING_DFI_UNABLE_TO_SETTLE ->
                            Known.FOREIGN_RECEIVING_DFI_UNABLE_TO_SETTLE
                        IAT_ENTRY_CODING_ERROR -> Known.IAT_ENTRY_CODING_ERROR
                        IMPROPER_EFFECTIVE_ENTRY_DATE -> Known.IMPROPER_EFFECTIVE_ENTRY_DATE
                        IMPROPER_SOURCE_DOCUMENT_SOURCE_DOCUMENT_PRESENTED ->
                            Known.IMPROPER_SOURCE_DOCUMENT_SOURCE_DOCUMENT_PRESENTED
                        INVALID_COMPANY_ID -> Known.INVALID_COMPANY_ID
                        INVALID_FOREIGN_RECEIVING_DFI_IDENTIFICATION ->
                            Known.INVALID_FOREIGN_RECEIVING_DFI_IDENTIFICATION
                        INVALID_INDIVIDUAL_ID_NUMBER -> Known.INVALID_INDIVIDUAL_ID_NUMBER
                        ITEM_AND_RCK_ENTRY_PRESENTED_FOR_PAYMENT ->
                            Known.ITEM_AND_RCK_ENTRY_PRESENTED_FOR_PAYMENT
                        ITEM_RELATED_TO_RCK_ENTRY_IS_INELIGIBLE ->
                            Known.ITEM_RELATED_TO_RCK_ENTRY_IS_INELIGIBLE
                        MANDATORY_FIELD_ERROR -> Known.MANDATORY_FIELD_ERROR
                        MISROUTED_DISHONORED_RETURN -> Known.MISROUTED_DISHONORED_RETURN
                        MISROUTED_RETURN -> Known.MISROUTED_RETURN
                        NO_ERRORS_FOUND -> Known.NO_ERRORS_FOUND
                        NON_ACCEPTANCE_OF_R62_DISHONORED_RETURN ->
                            Known.NON_ACCEPTANCE_OF_R62_DISHONORED_RETURN
                        NON_PARTICIPANT_IN_IAT_PROGRAM -> Known.NON_PARTICIPANT_IN_IAT_PROGRAM
                        PERMISSIBLE_RETURN_ENTRY -> Known.PERMISSIBLE_RETURN_ENTRY
                        PERMISSIBLE_RETURN_ENTRY_NOT_ACCEPTED ->
                            Known.PERMISSIBLE_RETURN_ENTRY_NOT_ACCEPTED
                        RDFI_NON_SETTLEMENT -> Known.RDFI_NON_SETTLEMENT
                        RDFI_PARTICIPANT_IN_CHECK_TRUNCATION_PROGRAM ->
                            Known.RDFI_PARTICIPANT_IN_CHECK_TRUNCATION_PROGRAM
                        REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY ->
                            Known
                                .REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY
                        RETURN_NOT_A_DUPLICATE -> Known.RETURN_NOT_A_DUPLICATE
                        RETURN_OF_ERRONEOUS_OR_REVERSING_DEBIT ->
                            Known.RETURN_OF_ERRONEOUS_OR_REVERSING_DEBIT
                        RETURN_OF_IMPROPER_CREDIT_ENTRY -> Known.RETURN_OF_IMPROPER_CREDIT_ENTRY
                        RETURN_OF_IMPROPER_DEBIT_ENTRY -> Known.RETURN_OF_IMPROPER_DEBIT_ENTRY
                        RETURN_OF_XCK_ENTRY -> Known.RETURN_OF_XCK_ENTRY
                        SOURCE_DOCUMENT_PRESENTED_FOR_PAYMENT ->
                            Known.SOURCE_DOCUMENT_PRESENTED_FOR_PAYMENT
                        STATE_LAW_AFFECTING_RCK_ACCEPTANCE ->
                            Known.STATE_LAW_AFFECTING_RCK_ACCEPTANCE
                        STOP_PAYMENT_ON_ITEM_RELATED_TO_RCK_ENTRY ->
                            Known.STOP_PAYMENT_ON_ITEM_RELATED_TO_RCK_ENTRY
                        STOP_PAYMENT_ON_SOURCE_DOCUMENT -> Known.STOP_PAYMENT_ON_SOURCE_DOCUMENT
                        TIMELY_ORIGINAL_RETURN -> Known.TIMELY_ORIGINAL_RETURN
                        TRACE_NUMBER_ERROR -> Known.TRACE_NUMBER_ERROR
                        UNTIMELY_DISHONORED_RETURN -> Known.UNTIMELY_DISHONORED_RETURN
                        UNTIMELY_RETURN -> Known.UNTIMELY_RETURN
                        else ->
                            throw IncreaseInvalidDataException("Unknown ReturnReasonCode: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }
        }

        /**
         * A Card Dispute Acceptance object. This field will be present in the JSON response if and
         * only if `category` is equal to `card_dispute_acceptance`.
         */
        @JsonDeserialize(builder = CardDisputeAcceptance.Builder::class)
        @NoAutoDetect
        class CardDisputeAcceptance
        private constructor(
            private val acceptedAt: JsonField<OffsetDateTime>,
            private val cardDisputeId: JsonField<String>,
            private val transactionId: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * Card Dispute was accepted.
             */
            fun acceptedAt(): OffsetDateTime = acceptedAt.getRequired("accepted_at")

            /** The identifier of the Card Dispute that was accepted. */
            fun cardDisputeId(): String = cardDisputeId.getRequired("card_dispute_id")

            /**
             * The identifier of the Transaction that was created to return the disputed funds to
             * your account.
             */
            fun transactionId(): String = transactionId.getRequired("transaction_id")

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * Card Dispute was accepted.
             */
            @JsonProperty("accepted_at") @ExcludeMissing fun _acceptedAt() = acceptedAt

            /** The identifier of the Card Dispute that was accepted. */
            @JsonProperty("card_dispute_id") @ExcludeMissing fun _cardDisputeId() = cardDisputeId

            /**
             * The identifier of the Transaction that was created to return the disputed funds to
             * your account.
             */
            @JsonProperty("transaction_id") @ExcludeMissing fun _transactionId() = transactionId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): CardDisputeAcceptance = apply {
                if (!validated) {
                    acceptedAt()
                    cardDisputeId()
                    transactionId()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CardDisputeAcceptance &&
                    this.acceptedAt == other.acceptedAt &&
                    this.cardDisputeId == other.cardDisputeId &&
                    this.transactionId == other.transactionId &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            acceptedAt,
                            cardDisputeId,
                            transactionId,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "CardDisputeAcceptance{acceptedAt=$acceptedAt, cardDisputeId=$cardDisputeId, transactionId=$transactionId, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var acceptedAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var cardDisputeId: JsonField<String> = JsonMissing.of()
                private var transactionId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(cardDisputeAcceptance: CardDisputeAcceptance) = apply {
                    this.acceptedAt = cardDisputeAcceptance.acceptedAt
                    this.cardDisputeId = cardDisputeAcceptance.cardDisputeId
                    this.transactionId = cardDisputeAcceptance.transactionId
                    additionalProperties(cardDisputeAcceptance.additionalProperties)
                }

                /**
                 * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
                 * Card Dispute was accepted.
                 */
                fun acceptedAt(acceptedAt: OffsetDateTime) = acceptedAt(JsonField.of(acceptedAt))

                /**
                 * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
                 * Card Dispute was accepted.
                 */
                @JsonProperty("accepted_at")
                @ExcludeMissing
                fun acceptedAt(acceptedAt: JsonField<OffsetDateTime>) = apply {
                    this.acceptedAt = acceptedAt
                }

                /** The identifier of the Card Dispute that was accepted. */
                fun cardDisputeId(cardDisputeId: String) =
                    cardDisputeId(JsonField.of(cardDisputeId))

                /** The identifier of the Card Dispute that was accepted. */
                @JsonProperty("card_dispute_id")
                @ExcludeMissing
                fun cardDisputeId(cardDisputeId: JsonField<String>) = apply {
                    this.cardDisputeId = cardDisputeId
                }

                /**
                 * The identifier of the Transaction that was created to return the disputed funds
                 * to your account.
                 */
                fun transactionId(transactionId: String) =
                    transactionId(JsonField.of(transactionId))

                /**
                 * The identifier of the Transaction that was created to return the disputed funds
                 * to your account.
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

                fun build(): CardDisputeAcceptance =
                    CardDisputeAcceptance(
                        acceptedAt,
                        cardDisputeId,
                        transactionId,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        /**
         * A Card Dispute Loss object. This field will be present in the JSON response if and only
         * if `category` is equal to `card_dispute_loss`.
         */
        @JsonDeserialize(builder = CardDisputeLoss.Builder::class)
        @NoAutoDetect
        class CardDisputeLoss
        private constructor(
            private val cardDisputeId: JsonField<String>,
            private val explanation: JsonField<String>,
            private val lostAt: JsonField<OffsetDateTime>,
            private val transactionId: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** The identifier of the Card Dispute that was lost. */
            fun cardDisputeId(): String = cardDisputeId.getRequired("card_dispute_id")

            /** Why the Card Dispute was lost. */
            fun explanation(): String = explanation.getRequired("explanation")

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * Card Dispute was lost.
             */
            fun lostAt(): OffsetDateTime = lostAt.getRequired("lost_at")

            /**
             * The identifier of the Transaction that was created to debit the disputed funds from
             * your account.
             */
            fun transactionId(): String = transactionId.getRequired("transaction_id")

            /** The identifier of the Card Dispute that was lost. */
            @JsonProperty("card_dispute_id") @ExcludeMissing fun _cardDisputeId() = cardDisputeId

            /** Why the Card Dispute was lost. */
            @JsonProperty("explanation") @ExcludeMissing fun _explanation() = explanation

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * Card Dispute was lost.
             */
            @JsonProperty("lost_at") @ExcludeMissing fun _lostAt() = lostAt

            /**
             * The identifier of the Transaction that was created to debit the disputed funds from
             * your account.
             */
            @JsonProperty("transaction_id") @ExcludeMissing fun _transactionId() = transactionId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): CardDisputeLoss = apply {
                if (!validated) {
                    cardDisputeId()
                    explanation()
                    lostAt()
                    transactionId()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CardDisputeLoss &&
                    this.cardDisputeId == other.cardDisputeId &&
                    this.explanation == other.explanation &&
                    this.lostAt == other.lostAt &&
                    this.transactionId == other.transactionId &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            cardDisputeId,
                            explanation,
                            lostAt,
                            transactionId,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "CardDisputeLoss{cardDisputeId=$cardDisputeId, explanation=$explanation, lostAt=$lostAt, transactionId=$transactionId, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var cardDisputeId: JsonField<String> = JsonMissing.of()
                private var explanation: JsonField<String> = JsonMissing.of()
                private var lostAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var transactionId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(cardDisputeLoss: CardDisputeLoss) = apply {
                    this.cardDisputeId = cardDisputeLoss.cardDisputeId
                    this.explanation = cardDisputeLoss.explanation
                    this.lostAt = cardDisputeLoss.lostAt
                    this.transactionId = cardDisputeLoss.transactionId
                    additionalProperties(cardDisputeLoss.additionalProperties)
                }

                /** The identifier of the Card Dispute that was lost. */
                fun cardDisputeId(cardDisputeId: String) =
                    cardDisputeId(JsonField.of(cardDisputeId))

                /** The identifier of the Card Dispute that was lost. */
                @JsonProperty("card_dispute_id")
                @ExcludeMissing
                fun cardDisputeId(cardDisputeId: JsonField<String>) = apply {
                    this.cardDisputeId = cardDisputeId
                }

                /** Why the Card Dispute was lost. */
                fun explanation(explanation: String) = explanation(JsonField.of(explanation))

                /** Why the Card Dispute was lost. */
                @JsonProperty("explanation")
                @ExcludeMissing
                fun explanation(explanation: JsonField<String>) = apply {
                    this.explanation = explanation
                }

                /**
                 * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
                 * Card Dispute was lost.
                 */
                fun lostAt(lostAt: OffsetDateTime) = lostAt(JsonField.of(lostAt))

                /**
                 * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
                 * Card Dispute was lost.
                 */
                @JsonProperty("lost_at")
                @ExcludeMissing
                fun lostAt(lostAt: JsonField<OffsetDateTime>) = apply { this.lostAt = lostAt }

                /**
                 * The identifier of the Transaction that was created to debit the disputed funds
                 * from your account.
                 */
                fun transactionId(transactionId: String) =
                    transactionId(JsonField.of(transactionId))

                /**
                 * The identifier of the Transaction that was created to debit the disputed funds
                 * from your account.
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

                fun build(): CardDisputeLoss =
                    CardDisputeLoss(
                        cardDisputeId,
                        explanation,
                        lostAt,
                        transactionId,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        /**
         * A Card Refund object. This field will be present in the JSON response if and only if
         * `category` is equal to `card_refund`.
         */
        @JsonDeserialize(builder = CardRefund.Builder::class)
        @NoAutoDetect
        class CardRefund
        private constructor(
            private val amount: JsonField<Long>,
            private val cardPaymentId: JsonField<String>,
            private val currency: JsonField<Currency>,
            private val id: JsonField<String>,
            private val interchange: JsonField<Interchange>,
            private val merchantAcceptorId: JsonField<String>,
            private val merchantCategoryCode: JsonField<String>,
            private val merchantCity: JsonField<String>,
            private val merchantCountry: JsonField<String>,
            private val merchantName: JsonField<String>,
            private val merchantState: JsonField<String>,
            private val networkIdentifiers: JsonField<NetworkIdentifiers>,
            private val presentmentAmount: JsonField<Long>,
            private val presentmentCurrency: JsonField<String>,
            private val purchaseDetails: JsonField<PurchaseDetails>,
            private val transactionId: JsonField<String>,
            private val type: JsonField<Type>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /**
             * The amount in the minor unit of the transaction's settlement currency. For dollars,
             * for example, this is cents.
             */
            fun amount(): Long = amount.getRequired("amount")

            /** The ID of the Card Payment this transaction belongs to. */
            fun cardPaymentId(): String = cardPaymentId.getRequired("card_payment_id")

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
             * settlement currency.
             */
            fun currency(): Currency = currency.getRequired("currency")

            /** The Card Refund identifier. */
            fun id(): String = id.getRequired("id")

            /** Interchange assessed as a part of this transaciton. */
            fun interchange(): Optional<Interchange> =
                Optional.ofNullable(interchange.getNullable("interchange"))

            /**
             * The merchant identifier (commonly abbreviated as MID) of the merchant the card is
             * transacting with.
             */
            fun merchantAcceptorId(): Optional<String> =
                Optional.ofNullable(merchantAcceptorId.getNullable("merchant_acceptor_id"))

            /** The 4-digit MCC describing the merchant's business. */
            fun merchantCategoryCode(): String =
                merchantCategoryCode.getRequired("merchant_category_code")

            /** The city the merchant resides in. */
            fun merchantCity(): Optional<String> =
                Optional.ofNullable(merchantCity.getNullable("merchant_city"))

            /** The country the merchant resides in. */
            fun merchantCountry(): String = merchantCountry.getRequired("merchant_country")

            /** The name of the merchant. */
            fun merchantName(): Optional<String> =
                Optional.ofNullable(merchantName.getNullable("merchant_name"))

            /** The state the merchant resides in. */
            fun merchantState(): Optional<String> =
                Optional.ofNullable(merchantState.getNullable("merchant_state"))

            /** Network-specific identifiers for this refund. */
            fun networkIdentifiers(): NetworkIdentifiers =
                networkIdentifiers.getRequired("network_identifiers")

            /** The amount in the minor unit of the transaction's presentment currency. */
            fun presentmentAmount(): Long = presentmentAmount.getRequired("presentment_amount")

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
             * presentment currency.
             */
            fun presentmentCurrency(): String =
                presentmentCurrency.getRequired("presentment_currency")

            /**
             * Additional details about the card purchase, such as tax and industry-specific fields.
             */
            fun purchaseDetails(): Optional<PurchaseDetails> =
                Optional.ofNullable(purchaseDetails.getNullable("purchase_details"))

            /** The identifier of the Transaction associated with this Transaction. */
            fun transactionId(): String = transactionId.getRequired("transaction_id")

            /**
             * A constant representing the object's type. For this resource it will always be
             * `card_refund`.
             */
            fun type(): Type = type.getRequired("type")

            /**
             * The amount in the minor unit of the transaction's settlement currency. For dollars,
             * for example, this is cents.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            /** The ID of the Card Payment this transaction belongs to. */
            @JsonProperty("card_payment_id") @ExcludeMissing fun _cardPaymentId() = cardPaymentId

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
             * settlement currency.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            /** The Card Refund identifier. */
            @JsonProperty("id") @ExcludeMissing fun _id() = id

            /** Interchange assessed as a part of this transaciton. */
            @JsonProperty("interchange") @ExcludeMissing fun _interchange() = interchange

            /**
             * The merchant identifier (commonly abbreviated as MID) of the merchant the card is
             * transacting with.
             */
            @JsonProperty("merchant_acceptor_id")
            @ExcludeMissing
            fun _merchantAcceptorId() = merchantAcceptorId

            /** The 4-digit MCC describing the merchant's business. */
            @JsonProperty("merchant_category_code")
            @ExcludeMissing
            fun _merchantCategoryCode() = merchantCategoryCode

            /** The city the merchant resides in. */
            @JsonProperty("merchant_city") @ExcludeMissing fun _merchantCity() = merchantCity

            /** The country the merchant resides in. */
            @JsonProperty("merchant_country")
            @ExcludeMissing
            fun _merchantCountry() = merchantCountry

            /** The name of the merchant. */
            @JsonProperty("merchant_name") @ExcludeMissing fun _merchantName() = merchantName

            /** The state the merchant resides in. */
            @JsonProperty("merchant_state") @ExcludeMissing fun _merchantState() = merchantState

            /** Network-specific identifiers for this refund. */
            @JsonProperty("network_identifiers")
            @ExcludeMissing
            fun _networkIdentifiers() = networkIdentifiers

            /** The amount in the minor unit of the transaction's presentment currency. */
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
             * Additional details about the card purchase, such as tax and industry-specific fields.
             */
            @JsonProperty("purchase_details")
            @ExcludeMissing
            fun _purchaseDetails() = purchaseDetails

            /** The identifier of the Transaction associated with this Transaction. */
            @JsonProperty("transaction_id") @ExcludeMissing fun _transactionId() = transactionId

            /**
             * A constant representing the object's type. For this resource it will always be
             * `card_refund`.
             */
            @JsonProperty("type") @ExcludeMissing fun _type() = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): CardRefund = apply {
                if (!validated) {
                    amount()
                    cardPaymentId()
                    currency()
                    id()
                    interchange().map { it.validate() }
                    merchantAcceptorId()
                    merchantCategoryCode()
                    merchantCity()
                    merchantCountry()
                    merchantName()
                    merchantState()
                    networkIdentifiers().validate()
                    presentmentAmount()
                    presentmentCurrency()
                    purchaseDetails().map { it.validate() }
                    transactionId()
                    type()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CardRefund &&
                    this.amount == other.amount &&
                    this.cardPaymentId == other.cardPaymentId &&
                    this.currency == other.currency &&
                    this.id == other.id &&
                    this.interchange == other.interchange &&
                    this.merchantAcceptorId == other.merchantAcceptorId &&
                    this.merchantCategoryCode == other.merchantCategoryCode &&
                    this.merchantCity == other.merchantCity &&
                    this.merchantCountry == other.merchantCountry &&
                    this.merchantName == other.merchantName &&
                    this.merchantState == other.merchantState &&
                    this.networkIdentifiers == other.networkIdentifiers &&
                    this.presentmentAmount == other.presentmentAmount &&
                    this.presentmentCurrency == other.presentmentCurrency &&
                    this.purchaseDetails == other.purchaseDetails &&
                    this.transactionId == other.transactionId &&
                    this.type == other.type &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            amount,
                            cardPaymentId,
                            currency,
                            id,
                            interchange,
                            merchantAcceptorId,
                            merchantCategoryCode,
                            merchantCity,
                            merchantCountry,
                            merchantName,
                            merchantState,
                            networkIdentifiers,
                            presentmentAmount,
                            presentmentCurrency,
                            purchaseDetails,
                            transactionId,
                            type,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "CardRefund{amount=$amount, cardPaymentId=$cardPaymentId, currency=$currency, id=$id, interchange=$interchange, merchantAcceptorId=$merchantAcceptorId, merchantCategoryCode=$merchantCategoryCode, merchantCity=$merchantCity, merchantCountry=$merchantCountry, merchantName=$merchantName, merchantState=$merchantState, networkIdentifiers=$networkIdentifiers, presentmentAmount=$presentmentAmount, presentmentCurrency=$presentmentCurrency, purchaseDetails=$purchaseDetails, transactionId=$transactionId, type=$type, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var amount: JsonField<Long> = JsonMissing.of()
                private var cardPaymentId: JsonField<String> = JsonMissing.of()
                private var currency: JsonField<Currency> = JsonMissing.of()
                private var id: JsonField<String> = JsonMissing.of()
                private var interchange: JsonField<Interchange> = JsonMissing.of()
                private var merchantAcceptorId: JsonField<String> = JsonMissing.of()
                private var merchantCategoryCode: JsonField<String> = JsonMissing.of()
                private var merchantCity: JsonField<String> = JsonMissing.of()
                private var merchantCountry: JsonField<String> = JsonMissing.of()
                private var merchantName: JsonField<String> = JsonMissing.of()
                private var merchantState: JsonField<String> = JsonMissing.of()
                private var networkIdentifiers: JsonField<NetworkIdentifiers> = JsonMissing.of()
                private var presentmentAmount: JsonField<Long> = JsonMissing.of()
                private var presentmentCurrency: JsonField<String> = JsonMissing.of()
                private var purchaseDetails: JsonField<PurchaseDetails> = JsonMissing.of()
                private var transactionId: JsonField<String> = JsonMissing.of()
                private var type: JsonField<Type> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(cardRefund: CardRefund) = apply {
                    this.amount = cardRefund.amount
                    this.cardPaymentId = cardRefund.cardPaymentId
                    this.currency = cardRefund.currency
                    this.id = cardRefund.id
                    this.interchange = cardRefund.interchange
                    this.merchantAcceptorId = cardRefund.merchantAcceptorId
                    this.merchantCategoryCode = cardRefund.merchantCategoryCode
                    this.merchantCity = cardRefund.merchantCity
                    this.merchantCountry = cardRefund.merchantCountry
                    this.merchantName = cardRefund.merchantName
                    this.merchantState = cardRefund.merchantState
                    this.networkIdentifiers = cardRefund.networkIdentifiers
                    this.presentmentAmount = cardRefund.presentmentAmount
                    this.presentmentCurrency = cardRefund.presentmentCurrency
                    this.purchaseDetails = cardRefund.purchaseDetails
                    this.transactionId = cardRefund.transactionId
                    this.type = cardRefund.type
                    additionalProperties(cardRefund.additionalProperties)
                }

                /**
                 * The amount in the minor unit of the transaction's settlement currency. For
                 * dollars, for example, this is cents.
                 */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /**
                 * The amount in the minor unit of the transaction's settlement currency. For
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
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
                 * settlement currency.
                 */
                fun currency(currency: Currency) = currency(JsonField.of(currency))

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
                 * settlement currency.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                /** The Card Refund identifier. */
                fun id(id: String) = id(JsonField.of(id))

                /** The Card Refund identifier. */
                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                /** Interchange assessed as a part of this transaciton. */
                fun interchange(interchange: Interchange) = interchange(JsonField.of(interchange))

                /** Interchange assessed as a part of this transaciton. */
                @JsonProperty("interchange")
                @ExcludeMissing
                fun interchange(interchange: JsonField<Interchange>) = apply {
                    this.interchange = interchange
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
                @JsonProperty("merchant_acceptor_id")
                @ExcludeMissing
                fun merchantAcceptorId(merchantAcceptorId: JsonField<String>) = apply {
                    this.merchantAcceptorId = merchantAcceptorId
                }

                /** The 4-digit MCC describing the merchant's business. */
                fun merchantCategoryCode(merchantCategoryCode: String) =
                    merchantCategoryCode(JsonField.of(merchantCategoryCode))

                /** The 4-digit MCC describing the merchant's business. */
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

                /** The name of the merchant. */
                fun merchantName(merchantName: String) = merchantName(JsonField.of(merchantName))

                /** The name of the merchant. */
                @JsonProperty("merchant_name")
                @ExcludeMissing
                fun merchantName(merchantName: JsonField<String>) = apply {
                    this.merchantName = merchantName
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

                /** Network-specific identifiers for this refund. */
                fun networkIdentifiers(networkIdentifiers: NetworkIdentifiers) =
                    networkIdentifiers(JsonField.of(networkIdentifiers))

                /** Network-specific identifiers for this refund. */
                @JsonProperty("network_identifiers")
                @ExcludeMissing
                fun networkIdentifiers(networkIdentifiers: JsonField<NetworkIdentifiers>) = apply {
                    this.networkIdentifiers = networkIdentifiers
                }

                /** The amount in the minor unit of the transaction's presentment currency. */
                fun presentmentAmount(presentmentAmount: Long) =
                    presentmentAmount(JsonField.of(presentmentAmount))

                /** The amount in the minor unit of the transaction's presentment currency. */
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
                 * Additional details about the card purchase, such as tax and industry-specific
                 * fields.
                 */
                fun purchaseDetails(purchaseDetails: PurchaseDetails) =
                    purchaseDetails(JsonField.of(purchaseDetails))

                /**
                 * Additional details about the card purchase, such as tax and industry-specific
                 * fields.
                 */
                @JsonProperty("purchase_details")
                @ExcludeMissing
                fun purchaseDetails(purchaseDetails: JsonField<PurchaseDetails>) = apply {
                    this.purchaseDetails = purchaseDetails
                }

                /** The identifier of the Transaction associated with this Transaction. */
                fun transactionId(transactionId: String) =
                    transactionId(JsonField.of(transactionId))

                /** The identifier of the Transaction associated with this Transaction. */
                @JsonProperty("transaction_id")
                @ExcludeMissing
                fun transactionId(transactionId: JsonField<String>) = apply {
                    this.transactionId = transactionId
                }

                /**
                 * A constant representing the object's type. For this resource it will always be
                 * `card_refund`.
                 */
                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * A constant representing the object's type. For this resource it will always be
                 * `card_refund`.
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

                fun build(): CardRefund =
                    CardRefund(
                        amount,
                        cardPaymentId,
                        currency,
                        id,
                        interchange,
                        merchantAcceptorId,
                        merchantCategoryCode,
                        merchantCity,
                        merchantCountry,
                        merchantName,
                        merchantState,
                        networkIdentifiers,
                        presentmentAmount,
                        presentmentCurrency,
                        purchaseDetails,
                        transactionId,
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

                    return other is Currency && this.value == other.value
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

            /** Interchange assessed as a part of this transaciton. */
            @JsonDeserialize(builder = Interchange.Builder::class)
            @NoAutoDetect
            class Interchange
            private constructor(
                private val amount: JsonField<String>,
                private val code: JsonField<String>,
                private val currency: JsonField<Currency>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /**
                 * The interchange amount given as a string containing a decimal number. The amount
                 * is a positive number if it is credited to Increase (e.g., settlements) and a
                 * negative number if it is debited (e.g., refunds).
                 */
                fun amount(): String = amount.getRequired("amount")

                /** The card network specific interchange code. */
                fun code(): Optional<String> = Optional.ofNullable(code.getNullable("code"))

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the interchange
                 * reimbursement.
                 */
                fun currency(): Currency = currency.getRequired("currency")

                /**
                 * The interchange amount given as a string containing a decimal number. The amount
                 * is a positive number if it is credited to Increase (e.g., settlements) and a
                 * negative number if it is debited (e.g., refunds).
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

                /** The card network specific interchange code. */
                @JsonProperty("code") @ExcludeMissing fun _code() = code

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the interchange
                 * reimbursement.
                 */
                @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Interchange = apply {
                    if (!validated) {
                        amount()
                        code()
                        currency()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Interchange &&
                        this.amount == other.amount &&
                        this.code == other.code &&
                        this.currency == other.currency &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                amount,
                                code,
                                currency,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "Interchange{amount=$amount, code=$code, currency=$currency, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var amount: JsonField<String> = JsonMissing.of()
                    private var code: JsonField<String> = JsonMissing.of()
                    private var currency: JsonField<Currency> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(interchange: Interchange) = apply {
                        this.amount = interchange.amount
                        this.code = interchange.code
                        this.currency = interchange.currency
                        additionalProperties(interchange.additionalProperties)
                    }

                    /**
                     * The interchange amount given as a string containing a decimal number. The
                     * amount is a positive number if it is credited to Increase (e.g., settlements)
                     * and a negative number if it is debited (e.g., refunds).
                     */
                    fun amount(amount: String) = amount(JsonField.of(amount))

                    /**
                     * The interchange amount given as a string containing a decimal number. The
                     * amount is a positive number if it is credited to Increase (e.g., settlements)
                     * and a negative number if it is debited (e.g., refunds).
                     */
                    @JsonProperty("amount")
                    @ExcludeMissing
                    fun amount(amount: JsonField<String>) = apply { this.amount = amount }

                    /** The card network specific interchange code. */
                    fun code(code: String) = code(JsonField.of(code))

                    /** The card network specific interchange code. */
                    @JsonProperty("code")
                    @ExcludeMissing
                    fun code(code: JsonField<String>) = apply { this.code = code }

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                     * interchange reimbursement.
                     */
                    fun currency(currency: Currency) = currency(JsonField.of(currency))

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                     * interchange reimbursement.
                     */
                    @JsonProperty("currency")
                    @ExcludeMissing
                    fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

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

                    fun build(): Interchange =
                        Interchange(
                            amount,
                            code,
                            currency,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class Currency
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

                        return other is Currency && this.value == other.value
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
            }

            /** Network-specific identifiers for this refund. */
            @JsonDeserialize(builder = NetworkIdentifiers.Builder::class)
            @NoAutoDetect
            class NetworkIdentifiers
            private constructor(
                private val acquirerBusinessId: JsonField<String>,
                private val acquirerReferenceNumber: JsonField<String>,
                private val transactionId: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /**
                 * A network assigned business ID that identifies the acquirer that processed this
                 * transaction.
                 */
                fun acquirerBusinessId(): String =
                    acquirerBusinessId.getRequired("acquirer_business_id")

                /** A globally unique identifier for this settlement. */
                fun acquirerReferenceNumber(): String =
                    acquirerReferenceNumber.getRequired("acquirer_reference_number")

                /**
                 * A globally unique transaction identifier provided by the card network, used
                 * across multiple life-cycle requests.
                 */
                fun transactionId(): Optional<String> =
                    Optional.ofNullable(transactionId.getNullable("transaction_id"))

                /**
                 * A network assigned business ID that identifies the acquirer that processed this
                 * transaction.
                 */
                @JsonProperty("acquirer_business_id")
                @ExcludeMissing
                fun _acquirerBusinessId() = acquirerBusinessId

                /** A globally unique identifier for this settlement. */
                @JsonProperty("acquirer_reference_number")
                @ExcludeMissing
                fun _acquirerReferenceNumber() = acquirerReferenceNumber

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
                        acquirerBusinessId()
                        acquirerReferenceNumber()
                        transactionId()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is NetworkIdentifiers &&
                        this.acquirerBusinessId == other.acquirerBusinessId &&
                        this.acquirerReferenceNumber == other.acquirerReferenceNumber &&
                        this.transactionId == other.transactionId &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                acquirerBusinessId,
                                acquirerReferenceNumber,
                                transactionId,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "NetworkIdentifiers{acquirerBusinessId=$acquirerBusinessId, acquirerReferenceNumber=$acquirerReferenceNumber, transactionId=$transactionId, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var acquirerBusinessId: JsonField<String> = JsonMissing.of()
                    private var acquirerReferenceNumber: JsonField<String> = JsonMissing.of()
                    private var transactionId: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(networkIdentifiers: NetworkIdentifiers) = apply {
                        this.acquirerBusinessId = networkIdentifiers.acquirerBusinessId
                        this.acquirerReferenceNumber = networkIdentifiers.acquirerReferenceNumber
                        this.transactionId = networkIdentifiers.transactionId
                        additionalProperties(networkIdentifiers.additionalProperties)
                    }

                    /**
                     * A network assigned business ID that identifies the acquirer that processed
                     * this transaction.
                     */
                    fun acquirerBusinessId(acquirerBusinessId: String) =
                        acquirerBusinessId(JsonField.of(acquirerBusinessId))

                    /**
                     * A network assigned business ID that identifies the acquirer that processed
                     * this transaction.
                     */
                    @JsonProperty("acquirer_business_id")
                    @ExcludeMissing
                    fun acquirerBusinessId(acquirerBusinessId: JsonField<String>) = apply {
                        this.acquirerBusinessId = acquirerBusinessId
                    }

                    /** A globally unique identifier for this settlement. */
                    fun acquirerReferenceNumber(acquirerReferenceNumber: String) =
                        acquirerReferenceNumber(JsonField.of(acquirerReferenceNumber))

                    /** A globally unique identifier for this settlement. */
                    @JsonProperty("acquirer_reference_number")
                    @ExcludeMissing
                    fun acquirerReferenceNumber(acquirerReferenceNumber: JsonField<String>) =
                        apply {
                            this.acquirerReferenceNumber = acquirerReferenceNumber
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
                            acquirerBusinessId,
                            acquirerReferenceNumber,
                            transactionId,
                            additionalProperties.toUnmodifiable(),
                        )
                }
            }

            /**
             * Additional details about the card purchase, such as tax and industry-specific fields.
             */
            @JsonDeserialize(builder = PurchaseDetails.Builder::class)
            @NoAutoDetect
            class PurchaseDetails
            private constructor(
                private val carRental: JsonField<CarRental>,
                private val customerReferenceIdentifier: JsonField<String>,
                private val localTaxAmount: JsonField<Long>,
                private val localTaxCurrency: JsonField<String>,
                private val lodging: JsonField<Lodging>,
                private val nationalTaxAmount: JsonField<Long>,
                private val nationalTaxCurrency: JsonField<String>,
                private val purchaseIdentifier: JsonField<String>,
                private val purchaseIdentifierFormat: JsonField<PurchaseIdentifierFormat>,
                private val travel: JsonField<Travel>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /** Fields specific to car rentals. */
                fun carRental(): Optional<CarRental> =
                    Optional.ofNullable(carRental.getNullable("car_rental"))

                /** An identifier from the merchant for the customer or consumer. */
                fun customerReferenceIdentifier(): Optional<String> =
                    Optional.ofNullable(
                        customerReferenceIdentifier.getNullable("customer_reference_identifier")
                    )

                /** The state or provincial tax amount in minor units. */
                fun localTaxAmount(): Optional<Long> =
                    Optional.ofNullable(localTaxAmount.getNullable("local_tax_amount"))

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the local tax
                 * assessed.
                 */
                fun localTaxCurrency(): Optional<String> =
                    Optional.ofNullable(localTaxCurrency.getNullable("local_tax_currency"))

                /** Fields specific to lodging. */
                fun lodging(): Optional<Lodging> =
                    Optional.ofNullable(lodging.getNullable("lodging"))

                /** The national tax amount in minor units. */
                fun nationalTaxAmount(): Optional<Long> =
                    Optional.ofNullable(nationalTaxAmount.getNullable("national_tax_amount"))

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the local tax
                 * assessed.
                 */
                fun nationalTaxCurrency(): Optional<String> =
                    Optional.ofNullable(nationalTaxCurrency.getNullable("national_tax_currency"))

                /**
                 * An identifier from the merchant for the purchase to the issuer and cardholder.
                 */
                fun purchaseIdentifier(): Optional<String> =
                    Optional.ofNullable(purchaseIdentifier.getNullable("purchase_identifier"))

                /** The format of the purchase identifier. */
                fun purchaseIdentifierFormat(): Optional<PurchaseIdentifierFormat> =
                    Optional.ofNullable(
                        purchaseIdentifierFormat.getNullable("purchase_identifier_format")
                    )

                /** Fields specific to travel. */
                fun travel(): Optional<Travel> = Optional.ofNullable(travel.getNullable("travel"))

                /** Fields specific to car rentals. */
                @JsonProperty("car_rental") @ExcludeMissing fun _carRental() = carRental

                /** An identifier from the merchant for the customer or consumer. */
                @JsonProperty("customer_reference_identifier")
                @ExcludeMissing
                fun _customerReferenceIdentifier() = customerReferenceIdentifier

                /** The state or provincial tax amount in minor units. */
                @JsonProperty("local_tax_amount")
                @ExcludeMissing
                fun _localTaxAmount() = localTaxAmount

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the local tax
                 * assessed.
                 */
                @JsonProperty("local_tax_currency")
                @ExcludeMissing
                fun _localTaxCurrency() = localTaxCurrency

                /** Fields specific to lodging. */
                @JsonProperty("lodging") @ExcludeMissing fun _lodging() = lodging

                /** The national tax amount in minor units. */
                @JsonProperty("national_tax_amount")
                @ExcludeMissing
                fun _nationalTaxAmount() = nationalTaxAmount

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the local tax
                 * assessed.
                 */
                @JsonProperty("national_tax_currency")
                @ExcludeMissing
                fun _nationalTaxCurrency() = nationalTaxCurrency

                /**
                 * An identifier from the merchant for the purchase to the issuer and cardholder.
                 */
                @JsonProperty("purchase_identifier")
                @ExcludeMissing
                fun _purchaseIdentifier() = purchaseIdentifier

                /** The format of the purchase identifier. */
                @JsonProperty("purchase_identifier_format")
                @ExcludeMissing
                fun _purchaseIdentifierFormat() = purchaseIdentifierFormat

                /** Fields specific to travel. */
                @JsonProperty("travel") @ExcludeMissing fun _travel() = travel

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): PurchaseDetails = apply {
                    if (!validated) {
                        carRental().map { it.validate() }
                        customerReferenceIdentifier()
                        localTaxAmount()
                        localTaxCurrency()
                        lodging().map { it.validate() }
                        nationalTaxAmount()
                        nationalTaxCurrency()
                        purchaseIdentifier()
                        purchaseIdentifierFormat()
                        travel().map { it.validate() }
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is PurchaseDetails &&
                        this.carRental == other.carRental &&
                        this.customerReferenceIdentifier == other.customerReferenceIdentifier &&
                        this.localTaxAmount == other.localTaxAmount &&
                        this.localTaxCurrency == other.localTaxCurrency &&
                        this.lodging == other.lodging &&
                        this.nationalTaxAmount == other.nationalTaxAmount &&
                        this.nationalTaxCurrency == other.nationalTaxCurrency &&
                        this.purchaseIdentifier == other.purchaseIdentifier &&
                        this.purchaseIdentifierFormat == other.purchaseIdentifierFormat &&
                        this.travel == other.travel &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                carRental,
                                customerReferenceIdentifier,
                                localTaxAmount,
                                localTaxCurrency,
                                lodging,
                                nationalTaxAmount,
                                nationalTaxCurrency,
                                purchaseIdentifier,
                                purchaseIdentifierFormat,
                                travel,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "PurchaseDetails{carRental=$carRental, customerReferenceIdentifier=$customerReferenceIdentifier, localTaxAmount=$localTaxAmount, localTaxCurrency=$localTaxCurrency, lodging=$lodging, nationalTaxAmount=$nationalTaxAmount, nationalTaxCurrency=$nationalTaxCurrency, purchaseIdentifier=$purchaseIdentifier, purchaseIdentifierFormat=$purchaseIdentifierFormat, travel=$travel, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var carRental: JsonField<CarRental> = JsonMissing.of()
                    private var customerReferenceIdentifier: JsonField<String> = JsonMissing.of()
                    private var localTaxAmount: JsonField<Long> = JsonMissing.of()
                    private var localTaxCurrency: JsonField<String> = JsonMissing.of()
                    private var lodging: JsonField<Lodging> = JsonMissing.of()
                    private var nationalTaxAmount: JsonField<Long> = JsonMissing.of()
                    private var nationalTaxCurrency: JsonField<String> = JsonMissing.of()
                    private var purchaseIdentifier: JsonField<String> = JsonMissing.of()
                    private var purchaseIdentifierFormat: JsonField<PurchaseIdentifierFormat> =
                        JsonMissing.of()
                    private var travel: JsonField<Travel> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(purchaseDetails: PurchaseDetails) = apply {
                        this.carRental = purchaseDetails.carRental
                        this.customerReferenceIdentifier =
                            purchaseDetails.customerReferenceIdentifier
                        this.localTaxAmount = purchaseDetails.localTaxAmount
                        this.localTaxCurrency = purchaseDetails.localTaxCurrency
                        this.lodging = purchaseDetails.lodging
                        this.nationalTaxAmount = purchaseDetails.nationalTaxAmount
                        this.nationalTaxCurrency = purchaseDetails.nationalTaxCurrency
                        this.purchaseIdentifier = purchaseDetails.purchaseIdentifier
                        this.purchaseIdentifierFormat = purchaseDetails.purchaseIdentifierFormat
                        this.travel = purchaseDetails.travel
                        additionalProperties(purchaseDetails.additionalProperties)
                    }

                    /** Fields specific to car rentals. */
                    fun carRental(carRental: CarRental) = carRental(JsonField.of(carRental))

                    /** Fields specific to car rentals. */
                    @JsonProperty("car_rental")
                    @ExcludeMissing
                    fun carRental(carRental: JsonField<CarRental>) = apply {
                        this.carRental = carRental
                    }

                    /** An identifier from the merchant for the customer or consumer. */
                    fun customerReferenceIdentifier(customerReferenceIdentifier: String) =
                        customerReferenceIdentifier(JsonField.of(customerReferenceIdentifier))

                    /** An identifier from the merchant for the customer or consumer. */
                    @JsonProperty("customer_reference_identifier")
                    @ExcludeMissing
                    fun customerReferenceIdentifier(
                        customerReferenceIdentifier: JsonField<String>
                    ) = apply { this.customerReferenceIdentifier = customerReferenceIdentifier }

                    /** The state or provincial tax amount in minor units. */
                    fun localTaxAmount(localTaxAmount: Long) =
                        localTaxAmount(JsonField.of(localTaxAmount))

                    /** The state or provincial tax amount in minor units. */
                    @JsonProperty("local_tax_amount")
                    @ExcludeMissing
                    fun localTaxAmount(localTaxAmount: JsonField<Long>) = apply {
                        this.localTaxAmount = localTaxAmount
                    }

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the local tax
                     * assessed.
                     */
                    fun localTaxCurrency(localTaxCurrency: String) =
                        localTaxCurrency(JsonField.of(localTaxCurrency))

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the local tax
                     * assessed.
                     */
                    @JsonProperty("local_tax_currency")
                    @ExcludeMissing
                    fun localTaxCurrency(localTaxCurrency: JsonField<String>) = apply {
                        this.localTaxCurrency = localTaxCurrency
                    }

                    /** Fields specific to lodging. */
                    fun lodging(lodging: Lodging) = lodging(JsonField.of(lodging))

                    /** Fields specific to lodging. */
                    @JsonProperty("lodging")
                    @ExcludeMissing
                    fun lodging(lodging: JsonField<Lodging>) = apply { this.lodging = lodging }

                    /** The national tax amount in minor units. */
                    fun nationalTaxAmount(nationalTaxAmount: Long) =
                        nationalTaxAmount(JsonField.of(nationalTaxAmount))

                    /** The national tax amount in minor units. */
                    @JsonProperty("national_tax_amount")
                    @ExcludeMissing
                    fun nationalTaxAmount(nationalTaxAmount: JsonField<Long>) = apply {
                        this.nationalTaxAmount = nationalTaxAmount
                    }

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the local tax
                     * assessed.
                     */
                    fun nationalTaxCurrency(nationalTaxCurrency: String) =
                        nationalTaxCurrency(JsonField.of(nationalTaxCurrency))

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the local tax
                     * assessed.
                     */
                    @JsonProperty("national_tax_currency")
                    @ExcludeMissing
                    fun nationalTaxCurrency(nationalTaxCurrency: JsonField<String>) = apply {
                        this.nationalTaxCurrency = nationalTaxCurrency
                    }

                    /**
                     * An identifier from the merchant for the purchase to the issuer and
                     * cardholder.
                     */
                    fun purchaseIdentifier(purchaseIdentifier: String) =
                        purchaseIdentifier(JsonField.of(purchaseIdentifier))

                    /**
                     * An identifier from the merchant for the purchase to the issuer and
                     * cardholder.
                     */
                    @JsonProperty("purchase_identifier")
                    @ExcludeMissing
                    fun purchaseIdentifier(purchaseIdentifier: JsonField<String>) = apply {
                        this.purchaseIdentifier = purchaseIdentifier
                    }

                    /** The format of the purchase identifier. */
                    fun purchaseIdentifierFormat(
                        purchaseIdentifierFormat: PurchaseIdentifierFormat
                    ) = purchaseIdentifierFormat(JsonField.of(purchaseIdentifierFormat))

                    /** The format of the purchase identifier. */
                    @JsonProperty("purchase_identifier_format")
                    @ExcludeMissing
                    fun purchaseIdentifierFormat(
                        purchaseIdentifierFormat: JsonField<PurchaseIdentifierFormat>
                    ) = apply { this.purchaseIdentifierFormat = purchaseIdentifierFormat }

                    /** Fields specific to travel. */
                    fun travel(travel: Travel) = travel(JsonField.of(travel))

                    /** Fields specific to travel. */
                    @JsonProperty("travel")
                    @ExcludeMissing
                    fun travel(travel: JsonField<Travel>) = apply { this.travel = travel }

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

                    fun build(): PurchaseDetails =
                        PurchaseDetails(
                            carRental,
                            customerReferenceIdentifier,
                            localTaxAmount,
                            localTaxCurrency,
                            lodging,
                            nationalTaxAmount,
                            nationalTaxCurrency,
                            purchaseIdentifier,
                            purchaseIdentifierFormat,
                            travel,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                /** Fields specific to car rentals. */
                @JsonDeserialize(builder = CarRental.Builder::class)
                @NoAutoDetect
                class CarRental
                private constructor(
                    private val carClassCode: JsonField<String>,
                    private val checkoutDate: JsonField<LocalDate>,
                    private val dailyRentalRateAmount: JsonField<Long>,
                    private val dailyRentalRateCurrency: JsonField<String>,
                    private val daysRented: JsonField<Long>,
                    private val extraCharges: JsonField<ExtraCharges>,
                    private val fuelChargesAmount: JsonField<Long>,
                    private val fuelChargesCurrency: JsonField<String>,
                    private val insuranceChargesAmount: JsonField<Long>,
                    private val insuranceChargesCurrency: JsonField<String>,
                    private val noShowIndicator: JsonField<NoShowIndicator>,
                    private val oneWayDropOffChargesAmount: JsonField<Long>,
                    private val oneWayDropOffChargesCurrency: JsonField<String>,
                    private val renterName: JsonField<String>,
                    private val weeklyRentalRateAmount: JsonField<Long>,
                    private val weeklyRentalRateCurrency: JsonField<String>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    /** Code indicating the vehicle's class. */
                    fun carClassCode(): Optional<String> =
                        Optional.ofNullable(carClassCode.getNullable("car_class_code"))

                    /**
                     * Date the customer picked up the car or, in the case of a no-show or pre-pay
                     * transaction, the scheduled pick up date.
                     */
                    fun checkoutDate(): Optional<LocalDate> =
                        Optional.ofNullable(checkoutDate.getNullable("checkout_date"))

                    /** Daily rate being charged for the vehicle. */
                    fun dailyRentalRateAmount(): Optional<Long> =
                        Optional.ofNullable(
                            dailyRentalRateAmount.getNullable("daily_rental_rate_amount")
                        )

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the daily
                     * rental rate.
                     */
                    fun dailyRentalRateCurrency(): Optional<String> =
                        Optional.ofNullable(
                            dailyRentalRateCurrency.getNullable("daily_rental_rate_currency")
                        )

                    /** Number of days the vehicle was rented. */
                    fun daysRented(): Optional<Long> =
                        Optional.ofNullable(daysRented.getNullable("days_rented"))

                    /** Additional charges (gas, late fee, etc.) being billed. */
                    fun extraCharges(): Optional<ExtraCharges> =
                        Optional.ofNullable(extraCharges.getNullable("extra_charges"))

                    /** Fuel charges for the vehicle. */
                    fun fuelChargesAmount(): Optional<Long> =
                        Optional.ofNullable(fuelChargesAmount.getNullable("fuel_charges_amount"))

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the fuel
                     * charges assessed.
                     */
                    fun fuelChargesCurrency(): Optional<String> =
                        Optional.ofNullable(
                            fuelChargesCurrency.getNullable("fuel_charges_currency")
                        )

                    /** Any insurance being charged for the vehicle. */
                    fun insuranceChargesAmount(): Optional<Long> =
                        Optional.ofNullable(
                            insuranceChargesAmount.getNullable("insurance_charges_amount")
                        )

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the insurance
                     * charges assessed.
                     */
                    fun insuranceChargesCurrency(): Optional<String> =
                        Optional.ofNullable(
                            insuranceChargesCurrency.getNullable("insurance_charges_currency")
                        )

                    /**
                     * An indicator that the cardholder is being billed for a reserved vehicle that
                     * was not actually rented (that is, a "no-show" charge).
                     */
                    fun noShowIndicator(): Optional<NoShowIndicator> =
                        Optional.ofNullable(noShowIndicator.getNullable("no_show_indicator"))

                    /**
                     * Charges for returning the vehicle at a different location than where it was
                     * picked up.
                     */
                    fun oneWayDropOffChargesAmount(): Optional<Long> =
                        Optional.ofNullable(
                            oneWayDropOffChargesAmount.getNullable(
                                "one_way_drop_off_charges_amount"
                            )
                        )

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the one-way
                     * drop-off charges assessed.
                     */
                    fun oneWayDropOffChargesCurrency(): Optional<String> =
                        Optional.ofNullable(
                            oneWayDropOffChargesCurrency.getNullable(
                                "one_way_drop_off_charges_currency"
                            )
                        )

                    /** Name of the person renting the vehicle. */
                    fun renterName(): Optional<String> =
                        Optional.ofNullable(renterName.getNullable("renter_name"))

                    /** Weekly rate being charged for the vehicle. */
                    fun weeklyRentalRateAmount(): Optional<Long> =
                        Optional.ofNullable(
                            weeklyRentalRateAmount.getNullable("weekly_rental_rate_amount")
                        )

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the weekly
                     * rental rate.
                     */
                    fun weeklyRentalRateCurrency(): Optional<String> =
                        Optional.ofNullable(
                            weeklyRentalRateCurrency.getNullable("weekly_rental_rate_currency")
                        )

                    /** Code indicating the vehicle's class. */
                    @JsonProperty("car_class_code")
                    @ExcludeMissing
                    fun _carClassCode() = carClassCode

                    /**
                     * Date the customer picked up the car or, in the case of a no-show or pre-pay
                     * transaction, the scheduled pick up date.
                     */
                    @JsonProperty("checkout_date")
                    @ExcludeMissing
                    fun _checkoutDate() = checkoutDate

                    /** Daily rate being charged for the vehicle. */
                    @JsonProperty("daily_rental_rate_amount")
                    @ExcludeMissing
                    fun _dailyRentalRateAmount() = dailyRentalRateAmount

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the daily
                     * rental rate.
                     */
                    @JsonProperty("daily_rental_rate_currency")
                    @ExcludeMissing
                    fun _dailyRentalRateCurrency() = dailyRentalRateCurrency

                    /** Number of days the vehicle was rented. */
                    @JsonProperty("days_rented") @ExcludeMissing fun _daysRented() = daysRented

                    /** Additional charges (gas, late fee, etc.) being billed. */
                    @JsonProperty("extra_charges")
                    @ExcludeMissing
                    fun _extraCharges() = extraCharges

                    /** Fuel charges for the vehicle. */
                    @JsonProperty("fuel_charges_amount")
                    @ExcludeMissing
                    fun _fuelChargesAmount() = fuelChargesAmount

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the fuel
                     * charges assessed.
                     */
                    @JsonProperty("fuel_charges_currency")
                    @ExcludeMissing
                    fun _fuelChargesCurrency() = fuelChargesCurrency

                    /** Any insurance being charged for the vehicle. */
                    @JsonProperty("insurance_charges_amount")
                    @ExcludeMissing
                    fun _insuranceChargesAmount() = insuranceChargesAmount

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the insurance
                     * charges assessed.
                     */
                    @JsonProperty("insurance_charges_currency")
                    @ExcludeMissing
                    fun _insuranceChargesCurrency() = insuranceChargesCurrency

                    /**
                     * An indicator that the cardholder is being billed for a reserved vehicle that
                     * was not actually rented (that is, a "no-show" charge).
                     */
                    @JsonProperty("no_show_indicator")
                    @ExcludeMissing
                    fun _noShowIndicator() = noShowIndicator

                    /**
                     * Charges for returning the vehicle at a different location than where it was
                     * picked up.
                     */
                    @JsonProperty("one_way_drop_off_charges_amount")
                    @ExcludeMissing
                    fun _oneWayDropOffChargesAmount() = oneWayDropOffChargesAmount

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the one-way
                     * drop-off charges assessed.
                     */
                    @JsonProperty("one_way_drop_off_charges_currency")
                    @ExcludeMissing
                    fun _oneWayDropOffChargesCurrency() = oneWayDropOffChargesCurrency

                    /** Name of the person renting the vehicle. */
                    @JsonProperty("renter_name") @ExcludeMissing fun _renterName() = renterName

                    /** Weekly rate being charged for the vehicle. */
                    @JsonProperty("weekly_rental_rate_amount")
                    @ExcludeMissing
                    fun _weeklyRentalRateAmount() = weeklyRentalRateAmount

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the weekly
                     * rental rate.
                     */
                    @JsonProperty("weekly_rental_rate_currency")
                    @ExcludeMissing
                    fun _weeklyRentalRateCurrency() = weeklyRentalRateCurrency

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): CarRental = apply {
                        if (!validated) {
                            carClassCode()
                            checkoutDate()
                            dailyRentalRateAmount()
                            dailyRentalRateCurrency()
                            daysRented()
                            extraCharges()
                            fuelChargesAmount()
                            fuelChargesCurrency()
                            insuranceChargesAmount()
                            insuranceChargesCurrency()
                            noShowIndicator()
                            oneWayDropOffChargesAmount()
                            oneWayDropOffChargesCurrency()
                            renterName()
                            weeklyRentalRateAmount()
                            weeklyRentalRateCurrency()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is CarRental &&
                            this.carClassCode == other.carClassCode &&
                            this.checkoutDate == other.checkoutDate &&
                            this.dailyRentalRateAmount == other.dailyRentalRateAmount &&
                            this.dailyRentalRateCurrency == other.dailyRentalRateCurrency &&
                            this.daysRented == other.daysRented &&
                            this.extraCharges == other.extraCharges &&
                            this.fuelChargesAmount == other.fuelChargesAmount &&
                            this.fuelChargesCurrency == other.fuelChargesCurrency &&
                            this.insuranceChargesAmount == other.insuranceChargesAmount &&
                            this.insuranceChargesCurrency == other.insuranceChargesCurrency &&
                            this.noShowIndicator == other.noShowIndicator &&
                            this.oneWayDropOffChargesAmount == other.oneWayDropOffChargesAmount &&
                            this.oneWayDropOffChargesCurrency ==
                                other.oneWayDropOffChargesCurrency &&
                            this.renterName == other.renterName &&
                            this.weeklyRentalRateAmount == other.weeklyRentalRateAmount &&
                            this.weeklyRentalRateCurrency == other.weeklyRentalRateCurrency &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode =
                                Objects.hash(
                                    carClassCode,
                                    checkoutDate,
                                    dailyRentalRateAmount,
                                    dailyRentalRateCurrency,
                                    daysRented,
                                    extraCharges,
                                    fuelChargesAmount,
                                    fuelChargesCurrency,
                                    insuranceChargesAmount,
                                    insuranceChargesCurrency,
                                    noShowIndicator,
                                    oneWayDropOffChargesAmount,
                                    oneWayDropOffChargesCurrency,
                                    renterName,
                                    weeklyRentalRateAmount,
                                    weeklyRentalRateCurrency,
                                    additionalProperties,
                                )
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "CarRental{carClassCode=$carClassCode, checkoutDate=$checkoutDate, dailyRentalRateAmount=$dailyRentalRateAmount, dailyRentalRateCurrency=$dailyRentalRateCurrency, daysRented=$daysRented, extraCharges=$extraCharges, fuelChargesAmount=$fuelChargesAmount, fuelChargesCurrency=$fuelChargesCurrency, insuranceChargesAmount=$insuranceChargesAmount, insuranceChargesCurrency=$insuranceChargesCurrency, noShowIndicator=$noShowIndicator, oneWayDropOffChargesAmount=$oneWayDropOffChargesAmount, oneWayDropOffChargesCurrency=$oneWayDropOffChargesCurrency, renterName=$renterName, weeklyRentalRateAmount=$weeklyRentalRateAmount, weeklyRentalRateCurrency=$weeklyRentalRateCurrency, additionalProperties=$additionalProperties}"

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var carClassCode: JsonField<String> = JsonMissing.of()
                        private var checkoutDate: JsonField<LocalDate> = JsonMissing.of()
                        private var dailyRentalRateAmount: JsonField<Long> = JsonMissing.of()
                        private var dailyRentalRateCurrency: JsonField<String> = JsonMissing.of()
                        private var daysRented: JsonField<Long> = JsonMissing.of()
                        private var extraCharges: JsonField<ExtraCharges> = JsonMissing.of()
                        private var fuelChargesAmount: JsonField<Long> = JsonMissing.of()
                        private var fuelChargesCurrency: JsonField<String> = JsonMissing.of()
                        private var insuranceChargesAmount: JsonField<Long> = JsonMissing.of()
                        private var insuranceChargesCurrency: JsonField<String> = JsonMissing.of()
                        private var noShowIndicator: JsonField<NoShowIndicator> = JsonMissing.of()
                        private var oneWayDropOffChargesAmount: JsonField<Long> = JsonMissing.of()
                        private var oneWayDropOffChargesCurrency: JsonField<String> =
                            JsonMissing.of()
                        private var renterName: JsonField<String> = JsonMissing.of()
                        private var weeklyRentalRateAmount: JsonField<Long> = JsonMissing.of()
                        private var weeklyRentalRateCurrency: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(carRental: CarRental) = apply {
                            this.carClassCode = carRental.carClassCode
                            this.checkoutDate = carRental.checkoutDate
                            this.dailyRentalRateAmount = carRental.dailyRentalRateAmount
                            this.dailyRentalRateCurrency = carRental.dailyRentalRateCurrency
                            this.daysRented = carRental.daysRented
                            this.extraCharges = carRental.extraCharges
                            this.fuelChargesAmount = carRental.fuelChargesAmount
                            this.fuelChargesCurrency = carRental.fuelChargesCurrency
                            this.insuranceChargesAmount = carRental.insuranceChargesAmount
                            this.insuranceChargesCurrency = carRental.insuranceChargesCurrency
                            this.noShowIndicator = carRental.noShowIndicator
                            this.oneWayDropOffChargesAmount = carRental.oneWayDropOffChargesAmount
                            this.oneWayDropOffChargesCurrency =
                                carRental.oneWayDropOffChargesCurrency
                            this.renterName = carRental.renterName
                            this.weeklyRentalRateAmount = carRental.weeklyRentalRateAmount
                            this.weeklyRentalRateCurrency = carRental.weeklyRentalRateCurrency
                            additionalProperties(carRental.additionalProperties)
                        }

                        /** Code indicating the vehicle's class. */
                        fun carClassCode(carClassCode: String) =
                            carClassCode(JsonField.of(carClassCode))

                        /** Code indicating the vehicle's class. */
                        @JsonProperty("car_class_code")
                        @ExcludeMissing
                        fun carClassCode(carClassCode: JsonField<String>) = apply {
                            this.carClassCode = carClassCode
                        }

                        /**
                         * Date the customer picked up the car or, in the case of a no-show or
                         * pre-pay transaction, the scheduled pick up date.
                         */
                        fun checkoutDate(checkoutDate: LocalDate) =
                            checkoutDate(JsonField.of(checkoutDate))

                        /**
                         * Date the customer picked up the car or, in the case of a no-show or
                         * pre-pay transaction, the scheduled pick up date.
                         */
                        @JsonProperty("checkout_date")
                        @ExcludeMissing
                        fun checkoutDate(checkoutDate: JsonField<LocalDate>) = apply {
                            this.checkoutDate = checkoutDate
                        }

                        /** Daily rate being charged for the vehicle. */
                        fun dailyRentalRateAmount(dailyRentalRateAmount: Long) =
                            dailyRentalRateAmount(JsonField.of(dailyRentalRateAmount))

                        /** Daily rate being charged for the vehicle. */
                        @JsonProperty("daily_rental_rate_amount")
                        @ExcludeMissing
                        fun dailyRentalRateAmount(dailyRentalRateAmount: JsonField<Long>) = apply {
                            this.dailyRentalRateAmount = dailyRentalRateAmount
                        }

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the daily
                         * rental rate.
                         */
                        fun dailyRentalRateCurrency(dailyRentalRateCurrency: String) =
                            dailyRentalRateCurrency(JsonField.of(dailyRentalRateCurrency))

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the daily
                         * rental rate.
                         */
                        @JsonProperty("daily_rental_rate_currency")
                        @ExcludeMissing
                        fun dailyRentalRateCurrency(dailyRentalRateCurrency: JsonField<String>) =
                            apply {
                                this.dailyRentalRateCurrency = dailyRentalRateCurrency
                            }

                        /** Number of days the vehicle was rented. */
                        fun daysRented(daysRented: Long) = daysRented(JsonField.of(daysRented))

                        /** Number of days the vehicle was rented. */
                        @JsonProperty("days_rented")
                        @ExcludeMissing
                        fun daysRented(daysRented: JsonField<Long>) = apply {
                            this.daysRented = daysRented
                        }

                        /** Additional charges (gas, late fee, etc.) being billed. */
                        fun extraCharges(extraCharges: ExtraCharges) =
                            extraCharges(JsonField.of(extraCharges))

                        /** Additional charges (gas, late fee, etc.) being billed. */
                        @JsonProperty("extra_charges")
                        @ExcludeMissing
                        fun extraCharges(extraCharges: JsonField<ExtraCharges>) = apply {
                            this.extraCharges = extraCharges
                        }

                        /** Fuel charges for the vehicle. */
                        fun fuelChargesAmount(fuelChargesAmount: Long) =
                            fuelChargesAmount(JsonField.of(fuelChargesAmount))

                        /** Fuel charges for the vehicle. */
                        @JsonProperty("fuel_charges_amount")
                        @ExcludeMissing
                        fun fuelChargesAmount(fuelChargesAmount: JsonField<Long>) = apply {
                            this.fuelChargesAmount = fuelChargesAmount
                        }

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the fuel
                         * charges assessed.
                         */
                        fun fuelChargesCurrency(fuelChargesCurrency: String) =
                            fuelChargesCurrency(JsonField.of(fuelChargesCurrency))

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the fuel
                         * charges assessed.
                         */
                        @JsonProperty("fuel_charges_currency")
                        @ExcludeMissing
                        fun fuelChargesCurrency(fuelChargesCurrency: JsonField<String>) = apply {
                            this.fuelChargesCurrency = fuelChargesCurrency
                        }

                        /** Any insurance being charged for the vehicle. */
                        fun insuranceChargesAmount(insuranceChargesAmount: Long) =
                            insuranceChargesAmount(JsonField.of(insuranceChargesAmount))

                        /** Any insurance being charged for the vehicle. */
                        @JsonProperty("insurance_charges_amount")
                        @ExcludeMissing
                        fun insuranceChargesAmount(insuranceChargesAmount: JsonField<Long>) =
                            apply {
                                this.insuranceChargesAmount = insuranceChargesAmount
                            }

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                         * insurance charges assessed.
                         */
                        fun insuranceChargesCurrency(insuranceChargesCurrency: String) =
                            insuranceChargesCurrency(JsonField.of(insuranceChargesCurrency))

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                         * insurance charges assessed.
                         */
                        @JsonProperty("insurance_charges_currency")
                        @ExcludeMissing
                        fun insuranceChargesCurrency(insuranceChargesCurrency: JsonField<String>) =
                            apply {
                                this.insuranceChargesCurrency = insuranceChargesCurrency
                            }

                        /**
                         * An indicator that the cardholder is being billed for a reserved vehicle
                         * that was not actually rented (that is, a "no-show" charge).
                         */
                        fun noShowIndicator(noShowIndicator: NoShowIndicator) =
                            noShowIndicator(JsonField.of(noShowIndicator))

                        /**
                         * An indicator that the cardholder is being billed for a reserved vehicle
                         * that was not actually rented (that is, a "no-show" charge).
                         */
                        @JsonProperty("no_show_indicator")
                        @ExcludeMissing
                        fun noShowIndicator(noShowIndicator: JsonField<NoShowIndicator>) = apply {
                            this.noShowIndicator = noShowIndicator
                        }

                        /**
                         * Charges for returning the vehicle at a different location than where it
                         * was picked up.
                         */
                        fun oneWayDropOffChargesAmount(oneWayDropOffChargesAmount: Long) =
                            oneWayDropOffChargesAmount(JsonField.of(oneWayDropOffChargesAmount))

                        /**
                         * Charges for returning the vehicle at a different location than where it
                         * was picked up.
                         */
                        @JsonProperty("one_way_drop_off_charges_amount")
                        @ExcludeMissing
                        fun oneWayDropOffChargesAmount(
                            oneWayDropOffChargesAmount: JsonField<Long>
                        ) = apply { this.oneWayDropOffChargesAmount = oneWayDropOffChargesAmount }

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                         * one-way drop-off charges assessed.
                         */
                        fun oneWayDropOffChargesCurrency(oneWayDropOffChargesCurrency: String) =
                            oneWayDropOffChargesCurrency(JsonField.of(oneWayDropOffChargesCurrency))

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                         * one-way drop-off charges assessed.
                         */
                        @JsonProperty("one_way_drop_off_charges_currency")
                        @ExcludeMissing
                        fun oneWayDropOffChargesCurrency(
                            oneWayDropOffChargesCurrency: JsonField<String>
                        ) = apply {
                            this.oneWayDropOffChargesCurrency = oneWayDropOffChargesCurrency
                        }

                        /** Name of the person renting the vehicle. */
                        fun renterName(renterName: String) = renterName(JsonField.of(renterName))

                        /** Name of the person renting the vehicle. */
                        @JsonProperty("renter_name")
                        @ExcludeMissing
                        fun renterName(renterName: JsonField<String>) = apply {
                            this.renterName = renterName
                        }

                        /** Weekly rate being charged for the vehicle. */
                        fun weeklyRentalRateAmount(weeklyRentalRateAmount: Long) =
                            weeklyRentalRateAmount(JsonField.of(weeklyRentalRateAmount))

                        /** Weekly rate being charged for the vehicle. */
                        @JsonProperty("weekly_rental_rate_amount")
                        @ExcludeMissing
                        fun weeklyRentalRateAmount(weeklyRentalRateAmount: JsonField<Long>) =
                            apply {
                                this.weeklyRentalRateAmount = weeklyRentalRateAmount
                            }

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                         * weekly rental rate.
                         */
                        fun weeklyRentalRateCurrency(weeklyRentalRateCurrency: String) =
                            weeklyRentalRateCurrency(JsonField.of(weeklyRentalRateCurrency))

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                         * weekly rental rate.
                         */
                        @JsonProperty("weekly_rental_rate_currency")
                        @ExcludeMissing
                        fun weeklyRentalRateCurrency(weeklyRentalRateCurrency: JsonField<String>) =
                            apply {
                                this.weeklyRentalRateCurrency = weeklyRentalRateCurrency
                            }

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

                        fun build(): CarRental =
                            CarRental(
                                carClassCode,
                                checkoutDate,
                                dailyRentalRateAmount,
                                dailyRentalRateCurrency,
                                daysRented,
                                extraCharges,
                                fuelChargesAmount,
                                fuelChargesCurrency,
                                insuranceChargesAmount,
                                insuranceChargesCurrency,
                                noShowIndicator,
                                oneWayDropOffChargesAmount,
                                oneWayDropOffChargesCurrency,
                                renterName,
                                weeklyRentalRateAmount,
                                weeklyRentalRateCurrency,
                                additionalProperties.toUnmodifiable(),
                            )
                    }

                    class ExtraCharges
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

                            return other is ExtraCharges && this.value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()

                        companion object {

                            @JvmField
                            val NO_EXTRA_CHARGE = ExtraCharges(JsonField.of("no_extra_charge"))

                            @JvmField val GAS = ExtraCharges(JsonField.of("gas"))

                            @JvmField
                            val EXTRA_MILEAGE = ExtraCharges(JsonField.of("extra_mileage"))

                            @JvmField val LATE_RETURN = ExtraCharges(JsonField.of("late_return"))

                            @JvmField
                            val ONE_WAY_SERVICE_FEE =
                                ExtraCharges(JsonField.of("one_way_service_fee"))

                            @JvmField
                            val PARKING_VIOLATION = ExtraCharges(JsonField.of("parking_violation"))

                            @JvmStatic fun of(value: String) = ExtraCharges(JsonField.of(value))
                        }

                        enum class Known {
                            NO_EXTRA_CHARGE,
                            GAS,
                            EXTRA_MILEAGE,
                            LATE_RETURN,
                            ONE_WAY_SERVICE_FEE,
                            PARKING_VIOLATION,
                        }

                        enum class Value {
                            NO_EXTRA_CHARGE,
                            GAS,
                            EXTRA_MILEAGE,
                            LATE_RETURN,
                            ONE_WAY_SERVICE_FEE,
                            PARKING_VIOLATION,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                NO_EXTRA_CHARGE -> Value.NO_EXTRA_CHARGE
                                GAS -> Value.GAS
                                EXTRA_MILEAGE -> Value.EXTRA_MILEAGE
                                LATE_RETURN -> Value.LATE_RETURN
                                ONE_WAY_SERVICE_FEE -> Value.ONE_WAY_SERVICE_FEE
                                PARKING_VIOLATION -> Value.PARKING_VIOLATION
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                NO_EXTRA_CHARGE -> Known.NO_EXTRA_CHARGE
                                GAS -> Known.GAS
                                EXTRA_MILEAGE -> Known.EXTRA_MILEAGE
                                LATE_RETURN -> Known.LATE_RETURN
                                ONE_WAY_SERVICE_FEE -> Known.ONE_WAY_SERVICE_FEE
                                PARKING_VIOLATION -> Known.PARKING_VIOLATION
                                else ->
                                    throw IncreaseInvalidDataException(
                                        "Unknown ExtraCharges: $value"
                                    )
                            }

                        fun asString(): String = _value().asStringOrThrow()
                    }

                    class NoShowIndicator
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

                            return other is NoShowIndicator && this.value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()

                        companion object {

                            @JvmField
                            val NOT_APPLICABLE = NoShowIndicator(JsonField.of("not_applicable"))

                            @JvmField
                            val NO_SHOW_FOR_SPECIALIZED_VEHICLE =
                                NoShowIndicator(JsonField.of("no_show_for_specialized_vehicle"))

                            @JvmStatic fun of(value: String) = NoShowIndicator(JsonField.of(value))
                        }

                        enum class Known {
                            NOT_APPLICABLE,
                            NO_SHOW_FOR_SPECIALIZED_VEHICLE,
                        }

                        enum class Value {
                            NOT_APPLICABLE,
                            NO_SHOW_FOR_SPECIALIZED_VEHICLE,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                NOT_APPLICABLE -> Value.NOT_APPLICABLE
                                NO_SHOW_FOR_SPECIALIZED_VEHICLE ->
                                    Value.NO_SHOW_FOR_SPECIALIZED_VEHICLE
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                NOT_APPLICABLE -> Known.NOT_APPLICABLE
                                NO_SHOW_FOR_SPECIALIZED_VEHICLE ->
                                    Known.NO_SHOW_FOR_SPECIALIZED_VEHICLE
                                else ->
                                    throw IncreaseInvalidDataException(
                                        "Unknown NoShowIndicator: $value"
                                    )
                            }

                        fun asString(): String = _value().asStringOrThrow()
                    }
                }

                /** Fields specific to lodging. */
                @JsonDeserialize(builder = Lodging.Builder::class)
                @NoAutoDetect
                class Lodging
                private constructor(
                    private val checkInDate: JsonField<LocalDate>,
                    private val dailyRoomRateAmount: JsonField<Long>,
                    private val dailyRoomRateCurrency: JsonField<String>,
                    private val extraCharges: JsonField<ExtraCharges>,
                    private val folioCashAdvancesAmount: JsonField<Long>,
                    private val folioCashAdvancesCurrency: JsonField<String>,
                    private val foodBeverageChargesAmount: JsonField<Long>,
                    private val foodBeverageChargesCurrency: JsonField<String>,
                    private val noShowIndicator: JsonField<NoShowIndicator>,
                    private val prepaidExpensesAmount: JsonField<Long>,
                    private val prepaidExpensesCurrency: JsonField<String>,
                    private val roomNights: JsonField<Long>,
                    private val totalRoomTaxAmount: JsonField<Long>,
                    private val totalRoomTaxCurrency: JsonField<String>,
                    private val totalTaxAmount: JsonField<Long>,
                    private val totalTaxCurrency: JsonField<String>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    /** Date the customer checked in. */
                    fun checkInDate(): Optional<LocalDate> =
                        Optional.ofNullable(checkInDate.getNullable("check_in_date"))

                    /** Daily rate being charged for the room. */
                    fun dailyRoomRateAmount(): Optional<Long> =
                        Optional.ofNullable(
                            dailyRoomRateAmount.getNullable("daily_room_rate_amount")
                        )

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the daily
                     * room rate.
                     */
                    fun dailyRoomRateCurrency(): Optional<String> =
                        Optional.ofNullable(
                            dailyRoomRateCurrency.getNullable("daily_room_rate_currency")
                        )

                    /** Additional charges (phone, late check-out, etc.) being billed. */
                    fun extraCharges(): Optional<ExtraCharges> =
                        Optional.ofNullable(extraCharges.getNullable("extra_charges"))

                    /** Folio cash advances for the room. */
                    fun folioCashAdvancesAmount(): Optional<Long> =
                        Optional.ofNullable(
                            folioCashAdvancesAmount.getNullable("folio_cash_advances_amount")
                        )

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the folio
                     * cash advances.
                     */
                    fun folioCashAdvancesCurrency(): Optional<String> =
                        Optional.ofNullable(
                            folioCashAdvancesCurrency.getNullable("folio_cash_advances_currency")
                        )

                    /** Food and beverage charges for the room. */
                    fun foodBeverageChargesAmount(): Optional<Long> =
                        Optional.ofNullable(
                            foodBeverageChargesAmount.getNullable("food_beverage_charges_amount")
                        )

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the food and
                     * beverage charges.
                     */
                    fun foodBeverageChargesCurrency(): Optional<String> =
                        Optional.ofNullable(
                            foodBeverageChargesCurrency.getNullable(
                                "food_beverage_charges_currency"
                            )
                        )

                    /**
                     * Indicator that the cardholder is being billed for a reserved room that was
                     * not actually used.
                     */
                    fun noShowIndicator(): Optional<NoShowIndicator> =
                        Optional.ofNullable(noShowIndicator.getNullable("no_show_indicator"))

                    /** Prepaid expenses being charged for the room. */
                    fun prepaidExpensesAmount(): Optional<Long> =
                        Optional.ofNullable(
                            prepaidExpensesAmount.getNullable("prepaid_expenses_amount")
                        )

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the prepaid
                     * expenses.
                     */
                    fun prepaidExpensesCurrency(): Optional<String> =
                        Optional.ofNullable(
                            prepaidExpensesCurrency.getNullable("prepaid_expenses_currency")
                        )

                    /** Number of nights the room was rented. */
                    fun roomNights(): Optional<Long> =
                        Optional.ofNullable(roomNights.getNullable("room_nights"))

                    /** Total room tax being charged. */
                    fun totalRoomTaxAmount(): Optional<Long> =
                        Optional.ofNullable(totalRoomTaxAmount.getNullable("total_room_tax_amount"))

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the total
                     * room tax.
                     */
                    fun totalRoomTaxCurrency(): Optional<String> =
                        Optional.ofNullable(
                            totalRoomTaxCurrency.getNullable("total_room_tax_currency")
                        )

                    /** Total tax being charged for the room. */
                    fun totalTaxAmount(): Optional<Long> =
                        Optional.ofNullable(totalTaxAmount.getNullable("total_tax_amount"))

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the total tax
                     * assessed.
                     */
                    fun totalTaxCurrency(): Optional<String> =
                        Optional.ofNullable(totalTaxCurrency.getNullable("total_tax_currency"))

                    /** Date the customer checked in. */
                    @JsonProperty("check_in_date") @ExcludeMissing fun _checkInDate() = checkInDate

                    /** Daily rate being charged for the room. */
                    @JsonProperty("daily_room_rate_amount")
                    @ExcludeMissing
                    fun _dailyRoomRateAmount() = dailyRoomRateAmount

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the daily
                     * room rate.
                     */
                    @JsonProperty("daily_room_rate_currency")
                    @ExcludeMissing
                    fun _dailyRoomRateCurrency() = dailyRoomRateCurrency

                    /** Additional charges (phone, late check-out, etc.) being billed. */
                    @JsonProperty("extra_charges")
                    @ExcludeMissing
                    fun _extraCharges() = extraCharges

                    /** Folio cash advances for the room. */
                    @JsonProperty("folio_cash_advances_amount")
                    @ExcludeMissing
                    fun _folioCashAdvancesAmount() = folioCashAdvancesAmount

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the folio
                     * cash advances.
                     */
                    @JsonProperty("folio_cash_advances_currency")
                    @ExcludeMissing
                    fun _folioCashAdvancesCurrency() = folioCashAdvancesCurrency

                    /** Food and beverage charges for the room. */
                    @JsonProperty("food_beverage_charges_amount")
                    @ExcludeMissing
                    fun _foodBeverageChargesAmount() = foodBeverageChargesAmount

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the food and
                     * beverage charges.
                     */
                    @JsonProperty("food_beverage_charges_currency")
                    @ExcludeMissing
                    fun _foodBeverageChargesCurrency() = foodBeverageChargesCurrency

                    /**
                     * Indicator that the cardholder is being billed for a reserved room that was
                     * not actually used.
                     */
                    @JsonProperty("no_show_indicator")
                    @ExcludeMissing
                    fun _noShowIndicator() = noShowIndicator

                    /** Prepaid expenses being charged for the room. */
                    @JsonProperty("prepaid_expenses_amount")
                    @ExcludeMissing
                    fun _prepaidExpensesAmount() = prepaidExpensesAmount

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the prepaid
                     * expenses.
                     */
                    @JsonProperty("prepaid_expenses_currency")
                    @ExcludeMissing
                    fun _prepaidExpensesCurrency() = prepaidExpensesCurrency

                    /** Number of nights the room was rented. */
                    @JsonProperty("room_nights") @ExcludeMissing fun _roomNights() = roomNights

                    /** Total room tax being charged. */
                    @JsonProperty("total_room_tax_amount")
                    @ExcludeMissing
                    fun _totalRoomTaxAmount() = totalRoomTaxAmount

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the total
                     * room tax.
                     */
                    @JsonProperty("total_room_tax_currency")
                    @ExcludeMissing
                    fun _totalRoomTaxCurrency() = totalRoomTaxCurrency

                    /** Total tax being charged for the room. */
                    @JsonProperty("total_tax_amount")
                    @ExcludeMissing
                    fun _totalTaxAmount() = totalTaxAmount

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the total tax
                     * assessed.
                     */
                    @JsonProperty("total_tax_currency")
                    @ExcludeMissing
                    fun _totalTaxCurrency() = totalTaxCurrency

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): Lodging = apply {
                        if (!validated) {
                            checkInDate()
                            dailyRoomRateAmount()
                            dailyRoomRateCurrency()
                            extraCharges()
                            folioCashAdvancesAmount()
                            folioCashAdvancesCurrency()
                            foodBeverageChargesAmount()
                            foodBeverageChargesCurrency()
                            noShowIndicator()
                            prepaidExpensesAmount()
                            prepaidExpensesCurrency()
                            roomNights()
                            totalRoomTaxAmount()
                            totalRoomTaxCurrency()
                            totalTaxAmount()
                            totalTaxCurrency()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Lodging &&
                            this.checkInDate == other.checkInDate &&
                            this.dailyRoomRateAmount == other.dailyRoomRateAmount &&
                            this.dailyRoomRateCurrency == other.dailyRoomRateCurrency &&
                            this.extraCharges == other.extraCharges &&
                            this.folioCashAdvancesAmount == other.folioCashAdvancesAmount &&
                            this.folioCashAdvancesCurrency == other.folioCashAdvancesCurrency &&
                            this.foodBeverageChargesAmount == other.foodBeverageChargesAmount &&
                            this.foodBeverageChargesCurrency == other.foodBeverageChargesCurrency &&
                            this.noShowIndicator == other.noShowIndicator &&
                            this.prepaidExpensesAmount == other.prepaidExpensesAmount &&
                            this.prepaidExpensesCurrency == other.prepaidExpensesCurrency &&
                            this.roomNights == other.roomNights &&
                            this.totalRoomTaxAmount == other.totalRoomTaxAmount &&
                            this.totalRoomTaxCurrency == other.totalRoomTaxCurrency &&
                            this.totalTaxAmount == other.totalTaxAmount &&
                            this.totalTaxCurrency == other.totalTaxCurrency &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode =
                                Objects.hash(
                                    checkInDate,
                                    dailyRoomRateAmount,
                                    dailyRoomRateCurrency,
                                    extraCharges,
                                    folioCashAdvancesAmount,
                                    folioCashAdvancesCurrency,
                                    foodBeverageChargesAmount,
                                    foodBeverageChargesCurrency,
                                    noShowIndicator,
                                    prepaidExpensesAmount,
                                    prepaidExpensesCurrency,
                                    roomNights,
                                    totalRoomTaxAmount,
                                    totalRoomTaxCurrency,
                                    totalTaxAmount,
                                    totalTaxCurrency,
                                    additionalProperties,
                                )
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "Lodging{checkInDate=$checkInDate, dailyRoomRateAmount=$dailyRoomRateAmount, dailyRoomRateCurrency=$dailyRoomRateCurrency, extraCharges=$extraCharges, folioCashAdvancesAmount=$folioCashAdvancesAmount, folioCashAdvancesCurrency=$folioCashAdvancesCurrency, foodBeverageChargesAmount=$foodBeverageChargesAmount, foodBeverageChargesCurrency=$foodBeverageChargesCurrency, noShowIndicator=$noShowIndicator, prepaidExpensesAmount=$prepaidExpensesAmount, prepaidExpensesCurrency=$prepaidExpensesCurrency, roomNights=$roomNights, totalRoomTaxAmount=$totalRoomTaxAmount, totalRoomTaxCurrency=$totalRoomTaxCurrency, totalTaxAmount=$totalTaxAmount, totalTaxCurrency=$totalTaxCurrency, additionalProperties=$additionalProperties}"

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var checkInDate: JsonField<LocalDate> = JsonMissing.of()
                        private var dailyRoomRateAmount: JsonField<Long> = JsonMissing.of()
                        private var dailyRoomRateCurrency: JsonField<String> = JsonMissing.of()
                        private var extraCharges: JsonField<ExtraCharges> = JsonMissing.of()
                        private var folioCashAdvancesAmount: JsonField<Long> = JsonMissing.of()
                        private var folioCashAdvancesCurrency: JsonField<String> = JsonMissing.of()
                        private var foodBeverageChargesAmount: JsonField<Long> = JsonMissing.of()
                        private var foodBeverageChargesCurrency: JsonField<String> =
                            JsonMissing.of()
                        private var noShowIndicator: JsonField<NoShowIndicator> = JsonMissing.of()
                        private var prepaidExpensesAmount: JsonField<Long> = JsonMissing.of()
                        private var prepaidExpensesCurrency: JsonField<String> = JsonMissing.of()
                        private var roomNights: JsonField<Long> = JsonMissing.of()
                        private var totalRoomTaxAmount: JsonField<Long> = JsonMissing.of()
                        private var totalRoomTaxCurrency: JsonField<String> = JsonMissing.of()
                        private var totalTaxAmount: JsonField<Long> = JsonMissing.of()
                        private var totalTaxCurrency: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(lodging: Lodging) = apply {
                            this.checkInDate = lodging.checkInDate
                            this.dailyRoomRateAmount = lodging.dailyRoomRateAmount
                            this.dailyRoomRateCurrency = lodging.dailyRoomRateCurrency
                            this.extraCharges = lodging.extraCharges
                            this.folioCashAdvancesAmount = lodging.folioCashAdvancesAmount
                            this.folioCashAdvancesCurrency = lodging.folioCashAdvancesCurrency
                            this.foodBeverageChargesAmount = lodging.foodBeverageChargesAmount
                            this.foodBeverageChargesCurrency = lodging.foodBeverageChargesCurrency
                            this.noShowIndicator = lodging.noShowIndicator
                            this.prepaidExpensesAmount = lodging.prepaidExpensesAmount
                            this.prepaidExpensesCurrency = lodging.prepaidExpensesCurrency
                            this.roomNights = lodging.roomNights
                            this.totalRoomTaxAmount = lodging.totalRoomTaxAmount
                            this.totalRoomTaxCurrency = lodging.totalRoomTaxCurrency
                            this.totalTaxAmount = lodging.totalTaxAmount
                            this.totalTaxCurrency = lodging.totalTaxCurrency
                            additionalProperties(lodging.additionalProperties)
                        }

                        /** Date the customer checked in. */
                        fun checkInDate(checkInDate: LocalDate) =
                            checkInDate(JsonField.of(checkInDate))

                        /** Date the customer checked in. */
                        @JsonProperty("check_in_date")
                        @ExcludeMissing
                        fun checkInDate(checkInDate: JsonField<LocalDate>) = apply {
                            this.checkInDate = checkInDate
                        }

                        /** Daily rate being charged for the room. */
                        fun dailyRoomRateAmount(dailyRoomRateAmount: Long) =
                            dailyRoomRateAmount(JsonField.of(dailyRoomRateAmount))

                        /** Daily rate being charged for the room. */
                        @JsonProperty("daily_room_rate_amount")
                        @ExcludeMissing
                        fun dailyRoomRateAmount(dailyRoomRateAmount: JsonField<Long>) = apply {
                            this.dailyRoomRateAmount = dailyRoomRateAmount
                        }

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the daily
                         * room rate.
                         */
                        fun dailyRoomRateCurrency(dailyRoomRateCurrency: String) =
                            dailyRoomRateCurrency(JsonField.of(dailyRoomRateCurrency))

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the daily
                         * room rate.
                         */
                        @JsonProperty("daily_room_rate_currency")
                        @ExcludeMissing
                        fun dailyRoomRateCurrency(dailyRoomRateCurrency: JsonField<String>) =
                            apply {
                                this.dailyRoomRateCurrency = dailyRoomRateCurrency
                            }

                        /** Additional charges (phone, late check-out, etc.) being billed. */
                        fun extraCharges(extraCharges: ExtraCharges) =
                            extraCharges(JsonField.of(extraCharges))

                        /** Additional charges (phone, late check-out, etc.) being billed. */
                        @JsonProperty("extra_charges")
                        @ExcludeMissing
                        fun extraCharges(extraCharges: JsonField<ExtraCharges>) = apply {
                            this.extraCharges = extraCharges
                        }

                        /** Folio cash advances for the room. */
                        fun folioCashAdvancesAmount(folioCashAdvancesAmount: Long) =
                            folioCashAdvancesAmount(JsonField.of(folioCashAdvancesAmount))

                        /** Folio cash advances for the room. */
                        @JsonProperty("folio_cash_advances_amount")
                        @ExcludeMissing
                        fun folioCashAdvancesAmount(folioCashAdvancesAmount: JsonField<Long>) =
                            apply {
                                this.folioCashAdvancesAmount = folioCashAdvancesAmount
                            }

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the folio
                         * cash advances.
                         */
                        fun folioCashAdvancesCurrency(folioCashAdvancesCurrency: String) =
                            folioCashAdvancesCurrency(JsonField.of(folioCashAdvancesCurrency))

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the folio
                         * cash advances.
                         */
                        @JsonProperty("folio_cash_advances_currency")
                        @ExcludeMissing
                        fun folioCashAdvancesCurrency(
                            folioCashAdvancesCurrency: JsonField<String>
                        ) = apply { this.folioCashAdvancesCurrency = folioCashAdvancesCurrency }

                        /** Food and beverage charges for the room. */
                        fun foodBeverageChargesAmount(foodBeverageChargesAmount: Long) =
                            foodBeverageChargesAmount(JsonField.of(foodBeverageChargesAmount))

                        /** Food and beverage charges for the room. */
                        @JsonProperty("food_beverage_charges_amount")
                        @ExcludeMissing
                        fun foodBeverageChargesAmount(foodBeverageChargesAmount: JsonField<Long>) =
                            apply {
                                this.foodBeverageChargesAmount = foodBeverageChargesAmount
                            }

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the food
                         * and beverage charges.
                         */
                        fun foodBeverageChargesCurrency(foodBeverageChargesCurrency: String) =
                            foodBeverageChargesCurrency(JsonField.of(foodBeverageChargesCurrency))

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the food
                         * and beverage charges.
                         */
                        @JsonProperty("food_beverage_charges_currency")
                        @ExcludeMissing
                        fun foodBeverageChargesCurrency(
                            foodBeverageChargesCurrency: JsonField<String>
                        ) = apply { this.foodBeverageChargesCurrency = foodBeverageChargesCurrency }

                        /**
                         * Indicator that the cardholder is being billed for a reserved room that
                         * was not actually used.
                         */
                        fun noShowIndicator(noShowIndicator: NoShowIndicator) =
                            noShowIndicator(JsonField.of(noShowIndicator))

                        /**
                         * Indicator that the cardholder is being billed for a reserved room that
                         * was not actually used.
                         */
                        @JsonProperty("no_show_indicator")
                        @ExcludeMissing
                        fun noShowIndicator(noShowIndicator: JsonField<NoShowIndicator>) = apply {
                            this.noShowIndicator = noShowIndicator
                        }

                        /** Prepaid expenses being charged for the room. */
                        fun prepaidExpensesAmount(prepaidExpensesAmount: Long) =
                            prepaidExpensesAmount(JsonField.of(prepaidExpensesAmount))

                        /** Prepaid expenses being charged for the room. */
                        @JsonProperty("prepaid_expenses_amount")
                        @ExcludeMissing
                        fun prepaidExpensesAmount(prepaidExpensesAmount: JsonField<Long>) = apply {
                            this.prepaidExpensesAmount = prepaidExpensesAmount
                        }

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                         * prepaid expenses.
                         */
                        fun prepaidExpensesCurrency(prepaidExpensesCurrency: String) =
                            prepaidExpensesCurrency(JsonField.of(prepaidExpensesCurrency))

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                         * prepaid expenses.
                         */
                        @JsonProperty("prepaid_expenses_currency")
                        @ExcludeMissing
                        fun prepaidExpensesCurrency(prepaidExpensesCurrency: JsonField<String>) =
                            apply {
                                this.prepaidExpensesCurrency = prepaidExpensesCurrency
                            }

                        /** Number of nights the room was rented. */
                        fun roomNights(roomNights: Long) = roomNights(JsonField.of(roomNights))

                        /** Number of nights the room was rented. */
                        @JsonProperty("room_nights")
                        @ExcludeMissing
                        fun roomNights(roomNights: JsonField<Long>) = apply {
                            this.roomNights = roomNights
                        }

                        /** Total room tax being charged. */
                        fun totalRoomTaxAmount(totalRoomTaxAmount: Long) =
                            totalRoomTaxAmount(JsonField.of(totalRoomTaxAmount))

                        /** Total room tax being charged. */
                        @JsonProperty("total_room_tax_amount")
                        @ExcludeMissing
                        fun totalRoomTaxAmount(totalRoomTaxAmount: JsonField<Long>) = apply {
                            this.totalRoomTaxAmount = totalRoomTaxAmount
                        }

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the total
                         * room tax.
                         */
                        fun totalRoomTaxCurrency(totalRoomTaxCurrency: String) =
                            totalRoomTaxCurrency(JsonField.of(totalRoomTaxCurrency))

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the total
                         * room tax.
                         */
                        @JsonProperty("total_room_tax_currency")
                        @ExcludeMissing
                        fun totalRoomTaxCurrency(totalRoomTaxCurrency: JsonField<String>) = apply {
                            this.totalRoomTaxCurrency = totalRoomTaxCurrency
                        }

                        /** Total tax being charged for the room. */
                        fun totalTaxAmount(totalTaxAmount: Long) =
                            totalTaxAmount(JsonField.of(totalTaxAmount))

                        /** Total tax being charged for the room. */
                        @JsonProperty("total_tax_amount")
                        @ExcludeMissing
                        fun totalTaxAmount(totalTaxAmount: JsonField<Long>) = apply {
                            this.totalTaxAmount = totalTaxAmount
                        }

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the total
                         * tax assessed.
                         */
                        fun totalTaxCurrency(totalTaxCurrency: String) =
                            totalTaxCurrency(JsonField.of(totalTaxCurrency))

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the total
                         * tax assessed.
                         */
                        @JsonProperty("total_tax_currency")
                        @ExcludeMissing
                        fun totalTaxCurrency(totalTaxCurrency: JsonField<String>) = apply {
                            this.totalTaxCurrency = totalTaxCurrency
                        }

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

                        fun build(): Lodging =
                            Lodging(
                                checkInDate,
                                dailyRoomRateAmount,
                                dailyRoomRateCurrency,
                                extraCharges,
                                folioCashAdvancesAmount,
                                folioCashAdvancesCurrency,
                                foodBeverageChargesAmount,
                                foodBeverageChargesCurrency,
                                noShowIndicator,
                                prepaidExpensesAmount,
                                prepaidExpensesCurrency,
                                roomNights,
                                totalRoomTaxAmount,
                                totalRoomTaxCurrency,
                                totalTaxAmount,
                                totalTaxCurrency,
                                additionalProperties.toUnmodifiable(),
                            )
                    }

                    class ExtraCharges
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

                            return other is ExtraCharges && this.value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()

                        companion object {

                            @JvmField
                            val NO_EXTRA_CHARGE = ExtraCharges(JsonField.of("no_extra_charge"))

                            @JvmField val RESTAURANT = ExtraCharges(JsonField.of("restaurant"))

                            @JvmField val GIFT_SHOP = ExtraCharges(JsonField.of("gift_shop"))

                            @JvmField val MINI_BAR = ExtraCharges(JsonField.of("mini_bar"))

                            @JvmField val TELEPHONE = ExtraCharges(JsonField.of("telephone"))

                            @JvmField val OTHER = ExtraCharges(JsonField.of("other"))

                            @JvmField val LAUNDRY = ExtraCharges(JsonField.of("laundry"))

                            @JvmStatic fun of(value: String) = ExtraCharges(JsonField.of(value))
                        }

                        enum class Known {
                            NO_EXTRA_CHARGE,
                            RESTAURANT,
                            GIFT_SHOP,
                            MINI_BAR,
                            TELEPHONE,
                            OTHER,
                            LAUNDRY,
                        }

                        enum class Value {
                            NO_EXTRA_CHARGE,
                            RESTAURANT,
                            GIFT_SHOP,
                            MINI_BAR,
                            TELEPHONE,
                            OTHER,
                            LAUNDRY,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                NO_EXTRA_CHARGE -> Value.NO_EXTRA_CHARGE
                                RESTAURANT -> Value.RESTAURANT
                                GIFT_SHOP -> Value.GIFT_SHOP
                                MINI_BAR -> Value.MINI_BAR
                                TELEPHONE -> Value.TELEPHONE
                                OTHER -> Value.OTHER
                                LAUNDRY -> Value.LAUNDRY
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                NO_EXTRA_CHARGE -> Known.NO_EXTRA_CHARGE
                                RESTAURANT -> Known.RESTAURANT
                                GIFT_SHOP -> Known.GIFT_SHOP
                                MINI_BAR -> Known.MINI_BAR
                                TELEPHONE -> Known.TELEPHONE
                                OTHER -> Known.OTHER
                                LAUNDRY -> Known.LAUNDRY
                                else ->
                                    throw IncreaseInvalidDataException(
                                        "Unknown ExtraCharges: $value"
                                    )
                            }

                        fun asString(): String = _value().asStringOrThrow()
                    }

                    class NoShowIndicator
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

                            return other is NoShowIndicator && this.value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()

                        companion object {

                            @JvmField
                            val NOT_APPLICABLE = NoShowIndicator(JsonField.of("not_applicable"))

                            @JvmField val NO_SHOW = NoShowIndicator(JsonField.of("no_show"))

                            @JvmStatic fun of(value: String) = NoShowIndicator(JsonField.of(value))
                        }

                        enum class Known {
                            NOT_APPLICABLE,
                            NO_SHOW,
                        }

                        enum class Value {
                            NOT_APPLICABLE,
                            NO_SHOW,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                NOT_APPLICABLE -> Value.NOT_APPLICABLE
                                NO_SHOW -> Value.NO_SHOW
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                NOT_APPLICABLE -> Known.NOT_APPLICABLE
                                NO_SHOW -> Known.NO_SHOW
                                else ->
                                    throw IncreaseInvalidDataException(
                                        "Unknown NoShowIndicator: $value"
                                    )
                            }

                        fun asString(): String = _value().asStringOrThrow()
                    }
                }

                class PurchaseIdentifierFormat
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

                        return other is PurchaseIdentifierFormat && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        @JvmField
                        val FREE_TEXT = PurchaseIdentifierFormat(JsonField.of("free_text"))

                        @JvmField
                        val ORDER_NUMBER = PurchaseIdentifierFormat(JsonField.of("order_number"))

                        @JvmField
                        val RENTAL_AGREEMENT_NUMBER =
                            PurchaseIdentifierFormat(JsonField.of("rental_agreement_number"))

                        @JvmField
                        val HOTEL_FOLIO_NUMBER =
                            PurchaseIdentifierFormat(JsonField.of("hotel_folio_number"))

                        @JvmField
                        val INVOICE_NUMBER =
                            PurchaseIdentifierFormat(JsonField.of("invoice_number"))

                        @JvmStatic
                        fun of(value: String) = PurchaseIdentifierFormat(JsonField.of(value))
                    }

                    enum class Known {
                        FREE_TEXT,
                        ORDER_NUMBER,
                        RENTAL_AGREEMENT_NUMBER,
                        HOTEL_FOLIO_NUMBER,
                        INVOICE_NUMBER,
                    }

                    enum class Value {
                        FREE_TEXT,
                        ORDER_NUMBER,
                        RENTAL_AGREEMENT_NUMBER,
                        HOTEL_FOLIO_NUMBER,
                        INVOICE_NUMBER,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            FREE_TEXT -> Value.FREE_TEXT
                            ORDER_NUMBER -> Value.ORDER_NUMBER
                            RENTAL_AGREEMENT_NUMBER -> Value.RENTAL_AGREEMENT_NUMBER
                            HOTEL_FOLIO_NUMBER -> Value.HOTEL_FOLIO_NUMBER
                            INVOICE_NUMBER -> Value.INVOICE_NUMBER
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            FREE_TEXT -> Known.FREE_TEXT
                            ORDER_NUMBER -> Known.ORDER_NUMBER
                            RENTAL_AGREEMENT_NUMBER -> Known.RENTAL_AGREEMENT_NUMBER
                            HOTEL_FOLIO_NUMBER -> Known.HOTEL_FOLIO_NUMBER
                            INVOICE_NUMBER -> Known.INVOICE_NUMBER
                            else ->
                                throw IncreaseInvalidDataException(
                                    "Unknown PurchaseIdentifierFormat: $value"
                                )
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }

                /** Fields specific to travel. */
                @JsonDeserialize(builder = Travel.Builder::class)
                @NoAutoDetect
                class Travel
                private constructor(
                    private val ancillary: JsonField<Ancillary>,
                    private val computerizedReservationSystem: JsonField<String>,
                    private val creditReasonIndicator: JsonField<CreditReasonIndicator>,
                    private val departureDate: JsonField<LocalDate>,
                    private val originationCityAirportCode: JsonField<String>,
                    private val passengerName: JsonField<String>,
                    private val restrictedTicketIndicator: JsonField<RestrictedTicketIndicator>,
                    private val ticketChangeIndicator: JsonField<TicketChangeIndicator>,
                    private val ticketNumber: JsonField<String>,
                    private val travelAgencyCode: JsonField<String>,
                    private val travelAgencyName: JsonField<String>,
                    private val tripLegs: JsonField<List<TripLeg>>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    /** Ancillary purchases in addition to the airfare. */
                    fun ancillary(): Optional<Ancillary> =
                        Optional.ofNullable(ancillary.getNullable("ancillary"))

                    /** Indicates the computerized reservation system used to book the ticket. */
                    fun computerizedReservationSystem(): Optional<String> =
                        Optional.ofNullable(
                            computerizedReservationSystem.getNullable(
                                "computerized_reservation_system"
                            )
                        )

                    /** Indicates the reason for a credit to the cardholder. */
                    fun creditReasonIndicator(): Optional<CreditReasonIndicator> =
                        Optional.ofNullable(
                            creditReasonIndicator.getNullable("credit_reason_indicator")
                        )

                    /** Date of departure. */
                    fun departureDate(): Optional<LocalDate> =
                        Optional.ofNullable(departureDate.getNullable("departure_date"))

                    /** Code for the originating city or airport. */
                    fun originationCityAirportCode(): Optional<String> =
                        Optional.ofNullable(
                            originationCityAirportCode.getNullable("origination_city_airport_code")
                        )

                    /** Name of the passenger. */
                    fun passengerName(): Optional<String> =
                        Optional.ofNullable(passengerName.getNullable("passenger_name"))

                    /** Indicates whether this ticket is non-refundable. */
                    fun restrictedTicketIndicator(): Optional<RestrictedTicketIndicator> =
                        Optional.ofNullable(
                            restrictedTicketIndicator.getNullable("restricted_ticket_indicator")
                        )

                    /** Indicates why a ticket was changed. */
                    fun ticketChangeIndicator(): Optional<TicketChangeIndicator> =
                        Optional.ofNullable(
                            ticketChangeIndicator.getNullable("ticket_change_indicator")
                        )

                    /** Ticket number. */
                    fun ticketNumber(): Optional<String> =
                        Optional.ofNullable(ticketNumber.getNullable("ticket_number"))

                    /** Code for the travel agency if the ticket was issued by a travel agency. */
                    fun travelAgencyCode(): Optional<String> =
                        Optional.ofNullable(travelAgencyCode.getNullable("travel_agency_code"))

                    /** Name of the travel agency if the ticket was issued by a travel agency. */
                    fun travelAgencyName(): Optional<String> =
                        Optional.ofNullable(travelAgencyName.getNullable("travel_agency_name"))

                    /** Fields specific to each leg of the journey. */
                    fun tripLegs(): Optional<List<TripLeg>> =
                        Optional.ofNullable(tripLegs.getNullable("trip_legs"))

                    /** Ancillary purchases in addition to the airfare. */
                    @JsonProperty("ancillary") @ExcludeMissing fun _ancillary() = ancillary

                    /** Indicates the computerized reservation system used to book the ticket. */
                    @JsonProperty("computerized_reservation_system")
                    @ExcludeMissing
                    fun _computerizedReservationSystem() = computerizedReservationSystem

                    /** Indicates the reason for a credit to the cardholder. */
                    @JsonProperty("credit_reason_indicator")
                    @ExcludeMissing
                    fun _creditReasonIndicator() = creditReasonIndicator

                    /** Date of departure. */
                    @JsonProperty("departure_date")
                    @ExcludeMissing
                    fun _departureDate() = departureDate

                    /** Code for the originating city or airport. */
                    @JsonProperty("origination_city_airport_code")
                    @ExcludeMissing
                    fun _originationCityAirportCode() = originationCityAirportCode

                    /** Name of the passenger. */
                    @JsonProperty("passenger_name")
                    @ExcludeMissing
                    fun _passengerName() = passengerName

                    /** Indicates whether this ticket is non-refundable. */
                    @JsonProperty("restricted_ticket_indicator")
                    @ExcludeMissing
                    fun _restrictedTicketIndicator() = restrictedTicketIndicator

                    /** Indicates why a ticket was changed. */
                    @JsonProperty("ticket_change_indicator")
                    @ExcludeMissing
                    fun _ticketChangeIndicator() = ticketChangeIndicator

                    /** Ticket number. */
                    @JsonProperty("ticket_number")
                    @ExcludeMissing
                    fun _ticketNumber() = ticketNumber

                    /** Code for the travel agency if the ticket was issued by a travel agency. */
                    @JsonProperty("travel_agency_code")
                    @ExcludeMissing
                    fun _travelAgencyCode() = travelAgencyCode

                    /** Name of the travel agency if the ticket was issued by a travel agency. */
                    @JsonProperty("travel_agency_name")
                    @ExcludeMissing
                    fun _travelAgencyName() = travelAgencyName

                    /** Fields specific to each leg of the journey. */
                    @JsonProperty("trip_legs") @ExcludeMissing fun _tripLegs() = tripLegs

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): Travel = apply {
                        if (!validated) {
                            ancillary().map { it.validate() }
                            computerizedReservationSystem()
                            creditReasonIndicator()
                            departureDate()
                            originationCityAirportCode()
                            passengerName()
                            restrictedTicketIndicator()
                            ticketChangeIndicator()
                            ticketNumber()
                            travelAgencyCode()
                            travelAgencyName()
                            tripLegs().map { it.forEach { it.validate() } }
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Travel &&
                            this.ancillary == other.ancillary &&
                            this.computerizedReservationSystem ==
                                other.computerizedReservationSystem &&
                            this.creditReasonIndicator == other.creditReasonIndicator &&
                            this.departureDate == other.departureDate &&
                            this.originationCityAirportCode == other.originationCityAirportCode &&
                            this.passengerName == other.passengerName &&
                            this.restrictedTicketIndicator == other.restrictedTicketIndicator &&
                            this.ticketChangeIndicator == other.ticketChangeIndicator &&
                            this.ticketNumber == other.ticketNumber &&
                            this.travelAgencyCode == other.travelAgencyCode &&
                            this.travelAgencyName == other.travelAgencyName &&
                            this.tripLegs == other.tripLegs &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode =
                                Objects.hash(
                                    ancillary,
                                    computerizedReservationSystem,
                                    creditReasonIndicator,
                                    departureDate,
                                    originationCityAirportCode,
                                    passengerName,
                                    restrictedTicketIndicator,
                                    ticketChangeIndicator,
                                    ticketNumber,
                                    travelAgencyCode,
                                    travelAgencyName,
                                    tripLegs,
                                    additionalProperties,
                                )
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "Travel{ancillary=$ancillary, computerizedReservationSystem=$computerizedReservationSystem, creditReasonIndicator=$creditReasonIndicator, departureDate=$departureDate, originationCityAirportCode=$originationCityAirportCode, passengerName=$passengerName, restrictedTicketIndicator=$restrictedTicketIndicator, ticketChangeIndicator=$ticketChangeIndicator, ticketNumber=$ticketNumber, travelAgencyCode=$travelAgencyCode, travelAgencyName=$travelAgencyName, tripLegs=$tripLegs, additionalProperties=$additionalProperties}"

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var ancillary: JsonField<Ancillary> = JsonMissing.of()
                        private var computerizedReservationSystem: JsonField<String> =
                            JsonMissing.of()
                        private var creditReasonIndicator: JsonField<CreditReasonIndicator> =
                            JsonMissing.of()
                        private var departureDate: JsonField<LocalDate> = JsonMissing.of()
                        private var originationCityAirportCode: JsonField<String> = JsonMissing.of()
                        private var passengerName: JsonField<String> = JsonMissing.of()
                        private var restrictedTicketIndicator:
                            JsonField<RestrictedTicketIndicator> =
                            JsonMissing.of()
                        private var ticketChangeIndicator: JsonField<TicketChangeIndicator> =
                            JsonMissing.of()
                        private var ticketNumber: JsonField<String> = JsonMissing.of()
                        private var travelAgencyCode: JsonField<String> = JsonMissing.of()
                        private var travelAgencyName: JsonField<String> = JsonMissing.of()
                        private var tripLegs: JsonField<List<TripLeg>> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(travel: Travel) = apply {
                            this.ancillary = travel.ancillary
                            this.computerizedReservationSystem =
                                travel.computerizedReservationSystem
                            this.creditReasonIndicator = travel.creditReasonIndicator
                            this.departureDate = travel.departureDate
                            this.originationCityAirportCode = travel.originationCityAirportCode
                            this.passengerName = travel.passengerName
                            this.restrictedTicketIndicator = travel.restrictedTicketIndicator
                            this.ticketChangeIndicator = travel.ticketChangeIndicator
                            this.ticketNumber = travel.ticketNumber
                            this.travelAgencyCode = travel.travelAgencyCode
                            this.travelAgencyName = travel.travelAgencyName
                            this.tripLegs = travel.tripLegs
                            additionalProperties(travel.additionalProperties)
                        }

                        /** Ancillary purchases in addition to the airfare. */
                        fun ancillary(ancillary: Ancillary) = ancillary(JsonField.of(ancillary))

                        /** Ancillary purchases in addition to the airfare. */
                        @JsonProperty("ancillary")
                        @ExcludeMissing
                        fun ancillary(ancillary: JsonField<Ancillary>) = apply {
                            this.ancillary = ancillary
                        }

                        /**
                         * Indicates the computerized reservation system used to book the ticket.
                         */
                        fun computerizedReservationSystem(computerizedReservationSystem: String) =
                            computerizedReservationSystem(
                                JsonField.of(computerizedReservationSystem)
                            )

                        /**
                         * Indicates the computerized reservation system used to book the ticket.
                         */
                        @JsonProperty("computerized_reservation_system")
                        @ExcludeMissing
                        fun computerizedReservationSystem(
                            computerizedReservationSystem: JsonField<String>
                        ) = apply {
                            this.computerizedReservationSystem = computerizedReservationSystem
                        }

                        /** Indicates the reason for a credit to the cardholder. */
                        fun creditReasonIndicator(creditReasonIndicator: CreditReasonIndicator) =
                            creditReasonIndicator(JsonField.of(creditReasonIndicator))

                        /** Indicates the reason for a credit to the cardholder. */
                        @JsonProperty("credit_reason_indicator")
                        @ExcludeMissing
                        fun creditReasonIndicator(
                            creditReasonIndicator: JsonField<CreditReasonIndicator>
                        ) = apply { this.creditReasonIndicator = creditReasonIndicator }

                        /** Date of departure. */
                        fun departureDate(departureDate: LocalDate) =
                            departureDate(JsonField.of(departureDate))

                        /** Date of departure. */
                        @JsonProperty("departure_date")
                        @ExcludeMissing
                        fun departureDate(departureDate: JsonField<LocalDate>) = apply {
                            this.departureDate = departureDate
                        }

                        /** Code for the originating city or airport. */
                        fun originationCityAirportCode(originationCityAirportCode: String) =
                            originationCityAirportCode(JsonField.of(originationCityAirportCode))

                        /** Code for the originating city or airport. */
                        @JsonProperty("origination_city_airport_code")
                        @ExcludeMissing
                        fun originationCityAirportCode(
                            originationCityAirportCode: JsonField<String>
                        ) = apply { this.originationCityAirportCode = originationCityAirportCode }

                        /** Name of the passenger. */
                        fun passengerName(passengerName: String) =
                            passengerName(JsonField.of(passengerName))

                        /** Name of the passenger. */
                        @JsonProperty("passenger_name")
                        @ExcludeMissing
                        fun passengerName(passengerName: JsonField<String>) = apply {
                            this.passengerName = passengerName
                        }

                        /** Indicates whether this ticket is non-refundable. */
                        fun restrictedTicketIndicator(
                            restrictedTicketIndicator: RestrictedTicketIndicator
                        ) = restrictedTicketIndicator(JsonField.of(restrictedTicketIndicator))

                        /** Indicates whether this ticket is non-refundable. */
                        @JsonProperty("restricted_ticket_indicator")
                        @ExcludeMissing
                        fun restrictedTicketIndicator(
                            restrictedTicketIndicator: JsonField<RestrictedTicketIndicator>
                        ) = apply { this.restrictedTicketIndicator = restrictedTicketIndicator }

                        /** Indicates why a ticket was changed. */
                        fun ticketChangeIndicator(ticketChangeIndicator: TicketChangeIndicator) =
                            ticketChangeIndicator(JsonField.of(ticketChangeIndicator))

                        /** Indicates why a ticket was changed. */
                        @JsonProperty("ticket_change_indicator")
                        @ExcludeMissing
                        fun ticketChangeIndicator(
                            ticketChangeIndicator: JsonField<TicketChangeIndicator>
                        ) = apply { this.ticketChangeIndicator = ticketChangeIndicator }

                        /** Ticket number. */
                        fun ticketNumber(ticketNumber: String) =
                            ticketNumber(JsonField.of(ticketNumber))

                        /** Ticket number. */
                        @JsonProperty("ticket_number")
                        @ExcludeMissing
                        fun ticketNumber(ticketNumber: JsonField<String>) = apply {
                            this.ticketNumber = ticketNumber
                        }

                        /**
                         * Code for the travel agency if the ticket was issued by a travel agency.
                         */
                        fun travelAgencyCode(travelAgencyCode: String) =
                            travelAgencyCode(JsonField.of(travelAgencyCode))

                        /**
                         * Code for the travel agency if the ticket was issued by a travel agency.
                         */
                        @JsonProperty("travel_agency_code")
                        @ExcludeMissing
                        fun travelAgencyCode(travelAgencyCode: JsonField<String>) = apply {
                            this.travelAgencyCode = travelAgencyCode
                        }

                        /**
                         * Name of the travel agency if the ticket was issued by a travel agency.
                         */
                        fun travelAgencyName(travelAgencyName: String) =
                            travelAgencyName(JsonField.of(travelAgencyName))

                        /**
                         * Name of the travel agency if the ticket was issued by a travel agency.
                         */
                        @JsonProperty("travel_agency_name")
                        @ExcludeMissing
                        fun travelAgencyName(travelAgencyName: JsonField<String>) = apply {
                            this.travelAgencyName = travelAgencyName
                        }

                        /** Fields specific to each leg of the journey. */
                        fun tripLegs(tripLegs: List<TripLeg>) = tripLegs(JsonField.of(tripLegs))

                        /** Fields specific to each leg of the journey. */
                        @JsonProperty("trip_legs")
                        @ExcludeMissing
                        fun tripLegs(tripLegs: JsonField<List<TripLeg>>) = apply {
                            this.tripLegs = tripLegs
                        }

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

                        fun build(): Travel =
                            Travel(
                                ancillary,
                                computerizedReservationSystem,
                                creditReasonIndicator,
                                departureDate,
                                originationCityAirportCode,
                                passengerName,
                                restrictedTicketIndicator,
                                ticketChangeIndicator,
                                ticketNumber,
                                travelAgencyCode,
                                travelAgencyName,
                                tripLegs.map { it.toUnmodifiable() },
                                additionalProperties.toUnmodifiable(),
                            )
                    }

                    /** Ancillary purchases in addition to the airfare. */
                    @JsonDeserialize(builder = Ancillary.Builder::class)
                    @NoAutoDetect
                    class Ancillary
                    private constructor(
                        private val connectedTicketDocumentNumber: JsonField<String>,
                        private val creditReasonIndicator: JsonField<CreditReasonIndicator>,
                        private val passengerNameOrDescription: JsonField<String>,
                        private val services: JsonField<List<Service>>,
                        private val ticketDocumentNumber: JsonField<String>,
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        private var validated: Boolean = false

                        private var hashCode: Int = 0

                        /**
                         * If this purchase has a connection or relationship to another purchase,
                         * such as a baggage fee for a passenger transport ticket, this field should
                         * contain the ticket document number for the other purchase.
                         */
                        fun connectedTicketDocumentNumber(): Optional<String> =
                            Optional.ofNullable(
                                connectedTicketDocumentNumber.getNullable(
                                    "connected_ticket_document_number"
                                )
                            )

                        /** Indicates the reason for a credit to the cardholder. */
                        fun creditReasonIndicator(): Optional<CreditReasonIndicator> =
                            Optional.ofNullable(
                                creditReasonIndicator.getNullable("credit_reason_indicator")
                            )

                        /** Name of the passenger or description of the ancillary purchase. */
                        fun passengerNameOrDescription(): Optional<String> =
                            Optional.ofNullable(
                                passengerNameOrDescription.getNullable(
                                    "passenger_name_or_description"
                                )
                            )

                        /** Additional travel charges, such as baggage fees. */
                        fun services(): List<Service> = services.getRequired("services")

                        /** Ticket document number. */
                        fun ticketDocumentNumber(): Optional<String> =
                            Optional.ofNullable(
                                ticketDocumentNumber.getNullable("ticket_document_number")
                            )

                        /**
                         * If this purchase has a connection or relationship to another purchase,
                         * such as a baggage fee for a passenger transport ticket, this field should
                         * contain the ticket document number for the other purchase.
                         */
                        @JsonProperty("connected_ticket_document_number")
                        @ExcludeMissing
                        fun _connectedTicketDocumentNumber() = connectedTicketDocumentNumber

                        /** Indicates the reason for a credit to the cardholder. */
                        @JsonProperty("credit_reason_indicator")
                        @ExcludeMissing
                        fun _creditReasonIndicator() = creditReasonIndicator

                        /** Name of the passenger or description of the ancillary purchase. */
                        @JsonProperty("passenger_name_or_description")
                        @ExcludeMissing
                        fun _passengerNameOrDescription() = passengerNameOrDescription

                        /** Additional travel charges, such as baggage fees. */
                        @JsonProperty("services") @ExcludeMissing fun _services() = services

                        /** Ticket document number. */
                        @JsonProperty("ticket_document_number")
                        @ExcludeMissing
                        fun _ticketDocumentNumber() = ticketDocumentNumber

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): Ancillary = apply {
                            if (!validated) {
                                connectedTicketDocumentNumber()
                                creditReasonIndicator()
                                passengerNameOrDescription()
                                services().forEach { it.validate() }
                                ticketDocumentNumber()
                                validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Ancillary &&
                                this.connectedTicketDocumentNumber ==
                                    other.connectedTicketDocumentNumber &&
                                this.creditReasonIndicator == other.creditReasonIndicator &&
                                this.passengerNameOrDescription ==
                                    other.passengerNameOrDescription &&
                                this.services == other.services &&
                                this.ticketDocumentNumber == other.ticketDocumentNumber &&
                                this.additionalProperties == other.additionalProperties
                        }

                        override fun hashCode(): Int {
                            if (hashCode == 0) {
                                hashCode =
                                    Objects.hash(
                                        connectedTicketDocumentNumber,
                                        creditReasonIndicator,
                                        passengerNameOrDescription,
                                        services,
                                        ticketDocumentNumber,
                                        additionalProperties,
                                    )
                            }
                            return hashCode
                        }

                        override fun toString() =
                            "Ancillary{connectedTicketDocumentNumber=$connectedTicketDocumentNumber, creditReasonIndicator=$creditReasonIndicator, passengerNameOrDescription=$passengerNameOrDescription, services=$services, ticketDocumentNumber=$ticketDocumentNumber, additionalProperties=$additionalProperties}"

                        companion object {

                            @JvmStatic fun builder() = Builder()
                        }

                        class Builder {

                            private var connectedTicketDocumentNumber: JsonField<String> =
                                JsonMissing.of()
                            private var creditReasonIndicator: JsonField<CreditReasonIndicator> =
                                JsonMissing.of()
                            private var passengerNameOrDescription: JsonField<String> =
                                JsonMissing.of()
                            private var services: JsonField<List<Service>> = JsonMissing.of()
                            private var ticketDocumentNumber: JsonField<String> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(ancillary: Ancillary) = apply {
                                this.connectedTicketDocumentNumber =
                                    ancillary.connectedTicketDocumentNumber
                                this.creditReasonIndicator = ancillary.creditReasonIndicator
                                this.passengerNameOrDescription =
                                    ancillary.passengerNameOrDescription
                                this.services = ancillary.services
                                this.ticketDocumentNumber = ancillary.ticketDocumentNumber
                                additionalProperties(ancillary.additionalProperties)
                            }

                            /**
                             * If this purchase has a connection or relationship to another
                             * purchase, such as a baggage fee for a passenger transport ticket,
                             * this field should contain the ticket document number for the other
                             * purchase.
                             */
                            fun connectedTicketDocumentNumber(
                                connectedTicketDocumentNumber: String
                            ) =
                                connectedTicketDocumentNumber(
                                    JsonField.of(connectedTicketDocumentNumber)
                                )

                            /**
                             * If this purchase has a connection or relationship to another
                             * purchase, such as a baggage fee for a passenger transport ticket,
                             * this field should contain the ticket document number for the other
                             * purchase.
                             */
                            @JsonProperty("connected_ticket_document_number")
                            @ExcludeMissing
                            fun connectedTicketDocumentNumber(
                                connectedTicketDocumentNumber: JsonField<String>
                            ) = apply {
                                this.connectedTicketDocumentNumber = connectedTicketDocumentNumber
                            }

                            /** Indicates the reason for a credit to the cardholder. */
                            fun creditReasonIndicator(
                                creditReasonIndicator: CreditReasonIndicator
                            ) = creditReasonIndicator(JsonField.of(creditReasonIndicator))

                            /** Indicates the reason for a credit to the cardholder. */
                            @JsonProperty("credit_reason_indicator")
                            @ExcludeMissing
                            fun creditReasonIndicator(
                                creditReasonIndicator: JsonField<CreditReasonIndicator>
                            ) = apply { this.creditReasonIndicator = creditReasonIndicator }

                            /** Name of the passenger or description of the ancillary purchase. */
                            fun passengerNameOrDescription(passengerNameOrDescription: String) =
                                passengerNameOrDescription(JsonField.of(passengerNameOrDescription))

                            /** Name of the passenger or description of the ancillary purchase. */
                            @JsonProperty("passenger_name_or_description")
                            @ExcludeMissing
                            fun passengerNameOrDescription(
                                passengerNameOrDescription: JsonField<String>
                            ) = apply {
                                this.passengerNameOrDescription = passengerNameOrDescription
                            }

                            /** Additional travel charges, such as baggage fees. */
                            fun services(services: List<Service>) = services(JsonField.of(services))

                            /** Additional travel charges, such as baggage fees. */
                            @JsonProperty("services")
                            @ExcludeMissing
                            fun services(services: JsonField<List<Service>>) = apply {
                                this.services = services
                            }

                            /** Ticket document number. */
                            fun ticketDocumentNumber(ticketDocumentNumber: String) =
                                ticketDocumentNumber(JsonField.of(ticketDocumentNumber))

                            /** Ticket document number. */
                            @JsonProperty("ticket_document_number")
                            @ExcludeMissing
                            fun ticketDocumentNumber(ticketDocumentNumber: JsonField<String>) =
                                apply {
                                    this.ticketDocumentNumber = ticketDocumentNumber
                                }

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

                            fun build(): Ancillary =
                                Ancillary(
                                    connectedTicketDocumentNumber,
                                    creditReasonIndicator,
                                    passengerNameOrDescription,
                                    services.map { it.toUnmodifiable() },
                                    ticketDocumentNumber,
                                    additionalProperties.toUnmodifiable(),
                                )
                        }

                        class CreditReasonIndicator
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

                                return other is CreditReasonIndicator && this.value == other.value
                            }

                            override fun hashCode() = value.hashCode()

                            override fun toString() = value.toString()

                            companion object {

                                @JvmField
                                val NO_CREDIT = CreditReasonIndicator(JsonField.of("no_credit"))

                                @JvmField
                                val PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION =
                                    CreditReasonIndicator(
                                        JsonField.of(
                                            "passenger_transport_ancillary_purchase_cancellation"
                                        )
                                    )

                                @JvmField
                                val AIRLINE_TICKET_AND_PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION =
                                    CreditReasonIndicator(
                                        JsonField.of(
                                            "airline_ticket_and_passenger_transport_ancillary_purchase_cancellation"
                                        )
                                    )

                                @JvmField val OTHER = CreditReasonIndicator(JsonField.of("other"))

                                @JvmStatic
                                fun of(value: String) = CreditReasonIndicator(JsonField.of(value))
                            }

                            enum class Known {
                                NO_CREDIT,
                                PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION,
                                AIRLINE_TICKET_AND_PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION,
                                OTHER,
                            }

                            enum class Value {
                                NO_CREDIT,
                                PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION,
                                AIRLINE_TICKET_AND_PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION,
                                OTHER,
                                _UNKNOWN,
                            }

                            fun value(): Value =
                                when (this) {
                                    NO_CREDIT -> Value.NO_CREDIT
                                    PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION ->
                                        Value.PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION
                                    AIRLINE_TICKET_AND_PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION ->
                                        Value
                                            .AIRLINE_TICKET_AND_PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION
                                    OTHER -> Value.OTHER
                                    else -> Value._UNKNOWN
                                }

                            fun known(): Known =
                                when (this) {
                                    NO_CREDIT -> Known.NO_CREDIT
                                    PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION ->
                                        Known.PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION
                                    AIRLINE_TICKET_AND_PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION ->
                                        Known
                                            .AIRLINE_TICKET_AND_PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION
                                    OTHER -> Known.OTHER
                                    else ->
                                        throw IncreaseInvalidDataException(
                                            "Unknown CreditReasonIndicator: $value"
                                        )
                                }

                            fun asString(): String = _value().asStringOrThrow()
                        }

                        @JsonDeserialize(builder = Service.Builder::class)
                        @NoAutoDetect
                        class Service
                        private constructor(
                            private val category: JsonField<Category>,
                            private val subCategory: JsonField<String>,
                            private val additionalProperties: Map<String, JsonValue>,
                        ) {

                            private var validated: Boolean = false

                            private var hashCode: Int = 0

                            /** Category of the ancillary service. */
                            fun category(): Optional<Category> =
                                Optional.ofNullable(category.getNullable("category"))

                            /** Sub-category of the ancillary service, free-form. */
                            fun subCategory(): Optional<String> =
                                Optional.ofNullable(subCategory.getNullable("sub_category"))

                            /** Category of the ancillary service. */
                            @JsonProperty("category") @ExcludeMissing fun _category() = category

                            /** Sub-category of the ancillary service, free-form. */
                            @JsonProperty("sub_category")
                            @ExcludeMissing
                            fun _subCategory() = subCategory

                            @JsonAnyGetter
                            @ExcludeMissing
                            fun _additionalProperties(): Map<String, JsonValue> =
                                additionalProperties

                            fun validate(): Service = apply {
                                if (!validated) {
                                    category()
                                    subCategory()
                                    validated = true
                                }
                            }

                            fun toBuilder() = Builder().from(this)

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is Service &&
                                    this.category == other.category &&
                                    this.subCategory == other.subCategory &&
                                    this.additionalProperties == other.additionalProperties
                            }

                            override fun hashCode(): Int {
                                if (hashCode == 0) {
                                    hashCode =
                                        Objects.hash(
                                            category,
                                            subCategory,
                                            additionalProperties,
                                        )
                                }
                                return hashCode
                            }

                            override fun toString() =
                                "Service{category=$category, subCategory=$subCategory, additionalProperties=$additionalProperties}"

                            companion object {

                                @JvmStatic fun builder() = Builder()
                            }

                            class Builder {

                                private var category: JsonField<Category> = JsonMissing.of()
                                private var subCategory: JsonField<String> = JsonMissing.of()
                                private var additionalProperties: MutableMap<String, JsonValue> =
                                    mutableMapOf()

                                @JvmSynthetic
                                internal fun from(service: Service) = apply {
                                    this.category = service.category
                                    this.subCategory = service.subCategory
                                    additionalProperties(service.additionalProperties)
                                }

                                /** Category of the ancillary service. */
                                fun category(category: Category) = category(JsonField.of(category))

                                /** Category of the ancillary service. */
                                @JsonProperty("category")
                                @ExcludeMissing
                                fun category(category: JsonField<Category>) = apply {
                                    this.category = category
                                }

                                /** Sub-category of the ancillary service, free-form. */
                                fun subCategory(subCategory: String) =
                                    subCategory(JsonField.of(subCategory))

                                /** Sub-category of the ancillary service, free-form. */
                                @JsonProperty("sub_category")
                                @ExcludeMissing
                                fun subCategory(subCategory: JsonField<String>) = apply {
                                    this.subCategory = subCategory
                                }

                                fun additionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply {
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

                                fun build(): Service =
                                    Service(
                                        category,
                                        subCategory,
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

                                    return other is Category && this.value == other.value
                                }

                                override fun hashCode() = value.hashCode()

                                override fun toString() = value.toString()

                                companion object {

                                    @JvmField val NONE = Category(JsonField.of("none"))

                                    @JvmField
                                    val BUNDLED_SERVICE = Category(JsonField.of("bundled_service"))

                                    @JvmField
                                    val BAGGAGE_FEE = Category(JsonField.of("baggage_fee"))

                                    @JvmField val CHANGE_FEE = Category(JsonField.of("change_fee"))

                                    @JvmField val CARGO = Category(JsonField.of("cargo"))

                                    @JvmField
                                    val CARBON_OFFSET = Category(JsonField.of("carbon_offset"))

                                    @JvmField
                                    val FREQUENT_FLYER = Category(JsonField.of("frequent_flyer"))

                                    @JvmField val GIFT_CARD = Category(JsonField.of("gift_card"))

                                    @JvmField
                                    val GROUND_TRANSPORT =
                                        Category(JsonField.of("ground_transport"))

                                    @JvmField
                                    val IN_FLIGHT_ENTERTAINMENT =
                                        Category(JsonField.of("in_flight_entertainment"))

                                    @JvmField val LOUNGE = Category(JsonField.of("lounge"))

                                    @JvmField val MEDICAL = Category(JsonField.of("medical"))

                                    @JvmField
                                    val MEAL_BEVERAGE = Category(JsonField.of("meal_beverage"))

                                    @JvmField val OTHER = Category(JsonField.of("other"))

                                    @JvmField
                                    val PASSENGER_ASSIST_FEE =
                                        Category(JsonField.of("passenger_assist_fee"))

                                    @JvmField val PETS = Category(JsonField.of("pets"))

                                    @JvmField val SEAT_FEES = Category(JsonField.of("seat_fees"))

                                    @JvmField val STANDBY = Category(JsonField.of("standby"))

                                    @JvmField
                                    val SERVICE_FEE = Category(JsonField.of("service_fee"))

                                    @JvmField val STORE = Category(JsonField.of("store"))

                                    @JvmField
                                    val TRAVEL_SERVICE = Category(JsonField.of("travel_service"))

                                    @JvmField
                                    val UNACCOMPANIED_TRAVEL =
                                        Category(JsonField.of("unaccompanied_travel"))

                                    @JvmField val UPGRADES = Category(JsonField.of("upgrades"))

                                    @JvmField val WIFI = Category(JsonField.of("wifi"))

                                    @JvmStatic fun of(value: String) = Category(JsonField.of(value))
                                }

                                enum class Known {
                                    NONE,
                                    BUNDLED_SERVICE,
                                    BAGGAGE_FEE,
                                    CHANGE_FEE,
                                    CARGO,
                                    CARBON_OFFSET,
                                    FREQUENT_FLYER,
                                    GIFT_CARD,
                                    GROUND_TRANSPORT,
                                    IN_FLIGHT_ENTERTAINMENT,
                                    LOUNGE,
                                    MEDICAL,
                                    MEAL_BEVERAGE,
                                    OTHER,
                                    PASSENGER_ASSIST_FEE,
                                    PETS,
                                    SEAT_FEES,
                                    STANDBY,
                                    SERVICE_FEE,
                                    STORE,
                                    TRAVEL_SERVICE,
                                    UNACCOMPANIED_TRAVEL,
                                    UPGRADES,
                                    WIFI,
                                }

                                enum class Value {
                                    NONE,
                                    BUNDLED_SERVICE,
                                    BAGGAGE_FEE,
                                    CHANGE_FEE,
                                    CARGO,
                                    CARBON_OFFSET,
                                    FREQUENT_FLYER,
                                    GIFT_CARD,
                                    GROUND_TRANSPORT,
                                    IN_FLIGHT_ENTERTAINMENT,
                                    LOUNGE,
                                    MEDICAL,
                                    MEAL_BEVERAGE,
                                    OTHER,
                                    PASSENGER_ASSIST_FEE,
                                    PETS,
                                    SEAT_FEES,
                                    STANDBY,
                                    SERVICE_FEE,
                                    STORE,
                                    TRAVEL_SERVICE,
                                    UNACCOMPANIED_TRAVEL,
                                    UPGRADES,
                                    WIFI,
                                    _UNKNOWN,
                                }

                                fun value(): Value =
                                    when (this) {
                                        NONE -> Value.NONE
                                        BUNDLED_SERVICE -> Value.BUNDLED_SERVICE
                                        BAGGAGE_FEE -> Value.BAGGAGE_FEE
                                        CHANGE_FEE -> Value.CHANGE_FEE
                                        CARGO -> Value.CARGO
                                        CARBON_OFFSET -> Value.CARBON_OFFSET
                                        FREQUENT_FLYER -> Value.FREQUENT_FLYER
                                        GIFT_CARD -> Value.GIFT_CARD
                                        GROUND_TRANSPORT -> Value.GROUND_TRANSPORT
                                        IN_FLIGHT_ENTERTAINMENT -> Value.IN_FLIGHT_ENTERTAINMENT
                                        LOUNGE -> Value.LOUNGE
                                        MEDICAL -> Value.MEDICAL
                                        MEAL_BEVERAGE -> Value.MEAL_BEVERAGE
                                        OTHER -> Value.OTHER
                                        PASSENGER_ASSIST_FEE -> Value.PASSENGER_ASSIST_FEE
                                        PETS -> Value.PETS
                                        SEAT_FEES -> Value.SEAT_FEES
                                        STANDBY -> Value.STANDBY
                                        SERVICE_FEE -> Value.SERVICE_FEE
                                        STORE -> Value.STORE
                                        TRAVEL_SERVICE -> Value.TRAVEL_SERVICE
                                        UNACCOMPANIED_TRAVEL -> Value.UNACCOMPANIED_TRAVEL
                                        UPGRADES -> Value.UPGRADES
                                        WIFI -> Value.WIFI
                                        else -> Value._UNKNOWN
                                    }

                                fun known(): Known =
                                    when (this) {
                                        NONE -> Known.NONE
                                        BUNDLED_SERVICE -> Known.BUNDLED_SERVICE
                                        BAGGAGE_FEE -> Known.BAGGAGE_FEE
                                        CHANGE_FEE -> Known.CHANGE_FEE
                                        CARGO -> Known.CARGO
                                        CARBON_OFFSET -> Known.CARBON_OFFSET
                                        FREQUENT_FLYER -> Known.FREQUENT_FLYER
                                        GIFT_CARD -> Known.GIFT_CARD
                                        GROUND_TRANSPORT -> Known.GROUND_TRANSPORT
                                        IN_FLIGHT_ENTERTAINMENT -> Known.IN_FLIGHT_ENTERTAINMENT
                                        LOUNGE -> Known.LOUNGE
                                        MEDICAL -> Known.MEDICAL
                                        MEAL_BEVERAGE -> Known.MEAL_BEVERAGE
                                        OTHER -> Known.OTHER
                                        PASSENGER_ASSIST_FEE -> Known.PASSENGER_ASSIST_FEE
                                        PETS -> Known.PETS
                                        SEAT_FEES -> Known.SEAT_FEES
                                        STANDBY -> Known.STANDBY
                                        SERVICE_FEE -> Known.SERVICE_FEE
                                        STORE -> Known.STORE
                                        TRAVEL_SERVICE -> Known.TRAVEL_SERVICE
                                        UNACCOMPANIED_TRAVEL -> Known.UNACCOMPANIED_TRAVEL
                                        UPGRADES -> Known.UPGRADES
                                        WIFI -> Known.WIFI
                                        else ->
                                            throw IncreaseInvalidDataException(
                                                "Unknown Category: $value"
                                            )
                                    }

                                fun asString(): String = _value().asStringOrThrow()
                            }
                        }
                    }

                    class CreditReasonIndicator
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

                            return other is CreditReasonIndicator && this.value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()

                        companion object {

                            @JvmField
                            val NO_CREDIT = CreditReasonIndicator(JsonField.of("no_credit"))

                            @JvmField
                            val PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION =
                                CreditReasonIndicator(
                                    JsonField.of(
                                        "passenger_transport_ancillary_purchase_cancellation"
                                    )
                                )

                            @JvmField
                            val AIRLINE_TICKET_AND_PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION =
                                CreditReasonIndicator(
                                    JsonField.of(
                                        "airline_ticket_and_passenger_transport_ancillary_purchase_cancellation"
                                    )
                                )

                            @JvmField
                            val AIRLINE_TICKET_CANCELLATION =
                                CreditReasonIndicator(JsonField.of("airline_ticket_cancellation"))

                            @JvmField val OTHER = CreditReasonIndicator(JsonField.of("other"))

                            @JvmField
                            val PARTIAL_REFUND_OF_AIRLINE_TICKET =
                                CreditReasonIndicator(
                                    JsonField.of("partial_refund_of_airline_ticket")
                                )

                            @JvmStatic
                            fun of(value: String) = CreditReasonIndicator(JsonField.of(value))
                        }

                        enum class Known {
                            NO_CREDIT,
                            PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION,
                            AIRLINE_TICKET_AND_PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION,
                            AIRLINE_TICKET_CANCELLATION,
                            OTHER,
                            PARTIAL_REFUND_OF_AIRLINE_TICKET,
                        }

                        enum class Value {
                            NO_CREDIT,
                            PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION,
                            AIRLINE_TICKET_AND_PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION,
                            AIRLINE_TICKET_CANCELLATION,
                            OTHER,
                            PARTIAL_REFUND_OF_AIRLINE_TICKET,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                NO_CREDIT -> Value.NO_CREDIT
                                PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION ->
                                    Value.PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION
                                AIRLINE_TICKET_AND_PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION ->
                                    Value
                                        .AIRLINE_TICKET_AND_PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION
                                AIRLINE_TICKET_CANCELLATION -> Value.AIRLINE_TICKET_CANCELLATION
                                OTHER -> Value.OTHER
                                PARTIAL_REFUND_OF_AIRLINE_TICKET ->
                                    Value.PARTIAL_REFUND_OF_AIRLINE_TICKET
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                NO_CREDIT -> Known.NO_CREDIT
                                PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION ->
                                    Known.PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION
                                AIRLINE_TICKET_AND_PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION ->
                                    Known
                                        .AIRLINE_TICKET_AND_PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION
                                AIRLINE_TICKET_CANCELLATION -> Known.AIRLINE_TICKET_CANCELLATION
                                OTHER -> Known.OTHER
                                PARTIAL_REFUND_OF_AIRLINE_TICKET ->
                                    Known.PARTIAL_REFUND_OF_AIRLINE_TICKET
                                else ->
                                    throw IncreaseInvalidDataException(
                                        "Unknown CreditReasonIndicator: $value"
                                    )
                            }

                        fun asString(): String = _value().asStringOrThrow()
                    }

                    class RestrictedTicketIndicator
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

                            return other is RestrictedTicketIndicator && this.value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()

                        companion object {

                            @JvmField
                            val NO_RESTRICTIONS =
                                RestrictedTicketIndicator(JsonField.of("no_restrictions"))

                            @JvmField
                            val RESTRICTED_NON_REFUNDABLE_TICKET =
                                RestrictedTicketIndicator(
                                    JsonField.of("restricted_non_refundable_ticket")
                                )

                            @JvmStatic
                            fun of(value: String) = RestrictedTicketIndicator(JsonField.of(value))
                        }

                        enum class Known {
                            NO_RESTRICTIONS,
                            RESTRICTED_NON_REFUNDABLE_TICKET,
                        }

                        enum class Value {
                            NO_RESTRICTIONS,
                            RESTRICTED_NON_REFUNDABLE_TICKET,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                NO_RESTRICTIONS -> Value.NO_RESTRICTIONS
                                RESTRICTED_NON_REFUNDABLE_TICKET ->
                                    Value.RESTRICTED_NON_REFUNDABLE_TICKET
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                NO_RESTRICTIONS -> Known.NO_RESTRICTIONS
                                RESTRICTED_NON_REFUNDABLE_TICKET ->
                                    Known.RESTRICTED_NON_REFUNDABLE_TICKET
                                else ->
                                    throw IncreaseInvalidDataException(
                                        "Unknown RestrictedTicketIndicator: $value"
                                    )
                            }

                        fun asString(): String = _value().asStringOrThrow()
                    }

                    class TicketChangeIndicator
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

                            return other is TicketChangeIndicator && this.value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()

                        companion object {

                            @JvmField val NONE = TicketChangeIndicator(JsonField.of("none"))

                            @JvmField
                            val CHANGE_TO_EXISTING_TICKET =
                                TicketChangeIndicator(JsonField.of("change_to_existing_ticket"))

                            @JvmField
                            val NEW_TICKET = TicketChangeIndicator(JsonField.of("new_ticket"))

                            @JvmStatic
                            fun of(value: String) = TicketChangeIndicator(JsonField.of(value))
                        }

                        enum class Known {
                            NONE,
                            CHANGE_TO_EXISTING_TICKET,
                            NEW_TICKET,
                        }

                        enum class Value {
                            NONE,
                            CHANGE_TO_EXISTING_TICKET,
                            NEW_TICKET,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                NONE -> Value.NONE
                                CHANGE_TO_EXISTING_TICKET -> Value.CHANGE_TO_EXISTING_TICKET
                                NEW_TICKET -> Value.NEW_TICKET
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                NONE -> Known.NONE
                                CHANGE_TO_EXISTING_TICKET -> Known.CHANGE_TO_EXISTING_TICKET
                                NEW_TICKET -> Known.NEW_TICKET
                                else ->
                                    throw IncreaseInvalidDataException(
                                        "Unknown TicketChangeIndicator: $value"
                                    )
                            }

                        fun asString(): String = _value().asStringOrThrow()
                    }

                    @JsonDeserialize(builder = TripLeg.Builder::class)
                    @NoAutoDetect
                    class TripLeg
                    private constructor(
                        private val carrierCode: JsonField<String>,
                        private val destinationCityAirportCode: JsonField<String>,
                        private val fareBasisCode: JsonField<String>,
                        private val flightNumber: JsonField<String>,
                        private val serviceClass: JsonField<String>,
                        private val stopOverCode: JsonField<StopOverCode>,
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        private var validated: Boolean = false

                        private var hashCode: Int = 0

                        /** Carrier code (e.g., United Airlines, Jet Blue, etc.). */
                        fun carrierCode(): Optional<String> =
                            Optional.ofNullable(carrierCode.getNullable("carrier_code"))

                        /** Code for the destination city or airport. */
                        fun destinationCityAirportCode(): Optional<String> =
                            Optional.ofNullable(
                                destinationCityAirportCode.getNullable(
                                    "destination_city_airport_code"
                                )
                            )

                        /** Fare basis code. */
                        fun fareBasisCode(): Optional<String> =
                            Optional.ofNullable(fareBasisCode.getNullable("fare_basis_code"))

                        /** Flight number. */
                        fun flightNumber(): Optional<String> =
                            Optional.ofNullable(flightNumber.getNullable("flight_number"))

                        /** Service class (e.g., first class, business class, etc.). */
                        fun serviceClass(): Optional<String> =
                            Optional.ofNullable(serviceClass.getNullable("service_class"))

                        /** Indicates whether a stopover is allowed on this ticket. */
                        fun stopOverCode(): Optional<StopOverCode> =
                            Optional.ofNullable(stopOverCode.getNullable("stop_over_code"))

                        /** Carrier code (e.g., United Airlines, Jet Blue, etc.). */
                        @JsonProperty("carrier_code")
                        @ExcludeMissing
                        fun _carrierCode() = carrierCode

                        /** Code for the destination city or airport. */
                        @JsonProperty("destination_city_airport_code")
                        @ExcludeMissing
                        fun _destinationCityAirportCode() = destinationCityAirportCode

                        /** Fare basis code. */
                        @JsonProperty("fare_basis_code")
                        @ExcludeMissing
                        fun _fareBasisCode() = fareBasisCode

                        /** Flight number. */
                        @JsonProperty("flight_number")
                        @ExcludeMissing
                        fun _flightNumber() = flightNumber

                        /** Service class (e.g., first class, business class, etc.). */
                        @JsonProperty("service_class")
                        @ExcludeMissing
                        fun _serviceClass() = serviceClass

                        /** Indicates whether a stopover is allowed on this ticket. */
                        @JsonProperty("stop_over_code")
                        @ExcludeMissing
                        fun _stopOverCode() = stopOverCode

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): TripLeg = apply {
                            if (!validated) {
                                carrierCode()
                                destinationCityAirportCode()
                                fareBasisCode()
                                flightNumber()
                                serviceClass()
                                stopOverCode()
                                validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is TripLeg &&
                                this.carrierCode == other.carrierCode &&
                                this.destinationCityAirportCode ==
                                    other.destinationCityAirportCode &&
                                this.fareBasisCode == other.fareBasisCode &&
                                this.flightNumber == other.flightNumber &&
                                this.serviceClass == other.serviceClass &&
                                this.stopOverCode == other.stopOverCode &&
                                this.additionalProperties == other.additionalProperties
                        }

                        override fun hashCode(): Int {
                            if (hashCode == 0) {
                                hashCode =
                                    Objects.hash(
                                        carrierCode,
                                        destinationCityAirportCode,
                                        fareBasisCode,
                                        flightNumber,
                                        serviceClass,
                                        stopOverCode,
                                        additionalProperties,
                                    )
                            }
                            return hashCode
                        }

                        override fun toString() =
                            "TripLeg{carrierCode=$carrierCode, destinationCityAirportCode=$destinationCityAirportCode, fareBasisCode=$fareBasisCode, flightNumber=$flightNumber, serviceClass=$serviceClass, stopOverCode=$stopOverCode, additionalProperties=$additionalProperties}"

                        companion object {

                            @JvmStatic fun builder() = Builder()
                        }

                        class Builder {

                            private var carrierCode: JsonField<String> = JsonMissing.of()
                            private var destinationCityAirportCode: JsonField<String> =
                                JsonMissing.of()
                            private var fareBasisCode: JsonField<String> = JsonMissing.of()
                            private var flightNumber: JsonField<String> = JsonMissing.of()
                            private var serviceClass: JsonField<String> = JsonMissing.of()
                            private var stopOverCode: JsonField<StopOverCode> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(tripLeg: TripLeg) = apply {
                                this.carrierCode = tripLeg.carrierCode
                                this.destinationCityAirportCode = tripLeg.destinationCityAirportCode
                                this.fareBasisCode = tripLeg.fareBasisCode
                                this.flightNumber = tripLeg.flightNumber
                                this.serviceClass = tripLeg.serviceClass
                                this.stopOverCode = tripLeg.stopOverCode
                                additionalProperties(tripLeg.additionalProperties)
                            }

                            /** Carrier code (e.g., United Airlines, Jet Blue, etc.). */
                            fun carrierCode(carrierCode: String) =
                                carrierCode(JsonField.of(carrierCode))

                            /** Carrier code (e.g., United Airlines, Jet Blue, etc.). */
                            @JsonProperty("carrier_code")
                            @ExcludeMissing
                            fun carrierCode(carrierCode: JsonField<String>) = apply {
                                this.carrierCode = carrierCode
                            }

                            /** Code for the destination city or airport. */
                            fun destinationCityAirportCode(destinationCityAirportCode: String) =
                                destinationCityAirportCode(JsonField.of(destinationCityAirportCode))

                            /** Code for the destination city or airport. */
                            @JsonProperty("destination_city_airport_code")
                            @ExcludeMissing
                            fun destinationCityAirportCode(
                                destinationCityAirportCode: JsonField<String>
                            ) = apply {
                                this.destinationCityAirportCode = destinationCityAirportCode
                            }

                            /** Fare basis code. */
                            fun fareBasisCode(fareBasisCode: String) =
                                fareBasisCode(JsonField.of(fareBasisCode))

                            /** Fare basis code. */
                            @JsonProperty("fare_basis_code")
                            @ExcludeMissing
                            fun fareBasisCode(fareBasisCode: JsonField<String>) = apply {
                                this.fareBasisCode = fareBasisCode
                            }

                            /** Flight number. */
                            fun flightNumber(flightNumber: String) =
                                flightNumber(JsonField.of(flightNumber))

                            /** Flight number. */
                            @JsonProperty("flight_number")
                            @ExcludeMissing
                            fun flightNumber(flightNumber: JsonField<String>) = apply {
                                this.flightNumber = flightNumber
                            }

                            /** Service class (e.g., first class, business class, etc.). */
                            fun serviceClass(serviceClass: String) =
                                serviceClass(JsonField.of(serviceClass))

                            /** Service class (e.g., first class, business class, etc.). */
                            @JsonProperty("service_class")
                            @ExcludeMissing
                            fun serviceClass(serviceClass: JsonField<String>) = apply {
                                this.serviceClass = serviceClass
                            }

                            /** Indicates whether a stopover is allowed on this ticket. */
                            fun stopOverCode(stopOverCode: StopOverCode) =
                                stopOverCode(JsonField.of(stopOverCode))

                            /** Indicates whether a stopover is allowed on this ticket. */
                            @JsonProperty("stop_over_code")
                            @ExcludeMissing
                            fun stopOverCode(stopOverCode: JsonField<StopOverCode>) = apply {
                                this.stopOverCode = stopOverCode
                            }

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

                            fun build(): TripLeg =
                                TripLeg(
                                    carrierCode,
                                    destinationCityAirportCode,
                                    fareBasisCode,
                                    flightNumber,
                                    serviceClass,
                                    stopOverCode,
                                    additionalProperties.toUnmodifiable(),
                                )
                        }

                        class StopOverCode
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

                                return other is StopOverCode && this.value == other.value
                            }

                            override fun hashCode() = value.hashCode()

                            override fun toString() = value.toString()

                            companion object {

                                @JvmField val NONE = StopOverCode(JsonField.of("none"))

                                @JvmField
                                val STOP_OVER_ALLOWED =
                                    StopOverCode(JsonField.of("stop_over_allowed"))

                                @JvmField
                                val STOP_OVER_NOT_ALLOWED =
                                    StopOverCode(JsonField.of("stop_over_not_allowed"))

                                @JvmStatic fun of(value: String) = StopOverCode(JsonField.of(value))
                            }

                            enum class Known {
                                NONE,
                                STOP_OVER_ALLOWED,
                                STOP_OVER_NOT_ALLOWED,
                            }

                            enum class Value {
                                NONE,
                                STOP_OVER_ALLOWED,
                                STOP_OVER_NOT_ALLOWED,
                                _UNKNOWN,
                            }

                            fun value(): Value =
                                when (this) {
                                    NONE -> Value.NONE
                                    STOP_OVER_ALLOWED -> Value.STOP_OVER_ALLOWED
                                    STOP_OVER_NOT_ALLOWED -> Value.STOP_OVER_NOT_ALLOWED
                                    else -> Value._UNKNOWN
                                }

                            fun known(): Known =
                                when (this) {
                                    NONE -> Known.NONE
                                    STOP_OVER_ALLOWED -> Known.STOP_OVER_ALLOWED
                                    STOP_OVER_NOT_ALLOWED -> Known.STOP_OVER_NOT_ALLOWED
                                    else ->
                                        throw IncreaseInvalidDataException(
                                            "Unknown StopOverCode: $value"
                                        )
                                }

                            fun asString(): String = _value().asStringOrThrow()
                        }
                    }
                }
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

                    return other is Type && this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    @JvmField val CARD_REFUND = Type(JsonField.of("card_refund"))

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                enum class Known {
                    CARD_REFUND,
                }

                enum class Value {
                    CARD_REFUND,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        CARD_REFUND -> Value.CARD_REFUND
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        CARD_REFUND -> Known.CARD_REFUND
                        else -> throw IncreaseInvalidDataException("Unknown Type: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }
        }

        /**
         * A Card Revenue Payment object. This field will be present in the JSON response if and
         * only if `category` is equal to `card_revenue_payment`.
         */
        @JsonDeserialize(builder = CardRevenuePayment.Builder::class)
        @NoAutoDetect
        class CardRevenuePayment
        private constructor(
            private val amount: JsonField<Long>,
            private val currency: JsonField<Currency>,
            private val periodEnd: JsonField<OffsetDateTime>,
            private val periodStart: JsonField<OffsetDateTime>,
            private val transactedOnAccountId: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /**
             * The amount in the minor unit of the transaction's currency. For dollars, for example,
             * this is cents.
             */
            fun amount(): Long = amount.getRequired("amount")

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction
             * currency.
             */
            fun currency(): Currency = currency.getRequired("currency")

            /** The end of the period for which this transaction paid interest. */
            fun periodEnd(): OffsetDateTime = periodEnd.getRequired("period_end")

            /** The start of the period for which this transaction paid interest. */
            fun periodStart(): OffsetDateTime = periodStart.getRequired("period_start")

            /** The account the card belonged to. */
            fun transactedOnAccountId(): Optional<String> =
                Optional.ofNullable(transactedOnAccountId.getNullable("transacted_on_account_id"))

            /**
             * The amount in the minor unit of the transaction's currency. For dollars, for example,
             * this is cents.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction
             * currency.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            /** The end of the period for which this transaction paid interest. */
            @JsonProperty("period_end") @ExcludeMissing fun _periodEnd() = periodEnd

            /** The start of the period for which this transaction paid interest. */
            @JsonProperty("period_start") @ExcludeMissing fun _periodStart() = periodStart

            /** The account the card belonged to. */
            @JsonProperty("transacted_on_account_id")
            @ExcludeMissing
            fun _transactedOnAccountId() = transactedOnAccountId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): CardRevenuePayment = apply {
                if (!validated) {
                    amount()
                    currency()
                    periodEnd()
                    periodStart()
                    transactedOnAccountId()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CardRevenuePayment &&
                    this.amount == other.amount &&
                    this.currency == other.currency &&
                    this.periodEnd == other.periodEnd &&
                    this.periodStart == other.periodStart &&
                    this.transactedOnAccountId == other.transactedOnAccountId &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            amount,
                            currency,
                            periodEnd,
                            periodStart,
                            transactedOnAccountId,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "CardRevenuePayment{amount=$amount, currency=$currency, periodEnd=$periodEnd, periodStart=$periodStart, transactedOnAccountId=$transactedOnAccountId, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var amount: JsonField<Long> = JsonMissing.of()
                private var currency: JsonField<Currency> = JsonMissing.of()
                private var periodEnd: JsonField<OffsetDateTime> = JsonMissing.of()
                private var periodStart: JsonField<OffsetDateTime> = JsonMissing.of()
                private var transactedOnAccountId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(cardRevenuePayment: CardRevenuePayment) = apply {
                    this.amount = cardRevenuePayment.amount
                    this.currency = cardRevenuePayment.currency
                    this.periodEnd = cardRevenuePayment.periodEnd
                    this.periodStart = cardRevenuePayment.periodStart
                    this.transactedOnAccountId = cardRevenuePayment.transactedOnAccountId
                    additionalProperties(cardRevenuePayment.additionalProperties)
                }

                /**
                 * The amount in the minor unit of the transaction's currency. For dollars, for
                 * example, this is cents.
                 */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /**
                 * The amount in the minor unit of the transaction's currency. For dollars, for
                 * example, this is cents.
                 */
                @JsonProperty("amount")
                @ExcludeMissing
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction
                 * currency.
                 */
                fun currency(currency: Currency) = currency(JsonField.of(currency))

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction
                 * currency.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                /** The end of the period for which this transaction paid interest. */
                fun periodEnd(periodEnd: OffsetDateTime) = periodEnd(JsonField.of(periodEnd))

                /** The end of the period for which this transaction paid interest. */
                @JsonProperty("period_end")
                @ExcludeMissing
                fun periodEnd(periodEnd: JsonField<OffsetDateTime>) = apply {
                    this.periodEnd = periodEnd
                }

                /** The start of the period for which this transaction paid interest. */
                fun periodStart(periodStart: OffsetDateTime) =
                    periodStart(JsonField.of(periodStart))

                /** The start of the period for which this transaction paid interest. */
                @JsonProperty("period_start")
                @ExcludeMissing
                fun periodStart(periodStart: JsonField<OffsetDateTime>) = apply {
                    this.periodStart = periodStart
                }

                /** The account the card belonged to. */
                fun transactedOnAccountId(transactedOnAccountId: String) =
                    transactedOnAccountId(JsonField.of(transactedOnAccountId))

                /** The account the card belonged to. */
                @JsonProperty("transacted_on_account_id")
                @ExcludeMissing
                fun transactedOnAccountId(transactedOnAccountId: JsonField<String>) = apply {
                    this.transactedOnAccountId = transactedOnAccountId
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

                fun build(): CardRevenuePayment =
                    CardRevenuePayment(
                        amount,
                        currency,
                        periodEnd,
                        periodStart,
                        transactedOnAccountId,
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

                    return other is Currency && this.value == other.value
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
        }

        /**
         * A Card Settlement object. This field will be present in the JSON response if and only if
         * `category` is equal to `card_settlement`.
         */
        @JsonDeserialize(builder = CardSettlement.Builder::class)
        @NoAutoDetect
        class CardSettlement
        private constructor(
            private val amount: JsonField<Long>,
            private val cardAuthorization: JsonField<String>,
            private val cardPaymentId: JsonField<String>,
            private val currency: JsonField<Currency>,
            private val id: JsonField<String>,
            private val interchange: JsonField<Interchange>,
            private val merchantAcceptorId: JsonField<String>,
            private val merchantCategoryCode: JsonField<String>,
            private val merchantCity: JsonField<String>,
            private val merchantCountry: JsonField<String>,
            private val merchantName: JsonField<String>,
            private val merchantState: JsonField<String>,
            private val networkIdentifiers: JsonField<NetworkIdentifiers>,
            private val pendingTransactionId: JsonField<String>,
            private val presentmentAmount: JsonField<Long>,
            private val presentmentCurrency: JsonField<String>,
            private val purchaseDetails: JsonField<PurchaseDetails>,
            private val transactionId: JsonField<String>,
            private val type: JsonField<Type>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /**
             * The amount in the minor unit of the transaction's settlement currency. For dollars,
             * for example, this is cents.
             */
            fun amount(): Long = amount.getRequired("amount")

            /**
             * The Card Authorization that was created prior to this Card Settlement, if one exists.
             */
            fun cardAuthorization(): Optional<String> =
                Optional.ofNullable(cardAuthorization.getNullable("card_authorization"))

            /** The ID of the Card Payment this transaction belongs to. */
            fun cardPaymentId(): String = cardPaymentId.getRequired("card_payment_id")

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
             * settlement currency.
             */
            fun currency(): Currency = currency.getRequired("currency")

            /** The Card Settlement identifier. */
            fun id(): String = id.getRequired("id")

            /** Interchange assessed as a part of this transaciton. */
            fun interchange(): Optional<Interchange> =
                Optional.ofNullable(interchange.getNullable("interchange"))

            /**
             * The merchant identifier (commonly abbreviated as MID) of the merchant the card is
             * transacting with.
             */
            fun merchantAcceptorId(): Optional<String> =
                Optional.ofNullable(merchantAcceptorId.getNullable("merchant_acceptor_id"))

            /** The 4-digit MCC describing the merchant's business. */
            fun merchantCategoryCode(): String =
                merchantCategoryCode.getRequired("merchant_category_code")

            /** The city the merchant resides in. */
            fun merchantCity(): Optional<String> =
                Optional.ofNullable(merchantCity.getNullable("merchant_city"))

            /** The country the merchant resides in. */
            fun merchantCountry(): String = merchantCountry.getRequired("merchant_country")

            /** The name of the merchant. */
            fun merchantName(): Optional<String> =
                Optional.ofNullable(merchantName.getNullable("merchant_name"))

            /** The state the merchant resides in. */
            fun merchantState(): Optional<String> =
                Optional.ofNullable(merchantState.getNullable("merchant_state"))

            /** Network-specific identifiers for this refund. */
            fun networkIdentifiers(): NetworkIdentifiers =
                networkIdentifiers.getRequired("network_identifiers")

            /** The identifier of the Pending Transaction associated with this Transaction. */
            fun pendingTransactionId(): Optional<String> =
                Optional.ofNullable(pendingTransactionId.getNullable("pending_transaction_id"))

            /** The amount in the minor unit of the transaction's presentment currency. */
            fun presentmentAmount(): Long = presentmentAmount.getRequired("presentment_amount")

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
             * presentment currency.
             */
            fun presentmentCurrency(): String =
                presentmentCurrency.getRequired("presentment_currency")

            /**
             * Additional details about the card purchase, such as tax and industry-specific fields.
             */
            fun purchaseDetails(): Optional<PurchaseDetails> =
                Optional.ofNullable(purchaseDetails.getNullable("purchase_details"))

            /** The identifier of the Transaction associated with this Transaction. */
            fun transactionId(): String = transactionId.getRequired("transaction_id")

            /**
             * A constant representing the object's type. For this resource it will always be
             * `card_settlement`.
             */
            fun type(): Type = type.getRequired("type")

            /**
             * The amount in the minor unit of the transaction's settlement currency. For dollars,
             * for example, this is cents.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            /**
             * The Card Authorization that was created prior to this Card Settlement, if one exists.
             */
            @JsonProperty("card_authorization")
            @ExcludeMissing
            fun _cardAuthorization() = cardAuthorization

            /** The ID of the Card Payment this transaction belongs to. */
            @JsonProperty("card_payment_id") @ExcludeMissing fun _cardPaymentId() = cardPaymentId

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
             * settlement currency.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            /** The Card Settlement identifier. */
            @JsonProperty("id") @ExcludeMissing fun _id() = id

            /** Interchange assessed as a part of this transaciton. */
            @JsonProperty("interchange") @ExcludeMissing fun _interchange() = interchange

            /**
             * The merchant identifier (commonly abbreviated as MID) of the merchant the card is
             * transacting with.
             */
            @JsonProperty("merchant_acceptor_id")
            @ExcludeMissing
            fun _merchantAcceptorId() = merchantAcceptorId

            /** The 4-digit MCC describing the merchant's business. */
            @JsonProperty("merchant_category_code")
            @ExcludeMissing
            fun _merchantCategoryCode() = merchantCategoryCode

            /** The city the merchant resides in. */
            @JsonProperty("merchant_city") @ExcludeMissing fun _merchantCity() = merchantCity

            /** The country the merchant resides in. */
            @JsonProperty("merchant_country")
            @ExcludeMissing
            fun _merchantCountry() = merchantCountry

            /** The name of the merchant. */
            @JsonProperty("merchant_name") @ExcludeMissing fun _merchantName() = merchantName

            /** The state the merchant resides in. */
            @JsonProperty("merchant_state") @ExcludeMissing fun _merchantState() = merchantState

            /** Network-specific identifiers for this refund. */
            @JsonProperty("network_identifiers")
            @ExcludeMissing
            fun _networkIdentifiers() = networkIdentifiers

            /** The identifier of the Pending Transaction associated with this Transaction. */
            @JsonProperty("pending_transaction_id")
            @ExcludeMissing
            fun _pendingTransactionId() = pendingTransactionId

            /** The amount in the minor unit of the transaction's presentment currency. */
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
             * Additional details about the card purchase, such as tax and industry-specific fields.
             */
            @JsonProperty("purchase_details")
            @ExcludeMissing
            fun _purchaseDetails() = purchaseDetails

            /** The identifier of the Transaction associated with this Transaction. */
            @JsonProperty("transaction_id") @ExcludeMissing fun _transactionId() = transactionId

            /**
             * A constant representing the object's type. For this resource it will always be
             * `card_settlement`.
             */
            @JsonProperty("type") @ExcludeMissing fun _type() = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): CardSettlement = apply {
                if (!validated) {
                    amount()
                    cardAuthorization()
                    cardPaymentId()
                    currency()
                    id()
                    interchange().map { it.validate() }
                    merchantAcceptorId()
                    merchantCategoryCode()
                    merchantCity()
                    merchantCountry()
                    merchantName()
                    merchantState()
                    networkIdentifiers().validate()
                    pendingTransactionId()
                    presentmentAmount()
                    presentmentCurrency()
                    purchaseDetails().map { it.validate() }
                    transactionId()
                    type()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CardSettlement &&
                    this.amount == other.amount &&
                    this.cardAuthorization == other.cardAuthorization &&
                    this.cardPaymentId == other.cardPaymentId &&
                    this.currency == other.currency &&
                    this.id == other.id &&
                    this.interchange == other.interchange &&
                    this.merchantAcceptorId == other.merchantAcceptorId &&
                    this.merchantCategoryCode == other.merchantCategoryCode &&
                    this.merchantCity == other.merchantCity &&
                    this.merchantCountry == other.merchantCountry &&
                    this.merchantName == other.merchantName &&
                    this.merchantState == other.merchantState &&
                    this.networkIdentifiers == other.networkIdentifiers &&
                    this.pendingTransactionId == other.pendingTransactionId &&
                    this.presentmentAmount == other.presentmentAmount &&
                    this.presentmentCurrency == other.presentmentCurrency &&
                    this.purchaseDetails == other.purchaseDetails &&
                    this.transactionId == other.transactionId &&
                    this.type == other.type &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            amount,
                            cardAuthorization,
                            cardPaymentId,
                            currency,
                            id,
                            interchange,
                            merchantAcceptorId,
                            merchantCategoryCode,
                            merchantCity,
                            merchantCountry,
                            merchantName,
                            merchantState,
                            networkIdentifiers,
                            pendingTransactionId,
                            presentmentAmount,
                            presentmentCurrency,
                            purchaseDetails,
                            transactionId,
                            type,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "CardSettlement{amount=$amount, cardAuthorization=$cardAuthorization, cardPaymentId=$cardPaymentId, currency=$currency, id=$id, interchange=$interchange, merchantAcceptorId=$merchantAcceptorId, merchantCategoryCode=$merchantCategoryCode, merchantCity=$merchantCity, merchantCountry=$merchantCountry, merchantName=$merchantName, merchantState=$merchantState, networkIdentifiers=$networkIdentifiers, pendingTransactionId=$pendingTransactionId, presentmentAmount=$presentmentAmount, presentmentCurrency=$presentmentCurrency, purchaseDetails=$purchaseDetails, transactionId=$transactionId, type=$type, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var amount: JsonField<Long> = JsonMissing.of()
                private var cardAuthorization: JsonField<String> = JsonMissing.of()
                private var cardPaymentId: JsonField<String> = JsonMissing.of()
                private var currency: JsonField<Currency> = JsonMissing.of()
                private var id: JsonField<String> = JsonMissing.of()
                private var interchange: JsonField<Interchange> = JsonMissing.of()
                private var merchantAcceptorId: JsonField<String> = JsonMissing.of()
                private var merchantCategoryCode: JsonField<String> = JsonMissing.of()
                private var merchantCity: JsonField<String> = JsonMissing.of()
                private var merchantCountry: JsonField<String> = JsonMissing.of()
                private var merchantName: JsonField<String> = JsonMissing.of()
                private var merchantState: JsonField<String> = JsonMissing.of()
                private var networkIdentifiers: JsonField<NetworkIdentifiers> = JsonMissing.of()
                private var pendingTransactionId: JsonField<String> = JsonMissing.of()
                private var presentmentAmount: JsonField<Long> = JsonMissing.of()
                private var presentmentCurrency: JsonField<String> = JsonMissing.of()
                private var purchaseDetails: JsonField<PurchaseDetails> = JsonMissing.of()
                private var transactionId: JsonField<String> = JsonMissing.of()
                private var type: JsonField<Type> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(cardSettlement: CardSettlement) = apply {
                    this.amount = cardSettlement.amount
                    this.cardAuthorization = cardSettlement.cardAuthorization
                    this.cardPaymentId = cardSettlement.cardPaymentId
                    this.currency = cardSettlement.currency
                    this.id = cardSettlement.id
                    this.interchange = cardSettlement.interchange
                    this.merchantAcceptorId = cardSettlement.merchantAcceptorId
                    this.merchantCategoryCode = cardSettlement.merchantCategoryCode
                    this.merchantCity = cardSettlement.merchantCity
                    this.merchantCountry = cardSettlement.merchantCountry
                    this.merchantName = cardSettlement.merchantName
                    this.merchantState = cardSettlement.merchantState
                    this.networkIdentifiers = cardSettlement.networkIdentifiers
                    this.pendingTransactionId = cardSettlement.pendingTransactionId
                    this.presentmentAmount = cardSettlement.presentmentAmount
                    this.presentmentCurrency = cardSettlement.presentmentCurrency
                    this.purchaseDetails = cardSettlement.purchaseDetails
                    this.transactionId = cardSettlement.transactionId
                    this.type = cardSettlement.type
                    additionalProperties(cardSettlement.additionalProperties)
                }

                /**
                 * The amount in the minor unit of the transaction's settlement currency. For
                 * dollars, for example, this is cents.
                 */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /**
                 * The amount in the minor unit of the transaction's settlement currency. For
                 * dollars, for example, this is cents.
                 */
                @JsonProperty("amount")
                @ExcludeMissing
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /**
                 * The Card Authorization that was created prior to this Card Settlement, if one
                 * exists.
                 */
                fun cardAuthorization(cardAuthorization: String) =
                    cardAuthorization(JsonField.of(cardAuthorization))

                /**
                 * The Card Authorization that was created prior to this Card Settlement, if one
                 * exists.
                 */
                @JsonProperty("card_authorization")
                @ExcludeMissing
                fun cardAuthorization(cardAuthorization: JsonField<String>) = apply {
                    this.cardAuthorization = cardAuthorization
                }

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
                 * settlement currency.
                 */
                fun currency(currency: Currency) = currency(JsonField.of(currency))

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
                 * settlement currency.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                /** The Card Settlement identifier. */
                fun id(id: String) = id(JsonField.of(id))

                /** The Card Settlement identifier. */
                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                /** Interchange assessed as a part of this transaciton. */
                fun interchange(interchange: Interchange) = interchange(JsonField.of(interchange))

                /** Interchange assessed as a part of this transaciton. */
                @JsonProperty("interchange")
                @ExcludeMissing
                fun interchange(interchange: JsonField<Interchange>) = apply {
                    this.interchange = interchange
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
                @JsonProperty("merchant_acceptor_id")
                @ExcludeMissing
                fun merchantAcceptorId(merchantAcceptorId: JsonField<String>) = apply {
                    this.merchantAcceptorId = merchantAcceptorId
                }

                /** The 4-digit MCC describing the merchant's business. */
                fun merchantCategoryCode(merchantCategoryCode: String) =
                    merchantCategoryCode(JsonField.of(merchantCategoryCode))

                /** The 4-digit MCC describing the merchant's business. */
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

                /** The name of the merchant. */
                fun merchantName(merchantName: String) = merchantName(JsonField.of(merchantName))

                /** The name of the merchant. */
                @JsonProperty("merchant_name")
                @ExcludeMissing
                fun merchantName(merchantName: JsonField<String>) = apply {
                    this.merchantName = merchantName
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

                /** Network-specific identifiers for this refund. */
                fun networkIdentifiers(networkIdentifiers: NetworkIdentifiers) =
                    networkIdentifiers(JsonField.of(networkIdentifiers))

                /** Network-specific identifiers for this refund. */
                @JsonProperty("network_identifiers")
                @ExcludeMissing
                fun networkIdentifiers(networkIdentifiers: JsonField<NetworkIdentifiers>) = apply {
                    this.networkIdentifiers = networkIdentifiers
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

                /** The amount in the minor unit of the transaction's presentment currency. */
                fun presentmentAmount(presentmentAmount: Long) =
                    presentmentAmount(JsonField.of(presentmentAmount))

                /** The amount in the minor unit of the transaction's presentment currency. */
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
                 * Additional details about the card purchase, such as tax and industry-specific
                 * fields.
                 */
                fun purchaseDetails(purchaseDetails: PurchaseDetails) =
                    purchaseDetails(JsonField.of(purchaseDetails))

                /**
                 * Additional details about the card purchase, such as tax and industry-specific
                 * fields.
                 */
                @JsonProperty("purchase_details")
                @ExcludeMissing
                fun purchaseDetails(purchaseDetails: JsonField<PurchaseDetails>) = apply {
                    this.purchaseDetails = purchaseDetails
                }

                /** The identifier of the Transaction associated with this Transaction. */
                fun transactionId(transactionId: String) =
                    transactionId(JsonField.of(transactionId))

                /** The identifier of the Transaction associated with this Transaction. */
                @JsonProperty("transaction_id")
                @ExcludeMissing
                fun transactionId(transactionId: JsonField<String>) = apply {
                    this.transactionId = transactionId
                }

                /**
                 * A constant representing the object's type. For this resource it will always be
                 * `card_settlement`.
                 */
                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * A constant representing the object's type. For this resource it will always be
                 * `card_settlement`.
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

                fun build(): CardSettlement =
                    CardSettlement(
                        amount,
                        cardAuthorization,
                        cardPaymentId,
                        currency,
                        id,
                        interchange,
                        merchantAcceptorId,
                        merchantCategoryCode,
                        merchantCity,
                        merchantCountry,
                        merchantName,
                        merchantState,
                        networkIdentifiers,
                        pendingTransactionId,
                        presentmentAmount,
                        presentmentCurrency,
                        purchaseDetails,
                        transactionId,
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

                    return other is Currency && this.value == other.value
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

            /** Interchange assessed as a part of this transaciton. */
            @JsonDeserialize(builder = Interchange.Builder::class)
            @NoAutoDetect
            class Interchange
            private constructor(
                private val amount: JsonField<String>,
                private val code: JsonField<String>,
                private val currency: JsonField<Currency>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /**
                 * The interchange amount given as a string containing a decimal number. The amount
                 * is a positive number if it is credited to Increase (e.g., settlements) and a
                 * negative number if it is debited (e.g., refunds).
                 */
                fun amount(): String = amount.getRequired("amount")

                /** The card network specific interchange code. */
                fun code(): Optional<String> = Optional.ofNullable(code.getNullable("code"))

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the interchange
                 * reimbursement.
                 */
                fun currency(): Currency = currency.getRequired("currency")

                /**
                 * The interchange amount given as a string containing a decimal number. The amount
                 * is a positive number if it is credited to Increase (e.g., settlements) and a
                 * negative number if it is debited (e.g., refunds).
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

                /** The card network specific interchange code. */
                @JsonProperty("code") @ExcludeMissing fun _code() = code

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the interchange
                 * reimbursement.
                 */
                @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Interchange = apply {
                    if (!validated) {
                        amount()
                        code()
                        currency()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Interchange &&
                        this.amount == other.amount &&
                        this.code == other.code &&
                        this.currency == other.currency &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                amount,
                                code,
                                currency,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "Interchange{amount=$amount, code=$code, currency=$currency, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var amount: JsonField<String> = JsonMissing.of()
                    private var code: JsonField<String> = JsonMissing.of()
                    private var currency: JsonField<Currency> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(interchange: Interchange) = apply {
                        this.amount = interchange.amount
                        this.code = interchange.code
                        this.currency = interchange.currency
                        additionalProperties(interchange.additionalProperties)
                    }

                    /**
                     * The interchange amount given as a string containing a decimal number. The
                     * amount is a positive number if it is credited to Increase (e.g., settlements)
                     * and a negative number if it is debited (e.g., refunds).
                     */
                    fun amount(amount: String) = amount(JsonField.of(amount))

                    /**
                     * The interchange amount given as a string containing a decimal number. The
                     * amount is a positive number if it is credited to Increase (e.g., settlements)
                     * and a negative number if it is debited (e.g., refunds).
                     */
                    @JsonProperty("amount")
                    @ExcludeMissing
                    fun amount(amount: JsonField<String>) = apply { this.amount = amount }

                    /** The card network specific interchange code. */
                    fun code(code: String) = code(JsonField.of(code))

                    /** The card network specific interchange code. */
                    @JsonProperty("code")
                    @ExcludeMissing
                    fun code(code: JsonField<String>) = apply { this.code = code }

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                     * interchange reimbursement.
                     */
                    fun currency(currency: Currency) = currency(JsonField.of(currency))

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                     * interchange reimbursement.
                     */
                    @JsonProperty("currency")
                    @ExcludeMissing
                    fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

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

                    fun build(): Interchange =
                        Interchange(
                            amount,
                            code,
                            currency,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class Currency
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

                        return other is Currency && this.value == other.value
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
            }

            /** Network-specific identifiers for this refund. */
            @JsonDeserialize(builder = NetworkIdentifiers.Builder::class)
            @NoAutoDetect
            class NetworkIdentifiers
            private constructor(
                private val acquirerBusinessId: JsonField<String>,
                private val acquirerReferenceNumber: JsonField<String>,
                private val transactionId: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /**
                 * A network assigned business ID that identifies the acquirer that processed this
                 * transaction.
                 */
                fun acquirerBusinessId(): String =
                    acquirerBusinessId.getRequired("acquirer_business_id")

                /** A globally unique identifier for this settlement. */
                fun acquirerReferenceNumber(): String =
                    acquirerReferenceNumber.getRequired("acquirer_reference_number")

                /**
                 * A globally unique transaction identifier provided by the card network, used
                 * across multiple life-cycle requests.
                 */
                fun transactionId(): Optional<String> =
                    Optional.ofNullable(transactionId.getNullable("transaction_id"))

                /**
                 * A network assigned business ID that identifies the acquirer that processed this
                 * transaction.
                 */
                @JsonProperty("acquirer_business_id")
                @ExcludeMissing
                fun _acquirerBusinessId() = acquirerBusinessId

                /** A globally unique identifier for this settlement. */
                @JsonProperty("acquirer_reference_number")
                @ExcludeMissing
                fun _acquirerReferenceNumber() = acquirerReferenceNumber

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
                        acquirerBusinessId()
                        acquirerReferenceNumber()
                        transactionId()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is NetworkIdentifiers &&
                        this.acquirerBusinessId == other.acquirerBusinessId &&
                        this.acquirerReferenceNumber == other.acquirerReferenceNumber &&
                        this.transactionId == other.transactionId &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                acquirerBusinessId,
                                acquirerReferenceNumber,
                                transactionId,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "NetworkIdentifiers{acquirerBusinessId=$acquirerBusinessId, acquirerReferenceNumber=$acquirerReferenceNumber, transactionId=$transactionId, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var acquirerBusinessId: JsonField<String> = JsonMissing.of()
                    private var acquirerReferenceNumber: JsonField<String> = JsonMissing.of()
                    private var transactionId: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(networkIdentifiers: NetworkIdentifiers) = apply {
                        this.acquirerBusinessId = networkIdentifiers.acquirerBusinessId
                        this.acquirerReferenceNumber = networkIdentifiers.acquirerReferenceNumber
                        this.transactionId = networkIdentifiers.transactionId
                        additionalProperties(networkIdentifiers.additionalProperties)
                    }

                    /**
                     * A network assigned business ID that identifies the acquirer that processed
                     * this transaction.
                     */
                    fun acquirerBusinessId(acquirerBusinessId: String) =
                        acquirerBusinessId(JsonField.of(acquirerBusinessId))

                    /**
                     * A network assigned business ID that identifies the acquirer that processed
                     * this transaction.
                     */
                    @JsonProperty("acquirer_business_id")
                    @ExcludeMissing
                    fun acquirerBusinessId(acquirerBusinessId: JsonField<String>) = apply {
                        this.acquirerBusinessId = acquirerBusinessId
                    }

                    /** A globally unique identifier for this settlement. */
                    fun acquirerReferenceNumber(acquirerReferenceNumber: String) =
                        acquirerReferenceNumber(JsonField.of(acquirerReferenceNumber))

                    /** A globally unique identifier for this settlement. */
                    @JsonProperty("acquirer_reference_number")
                    @ExcludeMissing
                    fun acquirerReferenceNumber(acquirerReferenceNumber: JsonField<String>) =
                        apply {
                            this.acquirerReferenceNumber = acquirerReferenceNumber
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
                            acquirerBusinessId,
                            acquirerReferenceNumber,
                            transactionId,
                            additionalProperties.toUnmodifiable(),
                        )
                }
            }

            /**
             * Additional details about the card purchase, such as tax and industry-specific fields.
             */
            @JsonDeserialize(builder = PurchaseDetails.Builder::class)
            @NoAutoDetect
            class PurchaseDetails
            private constructor(
                private val carRental: JsonField<CarRental>,
                private val customerReferenceIdentifier: JsonField<String>,
                private val localTaxAmount: JsonField<Long>,
                private val localTaxCurrency: JsonField<String>,
                private val lodging: JsonField<Lodging>,
                private val nationalTaxAmount: JsonField<Long>,
                private val nationalTaxCurrency: JsonField<String>,
                private val purchaseIdentifier: JsonField<String>,
                private val purchaseIdentifierFormat: JsonField<PurchaseIdentifierFormat>,
                private val travel: JsonField<Travel>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /** Fields specific to car rentals. */
                fun carRental(): Optional<CarRental> =
                    Optional.ofNullable(carRental.getNullable("car_rental"))

                /** An identifier from the merchant for the customer or consumer. */
                fun customerReferenceIdentifier(): Optional<String> =
                    Optional.ofNullable(
                        customerReferenceIdentifier.getNullable("customer_reference_identifier")
                    )

                /** The state or provincial tax amount in minor units. */
                fun localTaxAmount(): Optional<Long> =
                    Optional.ofNullable(localTaxAmount.getNullable("local_tax_amount"))

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the local tax
                 * assessed.
                 */
                fun localTaxCurrency(): Optional<String> =
                    Optional.ofNullable(localTaxCurrency.getNullable("local_tax_currency"))

                /** Fields specific to lodging. */
                fun lodging(): Optional<Lodging> =
                    Optional.ofNullable(lodging.getNullable("lodging"))

                /** The national tax amount in minor units. */
                fun nationalTaxAmount(): Optional<Long> =
                    Optional.ofNullable(nationalTaxAmount.getNullable("national_tax_amount"))

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the local tax
                 * assessed.
                 */
                fun nationalTaxCurrency(): Optional<String> =
                    Optional.ofNullable(nationalTaxCurrency.getNullable("national_tax_currency"))

                /**
                 * An identifier from the merchant for the purchase to the issuer and cardholder.
                 */
                fun purchaseIdentifier(): Optional<String> =
                    Optional.ofNullable(purchaseIdentifier.getNullable("purchase_identifier"))

                /** The format of the purchase identifier. */
                fun purchaseIdentifierFormat(): Optional<PurchaseIdentifierFormat> =
                    Optional.ofNullable(
                        purchaseIdentifierFormat.getNullable("purchase_identifier_format")
                    )

                /** Fields specific to travel. */
                fun travel(): Optional<Travel> = Optional.ofNullable(travel.getNullable("travel"))

                /** Fields specific to car rentals. */
                @JsonProperty("car_rental") @ExcludeMissing fun _carRental() = carRental

                /** An identifier from the merchant for the customer or consumer. */
                @JsonProperty("customer_reference_identifier")
                @ExcludeMissing
                fun _customerReferenceIdentifier() = customerReferenceIdentifier

                /** The state or provincial tax amount in minor units. */
                @JsonProperty("local_tax_amount")
                @ExcludeMissing
                fun _localTaxAmount() = localTaxAmount

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the local tax
                 * assessed.
                 */
                @JsonProperty("local_tax_currency")
                @ExcludeMissing
                fun _localTaxCurrency() = localTaxCurrency

                /** Fields specific to lodging. */
                @JsonProperty("lodging") @ExcludeMissing fun _lodging() = lodging

                /** The national tax amount in minor units. */
                @JsonProperty("national_tax_amount")
                @ExcludeMissing
                fun _nationalTaxAmount() = nationalTaxAmount

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the local tax
                 * assessed.
                 */
                @JsonProperty("national_tax_currency")
                @ExcludeMissing
                fun _nationalTaxCurrency() = nationalTaxCurrency

                /**
                 * An identifier from the merchant for the purchase to the issuer and cardholder.
                 */
                @JsonProperty("purchase_identifier")
                @ExcludeMissing
                fun _purchaseIdentifier() = purchaseIdentifier

                /** The format of the purchase identifier. */
                @JsonProperty("purchase_identifier_format")
                @ExcludeMissing
                fun _purchaseIdentifierFormat() = purchaseIdentifierFormat

                /** Fields specific to travel. */
                @JsonProperty("travel") @ExcludeMissing fun _travel() = travel

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): PurchaseDetails = apply {
                    if (!validated) {
                        carRental().map { it.validate() }
                        customerReferenceIdentifier()
                        localTaxAmount()
                        localTaxCurrency()
                        lodging().map { it.validate() }
                        nationalTaxAmount()
                        nationalTaxCurrency()
                        purchaseIdentifier()
                        purchaseIdentifierFormat()
                        travel().map { it.validate() }
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is PurchaseDetails &&
                        this.carRental == other.carRental &&
                        this.customerReferenceIdentifier == other.customerReferenceIdentifier &&
                        this.localTaxAmount == other.localTaxAmount &&
                        this.localTaxCurrency == other.localTaxCurrency &&
                        this.lodging == other.lodging &&
                        this.nationalTaxAmount == other.nationalTaxAmount &&
                        this.nationalTaxCurrency == other.nationalTaxCurrency &&
                        this.purchaseIdentifier == other.purchaseIdentifier &&
                        this.purchaseIdentifierFormat == other.purchaseIdentifierFormat &&
                        this.travel == other.travel &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                carRental,
                                customerReferenceIdentifier,
                                localTaxAmount,
                                localTaxCurrency,
                                lodging,
                                nationalTaxAmount,
                                nationalTaxCurrency,
                                purchaseIdentifier,
                                purchaseIdentifierFormat,
                                travel,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "PurchaseDetails{carRental=$carRental, customerReferenceIdentifier=$customerReferenceIdentifier, localTaxAmount=$localTaxAmount, localTaxCurrency=$localTaxCurrency, lodging=$lodging, nationalTaxAmount=$nationalTaxAmount, nationalTaxCurrency=$nationalTaxCurrency, purchaseIdentifier=$purchaseIdentifier, purchaseIdentifierFormat=$purchaseIdentifierFormat, travel=$travel, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var carRental: JsonField<CarRental> = JsonMissing.of()
                    private var customerReferenceIdentifier: JsonField<String> = JsonMissing.of()
                    private var localTaxAmount: JsonField<Long> = JsonMissing.of()
                    private var localTaxCurrency: JsonField<String> = JsonMissing.of()
                    private var lodging: JsonField<Lodging> = JsonMissing.of()
                    private var nationalTaxAmount: JsonField<Long> = JsonMissing.of()
                    private var nationalTaxCurrency: JsonField<String> = JsonMissing.of()
                    private var purchaseIdentifier: JsonField<String> = JsonMissing.of()
                    private var purchaseIdentifierFormat: JsonField<PurchaseIdentifierFormat> =
                        JsonMissing.of()
                    private var travel: JsonField<Travel> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(purchaseDetails: PurchaseDetails) = apply {
                        this.carRental = purchaseDetails.carRental
                        this.customerReferenceIdentifier =
                            purchaseDetails.customerReferenceIdentifier
                        this.localTaxAmount = purchaseDetails.localTaxAmount
                        this.localTaxCurrency = purchaseDetails.localTaxCurrency
                        this.lodging = purchaseDetails.lodging
                        this.nationalTaxAmount = purchaseDetails.nationalTaxAmount
                        this.nationalTaxCurrency = purchaseDetails.nationalTaxCurrency
                        this.purchaseIdentifier = purchaseDetails.purchaseIdentifier
                        this.purchaseIdentifierFormat = purchaseDetails.purchaseIdentifierFormat
                        this.travel = purchaseDetails.travel
                        additionalProperties(purchaseDetails.additionalProperties)
                    }

                    /** Fields specific to car rentals. */
                    fun carRental(carRental: CarRental) = carRental(JsonField.of(carRental))

                    /** Fields specific to car rentals. */
                    @JsonProperty("car_rental")
                    @ExcludeMissing
                    fun carRental(carRental: JsonField<CarRental>) = apply {
                        this.carRental = carRental
                    }

                    /** An identifier from the merchant for the customer or consumer. */
                    fun customerReferenceIdentifier(customerReferenceIdentifier: String) =
                        customerReferenceIdentifier(JsonField.of(customerReferenceIdentifier))

                    /** An identifier from the merchant for the customer or consumer. */
                    @JsonProperty("customer_reference_identifier")
                    @ExcludeMissing
                    fun customerReferenceIdentifier(
                        customerReferenceIdentifier: JsonField<String>
                    ) = apply { this.customerReferenceIdentifier = customerReferenceIdentifier }

                    /** The state or provincial tax amount in minor units. */
                    fun localTaxAmount(localTaxAmount: Long) =
                        localTaxAmount(JsonField.of(localTaxAmount))

                    /** The state or provincial tax amount in minor units. */
                    @JsonProperty("local_tax_amount")
                    @ExcludeMissing
                    fun localTaxAmount(localTaxAmount: JsonField<Long>) = apply {
                        this.localTaxAmount = localTaxAmount
                    }

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the local tax
                     * assessed.
                     */
                    fun localTaxCurrency(localTaxCurrency: String) =
                        localTaxCurrency(JsonField.of(localTaxCurrency))

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the local tax
                     * assessed.
                     */
                    @JsonProperty("local_tax_currency")
                    @ExcludeMissing
                    fun localTaxCurrency(localTaxCurrency: JsonField<String>) = apply {
                        this.localTaxCurrency = localTaxCurrency
                    }

                    /** Fields specific to lodging. */
                    fun lodging(lodging: Lodging) = lodging(JsonField.of(lodging))

                    /** Fields specific to lodging. */
                    @JsonProperty("lodging")
                    @ExcludeMissing
                    fun lodging(lodging: JsonField<Lodging>) = apply { this.lodging = lodging }

                    /** The national tax amount in minor units. */
                    fun nationalTaxAmount(nationalTaxAmount: Long) =
                        nationalTaxAmount(JsonField.of(nationalTaxAmount))

                    /** The national tax amount in minor units. */
                    @JsonProperty("national_tax_amount")
                    @ExcludeMissing
                    fun nationalTaxAmount(nationalTaxAmount: JsonField<Long>) = apply {
                        this.nationalTaxAmount = nationalTaxAmount
                    }

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the local tax
                     * assessed.
                     */
                    fun nationalTaxCurrency(nationalTaxCurrency: String) =
                        nationalTaxCurrency(JsonField.of(nationalTaxCurrency))

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the local tax
                     * assessed.
                     */
                    @JsonProperty("national_tax_currency")
                    @ExcludeMissing
                    fun nationalTaxCurrency(nationalTaxCurrency: JsonField<String>) = apply {
                        this.nationalTaxCurrency = nationalTaxCurrency
                    }

                    /**
                     * An identifier from the merchant for the purchase to the issuer and
                     * cardholder.
                     */
                    fun purchaseIdentifier(purchaseIdentifier: String) =
                        purchaseIdentifier(JsonField.of(purchaseIdentifier))

                    /**
                     * An identifier from the merchant for the purchase to the issuer and
                     * cardholder.
                     */
                    @JsonProperty("purchase_identifier")
                    @ExcludeMissing
                    fun purchaseIdentifier(purchaseIdentifier: JsonField<String>) = apply {
                        this.purchaseIdentifier = purchaseIdentifier
                    }

                    /** The format of the purchase identifier. */
                    fun purchaseIdentifierFormat(
                        purchaseIdentifierFormat: PurchaseIdentifierFormat
                    ) = purchaseIdentifierFormat(JsonField.of(purchaseIdentifierFormat))

                    /** The format of the purchase identifier. */
                    @JsonProperty("purchase_identifier_format")
                    @ExcludeMissing
                    fun purchaseIdentifierFormat(
                        purchaseIdentifierFormat: JsonField<PurchaseIdentifierFormat>
                    ) = apply { this.purchaseIdentifierFormat = purchaseIdentifierFormat }

                    /** Fields specific to travel. */
                    fun travel(travel: Travel) = travel(JsonField.of(travel))

                    /** Fields specific to travel. */
                    @JsonProperty("travel")
                    @ExcludeMissing
                    fun travel(travel: JsonField<Travel>) = apply { this.travel = travel }

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

                    fun build(): PurchaseDetails =
                        PurchaseDetails(
                            carRental,
                            customerReferenceIdentifier,
                            localTaxAmount,
                            localTaxCurrency,
                            lodging,
                            nationalTaxAmount,
                            nationalTaxCurrency,
                            purchaseIdentifier,
                            purchaseIdentifierFormat,
                            travel,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                /** Fields specific to car rentals. */
                @JsonDeserialize(builder = CarRental.Builder::class)
                @NoAutoDetect
                class CarRental
                private constructor(
                    private val carClassCode: JsonField<String>,
                    private val checkoutDate: JsonField<LocalDate>,
                    private val dailyRentalRateAmount: JsonField<Long>,
                    private val dailyRentalRateCurrency: JsonField<String>,
                    private val daysRented: JsonField<Long>,
                    private val extraCharges: JsonField<ExtraCharges>,
                    private val fuelChargesAmount: JsonField<Long>,
                    private val fuelChargesCurrency: JsonField<String>,
                    private val insuranceChargesAmount: JsonField<Long>,
                    private val insuranceChargesCurrency: JsonField<String>,
                    private val noShowIndicator: JsonField<NoShowIndicator>,
                    private val oneWayDropOffChargesAmount: JsonField<Long>,
                    private val oneWayDropOffChargesCurrency: JsonField<String>,
                    private val renterName: JsonField<String>,
                    private val weeklyRentalRateAmount: JsonField<Long>,
                    private val weeklyRentalRateCurrency: JsonField<String>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    /** Code indicating the vehicle's class. */
                    fun carClassCode(): Optional<String> =
                        Optional.ofNullable(carClassCode.getNullable("car_class_code"))

                    /**
                     * Date the customer picked up the car or, in the case of a no-show or pre-pay
                     * transaction, the scheduled pick up date.
                     */
                    fun checkoutDate(): Optional<LocalDate> =
                        Optional.ofNullable(checkoutDate.getNullable("checkout_date"))

                    /** Daily rate being charged for the vehicle. */
                    fun dailyRentalRateAmount(): Optional<Long> =
                        Optional.ofNullable(
                            dailyRentalRateAmount.getNullable("daily_rental_rate_amount")
                        )

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the daily
                     * rental rate.
                     */
                    fun dailyRentalRateCurrency(): Optional<String> =
                        Optional.ofNullable(
                            dailyRentalRateCurrency.getNullable("daily_rental_rate_currency")
                        )

                    /** Number of days the vehicle was rented. */
                    fun daysRented(): Optional<Long> =
                        Optional.ofNullable(daysRented.getNullable("days_rented"))

                    /** Additional charges (gas, late fee, etc.) being billed. */
                    fun extraCharges(): Optional<ExtraCharges> =
                        Optional.ofNullable(extraCharges.getNullable("extra_charges"))

                    /** Fuel charges for the vehicle. */
                    fun fuelChargesAmount(): Optional<Long> =
                        Optional.ofNullable(fuelChargesAmount.getNullable("fuel_charges_amount"))

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the fuel
                     * charges assessed.
                     */
                    fun fuelChargesCurrency(): Optional<String> =
                        Optional.ofNullable(
                            fuelChargesCurrency.getNullable("fuel_charges_currency")
                        )

                    /** Any insurance being charged for the vehicle. */
                    fun insuranceChargesAmount(): Optional<Long> =
                        Optional.ofNullable(
                            insuranceChargesAmount.getNullable("insurance_charges_amount")
                        )

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the insurance
                     * charges assessed.
                     */
                    fun insuranceChargesCurrency(): Optional<String> =
                        Optional.ofNullable(
                            insuranceChargesCurrency.getNullable("insurance_charges_currency")
                        )

                    /**
                     * An indicator that the cardholder is being billed for a reserved vehicle that
                     * was not actually rented (that is, a "no-show" charge).
                     */
                    fun noShowIndicator(): Optional<NoShowIndicator> =
                        Optional.ofNullable(noShowIndicator.getNullable("no_show_indicator"))

                    /**
                     * Charges for returning the vehicle at a different location than where it was
                     * picked up.
                     */
                    fun oneWayDropOffChargesAmount(): Optional<Long> =
                        Optional.ofNullable(
                            oneWayDropOffChargesAmount.getNullable(
                                "one_way_drop_off_charges_amount"
                            )
                        )

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the one-way
                     * drop-off charges assessed.
                     */
                    fun oneWayDropOffChargesCurrency(): Optional<String> =
                        Optional.ofNullable(
                            oneWayDropOffChargesCurrency.getNullable(
                                "one_way_drop_off_charges_currency"
                            )
                        )

                    /** Name of the person renting the vehicle. */
                    fun renterName(): Optional<String> =
                        Optional.ofNullable(renterName.getNullable("renter_name"))

                    /** Weekly rate being charged for the vehicle. */
                    fun weeklyRentalRateAmount(): Optional<Long> =
                        Optional.ofNullable(
                            weeklyRentalRateAmount.getNullable("weekly_rental_rate_amount")
                        )

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the weekly
                     * rental rate.
                     */
                    fun weeklyRentalRateCurrency(): Optional<String> =
                        Optional.ofNullable(
                            weeklyRentalRateCurrency.getNullable("weekly_rental_rate_currency")
                        )

                    /** Code indicating the vehicle's class. */
                    @JsonProperty("car_class_code")
                    @ExcludeMissing
                    fun _carClassCode() = carClassCode

                    /**
                     * Date the customer picked up the car or, in the case of a no-show or pre-pay
                     * transaction, the scheduled pick up date.
                     */
                    @JsonProperty("checkout_date")
                    @ExcludeMissing
                    fun _checkoutDate() = checkoutDate

                    /** Daily rate being charged for the vehicle. */
                    @JsonProperty("daily_rental_rate_amount")
                    @ExcludeMissing
                    fun _dailyRentalRateAmount() = dailyRentalRateAmount

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the daily
                     * rental rate.
                     */
                    @JsonProperty("daily_rental_rate_currency")
                    @ExcludeMissing
                    fun _dailyRentalRateCurrency() = dailyRentalRateCurrency

                    /** Number of days the vehicle was rented. */
                    @JsonProperty("days_rented") @ExcludeMissing fun _daysRented() = daysRented

                    /** Additional charges (gas, late fee, etc.) being billed. */
                    @JsonProperty("extra_charges")
                    @ExcludeMissing
                    fun _extraCharges() = extraCharges

                    /** Fuel charges for the vehicle. */
                    @JsonProperty("fuel_charges_amount")
                    @ExcludeMissing
                    fun _fuelChargesAmount() = fuelChargesAmount

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the fuel
                     * charges assessed.
                     */
                    @JsonProperty("fuel_charges_currency")
                    @ExcludeMissing
                    fun _fuelChargesCurrency() = fuelChargesCurrency

                    /** Any insurance being charged for the vehicle. */
                    @JsonProperty("insurance_charges_amount")
                    @ExcludeMissing
                    fun _insuranceChargesAmount() = insuranceChargesAmount

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the insurance
                     * charges assessed.
                     */
                    @JsonProperty("insurance_charges_currency")
                    @ExcludeMissing
                    fun _insuranceChargesCurrency() = insuranceChargesCurrency

                    /**
                     * An indicator that the cardholder is being billed for a reserved vehicle that
                     * was not actually rented (that is, a "no-show" charge).
                     */
                    @JsonProperty("no_show_indicator")
                    @ExcludeMissing
                    fun _noShowIndicator() = noShowIndicator

                    /**
                     * Charges for returning the vehicle at a different location than where it was
                     * picked up.
                     */
                    @JsonProperty("one_way_drop_off_charges_amount")
                    @ExcludeMissing
                    fun _oneWayDropOffChargesAmount() = oneWayDropOffChargesAmount

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the one-way
                     * drop-off charges assessed.
                     */
                    @JsonProperty("one_way_drop_off_charges_currency")
                    @ExcludeMissing
                    fun _oneWayDropOffChargesCurrency() = oneWayDropOffChargesCurrency

                    /** Name of the person renting the vehicle. */
                    @JsonProperty("renter_name") @ExcludeMissing fun _renterName() = renterName

                    /** Weekly rate being charged for the vehicle. */
                    @JsonProperty("weekly_rental_rate_amount")
                    @ExcludeMissing
                    fun _weeklyRentalRateAmount() = weeklyRentalRateAmount

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the weekly
                     * rental rate.
                     */
                    @JsonProperty("weekly_rental_rate_currency")
                    @ExcludeMissing
                    fun _weeklyRentalRateCurrency() = weeklyRentalRateCurrency

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): CarRental = apply {
                        if (!validated) {
                            carClassCode()
                            checkoutDate()
                            dailyRentalRateAmount()
                            dailyRentalRateCurrency()
                            daysRented()
                            extraCharges()
                            fuelChargesAmount()
                            fuelChargesCurrency()
                            insuranceChargesAmount()
                            insuranceChargesCurrency()
                            noShowIndicator()
                            oneWayDropOffChargesAmount()
                            oneWayDropOffChargesCurrency()
                            renterName()
                            weeklyRentalRateAmount()
                            weeklyRentalRateCurrency()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is CarRental &&
                            this.carClassCode == other.carClassCode &&
                            this.checkoutDate == other.checkoutDate &&
                            this.dailyRentalRateAmount == other.dailyRentalRateAmount &&
                            this.dailyRentalRateCurrency == other.dailyRentalRateCurrency &&
                            this.daysRented == other.daysRented &&
                            this.extraCharges == other.extraCharges &&
                            this.fuelChargesAmount == other.fuelChargesAmount &&
                            this.fuelChargesCurrency == other.fuelChargesCurrency &&
                            this.insuranceChargesAmount == other.insuranceChargesAmount &&
                            this.insuranceChargesCurrency == other.insuranceChargesCurrency &&
                            this.noShowIndicator == other.noShowIndicator &&
                            this.oneWayDropOffChargesAmount == other.oneWayDropOffChargesAmount &&
                            this.oneWayDropOffChargesCurrency ==
                                other.oneWayDropOffChargesCurrency &&
                            this.renterName == other.renterName &&
                            this.weeklyRentalRateAmount == other.weeklyRentalRateAmount &&
                            this.weeklyRentalRateCurrency == other.weeklyRentalRateCurrency &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode =
                                Objects.hash(
                                    carClassCode,
                                    checkoutDate,
                                    dailyRentalRateAmount,
                                    dailyRentalRateCurrency,
                                    daysRented,
                                    extraCharges,
                                    fuelChargesAmount,
                                    fuelChargesCurrency,
                                    insuranceChargesAmount,
                                    insuranceChargesCurrency,
                                    noShowIndicator,
                                    oneWayDropOffChargesAmount,
                                    oneWayDropOffChargesCurrency,
                                    renterName,
                                    weeklyRentalRateAmount,
                                    weeklyRentalRateCurrency,
                                    additionalProperties,
                                )
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "CarRental{carClassCode=$carClassCode, checkoutDate=$checkoutDate, dailyRentalRateAmount=$dailyRentalRateAmount, dailyRentalRateCurrency=$dailyRentalRateCurrency, daysRented=$daysRented, extraCharges=$extraCharges, fuelChargesAmount=$fuelChargesAmount, fuelChargesCurrency=$fuelChargesCurrency, insuranceChargesAmount=$insuranceChargesAmount, insuranceChargesCurrency=$insuranceChargesCurrency, noShowIndicator=$noShowIndicator, oneWayDropOffChargesAmount=$oneWayDropOffChargesAmount, oneWayDropOffChargesCurrency=$oneWayDropOffChargesCurrency, renterName=$renterName, weeklyRentalRateAmount=$weeklyRentalRateAmount, weeklyRentalRateCurrency=$weeklyRentalRateCurrency, additionalProperties=$additionalProperties}"

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var carClassCode: JsonField<String> = JsonMissing.of()
                        private var checkoutDate: JsonField<LocalDate> = JsonMissing.of()
                        private var dailyRentalRateAmount: JsonField<Long> = JsonMissing.of()
                        private var dailyRentalRateCurrency: JsonField<String> = JsonMissing.of()
                        private var daysRented: JsonField<Long> = JsonMissing.of()
                        private var extraCharges: JsonField<ExtraCharges> = JsonMissing.of()
                        private var fuelChargesAmount: JsonField<Long> = JsonMissing.of()
                        private var fuelChargesCurrency: JsonField<String> = JsonMissing.of()
                        private var insuranceChargesAmount: JsonField<Long> = JsonMissing.of()
                        private var insuranceChargesCurrency: JsonField<String> = JsonMissing.of()
                        private var noShowIndicator: JsonField<NoShowIndicator> = JsonMissing.of()
                        private var oneWayDropOffChargesAmount: JsonField<Long> = JsonMissing.of()
                        private var oneWayDropOffChargesCurrency: JsonField<String> =
                            JsonMissing.of()
                        private var renterName: JsonField<String> = JsonMissing.of()
                        private var weeklyRentalRateAmount: JsonField<Long> = JsonMissing.of()
                        private var weeklyRentalRateCurrency: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(carRental: CarRental) = apply {
                            this.carClassCode = carRental.carClassCode
                            this.checkoutDate = carRental.checkoutDate
                            this.dailyRentalRateAmount = carRental.dailyRentalRateAmount
                            this.dailyRentalRateCurrency = carRental.dailyRentalRateCurrency
                            this.daysRented = carRental.daysRented
                            this.extraCharges = carRental.extraCharges
                            this.fuelChargesAmount = carRental.fuelChargesAmount
                            this.fuelChargesCurrency = carRental.fuelChargesCurrency
                            this.insuranceChargesAmount = carRental.insuranceChargesAmount
                            this.insuranceChargesCurrency = carRental.insuranceChargesCurrency
                            this.noShowIndicator = carRental.noShowIndicator
                            this.oneWayDropOffChargesAmount = carRental.oneWayDropOffChargesAmount
                            this.oneWayDropOffChargesCurrency =
                                carRental.oneWayDropOffChargesCurrency
                            this.renterName = carRental.renterName
                            this.weeklyRentalRateAmount = carRental.weeklyRentalRateAmount
                            this.weeklyRentalRateCurrency = carRental.weeklyRentalRateCurrency
                            additionalProperties(carRental.additionalProperties)
                        }

                        /** Code indicating the vehicle's class. */
                        fun carClassCode(carClassCode: String) =
                            carClassCode(JsonField.of(carClassCode))

                        /** Code indicating the vehicle's class. */
                        @JsonProperty("car_class_code")
                        @ExcludeMissing
                        fun carClassCode(carClassCode: JsonField<String>) = apply {
                            this.carClassCode = carClassCode
                        }

                        /**
                         * Date the customer picked up the car or, in the case of a no-show or
                         * pre-pay transaction, the scheduled pick up date.
                         */
                        fun checkoutDate(checkoutDate: LocalDate) =
                            checkoutDate(JsonField.of(checkoutDate))

                        /**
                         * Date the customer picked up the car or, in the case of a no-show or
                         * pre-pay transaction, the scheduled pick up date.
                         */
                        @JsonProperty("checkout_date")
                        @ExcludeMissing
                        fun checkoutDate(checkoutDate: JsonField<LocalDate>) = apply {
                            this.checkoutDate = checkoutDate
                        }

                        /** Daily rate being charged for the vehicle. */
                        fun dailyRentalRateAmount(dailyRentalRateAmount: Long) =
                            dailyRentalRateAmount(JsonField.of(dailyRentalRateAmount))

                        /** Daily rate being charged for the vehicle. */
                        @JsonProperty("daily_rental_rate_amount")
                        @ExcludeMissing
                        fun dailyRentalRateAmount(dailyRentalRateAmount: JsonField<Long>) = apply {
                            this.dailyRentalRateAmount = dailyRentalRateAmount
                        }

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the daily
                         * rental rate.
                         */
                        fun dailyRentalRateCurrency(dailyRentalRateCurrency: String) =
                            dailyRentalRateCurrency(JsonField.of(dailyRentalRateCurrency))

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the daily
                         * rental rate.
                         */
                        @JsonProperty("daily_rental_rate_currency")
                        @ExcludeMissing
                        fun dailyRentalRateCurrency(dailyRentalRateCurrency: JsonField<String>) =
                            apply {
                                this.dailyRentalRateCurrency = dailyRentalRateCurrency
                            }

                        /** Number of days the vehicle was rented. */
                        fun daysRented(daysRented: Long) = daysRented(JsonField.of(daysRented))

                        /** Number of days the vehicle was rented. */
                        @JsonProperty("days_rented")
                        @ExcludeMissing
                        fun daysRented(daysRented: JsonField<Long>) = apply {
                            this.daysRented = daysRented
                        }

                        /** Additional charges (gas, late fee, etc.) being billed. */
                        fun extraCharges(extraCharges: ExtraCharges) =
                            extraCharges(JsonField.of(extraCharges))

                        /** Additional charges (gas, late fee, etc.) being billed. */
                        @JsonProperty("extra_charges")
                        @ExcludeMissing
                        fun extraCharges(extraCharges: JsonField<ExtraCharges>) = apply {
                            this.extraCharges = extraCharges
                        }

                        /** Fuel charges for the vehicle. */
                        fun fuelChargesAmount(fuelChargesAmount: Long) =
                            fuelChargesAmount(JsonField.of(fuelChargesAmount))

                        /** Fuel charges for the vehicle. */
                        @JsonProperty("fuel_charges_amount")
                        @ExcludeMissing
                        fun fuelChargesAmount(fuelChargesAmount: JsonField<Long>) = apply {
                            this.fuelChargesAmount = fuelChargesAmount
                        }

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the fuel
                         * charges assessed.
                         */
                        fun fuelChargesCurrency(fuelChargesCurrency: String) =
                            fuelChargesCurrency(JsonField.of(fuelChargesCurrency))

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the fuel
                         * charges assessed.
                         */
                        @JsonProperty("fuel_charges_currency")
                        @ExcludeMissing
                        fun fuelChargesCurrency(fuelChargesCurrency: JsonField<String>) = apply {
                            this.fuelChargesCurrency = fuelChargesCurrency
                        }

                        /** Any insurance being charged for the vehicle. */
                        fun insuranceChargesAmount(insuranceChargesAmount: Long) =
                            insuranceChargesAmount(JsonField.of(insuranceChargesAmount))

                        /** Any insurance being charged for the vehicle. */
                        @JsonProperty("insurance_charges_amount")
                        @ExcludeMissing
                        fun insuranceChargesAmount(insuranceChargesAmount: JsonField<Long>) =
                            apply {
                                this.insuranceChargesAmount = insuranceChargesAmount
                            }

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                         * insurance charges assessed.
                         */
                        fun insuranceChargesCurrency(insuranceChargesCurrency: String) =
                            insuranceChargesCurrency(JsonField.of(insuranceChargesCurrency))

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                         * insurance charges assessed.
                         */
                        @JsonProperty("insurance_charges_currency")
                        @ExcludeMissing
                        fun insuranceChargesCurrency(insuranceChargesCurrency: JsonField<String>) =
                            apply {
                                this.insuranceChargesCurrency = insuranceChargesCurrency
                            }

                        /**
                         * An indicator that the cardholder is being billed for a reserved vehicle
                         * that was not actually rented (that is, a "no-show" charge).
                         */
                        fun noShowIndicator(noShowIndicator: NoShowIndicator) =
                            noShowIndicator(JsonField.of(noShowIndicator))

                        /**
                         * An indicator that the cardholder is being billed for a reserved vehicle
                         * that was not actually rented (that is, a "no-show" charge).
                         */
                        @JsonProperty("no_show_indicator")
                        @ExcludeMissing
                        fun noShowIndicator(noShowIndicator: JsonField<NoShowIndicator>) = apply {
                            this.noShowIndicator = noShowIndicator
                        }

                        /**
                         * Charges for returning the vehicle at a different location than where it
                         * was picked up.
                         */
                        fun oneWayDropOffChargesAmount(oneWayDropOffChargesAmount: Long) =
                            oneWayDropOffChargesAmount(JsonField.of(oneWayDropOffChargesAmount))

                        /**
                         * Charges for returning the vehicle at a different location than where it
                         * was picked up.
                         */
                        @JsonProperty("one_way_drop_off_charges_amount")
                        @ExcludeMissing
                        fun oneWayDropOffChargesAmount(
                            oneWayDropOffChargesAmount: JsonField<Long>
                        ) = apply { this.oneWayDropOffChargesAmount = oneWayDropOffChargesAmount }

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                         * one-way drop-off charges assessed.
                         */
                        fun oneWayDropOffChargesCurrency(oneWayDropOffChargesCurrency: String) =
                            oneWayDropOffChargesCurrency(JsonField.of(oneWayDropOffChargesCurrency))

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                         * one-way drop-off charges assessed.
                         */
                        @JsonProperty("one_way_drop_off_charges_currency")
                        @ExcludeMissing
                        fun oneWayDropOffChargesCurrency(
                            oneWayDropOffChargesCurrency: JsonField<String>
                        ) = apply {
                            this.oneWayDropOffChargesCurrency = oneWayDropOffChargesCurrency
                        }

                        /** Name of the person renting the vehicle. */
                        fun renterName(renterName: String) = renterName(JsonField.of(renterName))

                        /** Name of the person renting the vehicle. */
                        @JsonProperty("renter_name")
                        @ExcludeMissing
                        fun renterName(renterName: JsonField<String>) = apply {
                            this.renterName = renterName
                        }

                        /** Weekly rate being charged for the vehicle. */
                        fun weeklyRentalRateAmount(weeklyRentalRateAmount: Long) =
                            weeklyRentalRateAmount(JsonField.of(weeklyRentalRateAmount))

                        /** Weekly rate being charged for the vehicle. */
                        @JsonProperty("weekly_rental_rate_amount")
                        @ExcludeMissing
                        fun weeklyRentalRateAmount(weeklyRentalRateAmount: JsonField<Long>) =
                            apply {
                                this.weeklyRentalRateAmount = weeklyRentalRateAmount
                            }

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                         * weekly rental rate.
                         */
                        fun weeklyRentalRateCurrency(weeklyRentalRateCurrency: String) =
                            weeklyRentalRateCurrency(JsonField.of(weeklyRentalRateCurrency))

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                         * weekly rental rate.
                         */
                        @JsonProperty("weekly_rental_rate_currency")
                        @ExcludeMissing
                        fun weeklyRentalRateCurrency(weeklyRentalRateCurrency: JsonField<String>) =
                            apply {
                                this.weeklyRentalRateCurrency = weeklyRentalRateCurrency
                            }

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

                        fun build(): CarRental =
                            CarRental(
                                carClassCode,
                                checkoutDate,
                                dailyRentalRateAmount,
                                dailyRentalRateCurrency,
                                daysRented,
                                extraCharges,
                                fuelChargesAmount,
                                fuelChargesCurrency,
                                insuranceChargesAmount,
                                insuranceChargesCurrency,
                                noShowIndicator,
                                oneWayDropOffChargesAmount,
                                oneWayDropOffChargesCurrency,
                                renterName,
                                weeklyRentalRateAmount,
                                weeklyRentalRateCurrency,
                                additionalProperties.toUnmodifiable(),
                            )
                    }

                    class ExtraCharges
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

                            return other is ExtraCharges && this.value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()

                        companion object {

                            @JvmField
                            val NO_EXTRA_CHARGE = ExtraCharges(JsonField.of("no_extra_charge"))

                            @JvmField val GAS = ExtraCharges(JsonField.of("gas"))

                            @JvmField
                            val EXTRA_MILEAGE = ExtraCharges(JsonField.of("extra_mileage"))

                            @JvmField val LATE_RETURN = ExtraCharges(JsonField.of("late_return"))

                            @JvmField
                            val ONE_WAY_SERVICE_FEE =
                                ExtraCharges(JsonField.of("one_way_service_fee"))

                            @JvmField
                            val PARKING_VIOLATION = ExtraCharges(JsonField.of("parking_violation"))

                            @JvmStatic fun of(value: String) = ExtraCharges(JsonField.of(value))
                        }

                        enum class Known {
                            NO_EXTRA_CHARGE,
                            GAS,
                            EXTRA_MILEAGE,
                            LATE_RETURN,
                            ONE_WAY_SERVICE_FEE,
                            PARKING_VIOLATION,
                        }

                        enum class Value {
                            NO_EXTRA_CHARGE,
                            GAS,
                            EXTRA_MILEAGE,
                            LATE_RETURN,
                            ONE_WAY_SERVICE_FEE,
                            PARKING_VIOLATION,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                NO_EXTRA_CHARGE -> Value.NO_EXTRA_CHARGE
                                GAS -> Value.GAS
                                EXTRA_MILEAGE -> Value.EXTRA_MILEAGE
                                LATE_RETURN -> Value.LATE_RETURN
                                ONE_WAY_SERVICE_FEE -> Value.ONE_WAY_SERVICE_FEE
                                PARKING_VIOLATION -> Value.PARKING_VIOLATION
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                NO_EXTRA_CHARGE -> Known.NO_EXTRA_CHARGE
                                GAS -> Known.GAS
                                EXTRA_MILEAGE -> Known.EXTRA_MILEAGE
                                LATE_RETURN -> Known.LATE_RETURN
                                ONE_WAY_SERVICE_FEE -> Known.ONE_WAY_SERVICE_FEE
                                PARKING_VIOLATION -> Known.PARKING_VIOLATION
                                else ->
                                    throw IncreaseInvalidDataException(
                                        "Unknown ExtraCharges: $value"
                                    )
                            }

                        fun asString(): String = _value().asStringOrThrow()
                    }

                    class NoShowIndicator
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

                            return other is NoShowIndicator && this.value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()

                        companion object {

                            @JvmField
                            val NOT_APPLICABLE = NoShowIndicator(JsonField.of("not_applicable"))

                            @JvmField
                            val NO_SHOW_FOR_SPECIALIZED_VEHICLE =
                                NoShowIndicator(JsonField.of("no_show_for_specialized_vehicle"))

                            @JvmStatic fun of(value: String) = NoShowIndicator(JsonField.of(value))
                        }

                        enum class Known {
                            NOT_APPLICABLE,
                            NO_SHOW_FOR_SPECIALIZED_VEHICLE,
                        }

                        enum class Value {
                            NOT_APPLICABLE,
                            NO_SHOW_FOR_SPECIALIZED_VEHICLE,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                NOT_APPLICABLE -> Value.NOT_APPLICABLE
                                NO_SHOW_FOR_SPECIALIZED_VEHICLE ->
                                    Value.NO_SHOW_FOR_SPECIALIZED_VEHICLE
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                NOT_APPLICABLE -> Known.NOT_APPLICABLE
                                NO_SHOW_FOR_SPECIALIZED_VEHICLE ->
                                    Known.NO_SHOW_FOR_SPECIALIZED_VEHICLE
                                else ->
                                    throw IncreaseInvalidDataException(
                                        "Unknown NoShowIndicator: $value"
                                    )
                            }

                        fun asString(): String = _value().asStringOrThrow()
                    }
                }

                /** Fields specific to lodging. */
                @JsonDeserialize(builder = Lodging.Builder::class)
                @NoAutoDetect
                class Lodging
                private constructor(
                    private val checkInDate: JsonField<LocalDate>,
                    private val dailyRoomRateAmount: JsonField<Long>,
                    private val dailyRoomRateCurrency: JsonField<String>,
                    private val extraCharges: JsonField<ExtraCharges>,
                    private val folioCashAdvancesAmount: JsonField<Long>,
                    private val folioCashAdvancesCurrency: JsonField<String>,
                    private val foodBeverageChargesAmount: JsonField<Long>,
                    private val foodBeverageChargesCurrency: JsonField<String>,
                    private val noShowIndicator: JsonField<NoShowIndicator>,
                    private val prepaidExpensesAmount: JsonField<Long>,
                    private val prepaidExpensesCurrency: JsonField<String>,
                    private val roomNights: JsonField<Long>,
                    private val totalRoomTaxAmount: JsonField<Long>,
                    private val totalRoomTaxCurrency: JsonField<String>,
                    private val totalTaxAmount: JsonField<Long>,
                    private val totalTaxCurrency: JsonField<String>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    /** Date the customer checked in. */
                    fun checkInDate(): Optional<LocalDate> =
                        Optional.ofNullable(checkInDate.getNullable("check_in_date"))

                    /** Daily rate being charged for the room. */
                    fun dailyRoomRateAmount(): Optional<Long> =
                        Optional.ofNullable(
                            dailyRoomRateAmount.getNullable("daily_room_rate_amount")
                        )

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the daily
                     * room rate.
                     */
                    fun dailyRoomRateCurrency(): Optional<String> =
                        Optional.ofNullable(
                            dailyRoomRateCurrency.getNullable("daily_room_rate_currency")
                        )

                    /** Additional charges (phone, late check-out, etc.) being billed. */
                    fun extraCharges(): Optional<ExtraCharges> =
                        Optional.ofNullable(extraCharges.getNullable("extra_charges"))

                    /** Folio cash advances for the room. */
                    fun folioCashAdvancesAmount(): Optional<Long> =
                        Optional.ofNullable(
                            folioCashAdvancesAmount.getNullable("folio_cash_advances_amount")
                        )

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the folio
                     * cash advances.
                     */
                    fun folioCashAdvancesCurrency(): Optional<String> =
                        Optional.ofNullable(
                            folioCashAdvancesCurrency.getNullable("folio_cash_advances_currency")
                        )

                    /** Food and beverage charges for the room. */
                    fun foodBeverageChargesAmount(): Optional<Long> =
                        Optional.ofNullable(
                            foodBeverageChargesAmount.getNullable("food_beverage_charges_amount")
                        )

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the food and
                     * beverage charges.
                     */
                    fun foodBeverageChargesCurrency(): Optional<String> =
                        Optional.ofNullable(
                            foodBeverageChargesCurrency.getNullable(
                                "food_beverage_charges_currency"
                            )
                        )

                    /**
                     * Indicator that the cardholder is being billed for a reserved room that was
                     * not actually used.
                     */
                    fun noShowIndicator(): Optional<NoShowIndicator> =
                        Optional.ofNullable(noShowIndicator.getNullable("no_show_indicator"))

                    /** Prepaid expenses being charged for the room. */
                    fun prepaidExpensesAmount(): Optional<Long> =
                        Optional.ofNullable(
                            prepaidExpensesAmount.getNullable("prepaid_expenses_amount")
                        )

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the prepaid
                     * expenses.
                     */
                    fun prepaidExpensesCurrency(): Optional<String> =
                        Optional.ofNullable(
                            prepaidExpensesCurrency.getNullable("prepaid_expenses_currency")
                        )

                    /** Number of nights the room was rented. */
                    fun roomNights(): Optional<Long> =
                        Optional.ofNullable(roomNights.getNullable("room_nights"))

                    /** Total room tax being charged. */
                    fun totalRoomTaxAmount(): Optional<Long> =
                        Optional.ofNullable(totalRoomTaxAmount.getNullable("total_room_tax_amount"))

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the total
                     * room tax.
                     */
                    fun totalRoomTaxCurrency(): Optional<String> =
                        Optional.ofNullable(
                            totalRoomTaxCurrency.getNullable("total_room_tax_currency")
                        )

                    /** Total tax being charged for the room. */
                    fun totalTaxAmount(): Optional<Long> =
                        Optional.ofNullable(totalTaxAmount.getNullable("total_tax_amount"))

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the total tax
                     * assessed.
                     */
                    fun totalTaxCurrency(): Optional<String> =
                        Optional.ofNullable(totalTaxCurrency.getNullable("total_tax_currency"))

                    /** Date the customer checked in. */
                    @JsonProperty("check_in_date") @ExcludeMissing fun _checkInDate() = checkInDate

                    /** Daily rate being charged for the room. */
                    @JsonProperty("daily_room_rate_amount")
                    @ExcludeMissing
                    fun _dailyRoomRateAmount() = dailyRoomRateAmount

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the daily
                     * room rate.
                     */
                    @JsonProperty("daily_room_rate_currency")
                    @ExcludeMissing
                    fun _dailyRoomRateCurrency() = dailyRoomRateCurrency

                    /** Additional charges (phone, late check-out, etc.) being billed. */
                    @JsonProperty("extra_charges")
                    @ExcludeMissing
                    fun _extraCharges() = extraCharges

                    /** Folio cash advances for the room. */
                    @JsonProperty("folio_cash_advances_amount")
                    @ExcludeMissing
                    fun _folioCashAdvancesAmount() = folioCashAdvancesAmount

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the folio
                     * cash advances.
                     */
                    @JsonProperty("folio_cash_advances_currency")
                    @ExcludeMissing
                    fun _folioCashAdvancesCurrency() = folioCashAdvancesCurrency

                    /** Food and beverage charges for the room. */
                    @JsonProperty("food_beverage_charges_amount")
                    @ExcludeMissing
                    fun _foodBeverageChargesAmount() = foodBeverageChargesAmount

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the food and
                     * beverage charges.
                     */
                    @JsonProperty("food_beverage_charges_currency")
                    @ExcludeMissing
                    fun _foodBeverageChargesCurrency() = foodBeverageChargesCurrency

                    /**
                     * Indicator that the cardholder is being billed for a reserved room that was
                     * not actually used.
                     */
                    @JsonProperty("no_show_indicator")
                    @ExcludeMissing
                    fun _noShowIndicator() = noShowIndicator

                    /** Prepaid expenses being charged for the room. */
                    @JsonProperty("prepaid_expenses_amount")
                    @ExcludeMissing
                    fun _prepaidExpensesAmount() = prepaidExpensesAmount

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the prepaid
                     * expenses.
                     */
                    @JsonProperty("prepaid_expenses_currency")
                    @ExcludeMissing
                    fun _prepaidExpensesCurrency() = prepaidExpensesCurrency

                    /** Number of nights the room was rented. */
                    @JsonProperty("room_nights") @ExcludeMissing fun _roomNights() = roomNights

                    /** Total room tax being charged. */
                    @JsonProperty("total_room_tax_amount")
                    @ExcludeMissing
                    fun _totalRoomTaxAmount() = totalRoomTaxAmount

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the total
                     * room tax.
                     */
                    @JsonProperty("total_room_tax_currency")
                    @ExcludeMissing
                    fun _totalRoomTaxCurrency() = totalRoomTaxCurrency

                    /** Total tax being charged for the room. */
                    @JsonProperty("total_tax_amount")
                    @ExcludeMissing
                    fun _totalTaxAmount() = totalTaxAmount

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the total tax
                     * assessed.
                     */
                    @JsonProperty("total_tax_currency")
                    @ExcludeMissing
                    fun _totalTaxCurrency() = totalTaxCurrency

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): Lodging = apply {
                        if (!validated) {
                            checkInDate()
                            dailyRoomRateAmount()
                            dailyRoomRateCurrency()
                            extraCharges()
                            folioCashAdvancesAmount()
                            folioCashAdvancesCurrency()
                            foodBeverageChargesAmount()
                            foodBeverageChargesCurrency()
                            noShowIndicator()
                            prepaidExpensesAmount()
                            prepaidExpensesCurrency()
                            roomNights()
                            totalRoomTaxAmount()
                            totalRoomTaxCurrency()
                            totalTaxAmount()
                            totalTaxCurrency()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Lodging &&
                            this.checkInDate == other.checkInDate &&
                            this.dailyRoomRateAmount == other.dailyRoomRateAmount &&
                            this.dailyRoomRateCurrency == other.dailyRoomRateCurrency &&
                            this.extraCharges == other.extraCharges &&
                            this.folioCashAdvancesAmount == other.folioCashAdvancesAmount &&
                            this.folioCashAdvancesCurrency == other.folioCashAdvancesCurrency &&
                            this.foodBeverageChargesAmount == other.foodBeverageChargesAmount &&
                            this.foodBeverageChargesCurrency == other.foodBeverageChargesCurrency &&
                            this.noShowIndicator == other.noShowIndicator &&
                            this.prepaidExpensesAmount == other.prepaidExpensesAmount &&
                            this.prepaidExpensesCurrency == other.prepaidExpensesCurrency &&
                            this.roomNights == other.roomNights &&
                            this.totalRoomTaxAmount == other.totalRoomTaxAmount &&
                            this.totalRoomTaxCurrency == other.totalRoomTaxCurrency &&
                            this.totalTaxAmount == other.totalTaxAmount &&
                            this.totalTaxCurrency == other.totalTaxCurrency &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode =
                                Objects.hash(
                                    checkInDate,
                                    dailyRoomRateAmount,
                                    dailyRoomRateCurrency,
                                    extraCharges,
                                    folioCashAdvancesAmount,
                                    folioCashAdvancesCurrency,
                                    foodBeverageChargesAmount,
                                    foodBeverageChargesCurrency,
                                    noShowIndicator,
                                    prepaidExpensesAmount,
                                    prepaidExpensesCurrency,
                                    roomNights,
                                    totalRoomTaxAmount,
                                    totalRoomTaxCurrency,
                                    totalTaxAmount,
                                    totalTaxCurrency,
                                    additionalProperties,
                                )
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "Lodging{checkInDate=$checkInDate, dailyRoomRateAmount=$dailyRoomRateAmount, dailyRoomRateCurrency=$dailyRoomRateCurrency, extraCharges=$extraCharges, folioCashAdvancesAmount=$folioCashAdvancesAmount, folioCashAdvancesCurrency=$folioCashAdvancesCurrency, foodBeverageChargesAmount=$foodBeverageChargesAmount, foodBeverageChargesCurrency=$foodBeverageChargesCurrency, noShowIndicator=$noShowIndicator, prepaidExpensesAmount=$prepaidExpensesAmount, prepaidExpensesCurrency=$prepaidExpensesCurrency, roomNights=$roomNights, totalRoomTaxAmount=$totalRoomTaxAmount, totalRoomTaxCurrency=$totalRoomTaxCurrency, totalTaxAmount=$totalTaxAmount, totalTaxCurrency=$totalTaxCurrency, additionalProperties=$additionalProperties}"

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var checkInDate: JsonField<LocalDate> = JsonMissing.of()
                        private var dailyRoomRateAmount: JsonField<Long> = JsonMissing.of()
                        private var dailyRoomRateCurrency: JsonField<String> = JsonMissing.of()
                        private var extraCharges: JsonField<ExtraCharges> = JsonMissing.of()
                        private var folioCashAdvancesAmount: JsonField<Long> = JsonMissing.of()
                        private var folioCashAdvancesCurrency: JsonField<String> = JsonMissing.of()
                        private var foodBeverageChargesAmount: JsonField<Long> = JsonMissing.of()
                        private var foodBeverageChargesCurrency: JsonField<String> =
                            JsonMissing.of()
                        private var noShowIndicator: JsonField<NoShowIndicator> = JsonMissing.of()
                        private var prepaidExpensesAmount: JsonField<Long> = JsonMissing.of()
                        private var prepaidExpensesCurrency: JsonField<String> = JsonMissing.of()
                        private var roomNights: JsonField<Long> = JsonMissing.of()
                        private var totalRoomTaxAmount: JsonField<Long> = JsonMissing.of()
                        private var totalRoomTaxCurrency: JsonField<String> = JsonMissing.of()
                        private var totalTaxAmount: JsonField<Long> = JsonMissing.of()
                        private var totalTaxCurrency: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(lodging: Lodging) = apply {
                            this.checkInDate = lodging.checkInDate
                            this.dailyRoomRateAmount = lodging.dailyRoomRateAmount
                            this.dailyRoomRateCurrency = lodging.dailyRoomRateCurrency
                            this.extraCharges = lodging.extraCharges
                            this.folioCashAdvancesAmount = lodging.folioCashAdvancesAmount
                            this.folioCashAdvancesCurrency = lodging.folioCashAdvancesCurrency
                            this.foodBeverageChargesAmount = lodging.foodBeverageChargesAmount
                            this.foodBeverageChargesCurrency = lodging.foodBeverageChargesCurrency
                            this.noShowIndicator = lodging.noShowIndicator
                            this.prepaidExpensesAmount = lodging.prepaidExpensesAmount
                            this.prepaidExpensesCurrency = lodging.prepaidExpensesCurrency
                            this.roomNights = lodging.roomNights
                            this.totalRoomTaxAmount = lodging.totalRoomTaxAmount
                            this.totalRoomTaxCurrency = lodging.totalRoomTaxCurrency
                            this.totalTaxAmount = lodging.totalTaxAmount
                            this.totalTaxCurrency = lodging.totalTaxCurrency
                            additionalProperties(lodging.additionalProperties)
                        }

                        /** Date the customer checked in. */
                        fun checkInDate(checkInDate: LocalDate) =
                            checkInDate(JsonField.of(checkInDate))

                        /** Date the customer checked in. */
                        @JsonProperty("check_in_date")
                        @ExcludeMissing
                        fun checkInDate(checkInDate: JsonField<LocalDate>) = apply {
                            this.checkInDate = checkInDate
                        }

                        /** Daily rate being charged for the room. */
                        fun dailyRoomRateAmount(dailyRoomRateAmount: Long) =
                            dailyRoomRateAmount(JsonField.of(dailyRoomRateAmount))

                        /** Daily rate being charged for the room. */
                        @JsonProperty("daily_room_rate_amount")
                        @ExcludeMissing
                        fun dailyRoomRateAmount(dailyRoomRateAmount: JsonField<Long>) = apply {
                            this.dailyRoomRateAmount = dailyRoomRateAmount
                        }

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the daily
                         * room rate.
                         */
                        fun dailyRoomRateCurrency(dailyRoomRateCurrency: String) =
                            dailyRoomRateCurrency(JsonField.of(dailyRoomRateCurrency))

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the daily
                         * room rate.
                         */
                        @JsonProperty("daily_room_rate_currency")
                        @ExcludeMissing
                        fun dailyRoomRateCurrency(dailyRoomRateCurrency: JsonField<String>) =
                            apply {
                                this.dailyRoomRateCurrency = dailyRoomRateCurrency
                            }

                        /** Additional charges (phone, late check-out, etc.) being billed. */
                        fun extraCharges(extraCharges: ExtraCharges) =
                            extraCharges(JsonField.of(extraCharges))

                        /** Additional charges (phone, late check-out, etc.) being billed. */
                        @JsonProperty("extra_charges")
                        @ExcludeMissing
                        fun extraCharges(extraCharges: JsonField<ExtraCharges>) = apply {
                            this.extraCharges = extraCharges
                        }

                        /** Folio cash advances for the room. */
                        fun folioCashAdvancesAmount(folioCashAdvancesAmount: Long) =
                            folioCashAdvancesAmount(JsonField.of(folioCashAdvancesAmount))

                        /** Folio cash advances for the room. */
                        @JsonProperty("folio_cash_advances_amount")
                        @ExcludeMissing
                        fun folioCashAdvancesAmount(folioCashAdvancesAmount: JsonField<Long>) =
                            apply {
                                this.folioCashAdvancesAmount = folioCashAdvancesAmount
                            }

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the folio
                         * cash advances.
                         */
                        fun folioCashAdvancesCurrency(folioCashAdvancesCurrency: String) =
                            folioCashAdvancesCurrency(JsonField.of(folioCashAdvancesCurrency))

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the folio
                         * cash advances.
                         */
                        @JsonProperty("folio_cash_advances_currency")
                        @ExcludeMissing
                        fun folioCashAdvancesCurrency(
                            folioCashAdvancesCurrency: JsonField<String>
                        ) = apply { this.folioCashAdvancesCurrency = folioCashAdvancesCurrency }

                        /** Food and beverage charges for the room. */
                        fun foodBeverageChargesAmount(foodBeverageChargesAmount: Long) =
                            foodBeverageChargesAmount(JsonField.of(foodBeverageChargesAmount))

                        /** Food and beverage charges for the room. */
                        @JsonProperty("food_beverage_charges_amount")
                        @ExcludeMissing
                        fun foodBeverageChargesAmount(foodBeverageChargesAmount: JsonField<Long>) =
                            apply {
                                this.foodBeverageChargesAmount = foodBeverageChargesAmount
                            }

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the food
                         * and beverage charges.
                         */
                        fun foodBeverageChargesCurrency(foodBeverageChargesCurrency: String) =
                            foodBeverageChargesCurrency(JsonField.of(foodBeverageChargesCurrency))

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the food
                         * and beverage charges.
                         */
                        @JsonProperty("food_beverage_charges_currency")
                        @ExcludeMissing
                        fun foodBeverageChargesCurrency(
                            foodBeverageChargesCurrency: JsonField<String>
                        ) = apply { this.foodBeverageChargesCurrency = foodBeverageChargesCurrency }

                        /**
                         * Indicator that the cardholder is being billed for a reserved room that
                         * was not actually used.
                         */
                        fun noShowIndicator(noShowIndicator: NoShowIndicator) =
                            noShowIndicator(JsonField.of(noShowIndicator))

                        /**
                         * Indicator that the cardholder is being billed for a reserved room that
                         * was not actually used.
                         */
                        @JsonProperty("no_show_indicator")
                        @ExcludeMissing
                        fun noShowIndicator(noShowIndicator: JsonField<NoShowIndicator>) = apply {
                            this.noShowIndicator = noShowIndicator
                        }

                        /** Prepaid expenses being charged for the room. */
                        fun prepaidExpensesAmount(prepaidExpensesAmount: Long) =
                            prepaidExpensesAmount(JsonField.of(prepaidExpensesAmount))

                        /** Prepaid expenses being charged for the room. */
                        @JsonProperty("prepaid_expenses_amount")
                        @ExcludeMissing
                        fun prepaidExpensesAmount(prepaidExpensesAmount: JsonField<Long>) = apply {
                            this.prepaidExpensesAmount = prepaidExpensesAmount
                        }

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                         * prepaid expenses.
                         */
                        fun prepaidExpensesCurrency(prepaidExpensesCurrency: String) =
                            prepaidExpensesCurrency(JsonField.of(prepaidExpensesCurrency))

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                         * prepaid expenses.
                         */
                        @JsonProperty("prepaid_expenses_currency")
                        @ExcludeMissing
                        fun prepaidExpensesCurrency(prepaidExpensesCurrency: JsonField<String>) =
                            apply {
                                this.prepaidExpensesCurrency = prepaidExpensesCurrency
                            }

                        /** Number of nights the room was rented. */
                        fun roomNights(roomNights: Long) = roomNights(JsonField.of(roomNights))

                        /** Number of nights the room was rented. */
                        @JsonProperty("room_nights")
                        @ExcludeMissing
                        fun roomNights(roomNights: JsonField<Long>) = apply {
                            this.roomNights = roomNights
                        }

                        /** Total room tax being charged. */
                        fun totalRoomTaxAmount(totalRoomTaxAmount: Long) =
                            totalRoomTaxAmount(JsonField.of(totalRoomTaxAmount))

                        /** Total room tax being charged. */
                        @JsonProperty("total_room_tax_amount")
                        @ExcludeMissing
                        fun totalRoomTaxAmount(totalRoomTaxAmount: JsonField<Long>) = apply {
                            this.totalRoomTaxAmount = totalRoomTaxAmount
                        }

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the total
                         * room tax.
                         */
                        fun totalRoomTaxCurrency(totalRoomTaxCurrency: String) =
                            totalRoomTaxCurrency(JsonField.of(totalRoomTaxCurrency))

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the total
                         * room tax.
                         */
                        @JsonProperty("total_room_tax_currency")
                        @ExcludeMissing
                        fun totalRoomTaxCurrency(totalRoomTaxCurrency: JsonField<String>) = apply {
                            this.totalRoomTaxCurrency = totalRoomTaxCurrency
                        }

                        /** Total tax being charged for the room. */
                        fun totalTaxAmount(totalTaxAmount: Long) =
                            totalTaxAmount(JsonField.of(totalTaxAmount))

                        /** Total tax being charged for the room. */
                        @JsonProperty("total_tax_amount")
                        @ExcludeMissing
                        fun totalTaxAmount(totalTaxAmount: JsonField<Long>) = apply {
                            this.totalTaxAmount = totalTaxAmount
                        }

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the total
                         * tax assessed.
                         */
                        fun totalTaxCurrency(totalTaxCurrency: String) =
                            totalTaxCurrency(JsonField.of(totalTaxCurrency))

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the total
                         * tax assessed.
                         */
                        @JsonProperty("total_tax_currency")
                        @ExcludeMissing
                        fun totalTaxCurrency(totalTaxCurrency: JsonField<String>) = apply {
                            this.totalTaxCurrency = totalTaxCurrency
                        }

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

                        fun build(): Lodging =
                            Lodging(
                                checkInDate,
                                dailyRoomRateAmount,
                                dailyRoomRateCurrency,
                                extraCharges,
                                folioCashAdvancesAmount,
                                folioCashAdvancesCurrency,
                                foodBeverageChargesAmount,
                                foodBeverageChargesCurrency,
                                noShowIndicator,
                                prepaidExpensesAmount,
                                prepaidExpensesCurrency,
                                roomNights,
                                totalRoomTaxAmount,
                                totalRoomTaxCurrency,
                                totalTaxAmount,
                                totalTaxCurrency,
                                additionalProperties.toUnmodifiable(),
                            )
                    }

                    class ExtraCharges
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

                            return other is ExtraCharges && this.value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()

                        companion object {

                            @JvmField
                            val NO_EXTRA_CHARGE = ExtraCharges(JsonField.of("no_extra_charge"))

                            @JvmField val RESTAURANT = ExtraCharges(JsonField.of("restaurant"))

                            @JvmField val GIFT_SHOP = ExtraCharges(JsonField.of("gift_shop"))

                            @JvmField val MINI_BAR = ExtraCharges(JsonField.of("mini_bar"))

                            @JvmField val TELEPHONE = ExtraCharges(JsonField.of("telephone"))

                            @JvmField val OTHER = ExtraCharges(JsonField.of("other"))

                            @JvmField val LAUNDRY = ExtraCharges(JsonField.of("laundry"))

                            @JvmStatic fun of(value: String) = ExtraCharges(JsonField.of(value))
                        }

                        enum class Known {
                            NO_EXTRA_CHARGE,
                            RESTAURANT,
                            GIFT_SHOP,
                            MINI_BAR,
                            TELEPHONE,
                            OTHER,
                            LAUNDRY,
                        }

                        enum class Value {
                            NO_EXTRA_CHARGE,
                            RESTAURANT,
                            GIFT_SHOP,
                            MINI_BAR,
                            TELEPHONE,
                            OTHER,
                            LAUNDRY,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                NO_EXTRA_CHARGE -> Value.NO_EXTRA_CHARGE
                                RESTAURANT -> Value.RESTAURANT
                                GIFT_SHOP -> Value.GIFT_SHOP
                                MINI_BAR -> Value.MINI_BAR
                                TELEPHONE -> Value.TELEPHONE
                                OTHER -> Value.OTHER
                                LAUNDRY -> Value.LAUNDRY
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                NO_EXTRA_CHARGE -> Known.NO_EXTRA_CHARGE
                                RESTAURANT -> Known.RESTAURANT
                                GIFT_SHOP -> Known.GIFT_SHOP
                                MINI_BAR -> Known.MINI_BAR
                                TELEPHONE -> Known.TELEPHONE
                                OTHER -> Known.OTHER
                                LAUNDRY -> Known.LAUNDRY
                                else ->
                                    throw IncreaseInvalidDataException(
                                        "Unknown ExtraCharges: $value"
                                    )
                            }

                        fun asString(): String = _value().asStringOrThrow()
                    }

                    class NoShowIndicator
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

                            return other is NoShowIndicator && this.value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()

                        companion object {

                            @JvmField
                            val NOT_APPLICABLE = NoShowIndicator(JsonField.of("not_applicable"))

                            @JvmField val NO_SHOW = NoShowIndicator(JsonField.of("no_show"))

                            @JvmStatic fun of(value: String) = NoShowIndicator(JsonField.of(value))
                        }

                        enum class Known {
                            NOT_APPLICABLE,
                            NO_SHOW,
                        }

                        enum class Value {
                            NOT_APPLICABLE,
                            NO_SHOW,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                NOT_APPLICABLE -> Value.NOT_APPLICABLE
                                NO_SHOW -> Value.NO_SHOW
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                NOT_APPLICABLE -> Known.NOT_APPLICABLE
                                NO_SHOW -> Known.NO_SHOW
                                else ->
                                    throw IncreaseInvalidDataException(
                                        "Unknown NoShowIndicator: $value"
                                    )
                            }

                        fun asString(): String = _value().asStringOrThrow()
                    }
                }

                class PurchaseIdentifierFormat
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

                        return other is PurchaseIdentifierFormat && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        @JvmField
                        val FREE_TEXT = PurchaseIdentifierFormat(JsonField.of("free_text"))

                        @JvmField
                        val ORDER_NUMBER = PurchaseIdentifierFormat(JsonField.of("order_number"))

                        @JvmField
                        val RENTAL_AGREEMENT_NUMBER =
                            PurchaseIdentifierFormat(JsonField.of("rental_agreement_number"))

                        @JvmField
                        val HOTEL_FOLIO_NUMBER =
                            PurchaseIdentifierFormat(JsonField.of("hotel_folio_number"))

                        @JvmField
                        val INVOICE_NUMBER =
                            PurchaseIdentifierFormat(JsonField.of("invoice_number"))

                        @JvmStatic
                        fun of(value: String) = PurchaseIdentifierFormat(JsonField.of(value))
                    }

                    enum class Known {
                        FREE_TEXT,
                        ORDER_NUMBER,
                        RENTAL_AGREEMENT_NUMBER,
                        HOTEL_FOLIO_NUMBER,
                        INVOICE_NUMBER,
                    }

                    enum class Value {
                        FREE_TEXT,
                        ORDER_NUMBER,
                        RENTAL_AGREEMENT_NUMBER,
                        HOTEL_FOLIO_NUMBER,
                        INVOICE_NUMBER,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            FREE_TEXT -> Value.FREE_TEXT
                            ORDER_NUMBER -> Value.ORDER_NUMBER
                            RENTAL_AGREEMENT_NUMBER -> Value.RENTAL_AGREEMENT_NUMBER
                            HOTEL_FOLIO_NUMBER -> Value.HOTEL_FOLIO_NUMBER
                            INVOICE_NUMBER -> Value.INVOICE_NUMBER
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            FREE_TEXT -> Known.FREE_TEXT
                            ORDER_NUMBER -> Known.ORDER_NUMBER
                            RENTAL_AGREEMENT_NUMBER -> Known.RENTAL_AGREEMENT_NUMBER
                            HOTEL_FOLIO_NUMBER -> Known.HOTEL_FOLIO_NUMBER
                            INVOICE_NUMBER -> Known.INVOICE_NUMBER
                            else ->
                                throw IncreaseInvalidDataException(
                                    "Unknown PurchaseIdentifierFormat: $value"
                                )
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }

                /** Fields specific to travel. */
                @JsonDeserialize(builder = Travel.Builder::class)
                @NoAutoDetect
                class Travel
                private constructor(
                    private val ancillary: JsonField<Ancillary>,
                    private val computerizedReservationSystem: JsonField<String>,
                    private val creditReasonIndicator: JsonField<CreditReasonIndicator>,
                    private val departureDate: JsonField<LocalDate>,
                    private val originationCityAirportCode: JsonField<String>,
                    private val passengerName: JsonField<String>,
                    private val restrictedTicketIndicator: JsonField<RestrictedTicketIndicator>,
                    private val ticketChangeIndicator: JsonField<TicketChangeIndicator>,
                    private val ticketNumber: JsonField<String>,
                    private val travelAgencyCode: JsonField<String>,
                    private val travelAgencyName: JsonField<String>,
                    private val tripLegs: JsonField<List<TripLeg>>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    /** Ancillary purchases in addition to the airfare. */
                    fun ancillary(): Optional<Ancillary> =
                        Optional.ofNullable(ancillary.getNullable("ancillary"))

                    /** Indicates the computerized reservation system used to book the ticket. */
                    fun computerizedReservationSystem(): Optional<String> =
                        Optional.ofNullable(
                            computerizedReservationSystem.getNullable(
                                "computerized_reservation_system"
                            )
                        )

                    /** Indicates the reason for a credit to the cardholder. */
                    fun creditReasonIndicator(): Optional<CreditReasonIndicator> =
                        Optional.ofNullable(
                            creditReasonIndicator.getNullable("credit_reason_indicator")
                        )

                    /** Date of departure. */
                    fun departureDate(): Optional<LocalDate> =
                        Optional.ofNullable(departureDate.getNullable("departure_date"))

                    /** Code for the originating city or airport. */
                    fun originationCityAirportCode(): Optional<String> =
                        Optional.ofNullable(
                            originationCityAirportCode.getNullable("origination_city_airport_code")
                        )

                    /** Name of the passenger. */
                    fun passengerName(): Optional<String> =
                        Optional.ofNullable(passengerName.getNullable("passenger_name"))

                    /** Indicates whether this ticket is non-refundable. */
                    fun restrictedTicketIndicator(): Optional<RestrictedTicketIndicator> =
                        Optional.ofNullable(
                            restrictedTicketIndicator.getNullable("restricted_ticket_indicator")
                        )

                    /** Indicates why a ticket was changed. */
                    fun ticketChangeIndicator(): Optional<TicketChangeIndicator> =
                        Optional.ofNullable(
                            ticketChangeIndicator.getNullable("ticket_change_indicator")
                        )

                    /** Ticket number. */
                    fun ticketNumber(): Optional<String> =
                        Optional.ofNullable(ticketNumber.getNullable("ticket_number"))

                    /** Code for the travel agency if the ticket was issued by a travel agency. */
                    fun travelAgencyCode(): Optional<String> =
                        Optional.ofNullable(travelAgencyCode.getNullable("travel_agency_code"))

                    /** Name of the travel agency if the ticket was issued by a travel agency. */
                    fun travelAgencyName(): Optional<String> =
                        Optional.ofNullable(travelAgencyName.getNullable("travel_agency_name"))

                    /** Fields specific to each leg of the journey. */
                    fun tripLegs(): Optional<List<TripLeg>> =
                        Optional.ofNullable(tripLegs.getNullable("trip_legs"))

                    /** Ancillary purchases in addition to the airfare. */
                    @JsonProperty("ancillary") @ExcludeMissing fun _ancillary() = ancillary

                    /** Indicates the computerized reservation system used to book the ticket. */
                    @JsonProperty("computerized_reservation_system")
                    @ExcludeMissing
                    fun _computerizedReservationSystem() = computerizedReservationSystem

                    /** Indicates the reason for a credit to the cardholder. */
                    @JsonProperty("credit_reason_indicator")
                    @ExcludeMissing
                    fun _creditReasonIndicator() = creditReasonIndicator

                    /** Date of departure. */
                    @JsonProperty("departure_date")
                    @ExcludeMissing
                    fun _departureDate() = departureDate

                    /** Code for the originating city or airport. */
                    @JsonProperty("origination_city_airport_code")
                    @ExcludeMissing
                    fun _originationCityAirportCode() = originationCityAirportCode

                    /** Name of the passenger. */
                    @JsonProperty("passenger_name")
                    @ExcludeMissing
                    fun _passengerName() = passengerName

                    /** Indicates whether this ticket is non-refundable. */
                    @JsonProperty("restricted_ticket_indicator")
                    @ExcludeMissing
                    fun _restrictedTicketIndicator() = restrictedTicketIndicator

                    /** Indicates why a ticket was changed. */
                    @JsonProperty("ticket_change_indicator")
                    @ExcludeMissing
                    fun _ticketChangeIndicator() = ticketChangeIndicator

                    /** Ticket number. */
                    @JsonProperty("ticket_number")
                    @ExcludeMissing
                    fun _ticketNumber() = ticketNumber

                    /** Code for the travel agency if the ticket was issued by a travel agency. */
                    @JsonProperty("travel_agency_code")
                    @ExcludeMissing
                    fun _travelAgencyCode() = travelAgencyCode

                    /** Name of the travel agency if the ticket was issued by a travel agency. */
                    @JsonProperty("travel_agency_name")
                    @ExcludeMissing
                    fun _travelAgencyName() = travelAgencyName

                    /** Fields specific to each leg of the journey. */
                    @JsonProperty("trip_legs") @ExcludeMissing fun _tripLegs() = tripLegs

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): Travel = apply {
                        if (!validated) {
                            ancillary().map { it.validate() }
                            computerizedReservationSystem()
                            creditReasonIndicator()
                            departureDate()
                            originationCityAirportCode()
                            passengerName()
                            restrictedTicketIndicator()
                            ticketChangeIndicator()
                            ticketNumber()
                            travelAgencyCode()
                            travelAgencyName()
                            tripLegs().map { it.forEach { it.validate() } }
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Travel &&
                            this.ancillary == other.ancillary &&
                            this.computerizedReservationSystem ==
                                other.computerizedReservationSystem &&
                            this.creditReasonIndicator == other.creditReasonIndicator &&
                            this.departureDate == other.departureDate &&
                            this.originationCityAirportCode == other.originationCityAirportCode &&
                            this.passengerName == other.passengerName &&
                            this.restrictedTicketIndicator == other.restrictedTicketIndicator &&
                            this.ticketChangeIndicator == other.ticketChangeIndicator &&
                            this.ticketNumber == other.ticketNumber &&
                            this.travelAgencyCode == other.travelAgencyCode &&
                            this.travelAgencyName == other.travelAgencyName &&
                            this.tripLegs == other.tripLegs &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode =
                                Objects.hash(
                                    ancillary,
                                    computerizedReservationSystem,
                                    creditReasonIndicator,
                                    departureDate,
                                    originationCityAirportCode,
                                    passengerName,
                                    restrictedTicketIndicator,
                                    ticketChangeIndicator,
                                    ticketNumber,
                                    travelAgencyCode,
                                    travelAgencyName,
                                    tripLegs,
                                    additionalProperties,
                                )
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "Travel{ancillary=$ancillary, computerizedReservationSystem=$computerizedReservationSystem, creditReasonIndicator=$creditReasonIndicator, departureDate=$departureDate, originationCityAirportCode=$originationCityAirportCode, passengerName=$passengerName, restrictedTicketIndicator=$restrictedTicketIndicator, ticketChangeIndicator=$ticketChangeIndicator, ticketNumber=$ticketNumber, travelAgencyCode=$travelAgencyCode, travelAgencyName=$travelAgencyName, tripLegs=$tripLegs, additionalProperties=$additionalProperties}"

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var ancillary: JsonField<Ancillary> = JsonMissing.of()
                        private var computerizedReservationSystem: JsonField<String> =
                            JsonMissing.of()
                        private var creditReasonIndicator: JsonField<CreditReasonIndicator> =
                            JsonMissing.of()
                        private var departureDate: JsonField<LocalDate> = JsonMissing.of()
                        private var originationCityAirportCode: JsonField<String> = JsonMissing.of()
                        private var passengerName: JsonField<String> = JsonMissing.of()
                        private var restrictedTicketIndicator:
                            JsonField<RestrictedTicketIndicator> =
                            JsonMissing.of()
                        private var ticketChangeIndicator: JsonField<TicketChangeIndicator> =
                            JsonMissing.of()
                        private var ticketNumber: JsonField<String> = JsonMissing.of()
                        private var travelAgencyCode: JsonField<String> = JsonMissing.of()
                        private var travelAgencyName: JsonField<String> = JsonMissing.of()
                        private var tripLegs: JsonField<List<TripLeg>> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(travel: Travel) = apply {
                            this.ancillary = travel.ancillary
                            this.computerizedReservationSystem =
                                travel.computerizedReservationSystem
                            this.creditReasonIndicator = travel.creditReasonIndicator
                            this.departureDate = travel.departureDate
                            this.originationCityAirportCode = travel.originationCityAirportCode
                            this.passengerName = travel.passengerName
                            this.restrictedTicketIndicator = travel.restrictedTicketIndicator
                            this.ticketChangeIndicator = travel.ticketChangeIndicator
                            this.ticketNumber = travel.ticketNumber
                            this.travelAgencyCode = travel.travelAgencyCode
                            this.travelAgencyName = travel.travelAgencyName
                            this.tripLegs = travel.tripLegs
                            additionalProperties(travel.additionalProperties)
                        }

                        /** Ancillary purchases in addition to the airfare. */
                        fun ancillary(ancillary: Ancillary) = ancillary(JsonField.of(ancillary))

                        /** Ancillary purchases in addition to the airfare. */
                        @JsonProperty("ancillary")
                        @ExcludeMissing
                        fun ancillary(ancillary: JsonField<Ancillary>) = apply {
                            this.ancillary = ancillary
                        }

                        /**
                         * Indicates the computerized reservation system used to book the ticket.
                         */
                        fun computerizedReservationSystem(computerizedReservationSystem: String) =
                            computerizedReservationSystem(
                                JsonField.of(computerizedReservationSystem)
                            )

                        /**
                         * Indicates the computerized reservation system used to book the ticket.
                         */
                        @JsonProperty("computerized_reservation_system")
                        @ExcludeMissing
                        fun computerizedReservationSystem(
                            computerizedReservationSystem: JsonField<String>
                        ) = apply {
                            this.computerizedReservationSystem = computerizedReservationSystem
                        }

                        /** Indicates the reason for a credit to the cardholder. */
                        fun creditReasonIndicator(creditReasonIndicator: CreditReasonIndicator) =
                            creditReasonIndicator(JsonField.of(creditReasonIndicator))

                        /** Indicates the reason for a credit to the cardholder. */
                        @JsonProperty("credit_reason_indicator")
                        @ExcludeMissing
                        fun creditReasonIndicator(
                            creditReasonIndicator: JsonField<CreditReasonIndicator>
                        ) = apply { this.creditReasonIndicator = creditReasonIndicator }

                        /** Date of departure. */
                        fun departureDate(departureDate: LocalDate) =
                            departureDate(JsonField.of(departureDate))

                        /** Date of departure. */
                        @JsonProperty("departure_date")
                        @ExcludeMissing
                        fun departureDate(departureDate: JsonField<LocalDate>) = apply {
                            this.departureDate = departureDate
                        }

                        /** Code for the originating city or airport. */
                        fun originationCityAirportCode(originationCityAirportCode: String) =
                            originationCityAirportCode(JsonField.of(originationCityAirportCode))

                        /** Code for the originating city or airport. */
                        @JsonProperty("origination_city_airport_code")
                        @ExcludeMissing
                        fun originationCityAirportCode(
                            originationCityAirportCode: JsonField<String>
                        ) = apply { this.originationCityAirportCode = originationCityAirportCode }

                        /** Name of the passenger. */
                        fun passengerName(passengerName: String) =
                            passengerName(JsonField.of(passengerName))

                        /** Name of the passenger. */
                        @JsonProperty("passenger_name")
                        @ExcludeMissing
                        fun passengerName(passengerName: JsonField<String>) = apply {
                            this.passengerName = passengerName
                        }

                        /** Indicates whether this ticket is non-refundable. */
                        fun restrictedTicketIndicator(
                            restrictedTicketIndicator: RestrictedTicketIndicator
                        ) = restrictedTicketIndicator(JsonField.of(restrictedTicketIndicator))

                        /** Indicates whether this ticket is non-refundable. */
                        @JsonProperty("restricted_ticket_indicator")
                        @ExcludeMissing
                        fun restrictedTicketIndicator(
                            restrictedTicketIndicator: JsonField<RestrictedTicketIndicator>
                        ) = apply { this.restrictedTicketIndicator = restrictedTicketIndicator }

                        /** Indicates why a ticket was changed. */
                        fun ticketChangeIndicator(ticketChangeIndicator: TicketChangeIndicator) =
                            ticketChangeIndicator(JsonField.of(ticketChangeIndicator))

                        /** Indicates why a ticket was changed. */
                        @JsonProperty("ticket_change_indicator")
                        @ExcludeMissing
                        fun ticketChangeIndicator(
                            ticketChangeIndicator: JsonField<TicketChangeIndicator>
                        ) = apply { this.ticketChangeIndicator = ticketChangeIndicator }

                        /** Ticket number. */
                        fun ticketNumber(ticketNumber: String) =
                            ticketNumber(JsonField.of(ticketNumber))

                        /** Ticket number. */
                        @JsonProperty("ticket_number")
                        @ExcludeMissing
                        fun ticketNumber(ticketNumber: JsonField<String>) = apply {
                            this.ticketNumber = ticketNumber
                        }

                        /**
                         * Code for the travel agency if the ticket was issued by a travel agency.
                         */
                        fun travelAgencyCode(travelAgencyCode: String) =
                            travelAgencyCode(JsonField.of(travelAgencyCode))

                        /**
                         * Code for the travel agency if the ticket was issued by a travel agency.
                         */
                        @JsonProperty("travel_agency_code")
                        @ExcludeMissing
                        fun travelAgencyCode(travelAgencyCode: JsonField<String>) = apply {
                            this.travelAgencyCode = travelAgencyCode
                        }

                        /**
                         * Name of the travel agency if the ticket was issued by a travel agency.
                         */
                        fun travelAgencyName(travelAgencyName: String) =
                            travelAgencyName(JsonField.of(travelAgencyName))

                        /**
                         * Name of the travel agency if the ticket was issued by a travel agency.
                         */
                        @JsonProperty("travel_agency_name")
                        @ExcludeMissing
                        fun travelAgencyName(travelAgencyName: JsonField<String>) = apply {
                            this.travelAgencyName = travelAgencyName
                        }

                        /** Fields specific to each leg of the journey. */
                        fun tripLegs(tripLegs: List<TripLeg>) = tripLegs(JsonField.of(tripLegs))

                        /** Fields specific to each leg of the journey. */
                        @JsonProperty("trip_legs")
                        @ExcludeMissing
                        fun tripLegs(tripLegs: JsonField<List<TripLeg>>) = apply {
                            this.tripLegs = tripLegs
                        }

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

                        fun build(): Travel =
                            Travel(
                                ancillary,
                                computerizedReservationSystem,
                                creditReasonIndicator,
                                departureDate,
                                originationCityAirportCode,
                                passengerName,
                                restrictedTicketIndicator,
                                ticketChangeIndicator,
                                ticketNumber,
                                travelAgencyCode,
                                travelAgencyName,
                                tripLegs.map { it.toUnmodifiable() },
                                additionalProperties.toUnmodifiable(),
                            )
                    }

                    /** Ancillary purchases in addition to the airfare. */
                    @JsonDeserialize(builder = Ancillary.Builder::class)
                    @NoAutoDetect
                    class Ancillary
                    private constructor(
                        private val connectedTicketDocumentNumber: JsonField<String>,
                        private val creditReasonIndicator: JsonField<CreditReasonIndicator>,
                        private val passengerNameOrDescription: JsonField<String>,
                        private val services: JsonField<List<Service>>,
                        private val ticketDocumentNumber: JsonField<String>,
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        private var validated: Boolean = false

                        private var hashCode: Int = 0

                        /**
                         * If this purchase has a connection or relationship to another purchase,
                         * such as a baggage fee for a passenger transport ticket, this field should
                         * contain the ticket document number for the other purchase.
                         */
                        fun connectedTicketDocumentNumber(): Optional<String> =
                            Optional.ofNullable(
                                connectedTicketDocumentNumber.getNullable(
                                    "connected_ticket_document_number"
                                )
                            )

                        /** Indicates the reason for a credit to the cardholder. */
                        fun creditReasonIndicator(): Optional<CreditReasonIndicator> =
                            Optional.ofNullable(
                                creditReasonIndicator.getNullable("credit_reason_indicator")
                            )

                        /** Name of the passenger or description of the ancillary purchase. */
                        fun passengerNameOrDescription(): Optional<String> =
                            Optional.ofNullable(
                                passengerNameOrDescription.getNullable(
                                    "passenger_name_or_description"
                                )
                            )

                        /** Additional travel charges, such as baggage fees. */
                        fun services(): List<Service> = services.getRequired("services")

                        /** Ticket document number. */
                        fun ticketDocumentNumber(): Optional<String> =
                            Optional.ofNullable(
                                ticketDocumentNumber.getNullable("ticket_document_number")
                            )

                        /**
                         * If this purchase has a connection or relationship to another purchase,
                         * such as a baggage fee for a passenger transport ticket, this field should
                         * contain the ticket document number for the other purchase.
                         */
                        @JsonProperty("connected_ticket_document_number")
                        @ExcludeMissing
                        fun _connectedTicketDocumentNumber() = connectedTicketDocumentNumber

                        /** Indicates the reason for a credit to the cardholder. */
                        @JsonProperty("credit_reason_indicator")
                        @ExcludeMissing
                        fun _creditReasonIndicator() = creditReasonIndicator

                        /** Name of the passenger or description of the ancillary purchase. */
                        @JsonProperty("passenger_name_or_description")
                        @ExcludeMissing
                        fun _passengerNameOrDescription() = passengerNameOrDescription

                        /** Additional travel charges, such as baggage fees. */
                        @JsonProperty("services") @ExcludeMissing fun _services() = services

                        /** Ticket document number. */
                        @JsonProperty("ticket_document_number")
                        @ExcludeMissing
                        fun _ticketDocumentNumber() = ticketDocumentNumber

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): Ancillary = apply {
                            if (!validated) {
                                connectedTicketDocumentNumber()
                                creditReasonIndicator()
                                passengerNameOrDescription()
                                services().forEach { it.validate() }
                                ticketDocumentNumber()
                                validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Ancillary &&
                                this.connectedTicketDocumentNumber ==
                                    other.connectedTicketDocumentNumber &&
                                this.creditReasonIndicator == other.creditReasonIndicator &&
                                this.passengerNameOrDescription ==
                                    other.passengerNameOrDescription &&
                                this.services == other.services &&
                                this.ticketDocumentNumber == other.ticketDocumentNumber &&
                                this.additionalProperties == other.additionalProperties
                        }

                        override fun hashCode(): Int {
                            if (hashCode == 0) {
                                hashCode =
                                    Objects.hash(
                                        connectedTicketDocumentNumber,
                                        creditReasonIndicator,
                                        passengerNameOrDescription,
                                        services,
                                        ticketDocumentNumber,
                                        additionalProperties,
                                    )
                            }
                            return hashCode
                        }

                        override fun toString() =
                            "Ancillary{connectedTicketDocumentNumber=$connectedTicketDocumentNumber, creditReasonIndicator=$creditReasonIndicator, passengerNameOrDescription=$passengerNameOrDescription, services=$services, ticketDocumentNumber=$ticketDocumentNumber, additionalProperties=$additionalProperties}"

                        companion object {

                            @JvmStatic fun builder() = Builder()
                        }

                        class Builder {

                            private var connectedTicketDocumentNumber: JsonField<String> =
                                JsonMissing.of()
                            private var creditReasonIndicator: JsonField<CreditReasonIndicator> =
                                JsonMissing.of()
                            private var passengerNameOrDescription: JsonField<String> =
                                JsonMissing.of()
                            private var services: JsonField<List<Service>> = JsonMissing.of()
                            private var ticketDocumentNumber: JsonField<String> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(ancillary: Ancillary) = apply {
                                this.connectedTicketDocumentNumber =
                                    ancillary.connectedTicketDocumentNumber
                                this.creditReasonIndicator = ancillary.creditReasonIndicator
                                this.passengerNameOrDescription =
                                    ancillary.passengerNameOrDescription
                                this.services = ancillary.services
                                this.ticketDocumentNumber = ancillary.ticketDocumentNumber
                                additionalProperties(ancillary.additionalProperties)
                            }

                            /**
                             * If this purchase has a connection or relationship to another
                             * purchase, such as a baggage fee for a passenger transport ticket,
                             * this field should contain the ticket document number for the other
                             * purchase.
                             */
                            fun connectedTicketDocumentNumber(
                                connectedTicketDocumentNumber: String
                            ) =
                                connectedTicketDocumentNumber(
                                    JsonField.of(connectedTicketDocumentNumber)
                                )

                            /**
                             * If this purchase has a connection or relationship to another
                             * purchase, such as a baggage fee for a passenger transport ticket,
                             * this field should contain the ticket document number for the other
                             * purchase.
                             */
                            @JsonProperty("connected_ticket_document_number")
                            @ExcludeMissing
                            fun connectedTicketDocumentNumber(
                                connectedTicketDocumentNumber: JsonField<String>
                            ) = apply {
                                this.connectedTicketDocumentNumber = connectedTicketDocumentNumber
                            }

                            /** Indicates the reason for a credit to the cardholder. */
                            fun creditReasonIndicator(
                                creditReasonIndicator: CreditReasonIndicator
                            ) = creditReasonIndicator(JsonField.of(creditReasonIndicator))

                            /** Indicates the reason for a credit to the cardholder. */
                            @JsonProperty("credit_reason_indicator")
                            @ExcludeMissing
                            fun creditReasonIndicator(
                                creditReasonIndicator: JsonField<CreditReasonIndicator>
                            ) = apply { this.creditReasonIndicator = creditReasonIndicator }

                            /** Name of the passenger or description of the ancillary purchase. */
                            fun passengerNameOrDescription(passengerNameOrDescription: String) =
                                passengerNameOrDescription(JsonField.of(passengerNameOrDescription))

                            /** Name of the passenger or description of the ancillary purchase. */
                            @JsonProperty("passenger_name_or_description")
                            @ExcludeMissing
                            fun passengerNameOrDescription(
                                passengerNameOrDescription: JsonField<String>
                            ) = apply {
                                this.passengerNameOrDescription = passengerNameOrDescription
                            }

                            /** Additional travel charges, such as baggage fees. */
                            fun services(services: List<Service>) = services(JsonField.of(services))

                            /** Additional travel charges, such as baggage fees. */
                            @JsonProperty("services")
                            @ExcludeMissing
                            fun services(services: JsonField<List<Service>>) = apply {
                                this.services = services
                            }

                            /** Ticket document number. */
                            fun ticketDocumentNumber(ticketDocumentNumber: String) =
                                ticketDocumentNumber(JsonField.of(ticketDocumentNumber))

                            /** Ticket document number. */
                            @JsonProperty("ticket_document_number")
                            @ExcludeMissing
                            fun ticketDocumentNumber(ticketDocumentNumber: JsonField<String>) =
                                apply {
                                    this.ticketDocumentNumber = ticketDocumentNumber
                                }

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

                            fun build(): Ancillary =
                                Ancillary(
                                    connectedTicketDocumentNumber,
                                    creditReasonIndicator,
                                    passengerNameOrDescription,
                                    services.map { it.toUnmodifiable() },
                                    ticketDocumentNumber,
                                    additionalProperties.toUnmodifiable(),
                                )
                        }

                        class CreditReasonIndicator
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

                                return other is CreditReasonIndicator && this.value == other.value
                            }

                            override fun hashCode() = value.hashCode()

                            override fun toString() = value.toString()

                            companion object {

                                @JvmField
                                val NO_CREDIT = CreditReasonIndicator(JsonField.of("no_credit"))

                                @JvmField
                                val PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION =
                                    CreditReasonIndicator(
                                        JsonField.of(
                                            "passenger_transport_ancillary_purchase_cancellation"
                                        )
                                    )

                                @JvmField
                                val AIRLINE_TICKET_AND_PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION =
                                    CreditReasonIndicator(
                                        JsonField.of(
                                            "airline_ticket_and_passenger_transport_ancillary_purchase_cancellation"
                                        )
                                    )

                                @JvmField val OTHER = CreditReasonIndicator(JsonField.of("other"))

                                @JvmStatic
                                fun of(value: String) = CreditReasonIndicator(JsonField.of(value))
                            }

                            enum class Known {
                                NO_CREDIT,
                                PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION,
                                AIRLINE_TICKET_AND_PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION,
                                OTHER,
                            }

                            enum class Value {
                                NO_CREDIT,
                                PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION,
                                AIRLINE_TICKET_AND_PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION,
                                OTHER,
                                _UNKNOWN,
                            }

                            fun value(): Value =
                                when (this) {
                                    NO_CREDIT -> Value.NO_CREDIT
                                    PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION ->
                                        Value.PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION
                                    AIRLINE_TICKET_AND_PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION ->
                                        Value
                                            .AIRLINE_TICKET_AND_PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION
                                    OTHER -> Value.OTHER
                                    else -> Value._UNKNOWN
                                }

                            fun known(): Known =
                                when (this) {
                                    NO_CREDIT -> Known.NO_CREDIT
                                    PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION ->
                                        Known.PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION
                                    AIRLINE_TICKET_AND_PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION ->
                                        Known
                                            .AIRLINE_TICKET_AND_PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION
                                    OTHER -> Known.OTHER
                                    else ->
                                        throw IncreaseInvalidDataException(
                                            "Unknown CreditReasonIndicator: $value"
                                        )
                                }

                            fun asString(): String = _value().asStringOrThrow()
                        }

                        @JsonDeserialize(builder = Service.Builder::class)
                        @NoAutoDetect
                        class Service
                        private constructor(
                            private val category: JsonField<Category>,
                            private val subCategory: JsonField<String>,
                            private val additionalProperties: Map<String, JsonValue>,
                        ) {

                            private var validated: Boolean = false

                            private var hashCode: Int = 0

                            /** Category of the ancillary service. */
                            fun category(): Optional<Category> =
                                Optional.ofNullable(category.getNullable("category"))

                            /** Sub-category of the ancillary service, free-form. */
                            fun subCategory(): Optional<String> =
                                Optional.ofNullable(subCategory.getNullable("sub_category"))

                            /** Category of the ancillary service. */
                            @JsonProperty("category") @ExcludeMissing fun _category() = category

                            /** Sub-category of the ancillary service, free-form. */
                            @JsonProperty("sub_category")
                            @ExcludeMissing
                            fun _subCategory() = subCategory

                            @JsonAnyGetter
                            @ExcludeMissing
                            fun _additionalProperties(): Map<String, JsonValue> =
                                additionalProperties

                            fun validate(): Service = apply {
                                if (!validated) {
                                    category()
                                    subCategory()
                                    validated = true
                                }
                            }

                            fun toBuilder() = Builder().from(this)

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is Service &&
                                    this.category == other.category &&
                                    this.subCategory == other.subCategory &&
                                    this.additionalProperties == other.additionalProperties
                            }

                            override fun hashCode(): Int {
                                if (hashCode == 0) {
                                    hashCode =
                                        Objects.hash(
                                            category,
                                            subCategory,
                                            additionalProperties,
                                        )
                                }
                                return hashCode
                            }

                            override fun toString() =
                                "Service{category=$category, subCategory=$subCategory, additionalProperties=$additionalProperties}"

                            companion object {

                                @JvmStatic fun builder() = Builder()
                            }

                            class Builder {

                                private var category: JsonField<Category> = JsonMissing.of()
                                private var subCategory: JsonField<String> = JsonMissing.of()
                                private var additionalProperties: MutableMap<String, JsonValue> =
                                    mutableMapOf()

                                @JvmSynthetic
                                internal fun from(service: Service) = apply {
                                    this.category = service.category
                                    this.subCategory = service.subCategory
                                    additionalProperties(service.additionalProperties)
                                }

                                /** Category of the ancillary service. */
                                fun category(category: Category) = category(JsonField.of(category))

                                /** Category of the ancillary service. */
                                @JsonProperty("category")
                                @ExcludeMissing
                                fun category(category: JsonField<Category>) = apply {
                                    this.category = category
                                }

                                /** Sub-category of the ancillary service, free-form. */
                                fun subCategory(subCategory: String) =
                                    subCategory(JsonField.of(subCategory))

                                /** Sub-category of the ancillary service, free-form. */
                                @JsonProperty("sub_category")
                                @ExcludeMissing
                                fun subCategory(subCategory: JsonField<String>) = apply {
                                    this.subCategory = subCategory
                                }

                                fun additionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply {
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

                                fun build(): Service =
                                    Service(
                                        category,
                                        subCategory,
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

                                    return other is Category && this.value == other.value
                                }

                                override fun hashCode() = value.hashCode()

                                override fun toString() = value.toString()

                                companion object {

                                    @JvmField val NONE = Category(JsonField.of("none"))

                                    @JvmField
                                    val BUNDLED_SERVICE = Category(JsonField.of("bundled_service"))

                                    @JvmField
                                    val BAGGAGE_FEE = Category(JsonField.of("baggage_fee"))

                                    @JvmField val CHANGE_FEE = Category(JsonField.of("change_fee"))

                                    @JvmField val CARGO = Category(JsonField.of("cargo"))

                                    @JvmField
                                    val CARBON_OFFSET = Category(JsonField.of("carbon_offset"))

                                    @JvmField
                                    val FREQUENT_FLYER = Category(JsonField.of("frequent_flyer"))

                                    @JvmField val GIFT_CARD = Category(JsonField.of("gift_card"))

                                    @JvmField
                                    val GROUND_TRANSPORT =
                                        Category(JsonField.of("ground_transport"))

                                    @JvmField
                                    val IN_FLIGHT_ENTERTAINMENT =
                                        Category(JsonField.of("in_flight_entertainment"))

                                    @JvmField val LOUNGE = Category(JsonField.of("lounge"))

                                    @JvmField val MEDICAL = Category(JsonField.of("medical"))

                                    @JvmField
                                    val MEAL_BEVERAGE = Category(JsonField.of("meal_beverage"))

                                    @JvmField val OTHER = Category(JsonField.of("other"))

                                    @JvmField
                                    val PASSENGER_ASSIST_FEE =
                                        Category(JsonField.of("passenger_assist_fee"))

                                    @JvmField val PETS = Category(JsonField.of("pets"))

                                    @JvmField val SEAT_FEES = Category(JsonField.of("seat_fees"))

                                    @JvmField val STANDBY = Category(JsonField.of("standby"))

                                    @JvmField
                                    val SERVICE_FEE = Category(JsonField.of("service_fee"))

                                    @JvmField val STORE = Category(JsonField.of("store"))

                                    @JvmField
                                    val TRAVEL_SERVICE = Category(JsonField.of("travel_service"))

                                    @JvmField
                                    val UNACCOMPANIED_TRAVEL =
                                        Category(JsonField.of("unaccompanied_travel"))

                                    @JvmField val UPGRADES = Category(JsonField.of("upgrades"))

                                    @JvmField val WIFI = Category(JsonField.of("wifi"))

                                    @JvmStatic fun of(value: String) = Category(JsonField.of(value))
                                }

                                enum class Known {
                                    NONE,
                                    BUNDLED_SERVICE,
                                    BAGGAGE_FEE,
                                    CHANGE_FEE,
                                    CARGO,
                                    CARBON_OFFSET,
                                    FREQUENT_FLYER,
                                    GIFT_CARD,
                                    GROUND_TRANSPORT,
                                    IN_FLIGHT_ENTERTAINMENT,
                                    LOUNGE,
                                    MEDICAL,
                                    MEAL_BEVERAGE,
                                    OTHER,
                                    PASSENGER_ASSIST_FEE,
                                    PETS,
                                    SEAT_FEES,
                                    STANDBY,
                                    SERVICE_FEE,
                                    STORE,
                                    TRAVEL_SERVICE,
                                    UNACCOMPANIED_TRAVEL,
                                    UPGRADES,
                                    WIFI,
                                }

                                enum class Value {
                                    NONE,
                                    BUNDLED_SERVICE,
                                    BAGGAGE_FEE,
                                    CHANGE_FEE,
                                    CARGO,
                                    CARBON_OFFSET,
                                    FREQUENT_FLYER,
                                    GIFT_CARD,
                                    GROUND_TRANSPORT,
                                    IN_FLIGHT_ENTERTAINMENT,
                                    LOUNGE,
                                    MEDICAL,
                                    MEAL_BEVERAGE,
                                    OTHER,
                                    PASSENGER_ASSIST_FEE,
                                    PETS,
                                    SEAT_FEES,
                                    STANDBY,
                                    SERVICE_FEE,
                                    STORE,
                                    TRAVEL_SERVICE,
                                    UNACCOMPANIED_TRAVEL,
                                    UPGRADES,
                                    WIFI,
                                    _UNKNOWN,
                                }

                                fun value(): Value =
                                    when (this) {
                                        NONE -> Value.NONE
                                        BUNDLED_SERVICE -> Value.BUNDLED_SERVICE
                                        BAGGAGE_FEE -> Value.BAGGAGE_FEE
                                        CHANGE_FEE -> Value.CHANGE_FEE
                                        CARGO -> Value.CARGO
                                        CARBON_OFFSET -> Value.CARBON_OFFSET
                                        FREQUENT_FLYER -> Value.FREQUENT_FLYER
                                        GIFT_CARD -> Value.GIFT_CARD
                                        GROUND_TRANSPORT -> Value.GROUND_TRANSPORT
                                        IN_FLIGHT_ENTERTAINMENT -> Value.IN_FLIGHT_ENTERTAINMENT
                                        LOUNGE -> Value.LOUNGE
                                        MEDICAL -> Value.MEDICAL
                                        MEAL_BEVERAGE -> Value.MEAL_BEVERAGE
                                        OTHER -> Value.OTHER
                                        PASSENGER_ASSIST_FEE -> Value.PASSENGER_ASSIST_FEE
                                        PETS -> Value.PETS
                                        SEAT_FEES -> Value.SEAT_FEES
                                        STANDBY -> Value.STANDBY
                                        SERVICE_FEE -> Value.SERVICE_FEE
                                        STORE -> Value.STORE
                                        TRAVEL_SERVICE -> Value.TRAVEL_SERVICE
                                        UNACCOMPANIED_TRAVEL -> Value.UNACCOMPANIED_TRAVEL
                                        UPGRADES -> Value.UPGRADES
                                        WIFI -> Value.WIFI
                                        else -> Value._UNKNOWN
                                    }

                                fun known(): Known =
                                    when (this) {
                                        NONE -> Known.NONE
                                        BUNDLED_SERVICE -> Known.BUNDLED_SERVICE
                                        BAGGAGE_FEE -> Known.BAGGAGE_FEE
                                        CHANGE_FEE -> Known.CHANGE_FEE
                                        CARGO -> Known.CARGO
                                        CARBON_OFFSET -> Known.CARBON_OFFSET
                                        FREQUENT_FLYER -> Known.FREQUENT_FLYER
                                        GIFT_CARD -> Known.GIFT_CARD
                                        GROUND_TRANSPORT -> Known.GROUND_TRANSPORT
                                        IN_FLIGHT_ENTERTAINMENT -> Known.IN_FLIGHT_ENTERTAINMENT
                                        LOUNGE -> Known.LOUNGE
                                        MEDICAL -> Known.MEDICAL
                                        MEAL_BEVERAGE -> Known.MEAL_BEVERAGE
                                        OTHER -> Known.OTHER
                                        PASSENGER_ASSIST_FEE -> Known.PASSENGER_ASSIST_FEE
                                        PETS -> Known.PETS
                                        SEAT_FEES -> Known.SEAT_FEES
                                        STANDBY -> Known.STANDBY
                                        SERVICE_FEE -> Known.SERVICE_FEE
                                        STORE -> Known.STORE
                                        TRAVEL_SERVICE -> Known.TRAVEL_SERVICE
                                        UNACCOMPANIED_TRAVEL -> Known.UNACCOMPANIED_TRAVEL
                                        UPGRADES -> Known.UPGRADES
                                        WIFI -> Known.WIFI
                                        else ->
                                            throw IncreaseInvalidDataException(
                                                "Unknown Category: $value"
                                            )
                                    }

                                fun asString(): String = _value().asStringOrThrow()
                            }
                        }
                    }

                    class CreditReasonIndicator
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

                            return other is CreditReasonIndicator && this.value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()

                        companion object {

                            @JvmField
                            val NO_CREDIT = CreditReasonIndicator(JsonField.of("no_credit"))

                            @JvmField
                            val PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION =
                                CreditReasonIndicator(
                                    JsonField.of(
                                        "passenger_transport_ancillary_purchase_cancellation"
                                    )
                                )

                            @JvmField
                            val AIRLINE_TICKET_AND_PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION =
                                CreditReasonIndicator(
                                    JsonField.of(
                                        "airline_ticket_and_passenger_transport_ancillary_purchase_cancellation"
                                    )
                                )

                            @JvmField
                            val AIRLINE_TICKET_CANCELLATION =
                                CreditReasonIndicator(JsonField.of("airline_ticket_cancellation"))

                            @JvmField val OTHER = CreditReasonIndicator(JsonField.of("other"))

                            @JvmField
                            val PARTIAL_REFUND_OF_AIRLINE_TICKET =
                                CreditReasonIndicator(
                                    JsonField.of("partial_refund_of_airline_ticket")
                                )

                            @JvmStatic
                            fun of(value: String) = CreditReasonIndicator(JsonField.of(value))
                        }

                        enum class Known {
                            NO_CREDIT,
                            PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION,
                            AIRLINE_TICKET_AND_PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION,
                            AIRLINE_TICKET_CANCELLATION,
                            OTHER,
                            PARTIAL_REFUND_OF_AIRLINE_TICKET,
                        }

                        enum class Value {
                            NO_CREDIT,
                            PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION,
                            AIRLINE_TICKET_AND_PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION,
                            AIRLINE_TICKET_CANCELLATION,
                            OTHER,
                            PARTIAL_REFUND_OF_AIRLINE_TICKET,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                NO_CREDIT -> Value.NO_CREDIT
                                PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION ->
                                    Value.PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION
                                AIRLINE_TICKET_AND_PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION ->
                                    Value
                                        .AIRLINE_TICKET_AND_PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION
                                AIRLINE_TICKET_CANCELLATION -> Value.AIRLINE_TICKET_CANCELLATION
                                OTHER -> Value.OTHER
                                PARTIAL_REFUND_OF_AIRLINE_TICKET ->
                                    Value.PARTIAL_REFUND_OF_AIRLINE_TICKET
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                NO_CREDIT -> Known.NO_CREDIT
                                PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION ->
                                    Known.PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION
                                AIRLINE_TICKET_AND_PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION ->
                                    Known
                                        .AIRLINE_TICKET_AND_PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION
                                AIRLINE_TICKET_CANCELLATION -> Known.AIRLINE_TICKET_CANCELLATION
                                OTHER -> Known.OTHER
                                PARTIAL_REFUND_OF_AIRLINE_TICKET ->
                                    Known.PARTIAL_REFUND_OF_AIRLINE_TICKET
                                else ->
                                    throw IncreaseInvalidDataException(
                                        "Unknown CreditReasonIndicator: $value"
                                    )
                            }

                        fun asString(): String = _value().asStringOrThrow()
                    }

                    class RestrictedTicketIndicator
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

                            return other is RestrictedTicketIndicator && this.value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()

                        companion object {

                            @JvmField
                            val NO_RESTRICTIONS =
                                RestrictedTicketIndicator(JsonField.of("no_restrictions"))

                            @JvmField
                            val RESTRICTED_NON_REFUNDABLE_TICKET =
                                RestrictedTicketIndicator(
                                    JsonField.of("restricted_non_refundable_ticket")
                                )

                            @JvmStatic
                            fun of(value: String) = RestrictedTicketIndicator(JsonField.of(value))
                        }

                        enum class Known {
                            NO_RESTRICTIONS,
                            RESTRICTED_NON_REFUNDABLE_TICKET,
                        }

                        enum class Value {
                            NO_RESTRICTIONS,
                            RESTRICTED_NON_REFUNDABLE_TICKET,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                NO_RESTRICTIONS -> Value.NO_RESTRICTIONS
                                RESTRICTED_NON_REFUNDABLE_TICKET ->
                                    Value.RESTRICTED_NON_REFUNDABLE_TICKET
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                NO_RESTRICTIONS -> Known.NO_RESTRICTIONS
                                RESTRICTED_NON_REFUNDABLE_TICKET ->
                                    Known.RESTRICTED_NON_REFUNDABLE_TICKET
                                else ->
                                    throw IncreaseInvalidDataException(
                                        "Unknown RestrictedTicketIndicator: $value"
                                    )
                            }

                        fun asString(): String = _value().asStringOrThrow()
                    }

                    class TicketChangeIndicator
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

                            return other is TicketChangeIndicator && this.value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()

                        companion object {

                            @JvmField val NONE = TicketChangeIndicator(JsonField.of("none"))

                            @JvmField
                            val CHANGE_TO_EXISTING_TICKET =
                                TicketChangeIndicator(JsonField.of("change_to_existing_ticket"))

                            @JvmField
                            val NEW_TICKET = TicketChangeIndicator(JsonField.of("new_ticket"))

                            @JvmStatic
                            fun of(value: String) = TicketChangeIndicator(JsonField.of(value))
                        }

                        enum class Known {
                            NONE,
                            CHANGE_TO_EXISTING_TICKET,
                            NEW_TICKET,
                        }

                        enum class Value {
                            NONE,
                            CHANGE_TO_EXISTING_TICKET,
                            NEW_TICKET,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                NONE -> Value.NONE
                                CHANGE_TO_EXISTING_TICKET -> Value.CHANGE_TO_EXISTING_TICKET
                                NEW_TICKET -> Value.NEW_TICKET
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                NONE -> Known.NONE
                                CHANGE_TO_EXISTING_TICKET -> Known.CHANGE_TO_EXISTING_TICKET
                                NEW_TICKET -> Known.NEW_TICKET
                                else ->
                                    throw IncreaseInvalidDataException(
                                        "Unknown TicketChangeIndicator: $value"
                                    )
                            }

                        fun asString(): String = _value().asStringOrThrow()
                    }

                    @JsonDeserialize(builder = TripLeg.Builder::class)
                    @NoAutoDetect
                    class TripLeg
                    private constructor(
                        private val carrierCode: JsonField<String>,
                        private val destinationCityAirportCode: JsonField<String>,
                        private val fareBasisCode: JsonField<String>,
                        private val flightNumber: JsonField<String>,
                        private val serviceClass: JsonField<String>,
                        private val stopOverCode: JsonField<StopOverCode>,
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        private var validated: Boolean = false

                        private var hashCode: Int = 0

                        /** Carrier code (e.g., United Airlines, Jet Blue, etc.). */
                        fun carrierCode(): Optional<String> =
                            Optional.ofNullable(carrierCode.getNullable("carrier_code"))

                        /** Code for the destination city or airport. */
                        fun destinationCityAirportCode(): Optional<String> =
                            Optional.ofNullable(
                                destinationCityAirportCode.getNullable(
                                    "destination_city_airport_code"
                                )
                            )

                        /** Fare basis code. */
                        fun fareBasisCode(): Optional<String> =
                            Optional.ofNullable(fareBasisCode.getNullable("fare_basis_code"))

                        /** Flight number. */
                        fun flightNumber(): Optional<String> =
                            Optional.ofNullable(flightNumber.getNullable("flight_number"))

                        /** Service class (e.g., first class, business class, etc.). */
                        fun serviceClass(): Optional<String> =
                            Optional.ofNullable(serviceClass.getNullable("service_class"))

                        /** Indicates whether a stopover is allowed on this ticket. */
                        fun stopOverCode(): Optional<StopOverCode> =
                            Optional.ofNullable(stopOverCode.getNullable("stop_over_code"))

                        /** Carrier code (e.g., United Airlines, Jet Blue, etc.). */
                        @JsonProperty("carrier_code")
                        @ExcludeMissing
                        fun _carrierCode() = carrierCode

                        /** Code for the destination city or airport. */
                        @JsonProperty("destination_city_airport_code")
                        @ExcludeMissing
                        fun _destinationCityAirportCode() = destinationCityAirportCode

                        /** Fare basis code. */
                        @JsonProperty("fare_basis_code")
                        @ExcludeMissing
                        fun _fareBasisCode() = fareBasisCode

                        /** Flight number. */
                        @JsonProperty("flight_number")
                        @ExcludeMissing
                        fun _flightNumber() = flightNumber

                        /** Service class (e.g., first class, business class, etc.). */
                        @JsonProperty("service_class")
                        @ExcludeMissing
                        fun _serviceClass() = serviceClass

                        /** Indicates whether a stopover is allowed on this ticket. */
                        @JsonProperty("stop_over_code")
                        @ExcludeMissing
                        fun _stopOverCode() = stopOverCode

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): TripLeg = apply {
                            if (!validated) {
                                carrierCode()
                                destinationCityAirportCode()
                                fareBasisCode()
                                flightNumber()
                                serviceClass()
                                stopOverCode()
                                validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is TripLeg &&
                                this.carrierCode == other.carrierCode &&
                                this.destinationCityAirportCode ==
                                    other.destinationCityAirportCode &&
                                this.fareBasisCode == other.fareBasisCode &&
                                this.flightNumber == other.flightNumber &&
                                this.serviceClass == other.serviceClass &&
                                this.stopOverCode == other.stopOverCode &&
                                this.additionalProperties == other.additionalProperties
                        }

                        override fun hashCode(): Int {
                            if (hashCode == 0) {
                                hashCode =
                                    Objects.hash(
                                        carrierCode,
                                        destinationCityAirportCode,
                                        fareBasisCode,
                                        flightNumber,
                                        serviceClass,
                                        stopOverCode,
                                        additionalProperties,
                                    )
                            }
                            return hashCode
                        }

                        override fun toString() =
                            "TripLeg{carrierCode=$carrierCode, destinationCityAirportCode=$destinationCityAirportCode, fareBasisCode=$fareBasisCode, flightNumber=$flightNumber, serviceClass=$serviceClass, stopOverCode=$stopOverCode, additionalProperties=$additionalProperties}"

                        companion object {

                            @JvmStatic fun builder() = Builder()
                        }

                        class Builder {

                            private var carrierCode: JsonField<String> = JsonMissing.of()
                            private var destinationCityAirportCode: JsonField<String> =
                                JsonMissing.of()
                            private var fareBasisCode: JsonField<String> = JsonMissing.of()
                            private var flightNumber: JsonField<String> = JsonMissing.of()
                            private var serviceClass: JsonField<String> = JsonMissing.of()
                            private var stopOverCode: JsonField<StopOverCode> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(tripLeg: TripLeg) = apply {
                                this.carrierCode = tripLeg.carrierCode
                                this.destinationCityAirportCode = tripLeg.destinationCityAirportCode
                                this.fareBasisCode = tripLeg.fareBasisCode
                                this.flightNumber = tripLeg.flightNumber
                                this.serviceClass = tripLeg.serviceClass
                                this.stopOverCode = tripLeg.stopOverCode
                                additionalProperties(tripLeg.additionalProperties)
                            }

                            /** Carrier code (e.g., United Airlines, Jet Blue, etc.). */
                            fun carrierCode(carrierCode: String) =
                                carrierCode(JsonField.of(carrierCode))

                            /** Carrier code (e.g., United Airlines, Jet Blue, etc.). */
                            @JsonProperty("carrier_code")
                            @ExcludeMissing
                            fun carrierCode(carrierCode: JsonField<String>) = apply {
                                this.carrierCode = carrierCode
                            }

                            /** Code for the destination city or airport. */
                            fun destinationCityAirportCode(destinationCityAirportCode: String) =
                                destinationCityAirportCode(JsonField.of(destinationCityAirportCode))

                            /** Code for the destination city or airport. */
                            @JsonProperty("destination_city_airport_code")
                            @ExcludeMissing
                            fun destinationCityAirportCode(
                                destinationCityAirportCode: JsonField<String>
                            ) = apply {
                                this.destinationCityAirportCode = destinationCityAirportCode
                            }

                            /** Fare basis code. */
                            fun fareBasisCode(fareBasisCode: String) =
                                fareBasisCode(JsonField.of(fareBasisCode))

                            /** Fare basis code. */
                            @JsonProperty("fare_basis_code")
                            @ExcludeMissing
                            fun fareBasisCode(fareBasisCode: JsonField<String>) = apply {
                                this.fareBasisCode = fareBasisCode
                            }

                            /** Flight number. */
                            fun flightNumber(flightNumber: String) =
                                flightNumber(JsonField.of(flightNumber))

                            /** Flight number. */
                            @JsonProperty("flight_number")
                            @ExcludeMissing
                            fun flightNumber(flightNumber: JsonField<String>) = apply {
                                this.flightNumber = flightNumber
                            }

                            /** Service class (e.g., first class, business class, etc.). */
                            fun serviceClass(serviceClass: String) =
                                serviceClass(JsonField.of(serviceClass))

                            /** Service class (e.g., first class, business class, etc.). */
                            @JsonProperty("service_class")
                            @ExcludeMissing
                            fun serviceClass(serviceClass: JsonField<String>) = apply {
                                this.serviceClass = serviceClass
                            }

                            /** Indicates whether a stopover is allowed on this ticket. */
                            fun stopOverCode(stopOverCode: StopOverCode) =
                                stopOverCode(JsonField.of(stopOverCode))

                            /** Indicates whether a stopover is allowed on this ticket. */
                            @JsonProperty("stop_over_code")
                            @ExcludeMissing
                            fun stopOverCode(stopOverCode: JsonField<StopOverCode>) = apply {
                                this.stopOverCode = stopOverCode
                            }

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

                            fun build(): TripLeg =
                                TripLeg(
                                    carrierCode,
                                    destinationCityAirportCode,
                                    fareBasisCode,
                                    flightNumber,
                                    serviceClass,
                                    stopOverCode,
                                    additionalProperties.toUnmodifiable(),
                                )
                        }

                        class StopOverCode
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

                                return other is StopOverCode && this.value == other.value
                            }

                            override fun hashCode() = value.hashCode()

                            override fun toString() = value.toString()

                            companion object {

                                @JvmField val NONE = StopOverCode(JsonField.of("none"))

                                @JvmField
                                val STOP_OVER_ALLOWED =
                                    StopOverCode(JsonField.of("stop_over_allowed"))

                                @JvmField
                                val STOP_OVER_NOT_ALLOWED =
                                    StopOverCode(JsonField.of("stop_over_not_allowed"))

                                @JvmStatic fun of(value: String) = StopOverCode(JsonField.of(value))
                            }

                            enum class Known {
                                NONE,
                                STOP_OVER_ALLOWED,
                                STOP_OVER_NOT_ALLOWED,
                            }

                            enum class Value {
                                NONE,
                                STOP_OVER_ALLOWED,
                                STOP_OVER_NOT_ALLOWED,
                                _UNKNOWN,
                            }

                            fun value(): Value =
                                when (this) {
                                    NONE -> Value.NONE
                                    STOP_OVER_ALLOWED -> Value.STOP_OVER_ALLOWED
                                    STOP_OVER_NOT_ALLOWED -> Value.STOP_OVER_NOT_ALLOWED
                                    else -> Value._UNKNOWN
                                }

                            fun known(): Known =
                                when (this) {
                                    NONE -> Known.NONE
                                    STOP_OVER_ALLOWED -> Known.STOP_OVER_ALLOWED
                                    STOP_OVER_NOT_ALLOWED -> Known.STOP_OVER_NOT_ALLOWED
                                    else ->
                                        throw IncreaseInvalidDataException(
                                            "Unknown StopOverCode: $value"
                                        )
                                }

                            fun asString(): String = _value().asStringOrThrow()
                        }
                    }
                }
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

                    return other is Type && this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    @JvmField val CARD_SETTLEMENT = Type(JsonField.of("card_settlement"))

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                enum class Known {
                    CARD_SETTLEMENT,
                }

                enum class Value {
                    CARD_SETTLEMENT,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        CARD_SETTLEMENT -> Value.CARD_SETTLEMENT
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        CARD_SETTLEMENT -> Known.CARD_SETTLEMENT
                        else -> throw IncreaseInvalidDataException("Unknown Type: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }
        }

        /**
         * A Cashback Payment object. This field will be present in the JSON response if and only if
         * `category` is equal to `cashback_payment`.
         */
        @JsonDeserialize(builder = CashbackPayment.Builder::class)
        @NoAutoDetect
        class CashbackPayment
        private constructor(
            private val accruedOnCardId: JsonField<String>,
            private val amount: JsonField<Long>,
            private val currency: JsonField<Currency>,
            private val periodEnd: JsonField<OffsetDateTime>,
            private val periodStart: JsonField<OffsetDateTime>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** The card on which the cashback was accrued. */
            fun accruedOnCardId(): Optional<String> =
                Optional.ofNullable(accruedOnCardId.getNullable("accrued_on_card_id"))

            /**
             * The amount in the minor unit of the transaction's currency. For dollars, for example,
             * this is cents.
             */
            fun amount(): Long = amount.getRequired("amount")

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction
             * currency.
             */
            fun currency(): Currency = currency.getRequired("currency")

            /** The end of the period for which this transaction paid cashback. */
            fun periodEnd(): OffsetDateTime = periodEnd.getRequired("period_end")

            /** The start of the period for which this transaction paid cashback. */
            fun periodStart(): OffsetDateTime = periodStart.getRequired("period_start")

            /** The card on which the cashback was accrued. */
            @JsonProperty("accrued_on_card_id")
            @ExcludeMissing
            fun _accruedOnCardId() = accruedOnCardId

            /**
             * The amount in the minor unit of the transaction's currency. For dollars, for example,
             * this is cents.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction
             * currency.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            /** The end of the period for which this transaction paid cashback. */
            @JsonProperty("period_end") @ExcludeMissing fun _periodEnd() = periodEnd

            /** The start of the period for which this transaction paid cashback. */
            @JsonProperty("period_start") @ExcludeMissing fun _periodStart() = periodStart

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): CashbackPayment = apply {
                if (!validated) {
                    accruedOnCardId()
                    amount()
                    currency()
                    periodEnd()
                    periodStart()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CashbackPayment &&
                    this.accruedOnCardId == other.accruedOnCardId &&
                    this.amount == other.amount &&
                    this.currency == other.currency &&
                    this.periodEnd == other.periodEnd &&
                    this.periodStart == other.periodStart &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            accruedOnCardId,
                            amount,
                            currency,
                            periodEnd,
                            periodStart,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "CashbackPayment{accruedOnCardId=$accruedOnCardId, amount=$amount, currency=$currency, periodEnd=$periodEnd, periodStart=$periodStart, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var accruedOnCardId: JsonField<String> = JsonMissing.of()
                private var amount: JsonField<Long> = JsonMissing.of()
                private var currency: JsonField<Currency> = JsonMissing.of()
                private var periodEnd: JsonField<OffsetDateTime> = JsonMissing.of()
                private var periodStart: JsonField<OffsetDateTime> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(cashbackPayment: CashbackPayment) = apply {
                    this.accruedOnCardId = cashbackPayment.accruedOnCardId
                    this.amount = cashbackPayment.amount
                    this.currency = cashbackPayment.currency
                    this.periodEnd = cashbackPayment.periodEnd
                    this.periodStart = cashbackPayment.periodStart
                    additionalProperties(cashbackPayment.additionalProperties)
                }

                /** The card on which the cashback was accrued. */
                fun accruedOnCardId(accruedOnCardId: String) =
                    accruedOnCardId(JsonField.of(accruedOnCardId))

                /** The card on which the cashback was accrued. */
                @JsonProperty("accrued_on_card_id")
                @ExcludeMissing
                fun accruedOnCardId(accruedOnCardId: JsonField<String>) = apply {
                    this.accruedOnCardId = accruedOnCardId
                }

                /**
                 * The amount in the minor unit of the transaction's currency. For dollars, for
                 * example, this is cents.
                 */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /**
                 * The amount in the minor unit of the transaction's currency. For dollars, for
                 * example, this is cents.
                 */
                @JsonProperty("amount")
                @ExcludeMissing
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction
                 * currency.
                 */
                fun currency(currency: Currency) = currency(JsonField.of(currency))

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction
                 * currency.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                /** The end of the period for which this transaction paid cashback. */
                fun periodEnd(periodEnd: OffsetDateTime) = periodEnd(JsonField.of(periodEnd))

                /** The end of the period for which this transaction paid cashback. */
                @JsonProperty("period_end")
                @ExcludeMissing
                fun periodEnd(periodEnd: JsonField<OffsetDateTime>) = apply {
                    this.periodEnd = periodEnd
                }

                /** The start of the period for which this transaction paid cashback. */
                fun periodStart(periodStart: OffsetDateTime) =
                    periodStart(JsonField.of(periodStart))

                /** The start of the period for which this transaction paid cashback. */
                @JsonProperty("period_start")
                @ExcludeMissing
                fun periodStart(periodStart: JsonField<OffsetDateTime>) = apply {
                    this.periodStart = periodStart
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

                fun build(): CashbackPayment =
                    CashbackPayment(
                        accruedOnCardId,
                        amount,
                        currency,
                        periodEnd,
                        periodStart,
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

                    return other is Currency && this.value == other.value
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

                return other is Category && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField
                val ACCOUNT_TRANSFER_INTENTION =
                    Category(JsonField.of("account_transfer_intention"))

                @JvmField
                val ACH_TRANSFER_INTENTION = Category(JsonField.of("ach_transfer_intention"))

                @JvmField
                val ACH_TRANSFER_REJECTION = Category(JsonField.of("ach_transfer_rejection"))

                @JvmField val ACH_TRANSFER_RETURN = Category(JsonField.of("ach_transfer_return"))

                @JvmField val CASHBACK_PAYMENT = Category(JsonField.of("cashback_payment"))

                @JvmField
                val CARD_DISPUTE_ACCEPTANCE = Category(JsonField.of("card_dispute_acceptance"))

                @JvmField val CARD_DISPUTE_LOSS = Category(JsonField.of("card_dispute_loss"))

                @JvmField val CARD_REFUND = Category(JsonField.of("card_refund"))

                @JvmField val CARD_SETTLEMENT = Category(JsonField.of("card_settlement"))

                @JvmField val CARD_REVENUE_PAYMENT = Category(JsonField.of("card_revenue_payment"))

                @JvmField
                val CHECK_DEPOSIT_ACCEPTANCE = Category(JsonField.of("check_deposit_acceptance"))

                @JvmField val CHECK_DEPOSIT_RETURN = Category(JsonField.of("check_deposit_return"))

                @JvmField
                val CHECK_TRANSFER_DEPOSIT = Category(JsonField.of("check_transfer_deposit"))

                @JvmField val FEE_PAYMENT = Category(JsonField.of("fee_payment"))

                @JvmField val INBOUND_ACH_TRANSFER = Category(JsonField.of("inbound_ach_transfer"))

                @JvmField
                val INBOUND_ACH_TRANSFER_RETURN_INTENTION =
                    Category(JsonField.of("inbound_ach_transfer_return_intention"))

                @JvmField
                val INBOUND_CHECK_DEPOSIT_RETURN_INTENTION =
                    Category(JsonField.of("inbound_check_deposit_return_intention"))

                @JvmField
                val INBOUND_REAL_TIME_PAYMENTS_TRANSFER_CONFIRMATION =
                    Category(JsonField.of("inbound_real_time_payments_transfer_confirmation"))

                @JvmField
                val INBOUND_REAL_TIME_PAYMENTS_TRANSFER_DECLINE =
                    Category(JsonField.of("inbound_real_time_payments_transfer_decline"))

                @JvmField
                val INBOUND_WIRE_REVERSAL = Category(JsonField.of("inbound_wire_reversal"))

                @JvmField
                val INBOUND_WIRE_TRANSFER = Category(JsonField.of("inbound_wire_transfer"))

                @JvmField
                val INBOUND_WIRE_TRANSFER_REVERSAL =
                    Category(JsonField.of("inbound_wire_transfer_reversal"))

                @JvmField val INTEREST_PAYMENT = Category(JsonField.of("interest_payment"))

                @JvmField val INTERNAL_SOURCE = Category(JsonField.of("internal_source"))

                @JvmField
                val REAL_TIME_PAYMENTS_TRANSFER_ACKNOWLEDGEMENT =
                    Category(JsonField.of("real_time_payments_transfer_acknowledgement"))

                @JvmField val SAMPLE_FUNDS = Category(JsonField.of("sample_funds"))

                @JvmField
                val WIRE_TRANSFER_INTENTION = Category(JsonField.of("wire_transfer_intention"))

                @JvmField
                val WIRE_TRANSFER_REJECTION = Category(JsonField.of("wire_transfer_rejection"))

                @JvmField val OTHER = Category(JsonField.of("other"))

                @JvmStatic fun of(value: String) = Category(JsonField.of(value))
            }

            enum class Known {
                ACCOUNT_TRANSFER_INTENTION,
                ACH_TRANSFER_INTENTION,
                ACH_TRANSFER_REJECTION,
                ACH_TRANSFER_RETURN,
                CASHBACK_PAYMENT,
                CARD_DISPUTE_ACCEPTANCE,
                CARD_DISPUTE_LOSS,
                CARD_REFUND,
                CARD_SETTLEMENT,
                CARD_REVENUE_PAYMENT,
                CHECK_DEPOSIT_ACCEPTANCE,
                CHECK_DEPOSIT_RETURN,
                CHECK_TRANSFER_DEPOSIT,
                FEE_PAYMENT,
                INBOUND_ACH_TRANSFER,
                INBOUND_ACH_TRANSFER_RETURN_INTENTION,
                INBOUND_CHECK_DEPOSIT_RETURN_INTENTION,
                INBOUND_REAL_TIME_PAYMENTS_TRANSFER_CONFIRMATION,
                INBOUND_REAL_TIME_PAYMENTS_TRANSFER_DECLINE,
                INBOUND_WIRE_REVERSAL,
                INBOUND_WIRE_TRANSFER,
                INBOUND_WIRE_TRANSFER_REVERSAL,
                INTEREST_PAYMENT,
                INTERNAL_SOURCE,
                REAL_TIME_PAYMENTS_TRANSFER_ACKNOWLEDGEMENT,
                SAMPLE_FUNDS,
                WIRE_TRANSFER_INTENTION,
                WIRE_TRANSFER_REJECTION,
                OTHER,
            }

            enum class Value {
                ACCOUNT_TRANSFER_INTENTION,
                ACH_TRANSFER_INTENTION,
                ACH_TRANSFER_REJECTION,
                ACH_TRANSFER_RETURN,
                CASHBACK_PAYMENT,
                CARD_DISPUTE_ACCEPTANCE,
                CARD_DISPUTE_LOSS,
                CARD_REFUND,
                CARD_SETTLEMENT,
                CARD_REVENUE_PAYMENT,
                CHECK_DEPOSIT_ACCEPTANCE,
                CHECK_DEPOSIT_RETURN,
                CHECK_TRANSFER_DEPOSIT,
                FEE_PAYMENT,
                INBOUND_ACH_TRANSFER,
                INBOUND_ACH_TRANSFER_RETURN_INTENTION,
                INBOUND_CHECK_DEPOSIT_RETURN_INTENTION,
                INBOUND_REAL_TIME_PAYMENTS_TRANSFER_CONFIRMATION,
                INBOUND_REAL_TIME_PAYMENTS_TRANSFER_DECLINE,
                INBOUND_WIRE_REVERSAL,
                INBOUND_WIRE_TRANSFER,
                INBOUND_WIRE_TRANSFER_REVERSAL,
                INTEREST_PAYMENT,
                INTERNAL_SOURCE,
                REAL_TIME_PAYMENTS_TRANSFER_ACKNOWLEDGEMENT,
                SAMPLE_FUNDS,
                WIRE_TRANSFER_INTENTION,
                WIRE_TRANSFER_REJECTION,
                OTHER,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    ACCOUNT_TRANSFER_INTENTION -> Value.ACCOUNT_TRANSFER_INTENTION
                    ACH_TRANSFER_INTENTION -> Value.ACH_TRANSFER_INTENTION
                    ACH_TRANSFER_REJECTION -> Value.ACH_TRANSFER_REJECTION
                    ACH_TRANSFER_RETURN -> Value.ACH_TRANSFER_RETURN
                    CASHBACK_PAYMENT -> Value.CASHBACK_PAYMENT
                    CARD_DISPUTE_ACCEPTANCE -> Value.CARD_DISPUTE_ACCEPTANCE
                    CARD_DISPUTE_LOSS -> Value.CARD_DISPUTE_LOSS
                    CARD_REFUND -> Value.CARD_REFUND
                    CARD_SETTLEMENT -> Value.CARD_SETTLEMENT
                    CARD_REVENUE_PAYMENT -> Value.CARD_REVENUE_PAYMENT
                    CHECK_DEPOSIT_ACCEPTANCE -> Value.CHECK_DEPOSIT_ACCEPTANCE
                    CHECK_DEPOSIT_RETURN -> Value.CHECK_DEPOSIT_RETURN
                    CHECK_TRANSFER_DEPOSIT -> Value.CHECK_TRANSFER_DEPOSIT
                    FEE_PAYMENT -> Value.FEE_PAYMENT
                    INBOUND_ACH_TRANSFER -> Value.INBOUND_ACH_TRANSFER
                    INBOUND_ACH_TRANSFER_RETURN_INTENTION ->
                        Value.INBOUND_ACH_TRANSFER_RETURN_INTENTION
                    INBOUND_CHECK_DEPOSIT_RETURN_INTENTION ->
                        Value.INBOUND_CHECK_DEPOSIT_RETURN_INTENTION
                    INBOUND_REAL_TIME_PAYMENTS_TRANSFER_CONFIRMATION ->
                        Value.INBOUND_REAL_TIME_PAYMENTS_TRANSFER_CONFIRMATION
                    INBOUND_REAL_TIME_PAYMENTS_TRANSFER_DECLINE ->
                        Value.INBOUND_REAL_TIME_PAYMENTS_TRANSFER_DECLINE
                    INBOUND_WIRE_REVERSAL -> Value.INBOUND_WIRE_REVERSAL
                    INBOUND_WIRE_TRANSFER -> Value.INBOUND_WIRE_TRANSFER
                    INBOUND_WIRE_TRANSFER_REVERSAL -> Value.INBOUND_WIRE_TRANSFER_REVERSAL
                    INTEREST_PAYMENT -> Value.INTEREST_PAYMENT
                    INTERNAL_SOURCE -> Value.INTERNAL_SOURCE
                    REAL_TIME_PAYMENTS_TRANSFER_ACKNOWLEDGEMENT ->
                        Value.REAL_TIME_PAYMENTS_TRANSFER_ACKNOWLEDGEMENT
                    SAMPLE_FUNDS -> Value.SAMPLE_FUNDS
                    WIRE_TRANSFER_INTENTION -> Value.WIRE_TRANSFER_INTENTION
                    WIRE_TRANSFER_REJECTION -> Value.WIRE_TRANSFER_REJECTION
                    OTHER -> Value.OTHER
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    ACCOUNT_TRANSFER_INTENTION -> Known.ACCOUNT_TRANSFER_INTENTION
                    ACH_TRANSFER_INTENTION -> Known.ACH_TRANSFER_INTENTION
                    ACH_TRANSFER_REJECTION -> Known.ACH_TRANSFER_REJECTION
                    ACH_TRANSFER_RETURN -> Known.ACH_TRANSFER_RETURN
                    CASHBACK_PAYMENT -> Known.CASHBACK_PAYMENT
                    CARD_DISPUTE_ACCEPTANCE -> Known.CARD_DISPUTE_ACCEPTANCE
                    CARD_DISPUTE_LOSS -> Known.CARD_DISPUTE_LOSS
                    CARD_REFUND -> Known.CARD_REFUND
                    CARD_SETTLEMENT -> Known.CARD_SETTLEMENT
                    CARD_REVENUE_PAYMENT -> Known.CARD_REVENUE_PAYMENT
                    CHECK_DEPOSIT_ACCEPTANCE -> Known.CHECK_DEPOSIT_ACCEPTANCE
                    CHECK_DEPOSIT_RETURN -> Known.CHECK_DEPOSIT_RETURN
                    CHECK_TRANSFER_DEPOSIT -> Known.CHECK_TRANSFER_DEPOSIT
                    FEE_PAYMENT -> Known.FEE_PAYMENT
                    INBOUND_ACH_TRANSFER -> Known.INBOUND_ACH_TRANSFER
                    INBOUND_ACH_TRANSFER_RETURN_INTENTION ->
                        Known.INBOUND_ACH_TRANSFER_RETURN_INTENTION
                    INBOUND_CHECK_DEPOSIT_RETURN_INTENTION ->
                        Known.INBOUND_CHECK_DEPOSIT_RETURN_INTENTION
                    INBOUND_REAL_TIME_PAYMENTS_TRANSFER_CONFIRMATION ->
                        Known.INBOUND_REAL_TIME_PAYMENTS_TRANSFER_CONFIRMATION
                    INBOUND_REAL_TIME_PAYMENTS_TRANSFER_DECLINE ->
                        Known.INBOUND_REAL_TIME_PAYMENTS_TRANSFER_DECLINE
                    INBOUND_WIRE_REVERSAL -> Known.INBOUND_WIRE_REVERSAL
                    INBOUND_WIRE_TRANSFER -> Known.INBOUND_WIRE_TRANSFER
                    INBOUND_WIRE_TRANSFER_REVERSAL -> Known.INBOUND_WIRE_TRANSFER_REVERSAL
                    INTEREST_PAYMENT -> Known.INTEREST_PAYMENT
                    INTERNAL_SOURCE -> Known.INTERNAL_SOURCE
                    REAL_TIME_PAYMENTS_TRANSFER_ACKNOWLEDGEMENT ->
                        Known.REAL_TIME_PAYMENTS_TRANSFER_ACKNOWLEDGEMENT
                    SAMPLE_FUNDS -> Known.SAMPLE_FUNDS
                    WIRE_TRANSFER_INTENTION -> Known.WIRE_TRANSFER_INTENTION
                    WIRE_TRANSFER_REJECTION -> Known.WIRE_TRANSFER_REJECTION
                    OTHER -> Known.OTHER
                    else -> throw IncreaseInvalidDataException("Unknown Category: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        /**
         * A Check Deposit Acceptance object. This field will be present in the JSON response if and
         * only if `category` is equal to `check_deposit_acceptance`.
         */
        @JsonDeserialize(builder = CheckDepositAcceptance.Builder::class)
        @NoAutoDetect
        class CheckDepositAcceptance
        private constructor(
            private val accountNumber: JsonField<String>,
            private val amount: JsonField<Long>,
            private val auxiliaryOnUs: JsonField<String>,
            private val checkDepositId: JsonField<String>,
            private val currency: JsonField<Currency>,
            private val routingNumber: JsonField<String>,
            private val serialNumber: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** The account number printed on the check. */
            fun accountNumber(): String = accountNumber.getRequired("account_number")

            /**
             * The amount to be deposited in the minor unit of the transaction's currency. For
             * dollars, for example, this is cents.
             */
            fun amount(): Long = amount.getRequired("amount")

            /**
             * An additional line of metadata printed on the check. This typically includes the
             * check number for business checks.
             */
            fun auxiliaryOnUs(): Optional<String> =
                Optional.ofNullable(auxiliaryOnUs.getNullable("auxiliary_on_us"))

            /** The ID of the Check Deposit that was accepted. */
            fun checkDepositId(): String = checkDepositId.getRequired("check_deposit_id")

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
             * currency.
             */
            fun currency(): Currency = currency.getRequired("currency")

            /** The routing number printed on the check. */
            fun routingNumber(): String = routingNumber.getRequired("routing_number")

            /**
             * The check serial number, if present, for consumer checks. For business checks, the
             * serial number is usually in the `auxiliary_on_us` field.
             */
            fun serialNumber(): Optional<String> =
                Optional.ofNullable(serialNumber.getNullable("serial_number"))

            /** The account number printed on the check. */
            @JsonProperty("account_number") @ExcludeMissing fun _accountNumber() = accountNumber

            /**
             * The amount to be deposited in the minor unit of the transaction's currency. For
             * dollars, for example, this is cents.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            /**
             * An additional line of metadata printed on the check. This typically includes the
             * check number for business checks.
             */
            @JsonProperty("auxiliary_on_us") @ExcludeMissing fun _auxiliaryOnUs() = auxiliaryOnUs

            /** The ID of the Check Deposit that was accepted. */
            @JsonProperty("check_deposit_id") @ExcludeMissing fun _checkDepositId() = checkDepositId

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
             * currency.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            /** The routing number printed on the check. */
            @JsonProperty("routing_number") @ExcludeMissing fun _routingNumber() = routingNumber

            /**
             * The check serial number, if present, for consumer checks. For business checks, the
             * serial number is usually in the `auxiliary_on_us` field.
             */
            @JsonProperty("serial_number") @ExcludeMissing fun _serialNumber() = serialNumber

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): CheckDepositAcceptance = apply {
                if (!validated) {
                    accountNumber()
                    amount()
                    auxiliaryOnUs()
                    checkDepositId()
                    currency()
                    routingNumber()
                    serialNumber()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CheckDepositAcceptance &&
                    this.accountNumber == other.accountNumber &&
                    this.amount == other.amount &&
                    this.auxiliaryOnUs == other.auxiliaryOnUs &&
                    this.checkDepositId == other.checkDepositId &&
                    this.currency == other.currency &&
                    this.routingNumber == other.routingNumber &&
                    this.serialNumber == other.serialNumber &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            accountNumber,
                            amount,
                            auxiliaryOnUs,
                            checkDepositId,
                            currency,
                            routingNumber,
                            serialNumber,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "CheckDepositAcceptance{accountNumber=$accountNumber, amount=$amount, auxiliaryOnUs=$auxiliaryOnUs, checkDepositId=$checkDepositId, currency=$currency, routingNumber=$routingNumber, serialNumber=$serialNumber, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var accountNumber: JsonField<String> = JsonMissing.of()
                private var amount: JsonField<Long> = JsonMissing.of()
                private var auxiliaryOnUs: JsonField<String> = JsonMissing.of()
                private var checkDepositId: JsonField<String> = JsonMissing.of()
                private var currency: JsonField<Currency> = JsonMissing.of()
                private var routingNumber: JsonField<String> = JsonMissing.of()
                private var serialNumber: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(checkDepositAcceptance: CheckDepositAcceptance) = apply {
                    this.accountNumber = checkDepositAcceptance.accountNumber
                    this.amount = checkDepositAcceptance.amount
                    this.auxiliaryOnUs = checkDepositAcceptance.auxiliaryOnUs
                    this.checkDepositId = checkDepositAcceptance.checkDepositId
                    this.currency = checkDepositAcceptance.currency
                    this.routingNumber = checkDepositAcceptance.routingNumber
                    this.serialNumber = checkDepositAcceptance.serialNumber
                    additionalProperties(checkDepositAcceptance.additionalProperties)
                }

                /** The account number printed on the check. */
                fun accountNumber(accountNumber: String) =
                    accountNumber(JsonField.of(accountNumber))

                /** The account number printed on the check. */
                @JsonProperty("account_number")
                @ExcludeMissing
                fun accountNumber(accountNumber: JsonField<String>) = apply {
                    this.accountNumber = accountNumber
                }

                /**
                 * The amount to be deposited in the minor unit of the transaction's currency. For
                 * dollars, for example, this is cents.
                 */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /**
                 * The amount to be deposited in the minor unit of the transaction's currency. For
                 * dollars, for example, this is cents.
                 */
                @JsonProperty("amount")
                @ExcludeMissing
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /**
                 * An additional line of metadata printed on the check. This typically includes the
                 * check number for business checks.
                 */
                fun auxiliaryOnUs(auxiliaryOnUs: String) =
                    auxiliaryOnUs(JsonField.of(auxiliaryOnUs))

                /**
                 * An additional line of metadata printed on the check. This typically includes the
                 * check number for business checks.
                 */
                @JsonProperty("auxiliary_on_us")
                @ExcludeMissing
                fun auxiliaryOnUs(auxiliaryOnUs: JsonField<String>) = apply {
                    this.auxiliaryOnUs = auxiliaryOnUs
                }

                /** The ID of the Check Deposit that was accepted. */
                fun checkDepositId(checkDepositId: String) =
                    checkDepositId(JsonField.of(checkDepositId))

                /** The ID of the Check Deposit that was accepted. */
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

                /** The routing number printed on the check. */
                fun routingNumber(routingNumber: String) =
                    routingNumber(JsonField.of(routingNumber))

                /** The routing number printed on the check. */
                @JsonProperty("routing_number")
                @ExcludeMissing
                fun routingNumber(routingNumber: JsonField<String>) = apply {
                    this.routingNumber = routingNumber
                }

                /**
                 * The check serial number, if present, for consumer checks. For business checks,
                 * the serial number is usually in the `auxiliary_on_us` field.
                 */
                fun serialNumber(serialNumber: String) = serialNumber(JsonField.of(serialNumber))

                /**
                 * The check serial number, if present, for consumer checks. For business checks,
                 * the serial number is usually in the `auxiliary_on_us` field.
                 */
                @JsonProperty("serial_number")
                @ExcludeMissing
                fun serialNumber(serialNumber: JsonField<String>) = apply {
                    this.serialNumber = serialNumber
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

                fun build(): CheckDepositAcceptance =
                    CheckDepositAcceptance(
                        accountNumber,
                        amount,
                        auxiliaryOnUs,
                        checkDepositId,
                        currency,
                        routingNumber,
                        serialNumber,
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

                    return other is Currency && this.value == other.value
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
        }

        /**
         * A Check Deposit Return object. This field will be present in the JSON response if and
         * only if `category` is equal to `check_deposit_return`.
         */
        @JsonDeserialize(builder = CheckDepositReturn.Builder::class)
        @NoAutoDetect
        class CheckDepositReturn
        private constructor(
            private val amount: JsonField<Long>,
            private val checkDepositId: JsonField<String>,
            private val currency: JsonField<Currency>,
            private val returnReason: JsonField<ReturnReason>,
            private val returnedAt: JsonField<OffsetDateTime>,
            private val transactionId: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /**
             * The amount in the minor unit of the transaction's currency. For dollars, for example,
             * this is cents.
             */
            fun amount(): Long = amount.getRequired("amount")

            /** The identifier of the Check Deposit that was returned. */
            fun checkDepositId(): String = checkDepositId.getRequired("check_deposit_id")

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
             * currency.
             */
            fun currency(): Currency = currency.getRequired("currency")

            /** Why this check was returned by the bank holding the account it was drawn against. */
            fun returnReason(): ReturnReason = returnReason.getRequired("return_reason")

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * check deposit was returned.
             */
            fun returnedAt(): OffsetDateTime = returnedAt.getRequired("returned_at")

            /**
             * The identifier of the transaction that reversed the original check deposit
             * transaction.
             */
            fun transactionId(): String = transactionId.getRequired("transaction_id")

            /**
             * The amount in the minor unit of the transaction's currency. For dollars, for example,
             * this is cents.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            /** The identifier of the Check Deposit that was returned. */
            @JsonProperty("check_deposit_id") @ExcludeMissing fun _checkDepositId() = checkDepositId

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
             * currency.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            /** Why this check was returned by the bank holding the account it was drawn against. */
            @JsonProperty("return_reason") @ExcludeMissing fun _returnReason() = returnReason

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * check deposit was returned.
             */
            @JsonProperty("returned_at") @ExcludeMissing fun _returnedAt() = returnedAt

            /**
             * The identifier of the transaction that reversed the original check deposit
             * transaction.
             */
            @JsonProperty("transaction_id") @ExcludeMissing fun _transactionId() = transactionId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): CheckDepositReturn = apply {
                if (!validated) {
                    amount()
                    checkDepositId()
                    currency()
                    returnReason()
                    returnedAt()
                    transactionId()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CheckDepositReturn &&
                    this.amount == other.amount &&
                    this.checkDepositId == other.checkDepositId &&
                    this.currency == other.currency &&
                    this.returnReason == other.returnReason &&
                    this.returnedAt == other.returnedAt &&
                    this.transactionId == other.transactionId &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            amount,
                            checkDepositId,
                            currency,
                            returnReason,
                            returnedAt,
                            transactionId,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "CheckDepositReturn{amount=$amount, checkDepositId=$checkDepositId, currency=$currency, returnReason=$returnReason, returnedAt=$returnedAt, transactionId=$transactionId, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var amount: JsonField<Long> = JsonMissing.of()
                private var checkDepositId: JsonField<String> = JsonMissing.of()
                private var currency: JsonField<Currency> = JsonMissing.of()
                private var returnReason: JsonField<ReturnReason> = JsonMissing.of()
                private var returnedAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var transactionId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(checkDepositReturn: CheckDepositReturn) = apply {
                    this.amount = checkDepositReturn.amount
                    this.checkDepositId = checkDepositReturn.checkDepositId
                    this.currency = checkDepositReturn.currency
                    this.returnReason = checkDepositReturn.returnReason
                    this.returnedAt = checkDepositReturn.returnedAt
                    this.transactionId = checkDepositReturn.transactionId
                    additionalProperties(checkDepositReturn.additionalProperties)
                }

                /**
                 * The amount in the minor unit of the transaction's currency. For dollars, for
                 * example, this is cents.
                 */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /**
                 * The amount in the minor unit of the transaction's currency. For dollars, for
                 * example, this is cents.
                 */
                @JsonProperty("amount")
                @ExcludeMissing
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /** The identifier of the Check Deposit that was returned. */
                fun checkDepositId(checkDepositId: String) =
                    checkDepositId(JsonField.of(checkDepositId))

                /** The identifier of the Check Deposit that was returned. */
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
                 * Why this check was returned by the bank holding the account it was drawn against.
                 */
                fun returnReason(returnReason: ReturnReason) =
                    returnReason(JsonField.of(returnReason))

                /**
                 * Why this check was returned by the bank holding the account it was drawn against.
                 */
                @JsonProperty("return_reason")
                @ExcludeMissing
                fun returnReason(returnReason: JsonField<ReturnReason>) = apply {
                    this.returnReason = returnReason
                }

                /**
                 * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
                 * check deposit was returned.
                 */
                fun returnedAt(returnedAt: OffsetDateTime) = returnedAt(JsonField.of(returnedAt))

                /**
                 * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
                 * check deposit was returned.
                 */
                @JsonProperty("returned_at")
                @ExcludeMissing
                fun returnedAt(returnedAt: JsonField<OffsetDateTime>) = apply {
                    this.returnedAt = returnedAt
                }

                /**
                 * The identifier of the transaction that reversed the original check deposit
                 * transaction.
                 */
                fun transactionId(transactionId: String) =
                    transactionId(JsonField.of(transactionId))

                /**
                 * The identifier of the transaction that reversed the original check deposit
                 * transaction.
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

                fun build(): CheckDepositReturn =
                    CheckDepositReturn(
                        amount,
                        checkDepositId,
                        currency,
                        returnReason,
                        returnedAt,
                        transactionId,
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

                    return other is Currency && this.value == other.value
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

            class ReturnReason
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ReturnReason && this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    @JvmField
                    val ACH_CONVERSION_NOT_SUPPORTED =
                        ReturnReason(JsonField.of("ach_conversion_not_supported"))

                    @JvmField val CLOSED_ACCOUNT = ReturnReason(JsonField.of("closed_account"))

                    @JvmField
                    val DUPLICATE_SUBMISSION = ReturnReason(JsonField.of("duplicate_submission"))

                    @JvmField
                    val INSUFFICIENT_FUNDS = ReturnReason(JsonField.of("insufficient_funds"))

                    @JvmField val NO_ACCOUNT = ReturnReason(JsonField.of("no_account"))

                    @JvmField val NOT_AUTHORIZED = ReturnReason(JsonField.of("not_authorized"))

                    @JvmField val STALE_DATED = ReturnReason(JsonField.of("stale_dated"))

                    @JvmField val STOP_PAYMENT = ReturnReason(JsonField.of("stop_payment"))

                    @JvmField val UNKNOWN_REASON = ReturnReason(JsonField.of("unknown_reason"))

                    @JvmField
                    val UNMATCHED_DETAILS = ReturnReason(JsonField.of("unmatched_details"))

                    @JvmField val UNREADABLE_IMAGE = ReturnReason(JsonField.of("unreadable_image"))

                    @JvmField
                    val ENDORSEMENT_IRREGULAR = ReturnReason(JsonField.of("endorsement_irregular"))

                    @JvmField
                    val ALTERED_OR_FICTITIOUS_ITEM =
                        ReturnReason(JsonField.of("altered_or_fictitious_item"))

                    @JvmField
                    val FROZEN_OR_BLOCKED_ACCOUNT =
                        ReturnReason(JsonField.of("frozen_or_blocked_account"))

                    @JvmField val POST_DATED = ReturnReason(JsonField.of("post_dated"))

                    @JvmField
                    val ENDORSEMENT_MISSING = ReturnReason(JsonField.of("endorsement_missing"))

                    @JvmField
                    val SIGNATURE_MISSING = ReturnReason(JsonField.of("signature_missing"))

                    @JvmField
                    val STOP_PAYMENT_SUSPECT = ReturnReason(JsonField.of("stop_payment_suspect"))

                    @JvmField val UNUSABLE_IMAGE = ReturnReason(JsonField.of("unusable_image"))

                    @JvmField
                    val IMAGE_FAILS_SECURITY_CHECK =
                        ReturnReason(JsonField.of("image_fails_security_check"))

                    @JvmField
                    val CANNOT_DETERMINE_AMOUNT =
                        ReturnReason(JsonField.of("cannot_determine_amount"))

                    @JvmField
                    val SIGNATURE_IRREGULAR = ReturnReason(JsonField.of("signature_irregular"))

                    @JvmField val NON_CASH_ITEM = ReturnReason(JsonField.of("non_cash_item"))

                    @JvmField
                    val UNABLE_TO_PROCESS = ReturnReason(JsonField.of("unable_to_process"))

                    @JvmField
                    val ITEM_EXCEEDS_DOLLAR_LIMIT =
                        ReturnReason(JsonField.of("item_exceeds_dollar_limit"))

                    @JvmField
                    val BRANCH_OR_ACCOUNT_SOLD =
                        ReturnReason(JsonField.of("branch_or_account_sold"))

                    @JvmStatic fun of(value: String) = ReturnReason(JsonField.of(value))
                }

                enum class Known {
                    ACH_CONVERSION_NOT_SUPPORTED,
                    CLOSED_ACCOUNT,
                    DUPLICATE_SUBMISSION,
                    INSUFFICIENT_FUNDS,
                    NO_ACCOUNT,
                    NOT_AUTHORIZED,
                    STALE_DATED,
                    STOP_PAYMENT,
                    UNKNOWN_REASON,
                    UNMATCHED_DETAILS,
                    UNREADABLE_IMAGE,
                    ENDORSEMENT_IRREGULAR,
                    ALTERED_OR_FICTITIOUS_ITEM,
                    FROZEN_OR_BLOCKED_ACCOUNT,
                    POST_DATED,
                    ENDORSEMENT_MISSING,
                    SIGNATURE_MISSING,
                    STOP_PAYMENT_SUSPECT,
                    UNUSABLE_IMAGE,
                    IMAGE_FAILS_SECURITY_CHECK,
                    CANNOT_DETERMINE_AMOUNT,
                    SIGNATURE_IRREGULAR,
                    NON_CASH_ITEM,
                    UNABLE_TO_PROCESS,
                    ITEM_EXCEEDS_DOLLAR_LIMIT,
                    BRANCH_OR_ACCOUNT_SOLD,
                }

                enum class Value {
                    ACH_CONVERSION_NOT_SUPPORTED,
                    CLOSED_ACCOUNT,
                    DUPLICATE_SUBMISSION,
                    INSUFFICIENT_FUNDS,
                    NO_ACCOUNT,
                    NOT_AUTHORIZED,
                    STALE_DATED,
                    STOP_PAYMENT,
                    UNKNOWN_REASON,
                    UNMATCHED_DETAILS,
                    UNREADABLE_IMAGE,
                    ENDORSEMENT_IRREGULAR,
                    ALTERED_OR_FICTITIOUS_ITEM,
                    FROZEN_OR_BLOCKED_ACCOUNT,
                    POST_DATED,
                    ENDORSEMENT_MISSING,
                    SIGNATURE_MISSING,
                    STOP_PAYMENT_SUSPECT,
                    UNUSABLE_IMAGE,
                    IMAGE_FAILS_SECURITY_CHECK,
                    CANNOT_DETERMINE_AMOUNT,
                    SIGNATURE_IRREGULAR,
                    NON_CASH_ITEM,
                    UNABLE_TO_PROCESS,
                    ITEM_EXCEEDS_DOLLAR_LIMIT,
                    BRANCH_OR_ACCOUNT_SOLD,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        ACH_CONVERSION_NOT_SUPPORTED -> Value.ACH_CONVERSION_NOT_SUPPORTED
                        CLOSED_ACCOUNT -> Value.CLOSED_ACCOUNT
                        DUPLICATE_SUBMISSION -> Value.DUPLICATE_SUBMISSION
                        INSUFFICIENT_FUNDS -> Value.INSUFFICIENT_FUNDS
                        NO_ACCOUNT -> Value.NO_ACCOUNT
                        NOT_AUTHORIZED -> Value.NOT_AUTHORIZED
                        STALE_DATED -> Value.STALE_DATED
                        STOP_PAYMENT -> Value.STOP_PAYMENT
                        UNKNOWN_REASON -> Value.UNKNOWN_REASON
                        UNMATCHED_DETAILS -> Value.UNMATCHED_DETAILS
                        UNREADABLE_IMAGE -> Value.UNREADABLE_IMAGE
                        ENDORSEMENT_IRREGULAR -> Value.ENDORSEMENT_IRREGULAR
                        ALTERED_OR_FICTITIOUS_ITEM -> Value.ALTERED_OR_FICTITIOUS_ITEM
                        FROZEN_OR_BLOCKED_ACCOUNT -> Value.FROZEN_OR_BLOCKED_ACCOUNT
                        POST_DATED -> Value.POST_DATED
                        ENDORSEMENT_MISSING -> Value.ENDORSEMENT_MISSING
                        SIGNATURE_MISSING -> Value.SIGNATURE_MISSING
                        STOP_PAYMENT_SUSPECT -> Value.STOP_PAYMENT_SUSPECT
                        UNUSABLE_IMAGE -> Value.UNUSABLE_IMAGE
                        IMAGE_FAILS_SECURITY_CHECK -> Value.IMAGE_FAILS_SECURITY_CHECK
                        CANNOT_DETERMINE_AMOUNT -> Value.CANNOT_DETERMINE_AMOUNT
                        SIGNATURE_IRREGULAR -> Value.SIGNATURE_IRREGULAR
                        NON_CASH_ITEM -> Value.NON_CASH_ITEM
                        UNABLE_TO_PROCESS -> Value.UNABLE_TO_PROCESS
                        ITEM_EXCEEDS_DOLLAR_LIMIT -> Value.ITEM_EXCEEDS_DOLLAR_LIMIT
                        BRANCH_OR_ACCOUNT_SOLD -> Value.BRANCH_OR_ACCOUNT_SOLD
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        ACH_CONVERSION_NOT_SUPPORTED -> Known.ACH_CONVERSION_NOT_SUPPORTED
                        CLOSED_ACCOUNT -> Known.CLOSED_ACCOUNT
                        DUPLICATE_SUBMISSION -> Known.DUPLICATE_SUBMISSION
                        INSUFFICIENT_FUNDS -> Known.INSUFFICIENT_FUNDS
                        NO_ACCOUNT -> Known.NO_ACCOUNT
                        NOT_AUTHORIZED -> Known.NOT_AUTHORIZED
                        STALE_DATED -> Known.STALE_DATED
                        STOP_PAYMENT -> Known.STOP_PAYMENT
                        UNKNOWN_REASON -> Known.UNKNOWN_REASON
                        UNMATCHED_DETAILS -> Known.UNMATCHED_DETAILS
                        UNREADABLE_IMAGE -> Known.UNREADABLE_IMAGE
                        ENDORSEMENT_IRREGULAR -> Known.ENDORSEMENT_IRREGULAR
                        ALTERED_OR_FICTITIOUS_ITEM -> Known.ALTERED_OR_FICTITIOUS_ITEM
                        FROZEN_OR_BLOCKED_ACCOUNT -> Known.FROZEN_OR_BLOCKED_ACCOUNT
                        POST_DATED -> Known.POST_DATED
                        ENDORSEMENT_MISSING -> Known.ENDORSEMENT_MISSING
                        SIGNATURE_MISSING -> Known.SIGNATURE_MISSING
                        STOP_PAYMENT_SUSPECT -> Known.STOP_PAYMENT_SUSPECT
                        UNUSABLE_IMAGE -> Known.UNUSABLE_IMAGE
                        IMAGE_FAILS_SECURITY_CHECK -> Known.IMAGE_FAILS_SECURITY_CHECK
                        CANNOT_DETERMINE_AMOUNT -> Known.CANNOT_DETERMINE_AMOUNT
                        SIGNATURE_IRREGULAR -> Known.SIGNATURE_IRREGULAR
                        NON_CASH_ITEM -> Known.NON_CASH_ITEM
                        UNABLE_TO_PROCESS -> Known.UNABLE_TO_PROCESS
                        ITEM_EXCEEDS_DOLLAR_LIMIT -> Known.ITEM_EXCEEDS_DOLLAR_LIMIT
                        BRANCH_OR_ACCOUNT_SOLD -> Known.BRANCH_OR_ACCOUNT_SOLD
                        else -> throw IncreaseInvalidDataException("Unknown ReturnReason: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }
        }

        /**
         * A Check Transfer Deposit object. This field will be present in the JSON response if and
         * only if `category` is equal to `check_transfer_deposit`.
         */
        @JsonDeserialize(builder = CheckTransferDeposit.Builder::class)
        @NoAutoDetect
        class CheckTransferDeposit
        private constructor(
            private val backImageFileId: JsonField<String>,
            private val bankOfFirstDepositRoutingNumber: JsonField<String>,
            private val depositedAt: JsonField<OffsetDateTime>,
            private val frontImageFileId: JsonField<String>,
            private val inboundCheckDepositId: JsonField<String>,
            private val transactionId: JsonField<String>,
            private val transferId: JsonField<String>,
            private val type: JsonField<Type>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /**
             * The identifier of the API File object containing an image of the back of the
             * deposited check.
             */
            fun backImageFileId(): Optional<String> =
                Optional.ofNullable(backImageFileId.getNullable("back_image_file_id"))

            /**
             * The American Bankers' Association (ABA) Routing Transit Number (RTN) for the bank
             * depositing this check. In some rare cases, this is not transmitted via Check21 and
             * the value will be null.
             */
            fun bankOfFirstDepositRoutingNumber(): Optional<String> =
                Optional.ofNullable(
                    bankOfFirstDepositRoutingNumber.getNullable(
                        "bank_of_first_deposit_routing_number"
                    )
                )

            /** When the check was deposited. */
            fun depositedAt(): OffsetDateTime = depositedAt.getRequired("deposited_at")

            /**
             * The identifier of the API File object containing an image of the front of the
             * deposited check.
             */
            fun frontImageFileId(): Optional<String> =
                Optional.ofNullable(frontImageFileId.getNullable("front_image_file_id"))

            /**
             * The identifier of the Inbound Check Deposit object associated with this transaction.
             */
            fun inboundCheckDepositId(): Optional<String> =
                Optional.ofNullable(inboundCheckDepositId.getNullable("inbound_check_deposit_id"))

            /** The identifier of the Transaction object created when the check was deposited. */
            fun transactionId(): Optional<String> =
                Optional.ofNullable(transactionId.getNullable("transaction_id"))

            /** The identifier of the Check Transfer object that was deposited. */
            fun transferId(): Optional<String> =
                Optional.ofNullable(transferId.getNullable("transfer_id"))

            /**
             * A constant representing the object's type. For this resource it will always be
             * `check_transfer_deposit`.
             */
            fun type(): Type = type.getRequired("type")

            /**
             * The identifier of the API File object containing an image of the back of the
             * deposited check.
             */
            @JsonProperty("back_image_file_id")
            @ExcludeMissing
            fun _backImageFileId() = backImageFileId

            /**
             * The American Bankers' Association (ABA) Routing Transit Number (RTN) for the bank
             * depositing this check. In some rare cases, this is not transmitted via Check21 and
             * the value will be null.
             */
            @JsonProperty("bank_of_first_deposit_routing_number")
            @ExcludeMissing
            fun _bankOfFirstDepositRoutingNumber() = bankOfFirstDepositRoutingNumber

            /** When the check was deposited. */
            @JsonProperty("deposited_at") @ExcludeMissing fun _depositedAt() = depositedAt

            /**
             * The identifier of the API File object containing an image of the front of the
             * deposited check.
             */
            @JsonProperty("front_image_file_id")
            @ExcludeMissing
            fun _frontImageFileId() = frontImageFileId

            /**
             * The identifier of the Inbound Check Deposit object associated with this transaction.
             */
            @JsonProperty("inbound_check_deposit_id")
            @ExcludeMissing
            fun _inboundCheckDepositId() = inboundCheckDepositId

            /** The identifier of the Transaction object created when the check was deposited. */
            @JsonProperty("transaction_id") @ExcludeMissing fun _transactionId() = transactionId

            /** The identifier of the Check Transfer object that was deposited. */
            @JsonProperty("transfer_id") @ExcludeMissing fun _transferId() = transferId

            /**
             * A constant representing the object's type. For this resource it will always be
             * `check_transfer_deposit`.
             */
            @JsonProperty("type") @ExcludeMissing fun _type() = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): CheckTransferDeposit = apply {
                if (!validated) {
                    backImageFileId()
                    bankOfFirstDepositRoutingNumber()
                    depositedAt()
                    frontImageFileId()
                    inboundCheckDepositId()
                    transactionId()
                    transferId()
                    type()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CheckTransferDeposit &&
                    this.backImageFileId == other.backImageFileId &&
                    this.bankOfFirstDepositRoutingNumber == other.bankOfFirstDepositRoutingNumber &&
                    this.depositedAt == other.depositedAt &&
                    this.frontImageFileId == other.frontImageFileId &&
                    this.inboundCheckDepositId == other.inboundCheckDepositId &&
                    this.transactionId == other.transactionId &&
                    this.transferId == other.transferId &&
                    this.type == other.type &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            backImageFileId,
                            bankOfFirstDepositRoutingNumber,
                            depositedAt,
                            frontImageFileId,
                            inboundCheckDepositId,
                            transactionId,
                            transferId,
                            type,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "CheckTransferDeposit{backImageFileId=$backImageFileId, bankOfFirstDepositRoutingNumber=$bankOfFirstDepositRoutingNumber, depositedAt=$depositedAt, frontImageFileId=$frontImageFileId, inboundCheckDepositId=$inboundCheckDepositId, transactionId=$transactionId, transferId=$transferId, type=$type, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var backImageFileId: JsonField<String> = JsonMissing.of()
                private var bankOfFirstDepositRoutingNumber: JsonField<String> = JsonMissing.of()
                private var depositedAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var frontImageFileId: JsonField<String> = JsonMissing.of()
                private var inboundCheckDepositId: JsonField<String> = JsonMissing.of()
                private var transactionId: JsonField<String> = JsonMissing.of()
                private var transferId: JsonField<String> = JsonMissing.of()
                private var type: JsonField<Type> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(checkTransferDeposit: CheckTransferDeposit) = apply {
                    this.backImageFileId = checkTransferDeposit.backImageFileId
                    this.bankOfFirstDepositRoutingNumber =
                        checkTransferDeposit.bankOfFirstDepositRoutingNumber
                    this.depositedAt = checkTransferDeposit.depositedAt
                    this.frontImageFileId = checkTransferDeposit.frontImageFileId
                    this.inboundCheckDepositId = checkTransferDeposit.inboundCheckDepositId
                    this.transactionId = checkTransferDeposit.transactionId
                    this.transferId = checkTransferDeposit.transferId
                    this.type = checkTransferDeposit.type
                    additionalProperties(checkTransferDeposit.additionalProperties)
                }

                /**
                 * The identifier of the API File object containing an image of the back of the
                 * deposited check.
                 */
                fun backImageFileId(backImageFileId: String) =
                    backImageFileId(JsonField.of(backImageFileId))

                /**
                 * The identifier of the API File object containing an image of the back of the
                 * deposited check.
                 */
                @JsonProperty("back_image_file_id")
                @ExcludeMissing
                fun backImageFileId(backImageFileId: JsonField<String>) = apply {
                    this.backImageFileId = backImageFileId
                }

                /**
                 * The American Bankers' Association (ABA) Routing Transit Number (RTN) for the bank
                 * depositing this check. In some rare cases, this is not transmitted via Check21
                 * and the value will be null.
                 */
                fun bankOfFirstDepositRoutingNumber(bankOfFirstDepositRoutingNumber: String) =
                    bankOfFirstDepositRoutingNumber(JsonField.of(bankOfFirstDepositRoutingNumber))

                /**
                 * The American Bankers' Association (ABA) Routing Transit Number (RTN) for the bank
                 * depositing this check. In some rare cases, this is not transmitted via Check21
                 * and the value will be null.
                 */
                @JsonProperty("bank_of_first_deposit_routing_number")
                @ExcludeMissing
                fun bankOfFirstDepositRoutingNumber(
                    bankOfFirstDepositRoutingNumber: JsonField<String>
                ) = apply { this.bankOfFirstDepositRoutingNumber = bankOfFirstDepositRoutingNumber }

                /** When the check was deposited. */
                fun depositedAt(depositedAt: OffsetDateTime) =
                    depositedAt(JsonField.of(depositedAt))

                /** When the check was deposited. */
                @JsonProperty("deposited_at")
                @ExcludeMissing
                fun depositedAt(depositedAt: JsonField<OffsetDateTime>) = apply {
                    this.depositedAt = depositedAt
                }

                /**
                 * The identifier of the API File object containing an image of the front of the
                 * deposited check.
                 */
                fun frontImageFileId(frontImageFileId: String) =
                    frontImageFileId(JsonField.of(frontImageFileId))

                /**
                 * The identifier of the API File object containing an image of the front of the
                 * deposited check.
                 */
                @JsonProperty("front_image_file_id")
                @ExcludeMissing
                fun frontImageFileId(frontImageFileId: JsonField<String>) = apply {
                    this.frontImageFileId = frontImageFileId
                }

                /**
                 * The identifier of the Inbound Check Deposit object associated with this
                 * transaction.
                 */
                fun inboundCheckDepositId(inboundCheckDepositId: String) =
                    inboundCheckDepositId(JsonField.of(inboundCheckDepositId))

                /**
                 * The identifier of the Inbound Check Deposit object associated with this
                 * transaction.
                 */
                @JsonProperty("inbound_check_deposit_id")
                @ExcludeMissing
                fun inboundCheckDepositId(inboundCheckDepositId: JsonField<String>) = apply {
                    this.inboundCheckDepositId = inboundCheckDepositId
                }

                /**
                 * The identifier of the Transaction object created when the check was deposited.
                 */
                fun transactionId(transactionId: String) =
                    transactionId(JsonField.of(transactionId))

                /**
                 * The identifier of the Transaction object created when the check was deposited.
                 */
                @JsonProperty("transaction_id")
                @ExcludeMissing
                fun transactionId(transactionId: JsonField<String>) = apply {
                    this.transactionId = transactionId
                }

                /** The identifier of the Check Transfer object that was deposited. */
                fun transferId(transferId: String) = transferId(JsonField.of(transferId))

                /** The identifier of the Check Transfer object that was deposited. */
                @JsonProperty("transfer_id")
                @ExcludeMissing
                fun transferId(transferId: JsonField<String>) = apply {
                    this.transferId = transferId
                }

                /**
                 * A constant representing the object's type. For this resource it will always be
                 * `check_transfer_deposit`.
                 */
                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * A constant representing the object's type. For this resource it will always be
                 * `check_transfer_deposit`.
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

                fun build(): CheckTransferDeposit =
                    CheckTransferDeposit(
                        backImageFileId,
                        bankOfFirstDepositRoutingNumber,
                        depositedAt,
                        frontImageFileId,
                        inboundCheckDepositId,
                        transactionId,
                        transferId,
                        type,
                        additionalProperties.toUnmodifiable(),
                    )
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

                    return other is Type && this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    @JvmField
                    val CHECK_TRANSFER_DEPOSIT = Type(JsonField.of("check_transfer_deposit"))

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                enum class Known {
                    CHECK_TRANSFER_DEPOSIT,
                }

                enum class Value {
                    CHECK_TRANSFER_DEPOSIT,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        CHECK_TRANSFER_DEPOSIT -> Value.CHECK_TRANSFER_DEPOSIT
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        CHECK_TRANSFER_DEPOSIT -> Known.CHECK_TRANSFER_DEPOSIT
                        else -> throw IncreaseInvalidDataException("Unknown Type: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }
        }

        /**
         * A Fee Payment object. This field will be present in the JSON response if and only if
         * `category` is equal to `fee_payment`.
         */
        @JsonDeserialize(builder = FeePayment.Builder::class)
        @NoAutoDetect
        class FeePayment
        private constructor(
            private val amount: JsonField<Long>,
            private val currency: JsonField<Currency>,
            private val feePeriodStart: JsonField<LocalDate>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /**
             * The amount in the minor unit of the transaction's currency. For dollars, for example,
             * this is cents.
             */
            fun amount(): Long = amount.getRequired("amount")

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction
             * currency.
             */
            fun currency(): Currency = currency.getRequired("currency")

            /** The start of this payment's fee period, usually the first day of a month. */
            fun feePeriodStart(): LocalDate = feePeriodStart.getRequired("fee_period_start")

            /**
             * The amount in the minor unit of the transaction's currency. For dollars, for example,
             * this is cents.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction
             * currency.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            /** The start of this payment's fee period, usually the first day of a month. */
            @JsonProperty("fee_period_start") @ExcludeMissing fun _feePeriodStart() = feePeriodStart

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): FeePayment = apply {
                if (!validated) {
                    amount()
                    currency()
                    feePeriodStart()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is FeePayment &&
                    this.amount == other.amount &&
                    this.currency == other.currency &&
                    this.feePeriodStart == other.feePeriodStart &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            amount,
                            currency,
                            feePeriodStart,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "FeePayment{amount=$amount, currency=$currency, feePeriodStart=$feePeriodStart, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var amount: JsonField<Long> = JsonMissing.of()
                private var currency: JsonField<Currency> = JsonMissing.of()
                private var feePeriodStart: JsonField<LocalDate> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(feePayment: FeePayment) = apply {
                    this.amount = feePayment.amount
                    this.currency = feePayment.currency
                    this.feePeriodStart = feePayment.feePeriodStart
                    additionalProperties(feePayment.additionalProperties)
                }

                /**
                 * The amount in the minor unit of the transaction's currency. For dollars, for
                 * example, this is cents.
                 */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /**
                 * The amount in the minor unit of the transaction's currency. For dollars, for
                 * example, this is cents.
                 */
                @JsonProperty("amount")
                @ExcludeMissing
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction
                 * currency.
                 */
                fun currency(currency: Currency) = currency(JsonField.of(currency))

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction
                 * currency.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                /** The start of this payment's fee period, usually the first day of a month. */
                fun feePeriodStart(feePeriodStart: LocalDate) =
                    feePeriodStart(JsonField.of(feePeriodStart))

                /** The start of this payment's fee period, usually the first day of a month. */
                @JsonProperty("fee_period_start")
                @ExcludeMissing
                fun feePeriodStart(feePeriodStart: JsonField<LocalDate>) = apply {
                    this.feePeriodStart = feePeriodStart
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

                fun build(): FeePayment =
                    FeePayment(
                        amount,
                        currency,
                        feePeriodStart,
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

                    return other is Currency && this.value == other.value
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
        }

        /**
         * An Inbound ACH Transfer Intention object. This field will be present in the JSON response
         * if and only if `category` is equal to `inbound_ach_transfer`.
         */
        @JsonDeserialize(builder = InboundAchTransfer.Builder::class)
        @NoAutoDetect
        class InboundAchTransfer
        private constructor(
            private val addenda: JsonField<Addenda>,
            private val amount: JsonField<Long>,
            private val originatorCompanyDescriptiveDate: JsonField<String>,
            private val originatorCompanyDiscretionaryData: JsonField<String>,
            private val originatorCompanyEntryDescription: JsonField<String>,
            private val originatorCompanyId: JsonField<String>,
            private val originatorCompanyName: JsonField<String>,
            private val receiverIdNumber: JsonField<String>,
            private val receiverName: JsonField<String>,
            private val traceNumber: JsonField<String>,
            private val transferId: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** Additional information sent from the originator. */
            fun addenda(): Optional<Addenda> = Optional.ofNullable(addenda.getNullable("addenda"))

            /**
             * The amount in the minor unit of the destination account currency. For dollars, for
             * example, this is cents.
             */
            fun amount(): Long = amount.getRequired("amount")

            /** The description of the date of the transfer, usually in the format `YYMMDD`. */
            fun originatorCompanyDescriptiveDate(): Optional<String> =
                Optional.ofNullable(
                    originatorCompanyDescriptiveDate.getNullable(
                        "originator_company_descriptive_date"
                    )
                )

            /** Data set by the originator. */
            fun originatorCompanyDiscretionaryData(): Optional<String> =
                Optional.ofNullable(
                    originatorCompanyDiscretionaryData.getNullable(
                        "originator_company_discretionary_data"
                    )
                )

            /** An informational description of the transfer. */
            fun originatorCompanyEntryDescription(): String =
                originatorCompanyEntryDescription.getRequired(
                    "originator_company_entry_description"
                )

            /**
             * An identifier for the originating company. This is generally, but not always, a
             * stable identifier across multiple transfers.
             */
            fun originatorCompanyId(): String =
                originatorCompanyId.getRequired("originator_company_id")

            /** A name set by the originator to identify themselves. */
            fun originatorCompanyName(): String =
                originatorCompanyName.getRequired("originator_company_name")

            /** The originator's identifier for the transfer recipient. */
            fun receiverIdNumber(): Optional<String> =
                Optional.ofNullable(receiverIdNumber.getNullable("receiver_id_number"))

            /**
             * The name of the transfer recipient. This value is informational and not verified by
             * Increase.
             */
            fun receiverName(): Optional<String> =
                Optional.ofNullable(receiverName.getNullable("receiver_name"))

            /**
             * A 15 digit number recorded in the Nacha file and available to both the originating
             * and receiving bank. Along with the amount, date, and originating routing number, this
             * can be used to identify the ACH transfer at either bank. ACH trace numbers are not
             * unique, but are
             * [used to correlate returns](https://increase.com/documentation/ach-returns#ach-returns).
             */
            fun traceNumber(): String = traceNumber.getRequired("trace_number")

            /** The Inbound ACH Transfer's identifier. */
            fun transferId(): String = transferId.getRequired("transfer_id")

            /** Additional information sent from the originator. */
            @JsonProperty("addenda") @ExcludeMissing fun _addenda() = addenda

            /**
             * The amount in the minor unit of the destination account currency. For dollars, for
             * example, this is cents.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            /** The description of the date of the transfer, usually in the format `YYMMDD`. */
            @JsonProperty("originator_company_descriptive_date")
            @ExcludeMissing
            fun _originatorCompanyDescriptiveDate() = originatorCompanyDescriptiveDate

            /** Data set by the originator. */
            @JsonProperty("originator_company_discretionary_data")
            @ExcludeMissing
            fun _originatorCompanyDiscretionaryData() = originatorCompanyDiscretionaryData

            /** An informational description of the transfer. */
            @JsonProperty("originator_company_entry_description")
            @ExcludeMissing
            fun _originatorCompanyEntryDescription() = originatorCompanyEntryDescription

            /**
             * An identifier for the originating company. This is generally, but not always, a
             * stable identifier across multiple transfers.
             */
            @JsonProperty("originator_company_id")
            @ExcludeMissing
            fun _originatorCompanyId() = originatorCompanyId

            /** A name set by the originator to identify themselves. */
            @JsonProperty("originator_company_name")
            @ExcludeMissing
            fun _originatorCompanyName() = originatorCompanyName

            /** The originator's identifier for the transfer recipient. */
            @JsonProperty("receiver_id_number")
            @ExcludeMissing
            fun _receiverIdNumber() = receiverIdNumber

            /**
             * The name of the transfer recipient. This value is informational and not verified by
             * Increase.
             */
            @JsonProperty("receiver_name") @ExcludeMissing fun _receiverName() = receiverName

            /**
             * A 15 digit number recorded in the Nacha file and available to both the originating
             * and receiving bank. Along with the amount, date, and originating routing number, this
             * can be used to identify the ACH transfer at either bank. ACH trace numbers are not
             * unique, but are
             * [used to correlate returns](https://increase.com/documentation/ach-returns#ach-returns).
             */
            @JsonProperty("trace_number") @ExcludeMissing fun _traceNumber() = traceNumber

            /** The Inbound ACH Transfer's identifier. */
            @JsonProperty("transfer_id") @ExcludeMissing fun _transferId() = transferId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): InboundAchTransfer = apply {
                if (!validated) {
                    addenda().map { it.validate() }
                    amount()
                    originatorCompanyDescriptiveDate()
                    originatorCompanyDiscretionaryData()
                    originatorCompanyEntryDescription()
                    originatorCompanyId()
                    originatorCompanyName()
                    receiverIdNumber()
                    receiverName()
                    traceNumber()
                    transferId()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is InboundAchTransfer &&
                    this.addenda == other.addenda &&
                    this.amount == other.amount &&
                    this.originatorCompanyDescriptiveDate ==
                        other.originatorCompanyDescriptiveDate &&
                    this.originatorCompanyDiscretionaryData ==
                        other.originatorCompanyDiscretionaryData &&
                    this.originatorCompanyEntryDescription ==
                        other.originatorCompanyEntryDescription &&
                    this.originatorCompanyId == other.originatorCompanyId &&
                    this.originatorCompanyName == other.originatorCompanyName &&
                    this.receiverIdNumber == other.receiverIdNumber &&
                    this.receiverName == other.receiverName &&
                    this.traceNumber == other.traceNumber &&
                    this.transferId == other.transferId &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            addenda,
                            amount,
                            originatorCompanyDescriptiveDate,
                            originatorCompanyDiscretionaryData,
                            originatorCompanyEntryDescription,
                            originatorCompanyId,
                            originatorCompanyName,
                            receiverIdNumber,
                            receiverName,
                            traceNumber,
                            transferId,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "InboundAchTransfer{addenda=$addenda, amount=$amount, originatorCompanyDescriptiveDate=$originatorCompanyDescriptiveDate, originatorCompanyDiscretionaryData=$originatorCompanyDiscretionaryData, originatorCompanyEntryDescription=$originatorCompanyEntryDescription, originatorCompanyId=$originatorCompanyId, originatorCompanyName=$originatorCompanyName, receiverIdNumber=$receiverIdNumber, receiverName=$receiverName, traceNumber=$traceNumber, transferId=$transferId, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var addenda: JsonField<Addenda> = JsonMissing.of()
                private var amount: JsonField<Long> = JsonMissing.of()
                private var originatorCompanyDescriptiveDate: JsonField<String> = JsonMissing.of()
                private var originatorCompanyDiscretionaryData: JsonField<String> = JsonMissing.of()
                private var originatorCompanyEntryDescription: JsonField<String> = JsonMissing.of()
                private var originatorCompanyId: JsonField<String> = JsonMissing.of()
                private var originatorCompanyName: JsonField<String> = JsonMissing.of()
                private var receiverIdNumber: JsonField<String> = JsonMissing.of()
                private var receiverName: JsonField<String> = JsonMissing.of()
                private var traceNumber: JsonField<String> = JsonMissing.of()
                private var transferId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(inboundAchTransfer: InboundAchTransfer) = apply {
                    this.addenda = inboundAchTransfer.addenda
                    this.amount = inboundAchTransfer.amount
                    this.originatorCompanyDescriptiveDate =
                        inboundAchTransfer.originatorCompanyDescriptiveDate
                    this.originatorCompanyDiscretionaryData =
                        inboundAchTransfer.originatorCompanyDiscretionaryData
                    this.originatorCompanyEntryDescription =
                        inboundAchTransfer.originatorCompanyEntryDescription
                    this.originatorCompanyId = inboundAchTransfer.originatorCompanyId
                    this.originatorCompanyName = inboundAchTransfer.originatorCompanyName
                    this.receiverIdNumber = inboundAchTransfer.receiverIdNumber
                    this.receiverName = inboundAchTransfer.receiverName
                    this.traceNumber = inboundAchTransfer.traceNumber
                    this.transferId = inboundAchTransfer.transferId
                    additionalProperties(inboundAchTransfer.additionalProperties)
                }

                /** Additional information sent from the originator. */
                fun addenda(addenda: Addenda) = addenda(JsonField.of(addenda))

                /** Additional information sent from the originator. */
                @JsonProperty("addenda")
                @ExcludeMissing
                fun addenda(addenda: JsonField<Addenda>) = apply { this.addenda = addenda }

                /**
                 * The amount in the minor unit of the destination account currency. For dollars,
                 * for example, this is cents.
                 */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /**
                 * The amount in the minor unit of the destination account currency. For dollars,
                 * for example, this is cents.
                 */
                @JsonProperty("amount")
                @ExcludeMissing
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /** The description of the date of the transfer, usually in the format `YYMMDD`. */
                fun originatorCompanyDescriptiveDate(originatorCompanyDescriptiveDate: String) =
                    originatorCompanyDescriptiveDate(JsonField.of(originatorCompanyDescriptiveDate))

                /** The description of the date of the transfer, usually in the format `YYMMDD`. */
                @JsonProperty("originator_company_descriptive_date")
                @ExcludeMissing
                fun originatorCompanyDescriptiveDate(
                    originatorCompanyDescriptiveDate: JsonField<String>
                ) = apply {
                    this.originatorCompanyDescriptiveDate = originatorCompanyDescriptiveDate
                }

                /** Data set by the originator. */
                fun originatorCompanyDiscretionaryData(originatorCompanyDiscretionaryData: String) =
                    originatorCompanyDiscretionaryData(
                        JsonField.of(originatorCompanyDiscretionaryData)
                    )

                /** Data set by the originator. */
                @JsonProperty("originator_company_discretionary_data")
                @ExcludeMissing
                fun originatorCompanyDiscretionaryData(
                    originatorCompanyDiscretionaryData: JsonField<String>
                ) = apply {
                    this.originatorCompanyDiscretionaryData = originatorCompanyDiscretionaryData
                }

                /** An informational description of the transfer. */
                fun originatorCompanyEntryDescription(originatorCompanyEntryDescription: String) =
                    originatorCompanyEntryDescription(
                        JsonField.of(originatorCompanyEntryDescription)
                    )

                /** An informational description of the transfer. */
                @JsonProperty("originator_company_entry_description")
                @ExcludeMissing
                fun originatorCompanyEntryDescription(
                    originatorCompanyEntryDescription: JsonField<String>
                ) = apply {
                    this.originatorCompanyEntryDescription = originatorCompanyEntryDescription
                }

                /**
                 * An identifier for the originating company. This is generally, but not always, a
                 * stable identifier across multiple transfers.
                 */
                fun originatorCompanyId(originatorCompanyId: String) =
                    originatorCompanyId(JsonField.of(originatorCompanyId))

                /**
                 * An identifier for the originating company. This is generally, but not always, a
                 * stable identifier across multiple transfers.
                 */
                @JsonProperty("originator_company_id")
                @ExcludeMissing
                fun originatorCompanyId(originatorCompanyId: JsonField<String>) = apply {
                    this.originatorCompanyId = originatorCompanyId
                }

                /** A name set by the originator to identify themselves. */
                fun originatorCompanyName(originatorCompanyName: String) =
                    originatorCompanyName(JsonField.of(originatorCompanyName))

                /** A name set by the originator to identify themselves. */
                @JsonProperty("originator_company_name")
                @ExcludeMissing
                fun originatorCompanyName(originatorCompanyName: JsonField<String>) = apply {
                    this.originatorCompanyName = originatorCompanyName
                }

                /** The originator's identifier for the transfer recipient. */
                fun receiverIdNumber(receiverIdNumber: String) =
                    receiverIdNumber(JsonField.of(receiverIdNumber))

                /** The originator's identifier for the transfer recipient. */
                @JsonProperty("receiver_id_number")
                @ExcludeMissing
                fun receiverIdNumber(receiverIdNumber: JsonField<String>) = apply {
                    this.receiverIdNumber = receiverIdNumber
                }

                /**
                 * The name of the transfer recipient. This value is informational and not verified
                 * by Increase.
                 */
                fun receiverName(receiverName: String) = receiverName(JsonField.of(receiverName))

                /**
                 * The name of the transfer recipient. This value is informational and not verified
                 * by Increase.
                 */
                @JsonProperty("receiver_name")
                @ExcludeMissing
                fun receiverName(receiverName: JsonField<String>) = apply {
                    this.receiverName = receiverName
                }

                /**
                 * A 15 digit number recorded in the Nacha file and available to both the
                 * originating and receiving bank. Along with the amount, date, and originating
                 * routing number, this can be used to identify the ACH transfer at either bank. ACH
                 * trace numbers are not unique, but are
                 * [used to correlate returns](https://increase.com/documentation/ach-returns#ach-returns).
                 */
                fun traceNumber(traceNumber: String) = traceNumber(JsonField.of(traceNumber))

                /**
                 * A 15 digit number recorded in the Nacha file and available to both the
                 * originating and receiving bank. Along with the amount, date, and originating
                 * routing number, this can be used to identify the ACH transfer at either bank. ACH
                 * trace numbers are not unique, but are
                 * [used to correlate returns](https://increase.com/documentation/ach-returns#ach-returns).
                 */
                @JsonProperty("trace_number")
                @ExcludeMissing
                fun traceNumber(traceNumber: JsonField<String>) = apply {
                    this.traceNumber = traceNumber
                }

                /** The Inbound ACH Transfer's identifier. */
                fun transferId(transferId: String) = transferId(JsonField.of(transferId))

                /** The Inbound ACH Transfer's identifier. */
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

                fun build(): InboundAchTransfer =
                    InboundAchTransfer(
                        addenda,
                        amount,
                        originatorCompanyDescriptiveDate,
                        originatorCompanyDiscretionaryData,
                        originatorCompanyEntryDescription,
                        originatorCompanyId,
                        originatorCompanyName,
                        receiverIdNumber,
                        receiverName,
                        traceNumber,
                        transferId,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            /** Additional information sent from the originator. */
            @JsonDeserialize(builder = Addenda.Builder::class)
            @NoAutoDetect
            class Addenda
            private constructor(
                private val category: JsonField<Category>,
                private val freeform: JsonField<Freeform>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /** The type of addendum. */
                fun category(): Category = category.getRequired("category")

                /** Unstructured `payment_related_information` passed through by the originator. */
                fun freeform(): Optional<Freeform> =
                    Optional.ofNullable(freeform.getNullable("freeform"))

                /** The type of addendum. */
                @JsonProperty("category") @ExcludeMissing fun _category() = category

                /** Unstructured `payment_related_information` passed through by the originator. */
                @JsonProperty("freeform") @ExcludeMissing fun _freeform() = freeform

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Addenda = apply {
                    if (!validated) {
                        category()
                        freeform().map { it.validate() }
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Addenda &&
                        this.category == other.category &&
                        this.freeform == other.freeform &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                category,
                                freeform,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "Addenda{category=$category, freeform=$freeform, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var category: JsonField<Category> = JsonMissing.of()
                    private var freeform: JsonField<Freeform> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(addenda: Addenda) = apply {
                        this.category = addenda.category
                        this.freeform = addenda.freeform
                        additionalProperties(addenda.additionalProperties)
                    }

                    /** The type of addendum. */
                    fun category(category: Category) = category(JsonField.of(category))

                    /** The type of addendum. */
                    @JsonProperty("category")
                    @ExcludeMissing
                    fun category(category: JsonField<Category>) = apply { this.category = category }

                    /**
                     * Unstructured `payment_related_information` passed through by the originator.
                     */
                    fun freeform(freeform: Freeform) = freeform(JsonField.of(freeform))

                    /**
                     * Unstructured `payment_related_information` passed through by the originator.
                     */
                    @JsonProperty("freeform")
                    @ExcludeMissing
                    fun freeform(freeform: JsonField<Freeform>) = apply { this.freeform = freeform }

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

                    fun build(): Addenda =
                        Addenda(
                            category,
                            freeform,
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

                        return other is Category && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        @JvmField val FREEFORM = Category(JsonField.of("freeform"))

                        @JvmStatic fun of(value: String) = Category(JsonField.of(value))
                    }

                    enum class Known {
                        FREEFORM,
                    }

                    enum class Value {
                        FREEFORM,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            FREEFORM -> Value.FREEFORM
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            FREEFORM -> Known.FREEFORM
                            else -> throw IncreaseInvalidDataException("Unknown Category: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }

                /** Unstructured `payment_related_information` passed through by the originator. */
                @JsonDeserialize(builder = Freeform.Builder::class)
                @NoAutoDetect
                class Freeform
                private constructor(
                    private val entries: JsonField<List<Entry>>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    /** Each entry represents an addendum received from the originator. */
                    fun entries(): List<Entry> = entries.getRequired("entries")

                    /** Each entry represents an addendum received from the originator. */
                    @JsonProperty("entries") @ExcludeMissing fun _entries() = entries

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): Freeform = apply {
                        if (!validated) {
                            entries().forEach { it.validate() }
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Freeform &&
                            this.entries == other.entries &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode = Objects.hash(entries, additionalProperties)
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "Freeform{entries=$entries, additionalProperties=$additionalProperties}"

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var entries: JsonField<List<Entry>> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(freeform: Freeform) = apply {
                            this.entries = freeform.entries
                            additionalProperties(freeform.additionalProperties)
                        }

                        /** Each entry represents an addendum received from the originator. */
                        fun entries(entries: List<Entry>) = entries(JsonField.of(entries))

                        /** Each entry represents an addendum received from the originator. */
                        @JsonProperty("entries")
                        @ExcludeMissing
                        fun entries(entries: JsonField<List<Entry>>) = apply {
                            this.entries = entries
                        }

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

                        fun build(): Freeform =
                            Freeform(
                                entries.map { it.toUnmodifiable() },
                                additionalProperties.toUnmodifiable()
                            )
                    }

                    @JsonDeserialize(builder = Entry.Builder::class)
                    @NoAutoDetect
                    class Entry
                    private constructor(
                        private val paymentRelatedInformation: JsonField<String>,
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        private var validated: Boolean = false

                        private var hashCode: Int = 0

                        /** The payment related information passed in the addendum. */
                        fun paymentRelatedInformation(): String =
                            paymentRelatedInformation.getRequired("payment_related_information")

                        /** The payment related information passed in the addendum. */
                        @JsonProperty("payment_related_information")
                        @ExcludeMissing
                        fun _paymentRelatedInformation() = paymentRelatedInformation

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): Entry = apply {
                            if (!validated) {
                                paymentRelatedInformation()
                                validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Entry &&
                                this.paymentRelatedInformation == other.paymentRelatedInformation &&
                                this.additionalProperties == other.additionalProperties
                        }

                        override fun hashCode(): Int {
                            if (hashCode == 0) {
                                hashCode =
                                    Objects.hash(paymentRelatedInformation, additionalProperties)
                            }
                            return hashCode
                        }

                        override fun toString() =
                            "Entry{paymentRelatedInformation=$paymentRelatedInformation, additionalProperties=$additionalProperties}"

                        companion object {

                            @JvmStatic fun builder() = Builder()
                        }

                        class Builder {

                            private var paymentRelatedInformation: JsonField<String> =
                                JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(entry: Entry) = apply {
                                this.paymentRelatedInformation = entry.paymentRelatedInformation
                                additionalProperties(entry.additionalProperties)
                            }

                            /** The payment related information passed in the addendum. */
                            fun paymentRelatedInformation(paymentRelatedInformation: String) =
                                paymentRelatedInformation(JsonField.of(paymentRelatedInformation))

                            /** The payment related information passed in the addendum. */
                            @JsonProperty("payment_related_information")
                            @ExcludeMissing
                            fun paymentRelatedInformation(
                                paymentRelatedInformation: JsonField<String>
                            ) = apply { this.paymentRelatedInformation = paymentRelatedInformation }

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

                            fun build(): Entry =
                                Entry(
                                    paymentRelatedInformation,
                                    additionalProperties.toUnmodifiable()
                                )
                        }
                    }
                }
            }
        }

        /**
         * An Inbound Real-Time Payments Transfer Confirmation object. This field will be present in
         * the JSON response if and only if `category` is equal to
         * `inbound_real_time_payments_transfer_confirmation`.
         */
        @JsonDeserialize(builder = InboundRealTimePaymentsTransferConfirmation.Builder::class)
        @NoAutoDetect
        class InboundRealTimePaymentsTransferConfirmation
        private constructor(
            private val amount: JsonField<Long>,
            private val creditorName: JsonField<String>,
            private val currency: JsonField<Currency>,
            private val debtorAccountNumber: JsonField<String>,
            private val debtorName: JsonField<String>,
            private val debtorRoutingNumber: JsonField<String>,
            private val remittanceInformation: JsonField<String>,
            private val transactionIdentification: JsonField<String>,
            private val transferId: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /**
             * The amount in the minor unit of the transfer's currency. For dollars, for example,
             * this is cents.
             */
            fun amount(): Long = amount.getRequired("amount")

            /** The name the sender of the transfer specified as the recipient of the transfer. */
            fun creditorName(): String = creditorName.getRequired("creditor_name")

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code of the transfer's
             * currency. This will always be "USD" for a Real-Time Payments transfer.
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

            /** Additional information included with the transfer. */
            fun remittanceInformation(): Optional<String> =
                Optional.ofNullable(remittanceInformation.getNullable("remittance_information"))

            /** The Real-Time Payments network identification of the transfer. */
            fun transactionIdentification(): String =
                transactionIdentification.getRequired("transaction_identification")

            /** The identifier of the Real-Time Payments Transfer that led to this Transaction. */
            fun transferId(): String = transferId.getRequired("transfer_id")

            /**
             * The amount in the minor unit of the transfer's currency. For dollars, for example,
             * this is cents.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            /** The name the sender of the transfer specified as the recipient of the transfer. */
            @JsonProperty("creditor_name") @ExcludeMissing fun _creditorName() = creditorName

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code of the transfer's
             * currency. This will always be "USD" for a Real-Time Payments transfer.
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

            /** Additional information included with the transfer. */
            @JsonProperty("remittance_information")
            @ExcludeMissing
            fun _remittanceInformation() = remittanceInformation

            /** The Real-Time Payments network identification of the transfer. */
            @JsonProperty("transaction_identification")
            @ExcludeMissing
            fun _transactionIdentification() = transactionIdentification

            /** The identifier of the Real-Time Payments Transfer that led to this Transaction. */
            @JsonProperty("transfer_id") @ExcludeMissing fun _transferId() = transferId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): InboundRealTimePaymentsTransferConfirmation = apply {
                if (!validated) {
                    amount()
                    creditorName()
                    currency()
                    debtorAccountNumber()
                    debtorName()
                    debtorRoutingNumber()
                    remittanceInformation()
                    transactionIdentification()
                    transferId()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is InboundRealTimePaymentsTransferConfirmation &&
                    this.amount == other.amount &&
                    this.creditorName == other.creditorName &&
                    this.currency == other.currency &&
                    this.debtorAccountNumber == other.debtorAccountNumber &&
                    this.debtorName == other.debtorName &&
                    this.debtorRoutingNumber == other.debtorRoutingNumber &&
                    this.remittanceInformation == other.remittanceInformation &&
                    this.transactionIdentification == other.transactionIdentification &&
                    this.transferId == other.transferId &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            amount,
                            creditorName,
                            currency,
                            debtorAccountNumber,
                            debtorName,
                            debtorRoutingNumber,
                            remittanceInformation,
                            transactionIdentification,
                            transferId,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "InboundRealTimePaymentsTransferConfirmation{amount=$amount, creditorName=$creditorName, currency=$currency, debtorAccountNumber=$debtorAccountNumber, debtorName=$debtorName, debtorRoutingNumber=$debtorRoutingNumber, remittanceInformation=$remittanceInformation, transactionIdentification=$transactionIdentification, transferId=$transferId, additionalProperties=$additionalProperties}"

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
                private var remittanceInformation: JsonField<String> = JsonMissing.of()
                private var transactionIdentification: JsonField<String> = JsonMissing.of()
                private var transferId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    inboundRealTimePaymentsTransferConfirmation:
                        InboundRealTimePaymentsTransferConfirmation
                ) = apply {
                    this.amount = inboundRealTimePaymentsTransferConfirmation.amount
                    this.creditorName = inboundRealTimePaymentsTransferConfirmation.creditorName
                    this.currency = inboundRealTimePaymentsTransferConfirmation.currency
                    this.debtorAccountNumber =
                        inboundRealTimePaymentsTransferConfirmation.debtorAccountNumber
                    this.debtorName = inboundRealTimePaymentsTransferConfirmation.debtorName
                    this.debtorRoutingNumber =
                        inboundRealTimePaymentsTransferConfirmation.debtorRoutingNumber
                    this.remittanceInformation =
                        inboundRealTimePaymentsTransferConfirmation.remittanceInformation
                    this.transactionIdentification =
                        inboundRealTimePaymentsTransferConfirmation.transactionIdentification
                    this.transferId = inboundRealTimePaymentsTransferConfirmation.transferId
                    additionalProperties(
                        inboundRealTimePaymentsTransferConfirmation.additionalProperties
                    )
                }

                /**
                 * The amount in the minor unit of the transfer's currency. For dollars, for
                 * example, this is cents.
                 */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /**
                 * The amount in the minor unit of the transfer's currency. For dollars, for
                 * example, this is cents.
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
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code of the transfer's
                 * currency. This will always be "USD" for a Real-Time Payments transfer.
                 */
                fun currency(currency: Currency) = currency(JsonField.of(currency))

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code of the transfer's
                 * currency. This will always be "USD" for a Real-Time Payments transfer.
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

                /** Additional information included with the transfer. */
                fun remittanceInformation(remittanceInformation: String) =
                    remittanceInformation(JsonField.of(remittanceInformation))

                /** Additional information included with the transfer. */
                @JsonProperty("remittance_information")
                @ExcludeMissing
                fun remittanceInformation(remittanceInformation: JsonField<String>) = apply {
                    this.remittanceInformation = remittanceInformation
                }

                /** The Real-Time Payments network identification of the transfer. */
                fun transactionIdentification(transactionIdentification: String) =
                    transactionIdentification(JsonField.of(transactionIdentification))

                /** The Real-Time Payments network identification of the transfer. */
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

                fun build(): InboundRealTimePaymentsTransferConfirmation =
                    InboundRealTimePaymentsTransferConfirmation(
                        amount,
                        creditorName,
                        currency,
                        debtorAccountNumber,
                        debtorName,
                        debtorRoutingNumber,
                        remittanceInformation,
                        transactionIdentification,
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

                    return other is Currency && this.value == other.value
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

            private var hashCode: Int = 0

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is InboundRealTimePaymentsTransferDecline &&
                    this.amount == other.amount &&
                    this.creditorName == other.creditorName &&
                    this.currency == other.currency &&
                    this.debtorAccountNumber == other.debtorAccountNumber &&
                    this.debtorName == other.debtorName &&
                    this.debtorRoutingNumber == other.debtorRoutingNumber &&
                    this.reason == other.reason &&
                    this.remittanceInformation == other.remittanceInformation &&
                    this.transactionIdentification == other.transactionIdentification &&
                    this.transferId == other.transferId &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
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
                return hashCode
            }

            override fun toString() =
                "InboundRealTimePaymentsTransferDecline{amount=$amount, creditorName=$creditorName, currency=$currency, debtorAccountNumber=$debtorAccountNumber, debtorName=$debtorName, debtorRoutingNumber=$debtorRoutingNumber, reason=$reason, remittanceInformation=$remittanceInformation, transactionIdentification=$transactionIdentification, transferId=$transferId, additionalProperties=$additionalProperties}"

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

                    return other is Currency && this.value == other.value
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

                    return other is Reason && this.value == other.value
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
        }

        /**
         * An Inbound Wire Reversal object. This field will be present in the JSON response if and
         * only if `category` is equal to `inbound_wire_reversal`.
         */
        @JsonDeserialize(builder = InboundWireReversal.Builder::class)
        @NoAutoDetect
        class InboundWireReversal
        private constructor(
            private val amount: JsonField<Long>,
            private val createdAt: JsonField<OffsetDateTime>,
            private val description: JsonField<String>,
            private val financialInstitutionToFinancialInstitutionInformation: JsonField<String>,
            private val inputCycleDate: JsonField<LocalDate>,
            private val inputMessageAccountabilityData: JsonField<String>,
            private val inputSequenceNumber: JsonField<String>,
            private val inputSource: JsonField<String>,
            private val originatorRoutingNumber: JsonField<String>,
            private val previousMessageInputCycleDate: JsonField<LocalDate>,
            private val previousMessageInputMessageAccountabilityData: JsonField<String>,
            private val previousMessageInputSequenceNumber: JsonField<String>,
            private val previousMessageInputSource: JsonField<String>,
            private val receiverFinancialInstitutionInformation: JsonField<String>,
            private val senderReference: JsonField<String>,
            private val transactionId: JsonField<String>,
            private val wireTransferId: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** The amount that was reversed in USD cents. */
            fun amount(): Long = amount.getRequired("amount")

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * reversal was created.
             */
            fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

            /** The description on the reversal message from Fedwire, set by the reversing bank. */
            fun description(): String = description.getRequired("description")

            /** Additional financial institution information included in the wire reversal. */
            fun financialInstitutionToFinancialInstitutionInformation(): Optional<String> =
                Optional.ofNullable(
                    financialInstitutionToFinancialInstitutionInformation.getNullable(
                        "financial_institution_to_financial_institution_information"
                    )
                )

            /**
             * The Fedwire cycle date for the wire reversal. The "Fedwire day" begins at 9:00 PM
             * Eastern Time on the evening before the `cycle date`.
             */
            fun inputCycleDate(): LocalDate = inputCycleDate.getRequired("input_cycle_date")

            /** The Fedwire transaction identifier. */
            fun inputMessageAccountabilityData(): String =
                inputMessageAccountabilityData.getRequired("input_message_accountability_data")

            /** The Fedwire sequence number. */
            fun inputSequenceNumber(): String =
                inputSequenceNumber.getRequired("input_sequence_number")

            /** The Fedwire input source identifier. */
            fun inputSource(): String = inputSource.getRequired("input_source")

            /**
             * The American Banking Association (ABA) routing number of the bank originating the
             * transfer.
             */
            fun originatorRoutingNumber(): Optional<String> =
                Optional.ofNullable(
                    originatorRoutingNumber.getNullable("originator_routing_number")
                )

            /**
             * The Fedwire cycle date for the wire transfer that is being reversed by this message.
             */
            fun previousMessageInputCycleDate(): LocalDate =
                previousMessageInputCycleDate.getRequired("previous_message_input_cycle_date")

            /** The Fedwire transaction identifier for the wire transfer that was reversed. */
            fun previousMessageInputMessageAccountabilityData(): String =
                previousMessageInputMessageAccountabilityData.getRequired(
                    "previous_message_input_message_accountability_data"
                )

            /** The Fedwire sequence number for the wire transfer that was reversed. */
            fun previousMessageInputSequenceNumber(): String =
                previousMessageInputSequenceNumber.getRequired(
                    "previous_message_input_sequence_number"
                )

            /** The Fedwire input source identifier for the wire transfer that was reversed. */
            fun previousMessageInputSource(): String =
                previousMessageInputSource.getRequired("previous_message_input_source")

            /**
             * Information included in the wire reversal for the receiving financial institution.
             */
            fun receiverFinancialInstitutionInformation(): Optional<String> =
                Optional.ofNullable(
                    receiverFinancialInstitutionInformation.getNullable(
                        "receiver_financial_institution_information"
                    )
                )

            /** The sending bank's reference number for the wire reversal. */
            fun senderReference(): Optional<String> =
                Optional.ofNullable(senderReference.getNullable("sender_reference"))

            /** The ID for the Transaction associated with the transfer reversal. */
            fun transactionId(): String = transactionId.getRequired("transaction_id")

            /** The ID for the Wire Transfer that is being reversed. */
            fun wireTransferId(): String = wireTransferId.getRequired("wire_transfer_id")

            /** The amount that was reversed in USD cents. */
            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * reversal was created.
             */
            @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

            /** The description on the reversal message from Fedwire, set by the reversing bank. */
            @JsonProperty("description") @ExcludeMissing fun _description() = description

            /** Additional financial institution information included in the wire reversal. */
            @JsonProperty("financial_institution_to_financial_institution_information")
            @ExcludeMissing
            fun _financialInstitutionToFinancialInstitutionInformation() =
                financialInstitutionToFinancialInstitutionInformation

            /**
             * The Fedwire cycle date for the wire reversal. The "Fedwire day" begins at 9:00 PM
             * Eastern Time on the evening before the `cycle date`.
             */
            @JsonProperty("input_cycle_date") @ExcludeMissing fun _inputCycleDate() = inputCycleDate

            /** The Fedwire transaction identifier. */
            @JsonProperty("input_message_accountability_data")
            @ExcludeMissing
            fun _inputMessageAccountabilityData() = inputMessageAccountabilityData

            /** The Fedwire sequence number. */
            @JsonProperty("input_sequence_number")
            @ExcludeMissing
            fun _inputSequenceNumber() = inputSequenceNumber

            /** The Fedwire input source identifier. */
            @JsonProperty("input_source") @ExcludeMissing fun _inputSource() = inputSource

            /**
             * The American Banking Association (ABA) routing number of the bank originating the
             * transfer.
             */
            @JsonProperty("originator_routing_number")
            @ExcludeMissing
            fun _originatorRoutingNumber() = originatorRoutingNumber

            /**
             * The Fedwire cycle date for the wire transfer that is being reversed by this message.
             */
            @JsonProperty("previous_message_input_cycle_date")
            @ExcludeMissing
            fun _previousMessageInputCycleDate() = previousMessageInputCycleDate

            /** The Fedwire transaction identifier for the wire transfer that was reversed. */
            @JsonProperty("previous_message_input_message_accountability_data")
            @ExcludeMissing
            fun _previousMessageInputMessageAccountabilityData() =
                previousMessageInputMessageAccountabilityData

            /** The Fedwire sequence number for the wire transfer that was reversed. */
            @JsonProperty("previous_message_input_sequence_number")
            @ExcludeMissing
            fun _previousMessageInputSequenceNumber() = previousMessageInputSequenceNumber

            /** The Fedwire input source identifier for the wire transfer that was reversed. */
            @JsonProperty("previous_message_input_source")
            @ExcludeMissing
            fun _previousMessageInputSource() = previousMessageInputSource

            /**
             * Information included in the wire reversal for the receiving financial institution.
             */
            @JsonProperty("receiver_financial_institution_information")
            @ExcludeMissing
            fun _receiverFinancialInstitutionInformation() = receiverFinancialInstitutionInformation

            /** The sending bank's reference number for the wire reversal. */
            @JsonProperty("sender_reference")
            @ExcludeMissing
            fun _senderReference() = senderReference

            /** The ID for the Transaction associated with the transfer reversal. */
            @JsonProperty("transaction_id") @ExcludeMissing fun _transactionId() = transactionId

            /** The ID for the Wire Transfer that is being reversed. */
            @JsonProperty("wire_transfer_id") @ExcludeMissing fun _wireTransferId() = wireTransferId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): InboundWireReversal = apply {
                if (!validated) {
                    amount()
                    createdAt()
                    description()
                    financialInstitutionToFinancialInstitutionInformation()
                    inputCycleDate()
                    inputMessageAccountabilityData()
                    inputSequenceNumber()
                    inputSource()
                    originatorRoutingNumber()
                    previousMessageInputCycleDate()
                    previousMessageInputMessageAccountabilityData()
                    previousMessageInputSequenceNumber()
                    previousMessageInputSource()
                    receiverFinancialInstitutionInformation()
                    senderReference()
                    transactionId()
                    wireTransferId()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is InboundWireReversal &&
                    this.amount == other.amount &&
                    this.createdAt == other.createdAt &&
                    this.description == other.description &&
                    this.financialInstitutionToFinancialInstitutionInformation ==
                        other.financialInstitutionToFinancialInstitutionInformation &&
                    this.inputCycleDate == other.inputCycleDate &&
                    this.inputMessageAccountabilityData == other.inputMessageAccountabilityData &&
                    this.inputSequenceNumber == other.inputSequenceNumber &&
                    this.inputSource == other.inputSource &&
                    this.originatorRoutingNumber == other.originatorRoutingNumber &&
                    this.previousMessageInputCycleDate == other.previousMessageInputCycleDate &&
                    this.previousMessageInputMessageAccountabilityData ==
                        other.previousMessageInputMessageAccountabilityData &&
                    this.previousMessageInputSequenceNumber ==
                        other.previousMessageInputSequenceNumber &&
                    this.previousMessageInputSource == other.previousMessageInputSource &&
                    this.receiverFinancialInstitutionInformation ==
                        other.receiverFinancialInstitutionInformation &&
                    this.senderReference == other.senderReference &&
                    this.transactionId == other.transactionId &&
                    this.wireTransferId == other.wireTransferId &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            amount,
                            createdAt,
                            description,
                            financialInstitutionToFinancialInstitutionInformation,
                            inputCycleDate,
                            inputMessageAccountabilityData,
                            inputSequenceNumber,
                            inputSource,
                            originatorRoutingNumber,
                            previousMessageInputCycleDate,
                            previousMessageInputMessageAccountabilityData,
                            previousMessageInputSequenceNumber,
                            previousMessageInputSource,
                            receiverFinancialInstitutionInformation,
                            senderReference,
                            transactionId,
                            wireTransferId,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "InboundWireReversal{amount=$amount, createdAt=$createdAt, description=$description, financialInstitutionToFinancialInstitutionInformation=$financialInstitutionToFinancialInstitutionInformation, inputCycleDate=$inputCycleDate, inputMessageAccountabilityData=$inputMessageAccountabilityData, inputSequenceNumber=$inputSequenceNumber, inputSource=$inputSource, originatorRoutingNumber=$originatorRoutingNumber, previousMessageInputCycleDate=$previousMessageInputCycleDate, previousMessageInputMessageAccountabilityData=$previousMessageInputMessageAccountabilityData, previousMessageInputSequenceNumber=$previousMessageInputSequenceNumber, previousMessageInputSource=$previousMessageInputSource, receiverFinancialInstitutionInformation=$receiverFinancialInstitutionInformation, senderReference=$senderReference, transactionId=$transactionId, wireTransferId=$wireTransferId, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var amount: JsonField<Long> = JsonMissing.of()
                private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var description: JsonField<String> = JsonMissing.of()
                private var financialInstitutionToFinancialInstitutionInformation:
                    JsonField<String> =
                    JsonMissing.of()
                private var inputCycleDate: JsonField<LocalDate> = JsonMissing.of()
                private var inputMessageAccountabilityData: JsonField<String> = JsonMissing.of()
                private var inputSequenceNumber: JsonField<String> = JsonMissing.of()
                private var inputSource: JsonField<String> = JsonMissing.of()
                private var originatorRoutingNumber: JsonField<String> = JsonMissing.of()
                private var previousMessageInputCycleDate: JsonField<LocalDate> = JsonMissing.of()
                private var previousMessageInputMessageAccountabilityData: JsonField<String> =
                    JsonMissing.of()
                private var previousMessageInputSequenceNumber: JsonField<String> = JsonMissing.of()
                private var previousMessageInputSource: JsonField<String> = JsonMissing.of()
                private var receiverFinancialInstitutionInformation: JsonField<String> =
                    JsonMissing.of()
                private var senderReference: JsonField<String> = JsonMissing.of()
                private var transactionId: JsonField<String> = JsonMissing.of()
                private var wireTransferId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(inboundWireReversal: InboundWireReversal) = apply {
                    this.amount = inboundWireReversal.amount
                    this.createdAt = inboundWireReversal.createdAt
                    this.description = inboundWireReversal.description
                    this.financialInstitutionToFinancialInstitutionInformation =
                        inboundWireReversal.financialInstitutionToFinancialInstitutionInformation
                    this.inputCycleDate = inboundWireReversal.inputCycleDate
                    this.inputMessageAccountabilityData =
                        inboundWireReversal.inputMessageAccountabilityData
                    this.inputSequenceNumber = inboundWireReversal.inputSequenceNumber
                    this.inputSource = inboundWireReversal.inputSource
                    this.originatorRoutingNumber = inboundWireReversal.originatorRoutingNumber
                    this.previousMessageInputCycleDate =
                        inboundWireReversal.previousMessageInputCycleDate
                    this.previousMessageInputMessageAccountabilityData =
                        inboundWireReversal.previousMessageInputMessageAccountabilityData
                    this.previousMessageInputSequenceNumber =
                        inboundWireReversal.previousMessageInputSequenceNumber
                    this.previousMessageInputSource = inboundWireReversal.previousMessageInputSource
                    this.receiverFinancialInstitutionInformation =
                        inboundWireReversal.receiverFinancialInstitutionInformation
                    this.senderReference = inboundWireReversal.senderReference
                    this.transactionId = inboundWireReversal.transactionId
                    this.wireTransferId = inboundWireReversal.wireTransferId
                    additionalProperties(inboundWireReversal.additionalProperties)
                }

                /** The amount that was reversed in USD cents. */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /** The amount that was reversed in USD cents. */
                @JsonProperty("amount")
                @ExcludeMissing
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /**
                 * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
                 * reversal was created.
                 */
                fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

                /**
                 * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
                 * reversal was created.
                 */
                @JsonProperty("created_at")
                @ExcludeMissing
                fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                    this.createdAt = createdAt
                }

                /**
                 * The description on the reversal message from Fedwire, set by the reversing bank.
                 */
                fun description(description: String) = description(JsonField.of(description))

                /**
                 * The description on the reversal message from Fedwire, set by the reversing bank.
                 */
                @JsonProperty("description")
                @ExcludeMissing
                fun description(description: JsonField<String>) = apply {
                    this.description = description
                }

                /** Additional financial institution information included in the wire reversal. */
                fun financialInstitutionToFinancialInstitutionInformation(
                    financialInstitutionToFinancialInstitutionInformation: String
                ) =
                    financialInstitutionToFinancialInstitutionInformation(
                        JsonField.of(financialInstitutionToFinancialInstitutionInformation)
                    )

                /** Additional financial institution information included in the wire reversal. */
                @JsonProperty("financial_institution_to_financial_institution_information")
                @ExcludeMissing
                fun financialInstitutionToFinancialInstitutionInformation(
                    financialInstitutionToFinancialInstitutionInformation: JsonField<String>
                ) = apply {
                    this.financialInstitutionToFinancialInstitutionInformation =
                        financialInstitutionToFinancialInstitutionInformation
                }

                /**
                 * The Fedwire cycle date for the wire reversal. The "Fedwire day" begins at 9:00 PM
                 * Eastern Time on the evening before the `cycle date`.
                 */
                fun inputCycleDate(inputCycleDate: LocalDate) =
                    inputCycleDate(JsonField.of(inputCycleDate))

                /**
                 * The Fedwire cycle date for the wire reversal. The "Fedwire day" begins at 9:00 PM
                 * Eastern Time on the evening before the `cycle date`.
                 */
                @JsonProperty("input_cycle_date")
                @ExcludeMissing
                fun inputCycleDate(inputCycleDate: JsonField<LocalDate>) = apply {
                    this.inputCycleDate = inputCycleDate
                }

                /** The Fedwire transaction identifier. */
                fun inputMessageAccountabilityData(inputMessageAccountabilityData: String) =
                    inputMessageAccountabilityData(JsonField.of(inputMessageAccountabilityData))

                /** The Fedwire transaction identifier. */
                @JsonProperty("input_message_accountability_data")
                @ExcludeMissing
                fun inputMessageAccountabilityData(
                    inputMessageAccountabilityData: JsonField<String>
                ) = apply { this.inputMessageAccountabilityData = inputMessageAccountabilityData }

                /** The Fedwire sequence number. */
                fun inputSequenceNumber(inputSequenceNumber: String) =
                    inputSequenceNumber(JsonField.of(inputSequenceNumber))

                /** The Fedwire sequence number. */
                @JsonProperty("input_sequence_number")
                @ExcludeMissing
                fun inputSequenceNumber(inputSequenceNumber: JsonField<String>) = apply {
                    this.inputSequenceNumber = inputSequenceNumber
                }

                /** The Fedwire input source identifier. */
                fun inputSource(inputSource: String) = inputSource(JsonField.of(inputSource))

                /** The Fedwire input source identifier. */
                @JsonProperty("input_source")
                @ExcludeMissing
                fun inputSource(inputSource: JsonField<String>) = apply {
                    this.inputSource = inputSource
                }

                /**
                 * The American Banking Association (ABA) routing number of the bank originating the
                 * transfer.
                 */
                fun originatorRoutingNumber(originatorRoutingNumber: String) =
                    originatorRoutingNumber(JsonField.of(originatorRoutingNumber))

                /**
                 * The American Banking Association (ABA) routing number of the bank originating the
                 * transfer.
                 */
                @JsonProperty("originator_routing_number")
                @ExcludeMissing
                fun originatorRoutingNumber(originatorRoutingNumber: JsonField<String>) = apply {
                    this.originatorRoutingNumber = originatorRoutingNumber
                }

                /**
                 * The Fedwire cycle date for the wire transfer that is being reversed by this
                 * message.
                 */
                fun previousMessageInputCycleDate(previousMessageInputCycleDate: LocalDate) =
                    previousMessageInputCycleDate(JsonField.of(previousMessageInputCycleDate))

                /**
                 * The Fedwire cycle date for the wire transfer that is being reversed by this
                 * message.
                 */
                @JsonProperty("previous_message_input_cycle_date")
                @ExcludeMissing
                fun previousMessageInputCycleDate(
                    previousMessageInputCycleDate: JsonField<LocalDate>
                ) = apply { this.previousMessageInputCycleDate = previousMessageInputCycleDate }

                /** The Fedwire transaction identifier for the wire transfer that was reversed. */
                fun previousMessageInputMessageAccountabilityData(
                    previousMessageInputMessageAccountabilityData: String
                ) =
                    previousMessageInputMessageAccountabilityData(
                        JsonField.of(previousMessageInputMessageAccountabilityData)
                    )

                /** The Fedwire transaction identifier for the wire transfer that was reversed. */
                @JsonProperty("previous_message_input_message_accountability_data")
                @ExcludeMissing
                fun previousMessageInputMessageAccountabilityData(
                    previousMessageInputMessageAccountabilityData: JsonField<String>
                ) = apply {
                    this.previousMessageInputMessageAccountabilityData =
                        previousMessageInputMessageAccountabilityData
                }

                /** The Fedwire sequence number for the wire transfer that was reversed. */
                fun previousMessageInputSequenceNumber(previousMessageInputSequenceNumber: String) =
                    previousMessageInputSequenceNumber(
                        JsonField.of(previousMessageInputSequenceNumber)
                    )

                /** The Fedwire sequence number for the wire transfer that was reversed. */
                @JsonProperty("previous_message_input_sequence_number")
                @ExcludeMissing
                fun previousMessageInputSequenceNumber(
                    previousMessageInputSequenceNumber: JsonField<String>
                ) = apply {
                    this.previousMessageInputSequenceNumber = previousMessageInputSequenceNumber
                }

                /** The Fedwire input source identifier for the wire transfer that was reversed. */
                fun previousMessageInputSource(previousMessageInputSource: String) =
                    previousMessageInputSource(JsonField.of(previousMessageInputSource))

                /** The Fedwire input source identifier for the wire transfer that was reversed. */
                @JsonProperty("previous_message_input_source")
                @ExcludeMissing
                fun previousMessageInputSource(previousMessageInputSource: JsonField<String>) =
                    apply {
                        this.previousMessageInputSource = previousMessageInputSource
                    }

                /**
                 * Information included in the wire reversal for the receiving financial
                 * institution.
                 */
                fun receiverFinancialInstitutionInformation(
                    receiverFinancialInstitutionInformation: String
                ) =
                    receiverFinancialInstitutionInformation(
                        JsonField.of(receiverFinancialInstitutionInformation)
                    )

                /**
                 * Information included in the wire reversal for the receiving financial
                 * institution.
                 */
                @JsonProperty("receiver_financial_institution_information")
                @ExcludeMissing
                fun receiverFinancialInstitutionInformation(
                    receiverFinancialInstitutionInformation: JsonField<String>
                ) = apply {
                    this.receiverFinancialInstitutionInformation =
                        receiverFinancialInstitutionInformation
                }

                /** The sending bank's reference number for the wire reversal. */
                fun senderReference(senderReference: String) =
                    senderReference(JsonField.of(senderReference))

                /** The sending bank's reference number for the wire reversal. */
                @JsonProperty("sender_reference")
                @ExcludeMissing
                fun senderReference(senderReference: JsonField<String>) = apply {
                    this.senderReference = senderReference
                }

                /** The ID for the Transaction associated with the transfer reversal. */
                fun transactionId(transactionId: String) =
                    transactionId(JsonField.of(transactionId))

                /** The ID for the Transaction associated with the transfer reversal. */
                @JsonProperty("transaction_id")
                @ExcludeMissing
                fun transactionId(transactionId: JsonField<String>) = apply {
                    this.transactionId = transactionId
                }

                /** The ID for the Wire Transfer that is being reversed. */
                fun wireTransferId(wireTransferId: String) =
                    wireTransferId(JsonField.of(wireTransferId))

                /** The ID for the Wire Transfer that is being reversed. */
                @JsonProperty("wire_transfer_id")
                @ExcludeMissing
                fun wireTransferId(wireTransferId: JsonField<String>) = apply {
                    this.wireTransferId = wireTransferId
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

                fun build(): InboundWireReversal =
                    InboundWireReversal(
                        amount,
                        createdAt,
                        description,
                        financialInstitutionToFinancialInstitutionInformation,
                        inputCycleDate,
                        inputMessageAccountabilityData,
                        inputSequenceNumber,
                        inputSource,
                        originatorRoutingNumber,
                        previousMessageInputCycleDate,
                        previousMessageInputMessageAccountabilityData,
                        previousMessageInputSequenceNumber,
                        previousMessageInputSource,
                        receiverFinancialInstitutionInformation,
                        senderReference,
                        transactionId,
                        wireTransferId,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        /**
         * An Inbound Wire Transfer Intention object. This field will be present in the JSON
         * response if and only if `category` is equal to `inbound_wire_transfer`.
         */
        @JsonDeserialize(builder = InboundWireTransfer.Builder::class)
        @NoAutoDetect
        class InboundWireTransfer
        private constructor(
            private val amount: JsonField<Long>,
            private val beneficiaryAddressLine1: JsonField<String>,
            private val beneficiaryAddressLine2: JsonField<String>,
            private val beneficiaryAddressLine3: JsonField<String>,
            private val beneficiaryName: JsonField<String>,
            private val beneficiaryReference: JsonField<String>,
            private val description: JsonField<String>,
            private val inputMessageAccountabilityData: JsonField<String>,
            private val originatorAddressLine1: JsonField<String>,
            private val originatorAddressLine2: JsonField<String>,
            private val originatorAddressLine3: JsonField<String>,
            private val originatorName: JsonField<String>,
            private val originatorRoutingNumber: JsonField<String>,
            private val originatorToBeneficiaryInformation: JsonField<String>,
            private val originatorToBeneficiaryInformationLine1: JsonField<String>,
            private val originatorToBeneficiaryInformationLine2: JsonField<String>,
            private val originatorToBeneficiaryInformationLine3: JsonField<String>,
            private val originatorToBeneficiaryInformationLine4: JsonField<String>,
            private val transferId: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** The amount in USD cents. */
            fun amount(): Long = amount.getRequired("amount")

            /** A free-form address field set by the sender. */
            fun beneficiaryAddressLine1(): Optional<String> =
                Optional.ofNullable(
                    beneficiaryAddressLine1.getNullable("beneficiary_address_line1")
                )

            /** A free-form address field set by the sender. */
            fun beneficiaryAddressLine2(): Optional<String> =
                Optional.ofNullable(
                    beneficiaryAddressLine2.getNullable("beneficiary_address_line2")
                )

            /** A free-form address field set by the sender. */
            fun beneficiaryAddressLine3(): Optional<String> =
                Optional.ofNullable(
                    beneficiaryAddressLine3.getNullable("beneficiary_address_line3")
                )

            /** A name set by the sender. */
            fun beneficiaryName(): Optional<String> =
                Optional.ofNullable(beneficiaryName.getNullable("beneficiary_name"))

            /** A free-form reference string set by the sender, to help identify the transfer. */
            fun beneficiaryReference(): Optional<String> =
                Optional.ofNullable(beneficiaryReference.getNullable("beneficiary_reference"))

            /** An Increase-constructed description of the transfer. */
            fun description(): String = description.getRequired("description")

            /**
             * A unique identifier available to the originating and receiving banks, commonly
             * abbreviated as IMAD. It is created when the wire is submitted to the Fedwire service
             * and is helpful when debugging wires with the originating bank.
             */
            fun inputMessageAccountabilityData(): Optional<String> =
                Optional.ofNullable(
                    inputMessageAccountabilityData.getNullable("input_message_accountability_data")
                )

            /** The address of the wire originator, set by the sending bank. */
            fun originatorAddressLine1(): Optional<String> =
                Optional.ofNullable(originatorAddressLine1.getNullable("originator_address_line1"))

            /** The address of the wire originator, set by the sending bank. */
            fun originatorAddressLine2(): Optional<String> =
                Optional.ofNullable(originatorAddressLine2.getNullable("originator_address_line2"))

            /** The address of the wire originator, set by the sending bank. */
            fun originatorAddressLine3(): Optional<String> =
                Optional.ofNullable(originatorAddressLine3.getNullable("originator_address_line3"))

            /** The originator of the wire, set by the sending bank. */
            fun originatorName(): Optional<String> =
                Optional.ofNullable(originatorName.getNullable("originator_name"))

            /**
             * The American Banking Association (ABA) routing number of the bank originating the
             * transfer.
             */
            fun originatorRoutingNumber(): Optional<String> =
                Optional.ofNullable(
                    originatorRoutingNumber.getNullable("originator_routing_number")
                )

            /** An Increase-created concatenation of the Originator-to-Beneficiary lines. */
            fun originatorToBeneficiaryInformation(): Optional<String> =
                Optional.ofNullable(
                    originatorToBeneficiaryInformation.getNullable(
                        "originator_to_beneficiary_information"
                    )
                )

            /** A free-form message set by the wire originator. */
            fun originatorToBeneficiaryInformationLine1(): Optional<String> =
                Optional.ofNullable(
                    originatorToBeneficiaryInformationLine1.getNullable(
                        "originator_to_beneficiary_information_line1"
                    )
                )

            /** A free-form message set by the wire originator. */
            fun originatorToBeneficiaryInformationLine2(): Optional<String> =
                Optional.ofNullable(
                    originatorToBeneficiaryInformationLine2.getNullable(
                        "originator_to_beneficiary_information_line2"
                    )
                )

            /** A free-form message set by the wire originator. */
            fun originatorToBeneficiaryInformationLine3(): Optional<String> =
                Optional.ofNullable(
                    originatorToBeneficiaryInformationLine3.getNullable(
                        "originator_to_beneficiary_information_line3"
                    )
                )

            /** A free-form message set by the wire originator. */
            fun originatorToBeneficiaryInformationLine4(): Optional<String> =
                Optional.ofNullable(
                    originatorToBeneficiaryInformationLine4.getNullable(
                        "originator_to_beneficiary_information_line4"
                    )
                )

            /** The ID of the Inbound Wire Transfer object that resulted in this Transaction. */
            fun transferId(): String = transferId.getRequired("transfer_id")

            /** The amount in USD cents. */
            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            /** A free-form address field set by the sender. */
            @JsonProperty("beneficiary_address_line1")
            @ExcludeMissing
            fun _beneficiaryAddressLine1() = beneficiaryAddressLine1

            /** A free-form address field set by the sender. */
            @JsonProperty("beneficiary_address_line2")
            @ExcludeMissing
            fun _beneficiaryAddressLine2() = beneficiaryAddressLine2

            /** A free-form address field set by the sender. */
            @JsonProperty("beneficiary_address_line3")
            @ExcludeMissing
            fun _beneficiaryAddressLine3() = beneficiaryAddressLine3

            /** A name set by the sender. */
            @JsonProperty("beneficiary_name")
            @ExcludeMissing
            fun _beneficiaryName() = beneficiaryName

            /** A free-form reference string set by the sender, to help identify the transfer. */
            @JsonProperty("beneficiary_reference")
            @ExcludeMissing
            fun _beneficiaryReference() = beneficiaryReference

            /** An Increase-constructed description of the transfer. */
            @JsonProperty("description") @ExcludeMissing fun _description() = description

            /**
             * A unique identifier available to the originating and receiving banks, commonly
             * abbreviated as IMAD. It is created when the wire is submitted to the Fedwire service
             * and is helpful when debugging wires with the originating bank.
             */
            @JsonProperty("input_message_accountability_data")
            @ExcludeMissing
            fun _inputMessageAccountabilityData() = inputMessageAccountabilityData

            /** The address of the wire originator, set by the sending bank. */
            @JsonProperty("originator_address_line1")
            @ExcludeMissing
            fun _originatorAddressLine1() = originatorAddressLine1

            /** The address of the wire originator, set by the sending bank. */
            @JsonProperty("originator_address_line2")
            @ExcludeMissing
            fun _originatorAddressLine2() = originatorAddressLine2

            /** The address of the wire originator, set by the sending bank. */
            @JsonProperty("originator_address_line3")
            @ExcludeMissing
            fun _originatorAddressLine3() = originatorAddressLine3

            /** The originator of the wire, set by the sending bank. */
            @JsonProperty("originator_name") @ExcludeMissing fun _originatorName() = originatorName

            /**
             * The American Banking Association (ABA) routing number of the bank originating the
             * transfer.
             */
            @JsonProperty("originator_routing_number")
            @ExcludeMissing
            fun _originatorRoutingNumber() = originatorRoutingNumber

            /** An Increase-created concatenation of the Originator-to-Beneficiary lines. */
            @JsonProperty("originator_to_beneficiary_information")
            @ExcludeMissing
            fun _originatorToBeneficiaryInformation() = originatorToBeneficiaryInformation

            /** A free-form message set by the wire originator. */
            @JsonProperty("originator_to_beneficiary_information_line1")
            @ExcludeMissing
            fun _originatorToBeneficiaryInformationLine1() = originatorToBeneficiaryInformationLine1

            /** A free-form message set by the wire originator. */
            @JsonProperty("originator_to_beneficiary_information_line2")
            @ExcludeMissing
            fun _originatorToBeneficiaryInformationLine2() = originatorToBeneficiaryInformationLine2

            /** A free-form message set by the wire originator. */
            @JsonProperty("originator_to_beneficiary_information_line3")
            @ExcludeMissing
            fun _originatorToBeneficiaryInformationLine3() = originatorToBeneficiaryInformationLine3

            /** A free-form message set by the wire originator. */
            @JsonProperty("originator_to_beneficiary_information_line4")
            @ExcludeMissing
            fun _originatorToBeneficiaryInformationLine4() = originatorToBeneficiaryInformationLine4

            /** The ID of the Inbound Wire Transfer object that resulted in this Transaction. */
            @JsonProperty("transfer_id") @ExcludeMissing fun _transferId() = transferId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): InboundWireTransfer = apply {
                if (!validated) {
                    amount()
                    beneficiaryAddressLine1()
                    beneficiaryAddressLine2()
                    beneficiaryAddressLine3()
                    beneficiaryName()
                    beneficiaryReference()
                    description()
                    inputMessageAccountabilityData()
                    originatorAddressLine1()
                    originatorAddressLine2()
                    originatorAddressLine3()
                    originatorName()
                    originatorRoutingNumber()
                    originatorToBeneficiaryInformation()
                    originatorToBeneficiaryInformationLine1()
                    originatorToBeneficiaryInformationLine2()
                    originatorToBeneficiaryInformationLine3()
                    originatorToBeneficiaryInformationLine4()
                    transferId()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is InboundWireTransfer &&
                    this.amount == other.amount &&
                    this.beneficiaryAddressLine1 == other.beneficiaryAddressLine1 &&
                    this.beneficiaryAddressLine2 == other.beneficiaryAddressLine2 &&
                    this.beneficiaryAddressLine3 == other.beneficiaryAddressLine3 &&
                    this.beneficiaryName == other.beneficiaryName &&
                    this.beneficiaryReference == other.beneficiaryReference &&
                    this.description == other.description &&
                    this.inputMessageAccountabilityData == other.inputMessageAccountabilityData &&
                    this.originatorAddressLine1 == other.originatorAddressLine1 &&
                    this.originatorAddressLine2 == other.originatorAddressLine2 &&
                    this.originatorAddressLine3 == other.originatorAddressLine3 &&
                    this.originatorName == other.originatorName &&
                    this.originatorRoutingNumber == other.originatorRoutingNumber &&
                    this.originatorToBeneficiaryInformation ==
                        other.originatorToBeneficiaryInformation &&
                    this.originatorToBeneficiaryInformationLine1 ==
                        other.originatorToBeneficiaryInformationLine1 &&
                    this.originatorToBeneficiaryInformationLine2 ==
                        other.originatorToBeneficiaryInformationLine2 &&
                    this.originatorToBeneficiaryInformationLine3 ==
                        other.originatorToBeneficiaryInformationLine3 &&
                    this.originatorToBeneficiaryInformationLine4 ==
                        other.originatorToBeneficiaryInformationLine4 &&
                    this.transferId == other.transferId &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            amount,
                            beneficiaryAddressLine1,
                            beneficiaryAddressLine2,
                            beneficiaryAddressLine3,
                            beneficiaryName,
                            beneficiaryReference,
                            description,
                            inputMessageAccountabilityData,
                            originatorAddressLine1,
                            originatorAddressLine2,
                            originatorAddressLine3,
                            originatorName,
                            originatorRoutingNumber,
                            originatorToBeneficiaryInformation,
                            originatorToBeneficiaryInformationLine1,
                            originatorToBeneficiaryInformationLine2,
                            originatorToBeneficiaryInformationLine3,
                            originatorToBeneficiaryInformationLine4,
                            transferId,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "InboundWireTransfer{amount=$amount, beneficiaryAddressLine1=$beneficiaryAddressLine1, beneficiaryAddressLine2=$beneficiaryAddressLine2, beneficiaryAddressLine3=$beneficiaryAddressLine3, beneficiaryName=$beneficiaryName, beneficiaryReference=$beneficiaryReference, description=$description, inputMessageAccountabilityData=$inputMessageAccountabilityData, originatorAddressLine1=$originatorAddressLine1, originatorAddressLine2=$originatorAddressLine2, originatorAddressLine3=$originatorAddressLine3, originatorName=$originatorName, originatorRoutingNumber=$originatorRoutingNumber, originatorToBeneficiaryInformation=$originatorToBeneficiaryInformation, originatorToBeneficiaryInformationLine1=$originatorToBeneficiaryInformationLine1, originatorToBeneficiaryInformationLine2=$originatorToBeneficiaryInformationLine2, originatorToBeneficiaryInformationLine3=$originatorToBeneficiaryInformationLine3, originatorToBeneficiaryInformationLine4=$originatorToBeneficiaryInformationLine4, transferId=$transferId, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var amount: JsonField<Long> = JsonMissing.of()
                private var beneficiaryAddressLine1: JsonField<String> = JsonMissing.of()
                private var beneficiaryAddressLine2: JsonField<String> = JsonMissing.of()
                private var beneficiaryAddressLine3: JsonField<String> = JsonMissing.of()
                private var beneficiaryName: JsonField<String> = JsonMissing.of()
                private var beneficiaryReference: JsonField<String> = JsonMissing.of()
                private var description: JsonField<String> = JsonMissing.of()
                private var inputMessageAccountabilityData: JsonField<String> = JsonMissing.of()
                private var originatorAddressLine1: JsonField<String> = JsonMissing.of()
                private var originatorAddressLine2: JsonField<String> = JsonMissing.of()
                private var originatorAddressLine3: JsonField<String> = JsonMissing.of()
                private var originatorName: JsonField<String> = JsonMissing.of()
                private var originatorRoutingNumber: JsonField<String> = JsonMissing.of()
                private var originatorToBeneficiaryInformation: JsonField<String> = JsonMissing.of()
                private var originatorToBeneficiaryInformationLine1: JsonField<String> =
                    JsonMissing.of()
                private var originatorToBeneficiaryInformationLine2: JsonField<String> =
                    JsonMissing.of()
                private var originatorToBeneficiaryInformationLine3: JsonField<String> =
                    JsonMissing.of()
                private var originatorToBeneficiaryInformationLine4: JsonField<String> =
                    JsonMissing.of()
                private var transferId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(inboundWireTransfer: InboundWireTransfer) = apply {
                    this.amount = inboundWireTransfer.amount
                    this.beneficiaryAddressLine1 = inboundWireTransfer.beneficiaryAddressLine1
                    this.beneficiaryAddressLine2 = inboundWireTransfer.beneficiaryAddressLine2
                    this.beneficiaryAddressLine3 = inboundWireTransfer.beneficiaryAddressLine3
                    this.beneficiaryName = inboundWireTransfer.beneficiaryName
                    this.beneficiaryReference = inboundWireTransfer.beneficiaryReference
                    this.description = inboundWireTransfer.description
                    this.inputMessageAccountabilityData =
                        inboundWireTransfer.inputMessageAccountabilityData
                    this.originatorAddressLine1 = inboundWireTransfer.originatorAddressLine1
                    this.originatorAddressLine2 = inboundWireTransfer.originatorAddressLine2
                    this.originatorAddressLine3 = inboundWireTransfer.originatorAddressLine3
                    this.originatorName = inboundWireTransfer.originatorName
                    this.originatorRoutingNumber = inboundWireTransfer.originatorRoutingNumber
                    this.originatorToBeneficiaryInformation =
                        inboundWireTransfer.originatorToBeneficiaryInformation
                    this.originatorToBeneficiaryInformationLine1 =
                        inboundWireTransfer.originatorToBeneficiaryInformationLine1
                    this.originatorToBeneficiaryInformationLine2 =
                        inboundWireTransfer.originatorToBeneficiaryInformationLine2
                    this.originatorToBeneficiaryInformationLine3 =
                        inboundWireTransfer.originatorToBeneficiaryInformationLine3
                    this.originatorToBeneficiaryInformationLine4 =
                        inboundWireTransfer.originatorToBeneficiaryInformationLine4
                    this.transferId = inboundWireTransfer.transferId
                    additionalProperties(inboundWireTransfer.additionalProperties)
                }

                /** The amount in USD cents. */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /** The amount in USD cents. */
                @JsonProperty("amount")
                @ExcludeMissing
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /** A free-form address field set by the sender. */
                fun beneficiaryAddressLine1(beneficiaryAddressLine1: String) =
                    beneficiaryAddressLine1(JsonField.of(beneficiaryAddressLine1))

                /** A free-form address field set by the sender. */
                @JsonProperty("beneficiary_address_line1")
                @ExcludeMissing
                fun beneficiaryAddressLine1(beneficiaryAddressLine1: JsonField<String>) = apply {
                    this.beneficiaryAddressLine1 = beneficiaryAddressLine1
                }

                /** A free-form address field set by the sender. */
                fun beneficiaryAddressLine2(beneficiaryAddressLine2: String) =
                    beneficiaryAddressLine2(JsonField.of(beneficiaryAddressLine2))

                /** A free-form address field set by the sender. */
                @JsonProperty("beneficiary_address_line2")
                @ExcludeMissing
                fun beneficiaryAddressLine2(beneficiaryAddressLine2: JsonField<String>) = apply {
                    this.beneficiaryAddressLine2 = beneficiaryAddressLine2
                }

                /** A free-form address field set by the sender. */
                fun beneficiaryAddressLine3(beneficiaryAddressLine3: String) =
                    beneficiaryAddressLine3(JsonField.of(beneficiaryAddressLine3))

                /** A free-form address field set by the sender. */
                @JsonProperty("beneficiary_address_line3")
                @ExcludeMissing
                fun beneficiaryAddressLine3(beneficiaryAddressLine3: JsonField<String>) = apply {
                    this.beneficiaryAddressLine3 = beneficiaryAddressLine3
                }

                /** A name set by the sender. */
                fun beneficiaryName(beneficiaryName: String) =
                    beneficiaryName(JsonField.of(beneficiaryName))

                /** A name set by the sender. */
                @JsonProperty("beneficiary_name")
                @ExcludeMissing
                fun beneficiaryName(beneficiaryName: JsonField<String>) = apply {
                    this.beneficiaryName = beneficiaryName
                }

                /**
                 * A free-form reference string set by the sender, to help identify the transfer.
                 */
                fun beneficiaryReference(beneficiaryReference: String) =
                    beneficiaryReference(JsonField.of(beneficiaryReference))

                /**
                 * A free-form reference string set by the sender, to help identify the transfer.
                 */
                @JsonProperty("beneficiary_reference")
                @ExcludeMissing
                fun beneficiaryReference(beneficiaryReference: JsonField<String>) = apply {
                    this.beneficiaryReference = beneficiaryReference
                }

                /** An Increase-constructed description of the transfer. */
                fun description(description: String) = description(JsonField.of(description))

                /** An Increase-constructed description of the transfer. */
                @JsonProperty("description")
                @ExcludeMissing
                fun description(description: JsonField<String>) = apply {
                    this.description = description
                }

                /**
                 * A unique identifier available to the originating and receiving banks, commonly
                 * abbreviated as IMAD. It is created when the wire is submitted to the Fedwire
                 * service and is helpful when debugging wires with the originating bank.
                 */
                fun inputMessageAccountabilityData(inputMessageAccountabilityData: String) =
                    inputMessageAccountabilityData(JsonField.of(inputMessageAccountabilityData))

                /**
                 * A unique identifier available to the originating and receiving banks, commonly
                 * abbreviated as IMAD. It is created when the wire is submitted to the Fedwire
                 * service and is helpful when debugging wires with the originating bank.
                 */
                @JsonProperty("input_message_accountability_data")
                @ExcludeMissing
                fun inputMessageAccountabilityData(
                    inputMessageAccountabilityData: JsonField<String>
                ) = apply { this.inputMessageAccountabilityData = inputMessageAccountabilityData }

                /** The address of the wire originator, set by the sending bank. */
                fun originatorAddressLine1(originatorAddressLine1: String) =
                    originatorAddressLine1(JsonField.of(originatorAddressLine1))

                /** The address of the wire originator, set by the sending bank. */
                @JsonProperty("originator_address_line1")
                @ExcludeMissing
                fun originatorAddressLine1(originatorAddressLine1: JsonField<String>) = apply {
                    this.originatorAddressLine1 = originatorAddressLine1
                }

                /** The address of the wire originator, set by the sending bank. */
                fun originatorAddressLine2(originatorAddressLine2: String) =
                    originatorAddressLine2(JsonField.of(originatorAddressLine2))

                /** The address of the wire originator, set by the sending bank. */
                @JsonProperty("originator_address_line2")
                @ExcludeMissing
                fun originatorAddressLine2(originatorAddressLine2: JsonField<String>) = apply {
                    this.originatorAddressLine2 = originatorAddressLine2
                }

                /** The address of the wire originator, set by the sending bank. */
                fun originatorAddressLine3(originatorAddressLine3: String) =
                    originatorAddressLine3(JsonField.of(originatorAddressLine3))

                /** The address of the wire originator, set by the sending bank. */
                @JsonProperty("originator_address_line3")
                @ExcludeMissing
                fun originatorAddressLine3(originatorAddressLine3: JsonField<String>) = apply {
                    this.originatorAddressLine3 = originatorAddressLine3
                }

                /** The originator of the wire, set by the sending bank. */
                fun originatorName(originatorName: String) =
                    originatorName(JsonField.of(originatorName))

                /** The originator of the wire, set by the sending bank. */
                @JsonProperty("originator_name")
                @ExcludeMissing
                fun originatorName(originatorName: JsonField<String>) = apply {
                    this.originatorName = originatorName
                }

                /**
                 * The American Banking Association (ABA) routing number of the bank originating the
                 * transfer.
                 */
                fun originatorRoutingNumber(originatorRoutingNumber: String) =
                    originatorRoutingNumber(JsonField.of(originatorRoutingNumber))

                /**
                 * The American Banking Association (ABA) routing number of the bank originating the
                 * transfer.
                 */
                @JsonProperty("originator_routing_number")
                @ExcludeMissing
                fun originatorRoutingNumber(originatorRoutingNumber: JsonField<String>) = apply {
                    this.originatorRoutingNumber = originatorRoutingNumber
                }

                /** An Increase-created concatenation of the Originator-to-Beneficiary lines. */
                fun originatorToBeneficiaryInformation(originatorToBeneficiaryInformation: String) =
                    originatorToBeneficiaryInformation(
                        JsonField.of(originatorToBeneficiaryInformation)
                    )

                /** An Increase-created concatenation of the Originator-to-Beneficiary lines. */
                @JsonProperty("originator_to_beneficiary_information")
                @ExcludeMissing
                fun originatorToBeneficiaryInformation(
                    originatorToBeneficiaryInformation: JsonField<String>
                ) = apply {
                    this.originatorToBeneficiaryInformation = originatorToBeneficiaryInformation
                }

                /** A free-form message set by the wire originator. */
                fun originatorToBeneficiaryInformationLine1(
                    originatorToBeneficiaryInformationLine1: String
                ) =
                    originatorToBeneficiaryInformationLine1(
                        JsonField.of(originatorToBeneficiaryInformationLine1)
                    )

                /** A free-form message set by the wire originator. */
                @JsonProperty("originator_to_beneficiary_information_line1")
                @ExcludeMissing
                fun originatorToBeneficiaryInformationLine1(
                    originatorToBeneficiaryInformationLine1: JsonField<String>
                ) = apply {
                    this.originatorToBeneficiaryInformationLine1 =
                        originatorToBeneficiaryInformationLine1
                }

                /** A free-form message set by the wire originator. */
                fun originatorToBeneficiaryInformationLine2(
                    originatorToBeneficiaryInformationLine2: String
                ) =
                    originatorToBeneficiaryInformationLine2(
                        JsonField.of(originatorToBeneficiaryInformationLine2)
                    )

                /** A free-form message set by the wire originator. */
                @JsonProperty("originator_to_beneficiary_information_line2")
                @ExcludeMissing
                fun originatorToBeneficiaryInformationLine2(
                    originatorToBeneficiaryInformationLine2: JsonField<String>
                ) = apply {
                    this.originatorToBeneficiaryInformationLine2 =
                        originatorToBeneficiaryInformationLine2
                }

                /** A free-form message set by the wire originator. */
                fun originatorToBeneficiaryInformationLine3(
                    originatorToBeneficiaryInformationLine3: String
                ) =
                    originatorToBeneficiaryInformationLine3(
                        JsonField.of(originatorToBeneficiaryInformationLine3)
                    )

                /** A free-form message set by the wire originator. */
                @JsonProperty("originator_to_beneficiary_information_line3")
                @ExcludeMissing
                fun originatorToBeneficiaryInformationLine3(
                    originatorToBeneficiaryInformationLine3: JsonField<String>
                ) = apply {
                    this.originatorToBeneficiaryInformationLine3 =
                        originatorToBeneficiaryInformationLine3
                }

                /** A free-form message set by the wire originator. */
                fun originatorToBeneficiaryInformationLine4(
                    originatorToBeneficiaryInformationLine4: String
                ) =
                    originatorToBeneficiaryInformationLine4(
                        JsonField.of(originatorToBeneficiaryInformationLine4)
                    )

                /** A free-form message set by the wire originator. */
                @JsonProperty("originator_to_beneficiary_information_line4")
                @ExcludeMissing
                fun originatorToBeneficiaryInformationLine4(
                    originatorToBeneficiaryInformationLine4: JsonField<String>
                ) = apply {
                    this.originatorToBeneficiaryInformationLine4 =
                        originatorToBeneficiaryInformationLine4
                }

                /** The ID of the Inbound Wire Transfer object that resulted in this Transaction. */
                fun transferId(transferId: String) = transferId(JsonField.of(transferId))

                /** The ID of the Inbound Wire Transfer object that resulted in this Transaction. */
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

                fun build(): InboundWireTransfer =
                    InboundWireTransfer(
                        amount,
                        beneficiaryAddressLine1,
                        beneficiaryAddressLine2,
                        beneficiaryAddressLine3,
                        beneficiaryName,
                        beneficiaryReference,
                        description,
                        inputMessageAccountabilityData,
                        originatorAddressLine1,
                        originatorAddressLine2,
                        originatorAddressLine3,
                        originatorName,
                        originatorRoutingNumber,
                        originatorToBeneficiaryInformation,
                        originatorToBeneficiaryInformationLine1,
                        originatorToBeneficiaryInformationLine2,
                        originatorToBeneficiaryInformationLine3,
                        originatorToBeneficiaryInformationLine4,
                        transferId,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        /**
         * An Interest Payment object. This field will be present in the JSON response if and only
         * if `category` is equal to `interest_payment`.
         */
        @JsonDeserialize(builder = InterestPayment.Builder::class)
        @NoAutoDetect
        class InterestPayment
        private constructor(
            private val accruedOnAccountId: JsonField<String>,
            private val amount: JsonField<Long>,
            private val currency: JsonField<Currency>,
            private val periodEnd: JsonField<OffsetDateTime>,
            private val periodStart: JsonField<OffsetDateTime>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** The account on which the interest was accrued. */
            fun accruedOnAccountId(): Optional<String> =
                Optional.ofNullable(accruedOnAccountId.getNullable("accrued_on_account_id"))

            /**
             * The amount in the minor unit of the transaction's currency. For dollars, for example,
             * this is cents.
             */
            fun amount(): Long = amount.getRequired("amount")

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction
             * currency.
             */
            fun currency(): Currency = currency.getRequired("currency")

            /** The end of the period for which this transaction paid interest. */
            fun periodEnd(): OffsetDateTime = periodEnd.getRequired("period_end")

            /** The start of the period for which this transaction paid interest. */
            fun periodStart(): OffsetDateTime = periodStart.getRequired("period_start")

            /** The account on which the interest was accrued. */
            @JsonProperty("accrued_on_account_id")
            @ExcludeMissing
            fun _accruedOnAccountId() = accruedOnAccountId

            /**
             * The amount in the minor unit of the transaction's currency. For dollars, for example,
             * this is cents.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction
             * currency.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            /** The end of the period for which this transaction paid interest. */
            @JsonProperty("period_end") @ExcludeMissing fun _periodEnd() = periodEnd

            /** The start of the period for which this transaction paid interest. */
            @JsonProperty("period_start") @ExcludeMissing fun _periodStart() = periodStart

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): InterestPayment = apply {
                if (!validated) {
                    accruedOnAccountId()
                    amount()
                    currency()
                    periodEnd()
                    periodStart()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is InterestPayment &&
                    this.accruedOnAccountId == other.accruedOnAccountId &&
                    this.amount == other.amount &&
                    this.currency == other.currency &&
                    this.periodEnd == other.periodEnd &&
                    this.periodStart == other.periodStart &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            accruedOnAccountId,
                            amount,
                            currency,
                            periodEnd,
                            periodStart,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "InterestPayment{accruedOnAccountId=$accruedOnAccountId, amount=$amount, currency=$currency, periodEnd=$periodEnd, periodStart=$periodStart, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var accruedOnAccountId: JsonField<String> = JsonMissing.of()
                private var amount: JsonField<Long> = JsonMissing.of()
                private var currency: JsonField<Currency> = JsonMissing.of()
                private var periodEnd: JsonField<OffsetDateTime> = JsonMissing.of()
                private var periodStart: JsonField<OffsetDateTime> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(interestPayment: InterestPayment) = apply {
                    this.accruedOnAccountId = interestPayment.accruedOnAccountId
                    this.amount = interestPayment.amount
                    this.currency = interestPayment.currency
                    this.periodEnd = interestPayment.periodEnd
                    this.periodStart = interestPayment.periodStart
                    additionalProperties(interestPayment.additionalProperties)
                }

                /** The account on which the interest was accrued. */
                fun accruedOnAccountId(accruedOnAccountId: String) =
                    accruedOnAccountId(JsonField.of(accruedOnAccountId))

                /** The account on which the interest was accrued. */
                @JsonProperty("accrued_on_account_id")
                @ExcludeMissing
                fun accruedOnAccountId(accruedOnAccountId: JsonField<String>) = apply {
                    this.accruedOnAccountId = accruedOnAccountId
                }

                /**
                 * The amount in the minor unit of the transaction's currency. For dollars, for
                 * example, this is cents.
                 */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /**
                 * The amount in the minor unit of the transaction's currency. For dollars, for
                 * example, this is cents.
                 */
                @JsonProperty("amount")
                @ExcludeMissing
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction
                 * currency.
                 */
                fun currency(currency: Currency) = currency(JsonField.of(currency))

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction
                 * currency.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                /** The end of the period for which this transaction paid interest. */
                fun periodEnd(periodEnd: OffsetDateTime) = periodEnd(JsonField.of(periodEnd))

                /** The end of the period for which this transaction paid interest. */
                @JsonProperty("period_end")
                @ExcludeMissing
                fun periodEnd(periodEnd: JsonField<OffsetDateTime>) = apply {
                    this.periodEnd = periodEnd
                }

                /** The start of the period for which this transaction paid interest. */
                fun periodStart(periodStart: OffsetDateTime) =
                    periodStart(JsonField.of(periodStart))

                /** The start of the period for which this transaction paid interest. */
                @JsonProperty("period_start")
                @ExcludeMissing
                fun periodStart(periodStart: JsonField<OffsetDateTime>) = apply {
                    this.periodStart = periodStart
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

                fun build(): InterestPayment =
                    InterestPayment(
                        accruedOnAccountId,
                        amount,
                        currency,
                        periodEnd,
                        periodStart,
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

                    return other is Currency && this.value == other.value
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
        }

        /**
         * An Internal Source object. This field will be present in the JSON response if and only if
         * `category` is equal to `internal_source`.
         */
        @JsonDeserialize(builder = InternalSource.Builder::class)
        @NoAutoDetect
        class InternalSource
        private constructor(
            private val amount: JsonField<Long>,
            private val currency: JsonField<Currency>,
            private val reason: JsonField<Reason>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /**
             * The amount in the minor unit of the transaction's currency. For dollars, for example,
             * this is cents.
             */
            fun amount(): Long = amount.getRequired("amount")

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction
             * currency.
             */
            fun currency(): Currency = currency.getRequired("currency")

            /**
             * An Internal Source is a transaction between you and Increase. This describes the
             * reason for the transaction.
             */
            fun reason(): Reason = reason.getRequired("reason")

            /**
             * The amount in the minor unit of the transaction's currency. For dollars, for example,
             * this is cents.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction
             * currency.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            /**
             * An Internal Source is a transaction between you and Increase. This describes the
             * reason for the transaction.
             */
            @JsonProperty("reason") @ExcludeMissing fun _reason() = reason

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): InternalSource = apply {
                if (!validated) {
                    amount()
                    currency()
                    reason()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is InternalSource &&
                    this.amount == other.amount &&
                    this.currency == other.currency &&
                    this.reason == other.reason &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            amount,
                            currency,
                            reason,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "InternalSource{amount=$amount, currency=$currency, reason=$reason, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var amount: JsonField<Long> = JsonMissing.of()
                private var currency: JsonField<Currency> = JsonMissing.of()
                private var reason: JsonField<Reason> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(internalSource: InternalSource) = apply {
                    this.amount = internalSource.amount
                    this.currency = internalSource.currency
                    this.reason = internalSource.reason
                    additionalProperties(internalSource.additionalProperties)
                }

                /**
                 * The amount in the minor unit of the transaction's currency. For dollars, for
                 * example, this is cents.
                 */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /**
                 * The amount in the minor unit of the transaction's currency. For dollars, for
                 * example, this is cents.
                 */
                @JsonProperty("amount")
                @ExcludeMissing
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction
                 * currency.
                 */
                fun currency(currency: Currency) = currency(JsonField.of(currency))

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction
                 * currency.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                /**
                 * An Internal Source is a transaction between you and Increase. This describes the
                 * reason for the transaction.
                 */
                fun reason(reason: Reason) = reason(JsonField.of(reason))

                /**
                 * An Internal Source is a transaction between you and Increase. This describes the
                 * reason for the transaction.
                 */
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

                fun build(): InternalSource =
                    InternalSource(
                        amount,
                        currency,
                        reason,
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

                    return other is Currency && this.value == other.value
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

                    return other is Reason && this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    @JvmField val ACCOUNT_CLOSURE = Reason(JsonField.of("account_closure"))

                    @JvmField val BANK_DRAWN_CHECK = Reason(JsonField.of("bank_drawn_check"))

                    @JvmField
                    val BANK_DRAWN_CHECK_CREDIT = Reason(JsonField.of("bank_drawn_check_credit"))

                    @JvmField val BANK_MIGRATION = Reason(JsonField.of("bank_migration"))

                    @JvmField val CHECK_ADJUSTMENT = Reason(JsonField.of("check_adjustment"))

                    @JvmField val COLLECTION_PAYMENT = Reason(JsonField.of("collection_payment"))

                    @JvmField
                    val COLLECTION_RECEIVABLE = Reason(JsonField.of("collection_receivable"))

                    @JvmField val EMPYREAL_ADJUSTMENT = Reason(JsonField.of("empyreal_adjustment"))

                    @JvmField val ERROR = Reason(JsonField.of("error"))

                    @JvmField val ERROR_CORRECTION = Reason(JsonField.of("error_correction"))

                    @JvmField val FEES = Reason(JsonField.of("fees"))

                    @JvmField val INTEREST = Reason(JsonField.of("interest"))

                    @JvmField
                    val NEGATIVE_BALANCE_FORGIVENESS =
                        Reason(JsonField.of("negative_balance_forgiveness"))

                    @JvmField val SAMPLE_FUNDS = Reason(JsonField.of("sample_funds"))

                    @JvmField val SAMPLE_FUNDS_RETURN = Reason(JsonField.of("sample_funds_return"))

                    @JvmStatic fun of(value: String) = Reason(JsonField.of(value))
                }

                enum class Known {
                    ACCOUNT_CLOSURE,
                    BANK_DRAWN_CHECK,
                    BANK_DRAWN_CHECK_CREDIT,
                    BANK_MIGRATION,
                    CHECK_ADJUSTMENT,
                    COLLECTION_PAYMENT,
                    COLLECTION_RECEIVABLE,
                    EMPYREAL_ADJUSTMENT,
                    ERROR,
                    ERROR_CORRECTION,
                    FEES,
                    INTEREST,
                    NEGATIVE_BALANCE_FORGIVENESS,
                    SAMPLE_FUNDS,
                    SAMPLE_FUNDS_RETURN,
                }

                enum class Value {
                    ACCOUNT_CLOSURE,
                    BANK_DRAWN_CHECK,
                    BANK_DRAWN_CHECK_CREDIT,
                    BANK_MIGRATION,
                    CHECK_ADJUSTMENT,
                    COLLECTION_PAYMENT,
                    COLLECTION_RECEIVABLE,
                    EMPYREAL_ADJUSTMENT,
                    ERROR,
                    ERROR_CORRECTION,
                    FEES,
                    INTEREST,
                    NEGATIVE_BALANCE_FORGIVENESS,
                    SAMPLE_FUNDS,
                    SAMPLE_FUNDS_RETURN,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        ACCOUNT_CLOSURE -> Value.ACCOUNT_CLOSURE
                        BANK_DRAWN_CHECK -> Value.BANK_DRAWN_CHECK
                        BANK_DRAWN_CHECK_CREDIT -> Value.BANK_DRAWN_CHECK_CREDIT
                        BANK_MIGRATION -> Value.BANK_MIGRATION
                        CHECK_ADJUSTMENT -> Value.CHECK_ADJUSTMENT
                        COLLECTION_PAYMENT -> Value.COLLECTION_PAYMENT
                        COLLECTION_RECEIVABLE -> Value.COLLECTION_RECEIVABLE
                        EMPYREAL_ADJUSTMENT -> Value.EMPYREAL_ADJUSTMENT
                        ERROR -> Value.ERROR
                        ERROR_CORRECTION -> Value.ERROR_CORRECTION
                        FEES -> Value.FEES
                        INTEREST -> Value.INTEREST
                        NEGATIVE_BALANCE_FORGIVENESS -> Value.NEGATIVE_BALANCE_FORGIVENESS
                        SAMPLE_FUNDS -> Value.SAMPLE_FUNDS
                        SAMPLE_FUNDS_RETURN -> Value.SAMPLE_FUNDS_RETURN
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        ACCOUNT_CLOSURE -> Known.ACCOUNT_CLOSURE
                        BANK_DRAWN_CHECK -> Known.BANK_DRAWN_CHECK
                        BANK_DRAWN_CHECK_CREDIT -> Known.BANK_DRAWN_CHECK_CREDIT
                        BANK_MIGRATION -> Known.BANK_MIGRATION
                        CHECK_ADJUSTMENT -> Known.CHECK_ADJUSTMENT
                        COLLECTION_PAYMENT -> Known.COLLECTION_PAYMENT
                        COLLECTION_RECEIVABLE -> Known.COLLECTION_RECEIVABLE
                        EMPYREAL_ADJUSTMENT -> Known.EMPYREAL_ADJUSTMENT
                        ERROR -> Known.ERROR
                        ERROR_CORRECTION -> Known.ERROR_CORRECTION
                        FEES -> Known.FEES
                        INTEREST -> Known.INTEREST
                        NEGATIVE_BALANCE_FORGIVENESS -> Known.NEGATIVE_BALANCE_FORGIVENESS
                        SAMPLE_FUNDS -> Known.SAMPLE_FUNDS
                        SAMPLE_FUNDS_RETURN -> Known.SAMPLE_FUNDS_RETURN
                        else -> throw IncreaseInvalidDataException("Unknown Reason: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }
        }

        /**
         * A Real-Time Payments Transfer Acknowledgement object. This field will be present in the
         * JSON response if and only if `category` is equal to
         * `real_time_payments_transfer_acknowledgement`.
         */
        @JsonDeserialize(builder = RealTimePaymentsTransferAcknowledgement.Builder::class)
        @NoAutoDetect
        class RealTimePaymentsTransferAcknowledgement
        private constructor(
            private val amount: JsonField<Long>,
            private val destinationAccountNumber: JsonField<String>,
            private val destinationRoutingNumber: JsonField<String>,
            private val remittanceInformation: JsonField<String>,
            private val transferId: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** The transfer amount in USD cents. */
            fun amount(): Long = amount.getRequired("amount")

            /** The destination account number. */
            fun destinationAccountNumber(): String =
                destinationAccountNumber.getRequired("destination_account_number")

            /** The American Bankers' Association (ABA) Routing Transit Number (RTN). */
            fun destinationRoutingNumber(): String =
                destinationRoutingNumber.getRequired("destination_routing_number")

            /** Unstructured information that will show on the recipient's bank statement. */
            fun remittanceInformation(): String =
                remittanceInformation.getRequired("remittance_information")

            /** The identifier of the Real-Time Payments Transfer that led to this Transaction. */
            fun transferId(): String = transferId.getRequired("transfer_id")

            /** The transfer amount in USD cents. */
            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            /** The destination account number. */
            @JsonProperty("destination_account_number")
            @ExcludeMissing
            fun _destinationAccountNumber() = destinationAccountNumber

            /** The American Bankers' Association (ABA) Routing Transit Number (RTN). */
            @JsonProperty("destination_routing_number")
            @ExcludeMissing
            fun _destinationRoutingNumber() = destinationRoutingNumber

            /** Unstructured information that will show on the recipient's bank statement. */
            @JsonProperty("remittance_information")
            @ExcludeMissing
            fun _remittanceInformation() = remittanceInformation

            /** The identifier of the Real-Time Payments Transfer that led to this Transaction. */
            @JsonProperty("transfer_id") @ExcludeMissing fun _transferId() = transferId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): RealTimePaymentsTransferAcknowledgement = apply {
                if (!validated) {
                    amount()
                    destinationAccountNumber()
                    destinationRoutingNumber()
                    remittanceInformation()
                    transferId()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is RealTimePaymentsTransferAcknowledgement &&
                    this.amount == other.amount &&
                    this.destinationAccountNumber == other.destinationAccountNumber &&
                    this.destinationRoutingNumber == other.destinationRoutingNumber &&
                    this.remittanceInformation == other.remittanceInformation &&
                    this.transferId == other.transferId &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            amount,
                            destinationAccountNumber,
                            destinationRoutingNumber,
                            remittanceInformation,
                            transferId,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "RealTimePaymentsTransferAcknowledgement{amount=$amount, destinationAccountNumber=$destinationAccountNumber, destinationRoutingNumber=$destinationRoutingNumber, remittanceInformation=$remittanceInformation, transferId=$transferId, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var amount: JsonField<Long> = JsonMissing.of()
                private var destinationAccountNumber: JsonField<String> = JsonMissing.of()
                private var destinationRoutingNumber: JsonField<String> = JsonMissing.of()
                private var remittanceInformation: JsonField<String> = JsonMissing.of()
                private var transferId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    realTimePaymentsTransferAcknowledgement: RealTimePaymentsTransferAcknowledgement
                ) = apply {
                    this.amount = realTimePaymentsTransferAcknowledgement.amount
                    this.destinationAccountNumber =
                        realTimePaymentsTransferAcknowledgement.destinationAccountNumber
                    this.destinationRoutingNumber =
                        realTimePaymentsTransferAcknowledgement.destinationRoutingNumber
                    this.remittanceInformation =
                        realTimePaymentsTransferAcknowledgement.remittanceInformation
                    this.transferId = realTimePaymentsTransferAcknowledgement.transferId
                    additionalProperties(
                        realTimePaymentsTransferAcknowledgement.additionalProperties
                    )
                }

                /** The transfer amount in USD cents. */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /** The transfer amount in USD cents. */
                @JsonProperty("amount")
                @ExcludeMissing
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /** The destination account number. */
                fun destinationAccountNumber(destinationAccountNumber: String) =
                    destinationAccountNumber(JsonField.of(destinationAccountNumber))

                /** The destination account number. */
                @JsonProperty("destination_account_number")
                @ExcludeMissing
                fun destinationAccountNumber(destinationAccountNumber: JsonField<String>) = apply {
                    this.destinationAccountNumber = destinationAccountNumber
                }

                /** The American Bankers' Association (ABA) Routing Transit Number (RTN). */
                fun destinationRoutingNumber(destinationRoutingNumber: String) =
                    destinationRoutingNumber(JsonField.of(destinationRoutingNumber))

                /** The American Bankers' Association (ABA) Routing Transit Number (RTN). */
                @JsonProperty("destination_routing_number")
                @ExcludeMissing
                fun destinationRoutingNumber(destinationRoutingNumber: JsonField<String>) = apply {
                    this.destinationRoutingNumber = destinationRoutingNumber
                }

                /** Unstructured information that will show on the recipient's bank statement. */
                fun remittanceInformation(remittanceInformation: String) =
                    remittanceInformation(JsonField.of(remittanceInformation))

                /** Unstructured information that will show on the recipient's bank statement. */
                @JsonProperty("remittance_information")
                @ExcludeMissing
                fun remittanceInformation(remittanceInformation: JsonField<String>) = apply {
                    this.remittanceInformation = remittanceInformation
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

                fun build(): RealTimePaymentsTransferAcknowledgement =
                    RealTimePaymentsTransferAcknowledgement(
                        amount,
                        destinationAccountNumber,
                        destinationRoutingNumber,
                        remittanceInformation,
                        transferId,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        /**
         * A Sample Funds object. This field will be present in the JSON response if and only if
         * `category` is equal to `sample_funds`.
         */
        @JsonDeserialize(builder = SampleFunds.Builder::class)
        @NoAutoDetect
        class SampleFunds
        private constructor(
            private val originator: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** Where the sample funds came from. */
            fun originator(): String = originator.getRequired("originator")

            /** Where the sample funds came from. */
            @JsonProperty("originator") @ExcludeMissing fun _originator() = originator

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): SampleFunds = apply {
                if (!validated) {
                    originator()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is SampleFunds &&
                    this.originator == other.originator &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = Objects.hash(originator, additionalProperties)
                }
                return hashCode
            }

            override fun toString() =
                "SampleFunds{originator=$originator, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var originator: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(sampleFunds: SampleFunds) = apply {
                    this.originator = sampleFunds.originator
                    additionalProperties(sampleFunds.additionalProperties)
                }

                /** Where the sample funds came from. */
                fun originator(originator: String) = originator(JsonField.of(originator))

                /** Where the sample funds came from. */
                @JsonProperty("originator")
                @ExcludeMissing
                fun originator(originator: JsonField<String>) = apply {
                    this.originator = originator
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

                fun build(): SampleFunds =
                    SampleFunds(originator, additionalProperties.toUnmodifiable())
            }
        }

        /**
         * A Wire Transfer Intention object. This field will be present in the JSON response if and
         * only if `category` is equal to `wire_transfer_intention`.
         */
        @JsonDeserialize(builder = WireTransferIntention.Builder::class)
        @NoAutoDetect
        class WireTransferIntention
        private constructor(
            private val accountNumber: JsonField<String>,
            private val amount: JsonField<Long>,
            private val messageToRecipient: JsonField<String>,
            private val routingNumber: JsonField<String>,
            private val transferId: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** The destination account number. */
            fun accountNumber(): String = accountNumber.getRequired("account_number")

            /** The transfer amount in USD cents. */
            fun amount(): Long = amount.getRequired("amount")

            /** The message that will show on the recipient's bank statement. */
            fun messageToRecipient(): String =
                messageToRecipient.getRequired("message_to_recipient")

            /** The American Bankers' Association (ABA) Routing Transit Number (RTN). */
            fun routingNumber(): String = routingNumber.getRequired("routing_number")

            /** The identifier of the Wire Transfer that led to this Transaction. */
            fun transferId(): String = transferId.getRequired("transfer_id")

            /** The destination account number. */
            @JsonProperty("account_number") @ExcludeMissing fun _accountNumber() = accountNumber

            /** The transfer amount in USD cents. */
            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            /** The message that will show on the recipient's bank statement. */
            @JsonProperty("message_to_recipient")
            @ExcludeMissing
            fun _messageToRecipient() = messageToRecipient

            /** The American Bankers' Association (ABA) Routing Transit Number (RTN). */
            @JsonProperty("routing_number") @ExcludeMissing fun _routingNumber() = routingNumber

            /** The identifier of the Wire Transfer that led to this Transaction. */
            @JsonProperty("transfer_id") @ExcludeMissing fun _transferId() = transferId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): WireTransferIntention = apply {
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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is WireTransferIntention &&
                    this.accountNumber == other.accountNumber &&
                    this.amount == other.amount &&
                    this.messageToRecipient == other.messageToRecipient &&
                    this.routingNumber == other.routingNumber &&
                    this.transferId == other.transferId &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            accountNumber,
                            amount,
                            messageToRecipient,
                            routingNumber,
                            transferId,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "WireTransferIntention{accountNumber=$accountNumber, amount=$amount, messageToRecipient=$messageToRecipient, routingNumber=$routingNumber, transferId=$transferId, additionalProperties=$additionalProperties}"

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
                internal fun from(wireTransferIntention: WireTransferIntention) = apply {
                    this.accountNumber = wireTransferIntention.accountNumber
                    this.amount = wireTransferIntention.amount
                    this.messageToRecipient = wireTransferIntention.messageToRecipient
                    this.routingNumber = wireTransferIntention.routingNumber
                    this.transferId = wireTransferIntention.transferId
                    additionalProperties(wireTransferIntention.additionalProperties)
                }

                /** The destination account number. */
                fun accountNumber(accountNumber: String) =
                    accountNumber(JsonField.of(accountNumber))

                /** The destination account number. */
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

                /** The American Bankers' Association (ABA) Routing Transit Number (RTN). */
                fun routingNumber(routingNumber: String) =
                    routingNumber(JsonField.of(routingNumber))

                /** The American Bankers' Association (ABA) Routing Transit Number (RTN). */
                @JsonProperty("routing_number")
                @ExcludeMissing
                fun routingNumber(routingNumber: JsonField<String>) = apply {
                    this.routingNumber = routingNumber
                }

                /** The identifier of the Wire Transfer that led to this Transaction. */
                fun transferId(transferId: String) = transferId(JsonField.of(transferId))

                /** The identifier of the Wire Transfer that led to this Transaction. */
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

                fun build(): WireTransferIntention =
                    WireTransferIntention(
                        accountNumber,
                        amount,
                        messageToRecipient,
                        routingNumber,
                        transferId,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        /**
         * A Wire Transfer Rejection object. This field will be present in the JSON response if and
         * only if `category` is equal to `wire_transfer_rejection`.
         */
        @JsonDeserialize(builder = WireTransferRejection.Builder::class)
        @NoAutoDetect
        class WireTransferRejection
        private constructor(
            private val transferId: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** The identifier of the Wire Transfer that led to this Transaction. */
            fun transferId(): String = transferId.getRequired("transfer_id")

            /** The identifier of the Wire Transfer that led to this Transaction. */
            @JsonProperty("transfer_id") @ExcludeMissing fun _transferId() = transferId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): WireTransferRejection = apply {
                if (!validated) {
                    transferId()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is WireTransferRejection &&
                    this.transferId == other.transferId &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = Objects.hash(transferId, additionalProperties)
                }
                return hashCode
            }

            override fun toString() =
                "WireTransferRejection{transferId=$transferId, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var transferId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(wireTransferRejection: WireTransferRejection) = apply {
                    this.transferId = wireTransferRejection.transferId
                    additionalProperties(wireTransferRejection.additionalProperties)
                }

                /** The identifier of the Wire Transfer that led to this Transaction. */
                fun transferId(transferId: String) = transferId(JsonField.of(transferId))

                /** The identifier of the Wire Transfer that led to this Transaction. */
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

                fun build(): WireTransferRejection =
                    WireTransferRejection(transferId, additionalProperties.toUnmodifiable())
            }
        }
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

            return other is Type && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val TRANSACTION = Type(JsonField.of("transaction"))

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            TRANSACTION,
        }

        enum class Value {
            TRANSACTION,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                TRANSACTION -> Value.TRANSACTION
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                TRANSACTION -> Known.TRANSACTION
                else -> throw IncreaseInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
