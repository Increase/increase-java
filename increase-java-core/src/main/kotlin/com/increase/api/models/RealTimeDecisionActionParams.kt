// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.increase.api.core.Enum
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.core.immutableEmptyMap
import com.increase.api.core.toImmutable
import com.increase.api.errors.IncreaseInvalidDataException
import java.util.Objects
import java.util.Optional

class RealTimeDecisionActionParams
constructor(
    private val realTimeDecisionId: String,
    private val cardAuthentication: CardAuthentication?,
    private val cardAuthenticationChallenge: CardAuthenticationChallenge?,
    private val cardAuthorization: CardAuthorization?,
    private val digitalWalletAuthentication: DigitalWalletAuthentication?,
    private val digitalWalletToken: DigitalWalletToken?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun realTimeDecisionId(): String = realTimeDecisionId

    fun cardAuthentication(): Optional<CardAuthentication> = Optional.ofNullable(cardAuthentication)

    fun cardAuthenticationChallenge(): Optional<CardAuthenticationChallenge> =
        Optional.ofNullable(cardAuthenticationChallenge)

    fun cardAuthorization(): Optional<CardAuthorization> = Optional.ofNullable(cardAuthorization)

    fun digitalWalletAuthentication(): Optional<DigitalWalletAuthentication> =
        Optional.ofNullable(digitalWalletAuthentication)

    fun digitalWalletToken(): Optional<DigitalWalletToken> = Optional.ofNullable(digitalWalletToken)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    @JvmSynthetic
    internal fun getBody(): RealTimeDecisionActionBody {
        return RealTimeDecisionActionBody(
            cardAuthentication,
            cardAuthenticationChallenge,
            cardAuthorization,
            digitalWalletAuthentication,
            digitalWalletToken,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> realTimeDecisionId
            else -> ""
        }
    }

    @NoAutoDetect
    class RealTimeDecisionActionBody
    @JsonCreator
    internal constructor(
        @JsonProperty("card_authentication") private val cardAuthentication: CardAuthentication?,
        @JsonProperty("card_authentication_challenge")
        private val cardAuthenticationChallenge: CardAuthenticationChallenge?,
        @JsonProperty("card_authorization") private val cardAuthorization: CardAuthorization?,
        @JsonProperty("digital_wallet_authentication")
        private val digitalWalletAuthentication: DigitalWalletAuthentication?,
        @JsonProperty("digital_wallet_token") private val digitalWalletToken: DigitalWalletToken?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * If the Real-Time Decision relates to a 3DS card authentication attempt, this object
         * contains your response to the authentication.
         */
        @JsonProperty("card_authentication")
        fun cardAuthentication(): Optional<CardAuthentication> =
            Optional.ofNullable(cardAuthentication)

        /**
         * If the Real-Time Decision relates to 3DS card authentication challenge delivery, this
         * object contains your response.
         */
        @JsonProperty("card_authentication_challenge")
        fun cardAuthenticationChallenge(): Optional<CardAuthenticationChallenge> =
            Optional.ofNullable(cardAuthenticationChallenge)

        /**
         * If the Real-Time Decision relates to a card authorization attempt, this object contains
         * your response to the authorization.
         */
        @JsonProperty("card_authorization")
        fun cardAuthorization(): Optional<CardAuthorization> =
            Optional.ofNullable(cardAuthorization)

        /**
         * If the Real-Time Decision relates to a digital wallet authentication attempt, this object
         * contains your response to the authentication.
         */
        @JsonProperty("digital_wallet_authentication")
        fun digitalWalletAuthentication(): Optional<DigitalWalletAuthentication> =
            Optional.ofNullable(digitalWalletAuthentication)

        /**
         * If the Real-Time Decision relates to a digital wallet token provisioning attempt, this
         * object contains your response to the attempt.
         */
        @JsonProperty("digital_wallet_token")
        fun digitalWalletToken(): Optional<DigitalWalletToken> =
            Optional.ofNullable(digitalWalletToken)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var cardAuthentication: CardAuthentication? = null
            private var cardAuthenticationChallenge: CardAuthenticationChallenge? = null
            private var cardAuthorization: CardAuthorization? = null
            private var digitalWalletAuthentication: DigitalWalletAuthentication? = null
            private var digitalWalletToken: DigitalWalletToken? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(realTimeDecisionActionBody: RealTimeDecisionActionBody) = apply {
                cardAuthentication = realTimeDecisionActionBody.cardAuthentication
                cardAuthenticationChallenge = realTimeDecisionActionBody.cardAuthenticationChallenge
                cardAuthorization = realTimeDecisionActionBody.cardAuthorization
                digitalWalletAuthentication = realTimeDecisionActionBody.digitalWalletAuthentication
                digitalWalletToken = realTimeDecisionActionBody.digitalWalletToken
                additionalProperties =
                    realTimeDecisionActionBody.additionalProperties.toMutableMap()
            }

            /**
             * If the Real-Time Decision relates to a 3DS card authentication attempt, this object
             * contains your response to the authentication.
             */
            fun cardAuthentication(cardAuthentication: CardAuthentication) = apply {
                this.cardAuthentication = cardAuthentication
            }

            /**
             * If the Real-Time Decision relates to 3DS card authentication challenge delivery, this
             * object contains your response.
             */
            fun cardAuthenticationChallenge(
                cardAuthenticationChallenge: CardAuthenticationChallenge
            ) = apply { this.cardAuthenticationChallenge = cardAuthenticationChallenge }

            /**
             * If the Real-Time Decision relates to a card authorization attempt, this object
             * contains your response to the authorization.
             */
            fun cardAuthorization(cardAuthorization: CardAuthorization) = apply {
                this.cardAuthorization = cardAuthorization
            }

            /**
             * If the Real-Time Decision relates to a digital wallet authentication attempt, this
             * object contains your response to the authentication.
             */
            fun digitalWalletAuthentication(
                digitalWalletAuthentication: DigitalWalletAuthentication
            ) = apply { this.digitalWalletAuthentication = digitalWalletAuthentication }

            /**
             * If the Real-Time Decision relates to a digital wallet token provisioning attempt,
             * this object contains your response to the attempt.
             */
            fun digitalWalletToken(digitalWalletToken: DigitalWalletToken) = apply {
                this.digitalWalletToken = digitalWalletToken
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

            fun build(): RealTimeDecisionActionBody =
                RealTimeDecisionActionBody(
                    cardAuthentication,
                    cardAuthenticationChallenge,
                    cardAuthorization,
                    digitalWalletAuthentication,
                    digitalWalletToken,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is RealTimeDecisionActionBody && cardAuthentication == other.cardAuthentication && cardAuthenticationChallenge == other.cardAuthenticationChallenge && cardAuthorization == other.cardAuthorization && digitalWalletAuthentication == other.digitalWalletAuthentication && digitalWalletToken == other.digitalWalletToken && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(cardAuthentication, cardAuthenticationChallenge, cardAuthorization, digitalWalletAuthentication, digitalWalletToken, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "RealTimeDecisionActionBody{cardAuthentication=$cardAuthentication, cardAuthenticationChallenge=$cardAuthenticationChallenge, cardAuthorization=$cardAuthorization, digitalWalletAuthentication=$digitalWalletAuthentication, digitalWalletToken=$digitalWalletToken, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var realTimeDecisionId: String? = null
        private var cardAuthentication: CardAuthentication? = null
        private var cardAuthenticationChallenge: CardAuthenticationChallenge? = null
        private var cardAuthorization: CardAuthorization? = null
        private var digitalWalletAuthentication: DigitalWalletAuthentication? = null
        private var digitalWalletToken: DigitalWalletToken? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(realTimeDecisionActionParams: RealTimeDecisionActionParams) = apply {
            realTimeDecisionId = realTimeDecisionActionParams.realTimeDecisionId
            cardAuthentication = realTimeDecisionActionParams.cardAuthentication
            cardAuthenticationChallenge = realTimeDecisionActionParams.cardAuthenticationChallenge
            cardAuthorization = realTimeDecisionActionParams.cardAuthorization
            digitalWalletAuthentication = realTimeDecisionActionParams.digitalWalletAuthentication
            digitalWalletToken = realTimeDecisionActionParams.digitalWalletToken
            additionalHeaders = realTimeDecisionActionParams.additionalHeaders.toBuilder()
            additionalQueryParams = realTimeDecisionActionParams.additionalQueryParams.toBuilder()
            additionalBodyProperties =
                realTimeDecisionActionParams.additionalBodyProperties.toMutableMap()
        }

        /** The identifier of the Real-Time Decision. */
        fun realTimeDecisionId(realTimeDecisionId: String) = apply {
            this.realTimeDecisionId = realTimeDecisionId
        }

        /**
         * If the Real-Time Decision relates to a 3DS card authentication attempt, this object
         * contains your response to the authentication.
         */
        fun cardAuthentication(cardAuthentication: CardAuthentication) = apply {
            this.cardAuthentication = cardAuthentication
        }

        /**
         * If the Real-Time Decision relates to 3DS card authentication challenge delivery, this
         * object contains your response.
         */
        fun cardAuthenticationChallenge(cardAuthenticationChallenge: CardAuthenticationChallenge) =
            apply {
                this.cardAuthenticationChallenge = cardAuthenticationChallenge
            }

        /**
         * If the Real-Time Decision relates to a card authorization attempt, this object contains
         * your response to the authorization.
         */
        fun cardAuthorization(cardAuthorization: CardAuthorization) = apply {
            this.cardAuthorization = cardAuthorization
        }

        /**
         * If the Real-Time Decision relates to a digital wallet authentication attempt, this object
         * contains your response to the authentication.
         */
        fun digitalWalletAuthentication(digitalWalletAuthentication: DigitalWalletAuthentication) =
            apply {
                this.digitalWalletAuthentication = digitalWalletAuthentication
            }

        /**
         * If the Real-Time Decision relates to a digital wallet token provisioning attempt, this
         * object contains your response to the attempt.
         */
        fun digitalWalletToken(digitalWalletToken: DigitalWalletToken) = apply {
            this.digitalWalletToken = digitalWalletToken
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

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            putAllAdditionalBodyProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            additionalBodyProperties.remove(key)
        }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalBodyProperty)
        }

        fun build(): RealTimeDecisionActionParams =
            RealTimeDecisionActionParams(
                checkNotNull(realTimeDecisionId) {
                    "`realTimeDecisionId` is required but was not set"
                },
                cardAuthentication,
                cardAuthenticationChallenge,
                cardAuthorization,
                digitalWalletAuthentication,
                digitalWalletToken,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    /**
     * If the Real-Time Decision relates to a 3DS card authentication attempt, this object contains
     * your response to the authentication.
     */
    @NoAutoDetect
    class CardAuthentication
    @JsonCreator
    private constructor(
        @JsonProperty("decision") private val decision: Decision,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Whether the card authentication attempt should be approved or declined. */
        @JsonProperty("decision") fun decision(): Decision = decision

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var decision: Decision? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(cardAuthentication: CardAuthentication) = apply {
                decision = cardAuthentication.decision
                additionalProperties = cardAuthentication.additionalProperties.toMutableMap()
            }

            /** Whether the card authentication attempt should be approved or declined. */
            fun decision(decision: Decision) = apply { this.decision = decision }

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
                    checkNotNull(decision) { "`decision` is required but was not set" },
                    additionalProperties.toImmutable()
                )
        }

        class Decision
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val APPROVE = of("approve")

                @JvmField val CHALLENGE = of("challenge")

                @JvmField val DENY = of("deny")

                @JvmStatic fun of(value: String) = Decision(JsonField.of(value))
            }

            enum class Known {
                APPROVE,
                CHALLENGE,
                DENY,
            }

            enum class Value {
                APPROVE,
                CHALLENGE,
                DENY,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    APPROVE -> Value.APPROVE
                    CHALLENGE -> Value.CHALLENGE
                    DENY -> Value.DENY
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    APPROVE -> Known.APPROVE
                    CHALLENGE -> Known.CHALLENGE
                    DENY -> Known.DENY
                    else -> throw IncreaseInvalidDataException("Unknown Decision: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

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

            return /* spotless:off */ other is CardAuthentication && decision == other.decision && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(decision, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CardAuthentication{decision=$decision, additionalProperties=$additionalProperties}"
    }

    /**
     * If the Real-Time Decision relates to 3DS card authentication challenge delivery, this object
     * contains your response.
     */
    @NoAutoDetect
    class CardAuthenticationChallenge
    @JsonCreator
    private constructor(
        @JsonProperty("result") private val result: Result,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * Whether the card authentication challenge was successfully delivered to the cardholder.
         */
        @JsonProperty("result") fun result(): Result = result

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var result: Result? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(cardAuthenticationChallenge: CardAuthenticationChallenge) = apply {
                result = cardAuthenticationChallenge.result
                additionalProperties =
                    cardAuthenticationChallenge.additionalProperties.toMutableMap()
            }

            /**
             * Whether the card authentication challenge was successfully delivered to the
             * cardholder.
             */
            fun result(result: Result) = apply { this.result = result }

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
                    checkNotNull(result) { "`result` is required but was not set" },
                    additionalProperties.toImmutable()
                )
        }

        class Result
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val SUCCESS = of("success")

                @JvmField val FAILURE = of("failure")

                @JvmStatic fun of(value: String) = Result(JsonField.of(value))
            }

            enum class Known {
                SUCCESS,
                FAILURE,
            }

            enum class Value {
                SUCCESS,
                FAILURE,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    SUCCESS -> Value.SUCCESS
                    FAILURE -> Value.FAILURE
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    SUCCESS -> Known.SUCCESS
                    FAILURE -> Known.FAILURE
                    else -> throw IncreaseInvalidDataException("Unknown Result: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

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

            return /* spotless:off */ other is CardAuthenticationChallenge && result == other.result && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(result, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CardAuthenticationChallenge{result=$result, additionalProperties=$additionalProperties}"
    }

    /**
     * If the Real-Time Decision relates to a card authorization attempt, this object contains your
     * response to the authorization.
     */
    @NoAutoDetect
    class CardAuthorization
    @JsonCreator
    private constructor(
        @JsonProperty("decision") private val decision: Decision,
        @JsonProperty("decline_reason") private val declineReason: DeclineReason?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Whether the card authorization should be approved or declined. */
        @JsonProperty("decision") fun decision(): Decision = decision

        /**
         * The reason the card authorization was declined. This translates to a specific decline
         * code that is sent to the card network.
         */
        @JsonProperty("decline_reason")
        fun declineReason(): Optional<DeclineReason> = Optional.ofNullable(declineReason)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var decision: Decision? = null
            private var declineReason: DeclineReason? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(cardAuthorization: CardAuthorization) = apply {
                decision = cardAuthorization.decision
                declineReason = cardAuthorization.declineReason
                additionalProperties = cardAuthorization.additionalProperties.toMutableMap()
            }

            /** Whether the card authorization should be approved or declined. */
            fun decision(decision: Decision) = apply { this.decision = decision }

            /**
             * The reason the card authorization was declined. This translates to a specific decline
             * code that is sent to the card network.
             */
            fun declineReason(declineReason: DeclineReason) = apply {
                this.declineReason = declineReason
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
                    checkNotNull(decision) { "`decision` is required but was not set" },
                    declineReason,
                    additionalProperties.toImmutable(),
                )
        }

        class Decision
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val APPROVE = of("approve")

                @JvmField val DECLINE = of("decline")

                @JvmStatic fun of(value: String) = Decision(JsonField.of(value))
            }

            enum class Known {
                APPROVE,
                DECLINE,
            }

            enum class Value {
                APPROVE,
                DECLINE,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    APPROVE -> Value.APPROVE
                    DECLINE -> Value.DECLINE
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    APPROVE -> Known.APPROVE
                    DECLINE -> Known.DECLINE
                    else -> throw IncreaseInvalidDataException("Unknown Decision: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Decision && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class DeclineReason
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val INSUFFICIENT_FUNDS = of("insufficient_funds")

                @JvmField val TRANSACTION_NEVER_ALLOWED = of("transaction_never_allowed")

                @JvmField val EXCEEDS_APPROVAL_LIMIT = of("exceeds_approval_limit")

                @JvmField val CARD_TEMPORARILY_DISABLED = of("card_temporarily_disabled")

                @JvmField val SUSPECTED_FRAUD = of("suspected_fraud")

                @JvmField val OTHER = of("other")

                @JvmStatic fun of(value: String) = DeclineReason(JsonField.of(value))
            }

            enum class Known {
                INSUFFICIENT_FUNDS,
                TRANSACTION_NEVER_ALLOWED,
                EXCEEDS_APPROVAL_LIMIT,
                CARD_TEMPORARILY_DISABLED,
                SUSPECTED_FRAUD,
                OTHER,
            }

            enum class Value {
                INSUFFICIENT_FUNDS,
                TRANSACTION_NEVER_ALLOWED,
                EXCEEDS_APPROVAL_LIMIT,
                CARD_TEMPORARILY_DISABLED,
                SUSPECTED_FRAUD,
                OTHER,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    INSUFFICIENT_FUNDS -> Value.INSUFFICIENT_FUNDS
                    TRANSACTION_NEVER_ALLOWED -> Value.TRANSACTION_NEVER_ALLOWED
                    EXCEEDS_APPROVAL_LIMIT -> Value.EXCEEDS_APPROVAL_LIMIT
                    CARD_TEMPORARILY_DISABLED -> Value.CARD_TEMPORARILY_DISABLED
                    SUSPECTED_FRAUD -> Value.SUSPECTED_FRAUD
                    OTHER -> Value.OTHER
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    INSUFFICIENT_FUNDS -> Known.INSUFFICIENT_FUNDS
                    TRANSACTION_NEVER_ALLOWED -> Known.TRANSACTION_NEVER_ALLOWED
                    EXCEEDS_APPROVAL_LIMIT -> Known.EXCEEDS_APPROVAL_LIMIT
                    CARD_TEMPORARILY_DISABLED -> Known.CARD_TEMPORARILY_DISABLED
                    SUSPECTED_FRAUD -> Known.SUSPECTED_FRAUD
                    OTHER -> Known.OTHER
                    else -> throw IncreaseInvalidDataException("Unknown DeclineReason: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is DeclineReason && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CardAuthorization && decision == other.decision && declineReason == other.declineReason && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(decision, declineReason, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CardAuthorization{decision=$decision, declineReason=$declineReason, additionalProperties=$additionalProperties}"
    }

    /**
     * If the Real-Time Decision relates to a digital wallet authentication attempt, this object
     * contains your response to the authentication.
     */
    @NoAutoDetect
    class DigitalWalletAuthentication
    @JsonCreator
    private constructor(
        @JsonProperty("result") private val result: Result,
        @JsonProperty("success") private val success: Success?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Whether your application was able to deliver the one-time passcode. */
        @JsonProperty("result") fun result(): Result = result

        @JsonProperty("success") fun success(): Optional<Success> = Optional.ofNullable(success)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var result: Result? = null
            private var success: Success? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(digitalWalletAuthentication: DigitalWalletAuthentication) = apply {
                result = digitalWalletAuthentication.result
                success = digitalWalletAuthentication.success
                additionalProperties =
                    digitalWalletAuthentication.additionalProperties.toMutableMap()
            }

            /** Whether your application was able to deliver the one-time passcode. */
            fun result(result: Result) = apply { this.result = result }

            fun success(success: Success) = apply { this.success = success }

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
                    checkNotNull(result) { "`result` is required but was not set" },
                    success,
                    additionalProperties.toImmutable(),
                )
        }

        class Result
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val SUCCESS = of("success")

                @JvmField val FAILURE = of("failure")

                @JvmStatic fun of(value: String) = Result(JsonField.of(value))
            }

            enum class Known {
                SUCCESS,
                FAILURE,
            }

            enum class Value {
                SUCCESS,
                FAILURE,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    SUCCESS -> Value.SUCCESS
                    FAILURE -> Value.FAILURE
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    SUCCESS -> Known.SUCCESS
                    FAILURE -> Known.FAILURE
                    else -> throw IncreaseInvalidDataException("Unknown Result: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Result && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        @NoAutoDetect
        class Success
        @JsonCreator
        private constructor(
            @JsonProperty("email") private val email: String?,
            @JsonProperty("phone") private val phone: String?,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The email address that was used to verify the cardholder via one-time passcode. */
            @JsonProperty("email") fun email(): Optional<String> = Optional.ofNullable(email)

            /**
             * The phone number that was used to verify the cardholder via one-time passcode over
             * SMS.
             */
            @JsonProperty("phone") fun phone(): Optional<String> = Optional.ofNullable(phone)

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var email: String? = null
                private var phone: String? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(success: Success) = apply {
                    email = success.email
                    phone = success.phone
                    additionalProperties = success.additionalProperties.toMutableMap()
                }

                /**
                 * The email address that was used to verify the cardholder via one-time passcode.
                 */
                fun email(email: String) = apply { this.email = email }

                /**
                 * The phone number that was used to verify the cardholder via one-time passcode
                 * over SMS.
                 */
                fun phone(phone: String) = apply { this.phone = phone }

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

                fun build(): Success =
                    Success(
                        email,
                        phone,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Success && email == other.email && phone == other.phone && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(email, phone, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Success{email=$email, phone=$phone, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is DigitalWalletAuthentication && result == other.result && success == other.success && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(result, success, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DigitalWalletAuthentication{result=$result, success=$success, additionalProperties=$additionalProperties}"
    }

    /**
     * If the Real-Time Decision relates to a digital wallet token provisioning attempt, this object
     * contains your response to the attempt.
     */
    @NoAutoDetect
    class DigitalWalletToken
    @JsonCreator
    private constructor(
        @JsonProperty("approval") private val approval: Approval?,
        @JsonProperty("decline") private val decline: Decline?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * If your application approves the provisioning attempt, this contains metadata about the
         * digital wallet token that will be generated.
         */
        @JsonProperty("approval") fun approval(): Optional<Approval> = Optional.ofNullable(approval)

        /**
         * If your application declines the provisioning attempt, this contains details about the
         * decline.
         */
        @JsonProperty("decline") fun decline(): Optional<Decline> = Optional.ofNullable(decline)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var approval: Approval? = null
            private var decline: Decline? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(digitalWalletToken: DigitalWalletToken) = apply {
                approval = digitalWalletToken.approval
                decline = digitalWalletToken.decline
                additionalProperties = digitalWalletToken.additionalProperties.toMutableMap()
            }

            /**
             * If your application approves the provisioning attempt, this contains metadata about
             * the digital wallet token that will be generated.
             */
            fun approval(approval: Approval) = apply { this.approval = approval }

            /**
             * If your application declines the provisioning attempt, this contains details about
             * the decline.
             */
            fun decline(decline: Decline) = apply { this.decline = decline }

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
                    approval,
                    decline,
                    additionalProperties.toImmutable(),
                )
        }

        /**
         * If your application approves the provisioning attempt, this contains metadata about the
         * digital wallet token that will be generated.
         */
        @NoAutoDetect
        class Approval
        @JsonCreator
        private constructor(
            @JsonProperty("email") private val email: String?,
            @JsonProperty("phone") private val phone: String?,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** An email address that can be used to verify the cardholder via one-time passcode. */
            @JsonProperty("email") fun email(): Optional<String> = Optional.ofNullable(email)

            /**
             * A phone number that can be used to verify the cardholder via one-time passcode over
             * SMS.
             */
            @JsonProperty("phone") fun phone(): Optional<String> = Optional.ofNullable(phone)

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var email: String? = null
                private var phone: String? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(approval: Approval) = apply {
                    email = approval.email
                    phone = approval.phone
                    additionalProperties = approval.additionalProperties.toMutableMap()
                }

                /**
                 * An email address that can be used to verify the cardholder via one-time passcode.
                 */
                fun email(email: String) = apply { this.email = email }

                /**
                 * A phone number that can be used to verify the cardholder via one-time passcode
                 * over SMS.
                 */
                fun phone(phone: String) = apply { this.phone = phone }

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

                fun build(): Approval =
                    Approval(
                        email,
                        phone,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Approval && email == other.email && phone == other.phone && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(email, phone, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Approval{email=$email, phone=$phone, additionalProperties=$additionalProperties}"
        }

        /**
         * If your application declines the provisioning attempt, this contains details about the
         * decline.
         */
        @NoAutoDetect
        class Decline
        @JsonCreator
        private constructor(
            @JsonProperty("reason") private val reason: String?,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /**
             * Why the tokenization attempt was declined. This is for logging purposes only and is
             * not displayed to the end-user.
             */
            @JsonProperty("reason") fun reason(): Optional<String> = Optional.ofNullable(reason)

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var reason: String? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(decline: Decline) = apply {
                    reason = decline.reason
                    additionalProperties = decline.additionalProperties.toMutableMap()
                }

                /**
                 * Why the tokenization attempt was declined. This is for logging purposes only and
                 * is not displayed to the end-user.
                 */
                fun reason(reason: String) = apply { this.reason = reason }

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

                fun build(): Decline = Decline(reason, additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Decline && reason == other.reason && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(reason, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Decline{reason=$reason, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is DigitalWalletToken && approval == other.approval && decline == other.decline && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(approval, decline, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DigitalWalletToken{approval=$approval, decline=$decline, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is RealTimeDecisionActionParams && realTimeDecisionId == other.realTimeDecisionId && cardAuthentication == other.cardAuthentication && cardAuthenticationChallenge == other.cardAuthenticationChallenge && cardAuthorization == other.cardAuthorization && digitalWalletAuthentication == other.digitalWalletAuthentication && digitalWalletToken == other.digitalWalletToken && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(realTimeDecisionId, cardAuthentication, cardAuthenticationChallenge, cardAuthorization, digitalWalletAuthentication, digitalWalletToken, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "RealTimeDecisionActionParams{realTimeDecisionId=$realTimeDecisionId, cardAuthentication=$cardAuthentication, cardAuthenticationChallenge=$cardAuthenticationChallenge, cardAuthorization=$cardAuthorization, digitalWalletAuthentication=$digitalWalletAuthentication, digitalWalletToken=$digitalWalletToken, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
