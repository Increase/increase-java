// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.simulations.inboundwiredrawdownrequests

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

/** Simulates receiving an [Inbound Wire Drawdown Request](#inbound-wire-drawdown-requests). */
class InboundWireDrawdownRequestCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The amount being requested in cents.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amount(): Long = body.amount()

    /**
     * The creditor's account number.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun creditorAccountNumber(): String = body.creditorAccountNumber()

    /**
     * The creditor's routing number.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun creditorRoutingNumber(): String = body.creditorRoutingNumber()

    /**
     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the amount being requested.
     * Will always be "USD".
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currency(): String = body.currency()

    /**
     * The Account Number to which the recipient of this request is being requested to send funds
     * from.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun recipientAccountNumberId(): String = body.recipientAccountNumberId()

    /**
     * A free-form address field set by the sender representing the first line of the creditor's
     * address.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun creditorAddressLine1(): Optional<String> = body.creditorAddressLine1()

    /**
     * A free-form address field set by the sender representing the second line of the creditor's
     * address.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun creditorAddressLine2(): Optional<String> = body.creditorAddressLine2()

    /**
     * A free-form address field set by the sender representing the third line of the creditor's
     * address.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun creditorAddressLine3(): Optional<String> = body.creditorAddressLine3()

    /**
     * A free-form name field set by the sender representing the creditor's name.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun creditorName(): Optional<String> = body.creditorName()

    /**
     * The debtor's account number.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun debtorAccountNumber(): Optional<String> = body.debtorAccountNumber()

    /**
     * A free-form address field set by the sender representing the first line of the debtor's
     * address.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun debtorAddressLine1(): Optional<String> = body.debtorAddressLine1()

    /**
     * A free-form address field set by the sender representing the second line of the debtor's
     * address.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun debtorAddressLine2(): Optional<String> = body.debtorAddressLine2()

    /**
     * A free-form address field set by the sender.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun debtorAddressLine3(): Optional<String> = body.debtorAddressLine3()

    /**
     * A free-form name field set by the sender representing the debtor's name.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun debtorName(): Optional<String> = body.debtorName()

    /**
     * The debtor's routing number.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun debtorRoutingNumber(): Optional<String> = body.debtorRoutingNumber()

    /**
     * A free-form reference string set by the sender, to help identify the transfer.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun endToEndIdentification(): Optional<String> = body.endToEndIdentification()

    /**
     * The sending bank's identifier for the wire transfer.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun instructionIdentification(): Optional<String> = body.instructionIdentification()

    /**
     * The Unique End-to-end Transaction Reference
     * ([UETR](https://www.swift.com/payments/what-unique-end-end-transaction-reference-uetr)) of
     * the transfer.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun uniqueEndToEndTransactionReference(): Optional<String> =
        body.uniqueEndToEndTransactionReference()

    /**
     * A free-form message set by the sender.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun unstructuredRemittanceInformation(): Optional<String> =
        body.unstructuredRemittanceInformation()

    /**
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _amount(): JsonField<Long> = body._amount()

    /**
     * Returns the raw JSON value of [creditorAccountNumber].
     *
     * Unlike [creditorAccountNumber], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _creditorAccountNumber(): JsonField<String> = body._creditorAccountNumber()

    /**
     * Returns the raw JSON value of [creditorRoutingNumber].
     *
     * Unlike [creditorRoutingNumber], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _creditorRoutingNumber(): JsonField<String> = body._creditorRoutingNumber()

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _currency(): JsonField<String> = body._currency()

    /**
     * Returns the raw JSON value of [recipientAccountNumberId].
     *
     * Unlike [recipientAccountNumberId], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _recipientAccountNumberId(): JsonField<String> = body._recipientAccountNumberId()

    /**
     * Returns the raw JSON value of [creditorAddressLine1].
     *
     * Unlike [creditorAddressLine1], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _creditorAddressLine1(): JsonField<String> = body._creditorAddressLine1()

    /**
     * Returns the raw JSON value of [creditorAddressLine2].
     *
     * Unlike [creditorAddressLine2], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _creditorAddressLine2(): JsonField<String> = body._creditorAddressLine2()

    /**
     * Returns the raw JSON value of [creditorAddressLine3].
     *
     * Unlike [creditorAddressLine3], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _creditorAddressLine3(): JsonField<String> = body._creditorAddressLine3()

    /**
     * Returns the raw JSON value of [creditorName].
     *
     * Unlike [creditorName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _creditorName(): JsonField<String> = body._creditorName()

    /**
     * Returns the raw JSON value of [debtorAccountNumber].
     *
     * Unlike [debtorAccountNumber], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _debtorAccountNumber(): JsonField<String> = body._debtorAccountNumber()

    /**
     * Returns the raw JSON value of [debtorAddressLine1].
     *
     * Unlike [debtorAddressLine1], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _debtorAddressLine1(): JsonField<String> = body._debtorAddressLine1()

    /**
     * Returns the raw JSON value of [debtorAddressLine2].
     *
     * Unlike [debtorAddressLine2], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _debtorAddressLine2(): JsonField<String> = body._debtorAddressLine2()

    /**
     * Returns the raw JSON value of [debtorAddressLine3].
     *
     * Unlike [debtorAddressLine3], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _debtorAddressLine3(): JsonField<String> = body._debtorAddressLine3()

    /**
     * Returns the raw JSON value of [debtorName].
     *
     * Unlike [debtorName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _debtorName(): JsonField<String> = body._debtorName()

    /**
     * Returns the raw JSON value of [debtorRoutingNumber].
     *
     * Unlike [debtorRoutingNumber], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _debtorRoutingNumber(): JsonField<String> = body._debtorRoutingNumber()

    /**
     * Returns the raw JSON value of [endToEndIdentification].
     *
     * Unlike [endToEndIdentification], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _endToEndIdentification(): JsonField<String> = body._endToEndIdentification()

    /**
     * Returns the raw JSON value of [instructionIdentification].
     *
     * Unlike [instructionIdentification], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _instructionIdentification(): JsonField<String> = body._instructionIdentification()

    /**
     * Returns the raw JSON value of [uniqueEndToEndTransactionReference].
     *
     * Unlike [uniqueEndToEndTransactionReference], this method doesn't throw if the JSON field has
     * an unexpected type.
     */
    fun _uniqueEndToEndTransactionReference(): JsonField<String> =
        body._uniqueEndToEndTransactionReference()

    /**
     * Returns the raw JSON value of [unstructuredRemittanceInformation].
     *
     * Unlike [unstructuredRemittanceInformation], this method doesn't throw if the JSON field has
     * an unexpected type.
     */
    fun _unstructuredRemittanceInformation(): JsonField<String> =
        body._unstructuredRemittanceInformation()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [InboundWireDrawdownRequestCreateParams].
         *
         * The following fields are required:
         * ```java
         * .amount()
         * .creditorAccountNumber()
         * .creditorRoutingNumber()
         * .currency()
         * .recipientAccountNumberId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InboundWireDrawdownRequestCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            inboundWireDrawdownRequestCreateParams: InboundWireDrawdownRequestCreateParams
        ) = apply {
            body = inboundWireDrawdownRequestCreateParams.body.toBuilder()
            additionalHeaders = inboundWireDrawdownRequestCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                inboundWireDrawdownRequestCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [amount]
         * - [creditorAccountNumber]
         * - [creditorRoutingNumber]
         * - [currency]
         * - [recipientAccountNumberId]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The amount being requested in cents. */
        fun amount(amount: Long) = apply { body.amount(amount) }

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<Long>) = apply { body.amount(amount) }

        /** The creditor's account number. */
        fun creditorAccountNumber(creditorAccountNumber: String) = apply {
            body.creditorAccountNumber(creditorAccountNumber)
        }

        /**
         * Sets [Builder.creditorAccountNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creditorAccountNumber] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun creditorAccountNumber(creditorAccountNumber: JsonField<String>) = apply {
            body.creditorAccountNumber(creditorAccountNumber)
        }

        /** The creditor's routing number. */
        fun creditorRoutingNumber(creditorRoutingNumber: String) = apply {
            body.creditorRoutingNumber(creditorRoutingNumber)
        }

        /**
         * Sets [Builder.creditorRoutingNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creditorRoutingNumber] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun creditorRoutingNumber(creditorRoutingNumber: JsonField<String>) = apply {
            body.creditorRoutingNumber(creditorRoutingNumber)
        }

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the amount being
         * requested. Will always be "USD".
         */
        fun currency(currency: String) = apply { body.currency(currency) }

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun currency(currency: JsonField<String>) = apply { body.currency(currency) }

        /**
         * The Account Number to which the recipient of this request is being requested to send
         * funds from.
         */
        fun recipientAccountNumberId(recipientAccountNumberId: String) = apply {
            body.recipientAccountNumberId(recipientAccountNumberId)
        }

        /**
         * Sets [Builder.recipientAccountNumberId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recipientAccountNumberId] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun recipientAccountNumberId(recipientAccountNumberId: JsonField<String>) = apply {
            body.recipientAccountNumberId(recipientAccountNumberId)
        }

        /**
         * A free-form address field set by the sender representing the first line of the creditor's
         * address.
         */
        fun creditorAddressLine1(creditorAddressLine1: String) = apply {
            body.creditorAddressLine1(creditorAddressLine1)
        }

        /**
         * Sets [Builder.creditorAddressLine1] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creditorAddressLine1] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun creditorAddressLine1(creditorAddressLine1: JsonField<String>) = apply {
            body.creditorAddressLine1(creditorAddressLine1)
        }

        /**
         * A free-form address field set by the sender representing the second line of the
         * creditor's address.
         */
        fun creditorAddressLine2(creditorAddressLine2: String) = apply {
            body.creditorAddressLine2(creditorAddressLine2)
        }

        /**
         * Sets [Builder.creditorAddressLine2] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creditorAddressLine2] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun creditorAddressLine2(creditorAddressLine2: JsonField<String>) = apply {
            body.creditorAddressLine2(creditorAddressLine2)
        }

        /**
         * A free-form address field set by the sender representing the third line of the creditor's
         * address.
         */
        fun creditorAddressLine3(creditorAddressLine3: String) = apply {
            body.creditorAddressLine3(creditorAddressLine3)
        }

        /**
         * Sets [Builder.creditorAddressLine3] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creditorAddressLine3] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun creditorAddressLine3(creditorAddressLine3: JsonField<String>) = apply {
            body.creditorAddressLine3(creditorAddressLine3)
        }

        /** A free-form name field set by the sender representing the creditor's name. */
        fun creditorName(creditorName: String) = apply { body.creditorName(creditorName) }

        /**
         * Sets [Builder.creditorName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creditorName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun creditorName(creditorName: JsonField<String>) = apply {
            body.creditorName(creditorName)
        }

        /** The debtor's account number. */
        fun debtorAccountNumber(debtorAccountNumber: String) = apply {
            body.debtorAccountNumber(debtorAccountNumber)
        }

        /**
         * Sets [Builder.debtorAccountNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.debtorAccountNumber] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun debtorAccountNumber(debtorAccountNumber: JsonField<String>) = apply {
            body.debtorAccountNumber(debtorAccountNumber)
        }

        /**
         * A free-form address field set by the sender representing the first line of the debtor's
         * address.
         */
        fun debtorAddressLine1(debtorAddressLine1: String) = apply {
            body.debtorAddressLine1(debtorAddressLine1)
        }

        /**
         * Sets [Builder.debtorAddressLine1] to an arbitrary JSON value.
         *
         * You should usually call [Builder.debtorAddressLine1] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun debtorAddressLine1(debtorAddressLine1: JsonField<String>) = apply {
            body.debtorAddressLine1(debtorAddressLine1)
        }

        /**
         * A free-form address field set by the sender representing the second line of the debtor's
         * address.
         */
        fun debtorAddressLine2(debtorAddressLine2: String) = apply {
            body.debtorAddressLine2(debtorAddressLine2)
        }

        /**
         * Sets [Builder.debtorAddressLine2] to an arbitrary JSON value.
         *
         * You should usually call [Builder.debtorAddressLine2] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun debtorAddressLine2(debtorAddressLine2: JsonField<String>) = apply {
            body.debtorAddressLine2(debtorAddressLine2)
        }

        /** A free-form address field set by the sender. */
        fun debtorAddressLine3(debtorAddressLine3: String) = apply {
            body.debtorAddressLine3(debtorAddressLine3)
        }

        /**
         * Sets [Builder.debtorAddressLine3] to an arbitrary JSON value.
         *
         * You should usually call [Builder.debtorAddressLine3] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun debtorAddressLine3(debtorAddressLine3: JsonField<String>) = apply {
            body.debtorAddressLine3(debtorAddressLine3)
        }

        /** A free-form name field set by the sender representing the debtor's name. */
        fun debtorName(debtorName: String) = apply { body.debtorName(debtorName) }

        /**
         * Sets [Builder.debtorName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.debtorName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun debtorName(debtorName: JsonField<String>) = apply { body.debtorName(debtorName) }

        /** The debtor's routing number. */
        fun debtorRoutingNumber(debtorRoutingNumber: String) = apply {
            body.debtorRoutingNumber(debtorRoutingNumber)
        }

        /**
         * Sets [Builder.debtorRoutingNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.debtorRoutingNumber] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun debtorRoutingNumber(debtorRoutingNumber: JsonField<String>) = apply {
            body.debtorRoutingNumber(debtorRoutingNumber)
        }

        /** A free-form reference string set by the sender, to help identify the transfer. */
        fun endToEndIdentification(endToEndIdentification: String) = apply {
            body.endToEndIdentification(endToEndIdentification)
        }

        /**
         * Sets [Builder.endToEndIdentification] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endToEndIdentification] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun endToEndIdentification(endToEndIdentification: JsonField<String>) = apply {
            body.endToEndIdentification(endToEndIdentification)
        }

        /** The sending bank's identifier for the wire transfer. */
        fun instructionIdentification(instructionIdentification: String) = apply {
            body.instructionIdentification(instructionIdentification)
        }

        /**
         * Sets [Builder.instructionIdentification] to an arbitrary JSON value.
         *
         * You should usually call [Builder.instructionIdentification] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun instructionIdentification(instructionIdentification: JsonField<String>) = apply {
            body.instructionIdentification(instructionIdentification)
        }

        /**
         * The Unique End-to-end Transaction Reference
         * ([UETR](https://www.swift.com/payments/what-unique-end-end-transaction-reference-uetr))
         * of the transfer.
         */
        fun uniqueEndToEndTransactionReference(uniqueEndToEndTransactionReference: String) = apply {
            body.uniqueEndToEndTransactionReference(uniqueEndToEndTransactionReference)
        }

        /**
         * Sets [Builder.uniqueEndToEndTransactionReference] to an arbitrary JSON value.
         *
         * You should usually call [Builder.uniqueEndToEndTransactionReference] with a well-typed
         * [String] value instead. This method is primarily for setting the field to an undocumented
         * or not yet supported value.
         */
        fun uniqueEndToEndTransactionReference(
            uniqueEndToEndTransactionReference: JsonField<String>
        ) = apply { body.uniqueEndToEndTransactionReference(uniqueEndToEndTransactionReference) }

        /** A free-form message set by the sender. */
        fun unstructuredRemittanceInformation(unstructuredRemittanceInformation: String) = apply {
            body.unstructuredRemittanceInformation(unstructuredRemittanceInformation)
        }

        /**
         * Sets [Builder.unstructuredRemittanceInformation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.unstructuredRemittanceInformation] with a well-typed
         * [String] value instead. This method is primarily for setting the field to an undocumented
         * or not yet supported value.
         */
        fun unstructuredRemittanceInformation(
            unstructuredRemittanceInformation: JsonField<String>
        ) = apply { body.unstructuredRemittanceInformation(unstructuredRemittanceInformation) }

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
         * Returns an immutable instance of [InboundWireDrawdownRequestCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .amount()
         * .creditorAccountNumber()
         * .creditorRoutingNumber()
         * .currency()
         * .recipientAccountNumberId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): InboundWireDrawdownRequestCreateParams =
            InboundWireDrawdownRequestCreateParams(
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
        private val creditorAccountNumber: JsonField<String>,
        private val creditorRoutingNumber: JsonField<String>,
        private val currency: JsonField<String>,
        private val recipientAccountNumberId: JsonField<String>,
        private val creditorAddressLine1: JsonField<String>,
        private val creditorAddressLine2: JsonField<String>,
        private val creditorAddressLine3: JsonField<String>,
        private val creditorName: JsonField<String>,
        private val debtorAccountNumber: JsonField<String>,
        private val debtorAddressLine1: JsonField<String>,
        private val debtorAddressLine2: JsonField<String>,
        private val debtorAddressLine3: JsonField<String>,
        private val debtorName: JsonField<String>,
        private val debtorRoutingNumber: JsonField<String>,
        private val endToEndIdentification: JsonField<String>,
        private val instructionIdentification: JsonField<String>,
        private val uniqueEndToEndTransactionReference: JsonField<String>,
        private val unstructuredRemittanceInformation: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("creditor_account_number")
            @ExcludeMissing
            creditorAccountNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("creditor_routing_number")
            @ExcludeMissing
            creditorRoutingNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<String> = JsonMissing.of(),
            @JsonProperty("recipient_account_number_id")
            @ExcludeMissing
            recipientAccountNumberId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("creditor_address_line1")
            @ExcludeMissing
            creditorAddressLine1: JsonField<String> = JsonMissing.of(),
            @JsonProperty("creditor_address_line2")
            @ExcludeMissing
            creditorAddressLine2: JsonField<String> = JsonMissing.of(),
            @JsonProperty("creditor_address_line3")
            @ExcludeMissing
            creditorAddressLine3: JsonField<String> = JsonMissing.of(),
            @JsonProperty("creditor_name")
            @ExcludeMissing
            creditorName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("debtor_account_number")
            @ExcludeMissing
            debtorAccountNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("debtor_address_line1")
            @ExcludeMissing
            debtorAddressLine1: JsonField<String> = JsonMissing.of(),
            @JsonProperty("debtor_address_line2")
            @ExcludeMissing
            debtorAddressLine2: JsonField<String> = JsonMissing.of(),
            @JsonProperty("debtor_address_line3")
            @ExcludeMissing
            debtorAddressLine3: JsonField<String> = JsonMissing.of(),
            @JsonProperty("debtor_name")
            @ExcludeMissing
            debtorName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("debtor_routing_number")
            @ExcludeMissing
            debtorRoutingNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("end_to_end_identification")
            @ExcludeMissing
            endToEndIdentification: JsonField<String> = JsonMissing.of(),
            @JsonProperty("instruction_identification")
            @ExcludeMissing
            instructionIdentification: JsonField<String> = JsonMissing.of(),
            @JsonProperty("unique_end_to_end_transaction_reference")
            @ExcludeMissing
            uniqueEndToEndTransactionReference: JsonField<String> = JsonMissing.of(),
            @JsonProperty("unstructured_remittance_information")
            @ExcludeMissing
            unstructuredRemittanceInformation: JsonField<String> = JsonMissing.of(),
        ) : this(
            amount,
            creditorAccountNumber,
            creditorRoutingNumber,
            currency,
            recipientAccountNumberId,
            creditorAddressLine1,
            creditorAddressLine2,
            creditorAddressLine3,
            creditorName,
            debtorAccountNumber,
            debtorAddressLine1,
            debtorAddressLine2,
            debtorAddressLine3,
            debtorName,
            debtorRoutingNumber,
            endToEndIdentification,
            instructionIdentification,
            uniqueEndToEndTransactionReference,
            unstructuredRemittanceInformation,
            mutableMapOf(),
        )

        /**
         * The amount being requested in cents.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun amount(): Long = amount.getRequired("amount")

        /**
         * The creditor's account number.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun creditorAccountNumber(): String =
            creditorAccountNumber.getRequired("creditor_account_number")

        /**
         * The creditor's routing number.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun creditorRoutingNumber(): String =
            creditorRoutingNumber.getRequired("creditor_routing_number")

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the amount being
         * requested. Will always be "USD".
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun currency(): String = currency.getRequired("currency")

        /**
         * The Account Number to which the recipient of this request is being requested to send
         * funds from.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun recipientAccountNumberId(): String =
            recipientAccountNumberId.getRequired("recipient_account_number_id")

        /**
         * A free-form address field set by the sender representing the first line of the creditor's
         * address.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun creditorAddressLine1(): Optional<String> =
            creditorAddressLine1.getOptional("creditor_address_line1")

        /**
         * A free-form address field set by the sender representing the second line of the
         * creditor's address.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun creditorAddressLine2(): Optional<String> =
            creditorAddressLine2.getOptional("creditor_address_line2")

        /**
         * A free-form address field set by the sender representing the third line of the creditor's
         * address.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun creditorAddressLine3(): Optional<String> =
            creditorAddressLine3.getOptional("creditor_address_line3")

        /**
         * A free-form name field set by the sender representing the creditor's name.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun creditorName(): Optional<String> = creditorName.getOptional("creditor_name")

        /**
         * The debtor's account number.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun debtorAccountNumber(): Optional<String> =
            debtorAccountNumber.getOptional("debtor_account_number")

        /**
         * A free-form address field set by the sender representing the first line of the debtor's
         * address.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun debtorAddressLine1(): Optional<String> =
            debtorAddressLine1.getOptional("debtor_address_line1")

        /**
         * A free-form address field set by the sender representing the second line of the debtor's
         * address.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun debtorAddressLine2(): Optional<String> =
            debtorAddressLine2.getOptional("debtor_address_line2")

        /**
         * A free-form address field set by the sender.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun debtorAddressLine3(): Optional<String> =
            debtorAddressLine3.getOptional("debtor_address_line3")

        /**
         * A free-form name field set by the sender representing the debtor's name.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun debtorName(): Optional<String> = debtorName.getOptional("debtor_name")

        /**
         * The debtor's routing number.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun debtorRoutingNumber(): Optional<String> =
            debtorRoutingNumber.getOptional("debtor_routing_number")

        /**
         * A free-form reference string set by the sender, to help identify the transfer.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun endToEndIdentification(): Optional<String> =
            endToEndIdentification.getOptional("end_to_end_identification")

        /**
         * The sending bank's identifier for the wire transfer.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun instructionIdentification(): Optional<String> =
            instructionIdentification.getOptional("instruction_identification")

        /**
         * The Unique End-to-end Transaction Reference
         * ([UETR](https://www.swift.com/payments/what-unique-end-end-transaction-reference-uetr))
         * of the transfer.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun uniqueEndToEndTransactionReference(): Optional<String> =
            uniqueEndToEndTransactionReference.getOptional(
                "unique_end_to_end_transaction_reference"
            )

        /**
         * A free-form message set by the sender.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun unstructuredRemittanceInformation(): Optional<String> =
            unstructuredRemittanceInformation.getOptional("unstructured_remittance_information")

        /**
         * Returns the raw JSON value of [amount].
         *
         * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

        /**
         * Returns the raw JSON value of [creditorAccountNumber].
         *
         * Unlike [creditorAccountNumber], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("creditor_account_number")
        @ExcludeMissing
        fun _creditorAccountNumber(): JsonField<String> = creditorAccountNumber

        /**
         * Returns the raw JSON value of [creditorRoutingNumber].
         *
         * Unlike [creditorRoutingNumber], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("creditor_routing_number")
        @ExcludeMissing
        fun _creditorRoutingNumber(): JsonField<String> = creditorRoutingNumber

        /**
         * Returns the raw JSON value of [currency].
         *
         * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

        /**
         * Returns the raw JSON value of [recipientAccountNumberId].
         *
         * Unlike [recipientAccountNumberId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("recipient_account_number_id")
        @ExcludeMissing
        fun _recipientAccountNumberId(): JsonField<String> = recipientAccountNumberId

        /**
         * Returns the raw JSON value of [creditorAddressLine1].
         *
         * Unlike [creditorAddressLine1], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("creditor_address_line1")
        @ExcludeMissing
        fun _creditorAddressLine1(): JsonField<String> = creditorAddressLine1

        /**
         * Returns the raw JSON value of [creditorAddressLine2].
         *
         * Unlike [creditorAddressLine2], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("creditor_address_line2")
        @ExcludeMissing
        fun _creditorAddressLine2(): JsonField<String> = creditorAddressLine2

        /**
         * Returns the raw JSON value of [creditorAddressLine3].
         *
         * Unlike [creditorAddressLine3], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("creditor_address_line3")
        @ExcludeMissing
        fun _creditorAddressLine3(): JsonField<String> = creditorAddressLine3

        /**
         * Returns the raw JSON value of [creditorName].
         *
         * Unlike [creditorName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("creditor_name")
        @ExcludeMissing
        fun _creditorName(): JsonField<String> = creditorName

        /**
         * Returns the raw JSON value of [debtorAccountNumber].
         *
         * Unlike [debtorAccountNumber], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("debtor_account_number")
        @ExcludeMissing
        fun _debtorAccountNumber(): JsonField<String> = debtorAccountNumber

        /**
         * Returns the raw JSON value of [debtorAddressLine1].
         *
         * Unlike [debtorAddressLine1], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("debtor_address_line1")
        @ExcludeMissing
        fun _debtorAddressLine1(): JsonField<String> = debtorAddressLine1

        /**
         * Returns the raw JSON value of [debtorAddressLine2].
         *
         * Unlike [debtorAddressLine2], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("debtor_address_line2")
        @ExcludeMissing
        fun _debtorAddressLine2(): JsonField<String> = debtorAddressLine2

        /**
         * Returns the raw JSON value of [debtorAddressLine3].
         *
         * Unlike [debtorAddressLine3], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("debtor_address_line3")
        @ExcludeMissing
        fun _debtorAddressLine3(): JsonField<String> = debtorAddressLine3

        /**
         * Returns the raw JSON value of [debtorName].
         *
         * Unlike [debtorName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("debtor_name")
        @ExcludeMissing
        fun _debtorName(): JsonField<String> = debtorName

        /**
         * Returns the raw JSON value of [debtorRoutingNumber].
         *
         * Unlike [debtorRoutingNumber], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("debtor_routing_number")
        @ExcludeMissing
        fun _debtorRoutingNumber(): JsonField<String> = debtorRoutingNumber

        /**
         * Returns the raw JSON value of [endToEndIdentification].
         *
         * Unlike [endToEndIdentification], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("end_to_end_identification")
        @ExcludeMissing
        fun _endToEndIdentification(): JsonField<String> = endToEndIdentification

        /**
         * Returns the raw JSON value of [instructionIdentification].
         *
         * Unlike [instructionIdentification], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("instruction_identification")
        @ExcludeMissing
        fun _instructionIdentification(): JsonField<String> = instructionIdentification

        /**
         * Returns the raw JSON value of [uniqueEndToEndTransactionReference].
         *
         * Unlike [uniqueEndToEndTransactionReference], this method doesn't throw if the JSON field
         * has an unexpected type.
         */
        @JsonProperty("unique_end_to_end_transaction_reference")
        @ExcludeMissing
        fun _uniqueEndToEndTransactionReference(): JsonField<String> =
            uniqueEndToEndTransactionReference

        /**
         * Returns the raw JSON value of [unstructuredRemittanceInformation].
         *
         * Unlike [unstructuredRemittanceInformation], this method doesn't throw if the JSON field
         * has an unexpected type.
         */
        @JsonProperty("unstructured_remittance_information")
        @ExcludeMissing
        fun _unstructuredRemittanceInformation(): JsonField<String> =
            unstructuredRemittanceInformation

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
             * .creditorAccountNumber()
             * .creditorRoutingNumber()
             * .currency()
             * .recipientAccountNumberId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var amount: JsonField<Long>? = null
            private var creditorAccountNumber: JsonField<String>? = null
            private var creditorRoutingNumber: JsonField<String>? = null
            private var currency: JsonField<String>? = null
            private var recipientAccountNumberId: JsonField<String>? = null
            private var creditorAddressLine1: JsonField<String> = JsonMissing.of()
            private var creditorAddressLine2: JsonField<String> = JsonMissing.of()
            private var creditorAddressLine3: JsonField<String> = JsonMissing.of()
            private var creditorName: JsonField<String> = JsonMissing.of()
            private var debtorAccountNumber: JsonField<String> = JsonMissing.of()
            private var debtorAddressLine1: JsonField<String> = JsonMissing.of()
            private var debtorAddressLine2: JsonField<String> = JsonMissing.of()
            private var debtorAddressLine3: JsonField<String> = JsonMissing.of()
            private var debtorName: JsonField<String> = JsonMissing.of()
            private var debtorRoutingNumber: JsonField<String> = JsonMissing.of()
            private var endToEndIdentification: JsonField<String> = JsonMissing.of()
            private var instructionIdentification: JsonField<String> = JsonMissing.of()
            private var uniqueEndToEndTransactionReference: JsonField<String> = JsonMissing.of()
            private var unstructuredRemittanceInformation: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                amount = body.amount
                creditorAccountNumber = body.creditorAccountNumber
                creditorRoutingNumber = body.creditorRoutingNumber
                currency = body.currency
                recipientAccountNumberId = body.recipientAccountNumberId
                creditorAddressLine1 = body.creditorAddressLine1
                creditorAddressLine2 = body.creditorAddressLine2
                creditorAddressLine3 = body.creditorAddressLine3
                creditorName = body.creditorName
                debtorAccountNumber = body.debtorAccountNumber
                debtorAddressLine1 = body.debtorAddressLine1
                debtorAddressLine2 = body.debtorAddressLine2
                debtorAddressLine3 = body.debtorAddressLine3
                debtorName = body.debtorName
                debtorRoutingNumber = body.debtorRoutingNumber
                endToEndIdentification = body.endToEndIdentification
                instructionIdentification = body.instructionIdentification
                uniqueEndToEndTransactionReference = body.uniqueEndToEndTransactionReference
                unstructuredRemittanceInformation = body.unstructuredRemittanceInformation
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The amount being requested in cents. */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            /** The creditor's account number. */
            fun creditorAccountNumber(creditorAccountNumber: String) =
                creditorAccountNumber(JsonField.of(creditorAccountNumber))

            /**
             * Sets [Builder.creditorAccountNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.creditorAccountNumber] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun creditorAccountNumber(creditorAccountNumber: JsonField<String>) = apply {
                this.creditorAccountNumber = creditorAccountNumber
            }

            /** The creditor's routing number. */
            fun creditorRoutingNumber(creditorRoutingNumber: String) =
                creditorRoutingNumber(JsonField.of(creditorRoutingNumber))

            /**
             * Sets [Builder.creditorRoutingNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.creditorRoutingNumber] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun creditorRoutingNumber(creditorRoutingNumber: JsonField<String>) = apply {
                this.creditorRoutingNumber = creditorRoutingNumber
            }

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the amount being
             * requested. Will always be "USD".
             */
            fun currency(currency: String) = currency(JsonField.of(currency))

            /**
             * Sets [Builder.currency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currency] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            /**
             * The Account Number to which the recipient of this request is being requested to send
             * funds from.
             */
            fun recipientAccountNumberId(recipientAccountNumberId: String) =
                recipientAccountNumberId(JsonField.of(recipientAccountNumberId))

            /**
             * Sets [Builder.recipientAccountNumberId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recipientAccountNumberId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun recipientAccountNumberId(recipientAccountNumberId: JsonField<String>) = apply {
                this.recipientAccountNumberId = recipientAccountNumberId
            }

            /**
             * A free-form address field set by the sender representing the first line of the
             * creditor's address.
             */
            fun creditorAddressLine1(creditorAddressLine1: String) =
                creditorAddressLine1(JsonField.of(creditorAddressLine1))

            /**
             * Sets [Builder.creditorAddressLine1] to an arbitrary JSON value.
             *
             * You should usually call [Builder.creditorAddressLine1] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun creditorAddressLine1(creditorAddressLine1: JsonField<String>) = apply {
                this.creditorAddressLine1 = creditorAddressLine1
            }

            /**
             * A free-form address field set by the sender representing the second line of the
             * creditor's address.
             */
            fun creditorAddressLine2(creditorAddressLine2: String) =
                creditorAddressLine2(JsonField.of(creditorAddressLine2))

            /**
             * Sets [Builder.creditorAddressLine2] to an arbitrary JSON value.
             *
             * You should usually call [Builder.creditorAddressLine2] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun creditorAddressLine2(creditorAddressLine2: JsonField<String>) = apply {
                this.creditorAddressLine2 = creditorAddressLine2
            }

            /**
             * A free-form address field set by the sender representing the third line of the
             * creditor's address.
             */
            fun creditorAddressLine3(creditorAddressLine3: String) =
                creditorAddressLine3(JsonField.of(creditorAddressLine3))

            /**
             * Sets [Builder.creditorAddressLine3] to an arbitrary JSON value.
             *
             * You should usually call [Builder.creditorAddressLine3] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun creditorAddressLine3(creditorAddressLine3: JsonField<String>) = apply {
                this.creditorAddressLine3 = creditorAddressLine3
            }

            /** A free-form name field set by the sender representing the creditor's name. */
            fun creditorName(creditorName: String) = creditorName(JsonField.of(creditorName))

            /**
             * Sets [Builder.creditorName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.creditorName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun creditorName(creditorName: JsonField<String>) = apply {
                this.creditorName = creditorName
            }

            /** The debtor's account number. */
            fun debtorAccountNumber(debtorAccountNumber: String) =
                debtorAccountNumber(JsonField.of(debtorAccountNumber))

            /**
             * Sets [Builder.debtorAccountNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.debtorAccountNumber] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun debtorAccountNumber(debtorAccountNumber: JsonField<String>) = apply {
                this.debtorAccountNumber = debtorAccountNumber
            }

            /**
             * A free-form address field set by the sender representing the first line of the
             * debtor's address.
             */
            fun debtorAddressLine1(debtorAddressLine1: String) =
                debtorAddressLine1(JsonField.of(debtorAddressLine1))

            /**
             * Sets [Builder.debtorAddressLine1] to an arbitrary JSON value.
             *
             * You should usually call [Builder.debtorAddressLine1] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun debtorAddressLine1(debtorAddressLine1: JsonField<String>) = apply {
                this.debtorAddressLine1 = debtorAddressLine1
            }

            /**
             * A free-form address field set by the sender representing the second line of the
             * debtor's address.
             */
            fun debtorAddressLine2(debtorAddressLine2: String) =
                debtorAddressLine2(JsonField.of(debtorAddressLine2))

            /**
             * Sets [Builder.debtorAddressLine2] to an arbitrary JSON value.
             *
             * You should usually call [Builder.debtorAddressLine2] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun debtorAddressLine2(debtorAddressLine2: JsonField<String>) = apply {
                this.debtorAddressLine2 = debtorAddressLine2
            }

            /** A free-form address field set by the sender. */
            fun debtorAddressLine3(debtorAddressLine3: String) =
                debtorAddressLine3(JsonField.of(debtorAddressLine3))

            /**
             * Sets [Builder.debtorAddressLine3] to an arbitrary JSON value.
             *
             * You should usually call [Builder.debtorAddressLine3] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun debtorAddressLine3(debtorAddressLine3: JsonField<String>) = apply {
                this.debtorAddressLine3 = debtorAddressLine3
            }

            /** A free-form name field set by the sender representing the debtor's name. */
            fun debtorName(debtorName: String) = debtorName(JsonField.of(debtorName))

            /**
             * Sets [Builder.debtorName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.debtorName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun debtorName(debtorName: JsonField<String>) = apply { this.debtorName = debtorName }

            /** The debtor's routing number. */
            fun debtorRoutingNumber(debtorRoutingNumber: String) =
                debtorRoutingNumber(JsonField.of(debtorRoutingNumber))

            /**
             * Sets [Builder.debtorRoutingNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.debtorRoutingNumber] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun debtorRoutingNumber(debtorRoutingNumber: JsonField<String>) = apply {
                this.debtorRoutingNumber = debtorRoutingNumber
            }

            /** A free-form reference string set by the sender, to help identify the transfer. */
            fun endToEndIdentification(endToEndIdentification: String) =
                endToEndIdentification(JsonField.of(endToEndIdentification))

            /**
             * Sets [Builder.endToEndIdentification] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endToEndIdentification] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun endToEndIdentification(endToEndIdentification: JsonField<String>) = apply {
                this.endToEndIdentification = endToEndIdentification
            }

            /** The sending bank's identifier for the wire transfer. */
            fun instructionIdentification(instructionIdentification: String) =
                instructionIdentification(JsonField.of(instructionIdentification))

            /**
             * Sets [Builder.instructionIdentification] to an arbitrary JSON value.
             *
             * You should usually call [Builder.instructionIdentification] with a well-typed
             * [String] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun instructionIdentification(instructionIdentification: JsonField<String>) = apply {
                this.instructionIdentification = instructionIdentification
            }

            /**
             * The Unique End-to-end Transaction Reference
             * ([UETR](https://www.swift.com/payments/what-unique-end-end-transaction-reference-uetr))
             * of the transfer.
             */
            fun uniqueEndToEndTransactionReference(uniqueEndToEndTransactionReference: String) =
                uniqueEndToEndTransactionReference(JsonField.of(uniqueEndToEndTransactionReference))

            /**
             * Sets [Builder.uniqueEndToEndTransactionReference] to an arbitrary JSON value.
             *
             * You should usually call [Builder.uniqueEndToEndTransactionReference] with a
             * well-typed [String] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun uniqueEndToEndTransactionReference(
                uniqueEndToEndTransactionReference: JsonField<String>
            ) = apply {
                this.uniqueEndToEndTransactionReference = uniqueEndToEndTransactionReference
            }

            /** A free-form message set by the sender. */
            fun unstructuredRemittanceInformation(unstructuredRemittanceInformation: String) =
                unstructuredRemittanceInformation(JsonField.of(unstructuredRemittanceInformation))

            /**
             * Sets [Builder.unstructuredRemittanceInformation] to an arbitrary JSON value.
             *
             * You should usually call [Builder.unstructuredRemittanceInformation] with a well-typed
             * [String] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun unstructuredRemittanceInformation(
                unstructuredRemittanceInformation: JsonField<String>
            ) = apply { this.unstructuredRemittanceInformation = unstructuredRemittanceInformation }

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
             * .creditorAccountNumber()
             * .creditorRoutingNumber()
             * .currency()
             * .recipientAccountNumberId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("amount", amount),
                    checkRequired("creditorAccountNumber", creditorAccountNumber),
                    checkRequired("creditorRoutingNumber", creditorRoutingNumber),
                    checkRequired("currency", currency),
                    checkRequired("recipientAccountNumberId", recipientAccountNumberId),
                    creditorAddressLine1,
                    creditorAddressLine2,
                    creditorAddressLine3,
                    creditorName,
                    debtorAccountNumber,
                    debtorAddressLine1,
                    debtorAddressLine2,
                    debtorAddressLine3,
                    debtorName,
                    debtorRoutingNumber,
                    endToEndIdentification,
                    instructionIdentification,
                    uniqueEndToEndTransactionReference,
                    unstructuredRemittanceInformation,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            amount()
            creditorAccountNumber()
            creditorRoutingNumber()
            currency()
            recipientAccountNumberId()
            creditorAddressLine1()
            creditorAddressLine2()
            creditorAddressLine3()
            creditorName()
            debtorAccountNumber()
            debtorAddressLine1()
            debtorAddressLine2()
            debtorAddressLine3()
            debtorName()
            debtorRoutingNumber()
            endToEndIdentification()
            instructionIdentification()
            uniqueEndToEndTransactionReference()
            unstructuredRemittanceInformation()
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
                (if (creditorAccountNumber.asKnown().isPresent) 1 else 0) +
                (if (creditorRoutingNumber.asKnown().isPresent) 1 else 0) +
                (if (currency.asKnown().isPresent) 1 else 0) +
                (if (recipientAccountNumberId.asKnown().isPresent) 1 else 0) +
                (if (creditorAddressLine1.asKnown().isPresent) 1 else 0) +
                (if (creditorAddressLine2.asKnown().isPresent) 1 else 0) +
                (if (creditorAddressLine3.asKnown().isPresent) 1 else 0) +
                (if (creditorName.asKnown().isPresent) 1 else 0) +
                (if (debtorAccountNumber.asKnown().isPresent) 1 else 0) +
                (if (debtorAddressLine1.asKnown().isPresent) 1 else 0) +
                (if (debtorAddressLine2.asKnown().isPresent) 1 else 0) +
                (if (debtorAddressLine3.asKnown().isPresent) 1 else 0) +
                (if (debtorName.asKnown().isPresent) 1 else 0) +
                (if (debtorRoutingNumber.asKnown().isPresent) 1 else 0) +
                (if (endToEndIdentification.asKnown().isPresent) 1 else 0) +
                (if (instructionIdentification.asKnown().isPresent) 1 else 0) +
                (if (uniqueEndToEndTransactionReference.asKnown().isPresent) 1 else 0) +
                (if (unstructuredRemittanceInformation.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                amount == other.amount &&
                creditorAccountNumber == other.creditorAccountNumber &&
                creditorRoutingNumber == other.creditorRoutingNumber &&
                currency == other.currency &&
                recipientAccountNumberId == other.recipientAccountNumberId &&
                creditorAddressLine1 == other.creditorAddressLine1 &&
                creditorAddressLine2 == other.creditorAddressLine2 &&
                creditorAddressLine3 == other.creditorAddressLine3 &&
                creditorName == other.creditorName &&
                debtorAccountNumber == other.debtorAccountNumber &&
                debtorAddressLine1 == other.debtorAddressLine1 &&
                debtorAddressLine2 == other.debtorAddressLine2 &&
                debtorAddressLine3 == other.debtorAddressLine3 &&
                debtorName == other.debtorName &&
                debtorRoutingNumber == other.debtorRoutingNumber &&
                endToEndIdentification == other.endToEndIdentification &&
                instructionIdentification == other.instructionIdentification &&
                uniqueEndToEndTransactionReference == other.uniqueEndToEndTransactionReference &&
                unstructuredRemittanceInformation == other.unstructuredRemittanceInformation &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                amount,
                creditorAccountNumber,
                creditorRoutingNumber,
                currency,
                recipientAccountNumberId,
                creditorAddressLine1,
                creditorAddressLine2,
                creditorAddressLine3,
                creditorName,
                debtorAccountNumber,
                debtorAddressLine1,
                debtorAddressLine2,
                debtorAddressLine3,
                debtorName,
                debtorRoutingNumber,
                endToEndIdentification,
                instructionIdentification,
                uniqueEndToEndTransactionReference,
                unstructuredRemittanceInformation,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{amount=$amount, creditorAccountNumber=$creditorAccountNumber, creditorRoutingNumber=$creditorRoutingNumber, currency=$currency, recipientAccountNumberId=$recipientAccountNumberId, creditorAddressLine1=$creditorAddressLine1, creditorAddressLine2=$creditorAddressLine2, creditorAddressLine3=$creditorAddressLine3, creditorName=$creditorName, debtorAccountNumber=$debtorAccountNumber, debtorAddressLine1=$debtorAddressLine1, debtorAddressLine2=$debtorAddressLine2, debtorAddressLine3=$debtorAddressLine3, debtorName=$debtorName, debtorRoutingNumber=$debtorRoutingNumber, endToEndIdentification=$endToEndIdentification, instructionIdentification=$instructionIdentification, uniqueEndToEndTransactionReference=$uniqueEndToEndTransactionReference, unstructuredRemittanceInformation=$unstructuredRemittanceInformation, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InboundWireDrawdownRequestCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "InboundWireDrawdownRequestCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
