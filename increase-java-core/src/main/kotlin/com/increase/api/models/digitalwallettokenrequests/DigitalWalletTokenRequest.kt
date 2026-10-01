// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.digitalwallettokenrequests

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
 * A Digital Wallet Token Request is created each time a digital wallet app, such as Apple Pay or
 * Google Pay, requests to tokenize a Card.
 */
class DigitalWalletTokenRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val cardId: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val declined: JsonField<Declined>,
    private val device: JsonField<Device>,
    private val outcome: JsonField<Outcome>,
    private val provisioned: JsonField<Provisioned>,
    private val tokenReferenceIdentifier: JsonField<String>,
    private val tokenRequestor: JsonField<TokenRequestor>,
    private val type: JsonField<Type>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("card_id") @ExcludeMissing cardId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("declined") @ExcludeMissing declined: JsonField<Declined> = JsonMissing.of(),
        @JsonProperty("device") @ExcludeMissing device: JsonField<Device> = JsonMissing.of(),
        @JsonProperty("outcome") @ExcludeMissing outcome: JsonField<Outcome> = JsonMissing.of(),
        @JsonProperty("provisioned")
        @ExcludeMissing
        provisioned: JsonField<Provisioned> = JsonMissing.of(),
        @JsonProperty("token_reference_identifier")
        @ExcludeMissing
        tokenReferenceIdentifier: JsonField<String> = JsonMissing.of(),
        @JsonProperty("token_requestor")
        @ExcludeMissing
        tokenRequestor: JsonField<TokenRequestor> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
    ) : this(
        id,
        cardId,
        createdAt,
        declined,
        device,
        outcome,
        provisioned,
        tokenReferenceIdentifier,
        tokenRequestor,
        type,
        mutableMapOf(),
    )

    /**
     * The Digital Wallet Token Request identifier.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The identifier of the Card the tokenization was requested for.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun cardId(): String = cardId.getRequired("card_id")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the Digital
     * Wallet Token Request was created.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * Details of the decline. Present if and only if `outcome` is `declined`.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun declined(): Optional<Declined> = declined.getOptional("declined")

    /**
     * The device that requested the tokenization.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun device(): Device = device.getRequired("device")

    /**
     * The outcome of the tokenization request.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun outcome(): Outcome = outcome.getRequired("outcome")

    /**
     * Details of the provisioned Digital Wallet Token. Present if and only if `outcome` is
     * `provisioned`.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun provisioned(): Optional<Provisioned> = provisioned.getOptional("provisioned")

    /**
     * The reference identifier assigned by the card network to the token.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tokenReferenceIdentifier(): String =
        tokenReferenceIdentifier.getRequired("token_reference_identifier")

    /**
     * The digital wallet app being used.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tokenRequestor(): TokenRequestor = tokenRequestor.getRequired("token_requestor")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `digital_wallet_token_request`.
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
     * Returns the raw JSON value of [cardId].
     *
     * Unlike [cardId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("card_id") @ExcludeMissing fun _cardId(): JsonField<String> = cardId

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [declined].
     *
     * Unlike [declined], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("declined") @ExcludeMissing fun _declined(): JsonField<Declined> = declined

    /**
     * Returns the raw JSON value of [device].
     *
     * Unlike [device], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("device") @ExcludeMissing fun _device(): JsonField<Device> = device

    /**
     * Returns the raw JSON value of [outcome].
     *
     * Unlike [outcome], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("outcome") @ExcludeMissing fun _outcome(): JsonField<Outcome> = outcome

    /**
     * Returns the raw JSON value of [provisioned].
     *
     * Unlike [provisioned], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("provisioned")
    @ExcludeMissing
    fun _provisioned(): JsonField<Provisioned> = provisioned

    /**
     * Returns the raw JSON value of [tokenReferenceIdentifier].
     *
     * Unlike [tokenReferenceIdentifier], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("token_reference_identifier")
    @ExcludeMissing
    fun _tokenReferenceIdentifier(): JsonField<String> = tokenReferenceIdentifier

    /**
     * Returns the raw JSON value of [tokenRequestor].
     *
     * Unlike [tokenRequestor], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("token_requestor")
    @ExcludeMissing
    fun _tokenRequestor(): JsonField<TokenRequestor> = tokenRequestor

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
         * Returns a mutable builder for constructing an instance of [DigitalWalletTokenRequest].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .cardId()
         * .createdAt()
         * .declined()
         * .device()
         * .outcome()
         * .provisioned()
         * .tokenReferenceIdentifier()
         * .tokenRequestor()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DigitalWalletTokenRequest]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var cardId: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var declined: JsonField<Declined>? = null
        private var device: JsonField<Device>? = null
        private var outcome: JsonField<Outcome>? = null
        private var provisioned: JsonField<Provisioned>? = null
        private var tokenReferenceIdentifier: JsonField<String>? = null
        private var tokenRequestor: JsonField<TokenRequestor>? = null
        private var type: JsonField<Type>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(digitalWalletTokenRequest: DigitalWalletTokenRequest) = apply {
            id = digitalWalletTokenRequest.id
            cardId = digitalWalletTokenRequest.cardId
            createdAt = digitalWalletTokenRequest.createdAt
            declined = digitalWalletTokenRequest.declined
            device = digitalWalletTokenRequest.device
            outcome = digitalWalletTokenRequest.outcome
            provisioned = digitalWalletTokenRequest.provisioned
            tokenReferenceIdentifier = digitalWalletTokenRequest.tokenReferenceIdentifier
            tokenRequestor = digitalWalletTokenRequest.tokenRequestor
            type = digitalWalletTokenRequest.type
            additionalProperties = digitalWalletTokenRequest.additionalProperties.toMutableMap()
        }

        /** The Digital Wallet Token Request identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The identifier of the Card the tokenization was requested for. */
        fun cardId(cardId: String) = cardId(JsonField.of(cardId))

        /**
         * Sets [Builder.cardId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cardId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun cardId(cardId: JsonField<String>) = apply { this.cardId = cardId }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the Digital
         * Wallet Token Request was created.
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

        /** Details of the decline. Present if and only if `outcome` is `declined`. */
        fun declined(declined: Declined?) = declined(JsonField.ofNullable(declined))

        /** Alias for calling [Builder.declined] with `declined.orElse(null)`. */
        fun declined(declined: Optional<Declined>) = declined(declined.getOrNull())

        /**
         * Sets [Builder.declined] to an arbitrary JSON value.
         *
         * You should usually call [Builder.declined] with a well-typed [Declined] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun declined(declined: JsonField<Declined>) = apply { this.declined = declined }

        /** The device that requested the tokenization. */
        fun device(device: Device) = device(JsonField.of(device))

        /**
         * Sets [Builder.device] to an arbitrary JSON value.
         *
         * You should usually call [Builder.device] with a well-typed [Device] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun device(device: JsonField<Device>) = apply { this.device = device }

        /** The outcome of the tokenization request. */
        fun outcome(outcome: Outcome) = outcome(JsonField.of(outcome))

        /**
         * Sets [Builder.outcome] to an arbitrary JSON value.
         *
         * You should usually call [Builder.outcome] with a well-typed [Outcome] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun outcome(outcome: JsonField<Outcome>) = apply { this.outcome = outcome }

        /**
         * Details of the provisioned Digital Wallet Token. Present if and only if `outcome` is
         * `provisioned`.
         */
        fun provisioned(provisioned: Provisioned?) = provisioned(JsonField.ofNullable(provisioned))

        /** Alias for calling [Builder.provisioned] with `provisioned.orElse(null)`. */
        fun provisioned(provisioned: Optional<Provisioned>) = provisioned(provisioned.getOrNull())

        /**
         * Sets [Builder.provisioned] to an arbitrary JSON value.
         *
         * You should usually call [Builder.provisioned] with a well-typed [Provisioned] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun provisioned(provisioned: JsonField<Provisioned>) = apply {
            this.provisioned = provisioned
        }

        /** The reference identifier assigned by the card network to the token. */
        fun tokenReferenceIdentifier(tokenReferenceIdentifier: String) =
            tokenReferenceIdentifier(JsonField.of(tokenReferenceIdentifier))

        /**
         * Sets [Builder.tokenReferenceIdentifier] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tokenReferenceIdentifier] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun tokenReferenceIdentifier(tokenReferenceIdentifier: JsonField<String>) = apply {
            this.tokenReferenceIdentifier = tokenReferenceIdentifier
        }

        /** The digital wallet app being used. */
        fun tokenRequestor(tokenRequestor: TokenRequestor) =
            tokenRequestor(JsonField.of(tokenRequestor))

        /**
         * Sets [Builder.tokenRequestor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tokenRequestor] with a well-typed [TokenRequestor] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun tokenRequestor(tokenRequestor: JsonField<TokenRequestor>) = apply {
            this.tokenRequestor = tokenRequestor
        }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `digital_wallet_token_request`.
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
         * Returns an immutable instance of [DigitalWalletTokenRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .cardId()
         * .createdAt()
         * .declined()
         * .device()
         * .outcome()
         * .provisioned()
         * .tokenReferenceIdentifier()
         * .tokenRequestor()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DigitalWalletTokenRequest =
            DigitalWalletTokenRequest(
                checkRequired("id", id),
                checkRequired("cardId", cardId),
                checkRequired("createdAt", createdAt),
                checkRequired("declined", declined),
                checkRequired("device", device),
                checkRequired("outcome", outcome),
                checkRequired("provisioned", provisioned),
                checkRequired("tokenReferenceIdentifier", tokenReferenceIdentifier),
                checkRequired("tokenRequestor", tokenRequestor),
                checkRequired("type", type),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws IncreaseInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): DigitalWalletTokenRequest = apply {
        if (validated) {
            return@apply
        }

        id()
        cardId()
        createdAt()
        declined().ifPresent { it.validate() }
        device().validate()
        outcome().validate()
        provisioned().ifPresent { it.validate() }
        tokenReferenceIdentifier()
        tokenRequestor().validate()
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
            (if (cardId.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (declined.asKnown().getOrNull()?.validity() ?: 0) +
            (device.asKnown().getOrNull()?.validity() ?: 0) +
            (outcome.asKnown().getOrNull()?.validity() ?: 0) +
            (provisioned.asKnown().getOrNull()?.validity() ?: 0) +
            (if (tokenReferenceIdentifier.asKnown().isPresent) 1 else 0) +
            (tokenRequestor.asKnown().getOrNull()?.validity() ?: 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0)

    /** Details of the decline. Present if and only if `outcome` is `declined`. */
    class Declined
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val reason: JsonField<Reason>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("reason") @ExcludeMissing reason: JsonField<Reason> = JsonMissing.of()
        ) : this(reason, mutableMapOf())

        /**
         * The reason the tokenization was declined.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun reason(): Reason = reason.getRequired("reason")

        /**
         * Returns the raw JSON value of [reason].
         *
         * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<Reason> = reason

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
             * Returns a mutable builder for constructing an instance of [Declined].
             *
             * The following fields are required:
             * ```java
             * .reason()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Declined]. */
        class Builder internal constructor() {

            private var reason: JsonField<Reason>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(declined: Declined) = apply {
                reason = declined.reason
                additionalProperties = declined.additionalProperties.toMutableMap()
            }

            /** The reason the tokenization was declined. */
            fun reason(reason: Reason) = reason(JsonField.of(reason))

            /**
             * Sets [Builder.reason] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reason] with a well-typed [Reason] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reason(reason: JsonField<Reason>) = apply { this.reason = reason }

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
             * Returns an immutable instance of [Declined].
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
            fun build(): Declined =
                Declined(checkRequired("reason", reason), additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws IncreaseInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Declined = apply {
            if (validated) {
                return@apply
            }

            reason().validate()
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
        @JvmSynthetic internal fun validity(): Int = (reason.asKnown().getOrNull()?.validity() ?: 0)

        /** The reason the tokenization was declined. */
        class Reason @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                /** The card is not active. */
                @JvmField val CARD_NOT_ACTIVE = of("card_not_active")

                /** The card does not have a two-factor authentication method. */
                @JvmField val NO_VERIFICATION_METHOD = of("no_verification_method")

                /** Your webhook timed out when evaluating the token provisioning attempt. */
                @JvmField val WEBHOOK_TIMED_OUT = of("webhook_timed_out")

                /** Your webhook declined the token provisioning attempt. */
                @JvmField val WEBHOOK_DECLINED = of("webhook_declined")

                /**
                 * The tokenization attempt failed because the Card Verification Code (CVC) was
                 * incorrect.
                 */
                @JvmField
                val INCORRECT_CARD_VERIFICATION_CODE = of("incorrect_card_verification_code")

                /** The tokenization attempt was declined by the token requestor. */
                @JvmField val DECLINED_BY_TOKEN_REQUESTOR = of("declined_by_token_requestor")

                /** The group was locked. */
                @JvmField val GROUP_LOCKED = of("group_locked")

                /** The account has been closed. */
                @JvmField val ACCOUNT_CLOSED = of("account_closed")

                /** The account's entity was not active. */
                @JvmField val ENTITY_NOT_ACTIVE = of("entity_not_active")

                @JvmStatic fun of(value: String) = Reason(JsonField.of(value))
            }

            /** An enum containing [Reason]'s known values. */
            enum class Known {
                /** The card is not active. */
                CARD_NOT_ACTIVE,
                /** The card does not have a two-factor authentication method. */
                NO_VERIFICATION_METHOD,
                /** Your webhook timed out when evaluating the token provisioning attempt. */
                WEBHOOK_TIMED_OUT,
                /** Your webhook declined the token provisioning attempt. */
                WEBHOOK_DECLINED,
                /**
                 * The tokenization attempt failed because the Card Verification Code (CVC) was
                 * incorrect.
                 */
                INCORRECT_CARD_VERIFICATION_CODE,
                /** The tokenization attempt was declined by the token requestor. */
                DECLINED_BY_TOKEN_REQUESTOR,
                /** The group was locked. */
                GROUP_LOCKED,
                /** The account has been closed. */
                ACCOUNT_CLOSED,
                /** The account's entity was not active. */
                ENTITY_NOT_ACTIVE,
            }

            /**
             * An enum containing [Reason]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Reason] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
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
                 * The tokenization attempt failed because the Card Verification Code (CVC) was
                 * incorrect.
                 */
                INCORRECT_CARD_VERIFICATION_CODE,
                /** The tokenization attempt was declined by the token requestor. */
                DECLINED_BY_TOKEN_REQUESTOR,
                /** The group was locked. */
                GROUP_LOCKED,
                /** The account has been closed. */
                ACCOUNT_CLOSED,
                /** The account's entity was not active. */
                ENTITY_NOT_ACTIVE,
                /**
                 * An enum member indicating that [Reason] was instantiated with an unknown value.
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
                    CARD_NOT_ACTIVE -> Value.CARD_NOT_ACTIVE
                    NO_VERIFICATION_METHOD -> Value.NO_VERIFICATION_METHOD
                    WEBHOOK_TIMED_OUT -> Value.WEBHOOK_TIMED_OUT
                    WEBHOOK_DECLINED -> Value.WEBHOOK_DECLINED
                    INCORRECT_CARD_VERIFICATION_CODE -> Value.INCORRECT_CARD_VERIFICATION_CODE
                    DECLINED_BY_TOKEN_REQUESTOR -> Value.DECLINED_BY_TOKEN_REQUESTOR
                    GROUP_LOCKED -> Value.GROUP_LOCKED
                    ACCOUNT_CLOSED -> Value.ACCOUNT_CLOSED
                    ENTITY_NOT_ACTIVE -> Value.ENTITY_NOT_ACTIVE
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
                    CARD_NOT_ACTIVE -> Known.CARD_NOT_ACTIVE
                    NO_VERIFICATION_METHOD -> Known.NO_VERIFICATION_METHOD
                    WEBHOOK_TIMED_OUT -> Known.WEBHOOK_TIMED_OUT
                    WEBHOOK_DECLINED -> Known.WEBHOOK_DECLINED
                    INCORRECT_CARD_VERIFICATION_CODE -> Known.INCORRECT_CARD_VERIFICATION_CODE
                    DECLINED_BY_TOKEN_REQUESTOR -> Known.DECLINED_BY_TOKEN_REQUESTOR
                    GROUP_LOCKED -> Known.GROUP_LOCKED
                    ACCOUNT_CLOSED -> Known.ACCOUNT_CLOSED
                    ENTITY_NOT_ACTIVE -> Known.ENTITY_NOT_ACTIVE
                    else -> throw IncreaseInvalidDataException("Unknown Reason: $value")
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

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws IncreaseInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): Reason = apply {
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

                return other is Reason && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Declined &&
                reason == other.reason &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(reason, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Declined{reason=$reason, additionalProperties=$additionalProperties}"
    }

    /** The device that requested the tokenization. */
    class Device
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val deviceType: JsonField<DeviceType>,
        private val identifier: JsonField<String>,
        private val ipAddress: JsonField<String>,
        private val name: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("device_type")
            @ExcludeMissing
            deviceType: JsonField<DeviceType> = JsonMissing.of(),
            @JsonProperty("identifier")
            @ExcludeMissing
            identifier: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ip_address")
            @ExcludeMissing
            ipAddress: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        ) : this(deviceType, identifier, ipAddress, name, mutableMapOf())

        /**
         * Device type.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun deviceType(): Optional<DeviceType> = deviceType.getOptional("device_type")

        /**
         * ID assigned to the device by the digital wallet provider.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun identifier(): Optional<String> = identifier.getOptional("identifier")

        /**
         * IP address of the device.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun ipAddress(): Optional<String> = ipAddress.getOptional("ip_address")

        /**
         * Name of the device, for example "My Work Phone".
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * Returns the raw JSON value of [deviceType].
         *
         * Unlike [deviceType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("device_type")
        @ExcludeMissing
        fun _deviceType(): JsonField<DeviceType> = deviceType

        /**
         * Returns the raw JSON value of [identifier].
         *
         * Unlike [identifier], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("identifier")
        @ExcludeMissing
        fun _identifier(): JsonField<String> = identifier

        /**
         * Returns the raw JSON value of [ipAddress].
         *
         * Unlike [ipAddress], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ip_address") @ExcludeMissing fun _ipAddress(): JsonField<String> = ipAddress

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
             * .deviceType()
             * .identifier()
             * .ipAddress()
             * .name()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Device]. */
        class Builder internal constructor() {

            private var deviceType: JsonField<DeviceType>? = null
            private var identifier: JsonField<String>? = null
            private var ipAddress: JsonField<String>? = null
            private var name: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(device: Device) = apply {
                deviceType = device.deviceType
                identifier = device.identifier
                ipAddress = device.ipAddress
                name = device.name
                additionalProperties = device.additionalProperties.toMutableMap()
            }

            /** Device type. */
            fun deviceType(deviceType: DeviceType?) = deviceType(JsonField.ofNullable(deviceType))

            /** Alias for calling [Builder.deviceType] with `deviceType.orElse(null)`. */
            fun deviceType(deviceType: Optional<DeviceType>) = deviceType(deviceType.getOrNull())

            /**
             * Sets [Builder.deviceType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.deviceType] with a well-typed [DeviceType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun deviceType(deviceType: JsonField<DeviceType>) = apply {
                this.deviceType = deviceType
            }

            /** ID assigned to the device by the digital wallet provider. */
            fun identifier(identifier: String?) = identifier(JsonField.ofNullable(identifier))

            /** Alias for calling [Builder.identifier] with `identifier.orElse(null)`. */
            fun identifier(identifier: Optional<String>) = identifier(identifier.getOrNull())

            /**
             * Sets [Builder.identifier] to an arbitrary JSON value.
             *
             * You should usually call [Builder.identifier] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun identifier(identifier: JsonField<String>) = apply { this.identifier = identifier }

            /** IP address of the device. */
            fun ipAddress(ipAddress: String?) = ipAddress(JsonField.ofNullable(ipAddress))

            /** Alias for calling [Builder.ipAddress] with `ipAddress.orElse(null)`. */
            fun ipAddress(ipAddress: Optional<String>) = ipAddress(ipAddress.getOrNull())

            /**
             * Sets [Builder.ipAddress] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ipAddress] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ipAddress(ipAddress: JsonField<String>) = apply { this.ipAddress = ipAddress }

            /** Name of the device, for example "My Work Phone". */
            fun name(name: String?) = name(JsonField.ofNullable(name))

            /** Alias for calling [Builder.name] with `name.orElse(null)`. */
            fun name(name: Optional<String>) = name(name.getOrNull())

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

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
             * Returns an immutable instance of [Device].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .deviceType()
             * .identifier()
             * .ipAddress()
             * .name()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Device =
                Device(
                    checkRequired("deviceType", deviceType),
                    checkRequired("identifier", identifier),
                    checkRequired("ipAddress", ipAddress),
                    checkRequired("name", name),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws IncreaseInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Device = apply {
            if (validated) {
                return@apply
            }

            deviceType().ifPresent { it.validate() }
            identifier()
            ipAddress()
            name()
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
            (deviceType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (identifier.asKnown().isPresent) 1 else 0) +
                (if (ipAddress.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0)

        /** Device type. */
        class DeviceType @JsonCreator private constructor(private val value: JsonField<String>) :
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

                /** Unknown */
                @JvmField val UNKNOWN = of("unknown")

                /** Mobile Phone */
                @JvmField val MOBILE_PHONE = of("mobile_phone")

                /** Tablet */
                @JvmField val TABLET = of("tablet")

                /** Watch */
                @JvmField val WATCH = of("watch")

                /** Mobile Phone or Tablet */
                @JvmField val MOBILEPHONE_OR_TABLET = of("mobilephone_or_tablet")

                /** PC */
                @JvmField val PC = of("pc")

                /** Household Device */
                @JvmField val HOUSEHOLD_DEVICE = of("household_device")

                /** Wearable Device */
                @JvmField val WEARABLE_DEVICE = of("wearable_device")

                /** Automobile Device */
                @JvmField val AUTOMOBILE_DEVICE = of("automobile_device")

                @JvmStatic fun of(value: String) = DeviceType(JsonField.of(value))
            }

            /** An enum containing [DeviceType]'s known values. */
            enum class Known {
                /** Unknown */
                UNKNOWN,
                /** Mobile Phone */
                MOBILE_PHONE,
                /** Tablet */
                TABLET,
                /** Watch */
                WATCH,
                /** Mobile Phone or Tablet */
                MOBILEPHONE_OR_TABLET,
                /** PC */
                PC,
                /** Household Device */
                HOUSEHOLD_DEVICE,
                /** Wearable Device */
                WEARABLE_DEVICE,
                /** Automobile Device */
                AUTOMOBILE_DEVICE,
            }

            /**
             * An enum containing [DeviceType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [DeviceType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /** Unknown */
                UNKNOWN,
                /** Mobile Phone */
                MOBILE_PHONE,
                /** Tablet */
                TABLET,
                /** Watch */
                WATCH,
                /** Mobile Phone or Tablet */
                MOBILEPHONE_OR_TABLET,
                /** PC */
                PC,
                /** Household Device */
                HOUSEHOLD_DEVICE,
                /** Wearable Device */
                WEARABLE_DEVICE,
                /** Automobile Device */
                AUTOMOBILE_DEVICE,
                /**
                 * An enum member indicating that [DeviceType] was instantiated with an unknown
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
                    UNKNOWN -> Value.UNKNOWN
                    MOBILE_PHONE -> Value.MOBILE_PHONE
                    TABLET -> Value.TABLET
                    WATCH -> Value.WATCH
                    MOBILEPHONE_OR_TABLET -> Value.MOBILEPHONE_OR_TABLET
                    PC -> Value.PC
                    HOUSEHOLD_DEVICE -> Value.HOUSEHOLD_DEVICE
                    WEARABLE_DEVICE -> Value.WEARABLE_DEVICE
                    AUTOMOBILE_DEVICE -> Value.AUTOMOBILE_DEVICE
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
                    UNKNOWN -> Known.UNKNOWN
                    MOBILE_PHONE -> Known.MOBILE_PHONE
                    TABLET -> Known.TABLET
                    WATCH -> Known.WATCH
                    MOBILEPHONE_OR_TABLET -> Known.MOBILEPHONE_OR_TABLET
                    PC -> Known.PC
                    HOUSEHOLD_DEVICE -> Known.HOUSEHOLD_DEVICE
                    WEARABLE_DEVICE -> Known.WEARABLE_DEVICE
                    AUTOMOBILE_DEVICE -> Known.AUTOMOBILE_DEVICE
                    else -> throw IncreaseInvalidDataException("Unknown DeviceType: $value")
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

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws IncreaseInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): DeviceType = apply {
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

                return other is DeviceType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Device &&
                deviceType == other.deviceType &&
                identifier == other.identifier &&
                ipAddress == other.ipAddress &&
                name == other.name &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(deviceType, identifier, ipAddress, name, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Device{deviceType=$deviceType, identifier=$identifier, ipAddress=$ipAddress, name=$name, additionalProperties=$additionalProperties}"
    }

    /** The outcome of the tokenization request. */
    class Outcome @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            /** The tokenization request was approved and a Digital Wallet Token was provisioned. */
            @JvmField val PROVISIONED = of("provisioned")

            /** The tokenization request was declined. */
            @JvmField val DECLINED = of("declined")

            @JvmStatic fun of(value: String) = Outcome(JsonField.of(value))
        }

        /** An enum containing [Outcome]'s known values. */
        enum class Known {
            /** The tokenization request was approved and a Digital Wallet Token was provisioned. */
            PROVISIONED,
            /** The tokenization request was declined. */
            DECLINED,
        }

        /**
         * An enum containing [Outcome]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Outcome] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            /** The tokenization request was approved and a Digital Wallet Token was provisioned. */
            PROVISIONED,
            /** The tokenization request was declined. */
            DECLINED,
            /** An enum member indicating that [Outcome] was instantiated with an unknown value. */
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
                PROVISIONED -> Value.PROVISIONED
                DECLINED -> Value.DECLINED
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
                PROVISIONED -> Known.PROVISIONED
                DECLINED -> Known.DECLINED
                else -> throw IncreaseInvalidDataException("Unknown Outcome: $value")
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws IncreaseInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Outcome = apply {
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

            return other is Outcome && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Details of the provisioned Digital Wallet Token. Present if and only if `outcome` is
     * `provisioned`.
     */
    class Provisioned
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val digitalWalletTokenId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("digital_wallet_token_id")
            @ExcludeMissing
            digitalWalletTokenId: JsonField<String> = JsonMissing.of()
        ) : this(digitalWalletTokenId, mutableMapOf())

        /**
         * The identifier of the Digital Wallet Token that was provisioned.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun digitalWalletTokenId(): String =
            digitalWalletTokenId.getRequired("digital_wallet_token_id")

        /**
         * Returns the raw JSON value of [digitalWalletTokenId].
         *
         * Unlike [digitalWalletTokenId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("digital_wallet_token_id")
        @ExcludeMissing
        fun _digitalWalletTokenId(): JsonField<String> = digitalWalletTokenId

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
             * Returns a mutable builder for constructing an instance of [Provisioned].
             *
             * The following fields are required:
             * ```java
             * .digitalWalletTokenId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Provisioned]. */
        class Builder internal constructor() {

            private var digitalWalletTokenId: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(provisioned: Provisioned) = apply {
                digitalWalletTokenId = provisioned.digitalWalletTokenId
                additionalProperties = provisioned.additionalProperties.toMutableMap()
            }

            /** The identifier of the Digital Wallet Token that was provisioned. */
            fun digitalWalletTokenId(digitalWalletTokenId: String) =
                digitalWalletTokenId(JsonField.of(digitalWalletTokenId))

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
             * Returns an immutable instance of [Provisioned].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .digitalWalletTokenId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Provisioned =
                Provisioned(
                    checkRequired("digitalWalletTokenId", digitalWalletTokenId),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws IncreaseInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Provisioned = apply {
            if (validated) {
                return@apply
            }

            digitalWalletTokenId()
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
        internal fun validity(): Int = (if (digitalWalletTokenId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Provisioned &&
                digitalWalletTokenId == other.digitalWalletTokenId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(digitalWalletTokenId, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Provisioned{digitalWalletTokenId=$digitalWalletTokenId, additionalProperties=$additionalProperties}"
    }

    /** The digital wallet app being used. */
    class TokenRequestor @JsonCreator private constructor(private val value: JsonField<String>) :
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

            /** Apple Pay */
            @JvmField val APPLE_PAY = of("apple_pay")

            /** Google Pay */
            @JvmField val GOOGLE_PAY = of("google_pay")

            /** Samsung Pay */
            @JvmField val SAMSUNG_PAY = of("samsung_pay")

            /** Garmin Pay */
            @JvmField val GARMIN_PAY = of("garmin_pay")

            /** Unknown */
            @JvmField val UNKNOWN = of("unknown")

            @JvmStatic fun of(value: String) = TokenRequestor(JsonField.of(value))
        }

        /** An enum containing [TokenRequestor]'s known values. */
        enum class Known {
            /** Apple Pay */
            APPLE_PAY,
            /** Google Pay */
            GOOGLE_PAY,
            /** Samsung Pay */
            SAMSUNG_PAY,
            /** Garmin Pay */
            GARMIN_PAY,
            /** Unknown */
            UNKNOWN,
        }

        /**
         * An enum containing [TokenRequestor]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [TokenRequestor] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            /** Apple Pay */
            APPLE_PAY,
            /** Google Pay */
            GOOGLE_PAY,
            /** Samsung Pay */
            SAMSUNG_PAY,
            /** Garmin Pay */
            GARMIN_PAY,
            /** Unknown */
            UNKNOWN,
            /**
             * An enum member indicating that [TokenRequestor] was instantiated with an unknown
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
                APPLE_PAY -> Value.APPLE_PAY
                GOOGLE_PAY -> Value.GOOGLE_PAY
                SAMSUNG_PAY -> Value.SAMSUNG_PAY
                GARMIN_PAY -> Value.GARMIN_PAY
                UNKNOWN -> Value.UNKNOWN
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
                APPLE_PAY -> Known.APPLE_PAY
                GOOGLE_PAY -> Known.GOOGLE_PAY
                SAMSUNG_PAY -> Known.SAMSUNG_PAY
                GARMIN_PAY -> Known.GARMIN_PAY
                UNKNOWN -> Known.UNKNOWN
                else -> throw IncreaseInvalidDataException("Unknown TokenRequestor: $value")
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws IncreaseInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): TokenRequestor = apply {
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

            return other is TokenRequestor && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * A constant representing the object's type. For this resource it will always be
     * `digital_wallet_token_request`.
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

            @JvmField val DIGITAL_WALLET_TOKEN_REQUEST = of("digital_wallet_token_request")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            DIGITAL_WALLET_TOKEN_REQUEST
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
            DIGITAL_WALLET_TOKEN_REQUEST,
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
                DIGITAL_WALLET_TOKEN_REQUEST -> Value.DIGITAL_WALLET_TOKEN_REQUEST
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
                DIGITAL_WALLET_TOKEN_REQUEST -> Known.DIGITAL_WALLET_TOKEN_REQUEST
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws IncreaseInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
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

        return other is DigitalWalletTokenRequest &&
            id == other.id &&
            cardId == other.cardId &&
            createdAt == other.createdAt &&
            declined == other.declined &&
            device == other.device &&
            outcome == other.outcome &&
            provisioned == other.provisioned &&
            tokenReferenceIdentifier == other.tokenReferenceIdentifier &&
            tokenRequestor == other.tokenRequestor &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            cardId,
            createdAt,
            declined,
            device,
            outcome,
            provisioned,
            tokenReferenceIdentifier,
            tokenRequestor,
            type,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DigitalWalletTokenRequest{id=$id, cardId=$cardId, createdAt=$createdAt, declined=$declined, device=$device, outcome=$outcome, provisioned=$provisioned, tokenReferenceIdentifier=$tokenReferenceIdentifier, tokenRequestor=$tokenRequestor, type=$type, additionalProperties=$additionalProperties}"
}
