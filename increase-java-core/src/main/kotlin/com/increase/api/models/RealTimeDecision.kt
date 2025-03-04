// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.increase.api.core.Enum
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.checkRequired
import com.increase.api.core.immutableEmptyMap
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
@NoAutoDetect
class RealTimeDecision
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("card_authentication")
    @ExcludeMissing
    private val cardAuthentication: JsonField<CardAuthentication> = JsonMissing.of(),
    @JsonProperty("card_authentication_challenge")
    @ExcludeMissing
    private val cardAuthenticationChallenge: JsonField<CardAuthenticationChallenge> =
        JsonMissing.of(),
    @JsonProperty("card_authorization")
    @ExcludeMissing
    private val cardAuthorization: JsonField<CardAuthorization> = JsonMissing.of(),
    @JsonProperty("category")
    @ExcludeMissing
    private val category: JsonField<Category> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("digital_wallet_authentication")
    @ExcludeMissing
    private val digitalWalletAuthentication: JsonField<DigitalWalletAuthentication> =
        JsonMissing.of(),
    @JsonProperty("digital_wallet_token")
    @ExcludeMissing
    private val digitalWalletToken: JsonField<DigitalWalletToken> = JsonMissing.of(),
    @JsonProperty("status")
    @ExcludeMissing
    private val status: JsonField<Status> = JsonMissing.of(),
    @JsonProperty("timeout_at")
    @ExcludeMissing
    private val timeoutAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The Real-Time Decision identifier. */
    fun id(): String = id.getRequired("id")

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

    /** The Real-Time Decision identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /** Fields related to a 3DS authentication attempt. */
    @JsonProperty("card_authentication")
    @ExcludeMissing
    fun _cardAuthentication(): JsonField<CardAuthentication> = cardAuthentication

    /** Fields related to a 3DS authentication attempt. */
    @JsonProperty("card_authentication_challenge")
    @ExcludeMissing
    fun _cardAuthenticationChallenge(): JsonField<CardAuthenticationChallenge> =
        cardAuthenticationChallenge

    /** Fields related to a card authorization. */
    @JsonProperty("card_authorization")
    @ExcludeMissing
    fun _cardAuthorization(): JsonField<CardAuthorization> = cardAuthorization

    /** The category of the Real-Time Decision. */
    @JsonProperty("category") @ExcludeMissing fun _category(): JsonField<Category> = category

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the Real-Time
     * Decision was created.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /** Fields related to a digital wallet authentication attempt. */
    @JsonProperty("digital_wallet_authentication")
    @ExcludeMissing
    fun _digitalWalletAuthentication(): JsonField<DigitalWalletAuthentication> =
        digitalWalletAuthentication

    /** Fields related to a digital wallet token provisioning attempt. */
    @JsonProperty("digital_wallet_token")
    @ExcludeMissing
    fun _digitalWalletToken(): JsonField<DigitalWalletToken> = digitalWalletToken

    /** The status of the Real-Time Decision. */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which your
     * application can no longer respond to the Real-Time Decision.
     */
    @JsonProperty("timeout_at")
    @ExcludeMissing
    fun _timeoutAt(): JsonField<OffsetDateTime> = timeoutAt

    /**
     * A constant representing the object's type. For this resource it will always be
     * `real_time_decision`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): RealTimeDecision = apply {
        if (validated) {
            return@apply
        }

        id()
        cardAuthentication().ifPresent { it.validate() }
        cardAuthenticationChallenge().ifPresent { it.validate() }
        cardAuthorization().ifPresent { it.validate() }
        category()
        createdAt()
        digitalWalletAuthentication().ifPresent { it.validate() }
        digitalWalletToken().ifPresent { it.validate() }
        status()
        timeoutAt()
        type()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RealTimeDecision].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .cardAuthentication()
         * .cardAuthenticationChallenge()
         * .cardAuthorization()
         * .category()
         * .createdAt()
         * .digitalWalletAuthentication()
         * .digitalWalletToken()
         * .status()
         * .timeoutAt()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RealTimeDecision]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var cardAuthentication: JsonField<CardAuthentication>? = null
        private var cardAuthenticationChallenge: JsonField<CardAuthenticationChallenge>? = null
        private var cardAuthorization: JsonField<CardAuthorization>? = null
        private var category: JsonField<Category>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var digitalWalletAuthentication: JsonField<DigitalWalletAuthentication>? = null
        private var digitalWalletToken: JsonField<DigitalWalletToken>? = null
        private var status: JsonField<Status>? = null
        private var timeoutAt: JsonField<OffsetDateTime>? = null
        private var type: JsonField<Type>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(realTimeDecision: RealTimeDecision) = apply {
            id = realTimeDecision.id
            cardAuthentication = realTimeDecision.cardAuthentication
            cardAuthenticationChallenge = realTimeDecision.cardAuthenticationChallenge
            cardAuthorization = realTimeDecision.cardAuthorization
            category = realTimeDecision.category
            createdAt = realTimeDecision.createdAt
            digitalWalletAuthentication = realTimeDecision.digitalWalletAuthentication
            digitalWalletToken = realTimeDecision.digitalWalletToken
            status = realTimeDecision.status
            timeoutAt = realTimeDecision.timeoutAt
            type = realTimeDecision.type
            additionalProperties = realTimeDecision.additionalProperties.toMutableMap()
        }

        /** The Real-Time Decision identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The Real-Time Decision identifier. */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Fields related to a 3DS authentication attempt. */
        fun cardAuthentication(cardAuthentication: CardAuthentication?) =
            cardAuthentication(JsonField.ofNullable(cardAuthentication))

        /** Fields related to a 3DS authentication attempt. */
        fun cardAuthentication(cardAuthentication: Optional<CardAuthentication>) =
            cardAuthentication(cardAuthentication.orElse(null))

        /** Fields related to a 3DS authentication attempt. */
        fun cardAuthentication(cardAuthentication: JsonField<CardAuthentication>) = apply {
            this.cardAuthentication = cardAuthentication
        }

        /** Fields related to a 3DS authentication attempt. */
        fun cardAuthenticationChallenge(cardAuthenticationChallenge: CardAuthenticationChallenge?) =
            cardAuthenticationChallenge(JsonField.ofNullable(cardAuthenticationChallenge))

        /** Fields related to a 3DS authentication attempt. */
        fun cardAuthenticationChallenge(
            cardAuthenticationChallenge: Optional<CardAuthenticationChallenge>
        ) = cardAuthenticationChallenge(cardAuthenticationChallenge.orElse(null))

        /** Fields related to a 3DS authentication attempt. */
        fun cardAuthenticationChallenge(
            cardAuthenticationChallenge: JsonField<CardAuthenticationChallenge>
        ) = apply { this.cardAuthenticationChallenge = cardAuthenticationChallenge }

        /** Fields related to a card authorization. */
        fun cardAuthorization(cardAuthorization: CardAuthorization?) =
            cardAuthorization(JsonField.ofNullable(cardAuthorization))

        /** Fields related to a card authorization. */
        fun cardAuthorization(cardAuthorization: Optional<CardAuthorization>) =
            cardAuthorization(cardAuthorization.orElse(null))

        /** Fields related to a card authorization. */
        fun cardAuthorization(cardAuthorization: JsonField<CardAuthorization>) = apply {
            this.cardAuthorization = cardAuthorization
        }

        /** The category of the Real-Time Decision. */
        fun category(category: Category) = category(JsonField.of(category))

        /** The category of the Real-Time Decision. */
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
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** Fields related to a digital wallet authentication attempt. */
        fun digitalWalletAuthentication(digitalWalletAuthentication: DigitalWalletAuthentication?) =
            digitalWalletAuthentication(JsonField.ofNullable(digitalWalletAuthentication))

        /** Fields related to a digital wallet authentication attempt. */
        fun digitalWalletAuthentication(
            digitalWalletAuthentication: Optional<DigitalWalletAuthentication>
        ) = digitalWalletAuthentication(digitalWalletAuthentication.orElse(null))

        /** Fields related to a digital wallet authentication attempt. */
        fun digitalWalletAuthentication(
            digitalWalletAuthentication: JsonField<DigitalWalletAuthentication>
        ) = apply { this.digitalWalletAuthentication = digitalWalletAuthentication }

        /** Fields related to a digital wallet token provisioning attempt. */
        fun digitalWalletToken(digitalWalletToken: DigitalWalletToken?) =
            digitalWalletToken(JsonField.ofNullable(digitalWalletToken))

        /** Fields related to a digital wallet token provisioning attempt. */
        fun digitalWalletToken(digitalWalletToken: Optional<DigitalWalletToken>) =
            digitalWalletToken(digitalWalletToken.orElse(null))

        /** Fields related to a digital wallet token provisioning attempt. */
        fun digitalWalletToken(digitalWalletToken: JsonField<DigitalWalletToken>) = apply {
            this.digitalWalletToken = digitalWalletToken
        }

        /** The status of the Real-Time Decision. */
        fun status(status: Status) = status(JsonField.of(status))

        /** The status of the Real-Time Decision. */
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
        fun type(type: JsonField<Type>) = apply { this.type = type }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        fun build(): RealTimeDecision =
            RealTimeDecision(
                checkRequired("id", id),
                checkRequired("cardAuthentication", cardAuthentication),
                checkRequired("cardAuthenticationChallenge", cardAuthenticationChallenge),
                checkRequired("cardAuthorization", cardAuthorization),
                checkRequired("category", category),
                checkRequired("createdAt", createdAt),
                checkRequired("digitalWalletAuthentication", digitalWalletAuthentication),
                checkRequired("digitalWalletToken", digitalWalletToken),
                checkRequired("status", status),
                checkRequired("timeoutAt", timeoutAt),
                checkRequired("type", type),
                additionalProperties.toImmutable(),
            )
    }

    /** Fields related to a 3DS authentication attempt. */
    @NoAutoDetect
    class CardAuthentication
    @JsonCreator
    private constructor(
        @JsonProperty("account_id")
        @ExcludeMissing
        private val accountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("card_id")
        @ExcludeMissing
        private val cardId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("decision")
        @ExcludeMissing
        private val decision: JsonField<Decision> = JsonMissing.of(),
        @JsonProperty("upcoming_card_payment_id")
        @ExcludeMissing
        private val upcomingCardPaymentId: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

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
        @JsonProperty("account_id") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

        /** The identifier of the Card that is being tokenized. */
        @JsonProperty("card_id") @ExcludeMissing fun _cardId(): JsonField<String> = cardId

        /** Whether or not the authentication attempt was approved. */
        @JsonProperty("decision") @ExcludeMissing fun _decision(): JsonField<Decision> = decision

        /**
         * The identifier of the Card Payment this authentication attempt will belong to. Available
         * in the API once the card authentication has completed.
         */
        @JsonProperty("upcoming_card_payment_id")
        @ExcludeMissing
        fun _upcomingCardPaymentId(): JsonField<String> = upcomingCardPaymentId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): CardAuthentication = apply {
            if (validated) {
                return@apply
            }

            accountId()
            cardId()
            decision()
            upcomingCardPaymentId()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [CardAuthentication].
             *
             * The following fields are required:
             * ```java
             * .accountId()
             * .cardId()
             * .decision()
             * .upcomingCardPaymentId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CardAuthentication]. */
        class Builder internal constructor() {

            private var accountId: JsonField<String>? = null
            private var cardId: JsonField<String>? = null
            private var decision: JsonField<Decision>? = null
            private var upcomingCardPaymentId: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(cardAuthentication: CardAuthentication) = apply {
                accountId = cardAuthentication.accountId
                cardId = cardAuthentication.cardId
                decision = cardAuthentication.decision
                upcomingCardPaymentId = cardAuthentication.upcomingCardPaymentId
                additionalProperties = cardAuthentication.additionalProperties.toMutableMap()
            }

            /** The identifier of the Account the card belongs to. */
            fun accountId(accountId: String) = accountId(JsonField.of(accountId))

            /** The identifier of the Account the card belongs to. */
            fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

            /** The identifier of the Card that is being tokenized. */
            fun cardId(cardId: String) = cardId(JsonField.of(cardId))

            /** The identifier of the Card that is being tokenized. */
            fun cardId(cardId: JsonField<String>) = apply { this.cardId = cardId }

            /** Whether or not the authentication attempt was approved. */
            fun decision(decision: Decision?) = decision(JsonField.ofNullable(decision))

            /** Whether or not the authentication attempt was approved. */
            fun decision(decision: Optional<Decision>) = decision(decision.orElse(null))

            /** Whether or not the authentication attempt was approved. */
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
            fun upcomingCardPaymentId(upcomingCardPaymentId: JsonField<String>) = apply {
                this.upcomingCardPaymentId = upcomingCardPaymentId
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            fun build(): CardAuthentication =
                CardAuthentication(
                    checkRequired("accountId", accountId),
                    checkRequired("cardId", cardId),
                    checkRequired("decision", decision),
                    checkRequired("upcomingCardPaymentId", upcomingCardPaymentId),
                    additionalProperties.toImmutable(),
                )
        }

        /** Whether or not the authentication attempt was approved. */
        class Decision @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                /** Approve the authentication attempt without triggering a challenge. */
                @JvmField val APPROVE = of("approve")

                /** Request further validation before approving the authentication attempt. */
                @JvmField val CHALLENGE = of("challenge")

                /** Deny the authentication attempt. */
                @JvmField val DENY = of("deny")

                @JvmStatic fun of(value: String) = Decision(JsonField.of(value))
            }

            /** An enum containing [Decision]'s known values. */
            enum class Known {
                /** Approve the authentication attempt without triggering a challenge. */
                APPROVE,
                /** Request further validation before approving the authentication attempt. */
                CHALLENGE,
                /** Deny the authentication attempt. */
                DENY,
            }

            /**
             * An enum containing [Decision]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Decision] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /** Approve the authentication attempt without triggering a challenge. */
                APPROVE,
                /** Request further validation before approving the authentication attempt. */
                CHALLENGE,
                /** Deny the authentication attempt. */
                DENY,
                /**
                 * An enum member indicating that [Decision] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    APPROVE -> Value.APPROVE
                    CHALLENGE -> Value.CHALLENGE
                    DENY -> Value.DENY
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws IncreaseInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    APPROVE -> Known.APPROVE
                    CHALLENGE -> Known.CHALLENGE
                    DENY -> Known.DENY
                    else -> throw IncreaseInvalidDataException("Unknown Decision: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws IncreaseInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    IncreaseInvalidDataException("Value is not a String")
                }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Decision && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CardAuthentication && accountId == other.accountId && cardId == other.cardId && decision == other.decision && upcomingCardPaymentId == other.upcomingCardPaymentId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(accountId, cardId, decision, upcomingCardPaymentId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CardAuthentication{accountId=$accountId, cardId=$cardId, decision=$decision, upcomingCardPaymentId=$upcomingCardPaymentId, additionalProperties=$additionalProperties}"
    }

    /** Fields related to a 3DS authentication attempt. */
    @NoAutoDetect
    class CardAuthenticationChallenge
    @JsonCreator
    private constructor(
        @JsonProperty("account_id")
        @ExcludeMissing
        private val accountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("card_id")
        @ExcludeMissing
        private val cardId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("card_payment_id")
        @ExcludeMissing
        private val cardPaymentId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("one_time_code")
        @ExcludeMissing
        private val oneTimeCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("result")
        @ExcludeMissing
        private val result: JsonField<Result> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

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
        @JsonProperty("account_id") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

        /** The identifier of the Card that is being tokenized. */
        @JsonProperty("card_id") @ExcludeMissing fun _cardId(): JsonField<String> = cardId

        /** The identifier of the Card Payment this authentication challenge attempt belongs to. */
        @JsonProperty("card_payment_id")
        @ExcludeMissing
        fun _cardPaymentId(): JsonField<String> = cardPaymentId

        /** The one-time code delivered to the cardholder. */
        @JsonProperty("one_time_code")
        @ExcludeMissing
        fun _oneTimeCode(): JsonField<String> = oneTimeCode

        /** Whether or not the challenge was delivered to the cardholder. */
        @JsonProperty("result") @ExcludeMissing fun _result(): JsonField<Result> = result

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): CardAuthenticationChallenge = apply {
            if (validated) {
                return@apply
            }

            accountId()
            cardId()
            cardPaymentId()
            oneTimeCode()
            result()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of
             * [CardAuthenticationChallenge].
             *
             * The following fields are required:
             * ```java
             * .accountId()
             * .cardId()
             * .cardPaymentId()
             * .oneTimeCode()
             * .result()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CardAuthenticationChallenge]. */
        class Builder internal constructor() {

            private var accountId: JsonField<String>? = null
            private var cardId: JsonField<String>? = null
            private var cardPaymentId: JsonField<String>? = null
            private var oneTimeCode: JsonField<String>? = null
            private var result: JsonField<Result>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(cardAuthenticationChallenge: CardAuthenticationChallenge) = apply {
                accountId = cardAuthenticationChallenge.accountId
                cardId = cardAuthenticationChallenge.cardId
                cardPaymentId = cardAuthenticationChallenge.cardPaymentId
                oneTimeCode = cardAuthenticationChallenge.oneTimeCode
                result = cardAuthenticationChallenge.result
                additionalProperties =
                    cardAuthenticationChallenge.additionalProperties.toMutableMap()
            }

            /** The identifier of the Account the card belongs to. */
            fun accountId(accountId: String) = accountId(JsonField.of(accountId))

            /** The identifier of the Account the card belongs to. */
            fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

            /** The identifier of the Card that is being tokenized. */
            fun cardId(cardId: String) = cardId(JsonField.of(cardId))

            /** The identifier of the Card that is being tokenized. */
            fun cardId(cardId: JsonField<String>) = apply { this.cardId = cardId }

            /**
             * The identifier of the Card Payment this authentication challenge attempt belongs to.
             */
            fun cardPaymentId(cardPaymentId: String) = cardPaymentId(JsonField.of(cardPaymentId))

            /**
             * The identifier of the Card Payment this authentication challenge attempt belongs to.
             */
            fun cardPaymentId(cardPaymentId: JsonField<String>) = apply {
                this.cardPaymentId = cardPaymentId
            }

            /** The one-time code delivered to the cardholder. */
            fun oneTimeCode(oneTimeCode: String) = oneTimeCode(JsonField.of(oneTimeCode))

            /** The one-time code delivered to the cardholder. */
            fun oneTimeCode(oneTimeCode: JsonField<String>) = apply {
                this.oneTimeCode = oneTimeCode
            }

            /** Whether or not the challenge was delivered to the cardholder. */
            fun result(result: Result?) = result(JsonField.ofNullable(result))

            /** Whether or not the challenge was delivered to the cardholder. */
            fun result(result: Optional<Result>) = result(result.orElse(null))

            /** Whether or not the challenge was delivered to the cardholder. */
            fun result(result: JsonField<Result>) = apply { this.result = result }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            fun build(): CardAuthenticationChallenge =
                CardAuthenticationChallenge(
                    checkRequired("accountId", accountId),
                    checkRequired("cardId", cardId),
                    checkRequired("cardPaymentId", cardPaymentId),
                    checkRequired("oneTimeCode", oneTimeCode),
                    checkRequired("result", result),
                    additionalProperties.toImmutable(),
                )
        }

        /** Whether or not the challenge was delivered to the cardholder. */
        class Result @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                /** Your application successfully delivered the one-time code to the cardholder. */
                @JvmField val SUCCESS = of("success")

                /** Your application was unable to deliver the one-time code to the cardholder. */
                @JvmField val FAILURE = of("failure")

                @JvmStatic fun of(value: String) = Result(JsonField.of(value))
            }

            /** An enum containing [Result]'s known values. */
            enum class Known {
                /** Your application successfully delivered the one-time code to the cardholder. */
                SUCCESS,
                /** Your application was unable to deliver the one-time code to the cardholder. */
                FAILURE,
            }

            /**
             * An enum containing [Result]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Result] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /** Your application successfully delivered the one-time code to the cardholder. */
                SUCCESS,
                /** Your application was unable to deliver the one-time code to the cardholder. */
                FAILURE,
                /**
                 * An enum member indicating that [Result] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    SUCCESS -> Value.SUCCESS
                    FAILURE -> Value.FAILURE
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws IncreaseInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    SUCCESS -> Known.SUCCESS
                    FAILURE -> Known.FAILURE
                    else -> throw IncreaseInvalidDataException("Unknown Result: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws IncreaseInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    IncreaseInvalidDataException("Value is not a String")
                }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Result && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CardAuthenticationChallenge && accountId == other.accountId && cardId == other.cardId && cardPaymentId == other.cardPaymentId && oneTimeCode == other.oneTimeCode && result == other.result && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(accountId, cardId, cardPaymentId, oneTimeCode, result, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CardAuthenticationChallenge{accountId=$accountId, cardId=$cardId, cardPaymentId=$cardPaymentId, oneTimeCode=$oneTimeCode, result=$result, additionalProperties=$additionalProperties}"
    }

    /** Fields related to a card authorization. */
    @NoAutoDetect
    class CardAuthorization
    @JsonCreator
    private constructor(
        @JsonProperty("account_id")
        @ExcludeMissing
        private val accountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("card_id")
        @ExcludeMissing
        private val cardId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("decision")
        @ExcludeMissing
        private val decision: JsonField<Decision> = JsonMissing.of(),
        @JsonProperty("digital_wallet_token_id")
        @ExcludeMissing
        private val digitalWalletTokenId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("direction")
        @ExcludeMissing
        private val direction: JsonField<Direction> = JsonMissing.of(),
        @JsonProperty("merchant_acceptor_id")
        @ExcludeMissing
        private val merchantAcceptorId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("merchant_category_code")
        @ExcludeMissing
        private val merchantCategoryCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("merchant_city")
        @ExcludeMissing
        private val merchantCity: JsonField<String> = JsonMissing.of(),
        @JsonProperty("merchant_country")
        @ExcludeMissing
        private val merchantCountry: JsonField<String> = JsonMissing.of(),
        @JsonProperty("merchant_descriptor")
        @ExcludeMissing
        private val merchantDescriptor: JsonField<String> = JsonMissing.of(),
        @JsonProperty("merchant_postal_code")
        @ExcludeMissing
        private val merchantPostalCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("merchant_state")
        @ExcludeMissing
        private val merchantState: JsonField<String> = JsonMissing.of(),
        @JsonProperty("network_details")
        @ExcludeMissing
        private val networkDetails: JsonField<NetworkDetails> = JsonMissing.of(),
        @JsonProperty("network_identifiers")
        @ExcludeMissing
        private val networkIdentifiers: JsonField<NetworkIdentifiers> = JsonMissing.of(),
        @JsonProperty("network_risk_score")
        @ExcludeMissing
        private val networkRiskScore: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("physical_card_id")
        @ExcludeMissing
        private val physicalCardId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("presentment_amount")
        @ExcludeMissing
        private val presentmentAmount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("presentment_currency")
        @ExcludeMissing
        private val presentmentCurrency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("processing_category")
        @ExcludeMissing
        private val processingCategory: JsonField<ProcessingCategory> = JsonMissing.of(),
        @JsonProperty("request_details")
        @ExcludeMissing
        private val requestDetails: JsonField<RequestDetails> = JsonMissing.of(),
        @JsonProperty("settlement_amount")
        @ExcludeMissing
        private val settlementAmount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("settlement_currency")
        @ExcludeMissing
        private val settlementCurrency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("terminal_id")
        @ExcludeMissing
        private val terminalId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("upcoming_card_payment_id")
        @ExcludeMissing
        private val upcomingCardPaymentId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("verification")
        @ExcludeMissing
        private val verification: JsonField<Verification> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

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
        fun merchantCategoryCode(): String =
            merchantCategoryCode.getRequired("merchant_category_code")

        /** The city the merchant resides in. */
        fun merchantCity(): Optional<String> =
            Optional.ofNullable(merchantCity.getNullable("merchant_city"))

        /** The country the merchant resides in. */
        fun merchantCountry(): String = merchantCountry.getRequired("merchant_country")

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
        @JsonProperty("account_id") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

        /** The identifier of the Card that is being authorized. */
        @JsonProperty("card_id") @ExcludeMissing fun _cardId(): JsonField<String> = cardId

        /** Whether or not the authorization was approved. */
        @JsonProperty("decision") @ExcludeMissing fun _decision(): JsonField<Decision> = decision

        /**
         * If the authorization was made via a Digital Wallet Token (such as an Apple Pay purchase),
         * the identifier of the token that was used.
         */
        @JsonProperty("digital_wallet_token_id")
        @ExcludeMissing
        fun _digitalWalletTokenId(): JsonField<String> = digitalWalletTokenId

        /**
         * The direction describes the direction the funds will move, either from the cardholder to
         * the merchant or from the merchant to the cardholder.
         */
        @JsonProperty("direction")
        @ExcludeMissing
        fun _direction(): JsonField<Direction> = direction

        /**
         * The merchant identifier (commonly abbreviated as MID) of the merchant the card is
         * transacting with.
         */
        @JsonProperty("merchant_acceptor_id")
        @ExcludeMissing
        fun _merchantAcceptorId(): JsonField<String> = merchantAcceptorId

        /**
         * The Merchant Category Code (commonly abbreviated as MCC) of the merchant the card is
         * transacting with.
         */
        @JsonProperty("merchant_category_code")
        @ExcludeMissing
        fun _merchantCategoryCode(): JsonField<String> = merchantCategoryCode

        /** The city the merchant resides in. */
        @JsonProperty("merchant_city")
        @ExcludeMissing
        fun _merchantCity(): JsonField<String> = merchantCity

        /** The country the merchant resides in. */
        @JsonProperty("merchant_country")
        @ExcludeMissing
        fun _merchantCountry(): JsonField<String> = merchantCountry

        /** The merchant descriptor of the merchant the card is transacting with. */
        @JsonProperty("merchant_descriptor")
        @ExcludeMissing
        fun _merchantDescriptor(): JsonField<String> = merchantDescriptor

        /**
         * The merchant's postal code. For US merchants this is either a 5-digit or 9-digit ZIP
         * code, where the first 5 and last 4 are separated by a dash.
         */
        @JsonProperty("merchant_postal_code")
        @ExcludeMissing
        fun _merchantPostalCode(): JsonField<String> = merchantPostalCode

        /** The state the merchant resides in. */
        @JsonProperty("merchant_state")
        @ExcludeMissing
        fun _merchantState(): JsonField<String> = merchantState

        /** Fields specific to the `network`. */
        @JsonProperty("network_details")
        @ExcludeMissing
        fun _networkDetails(): JsonField<NetworkDetails> = networkDetails

        /** Network-specific identifiers for a specific request or transaction. */
        @JsonProperty("network_identifiers")
        @ExcludeMissing
        fun _networkIdentifiers(): JsonField<NetworkIdentifiers> = networkIdentifiers

        /**
         * The risk score generated by the card network. For Visa this is the Visa Advanced
         * Authorization risk score, from 0 to 99, where 99 is the riskiest.
         */
        @JsonProperty("network_risk_score")
        @ExcludeMissing
        fun _networkRiskScore(): JsonField<Long> = networkRiskScore

        /**
         * If the authorization was made in-person with a physical card, the Physical Card that was
         * used.
         */
        @JsonProperty("physical_card_id")
        @ExcludeMissing
        fun _physicalCardId(): JsonField<String> = physicalCardId

        /**
         * The amount of the attempted authorization in the currency the card user sees at the time
         * of purchase, in the minor unit of that currency. For dollars, for example, this is cents.
         */
        @JsonProperty("presentment_amount")
        @ExcludeMissing
        fun _presentmentAmount(): JsonField<Long> = presentmentAmount

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the currency the user
         * sees at the time of purchase.
         */
        @JsonProperty("presentment_currency")
        @ExcludeMissing
        fun _presentmentCurrency(): JsonField<String> = presentmentCurrency

        /**
         * The processing category describes the intent behind the authorization, such as whether it
         * was used for bill payments or an automatic fuel dispenser.
         */
        @JsonProperty("processing_category")
        @ExcludeMissing
        fun _processingCategory(): JsonField<ProcessingCategory> = processingCategory

        /** Fields specific to the type of request, such as an incremental authorization. */
        @JsonProperty("request_details")
        @ExcludeMissing
        fun _requestDetails(): JsonField<RequestDetails> = requestDetails

        /**
         * The amount of the attempted authorization in the currency it will be settled in. This
         * currency is the same as that of the Account the card belongs to.
         */
        @JsonProperty("settlement_amount")
        @ExcludeMissing
        fun _settlementAmount(): JsonField<Long> = settlementAmount

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the currency the
         * transaction will be settled in.
         */
        @JsonProperty("settlement_currency")
        @ExcludeMissing
        fun _settlementCurrency(): JsonField<String> = settlementCurrency

        /**
         * The terminal identifier (commonly abbreviated as TID) of the terminal the card is
         * transacting with.
         */
        @JsonProperty("terminal_id")
        @ExcludeMissing
        fun _terminalId(): JsonField<String> = terminalId

        /**
         * The identifier of the Card Payment this authorization will belong to. Available in the
         * API once the card authorization has completed.
         */
        @JsonProperty("upcoming_card_payment_id")
        @ExcludeMissing
        fun _upcomingCardPaymentId(): JsonField<String> = upcomingCardPaymentId

        /** Fields related to verification of cardholder-provided values. */
        @JsonProperty("verification")
        @ExcludeMissing
        fun _verification(): JsonField<Verification> = verification

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): CardAuthorization = apply {
            if (validated) {
                return@apply
            }

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

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [CardAuthorization].
             *
             * The following fields are required:
             * ```java
             * .accountId()
             * .cardId()
             * .decision()
             * .digitalWalletTokenId()
             * .direction()
             * .merchantAcceptorId()
             * .merchantCategoryCode()
             * .merchantCity()
             * .merchantCountry()
             * .merchantDescriptor()
             * .merchantPostalCode()
             * .merchantState()
             * .networkDetails()
             * .networkIdentifiers()
             * .networkRiskScore()
             * .physicalCardId()
             * .presentmentAmount()
             * .presentmentCurrency()
             * .processingCategory()
             * .requestDetails()
             * .settlementAmount()
             * .settlementCurrency()
             * .terminalId()
             * .upcomingCardPaymentId()
             * .verification()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CardAuthorization]. */
        class Builder internal constructor() {

            private var accountId: JsonField<String>? = null
            private var cardId: JsonField<String>? = null
            private var decision: JsonField<Decision>? = null
            private var digitalWalletTokenId: JsonField<String>? = null
            private var direction: JsonField<Direction>? = null
            private var merchantAcceptorId: JsonField<String>? = null
            private var merchantCategoryCode: JsonField<String>? = null
            private var merchantCity: JsonField<String>? = null
            private var merchantCountry: JsonField<String>? = null
            private var merchantDescriptor: JsonField<String>? = null
            private var merchantPostalCode: JsonField<String>? = null
            private var merchantState: JsonField<String>? = null
            private var networkDetails: JsonField<NetworkDetails>? = null
            private var networkIdentifiers: JsonField<NetworkIdentifiers>? = null
            private var networkRiskScore: JsonField<Long>? = null
            private var physicalCardId: JsonField<String>? = null
            private var presentmentAmount: JsonField<Long>? = null
            private var presentmentCurrency: JsonField<String>? = null
            private var processingCategory: JsonField<ProcessingCategory>? = null
            private var requestDetails: JsonField<RequestDetails>? = null
            private var settlementAmount: JsonField<Long>? = null
            private var settlementCurrency: JsonField<String>? = null
            private var terminalId: JsonField<String>? = null
            private var upcomingCardPaymentId: JsonField<String>? = null
            private var verification: JsonField<Verification>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(cardAuthorization: CardAuthorization) = apply {
                accountId = cardAuthorization.accountId
                cardId = cardAuthorization.cardId
                decision = cardAuthorization.decision
                digitalWalletTokenId = cardAuthorization.digitalWalletTokenId
                direction = cardAuthorization.direction
                merchantAcceptorId = cardAuthorization.merchantAcceptorId
                merchantCategoryCode = cardAuthorization.merchantCategoryCode
                merchantCity = cardAuthorization.merchantCity
                merchantCountry = cardAuthorization.merchantCountry
                merchantDescriptor = cardAuthorization.merchantDescriptor
                merchantPostalCode = cardAuthorization.merchantPostalCode
                merchantState = cardAuthorization.merchantState
                networkDetails = cardAuthorization.networkDetails
                networkIdentifiers = cardAuthorization.networkIdentifiers
                networkRiskScore = cardAuthorization.networkRiskScore
                physicalCardId = cardAuthorization.physicalCardId
                presentmentAmount = cardAuthorization.presentmentAmount
                presentmentCurrency = cardAuthorization.presentmentCurrency
                processingCategory = cardAuthorization.processingCategory
                requestDetails = cardAuthorization.requestDetails
                settlementAmount = cardAuthorization.settlementAmount
                settlementCurrency = cardAuthorization.settlementCurrency
                terminalId = cardAuthorization.terminalId
                upcomingCardPaymentId = cardAuthorization.upcomingCardPaymentId
                verification = cardAuthorization.verification
                additionalProperties = cardAuthorization.additionalProperties.toMutableMap()
            }

            /** The identifier of the Account the authorization will debit. */
            fun accountId(accountId: String) = accountId(JsonField.of(accountId))

            /** The identifier of the Account the authorization will debit. */
            fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

            /** The identifier of the Card that is being authorized. */
            fun cardId(cardId: String) = cardId(JsonField.of(cardId))

            /** The identifier of the Card that is being authorized. */
            fun cardId(cardId: JsonField<String>) = apply { this.cardId = cardId }

            /** Whether or not the authorization was approved. */
            fun decision(decision: Decision?) = decision(JsonField.ofNullable(decision))

            /** Whether or not the authorization was approved. */
            fun decision(decision: Optional<Decision>) = decision(decision.orElse(null))

            /** Whether or not the authorization was approved. */
            fun decision(decision: JsonField<Decision>) = apply { this.decision = decision }

            /**
             * If the authorization was made via a Digital Wallet Token (such as an Apple Pay
             * purchase), the identifier of the token that was used.
             */
            fun digitalWalletTokenId(digitalWalletTokenId: String?) =
                digitalWalletTokenId(JsonField.ofNullable(digitalWalletTokenId))

            /**
             * If the authorization was made via a Digital Wallet Token (such as an Apple Pay
             * purchase), the identifier of the token that was used.
             */
            fun digitalWalletTokenId(digitalWalletTokenId: Optional<String>) =
                digitalWalletTokenId(digitalWalletTokenId.orElse(null))

            /**
             * If the authorization was made via a Digital Wallet Token (such as an Apple Pay
             * purchase), the identifier of the token that was used.
             */
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
            fun merchantCategoryCode(merchantCategoryCode: JsonField<String>) = apply {
                this.merchantCategoryCode = merchantCategoryCode
            }

            /** The city the merchant resides in. */
            fun merchantCity(merchantCity: String?) =
                merchantCity(JsonField.ofNullable(merchantCity))

            /** The city the merchant resides in. */
            fun merchantCity(merchantCity: Optional<String>) =
                merchantCity(merchantCity.orElse(null))

            /** The city the merchant resides in. */
            fun merchantCity(merchantCity: JsonField<String>) = apply {
                this.merchantCity = merchantCity
            }

            /** The country the merchant resides in. */
            fun merchantCountry(merchantCountry: String) =
                merchantCountry(JsonField.of(merchantCountry))

            /** The country the merchant resides in. */
            fun merchantCountry(merchantCountry: JsonField<String>) = apply {
                this.merchantCountry = merchantCountry
            }

            /** The merchant descriptor of the merchant the card is transacting with. */
            fun merchantDescriptor(merchantDescriptor: String) =
                merchantDescriptor(JsonField.of(merchantDescriptor))

            /** The merchant descriptor of the merchant the card is transacting with. */
            fun merchantDescriptor(merchantDescriptor: JsonField<String>) = apply {
                this.merchantDescriptor = merchantDescriptor
            }

            /**
             * The merchant's postal code. For US merchants this is either a 5-digit or 9-digit ZIP
             * code, where the first 5 and last 4 are separated by a dash.
             */
            fun merchantPostalCode(merchantPostalCode: String?) =
                merchantPostalCode(JsonField.ofNullable(merchantPostalCode))

            /**
             * The merchant's postal code. For US merchants this is either a 5-digit or 9-digit ZIP
             * code, where the first 5 and last 4 are separated by a dash.
             */
            fun merchantPostalCode(merchantPostalCode: Optional<String>) =
                merchantPostalCode(merchantPostalCode.orElse(null))

            /**
             * The merchant's postal code. For US merchants this is either a 5-digit or 9-digit ZIP
             * code, where the first 5 and last 4 are separated by a dash.
             */
            fun merchantPostalCode(merchantPostalCode: JsonField<String>) = apply {
                this.merchantPostalCode = merchantPostalCode
            }

            /** The state the merchant resides in. */
            fun merchantState(merchantState: String?) =
                merchantState(JsonField.ofNullable(merchantState))

            /** The state the merchant resides in. */
            fun merchantState(merchantState: Optional<String>) =
                merchantState(merchantState.orElse(null))

            /** The state the merchant resides in. */
            fun merchantState(merchantState: JsonField<String>) = apply {
                this.merchantState = merchantState
            }

            /** Fields specific to the `network`. */
            fun networkDetails(networkDetails: NetworkDetails) =
                networkDetails(JsonField.of(networkDetails))

            /** Fields specific to the `network`. */
            fun networkDetails(networkDetails: JsonField<NetworkDetails>) = apply {
                this.networkDetails = networkDetails
            }

            /** Network-specific identifiers for a specific request or transaction. */
            fun networkIdentifiers(networkIdentifiers: NetworkIdentifiers) =
                networkIdentifiers(JsonField.of(networkIdentifiers))

            /** Network-specific identifiers for a specific request or transaction. */
            fun networkIdentifiers(networkIdentifiers: JsonField<NetworkIdentifiers>) = apply {
                this.networkIdentifiers = networkIdentifiers
            }

            /**
             * The risk score generated by the card network. For Visa this is the Visa Advanced
             * Authorization risk score, from 0 to 99, where 99 is the riskiest.
             */
            fun networkRiskScore(networkRiskScore: Long?) =
                networkRiskScore(JsonField.ofNullable(networkRiskScore))

            /**
             * The risk score generated by the card network. For Visa this is the Visa Advanced
             * Authorization risk score, from 0 to 99, where 99 is the riskiest.
             */
            fun networkRiskScore(networkRiskScore: Long) =
                networkRiskScore(networkRiskScore as Long?)

            /**
             * The risk score generated by the card network. For Visa this is the Visa Advanced
             * Authorization risk score, from 0 to 99, where 99 is the riskiest.
             */
            @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
            fun networkRiskScore(networkRiskScore: Optional<Long>) =
                networkRiskScore(networkRiskScore.orElse(null) as Long?)

            /**
             * The risk score generated by the card network. For Visa this is the Visa Advanced
             * Authorization risk score, from 0 to 99, where 99 is the riskiest.
             */
            fun networkRiskScore(networkRiskScore: JsonField<Long>) = apply {
                this.networkRiskScore = networkRiskScore
            }

            /**
             * If the authorization was made in-person with a physical card, the Physical Card that
             * was used.
             */
            fun physicalCardId(physicalCardId: String?) =
                physicalCardId(JsonField.ofNullable(physicalCardId))

            /**
             * If the authorization was made in-person with a physical card, the Physical Card that
             * was used.
             */
            fun physicalCardId(physicalCardId: Optional<String>) =
                physicalCardId(physicalCardId.orElse(null))

            /**
             * If the authorization was made in-person with a physical card, the Physical Card that
             * was used.
             */
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
            fun processingCategory(processingCategory: JsonField<ProcessingCategory>) = apply {
                this.processingCategory = processingCategory
            }

            /** Fields specific to the type of request, such as an incremental authorization. */
            fun requestDetails(requestDetails: RequestDetails) =
                requestDetails(JsonField.of(requestDetails))

            /** Fields specific to the type of request, such as an incremental authorization. */
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
            fun settlementCurrency(settlementCurrency: JsonField<String>) = apply {
                this.settlementCurrency = settlementCurrency
            }

            /**
             * The terminal identifier (commonly abbreviated as TID) of the terminal the card is
             * transacting with.
             */
            fun terminalId(terminalId: String?) = terminalId(JsonField.ofNullable(terminalId))

            /**
             * The terminal identifier (commonly abbreviated as TID) of the terminal the card is
             * transacting with.
             */
            fun terminalId(terminalId: Optional<String>) = terminalId(terminalId.orElse(null))

            /**
             * The terminal identifier (commonly abbreviated as TID) of the terminal the card is
             * transacting with.
             */
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
            fun upcomingCardPaymentId(upcomingCardPaymentId: JsonField<String>) = apply {
                this.upcomingCardPaymentId = upcomingCardPaymentId
            }

            /** Fields related to verification of cardholder-provided values. */
            fun verification(verification: Verification) = verification(JsonField.of(verification))

            /** Fields related to verification of cardholder-provided values. */
            fun verification(verification: JsonField<Verification>) = apply {
                this.verification = verification
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            fun build(): CardAuthorization =
                CardAuthorization(
                    checkRequired("accountId", accountId),
                    checkRequired("cardId", cardId),
                    checkRequired("decision", decision),
                    checkRequired("digitalWalletTokenId", digitalWalletTokenId),
                    checkRequired("direction", direction),
                    checkRequired("merchantAcceptorId", merchantAcceptorId),
                    checkRequired("merchantCategoryCode", merchantCategoryCode),
                    checkRequired("merchantCity", merchantCity),
                    checkRequired("merchantCountry", merchantCountry),
                    checkRequired("merchantDescriptor", merchantDescriptor),
                    checkRequired("merchantPostalCode", merchantPostalCode),
                    checkRequired("merchantState", merchantState),
                    checkRequired("networkDetails", networkDetails),
                    checkRequired("networkIdentifiers", networkIdentifiers),
                    checkRequired("networkRiskScore", networkRiskScore),
                    checkRequired("physicalCardId", physicalCardId),
                    checkRequired("presentmentAmount", presentmentAmount),
                    checkRequired("presentmentCurrency", presentmentCurrency),
                    checkRequired("processingCategory", processingCategory),
                    checkRequired("requestDetails", requestDetails),
                    checkRequired("settlementAmount", settlementAmount),
                    checkRequired("settlementCurrency", settlementCurrency),
                    checkRequired("terminalId", terminalId),
                    checkRequired("upcomingCardPaymentId", upcomingCardPaymentId),
                    checkRequired("verification", verification),
                    additionalProperties.toImmutable(),
                )
        }

        /** Whether or not the authorization was approved. */
        class Decision @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                /** Approve the authorization. */
                @JvmField val APPROVE = of("approve")

                /** Decline the authorization. */
                @JvmField val DECLINE = of("decline")

                @JvmStatic fun of(value: String) = Decision(JsonField.of(value))
            }

            /** An enum containing [Decision]'s known values. */
            enum class Known {
                /** Approve the authorization. */
                APPROVE,
                /** Decline the authorization. */
                DECLINE,
            }

            /**
             * An enum containing [Decision]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Decision] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /** Approve the authorization. */
                APPROVE,
                /** Decline the authorization. */
                DECLINE,
                /**
                 * An enum member indicating that [Decision] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    APPROVE -> Value.APPROVE
                    DECLINE -> Value.DECLINE
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws IncreaseInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    APPROVE -> Known.APPROVE
                    DECLINE -> Known.DECLINE
                    else -> throw IncreaseInvalidDataException("Unknown Decision: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws IncreaseInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    IncreaseInvalidDataException("Value is not a String")
                }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Decision && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * The direction describes the direction the funds will move, either from the cardholder to
         * the merchant or from the merchant to the cardholder.
         */
        class Direction @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                /** A regular card authorization where funds are debited from the cardholder. */
                @JvmField val SETTLEMENT = of("settlement")

                /**
                 * A refund card authorization, sometimes referred to as a credit voucher
                 * authorization, where funds are credited to the cardholder.
                 */
                @JvmField val REFUND = of("refund")

                @JvmStatic fun of(value: String) = Direction(JsonField.of(value))
            }

            /** An enum containing [Direction]'s known values. */
            enum class Known {
                /** A regular card authorization where funds are debited from the cardholder. */
                SETTLEMENT,
                /**
                 * A refund card authorization, sometimes referred to as a credit voucher
                 * authorization, where funds are credited to the cardholder.
                 */
                REFUND,
            }

            /**
             * An enum containing [Direction]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Direction] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /** A regular card authorization where funds are debited from the cardholder. */
                SETTLEMENT,
                /**
                 * A refund card authorization, sometimes referred to as a credit voucher
                 * authorization, where funds are credited to the cardholder.
                 */
                REFUND,
                /**
                 * An enum member indicating that [Direction] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    SETTLEMENT -> Value.SETTLEMENT
                    REFUND -> Value.REFUND
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws IncreaseInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    SETTLEMENT -> Known.SETTLEMENT
                    REFUND -> Known.REFUND
                    else -> throw IncreaseInvalidDataException("Unknown Direction: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws IncreaseInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    IncreaseInvalidDataException("Value is not a String")
                }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Direction && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Fields specific to the `network`. */
        @NoAutoDetect
        class NetworkDetails
        @JsonCreator
        private constructor(
            @JsonProperty("category")
            @ExcludeMissing
            private val category: JsonField<Category> = JsonMissing.of(),
            @JsonProperty("visa")
            @ExcludeMissing
            private val visa: JsonField<Visa> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The payment network used to process this card authorization. */
            fun category(): Category = category.getRequired("category")

            /** Fields specific to the `visa` network. */
            fun visa(): Optional<Visa> = Optional.ofNullable(visa.getNullable("visa"))

            /** The payment network used to process this card authorization. */
            @JsonProperty("category")
            @ExcludeMissing
            fun _category(): JsonField<Category> = category

            /** Fields specific to the `visa` network. */
            @JsonProperty("visa") @ExcludeMissing fun _visa(): JsonField<Visa> = visa

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): NetworkDetails = apply {
                if (validated) {
                    return@apply
                }

                category()
                visa().ifPresent { it.validate() }
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [NetworkDetails].
                 *
                 * The following fields are required:
                 * ```java
                 * .category()
                 * .visa()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [NetworkDetails]. */
            class Builder internal constructor() {

                private var category: JsonField<Category>? = null
                private var visa: JsonField<Visa>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(networkDetails: NetworkDetails) = apply {
                    category = networkDetails.category
                    visa = networkDetails.visa
                    additionalProperties = networkDetails.additionalProperties.toMutableMap()
                }

                /** The payment network used to process this card authorization. */
                fun category(category: Category) = category(JsonField.of(category))

                /** The payment network used to process this card authorization. */
                fun category(category: JsonField<Category>) = apply { this.category = category }

                /** Fields specific to the `visa` network. */
                fun visa(visa: Visa?) = visa(JsonField.ofNullable(visa))

                /** Fields specific to the `visa` network. */
                fun visa(visa: Optional<Visa>) = visa(visa.orElse(null))

                /** Fields specific to the `visa` network. */
                fun visa(visa: JsonField<Visa>) = apply { this.visa = visa }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): NetworkDetails =
                    NetworkDetails(
                        checkRequired("category", category),
                        checkRequired("visa", visa),
                        additionalProperties.toImmutable(),
                    )
            }

            /** The payment network used to process this card authorization. */
            class Category @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    /** Visa */
                    @JvmField val VISA = of("visa")

                    @JvmStatic fun of(value: String) = Category(JsonField.of(value))
                }

                /** An enum containing [Category]'s known values. */
                enum class Known {
                    /** Visa */
                    VISA
                }

                /**
                 * An enum containing [Category]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Category] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    /** Visa */
                    VISA,
                    /**
                     * An enum member indicating that [Category] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        VISA -> Value.VISA
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws IncreaseInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        VISA -> Known.VISA
                        else -> throw IncreaseInvalidDataException("Unknown Category: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws IncreaseInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        IncreaseInvalidDataException("Value is not a String")
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Category && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** Fields specific to the `visa` network. */
            @NoAutoDetect
            class Visa
            @JsonCreator
            private constructor(
                @JsonProperty("electronic_commerce_indicator")
                @ExcludeMissing
                private val electronicCommerceIndicator: JsonField<ElectronicCommerceIndicator> =
                    JsonMissing.of(),
                @JsonProperty("point_of_service_entry_mode")
                @ExcludeMissing
                private val pointOfServiceEntryMode: JsonField<PointOfServiceEntryMode> =
                    JsonMissing.of(),
                @JsonProperty("stand_in_processing_reason")
                @ExcludeMissing
                private val standInProcessingReason: JsonField<StandInProcessingReason> =
                    JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

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
                fun _electronicCommerceIndicator(): JsonField<ElectronicCommerceIndicator> =
                    electronicCommerceIndicator

                /**
                 * The method used to enter the cardholder's primary account number and card
                 * expiration date.
                 */
                @JsonProperty("point_of_service_entry_mode")
                @ExcludeMissing
                fun _pointOfServiceEntryMode(): JsonField<PointOfServiceEntryMode> =
                    pointOfServiceEntryMode

                /**
                 * Only present when `actioner: network`. Describes why a card authorization was
                 * approved or declined by Visa through stand-in processing.
                 */
                @JsonProperty("stand_in_processing_reason")
                @ExcludeMissing
                fun _standInProcessingReason(): JsonField<StandInProcessingReason> =
                    standInProcessingReason

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): Visa = apply {
                    if (validated) {
                        return@apply
                    }

                    electronicCommerceIndicator()
                    pointOfServiceEntryMode()
                    standInProcessingReason()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [Visa].
                     *
                     * The following fields are required:
                     * ```java
                     * .electronicCommerceIndicator()
                     * .pointOfServiceEntryMode()
                     * .standInProcessingReason()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Visa]. */
                class Builder internal constructor() {

                    private var electronicCommerceIndicator:
                        JsonField<ElectronicCommerceIndicator>? =
                        null
                    private var pointOfServiceEntryMode: JsonField<PointOfServiceEntryMode>? = null
                    private var standInProcessingReason: JsonField<StandInProcessingReason>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(visa: Visa) = apply {
                        electronicCommerceIndicator = visa.electronicCommerceIndicator
                        pointOfServiceEntryMode = visa.pointOfServiceEntryMode
                        standInProcessingReason = visa.standInProcessingReason
                        additionalProperties = visa.additionalProperties.toMutableMap()
                    }

                    /**
                     * For electronic commerce transactions, this identifies the level of security
                     * used in obtaining the customer's payment credential. For mail or telephone
                     * order transactions, identifies the type of mail or telephone order.
                     */
                    fun electronicCommerceIndicator(
                        electronicCommerceIndicator: ElectronicCommerceIndicator?
                    ) =
                        electronicCommerceIndicator(
                            JsonField.ofNullable(electronicCommerceIndicator)
                        )

                    /**
                     * For electronic commerce transactions, this identifies the level of security
                     * used in obtaining the customer's payment credential. For mail or telephone
                     * order transactions, identifies the type of mail or telephone order.
                     */
                    fun electronicCommerceIndicator(
                        electronicCommerceIndicator: Optional<ElectronicCommerceIndicator>
                    ) = electronicCommerceIndicator(electronicCommerceIndicator.orElse(null))

                    /**
                     * For electronic commerce transactions, this identifies the level of security
                     * used in obtaining the customer's payment credential. For mail or telephone
                     * order transactions, identifies the type of mail or telephone order.
                     */
                    fun electronicCommerceIndicator(
                        electronicCommerceIndicator: JsonField<ElectronicCommerceIndicator>
                    ) = apply { this.electronicCommerceIndicator = electronicCommerceIndicator }

                    /**
                     * The method used to enter the cardholder's primary account number and card
                     * expiration date.
                     */
                    fun pointOfServiceEntryMode(pointOfServiceEntryMode: PointOfServiceEntryMode?) =
                        pointOfServiceEntryMode(JsonField.ofNullable(pointOfServiceEntryMode))

                    /**
                     * The method used to enter the cardholder's primary account number and card
                     * expiration date.
                     */
                    fun pointOfServiceEntryMode(
                        pointOfServiceEntryMode: Optional<PointOfServiceEntryMode>
                    ) = pointOfServiceEntryMode(pointOfServiceEntryMode.orElse(null))

                    /**
                     * The method used to enter the cardholder's primary account number and card
                     * expiration date.
                     */
                    fun pointOfServiceEntryMode(
                        pointOfServiceEntryMode: JsonField<PointOfServiceEntryMode>
                    ) = apply { this.pointOfServiceEntryMode = pointOfServiceEntryMode }

                    /**
                     * Only present when `actioner: network`. Describes why a card authorization was
                     * approved or declined by Visa through stand-in processing.
                     */
                    fun standInProcessingReason(standInProcessingReason: StandInProcessingReason?) =
                        standInProcessingReason(JsonField.ofNullable(standInProcessingReason))

                    /**
                     * Only present when `actioner: network`. Describes why a card authorization was
                     * approved or declined by Visa through stand-in processing.
                     */
                    fun standInProcessingReason(
                        standInProcessingReason: Optional<StandInProcessingReason>
                    ) = standInProcessingReason(standInProcessingReason.orElse(null))

                    /**
                     * Only present when `actioner: network`. Describes why a card authorization was
                     * approved or declined by Visa through stand-in processing.
                     */
                    fun standInProcessingReason(
                        standInProcessingReason: JsonField<StandInProcessingReason>
                    ) = apply { this.standInProcessingReason = standInProcessingReason }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    fun build(): Visa =
                        Visa(
                            checkRequired(
                                "electronicCommerceIndicator",
                                electronicCommerceIndicator,
                            ),
                            checkRequired("pointOfServiceEntryMode", pointOfServiceEntryMode),
                            checkRequired("standInProcessingReason", standInProcessingReason),
                            additionalProperties.toImmutable(),
                        )
                }

                /**
                 * For electronic commerce transactions, this identifies the level of security used
                 * in obtaining the customer's payment credential. For mail or telephone order
                 * transactions, identifies the type of mail or telephone order.
                 */
                class ElectronicCommerceIndicator
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        /**
                         * Single transaction of a mail/phone order: Use to indicate that the
                         * transaction is a mail/phone order purchase, not a recurring transaction
                         * or installment payment. For domestic transactions in the US region, this
                         * value may also indicate one bill payment transaction in the card-present
                         * or card-absent environments.
                         */
                        @JvmField val MAIL_PHONE_ORDER = of("mail_phone_order")

                        /**
                         * Recurring transaction: Payment indicator used to indicate a recurring
                         * transaction that originates from an acquirer in the US region.
                         */
                        @JvmField val RECURRING = of("recurring")

                        /**
                         * Installment payment: Payment indicator used to indicate one purchase of
                         * goods or services that is billed to the account in multiple charges over
                         * a period of time agreed upon by the cardholder and merchant from
                         * transactions that originate from an acquirer in the US region.
                         */
                        @JvmField val INSTALLMENT = of("installment")

                        /**
                         * Unknown classification: other mail order: Use to indicate that the type
                         * of mail/telephone order is unknown.
                         */
                        @JvmField val UNKNOWN_MAIL_PHONE_ORDER = of("unknown_mail_phone_order")

                        /**
                         * Secure electronic commerce transaction: Use to indicate that the
                         * electronic commerce transaction has been authenticated using e.g., 3-D
                         * Secure
                         */
                        @JvmField val SECURE_ELECTRONIC_COMMERCE = of("secure_electronic_commerce")

                        /**
                         * Non-authenticated security transaction at a 3-D Secure-capable merchant,
                         * and merchant attempted to authenticate the cardholder using 3-D Secure:
                         * Use to identify an electronic commerce transaction where the merchant
                         * attempted to authenticate the cardholder using 3-D Secure, but was unable
                         * to complete the authentication because the issuer or cardholder does not
                         * participate in the 3-D Secure program.
                         */
                        @JvmField
                        val NON_AUTHENTICATED_SECURITY_TRANSACTION_AT_3DS_CAPABLE_MERCHANT =
                            of("non_authenticated_security_transaction_at_3ds_capable_merchant")

                        /**
                         * Non-authenticated security transaction: Use to identify an electronic
                         * commerce transaction that uses data encryption for security however ,
                         * cardholder authentication is not performed using 3-D Secure.
                         */
                        @JvmField
                        val NON_AUTHENTICATED_SECURITY_TRANSACTION =
                            of("non_authenticated_security_transaction")

                        /**
                         * Non-secure transaction: Use to identify an electronic commerce
                         * transaction that has no data protection.
                         */
                        @JvmField val NON_SECURE_TRANSACTION = of("non_secure_transaction")

                        @JvmStatic
                        fun of(value: String) = ElectronicCommerceIndicator(JsonField.of(value))
                    }

                    /** An enum containing [ElectronicCommerceIndicator]'s known values. */
                    enum class Known {
                        /**
                         * Single transaction of a mail/phone order: Use to indicate that the
                         * transaction is a mail/phone order purchase, not a recurring transaction
                         * or installment payment. For domestic transactions in the US region, this
                         * value may also indicate one bill payment transaction in the card-present
                         * or card-absent environments.
                         */
                        MAIL_PHONE_ORDER,
                        /**
                         * Recurring transaction: Payment indicator used to indicate a recurring
                         * transaction that originates from an acquirer in the US region.
                         */
                        RECURRING,
                        /**
                         * Installment payment: Payment indicator used to indicate one purchase of
                         * goods or services that is billed to the account in multiple charges over
                         * a period of time agreed upon by the cardholder and merchant from
                         * transactions that originate from an acquirer in the US region.
                         */
                        INSTALLMENT,
                        /**
                         * Unknown classification: other mail order: Use to indicate that the type
                         * of mail/telephone order is unknown.
                         */
                        UNKNOWN_MAIL_PHONE_ORDER,
                        /**
                         * Secure electronic commerce transaction: Use to indicate that the
                         * electronic commerce transaction has been authenticated using e.g., 3-D
                         * Secure
                         */
                        SECURE_ELECTRONIC_COMMERCE,
                        /**
                         * Non-authenticated security transaction at a 3-D Secure-capable merchant,
                         * and merchant attempted to authenticate the cardholder using 3-D Secure:
                         * Use to identify an electronic commerce transaction where the merchant
                         * attempted to authenticate the cardholder using 3-D Secure, but was unable
                         * to complete the authentication because the issuer or cardholder does not
                         * participate in the 3-D Secure program.
                         */
                        NON_AUTHENTICATED_SECURITY_TRANSACTION_AT_3DS_CAPABLE_MERCHANT,
                        /**
                         * Non-authenticated security transaction: Use to identify an electronic
                         * commerce transaction that uses data encryption for security however ,
                         * cardholder authentication is not performed using 3-D Secure.
                         */
                        NON_AUTHENTICATED_SECURITY_TRANSACTION,
                        /**
                         * Non-secure transaction: Use to identify an electronic commerce
                         * transaction that has no data protection.
                         */
                        NON_SECURE_TRANSACTION,
                    }

                    /**
                     * An enum containing [ElectronicCommerceIndicator]'s known values, as well as
                     * an [_UNKNOWN] member.
                     *
                     * An instance of [ElectronicCommerceIndicator] can contain an unknown value in
                     * a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        /**
                         * Single transaction of a mail/phone order: Use to indicate that the
                         * transaction is a mail/phone order purchase, not a recurring transaction
                         * or installment payment. For domestic transactions in the US region, this
                         * value may also indicate one bill payment transaction in the card-present
                         * or card-absent environments.
                         */
                        MAIL_PHONE_ORDER,
                        /**
                         * Recurring transaction: Payment indicator used to indicate a recurring
                         * transaction that originates from an acquirer in the US region.
                         */
                        RECURRING,
                        /**
                         * Installment payment: Payment indicator used to indicate one purchase of
                         * goods or services that is billed to the account in multiple charges over
                         * a period of time agreed upon by the cardholder and merchant from
                         * transactions that originate from an acquirer in the US region.
                         */
                        INSTALLMENT,
                        /**
                         * Unknown classification: other mail order: Use to indicate that the type
                         * of mail/telephone order is unknown.
                         */
                        UNKNOWN_MAIL_PHONE_ORDER,
                        /**
                         * Secure electronic commerce transaction: Use to indicate that the
                         * electronic commerce transaction has been authenticated using e.g., 3-D
                         * Secure
                         */
                        SECURE_ELECTRONIC_COMMERCE,
                        /**
                         * Non-authenticated security transaction at a 3-D Secure-capable merchant,
                         * and merchant attempted to authenticate the cardholder using 3-D Secure:
                         * Use to identify an electronic commerce transaction where the merchant
                         * attempted to authenticate the cardholder using 3-D Secure, but was unable
                         * to complete the authentication because the issuer or cardholder does not
                         * participate in the 3-D Secure program.
                         */
                        NON_AUTHENTICATED_SECURITY_TRANSACTION_AT_3DS_CAPABLE_MERCHANT,
                        /**
                         * Non-authenticated security transaction: Use to identify an electronic
                         * commerce transaction that uses data encryption for security however ,
                         * cardholder authentication is not performed using 3-D Secure.
                         */
                        NON_AUTHENTICATED_SECURITY_TRANSACTION,
                        /**
                         * Non-secure transaction: Use to identify an electronic commerce
                         * transaction that has no data protection.
                         */
                        NON_SECURE_TRANSACTION,
                        /**
                         * An enum member indicating that [ElectronicCommerceIndicator] was
                         * instantiated with an unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
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

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws IncreaseInvalidDataException if this class instance's value is a not
                     *   a known member.
                     */
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

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws IncreaseInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            IncreaseInvalidDataException("Value is not a String")
                        }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is ElectronicCommerceIndicator && value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                /**
                 * The method used to enter the cardholder's primary account number and card
                 * expiration date.
                 */
                class PointOfServiceEntryMode
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        /** Unknown */
                        @JvmField val UNKNOWN = of("unknown")

                        /** Manual key entry */
                        @JvmField val MANUAL = of("manual")

                        /** Magnetic stripe read, without card verification value */
                        @JvmField val MAGNETIC_STRIPE_NO_CVV = of("magnetic_stripe_no_cvv")

                        /** Optical code */
                        @JvmField val OPTICAL_CODE = of("optical_code")

                        /** Contact chip card */
                        @JvmField val INTEGRATED_CIRCUIT_CARD = of("integrated_circuit_card")

                        /** Contactless read of chip card */
                        @JvmField val CONTACTLESS = of("contactless")

                        /**
                         * Transaction initiated using a credential that has previously been stored
                         * on file
                         */
                        @JvmField val CREDENTIAL_ON_FILE = of("credential_on_file")

                        /** Magnetic stripe read */
                        @JvmField val MAGNETIC_STRIPE = of("magnetic_stripe")

                        /** Contactless read of magnetic stripe data */
                        @JvmField
                        val CONTACTLESS_MAGNETIC_STRIPE = of("contactless_magnetic_stripe")

                        /** Contact chip card, without card verification value */
                        @JvmField
                        val INTEGRATED_CIRCUIT_CARD_NO_CVV = of("integrated_circuit_card_no_cvv")

                        @JvmStatic
                        fun of(value: String) = PointOfServiceEntryMode(JsonField.of(value))
                    }

                    /** An enum containing [PointOfServiceEntryMode]'s known values. */
                    enum class Known {
                        /** Unknown */
                        UNKNOWN,
                        /** Manual key entry */
                        MANUAL,
                        /** Magnetic stripe read, without card verification value */
                        MAGNETIC_STRIPE_NO_CVV,
                        /** Optical code */
                        OPTICAL_CODE,
                        /** Contact chip card */
                        INTEGRATED_CIRCUIT_CARD,
                        /** Contactless read of chip card */
                        CONTACTLESS,
                        /**
                         * Transaction initiated using a credential that has previously been stored
                         * on file
                         */
                        CREDENTIAL_ON_FILE,
                        /** Magnetic stripe read */
                        MAGNETIC_STRIPE,
                        /** Contactless read of magnetic stripe data */
                        CONTACTLESS_MAGNETIC_STRIPE,
                        /** Contact chip card, without card verification value */
                        INTEGRATED_CIRCUIT_CARD_NO_CVV,
                    }

                    /**
                     * An enum containing [PointOfServiceEntryMode]'s known values, as well as an
                     * [_UNKNOWN] member.
                     *
                     * An instance of [PointOfServiceEntryMode] can contain an unknown value in a
                     * couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        /** Unknown */
                        UNKNOWN,
                        /** Manual key entry */
                        MANUAL,
                        /** Magnetic stripe read, without card verification value */
                        MAGNETIC_STRIPE_NO_CVV,
                        /** Optical code */
                        OPTICAL_CODE,
                        /** Contact chip card */
                        INTEGRATED_CIRCUIT_CARD,
                        /** Contactless read of chip card */
                        CONTACTLESS,
                        /**
                         * Transaction initiated using a credential that has previously been stored
                         * on file
                         */
                        CREDENTIAL_ON_FILE,
                        /** Magnetic stripe read */
                        MAGNETIC_STRIPE,
                        /** Contactless read of magnetic stripe data */
                        CONTACTLESS_MAGNETIC_STRIPE,
                        /** Contact chip card, without card verification value */
                        INTEGRATED_CIRCUIT_CARD_NO_CVV,
                        /**
                         * An enum member indicating that [PointOfServiceEntryMode] was instantiated
                         * with an unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
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

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws IncreaseInvalidDataException if this class instance's value is a not
                     *   a known member.
                     */
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

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws IncreaseInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            IncreaseInvalidDataException("Value is not a String")
                        }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is PointOfServiceEntryMode && value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                /**
                 * Only present when `actioner: network`. Describes why a card authorization was
                 * approved or declined by Visa through stand-in processing.
                 */
                class StandInProcessingReason
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        /** Increase failed to process the authorization in a timely manner. */
                        @JvmField val ISSUER_ERROR = of("issuer_error")

                        /**
                         * The physical card read had an invalid CVV, dCVV, or authorization request
                         * cryptogram.
                         */
                        @JvmField val INVALID_PHYSICAL_CARD = of("invalid_physical_card")

                        /** The 3DS cardholder authentication verification value was invalid. */
                        @JvmField
                        val INVALID_CARDHOLDER_AUTHENTICATION_VERIFICATION_VALUE =
                            of("invalid_cardholder_authentication_verification_value")

                        /**
                         * An internal Visa error occurred. Visa uses this reason code for certain
                         * expected occurrences as well, such as Application Transaction Counter
                         * (ATC) replays.
                         */
                        @JvmField val INTERNAL_VISA_ERROR = of("internal_visa_error")

                        /**
                         * The merchant has enabled Visa's Transaction Advisory Service and requires
                         * further authentication to perform the transaction. In practice this is
                         * often utilized at fuel pumps to tell the cardholder to see the cashier.
                         */
                        @JvmField
                        val MERCHANT_TRANSACTION_ADVISORY_SERVICE_AUTHENTICATION_REQUIRED =
                            of("merchant_transaction_advisory_service_authentication_required")

                        /**
                         * The transaction was blocked by Visa's Payment Fraud Disruption service
                         * due to fraudulent Acquirer behavior, such as card testing.
                         */
                        @JvmField
                        val PAYMENT_FRAUD_DISRUPTION_ACQUIRER_BLOCK =
                            of("payment_fraud_disruption_acquirer_block")

                        /** An unspecific reason for stand-in processing. */
                        @JvmField val OTHER = of("other")

                        @JvmStatic
                        fun of(value: String) = StandInProcessingReason(JsonField.of(value))
                    }

                    /** An enum containing [StandInProcessingReason]'s known values. */
                    enum class Known {
                        /** Increase failed to process the authorization in a timely manner. */
                        ISSUER_ERROR,
                        /**
                         * The physical card read had an invalid CVV, dCVV, or authorization request
                         * cryptogram.
                         */
                        INVALID_PHYSICAL_CARD,
                        /** The 3DS cardholder authentication verification value was invalid. */
                        INVALID_CARDHOLDER_AUTHENTICATION_VERIFICATION_VALUE,
                        /**
                         * An internal Visa error occurred. Visa uses this reason code for certain
                         * expected occurrences as well, such as Application Transaction Counter
                         * (ATC) replays.
                         */
                        INTERNAL_VISA_ERROR,
                        /**
                         * The merchant has enabled Visa's Transaction Advisory Service and requires
                         * further authentication to perform the transaction. In practice this is
                         * often utilized at fuel pumps to tell the cardholder to see the cashier.
                         */
                        MERCHANT_TRANSACTION_ADVISORY_SERVICE_AUTHENTICATION_REQUIRED,
                        /**
                         * The transaction was blocked by Visa's Payment Fraud Disruption service
                         * due to fraudulent Acquirer behavior, such as card testing.
                         */
                        PAYMENT_FRAUD_DISRUPTION_ACQUIRER_BLOCK,
                        /** An unspecific reason for stand-in processing. */
                        OTHER,
                    }

                    /**
                     * An enum containing [StandInProcessingReason]'s known values, as well as an
                     * [_UNKNOWN] member.
                     *
                     * An instance of [StandInProcessingReason] can contain an unknown value in a
                     * couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        /** Increase failed to process the authorization in a timely manner. */
                        ISSUER_ERROR,
                        /**
                         * The physical card read had an invalid CVV, dCVV, or authorization request
                         * cryptogram.
                         */
                        INVALID_PHYSICAL_CARD,
                        /** The 3DS cardholder authentication verification value was invalid. */
                        INVALID_CARDHOLDER_AUTHENTICATION_VERIFICATION_VALUE,
                        /**
                         * An internal Visa error occurred. Visa uses this reason code for certain
                         * expected occurrences as well, such as Application Transaction Counter
                         * (ATC) replays.
                         */
                        INTERNAL_VISA_ERROR,
                        /**
                         * The merchant has enabled Visa's Transaction Advisory Service and requires
                         * further authentication to perform the transaction. In practice this is
                         * often utilized at fuel pumps to tell the cardholder to see the cashier.
                         */
                        MERCHANT_TRANSACTION_ADVISORY_SERVICE_AUTHENTICATION_REQUIRED,
                        /**
                         * The transaction was blocked by Visa's Payment Fraud Disruption service
                         * due to fraudulent Acquirer behavior, such as card testing.
                         */
                        PAYMENT_FRAUD_DISRUPTION_ACQUIRER_BLOCK,
                        /** An unspecific reason for stand-in processing. */
                        OTHER,
                        /**
                         * An enum member indicating that [StandInProcessingReason] was instantiated
                         * with an unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            ISSUER_ERROR -> Value.ISSUER_ERROR
                            INVALID_PHYSICAL_CARD -> Value.INVALID_PHYSICAL_CARD
                            INVALID_CARDHOLDER_AUTHENTICATION_VERIFICATION_VALUE ->
                                Value.INVALID_CARDHOLDER_AUTHENTICATION_VERIFICATION_VALUE
                            INTERNAL_VISA_ERROR -> Value.INTERNAL_VISA_ERROR
                            MERCHANT_TRANSACTION_ADVISORY_SERVICE_AUTHENTICATION_REQUIRED ->
                                Value.MERCHANT_TRANSACTION_ADVISORY_SERVICE_AUTHENTICATION_REQUIRED
                            PAYMENT_FRAUD_DISRUPTION_ACQUIRER_BLOCK ->
                                Value.PAYMENT_FRAUD_DISRUPTION_ACQUIRER_BLOCK
                            OTHER -> Value.OTHER
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws IncreaseInvalidDataException if this class instance's value is a not
                     *   a known member.
                     */
                    fun known(): Known =
                        when (this) {
                            ISSUER_ERROR -> Known.ISSUER_ERROR
                            INVALID_PHYSICAL_CARD -> Known.INVALID_PHYSICAL_CARD
                            INVALID_CARDHOLDER_AUTHENTICATION_VERIFICATION_VALUE ->
                                Known.INVALID_CARDHOLDER_AUTHENTICATION_VERIFICATION_VALUE
                            INTERNAL_VISA_ERROR -> Known.INTERNAL_VISA_ERROR
                            MERCHANT_TRANSACTION_ADVISORY_SERVICE_AUTHENTICATION_REQUIRED ->
                                Known.MERCHANT_TRANSACTION_ADVISORY_SERVICE_AUTHENTICATION_REQUIRED
                            PAYMENT_FRAUD_DISRUPTION_ACQUIRER_BLOCK ->
                                Known.PAYMENT_FRAUD_DISRUPTION_ACQUIRER_BLOCK
                            OTHER -> Known.OTHER
                            else ->
                                throw IncreaseInvalidDataException(
                                    "Unknown StandInProcessingReason: $value"
                                )
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws IncreaseInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            IncreaseInvalidDataException("Value is not a String")
                        }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is StandInProcessingReason && value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Visa && electronicCommerceIndicator == other.electronicCommerceIndicator && pointOfServiceEntryMode == other.pointOfServiceEntryMode && standInProcessingReason == other.standInProcessingReason && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(electronicCommerceIndicator, pointOfServiceEntryMode, standInProcessingReason, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Visa{electronicCommerceIndicator=$electronicCommerceIndicator, pointOfServiceEntryMode=$pointOfServiceEntryMode, standInProcessingReason=$standInProcessingReason, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is NetworkDetails && category == other.category && visa == other.visa && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(category, visa, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "NetworkDetails{category=$category, visa=$visa, additionalProperties=$additionalProperties}"
        }

        /** Network-specific identifiers for a specific request or transaction. */
        @NoAutoDetect
        class NetworkIdentifiers
        @JsonCreator
        private constructor(
            @JsonProperty("retrieval_reference_number")
            @ExcludeMissing
            private val retrievalReferenceNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("trace_number")
            @ExcludeMissing
            private val traceNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("transaction_id")
            @ExcludeMissing
            private val transactionId: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

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
            fun _retrievalReferenceNumber(): JsonField<String> = retrievalReferenceNumber

            /**
             * A counter used to verify an individual authorization. Expected to be unique per
             * acquirer within a window of time.
             */
            @JsonProperty("trace_number")
            @ExcludeMissing
            fun _traceNumber(): JsonField<String> = traceNumber

            /**
             * A globally unique transaction identifier provided by the card network, used across
             * multiple life-cycle requests.
             */
            @JsonProperty("transaction_id")
            @ExcludeMissing
            fun _transactionId(): JsonField<String> = transactionId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): NetworkIdentifiers = apply {
                if (validated) {
                    return@apply
                }

                retrievalReferenceNumber()
                traceNumber()
                transactionId()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [NetworkIdentifiers].
                 *
                 * The following fields are required:
                 * ```java
                 * .retrievalReferenceNumber()
                 * .traceNumber()
                 * .transactionId()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [NetworkIdentifiers]. */
            class Builder internal constructor() {

                private var retrievalReferenceNumber: JsonField<String>? = null
                private var traceNumber: JsonField<String>? = null
                private var transactionId: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(networkIdentifiers: NetworkIdentifiers) = apply {
                    retrievalReferenceNumber = networkIdentifiers.retrievalReferenceNumber
                    traceNumber = networkIdentifiers.traceNumber
                    transactionId = networkIdentifiers.transactionId
                    additionalProperties = networkIdentifiers.additionalProperties.toMutableMap()
                }

                /**
                 * A life-cycle identifier used across e.g., an authorization and a reversal.
                 * Expected to be unique per acquirer within a window of time. For some card
                 * networks the retrieval reference number includes the trace counter.
                 */
                fun retrievalReferenceNumber(retrievalReferenceNumber: String?) =
                    retrievalReferenceNumber(JsonField.ofNullable(retrievalReferenceNumber))

                /**
                 * A life-cycle identifier used across e.g., an authorization and a reversal.
                 * Expected to be unique per acquirer within a window of time. For some card
                 * networks the retrieval reference number includes the trace counter.
                 */
                fun retrievalReferenceNumber(retrievalReferenceNumber: Optional<String>) =
                    retrievalReferenceNumber(retrievalReferenceNumber.orElse(null))

                /**
                 * A life-cycle identifier used across e.g., an authorization and a reversal.
                 * Expected to be unique per acquirer within a window of time. For some card
                 * networks the retrieval reference number includes the trace counter.
                 */
                fun retrievalReferenceNumber(retrievalReferenceNumber: JsonField<String>) = apply {
                    this.retrievalReferenceNumber = retrievalReferenceNumber
                }

                /**
                 * A counter used to verify an individual authorization. Expected to be unique per
                 * acquirer within a window of time.
                 */
                fun traceNumber(traceNumber: String?) =
                    traceNumber(JsonField.ofNullable(traceNumber))

                /**
                 * A counter used to verify an individual authorization. Expected to be unique per
                 * acquirer within a window of time.
                 */
                fun traceNumber(traceNumber: Optional<String>) =
                    traceNumber(traceNumber.orElse(null))

                /**
                 * A counter used to verify an individual authorization. Expected to be unique per
                 * acquirer within a window of time.
                 */
                fun traceNumber(traceNumber: JsonField<String>) = apply {
                    this.traceNumber = traceNumber
                }

                /**
                 * A globally unique transaction identifier provided by the card network, used
                 * across multiple life-cycle requests.
                 */
                fun transactionId(transactionId: String?) =
                    transactionId(JsonField.ofNullable(transactionId))

                /**
                 * A globally unique transaction identifier provided by the card network, used
                 * across multiple life-cycle requests.
                 */
                fun transactionId(transactionId: Optional<String>) =
                    transactionId(transactionId.orElse(null))

                /**
                 * A globally unique transaction identifier provided by the card network, used
                 * across multiple life-cycle requests.
                 */
                fun transactionId(transactionId: JsonField<String>) = apply {
                    this.transactionId = transactionId
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): NetworkIdentifiers =
                    NetworkIdentifiers(
                        checkRequired("retrievalReferenceNumber", retrievalReferenceNumber),
                        checkRequired("traceNumber", traceNumber),
                        checkRequired("transactionId", transactionId),
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is NetworkIdentifiers && retrievalReferenceNumber == other.retrievalReferenceNumber && traceNumber == other.traceNumber && transactionId == other.transactionId && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(retrievalReferenceNumber, traceNumber, transactionId, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "NetworkIdentifiers{retrievalReferenceNumber=$retrievalReferenceNumber, traceNumber=$traceNumber, transactionId=$transactionId, additionalProperties=$additionalProperties}"
        }

        /**
         * The processing category describes the intent behind the authorization, such as whether it
         * was used for bill payments or an automatic fuel dispenser.
         */
        class ProcessingCategory
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                /**
                 * Account funding transactions are transactions used to e.g., fund an account or
                 * transfer funds between accounts.
                 */
                @JvmField val ACCOUNT_FUNDING = of("account_funding")

                /**
                 * Automatic fuel dispenser authorizations occur when a card is used at a gas pump,
                 * prior to the actual transaction amount being known. They are followed by an
                 * advice message that updates the amount of the pending transaction.
                 */
                @JvmField val AUTOMATIC_FUEL_DISPENSER = of("automatic_fuel_dispenser")

                /** A transaction used to pay a bill. */
                @JvmField val BILL_PAYMENT = of("bill_payment")

                /** A regular purchase. */
                @JvmField val PURCHASE = of("purchase")

                /**
                 * Quasi-cash transactions represent purchases of items which may be convertible to
                 * cash.
                 */
                @JvmField val QUASI_CASH = of("quasi_cash")

                /**
                 * A refund card authorization, sometimes referred to as a credit voucher
                 * authorization, where funds are credited to the cardholder.
                 */
                @JvmField val REFUND = of("refund")

                @JvmStatic fun of(value: String) = ProcessingCategory(JsonField.of(value))
            }

            /** An enum containing [ProcessingCategory]'s known values. */
            enum class Known {
                /**
                 * Account funding transactions are transactions used to e.g., fund an account or
                 * transfer funds between accounts.
                 */
                ACCOUNT_FUNDING,
                /**
                 * Automatic fuel dispenser authorizations occur when a card is used at a gas pump,
                 * prior to the actual transaction amount being known. They are followed by an
                 * advice message that updates the amount of the pending transaction.
                 */
                AUTOMATIC_FUEL_DISPENSER,
                /** A transaction used to pay a bill. */
                BILL_PAYMENT,
                /** A regular purchase. */
                PURCHASE,
                /**
                 * Quasi-cash transactions represent purchases of items which may be convertible to
                 * cash.
                 */
                QUASI_CASH,
                /**
                 * A refund card authorization, sometimes referred to as a credit voucher
                 * authorization, where funds are credited to the cardholder.
                 */
                REFUND,
            }

            /**
             * An enum containing [ProcessingCategory]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [ProcessingCategory] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /**
                 * Account funding transactions are transactions used to e.g., fund an account or
                 * transfer funds between accounts.
                 */
                ACCOUNT_FUNDING,
                /**
                 * Automatic fuel dispenser authorizations occur when a card is used at a gas pump,
                 * prior to the actual transaction amount being known. They are followed by an
                 * advice message that updates the amount of the pending transaction.
                 */
                AUTOMATIC_FUEL_DISPENSER,
                /** A transaction used to pay a bill. */
                BILL_PAYMENT,
                /** A regular purchase. */
                PURCHASE,
                /**
                 * Quasi-cash transactions represent purchases of items which may be convertible to
                 * cash.
                 */
                QUASI_CASH,
                /**
                 * A refund card authorization, sometimes referred to as a credit voucher
                 * authorization, where funds are credited to the cardholder.
                 */
                REFUND,
                /**
                 * An enum member indicating that [ProcessingCategory] was instantiated with an
                 * unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
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

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws IncreaseInvalidDataException if this class instance's value is a not a known
             *   member.
             */
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

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws IncreaseInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    IncreaseInvalidDataException("Value is not a String")
                }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ProcessingCategory && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Fields specific to the type of request, such as an incremental authorization. */
        @NoAutoDetect
        class RequestDetails
        @JsonCreator
        private constructor(
            @JsonProperty("category")
            @ExcludeMissing
            private val category: JsonField<Category> = JsonMissing.of(),
            @JsonProperty("incremental_authorization")
            @ExcludeMissing
            private val incrementalAuthorization: JsonField<IncrementalAuthorization> =
                JsonMissing.of(),
            @JsonProperty("initial_authorization")
            @ExcludeMissing
            private val initialAuthorization: JsonValue = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

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

            /** Fields specific to the category `initial_authorization`. */
            @JsonProperty("initial_authorization")
            @ExcludeMissing
            fun _initialAuthorization(): JsonValue = initialAuthorization

            /**
             * The type of this request (e.g., an initial authorization or an incremental
             * authorization).
             */
            @JsonProperty("category")
            @ExcludeMissing
            fun _category(): JsonField<Category> = category

            /** Fields specific to the category `incremental_authorization`. */
            @JsonProperty("incremental_authorization")
            @ExcludeMissing
            fun _incrementalAuthorization(): JsonField<IncrementalAuthorization> =
                incrementalAuthorization

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): RequestDetails = apply {
                if (validated) {
                    return@apply
                }

                category()
                incrementalAuthorization().ifPresent { it.validate() }
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [RequestDetails].
                 *
                 * The following fields are required:
                 * ```java
                 * .category()
                 * .incrementalAuthorization()
                 * .initialAuthorization()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [RequestDetails]. */
            class Builder internal constructor() {

                private var category: JsonField<Category>? = null
                private var incrementalAuthorization: JsonField<IncrementalAuthorization>? = null
                private var initialAuthorization: JsonValue? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(requestDetails: RequestDetails) = apply {
                    category = requestDetails.category
                    incrementalAuthorization = requestDetails.incrementalAuthorization
                    initialAuthorization = requestDetails.initialAuthorization
                    additionalProperties = requestDetails.additionalProperties.toMutableMap()
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
                fun category(category: JsonField<Category>) = apply { this.category = category }

                /** Fields specific to the category `incremental_authorization`. */
                fun incrementalAuthorization(incrementalAuthorization: IncrementalAuthorization?) =
                    incrementalAuthorization(JsonField.ofNullable(incrementalAuthorization))

                /** Fields specific to the category `incremental_authorization`. */
                fun incrementalAuthorization(
                    incrementalAuthorization: Optional<IncrementalAuthorization>
                ) = incrementalAuthorization(incrementalAuthorization.orElse(null))

                /** Fields specific to the category `incremental_authorization`. */
                fun incrementalAuthorization(
                    incrementalAuthorization: JsonField<IncrementalAuthorization>
                ) = apply { this.incrementalAuthorization = incrementalAuthorization }

                /** Fields specific to the category `initial_authorization`. */
                fun initialAuthorization(initialAuthorization: JsonValue) = apply {
                    this.initialAuthorization = initialAuthorization
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): RequestDetails =
                    RequestDetails(
                        checkRequired("category", category),
                        checkRequired("incrementalAuthorization", incrementalAuthorization),
                        checkRequired("initialAuthorization", initialAuthorization),
                        additionalProperties.toImmutable(),
                    )
            }

            /**
             * The type of this request (e.g., an initial authorization or an incremental
             * authorization).
             */
            class Category @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    /** A regular, standalone authorization. */
                    @JvmField val INITIAL_AUTHORIZATION = of("initial_authorization")

                    /**
                     * An incremental request to increase the amount of an existing authorization.
                     */
                    @JvmField val INCREMENTAL_AUTHORIZATION = of("incremental_authorization")

                    @JvmStatic fun of(value: String) = Category(JsonField.of(value))
                }

                /** An enum containing [Category]'s known values. */
                enum class Known {
                    /** A regular, standalone authorization. */
                    INITIAL_AUTHORIZATION,
                    /**
                     * An incremental request to increase the amount of an existing authorization.
                     */
                    INCREMENTAL_AUTHORIZATION,
                }

                /**
                 * An enum containing [Category]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Category] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    /** A regular, standalone authorization. */
                    INITIAL_AUTHORIZATION,
                    /**
                     * An incremental request to increase the amount of an existing authorization.
                     */
                    INCREMENTAL_AUTHORIZATION,
                    /**
                     * An enum member indicating that [Category] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        INITIAL_AUTHORIZATION -> Value.INITIAL_AUTHORIZATION
                        INCREMENTAL_AUTHORIZATION -> Value.INCREMENTAL_AUTHORIZATION
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws IncreaseInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        INITIAL_AUTHORIZATION -> Known.INITIAL_AUTHORIZATION
                        INCREMENTAL_AUTHORIZATION -> Known.INCREMENTAL_AUTHORIZATION
                        else -> throw IncreaseInvalidDataException("Unknown Category: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws IncreaseInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        IncreaseInvalidDataException("Value is not a String")
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Category && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** Fields specific to the category `incremental_authorization`. */
            @NoAutoDetect
            class IncrementalAuthorization
            @JsonCreator
            private constructor(
                @JsonProperty("card_payment_id")
                @ExcludeMissing
                private val cardPaymentId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("original_card_authorization_id")
                @ExcludeMissing
                private val originalCardAuthorizationId: JsonField<String> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

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
                fun _cardPaymentId(): JsonField<String> = cardPaymentId

                /**
                 * The identifier of the card authorization this request is attempting to increment.
                 */
                @JsonProperty("original_card_authorization_id")
                @ExcludeMissing
                fun _originalCardAuthorizationId(): JsonField<String> = originalCardAuthorizationId

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): IncrementalAuthorization = apply {
                    if (validated) {
                        return@apply
                    }

                    cardPaymentId()
                    originalCardAuthorizationId()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of
                     * [IncrementalAuthorization].
                     *
                     * The following fields are required:
                     * ```java
                     * .cardPaymentId()
                     * .originalCardAuthorizationId()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [IncrementalAuthorization]. */
                class Builder internal constructor() {

                    private var cardPaymentId: JsonField<String>? = null
                    private var originalCardAuthorizationId: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(incrementalAuthorization: IncrementalAuthorization) = apply {
                        cardPaymentId = incrementalAuthorization.cardPaymentId
                        originalCardAuthorizationId =
                            incrementalAuthorization.originalCardAuthorizationId
                        additionalProperties =
                            incrementalAuthorization.additionalProperties.toMutableMap()
                    }

                    /** The card payment for this authorization and increment. */
                    fun cardPaymentId(cardPaymentId: String) =
                        cardPaymentId(JsonField.of(cardPaymentId))

                    /** The card payment for this authorization and increment. */
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
                    fun originalCardAuthorizationId(
                        originalCardAuthorizationId: JsonField<String>
                    ) = apply { this.originalCardAuthorizationId = originalCardAuthorizationId }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    fun build(): IncrementalAuthorization =
                        IncrementalAuthorization(
                            checkRequired("cardPaymentId", cardPaymentId),
                            checkRequired(
                                "originalCardAuthorizationId",
                                originalCardAuthorizationId,
                            ),
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is IncrementalAuthorization && cardPaymentId == other.cardPaymentId && originalCardAuthorizationId == other.originalCardAuthorizationId && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(cardPaymentId, originalCardAuthorizationId, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "IncrementalAuthorization{cardPaymentId=$cardPaymentId, originalCardAuthorizationId=$originalCardAuthorizationId, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is RequestDetails && category == other.category && incrementalAuthorization == other.incrementalAuthorization && initialAuthorization == other.initialAuthorization && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(category, incrementalAuthorization, initialAuthorization, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "RequestDetails{category=$category, incrementalAuthorization=$incrementalAuthorization, initialAuthorization=$initialAuthorization, additionalProperties=$additionalProperties}"
        }

        /** Fields related to verification of cardholder-provided values. */
        @NoAutoDetect
        class Verification
        @JsonCreator
        private constructor(
            @JsonProperty("card_verification_code")
            @ExcludeMissing
            private val cardVerificationCode: JsonField<CardVerificationCode> = JsonMissing.of(),
            @JsonProperty("cardholder_address")
            @ExcludeMissing
            private val cardholderAddress: JsonField<CardholderAddress> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

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
            fun _cardVerificationCode(): JsonField<CardVerificationCode> = cardVerificationCode

            /**
             * Cardholder address provided in the authorization request and the address on file we
             * verified it against.
             */
            @JsonProperty("cardholder_address")
            @ExcludeMissing
            fun _cardholderAddress(): JsonField<CardholderAddress> = cardholderAddress

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Verification = apply {
                if (validated) {
                    return@apply
                }

                cardVerificationCode().validate()
                cardholderAddress().validate()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [Verification].
                 *
                 * The following fields are required:
                 * ```java
                 * .cardVerificationCode()
                 * .cardholderAddress()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Verification]. */
            class Builder internal constructor() {

                private var cardVerificationCode: JsonField<CardVerificationCode>? = null
                private var cardholderAddress: JsonField<CardholderAddress>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(verification: Verification) = apply {
                    cardVerificationCode = verification.cardVerificationCode
                    cardholderAddress = verification.cardholderAddress
                    additionalProperties = verification.additionalProperties.toMutableMap()
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
                fun cardholderAddress(cardholderAddress: JsonField<CardholderAddress>) = apply {
                    this.cardholderAddress = cardholderAddress
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): Verification =
                    Verification(
                        checkRequired("cardVerificationCode", cardVerificationCode),
                        checkRequired("cardholderAddress", cardholderAddress),
                        additionalProperties.toImmutable(),
                    )
            }

            /**
             * Fields related to verification of the Card Verification Code, a 3-digit code on the
             * back of the card.
             */
            @NoAutoDetect
            class CardVerificationCode
            @JsonCreator
            private constructor(
                @JsonProperty("result")
                @ExcludeMissing
                private val result: JsonField<Result> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /** The result of verifying the Card Verification Code. */
                fun result(): Result = result.getRequired("result")

                /** The result of verifying the Card Verification Code. */
                @JsonProperty("result") @ExcludeMissing fun _result(): JsonField<Result> = result

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): CardVerificationCode = apply {
                    if (validated) {
                        return@apply
                    }

                    result()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of
                     * [CardVerificationCode].
                     *
                     * The following fields are required:
                     * ```java
                     * .result()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [CardVerificationCode]. */
                class Builder internal constructor() {

                    private var result: JsonField<Result>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(cardVerificationCode: CardVerificationCode) = apply {
                        result = cardVerificationCode.result
                        additionalProperties =
                            cardVerificationCode.additionalProperties.toMutableMap()
                    }

                    /** The result of verifying the Card Verification Code. */
                    fun result(result: Result) = result(JsonField.of(result))

                    /** The result of verifying the Card Verification Code. */
                    fun result(result: JsonField<Result>) = apply { this.result = result }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    fun build(): CardVerificationCode =
                        CardVerificationCode(
                            checkRequired("result", result),
                            additionalProperties.toImmutable(),
                        )
                }

                /** The result of verifying the Card Verification Code. */
                class Result
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        /** No card verification code was provided in the authorization request. */
                        @JvmField val NOT_CHECKED = of("not_checked")

                        /** The card verification code matched the one on file. */
                        @JvmField val MATCH = of("match")

                        /** The card verification code did not match the one on file. */
                        @JvmField val NO_MATCH = of("no_match")

                        @JvmStatic fun of(value: String) = Result(JsonField.of(value))
                    }

                    /** An enum containing [Result]'s known values. */
                    enum class Known {
                        /** No card verification code was provided in the authorization request. */
                        NOT_CHECKED,
                        /** The card verification code matched the one on file. */
                        MATCH,
                        /** The card verification code did not match the one on file. */
                        NO_MATCH,
                    }

                    /**
                     * An enum containing [Result]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Result] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        /** No card verification code was provided in the authorization request. */
                        NOT_CHECKED,
                        /** The card verification code matched the one on file. */
                        MATCH,
                        /** The card verification code did not match the one on file. */
                        NO_MATCH,
                        /**
                         * An enum member indicating that [Result] was instantiated with an unknown
                         * value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            NOT_CHECKED -> Value.NOT_CHECKED
                            MATCH -> Value.MATCH
                            NO_MATCH -> Value.NO_MATCH
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws IncreaseInvalidDataException if this class instance's value is a not
                     *   a known member.
                     */
                    fun known(): Known =
                        when (this) {
                            NOT_CHECKED -> Known.NOT_CHECKED
                            MATCH -> Known.MATCH
                            NO_MATCH -> Known.NO_MATCH
                            else -> throw IncreaseInvalidDataException("Unknown Result: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws IncreaseInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            IncreaseInvalidDataException("Value is not a String")
                        }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Result && value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is CardVerificationCode && result == other.result && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(result, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "CardVerificationCode{result=$result, additionalProperties=$additionalProperties}"
            }

            /**
             * Cardholder address provided in the authorization request and the address on file we
             * verified it against.
             */
            @NoAutoDetect
            class CardholderAddress
            @JsonCreator
            private constructor(
                @JsonProperty("actual_line1")
                @ExcludeMissing
                private val actualLine1: JsonField<String> = JsonMissing.of(),
                @JsonProperty("actual_postal_code")
                @ExcludeMissing
                private val actualPostalCode: JsonField<String> = JsonMissing.of(),
                @JsonProperty("provided_line1")
                @ExcludeMissing
                private val providedLine1: JsonField<String> = JsonMissing.of(),
                @JsonProperty("provided_postal_code")
                @ExcludeMissing
                private val providedPostalCode: JsonField<String> = JsonMissing.of(),
                @JsonProperty("result")
                @ExcludeMissing
                private val result: JsonField<Result> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

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
                @JsonProperty("actual_line1")
                @ExcludeMissing
                fun _actualLine1(): JsonField<String> = actualLine1

                /** The postal code of the address on file for the cardholder. */
                @JsonProperty("actual_postal_code")
                @ExcludeMissing
                fun _actualPostalCode(): JsonField<String> = actualPostalCode

                /**
                 * The cardholder address line 1 provided for verification in the authorization
                 * request.
                 */
                @JsonProperty("provided_line1")
                @ExcludeMissing
                fun _providedLine1(): JsonField<String> = providedLine1

                /** The postal code provided for verification in the authorization request. */
                @JsonProperty("provided_postal_code")
                @ExcludeMissing
                fun _providedPostalCode(): JsonField<String> = providedPostalCode

                /** The address verification result returned to the card network. */
                @JsonProperty("result") @ExcludeMissing fun _result(): JsonField<Result> = result

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): CardholderAddress = apply {
                    if (validated) {
                        return@apply
                    }

                    actualLine1()
                    actualPostalCode()
                    providedLine1()
                    providedPostalCode()
                    result()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of
                     * [CardholderAddress].
                     *
                     * The following fields are required:
                     * ```java
                     * .actualLine1()
                     * .actualPostalCode()
                     * .providedLine1()
                     * .providedPostalCode()
                     * .result()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [CardholderAddress]. */
                class Builder internal constructor() {

                    private var actualLine1: JsonField<String>? = null
                    private var actualPostalCode: JsonField<String>? = null
                    private var providedLine1: JsonField<String>? = null
                    private var providedPostalCode: JsonField<String>? = null
                    private var result: JsonField<Result>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(cardholderAddress: CardholderAddress) = apply {
                        actualLine1 = cardholderAddress.actualLine1
                        actualPostalCode = cardholderAddress.actualPostalCode
                        providedLine1 = cardholderAddress.providedLine1
                        providedPostalCode = cardholderAddress.providedPostalCode
                        result = cardholderAddress.result
                        additionalProperties = cardholderAddress.additionalProperties.toMutableMap()
                    }

                    /** Line 1 of the address on file for the cardholder. */
                    fun actualLine1(actualLine1: String?) =
                        actualLine1(JsonField.ofNullable(actualLine1))

                    /** Line 1 of the address on file for the cardholder. */
                    fun actualLine1(actualLine1: Optional<String>) =
                        actualLine1(actualLine1.orElse(null))

                    /** Line 1 of the address on file for the cardholder. */
                    fun actualLine1(actualLine1: JsonField<String>) = apply {
                        this.actualLine1 = actualLine1
                    }

                    /** The postal code of the address on file for the cardholder. */
                    fun actualPostalCode(actualPostalCode: String?) =
                        actualPostalCode(JsonField.ofNullable(actualPostalCode))

                    /** The postal code of the address on file for the cardholder. */
                    fun actualPostalCode(actualPostalCode: Optional<String>) =
                        actualPostalCode(actualPostalCode.orElse(null))

                    /** The postal code of the address on file for the cardholder. */
                    fun actualPostalCode(actualPostalCode: JsonField<String>) = apply {
                        this.actualPostalCode = actualPostalCode
                    }

                    /**
                     * The cardholder address line 1 provided for verification in the authorization
                     * request.
                     */
                    fun providedLine1(providedLine1: String?) =
                        providedLine1(JsonField.ofNullable(providedLine1))

                    /**
                     * The cardholder address line 1 provided for verification in the authorization
                     * request.
                     */
                    fun providedLine1(providedLine1: Optional<String>) =
                        providedLine1(providedLine1.orElse(null))

                    /**
                     * The cardholder address line 1 provided for verification in the authorization
                     * request.
                     */
                    fun providedLine1(providedLine1: JsonField<String>) = apply {
                        this.providedLine1 = providedLine1
                    }

                    /** The postal code provided for verification in the authorization request. */
                    fun providedPostalCode(providedPostalCode: String?) =
                        providedPostalCode(JsonField.ofNullable(providedPostalCode))

                    /** The postal code provided for verification in the authorization request. */
                    fun providedPostalCode(providedPostalCode: Optional<String>) =
                        providedPostalCode(providedPostalCode.orElse(null))

                    /** The postal code provided for verification in the authorization request. */
                    fun providedPostalCode(providedPostalCode: JsonField<String>) = apply {
                        this.providedPostalCode = providedPostalCode
                    }

                    /** The address verification result returned to the card network. */
                    fun result(result: Result) = result(JsonField.of(result))

                    /** The address verification result returned to the card network. */
                    fun result(result: JsonField<Result>) = apply { this.result = result }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    fun build(): CardholderAddress =
                        CardholderAddress(
                            checkRequired("actualLine1", actualLine1),
                            checkRequired("actualPostalCode", actualPostalCode),
                            checkRequired("providedLine1", providedLine1),
                            checkRequired("providedPostalCode", providedPostalCode),
                            checkRequired("result", result),
                            additionalProperties.toImmutable(),
                        )
                }

                /** The address verification result returned to the card network. */
                class Result
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        /** No adress was provided in the authorization request. */
                        @JvmField val NOT_CHECKED = of("not_checked")

                        /** Postal code matches, but the street address was not verified. */
                        @JvmField
                        val POSTAL_CODE_MATCH_ADDRESS_NOT_CHECKED =
                            of("postal_code_match_address_not_checked")

                        /** Postal code matches, but the street address does not match. */
                        @JvmField
                        val POSTAL_CODE_MATCH_ADDRESS_NO_MATCH =
                            of("postal_code_match_address_no_match")

                        /** Postal code does not match, but the street address matches. */
                        @JvmField
                        val POSTAL_CODE_NO_MATCH_ADDRESS_MATCH =
                            of("postal_code_no_match_address_match")

                        /** Postal code and street address match. */
                        @JvmField val MATCH = of("match")

                        /** Postal code and street address do not match. */
                        @JvmField val NO_MATCH = of("no_match")

                        @JvmStatic fun of(value: String) = Result(JsonField.of(value))
                    }

                    /** An enum containing [Result]'s known values. */
                    enum class Known {
                        /** No adress was provided in the authorization request. */
                        NOT_CHECKED,
                        /** Postal code matches, but the street address was not verified. */
                        POSTAL_CODE_MATCH_ADDRESS_NOT_CHECKED,
                        /** Postal code matches, but the street address does not match. */
                        POSTAL_CODE_MATCH_ADDRESS_NO_MATCH,
                        /** Postal code does not match, but the street address matches. */
                        POSTAL_CODE_NO_MATCH_ADDRESS_MATCH,
                        /** Postal code and street address match. */
                        MATCH,
                        /** Postal code and street address do not match. */
                        NO_MATCH,
                    }

                    /**
                     * An enum containing [Result]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Result] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        /** No adress was provided in the authorization request. */
                        NOT_CHECKED,
                        /** Postal code matches, but the street address was not verified. */
                        POSTAL_CODE_MATCH_ADDRESS_NOT_CHECKED,
                        /** Postal code matches, but the street address does not match. */
                        POSTAL_CODE_MATCH_ADDRESS_NO_MATCH,
                        /** Postal code does not match, but the street address matches. */
                        POSTAL_CODE_NO_MATCH_ADDRESS_MATCH,
                        /** Postal code and street address match. */
                        MATCH,
                        /** Postal code and street address do not match. */
                        NO_MATCH,
                        /**
                         * An enum member indicating that [Result] was instantiated with an unknown
                         * value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
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

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws IncreaseInvalidDataException if this class instance's value is a not
                     *   a known member.
                     */
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

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws IncreaseInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            IncreaseInvalidDataException("Value is not a String")
                        }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Result && value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is CardholderAddress && actualLine1 == other.actualLine1 && actualPostalCode == other.actualPostalCode && providedLine1 == other.providedLine1 && providedPostalCode == other.providedPostalCode && result == other.result && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(actualLine1, actualPostalCode, providedLine1, providedPostalCode, result, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "CardholderAddress{actualLine1=$actualLine1, actualPostalCode=$actualPostalCode, providedLine1=$providedLine1, providedPostalCode=$providedPostalCode, result=$result, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Verification && cardVerificationCode == other.cardVerificationCode && cardholderAddress == other.cardholderAddress && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(cardVerificationCode, cardholderAddress, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Verification{cardVerificationCode=$cardVerificationCode, cardholderAddress=$cardholderAddress, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CardAuthorization && accountId == other.accountId && cardId == other.cardId && decision == other.decision && digitalWalletTokenId == other.digitalWalletTokenId && direction == other.direction && merchantAcceptorId == other.merchantAcceptorId && merchantCategoryCode == other.merchantCategoryCode && merchantCity == other.merchantCity && merchantCountry == other.merchantCountry && merchantDescriptor == other.merchantDescriptor && merchantPostalCode == other.merchantPostalCode && merchantState == other.merchantState && networkDetails == other.networkDetails && networkIdentifiers == other.networkIdentifiers && networkRiskScore == other.networkRiskScore && physicalCardId == other.physicalCardId && presentmentAmount == other.presentmentAmount && presentmentCurrency == other.presentmentCurrency && processingCategory == other.processingCategory && requestDetails == other.requestDetails && settlementAmount == other.settlementAmount && settlementCurrency == other.settlementCurrency && terminalId == other.terminalId && upcomingCardPaymentId == other.upcomingCardPaymentId && verification == other.verification && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(accountId, cardId, decision, digitalWalletTokenId, direction, merchantAcceptorId, merchantCategoryCode, merchantCity, merchantCountry, merchantDescriptor, merchantPostalCode, merchantState, networkDetails, networkIdentifiers, networkRiskScore, physicalCardId, presentmentAmount, presentmentCurrency, processingCategory, requestDetails, settlementAmount, settlementCurrency, terminalId, upcomingCardPaymentId, verification, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CardAuthorization{accountId=$accountId, cardId=$cardId, decision=$decision, digitalWalletTokenId=$digitalWalletTokenId, direction=$direction, merchantAcceptorId=$merchantAcceptorId, merchantCategoryCode=$merchantCategoryCode, merchantCity=$merchantCity, merchantCountry=$merchantCountry, merchantDescriptor=$merchantDescriptor, merchantPostalCode=$merchantPostalCode, merchantState=$merchantState, networkDetails=$networkDetails, networkIdentifiers=$networkIdentifiers, networkRiskScore=$networkRiskScore, physicalCardId=$physicalCardId, presentmentAmount=$presentmentAmount, presentmentCurrency=$presentmentCurrency, processingCategory=$processingCategory, requestDetails=$requestDetails, settlementAmount=$settlementAmount, settlementCurrency=$settlementCurrency, terminalId=$terminalId, upcomingCardPaymentId=$upcomingCardPaymentId, verification=$verification, additionalProperties=$additionalProperties}"
    }

    /** The category of the Real-Time Decision. */
    class Category @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            /** A card is being authorized. */
            @JvmField val CARD_AUTHORIZATION_REQUESTED = of("card_authorization_requested")

            /** 3DS authentication is requested. */
            @JvmField val CARD_AUTHENTICATION_REQUESTED = of("card_authentication_requested")

            /** 3DS authentication challenge requires cardholder involvement. */
            @JvmField
            val CARD_AUTHENTICATION_CHALLENGE_REQUESTED =
                of("card_authentication_challenge_requested")

            /** A card is being loaded into a digital wallet. */
            @JvmField val DIGITAL_WALLET_TOKEN_REQUESTED = of("digital_wallet_token_requested")

            /**
             * A card is being loaded into a digital wallet and requires cardholder authentication.
             */
            @JvmField
            val DIGITAL_WALLET_AUTHENTICATION_REQUESTED =
                of("digital_wallet_authentication_requested")

            @JvmStatic fun of(value: String) = Category(JsonField.of(value))
        }

        /** An enum containing [Category]'s known values. */
        enum class Known {
            /** A card is being authorized. */
            CARD_AUTHORIZATION_REQUESTED,
            /** 3DS authentication is requested. */
            CARD_AUTHENTICATION_REQUESTED,
            /** 3DS authentication challenge requires cardholder involvement. */
            CARD_AUTHENTICATION_CHALLENGE_REQUESTED,
            /** A card is being loaded into a digital wallet. */
            DIGITAL_WALLET_TOKEN_REQUESTED,
            /**
             * A card is being loaded into a digital wallet and requires cardholder authentication.
             */
            DIGITAL_WALLET_AUTHENTICATION_REQUESTED,
        }

        /**
         * An enum containing [Category]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Category] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            /** A card is being authorized. */
            CARD_AUTHORIZATION_REQUESTED,
            /** 3DS authentication is requested. */
            CARD_AUTHENTICATION_REQUESTED,
            /** 3DS authentication challenge requires cardholder involvement. */
            CARD_AUTHENTICATION_CHALLENGE_REQUESTED,
            /** A card is being loaded into a digital wallet. */
            DIGITAL_WALLET_TOKEN_REQUESTED,
            /**
             * A card is being loaded into a digital wallet and requires cardholder authentication.
             */
            DIGITAL_WALLET_AUTHENTICATION_REQUESTED,
            /** An enum member indicating that [Category] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
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

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws IncreaseInvalidDataException if this class instance's value is a not a known
         *   member.
         */
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

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws IncreaseInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                IncreaseInvalidDataException("Value is not a String")
            }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Category && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Fields related to a digital wallet authentication attempt. */
    @NoAutoDetect
    class DigitalWalletAuthentication
    @JsonCreator
    private constructor(
        @JsonProperty("card_id")
        @ExcludeMissing
        private val cardId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("channel")
        @ExcludeMissing
        private val channel: JsonField<Channel> = JsonMissing.of(),
        @JsonProperty("digital_wallet")
        @ExcludeMissing
        private val digitalWallet: JsonField<DigitalWallet> = JsonMissing.of(),
        @JsonProperty("email")
        @ExcludeMissing
        private val email: JsonField<String> = JsonMissing.of(),
        @JsonProperty("one_time_passcode")
        @ExcludeMissing
        private val oneTimePasscode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("phone")
        @ExcludeMissing
        private val phone: JsonField<String> = JsonMissing.of(),
        @JsonProperty("result")
        @ExcludeMissing
        private val result: JsonField<Result> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

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
        @JsonProperty("card_id") @ExcludeMissing fun _cardId(): JsonField<String> = cardId

        /** The channel to send the card user their one-time passcode. */
        @JsonProperty("channel") @ExcludeMissing fun _channel(): JsonField<Channel> = channel

        /** The digital wallet app being used. */
        @JsonProperty("digital_wallet")
        @ExcludeMissing
        fun _digitalWallet(): JsonField<DigitalWallet> = digitalWallet

        /** The email to send the one-time passcode to if `channel` is equal to `email`. */
        @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

        /** The one-time passcode to send the card user. */
        @JsonProperty("one_time_passcode")
        @ExcludeMissing
        fun _oneTimePasscode(): JsonField<String> = oneTimePasscode

        /** The phone number to send the one-time passcode to if `channel` is equal to `sms`. */
        @JsonProperty("phone") @ExcludeMissing fun _phone(): JsonField<String> = phone

        /** Whether your application successfully delivered the one-time passcode. */
        @JsonProperty("result") @ExcludeMissing fun _result(): JsonField<Result> = result

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): DigitalWalletAuthentication = apply {
            if (validated) {
                return@apply
            }

            cardId()
            channel()
            digitalWallet()
            email()
            oneTimePasscode()
            phone()
            result()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of
             * [DigitalWalletAuthentication].
             *
             * The following fields are required:
             * ```java
             * .cardId()
             * .channel()
             * .digitalWallet()
             * .email()
             * .oneTimePasscode()
             * .phone()
             * .result()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [DigitalWalletAuthentication]. */
        class Builder internal constructor() {

            private var cardId: JsonField<String>? = null
            private var channel: JsonField<Channel>? = null
            private var digitalWallet: JsonField<DigitalWallet>? = null
            private var email: JsonField<String>? = null
            private var oneTimePasscode: JsonField<String>? = null
            private var phone: JsonField<String>? = null
            private var result: JsonField<Result>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(digitalWalletAuthentication: DigitalWalletAuthentication) = apply {
                cardId = digitalWalletAuthentication.cardId
                channel = digitalWalletAuthentication.channel
                digitalWallet = digitalWalletAuthentication.digitalWallet
                email = digitalWalletAuthentication.email
                oneTimePasscode = digitalWalletAuthentication.oneTimePasscode
                phone = digitalWalletAuthentication.phone
                result = digitalWalletAuthentication.result
                additionalProperties =
                    digitalWalletAuthentication.additionalProperties.toMutableMap()
            }

            /** The identifier of the Card that is being tokenized. */
            fun cardId(cardId: String) = cardId(JsonField.of(cardId))

            /** The identifier of the Card that is being tokenized. */
            fun cardId(cardId: JsonField<String>) = apply { this.cardId = cardId }

            /** The channel to send the card user their one-time passcode. */
            fun channel(channel: Channel) = channel(JsonField.of(channel))

            /** The channel to send the card user their one-time passcode. */
            fun channel(channel: JsonField<Channel>) = apply { this.channel = channel }

            /** The digital wallet app being used. */
            fun digitalWallet(digitalWallet: DigitalWallet) =
                digitalWallet(JsonField.of(digitalWallet))

            /** The digital wallet app being used. */
            fun digitalWallet(digitalWallet: JsonField<DigitalWallet>) = apply {
                this.digitalWallet = digitalWallet
            }

            /** The email to send the one-time passcode to if `channel` is equal to `email`. */
            fun email(email: String?) = email(JsonField.ofNullable(email))

            /** The email to send the one-time passcode to if `channel` is equal to `email`. */
            fun email(email: Optional<String>) = email(email.orElse(null))

            /** The email to send the one-time passcode to if `channel` is equal to `email`. */
            fun email(email: JsonField<String>) = apply { this.email = email }

            /** The one-time passcode to send the card user. */
            fun oneTimePasscode(oneTimePasscode: String) =
                oneTimePasscode(JsonField.of(oneTimePasscode))

            /** The one-time passcode to send the card user. */
            fun oneTimePasscode(oneTimePasscode: JsonField<String>) = apply {
                this.oneTimePasscode = oneTimePasscode
            }

            /** The phone number to send the one-time passcode to if `channel` is equal to `sms`. */
            fun phone(phone: String?) = phone(JsonField.ofNullable(phone))

            /** The phone number to send the one-time passcode to if `channel` is equal to `sms`. */
            fun phone(phone: Optional<String>) = phone(phone.orElse(null))

            /** The phone number to send the one-time passcode to if `channel` is equal to `sms`. */
            fun phone(phone: JsonField<String>) = apply { this.phone = phone }

            /** Whether your application successfully delivered the one-time passcode. */
            fun result(result: Result?) = result(JsonField.ofNullable(result))

            /** Whether your application successfully delivered the one-time passcode. */
            fun result(result: Optional<Result>) = result(result.orElse(null))

            /** Whether your application successfully delivered the one-time passcode. */
            fun result(result: JsonField<Result>) = apply { this.result = result }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            fun build(): DigitalWalletAuthentication =
                DigitalWalletAuthentication(
                    checkRequired("cardId", cardId),
                    checkRequired("channel", channel),
                    checkRequired("digitalWallet", digitalWallet),
                    checkRequired("email", email),
                    checkRequired("oneTimePasscode", oneTimePasscode),
                    checkRequired("phone", phone),
                    checkRequired("result", result),
                    additionalProperties.toImmutable(),
                )
        }

        /** The channel to send the card user their one-time passcode. */
        class Channel @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                /** Send one-time passcodes over SMS. */
                @JvmField val SMS = of("sms")

                /** Send one-time passcodes over email. */
                @JvmField val EMAIL = of("email")

                @JvmStatic fun of(value: String) = Channel(JsonField.of(value))
            }

            /** An enum containing [Channel]'s known values. */
            enum class Known {
                /** Send one-time passcodes over SMS. */
                SMS,
                /** Send one-time passcodes over email. */
                EMAIL,
            }

            /**
             * An enum containing [Channel]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Channel] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /** Send one-time passcodes over SMS. */
                SMS,
                /** Send one-time passcodes over email. */
                EMAIL,
                /**
                 * An enum member indicating that [Channel] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    SMS -> Value.SMS
                    EMAIL -> Value.EMAIL
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws IncreaseInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    SMS -> Known.SMS
                    EMAIL -> Known.EMAIL
                    else -> throw IncreaseInvalidDataException("Unknown Channel: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws IncreaseInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    IncreaseInvalidDataException("Value is not a String")
                }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Channel && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** The digital wallet app being used. */
        class DigitalWallet @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                /** Apple Pay */
                @JvmField val APPLE_PAY = of("apple_pay")

                /** Google Pay */
                @JvmField val GOOGLE_PAY = of("google_pay")

                /** Samsung Pay */
                @JvmField val SAMSUNG_PAY = of("samsung_pay")

                /** Unknown */
                @JvmField val UNKNOWN = of("unknown")

                @JvmStatic fun of(value: String) = DigitalWallet(JsonField.of(value))
            }

            /** An enum containing [DigitalWallet]'s known values. */
            enum class Known {
                /** Apple Pay */
                APPLE_PAY,
                /** Google Pay */
                GOOGLE_PAY,
                /** Samsung Pay */
                SAMSUNG_PAY,
                /** Unknown */
                UNKNOWN,
            }

            /**
             * An enum containing [DigitalWallet]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [DigitalWallet] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /** Apple Pay */
                APPLE_PAY,
                /** Google Pay */
                GOOGLE_PAY,
                /** Samsung Pay */
                SAMSUNG_PAY,
                /** Unknown */
                UNKNOWN,
                /**
                 * An enum member indicating that [DigitalWallet] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    APPLE_PAY -> Value.APPLE_PAY
                    GOOGLE_PAY -> Value.GOOGLE_PAY
                    SAMSUNG_PAY -> Value.SAMSUNG_PAY
                    UNKNOWN -> Value.UNKNOWN
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws IncreaseInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    APPLE_PAY -> Known.APPLE_PAY
                    GOOGLE_PAY -> Known.GOOGLE_PAY
                    SAMSUNG_PAY -> Known.SAMSUNG_PAY
                    UNKNOWN -> Known.UNKNOWN
                    else -> throw IncreaseInvalidDataException("Unknown DigitalWallet: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws IncreaseInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    IncreaseInvalidDataException("Value is not a String")
                }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is DigitalWallet && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Whether your application successfully delivered the one-time passcode. */
        class Result @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                /**
                 * Your application successfully delivered the one-time passcode to the cardholder.
                 */
                @JvmField val SUCCESS = of("success")

                /** Your application failed to deliver the one-time passcode to the cardholder. */
                @JvmField val FAILURE = of("failure")

                @JvmStatic fun of(value: String) = Result(JsonField.of(value))
            }

            /** An enum containing [Result]'s known values. */
            enum class Known {
                /**
                 * Your application successfully delivered the one-time passcode to the cardholder.
                 */
                SUCCESS,
                /** Your application failed to deliver the one-time passcode to the cardholder. */
                FAILURE,
            }

            /**
             * An enum containing [Result]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Result] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /**
                 * Your application successfully delivered the one-time passcode to the cardholder.
                 */
                SUCCESS,
                /** Your application failed to deliver the one-time passcode to the cardholder. */
                FAILURE,
                /**
                 * An enum member indicating that [Result] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    SUCCESS -> Value.SUCCESS
                    FAILURE -> Value.FAILURE
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws IncreaseInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    SUCCESS -> Known.SUCCESS
                    FAILURE -> Known.FAILURE
                    else -> throw IncreaseInvalidDataException("Unknown Result: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws IncreaseInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    IncreaseInvalidDataException("Value is not a String")
                }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Result && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is DigitalWalletAuthentication && cardId == other.cardId && channel == other.channel && digitalWallet == other.digitalWallet && email == other.email && oneTimePasscode == other.oneTimePasscode && phone == other.phone && result == other.result && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(cardId, channel, digitalWallet, email, oneTimePasscode, phone, result, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DigitalWalletAuthentication{cardId=$cardId, channel=$channel, digitalWallet=$digitalWallet, email=$email, oneTimePasscode=$oneTimePasscode, phone=$phone, result=$result, additionalProperties=$additionalProperties}"
    }

    /** Fields related to a digital wallet token provisioning attempt. */
    @NoAutoDetect
    class DigitalWalletToken
    @JsonCreator
    private constructor(
        @JsonProperty("card_id")
        @ExcludeMissing
        private val cardId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("card_profile_id")
        @ExcludeMissing
        private val cardProfileId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("decision")
        @ExcludeMissing
        private val decision: JsonField<Decision> = JsonMissing.of(),
        @JsonProperty("digital_wallet")
        @ExcludeMissing
        private val digitalWallet: JsonField<DigitalWallet> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

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
        @JsonProperty("card_id") @ExcludeMissing fun _cardId(): JsonField<String> = cardId

        /**
         * The identifier of the Card Profile that was set via the real time decision. This will be
         * null until the real time decision is responded to or if the real time decision did not
         * set a card profile.
         */
        @JsonProperty("card_profile_id")
        @ExcludeMissing
        fun _cardProfileId(): JsonField<String> = cardProfileId

        /**
         * Whether or not the provisioning request was approved. This will be null until the real
         * time decision is responded to.
         */
        @JsonProperty("decision") @ExcludeMissing fun _decision(): JsonField<Decision> = decision

        /** The digital wallet app being used. */
        @JsonProperty("digital_wallet")
        @ExcludeMissing
        fun _digitalWallet(): JsonField<DigitalWallet> = digitalWallet

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): DigitalWalletToken = apply {
            if (validated) {
                return@apply
            }

            cardId()
            cardProfileId()
            decision()
            digitalWallet()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [DigitalWalletToken].
             *
             * The following fields are required:
             * ```java
             * .cardId()
             * .cardProfileId()
             * .decision()
             * .digitalWallet()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [DigitalWalletToken]. */
        class Builder internal constructor() {

            private var cardId: JsonField<String>? = null
            private var cardProfileId: JsonField<String>? = null
            private var decision: JsonField<Decision>? = null
            private var digitalWallet: JsonField<DigitalWallet>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(digitalWalletToken: DigitalWalletToken) = apply {
                cardId = digitalWalletToken.cardId
                cardProfileId = digitalWalletToken.cardProfileId
                decision = digitalWalletToken.decision
                digitalWallet = digitalWalletToken.digitalWallet
                additionalProperties = digitalWalletToken.additionalProperties.toMutableMap()
            }

            /** The identifier of the Card that is being tokenized. */
            fun cardId(cardId: String) = cardId(JsonField.of(cardId))

            /** The identifier of the Card that is being tokenized. */
            fun cardId(cardId: JsonField<String>) = apply { this.cardId = cardId }

            /**
             * The identifier of the Card Profile that was set via the real time decision. This will
             * be null until the real time decision is responded to or if the real time decision did
             * not set a card profile.
             */
            fun cardProfileId(cardProfileId: String?) =
                cardProfileId(JsonField.ofNullable(cardProfileId))

            /**
             * The identifier of the Card Profile that was set via the real time decision. This will
             * be null until the real time decision is responded to or if the real time decision did
             * not set a card profile.
             */
            fun cardProfileId(cardProfileId: Optional<String>) =
                cardProfileId(cardProfileId.orElse(null))

            /**
             * The identifier of the Card Profile that was set via the real time decision. This will
             * be null until the real time decision is responded to or if the real time decision did
             * not set a card profile.
             */
            fun cardProfileId(cardProfileId: JsonField<String>) = apply {
                this.cardProfileId = cardProfileId
            }

            /**
             * Whether or not the provisioning request was approved. This will be null until the
             * real time decision is responded to.
             */
            fun decision(decision: Decision?) = decision(JsonField.ofNullable(decision))

            /**
             * Whether or not the provisioning request was approved. This will be null until the
             * real time decision is responded to.
             */
            fun decision(decision: Optional<Decision>) = decision(decision.orElse(null))

            /**
             * Whether or not the provisioning request was approved. This will be null until the
             * real time decision is responded to.
             */
            fun decision(decision: JsonField<Decision>) = apply { this.decision = decision }

            /** The digital wallet app being used. */
            fun digitalWallet(digitalWallet: DigitalWallet) =
                digitalWallet(JsonField.of(digitalWallet))

            /** The digital wallet app being used. */
            fun digitalWallet(digitalWallet: JsonField<DigitalWallet>) = apply {
                this.digitalWallet = digitalWallet
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            fun build(): DigitalWalletToken =
                DigitalWalletToken(
                    checkRequired("cardId", cardId),
                    checkRequired("cardProfileId", cardProfileId),
                    checkRequired("decision", decision),
                    checkRequired("digitalWallet", digitalWallet),
                    additionalProperties.toImmutable(),
                )
        }

        /**
         * Whether or not the provisioning request was approved. This will be null until the real
         * time decision is responded to.
         */
        class Decision @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                /** Approve the provisioning request. */
                @JvmField val APPROVE = of("approve")

                /** Decline the provisioning request. */
                @JvmField val DECLINE = of("decline")

                @JvmStatic fun of(value: String) = Decision(JsonField.of(value))
            }

            /** An enum containing [Decision]'s known values. */
            enum class Known {
                /** Approve the provisioning request. */
                APPROVE,
                /** Decline the provisioning request. */
                DECLINE,
            }

            /**
             * An enum containing [Decision]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Decision] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /** Approve the provisioning request. */
                APPROVE,
                /** Decline the provisioning request. */
                DECLINE,
                /**
                 * An enum member indicating that [Decision] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    APPROVE -> Value.APPROVE
                    DECLINE -> Value.DECLINE
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws IncreaseInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    APPROVE -> Known.APPROVE
                    DECLINE -> Known.DECLINE
                    else -> throw IncreaseInvalidDataException("Unknown Decision: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws IncreaseInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    IncreaseInvalidDataException("Value is not a String")
                }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Decision && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** The digital wallet app being used. */
        class DigitalWallet @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                /** Apple Pay */
                @JvmField val APPLE_PAY = of("apple_pay")

                /** Google Pay */
                @JvmField val GOOGLE_PAY = of("google_pay")

                /** Samsung Pay */
                @JvmField val SAMSUNG_PAY = of("samsung_pay")

                /** Unknown */
                @JvmField val UNKNOWN = of("unknown")

                @JvmStatic fun of(value: String) = DigitalWallet(JsonField.of(value))
            }

            /** An enum containing [DigitalWallet]'s known values. */
            enum class Known {
                /** Apple Pay */
                APPLE_PAY,
                /** Google Pay */
                GOOGLE_PAY,
                /** Samsung Pay */
                SAMSUNG_PAY,
                /** Unknown */
                UNKNOWN,
            }

            /**
             * An enum containing [DigitalWallet]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [DigitalWallet] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /** Apple Pay */
                APPLE_PAY,
                /** Google Pay */
                GOOGLE_PAY,
                /** Samsung Pay */
                SAMSUNG_PAY,
                /** Unknown */
                UNKNOWN,
                /**
                 * An enum member indicating that [DigitalWallet] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    APPLE_PAY -> Value.APPLE_PAY
                    GOOGLE_PAY -> Value.GOOGLE_PAY
                    SAMSUNG_PAY -> Value.SAMSUNG_PAY
                    UNKNOWN -> Value.UNKNOWN
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws IncreaseInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    APPLE_PAY -> Known.APPLE_PAY
                    GOOGLE_PAY -> Known.GOOGLE_PAY
                    SAMSUNG_PAY -> Known.SAMSUNG_PAY
                    UNKNOWN -> Known.UNKNOWN
                    else -> throw IncreaseInvalidDataException("Unknown DigitalWallet: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws IncreaseInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    IncreaseInvalidDataException("Value is not a String")
                }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is DigitalWallet && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is DigitalWalletToken && cardId == other.cardId && cardProfileId == other.cardProfileId && decision == other.decision && digitalWallet == other.digitalWallet && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(cardId, cardProfileId, decision, digitalWallet, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DigitalWalletToken{cardId=$cardId, cardProfileId=$cardProfileId, decision=$decision, digitalWallet=$digitalWallet, additionalProperties=$additionalProperties}"
    }

    /** The status of the Real-Time Decision. */
    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            /** The decision is pending action via real-time webhook. */
            @JvmField val PENDING = of("pending")

            /** Your webhook actioned the real-time decision. */
            @JvmField val RESPONDED = of("responded")

            /** Your webhook failed to respond to the authorization in time. */
            @JvmField val TIMED_OUT = of("timed_out")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            /** The decision is pending action via real-time webhook. */
            PENDING,
            /** Your webhook actioned the real-time decision. */
            RESPONDED,
            /** Your webhook failed to respond to the authorization in time. */
            TIMED_OUT,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            /** The decision is pending action via real-time webhook. */
            PENDING,
            /** Your webhook actioned the real-time decision. */
            RESPONDED,
            /** Your webhook failed to respond to the authorization in time. */
            TIMED_OUT,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                PENDING -> Value.PENDING
                RESPONDED -> Value.RESPONDED
                TIMED_OUT -> Value.TIMED_OUT
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws IncreaseInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                PENDING -> Known.PENDING
                RESPONDED -> Known.RESPONDED
                TIMED_OUT -> Known.TIMED_OUT
                else -> throw IncreaseInvalidDataException("Unknown Status: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws IncreaseInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                IncreaseInvalidDataException("Value is not a String")
            }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * A constant representing the object's type. For this resource it will always be
     * `real_time_decision`.
     */
    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val REAL_TIME_DECISION = of("real_time_decision")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            REAL_TIME_DECISION
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            REAL_TIME_DECISION,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                REAL_TIME_DECISION -> Value.REAL_TIME_DECISION
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws IncreaseInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                REAL_TIME_DECISION -> Known.REAL_TIME_DECISION
                else -> throw IncreaseInvalidDataException("Unknown Type: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws IncreaseInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                IncreaseInvalidDataException("Value is not a String")
            }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Type && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is RealTimeDecision && id == other.id && cardAuthentication == other.cardAuthentication && cardAuthenticationChallenge == other.cardAuthenticationChallenge && cardAuthorization == other.cardAuthorization && category == other.category && createdAt == other.createdAt && digitalWalletAuthentication == other.digitalWalletAuthentication && digitalWalletToken == other.digitalWalletToken && status == other.status && timeoutAt == other.timeoutAt && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, cardAuthentication, cardAuthenticationChallenge, cardAuthorization, category, createdAt, digitalWalletAuthentication, digitalWalletToken, status, timeoutAt, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RealTimeDecision{id=$id, cardAuthentication=$cardAuthentication, cardAuthenticationChallenge=$cardAuthenticationChallenge, cardAuthorization=$cardAuthorization, category=$category, createdAt=$createdAt, digitalWalletAuthentication=$digitalWalletAuthentication, digitalWalletToken=$digitalWalletToken, status=$status, timeoutAt=$timeoutAt, type=$type, additionalProperties=$additionalProperties}"
}
