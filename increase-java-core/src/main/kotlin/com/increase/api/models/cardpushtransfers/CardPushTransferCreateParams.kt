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
     * The transfer amount in USD cents. For Card Push transfers, must be positive.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amount(): Long = body.amount()

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
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _amount(): JsonField<Long> = body._amount()

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
         * .amount()
         * .businessApplicationIdentifier()
         * .cardTokenId()
         * .merchantCategoryCode()
         * .merchantCityName()
         * .merchantName()
         * .merchantNamePrefix()
         * .merchantPostalCode()
         * .merchantState()
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
         * - [amount]
         * - [businessApplicationIdentifier]
         * - [cardTokenId]
         * - [merchantCategoryCode]
         * - [merchantCityName]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The transfer amount in USD cents. For Card Push transfers, must be positive. */
        fun amount(amount: Long) = apply { body.amount(amount) }

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<Long>) = apply { body.amount(amount) }

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
         * .amount()
         * .businessApplicationIdentifier()
         * .cardTokenId()
         * .merchantCategoryCode()
         * .merchantCityName()
         * .merchantName()
         * .merchantNamePrefix()
         * .merchantPostalCode()
         * .merchantState()
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
        private val amount: JsonField<Long>,
        private val businessApplicationIdentifier: JsonField<BusinessApplicationIdentifier>,
        private val cardTokenId: JsonField<String>,
        private val merchantCategoryCode: JsonField<String>,
        private val merchantCityName: JsonField<String>,
        private val merchantName: JsonField<String>,
        private val merchantNamePrefix: JsonField<String>,
        private val merchantPostalCode: JsonField<String>,
        private val merchantState: JsonField<String>,
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
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
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
            amount,
            businessApplicationIdentifier,
            cardTokenId,
            merchantCategoryCode,
            merchantCityName,
            merchantName,
            merchantNamePrefix,
            merchantPostalCode,
            merchantState,
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
         * The transfer amount in USD cents. For Card Push transfers, must be positive.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun amount(): Long = amount.getRequired("amount")

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
         * Returns the raw JSON value of [amount].
         *
         * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

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
             * .amount()
             * .businessApplicationIdentifier()
             * .cardTokenId()
             * .merchantCategoryCode()
             * .merchantCityName()
             * .merchantName()
             * .merchantNamePrefix()
             * .merchantPostalCode()
             * .merchantState()
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

            private var amount: JsonField<Long>? = null
            private var businessApplicationIdentifier: JsonField<BusinessApplicationIdentifier>? =
                null
            private var cardTokenId: JsonField<String>? = null
            private var merchantCategoryCode: JsonField<String>? = null
            private var merchantCityName: JsonField<String>? = null
            private var merchantName: JsonField<String>? = null
            private var merchantNamePrefix: JsonField<String>? = null
            private var merchantPostalCode: JsonField<String>? = null
            private var merchantState: JsonField<String>? = null
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
                amount = body.amount
                businessApplicationIdentifier = body.businessApplicationIdentifier
                cardTokenId = body.cardTokenId
                merchantCategoryCode = body.merchantCategoryCode
                merchantCityName = body.merchantCityName
                merchantName = body.merchantName
                merchantNamePrefix = body.merchantNamePrefix
                merchantPostalCode = body.merchantPostalCode
                merchantState = body.merchantState
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

            /** The transfer amount in USD cents. For Card Push transfers, must be positive. */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

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
             * .amount()
             * .businessApplicationIdentifier()
             * .cardTokenId()
             * .merchantCategoryCode()
             * .merchantCityName()
             * .merchantName()
             * .merchantNamePrefix()
             * .merchantPostalCode()
             * .merchantState()
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
                    checkRequired("amount", amount),
                    checkRequired("businessApplicationIdentifier", businessApplicationIdentifier),
                    checkRequired("cardTokenId", cardTokenId),
                    checkRequired("merchantCategoryCode", merchantCategoryCode),
                    checkRequired("merchantCityName", merchantCityName),
                    checkRequired("merchantName", merchantName),
                    checkRequired("merchantNamePrefix", merchantNamePrefix),
                    checkRequired("merchantPostalCode", merchantPostalCode),
                    checkRequired("merchantState", merchantState),
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

            amount()
            businessApplicationIdentifier().validate()
            cardTokenId()
            merchantCategoryCode()
            merchantCityName()
            merchantName()
            merchantNamePrefix()
            merchantPostalCode()
            merchantState()
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
            (if (amount.asKnown().isPresent) 1 else 0) +
                (businessApplicationIdentifier.asKnown().getOrNull()?.validity() ?: 0) +
                (if (cardTokenId.asKnown().isPresent) 1 else 0) +
                (if (merchantCategoryCode.asKnown().isPresent) 1 else 0) +
                (if (merchantCityName.asKnown().isPresent) 1 else 0) +
                (if (merchantName.asKnown().isPresent) 1 else 0) +
                (if (merchantNamePrefix.asKnown().isPresent) 1 else 0) +
                (if (merchantPostalCode.asKnown().isPresent) 1 else 0) +
                (if (merchantState.asKnown().isPresent) 1 else 0) +
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
                amount == other.amount &&
                businessApplicationIdentifier == other.businessApplicationIdentifier &&
                cardTokenId == other.cardTokenId &&
                merchantCategoryCode == other.merchantCategoryCode &&
                merchantCityName == other.merchantCityName &&
                merchantName == other.merchantName &&
                merchantNamePrefix == other.merchantNamePrefix &&
                merchantPostalCode == other.merchantPostalCode &&
                merchantState == other.merchantState &&
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
                amount,
                businessApplicationIdentifier,
                cardTokenId,
                merchantCategoryCode,
                merchantCityName,
                merchantName,
                merchantNamePrefix,
                merchantPostalCode,
                merchantState,
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
            "Body{amount=$amount, businessApplicationIdentifier=$businessApplicationIdentifier, cardTokenId=$cardTokenId, merchantCategoryCode=$merchantCategoryCode, merchantCityName=$merchantCityName, merchantName=$merchantName, merchantNamePrefix=$merchantNamePrefix, merchantPostalCode=$merchantPostalCode, merchantState=$merchantState, recipientName=$recipientName, senderAddressCity=$senderAddressCity, senderAddressLine1=$senderAddressLine1, senderAddressPostalCode=$senderAddressPostalCode, senderAddressState=$senderAddressState, senderName=$senderName, sourceAccountNumberId=$sourceAccountNumberId, requireApproval=$requireApproval, additionalProperties=$additionalProperties}"
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
