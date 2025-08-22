// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.simulations.inboundwiretransfers

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

/** Simulates an [Inbound Wire Transfer](#inbound-wire-transfers) to your account. */
class InboundWireTransferCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The identifier of the Account Number the inbound Wire Transfer is for.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountNumberId(): String = body.accountNumberId()

    /**
     * The transfer amount in cents. Must be positive.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amount(): Long = body.amount()

    /**
     * The sending bank will set creditor_address_line1 in production. You can simulate any value
     * here.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun creditorAddressLine1(): Optional<String> = body.creditorAddressLine1()

    /**
     * The sending bank will set creditor_address_line2 in production. You can simulate any value
     * here.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun creditorAddressLine2(): Optional<String> = body.creditorAddressLine2()

    /**
     * The sending bank will set creditor_address_line3 in production. You can simulate any value
     * here.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun creditorAddressLine3(): Optional<String> = body.creditorAddressLine3()

    /**
     * The sending bank will set creditor_name in production. You can simulate any value here.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun creditorName(): Optional<String> = body.creditorName()

    /**
     * The sending bank will set debtor_address_line1 in production. You can simulate any value
     * here.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun debtorAddressLine1(): Optional<String> = body.debtorAddressLine1()

    /**
     * The sending bank will set debtor_address_line2 in production. You can simulate any value
     * here.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun debtorAddressLine2(): Optional<String> = body.debtorAddressLine2()

    /**
     * The sending bank will set debtor_address_line3 in production. You can simulate any value
     * here.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun debtorAddressLine3(): Optional<String> = body.debtorAddressLine3()

    /**
     * The sending bank will set debtor_name in production. You can simulate any value here.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun debtorName(): Optional<String> = body.debtorName()

    /**
     * The sending bank will set end_to_end_identification in production. You can simulate any value
     * here.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun endToEndIdentification(): Optional<String> = body.endToEndIdentification()

    /**
     * The sending bank will set instructing_agent_routing_number in production. You can simulate
     * any value here.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun instructingAgentRoutingNumber(): Optional<String> = body.instructingAgentRoutingNumber()

    /**
     * The sending bank will set instruction_identification in production. You can simulate any
     * value here.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun instructionIdentification(): Optional<String> = body.instructionIdentification()

    /**
     * The sending bank will set unique_end_to_end_transaction_reference in production. You can
     * simulate any value here.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun uniqueEndToEndTransactionReference(): Optional<String> =
        body.uniqueEndToEndTransactionReference()

    /**
     * The sending bank will set unstructured_remittance_information in production. You can simulate
     * any value here.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun unstructuredRemittanceInformation(): Optional<String> =
        body.unstructuredRemittanceInformation()

    /**
     * The identifier of a Wire Drawdown Request the inbound Wire Transfer is fulfilling.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun wireDrawdownRequestId(): Optional<String> = body.wireDrawdownRequestId()

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
     * Returns the raw JSON value of [endToEndIdentification].
     *
     * Unlike [endToEndIdentification], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _endToEndIdentification(): JsonField<String> = body._endToEndIdentification()

    /**
     * Returns the raw JSON value of [instructingAgentRoutingNumber].
     *
     * Unlike [instructingAgentRoutingNumber], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _instructingAgentRoutingNumber(): JsonField<String> = body._instructingAgentRoutingNumber()

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

    /**
     * Returns the raw JSON value of [wireDrawdownRequestId].
     *
     * Unlike [wireDrawdownRequestId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _wireDrawdownRequestId(): JsonField<String> = body._wireDrawdownRequestId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [InboundWireTransferCreateParams].
         *
         * The following fields are required:
         * ```java
         * .accountNumberId()
         * .amount()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InboundWireTransferCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(inboundWireTransferCreateParams: InboundWireTransferCreateParams) =
            apply {
                body = inboundWireTransferCreateParams.body.toBuilder()
                additionalHeaders = inboundWireTransferCreateParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    inboundWireTransferCreateParams.additionalQueryParams.toBuilder()
            }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [accountNumberId]
         * - [amount]
         * - [creditorAddressLine1]
         * - [creditorAddressLine2]
         * - [creditorAddressLine3]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The identifier of the Account Number the inbound Wire Transfer is for. */
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

        /** The transfer amount in cents. Must be positive. */
        fun amount(amount: Long) = apply { body.amount(amount) }

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<Long>) = apply { body.amount(amount) }

        /**
         * The sending bank will set creditor_address_line1 in production. You can simulate any
         * value here.
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
         * The sending bank will set creditor_address_line2 in production. You can simulate any
         * value here.
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
         * The sending bank will set creditor_address_line3 in production. You can simulate any
         * value here.
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

        /**
         * The sending bank will set creditor_name in production. You can simulate any value here.
         */
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

        /**
         * The sending bank will set debtor_address_line1 in production. You can simulate any value
         * here.
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
         * The sending bank will set debtor_address_line2 in production. You can simulate any value
         * here.
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

        /**
         * The sending bank will set debtor_address_line3 in production. You can simulate any value
         * here.
         */
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

        /** The sending bank will set debtor_name in production. You can simulate any value here. */
        fun debtorName(debtorName: String) = apply { body.debtorName(debtorName) }

        /**
         * Sets [Builder.debtorName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.debtorName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun debtorName(debtorName: JsonField<String>) = apply { body.debtorName(debtorName) }

        /**
         * The sending bank will set end_to_end_identification in production. You can simulate any
         * value here.
         */
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

        /**
         * The sending bank will set instructing_agent_routing_number in production. You can
         * simulate any value here.
         */
        fun instructingAgentRoutingNumber(instructingAgentRoutingNumber: String) = apply {
            body.instructingAgentRoutingNumber(instructingAgentRoutingNumber)
        }

        /**
         * Sets [Builder.instructingAgentRoutingNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.instructingAgentRoutingNumber] with a well-typed
         * [String] value instead. This method is primarily for setting the field to an undocumented
         * or not yet supported value.
         */
        fun instructingAgentRoutingNumber(instructingAgentRoutingNumber: JsonField<String>) =
            apply {
                body.instructingAgentRoutingNumber(instructingAgentRoutingNumber)
            }

        /**
         * The sending bank will set instruction_identification in production. You can simulate any
         * value here.
         */
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
         * The sending bank will set unique_end_to_end_transaction_reference in production. You can
         * simulate any value here.
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

        /**
         * The sending bank will set unstructured_remittance_information in production. You can
         * simulate any value here.
         */
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

        /** The identifier of a Wire Drawdown Request the inbound Wire Transfer is fulfilling. */
        fun wireDrawdownRequestId(wireDrawdownRequestId: String) = apply {
            body.wireDrawdownRequestId(wireDrawdownRequestId)
        }

        /**
         * Sets [Builder.wireDrawdownRequestId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.wireDrawdownRequestId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun wireDrawdownRequestId(wireDrawdownRequestId: JsonField<String>) = apply {
            body.wireDrawdownRequestId(wireDrawdownRequestId)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAlladditional_body_properties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAlladditional_body_properties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAlladditional_body_properties(keys: Set<String>) = apply {
            body.removeAlladditional_body_properties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAlladditional_headers(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAlladditional_headers(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putadditional_headers(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAlladditional_headers(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAlladditional_headers(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceadditional_headers(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceadditional_headers(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAlladditional_headers(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAlladditional_headers(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeadditional_headers(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAlladditional_headers(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAlladditional_query_params(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAlladditional_query_params(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putadditional_query_params(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAlladditional_query_params(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAlladditional_query_params(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceadditional_query_params(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceadditional_query_params(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAlladditional_query_params(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAlladditional_query_params(
            additionalQueryParams: Map<String, Iterable<String>>
        ) = apply { this.additionalQueryParams.replaceAll(additionalQueryParams) }

        fun removeadditional_query_params(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAlladditional_query_params(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [InboundWireTransferCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .accountNumberId()
         * .amount()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): InboundWireTransferCreateParams =
            InboundWireTransferCreateParams(
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
        private val creditorAddressLine1: JsonField<String>,
        private val creditorAddressLine2: JsonField<String>,
        private val creditorAddressLine3: JsonField<String>,
        private val creditorName: JsonField<String>,
        private val debtorAddressLine1: JsonField<String>,
        private val debtorAddressLine2: JsonField<String>,
        private val debtorAddressLine3: JsonField<String>,
        private val debtorName: JsonField<String>,
        private val endToEndIdentification: JsonField<String>,
        private val instructingAgentRoutingNumber: JsonField<String>,
        private val instructionIdentification: JsonField<String>,
        private val uniqueEndToEndTransactionReference: JsonField<String>,
        private val unstructuredRemittanceInformation: JsonField<String>,
        private val wireDrawdownRequestId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("account_number_id")
            @ExcludeMissing
            accountNumberId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
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
            @JsonProperty("end_to_end_identification")
            @ExcludeMissing
            endToEndIdentification: JsonField<String> = JsonMissing.of(),
            @JsonProperty("instructing_agent_routing_number")
            @ExcludeMissing
            instructingAgentRoutingNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("instruction_identification")
            @ExcludeMissing
            instructionIdentification: JsonField<String> = JsonMissing.of(),
            @JsonProperty("unique_end_to_end_transaction_reference")
            @ExcludeMissing
            uniqueEndToEndTransactionReference: JsonField<String> = JsonMissing.of(),
            @JsonProperty("unstructured_remittance_information")
            @ExcludeMissing
            unstructuredRemittanceInformation: JsonField<String> = JsonMissing.of(),
            @JsonProperty("wire_drawdown_request_id")
            @ExcludeMissing
            wireDrawdownRequestId: JsonField<String> = JsonMissing.of(),
        ) : this(
            accountNumberId,
            amount,
            creditorAddressLine1,
            creditorAddressLine2,
            creditorAddressLine3,
            creditorName,
            debtorAddressLine1,
            debtorAddressLine2,
            debtorAddressLine3,
            debtorName,
            endToEndIdentification,
            instructingAgentRoutingNumber,
            instructionIdentification,
            uniqueEndToEndTransactionReference,
            unstructuredRemittanceInformation,
            wireDrawdownRequestId,
            mutableMapOf(),
        )

        /**
         * The identifier of the Account Number the inbound Wire Transfer is for.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun accountNumberId(): String = accountNumberId.getRequired("account_number_id")

        /**
         * The transfer amount in cents. Must be positive.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun amount(): Long = amount.getRequired("amount")

        /**
         * The sending bank will set creditor_address_line1 in production. You can simulate any
         * value here.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun creditorAddressLine1(): Optional<String> =
            creditorAddressLine1.getOptional("creditor_address_line1")

        /**
         * The sending bank will set creditor_address_line2 in production. You can simulate any
         * value here.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun creditorAddressLine2(): Optional<String> =
            creditorAddressLine2.getOptional("creditor_address_line2")

        /**
         * The sending bank will set creditor_address_line3 in production. You can simulate any
         * value here.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun creditorAddressLine3(): Optional<String> =
            creditorAddressLine3.getOptional("creditor_address_line3")

        /**
         * The sending bank will set creditor_name in production. You can simulate any value here.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun creditorName(): Optional<String> = creditorName.getOptional("creditor_name")

        /**
         * The sending bank will set debtor_address_line1 in production. You can simulate any value
         * here.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun debtorAddressLine1(): Optional<String> =
            debtorAddressLine1.getOptional("debtor_address_line1")

        /**
         * The sending bank will set debtor_address_line2 in production. You can simulate any value
         * here.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun debtorAddressLine2(): Optional<String> =
            debtorAddressLine2.getOptional("debtor_address_line2")

        /**
         * The sending bank will set debtor_address_line3 in production. You can simulate any value
         * here.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun debtorAddressLine3(): Optional<String> =
            debtorAddressLine3.getOptional("debtor_address_line3")

        /**
         * The sending bank will set debtor_name in production. You can simulate any value here.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun debtorName(): Optional<String> = debtorName.getOptional("debtor_name")

        /**
         * The sending bank will set end_to_end_identification in production. You can simulate any
         * value here.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun endToEndIdentification(): Optional<String> =
            endToEndIdentification.getOptional("end_to_end_identification")

        /**
         * The sending bank will set instructing_agent_routing_number in production. You can
         * simulate any value here.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun instructingAgentRoutingNumber(): Optional<String> =
            instructingAgentRoutingNumber.getOptional("instructing_agent_routing_number")

        /**
         * The sending bank will set instruction_identification in production. You can simulate any
         * value here.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun instructionIdentification(): Optional<String> =
            instructionIdentification.getOptional("instruction_identification")

        /**
         * The sending bank will set unique_end_to_end_transaction_reference in production. You can
         * simulate any value here.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun uniqueEndToEndTransactionReference(): Optional<String> =
            uniqueEndToEndTransactionReference.getOptional(
                "unique_end_to_end_transaction_reference"
            )

        /**
         * The sending bank will set unstructured_remittance_information in production. You can
         * simulate any value here.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun unstructuredRemittanceInformation(): Optional<String> =
            unstructuredRemittanceInformation.getOptional("unstructured_remittance_information")

        /**
         * The identifier of a Wire Drawdown Request the inbound Wire Transfer is fulfilling.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun wireDrawdownRequestId(): Optional<String> =
            wireDrawdownRequestId.getOptional("wire_drawdown_request_id")

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
         * Returns the raw JSON value of [endToEndIdentification].
         *
         * Unlike [endToEndIdentification], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("end_to_end_identification")
        @ExcludeMissing
        fun _endToEndIdentification(): JsonField<String> = endToEndIdentification

        /**
         * Returns the raw JSON value of [instructingAgentRoutingNumber].
         *
         * Unlike [instructingAgentRoutingNumber], this method doesn't throw if the JSON field has
         * an unexpected type.
         */
        @JsonProperty("instructing_agent_routing_number")
        @ExcludeMissing
        fun _instructingAgentRoutingNumber(): JsonField<String> = instructingAgentRoutingNumber

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

        /**
         * Returns the raw JSON value of [wireDrawdownRequestId].
         *
         * Unlike [wireDrawdownRequestId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("wire_drawdown_request_id")
        @ExcludeMissing
        fun _wireDrawdownRequestId(): JsonField<String> = wireDrawdownRequestId

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
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var accountNumberId: JsonField<String>? = null
            private var amount: JsonField<Long>? = null
            private var creditorAddressLine1: JsonField<String> = JsonMissing.of()
            private var creditorAddressLine2: JsonField<String> = JsonMissing.of()
            private var creditorAddressLine3: JsonField<String> = JsonMissing.of()
            private var creditorName: JsonField<String> = JsonMissing.of()
            private var debtorAddressLine1: JsonField<String> = JsonMissing.of()
            private var debtorAddressLine2: JsonField<String> = JsonMissing.of()
            private var debtorAddressLine3: JsonField<String> = JsonMissing.of()
            private var debtorName: JsonField<String> = JsonMissing.of()
            private var endToEndIdentification: JsonField<String> = JsonMissing.of()
            private var instructingAgentRoutingNumber: JsonField<String> = JsonMissing.of()
            private var instructionIdentification: JsonField<String> = JsonMissing.of()
            private var uniqueEndToEndTransactionReference: JsonField<String> = JsonMissing.of()
            private var unstructuredRemittanceInformation: JsonField<String> = JsonMissing.of()
            private var wireDrawdownRequestId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                accountNumberId = body.accountNumberId
                amount = body.amount
                creditorAddressLine1 = body.creditorAddressLine1
                creditorAddressLine2 = body.creditorAddressLine2
                creditorAddressLine3 = body.creditorAddressLine3
                creditorName = body.creditorName
                debtorAddressLine1 = body.debtorAddressLine1
                debtorAddressLine2 = body.debtorAddressLine2
                debtorAddressLine3 = body.debtorAddressLine3
                debtorName = body.debtorName
                endToEndIdentification = body.endToEndIdentification
                instructingAgentRoutingNumber = body.instructingAgentRoutingNumber
                instructionIdentification = body.instructionIdentification
                uniqueEndToEndTransactionReference = body.uniqueEndToEndTransactionReference
                unstructuredRemittanceInformation = body.unstructuredRemittanceInformation
                wireDrawdownRequestId = body.wireDrawdownRequestId
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The identifier of the Account Number the inbound Wire Transfer is for. */
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

            /** The transfer amount in cents. Must be positive. */
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
             * The sending bank will set creditor_address_line1 in production. You can simulate any
             * value here.
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
             * The sending bank will set creditor_address_line2 in production. You can simulate any
             * value here.
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
             * The sending bank will set creditor_address_line3 in production. You can simulate any
             * value here.
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

            /**
             * The sending bank will set creditor_name in production. You can simulate any value
             * here.
             */
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

            /**
             * The sending bank will set debtor_address_line1 in production. You can simulate any
             * value here.
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
             * The sending bank will set debtor_address_line2 in production. You can simulate any
             * value here.
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

            /**
             * The sending bank will set debtor_address_line3 in production. You can simulate any
             * value here.
             */
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

            /**
             * The sending bank will set debtor_name in production. You can simulate any value here.
             */
            fun debtorName(debtorName: String) = debtorName(JsonField.of(debtorName))

            /**
             * Sets [Builder.debtorName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.debtorName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun debtorName(debtorName: JsonField<String>) = apply { this.debtorName = debtorName }

            /**
             * The sending bank will set end_to_end_identification in production. You can simulate
             * any value here.
             */
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

            /**
             * The sending bank will set instructing_agent_routing_number in production. You can
             * simulate any value here.
             */
            fun instructingAgentRoutingNumber(instructingAgentRoutingNumber: String) =
                instructingAgentRoutingNumber(JsonField.of(instructingAgentRoutingNumber))

            /**
             * Sets [Builder.instructingAgentRoutingNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.instructingAgentRoutingNumber] with a well-typed
             * [String] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun instructingAgentRoutingNumber(instructingAgentRoutingNumber: JsonField<String>) =
                apply {
                    this.instructingAgentRoutingNumber = instructingAgentRoutingNumber
                }

            /**
             * The sending bank will set instruction_identification in production. You can simulate
             * any value here.
             */
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
             * The sending bank will set unique_end_to_end_transaction_reference in production. You
             * can simulate any value here.
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

            /**
             * The sending bank will set unstructured_remittance_information in production. You can
             * simulate any value here.
             */
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

            /**
             * The identifier of a Wire Drawdown Request the inbound Wire Transfer is fulfilling.
             */
            fun wireDrawdownRequestId(wireDrawdownRequestId: String) =
                wireDrawdownRequestId(JsonField.of(wireDrawdownRequestId))

            /**
             * Sets [Builder.wireDrawdownRequestId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.wireDrawdownRequestId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun wireDrawdownRequestId(wireDrawdownRequestId: JsonField<String>) = apply {
                this.wireDrawdownRequestId = wireDrawdownRequestId
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAlladditional_properties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAlladditional_properties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAlladditional_properties(keys: Set<String>) = apply {
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
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("accountNumberId", accountNumberId),
                    checkRequired("amount", amount),
                    creditorAddressLine1,
                    creditorAddressLine2,
                    creditorAddressLine3,
                    creditorName,
                    debtorAddressLine1,
                    debtorAddressLine2,
                    debtorAddressLine3,
                    debtorName,
                    endToEndIdentification,
                    instructingAgentRoutingNumber,
                    instructionIdentification,
                    uniqueEndToEndTransactionReference,
                    unstructuredRemittanceInformation,
                    wireDrawdownRequestId,
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
            creditorAddressLine1()
            creditorAddressLine2()
            creditorAddressLine3()
            creditorName()
            debtorAddressLine1()
            debtorAddressLine2()
            debtorAddressLine3()
            debtorName()
            endToEndIdentification()
            instructingAgentRoutingNumber()
            instructionIdentification()
            uniqueEndToEndTransactionReference()
            unstructuredRemittanceInformation()
            wireDrawdownRequestId()
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
                (if (creditorAddressLine1.asKnown().isPresent) 1 else 0) +
                (if (creditorAddressLine2.asKnown().isPresent) 1 else 0) +
                (if (creditorAddressLine3.asKnown().isPresent) 1 else 0) +
                (if (creditorName.asKnown().isPresent) 1 else 0) +
                (if (debtorAddressLine1.asKnown().isPresent) 1 else 0) +
                (if (debtorAddressLine2.asKnown().isPresent) 1 else 0) +
                (if (debtorAddressLine3.asKnown().isPresent) 1 else 0) +
                (if (debtorName.asKnown().isPresent) 1 else 0) +
                (if (endToEndIdentification.asKnown().isPresent) 1 else 0) +
                (if (instructingAgentRoutingNumber.asKnown().isPresent) 1 else 0) +
                (if (instructionIdentification.asKnown().isPresent) 1 else 0) +
                (if (uniqueEndToEndTransactionReference.asKnown().isPresent) 1 else 0) +
                (if (unstructuredRemittanceInformation.asKnown().isPresent) 1 else 0) +
                (if (wireDrawdownRequestId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                accountNumberId == other.accountNumberId &&
                amount == other.amount &&
                creditorAddressLine1 == other.creditorAddressLine1 &&
                creditorAddressLine2 == other.creditorAddressLine2 &&
                creditorAddressLine3 == other.creditorAddressLine3 &&
                creditorName == other.creditorName &&
                debtorAddressLine1 == other.debtorAddressLine1 &&
                debtorAddressLine2 == other.debtorAddressLine2 &&
                debtorAddressLine3 == other.debtorAddressLine3 &&
                debtorName == other.debtorName &&
                endToEndIdentification == other.endToEndIdentification &&
                instructingAgentRoutingNumber == other.instructingAgentRoutingNumber &&
                instructionIdentification == other.instructionIdentification &&
                uniqueEndToEndTransactionReference == other.uniqueEndToEndTransactionReference &&
                unstructuredRemittanceInformation == other.unstructuredRemittanceInformation &&
                wireDrawdownRequestId == other.wireDrawdownRequestId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                accountNumberId,
                amount,
                creditorAddressLine1,
                creditorAddressLine2,
                creditorAddressLine3,
                creditorName,
                debtorAddressLine1,
                debtorAddressLine2,
                debtorAddressLine3,
                debtorName,
                endToEndIdentification,
                instructingAgentRoutingNumber,
                instructionIdentification,
                uniqueEndToEndTransactionReference,
                unstructuredRemittanceInformation,
                wireDrawdownRequestId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{accountNumberId=$accountNumberId, amount=$amount, creditorAddressLine1=$creditorAddressLine1, creditorAddressLine2=$creditorAddressLine2, creditorAddressLine3=$creditorAddressLine3, creditorName=$creditorName, debtorAddressLine1=$debtorAddressLine1, debtorAddressLine2=$debtorAddressLine2, debtorAddressLine3=$debtorAddressLine3, debtorName=$debtorName, endToEndIdentification=$endToEndIdentification, instructingAgentRoutingNumber=$instructingAgentRoutingNumber, instructionIdentification=$instructionIdentification, uniqueEndToEndTransactionReference=$uniqueEndToEndTransactionReference, unstructuredRemittanceInformation=$unstructuredRemittanceInformation, wireDrawdownRequestId=$wireDrawdownRequestId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InboundWireTransferCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "InboundWireTransferCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
