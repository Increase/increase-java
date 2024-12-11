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

/** The results of a Digital Wallet Token simulation. */
@JsonDeserialize(builder = SimulationDigitalWalletTokenRequestCreateResponse.Builder::class)
@NoAutoDetect
class SimulationDigitalWalletTokenRequestCreateResponse
private constructor(
    private val declineReason: JsonField<DeclineReason>,
    private val digitalWalletTokenId: JsonField<String>,
    private val type: JsonField<Type>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /**
     * If the simulated tokenization attempt was declined, this field contains details as to why.
     */
    fun declineReason(): Optional<DeclineReason> =
        Optional.ofNullable(declineReason.getNullable("decline_reason"))

    /**
     * If the simulated tokenization attempt was accepted, this field contains the id of the Digital
     * Wallet Token that was created.
     */
    fun digitalWalletTokenId(): Optional<String> =
        Optional.ofNullable(digitalWalletTokenId.getNullable("digital_wallet_token_id"))

    /**
     * A constant representing the object's type. For this resource it will always be
     * `inbound_digital_wallet_token_request_simulation_result`.
     */
    fun type(): Type = type.getRequired("type")

    /**
     * If the simulated tokenization attempt was declined, this field contains details as to why.
     */
    @JsonProperty("decline_reason") @ExcludeMissing fun _declineReason() = declineReason

    /**
     * If the simulated tokenization attempt was accepted, this field contains the id of the Digital
     * Wallet Token that was created.
     */
    @JsonProperty("digital_wallet_token_id")
    @ExcludeMissing
    fun _digitalWalletTokenId() = digitalWalletTokenId

    /**
     * A constant representing the object's type. For this resource it will always be
     * `inbound_digital_wallet_token_request_simulation_result`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): SimulationDigitalWalletTokenRequestCreateResponse = apply {
        if (!validated) {
            declineReason()
            digitalWalletTokenId()
            type()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var declineReason: JsonField<DeclineReason> = JsonMissing.of()
        private var digitalWalletTokenId: JsonField<String> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            simulationDigitalWalletTokenRequestCreateResponse:
                SimulationDigitalWalletTokenRequestCreateResponse
        ) = apply {
            this.declineReason = simulationDigitalWalletTokenRequestCreateResponse.declineReason
            this.digitalWalletTokenId =
                simulationDigitalWalletTokenRequestCreateResponse.digitalWalletTokenId
            this.type = simulationDigitalWalletTokenRequestCreateResponse.type
            additionalProperties(
                simulationDigitalWalletTokenRequestCreateResponse.additionalProperties
            )
        }

        /**
         * If the simulated tokenization attempt was declined, this field contains details as to
         * why.
         */
        fun declineReason(declineReason: DeclineReason) = declineReason(JsonField.of(declineReason))

        /**
         * If the simulated tokenization attempt was declined, this field contains details as to
         * why.
         */
        @JsonProperty("decline_reason")
        @ExcludeMissing
        fun declineReason(declineReason: JsonField<DeclineReason>) = apply {
            this.declineReason = declineReason
        }

        /**
         * If the simulated tokenization attempt was accepted, this field contains the id of the
         * Digital Wallet Token that was created.
         */
        fun digitalWalletTokenId(digitalWalletTokenId: String) =
            digitalWalletTokenId(JsonField.of(digitalWalletTokenId))

        /**
         * If the simulated tokenization attempt was accepted, this field contains the id of the
         * Digital Wallet Token that was created.
         */
        @JsonProperty("digital_wallet_token_id")
        @ExcludeMissing
        fun digitalWalletTokenId(digitalWalletTokenId: JsonField<String>) = apply {
            this.digitalWalletTokenId = digitalWalletTokenId
        }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `inbound_digital_wallet_token_request_simulation_result`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be
         * `inbound_digital_wallet_token_request_simulation_result`.
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

        fun build(): SimulationDigitalWalletTokenRequestCreateResponse =
            SimulationDigitalWalletTokenRequestCreateResponse(
                declineReason,
                digitalWalletTokenId,
                type,
                additionalProperties.toImmutable(),
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

            return /* spotless:off */ other is DeclineReason && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val CARD_NOT_ACTIVE = of("card_not_active")

            @JvmField val NO_VERIFICATION_METHOD = of("no_verification_method")

            @JvmField val WEBHOOK_TIMED_OUT = of("webhook_timed_out")

            @JvmField val WEBHOOK_DECLINED = of("webhook_declined")

            @JvmStatic fun of(value: String) = DeclineReason(JsonField.of(value))
        }

        enum class Known {
            CARD_NOT_ACTIVE,
            NO_VERIFICATION_METHOD,
            WEBHOOK_TIMED_OUT,
            WEBHOOK_DECLINED,
        }

        enum class Value {
            CARD_NOT_ACTIVE,
            NO_VERIFICATION_METHOD,
            WEBHOOK_TIMED_OUT,
            WEBHOOK_DECLINED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                CARD_NOT_ACTIVE -> Value.CARD_NOT_ACTIVE
                NO_VERIFICATION_METHOD -> Value.NO_VERIFICATION_METHOD
                WEBHOOK_TIMED_OUT -> Value.WEBHOOK_TIMED_OUT
                WEBHOOK_DECLINED -> Value.WEBHOOK_DECLINED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                CARD_NOT_ACTIVE -> Known.CARD_NOT_ACTIVE
                NO_VERIFICATION_METHOD -> Known.NO_VERIFICATION_METHOD
                WEBHOOK_TIMED_OUT -> Known.WEBHOOK_TIMED_OUT
                WEBHOOK_DECLINED -> Known.WEBHOOK_DECLINED
                else -> throw IncreaseInvalidDataException("Unknown DeclineReason: $value")
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

            return /* spotless:off */ other is Type && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField
            val INBOUND_DIGITAL_WALLET_TOKEN_REQUEST_SIMULATION_RESULT =
                of("inbound_digital_wallet_token_request_simulation_result")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            INBOUND_DIGITAL_WALLET_TOKEN_REQUEST_SIMULATION_RESULT,
        }

        enum class Value {
            INBOUND_DIGITAL_WALLET_TOKEN_REQUEST_SIMULATION_RESULT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                INBOUND_DIGITAL_WALLET_TOKEN_REQUEST_SIMULATION_RESULT ->
                    Value.INBOUND_DIGITAL_WALLET_TOKEN_REQUEST_SIMULATION_RESULT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                INBOUND_DIGITAL_WALLET_TOKEN_REQUEST_SIMULATION_RESULT ->
                    Known.INBOUND_DIGITAL_WALLET_TOKEN_REQUEST_SIMULATION_RESULT
                else -> throw IncreaseInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SimulationDigitalWalletTokenRequestCreateResponse && declineReason == other.declineReason && digitalWalletTokenId == other.digitalWalletTokenId && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(declineReason, digitalWalletTokenId, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SimulationDigitalWalletTokenRequestCreateResponse{declineReason=$declineReason, digitalWalletTokenId=$digitalWalletTokenId, type=$type, additionalProperties=$additionalProperties}"
}
