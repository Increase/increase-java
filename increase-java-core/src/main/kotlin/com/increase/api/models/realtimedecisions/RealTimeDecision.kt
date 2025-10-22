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
import com.increase.api.core.checkRequired
import com.increase.api.errors.IncreaseInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Real Time Decisions are created when your application needs to take action in real-time to some
 * event such as a card authorization. For more information, see our
 * [Real-Time Decisions guide](https://increase.com/documentation/real-time-decisions).
 */
class RealTimeDecision
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val cardAuthentication: JsonField<CardAuthentication>,
    private val cardAuthenticationChallenge: JsonField<CardAuthenticationChallenge>,
    private val cardAuthorization: JsonField<CardAuthorization>,
    private val category: JsonField<Category>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val digitalWalletAuthentication: JsonField<DigitalWalletAuthentication>,
    private val digitalWalletToken: JsonField<DigitalWalletToken>,
    private val status: JsonField<Status>,
    private val timeoutAt: JsonField<OffsetDateTime>,
    private val type: JsonField<Type>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("card_authentication")
        @ExcludeMissing
        cardAuthentication: JsonField<CardAuthentication> = JsonMissing.of(),
        @JsonProperty("card_authentication_challenge")
        @ExcludeMissing
        cardAuthenticationChallenge: JsonField<CardAuthenticationChallenge> = JsonMissing.of(),
        @JsonProperty("card_authorization")
        @ExcludeMissing
        cardAuthorization: JsonField<CardAuthorization> = JsonMissing.of(),
        @JsonProperty("category") @ExcludeMissing category: JsonField<Category> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("digital_wallet_authentication")
        @ExcludeMissing
        digitalWalletAuthentication: JsonField<DigitalWalletAuthentication> = JsonMissing.of(),
        @JsonProperty("digital_wallet_token")
        @ExcludeMissing
        digitalWalletToken: JsonField<DigitalWalletToken> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("timeout_at")
        @ExcludeMissing
        timeoutAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
    ) : this(
        id,
        cardAuthentication,
        cardAuthenticationChallenge,
        cardAuthorization,
        category,
        createdAt,
        digitalWalletAuthentication,
        digitalWalletToken,
        status,
        timeoutAt,
        type,
        mutableMapOf(),
    )

    /**
     * The Real-Time Decision identifier.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Fields related to a 3DS authentication attempt.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cardAuthentication(): Optional<CardAuthentication> =
        cardAuthentication.getOptional("card_authentication")

    /**
     * Fields related to a 3DS authentication attempt.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cardAuthenticationChallenge(): Optional<CardAuthenticationChallenge> =
        cardAuthenticationChallenge.getOptional("card_authentication_challenge")

    /**
     * Fields related to a card authorization.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cardAuthorization(): Optional<CardAuthorization> =
        cardAuthorization.getOptional("card_authorization")

    /**
     * The category of the Real-Time Decision.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun category(): Category = category.getRequired("category")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the Real-Time
     * Decision was created.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * Fields related to a digital wallet authentication attempt.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun digitalWalletAuthentication(): Optional<DigitalWalletAuthentication> =
        digitalWalletAuthentication.getOptional("digital_wallet_authentication")

    /**
     * Fields related to a digital wallet token provisioning attempt.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun digitalWalletToken(): Optional<DigitalWalletToken> =
        digitalWalletToken.getOptional("digital_wallet_token")

    /**
     * The status of the Real-Time Decision.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which your
     * application can no longer respond to the Real-Time Decision.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun timeoutAt(): OffsetDateTime = timeoutAt.getRequired("timeout_at")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `real_time_decision`.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [cardAuthentication].
     *
     * Unlike [cardAuthentication], this method doesn't throw if the JSON field has an unexpected
     * type.
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
     * Returns the raw JSON value of [category].
     *
     * Unlike [category], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("category") @ExcludeMissing fun _category(): JsonField<Category> = category

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

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
     * Unlike [digitalWalletToken], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("digital_wallet_token")
    @ExcludeMissing
    fun _digitalWalletToken(): JsonField<DigitalWalletToken> = digitalWalletToken

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [timeoutAt].
     *
     * Unlike [timeoutAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("timeout_at")
    @ExcludeMissing
    fun _timeoutAt(): JsonField<OffsetDateTime> = timeoutAt

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
         * Returns a mutable builder for constructing an instance of [RealTimeDecision].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .cardAuthentication()
         * .cardAuthenticationChallenge()
         * .cardAuthorization()
         * .category()
         * .createdAt()
         * .digitalWalletAuthentication()
         * .digitalWalletToken()
         * .status()
         * .timeoutAt()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RealTimeDecision]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var cardAuthentication: JsonField<CardAuthentication>? = null
        private var cardAuthenticationChallenge: JsonField<CardAuthenticationChallenge>? = null
        private var cardAuthorization: JsonField<CardAuthorization>? = null
        private var category: JsonField<Category>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var digitalWalletAuthentication: JsonField<DigitalWalletAuthentication>? = null
        private var digitalWalletToken: JsonField<DigitalWalletToken>? = null
        private var status: JsonField<Status>? = null
        private var timeoutAt: JsonField<OffsetDateTime>? = null
        private var type: JsonField<Type>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(realTimeDecision: RealTimeDecision) = apply {
            id = realTimeDecision.id
            cardAuthentication = realTimeDecision.cardAuthentication
            cardAuthenticationChallenge = realTimeDecision.cardAuthenticationChallenge
            cardAuthorization = realTimeDecision.cardAuthorization
            category = realTimeDecision.category
            createdAt = realTimeDecision.createdAt
            digitalWalletAuthentication = realTimeDecision.digitalWalletAuthentication
            digitalWalletToken = realTimeDecision.digitalWalletToken
            status = realTimeDecision.status
            timeoutAt = realTimeDecision.timeoutAt
            type = realTimeDecision.type
            additionalProperties = realTimeDecision.additionalProperties.toMutableMap()
        }

        /** The Real-Time Decision identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Fields related to a 3DS authentication attempt. */
        fun cardAuthentication(cardAuthentication: CardAuthentication?) =
            cardAuthentication(JsonField.ofNullable(cardAuthentication))

        /**
         * Alias for calling [Builder.cardAuthentication] with `cardAuthentication.orElse(null)`.
         */
        fun cardAuthentication(cardAuthentication: Optional<CardAuthentication>) =
            cardAuthentication(cardAuthentication.getOrNull())

        /**
         * Sets [Builder.cardAuthentication] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cardAuthentication] with a well-typed
         * [CardAuthentication] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun cardAuthentication(cardAuthentication: JsonField<CardAuthentication>) = apply {
            this.cardAuthentication = cardAuthentication
        }

        /** Fields related to a 3DS authentication attempt. */
        fun cardAuthenticationChallenge(cardAuthenticationChallenge: CardAuthenticationChallenge?) =
            cardAuthenticationChallenge(JsonField.ofNullable(cardAuthenticationChallenge))

        /**
         * Alias for calling [Builder.cardAuthenticationChallenge] with
         * `cardAuthenticationChallenge.orElse(null)`.
         */
        fun cardAuthenticationChallenge(
            cardAuthenticationChallenge: Optional<CardAuthenticationChallenge>
        ) = cardAuthenticationChallenge(cardAuthenticationChallenge.getOrNull())

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

        /** Fields related to a card authorization. */
        fun cardAuthorization(cardAuthorization: CardAuthorization?) =
            cardAuthorization(JsonField.ofNullable(cardAuthorization))

        /** Alias for calling [Builder.cardAuthorization] with `cardAuthorization.orElse(null)`. */
        fun cardAuthorization(cardAuthorization: Optional<CardAuthorization>) =
            cardAuthorization(cardAuthorization.getOrNull())

        /**
         * Sets [Builder.cardAuthorization] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cardAuthorization] with a well-typed [CardAuthorization]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun cardAuthorization(cardAuthorization: JsonField<CardAuthorization>) = apply {
            this.cardAuthorization = cardAuthorization
        }

        /** The category of the Real-Time Decision. */
        fun category(category: Category) = category(JsonField.of(category))

        /**
         * Sets [Builder.category] to an arbitrary JSON value.
         *
         * You should usually call [Builder.category] with a well-typed [Category] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun category(category: JsonField<Category>) = apply { this.category = category }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
         * Real-Time Decision was created.
         */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** Fields related to a digital wallet authentication attempt. */
        fun digitalWalletAuthentication(digitalWalletAuthentication: DigitalWalletAuthentication?) =
            digitalWalletAuthentication(JsonField.ofNullable(digitalWalletAuthentication))

        /**
         * Alias for calling [Builder.digitalWalletAuthentication] with
         * `digitalWalletAuthentication.orElse(null)`.
         */
        fun digitalWalletAuthentication(
            digitalWalletAuthentication: Optional<DigitalWalletAuthentication>
        ) = digitalWalletAuthentication(digitalWalletAuthentication.getOrNull())

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

        /** Fields related to a digital wallet token provisioning attempt. */
        fun digitalWalletToken(digitalWalletToken: DigitalWalletToken?) =
            digitalWalletToken(JsonField.ofNullable(digitalWalletToken))

        /**
         * Alias for calling [Builder.digitalWalletToken] with `digitalWalletToken.orElse(null)`.
         */
        fun digitalWalletToken(digitalWalletToken: Optional<DigitalWalletToken>) =
            digitalWalletToken(digitalWalletToken.getOrNull())

        /**
         * Sets [Builder.digitalWalletToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.digitalWalletToken] with a well-typed
         * [DigitalWalletToken] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun digitalWalletToken(digitalWalletToken: JsonField<DigitalWalletToken>) = apply {
            this.digitalWalletToken = digitalWalletToken
        }

        /** The status of the Real-Time Decision. */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which your
         * application can no longer respond to the Real-Time Decision.
         */
        fun timeoutAt(timeoutAt: OffsetDateTime) = timeoutAt(JsonField.of(timeoutAt))

        /**
         * Sets [Builder.timeoutAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timeoutAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun timeoutAt(timeoutAt: JsonField<OffsetDateTime>) = apply { this.timeoutAt = timeoutAt }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `real_time_decision`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
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

        /**
         * Returns an immutable instance of [RealTimeDecision].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .cardAuthentication()
         * .cardAuthenticationChallenge()
         * .cardAuthorization()
         * .category()
         * .createdAt()
         * .digitalWalletAuthentication()
         * .digitalWalletToken()
         * .status()
         * .timeoutAt()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RealTimeDecision =
            RealTimeDecision(
                checkRequired("id", id),
                checkRequired("cardAuthentication", cardAuthentication),
                checkRequired("cardAuthenticationChallenge", cardAuthenticationChallenge),
                checkRequired("cardAuthorization", cardAuthorization),
                checkRequired("category", category),
                checkRequired("createdAt", createdAt),
                checkRequired("digitalWalletAuthentication", digitalWalletAuthentication),
                checkRequired("digitalWalletToken", digitalWalletToken),
                checkRequired("status", status),
                checkRequired("timeoutAt", timeoutAt),
                checkRequired("type", type),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): RealTimeDecision = apply {
        if (validated) {
            return@apply
        }

        id()
        cardAuthentication().ifPresent { it.validate() }
        cardAuthenticationChallenge().ifPresent { it.validate() }
        cardAuthorization().ifPresent { it.validate() }
        category().validate()
        createdAt()
        digitalWalletAuthentication().ifPresent { it.validate() }
        digitalWalletToken().ifPresent { it.validate() }
        status().validate()
        timeoutAt()
        type().validate()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (id.asKnown().isPresent) 1 else 0) +
            (cardAuthentication.asKnown().getOrNull()?.validity() ?: 0) +
            (cardAuthenticationChallenge.asKnown().getOrNull()?.validity() ?: 0) +
            (cardAuthorization.asKnown().getOrNull()?.validity() ?: 0) +
            (category.asKnown().getOrNull()?.validity() ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (digitalWalletAuthentication.asKnown().getOrNull()?.validity() ?: 0) +
            (digitalWalletToken.asKnown().getOrNull()?.validity() ?: 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (timeoutAt.asKnown().isPresent) 1 else 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0)

    /** Fields related to a 3DS authentication attempt. */
    class CardAuthentication
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val accountId: JsonField<String>,
        private val cardId: JsonField<String>,
        private val decision: JsonField<Decision>,
        private val upcomingCardPaymentId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("account_id")
            @ExcludeMissing
            accountId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("card_id") @ExcludeMissing cardId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("decision")
            @ExcludeMissing
            decision: JsonField<Decision> = JsonMissing.of(),
            @JsonProperty("upcoming_card_payment_id")
            @ExcludeMissing
            upcomingCardPaymentId: JsonField<String> = JsonMissing.of(),
        ) : this(accountId, cardId, decision, upcomingCardPaymentId, mutableMapOf())

        /**
         * The identifier of the Account the card belongs to.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun accountId(): String = accountId.getRequired("account_id")

        /**
         * The identifier of the Card that is being tokenized.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun cardId(): String = cardId.getRequired("card_id")

        /**
         * Whether or not the authentication attempt was approved.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun decision(): Optional<Decision> = decision.getOptional("decision")

        /**
         * The identifier of the Card Payment this authentication attempt will belong to. Available
         * in the API once the card authentication has completed.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun upcomingCardPaymentId(): String =
            upcomingCardPaymentId.getRequired("upcoming_card_payment_id")

        /**
         * Returns the raw JSON value of [accountId].
         *
         * Unlike [accountId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("account_id") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

        /**
         * Returns the raw JSON value of [cardId].
         *
         * Unlike [cardId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("card_id") @ExcludeMissing fun _cardId(): JsonField<String> = cardId

        /**
         * Returns the raw JSON value of [decision].
         *
         * Unlike [decision], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("decision") @ExcludeMissing fun _decision(): JsonField<Decision> = decision

        /**
         * Returns the raw JSON value of [upcomingCardPaymentId].
         *
         * Unlike [upcomingCardPaymentId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("upcoming_card_payment_id")
        @ExcludeMissing
        fun _upcomingCardPaymentId(): JsonField<String> = upcomingCardPaymentId

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
             * .accountId()
             * .cardId()
             * .decision()
             * .upcomingCardPaymentId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CardAuthentication]. */
        class Builder internal constructor() {

            private var accountId: JsonField<String>? = null
            private var cardId: JsonField<String>? = null
            private var decision: JsonField<Decision>? = null
            private var upcomingCardPaymentId: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(cardAuthentication: CardAuthentication) = apply {
                accountId = cardAuthentication.accountId
                cardId = cardAuthentication.cardId
                decision = cardAuthentication.decision
                upcomingCardPaymentId = cardAuthentication.upcomingCardPaymentId
                additionalProperties = cardAuthentication.additionalProperties.toMutableMap()
            }

            /** The identifier of the Account the card belongs to. */
            fun accountId(accountId: String) = accountId(JsonField.of(accountId))

            /**
             * Sets [Builder.accountId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

            /** The identifier of the Card that is being tokenized. */
            fun cardId(cardId: String) = cardId(JsonField.of(cardId))

            /**
             * Sets [Builder.cardId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cardId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cardId(cardId: JsonField<String>) = apply { this.cardId = cardId }

            /** Whether or not the authentication attempt was approved. */
            fun decision(decision: Decision?) = decision(JsonField.ofNullable(decision))

            /** Alias for calling [Builder.decision] with `decision.orElse(null)`. */
            fun decision(decision: Optional<Decision>) = decision(decision.getOrNull())

            /**
             * Sets [Builder.decision] to an arbitrary JSON value.
             *
             * You should usually call [Builder.decision] with a well-typed [Decision] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun decision(decision: JsonField<Decision>) = apply { this.decision = decision }

            /**
             * The identifier of the Card Payment this authentication attempt will belong to.
             * Available in the API once the card authentication has completed.
             */
            fun upcomingCardPaymentId(upcomingCardPaymentId: String) =
                upcomingCardPaymentId(JsonField.of(upcomingCardPaymentId))

            /**
             * Sets [Builder.upcomingCardPaymentId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.upcomingCardPaymentId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun upcomingCardPaymentId(upcomingCardPaymentId: JsonField<String>) = apply {
                this.upcomingCardPaymentId = upcomingCardPaymentId
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
             * Returns an immutable instance of [CardAuthentication].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .accountId()
             * .cardId()
             * .decision()
             * .upcomingCardPaymentId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): CardAuthentication =
                CardAuthentication(
                    checkRequired("accountId", accountId),
                    checkRequired("cardId", cardId),
                    checkRequired("decision", decision),
                    checkRequired("upcomingCardPaymentId", upcomingCardPaymentId),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): CardAuthentication = apply {
            if (validated) {
                return@apply
            }

            accountId()
            cardId()
            decision().ifPresent { it.validate() }
            upcomingCardPaymentId()
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
            (if (accountId.asKnown().isPresent) 1 else 0) +
                (if (cardId.asKnown().isPresent) 1 else 0) +
                (decision.asKnown().getOrNull()?.validity() ?: 0) +
                (if (upcomingCardPaymentId.asKnown().isPresent) 1 else 0)

        /** Whether or not the authentication attempt was approved. */
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

                return other is Decision && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CardAuthentication &&
                accountId == other.accountId &&
                cardId == other.cardId &&
                decision == other.decision &&
                upcomingCardPaymentId == other.upcomingCardPaymentId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(accountId, cardId, decision, upcomingCardPaymentId, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CardAuthentication{accountId=$accountId, cardId=$cardId, decision=$decision, upcomingCardPaymentId=$upcomingCardPaymentId, additionalProperties=$additionalProperties}"
    }

    /** Fields related to a 3DS authentication attempt. */
    class CardAuthenticationChallenge
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val accountId: JsonField<String>,
        private val cardId: JsonField<String>,
        private val cardPaymentId: JsonField<String>,
        private val oneTimeCode: JsonField<String>,
        private val result: JsonField<Result>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("account_id")
            @ExcludeMissing
            accountId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("card_id") @ExcludeMissing cardId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("card_payment_id")
            @ExcludeMissing
            cardPaymentId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("one_time_code")
            @ExcludeMissing
            oneTimeCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("result") @ExcludeMissing result: JsonField<Result> = JsonMissing.of(),
        ) : this(accountId, cardId, cardPaymentId, oneTimeCode, result, mutableMapOf())

        /**
         * The identifier of the Account the card belongs to.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun accountId(): String = accountId.getRequired("account_id")

        /**
         * The identifier of the Card that is being tokenized.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun cardId(): String = cardId.getRequired("card_id")

        /**
         * The identifier of the Card Payment this authentication challenge attempt belongs to.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun cardPaymentId(): String = cardPaymentId.getRequired("card_payment_id")

        /**
         * The one-time code delivered to the cardholder.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun oneTimeCode(): String = oneTimeCode.getRequired("one_time_code")

        /**
         * Whether or not the challenge was delivered to the cardholder.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun result(): Optional<Result> = result.getOptional("result")

        /**
         * Returns the raw JSON value of [accountId].
         *
         * Unlike [accountId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("account_id") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

        /**
         * Returns the raw JSON value of [cardId].
         *
         * Unlike [cardId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("card_id") @ExcludeMissing fun _cardId(): JsonField<String> = cardId

        /**
         * Returns the raw JSON value of [cardPaymentId].
         *
         * Unlike [cardPaymentId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("card_payment_id")
        @ExcludeMissing
        fun _cardPaymentId(): JsonField<String> = cardPaymentId

        /**
         * Returns the raw JSON value of [oneTimeCode].
         *
         * Unlike [oneTimeCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("one_time_code")
        @ExcludeMissing
        fun _oneTimeCode(): JsonField<String> = oneTimeCode

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
             * .accountId()
             * .cardId()
             * .cardPaymentId()
             * .oneTimeCode()
             * .result()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CardAuthenticationChallenge]. */
        class Builder internal constructor() {

            private var accountId: JsonField<String>? = null
            private var cardId: JsonField<String>? = null
            private var cardPaymentId: JsonField<String>? = null
            private var oneTimeCode: JsonField<String>? = null
            private var result: JsonField<Result>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(cardAuthenticationChallenge: CardAuthenticationChallenge) = apply {
                accountId = cardAuthenticationChallenge.accountId
                cardId = cardAuthenticationChallenge.cardId
                cardPaymentId = cardAuthenticationChallenge.cardPaymentId
                oneTimeCode = cardAuthenticationChallenge.oneTimeCode
                result = cardAuthenticationChallenge.result
                additionalProperties =
                    cardAuthenticationChallenge.additionalProperties.toMutableMap()
            }

            /** The identifier of the Account the card belongs to. */
            fun accountId(accountId: String) = accountId(JsonField.of(accountId))

            /**
             * Sets [Builder.accountId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

            /** The identifier of the Card that is being tokenized. */
            fun cardId(cardId: String) = cardId(JsonField.of(cardId))

            /**
             * Sets [Builder.cardId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cardId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cardId(cardId: JsonField<String>) = apply { this.cardId = cardId }

            /**
             * The identifier of the Card Payment this authentication challenge attempt belongs to.
             */
            fun cardPaymentId(cardPaymentId: String) = cardPaymentId(JsonField.of(cardPaymentId))

            /**
             * Sets [Builder.cardPaymentId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cardPaymentId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cardPaymentId(cardPaymentId: JsonField<String>) = apply {
                this.cardPaymentId = cardPaymentId
            }

            /** The one-time code delivered to the cardholder. */
            fun oneTimeCode(oneTimeCode: String) = oneTimeCode(JsonField.of(oneTimeCode))

            /**
             * Sets [Builder.oneTimeCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.oneTimeCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun oneTimeCode(oneTimeCode: JsonField<String>) = apply {
                this.oneTimeCode = oneTimeCode
            }

            /** Whether or not the challenge was delivered to the cardholder. */
            fun result(result: Result?) = result(JsonField.ofNullable(result))

            /** Alias for calling [Builder.result] with `result.orElse(null)`. */
            fun result(result: Optional<Result>) = result(result.getOrNull())

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
             * .accountId()
             * .cardId()
             * .cardPaymentId()
             * .oneTimeCode()
             * .result()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): CardAuthenticationChallenge =
                CardAuthenticationChallenge(
                    checkRequired("accountId", accountId),
                    checkRequired("cardId", cardId),
                    checkRequired("cardPaymentId", cardPaymentId),
                    checkRequired("oneTimeCode", oneTimeCode),
                    checkRequired("result", result),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): CardAuthenticationChallenge = apply {
            if (validated) {
                return@apply
            }

            accountId()
            cardId()
            cardPaymentId()
            oneTimeCode()
            result().ifPresent { it.validate() }
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
            (if (accountId.asKnown().isPresent) 1 else 0) +
                (if (cardId.asKnown().isPresent) 1 else 0) +
                (if (cardPaymentId.asKnown().isPresent) 1 else 0) +
                (if (oneTimeCode.asKnown().isPresent) 1 else 0) +
                (result.asKnown().getOrNull()?.validity() ?: 0)

        /** Whether or not the challenge was delivered to the cardholder. */
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

                return other is Result && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CardAuthenticationChallenge &&
                accountId == other.accountId &&
                cardId == other.cardId &&
                cardPaymentId == other.cardPaymentId &&
                oneTimeCode == other.oneTimeCode &&
                result == other.result &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                accountId,
                cardId,
                cardPaymentId,
                oneTimeCode,
                result,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CardAuthenticationChallenge{accountId=$accountId, cardId=$cardId, cardPaymentId=$cardPaymentId, oneTimeCode=$oneTimeCode, result=$result, additionalProperties=$additionalProperties}"
    }

    /** Fields related to a card authorization. */
    class CardAuthorization
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val accountId: JsonField<String>,
        private val additionalAmounts: JsonField<AdditionalAmounts>,
        private val cardId: JsonField<String>,
        private val decision: JsonField<Decision>,
        private val decline: JsonField<Decline>,
        private val digitalWalletTokenId: JsonField<String>,
        private val direction: JsonField<Direction>,
        private val merchantAcceptorId: JsonField<String>,
        private val merchantCategoryCode: JsonField<String>,
        private val merchantCity: JsonField<String>,
        private val merchantCountry: JsonField<String>,
        private val merchantDescriptor: JsonField<String>,
        private val merchantPostalCode: JsonField<String>,
        private val merchantState: JsonField<String>,
        private val networkDetails: JsonField<NetworkDetails>,
        private val networkIdentifiers: JsonField<NetworkIdentifiers>,
        private val networkRiskScore: JsonField<Long>,
        private val physicalCardId: JsonField<String>,
        private val presentmentAmount: JsonField<Long>,
        private val presentmentCurrency: JsonField<String>,
        private val processingCategory: JsonField<ProcessingCategory>,
        private val requestDetails: JsonField<RequestDetails>,
        private val settlementAmount: JsonField<Long>,
        private val settlementCurrency: JsonField<String>,
        private val terminalId: JsonField<String>,
        private val upcomingCardPaymentId: JsonField<String>,
        private val verification: JsonField<Verification>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("account_id")
            @ExcludeMissing
            accountId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("additional_amounts")
            @ExcludeMissing
            additionalAmounts: JsonField<AdditionalAmounts> = JsonMissing.of(),
            @JsonProperty("card_id") @ExcludeMissing cardId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("decision")
            @ExcludeMissing
            decision: JsonField<Decision> = JsonMissing.of(),
            @JsonProperty("decline") @ExcludeMissing decline: JsonField<Decline> = JsonMissing.of(),
            @JsonProperty("digital_wallet_token_id")
            @ExcludeMissing
            digitalWalletTokenId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("direction")
            @ExcludeMissing
            direction: JsonField<Direction> = JsonMissing.of(),
            @JsonProperty("merchant_acceptor_id")
            @ExcludeMissing
            merchantAcceptorId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("merchant_category_code")
            @ExcludeMissing
            merchantCategoryCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("merchant_city")
            @ExcludeMissing
            merchantCity: JsonField<String> = JsonMissing.of(),
            @JsonProperty("merchant_country")
            @ExcludeMissing
            merchantCountry: JsonField<String> = JsonMissing.of(),
            @JsonProperty("merchant_descriptor")
            @ExcludeMissing
            merchantDescriptor: JsonField<String> = JsonMissing.of(),
            @JsonProperty("merchant_postal_code")
            @ExcludeMissing
            merchantPostalCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("merchant_state")
            @ExcludeMissing
            merchantState: JsonField<String> = JsonMissing.of(),
            @JsonProperty("network_details")
            @ExcludeMissing
            networkDetails: JsonField<NetworkDetails> = JsonMissing.of(),
            @JsonProperty("network_identifiers")
            @ExcludeMissing
            networkIdentifiers: JsonField<NetworkIdentifiers> = JsonMissing.of(),
            @JsonProperty("network_risk_score")
            @ExcludeMissing
            networkRiskScore: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("physical_card_id")
            @ExcludeMissing
            physicalCardId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("presentment_amount")
            @ExcludeMissing
            presentmentAmount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("presentment_currency")
            @ExcludeMissing
            presentmentCurrency: JsonField<String> = JsonMissing.of(),
            @JsonProperty("processing_category")
            @ExcludeMissing
            processingCategory: JsonField<ProcessingCategory> = JsonMissing.of(),
            @JsonProperty("request_details")
            @ExcludeMissing
            requestDetails: JsonField<RequestDetails> = JsonMissing.of(),
            @JsonProperty("settlement_amount")
            @ExcludeMissing
            settlementAmount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("settlement_currency")
            @ExcludeMissing
            settlementCurrency: JsonField<String> = JsonMissing.of(),
            @JsonProperty("terminal_id")
            @ExcludeMissing
            terminalId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("upcoming_card_payment_id")
            @ExcludeMissing
            upcomingCardPaymentId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("verification")
            @ExcludeMissing
            verification: JsonField<Verification> = JsonMissing.of(),
        ) : this(
            accountId,
            additionalAmounts,
            cardId,
            decision,
            decline,
            digitalWalletTokenId,
            direction,
            merchantAcceptorId,
            merchantCategoryCode,
            merchantCity,
            merchantCountry,
            merchantDescriptor,
            merchantPostalCode,
            merchantState,
            networkDetails,
            networkIdentifiers,
            networkRiskScore,
            physicalCardId,
            presentmentAmount,
            presentmentCurrency,
            processingCategory,
            requestDetails,
            settlementAmount,
            settlementCurrency,
            terminalId,
            upcomingCardPaymentId,
            verification,
            mutableMapOf(),
        )

        /**
         * The identifier of the Account the authorization will debit.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun accountId(): String = accountId.getRequired("account_id")

        /**
         * Additional amounts associated with the card authorization, such as ATM surcharges fees.
         * These are usually a subset of the `amount` field and are used to provide more detailed
         * information about the transaction.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun additionalAmounts(): AdditionalAmounts =
            additionalAmounts.getRequired("additional_amounts")

        /**
         * The identifier of the Card that is being authorized.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun cardId(): String = cardId.getRequired("card_id")

        /**
         * Whether or not the authorization was approved.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun decision(): Optional<Decision> = decision.getOptional("decision")

        /**
         * Present if and only if `decision` is `decline`. Contains information related to the
         * reason the authorization was declined.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun decline(): Optional<Decline> = decline.getOptional("decline")

        /**
         * If the authorization was made via a Digital Wallet Token (such as an Apple Pay purchase),
         * the identifier of the token that was used.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun digitalWalletTokenId(): Optional<String> =
            digitalWalletTokenId.getOptional("digital_wallet_token_id")

        /**
         * The direction describes the direction the funds will move, either from the cardholder to
         * the merchant or from the merchant to the cardholder.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun direction(): Direction = direction.getRequired("direction")

        /**
         * The merchant identifier (commonly abbreviated as MID) of the merchant the card is
         * transacting with.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun merchantAcceptorId(): String = merchantAcceptorId.getRequired("merchant_acceptor_id")

        /**
         * The Merchant Category Code (commonly abbreviated as MCC) of the merchant the card is
         * transacting with.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun merchantCategoryCode(): String =
            merchantCategoryCode.getRequired("merchant_category_code")

        /**
         * The city the merchant resides in.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun merchantCity(): Optional<String> = merchantCity.getOptional("merchant_city")

        /**
         * The country the merchant resides in.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun merchantCountry(): String = merchantCountry.getRequired("merchant_country")

        /**
         * The merchant descriptor of the merchant the card is transacting with.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun merchantDescriptor(): String = merchantDescriptor.getRequired("merchant_descriptor")

        /**
         * The merchant's postal code. For US merchants this is either a 5-digit or 9-digit ZIP
         * code, where the first 5 and last 4 are separated by a dash.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun merchantPostalCode(): Optional<String> =
            merchantPostalCode.getOptional("merchant_postal_code")

        /**
         * The state the merchant resides in.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun merchantState(): Optional<String> = merchantState.getOptional("merchant_state")

        /**
         * Fields specific to the `network`.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun networkDetails(): NetworkDetails = networkDetails.getRequired("network_details")

        /**
         * Network-specific identifiers for a specific request or transaction.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun networkIdentifiers(): NetworkIdentifiers =
            networkIdentifiers.getRequired("network_identifiers")

        /**
         * The risk score generated by the card network. For Visa this is the Visa Advanced
         * Authorization risk score, from 0 to 99, where 99 is the riskiest. For Pulse the score is
         * from 0 to 999, where 999 is the riskiest.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun networkRiskScore(): Optional<Long> = networkRiskScore.getOptional("network_risk_score")

        /**
         * If the authorization was made in-person with a physical card, the Physical Card that was
         * used.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun physicalCardId(): Optional<String> = physicalCardId.getOptional("physical_card_id")

        /**
         * The amount of the attempted authorization in the currency the card user sees at the time
         * of purchase, in the minor unit of that currency. For dollars, for example, this is cents.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun presentmentAmount(): Long = presentmentAmount.getRequired("presentment_amount")

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the currency the user
         * sees at the time of purchase.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun presentmentCurrency(): String = presentmentCurrency.getRequired("presentment_currency")

        /**
         * The processing category describes the intent behind the authorization, such as whether it
         * was used for bill payments or an automatic fuel dispenser.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun processingCategory(): ProcessingCategory =
            processingCategory.getRequired("processing_category")

        /**
         * Fields specific to the type of request, such as an incremental authorization.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun requestDetails(): RequestDetails = requestDetails.getRequired("request_details")

        /**
         * The amount of the attempted authorization in the currency it will be settled in. This
         * currency is the same as that of the Account the card belongs to.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun settlementAmount(): Long = settlementAmount.getRequired("settlement_amount")

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the currency the
         * transaction will be settled in.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun settlementCurrency(): String = settlementCurrency.getRequired("settlement_currency")

        /**
         * The terminal identifier (commonly abbreviated as TID) of the terminal the card is
         * transacting with.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun terminalId(): Optional<String> = terminalId.getOptional("terminal_id")

        /**
         * The identifier of the Card Payment this authorization will belong to. Available in the
         * API once the card authorization has completed.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun upcomingCardPaymentId(): String =
            upcomingCardPaymentId.getRequired("upcoming_card_payment_id")

        /**
         * Fields related to verification of cardholder-provided values.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun verification(): Verification = verification.getRequired("verification")

        /**
         * Returns the raw JSON value of [accountId].
         *
         * Unlike [accountId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("account_id") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

        /**
         * Returns the raw JSON value of [additionalAmounts].
         *
         * Unlike [additionalAmounts], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("additional_amounts")
        @ExcludeMissing
        fun _additionalAmounts(): JsonField<AdditionalAmounts> = additionalAmounts

        /**
         * Returns the raw JSON value of [cardId].
         *
         * Unlike [cardId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("card_id") @ExcludeMissing fun _cardId(): JsonField<String> = cardId

        /**
         * Returns the raw JSON value of [decision].
         *
         * Unlike [decision], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("decision") @ExcludeMissing fun _decision(): JsonField<Decision> = decision

        /**
         * Returns the raw JSON value of [decline].
         *
         * Unlike [decline], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("decline") @ExcludeMissing fun _decline(): JsonField<Decline> = decline

        /**
         * Returns the raw JSON value of [digitalWalletTokenId].
         *
         * Unlike [digitalWalletTokenId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("digital_wallet_token_id")
        @ExcludeMissing
        fun _digitalWalletTokenId(): JsonField<String> = digitalWalletTokenId

        /**
         * Returns the raw JSON value of [direction].
         *
         * Unlike [direction], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("direction")
        @ExcludeMissing
        fun _direction(): JsonField<Direction> = direction

        /**
         * Returns the raw JSON value of [merchantAcceptorId].
         *
         * Unlike [merchantAcceptorId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("merchant_acceptor_id")
        @ExcludeMissing
        fun _merchantAcceptorId(): JsonField<String> = merchantAcceptorId

        /**
         * Returns the raw JSON value of [merchantCategoryCode].
         *
         * Unlike [merchantCategoryCode], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("merchant_category_code")
        @ExcludeMissing
        fun _merchantCategoryCode(): JsonField<String> = merchantCategoryCode

        /**
         * Returns the raw JSON value of [merchantCity].
         *
         * Unlike [merchantCity], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("merchant_city")
        @ExcludeMissing
        fun _merchantCity(): JsonField<String> = merchantCity

        /**
         * Returns the raw JSON value of [merchantCountry].
         *
         * Unlike [merchantCountry], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("merchant_country")
        @ExcludeMissing
        fun _merchantCountry(): JsonField<String> = merchantCountry

        /**
         * Returns the raw JSON value of [merchantDescriptor].
         *
         * Unlike [merchantDescriptor], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("merchant_descriptor")
        @ExcludeMissing
        fun _merchantDescriptor(): JsonField<String> = merchantDescriptor

        /**
         * Returns the raw JSON value of [merchantPostalCode].
         *
         * Unlike [merchantPostalCode], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("merchant_postal_code")
        @ExcludeMissing
        fun _merchantPostalCode(): JsonField<String> = merchantPostalCode

        /**
         * Returns the raw JSON value of [merchantState].
         *
         * Unlike [merchantState], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("merchant_state")
        @ExcludeMissing
        fun _merchantState(): JsonField<String> = merchantState

        /**
         * Returns the raw JSON value of [networkDetails].
         *
         * Unlike [networkDetails], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("network_details")
        @ExcludeMissing
        fun _networkDetails(): JsonField<NetworkDetails> = networkDetails

        /**
         * Returns the raw JSON value of [networkIdentifiers].
         *
         * Unlike [networkIdentifiers], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("network_identifiers")
        @ExcludeMissing
        fun _networkIdentifiers(): JsonField<NetworkIdentifiers> = networkIdentifiers

        /**
         * Returns the raw JSON value of [networkRiskScore].
         *
         * Unlike [networkRiskScore], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("network_risk_score")
        @ExcludeMissing
        fun _networkRiskScore(): JsonField<Long> = networkRiskScore

        /**
         * Returns the raw JSON value of [physicalCardId].
         *
         * Unlike [physicalCardId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("physical_card_id")
        @ExcludeMissing
        fun _physicalCardId(): JsonField<String> = physicalCardId

        /**
         * Returns the raw JSON value of [presentmentAmount].
         *
         * Unlike [presentmentAmount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("presentment_amount")
        @ExcludeMissing
        fun _presentmentAmount(): JsonField<Long> = presentmentAmount

        /**
         * Returns the raw JSON value of [presentmentCurrency].
         *
         * Unlike [presentmentCurrency], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("presentment_currency")
        @ExcludeMissing
        fun _presentmentCurrency(): JsonField<String> = presentmentCurrency

        /**
         * Returns the raw JSON value of [processingCategory].
         *
         * Unlike [processingCategory], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("processing_category")
        @ExcludeMissing
        fun _processingCategory(): JsonField<ProcessingCategory> = processingCategory

        /**
         * Returns the raw JSON value of [requestDetails].
         *
         * Unlike [requestDetails], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("request_details")
        @ExcludeMissing
        fun _requestDetails(): JsonField<RequestDetails> = requestDetails

        /**
         * Returns the raw JSON value of [settlementAmount].
         *
         * Unlike [settlementAmount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("settlement_amount")
        @ExcludeMissing
        fun _settlementAmount(): JsonField<Long> = settlementAmount

        /**
         * Returns the raw JSON value of [settlementCurrency].
         *
         * Unlike [settlementCurrency], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("settlement_currency")
        @ExcludeMissing
        fun _settlementCurrency(): JsonField<String> = settlementCurrency

        /**
         * Returns the raw JSON value of [terminalId].
         *
         * Unlike [terminalId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("terminal_id")
        @ExcludeMissing
        fun _terminalId(): JsonField<String> = terminalId

        /**
         * Returns the raw JSON value of [upcomingCardPaymentId].
         *
         * Unlike [upcomingCardPaymentId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("upcoming_card_payment_id")
        @ExcludeMissing
        fun _upcomingCardPaymentId(): JsonField<String> = upcomingCardPaymentId

        /**
         * Returns the raw JSON value of [verification].
         *
         * Unlike [verification], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("verification")
        @ExcludeMissing
        fun _verification(): JsonField<Verification> = verification

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
             * .accountId()
             * .additionalAmounts()
             * .cardId()
             * .decision()
             * .decline()
             * .digitalWalletTokenId()
             * .direction()
             * .merchantAcceptorId()
             * .merchantCategoryCode()
             * .merchantCity()
             * .merchantCountry()
             * .merchantDescriptor()
             * .merchantPostalCode()
             * .merchantState()
             * .networkDetails()
             * .networkIdentifiers()
             * .networkRiskScore()
             * .physicalCardId()
             * .presentmentAmount()
             * .presentmentCurrency()
             * .processingCategory()
             * .requestDetails()
             * .settlementAmount()
             * .settlementCurrency()
             * .terminalId()
             * .upcomingCardPaymentId()
             * .verification()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CardAuthorization]. */
        class Builder internal constructor() {

            private var accountId: JsonField<String>? = null
            private var additionalAmounts: JsonField<AdditionalAmounts>? = null
            private var cardId: JsonField<String>? = null
            private var decision: JsonField<Decision>? = null
            private var decline: JsonField<Decline>? = null
            private var digitalWalletTokenId: JsonField<String>? = null
            private var direction: JsonField<Direction>? = null
            private var merchantAcceptorId: JsonField<String>? = null
            private var merchantCategoryCode: JsonField<String>? = null
            private var merchantCity: JsonField<String>? = null
            private var merchantCountry: JsonField<String>? = null
            private var merchantDescriptor: JsonField<String>? = null
            private var merchantPostalCode: JsonField<String>? = null
            private var merchantState: JsonField<String>? = null
            private var networkDetails: JsonField<NetworkDetails>? = null
            private var networkIdentifiers: JsonField<NetworkIdentifiers>? = null
            private var networkRiskScore: JsonField<Long>? = null
            private var physicalCardId: JsonField<String>? = null
            private var presentmentAmount: JsonField<Long>? = null
            private var presentmentCurrency: JsonField<String>? = null
            private var processingCategory: JsonField<ProcessingCategory>? = null
            private var requestDetails: JsonField<RequestDetails>? = null
            private var settlementAmount: JsonField<Long>? = null
            private var settlementCurrency: JsonField<String>? = null
            private var terminalId: JsonField<String>? = null
            private var upcomingCardPaymentId: JsonField<String>? = null
            private var verification: JsonField<Verification>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(cardAuthorization: CardAuthorization) = apply {
                accountId = cardAuthorization.accountId
                additionalAmounts = cardAuthorization.additionalAmounts
                cardId = cardAuthorization.cardId
                decision = cardAuthorization.decision
                decline = cardAuthorization.decline
                digitalWalletTokenId = cardAuthorization.digitalWalletTokenId
                direction = cardAuthorization.direction
                merchantAcceptorId = cardAuthorization.merchantAcceptorId
                merchantCategoryCode = cardAuthorization.merchantCategoryCode
                merchantCity = cardAuthorization.merchantCity
                merchantCountry = cardAuthorization.merchantCountry
                merchantDescriptor = cardAuthorization.merchantDescriptor
                merchantPostalCode = cardAuthorization.merchantPostalCode
                merchantState = cardAuthorization.merchantState
                networkDetails = cardAuthorization.networkDetails
                networkIdentifiers = cardAuthorization.networkIdentifiers
                networkRiskScore = cardAuthorization.networkRiskScore
                physicalCardId = cardAuthorization.physicalCardId
                presentmentAmount = cardAuthorization.presentmentAmount
                presentmentCurrency = cardAuthorization.presentmentCurrency
                processingCategory = cardAuthorization.processingCategory
                requestDetails = cardAuthorization.requestDetails
                settlementAmount = cardAuthorization.settlementAmount
                settlementCurrency = cardAuthorization.settlementCurrency
                terminalId = cardAuthorization.terminalId
                upcomingCardPaymentId = cardAuthorization.upcomingCardPaymentId
                verification = cardAuthorization.verification
                additionalProperties = cardAuthorization.additionalProperties.toMutableMap()
            }

            /** The identifier of the Account the authorization will debit. */
            fun accountId(accountId: String) = accountId(JsonField.of(accountId))

            /**
             * Sets [Builder.accountId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

            /**
             * Additional amounts associated with the card authorization, such as ATM surcharges
             * fees. These are usually a subset of the `amount` field and are used to provide more
             * detailed information about the transaction.
             */
            fun additionalAmounts(additionalAmounts: AdditionalAmounts) =
                additionalAmounts(JsonField.of(additionalAmounts))

            /**
             * Sets [Builder.additionalAmounts] to an arbitrary JSON value.
             *
             * You should usually call [Builder.additionalAmounts] with a well-typed
             * [AdditionalAmounts] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun additionalAmounts(additionalAmounts: JsonField<AdditionalAmounts>) = apply {
                this.additionalAmounts = additionalAmounts
            }

            /** The identifier of the Card that is being authorized. */
            fun cardId(cardId: String) = cardId(JsonField.of(cardId))

            /**
             * Sets [Builder.cardId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cardId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cardId(cardId: JsonField<String>) = apply { this.cardId = cardId }

            /** Whether or not the authorization was approved. */
            fun decision(decision: Decision?) = decision(JsonField.ofNullable(decision))

            /** Alias for calling [Builder.decision] with `decision.orElse(null)`. */
            fun decision(decision: Optional<Decision>) = decision(decision.getOrNull())

            /**
             * Sets [Builder.decision] to an arbitrary JSON value.
             *
             * You should usually call [Builder.decision] with a well-typed [Decision] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun decision(decision: JsonField<Decision>) = apply { this.decision = decision }

            /**
             * Present if and only if `decision` is `decline`. Contains information related to the
             * reason the authorization was declined.
             */
            fun decline(decline: Decline?) = decline(JsonField.ofNullable(decline))

            /** Alias for calling [Builder.decline] with `decline.orElse(null)`. */
            fun decline(decline: Optional<Decline>) = decline(decline.getOrNull())

            /**
             * Sets [Builder.decline] to an arbitrary JSON value.
             *
             * You should usually call [Builder.decline] with a well-typed [Decline] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun decline(decline: JsonField<Decline>) = apply { this.decline = decline }

            /**
             * If the authorization was made via a Digital Wallet Token (such as an Apple Pay
             * purchase), the identifier of the token that was used.
             */
            fun digitalWalletTokenId(digitalWalletTokenId: String?) =
                digitalWalletTokenId(JsonField.ofNullable(digitalWalletTokenId))

            /**
             * Alias for calling [Builder.digitalWalletTokenId] with
             * `digitalWalletTokenId.orElse(null)`.
             */
            fun digitalWalletTokenId(digitalWalletTokenId: Optional<String>) =
                digitalWalletTokenId(digitalWalletTokenId.getOrNull())

            /**
             * Sets [Builder.digitalWalletTokenId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.digitalWalletTokenId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun digitalWalletTokenId(digitalWalletTokenId: JsonField<String>) = apply {
                this.digitalWalletTokenId = digitalWalletTokenId
            }

            /**
             * The direction describes the direction the funds will move, either from the cardholder
             * to the merchant or from the merchant to the cardholder.
             */
            fun direction(direction: Direction) = direction(JsonField.of(direction))

            /**
             * Sets [Builder.direction] to an arbitrary JSON value.
             *
             * You should usually call [Builder.direction] with a well-typed [Direction] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun direction(direction: JsonField<Direction>) = apply { this.direction = direction }

            /**
             * The merchant identifier (commonly abbreviated as MID) of the merchant the card is
             * transacting with.
             */
            fun merchantAcceptorId(merchantAcceptorId: String) =
                merchantAcceptorId(JsonField.of(merchantAcceptorId))

            /**
             * Sets [Builder.merchantAcceptorId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.merchantAcceptorId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun merchantAcceptorId(merchantAcceptorId: JsonField<String>) = apply {
                this.merchantAcceptorId = merchantAcceptorId
            }

            /**
             * The Merchant Category Code (commonly abbreviated as MCC) of the merchant the card is
             * transacting with.
             */
            fun merchantCategoryCode(merchantCategoryCode: String) =
                merchantCategoryCode(JsonField.of(merchantCategoryCode))

            /**
             * Sets [Builder.merchantCategoryCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.merchantCategoryCode] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun merchantCategoryCode(merchantCategoryCode: JsonField<String>) = apply {
                this.merchantCategoryCode = merchantCategoryCode
            }

            /** The city the merchant resides in. */
            fun merchantCity(merchantCity: String?) =
                merchantCity(JsonField.ofNullable(merchantCity))

            /** Alias for calling [Builder.merchantCity] with `merchantCity.orElse(null)`. */
            fun merchantCity(merchantCity: Optional<String>) =
                merchantCity(merchantCity.getOrNull())

            /**
             * Sets [Builder.merchantCity] to an arbitrary JSON value.
             *
             * You should usually call [Builder.merchantCity] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun merchantCity(merchantCity: JsonField<String>) = apply {
                this.merchantCity = merchantCity
            }

            /** The country the merchant resides in. */
            fun merchantCountry(merchantCountry: String) =
                merchantCountry(JsonField.of(merchantCountry))

            /**
             * Sets [Builder.merchantCountry] to an arbitrary JSON value.
             *
             * You should usually call [Builder.merchantCountry] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun merchantCountry(merchantCountry: JsonField<String>) = apply {
                this.merchantCountry = merchantCountry
            }

            /** The merchant descriptor of the merchant the card is transacting with. */
            fun merchantDescriptor(merchantDescriptor: String) =
                merchantDescriptor(JsonField.of(merchantDescriptor))

            /**
             * Sets [Builder.merchantDescriptor] to an arbitrary JSON value.
             *
             * You should usually call [Builder.merchantDescriptor] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun merchantDescriptor(merchantDescriptor: JsonField<String>) = apply {
                this.merchantDescriptor = merchantDescriptor
            }

            /**
             * The merchant's postal code. For US merchants this is either a 5-digit or 9-digit ZIP
             * code, where the first 5 and last 4 are separated by a dash.
             */
            fun merchantPostalCode(merchantPostalCode: String?) =
                merchantPostalCode(JsonField.ofNullable(merchantPostalCode))

            /**
             * Alias for calling [Builder.merchantPostalCode] with
             * `merchantPostalCode.orElse(null)`.
             */
            fun merchantPostalCode(merchantPostalCode: Optional<String>) =
                merchantPostalCode(merchantPostalCode.getOrNull())

            /**
             * Sets [Builder.merchantPostalCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.merchantPostalCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun merchantPostalCode(merchantPostalCode: JsonField<String>) = apply {
                this.merchantPostalCode = merchantPostalCode
            }

            /** The state the merchant resides in. */
            fun merchantState(merchantState: String?) =
                merchantState(JsonField.ofNullable(merchantState))

            /** Alias for calling [Builder.merchantState] with `merchantState.orElse(null)`. */
            fun merchantState(merchantState: Optional<String>) =
                merchantState(merchantState.getOrNull())

            /**
             * Sets [Builder.merchantState] to an arbitrary JSON value.
             *
             * You should usually call [Builder.merchantState] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun merchantState(merchantState: JsonField<String>) = apply {
                this.merchantState = merchantState
            }

            /** Fields specific to the `network`. */
            fun networkDetails(networkDetails: NetworkDetails) =
                networkDetails(JsonField.of(networkDetails))

            /**
             * Sets [Builder.networkDetails] to an arbitrary JSON value.
             *
             * You should usually call [Builder.networkDetails] with a well-typed [NetworkDetails]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun networkDetails(networkDetails: JsonField<NetworkDetails>) = apply {
                this.networkDetails = networkDetails
            }

            /** Network-specific identifiers for a specific request or transaction. */
            fun networkIdentifiers(networkIdentifiers: NetworkIdentifiers) =
                networkIdentifiers(JsonField.of(networkIdentifiers))

            /**
             * Sets [Builder.networkIdentifiers] to an arbitrary JSON value.
             *
             * You should usually call [Builder.networkIdentifiers] with a well-typed
             * [NetworkIdentifiers] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun networkIdentifiers(networkIdentifiers: JsonField<NetworkIdentifiers>) = apply {
                this.networkIdentifiers = networkIdentifiers
            }

            /**
             * The risk score generated by the card network. For Visa this is the Visa Advanced
             * Authorization risk score, from 0 to 99, where 99 is the riskiest. For Pulse the score
             * is from 0 to 999, where 999 is the riskiest.
             */
            fun networkRiskScore(networkRiskScore: Long?) =
                networkRiskScore(JsonField.ofNullable(networkRiskScore))

            /**
             * Alias for [Builder.networkRiskScore].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun networkRiskScore(networkRiskScore: Long) =
                networkRiskScore(networkRiskScore as Long?)

            /**
             * Alias for calling [Builder.networkRiskScore] with `networkRiskScore.orElse(null)`.
             */
            fun networkRiskScore(networkRiskScore: Optional<Long>) =
                networkRiskScore(networkRiskScore.getOrNull())

            /**
             * Sets [Builder.networkRiskScore] to an arbitrary JSON value.
             *
             * You should usually call [Builder.networkRiskScore] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun networkRiskScore(networkRiskScore: JsonField<Long>) = apply {
                this.networkRiskScore = networkRiskScore
            }

            /**
             * If the authorization was made in-person with a physical card, the Physical Card that
             * was used.
             */
            fun physicalCardId(physicalCardId: String?) =
                physicalCardId(JsonField.ofNullable(physicalCardId))

            /** Alias for calling [Builder.physicalCardId] with `physicalCardId.orElse(null)`. */
            fun physicalCardId(physicalCardId: Optional<String>) =
                physicalCardId(physicalCardId.getOrNull())

            /**
             * Sets [Builder.physicalCardId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.physicalCardId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun physicalCardId(physicalCardId: JsonField<String>) = apply {
                this.physicalCardId = physicalCardId
            }

            /**
             * The amount of the attempted authorization in the currency the card user sees at the
             * time of purchase, in the minor unit of that currency. For dollars, for example, this
             * is cents.
             */
            fun presentmentAmount(presentmentAmount: Long) =
                presentmentAmount(JsonField.of(presentmentAmount))

            /**
             * Sets [Builder.presentmentAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.presentmentAmount] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun presentmentAmount(presentmentAmount: JsonField<Long>) = apply {
                this.presentmentAmount = presentmentAmount
            }

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the currency the user
             * sees at the time of purchase.
             */
            fun presentmentCurrency(presentmentCurrency: String) =
                presentmentCurrency(JsonField.of(presentmentCurrency))

            /**
             * Sets [Builder.presentmentCurrency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.presentmentCurrency] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun presentmentCurrency(presentmentCurrency: JsonField<String>) = apply {
                this.presentmentCurrency = presentmentCurrency
            }

            /**
             * The processing category describes the intent behind the authorization, such as
             * whether it was used for bill payments or an automatic fuel dispenser.
             */
            fun processingCategory(processingCategory: ProcessingCategory) =
                processingCategory(JsonField.of(processingCategory))

            /**
             * Sets [Builder.processingCategory] to an arbitrary JSON value.
             *
             * You should usually call [Builder.processingCategory] with a well-typed
             * [ProcessingCategory] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun processingCategory(processingCategory: JsonField<ProcessingCategory>) = apply {
                this.processingCategory = processingCategory
            }

            /** Fields specific to the type of request, such as an incremental authorization. */
            fun requestDetails(requestDetails: RequestDetails) =
                requestDetails(JsonField.of(requestDetails))

            /**
             * Sets [Builder.requestDetails] to an arbitrary JSON value.
             *
             * You should usually call [Builder.requestDetails] with a well-typed [RequestDetails]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun requestDetails(requestDetails: JsonField<RequestDetails>) = apply {
                this.requestDetails = requestDetails
            }

            /**
             * The amount of the attempted authorization in the currency it will be settled in. This
             * currency is the same as that of the Account the card belongs to.
             */
            fun settlementAmount(settlementAmount: Long) =
                settlementAmount(JsonField.of(settlementAmount))

            /**
             * Sets [Builder.settlementAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.settlementAmount] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun settlementAmount(settlementAmount: JsonField<Long>) = apply {
                this.settlementAmount = settlementAmount
            }

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the currency the
             * transaction will be settled in.
             */
            fun settlementCurrency(settlementCurrency: String) =
                settlementCurrency(JsonField.of(settlementCurrency))

            /**
             * Sets [Builder.settlementCurrency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.settlementCurrency] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun settlementCurrency(settlementCurrency: JsonField<String>) = apply {
                this.settlementCurrency = settlementCurrency
            }

            /**
             * The terminal identifier (commonly abbreviated as TID) of the terminal the card is
             * transacting with.
             */
            fun terminalId(terminalId: String?) = terminalId(JsonField.ofNullable(terminalId))

            /** Alias for calling [Builder.terminalId] with `terminalId.orElse(null)`. */
            fun terminalId(terminalId: Optional<String>) = terminalId(terminalId.getOrNull())

            /**
             * Sets [Builder.terminalId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.terminalId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun terminalId(terminalId: JsonField<String>) = apply { this.terminalId = terminalId }

            /**
             * The identifier of the Card Payment this authorization will belong to. Available in
             * the API once the card authorization has completed.
             */
            fun upcomingCardPaymentId(upcomingCardPaymentId: String) =
                upcomingCardPaymentId(JsonField.of(upcomingCardPaymentId))

            /**
             * Sets [Builder.upcomingCardPaymentId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.upcomingCardPaymentId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun upcomingCardPaymentId(upcomingCardPaymentId: JsonField<String>) = apply {
                this.upcomingCardPaymentId = upcomingCardPaymentId
            }

            /** Fields related to verification of cardholder-provided values. */
            fun verification(verification: Verification) = verification(JsonField.of(verification))

            /**
             * Sets [Builder.verification] to an arbitrary JSON value.
             *
             * You should usually call [Builder.verification] with a well-typed [Verification] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun verification(verification: JsonField<Verification>) = apply {
                this.verification = verification
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
             * .accountId()
             * .additionalAmounts()
             * .cardId()
             * .decision()
             * .decline()
             * .digitalWalletTokenId()
             * .direction()
             * .merchantAcceptorId()
             * .merchantCategoryCode()
             * .merchantCity()
             * .merchantCountry()
             * .merchantDescriptor()
             * .merchantPostalCode()
             * .merchantState()
             * .networkDetails()
             * .networkIdentifiers()
             * .networkRiskScore()
             * .physicalCardId()
             * .presentmentAmount()
             * .presentmentCurrency()
             * .processingCategory()
             * .requestDetails()
             * .settlementAmount()
             * .settlementCurrency()
             * .terminalId()
             * .upcomingCardPaymentId()
             * .verification()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): CardAuthorization =
                CardAuthorization(
                    checkRequired("accountId", accountId),
                    checkRequired("additionalAmounts", additionalAmounts),
                    checkRequired("cardId", cardId),
                    checkRequired("decision", decision),
                    checkRequired("decline", decline),
                    checkRequired("digitalWalletTokenId", digitalWalletTokenId),
                    checkRequired("direction", direction),
                    checkRequired("merchantAcceptorId", merchantAcceptorId),
                    checkRequired("merchantCategoryCode", merchantCategoryCode),
                    checkRequired("merchantCity", merchantCity),
                    checkRequired("merchantCountry", merchantCountry),
                    checkRequired("merchantDescriptor", merchantDescriptor),
                    checkRequired("merchantPostalCode", merchantPostalCode),
                    checkRequired("merchantState", merchantState),
                    checkRequired("networkDetails", networkDetails),
                    checkRequired("networkIdentifiers", networkIdentifiers),
                    checkRequired("networkRiskScore", networkRiskScore),
                    checkRequired("physicalCardId", physicalCardId),
                    checkRequired("presentmentAmount", presentmentAmount),
                    checkRequired("presentmentCurrency", presentmentCurrency),
                    checkRequired("processingCategory", processingCategory),
                    checkRequired("requestDetails", requestDetails),
                    checkRequired("settlementAmount", settlementAmount),
                    checkRequired("settlementCurrency", settlementCurrency),
                    checkRequired("terminalId", terminalId),
                    checkRequired("upcomingCardPaymentId", upcomingCardPaymentId),
                    checkRequired("verification", verification),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): CardAuthorization = apply {
            if (validated) {
                return@apply
            }

            accountId()
            additionalAmounts().validate()
            cardId()
            decision().ifPresent { it.validate() }
            decline().ifPresent { it.validate() }
            digitalWalletTokenId()
            direction().validate()
            merchantAcceptorId()
            merchantCategoryCode()
            merchantCity()
            merchantCountry()
            merchantDescriptor()
            merchantPostalCode()
            merchantState()
            networkDetails().validate()
            networkIdentifiers().validate()
            networkRiskScore()
            physicalCardId()
            presentmentAmount()
            presentmentCurrency()
            processingCategory().validate()
            requestDetails().validate()
            settlementAmount()
            settlementCurrency()
            terminalId()
            upcomingCardPaymentId()
            verification().validate()
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
            (if (accountId.asKnown().isPresent) 1 else 0) +
                (additionalAmounts.asKnown().getOrNull()?.validity() ?: 0) +
                (if (cardId.asKnown().isPresent) 1 else 0) +
                (decision.asKnown().getOrNull()?.validity() ?: 0) +
                (decline.asKnown().getOrNull()?.validity() ?: 0) +
                (if (digitalWalletTokenId.asKnown().isPresent) 1 else 0) +
                (direction.asKnown().getOrNull()?.validity() ?: 0) +
                (if (merchantAcceptorId.asKnown().isPresent) 1 else 0) +
                (if (merchantCategoryCode.asKnown().isPresent) 1 else 0) +
                (if (merchantCity.asKnown().isPresent) 1 else 0) +
                (if (merchantCountry.asKnown().isPresent) 1 else 0) +
                (if (merchantDescriptor.asKnown().isPresent) 1 else 0) +
                (if (merchantPostalCode.asKnown().isPresent) 1 else 0) +
                (if (merchantState.asKnown().isPresent) 1 else 0) +
                (networkDetails.asKnown().getOrNull()?.validity() ?: 0) +
                (networkIdentifiers.asKnown().getOrNull()?.validity() ?: 0) +
                (if (networkRiskScore.asKnown().isPresent) 1 else 0) +
                (if (physicalCardId.asKnown().isPresent) 1 else 0) +
                (if (presentmentAmount.asKnown().isPresent) 1 else 0) +
                (if (presentmentCurrency.asKnown().isPresent) 1 else 0) +
                (processingCategory.asKnown().getOrNull()?.validity() ?: 0) +
                (requestDetails.asKnown().getOrNull()?.validity() ?: 0) +
                (if (settlementAmount.asKnown().isPresent) 1 else 0) +
                (if (settlementCurrency.asKnown().isPresent) 1 else 0) +
                (if (terminalId.asKnown().isPresent) 1 else 0) +
                (if (upcomingCardPaymentId.asKnown().isPresent) 1 else 0) +
                (verification.asKnown().getOrNull()?.validity() ?: 0)

        /**
         * Additional amounts associated with the card authorization, such as ATM surcharges fees.
         * These are usually a subset of the `amount` field and are used to provide more detailed
         * information about the transaction.
         */
        class AdditionalAmounts
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val clinic: JsonField<Clinic>,
            private val dental: JsonField<Dental>,
            private val prescription: JsonField<Prescription>,
            private val surcharge: JsonField<Surcharge>,
            private val totalCumulative: JsonField<TotalCumulative>,
            private val totalHealthcare: JsonField<TotalHealthcare>,
            private val transit: JsonField<Transit>,
            private val unknown: JsonField<Unknown>,
            private val vision: JsonField<Vision>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("clinic")
                @ExcludeMissing
                clinic: JsonField<Clinic> = JsonMissing.of(),
                @JsonProperty("dental")
                @ExcludeMissing
                dental: JsonField<Dental> = JsonMissing.of(),
                @JsonProperty("prescription")
                @ExcludeMissing
                prescription: JsonField<Prescription> = JsonMissing.of(),
                @JsonProperty("surcharge")
                @ExcludeMissing
                surcharge: JsonField<Surcharge> = JsonMissing.of(),
                @JsonProperty("total_cumulative")
                @ExcludeMissing
                totalCumulative: JsonField<TotalCumulative> = JsonMissing.of(),
                @JsonProperty("total_healthcare")
                @ExcludeMissing
                totalHealthcare: JsonField<TotalHealthcare> = JsonMissing.of(),
                @JsonProperty("transit")
                @ExcludeMissing
                transit: JsonField<Transit> = JsonMissing.of(),
                @JsonProperty("unknown")
                @ExcludeMissing
                unknown: JsonField<Unknown> = JsonMissing.of(),
                @JsonProperty("vision") @ExcludeMissing vision: JsonField<Vision> = JsonMissing.of(),
            ) : this(
                clinic,
                dental,
                prescription,
                surcharge,
                totalCumulative,
                totalHealthcare,
                transit,
                unknown,
                vision,
                mutableMapOf(),
            )

            /**
             * The part of this transaction amount that was for clinic-related services.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun clinic(): Optional<Clinic> = clinic.getOptional("clinic")

            /**
             * The part of this transaction amount that was for dental-related services.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun dental(): Optional<Dental> = dental.getOptional("dental")

            /**
             * The part of this transaction amount that was for healthcare prescriptions.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun prescription(): Optional<Prescription> = prescription.getOptional("prescription")

            /**
             * The surcharge amount charged for this transaction by the merchant.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun surcharge(): Optional<Surcharge> = surcharge.getOptional("surcharge")

            /**
             * The total amount of a series of incremental authorizations, optionally provided.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun totalCumulative(): Optional<TotalCumulative> =
                totalCumulative.getOptional("total_cumulative")

            /**
             * The total amount of healthcare-related additional amounts.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun totalHealthcare(): Optional<TotalHealthcare> =
                totalHealthcare.getOptional("total_healthcare")

            /**
             * The part of this transaction amount that was for transit-related services.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun transit(): Optional<Transit> = transit.getOptional("transit")

            /**
             * An unknown additional amount.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun unknown(): Optional<Unknown> = unknown.getOptional("unknown")

            /**
             * The part of this transaction amount that was for vision-related services.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun vision(): Optional<Vision> = vision.getOptional("vision")

            /**
             * Returns the raw JSON value of [clinic].
             *
             * Unlike [clinic], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("clinic") @ExcludeMissing fun _clinic(): JsonField<Clinic> = clinic

            /**
             * Returns the raw JSON value of [dental].
             *
             * Unlike [dental], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("dental") @ExcludeMissing fun _dental(): JsonField<Dental> = dental

            /**
             * Returns the raw JSON value of [prescription].
             *
             * Unlike [prescription], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("prescription")
            @ExcludeMissing
            fun _prescription(): JsonField<Prescription> = prescription

            /**
             * Returns the raw JSON value of [surcharge].
             *
             * Unlike [surcharge], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("surcharge")
            @ExcludeMissing
            fun _surcharge(): JsonField<Surcharge> = surcharge

            /**
             * Returns the raw JSON value of [totalCumulative].
             *
             * Unlike [totalCumulative], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("total_cumulative")
            @ExcludeMissing
            fun _totalCumulative(): JsonField<TotalCumulative> = totalCumulative

            /**
             * Returns the raw JSON value of [totalHealthcare].
             *
             * Unlike [totalHealthcare], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("total_healthcare")
            @ExcludeMissing
            fun _totalHealthcare(): JsonField<TotalHealthcare> = totalHealthcare

            /**
             * Returns the raw JSON value of [transit].
             *
             * Unlike [transit], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("transit") @ExcludeMissing fun _transit(): JsonField<Transit> = transit

            /**
             * Returns the raw JSON value of [unknown].
             *
             * Unlike [unknown], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("unknown") @ExcludeMissing fun _unknown(): JsonField<Unknown> = unknown

            /**
             * Returns the raw JSON value of [vision].
             *
             * Unlike [vision], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("vision") @ExcludeMissing fun _vision(): JsonField<Vision> = vision

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
                 * Returns a mutable builder for constructing an instance of [AdditionalAmounts].
                 *
                 * The following fields are required:
                 * ```java
                 * .clinic()
                 * .dental()
                 * .prescription()
                 * .surcharge()
                 * .totalCumulative()
                 * .totalHealthcare()
                 * .transit()
                 * .unknown()
                 * .vision()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [AdditionalAmounts]. */
            class Builder internal constructor() {

                private var clinic: JsonField<Clinic>? = null
                private var dental: JsonField<Dental>? = null
                private var prescription: JsonField<Prescription>? = null
                private var surcharge: JsonField<Surcharge>? = null
                private var totalCumulative: JsonField<TotalCumulative>? = null
                private var totalHealthcare: JsonField<TotalHealthcare>? = null
                private var transit: JsonField<Transit>? = null
                private var unknown: JsonField<Unknown>? = null
                private var vision: JsonField<Vision>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(additionalAmounts: AdditionalAmounts) = apply {
                    clinic = additionalAmounts.clinic
                    dental = additionalAmounts.dental
                    prescription = additionalAmounts.prescription
                    surcharge = additionalAmounts.surcharge
                    totalCumulative = additionalAmounts.totalCumulative
                    totalHealthcare = additionalAmounts.totalHealthcare
                    transit = additionalAmounts.transit
                    unknown = additionalAmounts.unknown
                    vision = additionalAmounts.vision
                    additionalProperties = additionalAmounts.additionalProperties.toMutableMap()
                }

                /** The part of this transaction amount that was for clinic-related services. */
                fun clinic(clinic: Clinic?) = clinic(JsonField.ofNullable(clinic))

                /** Alias for calling [Builder.clinic] with `clinic.orElse(null)`. */
                fun clinic(clinic: Optional<Clinic>) = clinic(clinic.getOrNull())

                /**
                 * Sets [Builder.clinic] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.clinic] with a well-typed [Clinic] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun clinic(clinic: JsonField<Clinic>) = apply { this.clinic = clinic }

                /** The part of this transaction amount that was for dental-related services. */
                fun dental(dental: Dental?) = dental(JsonField.ofNullable(dental))

                /** Alias for calling [Builder.dental] with `dental.orElse(null)`. */
                fun dental(dental: Optional<Dental>) = dental(dental.getOrNull())

                /**
                 * Sets [Builder.dental] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.dental] with a well-typed [Dental] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun dental(dental: JsonField<Dental>) = apply { this.dental = dental }

                /** The part of this transaction amount that was for healthcare prescriptions. */
                fun prescription(prescription: Prescription?) =
                    prescription(JsonField.ofNullable(prescription))

                /** Alias for calling [Builder.prescription] with `prescription.orElse(null)`. */
                fun prescription(prescription: Optional<Prescription>) =
                    prescription(prescription.getOrNull())

                /**
                 * Sets [Builder.prescription] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.prescription] with a well-typed [Prescription]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun prescription(prescription: JsonField<Prescription>) = apply {
                    this.prescription = prescription
                }

                /** The surcharge amount charged for this transaction by the merchant. */
                fun surcharge(surcharge: Surcharge?) = surcharge(JsonField.ofNullable(surcharge))

                /** Alias for calling [Builder.surcharge] with `surcharge.orElse(null)`. */
                fun surcharge(surcharge: Optional<Surcharge>) = surcharge(surcharge.getOrNull())

                /**
                 * Sets [Builder.surcharge] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.surcharge] with a well-typed [Surcharge] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun surcharge(surcharge: JsonField<Surcharge>) = apply {
                    this.surcharge = surcharge
                }

                /**
                 * The total amount of a series of incremental authorizations, optionally provided.
                 */
                fun totalCumulative(totalCumulative: TotalCumulative?) =
                    totalCumulative(JsonField.ofNullable(totalCumulative))

                /**
                 * Alias for calling [Builder.totalCumulative] with `totalCumulative.orElse(null)`.
                 */
                fun totalCumulative(totalCumulative: Optional<TotalCumulative>) =
                    totalCumulative(totalCumulative.getOrNull())

                /**
                 * Sets [Builder.totalCumulative] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.totalCumulative] with a well-typed
                 * [TotalCumulative] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun totalCumulative(totalCumulative: JsonField<TotalCumulative>) = apply {
                    this.totalCumulative = totalCumulative
                }

                /** The total amount of healthcare-related additional amounts. */
                fun totalHealthcare(totalHealthcare: TotalHealthcare?) =
                    totalHealthcare(JsonField.ofNullable(totalHealthcare))

                /**
                 * Alias for calling [Builder.totalHealthcare] with `totalHealthcare.orElse(null)`.
                 */
                fun totalHealthcare(totalHealthcare: Optional<TotalHealthcare>) =
                    totalHealthcare(totalHealthcare.getOrNull())

                /**
                 * Sets [Builder.totalHealthcare] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.totalHealthcare] with a well-typed
                 * [TotalHealthcare] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun totalHealthcare(totalHealthcare: JsonField<TotalHealthcare>) = apply {
                    this.totalHealthcare = totalHealthcare
                }

                /** The part of this transaction amount that was for transit-related services. */
                fun transit(transit: Transit?) = transit(JsonField.ofNullable(transit))

                /** Alias for calling [Builder.transit] with `transit.orElse(null)`. */
                fun transit(transit: Optional<Transit>) = transit(transit.getOrNull())

                /**
                 * Sets [Builder.transit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.transit] with a well-typed [Transit] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun transit(transit: JsonField<Transit>) = apply { this.transit = transit }

                /** An unknown additional amount. */
                fun unknown(unknown: Unknown?) = unknown(JsonField.ofNullable(unknown))

                /** Alias for calling [Builder.unknown] with `unknown.orElse(null)`. */
                fun unknown(unknown: Optional<Unknown>) = unknown(unknown.getOrNull())

                /**
                 * Sets [Builder.unknown] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.unknown] with a well-typed [Unknown] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun unknown(unknown: JsonField<Unknown>) = apply { this.unknown = unknown }

                /** The part of this transaction amount that was for vision-related services. */
                fun vision(vision: Vision?) = vision(JsonField.ofNullable(vision))

                /** Alias for calling [Builder.vision] with `vision.orElse(null)`. */
                fun vision(vision: Optional<Vision>) = vision(vision.getOrNull())

                /**
                 * Sets [Builder.vision] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.vision] with a well-typed [Vision] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun vision(vision: JsonField<Vision>) = apply { this.vision = vision }

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
                 * Returns an immutable instance of [AdditionalAmounts].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .clinic()
                 * .dental()
                 * .prescription()
                 * .surcharge()
                 * .totalCumulative()
                 * .totalHealthcare()
                 * .transit()
                 * .unknown()
                 * .vision()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): AdditionalAmounts =
                    AdditionalAmounts(
                        checkRequired("clinic", clinic),
                        checkRequired("dental", dental),
                        checkRequired("prescription", prescription),
                        checkRequired("surcharge", surcharge),
                        checkRequired("totalCumulative", totalCumulative),
                        checkRequired("totalHealthcare", totalHealthcare),
                        checkRequired("transit", transit),
                        checkRequired("unknown", unknown),
                        checkRequired("vision", vision),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): AdditionalAmounts = apply {
                if (validated) {
                    return@apply
                }

                clinic().ifPresent { it.validate() }
                dental().ifPresent { it.validate() }
                prescription().ifPresent { it.validate() }
                surcharge().ifPresent { it.validate() }
                totalCumulative().ifPresent { it.validate() }
                totalHealthcare().ifPresent { it.validate() }
                transit().ifPresent { it.validate() }
                unknown().ifPresent { it.validate() }
                vision().ifPresent { it.validate() }
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
                (clinic.asKnown().getOrNull()?.validity() ?: 0) +
                    (dental.asKnown().getOrNull()?.validity() ?: 0) +
                    (prescription.asKnown().getOrNull()?.validity() ?: 0) +
                    (surcharge.asKnown().getOrNull()?.validity() ?: 0) +
                    (totalCumulative.asKnown().getOrNull()?.validity() ?: 0) +
                    (totalHealthcare.asKnown().getOrNull()?.validity() ?: 0) +
                    (transit.asKnown().getOrNull()?.validity() ?: 0) +
                    (unknown.asKnown().getOrNull()?.validity() ?: 0) +
                    (vision.asKnown().getOrNull()?.validity() ?: 0)

            /** The part of this transaction amount that was for clinic-related services. */
            class Clinic
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val amount: JsonField<Long>,
                private val currency: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("amount")
                    @ExcludeMissing
                    amount: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("currency")
                    @ExcludeMissing
                    currency: JsonField<String> = JsonMissing.of(),
                ) : this(amount, currency, mutableMapOf())

                /**
                 * The amount in minor units of the `currency` field. The amount is positive if it
                 * is added to the amount (such as an ATM surcharge fee) and negative if it is
                 * subtracted from the amount (such as a discount).
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun amount(): Long = amount.getRequired("amount")

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the additional
                 * amount's currency.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun currency(): String = currency.getRequired("currency")

                /**
                 * Returns the raw JSON value of [amount].
                 *
                 * Unlike [amount], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

                /**
                 * Returns the raw JSON value of [currency].
                 *
                 * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun _currency(): JsonField<String> = currency

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
                     * Returns a mutable builder for constructing an instance of [Clinic].
                     *
                     * The following fields are required:
                     * ```java
                     * .amount()
                     * .currency()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Clinic]. */
                class Builder internal constructor() {

                    private var amount: JsonField<Long>? = null
                    private var currency: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(clinic: Clinic) = apply {
                        amount = clinic.amount
                        currency = clinic.currency
                        additionalProperties = clinic.additionalProperties.toMutableMap()
                    }

                    /**
                     * The amount in minor units of the `currency` field. The amount is positive if
                     * it is added to the amount (such as an ATM surcharge fee) and negative if it
                     * is subtracted from the amount (such as a discount).
                     */
                    fun amount(amount: Long) = amount(JsonField.of(amount))

                    /**
                     * Sets [Builder.amount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.amount] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                     * additional amount's currency.
                     */
                    fun currency(currency: String) = currency(JsonField.of(currency))

                    /**
                     * Sets [Builder.currency] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.currency] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun currency(currency: JsonField<String>) = apply { this.currency = currency }

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
                     * Returns an immutable instance of [Clinic].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .amount()
                     * .currency()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Clinic =
                        Clinic(
                            checkRequired("amount", amount),
                            checkRequired("currency", currency),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Clinic = apply {
                    if (validated) {
                        return@apply
                    }

                    amount()
                    currency()
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
                    (if (amount.asKnown().isPresent) 1 else 0) +
                        (if (currency.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Clinic &&
                        amount == other.amount &&
                        currency == other.currency &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(amount, currency, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Clinic{amount=$amount, currency=$currency, additionalProperties=$additionalProperties}"
            }

            /** The part of this transaction amount that was for dental-related services. */
            class Dental
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val amount: JsonField<Long>,
                private val currency: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("amount")
                    @ExcludeMissing
                    amount: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("currency")
                    @ExcludeMissing
                    currency: JsonField<String> = JsonMissing.of(),
                ) : this(amount, currency, mutableMapOf())

                /**
                 * The amount in minor units of the `currency` field. The amount is positive if it
                 * is added to the amount (such as an ATM surcharge fee) and negative if it is
                 * subtracted from the amount (such as a discount).
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun amount(): Long = amount.getRequired("amount")

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the additional
                 * amount's currency.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun currency(): String = currency.getRequired("currency")

                /**
                 * Returns the raw JSON value of [amount].
                 *
                 * Unlike [amount], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

                /**
                 * Returns the raw JSON value of [currency].
                 *
                 * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun _currency(): JsonField<String> = currency

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
                     * Returns a mutable builder for constructing an instance of [Dental].
                     *
                     * The following fields are required:
                     * ```java
                     * .amount()
                     * .currency()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Dental]. */
                class Builder internal constructor() {

                    private var amount: JsonField<Long>? = null
                    private var currency: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(dental: Dental) = apply {
                        amount = dental.amount
                        currency = dental.currency
                        additionalProperties = dental.additionalProperties.toMutableMap()
                    }

                    /**
                     * The amount in minor units of the `currency` field. The amount is positive if
                     * it is added to the amount (such as an ATM surcharge fee) and negative if it
                     * is subtracted from the amount (such as a discount).
                     */
                    fun amount(amount: Long) = amount(JsonField.of(amount))

                    /**
                     * Sets [Builder.amount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.amount] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                     * additional amount's currency.
                     */
                    fun currency(currency: String) = currency(JsonField.of(currency))

                    /**
                     * Sets [Builder.currency] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.currency] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun currency(currency: JsonField<String>) = apply { this.currency = currency }

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
                     * Returns an immutable instance of [Dental].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .amount()
                     * .currency()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Dental =
                        Dental(
                            checkRequired("amount", amount),
                            checkRequired("currency", currency),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Dental = apply {
                    if (validated) {
                        return@apply
                    }

                    amount()
                    currency()
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
                    (if (amount.asKnown().isPresent) 1 else 0) +
                        (if (currency.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Dental &&
                        amount == other.amount &&
                        currency == other.currency &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(amount, currency, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Dental{amount=$amount, currency=$currency, additionalProperties=$additionalProperties}"
            }

            /** The part of this transaction amount that was for healthcare prescriptions. */
            class Prescription
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val amount: JsonField<Long>,
                private val currency: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("amount")
                    @ExcludeMissing
                    amount: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("currency")
                    @ExcludeMissing
                    currency: JsonField<String> = JsonMissing.of(),
                ) : this(amount, currency, mutableMapOf())

                /**
                 * The amount in minor units of the `currency` field. The amount is positive if it
                 * is added to the amount (such as an ATM surcharge fee) and negative if it is
                 * subtracted from the amount (such as a discount).
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun amount(): Long = amount.getRequired("amount")

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the additional
                 * amount's currency.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun currency(): String = currency.getRequired("currency")

                /**
                 * Returns the raw JSON value of [amount].
                 *
                 * Unlike [amount], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

                /**
                 * Returns the raw JSON value of [currency].
                 *
                 * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun _currency(): JsonField<String> = currency

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
                     * Returns a mutable builder for constructing an instance of [Prescription].
                     *
                     * The following fields are required:
                     * ```java
                     * .amount()
                     * .currency()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Prescription]. */
                class Builder internal constructor() {

                    private var amount: JsonField<Long>? = null
                    private var currency: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(prescription: Prescription) = apply {
                        amount = prescription.amount
                        currency = prescription.currency
                        additionalProperties = prescription.additionalProperties.toMutableMap()
                    }

                    /**
                     * The amount in minor units of the `currency` field. The amount is positive if
                     * it is added to the amount (such as an ATM surcharge fee) and negative if it
                     * is subtracted from the amount (such as a discount).
                     */
                    fun amount(amount: Long) = amount(JsonField.of(amount))

                    /**
                     * Sets [Builder.amount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.amount] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                     * additional amount's currency.
                     */
                    fun currency(currency: String) = currency(JsonField.of(currency))

                    /**
                     * Sets [Builder.currency] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.currency] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun currency(currency: JsonField<String>) = apply { this.currency = currency }

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
                     * Returns an immutable instance of [Prescription].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .amount()
                     * .currency()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Prescription =
                        Prescription(
                            checkRequired("amount", amount),
                            checkRequired("currency", currency),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Prescription = apply {
                    if (validated) {
                        return@apply
                    }

                    amount()
                    currency()
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
                    (if (amount.asKnown().isPresent) 1 else 0) +
                        (if (currency.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Prescription &&
                        amount == other.amount &&
                        currency == other.currency &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(amount, currency, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Prescription{amount=$amount, currency=$currency, additionalProperties=$additionalProperties}"
            }

            /** The surcharge amount charged for this transaction by the merchant. */
            class Surcharge
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val amount: JsonField<Long>,
                private val currency: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("amount")
                    @ExcludeMissing
                    amount: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("currency")
                    @ExcludeMissing
                    currency: JsonField<String> = JsonMissing.of(),
                ) : this(amount, currency, mutableMapOf())

                /**
                 * The amount in minor units of the `currency` field. The amount is positive if it
                 * is added to the amount (such as an ATM surcharge fee) and negative if it is
                 * subtracted from the amount (such as a discount).
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun amount(): Long = amount.getRequired("amount")

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the additional
                 * amount's currency.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun currency(): String = currency.getRequired("currency")

                /**
                 * Returns the raw JSON value of [amount].
                 *
                 * Unlike [amount], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

                /**
                 * Returns the raw JSON value of [currency].
                 *
                 * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun _currency(): JsonField<String> = currency

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
                     * Returns a mutable builder for constructing an instance of [Surcharge].
                     *
                     * The following fields are required:
                     * ```java
                     * .amount()
                     * .currency()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Surcharge]. */
                class Builder internal constructor() {

                    private var amount: JsonField<Long>? = null
                    private var currency: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(surcharge: Surcharge) = apply {
                        amount = surcharge.amount
                        currency = surcharge.currency
                        additionalProperties = surcharge.additionalProperties.toMutableMap()
                    }

                    /**
                     * The amount in minor units of the `currency` field. The amount is positive if
                     * it is added to the amount (such as an ATM surcharge fee) and negative if it
                     * is subtracted from the amount (such as a discount).
                     */
                    fun amount(amount: Long) = amount(JsonField.of(amount))

                    /**
                     * Sets [Builder.amount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.amount] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                     * additional amount's currency.
                     */
                    fun currency(currency: String) = currency(JsonField.of(currency))

                    /**
                     * Sets [Builder.currency] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.currency] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun currency(currency: JsonField<String>) = apply { this.currency = currency }

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
                     * Returns an immutable instance of [Surcharge].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .amount()
                     * .currency()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Surcharge =
                        Surcharge(
                            checkRequired("amount", amount),
                            checkRequired("currency", currency),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Surcharge = apply {
                    if (validated) {
                        return@apply
                    }

                    amount()
                    currency()
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
                    (if (amount.asKnown().isPresent) 1 else 0) +
                        (if (currency.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Surcharge &&
                        amount == other.amount &&
                        currency == other.currency &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(amount, currency, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Surcharge{amount=$amount, currency=$currency, additionalProperties=$additionalProperties}"
            }

            /** The total amount of a series of incremental authorizations, optionally provided. */
            class TotalCumulative
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val amount: JsonField<Long>,
                private val currency: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("amount")
                    @ExcludeMissing
                    amount: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("currency")
                    @ExcludeMissing
                    currency: JsonField<String> = JsonMissing.of(),
                ) : this(amount, currency, mutableMapOf())

                /**
                 * The amount in minor units of the `currency` field. The amount is positive if it
                 * is added to the amount (such as an ATM surcharge fee) and negative if it is
                 * subtracted from the amount (such as a discount).
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun amount(): Long = amount.getRequired("amount")

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the additional
                 * amount's currency.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun currency(): String = currency.getRequired("currency")

                /**
                 * Returns the raw JSON value of [amount].
                 *
                 * Unlike [amount], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

                /**
                 * Returns the raw JSON value of [currency].
                 *
                 * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun _currency(): JsonField<String> = currency

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
                     * Returns a mutable builder for constructing an instance of [TotalCumulative].
                     *
                     * The following fields are required:
                     * ```java
                     * .amount()
                     * .currency()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [TotalCumulative]. */
                class Builder internal constructor() {

                    private var amount: JsonField<Long>? = null
                    private var currency: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(totalCumulative: TotalCumulative) = apply {
                        amount = totalCumulative.amount
                        currency = totalCumulative.currency
                        additionalProperties = totalCumulative.additionalProperties.toMutableMap()
                    }

                    /**
                     * The amount in minor units of the `currency` field. The amount is positive if
                     * it is added to the amount (such as an ATM surcharge fee) and negative if it
                     * is subtracted from the amount (such as a discount).
                     */
                    fun amount(amount: Long) = amount(JsonField.of(amount))

                    /**
                     * Sets [Builder.amount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.amount] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                     * additional amount's currency.
                     */
                    fun currency(currency: String) = currency(JsonField.of(currency))

                    /**
                     * Sets [Builder.currency] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.currency] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun currency(currency: JsonField<String>) = apply { this.currency = currency }

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
                     * Returns an immutable instance of [TotalCumulative].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .amount()
                     * .currency()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): TotalCumulative =
                        TotalCumulative(
                            checkRequired("amount", amount),
                            checkRequired("currency", currency),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): TotalCumulative = apply {
                    if (validated) {
                        return@apply
                    }

                    amount()
                    currency()
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
                    (if (amount.asKnown().isPresent) 1 else 0) +
                        (if (currency.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is TotalCumulative &&
                        amount == other.amount &&
                        currency == other.currency &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(amount, currency, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "TotalCumulative{amount=$amount, currency=$currency, additionalProperties=$additionalProperties}"
            }

            /** The total amount of healthcare-related additional amounts. */
            class TotalHealthcare
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val amount: JsonField<Long>,
                private val currency: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("amount")
                    @ExcludeMissing
                    amount: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("currency")
                    @ExcludeMissing
                    currency: JsonField<String> = JsonMissing.of(),
                ) : this(amount, currency, mutableMapOf())

                /**
                 * The amount in minor units of the `currency` field. The amount is positive if it
                 * is added to the amount (such as an ATM surcharge fee) and negative if it is
                 * subtracted from the amount (such as a discount).
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun amount(): Long = amount.getRequired("amount")

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the additional
                 * amount's currency.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun currency(): String = currency.getRequired("currency")

                /**
                 * Returns the raw JSON value of [amount].
                 *
                 * Unlike [amount], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

                /**
                 * Returns the raw JSON value of [currency].
                 *
                 * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun _currency(): JsonField<String> = currency

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
                     * Returns a mutable builder for constructing an instance of [TotalHealthcare].
                     *
                     * The following fields are required:
                     * ```java
                     * .amount()
                     * .currency()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [TotalHealthcare]. */
                class Builder internal constructor() {

                    private var amount: JsonField<Long>? = null
                    private var currency: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(totalHealthcare: TotalHealthcare) = apply {
                        amount = totalHealthcare.amount
                        currency = totalHealthcare.currency
                        additionalProperties = totalHealthcare.additionalProperties.toMutableMap()
                    }

                    /**
                     * The amount in minor units of the `currency` field. The amount is positive if
                     * it is added to the amount (such as an ATM surcharge fee) and negative if it
                     * is subtracted from the amount (such as a discount).
                     */
                    fun amount(amount: Long) = amount(JsonField.of(amount))

                    /**
                     * Sets [Builder.amount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.amount] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                     * additional amount's currency.
                     */
                    fun currency(currency: String) = currency(JsonField.of(currency))

                    /**
                     * Sets [Builder.currency] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.currency] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun currency(currency: JsonField<String>) = apply { this.currency = currency }

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
                     * Returns an immutable instance of [TotalHealthcare].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .amount()
                     * .currency()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): TotalHealthcare =
                        TotalHealthcare(
                            checkRequired("amount", amount),
                            checkRequired("currency", currency),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): TotalHealthcare = apply {
                    if (validated) {
                        return@apply
                    }

                    amount()
                    currency()
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
                    (if (amount.asKnown().isPresent) 1 else 0) +
                        (if (currency.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is TotalHealthcare &&
                        amount == other.amount &&
                        currency == other.currency &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(amount, currency, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "TotalHealthcare{amount=$amount, currency=$currency, additionalProperties=$additionalProperties}"
            }

            /** The part of this transaction amount that was for transit-related services. */
            class Transit
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val amount: JsonField<Long>,
                private val currency: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("amount")
                    @ExcludeMissing
                    amount: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("currency")
                    @ExcludeMissing
                    currency: JsonField<String> = JsonMissing.of(),
                ) : this(amount, currency, mutableMapOf())

                /**
                 * The amount in minor units of the `currency` field. The amount is positive if it
                 * is added to the amount (such as an ATM surcharge fee) and negative if it is
                 * subtracted from the amount (such as a discount).
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun amount(): Long = amount.getRequired("amount")

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the additional
                 * amount's currency.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun currency(): String = currency.getRequired("currency")

                /**
                 * Returns the raw JSON value of [amount].
                 *
                 * Unlike [amount], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

                /**
                 * Returns the raw JSON value of [currency].
                 *
                 * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun _currency(): JsonField<String> = currency

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
                     * Returns a mutable builder for constructing an instance of [Transit].
                     *
                     * The following fields are required:
                     * ```java
                     * .amount()
                     * .currency()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Transit]. */
                class Builder internal constructor() {

                    private var amount: JsonField<Long>? = null
                    private var currency: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(transit: Transit) = apply {
                        amount = transit.amount
                        currency = transit.currency
                        additionalProperties = transit.additionalProperties.toMutableMap()
                    }

                    /**
                     * The amount in minor units of the `currency` field. The amount is positive if
                     * it is added to the amount (such as an ATM surcharge fee) and negative if it
                     * is subtracted from the amount (such as a discount).
                     */
                    fun amount(amount: Long) = amount(JsonField.of(amount))

                    /**
                     * Sets [Builder.amount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.amount] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                     * additional amount's currency.
                     */
                    fun currency(currency: String) = currency(JsonField.of(currency))

                    /**
                     * Sets [Builder.currency] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.currency] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun currency(currency: JsonField<String>) = apply { this.currency = currency }

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
                     * Returns an immutable instance of [Transit].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .amount()
                     * .currency()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Transit =
                        Transit(
                            checkRequired("amount", amount),
                            checkRequired("currency", currency),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Transit = apply {
                    if (validated) {
                        return@apply
                    }

                    amount()
                    currency()
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
                    (if (amount.asKnown().isPresent) 1 else 0) +
                        (if (currency.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Transit &&
                        amount == other.amount &&
                        currency == other.currency &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(amount, currency, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Transit{amount=$amount, currency=$currency, additionalProperties=$additionalProperties}"
            }

            /** An unknown additional amount. */
            class Unknown
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val amount: JsonField<Long>,
                private val currency: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("amount")
                    @ExcludeMissing
                    amount: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("currency")
                    @ExcludeMissing
                    currency: JsonField<String> = JsonMissing.of(),
                ) : this(amount, currency, mutableMapOf())

                /**
                 * The amount in minor units of the `currency` field. The amount is positive if it
                 * is added to the amount (such as an ATM surcharge fee) and negative if it is
                 * subtracted from the amount (such as a discount).
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun amount(): Long = amount.getRequired("amount")

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the additional
                 * amount's currency.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun currency(): String = currency.getRequired("currency")

                /**
                 * Returns the raw JSON value of [amount].
                 *
                 * Unlike [amount], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

                /**
                 * Returns the raw JSON value of [currency].
                 *
                 * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun _currency(): JsonField<String> = currency

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
                     * Returns a mutable builder for constructing an instance of [Unknown].
                     *
                     * The following fields are required:
                     * ```java
                     * .amount()
                     * .currency()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Unknown]. */
                class Builder internal constructor() {

                    private var amount: JsonField<Long>? = null
                    private var currency: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(unknown: Unknown) = apply {
                        amount = unknown.amount
                        currency = unknown.currency
                        additionalProperties = unknown.additionalProperties.toMutableMap()
                    }

                    /**
                     * The amount in minor units of the `currency` field. The amount is positive if
                     * it is added to the amount (such as an ATM surcharge fee) and negative if it
                     * is subtracted from the amount (such as a discount).
                     */
                    fun amount(amount: Long) = amount(JsonField.of(amount))

                    /**
                     * Sets [Builder.amount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.amount] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                     * additional amount's currency.
                     */
                    fun currency(currency: String) = currency(JsonField.of(currency))

                    /**
                     * Sets [Builder.currency] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.currency] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun currency(currency: JsonField<String>) = apply { this.currency = currency }

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
                     * Returns an immutable instance of [Unknown].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .amount()
                     * .currency()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Unknown =
                        Unknown(
                            checkRequired("amount", amount),
                            checkRequired("currency", currency),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Unknown = apply {
                    if (validated) {
                        return@apply
                    }

                    amount()
                    currency()
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
                    (if (amount.asKnown().isPresent) 1 else 0) +
                        (if (currency.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Unknown &&
                        amount == other.amount &&
                        currency == other.currency &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(amount, currency, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Unknown{amount=$amount, currency=$currency, additionalProperties=$additionalProperties}"
            }

            /** The part of this transaction amount that was for vision-related services. */
            class Vision
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val amount: JsonField<Long>,
                private val currency: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("amount")
                    @ExcludeMissing
                    amount: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("currency")
                    @ExcludeMissing
                    currency: JsonField<String> = JsonMissing.of(),
                ) : this(amount, currency, mutableMapOf())

                /**
                 * The amount in minor units of the `currency` field. The amount is positive if it
                 * is added to the amount (such as an ATM surcharge fee) and negative if it is
                 * subtracted from the amount (such as a discount).
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun amount(): Long = amount.getRequired("amount")

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the additional
                 * amount's currency.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun currency(): String = currency.getRequired("currency")

                /**
                 * Returns the raw JSON value of [amount].
                 *
                 * Unlike [amount], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

                /**
                 * Returns the raw JSON value of [currency].
                 *
                 * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun _currency(): JsonField<String> = currency

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
                     * Returns a mutable builder for constructing an instance of [Vision].
                     *
                     * The following fields are required:
                     * ```java
                     * .amount()
                     * .currency()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Vision]. */
                class Builder internal constructor() {

                    private var amount: JsonField<Long>? = null
                    private var currency: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(vision: Vision) = apply {
                        amount = vision.amount
                        currency = vision.currency
                        additionalProperties = vision.additionalProperties.toMutableMap()
                    }

                    /**
                     * The amount in minor units of the `currency` field. The amount is positive if
                     * it is added to the amount (such as an ATM surcharge fee) and negative if it
                     * is subtracted from the amount (such as a discount).
                     */
                    fun amount(amount: Long) = amount(JsonField.of(amount))

                    /**
                     * Sets [Builder.amount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.amount] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                     * additional amount's currency.
                     */
                    fun currency(currency: String) = currency(JsonField.of(currency))

                    /**
                     * Sets [Builder.currency] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.currency] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun currency(currency: JsonField<String>) = apply { this.currency = currency }

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
                     * Returns an immutable instance of [Vision].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .amount()
                     * .currency()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Vision =
                        Vision(
                            checkRequired("amount", amount),
                            checkRequired("currency", currency),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Vision = apply {
                    if (validated) {
                        return@apply
                    }

                    amount()
                    currency()
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
                    (if (amount.asKnown().isPresent) 1 else 0) +
                        (if (currency.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Vision &&
                        amount == other.amount &&
                        currency == other.currency &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(amount, currency, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Vision{amount=$amount, currency=$currency, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is AdditionalAmounts &&
                    clinic == other.clinic &&
                    dental == other.dental &&
                    prescription == other.prescription &&
                    surcharge == other.surcharge &&
                    totalCumulative == other.totalCumulative &&
                    totalHealthcare == other.totalHealthcare &&
                    transit == other.transit &&
                    unknown == other.unknown &&
                    vision == other.vision &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    clinic,
                    dental,
                    prescription,
                    surcharge,
                    totalCumulative,
                    totalHealthcare,
                    transit,
                    unknown,
                    vision,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AdditionalAmounts{clinic=$clinic, dental=$dental, prescription=$prescription, surcharge=$surcharge, totalCumulative=$totalCumulative, totalHealthcare=$totalHealthcare, transit=$transit, unknown=$unknown, vision=$vision, additionalProperties=$additionalProperties}"
        }

        /** Whether or not the authorization was approved. */
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

                return other is Decision && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * Present if and only if `decision` is `decline`. Contains information related to the
         * reason the authorization was declined.
         */
        class Decline
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val reason: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("reason") @ExcludeMissing reason: JsonField<String> = JsonMissing.of()
            ) : this(reason, mutableMapOf())

            /**
             * The reason the authorization was declined.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun reason(): String = reason.getRequired("reason")

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

                /**
                 * Returns a mutable builder for constructing an instance of [Decline].
                 *
                 * The following fields are required:
                 * ```java
                 * .reason()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Decline]. */
            class Builder internal constructor() {

                private var reason: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(decline: Decline) = apply {
                    reason = decline.reason
                    additionalProperties = decline.additionalProperties.toMutableMap()
                }

                /** The reason the authorization was declined. */
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
                 *
                 * The following fields are required:
                 * ```java
                 * .reason()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Decline =
                    Decline(checkRequired("reason", reason), additionalProperties.toMutableMap())
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

                return other is Decline &&
                    reason == other.reason &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(reason, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Decline{reason=$reason, additionalProperties=$additionalProperties}"
        }

        /**
         * The direction describes the direction the funds will move, either from the cardholder to
         * the merchant or from the merchant to the cardholder.
         */
        class Direction @JsonCreator private constructor(private val value: JsonField<String>) :
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

                /** A regular card authorization where funds are debited from the cardholder. */
                @JvmField val SETTLEMENT = of("settlement")

                /**
                 * A refund card authorization, sometimes referred to as a credit voucher
                 * authorization, where funds are credited to the cardholder.
                 */
                @JvmField val REFUND = of("refund")

                @JvmStatic fun of(value: String) = Direction(JsonField.of(value))
            }

            /** An enum containing [Direction]'s known values. */
            enum class Known {
                /** A regular card authorization where funds are debited from the cardholder. */
                SETTLEMENT,
                /**
                 * A refund card authorization, sometimes referred to as a credit voucher
                 * authorization, where funds are credited to the cardholder.
                 */
                REFUND,
            }

            /**
             * An enum containing [Direction]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Direction] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /** A regular card authorization where funds are debited from the cardholder. */
                SETTLEMENT,
                /**
                 * A refund card authorization, sometimes referred to as a credit voucher
                 * authorization, where funds are credited to the cardholder.
                 */
                REFUND,
                /**
                 * An enum member indicating that [Direction] was instantiated with an unknown
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
                    SETTLEMENT -> Value.SETTLEMENT
                    REFUND -> Value.REFUND
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
                    SETTLEMENT -> Known.SETTLEMENT
                    REFUND -> Known.REFUND
                    else -> throw IncreaseInvalidDataException("Unknown Direction: $value")
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

            fun validate(): Direction = apply {
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

                return other is Direction && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Fields specific to the `network`. */
        class NetworkDetails
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val category: JsonField<Category>,
            private val pulse: JsonValue,
            private val visa: JsonField<Visa>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("category")
                @ExcludeMissing
                category: JsonField<Category> = JsonMissing.of(),
                @JsonProperty("pulse") @ExcludeMissing pulse: JsonValue = JsonMissing.of(),
                @JsonProperty("visa") @ExcludeMissing visa: JsonField<Visa> = JsonMissing.of(),
            ) : this(category, pulse, visa, mutableMapOf())

            /**
             * The payment network used to process this card authorization.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun category(): Category = category.getRequired("category")

            /** Fields specific to the `pulse` network. */
            @JsonProperty("pulse") @ExcludeMissing fun _pulse(): JsonValue = pulse

            /**
             * Fields specific to the `visa` network.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun visa(): Optional<Visa> = visa.getOptional("visa")

            /**
             * Returns the raw JSON value of [category].
             *
             * Unlike [category], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("category")
            @ExcludeMissing
            fun _category(): JsonField<Category> = category

            /**
             * Returns the raw JSON value of [visa].
             *
             * Unlike [visa], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("visa") @ExcludeMissing fun _visa(): JsonField<Visa> = visa

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
                 * Returns a mutable builder for constructing an instance of [NetworkDetails].
                 *
                 * The following fields are required:
                 * ```java
                 * .category()
                 * .pulse()
                 * .visa()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [NetworkDetails]. */
            class Builder internal constructor() {

                private var category: JsonField<Category>? = null
                private var pulse: JsonValue? = null
                private var visa: JsonField<Visa>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(networkDetails: NetworkDetails) = apply {
                    category = networkDetails.category
                    pulse = networkDetails.pulse
                    visa = networkDetails.visa
                    additionalProperties = networkDetails.additionalProperties.toMutableMap()
                }

                /** The payment network used to process this card authorization. */
                fun category(category: Category) = category(JsonField.of(category))

                /**
                 * Sets [Builder.category] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.category] with a well-typed [Category] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun category(category: JsonField<Category>) = apply { this.category = category }

                /** Fields specific to the `pulse` network. */
                fun pulse(pulse: JsonValue) = apply { this.pulse = pulse }

                /** Fields specific to the `visa` network. */
                fun visa(visa: Visa?) = visa(JsonField.ofNullable(visa))

                /** Alias for calling [Builder.visa] with `visa.orElse(null)`. */
                fun visa(visa: Optional<Visa>) = visa(visa.getOrNull())

                /**
                 * Sets [Builder.visa] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.visa] with a well-typed [Visa] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun visa(visa: JsonField<Visa>) = apply { this.visa = visa }

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
                 * Returns an immutable instance of [NetworkDetails].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .category()
                 * .pulse()
                 * .visa()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): NetworkDetails =
                    NetworkDetails(
                        checkRequired("category", category),
                        checkRequired("pulse", pulse),
                        checkRequired("visa", visa),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): NetworkDetails = apply {
                if (validated) {
                    return@apply
                }

                category().validate()
                visa().ifPresent { it.validate() }
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
                (category.asKnown().getOrNull()?.validity() ?: 0) +
                    (visa.asKnown().getOrNull()?.validity() ?: 0)

            /** The payment network used to process this card authorization. */
            class Category @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    /** Visa */
                    @JvmField val VISA = of("visa")

                    /** Pulse */
                    @JvmField val PULSE = of("pulse")

                    @JvmStatic fun of(value: String) = Category(JsonField.of(value))
                }

                /** An enum containing [Category]'s known values. */
                enum class Known {
                    /** Visa */
                    VISA,
                    /** Pulse */
                    PULSE,
                }

                /**
                 * An enum containing [Category]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Category] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    /** Visa */
                    VISA,
                    /** Pulse */
                    PULSE,
                    /**
                     * An enum member indicating that [Category] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        VISA -> Value.VISA
                        PULSE -> Value.PULSE
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws IncreaseInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        VISA -> Known.VISA
                        PULSE -> Known.PULSE
                        else -> throw IncreaseInvalidDataException("Unknown Category: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws IncreaseInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        IncreaseInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): Category = apply {
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

                    return other is Category && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** Fields specific to the `visa` network. */
            class Visa
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val electronicCommerceIndicator: JsonField<ElectronicCommerceIndicator>,
                private val pointOfServiceEntryMode: JsonField<PointOfServiceEntryMode>,
                private val standInProcessingReason: JsonField<StandInProcessingReason>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("electronic_commerce_indicator")
                    @ExcludeMissing
                    electronicCommerceIndicator: JsonField<ElectronicCommerceIndicator> =
                        JsonMissing.of(),
                    @JsonProperty("point_of_service_entry_mode")
                    @ExcludeMissing
                    pointOfServiceEntryMode: JsonField<PointOfServiceEntryMode> = JsonMissing.of(),
                    @JsonProperty("stand_in_processing_reason")
                    @ExcludeMissing
                    standInProcessingReason: JsonField<StandInProcessingReason> = JsonMissing.of(),
                ) : this(
                    electronicCommerceIndicator,
                    pointOfServiceEntryMode,
                    standInProcessingReason,
                    mutableMapOf(),
                )

                /**
                 * For electronic commerce transactions, this identifies the level of security used
                 * in obtaining the customer's payment credential. For mail or telephone order
                 * transactions, identifies the type of mail or telephone order.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun electronicCommerceIndicator(): Optional<ElectronicCommerceIndicator> =
                    electronicCommerceIndicator.getOptional("electronic_commerce_indicator")

                /**
                 * The method used to enter the cardholder's primary account number and card
                 * expiration date.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun pointOfServiceEntryMode(): Optional<PointOfServiceEntryMode> =
                    pointOfServiceEntryMode.getOptional("point_of_service_entry_mode")

                /**
                 * Only present when `actioner: network`. Describes why a card authorization was
                 * approved or declined by Visa through stand-in processing.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun standInProcessingReason(): Optional<StandInProcessingReason> =
                    standInProcessingReason.getOptional("stand_in_processing_reason")

                /**
                 * Returns the raw JSON value of [electronicCommerceIndicator].
                 *
                 * Unlike [electronicCommerceIndicator], this method doesn't throw if the JSON field
                 * has an unexpected type.
                 */
                @JsonProperty("electronic_commerce_indicator")
                @ExcludeMissing
                fun _electronicCommerceIndicator(): JsonField<ElectronicCommerceIndicator> =
                    electronicCommerceIndicator

                /**
                 * Returns the raw JSON value of [pointOfServiceEntryMode].
                 *
                 * Unlike [pointOfServiceEntryMode], this method doesn't throw if the JSON field has
                 * an unexpected type.
                 */
                @JsonProperty("point_of_service_entry_mode")
                @ExcludeMissing
                fun _pointOfServiceEntryMode(): JsonField<PointOfServiceEntryMode> =
                    pointOfServiceEntryMode

                /**
                 * Returns the raw JSON value of [standInProcessingReason].
                 *
                 * Unlike [standInProcessingReason], this method doesn't throw if the JSON field has
                 * an unexpected type.
                 */
                @JsonProperty("stand_in_processing_reason")
                @ExcludeMissing
                fun _standInProcessingReason(): JsonField<StandInProcessingReason> =
                    standInProcessingReason

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
                     * Returns a mutable builder for constructing an instance of [Visa].
                     *
                     * The following fields are required:
                     * ```java
                     * .electronicCommerceIndicator()
                     * .pointOfServiceEntryMode()
                     * .standInProcessingReason()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Visa]. */
                class Builder internal constructor() {

                    private var electronicCommerceIndicator:
                        JsonField<ElectronicCommerceIndicator>? =
                        null
                    private var pointOfServiceEntryMode: JsonField<PointOfServiceEntryMode>? = null
                    private var standInProcessingReason: JsonField<StandInProcessingReason>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(visa: Visa) = apply {
                        electronicCommerceIndicator = visa.electronicCommerceIndicator
                        pointOfServiceEntryMode = visa.pointOfServiceEntryMode
                        standInProcessingReason = visa.standInProcessingReason
                        additionalProperties = visa.additionalProperties.toMutableMap()
                    }

                    /**
                     * For electronic commerce transactions, this identifies the level of security
                     * used in obtaining the customer's payment credential. For mail or telephone
                     * order transactions, identifies the type of mail or telephone order.
                     */
                    fun electronicCommerceIndicator(
                        electronicCommerceIndicator: ElectronicCommerceIndicator?
                    ) =
                        electronicCommerceIndicator(
                            JsonField.ofNullable(electronicCommerceIndicator)
                        )

                    /**
                     * Alias for calling [Builder.electronicCommerceIndicator] with
                     * `electronicCommerceIndicator.orElse(null)`.
                     */
                    fun electronicCommerceIndicator(
                        electronicCommerceIndicator: Optional<ElectronicCommerceIndicator>
                    ) = electronicCommerceIndicator(electronicCommerceIndicator.getOrNull())

                    /**
                     * Sets [Builder.electronicCommerceIndicator] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.electronicCommerceIndicator] with a
                     * well-typed [ElectronicCommerceIndicator] value instead. This method is
                     * primarily for setting the field to an undocumented or not yet supported
                     * value.
                     */
                    fun electronicCommerceIndicator(
                        electronicCommerceIndicator: JsonField<ElectronicCommerceIndicator>
                    ) = apply { this.electronicCommerceIndicator = electronicCommerceIndicator }

                    /**
                     * The method used to enter the cardholder's primary account number and card
                     * expiration date.
                     */
                    fun pointOfServiceEntryMode(pointOfServiceEntryMode: PointOfServiceEntryMode?) =
                        pointOfServiceEntryMode(JsonField.ofNullable(pointOfServiceEntryMode))

                    /**
                     * Alias for calling [Builder.pointOfServiceEntryMode] with
                     * `pointOfServiceEntryMode.orElse(null)`.
                     */
                    fun pointOfServiceEntryMode(
                        pointOfServiceEntryMode: Optional<PointOfServiceEntryMode>
                    ) = pointOfServiceEntryMode(pointOfServiceEntryMode.getOrNull())

                    /**
                     * Sets [Builder.pointOfServiceEntryMode] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.pointOfServiceEntryMode] with a well-typed
                     * [PointOfServiceEntryMode] value instead. This method is primarily for setting
                     * the field to an undocumented or not yet supported value.
                     */
                    fun pointOfServiceEntryMode(
                        pointOfServiceEntryMode: JsonField<PointOfServiceEntryMode>
                    ) = apply { this.pointOfServiceEntryMode = pointOfServiceEntryMode }

                    /**
                     * Only present when `actioner: network`. Describes why a card authorization was
                     * approved or declined by Visa through stand-in processing.
                     */
                    fun standInProcessingReason(standInProcessingReason: StandInProcessingReason?) =
                        standInProcessingReason(JsonField.ofNullable(standInProcessingReason))

                    /**
                     * Alias for calling [Builder.standInProcessingReason] with
                     * `standInProcessingReason.orElse(null)`.
                     */
                    fun standInProcessingReason(
                        standInProcessingReason: Optional<StandInProcessingReason>
                    ) = standInProcessingReason(standInProcessingReason.getOrNull())

                    /**
                     * Sets [Builder.standInProcessingReason] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.standInProcessingReason] with a well-typed
                     * [StandInProcessingReason] value instead. This method is primarily for setting
                     * the field to an undocumented or not yet supported value.
                     */
                    fun standInProcessingReason(
                        standInProcessingReason: JsonField<StandInProcessingReason>
                    ) = apply { this.standInProcessingReason = standInProcessingReason }

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
                     * Returns an immutable instance of [Visa].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .electronicCommerceIndicator()
                     * .pointOfServiceEntryMode()
                     * .standInProcessingReason()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Visa =
                        Visa(
                            checkRequired(
                                "electronicCommerceIndicator",
                                electronicCommerceIndicator,
                            ),
                            checkRequired("pointOfServiceEntryMode", pointOfServiceEntryMode),
                            checkRequired("standInProcessingReason", standInProcessingReason),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Visa = apply {
                    if (validated) {
                        return@apply
                    }

                    electronicCommerceIndicator().ifPresent { it.validate() }
                    pointOfServiceEntryMode().ifPresent { it.validate() }
                    standInProcessingReason().ifPresent { it.validate() }
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
                    (electronicCommerceIndicator.asKnown().getOrNull()?.validity() ?: 0) +
                        (pointOfServiceEntryMode.asKnown().getOrNull()?.validity() ?: 0) +
                        (standInProcessingReason.asKnown().getOrNull()?.validity() ?: 0)

                /**
                 * For electronic commerce transactions, this identifies the level of security used
                 * in obtaining the customer's payment credential. For mail or telephone order
                 * transactions, identifies the type of mail or telephone order.
                 */
                class ElectronicCommerceIndicator
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        /**
                         * Single transaction of a mail/phone order: Use to indicate that the
                         * transaction is a mail/phone order purchase, not a recurring transaction
                         * or installment payment. For domestic transactions in the US region, this
                         * value may also indicate one bill payment transaction in the card-present
                         * or card-absent environments.
                         */
                        @JvmField val MAIL_PHONE_ORDER = of("mail_phone_order")

                        /**
                         * Recurring transaction: Payment indicator used to indicate a recurring
                         * transaction that originates from an acquirer in the US region.
                         */
                        @JvmField val RECURRING = of("recurring")

                        /**
                         * Installment payment: Payment indicator used to indicate one purchase of
                         * goods or services that is billed to the account in multiple charges over
                         * a period of time agreed upon by the cardholder and merchant from
                         * transactions that originate from an acquirer in the US region.
                         */
                        @JvmField val INSTALLMENT = of("installment")

                        /**
                         * Unknown classification: other mail order: Use to indicate that the type
                         * of mail/telephone order is unknown.
                         */
                        @JvmField val UNKNOWN_MAIL_PHONE_ORDER = of("unknown_mail_phone_order")

                        /**
                         * Secure electronic commerce transaction: Use to indicate that the
                         * electronic commerce transaction has been authenticated using e.g., 3-D
                         * Secure
                         */
                        @JvmField val SECURE_ELECTRONIC_COMMERCE = of("secure_electronic_commerce")

                        /**
                         * Non-authenticated security transaction at a 3-D Secure-capable merchant,
                         * and merchant attempted to authenticate the cardholder using 3-D Secure:
                         * Use to identify an electronic commerce transaction where the merchant
                         * attempted to authenticate the cardholder using 3-D Secure, but was unable
                         * to complete the authentication because the issuer or cardholder does not
                         * participate in the 3-D Secure program.
                         */
                        @JvmField
                        val NON_AUTHENTICATED_SECURITY_TRANSACTION_AT_3DS_CAPABLE_MERCHANT =
                            of("non_authenticated_security_transaction_at_3ds_capable_merchant")

                        /**
                         * Non-authenticated security transaction: Use to identify an electronic
                         * commerce transaction that uses data encryption for security however,
                         * cardholder authentication is not performed using 3-D Secure.
                         */
                        @JvmField
                        val NON_AUTHENTICATED_SECURITY_TRANSACTION =
                            of("non_authenticated_security_transaction")

                        /**
                         * Non-secure transaction: Use to identify an electronic commerce
                         * transaction that has no data protection.
                         */
                        @JvmField val NON_SECURE_TRANSACTION = of("non_secure_transaction")

                        @JvmStatic
                        fun of(value: String) = ElectronicCommerceIndicator(JsonField.of(value))
                    }

                    /** An enum containing [ElectronicCommerceIndicator]'s known values. */
                    enum class Known {
                        /**
                         * Single transaction of a mail/phone order: Use to indicate that the
                         * transaction is a mail/phone order purchase, not a recurring transaction
                         * or installment payment. For domestic transactions in the US region, this
                         * value may also indicate one bill payment transaction in the card-present
                         * or card-absent environments.
                         */
                        MAIL_PHONE_ORDER,
                        /**
                         * Recurring transaction: Payment indicator used to indicate a recurring
                         * transaction that originates from an acquirer in the US region.
                         */
                        RECURRING,
                        /**
                         * Installment payment: Payment indicator used to indicate one purchase of
                         * goods or services that is billed to the account in multiple charges over
                         * a period of time agreed upon by the cardholder and merchant from
                         * transactions that originate from an acquirer in the US region.
                         */
                        INSTALLMENT,
                        /**
                         * Unknown classification: other mail order: Use to indicate that the type
                         * of mail/telephone order is unknown.
                         */
                        UNKNOWN_MAIL_PHONE_ORDER,
                        /**
                         * Secure electronic commerce transaction: Use to indicate that the
                         * electronic commerce transaction has been authenticated using e.g., 3-D
                         * Secure
                         */
                        SECURE_ELECTRONIC_COMMERCE,
                        /**
                         * Non-authenticated security transaction at a 3-D Secure-capable merchant,
                         * and merchant attempted to authenticate the cardholder using 3-D Secure:
                         * Use to identify an electronic commerce transaction where the merchant
                         * attempted to authenticate the cardholder using 3-D Secure, but was unable
                         * to complete the authentication because the issuer or cardholder does not
                         * participate in the 3-D Secure program.
                         */
                        NON_AUTHENTICATED_SECURITY_TRANSACTION_AT_3DS_CAPABLE_MERCHANT,
                        /**
                         * Non-authenticated security transaction: Use to identify an electronic
                         * commerce transaction that uses data encryption for security however,
                         * cardholder authentication is not performed using 3-D Secure.
                         */
                        NON_AUTHENTICATED_SECURITY_TRANSACTION,
                        /**
                         * Non-secure transaction: Use to identify an electronic commerce
                         * transaction that has no data protection.
                         */
                        NON_SECURE_TRANSACTION,
                    }

                    /**
                     * An enum containing [ElectronicCommerceIndicator]'s known values, as well as
                     * an [_UNKNOWN] member.
                     *
                     * An instance of [ElectronicCommerceIndicator] can contain an unknown value in
                     * a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        /**
                         * Single transaction of a mail/phone order: Use to indicate that the
                         * transaction is a mail/phone order purchase, not a recurring transaction
                         * or installment payment. For domestic transactions in the US region, this
                         * value may also indicate one bill payment transaction in the card-present
                         * or card-absent environments.
                         */
                        MAIL_PHONE_ORDER,
                        /**
                         * Recurring transaction: Payment indicator used to indicate a recurring
                         * transaction that originates from an acquirer in the US region.
                         */
                        RECURRING,
                        /**
                         * Installment payment: Payment indicator used to indicate one purchase of
                         * goods or services that is billed to the account in multiple charges over
                         * a period of time agreed upon by the cardholder and merchant from
                         * transactions that originate from an acquirer in the US region.
                         */
                        INSTALLMENT,
                        /**
                         * Unknown classification: other mail order: Use to indicate that the type
                         * of mail/telephone order is unknown.
                         */
                        UNKNOWN_MAIL_PHONE_ORDER,
                        /**
                         * Secure electronic commerce transaction: Use to indicate that the
                         * electronic commerce transaction has been authenticated using e.g., 3-D
                         * Secure
                         */
                        SECURE_ELECTRONIC_COMMERCE,
                        /**
                         * Non-authenticated security transaction at a 3-D Secure-capable merchant,
                         * and merchant attempted to authenticate the cardholder using 3-D Secure:
                         * Use to identify an electronic commerce transaction where the merchant
                         * attempted to authenticate the cardholder using 3-D Secure, but was unable
                         * to complete the authentication because the issuer or cardholder does not
                         * participate in the 3-D Secure program.
                         */
                        NON_AUTHENTICATED_SECURITY_TRANSACTION_AT_3DS_CAPABLE_MERCHANT,
                        /**
                         * Non-authenticated security transaction: Use to identify an electronic
                         * commerce transaction that uses data encryption for security however,
                         * cardholder authentication is not performed using 3-D Secure.
                         */
                        NON_AUTHENTICATED_SECURITY_TRANSACTION,
                        /**
                         * Non-secure transaction: Use to identify an electronic commerce
                         * transaction that has no data protection.
                         */
                        NON_SECURE_TRANSACTION,
                        /**
                         * An enum member indicating that [ElectronicCommerceIndicator] was
                         * instantiated with an unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            MAIL_PHONE_ORDER -> Value.MAIL_PHONE_ORDER
                            RECURRING -> Value.RECURRING
                            INSTALLMENT -> Value.INSTALLMENT
                            UNKNOWN_MAIL_PHONE_ORDER -> Value.UNKNOWN_MAIL_PHONE_ORDER
                            SECURE_ELECTRONIC_COMMERCE -> Value.SECURE_ELECTRONIC_COMMERCE
                            NON_AUTHENTICATED_SECURITY_TRANSACTION_AT_3DS_CAPABLE_MERCHANT ->
                                Value.NON_AUTHENTICATED_SECURITY_TRANSACTION_AT_3DS_CAPABLE_MERCHANT
                            NON_AUTHENTICATED_SECURITY_TRANSACTION ->
                                Value.NON_AUTHENTICATED_SECURITY_TRANSACTION
                            NON_SECURE_TRANSACTION -> Value.NON_SECURE_TRANSACTION
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws IncreaseInvalidDataException if this class instance's value is a not
                     *   a known member.
                     */
                    fun known(): Known =
                        when (this) {
                            MAIL_PHONE_ORDER -> Known.MAIL_PHONE_ORDER
                            RECURRING -> Known.RECURRING
                            INSTALLMENT -> Known.INSTALLMENT
                            UNKNOWN_MAIL_PHONE_ORDER -> Known.UNKNOWN_MAIL_PHONE_ORDER
                            SECURE_ELECTRONIC_COMMERCE -> Known.SECURE_ELECTRONIC_COMMERCE
                            NON_AUTHENTICATED_SECURITY_TRANSACTION_AT_3DS_CAPABLE_MERCHANT ->
                                Known.NON_AUTHENTICATED_SECURITY_TRANSACTION_AT_3DS_CAPABLE_MERCHANT
                            NON_AUTHENTICATED_SECURITY_TRANSACTION ->
                                Known.NON_AUTHENTICATED_SECURITY_TRANSACTION
                            NON_SECURE_TRANSACTION -> Known.NON_SECURE_TRANSACTION
                            else ->
                                throw IncreaseInvalidDataException(
                                    "Unknown ElectronicCommerceIndicator: $value"
                                )
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws IncreaseInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            IncreaseInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    fun validate(): ElectronicCommerceIndicator = apply {
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is ElectronicCommerceIndicator && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                /**
                 * The method used to enter the cardholder's primary account number and card
                 * expiration date.
                 */
                class PointOfServiceEntryMode
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        /** Unknown */
                        @JvmField val UNKNOWN = of("unknown")

                        /** Manual key entry */
                        @JvmField val MANUAL = of("manual")

                        /** Magnetic stripe read, without card verification value */
                        @JvmField val MAGNETIC_STRIPE_NO_CVV = of("magnetic_stripe_no_cvv")

                        /** Optical code */
                        @JvmField val OPTICAL_CODE = of("optical_code")

                        /** Contact chip card */
                        @JvmField val INTEGRATED_CIRCUIT_CARD = of("integrated_circuit_card")

                        /** Contactless read of chip card */
                        @JvmField val CONTACTLESS = of("contactless")

                        /**
                         * Transaction initiated using a credential that has previously been stored
                         * on file
                         */
                        @JvmField val CREDENTIAL_ON_FILE = of("credential_on_file")

                        /** Magnetic stripe read */
                        @JvmField val MAGNETIC_STRIPE = of("magnetic_stripe")

                        /** Contactless read of magnetic stripe data */
                        @JvmField
                        val CONTACTLESS_MAGNETIC_STRIPE = of("contactless_magnetic_stripe")

                        /** Contact chip card, without card verification value */
                        @JvmField
                        val INTEGRATED_CIRCUIT_CARD_NO_CVV = of("integrated_circuit_card_no_cvv")

                        @JvmStatic
                        fun of(value: String) = PointOfServiceEntryMode(JsonField.of(value))
                    }

                    /** An enum containing [PointOfServiceEntryMode]'s known values. */
                    enum class Known {
                        /** Unknown */
                        UNKNOWN,
                        /** Manual key entry */
                        MANUAL,
                        /** Magnetic stripe read, without card verification value */
                        MAGNETIC_STRIPE_NO_CVV,
                        /** Optical code */
                        OPTICAL_CODE,
                        /** Contact chip card */
                        INTEGRATED_CIRCUIT_CARD,
                        /** Contactless read of chip card */
                        CONTACTLESS,
                        /**
                         * Transaction initiated using a credential that has previously been stored
                         * on file
                         */
                        CREDENTIAL_ON_FILE,
                        /** Magnetic stripe read */
                        MAGNETIC_STRIPE,
                        /** Contactless read of magnetic stripe data */
                        CONTACTLESS_MAGNETIC_STRIPE,
                        /** Contact chip card, without card verification value */
                        INTEGRATED_CIRCUIT_CARD_NO_CVV,
                    }

                    /**
                     * An enum containing [PointOfServiceEntryMode]'s known values, as well as an
                     * [_UNKNOWN] member.
                     *
                     * An instance of [PointOfServiceEntryMode] can contain an unknown value in a
                     * couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        /** Unknown */
                        UNKNOWN,
                        /** Manual key entry */
                        MANUAL,
                        /** Magnetic stripe read, without card verification value */
                        MAGNETIC_STRIPE_NO_CVV,
                        /** Optical code */
                        OPTICAL_CODE,
                        /** Contact chip card */
                        INTEGRATED_CIRCUIT_CARD,
                        /** Contactless read of chip card */
                        CONTACTLESS,
                        /**
                         * Transaction initiated using a credential that has previously been stored
                         * on file
                         */
                        CREDENTIAL_ON_FILE,
                        /** Magnetic stripe read */
                        MAGNETIC_STRIPE,
                        /** Contactless read of magnetic stripe data */
                        CONTACTLESS_MAGNETIC_STRIPE,
                        /** Contact chip card, without card verification value */
                        INTEGRATED_CIRCUIT_CARD_NO_CVV,
                        /**
                         * An enum member indicating that [PointOfServiceEntryMode] was instantiated
                         * with an unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            UNKNOWN -> Value.UNKNOWN
                            MANUAL -> Value.MANUAL
                            MAGNETIC_STRIPE_NO_CVV -> Value.MAGNETIC_STRIPE_NO_CVV
                            OPTICAL_CODE -> Value.OPTICAL_CODE
                            INTEGRATED_CIRCUIT_CARD -> Value.INTEGRATED_CIRCUIT_CARD
                            CONTACTLESS -> Value.CONTACTLESS
                            CREDENTIAL_ON_FILE -> Value.CREDENTIAL_ON_FILE
                            MAGNETIC_STRIPE -> Value.MAGNETIC_STRIPE
                            CONTACTLESS_MAGNETIC_STRIPE -> Value.CONTACTLESS_MAGNETIC_STRIPE
                            INTEGRATED_CIRCUIT_CARD_NO_CVV -> Value.INTEGRATED_CIRCUIT_CARD_NO_CVV
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws IncreaseInvalidDataException if this class instance's value is a not
                     *   a known member.
                     */
                    fun known(): Known =
                        when (this) {
                            UNKNOWN -> Known.UNKNOWN
                            MANUAL -> Known.MANUAL
                            MAGNETIC_STRIPE_NO_CVV -> Known.MAGNETIC_STRIPE_NO_CVV
                            OPTICAL_CODE -> Known.OPTICAL_CODE
                            INTEGRATED_CIRCUIT_CARD -> Known.INTEGRATED_CIRCUIT_CARD
                            CONTACTLESS -> Known.CONTACTLESS
                            CREDENTIAL_ON_FILE -> Known.CREDENTIAL_ON_FILE
                            MAGNETIC_STRIPE -> Known.MAGNETIC_STRIPE
                            CONTACTLESS_MAGNETIC_STRIPE -> Known.CONTACTLESS_MAGNETIC_STRIPE
                            INTEGRATED_CIRCUIT_CARD_NO_CVV -> Known.INTEGRATED_CIRCUIT_CARD_NO_CVV
                            else ->
                                throw IncreaseInvalidDataException(
                                    "Unknown PointOfServiceEntryMode: $value"
                                )
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws IncreaseInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            IncreaseInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    fun validate(): PointOfServiceEntryMode = apply {
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is PointOfServiceEntryMode && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                /**
                 * Only present when `actioner: network`. Describes why a card authorization was
                 * approved or declined by Visa through stand-in processing.
                 */
                class StandInProcessingReason
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        /** Increase failed to process the authorization in a timely manner. */
                        @JvmField val ISSUER_ERROR = of("issuer_error")

                        /**
                         * The physical card read had an invalid CVV, dCVV, or authorization request
                         * cryptogram.
                         */
                        @JvmField val INVALID_PHYSICAL_CARD = of("invalid_physical_card")

                        /** The 3DS cardholder authentication verification value was invalid. */
                        @JvmField
                        val INVALID_CARDHOLDER_AUTHENTICATION_VERIFICATION_VALUE =
                            of("invalid_cardholder_authentication_verification_value")

                        /**
                         * An internal Visa error occurred. Visa uses this reason code for certain
                         * expected occurrences as well, such as Application Transaction Counter
                         * (ATC) replays.
                         */
                        @JvmField val INTERNAL_VISA_ERROR = of("internal_visa_error")

                        /**
                         * The merchant has enabled Visa's Transaction Advisory Service and requires
                         * further authentication to perform the transaction. In practice this is
                         * often utilized at fuel pumps to tell the cardholder to see the cashier.
                         */
                        @JvmField
                        val MERCHANT_TRANSACTION_ADVISORY_SERVICE_AUTHENTICATION_REQUIRED =
                            of("merchant_transaction_advisory_service_authentication_required")

                        /**
                         * The transaction was blocked by Visa's Payment Fraud Disruption service
                         * due to fraudulent Acquirer behavior, such as card testing.
                         */
                        @JvmField
                        val PAYMENT_FRAUD_DISRUPTION_ACQUIRER_BLOCK =
                            of("payment_fraud_disruption_acquirer_block")

                        /** An unspecific reason for stand-in processing. */
                        @JvmField val OTHER = of("other")

                        @JvmStatic
                        fun of(value: String) = StandInProcessingReason(JsonField.of(value))
                    }

                    /** An enum containing [StandInProcessingReason]'s known values. */
                    enum class Known {
                        /** Increase failed to process the authorization in a timely manner. */
                        ISSUER_ERROR,
                        /**
                         * The physical card read had an invalid CVV, dCVV, or authorization request
                         * cryptogram.
                         */
                        INVALID_PHYSICAL_CARD,
                        /** The 3DS cardholder authentication verification value was invalid. */
                        INVALID_CARDHOLDER_AUTHENTICATION_VERIFICATION_VALUE,
                        /**
                         * An internal Visa error occurred. Visa uses this reason code for certain
                         * expected occurrences as well, such as Application Transaction Counter
                         * (ATC) replays.
                         */
                        INTERNAL_VISA_ERROR,
                        /**
                         * The merchant has enabled Visa's Transaction Advisory Service and requires
                         * further authentication to perform the transaction. In practice this is
                         * often utilized at fuel pumps to tell the cardholder to see the cashier.
                         */
                        MERCHANT_TRANSACTION_ADVISORY_SERVICE_AUTHENTICATION_REQUIRED,
                        /**
                         * The transaction was blocked by Visa's Payment Fraud Disruption service
                         * due to fraudulent Acquirer behavior, such as card testing.
                         */
                        PAYMENT_FRAUD_DISRUPTION_ACQUIRER_BLOCK,
                        /** An unspecific reason for stand-in processing. */
                        OTHER,
                    }

                    /**
                     * An enum containing [StandInProcessingReason]'s known values, as well as an
                     * [_UNKNOWN] member.
                     *
                     * An instance of [StandInProcessingReason] can contain an unknown value in a
                     * couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        /** Increase failed to process the authorization in a timely manner. */
                        ISSUER_ERROR,
                        /**
                         * The physical card read had an invalid CVV, dCVV, or authorization request
                         * cryptogram.
                         */
                        INVALID_PHYSICAL_CARD,
                        /** The 3DS cardholder authentication verification value was invalid. */
                        INVALID_CARDHOLDER_AUTHENTICATION_VERIFICATION_VALUE,
                        /**
                         * An internal Visa error occurred. Visa uses this reason code for certain
                         * expected occurrences as well, such as Application Transaction Counter
                         * (ATC) replays.
                         */
                        INTERNAL_VISA_ERROR,
                        /**
                         * The merchant has enabled Visa's Transaction Advisory Service and requires
                         * further authentication to perform the transaction. In practice this is
                         * often utilized at fuel pumps to tell the cardholder to see the cashier.
                         */
                        MERCHANT_TRANSACTION_ADVISORY_SERVICE_AUTHENTICATION_REQUIRED,
                        /**
                         * The transaction was blocked by Visa's Payment Fraud Disruption service
                         * due to fraudulent Acquirer behavior, such as card testing.
                         */
                        PAYMENT_FRAUD_DISRUPTION_ACQUIRER_BLOCK,
                        /** An unspecific reason for stand-in processing. */
                        OTHER,
                        /**
                         * An enum member indicating that [StandInProcessingReason] was instantiated
                         * with an unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            ISSUER_ERROR -> Value.ISSUER_ERROR
                            INVALID_PHYSICAL_CARD -> Value.INVALID_PHYSICAL_CARD
                            INVALID_CARDHOLDER_AUTHENTICATION_VERIFICATION_VALUE ->
                                Value.INVALID_CARDHOLDER_AUTHENTICATION_VERIFICATION_VALUE
                            INTERNAL_VISA_ERROR -> Value.INTERNAL_VISA_ERROR
                            MERCHANT_TRANSACTION_ADVISORY_SERVICE_AUTHENTICATION_REQUIRED ->
                                Value.MERCHANT_TRANSACTION_ADVISORY_SERVICE_AUTHENTICATION_REQUIRED
                            PAYMENT_FRAUD_DISRUPTION_ACQUIRER_BLOCK ->
                                Value.PAYMENT_FRAUD_DISRUPTION_ACQUIRER_BLOCK
                            OTHER -> Value.OTHER
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws IncreaseInvalidDataException if this class instance's value is a not
                     *   a known member.
                     */
                    fun known(): Known =
                        when (this) {
                            ISSUER_ERROR -> Known.ISSUER_ERROR
                            INVALID_PHYSICAL_CARD -> Known.INVALID_PHYSICAL_CARD
                            INVALID_CARDHOLDER_AUTHENTICATION_VERIFICATION_VALUE ->
                                Known.INVALID_CARDHOLDER_AUTHENTICATION_VERIFICATION_VALUE
                            INTERNAL_VISA_ERROR -> Known.INTERNAL_VISA_ERROR
                            MERCHANT_TRANSACTION_ADVISORY_SERVICE_AUTHENTICATION_REQUIRED ->
                                Known.MERCHANT_TRANSACTION_ADVISORY_SERVICE_AUTHENTICATION_REQUIRED
                            PAYMENT_FRAUD_DISRUPTION_ACQUIRER_BLOCK ->
                                Known.PAYMENT_FRAUD_DISRUPTION_ACQUIRER_BLOCK
                            OTHER -> Known.OTHER
                            else ->
                                throw IncreaseInvalidDataException(
                                    "Unknown StandInProcessingReason: $value"
                                )
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws IncreaseInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            IncreaseInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    fun validate(): StandInProcessingReason = apply {
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is StandInProcessingReason && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Visa &&
                        electronicCommerceIndicator == other.electronicCommerceIndicator &&
                        pointOfServiceEntryMode == other.pointOfServiceEntryMode &&
                        standInProcessingReason == other.standInProcessingReason &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        electronicCommerceIndicator,
                        pointOfServiceEntryMode,
                        standInProcessingReason,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Visa{electronicCommerceIndicator=$electronicCommerceIndicator, pointOfServiceEntryMode=$pointOfServiceEntryMode, standInProcessingReason=$standInProcessingReason, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is NetworkDetails &&
                    category == other.category &&
                    pulse == other.pulse &&
                    visa == other.visa &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(category, pulse, visa, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "NetworkDetails{category=$category, pulse=$pulse, visa=$visa, additionalProperties=$additionalProperties}"
        }

        /** Network-specific identifiers for a specific request or transaction. */
        class NetworkIdentifiers
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val authorizationIdentificationResponse: JsonField<String>,
            private val retrievalReferenceNumber: JsonField<String>,
            private val traceNumber: JsonField<String>,
            private val transactionId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("authorization_identification_response")
                @ExcludeMissing
                authorizationIdentificationResponse: JsonField<String> = JsonMissing.of(),
                @JsonProperty("retrieval_reference_number")
                @ExcludeMissing
                retrievalReferenceNumber: JsonField<String> = JsonMissing.of(),
                @JsonProperty("trace_number")
                @ExcludeMissing
                traceNumber: JsonField<String> = JsonMissing.of(),
                @JsonProperty("transaction_id")
                @ExcludeMissing
                transactionId: JsonField<String> = JsonMissing.of(),
            ) : this(
                authorizationIdentificationResponse,
                retrievalReferenceNumber,
                traceNumber,
                transactionId,
                mutableMapOf(),
            )

            /**
             * The randomly generated 6-character Authorization Identification Response code sent
             * back to the acquirer in an approved response.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun authorizationIdentificationResponse(): Optional<String> =
                authorizationIdentificationResponse.getOptional(
                    "authorization_identification_response"
                )

            /**
             * A life-cycle identifier used across e.g., an authorization and a reversal. Expected
             * to be unique per acquirer within a window of time. For some card networks the
             * retrieval reference number includes the trace counter.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun retrievalReferenceNumber(): Optional<String> =
                retrievalReferenceNumber.getOptional("retrieval_reference_number")

            /**
             * A counter used to verify an individual authorization. Expected to be unique per
             * acquirer within a window of time.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun traceNumber(): Optional<String> = traceNumber.getOptional("trace_number")

            /**
             * A globally unique transaction identifier provided by the card network, used across
             * multiple life-cycle requests.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun transactionId(): Optional<String> = transactionId.getOptional("transaction_id")

            /**
             * Returns the raw JSON value of [authorizationIdentificationResponse].
             *
             * Unlike [authorizationIdentificationResponse], this method doesn't throw if the JSON
             * field has an unexpected type.
             */
            @JsonProperty("authorization_identification_response")
            @ExcludeMissing
            fun _authorizationIdentificationResponse(): JsonField<String> =
                authorizationIdentificationResponse

            /**
             * Returns the raw JSON value of [retrievalReferenceNumber].
             *
             * Unlike [retrievalReferenceNumber], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("retrieval_reference_number")
            @ExcludeMissing
            fun _retrievalReferenceNumber(): JsonField<String> = retrievalReferenceNumber

            /**
             * Returns the raw JSON value of [traceNumber].
             *
             * Unlike [traceNumber], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("trace_number")
            @ExcludeMissing
            fun _traceNumber(): JsonField<String> = traceNumber

            /**
             * Returns the raw JSON value of [transactionId].
             *
             * Unlike [transactionId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("transaction_id")
            @ExcludeMissing
            fun _transactionId(): JsonField<String> = transactionId

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
                 * Returns a mutable builder for constructing an instance of [NetworkIdentifiers].
                 *
                 * The following fields are required:
                 * ```java
                 * .authorizationIdentificationResponse()
                 * .retrievalReferenceNumber()
                 * .traceNumber()
                 * .transactionId()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [NetworkIdentifiers]. */
            class Builder internal constructor() {

                private var authorizationIdentificationResponse: JsonField<String>? = null
                private var retrievalReferenceNumber: JsonField<String>? = null
                private var traceNumber: JsonField<String>? = null
                private var transactionId: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(networkIdentifiers: NetworkIdentifiers) = apply {
                    authorizationIdentificationResponse =
                        networkIdentifiers.authorizationIdentificationResponse
                    retrievalReferenceNumber = networkIdentifiers.retrievalReferenceNumber
                    traceNumber = networkIdentifiers.traceNumber
                    transactionId = networkIdentifiers.transactionId
                    additionalProperties = networkIdentifiers.additionalProperties.toMutableMap()
                }

                /**
                 * The randomly generated 6-character Authorization Identification Response code
                 * sent back to the acquirer in an approved response.
                 */
                fun authorizationIdentificationResponse(
                    authorizationIdentificationResponse: String?
                ) =
                    authorizationIdentificationResponse(
                        JsonField.ofNullable(authorizationIdentificationResponse)
                    )

                /**
                 * Alias for calling [Builder.authorizationIdentificationResponse] with
                 * `authorizationIdentificationResponse.orElse(null)`.
                 */
                fun authorizationIdentificationResponse(
                    authorizationIdentificationResponse: Optional<String>
                ) =
                    authorizationIdentificationResponse(
                        authorizationIdentificationResponse.getOrNull()
                    )

                /**
                 * Sets [Builder.authorizationIdentificationResponse] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.authorizationIdentificationResponse] with a
                 * well-typed [String] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun authorizationIdentificationResponse(
                    authorizationIdentificationResponse: JsonField<String>
                ) = apply {
                    this.authorizationIdentificationResponse = authorizationIdentificationResponse
                }

                /**
                 * A life-cycle identifier used across e.g., an authorization and a reversal.
                 * Expected to be unique per acquirer within a window of time. For some card
                 * networks the retrieval reference number includes the trace counter.
                 */
                fun retrievalReferenceNumber(retrievalReferenceNumber: String?) =
                    retrievalReferenceNumber(JsonField.ofNullable(retrievalReferenceNumber))

                /**
                 * Alias for calling [Builder.retrievalReferenceNumber] with
                 * `retrievalReferenceNumber.orElse(null)`.
                 */
                fun retrievalReferenceNumber(retrievalReferenceNumber: Optional<String>) =
                    retrievalReferenceNumber(retrievalReferenceNumber.getOrNull())

                /**
                 * Sets [Builder.retrievalReferenceNumber] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.retrievalReferenceNumber] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun retrievalReferenceNumber(retrievalReferenceNumber: JsonField<String>) = apply {
                    this.retrievalReferenceNumber = retrievalReferenceNumber
                }

                /**
                 * A counter used to verify an individual authorization. Expected to be unique per
                 * acquirer within a window of time.
                 */
                fun traceNumber(traceNumber: String?) =
                    traceNumber(JsonField.ofNullable(traceNumber))

                /** Alias for calling [Builder.traceNumber] with `traceNumber.orElse(null)`. */
                fun traceNumber(traceNumber: Optional<String>) =
                    traceNumber(traceNumber.getOrNull())

                /**
                 * Sets [Builder.traceNumber] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.traceNumber] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun traceNumber(traceNumber: JsonField<String>) = apply {
                    this.traceNumber = traceNumber
                }

                /**
                 * A globally unique transaction identifier provided by the card network, used
                 * across multiple life-cycle requests.
                 */
                fun transactionId(transactionId: String?) =
                    transactionId(JsonField.ofNullable(transactionId))

                /** Alias for calling [Builder.transactionId] with `transactionId.orElse(null)`. */
                fun transactionId(transactionId: Optional<String>) =
                    transactionId(transactionId.getOrNull())

                /**
                 * Sets [Builder.transactionId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.transactionId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun transactionId(transactionId: JsonField<String>) = apply {
                    this.transactionId = transactionId
                }

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
                 * Returns an immutable instance of [NetworkIdentifiers].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .authorizationIdentificationResponse()
                 * .retrievalReferenceNumber()
                 * .traceNumber()
                 * .transactionId()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): NetworkIdentifiers =
                    NetworkIdentifiers(
                        checkRequired(
                            "authorizationIdentificationResponse",
                            authorizationIdentificationResponse,
                        ),
                        checkRequired("retrievalReferenceNumber", retrievalReferenceNumber),
                        checkRequired("traceNumber", traceNumber),
                        checkRequired("transactionId", transactionId),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): NetworkIdentifiers = apply {
                if (validated) {
                    return@apply
                }

                authorizationIdentificationResponse()
                retrievalReferenceNumber()
                traceNumber()
                transactionId()
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
                (if (authorizationIdentificationResponse.asKnown().isPresent) 1 else 0) +
                    (if (retrievalReferenceNumber.asKnown().isPresent) 1 else 0) +
                    (if (traceNumber.asKnown().isPresent) 1 else 0) +
                    (if (transactionId.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is NetworkIdentifiers &&
                    authorizationIdentificationResponse ==
                        other.authorizationIdentificationResponse &&
                    retrievalReferenceNumber == other.retrievalReferenceNumber &&
                    traceNumber == other.traceNumber &&
                    transactionId == other.transactionId &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    authorizationIdentificationResponse,
                    retrievalReferenceNumber,
                    traceNumber,
                    transactionId,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "NetworkIdentifiers{authorizationIdentificationResponse=$authorizationIdentificationResponse, retrievalReferenceNumber=$retrievalReferenceNumber, traceNumber=$traceNumber, transactionId=$transactionId, additionalProperties=$additionalProperties}"
        }

        /**
         * The processing category describes the intent behind the authorization, such as whether it
         * was used for bill payments or an automatic fuel dispenser.
         */
        class ProcessingCategory
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

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
                 * Account funding transactions are transactions used to e.g., fund an account or
                 * transfer funds between accounts.
                 */
                @JvmField val ACCOUNT_FUNDING = of("account_funding")

                /**
                 * Automatic fuel dispenser authorizations occur when a card is used at a gas pump,
                 * prior to the actual transaction amount being known. They are followed by an
                 * advice message that updates the amount of the pending transaction.
                 */
                @JvmField val AUTOMATIC_FUEL_DISPENSER = of("automatic_fuel_dispenser")

                /** A transaction used to pay a bill. */
                @JvmField val BILL_PAYMENT = of("bill_payment")

                /** Original credit transactions are used to send money to a cardholder. */
                @JvmField val ORIGINAL_CREDIT = of("original_credit")

                /** A regular purchase. */
                @JvmField val PURCHASE = of("purchase")

                /**
                 * Quasi-cash transactions represent purchases of items which may be convertible to
                 * cash.
                 */
                @JvmField val QUASI_CASH = of("quasi_cash")

                /**
                 * A refund card authorization, sometimes referred to as a credit voucher
                 * authorization, where funds are credited to the cardholder.
                 */
                @JvmField val REFUND = of("refund")

                /**
                 * Cash disbursement transactions are used to withdraw cash from an ATM or a point
                 * of sale.
                 */
                @JvmField val CASH_DISBURSEMENT = of("cash_disbursement")

                /** The processing category is unknown. */
                @JvmField val UNKNOWN = of("unknown")

                @JvmStatic fun of(value: String) = ProcessingCategory(JsonField.of(value))
            }

            /** An enum containing [ProcessingCategory]'s known values. */
            enum class Known {
                /**
                 * Account funding transactions are transactions used to e.g., fund an account or
                 * transfer funds between accounts.
                 */
                ACCOUNT_FUNDING,
                /**
                 * Automatic fuel dispenser authorizations occur when a card is used at a gas pump,
                 * prior to the actual transaction amount being known. They are followed by an
                 * advice message that updates the amount of the pending transaction.
                 */
                AUTOMATIC_FUEL_DISPENSER,
                /** A transaction used to pay a bill. */
                BILL_PAYMENT,
                /** Original credit transactions are used to send money to a cardholder. */
                ORIGINAL_CREDIT,
                /** A regular purchase. */
                PURCHASE,
                /**
                 * Quasi-cash transactions represent purchases of items which may be convertible to
                 * cash.
                 */
                QUASI_CASH,
                /**
                 * A refund card authorization, sometimes referred to as a credit voucher
                 * authorization, where funds are credited to the cardholder.
                 */
                REFUND,
                /**
                 * Cash disbursement transactions are used to withdraw cash from an ATM or a point
                 * of sale.
                 */
                CASH_DISBURSEMENT,
                /** The processing category is unknown. */
                UNKNOWN,
            }

            /**
             * An enum containing [ProcessingCategory]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [ProcessingCategory] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /**
                 * Account funding transactions are transactions used to e.g., fund an account or
                 * transfer funds between accounts.
                 */
                ACCOUNT_FUNDING,
                /**
                 * Automatic fuel dispenser authorizations occur when a card is used at a gas pump,
                 * prior to the actual transaction amount being known. They are followed by an
                 * advice message that updates the amount of the pending transaction.
                 */
                AUTOMATIC_FUEL_DISPENSER,
                /** A transaction used to pay a bill. */
                BILL_PAYMENT,
                /** Original credit transactions are used to send money to a cardholder. */
                ORIGINAL_CREDIT,
                /** A regular purchase. */
                PURCHASE,
                /**
                 * Quasi-cash transactions represent purchases of items which may be convertible to
                 * cash.
                 */
                QUASI_CASH,
                /**
                 * A refund card authorization, sometimes referred to as a credit voucher
                 * authorization, where funds are credited to the cardholder.
                 */
                REFUND,
                /**
                 * Cash disbursement transactions are used to withdraw cash from an ATM or a point
                 * of sale.
                 */
                CASH_DISBURSEMENT,
                /** The processing category is unknown. */
                UNKNOWN,
                /**
                 * An enum member indicating that [ProcessingCategory] was instantiated with an
                 * unknown value.
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
                    ACCOUNT_FUNDING -> Value.ACCOUNT_FUNDING
                    AUTOMATIC_FUEL_DISPENSER -> Value.AUTOMATIC_FUEL_DISPENSER
                    BILL_PAYMENT -> Value.BILL_PAYMENT
                    ORIGINAL_CREDIT -> Value.ORIGINAL_CREDIT
                    PURCHASE -> Value.PURCHASE
                    QUASI_CASH -> Value.QUASI_CASH
                    REFUND -> Value.REFUND
                    CASH_DISBURSEMENT -> Value.CASH_DISBURSEMENT
                    UNKNOWN -> Value.UNKNOWN
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
                    ACCOUNT_FUNDING -> Known.ACCOUNT_FUNDING
                    AUTOMATIC_FUEL_DISPENSER -> Known.AUTOMATIC_FUEL_DISPENSER
                    BILL_PAYMENT -> Known.BILL_PAYMENT
                    ORIGINAL_CREDIT -> Known.ORIGINAL_CREDIT
                    PURCHASE -> Known.PURCHASE
                    QUASI_CASH -> Known.QUASI_CASH
                    REFUND -> Known.REFUND
                    CASH_DISBURSEMENT -> Known.CASH_DISBURSEMENT
                    UNKNOWN -> Known.UNKNOWN
                    else -> throw IncreaseInvalidDataException("Unknown ProcessingCategory: $value")
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

            fun validate(): ProcessingCategory = apply {
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

                return other is ProcessingCategory && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Fields specific to the type of request, such as an incremental authorization. */
        class RequestDetails
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val category: JsonField<Category>,
            private val incrementalAuthorization: JsonField<IncrementalAuthorization>,
            private val initialAuthorization: JsonValue,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("category")
                @ExcludeMissing
                category: JsonField<Category> = JsonMissing.of(),
                @JsonProperty("incremental_authorization")
                @ExcludeMissing
                incrementalAuthorization: JsonField<IncrementalAuthorization> = JsonMissing.of(),
                @JsonProperty("initial_authorization")
                @ExcludeMissing
                initialAuthorization: JsonValue = JsonMissing.of(),
            ) : this(category, incrementalAuthorization, initialAuthorization, mutableMapOf())

            /**
             * The type of this request (e.g., an initial authorization or an incremental
             * authorization).
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun category(): Category = category.getRequired("category")

            /**
             * Fields specific to the category `incremental_authorization`.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun incrementalAuthorization(): Optional<IncrementalAuthorization> =
                incrementalAuthorization.getOptional("incremental_authorization")

            /** Fields specific to the category `initial_authorization`. */
            @JsonProperty("initial_authorization")
            @ExcludeMissing
            fun _initialAuthorization(): JsonValue = initialAuthorization

            /**
             * Returns the raw JSON value of [category].
             *
             * Unlike [category], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("category")
            @ExcludeMissing
            fun _category(): JsonField<Category> = category

            /**
             * Returns the raw JSON value of [incrementalAuthorization].
             *
             * Unlike [incrementalAuthorization], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("incremental_authorization")
            @ExcludeMissing
            fun _incrementalAuthorization(): JsonField<IncrementalAuthorization> =
                incrementalAuthorization

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
                 * Returns a mutable builder for constructing an instance of [RequestDetails].
                 *
                 * The following fields are required:
                 * ```java
                 * .category()
                 * .incrementalAuthorization()
                 * .initialAuthorization()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [RequestDetails]. */
            class Builder internal constructor() {

                private var category: JsonField<Category>? = null
                private var incrementalAuthorization: JsonField<IncrementalAuthorization>? = null
                private var initialAuthorization: JsonValue? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(requestDetails: RequestDetails) = apply {
                    category = requestDetails.category
                    incrementalAuthorization = requestDetails.incrementalAuthorization
                    initialAuthorization = requestDetails.initialAuthorization
                    additionalProperties = requestDetails.additionalProperties.toMutableMap()
                }

                /**
                 * The type of this request (e.g., an initial authorization or an incremental
                 * authorization).
                 */
                fun category(category: Category) = category(JsonField.of(category))

                /**
                 * Sets [Builder.category] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.category] with a well-typed [Category] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun category(category: JsonField<Category>) = apply { this.category = category }

                /** Fields specific to the category `incremental_authorization`. */
                fun incrementalAuthorization(incrementalAuthorization: IncrementalAuthorization?) =
                    incrementalAuthorization(JsonField.ofNullable(incrementalAuthorization))

                /**
                 * Alias for calling [Builder.incrementalAuthorization] with
                 * `incrementalAuthorization.orElse(null)`.
                 */
                fun incrementalAuthorization(
                    incrementalAuthorization: Optional<IncrementalAuthorization>
                ) = incrementalAuthorization(incrementalAuthorization.getOrNull())

                /**
                 * Sets [Builder.incrementalAuthorization] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.incrementalAuthorization] with a well-typed
                 * [IncrementalAuthorization] value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun incrementalAuthorization(
                    incrementalAuthorization: JsonField<IncrementalAuthorization>
                ) = apply { this.incrementalAuthorization = incrementalAuthorization }

                /** Fields specific to the category `initial_authorization`. */
                fun initialAuthorization(initialAuthorization: JsonValue) = apply {
                    this.initialAuthorization = initialAuthorization
                }

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
                 * Returns an immutable instance of [RequestDetails].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .category()
                 * .incrementalAuthorization()
                 * .initialAuthorization()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): RequestDetails =
                    RequestDetails(
                        checkRequired("category", category),
                        checkRequired("incrementalAuthorization", incrementalAuthorization),
                        checkRequired("initialAuthorization", initialAuthorization),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): RequestDetails = apply {
                if (validated) {
                    return@apply
                }

                category().validate()
                incrementalAuthorization().ifPresent { it.validate() }
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
                (category.asKnown().getOrNull()?.validity() ?: 0) +
                    (incrementalAuthorization.asKnown().getOrNull()?.validity() ?: 0)

            /**
             * The type of this request (e.g., an initial authorization or an incremental
             * authorization).
             */
            class Category @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    /** A regular, standalone authorization. */
                    @JvmField val INITIAL_AUTHORIZATION = of("initial_authorization")

                    /**
                     * An incremental request to increase the amount of an existing authorization.
                     */
                    @JvmField val INCREMENTAL_AUTHORIZATION = of("incremental_authorization")

                    @JvmStatic fun of(value: String) = Category(JsonField.of(value))
                }

                /** An enum containing [Category]'s known values. */
                enum class Known {
                    /** A regular, standalone authorization. */
                    INITIAL_AUTHORIZATION,
                    /**
                     * An incremental request to increase the amount of an existing authorization.
                     */
                    INCREMENTAL_AUTHORIZATION,
                }

                /**
                 * An enum containing [Category]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Category] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    /** A regular, standalone authorization. */
                    INITIAL_AUTHORIZATION,
                    /**
                     * An incremental request to increase the amount of an existing authorization.
                     */
                    INCREMENTAL_AUTHORIZATION,
                    /**
                     * An enum member indicating that [Category] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        INITIAL_AUTHORIZATION -> Value.INITIAL_AUTHORIZATION
                        INCREMENTAL_AUTHORIZATION -> Value.INCREMENTAL_AUTHORIZATION
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws IncreaseInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        INITIAL_AUTHORIZATION -> Known.INITIAL_AUTHORIZATION
                        INCREMENTAL_AUTHORIZATION -> Known.INCREMENTAL_AUTHORIZATION
                        else -> throw IncreaseInvalidDataException("Unknown Category: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws IncreaseInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        IncreaseInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): Category = apply {
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

                    return other is Category && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** Fields specific to the category `incremental_authorization`. */
            class IncrementalAuthorization
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val cardPaymentId: JsonField<String>,
                private val originalCardAuthorizationId: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("card_payment_id")
                    @ExcludeMissing
                    cardPaymentId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("original_card_authorization_id")
                    @ExcludeMissing
                    originalCardAuthorizationId: JsonField<String> = JsonMissing.of(),
                ) : this(cardPaymentId, originalCardAuthorizationId, mutableMapOf())

                /**
                 * The card payment for this authorization and increment.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun cardPaymentId(): String = cardPaymentId.getRequired("card_payment_id")

                /**
                 * The identifier of the card authorization this request is attempting to increment.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun originalCardAuthorizationId(): String =
                    originalCardAuthorizationId.getRequired("original_card_authorization_id")

                /**
                 * Returns the raw JSON value of [cardPaymentId].
                 *
                 * Unlike [cardPaymentId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("card_payment_id")
                @ExcludeMissing
                fun _cardPaymentId(): JsonField<String> = cardPaymentId

                /**
                 * Returns the raw JSON value of [originalCardAuthorizationId].
                 *
                 * Unlike [originalCardAuthorizationId], this method doesn't throw if the JSON field
                 * has an unexpected type.
                 */
                @JsonProperty("original_card_authorization_id")
                @ExcludeMissing
                fun _originalCardAuthorizationId(): JsonField<String> = originalCardAuthorizationId

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
                     * [IncrementalAuthorization].
                     *
                     * The following fields are required:
                     * ```java
                     * .cardPaymentId()
                     * .originalCardAuthorizationId()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [IncrementalAuthorization]. */
                class Builder internal constructor() {

                    private var cardPaymentId: JsonField<String>? = null
                    private var originalCardAuthorizationId: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(incrementalAuthorization: IncrementalAuthorization) = apply {
                        cardPaymentId = incrementalAuthorization.cardPaymentId
                        originalCardAuthorizationId =
                            incrementalAuthorization.originalCardAuthorizationId
                        additionalProperties =
                            incrementalAuthorization.additionalProperties.toMutableMap()
                    }

                    /** The card payment for this authorization and increment. */
                    fun cardPaymentId(cardPaymentId: String) =
                        cardPaymentId(JsonField.of(cardPaymentId))

                    /**
                     * Sets [Builder.cardPaymentId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.cardPaymentId] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun cardPaymentId(cardPaymentId: JsonField<String>) = apply {
                        this.cardPaymentId = cardPaymentId
                    }

                    /**
                     * The identifier of the card authorization this request is attempting to
                     * increment.
                     */
                    fun originalCardAuthorizationId(originalCardAuthorizationId: String) =
                        originalCardAuthorizationId(JsonField.of(originalCardAuthorizationId))

                    /**
                     * Sets [Builder.originalCardAuthorizationId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.originalCardAuthorizationId] with a
                     * well-typed [String] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun originalCardAuthorizationId(
                        originalCardAuthorizationId: JsonField<String>
                    ) = apply { this.originalCardAuthorizationId = originalCardAuthorizationId }

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
                     * Returns an immutable instance of [IncrementalAuthorization].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .cardPaymentId()
                     * .originalCardAuthorizationId()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): IncrementalAuthorization =
                        IncrementalAuthorization(
                            checkRequired("cardPaymentId", cardPaymentId),
                            checkRequired(
                                "originalCardAuthorizationId",
                                originalCardAuthorizationId,
                            ),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): IncrementalAuthorization = apply {
                    if (validated) {
                        return@apply
                    }

                    cardPaymentId()
                    originalCardAuthorizationId()
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
                    (if (cardPaymentId.asKnown().isPresent) 1 else 0) +
                        (if (originalCardAuthorizationId.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is IncrementalAuthorization &&
                        cardPaymentId == other.cardPaymentId &&
                        originalCardAuthorizationId == other.originalCardAuthorizationId &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(cardPaymentId, originalCardAuthorizationId, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "IncrementalAuthorization{cardPaymentId=$cardPaymentId, originalCardAuthorizationId=$originalCardAuthorizationId, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is RequestDetails &&
                    category == other.category &&
                    incrementalAuthorization == other.incrementalAuthorization &&
                    initialAuthorization == other.initialAuthorization &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    category,
                    incrementalAuthorization,
                    initialAuthorization,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "RequestDetails{category=$category, incrementalAuthorization=$incrementalAuthorization, initialAuthorization=$initialAuthorization, additionalProperties=$additionalProperties}"
        }

        /** Fields related to verification of cardholder-provided values. */
        class Verification
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val cardVerificationCode: JsonField<CardVerificationCode>,
            private val cardholderAddress: JsonField<CardholderAddress>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("card_verification_code")
                @ExcludeMissing
                cardVerificationCode: JsonField<CardVerificationCode> = JsonMissing.of(),
                @JsonProperty("cardholder_address")
                @ExcludeMissing
                cardholderAddress: JsonField<CardholderAddress> = JsonMissing.of(),
            ) : this(cardVerificationCode, cardholderAddress, mutableMapOf())

            /**
             * Fields related to verification of the Card Verification Code, a 3-digit code on the
             * back of the card.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun cardVerificationCode(): CardVerificationCode =
                cardVerificationCode.getRequired("card_verification_code")

            /**
             * Cardholder address provided in the authorization request and the address on file we
             * verified it against.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun cardholderAddress(): CardholderAddress =
                cardholderAddress.getRequired("cardholder_address")

            /**
             * Returns the raw JSON value of [cardVerificationCode].
             *
             * Unlike [cardVerificationCode], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("card_verification_code")
            @ExcludeMissing
            fun _cardVerificationCode(): JsonField<CardVerificationCode> = cardVerificationCode

            /**
             * Returns the raw JSON value of [cardholderAddress].
             *
             * Unlike [cardholderAddress], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("cardholder_address")
            @ExcludeMissing
            fun _cardholderAddress(): JsonField<CardholderAddress> = cardholderAddress

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
                 * Returns a mutable builder for constructing an instance of [Verification].
                 *
                 * The following fields are required:
                 * ```java
                 * .cardVerificationCode()
                 * .cardholderAddress()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Verification]. */
            class Builder internal constructor() {

                private var cardVerificationCode: JsonField<CardVerificationCode>? = null
                private var cardholderAddress: JsonField<CardholderAddress>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(verification: Verification) = apply {
                    cardVerificationCode = verification.cardVerificationCode
                    cardholderAddress = verification.cardholderAddress
                    additionalProperties = verification.additionalProperties.toMutableMap()
                }

                /**
                 * Fields related to verification of the Card Verification Code, a 3-digit code on
                 * the back of the card.
                 */
                fun cardVerificationCode(cardVerificationCode: CardVerificationCode) =
                    cardVerificationCode(JsonField.of(cardVerificationCode))

                /**
                 * Sets [Builder.cardVerificationCode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cardVerificationCode] with a well-typed
                 * [CardVerificationCode] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun cardVerificationCode(cardVerificationCode: JsonField<CardVerificationCode>) =
                    apply {
                        this.cardVerificationCode = cardVerificationCode
                    }

                /**
                 * Cardholder address provided in the authorization request and the address on file
                 * we verified it against.
                 */
                fun cardholderAddress(cardholderAddress: CardholderAddress) =
                    cardholderAddress(JsonField.of(cardholderAddress))

                /**
                 * Sets [Builder.cardholderAddress] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cardholderAddress] with a well-typed
                 * [CardholderAddress] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun cardholderAddress(cardholderAddress: JsonField<CardholderAddress>) = apply {
                    this.cardholderAddress = cardholderAddress
                }

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
                 * Returns an immutable instance of [Verification].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .cardVerificationCode()
                 * .cardholderAddress()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Verification =
                    Verification(
                        checkRequired("cardVerificationCode", cardVerificationCode),
                        checkRequired("cardholderAddress", cardholderAddress),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Verification = apply {
                if (validated) {
                    return@apply
                }

                cardVerificationCode().validate()
                cardholderAddress().validate()
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
                (cardVerificationCode.asKnown().getOrNull()?.validity() ?: 0) +
                    (cardholderAddress.asKnown().getOrNull()?.validity() ?: 0)

            /**
             * Fields related to verification of the Card Verification Code, a 3-digit code on the
             * back of the card.
             */
            class CardVerificationCode
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val result: JsonField<Result>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("result")
                    @ExcludeMissing
                    result: JsonField<Result> = JsonMissing.of()
                ) : this(result, mutableMapOf())

                /**
                 * The result of verifying the Card Verification Code.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun result(): Result = result.getRequired("result")

                /**
                 * Returns the raw JSON value of [result].
                 *
                 * Unlike [result], this method doesn't throw if the JSON field has an unexpected
                 * type.
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
                     * [CardVerificationCode].
                     *
                     * The following fields are required:
                     * ```java
                     * .result()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [CardVerificationCode]. */
                class Builder internal constructor() {

                    private var result: JsonField<Result>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(cardVerificationCode: CardVerificationCode) = apply {
                        result = cardVerificationCode.result
                        additionalProperties =
                            cardVerificationCode.additionalProperties.toMutableMap()
                    }

                    /** The result of verifying the Card Verification Code. */
                    fun result(result: Result) = result(JsonField.of(result))

                    /**
                     * Sets [Builder.result] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.result] with a well-typed [Result] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun result(result: JsonField<Result>) = apply { this.result = result }

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
                     * Returns an immutable instance of [CardVerificationCode].
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
                    fun build(): CardVerificationCode =
                        CardVerificationCode(
                            checkRequired("result", result),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): CardVerificationCode = apply {
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
                @JvmSynthetic
                internal fun validity(): Int = (result.asKnown().getOrNull()?.validity() ?: 0)

                /** The result of verifying the Card Verification Code. */
                class Result
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        /** No card verification code was provided in the authorization request. */
                        @JvmField val NOT_CHECKED = of("not_checked")

                        /** The card verification code matched the one on file. */
                        @JvmField val MATCH = of("match")

                        /** The card verification code did not match the one on file. */
                        @JvmField val NO_MATCH = of("no_match")

                        @JvmStatic fun of(value: String) = Result(JsonField.of(value))
                    }

                    /** An enum containing [Result]'s known values. */
                    enum class Known {
                        /** No card verification code was provided in the authorization request. */
                        NOT_CHECKED,
                        /** The card verification code matched the one on file. */
                        MATCH,
                        /** The card verification code did not match the one on file. */
                        NO_MATCH,
                    }

                    /**
                     * An enum containing [Result]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Result] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        /** No card verification code was provided in the authorization request. */
                        NOT_CHECKED,
                        /** The card verification code matched the one on file. */
                        MATCH,
                        /** The card verification code did not match the one on file. */
                        NO_MATCH,
                        /**
                         * An enum member indicating that [Result] was instantiated with an unknown
                         * value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            NOT_CHECKED -> Value.NOT_CHECKED
                            MATCH -> Value.MATCH
                            NO_MATCH -> Value.NO_MATCH
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws IncreaseInvalidDataException if this class instance's value is a not
                     *   a known member.
                     */
                    fun known(): Known =
                        when (this) {
                            NOT_CHECKED -> Known.NOT_CHECKED
                            MATCH -> Known.MATCH
                            NO_MATCH -> Known.NO_MATCH
                            else -> throw IncreaseInvalidDataException("Unknown Result: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws IncreaseInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Result && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is CardVerificationCode &&
                        result == other.result &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(result, additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "CardVerificationCode{result=$result, additionalProperties=$additionalProperties}"
            }

            /**
             * Cardholder address provided in the authorization request and the address on file we
             * verified it against.
             */
            class CardholderAddress
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val actualLine1: JsonField<String>,
                private val actualPostalCode: JsonField<String>,
                private val providedLine1: JsonField<String>,
                private val providedPostalCode: JsonField<String>,
                private val result: JsonField<Result>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("actual_line1")
                    @ExcludeMissing
                    actualLine1: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("actual_postal_code")
                    @ExcludeMissing
                    actualPostalCode: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("provided_line1")
                    @ExcludeMissing
                    providedLine1: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("provided_postal_code")
                    @ExcludeMissing
                    providedPostalCode: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("result")
                    @ExcludeMissing
                    result: JsonField<Result> = JsonMissing.of(),
                ) : this(
                    actualLine1,
                    actualPostalCode,
                    providedLine1,
                    providedPostalCode,
                    result,
                    mutableMapOf(),
                )

                /**
                 * Line 1 of the address on file for the cardholder.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun actualLine1(): Optional<String> = actualLine1.getOptional("actual_line1")

                /**
                 * The postal code of the address on file for the cardholder.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun actualPostalCode(): Optional<String> =
                    actualPostalCode.getOptional("actual_postal_code")

                /**
                 * The cardholder address line 1 provided for verification in the authorization
                 * request.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun providedLine1(): Optional<String> = providedLine1.getOptional("provided_line1")

                /**
                 * The postal code provided for verification in the authorization request.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun providedPostalCode(): Optional<String> =
                    providedPostalCode.getOptional("provided_postal_code")

                /**
                 * The address verification result returned to the card network.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun result(): Result = result.getRequired("result")

                /**
                 * Returns the raw JSON value of [actualLine1].
                 *
                 * Unlike [actualLine1], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("actual_line1")
                @ExcludeMissing
                fun _actualLine1(): JsonField<String> = actualLine1

                /**
                 * Returns the raw JSON value of [actualPostalCode].
                 *
                 * Unlike [actualPostalCode], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("actual_postal_code")
                @ExcludeMissing
                fun _actualPostalCode(): JsonField<String> = actualPostalCode

                /**
                 * Returns the raw JSON value of [providedLine1].
                 *
                 * Unlike [providedLine1], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("provided_line1")
                @ExcludeMissing
                fun _providedLine1(): JsonField<String> = providedLine1

                /**
                 * Returns the raw JSON value of [providedPostalCode].
                 *
                 * Unlike [providedPostalCode], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("provided_postal_code")
                @ExcludeMissing
                fun _providedPostalCode(): JsonField<String> = providedPostalCode

                /**
                 * Returns the raw JSON value of [result].
                 *
                 * Unlike [result], this method doesn't throw if the JSON field has an unexpected
                 * type.
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
                     * [CardholderAddress].
                     *
                     * The following fields are required:
                     * ```java
                     * .actualLine1()
                     * .actualPostalCode()
                     * .providedLine1()
                     * .providedPostalCode()
                     * .result()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [CardholderAddress]. */
                class Builder internal constructor() {

                    private var actualLine1: JsonField<String>? = null
                    private var actualPostalCode: JsonField<String>? = null
                    private var providedLine1: JsonField<String>? = null
                    private var providedPostalCode: JsonField<String>? = null
                    private var result: JsonField<Result>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(cardholderAddress: CardholderAddress) = apply {
                        actualLine1 = cardholderAddress.actualLine1
                        actualPostalCode = cardholderAddress.actualPostalCode
                        providedLine1 = cardholderAddress.providedLine1
                        providedPostalCode = cardholderAddress.providedPostalCode
                        result = cardholderAddress.result
                        additionalProperties = cardholderAddress.additionalProperties.toMutableMap()
                    }

                    /** Line 1 of the address on file for the cardholder. */
                    fun actualLine1(actualLine1: String?) =
                        actualLine1(JsonField.ofNullable(actualLine1))

                    /** Alias for calling [Builder.actualLine1] with `actualLine1.orElse(null)`. */
                    fun actualLine1(actualLine1: Optional<String>) =
                        actualLine1(actualLine1.getOrNull())

                    /**
                     * Sets [Builder.actualLine1] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.actualLine1] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun actualLine1(actualLine1: JsonField<String>) = apply {
                        this.actualLine1 = actualLine1
                    }

                    /** The postal code of the address on file for the cardholder. */
                    fun actualPostalCode(actualPostalCode: String?) =
                        actualPostalCode(JsonField.ofNullable(actualPostalCode))

                    /**
                     * Alias for calling [Builder.actualPostalCode] with
                     * `actualPostalCode.orElse(null)`.
                     */
                    fun actualPostalCode(actualPostalCode: Optional<String>) =
                        actualPostalCode(actualPostalCode.getOrNull())

                    /**
                     * Sets [Builder.actualPostalCode] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.actualPostalCode] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun actualPostalCode(actualPostalCode: JsonField<String>) = apply {
                        this.actualPostalCode = actualPostalCode
                    }

                    /**
                     * The cardholder address line 1 provided for verification in the authorization
                     * request.
                     */
                    fun providedLine1(providedLine1: String?) =
                        providedLine1(JsonField.ofNullable(providedLine1))

                    /**
                     * Alias for calling [Builder.providedLine1] with `providedLine1.orElse(null)`.
                     */
                    fun providedLine1(providedLine1: Optional<String>) =
                        providedLine1(providedLine1.getOrNull())

                    /**
                     * Sets [Builder.providedLine1] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.providedLine1] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun providedLine1(providedLine1: JsonField<String>) = apply {
                        this.providedLine1 = providedLine1
                    }

                    /** The postal code provided for verification in the authorization request. */
                    fun providedPostalCode(providedPostalCode: String?) =
                        providedPostalCode(JsonField.ofNullable(providedPostalCode))

                    /**
                     * Alias for calling [Builder.providedPostalCode] with
                     * `providedPostalCode.orElse(null)`.
                     */
                    fun providedPostalCode(providedPostalCode: Optional<String>) =
                        providedPostalCode(providedPostalCode.getOrNull())

                    /**
                     * Sets [Builder.providedPostalCode] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.providedPostalCode] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun providedPostalCode(providedPostalCode: JsonField<String>) = apply {
                        this.providedPostalCode = providedPostalCode
                    }

                    /** The address verification result returned to the card network. */
                    fun result(result: Result) = result(JsonField.of(result))

                    /**
                     * Sets [Builder.result] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.result] with a well-typed [Result] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun result(result: JsonField<Result>) = apply { this.result = result }

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
                     * Returns an immutable instance of [CardholderAddress].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .actualLine1()
                     * .actualPostalCode()
                     * .providedLine1()
                     * .providedPostalCode()
                     * .result()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): CardholderAddress =
                        CardholderAddress(
                            checkRequired("actualLine1", actualLine1),
                            checkRequired("actualPostalCode", actualPostalCode),
                            checkRequired("providedLine1", providedLine1),
                            checkRequired("providedPostalCode", providedPostalCode),
                            checkRequired("result", result),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): CardholderAddress = apply {
                    if (validated) {
                        return@apply
                    }

                    actualLine1()
                    actualPostalCode()
                    providedLine1()
                    providedPostalCode()
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
                @JvmSynthetic
                internal fun validity(): Int =
                    (if (actualLine1.asKnown().isPresent) 1 else 0) +
                        (if (actualPostalCode.asKnown().isPresent) 1 else 0) +
                        (if (providedLine1.asKnown().isPresent) 1 else 0) +
                        (if (providedPostalCode.asKnown().isPresent) 1 else 0) +
                        (result.asKnown().getOrNull()?.validity() ?: 0)

                /** The address verification result returned to the card network. */
                class Result
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        /** No address information was provided in the authorization request. */
                        @JvmField val NOT_CHECKED = of("not_checked")

                        /**
                         * Postal code matches, but the street address does not match or was not
                         * provided.
                         */
                        @JvmField
                        val POSTAL_CODE_MATCH_ADDRESS_NO_MATCH =
                            of("postal_code_match_address_no_match")

                        /**
                         * Postal code does not match, but the street address matches or was not
                         * provided.
                         */
                        @JvmField
                        val POSTAL_CODE_NO_MATCH_ADDRESS_MATCH =
                            of("postal_code_no_match_address_match")

                        /** Postal code and street address match. */
                        @JvmField val MATCH = of("match")

                        /** Postal code and street address do not match. */
                        @JvmField val NO_MATCH = of("no_match")

                        /**
                         * Postal code matches, but the street address was not verified.
                         * (deprecated)
                         */
                        @JvmField
                        val POSTAL_CODE_MATCH_ADDRESS_NOT_CHECKED =
                            of("postal_code_match_address_not_checked")

                        @JvmStatic fun of(value: String) = Result(JsonField.of(value))
                    }

                    /** An enum containing [Result]'s known values. */
                    enum class Known {
                        /** No address information was provided in the authorization request. */
                        NOT_CHECKED,
                        /**
                         * Postal code matches, but the street address does not match or was not
                         * provided.
                         */
                        POSTAL_CODE_MATCH_ADDRESS_NO_MATCH,
                        /**
                         * Postal code does not match, but the street address matches or was not
                         * provided.
                         */
                        POSTAL_CODE_NO_MATCH_ADDRESS_MATCH,
                        /** Postal code and street address match. */
                        MATCH,
                        /** Postal code and street address do not match. */
                        NO_MATCH,
                        /**
                         * Postal code matches, but the street address was not verified.
                         * (deprecated)
                         */
                        POSTAL_CODE_MATCH_ADDRESS_NOT_CHECKED,
                    }

                    /**
                     * An enum containing [Result]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Result] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        /** No address information was provided in the authorization request. */
                        NOT_CHECKED,
                        /**
                         * Postal code matches, but the street address does not match or was not
                         * provided.
                         */
                        POSTAL_CODE_MATCH_ADDRESS_NO_MATCH,
                        /**
                         * Postal code does not match, but the street address matches or was not
                         * provided.
                         */
                        POSTAL_CODE_NO_MATCH_ADDRESS_MATCH,
                        /** Postal code and street address match. */
                        MATCH,
                        /** Postal code and street address do not match. */
                        NO_MATCH,
                        /**
                         * Postal code matches, but the street address was not verified.
                         * (deprecated)
                         */
                        POSTAL_CODE_MATCH_ADDRESS_NOT_CHECKED,
                        /**
                         * An enum member indicating that [Result] was instantiated with an unknown
                         * value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            NOT_CHECKED -> Value.NOT_CHECKED
                            POSTAL_CODE_MATCH_ADDRESS_NO_MATCH ->
                                Value.POSTAL_CODE_MATCH_ADDRESS_NO_MATCH
                            POSTAL_CODE_NO_MATCH_ADDRESS_MATCH ->
                                Value.POSTAL_CODE_NO_MATCH_ADDRESS_MATCH
                            MATCH -> Value.MATCH
                            NO_MATCH -> Value.NO_MATCH
                            POSTAL_CODE_MATCH_ADDRESS_NOT_CHECKED ->
                                Value.POSTAL_CODE_MATCH_ADDRESS_NOT_CHECKED
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws IncreaseInvalidDataException if this class instance's value is a not
                     *   a known member.
                     */
                    fun known(): Known =
                        when (this) {
                            NOT_CHECKED -> Known.NOT_CHECKED
                            POSTAL_CODE_MATCH_ADDRESS_NO_MATCH ->
                                Known.POSTAL_CODE_MATCH_ADDRESS_NO_MATCH
                            POSTAL_CODE_NO_MATCH_ADDRESS_MATCH ->
                                Known.POSTAL_CODE_NO_MATCH_ADDRESS_MATCH
                            MATCH -> Known.MATCH
                            NO_MATCH -> Known.NO_MATCH
                            POSTAL_CODE_MATCH_ADDRESS_NOT_CHECKED ->
                                Known.POSTAL_CODE_MATCH_ADDRESS_NOT_CHECKED
                            else -> throw IncreaseInvalidDataException("Unknown Result: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws IncreaseInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Result && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is CardholderAddress &&
                        actualLine1 == other.actualLine1 &&
                        actualPostalCode == other.actualPostalCode &&
                        providedLine1 == other.providedLine1 &&
                        providedPostalCode == other.providedPostalCode &&
                        result == other.result &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        actualLine1,
                        actualPostalCode,
                        providedLine1,
                        providedPostalCode,
                        result,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "CardholderAddress{actualLine1=$actualLine1, actualPostalCode=$actualPostalCode, providedLine1=$providedLine1, providedPostalCode=$providedPostalCode, result=$result, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Verification &&
                    cardVerificationCode == other.cardVerificationCode &&
                    cardholderAddress == other.cardholderAddress &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(cardVerificationCode, cardholderAddress, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Verification{cardVerificationCode=$cardVerificationCode, cardholderAddress=$cardholderAddress, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CardAuthorization &&
                accountId == other.accountId &&
                additionalAmounts == other.additionalAmounts &&
                cardId == other.cardId &&
                decision == other.decision &&
                decline == other.decline &&
                digitalWalletTokenId == other.digitalWalletTokenId &&
                direction == other.direction &&
                merchantAcceptorId == other.merchantAcceptorId &&
                merchantCategoryCode == other.merchantCategoryCode &&
                merchantCity == other.merchantCity &&
                merchantCountry == other.merchantCountry &&
                merchantDescriptor == other.merchantDescriptor &&
                merchantPostalCode == other.merchantPostalCode &&
                merchantState == other.merchantState &&
                networkDetails == other.networkDetails &&
                networkIdentifiers == other.networkIdentifiers &&
                networkRiskScore == other.networkRiskScore &&
                physicalCardId == other.physicalCardId &&
                presentmentAmount == other.presentmentAmount &&
                presentmentCurrency == other.presentmentCurrency &&
                processingCategory == other.processingCategory &&
                requestDetails == other.requestDetails &&
                settlementAmount == other.settlementAmount &&
                settlementCurrency == other.settlementCurrency &&
                terminalId == other.terminalId &&
                upcomingCardPaymentId == other.upcomingCardPaymentId &&
                verification == other.verification &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                accountId,
                additionalAmounts,
                cardId,
                decision,
                decline,
                digitalWalletTokenId,
                direction,
                merchantAcceptorId,
                merchantCategoryCode,
                merchantCity,
                merchantCountry,
                merchantDescriptor,
                merchantPostalCode,
                merchantState,
                networkDetails,
                networkIdentifiers,
                networkRiskScore,
                physicalCardId,
                presentmentAmount,
                presentmentCurrency,
                processingCategory,
                requestDetails,
                settlementAmount,
                settlementCurrency,
                terminalId,
                upcomingCardPaymentId,
                verification,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CardAuthorization{accountId=$accountId, additionalAmounts=$additionalAmounts, cardId=$cardId, decision=$decision, decline=$decline, digitalWalletTokenId=$digitalWalletTokenId, direction=$direction, merchantAcceptorId=$merchantAcceptorId, merchantCategoryCode=$merchantCategoryCode, merchantCity=$merchantCity, merchantCountry=$merchantCountry, merchantDescriptor=$merchantDescriptor, merchantPostalCode=$merchantPostalCode, merchantState=$merchantState, networkDetails=$networkDetails, networkIdentifiers=$networkIdentifiers, networkRiskScore=$networkRiskScore, physicalCardId=$physicalCardId, presentmentAmount=$presentmentAmount, presentmentCurrency=$presentmentCurrency, processingCategory=$processingCategory, requestDetails=$requestDetails, settlementAmount=$settlementAmount, settlementCurrency=$settlementCurrency, terminalId=$terminalId, upcomingCardPaymentId=$upcomingCardPaymentId, verification=$verification, additionalProperties=$additionalProperties}"
    }

    /** The category of the Real-Time Decision. */
    class Category @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            /** A card is being authorized. */
            @JvmField val CARD_AUTHORIZATION_REQUESTED = of("card_authorization_requested")

            /** 3DS authentication is requested. */
            @JvmField val CARD_AUTHENTICATION_REQUESTED = of("card_authentication_requested")

            /** 3DS authentication challenge requires cardholder involvement. */
            @JvmField
            val CARD_AUTHENTICATION_CHALLENGE_REQUESTED =
                of("card_authentication_challenge_requested")

            /** A card is being loaded into a digital wallet. */
            @JvmField val DIGITAL_WALLET_TOKEN_REQUESTED = of("digital_wallet_token_requested")

            /**
             * A card is being loaded into a digital wallet and requires cardholder authentication.
             */
            @JvmField
            val DIGITAL_WALLET_AUTHENTICATION_REQUESTED =
                of("digital_wallet_authentication_requested")

            @JvmStatic fun of(value: String) = Category(JsonField.of(value))
        }

        /** An enum containing [Category]'s known values. */
        enum class Known {
            /** A card is being authorized. */
            CARD_AUTHORIZATION_REQUESTED,
            /** 3DS authentication is requested. */
            CARD_AUTHENTICATION_REQUESTED,
            /** 3DS authentication challenge requires cardholder involvement. */
            CARD_AUTHENTICATION_CHALLENGE_REQUESTED,
            /** A card is being loaded into a digital wallet. */
            DIGITAL_WALLET_TOKEN_REQUESTED,
            /**
             * A card is being loaded into a digital wallet and requires cardholder authentication.
             */
            DIGITAL_WALLET_AUTHENTICATION_REQUESTED,
        }

        /**
         * An enum containing [Category]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Category] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            /** A card is being authorized. */
            CARD_AUTHORIZATION_REQUESTED,
            /** 3DS authentication is requested. */
            CARD_AUTHENTICATION_REQUESTED,
            /** 3DS authentication challenge requires cardholder involvement. */
            CARD_AUTHENTICATION_CHALLENGE_REQUESTED,
            /** A card is being loaded into a digital wallet. */
            DIGITAL_WALLET_TOKEN_REQUESTED,
            /**
             * A card is being loaded into a digital wallet and requires cardholder authentication.
             */
            DIGITAL_WALLET_AUTHENTICATION_REQUESTED,
            /** An enum member indicating that [Category] was instantiated with an unknown value. */
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
                CARD_AUTHORIZATION_REQUESTED -> Value.CARD_AUTHORIZATION_REQUESTED
                CARD_AUTHENTICATION_REQUESTED -> Value.CARD_AUTHENTICATION_REQUESTED
                CARD_AUTHENTICATION_CHALLENGE_REQUESTED ->
                    Value.CARD_AUTHENTICATION_CHALLENGE_REQUESTED
                DIGITAL_WALLET_TOKEN_REQUESTED -> Value.DIGITAL_WALLET_TOKEN_REQUESTED
                DIGITAL_WALLET_AUTHENTICATION_REQUESTED ->
                    Value.DIGITAL_WALLET_AUTHENTICATION_REQUESTED
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
                CARD_AUTHORIZATION_REQUESTED -> Known.CARD_AUTHORIZATION_REQUESTED
                CARD_AUTHENTICATION_REQUESTED -> Known.CARD_AUTHENTICATION_REQUESTED
                CARD_AUTHENTICATION_CHALLENGE_REQUESTED ->
                    Known.CARD_AUTHENTICATION_CHALLENGE_REQUESTED
                DIGITAL_WALLET_TOKEN_REQUESTED -> Known.DIGITAL_WALLET_TOKEN_REQUESTED
                DIGITAL_WALLET_AUTHENTICATION_REQUESTED ->
                    Known.DIGITAL_WALLET_AUTHENTICATION_REQUESTED
                else -> throw IncreaseInvalidDataException("Unknown Category: $value")
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

        private var validated: Boolean = false

        fun validate(): Category = apply {
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

            return other is Category && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Fields related to a digital wallet authentication attempt. */
    class DigitalWalletAuthentication
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val cardId: JsonField<String>,
        private val channel: JsonField<Channel>,
        private val digitalWallet: JsonField<DigitalWallet>,
        private val email: JsonField<String>,
        private val oneTimePasscode: JsonField<String>,
        private val phone: JsonField<String>,
        private val result: JsonField<Result>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("card_id") @ExcludeMissing cardId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("channel") @ExcludeMissing channel: JsonField<Channel> = JsonMissing.of(),
            @JsonProperty("digital_wallet")
            @ExcludeMissing
            digitalWallet: JsonField<DigitalWallet> = JsonMissing.of(),
            @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
            @JsonProperty("one_time_passcode")
            @ExcludeMissing
            oneTimePasscode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("phone") @ExcludeMissing phone: JsonField<String> = JsonMissing.of(),
            @JsonProperty("result") @ExcludeMissing result: JsonField<Result> = JsonMissing.of(),
        ) : this(
            cardId,
            channel,
            digitalWallet,
            email,
            oneTimePasscode,
            phone,
            result,
            mutableMapOf(),
        )

        /**
         * The identifier of the Card that is being tokenized.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun cardId(): String = cardId.getRequired("card_id")

        /**
         * The channel to send the card user their one-time passcode.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun channel(): Channel = channel.getRequired("channel")

        /**
         * The digital wallet app being used.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun digitalWallet(): DigitalWallet = digitalWallet.getRequired("digital_wallet")

        /**
         * The email to send the one-time passcode to if `channel` is equal to `email`.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun email(): Optional<String> = email.getOptional("email")

        /**
         * The one-time passcode to send the card user.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun oneTimePasscode(): String = oneTimePasscode.getRequired("one_time_passcode")

        /**
         * The phone number to send the one-time passcode to if `channel` is equal to `sms`.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun phone(): Optional<String> = phone.getOptional("phone")

        /**
         * Whether your application successfully delivered the one-time passcode.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun result(): Optional<Result> = result.getOptional("result")

        /**
         * Returns the raw JSON value of [cardId].
         *
         * Unlike [cardId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("card_id") @ExcludeMissing fun _cardId(): JsonField<String> = cardId

        /**
         * Returns the raw JSON value of [channel].
         *
         * Unlike [channel], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("channel") @ExcludeMissing fun _channel(): JsonField<Channel> = channel

        /**
         * Returns the raw JSON value of [digitalWallet].
         *
         * Unlike [digitalWallet], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("digital_wallet")
        @ExcludeMissing
        fun _digitalWallet(): JsonField<DigitalWallet> = digitalWallet

        /**
         * Returns the raw JSON value of [email].
         *
         * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

        /**
         * Returns the raw JSON value of [oneTimePasscode].
         *
         * Unlike [oneTimePasscode], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("one_time_passcode")
        @ExcludeMissing
        fun _oneTimePasscode(): JsonField<String> = oneTimePasscode

        /**
         * Returns the raw JSON value of [phone].
         *
         * Unlike [phone], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("phone") @ExcludeMissing fun _phone(): JsonField<String> = phone

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
             * [DigitalWalletAuthentication].
             *
             * The following fields are required:
             * ```java
             * .cardId()
             * .channel()
             * .digitalWallet()
             * .email()
             * .oneTimePasscode()
             * .phone()
             * .result()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [DigitalWalletAuthentication]. */
        class Builder internal constructor() {

            private var cardId: JsonField<String>? = null
            private var channel: JsonField<Channel>? = null
            private var digitalWallet: JsonField<DigitalWallet>? = null
            private var email: JsonField<String>? = null
            private var oneTimePasscode: JsonField<String>? = null
            private var phone: JsonField<String>? = null
            private var result: JsonField<Result>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(digitalWalletAuthentication: DigitalWalletAuthentication) = apply {
                cardId = digitalWalletAuthentication.cardId
                channel = digitalWalletAuthentication.channel
                digitalWallet = digitalWalletAuthentication.digitalWallet
                email = digitalWalletAuthentication.email
                oneTimePasscode = digitalWalletAuthentication.oneTimePasscode
                phone = digitalWalletAuthentication.phone
                result = digitalWalletAuthentication.result
                additionalProperties =
                    digitalWalletAuthentication.additionalProperties.toMutableMap()
            }

            /** The identifier of the Card that is being tokenized. */
            fun cardId(cardId: String) = cardId(JsonField.of(cardId))

            /**
             * Sets [Builder.cardId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cardId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cardId(cardId: JsonField<String>) = apply { this.cardId = cardId }

            /** The channel to send the card user their one-time passcode. */
            fun channel(channel: Channel) = channel(JsonField.of(channel))

            /**
             * Sets [Builder.channel] to an arbitrary JSON value.
             *
             * You should usually call [Builder.channel] with a well-typed [Channel] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun channel(channel: JsonField<Channel>) = apply { this.channel = channel }

            /** The digital wallet app being used. */
            fun digitalWallet(digitalWallet: DigitalWallet) =
                digitalWallet(JsonField.of(digitalWallet))

            /**
             * Sets [Builder.digitalWallet] to an arbitrary JSON value.
             *
             * You should usually call [Builder.digitalWallet] with a well-typed [DigitalWallet]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun digitalWallet(digitalWallet: JsonField<DigitalWallet>) = apply {
                this.digitalWallet = digitalWallet
            }

            /** The email to send the one-time passcode to if `channel` is equal to `email`. */
            fun email(email: String?) = email(JsonField.ofNullable(email))

            /** Alias for calling [Builder.email] with `email.orElse(null)`. */
            fun email(email: Optional<String>) = email(email.getOrNull())

            /**
             * Sets [Builder.email] to an arbitrary JSON value.
             *
             * You should usually call [Builder.email] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun email(email: JsonField<String>) = apply { this.email = email }

            /** The one-time passcode to send the card user. */
            fun oneTimePasscode(oneTimePasscode: String) =
                oneTimePasscode(JsonField.of(oneTimePasscode))

            /**
             * Sets [Builder.oneTimePasscode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.oneTimePasscode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun oneTimePasscode(oneTimePasscode: JsonField<String>) = apply {
                this.oneTimePasscode = oneTimePasscode
            }

            /** The phone number to send the one-time passcode to if `channel` is equal to `sms`. */
            fun phone(phone: String?) = phone(JsonField.ofNullable(phone))

            /** Alias for calling [Builder.phone] with `phone.orElse(null)`. */
            fun phone(phone: Optional<String>) = phone(phone.getOrNull())

            /**
             * Sets [Builder.phone] to an arbitrary JSON value.
             *
             * You should usually call [Builder.phone] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun phone(phone: JsonField<String>) = apply { this.phone = phone }

            /** Whether your application successfully delivered the one-time passcode. */
            fun result(result: Result?) = result(JsonField.ofNullable(result))

            /** Alias for calling [Builder.result] with `result.orElse(null)`. */
            fun result(result: Optional<Result>) = result(result.getOrNull())

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
             * Returns an immutable instance of [DigitalWalletAuthentication].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .cardId()
             * .channel()
             * .digitalWallet()
             * .email()
             * .oneTimePasscode()
             * .phone()
             * .result()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): DigitalWalletAuthentication =
                DigitalWalletAuthentication(
                    checkRequired("cardId", cardId),
                    checkRequired("channel", channel),
                    checkRequired("digitalWallet", digitalWallet),
                    checkRequired("email", email),
                    checkRequired("oneTimePasscode", oneTimePasscode),
                    checkRequired("phone", phone),
                    checkRequired("result", result),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): DigitalWalletAuthentication = apply {
            if (validated) {
                return@apply
            }

            cardId()
            channel().validate()
            digitalWallet().validate()
            email()
            oneTimePasscode()
            phone()
            result().ifPresent { it.validate() }
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
            (if (cardId.asKnown().isPresent) 1 else 0) +
                (channel.asKnown().getOrNull()?.validity() ?: 0) +
                (digitalWallet.asKnown().getOrNull()?.validity() ?: 0) +
                (if (email.asKnown().isPresent) 1 else 0) +
                (if (oneTimePasscode.asKnown().isPresent) 1 else 0) +
                (if (phone.asKnown().isPresent) 1 else 0) +
                (result.asKnown().getOrNull()?.validity() ?: 0)

        /** The channel to send the card user their one-time passcode. */
        class Channel @JsonCreator private constructor(private val value: JsonField<String>) :
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

                /** Send one-time passcodes over SMS. */
                @JvmField val SMS = of("sms")

                /** Send one-time passcodes over email. */
                @JvmField val EMAIL = of("email")

                @JvmStatic fun of(value: String) = Channel(JsonField.of(value))
            }

            /** An enum containing [Channel]'s known values. */
            enum class Known {
                /** Send one-time passcodes over SMS. */
                SMS,
                /** Send one-time passcodes over email. */
                EMAIL,
            }

            /**
             * An enum containing [Channel]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Channel] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /** Send one-time passcodes over SMS. */
                SMS,
                /** Send one-time passcodes over email. */
                EMAIL,
                /**
                 * An enum member indicating that [Channel] was instantiated with an unknown value.
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
                    SMS -> Value.SMS
                    EMAIL -> Value.EMAIL
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
                    SMS -> Known.SMS
                    EMAIL -> Known.EMAIL
                    else -> throw IncreaseInvalidDataException("Unknown Channel: $value")
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

            fun validate(): Channel = apply {
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

                return other is Channel && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** The digital wallet app being used. */
        class DigitalWallet @JsonCreator private constructor(private val value: JsonField<String>) :
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

                /** Apple Pay */
                @JvmField val APPLE_PAY = of("apple_pay")

                /** Google Pay */
                @JvmField val GOOGLE_PAY = of("google_pay")

                /** Samsung Pay */
                @JvmField val SAMSUNG_PAY = of("samsung_pay")

                /** Unknown */
                @JvmField val UNKNOWN = of("unknown")

                @JvmStatic fun of(value: String) = DigitalWallet(JsonField.of(value))
            }

            /** An enum containing [DigitalWallet]'s known values. */
            enum class Known {
                /** Apple Pay */
                APPLE_PAY,
                /** Google Pay */
                GOOGLE_PAY,
                /** Samsung Pay */
                SAMSUNG_PAY,
                /** Unknown */
                UNKNOWN,
            }

            /**
             * An enum containing [DigitalWallet]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [DigitalWallet] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /** Apple Pay */
                APPLE_PAY,
                /** Google Pay */
                GOOGLE_PAY,
                /** Samsung Pay */
                SAMSUNG_PAY,
                /** Unknown */
                UNKNOWN,
                /**
                 * An enum member indicating that [DigitalWallet] was instantiated with an unknown
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
                    APPLE_PAY -> Value.APPLE_PAY
                    GOOGLE_PAY -> Value.GOOGLE_PAY
                    SAMSUNG_PAY -> Value.SAMSUNG_PAY
                    UNKNOWN -> Value.UNKNOWN
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
                    APPLE_PAY -> Known.APPLE_PAY
                    GOOGLE_PAY -> Known.GOOGLE_PAY
                    SAMSUNG_PAY -> Known.SAMSUNG_PAY
                    UNKNOWN -> Known.UNKNOWN
                    else -> throw IncreaseInvalidDataException("Unknown DigitalWallet: $value")
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

            fun validate(): DigitalWallet = apply {
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

                return other is DigitalWallet && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Whether your application successfully delivered the one-time passcode. */
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

                return other is Result && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DigitalWalletAuthentication &&
                cardId == other.cardId &&
                channel == other.channel &&
                digitalWallet == other.digitalWallet &&
                email == other.email &&
                oneTimePasscode == other.oneTimePasscode &&
                phone == other.phone &&
                result == other.result &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                cardId,
                channel,
                digitalWallet,
                email,
                oneTimePasscode,
                phone,
                result,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DigitalWalletAuthentication{cardId=$cardId, channel=$channel, digitalWallet=$digitalWallet, email=$email, oneTimePasscode=$oneTimePasscode, phone=$phone, result=$result, additionalProperties=$additionalProperties}"
    }

    /** Fields related to a digital wallet token provisioning attempt. */
    class DigitalWalletToken
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val cardId: JsonField<String>,
        private val decision: JsonField<Decision>,
        private val device: JsonField<Device>,
        private val digitalWallet: JsonField<DigitalWallet>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("card_id") @ExcludeMissing cardId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("decision")
            @ExcludeMissing
            decision: JsonField<Decision> = JsonMissing.of(),
            @JsonProperty("device") @ExcludeMissing device: JsonField<Device> = JsonMissing.of(),
            @JsonProperty("digital_wallet")
            @ExcludeMissing
            digitalWallet: JsonField<DigitalWallet> = JsonMissing.of(),
        ) : this(cardId, decision, device, digitalWallet, mutableMapOf())

        /**
         * The identifier of the Card that is being tokenized.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun cardId(): String = cardId.getRequired("card_id")

        /**
         * Whether or not the provisioning request was approved. This will be null until the real
         * time decision is responded to.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun decision(): Optional<Decision> = decision.getOptional("decision")

        /**
         * Device that is being used to provision the digital wallet token.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun device(): Device = device.getRequired("device")

        /**
         * The digital wallet app being used.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun digitalWallet(): DigitalWallet = digitalWallet.getRequired("digital_wallet")

        /**
         * Returns the raw JSON value of [cardId].
         *
         * Unlike [cardId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("card_id") @ExcludeMissing fun _cardId(): JsonField<String> = cardId

        /**
         * Returns the raw JSON value of [decision].
         *
         * Unlike [decision], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("decision") @ExcludeMissing fun _decision(): JsonField<Decision> = decision

        /**
         * Returns the raw JSON value of [device].
         *
         * Unlike [device], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("device") @ExcludeMissing fun _device(): JsonField<Device> = device

        /**
         * Returns the raw JSON value of [digitalWallet].
         *
         * Unlike [digitalWallet], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("digital_wallet")
        @ExcludeMissing
        fun _digitalWallet(): JsonField<DigitalWallet> = digitalWallet

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
             * Returns a mutable builder for constructing an instance of [DigitalWalletToken].
             *
             * The following fields are required:
             * ```java
             * .cardId()
             * .decision()
             * .device()
             * .digitalWallet()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [DigitalWalletToken]. */
        class Builder internal constructor() {

            private var cardId: JsonField<String>? = null
            private var decision: JsonField<Decision>? = null
            private var device: JsonField<Device>? = null
            private var digitalWallet: JsonField<DigitalWallet>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(digitalWalletToken: DigitalWalletToken) = apply {
                cardId = digitalWalletToken.cardId
                decision = digitalWalletToken.decision
                device = digitalWalletToken.device
                digitalWallet = digitalWalletToken.digitalWallet
                additionalProperties = digitalWalletToken.additionalProperties.toMutableMap()
            }

            /** The identifier of the Card that is being tokenized. */
            fun cardId(cardId: String) = cardId(JsonField.of(cardId))

            /**
             * Sets [Builder.cardId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cardId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cardId(cardId: JsonField<String>) = apply { this.cardId = cardId }

            /**
             * Whether or not the provisioning request was approved. This will be null until the
             * real time decision is responded to.
             */
            fun decision(decision: Decision?) = decision(JsonField.ofNullable(decision))

            /** Alias for calling [Builder.decision] with `decision.orElse(null)`. */
            fun decision(decision: Optional<Decision>) = decision(decision.getOrNull())

            /**
             * Sets [Builder.decision] to an arbitrary JSON value.
             *
             * You should usually call [Builder.decision] with a well-typed [Decision] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun decision(decision: JsonField<Decision>) = apply { this.decision = decision }

            /** Device that is being used to provision the digital wallet token. */
            fun device(device: Device) = device(JsonField.of(device))

            /**
             * Sets [Builder.device] to an arbitrary JSON value.
             *
             * You should usually call [Builder.device] with a well-typed [Device] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun device(device: JsonField<Device>) = apply { this.device = device }

            /** The digital wallet app being used. */
            fun digitalWallet(digitalWallet: DigitalWallet) =
                digitalWallet(JsonField.of(digitalWallet))

            /**
             * Sets [Builder.digitalWallet] to an arbitrary JSON value.
             *
             * You should usually call [Builder.digitalWallet] with a well-typed [DigitalWallet]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun digitalWallet(digitalWallet: JsonField<DigitalWallet>) = apply {
                this.digitalWallet = digitalWallet
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
             * Returns an immutable instance of [DigitalWalletToken].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .cardId()
             * .decision()
             * .device()
             * .digitalWallet()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): DigitalWalletToken =
                DigitalWalletToken(
                    checkRequired("cardId", cardId),
                    checkRequired("decision", decision),
                    checkRequired("device", device),
                    checkRequired("digitalWallet", digitalWallet),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): DigitalWalletToken = apply {
            if (validated) {
                return@apply
            }

            cardId()
            decision().ifPresent { it.validate() }
            device().validate()
            digitalWallet().validate()
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
            (if (cardId.asKnown().isPresent) 1 else 0) +
                (decision.asKnown().getOrNull()?.validity() ?: 0) +
                (device.asKnown().getOrNull()?.validity() ?: 0) +
                (digitalWallet.asKnown().getOrNull()?.validity() ?: 0)

        /**
         * Whether or not the provisioning request was approved. This will be null until the real
         * time decision is responded to.
         */
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

                /** Approve the provisioning request. */
                @JvmField val APPROVE = of("approve")

                /** Decline the provisioning request. */
                @JvmField val DECLINE = of("decline")

                @JvmStatic fun of(value: String) = Decision(JsonField.of(value))
            }

            /** An enum containing [Decision]'s known values. */
            enum class Known {
                /** Approve the provisioning request. */
                APPROVE,
                /** Decline the provisioning request. */
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
                /** Approve the provisioning request. */
                APPROVE,
                /** Decline the provisioning request. */
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

                return other is Decision && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Device that is being used to provision the digital wallet token. */
        class Device
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val identifier: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("identifier")
                @ExcludeMissing
                identifier: JsonField<String> = JsonMissing.of()
            ) : this(identifier, mutableMapOf())

            /**
             * ID assigned to the device by the digital wallet provider.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun identifier(): Optional<String> = identifier.getOptional("identifier")

            /**
             * Returns the raw JSON value of [identifier].
             *
             * Unlike [identifier], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("identifier")
            @ExcludeMissing
            fun _identifier(): JsonField<String> = identifier

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
                 * Returns a mutable builder for constructing an instance of [Device].
                 *
                 * The following fields are required:
                 * ```java
                 * .identifier()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Device]. */
            class Builder internal constructor() {

                private var identifier: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(device: Device) = apply {
                    identifier = device.identifier
                    additionalProperties = device.additionalProperties.toMutableMap()
                }

                /** ID assigned to the device by the digital wallet provider. */
                fun identifier(identifier: String?) = identifier(JsonField.ofNullable(identifier))

                /** Alias for calling [Builder.identifier] with `identifier.orElse(null)`. */
                fun identifier(identifier: Optional<String>) = identifier(identifier.getOrNull())

                /**
                 * Sets [Builder.identifier] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.identifier] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun identifier(identifier: JsonField<String>) = apply {
                    this.identifier = identifier
                }

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
                 * Returns an immutable instance of [Device].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .identifier()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Device =
                    Device(
                        checkRequired("identifier", identifier),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Device = apply {
                if (validated) {
                    return@apply
                }

                identifier()
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
            internal fun validity(): Int = (if (identifier.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Device &&
                    identifier == other.identifier &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(identifier, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Device{identifier=$identifier, additionalProperties=$additionalProperties}"
        }

        /** The digital wallet app being used. */
        class DigitalWallet @JsonCreator private constructor(private val value: JsonField<String>) :
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

                /** Apple Pay */
                @JvmField val APPLE_PAY = of("apple_pay")

                /** Google Pay */
                @JvmField val GOOGLE_PAY = of("google_pay")

                /** Samsung Pay */
                @JvmField val SAMSUNG_PAY = of("samsung_pay")

                /** Unknown */
                @JvmField val UNKNOWN = of("unknown")

                @JvmStatic fun of(value: String) = DigitalWallet(JsonField.of(value))
            }

            /** An enum containing [DigitalWallet]'s known values. */
            enum class Known {
                /** Apple Pay */
                APPLE_PAY,
                /** Google Pay */
                GOOGLE_PAY,
                /** Samsung Pay */
                SAMSUNG_PAY,
                /** Unknown */
                UNKNOWN,
            }

            /**
             * An enum containing [DigitalWallet]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [DigitalWallet] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /** Apple Pay */
                APPLE_PAY,
                /** Google Pay */
                GOOGLE_PAY,
                /** Samsung Pay */
                SAMSUNG_PAY,
                /** Unknown */
                UNKNOWN,
                /**
                 * An enum member indicating that [DigitalWallet] was instantiated with an unknown
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
                    APPLE_PAY -> Value.APPLE_PAY
                    GOOGLE_PAY -> Value.GOOGLE_PAY
                    SAMSUNG_PAY -> Value.SAMSUNG_PAY
                    UNKNOWN -> Value.UNKNOWN
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
                    APPLE_PAY -> Known.APPLE_PAY
                    GOOGLE_PAY -> Known.GOOGLE_PAY
                    SAMSUNG_PAY -> Known.SAMSUNG_PAY
                    UNKNOWN -> Known.UNKNOWN
                    else -> throw IncreaseInvalidDataException("Unknown DigitalWallet: $value")
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

            fun validate(): DigitalWallet = apply {
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

                return other is DigitalWallet && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DigitalWalletToken &&
                cardId == other.cardId &&
                decision == other.decision &&
                device == other.device &&
                digitalWallet == other.digitalWallet &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(cardId, decision, device, digitalWallet, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DigitalWalletToken{cardId=$cardId, decision=$decision, device=$device, digitalWallet=$digitalWallet, additionalProperties=$additionalProperties}"
    }

    /** The status of the Real-Time Decision. */
    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            /** The decision is pending action via real-time webhook. */
            @JvmField val PENDING = of("pending")

            /** Your webhook actioned the real-time decision. */
            @JvmField val RESPONDED = of("responded")

            /** Your webhook failed to respond to the authorization in time. */
            @JvmField val TIMED_OUT = of("timed_out")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            /** The decision is pending action via real-time webhook. */
            PENDING,
            /** Your webhook actioned the real-time decision. */
            RESPONDED,
            /** Your webhook failed to respond to the authorization in time. */
            TIMED_OUT,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            /** The decision is pending action via real-time webhook. */
            PENDING,
            /** Your webhook actioned the real-time decision. */
            RESPONDED,
            /** Your webhook failed to respond to the authorization in time. */
            TIMED_OUT,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
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
                PENDING -> Value.PENDING
                RESPONDED -> Value.RESPONDED
                TIMED_OUT -> Value.TIMED_OUT
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
                PENDING -> Known.PENDING
                RESPONDED -> Known.RESPONDED
                TIMED_OUT -> Known.TIMED_OUT
                else -> throw IncreaseInvalidDataException("Unknown Status: $value")
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

        private var validated: Boolean = false

        fun validate(): Status = apply {
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

            return other is Status && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * A constant representing the object's type. For this resource it will always be
     * `real_time_decision`.
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

            @JvmField val REAL_TIME_DECISION = of("real_time_decision")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            REAL_TIME_DECISION
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
            REAL_TIME_DECISION,
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
                REAL_TIME_DECISION -> Value.REAL_TIME_DECISION
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
                REAL_TIME_DECISION -> Known.REAL_TIME_DECISION
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

        private var validated: Boolean = false

        fun validate(): Type = apply {
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

            return other is Type && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RealTimeDecision &&
            id == other.id &&
            cardAuthentication == other.cardAuthentication &&
            cardAuthenticationChallenge == other.cardAuthenticationChallenge &&
            cardAuthorization == other.cardAuthorization &&
            category == other.category &&
            createdAt == other.createdAt &&
            digitalWalletAuthentication == other.digitalWalletAuthentication &&
            digitalWalletToken == other.digitalWalletToken &&
            status == other.status &&
            timeoutAt == other.timeoutAt &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            cardAuthentication,
            cardAuthenticationChallenge,
            cardAuthorization,
            category,
            createdAt,
            digitalWalletAuthentication,
            digitalWalletToken,
            status,
            timeoutAt,
            type,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RealTimeDecision{id=$id, cardAuthentication=$cardAuthentication, cardAuthenticationChallenge=$cardAuthenticationChallenge, cardAuthorization=$cardAuthorization, category=$category, createdAt=$createdAt, digitalWalletAuthentication=$digitalWalletAuthentication, digitalWalletToken=$digitalWalletToken, status=$status, timeoutAt=$timeoutAt, type=$type, additionalProperties=$additionalProperties}"
}
