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
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.core.immutableEmptyMap
import com.increase.api.core.toImmutable
import com.increase.api.errors.IncreaseInvalidDataException
import java.util.Objects
import java.util.Optional

/** Action a Real-Time Decision */
class RealTimeDecisionActionParams
constructor(
    private val realTimeDecisionId: String,
    private val body: RealTimeDecisionActionBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    /** The identifier of the Real-Time Decision. */
    fun realTimeDecisionId(): String = realTimeDecisionId

    /**
     * If the Real-Time Decision relates to a 3DS card authentication attempt, this object contains
     * your response to the authentication.
     */
    fun cardAuthentication(): Optional<CardAuthentication> = body.cardAuthentication()

    /**
     * If the Real-Time Decision relates to 3DS card authentication challenge delivery, this object
     * contains your response.
     */
    fun cardAuthenticationChallenge(): Optional<CardAuthenticationChallenge> =
        body.cardAuthenticationChallenge()

    /**
     * If the Real-Time Decision relates to a card authorization attempt, this object contains your
     * response to the authorization.
     */
    fun cardAuthorization(): Optional<CardAuthorization> = body.cardAuthorization()

    /**
     * If the Real-Time Decision relates to a digital wallet authentication attempt, this object
     * contains your response to the authentication.
     */
    fun digitalWalletAuthentication(): Optional<DigitalWalletAuthentication> =
        body.digitalWalletAuthentication()

    /**
     * If the Real-Time Decision relates to a digital wallet token provisioning attempt, this object
     * contains your response to the attempt.
     */
    fun digitalWalletToken(): Optional<DigitalWalletToken> = body.digitalWalletToken()

    /**
     * If the Real-Time Decision relates to a 3DS card authentication attempt, this object contains
     * your response to the authentication.
     */
    fun _cardAuthentication(): JsonField<CardAuthentication> = body._cardAuthentication()

    /**
     * If the Real-Time Decision relates to 3DS card authentication challenge delivery, this object
     * contains your response.
     */
    fun _cardAuthenticationChallenge(): JsonField<CardAuthenticationChallenge> =
        body._cardAuthenticationChallenge()

    /**
     * If the Real-Time Decision relates to a card authorization attempt, this object contains your
     * response to the authorization.
     */
    fun _cardAuthorization(): JsonField<CardAuthorization> = body._cardAuthorization()

    /**
     * If the Real-Time Decision relates to a digital wallet authentication attempt, this object
     * contains your response to the authentication.
     */
    fun _digitalWalletAuthentication(): JsonField<DigitalWalletAuthentication> =
        body._digitalWalletAuthentication()

    /**
     * If the Real-Time Decision relates to a digital wallet token provisioning attempt, this object
     * contains your response to the attempt.
     */
    fun _digitalWalletToken(): JsonField<DigitalWalletToken> = body._digitalWalletToken()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun getBody(): RealTimeDecisionActionBody = body

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
        @JsonProperty("card_authentication")
        @ExcludeMissing
        private val cardAuthentication: JsonField<CardAuthentication> = JsonMissing.of(),
        @JsonProperty("card_authentication_challenge")
        @ExcludeMissing
        private val cardAuthenticationChallenge: JsonField<CardAuthenticationChallenge> =
            JsonMissing.of(),
        @JsonProperty("card_authorization")
        @ExcludeMissing
        private val cardAuthorization: JsonField<CardAuthorization> = JsonMissing.of(),
        @JsonProperty("digital_wallet_authentication")
        @ExcludeMissing
        private val digitalWalletAuthentication: JsonField<DigitalWalletAuthentication> =
            JsonMissing.of(),
        @JsonProperty("digital_wallet_token")
        @ExcludeMissing
        private val digitalWalletToken: JsonField<DigitalWalletToken> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * If the Real-Time Decision relates to a 3DS card authentication attempt, this object
         * contains your response to the authentication.
         */
        fun cardAuthentication(): Optional<CardAuthentication> =
            Optional.ofNullable(cardAuthentication.getNullable("card_authentication"))

        /**
         * If the Real-Time Decision relates to 3DS card authentication challenge delivery, this
         * object contains your response.
         */
        fun cardAuthenticationChallenge(): Optional<CardAuthenticationChallenge> =
            Optional.ofNullable(
                cardAuthenticationChallenge.getNullable("card_authentication_challenge")
            )

        /**
         * If the Real-Time Decision relates to a card authorization attempt, this object contains
         * your response to the authorization.
         */
        fun cardAuthorization(): Optional<CardAuthorization> =
            Optional.ofNullable(cardAuthorization.getNullable("card_authorization"))

        /**
         * If the Real-Time Decision relates to a digital wallet authentication attempt, this object
         * contains your response to the authentication.
         */
        fun digitalWalletAuthentication(): Optional<DigitalWalletAuthentication> =
            Optional.ofNullable(
                digitalWalletAuthentication.getNullable("digital_wallet_authentication")
            )

        /**
         * If the Real-Time Decision relates to a digital wallet token provisioning attempt, this
         * object contains your response to the attempt.
         */
        fun digitalWalletToken(): Optional<DigitalWalletToken> =
            Optional.ofNullable(digitalWalletToken.getNullable("digital_wallet_token"))

        /**
         * If the Real-Time Decision relates to a 3DS card authentication attempt, this object
         * contains your response to the authentication.
         */
        @JsonProperty("card_authentication")
        @ExcludeMissing
        fun _cardAuthentication(): JsonField<CardAuthentication> = cardAuthentication

        /**
         * If the Real-Time Decision relates to 3DS card authentication challenge delivery, this
         * object contains your response.
         */
        @JsonProperty("card_authentication_challenge")
        @ExcludeMissing
        fun _cardAuthenticationChallenge(): JsonField<CardAuthenticationChallenge> =
            cardAuthenticationChallenge

        /**
         * If the Real-Time Decision relates to a card authorization attempt, this object contains
         * your response to the authorization.
         */
        @JsonProperty("card_authorization")
        @ExcludeMissing
        fun _cardAuthorization(): JsonField<CardAuthorization> = cardAuthorization

        /**
         * If the Real-Time Decision relates to a digital wallet authentication attempt, this object
         * contains your response to the authentication.
         */
        @JsonProperty("digital_wallet_authentication")
        @ExcludeMissing
        fun _digitalWalletAuthentication(): JsonField<DigitalWalletAuthentication> =
            digitalWalletAuthentication

        /**
         * If the Real-Time Decision relates to a digital wallet token provisioning attempt, this
         * object contains your response to the attempt.
         */
        @JsonProperty("digital_wallet_token")
        @ExcludeMissing
        fun _digitalWalletToken(): JsonField<DigitalWalletToken> = digitalWalletToken

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): RealTimeDecisionActionBody = apply {
            if (validated) {
                return@apply
            }

            cardAuthentication().ifPresent { it.validate() }
            cardAuthenticationChallenge().ifPresent { it.validate() }
            cardAuthorization().ifPresent { it.validate() }
            digitalWalletAuthentication().ifPresent { it.validate() }
            digitalWalletToken().ifPresent { it.validate() }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var cardAuthentication: JsonField<CardAuthentication> = JsonMissing.of()
            private var cardAuthenticationChallenge: JsonField<CardAuthenticationChallenge> =
                JsonMissing.of()
            private var cardAuthorization: JsonField<CardAuthorization> = JsonMissing.of()
            private var digitalWalletAuthentication: JsonField<DigitalWalletAuthentication> =
                JsonMissing.of()
            private var digitalWalletToken: JsonField<DigitalWalletToken> = JsonMissing.of()
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
            fun cardAuthentication(cardAuthentication: CardAuthentication) =
                cardAuthentication(JsonField.of(cardAuthentication))

            /**
             * If the Real-Time Decision relates to a 3DS card authentication attempt, this object
             * contains your response to the authentication.
             */
            fun cardAuthentication(cardAuthentication: JsonField<CardAuthentication>) = apply {
                this.cardAuthentication = cardAuthentication
            }

            /**
             * If the Real-Time Decision relates to 3DS card authentication challenge delivery, this
             * object contains your response.
             */
            fun cardAuthenticationChallenge(
                cardAuthenticationChallenge: CardAuthenticationChallenge
            ) = cardAuthenticationChallenge(JsonField.of(cardAuthenticationChallenge))

            /**
             * If the Real-Time Decision relates to 3DS card authentication challenge delivery, this
             * object contains your response.
             */
            fun cardAuthenticationChallenge(
                cardAuthenticationChallenge: JsonField<CardAuthenticationChallenge>
            ) = apply { this.cardAuthenticationChallenge = cardAuthenticationChallenge }

            /**
             * If the Real-Time Decision relates to a card authorization attempt, this object
             * contains your response to the authorization.
             */
            fun cardAuthorization(cardAuthorization: CardAuthorization) =
                cardAuthorization(JsonField.of(cardAuthorization))

            /**
             * If the Real-Time Decision relates to a card authorization attempt, this object
             * contains your response to the authorization.
             */
            fun cardAuthorization(cardAuthorization: JsonField<CardAuthorization>) = apply {
                this.cardAuthorization = cardAuthorization
            }

            /**
             * If the Real-Time Decision relates to a digital wallet authentication attempt, this
             * object contains your response to the authentication.
             */
            fun digitalWalletAuthentication(
                digitalWalletAuthentication: DigitalWalletAuthentication
            ) = digitalWalletAuthentication(JsonField.of(digitalWalletAuthentication))

            /**
             * If the Real-Time Decision relates to a digital wallet authentication attempt, this
             * object contains your response to the authentication.
             */
            fun digitalWalletAuthentication(
                digitalWalletAuthentication: JsonField<DigitalWalletAuthentication>
            ) = apply { this.digitalWalletAuthentication = digitalWalletAuthentication }

            /**
             * If the Real-Time Decision relates to a digital wallet token provisioning attempt,
             * this object contains your response to the attempt.
             */
            fun digitalWalletToken(digitalWalletToken: DigitalWalletToken) =
                digitalWalletToken(JsonField.of(digitalWalletToken))

            /**
             * If the Real-Time Decision relates to a digital wallet token provisioning attempt,
             * this object contains your response to the attempt.
             */
            fun digitalWalletToken(digitalWalletToken: JsonField<DigitalWalletToken>) = apply {
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
        private var body: RealTimeDecisionActionBody.Builder = RealTimeDecisionActionBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(realTimeDecisionActionParams: RealTimeDecisionActionParams) = apply {
            realTimeDecisionId = realTimeDecisionActionParams.realTimeDecisionId
            body = realTimeDecisionActionParams.body.toBuilder()
            additionalHeaders = realTimeDecisionActionParams.additionalHeaders.toBuilder()
            additionalQueryParams = realTimeDecisionActionParams.additionalQueryParams.toBuilder()
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
            body.cardAuthentication(cardAuthentication)
        }

        /**
         * If the Real-Time Decision relates to a 3DS card authentication attempt, this object
         * contains your response to the authentication.
         */
        fun cardAuthentication(cardAuthentication: JsonField<CardAuthentication>) = apply {
            body.cardAuthentication(cardAuthentication)
        }

        /**
         * If the Real-Time Decision relates to 3DS card authentication challenge delivery, this
         * object contains your response.
         */
        fun cardAuthenticationChallenge(cardAuthenticationChallenge: CardAuthenticationChallenge) =
            apply {
                body.cardAuthenticationChallenge(cardAuthenticationChallenge)
            }

        /**
         * If the Real-Time Decision relates to 3DS card authentication challenge delivery, this
         * object contains your response.
         */
        fun cardAuthenticationChallenge(
            cardAuthenticationChallenge: JsonField<CardAuthenticationChallenge>
        ) = apply { body.cardAuthenticationChallenge(cardAuthenticationChallenge) }

        /**
         * If the Real-Time Decision relates to a card authorization attempt, this object contains
         * your response to the authorization.
         */
        fun cardAuthorization(cardAuthorization: CardAuthorization) = apply {
            body.cardAuthorization(cardAuthorization)
        }

        /**
         * If the Real-Time Decision relates to a card authorization attempt, this object contains
         * your response to the authorization.
         */
        fun cardAuthorization(cardAuthorization: JsonField<CardAuthorization>) = apply {
            body.cardAuthorization(cardAuthorization)
        }

        /**
         * If the Real-Time Decision relates to a digital wallet authentication attempt, this object
         * contains your response to the authentication.
         */
        fun digitalWalletAuthentication(digitalWalletAuthentication: DigitalWalletAuthentication) =
            apply {
                body.digitalWalletAuthentication(digitalWalletAuthentication)
            }

        /**
         * If the Real-Time Decision relates to a digital wallet authentication attempt, this object
         * contains your response to the authentication.
         */
        fun digitalWalletAuthentication(
            digitalWalletAuthentication: JsonField<DigitalWalletAuthentication>
        ) = apply { body.digitalWalletAuthentication(digitalWalletAuthentication) }

        /**
         * If the Real-Time Decision relates to a digital wallet token provisioning attempt, this
         * object contains your response to the attempt.
         */
        fun digitalWalletToken(digitalWalletToken: DigitalWalletToken) = apply {
            body.digitalWalletToken(digitalWalletToken)
        }

        /**
         * If the Real-Time Decision relates to a digital wallet token provisioning attempt, this
         * object contains your response to the attempt.
         */
        fun digitalWalletToken(digitalWalletToken: JsonField<DigitalWalletToken>) = apply {
            body.digitalWalletToken(digitalWalletToken)
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

        fun build(): RealTimeDecisionActionParams =
            RealTimeDecisionActionParams(
                checkRequired("realTimeDecisionId", realTimeDecisionId),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
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
        @JsonProperty("decision")
        @ExcludeMissing
        private val decision: JsonField<Decision> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Whether the card authentication attempt should be approved or declined. */
        fun decision(): Decision = decision.getRequired("decision")

        /** Whether the card authentication attempt should be approved or declined. */
        @JsonProperty("decision") @ExcludeMissing fun _decision(): JsonField<Decision> = decision

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): CardAuthentication = apply {
            if (validated) {
                return@apply
            }

            decision()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var decision: JsonField<Decision>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(cardAuthentication: CardAuthentication) = apply {
                decision = cardAuthentication.decision
                additionalProperties = cardAuthentication.additionalProperties.toMutableMap()
            }

            /** Whether the card authentication attempt should be approved or declined. */
            fun decision(decision: Decision) = decision(JsonField.of(decision))

            /** Whether the card authentication attempt should be approved or declined. */
            fun decision(decision: JsonField<Decision>) = apply { this.decision = decision }

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
                    checkRequired("decision", decision),
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
        @JsonProperty("result")
        @ExcludeMissing
        private val result: JsonField<Result> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * Whether the card authentication challenge was successfully delivered to the cardholder.
         */
        fun result(): Result = result.getRequired("result")

        /**
         * Whether the card authentication challenge was successfully delivered to the cardholder.
         */
        @JsonProperty("result") @ExcludeMissing fun _result(): JsonField<Result> = result

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): CardAuthenticationChallenge = apply {
            if (validated) {
                return@apply
            }

            result()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var result: JsonField<Result>? = null
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
            fun result(result: Result) = result(JsonField.of(result))

            /**
             * Whether the card authentication challenge was successfully delivered to the
             * cardholder.
             */
            fun result(result: JsonField<Result>) = apply { this.result = result }

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
                    checkRequired("result", result),
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
        @JsonProperty("decision")
        @ExcludeMissing
        private val decision: JsonField<Decision> = JsonMissing.of(),
        @JsonProperty("decline_reason")
        @ExcludeMissing
        private val declineReason: JsonField<DeclineReason> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Whether the card authorization should be approved or declined. */
        fun decision(): Decision = decision.getRequired("decision")

        /**
         * The reason the card authorization was declined. This translates to a specific decline
         * code that is sent to the card network.
         */
        fun declineReason(): Optional<DeclineReason> =
            Optional.ofNullable(declineReason.getNullable("decline_reason"))

        /** Whether the card authorization should be approved or declined. */
        @JsonProperty("decision") @ExcludeMissing fun _decision(): JsonField<Decision> = decision

        /**
         * The reason the card authorization was declined. This translates to a specific decline
         * code that is sent to the card network.
         */
        @JsonProperty("decline_reason")
        @ExcludeMissing
        fun _declineReason(): JsonField<DeclineReason> = declineReason

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): CardAuthorization = apply {
            if (validated) {
                return@apply
            }

            decision()
            declineReason()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var decision: JsonField<Decision>? = null
            private var declineReason: JsonField<DeclineReason> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(cardAuthorization: CardAuthorization) = apply {
                decision = cardAuthorization.decision
                declineReason = cardAuthorization.declineReason
                additionalProperties = cardAuthorization.additionalProperties.toMutableMap()
            }

            /** Whether the card authorization should be approved or declined. */
            fun decision(decision: Decision) = decision(JsonField.of(decision))

            /** Whether the card authorization should be approved or declined. */
            fun decision(decision: JsonField<Decision>) = apply { this.decision = decision }

            /**
             * The reason the card authorization was declined. This translates to a specific decline
             * code that is sent to the card network.
             */
            fun declineReason(declineReason: DeclineReason) =
                declineReason(JsonField.of(declineReason))

            /**
             * The reason the card authorization was declined. This translates to a specific decline
             * code that is sent to the card network.
             */
            fun declineReason(declineReason: JsonField<DeclineReason>) = apply {
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
                    checkRequired("decision", decision),
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
        @JsonProperty("result")
        @ExcludeMissing
        private val result: JsonField<Result> = JsonMissing.of(),
        @JsonProperty("success")
        @ExcludeMissing
        private val success: JsonField<Success> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Whether your application was able to deliver the one-time passcode. */
        fun result(): Result = result.getRequired("result")

        fun success(): Optional<Success> = Optional.ofNullable(success.getNullable("success"))

        /** Whether your application was able to deliver the one-time passcode. */
        @JsonProperty("result") @ExcludeMissing fun _result(): JsonField<Result> = result

        @JsonProperty("success") @ExcludeMissing fun _success(): JsonField<Success> = success

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): DigitalWalletAuthentication = apply {
            if (validated) {
                return@apply
            }

            result()
            success().ifPresent { it.validate() }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var result: JsonField<Result>? = null
            private var success: JsonField<Success> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(digitalWalletAuthentication: DigitalWalletAuthentication) = apply {
                result = digitalWalletAuthentication.result
                success = digitalWalletAuthentication.success
                additionalProperties =
                    digitalWalletAuthentication.additionalProperties.toMutableMap()
            }

            /** Whether your application was able to deliver the one-time passcode. */
            fun result(result: Result) = result(JsonField.of(result))

            /** Whether your application was able to deliver the one-time passcode. */
            fun result(result: JsonField<Result>) = apply { this.result = result }

            fun success(success: Success) = success(JsonField.of(success))

            fun success(success: JsonField<Success>) = apply { this.success = success }

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
                    checkRequired("result", result),
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
            @JsonProperty("email")
            @ExcludeMissing
            private val email: JsonField<String> = JsonMissing.of(),
            @JsonProperty("phone")
            @ExcludeMissing
            private val phone: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The email address that was used to verify the cardholder via one-time passcode. */
            fun email(): Optional<String> = Optional.ofNullable(email.getNullable("email"))

            /**
             * The phone number that was used to verify the cardholder via one-time passcode over
             * SMS.
             */
            fun phone(): Optional<String> = Optional.ofNullable(phone.getNullable("phone"))

            /** The email address that was used to verify the cardholder via one-time passcode. */
            @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

            /**
             * The phone number that was used to verify the cardholder via one-time passcode over
             * SMS.
             */
            @JsonProperty("phone") @ExcludeMissing fun _phone(): JsonField<String> = phone

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Success = apply {
                if (validated) {
                    return@apply
                }

                email()
                phone()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var email: JsonField<String> = JsonMissing.of()
                private var phone: JsonField<String> = JsonMissing.of()
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
                fun email(email: String) = email(JsonField.of(email))

                /**
                 * The email address that was used to verify the cardholder via one-time passcode.
                 */
                fun email(email: JsonField<String>) = apply { this.email = email }

                /**
                 * The phone number that was used to verify the cardholder via one-time passcode
                 * over SMS.
                 */
                fun phone(phone: String) = phone(JsonField.of(phone))

                /**
                 * The phone number that was used to verify the cardholder via one-time passcode
                 * over SMS.
                 */
                fun phone(phone: JsonField<String>) = apply { this.phone = phone }

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
        @JsonProperty("approval")
        @ExcludeMissing
        private val approval: JsonField<Approval> = JsonMissing.of(),
        @JsonProperty("decline")
        @ExcludeMissing
        private val decline: JsonField<Decline> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * If your application approves the provisioning attempt, this contains metadata about the
         * digital wallet token that will be generated.
         */
        fun approval(): Optional<Approval> = Optional.ofNullable(approval.getNullable("approval"))

        /**
         * If your application declines the provisioning attempt, this contains details about the
         * decline.
         */
        fun decline(): Optional<Decline> = Optional.ofNullable(decline.getNullable("decline"))

        /**
         * If your application approves the provisioning attempt, this contains metadata about the
         * digital wallet token that will be generated.
         */
        @JsonProperty("approval") @ExcludeMissing fun _approval(): JsonField<Approval> = approval

        /**
         * If your application declines the provisioning attempt, this contains details about the
         * decline.
         */
        @JsonProperty("decline") @ExcludeMissing fun _decline(): JsonField<Decline> = decline

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): DigitalWalletToken = apply {
            if (validated) {
                return@apply
            }

            approval().ifPresent { it.validate() }
            decline().ifPresent { it.validate() }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var approval: JsonField<Approval> = JsonMissing.of()
            private var decline: JsonField<Decline> = JsonMissing.of()
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
            fun approval(approval: Approval) = approval(JsonField.of(approval))

            /**
             * If your application approves the provisioning attempt, this contains metadata about
             * the digital wallet token that will be generated.
             */
            fun approval(approval: JsonField<Approval>) = apply { this.approval = approval }

            /**
             * If your application declines the provisioning attempt, this contains details about
             * the decline.
             */
            fun decline(decline: Decline) = decline(JsonField.of(decline))

            /**
             * If your application declines the provisioning attempt, this contains details about
             * the decline.
             */
            fun decline(decline: JsonField<Decline>) = apply { this.decline = decline }

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
            @JsonProperty("email")
            @ExcludeMissing
            private val email: JsonField<String> = JsonMissing.of(),
            @JsonProperty("phone")
            @ExcludeMissing
            private val phone: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** An email address that can be used to verify the cardholder via one-time passcode. */
            fun email(): Optional<String> = Optional.ofNullable(email.getNullable("email"))

            /**
             * A phone number that can be used to verify the cardholder via one-time passcode over
             * SMS.
             */
            fun phone(): Optional<String> = Optional.ofNullable(phone.getNullable("phone"))

            /** An email address that can be used to verify the cardholder via one-time passcode. */
            @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

            /**
             * A phone number that can be used to verify the cardholder via one-time passcode over
             * SMS.
             */
            @JsonProperty("phone") @ExcludeMissing fun _phone(): JsonField<String> = phone

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Approval = apply {
                if (validated) {
                    return@apply
                }

                email()
                phone()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var email: JsonField<String> = JsonMissing.of()
                private var phone: JsonField<String> = JsonMissing.of()
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
                fun email(email: String) = email(JsonField.of(email))

                /**
                 * An email address that can be used to verify the cardholder via one-time passcode.
                 */
                fun email(email: JsonField<String>) = apply { this.email = email }

                /**
                 * A phone number that can be used to verify the cardholder via one-time passcode
                 * over SMS.
                 */
                fun phone(phone: String) = phone(JsonField.of(phone))

                /**
                 * A phone number that can be used to verify the cardholder via one-time passcode
                 * over SMS.
                 */
                fun phone(phone: JsonField<String>) = apply { this.phone = phone }

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
            @JsonProperty("reason")
            @ExcludeMissing
            private val reason: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /**
             * Why the tokenization attempt was declined. This is for logging purposes only and is
             * not displayed to the end-user.
             */
            fun reason(): Optional<String> = Optional.ofNullable(reason.getNullable("reason"))

            /**
             * Why the tokenization attempt was declined. This is for logging purposes only and is
             * not displayed to the end-user.
             */
            @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Decline = apply {
                if (validated) {
                    return@apply
                }

                reason()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var reason: JsonField<String> = JsonMissing.of()
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
                fun reason(reason: String) = reason(JsonField.of(reason))

                /**
                 * Why the tokenization attempt was declined. This is for logging purposes only and
                 * is not displayed to the end-user.
                 */
                fun reason(reason: JsonField<String>) = apply { this.reason = reason }

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

        return /* spotless:off */ other is RealTimeDecisionActionParams && realTimeDecisionId == other.realTimeDecisionId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(realTimeDecisionId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "RealTimeDecisionActionParams{realTimeDecisionId=$realTimeDecisionId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
