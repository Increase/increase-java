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
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

/** The results of a Card Authorization simulation. */
@JsonDeserialize(builder = CardAuthorizationSimulation.Builder::class)
@NoAutoDetect
class CardAuthorizationSimulation
private constructor(
    private val pendingTransaction: JsonField<PendingTransaction>,
    private val declinedTransaction: JsonField<DeclinedTransaction>,
    private val type: JsonField<Type>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /**
     * If the authorization attempt succeeds, this will contain the resulting Pending Transaction
     * object. The Pending Transaction's `source` will be of `category: card_authorization`.
     */
    fun pendingTransaction(): Optional<PendingTransaction> =
        Optional.ofNullable(pendingTransaction.getNullable("pending_transaction"))

    /**
     * If the authorization attempt fails, this will contain the resulting
     * [Declined Transaction](#declined-transactions) object. The Declined Transaction's `source`
     * will be of `category: card_decline`.
     */
    fun declinedTransaction(): Optional<DeclinedTransaction> =
        Optional.ofNullable(declinedTransaction.getNullable("declined_transaction"))

    /**
     * A constant representing the object's type. For this resource it will always be
     * `inbound_card_authorization_simulation_result`.
     */
    fun type(): Type = type.getRequired("type")

    /**
     * If the authorization attempt succeeds, this will contain the resulting Pending Transaction
     * object. The Pending Transaction's `source` will be of `category: card_authorization`.
     */
    @JsonProperty("pending_transaction")
    @ExcludeMissing
    fun _pendingTransaction() = pendingTransaction

    /**
     * If the authorization attempt fails, this will contain the resulting
     * [Declined Transaction](#declined-transactions) object. The Declined Transaction's `source`
     * will be of `category: card_decline`.
     */
    @JsonProperty("declined_transaction")
    @ExcludeMissing
    fun _declinedTransaction() = declinedTransaction

    /**
     * A constant representing the object's type. For this resource it will always be
     * `inbound_card_authorization_simulation_result`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): CardAuthorizationSimulation = apply {
        if (!validated) {
            pendingTransaction().map { it.validate() }
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

        return other is CardAuthorizationSimulation &&
            this.pendingTransaction == other.pendingTransaction &&
            this.declinedTransaction == other.declinedTransaction &&
            this.type == other.type &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    pendingTransaction,
                    declinedTransaction,
                    type,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "CardAuthorizationSimulation{pendingTransaction=$pendingTransaction, declinedTransaction=$declinedTransaction, type=$type, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var pendingTransaction: JsonField<PendingTransaction> = JsonMissing.of()
        private var declinedTransaction: JsonField<DeclinedTransaction> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(cardAuthorizationSimulation: CardAuthorizationSimulation) = apply {
            this.pendingTransaction = cardAuthorizationSimulation.pendingTransaction
            this.declinedTransaction = cardAuthorizationSimulation.declinedTransaction
            this.type = cardAuthorizationSimulation.type
            additionalProperties(cardAuthorizationSimulation.additionalProperties)
        }

        /**
         * If the authorization attempt succeeds, this will contain the resulting Pending
         * Transaction object. The Pending Transaction's `source` will be of `category:
         * card_authorization`.
         */
        fun pendingTransaction(pendingTransaction: PendingTransaction) =
            pendingTransaction(JsonField.of(pendingTransaction))

        /**
         * If the authorization attempt succeeds, this will contain the resulting Pending
         * Transaction object. The Pending Transaction's `source` will be of `category:
         * card_authorization`.
         */
        @JsonProperty("pending_transaction")
        @ExcludeMissing
        fun pendingTransaction(pendingTransaction: JsonField<PendingTransaction>) = apply {
            this.pendingTransaction = pendingTransaction
        }

        /**
         * If the authorization attempt fails, this will contain the resulting
         * [Declined Transaction](#declined-transactions) object. The Declined Transaction's
         * `source` will be of `category: card_decline`.
         */
        fun declinedTransaction(declinedTransaction: DeclinedTransaction) =
            declinedTransaction(JsonField.of(declinedTransaction))

        /**
         * If the authorization attempt fails, this will contain the resulting
         * [Declined Transaction](#declined-transactions) object. The Declined Transaction's
         * `source` will be of `category: card_decline`.
         */
        @JsonProperty("declined_transaction")
        @ExcludeMissing
        fun declinedTransaction(declinedTransaction: JsonField<DeclinedTransaction>) = apply {
            this.declinedTransaction = declinedTransaction
        }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `inbound_card_authorization_simulation_result`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be
         * `inbound_card_authorization_simulation_result`.
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

        fun build(): CardAuthorizationSimulation =
            CardAuthorizationSimulation(
                pendingTransaction,
                declinedTransaction,
                type,
                additionalProperties.toUnmodifiable(),
            )
    }

    /**
     * If the authorization attempt succeeds, this will contain the resulting Pending Transaction
     * object. The Pending Transaction's `source` will be of `category: card_authorization`.
     */
    @JsonDeserialize(builder = PendingTransaction.Builder::class)
    @NoAutoDetect
    class PendingTransaction
    private constructor(
        private val accountId: JsonField<String>,
        private val amount: JsonField<Long>,
        private val currency: JsonField<Currency>,
        private val completedAt: JsonField<OffsetDateTime>,
        private val createdAt: JsonField<OffsetDateTime>,
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

        private var hashCode: Int = 0

        /** The identifier for the account this Pending Transaction belongs to. */
        fun accountId(): String = accountId.getRequired("account_id")

        /**
         * The Pending Transaction amount in the minor unit of its currency. For dollars, for
         * example, this is cents.
         */
        fun amount(): Long = amount.getRequired("amount")

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the Pending Transaction's
         * currency. This will match the currency on the Pending Transcation's Account.
         */
        fun currency(): Currency = currency.getRequired("currency")

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date on which the Pending
         * Transaction was completed.
         */
        fun completedAt(): Optional<OffsetDateTime> =
            Optional.ofNullable(completedAt.getNullable("completed_at"))

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date on which the Pending
         * Transaction occured.
         */
        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        /**
         * For a Pending Transaction related to a transfer, this is the description you provide. For
         * a Pending Transaction related to a payment, this is the description the vendor provides.
         */
        fun description(): String = description.getRequired("description")

        /** The Pending Transaction identifier. */
        fun id(): String = id.getRequired("id")

        /**
         * The identifier for the route this Pending Transaction came through. Routes are things
         * like cards and ACH details.
         */
        fun routeId(): Optional<String> = Optional.ofNullable(routeId.getNullable("route_id"))

        /** The type of the route this Pending Transaction came through. */
        fun routeType(): Optional<RouteType> =
            Optional.ofNullable(routeType.getNullable("route_type"))

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
         * The Pending Transaction amount in the minor unit of its currency. For dollars, for
         * example, this is cents.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the Pending Transaction's
         * currency. This will match the currency on the Pending Transcation's Account.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date on which the Pending
         * Transaction was completed.
         */
        @JsonProperty("completed_at") @ExcludeMissing fun _completedAt() = completedAt

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date on which the Pending
         * Transaction occured.
         */
        @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

        /**
         * For a Pending Transaction related to a transfer, this is the description you provide. For
         * a Pending Transaction related to a payment, this is the description the vendor provides.
         */
        @JsonProperty("description") @ExcludeMissing fun _description() = description

        /** The Pending Transaction identifier. */
        @JsonProperty("id") @ExcludeMissing fun _id() = id

        /**
         * The identifier for the route this Pending Transaction came through. Routes are things
         * like cards and ACH details.
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
                currency()
                completedAt()
                createdAt()
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PendingTransaction &&
                this.accountId == other.accountId &&
                this.amount == other.amount &&
                this.currency == other.currency &&
                this.completedAt == other.completedAt &&
                this.createdAt == other.createdAt &&
                this.description == other.description &&
                this.id == other.id &&
                this.routeId == other.routeId &&
                this.routeType == other.routeType &&
                this.source == other.source &&
                this.status == other.status &&
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
                        completedAt,
                        createdAt,
                        description,
                        id,
                        routeId,
                        routeType,
                        source,
                        status,
                        type,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "PendingTransaction{accountId=$accountId, amount=$amount, currency=$currency, completedAt=$completedAt, createdAt=$createdAt, description=$description, id=$id, routeId=$routeId, routeType=$routeType, source=$source, status=$status, type=$type, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var accountId: JsonField<String> = JsonMissing.of()
            private var amount: JsonField<Long> = JsonMissing.of()
            private var currency: JsonField<Currency> = JsonMissing.of()
            private var completedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
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
                this.currency = pendingTransaction.currency
                this.completedAt = pendingTransaction.completedAt
                this.createdAt = pendingTransaction.createdAt
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
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the Pending
             * Transaction's currency. This will match the currency on the Pending Transcation's
             * Account.
             */
            fun currency(currency: Currency) = currency(JsonField.of(currency))

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the Pending
             * Transaction's currency. This will match the currency on the Pending Transcation's
             * Account.
             */
            @JsonProperty("currency")
            @ExcludeMissing
            fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

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
             * Transaction occured.
             */
            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date on which the Pending
             * Transaction occured.
             */
            @JsonProperty("created_at")
            @ExcludeMissing
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            /**
             * For a Pending Transaction related to a transfer, this is the description you provide.
             * For a Pending Transaction related to a payment, this is the description the vendor
             * provides.
             */
            fun description(description: String) = description(JsonField.of(description))

            /**
             * For a Pending Transaction related to a transfer, this is the description you provide.
             * For a Pending Transaction related to a payment, this is the description the vendor
             * provides.
             */
            @JsonProperty("description")
            @ExcludeMissing
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /** The Pending Transaction identifier. */
            fun id(id: String) = id(JsonField.of(id))

            /** The Pending Transaction identifier. */
            @JsonProperty("id")
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply { this.id = id }

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
             * This is an object giving more details on the network-level event that caused the
             * Pending Transaction. For example, for a card transaction this lists the merchant's
             * industry and location.
             */
            fun source(source: Source) = source(JsonField.of(source))

            /**
             * This is an object giving more details on the network-level event that caused the
             * Pending Transaction. For example, for a card transaction this lists the merchant's
             * industry and location.
             */
            @JsonProperty("source")
            @ExcludeMissing
            fun source(source: JsonField<Source>) = apply { this.source = source }

            /**
             * Whether the Pending Transaction has been confirmed and has an associated Transaction.
             */
            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Whether the Pending Transaction has been confirmed and has an associated Transaction.
             */
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
                    currency,
                    completedAt,
                    createdAt,
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
         * This is an object giving more details on the network-level event that caused the Pending
         * Transaction. For example, for a card transaction this lists the merchant's industry and
         * location.
         */
        @JsonDeserialize(builder = Source.Builder::class)
        @NoAutoDetect
        class Source
        private constructor(
            private val category: JsonField<Category>,
            private val accountTransferInstruction: JsonField<AccountTransferInstruction>,
            private val achTransferInstruction: JsonField<AchTransferInstruction>,
            private val cardAuthorization: JsonField<CardAuthorization>,
            private val checkDepositInstruction: JsonField<CheckDepositInstruction>,
            private val checkTransferInstruction: JsonField<CheckTransferInstruction>,
            private val inboundFundsHold: JsonField<InboundFundsHold>,
            private val cardRouteAuthorization: JsonField<CardRouteAuthorization>,
            private val realTimePaymentsTransferInstruction:
                JsonField<RealTimePaymentsTransferInstruction>,
            private val wireDrawdownPaymentInstruction: JsonField<WireDrawdownPaymentInstruction>,
            private val wireTransferInstruction: JsonField<WireTransferInstruction>,
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
             * A Account Transfer Instruction object. This field will be present in the JSON
             * response if and only if `category` is equal to `account_transfer_instruction`.
             */
            fun accountTransferInstruction(): Optional<AccountTransferInstruction> =
                Optional.ofNullable(
                    accountTransferInstruction.getNullable("account_transfer_instruction")
                )

            /**
             * A ACH Transfer Instruction object. This field will be present in the JSON response if
             * and only if `category` is equal to `ach_transfer_instruction`.
             */
            fun achTransferInstruction(): Optional<AchTransferInstruction> =
                Optional.ofNullable(achTransferInstruction.getNullable("ach_transfer_instruction"))

            /**
             * A Card Authorization object. This field will be present in the JSON response if and
             * only if `category` is equal to `card_authorization`.
             */
            fun cardAuthorization(): Optional<CardAuthorization> =
                Optional.ofNullable(cardAuthorization.getNullable("card_authorization"))

            /**
             * A Check Deposit Instruction object. This field will be present in the JSON response
             * if and only if `category` is equal to `check_deposit_instruction`.
             */
            fun checkDepositInstruction(): Optional<CheckDepositInstruction> =
                Optional.ofNullable(
                    checkDepositInstruction.getNullable("check_deposit_instruction")
                )

            /**
             * A Check Transfer Instruction object. This field will be present in the JSON response
             * if and only if `category` is equal to `check_transfer_instruction`.
             */
            fun checkTransferInstruction(): Optional<CheckTransferInstruction> =
                Optional.ofNullable(
                    checkTransferInstruction.getNullable("check_transfer_instruction")
                )

            /**
             * A Inbound Funds Hold object. This field will be present in the JSON response if and
             * only if `category` is equal to `inbound_funds_hold`.
             */
            fun inboundFundsHold(): Optional<InboundFundsHold> =
                Optional.ofNullable(inboundFundsHold.getNullable("inbound_funds_hold"))

            /**
             * A Deprecated Card Authorization object. This field will be present in the JSON
             * response if and only if `category` is equal to `card_route_authorization`.
             */
            fun cardRouteAuthorization(): Optional<CardRouteAuthorization> =
                Optional.ofNullable(cardRouteAuthorization.getNullable("card_route_authorization"))

            /**
             * A Real Time Payments Transfer Instruction object. This field will be present in the
             * JSON response if and only if `category` is equal to
             * `real_time_payments_transfer_instruction`.
             */
            fun realTimePaymentsTransferInstruction():
                Optional<RealTimePaymentsTransferInstruction> =
                Optional.ofNullable(
                    realTimePaymentsTransferInstruction.getNullable(
                        "real_time_payments_transfer_instruction"
                    )
                )

            /**
             * A Wire Drawdown Payment Instruction object. This field will be present in the JSON
             * response if and only if `category` is equal to `wire_drawdown_payment_instruction`.
             */
            fun wireDrawdownPaymentInstruction(): Optional<WireDrawdownPaymentInstruction> =
                Optional.ofNullable(
                    wireDrawdownPaymentInstruction.getNullable("wire_drawdown_payment_instruction")
                )

            /**
             * A Wire Transfer Instruction object. This field will be present in the JSON response
             * if and only if `category` is equal to `wire_transfer_instruction`.
             */
            fun wireTransferInstruction(): Optional<WireTransferInstruction> =
                Optional.ofNullable(
                    wireTransferInstruction.getNullable("wire_transfer_instruction")
                )

            /**
             * The type of transaction that took place. We may add additional possible values for
             * this enum over time; your application should be able to handle such additions
             * gracefully.
             */
            @JsonProperty("category") @ExcludeMissing fun _category() = category

            /**
             * A Account Transfer Instruction object. This field will be present in the JSON
             * response if and only if `category` is equal to `account_transfer_instruction`.
             */
            @JsonProperty("account_transfer_instruction")
            @ExcludeMissing
            fun _accountTransferInstruction() = accountTransferInstruction

            /**
             * A ACH Transfer Instruction object. This field will be present in the JSON response if
             * and only if `category` is equal to `ach_transfer_instruction`.
             */
            @JsonProperty("ach_transfer_instruction")
            @ExcludeMissing
            fun _achTransferInstruction() = achTransferInstruction

            /**
             * A Card Authorization object. This field will be present in the JSON response if and
             * only if `category` is equal to `card_authorization`.
             */
            @JsonProperty("card_authorization")
            @ExcludeMissing
            fun _cardAuthorization() = cardAuthorization

            /**
             * A Check Deposit Instruction object. This field will be present in the JSON response
             * if and only if `category` is equal to `check_deposit_instruction`.
             */
            @JsonProperty("check_deposit_instruction")
            @ExcludeMissing
            fun _checkDepositInstruction() = checkDepositInstruction

            /**
             * A Check Transfer Instruction object. This field will be present in the JSON response
             * if and only if `category` is equal to `check_transfer_instruction`.
             */
            @JsonProperty("check_transfer_instruction")
            @ExcludeMissing
            fun _checkTransferInstruction() = checkTransferInstruction

            /**
             * A Inbound Funds Hold object. This field will be present in the JSON response if and
             * only if `category` is equal to `inbound_funds_hold`.
             */
            @JsonProperty("inbound_funds_hold")
            @ExcludeMissing
            fun _inboundFundsHold() = inboundFundsHold

            /**
             * A Deprecated Card Authorization object. This field will be present in the JSON
             * response if and only if `category` is equal to `card_route_authorization`.
             */
            @JsonProperty("card_route_authorization")
            @ExcludeMissing
            fun _cardRouteAuthorization() = cardRouteAuthorization

            /**
             * A Real Time Payments Transfer Instruction object. This field will be present in the
             * JSON response if and only if `category` is equal to
             * `real_time_payments_transfer_instruction`.
             */
            @JsonProperty("real_time_payments_transfer_instruction")
            @ExcludeMissing
            fun _realTimePaymentsTransferInstruction() = realTimePaymentsTransferInstruction

            /**
             * A Wire Drawdown Payment Instruction object. This field will be present in the JSON
             * response if and only if `category` is equal to `wire_drawdown_payment_instruction`.
             */
            @JsonProperty("wire_drawdown_payment_instruction")
            @ExcludeMissing
            fun _wireDrawdownPaymentInstruction() = wireDrawdownPaymentInstruction

            /**
             * A Wire Transfer Instruction object. This field will be present in the JSON response
             * if and only if `category` is equal to `wire_transfer_instruction`.
             */
            @JsonProperty("wire_transfer_instruction")
            @ExcludeMissing
            fun _wireTransferInstruction() = wireTransferInstruction

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Source = apply {
                if (!validated) {
                    category()
                    accountTransferInstruction().map { it.validate() }
                    achTransferInstruction().map { it.validate() }
                    cardAuthorization().map { it.validate() }
                    checkDepositInstruction().map { it.validate() }
                    checkTransferInstruction().map { it.validate() }
                    inboundFundsHold().map { it.validate() }
                    cardRouteAuthorization().map { it.validate() }
                    realTimePaymentsTransferInstruction().map { it.validate() }
                    wireDrawdownPaymentInstruction().map { it.validate() }
                    wireTransferInstruction().map { it.validate() }
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
                    this.accountTransferInstruction == other.accountTransferInstruction &&
                    this.achTransferInstruction == other.achTransferInstruction &&
                    this.cardAuthorization == other.cardAuthorization &&
                    this.checkDepositInstruction == other.checkDepositInstruction &&
                    this.checkTransferInstruction == other.checkTransferInstruction &&
                    this.inboundFundsHold == other.inboundFundsHold &&
                    this.cardRouteAuthorization == other.cardRouteAuthorization &&
                    this.realTimePaymentsTransferInstruction ==
                        other.realTimePaymentsTransferInstruction &&
                    this.wireDrawdownPaymentInstruction == other.wireDrawdownPaymentInstruction &&
                    this.wireTransferInstruction == other.wireTransferInstruction &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            category,
                            accountTransferInstruction,
                            achTransferInstruction,
                            cardAuthorization,
                            checkDepositInstruction,
                            checkTransferInstruction,
                            inboundFundsHold,
                            cardRouteAuthorization,
                            realTimePaymentsTransferInstruction,
                            wireDrawdownPaymentInstruction,
                            wireTransferInstruction,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Source{category=$category, accountTransferInstruction=$accountTransferInstruction, achTransferInstruction=$achTransferInstruction, cardAuthorization=$cardAuthorization, checkDepositInstruction=$checkDepositInstruction, checkTransferInstruction=$checkTransferInstruction, inboundFundsHold=$inboundFundsHold, cardRouteAuthorization=$cardRouteAuthorization, realTimePaymentsTransferInstruction=$realTimePaymentsTransferInstruction, wireDrawdownPaymentInstruction=$wireDrawdownPaymentInstruction, wireTransferInstruction=$wireTransferInstruction, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var category: JsonField<Category> = JsonMissing.of()
                private var accountTransferInstruction: JsonField<AccountTransferInstruction> =
                    JsonMissing.of()
                private var achTransferInstruction: JsonField<AchTransferInstruction> =
                    JsonMissing.of()
                private var cardAuthorization: JsonField<CardAuthorization> = JsonMissing.of()
                private var checkDepositInstruction: JsonField<CheckDepositInstruction> =
                    JsonMissing.of()
                private var checkTransferInstruction: JsonField<CheckTransferInstruction> =
                    JsonMissing.of()
                private var inboundFundsHold: JsonField<InboundFundsHold> = JsonMissing.of()
                private var cardRouteAuthorization: JsonField<CardRouteAuthorization> =
                    JsonMissing.of()
                private var realTimePaymentsTransferInstruction:
                    JsonField<RealTimePaymentsTransferInstruction> =
                    JsonMissing.of()
                private var wireDrawdownPaymentInstruction:
                    JsonField<WireDrawdownPaymentInstruction> =
                    JsonMissing.of()
                private var wireTransferInstruction: JsonField<WireTransferInstruction> =
                    JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(source: Source) = apply {
                    this.category = source.category
                    this.accountTransferInstruction = source.accountTransferInstruction
                    this.achTransferInstruction = source.achTransferInstruction
                    this.cardAuthorization = source.cardAuthorization
                    this.checkDepositInstruction = source.checkDepositInstruction
                    this.checkTransferInstruction = source.checkTransferInstruction
                    this.inboundFundsHold = source.inboundFundsHold
                    this.cardRouteAuthorization = source.cardRouteAuthorization
                    this.realTimePaymentsTransferInstruction =
                        source.realTimePaymentsTransferInstruction
                    this.wireDrawdownPaymentInstruction = source.wireDrawdownPaymentInstruction
                    this.wireTransferInstruction = source.wireTransferInstruction
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
                 * A Account Transfer Instruction object. This field will be present in the JSON
                 * response if and only if `category` is equal to `account_transfer_instruction`.
                 */
                fun accountTransferInstruction(
                    accountTransferInstruction: AccountTransferInstruction
                ) = accountTransferInstruction(JsonField.of(accountTransferInstruction))

                /**
                 * A Account Transfer Instruction object. This field will be present in the JSON
                 * response if and only if `category` is equal to `account_transfer_instruction`.
                 */
                @JsonProperty("account_transfer_instruction")
                @ExcludeMissing
                fun accountTransferInstruction(
                    accountTransferInstruction: JsonField<AccountTransferInstruction>
                ) = apply { this.accountTransferInstruction = accountTransferInstruction }

                /**
                 * A ACH Transfer Instruction object. This field will be present in the JSON
                 * response if and only if `category` is equal to `ach_transfer_instruction`.
                 */
                fun achTransferInstruction(achTransferInstruction: AchTransferInstruction) =
                    achTransferInstruction(JsonField.of(achTransferInstruction))

                /**
                 * A ACH Transfer Instruction object. This field will be present in the JSON
                 * response if and only if `category` is equal to `ach_transfer_instruction`.
                 */
                @JsonProperty("ach_transfer_instruction")
                @ExcludeMissing
                fun achTransferInstruction(
                    achTransferInstruction: JsonField<AchTransferInstruction>
                ) = apply { this.achTransferInstruction = achTransferInstruction }

                /**
                 * A Card Authorization object. This field will be present in the JSON response if
                 * and only if `category` is equal to `card_authorization`.
                 */
                fun cardAuthorization(cardAuthorization: CardAuthorization) =
                    cardAuthorization(JsonField.of(cardAuthorization))

                /**
                 * A Card Authorization object. This field will be present in the JSON response if
                 * and only if `category` is equal to `card_authorization`.
                 */
                @JsonProperty("card_authorization")
                @ExcludeMissing
                fun cardAuthorization(cardAuthorization: JsonField<CardAuthorization>) = apply {
                    this.cardAuthorization = cardAuthorization
                }

                /**
                 * A Check Deposit Instruction object. This field will be present in the JSON
                 * response if and only if `category` is equal to `check_deposit_instruction`.
                 */
                fun checkDepositInstruction(checkDepositInstruction: CheckDepositInstruction) =
                    checkDepositInstruction(JsonField.of(checkDepositInstruction))

                /**
                 * A Check Deposit Instruction object. This field will be present in the JSON
                 * response if and only if `category` is equal to `check_deposit_instruction`.
                 */
                @JsonProperty("check_deposit_instruction")
                @ExcludeMissing
                fun checkDepositInstruction(
                    checkDepositInstruction: JsonField<CheckDepositInstruction>
                ) = apply { this.checkDepositInstruction = checkDepositInstruction }

                /**
                 * A Check Transfer Instruction object. This field will be present in the JSON
                 * response if and only if `category` is equal to `check_transfer_instruction`.
                 */
                fun checkTransferInstruction(checkTransferInstruction: CheckTransferInstruction) =
                    checkTransferInstruction(JsonField.of(checkTransferInstruction))

                /**
                 * A Check Transfer Instruction object. This field will be present in the JSON
                 * response if and only if `category` is equal to `check_transfer_instruction`.
                 */
                @JsonProperty("check_transfer_instruction")
                @ExcludeMissing
                fun checkTransferInstruction(
                    checkTransferInstruction: JsonField<CheckTransferInstruction>
                ) = apply { this.checkTransferInstruction = checkTransferInstruction }

                /**
                 * A Inbound Funds Hold object. This field will be present in the JSON response if
                 * and only if `category` is equal to `inbound_funds_hold`.
                 */
                fun inboundFundsHold(inboundFundsHold: InboundFundsHold) =
                    inboundFundsHold(JsonField.of(inboundFundsHold))

                /**
                 * A Inbound Funds Hold object. This field will be present in the JSON response if
                 * and only if `category` is equal to `inbound_funds_hold`.
                 */
                @JsonProperty("inbound_funds_hold")
                @ExcludeMissing
                fun inboundFundsHold(inboundFundsHold: JsonField<InboundFundsHold>) = apply {
                    this.inboundFundsHold = inboundFundsHold
                }

                /**
                 * A Deprecated Card Authorization object. This field will be present in the JSON
                 * response if and only if `category` is equal to `card_route_authorization`.
                 */
                fun cardRouteAuthorization(cardRouteAuthorization: CardRouteAuthorization) =
                    cardRouteAuthorization(JsonField.of(cardRouteAuthorization))

                /**
                 * A Deprecated Card Authorization object. This field will be present in the JSON
                 * response if and only if `category` is equal to `card_route_authorization`.
                 */
                @JsonProperty("card_route_authorization")
                @ExcludeMissing
                fun cardRouteAuthorization(
                    cardRouteAuthorization: JsonField<CardRouteAuthorization>
                ) = apply { this.cardRouteAuthorization = cardRouteAuthorization }

                /**
                 * A Real Time Payments Transfer Instruction object. This field will be present in
                 * the JSON response if and only if `category` is equal to
                 * `real_time_payments_transfer_instruction`.
                 */
                fun realTimePaymentsTransferInstruction(
                    realTimePaymentsTransferInstruction: RealTimePaymentsTransferInstruction
                ) =
                    realTimePaymentsTransferInstruction(
                        JsonField.of(realTimePaymentsTransferInstruction)
                    )

                /**
                 * A Real Time Payments Transfer Instruction object. This field will be present in
                 * the JSON response if and only if `category` is equal to
                 * `real_time_payments_transfer_instruction`.
                 */
                @JsonProperty("real_time_payments_transfer_instruction")
                @ExcludeMissing
                fun realTimePaymentsTransferInstruction(
                    realTimePaymentsTransferInstruction:
                        JsonField<RealTimePaymentsTransferInstruction>
                ) = apply {
                    this.realTimePaymentsTransferInstruction = realTimePaymentsTransferInstruction
                }

                /**
                 * A Wire Drawdown Payment Instruction object. This field will be present in the
                 * JSON response if and only if `category` is equal to
                 * `wire_drawdown_payment_instruction`.
                 */
                fun wireDrawdownPaymentInstruction(
                    wireDrawdownPaymentInstruction: WireDrawdownPaymentInstruction
                ) = wireDrawdownPaymentInstruction(JsonField.of(wireDrawdownPaymentInstruction))

                /**
                 * A Wire Drawdown Payment Instruction object. This field will be present in the
                 * JSON response if and only if `category` is equal to
                 * `wire_drawdown_payment_instruction`.
                 */
                @JsonProperty("wire_drawdown_payment_instruction")
                @ExcludeMissing
                fun wireDrawdownPaymentInstruction(
                    wireDrawdownPaymentInstruction: JsonField<WireDrawdownPaymentInstruction>
                ) = apply { this.wireDrawdownPaymentInstruction = wireDrawdownPaymentInstruction }

                /**
                 * A Wire Transfer Instruction object. This field will be present in the JSON
                 * response if and only if `category` is equal to `wire_transfer_instruction`.
                 */
                fun wireTransferInstruction(wireTransferInstruction: WireTransferInstruction) =
                    wireTransferInstruction(JsonField.of(wireTransferInstruction))

                /**
                 * A Wire Transfer Instruction object. This field will be present in the JSON
                 * response if and only if `category` is equal to `wire_transfer_instruction`.
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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Source =
                    Source(
                        category,
                        accountTransferInstruction,
                        achTransferInstruction,
                        cardAuthorization,
                        checkDepositInstruction,
                        checkTransferInstruction,
                        inboundFundsHold,
                        cardRouteAuthorization,
                        realTimePaymentsTransferInstruction,
                        wireDrawdownPaymentInstruction,
                        wireTransferInstruction,
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
                    val ACCOUNT_TRANSFER_INSTRUCTION =
                        Category(JsonField.of("account_transfer_instruction"))

                    @JvmField
                    val ACH_TRANSFER_INSTRUCTION =
                        Category(JsonField.of("ach_transfer_instruction"))

                    @JvmField val CARD_AUTHORIZATION = Category(JsonField.of("card_authorization"))

                    @JvmField
                    val CHECK_DEPOSIT_INSTRUCTION =
                        Category(JsonField.of("check_deposit_instruction"))

                    @JvmField
                    val CHECK_TRANSFER_INSTRUCTION =
                        Category(JsonField.of("check_transfer_instruction"))

                    @JvmField val INBOUND_FUNDS_HOLD = Category(JsonField.of("inbound_funds_hold"))

                    @JvmField
                    val CARD_ROUTE_AUTHORIZATION =
                        Category(JsonField.of("card_route_authorization"))

                    @JvmField
                    val REAL_TIME_PAYMENTS_TRANSFER_INSTRUCTION =
                        Category(JsonField.of("real_time_payments_transfer_instruction"))

                    @JvmField
                    val WIRE_DRAWDOWN_PAYMENT_INSTRUCTION =
                        Category(JsonField.of("wire_drawdown_payment_instruction"))

                    @JvmField
                    val WIRE_TRANSFER_INSTRUCTION =
                        Category(JsonField.of("wire_transfer_instruction"))

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
                    CARD_ROUTE_AUTHORIZATION,
                    REAL_TIME_PAYMENTS_TRANSFER_INSTRUCTION,
                    WIRE_DRAWDOWN_PAYMENT_INSTRUCTION,
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
                    CARD_ROUTE_AUTHORIZATION,
                    REAL_TIME_PAYMENTS_TRANSFER_INSTRUCTION,
                    WIRE_DRAWDOWN_PAYMENT_INSTRUCTION,
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
                        CARD_ROUTE_AUTHORIZATION -> Value.CARD_ROUTE_AUTHORIZATION
                        REAL_TIME_PAYMENTS_TRANSFER_INSTRUCTION ->
                            Value.REAL_TIME_PAYMENTS_TRANSFER_INSTRUCTION
                        WIRE_DRAWDOWN_PAYMENT_INSTRUCTION -> Value.WIRE_DRAWDOWN_PAYMENT_INSTRUCTION
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
                        CARD_ROUTE_AUTHORIZATION -> Known.CARD_ROUTE_AUTHORIZATION
                        REAL_TIME_PAYMENTS_TRANSFER_INSTRUCTION ->
                            Known.REAL_TIME_PAYMENTS_TRANSFER_INSTRUCTION
                        WIRE_DRAWDOWN_PAYMENT_INSTRUCTION -> Known.WIRE_DRAWDOWN_PAYMENT_INSTRUCTION
                        WIRE_TRANSFER_INSTRUCTION -> Known.WIRE_TRANSFER_INSTRUCTION
                        OTHER -> Known.OTHER
                        else -> throw IncreaseInvalidDataException("Unknown Category: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            /**
             * A Account Transfer Instruction object. This field will be present in the JSON
             * response if and only if `category` is equal to `account_transfer_instruction`.
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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is AccountTransferInstruction &&
                        this.amount == other.amount &&
                        this.currency == other.currency &&
                        this.transferId == other.transferId &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                amount,
                                currency,
                                transferId,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "AccountTransferInstruction{amount=$amount, currency=$currency, transferId=$transferId, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var amount: JsonField<Long> = JsonMissing.of()
                    private var currency: JsonField<Currency> = JsonMissing.of()
                    private var transferId: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(accountTransferInstruction: AccountTransferInstruction) =
                        apply {
                            this.amount = accountTransferInstruction.amount
                            this.currency = accountTransferInstruction.currency
                            this.transferId = accountTransferInstruction.transferId
                            additionalProperties(accountTransferInstruction.additionalProperties)
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
             * A ACH Transfer Instruction object. This field will be present in the JSON response if
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

                private var hashCode: Int = 0

                /**
                 * The pending amount in the minor unit of the transaction's currency. For dollars,
                 * for example, this is cents.
                 */
                fun amount(): Long = amount.getRequired("amount")

                /** The identifier of the ACH Transfer that led to this Pending Transaction. */
                fun transferId(): String = transferId.getRequired("transfer_id")

                /**
                 * The pending amount in the minor unit of the transaction's currency. For dollars,
                 * for example, this is cents.
                 */
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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is AchTransferInstruction &&
                        this.amount == other.amount &&
                        this.transferId == other.transferId &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                amount,
                                transferId,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "AchTransferInstruction{amount=$amount, transferId=$transferId, additionalProperties=$additionalProperties}"

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
            }

            /**
             * A Card Authorization object. This field will be present in the JSON response if and
             * only if `category` is equal to `card_authorization`.
             */
            @JsonDeserialize(builder = CardAuthorization.Builder::class)
            @NoAutoDetect
            class CardAuthorization
            private constructor(
                private val id: JsonField<String>,
                private val merchantAcceptorId: JsonField<String>,
                private val merchantDescriptor: JsonField<String>,
                private val merchantCategoryCode: JsonField<String>,
                private val merchantCity: JsonField<String>,
                private val merchantCountry: JsonField<String>,
                private val network: JsonField<Network>,
                private val networkDetails: JsonField<NetworkDetails>,
                private val amount: JsonField<Long>,
                private val currency: JsonField<Currency>,
                private val expiresAt: JsonField<OffsetDateTime>,
                private val realTimeDecisionId: JsonField<String>,
                private val digitalWalletTokenId: JsonField<String>,
                private val pendingTransactionId: JsonField<String>,
                private val type: JsonField<Type>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /** The Card Authorization identifier. */
                fun id(): String = id.getRequired("id")

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
                 * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) when this authorization
                 * will expire and the pending transaction will be released.
                 */
                fun expiresAt(): OffsetDateTime = expiresAt.getRequired("expires_at")

                /**
                 * The identifier of the Real-Time Decision sent to approve or decline this
                 * transaction.
                 */
                fun realTimeDecisionId(): Optional<String> =
                    Optional.ofNullable(realTimeDecisionId.getNullable("real_time_decision_id"))

                /**
                 * If the authorization was made via a Digital Wallet Token (such as an Apple Pay
                 * purchase), the identifier of the token that was used.
                 */
                fun digitalWalletTokenId(): Optional<String> =
                    Optional.ofNullable(digitalWalletTokenId.getNullable("digital_wallet_token_id"))

                /** The identifier of the Pending Transaction associated with this Transaction. */
                fun pendingTransactionId(): Optional<String> =
                    Optional.ofNullable(pendingTransactionId.getNullable("pending_transaction_id"))

                /**
                 * A constant representing the object's type. For this resource it will always be
                 * `card_authorization`.
                 */
                fun type(): Type = type.getRequired("type")

                /** The Card Authorization identifier. */
                @JsonProperty("id") @ExcludeMissing fun _id() = id

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
                 * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) when this authorization
                 * will expire and the pending transaction will be released.
                 */
                @JsonProperty("expires_at") @ExcludeMissing fun _expiresAt() = expiresAt

                /**
                 * The identifier of the Real-Time Decision sent to approve or decline this
                 * transaction.
                 */
                @JsonProperty("real_time_decision_id")
                @ExcludeMissing
                fun _realTimeDecisionId() = realTimeDecisionId

                /**
                 * If the authorization was made via a Digital Wallet Token (such as an Apple Pay
                 * purchase), the identifier of the token that was used.
                 */
                @JsonProperty("digital_wallet_token_id")
                @ExcludeMissing
                fun _digitalWalletTokenId() = digitalWalletTokenId

                /** The identifier of the Pending Transaction associated with this Transaction. */
                @JsonProperty("pending_transaction_id")
                @ExcludeMissing
                fun _pendingTransactionId() = pendingTransactionId

                /**
                 * A constant representing the object's type. For this resource it will always be
                 * `card_authorization`.
                 */
                @JsonProperty("type") @ExcludeMissing fun _type() = type

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): CardAuthorization = apply {
                    if (!validated) {
                        id()
                        merchantAcceptorId()
                        merchantDescriptor()
                        merchantCategoryCode()
                        merchantCity()
                        merchantCountry()
                        network()
                        networkDetails().validate()
                        amount()
                        currency()
                        expiresAt()
                        realTimeDecisionId()
                        digitalWalletTokenId()
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

                    return other is CardAuthorization &&
                        this.id == other.id &&
                        this.merchantAcceptorId == other.merchantAcceptorId &&
                        this.merchantDescriptor == other.merchantDescriptor &&
                        this.merchantCategoryCode == other.merchantCategoryCode &&
                        this.merchantCity == other.merchantCity &&
                        this.merchantCountry == other.merchantCountry &&
                        this.network == other.network &&
                        this.networkDetails == other.networkDetails &&
                        this.amount == other.amount &&
                        this.currency == other.currency &&
                        this.expiresAt == other.expiresAt &&
                        this.realTimeDecisionId == other.realTimeDecisionId &&
                        this.digitalWalletTokenId == other.digitalWalletTokenId &&
                        this.pendingTransactionId == other.pendingTransactionId &&
                        this.type == other.type &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                id,
                                merchantAcceptorId,
                                merchantDescriptor,
                                merchantCategoryCode,
                                merchantCity,
                                merchantCountry,
                                network,
                                networkDetails,
                                amount,
                                currency,
                                expiresAt,
                                realTimeDecisionId,
                                digitalWalletTokenId,
                                pendingTransactionId,
                                type,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "CardAuthorization{id=$id, merchantAcceptorId=$merchantAcceptorId, merchantDescriptor=$merchantDescriptor, merchantCategoryCode=$merchantCategoryCode, merchantCity=$merchantCity, merchantCountry=$merchantCountry, network=$network, networkDetails=$networkDetails, amount=$amount, currency=$currency, expiresAt=$expiresAt, realTimeDecisionId=$realTimeDecisionId, digitalWalletTokenId=$digitalWalletTokenId, pendingTransactionId=$pendingTransactionId, type=$type, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var id: JsonField<String> = JsonMissing.of()
                    private var merchantAcceptorId: JsonField<String> = JsonMissing.of()
                    private var merchantDescriptor: JsonField<String> = JsonMissing.of()
                    private var merchantCategoryCode: JsonField<String> = JsonMissing.of()
                    private var merchantCity: JsonField<String> = JsonMissing.of()
                    private var merchantCountry: JsonField<String> = JsonMissing.of()
                    private var network: JsonField<Network> = JsonMissing.of()
                    private var networkDetails: JsonField<NetworkDetails> = JsonMissing.of()
                    private var amount: JsonField<Long> = JsonMissing.of()
                    private var currency: JsonField<Currency> = JsonMissing.of()
                    private var expiresAt: JsonField<OffsetDateTime> = JsonMissing.of()
                    private var realTimeDecisionId: JsonField<String> = JsonMissing.of()
                    private var digitalWalletTokenId: JsonField<String> = JsonMissing.of()
                    private var pendingTransactionId: JsonField<String> = JsonMissing.of()
                    private var type: JsonField<Type> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(cardAuthorization: CardAuthorization) = apply {
                        this.id = cardAuthorization.id
                        this.merchantAcceptorId = cardAuthorization.merchantAcceptorId
                        this.merchantDescriptor = cardAuthorization.merchantDescriptor
                        this.merchantCategoryCode = cardAuthorization.merchantCategoryCode
                        this.merchantCity = cardAuthorization.merchantCity
                        this.merchantCountry = cardAuthorization.merchantCountry
                        this.network = cardAuthorization.network
                        this.networkDetails = cardAuthorization.networkDetails
                        this.amount = cardAuthorization.amount
                        this.currency = cardAuthorization.currency
                        this.expiresAt = cardAuthorization.expiresAt
                        this.realTimeDecisionId = cardAuthorization.realTimeDecisionId
                        this.digitalWalletTokenId = cardAuthorization.digitalWalletTokenId
                        this.pendingTransactionId = cardAuthorization.pendingTransactionId
                        this.type = cardAuthorization.type
                        additionalProperties(cardAuthorization.additionalProperties)
                    }

                    /** The Card Authorization identifier. */
                    fun id(id: String) = id(JsonField.of(id))

                    /** The Card Authorization identifier. */
                    @JsonProperty("id")
                    @ExcludeMissing
                    fun id(id: JsonField<String>) = apply { this.id = id }

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
                     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) when this
                     * authorization will expire and the pending transaction will be released.
                     */
                    fun expiresAt(expiresAt: OffsetDateTime) = expiresAt(JsonField.of(expiresAt))

                    /**
                     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) when this
                     * authorization will expire and the pending transaction will be released.
                     */
                    @JsonProperty("expires_at")
                    @ExcludeMissing
                    fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply {
                        this.expiresAt = expiresAt
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
                     * If the authorization was made via a Digital Wallet Token (such as an Apple
                     * Pay purchase), the identifier of the token that was used.
                     */
                    fun digitalWalletTokenId(digitalWalletTokenId: String) =
                        digitalWalletTokenId(JsonField.of(digitalWalletTokenId))

                    /**
                     * If the authorization was made via a Digital Wallet Token (such as an Apple
                     * Pay purchase), the identifier of the token that was used.
                     */
                    @JsonProperty("digital_wallet_token_id")
                    @ExcludeMissing
                    fun digitalWalletTokenId(digitalWalletTokenId: JsonField<String>) = apply {
                        this.digitalWalletTokenId = digitalWalletTokenId
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
                     * be `card_authorization`.
                     */
                    fun type(type: Type) = type(JsonField.of(type))

                    /**
                     * A constant representing the object's type. For this resource it will always
                     * be `card_authorization`.
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

                    fun build(): CardAuthorization =
                        CardAuthorization(
                            id,
                            merchantAcceptorId,
                            merchantDescriptor,
                            merchantCategoryCode,
                            merchantCity,
                            merchantCountry,
                            network,
                            networkDetails,
                            amount,
                            currency,
                            expiresAt,
                            realTimeDecisionId,
                            digitalWalletTokenId,
                            pendingTransactionId,
                            type,
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

                    fun validate(): NetworkDetails = apply {
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

                        fun validate(): Visa = apply {
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
            }

            /**
             * A Check Deposit Instruction object. This field will be present in the JSON response
             * if and only if `category` is equal to `check_deposit_instruction`.
             */
            @JsonDeserialize(builder = CheckDepositInstruction.Builder::class)
            @NoAutoDetect
            class CheckDepositInstruction
            private constructor(
                private val amount: JsonField<Long>,
                private val currency: JsonField<Currency>,
                private val frontImageFileId: JsonField<String>,
                private val backImageFileId: JsonField<String>,
                private val checkDepositId: JsonField<String>,
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
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
                 * currency.
                 */
                fun currency(): Currency = currency.getRequired("currency")

                /**
                 * The identifier of the File containing the image of the front of the check that
                 * was deposited.
                 */
                fun frontImageFileId(): String = frontImageFileId.getRequired("front_image_file_id")

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
                 * The identifier of the File containing the image of the front of the check that
                 * was deposited.
                 */
                @JsonProperty("front_image_file_id")
                @ExcludeMissing
                fun _frontImageFileId() = frontImageFileId

                /**
                 * The identifier of the File containing the image of the back of the check that was
                 * deposited.
                 */
                @JsonProperty("back_image_file_id")
                @ExcludeMissing
                fun _backImageFileId() = backImageFileId

                /** The identifier of the Check Deposit. */
                @JsonProperty("check_deposit_id")
                @ExcludeMissing
                fun _checkDepositId() = checkDepositId

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): CheckDepositInstruction = apply {
                    if (!validated) {
                        amount()
                        currency()
                        frontImageFileId()
                        backImageFileId()
                        checkDepositId()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is CheckDepositInstruction &&
                        this.amount == other.amount &&
                        this.currency == other.currency &&
                        this.frontImageFileId == other.frontImageFileId &&
                        this.backImageFileId == other.backImageFileId &&
                        this.checkDepositId == other.checkDepositId &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                amount,
                                currency,
                                frontImageFileId,
                                backImageFileId,
                                checkDepositId,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "CheckDepositInstruction{amount=$amount, currency=$currency, frontImageFileId=$frontImageFileId, backImageFileId=$backImageFileId, checkDepositId=$checkDepositId, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var amount: JsonField<Long> = JsonMissing.of()
                    private var currency: JsonField<Currency> = JsonMissing.of()
                    private var frontImageFileId: JsonField<String> = JsonMissing.of()
                    private var backImageFileId: JsonField<String> = JsonMissing.of()
                    private var checkDepositId: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(checkDepositInstruction: CheckDepositInstruction) = apply {
                        this.amount = checkDepositInstruction.amount
                        this.currency = checkDepositInstruction.currency
                        this.frontImageFileId = checkDepositInstruction.frontImageFileId
                        this.backImageFileId = checkDepositInstruction.backImageFileId
                        this.checkDepositId = checkDepositInstruction.checkDepositId
                        additionalProperties(checkDepositInstruction.additionalProperties)
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
                     * The identifier of the File containing the image of the front of the check
                     * that was deposited.
                     */
                    fun frontImageFileId(frontImageFileId: String) =
                        frontImageFileId(JsonField.of(frontImageFileId))

                    /**
                     * The identifier of the File containing the image of the front of the check
                     * that was deposited.
                     */
                    @JsonProperty("front_image_file_id")
                    @ExcludeMissing
                    fun frontImageFileId(frontImageFileId: JsonField<String>) = apply {
                        this.frontImageFileId = frontImageFileId
                    }

                    /**
                     * The identifier of the File containing the image of the back of the check that
                     * was deposited.
                     */
                    fun backImageFileId(backImageFileId: String) =
                        backImageFileId(JsonField.of(backImageFileId))

                    /**
                     * The identifier of the File containing the image of the back of the check that
                     * was deposited.
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
                            currency,
                            frontImageFileId,
                            backImageFileId,
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
             * A Check Transfer Instruction object. This field will be present in the JSON response
             * if and only if `category` is equal to `check_transfer_instruction`.
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

                private var hashCode: Int = 0

                /**
                 * The pending amount in the minor unit of the transaction's currency. For dollars,
                 * for example, this is cents.
                 */
                fun amount(): Long = amount.getRequired("amount")

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the check's
                 * currency.
                 */
                fun currency(): Currency = currency.getRequired("currency")

                /** The identifier of the Check Transfer that led to this Pending Transaction. */
                fun transferId(): String = transferId.getRequired("transfer_id")

                /**
                 * The pending amount in the minor unit of the transaction's currency. For dollars,
                 * for example, this is cents.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the check's
                 * currency.
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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is CheckTransferInstruction &&
                        this.amount == other.amount &&
                        this.currency == other.currency &&
                        this.transferId == other.transferId &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                amount,
                                currency,
                                transferId,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "CheckTransferInstruction{amount=$amount, currency=$currency, transferId=$transferId, additionalProperties=$additionalProperties}"

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

                    /**
                     * The identifier of the Check Transfer that led to this Pending Transaction.
                     */
                    fun transferId(transferId: String) = transferId(JsonField.of(transferId))

                    /**
                     * The identifier of the Check Transfer that led to this Pending Transaction.
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
             * A Inbound Funds Hold object. This field will be present in the JSON response if and
             * only if `category` is equal to `inbound_funds_hold`.
             */
            @JsonDeserialize(builder = InboundFundsHold.Builder::class)
            @NoAutoDetect
            class InboundFundsHold
            private constructor(
                private val amount: JsonField<Long>,
                private val createdAt: JsonField<OffsetDateTime>,
                private val currency: JsonField<Currency>,
                private val automaticallyReleasesAt: JsonField<OffsetDateTime>,
                private val releasedAt: JsonField<OffsetDateTime>,
                private val status: JsonField<Status>,
                private val heldTransactionId: JsonField<String>,
                private val pendingTransactionId: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /**
                 * The held amount in the minor unit of the account's currency. For dollars, for
                 * example, this is cents.
                 */
                fun amount(): Long = amount.getRequired("amount")

                /**
                 * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the hold was
                 * created.
                 */
                fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the hold's
                 * currency.
                 */
                fun currency(): Currency = currency.getRequired("currency")

                /**
                 * When the hold will be released automatically. Certain conditions may cause it to
                 * be released before this time.
                 */
                fun automaticallyReleasesAt(): OffsetDateTime =
                    automaticallyReleasesAt.getRequired("automatically_releases_at")

                /** When the hold was released (if it has been released). */
                fun releasedAt(): Optional<OffsetDateTime> =
                    Optional.ofNullable(releasedAt.getNullable("released_at"))

                /** The status of the hold. */
                fun status(): Status = status.getRequired("status")

                /** The ID of the Transaction for which funds were held. */
                fun heldTransactionId(): Optional<String> =
                    Optional.ofNullable(heldTransactionId.getNullable("held_transaction_id"))

                /** The ID of the Pending Transaction representing the held funds. */
                fun pendingTransactionId(): Optional<String> =
                    Optional.ofNullable(pendingTransactionId.getNullable("pending_transaction_id"))

                /**
                 * The held amount in the minor unit of the account's currency. For dollars, for
                 * example, this is cents.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

                /**
                 * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the hold was
                 * created.
                 */
                @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the hold's
                 * currency.
                 */
                @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

                /**
                 * When the hold will be released automatically. Certain conditions may cause it to
                 * be released before this time.
                 */
                @JsonProperty("automatically_releases_at")
                @ExcludeMissing
                fun _automaticallyReleasesAt() = automaticallyReleasesAt

                /** When the hold was released (if it has been released). */
                @JsonProperty("released_at") @ExcludeMissing fun _releasedAt() = releasedAt

                /** The status of the hold. */
                @JsonProperty("status") @ExcludeMissing fun _status() = status

                /** The ID of the Transaction for which funds were held. */
                @JsonProperty("held_transaction_id")
                @ExcludeMissing
                fun _heldTransactionId() = heldTransactionId

                /** The ID of the Pending Transaction representing the held funds. */
                @JsonProperty("pending_transaction_id")
                @ExcludeMissing
                fun _pendingTransactionId() = pendingTransactionId

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): InboundFundsHold = apply {
                    if (!validated) {
                        amount()
                        createdAt()
                        currency()
                        automaticallyReleasesAt()
                        releasedAt()
                        status()
                        heldTransactionId()
                        pendingTransactionId()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is InboundFundsHold &&
                        this.amount == other.amount &&
                        this.createdAt == other.createdAt &&
                        this.currency == other.currency &&
                        this.automaticallyReleasesAt == other.automaticallyReleasesAt &&
                        this.releasedAt == other.releasedAt &&
                        this.status == other.status &&
                        this.heldTransactionId == other.heldTransactionId &&
                        this.pendingTransactionId == other.pendingTransactionId &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                amount,
                                createdAt,
                                currency,
                                automaticallyReleasesAt,
                                releasedAt,
                                status,
                                heldTransactionId,
                                pendingTransactionId,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "InboundFundsHold{amount=$amount, createdAt=$createdAt, currency=$currency, automaticallyReleasesAt=$automaticallyReleasesAt, releasedAt=$releasedAt, status=$status, heldTransactionId=$heldTransactionId, pendingTransactionId=$pendingTransactionId, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var amount: JsonField<Long> = JsonMissing.of()
                    private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
                    private var currency: JsonField<Currency> = JsonMissing.of()
                    private var automaticallyReleasesAt: JsonField<OffsetDateTime> =
                        JsonMissing.of()
                    private var releasedAt: JsonField<OffsetDateTime> = JsonMissing.of()
                    private var status: JsonField<Status> = JsonMissing.of()
                    private var heldTransactionId: JsonField<String> = JsonMissing.of()
                    private var pendingTransactionId: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(inboundFundsHold: InboundFundsHold) = apply {
                        this.amount = inboundFundsHold.amount
                        this.createdAt = inboundFundsHold.createdAt
                        this.currency = inboundFundsHold.currency
                        this.automaticallyReleasesAt = inboundFundsHold.automaticallyReleasesAt
                        this.releasedAt = inboundFundsHold.releasedAt
                        this.status = inboundFundsHold.status
                        this.heldTransactionId = inboundFundsHold.heldTransactionId
                        this.pendingTransactionId = inboundFundsHold.pendingTransactionId
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
                     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the hold
                     * was created.
                     */
                    fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

                    /**
                     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the hold
                     * was created.
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

                    /**
                     * When the hold will be released automatically. Certain conditions may cause it
                     * to be released before this time.
                     */
                    fun automaticallyReleasesAt(automaticallyReleasesAt: OffsetDateTime) =
                        automaticallyReleasesAt(JsonField.of(automaticallyReleasesAt))

                    /**
                     * When the hold will be released automatically. Certain conditions may cause it
                     * to be released before this time.
                     */
                    @JsonProperty("automatically_releases_at")
                    @ExcludeMissing
                    fun automaticallyReleasesAt(
                        automaticallyReleasesAt: JsonField<OffsetDateTime>
                    ) = apply { this.automaticallyReleasesAt = automaticallyReleasesAt }

                    /** When the hold was released (if it has been released). */
                    fun releasedAt(releasedAt: OffsetDateTime) =
                        releasedAt(JsonField.of(releasedAt))

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

                    /** The ID of the Transaction for which funds were held. */
                    fun heldTransactionId(heldTransactionId: String) =
                        heldTransactionId(JsonField.of(heldTransactionId))

                    /** The ID of the Transaction for which funds were held. */
                    @JsonProperty("held_transaction_id")
                    @ExcludeMissing
                    fun heldTransactionId(heldTransactionId: JsonField<String>) = apply {
                        this.heldTransactionId = heldTransactionId
                    }

                    /** The ID of the Pending Transaction representing the held funds. */
                    fun pendingTransactionId(pendingTransactionId: String) =
                        pendingTransactionId(JsonField.of(pendingTransactionId))

                    /** The ID of the Pending Transaction representing the held funds. */
                    @JsonProperty("pending_transaction_id")
                    @ExcludeMissing
                    fun pendingTransactionId(pendingTransactionId: JsonField<String>) = apply {
                        this.pendingTransactionId = pendingTransactionId
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

                    fun build(): InboundFundsHold =
                        InboundFundsHold(
                            amount,
                            createdAt,
                            currency,
                            automaticallyReleasesAt,
                            releasedAt,
                            status,
                            heldTransactionId,
                            pendingTransactionId,
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

                class Status
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

                        return other is Status && this.value == other.value
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
            }

            /**
             * A Deprecated Card Authorization object. This field will be present in the JSON
             * response if and only if `category` is equal to `card_route_authorization`.
             */
            @JsonDeserialize(builder = CardRouteAuthorization.Builder::class)
            @NoAutoDetect
            class CardRouteAuthorization
            private constructor(
                private val amount: JsonField<Long>,
                private val currency: JsonField<Currency>,
                private val merchantAcceptorId: JsonField<String>,
                private val merchantCity: JsonField<String>,
                private val merchantCountry: JsonField<String>,
                private val merchantDescriptor: JsonField<String>,
                private val merchantCategoryCode: JsonField<String>,
                private val merchantState: JsonField<String>,
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
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
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

                fun merchantCategoryCode(): String =
                    merchantCategoryCode.getRequired("merchant_category_code")

                fun merchantState(): Optional<String> =
                    Optional.ofNullable(merchantState.getNullable("merchant_state"))

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

                @JsonProperty("merchant_category_code")
                @ExcludeMissing
                fun _merchantCategoryCode() = merchantCategoryCode

                @JsonProperty("merchant_state") @ExcludeMissing fun _merchantState() = merchantState

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): CardRouteAuthorization = apply {
                    if (!validated) {
                        amount()
                        currency()
                        merchantAcceptorId()
                        merchantCity()
                        merchantCountry()
                        merchantDescriptor()
                        merchantCategoryCode()
                        merchantState()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is CardRouteAuthorization &&
                        this.amount == other.amount &&
                        this.currency == other.currency &&
                        this.merchantAcceptorId == other.merchantAcceptorId &&
                        this.merchantCity == other.merchantCity &&
                        this.merchantCountry == other.merchantCountry &&
                        this.merchantDescriptor == other.merchantDescriptor &&
                        this.merchantCategoryCode == other.merchantCategoryCode &&
                        this.merchantState == other.merchantState &&
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
                                merchantCategoryCode,
                                merchantState,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "CardRouteAuthorization{amount=$amount, currency=$currency, merchantAcceptorId=$merchantAcceptorId, merchantCity=$merchantCity, merchantCountry=$merchantCountry, merchantDescriptor=$merchantDescriptor, merchantCategoryCode=$merchantCategoryCode, merchantState=$merchantState, additionalProperties=$additionalProperties}"

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
                    private var merchantCategoryCode: JsonField<String> = JsonMissing.of()
                    private var merchantState: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(cardRouteAuthorization: CardRouteAuthorization) = apply {
                        this.amount = cardRouteAuthorization.amount
                        this.currency = cardRouteAuthorization.currency
                        this.merchantAcceptorId = cardRouteAuthorization.merchantAcceptorId
                        this.merchantCity = cardRouteAuthorization.merchantCity
                        this.merchantCountry = cardRouteAuthorization.merchantCountry
                        this.merchantDescriptor = cardRouteAuthorization.merchantDescriptor
                        this.merchantCategoryCode = cardRouteAuthorization.merchantCategoryCode
                        this.merchantState = cardRouteAuthorization.merchantState
                        additionalProperties(cardRouteAuthorization.additionalProperties)
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

                    fun merchantCategoryCode(merchantCategoryCode: String) =
                        merchantCategoryCode(JsonField.of(merchantCategoryCode))

                    @JsonProperty("merchant_category_code")
                    @ExcludeMissing
                    fun merchantCategoryCode(merchantCategoryCode: JsonField<String>) = apply {
                        this.merchantCategoryCode = merchantCategoryCode
                    }

                    fun merchantState(merchantState: String) =
                        merchantState(JsonField.of(merchantState))

                    @JsonProperty("merchant_state")
                    @ExcludeMissing
                    fun merchantState(merchantState: JsonField<String>) = apply {
                        this.merchantState = merchantState
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

                    fun build(): CardRouteAuthorization =
                        CardRouteAuthorization(
                            amount,
                            currency,
                            merchantAcceptorId,
                            merchantCity,
                            merchantCountry,
                            merchantDescriptor,
                            merchantCategoryCode,
                            merchantState,
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
             * A Real Time Payments Transfer Instruction object. This field will be present in the
             * JSON response if and only if `category` is equal to
             * `real_time_payments_transfer_instruction`.
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

                private var hashCode: Int = 0

                /**
                 * The pending amount in the minor unit of the transaction's currency. For dollars,
                 * for example, this is cents.
                 */
                fun amount(): Long = amount.getRequired("amount")

                /**
                 * The identifier of the Real Time Payments Transfer that led to this Pending
                 * Transaction.
                 */
                fun transferId(): String = transferId.getRequired("transfer_id")

                /**
                 * The pending amount in the minor unit of the transaction's currency. For dollars,
                 * for example, this is cents.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

                /**
                 * The identifier of the Real Time Payments Transfer that led to this Pending
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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is RealTimePaymentsTransferInstruction &&
                        this.amount == other.amount &&
                        this.transferId == other.transferId &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                amount,
                                transferId,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "RealTimePaymentsTransferInstruction{amount=$amount, transferId=$transferId, additionalProperties=$additionalProperties}"

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
                        additionalProperties(
                            realTimePaymentsTransferInstruction.additionalProperties
                        )
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
                     * The identifier of the Real Time Payments Transfer that led to this Pending
                     * Transaction.
                     */
                    fun transferId(transferId: String) = transferId(JsonField.of(transferId))

                    /**
                     * The identifier of the Real Time Payments Transfer that led to this Pending
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
            }

            /**
             * A Wire Drawdown Payment Instruction object. This field will be present in the JSON
             * response if and only if `category` is equal to `wire_drawdown_payment_instruction`.
             */
            @JsonDeserialize(builder = WireDrawdownPaymentInstruction.Builder::class)
            @NoAutoDetect
            class WireDrawdownPaymentInstruction
            private constructor(
                private val amount: JsonField<Long>,
                private val accountNumber: JsonField<String>,
                private val routingNumber: JsonField<String>,
                private val messageToRecipient: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /**
                 * The pending amount in the minor unit of the transaction's currency. For dollars,
                 * for example, this is cents.
                 */
                fun amount(): Long = amount.getRequired("amount")

                fun accountNumber(): String = accountNumber.getRequired("account_number")

                fun routingNumber(): String = routingNumber.getRequired("routing_number")

                fun messageToRecipient(): String =
                    messageToRecipient.getRequired("message_to_recipient")

                /**
                 * The pending amount in the minor unit of the transaction's currency. For dollars,
                 * for example, this is cents.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

                @JsonProperty("account_number") @ExcludeMissing fun _accountNumber() = accountNumber

                @JsonProperty("routing_number") @ExcludeMissing fun _routingNumber() = routingNumber

                @JsonProperty("message_to_recipient")
                @ExcludeMissing
                fun _messageToRecipient() = messageToRecipient

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): WireDrawdownPaymentInstruction = apply {
                    if (!validated) {
                        amount()
                        accountNumber()
                        routingNumber()
                        messageToRecipient()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is WireDrawdownPaymentInstruction &&
                        this.amount == other.amount &&
                        this.accountNumber == other.accountNumber &&
                        this.routingNumber == other.routingNumber &&
                        this.messageToRecipient == other.messageToRecipient &&
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
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "WireDrawdownPaymentInstruction{amount=$amount, accountNumber=$accountNumber, routingNumber=$routingNumber, messageToRecipient=$messageToRecipient, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var amount: JsonField<Long> = JsonMissing.of()
                    private var accountNumber: JsonField<String> = JsonMissing.of()
                    private var routingNumber: JsonField<String> = JsonMissing.of()
                    private var messageToRecipient: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(
                        wireDrawdownPaymentInstruction: WireDrawdownPaymentInstruction
                    ) = apply {
                        this.amount = wireDrawdownPaymentInstruction.amount
                        this.accountNumber = wireDrawdownPaymentInstruction.accountNumber
                        this.routingNumber = wireDrawdownPaymentInstruction.routingNumber
                        this.messageToRecipient = wireDrawdownPaymentInstruction.messageToRecipient
                        additionalProperties(wireDrawdownPaymentInstruction.additionalProperties)
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

                    fun build(): WireDrawdownPaymentInstruction =
                        WireDrawdownPaymentInstruction(
                            amount,
                            accountNumber,
                            routingNumber,
                            messageToRecipient,
                            additionalProperties.toUnmodifiable(),
                        )
                }
            }

            /**
             * A Wire Transfer Instruction object. This field will be present in the JSON response
             * if and only if `category` is equal to `wire_transfer_instruction`.
             */
            @JsonDeserialize(builder = WireTransferInstruction.Builder::class)
            @NoAutoDetect
            class WireTransferInstruction
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

                /**
                 * The pending amount in the minor unit of the transaction's currency. For dollars,
                 * for example, this is cents.
                 */
                fun amount(): Long = amount.getRequired("amount")

                fun accountNumber(): String = accountNumber.getRequired("account_number")

                fun routingNumber(): String = routingNumber.getRequired("routing_number")

                fun messageToRecipient(): String =
                    messageToRecipient.getRequired("message_to_recipient")

                fun transferId(): String = transferId.getRequired("transfer_id")

                /**
                 * The pending amount in the minor unit of the transaction's currency. For dollars,
                 * for example, this is cents.
                 */
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

                fun validate(): WireTransferInstruction = apply {
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

                    return other is WireTransferInstruction &&
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
                    "WireTransferInstruction{amount=$amount, accountNumber=$accountNumber, routingNumber=$routingNumber, messageToRecipient=$messageToRecipient, transferId=$transferId, additionalProperties=$additionalProperties}"

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
                    internal fun from(wireTransferInstruction: WireTransferInstruction) = apply {
                        this.amount = wireTransferInstruction.amount
                        this.accountNumber = wireTransferInstruction.accountNumber
                        this.routingNumber = wireTransferInstruction.routingNumber
                        this.messageToRecipient = wireTransferInstruction.messageToRecipient
                        this.transferId = wireTransferInstruction.transferId
                        additionalProperties(wireTransferInstruction.additionalProperties)
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

                    fun build(): WireTransferInstruction =
                        WireTransferInstruction(
                            amount,
                            accountNumber,
                            routingNumber,
                            messageToRecipient,
                            transferId,
                            additionalProperties.toUnmodifiable(),
                        )
                }
            }
        }

        class Status
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Status && this.value == other.value
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
    }

    /**
     * If the authorization attempt fails, this will contain the resulting
     * [Declined Transaction](#declined-transactions) object. The Declined Transaction's `source`
     * will be of `category: card_decline`.
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

        fun validate(): DeclinedTransaction = apply {
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
            private val wireDecline: JsonField<WireDecline>,
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
             * A Wire Decline object. This field will be present in the JSON response if and only if
             * `category` is equal to `wire_decline`.
             */
            fun wireDecline(): Optional<WireDecline> =
                Optional.ofNullable(wireDecline.getNullable("wire_decline"))

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
                    category()
                    achDecline().map { it.validate() }
                    cardDecline().map { it.validate() }
                    checkDecline().map { it.validate() }
                    inboundRealTimePaymentsTransferDecline().map { it.validate() }
                    internationalAchDecline().map { it.validate() }
                    cardRouteDecline().map { it.validate() }
                    wireDecline().map { it.validate() }
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
                    this.wireDecline == other.wireDecline &&
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
                            wireDecline,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Source{category=$category, achDecline=$achDecline, cardDecline=$cardDecline, checkDecline=$checkDecline, inboundRealTimePaymentsTransferDecline=$inboundRealTimePaymentsTransferDecline, internationalAchDecline=$internationalAchDecline, cardRouteDecline=$cardRouteDecline, wireDecline=$wireDecline, additionalProperties=$additionalProperties}"

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
                private var wireDecline: JsonField<WireDecline> = JsonMissing.of()
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
                    this.wireDecline = source.wireDecline
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

                /**
                 * A Wire Decline object. This field will be present in the JSON response if and
                 * only if `category` is equal to `wire_decline`.
                 */
                fun wireDecline(wireDecline: WireDecline) = wireDecline(JsonField.of(wireDecline))

                /**
                 * A Wire Decline object. This field will be present in the JSON response if and
                 * only if `category` is equal to `wire_decline`.
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
                        wireDecline,
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

                    @JvmField val WIRE_DECLINE = Category(JsonField.of("wire_decline"))

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
                    WIRE_DECLINE,
                    OTHER,
                }

                enum class Value {
                    ACH_DECLINE,
                    CARD_DECLINE,
                    CHECK_DECLINE,
                    INBOUND_REAL_TIME_PAYMENTS_TRANSFER_DECLINE,
                    INTERNATIONAL_ACH_DECLINE,
                    CARD_ROUTE_DECLINE,
                    WIRE_DECLINE,
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
                        WIRE_DECLINE -> Value.WIRE_DECLINE
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
                        WIRE_DECLINE -> Known.WIRE_DECLINE
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

                fun validate(): AchDecline = apply {
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

                fun validate(): CardDecline = apply {
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

                    fun validate(): NetworkDetails = apply {
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

                        fun validate(): Visa = apply {
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

                fun validate(): CheckDecline = apply {
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

                        @JvmField val NOT_OUR_ITEM = Reason(JsonField.of("not_our_item"))

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
                        NOT_OUR_ITEM,
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
                        NOT_OUR_ITEM,
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
                            NOT_OUR_ITEM -> Value.NOT_OUR_ITEM
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
                            NOT_OUR_ITEM -> Known.NOT_OUR_ITEM
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

                fun validate(): InboundRealTimePaymentsTransferDecline = apply {
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

                fun validate(): InternationalAchDecline = apply {
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

                fun validate(): CardRouteDecline = apply {
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

            /**
             * A Wire Decline object. This field will be present in the JSON response if and only if
             * `category` is equal to `wire_decline`.
             */
            @JsonDeserialize(builder = WireDecline.Builder::class)
            @NoAutoDetect
            class WireDecline
            private constructor(
                private val amount: JsonField<Long>,
                private val reason: JsonField<Reason>,
                private val description: JsonField<String>,
                private val beneficiaryAddressLine1: JsonField<String>,
                private val beneficiaryAddressLine2: JsonField<String>,
                private val beneficiaryAddressLine3: JsonField<String>,
                private val beneficiaryName: JsonField<String>,
                private val beneficiaryReference: JsonField<String>,
                private val inputMessageAccountabilityData: JsonField<String>,
                private val originatorAddressLine1: JsonField<String>,
                private val originatorAddressLine2: JsonField<String>,
                private val originatorAddressLine3: JsonField<String>,
                private val originatorName: JsonField<String>,
                private val originatorToBeneficiaryInformationLine1: JsonField<String>,
                private val originatorToBeneficiaryInformationLine2: JsonField<String>,
                private val originatorToBeneficiaryInformationLine3: JsonField<String>,
                private val originatorToBeneficiaryInformationLine4: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /**
                 * The declined amount in the minor unit of the destination account currency. For
                 * dollars, for example, this is cents.
                 */
                fun amount(): Long = amount.getRequired("amount")

                /** Why the wire transfer was declined. */
                fun reason(): Reason = reason.getRequired("reason")

                fun description(): String = description.getRequired("description")

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

                /**
                 * The declined amount in the minor unit of the destination account currency. For
                 * dollars, for example, this is cents.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

                /** Why the wire transfer was declined. */
                @JsonProperty("reason") @ExcludeMissing fun _reason() = reason

                @JsonProperty("description") @ExcludeMissing fun _description() = description

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

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): WireDecline = apply {
                    if (!validated) {
                        amount()
                        reason()
                        description()
                        beneficiaryAddressLine1()
                        beneficiaryAddressLine2()
                        beneficiaryAddressLine3()
                        beneficiaryName()
                        beneficiaryReference()
                        inputMessageAccountabilityData()
                        originatorAddressLine1()
                        originatorAddressLine2()
                        originatorAddressLine3()
                        originatorName()
                        originatorToBeneficiaryInformationLine1()
                        originatorToBeneficiaryInformationLine2()
                        originatorToBeneficiaryInformationLine3()
                        originatorToBeneficiaryInformationLine4()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is WireDecline &&
                        this.amount == other.amount &&
                        this.reason == other.reason &&
                        this.description == other.description &&
                        this.beneficiaryAddressLine1 == other.beneficiaryAddressLine1 &&
                        this.beneficiaryAddressLine2 == other.beneficiaryAddressLine2 &&
                        this.beneficiaryAddressLine3 == other.beneficiaryAddressLine3 &&
                        this.beneficiaryName == other.beneficiaryName &&
                        this.beneficiaryReference == other.beneficiaryReference &&
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
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                amount,
                                reason,
                                description,
                                beneficiaryAddressLine1,
                                beneficiaryAddressLine2,
                                beneficiaryAddressLine3,
                                beneficiaryName,
                                beneficiaryReference,
                                inputMessageAccountabilityData,
                                originatorAddressLine1,
                                originatorAddressLine2,
                                originatorAddressLine3,
                                originatorName,
                                originatorToBeneficiaryInformationLine1,
                                originatorToBeneficiaryInformationLine2,
                                originatorToBeneficiaryInformationLine3,
                                originatorToBeneficiaryInformationLine4,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "WireDecline{amount=$amount, reason=$reason, description=$description, beneficiaryAddressLine1=$beneficiaryAddressLine1, beneficiaryAddressLine2=$beneficiaryAddressLine2, beneficiaryAddressLine3=$beneficiaryAddressLine3, beneficiaryName=$beneficiaryName, beneficiaryReference=$beneficiaryReference, inputMessageAccountabilityData=$inputMessageAccountabilityData, originatorAddressLine1=$originatorAddressLine1, originatorAddressLine2=$originatorAddressLine2, originatorAddressLine3=$originatorAddressLine3, originatorName=$originatorName, originatorToBeneficiaryInformationLine1=$originatorToBeneficiaryInformationLine1, originatorToBeneficiaryInformationLine2=$originatorToBeneficiaryInformationLine2, originatorToBeneficiaryInformationLine3=$originatorToBeneficiaryInformationLine3, originatorToBeneficiaryInformationLine4=$originatorToBeneficiaryInformationLine4, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var amount: JsonField<Long> = JsonMissing.of()
                    private var reason: JsonField<Reason> = JsonMissing.of()
                    private var description: JsonField<String> = JsonMissing.of()
                    private var beneficiaryAddressLine1: JsonField<String> = JsonMissing.of()
                    private var beneficiaryAddressLine2: JsonField<String> = JsonMissing.of()
                    private var beneficiaryAddressLine3: JsonField<String> = JsonMissing.of()
                    private var beneficiaryName: JsonField<String> = JsonMissing.of()
                    private var beneficiaryReference: JsonField<String> = JsonMissing.of()
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
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(wireDecline: WireDecline) = apply {
                        this.amount = wireDecline.amount
                        this.reason = wireDecline.reason
                        this.description = wireDecline.description
                        this.beneficiaryAddressLine1 = wireDecline.beneficiaryAddressLine1
                        this.beneficiaryAddressLine2 = wireDecline.beneficiaryAddressLine2
                        this.beneficiaryAddressLine3 = wireDecline.beneficiaryAddressLine3
                        this.beneficiaryName = wireDecline.beneficiaryName
                        this.beneficiaryReference = wireDecline.beneficiaryReference
                        this.inputMessageAccountabilityData =
                            wireDecline.inputMessageAccountabilityData
                        this.originatorAddressLine1 = wireDecline.originatorAddressLine1
                        this.originatorAddressLine2 = wireDecline.originatorAddressLine2
                        this.originatorAddressLine3 = wireDecline.originatorAddressLine3
                        this.originatorName = wireDecline.originatorName
                        this.originatorToBeneficiaryInformationLine1 =
                            wireDecline.originatorToBeneficiaryInformationLine1
                        this.originatorToBeneficiaryInformationLine2 =
                            wireDecline.originatorToBeneficiaryInformationLine2
                        this.originatorToBeneficiaryInformationLine3 =
                            wireDecline.originatorToBeneficiaryInformationLine3
                        this.originatorToBeneficiaryInformationLine4 =
                            wireDecline.originatorToBeneficiaryInformationLine4
                        additionalProperties(wireDecline.additionalProperties)
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

                    /** Why the wire transfer was declined. */
                    fun reason(reason: Reason) = reason(JsonField.of(reason))

                    /** Why the wire transfer was declined. */
                    @JsonProperty("reason")
                    @ExcludeMissing
                    fun reason(reason: JsonField<Reason>) = apply { this.reason = reason }

                    fun description(description: String) = description(JsonField.of(description))

                    @JsonProperty("description")
                    @ExcludeMissing
                    fun description(description: JsonField<String>) = apply {
                        this.description = description
                    }

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
                            amount,
                            reason,
                            description,
                            beneficiaryAddressLine1,
                            beneficiaryAddressLine2,
                            beneficiaryAddressLine3,
                            beneficiaryName,
                            beneficiaryReference,
                            inputMessageAccountabilityData,
                            originatorAddressLine1,
                            originatorAddressLine2,
                            originatorAddressLine3,
                            originatorName,
                            originatorToBeneficiaryInformationLine1,
                            originatorToBeneficiaryInformationLine2,
                            originatorToBeneficiaryInformationLine3,
                            originatorToBeneficiaryInformationLine4,
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
                        val ACCOUNT_NUMBER_CANCELED =
                            Reason(JsonField.of("account_number_canceled"))

                        @JvmField
                        val ACCOUNT_NUMBER_DISABLED =
                            Reason(JsonField.of("account_number_disabled"))

                        @JvmField val ENTITY_NOT_ACTIVE = Reason(JsonField.of("entity_not_active"))

                        @JvmField val GROUP_LOCKED = Reason(JsonField.of("group_locked"))

                        @JvmField val NO_ACCOUNT_NUMBER = Reason(JsonField.of("no_account_number"))

                        @JvmField
                        val TRANSACTION_NOT_ALLOWED =
                            Reason(JsonField.of("transaction_not_allowed"))

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
            val INBOUND_CARD_AUTHORIZATION_SIMULATION_RESULT =
                Type(JsonField.of("inbound_card_authorization_simulation_result"))

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            INBOUND_CARD_AUTHORIZATION_SIMULATION_RESULT,
        }

        enum class Value {
            INBOUND_CARD_AUTHORIZATION_SIMULATION_RESULT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                INBOUND_CARD_AUTHORIZATION_SIMULATION_RESULT ->
                    Value.INBOUND_CARD_AUTHORIZATION_SIMULATION_RESULT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                INBOUND_CARD_AUTHORIZATION_SIMULATION_RESULT ->
                    Known.INBOUND_CARD_AUTHORIZATION_SIMULATION_RESULT
                else -> throw IncreaseInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
