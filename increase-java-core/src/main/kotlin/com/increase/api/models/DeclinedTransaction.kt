// File generated from our OpenAPI spec by Stainless.

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
     * The Declined Transaction amount in the minor unit of its currency. For dollars, for example,
     * this is cents.
     */
    fun amount(): Long = amount.getRequired("amount")

    /**
     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the Declined Transaction's
     * currency. This will match the currency on the Declined Transaction's Account.
     */
    fun currency(): Currency = currency.getRequired("currency")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date on which the Transaction
     * occurred.
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

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
     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the Declined Transaction's
     * currency. This will match the currency on the Declined Transaction's Account.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date on which the Transaction
     * occurred.
     */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

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
        private val wireDecline: JsonField<WireDecline>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /**
         * The type of the resource. We may add additional possible values for this enum over time;
         * your application should be able to handle such additions gracefully.
         */
        fun category(): Category = category.getRequired("category")

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
         * A Check Decline object. This field will be present in the JSON response if and only if
         * `category` is equal to `check_decline`.
         */
        fun checkDecline(): Optional<CheckDecline> =
            Optional.ofNullable(checkDecline.getNullable("check_decline"))

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
         * An International ACH Decline object. This field will be present in the JSON response if
         * and only if `category` is equal to `international_ach_decline`.
         */
        fun internationalAchDecline(): Optional<InternationalAchDecline> =
            Optional.ofNullable(internationalAchDecline.getNullable("international_ach_decline"))

        /**
         * A Wire Decline object. This field will be present in the JSON response if and only if
         * `category` is equal to `wire_decline`.
         */
        fun wireDecline(): Optional<WireDecline> =
            Optional.ofNullable(wireDecline.getNullable("wire_decline"))

        /**
         * The type of the resource. We may add additional possible values for this enum over time;
         * your application should be able to handle such additions gracefully.
         */
        @JsonProperty("category") @ExcludeMissing fun _category() = category

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
         * A Check Decline object. This field will be present in the JSON response if and only if
         * `category` is equal to `check_decline`.
         */
        @JsonProperty("check_decline") @ExcludeMissing fun _checkDecline() = checkDecline

        /**
         * An Inbound Real-Time Payments Transfer Decline object. This field will be present in the
         * JSON response if and only if `category` is equal to
         * `inbound_real_time_payments_transfer_decline`.
         */
        @JsonProperty("inbound_real_time_payments_transfer_decline")
        @ExcludeMissing
        fun _inboundRealTimePaymentsTransferDecline() = inboundRealTimePaymentsTransferDecline

        /**
         * An International ACH Decline object. This field will be present in the JSON response if
         * and only if `category` is equal to `international_ach_decline`.
         */
        @JsonProperty("international_ach_decline")
        @ExcludeMissing
        fun _internationalAchDecline() = internationalAchDecline

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
                        wireDecline,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Source{category=$category, achDecline=$achDecline, cardDecline=$cardDecline, checkDecline=$checkDecline, inboundRealTimePaymentsTransferDecline=$inboundRealTimePaymentsTransferDecline, internationalAchDecline=$internationalAchDecline, wireDecline=$wireDecline, additionalProperties=$additionalProperties}"

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
                this.wireDecline = source.wireDecline
                additionalProperties(source.additionalProperties)
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
             * An International ACH Decline object. This field will be present in the JSON response
             * if and only if `category` is equal to `international_ach_decline`.
             */
            fun internationalAchDecline(internationalAchDecline: InternationalAchDecline) =
                internationalAchDecline(JsonField.of(internationalAchDecline))

            /**
             * An International ACH Decline object. This field will be present in the JSON response
             * if and only if `category` is equal to `international_ach_decline`.
             */
            @JsonProperty("international_ach_decline")
            @ExcludeMissing
            fun internationalAchDecline(
                internationalAchDecline: JsonField<InternationalAchDecline>
            ) = apply { this.internationalAchDecline = internationalAchDecline }

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
                    category,
                    achDecline,
                    cardDecline,
                    checkDecline,
                    inboundRealTimePaymentsTransferDecline,
                    internationalAchDecline,
                    wireDecline,
                    additionalProperties.toUnmodifiable(),
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
            private val id: JsonField<String>,
            private val amount: JsonField<Long>,
            private val originatorCompanyName: JsonField<String>,
            private val originatorCompanyDescriptiveDate: JsonField<String>,
            private val originatorCompanyDiscretionaryData: JsonField<String>,
            private val originatorCompanyId: JsonField<String>,
            private val reason: JsonField<Reason>,
            private val receiverIdNumber: JsonField<String>,
            private val receiverName: JsonField<String>,
            private val traceNumber: JsonField<String>,
            private val type: JsonField<Type>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** The ACH Decline's identifier. */
            fun id(): String = id.getRequired("id")

            /**
             * The declined amount in the minor unit of the destination account currency. For
             * dollars, for example, this is cents.
             */
            fun amount(): Long = amount.getRequired("amount")

            /** The name of the company that initiated the transfer. */
            fun originatorCompanyName(): String =
                originatorCompanyName.getRequired("originator_company_name")

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
            @JsonProperty("id") @ExcludeMissing fun _id() = id

            /**
             * The declined amount in the minor unit of the destination account currency. For
             * dollars, for example, this is cents.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            /** The name of the company that initiated the transfer. */
            @JsonProperty("originator_company_name")
            @ExcludeMissing
            fun _originatorCompanyName() = originatorCompanyName

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
                    id()
                    amount()
                    originatorCompanyName()
                    originatorCompanyDescriptiveDate()
                    originatorCompanyDiscretionaryData()
                    originatorCompanyId()
                    reason()
                    receiverIdNumber()
                    receiverName()
                    traceNumber()
                    type()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is AchDecline &&
                    this.id == other.id &&
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
                    this.type == other.type &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            id,
                            amount,
                            originatorCompanyName,
                            originatorCompanyDescriptiveDate,
                            originatorCompanyDiscretionaryData,
                            originatorCompanyId,
                            reason,
                            receiverIdNumber,
                            receiverName,
                            traceNumber,
                            type,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "AchDecline{id=$id, amount=$amount, originatorCompanyName=$originatorCompanyName, originatorCompanyDescriptiveDate=$originatorCompanyDescriptiveDate, originatorCompanyDiscretionaryData=$originatorCompanyDiscretionaryData, originatorCompanyId=$originatorCompanyId, reason=$reason, receiverIdNumber=$receiverIdNumber, receiverName=$receiverName, traceNumber=$traceNumber, type=$type, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var amount: JsonField<Long> = JsonMissing.of()
                private var originatorCompanyName: JsonField<String> = JsonMissing.of()
                private var originatorCompanyDescriptiveDate: JsonField<String> = JsonMissing.of()
                private var originatorCompanyDiscretionaryData: JsonField<String> = JsonMissing.of()
                private var originatorCompanyId: JsonField<String> = JsonMissing.of()
                private var reason: JsonField<Reason> = JsonMissing.of()
                private var receiverIdNumber: JsonField<String> = JsonMissing.of()
                private var receiverName: JsonField<String> = JsonMissing.of()
                private var traceNumber: JsonField<String> = JsonMissing.of()
                private var type: JsonField<Type> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(achDecline: AchDecline) = apply {
                    this.id = achDecline.id
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
                    this.type = achDecline.type
                    additionalProperties(achDecline.additionalProperties)
                }

                /** The ACH Decline's identifier. */
                fun id(id: String) = id(JsonField.of(id))

                /** The ACH Decline's identifier. */
                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

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

                /** The name of the company that initiated the transfer. */
                fun originatorCompanyName(originatorCompanyName: String) =
                    originatorCompanyName(JsonField.of(originatorCompanyName))

                /** The name of the company that initiated the transfer. */
                @JsonProperty("originator_company_name")
                @ExcludeMissing
                fun originatorCompanyName(originatorCompanyName: JsonField<String>) = apply {
                    this.originatorCompanyName = originatorCompanyName
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
                        id,
                        amount,
                        originatorCompanyName,
                        originatorCompanyDescriptiveDate,
                        originatorCompanyDiscretionaryData,
                        originatorCompanyId,
                        reason,
                        receiverIdNumber,
                        receiverName,
                        traceNumber,
                        type,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class Reason
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) {

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

                    @JvmField val ACH_ROUTE_CANCELED = Reason(JsonField.of("ach_route_canceled"))

                    @JvmField val ACH_ROUTE_DISABLED = Reason(JsonField.of("ach_route_disabled"))

                    @JvmField val BREACHES_LIMIT = Reason(JsonField.of("breaches_limit"))

                    @JvmField
                    val CREDIT_ENTRY_REFUSED_BY_RECEIVER =
                        Reason(JsonField.of("credit_entry_refused_by_receiver"))

                    @JvmField val DUPLICATE_RETURN = Reason(JsonField.of("duplicate_return"))

                    @JvmField val ENTITY_NOT_ACTIVE = Reason(JsonField.of("entity_not_active"))

                    @JvmField val GROUP_LOCKED = Reason(JsonField.of("group_locked"))

                    @JvmField val INSUFFICIENT_FUNDS = Reason(JsonField.of("insufficient_funds"))

                    @JvmField val MISROUTED_RETURN = Reason(JsonField.of("misrouted_return"))

                    @JvmField
                    val RETURN_OF_ERRONEOUS_OR_REVERSING_DEBIT =
                        Reason(JsonField.of("return_of_erroneous_or_reversing_debit"))

                    @JvmField val NO_ACH_ROUTE = Reason(JsonField.of("no_ach_route"))

                    @JvmField val ORIGINATOR_REQUEST = Reason(JsonField.of("originator_request"))

                    @JvmField
                    val TRANSACTION_NOT_ALLOWED = Reason(JsonField.of("transaction_not_allowed"))

                    @JvmField val USER_INITIATED = Reason(JsonField.of("user_initiated"))

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
                    RETURN_OF_ERRONEOUS_OR_REVERSING_DEBIT,
                    NO_ACH_ROUTE,
                    ORIGINATOR_REQUEST,
                    TRANSACTION_NOT_ALLOWED,
                    USER_INITIATED,
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
                    RETURN_OF_ERRONEOUS_OR_REVERSING_DEBIT,
                    NO_ACH_ROUTE,
                    ORIGINATOR_REQUEST,
                    TRANSACTION_NOT_ALLOWED,
                    USER_INITIATED,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        ACH_ROUTE_CANCELED -> Value.ACH_ROUTE_CANCELED
                        ACH_ROUTE_DISABLED -> Value.ACH_ROUTE_DISABLED
                        BREACHES_LIMIT -> Value.BREACHES_LIMIT
                        CREDIT_ENTRY_REFUSED_BY_RECEIVER -> Value.CREDIT_ENTRY_REFUSED_BY_RECEIVER
                        DUPLICATE_RETURN -> Value.DUPLICATE_RETURN
                        ENTITY_NOT_ACTIVE -> Value.ENTITY_NOT_ACTIVE
                        GROUP_LOCKED -> Value.GROUP_LOCKED
                        INSUFFICIENT_FUNDS -> Value.INSUFFICIENT_FUNDS
                        MISROUTED_RETURN -> Value.MISROUTED_RETURN
                        RETURN_OF_ERRONEOUS_OR_REVERSING_DEBIT ->
                            Value.RETURN_OF_ERRONEOUS_OR_REVERSING_DEBIT
                        NO_ACH_ROUTE -> Value.NO_ACH_ROUTE
                        ORIGINATOR_REQUEST -> Value.ORIGINATOR_REQUEST
                        TRANSACTION_NOT_ALLOWED -> Value.TRANSACTION_NOT_ALLOWED
                        USER_INITIATED -> Value.USER_INITIATED
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        ACH_ROUTE_CANCELED -> Known.ACH_ROUTE_CANCELED
                        ACH_ROUTE_DISABLED -> Known.ACH_ROUTE_DISABLED
                        BREACHES_LIMIT -> Known.BREACHES_LIMIT
                        CREDIT_ENTRY_REFUSED_BY_RECEIVER -> Known.CREDIT_ENTRY_REFUSED_BY_RECEIVER
                        DUPLICATE_RETURN -> Known.DUPLICATE_RETURN
                        ENTITY_NOT_ACTIVE -> Known.ENTITY_NOT_ACTIVE
                        GROUP_LOCKED -> Known.GROUP_LOCKED
                        INSUFFICIENT_FUNDS -> Known.INSUFFICIENT_FUNDS
                        MISROUTED_RETURN -> Known.MISROUTED_RETURN
                        RETURN_OF_ERRONEOUS_OR_REVERSING_DEBIT ->
                            Known.RETURN_OF_ERRONEOUS_OR_REVERSING_DEBIT
                        NO_ACH_ROUTE -> Known.NO_ACH_ROUTE
                        ORIGINATOR_REQUEST -> Known.ORIGINATOR_REQUEST
                        TRANSACTION_NOT_ALLOWED -> Known.TRANSACTION_NOT_ALLOWED
                        USER_INITIATED -> Known.USER_INITIATED
                        else -> throw IncreaseInvalidDataException("Unknown Reason: $value")
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
            private val digitalWalletTokenId: JsonField<String>,
            private val physicalCardId: JsonField<String>,
            private val cardholderAddress: JsonField<CardholderAddress>,
            private val networkDetails: JsonField<NetworkDetails>,
            private val id: JsonField<String>,
            private val cardPaymentId: JsonField<String>,
            private val amount: JsonField<Long>,
            private val currency: JsonField<Currency>,
            private val reason: JsonField<Reason>,
            private val merchantState: JsonField<String>,
            private val realTimeDecisionId: JsonField<String>,
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
            fun merchantDescriptor(): String = merchantDescriptor.getRequired("merchant_descriptor")

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

            /**
             * If the authorization was made via a Digital Wallet Token (such as an Apple Pay
             * purchase), the identifier of the token that was used.
             */
            fun digitalWalletTokenId(): Optional<String> =
                Optional.ofNullable(digitalWalletTokenId.getNullable("digital_wallet_token_id"))

            /**
             * If the authorization was made in-person with a physical card, the Physical Card that
             * was used.
             */
            fun physicalCardId(): Optional<String> =
                Optional.ofNullable(physicalCardId.getNullable("physical_card_id"))

            /**
             * Cardholder address provided in the authorization request and the address on file we
             * verified it against.
             */
            fun cardholderAddress(): CardholderAddress =
                cardholderAddress.getRequired("cardholder_address")

            /** Fields specific to the `network`. */
            fun networkDetails(): NetworkDetails = networkDetails.getRequired("network_details")

            /** The Card Decline identifier. */
            fun id(): String = id.getRequired("id")

            /** The ID of the Card Payment this transaction belongs to. */
            fun cardPaymentId(): Optional<String> =
                Optional.ofNullable(cardPaymentId.getNullable("card_payment_id"))

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
             * The identifier of the Real-Time Decision sent to approve or decline this transaction.
             */
            fun realTimeDecisionId(): Optional<String> =
                Optional.ofNullable(realTimeDecisionId.getNullable("real_time_decision_id"))

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

            /**
             * If the authorization was made via a Digital Wallet Token (such as an Apple Pay
             * purchase), the identifier of the token that was used.
             */
            @JsonProperty("digital_wallet_token_id")
            @ExcludeMissing
            fun _digitalWalletTokenId() = digitalWalletTokenId

            /**
             * If the authorization was made in-person with a physical card, the Physical Card that
             * was used.
             */
            @JsonProperty("physical_card_id") @ExcludeMissing fun _physicalCardId() = physicalCardId

            /**
             * Cardholder address provided in the authorization request and the address on file we
             * verified it against.
             */
            @JsonProperty("cardholder_address")
            @ExcludeMissing
            fun _cardholderAddress() = cardholderAddress

            /** Fields specific to the `network`. */
            @JsonProperty("network_details") @ExcludeMissing fun _networkDetails() = networkDetails

            /** The Card Decline identifier. */
            @JsonProperty("id") @ExcludeMissing fun _id() = id

            /** The ID of the Card Payment this transaction belongs to. */
            @JsonProperty("card_payment_id") @ExcludeMissing fun _cardPaymentId() = cardPaymentId

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
             * The identifier of the Real-Time Decision sent to approve or decline this transaction.
             */
            @JsonProperty("real_time_decision_id")
            @ExcludeMissing
            fun _realTimeDecisionId() = realTimeDecisionId

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
                    digitalWalletTokenId()
                    physicalCardId()
                    cardholderAddress().validate()
                    networkDetails().validate()
                    id()
                    cardPaymentId()
                    amount()
                    currency()
                    reason()
                    merchantState()
                    realTimeDecisionId()
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
                    this.digitalWalletTokenId == other.digitalWalletTokenId &&
                    this.physicalCardId == other.physicalCardId &&
                    this.cardholderAddress == other.cardholderAddress &&
                    this.networkDetails == other.networkDetails &&
                    this.id == other.id &&
                    this.cardPaymentId == other.cardPaymentId &&
                    this.amount == other.amount &&
                    this.currency == other.currency &&
                    this.reason == other.reason &&
                    this.merchantState == other.merchantState &&
                    this.realTimeDecisionId == other.realTimeDecisionId &&
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
                            digitalWalletTokenId,
                            physicalCardId,
                            cardholderAddress,
                            networkDetails,
                            id,
                            cardPaymentId,
                            amount,
                            currency,
                            reason,
                            merchantState,
                            realTimeDecisionId,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "CardDecline{merchantAcceptorId=$merchantAcceptorId, merchantDescriptor=$merchantDescriptor, merchantCategoryCode=$merchantCategoryCode, merchantCity=$merchantCity, merchantCountry=$merchantCountry, digitalWalletTokenId=$digitalWalletTokenId, physicalCardId=$physicalCardId, cardholderAddress=$cardholderAddress, networkDetails=$networkDetails, id=$id, cardPaymentId=$cardPaymentId, amount=$amount, currency=$currency, reason=$reason, merchantState=$merchantState, realTimeDecisionId=$realTimeDecisionId, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var merchantAcceptorId: JsonField<String> = JsonMissing.of()
                private var merchantDescriptor: JsonField<String> = JsonMissing.of()
                private var merchantCategoryCode: JsonField<String> = JsonMissing.of()
                private var merchantCity: JsonField<String> = JsonMissing.of()
                private var merchantCountry: JsonField<String> = JsonMissing.of()
                private var digitalWalletTokenId: JsonField<String> = JsonMissing.of()
                private var physicalCardId: JsonField<String> = JsonMissing.of()
                private var cardholderAddress: JsonField<CardholderAddress> = JsonMissing.of()
                private var networkDetails: JsonField<NetworkDetails> = JsonMissing.of()
                private var id: JsonField<String> = JsonMissing.of()
                private var cardPaymentId: JsonField<String> = JsonMissing.of()
                private var amount: JsonField<Long> = JsonMissing.of()
                private var currency: JsonField<Currency> = JsonMissing.of()
                private var reason: JsonField<Reason> = JsonMissing.of()
                private var merchantState: JsonField<String> = JsonMissing.of()
                private var realTimeDecisionId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(cardDecline: CardDecline) = apply {
                    this.merchantAcceptorId = cardDecline.merchantAcceptorId
                    this.merchantDescriptor = cardDecline.merchantDescriptor
                    this.merchantCategoryCode = cardDecline.merchantCategoryCode
                    this.merchantCity = cardDecline.merchantCity
                    this.merchantCountry = cardDecline.merchantCountry
                    this.digitalWalletTokenId = cardDecline.digitalWalletTokenId
                    this.physicalCardId = cardDecline.physicalCardId
                    this.cardholderAddress = cardDecline.cardholderAddress
                    this.networkDetails = cardDecline.networkDetails
                    this.id = cardDecline.id
                    this.cardPaymentId = cardDecline.cardPaymentId
                    this.amount = cardDecline.amount
                    this.currency = cardDecline.currency
                    this.reason = cardDecline.reason
                    this.merchantState = cardDecline.merchantState
                    this.realTimeDecisionId = cardDecline.realTimeDecisionId
                    additionalProperties(cardDecline.additionalProperties)
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
                 * Cardholder address provided in the authorization request and the address on file
                 * we verified it against.
                 */
                fun cardholderAddress(cardholderAddress: CardholderAddress) =
                    cardholderAddress(JsonField.of(cardholderAddress))

                /**
                 * Cardholder address provided in the authorization request and the address on file
                 * we verified it against.
                 */
                @JsonProperty("cardholder_address")
                @ExcludeMissing
                fun cardholderAddress(cardholderAddress: JsonField<CardholderAddress>) = apply {
                    this.cardholderAddress = cardholderAddress
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

                /** The Card Decline identifier. */
                fun id(id: String) = id(JsonField.of(id))

                /** The Card Decline identifier. */
                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

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
                        digitalWalletTokenId,
                        physicalCardId,
                        cardholderAddress,
                        networkDetails,
                        id,
                        cardPaymentId,
                        amount,
                        currency,
                        reason,
                        merchantState,
                        realTimeDecisionId,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            /**
             * Cardholder address provided in the authorization request and the address on file we
             * verified it against.
             */
            @JsonDeserialize(builder = CardholderAddress.Builder::class)
            @NoAutoDetect
            class CardholderAddress
            private constructor(
                private val providedPostalCode: JsonField<String>,
                private val providedLine1: JsonField<String>,
                private val actualPostalCode: JsonField<String>,
                private val actualLine1: JsonField<String>,
                private val verificationResult: JsonField<VerificationResult>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /** The postal code provided for verification in the authorization request. */
                fun providedPostalCode(): Optional<String> =
                    Optional.ofNullable(providedPostalCode.getNullable("provided_postal_code"))

                /**
                 * The cardholder address line 1 provided for verification in the authorization
                 * request.
                 */
                fun providedLine1(): Optional<String> =
                    Optional.ofNullable(providedLine1.getNullable("provided_line1"))

                /** The postal code of the address on file for the cardholder. */
                fun actualPostalCode(): Optional<String> =
                    Optional.ofNullable(actualPostalCode.getNullable("actual_postal_code"))

                /** Line 1 of the address on file for the cardholder. */
                fun actualLine1(): Optional<String> =
                    Optional.ofNullable(actualLine1.getNullable("actual_line1"))

                /** The address verification result returned to the card network. */
                fun verificationResult(): VerificationResult =
                    verificationResult.getRequired("verification_result")

                /** The postal code provided for verification in the authorization request. */
                @JsonProperty("provided_postal_code")
                @ExcludeMissing
                fun _providedPostalCode() = providedPostalCode

                /**
                 * The cardholder address line 1 provided for verification in the authorization
                 * request.
                 */
                @JsonProperty("provided_line1") @ExcludeMissing fun _providedLine1() = providedLine1

                /** The postal code of the address on file for the cardholder. */
                @JsonProperty("actual_postal_code")
                @ExcludeMissing
                fun _actualPostalCode() = actualPostalCode

                /** Line 1 of the address on file for the cardholder. */
                @JsonProperty("actual_line1") @ExcludeMissing fun _actualLine1() = actualLine1

                /** The address verification result returned to the card network. */
                @JsonProperty("verification_result")
                @ExcludeMissing
                fun _verificationResult() = verificationResult

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): CardholderAddress = apply {
                    if (!validated) {
                        providedPostalCode()
                        providedLine1()
                        actualPostalCode()
                        actualLine1()
                        verificationResult()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is CardholderAddress &&
                        this.providedPostalCode == other.providedPostalCode &&
                        this.providedLine1 == other.providedLine1 &&
                        this.actualPostalCode == other.actualPostalCode &&
                        this.actualLine1 == other.actualLine1 &&
                        this.verificationResult == other.verificationResult &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                providedPostalCode,
                                providedLine1,
                                actualPostalCode,
                                actualLine1,
                                verificationResult,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "CardholderAddress{providedPostalCode=$providedPostalCode, providedLine1=$providedLine1, actualPostalCode=$actualPostalCode, actualLine1=$actualLine1, verificationResult=$verificationResult, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var providedPostalCode: JsonField<String> = JsonMissing.of()
                    private var providedLine1: JsonField<String> = JsonMissing.of()
                    private var actualPostalCode: JsonField<String> = JsonMissing.of()
                    private var actualLine1: JsonField<String> = JsonMissing.of()
                    private var verificationResult: JsonField<VerificationResult> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(cardholderAddress: CardholderAddress) = apply {
                        this.providedPostalCode = cardholderAddress.providedPostalCode
                        this.providedLine1 = cardholderAddress.providedLine1
                        this.actualPostalCode = cardholderAddress.actualPostalCode
                        this.actualLine1 = cardholderAddress.actualLine1
                        this.verificationResult = cardholderAddress.verificationResult
                        additionalProperties(cardholderAddress.additionalProperties)
                    }

                    /** The postal code provided for verification in the authorization request. */
                    fun providedPostalCode(providedPostalCode: String) =
                        providedPostalCode(JsonField.of(providedPostalCode))

                    /** The postal code provided for verification in the authorization request. */
                    @JsonProperty("provided_postal_code")
                    @ExcludeMissing
                    fun providedPostalCode(providedPostalCode: JsonField<String>) = apply {
                        this.providedPostalCode = providedPostalCode
                    }

                    /**
                     * The cardholder address line 1 provided for verification in the authorization
                     * request.
                     */
                    fun providedLine1(providedLine1: String) =
                        providedLine1(JsonField.of(providedLine1))

                    /**
                     * The cardholder address line 1 provided for verification in the authorization
                     * request.
                     */
                    @JsonProperty("provided_line1")
                    @ExcludeMissing
                    fun providedLine1(providedLine1: JsonField<String>) = apply {
                        this.providedLine1 = providedLine1
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

                    /** Line 1 of the address on file for the cardholder. */
                    fun actualLine1(actualLine1: String) = actualLine1(JsonField.of(actualLine1))

                    /** Line 1 of the address on file for the cardholder. */
                    @JsonProperty("actual_line1")
                    @ExcludeMissing
                    fun actualLine1(actualLine1: JsonField<String>) = apply {
                        this.actualLine1 = actualLine1
                    }

                    /** The address verification result returned to the card network. */
                    fun verificationResult(verificationResult: VerificationResult) =
                        verificationResult(JsonField.of(verificationResult))

                    /** The address verification result returned to the card network. */
                    @JsonProperty("verification_result")
                    @ExcludeMissing
                    fun verificationResult(verificationResult: JsonField<VerificationResult>) =
                        apply {
                            this.verificationResult = verificationResult
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

                    fun build(): CardholderAddress =
                        CardholderAddress(
                            providedPostalCode,
                            providedLine1,
                            actualPostalCode,
                            actualLine1,
                            verificationResult,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                class VerificationResult
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

                        return other is VerificationResult && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        @JvmField val NOT_CHECKED = VerificationResult(JsonField.of("not_checked"))

                        @JvmField
                        val POSTAL_CODE_MATCH_ADDRESS_NOT_CHECKED =
                            VerificationResult(
                                JsonField.of("postal_code_match_address_not_checked")
                            )

                        @JvmField
                        val POSTAL_CODE_MATCH_ADDRESS_NO_MATCH =
                            VerificationResult(JsonField.of("postal_code_match_address_no_match"))

                        @JvmField
                        val POSTAL_CODE_NO_MATCH_ADDRESS_MATCH =
                            VerificationResult(JsonField.of("postal_code_no_match_address_match"))

                        @JvmField val MATCH = VerificationResult(JsonField.of("match"))

                        @JvmField val NO_MATCH = VerificationResult(JsonField.of("no_match"))

                        @JvmStatic fun of(value: String) = VerificationResult(JsonField.of(value))
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
                            else ->
                                throw IncreaseInvalidDataException(
                                    "Unknown VerificationResult: $value"
                                )
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }
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

                private var hashCode: Int = 0

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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is NetworkDetails &&
                        this.category == other.category &&
                        this.visa == other.visa &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                category,
                                visa,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "NetworkDetails{category=$category, visa=$visa, additionalProperties=$additionalProperties}"

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
                ) {

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

                    private var hashCode: Int = 0

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

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Visa &&
                            this.electronicCommerceIndicator == other.electronicCommerceIndicator &&
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
                    ) {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is ElectronicCommerceIndicator && this.value == other.value
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
                    ) {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is PointOfServiceEntryMode && this.value == other.value
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
                }
            }

            class Reason
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) {

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

                    @JvmField val CARD_NOT_ACTIVE = Reason(JsonField.of("card_not_active"))

                    @JvmField
                    val PHYSICAL_CARD_NOT_ACTIVE = Reason(JsonField.of("physical_card_not_active"))

                    @JvmField val ENTITY_NOT_ACTIVE = Reason(JsonField.of("entity_not_active"))

                    @JvmField val GROUP_LOCKED = Reason(JsonField.of("group_locked"))

                    @JvmField val INSUFFICIENT_FUNDS = Reason(JsonField.of("insufficient_funds"))

                    @JvmField val CVV2_MISMATCH = Reason(JsonField.of("cvv2_mismatch"))

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
                val INTERNATIONAL_ACH_DECLINE = Category(JsonField.of("international_ach_decline"))

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
                WIRE_DECLINE,
                OTHER,
            }

            enum class Value {
                ACH_DECLINE,
                CARD_DECLINE,
                CHECK_DECLINE,
                INBOUND_REAL_TIME_PAYMENTS_TRANSFER_DECLINE,
                INTERNATIONAL_ACH_DECLINE,
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
                    WIRE_DECLINE -> Known.WIRE_DECLINE
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

            /**
             * A computer-readable number printed on the MICR line of business checks, usually the
             * check number. This is useful for positive pay checks, but can be unreliably
             * transmitted by the bank of first deposit.
             */
            fun auxiliaryOnUs(): Optional<String> =
                Optional.ofNullable(auxiliaryOnUs.getNullable("auxiliary_on_us"))

            /** Why the check was declined. */
            fun reason(): Reason = reason.getRequired("reason")

            /**
             * The declined amount in the minor unit of the destination account currency. For
             * dollars, for example, this is cents.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            /**
             * A computer-readable number printed on the MICR line of business checks, usually the
             * check number. This is useful for positive pay checks, but can be unreliably
             * transmitted by the bank of first deposit.
             */
            @JsonProperty("auxiliary_on_us") @ExcludeMissing fun _auxiliaryOnUs() = auxiliaryOnUs

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

                    @JvmField val ACH_ROUTE_DISABLED = Reason(JsonField.of("ach_route_disabled"))

                    @JvmField val ACH_ROUTE_CANCELED = Reason(JsonField.of("ach_route_canceled"))

                    @JvmField val BREACHES_LIMIT = Reason(JsonField.of("breaches_limit"))

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

                    @JvmStatic fun of(value: String) = Reason(JsonField.of(value))
                }

                enum class Known {
                    ACH_ROUTE_DISABLED,
                    ACH_ROUTE_CANCELED,
                    BREACHES_LIMIT,
                    ENTITY_NOT_ACTIVE,
                    GROUP_LOCKED,
                    INSUFFICIENT_FUNDS,
                    STOP_PAYMENT_REQUESTED,
                    DUPLICATE_PRESENTMENT,
                    NOT_AUTHORIZED,
                    AMOUNT_MISMATCH,
                    NOT_OUR_ITEM,
                }

                enum class Value {
                    ACH_ROUTE_DISABLED,
                    ACH_ROUTE_CANCELED,
                    BREACHES_LIMIT,
                    ENTITY_NOT_ACTIVE,
                    GROUP_LOCKED,
                    INSUFFICIENT_FUNDS,
                    STOP_PAYMENT_REQUESTED,
                    DUPLICATE_PRESENTMENT,
                    NOT_AUTHORIZED,
                    AMOUNT_MISMATCH,
                    NOT_OUR_ITEM,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        ACH_ROUTE_DISABLED -> Value.ACH_ROUTE_DISABLED
                        ACH_ROUTE_CANCELED -> Value.ACH_ROUTE_CANCELED
                        BREACHES_LIMIT -> Value.BREACHES_LIMIT
                        ENTITY_NOT_ACTIVE -> Value.ENTITY_NOT_ACTIVE
                        GROUP_LOCKED -> Value.GROUP_LOCKED
                        INSUFFICIENT_FUNDS -> Value.INSUFFICIENT_FUNDS
                        STOP_PAYMENT_REQUESTED -> Value.STOP_PAYMENT_REQUESTED
                        DUPLICATE_PRESENTMENT -> Value.DUPLICATE_PRESENTMENT
                        NOT_AUTHORIZED -> Value.NOT_AUTHORIZED
                        AMOUNT_MISMATCH -> Value.AMOUNT_MISMATCH
                        NOT_OUR_ITEM -> Value.NOT_OUR_ITEM
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        ACH_ROUTE_DISABLED -> Known.ACH_ROUTE_DISABLED
                        ACH_ROUTE_CANCELED -> Known.ACH_ROUTE_CANCELED
                        BREACHES_LIMIT -> Known.BREACHES_LIMIT
                        ENTITY_NOT_ACTIVE -> Known.ENTITY_NOT_ACTIVE
                        GROUP_LOCKED -> Known.GROUP_LOCKED
                        INSUFFICIENT_FUNDS -> Known.INSUFFICIENT_FUNDS
                        STOP_PAYMENT_REQUESTED -> Known.STOP_PAYMENT_REQUESTED
                        DUPLICATE_PRESENTMENT -> Known.DUPLICATE_PRESENTMENT
                        NOT_AUTHORIZED -> Known.NOT_AUTHORIZED
                        AMOUNT_MISMATCH -> Known.AMOUNT_MISMATCH
                        NOT_OUR_ITEM -> Known.NOT_OUR_ITEM
                        else -> throw IncreaseInvalidDataException("Unknown Reason: $value")
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
             * transfer's currency. This will always be "USD" for a Real-Time Payments transfer.
             */
            fun currency(): Currency = currency.getRequired("currency")

            /** Why the transfer was declined. */
            fun reason(): Reason = reason.getRequired("reason")

            /** The name the sender of the transfer specified as the recipient of the transfer. */
            fun creditorName(): String = creditorName.getRequired("creditor_name")

            /** The name provided by the sender of the transfer. */
            fun debtorName(): String = debtorName.getRequired("debtor_name")

            /** The account number of the account that sent the transfer. */
            fun debtorAccountNumber(): String =
                debtorAccountNumber.getRequired("debtor_account_number")

            /** The routing number of the account that sent the transfer. */
            fun debtorRoutingNumber(): String =
                debtorRoutingNumber.getRequired("debtor_routing_number")

            /** The Real-Time Payments network identification of the declined transfer. */
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
             * transfer's currency. This will always be "USD" for a Real-Time Payments transfer.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            /** Why the transfer was declined. */
            @JsonProperty("reason") @ExcludeMissing fun _reason() = reason

            /** The name the sender of the transfer specified as the recipient of the transfer. */
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

            /** The Real-Time Payments network identification of the declined transfer. */
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
                    inboundRealTimePaymentsTransferDecline: InboundRealTimePaymentsTransferDecline
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

                /** Why the transfer was declined. */
                fun reason(reason: Reason) = reason(JsonField.of(reason))

                /** Why the transfer was declined. */
                @JsonProperty("reason")
                @ExcludeMissing
                fun reason(reason: JsonField<Reason>) = apply { this.reason = reason }

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
            ) {

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
         * An International ACH Decline object. This field will be present in the JSON response if
         * and only if `category` is equal to `international_ach_decline`.
         */
        @JsonDeserialize(builder = InternationalAchDecline.Builder::class)
        @NoAutoDetect
        class InternationalAchDecline
        private constructor(
            private val amount: JsonField<Long>,
            private val foreignExchangeIndicator: JsonField<ForeignExchangeIndicator>,
            private val foreignExchangeReferenceIndicator:
                JsonField<ForeignExchangeReferenceIndicator>,
            private val foreignExchangeReference: JsonField<String>,
            private val destinationCountryCode: JsonField<String>,
            private val destinationCurrencyCode: JsonField<String>,
            private val foreignPaymentAmount: JsonField<Long>,
            private val foreignTraceNumber: JsonField<String>,
            private val internationalTransactionTypeCode:
                JsonField<InternationalTransactionTypeCode>,
            private val originatingCurrencyCode: JsonField<String>,
            private val originatingDepositoryFinancialInstitutionName: JsonField<String>,
            private val originatingDepositoryFinancialInstitutionIdQualifier:
                JsonField<OriginatingDepositoryFinancialInstitutionIdQualifier>,
            private val originatingDepositoryFinancialInstitutionId: JsonField<String>,
            private val originatingDepositoryFinancialInstitutionBranchCountry: JsonField<String>,
            private val originatorCompanyEntryDescription: JsonField<String>,
            private val originatorName: JsonField<String>,
            private val originatorStreetAddress: JsonField<String>,
            private val originatorCity: JsonField<String>,
            private val originatorStateOrProvince: JsonField<String>,
            private val originatorPostalCode: JsonField<String>,
            private val originatorCountry: JsonField<String>,
            private val originatorIdentification: JsonField<String>,
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
            private val receivingDepositoryFinancialInstitutionIdQualifier:
                JsonField<ReceivingDepositoryFinancialInstitutionIdQualifier>,
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

            /** A description of how the foreign exchange rate was calculated. */
            fun foreignExchangeIndicator(): ForeignExchangeIndicator =
                foreignExchangeIndicator.getRequired("foreign_exchange_indicator")

            /**
             * An instruction of how to interpret the `foreign_exchange_reference` field for this
             * Transaction.
             */
            fun foreignExchangeReferenceIndicator(): ForeignExchangeReferenceIndicator =
                foreignExchangeReferenceIndicator.getRequired(
                    "foreign_exchange_reference_indicator"
                )

            /**
             * Depending on the `foreign_exchange_reference_indicator`, an exchange rate or a
             * reference to a well-known rate.
             */
            fun foreignExchangeReference(): Optional<String> =
                Optional.ofNullable(
                    foreignExchangeReference.getNullable("foreign_exchange_reference")
                )

            /**
             * The [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2 country
             * code of the destination country.
             */
            fun destinationCountryCode(): String =
                destinationCountryCode.getRequired("destination_country_code")

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code for the
             * destination bank account.
             */
            fun destinationCurrencyCode(): String =
                destinationCurrencyCode.getRequired("destination_currency_code")

            /**
             * The amount in the minor unit of the foreign payment currency. For dollars, for
             * example, this is cents.
             */
            fun foreignPaymentAmount(): Long =
                foreignPaymentAmount.getRequired("foreign_payment_amount")

            /** A reference number in the foreign banking infrastructure. */
            fun foreignTraceNumber(): Optional<String> =
                Optional.ofNullable(foreignTraceNumber.getNullable("foreign_trace_number"))

            /** The type of transfer. Set by the originator. */
            fun internationalTransactionTypeCode(): InternationalTransactionTypeCode =
                internationalTransactionTypeCode.getRequired("international_transaction_type_code")

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code for the
             * originating bank account.
             */
            fun originatingCurrencyCode(): String =
                originatingCurrencyCode.getRequired("originating_currency_code")

            /**
             * The name of the originating bank. Sometimes this will refer to an American bank and
             * obscure the correspondent foreign bank.
             */
            fun originatingDepositoryFinancialInstitutionName(): String =
                originatingDepositoryFinancialInstitutionName.getRequired(
                    "originating_depository_financial_institution_name"
                )

            /**
             * An instruction of how to interpret the
             * `originating_depository_financial_institution_id` field for this Transaction.
             */
            fun originatingDepositoryFinancialInstitutionIdQualifier():
                OriginatingDepositoryFinancialInstitutionIdQualifier =
                originatingDepositoryFinancialInstitutionIdQualifier.getRequired(
                    "originating_depository_financial_institution_id_qualifier"
                )

            /**
             * An identifier for the originating bank. One of an International Bank Account Number
             * (IBAN) bank identifier, SWIFT Bank Identification Code (BIC), or a domestic
             * identifier like a US Routing Number.
             */
            fun originatingDepositoryFinancialInstitutionId(): String =
                originatingDepositoryFinancialInstitutionId.getRequired(
                    "originating_depository_financial_institution_id"
                )

            /**
             * The [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2 country
             * code of the originating branch country.
             */
            fun originatingDepositoryFinancialInstitutionBranchCountry(): String =
                originatingDepositoryFinancialInstitutionBranchCountry.getRequired(
                    "originating_depository_financial_institution_branch_country"
                )

            /** A description field set by the originator. */
            fun originatorCompanyEntryDescription(): String =
                originatorCompanyEntryDescription.getRequired(
                    "originator_company_entry_description"
                )

            /** Either the name of the originator or an intermediary money transmitter. */
            fun originatorName(): String = originatorName.getRequired("originator_name")

            /** A portion of the originator address. This may be incomplete. */
            fun originatorStreetAddress(): String =
                originatorStreetAddress.getRequired("originator_street_address")

            /** A portion of the originator address. This may be incomplete. */
            fun originatorCity(): String = originatorCity.getRequired("originator_city")

            /** A portion of the originator address. This may be incomplete. */
            fun originatorStateOrProvince(): Optional<String> =
                Optional.ofNullable(
                    originatorStateOrProvince.getNullable("originator_state_or_province")
                )

            /** A portion of the originator address. This may be incomplete. */
            fun originatorPostalCode(): Optional<String> =
                Optional.ofNullable(originatorPostalCode.getNullable("originator_postal_code"))

            /**
             * A portion of the originator address. The
             * [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2 country code of
             * the originator country.
             */
            fun originatorCountry(): String = originatorCountry.getRequired("originator_country")

            /**
             * An identifier for the originating company. This is generally stable across multiple
             * ACH transfers.
             */
            fun originatorIdentification(): String =
                originatorIdentification.getRequired("originator_identification")

            /** A description field set by the originator. */
            fun paymentRelatedInformation(): Optional<String> =
                Optional.ofNullable(
                    paymentRelatedInformation.getNullable("payment_related_information")
                )

            /** A description field set by the originator. */
            fun paymentRelatedInformation2(): Optional<String> =
                Optional.ofNullable(
                    paymentRelatedInformation2.getNullable("payment_related_information2")
                )

            /** An identification number the originator uses for the receiver. */
            fun receiverIdentificationNumber(): Optional<String> =
                Optional.ofNullable(
                    receiverIdentificationNumber.getNullable("receiver_identification_number")
                )

            /** A portion of the receiver address. This may be incomplete. */
            fun receiverStreetAddress(): String =
                receiverStreetAddress.getRequired("receiver_street_address")

            /** A portion of the receiver address. This may be incomplete. */
            fun receiverCity(): String = receiverCity.getRequired("receiver_city")

            /** A portion of the receiver address. This may be incomplete. */
            fun receiverStateOrProvince(): Optional<String> =
                Optional.ofNullable(
                    receiverStateOrProvince.getNullable("receiver_state_or_province")
                )

            /**
             * A portion of the receiver address. The
             * [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2 country code of
             * the receiver country.
             */
            fun receiverCountry(): String = receiverCountry.getRequired("receiver_country")

            /** A portion of the receiver address. This may be incomplete. */
            fun receiverPostalCode(): Optional<String> =
                Optional.ofNullable(receiverPostalCode.getNullable("receiver_postal_code"))

            /** The name of the receiver of the transfer. This is not verified by Increase. */
            fun receivingCompanyOrIndividualName(): String =
                receivingCompanyOrIndividualName.getRequired("receiving_company_or_individual_name")

            /** The name of the receiving bank, as set by the sending financial institution. */
            fun receivingDepositoryFinancialInstitutionName(): String =
                receivingDepositoryFinancialInstitutionName.getRequired(
                    "receiving_depository_financial_institution_name"
                )

            /**
             * An instruction of how to interpret the
             * `receiving_depository_financial_institution_id` field for this Transaction.
             */
            fun receivingDepositoryFinancialInstitutionIdQualifier():
                ReceivingDepositoryFinancialInstitutionIdQualifier =
                receivingDepositoryFinancialInstitutionIdQualifier.getRequired(
                    "receiving_depository_financial_institution_id_qualifier"
                )

            /**
             * An identifier for the receiving bank. One of an International Bank Account Number
             * (IBAN) bank identifier, SWIFT Bank Identification Code (BIC), or a domestic
             * identifier like a US Routing Number.
             */
            fun receivingDepositoryFinancialInstitutionId(): String =
                receivingDepositoryFinancialInstitutionId.getRequired(
                    "receiving_depository_financial_institution_id"
                )

            /**
             * The [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2 country
             * code of the receiving bank country.
             */
            fun receivingDepositoryFinancialInstitutionCountry(): String =
                receivingDepositoryFinancialInstitutionCountry.getRequired(
                    "receiving_depository_financial_institution_country"
                )

            /**
             * A 15 digit number recorded in the Nacha file and available to both the originating
             * and receiving bank. Along with the amount, date, and originating routing number, this
             * can be used to identify the ACH transfer at either bank. ACH trace numbers are not
             * unique, but are
             * [used to correlate returns](https://increase.com/documentation/ach#returns).
             */
            fun traceNumber(): String = traceNumber.getRequired("trace_number")

            /**
             * The declined amount in the minor unit of the destination account currency. For
             * dollars, for example, this is cents.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            /** A description of how the foreign exchange rate was calculated. */
            @JsonProperty("foreign_exchange_indicator")
            @ExcludeMissing
            fun _foreignExchangeIndicator() = foreignExchangeIndicator

            /**
             * An instruction of how to interpret the `foreign_exchange_reference` field for this
             * Transaction.
             */
            @JsonProperty("foreign_exchange_reference_indicator")
            @ExcludeMissing
            fun _foreignExchangeReferenceIndicator() = foreignExchangeReferenceIndicator

            /**
             * Depending on the `foreign_exchange_reference_indicator`, an exchange rate or a
             * reference to a well-known rate.
             */
            @JsonProperty("foreign_exchange_reference")
            @ExcludeMissing
            fun _foreignExchangeReference() = foreignExchangeReference

            /**
             * The [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2 country
             * code of the destination country.
             */
            @JsonProperty("destination_country_code")
            @ExcludeMissing
            fun _destinationCountryCode() = destinationCountryCode

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code for the
             * destination bank account.
             */
            @JsonProperty("destination_currency_code")
            @ExcludeMissing
            fun _destinationCurrencyCode() = destinationCurrencyCode

            /**
             * The amount in the minor unit of the foreign payment currency. For dollars, for
             * example, this is cents.
             */
            @JsonProperty("foreign_payment_amount")
            @ExcludeMissing
            fun _foreignPaymentAmount() = foreignPaymentAmount

            /** A reference number in the foreign banking infrastructure. */
            @JsonProperty("foreign_trace_number")
            @ExcludeMissing
            fun _foreignTraceNumber() = foreignTraceNumber

            /** The type of transfer. Set by the originator. */
            @JsonProperty("international_transaction_type_code")
            @ExcludeMissing
            fun _internationalTransactionTypeCode() = internationalTransactionTypeCode

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code for the
             * originating bank account.
             */
            @JsonProperty("originating_currency_code")
            @ExcludeMissing
            fun _originatingCurrencyCode() = originatingCurrencyCode

            /**
             * The name of the originating bank. Sometimes this will refer to an American bank and
             * obscure the correspondent foreign bank.
             */
            @JsonProperty("originating_depository_financial_institution_name")
            @ExcludeMissing
            fun _originatingDepositoryFinancialInstitutionName() =
                originatingDepositoryFinancialInstitutionName

            /**
             * An instruction of how to interpret the
             * `originating_depository_financial_institution_id` field for this Transaction.
             */
            @JsonProperty("originating_depository_financial_institution_id_qualifier")
            @ExcludeMissing
            fun _originatingDepositoryFinancialInstitutionIdQualifier() =
                originatingDepositoryFinancialInstitutionIdQualifier

            /**
             * An identifier for the originating bank. One of an International Bank Account Number
             * (IBAN) bank identifier, SWIFT Bank Identification Code (BIC), or a domestic
             * identifier like a US Routing Number.
             */
            @JsonProperty("originating_depository_financial_institution_id")
            @ExcludeMissing
            fun _originatingDepositoryFinancialInstitutionId() =
                originatingDepositoryFinancialInstitutionId

            /**
             * The [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2 country
             * code of the originating branch country.
             */
            @JsonProperty("originating_depository_financial_institution_branch_country")
            @ExcludeMissing
            fun _originatingDepositoryFinancialInstitutionBranchCountry() =
                originatingDepositoryFinancialInstitutionBranchCountry

            /** A description field set by the originator. */
            @JsonProperty("originator_company_entry_description")
            @ExcludeMissing
            fun _originatorCompanyEntryDescription() = originatorCompanyEntryDescription

            /** Either the name of the originator or an intermediary money transmitter. */
            @JsonProperty("originator_name") @ExcludeMissing fun _originatorName() = originatorName

            /** A portion of the originator address. This may be incomplete. */
            @JsonProperty("originator_street_address")
            @ExcludeMissing
            fun _originatorStreetAddress() = originatorStreetAddress

            /** A portion of the originator address. This may be incomplete. */
            @JsonProperty("originator_city") @ExcludeMissing fun _originatorCity() = originatorCity

            /** A portion of the originator address. This may be incomplete. */
            @JsonProperty("originator_state_or_province")
            @ExcludeMissing
            fun _originatorStateOrProvince() = originatorStateOrProvince

            /** A portion of the originator address. This may be incomplete. */
            @JsonProperty("originator_postal_code")
            @ExcludeMissing
            fun _originatorPostalCode() = originatorPostalCode

            /**
             * A portion of the originator address. The
             * [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2 country code of
             * the originator country.
             */
            @JsonProperty("originator_country")
            @ExcludeMissing
            fun _originatorCountry() = originatorCountry

            /**
             * An identifier for the originating company. This is generally stable across multiple
             * ACH transfers.
             */
            @JsonProperty("originator_identification")
            @ExcludeMissing
            fun _originatorIdentification() = originatorIdentification

            /** A description field set by the originator. */
            @JsonProperty("payment_related_information")
            @ExcludeMissing
            fun _paymentRelatedInformation() = paymentRelatedInformation

            /** A description field set by the originator. */
            @JsonProperty("payment_related_information2")
            @ExcludeMissing
            fun _paymentRelatedInformation2() = paymentRelatedInformation2

            /** An identification number the originator uses for the receiver. */
            @JsonProperty("receiver_identification_number")
            @ExcludeMissing
            fun _receiverIdentificationNumber() = receiverIdentificationNumber

            /** A portion of the receiver address. This may be incomplete. */
            @JsonProperty("receiver_street_address")
            @ExcludeMissing
            fun _receiverStreetAddress() = receiverStreetAddress

            /** A portion of the receiver address. This may be incomplete. */
            @JsonProperty("receiver_city") @ExcludeMissing fun _receiverCity() = receiverCity

            /** A portion of the receiver address. This may be incomplete. */
            @JsonProperty("receiver_state_or_province")
            @ExcludeMissing
            fun _receiverStateOrProvince() = receiverStateOrProvince

            /**
             * A portion of the receiver address. The
             * [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2 country code of
             * the receiver country.
             */
            @JsonProperty("receiver_country")
            @ExcludeMissing
            fun _receiverCountry() = receiverCountry

            /** A portion of the receiver address. This may be incomplete. */
            @JsonProperty("receiver_postal_code")
            @ExcludeMissing
            fun _receiverPostalCode() = receiverPostalCode

            /** The name of the receiver of the transfer. This is not verified by Increase. */
            @JsonProperty("receiving_company_or_individual_name")
            @ExcludeMissing
            fun _receivingCompanyOrIndividualName() = receivingCompanyOrIndividualName

            /** The name of the receiving bank, as set by the sending financial institution. */
            @JsonProperty("receiving_depository_financial_institution_name")
            @ExcludeMissing
            fun _receivingDepositoryFinancialInstitutionName() =
                receivingDepositoryFinancialInstitutionName

            /**
             * An instruction of how to interpret the
             * `receiving_depository_financial_institution_id` field for this Transaction.
             */
            @JsonProperty("receiving_depository_financial_institution_id_qualifier")
            @ExcludeMissing
            fun _receivingDepositoryFinancialInstitutionIdQualifier() =
                receivingDepositoryFinancialInstitutionIdQualifier

            /**
             * An identifier for the receiving bank. One of an International Bank Account Number
             * (IBAN) bank identifier, SWIFT Bank Identification Code (BIC), or a domestic
             * identifier like a US Routing Number.
             */
            @JsonProperty("receiving_depository_financial_institution_id")
            @ExcludeMissing
            fun _receivingDepositoryFinancialInstitutionId() =
                receivingDepositoryFinancialInstitutionId

            /**
             * The [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2 country
             * code of the receiving bank country.
             */
            @JsonProperty("receiving_depository_financial_institution_country")
            @ExcludeMissing
            fun _receivingDepositoryFinancialInstitutionCountry() =
                receivingDepositoryFinancialInstitutionCountry

            /**
             * A 15 digit number recorded in the Nacha file and available to both the originating
             * and receiving bank. Along with the amount, date, and originating routing number, this
             * can be used to identify the ACH transfer at either bank. ACH trace numbers are not
             * unique, but are
             * [used to correlate returns](https://increase.com/documentation/ach#returns).
             */
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
                    originatorCompanyEntryDescription()
                    originatorName()
                    originatorStreetAddress()
                    originatorCity()
                    originatorStateOrProvince()
                    originatorPostalCode()
                    originatorCountry()
                    originatorIdentification()
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
                    this.originatorCompanyEntryDescription ==
                        other.originatorCompanyEntryDescription &&
                    this.originatorName == other.originatorName &&
                    this.originatorStreetAddress == other.originatorStreetAddress &&
                    this.originatorCity == other.originatorCity &&
                    this.originatorStateOrProvince == other.originatorStateOrProvince &&
                    this.originatorPostalCode == other.originatorPostalCode &&
                    this.originatorCountry == other.originatorCountry &&
                    this.originatorIdentification == other.originatorIdentification &&
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
                            originatorCompanyEntryDescription,
                            originatorName,
                            originatorStreetAddress,
                            originatorCity,
                            originatorStateOrProvince,
                            originatorPostalCode,
                            originatorCountry,
                            originatorIdentification,
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
                "InternationalAchDecline{amount=$amount, foreignExchangeIndicator=$foreignExchangeIndicator, foreignExchangeReferenceIndicator=$foreignExchangeReferenceIndicator, foreignExchangeReference=$foreignExchangeReference, destinationCountryCode=$destinationCountryCode, destinationCurrencyCode=$destinationCurrencyCode, foreignPaymentAmount=$foreignPaymentAmount, foreignTraceNumber=$foreignTraceNumber, internationalTransactionTypeCode=$internationalTransactionTypeCode, originatingCurrencyCode=$originatingCurrencyCode, originatingDepositoryFinancialInstitutionName=$originatingDepositoryFinancialInstitutionName, originatingDepositoryFinancialInstitutionIdQualifier=$originatingDepositoryFinancialInstitutionIdQualifier, originatingDepositoryFinancialInstitutionId=$originatingDepositoryFinancialInstitutionId, originatingDepositoryFinancialInstitutionBranchCountry=$originatingDepositoryFinancialInstitutionBranchCountry, originatorCompanyEntryDescription=$originatorCompanyEntryDescription, originatorName=$originatorName, originatorStreetAddress=$originatorStreetAddress, originatorCity=$originatorCity, originatorStateOrProvince=$originatorStateOrProvince, originatorPostalCode=$originatorPostalCode, originatorCountry=$originatorCountry, originatorIdentification=$originatorIdentification, paymentRelatedInformation=$paymentRelatedInformation, paymentRelatedInformation2=$paymentRelatedInformation2, receiverIdentificationNumber=$receiverIdentificationNumber, receiverStreetAddress=$receiverStreetAddress, receiverCity=$receiverCity, receiverStateOrProvince=$receiverStateOrProvince, receiverCountry=$receiverCountry, receiverPostalCode=$receiverPostalCode, receivingCompanyOrIndividualName=$receivingCompanyOrIndividualName, receivingDepositoryFinancialInstitutionName=$receivingDepositoryFinancialInstitutionName, receivingDepositoryFinancialInstitutionIdQualifier=$receivingDepositoryFinancialInstitutionIdQualifier, receivingDepositoryFinancialInstitutionId=$receivingDepositoryFinancialInstitutionId, receivingDepositoryFinancialInstitutionCountry=$receivingDepositoryFinancialInstitutionCountry, traceNumber=$traceNumber, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var amount: JsonField<Long> = JsonMissing.of()
                private var foreignExchangeIndicator: JsonField<ForeignExchangeIndicator> =
                    JsonMissing.of()
                private var foreignExchangeReferenceIndicator:
                    JsonField<ForeignExchangeReferenceIndicator> =
                    JsonMissing.of()
                private var foreignExchangeReference: JsonField<String> = JsonMissing.of()
                private var destinationCountryCode: JsonField<String> = JsonMissing.of()
                private var destinationCurrencyCode: JsonField<String> = JsonMissing.of()
                private var foreignPaymentAmount: JsonField<Long> = JsonMissing.of()
                private var foreignTraceNumber: JsonField<String> = JsonMissing.of()
                private var internationalTransactionTypeCode:
                    JsonField<InternationalTransactionTypeCode> =
                    JsonMissing.of()
                private var originatingCurrencyCode: JsonField<String> = JsonMissing.of()
                private var originatingDepositoryFinancialInstitutionName: JsonField<String> =
                    JsonMissing.of()
                private var originatingDepositoryFinancialInstitutionIdQualifier:
                    JsonField<OriginatingDepositoryFinancialInstitutionIdQualifier> =
                    JsonMissing.of()
                private var originatingDepositoryFinancialInstitutionId: JsonField<String> =
                    JsonMissing.of()
                private var originatingDepositoryFinancialInstitutionBranchCountry:
                    JsonField<String> =
                    JsonMissing.of()
                private var originatorCompanyEntryDescription: JsonField<String> = JsonMissing.of()
                private var originatorName: JsonField<String> = JsonMissing.of()
                private var originatorStreetAddress: JsonField<String> = JsonMissing.of()
                private var originatorCity: JsonField<String> = JsonMissing.of()
                private var originatorStateOrProvince: JsonField<String> = JsonMissing.of()
                private var originatorPostalCode: JsonField<String> = JsonMissing.of()
                private var originatorCountry: JsonField<String> = JsonMissing.of()
                private var originatorIdentification: JsonField<String> = JsonMissing.of()
                private var paymentRelatedInformation: JsonField<String> = JsonMissing.of()
                private var paymentRelatedInformation2: JsonField<String> = JsonMissing.of()
                private var receiverIdentificationNumber: JsonField<String> = JsonMissing.of()
                private var receiverStreetAddress: JsonField<String> = JsonMissing.of()
                private var receiverCity: JsonField<String> = JsonMissing.of()
                private var receiverStateOrProvince: JsonField<String> = JsonMissing.of()
                private var receiverCountry: JsonField<String> = JsonMissing.of()
                private var receiverPostalCode: JsonField<String> = JsonMissing.of()
                private var receivingCompanyOrIndividualName: JsonField<String> = JsonMissing.of()
                private var receivingDepositoryFinancialInstitutionName: JsonField<String> =
                    JsonMissing.of()
                private var receivingDepositoryFinancialInstitutionIdQualifier:
                    JsonField<ReceivingDepositoryFinancialInstitutionIdQualifier> =
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
                    this.foreignExchangeIndicator = internationalAchDecline.foreignExchangeIndicator
                    this.foreignExchangeReferenceIndicator =
                        internationalAchDecline.foreignExchangeReferenceIndicator
                    this.foreignExchangeReference = internationalAchDecline.foreignExchangeReference
                    this.destinationCountryCode = internationalAchDecline.destinationCountryCode
                    this.destinationCurrencyCode = internationalAchDecline.destinationCurrencyCode
                    this.foreignPaymentAmount = internationalAchDecline.foreignPaymentAmount
                    this.foreignTraceNumber = internationalAchDecline.foreignTraceNumber
                    this.internationalTransactionTypeCode =
                        internationalAchDecline.internationalTransactionTypeCode
                    this.originatingCurrencyCode = internationalAchDecline.originatingCurrencyCode
                    this.originatingDepositoryFinancialInstitutionName =
                        internationalAchDecline.originatingDepositoryFinancialInstitutionName
                    this.originatingDepositoryFinancialInstitutionIdQualifier =
                        internationalAchDecline.originatingDepositoryFinancialInstitutionIdQualifier
                    this.originatingDepositoryFinancialInstitutionId =
                        internationalAchDecline.originatingDepositoryFinancialInstitutionId
                    this.originatingDepositoryFinancialInstitutionBranchCountry =
                        internationalAchDecline
                            .originatingDepositoryFinancialInstitutionBranchCountry
                    this.originatorCompanyEntryDescription =
                        internationalAchDecline.originatorCompanyEntryDescription
                    this.originatorName = internationalAchDecline.originatorName
                    this.originatorStreetAddress = internationalAchDecline.originatorStreetAddress
                    this.originatorCity = internationalAchDecline.originatorCity
                    this.originatorStateOrProvince =
                        internationalAchDecline.originatorStateOrProvince
                    this.originatorPostalCode = internationalAchDecline.originatorPostalCode
                    this.originatorCountry = internationalAchDecline.originatorCountry
                    this.originatorIdentification = internationalAchDecline.originatorIdentification
                    this.paymentRelatedInformation =
                        internationalAchDecline.paymentRelatedInformation
                    this.paymentRelatedInformation2 =
                        internationalAchDecline.paymentRelatedInformation2
                    this.receiverIdentificationNumber =
                        internationalAchDecline.receiverIdentificationNumber
                    this.receiverStreetAddress = internationalAchDecline.receiverStreetAddress
                    this.receiverCity = internationalAchDecline.receiverCity
                    this.receiverStateOrProvince = internationalAchDecline.receiverStateOrProvince
                    this.receiverCountry = internationalAchDecline.receiverCountry
                    this.receiverPostalCode = internationalAchDecline.receiverPostalCode
                    this.receivingCompanyOrIndividualName =
                        internationalAchDecline.receivingCompanyOrIndividualName
                    this.receivingDepositoryFinancialInstitutionName =
                        internationalAchDecline.receivingDepositoryFinancialInstitutionName
                    this.receivingDepositoryFinancialInstitutionIdQualifier =
                        internationalAchDecline.receivingDepositoryFinancialInstitutionIdQualifier
                    this.receivingDepositoryFinancialInstitutionId =
                        internationalAchDecline.receivingDepositoryFinancialInstitutionId
                    this.receivingDepositoryFinancialInstitutionCountry =
                        internationalAchDecline.receivingDepositoryFinancialInstitutionCountry
                    this.traceNumber = internationalAchDecline.traceNumber
                    additionalProperties(internationalAchDecline.additionalProperties)
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

                /** A description of how the foreign exchange rate was calculated. */
                fun foreignExchangeIndicator(foreignExchangeIndicator: ForeignExchangeIndicator) =
                    foreignExchangeIndicator(JsonField.of(foreignExchangeIndicator))

                /** A description of how the foreign exchange rate was calculated. */
                @JsonProperty("foreign_exchange_indicator")
                @ExcludeMissing
                fun foreignExchangeIndicator(
                    foreignExchangeIndicator: JsonField<ForeignExchangeIndicator>
                ) = apply { this.foreignExchangeIndicator = foreignExchangeIndicator }

                /**
                 * An instruction of how to interpret the `foreign_exchange_reference` field for
                 * this Transaction.
                 */
                fun foreignExchangeReferenceIndicator(
                    foreignExchangeReferenceIndicator: ForeignExchangeReferenceIndicator
                ) =
                    foreignExchangeReferenceIndicator(
                        JsonField.of(foreignExchangeReferenceIndicator)
                    )

                /**
                 * An instruction of how to interpret the `foreign_exchange_reference` field for
                 * this Transaction.
                 */
                @JsonProperty("foreign_exchange_reference_indicator")
                @ExcludeMissing
                fun foreignExchangeReferenceIndicator(
                    foreignExchangeReferenceIndicator: JsonField<ForeignExchangeReferenceIndicator>
                ) = apply {
                    this.foreignExchangeReferenceIndicator = foreignExchangeReferenceIndicator
                }

                /**
                 * Depending on the `foreign_exchange_reference_indicator`, an exchange rate or a
                 * reference to a well-known rate.
                 */
                fun foreignExchangeReference(foreignExchangeReference: String) =
                    foreignExchangeReference(JsonField.of(foreignExchangeReference))

                /**
                 * Depending on the `foreign_exchange_reference_indicator`, an exchange rate or a
                 * reference to a well-known rate.
                 */
                @JsonProperty("foreign_exchange_reference")
                @ExcludeMissing
                fun foreignExchangeReference(foreignExchangeReference: JsonField<String>) = apply {
                    this.foreignExchangeReference = foreignExchangeReference
                }

                /**
                 * The [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2 country
                 * code of the destination country.
                 */
                fun destinationCountryCode(destinationCountryCode: String) =
                    destinationCountryCode(JsonField.of(destinationCountryCode))

                /**
                 * The [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2 country
                 * code of the destination country.
                 */
                @JsonProperty("destination_country_code")
                @ExcludeMissing
                fun destinationCountryCode(destinationCountryCode: JsonField<String>) = apply {
                    this.destinationCountryCode = destinationCountryCode
                }

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code for the
                 * destination bank account.
                 */
                fun destinationCurrencyCode(destinationCurrencyCode: String) =
                    destinationCurrencyCode(JsonField.of(destinationCurrencyCode))

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code for the
                 * destination bank account.
                 */
                @JsonProperty("destination_currency_code")
                @ExcludeMissing
                fun destinationCurrencyCode(destinationCurrencyCode: JsonField<String>) = apply {
                    this.destinationCurrencyCode = destinationCurrencyCode
                }

                /**
                 * The amount in the minor unit of the foreign payment currency. For dollars, for
                 * example, this is cents.
                 */
                fun foreignPaymentAmount(foreignPaymentAmount: Long) =
                    foreignPaymentAmount(JsonField.of(foreignPaymentAmount))

                /**
                 * The amount in the minor unit of the foreign payment currency. For dollars, for
                 * example, this is cents.
                 */
                @JsonProperty("foreign_payment_amount")
                @ExcludeMissing
                fun foreignPaymentAmount(foreignPaymentAmount: JsonField<Long>) = apply {
                    this.foreignPaymentAmount = foreignPaymentAmount
                }

                /** A reference number in the foreign banking infrastructure. */
                fun foreignTraceNumber(foreignTraceNumber: String) =
                    foreignTraceNumber(JsonField.of(foreignTraceNumber))

                /** A reference number in the foreign banking infrastructure. */
                @JsonProperty("foreign_trace_number")
                @ExcludeMissing
                fun foreignTraceNumber(foreignTraceNumber: JsonField<String>) = apply {
                    this.foreignTraceNumber = foreignTraceNumber
                }

                /** The type of transfer. Set by the originator. */
                fun internationalTransactionTypeCode(
                    internationalTransactionTypeCode: InternationalTransactionTypeCode
                ) = internationalTransactionTypeCode(JsonField.of(internationalTransactionTypeCode))

                /** The type of transfer. Set by the originator. */
                @JsonProperty("international_transaction_type_code")
                @ExcludeMissing
                fun internationalTransactionTypeCode(
                    internationalTransactionTypeCode: JsonField<InternationalTransactionTypeCode>
                ) = apply {
                    this.internationalTransactionTypeCode = internationalTransactionTypeCode
                }

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code for the
                 * originating bank account.
                 */
                fun originatingCurrencyCode(originatingCurrencyCode: String) =
                    originatingCurrencyCode(JsonField.of(originatingCurrencyCode))

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code for the
                 * originating bank account.
                 */
                @JsonProperty("originating_currency_code")
                @ExcludeMissing
                fun originatingCurrencyCode(originatingCurrencyCode: JsonField<String>) = apply {
                    this.originatingCurrencyCode = originatingCurrencyCode
                }

                /**
                 * The name of the originating bank. Sometimes this will refer to an American bank
                 * and obscure the correspondent foreign bank.
                 */
                fun originatingDepositoryFinancialInstitutionName(
                    originatingDepositoryFinancialInstitutionName: String
                ) =
                    originatingDepositoryFinancialInstitutionName(
                        JsonField.of(originatingDepositoryFinancialInstitutionName)
                    )

                /**
                 * The name of the originating bank. Sometimes this will refer to an American bank
                 * and obscure the correspondent foreign bank.
                 */
                @JsonProperty("originating_depository_financial_institution_name")
                @ExcludeMissing
                fun originatingDepositoryFinancialInstitutionName(
                    originatingDepositoryFinancialInstitutionName: JsonField<String>
                ) = apply {
                    this.originatingDepositoryFinancialInstitutionName =
                        originatingDepositoryFinancialInstitutionName
                }

                /**
                 * An instruction of how to interpret the
                 * `originating_depository_financial_institution_id` field for this Transaction.
                 */
                fun originatingDepositoryFinancialInstitutionIdQualifier(
                    originatingDepositoryFinancialInstitutionIdQualifier:
                        OriginatingDepositoryFinancialInstitutionIdQualifier
                ) =
                    originatingDepositoryFinancialInstitutionIdQualifier(
                        JsonField.of(originatingDepositoryFinancialInstitutionIdQualifier)
                    )

                /**
                 * An instruction of how to interpret the
                 * `originating_depository_financial_institution_id` field for this Transaction.
                 */
                @JsonProperty("originating_depository_financial_institution_id_qualifier")
                @ExcludeMissing
                fun originatingDepositoryFinancialInstitutionIdQualifier(
                    originatingDepositoryFinancialInstitutionIdQualifier:
                        JsonField<OriginatingDepositoryFinancialInstitutionIdQualifier>
                ) = apply {
                    this.originatingDepositoryFinancialInstitutionIdQualifier =
                        originatingDepositoryFinancialInstitutionIdQualifier
                }

                /**
                 * An identifier for the originating bank. One of an International Bank Account
                 * Number (IBAN) bank identifier, SWIFT Bank Identification Code (BIC), or a
                 * domestic identifier like a US Routing Number.
                 */
                fun originatingDepositoryFinancialInstitutionId(
                    originatingDepositoryFinancialInstitutionId: String
                ) =
                    originatingDepositoryFinancialInstitutionId(
                        JsonField.of(originatingDepositoryFinancialInstitutionId)
                    )

                /**
                 * An identifier for the originating bank. One of an International Bank Account
                 * Number (IBAN) bank identifier, SWIFT Bank Identification Code (BIC), or a
                 * domestic identifier like a US Routing Number.
                 */
                @JsonProperty("originating_depository_financial_institution_id")
                @ExcludeMissing
                fun originatingDepositoryFinancialInstitutionId(
                    originatingDepositoryFinancialInstitutionId: JsonField<String>
                ) = apply {
                    this.originatingDepositoryFinancialInstitutionId =
                        originatingDepositoryFinancialInstitutionId
                }

                /**
                 * The [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2 country
                 * code of the originating branch country.
                 */
                fun originatingDepositoryFinancialInstitutionBranchCountry(
                    originatingDepositoryFinancialInstitutionBranchCountry: String
                ) =
                    originatingDepositoryFinancialInstitutionBranchCountry(
                        JsonField.of(originatingDepositoryFinancialInstitutionBranchCountry)
                    )

                /**
                 * The [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2 country
                 * code of the originating branch country.
                 */
                @JsonProperty("originating_depository_financial_institution_branch_country")
                @ExcludeMissing
                fun originatingDepositoryFinancialInstitutionBranchCountry(
                    originatingDepositoryFinancialInstitutionBranchCountry: JsonField<String>
                ) = apply {
                    this.originatingDepositoryFinancialInstitutionBranchCountry =
                        originatingDepositoryFinancialInstitutionBranchCountry
                }

                /** A description field set by the originator. */
                fun originatorCompanyEntryDescription(originatorCompanyEntryDescription: String) =
                    originatorCompanyEntryDescription(
                        JsonField.of(originatorCompanyEntryDescription)
                    )

                /** A description field set by the originator. */
                @JsonProperty("originator_company_entry_description")
                @ExcludeMissing
                fun originatorCompanyEntryDescription(
                    originatorCompanyEntryDescription: JsonField<String>
                ) = apply {
                    this.originatorCompanyEntryDescription = originatorCompanyEntryDescription
                }

                /** Either the name of the originator or an intermediary money transmitter. */
                fun originatorName(originatorName: String) =
                    originatorName(JsonField.of(originatorName))

                /** Either the name of the originator or an intermediary money transmitter. */
                @JsonProperty("originator_name")
                @ExcludeMissing
                fun originatorName(originatorName: JsonField<String>) = apply {
                    this.originatorName = originatorName
                }

                /** A portion of the originator address. This may be incomplete. */
                fun originatorStreetAddress(originatorStreetAddress: String) =
                    originatorStreetAddress(JsonField.of(originatorStreetAddress))

                /** A portion of the originator address. This may be incomplete. */
                @JsonProperty("originator_street_address")
                @ExcludeMissing
                fun originatorStreetAddress(originatorStreetAddress: JsonField<String>) = apply {
                    this.originatorStreetAddress = originatorStreetAddress
                }

                /** A portion of the originator address. This may be incomplete. */
                fun originatorCity(originatorCity: String) =
                    originatorCity(JsonField.of(originatorCity))

                /** A portion of the originator address. This may be incomplete. */
                @JsonProperty("originator_city")
                @ExcludeMissing
                fun originatorCity(originatorCity: JsonField<String>) = apply {
                    this.originatorCity = originatorCity
                }

                /** A portion of the originator address. This may be incomplete. */
                fun originatorStateOrProvince(originatorStateOrProvince: String) =
                    originatorStateOrProvince(JsonField.of(originatorStateOrProvince))

                /** A portion of the originator address. This may be incomplete. */
                @JsonProperty("originator_state_or_province")
                @ExcludeMissing
                fun originatorStateOrProvince(originatorStateOrProvince: JsonField<String>) =
                    apply {
                        this.originatorStateOrProvince = originatorStateOrProvince
                    }

                /** A portion of the originator address. This may be incomplete. */
                fun originatorPostalCode(originatorPostalCode: String) =
                    originatorPostalCode(JsonField.of(originatorPostalCode))

                /** A portion of the originator address. This may be incomplete. */
                @JsonProperty("originator_postal_code")
                @ExcludeMissing
                fun originatorPostalCode(originatorPostalCode: JsonField<String>) = apply {
                    this.originatorPostalCode = originatorPostalCode
                }

                /**
                 * A portion of the originator address. The
                 * [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2 country
                 * code of the originator country.
                 */
                fun originatorCountry(originatorCountry: String) =
                    originatorCountry(JsonField.of(originatorCountry))

                /**
                 * A portion of the originator address. The
                 * [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2 country
                 * code of the originator country.
                 */
                @JsonProperty("originator_country")
                @ExcludeMissing
                fun originatorCountry(originatorCountry: JsonField<String>) = apply {
                    this.originatorCountry = originatorCountry
                }

                /**
                 * An identifier for the originating company. This is generally stable across
                 * multiple ACH transfers.
                 */
                fun originatorIdentification(originatorIdentification: String) =
                    originatorIdentification(JsonField.of(originatorIdentification))

                /**
                 * An identifier for the originating company. This is generally stable across
                 * multiple ACH transfers.
                 */
                @JsonProperty("originator_identification")
                @ExcludeMissing
                fun originatorIdentification(originatorIdentification: JsonField<String>) = apply {
                    this.originatorIdentification = originatorIdentification
                }

                /** A description field set by the originator. */
                fun paymentRelatedInformation(paymentRelatedInformation: String) =
                    paymentRelatedInformation(JsonField.of(paymentRelatedInformation))

                /** A description field set by the originator. */
                @JsonProperty("payment_related_information")
                @ExcludeMissing
                fun paymentRelatedInformation(paymentRelatedInformation: JsonField<String>) =
                    apply {
                        this.paymentRelatedInformation = paymentRelatedInformation
                    }

                /** A description field set by the originator. */
                fun paymentRelatedInformation2(paymentRelatedInformation2: String) =
                    paymentRelatedInformation2(JsonField.of(paymentRelatedInformation2))

                /** A description field set by the originator. */
                @JsonProperty("payment_related_information2")
                @ExcludeMissing
                fun paymentRelatedInformation2(paymentRelatedInformation2: JsonField<String>) =
                    apply {
                        this.paymentRelatedInformation2 = paymentRelatedInformation2
                    }

                /** An identification number the originator uses for the receiver. */
                fun receiverIdentificationNumber(receiverIdentificationNumber: String) =
                    receiverIdentificationNumber(JsonField.of(receiverIdentificationNumber))

                /** An identification number the originator uses for the receiver. */
                @JsonProperty("receiver_identification_number")
                @ExcludeMissing
                fun receiverIdentificationNumber(receiverIdentificationNumber: JsonField<String>) =
                    apply {
                        this.receiverIdentificationNumber = receiverIdentificationNumber
                    }

                /** A portion of the receiver address. This may be incomplete. */
                fun receiverStreetAddress(receiverStreetAddress: String) =
                    receiverStreetAddress(JsonField.of(receiverStreetAddress))

                /** A portion of the receiver address. This may be incomplete. */
                @JsonProperty("receiver_street_address")
                @ExcludeMissing
                fun receiverStreetAddress(receiverStreetAddress: JsonField<String>) = apply {
                    this.receiverStreetAddress = receiverStreetAddress
                }

                /** A portion of the receiver address. This may be incomplete. */
                fun receiverCity(receiverCity: String) = receiverCity(JsonField.of(receiverCity))

                /** A portion of the receiver address. This may be incomplete. */
                @JsonProperty("receiver_city")
                @ExcludeMissing
                fun receiverCity(receiverCity: JsonField<String>) = apply {
                    this.receiverCity = receiverCity
                }

                /** A portion of the receiver address. This may be incomplete. */
                fun receiverStateOrProvince(receiverStateOrProvince: String) =
                    receiverStateOrProvince(JsonField.of(receiverStateOrProvince))

                /** A portion of the receiver address. This may be incomplete. */
                @JsonProperty("receiver_state_or_province")
                @ExcludeMissing
                fun receiverStateOrProvince(receiverStateOrProvince: JsonField<String>) = apply {
                    this.receiverStateOrProvince = receiverStateOrProvince
                }

                /**
                 * A portion of the receiver address. The
                 * [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2 country
                 * code of the receiver country.
                 */
                fun receiverCountry(receiverCountry: String) =
                    receiverCountry(JsonField.of(receiverCountry))

                /**
                 * A portion of the receiver address. The
                 * [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2 country
                 * code of the receiver country.
                 */
                @JsonProperty("receiver_country")
                @ExcludeMissing
                fun receiverCountry(receiverCountry: JsonField<String>) = apply {
                    this.receiverCountry = receiverCountry
                }

                /** A portion of the receiver address. This may be incomplete. */
                fun receiverPostalCode(receiverPostalCode: String) =
                    receiverPostalCode(JsonField.of(receiverPostalCode))

                /** A portion of the receiver address. This may be incomplete. */
                @JsonProperty("receiver_postal_code")
                @ExcludeMissing
                fun receiverPostalCode(receiverPostalCode: JsonField<String>) = apply {
                    this.receiverPostalCode = receiverPostalCode
                }

                /** The name of the receiver of the transfer. This is not verified by Increase. */
                fun receivingCompanyOrIndividualName(receivingCompanyOrIndividualName: String) =
                    receivingCompanyOrIndividualName(JsonField.of(receivingCompanyOrIndividualName))

                /** The name of the receiver of the transfer. This is not verified by Increase. */
                @JsonProperty("receiving_company_or_individual_name")
                @ExcludeMissing
                fun receivingCompanyOrIndividualName(
                    receivingCompanyOrIndividualName: JsonField<String>
                ) = apply {
                    this.receivingCompanyOrIndividualName = receivingCompanyOrIndividualName
                }

                /** The name of the receiving bank, as set by the sending financial institution. */
                fun receivingDepositoryFinancialInstitutionName(
                    receivingDepositoryFinancialInstitutionName: String
                ) =
                    receivingDepositoryFinancialInstitutionName(
                        JsonField.of(receivingDepositoryFinancialInstitutionName)
                    )

                /** The name of the receiving bank, as set by the sending financial institution. */
                @JsonProperty("receiving_depository_financial_institution_name")
                @ExcludeMissing
                fun receivingDepositoryFinancialInstitutionName(
                    receivingDepositoryFinancialInstitutionName: JsonField<String>
                ) = apply {
                    this.receivingDepositoryFinancialInstitutionName =
                        receivingDepositoryFinancialInstitutionName
                }

                /**
                 * An instruction of how to interpret the
                 * `receiving_depository_financial_institution_id` field for this Transaction.
                 */
                fun receivingDepositoryFinancialInstitutionIdQualifier(
                    receivingDepositoryFinancialInstitutionIdQualifier:
                        ReceivingDepositoryFinancialInstitutionIdQualifier
                ) =
                    receivingDepositoryFinancialInstitutionIdQualifier(
                        JsonField.of(receivingDepositoryFinancialInstitutionIdQualifier)
                    )

                /**
                 * An instruction of how to interpret the
                 * `receiving_depository_financial_institution_id` field for this Transaction.
                 */
                @JsonProperty("receiving_depository_financial_institution_id_qualifier")
                @ExcludeMissing
                fun receivingDepositoryFinancialInstitutionIdQualifier(
                    receivingDepositoryFinancialInstitutionIdQualifier:
                        JsonField<ReceivingDepositoryFinancialInstitutionIdQualifier>
                ) = apply {
                    this.receivingDepositoryFinancialInstitutionIdQualifier =
                        receivingDepositoryFinancialInstitutionIdQualifier
                }

                /**
                 * An identifier for the receiving bank. One of an International Bank Account Number
                 * (IBAN) bank identifier, SWIFT Bank Identification Code (BIC), or a domestic
                 * identifier like a US Routing Number.
                 */
                fun receivingDepositoryFinancialInstitutionId(
                    receivingDepositoryFinancialInstitutionId: String
                ) =
                    receivingDepositoryFinancialInstitutionId(
                        JsonField.of(receivingDepositoryFinancialInstitutionId)
                    )

                /**
                 * An identifier for the receiving bank. One of an International Bank Account Number
                 * (IBAN) bank identifier, SWIFT Bank Identification Code (BIC), or a domestic
                 * identifier like a US Routing Number.
                 */
                @JsonProperty("receiving_depository_financial_institution_id")
                @ExcludeMissing
                fun receivingDepositoryFinancialInstitutionId(
                    receivingDepositoryFinancialInstitutionId: JsonField<String>
                ) = apply {
                    this.receivingDepositoryFinancialInstitutionId =
                        receivingDepositoryFinancialInstitutionId
                }

                /**
                 * The [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2 country
                 * code of the receiving bank country.
                 */
                fun receivingDepositoryFinancialInstitutionCountry(
                    receivingDepositoryFinancialInstitutionCountry: String
                ) =
                    receivingDepositoryFinancialInstitutionCountry(
                        JsonField.of(receivingDepositoryFinancialInstitutionCountry)
                    )

                /**
                 * The [ISO 3166](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2), Alpha-2 country
                 * code of the receiving bank country.
                 */
                @JsonProperty("receiving_depository_financial_institution_country")
                @ExcludeMissing
                fun receivingDepositoryFinancialInstitutionCountry(
                    receivingDepositoryFinancialInstitutionCountry: JsonField<String>
                ) = apply {
                    this.receivingDepositoryFinancialInstitutionCountry =
                        receivingDepositoryFinancialInstitutionCountry
                }

                /**
                 * A 15 digit number recorded in the Nacha file and available to both the
                 * originating and receiving bank. Along with the amount, date, and originating
                 * routing number, this can be used to identify the ACH transfer at either bank. ACH
                 * trace numbers are not unique, but are
                 * [used to correlate returns](https://increase.com/documentation/ach#returns).
                 */
                fun traceNumber(traceNumber: String) = traceNumber(JsonField.of(traceNumber))

                /**
                 * A 15 digit number recorded in the Nacha file and available to both the
                 * originating and receiving bank. Along with the amount, date, and originating
                 * routing number, this can be used to identify the ACH transfer at either bank. ACH
                 * trace numbers are not unique, but are
                 * [used to correlate returns](https://increase.com/documentation/ach#returns).
                 */
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
                        originatorCompanyEntryDescription,
                        originatorName,
                        originatorStreetAddress,
                        originatorCity,
                        originatorStateOrProvince,
                        originatorPostalCode,
                        originatorCountry,
                        originatorIdentification,
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

            class ForeignExchangeIndicator
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ForeignExchangeIndicator && this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    @JvmField
                    val FIXED_TO_VARIABLE =
                        ForeignExchangeIndicator(JsonField.of("fixed_to_variable"))

                    @JvmField
                    val VARIABLE_TO_FIXED =
                        ForeignExchangeIndicator(JsonField.of("variable_to_fixed"))

                    @JvmField
                    val FIXED_TO_FIXED = ForeignExchangeIndicator(JsonField.of("fixed_to_fixed"))

                    @JvmStatic fun of(value: String) = ForeignExchangeIndicator(JsonField.of(value))
                }

                enum class Known {
                    FIXED_TO_VARIABLE,
                    VARIABLE_TO_FIXED,
                    FIXED_TO_FIXED,
                }

                enum class Value {
                    FIXED_TO_VARIABLE,
                    VARIABLE_TO_FIXED,
                    FIXED_TO_FIXED,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        FIXED_TO_VARIABLE -> Value.FIXED_TO_VARIABLE
                        VARIABLE_TO_FIXED -> Value.VARIABLE_TO_FIXED
                        FIXED_TO_FIXED -> Value.FIXED_TO_FIXED
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        FIXED_TO_VARIABLE -> Known.FIXED_TO_VARIABLE
                        VARIABLE_TO_FIXED -> Known.VARIABLE_TO_FIXED
                        FIXED_TO_FIXED -> Known.FIXED_TO_FIXED
                        else ->
                            throw IncreaseInvalidDataException(
                                "Unknown ForeignExchangeIndicator: $value"
                            )
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            class ForeignExchangeReferenceIndicator
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ForeignExchangeReferenceIndicator && this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    @JvmField
                    val FOREIGN_EXCHANGE_RATE =
                        ForeignExchangeReferenceIndicator(JsonField.of("foreign_exchange_rate"))

                    @JvmField
                    val FOREIGN_EXCHANGE_REFERENCE_NUMBER =
                        ForeignExchangeReferenceIndicator(
                            JsonField.of("foreign_exchange_reference_number")
                        )

                    @JvmField val BLANK = ForeignExchangeReferenceIndicator(JsonField.of("blank"))

                    @JvmStatic
                    fun of(value: String) = ForeignExchangeReferenceIndicator(JsonField.of(value))
                }

                enum class Known {
                    FOREIGN_EXCHANGE_RATE,
                    FOREIGN_EXCHANGE_REFERENCE_NUMBER,
                    BLANK,
                }

                enum class Value {
                    FOREIGN_EXCHANGE_RATE,
                    FOREIGN_EXCHANGE_REFERENCE_NUMBER,
                    BLANK,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        FOREIGN_EXCHANGE_RATE -> Value.FOREIGN_EXCHANGE_RATE
                        FOREIGN_EXCHANGE_REFERENCE_NUMBER -> Value.FOREIGN_EXCHANGE_REFERENCE_NUMBER
                        BLANK -> Value.BLANK
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        FOREIGN_EXCHANGE_RATE -> Known.FOREIGN_EXCHANGE_RATE
                        FOREIGN_EXCHANGE_REFERENCE_NUMBER -> Known.FOREIGN_EXCHANGE_REFERENCE_NUMBER
                        BLANK -> Known.BLANK
                        else ->
                            throw IncreaseInvalidDataException(
                                "Unknown ForeignExchangeReferenceIndicator: $value"
                            )
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            class InternationalTransactionTypeCode
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is InternationalTransactionTypeCode && this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    @JvmField
                    val ANNUITY = InternationalTransactionTypeCode(JsonField.of("annuity"))

                    @JvmField
                    val BUSINESS_OR_COMMERCIAL =
                        InternationalTransactionTypeCode(JsonField.of("business_or_commercial"))

                    @JvmField
                    val DEPOSIT = InternationalTransactionTypeCode(JsonField.of("deposit"))

                    @JvmField val LOAN = InternationalTransactionTypeCode(JsonField.of("loan"))

                    @JvmField
                    val MISCELLANEOUS =
                        InternationalTransactionTypeCode(JsonField.of("miscellaneous"))

                    @JvmField
                    val MORTGAGE = InternationalTransactionTypeCode(JsonField.of("mortgage"))

                    @JvmField
                    val PENSION = InternationalTransactionTypeCode(JsonField.of("pension"))

                    @JvmField
                    val REMITTANCE = InternationalTransactionTypeCode(JsonField.of("remittance"))

                    @JvmField
                    val RENT_OR_LEASE =
                        InternationalTransactionTypeCode(JsonField.of("rent_or_lease"))

                    @JvmField
                    val SALARY_OR_PAYROLL =
                        InternationalTransactionTypeCode(JsonField.of("salary_or_payroll"))

                    @JvmField val TAX = InternationalTransactionTypeCode(JsonField.of("tax"))

                    @JvmField
                    val ACCOUNTS_RECEIVABLE =
                        InternationalTransactionTypeCode(JsonField.of("accounts_receivable"))

                    @JvmField
                    val BACK_OFFICE_CONVERSION =
                        InternationalTransactionTypeCode(JsonField.of("back_office_conversion"))

                    @JvmField
                    val MACHINE_TRANSFER =
                        InternationalTransactionTypeCode(JsonField.of("machine_transfer"))

                    @JvmField
                    val POINT_OF_PURCHASE =
                        InternationalTransactionTypeCode(JsonField.of("point_of_purchase"))

                    @JvmField
                    val POINT_OF_SALE =
                        InternationalTransactionTypeCode(JsonField.of("point_of_sale"))

                    @JvmField
                    val REPRESENTED_CHECK =
                        InternationalTransactionTypeCode(JsonField.of("represented_check"))

                    @JvmField
                    val SHARED_NETWORK_TRANSACTION =
                        InternationalTransactionTypeCode(JsonField.of("shared_network_transaction"))

                    @JvmField
                    val TELPHONE_INITIATED =
                        InternationalTransactionTypeCode(JsonField.of("telphone_initiated"))

                    @JvmField
                    val INTERNET_INITIATED =
                        InternationalTransactionTypeCode(JsonField.of("internet_initiated"))

                    @JvmStatic
                    fun of(value: String) = InternationalTransactionTypeCode(JsonField.of(value))
                }

                enum class Known {
                    ANNUITY,
                    BUSINESS_OR_COMMERCIAL,
                    DEPOSIT,
                    LOAN,
                    MISCELLANEOUS,
                    MORTGAGE,
                    PENSION,
                    REMITTANCE,
                    RENT_OR_LEASE,
                    SALARY_OR_PAYROLL,
                    TAX,
                    ACCOUNTS_RECEIVABLE,
                    BACK_OFFICE_CONVERSION,
                    MACHINE_TRANSFER,
                    POINT_OF_PURCHASE,
                    POINT_OF_SALE,
                    REPRESENTED_CHECK,
                    SHARED_NETWORK_TRANSACTION,
                    TELPHONE_INITIATED,
                    INTERNET_INITIATED,
                }

                enum class Value {
                    ANNUITY,
                    BUSINESS_OR_COMMERCIAL,
                    DEPOSIT,
                    LOAN,
                    MISCELLANEOUS,
                    MORTGAGE,
                    PENSION,
                    REMITTANCE,
                    RENT_OR_LEASE,
                    SALARY_OR_PAYROLL,
                    TAX,
                    ACCOUNTS_RECEIVABLE,
                    BACK_OFFICE_CONVERSION,
                    MACHINE_TRANSFER,
                    POINT_OF_PURCHASE,
                    POINT_OF_SALE,
                    REPRESENTED_CHECK,
                    SHARED_NETWORK_TRANSACTION,
                    TELPHONE_INITIATED,
                    INTERNET_INITIATED,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        ANNUITY -> Value.ANNUITY
                        BUSINESS_OR_COMMERCIAL -> Value.BUSINESS_OR_COMMERCIAL
                        DEPOSIT -> Value.DEPOSIT
                        LOAN -> Value.LOAN
                        MISCELLANEOUS -> Value.MISCELLANEOUS
                        MORTGAGE -> Value.MORTGAGE
                        PENSION -> Value.PENSION
                        REMITTANCE -> Value.REMITTANCE
                        RENT_OR_LEASE -> Value.RENT_OR_LEASE
                        SALARY_OR_PAYROLL -> Value.SALARY_OR_PAYROLL
                        TAX -> Value.TAX
                        ACCOUNTS_RECEIVABLE -> Value.ACCOUNTS_RECEIVABLE
                        BACK_OFFICE_CONVERSION -> Value.BACK_OFFICE_CONVERSION
                        MACHINE_TRANSFER -> Value.MACHINE_TRANSFER
                        POINT_OF_PURCHASE -> Value.POINT_OF_PURCHASE
                        POINT_OF_SALE -> Value.POINT_OF_SALE
                        REPRESENTED_CHECK -> Value.REPRESENTED_CHECK
                        SHARED_NETWORK_TRANSACTION -> Value.SHARED_NETWORK_TRANSACTION
                        TELPHONE_INITIATED -> Value.TELPHONE_INITIATED
                        INTERNET_INITIATED -> Value.INTERNET_INITIATED
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        ANNUITY -> Known.ANNUITY
                        BUSINESS_OR_COMMERCIAL -> Known.BUSINESS_OR_COMMERCIAL
                        DEPOSIT -> Known.DEPOSIT
                        LOAN -> Known.LOAN
                        MISCELLANEOUS -> Known.MISCELLANEOUS
                        MORTGAGE -> Known.MORTGAGE
                        PENSION -> Known.PENSION
                        REMITTANCE -> Known.REMITTANCE
                        RENT_OR_LEASE -> Known.RENT_OR_LEASE
                        SALARY_OR_PAYROLL -> Known.SALARY_OR_PAYROLL
                        TAX -> Known.TAX
                        ACCOUNTS_RECEIVABLE -> Known.ACCOUNTS_RECEIVABLE
                        BACK_OFFICE_CONVERSION -> Known.BACK_OFFICE_CONVERSION
                        MACHINE_TRANSFER -> Known.MACHINE_TRANSFER
                        POINT_OF_PURCHASE -> Known.POINT_OF_PURCHASE
                        POINT_OF_SALE -> Known.POINT_OF_SALE
                        REPRESENTED_CHECK -> Known.REPRESENTED_CHECK
                        SHARED_NETWORK_TRANSACTION -> Known.SHARED_NETWORK_TRANSACTION
                        TELPHONE_INITIATED -> Known.TELPHONE_INITIATED
                        INTERNET_INITIATED -> Known.INTERNET_INITIATED
                        else ->
                            throw IncreaseInvalidDataException(
                                "Unknown InternationalTransactionTypeCode: $value"
                            )
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            class OriginatingDepositoryFinancialInstitutionIdQualifier
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is OriginatingDepositoryFinancialInstitutionIdQualifier &&
                        this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    @JvmField
                    val NATIONAL_CLEARING_SYSTEM_NUMBER =
                        OriginatingDepositoryFinancialInstitutionIdQualifier(
                            JsonField.of("national_clearing_system_number")
                        )

                    @JvmField
                    val BIC_CODE =
                        OriginatingDepositoryFinancialInstitutionIdQualifier(
                            JsonField.of("bic_code")
                        )

                    @JvmField
                    val IBAN =
                        OriginatingDepositoryFinancialInstitutionIdQualifier(JsonField.of("iban"))

                    @JvmStatic
                    fun of(value: String) =
                        OriginatingDepositoryFinancialInstitutionIdQualifier(JsonField.of(value))
                }

                enum class Known {
                    NATIONAL_CLEARING_SYSTEM_NUMBER,
                    BIC_CODE,
                    IBAN,
                }

                enum class Value {
                    NATIONAL_CLEARING_SYSTEM_NUMBER,
                    BIC_CODE,
                    IBAN,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        NATIONAL_CLEARING_SYSTEM_NUMBER -> Value.NATIONAL_CLEARING_SYSTEM_NUMBER
                        BIC_CODE -> Value.BIC_CODE
                        IBAN -> Value.IBAN
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        NATIONAL_CLEARING_SYSTEM_NUMBER -> Known.NATIONAL_CLEARING_SYSTEM_NUMBER
                        BIC_CODE -> Known.BIC_CODE
                        IBAN -> Known.IBAN
                        else ->
                            throw IncreaseInvalidDataException(
                                "Unknown OriginatingDepositoryFinancialInstitutionIdQualifier: $value"
                            )
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            class ReceivingDepositoryFinancialInstitutionIdQualifier
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ReceivingDepositoryFinancialInstitutionIdQualifier &&
                        this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    @JvmField
                    val NATIONAL_CLEARING_SYSTEM_NUMBER =
                        ReceivingDepositoryFinancialInstitutionIdQualifier(
                            JsonField.of("national_clearing_system_number")
                        )

                    @JvmField
                    val BIC_CODE =
                        ReceivingDepositoryFinancialInstitutionIdQualifier(JsonField.of("bic_code"))

                    @JvmField
                    val IBAN =
                        ReceivingDepositoryFinancialInstitutionIdQualifier(JsonField.of("iban"))

                    @JvmStatic
                    fun of(value: String) =
                        ReceivingDepositoryFinancialInstitutionIdQualifier(JsonField.of(value))
                }

                enum class Known {
                    NATIONAL_CLEARING_SYSTEM_NUMBER,
                    BIC_CODE,
                    IBAN,
                }

                enum class Value {
                    NATIONAL_CLEARING_SYSTEM_NUMBER,
                    BIC_CODE,
                    IBAN,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        NATIONAL_CLEARING_SYSTEM_NUMBER -> Value.NATIONAL_CLEARING_SYSTEM_NUMBER
                        BIC_CODE -> Value.BIC_CODE
                        IBAN -> Value.IBAN
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        NATIONAL_CLEARING_SYSTEM_NUMBER -> Known.NATIONAL_CLEARING_SYSTEM_NUMBER
                        BIC_CODE -> Known.BIC_CODE
                        IBAN -> Known.IBAN
                        else ->
                            throw IncreaseInvalidDataException(
                                "Unknown ReceivingDepositoryFinancialInstitutionIdQualifier: $value"
                            )
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
            private val originatorRoutingNumber: JsonField<String>,
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

            /** An Increase-constructed description of the declined transaction. */
            fun description(): String = description.getRequired("description")

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

            /**
             * The declined amount in the minor unit of the destination account currency. For
             * dollars, for example, this is cents.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            /** Why the wire transfer was declined. */
            @JsonProperty("reason") @ExcludeMissing fun _reason() = reason

            /** An Increase-constructed description of the declined transaction. */
            @JsonProperty("description") @ExcludeMissing fun _description() = description

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
                    originatorRoutingNumber()
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
                    this.inputMessageAccountabilityData == other.inputMessageAccountabilityData &&
                    this.originatorAddressLine1 == other.originatorAddressLine1 &&
                    this.originatorAddressLine2 == other.originatorAddressLine2 &&
                    this.originatorAddressLine3 == other.originatorAddressLine3 &&
                    this.originatorName == other.originatorName &&
                    this.originatorRoutingNumber == other.originatorRoutingNumber &&
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
                            originatorRoutingNumber,
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
                "WireDecline{amount=$amount, reason=$reason, description=$description, beneficiaryAddressLine1=$beneficiaryAddressLine1, beneficiaryAddressLine2=$beneficiaryAddressLine2, beneficiaryAddressLine3=$beneficiaryAddressLine3, beneficiaryName=$beneficiaryName, beneficiaryReference=$beneficiaryReference, inputMessageAccountabilityData=$inputMessageAccountabilityData, originatorAddressLine1=$originatorAddressLine1, originatorAddressLine2=$originatorAddressLine2, originatorAddressLine3=$originatorAddressLine3, originatorName=$originatorName, originatorRoutingNumber=$originatorRoutingNumber, originatorToBeneficiaryInformationLine1=$originatorToBeneficiaryInformationLine1, originatorToBeneficiaryInformationLine2=$originatorToBeneficiaryInformationLine2, originatorToBeneficiaryInformationLine3=$originatorToBeneficiaryInformationLine3, originatorToBeneficiaryInformationLine4=$originatorToBeneficiaryInformationLine4, additionalProperties=$additionalProperties}"

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
                private var originatorRoutingNumber: JsonField<String> = JsonMissing.of()
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
                    this.inputMessageAccountabilityData = wireDecline.inputMessageAccountabilityData
                    this.originatorAddressLine1 = wireDecline.originatorAddressLine1
                    this.originatorAddressLine2 = wireDecline.originatorAddressLine2
                    this.originatorAddressLine3 = wireDecline.originatorAddressLine3
                    this.originatorName = wireDecline.originatorName
                    this.originatorRoutingNumber = wireDecline.originatorRoutingNumber
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

                /** Why the wire transfer was declined. */
                fun reason(reason: Reason) = reason(JsonField.of(reason))

                /** Why the wire transfer was declined. */
                @JsonProperty("reason")
                @ExcludeMissing
                fun reason(reason: JsonField<Reason>) = apply { this.reason = reason }

                /** An Increase-constructed description of the declined transaction. */
                fun description(description: String) = description(JsonField.of(description))

                /** An Increase-constructed description of the declined transaction. */
                @JsonProperty("description")
                @ExcludeMissing
                fun description(description: JsonField<String>) = apply {
                    this.description = description
                }

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
                        originatorRoutingNumber,
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
