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

/** The results of a Digital Wallet Token simulation. */
@NoAutoDetect
class SimulationDigitalWalletTokenRequestCreateResponse
@JsonCreator
private constructor(
    @JsonProperty("decline_reason")
    @ExcludeMissing
    private val declineReason: JsonField<DeclineReason> = JsonMissing.of(),
    @JsonProperty("digital_wallet_token_id")
    @ExcludeMissing
    private val digitalWalletTokenId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

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
    @JsonProperty("decline_reason")
    @ExcludeMissing
    fun _declineReason(): JsonField<DeclineReason> = declineReason

    /**
     * If the simulated tokenization attempt was accepted, this field contains the id of the Digital
     * Wallet Token that was created.
     */
    @JsonProperty("digital_wallet_token_id")
    @ExcludeMissing
    fun _digitalWalletTokenId(): JsonField<String> = digitalWalletTokenId

    /**
     * A constant representing the object's type. For this resource it will always be
     * `inbound_digital_wallet_token_request_simulation_result`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): SimulationDigitalWalletTokenRequestCreateResponse = apply {
        if (validated) {
            return@apply
        }

        declineReason()
        digitalWalletTokenId()
        type()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [SimulationDigitalWalletTokenRequestCreateResponse].
         *
         * The following fields are required:
         * ```java
         * .declineReason()
         * .digitalWalletTokenId()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SimulationDigitalWalletTokenRequestCreateResponse]. */
    class Builder internal constructor() {

        private var declineReason: JsonField<DeclineReason>? = null
        private var digitalWalletTokenId: JsonField<String>? = null
        private var type: JsonField<Type>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            simulationDigitalWalletTokenRequestCreateResponse:
                SimulationDigitalWalletTokenRequestCreateResponse
        ) = apply {
            declineReason = simulationDigitalWalletTokenRequestCreateResponse.declineReason
            digitalWalletTokenId =
                simulationDigitalWalletTokenRequestCreateResponse.digitalWalletTokenId
            type = simulationDigitalWalletTokenRequestCreateResponse.type
            additionalProperties =
                simulationDigitalWalletTokenRequestCreateResponse.additionalProperties
                    .toMutableMap()
        }

        /**
         * If the simulated tokenization attempt was declined, this field contains details as to
         * why.
         */
        fun declineReason(declineReason: DeclineReason?) =
            declineReason(JsonField.ofNullable(declineReason))

        /**
         * If the simulated tokenization attempt was declined, this field contains details as to
         * why.
         */
        fun declineReason(declineReason: Optional<DeclineReason>) =
            declineReason(declineReason.orElse(null))

        /**
         * If the simulated tokenization attempt was declined, this field contains details as to
         * why.
         */
        fun declineReason(declineReason: JsonField<DeclineReason>) = apply {
            this.declineReason = declineReason
        }

        /**
         * If the simulated tokenization attempt was accepted, this field contains the id of the
         * Digital Wallet Token that was created.
         */
        fun digitalWalletTokenId(digitalWalletTokenId: String?) =
            digitalWalletTokenId(JsonField.ofNullable(digitalWalletTokenId))

        /**
         * If the simulated tokenization attempt was accepted, this field contains the id of the
         * Digital Wallet Token that was created.
         */
        fun digitalWalletTokenId(digitalWalletTokenId: Optional<String>) =
            digitalWalletTokenId(digitalWalletTokenId.orElse(null))

        /**
         * If the simulated tokenization attempt was accepted, this field contains the id of the
         * Digital Wallet Token that was created.
         */
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

        fun build(): SimulationDigitalWalletTokenRequestCreateResponse =
            SimulationDigitalWalletTokenRequestCreateResponse(
                checkRequired("declineReason", declineReason),
                checkRequired("digitalWalletTokenId", digitalWalletTokenId),
                checkRequired("type", type),
                additionalProperties.toImmutable(),
            )
    }

    /**
     * If the simulated tokenization attempt was declined, this field contains details as to why.
     */
    class DeclineReason @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            /** The card is not active. */
            @JvmField val CARD_NOT_ACTIVE = of("card_not_active")

            /** The card does not have a two-factor authentication method. */
            @JvmField val NO_VERIFICATION_METHOD = of("no_verification_method")

            /** Your webhook timed out when evaluating the token provisioning attempt. */
            @JvmField val WEBHOOK_TIMED_OUT = of("webhook_timed_out")

            /** Your webhook declined the token provisioning attempt. */
            @JvmField val WEBHOOK_DECLINED = of("webhook_declined")

            @JvmStatic fun of(value: String) = DeclineReason(JsonField.of(value))
        }

        /** An enum containing [DeclineReason]'s known values. */
        enum class Known {
            /** The card is not active. */
            CARD_NOT_ACTIVE,
            /** The card does not have a two-factor authentication method. */
            NO_VERIFICATION_METHOD,
            /** Your webhook timed out when evaluating the token provisioning attempt. */
            WEBHOOK_TIMED_OUT,
            /** Your webhook declined the token provisioning attempt. */
            WEBHOOK_DECLINED,
        }

        /**
         * An enum containing [DeclineReason]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [DeclineReason] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            /** The card is not active. */
            CARD_NOT_ACTIVE,
            /** The card does not have a two-factor authentication method. */
            NO_VERIFICATION_METHOD,
            /** Your webhook timed out when evaluating the token provisioning attempt. */
            WEBHOOK_TIMED_OUT,
            /** Your webhook declined the token provisioning attempt. */
            WEBHOOK_DECLINED,
            /**
             * An enum member indicating that [DeclineReason] was instantiated with an unknown
             * value.
             */
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
                CARD_NOT_ACTIVE -> Value.CARD_NOT_ACTIVE
                NO_VERIFICATION_METHOD -> Value.NO_VERIFICATION_METHOD
                WEBHOOK_TIMED_OUT -> Value.WEBHOOK_TIMED_OUT
                WEBHOOK_DECLINED -> Value.WEBHOOK_DECLINED
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
                CARD_NOT_ACTIVE -> Known.CARD_NOT_ACTIVE
                NO_VERIFICATION_METHOD -> Known.NO_VERIFICATION_METHOD
                WEBHOOK_TIMED_OUT -> Known.WEBHOOK_TIMED_OUT
                WEBHOOK_DECLINED -> Known.WEBHOOK_DECLINED
                else -> throw IncreaseInvalidDataException("Unknown DeclineReason: $value")
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

            return /* spotless:off */ other is DeclineReason && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * A constant representing the object's type. For this resource it will always be
     * `inbound_digital_wallet_token_request_simulation_result`.
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

            @JvmField
            val INBOUND_DIGITAL_WALLET_TOKEN_REQUEST_SIMULATION_RESULT =
                of("inbound_digital_wallet_token_request_simulation_result")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            INBOUND_DIGITAL_WALLET_TOKEN_REQUEST_SIMULATION_RESULT
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
            INBOUND_DIGITAL_WALLET_TOKEN_REQUEST_SIMULATION_RESULT,
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
                INBOUND_DIGITAL_WALLET_TOKEN_REQUEST_SIMULATION_RESULT ->
                    Value.INBOUND_DIGITAL_WALLET_TOKEN_REQUEST_SIMULATION_RESULT
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
                INBOUND_DIGITAL_WALLET_TOKEN_REQUEST_SIMULATION_RESULT ->
                    Known.INBOUND_DIGITAL_WALLET_TOKEN_REQUEST_SIMULATION_RESULT
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

        return /* spotless:off */ other is SimulationDigitalWalletTokenRequestCreateResponse && declineReason == other.declineReason && digitalWalletTokenId == other.digitalWalletTokenId && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(declineReason, digitalWalletTokenId, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SimulationDigitalWalletTokenRequestCreateResponse{declineReason=$declineReason, digitalWalletTokenId=$digitalWalletTokenId, type=$type, additionalProperties=$additionalProperties}"
}
