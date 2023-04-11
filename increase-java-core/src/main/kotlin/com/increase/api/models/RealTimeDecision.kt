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
 * Real Time Decisions are created when your application needs to take action in real-time to some
 * event such as a card authorization. Real time decisions are currently in beta; please contact
 * support@increase.com if you're interested in trying them out!
 */
@JsonDeserialize(builder = RealTimeDecision.Builder::class)
@NoAutoDetect
class RealTimeDecision
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val timeoutAt: JsonField<OffsetDateTime>,
    private val status: JsonField<Status>,
    private val category: JsonField<Category>,
    private val cardAuthorization: JsonField<CardAuthorization>,
    private val digitalWalletToken: JsonField<DigitalWalletToken>,
    private val digitalWalletAuthentication: JsonField<DigitalWalletAuthentication>,
    private val type: JsonField<Type>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** The Real-Time Decision identifier. */
    fun id(): String = id.getRequired("id")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the Real-Time
     * Decision was created.
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which your
     * application can no longer respond to the Real-Time Decision.
     */
    fun timeoutAt(): OffsetDateTime = timeoutAt.getRequired("timeout_at")

    /** The status of the Real-Time Decision. */
    fun status(): Status = status.getRequired("status")

    /** The category of the Real-Time Decision. */
    fun category(): Category = category.getRequired("category")

    /** Fields related to a card authorization. */
    fun cardAuthorization(): Optional<CardAuthorization> =
        Optional.ofNullable(cardAuthorization.getNullable("card_authorization"))

    /** Fields related to a digital wallet token provisioning attempt. */
    fun digitalWalletToken(): Optional<DigitalWalletToken> =
        Optional.ofNullable(digitalWalletToken.getNullable("digital_wallet_token"))

    /** Fields related to a digital wallet authentication attempt. */
    fun digitalWalletAuthentication(): Optional<DigitalWalletAuthentication> =
        Optional.ofNullable(
            digitalWalletAuthentication.getNullable("digital_wallet_authentication")
        )

    /**
     * A constant representing the object's type. For this resource it will always be
     * `real_time_decision`.
     */
    fun type(): Type = type.getRequired("type")

    /** The Real-Time Decision identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the Real-Time
     * Decision was created.
     */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which your
     * application can no longer respond to the Real-Time Decision.
     */
    @JsonProperty("timeout_at") @ExcludeMissing fun _timeoutAt() = timeoutAt

    /** The status of the Real-Time Decision. */
    @JsonProperty("status") @ExcludeMissing fun _status() = status

    /** The category of the Real-Time Decision. */
    @JsonProperty("category") @ExcludeMissing fun _category() = category

    /** Fields related to a card authorization. */
    @JsonProperty("card_authorization") @ExcludeMissing fun _cardAuthorization() = cardAuthorization

    /** Fields related to a digital wallet token provisioning attempt. */
    @JsonProperty("digital_wallet_token")
    @ExcludeMissing
    fun _digitalWalletToken() = digitalWalletToken

    /** Fields related to a digital wallet authentication attempt. */
    @JsonProperty("digital_wallet_authentication")
    @ExcludeMissing
    fun _digitalWalletAuthentication() = digitalWalletAuthentication

    /**
     * A constant representing the object's type. For this resource it will always be
     * `real_time_decision`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate() = apply {
        if (!validated) {
            id()
            createdAt()
            timeoutAt()
            status()
            category()
            cardAuthorization().map { it.validate() }
            digitalWalletToken().map { it.validate() }
            digitalWalletAuthentication().map { it.validate() }
            type()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RealTimeDecision &&
            this.id == other.id &&
            this.createdAt == other.createdAt &&
            this.timeoutAt == other.timeoutAt &&
            this.status == other.status &&
            this.category == other.category &&
            this.cardAuthorization == other.cardAuthorization &&
            this.digitalWalletToken == other.digitalWalletToken &&
            this.digitalWalletAuthentication == other.digitalWalletAuthentication &&
            this.type == other.type &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    id,
                    createdAt,
                    timeoutAt,
                    status,
                    category,
                    cardAuthorization,
                    digitalWalletToken,
                    digitalWalletAuthentication,
                    type,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "RealTimeDecision{id=$id, createdAt=$createdAt, timeoutAt=$timeoutAt, status=$status, category=$category, cardAuthorization=$cardAuthorization, digitalWalletToken=$digitalWalletToken, digitalWalletAuthentication=$digitalWalletAuthentication, type=$type, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var timeoutAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var category: JsonField<Category> = JsonMissing.of()
        private var cardAuthorization: JsonField<CardAuthorization> = JsonMissing.of()
        private var digitalWalletToken: JsonField<DigitalWalletToken> = JsonMissing.of()
        private var digitalWalletAuthentication: JsonField<DigitalWalletAuthentication> =
            JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(realTimeDecision: RealTimeDecision) = apply {
            this.id = realTimeDecision.id
            this.createdAt = realTimeDecision.createdAt
            this.timeoutAt = realTimeDecision.timeoutAt
            this.status = realTimeDecision.status
            this.category = realTimeDecision.category
            this.cardAuthorization = realTimeDecision.cardAuthorization
            this.digitalWalletToken = realTimeDecision.digitalWalletToken
            this.digitalWalletAuthentication = realTimeDecision.digitalWalletAuthentication
            this.type = realTimeDecision.type
            additionalProperties(realTimeDecision.additionalProperties)
        }

        /** The Real-Time Decision identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The Real-Time Decision identifier. */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
         * Real-Time Decision was created.
         */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
         * Real-Time Decision was created.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which your
         * application can no longer respond to the Real-Time Decision.
         */
        fun timeoutAt(timeoutAt: OffsetDateTime) = timeoutAt(JsonField.of(timeoutAt))

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which your
         * application can no longer respond to the Real-Time Decision.
         */
        @JsonProperty("timeout_at")
        @ExcludeMissing
        fun timeoutAt(timeoutAt: JsonField<OffsetDateTime>) = apply { this.timeoutAt = timeoutAt }

        /** The status of the Real-Time Decision. */
        fun status(status: Status) = status(JsonField.of(status))

        /** The status of the Real-Time Decision. */
        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** The category of the Real-Time Decision. */
        fun category(category: Category) = category(JsonField.of(category))

        /** The category of the Real-Time Decision. */
        @JsonProperty("category")
        @ExcludeMissing
        fun category(category: JsonField<Category>) = apply { this.category = category }

        /** Fields related to a card authorization. */
        fun cardAuthorization(cardAuthorization: CardAuthorization) =
            cardAuthorization(JsonField.of(cardAuthorization))

        /** Fields related to a card authorization. */
        @JsonProperty("card_authorization")
        @ExcludeMissing
        fun cardAuthorization(cardAuthorization: JsonField<CardAuthorization>) = apply {
            this.cardAuthorization = cardAuthorization
        }

        /** Fields related to a digital wallet token provisioning attempt. */
        fun digitalWalletToken(digitalWalletToken: DigitalWalletToken) =
            digitalWalletToken(JsonField.of(digitalWalletToken))

        /** Fields related to a digital wallet token provisioning attempt. */
        @JsonProperty("digital_wallet_token")
        @ExcludeMissing
        fun digitalWalletToken(digitalWalletToken: JsonField<DigitalWalletToken>) = apply {
            this.digitalWalletToken = digitalWalletToken
        }

        /** Fields related to a digital wallet authentication attempt. */
        fun digitalWalletAuthentication(digitalWalletAuthentication: DigitalWalletAuthentication) =
            digitalWalletAuthentication(JsonField.of(digitalWalletAuthentication))

        /** Fields related to a digital wallet authentication attempt. */
        @JsonProperty("digital_wallet_authentication")
        @ExcludeMissing
        fun digitalWalletAuthentication(
            digitalWalletAuthentication: JsonField<DigitalWalletAuthentication>
        ) = apply { this.digitalWalletAuthentication = digitalWalletAuthentication }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `real_time_decision`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be
         * `real_time_decision`.
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

        fun build(): RealTimeDecision =
            RealTimeDecision(
                id,
                createdAt,
                timeoutAt,
                status,
                category,
                cardAuthorization,
                digitalWalletToken,
                digitalWalletAuthentication,
                type,
                additionalProperties.toUnmodifiable(),
            )
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

            @JvmField val RESPONDED = Status(JsonField.of("responded"))

            @JvmField val TIMED_OUT = Status(JsonField.of("timed_out"))

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            PENDING,
            RESPONDED,
            TIMED_OUT,
        }

        enum class Value {
            PENDING,
            RESPONDED,
            TIMED_OUT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                PENDING -> Value.PENDING
                RESPONDED -> Value.RESPONDED
                TIMED_OUT -> Value.TIMED_OUT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                PENDING -> Known.PENDING
                RESPONDED -> Known.RESPONDED
                TIMED_OUT -> Known.TIMED_OUT
                else -> throw IncreaseInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
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
            val CARD_AUTHORIZATION_REQUESTED =
                Category(JsonField.of("card_authorization_requested"))

            @JvmField
            val DIGITAL_WALLET_TOKEN_REQUESTED =
                Category(JsonField.of("digital_wallet_token_requested"))

            @JvmField
            val DIGITAL_WALLET_AUTHENTICATION_REQUESTED =
                Category(JsonField.of("digital_wallet_authentication_requested"))

            @JvmStatic fun of(value: String) = Category(JsonField.of(value))
        }

        enum class Known {
            CARD_AUTHORIZATION_REQUESTED,
            DIGITAL_WALLET_TOKEN_REQUESTED,
            DIGITAL_WALLET_AUTHENTICATION_REQUESTED,
        }

        enum class Value {
            CARD_AUTHORIZATION_REQUESTED,
            DIGITAL_WALLET_TOKEN_REQUESTED,
            DIGITAL_WALLET_AUTHENTICATION_REQUESTED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                CARD_AUTHORIZATION_REQUESTED -> Value.CARD_AUTHORIZATION_REQUESTED
                DIGITAL_WALLET_TOKEN_REQUESTED -> Value.DIGITAL_WALLET_TOKEN_REQUESTED
                DIGITAL_WALLET_AUTHENTICATION_REQUESTED ->
                    Value.DIGITAL_WALLET_AUTHENTICATION_REQUESTED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                CARD_AUTHORIZATION_REQUESTED -> Known.CARD_AUTHORIZATION_REQUESTED
                DIGITAL_WALLET_TOKEN_REQUESTED -> Known.DIGITAL_WALLET_TOKEN_REQUESTED
                DIGITAL_WALLET_AUTHENTICATION_REQUESTED ->
                    Known.DIGITAL_WALLET_AUTHENTICATION_REQUESTED
                else -> throw IncreaseInvalidDataException("Unknown Category: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    /** Fields related to a card authorization. */
    @JsonDeserialize(builder = CardAuthorization.Builder::class)
    @NoAutoDetect
    class CardAuthorization
    private constructor(
        private val merchantAcceptorId: JsonField<String>,
        private val merchantDescriptor: JsonField<String>,
        private val merchantCategoryCode: JsonField<String>,
        private val merchantCity: JsonField<String>,
        private val merchantCountry: JsonField<String>,
        private val network: JsonField<Network>,
        private val networkDetails: JsonField<NetworkDetails>,
        private val decision: JsonField<Decision>,
        private val cardId: JsonField<String>,
        private val accountId: JsonField<String>,
        private val presentmentAmount: JsonField<Long>,
        private val presentmentCurrency: JsonField<String>,
        private val settlementAmount: JsonField<Long>,
        private val settlementCurrency: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /**
         * The merchant identifier (commonly abbreviated as MID) of the merchant the card is
         * transacting with.
         */
        fun merchantAcceptorId(): String = merchantAcceptorId.getRequired("merchant_acceptor_id")

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

        /** Whether or not the authorization was approved. */
        fun decision(): Optional<Decision> = Optional.ofNullable(decision.getNullable("decision"))

        /** The identifier of the Card that is being authorized. */
        fun cardId(): String = cardId.getRequired("card_id")

        /** The identifier of the Account the authorization will debit. */
        fun accountId(): String = accountId.getRequired("account_id")

        /**
         * The amount of the attempted authorization in the currency the card user sees at the time
         * of purchase, in the minor unit of that currency. For dollars, for example, this is cents.
         */
        fun presentmentAmount(): Long = presentmentAmount.getRequired("presentment_amount")

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the currency the user
         * sees at the time of purchase.
         */
        fun presentmentCurrency(): String = presentmentCurrency.getRequired("presentment_currency")

        /**
         * The amount of the attempted authorization in the currency it will be settled in. This
         * currency is the same as that of the Account the card belongs to.
         */
        fun settlementAmount(): Long = settlementAmount.getRequired("settlement_amount")

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the currency the
         * transaction will be settled in.
         */
        fun settlementCurrency(): String = settlementCurrency.getRequired("settlement_currency")

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
        @JsonProperty("merchant_country") @ExcludeMissing fun _merchantCountry() = merchantCountry

        /** The payment network used to process this card authorization */
        @JsonProperty("network") @ExcludeMissing fun _network() = network

        /** Fields specific to the `network` */
        @JsonProperty("network_details") @ExcludeMissing fun _networkDetails() = networkDetails

        /** Whether or not the authorization was approved. */
        @JsonProperty("decision") @ExcludeMissing fun _decision() = decision

        /** The identifier of the Card that is being authorized. */
        @JsonProperty("card_id") @ExcludeMissing fun _cardId() = cardId

        /** The identifier of the Account the authorization will debit. */
        @JsonProperty("account_id") @ExcludeMissing fun _accountId() = accountId

        /**
         * The amount of the attempted authorization in the currency the card user sees at the time
         * of purchase, in the minor unit of that currency. For dollars, for example, this is cents.
         */
        @JsonProperty("presentment_amount")
        @ExcludeMissing
        fun _presentmentAmount() = presentmentAmount

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the currency the user
         * sees at the time of purchase.
         */
        @JsonProperty("presentment_currency")
        @ExcludeMissing
        fun _presentmentCurrency() = presentmentCurrency

        /**
         * The amount of the attempted authorization in the currency it will be settled in. This
         * currency is the same as that of the Account the card belongs to.
         */
        @JsonProperty("settlement_amount")
        @ExcludeMissing
        fun _settlementAmount() = settlementAmount

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the currency the
         * transaction will be settled in.
         */
        @JsonProperty("settlement_currency")
        @ExcludeMissing
        fun _settlementCurrency() = settlementCurrency

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
                decision()
                cardId()
                accountId()
                presentmentAmount()
                presentmentCurrency()
                settlementAmount()
                settlementCurrency()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CardAuthorization &&
                this.merchantAcceptorId == other.merchantAcceptorId &&
                this.merchantDescriptor == other.merchantDescriptor &&
                this.merchantCategoryCode == other.merchantCategoryCode &&
                this.merchantCity == other.merchantCity &&
                this.merchantCountry == other.merchantCountry &&
                this.network == other.network &&
                this.networkDetails == other.networkDetails &&
                this.decision == other.decision &&
                this.cardId == other.cardId &&
                this.accountId == other.accountId &&
                this.presentmentAmount == other.presentmentAmount &&
                this.presentmentCurrency == other.presentmentCurrency &&
                this.settlementAmount == other.settlementAmount &&
                this.settlementCurrency == other.settlementCurrency &&
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
                        decision,
                        cardId,
                        accountId,
                        presentmentAmount,
                        presentmentCurrency,
                        settlementAmount,
                        settlementCurrency,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "CardAuthorization{merchantAcceptorId=$merchantAcceptorId, merchantDescriptor=$merchantDescriptor, merchantCategoryCode=$merchantCategoryCode, merchantCity=$merchantCity, merchantCountry=$merchantCountry, network=$network, networkDetails=$networkDetails, decision=$decision, cardId=$cardId, accountId=$accountId, presentmentAmount=$presentmentAmount, presentmentCurrency=$presentmentCurrency, settlementAmount=$settlementAmount, settlementCurrency=$settlementCurrency, additionalProperties=$additionalProperties}"

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
            private var decision: JsonField<Decision> = JsonMissing.of()
            private var cardId: JsonField<String> = JsonMissing.of()
            private var accountId: JsonField<String> = JsonMissing.of()
            private var presentmentAmount: JsonField<Long> = JsonMissing.of()
            private var presentmentCurrency: JsonField<String> = JsonMissing.of()
            private var settlementAmount: JsonField<Long> = JsonMissing.of()
            private var settlementCurrency: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(cardAuthorization: CardAuthorization) = apply {
                this.merchantAcceptorId = cardAuthorization.merchantAcceptorId
                this.merchantDescriptor = cardAuthorization.merchantDescriptor
                this.merchantCategoryCode = cardAuthorization.merchantCategoryCode
                this.merchantCity = cardAuthorization.merchantCity
                this.merchantCountry = cardAuthorization.merchantCountry
                this.network = cardAuthorization.network
                this.networkDetails = cardAuthorization.networkDetails
                this.decision = cardAuthorization.decision
                this.cardId = cardAuthorization.cardId
                this.accountId = cardAuthorization.accountId
                this.presentmentAmount = cardAuthorization.presentmentAmount
                this.presentmentCurrency = cardAuthorization.presentmentCurrency
                this.settlementAmount = cardAuthorization.settlementAmount
                this.settlementCurrency = cardAuthorization.settlementCurrency
                additionalProperties(cardAuthorization.additionalProperties)
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
             * The Merchant Category Code (commonly abbreviated as MCC) of the merchant the card is
             * transacting with.
             */
            fun merchantCategoryCode(merchantCategoryCode: String) =
                merchantCategoryCode(JsonField.of(merchantCategoryCode))

            /**
             * The Merchant Category Code (commonly abbreviated as MCC) of the merchant the card is
             * transacting with.
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

            /** Whether or not the authorization was approved. */
            fun decision(decision: Decision) = decision(JsonField.of(decision))

            /** Whether or not the authorization was approved. */
            @JsonProperty("decision")
            @ExcludeMissing
            fun decision(decision: JsonField<Decision>) = apply { this.decision = decision }

            /** The identifier of the Card that is being authorized. */
            fun cardId(cardId: String) = cardId(JsonField.of(cardId))

            /** The identifier of the Card that is being authorized. */
            @JsonProperty("card_id")
            @ExcludeMissing
            fun cardId(cardId: JsonField<String>) = apply { this.cardId = cardId }

            /** The identifier of the Account the authorization will debit. */
            fun accountId(accountId: String) = accountId(JsonField.of(accountId))

            /** The identifier of the Account the authorization will debit. */
            @JsonProperty("account_id")
            @ExcludeMissing
            fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

            /**
             * The amount of the attempted authorization in the currency the card user sees at the
             * time of purchase, in the minor unit of that currency. For dollars, for example, this
             * is cents.
             */
            fun presentmentAmount(presentmentAmount: Long) =
                presentmentAmount(JsonField.of(presentmentAmount))

            /**
             * The amount of the attempted authorization in the currency the card user sees at the
             * time of purchase, in the minor unit of that currency. For dollars, for example, this
             * is cents.
             */
            @JsonProperty("presentment_amount")
            @ExcludeMissing
            fun presentmentAmount(presentmentAmount: JsonField<Long>) = apply {
                this.presentmentAmount = presentmentAmount
            }

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the currency the user
             * sees at the time of purchase.
             */
            fun presentmentCurrency(presentmentCurrency: String) =
                presentmentCurrency(JsonField.of(presentmentCurrency))

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the currency the user
             * sees at the time of purchase.
             */
            @JsonProperty("presentment_currency")
            @ExcludeMissing
            fun presentmentCurrency(presentmentCurrency: JsonField<String>) = apply {
                this.presentmentCurrency = presentmentCurrency
            }

            /**
             * The amount of the attempted authorization in the currency it will be settled in. This
             * currency is the same as that of the Account the card belongs to.
             */
            fun settlementAmount(settlementAmount: Long) =
                settlementAmount(JsonField.of(settlementAmount))

            /**
             * The amount of the attempted authorization in the currency it will be settled in. This
             * currency is the same as that of the Account the card belongs to.
             */
            @JsonProperty("settlement_amount")
            @ExcludeMissing
            fun settlementAmount(settlementAmount: JsonField<Long>) = apply {
                this.settlementAmount = settlementAmount
            }

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the currency the
             * transaction will be settled in.
             */
            fun settlementCurrency(settlementCurrency: String) =
                settlementCurrency(JsonField.of(settlementCurrency))

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the currency the
             * transaction will be settled in.
             */
            @JsonProperty("settlement_currency")
            @ExcludeMissing
            fun settlementCurrency(settlementCurrency: JsonField<String>) = apply {
                this.settlementCurrency = settlementCurrency
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

            fun build(): CardAuthorization =
                CardAuthorization(
                    merchantAcceptorId,
                    merchantDescriptor,
                    merchantCategoryCode,
                    merchantCity,
                    merchantCountry,
                    network,
                    networkDetails,
                    decision,
                    cardId,
                    accountId,
                    presentmentAmount,
                    presentmentCurrency,
                    settlementAmount,
                    settlementCurrency,
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
                 * For electronic commerce transactions, this identifies the level of security used
                 * in obtaining the customer's payment credential. For mail or telephone order
                 * transactions, identifies the type of mail or telephone order.
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
                 * For electronic commerce transactions, this identifies the level of security used
                 * in obtaining the customer's payment credential. For mail or telephone order
                 * transactions, identifies the type of mail or telephone order.
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
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(visa: Visa) = apply {
                        this.electronicCommerceIndicator = visa.electronicCommerceIndicator
                        this.pointOfServiceEntryMode = visa.pointOfServiceEntryMode
                        additionalProperties(visa.additionalProperties)
                    }

                    /**
                     * For electronic commerce transactions, this identifies the level of security
                     * used in obtaining the customer's payment credential. For mail or telephone
                     * order transactions, identifies the type of mail or telephone order.
                     */
                    fun electronicCommerceIndicator(
                        electronicCommerceIndicator: ElectronicCommerceIndicator
                    ) = electronicCommerceIndicator(JsonField.of(electronicCommerceIndicator))

                    /**
                     * For electronic commerce transactions, this identifies the level of security
                     * used in obtaining the customer's payment credential. For mail or telephone
                     * order transactions, identifies the type of mail or telephone order.
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
                    fun pointOfServiceEntryMode(pointOfServiceEntryMode: PointOfServiceEntryMode) =
                        pointOfServiceEntryMode(JsonField.of(pointOfServiceEntryMode))

                    /**
                     * The method used to enter the cardholder's primary account number and card
                     * expiration date
                     */
                    @JsonProperty("point_of_service_entry_mode")
                    @ExcludeMissing
                    fun pointOfServiceEntryMode(
                        pointOfServiceEntryMode: JsonField<PointOfServiceEntryMode>
                    ) = apply { this.pointOfServiceEntryMode = pointOfServiceEntryMode }

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
                        val INSTALLMENT = ElectronicCommerceIndicator(JsonField.of("installment"))

                        @JvmField
                        val UNKNOWN_MAIL_PHONE_ORDER =
                            ElectronicCommerceIndicator(JsonField.of("unknown_mail_phone_order"))

                        @JvmField
                        val SECURE_ELECTRONIC_COMMERCE =
                            ElectronicCommerceIndicator(JsonField.of("secure_electronic_commerce"))

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
                                Value.NON_AUTHENTICATED_SECURITY_TRANSACTION_AT_3DS_CAPABLE_MERCHANT
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
                                Known.NON_AUTHENTICATED_SECURITY_TRANSACTION_AT_3DS_CAPABLE_MERCHANT
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

        class Decision
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Decision && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val APPROVE = Decision(JsonField.of("approve"))

                @JvmField val DECLINE = Decision(JsonField.of("decline"))

                @JvmStatic fun of(value: String) = Decision(JsonField.of(value))
            }

            enum class Known {
                APPROVE,
                DECLINE,
            }

            enum class Value {
                APPROVE,
                DECLINE,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    APPROVE -> Value.APPROVE
                    DECLINE -> Value.DECLINE
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    APPROVE -> Known.APPROVE
                    DECLINE -> Known.DECLINE
                    else -> throw IncreaseInvalidDataException("Unknown Decision: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }
    }

    /** Fields related to a digital wallet token provisioning attempt. */
    @JsonDeserialize(builder = DigitalWalletToken.Builder::class)
    @NoAutoDetect
    class DigitalWalletToken
    private constructor(
        private val decision: JsonField<Decision>,
        private val cardId: JsonField<String>,
        private val digitalWallet: JsonField<DigitalWallet>,
        private val cardProfileId: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /**
         * Whether or not the provisioning request was approved. This will be null until the real
         * time decision is responded to.
         */
        fun decision(): Optional<Decision> = Optional.ofNullable(decision.getNullable("decision"))

        /** The identifier of the Card that is being tokenized. */
        fun cardId(): String = cardId.getRequired("card_id")

        /** The digital wallet app being used. */
        fun digitalWallet(): DigitalWallet = digitalWallet.getRequired("digital_wallet")

        /**
         * The identifier of the Card Profile that was set via the real time decision. This will be
         * null until the real time decision is responded to or if the real time decision did not
         * set a card profile.
         */
        fun cardProfileId(): Optional<String> =
            Optional.ofNullable(cardProfileId.getNullable("card_profile_id"))

        /**
         * Whether or not the provisioning request was approved. This will be null until the real
         * time decision is responded to.
         */
        @JsonProperty("decision") @ExcludeMissing fun _decision() = decision

        /** The identifier of the Card that is being tokenized. */
        @JsonProperty("card_id") @ExcludeMissing fun _cardId() = cardId

        /** The digital wallet app being used. */
        @JsonProperty("digital_wallet") @ExcludeMissing fun _digitalWallet() = digitalWallet

        /**
         * The identifier of the Card Profile that was set via the real time decision. This will be
         * null until the real time decision is responded to or if the real time decision did not
         * set a card profile.
         */
        @JsonProperty("card_profile_id") @ExcludeMissing fun _cardProfileId() = cardProfileId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate() = apply {
            if (!validated) {
                decision()
                cardId()
                digitalWallet()
                cardProfileId()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DigitalWalletToken &&
                this.decision == other.decision &&
                this.cardId == other.cardId &&
                this.digitalWallet == other.digitalWallet &&
                this.cardProfileId == other.cardProfileId &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        decision,
                        cardId,
                        digitalWallet,
                        cardProfileId,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "DigitalWalletToken{decision=$decision, cardId=$cardId, digitalWallet=$digitalWallet, cardProfileId=$cardProfileId, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var decision: JsonField<Decision> = JsonMissing.of()
            private var cardId: JsonField<String> = JsonMissing.of()
            private var digitalWallet: JsonField<DigitalWallet> = JsonMissing.of()
            private var cardProfileId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(digitalWalletToken: DigitalWalletToken) = apply {
                this.decision = digitalWalletToken.decision
                this.cardId = digitalWalletToken.cardId
                this.digitalWallet = digitalWalletToken.digitalWallet
                this.cardProfileId = digitalWalletToken.cardProfileId
                additionalProperties(digitalWalletToken.additionalProperties)
            }

            /**
             * Whether or not the provisioning request was approved. This will be null until the
             * real time decision is responded to.
             */
            fun decision(decision: Decision) = decision(JsonField.of(decision))

            /**
             * Whether or not the provisioning request was approved. This will be null until the
             * real time decision is responded to.
             */
            @JsonProperty("decision")
            @ExcludeMissing
            fun decision(decision: JsonField<Decision>) = apply { this.decision = decision }

            /** The identifier of the Card that is being tokenized. */
            fun cardId(cardId: String) = cardId(JsonField.of(cardId))

            /** The identifier of the Card that is being tokenized. */
            @JsonProperty("card_id")
            @ExcludeMissing
            fun cardId(cardId: JsonField<String>) = apply { this.cardId = cardId }

            /** The digital wallet app being used. */
            fun digitalWallet(digitalWallet: DigitalWallet) =
                digitalWallet(JsonField.of(digitalWallet))

            /** The digital wallet app being used. */
            @JsonProperty("digital_wallet")
            @ExcludeMissing
            fun digitalWallet(digitalWallet: JsonField<DigitalWallet>) = apply {
                this.digitalWallet = digitalWallet
            }

            /**
             * The identifier of the Card Profile that was set via the real time decision. This will
             * be null until the real time decision is responded to or if the real time decision did
             * not set a card profile.
             */
            fun cardProfileId(cardProfileId: String) = cardProfileId(JsonField.of(cardProfileId))

            /**
             * The identifier of the Card Profile that was set via the real time decision. This will
             * be null until the real time decision is responded to or if the real time decision did
             * not set a card profile.
             */
            @JsonProperty("card_profile_id")
            @ExcludeMissing
            fun cardProfileId(cardProfileId: JsonField<String>) = apply {
                this.cardProfileId = cardProfileId
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

            fun build(): DigitalWalletToken =
                DigitalWalletToken(
                    decision,
                    cardId,
                    digitalWallet,
                    cardProfileId,
                    additionalProperties.toUnmodifiable(),
                )
        }

        class Decision
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Decision && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val APPROVE = Decision(JsonField.of("approve"))

                @JvmField val DECLINE = Decision(JsonField.of("decline"))

                @JvmStatic fun of(value: String) = Decision(JsonField.of(value))
            }

            enum class Known {
                APPROVE,
                DECLINE,
            }

            enum class Value {
                APPROVE,
                DECLINE,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    APPROVE -> Value.APPROVE
                    DECLINE -> Value.DECLINE
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    APPROVE -> Known.APPROVE
                    DECLINE -> Known.DECLINE
                    else -> throw IncreaseInvalidDataException("Unknown Decision: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        class DigitalWallet
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is DigitalWallet && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val APPLE_PAY = DigitalWallet(JsonField.of("apple_pay"))

                @JvmField val GOOGLE_PAY = DigitalWallet(JsonField.of("google_pay"))

                @JvmStatic fun of(value: String) = DigitalWallet(JsonField.of(value))
            }

            enum class Known {
                APPLE_PAY,
                GOOGLE_PAY,
            }

            enum class Value {
                APPLE_PAY,
                GOOGLE_PAY,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    APPLE_PAY -> Value.APPLE_PAY
                    GOOGLE_PAY -> Value.GOOGLE_PAY
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    APPLE_PAY -> Known.APPLE_PAY
                    GOOGLE_PAY -> Known.GOOGLE_PAY
                    else -> throw IncreaseInvalidDataException("Unknown DigitalWallet: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }
    }

    /** Fields related to a digital wallet authentication attempt. */
    @JsonDeserialize(builder = DigitalWalletAuthentication.Builder::class)
    @NoAutoDetect
    class DigitalWalletAuthentication
    private constructor(
        private val result: JsonField<Result>,
        private val cardId: JsonField<String>,
        private val digitalWallet: JsonField<DigitalWallet>,
        private val channel: JsonField<Channel>,
        private val oneTimePasscode: JsonField<String>,
        private val phone: JsonField<String>,
        private val email: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /** Whether your application successfully delivered the one-time passcode. */
        fun result(): Optional<Result> = Optional.ofNullable(result.getNullable("result"))

        /** The identifier of the Card that is being tokenized. */
        fun cardId(): String = cardId.getRequired("card_id")

        /** The digital wallet app being used. */
        fun digitalWallet(): DigitalWallet = digitalWallet.getRequired("digital_wallet")

        /** The channel to send the card user their one-time passcode. */
        fun channel(): Channel = channel.getRequired("channel")

        /** The one-time passcode to send the card user. */
        fun oneTimePasscode(): String = oneTimePasscode.getRequired("one_time_passcode")

        /** The phone number to send the one-time passcode to if `channel` is equal to `sms`. */
        fun phone(): Optional<String> = Optional.ofNullable(phone.getNullable("phone"))

        /** The email to send the one-time passcode to if `channel` is equal to `email`. */
        fun email(): Optional<String> = Optional.ofNullable(email.getNullable("email"))

        /** Whether your application successfully delivered the one-time passcode. */
        @JsonProperty("result") @ExcludeMissing fun _result() = result

        /** The identifier of the Card that is being tokenized. */
        @JsonProperty("card_id") @ExcludeMissing fun _cardId() = cardId

        /** The digital wallet app being used. */
        @JsonProperty("digital_wallet") @ExcludeMissing fun _digitalWallet() = digitalWallet

        /** The channel to send the card user their one-time passcode. */
        @JsonProperty("channel") @ExcludeMissing fun _channel() = channel

        /** The one-time passcode to send the card user. */
        @JsonProperty("one_time_passcode") @ExcludeMissing fun _oneTimePasscode() = oneTimePasscode

        /** The phone number to send the one-time passcode to if `channel` is equal to `sms`. */
        @JsonProperty("phone") @ExcludeMissing fun _phone() = phone

        /** The email to send the one-time passcode to if `channel` is equal to `email`. */
        @JsonProperty("email") @ExcludeMissing fun _email() = email

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate() = apply {
            if (!validated) {
                result()
                cardId()
                digitalWallet()
                channel()
                oneTimePasscode()
                phone()
                email()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DigitalWalletAuthentication &&
                this.result == other.result &&
                this.cardId == other.cardId &&
                this.digitalWallet == other.digitalWallet &&
                this.channel == other.channel &&
                this.oneTimePasscode == other.oneTimePasscode &&
                this.phone == other.phone &&
                this.email == other.email &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        result,
                        cardId,
                        digitalWallet,
                        channel,
                        oneTimePasscode,
                        phone,
                        email,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "DigitalWalletAuthentication{result=$result, cardId=$cardId, digitalWallet=$digitalWallet, channel=$channel, oneTimePasscode=$oneTimePasscode, phone=$phone, email=$email, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var result: JsonField<Result> = JsonMissing.of()
            private var cardId: JsonField<String> = JsonMissing.of()
            private var digitalWallet: JsonField<DigitalWallet> = JsonMissing.of()
            private var channel: JsonField<Channel> = JsonMissing.of()
            private var oneTimePasscode: JsonField<String> = JsonMissing.of()
            private var phone: JsonField<String> = JsonMissing.of()
            private var email: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(digitalWalletAuthentication: DigitalWalletAuthentication) = apply {
                this.result = digitalWalletAuthentication.result
                this.cardId = digitalWalletAuthentication.cardId
                this.digitalWallet = digitalWalletAuthentication.digitalWallet
                this.channel = digitalWalletAuthentication.channel
                this.oneTimePasscode = digitalWalletAuthentication.oneTimePasscode
                this.phone = digitalWalletAuthentication.phone
                this.email = digitalWalletAuthentication.email
                additionalProperties(digitalWalletAuthentication.additionalProperties)
            }

            /** Whether your application successfully delivered the one-time passcode. */
            fun result(result: Result) = result(JsonField.of(result))

            /** Whether your application successfully delivered the one-time passcode. */
            @JsonProperty("result")
            @ExcludeMissing
            fun result(result: JsonField<Result>) = apply { this.result = result }

            /** The identifier of the Card that is being tokenized. */
            fun cardId(cardId: String) = cardId(JsonField.of(cardId))

            /** The identifier of the Card that is being tokenized. */
            @JsonProperty("card_id")
            @ExcludeMissing
            fun cardId(cardId: JsonField<String>) = apply { this.cardId = cardId }

            /** The digital wallet app being used. */
            fun digitalWallet(digitalWallet: DigitalWallet) =
                digitalWallet(JsonField.of(digitalWallet))

            /** The digital wallet app being used. */
            @JsonProperty("digital_wallet")
            @ExcludeMissing
            fun digitalWallet(digitalWallet: JsonField<DigitalWallet>) = apply {
                this.digitalWallet = digitalWallet
            }

            /** The channel to send the card user their one-time passcode. */
            fun channel(channel: Channel) = channel(JsonField.of(channel))

            /** The channel to send the card user their one-time passcode. */
            @JsonProperty("channel")
            @ExcludeMissing
            fun channel(channel: JsonField<Channel>) = apply { this.channel = channel }

            /** The one-time passcode to send the card user. */
            fun oneTimePasscode(oneTimePasscode: String) =
                oneTimePasscode(JsonField.of(oneTimePasscode))

            /** The one-time passcode to send the card user. */
            @JsonProperty("one_time_passcode")
            @ExcludeMissing
            fun oneTimePasscode(oneTimePasscode: JsonField<String>) = apply {
                this.oneTimePasscode = oneTimePasscode
            }

            /** The phone number to send the one-time passcode to if `channel` is equal to `sms`. */
            fun phone(phone: String) = phone(JsonField.of(phone))

            /** The phone number to send the one-time passcode to if `channel` is equal to `sms`. */
            @JsonProperty("phone")
            @ExcludeMissing
            fun phone(phone: JsonField<String>) = apply { this.phone = phone }

            /** The email to send the one-time passcode to if `channel` is equal to `email`. */
            fun email(email: String) = email(JsonField.of(email))

            /** The email to send the one-time passcode to if `channel` is equal to `email`. */
            @JsonProperty("email")
            @ExcludeMissing
            fun email(email: JsonField<String>) = apply { this.email = email }

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

            fun build(): DigitalWalletAuthentication =
                DigitalWalletAuthentication(
                    result,
                    cardId,
                    digitalWallet,
                    channel,
                    oneTimePasscode,
                    phone,
                    email,
                    additionalProperties.toUnmodifiable(),
                )
        }

        class Result
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Result && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val SUCCESS = Result(JsonField.of("success"))

                @JvmField val FAILURE = Result(JsonField.of("failure"))

                @JvmStatic fun of(value: String) = Result(JsonField.of(value))
            }

            enum class Known {
                SUCCESS,
                FAILURE,
            }

            enum class Value {
                SUCCESS,
                FAILURE,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    SUCCESS -> Value.SUCCESS
                    FAILURE -> Value.FAILURE
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    SUCCESS -> Known.SUCCESS
                    FAILURE -> Known.FAILURE
                    else -> throw IncreaseInvalidDataException("Unknown Result: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        class DigitalWallet
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is DigitalWallet && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val APPLE_PAY = DigitalWallet(JsonField.of("apple_pay"))

                @JvmField val GOOGLE_PAY = DigitalWallet(JsonField.of("google_pay"))

                @JvmStatic fun of(value: String) = DigitalWallet(JsonField.of(value))
            }

            enum class Known {
                APPLE_PAY,
                GOOGLE_PAY,
            }

            enum class Value {
                APPLE_PAY,
                GOOGLE_PAY,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    APPLE_PAY -> Value.APPLE_PAY
                    GOOGLE_PAY -> Value.GOOGLE_PAY
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    APPLE_PAY -> Known.APPLE_PAY
                    GOOGLE_PAY -> Known.GOOGLE_PAY
                    else -> throw IncreaseInvalidDataException("Unknown DigitalWallet: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        class Channel
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Channel && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val SMS = Channel(JsonField.of("sms"))

                @JvmField val EMAIL = Channel(JsonField.of("email"))

                @JvmStatic fun of(value: String) = Channel(JsonField.of(value))
            }

            enum class Known {
                SMS,
                EMAIL,
            }

            enum class Value {
                SMS,
                EMAIL,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    SMS -> Value.SMS
                    EMAIL -> Value.EMAIL
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    SMS -> Known.SMS
                    EMAIL -> Known.EMAIL
                    else -> throw IncreaseInvalidDataException("Unknown Channel: $value")
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

            @JvmField val REAL_TIME_DECISION = Type(JsonField.of("real_time_decision"))

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            REAL_TIME_DECISION,
        }

        enum class Value {
            REAL_TIME_DECISION,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                REAL_TIME_DECISION -> Value.REAL_TIME_DECISION
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                REAL_TIME_DECISION -> Known.REAL_TIME_DECISION
                else -> throw IncreaseInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
