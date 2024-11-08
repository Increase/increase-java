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
 * Real Time Decisions are created when your application needs to take action in real-time to some
 * event such as a card authorization. For more information, see our
 * [Real-Time Decisions guide](https://increase.com/documentation/real-time-decisions).
 */
@JsonDeserialize(builder = RealTimeDecision.Builder::class)
@NoAutoDetect
class RealTimeDecision
private constructor(
    private val cardAuthentication: JsonField<CardAuthentication>,
    private val cardAuthenticationChallenge: JsonField<CardAuthenticationChallenge>,
    private val cardAuthorization: JsonField<CardAuthorization>,
    private val category: JsonField<Category>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val digitalWalletAuthentication: JsonField<DigitalWalletAuthentication>,
    private val digitalWalletToken: JsonField<DigitalWalletToken>,
    private val id: JsonField<String>,
    private val status: JsonField<Status>,
    private val timeoutAt: JsonField<OffsetDateTime>,
    private val type: JsonField<Type>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /** Fields related to a 3DS authentication attempt. */
    fun cardAuthentication(): Optional<CardAuthentication> =
        Optional.ofNullable(cardAuthentication.getNullable("card_authentication"))

    /** Fields related to a 3DS authentication attempt. */
    fun cardAuthenticationChallenge(): Optional<CardAuthenticationChallenge> =
        Optional.ofNullable(
            cardAuthenticationChallenge.getNullable("card_authentication_challenge")
        )

    /** Fields related to a card authorization. */
    fun cardAuthorization(): Optional<CardAuthorization> =
        Optional.ofNullable(cardAuthorization.getNullable("card_authorization"))

    /** The category of the Real-Time Decision. */
    fun category(): Category = category.getRequired("category")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the Real-Time
     * Decision was created.
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** Fields related to a digital wallet authentication attempt. */
    fun digitalWalletAuthentication(): Optional<DigitalWalletAuthentication> =
        Optional.ofNullable(
            digitalWalletAuthentication.getNullable("digital_wallet_authentication")
        )

    /** Fields related to a digital wallet token provisioning attempt. */
    fun digitalWalletToken(): Optional<DigitalWalletToken> =
        Optional.ofNullable(digitalWalletToken.getNullable("digital_wallet_token"))

    /** The Real-Time Decision identifier. */
    fun id(): String = id.getRequired("id")

    /** The status of the Real-Time Decision. */
    fun status(): Status = status.getRequired("status")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which your
     * application can no longer respond to the Real-Time Decision.
     */
    fun timeoutAt(): OffsetDateTime = timeoutAt.getRequired("timeout_at")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `real_time_decision`.
     */
    fun type(): Type = type.getRequired("type")

    /** Fields related to a 3DS authentication attempt. */
    @JsonProperty("card_authentication")
    @ExcludeMissing
    fun _cardAuthentication() = cardAuthentication

    /** Fields related to a 3DS authentication attempt. */
    @JsonProperty("card_authentication_challenge")
    @ExcludeMissing
    fun _cardAuthenticationChallenge() = cardAuthenticationChallenge

    /** Fields related to a card authorization. */
    @JsonProperty("card_authorization") @ExcludeMissing fun _cardAuthorization() = cardAuthorization

    /** The category of the Real-Time Decision. */
    @JsonProperty("category") @ExcludeMissing fun _category() = category

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the Real-Time
     * Decision was created.
     */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    /** Fields related to a digital wallet authentication attempt. */
    @JsonProperty("digital_wallet_authentication")
    @ExcludeMissing
    fun _digitalWalletAuthentication() = digitalWalletAuthentication

    /** Fields related to a digital wallet token provisioning attempt. */
    @JsonProperty("digital_wallet_token")
    @ExcludeMissing
    fun _digitalWalletToken() = digitalWalletToken

    /** The Real-Time Decision identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /** The status of the Real-Time Decision. */
    @JsonProperty("status") @ExcludeMissing fun _status() = status

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which your
     * application can no longer respond to the Real-Time Decision.
     */
    @JsonProperty("timeout_at") @ExcludeMissing fun _timeoutAt() = timeoutAt

    /**
     * A constant representing the object's type. For this resource it will always be
     * `real_time_decision`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): RealTimeDecision = apply {
        if (!validated) {
            cardAuthentication().map { it.validate() }
            cardAuthenticationChallenge().map { it.validate() }
            cardAuthorization().map { it.validate() }
            category()
            createdAt()
            digitalWalletAuthentication().map { it.validate() }
            digitalWalletToken().map { it.validate() }
            id()
            status()
            timeoutAt()
            type()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var cardAuthentication: JsonField<CardAuthentication> = JsonMissing.of()
        private var cardAuthenticationChallenge: JsonField<CardAuthenticationChallenge> =
            JsonMissing.of()
        private var cardAuthorization: JsonField<CardAuthorization> = JsonMissing.of()
        private var category: JsonField<Category> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var digitalWalletAuthentication: JsonField<DigitalWalletAuthentication> =
            JsonMissing.of()
        private var digitalWalletToken: JsonField<DigitalWalletToken> = JsonMissing.of()
        private var id: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var timeoutAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(realTimeDecision: RealTimeDecision) = apply {
            this.cardAuthentication = realTimeDecision.cardAuthentication
            this.cardAuthenticationChallenge = realTimeDecision.cardAuthenticationChallenge
            this.cardAuthorization = realTimeDecision.cardAuthorization
            this.category = realTimeDecision.category
            this.createdAt = realTimeDecision.createdAt
            this.digitalWalletAuthentication = realTimeDecision.digitalWalletAuthentication
            this.digitalWalletToken = realTimeDecision.digitalWalletToken
            this.id = realTimeDecision.id
            this.status = realTimeDecision.status
            this.timeoutAt = realTimeDecision.timeoutAt
            this.type = realTimeDecision.type
            additionalProperties(realTimeDecision.additionalProperties)
        }

        /** Fields related to a 3DS authentication attempt. */
        fun cardAuthentication(cardAuthentication: CardAuthentication) =
            cardAuthentication(JsonField.of(cardAuthentication))

        /** Fields related to a 3DS authentication attempt. */
        @JsonProperty("card_authentication")
        @ExcludeMissing
        fun cardAuthentication(cardAuthentication: JsonField<CardAuthentication>) = apply {
            this.cardAuthentication = cardAuthentication
        }

        /** Fields related to a 3DS authentication attempt. */
        fun cardAuthenticationChallenge(cardAuthenticationChallenge: CardAuthenticationChallenge) =
            cardAuthenticationChallenge(JsonField.of(cardAuthenticationChallenge))

        /** Fields related to a 3DS authentication attempt. */
        @JsonProperty("card_authentication_challenge")
        @ExcludeMissing
        fun cardAuthenticationChallenge(
            cardAuthenticationChallenge: JsonField<CardAuthenticationChallenge>
        ) = apply { this.cardAuthenticationChallenge = cardAuthenticationChallenge }

        /** Fields related to a card authorization. */
        fun cardAuthorization(cardAuthorization: CardAuthorization) =
            cardAuthorization(JsonField.of(cardAuthorization))

        /** Fields related to a card authorization. */
        @JsonProperty("card_authorization")
        @ExcludeMissing
        fun cardAuthorization(cardAuthorization: JsonField<CardAuthorization>) = apply {
            this.cardAuthorization = cardAuthorization
        }

        /** The category of the Real-Time Decision. */
        fun category(category: Category) = category(JsonField.of(category))

        /** The category of the Real-Time Decision. */
        @JsonProperty("category")
        @ExcludeMissing
        fun category(category: JsonField<Category>) = apply { this.category = category }

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

        /** Fields related to a digital wallet authentication attempt. */
        fun digitalWalletAuthentication(digitalWalletAuthentication: DigitalWalletAuthentication) =
            digitalWalletAuthentication(JsonField.of(digitalWalletAuthentication))

        /** Fields related to a digital wallet authentication attempt. */
        @JsonProperty("digital_wallet_authentication")
        @ExcludeMissing
        fun digitalWalletAuthentication(
            digitalWalletAuthentication: JsonField<DigitalWalletAuthentication>
        ) = apply { this.digitalWalletAuthentication = digitalWalletAuthentication }

        /** Fields related to a digital wallet token provisioning attempt. */
        fun digitalWalletToken(digitalWalletToken: DigitalWalletToken) =
            digitalWalletToken(JsonField.of(digitalWalletToken))

        /** Fields related to a digital wallet token provisioning attempt. */
        @JsonProperty("digital_wallet_token")
        @ExcludeMissing
        fun digitalWalletToken(digitalWalletToken: JsonField<DigitalWalletToken>) = apply {
            this.digitalWalletToken = digitalWalletToken
        }

        /** The Real-Time Decision identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The Real-Time Decision identifier. */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        /** The status of the Real-Time Decision. */
        fun status(status: Status) = status(JsonField.of(status))

        /** The status of the Real-Time Decision. */
        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<Status>) = apply { this.status = status }

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
                cardAuthentication,
                cardAuthenticationChallenge,
                cardAuthorization,
                category,
                createdAt,
                digitalWalletAuthentication,
                digitalWalletToken,
                id,
                status,
                timeoutAt,
                type,
                additionalProperties.toImmutable(),
            )
    }

    /** Fields related to a 3DS authentication attempt. */
    @JsonDeserialize(builder = CardAuthentication.Builder::class)
    @NoAutoDetect
    class CardAuthentication
    private constructor(
        private val accountId: JsonField<String>,
        private val cardId: JsonField<String>,
        private val decision: JsonField<Decision>,
        private val upcomingCardPaymentId: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        /** The identifier of the Account the card belongs to. */
        fun accountId(): String = accountId.getRequired("account_id")

        /** The identifier of the Card that is being tokenized. */
        fun cardId(): String = cardId.getRequired("card_id")

        /** Whether or not the authentication attempt was approved. */
        fun decision(): Optional<Decision> = Optional.ofNullable(decision.getNullable("decision"))

        /**
         * The identifier of the Card Payment this authentication attempt will belong to. Available
         * in the API once the card authentication has completed.
         */
        fun upcomingCardPaymentId(): String =
            upcomingCardPaymentId.getRequired("upcoming_card_payment_id")

        /** The identifier of the Account the card belongs to. */
        @JsonProperty("account_id") @ExcludeMissing fun _accountId() = accountId

        /** The identifier of the Card that is being tokenized. */
        @JsonProperty("card_id") @ExcludeMissing fun _cardId() = cardId

        /** Whether or not the authentication attempt was approved. */
        @JsonProperty("decision") @ExcludeMissing fun _decision() = decision

        /**
         * The identifier of the Card Payment this authentication attempt will belong to. Available
         * in the API once the card authentication has completed.
         */
        @JsonProperty("upcoming_card_payment_id")
        @ExcludeMissing
        fun _upcomingCardPaymentId() = upcomingCardPaymentId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): CardAuthentication = apply {
            if (!validated) {
                accountId()
                cardId()
                decision()
                upcomingCardPaymentId()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var accountId: JsonField<String> = JsonMissing.of()
            private var cardId: JsonField<String> = JsonMissing.of()
            private var decision: JsonField<Decision> = JsonMissing.of()
            private var upcomingCardPaymentId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(cardAuthentication: CardAuthentication) = apply {
                this.accountId = cardAuthentication.accountId
                this.cardId = cardAuthentication.cardId
                this.decision = cardAuthentication.decision
                this.upcomingCardPaymentId = cardAuthentication.upcomingCardPaymentId
                additionalProperties(cardAuthentication.additionalProperties)
            }

            /** The identifier of the Account the card belongs to. */
            fun accountId(accountId: String) = accountId(JsonField.of(accountId))

            /** The identifier of the Account the card belongs to. */
            @JsonProperty("account_id")
            @ExcludeMissing
            fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

            /** The identifier of the Card that is being tokenized. */
            fun cardId(cardId: String) = cardId(JsonField.of(cardId))

            /** The identifier of the Card that is being tokenized. */
            @JsonProperty("card_id")
            @ExcludeMissing
            fun cardId(cardId: JsonField<String>) = apply { this.cardId = cardId }

            /** Whether or not the authentication attempt was approved. */
            fun decision(decision: Decision) = decision(JsonField.of(decision))

            /** Whether or not the authentication attempt was approved. */
            @JsonProperty("decision")
            @ExcludeMissing
            fun decision(decision: JsonField<Decision>) = apply { this.decision = decision }

            /**
             * The identifier of the Card Payment this authentication attempt will belong to.
             * Available in the API once the card authentication has completed.
             */
            fun upcomingCardPaymentId(upcomingCardPaymentId: String) =
                upcomingCardPaymentId(JsonField.of(upcomingCardPaymentId))

            /**
             * The identifier of the Card Payment this authentication attempt will belong to.
             * Available in the API once the card authentication has completed.
             */
            @JsonProperty("upcoming_card_payment_id")
            @ExcludeMissing
            fun upcomingCardPaymentId(upcomingCardPaymentId: JsonField<String>) = apply {
                this.upcomingCardPaymentId = upcomingCardPaymentId
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

            fun build(): CardAuthentication =
                CardAuthentication(
                    accountId,
                    cardId,
                    decision,
                    upcomingCardPaymentId,
                    additionalProperties.toImmutable(),
                )
        }

        class Decision
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Decision && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val APPROVE = Decision(JsonField.of("approve"))

                @JvmField val CHALLENGE = Decision(JsonField.of("challenge"))

                @JvmField val DENY = Decision(JsonField.of("deny"))

                @JvmStatic fun of(value: String) = Decision(JsonField.of(value))
            }

            enum class Known {
                APPROVE,
                CHALLENGE,
                DENY,
            }

            enum class Value {
                APPROVE,
                CHALLENGE,
                DENY,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    APPROVE -> Value.APPROVE
                    CHALLENGE -> Value.CHALLENGE
                    DENY -> Value.DENY
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    APPROVE -> Known.APPROVE
                    CHALLENGE -> Known.CHALLENGE
                    DENY -> Known.DENY
                    else -> throw IncreaseInvalidDataException("Unknown Decision: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CardAuthentication && this.accountId == other.accountId && this.cardId == other.cardId && this.decision == other.decision && this.upcomingCardPaymentId == other.upcomingCardPaymentId && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(accountId, cardId, decision, upcomingCardPaymentId, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "CardAuthentication{accountId=$accountId, cardId=$cardId, decision=$decision, upcomingCardPaymentId=$upcomingCardPaymentId, additionalProperties=$additionalProperties}"
    }

    /** Fields related to a 3DS authentication attempt. */
    @JsonDeserialize(builder = CardAuthenticationChallenge.Builder::class)
    @NoAutoDetect
    class CardAuthenticationChallenge
    private constructor(
        private val accountId: JsonField<String>,
        private val cardId: JsonField<String>,
        private val cardPaymentId: JsonField<String>,
        private val oneTimeCode: JsonField<String>,
        private val result: JsonField<Result>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        /** The identifier of the Account the card belongs to. */
        fun accountId(): String = accountId.getRequired("account_id")

        /** The identifier of the Card that is being tokenized. */
        fun cardId(): String = cardId.getRequired("card_id")

        /** The identifier of the Card Payment this authentication challenge attempt belongs to. */
        fun cardPaymentId(): String = cardPaymentId.getRequired("card_payment_id")

        /** The one-time code delivered to the cardholder. */
        fun oneTimeCode(): String = oneTimeCode.getRequired("one_time_code")

        /** Whether or not the challenge was delivered to the cardholder. */
        fun result(): Optional<Result> = Optional.ofNullable(result.getNullable("result"))

        /** The identifier of the Account the card belongs to. */
        @JsonProperty("account_id") @ExcludeMissing fun _accountId() = accountId

        /** The identifier of the Card that is being tokenized. */
        @JsonProperty("card_id") @ExcludeMissing fun _cardId() = cardId

        /** The identifier of the Card Payment this authentication challenge attempt belongs to. */
        @JsonProperty("card_payment_id") @ExcludeMissing fun _cardPaymentId() = cardPaymentId

        /** The one-time code delivered to the cardholder. */
        @JsonProperty("one_time_code") @ExcludeMissing fun _oneTimeCode() = oneTimeCode

        /** Whether or not the challenge was delivered to the cardholder. */
        @JsonProperty("result") @ExcludeMissing fun _result() = result

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): CardAuthenticationChallenge = apply {
            if (!validated) {
                accountId()
                cardId()
                cardPaymentId()
                oneTimeCode()
                result()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var accountId: JsonField<String> = JsonMissing.of()
            private var cardId: JsonField<String> = JsonMissing.of()
            private var cardPaymentId: JsonField<String> = JsonMissing.of()
            private var oneTimeCode: JsonField<String> = JsonMissing.of()
            private var result: JsonField<Result> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(cardAuthenticationChallenge: CardAuthenticationChallenge) = apply {
                this.accountId = cardAuthenticationChallenge.accountId
                this.cardId = cardAuthenticationChallenge.cardId
                this.cardPaymentId = cardAuthenticationChallenge.cardPaymentId
                this.oneTimeCode = cardAuthenticationChallenge.oneTimeCode
                this.result = cardAuthenticationChallenge.result
                additionalProperties(cardAuthenticationChallenge.additionalProperties)
            }

            /** The identifier of the Account the card belongs to. */
            fun accountId(accountId: String) = accountId(JsonField.of(accountId))

            /** The identifier of the Account the card belongs to. */
            @JsonProperty("account_id")
            @ExcludeMissing
            fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

            /** The identifier of the Card that is being tokenized. */
            fun cardId(cardId: String) = cardId(JsonField.of(cardId))

            /** The identifier of the Card that is being tokenized. */
            @JsonProperty("card_id")
            @ExcludeMissing
            fun cardId(cardId: JsonField<String>) = apply { this.cardId = cardId }

            /**
             * The identifier of the Card Payment this authentication challenge attempt belongs to.
             */
            fun cardPaymentId(cardPaymentId: String) = cardPaymentId(JsonField.of(cardPaymentId))

            /**
             * The identifier of the Card Payment this authentication challenge attempt belongs to.
             */
            @JsonProperty("card_payment_id")
            @ExcludeMissing
            fun cardPaymentId(cardPaymentId: JsonField<String>) = apply {
                this.cardPaymentId = cardPaymentId
            }

            /** The one-time code delivered to the cardholder. */
            fun oneTimeCode(oneTimeCode: String) = oneTimeCode(JsonField.of(oneTimeCode))

            /** The one-time code delivered to the cardholder. */
            @JsonProperty("one_time_code")
            @ExcludeMissing
            fun oneTimeCode(oneTimeCode: JsonField<String>) = apply {
                this.oneTimeCode = oneTimeCode
            }

            /** Whether or not the challenge was delivered to the cardholder. */
            fun result(result: Result) = result(JsonField.of(result))

            /** Whether or not the challenge was delivered to the cardholder. */
            @JsonProperty("result")
            @ExcludeMissing
            fun result(result: JsonField<Result>) = apply { this.result = result }

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

            fun build(): CardAuthenticationChallenge =
                CardAuthenticationChallenge(
                    accountId,
                    cardId,
                    cardPaymentId,
                    oneTimeCode,
                    result,
                    additionalProperties.toImmutable(),
                )
        }

        class Result
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Result && this.value == other.value /* spotless:on */
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CardAuthenticationChallenge && this.accountId == other.accountId && this.cardId == other.cardId && this.cardPaymentId == other.cardPaymentId && this.oneTimeCode == other.oneTimeCode && this.result == other.result && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(accountId, cardId, cardPaymentId, oneTimeCode, result, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "CardAuthenticationChallenge{accountId=$accountId, cardId=$cardId, cardPaymentId=$cardPaymentId, oneTimeCode=$oneTimeCode, result=$result, additionalProperties=$additionalProperties}"
    }

    /** Fields related to a card authorization. */
    @JsonDeserialize(builder = CardAuthorization.Builder::class)
    @NoAutoDetect
    class CardAuthorization
    private constructor(
        private val accountId: JsonField<String>,
        private val cardId: JsonField<String>,
        private val decision: JsonField<Decision>,
        private val digitalWalletTokenId: JsonField<String>,
        private val direction: JsonField<Direction>,
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
        private val requestDetails: JsonField<RequestDetails>,
        private val settlementAmount: JsonField<Long>,
        private val settlementCurrency: JsonField<String>,
        private val terminalId: JsonField<String>,
        private val upcomingCardPaymentId: JsonField<String>,
        private val verification: JsonField<Verification>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        /** The identifier of the Account the authorization will debit. */
        fun accountId(): String = accountId.getRequired("account_id")

        /** The identifier of the Card that is being authorized. */
        fun cardId(): String = cardId.getRequired("card_id")

        /** Whether or not the authorization was approved. */
        fun decision(): Optional<Decision> = Optional.ofNullable(decision.getNullable("decision"))

        /**
         * If the authorization was made via a Digital Wallet Token (such as an Apple Pay purchase),
         * the identifier of the token that was used.
         */
        fun digitalWalletTokenId(): Optional<String> =
            Optional.ofNullable(digitalWalletTokenId.getNullable("digital_wallet_token_id"))

        /**
         * The direction describes the direction the funds will move, either from the cardholder to
         * the merchant or from the merchant to the cardholder.
         */
        fun direction(): Direction = direction.getRequired("direction")

        /**
         * The merchant identifier (commonly abbreviated as MID) of the merchant the card is
         * transacting with.
         */
        fun merchantAcceptorId(): String = merchantAcceptorId.getRequired("merchant_acceptor_id")

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
         * If the authorization was made in-person with a physical card, the Physical Card that was
         * used.
         */
        fun physicalCardId(): Optional<String> =
            Optional.ofNullable(physicalCardId.getNullable("physical_card_id"))

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
         * The processing category describes the intent behind the authorization, such as whether it
         * was used for bill payments or an automatic fuel dispenser.
         */
        fun processingCategory(): ProcessingCategory =
            processingCategory.getRequired("processing_category")

        /** Fields specific to the type of request, such as an incremental authorization. */
        fun requestDetails(): RequestDetails = requestDetails.getRequired("request_details")

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
         * The terminal identifier (commonly abbreviated as TID) of the terminal the card is
         * transacting with.
         */
        fun terminalId(): Optional<String> =
            Optional.ofNullable(terminalId.getNullable("terminal_id"))

        /**
         * The identifier of the Card Payment this authorization will belong to. Available in the
         * API once the card authorization has completed.
         */
        fun upcomingCardPaymentId(): String =
            upcomingCardPaymentId.getRequired("upcoming_card_payment_id")

        /** Fields related to verification of cardholder-provided values. */
        fun verification(): Verification = verification.getRequired("verification")

        /** The identifier of the Account the authorization will debit. */
        @JsonProperty("account_id") @ExcludeMissing fun _accountId() = accountId

        /** The identifier of the Card that is being authorized. */
        @JsonProperty("card_id") @ExcludeMissing fun _cardId() = cardId

        /** Whether or not the authorization was approved. */
        @JsonProperty("decision") @ExcludeMissing fun _decision() = decision

        /**
         * If the authorization was made via a Digital Wallet Token (such as an Apple Pay purchase),
         * the identifier of the token that was used.
         */
        @JsonProperty("digital_wallet_token_id")
        @ExcludeMissing
        fun _digitalWalletTokenId() = digitalWalletTokenId

        /**
         * The direction describes the direction the funds will move, either from the cardholder to
         * the merchant or from the merchant to the cardholder.
         */
        @JsonProperty("direction") @ExcludeMissing fun _direction() = direction

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
        @JsonProperty("merchant_country") @ExcludeMissing fun _merchantCountry() = merchantCountry

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
         * If the authorization was made in-person with a physical card, the Physical Card that was
         * used.
         */
        @JsonProperty("physical_card_id") @ExcludeMissing fun _physicalCardId() = physicalCardId

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
         * The processing category describes the intent behind the authorization, such as whether it
         * was used for bill payments or an automatic fuel dispenser.
         */
        @JsonProperty("processing_category")
        @ExcludeMissing
        fun _processingCategory() = processingCategory

        /** Fields specific to the type of request, such as an incremental authorization. */
        @JsonProperty("request_details") @ExcludeMissing fun _requestDetails() = requestDetails

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

        /**
         * The terminal identifier (commonly abbreviated as TID) of the terminal the card is
         * transacting with.
         */
        @JsonProperty("terminal_id") @ExcludeMissing fun _terminalId() = terminalId

        /**
         * The identifier of the Card Payment this authorization will belong to. Available in the
         * API once the card authorization has completed.
         */
        @JsonProperty("upcoming_card_payment_id")
        @ExcludeMissing
        fun _upcomingCardPaymentId() = upcomingCardPaymentId

        /** Fields related to verification of cardholder-provided values. */
        @JsonProperty("verification") @ExcludeMissing fun _verification() = verification

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): CardAuthorization = apply {
            if (!validated) {
                accountId()
                cardId()
                decision()
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
                requestDetails().validate()
                settlementAmount()
                settlementCurrency()
                terminalId()
                upcomingCardPaymentId()
                verification().validate()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var accountId: JsonField<String> = JsonMissing.of()
            private var cardId: JsonField<String> = JsonMissing.of()
            private var decision: JsonField<Decision> = JsonMissing.of()
            private var digitalWalletTokenId: JsonField<String> = JsonMissing.of()
            private var direction: JsonField<Direction> = JsonMissing.of()
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
            private var requestDetails: JsonField<RequestDetails> = JsonMissing.of()
            private var settlementAmount: JsonField<Long> = JsonMissing.of()
            private var settlementCurrency: JsonField<String> = JsonMissing.of()
            private var terminalId: JsonField<String> = JsonMissing.of()
            private var upcomingCardPaymentId: JsonField<String> = JsonMissing.of()
            private var verification: JsonField<Verification> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(cardAuthorization: CardAuthorization) = apply {
                this.accountId = cardAuthorization.accountId
                this.cardId = cardAuthorization.cardId
                this.decision = cardAuthorization.decision
                this.digitalWalletTokenId = cardAuthorization.digitalWalletTokenId
                this.direction = cardAuthorization.direction
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
                this.physicalCardId = cardAuthorization.physicalCardId
                this.presentmentAmount = cardAuthorization.presentmentAmount
                this.presentmentCurrency = cardAuthorization.presentmentCurrency
                this.processingCategory = cardAuthorization.processingCategory
                this.requestDetails = cardAuthorization.requestDetails
                this.settlementAmount = cardAuthorization.settlementAmount
                this.settlementCurrency = cardAuthorization.settlementCurrency
                this.terminalId = cardAuthorization.terminalId
                this.upcomingCardPaymentId = cardAuthorization.upcomingCardPaymentId
                this.verification = cardAuthorization.verification
                additionalProperties(cardAuthorization.additionalProperties)
            }

            /** The identifier of the Account the authorization will debit. */
            fun accountId(accountId: String) = accountId(JsonField.of(accountId))

            /** The identifier of the Account the authorization will debit. */
            @JsonProperty("account_id")
            @ExcludeMissing
            fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

            /** The identifier of the Card that is being authorized. */
            fun cardId(cardId: String) = cardId(JsonField.of(cardId))

            /** The identifier of the Card that is being authorized. */
            @JsonProperty("card_id")
            @ExcludeMissing
            fun cardId(cardId: JsonField<String>) = apply { this.cardId = cardId }

            /** Whether or not the authorization was approved. */
            fun decision(decision: Decision) = decision(JsonField.of(decision))

            /** Whether or not the authorization was approved. */
            @JsonProperty("decision")
            @ExcludeMissing
            fun decision(decision: JsonField<Decision>) = apply { this.decision = decision }

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
             * The direction describes the direction the funds will move, either from the cardholder
             * to the merchant or from the merchant to the cardholder.
             */
            fun direction(direction: Direction) = direction(JsonField.of(direction))

            /**
             * The direction describes the direction the funds will move, either from the cardholder
             * to the merchant or from the merchant to the cardholder.
             */
            @JsonProperty("direction")
            @ExcludeMissing
            fun direction(direction: JsonField<Direction>) = apply { this.direction = direction }

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
             * The merchant's postal code. For US merchants this is either a 5-digit or 9-digit ZIP
             * code, where the first 5 and last 4 are separated by a dash.
             */
            fun merchantPostalCode(merchantPostalCode: String) =
                merchantPostalCode(JsonField.of(merchantPostalCode))

            /**
             * The merchant's postal code. For US merchants this is either a 5-digit or 9-digit ZIP
             * code, where the first 5 and last 4 are separated by a dash.
             */
            @JsonProperty("merchant_postal_code")
            @ExcludeMissing
            fun merchantPostalCode(merchantPostalCode: JsonField<String>) = apply {
                this.merchantPostalCode = merchantPostalCode
            }

            /** The state the merchant resides in. */
            fun merchantState(merchantState: String) = merchantState(JsonField.of(merchantState))

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
             * If the authorization was made in-person with a physical card, the Physical Card that
             * was used.
             */
            fun physicalCardId(physicalCardId: String) =
                physicalCardId(JsonField.of(physicalCardId))

            /**
             * If the authorization was made in-person with a physical card, the Physical Card that
             * was used.
             */
            @JsonProperty("physical_card_id")
            @ExcludeMissing
            fun physicalCardId(physicalCardId: JsonField<String>) = apply {
                this.physicalCardId = physicalCardId
            }

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

            /** Fields specific to the type of request, such as an incremental authorization. */
            fun requestDetails(requestDetails: RequestDetails) =
                requestDetails(JsonField.of(requestDetails))

            /** Fields specific to the type of request, such as an incremental authorization. */
            @JsonProperty("request_details")
            @ExcludeMissing
            fun requestDetails(requestDetails: JsonField<RequestDetails>) = apply {
                this.requestDetails = requestDetails
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

            /**
             * The terminal identifier (commonly abbreviated as TID) of the terminal the card is
             * transacting with.
             */
            fun terminalId(terminalId: String) = terminalId(JsonField.of(terminalId))

            /**
             * The terminal identifier (commonly abbreviated as TID) of the terminal the card is
             * transacting with.
             */
            @JsonProperty("terminal_id")
            @ExcludeMissing
            fun terminalId(terminalId: JsonField<String>) = apply { this.terminalId = terminalId }

            /**
             * The identifier of the Card Payment this authorization will belong to. Available in
             * the API once the card authorization has completed.
             */
            fun upcomingCardPaymentId(upcomingCardPaymentId: String) =
                upcomingCardPaymentId(JsonField.of(upcomingCardPaymentId))

            /**
             * The identifier of the Card Payment this authorization will belong to. Available in
             * the API once the card authorization has completed.
             */
            @JsonProperty("upcoming_card_payment_id")
            @ExcludeMissing
            fun upcomingCardPaymentId(upcomingCardPaymentId: JsonField<String>) = apply {
                this.upcomingCardPaymentId = upcomingCardPaymentId
            }

            /** Fields related to verification of cardholder-provided values. */
            fun verification(verification: Verification) = verification(JsonField.of(verification))

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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): CardAuthorization =
                CardAuthorization(
                    accountId,
                    cardId,
                    decision,
                    digitalWalletTokenId,
                    direction,
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
                    requestDetails,
                    settlementAmount,
                    settlementCurrency,
                    terminalId,
                    upcomingCardPaymentId,
                    verification,
                    additionalProperties.toImmutable(),
                )
        }

        class Decision
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Decision && this.value == other.value /* spotless:on */
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
                 * For electronic commerce transactions, this identifies the level of security used
                 * in obtaining the customer's payment credential. For mail or telephone order
                 * transactions, identifies the type of mail or telephone order.
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
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(visa: Visa) = apply {
                        this.electronicCommerceIndicator = visa.electronicCommerceIndicator
                        this.pointOfServiceEntryMode = visa.pointOfServiceEntryMode
                        this.standInProcessingReason = visa.standInProcessingReason
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
                     * expiration date.
                     */
                    fun pointOfServiceEntryMode(pointOfServiceEntryMode: PointOfServiceEntryMode) =
                        pointOfServiceEntryMode(JsonField.of(pointOfServiceEntryMode))

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
                     * Only present when `actioner: network`. Describes why a card authorization was
                     * approved or declined by Visa through stand-in processing.
                     */
                    fun standInProcessingReason(standInProcessingReason: StandInProcessingReason) =
                        standInProcessingReason(JsonField.of(standInProcessingReason))

                    /**
                     * Only present when `actioner: network`. Describes why a card authorization was
                     * approved or declined by Visa through stand-in processing.
                     */
                    @JsonProperty("stand_in_processing_reason")
                    @ExcludeMissing
                    fun standInProcessingReason(
                        standInProcessingReason: JsonField<StandInProcessingReason>
                    ) = apply { this.standInProcessingReason = standInProcessingReason }

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
                            PointOfServiceEntryMode(JsonField.of("integrated_circuit_card_no_cvv"))

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
                            INTEGRATED_CIRCUIT_CARD_NO_CVV -> Value.INTEGRATED_CIRCUIT_CARD_NO_CVV
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
                            INTEGRATED_CIRCUIT_CARD_NO_CVV -> Known.INTEGRATED_CIRCUIT_CARD_NO_CVV
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
                                JsonField.of("invalid_cardholder_authentication_verification_value")
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
                                Value.MERCHANT_TRANSACTION_ADVISORY_SERVICE_AUTHENTICATION_REQUIRED
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
                                Known.MERCHANT_TRANSACTION_ADVISORY_SERVICE_AUTHENTICATION_REQUIRED
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
             * A life-cycle identifier used across e.g., an authorization and a reversal. Expected
             * to be unique per acquirer within a window of time. For some card networks the
             * retrieval reference number includes the trace counter.
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
             * A globally unique transaction identifier provided by the card network, used across
             * multiple life-cycle requests.
             */
            fun transactionId(): Optional<String> =
                Optional.ofNullable(transactionId.getNullable("transaction_id"))

            /**
             * A life-cycle identifier used across e.g., an authorization and a reversal. Expected
             * to be unique per acquirer within a window of time. For some card networks the
             * retrieval reference number includes the trace counter.
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
             * A globally unique transaction identifier provided by the card network, used across
             * multiple life-cycle requests.
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
                fun retrievalReferenceNumber(retrievalReferenceNumber: JsonField<String>) = apply {
                    this.retrievalReferenceNumber = retrievalReferenceNumber
                }

                /**
                 * A counter used to verify an individual authorization. Expected to be unique per
                 * acquirer within a window of time.
                 */
                fun traceNumber(traceNumber: String) = traceNumber(JsonField.of(traceNumber))

                /**
                 * A counter used to verify an individual authorization. Expected to be unique per
                 * acquirer within a window of time.
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

                @JvmField val ACCOUNT_FUNDING = ProcessingCategory(JsonField.of("account_funding"))

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
                    else -> throw IncreaseInvalidDataException("Unknown ProcessingCategory: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        /** Fields specific to the type of request, such as an incremental authorization. */
        @JsonDeserialize(builder = RequestDetails.Builder::class)
        @NoAutoDetect
        class RequestDetails
        private constructor(
            private val category: JsonField<Category>,
            private val incrementalAuthorization: JsonField<IncrementalAuthorization>,
            private val initialAuthorization: JsonValue,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            /**
             * The type of this request (e.g., an initial authorization or an incremental
             * authorization).
             */
            fun category(): Category = category.getRequired("category")

            /** Fields specific to the category `incremental_authorization`. */
            fun incrementalAuthorization(): Optional<IncrementalAuthorization> =
                Optional.ofNullable(
                    incrementalAuthorization.getNullable("incremental_authorization")
                )

            /**
             * The type of this request (e.g., an initial authorization or an incremental
             * authorization).
             */
            @JsonProperty("category") @ExcludeMissing fun _category() = category

            /** Fields specific to the category `incremental_authorization`. */
            @JsonProperty("incremental_authorization")
            @ExcludeMissing
            fun _incrementalAuthorization() = incrementalAuthorization

            /** Fields specific to the category `initial_authorization`. */
            @JsonProperty("initial_authorization")
            @ExcludeMissing
            fun _initialAuthorization() = initialAuthorization

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): RequestDetails = apply {
                if (!validated) {
                    category()
                    incrementalAuthorization().map { it.validate() }
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var category: JsonField<Category> = JsonMissing.of()
                private var incrementalAuthorization: JsonField<IncrementalAuthorization> =
                    JsonMissing.of()
                private var initialAuthorization: JsonValue = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(requestDetails: RequestDetails) = apply {
                    this.category = requestDetails.category
                    this.incrementalAuthorization = requestDetails.incrementalAuthorization
                    this.initialAuthorization = requestDetails.initialAuthorization
                    additionalProperties(requestDetails.additionalProperties)
                }

                /**
                 * The type of this request (e.g., an initial authorization or an incremental
                 * authorization).
                 */
                fun category(category: Category) = category(JsonField.of(category))

                /**
                 * The type of this request (e.g., an initial authorization or an incremental
                 * authorization).
                 */
                @JsonProperty("category")
                @ExcludeMissing
                fun category(category: JsonField<Category>) = apply { this.category = category }

                /** Fields specific to the category `incremental_authorization`. */
                fun incrementalAuthorization(incrementalAuthorization: IncrementalAuthorization) =
                    incrementalAuthorization(JsonField.of(incrementalAuthorization))

                /** Fields specific to the category `incremental_authorization`. */
                @JsonProperty("incremental_authorization")
                @ExcludeMissing
                fun incrementalAuthorization(
                    incrementalAuthorization: JsonField<IncrementalAuthorization>
                ) = apply { this.incrementalAuthorization = incrementalAuthorization }

                /** Fields specific to the category `initial_authorization`. */
                @JsonProperty("initial_authorization")
                @ExcludeMissing
                fun initialAuthorization(initialAuthorization: JsonValue) = apply {
                    this.initialAuthorization = initialAuthorization
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

                fun build(): RequestDetails =
                    RequestDetails(
                        category,
                        incrementalAuthorization,
                        initialAuthorization,
                        additionalProperties.toImmutable(),
                    )
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
                    val INITIAL_AUTHORIZATION = Category(JsonField.of("initial_authorization"))

                    @JvmField
                    val INCREMENTAL_AUTHORIZATION =
                        Category(JsonField.of("incremental_authorization"))

                    @JvmStatic fun of(value: String) = Category(JsonField.of(value))
                }

                enum class Known {
                    INITIAL_AUTHORIZATION,
                    INCREMENTAL_AUTHORIZATION,
                }

                enum class Value {
                    INITIAL_AUTHORIZATION,
                    INCREMENTAL_AUTHORIZATION,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        INITIAL_AUTHORIZATION -> Value.INITIAL_AUTHORIZATION
                        INCREMENTAL_AUTHORIZATION -> Value.INCREMENTAL_AUTHORIZATION
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        INITIAL_AUTHORIZATION -> Known.INITIAL_AUTHORIZATION
                        INCREMENTAL_AUTHORIZATION -> Known.INCREMENTAL_AUTHORIZATION
                        else -> throw IncreaseInvalidDataException("Unknown Category: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            /** Fields specific to the category `incremental_authorization`. */
            @JsonDeserialize(builder = IncrementalAuthorization.Builder::class)
            @NoAutoDetect
            class IncrementalAuthorization
            private constructor(
                private val cardPaymentId: JsonField<String>,
                private val originalCardAuthorizationId: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                /** The card payment for this authorization and increment. */
                fun cardPaymentId(): String = cardPaymentId.getRequired("card_payment_id")

                /**
                 * The identifier of the card authorization this request is attempting to increment.
                 */
                fun originalCardAuthorizationId(): String =
                    originalCardAuthorizationId.getRequired("original_card_authorization_id")

                /** The card payment for this authorization and increment. */
                @JsonProperty("card_payment_id")
                @ExcludeMissing
                fun _cardPaymentId() = cardPaymentId

                /**
                 * The identifier of the card authorization this request is attempting to increment.
                 */
                @JsonProperty("original_card_authorization_id")
                @ExcludeMissing
                fun _originalCardAuthorizationId() = originalCardAuthorizationId

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): IncrementalAuthorization = apply {
                    if (!validated) {
                        cardPaymentId()
                        originalCardAuthorizationId()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var cardPaymentId: JsonField<String> = JsonMissing.of()
                    private var originalCardAuthorizationId: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(incrementalAuthorization: IncrementalAuthorization) = apply {
                        this.cardPaymentId = incrementalAuthorization.cardPaymentId
                        this.originalCardAuthorizationId =
                            incrementalAuthorization.originalCardAuthorizationId
                        additionalProperties(incrementalAuthorization.additionalProperties)
                    }

                    /** The card payment for this authorization and increment. */
                    fun cardPaymentId(cardPaymentId: String) =
                        cardPaymentId(JsonField.of(cardPaymentId))

                    /** The card payment for this authorization and increment. */
                    @JsonProperty("card_payment_id")
                    @ExcludeMissing
                    fun cardPaymentId(cardPaymentId: JsonField<String>) = apply {
                        this.cardPaymentId = cardPaymentId
                    }

                    /**
                     * The identifier of the card authorization this request is attempting to
                     * increment.
                     */
                    fun originalCardAuthorizationId(originalCardAuthorizationId: String) =
                        originalCardAuthorizationId(JsonField.of(originalCardAuthorizationId))

                    /**
                     * The identifier of the card authorization this request is attempting to
                     * increment.
                     */
                    @JsonProperty("original_card_authorization_id")
                    @ExcludeMissing
                    fun originalCardAuthorizationId(
                        originalCardAuthorizationId: JsonField<String>
                    ) = apply { this.originalCardAuthorizationId = originalCardAuthorizationId }

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

                    fun build(): IncrementalAuthorization =
                        IncrementalAuthorization(
                            cardPaymentId,
                            originalCardAuthorizationId,
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is IncrementalAuthorization && this.cardPaymentId == other.cardPaymentId && this.originalCardAuthorizationId == other.originalCardAuthorizationId && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(cardPaymentId, originalCardAuthorizationId, additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "IncrementalAuthorization{cardPaymentId=$cardPaymentId, originalCardAuthorizationId=$originalCardAuthorizationId, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is RequestDetails && this.category == other.category && this.incrementalAuthorization == other.incrementalAuthorization && this.initialAuthorization == other.initialAuthorization && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(category, incrementalAuthorization, initialAuthorization, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "RequestDetails{category=$category, incrementalAuthorization=$incrementalAuthorization, initialAuthorization=$initialAuthorization, additionalProperties=$additionalProperties}"
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
             * Fields related to verification of the Card Verification Code, a 3-digit code on the
             * back of the card.
             */
            fun cardVerificationCode(): CardVerificationCode =
                cardVerificationCode.getRequired("card_verification_code")

            /**
             * Cardholder address provided in the authorization request and the address on file we
             * verified it against.
             */
            fun cardholderAddress(): CardholderAddress =
                cardholderAddress.getRequired("cardholder_address")

            /**
             * Fields related to verification of the Card Verification Code, a 3-digit code on the
             * back of the card.
             */
            @JsonProperty("card_verification_code")
            @ExcludeMissing
            fun _cardVerificationCode() = cardVerificationCode

            /**
             * Cardholder address provided in the authorization request and the address on file we
             * verified it against.
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

                private var cardVerificationCode: JsonField<CardVerificationCode> = JsonMissing.of()
                private var cardholderAddress: JsonField<CardholderAddress> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(verification: Verification) = apply {
                    this.cardVerificationCode = verification.cardVerificationCode
                    this.cardholderAddress = verification.cardholderAddress
                    additionalProperties(verification.additionalProperties)
                }

                /**
                 * Fields related to verification of the Card Verification Code, a 3-digit code on
                 * the back of the card.
                 */
                fun cardVerificationCode(cardVerificationCode: CardVerificationCode) =
                    cardVerificationCode(JsonField.of(cardVerificationCode))

                /**
                 * Fields related to verification of the Card Verification Code, a 3-digit code on
                 * the back of the card.
                 */
                @JsonProperty("card_verification_code")
                @ExcludeMissing
                fun cardVerificationCode(cardVerificationCode: JsonField<CardVerificationCode>) =
                    apply {
                        this.cardVerificationCode = cardVerificationCode
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
             * Fields related to verification of the Card Verification Code, a 3-digit code on the
             * back of the card.
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
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

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
             * Cardholder address provided in the authorization request and the address on file we
             * verified it against.
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
                @JsonProperty("provided_line1") @ExcludeMissing fun _providedLine1() = providedLine1

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
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

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
                    fun actualLine1(actualLine1: String) = actualLine1(JsonField.of(actualLine1))

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

                    /** The postal code provided for verification in the authorization request. */
                    fun providedPostalCode(providedPostalCode: String) =
                        providedPostalCode(JsonField.of(providedPostalCode))

                    /** The postal code provided for verification in the authorization request. */
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

            return /* spotless:off */ other is CardAuthorization && this.accountId == other.accountId && this.cardId == other.cardId && this.decision == other.decision && this.digitalWalletTokenId == other.digitalWalletTokenId && this.direction == other.direction && this.merchantAcceptorId == other.merchantAcceptorId && this.merchantCategoryCode == other.merchantCategoryCode && this.merchantCity == other.merchantCity && this.merchantCountry == other.merchantCountry && this.merchantDescriptor == other.merchantDescriptor && this.merchantPostalCode == other.merchantPostalCode && this.merchantState == other.merchantState && this.networkDetails == other.networkDetails && this.networkIdentifiers == other.networkIdentifiers && this.networkRiskScore == other.networkRiskScore && this.physicalCardId == other.physicalCardId && this.presentmentAmount == other.presentmentAmount && this.presentmentCurrency == other.presentmentCurrency && this.processingCategory == other.processingCategory && this.requestDetails == other.requestDetails && this.settlementAmount == other.settlementAmount && this.settlementCurrency == other.settlementCurrency && this.terminalId == other.terminalId && this.upcomingCardPaymentId == other.upcomingCardPaymentId && this.verification == other.verification && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(accountId, cardId, decision, digitalWalletTokenId, direction, merchantAcceptorId, merchantCategoryCode, merchantCity, merchantCountry, merchantDescriptor, merchantPostalCode, merchantState, networkDetails, networkIdentifiers, networkRiskScore, physicalCardId, presentmentAmount, presentmentCurrency, processingCategory, requestDetails, settlementAmount, settlementCurrency, terminalId, upcomingCardPaymentId, verification, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "CardAuthorization{accountId=$accountId, cardId=$cardId, decision=$decision, digitalWalletTokenId=$digitalWalletTokenId, direction=$direction, merchantAcceptorId=$merchantAcceptorId, merchantCategoryCode=$merchantCategoryCode, merchantCity=$merchantCity, merchantCountry=$merchantCountry, merchantDescriptor=$merchantDescriptor, merchantPostalCode=$merchantPostalCode, merchantState=$merchantState, networkDetails=$networkDetails, networkIdentifiers=$networkIdentifiers, networkRiskScore=$networkRiskScore, physicalCardId=$physicalCardId, presentmentAmount=$presentmentAmount, presentmentCurrency=$presentmentCurrency, processingCategory=$processingCategory, requestDetails=$requestDetails, settlementAmount=$settlementAmount, settlementCurrency=$settlementCurrency, terminalId=$terminalId, upcomingCardPaymentId=$upcomingCardPaymentId, verification=$verification, additionalProperties=$additionalProperties}"
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
            val CARD_AUTHORIZATION_REQUESTED =
                Category(JsonField.of("card_authorization_requested"))

            @JvmField
            val CARD_AUTHENTICATION_REQUESTED =
                Category(JsonField.of("card_authentication_requested"))

            @JvmField
            val CARD_AUTHENTICATION_CHALLENGE_REQUESTED =
                Category(JsonField.of("card_authentication_challenge_requested"))

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
            CARD_AUTHENTICATION_REQUESTED,
            CARD_AUTHENTICATION_CHALLENGE_REQUESTED,
            DIGITAL_WALLET_TOKEN_REQUESTED,
            DIGITAL_WALLET_AUTHENTICATION_REQUESTED,
        }

        enum class Value {
            CARD_AUTHORIZATION_REQUESTED,
            CARD_AUTHENTICATION_REQUESTED,
            CARD_AUTHENTICATION_CHALLENGE_REQUESTED,
            DIGITAL_WALLET_TOKEN_REQUESTED,
            DIGITAL_WALLET_AUTHENTICATION_REQUESTED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                CARD_AUTHORIZATION_REQUESTED -> Value.CARD_AUTHORIZATION_REQUESTED
                CARD_AUTHENTICATION_REQUESTED -> Value.CARD_AUTHENTICATION_REQUESTED
                CARD_AUTHENTICATION_CHALLENGE_REQUESTED ->
                    Value.CARD_AUTHENTICATION_CHALLENGE_REQUESTED
                DIGITAL_WALLET_TOKEN_REQUESTED -> Value.DIGITAL_WALLET_TOKEN_REQUESTED
                DIGITAL_WALLET_AUTHENTICATION_REQUESTED ->
                    Value.DIGITAL_WALLET_AUTHENTICATION_REQUESTED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                CARD_AUTHORIZATION_REQUESTED -> Known.CARD_AUTHORIZATION_REQUESTED
                CARD_AUTHENTICATION_REQUESTED -> Known.CARD_AUTHENTICATION_REQUESTED
                CARD_AUTHENTICATION_CHALLENGE_REQUESTED ->
                    Known.CARD_AUTHENTICATION_CHALLENGE_REQUESTED
                DIGITAL_WALLET_TOKEN_REQUESTED -> Known.DIGITAL_WALLET_TOKEN_REQUESTED
                DIGITAL_WALLET_AUTHENTICATION_REQUESTED ->
                    Known.DIGITAL_WALLET_AUTHENTICATION_REQUESTED
                else -> throw IncreaseInvalidDataException("Unknown Category: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    /** Fields related to a digital wallet authentication attempt. */
    @JsonDeserialize(builder = DigitalWalletAuthentication.Builder::class)
    @NoAutoDetect
    class DigitalWalletAuthentication
    private constructor(
        private val cardId: JsonField<String>,
        private val channel: JsonField<Channel>,
        private val digitalWallet: JsonField<DigitalWallet>,
        private val email: JsonField<String>,
        private val oneTimePasscode: JsonField<String>,
        private val phone: JsonField<String>,
        private val result: JsonField<Result>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        /** The identifier of the Card that is being tokenized. */
        fun cardId(): String = cardId.getRequired("card_id")

        /** The channel to send the card user their one-time passcode. */
        fun channel(): Channel = channel.getRequired("channel")

        /** The digital wallet app being used. */
        fun digitalWallet(): DigitalWallet = digitalWallet.getRequired("digital_wallet")

        /** The email to send the one-time passcode to if `channel` is equal to `email`. */
        fun email(): Optional<String> = Optional.ofNullable(email.getNullable("email"))

        /** The one-time passcode to send the card user. */
        fun oneTimePasscode(): String = oneTimePasscode.getRequired("one_time_passcode")

        /** The phone number to send the one-time passcode to if `channel` is equal to `sms`. */
        fun phone(): Optional<String> = Optional.ofNullable(phone.getNullable("phone"))

        /** Whether your application successfully delivered the one-time passcode. */
        fun result(): Optional<Result> = Optional.ofNullable(result.getNullable("result"))

        /** The identifier of the Card that is being tokenized. */
        @JsonProperty("card_id") @ExcludeMissing fun _cardId() = cardId

        /** The channel to send the card user their one-time passcode. */
        @JsonProperty("channel") @ExcludeMissing fun _channel() = channel

        /** The digital wallet app being used. */
        @JsonProperty("digital_wallet") @ExcludeMissing fun _digitalWallet() = digitalWallet

        /** The email to send the one-time passcode to if `channel` is equal to `email`. */
        @JsonProperty("email") @ExcludeMissing fun _email() = email

        /** The one-time passcode to send the card user. */
        @JsonProperty("one_time_passcode") @ExcludeMissing fun _oneTimePasscode() = oneTimePasscode

        /** The phone number to send the one-time passcode to if `channel` is equal to `sms`. */
        @JsonProperty("phone") @ExcludeMissing fun _phone() = phone

        /** Whether your application successfully delivered the one-time passcode. */
        @JsonProperty("result") @ExcludeMissing fun _result() = result

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): DigitalWalletAuthentication = apply {
            if (!validated) {
                cardId()
                channel()
                digitalWallet()
                email()
                oneTimePasscode()
                phone()
                result()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var cardId: JsonField<String> = JsonMissing.of()
            private var channel: JsonField<Channel> = JsonMissing.of()
            private var digitalWallet: JsonField<DigitalWallet> = JsonMissing.of()
            private var email: JsonField<String> = JsonMissing.of()
            private var oneTimePasscode: JsonField<String> = JsonMissing.of()
            private var phone: JsonField<String> = JsonMissing.of()
            private var result: JsonField<Result> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(digitalWalletAuthentication: DigitalWalletAuthentication) = apply {
                this.cardId = digitalWalletAuthentication.cardId
                this.channel = digitalWalletAuthentication.channel
                this.digitalWallet = digitalWalletAuthentication.digitalWallet
                this.email = digitalWalletAuthentication.email
                this.oneTimePasscode = digitalWalletAuthentication.oneTimePasscode
                this.phone = digitalWalletAuthentication.phone
                this.result = digitalWalletAuthentication.result
                additionalProperties(digitalWalletAuthentication.additionalProperties)
            }

            /** The identifier of the Card that is being tokenized. */
            fun cardId(cardId: String) = cardId(JsonField.of(cardId))

            /** The identifier of the Card that is being tokenized. */
            @JsonProperty("card_id")
            @ExcludeMissing
            fun cardId(cardId: JsonField<String>) = apply { this.cardId = cardId }

            /** The channel to send the card user their one-time passcode. */
            fun channel(channel: Channel) = channel(JsonField.of(channel))

            /** The channel to send the card user their one-time passcode. */
            @JsonProperty("channel")
            @ExcludeMissing
            fun channel(channel: JsonField<Channel>) = apply { this.channel = channel }

            /** The digital wallet app being used. */
            fun digitalWallet(digitalWallet: DigitalWallet) =
                digitalWallet(JsonField.of(digitalWallet))

            /** The digital wallet app being used. */
            @JsonProperty("digital_wallet")
            @ExcludeMissing
            fun digitalWallet(digitalWallet: JsonField<DigitalWallet>) = apply {
                this.digitalWallet = digitalWallet
            }

            /** The email to send the one-time passcode to if `channel` is equal to `email`. */
            fun email(email: String) = email(JsonField.of(email))

            /** The email to send the one-time passcode to if `channel` is equal to `email`. */
            @JsonProperty("email")
            @ExcludeMissing
            fun email(email: JsonField<String>) = apply { this.email = email }

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

            /** Whether your application successfully delivered the one-time passcode. */
            fun result(result: Result) = result(JsonField.of(result))

            /** Whether your application successfully delivered the one-time passcode. */
            @JsonProperty("result")
            @ExcludeMissing
            fun result(result: JsonField<Result>) = apply { this.result = result }

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
                    cardId,
                    channel,
                    digitalWallet,
                    email,
                    oneTimePasscode,
                    phone,
                    result,
                    additionalProperties.toImmutable(),
                )
        }

        class Channel
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Channel && this.value == other.value /* spotless:on */
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

        class DigitalWallet
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is DigitalWallet && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val APPLE_PAY = DigitalWallet(JsonField.of("apple_pay"))

                @JvmField val GOOGLE_PAY = DigitalWallet(JsonField.of("google_pay"))

                @JvmField val SAMSUNG_PAY = DigitalWallet(JsonField.of("samsung_pay"))

                @JvmField val UNKNOWN = DigitalWallet(JsonField.of("unknown"))

                @JvmStatic fun of(value: String) = DigitalWallet(JsonField.of(value))
            }

            enum class Known {
                APPLE_PAY,
                GOOGLE_PAY,
                SAMSUNG_PAY,
                UNKNOWN,
            }

            enum class Value {
                APPLE_PAY,
                GOOGLE_PAY,
                SAMSUNG_PAY,
                UNKNOWN,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    APPLE_PAY -> Value.APPLE_PAY
                    GOOGLE_PAY -> Value.GOOGLE_PAY
                    SAMSUNG_PAY -> Value.SAMSUNG_PAY
                    UNKNOWN -> Value.UNKNOWN
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    APPLE_PAY -> Known.APPLE_PAY
                    GOOGLE_PAY -> Known.GOOGLE_PAY
                    SAMSUNG_PAY -> Known.SAMSUNG_PAY
                    UNKNOWN -> Known.UNKNOWN
                    else -> throw IncreaseInvalidDataException("Unknown DigitalWallet: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        class Result
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Result && this.value == other.value /* spotless:on */
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is DigitalWalletAuthentication && this.cardId == other.cardId && this.channel == other.channel && this.digitalWallet == other.digitalWallet && this.email == other.email && this.oneTimePasscode == other.oneTimePasscode && this.phone == other.phone && this.result == other.result && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(cardId, channel, digitalWallet, email, oneTimePasscode, phone, result, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "DigitalWalletAuthentication{cardId=$cardId, channel=$channel, digitalWallet=$digitalWallet, email=$email, oneTimePasscode=$oneTimePasscode, phone=$phone, result=$result, additionalProperties=$additionalProperties}"
    }

    /** Fields related to a digital wallet token provisioning attempt. */
    @JsonDeserialize(builder = DigitalWalletToken.Builder::class)
    @NoAutoDetect
    class DigitalWalletToken
    private constructor(
        private val cardId: JsonField<String>,
        private val cardProfileId: JsonField<String>,
        private val decision: JsonField<Decision>,
        private val digitalWallet: JsonField<DigitalWallet>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        /** The identifier of the Card that is being tokenized. */
        fun cardId(): String = cardId.getRequired("card_id")

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
        fun decision(): Optional<Decision> = Optional.ofNullable(decision.getNullable("decision"))

        /** The digital wallet app being used. */
        fun digitalWallet(): DigitalWallet = digitalWallet.getRequired("digital_wallet")

        /** The identifier of the Card that is being tokenized. */
        @JsonProperty("card_id") @ExcludeMissing fun _cardId() = cardId

        /**
         * The identifier of the Card Profile that was set via the real time decision. This will be
         * null until the real time decision is responded to or if the real time decision did not
         * set a card profile.
         */
        @JsonProperty("card_profile_id") @ExcludeMissing fun _cardProfileId() = cardProfileId

        /**
         * Whether or not the provisioning request was approved. This will be null until the real
         * time decision is responded to.
         */
        @JsonProperty("decision") @ExcludeMissing fun _decision() = decision

        /** The digital wallet app being used. */
        @JsonProperty("digital_wallet") @ExcludeMissing fun _digitalWallet() = digitalWallet

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): DigitalWalletToken = apply {
            if (!validated) {
                cardId()
                cardProfileId()
                decision()
                digitalWallet()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var cardId: JsonField<String> = JsonMissing.of()
            private var cardProfileId: JsonField<String> = JsonMissing.of()
            private var decision: JsonField<Decision> = JsonMissing.of()
            private var digitalWallet: JsonField<DigitalWallet> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(digitalWalletToken: DigitalWalletToken) = apply {
                this.cardId = digitalWalletToken.cardId
                this.cardProfileId = digitalWalletToken.cardProfileId
                this.decision = digitalWalletToken.decision
                this.digitalWallet = digitalWalletToken.digitalWallet
                additionalProperties(digitalWalletToken.additionalProperties)
            }

            /** The identifier of the Card that is being tokenized. */
            fun cardId(cardId: String) = cardId(JsonField.of(cardId))

            /** The identifier of the Card that is being tokenized. */
            @JsonProperty("card_id")
            @ExcludeMissing
            fun cardId(cardId: JsonField<String>) = apply { this.cardId = cardId }

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

            /** The digital wallet app being used. */
            fun digitalWallet(digitalWallet: DigitalWallet) =
                digitalWallet(JsonField.of(digitalWallet))

            /** The digital wallet app being used. */
            @JsonProperty("digital_wallet")
            @ExcludeMissing
            fun digitalWallet(digitalWallet: JsonField<DigitalWallet>) = apply {
                this.digitalWallet = digitalWallet
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
                    cardId,
                    cardProfileId,
                    decision,
                    digitalWallet,
                    additionalProperties.toImmutable(),
                )
        }

        class Decision
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Decision && this.value == other.value /* spotless:on */
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
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is DigitalWallet && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val APPLE_PAY = DigitalWallet(JsonField.of("apple_pay"))

                @JvmField val GOOGLE_PAY = DigitalWallet(JsonField.of("google_pay"))

                @JvmField val SAMSUNG_PAY = DigitalWallet(JsonField.of("samsung_pay"))

                @JvmField val UNKNOWN = DigitalWallet(JsonField.of("unknown"))

                @JvmStatic fun of(value: String) = DigitalWallet(JsonField.of(value))
            }

            enum class Known {
                APPLE_PAY,
                GOOGLE_PAY,
                SAMSUNG_PAY,
                UNKNOWN,
            }

            enum class Value {
                APPLE_PAY,
                GOOGLE_PAY,
                SAMSUNG_PAY,
                UNKNOWN,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    APPLE_PAY -> Value.APPLE_PAY
                    GOOGLE_PAY -> Value.GOOGLE_PAY
                    SAMSUNG_PAY -> Value.SAMSUNG_PAY
                    UNKNOWN -> Value.UNKNOWN
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    APPLE_PAY -> Known.APPLE_PAY
                    GOOGLE_PAY -> Known.GOOGLE_PAY
                    SAMSUNG_PAY -> Known.SAMSUNG_PAY
                    UNKNOWN -> Known.UNKNOWN
                    else -> throw IncreaseInvalidDataException("Unknown DigitalWallet: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is DigitalWalletToken && this.cardId == other.cardId && this.cardProfileId == other.cardProfileId && this.decision == other.decision && this.digitalWallet == other.digitalWallet && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(cardId, cardProfileId, decision, digitalWallet, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "DigitalWalletToken{cardId=$cardId, cardProfileId=$cardProfileId, decision=$decision, digitalWallet=$digitalWallet, additionalProperties=$additionalProperties}"
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is RealTimeDecision && this.cardAuthentication == other.cardAuthentication && this.cardAuthenticationChallenge == other.cardAuthenticationChallenge && this.cardAuthorization == other.cardAuthorization && this.category == other.category && this.createdAt == other.createdAt && this.digitalWalletAuthentication == other.digitalWalletAuthentication && this.digitalWalletToken == other.digitalWalletToken && this.id == other.id && this.status == other.status && this.timeoutAt == other.timeoutAt && this.type == other.type && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(cardAuthentication, cardAuthenticationChallenge, cardAuthorization, category, createdAt, digitalWalletAuthentication, digitalWalletToken, id, status, timeoutAt, type, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "RealTimeDecision{cardAuthentication=$cardAuthentication, cardAuthenticationChallenge=$cardAuthenticationChallenge, cardAuthorization=$cardAuthorization, category=$category, createdAt=$createdAt, digitalWalletAuthentication=$digitalWalletAuthentication, digitalWalletToken=$digitalWalletToken, id=$id, status=$status, timeoutAt=$timeoutAt, type=$type, additionalProperties=$additionalProperties}"
}
