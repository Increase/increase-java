// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.cards

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
import com.increase.api.core.checkKnown
import com.increase.api.core.checkRequired
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.core.toImmutable
import com.increase.api.errors.IncreaseInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Create a Card */
class CardCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The Account the card should belong to.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountId(): String = body.accountId()

    /**
     * Controls that restrict how this card can be used.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun authorizationControls(): Optional<AuthorizationControls> = body.authorizationControls()

    /**
     * The card's billing address.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun billingAddress(): Optional<BillingAddress> = body.billingAddress()

    /**
     * The description you choose to give the card.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = body.description()

    /**
     * The contact information used in the two-factor steps for digital wallet card creation. To add
     * the card to a digital wallet, you may supply an email or phone number with this request.
     * Otherwise, subscribe and then action a Real Time Decision with the category
     * `digital_wallet_token_requested` or `digital_wallet_authentication_requested`.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun digitalWallet(): Optional<DigitalWallet> = body.digitalWallet()

    /**
     * The Entity the card belongs to. You only need to supply this in rare situations when the card
     * is not for the Account holder.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun entityId(): Optional<String> = body.entityId()

    /**
     * Returns the raw JSON value of [accountId].
     *
     * Unlike [accountId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _accountId(): JsonField<String> = body._accountId()

    /**
     * Returns the raw JSON value of [authorizationControls].
     *
     * Unlike [authorizationControls], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _authorizationControls(): JsonField<AuthorizationControls> = body._authorizationControls()

    /**
     * Returns the raw JSON value of [billingAddress].
     *
     * Unlike [billingAddress], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _billingAddress(): JsonField<BillingAddress> = body._billingAddress()

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _description(): JsonField<String> = body._description()

    /**
     * Returns the raw JSON value of [digitalWallet].
     *
     * Unlike [digitalWallet], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _digitalWallet(): JsonField<DigitalWallet> = body._digitalWallet()

    /**
     * Returns the raw JSON value of [entityId].
     *
     * Unlike [entityId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _entityId(): JsonField<String> = body._entityId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CardCreateParams].
         *
         * The following fields are required:
         * ```java
         * .accountId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CardCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(cardCreateParams: CardCreateParams) = apply {
            body = cardCreateParams.body.toBuilder()
            additionalHeaders = cardCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = cardCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [accountId]
         * - [authorizationControls]
         * - [billingAddress]
         * - [description]
         * - [digitalWallet]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The Account the card should belong to. */
        fun accountId(accountId: String) = apply { body.accountId(accountId) }

        /**
         * Sets [Builder.accountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accountId(accountId: JsonField<String>) = apply { body.accountId(accountId) }

        /** Controls that restrict how this card can be used. */
        fun authorizationControls(authorizationControls: AuthorizationControls) = apply {
            body.authorizationControls(authorizationControls)
        }

        /**
         * Sets [Builder.authorizationControls] to an arbitrary JSON value.
         *
         * You should usually call [Builder.authorizationControls] with a well-typed
         * [AuthorizationControls] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun authorizationControls(authorizationControls: JsonField<AuthorizationControls>) = apply {
            body.authorizationControls(authorizationControls)
        }

        /** The card's billing address. */
        fun billingAddress(billingAddress: BillingAddress) = apply {
            body.billingAddress(billingAddress)
        }

        /**
         * Sets [Builder.billingAddress] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billingAddress] with a well-typed [BillingAddress] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun billingAddress(billingAddress: JsonField<BillingAddress>) = apply {
            body.billingAddress(billingAddress)
        }

        /** The description you choose to give the card. */
        fun description(description: String) = apply { body.description(description) }

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        /**
         * The contact information used in the two-factor steps for digital wallet card creation. To
         * add the card to a digital wallet, you may supply an email or phone number with this
         * request. Otherwise, subscribe and then action a Real Time Decision with the category
         * `digital_wallet_token_requested` or `digital_wallet_authentication_requested`.
         */
        fun digitalWallet(digitalWallet: DigitalWallet) = apply {
            body.digitalWallet(digitalWallet)
        }

        /**
         * Sets [Builder.digitalWallet] to an arbitrary JSON value.
         *
         * You should usually call [Builder.digitalWallet] with a well-typed [DigitalWallet] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun digitalWallet(digitalWallet: JsonField<DigitalWallet>) = apply {
            body.digitalWallet(digitalWallet)
        }

        /**
         * The Entity the card belongs to. You only need to supply this in rare situations when the
         * card is not for the Account holder.
         */
        fun entityId(entityId: String) = apply { body.entityId(entityId) }

        /**
         * Sets [Builder.entityId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.entityId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun entityId(entityId: JsonField<String>) = apply { body.entityId(entityId) }

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
         * Returns an immutable instance of [CardCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .accountId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CardCreateParams =
            CardCreateParams(body.build(), additionalHeaders.build(), additionalQueryParams.build())
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val accountId: JsonField<String>,
        private val authorizationControls: JsonField<AuthorizationControls>,
        private val billingAddress: JsonField<BillingAddress>,
        private val description: JsonField<String>,
        private val digitalWallet: JsonField<DigitalWallet>,
        private val entityId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("account_id")
            @ExcludeMissing
            accountId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("authorization_controls")
            @ExcludeMissing
            authorizationControls: JsonField<AuthorizationControls> = JsonMissing.of(),
            @JsonProperty("billing_address")
            @ExcludeMissing
            billingAddress: JsonField<BillingAddress> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("digital_wallet")
            @ExcludeMissing
            digitalWallet: JsonField<DigitalWallet> = JsonMissing.of(),
            @JsonProperty("entity_id")
            @ExcludeMissing
            entityId: JsonField<String> = JsonMissing.of(),
        ) : this(
            accountId,
            authorizationControls,
            billingAddress,
            description,
            digitalWallet,
            entityId,
            mutableMapOf(),
        )

        /**
         * The Account the card should belong to.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun accountId(): String = accountId.getRequired("account_id")

        /**
         * Controls that restrict how this card can be used.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun authorizationControls(): Optional<AuthorizationControls> =
            authorizationControls.getOptional("authorization_controls")

        /**
         * The card's billing address.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun billingAddress(): Optional<BillingAddress> =
            billingAddress.getOptional("billing_address")

        /**
         * The description you choose to give the card.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * The contact information used in the two-factor steps for digital wallet card creation. To
         * add the card to a digital wallet, you may supply an email or phone number with this
         * request. Otherwise, subscribe and then action a Real Time Decision with the category
         * `digital_wallet_token_requested` or `digital_wallet_authentication_requested`.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun digitalWallet(): Optional<DigitalWallet> = digitalWallet.getOptional("digital_wallet")

        /**
         * The Entity the card belongs to. You only need to supply this in rare situations when the
         * card is not for the Account holder.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun entityId(): Optional<String> = entityId.getOptional("entity_id")

        /**
         * Returns the raw JSON value of [accountId].
         *
         * Unlike [accountId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("account_id") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

        /**
         * Returns the raw JSON value of [authorizationControls].
         *
         * Unlike [authorizationControls], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("authorization_controls")
        @ExcludeMissing
        fun _authorizationControls(): JsonField<AuthorizationControls> = authorizationControls

        /**
         * Returns the raw JSON value of [billingAddress].
         *
         * Unlike [billingAddress], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("billing_address")
        @ExcludeMissing
        fun _billingAddress(): JsonField<BillingAddress> = billingAddress

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

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
         * Returns the raw JSON value of [entityId].
         *
         * Unlike [entityId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("entity_id") @ExcludeMissing fun _entityId(): JsonField<String> = entityId

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .accountId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var accountId: JsonField<String>? = null
            private var authorizationControls: JsonField<AuthorizationControls> = JsonMissing.of()
            private var billingAddress: JsonField<BillingAddress> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var digitalWallet: JsonField<DigitalWallet> = JsonMissing.of()
            private var entityId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                accountId = body.accountId
                authorizationControls = body.authorizationControls
                billingAddress = body.billingAddress
                description = body.description
                digitalWallet = body.digitalWallet
                entityId = body.entityId
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The Account the card should belong to. */
            fun accountId(accountId: String) = accountId(JsonField.of(accountId))

            /**
             * Sets [Builder.accountId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

            /** Controls that restrict how this card can be used. */
            fun authorizationControls(authorizationControls: AuthorizationControls) =
                authorizationControls(JsonField.of(authorizationControls))

            /**
             * Sets [Builder.authorizationControls] to an arbitrary JSON value.
             *
             * You should usually call [Builder.authorizationControls] with a well-typed
             * [AuthorizationControls] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun authorizationControls(authorizationControls: JsonField<AuthorizationControls>) =
                apply {
                    this.authorizationControls = authorizationControls
                }

            /** The card's billing address. */
            fun billingAddress(billingAddress: BillingAddress) =
                billingAddress(JsonField.of(billingAddress))

            /**
             * Sets [Builder.billingAddress] to an arbitrary JSON value.
             *
             * You should usually call [Builder.billingAddress] with a well-typed [BillingAddress]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun billingAddress(billingAddress: JsonField<BillingAddress>) = apply {
                this.billingAddress = billingAddress
            }

            /** The description you choose to give the card. */
            fun description(description: String) = description(JsonField.of(description))

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /**
             * The contact information used in the two-factor steps for digital wallet card
             * creation. To add the card to a digital wallet, you may supply an email or phone
             * number with this request. Otherwise, subscribe and then action a Real Time Decision
             * with the category `digital_wallet_token_requested` or
             * `digital_wallet_authentication_requested`.
             */
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

            /**
             * The Entity the card belongs to. You only need to supply this in rare situations when
             * the card is not for the Account holder.
             */
            fun entityId(entityId: String) = entityId(JsonField.of(entityId))

            /**
             * Sets [Builder.entityId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.entityId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun entityId(entityId: JsonField<String>) = apply { this.entityId = entityId }

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
             *
             * The following fields are required:
             * ```java
             * .accountId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("accountId", accountId),
                    authorizationControls,
                    billingAddress,
                    description,
                    digitalWallet,
                    entityId,
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
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            accountId()
            authorizationControls().ifPresent { it.validate() }
            billingAddress().ifPresent { it.validate() }
            description()
            digitalWallet().ifPresent { it.validate() }
            entityId()
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
                (authorizationControls.asKnown().getOrNull()?.validity() ?: 0) +
                (billingAddress.asKnown().getOrNull()?.validity() ?: 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (digitalWallet.asKnown().getOrNull()?.validity() ?: 0) +
                (if (entityId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                accountId == other.accountId &&
                authorizationControls == other.authorizationControls &&
                billingAddress == other.billingAddress &&
                description == other.description &&
                digitalWallet == other.digitalWallet &&
                entityId == other.entityId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                accountId,
                authorizationControls,
                billingAddress,
                description,
                digitalWallet,
                entityId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{accountId=$accountId, authorizationControls=$authorizationControls, billingAddress=$billingAddress, description=$description, digitalWallet=$digitalWallet, entityId=$entityId, additionalProperties=$additionalProperties}"
    }

    /** Controls that restrict how this card can be used. */
    class AuthorizationControls
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val merchantAcceptorIdentifier: JsonField<MerchantAcceptorIdentifier>,
        private val merchantCategoryCode: JsonField<MerchantCategoryCode>,
        private val merchantCountry: JsonField<MerchantCountry>,
        private val usage: JsonField<Usage>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("merchant_acceptor_identifier")
            @ExcludeMissing
            merchantAcceptorIdentifier: JsonField<MerchantAcceptorIdentifier> = JsonMissing.of(),
            @JsonProperty("merchant_category_code")
            @ExcludeMissing
            merchantCategoryCode: JsonField<MerchantCategoryCode> = JsonMissing.of(),
            @JsonProperty("merchant_country")
            @ExcludeMissing
            merchantCountry: JsonField<MerchantCountry> = JsonMissing.of(),
            @JsonProperty("usage") @ExcludeMissing usage: JsonField<Usage> = JsonMissing.of(),
        ) : this(
            merchantAcceptorIdentifier,
            merchantCategoryCode,
            merchantCountry,
            usage,
            mutableMapOf(),
        )

        /**
         * Restricts which Merchant Acceptor IDs are allowed or blocked for authorizations on this
         * card.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun merchantAcceptorIdentifier(): Optional<MerchantAcceptorIdentifier> =
            merchantAcceptorIdentifier.getOptional("merchant_acceptor_identifier")

        /**
         * Restricts which Merchant Category Codes are allowed or blocked for authorizations on this
         * card.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun merchantCategoryCode(): Optional<MerchantCategoryCode> =
            merchantCategoryCode.getOptional("merchant_category_code")

        /**
         * Restricts which merchant countries are allowed or blocked for authorizations on this
         * card.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun merchantCountry(): Optional<MerchantCountry> =
            merchantCountry.getOptional("merchant_country")

        /**
         * Controls how many times this card can be used.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun usage(): Optional<Usage> = usage.getOptional("usage")

        /**
         * Returns the raw JSON value of [merchantAcceptorIdentifier].
         *
         * Unlike [merchantAcceptorIdentifier], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("merchant_acceptor_identifier")
        @ExcludeMissing
        fun _merchantAcceptorIdentifier(): JsonField<MerchantAcceptorIdentifier> =
            merchantAcceptorIdentifier

        /**
         * Returns the raw JSON value of [merchantCategoryCode].
         *
         * Unlike [merchantCategoryCode], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("merchant_category_code")
        @ExcludeMissing
        fun _merchantCategoryCode(): JsonField<MerchantCategoryCode> = merchantCategoryCode

        /**
         * Returns the raw JSON value of [merchantCountry].
         *
         * Unlike [merchantCountry], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("merchant_country")
        @ExcludeMissing
        fun _merchantCountry(): JsonField<MerchantCountry> = merchantCountry

        /**
         * Returns the raw JSON value of [usage].
         *
         * Unlike [usage], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("usage") @ExcludeMissing fun _usage(): JsonField<Usage> = usage

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
             * Returns a mutable builder for constructing an instance of [AuthorizationControls].
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [AuthorizationControls]. */
        class Builder internal constructor() {

            private var merchantAcceptorIdentifier: JsonField<MerchantAcceptorIdentifier> =
                JsonMissing.of()
            private var merchantCategoryCode: JsonField<MerchantCategoryCode> = JsonMissing.of()
            private var merchantCountry: JsonField<MerchantCountry> = JsonMissing.of()
            private var usage: JsonField<Usage> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(authorizationControls: AuthorizationControls) = apply {
                merchantAcceptorIdentifier = authorizationControls.merchantAcceptorIdentifier
                merchantCategoryCode = authorizationControls.merchantCategoryCode
                merchantCountry = authorizationControls.merchantCountry
                usage = authorizationControls.usage
                additionalProperties = authorizationControls.additionalProperties.toMutableMap()
            }

            /**
             * Restricts which Merchant Acceptor IDs are allowed or blocked for authorizations on
             * this card.
             */
            fun merchantAcceptorIdentifier(merchantAcceptorIdentifier: MerchantAcceptorIdentifier) =
                merchantAcceptorIdentifier(JsonField.of(merchantAcceptorIdentifier))

            /**
             * Sets [Builder.merchantAcceptorIdentifier] to an arbitrary JSON value.
             *
             * You should usually call [Builder.merchantAcceptorIdentifier] with a well-typed
             * [MerchantAcceptorIdentifier] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun merchantAcceptorIdentifier(
                merchantAcceptorIdentifier: JsonField<MerchantAcceptorIdentifier>
            ) = apply { this.merchantAcceptorIdentifier = merchantAcceptorIdentifier }

            /**
             * Restricts which Merchant Category Codes are allowed or blocked for authorizations on
             * this card.
             */
            fun merchantCategoryCode(merchantCategoryCode: MerchantCategoryCode) =
                merchantCategoryCode(JsonField.of(merchantCategoryCode))

            /**
             * Sets [Builder.merchantCategoryCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.merchantCategoryCode] with a well-typed
             * [MerchantCategoryCode] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun merchantCategoryCode(merchantCategoryCode: JsonField<MerchantCategoryCode>) =
                apply {
                    this.merchantCategoryCode = merchantCategoryCode
                }

            /**
             * Restricts which merchant countries are allowed or blocked for authorizations on this
             * card.
             */
            fun merchantCountry(merchantCountry: MerchantCountry) =
                merchantCountry(JsonField.of(merchantCountry))

            /**
             * Sets [Builder.merchantCountry] to an arbitrary JSON value.
             *
             * You should usually call [Builder.merchantCountry] with a well-typed [MerchantCountry]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun merchantCountry(merchantCountry: JsonField<MerchantCountry>) = apply {
                this.merchantCountry = merchantCountry
            }

            /** Controls how many times this card can be used. */
            fun usage(usage: Usage) = usage(JsonField.of(usage))

            /**
             * Sets [Builder.usage] to an arbitrary JSON value.
             *
             * You should usually call [Builder.usage] with a well-typed [Usage] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun usage(usage: JsonField<Usage>) = apply { this.usage = usage }

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
             * Returns an immutable instance of [AuthorizationControls].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): AuthorizationControls =
                AuthorizationControls(
                    merchantAcceptorIdentifier,
                    merchantCategoryCode,
                    merchantCountry,
                    usage,
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
        fun validate(): AuthorizationControls = apply {
            if (validated) {
                return@apply
            }

            merchantAcceptorIdentifier().ifPresent { it.validate() }
            merchantCategoryCode().ifPresent { it.validate() }
            merchantCountry().ifPresent { it.validate() }
            usage().ifPresent { it.validate() }
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
            (merchantAcceptorIdentifier.asKnown().getOrNull()?.validity() ?: 0) +
                (merchantCategoryCode.asKnown().getOrNull()?.validity() ?: 0) +
                (merchantCountry.asKnown().getOrNull()?.validity() ?: 0) +
                (usage.asKnown().getOrNull()?.validity() ?: 0)

        /**
         * Restricts which Merchant Acceptor IDs are allowed or blocked for authorizations on this
         * card.
         */
        class MerchantAcceptorIdentifier
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val allowed: JsonField<List<Allowed>>,
            private val blocked: JsonField<List<Blocked>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("allowed")
                @ExcludeMissing
                allowed: JsonField<List<Allowed>> = JsonMissing.of(),
                @JsonProperty("blocked")
                @ExcludeMissing
                blocked: JsonField<List<Blocked>> = JsonMissing.of(),
            ) : this(allowed, blocked, mutableMapOf())

            /**
             * The Merchant Acceptor IDs that are allowed for authorizations on this card.
             * Authorizations with Merchant Acceptor IDs not in this list will be declined.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun allowed(): Optional<List<Allowed>> = allowed.getOptional("allowed")

            /**
             * The Merchant Acceptor IDs that are blocked for authorizations on this card.
             * Authorizations with Merchant Acceptor IDs in this list will be declined.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun blocked(): Optional<List<Blocked>> = blocked.getOptional("blocked")

            /**
             * Returns the raw JSON value of [allowed].
             *
             * Unlike [allowed], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("allowed")
            @ExcludeMissing
            fun _allowed(): JsonField<List<Allowed>> = allowed

            /**
             * Returns the raw JSON value of [blocked].
             *
             * Unlike [blocked], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("blocked")
            @ExcludeMissing
            fun _blocked(): JsonField<List<Blocked>> = blocked

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
                 * [MerchantAcceptorIdentifier].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [MerchantAcceptorIdentifier]. */
            class Builder internal constructor() {

                private var allowed: JsonField<MutableList<Allowed>>? = null
                private var blocked: JsonField<MutableList<Blocked>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(merchantAcceptorIdentifier: MerchantAcceptorIdentifier) = apply {
                    allowed = merchantAcceptorIdentifier.allowed.map { it.toMutableList() }
                    blocked = merchantAcceptorIdentifier.blocked.map { it.toMutableList() }
                    additionalProperties =
                        merchantAcceptorIdentifier.additionalProperties.toMutableMap()
                }

                /**
                 * The Merchant Acceptor IDs that are allowed for authorizations on this card.
                 * Authorizations with Merchant Acceptor IDs not in this list will be declined.
                 */
                fun allowed(allowed: List<Allowed>) = allowed(JsonField.of(allowed))

                /**
                 * Sets [Builder.allowed] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.allowed] with a well-typed `List<Allowed>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun allowed(allowed: JsonField<List<Allowed>>) = apply {
                    this.allowed = allowed.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Allowed] to [Builder.allowed].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addAllowed(allowed: Allowed) = apply {
                    this.allowed =
                        (this.allowed ?: JsonField.of(mutableListOf())).also {
                            checkKnown("allowed", it).add(allowed)
                        }
                }

                /**
                 * The Merchant Acceptor IDs that are blocked for authorizations on this card.
                 * Authorizations with Merchant Acceptor IDs in this list will be declined.
                 */
                fun blocked(blocked: List<Blocked>) = blocked(JsonField.of(blocked))

                /**
                 * Sets [Builder.blocked] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.blocked] with a well-typed `List<Blocked>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun blocked(blocked: JsonField<List<Blocked>>) = apply {
                    this.blocked = blocked.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Blocked] to [Builder.blocked].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addBlocked(blocked: Blocked) = apply {
                    this.blocked =
                        (this.blocked ?: JsonField.of(mutableListOf())).also {
                            checkKnown("blocked", it).add(blocked)
                        }
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
                 * Returns an immutable instance of [MerchantAcceptorIdentifier].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): MerchantAcceptorIdentifier =
                    MerchantAcceptorIdentifier(
                        (allowed ?: JsonMissing.of()).map { it.toImmutable() },
                        (blocked ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
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
            fun validate(): MerchantAcceptorIdentifier = apply {
                if (validated) {
                    return@apply
                }

                allowed().ifPresent { it.forEach { it.validate() } }
                blocked().ifPresent { it.forEach { it.validate() } }
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
                (allowed.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (blocked.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

            class Allowed
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
                 * The Merchant Acceptor ID.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun identifier(): String = identifier.getRequired("identifier")

                /**
                 * Returns the raw JSON value of [identifier].
                 *
                 * Unlike [identifier], this method doesn't throw if the JSON field has an
                 * unexpected type.
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
                     * Returns a mutable builder for constructing an instance of [Allowed].
                     *
                     * The following fields are required:
                     * ```java
                     * .identifier()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Allowed]. */
                class Builder internal constructor() {

                    private var identifier: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(allowed: Allowed) = apply {
                        identifier = allowed.identifier
                        additionalProperties = allowed.additionalProperties.toMutableMap()
                    }

                    /** The Merchant Acceptor ID. */
                    fun identifier(identifier: String) = identifier(JsonField.of(identifier))

                    /**
                     * Sets [Builder.identifier] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.identifier] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
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
                     * Returns an immutable instance of [Allowed].
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
                    fun build(): Allowed =
                        Allowed(
                            checkRequired("identifier", identifier),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws IncreaseInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Allowed = apply {
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

                    return other is Allowed &&
                        identifier == other.identifier &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(identifier, additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Allowed{identifier=$identifier, additionalProperties=$additionalProperties}"
            }

            class Blocked
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
                 * The Merchant Acceptor ID.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun identifier(): String = identifier.getRequired("identifier")

                /**
                 * Returns the raw JSON value of [identifier].
                 *
                 * Unlike [identifier], this method doesn't throw if the JSON field has an
                 * unexpected type.
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
                     * Returns a mutable builder for constructing an instance of [Blocked].
                     *
                     * The following fields are required:
                     * ```java
                     * .identifier()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Blocked]. */
                class Builder internal constructor() {

                    private var identifier: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(blocked: Blocked) = apply {
                        identifier = blocked.identifier
                        additionalProperties = blocked.additionalProperties.toMutableMap()
                    }

                    /** The Merchant Acceptor ID. */
                    fun identifier(identifier: String) = identifier(JsonField.of(identifier))

                    /**
                     * Sets [Builder.identifier] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.identifier] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
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
                     * Returns an immutable instance of [Blocked].
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
                    fun build(): Blocked =
                        Blocked(
                            checkRequired("identifier", identifier),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws IncreaseInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Blocked = apply {
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

                    return other is Blocked &&
                        identifier == other.identifier &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(identifier, additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Blocked{identifier=$identifier, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is MerchantAcceptorIdentifier &&
                    allowed == other.allowed &&
                    blocked == other.blocked &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(allowed, blocked, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "MerchantAcceptorIdentifier{allowed=$allowed, blocked=$blocked, additionalProperties=$additionalProperties}"
        }

        /**
         * Restricts which Merchant Category Codes are allowed or blocked for authorizations on this
         * card.
         */
        class MerchantCategoryCode
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val allowed: JsonField<List<Allowed>>,
            private val blocked: JsonField<List<Blocked>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("allowed")
                @ExcludeMissing
                allowed: JsonField<List<Allowed>> = JsonMissing.of(),
                @JsonProperty("blocked")
                @ExcludeMissing
                blocked: JsonField<List<Blocked>> = JsonMissing.of(),
            ) : this(allowed, blocked, mutableMapOf())

            /**
             * The Merchant Category Codes that are allowed for authorizations on this card.
             * Authorizations with Merchant Category Codes not in this list will be declined.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun allowed(): Optional<List<Allowed>> = allowed.getOptional("allowed")

            /**
             * The Merchant Category Codes that are blocked for authorizations on this card.
             * Authorizations with Merchant Category Codes in this list will be declined.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun blocked(): Optional<List<Blocked>> = blocked.getOptional("blocked")

            /**
             * Returns the raw JSON value of [allowed].
             *
             * Unlike [allowed], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("allowed")
            @ExcludeMissing
            fun _allowed(): JsonField<List<Allowed>> = allowed

            /**
             * Returns the raw JSON value of [blocked].
             *
             * Unlike [blocked], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("blocked")
            @ExcludeMissing
            fun _blocked(): JsonField<List<Blocked>> = blocked

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
                 * Returns a mutable builder for constructing an instance of [MerchantCategoryCode].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [MerchantCategoryCode]. */
            class Builder internal constructor() {

                private var allowed: JsonField<MutableList<Allowed>>? = null
                private var blocked: JsonField<MutableList<Blocked>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(merchantCategoryCode: MerchantCategoryCode) = apply {
                    allowed = merchantCategoryCode.allowed.map { it.toMutableList() }
                    blocked = merchantCategoryCode.blocked.map { it.toMutableList() }
                    additionalProperties = merchantCategoryCode.additionalProperties.toMutableMap()
                }

                /**
                 * The Merchant Category Codes that are allowed for authorizations on this card.
                 * Authorizations with Merchant Category Codes not in this list will be declined.
                 */
                fun allowed(allowed: List<Allowed>) = allowed(JsonField.of(allowed))

                /**
                 * Sets [Builder.allowed] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.allowed] with a well-typed `List<Allowed>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun allowed(allowed: JsonField<List<Allowed>>) = apply {
                    this.allowed = allowed.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Allowed] to [Builder.allowed].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addAllowed(allowed: Allowed) = apply {
                    this.allowed =
                        (this.allowed ?: JsonField.of(mutableListOf())).also {
                            checkKnown("allowed", it).add(allowed)
                        }
                }

                /**
                 * The Merchant Category Codes that are blocked for authorizations on this card.
                 * Authorizations with Merchant Category Codes in this list will be declined.
                 */
                fun blocked(blocked: List<Blocked>) = blocked(JsonField.of(blocked))

                /**
                 * Sets [Builder.blocked] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.blocked] with a well-typed `List<Blocked>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun blocked(blocked: JsonField<List<Blocked>>) = apply {
                    this.blocked = blocked.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Blocked] to [Builder.blocked].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addBlocked(blocked: Blocked) = apply {
                    this.blocked =
                        (this.blocked ?: JsonField.of(mutableListOf())).also {
                            checkKnown("blocked", it).add(blocked)
                        }
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
                 * Returns an immutable instance of [MerchantCategoryCode].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): MerchantCategoryCode =
                    MerchantCategoryCode(
                        (allowed ?: JsonMissing.of()).map { it.toImmutable() },
                        (blocked ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
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
            fun validate(): MerchantCategoryCode = apply {
                if (validated) {
                    return@apply
                }

                allowed().ifPresent { it.forEach { it.validate() } }
                blocked().ifPresent { it.forEach { it.validate() } }
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
                (allowed.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (blocked.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

            class Allowed
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val code: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("code") @ExcludeMissing code: JsonField<String> = JsonMissing.of()
                ) : this(code, mutableMapOf())

                /**
                 * The Merchant Category Code.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun code(): String = code.getRequired("code")

                /**
                 * Returns the raw JSON value of [code].
                 *
                 * Unlike [code], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

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
                     * Returns a mutable builder for constructing an instance of [Allowed].
                     *
                     * The following fields are required:
                     * ```java
                     * .code()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Allowed]. */
                class Builder internal constructor() {

                    private var code: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(allowed: Allowed) = apply {
                        code = allowed.code
                        additionalProperties = allowed.additionalProperties.toMutableMap()
                    }

                    /** The Merchant Category Code. */
                    fun code(code: String) = code(JsonField.of(code))

                    /**
                     * Sets [Builder.code] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.code] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun code(code: JsonField<String>) = apply { this.code = code }

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
                     * Returns an immutable instance of [Allowed].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .code()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Allowed =
                        Allowed(checkRequired("code", code), additionalProperties.toMutableMap())
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws IncreaseInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Allowed = apply {
                    if (validated) {
                        return@apply
                    }

                    code()
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
                internal fun validity(): Int = (if (code.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Allowed &&
                        code == other.code &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(code, additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Allowed{code=$code, additionalProperties=$additionalProperties}"
            }

            class Blocked
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val code: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("code") @ExcludeMissing code: JsonField<String> = JsonMissing.of()
                ) : this(code, mutableMapOf())

                /**
                 * The Merchant Category Code.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun code(): String = code.getRequired("code")

                /**
                 * Returns the raw JSON value of [code].
                 *
                 * Unlike [code], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

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
                     * Returns a mutable builder for constructing an instance of [Blocked].
                     *
                     * The following fields are required:
                     * ```java
                     * .code()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Blocked]. */
                class Builder internal constructor() {

                    private var code: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(blocked: Blocked) = apply {
                        code = blocked.code
                        additionalProperties = blocked.additionalProperties.toMutableMap()
                    }

                    /** The Merchant Category Code. */
                    fun code(code: String) = code(JsonField.of(code))

                    /**
                     * Sets [Builder.code] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.code] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun code(code: JsonField<String>) = apply { this.code = code }

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
                     * Returns an immutable instance of [Blocked].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .code()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Blocked =
                        Blocked(checkRequired("code", code), additionalProperties.toMutableMap())
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws IncreaseInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Blocked = apply {
                    if (validated) {
                        return@apply
                    }

                    code()
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
                internal fun validity(): Int = (if (code.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Blocked &&
                        code == other.code &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(code, additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Blocked{code=$code, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is MerchantCategoryCode &&
                    allowed == other.allowed &&
                    blocked == other.blocked &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(allowed, blocked, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "MerchantCategoryCode{allowed=$allowed, blocked=$blocked, additionalProperties=$additionalProperties}"
        }

        /**
         * Restricts which merchant countries are allowed or blocked for authorizations on this
         * card.
         */
        class MerchantCountry
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val allowed: JsonField<List<Allowed>>,
            private val blocked: JsonField<List<Blocked>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("allowed")
                @ExcludeMissing
                allowed: JsonField<List<Allowed>> = JsonMissing.of(),
                @JsonProperty("blocked")
                @ExcludeMissing
                blocked: JsonField<List<Blocked>> = JsonMissing.of(),
            ) : this(allowed, blocked, mutableMapOf())

            /**
             * The merchant countries that are allowed for authorizations on this card.
             * Authorizations with merchant countries not in this list will be declined.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun allowed(): Optional<List<Allowed>> = allowed.getOptional("allowed")

            /**
             * The merchant countries that are blocked for authorizations on this card.
             * Authorizations with merchant countries in this list will be declined.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun blocked(): Optional<List<Blocked>> = blocked.getOptional("blocked")

            /**
             * Returns the raw JSON value of [allowed].
             *
             * Unlike [allowed], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("allowed")
            @ExcludeMissing
            fun _allowed(): JsonField<List<Allowed>> = allowed

            /**
             * Returns the raw JSON value of [blocked].
             *
             * Unlike [blocked], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("blocked")
            @ExcludeMissing
            fun _blocked(): JsonField<List<Blocked>> = blocked

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

                /** Returns a mutable builder for constructing an instance of [MerchantCountry]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [MerchantCountry]. */
            class Builder internal constructor() {

                private var allowed: JsonField<MutableList<Allowed>>? = null
                private var blocked: JsonField<MutableList<Blocked>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(merchantCountry: MerchantCountry) = apply {
                    allowed = merchantCountry.allowed.map { it.toMutableList() }
                    blocked = merchantCountry.blocked.map { it.toMutableList() }
                    additionalProperties = merchantCountry.additionalProperties.toMutableMap()
                }

                /**
                 * The merchant countries that are allowed for authorizations on this card.
                 * Authorizations with merchant countries not in this list will be declined.
                 */
                fun allowed(allowed: List<Allowed>) = allowed(JsonField.of(allowed))

                /**
                 * Sets [Builder.allowed] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.allowed] with a well-typed `List<Allowed>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun allowed(allowed: JsonField<List<Allowed>>) = apply {
                    this.allowed = allowed.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Allowed] to [Builder.allowed].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addAllowed(allowed: Allowed) = apply {
                    this.allowed =
                        (this.allowed ?: JsonField.of(mutableListOf())).also {
                            checkKnown("allowed", it).add(allowed)
                        }
                }

                /**
                 * The merchant countries that are blocked for authorizations on this card.
                 * Authorizations with merchant countries in this list will be declined.
                 */
                fun blocked(blocked: List<Blocked>) = blocked(JsonField.of(blocked))

                /**
                 * Sets [Builder.blocked] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.blocked] with a well-typed `List<Blocked>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun blocked(blocked: JsonField<List<Blocked>>) = apply {
                    this.blocked = blocked.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Blocked] to [Builder.blocked].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addBlocked(blocked: Blocked) = apply {
                    this.blocked =
                        (this.blocked ?: JsonField.of(mutableListOf())).also {
                            checkKnown("blocked", it).add(blocked)
                        }
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
                 * Returns an immutable instance of [MerchantCountry].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): MerchantCountry =
                    MerchantCountry(
                        (allowed ?: JsonMissing.of()).map { it.toImmutable() },
                        (blocked ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
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
            fun validate(): MerchantCountry = apply {
                if (validated) {
                    return@apply
                }

                allowed().ifPresent { it.forEach { it.validate() } }
                blocked().ifPresent { it.forEach { it.validate() } }
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
                (allowed.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (blocked.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

            class Allowed
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val country: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("country")
                    @ExcludeMissing
                    country: JsonField<String> = JsonMissing.of()
                ) : this(country, mutableMapOf())

                /**
                 * The ISO 3166-1 alpha-2 country code.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun country(): String = country.getRequired("country")

                /**
                 * Returns the raw JSON value of [country].
                 *
                 * Unlike [country], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

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
                     * Returns a mutable builder for constructing an instance of [Allowed].
                     *
                     * The following fields are required:
                     * ```java
                     * .country()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Allowed]. */
                class Builder internal constructor() {

                    private var country: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(allowed: Allowed) = apply {
                        country = allowed.country
                        additionalProperties = allowed.additionalProperties.toMutableMap()
                    }

                    /** The ISO 3166-1 alpha-2 country code. */
                    fun country(country: String) = country(JsonField.of(country))

                    /**
                     * Sets [Builder.country] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.country] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun country(country: JsonField<String>) = apply { this.country = country }

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
                     * Returns an immutable instance of [Allowed].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .country()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Allowed =
                        Allowed(
                            checkRequired("country", country),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws IncreaseInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Allowed = apply {
                    if (validated) {
                        return@apply
                    }

                    country()
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
                internal fun validity(): Int = (if (country.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Allowed &&
                        country == other.country &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(country, additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Allowed{country=$country, additionalProperties=$additionalProperties}"
            }

            class Blocked
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val country: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("country")
                    @ExcludeMissing
                    country: JsonField<String> = JsonMissing.of()
                ) : this(country, mutableMapOf())

                /**
                 * The ISO 3166-1 alpha-2 country code.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun country(): String = country.getRequired("country")

                /**
                 * Returns the raw JSON value of [country].
                 *
                 * Unlike [country], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

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
                     * Returns a mutable builder for constructing an instance of [Blocked].
                     *
                     * The following fields are required:
                     * ```java
                     * .country()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Blocked]. */
                class Builder internal constructor() {

                    private var country: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(blocked: Blocked) = apply {
                        country = blocked.country
                        additionalProperties = blocked.additionalProperties.toMutableMap()
                    }

                    /** The ISO 3166-1 alpha-2 country code. */
                    fun country(country: String) = country(JsonField.of(country))

                    /**
                     * Sets [Builder.country] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.country] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun country(country: JsonField<String>) = apply { this.country = country }

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
                     * Returns an immutable instance of [Blocked].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .country()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Blocked =
                        Blocked(
                            checkRequired("country", country),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws IncreaseInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Blocked = apply {
                    if (validated) {
                        return@apply
                    }

                    country()
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
                internal fun validity(): Int = (if (country.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Blocked &&
                        country == other.country &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(country, additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Blocked{country=$country, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is MerchantCountry &&
                    allowed == other.allowed &&
                    blocked == other.blocked &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(allowed, blocked, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "MerchantCountry{allowed=$allowed, blocked=$blocked, additionalProperties=$additionalProperties}"
        }

        /** Controls how many times this card can be used. */
        class Usage
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val category: JsonField<Category>,
            private val multiUse: JsonField<MultiUse>,
            private val singleUse: JsonField<SingleUse>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("category")
                @ExcludeMissing
                category: JsonField<Category> = JsonMissing.of(),
                @JsonProperty("multi_use")
                @ExcludeMissing
                multiUse: JsonField<MultiUse> = JsonMissing.of(),
                @JsonProperty("single_use")
                @ExcludeMissing
                singleUse: JsonField<SingleUse> = JsonMissing.of(),
            ) : this(category, multiUse, singleUse, mutableMapOf())

            /**
             * Whether the card is for a single use or multiple uses.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun category(): Category = category.getRequired("category")

            /**
             * Controls for multi-use cards. Required if and only if `category` is `multi_use`.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun multiUse(): Optional<MultiUse> = multiUse.getOptional("multi_use")

            /**
             * Controls for single-use cards. Required if and only if `category` is `single_use`.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun singleUse(): Optional<SingleUse> = singleUse.getOptional("single_use")

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
             * Returns the raw JSON value of [multiUse].
             *
             * Unlike [multiUse], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("multi_use")
            @ExcludeMissing
            fun _multiUse(): JsonField<MultiUse> = multiUse

            /**
             * Returns the raw JSON value of [singleUse].
             *
             * Unlike [singleUse], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("single_use")
            @ExcludeMissing
            fun _singleUse(): JsonField<SingleUse> = singleUse

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
                 * Returns a mutable builder for constructing an instance of [Usage].
                 *
                 * The following fields are required:
                 * ```java
                 * .category()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Usage]. */
            class Builder internal constructor() {

                private var category: JsonField<Category>? = null
                private var multiUse: JsonField<MultiUse> = JsonMissing.of()
                private var singleUse: JsonField<SingleUse> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(usage: Usage) = apply {
                    category = usage.category
                    multiUse = usage.multiUse
                    singleUse = usage.singleUse
                    additionalProperties = usage.additionalProperties.toMutableMap()
                }

                /** Whether the card is for a single use or multiple uses. */
                fun category(category: Category) = category(JsonField.of(category))

                /**
                 * Sets [Builder.category] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.category] with a well-typed [Category] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun category(category: JsonField<Category>) = apply { this.category = category }

                /**
                 * Controls for multi-use cards. Required if and only if `category` is `multi_use`.
                 */
                fun multiUse(multiUse: MultiUse) = multiUse(JsonField.of(multiUse))

                /**
                 * Sets [Builder.multiUse] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.multiUse] with a well-typed [MultiUse] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun multiUse(multiUse: JsonField<MultiUse>) = apply { this.multiUse = multiUse }

                /**
                 * Controls for single-use cards. Required if and only if `category` is
                 * `single_use`.
                 */
                fun singleUse(singleUse: SingleUse) = singleUse(JsonField.of(singleUse))

                /**
                 * Sets [Builder.singleUse] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.singleUse] with a well-typed [SingleUse] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun singleUse(singleUse: JsonField<SingleUse>) = apply {
                    this.singleUse = singleUse
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
                 * Returns an immutable instance of [Usage].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .category()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Usage =
                    Usage(
                        checkRequired("category", category),
                        multiUse,
                        singleUse,
                        additionalProperties.toMutableMap(),
                    )
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
            fun validate(): Usage = apply {
                if (validated) {
                    return@apply
                }

                category().validate()
                multiUse().ifPresent { it.validate() }
                singleUse().ifPresent { it.validate() }
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
                    (multiUse.asKnown().getOrNull()?.validity() ?: 0) +
                    (singleUse.asKnown().getOrNull()?.validity() ?: 0)

            /** Whether the card is for a single use or multiple uses. */
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

                    /** The card can only be used for a single authorization. */
                    @JvmField val SINGLE_USE = of("single_use")

                    /** The card can be used for multiple authorizations. */
                    @JvmField val MULTI_USE = of("multi_use")

                    @JvmStatic fun of(value: String) = Category(JsonField.of(value))
                }

                /** An enum containing [Category]'s known values. */
                enum class Known {
                    /** The card can only be used for a single authorization. */
                    SINGLE_USE,
                    /** The card can be used for multiple authorizations. */
                    MULTI_USE,
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
                    /** The card can only be used for a single authorization. */
                    SINGLE_USE,
                    /** The card can be used for multiple authorizations. */
                    MULTI_USE,
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
                        SINGLE_USE -> Value.SINGLE_USE
                        MULTI_USE -> Value.MULTI_USE
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
                        SINGLE_USE -> Known.SINGLE_USE
                        MULTI_USE -> Known.MULTI_USE
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

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws IncreaseInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
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

            /** Controls for multi-use cards. Required if and only if `category` is `multi_use`. */
            class MultiUse
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val spendingLimits: JsonField<List<SpendingLimit>>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("spending_limits")
                    @ExcludeMissing
                    spendingLimits: JsonField<List<SpendingLimit>> = JsonMissing.of()
                ) : this(spendingLimits, mutableMapOf())

                /**
                 * Spending limits for this card. The most restrictive limit applies if multiple
                 * limits match.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun spendingLimits(): Optional<List<SpendingLimit>> =
                    spendingLimits.getOptional("spending_limits")

                /**
                 * Returns the raw JSON value of [spendingLimits].
                 *
                 * Unlike [spendingLimits], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("spending_limits")
                @ExcludeMissing
                fun _spendingLimits(): JsonField<List<SpendingLimit>> = spendingLimits

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

                    /** Returns a mutable builder for constructing an instance of [MultiUse]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [MultiUse]. */
                class Builder internal constructor() {

                    private var spendingLimits: JsonField<MutableList<SpendingLimit>>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(multiUse: MultiUse) = apply {
                        spendingLimits = multiUse.spendingLimits.map { it.toMutableList() }
                        additionalProperties = multiUse.additionalProperties.toMutableMap()
                    }

                    /**
                     * Spending limits for this card. The most restrictive limit applies if multiple
                     * limits match.
                     */
                    fun spendingLimits(spendingLimits: List<SpendingLimit>) =
                        spendingLimits(JsonField.of(spendingLimits))

                    /**
                     * Sets [Builder.spendingLimits] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.spendingLimits] with a well-typed
                     * `List<SpendingLimit>` value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun spendingLimits(spendingLimits: JsonField<List<SpendingLimit>>) = apply {
                        this.spendingLimits = spendingLimits.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [SpendingLimit] to [spendingLimits].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addSpendingLimit(spendingLimit: SpendingLimit) = apply {
                        spendingLimits =
                            (spendingLimits ?: JsonField.of(mutableListOf())).also {
                                checkKnown("spendingLimits", it).add(spendingLimit)
                            }
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
                     * Returns an immutable instance of [MultiUse].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): MultiUse =
                        MultiUse(
                            (spendingLimits ?: JsonMissing.of()).map { it.toImmutable() },
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws IncreaseInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): MultiUse = apply {
                    if (validated) {
                        return@apply
                    }

                    spendingLimits().ifPresent { it.forEach { it.validate() } }
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
                    (spendingLimits.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

                class SpendingLimit
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val interval: JsonField<Interval>,
                    private val settlementAmount: JsonField<Long>,
                    private val merchantCategoryCodes: JsonField<List<MerchantCategoryCode>>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("interval")
                        @ExcludeMissing
                        interval: JsonField<Interval> = JsonMissing.of(),
                        @JsonProperty("settlement_amount")
                        @ExcludeMissing
                        settlementAmount: JsonField<Long> = JsonMissing.of(),
                        @JsonProperty("merchant_category_codes")
                        @ExcludeMissing
                        merchantCategoryCodes: JsonField<List<MerchantCategoryCode>> =
                            JsonMissing.of(),
                    ) : this(interval, settlementAmount, merchantCategoryCodes, mutableMapOf())

                    /**
                     * The interval at which the spending limit is enforced.
                     *
                     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun interval(): Interval = interval.getRequired("interval")

                    /**
                     * The maximum settlement amount permitted in the given interval.
                     *
                     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun settlementAmount(): Long = settlementAmount.getRequired("settlement_amount")

                    /**
                     * The Merchant Category Codes this spending limit applies to. If not set, the
                     * limit applies to all transactions.
                     *
                     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun merchantCategoryCodes(): Optional<List<MerchantCategoryCode>> =
                        merchantCategoryCodes.getOptional("merchant_category_codes")

                    /**
                     * Returns the raw JSON value of [interval].
                     *
                     * Unlike [interval], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("interval")
                    @ExcludeMissing
                    fun _interval(): JsonField<Interval> = interval

                    /**
                     * Returns the raw JSON value of [settlementAmount].
                     *
                     * Unlike [settlementAmount], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("settlement_amount")
                    @ExcludeMissing
                    fun _settlementAmount(): JsonField<Long> = settlementAmount

                    /**
                     * Returns the raw JSON value of [merchantCategoryCodes].
                     *
                     * Unlike [merchantCategoryCodes], this method doesn't throw if the JSON field
                     * has an unexpected type.
                     */
                    @JsonProperty("merchant_category_codes")
                    @ExcludeMissing
                    fun _merchantCategoryCodes(): JsonField<List<MerchantCategoryCode>> =
                        merchantCategoryCodes

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
                         * [SpendingLimit].
                         *
                         * The following fields are required:
                         * ```java
                         * .interval()
                         * .settlementAmount()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [SpendingLimit]. */
                    class Builder internal constructor() {

                        private var interval: JsonField<Interval>? = null
                        private var settlementAmount: JsonField<Long>? = null
                        private var merchantCategoryCodes:
                            JsonField<MutableList<MerchantCategoryCode>>? =
                            null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(spendingLimit: SpendingLimit) = apply {
                            interval = spendingLimit.interval
                            settlementAmount = spendingLimit.settlementAmount
                            merchantCategoryCodes =
                                spendingLimit.merchantCategoryCodes.map { it.toMutableList() }
                            additionalProperties = spendingLimit.additionalProperties.toMutableMap()
                        }

                        /** The interval at which the spending limit is enforced. */
                        fun interval(interval: Interval) = interval(JsonField.of(interval))

                        /**
                         * Sets [Builder.interval] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.interval] with a well-typed [Interval]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun interval(interval: JsonField<Interval>) = apply {
                            this.interval = interval
                        }

                        /** The maximum settlement amount permitted in the given interval. */
                        fun settlementAmount(settlementAmount: Long) =
                            settlementAmount(JsonField.of(settlementAmount))

                        /**
                         * Sets [Builder.settlementAmount] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.settlementAmount] with a well-typed
                         * [Long] value instead. This method is primarily for setting the field to
                         * an undocumented or not yet supported value.
                         */
                        fun settlementAmount(settlementAmount: JsonField<Long>) = apply {
                            this.settlementAmount = settlementAmount
                        }

                        /**
                         * The Merchant Category Codes this spending limit applies to. If not set,
                         * the limit applies to all transactions.
                         */
                        fun merchantCategoryCodes(
                            merchantCategoryCodes: List<MerchantCategoryCode>
                        ) = merchantCategoryCodes(JsonField.of(merchantCategoryCodes))

                        /**
                         * Sets [Builder.merchantCategoryCodes] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.merchantCategoryCodes] with a well-typed
                         * `List<MerchantCategoryCode>` value instead. This method is primarily for
                         * setting the field to an undocumented or not yet supported value.
                         */
                        fun merchantCategoryCodes(
                            merchantCategoryCodes: JsonField<List<MerchantCategoryCode>>
                        ) = apply {
                            this.merchantCategoryCodes =
                                merchantCategoryCodes.map { it.toMutableList() }
                        }

                        /**
                         * Adds a single [MerchantCategoryCode] to [merchantCategoryCodes].
                         *
                         * @throws IllegalStateException if the field was previously set to a
                         *   non-list.
                         */
                        fun addMerchantCategoryCode(merchantCategoryCode: MerchantCategoryCode) =
                            apply {
                                merchantCategoryCodes =
                                    (merchantCategoryCodes ?: JsonField.of(mutableListOf())).also {
                                        checkKnown("merchantCategoryCodes", it)
                                            .add(merchantCategoryCode)
                                    }
                            }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [SpendingLimit].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .interval()
                         * .settlementAmount()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): SpendingLimit =
                            SpendingLimit(
                                checkRequired("interval", interval),
                                checkRequired("settlementAmount", settlementAmount),
                                (merchantCategoryCodes ?: JsonMissing.of()).map {
                                    it.toImmutable()
                                },
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws IncreaseInvalidDataException if any value type in this object doesn't
                     *   match its expected type.
                     */
                    fun validate(): SpendingLimit = apply {
                        if (validated) {
                            return@apply
                        }

                        interval().validate()
                        settlementAmount()
                        merchantCategoryCodes().ifPresent { it.forEach { it.validate() } }
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
                        (interval.asKnown().getOrNull()?.validity() ?: 0) +
                            (if (settlementAmount.asKnown().isPresent) 1 else 0) +
                            (merchantCategoryCodes.asKnown().getOrNull()?.sumOf {
                                it.validity().toInt()
                            } ?: 0)

                    /** The interval at which the spending limit is enforced. */
                    class Interval
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            /** The spending limit applies over the lifetime of the card. */
                            @JvmField val ALL_TIME = of("all_time")

                            /** The spending limit applies per transaction. */
                            @JvmField val PER_TRANSACTION = of("per_transaction")

                            /**
                             * The spending limit applies per day. Resets nightly at midnight UTC.
                             */
                            @JvmField val PER_DAY = of("per_day")

                            /**
                             * The spending limit applies per week. Resets weekly on Mondays at
                             * midnight UTC.
                             */
                            @JvmField val PER_WEEK = of("per_week")

                            /**
                             * The spending limit applies per month. Resets on the first of the
                             * month, midnight UTC.
                             */
                            @JvmField val PER_MONTH = of("per_month")

                            @JvmStatic fun of(value: String) = Interval(JsonField.of(value))
                        }

                        /** An enum containing [Interval]'s known values. */
                        enum class Known {
                            /** The spending limit applies over the lifetime of the card. */
                            ALL_TIME,
                            /** The spending limit applies per transaction. */
                            PER_TRANSACTION,
                            /**
                             * The spending limit applies per day. Resets nightly at midnight UTC.
                             */
                            PER_DAY,
                            /**
                             * The spending limit applies per week. Resets weekly on Mondays at
                             * midnight UTC.
                             */
                            PER_WEEK,
                            /**
                             * The spending limit applies per month. Resets on the first of the
                             * month, midnight UTC.
                             */
                            PER_MONTH,
                        }

                        /**
                         * An enum containing [Interval]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Interval] can contain an unknown value in a couple of
                         * cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            /** The spending limit applies over the lifetime of the card. */
                            ALL_TIME,
                            /** The spending limit applies per transaction. */
                            PER_TRANSACTION,
                            /**
                             * The spending limit applies per day. Resets nightly at midnight UTC.
                             */
                            PER_DAY,
                            /**
                             * The spending limit applies per week. Resets weekly on Mondays at
                             * midnight UTC.
                             */
                            PER_WEEK,
                            /**
                             * The spending limit applies per month. Resets on the first of the
                             * month, midnight UTC.
                             */
                            PER_MONTH,
                            /**
                             * An enum member indicating that [Interval] was instantiated with an
                             * unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                ALL_TIME -> Value.ALL_TIME
                                PER_TRANSACTION -> Value.PER_TRANSACTION
                                PER_DAY -> Value.PER_DAY
                                PER_WEEK -> Value.PER_WEEK
                                PER_MONTH -> Value.PER_MONTH
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws IncreaseInvalidDataException if this class instance's value is a
                         *   not a known member.
                         */
                        fun known(): Known =
                            when (this) {
                                ALL_TIME -> Known.ALL_TIME
                                PER_TRANSACTION -> Known.PER_TRANSACTION
                                PER_DAY -> Known.PER_DAY
                                PER_WEEK -> Known.PER_WEEK
                                PER_MONTH -> Known.PER_MONTH
                                else ->
                                    throw IncreaseInvalidDataException("Unknown Interval: $value")
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws IncreaseInvalidDataException if this class instance's value does
                         *   not have the expected primitive type.
                         */
                        fun asString(): String =
                            _value().asString().orElseThrow {
                                IncreaseInvalidDataException("Value is not a String")
                            }

                        private var validated: Boolean = false

                        /**
                         * Validates that the types of all values in this object match their
                         * expected types recursively.
                         *
                         * This method is _not_ forwards compatible with new types from the API for
                         * existing fields.
                         *
                         * @throws IncreaseInvalidDataException if any value type in this object
                         *   doesn't match its expected type.
                         */
                        fun validate(): Interval = apply {
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Interval && value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    class MerchantCategoryCode
                    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                    private constructor(
                        private val code: JsonField<String>,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("code")
                            @ExcludeMissing
                            code: JsonField<String> = JsonMissing.of()
                        ) : this(code, mutableMapOf())

                        /**
                         * The Merchant Category Code.
                         *
                         * @throws IncreaseInvalidDataException if the JSON field has an unexpected
                         *   type or is unexpectedly missing or null (e.g. if the server responded
                         *   with an unexpected value).
                         */
                        fun code(): String = code.getRequired("code")

                        /**
                         * Returns the raw JSON value of [code].
                         *
                         * Unlike [code], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

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
                             * [MerchantCategoryCode].
                             *
                             * The following fields are required:
                             * ```java
                             * .code()
                             * ```
                             */
                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [MerchantCategoryCode]. */
                        class Builder internal constructor() {

                            private var code: JsonField<String>? = null
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(merchantCategoryCode: MerchantCategoryCode) = apply {
                                code = merchantCategoryCode.code
                                additionalProperties =
                                    merchantCategoryCode.additionalProperties.toMutableMap()
                            }

                            /** The Merchant Category Code. */
                            fun code(code: String) = code(JsonField.of(code))

                            /**
                             * Sets [Builder.code] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.code] with a well-typed [String]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun code(code: JsonField<String>) = apply { this.code = code }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            /**
                             * Returns an immutable instance of [MerchantCategoryCode].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             *
                             * The following fields are required:
                             * ```java
                             * .code()
                             * ```
                             *
                             * @throws IllegalStateException if any required field is unset.
                             */
                            fun build(): MerchantCategoryCode =
                                MerchantCategoryCode(
                                    checkRequired("code", code),
                                    additionalProperties.toMutableMap(),
                                )
                        }

                        private var validated: Boolean = false

                        /**
                         * Validates that the types of all values in this object match their
                         * expected types recursively.
                         *
                         * This method is _not_ forwards compatible with new types from the API for
                         * existing fields.
                         *
                         * @throws IncreaseInvalidDataException if any value type in this object
                         *   doesn't match its expected type.
                         */
                        fun validate(): MerchantCategoryCode = apply {
                            if (validated) {
                                return@apply
                            }

                            code()
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = (if (code.asKnown().isPresent) 1 else 0)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is MerchantCategoryCode &&
                                code == other.code &&
                                additionalProperties == other.additionalProperties
                        }

                        private val hashCode: Int by lazy {
                            Objects.hash(code, additionalProperties)
                        }

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "MerchantCategoryCode{code=$code, additionalProperties=$additionalProperties}"
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is SpendingLimit &&
                            interval == other.interval &&
                            settlementAmount == other.settlementAmount &&
                            merchantCategoryCodes == other.merchantCategoryCodes &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(
                            interval,
                            settlementAmount,
                            merchantCategoryCodes,
                            additionalProperties,
                        )
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "SpendingLimit{interval=$interval, settlementAmount=$settlementAmount, merchantCategoryCodes=$merchantCategoryCodes, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is MultiUse &&
                        spendingLimits == other.spendingLimits &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(spendingLimits, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "MultiUse{spendingLimits=$spendingLimits, additionalProperties=$additionalProperties}"
            }

            /**
             * Controls for single-use cards. Required if and only if `category` is `single_use`.
             */
            class SingleUse
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val settlementAmount: JsonField<SettlementAmount>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("settlement_amount")
                    @ExcludeMissing
                    settlementAmount: JsonField<SettlementAmount> = JsonMissing.of()
                ) : this(settlementAmount, mutableMapOf())

                /**
                 * The settlement amount constraint for this single-use card.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun settlementAmount(): SettlementAmount =
                    settlementAmount.getRequired("settlement_amount")

                /**
                 * Returns the raw JSON value of [settlementAmount].
                 *
                 * Unlike [settlementAmount], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("settlement_amount")
                @ExcludeMissing
                fun _settlementAmount(): JsonField<SettlementAmount> = settlementAmount

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
                     * Returns a mutable builder for constructing an instance of [SingleUse].
                     *
                     * The following fields are required:
                     * ```java
                     * .settlementAmount()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [SingleUse]. */
                class Builder internal constructor() {

                    private var settlementAmount: JsonField<SettlementAmount>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(singleUse: SingleUse) = apply {
                        settlementAmount = singleUse.settlementAmount
                        additionalProperties = singleUse.additionalProperties.toMutableMap()
                    }

                    /** The settlement amount constraint for this single-use card. */
                    fun settlementAmount(settlementAmount: SettlementAmount) =
                        settlementAmount(JsonField.of(settlementAmount))

                    /**
                     * Sets [Builder.settlementAmount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.settlementAmount] with a well-typed
                     * [SettlementAmount] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun settlementAmount(settlementAmount: JsonField<SettlementAmount>) = apply {
                        this.settlementAmount = settlementAmount
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
                     * Returns an immutable instance of [SingleUse].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .settlementAmount()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): SingleUse =
                        SingleUse(
                            checkRequired("settlementAmount", settlementAmount),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws IncreaseInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): SingleUse = apply {
                    if (validated) {
                        return@apply
                    }

                    settlementAmount().validate()
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
                    (settlementAmount.asKnown().getOrNull()?.validity() ?: 0)

                /** The settlement amount constraint for this single-use card. */
                class SettlementAmount
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val comparison: JsonField<Comparison>,
                    private val value: JsonField<Long>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("comparison")
                        @ExcludeMissing
                        comparison: JsonField<Comparison> = JsonMissing.of(),
                        @JsonProperty("value")
                        @ExcludeMissing
                        value: JsonField<Long> = JsonMissing.of(),
                    ) : this(comparison, value, mutableMapOf())

                    /**
                     * The operator used to compare the settlement amount.
                     *
                     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun comparison(): Comparison = comparison.getRequired("comparison")

                    /**
                     * The settlement amount value.
                     *
                     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun value(): Long = value.getRequired("value")

                    /**
                     * Returns the raw JSON value of [comparison].
                     *
                     * Unlike [comparison], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("comparison")
                    @ExcludeMissing
                    fun _comparison(): JsonField<Comparison> = comparison

                    /**
                     * Returns the raw JSON value of [value].
                     *
                     * Unlike [value], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Long> = value

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
                         * [SettlementAmount].
                         *
                         * The following fields are required:
                         * ```java
                         * .comparison()
                         * .value()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [SettlementAmount]. */
                    class Builder internal constructor() {

                        private var comparison: JsonField<Comparison>? = null
                        private var value: JsonField<Long>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(settlementAmount: SettlementAmount) = apply {
                            comparison = settlementAmount.comparison
                            value = settlementAmount.value
                            additionalProperties =
                                settlementAmount.additionalProperties.toMutableMap()
                        }

                        /** The operator used to compare the settlement amount. */
                        fun comparison(comparison: Comparison) =
                            comparison(JsonField.of(comparison))

                        /**
                         * Sets [Builder.comparison] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.comparison] with a well-typed
                         * [Comparison] value instead. This method is primarily for setting the
                         * field to an undocumented or not yet supported value.
                         */
                        fun comparison(comparison: JsonField<Comparison>) = apply {
                            this.comparison = comparison
                        }

                        /** The settlement amount value. */
                        fun value(value: Long) = value(JsonField.of(value))

                        /**
                         * Sets [Builder.value] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.value] with a well-typed [Long] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun value(value: JsonField<Long>) = apply { this.value = value }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [SettlementAmount].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .comparison()
                         * .value()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): SettlementAmount =
                            SettlementAmount(
                                checkRequired("comparison", comparison),
                                checkRequired("value", value),
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws IncreaseInvalidDataException if any value type in this object doesn't
                     *   match its expected type.
                     */
                    fun validate(): SettlementAmount = apply {
                        if (validated) {
                            return@apply
                        }

                        comparison().validate()
                        value()
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
                        (comparison.asKnown().getOrNull()?.validity() ?: 0) +
                            (if (value.asKnown().isPresent) 1 else 0)

                    /** The operator used to compare the settlement amount. */
                    class Comparison
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            /** The settlement amount must be exactly the specified value. */
                            @JvmField val EQUALS = of("equals")

                            /**
                             * The settlement amount must be less than or equal to the specified
                             * value.
                             */
                            @JvmField val LESS_THAN_OR_EQUALS = of("less_than_or_equals")

                            @JvmStatic fun of(value: String) = Comparison(JsonField.of(value))
                        }

                        /** An enum containing [Comparison]'s known values. */
                        enum class Known {
                            /** The settlement amount must be exactly the specified value. */
                            EQUALS,
                            /**
                             * The settlement amount must be less than or equal to the specified
                             * value.
                             */
                            LESS_THAN_OR_EQUALS,
                        }

                        /**
                         * An enum containing [Comparison]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Comparison] can contain an unknown value in a couple of
                         * cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            /** The settlement amount must be exactly the specified value. */
                            EQUALS,
                            /**
                             * The settlement amount must be less than or equal to the specified
                             * value.
                             */
                            LESS_THAN_OR_EQUALS,
                            /**
                             * An enum member indicating that [Comparison] was instantiated with an
                             * unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                EQUALS -> Value.EQUALS
                                LESS_THAN_OR_EQUALS -> Value.LESS_THAN_OR_EQUALS
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws IncreaseInvalidDataException if this class instance's value is a
                         *   not a known member.
                         */
                        fun known(): Known =
                            when (this) {
                                EQUALS -> Known.EQUALS
                                LESS_THAN_OR_EQUALS -> Known.LESS_THAN_OR_EQUALS
                                else ->
                                    throw IncreaseInvalidDataException("Unknown Comparison: $value")
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws IncreaseInvalidDataException if this class instance's value does
                         *   not have the expected primitive type.
                         */
                        fun asString(): String =
                            _value().asString().orElseThrow {
                                IncreaseInvalidDataException("Value is not a String")
                            }

                        private var validated: Boolean = false

                        /**
                         * Validates that the types of all values in this object match their
                         * expected types recursively.
                         *
                         * This method is _not_ forwards compatible with new types from the API for
                         * existing fields.
                         *
                         * @throws IncreaseInvalidDataException if any value type in this object
                         *   doesn't match its expected type.
                         */
                        fun validate(): Comparison = apply {
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Comparison && value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is SettlementAmount &&
                            comparison == other.comparison &&
                            value == other.value &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(comparison, value, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "SettlementAmount{comparison=$comparison, value=$value, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is SingleUse &&
                        settlementAmount == other.settlementAmount &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(settlementAmount, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "SingleUse{settlementAmount=$settlementAmount, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Usage &&
                    category == other.category &&
                    multiUse == other.multiUse &&
                    singleUse == other.singleUse &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(category, multiUse, singleUse, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Usage{category=$category, multiUse=$multiUse, singleUse=$singleUse, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AuthorizationControls &&
                merchantAcceptorIdentifier == other.merchantAcceptorIdentifier &&
                merchantCategoryCode == other.merchantCategoryCode &&
                merchantCountry == other.merchantCountry &&
                usage == other.usage &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                merchantAcceptorIdentifier,
                merchantCategoryCode,
                merchantCountry,
                usage,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AuthorizationControls{merchantAcceptorIdentifier=$merchantAcceptorIdentifier, merchantCategoryCode=$merchantCategoryCode, merchantCountry=$merchantCountry, usage=$usage, additionalProperties=$additionalProperties}"
    }

    /** The card's billing address. */
    class BillingAddress
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val city: JsonField<String>,
        private val line1: JsonField<String>,
        private val postalCode: JsonField<String>,
        private val state: JsonField<String>,
        private val line2: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("city") @ExcludeMissing city: JsonField<String> = JsonMissing.of(),
            @JsonProperty("line1") @ExcludeMissing line1: JsonField<String> = JsonMissing.of(),
            @JsonProperty("postal_code")
            @ExcludeMissing
            postalCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("state") @ExcludeMissing state: JsonField<String> = JsonMissing.of(),
            @JsonProperty("line2") @ExcludeMissing line2: JsonField<String> = JsonMissing.of(),
        ) : this(city, line1, postalCode, state, line2, mutableMapOf())

        /**
         * The city of the billing address.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun city(): String = city.getRequired("city")

        /**
         * The first line of the billing address.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun line1(): String = line1.getRequired("line1")

        /**
         * The postal code of the billing address.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun postalCode(): String = postalCode.getRequired("postal_code")

        /**
         * The US state of the billing address.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun state(): String = state.getRequired("state")

        /**
         * The second line of the billing address.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun line2(): Optional<String> = line2.getOptional("line2")

        /**
         * Returns the raw JSON value of [city].
         *
         * Unlike [city], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

        /**
         * Returns the raw JSON value of [line1].
         *
         * Unlike [line1], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("line1") @ExcludeMissing fun _line1(): JsonField<String> = line1

        /**
         * Returns the raw JSON value of [postalCode].
         *
         * Unlike [postalCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("postal_code")
        @ExcludeMissing
        fun _postalCode(): JsonField<String> = postalCode

        /**
         * Returns the raw JSON value of [state].
         *
         * Unlike [state], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

        /**
         * Returns the raw JSON value of [line2].
         *
         * Unlike [line2], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("line2") @ExcludeMissing fun _line2(): JsonField<String> = line2

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
             * Returns a mutable builder for constructing an instance of [BillingAddress].
             *
             * The following fields are required:
             * ```java
             * .city()
             * .line1()
             * .postalCode()
             * .state()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [BillingAddress]. */
        class Builder internal constructor() {

            private var city: JsonField<String>? = null
            private var line1: JsonField<String>? = null
            private var postalCode: JsonField<String>? = null
            private var state: JsonField<String>? = null
            private var line2: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(billingAddress: BillingAddress) = apply {
                city = billingAddress.city
                line1 = billingAddress.line1
                postalCode = billingAddress.postalCode
                state = billingAddress.state
                line2 = billingAddress.line2
                additionalProperties = billingAddress.additionalProperties.toMutableMap()
            }

            /** The city of the billing address. */
            fun city(city: String) = city(JsonField.of(city))

            /**
             * Sets [Builder.city] to an arbitrary JSON value.
             *
             * You should usually call [Builder.city] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun city(city: JsonField<String>) = apply { this.city = city }

            /** The first line of the billing address. */
            fun line1(line1: String) = line1(JsonField.of(line1))

            /**
             * Sets [Builder.line1] to an arbitrary JSON value.
             *
             * You should usually call [Builder.line1] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

            /** The postal code of the billing address. */
            fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

            /**
             * Sets [Builder.postalCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.postalCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun postalCode(postalCode: JsonField<String>) = apply { this.postalCode = postalCode }

            /** The US state of the billing address. */
            fun state(state: String) = state(JsonField.of(state))

            /**
             * Sets [Builder.state] to an arbitrary JSON value.
             *
             * You should usually call [Builder.state] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun state(state: JsonField<String>) = apply { this.state = state }

            /** The second line of the billing address. */
            fun line2(line2: String) = line2(JsonField.of(line2))

            /**
             * Sets [Builder.line2] to an arbitrary JSON value.
             *
             * You should usually call [Builder.line2] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

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
             * Returns an immutable instance of [BillingAddress].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .city()
             * .line1()
             * .postalCode()
             * .state()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): BillingAddress =
                BillingAddress(
                    checkRequired("city", city),
                    checkRequired("line1", line1),
                    checkRequired("postalCode", postalCode),
                    checkRequired("state", state),
                    line2,
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
        fun validate(): BillingAddress = apply {
            if (validated) {
                return@apply
            }

            city()
            line1()
            postalCode()
            state()
            line2()
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
            (if (city.asKnown().isPresent) 1 else 0) +
                (if (line1.asKnown().isPresent) 1 else 0) +
                (if (postalCode.asKnown().isPresent) 1 else 0) +
                (if (state.asKnown().isPresent) 1 else 0) +
                (if (line2.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is BillingAddress &&
                city == other.city &&
                line1 == other.line1 &&
                postalCode == other.postalCode &&
                state == other.state &&
                line2 == other.line2 &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(city, line1, postalCode, state, line2, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "BillingAddress{city=$city, line1=$line1, postalCode=$postalCode, state=$state, line2=$line2, additionalProperties=$additionalProperties}"
    }

    /**
     * The contact information used in the two-factor steps for digital wallet card creation. To add
     * the card to a digital wallet, you may supply an email or phone number with this request.
     * Otherwise, subscribe and then action a Real Time Decision with the category
     * `digital_wallet_token_requested` or `digital_wallet_authentication_requested`.
     */
    class DigitalWallet
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val digitalCardProfileId: JsonField<String>,
        private val email: JsonField<String>,
        private val phone: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("digital_card_profile_id")
            @ExcludeMissing
            digitalCardProfileId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
            @JsonProperty("phone") @ExcludeMissing phone: JsonField<String> = JsonMissing.of(),
        ) : this(digitalCardProfileId, email, phone, mutableMapOf())

        /**
         * The digital card profile assigned to this digital card.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun digitalCardProfileId(): Optional<String> =
            digitalCardProfileId.getOptional("digital_card_profile_id")

        /**
         * An email address that can be used to contact and verify the cardholder via one-time
         * passcode over email.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun email(): Optional<String> = email.getOptional("email")

        /**
         * A phone number that can be used to contact and verify the cardholder via one-time
         * passcode over SMS.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun phone(): Optional<String> = phone.getOptional("phone")

        /**
         * Returns the raw JSON value of [digitalCardProfileId].
         *
         * Unlike [digitalCardProfileId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("digital_card_profile_id")
        @ExcludeMissing
        fun _digitalCardProfileId(): JsonField<String> = digitalCardProfileId

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

            /** Returns a mutable builder for constructing an instance of [DigitalWallet]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [DigitalWallet]. */
        class Builder internal constructor() {

            private var digitalCardProfileId: JsonField<String> = JsonMissing.of()
            private var email: JsonField<String> = JsonMissing.of()
            private var phone: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(digitalWallet: DigitalWallet) = apply {
                digitalCardProfileId = digitalWallet.digitalCardProfileId
                email = digitalWallet.email
                phone = digitalWallet.phone
                additionalProperties = digitalWallet.additionalProperties.toMutableMap()
            }

            /** The digital card profile assigned to this digital card. */
            fun digitalCardProfileId(digitalCardProfileId: String) =
                digitalCardProfileId(JsonField.of(digitalCardProfileId))

            /**
             * Sets [Builder.digitalCardProfileId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.digitalCardProfileId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun digitalCardProfileId(digitalCardProfileId: JsonField<String>) = apply {
                this.digitalCardProfileId = digitalCardProfileId
            }

            /**
             * An email address that can be used to contact and verify the cardholder via one-time
             * passcode over email.
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
             * A phone number that can be used to contact and verify the cardholder via one-time
             * passcode over SMS.
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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [DigitalWallet].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): DigitalWallet =
                DigitalWallet(
                    digitalCardProfileId,
                    email,
                    phone,
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
        fun validate(): DigitalWallet = apply {
            if (validated) {
                return@apply
            }

            digitalCardProfileId()
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
            (if (digitalCardProfileId.asKnown().isPresent) 1 else 0) +
                (if (email.asKnown().isPresent) 1 else 0) +
                (if (phone.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DigitalWallet &&
                digitalCardProfileId == other.digitalCardProfileId &&
                email == other.email &&
                phone == other.phone &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(digitalCardProfileId, email, phone, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DigitalWallet{digitalCardProfileId=$digitalCardProfileId, email=$email, phone=$phone, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CardCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "CardCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
