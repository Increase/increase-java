// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.toImmutable
import com.increase.api.models.*
import java.util.Objects
import java.util.Optional

class SimulationCardIncrementCreateParams
constructor(
    private val amount: Long,
    private val cardPaymentId: String,
    private val eventSubscriptionId: String?,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun amount(): Long = amount

    fun cardPaymentId(): String = cardPaymentId

    fun eventSubscriptionId(): Optional<String> = Optional.ofNullable(eventSubscriptionId)

    @JvmSynthetic
    internal fun getBody(): SimulationCardIncrementCreateBody {
        return SimulationCardIncrementCreateBody(
            amount,
            cardPaymentId,
            eventSubscriptionId,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JsonDeserialize(builder = SimulationCardIncrementCreateBody.Builder::class)
    @NoAutoDetect
    class SimulationCardIncrementCreateBody
    internal constructor(
        private val amount: Long?,
        private val cardPaymentId: String?,
        private val eventSubscriptionId: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The amount of the increment in minor units in the card authorization's currency. */
        @JsonProperty("amount") fun amount(): Long? = amount

        /** The identifier of the Card Payment to create a increment on. */
        @JsonProperty("card_payment_id") fun cardPaymentId(): String? = cardPaymentId

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

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var amount: Long? = null
            private var cardPaymentId: String? = null
            private var eventSubscriptionId: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                simulationCardIncrementCreateBody: SimulationCardIncrementCreateBody
            ) = apply {
                this.amount = simulationCardIncrementCreateBody.amount
                this.cardPaymentId = simulationCardIncrementCreateBody.cardPaymentId
                this.eventSubscriptionId = simulationCardIncrementCreateBody.eventSubscriptionId
                additionalProperties(simulationCardIncrementCreateBody.additionalProperties)
            }

            /** The amount of the increment in minor units in the card authorization's currency. */
            @JsonProperty("amount") fun amount(amount: Long) = apply { this.amount = amount }

            /** The identifier of the Card Payment to create a increment on. */
            @JsonProperty("card_payment_id")
            fun cardPaymentId(cardPaymentId: String) = apply { this.cardPaymentId = cardPaymentId }

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

            fun build(): SimulationCardIncrementCreateBody =
                SimulationCardIncrementCreateBody(
                    checkNotNull(amount) { "`amount` is required but was not set" },
                    checkNotNull(cardPaymentId) { "`cardPaymentId` is required but was not set" },
                    eventSubscriptionId,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is SimulationCardIncrementCreateBody && this.amount == other.amount && this.cardPaymentId == other.cardPaymentId && this.eventSubscriptionId == other.eventSubscriptionId && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(amount, cardPaymentId, eventSubscriptionId, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "SimulationCardIncrementCreateBody{amount=$amount, cardPaymentId=$cardPaymentId, eventSubscriptionId=$eventSubscriptionId, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SimulationCardIncrementCreateParams && this.amount == other.amount && this.cardPaymentId == other.cardPaymentId && this.eventSubscriptionId == other.eventSubscriptionId && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(amount, cardPaymentId, eventSubscriptionId, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "SimulationCardIncrementCreateParams{amount=$amount, cardPaymentId=$cardPaymentId, eventSubscriptionId=$eventSubscriptionId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var amount: Long? = null
        private var cardPaymentId: String? = null
        private var eventSubscriptionId: String? = null
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            simulationCardIncrementCreateParams: SimulationCardIncrementCreateParams
        ) = apply {
            this.amount = simulationCardIncrementCreateParams.amount
            this.cardPaymentId = simulationCardIncrementCreateParams.cardPaymentId
            this.eventSubscriptionId = simulationCardIncrementCreateParams.eventSubscriptionId
            additionalHeaders(simulationCardIncrementCreateParams.additionalHeaders)
            additionalQueryParams(simulationCardIncrementCreateParams.additionalQueryParams)
            additionalBodyProperties(simulationCardIncrementCreateParams.additionalBodyProperties)
        }

        /** The amount of the increment in minor units in the card authorization's currency. */
        fun amount(amount: Long) = apply { this.amount = amount }

        /** The identifier of the Card Payment to create a increment on. */
        fun cardPaymentId(cardPaymentId: String) = apply { this.cardPaymentId = cardPaymentId }

        /**
         * The identifier of the Event Subscription to use. If provided, will override the default
         * real time event subscription. Because you can only create one real time decision event
         * subscription, you can use this field to route events to any specified event subscription
         * for testing purposes.
         */
        fun eventSubscriptionId(eventSubscriptionId: String) = apply {
            this.eventSubscriptionId = eventSubscriptionId
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.putAll(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::putAdditionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replaceValues(name, listOf(value))
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replaceValues(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::replaceAdditionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.removeAll(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            names.forEach(::removeAdditionalHeaders)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.putAll(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::putAdditionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replaceValues(key, listOf(value))
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replaceValues(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::replaceAdditionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply {
            additionalQueryParams.removeAll(key)
        }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalQueryParams)
        }

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

        fun build(): SimulationCardIncrementCreateParams =
            SimulationCardIncrementCreateParams(
                checkNotNull(amount) { "`amount` is required but was not set" },
                checkNotNull(cardPaymentId) { "`cardPaymentId` is required but was not set" },
                eventSubscriptionId,
                additionalHeaders
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalQueryParams
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalBodyProperties.toImmutable(),
            )
    }
}
