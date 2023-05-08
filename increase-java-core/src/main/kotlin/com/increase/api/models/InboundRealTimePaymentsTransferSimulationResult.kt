package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
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

/** The results of an inbound Real Time Payments Transfer simulation. */
@JsonDeserialize(builder = InboundRealTimePaymentsTransferSimulationResult.Builder::class)
@NoAutoDetect
class InboundRealTimePaymentsTransferSimulationResult
private constructor(
    private val transaction: JsonField<Transaction>,
    private val declinedTransaction: JsonField<DeclinedTransaction>,
    private val type: JsonField<Type>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /**
     * If the Real Time Payments Transfer attempt succeeds, this will contain the resulting
     * [Transaction](#transactions) object. The Transaction's `source` will be of `category:
     * inbound_real_time_payments_transfer_confirmation`.
     */
    fun transaction(): Optional<Transaction> =
        Optional.ofNullable(transaction.getNullable("transaction"))

    /**
     * If the Real Time Payments Transfer attempt fails, this will contain the resulting
     * [Declined Transaction](#declined-transactions) object. The Declined Transaction's `source`
     * will be of `category: inbound_real_time_payments_transfer_decline`.
     */
    fun declinedTransaction(): Optional<DeclinedTransaction> =
        Optional.ofNullable(declinedTransaction.getNullable("declined_transaction"))

    /**
     * A constant representing the object's type. For this resource it will always be
     * `inbound_real_time_payments_transfer_simulation_result`.
     */
    fun type(): Type = type.getRequired("type")

    /**
     * If the Real Time Payments Transfer attempt succeeds, this will contain the resulting
     * [Transaction](#transactions) object. The Transaction's `source` will be of `category:
     * inbound_real_time_payments_transfer_confirmation`.
     */
    @JsonProperty("transaction") @ExcludeMissing fun _transaction() = transaction

    /**
     * If the Real Time Payments Transfer attempt fails, this will contain the resulting
     * [Declined Transaction](#declined-transactions) object. The Declined Transaction's `source`
     * will be of `category: inbound_real_time_payments_transfer_decline`.
     */
    @JsonProperty("declined_transaction")
    @ExcludeMissing
    fun _declinedTransaction() = declinedTransaction

    /**
     * A constant representing the object's type. For this resource it will always be
     * `inbound_real_time_payments_transfer_simulation_result`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate() = apply {
        if (!validated) {
            transaction().map { it.validate() }
            declinedTransaction().map { it.validate() }
            type()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InboundRealTimePaymentsTransferSimulationResult &&
            this.transaction == other.transaction &&
            this.declinedTransaction == other.declinedTransaction &&
            this.type == other.type &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    transaction,
                    declinedTransaction,
                    type,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "InboundRealTimePaymentsTransferSimulationResult{transaction=$transaction, declinedTransaction=$declinedTransaction, type=$type, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var transaction: JsonField<Transaction> = JsonMissing.of()
        private var declinedTransaction: JsonField<DeclinedTransaction> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            inboundRealTimePaymentsTransferSimulationResult:
                InboundRealTimePaymentsTransferSimulationResult
        ) = apply {
            this.transaction = inboundRealTimePaymentsTransferSimulationResult.transaction
            this.declinedTransaction =
                inboundRealTimePaymentsTransferSimulationResult.declinedTransaction
            this.type = inboundRealTimePaymentsTransferSimulationResult.type
            additionalProperties(
                inboundRealTimePaymentsTransferSimulationResult.additionalProperties
            )
        }

        /**
         * If the Real Time Payments Transfer attempt succeeds, this will contain the resulting
         * [Transaction](#transactions) object. The Transaction's `source` will be of `category:
         * inbound_real_time_payments_transfer_confirmation`.
         */
        fun transaction(transaction: Transaction) = transaction(JsonField.of(transaction))

        /**
         * If the Real Time Payments Transfer attempt succeeds, this will contain the resulting
         * [Transaction](#transactions) object. The Transaction's `source` will be of `category:
         * inbound_real_time_payments_transfer_confirmation`.
         */
        @JsonProperty("transaction")
        @ExcludeMissing
        fun transaction(transaction: JsonField<Transaction>) = apply {
            this.transaction = transaction
        }

        /**
         * If the Real Time Payments Transfer attempt fails, this will contain the resulting
         * [Declined Transaction](#declined-transactions) object. The Declined Transaction's
         * `source` will be of `category: inbound_real_time_payments_transfer_decline`.
         */
        fun declinedTransaction(declinedTransaction: DeclinedTransaction) =
            declinedTransaction(JsonField.of(declinedTransaction))

        /**
         * If the Real Time Payments Transfer attempt fails, this will contain the resulting
         * [Declined Transaction](#declined-transactions) object. The Declined Transaction's
         * `source` will be of `category: inbound_real_time_payments_transfer_decline`.
         */
        @JsonProperty("declined_transaction")
        @ExcludeMissing
        fun declinedTransaction(declinedTransaction: JsonField<DeclinedTransaction>) = apply {
            this.declinedTransaction = declinedTransaction
        }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `inbound_real_time_payments_transfer_simulation_result`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be
         * `inbound_real_time_payments_transfer_simulation_result`.
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

        fun build(): InboundRealTimePaymentsTransferSimulationResult =
            InboundRealTimePaymentsTransferSimulationResult(
                transaction,
                declinedTransaction,
                type,
                additionalProperties.toUnmodifiable(),
            )
    }

    /**
     * If the Real Time Payments Transfer attempt succeeds, this will contain the resulting
     * [Transaction](#transactions) object. The Transaction's `source` will be of `category:
     * inbound_real_time_payments_transfer_confirmation`.
     */
    @JsonDeserialize(builder = Transaction.Builder::class)
    @NoAutoDetect
    class Transaction
    private constructor(
        private val accountId: JsonField<String>,
        private val amount: JsonField<Long>,
        private val currency: JsonField<Currency>,
        private val createdAt: JsonField<OffsetDateTime>,
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
         * The Transaction amount in the minor unit of its currency. For dollars, for example, this
         * is cents.
         */
        fun amount(): Long = amount.getRequired("amount")

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the Transaction's
         * currency. This will match the currency on the Transcation's Account.
         */
        fun currency(): Currency = currency.getRequired("currency")

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date on which the Transaction
         * occured.
         */
        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        /**
         * For a Transaction related to a transfer, this is the description you provide. For a
         * Transaction related to a payment, this is the description the vendor provides.
         */
        fun description(): String = description.getRequired("description")

        /** The Transaction identifier. */
        fun id(): String = id.getRequired("id")

        /**
         * The identifier for the route this Transaction came through. Routes are things like cards
         * and ACH details.
         */
        fun routeId(): Optional<String> = Optional.ofNullable(routeId.getNullable("route_id"))

        /** The type of the route this Transaction came through. */
        fun routeType(): Optional<RouteType> =
            Optional.ofNullable(routeType.getNullable("route_type"))

        /**
         * This is an object giving more details on the network-level event that caused the
         * Transaction. Note that for backwards compatibility reasons, additional undocumented keys
         * may appear in this object. These should be treated as deprecated and will be removed in
         * the future.
         */
        fun source(): Source = source.getRequired("source")

        /**
         * A constant representing the object's type. For this resource it will always be
         * `transaction`.
         */
        fun type(): Type = type.getRequired("type")

        /** The identifier for the Account the Transaction belongs to. */
        @JsonProperty("account_id") @ExcludeMissing fun _accountId() = accountId

        /**
         * The Transaction amount in the minor unit of its currency. For dollars, for example, this
         * is cents.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the Transaction's
         * currency. This will match the currency on the Transcation's Account.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date on which the Transaction
         * occured.
         */
        @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

        /**
         * For a Transaction related to a transfer, this is the description you provide. For a
         * Transaction related to a payment, this is the description the vendor provides.
         */
        @JsonProperty("description") @ExcludeMissing fun _description() = description

        /** The Transaction identifier. */
        @JsonProperty("id") @ExcludeMissing fun _id() = id

        /**
         * The identifier for the route this Transaction came through. Routes are things like cards
         * and ACH details.
         */
        @JsonProperty("route_id") @ExcludeMissing fun _routeId() = routeId

        /** The type of the route this Transaction came through. */
        @JsonProperty("route_type") @ExcludeMissing fun _routeType() = routeType

        /**
         * This is an object giving more details on the network-level event that caused the
         * Transaction. Note that for backwards compatibility reasons, additional undocumented keys
         * may appear in this object. These should be treated as deprecated and will be removed in
         * the future.
         */
        @JsonProperty("source") @ExcludeMissing fun _source() = source

        /**
         * A constant representing the object's type. For this resource it will always be
         * `transaction`.
         */
        @JsonProperty("type") @ExcludeMissing fun _type() = type

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate() = apply {
            if (!validated) {
                accountId()
                amount()
                currency()
                createdAt()
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
                this.currency == other.currency &&
                this.createdAt == other.createdAt &&
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
                        currency,
                        createdAt,
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
            "Transaction{accountId=$accountId, amount=$amount, currency=$currency, createdAt=$createdAt, description=$description, id=$id, routeId=$routeId, routeType=$routeType, source=$source, type=$type, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var accountId: JsonField<String> = JsonMissing.of()
            private var amount: JsonField<Long> = JsonMissing.of()
            private var currency: JsonField<Currency> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
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
                this.currency = transaction.currency
                this.createdAt = transaction.createdAt
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
             * The Transaction amount in the minor unit of its currency. For dollars, for example,
             * this is cents.
             */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /**
             * The Transaction amount in the minor unit of its currency. For dollars, for example,
             * this is cents.
             */
            @JsonProperty("amount")
            @ExcludeMissing
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the Transaction's
             * currency. This will match the currency on the Transcation's Account.
             */
            fun currency(currency: Currency) = currency(JsonField.of(currency))

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the Transaction's
             * currency. This will match the currency on the Transcation's Account.
             */
            @JsonProperty("currency")
            @ExcludeMissing
            fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date on which the Transaction
             * occured.
             */
            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date on which the Transaction
             * occured.
             */
            @JsonProperty("created_at")
            @ExcludeMissing
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            /**
             * For a Transaction related to a transfer, this is the description you provide. For a
             * Transaction related to a payment, this is the description the vendor provides.
             */
            fun description(description: String) = description(JsonField.of(description))

            /**
             * For a Transaction related to a transfer, this is the description you provide. For a
             * Transaction related to a payment, this is the description the vendor provides.
             */
            @JsonProperty("description")
            @ExcludeMissing
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /** The Transaction identifier. */
            fun id(id: String) = id(JsonField.of(id))

            /** The Transaction identifier. */
            @JsonProperty("id")
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply { this.id = id }

            /**
             * The identifier for the route this Transaction came through. Routes are things like
             * cards and ACH details.
             */
            fun routeId(routeId: String) = routeId(JsonField.of(routeId))

            /**
             * The identifier for the route this Transaction came through. Routes are things like
             * cards and ACH details.
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
             * Transaction. Note that for backwards compatibility reasons, additional undocumented
             * keys may appear in this object. These should be treated as deprecated and will be
             * removed in the future.
             */
            fun source(source: Source) = source(JsonField.of(source))

            /**
             * This is an object giving more details on the network-level event that caused the
             * Transaction. Note that for backwards compatibility reasons, additional undocumented
             * keys may appear in this object. These should be treated as deprecated and will be
             * removed in the future.
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
                    currency,
                    createdAt,
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
        ) {

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
        ) {

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

                @JvmStatic fun of(value: String) = RouteType(JsonField.of(value))
            }

            enum class Known {
                ACCOUNT_NUMBER,
                CARD,
            }

            enum class Value {
                ACCOUNT_NUMBER,
                CARD,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    ACCOUNT_NUMBER -> Value.ACCOUNT_NUMBER
                    CARD -> Value.CARD
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    ACCOUNT_NUMBER -> Known.ACCOUNT_NUMBER
                    CARD -> Known.CARD
                    else -> throw IncreaseInvalidDataException("Unknown RouteType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        /**
         * This is an object giving more details on the network-level event that caused the
         * Transaction. Note that for backwards compatibility reasons, additional undocumented keys
         * may appear in this object. These should be treated as deprecated and will be removed in
         * the future.
         */
        @JsonDeserialize(builder = Source.Builder::class)
        @NoAutoDetect
        class Source
        private constructor(
            private val category: JsonField<Category>,
            private val accountTransferIntention: JsonField<AccountTransferIntention>,
            private val achCheckConversionReturn: JsonField<AchCheckConversionReturn>,
            private val achCheckConversion: JsonField<AchCheckConversion>,
            private val achTransferIntention: JsonField<AchTransferIntention>,
            private val achTransferRejection: JsonField<AchTransferRejection>,
            private val achTransferReturn: JsonField<AchTransferReturn>,
            private val cardDisputeAcceptance: JsonField<CardDisputeAcceptance>,
            private val cardRefund: JsonField<CardRefund>,
            private val cardSettlement: JsonField<CardSettlement>,
            private val cardRevenuePayment: JsonField<CardRevenuePayment>,
            private val checkDepositAcceptance: JsonField<CheckDepositAcceptance>,
            private val checkDepositReturn: JsonField<CheckDepositReturn>,
            private val checkTransferIntention: JsonField<CheckTransferIntention>,
            private val checkTransferReturn: JsonField<CheckTransferReturn>,
            private val checkTransferRejection: JsonField<CheckTransferRejection>,
            private val checkTransferStopPaymentRequest: JsonField<CheckTransferStopPaymentRequest>,
            private val disputeResolution: JsonField<DisputeResolution>,
            private val empyrealCashDeposit: JsonField<EmpyrealCashDeposit>,
            private val feePayment: JsonField<FeePayment>,
            private val inboundAchTransfer: JsonField<InboundAchTransfer>,
            private val inboundCheck: JsonField<InboundCheck>,
            private val inboundInternationalAchTransfer: JsonField<InboundInternationalAchTransfer>,
            private val inboundRealTimePaymentsTransferConfirmation:
                JsonField<InboundRealTimePaymentsTransferConfirmation>,
            private val inboundWireDrawdownPaymentReversal:
                JsonField<InboundWireDrawdownPaymentReversal>,
            private val inboundWireDrawdownPayment: JsonField<InboundWireDrawdownPayment>,
            private val inboundWireReversal: JsonField<InboundWireReversal>,
            private val inboundWireTransfer: JsonField<InboundWireTransfer>,
            private val interestPayment: JsonField<InterestPayment>,
            private val internalSource: JsonField<InternalSource>,
            private val cardRouteRefund: JsonField<CardRouteRefund>,
            private val cardRouteSettlement: JsonField<CardRouteSettlement>,
            private val realTimePaymentsTransferAcknowledgement:
                JsonField<RealTimePaymentsTransferAcknowledgement>,
            private val sampleFunds: JsonField<SampleFunds>,
            private val wireDrawdownPaymentIntention: JsonField<WireDrawdownPaymentIntention>,
            private val wireDrawdownPaymentRejection: JsonField<WireDrawdownPaymentRejection>,
            private val wireTransferIntention: JsonField<WireTransferIntention>,
            private val wireTransferRejection: JsonField<WireTransferRejection>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /**
             * The type of transaction that took place. We may add additional possible values for
             * this enum over time; your application should be able to handle such additions
             * gracefully.
             */
            fun category(): Category = category.getRequired("category")

            /**
             * A Account Transfer Intention object. This field will be present in the JSON response
             * if and only if `category` is equal to `account_transfer_intention`.
             */
            fun accountTransferIntention(): Optional<AccountTransferIntention> =
                Optional.ofNullable(
                    accountTransferIntention.getNullable("account_transfer_intention")
                )

            /**
             * A ACH Check Conversion Return object. This field will be present in the JSON response
             * if and only if `category` is equal to `ach_check_conversion_return`.
             */
            fun achCheckConversionReturn(): Optional<AchCheckConversionReturn> =
                Optional.ofNullable(
                    achCheckConversionReturn.getNullable("ach_check_conversion_return")
                )

            /**
             * A ACH Check Conversion object. This field will be present in the JSON response if and
             * only if `category` is equal to `ach_check_conversion`.
             */
            fun achCheckConversion(): Optional<AchCheckConversion> =
                Optional.ofNullable(achCheckConversion.getNullable("ach_check_conversion"))

            /**
             * A ACH Transfer Intention object. This field will be present in the JSON response if
             * and only if `category` is equal to `ach_transfer_intention`.
             */
            fun achTransferIntention(): Optional<AchTransferIntention> =
                Optional.ofNullable(achTransferIntention.getNullable("ach_transfer_intention"))

            /**
             * A ACH Transfer Rejection object. This field will be present in the JSON response if
             * and only if `category` is equal to `ach_transfer_rejection`.
             */
            fun achTransferRejection(): Optional<AchTransferRejection> =
                Optional.ofNullable(achTransferRejection.getNullable("ach_transfer_rejection"))

            /**
             * A ACH Transfer Return object. This field will be present in the JSON response if and
             * only if `category` is equal to `ach_transfer_return`.
             */
            fun achTransferReturn(): Optional<AchTransferReturn> =
                Optional.ofNullable(achTransferReturn.getNullable("ach_transfer_return"))

            /**
             * A Card Dispute Acceptance object. This field will be present in the JSON response if
             * and only if `category` is equal to `card_dispute_acceptance`.
             */
            fun cardDisputeAcceptance(): Optional<CardDisputeAcceptance> =
                Optional.ofNullable(cardDisputeAcceptance.getNullable("card_dispute_acceptance"))

            /**
             * A Card Refund object. This field will be present in the JSON response if and only if
             * `category` is equal to `card_refund`.
             */
            fun cardRefund(): Optional<CardRefund> =
                Optional.ofNullable(cardRefund.getNullable("card_refund"))

            /**
             * A Card Settlement object. This field will be present in the JSON response if and only
             * if `category` is equal to `card_settlement`.
             */
            fun cardSettlement(): Optional<CardSettlement> =
                Optional.ofNullable(cardSettlement.getNullable("card_settlement"))

            /**
             * A Card Revenue Payment object. This field will be present in the JSON response if and
             * only if `category` is equal to `card_revenue_payment`.
             */
            fun cardRevenuePayment(): Optional<CardRevenuePayment> =
                Optional.ofNullable(cardRevenuePayment.getNullable("card_revenue_payment"))

            /**
             * A Check Deposit Acceptance object. This field will be present in the JSON response if
             * and only if `category` is equal to `check_deposit_acceptance`.
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
             * A Check Transfer Intention object. This field will be present in the JSON response if
             * and only if `category` is equal to `check_transfer_intention`.
             */
            fun checkTransferIntention(): Optional<CheckTransferIntention> =
                Optional.ofNullable(checkTransferIntention.getNullable("check_transfer_intention"))

            /**
             * A Check Transfer Return object. This field will be present in the JSON response if
             * and only if `category` is equal to `check_transfer_return`.
             */
            fun checkTransferReturn(): Optional<CheckTransferReturn> =
                Optional.ofNullable(checkTransferReturn.getNullable("check_transfer_return"))

            /**
             * A Check Transfer Rejection object. This field will be present in the JSON response if
             * and only if `category` is equal to `check_transfer_rejection`.
             */
            fun checkTransferRejection(): Optional<CheckTransferRejection> =
                Optional.ofNullable(checkTransferRejection.getNullable("check_transfer_rejection"))

            /**
             * A Check Transfer Stop Payment Request object. This field will be present in the JSON
             * response if and only if `category` is equal to `check_transfer_stop_payment_request`.
             */
            fun checkTransferStopPaymentRequest(): Optional<CheckTransferStopPaymentRequest> =
                Optional.ofNullable(
                    checkTransferStopPaymentRequest.getNullable(
                        "check_transfer_stop_payment_request"
                    )
                )

            /**
             * A Dispute Resolution object. This field will be present in the JSON response if and
             * only if `category` is equal to `dispute_resolution`.
             */
            fun disputeResolution(): Optional<DisputeResolution> =
                Optional.ofNullable(disputeResolution.getNullable("dispute_resolution"))

            /**
             * A Empyreal Cash Deposit object. This field will be present in the JSON response if
             * and only if `category` is equal to `empyreal_cash_deposit`.
             */
            fun empyrealCashDeposit(): Optional<EmpyrealCashDeposit> =
                Optional.ofNullable(empyrealCashDeposit.getNullable("empyreal_cash_deposit"))

            /**
             * A Fee Payment object. This field will be present in the JSON response if and only if
             * `category` is equal to `fee_payment`.
             */
            fun feePayment(): Optional<FeePayment> =
                Optional.ofNullable(feePayment.getNullable("fee_payment"))

            /**
             * A Inbound ACH Transfer object. This field will be present in the JSON response if and
             * only if `category` is equal to `inbound_ach_transfer`.
             */
            fun inboundAchTransfer(): Optional<InboundAchTransfer> =
                Optional.ofNullable(inboundAchTransfer.getNullable("inbound_ach_transfer"))

            /**
             * A Inbound Check object. This field will be present in the JSON response if and only
             * if `category` is equal to `inbound_check`.
             */
            fun inboundCheck(): Optional<InboundCheck> =
                Optional.ofNullable(inboundCheck.getNullable("inbound_check"))

            /**
             * A Inbound International ACH Transfer object. This field will be present in the JSON
             * response if and only if `category` is equal to `inbound_international_ach_transfer`.
             */
            fun inboundInternationalAchTransfer(): Optional<InboundInternationalAchTransfer> =
                Optional.ofNullable(
                    inboundInternationalAchTransfer.getNullable(
                        "inbound_international_ach_transfer"
                    )
                )

            /**
             * A Inbound Real Time Payments Transfer Confirmation object. This field will be present
             * in the JSON response if and only if `category` is equal to
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
             * A Inbound Wire Drawdown Payment Reversal object. This field will be present in the
             * JSON response if and only if `category` is equal to
             * `inbound_wire_drawdown_payment_reversal`.
             */
            fun inboundWireDrawdownPaymentReversal(): Optional<InboundWireDrawdownPaymentReversal> =
                Optional.ofNullable(
                    inboundWireDrawdownPaymentReversal.getNullable(
                        "inbound_wire_drawdown_payment_reversal"
                    )
                )

            /**
             * A Inbound Wire Drawdown Payment object. This field will be present in the JSON
             * response if and only if `category` is equal to `inbound_wire_drawdown_payment`.
             */
            fun inboundWireDrawdownPayment(): Optional<InboundWireDrawdownPayment> =
                Optional.ofNullable(
                    inboundWireDrawdownPayment.getNullable("inbound_wire_drawdown_payment")
                )

            /**
             * A Inbound Wire Reversal object. This field will be present in the JSON response if
             * and only if `category` is equal to `inbound_wire_reversal`.
             */
            fun inboundWireReversal(): Optional<InboundWireReversal> =
                Optional.ofNullable(inboundWireReversal.getNullable("inbound_wire_reversal"))

            /**
             * A Inbound Wire Transfer object. This field will be present in the JSON response if
             * and only if `category` is equal to `inbound_wire_transfer`.
             */
            fun inboundWireTransfer(): Optional<InboundWireTransfer> =
                Optional.ofNullable(inboundWireTransfer.getNullable("inbound_wire_transfer"))

            /**
             * A Interest Payment object. This field will be present in the JSON response if and
             * only if `category` is equal to `interest_payment`.
             */
            fun interestPayment(): Optional<InterestPayment> =
                Optional.ofNullable(interestPayment.getNullable("interest_payment"))

            /**
             * A Internal Source object. This field will be present in the JSON response if and only
             * if `category` is equal to `internal_source`.
             */
            fun internalSource(): Optional<InternalSource> =
                Optional.ofNullable(internalSource.getNullable("internal_source"))

            /**
             * A Deprecated Card Refund object. This field will be present in the JSON response if
             * and only if `category` is equal to `card_route_refund`.
             */
            fun cardRouteRefund(): Optional<CardRouteRefund> =
                Optional.ofNullable(cardRouteRefund.getNullable("card_route_refund"))

            /**
             * A Deprecated Card Settlement object. This field will be present in the JSON response
             * if and only if `category` is equal to `card_route_settlement`.
             */
            fun cardRouteSettlement(): Optional<CardRouteSettlement> =
                Optional.ofNullable(cardRouteSettlement.getNullable("card_route_settlement"))

            /**
             * A Real Time Payments Transfer Acknowledgement object. This field will be present in
             * the JSON response if and only if `category` is equal to
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
             * A Wire Drawdown Payment Intention object. This field will be present in the JSON
             * response if and only if `category` is equal to `wire_drawdown_payment_intention`.
             */
            fun wireDrawdownPaymentIntention(): Optional<WireDrawdownPaymentIntention> =
                Optional.ofNullable(
                    wireDrawdownPaymentIntention.getNullable("wire_drawdown_payment_intention")
                )

            /**
             * A Wire Drawdown Payment Rejection object. This field will be present in the JSON
             * response if and only if `category` is equal to `wire_drawdown_payment_rejection`.
             */
            fun wireDrawdownPaymentRejection(): Optional<WireDrawdownPaymentRejection> =
                Optional.ofNullable(
                    wireDrawdownPaymentRejection.getNullable("wire_drawdown_payment_rejection")
                )

            /**
             * A Wire Transfer Intention object. This field will be present in the JSON response if
             * and only if `category` is equal to `wire_transfer_intention`.
             */
            fun wireTransferIntention(): Optional<WireTransferIntention> =
                Optional.ofNullable(wireTransferIntention.getNullable("wire_transfer_intention"))

            /**
             * A Wire Transfer Rejection object. This field will be present in the JSON response if
             * and only if `category` is equal to `wire_transfer_rejection`.
             */
            fun wireTransferRejection(): Optional<WireTransferRejection> =
                Optional.ofNullable(wireTransferRejection.getNullable("wire_transfer_rejection"))

            /**
             * The type of transaction that took place. We may add additional possible values for
             * this enum over time; your application should be able to handle such additions
             * gracefully.
             */
            @JsonProperty("category") @ExcludeMissing fun _category() = category

            /**
             * A Account Transfer Intention object. This field will be present in the JSON response
             * if and only if `category` is equal to `account_transfer_intention`.
             */
            @JsonProperty("account_transfer_intention")
            @ExcludeMissing
            fun _accountTransferIntention() = accountTransferIntention

            /**
             * A ACH Check Conversion Return object. This field will be present in the JSON response
             * if and only if `category` is equal to `ach_check_conversion_return`.
             */
            @JsonProperty("ach_check_conversion_return")
            @ExcludeMissing
            fun _achCheckConversionReturn() = achCheckConversionReturn

            /**
             * A ACH Check Conversion object. This field will be present in the JSON response if and
             * only if `category` is equal to `ach_check_conversion`.
             */
            @JsonProperty("ach_check_conversion")
            @ExcludeMissing
            fun _achCheckConversion() = achCheckConversion

            /**
             * A ACH Transfer Intention object. This field will be present in the JSON response if
             * and only if `category` is equal to `ach_transfer_intention`.
             */
            @JsonProperty("ach_transfer_intention")
            @ExcludeMissing
            fun _achTransferIntention() = achTransferIntention

            /**
             * A ACH Transfer Rejection object. This field will be present in the JSON response if
             * and only if `category` is equal to `ach_transfer_rejection`.
             */
            @JsonProperty("ach_transfer_rejection")
            @ExcludeMissing
            fun _achTransferRejection() = achTransferRejection

            /**
             * A ACH Transfer Return object. This field will be present in the JSON response if and
             * only if `category` is equal to `ach_transfer_return`.
             */
            @JsonProperty("ach_transfer_return")
            @ExcludeMissing
            fun _achTransferReturn() = achTransferReturn

            /**
             * A Card Dispute Acceptance object. This field will be present in the JSON response if
             * and only if `category` is equal to `card_dispute_acceptance`.
             */
            @JsonProperty("card_dispute_acceptance")
            @ExcludeMissing
            fun _cardDisputeAcceptance() = cardDisputeAcceptance

            /**
             * A Card Refund object. This field will be present in the JSON response if and only if
             * `category` is equal to `card_refund`.
             */
            @JsonProperty("card_refund") @ExcludeMissing fun _cardRefund() = cardRefund

            /**
             * A Card Settlement object. This field will be present in the JSON response if and only
             * if `category` is equal to `card_settlement`.
             */
            @JsonProperty("card_settlement") @ExcludeMissing fun _cardSettlement() = cardSettlement

            /**
             * A Card Revenue Payment object. This field will be present in the JSON response if and
             * only if `category` is equal to `card_revenue_payment`.
             */
            @JsonProperty("card_revenue_payment")
            @ExcludeMissing
            fun _cardRevenuePayment() = cardRevenuePayment

            /**
             * A Check Deposit Acceptance object. This field will be present in the JSON response if
             * and only if `category` is equal to `check_deposit_acceptance`.
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
             * A Check Transfer Intention object. This field will be present in the JSON response if
             * and only if `category` is equal to `check_transfer_intention`.
             */
            @JsonProperty("check_transfer_intention")
            @ExcludeMissing
            fun _checkTransferIntention() = checkTransferIntention

            /**
             * A Check Transfer Return object. This field will be present in the JSON response if
             * and only if `category` is equal to `check_transfer_return`.
             */
            @JsonProperty("check_transfer_return")
            @ExcludeMissing
            fun _checkTransferReturn() = checkTransferReturn

            /**
             * A Check Transfer Rejection object. This field will be present in the JSON response if
             * and only if `category` is equal to `check_transfer_rejection`.
             */
            @JsonProperty("check_transfer_rejection")
            @ExcludeMissing
            fun _checkTransferRejection() = checkTransferRejection

            /**
             * A Check Transfer Stop Payment Request object. This field will be present in the JSON
             * response if and only if `category` is equal to `check_transfer_stop_payment_request`.
             */
            @JsonProperty("check_transfer_stop_payment_request")
            @ExcludeMissing
            fun _checkTransferStopPaymentRequest() = checkTransferStopPaymentRequest

            /**
             * A Dispute Resolution object. This field will be present in the JSON response if and
             * only if `category` is equal to `dispute_resolution`.
             */
            @JsonProperty("dispute_resolution")
            @ExcludeMissing
            fun _disputeResolution() = disputeResolution

            /**
             * A Empyreal Cash Deposit object. This field will be present in the JSON response if
             * and only if `category` is equal to `empyreal_cash_deposit`.
             */
            @JsonProperty("empyreal_cash_deposit")
            @ExcludeMissing
            fun _empyrealCashDeposit() = empyrealCashDeposit

            /**
             * A Fee Payment object. This field will be present in the JSON response if and only if
             * `category` is equal to `fee_payment`.
             */
            @JsonProperty("fee_payment") @ExcludeMissing fun _feePayment() = feePayment

            /**
             * A Inbound ACH Transfer object. This field will be present in the JSON response if and
             * only if `category` is equal to `inbound_ach_transfer`.
             */
            @JsonProperty("inbound_ach_transfer")
            @ExcludeMissing
            fun _inboundAchTransfer() = inboundAchTransfer

            /**
             * A Inbound Check object. This field will be present in the JSON response if and only
             * if `category` is equal to `inbound_check`.
             */
            @JsonProperty("inbound_check") @ExcludeMissing fun _inboundCheck() = inboundCheck

            /**
             * A Inbound International ACH Transfer object. This field will be present in the JSON
             * response if and only if `category` is equal to `inbound_international_ach_transfer`.
             */
            @JsonProperty("inbound_international_ach_transfer")
            @ExcludeMissing
            fun _inboundInternationalAchTransfer() = inboundInternationalAchTransfer

            /**
             * A Inbound Real Time Payments Transfer Confirmation object. This field will be present
             * in the JSON response if and only if `category` is equal to
             * `inbound_real_time_payments_transfer_confirmation`.
             */
            @JsonProperty("inbound_real_time_payments_transfer_confirmation")
            @ExcludeMissing
            fun _inboundRealTimePaymentsTransferConfirmation() =
                inboundRealTimePaymentsTransferConfirmation

            /**
             * A Inbound Wire Drawdown Payment Reversal object. This field will be present in the
             * JSON response if and only if `category` is equal to
             * `inbound_wire_drawdown_payment_reversal`.
             */
            @JsonProperty("inbound_wire_drawdown_payment_reversal")
            @ExcludeMissing
            fun _inboundWireDrawdownPaymentReversal() = inboundWireDrawdownPaymentReversal

            /**
             * A Inbound Wire Drawdown Payment object. This field will be present in the JSON
             * response if and only if `category` is equal to `inbound_wire_drawdown_payment`.
             */
            @JsonProperty("inbound_wire_drawdown_payment")
            @ExcludeMissing
            fun _inboundWireDrawdownPayment() = inboundWireDrawdownPayment

            /**
             * A Inbound Wire Reversal object. This field will be present in the JSON response if
             * and only if `category` is equal to `inbound_wire_reversal`.
             */
            @JsonProperty("inbound_wire_reversal")
            @ExcludeMissing
            fun _inboundWireReversal() = inboundWireReversal

            /**
             * A Inbound Wire Transfer object. This field will be present in the JSON response if
             * and only if `category` is equal to `inbound_wire_transfer`.
             */
            @JsonProperty("inbound_wire_transfer")
            @ExcludeMissing
            fun _inboundWireTransfer() = inboundWireTransfer

            /**
             * A Interest Payment object. This field will be present in the JSON response if and
             * only if `category` is equal to `interest_payment`.
             */
            @JsonProperty("interest_payment")
            @ExcludeMissing
            fun _interestPayment() = interestPayment

            /**
             * A Internal Source object. This field will be present in the JSON response if and only
             * if `category` is equal to `internal_source`.
             */
            @JsonProperty("internal_source") @ExcludeMissing fun _internalSource() = internalSource

            /**
             * A Deprecated Card Refund object. This field will be present in the JSON response if
             * and only if `category` is equal to `card_route_refund`.
             */
            @JsonProperty("card_route_refund")
            @ExcludeMissing
            fun _cardRouteRefund() = cardRouteRefund

            /**
             * A Deprecated Card Settlement object. This field will be present in the JSON response
             * if and only if `category` is equal to `card_route_settlement`.
             */
            @JsonProperty("card_route_settlement")
            @ExcludeMissing
            fun _cardRouteSettlement() = cardRouteSettlement

            /**
             * A Real Time Payments Transfer Acknowledgement object. This field will be present in
             * the JSON response if and only if `category` is equal to
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
             * A Wire Drawdown Payment Intention object. This field will be present in the JSON
             * response if and only if `category` is equal to `wire_drawdown_payment_intention`.
             */
            @JsonProperty("wire_drawdown_payment_intention")
            @ExcludeMissing
            fun _wireDrawdownPaymentIntention() = wireDrawdownPaymentIntention

            /**
             * A Wire Drawdown Payment Rejection object. This field will be present in the JSON
             * response if and only if `category` is equal to `wire_drawdown_payment_rejection`.
             */
            @JsonProperty("wire_drawdown_payment_rejection")
            @ExcludeMissing
            fun _wireDrawdownPaymentRejection() = wireDrawdownPaymentRejection

            /**
             * A Wire Transfer Intention object. This field will be present in the JSON response if
             * and only if `category` is equal to `wire_transfer_intention`.
             */
            @JsonProperty("wire_transfer_intention")
            @ExcludeMissing
            fun _wireTransferIntention() = wireTransferIntention

            /**
             * A Wire Transfer Rejection object. This field will be present in the JSON response if
             * and only if `category` is equal to `wire_transfer_rejection`.
             */
            @JsonProperty("wire_transfer_rejection")
            @ExcludeMissing
            fun _wireTransferRejection() = wireTransferRejection

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate() = apply {
                if (!validated) {
                    category()
                    accountTransferIntention().map { it.validate() }
                    achCheckConversionReturn().map { it.validate() }
                    achCheckConversion().map { it.validate() }
                    achTransferIntention().map { it.validate() }
                    achTransferRejection().map { it.validate() }
                    achTransferReturn().map { it.validate() }
                    cardDisputeAcceptance().map { it.validate() }
                    cardRefund().map { it.validate() }
                    cardSettlement().map { it.validate() }
                    cardRevenuePayment().map { it.validate() }
                    checkDepositAcceptance().map { it.validate() }
                    checkDepositReturn().map { it.validate() }
                    checkTransferIntention().map { it.validate() }
                    checkTransferReturn().map { it.validate() }
                    checkTransferRejection().map { it.validate() }
                    checkTransferStopPaymentRequest().map { it.validate() }
                    disputeResolution().map { it.validate() }
                    empyrealCashDeposit().map { it.validate() }
                    feePayment().map { it.validate() }
                    inboundAchTransfer().map { it.validate() }
                    inboundCheck().map { it.validate() }
                    inboundInternationalAchTransfer().map { it.validate() }
                    inboundRealTimePaymentsTransferConfirmation().map { it.validate() }
                    inboundWireDrawdownPaymentReversal().map { it.validate() }
                    inboundWireDrawdownPayment().map { it.validate() }
                    inboundWireReversal().map { it.validate() }
                    inboundWireTransfer().map { it.validate() }
                    interestPayment().map { it.validate() }
                    internalSource().map { it.validate() }
                    cardRouteRefund().map { it.validate() }
                    cardRouteSettlement().map { it.validate() }
                    realTimePaymentsTransferAcknowledgement().map { it.validate() }
                    sampleFunds().map { it.validate() }
                    wireDrawdownPaymentIntention().map { it.validate() }
                    wireDrawdownPaymentRejection().map { it.validate() }
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
                    this.category == other.category &&
                    this.accountTransferIntention == other.accountTransferIntention &&
                    this.achCheckConversionReturn == other.achCheckConversionReturn &&
                    this.achCheckConversion == other.achCheckConversion &&
                    this.achTransferIntention == other.achTransferIntention &&
                    this.achTransferRejection == other.achTransferRejection &&
                    this.achTransferReturn == other.achTransferReturn &&
                    this.cardDisputeAcceptance == other.cardDisputeAcceptance &&
                    this.cardRefund == other.cardRefund &&
                    this.cardSettlement == other.cardSettlement &&
                    this.cardRevenuePayment == other.cardRevenuePayment &&
                    this.checkDepositAcceptance == other.checkDepositAcceptance &&
                    this.checkDepositReturn == other.checkDepositReturn &&
                    this.checkTransferIntention == other.checkTransferIntention &&
                    this.checkTransferReturn == other.checkTransferReturn &&
                    this.checkTransferRejection == other.checkTransferRejection &&
                    this.checkTransferStopPaymentRequest == other.checkTransferStopPaymentRequest &&
                    this.disputeResolution == other.disputeResolution &&
                    this.empyrealCashDeposit == other.empyrealCashDeposit &&
                    this.feePayment == other.feePayment &&
                    this.inboundAchTransfer == other.inboundAchTransfer &&
                    this.inboundCheck == other.inboundCheck &&
                    this.inboundInternationalAchTransfer == other.inboundInternationalAchTransfer &&
                    this.inboundRealTimePaymentsTransferConfirmation ==
                        other.inboundRealTimePaymentsTransferConfirmation &&
                    this.inboundWireDrawdownPaymentReversal ==
                        other.inboundWireDrawdownPaymentReversal &&
                    this.inboundWireDrawdownPayment == other.inboundWireDrawdownPayment &&
                    this.inboundWireReversal == other.inboundWireReversal &&
                    this.inboundWireTransfer == other.inboundWireTransfer &&
                    this.interestPayment == other.interestPayment &&
                    this.internalSource == other.internalSource &&
                    this.cardRouteRefund == other.cardRouteRefund &&
                    this.cardRouteSettlement == other.cardRouteSettlement &&
                    this.realTimePaymentsTransferAcknowledgement ==
                        other.realTimePaymentsTransferAcknowledgement &&
                    this.sampleFunds == other.sampleFunds &&
                    this.wireDrawdownPaymentIntention == other.wireDrawdownPaymentIntention &&
                    this.wireDrawdownPaymentRejection == other.wireDrawdownPaymentRejection &&
                    this.wireTransferIntention == other.wireTransferIntention &&
                    this.wireTransferRejection == other.wireTransferRejection &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            category,
                            accountTransferIntention,
                            achCheckConversionReturn,
                            achCheckConversion,
                            achTransferIntention,
                            achTransferRejection,
                            achTransferReturn,
                            cardDisputeAcceptance,
                            cardRefund,
                            cardSettlement,
                            cardRevenuePayment,
                            checkDepositAcceptance,
                            checkDepositReturn,
                            checkTransferIntention,
                            checkTransferReturn,
                            checkTransferRejection,
                            checkTransferStopPaymentRequest,
                            disputeResolution,
                            empyrealCashDeposit,
                            feePayment,
                            inboundAchTransfer,
                            inboundCheck,
                            inboundInternationalAchTransfer,
                            inboundRealTimePaymentsTransferConfirmation,
                            inboundWireDrawdownPaymentReversal,
                            inboundWireDrawdownPayment,
                            inboundWireReversal,
                            inboundWireTransfer,
                            interestPayment,
                            internalSource,
                            cardRouteRefund,
                            cardRouteSettlement,
                            realTimePaymentsTransferAcknowledgement,
                            sampleFunds,
                            wireDrawdownPaymentIntention,
                            wireDrawdownPaymentRejection,
                            wireTransferIntention,
                            wireTransferRejection,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Source{category=$category, accountTransferIntention=$accountTransferIntention, achCheckConversionReturn=$achCheckConversionReturn, achCheckConversion=$achCheckConversion, achTransferIntention=$achTransferIntention, achTransferRejection=$achTransferRejection, achTransferReturn=$achTransferReturn, cardDisputeAcceptance=$cardDisputeAcceptance, cardRefund=$cardRefund, cardSettlement=$cardSettlement, cardRevenuePayment=$cardRevenuePayment, checkDepositAcceptance=$checkDepositAcceptance, checkDepositReturn=$checkDepositReturn, checkTransferIntention=$checkTransferIntention, checkTransferReturn=$checkTransferReturn, checkTransferRejection=$checkTransferRejection, checkTransferStopPaymentRequest=$checkTransferStopPaymentRequest, disputeResolution=$disputeResolution, empyrealCashDeposit=$empyrealCashDeposit, feePayment=$feePayment, inboundAchTransfer=$inboundAchTransfer, inboundCheck=$inboundCheck, inboundInternationalAchTransfer=$inboundInternationalAchTransfer, inboundRealTimePaymentsTransferConfirmation=$inboundRealTimePaymentsTransferConfirmation, inboundWireDrawdownPaymentReversal=$inboundWireDrawdownPaymentReversal, inboundWireDrawdownPayment=$inboundWireDrawdownPayment, inboundWireReversal=$inboundWireReversal, inboundWireTransfer=$inboundWireTransfer, interestPayment=$interestPayment, internalSource=$internalSource, cardRouteRefund=$cardRouteRefund, cardRouteSettlement=$cardRouteSettlement, realTimePaymentsTransferAcknowledgement=$realTimePaymentsTransferAcknowledgement, sampleFunds=$sampleFunds, wireDrawdownPaymentIntention=$wireDrawdownPaymentIntention, wireDrawdownPaymentRejection=$wireDrawdownPaymentRejection, wireTransferIntention=$wireTransferIntention, wireTransferRejection=$wireTransferRejection, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var category: JsonField<Category> = JsonMissing.of()
                private var accountTransferIntention: JsonField<AccountTransferIntention> =
                    JsonMissing.of()
                private var achCheckConversionReturn: JsonField<AchCheckConversionReturn> =
                    JsonMissing.of()
                private var achCheckConversion: JsonField<AchCheckConversion> = JsonMissing.of()
                private var achTransferIntention: JsonField<AchTransferIntention> = JsonMissing.of()
                private var achTransferRejection: JsonField<AchTransferRejection> = JsonMissing.of()
                private var achTransferReturn: JsonField<AchTransferReturn> = JsonMissing.of()
                private var cardDisputeAcceptance: JsonField<CardDisputeAcceptance> =
                    JsonMissing.of()
                private var cardRefund: JsonField<CardRefund> = JsonMissing.of()
                private var cardSettlement: JsonField<CardSettlement> = JsonMissing.of()
                private var cardRevenuePayment: JsonField<CardRevenuePayment> = JsonMissing.of()
                private var checkDepositAcceptance: JsonField<CheckDepositAcceptance> =
                    JsonMissing.of()
                private var checkDepositReturn: JsonField<CheckDepositReturn> = JsonMissing.of()
                private var checkTransferIntention: JsonField<CheckTransferIntention> =
                    JsonMissing.of()
                private var checkTransferReturn: JsonField<CheckTransferReturn> = JsonMissing.of()
                private var checkTransferRejection: JsonField<CheckTransferRejection> =
                    JsonMissing.of()
                private var checkTransferStopPaymentRequest:
                    JsonField<CheckTransferStopPaymentRequest> =
                    JsonMissing.of()
                private var disputeResolution: JsonField<DisputeResolution> = JsonMissing.of()
                private var empyrealCashDeposit: JsonField<EmpyrealCashDeposit> = JsonMissing.of()
                private var feePayment: JsonField<FeePayment> = JsonMissing.of()
                private var inboundAchTransfer: JsonField<InboundAchTransfer> = JsonMissing.of()
                private var inboundCheck: JsonField<InboundCheck> = JsonMissing.of()
                private var inboundInternationalAchTransfer:
                    JsonField<InboundInternationalAchTransfer> =
                    JsonMissing.of()
                private var inboundRealTimePaymentsTransferConfirmation:
                    JsonField<InboundRealTimePaymentsTransferConfirmation> =
                    JsonMissing.of()
                private var inboundWireDrawdownPaymentReversal:
                    JsonField<InboundWireDrawdownPaymentReversal> =
                    JsonMissing.of()
                private var inboundWireDrawdownPayment: JsonField<InboundWireDrawdownPayment> =
                    JsonMissing.of()
                private var inboundWireReversal: JsonField<InboundWireReversal> = JsonMissing.of()
                private var inboundWireTransfer: JsonField<InboundWireTransfer> = JsonMissing.of()
                private var interestPayment: JsonField<InterestPayment> = JsonMissing.of()
                private var internalSource: JsonField<InternalSource> = JsonMissing.of()
                private var cardRouteRefund: JsonField<CardRouteRefund> = JsonMissing.of()
                private var cardRouteSettlement: JsonField<CardRouteSettlement> = JsonMissing.of()
                private var realTimePaymentsTransferAcknowledgement:
                    JsonField<RealTimePaymentsTransferAcknowledgement> =
                    JsonMissing.of()
                private var sampleFunds: JsonField<SampleFunds> = JsonMissing.of()
                private var wireDrawdownPaymentIntention: JsonField<WireDrawdownPaymentIntention> =
                    JsonMissing.of()
                private var wireDrawdownPaymentRejection: JsonField<WireDrawdownPaymentRejection> =
                    JsonMissing.of()
                private var wireTransferIntention: JsonField<WireTransferIntention> =
                    JsonMissing.of()
                private var wireTransferRejection: JsonField<WireTransferRejection> =
                    JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(source: Source) = apply {
                    this.category = source.category
                    this.accountTransferIntention = source.accountTransferIntention
                    this.achCheckConversionReturn = source.achCheckConversionReturn
                    this.achCheckConversion = source.achCheckConversion
                    this.achTransferIntention = source.achTransferIntention
                    this.achTransferRejection = source.achTransferRejection
                    this.achTransferReturn = source.achTransferReturn
                    this.cardDisputeAcceptance = source.cardDisputeAcceptance
                    this.cardRefund = source.cardRefund
                    this.cardSettlement = source.cardSettlement
                    this.cardRevenuePayment = source.cardRevenuePayment
                    this.checkDepositAcceptance = source.checkDepositAcceptance
                    this.checkDepositReturn = source.checkDepositReturn
                    this.checkTransferIntention = source.checkTransferIntention
                    this.checkTransferReturn = source.checkTransferReturn
                    this.checkTransferRejection = source.checkTransferRejection
                    this.checkTransferStopPaymentRequest = source.checkTransferStopPaymentRequest
                    this.disputeResolution = source.disputeResolution
                    this.empyrealCashDeposit = source.empyrealCashDeposit
                    this.feePayment = source.feePayment
                    this.inboundAchTransfer = source.inboundAchTransfer
                    this.inboundCheck = source.inboundCheck
                    this.inboundInternationalAchTransfer = source.inboundInternationalAchTransfer
                    this.inboundRealTimePaymentsTransferConfirmation =
                        source.inboundRealTimePaymentsTransferConfirmation
                    this.inboundWireDrawdownPaymentReversal =
                        source.inboundWireDrawdownPaymentReversal
                    this.inboundWireDrawdownPayment = source.inboundWireDrawdownPayment
                    this.inboundWireReversal = source.inboundWireReversal
                    this.inboundWireTransfer = source.inboundWireTransfer
                    this.interestPayment = source.interestPayment
                    this.internalSource = source.internalSource
                    this.cardRouteRefund = source.cardRouteRefund
                    this.cardRouteSettlement = source.cardRouteSettlement
                    this.realTimePaymentsTransferAcknowledgement =
                        source.realTimePaymentsTransferAcknowledgement
                    this.sampleFunds = source.sampleFunds
                    this.wireDrawdownPaymentIntention = source.wireDrawdownPaymentIntention
                    this.wireDrawdownPaymentRejection = source.wireDrawdownPaymentRejection
                    this.wireTransferIntention = source.wireTransferIntention
                    this.wireTransferRejection = source.wireTransferRejection
                    additionalProperties(source.additionalProperties)
                }

                /**
                 * The type of transaction that took place. We may add additional possible values
                 * for this enum over time; your application should be able to handle such additions
                 * gracefully.
                 */
                fun category(category: Category) = category(JsonField.of(category))

                /**
                 * The type of transaction that took place. We may add additional possible values
                 * for this enum over time; your application should be able to handle such additions
                 * gracefully.
                 */
                @JsonProperty("category")
                @ExcludeMissing
                fun category(category: JsonField<Category>) = apply { this.category = category }

                /**
                 * A Account Transfer Intention object. This field will be present in the JSON
                 * response if and only if `category` is equal to `account_transfer_intention`.
                 */
                fun accountTransferIntention(accountTransferIntention: AccountTransferIntention) =
                    accountTransferIntention(JsonField.of(accountTransferIntention))

                /**
                 * A Account Transfer Intention object. This field will be present in the JSON
                 * response if and only if `category` is equal to `account_transfer_intention`.
                 */
                @JsonProperty("account_transfer_intention")
                @ExcludeMissing
                fun accountTransferIntention(
                    accountTransferIntention: JsonField<AccountTransferIntention>
                ) = apply { this.accountTransferIntention = accountTransferIntention }

                /**
                 * A ACH Check Conversion Return object. This field will be present in the JSON
                 * response if and only if `category` is equal to `ach_check_conversion_return`.
                 */
                fun achCheckConversionReturn(achCheckConversionReturn: AchCheckConversionReturn) =
                    achCheckConversionReturn(JsonField.of(achCheckConversionReturn))

                /**
                 * A ACH Check Conversion Return object. This field will be present in the JSON
                 * response if and only if `category` is equal to `ach_check_conversion_return`.
                 */
                @JsonProperty("ach_check_conversion_return")
                @ExcludeMissing
                fun achCheckConversionReturn(
                    achCheckConversionReturn: JsonField<AchCheckConversionReturn>
                ) = apply { this.achCheckConversionReturn = achCheckConversionReturn }

                /**
                 * A ACH Check Conversion object. This field will be present in the JSON response if
                 * and only if `category` is equal to `ach_check_conversion`.
                 */
                fun achCheckConversion(achCheckConversion: AchCheckConversion) =
                    achCheckConversion(JsonField.of(achCheckConversion))

                /**
                 * A ACH Check Conversion object. This field will be present in the JSON response if
                 * and only if `category` is equal to `ach_check_conversion`.
                 */
                @JsonProperty("ach_check_conversion")
                @ExcludeMissing
                fun achCheckConversion(achCheckConversion: JsonField<AchCheckConversion>) = apply {
                    this.achCheckConversion = achCheckConversion
                }

                /**
                 * A ACH Transfer Intention object. This field will be present in the JSON response
                 * if and only if `category` is equal to `ach_transfer_intention`.
                 */
                fun achTransferIntention(achTransferIntention: AchTransferIntention) =
                    achTransferIntention(JsonField.of(achTransferIntention))

                /**
                 * A ACH Transfer Intention object. This field will be present in the JSON response
                 * if and only if `category` is equal to `ach_transfer_intention`.
                 */
                @JsonProperty("ach_transfer_intention")
                @ExcludeMissing
                fun achTransferIntention(achTransferIntention: JsonField<AchTransferIntention>) =
                    apply {
                        this.achTransferIntention = achTransferIntention
                    }

                /**
                 * A ACH Transfer Rejection object. This field will be present in the JSON response
                 * if and only if `category` is equal to `ach_transfer_rejection`.
                 */
                fun achTransferRejection(achTransferRejection: AchTransferRejection) =
                    achTransferRejection(JsonField.of(achTransferRejection))

                /**
                 * A ACH Transfer Rejection object. This field will be present in the JSON response
                 * if and only if `category` is equal to `ach_transfer_rejection`.
                 */
                @JsonProperty("ach_transfer_rejection")
                @ExcludeMissing
                fun achTransferRejection(achTransferRejection: JsonField<AchTransferRejection>) =
                    apply {
                        this.achTransferRejection = achTransferRejection
                    }

                /**
                 * A ACH Transfer Return object. This field will be present in the JSON response if
                 * and only if `category` is equal to `ach_transfer_return`.
                 */
                fun achTransferReturn(achTransferReturn: AchTransferReturn) =
                    achTransferReturn(JsonField.of(achTransferReturn))

                /**
                 * A ACH Transfer Return object. This field will be present in the JSON response if
                 * and only if `category` is equal to `ach_transfer_return`.
                 */
                @JsonProperty("ach_transfer_return")
                @ExcludeMissing
                fun achTransferReturn(achTransferReturn: JsonField<AchTransferReturn>) = apply {
                    this.achTransferReturn = achTransferReturn
                }

                /**
                 * A Card Dispute Acceptance object. This field will be present in the JSON response
                 * if and only if `category` is equal to `card_dispute_acceptance`.
                 */
                fun cardDisputeAcceptance(cardDisputeAcceptance: CardDisputeAcceptance) =
                    cardDisputeAcceptance(JsonField.of(cardDisputeAcceptance))

                /**
                 * A Card Dispute Acceptance object. This field will be present in the JSON response
                 * if and only if `category` is equal to `card_dispute_acceptance`.
                 */
                @JsonProperty("card_dispute_acceptance")
                @ExcludeMissing
                fun cardDisputeAcceptance(cardDisputeAcceptance: JsonField<CardDisputeAcceptance>) =
                    apply {
                        this.cardDisputeAcceptance = cardDisputeAcceptance
                    }

                /**
                 * A Card Refund object. This field will be present in the JSON response if and only
                 * if `category` is equal to `card_refund`.
                 */
                fun cardRefund(cardRefund: CardRefund) = cardRefund(JsonField.of(cardRefund))

                /**
                 * A Card Refund object. This field will be present in the JSON response if and only
                 * if `category` is equal to `card_refund`.
                 */
                @JsonProperty("card_refund")
                @ExcludeMissing
                fun cardRefund(cardRefund: JsonField<CardRefund>) = apply {
                    this.cardRefund = cardRefund
                }

                /**
                 * A Card Settlement object. This field will be present in the JSON response if and
                 * only if `category` is equal to `card_settlement`.
                 */
                fun cardSettlement(cardSettlement: CardSettlement) =
                    cardSettlement(JsonField.of(cardSettlement))

                /**
                 * A Card Settlement object. This field will be present in the JSON response if and
                 * only if `category` is equal to `card_settlement`.
                 */
                @JsonProperty("card_settlement")
                @ExcludeMissing
                fun cardSettlement(cardSettlement: JsonField<CardSettlement>) = apply {
                    this.cardSettlement = cardSettlement
                }

                /**
                 * A Card Revenue Payment object. This field will be present in the JSON response if
                 * and only if `category` is equal to `card_revenue_payment`.
                 */
                fun cardRevenuePayment(cardRevenuePayment: CardRevenuePayment) =
                    cardRevenuePayment(JsonField.of(cardRevenuePayment))

                /**
                 * A Card Revenue Payment object. This field will be present in the JSON response if
                 * and only if `category` is equal to `card_revenue_payment`.
                 */
                @JsonProperty("card_revenue_payment")
                @ExcludeMissing
                fun cardRevenuePayment(cardRevenuePayment: JsonField<CardRevenuePayment>) = apply {
                    this.cardRevenuePayment = cardRevenuePayment
                }

                /**
                 * A Check Deposit Acceptance object. This field will be present in the JSON
                 * response if and only if `category` is equal to `check_deposit_acceptance`.
                 */
                fun checkDepositAcceptance(checkDepositAcceptance: CheckDepositAcceptance) =
                    checkDepositAcceptance(JsonField.of(checkDepositAcceptance))

                /**
                 * A Check Deposit Acceptance object. This field will be present in the JSON
                 * response if and only if `category` is equal to `check_deposit_acceptance`.
                 */
                @JsonProperty("check_deposit_acceptance")
                @ExcludeMissing
                fun checkDepositAcceptance(
                    checkDepositAcceptance: JsonField<CheckDepositAcceptance>
                ) = apply { this.checkDepositAcceptance = checkDepositAcceptance }

                /**
                 * A Check Deposit Return object. This field will be present in the JSON response if
                 * and only if `category` is equal to `check_deposit_return`.
                 */
                fun checkDepositReturn(checkDepositReturn: CheckDepositReturn) =
                    checkDepositReturn(JsonField.of(checkDepositReturn))

                /**
                 * A Check Deposit Return object. This field will be present in the JSON response if
                 * and only if `category` is equal to `check_deposit_return`.
                 */
                @JsonProperty("check_deposit_return")
                @ExcludeMissing
                fun checkDepositReturn(checkDepositReturn: JsonField<CheckDepositReturn>) = apply {
                    this.checkDepositReturn = checkDepositReturn
                }

                /**
                 * A Check Transfer Intention object. This field will be present in the JSON
                 * response if and only if `category` is equal to `check_transfer_intention`.
                 */
                fun checkTransferIntention(checkTransferIntention: CheckTransferIntention) =
                    checkTransferIntention(JsonField.of(checkTransferIntention))

                /**
                 * A Check Transfer Intention object. This field will be present in the JSON
                 * response if and only if `category` is equal to `check_transfer_intention`.
                 */
                @JsonProperty("check_transfer_intention")
                @ExcludeMissing
                fun checkTransferIntention(
                    checkTransferIntention: JsonField<CheckTransferIntention>
                ) = apply { this.checkTransferIntention = checkTransferIntention }

                /**
                 * A Check Transfer Return object. This field will be present in the JSON response
                 * if and only if `category` is equal to `check_transfer_return`.
                 */
                fun checkTransferReturn(checkTransferReturn: CheckTransferReturn) =
                    checkTransferReturn(JsonField.of(checkTransferReturn))

                /**
                 * A Check Transfer Return object. This field will be present in the JSON response
                 * if and only if `category` is equal to `check_transfer_return`.
                 */
                @JsonProperty("check_transfer_return")
                @ExcludeMissing
                fun checkTransferReturn(checkTransferReturn: JsonField<CheckTransferReturn>) =
                    apply {
                        this.checkTransferReturn = checkTransferReturn
                    }

                /**
                 * A Check Transfer Rejection object. This field will be present in the JSON
                 * response if and only if `category` is equal to `check_transfer_rejection`.
                 */
                fun checkTransferRejection(checkTransferRejection: CheckTransferRejection) =
                    checkTransferRejection(JsonField.of(checkTransferRejection))

                /**
                 * A Check Transfer Rejection object. This field will be present in the JSON
                 * response if and only if `category` is equal to `check_transfer_rejection`.
                 */
                @JsonProperty("check_transfer_rejection")
                @ExcludeMissing
                fun checkTransferRejection(
                    checkTransferRejection: JsonField<CheckTransferRejection>
                ) = apply { this.checkTransferRejection = checkTransferRejection }

                /**
                 * A Check Transfer Stop Payment Request object. This field will be present in the
                 * JSON response if and only if `category` is equal to
                 * `check_transfer_stop_payment_request`.
                 */
                fun checkTransferStopPaymentRequest(
                    checkTransferStopPaymentRequest: CheckTransferStopPaymentRequest
                ) = checkTransferStopPaymentRequest(JsonField.of(checkTransferStopPaymentRequest))

                /**
                 * A Check Transfer Stop Payment Request object. This field will be present in the
                 * JSON response if and only if `category` is equal to
                 * `check_transfer_stop_payment_request`.
                 */
                @JsonProperty("check_transfer_stop_payment_request")
                @ExcludeMissing
                fun checkTransferStopPaymentRequest(
                    checkTransferStopPaymentRequest: JsonField<CheckTransferStopPaymentRequest>
                ) = apply { this.checkTransferStopPaymentRequest = checkTransferStopPaymentRequest }

                /**
                 * A Dispute Resolution object. This field will be present in the JSON response if
                 * and only if `category` is equal to `dispute_resolution`.
                 */
                fun disputeResolution(disputeResolution: DisputeResolution) =
                    disputeResolution(JsonField.of(disputeResolution))

                /**
                 * A Dispute Resolution object. This field will be present in the JSON response if
                 * and only if `category` is equal to `dispute_resolution`.
                 */
                @JsonProperty("dispute_resolution")
                @ExcludeMissing
                fun disputeResolution(disputeResolution: JsonField<DisputeResolution>) = apply {
                    this.disputeResolution = disputeResolution
                }

                /**
                 * A Empyreal Cash Deposit object. This field will be present in the JSON response
                 * if and only if `category` is equal to `empyreal_cash_deposit`.
                 */
                fun empyrealCashDeposit(empyrealCashDeposit: EmpyrealCashDeposit) =
                    empyrealCashDeposit(JsonField.of(empyrealCashDeposit))

                /**
                 * A Empyreal Cash Deposit object. This field will be present in the JSON response
                 * if and only if `category` is equal to `empyreal_cash_deposit`.
                 */
                @JsonProperty("empyreal_cash_deposit")
                @ExcludeMissing
                fun empyrealCashDeposit(empyrealCashDeposit: JsonField<EmpyrealCashDeposit>) =
                    apply {
                        this.empyrealCashDeposit = empyrealCashDeposit
                    }

                /**
                 * A Fee Payment object. This field will be present in the JSON response if and only
                 * if `category` is equal to `fee_payment`.
                 */
                fun feePayment(feePayment: FeePayment) = feePayment(JsonField.of(feePayment))

                /**
                 * A Fee Payment object. This field will be present in the JSON response if and only
                 * if `category` is equal to `fee_payment`.
                 */
                @JsonProperty("fee_payment")
                @ExcludeMissing
                fun feePayment(feePayment: JsonField<FeePayment>) = apply {
                    this.feePayment = feePayment
                }

                /**
                 * A Inbound ACH Transfer object. This field will be present in the JSON response if
                 * and only if `category` is equal to `inbound_ach_transfer`.
                 */
                fun inboundAchTransfer(inboundAchTransfer: InboundAchTransfer) =
                    inboundAchTransfer(JsonField.of(inboundAchTransfer))

                /**
                 * A Inbound ACH Transfer object. This field will be present in the JSON response if
                 * and only if `category` is equal to `inbound_ach_transfer`.
                 */
                @JsonProperty("inbound_ach_transfer")
                @ExcludeMissing
                fun inboundAchTransfer(inboundAchTransfer: JsonField<InboundAchTransfer>) = apply {
                    this.inboundAchTransfer = inboundAchTransfer
                }

                /**
                 * A Inbound Check object. This field will be present in the JSON response if and
                 * only if `category` is equal to `inbound_check`.
                 */
                fun inboundCheck(inboundCheck: InboundCheck) =
                    inboundCheck(JsonField.of(inboundCheck))

                /**
                 * A Inbound Check object. This field will be present in the JSON response if and
                 * only if `category` is equal to `inbound_check`.
                 */
                @JsonProperty("inbound_check")
                @ExcludeMissing
                fun inboundCheck(inboundCheck: JsonField<InboundCheck>) = apply {
                    this.inboundCheck = inboundCheck
                }

                /**
                 * A Inbound International ACH Transfer object. This field will be present in the
                 * JSON response if and only if `category` is equal to
                 * `inbound_international_ach_transfer`.
                 */
                fun inboundInternationalAchTransfer(
                    inboundInternationalAchTransfer: InboundInternationalAchTransfer
                ) = inboundInternationalAchTransfer(JsonField.of(inboundInternationalAchTransfer))

                /**
                 * A Inbound International ACH Transfer object. This field will be present in the
                 * JSON response if and only if `category` is equal to
                 * `inbound_international_ach_transfer`.
                 */
                @JsonProperty("inbound_international_ach_transfer")
                @ExcludeMissing
                fun inboundInternationalAchTransfer(
                    inboundInternationalAchTransfer: JsonField<InboundInternationalAchTransfer>
                ) = apply { this.inboundInternationalAchTransfer = inboundInternationalAchTransfer }

                /**
                 * A Inbound Real Time Payments Transfer Confirmation object. This field will be
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
                 * A Inbound Real Time Payments Transfer Confirmation object. This field will be
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
                 * A Inbound Wire Drawdown Payment Reversal object. This field will be present in
                 * the JSON response if and only if `category` is equal to
                 * `inbound_wire_drawdown_payment_reversal`.
                 */
                fun inboundWireDrawdownPaymentReversal(
                    inboundWireDrawdownPaymentReversal: InboundWireDrawdownPaymentReversal
                ) =
                    inboundWireDrawdownPaymentReversal(
                        JsonField.of(inboundWireDrawdownPaymentReversal)
                    )

                /**
                 * A Inbound Wire Drawdown Payment Reversal object. This field will be present in
                 * the JSON response if and only if `category` is equal to
                 * `inbound_wire_drawdown_payment_reversal`.
                 */
                @JsonProperty("inbound_wire_drawdown_payment_reversal")
                @ExcludeMissing
                fun inboundWireDrawdownPaymentReversal(
                    inboundWireDrawdownPaymentReversal:
                        JsonField<InboundWireDrawdownPaymentReversal>
                ) = apply {
                    this.inboundWireDrawdownPaymentReversal = inboundWireDrawdownPaymentReversal
                }

                /**
                 * A Inbound Wire Drawdown Payment object. This field will be present in the JSON
                 * response if and only if `category` is equal to `inbound_wire_drawdown_payment`.
                 */
                fun inboundWireDrawdownPayment(
                    inboundWireDrawdownPayment: InboundWireDrawdownPayment
                ) = inboundWireDrawdownPayment(JsonField.of(inboundWireDrawdownPayment))

                /**
                 * A Inbound Wire Drawdown Payment object. This field will be present in the JSON
                 * response if and only if `category` is equal to `inbound_wire_drawdown_payment`.
                 */
                @JsonProperty("inbound_wire_drawdown_payment")
                @ExcludeMissing
                fun inboundWireDrawdownPayment(
                    inboundWireDrawdownPayment: JsonField<InboundWireDrawdownPayment>
                ) = apply { this.inboundWireDrawdownPayment = inboundWireDrawdownPayment }

                /**
                 * A Inbound Wire Reversal object. This field will be present in the JSON response
                 * if and only if `category` is equal to `inbound_wire_reversal`.
                 */
                fun inboundWireReversal(inboundWireReversal: InboundWireReversal) =
                    inboundWireReversal(JsonField.of(inboundWireReversal))

                /**
                 * A Inbound Wire Reversal object. This field will be present in the JSON response
                 * if and only if `category` is equal to `inbound_wire_reversal`.
                 */
                @JsonProperty("inbound_wire_reversal")
                @ExcludeMissing
                fun inboundWireReversal(inboundWireReversal: JsonField<InboundWireReversal>) =
                    apply {
                        this.inboundWireReversal = inboundWireReversal
                    }

                /**
                 * A Inbound Wire Transfer object. This field will be present in the JSON response
                 * if and only if `category` is equal to `inbound_wire_transfer`.
                 */
                fun inboundWireTransfer(inboundWireTransfer: InboundWireTransfer) =
                    inboundWireTransfer(JsonField.of(inboundWireTransfer))

                /**
                 * A Inbound Wire Transfer object. This field will be present in the JSON response
                 * if and only if `category` is equal to `inbound_wire_transfer`.
                 */
                @JsonProperty("inbound_wire_transfer")
                @ExcludeMissing
                fun inboundWireTransfer(inboundWireTransfer: JsonField<InboundWireTransfer>) =
                    apply {
                        this.inboundWireTransfer = inboundWireTransfer
                    }

                /**
                 * A Interest Payment object. This field will be present in the JSON response if and
                 * only if `category` is equal to `interest_payment`.
                 */
                fun interestPayment(interestPayment: InterestPayment) =
                    interestPayment(JsonField.of(interestPayment))

                /**
                 * A Interest Payment object. This field will be present in the JSON response if and
                 * only if `category` is equal to `interest_payment`.
                 */
                @JsonProperty("interest_payment")
                @ExcludeMissing
                fun interestPayment(interestPayment: JsonField<InterestPayment>) = apply {
                    this.interestPayment = interestPayment
                }

                /**
                 * A Internal Source object. This field will be present in the JSON response if and
                 * only if `category` is equal to `internal_source`.
                 */
                fun internalSource(internalSource: InternalSource) =
                    internalSource(JsonField.of(internalSource))

                /**
                 * A Internal Source object. This field will be present in the JSON response if and
                 * only if `category` is equal to `internal_source`.
                 */
                @JsonProperty("internal_source")
                @ExcludeMissing
                fun internalSource(internalSource: JsonField<InternalSource>) = apply {
                    this.internalSource = internalSource
                }

                /**
                 * A Deprecated Card Refund object. This field will be present in the JSON response
                 * if and only if `category` is equal to `card_route_refund`.
                 */
                fun cardRouteRefund(cardRouteRefund: CardRouteRefund) =
                    cardRouteRefund(JsonField.of(cardRouteRefund))

                /**
                 * A Deprecated Card Refund object. This field will be present in the JSON response
                 * if and only if `category` is equal to `card_route_refund`.
                 */
                @JsonProperty("card_route_refund")
                @ExcludeMissing
                fun cardRouteRefund(cardRouteRefund: JsonField<CardRouteRefund>) = apply {
                    this.cardRouteRefund = cardRouteRefund
                }

                /**
                 * A Deprecated Card Settlement object. This field will be present in the JSON
                 * response if and only if `category` is equal to `card_route_settlement`.
                 */
                fun cardRouteSettlement(cardRouteSettlement: CardRouteSettlement) =
                    cardRouteSettlement(JsonField.of(cardRouteSettlement))

                /**
                 * A Deprecated Card Settlement object. This field will be present in the JSON
                 * response if and only if `category` is equal to `card_route_settlement`.
                 */
                @JsonProperty("card_route_settlement")
                @ExcludeMissing
                fun cardRouteSettlement(cardRouteSettlement: JsonField<CardRouteSettlement>) =
                    apply {
                        this.cardRouteSettlement = cardRouteSettlement
                    }

                /**
                 * A Real Time Payments Transfer Acknowledgement object. This field will be present
                 * in the JSON response if and only if `category` is equal to
                 * `real_time_payments_transfer_acknowledgement`.
                 */
                fun realTimePaymentsTransferAcknowledgement(
                    realTimePaymentsTransferAcknowledgement: RealTimePaymentsTransferAcknowledgement
                ) =
                    realTimePaymentsTransferAcknowledgement(
                        JsonField.of(realTimePaymentsTransferAcknowledgement)
                    )

                /**
                 * A Real Time Payments Transfer Acknowledgement object. This field will be present
                 * in the JSON response if and only if `category` is equal to
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
                 * A Sample Funds object. This field will be present in the JSON response if and
                 * only if `category` is equal to `sample_funds`.
                 */
                fun sampleFunds(sampleFunds: SampleFunds) = sampleFunds(JsonField.of(sampleFunds))

                /**
                 * A Sample Funds object. This field will be present in the JSON response if and
                 * only if `category` is equal to `sample_funds`.
                 */
                @JsonProperty("sample_funds")
                @ExcludeMissing
                fun sampleFunds(sampleFunds: JsonField<SampleFunds>) = apply {
                    this.sampleFunds = sampleFunds
                }

                /**
                 * A Wire Drawdown Payment Intention object. This field will be present in the JSON
                 * response if and only if `category` is equal to `wire_drawdown_payment_intention`.
                 */
                fun wireDrawdownPaymentIntention(
                    wireDrawdownPaymentIntention: WireDrawdownPaymentIntention
                ) = wireDrawdownPaymentIntention(JsonField.of(wireDrawdownPaymentIntention))

                /**
                 * A Wire Drawdown Payment Intention object. This field will be present in the JSON
                 * response if and only if `category` is equal to `wire_drawdown_payment_intention`.
                 */
                @JsonProperty("wire_drawdown_payment_intention")
                @ExcludeMissing
                fun wireDrawdownPaymentIntention(
                    wireDrawdownPaymentIntention: JsonField<WireDrawdownPaymentIntention>
                ) = apply { this.wireDrawdownPaymentIntention = wireDrawdownPaymentIntention }

                /**
                 * A Wire Drawdown Payment Rejection object. This field will be present in the JSON
                 * response if and only if `category` is equal to `wire_drawdown_payment_rejection`.
                 */
                fun wireDrawdownPaymentRejection(
                    wireDrawdownPaymentRejection: WireDrawdownPaymentRejection
                ) = wireDrawdownPaymentRejection(JsonField.of(wireDrawdownPaymentRejection))

                /**
                 * A Wire Drawdown Payment Rejection object. This field will be present in the JSON
                 * response if and only if `category` is equal to `wire_drawdown_payment_rejection`.
                 */
                @JsonProperty("wire_drawdown_payment_rejection")
                @ExcludeMissing
                fun wireDrawdownPaymentRejection(
                    wireDrawdownPaymentRejection: JsonField<WireDrawdownPaymentRejection>
                ) = apply { this.wireDrawdownPaymentRejection = wireDrawdownPaymentRejection }

                /**
                 * A Wire Transfer Intention object. This field will be present in the JSON response
                 * if and only if `category` is equal to `wire_transfer_intention`.
                 */
                fun wireTransferIntention(wireTransferIntention: WireTransferIntention) =
                    wireTransferIntention(JsonField.of(wireTransferIntention))

                /**
                 * A Wire Transfer Intention object. This field will be present in the JSON response
                 * if and only if `category` is equal to `wire_transfer_intention`.
                 */
                @JsonProperty("wire_transfer_intention")
                @ExcludeMissing
                fun wireTransferIntention(wireTransferIntention: JsonField<WireTransferIntention>) =
                    apply {
                        this.wireTransferIntention = wireTransferIntention
                    }

                /**
                 * A Wire Transfer Rejection object. This field will be present in the JSON response
                 * if and only if `category` is equal to `wire_transfer_rejection`.
                 */
                fun wireTransferRejection(wireTransferRejection: WireTransferRejection) =
                    wireTransferRejection(JsonField.of(wireTransferRejection))

                /**
                 * A Wire Transfer Rejection object. This field will be present in the JSON response
                 * if and only if `category` is equal to `wire_transfer_rejection`.
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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Source =
                    Source(
                        category,
                        accountTransferIntention,
                        achCheckConversionReturn,
                        achCheckConversion,
                        achTransferIntention,
                        achTransferRejection,
                        achTransferReturn,
                        cardDisputeAcceptance,
                        cardRefund,
                        cardSettlement,
                        cardRevenuePayment,
                        checkDepositAcceptance,
                        checkDepositReturn,
                        checkTransferIntention,
                        checkTransferReturn,
                        checkTransferRejection,
                        checkTransferStopPaymentRequest,
                        disputeResolution,
                        empyrealCashDeposit,
                        feePayment,
                        inboundAchTransfer,
                        inboundCheck,
                        inboundInternationalAchTransfer,
                        inboundRealTimePaymentsTransferConfirmation,
                        inboundWireDrawdownPaymentReversal,
                        inboundWireDrawdownPayment,
                        inboundWireReversal,
                        inboundWireTransfer,
                        interestPayment,
                        internalSource,
                        cardRouteRefund,
                        cardRouteSettlement,
                        realTimePaymentsTransferAcknowledgement,
                        sampleFunds,
                        wireDrawdownPaymentIntention,
                        wireDrawdownPaymentRejection,
                        wireTransferIntention,
                        wireTransferRejection,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class Category
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) {

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
                    val ACH_CHECK_CONVERSION_RETURN =
                        Category(JsonField.of("ach_check_conversion_return"))

                    @JvmField
                    val ACH_CHECK_CONVERSION = Category(JsonField.of("ach_check_conversion"))

                    @JvmField
                    val ACH_TRANSFER_INTENTION = Category(JsonField.of("ach_transfer_intention"))

                    @JvmField
                    val ACH_TRANSFER_REJECTION = Category(JsonField.of("ach_transfer_rejection"))

                    @JvmField
                    val ACH_TRANSFER_RETURN = Category(JsonField.of("ach_transfer_return"))

                    @JvmField
                    val CARD_DISPUTE_ACCEPTANCE = Category(JsonField.of("card_dispute_acceptance"))

                    @JvmField val CARD_REFUND = Category(JsonField.of("card_refund"))

                    @JvmField val CARD_SETTLEMENT = Category(JsonField.of("card_settlement"))

                    @JvmField
                    val CARD_REVENUE_PAYMENT = Category(JsonField.of("card_revenue_payment"))

                    @JvmField
                    val CHECK_DEPOSIT_ACCEPTANCE =
                        Category(JsonField.of("check_deposit_acceptance"))

                    @JvmField
                    val CHECK_DEPOSIT_RETURN = Category(JsonField.of("check_deposit_return"))

                    @JvmField
                    val CHECK_TRANSFER_INTENTION =
                        Category(JsonField.of("check_transfer_intention"))

                    @JvmField
                    val CHECK_TRANSFER_RETURN = Category(JsonField.of("check_transfer_return"))

                    @JvmField
                    val CHECK_TRANSFER_REJECTION =
                        Category(JsonField.of("check_transfer_rejection"))

                    @JvmField
                    val CHECK_TRANSFER_STOP_PAYMENT_REQUEST =
                        Category(JsonField.of("check_transfer_stop_payment_request"))

                    @JvmField val DISPUTE_RESOLUTION = Category(JsonField.of("dispute_resolution"))

                    @JvmField
                    val EMPYREAL_CASH_DEPOSIT = Category(JsonField.of("empyreal_cash_deposit"))

                    @JvmField val FEE_PAYMENT = Category(JsonField.of("fee_payment"))

                    @JvmField
                    val INBOUND_ACH_TRANSFER = Category(JsonField.of("inbound_ach_transfer"))

                    @JvmField
                    val INBOUND_ACH_TRANSFER_RETURN_INTENTION =
                        Category(JsonField.of("inbound_ach_transfer_return_intention"))

                    @JvmField val INBOUND_CHECK = Category(JsonField.of("inbound_check"))

                    @JvmField
                    val INBOUND_INTERNATIONAL_ACH_TRANSFER =
                        Category(JsonField.of("inbound_international_ach_transfer"))

                    @JvmField
                    val INBOUND_REAL_TIME_PAYMENTS_TRANSFER_CONFIRMATION =
                        Category(JsonField.of("inbound_real_time_payments_transfer_confirmation"))

                    @JvmField
                    val INBOUND_WIRE_DRAWDOWN_PAYMENT_REVERSAL =
                        Category(JsonField.of("inbound_wire_drawdown_payment_reversal"))

                    @JvmField
                    val INBOUND_WIRE_DRAWDOWN_PAYMENT =
                        Category(JsonField.of("inbound_wire_drawdown_payment"))

                    @JvmField
                    val INBOUND_WIRE_REVERSAL = Category(JsonField.of("inbound_wire_reversal"))

                    @JvmField
                    val INBOUND_WIRE_TRANSFER = Category(JsonField.of("inbound_wire_transfer"))

                    @JvmField val INTEREST_PAYMENT = Category(JsonField.of("interest_payment"))

                    @JvmField
                    val INTERNAL_GENERAL_LEDGER_TRANSACTION =
                        Category(JsonField.of("internal_general_ledger_transaction"))

                    @JvmField val INTERNAL_SOURCE = Category(JsonField.of("internal_source"))

                    @JvmField val CARD_ROUTE_REFUND = Category(JsonField.of("card_route_refund"))

                    @JvmField
                    val CARD_ROUTE_SETTLEMENT = Category(JsonField.of("card_route_settlement"))

                    @JvmField
                    val REAL_TIME_PAYMENTS_TRANSFER_ACKNOWLEDGEMENT =
                        Category(JsonField.of("real_time_payments_transfer_acknowledgement"))

                    @JvmField val SAMPLE_FUNDS = Category(JsonField.of("sample_funds"))

                    @JvmField
                    val WIRE_DRAWDOWN_PAYMENT_INTENTION =
                        Category(JsonField.of("wire_drawdown_payment_intention"))

                    @JvmField
                    val WIRE_DRAWDOWN_PAYMENT_REJECTION =
                        Category(JsonField.of("wire_drawdown_payment_rejection"))

                    @JvmField
                    val WIRE_TRANSFER_INTENTION = Category(JsonField.of("wire_transfer_intention"))

                    @JvmField
                    val WIRE_TRANSFER_REJECTION = Category(JsonField.of("wire_transfer_rejection"))

                    @JvmField val OTHER = Category(JsonField.of("other"))

                    @JvmStatic fun of(value: String) = Category(JsonField.of(value))
                }

                enum class Known {
                    ACCOUNT_TRANSFER_INTENTION,
                    ACH_CHECK_CONVERSION_RETURN,
                    ACH_CHECK_CONVERSION,
                    ACH_TRANSFER_INTENTION,
                    ACH_TRANSFER_REJECTION,
                    ACH_TRANSFER_RETURN,
                    CARD_DISPUTE_ACCEPTANCE,
                    CARD_REFUND,
                    CARD_SETTLEMENT,
                    CARD_REVENUE_PAYMENT,
                    CHECK_DEPOSIT_ACCEPTANCE,
                    CHECK_DEPOSIT_RETURN,
                    CHECK_TRANSFER_INTENTION,
                    CHECK_TRANSFER_RETURN,
                    CHECK_TRANSFER_REJECTION,
                    CHECK_TRANSFER_STOP_PAYMENT_REQUEST,
                    DISPUTE_RESOLUTION,
                    EMPYREAL_CASH_DEPOSIT,
                    FEE_PAYMENT,
                    INBOUND_ACH_TRANSFER,
                    INBOUND_ACH_TRANSFER_RETURN_INTENTION,
                    INBOUND_CHECK,
                    INBOUND_INTERNATIONAL_ACH_TRANSFER,
                    INBOUND_REAL_TIME_PAYMENTS_TRANSFER_CONFIRMATION,
                    INBOUND_WIRE_DRAWDOWN_PAYMENT_REVERSAL,
                    INBOUND_WIRE_DRAWDOWN_PAYMENT,
                    INBOUND_WIRE_REVERSAL,
                    INBOUND_WIRE_TRANSFER,
                    INTEREST_PAYMENT,
                    INTERNAL_GENERAL_LEDGER_TRANSACTION,
                    INTERNAL_SOURCE,
                    CARD_ROUTE_REFUND,
                    CARD_ROUTE_SETTLEMENT,
                    REAL_TIME_PAYMENTS_TRANSFER_ACKNOWLEDGEMENT,
                    SAMPLE_FUNDS,
                    WIRE_DRAWDOWN_PAYMENT_INTENTION,
                    WIRE_DRAWDOWN_PAYMENT_REJECTION,
                    WIRE_TRANSFER_INTENTION,
                    WIRE_TRANSFER_REJECTION,
                    OTHER,
                }

                enum class Value {
                    ACCOUNT_TRANSFER_INTENTION,
                    ACH_CHECK_CONVERSION_RETURN,
                    ACH_CHECK_CONVERSION,
                    ACH_TRANSFER_INTENTION,
                    ACH_TRANSFER_REJECTION,
                    ACH_TRANSFER_RETURN,
                    CARD_DISPUTE_ACCEPTANCE,
                    CARD_REFUND,
                    CARD_SETTLEMENT,
                    CARD_REVENUE_PAYMENT,
                    CHECK_DEPOSIT_ACCEPTANCE,
                    CHECK_DEPOSIT_RETURN,
                    CHECK_TRANSFER_INTENTION,
                    CHECK_TRANSFER_RETURN,
                    CHECK_TRANSFER_REJECTION,
                    CHECK_TRANSFER_STOP_PAYMENT_REQUEST,
                    DISPUTE_RESOLUTION,
                    EMPYREAL_CASH_DEPOSIT,
                    FEE_PAYMENT,
                    INBOUND_ACH_TRANSFER,
                    INBOUND_ACH_TRANSFER_RETURN_INTENTION,
                    INBOUND_CHECK,
                    INBOUND_INTERNATIONAL_ACH_TRANSFER,
                    INBOUND_REAL_TIME_PAYMENTS_TRANSFER_CONFIRMATION,
                    INBOUND_WIRE_DRAWDOWN_PAYMENT_REVERSAL,
                    INBOUND_WIRE_DRAWDOWN_PAYMENT,
                    INBOUND_WIRE_REVERSAL,
                    INBOUND_WIRE_TRANSFER,
                    INTEREST_PAYMENT,
                    INTERNAL_GENERAL_LEDGER_TRANSACTION,
                    INTERNAL_SOURCE,
                    CARD_ROUTE_REFUND,
                    CARD_ROUTE_SETTLEMENT,
                    REAL_TIME_PAYMENTS_TRANSFER_ACKNOWLEDGEMENT,
                    SAMPLE_FUNDS,
                    WIRE_DRAWDOWN_PAYMENT_INTENTION,
                    WIRE_DRAWDOWN_PAYMENT_REJECTION,
                    WIRE_TRANSFER_INTENTION,
                    WIRE_TRANSFER_REJECTION,
                    OTHER,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        ACCOUNT_TRANSFER_INTENTION -> Value.ACCOUNT_TRANSFER_INTENTION
                        ACH_CHECK_CONVERSION_RETURN -> Value.ACH_CHECK_CONVERSION_RETURN
                        ACH_CHECK_CONVERSION -> Value.ACH_CHECK_CONVERSION
                        ACH_TRANSFER_INTENTION -> Value.ACH_TRANSFER_INTENTION
                        ACH_TRANSFER_REJECTION -> Value.ACH_TRANSFER_REJECTION
                        ACH_TRANSFER_RETURN -> Value.ACH_TRANSFER_RETURN
                        CARD_DISPUTE_ACCEPTANCE -> Value.CARD_DISPUTE_ACCEPTANCE
                        CARD_REFUND -> Value.CARD_REFUND
                        CARD_SETTLEMENT -> Value.CARD_SETTLEMENT
                        CARD_REVENUE_PAYMENT -> Value.CARD_REVENUE_PAYMENT
                        CHECK_DEPOSIT_ACCEPTANCE -> Value.CHECK_DEPOSIT_ACCEPTANCE
                        CHECK_DEPOSIT_RETURN -> Value.CHECK_DEPOSIT_RETURN
                        CHECK_TRANSFER_INTENTION -> Value.CHECK_TRANSFER_INTENTION
                        CHECK_TRANSFER_RETURN -> Value.CHECK_TRANSFER_RETURN
                        CHECK_TRANSFER_REJECTION -> Value.CHECK_TRANSFER_REJECTION
                        CHECK_TRANSFER_STOP_PAYMENT_REQUEST ->
                            Value.CHECK_TRANSFER_STOP_PAYMENT_REQUEST
                        DISPUTE_RESOLUTION -> Value.DISPUTE_RESOLUTION
                        EMPYREAL_CASH_DEPOSIT -> Value.EMPYREAL_CASH_DEPOSIT
                        FEE_PAYMENT -> Value.FEE_PAYMENT
                        INBOUND_ACH_TRANSFER -> Value.INBOUND_ACH_TRANSFER
                        INBOUND_ACH_TRANSFER_RETURN_INTENTION ->
                            Value.INBOUND_ACH_TRANSFER_RETURN_INTENTION
                        INBOUND_CHECK -> Value.INBOUND_CHECK
                        INBOUND_INTERNATIONAL_ACH_TRANSFER ->
                            Value.INBOUND_INTERNATIONAL_ACH_TRANSFER
                        INBOUND_REAL_TIME_PAYMENTS_TRANSFER_CONFIRMATION ->
                            Value.INBOUND_REAL_TIME_PAYMENTS_TRANSFER_CONFIRMATION
                        INBOUND_WIRE_DRAWDOWN_PAYMENT_REVERSAL ->
                            Value.INBOUND_WIRE_DRAWDOWN_PAYMENT_REVERSAL
                        INBOUND_WIRE_DRAWDOWN_PAYMENT -> Value.INBOUND_WIRE_DRAWDOWN_PAYMENT
                        INBOUND_WIRE_REVERSAL -> Value.INBOUND_WIRE_REVERSAL
                        INBOUND_WIRE_TRANSFER -> Value.INBOUND_WIRE_TRANSFER
                        INTEREST_PAYMENT -> Value.INTEREST_PAYMENT
                        INTERNAL_GENERAL_LEDGER_TRANSACTION ->
                            Value.INTERNAL_GENERAL_LEDGER_TRANSACTION
                        INTERNAL_SOURCE -> Value.INTERNAL_SOURCE
                        CARD_ROUTE_REFUND -> Value.CARD_ROUTE_REFUND
                        CARD_ROUTE_SETTLEMENT -> Value.CARD_ROUTE_SETTLEMENT
                        REAL_TIME_PAYMENTS_TRANSFER_ACKNOWLEDGEMENT ->
                            Value.REAL_TIME_PAYMENTS_TRANSFER_ACKNOWLEDGEMENT
                        SAMPLE_FUNDS -> Value.SAMPLE_FUNDS
                        WIRE_DRAWDOWN_PAYMENT_INTENTION -> Value.WIRE_DRAWDOWN_PAYMENT_INTENTION
                        WIRE_DRAWDOWN_PAYMENT_REJECTION -> Value.WIRE_DRAWDOWN_PAYMENT_REJECTION
                        WIRE_TRANSFER_INTENTION -> Value.WIRE_TRANSFER_INTENTION
                        WIRE_TRANSFER_REJECTION -> Value.WIRE_TRANSFER_REJECTION
                        OTHER -> Value.OTHER
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        ACCOUNT_TRANSFER_INTENTION -> Known.ACCOUNT_TRANSFER_INTENTION
                        ACH_CHECK_CONVERSION_RETURN -> Known.ACH_CHECK_CONVERSION_RETURN
                        ACH_CHECK_CONVERSION -> Known.ACH_CHECK_CONVERSION
                        ACH_TRANSFER_INTENTION -> Known.ACH_TRANSFER_INTENTION
                        ACH_TRANSFER_REJECTION -> Known.ACH_TRANSFER_REJECTION
                        ACH_TRANSFER_RETURN -> Known.ACH_TRANSFER_RETURN
                        CARD_DISPUTE_ACCEPTANCE -> Known.CARD_DISPUTE_ACCEPTANCE
                        CARD_REFUND -> Known.CARD_REFUND
                        CARD_SETTLEMENT -> Known.CARD_SETTLEMENT
                        CARD_REVENUE_PAYMENT -> Known.CARD_REVENUE_PAYMENT
                        CHECK_DEPOSIT_ACCEPTANCE -> Known.CHECK_DEPOSIT_ACCEPTANCE
                        CHECK_DEPOSIT_RETURN -> Known.CHECK_DEPOSIT_RETURN
                        CHECK_TRANSFER_INTENTION -> Known.CHECK_TRANSFER_INTENTION
                        CHECK_TRANSFER_RETURN -> Known.CHECK_TRANSFER_RETURN
                        CHECK_TRANSFER_REJECTION -> Known.CHECK_TRANSFER_REJECTION
                        CHECK_TRANSFER_STOP_PAYMENT_REQUEST ->
                            Known.CHECK_TRANSFER_STOP_PAYMENT_REQUEST
                        DISPUTE_RESOLUTION -> Known.DISPUTE_RESOLUTION
                        EMPYREAL_CASH_DEPOSIT -> Known.EMPYREAL_CASH_DEPOSIT
                        FEE_PAYMENT -> Known.FEE_PAYMENT
                        INBOUND_ACH_TRANSFER -> Known.INBOUND_ACH_TRANSFER
                        INBOUND_ACH_TRANSFER_RETURN_INTENTION ->
                            Known.INBOUND_ACH_TRANSFER_RETURN_INTENTION
                        INBOUND_CHECK -> Known.INBOUND_CHECK
                        INBOUND_INTERNATIONAL_ACH_TRANSFER ->
                            Known.INBOUND_INTERNATIONAL_ACH_TRANSFER
                        INBOUND_REAL_TIME_PAYMENTS_TRANSFER_CONFIRMATION ->
                            Known.INBOUND_REAL_TIME_PAYMENTS_TRANSFER_CONFIRMATION
                        INBOUND_WIRE_DRAWDOWN_PAYMENT_REVERSAL ->
                            Known.INBOUND_WIRE_DRAWDOWN_PAYMENT_REVERSAL
                        INBOUND_WIRE_DRAWDOWN_PAYMENT -> Known.INBOUND_WIRE_DRAWDOWN_PAYMENT
                        INBOUND_WIRE_REVERSAL -> Known.INBOUND_WIRE_REVERSAL
                        INBOUND_WIRE_TRANSFER -> Known.INBOUND_WIRE_TRANSFER
                        INTEREST_PAYMENT -> Known.INTEREST_PAYMENT
                        INTERNAL_GENERAL_LEDGER_TRANSACTION ->
                            Known.INTERNAL_GENERAL_LEDGER_TRANSACTION
                        INTERNAL_SOURCE -> Known.INTERNAL_SOURCE
                        CARD_ROUTE_REFUND -> Known.CARD_ROUTE_REFUND
                        CARD_ROUTE_SETTLEMENT -> Known.CARD_ROUTE_SETTLEMENT
                        REAL_TIME_PAYMENTS_TRANSFER_ACKNOWLEDGEMENT ->
                            Known.REAL_TIME_PAYMENTS_TRANSFER_ACKNOWLEDGEMENT
                        SAMPLE_FUNDS -> Known.SAMPLE_FUNDS
                        WIRE_DRAWDOWN_PAYMENT_INTENTION -> Known.WIRE_DRAWDOWN_PAYMENT_INTENTION
                        WIRE_DRAWDOWN_PAYMENT_REJECTION -> Known.WIRE_DRAWDOWN_PAYMENT_REJECTION
                        WIRE_TRANSFER_INTENTION -> Known.WIRE_TRANSFER_INTENTION
                        WIRE_TRANSFER_REJECTION -> Known.WIRE_TRANSFER_REJECTION
                        OTHER -> Known.OTHER
                        else -> throw IncreaseInvalidDataException("Unknown Category: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            /**
             * A Account Transfer Intention object. This field will be present in the JSON response
             * if and only if `category` is equal to `account_transfer_intention`.
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
                 * The pending amount in the minor unit of the transaction's currency. For dollars,
                 * for example, this is cents.
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
                 * The pending amount in the minor unit of the transaction's currency. For dollars,
                 * for example, this is cents.
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

                fun validate() = apply {
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
                     * The pending amount in the minor unit of the transaction's currency. For
                     * dollars, for example, this is cents.
                     */
                    fun amount(amount: Long) = amount(JsonField.of(amount))

                    /**
                     * The pending amount in the minor unit of the transaction's currency. For
                     * dollars, for example, this is cents.
                     */
                    @JsonProperty("amount")
                    @ExcludeMissing
                    fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                     * destination account currency.
                     */
                    fun currency(currency: Currency) = currency(JsonField.of(currency))

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                     * destination account currency.
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

                    /**
                     * The identifier of the Account Transfer that led to this Pending Transaction.
                     */
                    fun transferId(transferId: String) = transferId(JsonField.of(transferId))

                    /**
                     * The identifier of the Account Transfer that led to this Pending Transaction.
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
                ) {

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

            /**
             * A ACH Check Conversion Return object. This field will be present in the JSON response
             * if and only if `category` is equal to `ach_check_conversion_return`.
             */
            @JsonDeserialize(builder = AchCheckConversionReturn.Builder::class)
            @NoAutoDetect
            class AchCheckConversionReturn
            private constructor(
                private val amount: JsonField<Long>,
                private val returnReasonCode: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /**
                 * The amount in the minor unit of the transaction's currency. For dollars, for
                 * example, this is cents.
                 */
                fun amount(): Long = amount.getRequired("amount")

                /** Why the transfer was returned. */
                fun returnReasonCode(): String = returnReasonCode.getRequired("return_reason_code")

                /**
                 * The amount in the minor unit of the transaction's currency. For dollars, for
                 * example, this is cents.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

                /** Why the transfer was returned. */
                @JsonProperty("return_reason_code")
                @ExcludeMissing
                fun _returnReasonCode() = returnReasonCode

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate() = apply {
                    if (!validated) {
                        amount()
                        returnReasonCode()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is AchCheckConversionReturn &&
                        this.amount == other.amount &&
                        this.returnReasonCode == other.returnReasonCode &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                amount,
                                returnReasonCode,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "AchCheckConversionReturn{amount=$amount, returnReasonCode=$returnReasonCode, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var amount: JsonField<Long> = JsonMissing.of()
                    private var returnReasonCode: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(achCheckConversionReturn: AchCheckConversionReturn) = apply {
                        this.amount = achCheckConversionReturn.amount
                        this.returnReasonCode = achCheckConversionReturn.returnReasonCode
                        additionalProperties(achCheckConversionReturn.additionalProperties)
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

                    /** Why the transfer was returned. */
                    fun returnReasonCode(returnReasonCode: String) =
                        returnReasonCode(JsonField.of(returnReasonCode))

                    /** Why the transfer was returned. */
                    @JsonProperty("return_reason_code")
                    @ExcludeMissing
                    fun returnReasonCode(returnReasonCode: JsonField<String>) = apply {
                        this.returnReasonCode = returnReasonCode
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

                    fun build(): AchCheckConversionReturn =
                        AchCheckConversionReturn(
                            amount,
                            returnReasonCode,
                            additionalProperties.toUnmodifiable(),
                        )
                }
            }

            /**
             * A ACH Check Conversion object. This field will be present in the JSON response if and
             * only if `category` is equal to `ach_check_conversion`.
             */
            @JsonDeserialize(builder = AchCheckConversion.Builder::class)
            @NoAutoDetect
            class AchCheckConversion
            private constructor(
                private val amount: JsonField<Long>,
                private val fileId: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /**
                 * The amount in the minor unit of the transaction's currency. For dollars, for
                 * example, this is cents.
                 */
                fun amount(): Long = amount.getRequired("amount")

                /** The identifier of the File containing an image of the returned check. */
                fun fileId(): String = fileId.getRequired("file_id")

                /**
                 * The amount in the minor unit of the transaction's currency. For dollars, for
                 * example, this is cents.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

                /** The identifier of the File containing an image of the returned check. */
                @JsonProperty("file_id") @ExcludeMissing fun _fileId() = fileId

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate() = apply {
                    if (!validated) {
                        amount()
                        fileId()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is AchCheckConversion &&
                        this.amount == other.amount &&
                        this.fileId == other.fileId &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                amount,
                                fileId,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "AchCheckConversion{amount=$amount, fileId=$fileId, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var amount: JsonField<Long> = JsonMissing.of()
                    private var fileId: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(achCheckConversion: AchCheckConversion) = apply {
                        this.amount = achCheckConversion.amount
                        this.fileId = achCheckConversion.fileId
                        additionalProperties(achCheckConversion.additionalProperties)
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

                    /** The identifier of the File containing an image of the returned check. */
                    fun fileId(fileId: String) = fileId(JsonField.of(fileId))

                    /** The identifier of the File containing an image of the returned check. */
                    @JsonProperty("file_id")
                    @ExcludeMissing
                    fun fileId(fileId: JsonField<String>) = apply { this.fileId = fileId }

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

                    fun build(): AchCheckConversion =
                        AchCheckConversion(
                            amount,
                            fileId,
                            additionalProperties.toUnmodifiable(),
                        )
                }
            }

            /**
             * A ACH Transfer Intention object. This field will be present in the JSON response if
             * and only if `category` is equal to `ach_transfer_intention`.
             */
            @JsonDeserialize(builder = AchTransferIntention.Builder::class)
            @NoAutoDetect
            class AchTransferIntention
            private constructor(
                private val amount: JsonField<Long>,
                private val accountNumber: JsonField<String>,
                private val routingNumber: JsonField<String>,
                private val statementDescriptor: JsonField<String>,
                private val transferId: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /**
                 * The amount in the minor unit of the transaction's currency. For dollars, for
                 * example, this is cents.
                 */
                fun amount(): Long = amount.getRequired("amount")

                fun accountNumber(): String = accountNumber.getRequired("account_number")

                fun routingNumber(): String = routingNumber.getRequired("routing_number")

                fun statementDescriptor(): String =
                    statementDescriptor.getRequired("statement_descriptor")

                /** The identifier of the ACH Transfer that led to this Transaction. */
                fun transferId(): String = transferId.getRequired("transfer_id")

                /**
                 * The amount in the minor unit of the transaction's currency. For dollars, for
                 * example, this is cents.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

                @JsonProperty("account_number") @ExcludeMissing fun _accountNumber() = accountNumber

                @JsonProperty("routing_number") @ExcludeMissing fun _routingNumber() = routingNumber

                @JsonProperty("statement_descriptor")
                @ExcludeMissing
                fun _statementDescriptor() = statementDescriptor

                /** The identifier of the ACH Transfer that led to this Transaction. */
                @JsonProperty("transfer_id") @ExcludeMissing fun _transferId() = transferId

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate() = apply {
                    if (!validated) {
                        amount()
                        accountNumber()
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
                        this.amount == other.amount &&
                        this.accountNumber == other.accountNumber &&
                        this.routingNumber == other.routingNumber &&
                        this.statementDescriptor == other.statementDescriptor &&
                        this.transferId == other.transferId &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                amount,
                                accountNumber,
                                routingNumber,
                                statementDescriptor,
                                transferId,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "AchTransferIntention{amount=$amount, accountNumber=$accountNumber, routingNumber=$routingNumber, statementDescriptor=$statementDescriptor, transferId=$transferId, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var amount: JsonField<Long> = JsonMissing.of()
                    private var accountNumber: JsonField<String> = JsonMissing.of()
                    private var routingNumber: JsonField<String> = JsonMissing.of()
                    private var statementDescriptor: JsonField<String> = JsonMissing.of()
                    private var transferId: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(achTransferIntention: AchTransferIntention) = apply {
                        this.amount = achTransferIntention.amount
                        this.accountNumber = achTransferIntention.accountNumber
                        this.routingNumber = achTransferIntention.routingNumber
                        this.statementDescriptor = achTransferIntention.statementDescriptor
                        this.transferId = achTransferIntention.transferId
                        additionalProperties(achTransferIntention.additionalProperties)
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

                    fun accountNumber(accountNumber: String) =
                        accountNumber(JsonField.of(accountNumber))

                    @JsonProperty("account_number")
                    @ExcludeMissing
                    fun accountNumber(accountNumber: JsonField<String>) = apply {
                        this.accountNumber = accountNumber
                    }

                    fun routingNumber(routingNumber: String) =
                        routingNumber(JsonField.of(routingNumber))

                    @JsonProperty("routing_number")
                    @ExcludeMissing
                    fun routingNumber(routingNumber: JsonField<String>) = apply {
                        this.routingNumber = routingNumber
                    }

                    fun statementDescriptor(statementDescriptor: String) =
                        statementDescriptor(JsonField.of(statementDescriptor))

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
                            amount,
                            accountNumber,
                            routingNumber,
                            statementDescriptor,
                            transferId,
                            additionalProperties.toUnmodifiable(),
                        )
                }
            }

            /**
             * A ACH Transfer Rejection object. This field will be present in the JSON response if
             * and only if `category` is equal to `ach_transfer_rejection`.
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

                fun validate() = apply {
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
             * A ACH Transfer Return object. This field will be present in the JSON response if and
             * only if `category` is equal to `ach_transfer_return`.
             */
            @JsonDeserialize(builder = AchTransferReturn.Builder::class)
            @NoAutoDetect
            class AchTransferReturn
            private constructor(
                private val createdAt: JsonField<OffsetDateTime>,
                private val returnReasonCode: JsonField<ReturnReasonCode>,
                private val transferId: JsonField<String>,
                private val transactionId: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /**
                 * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
                 * transfer was created.
                 */
                fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

                /** Why the ACH Transfer was returned. */
                fun returnReasonCode(): ReturnReasonCode =
                    returnReasonCode.getRequired("return_reason_code")

                /** The identifier of the ACH Transfer associated with this return. */
                fun transferId(): String = transferId.getRequired("transfer_id")

                /** The identifier of the Tranasaction associated with this return. */
                fun transactionId(): String = transactionId.getRequired("transaction_id")

                /**
                 * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
                 * transfer was created.
                 */
                @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

                /** Why the ACH Transfer was returned. */
                @JsonProperty("return_reason_code")
                @ExcludeMissing
                fun _returnReasonCode() = returnReasonCode

                /** The identifier of the ACH Transfer associated with this return. */
                @JsonProperty("transfer_id") @ExcludeMissing fun _transferId() = transferId

                /** The identifier of the Tranasaction associated with this return. */
                @JsonProperty("transaction_id") @ExcludeMissing fun _transactionId() = transactionId

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate() = apply {
                    if (!validated) {
                        createdAt()
                        returnReasonCode()
                        transferId()
                        transactionId()
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
                        this.returnReasonCode == other.returnReasonCode &&
                        this.transferId == other.transferId &&
                        this.transactionId == other.transactionId &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                createdAt,
                                returnReasonCode,
                                transferId,
                                transactionId,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "AchTransferReturn{createdAt=$createdAt, returnReasonCode=$returnReasonCode, transferId=$transferId, transactionId=$transactionId, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
                    private var returnReasonCode: JsonField<ReturnReasonCode> = JsonMissing.of()
                    private var transferId: JsonField<String> = JsonMissing.of()
                    private var transactionId: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(achTransferReturn: AchTransferReturn) = apply {
                        this.createdAt = achTransferReturn.createdAt
                        this.returnReasonCode = achTransferReturn.returnReasonCode
                        this.transferId = achTransferReturn.transferId
                        this.transactionId = achTransferReturn.transactionId
                        additionalProperties(achTransferReturn.additionalProperties)
                    }

                    /**
                     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which
                     * the transfer was created.
                     */
                    fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

                    /**
                     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which
                     * the transfer was created.
                     */
                    @JsonProperty("created_at")
                    @ExcludeMissing
                    fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                        this.createdAt = createdAt
                    }

                    /** Why the ACH Transfer was returned. */
                    fun returnReasonCode(returnReasonCode: ReturnReasonCode) =
                        returnReasonCode(JsonField.of(returnReasonCode))

                    /** Why the ACH Transfer was returned. */
                    @JsonProperty("return_reason_code")
                    @ExcludeMissing
                    fun returnReasonCode(returnReasonCode: JsonField<ReturnReasonCode>) = apply {
                        this.returnReasonCode = returnReasonCode
                    }

                    /** The identifier of the ACH Transfer associated with this return. */
                    fun transferId(transferId: String) = transferId(JsonField.of(transferId))

                    /** The identifier of the ACH Transfer associated with this return. */
                    @JsonProperty("transfer_id")
                    @ExcludeMissing
                    fun transferId(transferId: JsonField<String>) = apply {
                        this.transferId = transferId
                    }

                    /** The identifier of the Tranasaction associated with this return. */
                    fun transactionId(transactionId: String) =
                        transactionId(JsonField.of(transactionId))

                    /** The identifier of the Tranasaction associated with this return. */
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

                    fun build(): AchTransferReturn =
                        AchTransferReturn(
                            createdAt,
                            returnReasonCode,
                            transferId,
                            transactionId,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class ReturnReasonCode
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

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

                        @JvmField
                        val ACCOUNT_CLOSED = ReturnReasonCode(JsonField.of("account_closed"))

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
                            ReturnReasonCode(
                                JsonField.of("corporate_customer_advised_not_authorized")
                            )

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
                        val AMOUNT_FIELD_ERROR =
                            ReturnReasonCode(JsonField.of("amount_field_error"))

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
                        val ADDENDA_ERROR = ReturnReasonCode(JsonField.of("addenda_error"))

                        @JvmField
                        val LIMITED_PARTICIPATION_DFI =
                            ReturnReasonCode(JsonField.of("limited_participation_dfi"))

                        @JvmField
                        val INCORRECTLY_CODED_OUTBOUND_INTERNATIONAL_PAYMENT =
                            ReturnReasonCode(
                                JsonField.of("incorrectly_coded_outbound_international_payment")
                            )

                        @JvmField val OTHER = ReturnReasonCode(JsonField.of("other"))

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
                        ADDENDA_ERROR,
                        LIMITED_PARTICIPATION_DFI,
                        INCORRECTLY_CODED_OUTBOUND_INTERNATIONAL_PAYMENT,
                        OTHER,
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
                        ADDENDA_ERROR,
                        LIMITED_PARTICIPATION_DFI,
                        INCORRECTLY_CODED_OUTBOUND_INTERNATIONAL_PAYMENT,
                        OTHER,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            INSUFFICIENT_FUND -> Value.INSUFFICIENT_FUND
                            NO_ACCOUNT -> Value.NO_ACCOUNT
                            ACCOUNT_CLOSED -> Value.ACCOUNT_CLOSED
                            INVALID_ACCOUNT_NUMBER_STRUCTURE ->
                                Value.INVALID_ACCOUNT_NUMBER_STRUCTURE
                            ACCOUNT_FROZEN_ENTRY_RETURNED_PER_OFAC_INSTRUCTION ->
                                Value.ACCOUNT_FROZEN_ENTRY_RETURNED_PER_OFAC_INSTRUCTION
                            CREDIT_ENTRY_REFUSED_BY_RECEIVER ->
                                Value.CREDIT_ENTRY_REFUSED_BY_RECEIVER
                            UNAUTHORIZED_DEBIT_TO_CONSUMER_ACCOUNT_USING_CORPORATE_SEC_CODE ->
                                Value
                                    .UNAUTHORIZED_DEBIT_TO_CONSUMER_ACCOUNT_USING_CORPORATE_SEC_CODE
                            CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED ->
                                Value.CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED
                            PAYMENT_STOPPED -> Value.PAYMENT_STOPPED
                            NON_TRANSACTION_ACCOUNT -> Value.NON_TRANSACTION_ACCOUNT
                            UNCOLLECTED_FUNDS -> Value.UNCOLLECTED_FUNDS
                            ROUTING_NUMBER_CHECK_DIGIT_ERROR ->
                                Value.ROUTING_NUMBER_CHECK_DIGIT_ERROR
                            CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE ->
                                Value
                                    .CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE
                            AMOUNT_FIELD_ERROR -> Value.AMOUNT_FIELD_ERROR
                            AUTHORIZATION_REVOKED_BY_CUSTOMER ->
                                Value.AUTHORIZATION_REVOKED_BY_CUSTOMER
                            INVALID_ACH_ROUTING_NUMBER -> Value.INVALID_ACH_ROUTING_NUMBER
                            FILE_RECORD_EDIT_CRITERIA -> Value.FILE_RECORD_EDIT_CRITERIA
                            ENR_INVALID_INDIVIDUAL_NAME -> Value.ENR_INVALID_INDIVIDUAL_NAME
                            RETURNED_PER_ODFI_REQUEST -> Value.RETURNED_PER_ODFI_REQUEST
                            ADDENDA_ERROR -> Value.ADDENDA_ERROR
                            LIMITED_PARTICIPATION_DFI -> Value.LIMITED_PARTICIPATION_DFI
                            INCORRECTLY_CODED_OUTBOUND_INTERNATIONAL_PAYMENT ->
                                Value.INCORRECTLY_CODED_OUTBOUND_INTERNATIONAL_PAYMENT
                            OTHER -> Value.OTHER
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            INSUFFICIENT_FUND -> Known.INSUFFICIENT_FUND
                            NO_ACCOUNT -> Known.NO_ACCOUNT
                            ACCOUNT_CLOSED -> Known.ACCOUNT_CLOSED
                            INVALID_ACCOUNT_NUMBER_STRUCTURE ->
                                Known.INVALID_ACCOUNT_NUMBER_STRUCTURE
                            ACCOUNT_FROZEN_ENTRY_RETURNED_PER_OFAC_INSTRUCTION ->
                                Known.ACCOUNT_FROZEN_ENTRY_RETURNED_PER_OFAC_INSTRUCTION
                            CREDIT_ENTRY_REFUSED_BY_RECEIVER ->
                                Known.CREDIT_ENTRY_REFUSED_BY_RECEIVER
                            UNAUTHORIZED_DEBIT_TO_CONSUMER_ACCOUNT_USING_CORPORATE_SEC_CODE ->
                                Known
                                    .UNAUTHORIZED_DEBIT_TO_CONSUMER_ACCOUNT_USING_CORPORATE_SEC_CODE
                            CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED ->
                                Known.CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED
                            PAYMENT_STOPPED -> Known.PAYMENT_STOPPED
                            NON_TRANSACTION_ACCOUNT -> Known.NON_TRANSACTION_ACCOUNT
                            UNCOLLECTED_FUNDS -> Known.UNCOLLECTED_FUNDS
                            ROUTING_NUMBER_CHECK_DIGIT_ERROR ->
                                Known.ROUTING_NUMBER_CHECK_DIGIT_ERROR
                            CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE ->
                                Known
                                    .CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE
                            AMOUNT_FIELD_ERROR -> Known.AMOUNT_FIELD_ERROR
                            AUTHORIZATION_REVOKED_BY_CUSTOMER ->
                                Known.AUTHORIZATION_REVOKED_BY_CUSTOMER
                            INVALID_ACH_ROUTING_NUMBER -> Known.INVALID_ACH_ROUTING_NUMBER
                            FILE_RECORD_EDIT_CRITERIA -> Known.FILE_RECORD_EDIT_CRITERIA
                            ENR_INVALID_INDIVIDUAL_NAME -> Known.ENR_INVALID_INDIVIDUAL_NAME
                            RETURNED_PER_ODFI_REQUEST -> Known.RETURNED_PER_ODFI_REQUEST
                            ADDENDA_ERROR -> Known.ADDENDA_ERROR
                            LIMITED_PARTICIPATION_DFI -> Known.LIMITED_PARTICIPATION_DFI
                            INCORRECTLY_CODED_OUTBOUND_INTERNATIONAL_PAYMENT ->
                                Known.INCORRECTLY_CODED_OUTBOUND_INTERNATIONAL_PAYMENT
                            OTHER -> Known.OTHER
                            else ->
                                throw IncreaseInvalidDataException(
                                    "Unknown ReturnReasonCode: $value"
                                )
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }
            }

            /**
             * A Card Dispute Acceptance object. This field will be present in the JSON response if
             * and only if `category` is equal to `card_dispute_acceptance`.
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
                 * The identifier of the Transaction that was created to return the disputed funds
                 * to your account.
                 */
                fun transactionId(): String = transactionId.getRequired("transaction_id")

                /**
                 * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
                 * Card Dispute was accepted.
                 */
                @JsonProperty("accepted_at") @ExcludeMissing fun _acceptedAt() = acceptedAt

                /** The identifier of the Card Dispute that was accepted. */
                @JsonProperty("card_dispute_id")
                @ExcludeMissing
                fun _cardDisputeId() = cardDisputeId

                /**
                 * The identifier of the Transaction that was created to return the disputed funds
                 * to your account.
                 */
                @JsonProperty("transaction_id") @ExcludeMissing fun _transactionId() = transactionId

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate() = apply {
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
                     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which
                     * the Card Dispute was accepted.
                     */
                    fun acceptedAt(acceptedAt: OffsetDateTime) =
                        acceptedAt(JsonField.of(acceptedAt))

                    /**
                     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which
                     * the Card Dispute was accepted.
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
                     * The identifier of the Transaction that was created to return the disputed
                     * funds to your account.
                     */
                    fun transactionId(transactionId: String) =
                        transactionId(JsonField.of(transactionId))

                    /**
                     * The identifier of the Transaction that was created to return the disputed
                     * funds to your account.
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
             * A Card Refund object. This field will be present in the JSON response if and only if
             * `category` is equal to `card_refund`.
             */
            @JsonDeserialize(builder = CardRefund.Builder::class)
            @NoAutoDetect
            class CardRefund
            private constructor(
                private val id: JsonField<String>,
                private val amount: JsonField<Long>,
                private val currency: JsonField<Currency>,
                private val merchantAcceptorId: JsonField<String>,
                private val merchantCity: JsonField<String>,
                private val merchantState: JsonField<String>,
                private val merchantCountry: JsonField<String>,
                private val merchantName: JsonField<String>,
                private val merchantCategoryCode: JsonField<String>,
                private val type: JsonField<Type>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /** The Card Refund identifier. */
                fun id(): String = id.getRequired("id")

                /**
                 * The pending amount in the minor unit of the transaction's currency. For dollars,
                 * for example, this is cents.
                 */
                fun amount(): Long = amount.getRequired("amount")

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
                 * currency.
                 */
                fun currency(): Currency = currency.getRequired("currency")

                /**
                 * The merchant identifier (commonly abbreviated as MID) of the merchant the card is
                 * transacting with.
                 */
                fun merchantAcceptorId(): Optional<String> =
                    Optional.ofNullable(merchantAcceptorId.getNullable("merchant_acceptor_id"))

                /** The city the merchant resides in. */
                fun merchantCity(): Optional<String> =
                    Optional.ofNullable(merchantCity.getNullable("merchant_city"))

                /** The state the merchant resides in. */
                fun merchantState(): Optional<String> =
                    Optional.ofNullable(merchantState.getNullable("merchant_state"))

                /** The country the merchant resides in. */
                fun merchantCountry(): String = merchantCountry.getRequired("merchant_country")

                /** The name of the merchant. */
                fun merchantName(): Optional<String> =
                    Optional.ofNullable(merchantName.getNullable("merchant_name"))

                /** The 4-digit MCC describing the merchant's business. */
                fun merchantCategoryCode(): String =
                    merchantCategoryCode.getRequired("merchant_category_code")

                /**
                 * A constant representing the object's type. For this resource it will always be
                 * `card_refund`.
                 */
                fun type(): Type = type.getRequired("type")

                /** The Card Refund identifier. */
                @JsonProperty("id") @ExcludeMissing fun _id() = id

                /**
                 * The pending amount in the minor unit of the transaction's currency. For dollars,
                 * for example, this is cents.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
                 * currency.
                 */
                @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

                /**
                 * The merchant identifier (commonly abbreviated as MID) of the merchant the card is
                 * transacting with.
                 */
                @JsonProperty("merchant_acceptor_id")
                @ExcludeMissing
                fun _merchantAcceptorId() = merchantAcceptorId

                /** The city the merchant resides in. */
                @JsonProperty("merchant_city") @ExcludeMissing fun _merchantCity() = merchantCity

                /** The state the merchant resides in. */
                @JsonProperty("merchant_state") @ExcludeMissing fun _merchantState() = merchantState

                /** The country the merchant resides in. */
                @JsonProperty("merchant_country")
                @ExcludeMissing
                fun _merchantCountry() = merchantCountry

                /** The name of the merchant. */
                @JsonProperty("merchant_name") @ExcludeMissing fun _merchantName() = merchantName

                /** The 4-digit MCC describing the merchant's business. */
                @JsonProperty("merchant_category_code")
                @ExcludeMissing
                fun _merchantCategoryCode() = merchantCategoryCode

                /**
                 * A constant representing the object's type. For this resource it will always be
                 * `card_refund`.
                 */
                @JsonProperty("type") @ExcludeMissing fun _type() = type

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate() = apply {
                    if (!validated) {
                        id()
                        amount()
                        currency()
                        merchantAcceptorId()
                        merchantCity()
                        merchantState()
                        merchantCountry()
                        merchantName()
                        merchantCategoryCode()
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
                        this.id == other.id &&
                        this.amount == other.amount &&
                        this.currency == other.currency &&
                        this.merchantAcceptorId == other.merchantAcceptorId &&
                        this.merchantCity == other.merchantCity &&
                        this.merchantState == other.merchantState &&
                        this.merchantCountry == other.merchantCountry &&
                        this.merchantName == other.merchantName &&
                        this.merchantCategoryCode == other.merchantCategoryCode &&
                        this.type == other.type &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                id,
                                amount,
                                currency,
                                merchantAcceptorId,
                                merchantCity,
                                merchantState,
                                merchantCountry,
                                merchantName,
                                merchantCategoryCode,
                                type,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "CardRefund{id=$id, amount=$amount, currency=$currency, merchantAcceptorId=$merchantAcceptorId, merchantCity=$merchantCity, merchantState=$merchantState, merchantCountry=$merchantCountry, merchantName=$merchantName, merchantCategoryCode=$merchantCategoryCode, type=$type, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var id: JsonField<String> = JsonMissing.of()
                    private var amount: JsonField<Long> = JsonMissing.of()
                    private var currency: JsonField<Currency> = JsonMissing.of()
                    private var merchantAcceptorId: JsonField<String> = JsonMissing.of()
                    private var merchantCity: JsonField<String> = JsonMissing.of()
                    private var merchantState: JsonField<String> = JsonMissing.of()
                    private var merchantCountry: JsonField<String> = JsonMissing.of()
                    private var merchantName: JsonField<String> = JsonMissing.of()
                    private var merchantCategoryCode: JsonField<String> = JsonMissing.of()
                    private var type: JsonField<Type> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(cardRefund: CardRefund) = apply {
                        this.id = cardRefund.id
                        this.amount = cardRefund.amount
                        this.currency = cardRefund.currency
                        this.merchantAcceptorId = cardRefund.merchantAcceptorId
                        this.merchantCity = cardRefund.merchantCity
                        this.merchantState = cardRefund.merchantState
                        this.merchantCountry = cardRefund.merchantCountry
                        this.merchantName = cardRefund.merchantName
                        this.merchantCategoryCode = cardRefund.merchantCategoryCode
                        this.type = cardRefund.type
                        additionalProperties(cardRefund.additionalProperties)
                    }

                    /** The Card Refund identifier. */
                    fun id(id: String) = id(JsonField.of(id))

                    /** The Card Refund identifier. */
                    @JsonProperty("id")
                    @ExcludeMissing
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    /**
                     * The pending amount in the minor unit of the transaction's currency. For
                     * dollars, for example, this is cents.
                     */
                    fun amount(amount: Long) = amount(JsonField.of(amount))

                    /**
                     * The pending amount in the minor unit of the transaction's currency. For
                     * dollars, for example, this is cents.
                     */
                    @JsonProperty("amount")
                    @ExcludeMissing
                    fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                     * transaction's currency.
                     */
                    fun currency(currency: Currency) = currency(JsonField.of(currency))

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                     * transaction's currency.
                     */
                    @JsonProperty("currency")
                    @ExcludeMissing
                    fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                    /**
                     * The merchant identifier (commonly abbreviated as MID) of the merchant the
                     * card is transacting with.
                     */
                    fun merchantAcceptorId(merchantAcceptorId: String) =
                        merchantAcceptorId(JsonField.of(merchantAcceptorId))

                    /**
                     * The merchant identifier (commonly abbreviated as MID) of the merchant the
                     * card is transacting with.
                     */
                    @JsonProperty("merchant_acceptor_id")
                    @ExcludeMissing
                    fun merchantAcceptorId(merchantAcceptorId: JsonField<String>) = apply {
                        this.merchantAcceptorId = merchantAcceptorId
                    }

                    /** The city the merchant resides in. */
                    fun merchantCity(merchantCity: String) =
                        merchantCity(JsonField.of(merchantCity))

                    /** The city the merchant resides in. */
                    @JsonProperty("merchant_city")
                    @ExcludeMissing
                    fun merchantCity(merchantCity: JsonField<String>) = apply {
                        this.merchantCity = merchantCity
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
                    fun merchantName(merchantName: String) =
                        merchantName(JsonField.of(merchantName))

                    /** The name of the merchant. */
                    @JsonProperty("merchant_name")
                    @ExcludeMissing
                    fun merchantName(merchantName: JsonField<String>) = apply {
                        this.merchantName = merchantName
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

                    /**
                     * A constant representing the object's type. For this resource it will always
                     * be `card_refund`.
                     */
                    fun type(type: Type) = type(JsonField.of(type))

                    /**
                     * A constant representing the object's type. For this resource it will always
                     * be `card_refund`.
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
                            id,
                            amount,
                            currency,
                            merchantAcceptorId,
                            merchantCity,
                            merchantState,
                            merchantCountry,
                            merchantName,
                            merchantCategoryCode,
                            type,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class Currency
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) {

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

                class Type
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

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
             * A Card Settlement object. This field will be present in the JSON response if and only
             * if `category` is equal to `card_settlement`.
             */
            @JsonDeserialize(builder = CardSettlement.Builder::class)
            @NoAutoDetect
            class CardSettlement
            private constructor(
                private val id: JsonField<String>,
                private val cardAuthorization: JsonField<String>,
                private val amount: JsonField<Long>,
                private val currency: JsonField<Currency>,
                private val presentmentAmount: JsonField<Long>,
                private val presentmentCurrency: JsonField<String>,
                private val merchantAcceptorId: JsonField<String>,
                private val merchantCity: JsonField<String>,
                private val merchantState: JsonField<String>,
                private val merchantCountry: JsonField<String>,
                private val merchantName: JsonField<String>,
                private val merchantCategoryCode: JsonField<String>,
                private val pendingTransactionId: JsonField<String>,
                private val type: JsonField<Type>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /** The Card Settlement identifier. */
                fun id(): String = id.getRequired("id")

                /**
                 * The Card Authorization that was created prior to this Card Settlement, if on
                 * exists.
                 */
                fun cardAuthorization(): Optional<String> =
                    Optional.ofNullable(cardAuthorization.getNullable("card_authorization"))

                /**
                 * The amount in the minor unit of the transaction's settlement currency. For
                 * dollars, for example, this is cents.
                 */
                fun amount(): Long = amount.getRequired("amount")

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
                 * settlement currency.
                 */
                fun currency(): Currency = currency.getRequired("currency")

                /** The amount in the minor unit of the transaction's presentment currency. */
                fun presentmentAmount(): Long = presentmentAmount.getRequired("presentment_amount")

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
                 * presentment currency.
                 */
                fun presentmentCurrency(): String =
                    presentmentCurrency.getRequired("presentment_currency")

                /**
                 * The merchant identifier (commonly abbreviated as MID) of the merchant the card is
                 * transacting with.
                 */
                fun merchantAcceptorId(): Optional<String> =
                    Optional.ofNullable(merchantAcceptorId.getNullable("merchant_acceptor_id"))

                /** The city the merchant resides in. */
                fun merchantCity(): Optional<String> =
                    Optional.ofNullable(merchantCity.getNullable("merchant_city"))

                /** The state the merchant resides in. */
                fun merchantState(): Optional<String> =
                    Optional.ofNullable(merchantState.getNullable("merchant_state"))

                /** The country the merchant resides in. */
                fun merchantCountry(): String = merchantCountry.getRequired("merchant_country")

                /** The name of the merchant. */
                fun merchantName(): Optional<String> =
                    Optional.ofNullable(merchantName.getNullable("merchant_name"))

                /** The 4-digit MCC describing the merchant's business. */
                fun merchantCategoryCode(): String =
                    merchantCategoryCode.getRequired("merchant_category_code")

                /** The identifier of the Pending Transaction associated with this Transaction. */
                fun pendingTransactionId(): Optional<String> =
                    Optional.ofNullable(pendingTransactionId.getNullable("pending_transaction_id"))

                /**
                 * A constant representing the object's type. For this resource it will always be
                 * `card_settlement`.
                 */
                fun type(): Type = type.getRequired("type")

                /** The Card Settlement identifier. */
                @JsonProperty("id") @ExcludeMissing fun _id() = id

                /**
                 * The Card Authorization that was created prior to this Card Settlement, if on
                 * exists.
                 */
                @JsonProperty("card_authorization")
                @ExcludeMissing
                fun _cardAuthorization() = cardAuthorization

                /**
                 * The amount in the minor unit of the transaction's settlement currency. For
                 * dollars, for example, this is cents.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
                 * settlement currency.
                 */
                @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

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
                 * The merchant identifier (commonly abbreviated as MID) of the merchant the card is
                 * transacting with.
                 */
                @JsonProperty("merchant_acceptor_id")
                @ExcludeMissing
                fun _merchantAcceptorId() = merchantAcceptorId

                /** The city the merchant resides in. */
                @JsonProperty("merchant_city") @ExcludeMissing fun _merchantCity() = merchantCity

                /** The state the merchant resides in. */
                @JsonProperty("merchant_state") @ExcludeMissing fun _merchantState() = merchantState

                /** The country the merchant resides in. */
                @JsonProperty("merchant_country")
                @ExcludeMissing
                fun _merchantCountry() = merchantCountry

                /** The name of the merchant. */
                @JsonProperty("merchant_name") @ExcludeMissing fun _merchantName() = merchantName

                /** The 4-digit MCC describing the merchant's business. */
                @JsonProperty("merchant_category_code")
                @ExcludeMissing
                fun _merchantCategoryCode() = merchantCategoryCode

                /** The identifier of the Pending Transaction associated with this Transaction. */
                @JsonProperty("pending_transaction_id")
                @ExcludeMissing
                fun _pendingTransactionId() = pendingTransactionId

                /**
                 * A constant representing the object's type. For this resource it will always be
                 * `card_settlement`.
                 */
                @JsonProperty("type") @ExcludeMissing fun _type() = type

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate() = apply {
                    if (!validated) {
                        id()
                        cardAuthorization()
                        amount()
                        currency()
                        presentmentAmount()
                        presentmentCurrency()
                        merchantAcceptorId()
                        merchantCity()
                        merchantState()
                        merchantCountry()
                        merchantName()
                        merchantCategoryCode()
                        pendingTransactionId()
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
                        this.id == other.id &&
                        this.cardAuthorization == other.cardAuthorization &&
                        this.amount == other.amount &&
                        this.currency == other.currency &&
                        this.presentmentAmount == other.presentmentAmount &&
                        this.presentmentCurrency == other.presentmentCurrency &&
                        this.merchantAcceptorId == other.merchantAcceptorId &&
                        this.merchantCity == other.merchantCity &&
                        this.merchantState == other.merchantState &&
                        this.merchantCountry == other.merchantCountry &&
                        this.merchantName == other.merchantName &&
                        this.merchantCategoryCode == other.merchantCategoryCode &&
                        this.pendingTransactionId == other.pendingTransactionId &&
                        this.type == other.type &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                id,
                                cardAuthorization,
                                amount,
                                currency,
                                presentmentAmount,
                                presentmentCurrency,
                                merchantAcceptorId,
                                merchantCity,
                                merchantState,
                                merchantCountry,
                                merchantName,
                                merchantCategoryCode,
                                pendingTransactionId,
                                type,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "CardSettlement{id=$id, cardAuthorization=$cardAuthorization, amount=$amount, currency=$currency, presentmentAmount=$presentmentAmount, presentmentCurrency=$presentmentCurrency, merchantAcceptorId=$merchantAcceptorId, merchantCity=$merchantCity, merchantState=$merchantState, merchantCountry=$merchantCountry, merchantName=$merchantName, merchantCategoryCode=$merchantCategoryCode, pendingTransactionId=$pendingTransactionId, type=$type, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var id: JsonField<String> = JsonMissing.of()
                    private var cardAuthorization: JsonField<String> = JsonMissing.of()
                    private var amount: JsonField<Long> = JsonMissing.of()
                    private var currency: JsonField<Currency> = JsonMissing.of()
                    private var presentmentAmount: JsonField<Long> = JsonMissing.of()
                    private var presentmentCurrency: JsonField<String> = JsonMissing.of()
                    private var merchantAcceptorId: JsonField<String> = JsonMissing.of()
                    private var merchantCity: JsonField<String> = JsonMissing.of()
                    private var merchantState: JsonField<String> = JsonMissing.of()
                    private var merchantCountry: JsonField<String> = JsonMissing.of()
                    private var merchantName: JsonField<String> = JsonMissing.of()
                    private var merchantCategoryCode: JsonField<String> = JsonMissing.of()
                    private var pendingTransactionId: JsonField<String> = JsonMissing.of()
                    private var type: JsonField<Type> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(cardSettlement: CardSettlement) = apply {
                        this.id = cardSettlement.id
                        this.cardAuthorization = cardSettlement.cardAuthorization
                        this.amount = cardSettlement.amount
                        this.currency = cardSettlement.currency
                        this.presentmentAmount = cardSettlement.presentmentAmount
                        this.presentmentCurrency = cardSettlement.presentmentCurrency
                        this.merchantAcceptorId = cardSettlement.merchantAcceptorId
                        this.merchantCity = cardSettlement.merchantCity
                        this.merchantState = cardSettlement.merchantState
                        this.merchantCountry = cardSettlement.merchantCountry
                        this.merchantName = cardSettlement.merchantName
                        this.merchantCategoryCode = cardSettlement.merchantCategoryCode
                        this.pendingTransactionId = cardSettlement.pendingTransactionId
                        this.type = cardSettlement.type
                        additionalProperties(cardSettlement.additionalProperties)
                    }

                    /** The Card Settlement identifier. */
                    fun id(id: String) = id(JsonField.of(id))

                    /** The Card Settlement identifier. */
                    @JsonProperty("id")
                    @ExcludeMissing
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    /**
                     * The Card Authorization that was created prior to this Card Settlement, if on
                     * exists.
                     */
                    fun cardAuthorization(cardAuthorization: String) =
                        cardAuthorization(JsonField.of(cardAuthorization))

                    /**
                     * The Card Authorization that was created prior to this Card Settlement, if on
                     * exists.
                     */
                    @JsonProperty("card_authorization")
                    @ExcludeMissing
                    fun cardAuthorization(cardAuthorization: JsonField<String>) = apply {
                        this.cardAuthorization = cardAuthorization
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
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                     * transaction's settlement currency.
                     */
                    fun currency(currency: Currency) = currency(JsonField.of(currency))

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                     * transaction's settlement currency.
                     */
                    @JsonProperty("currency")
                    @ExcludeMissing
                    fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

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
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                     * transaction's presentment currency.
                     */
                    fun presentmentCurrency(presentmentCurrency: String) =
                        presentmentCurrency(JsonField.of(presentmentCurrency))

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                     * transaction's presentment currency.
                     */
                    @JsonProperty("presentment_currency")
                    @ExcludeMissing
                    fun presentmentCurrency(presentmentCurrency: JsonField<String>) = apply {
                        this.presentmentCurrency = presentmentCurrency
                    }

                    /**
                     * The merchant identifier (commonly abbreviated as MID) of the merchant the
                     * card is transacting with.
                     */
                    fun merchantAcceptorId(merchantAcceptorId: String) =
                        merchantAcceptorId(JsonField.of(merchantAcceptorId))

                    /**
                     * The merchant identifier (commonly abbreviated as MID) of the merchant the
                     * card is transacting with.
                     */
                    @JsonProperty("merchant_acceptor_id")
                    @ExcludeMissing
                    fun merchantAcceptorId(merchantAcceptorId: JsonField<String>) = apply {
                        this.merchantAcceptorId = merchantAcceptorId
                    }

                    /** The city the merchant resides in. */
                    fun merchantCity(merchantCity: String) =
                        merchantCity(JsonField.of(merchantCity))

                    /** The city the merchant resides in. */
                    @JsonProperty("merchant_city")
                    @ExcludeMissing
                    fun merchantCity(merchantCity: JsonField<String>) = apply {
                        this.merchantCity = merchantCity
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
                    fun merchantName(merchantName: String) =
                        merchantName(JsonField.of(merchantName))

                    /** The name of the merchant. */
                    @JsonProperty("merchant_name")
                    @ExcludeMissing
                    fun merchantName(merchantName: JsonField<String>) = apply {
                        this.merchantName = merchantName
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

                    /**
                     * The identifier of the Pending Transaction associated with this Transaction.
                     */
                    fun pendingTransactionId(pendingTransactionId: String) =
                        pendingTransactionId(JsonField.of(pendingTransactionId))

                    /**
                     * The identifier of the Pending Transaction associated with this Transaction.
                     */
                    @JsonProperty("pending_transaction_id")
                    @ExcludeMissing
                    fun pendingTransactionId(pendingTransactionId: JsonField<String>) = apply {
                        this.pendingTransactionId = pendingTransactionId
                    }

                    /**
                     * A constant representing the object's type. For this resource it will always
                     * be `card_settlement`.
                     */
                    fun type(type: Type) = type(JsonField.of(type))

                    /**
                     * A constant representing the object's type. For this resource it will always
                     * be `card_settlement`.
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
                            id,
                            cardAuthorization,
                            amount,
                            currency,
                            presentmentAmount,
                            presentmentCurrency,
                            merchantAcceptorId,
                            merchantCity,
                            merchantState,
                            merchantCountry,
                            merchantName,
                            merchantCategoryCode,
                            pendingTransactionId,
                            type,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class Currency
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) {

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

                class Type
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

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
             * A Card Revenue Payment object. This field will be present in the JSON response if and
             * only if `category` is equal to `card_revenue_payment`.
             */
            @JsonDeserialize(builder = CardRevenuePayment.Builder::class)
            @NoAutoDetect
            class CardRevenuePayment
            private constructor(
                private val amount: JsonField<Long>,
                private val currency: JsonField<Currency>,
                private val periodStart: JsonField<OffsetDateTime>,
                private val periodEnd: JsonField<OffsetDateTime>,
                private val transactedOnAccountId: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /**
                 * The amount in the minor unit of the transaction's currency. For dollars, for
                 * example, this is cents.
                 */
                fun amount(): Long = amount.getRequired("amount")

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction
                 * currency.
                 */
                fun currency(): Currency = currency.getRequired("currency")

                /** The start of the period for which this transaction paid interest. */
                fun periodStart(): OffsetDateTime = periodStart.getRequired("period_start")

                /** The end of the period for which this transaction paid interest. */
                fun periodEnd(): OffsetDateTime = periodEnd.getRequired("period_end")

                /** The account the card belonged to. */
                fun transactedOnAccountId(): Optional<String> =
                    Optional.ofNullable(
                        transactedOnAccountId.getNullable("transacted_on_account_id")
                    )

                /**
                 * The amount in the minor unit of the transaction's currency. For dollars, for
                 * example, this is cents.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction
                 * currency.
                 */
                @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

                /** The start of the period for which this transaction paid interest. */
                @JsonProperty("period_start") @ExcludeMissing fun _periodStart() = periodStart

                /** The end of the period for which this transaction paid interest. */
                @JsonProperty("period_end") @ExcludeMissing fun _periodEnd() = periodEnd

                /** The account the card belonged to. */
                @JsonProperty("transacted_on_account_id")
                @ExcludeMissing
                fun _transactedOnAccountId() = transactedOnAccountId

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate() = apply {
                    if (!validated) {
                        amount()
                        currency()
                        periodStart()
                        periodEnd()
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
                        this.periodStart == other.periodStart &&
                        this.periodEnd == other.periodEnd &&
                        this.transactedOnAccountId == other.transactedOnAccountId &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                amount,
                                currency,
                                periodStart,
                                periodEnd,
                                transactedOnAccountId,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "CardRevenuePayment{amount=$amount, currency=$currency, periodStart=$periodStart, periodEnd=$periodEnd, transactedOnAccountId=$transactedOnAccountId, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var amount: JsonField<Long> = JsonMissing.of()
                    private var currency: JsonField<Currency> = JsonMissing.of()
                    private var periodStart: JsonField<OffsetDateTime> = JsonMissing.of()
                    private var periodEnd: JsonField<OffsetDateTime> = JsonMissing.of()
                    private var transactedOnAccountId: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(cardRevenuePayment: CardRevenuePayment) = apply {
                        this.amount = cardRevenuePayment.amount
                        this.currency = cardRevenuePayment.currency
                        this.periodStart = cardRevenuePayment.periodStart
                        this.periodEnd = cardRevenuePayment.periodEnd
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
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                     * transaction currency.
                     */
                    fun currency(currency: Currency) = currency(JsonField.of(currency))

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                     * transaction currency.
                     */
                    @JsonProperty("currency")
                    @ExcludeMissing
                    fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                    /** The start of the period for which this transaction paid interest. */
                    fun periodStart(periodStart: OffsetDateTime) =
                        periodStart(JsonField.of(periodStart))

                    /** The start of the period for which this transaction paid interest. */
                    @JsonProperty("period_start")
                    @ExcludeMissing
                    fun periodStart(periodStart: JsonField<OffsetDateTime>) = apply {
                        this.periodStart = periodStart
                    }

                    /** The end of the period for which this transaction paid interest. */
                    fun periodEnd(periodEnd: OffsetDateTime) = periodEnd(JsonField.of(periodEnd))

                    /** The end of the period for which this transaction paid interest. */
                    @JsonProperty("period_end")
                    @ExcludeMissing
                    fun periodEnd(periodEnd: JsonField<OffsetDateTime>) = apply {
                        this.periodEnd = periodEnd
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
                            periodStart,
                            periodEnd,
                            transactedOnAccountId,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class Currency
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) {

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

            /**
             * A Check Deposit Acceptance object. This field will be present in the JSON response if
             * and only if `category` is equal to `check_deposit_acceptance`.
             */
            @JsonDeserialize(builder = CheckDepositAcceptance.Builder::class)
            @NoAutoDetect
            class CheckDepositAcceptance
            private constructor(
                private val amount: JsonField<Long>,
                private val currency: JsonField<Currency>,
                private val accountNumber: JsonField<String>,
                private val routingNumber: JsonField<String>,
                private val auxiliaryOnUs: JsonField<String>,
                private val serialNumber: JsonField<String>,
                private val checkDepositId: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /**
                 * The amount to be deposited in the minor unit of the transaction's currency. For
                 * dollars, for example, this is cents.
                 */
                fun amount(): Long = amount.getRequired("amount")

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
                 * currency.
                 */
                fun currency(): Currency = currency.getRequired("currency")

                /** The account number printed on the check. */
                fun accountNumber(): String = accountNumber.getRequired("account_number")

                /** The routing number printed on the check. */
                fun routingNumber(): String = routingNumber.getRequired("routing_number")

                /**
                 * An additional line of metadata printed on the check. This typically includes the
                 * check number for business checks.
                 */
                fun auxiliaryOnUs(): Optional<String> =
                    Optional.ofNullable(auxiliaryOnUs.getNullable("auxiliary_on_us"))

                /**
                 * The check serial number, if present, for consumer checks. For business checks,
                 * the serial number is usually in the `auxiliary_on_us` field.
                 */
                fun serialNumber(): Optional<String> =
                    Optional.ofNullable(serialNumber.getNullable("serial_number"))

                /** The ID of the Check Deposit that was accepted. */
                fun checkDepositId(): String = checkDepositId.getRequired("check_deposit_id")

                /**
                 * The amount to be deposited in the minor unit of the transaction's currency. For
                 * dollars, for example, this is cents.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
                 * currency.
                 */
                @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

                /** The account number printed on the check. */
                @JsonProperty("account_number") @ExcludeMissing fun _accountNumber() = accountNumber

                /** The routing number printed on the check. */
                @JsonProperty("routing_number") @ExcludeMissing fun _routingNumber() = routingNumber

                /**
                 * An additional line of metadata printed on the check. This typically includes the
                 * check number for business checks.
                 */
                @JsonProperty("auxiliary_on_us")
                @ExcludeMissing
                fun _auxiliaryOnUs() = auxiliaryOnUs

                /**
                 * The check serial number, if present, for consumer checks. For business checks,
                 * the serial number is usually in the `auxiliary_on_us` field.
                 */
                @JsonProperty("serial_number") @ExcludeMissing fun _serialNumber() = serialNumber

                /** The ID of the Check Deposit that was accepted. */
                @JsonProperty("check_deposit_id")
                @ExcludeMissing
                fun _checkDepositId() = checkDepositId

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate() = apply {
                    if (!validated) {
                        amount()
                        currency()
                        accountNumber()
                        routingNumber()
                        auxiliaryOnUs()
                        serialNumber()
                        checkDepositId()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is CheckDepositAcceptance &&
                        this.amount == other.amount &&
                        this.currency == other.currency &&
                        this.accountNumber == other.accountNumber &&
                        this.routingNumber == other.routingNumber &&
                        this.auxiliaryOnUs == other.auxiliaryOnUs &&
                        this.serialNumber == other.serialNumber &&
                        this.checkDepositId == other.checkDepositId &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                amount,
                                currency,
                                accountNumber,
                                routingNumber,
                                auxiliaryOnUs,
                                serialNumber,
                                checkDepositId,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "CheckDepositAcceptance{amount=$amount, currency=$currency, accountNumber=$accountNumber, routingNumber=$routingNumber, auxiliaryOnUs=$auxiliaryOnUs, serialNumber=$serialNumber, checkDepositId=$checkDepositId, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var amount: JsonField<Long> = JsonMissing.of()
                    private var currency: JsonField<Currency> = JsonMissing.of()
                    private var accountNumber: JsonField<String> = JsonMissing.of()
                    private var routingNumber: JsonField<String> = JsonMissing.of()
                    private var auxiliaryOnUs: JsonField<String> = JsonMissing.of()
                    private var serialNumber: JsonField<String> = JsonMissing.of()
                    private var checkDepositId: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(checkDepositAcceptance: CheckDepositAcceptance) = apply {
                        this.amount = checkDepositAcceptance.amount
                        this.currency = checkDepositAcceptance.currency
                        this.accountNumber = checkDepositAcceptance.accountNumber
                        this.routingNumber = checkDepositAcceptance.routingNumber
                        this.auxiliaryOnUs = checkDepositAcceptance.auxiliaryOnUs
                        this.serialNumber = checkDepositAcceptance.serialNumber
                        this.checkDepositId = checkDepositAcceptance.checkDepositId
                        additionalProperties(checkDepositAcceptance.additionalProperties)
                    }

                    /**
                     * The amount to be deposited in the minor unit of the transaction's currency.
                     * For dollars, for example, this is cents.
                     */
                    fun amount(amount: Long) = amount(JsonField.of(amount))

                    /**
                     * The amount to be deposited in the minor unit of the transaction's currency.
                     * For dollars, for example, this is cents.
                     */
                    @JsonProperty("amount")
                    @ExcludeMissing
                    fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                     * transaction's currency.
                     */
                    fun currency(currency: Currency) = currency(JsonField.of(currency))

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                     * transaction's currency.
                     */
                    @JsonProperty("currency")
                    @ExcludeMissing
                    fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                    /** The account number printed on the check. */
                    fun accountNumber(accountNumber: String) =
                        accountNumber(JsonField.of(accountNumber))

                    /** The account number printed on the check. */
                    @JsonProperty("account_number")
                    @ExcludeMissing
                    fun accountNumber(accountNumber: JsonField<String>) = apply {
                        this.accountNumber = accountNumber
                    }

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
                     * An additional line of metadata printed on the check. This typically includes
                     * the check number for business checks.
                     */
                    fun auxiliaryOnUs(auxiliaryOnUs: String) =
                        auxiliaryOnUs(JsonField.of(auxiliaryOnUs))

                    /**
                     * An additional line of metadata printed on the check. This typically includes
                     * the check number for business checks.
                     */
                    @JsonProperty("auxiliary_on_us")
                    @ExcludeMissing
                    fun auxiliaryOnUs(auxiliaryOnUs: JsonField<String>) = apply {
                        this.auxiliaryOnUs = auxiliaryOnUs
                    }

                    /**
                     * The check serial number, if present, for consumer checks. For business
                     * checks, the serial number is usually in the `auxiliary_on_us` field.
                     */
                    fun serialNumber(serialNumber: String) =
                        serialNumber(JsonField.of(serialNumber))

                    /**
                     * The check serial number, if present, for consumer checks. For business
                     * checks, the serial number is usually in the `auxiliary_on_us` field.
                     */
                    @JsonProperty("serial_number")
                    @ExcludeMissing
                    fun serialNumber(serialNumber: JsonField<String>) = apply {
                        this.serialNumber = serialNumber
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
                            amount,
                            currency,
                            accountNumber,
                            routingNumber,
                            auxiliaryOnUs,
                            serialNumber,
                            checkDepositId,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class Currency
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) {

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

            /**
             * A Check Deposit Return object. This field will be present in the JSON response if and
             * only if `category` is equal to `check_deposit_return`.
             */
            @JsonDeserialize(builder = CheckDepositReturn.Builder::class)
            @NoAutoDetect
            class CheckDepositReturn
            private constructor(
                private val amount: JsonField<Long>,
                private val returnedAt: JsonField<OffsetDateTime>,
                private val currency: JsonField<Currency>,
                private val checkDepositId: JsonField<String>,
                private val transactionId: JsonField<String>,
                private val returnReason: JsonField<ReturnReason>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /**
                 * The amount in the minor unit of the transaction's currency. For dollars, for
                 * example, this is cents.
                 */
                fun amount(): Long = amount.getRequired("amount")

                /**
                 * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
                 * check deposit was returned.
                 */
                fun returnedAt(): OffsetDateTime = returnedAt.getRequired("returned_at")

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
                 * currency.
                 */
                fun currency(): Currency = currency.getRequired("currency")

                /** The identifier of the Check Deposit that was returned. */
                fun checkDepositId(): String = checkDepositId.getRequired("check_deposit_id")

                /**
                 * The identifier of the transaction that reversed the original check deposit
                 * transaction.
                 */
                fun transactionId(): String = transactionId.getRequired("transaction_id")

                fun returnReason(): ReturnReason = returnReason.getRequired("return_reason")

                /**
                 * The amount in the minor unit of the transaction's currency. For dollars, for
                 * example, this is cents.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

                /**
                 * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
                 * check deposit was returned.
                 */
                @JsonProperty("returned_at") @ExcludeMissing fun _returnedAt() = returnedAt

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
                 * currency.
                 */
                @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

                /** The identifier of the Check Deposit that was returned. */
                @JsonProperty("check_deposit_id")
                @ExcludeMissing
                fun _checkDepositId() = checkDepositId

                /**
                 * The identifier of the transaction that reversed the original check deposit
                 * transaction.
                 */
                @JsonProperty("transaction_id") @ExcludeMissing fun _transactionId() = transactionId

                @JsonProperty("return_reason") @ExcludeMissing fun _returnReason() = returnReason

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate() = apply {
                    if (!validated) {
                        amount()
                        returnedAt()
                        currency()
                        checkDepositId()
                        transactionId()
                        returnReason()
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
                        this.returnedAt == other.returnedAt &&
                        this.currency == other.currency &&
                        this.checkDepositId == other.checkDepositId &&
                        this.transactionId == other.transactionId &&
                        this.returnReason == other.returnReason &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                amount,
                                returnedAt,
                                currency,
                                checkDepositId,
                                transactionId,
                                returnReason,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "CheckDepositReturn{amount=$amount, returnedAt=$returnedAt, currency=$currency, checkDepositId=$checkDepositId, transactionId=$transactionId, returnReason=$returnReason, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var amount: JsonField<Long> = JsonMissing.of()
                    private var returnedAt: JsonField<OffsetDateTime> = JsonMissing.of()
                    private var currency: JsonField<Currency> = JsonMissing.of()
                    private var checkDepositId: JsonField<String> = JsonMissing.of()
                    private var transactionId: JsonField<String> = JsonMissing.of()
                    private var returnReason: JsonField<ReturnReason> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(checkDepositReturn: CheckDepositReturn) = apply {
                        this.amount = checkDepositReturn.amount
                        this.returnedAt = checkDepositReturn.returnedAt
                        this.currency = checkDepositReturn.currency
                        this.checkDepositId = checkDepositReturn.checkDepositId
                        this.transactionId = checkDepositReturn.transactionId
                        this.returnReason = checkDepositReturn.returnReason
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

                    /**
                     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which
                     * the check deposit was returned.
                     */
                    fun returnedAt(returnedAt: OffsetDateTime) =
                        returnedAt(JsonField.of(returnedAt))

                    /**
                     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which
                     * the check deposit was returned.
                     */
                    @JsonProperty("returned_at")
                    @ExcludeMissing
                    fun returnedAt(returnedAt: JsonField<OffsetDateTime>) = apply {
                        this.returnedAt = returnedAt
                    }

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                     * transaction's currency.
                     */
                    fun currency(currency: Currency) = currency(JsonField.of(currency))

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                     * transaction's currency.
                     */
                    @JsonProperty("currency")
                    @ExcludeMissing
                    fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

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

                    fun returnReason(returnReason: ReturnReason) =
                        returnReason(JsonField.of(returnReason))

                    @JsonProperty("return_reason")
                    @ExcludeMissing
                    fun returnReason(returnReason: JsonField<ReturnReason>) = apply {
                        this.returnReason = returnReason
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
                            returnedAt,
                            currency,
                            checkDepositId,
                            transactionId,
                            returnReason,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class Currency
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) {

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

                class ReturnReason
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

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
                        val DUPLICATE_SUBMISSION =
                            ReturnReason(JsonField.of("duplicate_submission"))

                        @JvmField
                        val INSUFFICIENT_FUNDS = ReturnReason(JsonField.of("insufficient_funds"))

                        @JvmField val NO_ACCOUNT = ReturnReason(JsonField.of("no_account"))

                        @JvmField val NOT_AUTHORIZED = ReturnReason(JsonField.of("not_authorized"))

                        @JvmField val STALE_DATED = ReturnReason(JsonField.of("stale_dated"))

                        @JvmField val STOP_PAYMENT = ReturnReason(JsonField.of("stop_payment"))

                        @JvmField val UNKNOWN_REASON = ReturnReason(JsonField.of("unknown_reason"))

                        @JvmField
                        val UNMATCHED_DETAILS = ReturnReason(JsonField.of("unmatched_details"))

                        @JvmField
                        val UNREADABLE_IMAGE = ReturnReason(JsonField.of("unreadable_image"))

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
                            else ->
                                throw IncreaseInvalidDataException("Unknown ReturnReason: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }
            }

            /**
             * A Check Transfer Intention object. This field will be present in the JSON response if
             * and only if `category` is equal to `check_transfer_intention`.
             */
            @JsonDeserialize(builder = CheckTransferIntention.Builder::class)
            @NoAutoDetect
            class CheckTransferIntention
            private constructor(
                private val addressLine1: JsonField<String>,
                private val addressLine2: JsonField<String>,
                private val addressCity: JsonField<String>,
                private val addressState: JsonField<String>,
                private val addressZip: JsonField<String>,
                private val amount: JsonField<Long>,
                private val currency: JsonField<Currency>,
                private val recipientName: JsonField<String>,
                private val transferId: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /** The street address of the check's destination. */
                fun addressLine1(): String = addressLine1.getRequired("address_line1")

                /** The second line of the address of the check's destination. */
                fun addressLine2(): Optional<String> =
                    Optional.ofNullable(addressLine2.getNullable("address_line2"))

                /** The city of the check's destination. */
                fun addressCity(): String = addressCity.getRequired("address_city")

                /** The state of the check's destination. */
                fun addressState(): String = addressState.getRequired("address_state")

                /** The postal code of the check's destination. */
                fun addressZip(): String = addressZip.getRequired("address_zip")

                /** The transfer amount in USD cents. */
                fun amount(): Long = amount.getRequired("amount")

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the check's
                 * currency.
                 */
                fun currency(): Currency = currency.getRequired("currency")

                /** The name that will be printed on the check. */
                fun recipientName(): String = recipientName.getRequired("recipient_name")

                /** The identifier of the Check Transfer with which this is associated. */
                fun transferId(): String = transferId.getRequired("transfer_id")

                /** The street address of the check's destination. */
                @JsonProperty("address_line1") @ExcludeMissing fun _addressLine1() = addressLine1

                /** The second line of the address of the check's destination. */
                @JsonProperty("address_line2") @ExcludeMissing fun _addressLine2() = addressLine2

                /** The city of the check's destination. */
                @JsonProperty("address_city") @ExcludeMissing fun _addressCity() = addressCity

                /** The state of the check's destination. */
                @JsonProperty("address_state") @ExcludeMissing fun _addressState() = addressState

                /** The postal code of the check's destination. */
                @JsonProperty("address_zip") @ExcludeMissing fun _addressZip() = addressZip

                /** The transfer amount in USD cents. */
                @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the check's
                 * currency.
                 */
                @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

                /** The name that will be printed on the check. */
                @JsonProperty("recipient_name") @ExcludeMissing fun _recipientName() = recipientName

                /** The identifier of the Check Transfer with which this is associated. */
                @JsonProperty("transfer_id") @ExcludeMissing fun _transferId() = transferId

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate() = apply {
                    if (!validated) {
                        addressLine1()
                        addressLine2()
                        addressCity()
                        addressState()
                        addressZip()
                        amount()
                        currency()
                        recipientName()
                        transferId()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is CheckTransferIntention &&
                        this.addressLine1 == other.addressLine1 &&
                        this.addressLine2 == other.addressLine2 &&
                        this.addressCity == other.addressCity &&
                        this.addressState == other.addressState &&
                        this.addressZip == other.addressZip &&
                        this.amount == other.amount &&
                        this.currency == other.currency &&
                        this.recipientName == other.recipientName &&
                        this.transferId == other.transferId &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                addressLine1,
                                addressLine2,
                                addressCity,
                                addressState,
                                addressZip,
                                amount,
                                currency,
                                recipientName,
                                transferId,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "CheckTransferIntention{addressLine1=$addressLine1, addressLine2=$addressLine2, addressCity=$addressCity, addressState=$addressState, addressZip=$addressZip, amount=$amount, currency=$currency, recipientName=$recipientName, transferId=$transferId, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var addressLine1: JsonField<String> = JsonMissing.of()
                    private var addressLine2: JsonField<String> = JsonMissing.of()
                    private var addressCity: JsonField<String> = JsonMissing.of()
                    private var addressState: JsonField<String> = JsonMissing.of()
                    private var addressZip: JsonField<String> = JsonMissing.of()
                    private var amount: JsonField<Long> = JsonMissing.of()
                    private var currency: JsonField<Currency> = JsonMissing.of()
                    private var recipientName: JsonField<String> = JsonMissing.of()
                    private var transferId: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(checkTransferIntention: CheckTransferIntention) = apply {
                        this.addressLine1 = checkTransferIntention.addressLine1
                        this.addressLine2 = checkTransferIntention.addressLine2
                        this.addressCity = checkTransferIntention.addressCity
                        this.addressState = checkTransferIntention.addressState
                        this.addressZip = checkTransferIntention.addressZip
                        this.amount = checkTransferIntention.amount
                        this.currency = checkTransferIntention.currency
                        this.recipientName = checkTransferIntention.recipientName
                        this.transferId = checkTransferIntention.transferId
                        additionalProperties(checkTransferIntention.additionalProperties)
                    }

                    /** The street address of the check's destination. */
                    fun addressLine1(addressLine1: String) =
                        addressLine1(JsonField.of(addressLine1))

                    /** The street address of the check's destination. */
                    @JsonProperty("address_line1")
                    @ExcludeMissing
                    fun addressLine1(addressLine1: JsonField<String>) = apply {
                        this.addressLine1 = addressLine1
                    }

                    /** The second line of the address of the check's destination. */
                    fun addressLine2(addressLine2: String) =
                        addressLine2(JsonField.of(addressLine2))

                    /** The second line of the address of the check's destination. */
                    @JsonProperty("address_line2")
                    @ExcludeMissing
                    fun addressLine2(addressLine2: JsonField<String>) = apply {
                        this.addressLine2 = addressLine2
                    }

                    /** The city of the check's destination. */
                    fun addressCity(addressCity: String) = addressCity(JsonField.of(addressCity))

                    /** The city of the check's destination. */
                    @JsonProperty("address_city")
                    @ExcludeMissing
                    fun addressCity(addressCity: JsonField<String>) = apply {
                        this.addressCity = addressCity
                    }

                    /** The state of the check's destination. */
                    fun addressState(addressState: String) =
                        addressState(JsonField.of(addressState))

                    /** The state of the check's destination. */
                    @JsonProperty("address_state")
                    @ExcludeMissing
                    fun addressState(addressState: JsonField<String>) = apply {
                        this.addressState = addressState
                    }

                    /** The postal code of the check's destination. */
                    fun addressZip(addressZip: String) = addressZip(JsonField.of(addressZip))

                    /** The postal code of the check's destination. */
                    @JsonProperty("address_zip")
                    @ExcludeMissing
                    fun addressZip(addressZip: JsonField<String>) = apply {
                        this.addressZip = addressZip
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

                    /** The name that will be printed on the check. */
                    fun recipientName(recipientName: String) =
                        recipientName(JsonField.of(recipientName))

                    /** The name that will be printed on the check. */
                    @JsonProperty("recipient_name")
                    @ExcludeMissing
                    fun recipientName(recipientName: JsonField<String>) = apply {
                        this.recipientName = recipientName
                    }

                    /** The identifier of the Check Transfer with which this is associated. */
                    fun transferId(transferId: String) = transferId(JsonField.of(transferId))

                    /** The identifier of the Check Transfer with which this is associated. */
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

                    fun build(): CheckTransferIntention =
                        CheckTransferIntention(
                            addressLine1,
                            addressLine2,
                            addressCity,
                            addressState,
                            addressZip,
                            amount,
                            currency,
                            recipientName,
                            transferId,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class Currency
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) {

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

            /**
             * A Check Transfer Return object. This field will be present in the JSON response if
             * and only if `category` is equal to `check_transfer_return`.
             */
            @JsonDeserialize(builder = CheckTransferReturn.Builder::class)
            @NoAutoDetect
            class CheckTransferReturn
            private constructor(
                private val transferId: JsonField<String>,
                private val returnedAt: JsonField<OffsetDateTime>,
                private val fileId: JsonField<String>,
                private val reason: JsonField<Reason>,
                private val transactionId: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /** The identifier of the returned Check Transfer. */
                fun transferId(): String = transferId.getRequired("transfer_id")

                /**
                 * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
                 * check was returned.
                 */
                fun returnedAt(): OffsetDateTime = returnedAt.getRequired("returned_at")

                /** If available, a document with additional information about the return. */
                fun fileId(): Optional<String> = Optional.ofNullable(fileId.getNullable("file_id"))

                /** The reason why the check was returned. */
                fun reason(): Reason = reason.getRequired("reason")

                /**
                 * The identifier of the Transaction that was created to credit you for the returned
                 * check.
                 */
                fun transactionId(): Optional<String> =
                    Optional.ofNullable(transactionId.getNullable("transaction_id"))

                /** The identifier of the returned Check Transfer. */
                @JsonProperty("transfer_id") @ExcludeMissing fun _transferId() = transferId

                /**
                 * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
                 * check was returned.
                 */
                @JsonProperty("returned_at") @ExcludeMissing fun _returnedAt() = returnedAt

                /** If available, a document with additional information about the return. */
                @JsonProperty("file_id") @ExcludeMissing fun _fileId() = fileId

                /** The reason why the check was returned. */
                @JsonProperty("reason") @ExcludeMissing fun _reason() = reason

                /**
                 * The identifier of the Transaction that was created to credit you for the returned
                 * check.
                 */
                @JsonProperty("transaction_id") @ExcludeMissing fun _transactionId() = transactionId

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate() = apply {
                    if (!validated) {
                        transferId()
                        returnedAt()
                        fileId()
                        reason()
                        transactionId()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is CheckTransferReturn &&
                        this.transferId == other.transferId &&
                        this.returnedAt == other.returnedAt &&
                        this.fileId == other.fileId &&
                        this.reason == other.reason &&
                        this.transactionId == other.transactionId &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                transferId,
                                returnedAt,
                                fileId,
                                reason,
                                transactionId,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "CheckTransferReturn{transferId=$transferId, returnedAt=$returnedAt, fileId=$fileId, reason=$reason, transactionId=$transactionId, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var transferId: JsonField<String> = JsonMissing.of()
                    private var returnedAt: JsonField<OffsetDateTime> = JsonMissing.of()
                    private var fileId: JsonField<String> = JsonMissing.of()
                    private var reason: JsonField<Reason> = JsonMissing.of()
                    private var transactionId: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(checkTransferReturn: CheckTransferReturn) = apply {
                        this.transferId = checkTransferReturn.transferId
                        this.returnedAt = checkTransferReturn.returnedAt
                        this.fileId = checkTransferReturn.fileId
                        this.reason = checkTransferReturn.reason
                        this.transactionId = checkTransferReturn.transactionId
                        additionalProperties(checkTransferReturn.additionalProperties)
                    }

                    /** The identifier of the returned Check Transfer. */
                    fun transferId(transferId: String) = transferId(JsonField.of(transferId))

                    /** The identifier of the returned Check Transfer. */
                    @JsonProperty("transfer_id")
                    @ExcludeMissing
                    fun transferId(transferId: JsonField<String>) = apply {
                        this.transferId = transferId
                    }

                    /**
                     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which
                     * the check was returned.
                     */
                    fun returnedAt(returnedAt: OffsetDateTime) =
                        returnedAt(JsonField.of(returnedAt))

                    /**
                     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which
                     * the check was returned.
                     */
                    @JsonProperty("returned_at")
                    @ExcludeMissing
                    fun returnedAt(returnedAt: JsonField<OffsetDateTime>) = apply {
                        this.returnedAt = returnedAt
                    }

                    /** If available, a document with additional information about the return. */
                    fun fileId(fileId: String) = fileId(JsonField.of(fileId))

                    /** If available, a document with additional information about the return. */
                    @JsonProperty("file_id")
                    @ExcludeMissing
                    fun fileId(fileId: JsonField<String>) = apply { this.fileId = fileId }

                    /** The reason why the check was returned. */
                    fun reason(reason: Reason) = reason(JsonField.of(reason))

                    /** The reason why the check was returned. */
                    @JsonProperty("reason")
                    @ExcludeMissing
                    fun reason(reason: JsonField<Reason>) = apply { this.reason = reason }

                    /**
                     * The identifier of the Transaction that was created to credit you for the
                     * returned check.
                     */
                    fun transactionId(transactionId: String) =
                        transactionId(JsonField.of(transactionId))

                    /**
                     * The identifier of the Transaction that was created to credit you for the
                     * returned check.
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

                    fun build(): CheckTransferReturn =
                        CheckTransferReturn(
                            transferId,
                            returnedAt,
                            fileId,
                            reason,
                            transactionId,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class Reason
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

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
                        val MAIL_DELIVERY_FAILURE = Reason(JsonField.of("mail_delivery_failure"))

                        @JvmField
                        val REFUSED_BY_RECIPIENT = Reason(JsonField.of("refused_by_recipient"))

                        @JvmField
                        val RETURNED_NOT_AUTHORIZED =
                            Reason(JsonField.of("returned_not_authorized"))

                        @JvmStatic fun of(value: String) = Reason(JsonField.of(value))
                    }

                    enum class Known {
                        MAIL_DELIVERY_FAILURE,
                        REFUSED_BY_RECIPIENT,
                        RETURNED_NOT_AUTHORIZED,
                    }

                    enum class Value {
                        MAIL_DELIVERY_FAILURE,
                        REFUSED_BY_RECIPIENT,
                        RETURNED_NOT_AUTHORIZED,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            MAIL_DELIVERY_FAILURE -> Value.MAIL_DELIVERY_FAILURE
                            REFUSED_BY_RECIPIENT -> Value.REFUSED_BY_RECIPIENT
                            RETURNED_NOT_AUTHORIZED -> Value.RETURNED_NOT_AUTHORIZED
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            MAIL_DELIVERY_FAILURE -> Known.MAIL_DELIVERY_FAILURE
                            REFUSED_BY_RECIPIENT -> Known.REFUSED_BY_RECIPIENT
                            RETURNED_NOT_AUTHORIZED -> Known.RETURNED_NOT_AUTHORIZED
                            else -> throw IncreaseInvalidDataException("Unknown Reason: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }
            }

            /**
             * A Check Transfer Rejection object. This field will be present in the JSON response if
             * and only if `category` is equal to `check_transfer_rejection`.
             */
            @JsonDeserialize(builder = CheckTransferRejection.Builder::class)
            @NoAutoDetect
            class CheckTransferRejection
            private constructor(
                private val transferId: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /** The identifier of the Check Transfer that led to this Transaction. */
                fun transferId(): String = transferId.getRequired("transfer_id")

                /** The identifier of the Check Transfer that led to this Transaction. */
                @JsonProperty("transfer_id") @ExcludeMissing fun _transferId() = transferId

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate() = apply {
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

                    return other is CheckTransferRejection &&
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
                    "CheckTransferRejection{transferId=$transferId, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var transferId: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(checkTransferRejection: CheckTransferRejection) = apply {
                        this.transferId = checkTransferRejection.transferId
                        additionalProperties(checkTransferRejection.additionalProperties)
                    }

                    /** The identifier of the Check Transfer that led to this Transaction. */
                    fun transferId(transferId: String) = transferId(JsonField.of(transferId))

                    /** The identifier of the Check Transfer that led to this Transaction. */
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

                    fun build(): CheckTransferRejection =
                        CheckTransferRejection(transferId, additionalProperties.toUnmodifiable())
                }
            }

            /**
             * A Check Transfer Stop Payment Request object. This field will be present in the JSON
             * response if and only if `category` is equal to `check_transfer_stop_payment_request`.
             */
            @JsonDeserialize(builder = CheckTransferStopPaymentRequest.Builder::class)
            @NoAutoDetect
            class CheckTransferStopPaymentRequest
            private constructor(
                private val transferId: JsonField<String>,
                private val transactionId: JsonField<String>,
                private val requestedAt: JsonField<OffsetDateTime>,
                private val type: JsonField<Type>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /** The ID of the check transfer that was stopped. */
                fun transferId(): String = transferId.getRequired("transfer_id")

                /** The transaction ID of the corresponding credit transaction. */
                fun transactionId(): String = transactionId.getRequired("transaction_id")

                /** The time the stop-payment was requested. */
                fun requestedAt(): OffsetDateTime = requestedAt.getRequired("requested_at")

                /**
                 * A constant representing the object's type. For this resource it will always be
                 * `check_transfer_stop_payment_request`.
                 */
                fun type(): Type = type.getRequired("type")

                /** The ID of the check transfer that was stopped. */
                @JsonProperty("transfer_id") @ExcludeMissing fun _transferId() = transferId

                /** The transaction ID of the corresponding credit transaction. */
                @JsonProperty("transaction_id") @ExcludeMissing fun _transactionId() = transactionId

                /** The time the stop-payment was requested. */
                @JsonProperty("requested_at") @ExcludeMissing fun _requestedAt() = requestedAt

                /**
                 * A constant representing the object's type. For this resource it will always be
                 * `check_transfer_stop_payment_request`.
                 */
                @JsonProperty("type") @ExcludeMissing fun _type() = type

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate() = apply {
                    if (!validated) {
                        transferId()
                        transactionId()
                        requestedAt()
                        type()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is CheckTransferStopPaymentRequest &&
                        this.transferId == other.transferId &&
                        this.transactionId == other.transactionId &&
                        this.requestedAt == other.requestedAt &&
                        this.type == other.type &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                transferId,
                                transactionId,
                                requestedAt,
                                type,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "CheckTransferStopPaymentRequest{transferId=$transferId, transactionId=$transactionId, requestedAt=$requestedAt, type=$type, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var transferId: JsonField<String> = JsonMissing.of()
                    private var transactionId: JsonField<String> = JsonMissing.of()
                    private var requestedAt: JsonField<OffsetDateTime> = JsonMissing.of()
                    private var type: JsonField<Type> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(
                        checkTransferStopPaymentRequest: CheckTransferStopPaymentRequest
                    ) = apply {
                        this.transferId = checkTransferStopPaymentRequest.transferId
                        this.transactionId = checkTransferStopPaymentRequest.transactionId
                        this.requestedAt = checkTransferStopPaymentRequest.requestedAt
                        this.type = checkTransferStopPaymentRequest.type
                        additionalProperties(checkTransferStopPaymentRequest.additionalProperties)
                    }

                    /** The ID of the check transfer that was stopped. */
                    fun transferId(transferId: String) = transferId(JsonField.of(transferId))

                    /** The ID of the check transfer that was stopped. */
                    @JsonProperty("transfer_id")
                    @ExcludeMissing
                    fun transferId(transferId: JsonField<String>) = apply {
                        this.transferId = transferId
                    }

                    /** The transaction ID of the corresponding credit transaction. */
                    fun transactionId(transactionId: String) =
                        transactionId(JsonField.of(transactionId))

                    /** The transaction ID of the corresponding credit transaction. */
                    @JsonProperty("transaction_id")
                    @ExcludeMissing
                    fun transactionId(transactionId: JsonField<String>) = apply {
                        this.transactionId = transactionId
                    }

                    /** The time the stop-payment was requested. */
                    fun requestedAt(requestedAt: OffsetDateTime) =
                        requestedAt(JsonField.of(requestedAt))

                    /** The time the stop-payment was requested. */
                    @JsonProperty("requested_at")
                    @ExcludeMissing
                    fun requestedAt(requestedAt: JsonField<OffsetDateTime>) = apply {
                        this.requestedAt = requestedAt
                    }

                    /**
                     * A constant representing the object's type. For this resource it will always
                     * be `check_transfer_stop_payment_request`.
                     */
                    fun type(type: Type) = type(JsonField.of(type))

                    /**
                     * A constant representing the object's type. For this resource it will always
                     * be `check_transfer_stop_payment_request`.
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

                    fun build(): CheckTransferStopPaymentRequest =
                        CheckTransferStopPaymentRequest(
                            transferId,
                            transactionId,
                            requestedAt,
                            type,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class Type
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

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
                        val CHECK_TRANSFER_STOP_PAYMENT_REQUEST =
                            Type(JsonField.of("check_transfer_stop_payment_request"))

                        @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                    }

                    enum class Known {
                        CHECK_TRANSFER_STOP_PAYMENT_REQUEST,
                    }

                    enum class Value {
                        CHECK_TRANSFER_STOP_PAYMENT_REQUEST,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            CHECK_TRANSFER_STOP_PAYMENT_REQUEST ->
                                Value.CHECK_TRANSFER_STOP_PAYMENT_REQUEST
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            CHECK_TRANSFER_STOP_PAYMENT_REQUEST ->
                                Known.CHECK_TRANSFER_STOP_PAYMENT_REQUEST
                            else -> throw IncreaseInvalidDataException("Unknown Type: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }
            }

            /**
             * A Dispute Resolution object. This field will be present in the JSON response if and
             * only if `category` is equal to `dispute_resolution`.
             */
            @JsonDeserialize(builder = DisputeResolution.Builder::class)
            @NoAutoDetect
            class DisputeResolution
            private constructor(
                private val amount: JsonField<Long>,
                private val currency: JsonField<Currency>,
                private val disputedTransactionId: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /**
                 * The amount in the minor unit of the transaction's currency. For dollars, for
                 * example, this is cents.
                 */
                fun amount(): Long = amount.getRequired("amount")

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
                 * currency.
                 */
                fun currency(): Currency = currency.getRequired("currency")

                /** The identifier of the Transaction that was disputed. */
                fun disputedTransactionId(): String =
                    disputedTransactionId.getRequired("disputed_transaction_id")

                /**
                 * The amount in the minor unit of the transaction's currency. For dollars, for
                 * example, this is cents.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
                 * currency.
                 */
                @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

                /** The identifier of the Transaction that was disputed. */
                @JsonProperty("disputed_transaction_id")
                @ExcludeMissing
                fun _disputedTransactionId() = disputedTransactionId

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate() = apply {
                    if (!validated) {
                        amount()
                        currency()
                        disputedTransactionId()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is DisputeResolution &&
                        this.amount == other.amount &&
                        this.currency == other.currency &&
                        this.disputedTransactionId == other.disputedTransactionId &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                amount,
                                currency,
                                disputedTransactionId,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "DisputeResolution{amount=$amount, currency=$currency, disputedTransactionId=$disputedTransactionId, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var amount: JsonField<Long> = JsonMissing.of()
                    private var currency: JsonField<Currency> = JsonMissing.of()
                    private var disputedTransactionId: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(disputeResolution: DisputeResolution) = apply {
                        this.amount = disputeResolution.amount
                        this.currency = disputeResolution.currency
                        this.disputedTransactionId = disputeResolution.disputedTransactionId
                        additionalProperties(disputeResolution.additionalProperties)
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
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                     * transaction's currency.
                     */
                    fun currency(currency: Currency) = currency(JsonField.of(currency))

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                     * transaction's currency.
                     */
                    @JsonProperty("currency")
                    @ExcludeMissing
                    fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                    /** The identifier of the Transaction that was disputed. */
                    fun disputedTransactionId(disputedTransactionId: String) =
                        disputedTransactionId(JsonField.of(disputedTransactionId))

                    /** The identifier of the Transaction that was disputed. */
                    @JsonProperty("disputed_transaction_id")
                    @ExcludeMissing
                    fun disputedTransactionId(disputedTransactionId: JsonField<String>) = apply {
                        this.disputedTransactionId = disputedTransactionId
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

                    fun build(): DisputeResolution =
                        DisputeResolution(
                            amount,
                            currency,
                            disputedTransactionId,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class Currency
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) {

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

            /**
             * A Empyreal Cash Deposit object. This field will be present in the JSON response if
             * and only if `category` is equal to `empyreal_cash_deposit`.
             */
            @JsonDeserialize(builder = EmpyrealCashDeposit.Builder::class)
            @NoAutoDetect
            class EmpyrealCashDeposit
            private constructor(
                private val amount: JsonField<Long>,
                private val bagId: JsonField<String>,
                private val depositDate: JsonField<OffsetDateTime>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /**
                 * The amount in the minor unit of the transaction's currency. For dollars, for
                 * example, this is cents.
                 */
                fun amount(): Long = amount.getRequired("amount")

                fun bagId(): String = bagId.getRequired("bag_id")

                fun depositDate(): OffsetDateTime = depositDate.getRequired("deposit_date")

                /**
                 * The amount in the minor unit of the transaction's currency. For dollars, for
                 * example, this is cents.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

                @JsonProperty("bag_id") @ExcludeMissing fun _bagId() = bagId

                @JsonProperty("deposit_date") @ExcludeMissing fun _depositDate() = depositDate

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate() = apply {
                    if (!validated) {
                        amount()
                        bagId()
                        depositDate()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is EmpyrealCashDeposit &&
                        this.amount == other.amount &&
                        this.bagId == other.bagId &&
                        this.depositDate == other.depositDate &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                amount,
                                bagId,
                                depositDate,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "EmpyrealCashDeposit{amount=$amount, bagId=$bagId, depositDate=$depositDate, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var amount: JsonField<Long> = JsonMissing.of()
                    private var bagId: JsonField<String> = JsonMissing.of()
                    private var depositDate: JsonField<OffsetDateTime> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(empyrealCashDeposit: EmpyrealCashDeposit) = apply {
                        this.amount = empyrealCashDeposit.amount
                        this.bagId = empyrealCashDeposit.bagId
                        this.depositDate = empyrealCashDeposit.depositDate
                        additionalProperties(empyrealCashDeposit.additionalProperties)
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

                    fun bagId(bagId: String) = bagId(JsonField.of(bagId))

                    @JsonProperty("bag_id")
                    @ExcludeMissing
                    fun bagId(bagId: JsonField<String>) = apply { this.bagId = bagId }

                    fun depositDate(depositDate: OffsetDateTime) =
                        depositDate(JsonField.of(depositDate))

                    @JsonProperty("deposit_date")
                    @ExcludeMissing
                    fun depositDate(depositDate: JsonField<OffsetDateTime>) = apply {
                        this.depositDate = depositDate
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

                    fun build(): EmpyrealCashDeposit =
                        EmpyrealCashDeposit(
                            amount,
                            bagId,
                            depositDate,
                            additionalProperties.toUnmodifiable(),
                        )
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
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /**
                 * The amount in the minor unit of the transaction's currency. For dollars, for
                 * example, this is cents.
                 */
                fun amount(): Long = amount.getRequired("amount")

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction
                 * currency.
                 */
                fun currency(): Currency = currency.getRequired("currency")

                /**
                 * The amount in the minor unit of the transaction's currency. For dollars, for
                 * example, this is cents.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction
                 * currency.
                 */
                @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate() = apply {
                    if (!validated) {
                        amount()
                        currency()
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
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                amount,
                                currency,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "FeePayment{amount=$amount, currency=$currency, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var amount: JsonField<Long> = JsonMissing.of()
                    private var currency: JsonField<Currency> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(feePayment: FeePayment) = apply {
                        this.amount = feePayment.amount
                        this.currency = feePayment.currency
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
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                     * transaction currency.
                     */
                    fun currency(currency: Currency) = currency(JsonField.of(currency))

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                     * transaction currency.
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

                    fun build(): FeePayment =
                        FeePayment(
                            amount,
                            currency,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class Currency
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) {

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

            /**
             * A Inbound ACH Transfer object. This field will be present in the JSON response if and
             * only if `category` is equal to `inbound_ach_transfer`.
             */
            @JsonDeserialize(builder = InboundAchTransfer.Builder::class)
            @NoAutoDetect
            class InboundAchTransfer
            private constructor(
                private val amount: JsonField<Long>,
                private val originatorCompanyName: JsonField<String>,
                private val originatorCompanyDescriptiveDate: JsonField<String>,
                private val originatorCompanyDiscretionaryData: JsonField<String>,
                private val originatorCompanyEntryDescription: JsonField<String>,
                private val originatorCompanyId: JsonField<String>,
                private val receiverIdNumber: JsonField<String>,
                private val receiverName: JsonField<String>,
                private val traceNumber: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /**
                 * The amount in the minor unit of the destination account currency. For dollars,
                 * for example, this is cents.
                 */
                fun amount(): Long = amount.getRequired("amount")

                fun originatorCompanyName(): String =
                    originatorCompanyName.getRequired("originator_company_name")

                fun originatorCompanyDescriptiveDate(): Optional<String> =
                    Optional.ofNullable(
                        originatorCompanyDescriptiveDate.getNullable(
                            "originator_company_descriptive_date"
                        )
                    )

                fun originatorCompanyDiscretionaryData(): Optional<String> =
                    Optional.ofNullable(
                        originatorCompanyDiscretionaryData.getNullable(
                            "originator_company_discretionary_data"
                        )
                    )

                fun originatorCompanyEntryDescription(): String =
                    originatorCompanyEntryDescription.getRequired(
                        "originator_company_entry_description"
                    )

                fun originatorCompanyId(): String =
                    originatorCompanyId.getRequired("originator_company_id")

                fun receiverIdNumber(): Optional<String> =
                    Optional.ofNullable(receiverIdNumber.getNullable("receiver_id_number"))

                fun receiverName(): Optional<String> =
                    Optional.ofNullable(receiverName.getNullable("receiver_name"))

                fun traceNumber(): String = traceNumber.getRequired("trace_number")

                /**
                 * The amount in the minor unit of the destination account currency. For dollars,
                 * for example, this is cents.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

                @JsonProperty("originator_company_name")
                @ExcludeMissing
                fun _originatorCompanyName() = originatorCompanyName

                @JsonProperty("originator_company_descriptive_date")
                @ExcludeMissing
                fun _originatorCompanyDescriptiveDate() = originatorCompanyDescriptiveDate

                @JsonProperty("originator_company_discretionary_data")
                @ExcludeMissing
                fun _originatorCompanyDiscretionaryData() = originatorCompanyDiscretionaryData

                @JsonProperty("originator_company_entry_description")
                @ExcludeMissing
                fun _originatorCompanyEntryDescription() = originatorCompanyEntryDescription

                @JsonProperty("originator_company_id")
                @ExcludeMissing
                fun _originatorCompanyId() = originatorCompanyId

                @JsonProperty("receiver_id_number")
                @ExcludeMissing
                fun _receiverIdNumber() = receiverIdNumber

                @JsonProperty("receiver_name") @ExcludeMissing fun _receiverName() = receiverName

                @JsonProperty("trace_number") @ExcludeMissing fun _traceNumber() = traceNumber

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate() = apply {
                    if (!validated) {
                        amount()
                        originatorCompanyName()
                        originatorCompanyDescriptiveDate()
                        originatorCompanyDiscretionaryData()
                        originatorCompanyEntryDescription()
                        originatorCompanyId()
                        receiverIdNumber()
                        receiverName()
                        traceNumber()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is InboundAchTransfer &&
                        this.amount == other.amount &&
                        this.originatorCompanyName == other.originatorCompanyName &&
                        this.originatorCompanyDescriptiveDate ==
                            other.originatorCompanyDescriptiveDate &&
                        this.originatorCompanyDiscretionaryData ==
                            other.originatorCompanyDiscretionaryData &&
                        this.originatorCompanyEntryDescription ==
                            other.originatorCompanyEntryDescription &&
                        this.originatorCompanyId == other.originatorCompanyId &&
                        this.receiverIdNumber == other.receiverIdNumber &&
                        this.receiverName == other.receiverName &&
                        this.traceNumber == other.traceNumber &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                amount,
                                originatorCompanyName,
                                originatorCompanyDescriptiveDate,
                                originatorCompanyDiscretionaryData,
                                originatorCompanyEntryDescription,
                                originatorCompanyId,
                                receiverIdNumber,
                                receiverName,
                                traceNumber,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "InboundAchTransfer{amount=$amount, originatorCompanyName=$originatorCompanyName, originatorCompanyDescriptiveDate=$originatorCompanyDescriptiveDate, originatorCompanyDiscretionaryData=$originatorCompanyDiscretionaryData, originatorCompanyEntryDescription=$originatorCompanyEntryDescription, originatorCompanyId=$originatorCompanyId, receiverIdNumber=$receiverIdNumber, receiverName=$receiverName, traceNumber=$traceNumber, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var amount: JsonField<Long> = JsonMissing.of()
                    private var originatorCompanyName: JsonField<String> = JsonMissing.of()
                    private var originatorCompanyDescriptiveDate: JsonField<String> =
                        JsonMissing.of()
                    private var originatorCompanyDiscretionaryData: JsonField<String> =
                        JsonMissing.of()
                    private var originatorCompanyEntryDescription: JsonField<String> =
                        JsonMissing.of()
                    private var originatorCompanyId: JsonField<String> = JsonMissing.of()
                    private var receiverIdNumber: JsonField<String> = JsonMissing.of()
                    private var receiverName: JsonField<String> = JsonMissing.of()
                    private var traceNumber: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(inboundAchTransfer: InboundAchTransfer) = apply {
                        this.amount = inboundAchTransfer.amount
                        this.originatorCompanyName = inboundAchTransfer.originatorCompanyName
                        this.originatorCompanyDescriptiveDate =
                            inboundAchTransfer.originatorCompanyDescriptiveDate
                        this.originatorCompanyDiscretionaryData =
                            inboundAchTransfer.originatorCompanyDiscretionaryData
                        this.originatorCompanyEntryDescription =
                            inboundAchTransfer.originatorCompanyEntryDescription
                        this.originatorCompanyId = inboundAchTransfer.originatorCompanyId
                        this.receiverIdNumber = inboundAchTransfer.receiverIdNumber
                        this.receiverName = inboundAchTransfer.receiverName
                        this.traceNumber = inboundAchTransfer.traceNumber
                        additionalProperties(inboundAchTransfer.additionalProperties)
                    }

                    /**
                     * The amount in the minor unit of the destination account currency. For
                     * dollars, for example, this is cents.
                     */
                    fun amount(amount: Long) = amount(JsonField.of(amount))

                    /**
                     * The amount in the minor unit of the destination account currency. For
                     * dollars, for example, this is cents.
                     */
                    @JsonProperty("amount")
                    @ExcludeMissing
                    fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                    fun originatorCompanyName(originatorCompanyName: String) =
                        originatorCompanyName(JsonField.of(originatorCompanyName))

                    @JsonProperty("originator_company_name")
                    @ExcludeMissing
                    fun originatorCompanyName(originatorCompanyName: JsonField<String>) = apply {
                        this.originatorCompanyName = originatorCompanyName
                    }

                    fun originatorCompanyDescriptiveDate(originatorCompanyDescriptiveDate: String) =
                        originatorCompanyDescriptiveDate(
                            JsonField.of(originatorCompanyDescriptiveDate)
                        )

                    @JsonProperty("originator_company_descriptive_date")
                    @ExcludeMissing
                    fun originatorCompanyDescriptiveDate(
                        originatorCompanyDescriptiveDate: JsonField<String>
                    ) = apply {
                        this.originatorCompanyDescriptiveDate = originatorCompanyDescriptiveDate
                    }

                    fun originatorCompanyDiscretionaryData(
                        originatorCompanyDiscretionaryData: String
                    ) =
                        originatorCompanyDiscretionaryData(
                            JsonField.of(originatorCompanyDiscretionaryData)
                        )

                    @JsonProperty("originator_company_discretionary_data")
                    @ExcludeMissing
                    fun originatorCompanyDiscretionaryData(
                        originatorCompanyDiscretionaryData: JsonField<String>
                    ) = apply {
                        this.originatorCompanyDiscretionaryData = originatorCompanyDiscretionaryData
                    }

                    fun originatorCompanyEntryDescription(
                        originatorCompanyEntryDescription: String
                    ) =
                        originatorCompanyEntryDescription(
                            JsonField.of(originatorCompanyEntryDescription)
                        )

                    @JsonProperty("originator_company_entry_description")
                    @ExcludeMissing
                    fun originatorCompanyEntryDescription(
                        originatorCompanyEntryDescription: JsonField<String>
                    ) = apply {
                        this.originatorCompanyEntryDescription = originatorCompanyEntryDescription
                    }

                    fun originatorCompanyId(originatorCompanyId: String) =
                        originatorCompanyId(JsonField.of(originatorCompanyId))

                    @JsonProperty("originator_company_id")
                    @ExcludeMissing
                    fun originatorCompanyId(originatorCompanyId: JsonField<String>) = apply {
                        this.originatorCompanyId = originatorCompanyId
                    }

                    fun receiverIdNumber(receiverIdNumber: String) =
                        receiverIdNumber(JsonField.of(receiverIdNumber))

                    @JsonProperty("receiver_id_number")
                    @ExcludeMissing
                    fun receiverIdNumber(receiverIdNumber: JsonField<String>) = apply {
                        this.receiverIdNumber = receiverIdNumber
                    }

                    fun receiverName(receiverName: String) =
                        receiverName(JsonField.of(receiverName))

                    @JsonProperty("receiver_name")
                    @ExcludeMissing
                    fun receiverName(receiverName: JsonField<String>) = apply {
                        this.receiverName = receiverName
                    }

                    fun traceNumber(traceNumber: String) = traceNumber(JsonField.of(traceNumber))

                    @JsonProperty("trace_number")
                    @ExcludeMissing
                    fun traceNumber(traceNumber: JsonField<String>) = apply {
                        this.traceNumber = traceNumber
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
                            amount,
                            originatorCompanyName,
                            originatorCompanyDescriptiveDate,
                            originatorCompanyDiscretionaryData,
                            originatorCompanyEntryDescription,
                            originatorCompanyId,
                            receiverIdNumber,
                            receiverName,
                            traceNumber,
                            additionalProperties.toUnmodifiable(),
                        )
                }
            }

            /**
             * A Inbound Check object. This field will be present in the JSON response if and only
             * if `category` is equal to `inbound_check`.
             */
            @JsonDeserialize(builder = InboundCheck.Builder::class)
            @NoAutoDetect
            class InboundCheck
            private constructor(
                private val amount: JsonField<Long>,
                private val currency: JsonField<Currency>,
                private val checkNumber: JsonField<String>,
                private val checkFrontImageFileId: JsonField<String>,
                private val checkRearImageFileId: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /**
                 * The amount in the minor unit of the destination account currency. For dollars,
                 * for example, this is cents.
                 */
                fun amount(): Long = amount.getRequired("amount")

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
                 * currency.
                 */
                fun currency(): Currency = currency.getRequired("currency")

                fun checkNumber(): Optional<String> =
                    Optional.ofNullable(checkNumber.getNullable("check_number"))

                fun checkFrontImageFileId(): Optional<String> =
                    Optional.ofNullable(
                        checkFrontImageFileId.getNullable("check_front_image_file_id")
                    )

                fun checkRearImageFileId(): Optional<String> =
                    Optional.ofNullable(
                        checkRearImageFileId.getNullable("check_rear_image_file_id")
                    )

                /**
                 * The amount in the minor unit of the destination account currency. For dollars,
                 * for example, this is cents.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
                 * currency.
                 */
                @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

                @JsonProperty("check_number") @ExcludeMissing fun _checkNumber() = checkNumber

                @JsonProperty("check_front_image_file_id")
                @ExcludeMissing
                fun _checkFrontImageFileId() = checkFrontImageFileId

                @JsonProperty("check_rear_image_file_id")
                @ExcludeMissing
                fun _checkRearImageFileId() = checkRearImageFileId

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate() = apply {
                    if (!validated) {
                        amount()
                        currency()
                        checkNumber()
                        checkFrontImageFileId()
                        checkRearImageFileId()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is InboundCheck &&
                        this.amount == other.amount &&
                        this.currency == other.currency &&
                        this.checkNumber == other.checkNumber &&
                        this.checkFrontImageFileId == other.checkFrontImageFileId &&
                        this.checkRearImageFileId == other.checkRearImageFileId &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                amount,
                                currency,
                                checkNumber,
                                checkFrontImageFileId,
                                checkRearImageFileId,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "InboundCheck{amount=$amount, currency=$currency, checkNumber=$checkNumber, checkFrontImageFileId=$checkFrontImageFileId, checkRearImageFileId=$checkRearImageFileId, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var amount: JsonField<Long> = JsonMissing.of()
                    private var currency: JsonField<Currency> = JsonMissing.of()
                    private var checkNumber: JsonField<String> = JsonMissing.of()
                    private var checkFrontImageFileId: JsonField<String> = JsonMissing.of()
                    private var checkRearImageFileId: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(inboundCheck: InboundCheck) = apply {
                        this.amount = inboundCheck.amount
                        this.currency = inboundCheck.currency
                        this.checkNumber = inboundCheck.checkNumber
                        this.checkFrontImageFileId = inboundCheck.checkFrontImageFileId
                        this.checkRearImageFileId = inboundCheck.checkRearImageFileId
                        additionalProperties(inboundCheck.additionalProperties)
                    }

                    /**
                     * The amount in the minor unit of the destination account currency. For
                     * dollars, for example, this is cents.
                     */
                    fun amount(amount: Long) = amount(JsonField.of(amount))

                    /**
                     * The amount in the minor unit of the destination account currency. For
                     * dollars, for example, this is cents.
                     */
                    @JsonProperty("amount")
                    @ExcludeMissing
                    fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                     * transaction's currency.
                     */
                    fun currency(currency: Currency) = currency(JsonField.of(currency))

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                     * transaction's currency.
                     */
                    @JsonProperty("currency")
                    @ExcludeMissing
                    fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                    fun checkNumber(checkNumber: String) = checkNumber(JsonField.of(checkNumber))

                    @JsonProperty("check_number")
                    @ExcludeMissing
                    fun checkNumber(checkNumber: JsonField<String>) = apply {
                        this.checkNumber = checkNumber
                    }

                    fun checkFrontImageFileId(checkFrontImageFileId: String) =
                        checkFrontImageFileId(JsonField.of(checkFrontImageFileId))

                    @JsonProperty("check_front_image_file_id")
                    @ExcludeMissing
                    fun checkFrontImageFileId(checkFrontImageFileId: JsonField<String>) = apply {
                        this.checkFrontImageFileId = checkFrontImageFileId
                    }

                    fun checkRearImageFileId(checkRearImageFileId: String) =
                        checkRearImageFileId(JsonField.of(checkRearImageFileId))

                    @JsonProperty("check_rear_image_file_id")
                    @ExcludeMissing
                    fun checkRearImageFileId(checkRearImageFileId: JsonField<String>) = apply {
                        this.checkRearImageFileId = checkRearImageFileId
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

                    fun build(): InboundCheck =
                        InboundCheck(
                            amount,
                            currency,
                            checkNumber,
                            checkFrontImageFileId,
                            checkRearImageFileId,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class Currency
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) {

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

            /**
             * A Inbound International ACH Transfer object. This field will be present in the JSON
             * response if and only if `category` is equal to `inbound_international_ach_transfer`.
             */
            @JsonDeserialize(builder = InboundInternationalAchTransfer.Builder::class)
            @NoAutoDetect
            class InboundInternationalAchTransfer
            private constructor(
                private val amount: JsonField<Long>,
                private val foreignExchangeIndicator: JsonField<String>,
                private val foreignExchangeReferenceIndicator: JsonField<String>,
                private val foreignExchangeReference: JsonField<String>,
                private val destinationCountryCode: JsonField<String>,
                private val destinationCurrencyCode: JsonField<String>,
                private val foreignPaymentAmount: JsonField<Long>,
                private val foreignTraceNumber: JsonField<String>,
                private val internationalTransactionTypeCode: JsonField<String>,
                private val originatingCurrencyCode: JsonField<String>,
                private val originatingDepositoryFinancialInstitutionName: JsonField<String>,
                private val originatingDepositoryFinancialInstitutionIdQualifier: JsonField<String>,
                private val originatingDepositoryFinancialInstitutionId: JsonField<String>,
                private val originatingDepositoryFinancialInstitutionBranchCountry:
                    JsonField<String>,
                private val originatorCity: JsonField<String>,
                private val originatorCompanyEntryDescription: JsonField<String>,
                private val originatorCountry: JsonField<String>,
                private val originatorIdentification: JsonField<String>,
                private val originatorName: JsonField<String>,
                private val originatorPostalCode: JsonField<String>,
                private val originatorStreetAddress: JsonField<String>,
                private val originatorStateOrProvince: JsonField<String>,
                private val paymentRelatedInformation: JsonField<String>,
                private val paymentRelatedInformation2: JsonField<String>,
                private val receiverIdentificationNumber: JsonField<String>,
                private val receiverStreetAddress: JsonField<String>,
                private val receiverCity: JsonField<String>,
                private val receiverStateOrProvince: JsonField<String>,
                private val receiverCountry: JsonField<String>,
                private val receiverPostalCode: JsonField<String>,
                private val receivingCompanyOrIndividualName: JsonField<String>,
                private val receivingDepositoryFinancialInstitutionName: JsonField<String>,
                private val receivingDepositoryFinancialInstitutionIdQualifier: JsonField<String>,
                private val receivingDepositoryFinancialInstitutionId: JsonField<String>,
                private val receivingDepositoryFinancialInstitutionCountry: JsonField<String>,
                private val traceNumber: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /**
                 * The amount in the minor unit of the destination account currency. For dollars,
                 * for example, this is cents.
                 */
                fun amount(): Long = amount.getRequired("amount")

                fun foreignExchangeIndicator(): String =
                    foreignExchangeIndicator.getRequired("foreign_exchange_indicator")

                fun foreignExchangeReferenceIndicator(): String =
                    foreignExchangeReferenceIndicator.getRequired(
                        "foreign_exchange_reference_indicator"
                    )

                fun foreignExchangeReference(): Optional<String> =
                    Optional.ofNullable(
                        foreignExchangeReference.getNullable("foreign_exchange_reference")
                    )

                fun destinationCountryCode(): String =
                    destinationCountryCode.getRequired("destination_country_code")

                fun destinationCurrencyCode(): String =
                    destinationCurrencyCode.getRequired("destination_currency_code")

                fun foreignPaymentAmount(): Long =
                    foreignPaymentAmount.getRequired("foreign_payment_amount")

                fun foreignTraceNumber(): Optional<String> =
                    Optional.ofNullable(foreignTraceNumber.getNullable("foreign_trace_number"))

                fun internationalTransactionTypeCode(): String =
                    internationalTransactionTypeCode.getRequired(
                        "international_transaction_type_code"
                    )

                fun originatingCurrencyCode(): String =
                    originatingCurrencyCode.getRequired("originating_currency_code")

                fun originatingDepositoryFinancialInstitutionName(): String =
                    originatingDepositoryFinancialInstitutionName.getRequired(
                        "originating_depository_financial_institution_name"
                    )

                fun originatingDepositoryFinancialInstitutionIdQualifier(): String =
                    originatingDepositoryFinancialInstitutionIdQualifier.getRequired(
                        "originating_depository_financial_institution_id_qualifier"
                    )

                fun originatingDepositoryFinancialInstitutionId(): String =
                    originatingDepositoryFinancialInstitutionId.getRequired(
                        "originating_depository_financial_institution_id"
                    )

                fun originatingDepositoryFinancialInstitutionBranchCountry(): String =
                    originatingDepositoryFinancialInstitutionBranchCountry.getRequired(
                        "originating_depository_financial_institution_branch_country"
                    )

                fun originatorCity(): String = originatorCity.getRequired("originator_city")

                fun originatorCompanyEntryDescription(): String =
                    originatorCompanyEntryDescription.getRequired(
                        "originator_company_entry_description"
                    )

                fun originatorCountry(): String =
                    originatorCountry.getRequired("originator_country")

                fun originatorIdentification(): String =
                    originatorIdentification.getRequired("originator_identification")

                fun originatorName(): String = originatorName.getRequired("originator_name")

                fun originatorPostalCode(): Optional<String> =
                    Optional.ofNullable(originatorPostalCode.getNullable("originator_postal_code"))

                fun originatorStreetAddress(): String =
                    originatorStreetAddress.getRequired("originator_street_address")

                fun originatorStateOrProvince(): Optional<String> =
                    Optional.ofNullable(
                        originatorStateOrProvince.getNullable("originator_state_or_province")
                    )

                fun paymentRelatedInformation(): Optional<String> =
                    Optional.ofNullable(
                        paymentRelatedInformation.getNullable("payment_related_information")
                    )

                fun paymentRelatedInformation2(): Optional<String> =
                    Optional.ofNullable(
                        paymentRelatedInformation2.getNullable("payment_related_information2")
                    )

                fun receiverIdentificationNumber(): Optional<String> =
                    Optional.ofNullable(
                        receiverIdentificationNumber.getNullable("receiver_identification_number")
                    )

                fun receiverStreetAddress(): String =
                    receiverStreetAddress.getRequired("receiver_street_address")

                fun receiverCity(): String = receiverCity.getRequired("receiver_city")

                fun receiverStateOrProvince(): Optional<String> =
                    Optional.ofNullable(
                        receiverStateOrProvince.getNullable("receiver_state_or_province")
                    )

                fun receiverCountry(): String = receiverCountry.getRequired("receiver_country")

                fun receiverPostalCode(): Optional<String> =
                    Optional.ofNullable(receiverPostalCode.getNullable("receiver_postal_code"))

                fun receivingCompanyOrIndividualName(): String =
                    receivingCompanyOrIndividualName.getRequired(
                        "receiving_company_or_individual_name"
                    )

                fun receivingDepositoryFinancialInstitutionName(): String =
                    receivingDepositoryFinancialInstitutionName.getRequired(
                        "receiving_depository_financial_institution_name"
                    )

                fun receivingDepositoryFinancialInstitutionIdQualifier(): String =
                    receivingDepositoryFinancialInstitutionIdQualifier.getRequired(
                        "receiving_depository_financial_institution_id_qualifier"
                    )

                fun receivingDepositoryFinancialInstitutionId(): String =
                    receivingDepositoryFinancialInstitutionId.getRequired(
                        "receiving_depository_financial_institution_id"
                    )

                fun receivingDepositoryFinancialInstitutionCountry(): String =
                    receivingDepositoryFinancialInstitutionCountry.getRequired(
                        "receiving_depository_financial_institution_country"
                    )

                fun traceNumber(): String = traceNumber.getRequired("trace_number")

                /**
                 * The amount in the minor unit of the destination account currency. For dollars,
                 * for example, this is cents.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

                @JsonProperty("foreign_exchange_indicator")
                @ExcludeMissing
                fun _foreignExchangeIndicator() = foreignExchangeIndicator

                @JsonProperty("foreign_exchange_reference_indicator")
                @ExcludeMissing
                fun _foreignExchangeReferenceIndicator() = foreignExchangeReferenceIndicator

                @JsonProperty("foreign_exchange_reference")
                @ExcludeMissing
                fun _foreignExchangeReference() = foreignExchangeReference

                @JsonProperty("destination_country_code")
                @ExcludeMissing
                fun _destinationCountryCode() = destinationCountryCode

                @JsonProperty("destination_currency_code")
                @ExcludeMissing
                fun _destinationCurrencyCode() = destinationCurrencyCode

                @JsonProperty("foreign_payment_amount")
                @ExcludeMissing
                fun _foreignPaymentAmount() = foreignPaymentAmount

                @JsonProperty("foreign_trace_number")
                @ExcludeMissing
                fun _foreignTraceNumber() = foreignTraceNumber

                @JsonProperty("international_transaction_type_code")
                @ExcludeMissing
                fun _internationalTransactionTypeCode() = internationalTransactionTypeCode

                @JsonProperty("originating_currency_code")
                @ExcludeMissing
                fun _originatingCurrencyCode() = originatingCurrencyCode

                @JsonProperty("originating_depository_financial_institution_name")
                @ExcludeMissing
                fun _originatingDepositoryFinancialInstitutionName() =
                    originatingDepositoryFinancialInstitutionName

                @JsonProperty("originating_depository_financial_institution_id_qualifier")
                @ExcludeMissing
                fun _originatingDepositoryFinancialInstitutionIdQualifier() =
                    originatingDepositoryFinancialInstitutionIdQualifier

                @JsonProperty("originating_depository_financial_institution_id")
                @ExcludeMissing
                fun _originatingDepositoryFinancialInstitutionId() =
                    originatingDepositoryFinancialInstitutionId

                @JsonProperty("originating_depository_financial_institution_branch_country")
                @ExcludeMissing
                fun _originatingDepositoryFinancialInstitutionBranchCountry() =
                    originatingDepositoryFinancialInstitutionBranchCountry

                @JsonProperty("originator_city")
                @ExcludeMissing
                fun _originatorCity() = originatorCity

                @JsonProperty("originator_company_entry_description")
                @ExcludeMissing
                fun _originatorCompanyEntryDescription() = originatorCompanyEntryDescription

                @JsonProperty("originator_country")
                @ExcludeMissing
                fun _originatorCountry() = originatorCountry

                @JsonProperty("originator_identification")
                @ExcludeMissing
                fun _originatorIdentification() = originatorIdentification

                @JsonProperty("originator_name")
                @ExcludeMissing
                fun _originatorName() = originatorName

                @JsonProperty("originator_postal_code")
                @ExcludeMissing
                fun _originatorPostalCode() = originatorPostalCode

                @JsonProperty("originator_street_address")
                @ExcludeMissing
                fun _originatorStreetAddress() = originatorStreetAddress

                @JsonProperty("originator_state_or_province")
                @ExcludeMissing
                fun _originatorStateOrProvince() = originatorStateOrProvince

                @JsonProperty("payment_related_information")
                @ExcludeMissing
                fun _paymentRelatedInformation() = paymentRelatedInformation

                @JsonProperty("payment_related_information2")
                @ExcludeMissing
                fun _paymentRelatedInformation2() = paymentRelatedInformation2

                @JsonProperty("receiver_identification_number")
                @ExcludeMissing
                fun _receiverIdentificationNumber() = receiverIdentificationNumber

                @JsonProperty("receiver_street_address")
                @ExcludeMissing
                fun _receiverStreetAddress() = receiverStreetAddress

                @JsonProperty("receiver_city") @ExcludeMissing fun _receiverCity() = receiverCity

                @JsonProperty("receiver_state_or_province")
                @ExcludeMissing
                fun _receiverStateOrProvince() = receiverStateOrProvince

                @JsonProperty("receiver_country")
                @ExcludeMissing
                fun _receiverCountry() = receiverCountry

                @JsonProperty("receiver_postal_code")
                @ExcludeMissing
                fun _receiverPostalCode() = receiverPostalCode

                @JsonProperty("receiving_company_or_individual_name")
                @ExcludeMissing
                fun _receivingCompanyOrIndividualName() = receivingCompanyOrIndividualName

                @JsonProperty("receiving_depository_financial_institution_name")
                @ExcludeMissing
                fun _receivingDepositoryFinancialInstitutionName() =
                    receivingDepositoryFinancialInstitutionName

                @JsonProperty("receiving_depository_financial_institution_id_qualifier")
                @ExcludeMissing
                fun _receivingDepositoryFinancialInstitutionIdQualifier() =
                    receivingDepositoryFinancialInstitutionIdQualifier

                @JsonProperty("receiving_depository_financial_institution_id")
                @ExcludeMissing
                fun _receivingDepositoryFinancialInstitutionId() =
                    receivingDepositoryFinancialInstitutionId

                @JsonProperty("receiving_depository_financial_institution_country")
                @ExcludeMissing
                fun _receivingDepositoryFinancialInstitutionCountry() =
                    receivingDepositoryFinancialInstitutionCountry

                @JsonProperty("trace_number") @ExcludeMissing fun _traceNumber() = traceNumber

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate() = apply {
                    if (!validated) {
                        amount()
                        foreignExchangeIndicator()
                        foreignExchangeReferenceIndicator()
                        foreignExchangeReference()
                        destinationCountryCode()
                        destinationCurrencyCode()
                        foreignPaymentAmount()
                        foreignTraceNumber()
                        internationalTransactionTypeCode()
                        originatingCurrencyCode()
                        originatingDepositoryFinancialInstitutionName()
                        originatingDepositoryFinancialInstitutionIdQualifier()
                        originatingDepositoryFinancialInstitutionId()
                        originatingDepositoryFinancialInstitutionBranchCountry()
                        originatorCity()
                        originatorCompanyEntryDescription()
                        originatorCountry()
                        originatorIdentification()
                        originatorName()
                        originatorPostalCode()
                        originatorStreetAddress()
                        originatorStateOrProvince()
                        paymentRelatedInformation()
                        paymentRelatedInformation2()
                        receiverIdentificationNumber()
                        receiverStreetAddress()
                        receiverCity()
                        receiverStateOrProvince()
                        receiverCountry()
                        receiverPostalCode()
                        receivingCompanyOrIndividualName()
                        receivingDepositoryFinancialInstitutionName()
                        receivingDepositoryFinancialInstitutionIdQualifier()
                        receivingDepositoryFinancialInstitutionId()
                        receivingDepositoryFinancialInstitutionCountry()
                        traceNumber()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is InboundInternationalAchTransfer &&
                        this.amount == other.amount &&
                        this.foreignExchangeIndicator == other.foreignExchangeIndicator &&
                        this.foreignExchangeReferenceIndicator ==
                            other.foreignExchangeReferenceIndicator &&
                        this.foreignExchangeReference == other.foreignExchangeReference &&
                        this.destinationCountryCode == other.destinationCountryCode &&
                        this.destinationCurrencyCode == other.destinationCurrencyCode &&
                        this.foreignPaymentAmount == other.foreignPaymentAmount &&
                        this.foreignTraceNumber == other.foreignTraceNumber &&
                        this.internationalTransactionTypeCode ==
                            other.internationalTransactionTypeCode &&
                        this.originatingCurrencyCode == other.originatingCurrencyCode &&
                        this.originatingDepositoryFinancialInstitutionName ==
                            other.originatingDepositoryFinancialInstitutionName &&
                        this.originatingDepositoryFinancialInstitutionIdQualifier ==
                            other.originatingDepositoryFinancialInstitutionIdQualifier &&
                        this.originatingDepositoryFinancialInstitutionId ==
                            other.originatingDepositoryFinancialInstitutionId &&
                        this.originatingDepositoryFinancialInstitutionBranchCountry ==
                            other.originatingDepositoryFinancialInstitutionBranchCountry &&
                        this.originatorCity == other.originatorCity &&
                        this.originatorCompanyEntryDescription ==
                            other.originatorCompanyEntryDescription &&
                        this.originatorCountry == other.originatorCountry &&
                        this.originatorIdentification == other.originatorIdentification &&
                        this.originatorName == other.originatorName &&
                        this.originatorPostalCode == other.originatorPostalCode &&
                        this.originatorStreetAddress == other.originatorStreetAddress &&
                        this.originatorStateOrProvince == other.originatorStateOrProvince &&
                        this.paymentRelatedInformation == other.paymentRelatedInformation &&
                        this.paymentRelatedInformation2 == other.paymentRelatedInformation2 &&
                        this.receiverIdentificationNumber == other.receiverIdentificationNumber &&
                        this.receiverStreetAddress == other.receiverStreetAddress &&
                        this.receiverCity == other.receiverCity &&
                        this.receiverStateOrProvince == other.receiverStateOrProvince &&
                        this.receiverCountry == other.receiverCountry &&
                        this.receiverPostalCode == other.receiverPostalCode &&
                        this.receivingCompanyOrIndividualName ==
                            other.receivingCompanyOrIndividualName &&
                        this.receivingDepositoryFinancialInstitutionName ==
                            other.receivingDepositoryFinancialInstitutionName &&
                        this.receivingDepositoryFinancialInstitutionIdQualifier ==
                            other.receivingDepositoryFinancialInstitutionIdQualifier &&
                        this.receivingDepositoryFinancialInstitutionId ==
                            other.receivingDepositoryFinancialInstitutionId &&
                        this.receivingDepositoryFinancialInstitutionCountry ==
                            other.receivingDepositoryFinancialInstitutionCountry &&
                        this.traceNumber == other.traceNumber &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                amount,
                                foreignExchangeIndicator,
                                foreignExchangeReferenceIndicator,
                                foreignExchangeReference,
                                destinationCountryCode,
                                destinationCurrencyCode,
                                foreignPaymentAmount,
                                foreignTraceNumber,
                                internationalTransactionTypeCode,
                                originatingCurrencyCode,
                                originatingDepositoryFinancialInstitutionName,
                                originatingDepositoryFinancialInstitutionIdQualifier,
                                originatingDepositoryFinancialInstitutionId,
                                originatingDepositoryFinancialInstitutionBranchCountry,
                                originatorCity,
                                originatorCompanyEntryDescription,
                                originatorCountry,
                                originatorIdentification,
                                originatorName,
                                originatorPostalCode,
                                originatorStreetAddress,
                                originatorStateOrProvince,
                                paymentRelatedInformation,
                                paymentRelatedInformation2,
                                receiverIdentificationNumber,
                                receiverStreetAddress,
                                receiverCity,
                                receiverStateOrProvince,
                                receiverCountry,
                                receiverPostalCode,
                                receivingCompanyOrIndividualName,
                                receivingDepositoryFinancialInstitutionName,
                                receivingDepositoryFinancialInstitutionIdQualifier,
                                receivingDepositoryFinancialInstitutionId,
                                receivingDepositoryFinancialInstitutionCountry,
                                traceNumber,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "InboundInternationalAchTransfer{amount=$amount, foreignExchangeIndicator=$foreignExchangeIndicator, foreignExchangeReferenceIndicator=$foreignExchangeReferenceIndicator, foreignExchangeReference=$foreignExchangeReference, destinationCountryCode=$destinationCountryCode, destinationCurrencyCode=$destinationCurrencyCode, foreignPaymentAmount=$foreignPaymentAmount, foreignTraceNumber=$foreignTraceNumber, internationalTransactionTypeCode=$internationalTransactionTypeCode, originatingCurrencyCode=$originatingCurrencyCode, originatingDepositoryFinancialInstitutionName=$originatingDepositoryFinancialInstitutionName, originatingDepositoryFinancialInstitutionIdQualifier=$originatingDepositoryFinancialInstitutionIdQualifier, originatingDepositoryFinancialInstitutionId=$originatingDepositoryFinancialInstitutionId, originatingDepositoryFinancialInstitutionBranchCountry=$originatingDepositoryFinancialInstitutionBranchCountry, originatorCity=$originatorCity, originatorCompanyEntryDescription=$originatorCompanyEntryDescription, originatorCountry=$originatorCountry, originatorIdentification=$originatorIdentification, originatorName=$originatorName, originatorPostalCode=$originatorPostalCode, originatorStreetAddress=$originatorStreetAddress, originatorStateOrProvince=$originatorStateOrProvince, paymentRelatedInformation=$paymentRelatedInformation, paymentRelatedInformation2=$paymentRelatedInformation2, receiverIdentificationNumber=$receiverIdentificationNumber, receiverStreetAddress=$receiverStreetAddress, receiverCity=$receiverCity, receiverStateOrProvince=$receiverStateOrProvince, receiverCountry=$receiverCountry, receiverPostalCode=$receiverPostalCode, receivingCompanyOrIndividualName=$receivingCompanyOrIndividualName, receivingDepositoryFinancialInstitutionName=$receivingDepositoryFinancialInstitutionName, receivingDepositoryFinancialInstitutionIdQualifier=$receivingDepositoryFinancialInstitutionIdQualifier, receivingDepositoryFinancialInstitutionId=$receivingDepositoryFinancialInstitutionId, receivingDepositoryFinancialInstitutionCountry=$receivingDepositoryFinancialInstitutionCountry, traceNumber=$traceNumber, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var amount: JsonField<Long> = JsonMissing.of()
                    private var foreignExchangeIndicator: JsonField<String> = JsonMissing.of()
                    private var foreignExchangeReferenceIndicator: JsonField<String> =
                        JsonMissing.of()
                    private var foreignExchangeReference: JsonField<String> = JsonMissing.of()
                    private var destinationCountryCode: JsonField<String> = JsonMissing.of()
                    private var destinationCurrencyCode: JsonField<String> = JsonMissing.of()
                    private var foreignPaymentAmount: JsonField<Long> = JsonMissing.of()
                    private var foreignTraceNumber: JsonField<String> = JsonMissing.of()
                    private var internationalTransactionTypeCode: JsonField<String> =
                        JsonMissing.of()
                    private var originatingCurrencyCode: JsonField<String> = JsonMissing.of()
                    private var originatingDepositoryFinancialInstitutionName: JsonField<String> =
                        JsonMissing.of()
                    private var originatingDepositoryFinancialInstitutionIdQualifier:
                        JsonField<String> =
                        JsonMissing.of()
                    private var originatingDepositoryFinancialInstitutionId: JsonField<String> =
                        JsonMissing.of()
                    private var originatingDepositoryFinancialInstitutionBranchCountry:
                        JsonField<String> =
                        JsonMissing.of()
                    private var originatorCity: JsonField<String> = JsonMissing.of()
                    private var originatorCompanyEntryDescription: JsonField<String> =
                        JsonMissing.of()
                    private var originatorCountry: JsonField<String> = JsonMissing.of()
                    private var originatorIdentification: JsonField<String> = JsonMissing.of()
                    private var originatorName: JsonField<String> = JsonMissing.of()
                    private var originatorPostalCode: JsonField<String> = JsonMissing.of()
                    private var originatorStreetAddress: JsonField<String> = JsonMissing.of()
                    private var originatorStateOrProvince: JsonField<String> = JsonMissing.of()
                    private var paymentRelatedInformation: JsonField<String> = JsonMissing.of()
                    private var paymentRelatedInformation2: JsonField<String> = JsonMissing.of()
                    private var receiverIdentificationNumber: JsonField<String> = JsonMissing.of()
                    private var receiverStreetAddress: JsonField<String> = JsonMissing.of()
                    private var receiverCity: JsonField<String> = JsonMissing.of()
                    private var receiverStateOrProvince: JsonField<String> = JsonMissing.of()
                    private var receiverCountry: JsonField<String> = JsonMissing.of()
                    private var receiverPostalCode: JsonField<String> = JsonMissing.of()
                    private var receivingCompanyOrIndividualName: JsonField<String> =
                        JsonMissing.of()
                    private var receivingDepositoryFinancialInstitutionName: JsonField<String> =
                        JsonMissing.of()
                    private var receivingDepositoryFinancialInstitutionIdQualifier:
                        JsonField<String> =
                        JsonMissing.of()
                    private var receivingDepositoryFinancialInstitutionId: JsonField<String> =
                        JsonMissing.of()
                    private var receivingDepositoryFinancialInstitutionCountry: JsonField<String> =
                        JsonMissing.of()
                    private var traceNumber: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(
                        inboundInternationalAchTransfer: InboundInternationalAchTransfer
                    ) = apply {
                        this.amount = inboundInternationalAchTransfer.amount
                        this.foreignExchangeIndicator =
                            inboundInternationalAchTransfer.foreignExchangeIndicator
                        this.foreignExchangeReferenceIndicator =
                            inboundInternationalAchTransfer.foreignExchangeReferenceIndicator
                        this.foreignExchangeReference =
                            inboundInternationalAchTransfer.foreignExchangeReference
                        this.destinationCountryCode =
                            inboundInternationalAchTransfer.destinationCountryCode
                        this.destinationCurrencyCode =
                            inboundInternationalAchTransfer.destinationCurrencyCode
                        this.foreignPaymentAmount =
                            inboundInternationalAchTransfer.foreignPaymentAmount
                        this.foreignTraceNumber = inboundInternationalAchTransfer.foreignTraceNumber
                        this.internationalTransactionTypeCode =
                            inboundInternationalAchTransfer.internationalTransactionTypeCode
                        this.originatingCurrencyCode =
                            inboundInternationalAchTransfer.originatingCurrencyCode
                        this.originatingDepositoryFinancialInstitutionName =
                            inboundInternationalAchTransfer
                                .originatingDepositoryFinancialInstitutionName
                        this.originatingDepositoryFinancialInstitutionIdQualifier =
                            inboundInternationalAchTransfer
                                .originatingDepositoryFinancialInstitutionIdQualifier
                        this.originatingDepositoryFinancialInstitutionId =
                            inboundInternationalAchTransfer
                                .originatingDepositoryFinancialInstitutionId
                        this.originatingDepositoryFinancialInstitutionBranchCountry =
                            inboundInternationalAchTransfer
                                .originatingDepositoryFinancialInstitutionBranchCountry
                        this.originatorCity = inboundInternationalAchTransfer.originatorCity
                        this.originatorCompanyEntryDescription =
                            inboundInternationalAchTransfer.originatorCompanyEntryDescription
                        this.originatorCountry = inboundInternationalAchTransfer.originatorCountry
                        this.originatorIdentification =
                            inboundInternationalAchTransfer.originatorIdentification
                        this.originatorName = inboundInternationalAchTransfer.originatorName
                        this.originatorPostalCode =
                            inboundInternationalAchTransfer.originatorPostalCode
                        this.originatorStreetAddress =
                            inboundInternationalAchTransfer.originatorStreetAddress
                        this.originatorStateOrProvince =
                            inboundInternationalAchTransfer.originatorStateOrProvince
                        this.paymentRelatedInformation =
                            inboundInternationalAchTransfer.paymentRelatedInformation
                        this.paymentRelatedInformation2 =
                            inboundInternationalAchTransfer.paymentRelatedInformation2
                        this.receiverIdentificationNumber =
                            inboundInternationalAchTransfer.receiverIdentificationNumber
                        this.receiverStreetAddress =
                            inboundInternationalAchTransfer.receiverStreetAddress
                        this.receiverCity = inboundInternationalAchTransfer.receiverCity
                        this.receiverStateOrProvince =
                            inboundInternationalAchTransfer.receiverStateOrProvince
                        this.receiverCountry = inboundInternationalAchTransfer.receiverCountry
                        this.receiverPostalCode = inboundInternationalAchTransfer.receiverPostalCode
                        this.receivingCompanyOrIndividualName =
                            inboundInternationalAchTransfer.receivingCompanyOrIndividualName
                        this.receivingDepositoryFinancialInstitutionName =
                            inboundInternationalAchTransfer
                                .receivingDepositoryFinancialInstitutionName
                        this.receivingDepositoryFinancialInstitutionIdQualifier =
                            inboundInternationalAchTransfer
                                .receivingDepositoryFinancialInstitutionIdQualifier
                        this.receivingDepositoryFinancialInstitutionId =
                            inboundInternationalAchTransfer
                                .receivingDepositoryFinancialInstitutionId
                        this.receivingDepositoryFinancialInstitutionCountry =
                            inboundInternationalAchTransfer
                                .receivingDepositoryFinancialInstitutionCountry
                        this.traceNumber = inboundInternationalAchTransfer.traceNumber
                        additionalProperties(inboundInternationalAchTransfer.additionalProperties)
                    }

                    /**
                     * The amount in the minor unit of the destination account currency. For
                     * dollars, for example, this is cents.
                     */
                    fun amount(amount: Long) = amount(JsonField.of(amount))

                    /**
                     * The amount in the minor unit of the destination account currency. For
                     * dollars, for example, this is cents.
                     */
                    @JsonProperty("amount")
                    @ExcludeMissing
                    fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                    fun foreignExchangeIndicator(foreignExchangeIndicator: String) =
                        foreignExchangeIndicator(JsonField.of(foreignExchangeIndicator))

                    @JsonProperty("foreign_exchange_indicator")
                    @ExcludeMissing
                    fun foreignExchangeIndicator(foreignExchangeIndicator: JsonField<String>) =
                        apply {
                            this.foreignExchangeIndicator = foreignExchangeIndicator
                        }

                    fun foreignExchangeReferenceIndicator(
                        foreignExchangeReferenceIndicator: String
                    ) =
                        foreignExchangeReferenceIndicator(
                            JsonField.of(foreignExchangeReferenceIndicator)
                        )

                    @JsonProperty("foreign_exchange_reference_indicator")
                    @ExcludeMissing
                    fun foreignExchangeReferenceIndicator(
                        foreignExchangeReferenceIndicator: JsonField<String>
                    ) = apply {
                        this.foreignExchangeReferenceIndicator = foreignExchangeReferenceIndicator
                    }

                    fun foreignExchangeReference(foreignExchangeReference: String) =
                        foreignExchangeReference(JsonField.of(foreignExchangeReference))

                    @JsonProperty("foreign_exchange_reference")
                    @ExcludeMissing
                    fun foreignExchangeReference(foreignExchangeReference: JsonField<String>) =
                        apply {
                            this.foreignExchangeReference = foreignExchangeReference
                        }

                    fun destinationCountryCode(destinationCountryCode: String) =
                        destinationCountryCode(JsonField.of(destinationCountryCode))

                    @JsonProperty("destination_country_code")
                    @ExcludeMissing
                    fun destinationCountryCode(destinationCountryCode: JsonField<String>) = apply {
                        this.destinationCountryCode = destinationCountryCode
                    }

                    fun destinationCurrencyCode(destinationCurrencyCode: String) =
                        destinationCurrencyCode(JsonField.of(destinationCurrencyCode))

                    @JsonProperty("destination_currency_code")
                    @ExcludeMissing
                    fun destinationCurrencyCode(destinationCurrencyCode: JsonField<String>) =
                        apply {
                            this.destinationCurrencyCode = destinationCurrencyCode
                        }

                    fun foreignPaymentAmount(foreignPaymentAmount: Long) =
                        foreignPaymentAmount(JsonField.of(foreignPaymentAmount))

                    @JsonProperty("foreign_payment_amount")
                    @ExcludeMissing
                    fun foreignPaymentAmount(foreignPaymentAmount: JsonField<Long>) = apply {
                        this.foreignPaymentAmount = foreignPaymentAmount
                    }

                    fun foreignTraceNumber(foreignTraceNumber: String) =
                        foreignTraceNumber(JsonField.of(foreignTraceNumber))

                    @JsonProperty("foreign_trace_number")
                    @ExcludeMissing
                    fun foreignTraceNumber(foreignTraceNumber: JsonField<String>) = apply {
                        this.foreignTraceNumber = foreignTraceNumber
                    }

                    fun internationalTransactionTypeCode(internationalTransactionTypeCode: String) =
                        internationalTransactionTypeCode(
                            JsonField.of(internationalTransactionTypeCode)
                        )

                    @JsonProperty("international_transaction_type_code")
                    @ExcludeMissing
                    fun internationalTransactionTypeCode(
                        internationalTransactionTypeCode: JsonField<String>
                    ) = apply {
                        this.internationalTransactionTypeCode = internationalTransactionTypeCode
                    }

                    fun originatingCurrencyCode(originatingCurrencyCode: String) =
                        originatingCurrencyCode(JsonField.of(originatingCurrencyCode))

                    @JsonProperty("originating_currency_code")
                    @ExcludeMissing
                    fun originatingCurrencyCode(originatingCurrencyCode: JsonField<String>) =
                        apply {
                            this.originatingCurrencyCode = originatingCurrencyCode
                        }

                    fun originatingDepositoryFinancialInstitutionName(
                        originatingDepositoryFinancialInstitutionName: String
                    ) =
                        originatingDepositoryFinancialInstitutionName(
                            JsonField.of(originatingDepositoryFinancialInstitutionName)
                        )

                    @JsonProperty("originating_depository_financial_institution_name")
                    @ExcludeMissing
                    fun originatingDepositoryFinancialInstitutionName(
                        originatingDepositoryFinancialInstitutionName: JsonField<String>
                    ) = apply {
                        this.originatingDepositoryFinancialInstitutionName =
                            originatingDepositoryFinancialInstitutionName
                    }

                    fun originatingDepositoryFinancialInstitutionIdQualifier(
                        originatingDepositoryFinancialInstitutionIdQualifier: String
                    ) =
                        originatingDepositoryFinancialInstitutionIdQualifier(
                            JsonField.of(originatingDepositoryFinancialInstitutionIdQualifier)
                        )

                    @JsonProperty("originating_depository_financial_institution_id_qualifier")
                    @ExcludeMissing
                    fun originatingDepositoryFinancialInstitutionIdQualifier(
                        originatingDepositoryFinancialInstitutionIdQualifier: JsonField<String>
                    ) = apply {
                        this.originatingDepositoryFinancialInstitutionIdQualifier =
                            originatingDepositoryFinancialInstitutionIdQualifier
                    }

                    fun originatingDepositoryFinancialInstitutionId(
                        originatingDepositoryFinancialInstitutionId: String
                    ) =
                        originatingDepositoryFinancialInstitutionId(
                            JsonField.of(originatingDepositoryFinancialInstitutionId)
                        )

                    @JsonProperty("originating_depository_financial_institution_id")
                    @ExcludeMissing
                    fun originatingDepositoryFinancialInstitutionId(
                        originatingDepositoryFinancialInstitutionId: JsonField<String>
                    ) = apply {
                        this.originatingDepositoryFinancialInstitutionId =
                            originatingDepositoryFinancialInstitutionId
                    }

                    fun originatingDepositoryFinancialInstitutionBranchCountry(
                        originatingDepositoryFinancialInstitutionBranchCountry: String
                    ) =
                        originatingDepositoryFinancialInstitutionBranchCountry(
                            JsonField.of(originatingDepositoryFinancialInstitutionBranchCountry)
                        )

                    @JsonProperty("originating_depository_financial_institution_branch_country")
                    @ExcludeMissing
                    fun originatingDepositoryFinancialInstitutionBranchCountry(
                        originatingDepositoryFinancialInstitutionBranchCountry: JsonField<String>
                    ) = apply {
                        this.originatingDepositoryFinancialInstitutionBranchCountry =
                            originatingDepositoryFinancialInstitutionBranchCountry
                    }

                    fun originatorCity(originatorCity: String) =
                        originatorCity(JsonField.of(originatorCity))

                    @JsonProperty("originator_city")
                    @ExcludeMissing
                    fun originatorCity(originatorCity: JsonField<String>) = apply {
                        this.originatorCity = originatorCity
                    }

                    fun originatorCompanyEntryDescription(
                        originatorCompanyEntryDescription: String
                    ) =
                        originatorCompanyEntryDescription(
                            JsonField.of(originatorCompanyEntryDescription)
                        )

                    @JsonProperty("originator_company_entry_description")
                    @ExcludeMissing
                    fun originatorCompanyEntryDescription(
                        originatorCompanyEntryDescription: JsonField<String>
                    ) = apply {
                        this.originatorCompanyEntryDescription = originatorCompanyEntryDescription
                    }

                    fun originatorCountry(originatorCountry: String) =
                        originatorCountry(JsonField.of(originatorCountry))

                    @JsonProperty("originator_country")
                    @ExcludeMissing
                    fun originatorCountry(originatorCountry: JsonField<String>) = apply {
                        this.originatorCountry = originatorCountry
                    }

                    fun originatorIdentification(originatorIdentification: String) =
                        originatorIdentification(JsonField.of(originatorIdentification))

                    @JsonProperty("originator_identification")
                    @ExcludeMissing
                    fun originatorIdentification(originatorIdentification: JsonField<String>) =
                        apply {
                            this.originatorIdentification = originatorIdentification
                        }

                    fun originatorName(originatorName: String) =
                        originatorName(JsonField.of(originatorName))

                    @JsonProperty("originator_name")
                    @ExcludeMissing
                    fun originatorName(originatorName: JsonField<String>) = apply {
                        this.originatorName = originatorName
                    }

                    fun originatorPostalCode(originatorPostalCode: String) =
                        originatorPostalCode(JsonField.of(originatorPostalCode))

                    @JsonProperty("originator_postal_code")
                    @ExcludeMissing
                    fun originatorPostalCode(originatorPostalCode: JsonField<String>) = apply {
                        this.originatorPostalCode = originatorPostalCode
                    }

                    fun originatorStreetAddress(originatorStreetAddress: String) =
                        originatorStreetAddress(JsonField.of(originatorStreetAddress))

                    @JsonProperty("originator_street_address")
                    @ExcludeMissing
                    fun originatorStreetAddress(originatorStreetAddress: JsonField<String>) =
                        apply {
                            this.originatorStreetAddress = originatorStreetAddress
                        }

                    fun originatorStateOrProvince(originatorStateOrProvince: String) =
                        originatorStateOrProvince(JsonField.of(originatorStateOrProvince))

                    @JsonProperty("originator_state_or_province")
                    @ExcludeMissing
                    fun originatorStateOrProvince(originatorStateOrProvince: JsonField<String>) =
                        apply {
                            this.originatorStateOrProvince = originatorStateOrProvince
                        }

                    fun paymentRelatedInformation(paymentRelatedInformation: String) =
                        paymentRelatedInformation(JsonField.of(paymentRelatedInformation))

                    @JsonProperty("payment_related_information")
                    @ExcludeMissing
                    fun paymentRelatedInformation(paymentRelatedInformation: JsonField<String>) =
                        apply {
                            this.paymentRelatedInformation = paymentRelatedInformation
                        }

                    fun paymentRelatedInformation2(paymentRelatedInformation2: String) =
                        paymentRelatedInformation2(JsonField.of(paymentRelatedInformation2))

                    @JsonProperty("payment_related_information2")
                    @ExcludeMissing
                    fun paymentRelatedInformation2(paymentRelatedInformation2: JsonField<String>) =
                        apply {
                            this.paymentRelatedInformation2 = paymentRelatedInformation2
                        }

                    fun receiverIdentificationNumber(receiverIdentificationNumber: String) =
                        receiverIdentificationNumber(JsonField.of(receiverIdentificationNumber))

                    @JsonProperty("receiver_identification_number")
                    @ExcludeMissing
                    fun receiverIdentificationNumber(
                        receiverIdentificationNumber: JsonField<String>
                    ) = apply { this.receiverIdentificationNumber = receiverIdentificationNumber }

                    fun receiverStreetAddress(receiverStreetAddress: String) =
                        receiverStreetAddress(JsonField.of(receiverStreetAddress))

                    @JsonProperty("receiver_street_address")
                    @ExcludeMissing
                    fun receiverStreetAddress(receiverStreetAddress: JsonField<String>) = apply {
                        this.receiverStreetAddress = receiverStreetAddress
                    }

                    fun receiverCity(receiverCity: String) =
                        receiverCity(JsonField.of(receiverCity))

                    @JsonProperty("receiver_city")
                    @ExcludeMissing
                    fun receiverCity(receiverCity: JsonField<String>) = apply {
                        this.receiverCity = receiverCity
                    }

                    fun receiverStateOrProvince(receiverStateOrProvince: String) =
                        receiverStateOrProvince(JsonField.of(receiverStateOrProvince))

                    @JsonProperty("receiver_state_or_province")
                    @ExcludeMissing
                    fun receiverStateOrProvince(receiverStateOrProvince: JsonField<String>) =
                        apply {
                            this.receiverStateOrProvince = receiverStateOrProvince
                        }

                    fun receiverCountry(receiverCountry: String) =
                        receiverCountry(JsonField.of(receiverCountry))

                    @JsonProperty("receiver_country")
                    @ExcludeMissing
                    fun receiverCountry(receiverCountry: JsonField<String>) = apply {
                        this.receiverCountry = receiverCountry
                    }

                    fun receiverPostalCode(receiverPostalCode: String) =
                        receiverPostalCode(JsonField.of(receiverPostalCode))

                    @JsonProperty("receiver_postal_code")
                    @ExcludeMissing
                    fun receiverPostalCode(receiverPostalCode: JsonField<String>) = apply {
                        this.receiverPostalCode = receiverPostalCode
                    }

                    fun receivingCompanyOrIndividualName(receivingCompanyOrIndividualName: String) =
                        receivingCompanyOrIndividualName(
                            JsonField.of(receivingCompanyOrIndividualName)
                        )

                    @JsonProperty("receiving_company_or_individual_name")
                    @ExcludeMissing
                    fun receivingCompanyOrIndividualName(
                        receivingCompanyOrIndividualName: JsonField<String>
                    ) = apply {
                        this.receivingCompanyOrIndividualName = receivingCompanyOrIndividualName
                    }

                    fun receivingDepositoryFinancialInstitutionName(
                        receivingDepositoryFinancialInstitutionName: String
                    ) =
                        receivingDepositoryFinancialInstitutionName(
                            JsonField.of(receivingDepositoryFinancialInstitutionName)
                        )

                    @JsonProperty("receiving_depository_financial_institution_name")
                    @ExcludeMissing
                    fun receivingDepositoryFinancialInstitutionName(
                        receivingDepositoryFinancialInstitutionName: JsonField<String>
                    ) = apply {
                        this.receivingDepositoryFinancialInstitutionName =
                            receivingDepositoryFinancialInstitutionName
                    }

                    fun receivingDepositoryFinancialInstitutionIdQualifier(
                        receivingDepositoryFinancialInstitutionIdQualifier: String
                    ) =
                        receivingDepositoryFinancialInstitutionIdQualifier(
                            JsonField.of(receivingDepositoryFinancialInstitutionIdQualifier)
                        )

                    @JsonProperty("receiving_depository_financial_institution_id_qualifier")
                    @ExcludeMissing
                    fun receivingDepositoryFinancialInstitutionIdQualifier(
                        receivingDepositoryFinancialInstitutionIdQualifier: JsonField<String>
                    ) = apply {
                        this.receivingDepositoryFinancialInstitutionIdQualifier =
                            receivingDepositoryFinancialInstitutionIdQualifier
                    }

                    fun receivingDepositoryFinancialInstitutionId(
                        receivingDepositoryFinancialInstitutionId: String
                    ) =
                        receivingDepositoryFinancialInstitutionId(
                            JsonField.of(receivingDepositoryFinancialInstitutionId)
                        )

                    @JsonProperty("receiving_depository_financial_institution_id")
                    @ExcludeMissing
                    fun receivingDepositoryFinancialInstitutionId(
                        receivingDepositoryFinancialInstitutionId: JsonField<String>
                    ) = apply {
                        this.receivingDepositoryFinancialInstitutionId =
                            receivingDepositoryFinancialInstitutionId
                    }

                    fun receivingDepositoryFinancialInstitutionCountry(
                        receivingDepositoryFinancialInstitutionCountry: String
                    ) =
                        receivingDepositoryFinancialInstitutionCountry(
                            JsonField.of(receivingDepositoryFinancialInstitutionCountry)
                        )

                    @JsonProperty("receiving_depository_financial_institution_country")
                    @ExcludeMissing
                    fun receivingDepositoryFinancialInstitutionCountry(
                        receivingDepositoryFinancialInstitutionCountry: JsonField<String>
                    ) = apply {
                        this.receivingDepositoryFinancialInstitutionCountry =
                            receivingDepositoryFinancialInstitutionCountry
                    }

                    fun traceNumber(traceNumber: String) = traceNumber(JsonField.of(traceNumber))

                    @JsonProperty("trace_number")
                    @ExcludeMissing
                    fun traceNumber(traceNumber: JsonField<String>) = apply {
                        this.traceNumber = traceNumber
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

                    fun build(): InboundInternationalAchTransfer =
                        InboundInternationalAchTransfer(
                            amount,
                            foreignExchangeIndicator,
                            foreignExchangeReferenceIndicator,
                            foreignExchangeReference,
                            destinationCountryCode,
                            destinationCurrencyCode,
                            foreignPaymentAmount,
                            foreignTraceNumber,
                            internationalTransactionTypeCode,
                            originatingCurrencyCode,
                            originatingDepositoryFinancialInstitutionName,
                            originatingDepositoryFinancialInstitutionIdQualifier,
                            originatingDepositoryFinancialInstitutionId,
                            originatingDepositoryFinancialInstitutionBranchCountry,
                            originatorCity,
                            originatorCompanyEntryDescription,
                            originatorCountry,
                            originatorIdentification,
                            originatorName,
                            originatorPostalCode,
                            originatorStreetAddress,
                            originatorStateOrProvince,
                            paymentRelatedInformation,
                            paymentRelatedInformation2,
                            receiverIdentificationNumber,
                            receiverStreetAddress,
                            receiverCity,
                            receiverStateOrProvince,
                            receiverCountry,
                            receiverPostalCode,
                            receivingCompanyOrIndividualName,
                            receivingDepositoryFinancialInstitutionName,
                            receivingDepositoryFinancialInstitutionIdQualifier,
                            receivingDepositoryFinancialInstitutionId,
                            receivingDepositoryFinancialInstitutionCountry,
                            traceNumber,
                            additionalProperties.toUnmodifiable(),
                        )
                }
            }

            /**
             * A Inbound Real Time Payments Transfer Confirmation object. This field will be present
             * in the JSON response if and only if `category` is equal to
             * `inbound_real_time_payments_transfer_confirmation`.
             */
            @JsonDeserialize(builder = InboundRealTimePaymentsTransferConfirmation.Builder::class)
            @NoAutoDetect
            class InboundRealTimePaymentsTransferConfirmation
            private constructor(
                private val amount: JsonField<Long>,
                private val currency: JsonField<Currency>,
                private val creditorName: JsonField<String>,
                private val debtorName: JsonField<String>,
                private val debtorAccountNumber: JsonField<String>,
                private val debtorRoutingNumber: JsonField<String>,
                private val transactionIdentification: JsonField<String>,
                private val remittanceInformation: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /**
                 * The amount in the minor unit of the transfer's currency. For dollars, for
                 * example, this is cents.
                 */
                fun amount(): Long = amount.getRequired("amount")

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code of the transfer's
                 * currency. This will always be "USD" for a Real Time Payments transfer.
                 */
                fun currency(): Currency = currency.getRequired("currency")

                /**
                 * The name the sender of the transfer specified as the recipient of the transfer.
                 */
                fun creditorName(): String = creditorName.getRequired("creditor_name")

                /** The name provided by the sender of the transfer. */
                fun debtorName(): String = debtorName.getRequired("debtor_name")

                /** The account number of the account that sent the transfer. */
                fun debtorAccountNumber(): String =
                    debtorAccountNumber.getRequired("debtor_account_number")

                /** The routing number of the account that sent the transfer. */
                fun debtorRoutingNumber(): String =
                    debtorRoutingNumber.getRequired("debtor_routing_number")

                /** The Real Time Payments network identification of the transfer */
                fun transactionIdentification(): String =
                    transactionIdentification.getRequired("transaction_identification")

                /** Additional information included with the transfer. */
                fun remittanceInformation(): Optional<String> =
                    Optional.ofNullable(remittanceInformation.getNullable("remittance_information"))

                /**
                 * The amount in the minor unit of the transfer's currency. For dollars, for
                 * example, this is cents.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code of the transfer's
                 * currency. This will always be "USD" for a Real Time Payments transfer.
                 */
                @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

                /**
                 * The name the sender of the transfer specified as the recipient of the transfer.
                 */
                @JsonProperty("creditor_name") @ExcludeMissing fun _creditorName() = creditorName

                /** The name provided by the sender of the transfer. */
                @JsonProperty("debtor_name") @ExcludeMissing fun _debtorName() = debtorName

                /** The account number of the account that sent the transfer. */
                @JsonProperty("debtor_account_number")
                @ExcludeMissing
                fun _debtorAccountNumber() = debtorAccountNumber

                /** The routing number of the account that sent the transfer. */
                @JsonProperty("debtor_routing_number")
                @ExcludeMissing
                fun _debtorRoutingNumber() = debtorRoutingNumber

                /** The Real Time Payments network identification of the transfer */
                @JsonProperty("transaction_identification")
                @ExcludeMissing
                fun _transactionIdentification() = transactionIdentification

                /** Additional information included with the transfer. */
                @JsonProperty("remittance_information")
                @ExcludeMissing
                fun _remittanceInformation() = remittanceInformation

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate() = apply {
                    if (!validated) {
                        amount()
                        currency()
                        creditorName()
                        debtorName()
                        debtorAccountNumber()
                        debtorRoutingNumber()
                        transactionIdentification()
                        remittanceInformation()
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
                        this.currency == other.currency &&
                        this.creditorName == other.creditorName &&
                        this.debtorName == other.debtorName &&
                        this.debtorAccountNumber == other.debtorAccountNumber &&
                        this.debtorRoutingNumber == other.debtorRoutingNumber &&
                        this.transactionIdentification == other.transactionIdentification &&
                        this.remittanceInformation == other.remittanceInformation &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                amount,
                                currency,
                                creditorName,
                                debtorName,
                                debtorAccountNumber,
                                debtorRoutingNumber,
                                transactionIdentification,
                                remittanceInformation,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "InboundRealTimePaymentsTransferConfirmation{amount=$amount, currency=$currency, creditorName=$creditorName, debtorName=$debtorName, debtorAccountNumber=$debtorAccountNumber, debtorRoutingNumber=$debtorRoutingNumber, transactionIdentification=$transactionIdentification, remittanceInformation=$remittanceInformation, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var amount: JsonField<Long> = JsonMissing.of()
                    private var currency: JsonField<Currency> = JsonMissing.of()
                    private var creditorName: JsonField<String> = JsonMissing.of()
                    private var debtorName: JsonField<String> = JsonMissing.of()
                    private var debtorAccountNumber: JsonField<String> = JsonMissing.of()
                    private var debtorRoutingNumber: JsonField<String> = JsonMissing.of()
                    private var transactionIdentification: JsonField<String> = JsonMissing.of()
                    private var remittanceInformation: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(
                        inboundRealTimePaymentsTransferConfirmation:
                            InboundRealTimePaymentsTransferConfirmation
                    ) = apply {
                        this.amount = inboundRealTimePaymentsTransferConfirmation.amount
                        this.currency = inboundRealTimePaymentsTransferConfirmation.currency
                        this.creditorName = inboundRealTimePaymentsTransferConfirmation.creditorName
                        this.debtorName = inboundRealTimePaymentsTransferConfirmation.debtorName
                        this.debtorAccountNumber =
                            inboundRealTimePaymentsTransferConfirmation.debtorAccountNumber
                        this.debtorRoutingNumber =
                            inboundRealTimePaymentsTransferConfirmation.debtorRoutingNumber
                        this.transactionIdentification =
                            inboundRealTimePaymentsTransferConfirmation.transactionIdentification
                        this.remittanceInformation =
                            inboundRealTimePaymentsTransferConfirmation.remittanceInformation
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
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code of the transfer's
                     * currency. This will always be "USD" for a Real Time Payments transfer.
                     */
                    fun currency(currency: Currency) = currency(JsonField.of(currency))

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code of the transfer's
                     * currency. This will always be "USD" for a Real Time Payments transfer.
                     */
                    @JsonProperty("currency")
                    @ExcludeMissing
                    fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                    /**
                     * The name the sender of the transfer specified as the recipient of the
                     * transfer.
                     */
                    fun creditorName(creditorName: String) =
                        creditorName(JsonField.of(creditorName))

                    /**
                     * The name the sender of the transfer specified as the recipient of the
                     * transfer.
                     */
                    @JsonProperty("creditor_name")
                    @ExcludeMissing
                    fun creditorName(creditorName: JsonField<String>) = apply {
                        this.creditorName = creditorName
                    }

                    /** The name provided by the sender of the transfer. */
                    fun debtorName(debtorName: String) = debtorName(JsonField.of(debtorName))

                    /** The name provided by the sender of the transfer. */
                    @JsonProperty("debtor_name")
                    @ExcludeMissing
                    fun debtorName(debtorName: JsonField<String>) = apply {
                        this.debtorName = debtorName
                    }

                    /** The account number of the account that sent the transfer. */
                    fun debtorAccountNumber(debtorAccountNumber: String) =
                        debtorAccountNumber(JsonField.of(debtorAccountNumber))

                    /** The account number of the account that sent the transfer. */
                    @JsonProperty("debtor_account_number")
                    @ExcludeMissing
                    fun debtorAccountNumber(debtorAccountNumber: JsonField<String>) = apply {
                        this.debtorAccountNumber = debtorAccountNumber
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

                    /** The Real Time Payments network identification of the transfer */
                    fun transactionIdentification(transactionIdentification: String) =
                        transactionIdentification(JsonField.of(transactionIdentification))

                    /** The Real Time Payments network identification of the transfer */
                    @JsonProperty("transaction_identification")
                    @ExcludeMissing
                    fun transactionIdentification(transactionIdentification: JsonField<String>) =
                        apply {
                            this.transactionIdentification = transactionIdentification
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
                            currency,
                            creditorName,
                            debtorName,
                            debtorAccountNumber,
                            debtorRoutingNumber,
                            transactionIdentification,
                            remittanceInformation,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class Currency
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) {

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

            /**
             * A Inbound Wire Drawdown Payment Reversal object. This field will be present in the
             * JSON response if and only if `category` is equal to
             * `inbound_wire_drawdown_payment_reversal`.
             */
            @JsonDeserialize(builder = InboundWireDrawdownPaymentReversal.Builder::class)
            @NoAutoDetect
            class InboundWireDrawdownPaymentReversal
            private constructor(
                private val amount: JsonField<Long>,
                private val description: JsonField<String>,
                private val inputCycleDate: JsonField<LocalDate>,
                private val inputSequenceNumber: JsonField<String>,
                private val inputSource: JsonField<String>,
                private val inputMessageAccountabilityData: JsonField<String>,
                private val previousMessageInputMessageAccountabilityData: JsonField<String>,
                private val previousMessageInputCycleDate: JsonField<LocalDate>,
                private val previousMessageInputSequenceNumber: JsonField<String>,
                private val previousMessageInputSource: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /** The amount that was reversed. */
                fun amount(): Long = amount.getRequired("amount")

                /** The description on the reversal message from Fedwire. */
                fun description(): String = description.getRequired("description")

                /** The Fedwire cycle date for the wire reversal. */
                fun inputCycleDate(): LocalDate = inputCycleDate.getRequired("input_cycle_date")

                /** The Fedwire sequence number. */
                fun inputSequenceNumber(): String =
                    inputSequenceNumber.getRequired("input_sequence_number")

                /** The Fedwire input source identifier. */
                fun inputSource(): String = inputSource.getRequired("input_source")

                /** The Fedwire transaction identifier. */
                fun inputMessageAccountabilityData(): String =
                    inputMessageAccountabilityData.getRequired("input_message_accountability_data")

                /** The Fedwire transaction identifier for the wire transfer that was reversed. */
                fun previousMessageInputMessageAccountabilityData(): String =
                    previousMessageInputMessageAccountabilityData.getRequired(
                        "previous_message_input_message_accountability_data"
                    )

                /** The Fedwire cycle date for the wire transfer that was reversed. */
                fun previousMessageInputCycleDate(): LocalDate =
                    previousMessageInputCycleDate.getRequired("previous_message_input_cycle_date")

                /** The Fedwire sequence number for the wire transfer that was reversed. */
                fun previousMessageInputSequenceNumber(): String =
                    previousMessageInputSequenceNumber.getRequired(
                        "previous_message_input_sequence_number"
                    )

                /** The Fedwire input source identifier for the wire transfer that was reversed. */
                fun previousMessageInputSource(): String =
                    previousMessageInputSource.getRequired("previous_message_input_source")

                /** The amount that was reversed. */
                @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

                /** The description on the reversal message from Fedwire. */
                @JsonProperty("description") @ExcludeMissing fun _description() = description

                /** The Fedwire cycle date for the wire reversal. */
                @JsonProperty("input_cycle_date")
                @ExcludeMissing
                fun _inputCycleDate() = inputCycleDate

                /** The Fedwire sequence number. */
                @JsonProperty("input_sequence_number")
                @ExcludeMissing
                fun _inputSequenceNumber() = inputSequenceNumber

                /** The Fedwire input source identifier. */
                @JsonProperty("input_source") @ExcludeMissing fun _inputSource() = inputSource

                /** The Fedwire transaction identifier. */
                @JsonProperty("input_message_accountability_data")
                @ExcludeMissing
                fun _inputMessageAccountabilityData() = inputMessageAccountabilityData

                /** The Fedwire transaction identifier for the wire transfer that was reversed. */
                @JsonProperty("previous_message_input_message_accountability_data")
                @ExcludeMissing
                fun _previousMessageInputMessageAccountabilityData() =
                    previousMessageInputMessageAccountabilityData

                /** The Fedwire cycle date for the wire transfer that was reversed. */
                @JsonProperty("previous_message_input_cycle_date")
                @ExcludeMissing
                fun _previousMessageInputCycleDate() = previousMessageInputCycleDate

                /** The Fedwire sequence number for the wire transfer that was reversed. */
                @JsonProperty("previous_message_input_sequence_number")
                @ExcludeMissing
                fun _previousMessageInputSequenceNumber() = previousMessageInputSequenceNumber

                /** The Fedwire input source identifier for the wire transfer that was reversed. */
                @JsonProperty("previous_message_input_source")
                @ExcludeMissing
                fun _previousMessageInputSource() = previousMessageInputSource

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate() = apply {
                    if (!validated) {
                        amount()
                        description()
                        inputCycleDate()
                        inputSequenceNumber()
                        inputSource()
                        inputMessageAccountabilityData()
                        previousMessageInputMessageAccountabilityData()
                        previousMessageInputCycleDate()
                        previousMessageInputSequenceNumber()
                        previousMessageInputSource()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is InboundWireDrawdownPaymentReversal &&
                        this.amount == other.amount &&
                        this.description == other.description &&
                        this.inputCycleDate == other.inputCycleDate &&
                        this.inputSequenceNumber == other.inputSequenceNumber &&
                        this.inputSource == other.inputSource &&
                        this.inputMessageAccountabilityData ==
                            other.inputMessageAccountabilityData &&
                        this.previousMessageInputMessageAccountabilityData ==
                            other.previousMessageInputMessageAccountabilityData &&
                        this.previousMessageInputCycleDate == other.previousMessageInputCycleDate &&
                        this.previousMessageInputSequenceNumber ==
                            other.previousMessageInputSequenceNumber &&
                        this.previousMessageInputSource == other.previousMessageInputSource &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                amount,
                                description,
                                inputCycleDate,
                                inputSequenceNumber,
                                inputSource,
                                inputMessageAccountabilityData,
                                previousMessageInputMessageAccountabilityData,
                                previousMessageInputCycleDate,
                                previousMessageInputSequenceNumber,
                                previousMessageInputSource,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "InboundWireDrawdownPaymentReversal{amount=$amount, description=$description, inputCycleDate=$inputCycleDate, inputSequenceNumber=$inputSequenceNumber, inputSource=$inputSource, inputMessageAccountabilityData=$inputMessageAccountabilityData, previousMessageInputMessageAccountabilityData=$previousMessageInputMessageAccountabilityData, previousMessageInputCycleDate=$previousMessageInputCycleDate, previousMessageInputSequenceNumber=$previousMessageInputSequenceNumber, previousMessageInputSource=$previousMessageInputSource, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var amount: JsonField<Long> = JsonMissing.of()
                    private var description: JsonField<String> = JsonMissing.of()
                    private var inputCycleDate: JsonField<LocalDate> = JsonMissing.of()
                    private var inputSequenceNumber: JsonField<String> = JsonMissing.of()
                    private var inputSource: JsonField<String> = JsonMissing.of()
                    private var inputMessageAccountabilityData: JsonField<String> = JsonMissing.of()
                    private var previousMessageInputMessageAccountabilityData: JsonField<String> =
                        JsonMissing.of()
                    private var previousMessageInputCycleDate: JsonField<LocalDate> =
                        JsonMissing.of()
                    private var previousMessageInputSequenceNumber: JsonField<String> =
                        JsonMissing.of()
                    private var previousMessageInputSource: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(
                        inboundWireDrawdownPaymentReversal: InboundWireDrawdownPaymentReversal
                    ) = apply {
                        this.amount = inboundWireDrawdownPaymentReversal.amount
                        this.description = inboundWireDrawdownPaymentReversal.description
                        this.inputCycleDate = inboundWireDrawdownPaymentReversal.inputCycleDate
                        this.inputSequenceNumber =
                            inboundWireDrawdownPaymentReversal.inputSequenceNumber
                        this.inputSource = inboundWireDrawdownPaymentReversal.inputSource
                        this.inputMessageAccountabilityData =
                            inboundWireDrawdownPaymentReversal.inputMessageAccountabilityData
                        this.previousMessageInputMessageAccountabilityData =
                            inboundWireDrawdownPaymentReversal
                                .previousMessageInputMessageAccountabilityData
                        this.previousMessageInputCycleDate =
                            inboundWireDrawdownPaymentReversal.previousMessageInputCycleDate
                        this.previousMessageInputSequenceNumber =
                            inboundWireDrawdownPaymentReversal.previousMessageInputSequenceNumber
                        this.previousMessageInputSource =
                            inboundWireDrawdownPaymentReversal.previousMessageInputSource
                        additionalProperties(
                            inboundWireDrawdownPaymentReversal.additionalProperties
                        )
                    }

                    /** The amount that was reversed. */
                    fun amount(amount: Long) = amount(JsonField.of(amount))

                    /** The amount that was reversed. */
                    @JsonProperty("amount")
                    @ExcludeMissing
                    fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                    /** The description on the reversal message from Fedwire. */
                    fun description(description: String) = description(JsonField.of(description))

                    /** The description on the reversal message from Fedwire. */
                    @JsonProperty("description")
                    @ExcludeMissing
                    fun description(description: JsonField<String>) = apply {
                        this.description = description
                    }

                    /** The Fedwire cycle date for the wire reversal. */
                    fun inputCycleDate(inputCycleDate: LocalDate) =
                        inputCycleDate(JsonField.of(inputCycleDate))

                    /** The Fedwire cycle date for the wire reversal. */
                    @JsonProperty("input_cycle_date")
                    @ExcludeMissing
                    fun inputCycleDate(inputCycleDate: JsonField<LocalDate>) = apply {
                        this.inputCycleDate = inputCycleDate
                    }

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

                    /** The Fedwire transaction identifier. */
                    fun inputMessageAccountabilityData(inputMessageAccountabilityData: String) =
                        inputMessageAccountabilityData(JsonField.of(inputMessageAccountabilityData))

                    /** The Fedwire transaction identifier. */
                    @JsonProperty("input_message_accountability_data")
                    @ExcludeMissing
                    fun inputMessageAccountabilityData(
                        inputMessageAccountabilityData: JsonField<String>
                    ) = apply {
                        this.inputMessageAccountabilityData = inputMessageAccountabilityData
                    }

                    /**
                     * The Fedwire transaction identifier for the wire transfer that was reversed.
                     */
                    fun previousMessageInputMessageAccountabilityData(
                        previousMessageInputMessageAccountabilityData: String
                    ) =
                        previousMessageInputMessageAccountabilityData(
                            JsonField.of(previousMessageInputMessageAccountabilityData)
                        )

                    /**
                     * The Fedwire transaction identifier for the wire transfer that was reversed.
                     */
                    @JsonProperty("previous_message_input_message_accountability_data")
                    @ExcludeMissing
                    fun previousMessageInputMessageAccountabilityData(
                        previousMessageInputMessageAccountabilityData: JsonField<String>
                    ) = apply {
                        this.previousMessageInputMessageAccountabilityData =
                            previousMessageInputMessageAccountabilityData
                    }

                    /** The Fedwire cycle date for the wire transfer that was reversed. */
                    fun previousMessageInputCycleDate(previousMessageInputCycleDate: LocalDate) =
                        previousMessageInputCycleDate(JsonField.of(previousMessageInputCycleDate))

                    /** The Fedwire cycle date for the wire transfer that was reversed. */
                    @JsonProperty("previous_message_input_cycle_date")
                    @ExcludeMissing
                    fun previousMessageInputCycleDate(
                        previousMessageInputCycleDate: JsonField<LocalDate>
                    ) = apply { this.previousMessageInputCycleDate = previousMessageInputCycleDate }

                    /** The Fedwire sequence number for the wire transfer that was reversed. */
                    fun previousMessageInputSequenceNumber(
                        previousMessageInputSequenceNumber: String
                    ) =
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

                    /**
                     * The Fedwire input source identifier for the wire transfer that was reversed.
                     */
                    fun previousMessageInputSource(previousMessageInputSource: String) =
                        previousMessageInputSource(JsonField.of(previousMessageInputSource))

                    /**
                     * The Fedwire input source identifier for the wire transfer that was reversed.
                     */
                    @JsonProperty("previous_message_input_source")
                    @ExcludeMissing
                    fun previousMessageInputSource(previousMessageInputSource: JsonField<String>) =
                        apply {
                            this.previousMessageInputSource = previousMessageInputSource
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

                    fun build(): InboundWireDrawdownPaymentReversal =
                        InboundWireDrawdownPaymentReversal(
                            amount,
                            description,
                            inputCycleDate,
                            inputSequenceNumber,
                            inputSource,
                            inputMessageAccountabilityData,
                            previousMessageInputMessageAccountabilityData,
                            previousMessageInputCycleDate,
                            previousMessageInputSequenceNumber,
                            previousMessageInputSource,
                            additionalProperties.toUnmodifiable(),
                        )
                }
            }

            /**
             * A Inbound Wire Drawdown Payment object. This field will be present in the JSON
             * response if and only if `category` is equal to `inbound_wire_drawdown_payment`.
             */
            @JsonDeserialize(builder = InboundWireDrawdownPayment.Builder::class)
            @NoAutoDetect
            class InboundWireDrawdownPayment
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
                private val originatorToBeneficiaryInformation: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /**
                 * The amount in the minor unit of the transaction's currency. For dollars, for
                 * example, this is cents.
                 */
                fun amount(): Long = amount.getRequired("amount")

                fun beneficiaryAddressLine1(): Optional<String> =
                    Optional.ofNullable(
                        beneficiaryAddressLine1.getNullable("beneficiary_address_line1")
                    )

                fun beneficiaryAddressLine2(): Optional<String> =
                    Optional.ofNullable(
                        beneficiaryAddressLine2.getNullable("beneficiary_address_line2")
                    )

                fun beneficiaryAddressLine3(): Optional<String> =
                    Optional.ofNullable(
                        beneficiaryAddressLine3.getNullable("beneficiary_address_line3")
                    )

                fun beneficiaryName(): Optional<String> =
                    Optional.ofNullable(beneficiaryName.getNullable("beneficiary_name"))

                fun beneficiaryReference(): Optional<String> =
                    Optional.ofNullable(beneficiaryReference.getNullable("beneficiary_reference"))

                fun description(): String = description.getRequired("description")

                fun inputMessageAccountabilityData(): Optional<String> =
                    Optional.ofNullable(
                        inputMessageAccountabilityData.getNullable(
                            "input_message_accountability_data"
                        )
                    )

                fun originatorAddressLine1(): Optional<String> =
                    Optional.ofNullable(
                        originatorAddressLine1.getNullable("originator_address_line1")
                    )

                fun originatorAddressLine2(): Optional<String> =
                    Optional.ofNullable(
                        originatorAddressLine2.getNullable("originator_address_line2")
                    )

                fun originatorAddressLine3(): Optional<String> =
                    Optional.ofNullable(
                        originatorAddressLine3.getNullable("originator_address_line3")
                    )

                fun originatorName(): Optional<String> =
                    Optional.ofNullable(originatorName.getNullable("originator_name"))

                fun originatorToBeneficiaryInformation(): Optional<String> =
                    Optional.ofNullable(
                        originatorToBeneficiaryInformation.getNullable(
                            "originator_to_beneficiary_information"
                        )
                    )

                /**
                 * The amount in the minor unit of the transaction's currency. For dollars, for
                 * example, this is cents.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

                @JsonProperty("beneficiary_address_line1")
                @ExcludeMissing
                fun _beneficiaryAddressLine1() = beneficiaryAddressLine1

                @JsonProperty("beneficiary_address_line2")
                @ExcludeMissing
                fun _beneficiaryAddressLine2() = beneficiaryAddressLine2

                @JsonProperty("beneficiary_address_line3")
                @ExcludeMissing
                fun _beneficiaryAddressLine3() = beneficiaryAddressLine3

                @JsonProperty("beneficiary_name")
                @ExcludeMissing
                fun _beneficiaryName() = beneficiaryName

                @JsonProperty("beneficiary_reference")
                @ExcludeMissing
                fun _beneficiaryReference() = beneficiaryReference

                @JsonProperty("description") @ExcludeMissing fun _description() = description

                @JsonProperty("input_message_accountability_data")
                @ExcludeMissing
                fun _inputMessageAccountabilityData() = inputMessageAccountabilityData

                @JsonProperty("originator_address_line1")
                @ExcludeMissing
                fun _originatorAddressLine1() = originatorAddressLine1

                @JsonProperty("originator_address_line2")
                @ExcludeMissing
                fun _originatorAddressLine2() = originatorAddressLine2

                @JsonProperty("originator_address_line3")
                @ExcludeMissing
                fun _originatorAddressLine3() = originatorAddressLine3

                @JsonProperty("originator_name")
                @ExcludeMissing
                fun _originatorName() = originatorName

                @JsonProperty("originator_to_beneficiary_information")
                @ExcludeMissing
                fun _originatorToBeneficiaryInformation() = originatorToBeneficiaryInformation

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate() = apply {
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
                        originatorToBeneficiaryInformation()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is InboundWireDrawdownPayment &&
                        this.amount == other.amount &&
                        this.beneficiaryAddressLine1 == other.beneficiaryAddressLine1 &&
                        this.beneficiaryAddressLine2 == other.beneficiaryAddressLine2 &&
                        this.beneficiaryAddressLine3 == other.beneficiaryAddressLine3 &&
                        this.beneficiaryName == other.beneficiaryName &&
                        this.beneficiaryReference == other.beneficiaryReference &&
                        this.description == other.description &&
                        this.inputMessageAccountabilityData ==
                            other.inputMessageAccountabilityData &&
                        this.originatorAddressLine1 == other.originatorAddressLine1 &&
                        this.originatorAddressLine2 == other.originatorAddressLine2 &&
                        this.originatorAddressLine3 == other.originatorAddressLine3 &&
                        this.originatorName == other.originatorName &&
                        this.originatorToBeneficiaryInformation ==
                            other.originatorToBeneficiaryInformation &&
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
                                originatorToBeneficiaryInformation,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "InboundWireDrawdownPayment{amount=$amount, beneficiaryAddressLine1=$beneficiaryAddressLine1, beneficiaryAddressLine2=$beneficiaryAddressLine2, beneficiaryAddressLine3=$beneficiaryAddressLine3, beneficiaryName=$beneficiaryName, beneficiaryReference=$beneficiaryReference, description=$description, inputMessageAccountabilityData=$inputMessageAccountabilityData, originatorAddressLine1=$originatorAddressLine1, originatorAddressLine2=$originatorAddressLine2, originatorAddressLine3=$originatorAddressLine3, originatorName=$originatorName, originatorToBeneficiaryInformation=$originatorToBeneficiaryInformation, additionalProperties=$additionalProperties}"

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
                    private var originatorToBeneficiaryInformation: JsonField<String> =
                        JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(inboundWireDrawdownPayment: InboundWireDrawdownPayment) =
                        apply {
                            this.amount = inboundWireDrawdownPayment.amount
                            this.beneficiaryAddressLine1 =
                                inboundWireDrawdownPayment.beneficiaryAddressLine1
                            this.beneficiaryAddressLine2 =
                                inboundWireDrawdownPayment.beneficiaryAddressLine2
                            this.beneficiaryAddressLine3 =
                                inboundWireDrawdownPayment.beneficiaryAddressLine3
                            this.beneficiaryName = inboundWireDrawdownPayment.beneficiaryName
                            this.beneficiaryReference =
                                inboundWireDrawdownPayment.beneficiaryReference
                            this.description = inboundWireDrawdownPayment.description
                            this.inputMessageAccountabilityData =
                                inboundWireDrawdownPayment.inputMessageAccountabilityData
                            this.originatorAddressLine1 =
                                inboundWireDrawdownPayment.originatorAddressLine1
                            this.originatorAddressLine2 =
                                inboundWireDrawdownPayment.originatorAddressLine2
                            this.originatorAddressLine3 =
                                inboundWireDrawdownPayment.originatorAddressLine3
                            this.originatorName = inboundWireDrawdownPayment.originatorName
                            this.originatorToBeneficiaryInformation =
                                inboundWireDrawdownPayment.originatorToBeneficiaryInformation
                            additionalProperties(inboundWireDrawdownPayment.additionalProperties)
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

                    fun beneficiaryAddressLine1(beneficiaryAddressLine1: String) =
                        beneficiaryAddressLine1(JsonField.of(beneficiaryAddressLine1))

                    @JsonProperty("beneficiary_address_line1")
                    @ExcludeMissing
                    fun beneficiaryAddressLine1(beneficiaryAddressLine1: JsonField<String>) =
                        apply {
                            this.beneficiaryAddressLine1 = beneficiaryAddressLine1
                        }

                    fun beneficiaryAddressLine2(beneficiaryAddressLine2: String) =
                        beneficiaryAddressLine2(JsonField.of(beneficiaryAddressLine2))

                    @JsonProperty("beneficiary_address_line2")
                    @ExcludeMissing
                    fun beneficiaryAddressLine2(beneficiaryAddressLine2: JsonField<String>) =
                        apply {
                            this.beneficiaryAddressLine2 = beneficiaryAddressLine2
                        }

                    fun beneficiaryAddressLine3(beneficiaryAddressLine3: String) =
                        beneficiaryAddressLine3(JsonField.of(beneficiaryAddressLine3))

                    @JsonProperty("beneficiary_address_line3")
                    @ExcludeMissing
                    fun beneficiaryAddressLine3(beneficiaryAddressLine3: JsonField<String>) =
                        apply {
                            this.beneficiaryAddressLine3 = beneficiaryAddressLine3
                        }

                    fun beneficiaryName(beneficiaryName: String) =
                        beneficiaryName(JsonField.of(beneficiaryName))

                    @JsonProperty("beneficiary_name")
                    @ExcludeMissing
                    fun beneficiaryName(beneficiaryName: JsonField<String>) = apply {
                        this.beneficiaryName = beneficiaryName
                    }

                    fun beneficiaryReference(beneficiaryReference: String) =
                        beneficiaryReference(JsonField.of(beneficiaryReference))

                    @JsonProperty("beneficiary_reference")
                    @ExcludeMissing
                    fun beneficiaryReference(beneficiaryReference: JsonField<String>) = apply {
                        this.beneficiaryReference = beneficiaryReference
                    }

                    fun description(description: String) = description(JsonField.of(description))

                    @JsonProperty("description")
                    @ExcludeMissing
                    fun description(description: JsonField<String>) = apply {
                        this.description = description
                    }

                    fun inputMessageAccountabilityData(inputMessageAccountabilityData: String) =
                        inputMessageAccountabilityData(JsonField.of(inputMessageAccountabilityData))

                    @JsonProperty("input_message_accountability_data")
                    @ExcludeMissing
                    fun inputMessageAccountabilityData(
                        inputMessageAccountabilityData: JsonField<String>
                    ) = apply {
                        this.inputMessageAccountabilityData = inputMessageAccountabilityData
                    }

                    fun originatorAddressLine1(originatorAddressLine1: String) =
                        originatorAddressLine1(JsonField.of(originatorAddressLine1))

                    @JsonProperty("originator_address_line1")
                    @ExcludeMissing
                    fun originatorAddressLine1(originatorAddressLine1: JsonField<String>) = apply {
                        this.originatorAddressLine1 = originatorAddressLine1
                    }

                    fun originatorAddressLine2(originatorAddressLine2: String) =
                        originatorAddressLine2(JsonField.of(originatorAddressLine2))

                    @JsonProperty("originator_address_line2")
                    @ExcludeMissing
                    fun originatorAddressLine2(originatorAddressLine2: JsonField<String>) = apply {
                        this.originatorAddressLine2 = originatorAddressLine2
                    }

                    fun originatorAddressLine3(originatorAddressLine3: String) =
                        originatorAddressLine3(JsonField.of(originatorAddressLine3))

                    @JsonProperty("originator_address_line3")
                    @ExcludeMissing
                    fun originatorAddressLine3(originatorAddressLine3: JsonField<String>) = apply {
                        this.originatorAddressLine3 = originatorAddressLine3
                    }

                    fun originatorName(originatorName: String) =
                        originatorName(JsonField.of(originatorName))

                    @JsonProperty("originator_name")
                    @ExcludeMissing
                    fun originatorName(originatorName: JsonField<String>) = apply {
                        this.originatorName = originatorName
                    }

                    fun originatorToBeneficiaryInformation(
                        originatorToBeneficiaryInformation: String
                    ) =
                        originatorToBeneficiaryInformation(
                            JsonField.of(originatorToBeneficiaryInformation)
                        )

                    @JsonProperty("originator_to_beneficiary_information")
                    @ExcludeMissing
                    fun originatorToBeneficiaryInformation(
                        originatorToBeneficiaryInformation: JsonField<String>
                    ) = apply {
                        this.originatorToBeneficiaryInformation = originatorToBeneficiaryInformation
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

                    fun build(): InboundWireDrawdownPayment =
                        InboundWireDrawdownPayment(
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
                            originatorToBeneficiaryInformation,
                            additionalProperties.toUnmodifiable(),
                        )
                }
            }

            /**
             * A Inbound Wire Reversal object. This field will be present in the JSON response if
             * and only if `category` is equal to `inbound_wire_reversal`.
             */
            @JsonDeserialize(builder = InboundWireReversal.Builder::class)
            @NoAutoDetect
            class InboundWireReversal
            private constructor(
                private val amount: JsonField<Long>,
                private val createdAt: JsonField<OffsetDateTime>,
                private val description: JsonField<String>,
                private val inputCycleDate: JsonField<LocalDate>,
                private val inputSequenceNumber: JsonField<String>,
                private val inputSource: JsonField<String>,
                private val inputMessageAccountabilityData: JsonField<String>,
                private val previousMessageInputMessageAccountabilityData: JsonField<String>,
                private val previousMessageInputCycleDate: JsonField<LocalDate>,
                private val previousMessageInputSequenceNumber: JsonField<String>,
                private val previousMessageInputSource: JsonField<String>,
                private val receiverFinancialInstitutionInformation: JsonField<String>,
                private val financialInstitutionToFinancialInstitutionInformation:
                    JsonField<String>,
                private val transactionId: JsonField<String>,
                private val wireTransferId: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /** The amount that was reversed. */
                fun amount(): Long = amount.getRequired("amount")

                /**
                 * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
                 * reversal was created.
                 */
                fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

                /** The description on the reversal message from Fedwire. */
                fun description(): String = description.getRequired("description")

                /** The Fedwire cycle date for the wire reversal. */
                fun inputCycleDate(): LocalDate = inputCycleDate.getRequired("input_cycle_date")

                /** The Fedwire sequence number. */
                fun inputSequenceNumber(): String =
                    inputSequenceNumber.getRequired("input_sequence_number")

                /** The Fedwire input source identifier. */
                fun inputSource(): String = inputSource.getRequired("input_source")

                /** The Fedwire transaction identifier. */
                fun inputMessageAccountabilityData(): String =
                    inputMessageAccountabilityData.getRequired("input_message_accountability_data")

                /** The Fedwire transaction identifier for the wire transfer that was reversed. */
                fun previousMessageInputMessageAccountabilityData(): String =
                    previousMessageInputMessageAccountabilityData.getRequired(
                        "previous_message_input_message_accountability_data"
                    )

                /** The Fedwire cycle date for the wire transfer that was reversed. */
                fun previousMessageInputCycleDate(): LocalDate =
                    previousMessageInputCycleDate.getRequired("previous_message_input_cycle_date")

                /** The Fedwire sequence number for the wire transfer that was reversed. */
                fun previousMessageInputSequenceNumber(): String =
                    previousMessageInputSequenceNumber.getRequired(
                        "previous_message_input_sequence_number"
                    )

                /** The Fedwire input source identifier for the wire transfer that was reversed. */
                fun previousMessageInputSource(): String =
                    previousMessageInputSource.getRequired("previous_message_input_source")

                /**
                 * Information included in the wire reversal for the receiving financial
                 * institution.
                 */
                fun receiverFinancialInstitutionInformation(): Optional<String> =
                    Optional.ofNullable(
                        receiverFinancialInstitutionInformation.getNullable(
                            "receiver_financial_institution_information"
                        )
                    )

                /** Additional financial institution information included in the wire reversal. */
                fun financialInstitutionToFinancialInstitutionInformation(): Optional<String> =
                    Optional.ofNullable(
                        financialInstitutionToFinancialInstitutionInformation.getNullable(
                            "financial_institution_to_financial_institution_information"
                        )
                    )

                /** The ID for the Transaction associated with the transfer reversal. */
                fun transactionId(): Optional<String> =
                    Optional.ofNullable(transactionId.getNullable("transaction_id"))

                /** The ID for the Wire Transfer that is being reversed. */
                fun wireTransferId(): String = wireTransferId.getRequired("wire_transfer_id")

                /** The amount that was reversed. */
                @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

                /**
                 * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
                 * reversal was created.
                 */
                @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

                /** The description on the reversal message from Fedwire. */
                @JsonProperty("description") @ExcludeMissing fun _description() = description

                /** The Fedwire cycle date for the wire reversal. */
                @JsonProperty("input_cycle_date")
                @ExcludeMissing
                fun _inputCycleDate() = inputCycleDate

                /** The Fedwire sequence number. */
                @JsonProperty("input_sequence_number")
                @ExcludeMissing
                fun _inputSequenceNumber() = inputSequenceNumber

                /** The Fedwire input source identifier. */
                @JsonProperty("input_source") @ExcludeMissing fun _inputSource() = inputSource

                /** The Fedwire transaction identifier. */
                @JsonProperty("input_message_accountability_data")
                @ExcludeMissing
                fun _inputMessageAccountabilityData() = inputMessageAccountabilityData

                /** The Fedwire transaction identifier for the wire transfer that was reversed. */
                @JsonProperty("previous_message_input_message_accountability_data")
                @ExcludeMissing
                fun _previousMessageInputMessageAccountabilityData() =
                    previousMessageInputMessageAccountabilityData

                /** The Fedwire cycle date for the wire transfer that was reversed. */
                @JsonProperty("previous_message_input_cycle_date")
                @ExcludeMissing
                fun _previousMessageInputCycleDate() = previousMessageInputCycleDate

                /** The Fedwire sequence number for the wire transfer that was reversed. */
                @JsonProperty("previous_message_input_sequence_number")
                @ExcludeMissing
                fun _previousMessageInputSequenceNumber() = previousMessageInputSequenceNumber

                /** The Fedwire input source identifier for the wire transfer that was reversed. */
                @JsonProperty("previous_message_input_source")
                @ExcludeMissing
                fun _previousMessageInputSource() = previousMessageInputSource

                /**
                 * Information included in the wire reversal for the receiving financial
                 * institution.
                 */
                @JsonProperty("receiver_financial_institution_information")
                @ExcludeMissing
                fun _receiverFinancialInstitutionInformation() =
                    receiverFinancialInstitutionInformation

                /** Additional financial institution information included in the wire reversal. */
                @JsonProperty("financial_institution_to_financial_institution_information")
                @ExcludeMissing
                fun _financialInstitutionToFinancialInstitutionInformation() =
                    financialInstitutionToFinancialInstitutionInformation

                /** The ID for the Transaction associated with the transfer reversal. */
                @JsonProperty("transaction_id") @ExcludeMissing fun _transactionId() = transactionId

                /** The ID for the Wire Transfer that is being reversed. */
                @JsonProperty("wire_transfer_id")
                @ExcludeMissing
                fun _wireTransferId() = wireTransferId

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate() = apply {
                    if (!validated) {
                        amount()
                        createdAt()
                        description()
                        inputCycleDate()
                        inputSequenceNumber()
                        inputSource()
                        inputMessageAccountabilityData()
                        previousMessageInputMessageAccountabilityData()
                        previousMessageInputCycleDate()
                        previousMessageInputSequenceNumber()
                        previousMessageInputSource()
                        receiverFinancialInstitutionInformation()
                        financialInstitutionToFinancialInstitutionInformation()
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
                        this.inputCycleDate == other.inputCycleDate &&
                        this.inputSequenceNumber == other.inputSequenceNumber &&
                        this.inputSource == other.inputSource &&
                        this.inputMessageAccountabilityData ==
                            other.inputMessageAccountabilityData &&
                        this.previousMessageInputMessageAccountabilityData ==
                            other.previousMessageInputMessageAccountabilityData &&
                        this.previousMessageInputCycleDate == other.previousMessageInputCycleDate &&
                        this.previousMessageInputSequenceNumber ==
                            other.previousMessageInputSequenceNumber &&
                        this.previousMessageInputSource == other.previousMessageInputSource &&
                        this.receiverFinancialInstitutionInformation ==
                            other.receiverFinancialInstitutionInformation &&
                        this.financialInstitutionToFinancialInstitutionInformation ==
                            other.financialInstitutionToFinancialInstitutionInformation &&
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
                                inputCycleDate,
                                inputSequenceNumber,
                                inputSource,
                                inputMessageAccountabilityData,
                                previousMessageInputMessageAccountabilityData,
                                previousMessageInputCycleDate,
                                previousMessageInputSequenceNumber,
                                previousMessageInputSource,
                                receiverFinancialInstitutionInformation,
                                financialInstitutionToFinancialInstitutionInformation,
                                transactionId,
                                wireTransferId,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "InboundWireReversal{amount=$amount, createdAt=$createdAt, description=$description, inputCycleDate=$inputCycleDate, inputSequenceNumber=$inputSequenceNumber, inputSource=$inputSource, inputMessageAccountabilityData=$inputMessageAccountabilityData, previousMessageInputMessageAccountabilityData=$previousMessageInputMessageAccountabilityData, previousMessageInputCycleDate=$previousMessageInputCycleDate, previousMessageInputSequenceNumber=$previousMessageInputSequenceNumber, previousMessageInputSource=$previousMessageInputSource, receiverFinancialInstitutionInformation=$receiverFinancialInstitutionInformation, financialInstitutionToFinancialInstitutionInformation=$financialInstitutionToFinancialInstitutionInformation, transactionId=$transactionId, wireTransferId=$wireTransferId, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var amount: JsonField<Long> = JsonMissing.of()
                    private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
                    private var description: JsonField<String> = JsonMissing.of()
                    private var inputCycleDate: JsonField<LocalDate> = JsonMissing.of()
                    private var inputSequenceNumber: JsonField<String> = JsonMissing.of()
                    private var inputSource: JsonField<String> = JsonMissing.of()
                    private var inputMessageAccountabilityData: JsonField<String> = JsonMissing.of()
                    private var previousMessageInputMessageAccountabilityData: JsonField<String> =
                        JsonMissing.of()
                    private var previousMessageInputCycleDate: JsonField<LocalDate> =
                        JsonMissing.of()
                    private var previousMessageInputSequenceNumber: JsonField<String> =
                        JsonMissing.of()
                    private var previousMessageInputSource: JsonField<String> = JsonMissing.of()
                    private var receiverFinancialInstitutionInformation: JsonField<String> =
                        JsonMissing.of()
                    private var financialInstitutionToFinancialInstitutionInformation:
                        JsonField<String> =
                        JsonMissing.of()
                    private var transactionId: JsonField<String> = JsonMissing.of()
                    private var wireTransferId: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(inboundWireReversal: InboundWireReversal) = apply {
                        this.amount = inboundWireReversal.amount
                        this.createdAt = inboundWireReversal.createdAt
                        this.description = inboundWireReversal.description
                        this.inputCycleDate = inboundWireReversal.inputCycleDate
                        this.inputSequenceNumber = inboundWireReversal.inputSequenceNumber
                        this.inputSource = inboundWireReversal.inputSource
                        this.inputMessageAccountabilityData =
                            inboundWireReversal.inputMessageAccountabilityData
                        this.previousMessageInputMessageAccountabilityData =
                            inboundWireReversal.previousMessageInputMessageAccountabilityData
                        this.previousMessageInputCycleDate =
                            inboundWireReversal.previousMessageInputCycleDate
                        this.previousMessageInputSequenceNumber =
                            inboundWireReversal.previousMessageInputSequenceNumber
                        this.previousMessageInputSource =
                            inboundWireReversal.previousMessageInputSource
                        this.receiverFinancialInstitutionInformation =
                            inboundWireReversal.receiverFinancialInstitutionInformation
                        this.financialInstitutionToFinancialInstitutionInformation =
                            inboundWireReversal
                                .financialInstitutionToFinancialInstitutionInformation
                        this.transactionId = inboundWireReversal.transactionId
                        this.wireTransferId = inboundWireReversal.wireTransferId
                        additionalProperties(inboundWireReversal.additionalProperties)
                    }

                    /** The amount that was reversed. */
                    fun amount(amount: Long) = amount(JsonField.of(amount))

                    /** The amount that was reversed. */
                    @JsonProperty("amount")
                    @ExcludeMissing
                    fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                    /**
                     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which
                     * the reversal was created.
                     */
                    fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

                    /**
                     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which
                     * the reversal was created.
                     */
                    @JsonProperty("created_at")
                    @ExcludeMissing
                    fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                        this.createdAt = createdAt
                    }

                    /** The description on the reversal message from Fedwire. */
                    fun description(description: String) = description(JsonField.of(description))

                    /** The description on the reversal message from Fedwire. */
                    @JsonProperty("description")
                    @ExcludeMissing
                    fun description(description: JsonField<String>) = apply {
                        this.description = description
                    }

                    /** The Fedwire cycle date for the wire reversal. */
                    fun inputCycleDate(inputCycleDate: LocalDate) =
                        inputCycleDate(JsonField.of(inputCycleDate))

                    /** The Fedwire cycle date for the wire reversal. */
                    @JsonProperty("input_cycle_date")
                    @ExcludeMissing
                    fun inputCycleDate(inputCycleDate: JsonField<LocalDate>) = apply {
                        this.inputCycleDate = inputCycleDate
                    }

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

                    /** The Fedwire transaction identifier. */
                    fun inputMessageAccountabilityData(inputMessageAccountabilityData: String) =
                        inputMessageAccountabilityData(JsonField.of(inputMessageAccountabilityData))

                    /** The Fedwire transaction identifier. */
                    @JsonProperty("input_message_accountability_data")
                    @ExcludeMissing
                    fun inputMessageAccountabilityData(
                        inputMessageAccountabilityData: JsonField<String>
                    ) = apply {
                        this.inputMessageAccountabilityData = inputMessageAccountabilityData
                    }

                    /**
                     * The Fedwire transaction identifier for the wire transfer that was reversed.
                     */
                    fun previousMessageInputMessageAccountabilityData(
                        previousMessageInputMessageAccountabilityData: String
                    ) =
                        previousMessageInputMessageAccountabilityData(
                            JsonField.of(previousMessageInputMessageAccountabilityData)
                        )

                    /**
                     * The Fedwire transaction identifier for the wire transfer that was reversed.
                     */
                    @JsonProperty("previous_message_input_message_accountability_data")
                    @ExcludeMissing
                    fun previousMessageInputMessageAccountabilityData(
                        previousMessageInputMessageAccountabilityData: JsonField<String>
                    ) = apply {
                        this.previousMessageInputMessageAccountabilityData =
                            previousMessageInputMessageAccountabilityData
                    }

                    /** The Fedwire cycle date for the wire transfer that was reversed. */
                    fun previousMessageInputCycleDate(previousMessageInputCycleDate: LocalDate) =
                        previousMessageInputCycleDate(JsonField.of(previousMessageInputCycleDate))

                    /** The Fedwire cycle date for the wire transfer that was reversed. */
                    @JsonProperty("previous_message_input_cycle_date")
                    @ExcludeMissing
                    fun previousMessageInputCycleDate(
                        previousMessageInputCycleDate: JsonField<LocalDate>
                    ) = apply { this.previousMessageInputCycleDate = previousMessageInputCycleDate }

                    /** The Fedwire sequence number for the wire transfer that was reversed. */
                    fun previousMessageInputSequenceNumber(
                        previousMessageInputSequenceNumber: String
                    ) =
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

                    /**
                     * The Fedwire input source identifier for the wire transfer that was reversed.
                     */
                    fun previousMessageInputSource(previousMessageInputSource: String) =
                        previousMessageInputSource(JsonField.of(previousMessageInputSource))

                    /**
                     * The Fedwire input source identifier for the wire transfer that was reversed.
                     */
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

                    /**
                     * Additional financial institution information included in the wire reversal.
                     */
                    fun financialInstitutionToFinancialInstitutionInformation(
                        financialInstitutionToFinancialInstitutionInformation: String
                    ) =
                        financialInstitutionToFinancialInstitutionInformation(
                            JsonField.of(financialInstitutionToFinancialInstitutionInformation)
                        )

                    /**
                     * Additional financial institution information included in the wire reversal.
                     */
                    @JsonProperty("financial_institution_to_financial_institution_information")
                    @ExcludeMissing
                    fun financialInstitutionToFinancialInstitutionInformation(
                        financialInstitutionToFinancialInstitutionInformation: JsonField<String>
                    ) = apply {
                        this.financialInstitutionToFinancialInstitutionInformation =
                            financialInstitutionToFinancialInstitutionInformation
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
                            inputCycleDate,
                            inputSequenceNumber,
                            inputSource,
                            inputMessageAccountabilityData,
                            previousMessageInputMessageAccountabilityData,
                            previousMessageInputCycleDate,
                            previousMessageInputSequenceNumber,
                            previousMessageInputSource,
                            receiverFinancialInstitutionInformation,
                            financialInstitutionToFinancialInstitutionInformation,
                            transactionId,
                            wireTransferId,
                            additionalProperties.toUnmodifiable(),
                        )
                }
            }

            /**
             * A Inbound Wire Transfer object. This field will be present in the JSON response if
             * and only if `category` is equal to `inbound_wire_transfer`.
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
                private val originatorToBeneficiaryInformationLine1: JsonField<String>,
                private val originatorToBeneficiaryInformationLine2: JsonField<String>,
                private val originatorToBeneficiaryInformationLine3: JsonField<String>,
                private val originatorToBeneficiaryInformationLine4: JsonField<String>,
                private val originatorToBeneficiaryInformation: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /**
                 * The amount in the minor unit of the transaction's currency. For dollars, for
                 * example, this is cents.
                 */
                fun amount(): Long = amount.getRequired("amount")

                fun beneficiaryAddressLine1(): Optional<String> =
                    Optional.ofNullable(
                        beneficiaryAddressLine1.getNullable("beneficiary_address_line1")
                    )

                fun beneficiaryAddressLine2(): Optional<String> =
                    Optional.ofNullable(
                        beneficiaryAddressLine2.getNullable("beneficiary_address_line2")
                    )

                fun beneficiaryAddressLine3(): Optional<String> =
                    Optional.ofNullable(
                        beneficiaryAddressLine3.getNullable("beneficiary_address_line3")
                    )

                fun beneficiaryName(): Optional<String> =
                    Optional.ofNullable(beneficiaryName.getNullable("beneficiary_name"))

                fun beneficiaryReference(): Optional<String> =
                    Optional.ofNullable(beneficiaryReference.getNullable("beneficiary_reference"))

                fun description(): String = description.getRequired("description")

                fun inputMessageAccountabilityData(): Optional<String> =
                    Optional.ofNullable(
                        inputMessageAccountabilityData.getNullable(
                            "input_message_accountability_data"
                        )
                    )

                fun originatorAddressLine1(): Optional<String> =
                    Optional.ofNullable(
                        originatorAddressLine1.getNullable("originator_address_line1")
                    )

                fun originatorAddressLine2(): Optional<String> =
                    Optional.ofNullable(
                        originatorAddressLine2.getNullable("originator_address_line2")
                    )

                fun originatorAddressLine3(): Optional<String> =
                    Optional.ofNullable(
                        originatorAddressLine3.getNullable("originator_address_line3")
                    )

                fun originatorName(): Optional<String> =
                    Optional.ofNullable(originatorName.getNullable("originator_name"))

                fun originatorToBeneficiaryInformationLine1(): Optional<String> =
                    Optional.ofNullable(
                        originatorToBeneficiaryInformationLine1.getNullable(
                            "originator_to_beneficiary_information_line1"
                        )
                    )

                fun originatorToBeneficiaryInformationLine2(): Optional<String> =
                    Optional.ofNullable(
                        originatorToBeneficiaryInformationLine2.getNullable(
                            "originator_to_beneficiary_information_line2"
                        )
                    )

                fun originatorToBeneficiaryInformationLine3(): Optional<String> =
                    Optional.ofNullable(
                        originatorToBeneficiaryInformationLine3.getNullable(
                            "originator_to_beneficiary_information_line3"
                        )
                    )

                fun originatorToBeneficiaryInformationLine4(): Optional<String> =
                    Optional.ofNullable(
                        originatorToBeneficiaryInformationLine4.getNullable(
                            "originator_to_beneficiary_information_line4"
                        )
                    )

                fun originatorToBeneficiaryInformation(): Optional<String> =
                    Optional.ofNullable(
                        originatorToBeneficiaryInformation.getNullable(
                            "originator_to_beneficiary_information"
                        )
                    )

                /**
                 * The amount in the minor unit of the transaction's currency. For dollars, for
                 * example, this is cents.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

                @JsonProperty("beneficiary_address_line1")
                @ExcludeMissing
                fun _beneficiaryAddressLine1() = beneficiaryAddressLine1

                @JsonProperty("beneficiary_address_line2")
                @ExcludeMissing
                fun _beneficiaryAddressLine2() = beneficiaryAddressLine2

                @JsonProperty("beneficiary_address_line3")
                @ExcludeMissing
                fun _beneficiaryAddressLine3() = beneficiaryAddressLine3

                @JsonProperty("beneficiary_name")
                @ExcludeMissing
                fun _beneficiaryName() = beneficiaryName

                @JsonProperty("beneficiary_reference")
                @ExcludeMissing
                fun _beneficiaryReference() = beneficiaryReference

                @JsonProperty("description") @ExcludeMissing fun _description() = description

                @JsonProperty("input_message_accountability_data")
                @ExcludeMissing
                fun _inputMessageAccountabilityData() = inputMessageAccountabilityData

                @JsonProperty("originator_address_line1")
                @ExcludeMissing
                fun _originatorAddressLine1() = originatorAddressLine1

                @JsonProperty("originator_address_line2")
                @ExcludeMissing
                fun _originatorAddressLine2() = originatorAddressLine2

                @JsonProperty("originator_address_line3")
                @ExcludeMissing
                fun _originatorAddressLine3() = originatorAddressLine3

                @JsonProperty("originator_name")
                @ExcludeMissing
                fun _originatorName() = originatorName

                @JsonProperty("originator_to_beneficiary_information_line1")
                @ExcludeMissing
                fun _originatorToBeneficiaryInformationLine1() =
                    originatorToBeneficiaryInformationLine1

                @JsonProperty("originator_to_beneficiary_information_line2")
                @ExcludeMissing
                fun _originatorToBeneficiaryInformationLine2() =
                    originatorToBeneficiaryInformationLine2

                @JsonProperty("originator_to_beneficiary_information_line3")
                @ExcludeMissing
                fun _originatorToBeneficiaryInformationLine3() =
                    originatorToBeneficiaryInformationLine3

                @JsonProperty("originator_to_beneficiary_information_line4")
                @ExcludeMissing
                fun _originatorToBeneficiaryInformationLine4() =
                    originatorToBeneficiaryInformationLine4

                @JsonProperty("originator_to_beneficiary_information")
                @ExcludeMissing
                fun _originatorToBeneficiaryInformation() = originatorToBeneficiaryInformation

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate() = apply {
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
                        originatorToBeneficiaryInformationLine1()
                        originatorToBeneficiaryInformationLine2()
                        originatorToBeneficiaryInformationLine3()
                        originatorToBeneficiaryInformationLine4()
                        originatorToBeneficiaryInformation()
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
                        this.inputMessageAccountabilityData ==
                            other.inputMessageAccountabilityData &&
                        this.originatorAddressLine1 == other.originatorAddressLine1 &&
                        this.originatorAddressLine2 == other.originatorAddressLine2 &&
                        this.originatorAddressLine3 == other.originatorAddressLine3 &&
                        this.originatorName == other.originatorName &&
                        this.originatorToBeneficiaryInformationLine1 ==
                            other.originatorToBeneficiaryInformationLine1 &&
                        this.originatorToBeneficiaryInformationLine2 ==
                            other.originatorToBeneficiaryInformationLine2 &&
                        this.originatorToBeneficiaryInformationLine3 ==
                            other.originatorToBeneficiaryInformationLine3 &&
                        this.originatorToBeneficiaryInformationLine4 ==
                            other.originatorToBeneficiaryInformationLine4 &&
                        this.originatorToBeneficiaryInformation ==
                            other.originatorToBeneficiaryInformation &&
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
                                originatorToBeneficiaryInformationLine1,
                                originatorToBeneficiaryInformationLine2,
                                originatorToBeneficiaryInformationLine3,
                                originatorToBeneficiaryInformationLine4,
                                originatorToBeneficiaryInformation,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "InboundWireTransfer{amount=$amount, beneficiaryAddressLine1=$beneficiaryAddressLine1, beneficiaryAddressLine2=$beneficiaryAddressLine2, beneficiaryAddressLine3=$beneficiaryAddressLine3, beneficiaryName=$beneficiaryName, beneficiaryReference=$beneficiaryReference, description=$description, inputMessageAccountabilityData=$inputMessageAccountabilityData, originatorAddressLine1=$originatorAddressLine1, originatorAddressLine2=$originatorAddressLine2, originatorAddressLine3=$originatorAddressLine3, originatorName=$originatorName, originatorToBeneficiaryInformationLine1=$originatorToBeneficiaryInformationLine1, originatorToBeneficiaryInformationLine2=$originatorToBeneficiaryInformationLine2, originatorToBeneficiaryInformationLine3=$originatorToBeneficiaryInformationLine3, originatorToBeneficiaryInformationLine4=$originatorToBeneficiaryInformationLine4, originatorToBeneficiaryInformation=$originatorToBeneficiaryInformation, additionalProperties=$additionalProperties}"

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
                    private var originatorToBeneficiaryInformationLine1: JsonField<String> =
                        JsonMissing.of()
                    private var originatorToBeneficiaryInformationLine2: JsonField<String> =
                        JsonMissing.of()
                    private var originatorToBeneficiaryInformationLine3: JsonField<String> =
                        JsonMissing.of()
                    private var originatorToBeneficiaryInformationLine4: JsonField<String> =
                        JsonMissing.of()
                    private var originatorToBeneficiaryInformation: JsonField<String> =
                        JsonMissing.of()
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
                        this.originatorToBeneficiaryInformationLine1 =
                            inboundWireTransfer.originatorToBeneficiaryInformationLine1
                        this.originatorToBeneficiaryInformationLine2 =
                            inboundWireTransfer.originatorToBeneficiaryInformationLine2
                        this.originatorToBeneficiaryInformationLine3 =
                            inboundWireTransfer.originatorToBeneficiaryInformationLine3
                        this.originatorToBeneficiaryInformationLine4 =
                            inboundWireTransfer.originatorToBeneficiaryInformationLine4
                        this.originatorToBeneficiaryInformation =
                            inboundWireTransfer.originatorToBeneficiaryInformation
                        additionalProperties(inboundWireTransfer.additionalProperties)
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

                    fun beneficiaryAddressLine1(beneficiaryAddressLine1: String) =
                        beneficiaryAddressLine1(JsonField.of(beneficiaryAddressLine1))

                    @JsonProperty("beneficiary_address_line1")
                    @ExcludeMissing
                    fun beneficiaryAddressLine1(beneficiaryAddressLine1: JsonField<String>) =
                        apply {
                            this.beneficiaryAddressLine1 = beneficiaryAddressLine1
                        }

                    fun beneficiaryAddressLine2(beneficiaryAddressLine2: String) =
                        beneficiaryAddressLine2(JsonField.of(beneficiaryAddressLine2))

                    @JsonProperty("beneficiary_address_line2")
                    @ExcludeMissing
                    fun beneficiaryAddressLine2(beneficiaryAddressLine2: JsonField<String>) =
                        apply {
                            this.beneficiaryAddressLine2 = beneficiaryAddressLine2
                        }

                    fun beneficiaryAddressLine3(beneficiaryAddressLine3: String) =
                        beneficiaryAddressLine3(JsonField.of(beneficiaryAddressLine3))

                    @JsonProperty("beneficiary_address_line3")
                    @ExcludeMissing
                    fun beneficiaryAddressLine3(beneficiaryAddressLine3: JsonField<String>) =
                        apply {
                            this.beneficiaryAddressLine3 = beneficiaryAddressLine3
                        }

                    fun beneficiaryName(beneficiaryName: String) =
                        beneficiaryName(JsonField.of(beneficiaryName))

                    @JsonProperty("beneficiary_name")
                    @ExcludeMissing
                    fun beneficiaryName(beneficiaryName: JsonField<String>) = apply {
                        this.beneficiaryName = beneficiaryName
                    }

                    fun beneficiaryReference(beneficiaryReference: String) =
                        beneficiaryReference(JsonField.of(beneficiaryReference))

                    @JsonProperty("beneficiary_reference")
                    @ExcludeMissing
                    fun beneficiaryReference(beneficiaryReference: JsonField<String>) = apply {
                        this.beneficiaryReference = beneficiaryReference
                    }

                    fun description(description: String) = description(JsonField.of(description))

                    @JsonProperty("description")
                    @ExcludeMissing
                    fun description(description: JsonField<String>) = apply {
                        this.description = description
                    }

                    fun inputMessageAccountabilityData(inputMessageAccountabilityData: String) =
                        inputMessageAccountabilityData(JsonField.of(inputMessageAccountabilityData))

                    @JsonProperty("input_message_accountability_data")
                    @ExcludeMissing
                    fun inputMessageAccountabilityData(
                        inputMessageAccountabilityData: JsonField<String>
                    ) = apply {
                        this.inputMessageAccountabilityData = inputMessageAccountabilityData
                    }

                    fun originatorAddressLine1(originatorAddressLine1: String) =
                        originatorAddressLine1(JsonField.of(originatorAddressLine1))

                    @JsonProperty("originator_address_line1")
                    @ExcludeMissing
                    fun originatorAddressLine1(originatorAddressLine1: JsonField<String>) = apply {
                        this.originatorAddressLine1 = originatorAddressLine1
                    }

                    fun originatorAddressLine2(originatorAddressLine2: String) =
                        originatorAddressLine2(JsonField.of(originatorAddressLine2))

                    @JsonProperty("originator_address_line2")
                    @ExcludeMissing
                    fun originatorAddressLine2(originatorAddressLine2: JsonField<String>) = apply {
                        this.originatorAddressLine2 = originatorAddressLine2
                    }

                    fun originatorAddressLine3(originatorAddressLine3: String) =
                        originatorAddressLine3(JsonField.of(originatorAddressLine3))

                    @JsonProperty("originator_address_line3")
                    @ExcludeMissing
                    fun originatorAddressLine3(originatorAddressLine3: JsonField<String>) = apply {
                        this.originatorAddressLine3 = originatorAddressLine3
                    }

                    fun originatorName(originatorName: String) =
                        originatorName(JsonField.of(originatorName))

                    @JsonProperty("originator_name")
                    @ExcludeMissing
                    fun originatorName(originatorName: JsonField<String>) = apply {
                        this.originatorName = originatorName
                    }

                    fun originatorToBeneficiaryInformationLine1(
                        originatorToBeneficiaryInformationLine1: String
                    ) =
                        originatorToBeneficiaryInformationLine1(
                            JsonField.of(originatorToBeneficiaryInformationLine1)
                        )

                    @JsonProperty("originator_to_beneficiary_information_line1")
                    @ExcludeMissing
                    fun originatorToBeneficiaryInformationLine1(
                        originatorToBeneficiaryInformationLine1: JsonField<String>
                    ) = apply {
                        this.originatorToBeneficiaryInformationLine1 =
                            originatorToBeneficiaryInformationLine1
                    }

                    fun originatorToBeneficiaryInformationLine2(
                        originatorToBeneficiaryInformationLine2: String
                    ) =
                        originatorToBeneficiaryInformationLine2(
                            JsonField.of(originatorToBeneficiaryInformationLine2)
                        )

                    @JsonProperty("originator_to_beneficiary_information_line2")
                    @ExcludeMissing
                    fun originatorToBeneficiaryInformationLine2(
                        originatorToBeneficiaryInformationLine2: JsonField<String>
                    ) = apply {
                        this.originatorToBeneficiaryInformationLine2 =
                            originatorToBeneficiaryInformationLine2
                    }

                    fun originatorToBeneficiaryInformationLine3(
                        originatorToBeneficiaryInformationLine3: String
                    ) =
                        originatorToBeneficiaryInformationLine3(
                            JsonField.of(originatorToBeneficiaryInformationLine3)
                        )

                    @JsonProperty("originator_to_beneficiary_information_line3")
                    @ExcludeMissing
                    fun originatorToBeneficiaryInformationLine3(
                        originatorToBeneficiaryInformationLine3: JsonField<String>
                    ) = apply {
                        this.originatorToBeneficiaryInformationLine3 =
                            originatorToBeneficiaryInformationLine3
                    }

                    fun originatorToBeneficiaryInformationLine4(
                        originatorToBeneficiaryInformationLine4: String
                    ) =
                        originatorToBeneficiaryInformationLine4(
                            JsonField.of(originatorToBeneficiaryInformationLine4)
                        )

                    @JsonProperty("originator_to_beneficiary_information_line4")
                    @ExcludeMissing
                    fun originatorToBeneficiaryInformationLine4(
                        originatorToBeneficiaryInformationLine4: JsonField<String>
                    ) = apply {
                        this.originatorToBeneficiaryInformationLine4 =
                            originatorToBeneficiaryInformationLine4
                    }

                    fun originatorToBeneficiaryInformation(
                        originatorToBeneficiaryInformation: String
                    ) =
                        originatorToBeneficiaryInformation(
                            JsonField.of(originatorToBeneficiaryInformation)
                        )

                    @JsonProperty("originator_to_beneficiary_information")
                    @ExcludeMissing
                    fun originatorToBeneficiaryInformation(
                        originatorToBeneficiaryInformation: JsonField<String>
                    ) = apply {
                        this.originatorToBeneficiaryInformation = originatorToBeneficiaryInformation
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
                            originatorToBeneficiaryInformationLine1,
                            originatorToBeneficiaryInformationLine2,
                            originatorToBeneficiaryInformationLine3,
                            originatorToBeneficiaryInformationLine4,
                            originatorToBeneficiaryInformation,
                            additionalProperties.toUnmodifiable(),
                        )
                }
            }

            /**
             * A Interest Payment object. This field will be present in the JSON response if and
             * only if `category` is equal to `interest_payment`.
             */
            @JsonDeserialize(builder = InterestPayment.Builder::class)
            @NoAutoDetect
            class InterestPayment
            private constructor(
                private val amount: JsonField<Long>,
                private val currency: JsonField<Currency>,
                private val periodStart: JsonField<OffsetDateTime>,
                private val periodEnd: JsonField<OffsetDateTime>,
                private val accruedOnAccountId: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /**
                 * The amount in the minor unit of the transaction's currency. For dollars, for
                 * example, this is cents.
                 */
                fun amount(): Long = amount.getRequired("amount")

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction
                 * currency.
                 */
                fun currency(): Currency = currency.getRequired("currency")

                /** The start of the period for which this transaction paid interest. */
                fun periodStart(): OffsetDateTime = periodStart.getRequired("period_start")

                /** The end of the period for which this transaction paid interest. */
                fun periodEnd(): OffsetDateTime = periodEnd.getRequired("period_end")

                /** The account on which the interest was accrued. */
                fun accruedOnAccountId(): Optional<String> =
                    Optional.ofNullable(accruedOnAccountId.getNullable("accrued_on_account_id"))

                /**
                 * The amount in the minor unit of the transaction's currency. For dollars, for
                 * example, this is cents.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction
                 * currency.
                 */
                @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

                /** The start of the period for which this transaction paid interest. */
                @JsonProperty("period_start") @ExcludeMissing fun _periodStart() = periodStart

                /** The end of the period for which this transaction paid interest. */
                @JsonProperty("period_end") @ExcludeMissing fun _periodEnd() = periodEnd

                /** The account on which the interest was accrued. */
                @JsonProperty("accrued_on_account_id")
                @ExcludeMissing
                fun _accruedOnAccountId() = accruedOnAccountId

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate() = apply {
                    if (!validated) {
                        amount()
                        currency()
                        periodStart()
                        periodEnd()
                        accruedOnAccountId()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is InterestPayment &&
                        this.amount == other.amount &&
                        this.currency == other.currency &&
                        this.periodStart == other.periodStart &&
                        this.periodEnd == other.periodEnd &&
                        this.accruedOnAccountId == other.accruedOnAccountId &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                amount,
                                currency,
                                periodStart,
                                periodEnd,
                                accruedOnAccountId,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "InterestPayment{amount=$amount, currency=$currency, periodStart=$periodStart, periodEnd=$periodEnd, accruedOnAccountId=$accruedOnAccountId, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var amount: JsonField<Long> = JsonMissing.of()
                    private var currency: JsonField<Currency> = JsonMissing.of()
                    private var periodStart: JsonField<OffsetDateTime> = JsonMissing.of()
                    private var periodEnd: JsonField<OffsetDateTime> = JsonMissing.of()
                    private var accruedOnAccountId: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(interestPayment: InterestPayment) = apply {
                        this.amount = interestPayment.amount
                        this.currency = interestPayment.currency
                        this.periodStart = interestPayment.periodStart
                        this.periodEnd = interestPayment.periodEnd
                        this.accruedOnAccountId = interestPayment.accruedOnAccountId
                        additionalProperties(interestPayment.additionalProperties)
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
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                     * transaction currency.
                     */
                    fun currency(currency: Currency) = currency(JsonField.of(currency))

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                     * transaction currency.
                     */
                    @JsonProperty("currency")
                    @ExcludeMissing
                    fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                    /** The start of the period for which this transaction paid interest. */
                    fun periodStart(periodStart: OffsetDateTime) =
                        periodStart(JsonField.of(periodStart))

                    /** The start of the period for which this transaction paid interest. */
                    @JsonProperty("period_start")
                    @ExcludeMissing
                    fun periodStart(periodStart: JsonField<OffsetDateTime>) = apply {
                        this.periodStart = periodStart
                    }

                    /** The end of the period for which this transaction paid interest. */
                    fun periodEnd(periodEnd: OffsetDateTime) = periodEnd(JsonField.of(periodEnd))

                    /** The end of the period for which this transaction paid interest. */
                    @JsonProperty("period_end")
                    @ExcludeMissing
                    fun periodEnd(periodEnd: JsonField<OffsetDateTime>) = apply {
                        this.periodEnd = periodEnd
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
                            amount,
                            currency,
                            periodStart,
                            periodEnd,
                            accruedOnAccountId,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class Currency
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) {

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

            /**
             * A Internal Source object. This field will be present in the JSON response if and only
             * if `category` is equal to `internal_source`.
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
                 * The amount in the minor unit of the transaction's currency. For dollars, for
                 * example, this is cents.
                 */
                fun amount(): Long = amount.getRequired("amount")

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction
                 * currency.
                 */
                fun currency(): Currency = currency.getRequired("currency")

                fun reason(): Reason = reason.getRequired("reason")

                /**
                 * The amount in the minor unit of the transaction's currency. For dollars, for
                 * example, this is cents.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction
                 * currency.
                 */
                @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

                @JsonProperty("reason") @ExcludeMissing fun _reason() = reason

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate() = apply {
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
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                     * transaction currency.
                     */
                    fun currency(currency: Currency) = currency(JsonField.of(currency))

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                     * transaction currency.
                     */
                    @JsonProperty("currency")
                    @ExcludeMissing
                    fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                    fun reason(reason: Reason) = reason(JsonField.of(reason))

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
                ) {

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

                class Reason
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Reason && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        @JvmField val BANK_MIGRATION = Reason(JsonField.of("bank_migration"))

                        @JvmField val CASHBACK = Reason(JsonField.of("cashback"))

                        @JvmField
                        val COLLECTION_RECEIVABLE = Reason(JsonField.of("collection_receivable"))

                        @JvmField
                        val EMPYREAL_ADJUSTMENT = Reason(JsonField.of("empyreal_adjustment"))

                        @JvmField val ERROR = Reason(JsonField.of("error"))

                        @JvmField val ERROR_CORRECTION = Reason(JsonField.of("error_correction"))

                        @JvmField val FEES = Reason(JsonField.of("fees"))

                        @JvmField val INTEREST = Reason(JsonField.of("interest"))

                        @JvmField
                        val NEGATIVE_BALANCE_FORGIVENESS =
                            Reason(JsonField.of("negative_balance_forgiveness"))

                        @JvmField val SAMPLE_FUNDS = Reason(JsonField.of("sample_funds"))

                        @JvmField
                        val SAMPLE_FUNDS_RETURN = Reason(JsonField.of("sample_funds_return"))

                        @JvmStatic fun of(value: String) = Reason(JsonField.of(value))
                    }

                    enum class Known {
                        BANK_MIGRATION,
                        CASHBACK,
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
                        BANK_MIGRATION,
                        CASHBACK,
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
                            BANK_MIGRATION -> Value.BANK_MIGRATION
                            CASHBACK -> Value.CASHBACK
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
                            BANK_MIGRATION -> Known.BANK_MIGRATION
                            CASHBACK -> Known.CASHBACK
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
             * A Deprecated Card Refund object. This field will be present in the JSON response if
             * and only if `category` is equal to `card_route_refund`.
             */
            @JsonDeserialize(builder = CardRouteRefund.Builder::class)
            @NoAutoDetect
            class CardRouteRefund
            private constructor(
                private val amount: JsonField<Long>,
                private val currency: JsonField<Currency>,
                private val merchantAcceptorId: JsonField<String>,
                private val merchantCity: JsonField<String>,
                private val merchantCountry: JsonField<String>,
                private val merchantDescriptor: JsonField<String>,
                private val merchantState: JsonField<String>,
                private val merchantCategoryCode: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /**
                 * The refunded amount in the minor unit of the refunded currency. For dollars, for
                 * example, this is cents.
                 */
                fun amount(): Long = amount.getRequired("amount")

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the refund
                 * currency.
                 */
                fun currency(): Currency = currency.getRequired("currency")

                fun merchantAcceptorId(): String =
                    merchantAcceptorId.getRequired("merchant_acceptor_id")

                fun merchantCity(): Optional<String> =
                    Optional.ofNullable(merchantCity.getNullable("merchant_city"))

                fun merchantCountry(): String = merchantCountry.getRequired("merchant_country")

                fun merchantDescriptor(): String =
                    merchantDescriptor.getRequired("merchant_descriptor")

                fun merchantState(): Optional<String> =
                    Optional.ofNullable(merchantState.getNullable("merchant_state"))

                fun merchantCategoryCode(): Optional<String> =
                    Optional.ofNullable(merchantCategoryCode.getNullable("merchant_category_code"))

                /**
                 * The refunded amount in the minor unit of the refunded currency. For dollars, for
                 * example, this is cents.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the refund
                 * currency.
                 */
                @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

                @JsonProperty("merchant_acceptor_id")
                @ExcludeMissing
                fun _merchantAcceptorId() = merchantAcceptorId

                @JsonProperty("merchant_city") @ExcludeMissing fun _merchantCity() = merchantCity

                @JsonProperty("merchant_country")
                @ExcludeMissing
                fun _merchantCountry() = merchantCountry

                @JsonProperty("merchant_descriptor")
                @ExcludeMissing
                fun _merchantDescriptor() = merchantDescriptor

                @JsonProperty("merchant_state") @ExcludeMissing fun _merchantState() = merchantState

                @JsonProperty("merchant_category_code")
                @ExcludeMissing
                fun _merchantCategoryCode() = merchantCategoryCode

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate() = apply {
                    if (!validated) {
                        amount()
                        currency()
                        merchantAcceptorId()
                        merchantCity()
                        merchantCountry()
                        merchantDescriptor()
                        merchantState()
                        merchantCategoryCode()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is CardRouteRefund &&
                        this.amount == other.amount &&
                        this.currency == other.currency &&
                        this.merchantAcceptorId == other.merchantAcceptorId &&
                        this.merchantCity == other.merchantCity &&
                        this.merchantCountry == other.merchantCountry &&
                        this.merchantDescriptor == other.merchantDescriptor &&
                        this.merchantState == other.merchantState &&
                        this.merchantCategoryCode == other.merchantCategoryCode &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                amount,
                                currency,
                                merchantAcceptorId,
                                merchantCity,
                                merchantCountry,
                                merchantDescriptor,
                                merchantState,
                                merchantCategoryCode,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "CardRouteRefund{amount=$amount, currency=$currency, merchantAcceptorId=$merchantAcceptorId, merchantCity=$merchantCity, merchantCountry=$merchantCountry, merchantDescriptor=$merchantDescriptor, merchantState=$merchantState, merchantCategoryCode=$merchantCategoryCode, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var amount: JsonField<Long> = JsonMissing.of()
                    private var currency: JsonField<Currency> = JsonMissing.of()
                    private var merchantAcceptorId: JsonField<String> = JsonMissing.of()
                    private var merchantCity: JsonField<String> = JsonMissing.of()
                    private var merchantCountry: JsonField<String> = JsonMissing.of()
                    private var merchantDescriptor: JsonField<String> = JsonMissing.of()
                    private var merchantState: JsonField<String> = JsonMissing.of()
                    private var merchantCategoryCode: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(cardRouteRefund: CardRouteRefund) = apply {
                        this.amount = cardRouteRefund.amount
                        this.currency = cardRouteRefund.currency
                        this.merchantAcceptorId = cardRouteRefund.merchantAcceptorId
                        this.merchantCity = cardRouteRefund.merchantCity
                        this.merchantCountry = cardRouteRefund.merchantCountry
                        this.merchantDescriptor = cardRouteRefund.merchantDescriptor
                        this.merchantState = cardRouteRefund.merchantState
                        this.merchantCategoryCode = cardRouteRefund.merchantCategoryCode
                        additionalProperties(cardRouteRefund.additionalProperties)
                    }

                    /**
                     * The refunded amount in the minor unit of the refunded currency. For dollars,
                     * for example, this is cents.
                     */
                    fun amount(amount: Long) = amount(JsonField.of(amount))

                    /**
                     * The refunded amount in the minor unit of the refunded currency. For dollars,
                     * for example, this is cents.
                     */
                    @JsonProperty("amount")
                    @ExcludeMissing
                    fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the refund
                     * currency.
                     */
                    fun currency(currency: Currency) = currency(JsonField.of(currency))

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the refund
                     * currency.
                     */
                    @JsonProperty("currency")
                    @ExcludeMissing
                    fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                    fun merchantAcceptorId(merchantAcceptorId: String) =
                        merchantAcceptorId(JsonField.of(merchantAcceptorId))

                    @JsonProperty("merchant_acceptor_id")
                    @ExcludeMissing
                    fun merchantAcceptorId(merchantAcceptorId: JsonField<String>) = apply {
                        this.merchantAcceptorId = merchantAcceptorId
                    }

                    fun merchantCity(merchantCity: String) =
                        merchantCity(JsonField.of(merchantCity))

                    @JsonProperty("merchant_city")
                    @ExcludeMissing
                    fun merchantCity(merchantCity: JsonField<String>) = apply {
                        this.merchantCity = merchantCity
                    }

                    fun merchantCountry(merchantCountry: String) =
                        merchantCountry(JsonField.of(merchantCountry))

                    @JsonProperty("merchant_country")
                    @ExcludeMissing
                    fun merchantCountry(merchantCountry: JsonField<String>) = apply {
                        this.merchantCountry = merchantCountry
                    }

                    fun merchantDescriptor(merchantDescriptor: String) =
                        merchantDescriptor(JsonField.of(merchantDescriptor))

                    @JsonProperty("merchant_descriptor")
                    @ExcludeMissing
                    fun merchantDescriptor(merchantDescriptor: JsonField<String>) = apply {
                        this.merchantDescriptor = merchantDescriptor
                    }

                    fun merchantState(merchantState: String) =
                        merchantState(JsonField.of(merchantState))

                    @JsonProperty("merchant_state")
                    @ExcludeMissing
                    fun merchantState(merchantState: JsonField<String>) = apply {
                        this.merchantState = merchantState
                    }

                    fun merchantCategoryCode(merchantCategoryCode: String) =
                        merchantCategoryCode(JsonField.of(merchantCategoryCode))

                    @JsonProperty("merchant_category_code")
                    @ExcludeMissing
                    fun merchantCategoryCode(merchantCategoryCode: JsonField<String>) = apply {
                        this.merchantCategoryCode = merchantCategoryCode
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

                    fun build(): CardRouteRefund =
                        CardRouteRefund(
                            amount,
                            currency,
                            merchantAcceptorId,
                            merchantCity,
                            merchantCountry,
                            merchantDescriptor,
                            merchantState,
                            merchantCategoryCode,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class Currency
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) {

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

            /**
             * A Deprecated Card Settlement object. This field will be present in the JSON response
             * if and only if `category` is equal to `card_route_settlement`.
             */
            @JsonDeserialize(builder = CardRouteSettlement.Builder::class)
            @NoAutoDetect
            class CardRouteSettlement
            private constructor(
                private val amount: JsonField<Long>,
                private val currency: JsonField<Currency>,
                private val merchantAcceptorId: JsonField<String>,
                private val merchantCity: JsonField<String>,
                private val merchantCountry: JsonField<String>,
                private val merchantDescriptor: JsonField<String>,
                private val merchantState: JsonField<String>,
                private val merchantCategoryCode: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /**
                 * The settled amount in the minor unit of the settlement currency. For dollars, for
                 * example, this is cents.
                 */
                fun amount(): Long = amount.getRequired("amount")

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the settlement
                 * currency.
                 */
                fun currency(): Currency = currency.getRequired("currency")

                fun merchantAcceptorId(): String =
                    merchantAcceptorId.getRequired("merchant_acceptor_id")

                fun merchantCity(): Optional<String> =
                    Optional.ofNullable(merchantCity.getNullable("merchant_city"))

                fun merchantCountry(): Optional<String> =
                    Optional.ofNullable(merchantCountry.getNullable("merchant_country"))

                fun merchantDescriptor(): String =
                    merchantDescriptor.getRequired("merchant_descriptor")

                fun merchantState(): Optional<String> =
                    Optional.ofNullable(merchantState.getNullable("merchant_state"))

                fun merchantCategoryCode(): Optional<String> =
                    Optional.ofNullable(merchantCategoryCode.getNullable("merchant_category_code"))

                /**
                 * The settled amount in the minor unit of the settlement currency. For dollars, for
                 * example, this is cents.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the settlement
                 * currency.
                 */
                @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

                @JsonProperty("merchant_acceptor_id")
                @ExcludeMissing
                fun _merchantAcceptorId() = merchantAcceptorId

                @JsonProperty("merchant_city") @ExcludeMissing fun _merchantCity() = merchantCity

                @JsonProperty("merchant_country")
                @ExcludeMissing
                fun _merchantCountry() = merchantCountry

                @JsonProperty("merchant_descriptor")
                @ExcludeMissing
                fun _merchantDescriptor() = merchantDescriptor

                @JsonProperty("merchant_state") @ExcludeMissing fun _merchantState() = merchantState

                @JsonProperty("merchant_category_code")
                @ExcludeMissing
                fun _merchantCategoryCode() = merchantCategoryCode

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate() = apply {
                    if (!validated) {
                        amount()
                        currency()
                        merchantAcceptorId()
                        merchantCity()
                        merchantCountry()
                        merchantDescriptor()
                        merchantState()
                        merchantCategoryCode()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is CardRouteSettlement &&
                        this.amount == other.amount &&
                        this.currency == other.currency &&
                        this.merchantAcceptorId == other.merchantAcceptorId &&
                        this.merchantCity == other.merchantCity &&
                        this.merchantCountry == other.merchantCountry &&
                        this.merchantDescriptor == other.merchantDescriptor &&
                        this.merchantState == other.merchantState &&
                        this.merchantCategoryCode == other.merchantCategoryCode &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                amount,
                                currency,
                                merchantAcceptorId,
                                merchantCity,
                                merchantCountry,
                                merchantDescriptor,
                                merchantState,
                                merchantCategoryCode,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "CardRouteSettlement{amount=$amount, currency=$currency, merchantAcceptorId=$merchantAcceptorId, merchantCity=$merchantCity, merchantCountry=$merchantCountry, merchantDescriptor=$merchantDescriptor, merchantState=$merchantState, merchantCategoryCode=$merchantCategoryCode, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var amount: JsonField<Long> = JsonMissing.of()
                    private var currency: JsonField<Currency> = JsonMissing.of()
                    private var merchantAcceptorId: JsonField<String> = JsonMissing.of()
                    private var merchantCity: JsonField<String> = JsonMissing.of()
                    private var merchantCountry: JsonField<String> = JsonMissing.of()
                    private var merchantDescriptor: JsonField<String> = JsonMissing.of()
                    private var merchantState: JsonField<String> = JsonMissing.of()
                    private var merchantCategoryCode: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(cardRouteSettlement: CardRouteSettlement) = apply {
                        this.amount = cardRouteSettlement.amount
                        this.currency = cardRouteSettlement.currency
                        this.merchantAcceptorId = cardRouteSettlement.merchantAcceptorId
                        this.merchantCity = cardRouteSettlement.merchantCity
                        this.merchantCountry = cardRouteSettlement.merchantCountry
                        this.merchantDescriptor = cardRouteSettlement.merchantDescriptor
                        this.merchantState = cardRouteSettlement.merchantState
                        this.merchantCategoryCode = cardRouteSettlement.merchantCategoryCode
                        additionalProperties(cardRouteSettlement.additionalProperties)
                    }

                    /**
                     * The settled amount in the minor unit of the settlement currency. For dollars,
                     * for example, this is cents.
                     */
                    fun amount(amount: Long) = amount(JsonField.of(amount))

                    /**
                     * The settled amount in the minor unit of the settlement currency. For dollars,
                     * for example, this is cents.
                     */
                    @JsonProperty("amount")
                    @ExcludeMissing
                    fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                     * settlement currency.
                     */
                    fun currency(currency: Currency) = currency(JsonField.of(currency))

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                     * settlement currency.
                     */
                    @JsonProperty("currency")
                    @ExcludeMissing
                    fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                    fun merchantAcceptorId(merchantAcceptorId: String) =
                        merchantAcceptorId(JsonField.of(merchantAcceptorId))

                    @JsonProperty("merchant_acceptor_id")
                    @ExcludeMissing
                    fun merchantAcceptorId(merchantAcceptorId: JsonField<String>) = apply {
                        this.merchantAcceptorId = merchantAcceptorId
                    }

                    fun merchantCity(merchantCity: String) =
                        merchantCity(JsonField.of(merchantCity))

                    @JsonProperty("merchant_city")
                    @ExcludeMissing
                    fun merchantCity(merchantCity: JsonField<String>) = apply {
                        this.merchantCity = merchantCity
                    }

                    fun merchantCountry(merchantCountry: String) =
                        merchantCountry(JsonField.of(merchantCountry))

                    @JsonProperty("merchant_country")
                    @ExcludeMissing
                    fun merchantCountry(merchantCountry: JsonField<String>) = apply {
                        this.merchantCountry = merchantCountry
                    }

                    fun merchantDescriptor(merchantDescriptor: String) =
                        merchantDescriptor(JsonField.of(merchantDescriptor))

                    @JsonProperty("merchant_descriptor")
                    @ExcludeMissing
                    fun merchantDescriptor(merchantDescriptor: JsonField<String>) = apply {
                        this.merchantDescriptor = merchantDescriptor
                    }

                    fun merchantState(merchantState: String) =
                        merchantState(JsonField.of(merchantState))

                    @JsonProperty("merchant_state")
                    @ExcludeMissing
                    fun merchantState(merchantState: JsonField<String>) = apply {
                        this.merchantState = merchantState
                    }

                    fun merchantCategoryCode(merchantCategoryCode: String) =
                        merchantCategoryCode(JsonField.of(merchantCategoryCode))

                    @JsonProperty("merchant_category_code")
                    @ExcludeMissing
                    fun merchantCategoryCode(merchantCategoryCode: JsonField<String>) = apply {
                        this.merchantCategoryCode = merchantCategoryCode
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

                    fun build(): CardRouteSettlement =
                        CardRouteSettlement(
                            amount,
                            currency,
                            merchantAcceptorId,
                            merchantCity,
                            merchantCountry,
                            merchantDescriptor,
                            merchantState,
                            merchantCategoryCode,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class Currency
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) {

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

            /**
             * A Real Time Payments Transfer Acknowledgement object. This field will be present in
             * the JSON response if and only if `category` is equal to
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

                /**
                 * The identifier of the Real Time Payments Transfer that led to this Transaction.
                 */
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

                /**
                 * The identifier of the Real Time Payments Transfer that led to this Transaction.
                 */
                @JsonProperty("transfer_id") @ExcludeMissing fun _transferId() = transferId

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate() = apply {
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
                        realTimePaymentsTransferAcknowledgement:
                            RealTimePaymentsTransferAcknowledgement
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
                    fun destinationAccountNumber(destinationAccountNumber: JsonField<String>) =
                        apply {
                            this.destinationAccountNumber = destinationAccountNumber
                        }

                    /** The American Bankers' Association (ABA) Routing Transit Number (RTN). */
                    fun destinationRoutingNumber(destinationRoutingNumber: String) =
                        destinationRoutingNumber(JsonField.of(destinationRoutingNumber))

                    /** The American Bankers' Association (ABA) Routing Transit Number (RTN). */
                    @JsonProperty("destination_routing_number")
                    @ExcludeMissing
                    fun destinationRoutingNumber(destinationRoutingNumber: JsonField<String>) =
                        apply {
                            this.destinationRoutingNumber = destinationRoutingNumber
                        }

                    /**
                     * Unstructured information that will show on the recipient's bank statement.
                     */
                    fun remittanceInformation(remittanceInformation: String) =
                        remittanceInformation(JsonField.of(remittanceInformation))

                    /**
                     * Unstructured information that will show on the recipient's bank statement.
                     */
                    @JsonProperty("remittance_information")
                    @ExcludeMissing
                    fun remittanceInformation(remittanceInformation: JsonField<String>) = apply {
                        this.remittanceInformation = remittanceInformation
                    }

                    /**
                     * The identifier of the Real Time Payments Transfer that led to this
                     * Transaction.
                     */
                    fun transferId(transferId: String) = transferId(JsonField.of(transferId))

                    /**
                     * The identifier of the Real Time Payments Transfer that led to this
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

                fun validate() = apply {
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
             * A Wire Drawdown Payment Intention object. This field will be present in the JSON
             * response if and only if `category` is equal to `wire_drawdown_payment_intention`.
             */
            @JsonDeserialize(builder = WireDrawdownPaymentIntention.Builder::class)
            @NoAutoDetect
            class WireDrawdownPaymentIntention
            private constructor(
                private val amount: JsonField<Long>,
                private val accountNumber: JsonField<String>,
                private val routingNumber: JsonField<String>,
                private val messageToRecipient: JsonField<String>,
                private val transferId: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /** The transfer amount in USD cents. */
                fun amount(): Long = amount.getRequired("amount")

                fun accountNumber(): String = accountNumber.getRequired("account_number")

                fun routingNumber(): String = routingNumber.getRequired("routing_number")

                fun messageToRecipient(): String =
                    messageToRecipient.getRequired("message_to_recipient")

                fun transferId(): String = transferId.getRequired("transfer_id")

                /** The transfer amount in USD cents. */
                @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

                @JsonProperty("account_number") @ExcludeMissing fun _accountNumber() = accountNumber

                @JsonProperty("routing_number") @ExcludeMissing fun _routingNumber() = routingNumber

                @JsonProperty("message_to_recipient")
                @ExcludeMissing
                fun _messageToRecipient() = messageToRecipient

                @JsonProperty("transfer_id") @ExcludeMissing fun _transferId() = transferId

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate() = apply {
                    if (!validated) {
                        amount()
                        accountNumber()
                        routingNumber()
                        messageToRecipient()
                        transferId()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is WireDrawdownPaymentIntention &&
                        this.amount == other.amount &&
                        this.accountNumber == other.accountNumber &&
                        this.routingNumber == other.routingNumber &&
                        this.messageToRecipient == other.messageToRecipient &&
                        this.transferId == other.transferId &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                amount,
                                accountNumber,
                                routingNumber,
                                messageToRecipient,
                                transferId,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "WireDrawdownPaymentIntention{amount=$amount, accountNumber=$accountNumber, routingNumber=$routingNumber, messageToRecipient=$messageToRecipient, transferId=$transferId, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var amount: JsonField<Long> = JsonMissing.of()
                    private var accountNumber: JsonField<String> = JsonMissing.of()
                    private var routingNumber: JsonField<String> = JsonMissing.of()
                    private var messageToRecipient: JsonField<String> = JsonMissing.of()
                    private var transferId: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(wireDrawdownPaymentIntention: WireDrawdownPaymentIntention) =
                        apply {
                            this.amount = wireDrawdownPaymentIntention.amount
                            this.accountNumber = wireDrawdownPaymentIntention.accountNumber
                            this.routingNumber = wireDrawdownPaymentIntention.routingNumber
                            this.messageToRecipient =
                                wireDrawdownPaymentIntention.messageToRecipient
                            this.transferId = wireDrawdownPaymentIntention.transferId
                            additionalProperties(wireDrawdownPaymentIntention.additionalProperties)
                        }

                    /** The transfer amount in USD cents. */
                    fun amount(amount: Long) = amount(JsonField.of(amount))

                    /** The transfer amount in USD cents. */
                    @JsonProperty("amount")
                    @ExcludeMissing
                    fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                    fun accountNumber(accountNumber: String) =
                        accountNumber(JsonField.of(accountNumber))

                    @JsonProperty("account_number")
                    @ExcludeMissing
                    fun accountNumber(accountNumber: JsonField<String>) = apply {
                        this.accountNumber = accountNumber
                    }

                    fun routingNumber(routingNumber: String) =
                        routingNumber(JsonField.of(routingNumber))

                    @JsonProperty("routing_number")
                    @ExcludeMissing
                    fun routingNumber(routingNumber: JsonField<String>) = apply {
                        this.routingNumber = routingNumber
                    }

                    fun messageToRecipient(messageToRecipient: String) =
                        messageToRecipient(JsonField.of(messageToRecipient))

                    @JsonProperty("message_to_recipient")
                    @ExcludeMissing
                    fun messageToRecipient(messageToRecipient: JsonField<String>) = apply {
                        this.messageToRecipient = messageToRecipient
                    }

                    fun transferId(transferId: String) = transferId(JsonField.of(transferId))

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

                    fun build(): WireDrawdownPaymentIntention =
                        WireDrawdownPaymentIntention(
                            amount,
                            accountNumber,
                            routingNumber,
                            messageToRecipient,
                            transferId,
                            additionalProperties.toUnmodifiable(),
                        )
                }
            }

            /**
             * A Wire Drawdown Payment Rejection object. This field will be present in the JSON
             * response if and only if `category` is equal to `wire_drawdown_payment_rejection`.
             */
            @JsonDeserialize(builder = WireDrawdownPaymentRejection.Builder::class)
            @NoAutoDetect
            class WireDrawdownPaymentRejection
            private constructor(
                private val transferId: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                fun transferId(): String = transferId.getRequired("transfer_id")

                @JsonProperty("transfer_id") @ExcludeMissing fun _transferId() = transferId

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate() = apply {
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

                    return other is WireDrawdownPaymentRejection &&
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
                    "WireDrawdownPaymentRejection{transferId=$transferId, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var transferId: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(wireDrawdownPaymentRejection: WireDrawdownPaymentRejection) =
                        apply {
                            this.transferId = wireDrawdownPaymentRejection.transferId
                            additionalProperties(wireDrawdownPaymentRejection.additionalProperties)
                        }

                    fun transferId(transferId: String) = transferId(JsonField.of(transferId))

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

                    fun build(): WireDrawdownPaymentRejection =
                        WireDrawdownPaymentRejection(
                            transferId,
                            additionalProperties.toUnmodifiable()
                        )
                }
            }

            /**
             * A Wire Transfer Intention object. This field will be present in the JSON response if
             * and only if `category` is equal to `wire_transfer_intention`.
             */
            @JsonDeserialize(builder = WireTransferIntention.Builder::class)
            @NoAutoDetect
            class WireTransferIntention
            private constructor(
                private val amount: JsonField<Long>,
                private val accountNumber: JsonField<String>,
                private val routingNumber: JsonField<String>,
                private val messageToRecipient: JsonField<String>,
                private val transferId: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /** The transfer amount in USD cents. */
                fun amount(): Long = amount.getRequired("amount")

                /** The destination account number. */
                fun accountNumber(): String = accountNumber.getRequired("account_number")

                /** The American Bankers' Association (ABA) Routing Transit Number (RTN). */
                fun routingNumber(): String = routingNumber.getRequired("routing_number")

                /** The message that will show on the recipient's bank statement. */
                fun messageToRecipient(): String =
                    messageToRecipient.getRequired("message_to_recipient")

                fun transferId(): String = transferId.getRequired("transfer_id")

                /** The transfer amount in USD cents. */
                @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

                /** The destination account number. */
                @JsonProperty("account_number") @ExcludeMissing fun _accountNumber() = accountNumber

                /** The American Bankers' Association (ABA) Routing Transit Number (RTN). */
                @JsonProperty("routing_number") @ExcludeMissing fun _routingNumber() = routingNumber

                /** The message that will show on the recipient's bank statement. */
                @JsonProperty("message_to_recipient")
                @ExcludeMissing
                fun _messageToRecipient() = messageToRecipient

                @JsonProperty("transfer_id") @ExcludeMissing fun _transferId() = transferId

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate() = apply {
                    if (!validated) {
                        amount()
                        accountNumber()
                        routingNumber()
                        messageToRecipient()
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
                        this.amount == other.amount &&
                        this.accountNumber == other.accountNumber &&
                        this.routingNumber == other.routingNumber &&
                        this.messageToRecipient == other.messageToRecipient &&
                        this.transferId == other.transferId &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                amount,
                                accountNumber,
                                routingNumber,
                                messageToRecipient,
                                transferId,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "WireTransferIntention{amount=$amount, accountNumber=$accountNumber, routingNumber=$routingNumber, messageToRecipient=$messageToRecipient, transferId=$transferId, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var amount: JsonField<Long> = JsonMissing.of()
                    private var accountNumber: JsonField<String> = JsonMissing.of()
                    private var routingNumber: JsonField<String> = JsonMissing.of()
                    private var messageToRecipient: JsonField<String> = JsonMissing.of()
                    private var transferId: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(wireTransferIntention: WireTransferIntention) = apply {
                        this.amount = wireTransferIntention.amount
                        this.accountNumber = wireTransferIntention.accountNumber
                        this.routingNumber = wireTransferIntention.routingNumber
                        this.messageToRecipient = wireTransferIntention.messageToRecipient
                        this.transferId = wireTransferIntention.transferId
                        additionalProperties(wireTransferIntention.additionalProperties)
                    }

                    /** The transfer amount in USD cents. */
                    fun amount(amount: Long) = amount(JsonField.of(amount))

                    /** The transfer amount in USD cents. */
                    @JsonProperty("amount")
                    @ExcludeMissing
                    fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                    /** The destination account number. */
                    fun accountNumber(accountNumber: String) =
                        accountNumber(JsonField.of(accountNumber))

                    /** The destination account number. */
                    @JsonProperty("account_number")
                    @ExcludeMissing
                    fun accountNumber(accountNumber: JsonField<String>) = apply {
                        this.accountNumber = accountNumber
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

                    /** The message that will show on the recipient's bank statement. */
                    fun messageToRecipient(messageToRecipient: String) =
                        messageToRecipient(JsonField.of(messageToRecipient))

                    /** The message that will show on the recipient's bank statement. */
                    @JsonProperty("message_to_recipient")
                    @ExcludeMissing
                    fun messageToRecipient(messageToRecipient: JsonField<String>) = apply {
                        this.messageToRecipient = messageToRecipient
                    }

                    fun transferId(transferId: String) = transferId(JsonField.of(transferId))

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
                            amount,
                            accountNumber,
                            routingNumber,
                            messageToRecipient,
                            transferId,
                            additionalProperties.toUnmodifiable(),
                        )
                }
            }

            /**
             * A Wire Transfer Rejection object. This field will be present in the JSON response if
             * and only if `category` is equal to `wire_transfer_rejection`.
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

                fun transferId(): String = transferId.getRequired("transfer_id")

                @JsonProperty("transfer_id") @ExcludeMissing fun _transferId() = transferId

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate() = apply {
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

                    fun transferId(transferId: String) = transferId(JsonField.of(transferId))

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
        ) {

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

    /**
     * If the Real Time Payments Transfer attempt fails, this will contain the resulting
     * [Declined Transaction](#declined-transactions) object. The Declined Transaction's `source`
     * will be of `category: inbound_real_time_payments_transfer_decline`.
     */
    @JsonDeserialize(builder = DeclinedTransaction.Builder::class)
    @NoAutoDetect
    class DeclinedTransaction
    private constructor(
        private val accountId: JsonField<String>,
        private val amount: JsonField<Long>,
        private val currency: JsonField<Currency>,
        private val createdAt: JsonField<OffsetDateTime>,
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

        /** The identifier for the Account the Declined Transaction belongs to. */
        fun accountId(): String = accountId.getRequired("account_id")

        /**
         * The Declined Transaction amount in the minor unit of its currency. For dollars, for
         * example, this is cents.
         */
        fun amount(): Long = amount.getRequired("amount")

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the Declined
         * Transaction's currency. This will match the currency on the Declined Transcation's
         * Account.
         */
        fun currency(): Currency = currency.getRequired("currency")

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date on which the Transaction
         * occured.
         */
        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        /** This is the description the vendor provides. */
        fun description(): String = description.getRequired("description")

        /** The Declined Transaction identifier. */
        fun id(): String = id.getRequired("id")

        /**
         * The identifier for the route this Declined Transaction came through. Routes are things
         * like cards and ACH details.
         */
        fun routeId(): Optional<String> = Optional.ofNullable(routeId.getNullable("route_id"))

        /** The type of the route this Declined Transaction came through. */
        fun routeType(): Optional<RouteType> =
            Optional.ofNullable(routeType.getNullable("route_type"))

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
         * The Declined Transaction amount in the minor unit of its currency. For dollars, for
         * example, this is cents.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the Declined
         * Transaction's currency. This will match the currency on the Declined Transcation's
         * Account.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date on which the Transaction
         * occured.
         */
        @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

        /** This is the description the vendor provides. */
        @JsonProperty("description") @ExcludeMissing fun _description() = description

        /** The Declined Transaction identifier. */
        @JsonProperty("id") @ExcludeMissing fun _id() = id

        /**
         * The identifier for the route this Declined Transaction came through. Routes are things
         * like cards and ACH details.
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

        fun validate() = apply {
            if (!validated) {
                accountId()
                amount()
                currency()
                createdAt()
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

            return other is DeclinedTransaction &&
                this.accountId == other.accountId &&
                this.amount == other.amount &&
                this.currency == other.currency &&
                this.createdAt == other.createdAt &&
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
                        currency,
                        createdAt,
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
            "DeclinedTransaction{accountId=$accountId, amount=$amount, currency=$currency, createdAt=$createdAt, description=$description, id=$id, routeId=$routeId, routeType=$routeType, source=$source, type=$type, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var accountId: JsonField<String> = JsonMissing.of()
            private var amount: JsonField<Long> = JsonMissing.of()
            private var currency: JsonField<Currency> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
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
                this.currency = declinedTransaction.currency
                this.createdAt = declinedTransaction.createdAt
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
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the Declined
             * Transaction's currency. This will match the currency on the Declined Transcation's
             * Account.
             */
            fun currency(currency: Currency) = currency(JsonField.of(currency))

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the Declined
             * Transaction's currency. This will match the currency on the Declined Transcation's
             * Account.
             */
            @JsonProperty("currency")
            @ExcludeMissing
            fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date on which the Transaction
             * occured.
             */
            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date on which the Transaction
             * occured.
             */
            @JsonProperty("created_at")
            @ExcludeMissing
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            /** This is the description the vendor provides. */
            fun description(description: String) = description(JsonField.of(description))

            /** This is the description the vendor provides. */
            @JsonProperty("description")
            @ExcludeMissing
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /** The Declined Transaction identifier. */
            fun id(id: String) = id(JsonField.of(id))

            /** The Declined Transaction identifier. */
            @JsonProperty("id")
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply { this.id = id }

            /**
             * The identifier for the route this Declined Transaction came through. Routes are
             * things like cards and ACH details.
             */
            fun routeId(routeId: String) = routeId(JsonField.of(routeId))

            /**
             * The identifier for the route this Declined Transaction came through. Routes are
             * things like cards and ACH details.
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
             * This is an object giving more details on the network-level event that caused the
             * Declined Transaction. For example, for a card transaction this lists the merchant's
             * industry and location. Note that for backwards compatibility reasons, additional
             * undocumented keys may appear in this object. These should be treated as deprecated
             * and will be removed in the future.
             */
            fun source(source: Source) = source(JsonField.of(source))

            /**
             * This is an object giving more details on the network-level event that caused the
             * Declined Transaction. For example, for a card transaction this lists the merchant's
             * industry and location. Note that for backwards compatibility reasons, additional
             * undocumented keys may appear in this object. These should be treated as deprecated
             * and will be removed in the future.
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
                    currency,
                    createdAt,
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
        ) {

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
        ) {

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

                @JvmStatic fun of(value: String) = RouteType(JsonField.of(value))
            }

            enum class Known {
                ACCOUNT_NUMBER,
                CARD,
            }

            enum class Value {
                ACCOUNT_NUMBER,
                CARD,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    ACCOUNT_NUMBER -> Value.ACCOUNT_NUMBER
                    CARD -> Value.CARD
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    ACCOUNT_NUMBER -> Known.ACCOUNT_NUMBER
                    CARD -> Known.CARD
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
            private val category: JsonField<Category>,
            private val achDecline: JsonField<AchDecline>,
            private val cardDecline: JsonField<CardDecline>,
            private val checkDecline: JsonField<CheckDecline>,
            private val inboundRealTimePaymentsTransferDecline:
                JsonField<InboundRealTimePaymentsTransferDecline>,
            private val internationalAchDecline: JsonField<InternationalAchDecline>,
            private val cardRouteDecline: JsonField<CardRouteDecline>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /**
             * The type of decline that took place. We may add additional possible values for this
             * enum over time; your application should be able to handle such additions gracefully.
             */
            fun category(): Category = category.getRequired("category")

            /**
             * A ACH Decline object. This field will be present in the JSON response if and only if
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
             * A Check Decline object. This field will be present in the JSON response if and only
             * if `category` is equal to `check_decline`.
             */
            fun checkDecline(): Optional<CheckDecline> =
                Optional.ofNullable(checkDecline.getNullable("check_decline"))

            /**
             * A Inbound Real Time Payments Transfer Decline object. This field will be present in
             * the JSON response if and only if `category` is equal to
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
             * A International ACH Decline object. This field will be present in the JSON response
             * if and only if `category` is equal to `international_ach_decline`.
             */
            fun internationalAchDecline(): Optional<InternationalAchDecline> =
                Optional.ofNullable(
                    internationalAchDecline.getNullable("international_ach_decline")
                )

            /**
             * A Deprecated Card Decline object. This field will be present in the JSON response if
             * and only if `category` is equal to `card_route_decline`.
             */
            fun cardRouteDecline(): Optional<CardRouteDecline> =
                Optional.ofNullable(cardRouteDecline.getNullable("card_route_decline"))

            /**
             * The type of decline that took place. We may add additional possible values for this
             * enum over time; your application should be able to handle such additions gracefully.
             */
            @JsonProperty("category") @ExcludeMissing fun _category() = category

            /**
             * A ACH Decline object. This field will be present in the JSON response if and only if
             * `category` is equal to `ach_decline`.
             */
            @JsonProperty("ach_decline") @ExcludeMissing fun _achDecline() = achDecline

            /**
             * A Card Decline object. This field will be present in the JSON response if and only if
             * `category` is equal to `card_decline`.
             */
            @JsonProperty("card_decline") @ExcludeMissing fun _cardDecline() = cardDecline

            /**
             * A Check Decline object. This field will be present in the JSON response if and only
             * if `category` is equal to `check_decline`.
             */
            @JsonProperty("check_decline") @ExcludeMissing fun _checkDecline() = checkDecline

            /**
             * A Inbound Real Time Payments Transfer Decline object. This field will be present in
             * the JSON response if and only if `category` is equal to
             * `inbound_real_time_payments_transfer_decline`.
             */
            @JsonProperty("inbound_real_time_payments_transfer_decline")
            @ExcludeMissing
            fun _inboundRealTimePaymentsTransferDecline() = inboundRealTimePaymentsTransferDecline

            /**
             * A International ACH Decline object. This field will be present in the JSON response
             * if and only if `category` is equal to `international_ach_decline`.
             */
            @JsonProperty("international_ach_decline")
            @ExcludeMissing
            fun _internationalAchDecline() = internationalAchDecline

            /**
             * A Deprecated Card Decline object. This field will be present in the JSON response if
             * and only if `category` is equal to `card_route_decline`.
             */
            @JsonProperty("card_route_decline")
            @ExcludeMissing
            fun _cardRouteDecline() = cardRouteDecline

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate() = apply {
                if (!validated) {
                    category()
                    achDecline().map { it.validate() }
                    cardDecline().map { it.validate() }
                    checkDecline().map { it.validate() }
                    inboundRealTimePaymentsTransferDecline().map { it.validate() }
                    internationalAchDecline().map { it.validate() }
                    cardRouteDecline().map { it.validate() }
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Source &&
                    this.category == other.category &&
                    this.achDecline == other.achDecline &&
                    this.cardDecline == other.cardDecline &&
                    this.checkDecline == other.checkDecline &&
                    this.inboundRealTimePaymentsTransferDecline ==
                        other.inboundRealTimePaymentsTransferDecline &&
                    this.internationalAchDecline == other.internationalAchDecline &&
                    this.cardRouteDecline == other.cardRouteDecline &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            category,
                            achDecline,
                            cardDecline,
                            checkDecline,
                            inboundRealTimePaymentsTransferDecline,
                            internationalAchDecline,
                            cardRouteDecline,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Source{category=$category, achDecline=$achDecline, cardDecline=$cardDecline, checkDecline=$checkDecline, inboundRealTimePaymentsTransferDecline=$inboundRealTimePaymentsTransferDecline, internationalAchDecline=$internationalAchDecline, cardRouteDecline=$cardRouteDecline, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var category: JsonField<Category> = JsonMissing.of()
                private var achDecline: JsonField<AchDecline> = JsonMissing.of()
                private var cardDecline: JsonField<CardDecline> = JsonMissing.of()
                private var checkDecline: JsonField<CheckDecline> = JsonMissing.of()
                private var inboundRealTimePaymentsTransferDecline:
                    JsonField<InboundRealTimePaymentsTransferDecline> =
                    JsonMissing.of()
                private var internationalAchDecline: JsonField<InternationalAchDecline> =
                    JsonMissing.of()
                private var cardRouteDecline: JsonField<CardRouteDecline> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(source: Source) = apply {
                    this.category = source.category
                    this.achDecline = source.achDecline
                    this.cardDecline = source.cardDecline
                    this.checkDecline = source.checkDecline
                    this.inboundRealTimePaymentsTransferDecline =
                        source.inboundRealTimePaymentsTransferDecline
                    this.internationalAchDecline = source.internationalAchDecline
                    this.cardRouteDecline = source.cardRouteDecline
                    additionalProperties(source.additionalProperties)
                }

                /**
                 * The type of decline that took place. We may add additional possible values for
                 * this enum over time; your application should be able to handle such additions
                 * gracefully.
                 */
                fun category(category: Category) = category(JsonField.of(category))

                /**
                 * The type of decline that took place. We may add additional possible values for
                 * this enum over time; your application should be able to handle such additions
                 * gracefully.
                 */
                @JsonProperty("category")
                @ExcludeMissing
                fun category(category: JsonField<Category>) = apply { this.category = category }

                /**
                 * A ACH Decline object. This field will be present in the JSON response if and only
                 * if `category` is equal to `ach_decline`.
                 */
                fun achDecline(achDecline: AchDecline) = achDecline(JsonField.of(achDecline))

                /**
                 * A ACH Decline object. This field will be present in the JSON response if and only
                 * if `category` is equal to `ach_decline`.
                 */
                @JsonProperty("ach_decline")
                @ExcludeMissing
                fun achDecline(achDecline: JsonField<AchDecline>) = apply {
                    this.achDecline = achDecline
                }

                /**
                 * A Card Decline object. This field will be present in the JSON response if and
                 * only if `category` is equal to `card_decline`.
                 */
                fun cardDecline(cardDecline: CardDecline) = cardDecline(JsonField.of(cardDecline))

                /**
                 * A Card Decline object. This field will be present in the JSON response if and
                 * only if `category` is equal to `card_decline`.
                 */
                @JsonProperty("card_decline")
                @ExcludeMissing
                fun cardDecline(cardDecline: JsonField<CardDecline>) = apply {
                    this.cardDecline = cardDecline
                }

                /**
                 * A Check Decline object. This field will be present in the JSON response if and
                 * only if `category` is equal to `check_decline`.
                 */
                fun checkDecline(checkDecline: CheckDecline) =
                    checkDecline(JsonField.of(checkDecline))

                /**
                 * A Check Decline object. This field will be present in the JSON response if and
                 * only if `category` is equal to `check_decline`.
                 */
                @JsonProperty("check_decline")
                @ExcludeMissing
                fun checkDecline(checkDecline: JsonField<CheckDecline>) = apply {
                    this.checkDecline = checkDecline
                }

                /**
                 * A Inbound Real Time Payments Transfer Decline object. This field will be present
                 * in the JSON response if and only if `category` is equal to
                 * `inbound_real_time_payments_transfer_decline`.
                 */
                fun inboundRealTimePaymentsTransferDecline(
                    inboundRealTimePaymentsTransferDecline: InboundRealTimePaymentsTransferDecline
                ) =
                    inboundRealTimePaymentsTransferDecline(
                        JsonField.of(inboundRealTimePaymentsTransferDecline)
                    )

                /**
                 * A Inbound Real Time Payments Transfer Decline object. This field will be present
                 * in the JSON response if and only if `category` is equal to
                 * `inbound_real_time_payments_transfer_decline`.
                 */
                @JsonProperty("inbound_real_time_payments_transfer_decline")
                @ExcludeMissing
                fun inboundRealTimePaymentsTransferDecline(
                    inboundRealTimePaymentsTransferDecline:
                        JsonField<InboundRealTimePaymentsTransferDecline>
                ) = apply {
                    this.inboundRealTimePaymentsTransferDecline =
                        inboundRealTimePaymentsTransferDecline
                }

                /**
                 * A International ACH Decline object. This field will be present in the JSON
                 * response if and only if `category` is equal to `international_ach_decline`.
                 */
                fun internationalAchDecline(internationalAchDecline: InternationalAchDecline) =
                    internationalAchDecline(JsonField.of(internationalAchDecline))

                /**
                 * A International ACH Decline object. This field will be present in the JSON
                 * response if and only if `category` is equal to `international_ach_decline`.
                 */
                @JsonProperty("international_ach_decline")
                @ExcludeMissing
                fun internationalAchDecline(
                    internationalAchDecline: JsonField<InternationalAchDecline>
                ) = apply { this.internationalAchDecline = internationalAchDecline }

                /**
                 * A Deprecated Card Decline object. This field will be present in the JSON response
                 * if and only if `category` is equal to `card_route_decline`.
                 */
                fun cardRouteDecline(cardRouteDecline: CardRouteDecline) =
                    cardRouteDecline(JsonField.of(cardRouteDecline))

                /**
                 * A Deprecated Card Decline object. This field will be present in the JSON response
                 * if and only if `category` is equal to `card_route_decline`.
                 */
                @JsonProperty("card_route_decline")
                @ExcludeMissing
                fun cardRouteDecline(cardRouteDecline: JsonField<CardRouteDecline>) = apply {
                    this.cardRouteDecline = cardRouteDecline
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

                fun build(): Source =
                    Source(
                        category,
                        achDecline,
                        cardDecline,
                        checkDecline,
                        inboundRealTimePaymentsTransferDecline,
                        internationalAchDecline,
                        cardRouteDecline,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class Category
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) {

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

                    @JvmField val ACH_DECLINE = Category(JsonField.of("ach_decline"))

                    @JvmField val CARD_DECLINE = Category(JsonField.of("card_decline"))

                    @JvmField val CHECK_DECLINE = Category(JsonField.of("check_decline"))

                    @JvmField
                    val INBOUND_REAL_TIME_PAYMENTS_TRANSFER_DECLINE =
                        Category(JsonField.of("inbound_real_time_payments_transfer_decline"))

                    @JvmField
                    val INTERNATIONAL_ACH_DECLINE =
                        Category(JsonField.of("international_ach_decline"))

                    @JvmField val CARD_ROUTE_DECLINE = Category(JsonField.of("card_route_decline"))

                    @JvmField val OTHER = Category(JsonField.of("other"))

                    @JvmStatic fun of(value: String) = Category(JsonField.of(value))
                }

                enum class Known {
                    ACH_DECLINE,
                    CARD_DECLINE,
                    CHECK_DECLINE,
                    INBOUND_REAL_TIME_PAYMENTS_TRANSFER_DECLINE,
                    INTERNATIONAL_ACH_DECLINE,
                    CARD_ROUTE_DECLINE,
                    OTHER,
                }

                enum class Value {
                    ACH_DECLINE,
                    CARD_DECLINE,
                    CHECK_DECLINE,
                    INBOUND_REAL_TIME_PAYMENTS_TRANSFER_DECLINE,
                    INTERNATIONAL_ACH_DECLINE,
                    CARD_ROUTE_DECLINE,
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
                        INTERNATIONAL_ACH_DECLINE -> Value.INTERNATIONAL_ACH_DECLINE
                        CARD_ROUTE_DECLINE -> Value.CARD_ROUTE_DECLINE
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
                        INTERNATIONAL_ACH_DECLINE -> Known.INTERNATIONAL_ACH_DECLINE
                        CARD_ROUTE_DECLINE -> Known.CARD_ROUTE_DECLINE
                        OTHER -> Known.OTHER
                        else -> throw IncreaseInvalidDataException("Unknown Category: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            /**
             * A ACH Decline object. This field will be present in the JSON response if and only if
             * `category` is equal to `ach_decline`.
             */
            @JsonDeserialize(builder = AchDecline.Builder::class)
            @NoAutoDetect
            class AchDecline
            private constructor(
                private val amount: JsonField<Long>,
                private val originatorCompanyName: JsonField<String>,
                private val originatorCompanyDescriptiveDate: JsonField<String>,
                private val originatorCompanyDiscretionaryData: JsonField<String>,
                private val originatorCompanyId: JsonField<String>,
                private val reason: JsonField<Reason>,
                private val receiverIdNumber: JsonField<String>,
                private val receiverName: JsonField<String>,
                private val traceNumber: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /**
                 * The declined amount in the minor unit of the destination account currency. For
                 * dollars, for example, this is cents.
                 */
                fun amount(): Long = amount.getRequired("amount")

                fun originatorCompanyName(): String =
                    originatorCompanyName.getRequired("originator_company_name")

                fun originatorCompanyDescriptiveDate(): Optional<String> =
                    Optional.ofNullable(
                        originatorCompanyDescriptiveDate.getNullable(
                            "originator_company_descriptive_date"
                        )
                    )

                fun originatorCompanyDiscretionaryData(): Optional<String> =
                    Optional.ofNullable(
                        originatorCompanyDiscretionaryData.getNullable(
                            "originator_company_discretionary_data"
                        )
                    )

                fun originatorCompanyId(): String =
                    originatorCompanyId.getRequired("originator_company_id")

                /** Why the ACH transfer was declined. */
                fun reason(): Reason = reason.getRequired("reason")

                fun receiverIdNumber(): Optional<String> =
                    Optional.ofNullable(receiverIdNumber.getNullable("receiver_id_number"))

                fun receiverName(): Optional<String> =
                    Optional.ofNullable(receiverName.getNullable("receiver_name"))

                fun traceNumber(): String = traceNumber.getRequired("trace_number")

                /**
                 * The declined amount in the minor unit of the destination account currency. For
                 * dollars, for example, this is cents.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

                @JsonProperty("originator_company_name")
                @ExcludeMissing
                fun _originatorCompanyName() = originatorCompanyName

                @JsonProperty("originator_company_descriptive_date")
                @ExcludeMissing
                fun _originatorCompanyDescriptiveDate() = originatorCompanyDescriptiveDate

                @JsonProperty("originator_company_discretionary_data")
                @ExcludeMissing
                fun _originatorCompanyDiscretionaryData() = originatorCompanyDiscretionaryData

                @JsonProperty("originator_company_id")
                @ExcludeMissing
                fun _originatorCompanyId() = originatorCompanyId

                /** Why the ACH transfer was declined. */
                @JsonProperty("reason") @ExcludeMissing fun _reason() = reason

                @JsonProperty("receiver_id_number")
                @ExcludeMissing
                fun _receiverIdNumber() = receiverIdNumber

                @JsonProperty("receiver_name") @ExcludeMissing fun _receiverName() = receiverName

                @JsonProperty("trace_number") @ExcludeMissing fun _traceNumber() = traceNumber

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate() = apply {
                    if (!validated) {
                        amount()
                        originatorCompanyName()
                        originatorCompanyDescriptiveDate()
                        originatorCompanyDiscretionaryData()
                        originatorCompanyId()
                        reason()
                        receiverIdNumber()
                        receiverName()
                        traceNumber()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is AchDecline &&
                        this.amount == other.amount &&
                        this.originatorCompanyName == other.originatorCompanyName &&
                        this.originatorCompanyDescriptiveDate ==
                            other.originatorCompanyDescriptiveDate &&
                        this.originatorCompanyDiscretionaryData ==
                            other.originatorCompanyDiscretionaryData &&
                        this.originatorCompanyId == other.originatorCompanyId &&
                        this.reason == other.reason &&
                        this.receiverIdNumber == other.receiverIdNumber &&
                        this.receiverName == other.receiverName &&
                        this.traceNumber == other.traceNumber &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                amount,
                                originatorCompanyName,
                                originatorCompanyDescriptiveDate,
                                originatorCompanyDiscretionaryData,
                                originatorCompanyId,
                                reason,
                                receiverIdNumber,
                                receiverName,
                                traceNumber,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "AchDecline{amount=$amount, originatorCompanyName=$originatorCompanyName, originatorCompanyDescriptiveDate=$originatorCompanyDescriptiveDate, originatorCompanyDiscretionaryData=$originatorCompanyDiscretionaryData, originatorCompanyId=$originatorCompanyId, reason=$reason, receiverIdNumber=$receiverIdNumber, receiverName=$receiverName, traceNumber=$traceNumber, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var amount: JsonField<Long> = JsonMissing.of()
                    private var originatorCompanyName: JsonField<String> = JsonMissing.of()
                    private var originatorCompanyDescriptiveDate: JsonField<String> =
                        JsonMissing.of()
                    private var originatorCompanyDiscretionaryData: JsonField<String> =
                        JsonMissing.of()
                    private var originatorCompanyId: JsonField<String> = JsonMissing.of()
                    private var reason: JsonField<Reason> = JsonMissing.of()
                    private var receiverIdNumber: JsonField<String> = JsonMissing.of()
                    private var receiverName: JsonField<String> = JsonMissing.of()
                    private var traceNumber: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(achDecline: AchDecline) = apply {
                        this.amount = achDecline.amount
                        this.originatorCompanyName = achDecline.originatorCompanyName
                        this.originatorCompanyDescriptiveDate =
                            achDecline.originatorCompanyDescriptiveDate
                        this.originatorCompanyDiscretionaryData =
                            achDecline.originatorCompanyDiscretionaryData
                        this.originatorCompanyId = achDecline.originatorCompanyId
                        this.reason = achDecline.reason
                        this.receiverIdNumber = achDecline.receiverIdNumber
                        this.receiverName = achDecline.receiverName
                        this.traceNumber = achDecline.traceNumber
                        additionalProperties(achDecline.additionalProperties)
                    }

                    /**
                     * The declined amount in the minor unit of the destination account currency.
                     * For dollars, for example, this is cents.
                     */
                    fun amount(amount: Long) = amount(JsonField.of(amount))

                    /**
                     * The declined amount in the minor unit of the destination account currency.
                     * For dollars, for example, this is cents.
                     */
                    @JsonProperty("amount")
                    @ExcludeMissing
                    fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                    fun originatorCompanyName(originatorCompanyName: String) =
                        originatorCompanyName(JsonField.of(originatorCompanyName))

                    @JsonProperty("originator_company_name")
                    @ExcludeMissing
                    fun originatorCompanyName(originatorCompanyName: JsonField<String>) = apply {
                        this.originatorCompanyName = originatorCompanyName
                    }

                    fun originatorCompanyDescriptiveDate(originatorCompanyDescriptiveDate: String) =
                        originatorCompanyDescriptiveDate(
                            JsonField.of(originatorCompanyDescriptiveDate)
                        )

                    @JsonProperty("originator_company_descriptive_date")
                    @ExcludeMissing
                    fun originatorCompanyDescriptiveDate(
                        originatorCompanyDescriptiveDate: JsonField<String>
                    ) = apply {
                        this.originatorCompanyDescriptiveDate = originatorCompanyDescriptiveDate
                    }

                    fun originatorCompanyDiscretionaryData(
                        originatorCompanyDiscretionaryData: String
                    ) =
                        originatorCompanyDiscretionaryData(
                            JsonField.of(originatorCompanyDiscretionaryData)
                        )

                    @JsonProperty("originator_company_discretionary_data")
                    @ExcludeMissing
                    fun originatorCompanyDiscretionaryData(
                        originatorCompanyDiscretionaryData: JsonField<String>
                    ) = apply {
                        this.originatorCompanyDiscretionaryData = originatorCompanyDiscretionaryData
                    }

                    fun originatorCompanyId(originatorCompanyId: String) =
                        originatorCompanyId(JsonField.of(originatorCompanyId))

                    @JsonProperty("originator_company_id")
                    @ExcludeMissing
                    fun originatorCompanyId(originatorCompanyId: JsonField<String>) = apply {
                        this.originatorCompanyId = originatorCompanyId
                    }

                    /** Why the ACH transfer was declined. */
                    fun reason(reason: Reason) = reason(JsonField.of(reason))

                    /** Why the ACH transfer was declined. */
                    @JsonProperty("reason")
                    @ExcludeMissing
                    fun reason(reason: JsonField<Reason>) = apply { this.reason = reason }

                    fun receiverIdNumber(receiverIdNumber: String) =
                        receiverIdNumber(JsonField.of(receiverIdNumber))

                    @JsonProperty("receiver_id_number")
                    @ExcludeMissing
                    fun receiverIdNumber(receiverIdNumber: JsonField<String>) = apply {
                        this.receiverIdNumber = receiverIdNumber
                    }

                    fun receiverName(receiverName: String) =
                        receiverName(JsonField.of(receiverName))

                    @JsonProperty("receiver_name")
                    @ExcludeMissing
                    fun receiverName(receiverName: JsonField<String>) = apply {
                        this.receiverName = receiverName
                    }

                    fun traceNumber(traceNumber: String) = traceNumber(JsonField.of(traceNumber))

                    @JsonProperty("trace_number")
                    @ExcludeMissing
                    fun traceNumber(traceNumber: JsonField<String>) = apply {
                        this.traceNumber = traceNumber
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

                    fun build(): AchDecline =
                        AchDecline(
                            amount,
                            originatorCompanyName,
                            originatorCompanyDescriptiveDate,
                            originatorCompanyDiscretionaryData,
                            originatorCompanyId,
                            reason,
                            receiverIdNumber,
                            receiverName,
                            traceNumber,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class Reason
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

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
                        val ACH_ROUTE_CANCELED = Reason(JsonField.of("ach_route_canceled"))

                        @JvmField
                        val ACH_ROUTE_DISABLED = Reason(JsonField.of("ach_route_disabled"))

                        @JvmField val BREACHES_LIMIT = Reason(JsonField.of("breaches_limit"))

                        @JvmField
                        val CREDIT_ENTRY_REFUSED_BY_RECEIVER =
                            Reason(JsonField.of("credit_entry_refused_by_receiver"))

                        @JvmField val DUPLICATE_RETURN = Reason(JsonField.of("duplicate_return"))

                        @JvmField val ENTITY_NOT_ACTIVE = Reason(JsonField.of("entity_not_active"))

                        @JvmField val GROUP_LOCKED = Reason(JsonField.of("group_locked"))

                        @JvmField
                        val INSUFFICIENT_FUNDS = Reason(JsonField.of("insufficient_funds"))

                        @JvmField val MISROUTED_RETURN = Reason(JsonField.of("misrouted_return"))

                        @JvmField val NO_ACH_ROUTE = Reason(JsonField.of("no_ach_route"))

                        @JvmField
                        val ORIGINATOR_REQUEST = Reason(JsonField.of("originator_request"))

                        @JvmField
                        val TRANSACTION_NOT_ALLOWED =
                            Reason(JsonField.of("transaction_not_allowed"))

                        @JvmStatic fun of(value: String) = Reason(JsonField.of(value))
                    }

                    enum class Known {
                        ACH_ROUTE_CANCELED,
                        ACH_ROUTE_DISABLED,
                        BREACHES_LIMIT,
                        CREDIT_ENTRY_REFUSED_BY_RECEIVER,
                        DUPLICATE_RETURN,
                        ENTITY_NOT_ACTIVE,
                        GROUP_LOCKED,
                        INSUFFICIENT_FUNDS,
                        MISROUTED_RETURN,
                        NO_ACH_ROUTE,
                        ORIGINATOR_REQUEST,
                        TRANSACTION_NOT_ALLOWED,
                    }

                    enum class Value {
                        ACH_ROUTE_CANCELED,
                        ACH_ROUTE_DISABLED,
                        BREACHES_LIMIT,
                        CREDIT_ENTRY_REFUSED_BY_RECEIVER,
                        DUPLICATE_RETURN,
                        ENTITY_NOT_ACTIVE,
                        GROUP_LOCKED,
                        INSUFFICIENT_FUNDS,
                        MISROUTED_RETURN,
                        NO_ACH_ROUTE,
                        ORIGINATOR_REQUEST,
                        TRANSACTION_NOT_ALLOWED,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            ACH_ROUTE_CANCELED -> Value.ACH_ROUTE_CANCELED
                            ACH_ROUTE_DISABLED -> Value.ACH_ROUTE_DISABLED
                            BREACHES_LIMIT -> Value.BREACHES_LIMIT
                            CREDIT_ENTRY_REFUSED_BY_RECEIVER ->
                                Value.CREDIT_ENTRY_REFUSED_BY_RECEIVER
                            DUPLICATE_RETURN -> Value.DUPLICATE_RETURN
                            ENTITY_NOT_ACTIVE -> Value.ENTITY_NOT_ACTIVE
                            GROUP_LOCKED -> Value.GROUP_LOCKED
                            INSUFFICIENT_FUNDS -> Value.INSUFFICIENT_FUNDS
                            MISROUTED_RETURN -> Value.MISROUTED_RETURN
                            NO_ACH_ROUTE -> Value.NO_ACH_ROUTE
                            ORIGINATOR_REQUEST -> Value.ORIGINATOR_REQUEST
                            TRANSACTION_NOT_ALLOWED -> Value.TRANSACTION_NOT_ALLOWED
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            ACH_ROUTE_CANCELED -> Known.ACH_ROUTE_CANCELED
                            ACH_ROUTE_DISABLED -> Known.ACH_ROUTE_DISABLED
                            BREACHES_LIMIT -> Known.BREACHES_LIMIT
                            CREDIT_ENTRY_REFUSED_BY_RECEIVER ->
                                Known.CREDIT_ENTRY_REFUSED_BY_RECEIVER
                            DUPLICATE_RETURN -> Known.DUPLICATE_RETURN
                            ENTITY_NOT_ACTIVE -> Known.ENTITY_NOT_ACTIVE
                            GROUP_LOCKED -> Known.GROUP_LOCKED
                            INSUFFICIENT_FUNDS -> Known.INSUFFICIENT_FUNDS
                            MISROUTED_RETURN -> Known.MISROUTED_RETURN
                            NO_ACH_ROUTE -> Known.NO_ACH_ROUTE
                            ORIGINATOR_REQUEST -> Known.ORIGINATOR_REQUEST
                            TRANSACTION_NOT_ALLOWED -> Known.TRANSACTION_NOT_ALLOWED
                            else -> throw IncreaseInvalidDataException("Unknown Reason: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }
            }

            /**
             * A Card Decline object. This field will be present in the JSON response if and only if
             * `category` is equal to `card_decline`.
             */
            @JsonDeserialize(builder = CardDecline.Builder::class)
            @NoAutoDetect
            class CardDecline
            private constructor(
                private val merchantAcceptorId: JsonField<String>,
                private val merchantDescriptor: JsonField<String>,
                private val merchantCategoryCode: JsonField<String>,
                private val merchantCity: JsonField<String>,
                private val merchantCountry: JsonField<String>,
                private val network: JsonField<Network>,
                private val networkDetails: JsonField<NetworkDetails>,
                private val amount: JsonField<Long>,
                private val currency: JsonField<Currency>,
                private val reason: JsonField<Reason>,
                private val merchantState: JsonField<String>,
                private val realTimeDecisionId: JsonField<String>,
                private val digitalWalletTokenId: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /**
                 * The merchant identifier (commonly abbreviated as MID) of the merchant the card is
                 * transacting with.
                 */
                fun merchantAcceptorId(): String =
                    merchantAcceptorId.getRequired("merchant_acceptor_id")

                /** The merchant descriptor of the merchant the card is transacting with. */
                fun merchantDescriptor(): String =
                    merchantDescriptor.getRequired("merchant_descriptor")

                /**
                 * The Merchant Category Code (commonly abbreviated as MCC) of the merchant the card
                 * is transacting with.
                 */
                fun merchantCategoryCode(): Optional<String> =
                    Optional.ofNullable(merchantCategoryCode.getNullable("merchant_category_code"))

                /** The city the merchant resides in. */
                fun merchantCity(): Optional<String> =
                    Optional.ofNullable(merchantCity.getNullable("merchant_city"))

                /** The country the merchant resides in. */
                fun merchantCountry(): Optional<String> =
                    Optional.ofNullable(merchantCountry.getNullable("merchant_country"))

                /** The payment network used to process this card authorization */
                fun network(): Network = network.getRequired("network")

                /** Fields specific to the `network` */
                fun networkDetails(): NetworkDetails = networkDetails.getRequired("network_details")

                /**
                 * The declined amount in the minor unit of the destination account currency. For
                 * dollars, for example, this is cents.
                 */
                fun amount(): Long = amount.getRequired("amount")

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the destination
                 * account currency.
                 */
                fun currency(): Currency = currency.getRequired("currency")

                /** Why the transaction was declined. */
                fun reason(): Reason = reason.getRequired("reason")

                /** The state the merchant resides in. */
                fun merchantState(): Optional<String> =
                    Optional.ofNullable(merchantState.getNullable("merchant_state"))

                /**
                 * The identifier of the Real-Time Decision sent to approve or decline this
                 * transaction.
                 */
                fun realTimeDecisionId(): Optional<String> =
                    Optional.ofNullable(realTimeDecisionId.getNullable("real_time_decision_id"))

                /**
                 * If the authorization was attempted using a Digital Wallet Token (such as an Apple
                 * Pay purchase), the identifier of the token that was used.
                 */
                fun digitalWalletTokenId(): Optional<String> =
                    Optional.ofNullable(digitalWalletTokenId.getNullable("digital_wallet_token_id"))

                /**
                 * The merchant identifier (commonly abbreviated as MID) of the merchant the card is
                 * transacting with.
                 */
                @JsonProperty("merchant_acceptor_id")
                @ExcludeMissing
                fun _merchantAcceptorId() = merchantAcceptorId

                /** The merchant descriptor of the merchant the card is transacting with. */
                @JsonProperty("merchant_descriptor")
                @ExcludeMissing
                fun _merchantDescriptor() = merchantDescriptor

                /**
                 * The Merchant Category Code (commonly abbreviated as MCC) of the merchant the card
                 * is transacting with.
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

                /** The payment network used to process this card authorization */
                @JsonProperty("network") @ExcludeMissing fun _network() = network

                /** Fields specific to the `network` */
                @JsonProperty("network_details")
                @ExcludeMissing
                fun _networkDetails() = networkDetails

                /**
                 * The declined amount in the minor unit of the destination account currency. For
                 * dollars, for example, this is cents.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the destination
                 * account currency.
                 */
                @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

                /** Why the transaction was declined. */
                @JsonProperty("reason") @ExcludeMissing fun _reason() = reason

                /** The state the merchant resides in. */
                @JsonProperty("merchant_state") @ExcludeMissing fun _merchantState() = merchantState

                /**
                 * The identifier of the Real-Time Decision sent to approve or decline this
                 * transaction.
                 */
                @JsonProperty("real_time_decision_id")
                @ExcludeMissing
                fun _realTimeDecisionId() = realTimeDecisionId

                /**
                 * If the authorization was attempted using a Digital Wallet Token (such as an Apple
                 * Pay purchase), the identifier of the token that was used.
                 */
                @JsonProperty("digital_wallet_token_id")
                @ExcludeMissing
                fun _digitalWalletTokenId() = digitalWalletTokenId

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate() = apply {
                    if (!validated) {
                        merchantAcceptorId()
                        merchantDescriptor()
                        merchantCategoryCode()
                        merchantCity()
                        merchantCountry()
                        network()
                        networkDetails().validate()
                        amount()
                        currency()
                        reason()
                        merchantState()
                        realTimeDecisionId()
                        digitalWalletTokenId()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is CardDecline &&
                        this.merchantAcceptorId == other.merchantAcceptorId &&
                        this.merchantDescriptor == other.merchantDescriptor &&
                        this.merchantCategoryCode == other.merchantCategoryCode &&
                        this.merchantCity == other.merchantCity &&
                        this.merchantCountry == other.merchantCountry &&
                        this.network == other.network &&
                        this.networkDetails == other.networkDetails &&
                        this.amount == other.amount &&
                        this.currency == other.currency &&
                        this.reason == other.reason &&
                        this.merchantState == other.merchantState &&
                        this.realTimeDecisionId == other.realTimeDecisionId &&
                        this.digitalWalletTokenId == other.digitalWalletTokenId &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                merchantAcceptorId,
                                merchantDescriptor,
                                merchantCategoryCode,
                                merchantCity,
                                merchantCountry,
                                network,
                                networkDetails,
                                amount,
                                currency,
                                reason,
                                merchantState,
                                realTimeDecisionId,
                                digitalWalletTokenId,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "CardDecline{merchantAcceptorId=$merchantAcceptorId, merchantDescriptor=$merchantDescriptor, merchantCategoryCode=$merchantCategoryCode, merchantCity=$merchantCity, merchantCountry=$merchantCountry, network=$network, networkDetails=$networkDetails, amount=$amount, currency=$currency, reason=$reason, merchantState=$merchantState, realTimeDecisionId=$realTimeDecisionId, digitalWalletTokenId=$digitalWalletTokenId, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var merchantAcceptorId: JsonField<String> = JsonMissing.of()
                    private var merchantDescriptor: JsonField<String> = JsonMissing.of()
                    private var merchantCategoryCode: JsonField<String> = JsonMissing.of()
                    private var merchantCity: JsonField<String> = JsonMissing.of()
                    private var merchantCountry: JsonField<String> = JsonMissing.of()
                    private var network: JsonField<Network> = JsonMissing.of()
                    private var networkDetails: JsonField<NetworkDetails> = JsonMissing.of()
                    private var amount: JsonField<Long> = JsonMissing.of()
                    private var currency: JsonField<Currency> = JsonMissing.of()
                    private var reason: JsonField<Reason> = JsonMissing.of()
                    private var merchantState: JsonField<String> = JsonMissing.of()
                    private var realTimeDecisionId: JsonField<String> = JsonMissing.of()
                    private var digitalWalletTokenId: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(cardDecline: CardDecline) = apply {
                        this.merchantAcceptorId = cardDecline.merchantAcceptorId
                        this.merchantDescriptor = cardDecline.merchantDescriptor
                        this.merchantCategoryCode = cardDecline.merchantCategoryCode
                        this.merchantCity = cardDecline.merchantCity
                        this.merchantCountry = cardDecline.merchantCountry
                        this.network = cardDecline.network
                        this.networkDetails = cardDecline.networkDetails
                        this.amount = cardDecline.amount
                        this.currency = cardDecline.currency
                        this.reason = cardDecline.reason
                        this.merchantState = cardDecline.merchantState
                        this.realTimeDecisionId = cardDecline.realTimeDecisionId
                        this.digitalWalletTokenId = cardDecline.digitalWalletTokenId
                        additionalProperties(cardDecline.additionalProperties)
                    }

                    /**
                     * The merchant identifier (commonly abbreviated as MID) of the merchant the
                     * card is transacting with.
                     */
                    fun merchantAcceptorId(merchantAcceptorId: String) =
                        merchantAcceptorId(JsonField.of(merchantAcceptorId))

                    /**
                     * The merchant identifier (commonly abbreviated as MID) of the merchant the
                     * card is transacting with.
                     */
                    @JsonProperty("merchant_acceptor_id")
                    @ExcludeMissing
                    fun merchantAcceptorId(merchantAcceptorId: JsonField<String>) = apply {
                        this.merchantAcceptorId = merchantAcceptorId
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
                     * The Merchant Category Code (commonly abbreviated as MCC) of the merchant the
                     * card is transacting with.
                     */
                    fun merchantCategoryCode(merchantCategoryCode: String) =
                        merchantCategoryCode(JsonField.of(merchantCategoryCode))

                    /**
                     * The Merchant Category Code (commonly abbreviated as MCC) of the merchant the
                     * card is transacting with.
                     */
                    @JsonProperty("merchant_category_code")
                    @ExcludeMissing
                    fun merchantCategoryCode(merchantCategoryCode: JsonField<String>) = apply {
                        this.merchantCategoryCode = merchantCategoryCode
                    }

                    /** The city the merchant resides in. */
                    fun merchantCity(merchantCity: String) =
                        merchantCity(JsonField.of(merchantCity))

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

                    /** The payment network used to process this card authorization */
                    fun network(network: Network) = network(JsonField.of(network))

                    /** The payment network used to process this card authorization */
                    @JsonProperty("network")
                    @ExcludeMissing
                    fun network(network: JsonField<Network>) = apply { this.network = network }

                    /** Fields specific to the `network` */
                    fun networkDetails(networkDetails: NetworkDetails) =
                        networkDetails(JsonField.of(networkDetails))

                    /** Fields specific to the `network` */
                    @JsonProperty("network_details")
                    @ExcludeMissing
                    fun networkDetails(networkDetails: JsonField<NetworkDetails>) = apply {
                        this.networkDetails = networkDetails
                    }

                    /**
                     * The declined amount in the minor unit of the destination account currency.
                     * For dollars, for example, this is cents.
                     */
                    fun amount(amount: Long) = amount(JsonField.of(amount))

                    /**
                     * The declined amount in the minor unit of the destination account currency.
                     * For dollars, for example, this is cents.
                     */
                    @JsonProperty("amount")
                    @ExcludeMissing
                    fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                     * destination account currency.
                     */
                    fun currency(currency: Currency) = currency(JsonField.of(currency))

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                     * destination account currency.
                     */
                    @JsonProperty("currency")
                    @ExcludeMissing
                    fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                    /** Why the transaction was declined. */
                    fun reason(reason: Reason) = reason(JsonField.of(reason))

                    /** Why the transaction was declined. */
                    @JsonProperty("reason")
                    @ExcludeMissing
                    fun reason(reason: JsonField<Reason>) = apply { this.reason = reason }

                    /** The state the merchant resides in. */
                    fun merchantState(merchantState: String) =
                        merchantState(JsonField.of(merchantState))

                    /** The state the merchant resides in. */
                    @JsonProperty("merchant_state")
                    @ExcludeMissing
                    fun merchantState(merchantState: JsonField<String>) = apply {
                        this.merchantState = merchantState
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
                     * If the authorization was attempted using a Digital Wallet Token (such as an
                     * Apple Pay purchase), the identifier of the token that was used.
                     */
                    fun digitalWalletTokenId(digitalWalletTokenId: String) =
                        digitalWalletTokenId(JsonField.of(digitalWalletTokenId))

                    /**
                     * If the authorization was attempted using a Digital Wallet Token (such as an
                     * Apple Pay purchase), the identifier of the token that was used.
                     */
                    @JsonProperty("digital_wallet_token_id")
                    @ExcludeMissing
                    fun digitalWalletTokenId(digitalWalletTokenId: JsonField<String>) = apply {
                        this.digitalWalletTokenId = digitalWalletTokenId
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
                            merchantAcceptorId,
                            merchantDescriptor,
                            merchantCategoryCode,
                            merchantCity,
                            merchantCountry,
                            network,
                            networkDetails,
                            amount,
                            currency,
                            reason,
                            merchantState,
                            realTimeDecisionId,
                            digitalWalletTokenId,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class Network
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Network && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        @JvmField val VISA = Network(JsonField.of("visa"))

                        @JvmStatic fun of(value: String) = Network(JsonField.of(value))
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
                            else -> throw IncreaseInvalidDataException("Unknown Network: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }

                /** Fields specific to the `network` */
                @JsonDeserialize(builder = NetworkDetails.Builder::class)
                @NoAutoDetect
                class NetworkDetails
                private constructor(
                    private val visa: JsonField<Visa>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    /** Fields specific to the `visa` network */
                    fun visa(): Visa = visa.getRequired("visa")

                    /** Fields specific to the `visa` network */
                    @JsonProperty("visa") @ExcludeMissing fun _visa() = visa

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate() = apply {
                        if (!validated) {
                            visa().validate()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is NetworkDetails &&
                            this.visa == other.visa &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode = Objects.hash(visa, additionalProperties)
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "NetworkDetails{visa=$visa, additionalProperties=$additionalProperties}"

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var visa: JsonField<Visa> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(networkDetails: NetworkDetails) = apply {
                            this.visa = networkDetails.visa
                            additionalProperties(networkDetails.additionalProperties)
                        }

                        /** Fields specific to the `visa` network */
                        fun visa(visa: Visa) = visa(JsonField.of(visa))

                        /** Fields specific to the `visa` network */
                        @JsonProperty("visa")
                        @ExcludeMissing
                        fun visa(visa: JsonField<Visa>) = apply { this.visa = visa }

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

                        fun build(): NetworkDetails =
                            NetworkDetails(visa, additionalProperties.toUnmodifiable())
                    }

                    /** Fields specific to the `visa` network */
                    @JsonDeserialize(builder = Visa.Builder::class)
                    @NoAutoDetect
                    class Visa
                    private constructor(
                        private val electronicCommerceIndicator:
                            JsonField<ElectronicCommerceIndicator>,
                        private val pointOfServiceEntryMode: JsonField<PointOfServiceEntryMode>,
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        private var validated: Boolean = false

                        private var hashCode: Int = 0

                        /**
                         * For electronic commerce transactions, this identifies the level of
                         * security used in obtaining the customer's payment credential. For mail or
                         * telephone order transactions, identifies the type of mail or telephone
                         * order.
                         */
                        fun electronicCommerceIndicator(): Optional<ElectronicCommerceIndicator> =
                            Optional.ofNullable(
                                electronicCommerceIndicator.getNullable(
                                    "electronic_commerce_indicator"
                                )
                            )

                        /**
                         * The method used to enter the cardholder's primary account number and card
                         * expiration date
                         */
                        fun pointOfServiceEntryMode(): Optional<PointOfServiceEntryMode> =
                            Optional.ofNullable(
                                pointOfServiceEntryMode.getNullable("point_of_service_entry_mode")
                            )

                        /**
                         * For electronic commerce transactions, this identifies the level of
                         * security used in obtaining the customer's payment credential. For mail or
                         * telephone order transactions, identifies the type of mail or telephone
                         * order.
                         */
                        @JsonProperty("electronic_commerce_indicator")
                        @ExcludeMissing
                        fun _electronicCommerceIndicator() = electronicCommerceIndicator

                        /**
                         * The method used to enter the cardholder's primary account number and card
                         * expiration date
                         */
                        @JsonProperty("point_of_service_entry_mode")
                        @ExcludeMissing
                        fun _pointOfServiceEntryMode() = pointOfServiceEntryMode

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate() = apply {
                            if (!validated) {
                                electronicCommerceIndicator()
                                pointOfServiceEntryMode()
                                validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Visa &&
                                this.electronicCommerceIndicator ==
                                    other.electronicCommerceIndicator &&
                                this.pointOfServiceEntryMode == other.pointOfServiceEntryMode &&
                                this.additionalProperties == other.additionalProperties
                        }

                        override fun hashCode(): Int {
                            if (hashCode == 0) {
                                hashCode =
                                    Objects.hash(
                                        electronicCommerceIndicator,
                                        pointOfServiceEntryMode,
                                        additionalProperties,
                                    )
                            }
                            return hashCode
                        }

                        override fun toString() =
                            "Visa{electronicCommerceIndicator=$electronicCommerceIndicator, pointOfServiceEntryMode=$pointOfServiceEntryMode, additionalProperties=$additionalProperties}"

                        companion object {

                            @JvmStatic fun builder() = Builder()
                        }

                        class Builder {

                            private var electronicCommerceIndicator:
                                JsonField<ElectronicCommerceIndicator> =
                                JsonMissing.of()
                            private var pointOfServiceEntryMode:
                                JsonField<PointOfServiceEntryMode> =
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
                             * security used in obtaining the customer's payment credential. For
                             * mail or telephone order transactions, identifies the type of mail or
                             * telephone order.
                             */
                            fun electronicCommerceIndicator(
                                electronicCommerceIndicator: ElectronicCommerceIndicator
                            ) =
                                electronicCommerceIndicator(
                                    JsonField.of(electronicCommerceIndicator)
                                )

                            /**
                             * For electronic commerce transactions, this identifies the level of
                             * security used in obtaining the customer's payment credential. For
                             * mail or telephone order transactions, identifies the type of mail or
                             * telephone order.
                             */
                            @JsonProperty("electronic_commerce_indicator")
                            @ExcludeMissing
                            fun electronicCommerceIndicator(
                                electronicCommerceIndicator: JsonField<ElectronicCommerceIndicator>
                            ) = apply {
                                this.electronicCommerceIndicator = electronicCommerceIndicator
                            }

                            /**
                             * The method used to enter the cardholder's primary account number and
                             * card expiration date
                             */
                            fun pointOfServiceEntryMode(
                                pointOfServiceEntryMode: PointOfServiceEntryMode
                            ) = pointOfServiceEntryMode(JsonField.of(pointOfServiceEntryMode))

                            /**
                             * The method used to enter the cardholder's primary account number and
                             * card expiration date
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
                        ) {

                            @com.fasterxml.jackson.annotation.JsonValue
                            fun _value(): JsonField<String> = value

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is ElectronicCommerceIndicator &&
                                    this.value == other.value
                            }

                            override fun hashCode() = value.hashCode()

                            override fun toString() = value.toString()

                            companion object {

                                @JvmField
                                val MAIL_PHONE_ORDER =
                                    ElectronicCommerceIndicator(JsonField.of("mail_phone_order"))

                                @JvmField
                                val RECURRING =
                                    ElectronicCommerceIndicator(JsonField.of("recurring"))

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
                                    ElectronicCommerceIndicator(
                                        JsonField.of("non_secure_transaction")
                                    )

                                @JvmStatic
                                fun of(value: String) =
                                    ElectronicCommerceIndicator(JsonField.of(value))
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
                    }
                }

                class Currency
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) {

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

                class Reason
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Reason && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        @JvmField val CARD_NOT_ACTIVE = Reason(JsonField.of("card_not_active"))

                        @JvmField val ENTITY_NOT_ACTIVE = Reason(JsonField.of("entity_not_active"))

                        @JvmField val GROUP_LOCKED = Reason(JsonField.of("group_locked"))

                        @JvmField
                        val INSUFFICIENT_FUNDS = Reason(JsonField.of("insufficient_funds"))

                        @JvmField val CVV2_MISMATCH = Reason(JsonField.of("cvv2_mismatch"))

                        @JvmField
                        val TRANSACTION_NOT_ALLOWED =
                            Reason(JsonField.of("transaction_not_allowed"))

                        @JvmField
                        val BREACHES_INTERNAL_LIMIT =
                            Reason(JsonField.of("breaches_internal_limit"))

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

                        @JvmStatic fun of(value: String) = Reason(JsonField.of(value))
                    }

                    enum class Known {
                        CARD_NOT_ACTIVE,
                        ENTITY_NOT_ACTIVE,
                        GROUP_LOCKED,
                        INSUFFICIENT_FUNDS,
                        CVV2_MISMATCH,
                        TRANSACTION_NOT_ALLOWED,
                        BREACHES_INTERNAL_LIMIT,
                        BREACHES_LIMIT,
                        WEBHOOK_DECLINED,
                        WEBHOOK_TIMED_OUT,
                        DECLINED_BY_STAND_IN_PROCESSING,
                        INVALID_PHYSICAL_CARD,
                        MISSING_ORIGINAL_AUTHORIZATION,
                    }

                    enum class Value {
                        CARD_NOT_ACTIVE,
                        ENTITY_NOT_ACTIVE,
                        GROUP_LOCKED,
                        INSUFFICIENT_FUNDS,
                        CVV2_MISMATCH,
                        TRANSACTION_NOT_ALLOWED,
                        BREACHES_INTERNAL_LIMIT,
                        BREACHES_LIMIT,
                        WEBHOOK_DECLINED,
                        WEBHOOK_TIMED_OUT,
                        DECLINED_BY_STAND_IN_PROCESSING,
                        INVALID_PHYSICAL_CARD,
                        MISSING_ORIGINAL_AUTHORIZATION,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            CARD_NOT_ACTIVE -> Value.CARD_NOT_ACTIVE
                            ENTITY_NOT_ACTIVE -> Value.ENTITY_NOT_ACTIVE
                            GROUP_LOCKED -> Value.GROUP_LOCKED
                            INSUFFICIENT_FUNDS -> Value.INSUFFICIENT_FUNDS
                            CVV2_MISMATCH -> Value.CVV2_MISMATCH
                            TRANSACTION_NOT_ALLOWED -> Value.TRANSACTION_NOT_ALLOWED
                            BREACHES_INTERNAL_LIMIT -> Value.BREACHES_INTERNAL_LIMIT
                            BREACHES_LIMIT -> Value.BREACHES_LIMIT
                            WEBHOOK_DECLINED -> Value.WEBHOOK_DECLINED
                            WEBHOOK_TIMED_OUT -> Value.WEBHOOK_TIMED_OUT
                            DECLINED_BY_STAND_IN_PROCESSING -> Value.DECLINED_BY_STAND_IN_PROCESSING
                            INVALID_PHYSICAL_CARD -> Value.INVALID_PHYSICAL_CARD
                            MISSING_ORIGINAL_AUTHORIZATION -> Value.MISSING_ORIGINAL_AUTHORIZATION
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            CARD_NOT_ACTIVE -> Known.CARD_NOT_ACTIVE
                            ENTITY_NOT_ACTIVE -> Known.ENTITY_NOT_ACTIVE
                            GROUP_LOCKED -> Known.GROUP_LOCKED
                            INSUFFICIENT_FUNDS -> Known.INSUFFICIENT_FUNDS
                            CVV2_MISMATCH -> Known.CVV2_MISMATCH
                            TRANSACTION_NOT_ALLOWED -> Known.TRANSACTION_NOT_ALLOWED
                            BREACHES_INTERNAL_LIMIT -> Known.BREACHES_INTERNAL_LIMIT
                            BREACHES_LIMIT -> Known.BREACHES_LIMIT
                            WEBHOOK_DECLINED -> Known.WEBHOOK_DECLINED
                            WEBHOOK_TIMED_OUT -> Known.WEBHOOK_TIMED_OUT
                            DECLINED_BY_STAND_IN_PROCESSING -> Known.DECLINED_BY_STAND_IN_PROCESSING
                            INVALID_PHYSICAL_CARD -> Known.INVALID_PHYSICAL_CARD
                            MISSING_ORIGINAL_AUTHORIZATION -> Known.MISSING_ORIGINAL_AUTHORIZATION
                            else -> throw IncreaseInvalidDataException("Unknown Reason: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }
            }

            /**
             * A Check Decline object. This field will be present in the JSON response if and only
             * if `category` is equal to `check_decline`.
             */
            @JsonDeserialize(builder = CheckDecline.Builder::class)
            @NoAutoDetect
            class CheckDecline
            private constructor(
                private val amount: JsonField<Long>,
                private val auxiliaryOnUs: JsonField<String>,
                private val reason: JsonField<Reason>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /**
                 * The declined amount in the minor unit of the destination account currency. For
                 * dollars, for example, this is cents.
                 */
                fun amount(): Long = amount.getRequired("amount")

                fun auxiliaryOnUs(): Optional<String> =
                    Optional.ofNullable(auxiliaryOnUs.getNullable("auxiliary_on_us"))

                /** Why the check was declined. */
                fun reason(): Reason = reason.getRequired("reason")

                /**
                 * The declined amount in the minor unit of the destination account currency. For
                 * dollars, for example, this is cents.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

                @JsonProperty("auxiliary_on_us")
                @ExcludeMissing
                fun _auxiliaryOnUs() = auxiliaryOnUs

                /** Why the check was declined. */
                @JsonProperty("reason") @ExcludeMissing fun _reason() = reason

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate() = apply {
                    if (!validated) {
                        amount()
                        auxiliaryOnUs()
                        reason()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is CheckDecline &&
                        this.amount == other.amount &&
                        this.auxiliaryOnUs == other.auxiliaryOnUs &&
                        this.reason == other.reason &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                amount,
                                auxiliaryOnUs,
                                reason,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "CheckDecline{amount=$amount, auxiliaryOnUs=$auxiliaryOnUs, reason=$reason, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var amount: JsonField<Long> = JsonMissing.of()
                    private var auxiliaryOnUs: JsonField<String> = JsonMissing.of()
                    private var reason: JsonField<Reason> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(checkDecline: CheckDecline) = apply {
                        this.amount = checkDecline.amount
                        this.auxiliaryOnUs = checkDecline.auxiliaryOnUs
                        this.reason = checkDecline.reason
                        additionalProperties(checkDecline.additionalProperties)
                    }

                    /**
                     * The declined amount in the minor unit of the destination account currency.
                     * For dollars, for example, this is cents.
                     */
                    fun amount(amount: Long) = amount(JsonField.of(amount))

                    /**
                     * The declined amount in the minor unit of the destination account currency.
                     * For dollars, for example, this is cents.
                     */
                    @JsonProperty("amount")
                    @ExcludeMissing
                    fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                    fun auxiliaryOnUs(auxiliaryOnUs: String) =
                        auxiliaryOnUs(JsonField.of(auxiliaryOnUs))

                    @JsonProperty("auxiliary_on_us")
                    @ExcludeMissing
                    fun auxiliaryOnUs(auxiliaryOnUs: JsonField<String>) = apply {
                        this.auxiliaryOnUs = auxiliaryOnUs
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
                            reason,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class Reason
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

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
                        val ACH_ROUTE_CANCELED = Reason(JsonField.of("ach_route_canceled"))

                        @JvmField
                        val ACH_ROUTE_DISABLED = Reason(JsonField.of("ach_route_disabled"))

                        @JvmField val BREACHES_LIMIT = Reason(JsonField.of("breaches_limit"))

                        @JvmField val ENTITY_NOT_ACTIVE = Reason(JsonField.of("entity_not_active"))

                        @JvmField val GROUP_LOCKED = Reason(JsonField.of("group_locked"))

                        @JvmField
                        val INSUFFICIENT_FUNDS = Reason(JsonField.of("insufficient_funds"))

                        @JvmField
                        val UNABLE_TO_LOCATE_ACCOUNT =
                            Reason(JsonField.of("unable_to_locate_account"))

                        @JvmField val UNABLE_TO_PROCESS = Reason(JsonField.of("unable_to_process"))

                        @JvmField val REFER_TO_IMAGE = Reason(JsonField.of("refer_to_image"))

                        @JvmField
                        val STOP_PAYMENT_REQUESTED = Reason(JsonField.of("stop_payment_requested"))

                        @JvmField val RETURNED = Reason(JsonField.of("returned"))

                        @JvmField
                        val DUPLICATE_PRESENTMENT = Reason(JsonField.of("duplicate_presentment"))

                        @JvmField val NOT_AUTHORIZED = Reason(JsonField.of("not_authorized"))

                        @JvmField
                        val ALTERED_OR_FICTITIOUS = Reason(JsonField.of("altered_or_fictitious"))

                        @JvmStatic fun of(value: String) = Reason(JsonField.of(value))
                    }

                    enum class Known {
                        ACH_ROUTE_CANCELED,
                        ACH_ROUTE_DISABLED,
                        BREACHES_LIMIT,
                        ENTITY_NOT_ACTIVE,
                        GROUP_LOCKED,
                        INSUFFICIENT_FUNDS,
                        UNABLE_TO_LOCATE_ACCOUNT,
                        UNABLE_TO_PROCESS,
                        REFER_TO_IMAGE,
                        STOP_PAYMENT_REQUESTED,
                        RETURNED,
                        DUPLICATE_PRESENTMENT,
                        NOT_AUTHORIZED,
                        ALTERED_OR_FICTITIOUS,
                    }

                    enum class Value {
                        ACH_ROUTE_CANCELED,
                        ACH_ROUTE_DISABLED,
                        BREACHES_LIMIT,
                        ENTITY_NOT_ACTIVE,
                        GROUP_LOCKED,
                        INSUFFICIENT_FUNDS,
                        UNABLE_TO_LOCATE_ACCOUNT,
                        UNABLE_TO_PROCESS,
                        REFER_TO_IMAGE,
                        STOP_PAYMENT_REQUESTED,
                        RETURNED,
                        DUPLICATE_PRESENTMENT,
                        NOT_AUTHORIZED,
                        ALTERED_OR_FICTITIOUS,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            ACH_ROUTE_CANCELED -> Value.ACH_ROUTE_CANCELED
                            ACH_ROUTE_DISABLED -> Value.ACH_ROUTE_DISABLED
                            BREACHES_LIMIT -> Value.BREACHES_LIMIT
                            ENTITY_NOT_ACTIVE -> Value.ENTITY_NOT_ACTIVE
                            GROUP_LOCKED -> Value.GROUP_LOCKED
                            INSUFFICIENT_FUNDS -> Value.INSUFFICIENT_FUNDS
                            UNABLE_TO_LOCATE_ACCOUNT -> Value.UNABLE_TO_LOCATE_ACCOUNT
                            UNABLE_TO_PROCESS -> Value.UNABLE_TO_PROCESS
                            REFER_TO_IMAGE -> Value.REFER_TO_IMAGE
                            STOP_PAYMENT_REQUESTED -> Value.STOP_PAYMENT_REQUESTED
                            RETURNED -> Value.RETURNED
                            DUPLICATE_PRESENTMENT -> Value.DUPLICATE_PRESENTMENT
                            NOT_AUTHORIZED -> Value.NOT_AUTHORIZED
                            ALTERED_OR_FICTITIOUS -> Value.ALTERED_OR_FICTITIOUS
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            ACH_ROUTE_CANCELED -> Known.ACH_ROUTE_CANCELED
                            ACH_ROUTE_DISABLED -> Known.ACH_ROUTE_DISABLED
                            BREACHES_LIMIT -> Known.BREACHES_LIMIT
                            ENTITY_NOT_ACTIVE -> Known.ENTITY_NOT_ACTIVE
                            GROUP_LOCKED -> Known.GROUP_LOCKED
                            INSUFFICIENT_FUNDS -> Known.INSUFFICIENT_FUNDS
                            UNABLE_TO_LOCATE_ACCOUNT -> Known.UNABLE_TO_LOCATE_ACCOUNT
                            UNABLE_TO_PROCESS -> Known.UNABLE_TO_PROCESS
                            REFER_TO_IMAGE -> Known.REFER_TO_IMAGE
                            STOP_PAYMENT_REQUESTED -> Known.STOP_PAYMENT_REQUESTED
                            RETURNED -> Known.RETURNED
                            DUPLICATE_PRESENTMENT -> Known.DUPLICATE_PRESENTMENT
                            NOT_AUTHORIZED -> Known.NOT_AUTHORIZED
                            ALTERED_OR_FICTITIOUS -> Known.ALTERED_OR_FICTITIOUS
                            else -> throw IncreaseInvalidDataException("Unknown Reason: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }
            }

            /**
             * A Inbound Real Time Payments Transfer Decline object. This field will be present in
             * the JSON response if and only if `category` is equal to
             * `inbound_real_time_payments_transfer_decline`.
             */
            @JsonDeserialize(builder = InboundRealTimePaymentsTransferDecline.Builder::class)
            @NoAutoDetect
            class InboundRealTimePaymentsTransferDecline
            private constructor(
                private val amount: JsonField<Long>,
                private val currency: JsonField<Currency>,
                private val reason: JsonField<Reason>,
                private val creditorName: JsonField<String>,
                private val debtorName: JsonField<String>,
                private val debtorAccountNumber: JsonField<String>,
                private val debtorRoutingNumber: JsonField<String>,
                private val transactionIdentification: JsonField<String>,
                private val remittanceInformation: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /**
                 * The declined amount in the minor unit of the destination account currency. For
                 * dollars, for example, this is cents.
                 */
                fun amount(): Long = amount.getRequired("amount")

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code of the declined
                 * transfer's currency. This will always be "USD" for a Real Time Payments transfer.
                 */
                fun currency(): Currency = currency.getRequired("currency")

                /** Why the transfer was declined. */
                fun reason(): Reason = reason.getRequired("reason")

                /**
                 * The name the sender of the transfer specified as the recipient of the transfer.
                 */
                fun creditorName(): String = creditorName.getRequired("creditor_name")

                /** The name provided by the sender of the transfer. */
                fun debtorName(): String = debtorName.getRequired("debtor_name")

                /** The account number of the account that sent the transfer. */
                fun debtorAccountNumber(): String =
                    debtorAccountNumber.getRequired("debtor_account_number")

                /** The routing number of the account that sent the transfer. */
                fun debtorRoutingNumber(): String =
                    debtorRoutingNumber.getRequired("debtor_routing_number")

                /** The Real Time Payments network identification of the declined transfer. */
                fun transactionIdentification(): String =
                    transactionIdentification.getRequired("transaction_identification")

                /** Additional information included with the transfer. */
                fun remittanceInformation(): Optional<String> =
                    Optional.ofNullable(remittanceInformation.getNullable("remittance_information"))

                /**
                 * The declined amount in the minor unit of the destination account currency. For
                 * dollars, for example, this is cents.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code of the declined
                 * transfer's currency. This will always be "USD" for a Real Time Payments transfer.
                 */
                @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

                /** Why the transfer was declined. */
                @JsonProperty("reason") @ExcludeMissing fun _reason() = reason

                /**
                 * The name the sender of the transfer specified as the recipient of the transfer.
                 */
                @JsonProperty("creditor_name") @ExcludeMissing fun _creditorName() = creditorName

                /** The name provided by the sender of the transfer. */
                @JsonProperty("debtor_name") @ExcludeMissing fun _debtorName() = debtorName

                /** The account number of the account that sent the transfer. */
                @JsonProperty("debtor_account_number")
                @ExcludeMissing
                fun _debtorAccountNumber() = debtorAccountNumber

                /** The routing number of the account that sent the transfer. */
                @JsonProperty("debtor_routing_number")
                @ExcludeMissing
                fun _debtorRoutingNumber() = debtorRoutingNumber

                /** The Real Time Payments network identification of the declined transfer. */
                @JsonProperty("transaction_identification")
                @ExcludeMissing
                fun _transactionIdentification() = transactionIdentification

                /** Additional information included with the transfer. */
                @JsonProperty("remittance_information")
                @ExcludeMissing
                fun _remittanceInformation() = remittanceInformation

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate() = apply {
                    if (!validated) {
                        amount()
                        currency()
                        reason()
                        creditorName()
                        debtorName()
                        debtorAccountNumber()
                        debtorRoutingNumber()
                        transactionIdentification()
                        remittanceInformation()
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
                        this.currency == other.currency &&
                        this.reason == other.reason &&
                        this.creditorName == other.creditorName &&
                        this.debtorName == other.debtorName &&
                        this.debtorAccountNumber == other.debtorAccountNumber &&
                        this.debtorRoutingNumber == other.debtorRoutingNumber &&
                        this.transactionIdentification == other.transactionIdentification &&
                        this.remittanceInformation == other.remittanceInformation &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                amount,
                                currency,
                                reason,
                                creditorName,
                                debtorName,
                                debtorAccountNumber,
                                debtorRoutingNumber,
                                transactionIdentification,
                                remittanceInformation,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "InboundRealTimePaymentsTransferDecline{amount=$amount, currency=$currency, reason=$reason, creditorName=$creditorName, debtorName=$debtorName, debtorAccountNumber=$debtorAccountNumber, debtorRoutingNumber=$debtorRoutingNumber, transactionIdentification=$transactionIdentification, remittanceInformation=$remittanceInformation, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var amount: JsonField<Long> = JsonMissing.of()
                    private var currency: JsonField<Currency> = JsonMissing.of()
                    private var reason: JsonField<Reason> = JsonMissing.of()
                    private var creditorName: JsonField<String> = JsonMissing.of()
                    private var debtorName: JsonField<String> = JsonMissing.of()
                    private var debtorAccountNumber: JsonField<String> = JsonMissing.of()
                    private var debtorRoutingNumber: JsonField<String> = JsonMissing.of()
                    private var transactionIdentification: JsonField<String> = JsonMissing.of()
                    private var remittanceInformation: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(
                        inboundRealTimePaymentsTransferDecline:
                            InboundRealTimePaymentsTransferDecline
                    ) = apply {
                        this.amount = inboundRealTimePaymentsTransferDecline.amount
                        this.currency = inboundRealTimePaymentsTransferDecline.currency
                        this.reason = inboundRealTimePaymentsTransferDecline.reason
                        this.creditorName = inboundRealTimePaymentsTransferDecline.creditorName
                        this.debtorName = inboundRealTimePaymentsTransferDecline.debtorName
                        this.debtorAccountNumber =
                            inboundRealTimePaymentsTransferDecline.debtorAccountNumber
                        this.debtorRoutingNumber =
                            inboundRealTimePaymentsTransferDecline.debtorRoutingNumber
                        this.transactionIdentification =
                            inboundRealTimePaymentsTransferDecline.transactionIdentification
                        this.remittanceInformation =
                            inboundRealTimePaymentsTransferDecline.remittanceInformation
                        additionalProperties(
                            inboundRealTimePaymentsTransferDecline.additionalProperties
                        )
                    }

                    /**
                     * The declined amount in the minor unit of the destination account currency.
                     * For dollars, for example, this is cents.
                     */
                    fun amount(amount: Long) = amount(JsonField.of(amount))

                    /**
                     * The declined amount in the minor unit of the destination account currency.
                     * For dollars, for example, this is cents.
                     */
                    @JsonProperty("amount")
                    @ExcludeMissing
                    fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code of the declined
                     * transfer's currency. This will always be "USD" for a Real Time Payments
                     * transfer.
                     */
                    fun currency(currency: Currency) = currency(JsonField.of(currency))

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code of the declined
                     * transfer's currency. This will always be "USD" for a Real Time Payments
                     * transfer.
                     */
                    @JsonProperty("currency")
                    @ExcludeMissing
                    fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                    /** Why the transfer was declined. */
                    fun reason(reason: Reason) = reason(JsonField.of(reason))

                    /** Why the transfer was declined. */
                    @JsonProperty("reason")
                    @ExcludeMissing
                    fun reason(reason: JsonField<Reason>) = apply { this.reason = reason }

                    /**
                     * The name the sender of the transfer specified as the recipient of the
                     * transfer.
                     */
                    fun creditorName(creditorName: String) =
                        creditorName(JsonField.of(creditorName))

                    /**
                     * The name the sender of the transfer specified as the recipient of the
                     * transfer.
                     */
                    @JsonProperty("creditor_name")
                    @ExcludeMissing
                    fun creditorName(creditorName: JsonField<String>) = apply {
                        this.creditorName = creditorName
                    }

                    /** The name provided by the sender of the transfer. */
                    fun debtorName(debtorName: String) = debtorName(JsonField.of(debtorName))

                    /** The name provided by the sender of the transfer. */
                    @JsonProperty("debtor_name")
                    @ExcludeMissing
                    fun debtorName(debtorName: JsonField<String>) = apply {
                        this.debtorName = debtorName
                    }

                    /** The account number of the account that sent the transfer. */
                    fun debtorAccountNumber(debtorAccountNumber: String) =
                        debtorAccountNumber(JsonField.of(debtorAccountNumber))

                    /** The account number of the account that sent the transfer. */
                    @JsonProperty("debtor_account_number")
                    @ExcludeMissing
                    fun debtorAccountNumber(debtorAccountNumber: JsonField<String>) = apply {
                        this.debtorAccountNumber = debtorAccountNumber
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

                    /** The Real Time Payments network identification of the declined transfer. */
                    fun transactionIdentification(transactionIdentification: String) =
                        transactionIdentification(JsonField.of(transactionIdentification))

                    /** The Real Time Payments network identification of the declined transfer. */
                    @JsonProperty("transaction_identification")
                    @ExcludeMissing
                    fun transactionIdentification(transactionIdentification: JsonField<String>) =
                        apply {
                            this.transactionIdentification = transactionIdentification
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
                            currency,
                            reason,
                            creditorName,
                            debtorName,
                            debtorAccountNumber,
                            debtorRoutingNumber,
                            transactionIdentification,
                            remittanceInformation,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class Currency
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) {

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

                class Reason
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

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
                        val ACCOUNT_NUMBER_CANCELED =
                            Reason(JsonField.of("account_number_canceled"))

                        @JvmField
                        val ACCOUNT_NUMBER_DISABLED =
                            Reason(JsonField.of("account_number_disabled"))

                        @JvmField
                        val ACCOUNT_RESTRICTED = Reason(JsonField.of("account_restricted"))

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
             * A International ACH Decline object. This field will be present in the JSON response
             * if and only if `category` is equal to `international_ach_decline`.
             */
            @JsonDeserialize(builder = InternationalAchDecline.Builder::class)
            @NoAutoDetect
            class InternationalAchDecline
            private constructor(
                private val amount: JsonField<Long>,
                private val foreignExchangeIndicator: JsonField<String>,
                private val foreignExchangeReferenceIndicator: JsonField<String>,
                private val foreignExchangeReference: JsonField<String>,
                private val destinationCountryCode: JsonField<String>,
                private val destinationCurrencyCode: JsonField<String>,
                private val foreignPaymentAmount: JsonField<Long>,
                private val foreignTraceNumber: JsonField<String>,
                private val internationalTransactionTypeCode: JsonField<String>,
                private val originatingCurrencyCode: JsonField<String>,
                private val originatingDepositoryFinancialInstitutionName: JsonField<String>,
                private val originatingDepositoryFinancialInstitutionIdQualifier: JsonField<String>,
                private val originatingDepositoryFinancialInstitutionId: JsonField<String>,
                private val originatingDepositoryFinancialInstitutionBranchCountry:
                    JsonField<String>,
                private val originatorCity: JsonField<String>,
                private val originatorCompanyEntryDescription: JsonField<String>,
                private val originatorCountry: JsonField<String>,
                private val originatorIdentification: JsonField<String>,
                private val originatorName: JsonField<String>,
                private val originatorPostalCode: JsonField<String>,
                private val originatorStreetAddress: JsonField<String>,
                private val originatorStateOrProvince: JsonField<String>,
                private val paymentRelatedInformation: JsonField<String>,
                private val paymentRelatedInformation2: JsonField<String>,
                private val receiverIdentificationNumber: JsonField<String>,
                private val receiverStreetAddress: JsonField<String>,
                private val receiverCity: JsonField<String>,
                private val receiverStateOrProvince: JsonField<String>,
                private val receiverCountry: JsonField<String>,
                private val receiverPostalCode: JsonField<String>,
                private val receivingCompanyOrIndividualName: JsonField<String>,
                private val receivingDepositoryFinancialInstitutionName: JsonField<String>,
                private val receivingDepositoryFinancialInstitutionIdQualifier: JsonField<String>,
                private val receivingDepositoryFinancialInstitutionId: JsonField<String>,
                private val receivingDepositoryFinancialInstitutionCountry: JsonField<String>,
                private val traceNumber: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /**
                 * The declined amount in the minor unit of the destination account currency. For
                 * dollars, for example, this is cents.
                 */
                fun amount(): Long = amount.getRequired("amount")

                fun foreignExchangeIndicator(): String =
                    foreignExchangeIndicator.getRequired("foreign_exchange_indicator")

                fun foreignExchangeReferenceIndicator(): String =
                    foreignExchangeReferenceIndicator.getRequired(
                        "foreign_exchange_reference_indicator"
                    )

                fun foreignExchangeReference(): Optional<String> =
                    Optional.ofNullable(
                        foreignExchangeReference.getNullable("foreign_exchange_reference")
                    )

                fun destinationCountryCode(): String =
                    destinationCountryCode.getRequired("destination_country_code")

                fun destinationCurrencyCode(): String =
                    destinationCurrencyCode.getRequired("destination_currency_code")

                fun foreignPaymentAmount(): Long =
                    foreignPaymentAmount.getRequired("foreign_payment_amount")

                fun foreignTraceNumber(): Optional<String> =
                    Optional.ofNullable(foreignTraceNumber.getNullable("foreign_trace_number"))

                fun internationalTransactionTypeCode(): String =
                    internationalTransactionTypeCode.getRequired(
                        "international_transaction_type_code"
                    )

                fun originatingCurrencyCode(): String =
                    originatingCurrencyCode.getRequired("originating_currency_code")

                fun originatingDepositoryFinancialInstitutionName(): String =
                    originatingDepositoryFinancialInstitutionName.getRequired(
                        "originating_depository_financial_institution_name"
                    )

                fun originatingDepositoryFinancialInstitutionIdQualifier(): String =
                    originatingDepositoryFinancialInstitutionIdQualifier.getRequired(
                        "originating_depository_financial_institution_id_qualifier"
                    )

                fun originatingDepositoryFinancialInstitutionId(): String =
                    originatingDepositoryFinancialInstitutionId.getRequired(
                        "originating_depository_financial_institution_id"
                    )

                fun originatingDepositoryFinancialInstitutionBranchCountry(): String =
                    originatingDepositoryFinancialInstitutionBranchCountry.getRequired(
                        "originating_depository_financial_institution_branch_country"
                    )

                fun originatorCity(): String = originatorCity.getRequired("originator_city")

                fun originatorCompanyEntryDescription(): String =
                    originatorCompanyEntryDescription.getRequired(
                        "originator_company_entry_description"
                    )

                fun originatorCountry(): String =
                    originatorCountry.getRequired("originator_country")

                fun originatorIdentification(): String =
                    originatorIdentification.getRequired("originator_identification")

                fun originatorName(): String = originatorName.getRequired("originator_name")

                fun originatorPostalCode(): Optional<String> =
                    Optional.ofNullable(originatorPostalCode.getNullable("originator_postal_code"))

                fun originatorStreetAddress(): String =
                    originatorStreetAddress.getRequired("originator_street_address")

                fun originatorStateOrProvince(): Optional<String> =
                    Optional.ofNullable(
                        originatorStateOrProvince.getNullable("originator_state_or_province")
                    )

                fun paymentRelatedInformation(): Optional<String> =
                    Optional.ofNullable(
                        paymentRelatedInformation.getNullable("payment_related_information")
                    )

                fun paymentRelatedInformation2(): Optional<String> =
                    Optional.ofNullable(
                        paymentRelatedInformation2.getNullable("payment_related_information2")
                    )

                fun receiverIdentificationNumber(): Optional<String> =
                    Optional.ofNullable(
                        receiverIdentificationNumber.getNullable("receiver_identification_number")
                    )

                fun receiverStreetAddress(): String =
                    receiverStreetAddress.getRequired("receiver_street_address")

                fun receiverCity(): String = receiverCity.getRequired("receiver_city")

                fun receiverStateOrProvince(): Optional<String> =
                    Optional.ofNullable(
                        receiverStateOrProvince.getNullable("receiver_state_or_province")
                    )

                fun receiverCountry(): String = receiverCountry.getRequired("receiver_country")

                fun receiverPostalCode(): Optional<String> =
                    Optional.ofNullable(receiverPostalCode.getNullable("receiver_postal_code"))

                fun receivingCompanyOrIndividualName(): String =
                    receivingCompanyOrIndividualName.getRequired(
                        "receiving_company_or_individual_name"
                    )

                fun receivingDepositoryFinancialInstitutionName(): String =
                    receivingDepositoryFinancialInstitutionName.getRequired(
                        "receiving_depository_financial_institution_name"
                    )

                fun receivingDepositoryFinancialInstitutionIdQualifier(): String =
                    receivingDepositoryFinancialInstitutionIdQualifier.getRequired(
                        "receiving_depository_financial_institution_id_qualifier"
                    )

                fun receivingDepositoryFinancialInstitutionId(): String =
                    receivingDepositoryFinancialInstitutionId.getRequired(
                        "receiving_depository_financial_institution_id"
                    )

                fun receivingDepositoryFinancialInstitutionCountry(): String =
                    receivingDepositoryFinancialInstitutionCountry.getRequired(
                        "receiving_depository_financial_institution_country"
                    )

                fun traceNumber(): String = traceNumber.getRequired("trace_number")

                /**
                 * The declined amount in the minor unit of the destination account currency. For
                 * dollars, for example, this is cents.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

                @JsonProperty("foreign_exchange_indicator")
                @ExcludeMissing
                fun _foreignExchangeIndicator() = foreignExchangeIndicator

                @JsonProperty("foreign_exchange_reference_indicator")
                @ExcludeMissing
                fun _foreignExchangeReferenceIndicator() = foreignExchangeReferenceIndicator

                @JsonProperty("foreign_exchange_reference")
                @ExcludeMissing
                fun _foreignExchangeReference() = foreignExchangeReference

                @JsonProperty("destination_country_code")
                @ExcludeMissing
                fun _destinationCountryCode() = destinationCountryCode

                @JsonProperty("destination_currency_code")
                @ExcludeMissing
                fun _destinationCurrencyCode() = destinationCurrencyCode

                @JsonProperty("foreign_payment_amount")
                @ExcludeMissing
                fun _foreignPaymentAmount() = foreignPaymentAmount

                @JsonProperty("foreign_trace_number")
                @ExcludeMissing
                fun _foreignTraceNumber() = foreignTraceNumber

                @JsonProperty("international_transaction_type_code")
                @ExcludeMissing
                fun _internationalTransactionTypeCode() = internationalTransactionTypeCode

                @JsonProperty("originating_currency_code")
                @ExcludeMissing
                fun _originatingCurrencyCode() = originatingCurrencyCode

                @JsonProperty("originating_depository_financial_institution_name")
                @ExcludeMissing
                fun _originatingDepositoryFinancialInstitutionName() =
                    originatingDepositoryFinancialInstitutionName

                @JsonProperty("originating_depository_financial_institution_id_qualifier")
                @ExcludeMissing
                fun _originatingDepositoryFinancialInstitutionIdQualifier() =
                    originatingDepositoryFinancialInstitutionIdQualifier

                @JsonProperty("originating_depository_financial_institution_id")
                @ExcludeMissing
                fun _originatingDepositoryFinancialInstitutionId() =
                    originatingDepositoryFinancialInstitutionId

                @JsonProperty("originating_depository_financial_institution_branch_country")
                @ExcludeMissing
                fun _originatingDepositoryFinancialInstitutionBranchCountry() =
                    originatingDepositoryFinancialInstitutionBranchCountry

                @JsonProperty("originator_city")
                @ExcludeMissing
                fun _originatorCity() = originatorCity

                @JsonProperty("originator_company_entry_description")
                @ExcludeMissing
                fun _originatorCompanyEntryDescription() = originatorCompanyEntryDescription

                @JsonProperty("originator_country")
                @ExcludeMissing
                fun _originatorCountry() = originatorCountry

                @JsonProperty("originator_identification")
                @ExcludeMissing
                fun _originatorIdentification() = originatorIdentification

                @JsonProperty("originator_name")
                @ExcludeMissing
                fun _originatorName() = originatorName

                @JsonProperty("originator_postal_code")
                @ExcludeMissing
                fun _originatorPostalCode() = originatorPostalCode

                @JsonProperty("originator_street_address")
                @ExcludeMissing
                fun _originatorStreetAddress() = originatorStreetAddress

                @JsonProperty("originator_state_or_province")
                @ExcludeMissing
                fun _originatorStateOrProvince() = originatorStateOrProvince

                @JsonProperty("payment_related_information")
                @ExcludeMissing
                fun _paymentRelatedInformation() = paymentRelatedInformation

                @JsonProperty("payment_related_information2")
                @ExcludeMissing
                fun _paymentRelatedInformation2() = paymentRelatedInformation2

                @JsonProperty("receiver_identification_number")
                @ExcludeMissing
                fun _receiverIdentificationNumber() = receiverIdentificationNumber

                @JsonProperty("receiver_street_address")
                @ExcludeMissing
                fun _receiverStreetAddress() = receiverStreetAddress

                @JsonProperty("receiver_city") @ExcludeMissing fun _receiverCity() = receiverCity

                @JsonProperty("receiver_state_or_province")
                @ExcludeMissing
                fun _receiverStateOrProvince() = receiverStateOrProvince

                @JsonProperty("receiver_country")
                @ExcludeMissing
                fun _receiverCountry() = receiverCountry

                @JsonProperty("receiver_postal_code")
                @ExcludeMissing
                fun _receiverPostalCode() = receiverPostalCode

                @JsonProperty("receiving_company_or_individual_name")
                @ExcludeMissing
                fun _receivingCompanyOrIndividualName() = receivingCompanyOrIndividualName

                @JsonProperty("receiving_depository_financial_institution_name")
                @ExcludeMissing
                fun _receivingDepositoryFinancialInstitutionName() =
                    receivingDepositoryFinancialInstitutionName

                @JsonProperty("receiving_depository_financial_institution_id_qualifier")
                @ExcludeMissing
                fun _receivingDepositoryFinancialInstitutionIdQualifier() =
                    receivingDepositoryFinancialInstitutionIdQualifier

                @JsonProperty("receiving_depository_financial_institution_id")
                @ExcludeMissing
                fun _receivingDepositoryFinancialInstitutionId() =
                    receivingDepositoryFinancialInstitutionId

                @JsonProperty("receiving_depository_financial_institution_country")
                @ExcludeMissing
                fun _receivingDepositoryFinancialInstitutionCountry() =
                    receivingDepositoryFinancialInstitutionCountry

                @JsonProperty("trace_number") @ExcludeMissing fun _traceNumber() = traceNumber

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate() = apply {
                    if (!validated) {
                        amount()
                        foreignExchangeIndicator()
                        foreignExchangeReferenceIndicator()
                        foreignExchangeReference()
                        destinationCountryCode()
                        destinationCurrencyCode()
                        foreignPaymentAmount()
                        foreignTraceNumber()
                        internationalTransactionTypeCode()
                        originatingCurrencyCode()
                        originatingDepositoryFinancialInstitutionName()
                        originatingDepositoryFinancialInstitutionIdQualifier()
                        originatingDepositoryFinancialInstitutionId()
                        originatingDepositoryFinancialInstitutionBranchCountry()
                        originatorCity()
                        originatorCompanyEntryDescription()
                        originatorCountry()
                        originatorIdentification()
                        originatorName()
                        originatorPostalCode()
                        originatorStreetAddress()
                        originatorStateOrProvince()
                        paymentRelatedInformation()
                        paymentRelatedInformation2()
                        receiverIdentificationNumber()
                        receiverStreetAddress()
                        receiverCity()
                        receiverStateOrProvince()
                        receiverCountry()
                        receiverPostalCode()
                        receivingCompanyOrIndividualName()
                        receivingDepositoryFinancialInstitutionName()
                        receivingDepositoryFinancialInstitutionIdQualifier()
                        receivingDepositoryFinancialInstitutionId()
                        receivingDepositoryFinancialInstitutionCountry()
                        traceNumber()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is InternationalAchDecline &&
                        this.amount == other.amount &&
                        this.foreignExchangeIndicator == other.foreignExchangeIndicator &&
                        this.foreignExchangeReferenceIndicator ==
                            other.foreignExchangeReferenceIndicator &&
                        this.foreignExchangeReference == other.foreignExchangeReference &&
                        this.destinationCountryCode == other.destinationCountryCode &&
                        this.destinationCurrencyCode == other.destinationCurrencyCode &&
                        this.foreignPaymentAmount == other.foreignPaymentAmount &&
                        this.foreignTraceNumber == other.foreignTraceNumber &&
                        this.internationalTransactionTypeCode ==
                            other.internationalTransactionTypeCode &&
                        this.originatingCurrencyCode == other.originatingCurrencyCode &&
                        this.originatingDepositoryFinancialInstitutionName ==
                            other.originatingDepositoryFinancialInstitutionName &&
                        this.originatingDepositoryFinancialInstitutionIdQualifier ==
                            other.originatingDepositoryFinancialInstitutionIdQualifier &&
                        this.originatingDepositoryFinancialInstitutionId ==
                            other.originatingDepositoryFinancialInstitutionId &&
                        this.originatingDepositoryFinancialInstitutionBranchCountry ==
                            other.originatingDepositoryFinancialInstitutionBranchCountry &&
                        this.originatorCity == other.originatorCity &&
                        this.originatorCompanyEntryDescription ==
                            other.originatorCompanyEntryDescription &&
                        this.originatorCountry == other.originatorCountry &&
                        this.originatorIdentification == other.originatorIdentification &&
                        this.originatorName == other.originatorName &&
                        this.originatorPostalCode == other.originatorPostalCode &&
                        this.originatorStreetAddress == other.originatorStreetAddress &&
                        this.originatorStateOrProvince == other.originatorStateOrProvince &&
                        this.paymentRelatedInformation == other.paymentRelatedInformation &&
                        this.paymentRelatedInformation2 == other.paymentRelatedInformation2 &&
                        this.receiverIdentificationNumber == other.receiverIdentificationNumber &&
                        this.receiverStreetAddress == other.receiverStreetAddress &&
                        this.receiverCity == other.receiverCity &&
                        this.receiverStateOrProvince == other.receiverStateOrProvince &&
                        this.receiverCountry == other.receiverCountry &&
                        this.receiverPostalCode == other.receiverPostalCode &&
                        this.receivingCompanyOrIndividualName ==
                            other.receivingCompanyOrIndividualName &&
                        this.receivingDepositoryFinancialInstitutionName ==
                            other.receivingDepositoryFinancialInstitutionName &&
                        this.receivingDepositoryFinancialInstitutionIdQualifier ==
                            other.receivingDepositoryFinancialInstitutionIdQualifier &&
                        this.receivingDepositoryFinancialInstitutionId ==
                            other.receivingDepositoryFinancialInstitutionId &&
                        this.receivingDepositoryFinancialInstitutionCountry ==
                            other.receivingDepositoryFinancialInstitutionCountry &&
                        this.traceNumber == other.traceNumber &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                amount,
                                foreignExchangeIndicator,
                                foreignExchangeReferenceIndicator,
                                foreignExchangeReference,
                                destinationCountryCode,
                                destinationCurrencyCode,
                                foreignPaymentAmount,
                                foreignTraceNumber,
                                internationalTransactionTypeCode,
                                originatingCurrencyCode,
                                originatingDepositoryFinancialInstitutionName,
                                originatingDepositoryFinancialInstitutionIdQualifier,
                                originatingDepositoryFinancialInstitutionId,
                                originatingDepositoryFinancialInstitutionBranchCountry,
                                originatorCity,
                                originatorCompanyEntryDescription,
                                originatorCountry,
                                originatorIdentification,
                                originatorName,
                                originatorPostalCode,
                                originatorStreetAddress,
                                originatorStateOrProvince,
                                paymentRelatedInformation,
                                paymentRelatedInformation2,
                                receiverIdentificationNumber,
                                receiverStreetAddress,
                                receiverCity,
                                receiverStateOrProvince,
                                receiverCountry,
                                receiverPostalCode,
                                receivingCompanyOrIndividualName,
                                receivingDepositoryFinancialInstitutionName,
                                receivingDepositoryFinancialInstitutionIdQualifier,
                                receivingDepositoryFinancialInstitutionId,
                                receivingDepositoryFinancialInstitutionCountry,
                                traceNumber,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "InternationalAchDecline{amount=$amount, foreignExchangeIndicator=$foreignExchangeIndicator, foreignExchangeReferenceIndicator=$foreignExchangeReferenceIndicator, foreignExchangeReference=$foreignExchangeReference, destinationCountryCode=$destinationCountryCode, destinationCurrencyCode=$destinationCurrencyCode, foreignPaymentAmount=$foreignPaymentAmount, foreignTraceNumber=$foreignTraceNumber, internationalTransactionTypeCode=$internationalTransactionTypeCode, originatingCurrencyCode=$originatingCurrencyCode, originatingDepositoryFinancialInstitutionName=$originatingDepositoryFinancialInstitutionName, originatingDepositoryFinancialInstitutionIdQualifier=$originatingDepositoryFinancialInstitutionIdQualifier, originatingDepositoryFinancialInstitutionId=$originatingDepositoryFinancialInstitutionId, originatingDepositoryFinancialInstitutionBranchCountry=$originatingDepositoryFinancialInstitutionBranchCountry, originatorCity=$originatorCity, originatorCompanyEntryDescription=$originatorCompanyEntryDescription, originatorCountry=$originatorCountry, originatorIdentification=$originatorIdentification, originatorName=$originatorName, originatorPostalCode=$originatorPostalCode, originatorStreetAddress=$originatorStreetAddress, originatorStateOrProvince=$originatorStateOrProvince, paymentRelatedInformation=$paymentRelatedInformation, paymentRelatedInformation2=$paymentRelatedInformation2, receiverIdentificationNumber=$receiverIdentificationNumber, receiverStreetAddress=$receiverStreetAddress, receiverCity=$receiverCity, receiverStateOrProvince=$receiverStateOrProvince, receiverCountry=$receiverCountry, receiverPostalCode=$receiverPostalCode, receivingCompanyOrIndividualName=$receivingCompanyOrIndividualName, receivingDepositoryFinancialInstitutionName=$receivingDepositoryFinancialInstitutionName, receivingDepositoryFinancialInstitutionIdQualifier=$receivingDepositoryFinancialInstitutionIdQualifier, receivingDepositoryFinancialInstitutionId=$receivingDepositoryFinancialInstitutionId, receivingDepositoryFinancialInstitutionCountry=$receivingDepositoryFinancialInstitutionCountry, traceNumber=$traceNumber, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var amount: JsonField<Long> = JsonMissing.of()
                    private var foreignExchangeIndicator: JsonField<String> = JsonMissing.of()
                    private var foreignExchangeReferenceIndicator: JsonField<String> =
                        JsonMissing.of()
                    private var foreignExchangeReference: JsonField<String> = JsonMissing.of()
                    private var destinationCountryCode: JsonField<String> = JsonMissing.of()
                    private var destinationCurrencyCode: JsonField<String> = JsonMissing.of()
                    private var foreignPaymentAmount: JsonField<Long> = JsonMissing.of()
                    private var foreignTraceNumber: JsonField<String> = JsonMissing.of()
                    private var internationalTransactionTypeCode: JsonField<String> =
                        JsonMissing.of()
                    private var originatingCurrencyCode: JsonField<String> = JsonMissing.of()
                    private var originatingDepositoryFinancialInstitutionName: JsonField<String> =
                        JsonMissing.of()
                    private var originatingDepositoryFinancialInstitutionIdQualifier:
                        JsonField<String> =
                        JsonMissing.of()
                    private var originatingDepositoryFinancialInstitutionId: JsonField<String> =
                        JsonMissing.of()
                    private var originatingDepositoryFinancialInstitutionBranchCountry:
                        JsonField<String> =
                        JsonMissing.of()
                    private var originatorCity: JsonField<String> = JsonMissing.of()
                    private var originatorCompanyEntryDescription: JsonField<String> =
                        JsonMissing.of()
                    private var originatorCountry: JsonField<String> = JsonMissing.of()
                    private var originatorIdentification: JsonField<String> = JsonMissing.of()
                    private var originatorName: JsonField<String> = JsonMissing.of()
                    private var originatorPostalCode: JsonField<String> = JsonMissing.of()
                    private var originatorStreetAddress: JsonField<String> = JsonMissing.of()
                    private var originatorStateOrProvince: JsonField<String> = JsonMissing.of()
                    private var paymentRelatedInformation: JsonField<String> = JsonMissing.of()
                    private var paymentRelatedInformation2: JsonField<String> = JsonMissing.of()
                    private var receiverIdentificationNumber: JsonField<String> = JsonMissing.of()
                    private var receiverStreetAddress: JsonField<String> = JsonMissing.of()
                    private var receiverCity: JsonField<String> = JsonMissing.of()
                    private var receiverStateOrProvince: JsonField<String> = JsonMissing.of()
                    private var receiverCountry: JsonField<String> = JsonMissing.of()
                    private var receiverPostalCode: JsonField<String> = JsonMissing.of()
                    private var receivingCompanyOrIndividualName: JsonField<String> =
                        JsonMissing.of()
                    private var receivingDepositoryFinancialInstitutionName: JsonField<String> =
                        JsonMissing.of()
                    private var receivingDepositoryFinancialInstitutionIdQualifier:
                        JsonField<String> =
                        JsonMissing.of()
                    private var receivingDepositoryFinancialInstitutionId: JsonField<String> =
                        JsonMissing.of()
                    private var receivingDepositoryFinancialInstitutionCountry: JsonField<String> =
                        JsonMissing.of()
                    private var traceNumber: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(internationalAchDecline: InternationalAchDecline) = apply {
                        this.amount = internationalAchDecline.amount
                        this.foreignExchangeIndicator =
                            internationalAchDecline.foreignExchangeIndicator
                        this.foreignExchangeReferenceIndicator =
                            internationalAchDecline.foreignExchangeReferenceIndicator
                        this.foreignExchangeReference =
                            internationalAchDecline.foreignExchangeReference
                        this.destinationCountryCode = internationalAchDecline.destinationCountryCode
                        this.destinationCurrencyCode =
                            internationalAchDecline.destinationCurrencyCode
                        this.foreignPaymentAmount = internationalAchDecline.foreignPaymentAmount
                        this.foreignTraceNumber = internationalAchDecline.foreignTraceNumber
                        this.internationalTransactionTypeCode =
                            internationalAchDecline.internationalTransactionTypeCode
                        this.originatingCurrencyCode =
                            internationalAchDecline.originatingCurrencyCode
                        this.originatingDepositoryFinancialInstitutionName =
                            internationalAchDecline.originatingDepositoryFinancialInstitutionName
                        this.originatingDepositoryFinancialInstitutionIdQualifier =
                            internationalAchDecline
                                .originatingDepositoryFinancialInstitutionIdQualifier
                        this.originatingDepositoryFinancialInstitutionId =
                            internationalAchDecline.originatingDepositoryFinancialInstitutionId
                        this.originatingDepositoryFinancialInstitutionBranchCountry =
                            internationalAchDecline
                                .originatingDepositoryFinancialInstitutionBranchCountry
                        this.originatorCity = internationalAchDecline.originatorCity
                        this.originatorCompanyEntryDescription =
                            internationalAchDecline.originatorCompanyEntryDescription
                        this.originatorCountry = internationalAchDecline.originatorCountry
                        this.originatorIdentification =
                            internationalAchDecline.originatorIdentification
                        this.originatorName = internationalAchDecline.originatorName
                        this.originatorPostalCode = internationalAchDecline.originatorPostalCode
                        this.originatorStreetAddress =
                            internationalAchDecline.originatorStreetAddress
                        this.originatorStateOrProvince =
                            internationalAchDecline.originatorStateOrProvince
                        this.paymentRelatedInformation =
                            internationalAchDecline.paymentRelatedInformation
                        this.paymentRelatedInformation2 =
                            internationalAchDecline.paymentRelatedInformation2
                        this.receiverIdentificationNumber =
                            internationalAchDecline.receiverIdentificationNumber
                        this.receiverStreetAddress = internationalAchDecline.receiverStreetAddress
                        this.receiverCity = internationalAchDecline.receiverCity
                        this.receiverStateOrProvince =
                            internationalAchDecline.receiverStateOrProvince
                        this.receiverCountry = internationalAchDecline.receiverCountry
                        this.receiverPostalCode = internationalAchDecline.receiverPostalCode
                        this.receivingCompanyOrIndividualName =
                            internationalAchDecline.receivingCompanyOrIndividualName
                        this.receivingDepositoryFinancialInstitutionName =
                            internationalAchDecline.receivingDepositoryFinancialInstitutionName
                        this.receivingDepositoryFinancialInstitutionIdQualifier =
                            internationalAchDecline
                                .receivingDepositoryFinancialInstitutionIdQualifier
                        this.receivingDepositoryFinancialInstitutionId =
                            internationalAchDecline.receivingDepositoryFinancialInstitutionId
                        this.receivingDepositoryFinancialInstitutionCountry =
                            internationalAchDecline.receivingDepositoryFinancialInstitutionCountry
                        this.traceNumber = internationalAchDecline.traceNumber
                        additionalProperties(internationalAchDecline.additionalProperties)
                    }

                    /**
                     * The declined amount in the minor unit of the destination account currency.
                     * For dollars, for example, this is cents.
                     */
                    fun amount(amount: Long) = amount(JsonField.of(amount))

                    /**
                     * The declined amount in the minor unit of the destination account currency.
                     * For dollars, for example, this is cents.
                     */
                    @JsonProperty("amount")
                    @ExcludeMissing
                    fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                    fun foreignExchangeIndicator(foreignExchangeIndicator: String) =
                        foreignExchangeIndicator(JsonField.of(foreignExchangeIndicator))

                    @JsonProperty("foreign_exchange_indicator")
                    @ExcludeMissing
                    fun foreignExchangeIndicator(foreignExchangeIndicator: JsonField<String>) =
                        apply {
                            this.foreignExchangeIndicator = foreignExchangeIndicator
                        }

                    fun foreignExchangeReferenceIndicator(
                        foreignExchangeReferenceIndicator: String
                    ) =
                        foreignExchangeReferenceIndicator(
                            JsonField.of(foreignExchangeReferenceIndicator)
                        )

                    @JsonProperty("foreign_exchange_reference_indicator")
                    @ExcludeMissing
                    fun foreignExchangeReferenceIndicator(
                        foreignExchangeReferenceIndicator: JsonField<String>
                    ) = apply {
                        this.foreignExchangeReferenceIndicator = foreignExchangeReferenceIndicator
                    }

                    fun foreignExchangeReference(foreignExchangeReference: String) =
                        foreignExchangeReference(JsonField.of(foreignExchangeReference))

                    @JsonProperty("foreign_exchange_reference")
                    @ExcludeMissing
                    fun foreignExchangeReference(foreignExchangeReference: JsonField<String>) =
                        apply {
                            this.foreignExchangeReference = foreignExchangeReference
                        }

                    fun destinationCountryCode(destinationCountryCode: String) =
                        destinationCountryCode(JsonField.of(destinationCountryCode))

                    @JsonProperty("destination_country_code")
                    @ExcludeMissing
                    fun destinationCountryCode(destinationCountryCode: JsonField<String>) = apply {
                        this.destinationCountryCode = destinationCountryCode
                    }

                    fun destinationCurrencyCode(destinationCurrencyCode: String) =
                        destinationCurrencyCode(JsonField.of(destinationCurrencyCode))

                    @JsonProperty("destination_currency_code")
                    @ExcludeMissing
                    fun destinationCurrencyCode(destinationCurrencyCode: JsonField<String>) =
                        apply {
                            this.destinationCurrencyCode = destinationCurrencyCode
                        }

                    fun foreignPaymentAmount(foreignPaymentAmount: Long) =
                        foreignPaymentAmount(JsonField.of(foreignPaymentAmount))

                    @JsonProperty("foreign_payment_amount")
                    @ExcludeMissing
                    fun foreignPaymentAmount(foreignPaymentAmount: JsonField<Long>) = apply {
                        this.foreignPaymentAmount = foreignPaymentAmount
                    }

                    fun foreignTraceNumber(foreignTraceNumber: String) =
                        foreignTraceNumber(JsonField.of(foreignTraceNumber))

                    @JsonProperty("foreign_trace_number")
                    @ExcludeMissing
                    fun foreignTraceNumber(foreignTraceNumber: JsonField<String>) = apply {
                        this.foreignTraceNumber = foreignTraceNumber
                    }

                    fun internationalTransactionTypeCode(internationalTransactionTypeCode: String) =
                        internationalTransactionTypeCode(
                            JsonField.of(internationalTransactionTypeCode)
                        )

                    @JsonProperty("international_transaction_type_code")
                    @ExcludeMissing
                    fun internationalTransactionTypeCode(
                        internationalTransactionTypeCode: JsonField<String>
                    ) = apply {
                        this.internationalTransactionTypeCode = internationalTransactionTypeCode
                    }

                    fun originatingCurrencyCode(originatingCurrencyCode: String) =
                        originatingCurrencyCode(JsonField.of(originatingCurrencyCode))

                    @JsonProperty("originating_currency_code")
                    @ExcludeMissing
                    fun originatingCurrencyCode(originatingCurrencyCode: JsonField<String>) =
                        apply {
                            this.originatingCurrencyCode = originatingCurrencyCode
                        }

                    fun originatingDepositoryFinancialInstitutionName(
                        originatingDepositoryFinancialInstitutionName: String
                    ) =
                        originatingDepositoryFinancialInstitutionName(
                            JsonField.of(originatingDepositoryFinancialInstitutionName)
                        )

                    @JsonProperty("originating_depository_financial_institution_name")
                    @ExcludeMissing
                    fun originatingDepositoryFinancialInstitutionName(
                        originatingDepositoryFinancialInstitutionName: JsonField<String>
                    ) = apply {
                        this.originatingDepositoryFinancialInstitutionName =
                            originatingDepositoryFinancialInstitutionName
                    }

                    fun originatingDepositoryFinancialInstitutionIdQualifier(
                        originatingDepositoryFinancialInstitutionIdQualifier: String
                    ) =
                        originatingDepositoryFinancialInstitutionIdQualifier(
                            JsonField.of(originatingDepositoryFinancialInstitutionIdQualifier)
                        )

                    @JsonProperty("originating_depository_financial_institution_id_qualifier")
                    @ExcludeMissing
                    fun originatingDepositoryFinancialInstitutionIdQualifier(
                        originatingDepositoryFinancialInstitutionIdQualifier: JsonField<String>
                    ) = apply {
                        this.originatingDepositoryFinancialInstitutionIdQualifier =
                            originatingDepositoryFinancialInstitutionIdQualifier
                    }

                    fun originatingDepositoryFinancialInstitutionId(
                        originatingDepositoryFinancialInstitutionId: String
                    ) =
                        originatingDepositoryFinancialInstitutionId(
                            JsonField.of(originatingDepositoryFinancialInstitutionId)
                        )

                    @JsonProperty("originating_depository_financial_institution_id")
                    @ExcludeMissing
                    fun originatingDepositoryFinancialInstitutionId(
                        originatingDepositoryFinancialInstitutionId: JsonField<String>
                    ) = apply {
                        this.originatingDepositoryFinancialInstitutionId =
                            originatingDepositoryFinancialInstitutionId
                    }

                    fun originatingDepositoryFinancialInstitutionBranchCountry(
                        originatingDepositoryFinancialInstitutionBranchCountry: String
                    ) =
                        originatingDepositoryFinancialInstitutionBranchCountry(
                            JsonField.of(originatingDepositoryFinancialInstitutionBranchCountry)
                        )

                    @JsonProperty("originating_depository_financial_institution_branch_country")
                    @ExcludeMissing
                    fun originatingDepositoryFinancialInstitutionBranchCountry(
                        originatingDepositoryFinancialInstitutionBranchCountry: JsonField<String>
                    ) = apply {
                        this.originatingDepositoryFinancialInstitutionBranchCountry =
                            originatingDepositoryFinancialInstitutionBranchCountry
                    }

                    fun originatorCity(originatorCity: String) =
                        originatorCity(JsonField.of(originatorCity))

                    @JsonProperty("originator_city")
                    @ExcludeMissing
                    fun originatorCity(originatorCity: JsonField<String>) = apply {
                        this.originatorCity = originatorCity
                    }

                    fun originatorCompanyEntryDescription(
                        originatorCompanyEntryDescription: String
                    ) =
                        originatorCompanyEntryDescription(
                            JsonField.of(originatorCompanyEntryDescription)
                        )

                    @JsonProperty("originator_company_entry_description")
                    @ExcludeMissing
                    fun originatorCompanyEntryDescription(
                        originatorCompanyEntryDescription: JsonField<String>
                    ) = apply {
                        this.originatorCompanyEntryDescription = originatorCompanyEntryDescription
                    }

                    fun originatorCountry(originatorCountry: String) =
                        originatorCountry(JsonField.of(originatorCountry))

                    @JsonProperty("originator_country")
                    @ExcludeMissing
                    fun originatorCountry(originatorCountry: JsonField<String>) = apply {
                        this.originatorCountry = originatorCountry
                    }

                    fun originatorIdentification(originatorIdentification: String) =
                        originatorIdentification(JsonField.of(originatorIdentification))

                    @JsonProperty("originator_identification")
                    @ExcludeMissing
                    fun originatorIdentification(originatorIdentification: JsonField<String>) =
                        apply {
                            this.originatorIdentification = originatorIdentification
                        }

                    fun originatorName(originatorName: String) =
                        originatorName(JsonField.of(originatorName))

                    @JsonProperty("originator_name")
                    @ExcludeMissing
                    fun originatorName(originatorName: JsonField<String>) = apply {
                        this.originatorName = originatorName
                    }

                    fun originatorPostalCode(originatorPostalCode: String) =
                        originatorPostalCode(JsonField.of(originatorPostalCode))

                    @JsonProperty("originator_postal_code")
                    @ExcludeMissing
                    fun originatorPostalCode(originatorPostalCode: JsonField<String>) = apply {
                        this.originatorPostalCode = originatorPostalCode
                    }

                    fun originatorStreetAddress(originatorStreetAddress: String) =
                        originatorStreetAddress(JsonField.of(originatorStreetAddress))

                    @JsonProperty("originator_street_address")
                    @ExcludeMissing
                    fun originatorStreetAddress(originatorStreetAddress: JsonField<String>) =
                        apply {
                            this.originatorStreetAddress = originatorStreetAddress
                        }

                    fun originatorStateOrProvince(originatorStateOrProvince: String) =
                        originatorStateOrProvince(JsonField.of(originatorStateOrProvince))

                    @JsonProperty("originator_state_or_province")
                    @ExcludeMissing
                    fun originatorStateOrProvince(originatorStateOrProvince: JsonField<String>) =
                        apply {
                            this.originatorStateOrProvince = originatorStateOrProvince
                        }

                    fun paymentRelatedInformation(paymentRelatedInformation: String) =
                        paymentRelatedInformation(JsonField.of(paymentRelatedInformation))

                    @JsonProperty("payment_related_information")
                    @ExcludeMissing
                    fun paymentRelatedInformation(paymentRelatedInformation: JsonField<String>) =
                        apply {
                            this.paymentRelatedInformation = paymentRelatedInformation
                        }

                    fun paymentRelatedInformation2(paymentRelatedInformation2: String) =
                        paymentRelatedInformation2(JsonField.of(paymentRelatedInformation2))

                    @JsonProperty("payment_related_information2")
                    @ExcludeMissing
                    fun paymentRelatedInformation2(paymentRelatedInformation2: JsonField<String>) =
                        apply {
                            this.paymentRelatedInformation2 = paymentRelatedInformation2
                        }

                    fun receiverIdentificationNumber(receiverIdentificationNumber: String) =
                        receiverIdentificationNumber(JsonField.of(receiverIdentificationNumber))

                    @JsonProperty("receiver_identification_number")
                    @ExcludeMissing
                    fun receiverIdentificationNumber(
                        receiverIdentificationNumber: JsonField<String>
                    ) = apply { this.receiverIdentificationNumber = receiverIdentificationNumber }

                    fun receiverStreetAddress(receiverStreetAddress: String) =
                        receiverStreetAddress(JsonField.of(receiverStreetAddress))

                    @JsonProperty("receiver_street_address")
                    @ExcludeMissing
                    fun receiverStreetAddress(receiverStreetAddress: JsonField<String>) = apply {
                        this.receiverStreetAddress = receiverStreetAddress
                    }

                    fun receiverCity(receiverCity: String) =
                        receiverCity(JsonField.of(receiverCity))

                    @JsonProperty("receiver_city")
                    @ExcludeMissing
                    fun receiverCity(receiverCity: JsonField<String>) = apply {
                        this.receiverCity = receiverCity
                    }

                    fun receiverStateOrProvince(receiverStateOrProvince: String) =
                        receiverStateOrProvince(JsonField.of(receiverStateOrProvince))

                    @JsonProperty("receiver_state_or_province")
                    @ExcludeMissing
                    fun receiverStateOrProvince(receiverStateOrProvince: JsonField<String>) =
                        apply {
                            this.receiverStateOrProvince = receiverStateOrProvince
                        }

                    fun receiverCountry(receiverCountry: String) =
                        receiverCountry(JsonField.of(receiverCountry))

                    @JsonProperty("receiver_country")
                    @ExcludeMissing
                    fun receiverCountry(receiverCountry: JsonField<String>) = apply {
                        this.receiverCountry = receiverCountry
                    }

                    fun receiverPostalCode(receiverPostalCode: String) =
                        receiverPostalCode(JsonField.of(receiverPostalCode))

                    @JsonProperty("receiver_postal_code")
                    @ExcludeMissing
                    fun receiverPostalCode(receiverPostalCode: JsonField<String>) = apply {
                        this.receiverPostalCode = receiverPostalCode
                    }

                    fun receivingCompanyOrIndividualName(receivingCompanyOrIndividualName: String) =
                        receivingCompanyOrIndividualName(
                            JsonField.of(receivingCompanyOrIndividualName)
                        )

                    @JsonProperty("receiving_company_or_individual_name")
                    @ExcludeMissing
                    fun receivingCompanyOrIndividualName(
                        receivingCompanyOrIndividualName: JsonField<String>
                    ) = apply {
                        this.receivingCompanyOrIndividualName = receivingCompanyOrIndividualName
                    }

                    fun receivingDepositoryFinancialInstitutionName(
                        receivingDepositoryFinancialInstitutionName: String
                    ) =
                        receivingDepositoryFinancialInstitutionName(
                            JsonField.of(receivingDepositoryFinancialInstitutionName)
                        )

                    @JsonProperty("receiving_depository_financial_institution_name")
                    @ExcludeMissing
                    fun receivingDepositoryFinancialInstitutionName(
                        receivingDepositoryFinancialInstitutionName: JsonField<String>
                    ) = apply {
                        this.receivingDepositoryFinancialInstitutionName =
                            receivingDepositoryFinancialInstitutionName
                    }

                    fun receivingDepositoryFinancialInstitutionIdQualifier(
                        receivingDepositoryFinancialInstitutionIdQualifier: String
                    ) =
                        receivingDepositoryFinancialInstitutionIdQualifier(
                            JsonField.of(receivingDepositoryFinancialInstitutionIdQualifier)
                        )

                    @JsonProperty("receiving_depository_financial_institution_id_qualifier")
                    @ExcludeMissing
                    fun receivingDepositoryFinancialInstitutionIdQualifier(
                        receivingDepositoryFinancialInstitutionIdQualifier: JsonField<String>
                    ) = apply {
                        this.receivingDepositoryFinancialInstitutionIdQualifier =
                            receivingDepositoryFinancialInstitutionIdQualifier
                    }

                    fun receivingDepositoryFinancialInstitutionId(
                        receivingDepositoryFinancialInstitutionId: String
                    ) =
                        receivingDepositoryFinancialInstitutionId(
                            JsonField.of(receivingDepositoryFinancialInstitutionId)
                        )

                    @JsonProperty("receiving_depository_financial_institution_id")
                    @ExcludeMissing
                    fun receivingDepositoryFinancialInstitutionId(
                        receivingDepositoryFinancialInstitutionId: JsonField<String>
                    ) = apply {
                        this.receivingDepositoryFinancialInstitutionId =
                            receivingDepositoryFinancialInstitutionId
                    }

                    fun receivingDepositoryFinancialInstitutionCountry(
                        receivingDepositoryFinancialInstitutionCountry: String
                    ) =
                        receivingDepositoryFinancialInstitutionCountry(
                            JsonField.of(receivingDepositoryFinancialInstitutionCountry)
                        )

                    @JsonProperty("receiving_depository_financial_institution_country")
                    @ExcludeMissing
                    fun receivingDepositoryFinancialInstitutionCountry(
                        receivingDepositoryFinancialInstitutionCountry: JsonField<String>
                    ) = apply {
                        this.receivingDepositoryFinancialInstitutionCountry =
                            receivingDepositoryFinancialInstitutionCountry
                    }

                    fun traceNumber(traceNumber: String) = traceNumber(JsonField.of(traceNumber))

                    @JsonProperty("trace_number")
                    @ExcludeMissing
                    fun traceNumber(traceNumber: JsonField<String>) = apply {
                        this.traceNumber = traceNumber
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

                    fun build(): InternationalAchDecline =
                        InternationalAchDecline(
                            amount,
                            foreignExchangeIndicator,
                            foreignExchangeReferenceIndicator,
                            foreignExchangeReference,
                            destinationCountryCode,
                            destinationCurrencyCode,
                            foreignPaymentAmount,
                            foreignTraceNumber,
                            internationalTransactionTypeCode,
                            originatingCurrencyCode,
                            originatingDepositoryFinancialInstitutionName,
                            originatingDepositoryFinancialInstitutionIdQualifier,
                            originatingDepositoryFinancialInstitutionId,
                            originatingDepositoryFinancialInstitutionBranchCountry,
                            originatorCity,
                            originatorCompanyEntryDescription,
                            originatorCountry,
                            originatorIdentification,
                            originatorName,
                            originatorPostalCode,
                            originatorStreetAddress,
                            originatorStateOrProvince,
                            paymentRelatedInformation,
                            paymentRelatedInformation2,
                            receiverIdentificationNumber,
                            receiverStreetAddress,
                            receiverCity,
                            receiverStateOrProvince,
                            receiverCountry,
                            receiverPostalCode,
                            receivingCompanyOrIndividualName,
                            receivingDepositoryFinancialInstitutionName,
                            receivingDepositoryFinancialInstitutionIdQualifier,
                            receivingDepositoryFinancialInstitutionId,
                            receivingDepositoryFinancialInstitutionCountry,
                            traceNumber,
                            additionalProperties.toUnmodifiable(),
                        )
                }
            }

            /**
             * A Deprecated Card Decline object. This field will be present in the JSON response if
             * and only if `category` is equal to `card_route_decline`.
             */
            @JsonDeserialize(builder = CardRouteDecline.Builder::class)
            @NoAutoDetect
            class CardRouteDecline
            private constructor(
                private val amount: JsonField<Long>,
                private val currency: JsonField<Currency>,
                private val merchantAcceptorId: JsonField<String>,
                private val merchantCity: JsonField<String>,
                private val merchantCountry: JsonField<String>,
                private val merchantDescriptor: JsonField<String>,
                private val merchantState: JsonField<String>,
                private val merchantCategoryCode: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /**
                 * The declined amount in the minor unit of the destination account currency. For
                 * dollars, for example, this is cents.
                 */
                fun amount(): Long = amount.getRequired("amount")

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the destination
                 * account currency.
                 */
                fun currency(): Currency = currency.getRequired("currency")

                fun merchantAcceptorId(): String =
                    merchantAcceptorId.getRequired("merchant_acceptor_id")

                fun merchantCity(): Optional<String> =
                    Optional.ofNullable(merchantCity.getNullable("merchant_city"))

                fun merchantCountry(): String = merchantCountry.getRequired("merchant_country")

                fun merchantDescriptor(): String =
                    merchantDescriptor.getRequired("merchant_descriptor")

                fun merchantState(): Optional<String> =
                    Optional.ofNullable(merchantState.getNullable("merchant_state"))

                fun merchantCategoryCode(): Optional<String> =
                    Optional.ofNullable(merchantCategoryCode.getNullable("merchant_category_code"))

                /**
                 * The declined amount in the minor unit of the destination account currency. For
                 * dollars, for example, this is cents.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the destination
                 * account currency.
                 */
                @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

                @JsonProperty("merchant_acceptor_id")
                @ExcludeMissing
                fun _merchantAcceptorId() = merchantAcceptorId

                @JsonProperty("merchant_city") @ExcludeMissing fun _merchantCity() = merchantCity

                @JsonProperty("merchant_country")
                @ExcludeMissing
                fun _merchantCountry() = merchantCountry

                @JsonProperty("merchant_descriptor")
                @ExcludeMissing
                fun _merchantDescriptor() = merchantDescriptor

                @JsonProperty("merchant_state") @ExcludeMissing fun _merchantState() = merchantState

                @JsonProperty("merchant_category_code")
                @ExcludeMissing
                fun _merchantCategoryCode() = merchantCategoryCode

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate() = apply {
                    if (!validated) {
                        amount()
                        currency()
                        merchantAcceptorId()
                        merchantCity()
                        merchantCountry()
                        merchantDescriptor()
                        merchantState()
                        merchantCategoryCode()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is CardRouteDecline &&
                        this.amount == other.amount &&
                        this.currency == other.currency &&
                        this.merchantAcceptorId == other.merchantAcceptorId &&
                        this.merchantCity == other.merchantCity &&
                        this.merchantCountry == other.merchantCountry &&
                        this.merchantDescriptor == other.merchantDescriptor &&
                        this.merchantState == other.merchantState &&
                        this.merchantCategoryCode == other.merchantCategoryCode &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                amount,
                                currency,
                                merchantAcceptorId,
                                merchantCity,
                                merchantCountry,
                                merchantDescriptor,
                                merchantState,
                                merchantCategoryCode,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "CardRouteDecline{amount=$amount, currency=$currency, merchantAcceptorId=$merchantAcceptorId, merchantCity=$merchantCity, merchantCountry=$merchantCountry, merchantDescriptor=$merchantDescriptor, merchantState=$merchantState, merchantCategoryCode=$merchantCategoryCode, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var amount: JsonField<Long> = JsonMissing.of()
                    private var currency: JsonField<Currency> = JsonMissing.of()
                    private var merchantAcceptorId: JsonField<String> = JsonMissing.of()
                    private var merchantCity: JsonField<String> = JsonMissing.of()
                    private var merchantCountry: JsonField<String> = JsonMissing.of()
                    private var merchantDescriptor: JsonField<String> = JsonMissing.of()
                    private var merchantState: JsonField<String> = JsonMissing.of()
                    private var merchantCategoryCode: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(cardRouteDecline: CardRouteDecline) = apply {
                        this.amount = cardRouteDecline.amount
                        this.currency = cardRouteDecline.currency
                        this.merchantAcceptorId = cardRouteDecline.merchantAcceptorId
                        this.merchantCity = cardRouteDecline.merchantCity
                        this.merchantCountry = cardRouteDecline.merchantCountry
                        this.merchantDescriptor = cardRouteDecline.merchantDescriptor
                        this.merchantState = cardRouteDecline.merchantState
                        this.merchantCategoryCode = cardRouteDecline.merchantCategoryCode
                        additionalProperties(cardRouteDecline.additionalProperties)
                    }

                    /**
                     * The declined amount in the minor unit of the destination account currency.
                     * For dollars, for example, this is cents.
                     */
                    fun amount(amount: Long) = amount(JsonField.of(amount))

                    /**
                     * The declined amount in the minor unit of the destination account currency.
                     * For dollars, for example, this is cents.
                     */
                    @JsonProperty("amount")
                    @ExcludeMissing
                    fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                     * destination account currency.
                     */
                    fun currency(currency: Currency) = currency(JsonField.of(currency))

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                     * destination account currency.
                     */
                    @JsonProperty("currency")
                    @ExcludeMissing
                    fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                    fun merchantAcceptorId(merchantAcceptorId: String) =
                        merchantAcceptorId(JsonField.of(merchantAcceptorId))

                    @JsonProperty("merchant_acceptor_id")
                    @ExcludeMissing
                    fun merchantAcceptorId(merchantAcceptorId: JsonField<String>) = apply {
                        this.merchantAcceptorId = merchantAcceptorId
                    }

                    fun merchantCity(merchantCity: String) =
                        merchantCity(JsonField.of(merchantCity))

                    @JsonProperty("merchant_city")
                    @ExcludeMissing
                    fun merchantCity(merchantCity: JsonField<String>) = apply {
                        this.merchantCity = merchantCity
                    }

                    fun merchantCountry(merchantCountry: String) =
                        merchantCountry(JsonField.of(merchantCountry))

                    @JsonProperty("merchant_country")
                    @ExcludeMissing
                    fun merchantCountry(merchantCountry: JsonField<String>) = apply {
                        this.merchantCountry = merchantCountry
                    }

                    fun merchantDescriptor(merchantDescriptor: String) =
                        merchantDescriptor(JsonField.of(merchantDescriptor))

                    @JsonProperty("merchant_descriptor")
                    @ExcludeMissing
                    fun merchantDescriptor(merchantDescriptor: JsonField<String>) = apply {
                        this.merchantDescriptor = merchantDescriptor
                    }

                    fun merchantState(merchantState: String) =
                        merchantState(JsonField.of(merchantState))

                    @JsonProperty("merchant_state")
                    @ExcludeMissing
                    fun merchantState(merchantState: JsonField<String>) = apply {
                        this.merchantState = merchantState
                    }

                    fun merchantCategoryCode(merchantCategoryCode: String) =
                        merchantCategoryCode(JsonField.of(merchantCategoryCode))

                    @JsonProperty("merchant_category_code")
                    @ExcludeMissing
                    fun merchantCategoryCode(merchantCategoryCode: JsonField<String>) = apply {
                        this.merchantCategoryCode = merchantCategoryCode
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

                    fun build(): CardRouteDecline =
                        CardRouteDecline(
                            amount,
                            currency,
                            merchantAcceptorId,
                            merchantCity,
                            merchantCountry,
                            merchantDescriptor,
                            merchantState,
                            merchantCategoryCode,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class Currency
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) {

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
        }

        class Type
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) {

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
    }

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

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
            val INBOUND_REAL_TIME_PAYMENTS_TRANSFER_SIMULATION_RESULT =
                Type(JsonField.of("inbound_real_time_payments_transfer_simulation_result"))

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            INBOUND_REAL_TIME_PAYMENTS_TRANSFER_SIMULATION_RESULT,
        }

        enum class Value {
            INBOUND_REAL_TIME_PAYMENTS_TRANSFER_SIMULATION_RESULT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                INBOUND_REAL_TIME_PAYMENTS_TRANSFER_SIMULATION_RESULT ->
                    Value.INBOUND_REAL_TIME_PAYMENTS_TRANSFER_SIMULATION_RESULT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                INBOUND_REAL_TIME_PAYMENTS_TRANSFER_SIMULATION_RESULT ->
                    Known.INBOUND_REAL_TIME_PAYMENTS_TRANSFER_SIMULATION_RESULT
                else -> throw IncreaseInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
