// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.Params
import com.increase.api.core.checkRequired
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.core.immutableEmptyMap
import com.increase.api.core.toImmutable
import java.util.Objects

/**
 * Simulates the fuel confirmation of an authorization by a card acquirer. This happens
 * asynchronously right after a fuel pump transaction is completed. A fuel confirmation can only
 * happen once per authorization.
 */
class SimulationCardFuelConfirmationCreateParams
private constructor(
    private val body: SimulationCardFuelConfirmationCreateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** The amount of the fuel_confirmation in minor units in the card authorization's currency. */
    fun amount(): Long = body.amount()

    /** The identifier of the Card Payment to create a fuel_confirmation on. */
    fun cardPaymentId(): String = body.cardPaymentId()

    /** The amount of the fuel_confirmation in minor units in the card authorization's currency. */
    fun _amount(): JsonField<Long> = body._amount()

    /** The identifier of the Card Payment to create a fuel_confirmation on. */
    fun _cardPaymentId(): JsonField<String> = body._cardPaymentId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun _body(): SimulationCardFuelConfirmationCreateBody = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class SimulationCardFuelConfirmationCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("amount")
        @ExcludeMissing
        private val amount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("card_payment_id")
        @ExcludeMissing
        private val cardPaymentId: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * The amount of the fuel_confirmation in minor units in the card authorization's currency.
         */
        fun amount(): Long = amount.getRequired("amount")

        /** The identifier of the Card Payment to create a fuel_confirmation on. */
        fun cardPaymentId(): String = cardPaymentId.getRequired("card_payment_id")

        /**
         * The amount of the fuel_confirmation in minor units in the card authorization's currency.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

        /** The identifier of the Card Payment to create a fuel_confirmation on. */
        @JsonProperty("card_payment_id")
        @ExcludeMissing
        fun _cardPaymentId(): JsonField<String> = cardPaymentId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): SimulationCardFuelConfirmationCreateBody = apply {
            if (validated) {
                return@apply
            }

            amount()
            cardPaymentId()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [SimulationCardFuelConfirmationCreateBody]. */
        class Builder internal constructor() {

            private var amount: JsonField<Long>? = null
            private var cardPaymentId: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                simulationCardFuelConfirmationCreateBody: SimulationCardFuelConfirmationCreateBody
            ) = apply {
                amount = simulationCardFuelConfirmationCreateBody.amount
                cardPaymentId = simulationCardFuelConfirmationCreateBody.cardPaymentId
                additionalProperties =
                    simulationCardFuelConfirmationCreateBody.additionalProperties.toMutableMap()
            }

            /**
             * The amount of the fuel_confirmation in minor units in the card authorization's
             * currency.
             */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /**
             * The amount of the fuel_confirmation in minor units in the card authorization's
             * currency.
             */
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            /** The identifier of the Card Payment to create a fuel_confirmation on. */
            fun cardPaymentId(cardPaymentId: String) = cardPaymentId(JsonField.of(cardPaymentId))

            /** The identifier of the Card Payment to create a fuel_confirmation on. */
            fun cardPaymentId(cardPaymentId: JsonField<String>) = apply {
                this.cardPaymentId = cardPaymentId
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

            fun build(): SimulationCardFuelConfirmationCreateBody =
                SimulationCardFuelConfirmationCreateBody(
                    checkRequired("amount", amount),
                    checkRequired("cardPaymentId", cardPaymentId),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is SimulationCardFuelConfirmationCreateBody && amount == other.amount && cardPaymentId == other.cardPaymentId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(amount, cardPaymentId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SimulationCardFuelConfirmationCreateBody{amount=$amount, cardPaymentId=$cardPaymentId, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SimulationCardFuelConfirmationCreateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: SimulationCardFuelConfirmationCreateBody.Builder =
            SimulationCardFuelConfirmationCreateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            simulationCardFuelConfirmationCreateParams: SimulationCardFuelConfirmationCreateParams
        ) = apply {
            body = simulationCardFuelConfirmationCreateParams.body.toBuilder()
            additionalHeaders =
                simulationCardFuelConfirmationCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                simulationCardFuelConfirmationCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * The amount of the fuel_confirmation in minor units in the card authorization's currency.
         */
        fun amount(amount: Long) = apply { body.amount(amount) }

        /**
         * The amount of the fuel_confirmation in minor units in the card authorization's currency.
         */
        fun amount(amount: JsonField<Long>) = apply { body.amount(amount) }

        /** The identifier of the Card Payment to create a fuel_confirmation on. */
        fun cardPaymentId(cardPaymentId: String) = apply { body.cardPaymentId(cardPaymentId) }

        /** The identifier of the Card Payment to create a fuel_confirmation on. */
        fun cardPaymentId(cardPaymentId: JsonField<String>) = apply {
            body.cardPaymentId(cardPaymentId)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        fun build(): SimulationCardFuelConfirmationCreateParams =
            SimulationCardFuelConfirmationCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SimulationCardFuelConfirmationCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "SimulationCardFuelConfirmationCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
