// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.wiretransfers

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
import java.time.LocalDate
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Create a Wire Transfer */
class WireTransferCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The identifier for the account that will send the transfer.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountId(): String = body.accountId()

    /**
     * The transfer amount in USD cents.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amount(): Long = body.amount()

    /**
     * The beneficiary's name.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun beneficiaryName(): String = body.beneficiaryName()

    /**
     * The account number for the destination account.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accountNumber(): Optional<String> = body.accountNumber()

    /**
     * The beneficiary's address line 1.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun beneficiaryAddressLine1(): Optional<String> = body.beneficiaryAddressLine1()

    /**
     * The beneficiary's address line 2.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun beneficiaryAddressLine2(): Optional<String> = body.beneficiaryAddressLine2()

    /**
     * The beneficiary's address line 3.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun beneficiaryAddressLine3(): Optional<String> = body.beneficiaryAddressLine3()

    /**
     * The ID of an External Account to initiate a transfer to. If this parameter is provided,
     * `account_number` and `routing_number` must be absent.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun externalAccountId(): Optional<String> = body.externalAccountId()

    /**
     * The ID of an Inbound Wire Drawdown Request in response to which this transfer is being sent.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun inboundWireDrawdownRequestId(): Optional<String> = body.inboundWireDrawdownRequestId()

    /**
     * The originator's address line 1. This is only necessary if you're transferring from a
     * commingled account. Otherwise, we'll use the associated entity's details.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun originatorAddressLine1(): Optional<String> = body.originatorAddressLine1()

    /**
     * The originator's address line 2. This is only necessary if you're transferring from a
     * commingled account. Otherwise, we'll use the associated entity's details.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun originatorAddressLine2(): Optional<String> = body.originatorAddressLine2()

    /**
     * The originator's address line 3. This is only necessary if you're transferring from a
     * commingled account. Otherwise, we'll use the associated entity's details.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun originatorAddressLine3(): Optional<String> = body.originatorAddressLine3()

    /**
     * The originator's name. This is only necessary if you're transferring from a commingled
     * account. Otherwise, we'll use the associated entity's details.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun originatorName(): Optional<String> = body.originatorName()

    /**
     * Additional remittance information related to the wire transfer.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun remittance(): Optional<Remittance> = body.remittance()

    /**
     * Whether the transfer requires explicit approval via the dashboard or API.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun requireApproval(): Optional<Boolean> = body.requireApproval()

    /**
     * The American Bankers' Association (ABA) Routing Transit Number (RTN) for the destination
     * account.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun routingNumber(): Optional<String> = body.routingNumber()

    /**
     * The ID of an Account Number that will be passed to the wire's recipient
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sourceAccountNumberId(): Optional<String> = body.sourceAccountNumberId()

    /**
     * Returns the raw JSON value of [accountId].
     *
     * Unlike [accountId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _accountId(): JsonField<String> = body._accountId()

    /**
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _amount(): JsonField<Long> = body._amount()

    /**
     * Returns the raw JSON value of [beneficiaryName].
     *
     * Unlike [beneficiaryName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _beneficiaryName(): JsonField<String> = body._beneficiaryName()

    /**
     * Returns the raw JSON value of [accountNumber].
     *
     * Unlike [accountNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _accountNumber(): JsonField<String> = body._accountNumber()

    /**
     * Returns the raw JSON value of [beneficiaryAddressLine1].
     *
     * Unlike [beneficiaryAddressLine1], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _beneficiaryAddressLine1(): JsonField<String> = body._beneficiaryAddressLine1()

    /**
     * Returns the raw JSON value of [beneficiaryAddressLine2].
     *
     * Unlike [beneficiaryAddressLine2], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _beneficiaryAddressLine2(): JsonField<String> = body._beneficiaryAddressLine2()

    /**
     * Returns the raw JSON value of [beneficiaryAddressLine3].
     *
     * Unlike [beneficiaryAddressLine3], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _beneficiaryAddressLine3(): JsonField<String> = body._beneficiaryAddressLine3()

    /**
     * Returns the raw JSON value of [externalAccountId].
     *
     * Unlike [externalAccountId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _externalAccountId(): JsonField<String> = body._externalAccountId()

    /**
     * Returns the raw JSON value of [inboundWireDrawdownRequestId].
     *
     * Unlike [inboundWireDrawdownRequestId], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _inboundWireDrawdownRequestId(): JsonField<String> = body._inboundWireDrawdownRequestId()

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
     * Returns the raw JSON value of [remittance].
     *
     * Unlike [remittance], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _remittance(): JsonField<Remittance> = body._remittance()

    /**
     * Returns the raw JSON value of [requireApproval].
     *
     * Unlike [requireApproval], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _requireApproval(): JsonField<Boolean> = body._requireApproval()

    /**
     * Returns the raw JSON value of [routingNumber].
     *
     * Unlike [routingNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _routingNumber(): JsonField<String> = body._routingNumber()

    /**
     * Returns the raw JSON value of [sourceAccountNumberId].
     *
     * Unlike [sourceAccountNumberId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _sourceAccountNumberId(): JsonField<String> = body._sourceAccountNumberId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [WireTransferCreateParams].
         *
         * The following fields are required:
         * ```java
         * .accountId()
         * .amount()
         * .beneficiaryName()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [WireTransferCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(wireTransferCreateParams: WireTransferCreateParams) = apply {
            body = wireTransferCreateParams.body.toBuilder()
            additionalHeaders = wireTransferCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = wireTransferCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [accountId]
         * - [amount]
         * - [beneficiaryName]
         * - [accountNumber]
         * - [beneficiaryAddressLine1]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The identifier for the account that will send the transfer. */
        fun accountId(accountId: String) = apply { body.accountId(accountId) }

        /**
         * Sets [Builder.accountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accountId(accountId: JsonField<String>) = apply { body.accountId(accountId) }

        /** The transfer amount in USD cents. */
        fun amount(amount: Long) = apply { body.amount(amount) }

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<Long>) = apply { body.amount(amount) }

        /** The beneficiary's name. */
        fun beneficiaryName(beneficiaryName: String) = apply {
            body.beneficiaryName(beneficiaryName)
        }

        /**
         * Sets [Builder.beneficiaryName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.beneficiaryName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun beneficiaryName(beneficiaryName: JsonField<String>) = apply {
            body.beneficiaryName(beneficiaryName)
        }

        /** The account number for the destination account. */
        fun accountNumber(accountNumber: String) = apply { body.accountNumber(accountNumber) }

        /**
         * Sets [Builder.accountNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accountNumber(accountNumber: JsonField<String>) = apply {
            body.accountNumber(accountNumber)
        }

        /** The beneficiary's address line 1. */
        fun beneficiaryAddressLine1(beneficiaryAddressLine1: String) = apply {
            body.beneficiaryAddressLine1(beneficiaryAddressLine1)
        }

        /**
         * Sets [Builder.beneficiaryAddressLine1] to an arbitrary JSON value.
         *
         * You should usually call [Builder.beneficiaryAddressLine1] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun beneficiaryAddressLine1(beneficiaryAddressLine1: JsonField<String>) = apply {
            body.beneficiaryAddressLine1(beneficiaryAddressLine1)
        }

        /** The beneficiary's address line 2. */
        fun beneficiaryAddressLine2(beneficiaryAddressLine2: String) = apply {
            body.beneficiaryAddressLine2(beneficiaryAddressLine2)
        }

        /**
         * Sets [Builder.beneficiaryAddressLine2] to an arbitrary JSON value.
         *
         * You should usually call [Builder.beneficiaryAddressLine2] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun beneficiaryAddressLine2(beneficiaryAddressLine2: JsonField<String>) = apply {
            body.beneficiaryAddressLine2(beneficiaryAddressLine2)
        }

        /** The beneficiary's address line 3. */
        fun beneficiaryAddressLine3(beneficiaryAddressLine3: String) = apply {
            body.beneficiaryAddressLine3(beneficiaryAddressLine3)
        }

        /**
         * Sets [Builder.beneficiaryAddressLine3] to an arbitrary JSON value.
         *
         * You should usually call [Builder.beneficiaryAddressLine3] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun beneficiaryAddressLine3(beneficiaryAddressLine3: JsonField<String>) = apply {
            body.beneficiaryAddressLine3(beneficiaryAddressLine3)
        }

        /**
         * The ID of an External Account to initiate a transfer to. If this parameter is provided,
         * `account_number` and `routing_number` must be absent.
         */
        fun externalAccountId(externalAccountId: String) = apply {
            body.externalAccountId(externalAccountId)
        }

        /**
         * Sets [Builder.externalAccountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalAccountId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun externalAccountId(externalAccountId: JsonField<String>) = apply {
            body.externalAccountId(externalAccountId)
        }

        /**
         * The ID of an Inbound Wire Drawdown Request in response to which this transfer is being
         * sent.
         */
        fun inboundWireDrawdownRequestId(inboundWireDrawdownRequestId: String) = apply {
            body.inboundWireDrawdownRequestId(inboundWireDrawdownRequestId)
        }

        /**
         * Sets [Builder.inboundWireDrawdownRequestId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inboundWireDrawdownRequestId] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun inboundWireDrawdownRequestId(inboundWireDrawdownRequestId: JsonField<String>) = apply {
            body.inboundWireDrawdownRequestId(inboundWireDrawdownRequestId)
        }

        /**
         * The originator's address line 1. This is only necessary if you're transferring from a
         * commingled account. Otherwise, we'll use the associated entity's details.
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
         * The originator's address line 2. This is only necessary if you're transferring from a
         * commingled account. Otherwise, we'll use the associated entity's details.
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
         * The originator's address line 3. This is only necessary if you're transferring from a
         * commingled account. Otherwise, we'll use the associated entity's details.
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
         * The originator's name. This is only necessary if you're transferring from a commingled
         * account. Otherwise, we'll use the associated entity's details.
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

        /** Additional remittance information related to the wire transfer. */
        fun remittance(remittance: Remittance) = apply { body.remittance(remittance) }

        /**
         * Sets [Builder.remittance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.remittance] with a well-typed [Remittance] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun remittance(remittance: JsonField<Remittance>) = apply { body.remittance(remittance) }

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

        /**
         * The American Bankers' Association (ABA) Routing Transit Number (RTN) for the destination
         * account.
         */
        fun routingNumber(routingNumber: String) = apply { body.routingNumber(routingNumber) }

        /**
         * Sets [Builder.routingNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.routingNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun routingNumber(routingNumber: JsonField<String>) = apply {
            body.routingNumber(routingNumber)
        }

        /** The ID of an Account Number that will be passed to the wire's recipient */
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
         * Returns an immutable instance of [WireTransferCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .accountId()
         * .amount()
         * .beneficiaryName()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): WireTransferCreateParams =
            WireTransferCreateParams(
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
        private val accountId: JsonField<String>,
        private val amount: JsonField<Long>,
        private val beneficiaryName: JsonField<String>,
        private val accountNumber: JsonField<String>,
        private val beneficiaryAddressLine1: JsonField<String>,
        private val beneficiaryAddressLine2: JsonField<String>,
        private val beneficiaryAddressLine3: JsonField<String>,
        private val externalAccountId: JsonField<String>,
        private val inboundWireDrawdownRequestId: JsonField<String>,
        private val originatorAddressLine1: JsonField<String>,
        private val originatorAddressLine2: JsonField<String>,
        private val originatorAddressLine3: JsonField<String>,
        private val originatorName: JsonField<String>,
        private val remittance: JsonField<Remittance>,
        private val requireApproval: JsonField<Boolean>,
        private val routingNumber: JsonField<String>,
        private val sourceAccountNumberId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("account_id")
            @ExcludeMissing
            accountId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("beneficiary_name")
            @ExcludeMissing
            beneficiaryName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("account_number")
            @ExcludeMissing
            accountNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("beneficiary_address_line1")
            @ExcludeMissing
            beneficiaryAddressLine1: JsonField<String> = JsonMissing.of(),
            @JsonProperty("beneficiary_address_line2")
            @ExcludeMissing
            beneficiaryAddressLine2: JsonField<String> = JsonMissing.of(),
            @JsonProperty("beneficiary_address_line3")
            @ExcludeMissing
            beneficiaryAddressLine3: JsonField<String> = JsonMissing.of(),
            @JsonProperty("external_account_id")
            @ExcludeMissing
            externalAccountId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("inbound_wire_drawdown_request_id")
            @ExcludeMissing
            inboundWireDrawdownRequestId: JsonField<String> = JsonMissing.of(),
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
            @JsonProperty("remittance")
            @ExcludeMissing
            remittance: JsonField<Remittance> = JsonMissing.of(),
            @JsonProperty("require_approval")
            @ExcludeMissing
            requireApproval: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("routing_number")
            @ExcludeMissing
            routingNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("source_account_number_id")
            @ExcludeMissing
            sourceAccountNumberId: JsonField<String> = JsonMissing.of(),
        ) : this(
            accountId,
            amount,
            beneficiaryName,
            accountNumber,
            beneficiaryAddressLine1,
            beneficiaryAddressLine2,
            beneficiaryAddressLine3,
            externalAccountId,
            inboundWireDrawdownRequestId,
            originatorAddressLine1,
            originatorAddressLine2,
            originatorAddressLine3,
            originatorName,
            remittance,
            requireApproval,
            routingNumber,
            sourceAccountNumberId,
            mutableMapOf(),
        )

        /**
         * The identifier for the account that will send the transfer.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun accountId(): String = accountId.getRequired("account_id")

        /**
         * The transfer amount in USD cents.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun amount(): Long = amount.getRequired("amount")

        /**
         * The beneficiary's name.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun beneficiaryName(): String = beneficiaryName.getRequired("beneficiary_name")

        /**
         * The account number for the destination account.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun accountNumber(): Optional<String> = accountNumber.getOptional("account_number")

        /**
         * The beneficiary's address line 1.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun beneficiaryAddressLine1(): Optional<String> =
            beneficiaryAddressLine1.getOptional("beneficiary_address_line1")

        /**
         * The beneficiary's address line 2.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun beneficiaryAddressLine2(): Optional<String> =
            beneficiaryAddressLine2.getOptional("beneficiary_address_line2")

        /**
         * The beneficiary's address line 3.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun beneficiaryAddressLine3(): Optional<String> =
            beneficiaryAddressLine3.getOptional("beneficiary_address_line3")

        /**
         * The ID of an External Account to initiate a transfer to. If this parameter is provided,
         * `account_number` and `routing_number` must be absent.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun externalAccountId(): Optional<String> =
            externalAccountId.getOptional("external_account_id")

        /**
         * The ID of an Inbound Wire Drawdown Request in response to which this transfer is being
         * sent.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun inboundWireDrawdownRequestId(): Optional<String> =
            inboundWireDrawdownRequestId.getOptional("inbound_wire_drawdown_request_id")

        /**
         * The originator's address line 1. This is only necessary if you're transferring from a
         * commingled account. Otherwise, we'll use the associated entity's details.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun originatorAddressLine1(): Optional<String> =
            originatorAddressLine1.getOptional("originator_address_line1")

        /**
         * The originator's address line 2. This is only necessary if you're transferring from a
         * commingled account. Otherwise, we'll use the associated entity's details.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun originatorAddressLine2(): Optional<String> =
            originatorAddressLine2.getOptional("originator_address_line2")

        /**
         * The originator's address line 3. This is only necessary if you're transferring from a
         * commingled account. Otherwise, we'll use the associated entity's details.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun originatorAddressLine3(): Optional<String> =
            originatorAddressLine3.getOptional("originator_address_line3")

        /**
         * The originator's name. This is only necessary if you're transferring from a commingled
         * account. Otherwise, we'll use the associated entity's details.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun originatorName(): Optional<String> = originatorName.getOptional("originator_name")

        /**
         * Additional remittance information related to the wire transfer.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun remittance(): Optional<Remittance> = remittance.getOptional("remittance")

        /**
         * Whether the transfer requires explicit approval via the dashboard or API.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun requireApproval(): Optional<Boolean> = requireApproval.getOptional("require_approval")

        /**
         * The American Bankers' Association (ABA) Routing Transit Number (RTN) for the destination
         * account.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun routingNumber(): Optional<String> = routingNumber.getOptional("routing_number")

        /**
         * The ID of an Account Number that will be passed to the wire's recipient
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun sourceAccountNumberId(): Optional<String> =
            sourceAccountNumberId.getOptional("source_account_number_id")

        /**
         * Returns the raw JSON value of [accountId].
         *
         * Unlike [accountId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("account_id") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

        /**
         * Returns the raw JSON value of [amount].
         *
         * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

        /**
         * Returns the raw JSON value of [beneficiaryName].
         *
         * Unlike [beneficiaryName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("beneficiary_name")
        @ExcludeMissing
        fun _beneficiaryName(): JsonField<String> = beneficiaryName

        /**
         * Returns the raw JSON value of [accountNumber].
         *
         * Unlike [accountNumber], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("account_number")
        @ExcludeMissing
        fun _accountNumber(): JsonField<String> = accountNumber

        /**
         * Returns the raw JSON value of [beneficiaryAddressLine1].
         *
         * Unlike [beneficiaryAddressLine1], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("beneficiary_address_line1")
        @ExcludeMissing
        fun _beneficiaryAddressLine1(): JsonField<String> = beneficiaryAddressLine1

        /**
         * Returns the raw JSON value of [beneficiaryAddressLine2].
         *
         * Unlike [beneficiaryAddressLine2], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("beneficiary_address_line2")
        @ExcludeMissing
        fun _beneficiaryAddressLine2(): JsonField<String> = beneficiaryAddressLine2

        /**
         * Returns the raw JSON value of [beneficiaryAddressLine3].
         *
         * Unlike [beneficiaryAddressLine3], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("beneficiary_address_line3")
        @ExcludeMissing
        fun _beneficiaryAddressLine3(): JsonField<String> = beneficiaryAddressLine3

        /**
         * Returns the raw JSON value of [externalAccountId].
         *
         * Unlike [externalAccountId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("external_account_id")
        @ExcludeMissing
        fun _externalAccountId(): JsonField<String> = externalAccountId

        /**
         * Returns the raw JSON value of [inboundWireDrawdownRequestId].
         *
         * Unlike [inboundWireDrawdownRequestId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("inbound_wire_drawdown_request_id")
        @ExcludeMissing
        fun _inboundWireDrawdownRequestId(): JsonField<String> = inboundWireDrawdownRequestId

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
         * Returns the raw JSON value of [remittance].
         *
         * Unlike [remittance], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("remittance")
        @ExcludeMissing
        fun _remittance(): JsonField<Remittance> = remittance

        /**
         * Returns the raw JSON value of [requireApproval].
         *
         * Unlike [requireApproval], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("require_approval")
        @ExcludeMissing
        fun _requireApproval(): JsonField<Boolean> = requireApproval

        /**
         * Returns the raw JSON value of [routingNumber].
         *
         * Unlike [routingNumber], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("routing_number")
        @ExcludeMissing
        fun _routingNumber(): JsonField<String> = routingNumber

        /**
         * Returns the raw JSON value of [sourceAccountNumberId].
         *
         * Unlike [sourceAccountNumberId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("source_account_number_id")
        @ExcludeMissing
        fun _sourceAccountNumberId(): JsonField<String> = sourceAccountNumberId

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
             * .amount()
             * .beneficiaryName()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var accountId: JsonField<String>? = null
            private var amount: JsonField<Long>? = null
            private var beneficiaryName: JsonField<String>? = null
            private var accountNumber: JsonField<String> = JsonMissing.of()
            private var beneficiaryAddressLine1: JsonField<String> = JsonMissing.of()
            private var beneficiaryAddressLine2: JsonField<String> = JsonMissing.of()
            private var beneficiaryAddressLine3: JsonField<String> = JsonMissing.of()
            private var externalAccountId: JsonField<String> = JsonMissing.of()
            private var inboundWireDrawdownRequestId: JsonField<String> = JsonMissing.of()
            private var originatorAddressLine1: JsonField<String> = JsonMissing.of()
            private var originatorAddressLine2: JsonField<String> = JsonMissing.of()
            private var originatorAddressLine3: JsonField<String> = JsonMissing.of()
            private var originatorName: JsonField<String> = JsonMissing.of()
            private var remittance: JsonField<Remittance> = JsonMissing.of()
            private var requireApproval: JsonField<Boolean> = JsonMissing.of()
            private var routingNumber: JsonField<String> = JsonMissing.of()
            private var sourceAccountNumberId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                accountId = body.accountId
                amount = body.amount
                beneficiaryName = body.beneficiaryName
                accountNumber = body.accountNumber
                beneficiaryAddressLine1 = body.beneficiaryAddressLine1
                beneficiaryAddressLine2 = body.beneficiaryAddressLine2
                beneficiaryAddressLine3 = body.beneficiaryAddressLine3
                externalAccountId = body.externalAccountId
                inboundWireDrawdownRequestId = body.inboundWireDrawdownRequestId
                originatorAddressLine1 = body.originatorAddressLine1
                originatorAddressLine2 = body.originatorAddressLine2
                originatorAddressLine3 = body.originatorAddressLine3
                originatorName = body.originatorName
                remittance = body.remittance
                requireApproval = body.requireApproval
                routingNumber = body.routingNumber
                sourceAccountNumberId = body.sourceAccountNumberId
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The identifier for the account that will send the transfer. */
            fun accountId(accountId: String) = accountId(JsonField.of(accountId))

            /**
             * Sets [Builder.accountId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

            /** The transfer amount in USD cents. */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            /** The beneficiary's name. */
            fun beneficiaryName(beneficiaryName: String) =
                beneficiaryName(JsonField.of(beneficiaryName))

            /**
             * Sets [Builder.beneficiaryName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.beneficiaryName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun beneficiaryName(beneficiaryName: JsonField<String>) = apply {
                this.beneficiaryName = beneficiaryName
            }

            /** The account number for the destination account. */
            fun accountNumber(accountNumber: String) = accountNumber(JsonField.of(accountNumber))

            /**
             * Sets [Builder.accountNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accountNumber(accountNumber: JsonField<String>) = apply {
                this.accountNumber = accountNumber
            }

            /** The beneficiary's address line 1. */
            fun beneficiaryAddressLine1(beneficiaryAddressLine1: String) =
                beneficiaryAddressLine1(JsonField.of(beneficiaryAddressLine1))

            /**
             * Sets [Builder.beneficiaryAddressLine1] to an arbitrary JSON value.
             *
             * You should usually call [Builder.beneficiaryAddressLine1] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun beneficiaryAddressLine1(beneficiaryAddressLine1: JsonField<String>) = apply {
                this.beneficiaryAddressLine1 = beneficiaryAddressLine1
            }

            /** The beneficiary's address line 2. */
            fun beneficiaryAddressLine2(beneficiaryAddressLine2: String) =
                beneficiaryAddressLine2(JsonField.of(beneficiaryAddressLine2))

            /**
             * Sets [Builder.beneficiaryAddressLine2] to an arbitrary JSON value.
             *
             * You should usually call [Builder.beneficiaryAddressLine2] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun beneficiaryAddressLine2(beneficiaryAddressLine2: JsonField<String>) = apply {
                this.beneficiaryAddressLine2 = beneficiaryAddressLine2
            }

            /** The beneficiary's address line 3. */
            fun beneficiaryAddressLine3(beneficiaryAddressLine3: String) =
                beneficiaryAddressLine3(JsonField.of(beneficiaryAddressLine3))

            /**
             * Sets [Builder.beneficiaryAddressLine3] to an arbitrary JSON value.
             *
             * You should usually call [Builder.beneficiaryAddressLine3] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun beneficiaryAddressLine3(beneficiaryAddressLine3: JsonField<String>) = apply {
                this.beneficiaryAddressLine3 = beneficiaryAddressLine3
            }

            /**
             * The ID of an External Account to initiate a transfer to. If this parameter is
             * provided, `account_number` and `routing_number` must be absent.
             */
            fun externalAccountId(externalAccountId: String) =
                externalAccountId(JsonField.of(externalAccountId))

            /**
             * Sets [Builder.externalAccountId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.externalAccountId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun externalAccountId(externalAccountId: JsonField<String>) = apply {
                this.externalAccountId = externalAccountId
            }

            /**
             * The ID of an Inbound Wire Drawdown Request in response to which this transfer is
             * being sent.
             */
            fun inboundWireDrawdownRequestId(inboundWireDrawdownRequestId: String) =
                inboundWireDrawdownRequestId(JsonField.of(inboundWireDrawdownRequestId))

            /**
             * Sets [Builder.inboundWireDrawdownRequestId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inboundWireDrawdownRequestId] with a well-typed
             * [String] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun inboundWireDrawdownRequestId(inboundWireDrawdownRequestId: JsonField<String>) =
                apply {
                    this.inboundWireDrawdownRequestId = inboundWireDrawdownRequestId
                }

            /**
             * The originator's address line 1. This is only necessary if you're transferring from a
             * commingled account. Otherwise, we'll use the associated entity's details.
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
             * The originator's address line 2. This is only necessary if you're transferring from a
             * commingled account. Otherwise, we'll use the associated entity's details.
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
             * The originator's address line 3. This is only necessary if you're transferring from a
             * commingled account. Otherwise, we'll use the associated entity's details.
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
             * The originator's name. This is only necessary if you're transferring from a
             * commingled account. Otherwise, we'll use the associated entity's details.
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

            /** Additional remittance information related to the wire transfer. */
            fun remittance(remittance: Remittance) = remittance(JsonField.of(remittance))

            /**
             * Sets [Builder.remittance] to an arbitrary JSON value.
             *
             * You should usually call [Builder.remittance] with a well-typed [Remittance] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun remittance(remittance: JsonField<Remittance>) = apply {
                this.remittance = remittance
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

            /**
             * The American Bankers' Association (ABA) Routing Transit Number (RTN) for the
             * destination account.
             */
            fun routingNumber(routingNumber: String) = routingNumber(JsonField.of(routingNumber))

            /**
             * Sets [Builder.routingNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.routingNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun routingNumber(routingNumber: JsonField<String>) = apply {
                this.routingNumber = routingNumber
            }

            /** The ID of an Account Number that will be passed to the wire's recipient */
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
             * .amount()
             * .beneficiaryName()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("accountId", accountId),
                    checkRequired("amount", amount),
                    checkRequired("beneficiaryName", beneficiaryName),
                    accountNumber,
                    beneficiaryAddressLine1,
                    beneficiaryAddressLine2,
                    beneficiaryAddressLine3,
                    externalAccountId,
                    inboundWireDrawdownRequestId,
                    originatorAddressLine1,
                    originatorAddressLine2,
                    originatorAddressLine3,
                    originatorName,
                    remittance,
                    requireApproval,
                    routingNumber,
                    sourceAccountNumberId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            accountId()
            amount()
            beneficiaryName()
            accountNumber()
            beneficiaryAddressLine1()
            beneficiaryAddressLine2()
            beneficiaryAddressLine3()
            externalAccountId()
            inboundWireDrawdownRequestId()
            originatorAddressLine1()
            originatorAddressLine2()
            originatorAddressLine3()
            originatorName()
            remittance().ifPresent { it.validate() }
            requireApproval()
            routingNumber()
            sourceAccountNumberId()
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
                (if (amount.asKnown().isPresent) 1 else 0) +
                (if (beneficiaryName.asKnown().isPresent) 1 else 0) +
                (if (accountNumber.asKnown().isPresent) 1 else 0) +
                (if (beneficiaryAddressLine1.asKnown().isPresent) 1 else 0) +
                (if (beneficiaryAddressLine2.asKnown().isPresent) 1 else 0) +
                (if (beneficiaryAddressLine3.asKnown().isPresent) 1 else 0) +
                (if (externalAccountId.asKnown().isPresent) 1 else 0) +
                (if (inboundWireDrawdownRequestId.asKnown().isPresent) 1 else 0) +
                (if (originatorAddressLine1.asKnown().isPresent) 1 else 0) +
                (if (originatorAddressLine2.asKnown().isPresent) 1 else 0) +
                (if (originatorAddressLine3.asKnown().isPresent) 1 else 0) +
                (if (originatorName.asKnown().isPresent) 1 else 0) +
                (remittance.asKnown().getOrNull()?.validity() ?: 0) +
                (if (requireApproval.asKnown().isPresent) 1 else 0) +
                (if (routingNumber.asKnown().isPresent) 1 else 0) +
                (if (sourceAccountNumberId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                accountId == other.accountId &&
                amount == other.amount &&
                beneficiaryName == other.beneficiaryName &&
                accountNumber == other.accountNumber &&
                beneficiaryAddressLine1 == other.beneficiaryAddressLine1 &&
                beneficiaryAddressLine2 == other.beneficiaryAddressLine2 &&
                beneficiaryAddressLine3 == other.beneficiaryAddressLine3 &&
                externalAccountId == other.externalAccountId &&
                inboundWireDrawdownRequestId == other.inboundWireDrawdownRequestId &&
                originatorAddressLine1 == other.originatorAddressLine1 &&
                originatorAddressLine2 == other.originatorAddressLine2 &&
                originatorAddressLine3 == other.originatorAddressLine3 &&
                originatorName == other.originatorName &&
                remittance == other.remittance &&
                requireApproval == other.requireApproval &&
                routingNumber == other.routingNumber &&
                sourceAccountNumberId == other.sourceAccountNumberId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                accountId,
                amount,
                beneficiaryName,
                accountNumber,
                beneficiaryAddressLine1,
                beneficiaryAddressLine2,
                beneficiaryAddressLine3,
                externalAccountId,
                inboundWireDrawdownRequestId,
                originatorAddressLine1,
                originatorAddressLine2,
                originatorAddressLine3,
                originatorName,
                remittance,
                requireApproval,
                routingNumber,
                sourceAccountNumberId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{accountId=$accountId, amount=$amount, beneficiaryName=$beneficiaryName, accountNumber=$accountNumber, beneficiaryAddressLine1=$beneficiaryAddressLine1, beneficiaryAddressLine2=$beneficiaryAddressLine2, beneficiaryAddressLine3=$beneficiaryAddressLine3, externalAccountId=$externalAccountId, inboundWireDrawdownRequestId=$inboundWireDrawdownRequestId, originatorAddressLine1=$originatorAddressLine1, originatorAddressLine2=$originatorAddressLine2, originatorAddressLine3=$originatorAddressLine3, originatorName=$originatorName, remittance=$remittance, requireApproval=$requireApproval, routingNumber=$routingNumber, sourceAccountNumberId=$sourceAccountNumberId, additionalProperties=$additionalProperties}"
    }

    /** Additional remittance information related to the wire transfer. */
    class Remittance
    private constructor(
        private val category: JsonField<Category>,
        private val tax: JsonField<Tax>,
        private val unstructured: JsonField<Unstructured>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("category")
            @ExcludeMissing
            category: JsonField<Category> = JsonMissing.of(),
            @JsonProperty("tax") @ExcludeMissing tax: JsonField<Tax> = JsonMissing.of(),
            @JsonProperty("unstructured")
            @ExcludeMissing
            unstructured: JsonField<Unstructured> = JsonMissing.of(),
        ) : this(category, tax, unstructured, mutableMapOf())

        /**
         * The type of remittance information being passed.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun category(): Category = category.getRequired("category")

        /**
         * Internal Revenue Service (IRS) tax repayment information. Required if `category` is equal
         * to `tax`.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun tax(): Optional<Tax> = tax.getOptional("tax")

        /**
         * Unstructured remittance information. Required if `category` is equal to `unstructured`.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun unstructured(): Optional<Unstructured> = unstructured.getOptional("unstructured")

        /**
         * Returns the raw JSON value of [category].
         *
         * Unlike [category], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("category") @ExcludeMissing fun _category(): JsonField<Category> = category

        /**
         * Returns the raw JSON value of [tax].
         *
         * Unlike [tax], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tax") @ExcludeMissing fun _tax(): JsonField<Tax> = tax

        /**
         * Returns the raw JSON value of [unstructured].
         *
         * Unlike [unstructured], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("unstructured")
        @ExcludeMissing
        fun _unstructured(): JsonField<Unstructured> = unstructured

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
             * Returns a mutable builder for constructing an instance of [Remittance].
             *
             * The following fields are required:
             * ```java
             * .category()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Remittance]. */
        class Builder internal constructor() {

            private var category: JsonField<Category>? = null
            private var tax: JsonField<Tax> = JsonMissing.of()
            private var unstructured: JsonField<Unstructured> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(remittance: Remittance) = apply {
                category = remittance.category
                tax = remittance.tax
                unstructured = remittance.unstructured
                additionalProperties = remittance.additionalProperties.toMutableMap()
            }

            /** The type of remittance information being passed. */
            fun category(category: Category) = category(JsonField.of(category))

            /**
             * Sets [Builder.category] to an arbitrary JSON value.
             *
             * You should usually call [Builder.category] with a well-typed [Category] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun category(category: JsonField<Category>) = apply { this.category = category }

            /**
             * Internal Revenue Service (IRS) tax repayment information. Required if `category` is
             * equal to `tax`.
             */
            fun tax(tax: Tax) = tax(JsonField.of(tax))

            /**
             * Sets [Builder.tax] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tax] with a well-typed [Tax] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun tax(tax: JsonField<Tax>) = apply { this.tax = tax }

            /**
             * Unstructured remittance information. Required if `category` is equal to
             * `unstructured`.
             */
            fun unstructured(unstructured: Unstructured) = unstructured(JsonField.of(unstructured))

            /**
             * Sets [Builder.unstructured] to an arbitrary JSON value.
             *
             * You should usually call [Builder.unstructured] with a well-typed [Unstructured] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun unstructured(unstructured: JsonField<Unstructured>) = apply {
                this.unstructured = unstructured
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
             * Returns an immutable instance of [Remittance].
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
            fun build(): Remittance =
                Remittance(
                    checkRequired("category", category),
                    tax,
                    unstructured,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Remittance = apply {
            if (validated) {
                return@apply
            }

            category().validate()
            tax().ifPresent { it.validate() }
            unstructured().ifPresent { it.validate() }
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
                (tax.asKnown().getOrNull()?.validity() ?: 0) +
                (unstructured.asKnown().getOrNull()?.validity() ?: 0)

        /** The type of remittance information being passed. */
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

                /** The wire transfer contains unstructured remittance information. */
                @JvmField val UNSTRUCTURED = of("unstructured")

                /**
                 * The wire transfer is for tax payment purposes to the Internal Revenue Service
                 * (IRS).
                 */
                @JvmField val TAX = of("tax")

                @JvmStatic fun of(value: String) = Category(JsonField.of(value))
            }

            /** An enum containing [Category]'s known values. */
            enum class Known {
                /** The wire transfer contains unstructured remittance information. */
                UNSTRUCTURED,
                /**
                 * The wire transfer is for tax payment purposes to the Internal Revenue Service
                 * (IRS).
                 */
                TAX,
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
                /** The wire transfer contains unstructured remittance information. */
                UNSTRUCTURED,
                /**
                 * The wire transfer is for tax payment purposes to the Internal Revenue Service
                 * (IRS).
                 */
                TAX,
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
                    UNSTRUCTURED -> Value.UNSTRUCTURED
                    TAX -> Value.TAX
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
                    UNSTRUCTURED -> Known.UNSTRUCTURED
                    TAX -> Known.TAX
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

        /**
         * Internal Revenue Service (IRS) tax repayment information. Required if `category` is equal
         * to `tax`.
         */
        class Tax
        private constructor(
            private val date: JsonField<LocalDate>,
            private val identificationNumber: JsonField<String>,
            private val typeCode: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("date") @ExcludeMissing date: JsonField<LocalDate> = JsonMissing.of(),
                @JsonProperty("identification_number")
                @ExcludeMissing
                identificationNumber: JsonField<String> = JsonMissing.of(),
                @JsonProperty("type_code")
                @ExcludeMissing
                typeCode: JsonField<String> = JsonMissing.of(),
            ) : this(date, identificationNumber, typeCode, mutableMapOf())

            /**
             * The month and year the tax payment is for, in YYYY-MM-DD format. The day is ignored.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun date(): LocalDate = date.getRequired("date")

            /**
             * The 9-digit Tax Identification Number (TIN) or Employer Identification Number (EIN).
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun identificationNumber(): String =
                identificationNumber.getRequired("identification_number")

            /**
             * The 5-character tax type code.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun typeCode(): String = typeCode.getRequired("type_code")

            /**
             * Returns the raw JSON value of [date].
             *
             * Unlike [date], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("date") @ExcludeMissing fun _date(): JsonField<LocalDate> = date

            /**
             * Returns the raw JSON value of [identificationNumber].
             *
             * Unlike [identificationNumber], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("identification_number")
            @ExcludeMissing
            fun _identificationNumber(): JsonField<String> = identificationNumber

            /**
             * Returns the raw JSON value of [typeCode].
             *
             * Unlike [typeCode], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("type_code") @ExcludeMissing fun _typeCode(): JsonField<String> = typeCode

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
                 * Returns a mutable builder for constructing an instance of [Tax].
                 *
                 * The following fields are required:
                 * ```java
                 * .date()
                 * .identificationNumber()
                 * .typeCode()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Tax]. */
            class Builder internal constructor() {

                private var date: JsonField<LocalDate>? = null
                private var identificationNumber: JsonField<String>? = null
                private var typeCode: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(tax: Tax) = apply {
                    date = tax.date
                    identificationNumber = tax.identificationNumber
                    typeCode = tax.typeCode
                    additionalProperties = tax.additionalProperties.toMutableMap()
                }

                /**
                 * The month and year the tax payment is for, in YYYY-MM-DD format. The day is
                 * ignored.
                 */
                fun date(date: LocalDate) = date(JsonField.of(date))

                /**
                 * Sets [Builder.date] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.date] with a well-typed [LocalDate] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun date(date: JsonField<LocalDate>) = apply { this.date = date }

                /**
                 * The 9-digit Tax Identification Number (TIN) or Employer Identification Number
                 * (EIN).
                 */
                fun identificationNumber(identificationNumber: String) =
                    identificationNumber(JsonField.of(identificationNumber))

                /**
                 * Sets [Builder.identificationNumber] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.identificationNumber] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun identificationNumber(identificationNumber: JsonField<String>) = apply {
                    this.identificationNumber = identificationNumber
                }

                /** The 5-character tax type code. */
                fun typeCode(typeCode: String) = typeCode(JsonField.of(typeCode))

                /**
                 * Sets [Builder.typeCode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.typeCode] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun typeCode(typeCode: JsonField<String>) = apply { this.typeCode = typeCode }

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
                 * Returns an immutable instance of [Tax].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .date()
                 * .identificationNumber()
                 * .typeCode()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Tax =
                    Tax(
                        checkRequired("date", date),
                        checkRequired("identificationNumber", identificationNumber),
                        checkRequired("typeCode", typeCode),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Tax = apply {
                if (validated) {
                    return@apply
                }

                date()
                identificationNumber()
                typeCode()
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
                (if (date.asKnown().isPresent) 1 else 0) +
                    (if (identificationNumber.asKnown().isPresent) 1 else 0) +
                    (if (typeCode.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Tax &&
                    date == other.date &&
                    identificationNumber == other.identificationNumber &&
                    typeCode == other.typeCode &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(date, identificationNumber, typeCode, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Tax{date=$date, identificationNumber=$identificationNumber, typeCode=$typeCode, additionalProperties=$additionalProperties}"
        }

        /**
         * Unstructured remittance information. Required if `category` is equal to `unstructured`.
         */
        class Unstructured
        private constructor(
            private val message: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("message")
                @ExcludeMissing
                message: JsonField<String> = JsonMissing.of()
            ) : this(message, mutableMapOf())

            /**
             * The message to the beneficiary.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun message(): String = message.getRequired("message")

            /**
             * Returns the raw JSON value of [message].
             *
             * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

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
                 * Returns a mutable builder for constructing an instance of [Unstructured].
                 *
                 * The following fields are required:
                 * ```java
                 * .message()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Unstructured]. */
            class Builder internal constructor() {

                private var message: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(unstructured: Unstructured) = apply {
                    message = unstructured.message
                    additionalProperties = unstructured.additionalProperties.toMutableMap()
                }

                /** The message to the beneficiary. */
                fun message(message: String) = message(JsonField.of(message))

                /**
                 * Sets [Builder.message] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.message] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun message(message: JsonField<String>) = apply { this.message = message }

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
                 * Returns an immutable instance of [Unstructured].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .message()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Unstructured =
                    Unstructured(
                        checkRequired("message", message),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Unstructured = apply {
                if (validated) {
                    return@apply
                }

                message()
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
            @JvmSynthetic internal fun validity(): Int = (if (message.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Unstructured &&
                    message == other.message &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(message, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Unstructured{message=$message, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Remittance &&
                category == other.category &&
                tax == other.tax &&
                unstructured == other.unstructured &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(category, tax, unstructured, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Remittance{category=$category, tax=$tax, unstructured=$unstructured, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WireTransferCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "WireTransferCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
