// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.cardvalidations

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
 * Card Validations are used to validate a card and its cardholder before sending funds to or
 * pulling funds from a card.
 */
class CardValidation
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val acceptance: JsonField<Acceptance>,
    private val accountId: JsonField<String>,
    private val cardTokenId: JsonField<String>,
    private val cardholderFirstName: JsonField<String>,
    private val cardholderLastName: JsonField<String>,
    private val cardholderMiddleName: JsonField<String>,
    private val cardholderPostalCode: JsonField<String>,
    private val cardholderStreetAddress: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<CreatedBy>,
    private val decline: JsonField<Decline>,
    private val idempotencyKey: JsonField<String>,
    private val merchantCategoryCode: JsonField<String>,
    private val merchantCityName: JsonField<String>,
    private val merchantName: JsonField<String>,
    private val merchantPostalCode: JsonField<String>,
    private val merchantState: JsonField<String>,
    private val status: JsonField<Status>,
    private val submission: JsonField<Submission>,
    private val type: JsonField<Type>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("acceptance")
        @ExcludeMissing
        acceptance: JsonField<Acceptance> = JsonMissing.of(),
        @JsonProperty("account_id") @ExcludeMissing accountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("card_token_id")
        @ExcludeMissing
        cardTokenId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("cardholder_first_name")
        @ExcludeMissing
        cardholderFirstName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("cardholder_last_name")
        @ExcludeMissing
        cardholderLastName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("cardholder_middle_name")
        @ExcludeMissing
        cardholderMiddleName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("cardholder_postal_code")
        @ExcludeMissing
        cardholderPostalCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("cardholder_street_address")
        @ExcludeMissing
        cardholderStreetAddress: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("created_by")
        @ExcludeMissing
        createdBy: JsonField<CreatedBy> = JsonMissing.of(),
        @JsonProperty("decline") @ExcludeMissing decline: JsonField<Decline> = JsonMissing.of(),
        @JsonProperty("idempotency_key")
        @ExcludeMissing
        idempotencyKey: JsonField<String> = JsonMissing.of(),
        @JsonProperty("merchant_category_code")
        @ExcludeMissing
        merchantCategoryCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("merchant_city_name")
        @ExcludeMissing
        merchantCityName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("merchant_name")
        @ExcludeMissing
        merchantName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("merchant_postal_code")
        @ExcludeMissing
        merchantPostalCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("merchant_state")
        @ExcludeMissing
        merchantState: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("submission")
        @ExcludeMissing
        submission: JsonField<Submission> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
    ) : this(
        id,
        acceptance,
        accountId,
        cardTokenId,
        cardholderFirstName,
        cardholderLastName,
        cardholderMiddleName,
        cardholderPostalCode,
        cardholderStreetAddress,
        createdAt,
        createdBy,
        decline,
        idempotencyKey,
        merchantCategoryCode,
        merchantCityName,
        merchantName,
        merchantPostalCode,
        merchantState,
        status,
        submission,
        type,
        mutableMapOf(),
    )

    /**
     * The Card Validation's identifier.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * If the validation is accepted by the recipient bank, this will contain supplemental details.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun acceptance(): Optional<Acceptance> = acceptance.getOptional("acceptance")

    /**
     * The identifier of the Account from which to send the validation.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountId(): String = accountId.getRequired("account_id")

    /**
     * The ID of the Card Token that was used to validate the card.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun cardTokenId(): String = cardTokenId.getRequired("card_token_id")

    /**
     * The cardholder's first name.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cardholderFirstName(): Optional<String> =
        cardholderFirstName.getOptional("cardholder_first_name")

    /**
     * The cardholder's last name.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cardholderLastName(): Optional<String> =
        cardholderLastName.getOptional("cardholder_last_name")

    /**
     * The cardholder's middle name.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cardholderMiddleName(): Optional<String> =
        cardholderMiddleName.getOptional("cardholder_middle_name")

    /**
     * The postal code of the cardholder's address.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cardholderPostalCode(): Optional<String> =
        cardholderPostalCode.getOptional("cardholder_postal_code")

    /**
     * The cardholder's street address.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cardholderStreetAddress(): Optional<String> =
        cardholderStreetAddress.getOptional("cardholder_street_address")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the validation
     * was created.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * What object created the validation, either via the API or the dashboard.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdBy(): Optional<CreatedBy> = createdBy.getOptional("created_by")

    /**
     * If the validation is rejected by the card network or the destination financial institution,
     * this will contain supplemental details.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun decline(): Optional<Decline> = decline.getOptional("decline")

    /**
     * The idempotency key you chose for this object. This value is unique across Increase and is
     * used to ensure that a request is only processed once. Learn more about
     * [idempotency](https://increase.com/documentation/idempotency-keys).
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun idempotencyKey(): Optional<String> = idempotencyKey.getOptional("idempotency_key")

    /**
     * A four-digit code (MCC) identifying the type of business or service provided by the merchant.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun merchantCategoryCode(): String = merchantCategoryCode.getRequired("merchant_category_code")

    /**
     * The city where the merchant (typically your business) is located.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun merchantCityName(): String = merchantCityName.getRequired("merchant_city_name")

    /**
     * The merchant name that will appear in the cardholder’s statement descriptor. Typically your
     * business name.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun merchantName(): String = merchantName.getRequired("merchant_name")

    /**
     * The postal code for the merchant’s (typically your business’s) location.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun merchantPostalCode(): String = merchantPostalCode.getRequired("merchant_postal_code")

    /**
     * The U.S. state where the merchant (typically your business) is located.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun merchantState(): String = merchantState.getRequired("merchant_state")

    /**
     * The lifecycle status of the validation.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * After the validation is submitted to the card network, this will contain supplemental
     * details.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun submission(): Optional<Submission> = submission.getOptional("submission")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `card_validation`.
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
     * Returns the raw JSON value of [acceptance].
     *
     * Unlike [acceptance], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("acceptance")
    @ExcludeMissing
    fun _acceptance(): JsonField<Acceptance> = acceptance

    /**
     * Returns the raw JSON value of [accountId].
     *
     * Unlike [accountId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("account_id") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

    /**
     * Returns the raw JSON value of [cardTokenId].
     *
     * Unlike [cardTokenId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("card_token_id")
    @ExcludeMissing
    fun _cardTokenId(): JsonField<String> = cardTokenId

    /**
     * Returns the raw JSON value of [cardholderFirstName].
     *
     * Unlike [cardholderFirstName], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("cardholder_first_name")
    @ExcludeMissing
    fun _cardholderFirstName(): JsonField<String> = cardholderFirstName

    /**
     * Returns the raw JSON value of [cardholderLastName].
     *
     * Unlike [cardholderLastName], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("cardholder_last_name")
    @ExcludeMissing
    fun _cardholderLastName(): JsonField<String> = cardholderLastName

    /**
     * Returns the raw JSON value of [cardholderMiddleName].
     *
     * Unlike [cardholderMiddleName], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("cardholder_middle_name")
    @ExcludeMissing
    fun _cardholderMiddleName(): JsonField<String> = cardholderMiddleName

    /**
     * Returns the raw JSON value of [cardholderPostalCode].
     *
     * Unlike [cardholderPostalCode], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("cardholder_postal_code")
    @ExcludeMissing
    fun _cardholderPostalCode(): JsonField<String> = cardholderPostalCode

    /**
     * Returns the raw JSON value of [cardholderStreetAddress].
     *
     * Unlike [cardholderStreetAddress], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("cardholder_street_address")
    @ExcludeMissing
    fun _cardholderStreetAddress(): JsonField<String> = cardholderStreetAddress

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [createdBy].
     *
     * Unlike [createdBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_by") @ExcludeMissing fun _createdBy(): JsonField<CreatedBy> = createdBy

    /**
     * Returns the raw JSON value of [decline].
     *
     * Unlike [decline], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("decline") @ExcludeMissing fun _decline(): JsonField<Decline> = decline

    /**
     * Returns the raw JSON value of [idempotencyKey].
     *
     * Unlike [idempotencyKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idempotency_key")
    @ExcludeMissing
    fun _idempotencyKey(): JsonField<String> = idempotencyKey

    /**
     * Returns the raw JSON value of [merchantCategoryCode].
     *
     * Unlike [merchantCategoryCode], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("merchant_category_code")
    @ExcludeMissing
    fun _merchantCategoryCode(): JsonField<String> = merchantCategoryCode

    /**
     * Returns the raw JSON value of [merchantCityName].
     *
     * Unlike [merchantCityName], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("merchant_city_name")
    @ExcludeMissing
    fun _merchantCityName(): JsonField<String> = merchantCityName

    /**
     * Returns the raw JSON value of [merchantName].
     *
     * Unlike [merchantName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("merchant_name")
    @ExcludeMissing
    fun _merchantName(): JsonField<String> = merchantName

    /**
     * Returns the raw JSON value of [merchantPostalCode].
     *
     * Unlike [merchantPostalCode], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("merchant_postal_code")
    @ExcludeMissing
    fun _merchantPostalCode(): JsonField<String> = merchantPostalCode

    /**
     * Returns the raw JSON value of [merchantState].
     *
     * Unlike [merchantState], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("merchant_state")
    @ExcludeMissing
    fun _merchantState(): JsonField<String> = merchantState

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [submission].
     *
     * Unlike [submission], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("submission")
    @ExcludeMissing
    fun _submission(): JsonField<Submission> = submission

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
         * Returns a mutable builder for constructing an instance of [CardValidation].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .acceptance()
         * .accountId()
         * .cardTokenId()
         * .cardholderFirstName()
         * .cardholderLastName()
         * .cardholderMiddleName()
         * .cardholderPostalCode()
         * .cardholderStreetAddress()
         * .createdAt()
         * .createdBy()
         * .decline()
         * .idempotencyKey()
         * .merchantCategoryCode()
         * .merchantCityName()
         * .merchantName()
         * .merchantPostalCode()
         * .merchantState()
         * .status()
         * .submission()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CardValidation]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var acceptance: JsonField<Acceptance>? = null
        private var accountId: JsonField<String>? = null
        private var cardTokenId: JsonField<String>? = null
        private var cardholderFirstName: JsonField<String>? = null
        private var cardholderLastName: JsonField<String>? = null
        private var cardholderMiddleName: JsonField<String>? = null
        private var cardholderPostalCode: JsonField<String>? = null
        private var cardholderStreetAddress: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var createdBy: JsonField<CreatedBy>? = null
        private var decline: JsonField<Decline>? = null
        private var idempotencyKey: JsonField<String>? = null
        private var merchantCategoryCode: JsonField<String>? = null
        private var merchantCityName: JsonField<String>? = null
        private var merchantName: JsonField<String>? = null
        private var merchantPostalCode: JsonField<String>? = null
        private var merchantState: JsonField<String>? = null
        private var status: JsonField<Status>? = null
        private var submission: JsonField<Submission>? = null
        private var type: JsonField<Type>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(cardValidation: CardValidation) = apply {
            id = cardValidation.id
            acceptance = cardValidation.acceptance
            accountId = cardValidation.accountId
            cardTokenId = cardValidation.cardTokenId
            cardholderFirstName = cardValidation.cardholderFirstName
            cardholderLastName = cardValidation.cardholderLastName
            cardholderMiddleName = cardValidation.cardholderMiddleName
            cardholderPostalCode = cardValidation.cardholderPostalCode
            cardholderStreetAddress = cardValidation.cardholderStreetAddress
            createdAt = cardValidation.createdAt
            createdBy = cardValidation.createdBy
            decline = cardValidation.decline
            idempotencyKey = cardValidation.idempotencyKey
            merchantCategoryCode = cardValidation.merchantCategoryCode
            merchantCityName = cardValidation.merchantCityName
            merchantName = cardValidation.merchantName
            merchantPostalCode = cardValidation.merchantPostalCode
            merchantState = cardValidation.merchantState
            status = cardValidation.status
            submission = cardValidation.submission
            type = cardValidation.type
            additionalProperties = cardValidation.additionalProperties.toMutableMap()
        }

        /** The Card Validation's identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * If the validation is accepted by the recipient bank, this will contain supplemental
         * details.
         */
        fun acceptance(acceptance: Acceptance?) = acceptance(JsonField.ofNullable(acceptance))

        /** Alias for calling [Builder.acceptance] with `acceptance.orElse(null)`. */
        fun acceptance(acceptance: Optional<Acceptance>) = acceptance(acceptance.getOrNull())

        /**
         * Sets [Builder.acceptance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.acceptance] with a well-typed [Acceptance] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun acceptance(acceptance: JsonField<Acceptance>) = apply { this.acceptance = acceptance }

        /** The identifier of the Account from which to send the validation. */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /**
         * Sets [Builder.accountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        /** The ID of the Card Token that was used to validate the card. */
        fun cardTokenId(cardTokenId: String) = cardTokenId(JsonField.of(cardTokenId))

        /**
         * Sets [Builder.cardTokenId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cardTokenId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun cardTokenId(cardTokenId: JsonField<String>) = apply { this.cardTokenId = cardTokenId }

        /** The cardholder's first name. */
        fun cardholderFirstName(cardholderFirstName: String?) =
            cardholderFirstName(JsonField.ofNullable(cardholderFirstName))

        /**
         * Alias for calling [Builder.cardholderFirstName] with `cardholderFirstName.orElse(null)`.
         */
        fun cardholderFirstName(cardholderFirstName: Optional<String>) =
            cardholderFirstName(cardholderFirstName.getOrNull())

        /**
         * Sets [Builder.cardholderFirstName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cardholderFirstName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun cardholderFirstName(cardholderFirstName: JsonField<String>) = apply {
            this.cardholderFirstName = cardholderFirstName
        }

        /** The cardholder's last name. */
        fun cardholderLastName(cardholderLastName: String?) =
            cardholderLastName(JsonField.ofNullable(cardholderLastName))

        /**
         * Alias for calling [Builder.cardholderLastName] with `cardholderLastName.orElse(null)`.
         */
        fun cardholderLastName(cardholderLastName: Optional<String>) =
            cardholderLastName(cardholderLastName.getOrNull())

        /**
         * Sets [Builder.cardholderLastName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cardholderLastName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun cardholderLastName(cardholderLastName: JsonField<String>) = apply {
            this.cardholderLastName = cardholderLastName
        }

        /** The cardholder's middle name. */
        fun cardholderMiddleName(cardholderMiddleName: String?) =
            cardholderMiddleName(JsonField.ofNullable(cardholderMiddleName))

        /**
         * Alias for calling [Builder.cardholderMiddleName] with
         * `cardholderMiddleName.orElse(null)`.
         */
        fun cardholderMiddleName(cardholderMiddleName: Optional<String>) =
            cardholderMiddleName(cardholderMiddleName.getOrNull())

        /**
         * Sets [Builder.cardholderMiddleName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cardholderMiddleName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun cardholderMiddleName(cardholderMiddleName: JsonField<String>) = apply {
            this.cardholderMiddleName = cardholderMiddleName
        }

        /** The postal code of the cardholder's address. */
        fun cardholderPostalCode(cardholderPostalCode: String?) =
            cardholderPostalCode(JsonField.ofNullable(cardholderPostalCode))

        /**
         * Alias for calling [Builder.cardholderPostalCode] with
         * `cardholderPostalCode.orElse(null)`.
         */
        fun cardholderPostalCode(cardholderPostalCode: Optional<String>) =
            cardholderPostalCode(cardholderPostalCode.getOrNull())

        /**
         * Sets [Builder.cardholderPostalCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cardholderPostalCode] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun cardholderPostalCode(cardholderPostalCode: JsonField<String>) = apply {
            this.cardholderPostalCode = cardholderPostalCode
        }

        /** The cardholder's street address. */
        fun cardholderStreetAddress(cardholderStreetAddress: String?) =
            cardholderStreetAddress(JsonField.ofNullable(cardholderStreetAddress))

        /**
         * Alias for calling [Builder.cardholderStreetAddress] with
         * `cardholderStreetAddress.orElse(null)`.
         */
        fun cardholderStreetAddress(cardholderStreetAddress: Optional<String>) =
            cardholderStreetAddress(cardholderStreetAddress.getOrNull())

        /**
         * Sets [Builder.cardholderStreetAddress] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cardholderStreetAddress] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun cardholderStreetAddress(cardholderStreetAddress: JsonField<String>) = apply {
            this.cardholderStreetAddress = cardholderStreetAddress
        }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
         * validation was created.
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

        /** What object created the validation, either via the API or the dashboard. */
        fun createdBy(createdBy: CreatedBy?) = createdBy(JsonField.ofNullable(createdBy))

        /** Alias for calling [Builder.createdBy] with `createdBy.orElse(null)`. */
        fun createdBy(createdBy: Optional<CreatedBy>) = createdBy(createdBy.getOrNull())

        /**
         * Sets [Builder.createdBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdBy] with a well-typed [CreatedBy] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdBy(createdBy: JsonField<CreatedBy>) = apply { this.createdBy = createdBy }

        /**
         * If the validation is rejected by the card network or the destination financial
         * institution, this will contain supplemental details.
         */
        fun decline(decline: Decline?) = decline(JsonField.ofNullable(decline))

        /** Alias for calling [Builder.decline] with `decline.orElse(null)`. */
        fun decline(decline: Optional<Decline>) = decline(decline.getOrNull())

        /**
         * Sets [Builder.decline] to an arbitrary JSON value.
         *
         * You should usually call [Builder.decline] with a well-typed [Decline] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun decline(decline: JsonField<Decline>) = apply { this.decline = decline }

        /**
         * The idempotency key you chose for this object. This value is unique across Increase and
         * is used to ensure that a request is only processed once. Learn more about
         * [idempotency](https://increase.com/documentation/idempotency-keys).
         */
        fun idempotencyKey(idempotencyKey: String?) =
            idempotencyKey(JsonField.ofNullable(idempotencyKey))

        /** Alias for calling [Builder.idempotencyKey] with `idempotencyKey.orElse(null)`. */
        fun idempotencyKey(idempotencyKey: Optional<String>) =
            idempotencyKey(idempotencyKey.getOrNull())

        /**
         * Sets [Builder.idempotencyKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idempotencyKey] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun idempotencyKey(idempotencyKey: JsonField<String>) = apply {
            this.idempotencyKey = idempotencyKey
        }

        /**
         * A four-digit code (MCC) identifying the type of business or service provided by the
         * merchant.
         */
        fun merchantCategoryCode(merchantCategoryCode: String) =
            merchantCategoryCode(JsonField.of(merchantCategoryCode))

        /**
         * Sets [Builder.merchantCategoryCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.merchantCategoryCode] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun merchantCategoryCode(merchantCategoryCode: JsonField<String>) = apply {
            this.merchantCategoryCode = merchantCategoryCode
        }

        /** The city where the merchant (typically your business) is located. */
        fun merchantCityName(merchantCityName: String) =
            merchantCityName(JsonField.of(merchantCityName))

        /**
         * Sets [Builder.merchantCityName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.merchantCityName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun merchantCityName(merchantCityName: JsonField<String>) = apply {
            this.merchantCityName = merchantCityName
        }

        /**
         * The merchant name that will appear in the cardholder’s statement descriptor. Typically
         * your business name.
         */
        fun merchantName(merchantName: String) = merchantName(JsonField.of(merchantName))

        /**
         * Sets [Builder.merchantName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.merchantName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun merchantName(merchantName: JsonField<String>) = apply {
            this.merchantName = merchantName
        }

        /** The postal code for the merchant’s (typically your business’s) location. */
        fun merchantPostalCode(merchantPostalCode: String) =
            merchantPostalCode(JsonField.of(merchantPostalCode))

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

        /** The U.S. state where the merchant (typically your business) is located. */
        fun merchantState(merchantState: String) = merchantState(JsonField.of(merchantState))

        /**
         * Sets [Builder.merchantState] to an arbitrary JSON value.
         *
         * You should usually call [Builder.merchantState] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun merchantState(merchantState: JsonField<String>) = apply {
            this.merchantState = merchantState
        }

        /** The lifecycle status of the validation. */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /**
         * After the validation is submitted to the card network, this will contain supplemental
         * details.
         */
        fun submission(submission: Submission?) = submission(JsonField.ofNullable(submission))

        /** Alias for calling [Builder.submission] with `submission.orElse(null)`. */
        fun submission(submission: Optional<Submission>) = submission(submission.getOrNull())

        /**
         * Sets [Builder.submission] to an arbitrary JSON value.
         *
         * You should usually call [Builder.submission] with a well-typed [Submission] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun submission(submission: JsonField<Submission>) = apply { this.submission = submission }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `card_validation`.
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
         * Returns an immutable instance of [CardValidation].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .acceptance()
         * .accountId()
         * .cardTokenId()
         * .cardholderFirstName()
         * .cardholderLastName()
         * .cardholderMiddleName()
         * .cardholderPostalCode()
         * .cardholderStreetAddress()
         * .createdAt()
         * .createdBy()
         * .decline()
         * .idempotencyKey()
         * .merchantCategoryCode()
         * .merchantCityName()
         * .merchantName()
         * .merchantPostalCode()
         * .merchantState()
         * .status()
         * .submission()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CardValidation =
            CardValidation(
                checkRequired("id", id),
                checkRequired("acceptance", acceptance),
                checkRequired("accountId", accountId),
                checkRequired("cardTokenId", cardTokenId),
                checkRequired("cardholderFirstName", cardholderFirstName),
                checkRequired("cardholderLastName", cardholderLastName),
                checkRequired("cardholderMiddleName", cardholderMiddleName),
                checkRequired("cardholderPostalCode", cardholderPostalCode),
                checkRequired("cardholderStreetAddress", cardholderStreetAddress),
                checkRequired("createdAt", createdAt),
                checkRequired("createdBy", createdBy),
                checkRequired("decline", decline),
                checkRequired("idempotencyKey", idempotencyKey),
                checkRequired("merchantCategoryCode", merchantCategoryCode),
                checkRequired("merchantCityName", merchantCityName),
                checkRequired("merchantName", merchantName),
                checkRequired("merchantPostalCode", merchantPostalCode),
                checkRequired("merchantState", merchantState),
                checkRequired("status", status),
                checkRequired("submission", submission),
                checkRequired("type", type),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CardValidation = apply {
        if (validated) {
            return@apply
        }

        id()
        acceptance().ifPresent { it.validate() }
        accountId()
        cardTokenId()
        cardholderFirstName()
        cardholderLastName()
        cardholderMiddleName()
        cardholderPostalCode()
        cardholderStreetAddress()
        createdAt()
        createdBy().ifPresent { it.validate() }
        decline().ifPresent { it.validate() }
        idempotencyKey()
        merchantCategoryCode()
        merchantCityName()
        merchantName()
        merchantPostalCode()
        merchantState()
        status().validate()
        submission().ifPresent { it.validate() }
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
            (acceptance.asKnown().getOrNull()?.validity() ?: 0) +
            (if (accountId.asKnown().isPresent) 1 else 0) +
            (if (cardTokenId.asKnown().isPresent) 1 else 0) +
            (if (cardholderFirstName.asKnown().isPresent) 1 else 0) +
            (if (cardholderLastName.asKnown().isPresent) 1 else 0) +
            (if (cardholderMiddleName.asKnown().isPresent) 1 else 0) +
            (if (cardholderPostalCode.asKnown().isPresent) 1 else 0) +
            (if (cardholderStreetAddress.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (createdBy.asKnown().getOrNull()?.validity() ?: 0) +
            (decline.asKnown().getOrNull()?.validity() ?: 0) +
            (if (idempotencyKey.asKnown().isPresent) 1 else 0) +
            (if (merchantCategoryCode.asKnown().isPresent) 1 else 0) +
            (if (merchantCityName.asKnown().isPresent) 1 else 0) +
            (if (merchantName.asKnown().isPresent) 1 else 0) +
            (if (merchantPostalCode.asKnown().isPresent) 1 else 0) +
            (if (merchantState.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (submission.asKnown().getOrNull()?.validity() ?: 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0)

    /**
     * If the validation is accepted by the recipient bank, this will contain supplemental details.
     */
    class Acceptance
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val acceptedAt: JsonField<OffsetDateTime>,
        private val authorizationIdentificationResponse: JsonField<String>,
        private val cardVerificationValue2Result: JsonField<CardVerificationValue2Result>,
        private val cardholderFirstNameResult: JsonField<CardholderFirstNameResult>,
        private val cardholderFullNameResult: JsonField<CardholderFullNameResult>,
        private val cardholderLastNameResult: JsonField<CardholderLastNameResult>,
        private val cardholderMiddleNameResult: JsonField<CardholderMiddleNameResult>,
        private val cardholderPostalCodeResult: JsonField<CardholderPostalCodeResult>,
        private val cardholderStreetAddressResult: JsonField<CardholderStreetAddressResult>,
        private val networkTransactionIdentifier: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("accepted_at")
            @ExcludeMissing
            acceptedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("authorization_identification_response")
            @ExcludeMissing
            authorizationIdentificationResponse: JsonField<String> = JsonMissing.of(),
            @JsonProperty("card_verification_value2_result")
            @ExcludeMissing
            cardVerificationValue2Result: JsonField<CardVerificationValue2Result> =
                JsonMissing.of(),
            @JsonProperty("cardholder_first_name_result")
            @ExcludeMissing
            cardholderFirstNameResult: JsonField<CardholderFirstNameResult> = JsonMissing.of(),
            @JsonProperty("cardholder_full_name_result")
            @ExcludeMissing
            cardholderFullNameResult: JsonField<CardholderFullNameResult> = JsonMissing.of(),
            @JsonProperty("cardholder_last_name_result")
            @ExcludeMissing
            cardholderLastNameResult: JsonField<CardholderLastNameResult> = JsonMissing.of(),
            @JsonProperty("cardholder_middle_name_result")
            @ExcludeMissing
            cardholderMiddleNameResult: JsonField<CardholderMiddleNameResult> = JsonMissing.of(),
            @JsonProperty("cardholder_postal_code_result")
            @ExcludeMissing
            cardholderPostalCodeResult: JsonField<CardholderPostalCodeResult> = JsonMissing.of(),
            @JsonProperty("cardholder_street_address_result")
            @ExcludeMissing
            cardholderStreetAddressResult: JsonField<CardholderStreetAddressResult> =
                JsonMissing.of(),
            @JsonProperty("network_transaction_identifier")
            @ExcludeMissing
            networkTransactionIdentifier: JsonField<String> = JsonMissing.of(),
        ) : this(
            acceptedAt,
            authorizationIdentificationResponse,
            cardVerificationValue2Result,
            cardholderFirstNameResult,
            cardholderFullNameResult,
            cardholderLastNameResult,
            cardholderMiddleNameResult,
            cardholderPostalCodeResult,
            cardholderStreetAddressResult,
            networkTransactionIdentifier,
            mutableMapOf(),
        )

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
         * validation was accepted by the issuing bank.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun acceptedAt(): OffsetDateTime = acceptedAt.getRequired("accepted_at")

        /**
         * The authorization identification response from the issuing bank.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun authorizationIdentificationResponse(): String =
            authorizationIdentificationResponse.getRequired("authorization_identification_response")

        /**
         * The result of the Card Verification Value 2 match.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun cardVerificationValue2Result(): Optional<CardVerificationValue2Result> =
            cardVerificationValue2Result.getOptional("card_verification_value2_result")

        /**
         * The result of the cardholder first name match.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun cardholderFirstNameResult(): Optional<CardholderFirstNameResult> =
            cardholderFirstNameResult.getOptional("cardholder_first_name_result")

        /**
         * The result of the cardholder full name match.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun cardholderFullNameResult(): Optional<CardholderFullNameResult> =
            cardholderFullNameResult.getOptional("cardholder_full_name_result")

        /**
         * The result of the cardholder last name match.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun cardholderLastNameResult(): Optional<CardholderLastNameResult> =
            cardholderLastNameResult.getOptional("cardholder_last_name_result")

        /**
         * The result of the cardholder middle name match.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun cardholderMiddleNameResult(): Optional<CardholderMiddleNameResult> =
            cardholderMiddleNameResult.getOptional("cardholder_middle_name_result")

        /**
         * The result of the cardholder postal code match.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun cardholderPostalCodeResult(): Optional<CardholderPostalCodeResult> =
            cardholderPostalCodeResult.getOptional("cardholder_postal_code_result")

        /**
         * The result of the cardholder street address match.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun cardholderStreetAddressResult(): Optional<CardholderStreetAddressResult> =
            cardholderStreetAddressResult.getOptional("cardholder_street_address_result")

        /**
         * A unique identifier for the transaction on the card network.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun networkTransactionIdentifier(): Optional<String> =
            networkTransactionIdentifier.getOptional("network_transaction_identifier")

        /**
         * Returns the raw JSON value of [acceptedAt].
         *
         * Unlike [acceptedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("accepted_at")
        @ExcludeMissing
        fun _acceptedAt(): JsonField<OffsetDateTime> = acceptedAt

        /**
         * Returns the raw JSON value of [authorizationIdentificationResponse].
         *
         * Unlike [authorizationIdentificationResponse], this method doesn't throw if the JSON field
         * has an unexpected type.
         */
        @JsonProperty("authorization_identification_response")
        @ExcludeMissing
        fun _authorizationIdentificationResponse(): JsonField<String> =
            authorizationIdentificationResponse

        /**
         * Returns the raw JSON value of [cardVerificationValue2Result].
         *
         * Unlike [cardVerificationValue2Result], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("card_verification_value2_result")
        @ExcludeMissing
        fun _cardVerificationValue2Result(): JsonField<CardVerificationValue2Result> =
            cardVerificationValue2Result

        /**
         * Returns the raw JSON value of [cardholderFirstNameResult].
         *
         * Unlike [cardholderFirstNameResult], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("cardholder_first_name_result")
        @ExcludeMissing
        fun _cardholderFirstNameResult(): JsonField<CardholderFirstNameResult> =
            cardholderFirstNameResult

        /**
         * Returns the raw JSON value of [cardholderFullNameResult].
         *
         * Unlike [cardholderFullNameResult], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("cardholder_full_name_result")
        @ExcludeMissing
        fun _cardholderFullNameResult(): JsonField<CardholderFullNameResult> =
            cardholderFullNameResult

        /**
         * Returns the raw JSON value of [cardholderLastNameResult].
         *
         * Unlike [cardholderLastNameResult], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("cardholder_last_name_result")
        @ExcludeMissing
        fun _cardholderLastNameResult(): JsonField<CardholderLastNameResult> =
            cardholderLastNameResult

        /**
         * Returns the raw JSON value of [cardholderMiddleNameResult].
         *
         * Unlike [cardholderMiddleNameResult], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("cardholder_middle_name_result")
        @ExcludeMissing
        fun _cardholderMiddleNameResult(): JsonField<CardholderMiddleNameResult> =
            cardholderMiddleNameResult

        /**
         * Returns the raw JSON value of [cardholderPostalCodeResult].
         *
         * Unlike [cardholderPostalCodeResult], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("cardholder_postal_code_result")
        @ExcludeMissing
        fun _cardholderPostalCodeResult(): JsonField<CardholderPostalCodeResult> =
            cardholderPostalCodeResult

        /**
         * Returns the raw JSON value of [cardholderStreetAddressResult].
         *
         * Unlike [cardholderStreetAddressResult], this method doesn't throw if the JSON field has
         * an unexpected type.
         */
        @JsonProperty("cardholder_street_address_result")
        @ExcludeMissing
        fun _cardholderStreetAddressResult(): JsonField<CardholderStreetAddressResult> =
            cardholderStreetAddressResult

        /**
         * Returns the raw JSON value of [networkTransactionIdentifier].
         *
         * Unlike [networkTransactionIdentifier], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("network_transaction_identifier")
        @ExcludeMissing
        fun _networkTransactionIdentifier(): JsonField<String> = networkTransactionIdentifier

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
             * Returns a mutable builder for constructing an instance of [Acceptance].
             *
             * The following fields are required:
             * ```java
             * .acceptedAt()
             * .authorizationIdentificationResponse()
             * .cardVerificationValue2Result()
             * .cardholderFirstNameResult()
             * .cardholderFullNameResult()
             * .cardholderLastNameResult()
             * .cardholderMiddleNameResult()
             * .cardholderPostalCodeResult()
             * .cardholderStreetAddressResult()
             * .networkTransactionIdentifier()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Acceptance]. */
        class Builder internal constructor() {

            private var acceptedAt: JsonField<OffsetDateTime>? = null
            private var authorizationIdentificationResponse: JsonField<String>? = null
            private var cardVerificationValue2Result: JsonField<CardVerificationValue2Result>? =
                null
            private var cardholderFirstNameResult: JsonField<CardholderFirstNameResult>? = null
            private var cardholderFullNameResult: JsonField<CardholderFullNameResult>? = null
            private var cardholderLastNameResult: JsonField<CardholderLastNameResult>? = null
            private var cardholderMiddleNameResult: JsonField<CardholderMiddleNameResult>? = null
            private var cardholderPostalCodeResult: JsonField<CardholderPostalCodeResult>? = null
            private var cardholderStreetAddressResult: JsonField<CardholderStreetAddressResult>? =
                null
            private var networkTransactionIdentifier: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(acceptance: Acceptance) = apply {
                acceptedAt = acceptance.acceptedAt
                authorizationIdentificationResponse = acceptance.authorizationIdentificationResponse
                cardVerificationValue2Result = acceptance.cardVerificationValue2Result
                cardholderFirstNameResult = acceptance.cardholderFirstNameResult
                cardholderFullNameResult = acceptance.cardholderFullNameResult
                cardholderLastNameResult = acceptance.cardholderLastNameResult
                cardholderMiddleNameResult = acceptance.cardholderMiddleNameResult
                cardholderPostalCodeResult = acceptance.cardholderPostalCodeResult
                cardholderStreetAddressResult = acceptance.cardholderStreetAddressResult
                networkTransactionIdentifier = acceptance.networkTransactionIdentifier
                additionalProperties = acceptance.additionalProperties.toMutableMap()
            }

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * validation was accepted by the issuing bank.
             */
            fun acceptedAt(acceptedAt: OffsetDateTime) = acceptedAt(JsonField.of(acceptedAt))

            /**
             * Sets [Builder.acceptedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.acceptedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun acceptedAt(acceptedAt: JsonField<OffsetDateTime>) = apply {
                this.acceptedAt = acceptedAt
            }

            /** The authorization identification response from the issuing bank. */
            fun authorizationIdentificationResponse(authorizationIdentificationResponse: String) =
                authorizationIdentificationResponse(
                    JsonField.of(authorizationIdentificationResponse)
                )

            /**
             * Sets [Builder.authorizationIdentificationResponse] to an arbitrary JSON value.
             *
             * You should usually call [Builder.authorizationIdentificationResponse] with a
             * well-typed [String] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun authorizationIdentificationResponse(
                authorizationIdentificationResponse: JsonField<String>
            ) = apply {
                this.authorizationIdentificationResponse = authorizationIdentificationResponse
            }

            /** The result of the Card Verification Value 2 match. */
            fun cardVerificationValue2Result(
                cardVerificationValue2Result: CardVerificationValue2Result?
            ) = cardVerificationValue2Result(JsonField.ofNullable(cardVerificationValue2Result))

            /**
             * Alias for calling [Builder.cardVerificationValue2Result] with
             * `cardVerificationValue2Result.orElse(null)`.
             */
            fun cardVerificationValue2Result(
                cardVerificationValue2Result: Optional<CardVerificationValue2Result>
            ) = cardVerificationValue2Result(cardVerificationValue2Result.getOrNull())

            /**
             * Sets [Builder.cardVerificationValue2Result] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cardVerificationValue2Result] with a well-typed
             * [CardVerificationValue2Result] value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun cardVerificationValue2Result(
                cardVerificationValue2Result: JsonField<CardVerificationValue2Result>
            ) = apply { this.cardVerificationValue2Result = cardVerificationValue2Result }

            /** The result of the cardholder first name match. */
            fun cardholderFirstNameResult(cardholderFirstNameResult: CardholderFirstNameResult?) =
                cardholderFirstNameResult(JsonField.ofNullable(cardholderFirstNameResult))

            /**
             * Alias for calling [Builder.cardholderFirstNameResult] with
             * `cardholderFirstNameResult.orElse(null)`.
             */
            fun cardholderFirstNameResult(
                cardholderFirstNameResult: Optional<CardholderFirstNameResult>
            ) = cardholderFirstNameResult(cardholderFirstNameResult.getOrNull())

            /**
             * Sets [Builder.cardholderFirstNameResult] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cardholderFirstNameResult] with a well-typed
             * [CardholderFirstNameResult] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun cardholderFirstNameResult(
                cardholderFirstNameResult: JsonField<CardholderFirstNameResult>
            ) = apply { this.cardholderFirstNameResult = cardholderFirstNameResult }

            /** The result of the cardholder full name match. */
            fun cardholderFullNameResult(cardholderFullNameResult: CardholderFullNameResult?) =
                cardholderFullNameResult(JsonField.ofNullable(cardholderFullNameResult))

            /**
             * Alias for calling [Builder.cardholderFullNameResult] with
             * `cardholderFullNameResult.orElse(null)`.
             */
            fun cardholderFullNameResult(
                cardholderFullNameResult: Optional<CardholderFullNameResult>
            ) = cardholderFullNameResult(cardholderFullNameResult.getOrNull())

            /**
             * Sets [Builder.cardholderFullNameResult] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cardholderFullNameResult] with a well-typed
             * [CardholderFullNameResult] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun cardholderFullNameResult(
                cardholderFullNameResult: JsonField<CardholderFullNameResult>
            ) = apply { this.cardholderFullNameResult = cardholderFullNameResult }

            /** The result of the cardholder last name match. */
            fun cardholderLastNameResult(cardholderLastNameResult: CardholderLastNameResult?) =
                cardholderLastNameResult(JsonField.ofNullable(cardholderLastNameResult))

            /**
             * Alias for calling [Builder.cardholderLastNameResult] with
             * `cardholderLastNameResult.orElse(null)`.
             */
            fun cardholderLastNameResult(
                cardholderLastNameResult: Optional<CardholderLastNameResult>
            ) = cardholderLastNameResult(cardholderLastNameResult.getOrNull())

            /**
             * Sets [Builder.cardholderLastNameResult] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cardholderLastNameResult] with a well-typed
             * [CardholderLastNameResult] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun cardholderLastNameResult(
                cardholderLastNameResult: JsonField<CardholderLastNameResult>
            ) = apply { this.cardholderLastNameResult = cardholderLastNameResult }

            /** The result of the cardholder middle name match. */
            fun cardholderMiddleNameResult(
                cardholderMiddleNameResult: CardholderMiddleNameResult?
            ) = cardholderMiddleNameResult(JsonField.ofNullable(cardholderMiddleNameResult))

            /**
             * Alias for calling [Builder.cardholderMiddleNameResult] with
             * `cardholderMiddleNameResult.orElse(null)`.
             */
            fun cardholderMiddleNameResult(
                cardholderMiddleNameResult: Optional<CardholderMiddleNameResult>
            ) = cardholderMiddleNameResult(cardholderMiddleNameResult.getOrNull())

            /**
             * Sets [Builder.cardholderMiddleNameResult] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cardholderMiddleNameResult] with a well-typed
             * [CardholderMiddleNameResult] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun cardholderMiddleNameResult(
                cardholderMiddleNameResult: JsonField<CardholderMiddleNameResult>
            ) = apply { this.cardholderMiddleNameResult = cardholderMiddleNameResult }

            /** The result of the cardholder postal code match. */
            fun cardholderPostalCodeResult(
                cardholderPostalCodeResult: CardholderPostalCodeResult?
            ) = cardholderPostalCodeResult(JsonField.ofNullable(cardholderPostalCodeResult))

            /**
             * Alias for calling [Builder.cardholderPostalCodeResult] with
             * `cardholderPostalCodeResult.orElse(null)`.
             */
            fun cardholderPostalCodeResult(
                cardholderPostalCodeResult: Optional<CardholderPostalCodeResult>
            ) = cardholderPostalCodeResult(cardholderPostalCodeResult.getOrNull())

            /**
             * Sets [Builder.cardholderPostalCodeResult] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cardholderPostalCodeResult] with a well-typed
             * [CardholderPostalCodeResult] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun cardholderPostalCodeResult(
                cardholderPostalCodeResult: JsonField<CardholderPostalCodeResult>
            ) = apply { this.cardholderPostalCodeResult = cardholderPostalCodeResult }

            /** The result of the cardholder street address match. */
            fun cardholderStreetAddressResult(
                cardholderStreetAddressResult: CardholderStreetAddressResult?
            ) = cardholderStreetAddressResult(JsonField.ofNullable(cardholderStreetAddressResult))

            /**
             * Alias for calling [Builder.cardholderStreetAddressResult] with
             * `cardholderStreetAddressResult.orElse(null)`.
             */
            fun cardholderStreetAddressResult(
                cardholderStreetAddressResult: Optional<CardholderStreetAddressResult>
            ) = cardholderStreetAddressResult(cardholderStreetAddressResult.getOrNull())

            /**
             * Sets [Builder.cardholderStreetAddressResult] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cardholderStreetAddressResult] with a well-typed
             * [CardholderStreetAddressResult] value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun cardholderStreetAddressResult(
                cardholderStreetAddressResult: JsonField<CardholderStreetAddressResult>
            ) = apply { this.cardholderStreetAddressResult = cardholderStreetAddressResult }

            /** A unique identifier for the transaction on the card network. */
            fun networkTransactionIdentifier(networkTransactionIdentifier: String?) =
                networkTransactionIdentifier(JsonField.ofNullable(networkTransactionIdentifier))

            /**
             * Alias for calling [Builder.networkTransactionIdentifier] with
             * `networkTransactionIdentifier.orElse(null)`.
             */
            fun networkTransactionIdentifier(networkTransactionIdentifier: Optional<String>) =
                networkTransactionIdentifier(networkTransactionIdentifier.getOrNull())

            /**
             * Sets [Builder.networkTransactionIdentifier] to an arbitrary JSON value.
             *
             * You should usually call [Builder.networkTransactionIdentifier] with a well-typed
             * [String] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun networkTransactionIdentifier(networkTransactionIdentifier: JsonField<String>) =
                apply {
                    this.networkTransactionIdentifier = networkTransactionIdentifier
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
             * Returns an immutable instance of [Acceptance].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .acceptedAt()
             * .authorizationIdentificationResponse()
             * .cardVerificationValue2Result()
             * .cardholderFirstNameResult()
             * .cardholderFullNameResult()
             * .cardholderLastNameResult()
             * .cardholderMiddleNameResult()
             * .cardholderPostalCodeResult()
             * .cardholderStreetAddressResult()
             * .networkTransactionIdentifier()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Acceptance =
                Acceptance(
                    checkRequired("acceptedAt", acceptedAt),
                    checkRequired(
                        "authorizationIdentificationResponse",
                        authorizationIdentificationResponse,
                    ),
                    checkRequired("cardVerificationValue2Result", cardVerificationValue2Result),
                    checkRequired("cardholderFirstNameResult", cardholderFirstNameResult),
                    checkRequired("cardholderFullNameResult", cardholderFullNameResult),
                    checkRequired("cardholderLastNameResult", cardholderLastNameResult),
                    checkRequired("cardholderMiddleNameResult", cardholderMiddleNameResult),
                    checkRequired("cardholderPostalCodeResult", cardholderPostalCodeResult),
                    checkRequired("cardholderStreetAddressResult", cardholderStreetAddressResult),
                    checkRequired("networkTransactionIdentifier", networkTransactionIdentifier),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Acceptance = apply {
            if (validated) {
                return@apply
            }

            acceptedAt()
            authorizationIdentificationResponse()
            cardVerificationValue2Result().ifPresent { it.validate() }
            cardholderFirstNameResult().ifPresent { it.validate() }
            cardholderFullNameResult().ifPresent { it.validate() }
            cardholderLastNameResult().ifPresent { it.validate() }
            cardholderMiddleNameResult().ifPresent { it.validate() }
            cardholderPostalCodeResult().ifPresent { it.validate() }
            cardholderStreetAddressResult().ifPresent { it.validate() }
            networkTransactionIdentifier()
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
            (if (acceptedAt.asKnown().isPresent) 1 else 0) +
                (if (authorizationIdentificationResponse.asKnown().isPresent) 1 else 0) +
                (cardVerificationValue2Result.asKnown().getOrNull()?.validity() ?: 0) +
                (cardholderFirstNameResult.asKnown().getOrNull()?.validity() ?: 0) +
                (cardholderFullNameResult.asKnown().getOrNull()?.validity() ?: 0) +
                (cardholderLastNameResult.asKnown().getOrNull()?.validity() ?: 0) +
                (cardholderMiddleNameResult.asKnown().getOrNull()?.validity() ?: 0) +
                (cardholderPostalCodeResult.asKnown().getOrNull()?.validity() ?: 0) +
                (cardholderStreetAddressResult.asKnown().getOrNull()?.validity() ?: 0) +
                (if (networkTransactionIdentifier.asKnown().isPresent) 1 else 0)

        /** The result of the Card Verification Value 2 match. */
        class CardVerificationValue2Result
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

                /** The Card Verification Value 2 (CVV2) matches the expected value. */
                @JvmField val MATCH = of("match")

                /** The Card Verification Value 2 (CVV2) does not match the expected value. */
                @JvmField val NO_MATCH = of("no_match")

                @JvmStatic fun of(value: String) = CardVerificationValue2Result(JsonField.of(value))
            }

            /** An enum containing [CardVerificationValue2Result]'s known values. */
            enum class Known {
                /** The Card Verification Value 2 (CVV2) matches the expected value. */
                MATCH,
                /** The Card Verification Value 2 (CVV2) does not match the expected value. */
                NO_MATCH,
            }

            /**
             * An enum containing [CardVerificationValue2Result]'s known values, as well as an
             * [_UNKNOWN] member.
             *
             * An instance of [CardVerificationValue2Result] can contain an unknown value in a
             * couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /** The Card Verification Value 2 (CVV2) matches the expected value. */
                MATCH,
                /** The Card Verification Value 2 (CVV2) does not match the expected value. */
                NO_MATCH,
                /**
                 * An enum member indicating that [CardVerificationValue2Result] was instantiated
                 * with an unknown value.
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
                    MATCH -> Value.MATCH
                    NO_MATCH -> Value.NO_MATCH
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
                    MATCH -> Known.MATCH
                    NO_MATCH -> Known.NO_MATCH
                    else ->
                        throw IncreaseInvalidDataException(
                            "Unknown CardVerificationValue2Result: $value"
                        )
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

            fun validate(): CardVerificationValue2Result = apply {
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

                return other is CardVerificationValue2Result && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** The result of the cardholder first name match. */
        class CardholderFirstNameResult
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

                /** The cardholder name component matches the expected value. */
                @JvmField val MATCH = of("match")

                /** The cardholder name component does not match the expected value. */
                @JvmField val NO_MATCH = of("no_match")

                /** The cardholder name component partially matches the expected value. */
                @JvmField val PARTIAL_MATCH = of("partial_match")

                @JvmStatic fun of(value: String) = CardholderFirstNameResult(JsonField.of(value))
            }

            /** An enum containing [CardholderFirstNameResult]'s known values. */
            enum class Known {
                /** The cardholder name component matches the expected value. */
                MATCH,
                /** The cardholder name component does not match the expected value. */
                NO_MATCH,
                /** The cardholder name component partially matches the expected value. */
                PARTIAL_MATCH,
            }

            /**
             * An enum containing [CardholderFirstNameResult]'s known values, as well as an
             * [_UNKNOWN] member.
             *
             * An instance of [CardholderFirstNameResult] can contain an unknown value in a couple
             * of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /** The cardholder name component matches the expected value. */
                MATCH,
                /** The cardholder name component does not match the expected value. */
                NO_MATCH,
                /** The cardholder name component partially matches the expected value. */
                PARTIAL_MATCH,
                /**
                 * An enum member indicating that [CardholderFirstNameResult] was instantiated with
                 * an unknown value.
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
                    MATCH -> Value.MATCH
                    NO_MATCH -> Value.NO_MATCH
                    PARTIAL_MATCH -> Value.PARTIAL_MATCH
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
                    MATCH -> Known.MATCH
                    NO_MATCH -> Known.NO_MATCH
                    PARTIAL_MATCH -> Known.PARTIAL_MATCH
                    else ->
                        throw IncreaseInvalidDataException(
                            "Unknown CardholderFirstNameResult: $value"
                        )
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

            fun validate(): CardholderFirstNameResult = apply {
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

                return other is CardholderFirstNameResult && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** The result of the cardholder full name match. */
        class CardholderFullNameResult
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

                /** The cardholder name component matches the expected value. */
                @JvmField val MATCH = of("match")

                /** The cardholder name component does not match the expected value. */
                @JvmField val NO_MATCH = of("no_match")

                /** The cardholder name component partially matches the expected value. */
                @JvmField val PARTIAL_MATCH = of("partial_match")

                @JvmStatic fun of(value: String) = CardholderFullNameResult(JsonField.of(value))
            }

            /** An enum containing [CardholderFullNameResult]'s known values. */
            enum class Known {
                /** The cardholder name component matches the expected value. */
                MATCH,
                /** The cardholder name component does not match the expected value. */
                NO_MATCH,
                /** The cardholder name component partially matches the expected value. */
                PARTIAL_MATCH,
            }

            /**
             * An enum containing [CardholderFullNameResult]'s known values, as well as an
             * [_UNKNOWN] member.
             *
             * An instance of [CardholderFullNameResult] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /** The cardholder name component matches the expected value. */
                MATCH,
                /** The cardholder name component does not match the expected value. */
                NO_MATCH,
                /** The cardholder name component partially matches the expected value. */
                PARTIAL_MATCH,
                /**
                 * An enum member indicating that [CardholderFullNameResult] was instantiated with
                 * an unknown value.
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
                    MATCH -> Value.MATCH
                    NO_MATCH -> Value.NO_MATCH
                    PARTIAL_MATCH -> Value.PARTIAL_MATCH
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
                    MATCH -> Known.MATCH
                    NO_MATCH -> Known.NO_MATCH
                    PARTIAL_MATCH -> Known.PARTIAL_MATCH
                    else ->
                        throw IncreaseInvalidDataException(
                            "Unknown CardholderFullNameResult: $value"
                        )
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

            fun validate(): CardholderFullNameResult = apply {
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

                return other is CardholderFullNameResult && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** The result of the cardholder last name match. */
        class CardholderLastNameResult
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

                /** The cardholder name component matches the expected value. */
                @JvmField val MATCH = of("match")

                /** The cardholder name component does not match the expected value. */
                @JvmField val NO_MATCH = of("no_match")

                /** The cardholder name component partially matches the expected value. */
                @JvmField val PARTIAL_MATCH = of("partial_match")

                @JvmStatic fun of(value: String) = CardholderLastNameResult(JsonField.of(value))
            }

            /** An enum containing [CardholderLastNameResult]'s known values. */
            enum class Known {
                /** The cardholder name component matches the expected value. */
                MATCH,
                /** The cardholder name component does not match the expected value. */
                NO_MATCH,
                /** The cardholder name component partially matches the expected value. */
                PARTIAL_MATCH,
            }

            /**
             * An enum containing [CardholderLastNameResult]'s known values, as well as an
             * [_UNKNOWN] member.
             *
             * An instance of [CardholderLastNameResult] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /** The cardholder name component matches the expected value. */
                MATCH,
                /** The cardholder name component does not match the expected value. */
                NO_MATCH,
                /** The cardholder name component partially matches the expected value. */
                PARTIAL_MATCH,
                /**
                 * An enum member indicating that [CardholderLastNameResult] was instantiated with
                 * an unknown value.
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
                    MATCH -> Value.MATCH
                    NO_MATCH -> Value.NO_MATCH
                    PARTIAL_MATCH -> Value.PARTIAL_MATCH
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
                    MATCH -> Known.MATCH
                    NO_MATCH -> Known.NO_MATCH
                    PARTIAL_MATCH -> Known.PARTIAL_MATCH
                    else ->
                        throw IncreaseInvalidDataException(
                            "Unknown CardholderLastNameResult: $value"
                        )
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

            fun validate(): CardholderLastNameResult = apply {
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

                return other is CardholderLastNameResult && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** The result of the cardholder middle name match. */
        class CardholderMiddleNameResult
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

                /** The cardholder name component matches the expected value. */
                @JvmField val MATCH = of("match")

                /** The cardholder name component does not match the expected value. */
                @JvmField val NO_MATCH = of("no_match")

                /** The cardholder name component partially matches the expected value. */
                @JvmField val PARTIAL_MATCH = of("partial_match")

                @JvmStatic fun of(value: String) = CardholderMiddleNameResult(JsonField.of(value))
            }

            /** An enum containing [CardholderMiddleNameResult]'s known values. */
            enum class Known {
                /** The cardholder name component matches the expected value. */
                MATCH,
                /** The cardholder name component does not match the expected value. */
                NO_MATCH,
                /** The cardholder name component partially matches the expected value. */
                PARTIAL_MATCH,
            }

            /**
             * An enum containing [CardholderMiddleNameResult]'s known values, as well as an
             * [_UNKNOWN] member.
             *
             * An instance of [CardholderMiddleNameResult] can contain an unknown value in a couple
             * of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /** The cardholder name component matches the expected value. */
                MATCH,
                /** The cardholder name component does not match the expected value. */
                NO_MATCH,
                /** The cardholder name component partially matches the expected value. */
                PARTIAL_MATCH,
                /**
                 * An enum member indicating that [CardholderMiddleNameResult] was instantiated with
                 * an unknown value.
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
                    MATCH -> Value.MATCH
                    NO_MATCH -> Value.NO_MATCH
                    PARTIAL_MATCH -> Value.PARTIAL_MATCH
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
                    MATCH -> Known.MATCH
                    NO_MATCH -> Known.NO_MATCH
                    PARTIAL_MATCH -> Known.PARTIAL_MATCH
                    else ->
                        throw IncreaseInvalidDataException(
                            "Unknown CardholderMiddleNameResult: $value"
                        )
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

            fun validate(): CardholderMiddleNameResult = apply {
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

                return other is CardholderMiddleNameResult && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** The result of the cardholder postal code match. */
        class CardholderPostalCodeResult
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

                /** The cardholder address component matches the expected value. */
                @JvmField val MATCH = of("match")

                /** The cardholder address component does not match the expected value. */
                @JvmField val NO_MATCH = of("no_match")

                @JvmStatic fun of(value: String) = CardholderPostalCodeResult(JsonField.of(value))
            }

            /** An enum containing [CardholderPostalCodeResult]'s known values. */
            enum class Known {
                /** The cardholder address component matches the expected value. */
                MATCH,
                /** The cardholder address component does not match the expected value. */
                NO_MATCH,
            }

            /**
             * An enum containing [CardholderPostalCodeResult]'s known values, as well as an
             * [_UNKNOWN] member.
             *
             * An instance of [CardholderPostalCodeResult] can contain an unknown value in a couple
             * of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /** The cardholder address component matches the expected value. */
                MATCH,
                /** The cardholder address component does not match the expected value. */
                NO_MATCH,
                /**
                 * An enum member indicating that [CardholderPostalCodeResult] was instantiated with
                 * an unknown value.
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
                    MATCH -> Value.MATCH
                    NO_MATCH -> Value.NO_MATCH
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
                    MATCH -> Known.MATCH
                    NO_MATCH -> Known.NO_MATCH
                    else ->
                        throw IncreaseInvalidDataException(
                            "Unknown CardholderPostalCodeResult: $value"
                        )
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

            fun validate(): CardholderPostalCodeResult = apply {
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

                return other is CardholderPostalCodeResult && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** The result of the cardholder street address match. */
        class CardholderStreetAddressResult
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

                /** The cardholder address component matches the expected value. */
                @JvmField val MATCH = of("match")

                /** The cardholder address component does not match the expected value. */
                @JvmField val NO_MATCH = of("no_match")

                @JvmStatic
                fun of(value: String) = CardholderStreetAddressResult(JsonField.of(value))
            }

            /** An enum containing [CardholderStreetAddressResult]'s known values. */
            enum class Known {
                /** The cardholder address component matches the expected value. */
                MATCH,
                /** The cardholder address component does not match the expected value. */
                NO_MATCH,
            }

            /**
             * An enum containing [CardholderStreetAddressResult]'s known values, as well as an
             * [_UNKNOWN] member.
             *
             * An instance of [CardholderStreetAddressResult] can contain an unknown value in a
             * couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /** The cardholder address component matches the expected value. */
                MATCH,
                /** The cardholder address component does not match the expected value. */
                NO_MATCH,
                /**
                 * An enum member indicating that [CardholderStreetAddressResult] was instantiated
                 * with an unknown value.
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
                    MATCH -> Value.MATCH
                    NO_MATCH -> Value.NO_MATCH
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
                    MATCH -> Known.MATCH
                    NO_MATCH -> Known.NO_MATCH
                    else ->
                        throw IncreaseInvalidDataException(
                            "Unknown CardholderStreetAddressResult: $value"
                        )
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

            fun validate(): CardholderStreetAddressResult = apply {
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

                return other is CardholderStreetAddressResult && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Acceptance &&
                acceptedAt == other.acceptedAt &&
                authorizationIdentificationResponse == other.authorizationIdentificationResponse &&
                cardVerificationValue2Result == other.cardVerificationValue2Result &&
                cardholderFirstNameResult == other.cardholderFirstNameResult &&
                cardholderFullNameResult == other.cardholderFullNameResult &&
                cardholderLastNameResult == other.cardholderLastNameResult &&
                cardholderMiddleNameResult == other.cardholderMiddleNameResult &&
                cardholderPostalCodeResult == other.cardholderPostalCodeResult &&
                cardholderStreetAddressResult == other.cardholderStreetAddressResult &&
                networkTransactionIdentifier == other.networkTransactionIdentifier &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                acceptedAt,
                authorizationIdentificationResponse,
                cardVerificationValue2Result,
                cardholderFirstNameResult,
                cardholderFullNameResult,
                cardholderLastNameResult,
                cardholderMiddleNameResult,
                cardholderPostalCodeResult,
                cardholderStreetAddressResult,
                networkTransactionIdentifier,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Acceptance{acceptedAt=$acceptedAt, authorizationIdentificationResponse=$authorizationIdentificationResponse, cardVerificationValue2Result=$cardVerificationValue2Result, cardholderFirstNameResult=$cardholderFirstNameResult, cardholderFullNameResult=$cardholderFullNameResult, cardholderLastNameResult=$cardholderLastNameResult, cardholderMiddleNameResult=$cardholderMiddleNameResult, cardholderPostalCodeResult=$cardholderPostalCodeResult, cardholderStreetAddressResult=$cardholderStreetAddressResult, networkTransactionIdentifier=$networkTransactionIdentifier, additionalProperties=$additionalProperties}"
    }

    /** What object created the validation, either via the API or the dashboard. */
    class CreatedBy
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val category: JsonField<Category>,
        private val apiKey: JsonField<ApiKey>,
        private val oauthApplication: JsonField<OAuthApplication>,
        private val user: JsonField<User>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("category")
            @ExcludeMissing
            category: JsonField<Category> = JsonMissing.of(),
            @JsonProperty("api_key") @ExcludeMissing apiKey: JsonField<ApiKey> = JsonMissing.of(),
            @JsonProperty("oauth_application")
            @ExcludeMissing
            oauthApplication: JsonField<OAuthApplication> = JsonMissing.of(),
            @JsonProperty("user") @ExcludeMissing user: JsonField<User> = JsonMissing.of(),
        ) : this(category, apiKey, oauthApplication, user, mutableMapOf())

        /**
         * The type of object that created this transfer.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun category(): Category = category.getRequired("category")

        /**
         * If present, details about the API key that created the transfer.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun apiKey(): Optional<ApiKey> = apiKey.getOptional("api_key")

        /**
         * If present, details about the OAuth Application that created the transfer.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun oauthApplication(): Optional<OAuthApplication> =
            oauthApplication.getOptional("oauth_application")

        /**
         * If present, details about the User that created the transfer.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun user(): Optional<User> = user.getOptional("user")

        /**
         * Returns the raw JSON value of [category].
         *
         * Unlike [category], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("category") @ExcludeMissing fun _category(): JsonField<Category> = category

        /**
         * Returns the raw JSON value of [apiKey].
         *
         * Unlike [apiKey], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("api_key") @ExcludeMissing fun _apiKey(): JsonField<ApiKey> = apiKey

        /**
         * Returns the raw JSON value of [oauthApplication].
         *
         * Unlike [oauthApplication], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("oauth_application")
        @ExcludeMissing
        fun _oauthApplication(): JsonField<OAuthApplication> = oauthApplication

        /**
         * Returns the raw JSON value of [user].
         *
         * Unlike [user], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("user") @ExcludeMissing fun _user(): JsonField<User> = user

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
             * Returns a mutable builder for constructing an instance of [CreatedBy].
             *
             * The following fields are required:
             * ```java
             * .category()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CreatedBy]. */
        class Builder internal constructor() {

            private var category: JsonField<Category>? = null
            private var apiKey: JsonField<ApiKey> = JsonMissing.of()
            private var oauthApplication: JsonField<OAuthApplication> = JsonMissing.of()
            private var user: JsonField<User> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(createdBy: CreatedBy) = apply {
                category = createdBy.category
                apiKey = createdBy.apiKey
                oauthApplication = createdBy.oauthApplication
                user = createdBy.user
                additionalProperties = createdBy.additionalProperties.toMutableMap()
            }

            /** The type of object that created this transfer. */
            fun category(category: Category) = category(JsonField.of(category))

            /**
             * Sets [Builder.category] to an arbitrary JSON value.
             *
             * You should usually call [Builder.category] with a well-typed [Category] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun category(category: JsonField<Category>) = apply { this.category = category }

            /** If present, details about the API key that created the transfer. */
            fun apiKey(apiKey: ApiKey?) = apiKey(JsonField.ofNullable(apiKey))

            /** Alias for calling [Builder.apiKey] with `apiKey.orElse(null)`. */
            fun apiKey(apiKey: Optional<ApiKey>) = apiKey(apiKey.getOrNull())

            /**
             * Sets [Builder.apiKey] to an arbitrary JSON value.
             *
             * You should usually call [Builder.apiKey] with a well-typed [ApiKey] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun apiKey(apiKey: JsonField<ApiKey>) = apply { this.apiKey = apiKey }

            /** If present, details about the OAuth Application that created the transfer. */
            fun oauthApplication(oauthApplication: OAuthApplication?) =
                oauthApplication(JsonField.ofNullable(oauthApplication))

            /**
             * Alias for calling [Builder.oauthApplication] with `oauthApplication.orElse(null)`.
             */
            fun oauthApplication(oauthApplication: Optional<OAuthApplication>) =
                oauthApplication(oauthApplication.getOrNull())

            /**
             * Sets [Builder.oauthApplication] to an arbitrary JSON value.
             *
             * You should usually call [Builder.oauthApplication] with a well-typed
             * [OAuthApplication] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun oauthApplication(oauthApplication: JsonField<OAuthApplication>) = apply {
                this.oauthApplication = oauthApplication
            }

            /** If present, details about the User that created the transfer. */
            fun user(user: User?) = user(JsonField.ofNullable(user))

            /** Alias for calling [Builder.user] with `user.orElse(null)`. */
            fun user(user: Optional<User>) = user(user.getOrNull())

            /**
             * Sets [Builder.user] to an arbitrary JSON value.
             *
             * You should usually call [Builder.user] with a well-typed [User] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun user(user: JsonField<User>) = apply { this.user = user }

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
             * Returns an immutable instance of [CreatedBy].
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
            fun build(): CreatedBy =
                CreatedBy(
                    checkRequired("category", category),
                    apiKey,
                    oauthApplication,
                    user,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): CreatedBy = apply {
            if (validated) {
                return@apply
            }

            category().validate()
            apiKey().ifPresent { it.validate() }
            oauthApplication().ifPresent { it.validate() }
            user().ifPresent { it.validate() }
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
                (apiKey.asKnown().getOrNull()?.validity() ?: 0) +
                (oauthApplication.asKnown().getOrNull()?.validity() ?: 0) +
                (user.asKnown().getOrNull()?.validity() ?: 0)

        /** The type of object that created this transfer. */
        class Category @JsonCreator private constructor(private val value: JsonField<String>) :
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

                /** An API key. Details will be under the `api_key` object. */
                @JvmField val API_KEY = of("api_key")

                /**
                 * An OAuth application you connected to Increase. Details will be under the
                 * `oauth_application` object.
                 */
                @JvmField val OAUTH_APPLICATION = of("oauth_application")

                /** A User in the Increase dashboard. Details will be under the `user` object. */
                @JvmField val USER = of("user")

                @JvmStatic fun of(value: String) = Category(JsonField.of(value))
            }

            /** An enum containing [Category]'s known values. */
            enum class Known {
                /** An API key. Details will be under the `api_key` object. */
                API_KEY,
                /**
                 * An OAuth application you connected to Increase. Details will be under the
                 * `oauth_application` object.
                 */
                OAUTH_APPLICATION,
                /** A User in the Increase dashboard. Details will be under the `user` object. */
                USER,
            }

            /**
             * An enum containing [Category]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Category] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /** An API key. Details will be under the `api_key` object. */
                API_KEY,
                /**
                 * An OAuth application you connected to Increase. Details will be under the
                 * `oauth_application` object.
                 */
                OAUTH_APPLICATION,
                /** A User in the Increase dashboard. Details will be under the `user` object. */
                USER,
                /**
                 * An enum member indicating that [Category] was instantiated with an unknown value.
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
                    API_KEY -> Value.API_KEY
                    OAUTH_APPLICATION -> Value.OAUTH_APPLICATION
                    USER -> Value.USER
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
                    API_KEY -> Known.API_KEY
                    OAUTH_APPLICATION -> Known.OAUTH_APPLICATION
                    USER -> Known.USER
                    else -> throw IncreaseInvalidDataException("Unknown Category: $value")
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

        /** If present, details about the API key that created the transfer. */
        class ApiKey
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val description: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("description")
                @ExcludeMissing
                description: JsonField<String> = JsonMissing.of()
            ) : this(description, mutableMapOf())

            /**
             * The description set for the API key when it was created.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun description(): Optional<String> = description.getOptional("description")

            /**
             * Returns the raw JSON value of [description].
             *
             * Unlike [description], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("description")
            @ExcludeMissing
            fun _description(): JsonField<String> = description

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
                 * Returns a mutable builder for constructing an instance of [ApiKey].
                 *
                 * The following fields are required:
                 * ```java
                 * .description()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ApiKey]. */
            class Builder internal constructor() {

                private var description: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(apiKey: ApiKey) = apply {
                    description = apiKey.description
                    additionalProperties = apiKey.additionalProperties.toMutableMap()
                }

                /** The description set for the API key when it was created. */
                fun description(description: String?) =
                    description(JsonField.ofNullable(description))

                /** Alias for calling [Builder.description] with `description.orElse(null)`. */
                fun description(description: Optional<String>) =
                    description(description.getOrNull())

                /**
                 * Sets [Builder.description] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.description] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun description(description: JsonField<String>) = apply {
                    this.description = description
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
                 * Returns an immutable instance of [ApiKey].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .description()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): ApiKey =
                    ApiKey(
                        checkRequired("description", description),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): ApiKey = apply {
                if (validated) {
                    return@apply
                }

                description()
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
            internal fun validity(): Int = (if (description.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ApiKey &&
                    description == other.description &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(description, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ApiKey{description=$description, additionalProperties=$additionalProperties}"
        }

        /** If present, details about the OAuth Application that created the transfer. */
        class OAuthApplication
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
             * The name of the OAuth Application.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun name(): String = name.getRequired("name")

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
                 * Returns a mutable builder for constructing an instance of [OAuthApplication].
                 *
                 * The following fields are required:
                 * ```java
                 * .name()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [OAuthApplication]. */
            class Builder internal constructor() {

                private var name: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(oauthApplication: OAuthApplication) = apply {
                    name = oauthApplication.name
                    additionalProperties = oauthApplication.additionalProperties.toMutableMap()
                }

                /** The name of the OAuth Application. */
                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

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
                 * Returns an immutable instance of [OAuthApplication].
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
                fun build(): OAuthApplication =
                    OAuthApplication(
                        checkRequired("name", name),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): OAuthApplication = apply {
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

                return other is OAuthApplication &&
                    name == other.name &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(name, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "OAuthApplication{name=$name, additionalProperties=$additionalProperties}"
        }

        /** If present, details about the User that created the transfer. */
        class User
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val email: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of()
            ) : this(email, mutableMapOf())

            /**
             * The email address of the User.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun email(): String = email.getRequired("email")

            /**
             * Returns the raw JSON value of [email].
             *
             * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

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
                 * Returns a mutable builder for constructing an instance of [User].
                 *
                 * The following fields are required:
                 * ```java
                 * .email()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [User]. */
            class Builder internal constructor() {

                private var email: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(user: User) = apply {
                    email = user.email
                    additionalProperties = user.additionalProperties.toMutableMap()
                }

                /** The email address of the User. */
                fun email(email: String) = email(JsonField.of(email))

                /**
                 * Sets [Builder.email] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.email] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun email(email: JsonField<String>) = apply { this.email = email }

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
                 * Returns an immutable instance of [User].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .email()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): User =
                    User(checkRequired("email", email), additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): User = apply {
                if (validated) {
                    return@apply
                }

                email()
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
            @JvmSynthetic internal fun validity(): Int = (if (email.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is User &&
                    email == other.email &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(email, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "User{email=$email, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CreatedBy &&
                category == other.category &&
                apiKey == other.apiKey &&
                oauthApplication == other.oauthApplication &&
                user == other.user &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(category, apiKey, oauthApplication, user, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CreatedBy{category=$category, apiKey=$apiKey, oauthApplication=$oauthApplication, user=$user, additionalProperties=$additionalProperties}"
    }

    /**
     * If the validation is rejected by the card network or the destination financial institution,
     * this will contain supplemental details.
     */
    class Decline
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val declinedAt: JsonField<OffsetDateTime>,
        private val networkTransactionIdentifier: JsonField<String>,
        private val reason: JsonField<Reason>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("declined_at")
            @ExcludeMissing
            declinedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("network_transaction_identifier")
            @ExcludeMissing
            networkTransactionIdentifier: JsonField<String> = JsonMissing.of(),
            @JsonProperty("reason") @ExcludeMissing reason: JsonField<Reason> = JsonMissing.of(),
        ) : this(declinedAt, networkTransactionIdentifier, reason, mutableMapOf())

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
         * validation was declined.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun declinedAt(): OffsetDateTime = declinedAt.getRequired("declined_at")

        /**
         * A unique identifier for the transaction on the card network.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun networkTransactionIdentifier(): Optional<String> =
            networkTransactionIdentifier.getOptional("network_transaction_identifier")

        /**
         * The reason why the validation was declined.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun reason(): Reason = reason.getRequired("reason")

        /**
         * Returns the raw JSON value of [declinedAt].
         *
         * Unlike [declinedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("declined_at")
        @ExcludeMissing
        fun _declinedAt(): JsonField<OffsetDateTime> = declinedAt

        /**
         * Returns the raw JSON value of [networkTransactionIdentifier].
         *
         * Unlike [networkTransactionIdentifier], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("network_transaction_identifier")
        @ExcludeMissing
        fun _networkTransactionIdentifier(): JsonField<String> = networkTransactionIdentifier

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
             * Returns a mutable builder for constructing an instance of [Decline].
             *
             * The following fields are required:
             * ```java
             * .declinedAt()
             * .networkTransactionIdentifier()
             * .reason()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Decline]. */
        class Builder internal constructor() {

            private var declinedAt: JsonField<OffsetDateTime>? = null
            private var networkTransactionIdentifier: JsonField<String>? = null
            private var reason: JsonField<Reason>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(decline: Decline) = apply {
                declinedAt = decline.declinedAt
                networkTransactionIdentifier = decline.networkTransactionIdentifier
                reason = decline.reason
                additionalProperties = decline.additionalProperties.toMutableMap()
            }

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * validation was declined.
             */
            fun declinedAt(declinedAt: OffsetDateTime) = declinedAt(JsonField.of(declinedAt))

            /**
             * Sets [Builder.declinedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.declinedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun declinedAt(declinedAt: JsonField<OffsetDateTime>) = apply {
                this.declinedAt = declinedAt
            }

            /** A unique identifier for the transaction on the card network. */
            fun networkTransactionIdentifier(networkTransactionIdentifier: String?) =
                networkTransactionIdentifier(JsonField.ofNullable(networkTransactionIdentifier))

            /**
             * Alias for calling [Builder.networkTransactionIdentifier] with
             * `networkTransactionIdentifier.orElse(null)`.
             */
            fun networkTransactionIdentifier(networkTransactionIdentifier: Optional<String>) =
                networkTransactionIdentifier(networkTransactionIdentifier.getOrNull())

            /**
             * Sets [Builder.networkTransactionIdentifier] to an arbitrary JSON value.
             *
             * You should usually call [Builder.networkTransactionIdentifier] with a well-typed
             * [String] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun networkTransactionIdentifier(networkTransactionIdentifier: JsonField<String>) =
                apply {
                    this.networkTransactionIdentifier = networkTransactionIdentifier
                }

            /** The reason why the validation was declined. */
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
             * Returns an immutable instance of [Decline].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .declinedAt()
             * .networkTransactionIdentifier()
             * .reason()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Decline =
                Decline(
                    checkRequired("declinedAt", declinedAt),
                    checkRequired("networkTransactionIdentifier", networkTransactionIdentifier),
                    checkRequired("reason", reason),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Decline = apply {
            if (validated) {
                return@apply
            }

            declinedAt()
            networkTransactionIdentifier()
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
        @JvmSynthetic
        internal fun validity(): Int =
            (if (declinedAt.asKnown().isPresent) 1 else 0) +
                (if (networkTransactionIdentifier.asKnown().isPresent) 1 else 0) +
                (reason.asKnown().getOrNull()?.validity() ?: 0)

        /** The reason why the validation was declined. */
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

                /**
                 * The card issuer has declined the transaction without providing a specific reason.
                 */
                @JvmField val DO_NOT_HONOR = of("do_not_honor")

                /**
                 * The number of transactions for the card has exceeded the limit set by the issuer.
                 */
                @JvmField val ACTIVITY_COUNT_LIMIT_EXCEEDED = of("activity_count_limit_exceeded")

                /**
                 * The card issuer requires the cardholder to contact them for further information
                 * regarding the transaction.
                 */
                @JvmField val REFER_TO_CARD_ISSUER = of("refer_to_card_issuer")

                /**
                 * The card issuer requires the cardholder to contact them due to a special
                 * condition related to the transaction.
                 */
                @JvmField
                val REFER_TO_CARD_ISSUER_SPECIAL_CONDITION =
                    of("refer_to_card_issuer_special_condition")

                /** The merchant is not valid for this transaction. */
                @JvmField val INVALID_MERCHANT = of("invalid_merchant")

                /** The card should be retained by the terminal. */
                @JvmField val PICK_UP_CARD = of("pick_up_card")

                /** An error occurred during processing of the transaction. */
                @JvmField val ERROR = of("error")

                /** The card should be retained by the terminal due to a special condition. */
                @JvmField val PICK_UP_CARD_SPECIAL = of("pick_up_card_special")

                /** The transaction is invalid and cannot be processed. */
                @JvmField val INVALID_TRANSACTION = of("invalid_transaction")

                /** The amount of the transaction is invalid. */
                @JvmField val INVALID_AMOUNT = of("invalid_amount")

                /** The account number provided is invalid. */
                @JvmField val INVALID_ACCOUNT_NUMBER = of("invalid_account_number")

                /** The issuer of the card could not be found. */
                @JvmField val NO_SUCH_ISSUER = of("no_such_issuer")

                /** The transaction should be re-entered for processing. */
                @JvmField val RE_ENTER_TRANSACTION = of("re_enter_transaction")

                /** There is no credit account associated with the card. */
                @JvmField val NO_CREDIT_ACCOUNT = of("no_credit_account")

                /**
                 * The card should be retained by the terminal because it has been reported lost.
                 */
                @JvmField val PICK_UP_CARD_LOST = of("pick_up_card_lost")

                /**
                 * The card should be retained by the terminal because it has been reported stolen.
                 */
                @JvmField val PICK_UP_CARD_STOLEN = of("pick_up_card_stolen")

                /** The account associated with the card has been closed. */
                @JvmField val CLOSED_ACCOUNT = of("closed_account")

                /** There are insufficient funds in the account to complete the transaction. */
                @JvmField val INSUFFICIENT_FUNDS = of("insufficient_funds")

                /** There is no checking account associated with the card. */
                @JvmField val NO_CHECKING_ACCOUNT = of("no_checking_account")

                /** There is no savings account associated with the card. */
                @JvmField val NO_SAVINGS_ACCOUNT = of("no_savings_account")

                /** The card has expired and cannot be used for transactions. */
                @JvmField val EXPIRED_CARD = of("expired_card")

                /** The transaction is not permitted for this cardholder. */
                @JvmField
                val TRANSACTION_NOT_PERMITTED_TO_CARDHOLDER =
                    of("transaction_not_permitted_to_cardholder")

                /** The transaction is not allowed at this terminal. */
                @JvmField
                val TRANSACTION_NOT_ALLOWED_AT_TERMINAL = of("transaction_not_allowed_at_terminal")

                /** The transaction has been flagged as suspected fraud and cannot be processed. */
                @JvmField val SUSPECTED_FRAUD = of("suspected_fraud")

                /** The amount of activity on the card has exceeded the limit set by the issuer. */
                @JvmField val ACTIVITY_AMOUNT_LIMIT_EXCEEDED = of("activity_amount_limit_exceeded")

                /**
                 * The card has restrictions that prevent it from being used for this transaction.
                 */
                @JvmField val RESTRICTED_CARD = of("restricted_card")

                /**
                 * A security violation has occurred, preventing the transaction from being
                 * processed.
                 */
                @JvmField val SECURITY_VIOLATION = of("security_violation")

                /**
                 * The transaction does not meet the anti-money laundering requirements set by the
                 * issuer.
                 */
                @JvmField
                val TRANSACTION_DOES_NOT_FULFILL_ANTI_MONEY_LAUNDERING_REQUIREMENT =
                    of("transaction_does_not_fulfill_anti_money_laundering_requirement")

                /** The first use of the card has been blocked by the issuer. */
                @JvmField val BLOCKED_FIRST_USE = of("blocked_first_use")

                /** The credit issuer is currently unavailable to process the transaction. */
                @JvmField val CREDIT_ISSUER_UNAVAILABLE = of("credit_issuer_unavailable")

                /**
                 * The card verification value (CVV) results were negative, indicating a potential
                 * issue with the card.
                 */
                @JvmField
                val NEGATIVE_CARD_VERIFICATION_VALUE_RESULTS =
                    of("negative_card_verification_value_results")

                /** The issuer of the card is currently unavailable to process the transaction. */
                @JvmField val ISSUER_UNAVAILABLE = of("issuer_unavailable")

                /** The financial institution associated with the card could not be found. */
                @JvmField
                val FINANCIAL_INSTITUTION_CANNOT_BE_FOUND =
                    of("financial_institution_cannot_be_found")

                /** The transaction cannot be completed due to an unspecified reason. */
                @JvmField
                val TRANSACTION_CANNOT_BE_COMPLETED = of("transaction_cannot_be_completed")

                /**
                 * The transaction is a duplicate of a previous transaction and cannot be processed
                 * again.
                 */
                @JvmField val DUPLICATE_TRANSACTION = of("duplicate_transaction")

                /**
                 * A system malfunction occurred, preventing the transaction from being processed.
                 */
                @JvmField val SYSTEM_MALFUNCTION = of("system_malfunction")

                /** Additional customer authentication is required to complete the transaction. */
                @JvmField
                val ADDITIONAL_CUSTOMER_AUTHENTICATION_REQUIRED =
                    of("additional_customer_authentication_required")

                /**
                 * The surcharge amount applied to the transaction is not permitted by the issuer.
                 */
                @JvmField val SURCHARGE_AMOUNT_NOT_PERMITTED = of("surcharge_amount_not_permitted")

                /** The transaction was declined due to a failure in verifying the CVV2 code. */
                @JvmField val DECLINE_FOR_CVV2_FAILURE = of("decline_for_cvv2_failure")

                /** A stop payment order has been placed on this transaction. */
                @JvmField val STOP_PAYMENT_ORDER = of("stop_payment_order")

                /** An order has been placed to revoke authorization for this transaction. */
                @JvmField
                val REVOCATION_OF_AUTHORIZATION_ORDER = of("revocation_of_authorization_order")

                /** An order has been placed to revoke all authorizations for this cardholder. */
                @JvmField
                val REVOCATION_OF_ALL_AUTHORIZATIONS_ORDER =
                    of("revocation_of_all_authorizations_order")

                @JvmStatic fun of(value: String) = Reason(JsonField.of(value))
            }

            /** An enum containing [Reason]'s known values. */
            enum class Known {
                /**
                 * The card issuer has declined the transaction without providing a specific reason.
                 */
                DO_NOT_HONOR,
                /**
                 * The number of transactions for the card has exceeded the limit set by the issuer.
                 */
                ACTIVITY_COUNT_LIMIT_EXCEEDED,
                /**
                 * The card issuer requires the cardholder to contact them for further information
                 * regarding the transaction.
                 */
                REFER_TO_CARD_ISSUER,
                /**
                 * The card issuer requires the cardholder to contact them due to a special
                 * condition related to the transaction.
                 */
                REFER_TO_CARD_ISSUER_SPECIAL_CONDITION,
                /** The merchant is not valid for this transaction. */
                INVALID_MERCHANT,
                /** The card should be retained by the terminal. */
                PICK_UP_CARD,
                /** An error occurred during processing of the transaction. */
                ERROR,
                /** The card should be retained by the terminal due to a special condition. */
                PICK_UP_CARD_SPECIAL,
                /** The transaction is invalid and cannot be processed. */
                INVALID_TRANSACTION,
                /** The amount of the transaction is invalid. */
                INVALID_AMOUNT,
                /** The account number provided is invalid. */
                INVALID_ACCOUNT_NUMBER,
                /** The issuer of the card could not be found. */
                NO_SUCH_ISSUER,
                /** The transaction should be re-entered for processing. */
                RE_ENTER_TRANSACTION,
                /** There is no credit account associated with the card. */
                NO_CREDIT_ACCOUNT,
                /**
                 * The card should be retained by the terminal because it has been reported lost.
                 */
                PICK_UP_CARD_LOST,
                /**
                 * The card should be retained by the terminal because it has been reported stolen.
                 */
                PICK_UP_CARD_STOLEN,
                /** The account associated with the card has been closed. */
                CLOSED_ACCOUNT,
                /** There are insufficient funds in the account to complete the transaction. */
                INSUFFICIENT_FUNDS,
                /** There is no checking account associated with the card. */
                NO_CHECKING_ACCOUNT,
                /** There is no savings account associated with the card. */
                NO_SAVINGS_ACCOUNT,
                /** The card has expired and cannot be used for transactions. */
                EXPIRED_CARD,
                /** The transaction is not permitted for this cardholder. */
                TRANSACTION_NOT_PERMITTED_TO_CARDHOLDER,
                /** The transaction is not allowed at this terminal. */
                TRANSACTION_NOT_ALLOWED_AT_TERMINAL,
                /** The transaction has been flagged as suspected fraud and cannot be processed. */
                SUSPECTED_FRAUD,
                /** The amount of activity on the card has exceeded the limit set by the issuer. */
                ACTIVITY_AMOUNT_LIMIT_EXCEEDED,
                /**
                 * The card has restrictions that prevent it from being used for this transaction.
                 */
                RESTRICTED_CARD,
                /**
                 * A security violation has occurred, preventing the transaction from being
                 * processed.
                 */
                SECURITY_VIOLATION,
                /**
                 * The transaction does not meet the anti-money laundering requirements set by the
                 * issuer.
                 */
                TRANSACTION_DOES_NOT_FULFILL_ANTI_MONEY_LAUNDERING_REQUIREMENT,
                /** The first use of the card has been blocked by the issuer. */
                BLOCKED_FIRST_USE,
                /** The credit issuer is currently unavailable to process the transaction. */
                CREDIT_ISSUER_UNAVAILABLE,
                /**
                 * The card verification value (CVV) results were negative, indicating a potential
                 * issue with the card.
                 */
                NEGATIVE_CARD_VERIFICATION_VALUE_RESULTS,
                /** The issuer of the card is currently unavailable to process the transaction. */
                ISSUER_UNAVAILABLE,
                /** The financial institution associated with the card could not be found. */
                FINANCIAL_INSTITUTION_CANNOT_BE_FOUND,
                /** The transaction cannot be completed due to an unspecified reason. */
                TRANSACTION_CANNOT_BE_COMPLETED,
                /**
                 * The transaction is a duplicate of a previous transaction and cannot be processed
                 * again.
                 */
                DUPLICATE_TRANSACTION,
                /**
                 * A system malfunction occurred, preventing the transaction from being processed.
                 */
                SYSTEM_MALFUNCTION,
                /** Additional customer authentication is required to complete the transaction. */
                ADDITIONAL_CUSTOMER_AUTHENTICATION_REQUIRED,
                /**
                 * The surcharge amount applied to the transaction is not permitted by the issuer.
                 */
                SURCHARGE_AMOUNT_NOT_PERMITTED,
                /** The transaction was declined due to a failure in verifying the CVV2 code. */
                DECLINE_FOR_CVV2_FAILURE,
                /** A stop payment order has been placed on this transaction. */
                STOP_PAYMENT_ORDER,
                /** An order has been placed to revoke authorization for this transaction. */
                REVOCATION_OF_AUTHORIZATION_ORDER,
                /** An order has been placed to revoke all authorizations for this cardholder. */
                REVOCATION_OF_ALL_AUTHORIZATIONS_ORDER,
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
                /**
                 * The card issuer has declined the transaction without providing a specific reason.
                 */
                DO_NOT_HONOR,
                /**
                 * The number of transactions for the card has exceeded the limit set by the issuer.
                 */
                ACTIVITY_COUNT_LIMIT_EXCEEDED,
                /**
                 * The card issuer requires the cardholder to contact them for further information
                 * regarding the transaction.
                 */
                REFER_TO_CARD_ISSUER,
                /**
                 * The card issuer requires the cardholder to contact them due to a special
                 * condition related to the transaction.
                 */
                REFER_TO_CARD_ISSUER_SPECIAL_CONDITION,
                /** The merchant is not valid for this transaction. */
                INVALID_MERCHANT,
                /** The card should be retained by the terminal. */
                PICK_UP_CARD,
                /** An error occurred during processing of the transaction. */
                ERROR,
                /** The card should be retained by the terminal due to a special condition. */
                PICK_UP_CARD_SPECIAL,
                /** The transaction is invalid and cannot be processed. */
                INVALID_TRANSACTION,
                /** The amount of the transaction is invalid. */
                INVALID_AMOUNT,
                /** The account number provided is invalid. */
                INVALID_ACCOUNT_NUMBER,
                /** The issuer of the card could not be found. */
                NO_SUCH_ISSUER,
                /** The transaction should be re-entered for processing. */
                RE_ENTER_TRANSACTION,
                /** There is no credit account associated with the card. */
                NO_CREDIT_ACCOUNT,
                /**
                 * The card should be retained by the terminal because it has been reported lost.
                 */
                PICK_UP_CARD_LOST,
                /**
                 * The card should be retained by the terminal because it has been reported stolen.
                 */
                PICK_UP_CARD_STOLEN,
                /** The account associated with the card has been closed. */
                CLOSED_ACCOUNT,
                /** There are insufficient funds in the account to complete the transaction. */
                INSUFFICIENT_FUNDS,
                /** There is no checking account associated with the card. */
                NO_CHECKING_ACCOUNT,
                /** There is no savings account associated with the card. */
                NO_SAVINGS_ACCOUNT,
                /** The card has expired and cannot be used for transactions. */
                EXPIRED_CARD,
                /** The transaction is not permitted for this cardholder. */
                TRANSACTION_NOT_PERMITTED_TO_CARDHOLDER,
                /** The transaction is not allowed at this terminal. */
                TRANSACTION_NOT_ALLOWED_AT_TERMINAL,
                /** The transaction has been flagged as suspected fraud and cannot be processed. */
                SUSPECTED_FRAUD,
                /** The amount of activity on the card has exceeded the limit set by the issuer. */
                ACTIVITY_AMOUNT_LIMIT_EXCEEDED,
                /**
                 * The card has restrictions that prevent it from being used for this transaction.
                 */
                RESTRICTED_CARD,
                /**
                 * A security violation has occurred, preventing the transaction from being
                 * processed.
                 */
                SECURITY_VIOLATION,
                /**
                 * The transaction does not meet the anti-money laundering requirements set by the
                 * issuer.
                 */
                TRANSACTION_DOES_NOT_FULFILL_ANTI_MONEY_LAUNDERING_REQUIREMENT,
                /** The first use of the card has been blocked by the issuer. */
                BLOCKED_FIRST_USE,
                /** The credit issuer is currently unavailable to process the transaction. */
                CREDIT_ISSUER_UNAVAILABLE,
                /**
                 * The card verification value (CVV) results were negative, indicating a potential
                 * issue with the card.
                 */
                NEGATIVE_CARD_VERIFICATION_VALUE_RESULTS,
                /** The issuer of the card is currently unavailable to process the transaction. */
                ISSUER_UNAVAILABLE,
                /** The financial institution associated with the card could not be found. */
                FINANCIAL_INSTITUTION_CANNOT_BE_FOUND,
                /** The transaction cannot be completed due to an unspecified reason. */
                TRANSACTION_CANNOT_BE_COMPLETED,
                /**
                 * The transaction is a duplicate of a previous transaction and cannot be processed
                 * again.
                 */
                DUPLICATE_TRANSACTION,
                /**
                 * A system malfunction occurred, preventing the transaction from being processed.
                 */
                SYSTEM_MALFUNCTION,
                /** Additional customer authentication is required to complete the transaction. */
                ADDITIONAL_CUSTOMER_AUTHENTICATION_REQUIRED,
                /**
                 * The surcharge amount applied to the transaction is not permitted by the issuer.
                 */
                SURCHARGE_AMOUNT_NOT_PERMITTED,
                /** The transaction was declined due to a failure in verifying the CVV2 code. */
                DECLINE_FOR_CVV2_FAILURE,
                /** A stop payment order has been placed on this transaction. */
                STOP_PAYMENT_ORDER,
                /** An order has been placed to revoke authorization for this transaction. */
                REVOCATION_OF_AUTHORIZATION_ORDER,
                /** An order has been placed to revoke all authorizations for this cardholder. */
                REVOCATION_OF_ALL_AUTHORIZATIONS_ORDER,
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
                    DO_NOT_HONOR -> Value.DO_NOT_HONOR
                    ACTIVITY_COUNT_LIMIT_EXCEEDED -> Value.ACTIVITY_COUNT_LIMIT_EXCEEDED
                    REFER_TO_CARD_ISSUER -> Value.REFER_TO_CARD_ISSUER
                    REFER_TO_CARD_ISSUER_SPECIAL_CONDITION ->
                        Value.REFER_TO_CARD_ISSUER_SPECIAL_CONDITION
                    INVALID_MERCHANT -> Value.INVALID_MERCHANT
                    PICK_UP_CARD -> Value.PICK_UP_CARD
                    ERROR -> Value.ERROR
                    PICK_UP_CARD_SPECIAL -> Value.PICK_UP_CARD_SPECIAL
                    INVALID_TRANSACTION -> Value.INVALID_TRANSACTION
                    INVALID_AMOUNT -> Value.INVALID_AMOUNT
                    INVALID_ACCOUNT_NUMBER -> Value.INVALID_ACCOUNT_NUMBER
                    NO_SUCH_ISSUER -> Value.NO_SUCH_ISSUER
                    RE_ENTER_TRANSACTION -> Value.RE_ENTER_TRANSACTION
                    NO_CREDIT_ACCOUNT -> Value.NO_CREDIT_ACCOUNT
                    PICK_UP_CARD_LOST -> Value.PICK_UP_CARD_LOST
                    PICK_UP_CARD_STOLEN -> Value.PICK_UP_CARD_STOLEN
                    CLOSED_ACCOUNT -> Value.CLOSED_ACCOUNT
                    INSUFFICIENT_FUNDS -> Value.INSUFFICIENT_FUNDS
                    NO_CHECKING_ACCOUNT -> Value.NO_CHECKING_ACCOUNT
                    NO_SAVINGS_ACCOUNT -> Value.NO_SAVINGS_ACCOUNT
                    EXPIRED_CARD -> Value.EXPIRED_CARD
                    TRANSACTION_NOT_PERMITTED_TO_CARDHOLDER ->
                        Value.TRANSACTION_NOT_PERMITTED_TO_CARDHOLDER
                    TRANSACTION_NOT_ALLOWED_AT_TERMINAL -> Value.TRANSACTION_NOT_ALLOWED_AT_TERMINAL
                    SUSPECTED_FRAUD -> Value.SUSPECTED_FRAUD
                    ACTIVITY_AMOUNT_LIMIT_EXCEEDED -> Value.ACTIVITY_AMOUNT_LIMIT_EXCEEDED
                    RESTRICTED_CARD -> Value.RESTRICTED_CARD
                    SECURITY_VIOLATION -> Value.SECURITY_VIOLATION
                    TRANSACTION_DOES_NOT_FULFILL_ANTI_MONEY_LAUNDERING_REQUIREMENT ->
                        Value.TRANSACTION_DOES_NOT_FULFILL_ANTI_MONEY_LAUNDERING_REQUIREMENT
                    BLOCKED_FIRST_USE -> Value.BLOCKED_FIRST_USE
                    CREDIT_ISSUER_UNAVAILABLE -> Value.CREDIT_ISSUER_UNAVAILABLE
                    NEGATIVE_CARD_VERIFICATION_VALUE_RESULTS ->
                        Value.NEGATIVE_CARD_VERIFICATION_VALUE_RESULTS
                    ISSUER_UNAVAILABLE -> Value.ISSUER_UNAVAILABLE
                    FINANCIAL_INSTITUTION_CANNOT_BE_FOUND ->
                        Value.FINANCIAL_INSTITUTION_CANNOT_BE_FOUND
                    TRANSACTION_CANNOT_BE_COMPLETED -> Value.TRANSACTION_CANNOT_BE_COMPLETED
                    DUPLICATE_TRANSACTION -> Value.DUPLICATE_TRANSACTION
                    SYSTEM_MALFUNCTION -> Value.SYSTEM_MALFUNCTION
                    ADDITIONAL_CUSTOMER_AUTHENTICATION_REQUIRED ->
                        Value.ADDITIONAL_CUSTOMER_AUTHENTICATION_REQUIRED
                    SURCHARGE_AMOUNT_NOT_PERMITTED -> Value.SURCHARGE_AMOUNT_NOT_PERMITTED
                    DECLINE_FOR_CVV2_FAILURE -> Value.DECLINE_FOR_CVV2_FAILURE
                    STOP_PAYMENT_ORDER -> Value.STOP_PAYMENT_ORDER
                    REVOCATION_OF_AUTHORIZATION_ORDER -> Value.REVOCATION_OF_AUTHORIZATION_ORDER
                    REVOCATION_OF_ALL_AUTHORIZATIONS_ORDER ->
                        Value.REVOCATION_OF_ALL_AUTHORIZATIONS_ORDER
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
                    DO_NOT_HONOR -> Known.DO_NOT_HONOR
                    ACTIVITY_COUNT_LIMIT_EXCEEDED -> Known.ACTIVITY_COUNT_LIMIT_EXCEEDED
                    REFER_TO_CARD_ISSUER -> Known.REFER_TO_CARD_ISSUER
                    REFER_TO_CARD_ISSUER_SPECIAL_CONDITION ->
                        Known.REFER_TO_CARD_ISSUER_SPECIAL_CONDITION
                    INVALID_MERCHANT -> Known.INVALID_MERCHANT
                    PICK_UP_CARD -> Known.PICK_UP_CARD
                    ERROR -> Known.ERROR
                    PICK_UP_CARD_SPECIAL -> Known.PICK_UP_CARD_SPECIAL
                    INVALID_TRANSACTION -> Known.INVALID_TRANSACTION
                    INVALID_AMOUNT -> Known.INVALID_AMOUNT
                    INVALID_ACCOUNT_NUMBER -> Known.INVALID_ACCOUNT_NUMBER
                    NO_SUCH_ISSUER -> Known.NO_SUCH_ISSUER
                    RE_ENTER_TRANSACTION -> Known.RE_ENTER_TRANSACTION
                    NO_CREDIT_ACCOUNT -> Known.NO_CREDIT_ACCOUNT
                    PICK_UP_CARD_LOST -> Known.PICK_UP_CARD_LOST
                    PICK_UP_CARD_STOLEN -> Known.PICK_UP_CARD_STOLEN
                    CLOSED_ACCOUNT -> Known.CLOSED_ACCOUNT
                    INSUFFICIENT_FUNDS -> Known.INSUFFICIENT_FUNDS
                    NO_CHECKING_ACCOUNT -> Known.NO_CHECKING_ACCOUNT
                    NO_SAVINGS_ACCOUNT -> Known.NO_SAVINGS_ACCOUNT
                    EXPIRED_CARD -> Known.EXPIRED_CARD
                    TRANSACTION_NOT_PERMITTED_TO_CARDHOLDER ->
                        Known.TRANSACTION_NOT_PERMITTED_TO_CARDHOLDER
                    TRANSACTION_NOT_ALLOWED_AT_TERMINAL -> Known.TRANSACTION_NOT_ALLOWED_AT_TERMINAL
                    SUSPECTED_FRAUD -> Known.SUSPECTED_FRAUD
                    ACTIVITY_AMOUNT_LIMIT_EXCEEDED -> Known.ACTIVITY_AMOUNT_LIMIT_EXCEEDED
                    RESTRICTED_CARD -> Known.RESTRICTED_CARD
                    SECURITY_VIOLATION -> Known.SECURITY_VIOLATION
                    TRANSACTION_DOES_NOT_FULFILL_ANTI_MONEY_LAUNDERING_REQUIREMENT ->
                        Known.TRANSACTION_DOES_NOT_FULFILL_ANTI_MONEY_LAUNDERING_REQUIREMENT
                    BLOCKED_FIRST_USE -> Known.BLOCKED_FIRST_USE
                    CREDIT_ISSUER_UNAVAILABLE -> Known.CREDIT_ISSUER_UNAVAILABLE
                    NEGATIVE_CARD_VERIFICATION_VALUE_RESULTS ->
                        Known.NEGATIVE_CARD_VERIFICATION_VALUE_RESULTS
                    ISSUER_UNAVAILABLE -> Known.ISSUER_UNAVAILABLE
                    FINANCIAL_INSTITUTION_CANNOT_BE_FOUND ->
                        Known.FINANCIAL_INSTITUTION_CANNOT_BE_FOUND
                    TRANSACTION_CANNOT_BE_COMPLETED -> Known.TRANSACTION_CANNOT_BE_COMPLETED
                    DUPLICATE_TRANSACTION -> Known.DUPLICATE_TRANSACTION
                    SYSTEM_MALFUNCTION -> Known.SYSTEM_MALFUNCTION
                    ADDITIONAL_CUSTOMER_AUTHENTICATION_REQUIRED ->
                        Known.ADDITIONAL_CUSTOMER_AUTHENTICATION_REQUIRED
                    SURCHARGE_AMOUNT_NOT_PERMITTED -> Known.SURCHARGE_AMOUNT_NOT_PERMITTED
                    DECLINE_FOR_CVV2_FAILURE -> Known.DECLINE_FOR_CVV2_FAILURE
                    STOP_PAYMENT_ORDER -> Known.STOP_PAYMENT_ORDER
                    REVOCATION_OF_AUTHORIZATION_ORDER -> Known.REVOCATION_OF_AUTHORIZATION_ORDER
                    REVOCATION_OF_ALL_AUTHORIZATIONS_ORDER ->
                        Known.REVOCATION_OF_ALL_AUTHORIZATIONS_ORDER
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

            return other is Decline &&
                declinedAt == other.declinedAt &&
                networkTransactionIdentifier == other.networkTransactionIdentifier &&
                reason == other.reason &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(declinedAt, networkTransactionIdentifier, reason, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Decline{declinedAt=$declinedAt, networkTransactionIdentifier=$networkTransactionIdentifier, reason=$reason, additionalProperties=$additionalProperties}"
    }

    /** The lifecycle status of the validation. */
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

            /** The validation requires attention from an Increase operator. */
            @JvmField val REQUIRES_ATTENTION = of("requires_attention")

            /** The validation is queued to be submitted to the card network. */
            @JvmField val PENDING_SUBMISSION = of("pending_submission")

            /**
             * The validation has been submitted and is pending a response from the card network.
             */
            @JvmField val SUBMITTED = of("submitted")

            /** The validation has been sent successfully and is complete. */
            @JvmField val COMPLETE = of("complete")

            /** The validation was declined by the network or the recipient's bank. */
            @JvmField val DECLINED = of("declined")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            /** The validation requires attention from an Increase operator. */
            REQUIRES_ATTENTION,
            /** The validation is queued to be submitted to the card network. */
            PENDING_SUBMISSION,
            /**
             * The validation has been submitted and is pending a response from the card network.
             */
            SUBMITTED,
            /** The validation has been sent successfully and is complete. */
            COMPLETE,
            /** The validation was declined by the network or the recipient's bank. */
            DECLINED,
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
            /** The validation requires attention from an Increase operator. */
            REQUIRES_ATTENTION,
            /** The validation is queued to be submitted to the card network. */
            PENDING_SUBMISSION,
            /**
             * The validation has been submitted and is pending a response from the card network.
             */
            SUBMITTED,
            /** The validation has been sent successfully and is complete. */
            COMPLETE,
            /** The validation was declined by the network or the recipient's bank. */
            DECLINED,
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
                REQUIRES_ATTENTION -> Value.REQUIRES_ATTENTION
                PENDING_SUBMISSION -> Value.PENDING_SUBMISSION
                SUBMITTED -> Value.SUBMITTED
                COMPLETE -> Value.COMPLETE
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
                REQUIRES_ATTENTION -> Known.REQUIRES_ATTENTION
                PENDING_SUBMISSION -> Known.PENDING_SUBMISSION
                SUBMITTED -> Known.SUBMITTED
                COMPLETE -> Known.COMPLETE
                DECLINED -> Known.DECLINED
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
     * After the validation is submitted to the card network, this will contain supplemental
     * details.
     */
    class Submission
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val retrievalReferenceNumber: JsonField<String>,
        private val submittedAt: JsonField<OffsetDateTime>,
        private val traceNumber: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("retrieval_reference_number")
            @ExcludeMissing
            retrievalReferenceNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("submitted_at")
            @ExcludeMissing
            submittedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("trace_number")
            @ExcludeMissing
            traceNumber: JsonField<String> = JsonMissing.of(),
        ) : this(retrievalReferenceNumber, submittedAt, traceNumber, mutableMapOf())

        /**
         * A 12-digit retrieval reference number that identifies the validation. Usually a
         * combination of a timestamp and the trace number.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun retrievalReferenceNumber(): String =
            retrievalReferenceNumber.getRequired("retrieval_reference_number")

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
         * validation was submitted to the card network.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun submittedAt(): OffsetDateTime = submittedAt.getRequired("submitted_at")

        /**
         * A 6-digit trace number that identifies the validation within a short time window.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun traceNumber(): String = traceNumber.getRequired("trace_number")

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
         * Returns the raw JSON value of [submittedAt].
         *
         * Unlike [submittedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("submitted_at")
        @ExcludeMissing
        fun _submittedAt(): JsonField<OffsetDateTime> = submittedAt

        /**
         * Returns the raw JSON value of [traceNumber].
         *
         * Unlike [traceNumber], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("trace_number")
        @ExcludeMissing
        fun _traceNumber(): JsonField<String> = traceNumber

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
             * Returns a mutable builder for constructing an instance of [Submission].
             *
             * The following fields are required:
             * ```java
             * .retrievalReferenceNumber()
             * .submittedAt()
             * .traceNumber()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Submission]. */
        class Builder internal constructor() {

            private var retrievalReferenceNumber: JsonField<String>? = null
            private var submittedAt: JsonField<OffsetDateTime>? = null
            private var traceNumber: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(submission: Submission) = apply {
                retrievalReferenceNumber = submission.retrievalReferenceNumber
                submittedAt = submission.submittedAt
                traceNumber = submission.traceNumber
                additionalProperties = submission.additionalProperties.toMutableMap()
            }

            /**
             * A 12-digit retrieval reference number that identifies the validation. Usually a
             * combination of a timestamp and the trace number.
             */
            fun retrievalReferenceNumber(retrievalReferenceNumber: String) =
                retrievalReferenceNumber(JsonField.of(retrievalReferenceNumber))

            /**
             * Sets [Builder.retrievalReferenceNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.retrievalReferenceNumber] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun retrievalReferenceNumber(retrievalReferenceNumber: JsonField<String>) = apply {
                this.retrievalReferenceNumber = retrievalReferenceNumber
            }

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * validation was submitted to the card network.
             */
            fun submittedAt(submittedAt: OffsetDateTime) = submittedAt(JsonField.of(submittedAt))

            /**
             * Sets [Builder.submittedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.submittedAt] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun submittedAt(submittedAt: JsonField<OffsetDateTime>) = apply {
                this.submittedAt = submittedAt
            }

            /** A 6-digit trace number that identifies the validation within a short time window. */
            fun traceNumber(traceNumber: String) = traceNumber(JsonField.of(traceNumber))

            /**
             * Sets [Builder.traceNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.traceNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun traceNumber(traceNumber: JsonField<String>) = apply {
                this.traceNumber = traceNumber
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
             * Returns an immutable instance of [Submission].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .retrievalReferenceNumber()
             * .submittedAt()
             * .traceNumber()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Submission =
                Submission(
                    checkRequired("retrievalReferenceNumber", retrievalReferenceNumber),
                    checkRequired("submittedAt", submittedAt),
                    checkRequired("traceNumber", traceNumber),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Submission = apply {
            if (validated) {
                return@apply
            }

            retrievalReferenceNumber()
            submittedAt()
            traceNumber()
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
            (if (retrievalReferenceNumber.asKnown().isPresent) 1 else 0) +
                (if (submittedAt.asKnown().isPresent) 1 else 0) +
                (if (traceNumber.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Submission &&
                retrievalReferenceNumber == other.retrievalReferenceNumber &&
                submittedAt == other.submittedAt &&
                traceNumber == other.traceNumber &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(retrievalReferenceNumber, submittedAt, traceNumber, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Submission{retrievalReferenceNumber=$retrievalReferenceNumber, submittedAt=$submittedAt, traceNumber=$traceNumber, additionalProperties=$additionalProperties}"
    }

    /**
     * A constant representing the object's type. For this resource it will always be
     * `card_validation`.
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

            @JvmField val CARD_VALIDATION = of("card_validation")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            CARD_VALIDATION
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
            CARD_VALIDATION,
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
                CARD_VALIDATION -> Value.CARD_VALIDATION
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
                CARD_VALIDATION -> Known.CARD_VALIDATION
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

        return other is CardValidation &&
            id == other.id &&
            acceptance == other.acceptance &&
            accountId == other.accountId &&
            cardTokenId == other.cardTokenId &&
            cardholderFirstName == other.cardholderFirstName &&
            cardholderLastName == other.cardholderLastName &&
            cardholderMiddleName == other.cardholderMiddleName &&
            cardholderPostalCode == other.cardholderPostalCode &&
            cardholderStreetAddress == other.cardholderStreetAddress &&
            createdAt == other.createdAt &&
            createdBy == other.createdBy &&
            decline == other.decline &&
            idempotencyKey == other.idempotencyKey &&
            merchantCategoryCode == other.merchantCategoryCode &&
            merchantCityName == other.merchantCityName &&
            merchantName == other.merchantName &&
            merchantPostalCode == other.merchantPostalCode &&
            merchantState == other.merchantState &&
            status == other.status &&
            submission == other.submission &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            acceptance,
            accountId,
            cardTokenId,
            cardholderFirstName,
            cardholderLastName,
            cardholderMiddleName,
            cardholderPostalCode,
            cardholderStreetAddress,
            createdAt,
            createdBy,
            decline,
            idempotencyKey,
            merchantCategoryCode,
            merchantCityName,
            merchantName,
            merchantPostalCode,
            merchantState,
            status,
            submission,
            type,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CardValidation{id=$id, acceptance=$acceptance, accountId=$accountId, cardTokenId=$cardTokenId, cardholderFirstName=$cardholderFirstName, cardholderLastName=$cardholderLastName, cardholderMiddleName=$cardholderMiddleName, cardholderPostalCode=$cardholderPostalCode, cardholderStreetAddress=$cardholderStreetAddress, createdAt=$createdAt, createdBy=$createdBy, decline=$decline, idempotencyKey=$idempotencyKey, merchantCategoryCode=$merchantCategoryCode, merchantCityName=$merchantCityName, merchantName=$merchantName, merchantPostalCode=$merchantPostalCode, merchantState=$merchantState, status=$status, submission=$submission, type=$type, additionalProperties=$additionalProperties}"
}
