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
import java.util.Objects
import java.util.Optional

/** The results of a Card Authorization simulation. */
@JsonDeserialize(builder = SimulationCardAuthorizationCreateResponse.Builder::class)
@NoAutoDetect
class SimulationCardAuthorizationCreateResponse
private constructor(
    private val declinedTransaction: JsonField<DeclinedTransaction>,
    private val pendingTransaction: JsonField<PendingTransaction>,
    private val type: JsonField<Type>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /**
     * If the authorization attempt fails, this will contain the resulting
     * [Declined Transaction](#declined-transactions) object. The Declined Transaction's `source`
     * will be of `category: card_decline`.
     */
    fun declinedTransaction(): Optional<DeclinedTransaction> =
        Optional.ofNullable(declinedTransaction.getNullable("declined_transaction"))

    /**
     * If the authorization attempt succeeds, this will contain the resulting Pending Transaction
     * object. The Pending Transaction's `source` will be of `category: card_authorization`.
     */
    fun pendingTransaction(): Optional<PendingTransaction> =
        Optional.ofNullable(pendingTransaction.getNullable("pending_transaction"))

    /**
     * A constant representing the object's type. For this resource it will always be
     * `inbound_card_authorization_simulation_result`.
     */
    fun type(): Type = type.getRequired("type")

    /**
     * If the authorization attempt fails, this will contain the resulting
     * [Declined Transaction](#declined-transactions) object. The Declined Transaction's `source`
     * will be of `category: card_decline`.
     */
    @JsonProperty("declined_transaction")
    @ExcludeMissing
    fun _declinedTransaction() = declinedTransaction

    /**
     * If the authorization attempt succeeds, this will contain the resulting Pending Transaction
     * object. The Pending Transaction's `source` will be of `category: card_authorization`.
     */
    @JsonProperty("pending_transaction")
    @ExcludeMissing
    fun _pendingTransaction() = pendingTransaction

    /**
     * A constant representing the object's type. For this resource it will always be
     * `inbound_card_authorization_simulation_result`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): SimulationCardAuthorizationCreateResponse = apply {
        if (!validated) {
            declinedTransaction().map { it.validate() }
            pendingTransaction().map { it.validate() }
            type()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var declinedTransaction: JsonField<DeclinedTransaction> = JsonMissing.of()
        private var pendingTransaction: JsonField<PendingTransaction> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            simulationCardAuthorizationCreateResponse: SimulationCardAuthorizationCreateResponse
        ) = apply {
            this.declinedTransaction = simulationCardAuthorizationCreateResponse.declinedTransaction
            this.pendingTransaction = simulationCardAuthorizationCreateResponse.pendingTransaction
            this.type = simulationCardAuthorizationCreateResponse.type
            additionalProperties(simulationCardAuthorizationCreateResponse.additionalProperties)
        }

        /**
         * If the authorization attempt fails, this will contain the resulting
         * [Declined Transaction](#declined-transactions) object. The Declined Transaction's
         * `source` will be of `category: card_decline`.
         */
        fun declinedTransaction(declinedTransaction: DeclinedTransaction) =
            declinedTransaction(JsonField.of(declinedTransaction))

        /**
         * If the authorization attempt fails, this will contain the resulting
         * [Declined Transaction](#declined-transactions) object. The Declined Transaction's
         * `source` will be of `category: card_decline`.
         */
        @JsonProperty("declined_transaction")
        @ExcludeMissing
        fun declinedTransaction(declinedTransaction: JsonField<DeclinedTransaction>) = apply {
            this.declinedTransaction = declinedTransaction
        }

        /**
         * If the authorization attempt succeeds, this will contain the resulting Pending
         * Transaction object. The Pending Transaction's `source` will be of `category:
         * card_authorization`.
         */
        fun pendingTransaction(pendingTransaction: PendingTransaction) =
            pendingTransaction(JsonField.of(pendingTransaction))

        /**
         * If the authorization attempt succeeds, this will contain the resulting Pending
         * Transaction object. The Pending Transaction's `source` will be of `category:
         * card_authorization`.
         */
        @JsonProperty("pending_transaction")
        @ExcludeMissing
        fun pendingTransaction(pendingTransaction: JsonField<PendingTransaction>) = apply {
            this.pendingTransaction = pendingTransaction
        }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `inbound_card_authorization_simulation_result`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be
         * `inbound_card_authorization_simulation_result`.
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

        fun build(): SimulationCardAuthorizationCreateResponse =
            SimulationCardAuthorizationCreateResponse(
                declinedTransaction,
                pendingTransaction,
                type,
                additionalProperties.toImmutable(),
            )
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

            return /* spotless:off */ other is Type && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField
            val INBOUND_CARD_AUTHORIZATION_SIMULATION_RESULT =
                of("inbound_card_authorization_simulation_result")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            INBOUND_CARD_AUTHORIZATION_SIMULATION_RESULT,
        }

        enum class Value {
            INBOUND_CARD_AUTHORIZATION_SIMULATION_RESULT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                INBOUND_CARD_AUTHORIZATION_SIMULATION_RESULT ->
                    Value.INBOUND_CARD_AUTHORIZATION_SIMULATION_RESULT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                INBOUND_CARD_AUTHORIZATION_SIMULATION_RESULT ->
                    Known.INBOUND_CARD_AUTHORIZATION_SIMULATION_RESULT
                else -> throw IncreaseInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SimulationCardAuthorizationCreateResponse && declinedTransaction == other.declinedTransaction && pendingTransaction == other.pendingTransaction && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(declinedTransaction, pendingTransaction, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SimulationCardAuthorizationCreateResponse{declinedTransaction=$declinedTransaction, pendingTransaction=$pendingTransaction, type=$type, additionalProperties=$additionalProperties}"
}
