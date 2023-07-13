package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.toUnmodifiable
import com.increase.api.models.*
import java.util.Objects
import java.util.Optional

class SimulationCardAuthorizeParams
constructor(
    private val amount: Long,
    private val cardId: String?,
    private val physicalCardId: String?,
    private val digitalWalletTokenId: String?,
    private val eventSubscriptionId: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun amount(): Long = amount

    fun cardId(): Optional<String> = Optional.ofNullable(cardId)

    fun physicalCardId(): Optional<String> = Optional.ofNullable(physicalCardId)

    fun digitalWalletTokenId(): Optional<String> = Optional.ofNullable(digitalWalletTokenId)

    fun eventSubscriptionId(): Optional<String> = Optional.ofNullable(eventSubscriptionId)

    @JvmSynthetic
    internal fun getBody(): SimulationCardAuthorizeBody {
        return SimulationCardAuthorizeBody(
            amount,
            cardId,
            physicalCardId,
            digitalWalletTokenId,
            eventSubscriptionId,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = SimulationCardAuthorizeBody.Builder::class)
    @NoAutoDetect
    class SimulationCardAuthorizeBody
    internal constructor(
        private val amount: Long?,
        private val cardId: String?,
        private val physicalCardId: String?,
        private val digitalWalletTokenId: String?,
        private val eventSubscriptionId: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** The authorization amount in cents. */
        @JsonProperty("amount") fun amount(): Long? = amount

        /** The identifier of the Card to be authorized. */
        @JsonProperty("card_id") fun cardId(): String? = cardId

        /** The identifier of the Physical Card to be authorized. */
        @JsonProperty("physical_card_id") fun physicalCardId(): String? = physicalCardId

        /** The identifier of the Digital Wallet Token to be authorized. */
        @JsonProperty("digital_wallet_token_id")
        fun digitalWalletTokenId(): String? = digitalWalletTokenId

        /**
         * The identifier of the Event Subscription to use. If provided, will override the default
         * real time event subscription. Because you can only create one real time decision event
         * subscription, you can use this field to route events to any specified event subscription
         * for testing purposes.
         */
        @JsonProperty("event_subscription_id")
        fun eventSubscriptionId(): String? = eventSubscriptionId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SimulationCardAuthorizeBody &&
                this.amount == other.amount &&
                this.cardId == other.cardId &&
                this.physicalCardId == other.physicalCardId &&
                this.digitalWalletTokenId == other.digitalWalletTokenId &&
                this.eventSubscriptionId == other.eventSubscriptionId &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        amount,
                        cardId,
                        physicalCardId,
                        digitalWalletTokenId,
                        eventSubscriptionId,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "SimulationCardAuthorizeBody{amount=$amount, cardId=$cardId, physicalCardId=$physicalCardId, digitalWalletTokenId=$digitalWalletTokenId, eventSubscriptionId=$eventSubscriptionId, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var amount: Long? = null
            private var cardId: String? = null
            private var physicalCardId: String? = null
            private var digitalWalletTokenId: String? = null
            private var eventSubscriptionId: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(simulationCardAuthorizeBody: SimulationCardAuthorizeBody) = apply {
                this.amount = simulationCardAuthorizeBody.amount
                this.cardId = simulationCardAuthorizeBody.cardId
                this.physicalCardId = simulationCardAuthorizeBody.physicalCardId
                this.digitalWalletTokenId = simulationCardAuthorizeBody.digitalWalletTokenId
                this.eventSubscriptionId = simulationCardAuthorizeBody.eventSubscriptionId
                additionalProperties(simulationCardAuthorizeBody.additionalProperties)
            }

            /** The authorization amount in cents. */
            @JsonProperty("amount") fun amount(amount: Long) = apply { this.amount = amount }

            /** The identifier of the Card to be authorized. */
            @JsonProperty("card_id") fun cardId(cardId: String) = apply { this.cardId = cardId }

            /** The identifier of the Physical Card to be authorized. */
            @JsonProperty("physical_card_id")
            fun physicalCardId(physicalCardId: String) = apply {
                this.physicalCardId = physicalCardId
            }

            /** The identifier of the Digital Wallet Token to be authorized. */
            @JsonProperty("digital_wallet_token_id")
            fun digitalWalletTokenId(digitalWalletTokenId: String) = apply {
                this.digitalWalletTokenId = digitalWalletTokenId
            }

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

            fun build(): SimulationCardAuthorizeBody =
                SimulationCardAuthorizeBody(
                    checkNotNull(amount) { "`amount` is required but was not set" },
                    cardId,
                    physicalCardId,
                    digitalWalletTokenId,
                    eventSubscriptionId,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SimulationCardAuthorizeParams &&
            this.amount == other.amount &&
            this.cardId == other.cardId &&
            this.physicalCardId == other.physicalCardId &&
            this.digitalWalletTokenId == other.digitalWalletTokenId &&
            this.eventSubscriptionId == other.eventSubscriptionId &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            amount,
            cardId,
            physicalCardId,
            digitalWalletTokenId,
            eventSubscriptionId,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "SimulationCardAuthorizeParams{amount=$amount, cardId=$cardId, physicalCardId=$physicalCardId, digitalWalletTokenId=$digitalWalletTokenId, eventSubscriptionId=$eventSubscriptionId, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var amount: Long? = null
        private var cardId: String? = null
        private var physicalCardId: String? = null
        private var digitalWalletTokenId: String? = null
        private var eventSubscriptionId: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(simulationCardAuthorizeParams: SimulationCardAuthorizeParams) = apply {
            this.amount = simulationCardAuthorizeParams.amount
            this.cardId = simulationCardAuthorizeParams.cardId
            this.physicalCardId = simulationCardAuthorizeParams.physicalCardId
            this.digitalWalletTokenId = simulationCardAuthorizeParams.digitalWalletTokenId
            this.eventSubscriptionId = simulationCardAuthorizeParams.eventSubscriptionId
            additionalQueryParams(simulationCardAuthorizeParams.additionalQueryParams)
            additionalHeaders(simulationCardAuthorizeParams.additionalHeaders)
            additionalBodyProperties(simulationCardAuthorizeParams.additionalBodyProperties)
        }

        /** The authorization amount in cents. */
        fun amount(amount: Long) = apply { this.amount = amount }

        /** The identifier of the Card to be authorized. */
        fun cardId(cardId: String) = apply { this.cardId = cardId }

        /** The identifier of the Physical Card to be authorized. */
        fun physicalCardId(physicalCardId: String) = apply { this.physicalCardId = physicalCardId }

        /** The identifier of the Digital Wallet Token to be authorized. */
        fun digitalWalletTokenId(digitalWalletTokenId: String) = apply {
            this.digitalWalletTokenId = digitalWalletTokenId
        }

        /**
         * The identifier of the Event Subscription to use. If provided, will override the default
         * real time event subscription. Because you can only create one real time decision event
         * subscription, you can use this field to route events to any specified event subscription
         * for testing purposes.
         */
        fun eventSubscriptionId(eventSubscriptionId: String) = apply {
            this.eventSubscriptionId = eventSubscriptionId
        }

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

        fun build(): SimulationCardAuthorizeParams =
            SimulationCardAuthorizeParams(
                checkNotNull(amount) { "`amount` is required but was not set" },
                cardId,
                physicalCardId,
                digitalWalletTokenId,
                eventSubscriptionId,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }
}
