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
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.toUnmodifiable
import com.increase.api.errors.IncreaseInvalidDataException
import com.increase.api.models.*
import java.util.Objects
import java.util.Optional

class SimulationCardAuthorizationCreateParams
constructor(
    private val amount: Long,
    private val cardId: String?,
    private val declineReason: DeclineReason?,
    private val digitalWalletTokenId: String?,
    private val direction: Direction?,
    private val eventSubscriptionId: String?,
    private val merchantAcceptorId: String?,
    private val merchantCategoryCode: String?,
    private val merchantCity: String?,
    private val merchantCountry: String?,
    private val merchantDescriptor: String?,
    private val physicalCardId: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun amount(): Long = amount

    fun cardId(): Optional<String> = Optional.ofNullable(cardId)

    fun declineReason(): Optional<DeclineReason> = Optional.ofNullable(declineReason)

    fun digitalWalletTokenId(): Optional<String> = Optional.ofNullable(digitalWalletTokenId)

    fun direction(): Optional<Direction> = Optional.ofNullable(direction)

    fun eventSubscriptionId(): Optional<String> = Optional.ofNullable(eventSubscriptionId)

    fun merchantAcceptorId(): Optional<String> = Optional.ofNullable(merchantAcceptorId)

    fun merchantCategoryCode(): Optional<String> = Optional.ofNullable(merchantCategoryCode)

    fun merchantCity(): Optional<String> = Optional.ofNullable(merchantCity)

    fun merchantCountry(): Optional<String> = Optional.ofNullable(merchantCountry)

    fun merchantDescriptor(): Optional<String> = Optional.ofNullable(merchantDescriptor)

    fun physicalCardId(): Optional<String> = Optional.ofNullable(physicalCardId)

    @JvmSynthetic
    internal fun getBody(): SimulationCardAuthorizationCreateBody {
        return SimulationCardAuthorizationCreateBody(
            amount,
            cardId,
            declineReason,
            digitalWalletTokenId,
            direction,
            eventSubscriptionId,
            merchantAcceptorId,
            merchantCategoryCode,
            merchantCity,
            merchantCountry,
            merchantDescriptor,
            physicalCardId,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = SimulationCardAuthorizationCreateBody.Builder::class)
    @NoAutoDetect
    class SimulationCardAuthorizationCreateBody
    internal constructor(
        private val amount: Long?,
        private val cardId: String?,
        private val declineReason: DeclineReason?,
        private val digitalWalletTokenId: String?,
        private val direction: Direction?,
        private val eventSubscriptionId: String?,
        private val merchantAcceptorId: String?,
        private val merchantCategoryCode: String?,
        private val merchantCity: String?,
        private val merchantCountry: String?,
        private val merchantDescriptor: String?,
        private val physicalCardId: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The authorization amount in cents. */
        @JsonProperty("amount") fun amount(): Long? = amount

        /** The identifier of the Card to be authorized. */
        @JsonProperty("card_id") fun cardId(): String? = cardId

        /** Forces a card decline with a specific reason. No real time decision will be sent. */
        @JsonProperty("decline_reason") fun declineReason(): DeclineReason? = declineReason

        /** The identifier of the Digital Wallet Token to be authorized. */
        @JsonProperty("digital_wallet_token_id")
        fun digitalWalletTokenId(): String? = digitalWalletTokenId

        /**
         * The direction describes the direction the funds will move, either from the cardholder to
         * the merchant or from the merchant to the cardholder.
         */
        @JsonProperty("direction") fun direction(): Direction? = direction

        /**
         * The identifier of the Event Subscription to use. If provided, will override the default
         * real time event subscription. Because you can only create one real time decision event
         * subscription, you can use this field to route events to any specified event subscription
         * for testing purposes.
         */
        @JsonProperty("event_subscription_id")
        fun eventSubscriptionId(): String? = eventSubscriptionId

        /**
         * The merchant identifier (commonly abbreviated as MID) of the merchant the card is
         * transacting with.
         */
        @JsonProperty("merchant_acceptor_id") fun merchantAcceptorId(): String? = merchantAcceptorId

        /**
         * The Merchant Category Code (commonly abbreviated as MCC) of the merchant the card is
         * transacting with.
         */
        @JsonProperty("merchant_category_code")
        fun merchantCategoryCode(): String? = merchantCategoryCode

        /** The city the merchant resides in. */
        @JsonProperty("merchant_city") fun merchantCity(): String? = merchantCity

        /** The country the merchant resides in. */
        @JsonProperty("merchant_country") fun merchantCountry(): String? = merchantCountry

        /** The merchant descriptor of the merchant the card is transacting with. */
        @JsonProperty("merchant_descriptor") fun merchantDescriptor(): String? = merchantDescriptor

        /** The identifier of the Physical Card to be authorized. */
        @JsonProperty("physical_card_id") fun physicalCardId(): String? = physicalCardId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var amount: Long? = null
            private var cardId: String? = null
            private var declineReason: DeclineReason? = null
            private var digitalWalletTokenId: String? = null
            private var direction: Direction? = null
            private var eventSubscriptionId: String? = null
            private var merchantAcceptorId: String? = null
            private var merchantCategoryCode: String? = null
            private var merchantCity: String? = null
            private var merchantCountry: String? = null
            private var merchantDescriptor: String? = null
            private var physicalCardId: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                simulationCardAuthorizationCreateBody: SimulationCardAuthorizationCreateBody
            ) = apply {
                this.amount = simulationCardAuthorizationCreateBody.amount
                this.cardId = simulationCardAuthorizationCreateBody.cardId
                this.declineReason = simulationCardAuthorizationCreateBody.declineReason
                this.digitalWalletTokenId =
                    simulationCardAuthorizationCreateBody.digitalWalletTokenId
                this.direction = simulationCardAuthorizationCreateBody.direction
                this.eventSubscriptionId = simulationCardAuthorizationCreateBody.eventSubscriptionId
                this.merchantAcceptorId = simulationCardAuthorizationCreateBody.merchantAcceptorId
                this.merchantCategoryCode =
                    simulationCardAuthorizationCreateBody.merchantCategoryCode
                this.merchantCity = simulationCardAuthorizationCreateBody.merchantCity
                this.merchantCountry = simulationCardAuthorizationCreateBody.merchantCountry
                this.merchantDescriptor = simulationCardAuthorizationCreateBody.merchantDescriptor
                this.physicalCardId = simulationCardAuthorizationCreateBody.physicalCardId
                additionalProperties(simulationCardAuthorizationCreateBody.additionalProperties)
            }

            /** The authorization amount in cents. */
            @JsonProperty("amount") fun amount(amount: Long) = apply { this.amount = amount }

            /** The identifier of the Card to be authorized. */
            @JsonProperty("card_id") fun cardId(cardId: String) = apply { this.cardId = cardId }

            /** Forces a card decline with a specific reason. No real time decision will be sent. */
            @JsonProperty("decline_reason")
            fun declineReason(declineReason: DeclineReason) = apply {
                this.declineReason = declineReason
            }

            /** The identifier of the Digital Wallet Token to be authorized. */
            @JsonProperty("digital_wallet_token_id")
            fun digitalWalletTokenId(digitalWalletTokenId: String) = apply {
                this.digitalWalletTokenId = digitalWalletTokenId
            }

            /**
             * The direction describes the direction the funds will move, either from the cardholder
             * to the merchant or from the merchant to the cardholder.
             */
            @JsonProperty("direction")
            fun direction(direction: Direction) = apply { this.direction = direction }

            /**
             * The identifier of the Event Subscription to use. If provided, will override the
             * default real time event subscription. Because you can only create one real time
             * decision event subscription, you can use this field to route events to any specified
             * event subscription for testing purposes.
             */
            @JsonProperty("event_subscription_id")
            fun eventSubscriptionId(eventSubscriptionId: String) = apply {
                this.eventSubscriptionId = eventSubscriptionId
            }

            /**
             * The merchant identifier (commonly abbreviated as MID) of the merchant the card is
             * transacting with.
             */
            @JsonProperty("merchant_acceptor_id")
            fun merchantAcceptorId(merchantAcceptorId: String) = apply {
                this.merchantAcceptorId = merchantAcceptorId
            }

            /**
             * The Merchant Category Code (commonly abbreviated as MCC) of the merchant the card is
             * transacting with.
             */
            @JsonProperty("merchant_category_code")
            fun merchantCategoryCode(merchantCategoryCode: String) = apply {
                this.merchantCategoryCode = merchantCategoryCode
            }

            /** The city the merchant resides in. */
            @JsonProperty("merchant_city")
            fun merchantCity(merchantCity: String) = apply { this.merchantCity = merchantCity }

            /** The country the merchant resides in. */
            @JsonProperty("merchant_country")
            fun merchantCountry(merchantCountry: String) = apply {
                this.merchantCountry = merchantCountry
            }

            /** The merchant descriptor of the merchant the card is transacting with. */
            @JsonProperty("merchant_descriptor")
            fun merchantDescriptor(merchantDescriptor: String) = apply {
                this.merchantDescriptor = merchantDescriptor
            }

            /** The identifier of the Physical Card to be authorized. */
            @JsonProperty("physical_card_id")
            fun physicalCardId(physicalCardId: String) = apply {
                this.physicalCardId = physicalCardId
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

            fun build(): SimulationCardAuthorizationCreateBody =
                SimulationCardAuthorizationCreateBody(
                    checkNotNull(amount) { "`amount` is required but was not set" },
                    cardId,
                    declineReason,
                    digitalWalletTokenId,
                    direction,
                    eventSubscriptionId,
                    merchantAcceptorId,
                    merchantCategoryCode,
                    merchantCity,
                    merchantCountry,
                    merchantDescriptor,
                    physicalCardId,
                    additionalProperties.toUnmodifiable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is SimulationCardAuthorizationCreateBody && this.amount == other.amount && this.cardId == other.cardId && this.declineReason == other.declineReason && this.digitalWalletTokenId == other.digitalWalletTokenId && this.direction == other.direction && this.eventSubscriptionId == other.eventSubscriptionId && this.merchantAcceptorId == other.merchantAcceptorId && this.merchantCategoryCode == other.merchantCategoryCode && this.merchantCity == other.merchantCity && this.merchantCountry == other.merchantCountry && this.merchantDescriptor == other.merchantDescriptor && this.physicalCardId == other.physicalCardId && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(amount, cardId, declineReason, digitalWalletTokenId, direction, eventSubscriptionId, merchantAcceptorId, merchantCategoryCode, merchantCity, merchantCountry, merchantDescriptor, physicalCardId, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "SimulationCardAuthorizationCreateBody{amount=$amount, cardId=$cardId, declineReason=$declineReason, digitalWalletTokenId=$digitalWalletTokenId, direction=$direction, eventSubscriptionId=$eventSubscriptionId, merchantAcceptorId=$merchantAcceptorId, merchantCategoryCode=$merchantCategoryCode, merchantCity=$merchantCity, merchantCountry=$merchantCountry, merchantDescriptor=$merchantDescriptor, physicalCardId=$physicalCardId, additionalProperties=$additionalProperties}"
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SimulationCardAuthorizationCreateParams && this.amount == other.amount && this.cardId == other.cardId && this.declineReason == other.declineReason && this.digitalWalletTokenId == other.digitalWalletTokenId && this.direction == other.direction && this.eventSubscriptionId == other.eventSubscriptionId && this.merchantAcceptorId == other.merchantAcceptorId && this.merchantCategoryCode == other.merchantCategoryCode && this.merchantCity == other.merchantCity && this.merchantCountry == other.merchantCountry && this.merchantDescriptor == other.merchantDescriptor && this.physicalCardId == other.physicalCardId && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(amount, cardId, declineReason, digitalWalletTokenId, direction, eventSubscriptionId, merchantAcceptorId, merchantCategoryCode, merchantCity, merchantCountry, merchantDescriptor, physicalCardId, additionalQueryParams, additionalHeaders, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "SimulationCardAuthorizationCreateParams{amount=$amount, cardId=$cardId, declineReason=$declineReason, digitalWalletTokenId=$digitalWalletTokenId, direction=$direction, eventSubscriptionId=$eventSubscriptionId, merchantAcceptorId=$merchantAcceptorId, merchantCategoryCode=$merchantCategoryCode, merchantCity=$merchantCity, merchantCountry=$merchantCountry, merchantDescriptor=$merchantDescriptor, physicalCardId=$physicalCardId, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var amount: Long? = null
        private var cardId: String? = null
        private var declineReason: DeclineReason? = null
        private var digitalWalletTokenId: String? = null
        private var direction: Direction? = null
        private var eventSubscriptionId: String? = null
        private var merchantAcceptorId: String? = null
        private var merchantCategoryCode: String? = null
        private var merchantCity: String? = null
        private var merchantCountry: String? = null
        private var merchantDescriptor: String? = null
        private var physicalCardId: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            simulationCardAuthorizationCreateParams: SimulationCardAuthorizationCreateParams
        ) = apply {
            this.amount = simulationCardAuthorizationCreateParams.amount
            this.cardId = simulationCardAuthorizationCreateParams.cardId
            this.declineReason = simulationCardAuthorizationCreateParams.declineReason
            this.digitalWalletTokenId = simulationCardAuthorizationCreateParams.digitalWalletTokenId
            this.direction = simulationCardAuthorizationCreateParams.direction
            this.eventSubscriptionId = simulationCardAuthorizationCreateParams.eventSubscriptionId
            this.merchantAcceptorId = simulationCardAuthorizationCreateParams.merchantAcceptorId
            this.merchantCategoryCode = simulationCardAuthorizationCreateParams.merchantCategoryCode
            this.merchantCity = simulationCardAuthorizationCreateParams.merchantCity
            this.merchantCountry = simulationCardAuthorizationCreateParams.merchantCountry
            this.merchantDescriptor = simulationCardAuthorizationCreateParams.merchantDescriptor
            this.physicalCardId = simulationCardAuthorizationCreateParams.physicalCardId
            additionalQueryParams(simulationCardAuthorizationCreateParams.additionalQueryParams)
            additionalHeaders(simulationCardAuthorizationCreateParams.additionalHeaders)
            additionalBodyProperties(
                simulationCardAuthorizationCreateParams.additionalBodyProperties
            )
        }

        /** The authorization amount in cents. */
        fun amount(amount: Long) = apply { this.amount = amount }

        /** The identifier of the Card to be authorized. */
        fun cardId(cardId: String) = apply { this.cardId = cardId }

        /** Forces a card decline with a specific reason. No real time decision will be sent. */
        fun declineReason(declineReason: DeclineReason) = apply {
            this.declineReason = declineReason
        }

        /** The identifier of the Digital Wallet Token to be authorized. */
        fun digitalWalletTokenId(digitalWalletTokenId: String) = apply {
            this.digitalWalletTokenId = digitalWalletTokenId
        }

        /**
         * The direction describes the direction the funds will move, either from the cardholder to
         * the merchant or from the merchant to the cardholder.
         */
        fun direction(direction: Direction) = apply { this.direction = direction }

        /**
         * The identifier of the Event Subscription to use. If provided, will override the default
         * real time event subscription. Because you can only create one real time decision event
         * subscription, you can use this field to route events to any specified event subscription
         * for testing purposes.
         */
        fun eventSubscriptionId(eventSubscriptionId: String) = apply {
            this.eventSubscriptionId = eventSubscriptionId
        }

        /**
         * The merchant identifier (commonly abbreviated as MID) of the merchant the card is
         * transacting with.
         */
        fun merchantAcceptorId(merchantAcceptorId: String) = apply {
            this.merchantAcceptorId = merchantAcceptorId
        }

        /**
         * The Merchant Category Code (commonly abbreviated as MCC) of the merchant the card is
         * transacting with.
         */
        fun merchantCategoryCode(merchantCategoryCode: String) = apply {
            this.merchantCategoryCode = merchantCategoryCode
        }

        /** The city the merchant resides in. */
        fun merchantCity(merchantCity: String) = apply { this.merchantCity = merchantCity }

        /** The country the merchant resides in. */
        fun merchantCountry(merchantCountry: String) = apply {
            this.merchantCountry = merchantCountry
        }

        /** The merchant descriptor of the merchant the card is transacting with. */
        fun merchantDescriptor(merchantDescriptor: String) = apply {
            this.merchantDescriptor = merchantDescriptor
        }

        /** The identifier of the Physical Card to be authorized. */
        fun physicalCardId(physicalCardId: String) = apply { this.physicalCardId = physicalCardId }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): SimulationCardAuthorizationCreateParams =
            SimulationCardAuthorizationCreateParams(
                checkNotNull(amount) { "`amount` is required but was not set" },
                cardId,
                declineReason,
                digitalWalletTokenId,
                direction,
                eventSubscriptionId,
                merchantAcceptorId,
                merchantCategoryCode,
                merchantCity,
                merchantCountry,
                merchantDescriptor,
                physicalCardId,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    class DeclineReason
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is DeclineReason && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val CARD_NOT_ACTIVE = DeclineReason(JsonField.of("card_not_active"))

            @JvmField
            val PHYSICAL_CARD_NOT_ACTIVE = DeclineReason(JsonField.of("physical_card_not_active"))

            @JvmField val ENTITY_NOT_ACTIVE = DeclineReason(JsonField.of("entity_not_active"))

            @JvmField val GROUP_LOCKED = DeclineReason(JsonField.of("group_locked"))

            @JvmField val INSUFFICIENT_FUNDS = DeclineReason(JsonField.of("insufficient_funds"))

            @JvmField val CVV2_MISMATCH = DeclineReason(JsonField.of("cvv2_mismatch"))

            @JvmField
            val CARD_EXPIRATION_MISMATCH = DeclineReason(JsonField.of("card_expiration_mismatch"))

            @JvmField
            val TRANSACTION_NOT_ALLOWED = DeclineReason(JsonField.of("transaction_not_allowed"))

            @JvmField val BREACHES_LIMIT = DeclineReason(JsonField.of("breaches_limit"))

            @JvmField val WEBHOOK_DECLINED = DeclineReason(JsonField.of("webhook_declined"))

            @JvmField val WEBHOOK_TIMED_OUT = DeclineReason(JsonField.of("webhook_timed_out"))

            @JvmField
            val DECLINED_BY_STAND_IN_PROCESSING =
                DeclineReason(JsonField.of("declined_by_stand_in_processing"))

            @JvmField
            val INVALID_PHYSICAL_CARD = DeclineReason(JsonField.of("invalid_physical_card"))

            @JvmField
            val MISSING_ORIGINAL_AUTHORIZATION =
                DeclineReason(JsonField.of("missing_original_authorization"))

            @JvmField val SUSPECTED_FRAUD = DeclineReason(JsonField.of("suspected_fraud"))

            @JvmStatic fun of(value: String) = DeclineReason(JsonField.of(value))
        }

        enum class Known {
            CARD_NOT_ACTIVE,
            PHYSICAL_CARD_NOT_ACTIVE,
            ENTITY_NOT_ACTIVE,
            GROUP_LOCKED,
            INSUFFICIENT_FUNDS,
            CVV2_MISMATCH,
            CARD_EXPIRATION_MISMATCH,
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
            CARD_EXPIRATION_MISMATCH,
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
                CARD_EXPIRATION_MISMATCH -> Value.CARD_EXPIRATION_MISMATCH
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
                CARD_EXPIRATION_MISMATCH -> Known.CARD_EXPIRATION_MISMATCH
                TRANSACTION_NOT_ALLOWED -> Known.TRANSACTION_NOT_ALLOWED
                BREACHES_LIMIT -> Known.BREACHES_LIMIT
                WEBHOOK_DECLINED -> Known.WEBHOOK_DECLINED
                WEBHOOK_TIMED_OUT -> Known.WEBHOOK_TIMED_OUT
                DECLINED_BY_STAND_IN_PROCESSING -> Known.DECLINED_BY_STAND_IN_PROCESSING
                INVALID_PHYSICAL_CARD -> Known.INVALID_PHYSICAL_CARD
                MISSING_ORIGINAL_AUTHORIZATION -> Known.MISSING_ORIGINAL_AUTHORIZATION
                SUSPECTED_FRAUD -> Known.SUSPECTED_FRAUD
                else -> throw IncreaseInvalidDataException("Unknown DeclineReason: $value")
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
}
