// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.cardpushtransfers

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

/** Create a Card Push Transfer */
class CardPushTransferCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The Business Application Identifier describes the type of transaction being performed. Your
     * program must be approved for the specified Business Application Identifier in order to use
     * it.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun businessApplicationIdentifier(): BusinessApplicationIdentifier =
        body.businessApplicationIdentifier()

    /**
     * The Increase identifier for the Card Token that represents the card number you're pushing
     * funds to.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun cardTokenId(): String = body.cardTokenId()

    /**
     * The merchant category code (MCC) of the merchant (generally your business) sending the
     * transfer. This is a four-digit code that describes the type of business or service provided
     * by the merchant. Your program must be approved for the specified MCC in order to use it.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun merchantCategoryCode(): String = body.merchantCategoryCode()

    /**
     * The city name of the merchant (generally your business) sending the transfer.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun merchantCityName(): String = body.merchantCityName()

    /**
     * The merchant name shows up as the statement descriptor for the transfer. This is typically
     * the name of your business or organization.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun merchantName(): String = body.merchantName()

    /**
     * For certain Business Application Identifiers, the statement descriptor is
     * `merchant_name_prefix*sender_name`, where the `merchant_name_prefix` is a one to four
     * character prefix that identifies the merchant.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun merchantNamePrefix(): String = body.merchantNamePrefix()

    /**
     * The postal code of the merchant (generally your business) sending the transfer.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun merchantPostalCode(): String = body.merchantPostalCode()

    /**
     * The state of the merchant (generally your business) sending the transfer.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun merchantState(): String = body.merchantState()

    /**
     * The amount to transfer. The receiving bank will convert this to the cardholder's currency.
     * The amount that is applied to your Increase account matches the currency of your account.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun presentmentAmount(): PresentmentAmount = body.presentmentAmount()

    /**
     * The name of the funds recipient.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun recipientName(): String = body.recipientName()

    /**
     * The city of the sender.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun senderAddressCity(): String = body.senderAddressCity()

    /**
     * The address line 1 of the sender.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun senderAddressLine1(): String = body.senderAddressLine1()

    /**
     * The postal code of the sender.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun senderAddressPostalCode(): String = body.senderAddressPostalCode()

    /**
     * The state of the sender.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun senderAddressState(): String = body.senderAddressState()

    /**
     * The name of the funds originator.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun senderName(): String = body.senderName()

    /**
     * The identifier of the Account Number from which to send the transfer.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sourceAccountNumberId(): String = body.sourceAccountNumberId()

    /**
     * Whether the transfer requires explicit approval via the dashboard or API.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun requireApproval(): Optional<Boolean> = body.requireApproval()

    /**
     * Returns the raw JSON value of [businessApplicationIdentifier].
     *
     * Unlike [businessApplicationIdentifier], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _businessApplicationIdentifier(): JsonField<BusinessApplicationIdentifier> =
        body._businessApplicationIdentifier()

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
     * Returns the raw JSON value of [merchantNamePrefix].
     *
     * Unlike [merchantNamePrefix], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _merchantNamePrefix(): JsonField<String> = body._merchantNamePrefix()

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
     * Returns the raw JSON value of [presentmentAmount].
     *
     * Unlike [presentmentAmount], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _presentmentAmount(): JsonField<PresentmentAmount> = body._presentmentAmount()

    /**
     * Returns the raw JSON value of [recipientName].
     *
     * Unlike [recipientName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _recipientName(): JsonField<String> = body._recipientName()

    /**
     * Returns the raw JSON value of [senderAddressCity].
     *
     * Unlike [senderAddressCity], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _senderAddressCity(): JsonField<String> = body._senderAddressCity()

    /**
     * Returns the raw JSON value of [senderAddressLine1].
     *
     * Unlike [senderAddressLine1], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _senderAddressLine1(): JsonField<String> = body._senderAddressLine1()

    /**
     * Returns the raw JSON value of [senderAddressPostalCode].
     *
     * Unlike [senderAddressPostalCode], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _senderAddressPostalCode(): JsonField<String> = body._senderAddressPostalCode()

    /**
     * Returns the raw JSON value of [senderAddressState].
     *
     * Unlike [senderAddressState], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _senderAddressState(): JsonField<String> = body._senderAddressState()

    /**
     * Returns the raw JSON value of [senderName].
     *
     * Unlike [senderName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _senderName(): JsonField<String> = body._senderName()

    /**
     * Returns the raw JSON value of [sourceAccountNumberId].
     *
     * Unlike [sourceAccountNumberId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _sourceAccountNumberId(): JsonField<String> = body._sourceAccountNumberId()

    /**
     * Returns the raw JSON value of [requireApproval].
     *
     * Unlike [requireApproval], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _requireApproval(): JsonField<Boolean> = body._requireApproval()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CardPushTransferCreateParams].
         *
         * The following fields are required:
         * ```java
         * .businessApplicationIdentifier()
         * .cardTokenId()
         * .merchantCategoryCode()
         * .merchantCityName()
         * .merchantName()
         * .merchantNamePrefix()
         * .merchantPostalCode()
         * .merchantState()
         * .presentmentAmount()
         * .recipientName()
         * .senderAddressCity()
         * .senderAddressLine1()
         * .senderAddressPostalCode()
         * .senderAddressState()
         * .senderName()
         * .sourceAccountNumberId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CardPushTransferCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(cardPushTransferCreateParams: CardPushTransferCreateParams) = apply {
            body = cardPushTransferCreateParams.body.toBuilder()
            additionalHeaders = cardPushTransferCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = cardPushTransferCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [businessApplicationIdentifier]
         * - [cardTokenId]
         * - [merchantCategoryCode]
         * - [merchantCityName]
         * - [merchantName]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * The Business Application Identifier describes the type of transaction being performed.
         * Your program must be approved for the specified Business Application Identifier in order
         * to use it.
         */
        fun businessApplicationIdentifier(
            businessApplicationIdentifier: BusinessApplicationIdentifier
        ) = apply { body.businessApplicationIdentifier(businessApplicationIdentifier) }

        /**
         * Sets [Builder.businessApplicationIdentifier] to an arbitrary JSON value.
         *
         * You should usually call [Builder.businessApplicationIdentifier] with a well-typed
         * [BusinessApplicationIdentifier] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun businessApplicationIdentifier(
            businessApplicationIdentifier: JsonField<BusinessApplicationIdentifier>
        ) = apply { body.businessApplicationIdentifier(businessApplicationIdentifier) }

        /**
         * The Increase identifier for the Card Token that represents the card number you're pushing
         * funds to.
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
         * The merchant category code (MCC) of the merchant (generally your business) sending the
         * transfer. This is a four-digit code that describes the type of business or service
         * provided by the merchant. Your program must be approved for the specified MCC in order to
         * use it.
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

        /** The city name of the merchant (generally your business) sending the transfer. */
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
         * The merchant name shows up as the statement descriptor for the transfer. This is
         * typically the name of your business or organization.
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

        /**
         * For certain Business Application Identifiers, the statement descriptor is
         * `merchant_name_prefix*sender_name`, where the `merchant_name_prefix` is a one to four
         * character prefix that identifies the merchant.
         */
        fun merchantNamePrefix(merchantNamePrefix: String) = apply {
            body.merchantNamePrefix(merchantNamePrefix)
        }

        /**
         * Sets [Builder.merchantNamePrefix] to an arbitrary JSON value.
         *
         * You should usually call [Builder.merchantNamePrefix] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun merchantNamePrefix(merchantNamePrefix: JsonField<String>) = apply {
            body.merchantNamePrefix(merchantNamePrefix)
        }

        /** The postal code of the merchant (generally your business) sending the transfer. */
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

        /** The state of the merchant (generally your business) sending the transfer. */
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

        /**
         * The amount to transfer. The receiving bank will convert this to the cardholder's
         * currency. The amount that is applied to your Increase account matches the currency of
         * your account.
         */
        fun presentmentAmount(presentmentAmount: PresentmentAmount) = apply {
            body.presentmentAmount(presentmentAmount)
        }

        /**
         * Sets [Builder.presentmentAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.presentmentAmount] with a well-typed [PresentmentAmount]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun presentmentAmount(presentmentAmount: JsonField<PresentmentAmount>) = apply {
            body.presentmentAmount(presentmentAmount)
        }

        /** The name of the funds recipient. */
        fun recipientName(recipientName: String) = apply { body.recipientName(recipientName) }

        /**
         * Sets [Builder.recipientName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recipientName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun recipientName(recipientName: JsonField<String>) = apply {
            body.recipientName(recipientName)
        }

        /** The city of the sender. */
        fun senderAddressCity(senderAddressCity: String) = apply {
            body.senderAddressCity(senderAddressCity)
        }

        /**
         * Sets [Builder.senderAddressCity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.senderAddressCity] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun senderAddressCity(senderAddressCity: JsonField<String>) = apply {
            body.senderAddressCity(senderAddressCity)
        }

        /** The address line 1 of the sender. */
        fun senderAddressLine1(senderAddressLine1: String) = apply {
            body.senderAddressLine1(senderAddressLine1)
        }

        /**
         * Sets [Builder.senderAddressLine1] to an arbitrary JSON value.
         *
         * You should usually call [Builder.senderAddressLine1] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun senderAddressLine1(senderAddressLine1: JsonField<String>) = apply {
            body.senderAddressLine1(senderAddressLine1)
        }

        /** The postal code of the sender. */
        fun senderAddressPostalCode(senderAddressPostalCode: String) = apply {
            body.senderAddressPostalCode(senderAddressPostalCode)
        }

        /**
         * Sets [Builder.senderAddressPostalCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.senderAddressPostalCode] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun senderAddressPostalCode(senderAddressPostalCode: JsonField<String>) = apply {
            body.senderAddressPostalCode(senderAddressPostalCode)
        }

        /** The state of the sender. */
        fun senderAddressState(senderAddressState: String) = apply {
            body.senderAddressState(senderAddressState)
        }

        /**
         * Sets [Builder.senderAddressState] to an arbitrary JSON value.
         *
         * You should usually call [Builder.senderAddressState] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun senderAddressState(senderAddressState: JsonField<String>) = apply {
            body.senderAddressState(senderAddressState)
        }

        /** The name of the funds originator. */
        fun senderName(senderName: String) = apply { body.senderName(senderName) }

        /**
         * Sets [Builder.senderName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.senderName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun senderName(senderName: JsonField<String>) = apply { body.senderName(senderName) }

        /** The identifier of the Account Number from which to send the transfer. */
        fun sourceAccountNumberId(sourceAccountNumberId: String) = apply {
            body.sourceAccountNumberId(sourceAccountNumberId)
        }

        /**
         * Sets [Builder.sourceAccountNumberId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sourceAccountNumberId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sourceAccountNumberId(sourceAccountNumberId: JsonField<String>) = apply {
            body.sourceAccountNumberId(sourceAccountNumberId)
        }

        /** Whether the transfer requires explicit approval via the dashboard or API. */
        fun requireApproval(requireApproval: Boolean) = apply {
            body.requireApproval(requireApproval)
        }

        /**
         * Sets [Builder.requireApproval] to an arbitrary JSON value.
         *
         * You should usually call [Builder.requireApproval] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun requireApproval(requireApproval: JsonField<Boolean>) = apply {
            body.requireApproval(requireApproval)
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
         * Returns an immutable instance of [CardPushTransferCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .businessApplicationIdentifier()
         * .cardTokenId()
         * .merchantCategoryCode()
         * .merchantCityName()
         * .merchantName()
         * .merchantNamePrefix()
         * .merchantPostalCode()
         * .merchantState()
         * .presentmentAmount()
         * .recipientName()
         * .senderAddressCity()
         * .senderAddressLine1()
         * .senderAddressPostalCode()
         * .senderAddressState()
         * .senderName()
         * .sourceAccountNumberId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CardPushTransferCreateParams =
            CardPushTransferCreateParams(
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
        private val businessApplicationIdentifier: JsonField<BusinessApplicationIdentifier>,
        private val cardTokenId: JsonField<String>,
        private val merchantCategoryCode: JsonField<String>,
        private val merchantCityName: JsonField<String>,
        private val merchantName: JsonField<String>,
        private val merchantNamePrefix: JsonField<String>,
        private val merchantPostalCode: JsonField<String>,
        private val merchantState: JsonField<String>,
        private val presentmentAmount: JsonField<PresentmentAmount>,
        private val recipientName: JsonField<String>,
        private val senderAddressCity: JsonField<String>,
        private val senderAddressLine1: JsonField<String>,
        private val senderAddressPostalCode: JsonField<String>,
        private val senderAddressState: JsonField<String>,
        private val senderName: JsonField<String>,
        private val sourceAccountNumberId: JsonField<String>,
        private val requireApproval: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("business_application_identifier")
            @ExcludeMissing
            businessApplicationIdentifier: JsonField<BusinessApplicationIdentifier> =
                JsonMissing.of(),
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
            @JsonProperty("merchant_name_prefix")
            @ExcludeMissing
            merchantNamePrefix: JsonField<String> = JsonMissing.of(),
            @JsonProperty("merchant_postal_code")
            @ExcludeMissing
            merchantPostalCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("merchant_state")
            @ExcludeMissing
            merchantState: JsonField<String> = JsonMissing.of(),
            @JsonProperty("presentment_amount")
            @ExcludeMissing
            presentmentAmount: JsonField<PresentmentAmount> = JsonMissing.of(),
            @JsonProperty("recipient_name")
            @ExcludeMissing
            recipientName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sender_address_city")
            @ExcludeMissing
            senderAddressCity: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sender_address_line1")
            @ExcludeMissing
            senderAddressLine1: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sender_address_postal_code")
            @ExcludeMissing
            senderAddressPostalCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sender_address_state")
            @ExcludeMissing
            senderAddressState: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sender_name")
            @ExcludeMissing
            senderName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("source_account_number_id")
            @ExcludeMissing
            sourceAccountNumberId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("require_approval")
            @ExcludeMissing
            requireApproval: JsonField<Boolean> = JsonMissing.of(),
        ) : this(
            businessApplicationIdentifier,
            cardTokenId,
            merchantCategoryCode,
            merchantCityName,
            merchantName,
            merchantNamePrefix,
            merchantPostalCode,
            merchantState,
            presentmentAmount,
            recipientName,
            senderAddressCity,
            senderAddressLine1,
            senderAddressPostalCode,
            senderAddressState,
            senderName,
            sourceAccountNumberId,
            requireApproval,
            mutableMapOf(),
        )

        /**
         * The Business Application Identifier describes the type of transaction being performed.
         * Your program must be approved for the specified Business Application Identifier in order
         * to use it.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun businessApplicationIdentifier(): BusinessApplicationIdentifier =
            businessApplicationIdentifier.getRequired("business_application_identifier")

        /**
         * The Increase identifier for the Card Token that represents the card number you're pushing
         * funds to.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun cardTokenId(): String = cardTokenId.getRequired("card_token_id")

        /**
         * The merchant category code (MCC) of the merchant (generally your business) sending the
         * transfer. This is a four-digit code that describes the type of business or service
         * provided by the merchant. Your program must be approved for the specified MCC in order to
         * use it.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun merchantCategoryCode(): String =
            merchantCategoryCode.getRequired("merchant_category_code")

        /**
         * The city name of the merchant (generally your business) sending the transfer.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun merchantCityName(): String = merchantCityName.getRequired("merchant_city_name")

        /**
         * The merchant name shows up as the statement descriptor for the transfer. This is
         * typically the name of your business or organization.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun merchantName(): String = merchantName.getRequired("merchant_name")

        /**
         * For certain Business Application Identifiers, the statement descriptor is
         * `merchant_name_prefix*sender_name`, where the `merchant_name_prefix` is a one to four
         * character prefix that identifies the merchant.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun merchantNamePrefix(): String = merchantNamePrefix.getRequired("merchant_name_prefix")

        /**
         * The postal code of the merchant (generally your business) sending the transfer.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun merchantPostalCode(): String = merchantPostalCode.getRequired("merchant_postal_code")

        /**
         * The state of the merchant (generally your business) sending the transfer.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun merchantState(): String = merchantState.getRequired("merchant_state")

        /**
         * The amount to transfer. The receiving bank will convert this to the cardholder's
         * currency. The amount that is applied to your Increase account matches the currency of
         * your account.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun presentmentAmount(): PresentmentAmount =
            presentmentAmount.getRequired("presentment_amount")

        /**
         * The name of the funds recipient.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun recipientName(): String = recipientName.getRequired("recipient_name")

        /**
         * The city of the sender.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun senderAddressCity(): String = senderAddressCity.getRequired("sender_address_city")

        /**
         * The address line 1 of the sender.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun senderAddressLine1(): String = senderAddressLine1.getRequired("sender_address_line1")

        /**
         * The postal code of the sender.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun senderAddressPostalCode(): String =
            senderAddressPostalCode.getRequired("sender_address_postal_code")

        /**
         * The state of the sender.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun senderAddressState(): String = senderAddressState.getRequired("sender_address_state")

        /**
         * The name of the funds originator.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun senderName(): String = senderName.getRequired("sender_name")

        /**
         * The identifier of the Account Number from which to send the transfer.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun sourceAccountNumberId(): String =
            sourceAccountNumberId.getRequired("source_account_number_id")

        /**
         * Whether the transfer requires explicit approval via the dashboard or API.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun requireApproval(): Optional<Boolean> = requireApproval.getOptional("require_approval")

        /**
         * Returns the raw JSON value of [businessApplicationIdentifier].
         *
         * Unlike [businessApplicationIdentifier], this method doesn't throw if the JSON field has
         * an unexpected type.
         */
        @JsonProperty("business_application_identifier")
        @ExcludeMissing
        fun _businessApplicationIdentifier(): JsonField<BusinessApplicationIdentifier> =
            businessApplicationIdentifier

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
         * Returns the raw JSON value of [merchantNamePrefix].
         *
         * Unlike [merchantNamePrefix], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("merchant_name_prefix")
        @ExcludeMissing
        fun _merchantNamePrefix(): JsonField<String> = merchantNamePrefix

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
         * Returns the raw JSON value of [presentmentAmount].
         *
         * Unlike [presentmentAmount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("presentment_amount")
        @ExcludeMissing
        fun _presentmentAmount(): JsonField<PresentmentAmount> = presentmentAmount

        /**
         * Returns the raw JSON value of [recipientName].
         *
         * Unlike [recipientName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("recipient_name")
        @ExcludeMissing
        fun _recipientName(): JsonField<String> = recipientName

        /**
         * Returns the raw JSON value of [senderAddressCity].
         *
         * Unlike [senderAddressCity], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("sender_address_city")
        @ExcludeMissing
        fun _senderAddressCity(): JsonField<String> = senderAddressCity

        /**
         * Returns the raw JSON value of [senderAddressLine1].
         *
         * Unlike [senderAddressLine1], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("sender_address_line1")
        @ExcludeMissing
        fun _senderAddressLine1(): JsonField<String> = senderAddressLine1

        /**
         * Returns the raw JSON value of [senderAddressPostalCode].
         *
         * Unlike [senderAddressPostalCode], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("sender_address_postal_code")
        @ExcludeMissing
        fun _senderAddressPostalCode(): JsonField<String> = senderAddressPostalCode

        /**
         * Returns the raw JSON value of [senderAddressState].
         *
         * Unlike [senderAddressState], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("sender_address_state")
        @ExcludeMissing
        fun _senderAddressState(): JsonField<String> = senderAddressState

        /**
         * Returns the raw JSON value of [senderName].
         *
         * Unlike [senderName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sender_name")
        @ExcludeMissing
        fun _senderName(): JsonField<String> = senderName

        /**
         * Returns the raw JSON value of [sourceAccountNumberId].
         *
         * Unlike [sourceAccountNumberId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("source_account_number_id")
        @ExcludeMissing
        fun _sourceAccountNumberId(): JsonField<String> = sourceAccountNumberId

        /**
         * Returns the raw JSON value of [requireApproval].
         *
         * Unlike [requireApproval], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("require_approval")
        @ExcludeMissing
        fun _requireApproval(): JsonField<Boolean> = requireApproval

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
             * .businessApplicationIdentifier()
             * .cardTokenId()
             * .merchantCategoryCode()
             * .merchantCityName()
             * .merchantName()
             * .merchantNamePrefix()
             * .merchantPostalCode()
             * .merchantState()
             * .presentmentAmount()
             * .recipientName()
             * .senderAddressCity()
             * .senderAddressLine1()
             * .senderAddressPostalCode()
             * .senderAddressState()
             * .senderName()
             * .sourceAccountNumberId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var businessApplicationIdentifier: JsonField<BusinessApplicationIdentifier>? =
                null
            private var cardTokenId: JsonField<String>? = null
            private var merchantCategoryCode: JsonField<String>? = null
            private var merchantCityName: JsonField<String>? = null
            private var merchantName: JsonField<String>? = null
            private var merchantNamePrefix: JsonField<String>? = null
            private var merchantPostalCode: JsonField<String>? = null
            private var merchantState: JsonField<String>? = null
            private var presentmentAmount: JsonField<PresentmentAmount>? = null
            private var recipientName: JsonField<String>? = null
            private var senderAddressCity: JsonField<String>? = null
            private var senderAddressLine1: JsonField<String>? = null
            private var senderAddressPostalCode: JsonField<String>? = null
            private var senderAddressState: JsonField<String>? = null
            private var senderName: JsonField<String>? = null
            private var sourceAccountNumberId: JsonField<String>? = null
            private var requireApproval: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                businessApplicationIdentifier = body.businessApplicationIdentifier
                cardTokenId = body.cardTokenId
                merchantCategoryCode = body.merchantCategoryCode
                merchantCityName = body.merchantCityName
                merchantName = body.merchantName
                merchantNamePrefix = body.merchantNamePrefix
                merchantPostalCode = body.merchantPostalCode
                merchantState = body.merchantState
                presentmentAmount = body.presentmentAmount
                recipientName = body.recipientName
                senderAddressCity = body.senderAddressCity
                senderAddressLine1 = body.senderAddressLine1
                senderAddressPostalCode = body.senderAddressPostalCode
                senderAddressState = body.senderAddressState
                senderName = body.senderName
                sourceAccountNumberId = body.sourceAccountNumberId
                requireApproval = body.requireApproval
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * The Business Application Identifier describes the type of transaction being
             * performed. Your program must be approved for the specified Business Application
             * Identifier in order to use it.
             */
            fun businessApplicationIdentifier(
                businessApplicationIdentifier: BusinessApplicationIdentifier
            ) = businessApplicationIdentifier(JsonField.of(businessApplicationIdentifier))

            /**
             * Sets [Builder.businessApplicationIdentifier] to an arbitrary JSON value.
             *
             * You should usually call [Builder.businessApplicationIdentifier] with a well-typed
             * [BusinessApplicationIdentifier] value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun businessApplicationIdentifier(
                businessApplicationIdentifier: JsonField<BusinessApplicationIdentifier>
            ) = apply { this.businessApplicationIdentifier = businessApplicationIdentifier }

            /**
             * The Increase identifier for the Card Token that represents the card number you're
             * pushing funds to.
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
             * The merchant category code (MCC) of the merchant (generally your business) sending
             * the transfer. This is a four-digit code that describes the type of business or
             * service provided by the merchant. Your program must be approved for the specified MCC
             * in order to use it.
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

            /** The city name of the merchant (generally your business) sending the transfer. */
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
             * The merchant name shows up as the statement descriptor for the transfer. This is
             * typically the name of your business or organization.
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

            /**
             * For certain Business Application Identifiers, the statement descriptor is
             * `merchant_name_prefix*sender_name`, where the `merchant_name_prefix` is a one to four
             * character prefix that identifies the merchant.
             */
            fun merchantNamePrefix(merchantNamePrefix: String) =
                merchantNamePrefix(JsonField.of(merchantNamePrefix))

            /**
             * Sets [Builder.merchantNamePrefix] to an arbitrary JSON value.
             *
             * You should usually call [Builder.merchantNamePrefix] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun merchantNamePrefix(merchantNamePrefix: JsonField<String>) = apply {
                this.merchantNamePrefix = merchantNamePrefix
            }

            /** The postal code of the merchant (generally your business) sending the transfer. */
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

            /** The state of the merchant (generally your business) sending the transfer. */
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

            /**
             * The amount to transfer. The receiving bank will convert this to the cardholder's
             * currency. The amount that is applied to your Increase account matches the currency of
             * your account.
             */
            fun presentmentAmount(presentmentAmount: PresentmentAmount) =
                presentmentAmount(JsonField.of(presentmentAmount))

            /**
             * Sets [Builder.presentmentAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.presentmentAmount] with a well-typed
             * [PresentmentAmount] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun presentmentAmount(presentmentAmount: JsonField<PresentmentAmount>) = apply {
                this.presentmentAmount = presentmentAmount
            }

            /** The name of the funds recipient. */
            fun recipientName(recipientName: String) = recipientName(JsonField.of(recipientName))

            /**
             * Sets [Builder.recipientName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recipientName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recipientName(recipientName: JsonField<String>) = apply {
                this.recipientName = recipientName
            }

            /** The city of the sender. */
            fun senderAddressCity(senderAddressCity: String) =
                senderAddressCity(JsonField.of(senderAddressCity))

            /**
             * Sets [Builder.senderAddressCity] to an arbitrary JSON value.
             *
             * You should usually call [Builder.senderAddressCity] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun senderAddressCity(senderAddressCity: JsonField<String>) = apply {
                this.senderAddressCity = senderAddressCity
            }

            /** The address line 1 of the sender. */
            fun senderAddressLine1(senderAddressLine1: String) =
                senderAddressLine1(JsonField.of(senderAddressLine1))

            /**
             * Sets [Builder.senderAddressLine1] to an arbitrary JSON value.
             *
             * You should usually call [Builder.senderAddressLine1] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun senderAddressLine1(senderAddressLine1: JsonField<String>) = apply {
                this.senderAddressLine1 = senderAddressLine1
            }

            /** The postal code of the sender. */
            fun senderAddressPostalCode(senderAddressPostalCode: String) =
                senderAddressPostalCode(JsonField.of(senderAddressPostalCode))

            /**
             * Sets [Builder.senderAddressPostalCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.senderAddressPostalCode] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun senderAddressPostalCode(senderAddressPostalCode: JsonField<String>) = apply {
                this.senderAddressPostalCode = senderAddressPostalCode
            }

            /** The state of the sender. */
            fun senderAddressState(senderAddressState: String) =
                senderAddressState(JsonField.of(senderAddressState))

            /**
             * Sets [Builder.senderAddressState] to an arbitrary JSON value.
             *
             * You should usually call [Builder.senderAddressState] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun senderAddressState(senderAddressState: JsonField<String>) = apply {
                this.senderAddressState = senderAddressState
            }

            /** The name of the funds originator. */
            fun senderName(senderName: String) = senderName(JsonField.of(senderName))

            /**
             * Sets [Builder.senderName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.senderName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun senderName(senderName: JsonField<String>) = apply { this.senderName = senderName }

            /** The identifier of the Account Number from which to send the transfer. */
            fun sourceAccountNumberId(sourceAccountNumberId: String) =
                sourceAccountNumberId(JsonField.of(sourceAccountNumberId))

            /**
             * Sets [Builder.sourceAccountNumberId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sourceAccountNumberId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun sourceAccountNumberId(sourceAccountNumberId: JsonField<String>) = apply {
                this.sourceAccountNumberId = sourceAccountNumberId
            }

            /** Whether the transfer requires explicit approval via the dashboard or API. */
            fun requireApproval(requireApproval: Boolean) =
                requireApproval(JsonField.of(requireApproval))

            /**
             * Sets [Builder.requireApproval] to an arbitrary JSON value.
             *
             * You should usually call [Builder.requireApproval] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun requireApproval(requireApproval: JsonField<Boolean>) = apply {
                this.requireApproval = requireApproval
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
             * .businessApplicationIdentifier()
             * .cardTokenId()
             * .merchantCategoryCode()
             * .merchantCityName()
             * .merchantName()
             * .merchantNamePrefix()
             * .merchantPostalCode()
             * .merchantState()
             * .presentmentAmount()
             * .recipientName()
             * .senderAddressCity()
             * .senderAddressLine1()
             * .senderAddressPostalCode()
             * .senderAddressState()
             * .senderName()
             * .sourceAccountNumberId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("businessApplicationIdentifier", businessApplicationIdentifier),
                    checkRequired("cardTokenId", cardTokenId),
                    checkRequired("merchantCategoryCode", merchantCategoryCode),
                    checkRequired("merchantCityName", merchantCityName),
                    checkRequired("merchantName", merchantName),
                    checkRequired("merchantNamePrefix", merchantNamePrefix),
                    checkRequired("merchantPostalCode", merchantPostalCode),
                    checkRequired("merchantState", merchantState),
                    checkRequired("presentmentAmount", presentmentAmount),
                    checkRequired("recipientName", recipientName),
                    checkRequired("senderAddressCity", senderAddressCity),
                    checkRequired("senderAddressLine1", senderAddressLine1),
                    checkRequired("senderAddressPostalCode", senderAddressPostalCode),
                    checkRequired("senderAddressState", senderAddressState),
                    checkRequired("senderName", senderName),
                    checkRequired("sourceAccountNumberId", sourceAccountNumberId),
                    requireApproval,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            businessApplicationIdentifier().validate()
            cardTokenId()
            merchantCategoryCode()
            merchantCityName()
            merchantName()
            merchantNamePrefix()
            merchantPostalCode()
            merchantState()
            presentmentAmount().validate()
            recipientName()
            senderAddressCity()
            senderAddressLine1()
            senderAddressPostalCode()
            senderAddressState()
            senderName()
            sourceAccountNumberId()
            requireApproval()
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
            (businessApplicationIdentifier.asKnown().getOrNull()?.validity() ?: 0) +
                (if (cardTokenId.asKnown().isPresent) 1 else 0) +
                (if (merchantCategoryCode.asKnown().isPresent) 1 else 0) +
                (if (merchantCityName.asKnown().isPresent) 1 else 0) +
                (if (merchantName.asKnown().isPresent) 1 else 0) +
                (if (merchantNamePrefix.asKnown().isPresent) 1 else 0) +
                (if (merchantPostalCode.asKnown().isPresent) 1 else 0) +
                (if (merchantState.asKnown().isPresent) 1 else 0) +
                (presentmentAmount.asKnown().getOrNull()?.validity() ?: 0) +
                (if (recipientName.asKnown().isPresent) 1 else 0) +
                (if (senderAddressCity.asKnown().isPresent) 1 else 0) +
                (if (senderAddressLine1.asKnown().isPresent) 1 else 0) +
                (if (senderAddressPostalCode.asKnown().isPresent) 1 else 0) +
                (if (senderAddressState.asKnown().isPresent) 1 else 0) +
                (if (senderName.asKnown().isPresent) 1 else 0) +
                (if (sourceAccountNumberId.asKnown().isPresent) 1 else 0) +
                (if (requireApproval.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                businessApplicationIdentifier == other.businessApplicationIdentifier &&
                cardTokenId == other.cardTokenId &&
                merchantCategoryCode == other.merchantCategoryCode &&
                merchantCityName == other.merchantCityName &&
                merchantName == other.merchantName &&
                merchantNamePrefix == other.merchantNamePrefix &&
                merchantPostalCode == other.merchantPostalCode &&
                merchantState == other.merchantState &&
                presentmentAmount == other.presentmentAmount &&
                recipientName == other.recipientName &&
                senderAddressCity == other.senderAddressCity &&
                senderAddressLine1 == other.senderAddressLine1 &&
                senderAddressPostalCode == other.senderAddressPostalCode &&
                senderAddressState == other.senderAddressState &&
                senderName == other.senderName &&
                sourceAccountNumberId == other.sourceAccountNumberId &&
                requireApproval == other.requireApproval &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                businessApplicationIdentifier,
                cardTokenId,
                merchantCategoryCode,
                merchantCityName,
                merchantName,
                merchantNamePrefix,
                merchantPostalCode,
                merchantState,
                presentmentAmount,
                recipientName,
                senderAddressCity,
                senderAddressLine1,
                senderAddressPostalCode,
                senderAddressState,
                senderName,
                sourceAccountNumberId,
                requireApproval,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{businessApplicationIdentifier=$businessApplicationIdentifier, cardTokenId=$cardTokenId, merchantCategoryCode=$merchantCategoryCode, merchantCityName=$merchantCityName, merchantName=$merchantName, merchantNamePrefix=$merchantNamePrefix, merchantPostalCode=$merchantPostalCode, merchantState=$merchantState, presentmentAmount=$presentmentAmount, recipientName=$recipientName, senderAddressCity=$senderAddressCity, senderAddressLine1=$senderAddressLine1, senderAddressPostalCode=$senderAddressPostalCode, senderAddressState=$senderAddressState, senderName=$senderName, sourceAccountNumberId=$sourceAccountNumberId, requireApproval=$requireApproval, additionalProperties=$additionalProperties}"
    }

    /**
     * The Business Application Identifier describes the type of transaction being performed. Your
     * program must be approved for the specified Business Application Identifier in order to use
     * it.
     */
    class BusinessApplicationIdentifier
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

            /** Account to Account */
            @JvmField val ACCOUNT_TO_ACCOUNT = of("account_to_account")

            /** Business to Business */
            @JvmField val BUSINESS_TO_BUSINESS = of("business_to_business")

            /** Money Transfer Bank Initiated */
            @JvmField val MONEY_TRANSFER_BANK_INITIATED = of("money_transfer_bank_initiated")

            /** Non-Card Bill Payment */
            @JvmField val NON_CARD_BILL_PAYMENT = of("non_card_bill_payment")

            /** Consumer Bill Payment */
            @JvmField val CONSUMER_BILL_PAYMENT = of("consumer_bill_payment")

            /** Card Bill Payment */
            @JvmField val CARD_BILL_PAYMENT = of("card_bill_payment")

            /** Funds Disbursement */
            @JvmField val FUNDS_DISBURSEMENT = of("funds_disbursement")

            /** Funds Transfer */
            @JvmField val FUNDS_TRANSFER = of("funds_transfer")

            /** Loyalty and Offers */
            @JvmField val LOYALTY_AND_OFFERS = of("loyalty_and_offers")

            /** Merchant Disbursement */
            @JvmField val MERCHANT_DISBURSEMENT = of("merchant_disbursement")

            /** Merchant Payment */
            @JvmField val MERCHANT_PAYMENT = of("merchant_payment")

            /** Person to Person */
            @JvmField val PERSON_TO_PERSON = of("person_to_person")

            /** Top Up */
            @JvmField val TOP_UP = of("top_up")

            /** Wallet Transfer */
            @JvmField val WALLET_TRANSFER = of("wallet_transfer")

            @JvmStatic fun of(value: String) = BusinessApplicationIdentifier(JsonField.of(value))
        }

        /** An enum containing [BusinessApplicationIdentifier]'s known values. */
        enum class Known {
            /** Account to Account */
            ACCOUNT_TO_ACCOUNT,
            /** Business to Business */
            BUSINESS_TO_BUSINESS,
            /** Money Transfer Bank Initiated */
            MONEY_TRANSFER_BANK_INITIATED,
            /** Non-Card Bill Payment */
            NON_CARD_BILL_PAYMENT,
            /** Consumer Bill Payment */
            CONSUMER_BILL_PAYMENT,
            /** Card Bill Payment */
            CARD_BILL_PAYMENT,
            /** Funds Disbursement */
            FUNDS_DISBURSEMENT,
            /** Funds Transfer */
            FUNDS_TRANSFER,
            /** Loyalty and Offers */
            LOYALTY_AND_OFFERS,
            /** Merchant Disbursement */
            MERCHANT_DISBURSEMENT,
            /** Merchant Payment */
            MERCHANT_PAYMENT,
            /** Person to Person */
            PERSON_TO_PERSON,
            /** Top Up */
            TOP_UP,
            /** Wallet Transfer */
            WALLET_TRANSFER,
        }

        /**
         * An enum containing [BusinessApplicationIdentifier]'s known values, as well as an
         * [_UNKNOWN] member.
         *
         * An instance of [BusinessApplicationIdentifier] can contain an unknown value in a couple
         * of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            /** Account to Account */
            ACCOUNT_TO_ACCOUNT,
            /** Business to Business */
            BUSINESS_TO_BUSINESS,
            /** Money Transfer Bank Initiated */
            MONEY_TRANSFER_BANK_INITIATED,
            /** Non-Card Bill Payment */
            NON_CARD_BILL_PAYMENT,
            /** Consumer Bill Payment */
            CONSUMER_BILL_PAYMENT,
            /** Card Bill Payment */
            CARD_BILL_PAYMENT,
            /** Funds Disbursement */
            FUNDS_DISBURSEMENT,
            /** Funds Transfer */
            FUNDS_TRANSFER,
            /** Loyalty and Offers */
            LOYALTY_AND_OFFERS,
            /** Merchant Disbursement */
            MERCHANT_DISBURSEMENT,
            /** Merchant Payment */
            MERCHANT_PAYMENT,
            /** Person to Person */
            PERSON_TO_PERSON,
            /** Top Up */
            TOP_UP,
            /** Wallet Transfer */
            WALLET_TRANSFER,
            /**
             * An enum member indicating that [BusinessApplicationIdentifier] was instantiated with
             * an unknown value.
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
                ACCOUNT_TO_ACCOUNT -> Value.ACCOUNT_TO_ACCOUNT
                BUSINESS_TO_BUSINESS -> Value.BUSINESS_TO_BUSINESS
                MONEY_TRANSFER_BANK_INITIATED -> Value.MONEY_TRANSFER_BANK_INITIATED
                NON_CARD_BILL_PAYMENT -> Value.NON_CARD_BILL_PAYMENT
                CONSUMER_BILL_PAYMENT -> Value.CONSUMER_BILL_PAYMENT
                CARD_BILL_PAYMENT -> Value.CARD_BILL_PAYMENT
                FUNDS_DISBURSEMENT -> Value.FUNDS_DISBURSEMENT
                FUNDS_TRANSFER -> Value.FUNDS_TRANSFER
                LOYALTY_AND_OFFERS -> Value.LOYALTY_AND_OFFERS
                MERCHANT_DISBURSEMENT -> Value.MERCHANT_DISBURSEMENT
                MERCHANT_PAYMENT -> Value.MERCHANT_PAYMENT
                PERSON_TO_PERSON -> Value.PERSON_TO_PERSON
                TOP_UP -> Value.TOP_UP
                WALLET_TRANSFER -> Value.WALLET_TRANSFER
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
                ACCOUNT_TO_ACCOUNT -> Known.ACCOUNT_TO_ACCOUNT
                BUSINESS_TO_BUSINESS -> Known.BUSINESS_TO_BUSINESS
                MONEY_TRANSFER_BANK_INITIATED -> Known.MONEY_TRANSFER_BANK_INITIATED
                NON_CARD_BILL_PAYMENT -> Known.NON_CARD_BILL_PAYMENT
                CONSUMER_BILL_PAYMENT -> Known.CONSUMER_BILL_PAYMENT
                CARD_BILL_PAYMENT -> Known.CARD_BILL_PAYMENT
                FUNDS_DISBURSEMENT -> Known.FUNDS_DISBURSEMENT
                FUNDS_TRANSFER -> Known.FUNDS_TRANSFER
                LOYALTY_AND_OFFERS -> Known.LOYALTY_AND_OFFERS
                MERCHANT_DISBURSEMENT -> Known.MERCHANT_DISBURSEMENT
                MERCHANT_PAYMENT -> Known.MERCHANT_PAYMENT
                PERSON_TO_PERSON -> Known.PERSON_TO_PERSON
                TOP_UP -> Known.TOP_UP
                WALLET_TRANSFER -> Known.WALLET_TRANSFER
                else ->
                    throw IncreaseInvalidDataException(
                        "Unknown BusinessApplicationIdentifier: $value"
                    )
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

        fun validate(): BusinessApplicationIdentifier = apply {
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

            return other is BusinessApplicationIdentifier && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * The amount to transfer. The receiving bank will convert this to the cardholder's currency.
     * The amount that is applied to your Increase account matches the currency of your account.
     */
    class PresentmentAmount
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val currency: JsonField<Currency>,
        private val value: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<Currency> = JsonMissing.of(),
            @JsonProperty("value") @ExcludeMissing value: JsonField<String> = JsonMissing.of(),
        ) : this(currency, value, mutableMapOf())

        /**
         * The ISO 4217 currency code representing the currency of the amount.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun currency(): Currency = currency.getRequired("currency")

        /**
         * The amount value as a decimal string in the currency's major unit. For example, for USD,
         * '1234.56' represents 1234 dollars and 56 cents. For JPY, '1234' represents 1234 yen. A
         * currency with minor units requires at least one decimal place and supports up to the
         * number of decimal places defined by the currency's minor units. A currency without minor
         * units does not support any decimal places.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun value(): String = value.getRequired("value")

        /**
         * Returns the raw JSON value of [currency].
         *
         * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<Currency> = currency

        /**
         * Returns the raw JSON value of [value].
         *
         * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

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
             * Returns a mutable builder for constructing an instance of [PresentmentAmount].
             *
             * The following fields are required:
             * ```java
             * .currency()
             * .value()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [PresentmentAmount]. */
        class Builder internal constructor() {

            private var currency: JsonField<Currency>? = null
            private var value: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(presentmentAmount: PresentmentAmount) = apply {
                currency = presentmentAmount.currency
                value = presentmentAmount.value
                additionalProperties = presentmentAmount.additionalProperties.toMutableMap()
            }

            /** The ISO 4217 currency code representing the currency of the amount. */
            fun currency(currency: Currency) = currency(JsonField.of(currency))

            /**
             * Sets [Builder.currency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currency] with a well-typed [Currency] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

            /**
             * The amount value as a decimal string in the currency's major unit. For example, for
             * USD, '1234.56' represents 1234 dollars and 56 cents. For JPY, '1234' represents 1234
             * yen. A currency with minor units requires at least one decimal place and supports up
             * to the number of decimal places defined by the currency's minor units. A currency
             * without minor units does not support any decimal places.
             */
            fun value(value: String) = value(JsonField.of(value))

            /**
             * Sets [Builder.value] to an arbitrary JSON value.
             *
             * You should usually call [Builder.value] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun value(value: JsonField<String>) = apply { this.value = value }

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
             * Returns an immutable instance of [PresentmentAmount].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .currency()
             * .value()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): PresentmentAmount =
                PresentmentAmount(
                    checkRequired("currency", currency),
                    checkRequired("value", value),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): PresentmentAmount = apply {
            if (validated) {
                return@apply
            }

            currency().validate()
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
            (currency.asKnown().getOrNull()?.validity() ?: 0) +
                (if (value.asKnown().isPresent) 1 else 0)

        /** The ISO 4217 currency code representing the currency of the amount. */
        class Currency @JsonCreator private constructor(private val value: JsonField<String>) :
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

                /** AFN */
                @JvmField val AFN = of("AFN")

                /** EUR */
                @JvmField val EUR = of("EUR")

                /** ALL */
                @JvmField val ALL = of("ALL")

                /** DZD */
                @JvmField val DZD = of("DZD")

                /** USD */
                @JvmField val USD = of("USD")

                /** AOA */
                @JvmField val AOA = of("AOA")

                /** ARS */
                @JvmField val ARS = of("ARS")

                /** AMD */
                @JvmField val AMD = of("AMD")

                /** AWG */
                @JvmField val AWG = of("AWG")

                /** AUD */
                @JvmField val AUD = of("AUD")

                /** AZN */
                @JvmField val AZN = of("AZN")

                /** BSD */
                @JvmField val BSD = of("BSD")

                /** BHD */
                @JvmField val BHD = of("BHD")

                /** BDT */
                @JvmField val BDT = of("BDT")

                /** BBD */
                @JvmField val BBD = of("BBD")

                /** BYN */
                @JvmField val BYN = of("BYN")

                /** BZD */
                @JvmField val BZD = of("BZD")

                /** BMD */
                @JvmField val BMD = of("BMD")

                /** INR */
                @JvmField val INR = of("INR")

                /** BTN */
                @JvmField val BTN = of("BTN")

                /** BOB */
                @JvmField val BOB = of("BOB")

                /** BOV */
                @JvmField val BOV = of("BOV")

                /** BAM */
                @JvmField val BAM = of("BAM")

                /** BWP */
                @JvmField val BWP = of("BWP")

                /** NOK */
                @JvmField val NOK = of("NOK")

                /** BRL */
                @JvmField val BRL = of("BRL")

                /** BND */
                @JvmField val BND = of("BND")

                /** BGN */
                @JvmField val BGN = of("BGN")

                /** BIF */
                @JvmField val BIF = of("BIF")

                /** CVE */
                @JvmField val CVE = of("CVE")

                /** KHR */
                @JvmField val KHR = of("KHR")

                /** CAD */
                @JvmField val CAD = of("CAD")

                /** KYD */
                @JvmField val KYD = of("KYD")

                /** CLP */
                @JvmField val CLP = of("CLP")

                /** CLF */
                @JvmField val CLF = of("CLF")

                /** CNY */
                @JvmField val CNY = of("CNY")

                /** COP */
                @JvmField val COP = of("COP")

                /** COU */
                @JvmField val COU = of("COU")

                /** KMF */
                @JvmField val KMF = of("KMF")

                /** CDF */
                @JvmField val CDF = of("CDF")

                /** NZD */
                @JvmField val NZD = of("NZD")

                /** CRC */
                @JvmField val CRC = of("CRC")

                /** CUP */
                @JvmField val CUP = of("CUP")

                /** CZK */
                @JvmField val CZK = of("CZK")

                /** DKK */
                @JvmField val DKK = of("DKK")

                /** DJF */
                @JvmField val DJF = of("DJF")

                /** DOP */
                @JvmField val DOP = of("DOP")

                /** EGP */
                @JvmField val EGP = of("EGP")

                /** SVC */
                @JvmField val SVC = of("SVC")

                /** ERN */
                @JvmField val ERN = of("ERN")

                /** SZL */
                @JvmField val SZL = of("SZL")

                /** ETB */
                @JvmField val ETB = of("ETB")

                /** FKP */
                @JvmField val FKP = of("FKP")

                /** FJD */
                @JvmField val FJD = of("FJD")

                /** GMD */
                @JvmField val GMD = of("GMD")

                /** GEL */
                @JvmField val GEL = of("GEL")

                /** GHS */
                @JvmField val GHS = of("GHS")

                /** GIP */
                @JvmField val GIP = of("GIP")

                /** GTQ */
                @JvmField val GTQ = of("GTQ")

                /** GBP */
                @JvmField val GBP = of("GBP")

                /** GNF */
                @JvmField val GNF = of("GNF")

                /** GYD */
                @JvmField val GYD = of("GYD")

                /** HTG */
                @JvmField val HTG = of("HTG")

                /** HNL */
                @JvmField val HNL = of("HNL")

                /** HKD */
                @JvmField val HKD = of("HKD")

                /** HUF */
                @JvmField val HUF = of("HUF")

                /** ISK */
                @JvmField val ISK = of("ISK")

                /** IDR */
                @JvmField val IDR = of("IDR")

                /** IRR */
                @JvmField val IRR = of("IRR")

                /** IQD */
                @JvmField val IQD = of("IQD")

                /** ILS */
                @JvmField val ILS = of("ILS")

                /** JMD */
                @JvmField val JMD = of("JMD")

                /** JPY */
                @JvmField val JPY = of("JPY")

                /** JOD */
                @JvmField val JOD = of("JOD")

                /** KZT */
                @JvmField val KZT = of("KZT")

                /** KES */
                @JvmField val KES = of("KES")

                /** KPW */
                @JvmField val KPW = of("KPW")

                /** KRW */
                @JvmField val KRW = of("KRW")

                /** KWD */
                @JvmField val KWD = of("KWD")

                /** KGS */
                @JvmField val KGS = of("KGS")

                /** LAK */
                @JvmField val LAK = of("LAK")

                /** LBP */
                @JvmField val LBP = of("LBP")

                /** LSL */
                @JvmField val LSL = of("LSL")

                /** ZAR */
                @JvmField val ZAR = of("ZAR")

                /** LRD */
                @JvmField val LRD = of("LRD")

                /** LYD */
                @JvmField val LYD = of("LYD")

                /** CHF */
                @JvmField val CHF = of("CHF")

                /** MOP */
                @JvmField val MOP = of("MOP")

                /** MKD */
                @JvmField val MKD = of("MKD")

                /** MGA */
                @JvmField val MGA = of("MGA")

                /** MWK */
                @JvmField val MWK = of("MWK")

                /** MYR */
                @JvmField val MYR = of("MYR")

                /** MVR */
                @JvmField val MVR = of("MVR")

                /** MRU */
                @JvmField val MRU = of("MRU")

                /** MUR */
                @JvmField val MUR = of("MUR")

                /** MXN */
                @JvmField val MXN = of("MXN")

                /** MXV */
                @JvmField val MXV = of("MXV")

                /** MDL */
                @JvmField val MDL = of("MDL")

                /** MNT */
                @JvmField val MNT = of("MNT")

                /** MAD */
                @JvmField val MAD = of("MAD")

                /** MZN */
                @JvmField val MZN = of("MZN")

                /** MMK */
                @JvmField val MMK = of("MMK")

                /** NAD */
                @JvmField val NAD = of("NAD")

                /** NPR */
                @JvmField val NPR = of("NPR")

                /** NIO */
                @JvmField val NIO = of("NIO")

                /** NGN */
                @JvmField val NGN = of("NGN")

                /** OMR */
                @JvmField val OMR = of("OMR")

                /** PKR */
                @JvmField val PKR = of("PKR")

                /** PAB */
                @JvmField val PAB = of("PAB")

                /** PGK */
                @JvmField val PGK = of("PGK")

                /** PYG */
                @JvmField val PYG = of("PYG")

                /** PEN */
                @JvmField val PEN = of("PEN")

                /** PHP */
                @JvmField val PHP = of("PHP")

                /** PLN */
                @JvmField val PLN = of("PLN")

                /** QAR */
                @JvmField val QAR = of("QAR")

                /** RON */
                @JvmField val RON = of("RON")

                /** RUB */
                @JvmField val RUB = of("RUB")

                /** RWF */
                @JvmField val RWF = of("RWF")

                /** SHP */
                @JvmField val SHP = of("SHP")

                /** WST */
                @JvmField val WST = of("WST")

                /** STN */
                @JvmField val STN = of("STN")

                /** SAR */
                @JvmField val SAR = of("SAR")

                /** RSD */
                @JvmField val RSD = of("RSD")

                /** SCR */
                @JvmField val SCR = of("SCR")

                /** SLE */
                @JvmField val SLE = of("SLE")

                /** SGD */
                @JvmField val SGD = of("SGD")

                /** SBD */
                @JvmField val SBD = of("SBD")

                /** SOS */
                @JvmField val SOS = of("SOS")

                /** SSP */
                @JvmField val SSP = of("SSP")

                /** LKR */
                @JvmField val LKR = of("LKR")

                /** SDG */
                @JvmField val SDG = of("SDG")

                /** SRD */
                @JvmField val SRD = of("SRD")

                /** SEK */
                @JvmField val SEK = of("SEK")

                /** CHE */
                @JvmField val CHE = of("CHE")

                /** CHW */
                @JvmField val CHW = of("CHW")

                /** SYP */
                @JvmField val SYP = of("SYP")

                /** TWD */
                @JvmField val TWD = of("TWD")

                /** TJS */
                @JvmField val TJS = of("TJS")

                /** TZS */
                @JvmField val TZS = of("TZS")

                /** THB */
                @JvmField val THB = of("THB")

                /** TOP */
                @JvmField val TOP = of("TOP")

                /** TTD */
                @JvmField val TTD = of("TTD")

                /** TND */
                @JvmField val TND = of("TND")

                /** TRY */
                @JvmField val TRY = of("TRY")

                /** TMT */
                @JvmField val TMT = of("TMT")

                /** UGX */
                @JvmField val UGX = of("UGX")

                /** UAH */
                @JvmField val UAH = of("UAH")

                /** AED */
                @JvmField val AED = of("AED")

                /** USN */
                @JvmField val USN = of("USN")

                /** UYU */
                @JvmField val UYU = of("UYU")

                /** UYI */
                @JvmField val UYI = of("UYI")

                /** UYW */
                @JvmField val UYW = of("UYW")

                /** UZS */
                @JvmField val UZS = of("UZS")

                /** VUV */
                @JvmField val VUV = of("VUV")

                /** VES */
                @JvmField val VES = of("VES")

                /** VED */
                @JvmField val VED = of("VED")

                /** VND */
                @JvmField val VND = of("VND")

                /** YER */
                @JvmField val YER = of("YER")

                /** ZMW */
                @JvmField val ZMW = of("ZMW")

                /** ZWG */
                @JvmField val ZWG = of("ZWG")

                @JvmStatic fun of(value: String) = Currency(JsonField.of(value))
            }

            /** An enum containing [Currency]'s known values. */
            enum class Known {
                /** AFN */
                AFN,
                /** EUR */
                EUR,
                /** ALL */
                ALL,
                /** DZD */
                DZD,
                /** USD */
                USD,
                /** AOA */
                AOA,
                /** ARS */
                ARS,
                /** AMD */
                AMD,
                /** AWG */
                AWG,
                /** AUD */
                AUD,
                /** AZN */
                AZN,
                /** BSD */
                BSD,
                /** BHD */
                BHD,
                /** BDT */
                BDT,
                /** BBD */
                BBD,
                /** BYN */
                BYN,
                /** BZD */
                BZD,
                /** BMD */
                BMD,
                /** INR */
                INR,
                /** BTN */
                BTN,
                /** BOB */
                BOB,
                /** BOV */
                BOV,
                /** BAM */
                BAM,
                /** BWP */
                BWP,
                /** NOK */
                NOK,
                /** BRL */
                BRL,
                /** BND */
                BND,
                /** BGN */
                BGN,
                /** BIF */
                BIF,
                /** CVE */
                CVE,
                /** KHR */
                KHR,
                /** CAD */
                CAD,
                /** KYD */
                KYD,
                /** CLP */
                CLP,
                /** CLF */
                CLF,
                /** CNY */
                CNY,
                /** COP */
                COP,
                /** COU */
                COU,
                /** KMF */
                KMF,
                /** CDF */
                CDF,
                /** NZD */
                NZD,
                /** CRC */
                CRC,
                /** CUP */
                CUP,
                /** CZK */
                CZK,
                /** DKK */
                DKK,
                /** DJF */
                DJF,
                /** DOP */
                DOP,
                /** EGP */
                EGP,
                /** SVC */
                SVC,
                /** ERN */
                ERN,
                /** SZL */
                SZL,
                /** ETB */
                ETB,
                /** FKP */
                FKP,
                /** FJD */
                FJD,
                /** GMD */
                GMD,
                /** GEL */
                GEL,
                /** GHS */
                GHS,
                /** GIP */
                GIP,
                /** GTQ */
                GTQ,
                /** GBP */
                GBP,
                /** GNF */
                GNF,
                /** GYD */
                GYD,
                /** HTG */
                HTG,
                /** HNL */
                HNL,
                /** HKD */
                HKD,
                /** HUF */
                HUF,
                /** ISK */
                ISK,
                /** IDR */
                IDR,
                /** IRR */
                IRR,
                /** IQD */
                IQD,
                /** ILS */
                ILS,
                /** JMD */
                JMD,
                /** JPY */
                JPY,
                /** JOD */
                JOD,
                /** KZT */
                KZT,
                /** KES */
                KES,
                /** KPW */
                KPW,
                /** KRW */
                KRW,
                /** KWD */
                KWD,
                /** KGS */
                KGS,
                /** LAK */
                LAK,
                /** LBP */
                LBP,
                /** LSL */
                LSL,
                /** ZAR */
                ZAR,
                /** LRD */
                LRD,
                /** LYD */
                LYD,
                /** CHF */
                CHF,
                /** MOP */
                MOP,
                /** MKD */
                MKD,
                /** MGA */
                MGA,
                /** MWK */
                MWK,
                /** MYR */
                MYR,
                /** MVR */
                MVR,
                /** MRU */
                MRU,
                /** MUR */
                MUR,
                /** MXN */
                MXN,
                /** MXV */
                MXV,
                /** MDL */
                MDL,
                /** MNT */
                MNT,
                /** MAD */
                MAD,
                /** MZN */
                MZN,
                /** MMK */
                MMK,
                /** NAD */
                NAD,
                /** NPR */
                NPR,
                /** NIO */
                NIO,
                /** NGN */
                NGN,
                /** OMR */
                OMR,
                /** PKR */
                PKR,
                /** PAB */
                PAB,
                /** PGK */
                PGK,
                /** PYG */
                PYG,
                /** PEN */
                PEN,
                /** PHP */
                PHP,
                /** PLN */
                PLN,
                /** QAR */
                QAR,
                /** RON */
                RON,
                /** RUB */
                RUB,
                /** RWF */
                RWF,
                /** SHP */
                SHP,
                /** WST */
                WST,
                /** STN */
                STN,
                /** SAR */
                SAR,
                /** RSD */
                RSD,
                /** SCR */
                SCR,
                /** SLE */
                SLE,
                /** SGD */
                SGD,
                /** SBD */
                SBD,
                /** SOS */
                SOS,
                /** SSP */
                SSP,
                /** LKR */
                LKR,
                /** SDG */
                SDG,
                /** SRD */
                SRD,
                /** SEK */
                SEK,
                /** CHE */
                CHE,
                /** CHW */
                CHW,
                /** SYP */
                SYP,
                /** TWD */
                TWD,
                /** TJS */
                TJS,
                /** TZS */
                TZS,
                /** THB */
                THB,
                /** TOP */
                TOP,
                /** TTD */
                TTD,
                /** TND */
                TND,
                /** TRY */
                TRY,
                /** TMT */
                TMT,
                /** UGX */
                UGX,
                /** UAH */
                UAH,
                /** AED */
                AED,
                /** USN */
                USN,
                /** UYU */
                UYU,
                /** UYI */
                UYI,
                /** UYW */
                UYW,
                /** UZS */
                UZS,
                /** VUV */
                VUV,
                /** VES */
                VES,
                /** VED */
                VED,
                /** VND */
                VND,
                /** YER */
                YER,
                /** ZMW */
                ZMW,
                /** ZWG */
                ZWG,
            }

            /**
             * An enum containing [Currency]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Currency] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /** AFN */
                AFN,
                /** EUR */
                EUR,
                /** ALL */
                ALL,
                /** DZD */
                DZD,
                /** USD */
                USD,
                /** AOA */
                AOA,
                /** ARS */
                ARS,
                /** AMD */
                AMD,
                /** AWG */
                AWG,
                /** AUD */
                AUD,
                /** AZN */
                AZN,
                /** BSD */
                BSD,
                /** BHD */
                BHD,
                /** BDT */
                BDT,
                /** BBD */
                BBD,
                /** BYN */
                BYN,
                /** BZD */
                BZD,
                /** BMD */
                BMD,
                /** INR */
                INR,
                /** BTN */
                BTN,
                /** BOB */
                BOB,
                /** BOV */
                BOV,
                /** BAM */
                BAM,
                /** BWP */
                BWP,
                /** NOK */
                NOK,
                /** BRL */
                BRL,
                /** BND */
                BND,
                /** BGN */
                BGN,
                /** BIF */
                BIF,
                /** CVE */
                CVE,
                /** KHR */
                KHR,
                /** CAD */
                CAD,
                /** KYD */
                KYD,
                /** CLP */
                CLP,
                /** CLF */
                CLF,
                /** CNY */
                CNY,
                /** COP */
                COP,
                /** COU */
                COU,
                /** KMF */
                KMF,
                /** CDF */
                CDF,
                /** NZD */
                NZD,
                /** CRC */
                CRC,
                /** CUP */
                CUP,
                /** CZK */
                CZK,
                /** DKK */
                DKK,
                /** DJF */
                DJF,
                /** DOP */
                DOP,
                /** EGP */
                EGP,
                /** SVC */
                SVC,
                /** ERN */
                ERN,
                /** SZL */
                SZL,
                /** ETB */
                ETB,
                /** FKP */
                FKP,
                /** FJD */
                FJD,
                /** GMD */
                GMD,
                /** GEL */
                GEL,
                /** GHS */
                GHS,
                /** GIP */
                GIP,
                /** GTQ */
                GTQ,
                /** GBP */
                GBP,
                /** GNF */
                GNF,
                /** GYD */
                GYD,
                /** HTG */
                HTG,
                /** HNL */
                HNL,
                /** HKD */
                HKD,
                /** HUF */
                HUF,
                /** ISK */
                ISK,
                /** IDR */
                IDR,
                /** IRR */
                IRR,
                /** IQD */
                IQD,
                /** ILS */
                ILS,
                /** JMD */
                JMD,
                /** JPY */
                JPY,
                /** JOD */
                JOD,
                /** KZT */
                KZT,
                /** KES */
                KES,
                /** KPW */
                KPW,
                /** KRW */
                KRW,
                /** KWD */
                KWD,
                /** KGS */
                KGS,
                /** LAK */
                LAK,
                /** LBP */
                LBP,
                /** LSL */
                LSL,
                /** ZAR */
                ZAR,
                /** LRD */
                LRD,
                /** LYD */
                LYD,
                /** CHF */
                CHF,
                /** MOP */
                MOP,
                /** MKD */
                MKD,
                /** MGA */
                MGA,
                /** MWK */
                MWK,
                /** MYR */
                MYR,
                /** MVR */
                MVR,
                /** MRU */
                MRU,
                /** MUR */
                MUR,
                /** MXN */
                MXN,
                /** MXV */
                MXV,
                /** MDL */
                MDL,
                /** MNT */
                MNT,
                /** MAD */
                MAD,
                /** MZN */
                MZN,
                /** MMK */
                MMK,
                /** NAD */
                NAD,
                /** NPR */
                NPR,
                /** NIO */
                NIO,
                /** NGN */
                NGN,
                /** OMR */
                OMR,
                /** PKR */
                PKR,
                /** PAB */
                PAB,
                /** PGK */
                PGK,
                /** PYG */
                PYG,
                /** PEN */
                PEN,
                /** PHP */
                PHP,
                /** PLN */
                PLN,
                /** QAR */
                QAR,
                /** RON */
                RON,
                /** RUB */
                RUB,
                /** RWF */
                RWF,
                /** SHP */
                SHP,
                /** WST */
                WST,
                /** STN */
                STN,
                /** SAR */
                SAR,
                /** RSD */
                RSD,
                /** SCR */
                SCR,
                /** SLE */
                SLE,
                /** SGD */
                SGD,
                /** SBD */
                SBD,
                /** SOS */
                SOS,
                /** SSP */
                SSP,
                /** LKR */
                LKR,
                /** SDG */
                SDG,
                /** SRD */
                SRD,
                /** SEK */
                SEK,
                /** CHE */
                CHE,
                /** CHW */
                CHW,
                /** SYP */
                SYP,
                /** TWD */
                TWD,
                /** TJS */
                TJS,
                /** TZS */
                TZS,
                /** THB */
                THB,
                /** TOP */
                TOP,
                /** TTD */
                TTD,
                /** TND */
                TND,
                /** TRY */
                TRY,
                /** TMT */
                TMT,
                /** UGX */
                UGX,
                /** UAH */
                UAH,
                /** AED */
                AED,
                /** USN */
                USN,
                /** UYU */
                UYU,
                /** UYI */
                UYI,
                /** UYW */
                UYW,
                /** UZS */
                UZS,
                /** VUV */
                VUV,
                /** VES */
                VES,
                /** VED */
                VED,
                /** VND */
                VND,
                /** YER */
                YER,
                /** ZMW */
                ZMW,
                /** ZWG */
                ZWG,
                /**
                 * An enum member indicating that [Currency] was instantiated with an unknown value.
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
                    AFN -> Value.AFN
                    EUR -> Value.EUR
                    ALL -> Value.ALL
                    DZD -> Value.DZD
                    USD -> Value.USD
                    AOA -> Value.AOA
                    ARS -> Value.ARS
                    AMD -> Value.AMD
                    AWG -> Value.AWG
                    AUD -> Value.AUD
                    AZN -> Value.AZN
                    BSD -> Value.BSD
                    BHD -> Value.BHD
                    BDT -> Value.BDT
                    BBD -> Value.BBD
                    BYN -> Value.BYN
                    BZD -> Value.BZD
                    BMD -> Value.BMD
                    INR -> Value.INR
                    BTN -> Value.BTN
                    BOB -> Value.BOB
                    BOV -> Value.BOV
                    BAM -> Value.BAM
                    BWP -> Value.BWP
                    NOK -> Value.NOK
                    BRL -> Value.BRL
                    BND -> Value.BND
                    BGN -> Value.BGN
                    BIF -> Value.BIF
                    CVE -> Value.CVE
                    KHR -> Value.KHR
                    CAD -> Value.CAD
                    KYD -> Value.KYD
                    CLP -> Value.CLP
                    CLF -> Value.CLF
                    CNY -> Value.CNY
                    COP -> Value.COP
                    COU -> Value.COU
                    KMF -> Value.KMF
                    CDF -> Value.CDF
                    NZD -> Value.NZD
                    CRC -> Value.CRC
                    CUP -> Value.CUP
                    CZK -> Value.CZK
                    DKK -> Value.DKK
                    DJF -> Value.DJF
                    DOP -> Value.DOP
                    EGP -> Value.EGP
                    SVC -> Value.SVC
                    ERN -> Value.ERN
                    SZL -> Value.SZL
                    ETB -> Value.ETB
                    FKP -> Value.FKP
                    FJD -> Value.FJD
                    GMD -> Value.GMD
                    GEL -> Value.GEL
                    GHS -> Value.GHS
                    GIP -> Value.GIP
                    GTQ -> Value.GTQ
                    GBP -> Value.GBP
                    GNF -> Value.GNF
                    GYD -> Value.GYD
                    HTG -> Value.HTG
                    HNL -> Value.HNL
                    HKD -> Value.HKD
                    HUF -> Value.HUF
                    ISK -> Value.ISK
                    IDR -> Value.IDR
                    IRR -> Value.IRR
                    IQD -> Value.IQD
                    ILS -> Value.ILS
                    JMD -> Value.JMD
                    JPY -> Value.JPY
                    JOD -> Value.JOD
                    KZT -> Value.KZT
                    KES -> Value.KES
                    KPW -> Value.KPW
                    KRW -> Value.KRW
                    KWD -> Value.KWD
                    KGS -> Value.KGS
                    LAK -> Value.LAK
                    LBP -> Value.LBP
                    LSL -> Value.LSL
                    ZAR -> Value.ZAR
                    LRD -> Value.LRD
                    LYD -> Value.LYD
                    CHF -> Value.CHF
                    MOP -> Value.MOP
                    MKD -> Value.MKD
                    MGA -> Value.MGA
                    MWK -> Value.MWK
                    MYR -> Value.MYR
                    MVR -> Value.MVR
                    MRU -> Value.MRU
                    MUR -> Value.MUR
                    MXN -> Value.MXN
                    MXV -> Value.MXV
                    MDL -> Value.MDL
                    MNT -> Value.MNT
                    MAD -> Value.MAD
                    MZN -> Value.MZN
                    MMK -> Value.MMK
                    NAD -> Value.NAD
                    NPR -> Value.NPR
                    NIO -> Value.NIO
                    NGN -> Value.NGN
                    OMR -> Value.OMR
                    PKR -> Value.PKR
                    PAB -> Value.PAB
                    PGK -> Value.PGK
                    PYG -> Value.PYG
                    PEN -> Value.PEN
                    PHP -> Value.PHP
                    PLN -> Value.PLN
                    QAR -> Value.QAR
                    RON -> Value.RON
                    RUB -> Value.RUB
                    RWF -> Value.RWF
                    SHP -> Value.SHP
                    WST -> Value.WST
                    STN -> Value.STN
                    SAR -> Value.SAR
                    RSD -> Value.RSD
                    SCR -> Value.SCR
                    SLE -> Value.SLE
                    SGD -> Value.SGD
                    SBD -> Value.SBD
                    SOS -> Value.SOS
                    SSP -> Value.SSP
                    LKR -> Value.LKR
                    SDG -> Value.SDG
                    SRD -> Value.SRD
                    SEK -> Value.SEK
                    CHE -> Value.CHE
                    CHW -> Value.CHW
                    SYP -> Value.SYP
                    TWD -> Value.TWD
                    TJS -> Value.TJS
                    TZS -> Value.TZS
                    THB -> Value.THB
                    TOP -> Value.TOP
                    TTD -> Value.TTD
                    TND -> Value.TND
                    TRY -> Value.TRY
                    TMT -> Value.TMT
                    UGX -> Value.UGX
                    UAH -> Value.UAH
                    AED -> Value.AED
                    USN -> Value.USN
                    UYU -> Value.UYU
                    UYI -> Value.UYI
                    UYW -> Value.UYW
                    UZS -> Value.UZS
                    VUV -> Value.VUV
                    VES -> Value.VES
                    VED -> Value.VED
                    VND -> Value.VND
                    YER -> Value.YER
                    ZMW -> Value.ZMW
                    ZWG -> Value.ZWG
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
                    AFN -> Known.AFN
                    EUR -> Known.EUR
                    ALL -> Known.ALL
                    DZD -> Known.DZD
                    USD -> Known.USD
                    AOA -> Known.AOA
                    ARS -> Known.ARS
                    AMD -> Known.AMD
                    AWG -> Known.AWG
                    AUD -> Known.AUD
                    AZN -> Known.AZN
                    BSD -> Known.BSD
                    BHD -> Known.BHD
                    BDT -> Known.BDT
                    BBD -> Known.BBD
                    BYN -> Known.BYN
                    BZD -> Known.BZD
                    BMD -> Known.BMD
                    INR -> Known.INR
                    BTN -> Known.BTN
                    BOB -> Known.BOB
                    BOV -> Known.BOV
                    BAM -> Known.BAM
                    BWP -> Known.BWP
                    NOK -> Known.NOK
                    BRL -> Known.BRL
                    BND -> Known.BND
                    BGN -> Known.BGN
                    BIF -> Known.BIF
                    CVE -> Known.CVE
                    KHR -> Known.KHR
                    CAD -> Known.CAD
                    KYD -> Known.KYD
                    CLP -> Known.CLP
                    CLF -> Known.CLF
                    CNY -> Known.CNY
                    COP -> Known.COP
                    COU -> Known.COU
                    KMF -> Known.KMF
                    CDF -> Known.CDF
                    NZD -> Known.NZD
                    CRC -> Known.CRC
                    CUP -> Known.CUP
                    CZK -> Known.CZK
                    DKK -> Known.DKK
                    DJF -> Known.DJF
                    DOP -> Known.DOP
                    EGP -> Known.EGP
                    SVC -> Known.SVC
                    ERN -> Known.ERN
                    SZL -> Known.SZL
                    ETB -> Known.ETB
                    FKP -> Known.FKP
                    FJD -> Known.FJD
                    GMD -> Known.GMD
                    GEL -> Known.GEL
                    GHS -> Known.GHS
                    GIP -> Known.GIP
                    GTQ -> Known.GTQ
                    GBP -> Known.GBP
                    GNF -> Known.GNF
                    GYD -> Known.GYD
                    HTG -> Known.HTG
                    HNL -> Known.HNL
                    HKD -> Known.HKD
                    HUF -> Known.HUF
                    ISK -> Known.ISK
                    IDR -> Known.IDR
                    IRR -> Known.IRR
                    IQD -> Known.IQD
                    ILS -> Known.ILS
                    JMD -> Known.JMD
                    JPY -> Known.JPY
                    JOD -> Known.JOD
                    KZT -> Known.KZT
                    KES -> Known.KES
                    KPW -> Known.KPW
                    KRW -> Known.KRW
                    KWD -> Known.KWD
                    KGS -> Known.KGS
                    LAK -> Known.LAK
                    LBP -> Known.LBP
                    LSL -> Known.LSL
                    ZAR -> Known.ZAR
                    LRD -> Known.LRD
                    LYD -> Known.LYD
                    CHF -> Known.CHF
                    MOP -> Known.MOP
                    MKD -> Known.MKD
                    MGA -> Known.MGA
                    MWK -> Known.MWK
                    MYR -> Known.MYR
                    MVR -> Known.MVR
                    MRU -> Known.MRU
                    MUR -> Known.MUR
                    MXN -> Known.MXN
                    MXV -> Known.MXV
                    MDL -> Known.MDL
                    MNT -> Known.MNT
                    MAD -> Known.MAD
                    MZN -> Known.MZN
                    MMK -> Known.MMK
                    NAD -> Known.NAD
                    NPR -> Known.NPR
                    NIO -> Known.NIO
                    NGN -> Known.NGN
                    OMR -> Known.OMR
                    PKR -> Known.PKR
                    PAB -> Known.PAB
                    PGK -> Known.PGK
                    PYG -> Known.PYG
                    PEN -> Known.PEN
                    PHP -> Known.PHP
                    PLN -> Known.PLN
                    QAR -> Known.QAR
                    RON -> Known.RON
                    RUB -> Known.RUB
                    RWF -> Known.RWF
                    SHP -> Known.SHP
                    WST -> Known.WST
                    STN -> Known.STN
                    SAR -> Known.SAR
                    RSD -> Known.RSD
                    SCR -> Known.SCR
                    SLE -> Known.SLE
                    SGD -> Known.SGD
                    SBD -> Known.SBD
                    SOS -> Known.SOS
                    SSP -> Known.SSP
                    LKR -> Known.LKR
                    SDG -> Known.SDG
                    SRD -> Known.SRD
                    SEK -> Known.SEK
                    CHE -> Known.CHE
                    CHW -> Known.CHW
                    SYP -> Known.SYP
                    TWD -> Known.TWD
                    TJS -> Known.TJS
                    TZS -> Known.TZS
                    THB -> Known.THB
                    TOP -> Known.TOP
                    TTD -> Known.TTD
                    TND -> Known.TND
                    TRY -> Known.TRY
                    TMT -> Known.TMT
                    UGX -> Known.UGX
                    UAH -> Known.UAH
                    AED -> Known.AED
                    USN -> Known.USN
                    UYU -> Known.UYU
                    UYI -> Known.UYI
                    UYW -> Known.UYW
                    UZS -> Known.UZS
                    VUV -> Known.VUV
                    VES -> Known.VES
                    VED -> Known.VED
                    VND -> Known.VND
                    YER -> Known.YER
                    ZMW -> Known.ZMW
                    ZWG -> Known.ZWG
                    else -> throw IncreaseInvalidDataException("Unknown Currency: $value")
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

            fun validate(): Currency = apply {
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

                return other is Currency && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PresentmentAmount &&
                currency == other.currency &&
                value == other.value &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(currency, value, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PresentmentAmount{currency=$currency, value=$value, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CardPushTransferCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "CardPushTransferCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
