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

            return other is SimulationCardAuthorizationCreateBody &&
                this.amount == other.amount &&
                this.cardId == other.cardId &&
                this.digitalWalletTokenId == other.digitalWalletTokenId &&
                this.direction == other.direction &&
                this.eventSubscriptionId == other.eventSubscriptionId &&
                this.merchantAcceptorId == other.merchantAcceptorId &&
                this.merchantCategoryCode == other.merchantCategoryCode &&
                this.merchantCity == other.merchantCity &&
                this.merchantCountry == other.merchantCountry &&
                this.merchantDescriptor == other.merchantDescriptor &&
                this.physicalCardId == other.physicalCardId &&
                this.additionalProperties == other.additionalProperties
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        amount,
                        cardId,
                        digitalWalletTokenId,
                        direction,
                        eventSubscriptionId,
                        merchantAcceptorId,
                        merchantCategoryCode,
                        merchantCity,
                        merchantCountry,
                        merchantDescriptor,
                        physicalCardId,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "SimulationCardAuthorizationCreateBody{amount=$amount, cardId=$cardId, digitalWalletTokenId=$digitalWalletTokenId, direction=$direction, eventSubscriptionId=$eventSubscriptionId, merchantAcceptorId=$merchantAcceptorId, merchantCategoryCode=$merchantCategoryCode, merchantCity=$merchantCity, merchantCountry=$merchantCountry, merchantDescriptor=$merchantDescriptor, physicalCardId=$physicalCardId, additionalProperties=$additionalProperties}"
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SimulationCardAuthorizationCreateParams &&
            this.amount == other.amount &&
            this.cardId == other.cardId &&
            this.digitalWalletTokenId == other.digitalWalletTokenId &&
            this.direction == other.direction &&
            this.eventSubscriptionId == other.eventSubscriptionId &&
            this.merchantAcceptorId == other.merchantAcceptorId &&
            this.merchantCategoryCode == other.merchantCategoryCode &&
            this.merchantCity == other.merchantCity &&
            this.merchantCountry == other.merchantCountry &&
            this.merchantDescriptor == other.merchantDescriptor &&
            this.physicalCardId == other.physicalCardId &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            amount,
            cardId,
            digitalWalletTokenId,
            direction,
            eventSubscriptionId,
            merchantAcceptorId,
            merchantCategoryCode,
            merchantCity,
            merchantCountry,
            merchantDescriptor,
            physicalCardId,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "SimulationCardAuthorizationCreateParams{amount=$amount, cardId=$cardId, digitalWalletTokenId=$digitalWalletTokenId, direction=$direction, eventSubscriptionId=$eventSubscriptionId, merchantAcceptorId=$merchantAcceptorId, merchantCategoryCode=$merchantCategoryCode, merchantCity=$merchantCity, merchantCountry=$merchantCountry, merchantDescriptor=$merchantDescriptor, physicalCardId=$physicalCardId, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var amount: Long? = null
        private var cardId: String? = null
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
}
