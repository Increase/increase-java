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
     * currency. This will match the currency on the Declined Transcation's Account.
     */
    fun currency(): Currency = currency.getRequired("currency")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date on which the Transaction occured.
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
     * currency. This will match the currency on the Declined Transcation's Account.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date on which the Transaction occured.
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
        private val cardRouteDecline: JsonField<CardRouteDecline>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /**
         * The type of decline that took place. We may add additional possible values for this enum
         * over time; your application should be able to handle such additions gracefully.
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
         * A Check Decline object. This field will be present in the JSON response if and only if
         * `category` is equal to `check_decline`.
         */
        fun checkDecline(): Optional<CheckDecline> =
            Optional.ofNullable(checkDecline.getNullable("check_decline"))

        /**
         * A Inbound Real Time Payments Transfer Decline object. This field will be present in the
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
         * A International ACH Decline object. This field will be present in the JSON response if
         * and only if `category` is equal to `international_ach_decline`.
         */
        fun internationalAchDecline(): Optional<InternationalAchDecline> =
            Optional.ofNullable(internationalAchDecline.getNullable("international_ach_decline"))

        /**
         * A Deprecated Card Decline object. This field will be present in the JSON response if and
         * only if `category` is equal to `card_route_decline`.
         */
        fun cardRouteDecline(): Optional<CardRouteDecline> =
            Optional.ofNullable(cardRouteDecline.getNullable("card_route_decline"))

        /**
         * The type of decline that took place. We may add additional possible values for this enum
         * over time; your application should be able to handle such additions gracefully.
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
         * A Check Decline object. This field will be present in the JSON response if and only if
         * `category` is equal to `check_decline`.
         */
        @JsonProperty("check_decline") @ExcludeMissing fun _checkDecline() = checkDecline

        /**
         * A Inbound Real Time Payments Transfer Decline object. This field will be present in the
         * JSON response if and only if `category` is equal to
         * `inbound_real_time_payments_transfer_decline`.
         */
        @JsonProperty("inbound_real_time_payments_transfer_decline")
        @ExcludeMissing
        fun _inboundRealTimePaymentsTransferDecline() = inboundRealTimePaymentsTransferDecline

        /**
         * A International ACH Decline object. This field will be present in the JSON response if
         * and only if `category` is equal to `international_ach_decline`.
         */
        @JsonProperty("international_ach_decline")
        @ExcludeMissing
        fun _internationalAchDecline() = internationalAchDecline

        /**
         * A Deprecated Card Decline object. This field will be present in the JSON response if and
         * only if `category` is equal to `card_route_decline`.
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
             * The type of decline that took place. We may add additional possible values for this
             * enum over time; your application should be able to handle such additions gracefully.
             */
            fun category(category: Category) = category(JsonField.of(category))

            /**
             * The type of decline that took place. We may add additional possible values for this
             * enum over time; your application should be able to handle such additions gracefully.
             */
            @JsonProperty("category")
            @ExcludeMissing
            fun category(category: JsonField<Category>) = apply { this.category = category }

            /**
             * A ACH Decline object. This field will be present in the JSON response if and only if
             * `category` is equal to `ach_decline`.
             */
            fun achDecline(achDecline: AchDecline) = achDecline(JsonField.of(achDecline))

            /**
             * A ACH Decline object. This field will be present in the JSON response if and only if
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
             * A Inbound Real Time Payments Transfer Decline object. This field will be present in
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
             * A Inbound Real Time Payments Transfer Decline object. This field will be present in
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
             * A International ACH Decline object. This field will be present in the JSON response
             * if and only if `category` is equal to `international_ach_decline`.
             */
            fun internationalAchDecline(internationalAchDecline: InternationalAchDecline) =
                internationalAchDecline(JsonField.of(internationalAchDecline))

            /**
             * A International ACH Decline object. This field will be present in the JSON response
             * if and only if `category` is equal to `international_ach_decline`.
             */
            @JsonProperty("international_ach_decline")
            @ExcludeMissing
            fun internationalAchDecline(
                internationalAchDecline: JsonField<InternationalAchDecline>
            ) = apply { this.internationalAchDecline = internationalAchDecline }

            /**
             * A Deprecated Card Decline object. This field will be present in the JSON response if
             * and only if `category` is equal to `card_route_decline`.
             */
            fun cardRouteDecline(cardRouteDecline: CardRouteDecline) =
                cardRouteDecline(JsonField.of(cardRouteDecline))

            /**
             * A Deprecated Card Decline object. This field will be present in the JSON response if
             * and only if `category` is equal to `card_route_decline`.
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
                val INTERNATIONAL_ACH_DECLINE = Category(JsonField.of("international_ach_decline"))

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
                private var originatorCompanyDescriptiveDate: JsonField<String> = JsonMissing.of()
                private var originatorCompanyDiscretionaryData: JsonField<String> = JsonMissing.of()
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

                fun originatorCompanyName(originatorCompanyName: String) =
                    originatorCompanyName(JsonField.of(originatorCompanyName))

                @JsonProperty("originator_company_name")
                @ExcludeMissing
                fun originatorCompanyName(originatorCompanyName: JsonField<String>) = apply {
                    this.originatorCompanyName = originatorCompanyName
                }

                fun originatorCompanyDescriptiveDate(originatorCompanyDescriptiveDate: String) =
                    originatorCompanyDescriptiveDate(JsonField.of(originatorCompanyDescriptiveDate))

                @JsonProperty("originator_company_descriptive_date")
                @ExcludeMissing
                fun originatorCompanyDescriptiveDate(
                    originatorCompanyDescriptiveDate: JsonField<String>
                ) = apply {
                    this.originatorCompanyDescriptiveDate = originatorCompanyDescriptiveDate
                }

                fun originatorCompanyDiscretionaryData(originatorCompanyDiscretionaryData: String) =
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

                fun receiverName(receiverName: String) = receiverName(JsonField.of(receiverName))

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

                    @JvmField val NO_ACH_ROUTE = Reason(JsonField.of("no_ach_route"))

                    @JvmField val ORIGINATOR_REQUEST = Reason(JsonField.of("originator_request"))

                    @JvmField
                    val TRANSACTION_NOT_ALLOWED = Reason(JsonField.of("transaction_not_allowed"))

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
                        CREDIT_ENTRY_REFUSED_BY_RECEIVER -> Value.CREDIT_ENTRY_REFUSED_BY_RECEIVER
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
                        CREDIT_ENTRY_REFUSED_BY_RECEIVER -> Known.CREDIT_ENTRY_REFUSED_BY_RECEIVER
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
             * The identifier of the Real-Time Decision sent to approve or decline this transaction.
             */
            fun realTimeDecisionId(): Optional<String> =
                Optional.ofNullable(realTimeDecisionId.getNullable("real_time_decision_id"))

            /**
             * If the authorization was attempted using a Digital Wallet Token (such as an Apple Pay
             * purchase), the identifier of the token that was used.
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

            /** The payment network used to process this card authorization */
            @JsonProperty("network") @ExcludeMissing fun _network() = network

            /** Fields specific to the `network` */
            @JsonProperty("network_details") @ExcludeMissing fun _networkDetails() = networkDetails

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

            /**
             * If the authorization was attempted using a Digital Wallet Token (such as an Apple Pay
             * purchase), the identifier of the token that was used.
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

                /**
                 * If the authorization was attempted using a Digital Wallet Token (such as an Apple
                 * Pay purchase), the identifier of the token that was used.
                 */
                fun digitalWalletTokenId(digitalWalletTokenId: String) =
                    digitalWalletTokenId(JsonField.of(digitalWalletTokenId))

                /**
                 * If the authorization was attempted using a Digital Wallet Token (such as an Apple
                 * Pay purchase), the identifier of the token that was used.
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

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

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
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

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
                        NetworkDetails(visa, additionalProperties.toUnmodifiable())
                }

                /** Fields specific to the `visa` network */
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
                     * expiration date
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
                         * expiration date
                         */
                        fun pointOfServiceEntryMode(
                            pointOfServiceEntryMode: PointOfServiceEntryMode
                        ) = pointOfServiceEntryMode(JsonField.of(pointOfServiceEntryMode))

                        /**
                         * The method used to enter the cardholder's primary account number and card
                         * expiration date
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

                    @JvmField val ENTITY_NOT_ACTIVE = Reason(JsonField.of("entity_not_active"))

                    @JvmField val GROUP_LOCKED = Reason(JsonField.of("group_locked"))

                    @JvmField val INSUFFICIENT_FUNDS = Reason(JsonField.of("insufficient_funds"))

                    @JvmField val CVV2_MISMATCH = Reason(JsonField.of("cvv2_mismatch"))

                    @JvmField
                    val TRANSACTION_NOT_ALLOWED = Reason(JsonField.of("transaction_not_allowed"))

                    @JvmField
                    val BREACHES_INTERNAL_LIMIT = Reason(JsonField.of("breaches_internal_limit"))

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

            fun auxiliaryOnUs(): Optional<String> =
                Optional.ofNullable(auxiliaryOnUs.getNullable("auxiliary_on_us"))

            /** Why the check was declined. */
            fun reason(): Reason = reason.getRequired("reason")

            /**
             * The declined amount in the minor unit of the destination account currency. For
             * dollars, for example, this is cents.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            @JsonProperty("auxiliary_on_us") @ExcludeMissing fun _auxiliaryOnUs() = auxiliaryOnUs

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

                    @JvmField val ENTITY_NOT_ACTIVE = Reason(JsonField.of("entity_not_active"))

                    @JvmField val GROUP_LOCKED = Reason(JsonField.of("group_locked"))

                    @JvmField val INSUFFICIENT_FUNDS = Reason(JsonField.of("insufficient_funds"))

                    @JvmField
                    val UNABLE_TO_LOCATE_ACCOUNT = Reason(JsonField.of("unable_to_locate_account"))

                    @JvmField val UNABLE_TO_PROCESS = Reason(JsonField.of("unable_to_process"))

                    @JvmField val REFER_TO_IMAGE = Reason(JsonField.of("refer_to_image"))

                    @JvmField
                    val STOP_PAYMENT_REQUESTED = Reason(JsonField.of("stop_payment_requested"))

                    @JvmField val RETURNED = Reason(JsonField.of("returned"))

                    @JvmField
                    val DUPLICATE_PRESENTMENT = Reason(JsonField.of("duplicate_presentment"))

                    @JvmField val NOT_AUTHORIZED = Reason(JsonField.of("not_authorized"))

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
                        else -> throw IncreaseInvalidDataException("Unknown Reason: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }
        }

        /**
         * A Inbound Real Time Payments Transfer Decline object. This field will be present in the
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
             * transfer's currency. This will always be "USD" for a Real Time Payments transfer.
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
                 * transfer's currency. This will always be "USD" for a Real Time Payments transfer.
                 */
                fun currency(currency: Currency) = currency(JsonField.of(currency))

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code of the declined
                 * transfer's currency. This will always be "USD" for a Real Time Payments transfer.
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
         * A International ACH Decline object. This field will be present in the JSON response if
         * and only if `category` is equal to `international_ach_decline`.
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
            private val originatingDepositoryFinancialInstitutionBranchCountry: JsonField<String>,
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
                internationalTransactionTypeCode.getRequired("international_transaction_type_code")

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

            fun originatorCountry(): String = originatorCountry.getRequired("originator_country")

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
                receivingCompanyOrIndividualName.getRequired("receiving_company_or_individual_name")

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

            @JsonProperty("originator_city") @ExcludeMissing fun _originatorCity() = originatorCity

            @JsonProperty("originator_company_entry_description")
            @ExcludeMissing
            fun _originatorCompanyEntryDescription() = originatorCompanyEntryDescription

            @JsonProperty("originator_country")
            @ExcludeMissing
            fun _originatorCountry() = originatorCountry

            @JsonProperty("originator_identification")
            @ExcludeMissing
            fun _originatorIdentification() = originatorIdentification

            @JsonProperty("originator_name") @ExcludeMissing fun _originatorName() = originatorName

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
                private var foreignExchangeReferenceIndicator: JsonField<String> = JsonMissing.of()
                private var foreignExchangeReference: JsonField<String> = JsonMissing.of()
                private var destinationCountryCode: JsonField<String> = JsonMissing.of()
                private var destinationCurrencyCode: JsonField<String> = JsonMissing.of()
                private var foreignPaymentAmount: JsonField<Long> = JsonMissing.of()
                private var foreignTraceNumber: JsonField<String> = JsonMissing.of()
                private var internationalTransactionTypeCode: JsonField<String> = JsonMissing.of()
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
                private var originatorCompanyEntryDescription: JsonField<String> = JsonMissing.of()
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
                private var receivingCompanyOrIndividualName: JsonField<String> = JsonMissing.of()
                private var receivingDepositoryFinancialInstitutionName: JsonField<String> =
                    JsonMissing.of()
                private var receivingDepositoryFinancialInstitutionIdQualifier: JsonField<String> =
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
                    this.originatorCity = internationalAchDecline.originatorCity
                    this.originatorCompanyEntryDescription =
                        internationalAchDecline.originatorCompanyEntryDescription
                    this.originatorCountry = internationalAchDecline.originatorCountry
                    this.originatorIdentification = internationalAchDecline.originatorIdentification
                    this.originatorName = internationalAchDecline.originatorName
                    this.originatorPostalCode = internationalAchDecline.originatorPostalCode
                    this.originatorStreetAddress = internationalAchDecline.originatorStreetAddress
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

                fun foreignExchangeIndicator(foreignExchangeIndicator: String) =
                    foreignExchangeIndicator(JsonField.of(foreignExchangeIndicator))

                @JsonProperty("foreign_exchange_indicator")
                @ExcludeMissing
                fun foreignExchangeIndicator(foreignExchangeIndicator: JsonField<String>) = apply {
                    this.foreignExchangeIndicator = foreignExchangeIndicator
                }

                fun foreignExchangeReferenceIndicator(foreignExchangeReferenceIndicator: String) =
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
                fun foreignExchangeReference(foreignExchangeReference: JsonField<String>) = apply {
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
                fun destinationCurrencyCode(destinationCurrencyCode: JsonField<String>) = apply {
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
                    internationalTransactionTypeCode(JsonField.of(internationalTransactionTypeCode))

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
                fun originatingCurrencyCode(originatingCurrencyCode: JsonField<String>) = apply {
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

                fun originatorCompanyEntryDescription(originatorCompanyEntryDescription: String) =
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
                fun originatorIdentification(originatorIdentification: JsonField<String>) = apply {
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
                fun originatorStreetAddress(originatorStreetAddress: JsonField<String>) = apply {
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
                fun receiverIdentificationNumber(receiverIdentificationNumber: JsonField<String>) =
                    apply {
                        this.receiverIdentificationNumber = receiverIdentificationNumber
                    }

                fun receiverStreetAddress(receiverStreetAddress: String) =
                    receiverStreetAddress(JsonField.of(receiverStreetAddress))

                @JsonProperty("receiver_street_address")
                @ExcludeMissing
                fun receiverStreetAddress(receiverStreetAddress: JsonField<String>) = apply {
                    this.receiverStreetAddress = receiverStreetAddress
                }

                fun receiverCity(receiverCity: String) = receiverCity(JsonField.of(receiverCity))

                @JsonProperty("receiver_city")
                @ExcludeMissing
                fun receiverCity(receiverCity: JsonField<String>) = apply {
                    this.receiverCity = receiverCity
                }

                fun receiverStateOrProvince(receiverStateOrProvince: String) =
                    receiverStateOrProvince(JsonField.of(receiverStateOrProvince))

                @JsonProperty("receiver_state_or_province")
                @ExcludeMissing
                fun receiverStateOrProvince(receiverStateOrProvince: JsonField<String>) = apply {
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
                    receivingCompanyOrIndividualName(JsonField.of(receivingCompanyOrIndividualName))

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
         * A Deprecated Card Decline object. This field will be present in the JSON response if and
         * only if `category` is equal to `card_route_decline`.
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

            fun merchantDescriptor(): String = merchantDescriptor.getRequired("merchant_descriptor")

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

                fun merchantAcceptorId(merchantAcceptorId: String) =
                    merchantAcceptorId(JsonField.of(merchantAcceptorId))

                @JsonProperty("merchant_acceptor_id")
                @ExcludeMissing
                fun merchantAcceptorId(merchantAcceptorId: JsonField<String>) = apply {
                    this.merchantAcceptorId = merchantAcceptorId
                }

                fun merchantCity(merchantCity: String) = merchantCity(JsonField.of(merchantCity))

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
