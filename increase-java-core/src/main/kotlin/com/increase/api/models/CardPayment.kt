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
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

/**
 * Card Payments group together interactions related to a single card payment, such as an
 * authorization and its corresponding settlement.
 */
@JsonDeserialize(builder = CardPayment.Builder::class)
@NoAutoDetect
class CardPayment
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val accountId: JsonField<String>,
    private val cardId: JsonField<String>,
    private val elements: JsonField<List<Element>>,
    private val state: JsonField<State>,
    private val type: JsonField<Type>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** The Card Payment identifier. */
    fun id(): String = id.getRequired("id")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Card Payment was
     * created.
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** The identifier for the Account the Transaction belongs to. */
    fun accountId(): String = accountId.getRequired("account_id")

    /** The Card identifier for this payment. */
    fun cardId(): String = cardId.getRequired("card_id")

    /** The interactions related to this card payment. */
    fun elements(): List<Element> = elements.getRequired("elements")

    /** The summarized state of this card payment. */
    fun state(): State = state.getRequired("state")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `card_payment`.
     */
    fun type(): Type = type.getRequired("type")

    /** The Card Payment identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Card Payment was
     * created.
     */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    /** The identifier for the Account the Transaction belongs to. */
    @JsonProperty("account_id") @ExcludeMissing fun _accountId() = accountId

    /** The Card identifier for this payment. */
    @JsonProperty("card_id") @ExcludeMissing fun _cardId() = cardId

    /** The interactions related to this card payment. */
    @JsonProperty("elements") @ExcludeMissing fun _elements() = elements

    /** The summarized state of this card payment. */
    @JsonProperty("state") @ExcludeMissing fun _state() = state

    /**
     * A constant representing the object's type. For this resource it will always be
     * `card_payment`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): CardPayment = apply {
        if (!validated) {
            id()
            createdAt()
            accountId()
            cardId()
            elements().forEach { it.validate() }
            state().validate()
            type()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CardPayment &&
            this.id == other.id &&
            this.createdAt == other.createdAt &&
            this.accountId == other.accountId &&
            this.cardId == other.cardId &&
            this.elements == other.elements &&
            this.state == other.state &&
            this.type == other.type &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    id,
                    createdAt,
                    accountId,
                    cardId,
                    elements,
                    state,
                    type,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "CardPayment{id=$id, createdAt=$createdAt, accountId=$accountId, cardId=$cardId, elements=$elements, state=$state, type=$type, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var accountId: JsonField<String> = JsonMissing.of()
        private var cardId: JsonField<String> = JsonMissing.of()
        private var elements: JsonField<List<Element>> = JsonMissing.of()
        private var state: JsonField<State> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(cardPayment: CardPayment) = apply {
            this.id = cardPayment.id
            this.createdAt = cardPayment.createdAt
            this.accountId = cardPayment.accountId
            this.cardId = cardPayment.cardId
            this.elements = cardPayment.elements
            this.state = cardPayment.state
            this.type = cardPayment.type
            additionalProperties(cardPayment.additionalProperties)
        }

        /** The Card Payment identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The Card Payment identifier. */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Card Payment was
         * created.
         */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Card Payment was
         * created.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The identifier for the Account the Transaction belongs to. */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /** The identifier for the Account the Transaction belongs to. */
        @JsonProperty("account_id")
        @ExcludeMissing
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        /** The Card identifier for this payment. */
        fun cardId(cardId: String) = cardId(JsonField.of(cardId))

        /** The Card identifier for this payment. */
        @JsonProperty("card_id")
        @ExcludeMissing
        fun cardId(cardId: JsonField<String>) = apply { this.cardId = cardId }

        /** The interactions related to this card payment. */
        fun elements(elements: List<Element>) = elements(JsonField.of(elements))

        /** The interactions related to this card payment. */
        @JsonProperty("elements")
        @ExcludeMissing
        fun elements(elements: JsonField<List<Element>>) = apply { this.elements = elements }

        /** The summarized state of this card payment. */
        fun state(state: State) = state(JsonField.of(state))

        /** The summarized state of this card payment. */
        @JsonProperty("state")
        @ExcludeMissing
        fun state(state: JsonField<State>) = apply { this.state = state }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `card_payment`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be
         * `card_payment`.
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

        fun build(): CardPayment =
            CardPayment(
                id,
                createdAt,
                accountId,
                cardId,
                elements.map { it.toUnmodifiable() },
                state,
                type,
                additionalProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(builder = Element.Builder::class)
    @NoAutoDetect
    class Element
    private constructor(
        private val category: JsonField<Category>,
        private val cardAuthorization: JsonField<CardAuthorization>,
        private val cardValidation: JsonField<CardValidation>,
        private val cardDecline: JsonField<CardDecline>,
        private val cardReversal: JsonField<CardReversal>,
        private val cardAuthorizationExpiration: JsonField<CardAuthorizationExpiration>,
        private val cardIncrement: JsonField<CardIncrement>,
        private val cardSettlement: JsonField<CardSettlement>,
        private val cardRefund: JsonField<CardRefund>,
        private val createdAt: JsonField<OffsetDateTime>,
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
         * A Card Authorization object. This field will be present in the JSON response if and only
         * if `category` is equal to `card_authorization`.
         */
        fun cardAuthorization(): Optional<CardAuthorization> =
            Optional.ofNullable(cardAuthorization.getNullable("card_authorization"))

        /**
         * A Card Validation object. This field will be present in the JSON response if and only if
         * `category` is equal to `card_validation`.
         */
        fun cardValidation(): Optional<CardValidation> =
            Optional.ofNullable(cardValidation.getNullable("card_validation"))

        /**
         * A Card Decline object. This field will be present in the JSON response if and only if
         * `category` is equal to `card_decline`.
         */
        fun cardDecline(): Optional<CardDecline> =
            Optional.ofNullable(cardDecline.getNullable("card_decline"))

        /**
         * A Card Reversal object. This field will be present in the JSON response if and only if
         * `category` is equal to `card_reversal`.
         */
        fun cardReversal(): Optional<CardReversal> =
            Optional.ofNullable(cardReversal.getNullable("card_reversal"))

        /**
         * A Card Authorization Expiration object. This field will be present in the JSON response
         * if and only if `category` is equal to `card_authorization_expiration`.
         */
        fun cardAuthorizationExpiration(): Optional<CardAuthorizationExpiration> =
            Optional.ofNullable(
                cardAuthorizationExpiration.getNullable("card_authorization_expiration")
            )

        /**
         * A Card Increment object. This field will be present in the JSON response if and only if
         * `category` is equal to `card_increment`.
         */
        fun cardIncrement(): Optional<CardIncrement> =
            Optional.ofNullable(cardIncrement.getNullable("card_increment"))

        /**
         * A Card Settlement object. This field will be present in the JSON response if and only if
         * `category` is equal to `card_settlement`.
         */
        fun cardSettlement(): Optional<CardSettlement> =
            Optional.ofNullable(cardSettlement.getNullable("card_settlement"))

        /**
         * A Card Refund object. This field will be present in the JSON response if and only if
         * `category` is equal to `card_refund`.
         */
        fun cardRefund(): Optional<CardRefund> =
            Optional.ofNullable(cardRefund.getNullable("card_refund"))

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the card
         * payment element was created.
         */
        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        /**
         * The type of the resource. We may add additional possible values for this enum over time;
         * your application should be able to handle such additions gracefully.
         */
        @JsonProperty("category") @ExcludeMissing fun _category() = category

        /**
         * A Card Authorization object. This field will be present in the JSON response if and only
         * if `category` is equal to `card_authorization`.
         */
        @JsonProperty("card_authorization")
        @ExcludeMissing
        fun _cardAuthorization() = cardAuthorization

        /**
         * A Card Validation object. This field will be present in the JSON response if and only if
         * `category` is equal to `card_validation`.
         */
        @JsonProperty("card_validation") @ExcludeMissing fun _cardValidation() = cardValidation

        /**
         * A Card Decline object. This field will be present in the JSON response if and only if
         * `category` is equal to `card_decline`.
         */
        @JsonProperty("card_decline") @ExcludeMissing fun _cardDecline() = cardDecline

        /**
         * A Card Reversal object. This field will be present in the JSON response if and only if
         * `category` is equal to `card_reversal`.
         */
        @JsonProperty("card_reversal") @ExcludeMissing fun _cardReversal() = cardReversal

        /**
         * A Card Authorization Expiration object. This field will be present in the JSON response
         * if and only if `category` is equal to `card_authorization_expiration`.
         */
        @JsonProperty("card_authorization_expiration")
        @ExcludeMissing
        fun _cardAuthorizationExpiration() = cardAuthorizationExpiration

        /**
         * A Card Increment object. This field will be present in the JSON response if and only if
         * `category` is equal to `card_increment`.
         */
        @JsonProperty("card_increment") @ExcludeMissing fun _cardIncrement() = cardIncrement

        /**
         * A Card Settlement object. This field will be present in the JSON response if and only if
         * `category` is equal to `card_settlement`.
         */
        @JsonProperty("card_settlement") @ExcludeMissing fun _cardSettlement() = cardSettlement

        /**
         * A Card Refund object. This field will be present in the JSON response if and only if
         * `category` is equal to `card_refund`.
         */
        @JsonProperty("card_refund") @ExcludeMissing fun _cardRefund() = cardRefund

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the card
         * payment element was created.
         */
        @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Element = apply {
            if (!validated) {
                category()
                cardAuthorization().map { it.validate() }
                cardValidation().map { it.validate() }
                cardDecline().map { it.validate() }
                cardReversal().map { it.validate() }
                cardAuthorizationExpiration().map { it.validate() }
                cardIncrement().map { it.validate() }
                cardSettlement().map { it.validate() }
                cardRefund().map { it.validate() }
                createdAt()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Element &&
                this.category == other.category &&
                this.cardAuthorization == other.cardAuthorization &&
                this.cardValidation == other.cardValidation &&
                this.cardDecline == other.cardDecline &&
                this.cardReversal == other.cardReversal &&
                this.cardAuthorizationExpiration == other.cardAuthorizationExpiration &&
                this.cardIncrement == other.cardIncrement &&
                this.cardSettlement == other.cardSettlement &&
                this.cardRefund == other.cardRefund &&
                this.createdAt == other.createdAt &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        category,
                        cardAuthorization,
                        cardValidation,
                        cardDecline,
                        cardReversal,
                        cardAuthorizationExpiration,
                        cardIncrement,
                        cardSettlement,
                        cardRefund,
                        createdAt,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Element{category=$category, cardAuthorization=$cardAuthorization, cardValidation=$cardValidation, cardDecline=$cardDecline, cardReversal=$cardReversal, cardAuthorizationExpiration=$cardAuthorizationExpiration, cardIncrement=$cardIncrement, cardSettlement=$cardSettlement, cardRefund=$cardRefund, createdAt=$createdAt, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var category: JsonField<Category> = JsonMissing.of()
            private var cardAuthorization: JsonField<CardAuthorization> = JsonMissing.of()
            private var cardValidation: JsonField<CardValidation> = JsonMissing.of()
            private var cardDecline: JsonField<CardDecline> = JsonMissing.of()
            private var cardReversal: JsonField<CardReversal> = JsonMissing.of()
            private var cardAuthorizationExpiration: JsonField<CardAuthorizationExpiration> =
                JsonMissing.of()
            private var cardIncrement: JsonField<CardIncrement> = JsonMissing.of()
            private var cardSettlement: JsonField<CardSettlement> = JsonMissing.of()
            private var cardRefund: JsonField<CardRefund> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(element: Element) = apply {
                this.category = element.category
                this.cardAuthorization = element.cardAuthorization
                this.cardValidation = element.cardValidation
                this.cardDecline = element.cardDecline
                this.cardReversal = element.cardReversal
                this.cardAuthorizationExpiration = element.cardAuthorizationExpiration
                this.cardIncrement = element.cardIncrement
                this.cardSettlement = element.cardSettlement
                this.cardRefund = element.cardRefund
                this.createdAt = element.createdAt
                additionalProperties(element.additionalProperties)
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
             * A Card Validation object. This field will be present in the JSON response if and only
             * if `category` is equal to `card_validation`.
             */
            fun cardValidation(cardValidation: CardValidation) =
                cardValidation(JsonField.of(cardValidation))

            /**
             * A Card Validation object. This field will be present in the JSON response if and only
             * if `category` is equal to `card_validation`.
             */
            @JsonProperty("card_validation")
            @ExcludeMissing
            fun cardValidation(cardValidation: JsonField<CardValidation>) = apply {
                this.cardValidation = cardValidation
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
             * A Card Reversal object. This field will be present in the JSON response if and only
             * if `category` is equal to `card_reversal`.
             */
            fun cardReversal(cardReversal: CardReversal) = cardReversal(JsonField.of(cardReversal))

            /**
             * A Card Reversal object. This field will be present in the JSON response if and only
             * if `category` is equal to `card_reversal`.
             */
            @JsonProperty("card_reversal")
            @ExcludeMissing
            fun cardReversal(cardReversal: JsonField<CardReversal>) = apply {
                this.cardReversal = cardReversal
            }

            /**
             * A Card Authorization Expiration object. This field will be present in the JSON
             * response if and only if `category` is equal to `card_authorization_expiration`.
             */
            fun cardAuthorizationExpiration(
                cardAuthorizationExpiration: CardAuthorizationExpiration
            ) = cardAuthorizationExpiration(JsonField.of(cardAuthorizationExpiration))

            /**
             * A Card Authorization Expiration object. This field will be present in the JSON
             * response if and only if `category` is equal to `card_authorization_expiration`.
             */
            @JsonProperty("card_authorization_expiration")
            @ExcludeMissing
            fun cardAuthorizationExpiration(
                cardAuthorizationExpiration: JsonField<CardAuthorizationExpiration>
            ) = apply { this.cardAuthorizationExpiration = cardAuthorizationExpiration }

            /**
             * A Card Increment object. This field will be present in the JSON response if and only
             * if `category` is equal to `card_increment`.
             */
            fun cardIncrement(cardIncrement: CardIncrement) =
                cardIncrement(JsonField.of(cardIncrement))

            /**
             * A Card Increment object. This field will be present in the JSON response if and only
             * if `category` is equal to `card_increment`.
             */
            @JsonProperty("card_increment")
            @ExcludeMissing
            fun cardIncrement(cardIncrement: JsonField<CardIncrement>) = apply {
                this.cardIncrement = cardIncrement
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
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * card payment element was created.
             */
            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * card payment element was created.
             */
            @JsonProperty("created_at")
            @ExcludeMissing
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
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

            fun build(): Element =
                Element(
                    category,
                    cardAuthorization,
                    cardValidation,
                    cardDecline,
                    cardReversal,
                    cardAuthorizationExpiration,
                    cardIncrement,
                    cardSettlement,
                    cardRefund,
                    createdAt,
                    additionalProperties.toUnmodifiable(),
                )
        }

        /**
         * A Card Authorization object. This field will be present in the JSON response if and only
         * if `category` is equal to `card_authorization`.
         */
        @JsonDeserialize(builder = CardAuthorization.Builder::class)
        @NoAutoDetect
        class CardAuthorization
        private constructor(
            private val id: JsonField<String>,
            private val cardPaymentId: JsonField<String>,
            private val merchantAcceptorId: JsonField<String>,
            private val merchantDescriptor: JsonField<String>,
            private val merchantCategoryCode: JsonField<String>,
            private val merchantCity: JsonField<String>,
            private val merchantCountry: JsonField<String>,
            private val digitalWalletTokenId: JsonField<String>,
            private val physicalCardId: JsonField<String>,
            private val networkDetails: JsonField<NetworkDetails>,
            private val amount: JsonField<Long>,
            private val currency: JsonField<Currency>,
            private val direction: JsonField<Direction>,
            private val expiresAt: JsonField<OffsetDateTime>,
            private val realTimeDecisionId: JsonField<String>,
            private val pendingTransactionId: JsonField<String>,
            private val type: JsonField<Type>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** The Card Authorization identifier. */
            fun id(): String = id.getRequired("id")

            /** The ID of the Card Payment this transaction belongs to. */
            fun cardPaymentId(): Optional<String> =
                Optional.ofNullable(cardPaymentId.getNullable("card_payment_id"))

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

            /** Fields specific to the `network`. */
            fun networkDetails(): NetworkDetails = networkDetails.getRequired("network_details")

            /**
             * The pending amount in the minor unit of the transaction's currency. For dollars, for
             * example, this is cents.
             */
            fun amount(): Long = amount.getRequired("amount")

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
             * currency.
             */
            fun currency(): Currency = currency.getRequired("currency")

            /**
             * The direction descibes the direction the funds will move, either from the cardholder
             * to the merchant or from the merchant to the cardholder.
             */
            fun direction(): Direction = direction.getRequired("direction")

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) when this authorization will
             * expire and the pending transaction will be released.
             */
            fun expiresAt(): OffsetDateTime = expiresAt.getRequired("expires_at")

            /**
             * The identifier of the Real-Time Decision sent to approve or decline this transaction.
             */
            fun realTimeDecisionId(): Optional<String> =
                Optional.ofNullable(realTimeDecisionId.getNullable("real_time_decision_id"))

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

            /** The ID of the Card Payment this transaction belongs to. */
            @JsonProperty("card_payment_id") @ExcludeMissing fun _cardPaymentId() = cardPaymentId

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

            /** Fields specific to the `network`. */
            @JsonProperty("network_details") @ExcludeMissing fun _networkDetails() = networkDetails

            /**
             * The pending amount in the minor unit of the transaction's currency. For dollars, for
             * example, this is cents.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
             * currency.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            /**
             * The direction descibes the direction the funds will move, either from the cardholder
             * to the merchant or from the merchant to the cardholder.
             */
            @JsonProperty("direction") @ExcludeMissing fun _direction() = direction

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) when this authorization will
             * expire and the pending transaction will be released.
             */
            @JsonProperty("expires_at") @ExcludeMissing fun _expiresAt() = expiresAt

            /**
             * The identifier of the Real-Time Decision sent to approve or decline this transaction.
             */
            @JsonProperty("real_time_decision_id")
            @ExcludeMissing
            fun _realTimeDecisionId() = realTimeDecisionId

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
                    cardPaymentId()
                    merchantAcceptorId()
                    merchantDescriptor()
                    merchantCategoryCode()
                    merchantCity()
                    merchantCountry()
                    digitalWalletTokenId()
                    physicalCardId()
                    networkDetails().validate()
                    amount()
                    currency()
                    direction()
                    expiresAt()
                    realTimeDecisionId()
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
                    this.cardPaymentId == other.cardPaymentId &&
                    this.merchantAcceptorId == other.merchantAcceptorId &&
                    this.merchantDescriptor == other.merchantDescriptor &&
                    this.merchantCategoryCode == other.merchantCategoryCode &&
                    this.merchantCity == other.merchantCity &&
                    this.merchantCountry == other.merchantCountry &&
                    this.digitalWalletTokenId == other.digitalWalletTokenId &&
                    this.physicalCardId == other.physicalCardId &&
                    this.networkDetails == other.networkDetails &&
                    this.amount == other.amount &&
                    this.currency == other.currency &&
                    this.direction == other.direction &&
                    this.expiresAt == other.expiresAt &&
                    this.realTimeDecisionId == other.realTimeDecisionId &&
                    this.pendingTransactionId == other.pendingTransactionId &&
                    this.type == other.type &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            id,
                            cardPaymentId,
                            merchantAcceptorId,
                            merchantDescriptor,
                            merchantCategoryCode,
                            merchantCity,
                            merchantCountry,
                            digitalWalletTokenId,
                            physicalCardId,
                            networkDetails,
                            amount,
                            currency,
                            direction,
                            expiresAt,
                            realTimeDecisionId,
                            pendingTransactionId,
                            type,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "CardAuthorization{id=$id, cardPaymentId=$cardPaymentId, merchantAcceptorId=$merchantAcceptorId, merchantDescriptor=$merchantDescriptor, merchantCategoryCode=$merchantCategoryCode, merchantCity=$merchantCity, merchantCountry=$merchantCountry, digitalWalletTokenId=$digitalWalletTokenId, physicalCardId=$physicalCardId, networkDetails=$networkDetails, amount=$amount, currency=$currency, direction=$direction, expiresAt=$expiresAt, realTimeDecisionId=$realTimeDecisionId, pendingTransactionId=$pendingTransactionId, type=$type, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var cardPaymentId: JsonField<String> = JsonMissing.of()
                private var merchantAcceptorId: JsonField<String> = JsonMissing.of()
                private var merchantDescriptor: JsonField<String> = JsonMissing.of()
                private var merchantCategoryCode: JsonField<String> = JsonMissing.of()
                private var merchantCity: JsonField<String> = JsonMissing.of()
                private var merchantCountry: JsonField<String> = JsonMissing.of()
                private var digitalWalletTokenId: JsonField<String> = JsonMissing.of()
                private var physicalCardId: JsonField<String> = JsonMissing.of()
                private var networkDetails: JsonField<NetworkDetails> = JsonMissing.of()
                private var amount: JsonField<Long> = JsonMissing.of()
                private var currency: JsonField<Currency> = JsonMissing.of()
                private var direction: JsonField<Direction> = JsonMissing.of()
                private var expiresAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var realTimeDecisionId: JsonField<String> = JsonMissing.of()
                private var pendingTransactionId: JsonField<String> = JsonMissing.of()
                private var type: JsonField<Type> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(cardAuthorization: CardAuthorization) = apply {
                    this.id = cardAuthorization.id
                    this.cardPaymentId = cardAuthorization.cardPaymentId
                    this.merchantAcceptorId = cardAuthorization.merchantAcceptorId
                    this.merchantDescriptor = cardAuthorization.merchantDescriptor
                    this.merchantCategoryCode = cardAuthorization.merchantCategoryCode
                    this.merchantCity = cardAuthorization.merchantCity
                    this.merchantCountry = cardAuthorization.merchantCountry
                    this.digitalWalletTokenId = cardAuthorization.digitalWalletTokenId
                    this.physicalCardId = cardAuthorization.physicalCardId
                    this.networkDetails = cardAuthorization.networkDetails
                    this.amount = cardAuthorization.amount
                    this.currency = cardAuthorization.currency
                    this.direction = cardAuthorization.direction
                    this.expiresAt = cardAuthorization.expiresAt
                    this.realTimeDecisionId = cardAuthorization.realTimeDecisionId
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

                /** Fields specific to the `network`. */
                fun networkDetails(networkDetails: NetworkDetails) =
                    networkDetails(JsonField.of(networkDetails))

                /** Fields specific to the `network`. */
                @JsonProperty("network_details")
                @ExcludeMissing
                fun networkDetails(networkDetails: JsonField<NetworkDetails>) = apply {
                    this.networkDetails = networkDetails
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
                 * The direction descibes the direction the funds will move, either from the
                 * cardholder to the merchant or from the merchant to the cardholder.
                 */
                fun direction(direction: Direction) = direction(JsonField.of(direction))

                /**
                 * The direction descibes the direction the funds will move, either from the
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
                        cardPaymentId,
                        merchantAcceptorId,
                        merchantDescriptor,
                        merchantCategoryCode,
                        merchantCity,
                        merchantCountry,
                        digitalWalletTokenId,
                        physicalCardId,
                        networkDetails,
                        amount,
                        currency,
                        direction,
                        expiresAt,
                        realTimeDecisionId,
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

            class Direction
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Direction && this.value == other.value
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
         * A Card Authorization Expiration object. This field will be present in the JSON response
         * if and only if `category` is equal to `card_authorization_expiration`.
         */
        @JsonDeserialize(builder = CardAuthorizationExpiration.Builder::class)
        @NoAutoDetect
        class CardAuthorizationExpiration
        private constructor(
            private val id: JsonField<String>,
            private val expiredAmount: JsonField<Long>,
            private val currency: JsonField<Currency>,
            private val cardAuthorizationId: JsonField<String>,
            private val network: JsonField<Network>,
            private val type: JsonField<Type>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** The Card Authorization Expiration identifier. */
            fun id(): String = id.getRequired("id")

            /**
             * The amount of this authorization expiration in the minor unit of the transaction's
             * currency. For dollars, for example, this is cents.
             */
            fun expiredAmount(): Long = expiredAmount.getRequired("expired_amount")

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the reversal's
             * currency.
             */
            fun currency(): Currency = currency.getRequired("currency")

            /** The identifier for the Card Authorization this reverses. */
            fun cardAuthorizationId(): String =
                cardAuthorizationId.getRequired("card_authorization_id")

            /** The card network used to process this card authorization. */
            fun network(): Network = network.getRequired("network")

            /**
             * A constant representing the object's type. For this resource it will always be
             * `card_authorization_expiration`.
             */
            fun type(): Type = type.getRequired("type")

            /** The Card Authorization Expiration identifier. */
            @JsonProperty("id") @ExcludeMissing fun _id() = id

            /**
             * The amount of this authorization expiration in the minor unit of the transaction's
             * currency. For dollars, for example, this is cents.
             */
            @JsonProperty("expired_amount") @ExcludeMissing fun _expiredAmount() = expiredAmount

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the reversal's
             * currency.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            /** The identifier for the Card Authorization this reverses. */
            @JsonProperty("card_authorization_id")
            @ExcludeMissing
            fun _cardAuthorizationId() = cardAuthorizationId

            /** The card network used to process this card authorization. */
            @JsonProperty("network") @ExcludeMissing fun _network() = network

            /**
             * A constant representing the object's type. For this resource it will always be
             * `card_authorization_expiration`.
             */
            @JsonProperty("type") @ExcludeMissing fun _type() = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): CardAuthorizationExpiration = apply {
                if (!validated) {
                    id()
                    expiredAmount()
                    currency()
                    cardAuthorizationId()
                    network()
                    type()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CardAuthorizationExpiration &&
                    this.id == other.id &&
                    this.expiredAmount == other.expiredAmount &&
                    this.currency == other.currency &&
                    this.cardAuthorizationId == other.cardAuthorizationId &&
                    this.network == other.network &&
                    this.type == other.type &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            id,
                            expiredAmount,
                            currency,
                            cardAuthorizationId,
                            network,
                            type,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "CardAuthorizationExpiration{id=$id, expiredAmount=$expiredAmount, currency=$currency, cardAuthorizationId=$cardAuthorizationId, network=$network, type=$type, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var expiredAmount: JsonField<Long> = JsonMissing.of()
                private var currency: JsonField<Currency> = JsonMissing.of()
                private var cardAuthorizationId: JsonField<String> = JsonMissing.of()
                private var network: JsonField<Network> = JsonMissing.of()
                private var type: JsonField<Type> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(cardAuthorizationExpiration: CardAuthorizationExpiration) =
                    apply {
                        this.id = cardAuthorizationExpiration.id
                        this.expiredAmount = cardAuthorizationExpiration.expiredAmount
                        this.currency = cardAuthorizationExpiration.currency
                        this.cardAuthorizationId = cardAuthorizationExpiration.cardAuthorizationId
                        this.network = cardAuthorizationExpiration.network
                        this.type = cardAuthorizationExpiration.type
                        additionalProperties(cardAuthorizationExpiration.additionalProperties)
                    }

                /** The Card Authorization Expiration identifier. */
                fun id(id: String) = id(JsonField.of(id))

                /** The Card Authorization Expiration identifier. */
                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                /**
                 * The amount of this authorization expiration in the minor unit of the
                 * transaction's currency. For dollars, for example, this is cents.
                 */
                fun expiredAmount(expiredAmount: Long) = expiredAmount(JsonField.of(expiredAmount))

                /**
                 * The amount of this authorization expiration in the minor unit of the
                 * transaction's currency. For dollars, for example, this is cents.
                 */
                @JsonProperty("expired_amount")
                @ExcludeMissing
                fun expiredAmount(expiredAmount: JsonField<Long>) = apply {
                    this.expiredAmount = expiredAmount
                }

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the reversal's
                 * currency.
                 */
                fun currency(currency: Currency) = currency(JsonField.of(currency))

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the reversal's
                 * currency.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                /** The identifier for the Card Authorization this reverses. */
                fun cardAuthorizationId(cardAuthorizationId: String) =
                    cardAuthorizationId(JsonField.of(cardAuthorizationId))

                /** The identifier for the Card Authorization this reverses. */
                @JsonProperty("card_authorization_id")
                @ExcludeMissing
                fun cardAuthorizationId(cardAuthorizationId: JsonField<String>) = apply {
                    this.cardAuthorizationId = cardAuthorizationId
                }

                /** The card network used to process this card authorization. */
                fun network(network: Network) = network(JsonField.of(network))

                /** The card network used to process this card authorization. */
                @JsonProperty("network")
                @ExcludeMissing
                fun network(network: JsonField<Network>) = apply { this.network = network }

                /**
                 * A constant representing the object's type. For this resource it will always be
                 * `card_authorization_expiration`.
                 */
                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * A constant representing the object's type. For this resource it will always be
                 * `card_authorization_expiration`.
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

                fun build(): CardAuthorizationExpiration =
                    CardAuthorizationExpiration(
                        id,
                        expiredAmount,
                        currency,
                        cardAuthorizationId,
                        network,
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
                    val CARD_AUTHORIZATION_EXPIRATION =
                        Type(JsonField.of("card_authorization_expiration"))

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                enum class Known {
                    CARD_AUTHORIZATION_EXPIRATION,
                }

                enum class Value {
                    CARD_AUTHORIZATION_EXPIRATION,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        CARD_AUTHORIZATION_EXPIRATION -> Value.CARD_AUTHORIZATION_EXPIRATION
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        CARD_AUTHORIZATION_EXPIRATION -> Known.CARD_AUTHORIZATION_EXPIRATION
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
                "CardDecline{merchantAcceptorId=$merchantAcceptorId, merchantDescriptor=$merchantDescriptor, merchantCategoryCode=$merchantCategoryCode, merchantCity=$merchantCity, merchantCountry=$merchantCountry, digitalWalletTokenId=$digitalWalletTokenId, physicalCardId=$physicalCardId, networkDetails=$networkDetails, id=$id, cardPaymentId=$cardPaymentId, amount=$amount, currency=$currency, reason=$reason, merchantState=$merchantState, realTimeDecisionId=$realTimeDecisionId, additionalProperties=$additionalProperties}"

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

        /**
         * A Card Increment object. This field will be present in the JSON response if and only if
         * `category` is equal to `card_increment`.
         */
        @JsonDeserialize(builder = CardIncrement.Builder::class)
        @NoAutoDetect
        class CardIncrement
        private constructor(
            private val id: JsonField<String>,
            private val amount: JsonField<Long>,
            private val updatedAuthorizationAmount: JsonField<Long>,
            private val currency: JsonField<Currency>,
            private val cardAuthorizationId: JsonField<String>,
            private val network: JsonField<Network>,
            private val realTimeDecisionId: JsonField<String>,
            private val type: JsonField<Type>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** The Card Increment identifier. */
            fun id(): String = id.getRequired("id")

            /**
             * The amount of this increment in the minor unit of the transaction's currency. For
             * dollars, for example, this is cents.
             */
            fun amount(): Long = amount.getRequired("amount")

            /**
             * The updated authorization amount after this increment, in the minor unit of the
             * transaction's currency. For dollars, for example, this is cents.
             */
            fun updatedAuthorizationAmount(): Long =
                updatedAuthorizationAmount.getRequired("updated_authorization_amount")

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the increment's
             * currency.
             */
            fun currency(): Currency = currency.getRequired("currency")

            /** The identifier for the Card Authorization this reverses. */
            fun cardAuthorizationId(): String =
                cardAuthorizationId.getRequired("card_authorization_id")

            /** The card network used to process this card authorization. */
            fun network(): Network = network.getRequired("network")

            /**
             * The identifier of the Real-Time Decision sent to approve or decline this incremental
             * authorization.
             */
            fun realTimeDecisionId(): Optional<String> =
                Optional.ofNullable(realTimeDecisionId.getNullable("real_time_decision_id"))

            /**
             * A constant representing the object's type. For this resource it will always be
             * `card_increment`.
             */
            fun type(): Type = type.getRequired("type")

            /** The Card Increment identifier. */
            @JsonProperty("id") @ExcludeMissing fun _id() = id

            /**
             * The amount of this increment in the minor unit of the transaction's currency. For
             * dollars, for example, this is cents.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            /**
             * The updated authorization amount after this increment, in the minor unit of the
             * transaction's currency. For dollars, for example, this is cents.
             */
            @JsonProperty("updated_authorization_amount")
            @ExcludeMissing
            fun _updatedAuthorizationAmount() = updatedAuthorizationAmount

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the increment's
             * currency.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            /** The identifier for the Card Authorization this reverses. */
            @JsonProperty("card_authorization_id")
            @ExcludeMissing
            fun _cardAuthorizationId() = cardAuthorizationId

            /** The card network used to process this card authorization. */
            @JsonProperty("network") @ExcludeMissing fun _network() = network

            /**
             * The identifier of the Real-Time Decision sent to approve or decline this incremental
             * authorization.
             */
            @JsonProperty("real_time_decision_id")
            @ExcludeMissing
            fun _realTimeDecisionId() = realTimeDecisionId

            /**
             * A constant representing the object's type. For this resource it will always be
             * `card_increment`.
             */
            @JsonProperty("type") @ExcludeMissing fun _type() = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): CardIncrement = apply {
                if (!validated) {
                    id()
                    amount()
                    updatedAuthorizationAmount()
                    currency()
                    cardAuthorizationId()
                    network()
                    realTimeDecisionId()
                    type()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CardIncrement &&
                    this.id == other.id &&
                    this.amount == other.amount &&
                    this.updatedAuthorizationAmount == other.updatedAuthorizationAmount &&
                    this.currency == other.currency &&
                    this.cardAuthorizationId == other.cardAuthorizationId &&
                    this.network == other.network &&
                    this.realTimeDecisionId == other.realTimeDecisionId &&
                    this.type == other.type &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            id,
                            amount,
                            updatedAuthorizationAmount,
                            currency,
                            cardAuthorizationId,
                            network,
                            realTimeDecisionId,
                            type,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "CardIncrement{id=$id, amount=$amount, updatedAuthorizationAmount=$updatedAuthorizationAmount, currency=$currency, cardAuthorizationId=$cardAuthorizationId, network=$network, realTimeDecisionId=$realTimeDecisionId, type=$type, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var amount: JsonField<Long> = JsonMissing.of()
                private var updatedAuthorizationAmount: JsonField<Long> = JsonMissing.of()
                private var currency: JsonField<Currency> = JsonMissing.of()
                private var cardAuthorizationId: JsonField<String> = JsonMissing.of()
                private var network: JsonField<Network> = JsonMissing.of()
                private var realTimeDecisionId: JsonField<String> = JsonMissing.of()
                private var type: JsonField<Type> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(cardIncrement: CardIncrement) = apply {
                    this.id = cardIncrement.id
                    this.amount = cardIncrement.amount
                    this.updatedAuthorizationAmount = cardIncrement.updatedAuthorizationAmount
                    this.currency = cardIncrement.currency
                    this.cardAuthorizationId = cardIncrement.cardAuthorizationId
                    this.network = cardIncrement.network
                    this.realTimeDecisionId = cardIncrement.realTimeDecisionId
                    this.type = cardIncrement.type
                    additionalProperties(cardIncrement.additionalProperties)
                }

                /** The Card Increment identifier. */
                fun id(id: String) = id(JsonField.of(id))

                /** The Card Increment identifier. */
                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                /**
                 * The amount of this increment in the minor unit of the transaction's currency. For
                 * dollars, for example, this is cents.
                 */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /**
                 * The amount of this increment in the minor unit of the transaction's currency. For
                 * dollars, for example, this is cents.
                 */
                @JsonProperty("amount")
                @ExcludeMissing
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /**
                 * The updated authorization amount after this increment, in the minor unit of the
                 * transaction's currency. For dollars, for example, this is cents.
                 */
                fun updatedAuthorizationAmount(updatedAuthorizationAmount: Long) =
                    updatedAuthorizationAmount(JsonField.of(updatedAuthorizationAmount))

                /**
                 * The updated authorization amount after this increment, in the minor unit of the
                 * transaction's currency. For dollars, for example, this is cents.
                 */
                @JsonProperty("updated_authorization_amount")
                @ExcludeMissing
                fun updatedAuthorizationAmount(updatedAuthorizationAmount: JsonField<Long>) =
                    apply {
                        this.updatedAuthorizationAmount = updatedAuthorizationAmount
                    }

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the increment's
                 * currency.
                 */
                fun currency(currency: Currency) = currency(JsonField.of(currency))

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the increment's
                 * currency.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                /** The identifier for the Card Authorization this reverses. */
                fun cardAuthorizationId(cardAuthorizationId: String) =
                    cardAuthorizationId(JsonField.of(cardAuthorizationId))

                /** The identifier for the Card Authorization this reverses. */
                @JsonProperty("card_authorization_id")
                @ExcludeMissing
                fun cardAuthorizationId(cardAuthorizationId: JsonField<String>) = apply {
                    this.cardAuthorizationId = cardAuthorizationId
                }

                /** The card network used to process this card authorization. */
                fun network(network: Network) = network(JsonField.of(network))

                /** The card network used to process this card authorization. */
                @JsonProperty("network")
                @ExcludeMissing
                fun network(network: JsonField<Network>) = apply { this.network = network }

                /**
                 * The identifier of the Real-Time Decision sent to approve or decline this
                 * incremental authorization.
                 */
                fun realTimeDecisionId(realTimeDecisionId: String) =
                    realTimeDecisionId(JsonField.of(realTimeDecisionId))

                /**
                 * The identifier of the Real-Time Decision sent to approve or decline this
                 * incremental authorization.
                 */
                @JsonProperty("real_time_decision_id")
                @ExcludeMissing
                fun realTimeDecisionId(realTimeDecisionId: JsonField<String>) = apply {
                    this.realTimeDecisionId = realTimeDecisionId
                }

                /**
                 * A constant representing the object's type. For this resource it will always be
                 * `card_increment`.
                 */
                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * A constant representing the object's type. For this resource it will always be
                 * `card_increment`.
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

                fun build(): CardIncrement =
                    CardIncrement(
                        id,
                        amount,
                        updatedAuthorizationAmount,
                        currency,
                        cardAuthorizationId,
                        network,
                        realTimeDecisionId,
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

                    @JvmField val CARD_INCREMENT = Type(JsonField.of("card_increment"))

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                enum class Known {
                    CARD_INCREMENT,
                }

                enum class Value {
                    CARD_INCREMENT,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        CARD_INCREMENT -> Value.CARD_INCREMENT
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        CARD_INCREMENT -> Known.CARD_INCREMENT
                        else -> throw IncreaseInvalidDataException("Unknown Type: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
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
            private val cardPaymentId: JsonField<String>,
            private val amount: JsonField<Long>,
            private val currency: JsonField<Currency>,
            private val merchantAcceptorId: JsonField<String>,
            private val merchantCity: JsonField<String>,
            private val merchantState: JsonField<String>,
            private val merchantCountry: JsonField<String>,
            private val merchantName: JsonField<String>,
            private val merchantCategoryCode: JsonField<String>,
            private val purchaseDetails: JsonField<PurchaseDetails>,
            private val transactionId: JsonField<String>,
            private val type: JsonField<Type>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** The Card Refund identifier. */
            fun id(): String = id.getRequired("id")

            /** The ID of the Card Payment this transaction belongs to. */
            fun cardPaymentId(): Optional<String> =
                Optional.ofNullable(cardPaymentId.getNullable("card_payment_id"))

            /**
             * The pending amount in the minor unit of the transaction's currency. For dollars, for
             * example, this is cents.
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

            /** The Card Refund identifier. */
            @JsonProperty("id") @ExcludeMissing fun _id() = id

            /** The ID of the Card Payment this transaction belongs to. */
            @JsonProperty("card_payment_id") @ExcludeMissing fun _cardPaymentId() = cardPaymentId

            /**
             * The pending amount in the minor unit of the transaction's currency. For dollars, for
             * example, this is cents.
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
                    id()
                    cardPaymentId()
                    amount()
                    currency()
                    merchantAcceptorId()
                    merchantCity()
                    merchantState()
                    merchantCountry()
                    merchantName()
                    merchantCategoryCode()
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
                    this.id == other.id &&
                    this.cardPaymentId == other.cardPaymentId &&
                    this.amount == other.amount &&
                    this.currency == other.currency &&
                    this.merchantAcceptorId == other.merchantAcceptorId &&
                    this.merchantCity == other.merchantCity &&
                    this.merchantState == other.merchantState &&
                    this.merchantCountry == other.merchantCountry &&
                    this.merchantName == other.merchantName &&
                    this.merchantCategoryCode == other.merchantCategoryCode &&
                    this.purchaseDetails == other.purchaseDetails &&
                    this.transactionId == other.transactionId &&
                    this.type == other.type &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            id,
                            cardPaymentId,
                            amount,
                            currency,
                            merchantAcceptorId,
                            merchantCity,
                            merchantState,
                            merchantCountry,
                            merchantName,
                            merchantCategoryCode,
                            purchaseDetails,
                            transactionId,
                            type,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "CardRefund{id=$id, cardPaymentId=$cardPaymentId, amount=$amount, currency=$currency, merchantAcceptorId=$merchantAcceptorId, merchantCity=$merchantCity, merchantState=$merchantState, merchantCountry=$merchantCountry, merchantName=$merchantName, merchantCategoryCode=$merchantCategoryCode, purchaseDetails=$purchaseDetails, transactionId=$transactionId, type=$type, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var cardPaymentId: JsonField<String> = JsonMissing.of()
                private var amount: JsonField<Long> = JsonMissing.of()
                private var currency: JsonField<Currency> = JsonMissing.of()
                private var merchantAcceptorId: JsonField<String> = JsonMissing.of()
                private var merchantCity: JsonField<String> = JsonMissing.of()
                private var merchantState: JsonField<String> = JsonMissing.of()
                private var merchantCountry: JsonField<String> = JsonMissing.of()
                private var merchantName: JsonField<String> = JsonMissing.of()
                private var merchantCategoryCode: JsonField<String> = JsonMissing.of()
                private var purchaseDetails: JsonField<PurchaseDetails> = JsonMissing.of()
                private var transactionId: JsonField<String> = JsonMissing.of()
                private var type: JsonField<Type> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(cardRefund: CardRefund) = apply {
                    this.id = cardRefund.id
                    this.cardPaymentId = cardRefund.cardPaymentId
                    this.amount = cardRefund.amount
                    this.currency = cardRefund.currency
                    this.merchantAcceptorId = cardRefund.merchantAcceptorId
                    this.merchantCity = cardRefund.merchantCity
                    this.merchantState = cardRefund.merchantState
                    this.merchantCountry = cardRefund.merchantCountry
                    this.merchantName = cardRefund.merchantName
                    this.merchantCategoryCode = cardRefund.merchantCategoryCode
                    this.purchaseDetails = cardRefund.purchaseDetails
                    this.transactionId = cardRefund.transactionId
                    this.type = cardRefund.type
                    additionalProperties(cardRefund.additionalProperties)
                }

                /** The Card Refund identifier. */
                fun id(id: String) = id(JsonField.of(id))

                /** The Card Refund identifier. */
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

                /** The city the merchant resides in. */
                fun merchantCity(merchantCity: String) = merchantCity(JsonField.of(merchantCity))

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
                fun merchantName(merchantName: String) = merchantName(JsonField.of(merchantName))

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
                        id,
                        cardPaymentId,
                        amount,
                        currency,
                        merchantAcceptorId,
                        merchantCity,
                        merchantState,
                        merchantCountry,
                        merchantName,
                        merchantCategoryCode,
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

            /**
             * Additional details about the card purchase, such as tax and industry-specific fields.
             */
            @JsonDeserialize(builder = PurchaseDetails.Builder::class)
            @NoAutoDetect
            class PurchaseDetails
            private constructor(
                private val purchaseIdentifier: JsonField<String>,
                private val purchaseIdentifierFormat: JsonField<PurchaseIdentifierFormat>,
                private val customerReferenceIdentifier: JsonField<String>,
                private val localTaxAmount: JsonField<Long>,
                private val localTaxCurrency: JsonField<String>,
                private val nationalTaxAmount: JsonField<Long>,
                private val nationalTaxCurrency: JsonField<String>,
                private val carRental: JsonField<CarRental>,
                private val lodging: JsonField<Lodging>,
                private val travel: JsonField<Travel>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

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

                /** The national tax amount in minor units. */
                fun nationalTaxAmount(): Optional<Long> =
                    Optional.ofNullable(nationalTaxAmount.getNullable("national_tax_amount"))

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the local tax
                 * assessed.
                 */
                fun nationalTaxCurrency(): Optional<String> =
                    Optional.ofNullable(nationalTaxCurrency.getNullable("national_tax_currency"))

                /** Fields specific to car rentals. */
                fun carRental(): Optional<CarRental> =
                    Optional.ofNullable(carRental.getNullable("car_rental"))

                /** Fields specific to lodging. */
                fun lodging(): Optional<Lodging> =
                    Optional.ofNullable(lodging.getNullable("lodging"))

                /** Fields specific to travel. */
                fun travel(): Optional<Travel> = Optional.ofNullable(travel.getNullable("travel"))

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

                /** Fields specific to car rentals. */
                @JsonProperty("car_rental") @ExcludeMissing fun _carRental() = carRental

                /** Fields specific to lodging. */
                @JsonProperty("lodging") @ExcludeMissing fun _lodging() = lodging

                /** Fields specific to travel. */
                @JsonProperty("travel") @ExcludeMissing fun _travel() = travel

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): PurchaseDetails = apply {
                    if (!validated) {
                        purchaseIdentifier()
                        purchaseIdentifierFormat()
                        customerReferenceIdentifier()
                        localTaxAmount()
                        localTaxCurrency()
                        nationalTaxAmount()
                        nationalTaxCurrency()
                        carRental().map { it.validate() }
                        lodging().map { it.validate() }
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
                        this.purchaseIdentifier == other.purchaseIdentifier &&
                        this.purchaseIdentifierFormat == other.purchaseIdentifierFormat &&
                        this.customerReferenceIdentifier == other.customerReferenceIdentifier &&
                        this.localTaxAmount == other.localTaxAmount &&
                        this.localTaxCurrency == other.localTaxCurrency &&
                        this.nationalTaxAmount == other.nationalTaxAmount &&
                        this.nationalTaxCurrency == other.nationalTaxCurrency &&
                        this.carRental == other.carRental &&
                        this.lodging == other.lodging &&
                        this.travel == other.travel &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                purchaseIdentifier,
                                purchaseIdentifierFormat,
                                customerReferenceIdentifier,
                                localTaxAmount,
                                localTaxCurrency,
                                nationalTaxAmount,
                                nationalTaxCurrency,
                                carRental,
                                lodging,
                                travel,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "PurchaseDetails{purchaseIdentifier=$purchaseIdentifier, purchaseIdentifierFormat=$purchaseIdentifierFormat, customerReferenceIdentifier=$customerReferenceIdentifier, localTaxAmount=$localTaxAmount, localTaxCurrency=$localTaxCurrency, nationalTaxAmount=$nationalTaxAmount, nationalTaxCurrency=$nationalTaxCurrency, carRental=$carRental, lodging=$lodging, travel=$travel, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var purchaseIdentifier: JsonField<String> = JsonMissing.of()
                    private var purchaseIdentifierFormat: JsonField<PurchaseIdentifierFormat> =
                        JsonMissing.of()
                    private var customerReferenceIdentifier: JsonField<String> = JsonMissing.of()
                    private var localTaxAmount: JsonField<Long> = JsonMissing.of()
                    private var localTaxCurrency: JsonField<String> = JsonMissing.of()
                    private var nationalTaxAmount: JsonField<Long> = JsonMissing.of()
                    private var nationalTaxCurrency: JsonField<String> = JsonMissing.of()
                    private var carRental: JsonField<CarRental> = JsonMissing.of()
                    private var lodging: JsonField<Lodging> = JsonMissing.of()
                    private var travel: JsonField<Travel> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(purchaseDetails: PurchaseDetails) = apply {
                        this.purchaseIdentifier = purchaseDetails.purchaseIdentifier
                        this.purchaseIdentifierFormat = purchaseDetails.purchaseIdentifierFormat
                        this.customerReferenceIdentifier =
                            purchaseDetails.customerReferenceIdentifier
                        this.localTaxAmount = purchaseDetails.localTaxAmount
                        this.localTaxCurrency = purchaseDetails.localTaxCurrency
                        this.nationalTaxAmount = purchaseDetails.nationalTaxAmount
                        this.nationalTaxCurrency = purchaseDetails.nationalTaxCurrency
                        this.carRental = purchaseDetails.carRental
                        this.lodging = purchaseDetails.lodging
                        this.travel = purchaseDetails.travel
                        additionalProperties(purchaseDetails.additionalProperties)
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

                    /** Fields specific to car rentals. */
                    fun carRental(carRental: CarRental) = carRental(JsonField.of(carRental))

                    /** Fields specific to car rentals. */
                    @JsonProperty("car_rental")
                    @ExcludeMissing
                    fun carRental(carRental: JsonField<CarRental>) = apply {
                        this.carRental = carRental
                    }

                    /** Fields specific to lodging. */
                    fun lodging(lodging: Lodging) = lodging(JsonField.of(lodging))

                    /** Fields specific to lodging. */
                    @JsonProperty("lodging")
                    @ExcludeMissing
                    fun lodging(lodging: JsonField<Lodging>) = apply { this.lodging = lodging }

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
                            purchaseIdentifier,
                            purchaseIdentifierFormat,
                            customerReferenceIdentifier,
                            localTaxAmount,
                            localTaxCurrency,
                            nationalTaxAmount,
                            nationalTaxCurrency,
                            carRental,
                            lodging,
                            travel,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                /** Fields specific to car rentals. */
                @JsonDeserialize(builder = CarRental.Builder::class)
                @NoAutoDetect
                class CarRental
                private constructor(
                    private val extraCharges: JsonField<ExtraCharges>,
                    private val daysRented: JsonField<Long>,
                    private val noShowIndicator: JsonField<NoShowIndicator>,
                    private val checkoutDate: JsonField<LocalDate>,
                    private val dailyRentalRateAmount: JsonField<Long>,
                    private val dailyRentalRateCurrency: JsonField<String>,
                    private val weeklyRentalRateAmount: JsonField<Long>,
                    private val weeklyRentalRateCurrency: JsonField<String>,
                    private val insuranceChargesAmount: JsonField<Long>,
                    private val insuranceChargesCurrency: JsonField<String>,
                    private val fuelChargesAmount: JsonField<Long>,
                    private val fuelChargesCurrency: JsonField<String>,
                    private val oneWayDropOffChargesAmount: JsonField<Long>,
                    private val oneWayDropOffChargesCurrency: JsonField<String>,
                    private val carClassCode: JsonField<String>,
                    private val renterName: JsonField<String>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    /** Additional charges (gas, late fee, etc.) being billed. */
                    fun extraCharges(): Optional<ExtraCharges> =
                        Optional.ofNullable(extraCharges.getNullable("extra_charges"))

                    /** Number of days the vehicle was rented. */
                    fun daysRented(): Optional<Long> =
                        Optional.ofNullable(daysRented.getNullable("days_rented"))

                    /**
                     * An indicator that the cardholder is being billed for a reserved vehicle that
                     * was not actually rented (that is, a "no-show" charge).
                     */
                    fun noShowIndicator(): Optional<NoShowIndicator> =
                        Optional.ofNullable(noShowIndicator.getNullable("no_show_indicator"))

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

                    /** Code indicating the vehicle's class. */
                    fun carClassCode(): Optional<String> =
                        Optional.ofNullable(carClassCode.getNullable("car_class_code"))

                    /** Name of the person renting the vehicle. */
                    fun renterName(): Optional<String> =
                        Optional.ofNullable(renterName.getNullable("renter_name"))

                    /** Additional charges (gas, late fee, etc.) being billed. */
                    @JsonProperty("extra_charges")
                    @ExcludeMissing
                    fun _extraCharges() = extraCharges

                    /** Number of days the vehicle was rented. */
                    @JsonProperty("days_rented") @ExcludeMissing fun _daysRented() = daysRented

                    /**
                     * An indicator that the cardholder is being billed for a reserved vehicle that
                     * was not actually rented (that is, a "no-show" charge).
                     */
                    @JsonProperty("no_show_indicator")
                    @ExcludeMissing
                    fun _noShowIndicator() = noShowIndicator

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

                    /** Code indicating the vehicle's class. */
                    @JsonProperty("car_class_code")
                    @ExcludeMissing
                    fun _carClassCode() = carClassCode

                    /** Name of the person renting the vehicle. */
                    @JsonProperty("renter_name") @ExcludeMissing fun _renterName() = renterName

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): CarRental = apply {
                        if (!validated) {
                            extraCharges()
                            daysRented()
                            noShowIndicator()
                            checkoutDate()
                            dailyRentalRateAmount()
                            dailyRentalRateCurrency()
                            weeklyRentalRateAmount()
                            weeklyRentalRateCurrency()
                            insuranceChargesAmount()
                            insuranceChargesCurrency()
                            fuelChargesAmount()
                            fuelChargesCurrency()
                            oneWayDropOffChargesAmount()
                            oneWayDropOffChargesCurrency()
                            carClassCode()
                            renterName()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is CarRental &&
                            this.extraCharges == other.extraCharges &&
                            this.daysRented == other.daysRented &&
                            this.noShowIndicator == other.noShowIndicator &&
                            this.checkoutDate == other.checkoutDate &&
                            this.dailyRentalRateAmount == other.dailyRentalRateAmount &&
                            this.dailyRentalRateCurrency == other.dailyRentalRateCurrency &&
                            this.weeklyRentalRateAmount == other.weeklyRentalRateAmount &&
                            this.weeklyRentalRateCurrency == other.weeklyRentalRateCurrency &&
                            this.insuranceChargesAmount == other.insuranceChargesAmount &&
                            this.insuranceChargesCurrency == other.insuranceChargesCurrency &&
                            this.fuelChargesAmount == other.fuelChargesAmount &&
                            this.fuelChargesCurrency == other.fuelChargesCurrency &&
                            this.oneWayDropOffChargesAmount == other.oneWayDropOffChargesAmount &&
                            this.oneWayDropOffChargesCurrency ==
                                other.oneWayDropOffChargesCurrency &&
                            this.carClassCode == other.carClassCode &&
                            this.renterName == other.renterName &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode =
                                Objects.hash(
                                    extraCharges,
                                    daysRented,
                                    noShowIndicator,
                                    checkoutDate,
                                    dailyRentalRateAmount,
                                    dailyRentalRateCurrency,
                                    weeklyRentalRateAmount,
                                    weeklyRentalRateCurrency,
                                    insuranceChargesAmount,
                                    insuranceChargesCurrency,
                                    fuelChargesAmount,
                                    fuelChargesCurrency,
                                    oneWayDropOffChargesAmount,
                                    oneWayDropOffChargesCurrency,
                                    carClassCode,
                                    renterName,
                                    additionalProperties,
                                )
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "CarRental{extraCharges=$extraCharges, daysRented=$daysRented, noShowIndicator=$noShowIndicator, checkoutDate=$checkoutDate, dailyRentalRateAmount=$dailyRentalRateAmount, dailyRentalRateCurrency=$dailyRentalRateCurrency, weeklyRentalRateAmount=$weeklyRentalRateAmount, weeklyRentalRateCurrency=$weeklyRentalRateCurrency, insuranceChargesAmount=$insuranceChargesAmount, insuranceChargesCurrency=$insuranceChargesCurrency, fuelChargesAmount=$fuelChargesAmount, fuelChargesCurrency=$fuelChargesCurrency, oneWayDropOffChargesAmount=$oneWayDropOffChargesAmount, oneWayDropOffChargesCurrency=$oneWayDropOffChargesCurrency, carClassCode=$carClassCode, renterName=$renterName, additionalProperties=$additionalProperties}"

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var extraCharges: JsonField<ExtraCharges> = JsonMissing.of()
                        private var daysRented: JsonField<Long> = JsonMissing.of()
                        private var noShowIndicator: JsonField<NoShowIndicator> = JsonMissing.of()
                        private var checkoutDate: JsonField<LocalDate> = JsonMissing.of()
                        private var dailyRentalRateAmount: JsonField<Long> = JsonMissing.of()
                        private var dailyRentalRateCurrency: JsonField<String> = JsonMissing.of()
                        private var weeklyRentalRateAmount: JsonField<Long> = JsonMissing.of()
                        private var weeklyRentalRateCurrency: JsonField<String> = JsonMissing.of()
                        private var insuranceChargesAmount: JsonField<Long> = JsonMissing.of()
                        private var insuranceChargesCurrency: JsonField<String> = JsonMissing.of()
                        private var fuelChargesAmount: JsonField<Long> = JsonMissing.of()
                        private var fuelChargesCurrency: JsonField<String> = JsonMissing.of()
                        private var oneWayDropOffChargesAmount: JsonField<Long> = JsonMissing.of()
                        private var oneWayDropOffChargesCurrency: JsonField<String> =
                            JsonMissing.of()
                        private var carClassCode: JsonField<String> = JsonMissing.of()
                        private var renterName: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(carRental: CarRental) = apply {
                            this.extraCharges = carRental.extraCharges
                            this.daysRented = carRental.daysRented
                            this.noShowIndicator = carRental.noShowIndicator
                            this.checkoutDate = carRental.checkoutDate
                            this.dailyRentalRateAmount = carRental.dailyRentalRateAmount
                            this.dailyRentalRateCurrency = carRental.dailyRentalRateCurrency
                            this.weeklyRentalRateAmount = carRental.weeklyRentalRateAmount
                            this.weeklyRentalRateCurrency = carRental.weeklyRentalRateCurrency
                            this.insuranceChargesAmount = carRental.insuranceChargesAmount
                            this.insuranceChargesCurrency = carRental.insuranceChargesCurrency
                            this.fuelChargesAmount = carRental.fuelChargesAmount
                            this.fuelChargesCurrency = carRental.fuelChargesCurrency
                            this.oneWayDropOffChargesAmount = carRental.oneWayDropOffChargesAmount
                            this.oneWayDropOffChargesCurrency =
                                carRental.oneWayDropOffChargesCurrency
                            this.carClassCode = carRental.carClassCode
                            this.renterName = carRental.renterName
                            additionalProperties(carRental.additionalProperties)
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

                        /** Number of days the vehicle was rented. */
                        fun daysRented(daysRented: Long) = daysRented(JsonField.of(daysRented))

                        /** Number of days the vehicle was rented. */
                        @JsonProperty("days_rented")
                        @ExcludeMissing
                        fun daysRented(daysRented: JsonField<Long>) = apply {
                            this.daysRented = daysRented
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

                        /** Code indicating the vehicle's class. */
                        fun carClassCode(carClassCode: String) =
                            carClassCode(JsonField.of(carClassCode))

                        /** Code indicating the vehicle's class. */
                        @JsonProperty("car_class_code")
                        @ExcludeMissing
                        fun carClassCode(carClassCode: JsonField<String>) = apply {
                            this.carClassCode = carClassCode
                        }

                        /** Name of the person renting the vehicle. */
                        fun renterName(renterName: String) = renterName(JsonField.of(renterName))

                        /** Name of the person renting the vehicle. */
                        @JsonProperty("renter_name")
                        @ExcludeMissing
                        fun renterName(renterName: JsonField<String>) = apply {
                            this.renterName = renterName
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
                                extraCharges,
                                daysRented,
                                noShowIndicator,
                                checkoutDate,
                                dailyRentalRateAmount,
                                dailyRentalRateCurrency,
                                weeklyRentalRateAmount,
                                weeklyRentalRateCurrency,
                                insuranceChargesAmount,
                                insuranceChargesCurrency,
                                fuelChargesAmount,
                                fuelChargesCurrency,
                                oneWayDropOffChargesAmount,
                                oneWayDropOffChargesCurrency,
                                carClassCode,
                                renterName,
                                additionalProperties.toUnmodifiable(),
                            )
                    }

                    class ExtraCharges
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
                    ) {

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
                    private val noShowIndicator: JsonField<NoShowIndicator>,
                    private val extraCharges: JsonField<ExtraCharges>,
                    private val checkInDate: JsonField<LocalDate>,
                    private val dailyRoomRateAmount: JsonField<Long>,
                    private val dailyRoomRateCurrency: JsonField<String>,
                    private val totalTaxAmount: JsonField<Long>,
                    private val totalTaxCurrency: JsonField<String>,
                    private val prepaidExpensesAmount: JsonField<Long>,
                    private val prepaidExpensesCurrency: JsonField<String>,
                    private val foodBeverageChargesAmount: JsonField<Long>,
                    private val foodBeverageChargesCurrency: JsonField<String>,
                    private val folioCashAdvancesAmount: JsonField<Long>,
                    private val folioCashAdvancesCurrency: JsonField<String>,
                    private val roomNights: JsonField<Long>,
                    private val totalRoomTaxAmount: JsonField<Long>,
                    private val totalRoomTaxCurrency: JsonField<String>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    /**
                     * Indicator that the cardholder is being billed for a reserved room that was
                     * not actually used.
                     */
                    fun noShowIndicator(): Optional<NoShowIndicator> =
                        Optional.ofNullable(noShowIndicator.getNullable("no_show_indicator"))

                    /** Additional charges (phone, late check-out, etc.) being billed. */
                    fun extraCharges(): Optional<ExtraCharges> =
                        Optional.ofNullable(extraCharges.getNullable("extra_charges"))

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

                    /** Total tax being charged for the room. */
                    fun totalTaxAmount(): Optional<Long> =
                        Optional.ofNullable(totalTaxAmount.getNullable("total_tax_amount"))

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the total tax
                     * assessed.
                     */
                    fun totalTaxCurrency(): Optional<String> =
                        Optional.ofNullable(totalTaxCurrency.getNullable("total_tax_currency"))

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

                    /**
                     * Indicator that the cardholder is being billed for a reserved room that was
                     * not actually used.
                     */
                    @JsonProperty("no_show_indicator")
                    @ExcludeMissing
                    fun _noShowIndicator() = noShowIndicator

                    /** Additional charges (phone, late check-out, etc.) being billed. */
                    @JsonProperty("extra_charges")
                    @ExcludeMissing
                    fun _extraCharges() = extraCharges

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

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): Lodging = apply {
                        if (!validated) {
                            noShowIndicator()
                            extraCharges()
                            checkInDate()
                            dailyRoomRateAmount()
                            dailyRoomRateCurrency()
                            totalTaxAmount()
                            totalTaxCurrency()
                            prepaidExpensesAmount()
                            prepaidExpensesCurrency()
                            foodBeverageChargesAmount()
                            foodBeverageChargesCurrency()
                            folioCashAdvancesAmount()
                            folioCashAdvancesCurrency()
                            roomNights()
                            totalRoomTaxAmount()
                            totalRoomTaxCurrency()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Lodging &&
                            this.noShowIndicator == other.noShowIndicator &&
                            this.extraCharges == other.extraCharges &&
                            this.checkInDate == other.checkInDate &&
                            this.dailyRoomRateAmount == other.dailyRoomRateAmount &&
                            this.dailyRoomRateCurrency == other.dailyRoomRateCurrency &&
                            this.totalTaxAmount == other.totalTaxAmount &&
                            this.totalTaxCurrency == other.totalTaxCurrency &&
                            this.prepaidExpensesAmount == other.prepaidExpensesAmount &&
                            this.prepaidExpensesCurrency == other.prepaidExpensesCurrency &&
                            this.foodBeverageChargesAmount == other.foodBeverageChargesAmount &&
                            this.foodBeverageChargesCurrency == other.foodBeverageChargesCurrency &&
                            this.folioCashAdvancesAmount == other.folioCashAdvancesAmount &&
                            this.folioCashAdvancesCurrency == other.folioCashAdvancesCurrency &&
                            this.roomNights == other.roomNights &&
                            this.totalRoomTaxAmount == other.totalRoomTaxAmount &&
                            this.totalRoomTaxCurrency == other.totalRoomTaxCurrency &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode =
                                Objects.hash(
                                    noShowIndicator,
                                    extraCharges,
                                    checkInDate,
                                    dailyRoomRateAmount,
                                    dailyRoomRateCurrency,
                                    totalTaxAmount,
                                    totalTaxCurrency,
                                    prepaidExpensesAmount,
                                    prepaidExpensesCurrency,
                                    foodBeverageChargesAmount,
                                    foodBeverageChargesCurrency,
                                    folioCashAdvancesAmount,
                                    folioCashAdvancesCurrency,
                                    roomNights,
                                    totalRoomTaxAmount,
                                    totalRoomTaxCurrency,
                                    additionalProperties,
                                )
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "Lodging{noShowIndicator=$noShowIndicator, extraCharges=$extraCharges, checkInDate=$checkInDate, dailyRoomRateAmount=$dailyRoomRateAmount, dailyRoomRateCurrency=$dailyRoomRateCurrency, totalTaxAmount=$totalTaxAmount, totalTaxCurrency=$totalTaxCurrency, prepaidExpensesAmount=$prepaidExpensesAmount, prepaidExpensesCurrency=$prepaidExpensesCurrency, foodBeverageChargesAmount=$foodBeverageChargesAmount, foodBeverageChargesCurrency=$foodBeverageChargesCurrency, folioCashAdvancesAmount=$folioCashAdvancesAmount, folioCashAdvancesCurrency=$folioCashAdvancesCurrency, roomNights=$roomNights, totalRoomTaxAmount=$totalRoomTaxAmount, totalRoomTaxCurrency=$totalRoomTaxCurrency, additionalProperties=$additionalProperties}"

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var noShowIndicator: JsonField<NoShowIndicator> = JsonMissing.of()
                        private var extraCharges: JsonField<ExtraCharges> = JsonMissing.of()
                        private var checkInDate: JsonField<LocalDate> = JsonMissing.of()
                        private var dailyRoomRateAmount: JsonField<Long> = JsonMissing.of()
                        private var dailyRoomRateCurrency: JsonField<String> = JsonMissing.of()
                        private var totalTaxAmount: JsonField<Long> = JsonMissing.of()
                        private var totalTaxCurrency: JsonField<String> = JsonMissing.of()
                        private var prepaidExpensesAmount: JsonField<Long> = JsonMissing.of()
                        private var prepaidExpensesCurrency: JsonField<String> = JsonMissing.of()
                        private var foodBeverageChargesAmount: JsonField<Long> = JsonMissing.of()
                        private var foodBeverageChargesCurrency: JsonField<String> =
                            JsonMissing.of()
                        private var folioCashAdvancesAmount: JsonField<Long> = JsonMissing.of()
                        private var folioCashAdvancesCurrency: JsonField<String> = JsonMissing.of()
                        private var roomNights: JsonField<Long> = JsonMissing.of()
                        private var totalRoomTaxAmount: JsonField<Long> = JsonMissing.of()
                        private var totalRoomTaxCurrency: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(lodging: Lodging) = apply {
                            this.noShowIndicator = lodging.noShowIndicator
                            this.extraCharges = lodging.extraCharges
                            this.checkInDate = lodging.checkInDate
                            this.dailyRoomRateAmount = lodging.dailyRoomRateAmount
                            this.dailyRoomRateCurrency = lodging.dailyRoomRateCurrency
                            this.totalTaxAmount = lodging.totalTaxAmount
                            this.totalTaxCurrency = lodging.totalTaxCurrency
                            this.prepaidExpensesAmount = lodging.prepaidExpensesAmount
                            this.prepaidExpensesCurrency = lodging.prepaidExpensesCurrency
                            this.foodBeverageChargesAmount = lodging.foodBeverageChargesAmount
                            this.foodBeverageChargesCurrency = lodging.foodBeverageChargesCurrency
                            this.folioCashAdvancesAmount = lodging.folioCashAdvancesAmount
                            this.folioCashAdvancesCurrency = lodging.folioCashAdvancesCurrency
                            this.roomNights = lodging.roomNights
                            this.totalRoomTaxAmount = lodging.totalRoomTaxAmount
                            this.totalRoomTaxCurrency = lodging.totalRoomTaxCurrency
                            additionalProperties(lodging.additionalProperties)
                        }

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

                        /** Additional charges (phone, late check-out, etc.) being billed. */
                        fun extraCharges(extraCharges: ExtraCharges) =
                            extraCharges(JsonField.of(extraCharges))

                        /** Additional charges (phone, late check-out, etc.) being billed. */
                        @JsonProperty("extra_charges")
                        @ExcludeMissing
                        fun extraCharges(extraCharges: JsonField<ExtraCharges>) = apply {
                            this.extraCharges = extraCharges
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
                                noShowIndicator,
                                extraCharges,
                                checkInDate,
                                dailyRoomRateAmount,
                                dailyRoomRateCurrency,
                                totalTaxAmount,
                                totalTaxCurrency,
                                prepaidExpensesAmount,
                                prepaidExpensesCurrency,
                                foodBeverageChargesAmount,
                                foodBeverageChargesCurrency,
                                folioCashAdvancesAmount,
                                folioCashAdvancesCurrency,
                                roomNights,
                                totalRoomTaxAmount,
                                totalRoomTaxCurrency,
                                additionalProperties.toUnmodifiable(),
                            )
                    }

                    class ExtraCharges
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
                    ) {

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
                ) {

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
                    private val ticketNumber: JsonField<String>,
                    private val passengerName: JsonField<String>,
                    private val departureDate: JsonField<LocalDate>,
                    private val originationCityAirportCode: JsonField<String>,
                    private val travelAgencyCode: JsonField<String>,
                    private val travelAgencyName: JsonField<String>,
                    private val restrictedTicketIndicator: JsonField<RestrictedTicketIndicator>,
                    private val computerizedReservationSystem: JsonField<String>,
                    private val creditReasonIndicator: JsonField<CreditReasonIndicator>,
                    private val ticketChangeIndicator: JsonField<TicketChangeIndicator>,
                    private val tripLegs: JsonField<List<TripLeg>>,
                    private val ancillary: JsonField<Ancillary>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    /** Ticket number. */
                    fun ticketNumber(): Optional<String> =
                        Optional.ofNullable(ticketNumber.getNullable("ticket_number"))

                    /** Name of the passenger. */
                    fun passengerName(): Optional<String> =
                        Optional.ofNullable(passengerName.getNullable("passenger_name"))

                    /** Date of departure. */
                    fun departureDate(): Optional<LocalDate> =
                        Optional.ofNullable(departureDate.getNullable("departure_date"))

                    /** Code for the originating city or airport. */
                    fun originationCityAirportCode(): Optional<String> =
                        Optional.ofNullable(
                            originationCityAirportCode.getNullable("origination_city_airport_code")
                        )

                    /** Code for the travel agency if the ticket was issued by a travel agency. */
                    fun travelAgencyCode(): Optional<String> =
                        Optional.ofNullable(travelAgencyCode.getNullable("travel_agency_code"))

                    /** Name of the travel agency if the ticket was issued by a travel agency. */
                    fun travelAgencyName(): Optional<String> =
                        Optional.ofNullable(travelAgencyName.getNullable("travel_agency_name"))

                    /** Indicates whether this ticket is non-refundable. */
                    fun restrictedTicketIndicator(): Optional<RestrictedTicketIndicator> =
                        Optional.ofNullable(
                            restrictedTicketIndicator.getNullable("restricted_ticket_indicator")
                        )

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

                    /** Indicates why a ticket was changed. */
                    fun ticketChangeIndicator(): Optional<TicketChangeIndicator> =
                        Optional.ofNullable(
                            ticketChangeIndicator.getNullable("ticket_change_indicator")
                        )

                    /** Fields specific to each leg of the journey. */
                    fun tripLegs(): Optional<List<TripLeg>> =
                        Optional.ofNullable(tripLegs.getNullable("trip_legs"))

                    /** Ancillary purchases in addition to the airfare. */
                    fun ancillary(): Optional<Ancillary> =
                        Optional.ofNullable(ancillary.getNullable("ancillary"))

                    /** Ticket number. */
                    @JsonProperty("ticket_number")
                    @ExcludeMissing
                    fun _ticketNumber() = ticketNumber

                    /** Name of the passenger. */
                    @JsonProperty("passenger_name")
                    @ExcludeMissing
                    fun _passengerName() = passengerName

                    /** Date of departure. */
                    @JsonProperty("departure_date")
                    @ExcludeMissing
                    fun _departureDate() = departureDate

                    /** Code for the originating city or airport. */
                    @JsonProperty("origination_city_airport_code")
                    @ExcludeMissing
                    fun _originationCityAirportCode() = originationCityAirportCode

                    /** Code for the travel agency if the ticket was issued by a travel agency. */
                    @JsonProperty("travel_agency_code")
                    @ExcludeMissing
                    fun _travelAgencyCode() = travelAgencyCode

                    /** Name of the travel agency if the ticket was issued by a travel agency. */
                    @JsonProperty("travel_agency_name")
                    @ExcludeMissing
                    fun _travelAgencyName() = travelAgencyName

                    /** Indicates whether this ticket is non-refundable. */
                    @JsonProperty("restricted_ticket_indicator")
                    @ExcludeMissing
                    fun _restrictedTicketIndicator() = restrictedTicketIndicator

                    /** Indicates the computerized reservation system used to book the ticket. */
                    @JsonProperty("computerized_reservation_system")
                    @ExcludeMissing
                    fun _computerizedReservationSystem() = computerizedReservationSystem

                    /** Indicates the reason for a credit to the cardholder. */
                    @JsonProperty("credit_reason_indicator")
                    @ExcludeMissing
                    fun _creditReasonIndicator() = creditReasonIndicator

                    /** Indicates why a ticket was changed. */
                    @JsonProperty("ticket_change_indicator")
                    @ExcludeMissing
                    fun _ticketChangeIndicator() = ticketChangeIndicator

                    /** Fields specific to each leg of the journey. */
                    @JsonProperty("trip_legs") @ExcludeMissing fun _tripLegs() = tripLegs

                    /** Ancillary purchases in addition to the airfare. */
                    @JsonProperty("ancillary") @ExcludeMissing fun _ancillary() = ancillary

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): Travel = apply {
                        if (!validated) {
                            ticketNumber()
                            passengerName()
                            departureDate()
                            originationCityAirportCode()
                            travelAgencyCode()
                            travelAgencyName()
                            restrictedTicketIndicator()
                            computerizedReservationSystem()
                            creditReasonIndicator()
                            ticketChangeIndicator()
                            tripLegs().map { it.forEach { it.validate() } }
                            ancillary().map { it.validate() }
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Travel &&
                            this.ticketNumber == other.ticketNumber &&
                            this.passengerName == other.passengerName &&
                            this.departureDate == other.departureDate &&
                            this.originationCityAirportCode == other.originationCityAirportCode &&
                            this.travelAgencyCode == other.travelAgencyCode &&
                            this.travelAgencyName == other.travelAgencyName &&
                            this.restrictedTicketIndicator == other.restrictedTicketIndicator &&
                            this.computerizedReservationSystem ==
                                other.computerizedReservationSystem &&
                            this.creditReasonIndicator == other.creditReasonIndicator &&
                            this.ticketChangeIndicator == other.ticketChangeIndicator &&
                            this.tripLegs == other.tripLegs &&
                            this.ancillary == other.ancillary &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode =
                                Objects.hash(
                                    ticketNumber,
                                    passengerName,
                                    departureDate,
                                    originationCityAirportCode,
                                    travelAgencyCode,
                                    travelAgencyName,
                                    restrictedTicketIndicator,
                                    computerizedReservationSystem,
                                    creditReasonIndicator,
                                    ticketChangeIndicator,
                                    tripLegs,
                                    ancillary,
                                    additionalProperties,
                                )
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "Travel{ticketNumber=$ticketNumber, passengerName=$passengerName, departureDate=$departureDate, originationCityAirportCode=$originationCityAirportCode, travelAgencyCode=$travelAgencyCode, travelAgencyName=$travelAgencyName, restrictedTicketIndicator=$restrictedTicketIndicator, computerizedReservationSystem=$computerizedReservationSystem, creditReasonIndicator=$creditReasonIndicator, ticketChangeIndicator=$ticketChangeIndicator, tripLegs=$tripLegs, ancillary=$ancillary, additionalProperties=$additionalProperties}"

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var ticketNumber: JsonField<String> = JsonMissing.of()
                        private var passengerName: JsonField<String> = JsonMissing.of()
                        private var departureDate: JsonField<LocalDate> = JsonMissing.of()
                        private var originationCityAirportCode: JsonField<String> = JsonMissing.of()
                        private var travelAgencyCode: JsonField<String> = JsonMissing.of()
                        private var travelAgencyName: JsonField<String> = JsonMissing.of()
                        private var restrictedTicketIndicator:
                            JsonField<RestrictedTicketIndicator> =
                            JsonMissing.of()
                        private var computerizedReservationSystem: JsonField<String> =
                            JsonMissing.of()
                        private var creditReasonIndicator: JsonField<CreditReasonIndicator> =
                            JsonMissing.of()
                        private var ticketChangeIndicator: JsonField<TicketChangeIndicator> =
                            JsonMissing.of()
                        private var tripLegs: JsonField<List<TripLeg>> = JsonMissing.of()
                        private var ancillary: JsonField<Ancillary> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(travel: Travel) = apply {
                            this.ticketNumber = travel.ticketNumber
                            this.passengerName = travel.passengerName
                            this.departureDate = travel.departureDate
                            this.originationCityAirportCode = travel.originationCityAirportCode
                            this.travelAgencyCode = travel.travelAgencyCode
                            this.travelAgencyName = travel.travelAgencyName
                            this.restrictedTicketIndicator = travel.restrictedTicketIndicator
                            this.computerizedReservationSystem =
                                travel.computerizedReservationSystem
                            this.creditReasonIndicator = travel.creditReasonIndicator
                            this.ticketChangeIndicator = travel.ticketChangeIndicator
                            this.tripLegs = travel.tripLegs
                            this.ancillary = travel.ancillary
                            additionalProperties(travel.additionalProperties)
                        }

                        /** Ticket number. */
                        fun ticketNumber(ticketNumber: String) =
                            ticketNumber(JsonField.of(ticketNumber))

                        /** Ticket number. */
                        @JsonProperty("ticket_number")
                        @ExcludeMissing
                        fun ticketNumber(ticketNumber: JsonField<String>) = apply {
                            this.ticketNumber = ticketNumber
                        }

                        /** Name of the passenger. */
                        fun passengerName(passengerName: String) =
                            passengerName(JsonField.of(passengerName))

                        /** Name of the passenger. */
                        @JsonProperty("passenger_name")
                        @ExcludeMissing
                        fun passengerName(passengerName: JsonField<String>) = apply {
                            this.passengerName = passengerName
                        }

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

                        /** Indicates why a ticket was changed. */
                        fun ticketChangeIndicator(ticketChangeIndicator: TicketChangeIndicator) =
                            ticketChangeIndicator(JsonField.of(ticketChangeIndicator))

                        /** Indicates why a ticket was changed. */
                        @JsonProperty("ticket_change_indicator")
                        @ExcludeMissing
                        fun ticketChangeIndicator(
                            ticketChangeIndicator: JsonField<TicketChangeIndicator>
                        ) = apply { this.ticketChangeIndicator = ticketChangeIndicator }

                        /** Fields specific to each leg of the journey. */
                        fun tripLegs(tripLegs: List<TripLeg>) = tripLegs(JsonField.of(tripLegs))

                        /** Fields specific to each leg of the journey. */
                        @JsonProperty("trip_legs")
                        @ExcludeMissing
                        fun tripLegs(tripLegs: JsonField<List<TripLeg>>) = apply {
                            this.tripLegs = tripLegs
                        }

                        /** Ancillary purchases in addition to the airfare. */
                        fun ancillary(ancillary: Ancillary) = ancillary(JsonField.of(ancillary))

                        /** Ancillary purchases in addition to the airfare. */
                        @JsonProperty("ancillary")
                        @ExcludeMissing
                        fun ancillary(ancillary: JsonField<Ancillary>) = apply {
                            this.ancillary = ancillary
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
                                ticketNumber,
                                passengerName,
                                departureDate,
                                originationCityAirportCode,
                                travelAgencyCode,
                                travelAgencyName,
                                restrictedTicketIndicator,
                                computerizedReservationSystem,
                                creditReasonIndicator,
                                ticketChangeIndicator,
                                tripLegs.map { it.toUnmodifiable() },
                                ancillary,
                                additionalProperties.toUnmodifiable(),
                            )
                    }

                    /** Ancillary purchases in addition to the airfare. */
                    @JsonDeserialize(builder = Ancillary.Builder::class)
                    @NoAutoDetect
                    class Ancillary
                    private constructor(
                        private val ticketDocumentNumber: JsonField<String>,
                        private val passengerNameOrDescription: JsonField<String>,
                        private val connectedTicketDocumentNumber: JsonField<String>,
                        private val creditReasonIndicator: JsonField<CreditReasonIndicator>,
                        private val services: JsonField<List<Service>>,
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        private var validated: Boolean = false

                        private var hashCode: Int = 0

                        /** Ticket document number. */
                        fun ticketDocumentNumber(): Optional<String> =
                            Optional.ofNullable(
                                ticketDocumentNumber.getNullable("ticket_document_number")
                            )

                        /** Name of the passenger or description of the ancillary purchase. */
                        fun passengerNameOrDescription(): Optional<String> =
                            Optional.ofNullable(
                                passengerNameOrDescription.getNullable(
                                    "passenger_name_or_description"
                                )
                            )

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

                        /** Additional travel charges, such as baggage fees. */
                        fun services(): List<Service> = services.getRequired("services")

                        /** Ticket document number. */
                        @JsonProperty("ticket_document_number")
                        @ExcludeMissing
                        fun _ticketDocumentNumber() = ticketDocumentNumber

                        /** Name of the passenger or description of the ancillary purchase. */
                        @JsonProperty("passenger_name_or_description")
                        @ExcludeMissing
                        fun _passengerNameOrDescription() = passengerNameOrDescription

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

                        /** Additional travel charges, such as baggage fees. */
                        @JsonProperty("services") @ExcludeMissing fun _services() = services

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): Ancillary = apply {
                            if (!validated) {
                                ticketDocumentNumber()
                                passengerNameOrDescription()
                                connectedTicketDocumentNumber()
                                creditReasonIndicator()
                                services().forEach { it.validate() }
                                validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Ancillary &&
                                this.ticketDocumentNumber == other.ticketDocumentNumber &&
                                this.passengerNameOrDescription ==
                                    other.passengerNameOrDescription &&
                                this.connectedTicketDocumentNumber ==
                                    other.connectedTicketDocumentNumber &&
                                this.creditReasonIndicator == other.creditReasonIndicator &&
                                this.services == other.services &&
                                this.additionalProperties == other.additionalProperties
                        }

                        override fun hashCode(): Int {
                            if (hashCode == 0) {
                                hashCode =
                                    Objects.hash(
                                        ticketDocumentNumber,
                                        passengerNameOrDescription,
                                        connectedTicketDocumentNumber,
                                        creditReasonIndicator,
                                        services,
                                        additionalProperties,
                                    )
                            }
                            return hashCode
                        }

                        override fun toString() =
                            "Ancillary{ticketDocumentNumber=$ticketDocumentNumber, passengerNameOrDescription=$passengerNameOrDescription, connectedTicketDocumentNumber=$connectedTicketDocumentNumber, creditReasonIndicator=$creditReasonIndicator, services=$services, additionalProperties=$additionalProperties}"

                        companion object {

                            @JvmStatic fun builder() = Builder()
                        }

                        class Builder {

                            private var ticketDocumentNumber: JsonField<String> = JsonMissing.of()
                            private var passengerNameOrDescription: JsonField<String> =
                                JsonMissing.of()
                            private var connectedTicketDocumentNumber: JsonField<String> =
                                JsonMissing.of()
                            private var creditReasonIndicator: JsonField<CreditReasonIndicator> =
                                JsonMissing.of()
                            private var services: JsonField<List<Service>> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(ancillary: Ancillary) = apply {
                                this.ticketDocumentNumber = ancillary.ticketDocumentNumber
                                this.passengerNameOrDescription =
                                    ancillary.passengerNameOrDescription
                                this.connectedTicketDocumentNumber =
                                    ancillary.connectedTicketDocumentNumber
                                this.creditReasonIndicator = ancillary.creditReasonIndicator
                                this.services = ancillary.services
                                additionalProperties(ancillary.additionalProperties)
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

                            /** Additional travel charges, such as baggage fees. */
                            fun services(services: List<Service>) = services(JsonField.of(services))

                            /** Additional travel charges, such as baggage fees. */
                            @JsonProperty("services")
                            @ExcludeMissing
                            fun services(services: JsonField<List<Service>>) = apply {
                                this.services = services
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
                                    ticketDocumentNumber,
                                    passengerNameOrDescription,
                                    connectedTicketDocumentNumber,
                                    creditReasonIndicator,
                                    services.map { it.toUnmodifiable() },
                                    additionalProperties.toUnmodifiable(),
                                )
                        }

                        class CreditReasonIndicator
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
                    ) {

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
                    ) {

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
                    ) {

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
                        private val flightNumber: JsonField<String>,
                        private val carrierCode: JsonField<String>,
                        private val fareBasisCode: JsonField<String>,
                        private val serviceClass: JsonField<String>,
                        private val stopOverCode: JsonField<StopOverCode>,
                        private val destinationCityAirportCode: JsonField<String>,
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        private var validated: Boolean = false

                        private var hashCode: Int = 0

                        /** Flight number. */
                        fun flightNumber(): Optional<String> =
                            Optional.ofNullable(flightNumber.getNullable("flight_number"))

                        /** Carrier code (e.g., United Airlines, Jet Blue, etc.). */
                        fun carrierCode(): Optional<String> =
                            Optional.ofNullable(carrierCode.getNullable("carrier_code"))

                        /** Fare basis code. */
                        fun fareBasisCode(): Optional<String> =
                            Optional.ofNullable(fareBasisCode.getNullable("fare_basis_code"))

                        /** Service class (e.g., first class, business class, etc.). */
                        fun serviceClass(): Optional<String> =
                            Optional.ofNullable(serviceClass.getNullable("service_class"))

                        /** Indicates whether a stopover is allowed on this ticket. */
                        fun stopOverCode(): Optional<StopOverCode> =
                            Optional.ofNullable(stopOverCode.getNullable("stop_over_code"))

                        /** Code for the destination city or airport. */
                        fun destinationCityAirportCode(): Optional<String> =
                            Optional.ofNullable(
                                destinationCityAirportCode.getNullable(
                                    "destination_city_airport_code"
                                )
                            )

                        /** Flight number. */
                        @JsonProperty("flight_number")
                        @ExcludeMissing
                        fun _flightNumber() = flightNumber

                        /** Carrier code (e.g., United Airlines, Jet Blue, etc.). */
                        @JsonProperty("carrier_code")
                        @ExcludeMissing
                        fun _carrierCode() = carrierCode

                        /** Fare basis code. */
                        @JsonProperty("fare_basis_code")
                        @ExcludeMissing
                        fun _fareBasisCode() = fareBasisCode

                        /** Service class (e.g., first class, business class, etc.). */
                        @JsonProperty("service_class")
                        @ExcludeMissing
                        fun _serviceClass() = serviceClass

                        /** Indicates whether a stopover is allowed on this ticket. */
                        @JsonProperty("stop_over_code")
                        @ExcludeMissing
                        fun _stopOverCode() = stopOverCode

                        /** Code for the destination city or airport. */
                        @JsonProperty("destination_city_airport_code")
                        @ExcludeMissing
                        fun _destinationCityAirportCode() = destinationCityAirportCode

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): TripLeg = apply {
                            if (!validated) {
                                flightNumber()
                                carrierCode()
                                fareBasisCode()
                                serviceClass()
                                stopOverCode()
                                destinationCityAirportCode()
                                validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is TripLeg &&
                                this.flightNumber == other.flightNumber &&
                                this.carrierCode == other.carrierCode &&
                                this.fareBasisCode == other.fareBasisCode &&
                                this.serviceClass == other.serviceClass &&
                                this.stopOverCode == other.stopOverCode &&
                                this.destinationCityAirportCode ==
                                    other.destinationCityAirportCode &&
                                this.additionalProperties == other.additionalProperties
                        }

                        override fun hashCode(): Int {
                            if (hashCode == 0) {
                                hashCode =
                                    Objects.hash(
                                        flightNumber,
                                        carrierCode,
                                        fareBasisCode,
                                        serviceClass,
                                        stopOverCode,
                                        destinationCityAirportCode,
                                        additionalProperties,
                                    )
                            }
                            return hashCode
                        }

                        override fun toString() =
                            "TripLeg{flightNumber=$flightNumber, carrierCode=$carrierCode, fareBasisCode=$fareBasisCode, serviceClass=$serviceClass, stopOverCode=$stopOverCode, destinationCityAirportCode=$destinationCityAirportCode, additionalProperties=$additionalProperties}"

                        companion object {

                            @JvmStatic fun builder() = Builder()
                        }

                        class Builder {

                            private var flightNumber: JsonField<String> = JsonMissing.of()
                            private var carrierCode: JsonField<String> = JsonMissing.of()
                            private var fareBasisCode: JsonField<String> = JsonMissing.of()
                            private var serviceClass: JsonField<String> = JsonMissing.of()
                            private var stopOverCode: JsonField<StopOverCode> = JsonMissing.of()
                            private var destinationCityAirportCode: JsonField<String> =
                                JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(tripLeg: TripLeg) = apply {
                                this.flightNumber = tripLeg.flightNumber
                                this.carrierCode = tripLeg.carrierCode
                                this.fareBasisCode = tripLeg.fareBasisCode
                                this.serviceClass = tripLeg.serviceClass
                                this.stopOverCode = tripLeg.stopOverCode
                                this.destinationCityAirportCode = tripLeg.destinationCityAirportCode
                                additionalProperties(tripLeg.additionalProperties)
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

                            /** Carrier code (e.g., United Airlines, Jet Blue, etc.). */
                            fun carrierCode(carrierCode: String) =
                                carrierCode(JsonField.of(carrierCode))

                            /** Carrier code (e.g., United Airlines, Jet Blue, etc.). */
                            @JsonProperty("carrier_code")
                            @ExcludeMissing
                            fun carrierCode(carrierCode: JsonField<String>) = apply {
                                this.carrierCode = carrierCode
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
                                    flightNumber,
                                    carrierCode,
                                    fareBasisCode,
                                    serviceClass,
                                    stopOverCode,
                                    destinationCityAirportCode,
                                    additionalProperties.toUnmodifiable(),
                                )
                        }

                        class StopOverCode
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
         * A Card Reversal object. This field will be present in the JSON response if and only if
         * `category` is equal to `card_reversal`.
         */
        @JsonDeserialize(builder = CardReversal.Builder::class)
        @NoAutoDetect
        class CardReversal
        private constructor(
            private val id: JsonField<String>,
            private val reversalAmount: JsonField<Long>,
            private val updatedAuthorizationAmount: JsonField<Long>,
            private val currency: JsonField<Currency>,
            private val cardAuthorizationId: JsonField<String>,
            private val network: JsonField<Network>,
            private val type: JsonField<Type>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** The Card Reversal identifier. */
            fun id(): String = id.getRequired("id")

            /**
             * The amount of this reversal in the minor unit of the transaction's currency. For
             * dollars, for example, this is cents.
             */
            fun reversalAmount(): Long = reversalAmount.getRequired("reversal_amount")

            /**
             * The amount left pending on the Card Authorization in the minor unit of the
             * transaction's currency. For dollars, for example, this is cents.
             */
            fun updatedAuthorizationAmount(): Long =
                updatedAuthorizationAmount.getRequired("updated_authorization_amount")

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the reversal's
             * currency.
             */
            fun currency(): Currency = currency.getRequired("currency")

            /** The identifier for the Card Authorization this reverses. */
            fun cardAuthorizationId(): String =
                cardAuthorizationId.getRequired("card_authorization_id")

            /** The card network used to process this card authorization. */
            fun network(): Network = network.getRequired("network")

            /**
             * A constant representing the object's type. For this resource it will always be
             * `card_reversal`.
             */
            fun type(): Type = type.getRequired("type")

            /** The Card Reversal identifier. */
            @JsonProperty("id") @ExcludeMissing fun _id() = id

            /**
             * The amount of this reversal in the minor unit of the transaction's currency. For
             * dollars, for example, this is cents.
             */
            @JsonProperty("reversal_amount") @ExcludeMissing fun _reversalAmount() = reversalAmount

            /**
             * The amount left pending on the Card Authorization in the minor unit of the
             * transaction's currency. For dollars, for example, this is cents.
             */
            @JsonProperty("updated_authorization_amount")
            @ExcludeMissing
            fun _updatedAuthorizationAmount() = updatedAuthorizationAmount

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the reversal's
             * currency.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            /** The identifier for the Card Authorization this reverses. */
            @JsonProperty("card_authorization_id")
            @ExcludeMissing
            fun _cardAuthorizationId() = cardAuthorizationId

            /** The card network used to process this card authorization. */
            @JsonProperty("network") @ExcludeMissing fun _network() = network

            /**
             * A constant representing the object's type. For this resource it will always be
             * `card_reversal`.
             */
            @JsonProperty("type") @ExcludeMissing fun _type() = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): CardReversal = apply {
                if (!validated) {
                    id()
                    reversalAmount()
                    updatedAuthorizationAmount()
                    currency()
                    cardAuthorizationId()
                    network()
                    type()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CardReversal &&
                    this.id == other.id &&
                    this.reversalAmount == other.reversalAmount &&
                    this.updatedAuthorizationAmount == other.updatedAuthorizationAmount &&
                    this.currency == other.currency &&
                    this.cardAuthorizationId == other.cardAuthorizationId &&
                    this.network == other.network &&
                    this.type == other.type &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            id,
                            reversalAmount,
                            updatedAuthorizationAmount,
                            currency,
                            cardAuthorizationId,
                            network,
                            type,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "CardReversal{id=$id, reversalAmount=$reversalAmount, updatedAuthorizationAmount=$updatedAuthorizationAmount, currency=$currency, cardAuthorizationId=$cardAuthorizationId, network=$network, type=$type, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var reversalAmount: JsonField<Long> = JsonMissing.of()
                private var updatedAuthorizationAmount: JsonField<Long> = JsonMissing.of()
                private var currency: JsonField<Currency> = JsonMissing.of()
                private var cardAuthorizationId: JsonField<String> = JsonMissing.of()
                private var network: JsonField<Network> = JsonMissing.of()
                private var type: JsonField<Type> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(cardReversal: CardReversal) = apply {
                    this.id = cardReversal.id
                    this.reversalAmount = cardReversal.reversalAmount
                    this.updatedAuthorizationAmount = cardReversal.updatedAuthorizationAmount
                    this.currency = cardReversal.currency
                    this.cardAuthorizationId = cardReversal.cardAuthorizationId
                    this.network = cardReversal.network
                    this.type = cardReversal.type
                    additionalProperties(cardReversal.additionalProperties)
                }

                /** The Card Reversal identifier. */
                fun id(id: String) = id(JsonField.of(id))

                /** The Card Reversal identifier. */
                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                /**
                 * The amount of this reversal in the minor unit of the transaction's currency. For
                 * dollars, for example, this is cents.
                 */
                fun reversalAmount(reversalAmount: Long) =
                    reversalAmount(JsonField.of(reversalAmount))

                /**
                 * The amount of this reversal in the minor unit of the transaction's currency. For
                 * dollars, for example, this is cents.
                 */
                @JsonProperty("reversal_amount")
                @ExcludeMissing
                fun reversalAmount(reversalAmount: JsonField<Long>) = apply {
                    this.reversalAmount = reversalAmount
                }

                /**
                 * The amount left pending on the Card Authorization in the minor unit of the
                 * transaction's currency. For dollars, for example, this is cents.
                 */
                fun updatedAuthorizationAmount(updatedAuthorizationAmount: Long) =
                    updatedAuthorizationAmount(JsonField.of(updatedAuthorizationAmount))

                /**
                 * The amount left pending on the Card Authorization in the minor unit of the
                 * transaction's currency. For dollars, for example, this is cents.
                 */
                @JsonProperty("updated_authorization_amount")
                @ExcludeMissing
                fun updatedAuthorizationAmount(updatedAuthorizationAmount: JsonField<Long>) =
                    apply {
                        this.updatedAuthorizationAmount = updatedAuthorizationAmount
                    }

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the reversal's
                 * currency.
                 */
                fun currency(currency: Currency) = currency(JsonField.of(currency))

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the reversal's
                 * currency.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                /** The identifier for the Card Authorization this reverses. */
                fun cardAuthorizationId(cardAuthorizationId: String) =
                    cardAuthorizationId(JsonField.of(cardAuthorizationId))

                /** The identifier for the Card Authorization this reverses. */
                @JsonProperty("card_authorization_id")
                @ExcludeMissing
                fun cardAuthorizationId(cardAuthorizationId: JsonField<String>) = apply {
                    this.cardAuthorizationId = cardAuthorizationId
                }

                /** The card network used to process this card authorization. */
                fun network(network: Network) = network(JsonField.of(network))

                /** The card network used to process this card authorization. */
                @JsonProperty("network")
                @ExcludeMissing
                fun network(network: JsonField<Network>) = apply { this.network = network }

                /**
                 * A constant representing the object's type. For this resource it will always be
                 * `card_reversal`.
                 */
                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * A constant representing the object's type. For this resource it will always be
                 * `card_reversal`.
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

                fun build(): CardReversal =
                    CardReversal(
                        id,
                        reversalAmount,
                        updatedAuthorizationAmount,
                        currency,
                        cardAuthorizationId,
                        network,
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

                    @JvmField val CARD_REVERSAL = Type(JsonField.of("card_reversal"))

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                enum class Known {
                    CARD_REVERSAL,
                }

                enum class Value {
                    CARD_REVERSAL,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        CARD_REVERSAL -> Value.CARD_REVERSAL
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        CARD_REVERSAL -> Known.CARD_REVERSAL
                        else -> throw IncreaseInvalidDataException("Unknown Type: $value")
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
            private val id: JsonField<String>,
            private val cardPaymentId: JsonField<String>,
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
            private val transactionId: JsonField<String>,
            private val pendingTransactionId: JsonField<String>,
            private val purchaseDetails: JsonField<PurchaseDetails>,
            private val type: JsonField<Type>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** The Card Settlement identifier. */
            fun id(): String = id.getRequired("id")

            /** The ID of the Card Payment this transaction belongs to. */
            fun cardPaymentId(): Optional<String> =
                Optional.ofNullable(cardPaymentId.getNullable("card_payment_id"))

            /**
             * The Card Authorization that was created prior to this Card Settlement, if one exists.
             */
            fun cardAuthorization(): Optional<String> =
                Optional.ofNullable(cardAuthorization.getNullable("card_authorization"))

            /**
             * The amount in the minor unit of the transaction's settlement currency. For dollars,
             * for example, this is cents.
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

            /** The identifier of the Transaction associated with this Transaction. */
            fun transactionId(): String = transactionId.getRequired("transaction_id")

            /** The identifier of the Pending Transaction associated with this Transaction. */
            fun pendingTransactionId(): Optional<String> =
                Optional.ofNullable(pendingTransactionId.getNullable("pending_transaction_id"))

            /**
             * Additional details about the card purchase, such as tax and industry-specific fields.
             */
            fun purchaseDetails(): Optional<PurchaseDetails> =
                Optional.ofNullable(purchaseDetails.getNullable("purchase_details"))

            /**
             * A constant representing the object's type. For this resource it will always be
             * `card_settlement`.
             */
            fun type(): Type = type.getRequired("type")

            /** The Card Settlement identifier. */
            @JsonProperty("id") @ExcludeMissing fun _id() = id

            /** The ID of the Card Payment this transaction belongs to. */
            @JsonProperty("card_payment_id") @ExcludeMissing fun _cardPaymentId() = cardPaymentId

            /**
             * The Card Authorization that was created prior to this Card Settlement, if one exists.
             */
            @JsonProperty("card_authorization")
            @ExcludeMissing
            fun _cardAuthorization() = cardAuthorization

            /**
             * The amount in the minor unit of the transaction's settlement currency. For dollars,
             * for example, this is cents.
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

            /** The identifier of the Transaction associated with this Transaction. */
            @JsonProperty("transaction_id") @ExcludeMissing fun _transactionId() = transactionId

            /** The identifier of the Pending Transaction associated with this Transaction. */
            @JsonProperty("pending_transaction_id")
            @ExcludeMissing
            fun _pendingTransactionId() = pendingTransactionId

            /**
             * Additional details about the card purchase, such as tax and industry-specific fields.
             */
            @JsonProperty("purchase_details")
            @ExcludeMissing
            fun _purchaseDetails() = purchaseDetails

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
                    id()
                    cardPaymentId()
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
                    transactionId()
                    pendingTransactionId()
                    purchaseDetails().map { it.validate() }
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
                    this.cardPaymentId == other.cardPaymentId &&
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
                    this.transactionId == other.transactionId &&
                    this.pendingTransactionId == other.pendingTransactionId &&
                    this.purchaseDetails == other.purchaseDetails &&
                    this.type == other.type &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            id,
                            cardPaymentId,
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
                            transactionId,
                            pendingTransactionId,
                            purchaseDetails,
                            type,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "CardSettlement{id=$id, cardPaymentId=$cardPaymentId, cardAuthorization=$cardAuthorization, amount=$amount, currency=$currency, presentmentAmount=$presentmentAmount, presentmentCurrency=$presentmentCurrency, merchantAcceptorId=$merchantAcceptorId, merchantCity=$merchantCity, merchantState=$merchantState, merchantCountry=$merchantCountry, merchantName=$merchantName, merchantCategoryCode=$merchantCategoryCode, transactionId=$transactionId, pendingTransactionId=$pendingTransactionId, purchaseDetails=$purchaseDetails, type=$type, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var cardPaymentId: JsonField<String> = JsonMissing.of()
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
                private var transactionId: JsonField<String> = JsonMissing.of()
                private var pendingTransactionId: JsonField<String> = JsonMissing.of()
                private var purchaseDetails: JsonField<PurchaseDetails> = JsonMissing.of()
                private var type: JsonField<Type> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(cardSettlement: CardSettlement) = apply {
                    this.id = cardSettlement.id
                    this.cardPaymentId = cardSettlement.cardPaymentId
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
                    this.transactionId = cardSettlement.transactionId
                    this.pendingTransactionId = cardSettlement.pendingTransactionId
                    this.purchaseDetails = cardSettlement.purchaseDetails
                    this.type = cardSettlement.type
                    additionalProperties(cardSettlement.additionalProperties)
                }

                /** The Card Settlement identifier. */
                fun id(id: String) = id(JsonField.of(id))

                /** The Card Settlement identifier. */
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

                /** The city the merchant resides in. */
                fun merchantCity(merchantCity: String) = merchantCity(JsonField.of(merchantCity))

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
                fun merchantName(merchantName: String) = merchantName(JsonField.of(merchantName))

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

                /** The identifier of the Transaction associated with this Transaction. */
                fun transactionId(transactionId: String) =
                    transactionId(JsonField.of(transactionId))

                /** The identifier of the Transaction associated with this Transaction. */
                @JsonProperty("transaction_id")
                @ExcludeMissing
                fun transactionId(transactionId: JsonField<String>) = apply {
                    this.transactionId = transactionId
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
                        id,
                        cardPaymentId,
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
                        transactionId,
                        pendingTransactionId,
                        purchaseDetails,
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

            /**
             * Additional details about the card purchase, such as tax and industry-specific fields.
             */
            @JsonDeserialize(builder = PurchaseDetails.Builder::class)
            @NoAutoDetect
            class PurchaseDetails
            private constructor(
                private val purchaseIdentifier: JsonField<String>,
                private val purchaseIdentifierFormat: JsonField<PurchaseIdentifierFormat>,
                private val customerReferenceIdentifier: JsonField<String>,
                private val localTaxAmount: JsonField<Long>,
                private val localTaxCurrency: JsonField<String>,
                private val nationalTaxAmount: JsonField<Long>,
                private val nationalTaxCurrency: JsonField<String>,
                private val carRental: JsonField<CarRental>,
                private val lodging: JsonField<Lodging>,
                private val travel: JsonField<Travel>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

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

                /** The national tax amount in minor units. */
                fun nationalTaxAmount(): Optional<Long> =
                    Optional.ofNullable(nationalTaxAmount.getNullable("national_tax_amount"))

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the local tax
                 * assessed.
                 */
                fun nationalTaxCurrency(): Optional<String> =
                    Optional.ofNullable(nationalTaxCurrency.getNullable("national_tax_currency"))

                /** Fields specific to car rentals. */
                fun carRental(): Optional<CarRental> =
                    Optional.ofNullable(carRental.getNullable("car_rental"))

                /** Fields specific to lodging. */
                fun lodging(): Optional<Lodging> =
                    Optional.ofNullable(lodging.getNullable("lodging"))

                /** Fields specific to travel. */
                fun travel(): Optional<Travel> = Optional.ofNullable(travel.getNullable("travel"))

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

                /** Fields specific to car rentals. */
                @JsonProperty("car_rental") @ExcludeMissing fun _carRental() = carRental

                /** Fields specific to lodging. */
                @JsonProperty("lodging") @ExcludeMissing fun _lodging() = lodging

                /** Fields specific to travel. */
                @JsonProperty("travel") @ExcludeMissing fun _travel() = travel

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): PurchaseDetails = apply {
                    if (!validated) {
                        purchaseIdentifier()
                        purchaseIdentifierFormat()
                        customerReferenceIdentifier()
                        localTaxAmount()
                        localTaxCurrency()
                        nationalTaxAmount()
                        nationalTaxCurrency()
                        carRental().map { it.validate() }
                        lodging().map { it.validate() }
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
                        this.purchaseIdentifier == other.purchaseIdentifier &&
                        this.purchaseIdentifierFormat == other.purchaseIdentifierFormat &&
                        this.customerReferenceIdentifier == other.customerReferenceIdentifier &&
                        this.localTaxAmount == other.localTaxAmount &&
                        this.localTaxCurrency == other.localTaxCurrency &&
                        this.nationalTaxAmount == other.nationalTaxAmount &&
                        this.nationalTaxCurrency == other.nationalTaxCurrency &&
                        this.carRental == other.carRental &&
                        this.lodging == other.lodging &&
                        this.travel == other.travel &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                purchaseIdentifier,
                                purchaseIdentifierFormat,
                                customerReferenceIdentifier,
                                localTaxAmount,
                                localTaxCurrency,
                                nationalTaxAmount,
                                nationalTaxCurrency,
                                carRental,
                                lodging,
                                travel,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "PurchaseDetails{purchaseIdentifier=$purchaseIdentifier, purchaseIdentifierFormat=$purchaseIdentifierFormat, customerReferenceIdentifier=$customerReferenceIdentifier, localTaxAmount=$localTaxAmount, localTaxCurrency=$localTaxCurrency, nationalTaxAmount=$nationalTaxAmount, nationalTaxCurrency=$nationalTaxCurrency, carRental=$carRental, lodging=$lodging, travel=$travel, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var purchaseIdentifier: JsonField<String> = JsonMissing.of()
                    private var purchaseIdentifierFormat: JsonField<PurchaseIdentifierFormat> =
                        JsonMissing.of()
                    private var customerReferenceIdentifier: JsonField<String> = JsonMissing.of()
                    private var localTaxAmount: JsonField<Long> = JsonMissing.of()
                    private var localTaxCurrency: JsonField<String> = JsonMissing.of()
                    private var nationalTaxAmount: JsonField<Long> = JsonMissing.of()
                    private var nationalTaxCurrency: JsonField<String> = JsonMissing.of()
                    private var carRental: JsonField<CarRental> = JsonMissing.of()
                    private var lodging: JsonField<Lodging> = JsonMissing.of()
                    private var travel: JsonField<Travel> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(purchaseDetails: PurchaseDetails) = apply {
                        this.purchaseIdentifier = purchaseDetails.purchaseIdentifier
                        this.purchaseIdentifierFormat = purchaseDetails.purchaseIdentifierFormat
                        this.customerReferenceIdentifier =
                            purchaseDetails.customerReferenceIdentifier
                        this.localTaxAmount = purchaseDetails.localTaxAmount
                        this.localTaxCurrency = purchaseDetails.localTaxCurrency
                        this.nationalTaxAmount = purchaseDetails.nationalTaxAmount
                        this.nationalTaxCurrency = purchaseDetails.nationalTaxCurrency
                        this.carRental = purchaseDetails.carRental
                        this.lodging = purchaseDetails.lodging
                        this.travel = purchaseDetails.travel
                        additionalProperties(purchaseDetails.additionalProperties)
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

                    /** Fields specific to car rentals. */
                    fun carRental(carRental: CarRental) = carRental(JsonField.of(carRental))

                    /** Fields specific to car rentals. */
                    @JsonProperty("car_rental")
                    @ExcludeMissing
                    fun carRental(carRental: JsonField<CarRental>) = apply {
                        this.carRental = carRental
                    }

                    /** Fields specific to lodging. */
                    fun lodging(lodging: Lodging) = lodging(JsonField.of(lodging))

                    /** Fields specific to lodging. */
                    @JsonProperty("lodging")
                    @ExcludeMissing
                    fun lodging(lodging: JsonField<Lodging>) = apply { this.lodging = lodging }

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
                            purchaseIdentifier,
                            purchaseIdentifierFormat,
                            customerReferenceIdentifier,
                            localTaxAmount,
                            localTaxCurrency,
                            nationalTaxAmount,
                            nationalTaxCurrency,
                            carRental,
                            lodging,
                            travel,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                /** Fields specific to car rentals. */
                @JsonDeserialize(builder = CarRental.Builder::class)
                @NoAutoDetect
                class CarRental
                private constructor(
                    private val extraCharges: JsonField<ExtraCharges>,
                    private val daysRented: JsonField<Long>,
                    private val noShowIndicator: JsonField<NoShowIndicator>,
                    private val checkoutDate: JsonField<LocalDate>,
                    private val dailyRentalRateAmount: JsonField<Long>,
                    private val dailyRentalRateCurrency: JsonField<String>,
                    private val weeklyRentalRateAmount: JsonField<Long>,
                    private val weeklyRentalRateCurrency: JsonField<String>,
                    private val insuranceChargesAmount: JsonField<Long>,
                    private val insuranceChargesCurrency: JsonField<String>,
                    private val fuelChargesAmount: JsonField<Long>,
                    private val fuelChargesCurrency: JsonField<String>,
                    private val oneWayDropOffChargesAmount: JsonField<Long>,
                    private val oneWayDropOffChargesCurrency: JsonField<String>,
                    private val carClassCode: JsonField<String>,
                    private val renterName: JsonField<String>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    /** Additional charges (gas, late fee, etc.) being billed. */
                    fun extraCharges(): Optional<ExtraCharges> =
                        Optional.ofNullable(extraCharges.getNullable("extra_charges"))

                    /** Number of days the vehicle was rented. */
                    fun daysRented(): Optional<Long> =
                        Optional.ofNullable(daysRented.getNullable("days_rented"))

                    /**
                     * An indicator that the cardholder is being billed for a reserved vehicle that
                     * was not actually rented (that is, a "no-show" charge).
                     */
                    fun noShowIndicator(): Optional<NoShowIndicator> =
                        Optional.ofNullable(noShowIndicator.getNullable("no_show_indicator"))

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

                    /** Code indicating the vehicle's class. */
                    fun carClassCode(): Optional<String> =
                        Optional.ofNullable(carClassCode.getNullable("car_class_code"))

                    /** Name of the person renting the vehicle. */
                    fun renterName(): Optional<String> =
                        Optional.ofNullable(renterName.getNullable("renter_name"))

                    /** Additional charges (gas, late fee, etc.) being billed. */
                    @JsonProperty("extra_charges")
                    @ExcludeMissing
                    fun _extraCharges() = extraCharges

                    /** Number of days the vehicle was rented. */
                    @JsonProperty("days_rented") @ExcludeMissing fun _daysRented() = daysRented

                    /**
                     * An indicator that the cardholder is being billed for a reserved vehicle that
                     * was not actually rented (that is, a "no-show" charge).
                     */
                    @JsonProperty("no_show_indicator")
                    @ExcludeMissing
                    fun _noShowIndicator() = noShowIndicator

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

                    /** Code indicating the vehicle's class. */
                    @JsonProperty("car_class_code")
                    @ExcludeMissing
                    fun _carClassCode() = carClassCode

                    /** Name of the person renting the vehicle. */
                    @JsonProperty("renter_name") @ExcludeMissing fun _renterName() = renterName

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): CarRental = apply {
                        if (!validated) {
                            extraCharges()
                            daysRented()
                            noShowIndicator()
                            checkoutDate()
                            dailyRentalRateAmount()
                            dailyRentalRateCurrency()
                            weeklyRentalRateAmount()
                            weeklyRentalRateCurrency()
                            insuranceChargesAmount()
                            insuranceChargesCurrency()
                            fuelChargesAmount()
                            fuelChargesCurrency()
                            oneWayDropOffChargesAmount()
                            oneWayDropOffChargesCurrency()
                            carClassCode()
                            renterName()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is CarRental &&
                            this.extraCharges == other.extraCharges &&
                            this.daysRented == other.daysRented &&
                            this.noShowIndicator == other.noShowIndicator &&
                            this.checkoutDate == other.checkoutDate &&
                            this.dailyRentalRateAmount == other.dailyRentalRateAmount &&
                            this.dailyRentalRateCurrency == other.dailyRentalRateCurrency &&
                            this.weeklyRentalRateAmount == other.weeklyRentalRateAmount &&
                            this.weeklyRentalRateCurrency == other.weeklyRentalRateCurrency &&
                            this.insuranceChargesAmount == other.insuranceChargesAmount &&
                            this.insuranceChargesCurrency == other.insuranceChargesCurrency &&
                            this.fuelChargesAmount == other.fuelChargesAmount &&
                            this.fuelChargesCurrency == other.fuelChargesCurrency &&
                            this.oneWayDropOffChargesAmount == other.oneWayDropOffChargesAmount &&
                            this.oneWayDropOffChargesCurrency ==
                                other.oneWayDropOffChargesCurrency &&
                            this.carClassCode == other.carClassCode &&
                            this.renterName == other.renterName &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode =
                                Objects.hash(
                                    extraCharges,
                                    daysRented,
                                    noShowIndicator,
                                    checkoutDate,
                                    dailyRentalRateAmount,
                                    dailyRentalRateCurrency,
                                    weeklyRentalRateAmount,
                                    weeklyRentalRateCurrency,
                                    insuranceChargesAmount,
                                    insuranceChargesCurrency,
                                    fuelChargesAmount,
                                    fuelChargesCurrency,
                                    oneWayDropOffChargesAmount,
                                    oneWayDropOffChargesCurrency,
                                    carClassCode,
                                    renterName,
                                    additionalProperties,
                                )
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "CarRental{extraCharges=$extraCharges, daysRented=$daysRented, noShowIndicator=$noShowIndicator, checkoutDate=$checkoutDate, dailyRentalRateAmount=$dailyRentalRateAmount, dailyRentalRateCurrency=$dailyRentalRateCurrency, weeklyRentalRateAmount=$weeklyRentalRateAmount, weeklyRentalRateCurrency=$weeklyRentalRateCurrency, insuranceChargesAmount=$insuranceChargesAmount, insuranceChargesCurrency=$insuranceChargesCurrency, fuelChargesAmount=$fuelChargesAmount, fuelChargesCurrency=$fuelChargesCurrency, oneWayDropOffChargesAmount=$oneWayDropOffChargesAmount, oneWayDropOffChargesCurrency=$oneWayDropOffChargesCurrency, carClassCode=$carClassCode, renterName=$renterName, additionalProperties=$additionalProperties}"

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var extraCharges: JsonField<ExtraCharges> = JsonMissing.of()
                        private var daysRented: JsonField<Long> = JsonMissing.of()
                        private var noShowIndicator: JsonField<NoShowIndicator> = JsonMissing.of()
                        private var checkoutDate: JsonField<LocalDate> = JsonMissing.of()
                        private var dailyRentalRateAmount: JsonField<Long> = JsonMissing.of()
                        private var dailyRentalRateCurrency: JsonField<String> = JsonMissing.of()
                        private var weeklyRentalRateAmount: JsonField<Long> = JsonMissing.of()
                        private var weeklyRentalRateCurrency: JsonField<String> = JsonMissing.of()
                        private var insuranceChargesAmount: JsonField<Long> = JsonMissing.of()
                        private var insuranceChargesCurrency: JsonField<String> = JsonMissing.of()
                        private var fuelChargesAmount: JsonField<Long> = JsonMissing.of()
                        private var fuelChargesCurrency: JsonField<String> = JsonMissing.of()
                        private var oneWayDropOffChargesAmount: JsonField<Long> = JsonMissing.of()
                        private var oneWayDropOffChargesCurrency: JsonField<String> =
                            JsonMissing.of()
                        private var carClassCode: JsonField<String> = JsonMissing.of()
                        private var renterName: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(carRental: CarRental) = apply {
                            this.extraCharges = carRental.extraCharges
                            this.daysRented = carRental.daysRented
                            this.noShowIndicator = carRental.noShowIndicator
                            this.checkoutDate = carRental.checkoutDate
                            this.dailyRentalRateAmount = carRental.dailyRentalRateAmount
                            this.dailyRentalRateCurrency = carRental.dailyRentalRateCurrency
                            this.weeklyRentalRateAmount = carRental.weeklyRentalRateAmount
                            this.weeklyRentalRateCurrency = carRental.weeklyRentalRateCurrency
                            this.insuranceChargesAmount = carRental.insuranceChargesAmount
                            this.insuranceChargesCurrency = carRental.insuranceChargesCurrency
                            this.fuelChargesAmount = carRental.fuelChargesAmount
                            this.fuelChargesCurrency = carRental.fuelChargesCurrency
                            this.oneWayDropOffChargesAmount = carRental.oneWayDropOffChargesAmount
                            this.oneWayDropOffChargesCurrency =
                                carRental.oneWayDropOffChargesCurrency
                            this.carClassCode = carRental.carClassCode
                            this.renterName = carRental.renterName
                            additionalProperties(carRental.additionalProperties)
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

                        /** Number of days the vehicle was rented. */
                        fun daysRented(daysRented: Long) = daysRented(JsonField.of(daysRented))

                        /** Number of days the vehicle was rented. */
                        @JsonProperty("days_rented")
                        @ExcludeMissing
                        fun daysRented(daysRented: JsonField<Long>) = apply {
                            this.daysRented = daysRented
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

                        /** Code indicating the vehicle's class. */
                        fun carClassCode(carClassCode: String) =
                            carClassCode(JsonField.of(carClassCode))

                        /** Code indicating the vehicle's class. */
                        @JsonProperty("car_class_code")
                        @ExcludeMissing
                        fun carClassCode(carClassCode: JsonField<String>) = apply {
                            this.carClassCode = carClassCode
                        }

                        /** Name of the person renting the vehicle. */
                        fun renterName(renterName: String) = renterName(JsonField.of(renterName))

                        /** Name of the person renting the vehicle. */
                        @JsonProperty("renter_name")
                        @ExcludeMissing
                        fun renterName(renterName: JsonField<String>) = apply {
                            this.renterName = renterName
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
                                extraCharges,
                                daysRented,
                                noShowIndicator,
                                checkoutDate,
                                dailyRentalRateAmount,
                                dailyRentalRateCurrency,
                                weeklyRentalRateAmount,
                                weeklyRentalRateCurrency,
                                insuranceChargesAmount,
                                insuranceChargesCurrency,
                                fuelChargesAmount,
                                fuelChargesCurrency,
                                oneWayDropOffChargesAmount,
                                oneWayDropOffChargesCurrency,
                                carClassCode,
                                renterName,
                                additionalProperties.toUnmodifiable(),
                            )
                    }

                    class ExtraCharges
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
                    ) {

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
                    private val noShowIndicator: JsonField<NoShowIndicator>,
                    private val extraCharges: JsonField<ExtraCharges>,
                    private val checkInDate: JsonField<LocalDate>,
                    private val dailyRoomRateAmount: JsonField<Long>,
                    private val dailyRoomRateCurrency: JsonField<String>,
                    private val totalTaxAmount: JsonField<Long>,
                    private val totalTaxCurrency: JsonField<String>,
                    private val prepaidExpensesAmount: JsonField<Long>,
                    private val prepaidExpensesCurrency: JsonField<String>,
                    private val foodBeverageChargesAmount: JsonField<Long>,
                    private val foodBeverageChargesCurrency: JsonField<String>,
                    private val folioCashAdvancesAmount: JsonField<Long>,
                    private val folioCashAdvancesCurrency: JsonField<String>,
                    private val roomNights: JsonField<Long>,
                    private val totalRoomTaxAmount: JsonField<Long>,
                    private val totalRoomTaxCurrency: JsonField<String>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    /**
                     * Indicator that the cardholder is being billed for a reserved room that was
                     * not actually used.
                     */
                    fun noShowIndicator(): Optional<NoShowIndicator> =
                        Optional.ofNullable(noShowIndicator.getNullable("no_show_indicator"))

                    /** Additional charges (phone, late check-out, etc.) being billed. */
                    fun extraCharges(): Optional<ExtraCharges> =
                        Optional.ofNullable(extraCharges.getNullable("extra_charges"))

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

                    /** Total tax being charged for the room. */
                    fun totalTaxAmount(): Optional<Long> =
                        Optional.ofNullable(totalTaxAmount.getNullable("total_tax_amount"))

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the total tax
                     * assessed.
                     */
                    fun totalTaxCurrency(): Optional<String> =
                        Optional.ofNullable(totalTaxCurrency.getNullable("total_tax_currency"))

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

                    /**
                     * Indicator that the cardholder is being billed for a reserved room that was
                     * not actually used.
                     */
                    @JsonProperty("no_show_indicator")
                    @ExcludeMissing
                    fun _noShowIndicator() = noShowIndicator

                    /** Additional charges (phone, late check-out, etc.) being billed. */
                    @JsonProperty("extra_charges")
                    @ExcludeMissing
                    fun _extraCharges() = extraCharges

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

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): Lodging = apply {
                        if (!validated) {
                            noShowIndicator()
                            extraCharges()
                            checkInDate()
                            dailyRoomRateAmount()
                            dailyRoomRateCurrency()
                            totalTaxAmount()
                            totalTaxCurrency()
                            prepaidExpensesAmount()
                            prepaidExpensesCurrency()
                            foodBeverageChargesAmount()
                            foodBeverageChargesCurrency()
                            folioCashAdvancesAmount()
                            folioCashAdvancesCurrency()
                            roomNights()
                            totalRoomTaxAmount()
                            totalRoomTaxCurrency()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Lodging &&
                            this.noShowIndicator == other.noShowIndicator &&
                            this.extraCharges == other.extraCharges &&
                            this.checkInDate == other.checkInDate &&
                            this.dailyRoomRateAmount == other.dailyRoomRateAmount &&
                            this.dailyRoomRateCurrency == other.dailyRoomRateCurrency &&
                            this.totalTaxAmount == other.totalTaxAmount &&
                            this.totalTaxCurrency == other.totalTaxCurrency &&
                            this.prepaidExpensesAmount == other.prepaidExpensesAmount &&
                            this.prepaidExpensesCurrency == other.prepaidExpensesCurrency &&
                            this.foodBeverageChargesAmount == other.foodBeverageChargesAmount &&
                            this.foodBeverageChargesCurrency == other.foodBeverageChargesCurrency &&
                            this.folioCashAdvancesAmount == other.folioCashAdvancesAmount &&
                            this.folioCashAdvancesCurrency == other.folioCashAdvancesCurrency &&
                            this.roomNights == other.roomNights &&
                            this.totalRoomTaxAmount == other.totalRoomTaxAmount &&
                            this.totalRoomTaxCurrency == other.totalRoomTaxCurrency &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode =
                                Objects.hash(
                                    noShowIndicator,
                                    extraCharges,
                                    checkInDate,
                                    dailyRoomRateAmount,
                                    dailyRoomRateCurrency,
                                    totalTaxAmount,
                                    totalTaxCurrency,
                                    prepaidExpensesAmount,
                                    prepaidExpensesCurrency,
                                    foodBeverageChargesAmount,
                                    foodBeverageChargesCurrency,
                                    folioCashAdvancesAmount,
                                    folioCashAdvancesCurrency,
                                    roomNights,
                                    totalRoomTaxAmount,
                                    totalRoomTaxCurrency,
                                    additionalProperties,
                                )
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "Lodging{noShowIndicator=$noShowIndicator, extraCharges=$extraCharges, checkInDate=$checkInDate, dailyRoomRateAmount=$dailyRoomRateAmount, dailyRoomRateCurrency=$dailyRoomRateCurrency, totalTaxAmount=$totalTaxAmount, totalTaxCurrency=$totalTaxCurrency, prepaidExpensesAmount=$prepaidExpensesAmount, prepaidExpensesCurrency=$prepaidExpensesCurrency, foodBeverageChargesAmount=$foodBeverageChargesAmount, foodBeverageChargesCurrency=$foodBeverageChargesCurrency, folioCashAdvancesAmount=$folioCashAdvancesAmount, folioCashAdvancesCurrency=$folioCashAdvancesCurrency, roomNights=$roomNights, totalRoomTaxAmount=$totalRoomTaxAmount, totalRoomTaxCurrency=$totalRoomTaxCurrency, additionalProperties=$additionalProperties}"

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var noShowIndicator: JsonField<NoShowIndicator> = JsonMissing.of()
                        private var extraCharges: JsonField<ExtraCharges> = JsonMissing.of()
                        private var checkInDate: JsonField<LocalDate> = JsonMissing.of()
                        private var dailyRoomRateAmount: JsonField<Long> = JsonMissing.of()
                        private var dailyRoomRateCurrency: JsonField<String> = JsonMissing.of()
                        private var totalTaxAmount: JsonField<Long> = JsonMissing.of()
                        private var totalTaxCurrency: JsonField<String> = JsonMissing.of()
                        private var prepaidExpensesAmount: JsonField<Long> = JsonMissing.of()
                        private var prepaidExpensesCurrency: JsonField<String> = JsonMissing.of()
                        private var foodBeverageChargesAmount: JsonField<Long> = JsonMissing.of()
                        private var foodBeverageChargesCurrency: JsonField<String> =
                            JsonMissing.of()
                        private var folioCashAdvancesAmount: JsonField<Long> = JsonMissing.of()
                        private var folioCashAdvancesCurrency: JsonField<String> = JsonMissing.of()
                        private var roomNights: JsonField<Long> = JsonMissing.of()
                        private var totalRoomTaxAmount: JsonField<Long> = JsonMissing.of()
                        private var totalRoomTaxCurrency: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(lodging: Lodging) = apply {
                            this.noShowIndicator = lodging.noShowIndicator
                            this.extraCharges = lodging.extraCharges
                            this.checkInDate = lodging.checkInDate
                            this.dailyRoomRateAmount = lodging.dailyRoomRateAmount
                            this.dailyRoomRateCurrency = lodging.dailyRoomRateCurrency
                            this.totalTaxAmount = lodging.totalTaxAmount
                            this.totalTaxCurrency = lodging.totalTaxCurrency
                            this.prepaidExpensesAmount = lodging.prepaidExpensesAmount
                            this.prepaidExpensesCurrency = lodging.prepaidExpensesCurrency
                            this.foodBeverageChargesAmount = lodging.foodBeverageChargesAmount
                            this.foodBeverageChargesCurrency = lodging.foodBeverageChargesCurrency
                            this.folioCashAdvancesAmount = lodging.folioCashAdvancesAmount
                            this.folioCashAdvancesCurrency = lodging.folioCashAdvancesCurrency
                            this.roomNights = lodging.roomNights
                            this.totalRoomTaxAmount = lodging.totalRoomTaxAmount
                            this.totalRoomTaxCurrency = lodging.totalRoomTaxCurrency
                            additionalProperties(lodging.additionalProperties)
                        }

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

                        /** Additional charges (phone, late check-out, etc.) being billed. */
                        fun extraCharges(extraCharges: ExtraCharges) =
                            extraCharges(JsonField.of(extraCharges))

                        /** Additional charges (phone, late check-out, etc.) being billed. */
                        @JsonProperty("extra_charges")
                        @ExcludeMissing
                        fun extraCharges(extraCharges: JsonField<ExtraCharges>) = apply {
                            this.extraCharges = extraCharges
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
                                noShowIndicator,
                                extraCharges,
                                checkInDate,
                                dailyRoomRateAmount,
                                dailyRoomRateCurrency,
                                totalTaxAmount,
                                totalTaxCurrency,
                                prepaidExpensesAmount,
                                prepaidExpensesCurrency,
                                foodBeverageChargesAmount,
                                foodBeverageChargesCurrency,
                                folioCashAdvancesAmount,
                                folioCashAdvancesCurrency,
                                roomNights,
                                totalRoomTaxAmount,
                                totalRoomTaxCurrency,
                                additionalProperties.toUnmodifiable(),
                            )
                    }

                    class ExtraCharges
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
                    ) {

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
                ) {

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
                    private val ticketNumber: JsonField<String>,
                    private val passengerName: JsonField<String>,
                    private val departureDate: JsonField<LocalDate>,
                    private val originationCityAirportCode: JsonField<String>,
                    private val travelAgencyCode: JsonField<String>,
                    private val travelAgencyName: JsonField<String>,
                    private val restrictedTicketIndicator: JsonField<RestrictedTicketIndicator>,
                    private val computerizedReservationSystem: JsonField<String>,
                    private val creditReasonIndicator: JsonField<CreditReasonIndicator>,
                    private val ticketChangeIndicator: JsonField<TicketChangeIndicator>,
                    private val tripLegs: JsonField<List<TripLeg>>,
                    private val ancillary: JsonField<Ancillary>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    /** Ticket number. */
                    fun ticketNumber(): Optional<String> =
                        Optional.ofNullable(ticketNumber.getNullable("ticket_number"))

                    /** Name of the passenger. */
                    fun passengerName(): Optional<String> =
                        Optional.ofNullable(passengerName.getNullable("passenger_name"))

                    /** Date of departure. */
                    fun departureDate(): Optional<LocalDate> =
                        Optional.ofNullable(departureDate.getNullable("departure_date"))

                    /** Code for the originating city or airport. */
                    fun originationCityAirportCode(): Optional<String> =
                        Optional.ofNullable(
                            originationCityAirportCode.getNullable("origination_city_airport_code")
                        )

                    /** Code for the travel agency if the ticket was issued by a travel agency. */
                    fun travelAgencyCode(): Optional<String> =
                        Optional.ofNullable(travelAgencyCode.getNullable("travel_agency_code"))

                    /** Name of the travel agency if the ticket was issued by a travel agency. */
                    fun travelAgencyName(): Optional<String> =
                        Optional.ofNullable(travelAgencyName.getNullable("travel_agency_name"))

                    /** Indicates whether this ticket is non-refundable. */
                    fun restrictedTicketIndicator(): Optional<RestrictedTicketIndicator> =
                        Optional.ofNullable(
                            restrictedTicketIndicator.getNullable("restricted_ticket_indicator")
                        )

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

                    /** Indicates why a ticket was changed. */
                    fun ticketChangeIndicator(): Optional<TicketChangeIndicator> =
                        Optional.ofNullable(
                            ticketChangeIndicator.getNullable("ticket_change_indicator")
                        )

                    /** Fields specific to each leg of the journey. */
                    fun tripLegs(): Optional<List<TripLeg>> =
                        Optional.ofNullable(tripLegs.getNullable("trip_legs"))

                    /** Ancillary purchases in addition to the airfare. */
                    fun ancillary(): Optional<Ancillary> =
                        Optional.ofNullable(ancillary.getNullable("ancillary"))

                    /** Ticket number. */
                    @JsonProperty("ticket_number")
                    @ExcludeMissing
                    fun _ticketNumber() = ticketNumber

                    /** Name of the passenger. */
                    @JsonProperty("passenger_name")
                    @ExcludeMissing
                    fun _passengerName() = passengerName

                    /** Date of departure. */
                    @JsonProperty("departure_date")
                    @ExcludeMissing
                    fun _departureDate() = departureDate

                    /** Code for the originating city or airport. */
                    @JsonProperty("origination_city_airport_code")
                    @ExcludeMissing
                    fun _originationCityAirportCode() = originationCityAirportCode

                    /** Code for the travel agency if the ticket was issued by a travel agency. */
                    @JsonProperty("travel_agency_code")
                    @ExcludeMissing
                    fun _travelAgencyCode() = travelAgencyCode

                    /** Name of the travel agency if the ticket was issued by a travel agency. */
                    @JsonProperty("travel_agency_name")
                    @ExcludeMissing
                    fun _travelAgencyName() = travelAgencyName

                    /** Indicates whether this ticket is non-refundable. */
                    @JsonProperty("restricted_ticket_indicator")
                    @ExcludeMissing
                    fun _restrictedTicketIndicator() = restrictedTicketIndicator

                    /** Indicates the computerized reservation system used to book the ticket. */
                    @JsonProperty("computerized_reservation_system")
                    @ExcludeMissing
                    fun _computerizedReservationSystem() = computerizedReservationSystem

                    /** Indicates the reason for a credit to the cardholder. */
                    @JsonProperty("credit_reason_indicator")
                    @ExcludeMissing
                    fun _creditReasonIndicator() = creditReasonIndicator

                    /** Indicates why a ticket was changed. */
                    @JsonProperty("ticket_change_indicator")
                    @ExcludeMissing
                    fun _ticketChangeIndicator() = ticketChangeIndicator

                    /** Fields specific to each leg of the journey. */
                    @JsonProperty("trip_legs") @ExcludeMissing fun _tripLegs() = tripLegs

                    /** Ancillary purchases in addition to the airfare. */
                    @JsonProperty("ancillary") @ExcludeMissing fun _ancillary() = ancillary

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): Travel = apply {
                        if (!validated) {
                            ticketNumber()
                            passengerName()
                            departureDate()
                            originationCityAirportCode()
                            travelAgencyCode()
                            travelAgencyName()
                            restrictedTicketIndicator()
                            computerizedReservationSystem()
                            creditReasonIndicator()
                            ticketChangeIndicator()
                            tripLegs().map { it.forEach { it.validate() } }
                            ancillary().map { it.validate() }
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Travel &&
                            this.ticketNumber == other.ticketNumber &&
                            this.passengerName == other.passengerName &&
                            this.departureDate == other.departureDate &&
                            this.originationCityAirportCode == other.originationCityAirportCode &&
                            this.travelAgencyCode == other.travelAgencyCode &&
                            this.travelAgencyName == other.travelAgencyName &&
                            this.restrictedTicketIndicator == other.restrictedTicketIndicator &&
                            this.computerizedReservationSystem ==
                                other.computerizedReservationSystem &&
                            this.creditReasonIndicator == other.creditReasonIndicator &&
                            this.ticketChangeIndicator == other.ticketChangeIndicator &&
                            this.tripLegs == other.tripLegs &&
                            this.ancillary == other.ancillary &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode =
                                Objects.hash(
                                    ticketNumber,
                                    passengerName,
                                    departureDate,
                                    originationCityAirportCode,
                                    travelAgencyCode,
                                    travelAgencyName,
                                    restrictedTicketIndicator,
                                    computerizedReservationSystem,
                                    creditReasonIndicator,
                                    ticketChangeIndicator,
                                    tripLegs,
                                    ancillary,
                                    additionalProperties,
                                )
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "Travel{ticketNumber=$ticketNumber, passengerName=$passengerName, departureDate=$departureDate, originationCityAirportCode=$originationCityAirportCode, travelAgencyCode=$travelAgencyCode, travelAgencyName=$travelAgencyName, restrictedTicketIndicator=$restrictedTicketIndicator, computerizedReservationSystem=$computerizedReservationSystem, creditReasonIndicator=$creditReasonIndicator, ticketChangeIndicator=$ticketChangeIndicator, tripLegs=$tripLegs, ancillary=$ancillary, additionalProperties=$additionalProperties}"

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var ticketNumber: JsonField<String> = JsonMissing.of()
                        private var passengerName: JsonField<String> = JsonMissing.of()
                        private var departureDate: JsonField<LocalDate> = JsonMissing.of()
                        private var originationCityAirportCode: JsonField<String> = JsonMissing.of()
                        private var travelAgencyCode: JsonField<String> = JsonMissing.of()
                        private var travelAgencyName: JsonField<String> = JsonMissing.of()
                        private var restrictedTicketIndicator:
                            JsonField<RestrictedTicketIndicator> =
                            JsonMissing.of()
                        private var computerizedReservationSystem: JsonField<String> =
                            JsonMissing.of()
                        private var creditReasonIndicator: JsonField<CreditReasonIndicator> =
                            JsonMissing.of()
                        private var ticketChangeIndicator: JsonField<TicketChangeIndicator> =
                            JsonMissing.of()
                        private var tripLegs: JsonField<List<TripLeg>> = JsonMissing.of()
                        private var ancillary: JsonField<Ancillary> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(travel: Travel) = apply {
                            this.ticketNumber = travel.ticketNumber
                            this.passengerName = travel.passengerName
                            this.departureDate = travel.departureDate
                            this.originationCityAirportCode = travel.originationCityAirportCode
                            this.travelAgencyCode = travel.travelAgencyCode
                            this.travelAgencyName = travel.travelAgencyName
                            this.restrictedTicketIndicator = travel.restrictedTicketIndicator
                            this.computerizedReservationSystem =
                                travel.computerizedReservationSystem
                            this.creditReasonIndicator = travel.creditReasonIndicator
                            this.ticketChangeIndicator = travel.ticketChangeIndicator
                            this.tripLegs = travel.tripLegs
                            this.ancillary = travel.ancillary
                            additionalProperties(travel.additionalProperties)
                        }

                        /** Ticket number. */
                        fun ticketNumber(ticketNumber: String) =
                            ticketNumber(JsonField.of(ticketNumber))

                        /** Ticket number. */
                        @JsonProperty("ticket_number")
                        @ExcludeMissing
                        fun ticketNumber(ticketNumber: JsonField<String>) = apply {
                            this.ticketNumber = ticketNumber
                        }

                        /** Name of the passenger. */
                        fun passengerName(passengerName: String) =
                            passengerName(JsonField.of(passengerName))

                        /** Name of the passenger. */
                        @JsonProperty("passenger_name")
                        @ExcludeMissing
                        fun passengerName(passengerName: JsonField<String>) = apply {
                            this.passengerName = passengerName
                        }

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

                        /** Indicates why a ticket was changed. */
                        fun ticketChangeIndicator(ticketChangeIndicator: TicketChangeIndicator) =
                            ticketChangeIndicator(JsonField.of(ticketChangeIndicator))

                        /** Indicates why a ticket was changed. */
                        @JsonProperty("ticket_change_indicator")
                        @ExcludeMissing
                        fun ticketChangeIndicator(
                            ticketChangeIndicator: JsonField<TicketChangeIndicator>
                        ) = apply { this.ticketChangeIndicator = ticketChangeIndicator }

                        /** Fields specific to each leg of the journey. */
                        fun tripLegs(tripLegs: List<TripLeg>) = tripLegs(JsonField.of(tripLegs))

                        /** Fields specific to each leg of the journey. */
                        @JsonProperty("trip_legs")
                        @ExcludeMissing
                        fun tripLegs(tripLegs: JsonField<List<TripLeg>>) = apply {
                            this.tripLegs = tripLegs
                        }

                        /** Ancillary purchases in addition to the airfare. */
                        fun ancillary(ancillary: Ancillary) = ancillary(JsonField.of(ancillary))

                        /** Ancillary purchases in addition to the airfare. */
                        @JsonProperty("ancillary")
                        @ExcludeMissing
                        fun ancillary(ancillary: JsonField<Ancillary>) = apply {
                            this.ancillary = ancillary
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
                                ticketNumber,
                                passengerName,
                                departureDate,
                                originationCityAirportCode,
                                travelAgencyCode,
                                travelAgencyName,
                                restrictedTicketIndicator,
                                computerizedReservationSystem,
                                creditReasonIndicator,
                                ticketChangeIndicator,
                                tripLegs.map { it.toUnmodifiable() },
                                ancillary,
                                additionalProperties.toUnmodifiable(),
                            )
                    }

                    /** Ancillary purchases in addition to the airfare. */
                    @JsonDeserialize(builder = Ancillary.Builder::class)
                    @NoAutoDetect
                    class Ancillary
                    private constructor(
                        private val ticketDocumentNumber: JsonField<String>,
                        private val passengerNameOrDescription: JsonField<String>,
                        private val connectedTicketDocumentNumber: JsonField<String>,
                        private val creditReasonIndicator: JsonField<CreditReasonIndicator>,
                        private val services: JsonField<List<Service>>,
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        private var validated: Boolean = false

                        private var hashCode: Int = 0

                        /** Ticket document number. */
                        fun ticketDocumentNumber(): Optional<String> =
                            Optional.ofNullable(
                                ticketDocumentNumber.getNullable("ticket_document_number")
                            )

                        /** Name of the passenger or description of the ancillary purchase. */
                        fun passengerNameOrDescription(): Optional<String> =
                            Optional.ofNullable(
                                passengerNameOrDescription.getNullable(
                                    "passenger_name_or_description"
                                )
                            )

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

                        /** Additional travel charges, such as baggage fees. */
                        fun services(): List<Service> = services.getRequired("services")

                        /** Ticket document number. */
                        @JsonProperty("ticket_document_number")
                        @ExcludeMissing
                        fun _ticketDocumentNumber() = ticketDocumentNumber

                        /** Name of the passenger or description of the ancillary purchase. */
                        @JsonProperty("passenger_name_or_description")
                        @ExcludeMissing
                        fun _passengerNameOrDescription() = passengerNameOrDescription

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

                        /** Additional travel charges, such as baggage fees. */
                        @JsonProperty("services") @ExcludeMissing fun _services() = services

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): Ancillary = apply {
                            if (!validated) {
                                ticketDocumentNumber()
                                passengerNameOrDescription()
                                connectedTicketDocumentNumber()
                                creditReasonIndicator()
                                services().forEach { it.validate() }
                                validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Ancillary &&
                                this.ticketDocumentNumber == other.ticketDocumentNumber &&
                                this.passengerNameOrDescription ==
                                    other.passengerNameOrDescription &&
                                this.connectedTicketDocumentNumber ==
                                    other.connectedTicketDocumentNumber &&
                                this.creditReasonIndicator == other.creditReasonIndicator &&
                                this.services == other.services &&
                                this.additionalProperties == other.additionalProperties
                        }

                        override fun hashCode(): Int {
                            if (hashCode == 0) {
                                hashCode =
                                    Objects.hash(
                                        ticketDocumentNumber,
                                        passengerNameOrDescription,
                                        connectedTicketDocumentNumber,
                                        creditReasonIndicator,
                                        services,
                                        additionalProperties,
                                    )
                            }
                            return hashCode
                        }

                        override fun toString() =
                            "Ancillary{ticketDocumentNumber=$ticketDocumentNumber, passengerNameOrDescription=$passengerNameOrDescription, connectedTicketDocumentNumber=$connectedTicketDocumentNumber, creditReasonIndicator=$creditReasonIndicator, services=$services, additionalProperties=$additionalProperties}"

                        companion object {

                            @JvmStatic fun builder() = Builder()
                        }

                        class Builder {

                            private var ticketDocumentNumber: JsonField<String> = JsonMissing.of()
                            private var passengerNameOrDescription: JsonField<String> =
                                JsonMissing.of()
                            private var connectedTicketDocumentNumber: JsonField<String> =
                                JsonMissing.of()
                            private var creditReasonIndicator: JsonField<CreditReasonIndicator> =
                                JsonMissing.of()
                            private var services: JsonField<List<Service>> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(ancillary: Ancillary) = apply {
                                this.ticketDocumentNumber = ancillary.ticketDocumentNumber
                                this.passengerNameOrDescription =
                                    ancillary.passengerNameOrDescription
                                this.connectedTicketDocumentNumber =
                                    ancillary.connectedTicketDocumentNumber
                                this.creditReasonIndicator = ancillary.creditReasonIndicator
                                this.services = ancillary.services
                                additionalProperties(ancillary.additionalProperties)
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

                            /** Additional travel charges, such as baggage fees. */
                            fun services(services: List<Service>) = services(JsonField.of(services))

                            /** Additional travel charges, such as baggage fees. */
                            @JsonProperty("services")
                            @ExcludeMissing
                            fun services(services: JsonField<List<Service>>) = apply {
                                this.services = services
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
                                    ticketDocumentNumber,
                                    passengerNameOrDescription,
                                    connectedTicketDocumentNumber,
                                    creditReasonIndicator,
                                    services.map { it.toUnmodifiable() },
                                    additionalProperties.toUnmodifiable(),
                                )
                        }

                        class CreditReasonIndicator
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
                    ) {

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
                    ) {

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
                    ) {

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
                        private val flightNumber: JsonField<String>,
                        private val carrierCode: JsonField<String>,
                        private val fareBasisCode: JsonField<String>,
                        private val serviceClass: JsonField<String>,
                        private val stopOverCode: JsonField<StopOverCode>,
                        private val destinationCityAirportCode: JsonField<String>,
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        private var validated: Boolean = false

                        private var hashCode: Int = 0

                        /** Flight number. */
                        fun flightNumber(): Optional<String> =
                            Optional.ofNullable(flightNumber.getNullable("flight_number"))

                        /** Carrier code (e.g., United Airlines, Jet Blue, etc.). */
                        fun carrierCode(): Optional<String> =
                            Optional.ofNullable(carrierCode.getNullable("carrier_code"))

                        /** Fare basis code. */
                        fun fareBasisCode(): Optional<String> =
                            Optional.ofNullable(fareBasisCode.getNullable("fare_basis_code"))

                        /** Service class (e.g., first class, business class, etc.). */
                        fun serviceClass(): Optional<String> =
                            Optional.ofNullable(serviceClass.getNullable("service_class"))

                        /** Indicates whether a stopover is allowed on this ticket. */
                        fun stopOverCode(): Optional<StopOverCode> =
                            Optional.ofNullable(stopOverCode.getNullable("stop_over_code"))

                        /** Code for the destination city or airport. */
                        fun destinationCityAirportCode(): Optional<String> =
                            Optional.ofNullable(
                                destinationCityAirportCode.getNullable(
                                    "destination_city_airport_code"
                                )
                            )

                        /** Flight number. */
                        @JsonProperty("flight_number")
                        @ExcludeMissing
                        fun _flightNumber() = flightNumber

                        /** Carrier code (e.g., United Airlines, Jet Blue, etc.). */
                        @JsonProperty("carrier_code")
                        @ExcludeMissing
                        fun _carrierCode() = carrierCode

                        /** Fare basis code. */
                        @JsonProperty("fare_basis_code")
                        @ExcludeMissing
                        fun _fareBasisCode() = fareBasisCode

                        /** Service class (e.g., first class, business class, etc.). */
                        @JsonProperty("service_class")
                        @ExcludeMissing
                        fun _serviceClass() = serviceClass

                        /** Indicates whether a stopover is allowed on this ticket. */
                        @JsonProperty("stop_over_code")
                        @ExcludeMissing
                        fun _stopOverCode() = stopOverCode

                        /** Code for the destination city or airport. */
                        @JsonProperty("destination_city_airport_code")
                        @ExcludeMissing
                        fun _destinationCityAirportCode() = destinationCityAirportCode

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): TripLeg = apply {
                            if (!validated) {
                                flightNumber()
                                carrierCode()
                                fareBasisCode()
                                serviceClass()
                                stopOverCode()
                                destinationCityAirportCode()
                                validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is TripLeg &&
                                this.flightNumber == other.flightNumber &&
                                this.carrierCode == other.carrierCode &&
                                this.fareBasisCode == other.fareBasisCode &&
                                this.serviceClass == other.serviceClass &&
                                this.stopOverCode == other.stopOverCode &&
                                this.destinationCityAirportCode ==
                                    other.destinationCityAirportCode &&
                                this.additionalProperties == other.additionalProperties
                        }

                        override fun hashCode(): Int {
                            if (hashCode == 0) {
                                hashCode =
                                    Objects.hash(
                                        flightNumber,
                                        carrierCode,
                                        fareBasisCode,
                                        serviceClass,
                                        stopOverCode,
                                        destinationCityAirportCode,
                                        additionalProperties,
                                    )
                            }
                            return hashCode
                        }

                        override fun toString() =
                            "TripLeg{flightNumber=$flightNumber, carrierCode=$carrierCode, fareBasisCode=$fareBasisCode, serviceClass=$serviceClass, stopOverCode=$stopOverCode, destinationCityAirportCode=$destinationCityAirportCode, additionalProperties=$additionalProperties}"

                        companion object {

                            @JvmStatic fun builder() = Builder()
                        }

                        class Builder {

                            private var flightNumber: JsonField<String> = JsonMissing.of()
                            private var carrierCode: JsonField<String> = JsonMissing.of()
                            private var fareBasisCode: JsonField<String> = JsonMissing.of()
                            private var serviceClass: JsonField<String> = JsonMissing.of()
                            private var stopOverCode: JsonField<StopOverCode> = JsonMissing.of()
                            private var destinationCityAirportCode: JsonField<String> =
                                JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(tripLeg: TripLeg) = apply {
                                this.flightNumber = tripLeg.flightNumber
                                this.carrierCode = tripLeg.carrierCode
                                this.fareBasisCode = tripLeg.fareBasisCode
                                this.serviceClass = tripLeg.serviceClass
                                this.stopOverCode = tripLeg.stopOverCode
                                this.destinationCityAirportCode = tripLeg.destinationCityAirportCode
                                additionalProperties(tripLeg.additionalProperties)
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

                            /** Carrier code (e.g., United Airlines, Jet Blue, etc.). */
                            fun carrierCode(carrierCode: String) =
                                carrierCode(JsonField.of(carrierCode))

                            /** Carrier code (e.g., United Airlines, Jet Blue, etc.). */
                            @JsonProperty("carrier_code")
                            @ExcludeMissing
                            fun carrierCode(carrierCode: JsonField<String>) = apply {
                                this.carrierCode = carrierCode
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
                                    flightNumber,
                                    carrierCode,
                                    fareBasisCode,
                                    serviceClass,
                                    stopOverCode,
                                    destinationCityAirportCode,
                                    additionalProperties.toUnmodifiable(),
                                )
                        }

                        class StopOverCode
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
         * A Card Validation object. This field will be present in the JSON response if and only if
         * `category` is equal to `card_validation`.
         */
        @JsonDeserialize(builder = CardValidation.Builder::class)
        @NoAutoDetect
        class CardValidation
        private constructor(
            private val id: JsonField<String>,
            private val cardPaymentId: JsonField<String>,
            private val merchantAcceptorId: JsonField<String>,
            private val merchantDescriptor: JsonField<String>,
            private val merchantCategoryCode: JsonField<String>,
            private val merchantCity: JsonField<String>,
            private val merchantCountry: JsonField<String>,
            private val digitalWalletTokenId: JsonField<String>,
            private val physicalCardId: JsonField<String>,
            private val networkDetails: JsonField<NetworkDetails>,
            private val currency: JsonField<Currency>,
            private val realTimeDecisionId: JsonField<String>,
            private val type: JsonField<Type>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** The Card Validation identifier. */
            fun id(): String = id.getRequired("id")

            /** The ID of the Card Payment this transaction belongs to. */
            fun cardPaymentId(): Optional<String> =
                Optional.ofNullable(cardPaymentId.getNullable("card_payment_id"))

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

            /** Fields specific to the `network`. */
            fun networkDetails(): NetworkDetails = networkDetails.getRequired("network_details")

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
             * currency.
             */
            fun currency(): Currency = currency.getRequired("currency")

            /**
             * The identifier of the Real-Time Decision sent to approve or decline this transaction.
             */
            fun realTimeDecisionId(): Optional<String> =
                Optional.ofNullable(realTimeDecisionId.getNullable("real_time_decision_id"))

            /**
             * A constant representing the object's type. For this resource it will always be
             * `card_validation`.
             */
            fun type(): Type = type.getRequired("type")

            /** The Card Validation identifier. */
            @JsonProperty("id") @ExcludeMissing fun _id() = id

            /** The ID of the Card Payment this transaction belongs to. */
            @JsonProperty("card_payment_id") @ExcludeMissing fun _cardPaymentId() = cardPaymentId

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

            /** Fields specific to the `network`. */
            @JsonProperty("network_details") @ExcludeMissing fun _networkDetails() = networkDetails

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
             * currency.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            /**
             * The identifier of the Real-Time Decision sent to approve or decline this transaction.
             */
            @JsonProperty("real_time_decision_id")
            @ExcludeMissing
            fun _realTimeDecisionId() = realTimeDecisionId

            /**
             * A constant representing the object's type. For this resource it will always be
             * `card_validation`.
             */
            @JsonProperty("type") @ExcludeMissing fun _type() = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): CardValidation = apply {
                if (!validated) {
                    id()
                    cardPaymentId()
                    merchantAcceptorId()
                    merchantDescriptor()
                    merchantCategoryCode()
                    merchantCity()
                    merchantCountry()
                    digitalWalletTokenId()
                    physicalCardId()
                    networkDetails().validate()
                    currency()
                    realTimeDecisionId()
                    type()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CardValidation &&
                    this.id == other.id &&
                    this.cardPaymentId == other.cardPaymentId &&
                    this.merchantAcceptorId == other.merchantAcceptorId &&
                    this.merchantDescriptor == other.merchantDescriptor &&
                    this.merchantCategoryCode == other.merchantCategoryCode &&
                    this.merchantCity == other.merchantCity &&
                    this.merchantCountry == other.merchantCountry &&
                    this.digitalWalletTokenId == other.digitalWalletTokenId &&
                    this.physicalCardId == other.physicalCardId &&
                    this.networkDetails == other.networkDetails &&
                    this.currency == other.currency &&
                    this.realTimeDecisionId == other.realTimeDecisionId &&
                    this.type == other.type &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            id,
                            cardPaymentId,
                            merchantAcceptorId,
                            merchantDescriptor,
                            merchantCategoryCode,
                            merchantCity,
                            merchantCountry,
                            digitalWalletTokenId,
                            physicalCardId,
                            networkDetails,
                            currency,
                            realTimeDecisionId,
                            type,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "CardValidation{id=$id, cardPaymentId=$cardPaymentId, merchantAcceptorId=$merchantAcceptorId, merchantDescriptor=$merchantDescriptor, merchantCategoryCode=$merchantCategoryCode, merchantCity=$merchantCity, merchantCountry=$merchantCountry, digitalWalletTokenId=$digitalWalletTokenId, physicalCardId=$physicalCardId, networkDetails=$networkDetails, currency=$currency, realTimeDecisionId=$realTimeDecisionId, type=$type, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var cardPaymentId: JsonField<String> = JsonMissing.of()
                private var merchantAcceptorId: JsonField<String> = JsonMissing.of()
                private var merchantDescriptor: JsonField<String> = JsonMissing.of()
                private var merchantCategoryCode: JsonField<String> = JsonMissing.of()
                private var merchantCity: JsonField<String> = JsonMissing.of()
                private var merchantCountry: JsonField<String> = JsonMissing.of()
                private var digitalWalletTokenId: JsonField<String> = JsonMissing.of()
                private var physicalCardId: JsonField<String> = JsonMissing.of()
                private var networkDetails: JsonField<NetworkDetails> = JsonMissing.of()
                private var currency: JsonField<Currency> = JsonMissing.of()
                private var realTimeDecisionId: JsonField<String> = JsonMissing.of()
                private var type: JsonField<Type> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(cardValidation: CardValidation) = apply {
                    this.id = cardValidation.id
                    this.cardPaymentId = cardValidation.cardPaymentId
                    this.merchantAcceptorId = cardValidation.merchantAcceptorId
                    this.merchantDescriptor = cardValidation.merchantDescriptor
                    this.merchantCategoryCode = cardValidation.merchantCategoryCode
                    this.merchantCity = cardValidation.merchantCity
                    this.merchantCountry = cardValidation.merchantCountry
                    this.digitalWalletTokenId = cardValidation.digitalWalletTokenId
                    this.physicalCardId = cardValidation.physicalCardId
                    this.networkDetails = cardValidation.networkDetails
                    this.currency = cardValidation.currency
                    this.realTimeDecisionId = cardValidation.realTimeDecisionId
                    this.type = cardValidation.type
                    additionalProperties(cardValidation.additionalProperties)
                }

                /** The Card Validation identifier. */
                fun id(id: String) = id(JsonField.of(id))

                /** The Card Validation identifier. */
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

                /** Fields specific to the `network`. */
                fun networkDetails(networkDetails: NetworkDetails) =
                    networkDetails(JsonField.of(networkDetails))

                /** Fields specific to the `network`. */
                @JsonProperty("network_details")
                @ExcludeMissing
                fun networkDetails(networkDetails: JsonField<NetworkDetails>) = apply {
                    this.networkDetails = networkDetails
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
                 * `card_validation`.
                 */
                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * A constant representing the object's type. For this resource it will always be
                 * `card_validation`.
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

                fun build(): CardValidation =
                    CardValidation(
                        id,
                        cardPaymentId,
                        merchantAcceptorId,
                        merchantDescriptor,
                        merchantCategoryCode,
                        merchantCity,
                        merchantCountry,
                        digitalWalletTokenId,
                        physicalCardId,
                        networkDetails,
                        currency,
                        realTimeDecisionId,
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

                    @JvmField val CARD_VALIDATION = Type(JsonField.of("card_validation"))

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                enum class Known {
                    CARD_VALIDATION,
                }

                enum class Value {
                    CARD_VALIDATION,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        CARD_VALIDATION -> Value.CARD_VALIDATION
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        CARD_VALIDATION -> Known.CARD_VALIDATION
                        else -> throw IncreaseInvalidDataException("Unknown Type: $value")
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

                @JvmField val CARD_AUTHORIZATION = Category(JsonField.of("card_authorization"))

                @JvmField val CARD_VALIDATION = Category(JsonField.of("card_validation"))

                @JvmField val CARD_DECLINE = Category(JsonField.of("card_decline"))

                @JvmField val CARD_REVERSAL = Category(JsonField.of("card_reversal"))

                @JvmField
                val CARD_AUTHORIZATION_EXPIRATION =
                    Category(JsonField.of("card_authorization_expiration"))

                @JvmField val CARD_INCREMENT = Category(JsonField.of("card_increment"))

                @JvmField val CARD_SETTLEMENT = Category(JsonField.of("card_settlement"))

                @JvmField val CARD_REFUND = Category(JsonField.of("card_refund"))

                @JvmField val OTHER = Category(JsonField.of("other"))

                @JvmStatic fun of(value: String) = Category(JsonField.of(value))
            }

            enum class Known {
                CARD_AUTHORIZATION,
                CARD_VALIDATION,
                CARD_DECLINE,
                CARD_REVERSAL,
                CARD_AUTHORIZATION_EXPIRATION,
                CARD_INCREMENT,
                CARD_SETTLEMENT,
                CARD_REFUND,
                OTHER,
            }

            enum class Value {
                CARD_AUTHORIZATION,
                CARD_VALIDATION,
                CARD_DECLINE,
                CARD_REVERSAL,
                CARD_AUTHORIZATION_EXPIRATION,
                CARD_INCREMENT,
                CARD_SETTLEMENT,
                CARD_REFUND,
                OTHER,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    CARD_AUTHORIZATION -> Value.CARD_AUTHORIZATION
                    CARD_VALIDATION -> Value.CARD_VALIDATION
                    CARD_DECLINE -> Value.CARD_DECLINE
                    CARD_REVERSAL -> Value.CARD_REVERSAL
                    CARD_AUTHORIZATION_EXPIRATION -> Value.CARD_AUTHORIZATION_EXPIRATION
                    CARD_INCREMENT -> Value.CARD_INCREMENT
                    CARD_SETTLEMENT -> Value.CARD_SETTLEMENT
                    CARD_REFUND -> Value.CARD_REFUND
                    OTHER -> Value.OTHER
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    CARD_AUTHORIZATION -> Known.CARD_AUTHORIZATION
                    CARD_VALIDATION -> Known.CARD_VALIDATION
                    CARD_DECLINE -> Known.CARD_DECLINE
                    CARD_REVERSAL -> Known.CARD_REVERSAL
                    CARD_AUTHORIZATION_EXPIRATION -> Known.CARD_AUTHORIZATION_EXPIRATION
                    CARD_INCREMENT -> Known.CARD_INCREMENT
                    CARD_SETTLEMENT -> Known.CARD_SETTLEMENT
                    CARD_REFUND -> Known.CARD_REFUND
                    OTHER -> Known.OTHER
                    else -> throw IncreaseInvalidDataException("Unknown Category: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }
    }

    /** The summarized state of this card payment. */
    @JsonDeserialize(builder = State.Builder::class)
    @NoAutoDetect
    class State
    private constructor(
        private val authorizedAmount: JsonField<Long>,
        private val incrementedAmount: JsonField<Long>,
        private val reversedAmount: JsonField<Long>,
        private val settledAmount: JsonField<Long>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /**
         * The total authorized amount in the minor unit of the transaction's currency. For dollars,
         * for example, this is cents.
         */
        fun authorizedAmount(): Long = authorizedAmount.getRequired("authorized_amount")

        /**
         * The total incrementally updated authorized amount in the minor unit of the transaction's
         * currency. For dollars, for example, this is cents.
         */
        fun incrementedAmount(): Long = incrementedAmount.getRequired("incremented_amount")

        /**
         * The total reversed amount in the minor unit of the transaction's currency. For dollars,
         * for example, this is cents.
         */
        fun reversedAmount(): Long = reversedAmount.getRequired("reversed_amount")

        /**
         * The total settled or refunded amount in the minor unit of the transaction's currency. For
         * dollars, for example, this is cents.
         */
        fun settledAmount(): Long = settledAmount.getRequired("settled_amount")

        /**
         * The total authorized amount in the minor unit of the transaction's currency. For dollars,
         * for example, this is cents.
         */
        @JsonProperty("authorized_amount")
        @ExcludeMissing
        fun _authorizedAmount() = authorizedAmount

        /**
         * The total incrementally updated authorized amount in the minor unit of the transaction's
         * currency. For dollars, for example, this is cents.
         */
        @JsonProperty("incremented_amount")
        @ExcludeMissing
        fun _incrementedAmount() = incrementedAmount

        /**
         * The total reversed amount in the minor unit of the transaction's currency. For dollars,
         * for example, this is cents.
         */
        @JsonProperty("reversed_amount") @ExcludeMissing fun _reversedAmount() = reversedAmount

        /**
         * The total settled or refunded amount in the minor unit of the transaction's currency. For
         * dollars, for example, this is cents.
         */
        @JsonProperty("settled_amount") @ExcludeMissing fun _settledAmount() = settledAmount

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): State = apply {
            if (!validated) {
                authorizedAmount()
                incrementedAmount()
                reversedAmount()
                settledAmount()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is State &&
                this.authorizedAmount == other.authorizedAmount &&
                this.incrementedAmount == other.incrementedAmount &&
                this.reversedAmount == other.reversedAmount &&
                this.settledAmount == other.settledAmount &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        authorizedAmount,
                        incrementedAmount,
                        reversedAmount,
                        settledAmount,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "State{authorizedAmount=$authorizedAmount, incrementedAmount=$incrementedAmount, reversedAmount=$reversedAmount, settledAmount=$settledAmount, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var authorizedAmount: JsonField<Long> = JsonMissing.of()
            private var incrementedAmount: JsonField<Long> = JsonMissing.of()
            private var reversedAmount: JsonField<Long> = JsonMissing.of()
            private var settledAmount: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(state: State) = apply {
                this.authorizedAmount = state.authorizedAmount
                this.incrementedAmount = state.incrementedAmount
                this.reversedAmount = state.reversedAmount
                this.settledAmount = state.settledAmount
                additionalProperties(state.additionalProperties)
            }

            /**
             * The total authorized amount in the minor unit of the transaction's currency. For
             * dollars, for example, this is cents.
             */
            fun authorizedAmount(authorizedAmount: Long) =
                authorizedAmount(JsonField.of(authorizedAmount))

            /**
             * The total authorized amount in the minor unit of the transaction's currency. For
             * dollars, for example, this is cents.
             */
            @JsonProperty("authorized_amount")
            @ExcludeMissing
            fun authorizedAmount(authorizedAmount: JsonField<Long>) = apply {
                this.authorizedAmount = authorizedAmount
            }

            /**
             * The total incrementally updated authorized amount in the minor unit of the
             * transaction's currency. For dollars, for example, this is cents.
             */
            fun incrementedAmount(incrementedAmount: Long) =
                incrementedAmount(JsonField.of(incrementedAmount))

            /**
             * The total incrementally updated authorized amount in the minor unit of the
             * transaction's currency. For dollars, for example, this is cents.
             */
            @JsonProperty("incremented_amount")
            @ExcludeMissing
            fun incrementedAmount(incrementedAmount: JsonField<Long>) = apply {
                this.incrementedAmount = incrementedAmount
            }

            /**
             * The total reversed amount in the minor unit of the transaction's currency. For
             * dollars, for example, this is cents.
             */
            fun reversedAmount(reversedAmount: Long) = reversedAmount(JsonField.of(reversedAmount))

            /**
             * The total reversed amount in the minor unit of the transaction's currency. For
             * dollars, for example, this is cents.
             */
            @JsonProperty("reversed_amount")
            @ExcludeMissing
            fun reversedAmount(reversedAmount: JsonField<Long>) = apply {
                this.reversedAmount = reversedAmount
            }

            /**
             * The total settled or refunded amount in the minor unit of the transaction's currency.
             * For dollars, for example, this is cents.
             */
            fun settledAmount(settledAmount: Long) = settledAmount(JsonField.of(settledAmount))

            /**
             * The total settled or refunded amount in the minor unit of the transaction's currency.
             * For dollars, for example, this is cents.
             */
            @JsonProperty("settled_amount")
            @ExcludeMissing
            fun settledAmount(settledAmount: JsonField<Long>) = apply {
                this.settledAmount = settledAmount
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

            fun build(): State =
                State(
                    authorizedAmount,
                    incrementedAmount,
                    reversedAmount,
                    settledAmount,
                    additionalProperties.toUnmodifiable(),
                )
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

            @JvmField val CARD_PAYMENT = Type(JsonField.of("card_payment"))

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            CARD_PAYMENT,
        }

        enum class Value {
            CARD_PAYMENT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                CARD_PAYMENT -> Value.CARD_PAYMENT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                CARD_PAYMENT -> Known.CARD_PAYMENT
                else -> throw IncreaseInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
