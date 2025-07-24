// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.realtimedecisions

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.increase.api.core.Enum
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.Params
import com.increase.api.core.checkRequired
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.errors.IncreaseInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Action a Real-Time Decision */
class RealTimeDecisionActionParams
private constructor(
    private val realTimeDecisionId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** The identifier of the Real-Time Decision. */
    fun realTimeDecisionId(): Optional<String> = Optional.ofNullable(realTimeDecisionId)

    /**
     * If the Real-Time Decision relates to a 3DS card authentication attempt, this object contains
     * your response to the authentication.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cardAuthentication(): Optional<CardAuthentication> = body.cardAuthentication()

    /**
     * If the Real-Time Decision relates to 3DS card authentication challenge delivery, this object
     * contains your response.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cardAuthenticationChallenge(): Optional<CardAuthenticationChallenge> =
        body.cardAuthenticationChallenge()

    /**
     * If the Real-Time Decision relates to a card authorization attempt, this object contains your
     * response to the authorization.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cardAuthorization(): Optional<CardAuthorization> = body.cardAuthorization()

    /**
     * If the Real-Time Decision relates to a digital wallet authentication attempt, this object
     * contains your response to the authentication.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun digitalWalletAuthentication(): Optional<DigitalWalletAuthentication> =
        body.digitalWalletAuthentication()

    /**
     * If the Real-Time Decision relates to a digital wallet token provisioning attempt, this object
     * contains your response to the attempt.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun digitalWalletToken(): Optional<DigitalWalletToken> = body.digitalWalletToken()

    /**
     * Returns the raw JSON value of [cardAuthentication].
     *
     * Unlike [cardAuthentication], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _cardAuthentication(): JsonField<CardAuthentication> = body._cardAuthentication()

    /**
     * Returns the raw JSON value of [cardAuthenticationChallenge].
     *
     * Unlike [cardAuthenticationChallenge], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _cardAuthenticationChallenge(): JsonField<CardAuthenticationChallenge> =
        body._cardAuthenticationChallenge()

    /**
     * Returns the raw JSON value of [cardAuthorization].
     *
     * Unlike [cardAuthorization], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _cardAuthorization(): JsonField<CardAuthorization> = body._cardAuthorization()

    /**
     * Returns the raw JSON value of [digitalWalletAuthentication].
     *
     * Unlike [digitalWalletAuthentication], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _digitalWalletAuthentication(): JsonField<DigitalWalletAuthentication> =
        body._digitalWalletAuthentication()

    /**
     * Returns the raw JSON value of [digitalWalletToken].
     *
     * Unlike [digitalWalletToken], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _digitalWalletToken(): JsonField<DigitalWalletToken> = body._digitalWalletToken()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): RealTimeDecisionActionParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of [RealTimeDecisionActionParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RealTimeDecisionActionParams]. */
    class Builder internal constructor() {

        private var realTimeDecisionId: String? = null
        private var body: Body.Builder = Body.builder()
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
        fun realTimeDecisionId(realTimeDecisionId: String?) = apply {
            this.realTimeDecisionId = realTimeDecisionId
        }

        /**
         * Alias for calling [Builder.realTimeDecisionId] with `realTimeDecisionId.orElse(null)`.
         */
        fun realTimeDecisionId(realTimeDecisionId: Optional<String>) =
            realTimeDecisionId(realTimeDecisionId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [cardAuthentication]
         * - [cardAuthenticationChallenge]
         * - [cardAuthorization]
         * - [digitalWalletAuthentication]
         * - [digitalWalletToken]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * If the Real-Time Decision relates to a 3DS card authentication attempt, this object
         * contains your response to the authentication.
         */
        fun cardAuthentication(cardAuthentication: CardAuthentication) = apply {
            body.cardAuthentication(cardAuthentication)
        }

        /**
         * Sets [Builder.cardAuthentication] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cardAuthentication] with a well-typed
         * [CardAuthentication] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
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
         * Sets [Builder.cardAuthenticationChallenge] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cardAuthenticationChallenge] with a well-typed
         * [CardAuthenticationChallenge] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
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
         * Sets [Builder.cardAuthorization] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cardAuthorization] with a well-typed [CardAuthorization]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
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
         * Sets [Builder.digitalWalletAuthentication] to an arbitrary JSON value.
         *
         * You should usually call [Builder.digitalWalletAuthentication] with a well-typed
         * [DigitalWalletAuthentication] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
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
         * Sets [Builder.digitalWalletToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.digitalWalletToken] with a well-typed
         * [DigitalWalletToken] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
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

        /**
         * Returns an immutable instance of [RealTimeDecisionActionParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): RealTimeDecisionActionParams =
            RealTimeDecisionActionParams(
                realTimeDecisionId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> realTimeDecisionId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val cardAuthentication: JsonField<CardAuthentication>,
        private val cardAuthenticationChallenge: JsonField<CardAuthenticationChallenge>,
        private val cardAuthorization: JsonField<CardAuthorization>,
        private val digitalWalletAuthentication: JsonField<DigitalWalletAuthentication>,
        private val digitalWalletToken: JsonField<DigitalWalletToken>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("card_authentication")
            @ExcludeMissing
            cardAuthentication: JsonField<CardAuthentication> = JsonMissing.of(),
            @JsonProperty("card_authentication_challenge")
            @ExcludeMissing
            cardAuthenticationChallenge: JsonField<CardAuthenticationChallenge> = JsonMissing.of(),
            @JsonProperty("card_authorization")
            @ExcludeMissing
            cardAuthorization: JsonField<CardAuthorization> = JsonMissing.of(),
            @JsonProperty("digital_wallet_authentication")
            @ExcludeMissing
            digitalWalletAuthentication: JsonField<DigitalWalletAuthentication> = JsonMissing.of(),
            @JsonProperty("digital_wallet_token")
            @ExcludeMissing
            digitalWalletToken: JsonField<DigitalWalletToken> = JsonMissing.of(),
        ) : this(
            cardAuthentication,
            cardAuthenticationChallenge,
            cardAuthorization,
            digitalWalletAuthentication,
            digitalWalletToken,
            mutableMapOf(),
        )

        /**
         * If the Real-Time Decision relates to a 3DS card authentication attempt, this object
         * contains your response to the authentication.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun cardAuthentication(): Optional<CardAuthentication> =
            cardAuthentication.getOptional("card_authentication")

        /**
         * If the Real-Time Decision relates to 3DS card authentication challenge delivery, this
         * object contains your response.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun cardAuthenticationChallenge(): Optional<CardAuthenticationChallenge> =
            cardAuthenticationChallenge.getOptional("card_authentication_challenge")

        /**
         * If the Real-Time Decision relates to a card authorization attempt, this object contains
         * your response to the authorization.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun cardAuthorization(): Optional<CardAuthorization> =
            cardAuthorization.getOptional("card_authorization")

        /**
         * If the Real-Time Decision relates to a digital wallet authentication attempt, this object
         * contains your response to the authentication.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun digitalWalletAuthentication(): Optional<DigitalWalletAuthentication> =
            digitalWalletAuthentication.getOptional("digital_wallet_authentication")

        /**
         * If the Real-Time Decision relates to a digital wallet token provisioning attempt, this
         * object contains your response to the attempt.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun digitalWalletToken(): Optional<DigitalWalletToken> =
            digitalWalletToken.getOptional("digital_wallet_token")

        /**
         * Returns the raw JSON value of [cardAuthentication].
         *
         * Unlike [cardAuthentication], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("card_authentication")
        @ExcludeMissing
        fun _cardAuthentication(): JsonField<CardAuthentication> = cardAuthentication

        /**
         * Returns the raw JSON value of [cardAuthenticationChallenge].
         *
         * Unlike [cardAuthenticationChallenge], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("card_authentication_challenge")
        @ExcludeMissing
        fun _cardAuthenticationChallenge(): JsonField<CardAuthenticationChallenge> =
            cardAuthenticationChallenge

        /**
         * Returns the raw JSON value of [cardAuthorization].
         *
         * Unlike [cardAuthorization], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("card_authorization")
        @ExcludeMissing
        fun _cardAuthorization(): JsonField<CardAuthorization> = cardAuthorization

        /**
         * Returns the raw JSON value of [digitalWalletAuthentication].
         *
         * Unlike [digitalWalletAuthentication], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("digital_wallet_authentication")
        @ExcludeMissing
        fun _digitalWalletAuthentication(): JsonField<DigitalWalletAuthentication> =
            digitalWalletAuthentication

        /**
         * Returns the raw JSON value of [digitalWalletToken].
         *
         * Unlike [digitalWalletToken], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("digital_wallet_token")
        @ExcludeMissing
        fun _digitalWalletToken(): JsonField<DigitalWalletToken> = digitalWalletToken

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var cardAuthentication: JsonField<CardAuthentication> = JsonMissing.of()
            private var cardAuthenticationChallenge: JsonField<CardAuthenticationChallenge> =
                JsonMissing.of()
            private var cardAuthorization: JsonField<CardAuthorization> = JsonMissing.of()
            private var digitalWalletAuthentication: JsonField<DigitalWalletAuthentication> =
                JsonMissing.of()
            private var digitalWalletToken: JsonField<DigitalWalletToken> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                cardAuthentication = body.cardAuthentication
                cardAuthenticationChallenge = body.cardAuthenticationChallenge
                cardAuthorization = body.cardAuthorization
                digitalWalletAuthentication = body.digitalWalletAuthentication
                digitalWalletToken = body.digitalWalletToken
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * If the Real-Time Decision relates to a 3DS card authentication attempt, this object
             * contains your response to the authentication.
             */
            fun cardAuthentication(cardAuthentication: CardAuthentication) =
                cardAuthentication(JsonField.of(cardAuthentication))

            /**
             * Sets [Builder.cardAuthentication] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cardAuthentication] with a well-typed
             * [CardAuthentication] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
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
             * Sets [Builder.cardAuthenticationChallenge] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cardAuthenticationChallenge] with a well-typed
             * [CardAuthenticationChallenge] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
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
             * Sets [Builder.cardAuthorization] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cardAuthorization] with a well-typed
             * [CardAuthorization] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
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
             * Sets [Builder.digitalWalletAuthentication] to an arbitrary JSON value.
             *
             * You should usually call [Builder.digitalWalletAuthentication] with a well-typed
             * [DigitalWalletAuthentication] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
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
             * Sets [Builder.digitalWalletToken] to an arbitrary JSON value.
             *
             * You should usually call [Builder.digitalWalletToken] with a well-typed
             * [DigitalWalletToken] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
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

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body =
                Body(
                    cardAuthentication,
                    cardAuthenticationChallenge,
                    cardAuthorization,
                    digitalWalletAuthentication,
                    digitalWalletToken,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
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

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: IncreaseInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (cardAuthentication.asKnown().getOrNull()?.validity() ?: 0) +
                (cardAuthenticationChallenge.asKnown().getOrNull()?.validity() ?: 0) +
                (cardAuthorization.asKnown().getOrNull()?.validity() ?: 0) +
                (digitalWalletAuthentication.asKnown().getOrNull()?.validity() ?: 0) +
                (digitalWalletToken.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && cardAuthentication == other.cardAuthentication && cardAuthenticationChallenge == other.cardAuthenticationChallenge && cardAuthorization == other.cardAuthorization && digitalWalletAuthentication == other.digitalWalletAuthentication && digitalWalletToken == other.digitalWalletToken && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(cardAuthentication, cardAuthenticationChallenge, cardAuthorization, digitalWalletAuthentication, digitalWalletToken, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{cardAuthentication=$cardAuthentication, cardAuthenticationChallenge=$cardAuthenticationChallenge, cardAuthorization=$cardAuthorization, digitalWalletAuthentication=$digitalWalletAuthentication, digitalWalletToken=$digitalWalletToken, additionalProperties=$additionalProperties}"
    }

    /**
     * If the Real-Time Decision relates to a 3DS card authentication attempt, this object contains
     * your response to the authentication.
     */
    class CardAuthentication
    private constructor(
        private val decision: JsonField<Decision>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("decision")
            @ExcludeMissing
            decision: JsonField<Decision> = JsonMissing.of()
        ) : this(decision, mutableMapOf())

        /**
         * Whether the card authentication attempt should be approved or declined.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun decision(): Decision = decision.getRequired("decision")

        /**
         * Returns the raw JSON value of [decision].
         *
         * Unlike [decision], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("decision") @ExcludeMissing fun _decision(): JsonField<Decision> = decision

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [CardAuthentication].
             *
             * The following fields are required:
             * ```java
             * .decision()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CardAuthentication]. */
        class Builder internal constructor() {

            private var decision: JsonField<Decision>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(cardAuthentication: CardAuthentication) = apply {
                decision = cardAuthentication.decision
                additionalProperties = cardAuthentication.additionalProperties.toMutableMap()
            }

            /** Whether the card authentication attempt should be approved or declined. */
            fun decision(decision: Decision) = decision(JsonField.of(decision))

            /**
             * Sets [Builder.decision] to an arbitrary JSON value.
             *
             * You should usually call [Builder.decision] with a well-typed [Decision] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
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

            /**
             * Returns an immutable instance of [CardAuthentication].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .decision()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): CardAuthentication =
                CardAuthentication(
                    checkRequired("decision", decision),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): CardAuthentication = apply {
            if (validated) {
                return@apply
            }

            decision().validate()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: IncreaseInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int = (decision.asKnown().getOrNull()?.validity() ?: 0)

        /** Whether the card authentication attempt should be approved or declined. */
        class Decision @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                /** Approve the authentication attempt without triggering a challenge. */
                @JvmField val APPROVE = of("approve")

                /** Request further validation before approving the authentication attempt. */
                @JvmField val CHALLENGE = of("challenge")

                /** Deny the authentication attempt. */
                @JvmField val DENY = of("deny")

                @JvmStatic fun of(value: String) = Decision(JsonField.of(value))
            }

            /** An enum containing [Decision]'s known values. */
            enum class Known {
                /** Approve the authentication attempt without triggering a challenge. */
                APPROVE,
                /** Request further validation before approving the authentication attempt. */
                CHALLENGE,
                /** Deny the authentication attempt. */
                DENY,
            }

            /**
             * An enum containing [Decision]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Decision] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /** Approve the authentication attempt without triggering a challenge. */
                APPROVE,
                /** Request further validation before approving the authentication attempt. */
                CHALLENGE,
                /** Deny the authentication attempt. */
                DENY,
                /**
                 * An enum member indicating that [Decision] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    APPROVE -> Value.APPROVE
                    CHALLENGE -> Value.CHALLENGE
                    DENY -> Value.DENY
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws IncreaseInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    APPROVE -> Known.APPROVE
                    CHALLENGE -> Known.CHALLENGE
                    DENY -> Known.DENY
                    else -> throw IncreaseInvalidDataException("Unknown Decision: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws IncreaseInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    IncreaseInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): Decision = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: IncreaseInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

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
    class CardAuthenticationChallenge
    private constructor(
        private val result: JsonField<Result>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("result") @ExcludeMissing result: JsonField<Result> = JsonMissing.of()
        ) : this(result, mutableMapOf())

        /**
         * Whether the card authentication challenge was successfully delivered to the cardholder.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun result(): Result = result.getRequired("result")

        /**
         * Returns the raw JSON value of [result].
         *
         * Unlike [result], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("result") @ExcludeMissing fun _result(): JsonField<Result> = result

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of
             * [CardAuthenticationChallenge].
             *
             * The following fields are required:
             * ```java
             * .result()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CardAuthenticationChallenge]. */
        class Builder internal constructor() {

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
             * Sets [Builder.result] to an arbitrary JSON value.
             *
             * You should usually call [Builder.result] with a well-typed [Result] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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

            /**
             * Returns an immutable instance of [CardAuthenticationChallenge].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .result()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): CardAuthenticationChallenge =
                CardAuthenticationChallenge(
                    checkRequired("result", result),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): CardAuthenticationChallenge = apply {
            if (validated) {
                return@apply
            }

            result().validate()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: IncreaseInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = (result.asKnown().getOrNull()?.validity() ?: 0)

        /**
         * Whether the card authentication challenge was successfully delivered to the cardholder.
         */
        class Result @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                /** Your application successfully delivered the one-time code to the cardholder. */
                @JvmField val SUCCESS = of("success")

                /** Your application was unable to deliver the one-time code to the cardholder. */
                @JvmField val FAILURE = of("failure")

                @JvmStatic fun of(value: String) = Result(JsonField.of(value))
            }

            /** An enum containing [Result]'s known values. */
            enum class Known {
                /** Your application successfully delivered the one-time code to the cardholder. */
                SUCCESS,
                /** Your application was unable to deliver the one-time code to the cardholder. */
                FAILURE,
            }

            /**
             * An enum containing [Result]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Result] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /** Your application successfully delivered the one-time code to the cardholder. */
                SUCCESS,
                /** Your application was unable to deliver the one-time code to the cardholder. */
                FAILURE,
                /**
                 * An enum member indicating that [Result] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    SUCCESS -> Value.SUCCESS
                    FAILURE -> Value.FAILURE
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws IncreaseInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    SUCCESS -> Known.SUCCESS
                    FAILURE -> Known.FAILURE
                    else -> throw IncreaseInvalidDataException("Unknown Result: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws IncreaseInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    IncreaseInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): Result = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: IncreaseInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

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
    class CardAuthorization
    private constructor(
        private val decision: JsonField<Decision>,
        private val declineReason: JsonField<DeclineReason>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("decision")
            @ExcludeMissing
            decision: JsonField<Decision> = JsonMissing.of(),
            @JsonProperty("decline_reason")
            @ExcludeMissing
            declineReason: JsonField<DeclineReason> = JsonMissing.of(),
        ) : this(decision, declineReason, mutableMapOf())

        /**
         * Whether the card authorization should be approved or declined.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun decision(): Decision = decision.getRequired("decision")

        /**
         * The reason the card authorization was declined. This translates to a specific decline
         * code that is sent to the card network.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun declineReason(): Optional<DeclineReason> = declineReason.getOptional("decline_reason")

        /**
         * Returns the raw JSON value of [decision].
         *
         * Unlike [decision], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("decision") @ExcludeMissing fun _decision(): JsonField<Decision> = decision

        /**
         * Returns the raw JSON value of [declineReason].
         *
         * Unlike [declineReason], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("decline_reason")
        @ExcludeMissing
        fun _declineReason(): JsonField<DeclineReason> = declineReason

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [CardAuthorization].
             *
             * The following fields are required:
             * ```java
             * .decision()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CardAuthorization]. */
        class Builder internal constructor() {

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

            /**
             * Sets [Builder.decision] to an arbitrary JSON value.
             *
             * You should usually call [Builder.decision] with a well-typed [Decision] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun decision(decision: JsonField<Decision>) = apply { this.decision = decision }

            /**
             * The reason the card authorization was declined. This translates to a specific decline
             * code that is sent to the card network.
             */
            fun declineReason(declineReason: DeclineReason) =
                declineReason(JsonField.of(declineReason))

            /**
             * Sets [Builder.declineReason] to an arbitrary JSON value.
             *
             * You should usually call [Builder.declineReason] with a well-typed [DeclineReason]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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

            /**
             * Returns an immutable instance of [CardAuthorization].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .decision()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): CardAuthorization =
                CardAuthorization(
                    checkRequired("decision", decision),
                    declineReason,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): CardAuthorization = apply {
            if (validated) {
                return@apply
            }

            decision().validate()
            declineReason().ifPresent { it.validate() }
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: IncreaseInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (decision.asKnown().getOrNull()?.validity() ?: 0) +
                (declineReason.asKnown().getOrNull()?.validity() ?: 0)

        /** Whether the card authorization should be approved or declined. */
        class Decision @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                /** Approve the authorization. */
                @JvmField val APPROVE = of("approve")

                /** Decline the authorization. */
                @JvmField val DECLINE = of("decline")

                @JvmStatic fun of(value: String) = Decision(JsonField.of(value))
            }

            /** An enum containing [Decision]'s known values. */
            enum class Known {
                /** Approve the authorization. */
                APPROVE,
                /** Decline the authorization. */
                DECLINE,
            }

            /**
             * An enum containing [Decision]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Decision] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /** Approve the authorization. */
                APPROVE,
                /** Decline the authorization. */
                DECLINE,
                /**
                 * An enum member indicating that [Decision] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    APPROVE -> Value.APPROVE
                    DECLINE -> Value.DECLINE
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws IncreaseInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    APPROVE -> Known.APPROVE
                    DECLINE -> Known.DECLINE
                    else -> throw IncreaseInvalidDataException("Unknown Decision: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws IncreaseInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    IncreaseInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): Decision = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: IncreaseInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Decision && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * The reason the card authorization was declined. This translates to a specific decline
         * code that is sent to the card network.
         */
        class DeclineReason @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                /**
                 * The cardholder does not have sufficient funds to cover the transaction. The
                 * merchant may attempt to process the transaction again.
                 */
                @JvmField val INSUFFICIENT_FUNDS = of("insufficient_funds")

                /**
                 * This type of transaction is not allowed for this card. This transaction should
                 * not be retried.
                 */
                @JvmField val TRANSACTION_NEVER_ALLOWED = of("transaction_never_allowed")

                /**
                 * The transaction amount exceeds the cardholder's approval limit. The merchant may
                 * attempt to process the transaction again.
                 */
                @JvmField val EXCEEDS_APPROVAL_LIMIT = of("exceeds_approval_limit")

                /**
                 * The card has been temporarily disabled or not yet activated. The merchant may
                 * attempt to process the transaction again.
                 */
                @JvmField val CARD_TEMPORARILY_DISABLED = of("card_temporarily_disabled")

                /**
                 * The transaction is suspected to be fraudulent. The merchant may attempt to
                 * process the transaction again.
                 */
                @JvmField val SUSPECTED_FRAUD = of("suspected_fraud")

                /**
                 * The transaction was declined for another reason. The merchant may attempt to
                 * process the transaction again. This should be used sparingly.
                 */
                @JvmField val OTHER = of("other")

                @JvmStatic fun of(value: String) = DeclineReason(JsonField.of(value))
            }

            /** An enum containing [DeclineReason]'s known values. */
            enum class Known {
                /**
                 * The cardholder does not have sufficient funds to cover the transaction. The
                 * merchant may attempt to process the transaction again.
                 */
                INSUFFICIENT_FUNDS,
                /**
                 * This type of transaction is not allowed for this card. This transaction should
                 * not be retried.
                 */
                TRANSACTION_NEVER_ALLOWED,
                /**
                 * The transaction amount exceeds the cardholder's approval limit. The merchant may
                 * attempt to process the transaction again.
                 */
                EXCEEDS_APPROVAL_LIMIT,
                /**
                 * The card has been temporarily disabled or not yet activated. The merchant may
                 * attempt to process the transaction again.
                 */
                CARD_TEMPORARILY_DISABLED,
                /**
                 * The transaction is suspected to be fraudulent. The merchant may attempt to
                 * process the transaction again.
                 */
                SUSPECTED_FRAUD,
                /**
                 * The transaction was declined for another reason. The merchant may attempt to
                 * process the transaction again. This should be used sparingly.
                 */
                OTHER,
            }

            /**
             * An enum containing [DeclineReason]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [DeclineReason] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /**
                 * The cardholder does not have sufficient funds to cover the transaction. The
                 * merchant may attempt to process the transaction again.
                 */
                INSUFFICIENT_FUNDS,
                /**
                 * This type of transaction is not allowed for this card. This transaction should
                 * not be retried.
                 */
                TRANSACTION_NEVER_ALLOWED,
                /**
                 * The transaction amount exceeds the cardholder's approval limit. The merchant may
                 * attempt to process the transaction again.
                 */
                EXCEEDS_APPROVAL_LIMIT,
                /**
                 * The card has been temporarily disabled or not yet activated. The merchant may
                 * attempt to process the transaction again.
                 */
                CARD_TEMPORARILY_DISABLED,
                /**
                 * The transaction is suspected to be fraudulent. The merchant may attempt to
                 * process the transaction again.
                 */
                SUSPECTED_FRAUD,
                /**
                 * The transaction was declined for another reason. The merchant may attempt to
                 * process the transaction again. This should be used sparingly.
                 */
                OTHER,
                /**
                 * An enum member indicating that [DeclineReason] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
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

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws IncreaseInvalidDataException if this class instance's value is a not a known
             *   member.
             */
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

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws IncreaseInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    IncreaseInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): DeclineReason = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: IncreaseInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

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
    class DigitalWalletAuthentication
    private constructor(
        private val result: JsonField<Result>,
        private val success: JsonField<Success>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("result") @ExcludeMissing result: JsonField<Result> = JsonMissing.of(),
            @JsonProperty("success") @ExcludeMissing success: JsonField<Success> = JsonMissing.of(),
        ) : this(result, success, mutableMapOf())

        /**
         * Whether your application was able to deliver the one-time passcode.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun result(): Result = result.getRequired("result")

        /**
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun success(): Optional<Success> = success.getOptional("success")

        /**
         * Returns the raw JSON value of [result].
         *
         * Unlike [result], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("result") @ExcludeMissing fun _result(): JsonField<Result> = result

        /**
         * Returns the raw JSON value of [success].
         *
         * Unlike [success], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("success") @ExcludeMissing fun _success(): JsonField<Success> = success

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of
             * [DigitalWalletAuthentication].
             *
             * The following fields are required:
             * ```java
             * .result()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [DigitalWalletAuthentication]. */
        class Builder internal constructor() {

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

            /**
             * Sets [Builder.result] to an arbitrary JSON value.
             *
             * You should usually call [Builder.result] with a well-typed [Result] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun result(result: JsonField<Result>) = apply { this.result = result }

            fun success(success: Success) = success(JsonField.of(success))

            /**
             * Sets [Builder.success] to an arbitrary JSON value.
             *
             * You should usually call [Builder.success] with a well-typed [Success] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
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

            /**
             * Returns an immutable instance of [DigitalWalletAuthentication].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .result()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): DigitalWalletAuthentication =
                DigitalWalletAuthentication(
                    checkRequired("result", result),
                    success,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): DigitalWalletAuthentication = apply {
            if (validated) {
                return@apply
            }

            result().validate()
            success().ifPresent { it.validate() }
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: IncreaseInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (result.asKnown().getOrNull()?.validity() ?: 0) +
                (success.asKnown().getOrNull()?.validity() ?: 0)

        /** Whether your application was able to deliver the one-time passcode. */
        class Result @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                /**
                 * Your application successfully delivered the one-time passcode to the cardholder.
                 */
                @JvmField val SUCCESS = of("success")

                /** Your application failed to deliver the one-time passcode to the cardholder. */
                @JvmField val FAILURE = of("failure")

                @JvmStatic fun of(value: String) = Result(JsonField.of(value))
            }

            /** An enum containing [Result]'s known values. */
            enum class Known {
                /**
                 * Your application successfully delivered the one-time passcode to the cardholder.
                 */
                SUCCESS,
                /** Your application failed to deliver the one-time passcode to the cardholder. */
                FAILURE,
            }

            /**
             * An enum containing [Result]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Result] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /**
                 * Your application successfully delivered the one-time passcode to the cardholder.
                 */
                SUCCESS,
                /** Your application failed to deliver the one-time passcode to the cardholder. */
                FAILURE,
                /**
                 * An enum member indicating that [Result] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    SUCCESS -> Value.SUCCESS
                    FAILURE -> Value.FAILURE
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws IncreaseInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    SUCCESS -> Known.SUCCESS
                    FAILURE -> Known.FAILURE
                    else -> throw IncreaseInvalidDataException("Unknown Result: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws IncreaseInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    IncreaseInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): Result = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: IncreaseInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Result && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class Success
        private constructor(
            private val email: JsonField<String>,
            private val phone: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
                @JsonProperty("phone") @ExcludeMissing phone: JsonField<String> = JsonMissing.of(),
            ) : this(email, phone, mutableMapOf())

            /**
             * The email address that was used to verify the cardholder via one-time passcode.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun email(): Optional<String> = email.getOptional("email")

            /**
             * The phone number that was used to verify the cardholder via one-time passcode over
             * SMS.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun phone(): Optional<String> = phone.getOptional("phone")

            /**
             * Returns the raw JSON value of [email].
             *
             * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

            /**
             * Returns the raw JSON value of [phone].
             *
             * Unlike [phone], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("phone") @ExcludeMissing fun _phone(): JsonField<String> = phone

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [Success]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Success]. */
            class Builder internal constructor() {

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
                 * Sets [Builder.email] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.email] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun email(email: JsonField<String>) = apply { this.email = email }

                /**
                 * The phone number that was used to verify the cardholder via one-time passcode
                 * over SMS.
                 */
                fun phone(phone: String) = phone(JsonField.of(phone))

                /**
                 * Sets [Builder.phone] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.phone] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
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

                /**
                 * Returns an immutable instance of [Success].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Success = Success(email, phone, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Success = apply {
                if (validated) {
                    return@apply
                }

                email()
                phone()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: IncreaseInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (email.asKnown().isPresent) 1 else 0) +
                    (if (phone.asKnown().isPresent) 1 else 0)

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
    class DigitalWalletToken
    private constructor(
        private val approval: JsonField<Approval>,
        private val decline: JsonField<Decline>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("approval")
            @ExcludeMissing
            approval: JsonField<Approval> = JsonMissing.of(),
            @JsonProperty("decline") @ExcludeMissing decline: JsonField<Decline> = JsonMissing.of(),
        ) : this(approval, decline, mutableMapOf())

        /**
         * If your application approves the provisioning attempt, this contains metadata about the
         * digital wallet token that will be generated.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun approval(): Optional<Approval> = approval.getOptional("approval")

        /**
         * If your application declines the provisioning attempt, this contains details about the
         * decline.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun decline(): Optional<Decline> = decline.getOptional("decline")

        /**
         * Returns the raw JSON value of [approval].
         *
         * Unlike [approval], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("approval") @ExcludeMissing fun _approval(): JsonField<Approval> = approval

        /**
         * Returns the raw JSON value of [decline].
         *
         * Unlike [decline], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("decline") @ExcludeMissing fun _decline(): JsonField<Decline> = decline

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [DigitalWalletToken]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [DigitalWalletToken]. */
        class Builder internal constructor() {

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
             * Sets [Builder.approval] to an arbitrary JSON value.
             *
             * You should usually call [Builder.approval] with a well-typed [Approval] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun approval(approval: JsonField<Approval>) = apply { this.approval = approval }

            /**
             * If your application declines the provisioning attempt, this contains details about
             * the decline.
             */
            fun decline(decline: Decline) = decline(JsonField.of(decline))

            /**
             * Sets [Builder.decline] to an arbitrary JSON value.
             *
             * You should usually call [Builder.decline] with a well-typed [Decline] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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

            /**
             * Returns an immutable instance of [DigitalWalletToken].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): DigitalWalletToken =
                DigitalWalletToken(approval, decline, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): DigitalWalletToken = apply {
            if (validated) {
                return@apply
            }

            approval().ifPresent { it.validate() }
            decline().ifPresent { it.validate() }
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: IncreaseInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (approval.asKnown().getOrNull()?.validity() ?: 0) +
                (decline.asKnown().getOrNull()?.validity() ?: 0)

        /**
         * If your application approves the provisioning attempt, this contains metadata about the
         * digital wallet token that will be generated.
         */
        class Approval
        private constructor(
            private val email: JsonField<String>,
            private val phone: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
                @JsonProperty("phone") @ExcludeMissing phone: JsonField<String> = JsonMissing.of(),
            ) : this(email, phone, mutableMapOf())

            /**
             * An email address that can be used to verify the cardholder via one-time passcode.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun email(): Optional<String> = email.getOptional("email")

            /**
             * A phone number that can be used to verify the cardholder via one-time passcode over
             * SMS.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun phone(): Optional<String> = phone.getOptional("phone")

            /**
             * Returns the raw JSON value of [email].
             *
             * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

            /**
             * Returns the raw JSON value of [phone].
             *
             * Unlike [phone], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("phone") @ExcludeMissing fun _phone(): JsonField<String> = phone

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [Approval]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Approval]. */
            class Builder internal constructor() {

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
                 * Sets [Builder.email] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.email] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun email(email: JsonField<String>) = apply { this.email = email }

                /**
                 * A phone number that can be used to verify the cardholder via one-time passcode
                 * over SMS.
                 */
                fun phone(phone: String) = phone(JsonField.of(phone))

                /**
                 * Sets [Builder.phone] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.phone] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
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

                /**
                 * Returns an immutable instance of [Approval].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Approval = Approval(email, phone, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Approval = apply {
                if (validated) {
                    return@apply
                }

                email()
                phone()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: IncreaseInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (email.asKnown().isPresent) 1 else 0) +
                    (if (phone.asKnown().isPresent) 1 else 0)

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
        class Decline
        private constructor(
            private val reason: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("reason") @ExcludeMissing reason: JsonField<String> = JsonMissing.of()
            ) : this(reason, mutableMapOf())

            /**
             * Why the tokenization attempt was declined. This is for logging purposes only and is
             * not displayed to the end-user.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun reason(): Optional<String> = reason.getOptional("reason")

            /**
             * Returns the raw JSON value of [reason].
             *
             * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [Decline]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Decline]. */
            class Builder internal constructor() {

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
                 * Sets [Builder.reason] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.reason] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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

                /**
                 * Returns an immutable instance of [Decline].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Decline = Decline(reason, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Decline = apply {
                if (validated) {
                    return@apply
                }

                reason()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: IncreaseInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = (if (reason.asKnown().isPresent) 1 else 0)

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
