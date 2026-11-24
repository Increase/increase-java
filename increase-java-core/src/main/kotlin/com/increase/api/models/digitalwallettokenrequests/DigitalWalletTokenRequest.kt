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
    private val cardholder: JsonField<Cardholder>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val declined: JsonField<Declined>,
    private val device: JsonField<Device>,
    private val network: JsonField<Network>,
    private val outcome: JsonField<Outcome>,
    private val primaryAccountNumberSource: JsonField<PrimaryAccountNumberSource>,
    private val provisioned: JsonField<Provisioned>,
    private val tokenReferenceIdentifier: JsonField<String>,
    private val tokenRequestor: JsonField<TokenRequestor>,
    private val tokenRequestorDetails: JsonField<TokenRequestorDetails>,
    private val type: JsonField<Type>,
    private val verification: JsonField<Verification>,
    private val visa: JsonField<Visa>,
    private val wallet: JsonField<Wallet>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("card_id") @ExcludeMissing cardId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("cardholder")
        @ExcludeMissing
        cardholder: JsonField<Cardholder> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("declined") @ExcludeMissing declined: JsonField<Declined> = JsonMissing.of(),
        @JsonProperty("device") @ExcludeMissing device: JsonField<Device> = JsonMissing.of(),
        @JsonProperty("network") @ExcludeMissing network: JsonField<Network> = JsonMissing.of(),
        @JsonProperty("outcome") @ExcludeMissing outcome: JsonField<Outcome> = JsonMissing.of(),
        @JsonProperty("primary_account_number_source")
        @ExcludeMissing
        primaryAccountNumberSource: JsonField<PrimaryAccountNumberSource> = JsonMissing.of(),
        @JsonProperty("provisioned")
        @ExcludeMissing
        provisioned: JsonField<Provisioned> = JsonMissing.of(),
        @JsonProperty("token_reference_identifier")
        @ExcludeMissing
        tokenReferenceIdentifier: JsonField<String> = JsonMissing.of(),
        @JsonProperty("token_requestor")
        @ExcludeMissing
        tokenRequestor: JsonField<TokenRequestor> = JsonMissing.of(),
        @JsonProperty("token_requestor_details")
        @ExcludeMissing
        tokenRequestorDetails: JsonField<TokenRequestorDetails> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("verification")
        @ExcludeMissing
        verification: JsonField<Verification> = JsonMissing.of(),
        @JsonProperty("visa") @ExcludeMissing visa: JsonField<Visa> = JsonMissing.of(),
        @JsonProperty("wallet") @ExcludeMissing wallet: JsonField<Wallet> = JsonMissing.of(),
    ) : this(
        id,
        cardId,
        cardholder,
        createdAt,
        declined,
        device,
        network,
        outcome,
        primaryAccountNumberSource,
        provisioned,
        tokenReferenceIdentifier,
        tokenRequestor,
        tokenRequestorDetails,
        type,
        verification,
        visa,
        wallet,
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
     * The cardholder adding the card to the digital wallet.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun cardholder(): Cardholder = cardholder.getRequired("cardholder")

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
     * The card network the token is being provisioned on.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun network(): Network = network.getRequired("network")

    /**
     * The outcome of the tokenization request.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun outcome(): Outcome = outcome.getRequired("outcome")

    /**
     * How the card number was provided to the digital wallet.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun primaryAccountNumberSource(): Optional<PrimaryAccountNumberSource> =
        primaryAccountNumberSource.getOptional("primary_account_number_source")

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
     * The digital wallet or merchant that requested the token.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tokenRequestorDetails(): TokenRequestorDetails =
        tokenRequestorDetails.getRequired("token_requestor_details")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `digital_wallet_token_request`.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * Fields related to verification of cardholder-provided values.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun verification(): Verification = verification.getRequired("verification")

    /**
     * Risk scores provided by Visa for the provisioning request. This field will be present in the
     * JSON response if and only if `network` is equal to `visa`.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun visa(): Optional<Visa> = visa.getOptional("visa")

    /**
     * Details about the digital wallet.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun wallet(): Wallet = wallet.getRequired("wallet")

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
     * Returns the raw JSON value of [cardholder].
     *
     * Unlike [cardholder], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cardholder")
    @ExcludeMissing
    fun _cardholder(): JsonField<Cardholder> = cardholder

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
     * Returns the raw JSON value of [network].
     *
     * Unlike [network], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("network") @ExcludeMissing fun _network(): JsonField<Network> = network

    /**
     * Returns the raw JSON value of [outcome].
     *
     * Unlike [outcome], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("outcome") @ExcludeMissing fun _outcome(): JsonField<Outcome> = outcome

    /**
     * Returns the raw JSON value of [primaryAccountNumberSource].
     *
     * Unlike [primaryAccountNumberSource], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("primary_account_number_source")
    @ExcludeMissing
    fun _primaryAccountNumberSource(): JsonField<PrimaryAccountNumberSource> =
        primaryAccountNumberSource

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
     * Returns the raw JSON value of [tokenRequestorDetails].
     *
     * Unlike [tokenRequestorDetails], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("token_requestor_details")
    @ExcludeMissing
    fun _tokenRequestorDetails(): JsonField<TokenRequestorDetails> = tokenRequestorDetails

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    /**
     * Returns the raw JSON value of [verification].
     *
     * Unlike [verification], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("verification")
    @ExcludeMissing
    fun _verification(): JsonField<Verification> = verification

    /**
     * Returns the raw JSON value of [visa].
     *
     * Unlike [visa], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("visa") @ExcludeMissing fun _visa(): JsonField<Visa> = visa

    /**
     * Returns the raw JSON value of [wallet].
     *
     * Unlike [wallet], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("wallet") @ExcludeMissing fun _wallet(): JsonField<Wallet> = wallet

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
         * .cardholder()
         * .createdAt()
         * .declined()
         * .device()
         * .network()
         * .outcome()
         * .primaryAccountNumberSource()
         * .provisioned()
         * .tokenReferenceIdentifier()
         * .tokenRequestor()
         * .tokenRequestorDetails()
         * .type()
         * .verification()
         * .visa()
         * .wallet()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DigitalWalletTokenRequest]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var cardId: JsonField<String>? = null
        private var cardholder: JsonField<Cardholder>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var declined: JsonField<Declined>? = null
        private var device: JsonField<Device>? = null
        private var network: JsonField<Network>? = null
        private var outcome: JsonField<Outcome>? = null
        private var primaryAccountNumberSource: JsonField<PrimaryAccountNumberSource>? = null
        private var provisioned: JsonField<Provisioned>? = null
        private var tokenReferenceIdentifier: JsonField<String>? = null
        private var tokenRequestor: JsonField<TokenRequestor>? = null
        private var tokenRequestorDetails: JsonField<TokenRequestorDetails>? = null
        private var type: JsonField<Type>? = null
        private var verification: JsonField<Verification>? = null
        private var visa: JsonField<Visa>? = null
        private var wallet: JsonField<Wallet>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(digitalWalletTokenRequest: DigitalWalletTokenRequest) = apply {
            id = digitalWalletTokenRequest.id
            cardId = digitalWalletTokenRequest.cardId
            cardholder = digitalWalletTokenRequest.cardholder
            createdAt = digitalWalletTokenRequest.createdAt
            declined = digitalWalletTokenRequest.declined
            device = digitalWalletTokenRequest.device
            network = digitalWalletTokenRequest.network
            outcome = digitalWalletTokenRequest.outcome
            primaryAccountNumberSource = digitalWalletTokenRequest.primaryAccountNumberSource
            provisioned = digitalWalletTokenRequest.provisioned
            tokenReferenceIdentifier = digitalWalletTokenRequest.tokenReferenceIdentifier
            tokenRequestor = digitalWalletTokenRequest.tokenRequestor
            tokenRequestorDetails = digitalWalletTokenRequest.tokenRequestorDetails
            type = digitalWalletTokenRequest.type
            verification = digitalWalletTokenRequest.verification
            visa = digitalWalletTokenRequest.visa
            wallet = digitalWalletTokenRequest.wallet
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

        /** The cardholder adding the card to the digital wallet. */
        fun cardholder(cardholder: Cardholder) = cardholder(JsonField.of(cardholder))

        /**
         * Sets [Builder.cardholder] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cardholder] with a well-typed [Cardholder] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun cardholder(cardholder: JsonField<Cardholder>) = apply { this.cardholder = cardholder }

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

        /** The card network the token is being provisioned on. */
        fun network(network: Network) = network(JsonField.of(network))

        /**
         * Sets [Builder.network] to an arbitrary JSON value.
         *
         * You should usually call [Builder.network] with a well-typed [Network] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun network(network: JsonField<Network>) = apply { this.network = network }

        /** The outcome of the tokenization request. */
        fun outcome(outcome: Outcome) = outcome(JsonField.of(outcome))

        /**
         * Sets [Builder.outcome] to an arbitrary JSON value.
         *
         * You should usually call [Builder.outcome] with a well-typed [Outcome] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun outcome(outcome: JsonField<Outcome>) = apply { this.outcome = outcome }

        /** How the card number was provided to the digital wallet. */
        fun primaryAccountNumberSource(primaryAccountNumberSource: PrimaryAccountNumberSource?) =
            primaryAccountNumberSource(JsonField.ofNullable(primaryAccountNumberSource))

        /**
         * Alias for calling [Builder.primaryAccountNumberSource] with
         * `primaryAccountNumberSource.orElse(null)`.
         */
        fun primaryAccountNumberSource(
            primaryAccountNumberSource: Optional<PrimaryAccountNumberSource>
        ) = primaryAccountNumberSource(primaryAccountNumberSource.getOrNull())

        /**
         * Sets [Builder.primaryAccountNumberSource] to an arbitrary JSON value.
         *
         * You should usually call [Builder.primaryAccountNumberSource] with a well-typed
         * [PrimaryAccountNumberSource] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun primaryAccountNumberSource(
            primaryAccountNumberSource: JsonField<PrimaryAccountNumberSource>
        ) = apply { this.primaryAccountNumberSource = primaryAccountNumberSource }

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

        /** The digital wallet or merchant that requested the token. */
        fun tokenRequestorDetails(tokenRequestorDetails: TokenRequestorDetails) =
            tokenRequestorDetails(JsonField.of(tokenRequestorDetails))

        /**
         * Sets [Builder.tokenRequestorDetails] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tokenRequestorDetails] with a well-typed
         * [TokenRequestorDetails] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun tokenRequestorDetails(tokenRequestorDetails: JsonField<TokenRequestorDetails>) = apply {
            this.tokenRequestorDetails = tokenRequestorDetails
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

        /**
         * Risk scores provided by Visa for the provisioning request. This field will be present in
         * the JSON response if and only if `network` is equal to `visa`.
         */
        fun visa(visa: Visa?) = visa(JsonField.ofNullable(visa))

        /** Alias for calling [Builder.visa] with `visa.orElse(null)`. */
        fun visa(visa: Optional<Visa>) = visa(visa.getOrNull())

        /**
         * Sets [Builder.visa] to an arbitrary JSON value.
         *
         * You should usually call [Builder.visa] with a well-typed [Visa] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun visa(visa: JsonField<Visa>) = apply { this.visa = visa }

        /** Details about the digital wallet. */
        fun wallet(wallet: Wallet) = wallet(JsonField.of(wallet))

        /**
         * Sets [Builder.wallet] to an arbitrary JSON value.
         *
         * You should usually call [Builder.wallet] with a well-typed [Wallet] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun wallet(wallet: JsonField<Wallet>) = apply { this.wallet = wallet }

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
         * .cardholder()
         * .createdAt()
         * .declined()
         * .device()
         * .network()
         * .outcome()
         * .primaryAccountNumberSource()
         * .provisioned()
         * .tokenReferenceIdentifier()
         * .tokenRequestor()
         * .tokenRequestorDetails()
         * .type()
         * .verification()
         * .visa()
         * .wallet()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DigitalWalletTokenRequest =
            DigitalWalletTokenRequest(
                checkRequired("id", id),
                checkRequired("cardId", cardId),
                checkRequired("cardholder", cardholder),
                checkRequired("createdAt", createdAt),
                checkRequired("declined", declined),
                checkRequired("device", device),
                checkRequired("network", network),
                checkRequired("outcome", outcome),
                checkRequired("primaryAccountNumberSource", primaryAccountNumberSource),
                checkRequired("provisioned", provisioned),
                checkRequired("tokenReferenceIdentifier", tokenReferenceIdentifier),
                checkRequired("tokenRequestor", tokenRequestor),
                checkRequired("tokenRequestorDetails", tokenRequestorDetails),
                checkRequired("type", type),
                checkRequired("verification", verification),
                checkRequired("visa", visa),
                checkRequired("wallet", wallet),
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
        cardholder().validate()
        createdAt()
        declined().ifPresent { it.validate() }
        device().validate()
        network().validate()
        outcome().validate()
        primaryAccountNumberSource().ifPresent { it.validate() }
        provisioned().ifPresent { it.validate() }
        tokenReferenceIdentifier()
        tokenRequestor().validate()
        tokenRequestorDetails().validate()
        type().validate()
        verification().validate()
        visa().ifPresent { it.validate() }
        wallet().validate()
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
            (cardholder.asKnown().getOrNull()?.validity() ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (declined.asKnown().getOrNull()?.validity() ?: 0) +
            (device.asKnown().getOrNull()?.validity() ?: 0) +
            (network.asKnown().getOrNull()?.validity() ?: 0) +
            (outcome.asKnown().getOrNull()?.validity() ?: 0) +
            (primaryAccountNumberSource.asKnown().getOrNull()?.validity() ?: 0) +
            (provisioned.asKnown().getOrNull()?.validity() ?: 0) +
            (if (tokenReferenceIdentifier.asKnown().isPresent) 1 else 0) +
            (tokenRequestor.asKnown().getOrNull()?.validity() ?: 0) +
            (tokenRequestorDetails.asKnown().getOrNull()?.validity() ?: 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0) +
            (verification.asKnown().getOrNull()?.validity() ?: 0) +
            (visa.asKnown().getOrNull()?.validity() ?: 0) +
            (wallet.asKnown().getOrNull()?.validity() ?: 0)

    /** The cardholder adding the card to the digital wallet. */
    class Cardholder
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val name: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of()
        ) : this(name, mutableMapOf())

        /**
         * The cardholder's name, as entered in the digital wallet.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

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
             * Returns a mutable builder for constructing an instance of [Cardholder].
             *
             * The following fields are required:
             * ```java
             * .name()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Cardholder]. */
        class Builder internal constructor() {

            private var name: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(cardholder: Cardholder) = apply {
                name = cardholder.name
                additionalProperties = cardholder.additionalProperties.toMutableMap()
            }

            /** The cardholder's name, as entered in the digital wallet. */
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
             * Returns an immutable instance of [Cardholder].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .name()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Cardholder =
                Cardholder(checkRequired("name", name), additionalProperties.toMutableMap())
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
        fun validate(): Cardholder = apply {
            if (validated) {
                return@apply
            }

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
        @JvmSynthetic internal fun validity(): Int = (if (name.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Cardholder &&
                name == other.name &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(name, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Cardholder{name=$name, additionalProperties=$additionalProperties}"
    }

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

                /** The given expiration date did not match the card's value. */
                @JvmField val CARD_EXPIRATION_MISMATCH = of("card_expiration_mismatch")

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
                /** The given expiration date did not match the card's value. */
                CARD_EXPIRATION_MISMATCH,
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
                /** The given expiration date did not match the card's value. */
                CARD_EXPIRATION_MISMATCH,
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
                    CARD_EXPIRATION_MISMATCH -> Value.CARD_EXPIRATION_MISMATCH
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
                    CARD_EXPIRATION_MISMATCH -> Known.CARD_EXPIRATION_MISMATCH
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

    /** The card network the token is being provisioned on. */
    class Network @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            /** Visa */
            @JvmField val VISA = of("visa")

            @JvmStatic fun of(value: String) = Network(JsonField.of(value))
        }

        /** An enum containing [Network]'s known values. */
        enum class Known {
            /** Visa */
            VISA
        }

        /**
         * An enum containing [Network]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Network] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            /** Visa */
            VISA,
            /** An enum member indicating that [Network] was instantiated with an unknown value. */
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
                VISA -> Value.VISA
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
                VISA -> Known.VISA
                else -> throw IncreaseInvalidDataException("Unknown Network: $value")
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
        fun validate(): Network = apply {
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

            return other is Network && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
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

    /** How the card number was provided to the digital wallet. */
    class PrimaryAccountNumberSource
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            /** The cardholder entered the card number manually. */
            @JvmField val KEY_ENTERED = of("key_entered")

            /** The card number was already on file with the token requestor. */
            @JvmField val ON_FILE = of("on_file")

            /** The card was added from your mobile app using push provisioning. */
            @JvmField val MOBILE_APP = of("mobile_app")

            /** The card number was sourced from an existing token. */
            @JvmField val TOKEN = of("token")

            /** The card number was read from the chip of the physical card. */
            @JvmField val CHIP_DIP = of("chip_dip")

            /** The card number was read by tapping the physical card on the device. */
            @JvmField val CONTACTLESS_TAP = of("contactless_tap")

            @JvmStatic fun of(value: String) = PrimaryAccountNumberSource(JsonField.of(value))
        }

        /** An enum containing [PrimaryAccountNumberSource]'s known values. */
        enum class Known {
            /** The cardholder entered the card number manually. */
            KEY_ENTERED,
            /** The card number was already on file with the token requestor. */
            ON_FILE,
            /** The card was added from your mobile app using push provisioning. */
            MOBILE_APP,
            /** The card number was sourced from an existing token. */
            TOKEN,
            /** The card number was read from the chip of the physical card. */
            CHIP_DIP,
            /** The card number was read by tapping the physical card on the device. */
            CONTACTLESS_TAP,
        }

        /**
         * An enum containing [PrimaryAccountNumberSource]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [PrimaryAccountNumberSource] can contain an unknown value in a couple of
         * cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            /** The cardholder entered the card number manually. */
            KEY_ENTERED,
            /** The card number was already on file with the token requestor. */
            ON_FILE,
            /** The card was added from your mobile app using push provisioning. */
            MOBILE_APP,
            /** The card number was sourced from an existing token. */
            TOKEN,
            /** The card number was read from the chip of the physical card. */
            CHIP_DIP,
            /** The card number was read by tapping the physical card on the device. */
            CONTACTLESS_TAP,
            /**
             * An enum member indicating that [PrimaryAccountNumberSource] was instantiated with an
             * unknown value.
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
                KEY_ENTERED -> Value.KEY_ENTERED
                ON_FILE -> Value.ON_FILE
                MOBILE_APP -> Value.MOBILE_APP
                TOKEN -> Value.TOKEN
                CHIP_DIP -> Value.CHIP_DIP
                CONTACTLESS_TAP -> Value.CONTACTLESS_TAP
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
                KEY_ENTERED -> Known.KEY_ENTERED
                ON_FILE -> Known.ON_FILE
                MOBILE_APP -> Known.MOBILE_APP
                TOKEN -> Known.TOKEN
                CHIP_DIP -> Known.CHIP_DIP
                CONTACTLESS_TAP -> Known.CONTACTLESS_TAP
                else ->
                    throw IncreaseInvalidDataException("Unknown PrimaryAccountNumberSource: $value")
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
        fun validate(): PrimaryAccountNumberSource = apply {
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

            return other is PrimaryAccountNumberSource && value == other.value
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

    /** The digital wallet or merchant that requested the token. */
    class TokenRequestorDetails
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val identifier: JsonField<String>,
        private val name: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("identifier")
            @ExcludeMissing
            identifier: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        ) : this(identifier, name, mutableMapOf())

        /**
         * The identifier assigned to the token requestor by the card network.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun identifier(): String = identifier.getRequired("identifier")

        /**
         * The name of the token requestor, for example "Apple Inc.".
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * Returns the raw JSON value of [identifier].
         *
         * Unlike [identifier], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("identifier")
        @ExcludeMissing
        fun _identifier(): JsonField<String> = identifier

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
             * Returns a mutable builder for constructing an instance of [TokenRequestorDetails].
             *
             * The following fields are required:
             * ```java
             * .identifier()
             * .name()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [TokenRequestorDetails]. */
        class Builder internal constructor() {

            private var identifier: JsonField<String>? = null
            private var name: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(tokenRequestorDetails: TokenRequestorDetails) = apply {
                identifier = tokenRequestorDetails.identifier
                name = tokenRequestorDetails.name
                additionalProperties = tokenRequestorDetails.additionalProperties.toMutableMap()
            }

            /** The identifier assigned to the token requestor by the card network. */
            fun identifier(identifier: String) = identifier(JsonField.of(identifier))

            /**
             * Sets [Builder.identifier] to an arbitrary JSON value.
             *
             * You should usually call [Builder.identifier] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun identifier(identifier: JsonField<String>) = apply { this.identifier = identifier }

            /** The name of the token requestor, for example "Apple Inc.". */
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
             * Returns an immutable instance of [TokenRequestorDetails].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .identifier()
             * .name()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): TokenRequestorDetails =
                TokenRequestorDetails(
                    checkRequired("identifier", identifier),
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
        fun validate(): TokenRequestorDetails = apply {
            if (validated) {
                return@apply
            }

            identifier()
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
            (if (identifier.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is TokenRequestorDetails &&
                identifier == other.identifier &&
                name == other.name &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(identifier, name, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "TokenRequestorDetails{identifier=$identifier, name=$name, additionalProperties=$additionalProperties}"
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

    /** Fields related to verification of cardholder-provided values. */
    class Verification
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val cardholderAddress: JsonField<CardholderAddress>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("cardholder_address")
            @ExcludeMissing
            cardholderAddress: JsonField<CardholderAddress> = JsonMissing.of()
        ) : this(cardholderAddress, mutableMapOf())

        /**
         * Cardholder address provided in the provisioning request and the address on file we
         * verified it against.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun cardholderAddress(): CardholderAddress =
            cardholderAddress.getRequired("cardholder_address")

        /**
         * Returns the raw JSON value of [cardholderAddress].
         *
         * Unlike [cardholderAddress], this method doesn't throw if the JSON field has an unexpected
         * type.
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
             * .cardholderAddress()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Verification]. */
        class Builder internal constructor() {

            private var cardholderAddress: JsonField<CardholderAddress>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(verification: Verification) = apply {
                cardholderAddress = verification.cardholderAddress
                additionalProperties = verification.additionalProperties.toMutableMap()
            }

            /**
             * Cardholder address provided in the provisioning request and the address on file we
             * verified it against.
             */
            fun cardholderAddress(cardholderAddress: CardholderAddress) =
                cardholderAddress(JsonField.of(cardholderAddress))

            /**
             * Sets [Builder.cardholderAddress] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cardholderAddress] with a well-typed
             * [CardholderAddress] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

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
             * .cardholderAddress()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Verification =
                Verification(
                    checkRequired("cardholderAddress", cardholderAddress),
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
        fun validate(): Verification = apply {
            if (validated) {
                return@apply
            }

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
        internal fun validity(): Int = (cardholderAddress.asKnown().getOrNull()?.validity() ?: 0)

        /**
         * Cardholder address provided in the provisioning request and the address on file we
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
                @JsonProperty("result") @ExcludeMissing result: JsonField<Result> = JsonMissing.of(),
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
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun actualLine1(): Optional<String> = actualLine1.getOptional("actual_line1")

            /**
             * The postal code of the address on file for the cardholder.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun actualPostalCode(): Optional<String> =
                actualPostalCode.getOptional("actual_postal_code")

            /**
             * The cardholder address line 1 provided for verification in the provisioning request.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun providedLine1(): Optional<String> = providedLine1.getOptional("provided_line1")

            /**
             * The postal code provided for verification in the provisioning request.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun providedPostalCode(): Optional<String> =
                providedPostalCode.getOptional("provided_postal_code")

            /**
             * The address verification result.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun result(): Result = result.getRequired("result")

            /**
             * Returns the raw JSON value of [actualLine1].
             *
             * Unlike [actualLine1], this method doesn't throw if the JSON field has an unexpected
             * type.
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
             * Unlike [providedLine1], this method doesn't throw if the JSON field has an unexpected
             * type.
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
                 * Returns a mutable builder for constructing an instance of [CardholderAddress].
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
                 * You should usually call [Builder.actualLine1] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun actualPostalCode(actualPostalCode: JsonField<String>) = apply {
                    this.actualPostalCode = actualPostalCode
                }

                /**
                 * The cardholder address line 1 provided for verification in the provisioning
                 * request.
                 */
                fun providedLine1(providedLine1: String?) =
                    providedLine1(JsonField.ofNullable(providedLine1))

                /** Alias for calling [Builder.providedLine1] with `providedLine1.orElse(null)`. */
                fun providedLine1(providedLine1: Optional<String>) =
                    providedLine1(providedLine1.getOrNull())

                /**
                 * Sets [Builder.providedLine1] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.providedLine1] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun providedLine1(providedLine1: JsonField<String>) = apply {
                    this.providedLine1 = providedLine1
                }

                /** The postal code provided for verification in the provisioning request. */
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
                 * You should usually call [Builder.providedPostalCode] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun providedPostalCode(providedPostalCode: JsonField<String>) = apply {
                    this.providedPostalCode = providedPostalCode
                }

                /** The address verification result. */
                fun result(result: Result) = result(JsonField.of(result))

                /**
                 * Sets [Builder.result] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.result] with a well-typed [Result] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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

            /** The address verification result. */
            class Result @JsonCreator private constructor(private val value: JsonField<String>) :
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
                     * Postal code matches, but the street address was not verified. (deprecated)
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
                     * Postal code matches, but the street address was not verified. (deprecated)
                     */
                    POSTAL_CODE_MATCH_ADDRESS_NOT_CHECKED,
                }

                /**
                 * An enum containing [Result]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Result] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
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
                     * Postal code matches, but the street address was not verified. (deprecated)
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
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
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
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws IncreaseInvalidDataException if this class instance's value is a not a
                 *   known member.
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
                cardholderAddress == other.cardholderAddress &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(cardholderAddress, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Verification{cardholderAddress=$cardholderAddress, additionalProperties=$additionalProperties}"
    }

    /**
     * Risk scores provided by Visa for the provisioning request. This field will be present in the
     * JSON response if and only if `network` is equal to `visa`.
     */
    class Visa
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val networkRiskScore: JsonField<Long>,
        private val provisioningRiskScore: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("network_risk_score")
            @ExcludeMissing
            networkRiskScore: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("provisioning_risk_score")
            @ExcludeMissing
            provisioningRiskScore: JsonField<Long> = JsonMissing.of(),
        ) : this(networkRiskScore, provisioningRiskScore, mutableMapOf())

        /**
         * Visa's risk score for the card, based on its transaction history, from 0 to 99. A higher
         * score indicates a higher risk.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun networkRiskScore(): Optional<Long> = networkRiskScore.getOptional("network_risk_score")

        /**
         * Visa's risk score for the provisioning request, from 1 to 99. A higher score indicates a
         * higher risk.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun provisioningRiskScore(): Optional<Long> =
            provisioningRiskScore.getOptional("provisioning_risk_score")

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
         * Returns the raw JSON value of [provisioningRiskScore].
         *
         * Unlike [provisioningRiskScore], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("provisioning_risk_score")
        @ExcludeMissing
        fun _provisioningRiskScore(): JsonField<Long> = provisioningRiskScore

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
             * .networkRiskScore()
             * .provisioningRiskScore()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Visa]. */
        class Builder internal constructor() {

            private var networkRiskScore: JsonField<Long>? = null
            private var provisioningRiskScore: JsonField<Long>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(visa: Visa) = apply {
                networkRiskScore = visa.networkRiskScore
                provisioningRiskScore = visa.provisioningRiskScore
                additionalProperties = visa.additionalProperties.toMutableMap()
            }

            /**
             * Visa's risk score for the card, based on its transaction history, from 0 to 99. A
             * higher score indicates a higher risk.
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
             * Visa's risk score for the provisioning request, from 1 to 99. A higher score
             * indicates a higher risk.
             */
            fun provisioningRiskScore(provisioningRiskScore: Long?) =
                provisioningRiskScore(JsonField.ofNullable(provisioningRiskScore))

            /**
             * Alias for [Builder.provisioningRiskScore].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun provisioningRiskScore(provisioningRiskScore: Long) =
                provisioningRiskScore(provisioningRiskScore as Long?)

            /**
             * Alias for calling [Builder.provisioningRiskScore] with
             * `provisioningRiskScore.orElse(null)`.
             */
            fun provisioningRiskScore(provisioningRiskScore: Optional<Long>) =
                provisioningRiskScore(provisioningRiskScore.getOrNull())

            /**
             * Sets [Builder.provisioningRiskScore] to an arbitrary JSON value.
             *
             * You should usually call [Builder.provisioningRiskScore] with a well-typed [Long]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun provisioningRiskScore(provisioningRiskScore: JsonField<Long>) = apply {
                this.provisioningRiskScore = provisioningRiskScore
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
             * Returns an immutable instance of [Visa].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .networkRiskScore()
             * .provisioningRiskScore()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Visa =
                Visa(
                    checkRequired("networkRiskScore", networkRiskScore),
                    checkRequired("provisioningRiskScore", provisioningRiskScore),
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
        fun validate(): Visa = apply {
            if (validated) {
                return@apply
            }

            networkRiskScore()
            provisioningRiskScore()
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
            (if (networkRiskScore.asKnown().isPresent) 1 else 0) +
                (if (provisioningRiskScore.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Visa &&
                networkRiskScore == other.networkRiskScore &&
                provisioningRiskScore == other.provisioningRiskScore &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(networkRiskScore, provisioningRiskScore, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Visa{networkRiskScore=$networkRiskScore, provisioningRiskScore=$provisioningRiskScore, additionalProperties=$additionalProperties}"
    }

    /** Details about the digital wallet. */
    class Wallet
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val accountEmailAgeDays: JsonField<Long>,
        private val accountIdentifier: JsonField<String>,
        private val accountScore: JsonField<Long>,
        private val deviceScore: JsonField<Long>,
        private val emailHash: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("account_email_age_days")
            @ExcludeMissing
            accountEmailAgeDays: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("account_identifier")
            @ExcludeMissing
            accountIdentifier: JsonField<String> = JsonMissing.of(),
            @JsonProperty("account_score")
            @ExcludeMissing
            accountScore: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("device_score")
            @ExcludeMissing
            deviceScore: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("email_hash")
            @ExcludeMissing
            emailHash: JsonField<String> = JsonMissing.of(),
        ) : this(
            accountEmailAgeDays,
            accountIdentifier,
            accountScore,
            deviceScore,
            emailHash,
            mutableMapOf(),
        )

        /**
         * The number of days since the email address was added to the cardholder's digital wallet
         * account, up to 999.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun accountEmailAgeDays(): Optional<Long> =
            accountEmailAgeDays.getOptional("account_email_age_days")

        /**
         * An identifier for the cardholder's account with the digital wallet.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun accountIdentifier(): Optional<String> =
            accountIdentifier.getOptional("account_identifier")

        /**
         * How much the digital wallet trusts the cardholder's account, from 1 to 5. A higher score
         * indicates more trust.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun accountScore(): Optional<Long> = accountScore.getOptional("account_score")

        /**
         * How much the digital wallet trusts the device the card is being added to, from 1 to 5. A
         * higher score indicates more trust.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun deviceScore(): Optional<Long> = deviceScore.getOptional("device_score")

        /**
         * A hash of the email address on the cardholder's digital wallet account.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun emailHash(): Optional<String> = emailHash.getOptional("email_hash")

        /**
         * Returns the raw JSON value of [accountEmailAgeDays].
         *
         * Unlike [accountEmailAgeDays], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("account_email_age_days")
        @ExcludeMissing
        fun _accountEmailAgeDays(): JsonField<Long> = accountEmailAgeDays

        /**
         * Returns the raw JSON value of [accountIdentifier].
         *
         * Unlike [accountIdentifier], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("account_identifier")
        @ExcludeMissing
        fun _accountIdentifier(): JsonField<String> = accountIdentifier

        /**
         * Returns the raw JSON value of [accountScore].
         *
         * Unlike [accountScore], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("account_score")
        @ExcludeMissing
        fun _accountScore(): JsonField<Long> = accountScore

        /**
         * Returns the raw JSON value of [deviceScore].
         *
         * Unlike [deviceScore], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("device_score")
        @ExcludeMissing
        fun _deviceScore(): JsonField<Long> = deviceScore

        /**
         * Returns the raw JSON value of [emailHash].
         *
         * Unlike [emailHash], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("email_hash") @ExcludeMissing fun _emailHash(): JsonField<String> = emailHash

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
             * Returns a mutable builder for constructing an instance of [Wallet].
             *
             * The following fields are required:
             * ```java
             * .accountEmailAgeDays()
             * .accountIdentifier()
             * .accountScore()
             * .deviceScore()
             * .emailHash()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Wallet]. */
        class Builder internal constructor() {

            private var accountEmailAgeDays: JsonField<Long>? = null
            private var accountIdentifier: JsonField<String>? = null
            private var accountScore: JsonField<Long>? = null
            private var deviceScore: JsonField<Long>? = null
            private var emailHash: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(wallet: Wallet) = apply {
                accountEmailAgeDays = wallet.accountEmailAgeDays
                accountIdentifier = wallet.accountIdentifier
                accountScore = wallet.accountScore
                deviceScore = wallet.deviceScore
                emailHash = wallet.emailHash
                additionalProperties = wallet.additionalProperties.toMutableMap()
            }

            /**
             * The number of days since the email address was added to the cardholder's digital
             * wallet account, up to 999.
             */
            fun accountEmailAgeDays(accountEmailAgeDays: Long?) =
                accountEmailAgeDays(JsonField.ofNullable(accountEmailAgeDays))

            /**
             * Alias for [Builder.accountEmailAgeDays].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun accountEmailAgeDays(accountEmailAgeDays: Long) =
                accountEmailAgeDays(accountEmailAgeDays as Long?)

            /**
             * Alias for calling [Builder.accountEmailAgeDays] with
             * `accountEmailAgeDays.orElse(null)`.
             */
            fun accountEmailAgeDays(accountEmailAgeDays: Optional<Long>) =
                accountEmailAgeDays(accountEmailAgeDays.getOrNull())

            /**
             * Sets [Builder.accountEmailAgeDays] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountEmailAgeDays] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accountEmailAgeDays(accountEmailAgeDays: JsonField<Long>) = apply {
                this.accountEmailAgeDays = accountEmailAgeDays
            }

            /** An identifier for the cardholder's account with the digital wallet. */
            fun accountIdentifier(accountIdentifier: String?) =
                accountIdentifier(JsonField.ofNullable(accountIdentifier))

            /**
             * Alias for calling [Builder.accountIdentifier] with `accountIdentifier.orElse(null)`.
             */
            fun accountIdentifier(accountIdentifier: Optional<String>) =
                accountIdentifier(accountIdentifier.getOrNull())

            /**
             * Sets [Builder.accountIdentifier] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountIdentifier] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accountIdentifier(accountIdentifier: JsonField<String>) = apply {
                this.accountIdentifier = accountIdentifier
            }

            /**
             * How much the digital wallet trusts the cardholder's account, from 1 to 5. A higher
             * score indicates more trust.
             */
            fun accountScore(accountScore: Long?) = accountScore(JsonField.ofNullable(accountScore))

            /**
             * Alias for [Builder.accountScore].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun accountScore(accountScore: Long) = accountScore(accountScore as Long?)

            /** Alias for calling [Builder.accountScore] with `accountScore.orElse(null)`. */
            fun accountScore(accountScore: Optional<Long>) = accountScore(accountScore.getOrNull())

            /**
             * Sets [Builder.accountScore] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountScore] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accountScore(accountScore: JsonField<Long>) = apply {
                this.accountScore = accountScore
            }

            /**
             * How much the digital wallet trusts the device the card is being added to, from 1
             * to 5. A higher score indicates more trust.
             */
            fun deviceScore(deviceScore: Long?) = deviceScore(JsonField.ofNullable(deviceScore))

            /**
             * Alias for [Builder.deviceScore].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun deviceScore(deviceScore: Long) = deviceScore(deviceScore as Long?)

            /** Alias for calling [Builder.deviceScore] with `deviceScore.orElse(null)`. */
            fun deviceScore(deviceScore: Optional<Long>) = deviceScore(deviceScore.getOrNull())

            /**
             * Sets [Builder.deviceScore] to an arbitrary JSON value.
             *
             * You should usually call [Builder.deviceScore] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun deviceScore(deviceScore: JsonField<Long>) = apply { this.deviceScore = deviceScore }

            /** A hash of the email address on the cardholder's digital wallet account. */
            fun emailHash(emailHash: String?) = emailHash(JsonField.ofNullable(emailHash))

            /** Alias for calling [Builder.emailHash] with `emailHash.orElse(null)`. */
            fun emailHash(emailHash: Optional<String>) = emailHash(emailHash.getOrNull())

            /**
             * Sets [Builder.emailHash] to an arbitrary JSON value.
             *
             * You should usually call [Builder.emailHash] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun emailHash(emailHash: JsonField<String>) = apply { this.emailHash = emailHash }

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
             * Returns an immutable instance of [Wallet].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .accountEmailAgeDays()
             * .accountIdentifier()
             * .accountScore()
             * .deviceScore()
             * .emailHash()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Wallet =
                Wallet(
                    checkRequired("accountEmailAgeDays", accountEmailAgeDays),
                    checkRequired("accountIdentifier", accountIdentifier),
                    checkRequired("accountScore", accountScore),
                    checkRequired("deviceScore", deviceScore),
                    checkRequired("emailHash", emailHash),
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
        fun validate(): Wallet = apply {
            if (validated) {
                return@apply
            }

            accountEmailAgeDays()
            accountIdentifier()
            accountScore()
            deviceScore()
            emailHash()
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
            (if (accountEmailAgeDays.asKnown().isPresent) 1 else 0) +
                (if (accountIdentifier.asKnown().isPresent) 1 else 0) +
                (if (accountScore.asKnown().isPresent) 1 else 0) +
                (if (deviceScore.asKnown().isPresent) 1 else 0) +
                (if (emailHash.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Wallet &&
                accountEmailAgeDays == other.accountEmailAgeDays &&
                accountIdentifier == other.accountIdentifier &&
                accountScore == other.accountScore &&
                deviceScore == other.deviceScore &&
                emailHash == other.emailHash &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                accountEmailAgeDays,
                accountIdentifier,
                accountScore,
                deviceScore,
                emailHash,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Wallet{accountEmailAgeDays=$accountEmailAgeDays, accountIdentifier=$accountIdentifier, accountScore=$accountScore, deviceScore=$deviceScore, emailHash=$emailHash, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DigitalWalletTokenRequest &&
            id == other.id &&
            cardId == other.cardId &&
            cardholder == other.cardholder &&
            createdAt == other.createdAt &&
            declined == other.declined &&
            device == other.device &&
            network == other.network &&
            outcome == other.outcome &&
            primaryAccountNumberSource == other.primaryAccountNumberSource &&
            provisioned == other.provisioned &&
            tokenReferenceIdentifier == other.tokenReferenceIdentifier &&
            tokenRequestor == other.tokenRequestor &&
            tokenRequestorDetails == other.tokenRequestorDetails &&
            type == other.type &&
            verification == other.verification &&
            visa == other.visa &&
            wallet == other.wallet &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            cardId,
            cardholder,
            createdAt,
            declined,
            device,
            network,
            outcome,
            primaryAccountNumberSource,
            provisioned,
            tokenReferenceIdentifier,
            tokenRequestor,
            tokenRequestorDetails,
            type,
            verification,
            visa,
            wallet,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DigitalWalletTokenRequest{id=$id, cardId=$cardId, cardholder=$cardholder, createdAt=$createdAt, declined=$declined, device=$device, network=$network, outcome=$outcome, primaryAccountNumberSource=$primaryAccountNumberSource, provisioned=$provisioned, tokenReferenceIdentifier=$tokenReferenceIdentifier, tokenRequestor=$tokenRequestor, tokenRequestorDetails=$tokenRequestorDetails, type=$type, verification=$verification, visa=$visa, wallet=$wallet, additionalProperties=$additionalProperties}"
}
