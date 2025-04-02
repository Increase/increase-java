// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.wiredrawdownrequests

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

/** Create a Wire Drawdown Request */
class WireDrawdownRequestCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The Account Number to which the recipient should send funds.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountNumberId(): String = body.accountNumberId()

    /**
     * The amount requested from the recipient, in USD cents.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amount(): Long = body.amount()

    /**
     * A message the recipient will see as part of the request.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun messageToRecipient(): String = body.messageToRecipient()

    /**
     * The drawdown request's recipient's account number.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun recipientAccountNumber(): String = body.recipientAccountNumber()

    /**
     * The drawdown request's recipient's name.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun recipientName(): String = body.recipientName()

    /**
     * The drawdown request's recipient's routing number.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun recipientRoutingNumber(): String = body.recipientRoutingNumber()

    /**
     * The drawdown request originator's address line 1. This is only necessary if you're requesting
     * a payment to a commingled account. Otherwise, we'll use the associated entity's details.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun originatorAddressLine1(): Optional<String> = body.originatorAddressLine1()

    /**
     * The drawdown request originator's address line 2. This is only necessary if you're requesting
     * a payment to a commingled account. Otherwise, we'll use the associated entity's details.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun originatorAddressLine2(): Optional<String> = body.originatorAddressLine2()

    /**
     * The drawdown request originator's address line 3. This is only necessary if you're requesting
     * a payment to a commingled account. Otherwise, we'll use the associated entity's details.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun originatorAddressLine3(): Optional<String> = body.originatorAddressLine3()

    /**
     * The drawdown request originator's name. This is only necessary if you're requesting a payment
     * to a commingled account. Otherwise, we'll use the associated entity's details.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun originatorName(): Optional<String> = body.originatorName()

    /**
     * Line 1 of the drawdown request's recipient's address.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recipientAddressLine1(): Optional<String> = body.recipientAddressLine1()

    /**
     * Line 2 of the drawdown request's recipient's address.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recipientAddressLine2(): Optional<String> = body.recipientAddressLine2()

    /**
     * Line 3 of the drawdown request's recipient's address.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recipientAddressLine3(): Optional<String> = body.recipientAddressLine3()

    /**
     * Returns the raw JSON value of [accountNumberId].
     *
     * Unlike [accountNumberId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _accountNumberId(): JsonField<String> = body._accountNumberId()

    /**
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _amount(): JsonField<Long> = body._amount()

    /**
     * Returns the raw JSON value of [messageToRecipient].
     *
     * Unlike [messageToRecipient], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _messageToRecipient(): JsonField<String> = body._messageToRecipient()

    /**
     * Returns the raw JSON value of [recipientAccountNumber].
     *
     * Unlike [recipientAccountNumber], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _recipientAccountNumber(): JsonField<String> = body._recipientAccountNumber()

    /**
     * Returns the raw JSON value of [recipientName].
     *
     * Unlike [recipientName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _recipientName(): JsonField<String> = body._recipientName()

    /**
     * Returns the raw JSON value of [recipientRoutingNumber].
     *
     * Unlike [recipientRoutingNumber], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _recipientRoutingNumber(): JsonField<String> = body._recipientRoutingNumber()

    /**
     * Returns the raw JSON value of [originatorAddressLine1].
     *
     * Unlike [originatorAddressLine1], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _originatorAddressLine1(): JsonField<String> = body._originatorAddressLine1()

    /**
     * Returns the raw JSON value of [originatorAddressLine2].
     *
     * Unlike [originatorAddressLine2], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _originatorAddressLine2(): JsonField<String> = body._originatorAddressLine2()

    /**
     * Returns the raw JSON value of [originatorAddressLine3].
     *
     * Unlike [originatorAddressLine3], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _originatorAddressLine3(): JsonField<String> = body._originatorAddressLine3()

    /**
     * Returns the raw JSON value of [originatorName].
     *
     * Unlike [originatorName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _originatorName(): JsonField<String> = body._originatorName()

    /**
     * Returns the raw JSON value of [recipientAddressLine1].
     *
     * Unlike [recipientAddressLine1], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _recipientAddressLine1(): JsonField<String> = body._recipientAddressLine1()

    /**
     * Returns the raw JSON value of [recipientAddressLine2].
     *
     * Unlike [recipientAddressLine2], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _recipientAddressLine2(): JsonField<String> = body._recipientAddressLine2()

    /**
     * Returns the raw JSON value of [recipientAddressLine3].
     *
     * Unlike [recipientAddressLine3], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _recipientAddressLine3(): JsonField<String> = body._recipientAddressLine3()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [WireDrawdownRequestCreateParams].
         *
         * The following fields are required:
         * ```java
         * .accountNumberId()
         * .amount()
         * .messageToRecipient()
         * .recipientAccountNumber()
         * .recipientName()
         * .recipientRoutingNumber()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [WireDrawdownRequestCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(wireDrawdownRequestCreateParams: WireDrawdownRequestCreateParams) =
            apply {
                body = wireDrawdownRequestCreateParams.body.toBuilder()
                additionalHeaders = wireDrawdownRequestCreateParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    wireDrawdownRequestCreateParams.additionalQueryParams.toBuilder()
            }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [accountNumberId]
         * - [amount]
         * - [messageToRecipient]
         * - [recipientAccountNumber]
         * - [recipientName]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The Account Number to which the recipient should send funds. */
        fun accountNumberId(accountNumberId: String) = apply {
            body.accountNumberId(accountNumberId)
        }

        /**
         * Sets [Builder.accountNumberId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountNumberId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun accountNumberId(accountNumberId: JsonField<String>) = apply {
            body.accountNumberId(accountNumberId)
        }

        /** The amount requested from the recipient, in USD cents. */
        fun amount(amount: Long) = apply { body.amount(amount) }

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<Long>) = apply { body.amount(amount) }

        /** A message the recipient will see as part of the request. */
        fun messageToRecipient(messageToRecipient: String) = apply {
            body.messageToRecipient(messageToRecipient)
        }

        /**
         * Sets [Builder.messageToRecipient] to an arbitrary JSON value.
         *
         * You should usually call [Builder.messageToRecipient] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun messageToRecipient(messageToRecipient: JsonField<String>) = apply {
            body.messageToRecipient(messageToRecipient)
        }

        /** The drawdown request's recipient's account number. */
        fun recipientAccountNumber(recipientAccountNumber: String) = apply {
            body.recipientAccountNumber(recipientAccountNumber)
        }

        /**
         * Sets [Builder.recipientAccountNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recipientAccountNumber] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun recipientAccountNumber(recipientAccountNumber: JsonField<String>) = apply {
            body.recipientAccountNumber(recipientAccountNumber)
        }

        /** The drawdown request's recipient's name. */
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

        /** The drawdown request's recipient's routing number. */
        fun recipientRoutingNumber(recipientRoutingNumber: String) = apply {
            body.recipientRoutingNumber(recipientRoutingNumber)
        }

        /**
         * Sets [Builder.recipientRoutingNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recipientRoutingNumber] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun recipientRoutingNumber(recipientRoutingNumber: JsonField<String>) = apply {
            body.recipientRoutingNumber(recipientRoutingNumber)
        }

        /**
         * The drawdown request originator's address line 1. This is only necessary if you're
         * requesting a payment to a commingled account. Otherwise, we'll use the associated
         * entity's details.
         */
        fun originatorAddressLine1(originatorAddressLine1: String) = apply {
            body.originatorAddressLine1(originatorAddressLine1)
        }

        /**
         * Sets [Builder.originatorAddressLine1] to an arbitrary JSON value.
         *
         * You should usually call [Builder.originatorAddressLine1] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun originatorAddressLine1(originatorAddressLine1: JsonField<String>) = apply {
            body.originatorAddressLine1(originatorAddressLine1)
        }

        /**
         * The drawdown request originator's address line 2. This is only necessary if you're
         * requesting a payment to a commingled account. Otherwise, we'll use the associated
         * entity's details.
         */
        fun originatorAddressLine2(originatorAddressLine2: String) = apply {
            body.originatorAddressLine2(originatorAddressLine2)
        }

        /**
         * Sets [Builder.originatorAddressLine2] to an arbitrary JSON value.
         *
         * You should usually call [Builder.originatorAddressLine2] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun originatorAddressLine2(originatorAddressLine2: JsonField<String>) = apply {
            body.originatorAddressLine2(originatorAddressLine2)
        }

        /**
         * The drawdown request originator's address line 3. This is only necessary if you're
         * requesting a payment to a commingled account. Otherwise, we'll use the associated
         * entity's details.
         */
        fun originatorAddressLine3(originatorAddressLine3: String) = apply {
            body.originatorAddressLine3(originatorAddressLine3)
        }

        /**
         * Sets [Builder.originatorAddressLine3] to an arbitrary JSON value.
         *
         * You should usually call [Builder.originatorAddressLine3] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun originatorAddressLine3(originatorAddressLine3: JsonField<String>) = apply {
            body.originatorAddressLine3(originatorAddressLine3)
        }

        /**
         * The drawdown request originator's name. This is only necessary if you're requesting a
         * payment to a commingled account. Otherwise, we'll use the associated entity's details.
         */
        fun originatorName(originatorName: String) = apply { body.originatorName(originatorName) }

        /**
         * Sets [Builder.originatorName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.originatorName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun originatorName(originatorName: JsonField<String>) = apply {
            body.originatorName(originatorName)
        }

        /** Line 1 of the drawdown request's recipient's address. */
        fun recipientAddressLine1(recipientAddressLine1: String) = apply {
            body.recipientAddressLine1(recipientAddressLine1)
        }

        /**
         * Sets [Builder.recipientAddressLine1] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recipientAddressLine1] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun recipientAddressLine1(recipientAddressLine1: JsonField<String>) = apply {
            body.recipientAddressLine1(recipientAddressLine1)
        }

        /** Line 2 of the drawdown request's recipient's address. */
        fun recipientAddressLine2(recipientAddressLine2: String) = apply {
            body.recipientAddressLine2(recipientAddressLine2)
        }

        /**
         * Sets [Builder.recipientAddressLine2] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recipientAddressLine2] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun recipientAddressLine2(recipientAddressLine2: JsonField<String>) = apply {
            body.recipientAddressLine2(recipientAddressLine2)
        }

        /** Line 3 of the drawdown request's recipient's address. */
        fun recipientAddressLine3(recipientAddressLine3: String) = apply {
            body.recipientAddressLine3(recipientAddressLine3)
        }

        /**
         * Sets [Builder.recipientAddressLine3] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recipientAddressLine3] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun recipientAddressLine3(recipientAddressLine3: JsonField<String>) = apply {
            body.recipientAddressLine3(recipientAddressLine3)
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
         * Returns an immutable instance of [WireDrawdownRequestCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .accountNumberId()
         * .amount()
         * .messageToRecipient()
         * .recipientAccountNumber()
         * .recipientName()
         * .recipientRoutingNumber()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): WireDrawdownRequestCreateParams =
            WireDrawdownRequestCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val accountNumberId: JsonField<String>,
        private val amount: JsonField<Long>,
        private val messageToRecipient: JsonField<String>,
        private val recipientAccountNumber: JsonField<String>,
        private val recipientName: JsonField<String>,
        private val recipientRoutingNumber: JsonField<String>,
        private val originatorAddressLine1: JsonField<String>,
        private val originatorAddressLine2: JsonField<String>,
        private val originatorAddressLine3: JsonField<String>,
        private val originatorName: JsonField<String>,
        private val recipientAddressLine1: JsonField<String>,
        private val recipientAddressLine2: JsonField<String>,
        private val recipientAddressLine3: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("account_number_id")
            @ExcludeMissing
            accountNumberId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("message_to_recipient")
            @ExcludeMissing
            messageToRecipient: JsonField<String> = JsonMissing.of(),
            @JsonProperty("recipient_account_number")
            @ExcludeMissing
            recipientAccountNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("recipient_name")
            @ExcludeMissing
            recipientName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("recipient_routing_number")
            @ExcludeMissing
            recipientRoutingNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("originator_address_line1")
            @ExcludeMissing
            originatorAddressLine1: JsonField<String> = JsonMissing.of(),
            @JsonProperty("originator_address_line2")
            @ExcludeMissing
            originatorAddressLine2: JsonField<String> = JsonMissing.of(),
            @JsonProperty("originator_address_line3")
            @ExcludeMissing
            originatorAddressLine3: JsonField<String> = JsonMissing.of(),
            @JsonProperty("originator_name")
            @ExcludeMissing
            originatorName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("recipient_address_line1")
            @ExcludeMissing
            recipientAddressLine1: JsonField<String> = JsonMissing.of(),
            @JsonProperty("recipient_address_line2")
            @ExcludeMissing
            recipientAddressLine2: JsonField<String> = JsonMissing.of(),
            @JsonProperty("recipient_address_line3")
            @ExcludeMissing
            recipientAddressLine3: JsonField<String> = JsonMissing.of(),
        ) : this(
            accountNumberId,
            amount,
            messageToRecipient,
            recipientAccountNumber,
            recipientName,
            recipientRoutingNumber,
            originatorAddressLine1,
            originatorAddressLine2,
            originatorAddressLine3,
            originatorName,
            recipientAddressLine1,
            recipientAddressLine2,
            recipientAddressLine3,
            mutableMapOf(),
        )

        /**
         * The Account Number to which the recipient should send funds.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun accountNumberId(): String = accountNumberId.getRequired("account_number_id")

        /**
         * The amount requested from the recipient, in USD cents.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun amount(): Long = amount.getRequired("amount")

        /**
         * A message the recipient will see as part of the request.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun messageToRecipient(): String = messageToRecipient.getRequired("message_to_recipient")

        /**
         * The drawdown request's recipient's account number.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun recipientAccountNumber(): String =
            recipientAccountNumber.getRequired("recipient_account_number")

        /**
         * The drawdown request's recipient's name.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun recipientName(): String = recipientName.getRequired("recipient_name")

        /**
         * The drawdown request's recipient's routing number.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun recipientRoutingNumber(): String =
            recipientRoutingNumber.getRequired("recipient_routing_number")

        /**
         * The drawdown request originator's address line 1. This is only necessary if you're
         * requesting a payment to a commingled account. Otherwise, we'll use the associated
         * entity's details.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun originatorAddressLine1(): Optional<String> =
            Optional.ofNullable(originatorAddressLine1.getNullable("originator_address_line1"))

        /**
         * The drawdown request originator's address line 2. This is only necessary if you're
         * requesting a payment to a commingled account. Otherwise, we'll use the associated
         * entity's details.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun originatorAddressLine2(): Optional<String> =
            Optional.ofNullable(originatorAddressLine2.getNullable("originator_address_line2"))

        /**
         * The drawdown request originator's address line 3. This is only necessary if you're
         * requesting a payment to a commingled account. Otherwise, we'll use the associated
         * entity's details.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun originatorAddressLine3(): Optional<String> =
            Optional.ofNullable(originatorAddressLine3.getNullable("originator_address_line3"))

        /**
         * The drawdown request originator's name. This is only necessary if you're requesting a
         * payment to a commingled account. Otherwise, we'll use the associated entity's details.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun originatorName(): Optional<String> =
            Optional.ofNullable(originatorName.getNullable("originator_name"))

        /**
         * Line 1 of the drawdown request's recipient's address.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun recipientAddressLine1(): Optional<String> =
            Optional.ofNullable(recipientAddressLine1.getNullable("recipient_address_line1"))

        /**
         * Line 2 of the drawdown request's recipient's address.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun recipientAddressLine2(): Optional<String> =
            Optional.ofNullable(recipientAddressLine2.getNullable("recipient_address_line2"))

        /**
         * Line 3 of the drawdown request's recipient's address.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun recipientAddressLine3(): Optional<String> =
            Optional.ofNullable(recipientAddressLine3.getNullable("recipient_address_line3"))

        /**
         * Returns the raw JSON value of [accountNumberId].
         *
         * Unlike [accountNumberId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("account_number_id")
        @ExcludeMissing
        fun _accountNumberId(): JsonField<String> = accountNumberId

        /**
         * Returns the raw JSON value of [amount].
         *
         * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

        /**
         * Returns the raw JSON value of [messageToRecipient].
         *
         * Unlike [messageToRecipient], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("message_to_recipient")
        @ExcludeMissing
        fun _messageToRecipient(): JsonField<String> = messageToRecipient

        /**
         * Returns the raw JSON value of [recipientAccountNumber].
         *
         * Unlike [recipientAccountNumber], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("recipient_account_number")
        @ExcludeMissing
        fun _recipientAccountNumber(): JsonField<String> = recipientAccountNumber

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
         * Returns the raw JSON value of [recipientRoutingNumber].
         *
         * Unlike [recipientRoutingNumber], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("recipient_routing_number")
        @ExcludeMissing
        fun _recipientRoutingNumber(): JsonField<String> = recipientRoutingNumber

        /**
         * Returns the raw JSON value of [originatorAddressLine1].
         *
         * Unlike [originatorAddressLine1], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("originator_address_line1")
        @ExcludeMissing
        fun _originatorAddressLine1(): JsonField<String> = originatorAddressLine1

        /**
         * Returns the raw JSON value of [originatorAddressLine2].
         *
         * Unlike [originatorAddressLine2], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("originator_address_line2")
        @ExcludeMissing
        fun _originatorAddressLine2(): JsonField<String> = originatorAddressLine2

        /**
         * Returns the raw JSON value of [originatorAddressLine3].
         *
         * Unlike [originatorAddressLine3], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("originator_address_line3")
        @ExcludeMissing
        fun _originatorAddressLine3(): JsonField<String> = originatorAddressLine3

        /**
         * Returns the raw JSON value of [originatorName].
         *
         * Unlike [originatorName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("originator_name")
        @ExcludeMissing
        fun _originatorName(): JsonField<String> = originatorName

        /**
         * Returns the raw JSON value of [recipientAddressLine1].
         *
         * Unlike [recipientAddressLine1], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("recipient_address_line1")
        @ExcludeMissing
        fun _recipientAddressLine1(): JsonField<String> = recipientAddressLine1

        /**
         * Returns the raw JSON value of [recipientAddressLine2].
         *
         * Unlike [recipientAddressLine2], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("recipient_address_line2")
        @ExcludeMissing
        fun _recipientAddressLine2(): JsonField<String> = recipientAddressLine2

        /**
         * Returns the raw JSON value of [recipientAddressLine3].
         *
         * Unlike [recipientAddressLine3], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("recipient_address_line3")
        @ExcludeMissing
        fun _recipientAddressLine3(): JsonField<String> = recipientAddressLine3

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
             * .accountNumberId()
             * .amount()
             * .messageToRecipient()
             * .recipientAccountNumber()
             * .recipientName()
             * .recipientRoutingNumber()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var accountNumberId: JsonField<String>? = null
            private var amount: JsonField<Long>? = null
            private var messageToRecipient: JsonField<String>? = null
            private var recipientAccountNumber: JsonField<String>? = null
            private var recipientName: JsonField<String>? = null
            private var recipientRoutingNumber: JsonField<String>? = null
            private var originatorAddressLine1: JsonField<String> = JsonMissing.of()
            private var originatorAddressLine2: JsonField<String> = JsonMissing.of()
            private var originatorAddressLine3: JsonField<String> = JsonMissing.of()
            private var originatorName: JsonField<String> = JsonMissing.of()
            private var recipientAddressLine1: JsonField<String> = JsonMissing.of()
            private var recipientAddressLine2: JsonField<String> = JsonMissing.of()
            private var recipientAddressLine3: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                accountNumberId = body.accountNumberId
                amount = body.amount
                messageToRecipient = body.messageToRecipient
                recipientAccountNumber = body.recipientAccountNumber
                recipientName = body.recipientName
                recipientRoutingNumber = body.recipientRoutingNumber
                originatorAddressLine1 = body.originatorAddressLine1
                originatorAddressLine2 = body.originatorAddressLine2
                originatorAddressLine3 = body.originatorAddressLine3
                originatorName = body.originatorName
                recipientAddressLine1 = body.recipientAddressLine1
                recipientAddressLine2 = body.recipientAddressLine2
                recipientAddressLine3 = body.recipientAddressLine3
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The Account Number to which the recipient should send funds. */
            fun accountNumberId(accountNumberId: String) =
                accountNumberId(JsonField.of(accountNumberId))

            /**
             * Sets [Builder.accountNumberId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountNumberId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accountNumberId(accountNumberId: JsonField<String>) = apply {
                this.accountNumberId = accountNumberId
            }

            /** The amount requested from the recipient, in USD cents. */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            /** A message the recipient will see as part of the request. */
            fun messageToRecipient(messageToRecipient: String) =
                messageToRecipient(JsonField.of(messageToRecipient))

            /**
             * Sets [Builder.messageToRecipient] to an arbitrary JSON value.
             *
             * You should usually call [Builder.messageToRecipient] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun messageToRecipient(messageToRecipient: JsonField<String>) = apply {
                this.messageToRecipient = messageToRecipient
            }

            /** The drawdown request's recipient's account number. */
            fun recipientAccountNumber(recipientAccountNumber: String) =
                recipientAccountNumber(JsonField.of(recipientAccountNumber))

            /**
             * Sets [Builder.recipientAccountNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recipientAccountNumber] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun recipientAccountNumber(recipientAccountNumber: JsonField<String>) = apply {
                this.recipientAccountNumber = recipientAccountNumber
            }

            /** The drawdown request's recipient's name. */
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

            /** The drawdown request's recipient's routing number. */
            fun recipientRoutingNumber(recipientRoutingNumber: String) =
                recipientRoutingNumber(JsonField.of(recipientRoutingNumber))

            /**
             * Sets [Builder.recipientRoutingNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recipientRoutingNumber] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun recipientRoutingNumber(recipientRoutingNumber: JsonField<String>) = apply {
                this.recipientRoutingNumber = recipientRoutingNumber
            }

            /**
             * The drawdown request originator's address line 1. This is only necessary if you're
             * requesting a payment to a commingled account. Otherwise, we'll use the associated
             * entity's details.
             */
            fun originatorAddressLine1(originatorAddressLine1: String) =
                originatorAddressLine1(JsonField.of(originatorAddressLine1))

            /**
             * Sets [Builder.originatorAddressLine1] to an arbitrary JSON value.
             *
             * You should usually call [Builder.originatorAddressLine1] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun originatorAddressLine1(originatorAddressLine1: JsonField<String>) = apply {
                this.originatorAddressLine1 = originatorAddressLine1
            }

            /**
             * The drawdown request originator's address line 2. This is only necessary if you're
             * requesting a payment to a commingled account. Otherwise, we'll use the associated
             * entity's details.
             */
            fun originatorAddressLine2(originatorAddressLine2: String) =
                originatorAddressLine2(JsonField.of(originatorAddressLine2))

            /**
             * Sets [Builder.originatorAddressLine2] to an arbitrary JSON value.
             *
             * You should usually call [Builder.originatorAddressLine2] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun originatorAddressLine2(originatorAddressLine2: JsonField<String>) = apply {
                this.originatorAddressLine2 = originatorAddressLine2
            }

            /**
             * The drawdown request originator's address line 3. This is only necessary if you're
             * requesting a payment to a commingled account. Otherwise, we'll use the associated
             * entity's details.
             */
            fun originatorAddressLine3(originatorAddressLine3: String) =
                originatorAddressLine3(JsonField.of(originatorAddressLine3))

            /**
             * Sets [Builder.originatorAddressLine3] to an arbitrary JSON value.
             *
             * You should usually call [Builder.originatorAddressLine3] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun originatorAddressLine3(originatorAddressLine3: JsonField<String>) = apply {
                this.originatorAddressLine3 = originatorAddressLine3
            }

            /**
             * The drawdown request originator's name. This is only necessary if you're requesting a
             * payment to a commingled account. Otherwise, we'll use the associated entity's
             * details.
             */
            fun originatorName(originatorName: String) =
                originatorName(JsonField.of(originatorName))

            /**
             * Sets [Builder.originatorName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.originatorName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun originatorName(originatorName: JsonField<String>) = apply {
                this.originatorName = originatorName
            }

            /** Line 1 of the drawdown request's recipient's address. */
            fun recipientAddressLine1(recipientAddressLine1: String) =
                recipientAddressLine1(JsonField.of(recipientAddressLine1))

            /**
             * Sets [Builder.recipientAddressLine1] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recipientAddressLine1] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun recipientAddressLine1(recipientAddressLine1: JsonField<String>) = apply {
                this.recipientAddressLine1 = recipientAddressLine1
            }

            /** Line 2 of the drawdown request's recipient's address. */
            fun recipientAddressLine2(recipientAddressLine2: String) =
                recipientAddressLine2(JsonField.of(recipientAddressLine2))

            /**
             * Sets [Builder.recipientAddressLine2] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recipientAddressLine2] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun recipientAddressLine2(recipientAddressLine2: JsonField<String>) = apply {
                this.recipientAddressLine2 = recipientAddressLine2
            }

            /** Line 3 of the drawdown request's recipient's address. */
            fun recipientAddressLine3(recipientAddressLine3: String) =
                recipientAddressLine3(JsonField.of(recipientAddressLine3))

            /**
             * Sets [Builder.recipientAddressLine3] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recipientAddressLine3] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun recipientAddressLine3(recipientAddressLine3: JsonField<String>) = apply {
                this.recipientAddressLine3 = recipientAddressLine3
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
             * .accountNumberId()
             * .amount()
             * .messageToRecipient()
             * .recipientAccountNumber()
             * .recipientName()
             * .recipientRoutingNumber()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("accountNumberId", accountNumberId),
                    checkRequired("amount", amount),
                    checkRequired("messageToRecipient", messageToRecipient),
                    checkRequired("recipientAccountNumber", recipientAccountNumber),
                    checkRequired("recipientName", recipientName),
                    checkRequired("recipientRoutingNumber", recipientRoutingNumber),
                    originatorAddressLine1,
                    originatorAddressLine2,
                    originatorAddressLine3,
                    originatorName,
                    recipientAddressLine1,
                    recipientAddressLine2,
                    recipientAddressLine3,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            accountNumberId()
            amount()
            messageToRecipient()
            recipientAccountNumber()
            recipientName()
            recipientRoutingNumber()
            originatorAddressLine1()
            originatorAddressLine2()
            originatorAddressLine3()
            originatorName()
            recipientAddressLine1()
            recipientAddressLine2()
            recipientAddressLine3()
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
            (if (accountNumberId.asKnown().isPresent) 1 else 0) +
                (if (amount.asKnown().isPresent) 1 else 0) +
                (if (messageToRecipient.asKnown().isPresent) 1 else 0) +
                (if (recipientAccountNumber.asKnown().isPresent) 1 else 0) +
                (if (recipientName.asKnown().isPresent) 1 else 0) +
                (if (recipientRoutingNumber.asKnown().isPresent) 1 else 0) +
                (if (originatorAddressLine1.asKnown().isPresent) 1 else 0) +
                (if (originatorAddressLine2.asKnown().isPresent) 1 else 0) +
                (if (originatorAddressLine3.asKnown().isPresent) 1 else 0) +
                (if (originatorName.asKnown().isPresent) 1 else 0) +
                (if (recipientAddressLine1.asKnown().isPresent) 1 else 0) +
                (if (recipientAddressLine2.asKnown().isPresent) 1 else 0) +
                (if (recipientAddressLine3.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && accountNumberId == other.accountNumberId && amount == other.amount && messageToRecipient == other.messageToRecipient && recipientAccountNumber == other.recipientAccountNumber && recipientName == other.recipientName && recipientRoutingNumber == other.recipientRoutingNumber && originatorAddressLine1 == other.originatorAddressLine1 && originatorAddressLine2 == other.originatorAddressLine2 && originatorAddressLine3 == other.originatorAddressLine3 && originatorName == other.originatorName && recipientAddressLine1 == other.recipientAddressLine1 && recipientAddressLine2 == other.recipientAddressLine2 && recipientAddressLine3 == other.recipientAddressLine3 && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(accountNumberId, amount, messageToRecipient, recipientAccountNumber, recipientName, recipientRoutingNumber, originatorAddressLine1, originatorAddressLine2, originatorAddressLine3, originatorName, recipientAddressLine1, recipientAddressLine2, recipientAddressLine3, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{accountNumberId=$accountNumberId, amount=$amount, messageToRecipient=$messageToRecipient, recipientAccountNumber=$recipientAccountNumber, recipientName=$recipientName, recipientRoutingNumber=$recipientRoutingNumber, originatorAddressLine1=$originatorAddressLine1, originatorAddressLine2=$originatorAddressLine2, originatorAddressLine3=$originatorAddressLine3, originatorName=$originatorName, recipientAddressLine1=$recipientAddressLine1, recipientAddressLine2=$recipientAddressLine2, recipientAddressLine3=$recipientAddressLine3, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is WireDrawdownRequestCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "WireDrawdownRequestCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
