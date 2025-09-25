// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.cardvalidations

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
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

/** Create a Card Validation */
class CardValidationCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The identifier of the Account from which to send the validation.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountId(): String = body.accountId()

    /**
     * The Increase identifier for the Card Token that represents the card number you're validating.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun cardTokenId(): String = body.cardTokenId()

    /**
     * A four-digit code (MCC) identifying the type of business or service provided by the merchant.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun merchantCategoryCode(): String = body.merchantCategoryCode()

    /**
     * The city where the merchant (typically your business) is located.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun merchantCityName(): String = body.merchantCityName()

    /**
     * The merchant name that will appear in the cardholder’s statement descriptor. Typically your
     * business name.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun merchantName(): String = body.merchantName()

    /**
     * The postal code for the merchant’s (typically your business’s) location.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun merchantPostalCode(): String = body.merchantPostalCode()

    /**
     * The U.S. state where the merchant (typically your business) is located.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun merchantState(): String = body.merchantState()

    /**
     * The cardholder's first name.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cardholderFirstName(): Optional<String> = body.cardholderFirstName()

    /**
     * The cardholder's last name.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cardholderLastName(): Optional<String> = body.cardholderLastName()

    /**
     * The cardholder's middle name.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cardholderMiddleName(): Optional<String> = body.cardholderMiddleName()

    /**
     * The postal code of the cardholder's address.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cardholderPostalCode(): Optional<String> = body.cardholderPostalCode()

    /**
     * The cardholder's street address.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cardholderStreetAddress(): Optional<String> = body.cardholderStreetAddress()

    /**
     * Returns the raw JSON value of [accountId].
     *
     * Unlike [accountId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _accountId(): JsonField<String> = body._accountId()

    /**
     * Returns the raw JSON value of [cardTokenId].
     *
     * Unlike [cardTokenId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _cardTokenId(): JsonField<String> = body._cardTokenId()

    /**
     * Returns the raw JSON value of [merchantCategoryCode].
     *
     * Unlike [merchantCategoryCode], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _merchantCategoryCode(): JsonField<String> = body._merchantCategoryCode()

    /**
     * Returns the raw JSON value of [merchantCityName].
     *
     * Unlike [merchantCityName], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _merchantCityName(): JsonField<String> = body._merchantCityName()

    /**
     * Returns the raw JSON value of [merchantName].
     *
     * Unlike [merchantName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _merchantName(): JsonField<String> = body._merchantName()

    /**
     * Returns the raw JSON value of [merchantPostalCode].
     *
     * Unlike [merchantPostalCode], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _merchantPostalCode(): JsonField<String> = body._merchantPostalCode()

    /**
     * Returns the raw JSON value of [merchantState].
     *
     * Unlike [merchantState], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _merchantState(): JsonField<String> = body._merchantState()

    /**
     * Returns the raw JSON value of [cardholderFirstName].
     *
     * Unlike [cardholderFirstName], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _cardholderFirstName(): JsonField<String> = body._cardholderFirstName()

    /**
     * Returns the raw JSON value of [cardholderLastName].
     *
     * Unlike [cardholderLastName], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _cardholderLastName(): JsonField<String> = body._cardholderLastName()

    /**
     * Returns the raw JSON value of [cardholderMiddleName].
     *
     * Unlike [cardholderMiddleName], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _cardholderMiddleName(): JsonField<String> = body._cardholderMiddleName()

    /**
     * Returns the raw JSON value of [cardholderPostalCode].
     *
     * Unlike [cardholderPostalCode], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _cardholderPostalCode(): JsonField<String> = body._cardholderPostalCode()

    /**
     * Returns the raw JSON value of [cardholderStreetAddress].
     *
     * Unlike [cardholderStreetAddress], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _cardholderStreetAddress(): JsonField<String> = body._cardholderStreetAddress()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CardValidationCreateParams].
         *
         * The following fields are required:
         * ```java
         * .accountId()
         * .cardTokenId()
         * .merchantCategoryCode()
         * .merchantCityName()
         * .merchantName()
         * .merchantPostalCode()
         * .merchantState()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CardValidationCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(cardValidationCreateParams: CardValidationCreateParams) = apply {
            body = cardValidationCreateParams.body.toBuilder()
            additionalHeaders = cardValidationCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = cardValidationCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [accountId]
         * - [cardTokenId]
         * - [merchantCategoryCode]
         * - [merchantCityName]
         * - [merchantName]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The identifier of the Account from which to send the validation. */
        fun accountId(accountId: String) = apply { body.accountId(accountId) }

        /**
         * Sets [Builder.accountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accountId(accountId: JsonField<String>) = apply { body.accountId(accountId) }

        /**
         * The Increase identifier for the Card Token that represents the card number you're
         * validating.
         */
        fun cardTokenId(cardTokenId: String) = apply { body.cardTokenId(cardTokenId) }

        /**
         * Sets [Builder.cardTokenId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cardTokenId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun cardTokenId(cardTokenId: JsonField<String>) = apply { body.cardTokenId(cardTokenId) }

        /**
         * A four-digit code (MCC) identifying the type of business or service provided by the
         * merchant.
         */
        fun merchantCategoryCode(merchantCategoryCode: String) = apply {
            body.merchantCategoryCode(merchantCategoryCode)
        }

        /**
         * Sets [Builder.merchantCategoryCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.merchantCategoryCode] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun merchantCategoryCode(merchantCategoryCode: JsonField<String>) = apply {
            body.merchantCategoryCode(merchantCategoryCode)
        }

        /** The city where the merchant (typically your business) is located. */
        fun merchantCityName(merchantCityName: String) = apply {
            body.merchantCityName(merchantCityName)
        }

        /**
         * Sets [Builder.merchantCityName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.merchantCityName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun merchantCityName(merchantCityName: JsonField<String>) = apply {
            body.merchantCityName(merchantCityName)
        }

        /**
         * The merchant name that will appear in the cardholder’s statement descriptor. Typically
         * your business name.
         */
        fun merchantName(merchantName: String) = apply { body.merchantName(merchantName) }

        /**
         * Sets [Builder.merchantName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.merchantName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun merchantName(merchantName: JsonField<String>) = apply {
            body.merchantName(merchantName)
        }

        /** The postal code for the merchant’s (typically your business’s) location. */
        fun merchantPostalCode(merchantPostalCode: String) = apply {
            body.merchantPostalCode(merchantPostalCode)
        }

        /**
         * Sets [Builder.merchantPostalCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.merchantPostalCode] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun merchantPostalCode(merchantPostalCode: JsonField<String>) = apply {
            body.merchantPostalCode(merchantPostalCode)
        }

        /** The U.S. state where the merchant (typically your business) is located. */
        fun merchantState(merchantState: String) = apply { body.merchantState(merchantState) }

        /**
         * Sets [Builder.merchantState] to an arbitrary JSON value.
         *
         * You should usually call [Builder.merchantState] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun merchantState(merchantState: JsonField<String>) = apply {
            body.merchantState(merchantState)
        }

        /** The cardholder's first name. */
        fun cardholderFirstName(cardholderFirstName: String) = apply {
            body.cardholderFirstName(cardholderFirstName)
        }

        /**
         * Sets [Builder.cardholderFirstName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cardholderFirstName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun cardholderFirstName(cardholderFirstName: JsonField<String>) = apply {
            body.cardholderFirstName(cardholderFirstName)
        }

        /** The cardholder's last name. */
        fun cardholderLastName(cardholderLastName: String) = apply {
            body.cardholderLastName(cardholderLastName)
        }

        /**
         * Sets [Builder.cardholderLastName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cardholderLastName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun cardholderLastName(cardholderLastName: JsonField<String>) = apply {
            body.cardholderLastName(cardholderLastName)
        }

        /** The cardholder's middle name. */
        fun cardholderMiddleName(cardholderMiddleName: String) = apply {
            body.cardholderMiddleName(cardholderMiddleName)
        }

        /**
         * Sets [Builder.cardholderMiddleName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cardholderMiddleName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun cardholderMiddleName(cardholderMiddleName: JsonField<String>) = apply {
            body.cardholderMiddleName(cardholderMiddleName)
        }

        /** The postal code of the cardholder's address. */
        fun cardholderPostalCode(cardholderPostalCode: String) = apply {
            body.cardholderPostalCode(cardholderPostalCode)
        }

        /**
         * Sets [Builder.cardholderPostalCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cardholderPostalCode] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun cardholderPostalCode(cardholderPostalCode: JsonField<String>) = apply {
            body.cardholderPostalCode(cardholderPostalCode)
        }

        /** The cardholder's street address. */
        fun cardholderStreetAddress(cardholderStreetAddress: String) = apply {
            body.cardholderStreetAddress(cardholderStreetAddress)
        }

        /**
         * Sets [Builder.cardholderStreetAddress] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cardholderStreetAddress] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun cardholderStreetAddress(cardholderStreetAddress: JsonField<String>) = apply {
            body.cardholderStreetAddress(cardholderStreetAddress)
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
         * Returns an immutable instance of [CardValidationCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .accountId()
         * .cardTokenId()
         * .merchantCategoryCode()
         * .merchantCityName()
         * .merchantName()
         * .merchantPostalCode()
         * .merchantState()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CardValidationCreateParams =
            CardValidationCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val accountId: JsonField<String>,
        private val cardTokenId: JsonField<String>,
        private val merchantCategoryCode: JsonField<String>,
        private val merchantCityName: JsonField<String>,
        private val merchantName: JsonField<String>,
        private val merchantPostalCode: JsonField<String>,
        private val merchantState: JsonField<String>,
        private val cardholderFirstName: JsonField<String>,
        private val cardholderLastName: JsonField<String>,
        private val cardholderMiddleName: JsonField<String>,
        private val cardholderPostalCode: JsonField<String>,
        private val cardholderStreetAddress: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("account_id")
            @ExcludeMissing
            accountId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("card_token_id")
            @ExcludeMissing
            cardTokenId: JsonField<String> = JsonMissing.of(),
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
        ) : this(
            accountId,
            cardTokenId,
            merchantCategoryCode,
            merchantCityName,
            merchantName,
            merchantPostalCode,
            merchantState,
            cardholderFirstName,
            cardholderLastName,
            cardholderMiddleName,
            cardholderPostalCode,
            cardholderStreetAddress,
            mutableMapOf(),
        )

        /**
         * The identifier of the Account from which to send the validation.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun accountId(): String = accountId.getRequired("account_id")

        /**
         * The Increase identifier for the Card Token that represents the card number you're
         * validating.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun cardTokenId(): String = cardTokenId.getRequired("card_token_id")

        /**
         * A four-digit code (MCC) identifying the type of business or service provided by the
         * merchant.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun merchantCategoryCode(): String =
            merchantCategoryCode.getRequired("merchant_category_code")

        /**
         * The city where the merchant (typically your business) is located.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun merchantCityName(): String = merchantCityName.getRequired("merchant_city_name")

        /**
         * The merchant name that will appear in the cardholder’s statement descriptor. Typically
         * your business name.
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
         * The cardholder's first name.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun cardholderFirstName(): Optional<String> =
            cardholderFirstName.getOptional("cardholder_first_name")

        /**
         * The cardholder's last name.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun cardholderLastName(): Optional<String> =
            cardholderLastName.getOptional("cardholder_last_name")

        /**
         * The cardholder's middle name.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun cardholderMiddleName(): Optional<String> =
            cardholderMiddleName.getOptional("cardholder_middle_name")

        /**
         * The postal code of the cardholder's address.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun cardholderPostalCode(): Optional<String> =
            cardholderPostalCode.getOptional("cardholder_postal_code")

        /**
         * The cardholder's street address.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun cardholderStreetAddress(): Optional<String> =
            cardholderStreetAddress.getOptional("cardholder_street_address")

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
         * Returns the raw JSON value of [merchantCategoryCode].
         *
         * Unlike [merchantCategoryCode], this method doesn't throw if the JSON field has an
         * unexpected type.
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
         * Unlike [merchantName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("merchant_name")
        @ExcludeMissing
        fun _merchantName(): JsonField<String> = merchantName

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
         * Returns the raw JSON value of [cardholderFirstName].
         *
         * Unlike [cardholderFirstName], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("cardholder_first_name")
        @ExcludeMissing
        fun _cardholderFirstName(): JsonField<String> = cardholderFirstName

        /**
         * Returns the raw JSON value of [cardholderLastName].
         *
         * Unlike [cardholderLastName], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("cardholder_last_name")
        @ExcludeMissing
        fun _cardholderLastName(): JsonField<String> = cardholderLastName

        /**
         * Returns the raw JSON value of [cardholderMiddleName].
         *
         * Unlike [cardholderMiddleName], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("cardholder_middle_name")
        @ExcludeMissing
        fun _cardholderMiddleName(): JsonField<String> = cardholderMiddleName

        /**
         * Returns the raw JSON value of [cardholderPostalCode].
         *
         * Unlike [cardholderPostalCode], this method doesn't throw if the JSON field has an
         * unexpected type.
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
             * .cardTokenId()
             * .merchantCategoryCode()
             * .merchantCityName()
             * .merchantName()
             * .merchantPostalCode()
             * .merchantState()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var accountId: JsonField<String>? = null
            private var cardTokenId: JsonField<String>? = null
            private var merchantCategoryCode: JsonField<String>? = null
            private var merchantCityName: JsonField<String>? = null
            private var merchantName: JsonField<String>? = null
            private var merchantPostalCode: JsonField<String>? = null
            private var merchantState: JsonField<String>? = null
            private var cardholderFirstName: JsonField<String> = JsonMissing.of()
            private var cardholderLastName: JsonField<String> = JsonMissing.of()
            private var cardholderMiddleName: JsonField<String> = JsonMissing.of()
            private var cardholderPostalCode: JsonField<String> = JsonMissing.of()
            private var cardholderStreetAddress: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                accountId = body.accountId
                cardTokenId = body.cardTokenId
                merchantCategoryCode = body.merchantCategoryCode
                merchantCityName = body.merchantCityName
                merchantName = body.merchantName
                merchantPostalCode = body.merchantPostalCode
                merchantState = body.merchantState
                cardholderFirstName = body.cardholderFirstName
                cardholderLastName = body.cardholderLastName
                cardholderMiddleName = body.cardholderMiddleName
                cardholderPostalCode = body.cardholderPostalCode
                cardholderStreetAddress = body.cardholderStreetAddress
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The identifier of the Account from which to send the validation. */
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
             * The Increase identifier for the Card Token that represents the card number you're
             * validating.
             */
            fun cardTokenId(cardTokenId: String) = cardTokenId(JsonField.of(cardTokenId))

            /**
             * Sets [Builder.cardTokenId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cardTokenId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cardTokenId(cardTokenId: JsonField<String>) = apply {
                this.cardTokenId = cardTokenId
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
             * You should usually call [Builder.merchantCategoryCode] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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
             * The merchant name that will appear in the cardholder’s statement descriptor.
             * Typically your business name.
             */
            fun merchantName(merchantName: String) = merchantName(JsonField.of(merchantName))

            /**
             * Sets [Builder.merchantName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.merchantName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * You should usually call [Builder.merchantState] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun merchantState(merchantState: JsonField<String>) = apply {
                this.merchantState = merchantState
            }

            /** The cardholder's first name. */
            fun cardholderFirstName(cardholderFirstName: String) =
                cardholderFirstName(JsonField.of(cardholderFirstName))

            /**
             * Sets [Builder.cardholderFirstName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cardholderFirstName] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun cardholderFirstName(cardholderFirstName: JsonField<String>) = apply {
                this.cardholderFirstName = cardholderFirstName
            }

            /** The cardholder's last name. */
            fun cardholderLastName(cardholderLastName: String) =
                cardholderLastName(JsonField.of(cardholderLastName))

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
            fun cardholderMiddleName(cardholderMiddleName: String) =
                cardholderMiddleName(JsonField.of(cardholderMiddleName))

            /**
             * Sets [Builder.cardholderMiddleName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cardholderMiddleName] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun cardholderMiddleName(cardholderMiddleName: JsonField<String>) = apply {
                this.cardholderMiddleName = cardholderMiddleName
            }

            /** The postal code of the cardholder's address. */
            fun cardholderPostalCode(cardholderPostalCode: String) =
                cardholderPostalCode(JsonField.of(cardholderPostalCode))

            /**
             * Sets [Builder.cardholderPostalCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cardholderPostalCode] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun cardholderPostalCode(cardholderPostalCode: JsonField<String>) = apply {
                this.cardholderPostalCode = cardholderPostalCode
            }

            /** The cardholder's street address. */
            fun cardholderStreetAddress(cardholderStreetAddress: String) =
                cardholderStreetAddress(JsonField.of(cardholderStreetAddress))

            /**
             * Sets [Builder.cardholderStreetAddress] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cardholderStreetAddress] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun cardholderStreetAddress(cardholderStreetAddress: JsonField<String>) = apply {
                this.cardholderStreetAddress = cardholderStreetAddress
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
             *
             * The following fields are required:
             * ```java
             * .accountId()
             * .cardTokenId()
             * .merchantCategoryCode()
             * .merchantCityName()
             * .merchantName()
             * .merchantPostalCode()
             * .merchantState()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("accountId", accountId),
                    checkRequired("cardTokenId", cardTokenId),
                    checkRequired("merchantCategoryCode", merchantCategoryCode),
                    checkRequired("merchantCityName", merchantCityName),
                    checkRequired("merchantName", merchantName),
                    checkRequired("merchantPostalCode", merchantPostalCode),
                    checkRequired("merchantState", merchantState),
                    cardholderFirstName,
                    cardholderLastName,
                    cardholderMiddleName,
                    cardholderPostalCode,
                    cardholderStreetAddress,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            accountId()
            cardTokenId()
            merchantCategoryCode()
            merchantCityName()
            merchantName()
            merchantPostalCode()
            merchantState()
            cardholderFirstName()
            cardholderLastName()
            cardholderMiddleName()
            cardholderPostalCode()
            cardholderStreetAddress()
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
                (if (cardTokenId.asKnown().isPresent) 1 else 0) +
                (if (merchantCategoryCode.asKnown().isPresent) 1 else 0) +
                (if (merchantCityName.asKnown().isPresent) 1 else 0) +
                (if (merchantName.asKnown().isPresent) 1 else 0) +
                (if (merchantPostalCode.asKnown().isPresent) 1 else 0) +
                (if (merchantState.asKnown().isPresent) 1 else 0) +
                (if (cardholderFirstName.asKnown().isPresent) 1 else 0) +
                (if (cardholderLastName.asKnown().isPresent) 1 else 0) +
                (if (cardholderMiddleName.asKnown().isPresent) 1 else 0) +
                (if (cardholderPostalCode.asKnown().isPresent) 1 else 0) +
                (if (cardholderStreetAddress.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                accountId == other.accountId &&
                cardTokenId == other.cardTokenId &&
                merchantCategoryCode == other.merchantCategoryCode &&
                merchantCityName == other.merchantCityName &&
                merchantName == other.merchantName &&
                merchantPostalCode == other.merchantPostalCode &&
                merchantState == other.merchantState &&
                cardholderFirstName == other.cardholderFirstName &&
                cardholderLastName == other.cardholderLastName &&
                cardholderMiddleName == other.cardholderMiddleName &&
                cardholderPostalCode == other.cardholderPostalCode &&
                cardholderStreetAddress == other.cardholderStreetAddress &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                accountId,
                cardTokenId,
                merchantCategoryCode,
                merchantCityName,
                merchantName,
                merchantPostalCode,
                merchantState,
                cardholderFirstName,
                cardholderLastName,
                cardholderMiddleName,
                cardholderPostalCode,
                cardholderStreetAddress,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{accountId=$accountId, cardTokenId=$cardTokenId, merchantCategoryCode=$merchantCategoryCode, merchantCityName=$merchantCityName, merchantName=$merchantName, merchantPostalCode=$merchantPostalCode, merchantState=$merchantState, cardholderFirstName=$cardholderFirstName, cardholderLastName=$cardholderLastName, cardholderMiddleName=$cardholderMiddleName, cardholderPostalCode=$cardholderPostalCode, cardholderStreetAddress=$cardholderStreetAddress, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CardValidationCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "CardValidationCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
