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
import java.util.Objects
import java.util.Optional

/** The results of a Card Authorization simulation. */
@NoAutoDetect
class SimulationCardAuthorizationCreateResponse
@JsonCreator
private constructor(
    @JsonProperty("declined_transaction")
    @ExcludeMissing
    private val declinedTransaction: JsonField<DeclinedTransaction> = JsonMissing.of(),
    @JsonProperty("pending_transaction")
    @ExcludeMissing
    private val pendingTransaction: JsonField<PendingTransaction> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

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
    fun _declinedTransaction(): JsonField<DeclinedTransaction> = declinedTransaction

    /**
     * If the authorization attempt succeeds, this will contain the resulting Pending Transaction
     * object. The Pending Transaction's `source` will be of `category: card_authorization`.
     */
    @JsonProperty("pending_transaction")
    @ExcludeMissing
    fun _pendingTransaction(): JsonField<PendingTransaction> = pendingTransaction

    /**
     * A constant representing the object's type. For this resource it will always be
     * `inbound_card_authorization_simulation_result`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): SimulationCardAuthorizationCreateResponse = apply {
        if (validated) {
            return@apply
        }

        declinedTransaction().ifPresent { it.validate() }
        pendingTransaction().ifPresent { it.validate() }
        type()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var declinedTransaction: JsonField<DeclinedTransaction>? = null
        private var pendingTransaction: JsonField<PendingTransaction>? = null
        private var type: JsonField<Type>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            simulationCardAuthorizationCreateResponse: SimulationCardAuthorizationCreateResponse
        ) = apply {
            declinedTransaction = simulationCardAuthorizationCreateResponse.declinedTransaction
            pendingTransaction = simulationCardAuthorizationCreateResponse.pendingTransaction
            type = simulationCardAuthorizationCreateResponse.type
            additionalProperties =
                simulationCardAuthorizationCreateResponse.additionalProperties.toMutableMap()
        }

        /**
         * If the authorization attempt fails, this will contain the resulting
         * [Declined Transaction](#declined-transactions) object. The Declined Transaction's
         * `source` will be of `category: card_decline`.
         */
        fun declinedTransaction(declinedTransaction: DeclinedTransaction?) =
            declinedTransaction(JsonField.ofNullable(declinedTransaction))

        /**
         * If the authorization attempt fails, this will contain the resulting
         * [Declined Transaction](#declined-transactions) object. The Declined Transaction's
         * `source` will be of `category: card_decline`.
         */
        fun declinedTransaction(declinedTransaction: Optional<DeclinedTransaction>) =
            declinedTransaction(declinedTransaction.orElse(null))

        /**
         * If the authorization attempt fails, this will contain the resulting
         * [Declined Transaction](#declined-transactions) object. The Declined Transaction's
         * `source` will be of `category: card_decline`.
         */
        fun declinedTransaction(declinedTransaction: JsonField<DeclinedTransaction>) = apply {
            this.declinedTransaction = declinedTransaction
        }

        /**
         * If the authorization attempt succeeds, this will contain the resulting Pending
         * Transaction object. The Pending Transaction's `source` will be of `category:
         * card_authorization`.
         */
        fun pendingTransaction(pendingTransaction: PendingTransaction?) =
            pendingTransaction(JsonField.ofNullable(pendingTransaction))

        /**
         * If the authorization attempt succeeds, this will contain the resulting Pending
         * Transaction object. The Pending Transaction's `source` will be of `category:
         * card_authorization`.
         */
        fun pendingTransaction(pendingTransaction: Optional<PendingTransaction>) =
            pendingTransaction(pendingTransaction.orElse(null))

        /**
         * If the authorization attempt succeeds, this will contain the resulting Pending
         * Transaction object. The Pending Transaction's `source` will be of `category:
         * card_authorization`.
         */
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

        fun build(): SimulationCardAuthorizationCreateResponse =
            SimulationCardAuthorizationCreateResponse(
                checkRequired("declinedTransaction", declinedTransaction),
                checkRequired("pendingTransaction", pendingTransaction),
                checkRequired("type", type),
                additionalProperties.toImmutable(),
            )
    }

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

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

        return /* spotless:off */ other is SimulationCardAuthorizationCreateResponse && declinedTransaction == other.declinedTransaction && pendingTransaction == other.pendingTransaction && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(declinedTransaction, pendingTransaction, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SimulationCardAuthorizationCreateResponse{declinedTransaction=$declinedTransaction, pendingTransaction=$pendingTransaction, type=$type, additionalProperties=$additionalProperties}"
}
