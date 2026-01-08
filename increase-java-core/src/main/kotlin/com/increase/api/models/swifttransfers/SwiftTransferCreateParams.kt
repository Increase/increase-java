// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.swifttransfers

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

/** Create a Swift Transfer */
class SwiftTransferCreateParams
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
     * The creditor's account number.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountNumber(): String = body.accountNumber()

    /**
     * The bank identification code (BIC) of the creditor. If it ends with the three-character
     * branch code, this must be 11 characters long. Otherwise this must be 8 characters and the
     * branch code will be assumed to be `XXX`.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun bankIdentificationCode(): String = body.bankIdentificationCode()

    /**
     * The creditor's address.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun creditorAddress(): CreditorAddress = body.creditorAddress()

    /**
     * The creditor's name.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun creditorName(): String = body.creditorName()

    /**
     * The debtor's address.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun debtorAddress(): DebtorAddress = body.debtorAddress()

    /**
     * The debtor's name.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun debtorName(): String = body.debtorName()

    /**
     * The amount, in minor units of `instructed_currency`, to send to the creditor.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun instructedAmount(): Long = body.instructedAmount()

    /**
     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code of the instructed
     * amount.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun instructedCurrency(): InstructedCurrency = body.instructedCurrency()

    /**
     * The Account Number to include in the transfer as the debtor's account number.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sourceAccountNumberId(): String = body.sourceAccountNumberId()

    /**
     * Unstructured remittance information to include in the transfer.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun unstructuredRemittanceInformation(): String = body.unstructuredRemittanceInformation()

    /**
     * Whether the transfer requires explicit approval via the dashboard or API.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun requireApproval(): Optional<Boolean> = body.requireApproval()

    /**
     * The creditor's bank account routing or transit number. Required in certain countries.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun routingNumber(): Optional<String> = body.routingNumber()

    /**
     * Returns the raw JSON value of [accountId].
     *
     * Unlike [accountId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _accountId(): JsonField<String> = body._accountId()

    /**
     * Returns the raw JSON value of [accountNumber].
     *
     * Unlike [accountNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _accountNumber(): JsonField<String> = body._accountNumber()

    /**
     * Returns the raw JSON value of [bankIdentificationCode].
     *
     * Unlike [bankIdentificationCode], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _bankIdentificationCode(): JsonField<String> = body._bankIdentificationCode()

    /**
     * Returns the raw JSON value of [creditorAddress].
     *
     * Unlike [creditorAddress], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _creditorAddress(): JsonField<CreditorAddress> = body._creditorAddress()

    /**
     * Returns the raw JSON value of [creditorName].
     *
     * Unlike [creditorName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _creditorName(): JsonField<String> = body._creditorName()

    /**
     * Returns the raw JSON value of [debtorAddress].
     *
     * Unlike [debtorAddress], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _debtorAddress(): JsonField<DebtorAddress> = body._debtorAddress()

    /**
     * Returns the raw JSON value of [debtorName].
     *
     * Unlike [debtorName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _debtorName(): JsonField<String> = body._debtorName()

    /**
     * Returns the raw JSON value of [instructedAmount].
     *
     * Unlike [instructedAmount], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _instructedAmount(): JsonField<Long> = body._instructedAmount()

    /**
     * Returns the raw JSON value of [instructedCurrency].
     *
     * Unlike [instructedCurrency], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _instructedCurrency(): JsonField<InstructedCurrency> = body._instructedCurrency()

    /**
     * Returns the raw JSON value of [sourceAccountNumberId].
     *
     * Unlike [sourceAccountNumberId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _sourceAccountNumberId(): JsonField<String> = body._sourceAccountNumberId()

    /**
     * Returns the raw JSON value of [unstructuredRemittanceInformation].
     *
     * Unlike [unstructuredRemittanceInformation], this method doesn't throw if the JSON field has
     * an unexpected type.
     */
    fun _unstructuredRemittanceInformation(): JsonField<String> =
        body._unstructuredRemittanceInformation()

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

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SwiftTransferCreateParams].
         *
         * The following fields are required:
         * ```java
         * .accountId()
         * .accountNumber()
         * .bankIdentificationCode()
         * .creditorAddress()
         * .creditorName()
         * .debtorAddress()
         * .debtorName()
         * .instructedAmount()
         * .instructedCurrency()
         * .sourceAccountNumberId()
         * .unstructuredRemittanceInformation()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SwiftTransferCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(swiftTransferCreateParams: SwiftTransferCreateParams) = apply {
            body = swiftTransferCreateParams.body.toBuilder()
            additionalHeaders = swiftTransferCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = swiftTransferCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [accountId]
         * - [accountNumber]
         * - [bankIdentificationCode]
         * - [creditorAddress]
         * - [creditorName]
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

        /** The creditor's account number. */
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

        /**
         * The bank identification code (BIC) of the creditor. If it ends with the three-character
         * branch code, this must be 11 characters long. Otherwise this must be 8 characters and the
         * branch code will be assumed to be `XXX`.
         */
        fun bankIdentificationCode(bankIdentificationCode: String) = apply {
            body.bankIdentificationCode(bankIdentificationCode)
        }

        /**
         * Sets [Builder.bankIdentificationCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bankIdentificationCode] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun bankIdentificationCode(bankIdentificationCode: JsonField<String>) = apply {
            body.bankIdentificationCode(bankIdentificationCode)
        }

        /** The creditor's address. */
        fun creditorAddress(creditorAddress: CreditorAddress) = apply {
            body.creditorAddress(creditorAddress)
        }

        /**
         * Sets [Builder.creditorAddress] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creditorAddress] with a well-typed [CreditorAddress]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun creditorAddress(creditorAddress: JsonField<CreditorAddress>) = apply {
            body.creditorAddress(creditorAddress)
        }

        /** The creditor's name. */
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

        /** The debtor's address. */
        fun debtorAddress(debtorAddress: DebtorAddress) = apply {
            body.debtorAddress(debtorAddress)
        }

        /**
         * Sets [Builder.debtorAddress] to an arbitrary JSON value.
         *
         * You should usually call [Builder.debtorAddress] with a well-typed [DebtorAddress] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun debtorAddress(debtorAddress: JsonField<DebtorAddress>) = apply {
            body.debtorAddress(debtorAddress)
        }

        /** The debtor's name. */
        fun debtorName(debtorName: String) = apply { body.debtorName(debtorName) }

        /**
         * Sets [Builder.debtorName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.debtorName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun debtorName(debtorName: JsonField<String>) = apply { body.debtorName(debtorName) }

        /** The amount, in minor units of `instructed_currency`, to send to the creditor. */
        fun instructedAmount(instructedAmount: Long) = apply {
            body.instructedAmount(instructedAmount)
        }

        /**
         * Sets [Builder.instructedAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.instructedAmount] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun instructedAmount(instructedAmount: JsonField<Long>) = apply {
            body.instructedAmount(instructedAmount)
        }

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code of the instructed
         * amount.
         */
        fun instructedCurrency(instructedCurrency: InstructedCurrency) = apply {
            body.instructedCurrency(instructedCurrency)
        }

        /**
         * Sets [Builder.instructedCurrency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.instructedCurrency] with a well-typed
         * [InstructedCurrency] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun instructedCurrency(instructedCurrency: JsonField<InstructedCurrency>) = apply {
            body.instructedCurrency(instructedCurrency)
        }

        /** The Account Number to include in the transfer as the debtor's account number. */
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

        /** Unstructured remittance information to include in the transfer. */
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

        /** The creditor's bank account routing or transit number. Required in certain countries. */
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
         * Returns an immutable instance of [SwiftTransferCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .accountId()
         * .accountNumber()
         * .bankIdentificationCode()
         * .creditorAddress()
         * .creditorName()
         * .debtorAddress()
         * .debtorName()
         * .instructedAmount()
         * .instructedCurrency()
         * .sourceAccountNumberId()
         * .unstructuredRemittanceInformation()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SwiftTransferCreateParams =
            SwiftTransferCreateParams(
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
        private val accountNumber: JsonField<String>,
        private val bankIdentificationCode: JsonField<String>,
        private val creditorAddress: JsonField<CreditorAddress>,
        private val creditorName: JsonField<String>,
        private val debtorAddress: JsonField<DebtorAddress>,
        private val debtorName: JsonField<String>,
        private val instructedAmount: JsonField<Long>,
        private val instructedCurrency: JsonField<InstructedCurrency>,
        private val sourceAccountNumberId: JsonField<String>,
        private val unstructuredRemittanceInformation: JsonField<String>,
        private val requireApproval: JsonField<Boolean>,
        private val routingNumber: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("account_id")
            @ExcludeMissing
            accountId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("account_number")
            @ExcludeMissing
            accountNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("bank_identification_code")
            @ExcludeMissing
            bankIdentificationCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("creditor_address")
            @ExcludeMissing
            creditorAddress: JsonField<CreditorAddress> = JsonMissing.of(),
            @JsonProperty("creditor_name")
            @ExcludeMissing
            creditorName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("debtor_address")
            @ExcludeMissing
            debtorAddress: JsonField<DebtorAddress> = JsonMissing.of(),
            @JsonProperty("debtor_name")
            @ExcludeMissing
            debtorName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("instructed_amount")
            @ExcludeMissing
            instructedAmount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("instructed_currency")
            @ExcludeMissing
            instructedCurrency: JsonField<InstructedCurrency> = JsonMissing.of(),
            @JsonProperty("source_account_number_id")
            @ExcludeMissing
            sourceAccountNumberId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("unstructured_remittance_information")
            @ExcludeMissing
            unstructuredRemittanceInformation: JsonField<String> = JsonMissing.of(),
            @JsonProperty("require_approval")
            @ExcludeMissing
            requireApproval: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("routing_number")
            @ExcludeMissing
            routingNumber: JsonField<String> = JsonMissing.of(),
        ) : this(
            accountId,
            accountNumber,
            bankIdentificationCode,
            creditorAddress,
            creditorName,
            debtorAddress,
            debtorName,
            instructedAmount,
            instructedCurrency,
            sourceAccountNumberId,
            unstructuredRemittanceInformation,
            requireApproval,
            routingNumber,
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
         * The creditor's account number.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun accountNumber(): String = accountNumber.getRequired("account_number")

        /**
         * The bank identification code (BIC) of the creditor. If it ends with the three-character
         * branch code, this must be 11 characters long. Otherwise this must be 8 characters and the
         * branch code will be assumed to be `XXX`.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun bankIdentificationCode(): String =
            bankIdentificationCode.getRequired("bank_identification_code")

        /**
         * The creditor's address.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun creditorAddress(): CreditorAddress = creditorAddress.getRequired("creditor_address")

        /**
         * The creditor's name.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun creditorName(): String = creditorName.getRequired("creditor_name")

        /**
         * The debtor's address.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun debtorAddress(): DebtorAddress = debtorAddress.getRequired("debtor_address")

        /**
         * The debtor's name.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun debtorName(): String = debtorName.getRequired("debtor_name")

        /**
         * The amount, in minor units of `instructed_currency`, to send to the creditor.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun instructedAmount(): Long = instructedAmount.getRequired("instructed_amount")

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code of the instructed
         * amount.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun instructedCurrency(): InstructedCurrency =
            instructedCurrency.getRequired("instructed_currency")

        /**
         * The Account Number to include in the transfer as the debtor's account number.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun sourceAccountNumberId(): String =
            sourceAccountNumberId.getRequired("source_account_number_id")

        /**
         * Unstructured remittance information to include in the transfer.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun unstructuredRemittanceInformation(): String =
            unstructuredRemittanceInformation.getRequired("unstructured_remittance_information")

        /**
         * Whether the transfer requires explicit approval via the dashboard or API.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun requireApproval(): Optional<Boolean> = requireApproval.getOptional("require_approval")

        /**
         * The creditor's bank account routing or transit number. Required in certain countries.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun routingNumber(): Optional<String> = routingNumber.getOptional("routing_number")

        /**
         * Returns the raw JSON value of [accountId].
         *
         * Unlike [accountId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("account_id") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

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
         * Returns the raw JSON value of [bankIdentificationCode].
         *
         * Unlike [bankIdentificationCode], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("bank_identification_code")
        @ExcludeMissing
        fun _bankIdentificationCode(): JsonField<String> = bankIdentificationCode

        /**
         * Returns the raw JSON value of [creditorAddress].
         *
         * Unlike [creditorAddress], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("creditor_address")
        @ExcludeMissing
        fun _creditorAddress(): JsonField<CreditorAddress> = creditorAddress

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
         * Returns the raw JSON value of [debtorAddress].
         *
         * Unlike [debtorAddress], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("debtor_address")
        @ExcludeMissing
        fun _debtorAddress(): JsonField<DebtorAddress> = debtorAddress

        /**
         * Returns the raw JSON value of [debtorName].
         *
         * Unlike [debtorName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("debtor_name")
        @ExcludeMissing
        fun _debtorName(): JsonField<String> = debtorName

        /**
         * Returns the raw JSON value of [instructedAmount].
         *
         * Unlike [instructedAmount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("instructed_amount")
        @ExcludeMissing
        fun _instructedAmount(): JsonField<Long> = instructedAmount

        /**
         * Returns the raw JSON value of [instructedCurrency].
         *
         * Unlike [instructedCurrency], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("instructed_currency")
        @ExcludeMissing
        fun _instructedCurrency(): JsonField<InstructedCurrency> = instructedCurrency

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
             * .accountNumber()
             * .bankIdentificationCode()
             * .creditorAddress()
             * .creditorName()
             * .debtorAddress()
             * .debtorName()
             * .instructedAmount()
             * .instructedCurrency()
             * .sourceAccountNumberId()
             * .unstructuredRemittanceInformation()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var accountId: JsonField<String>? = null
            private var accountNumber: JsonField<String>? = null
            private var bankIdentificationCode: JsonField<String>? = null
            private var creditorAddress: JsonField<CreditorAddress>? = null
            private var creditorName: JsonField<String>? = null
            private var debtorAddress: JsonField<DebtorAddress>? = null
            private var debtorName: JsonField<String>? = null
            private var instructedAmount: JsonField<Long>? = null
            private var instructedCurrency: JsonField<InstructedCurrency>? = null
            private var sourceAccountNumberId: JsonField<String>? = null
            private var unstructuredRemittanceInformation: JsonField<String>? = null
            private var requireApproval: JsonField<Boolean> = JsonMissing.of()
            private var routingNumber: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                accountId = body.accountId
                accountNumber = body.accountNumber
                bankIdentificationCode = body.bankIdentificationCode
                creditorAddress = body.creditorAddress
                creditorName = body.creditorName
                debtorAddress = body.debtorAddress
                debtorName = body.debtorName
                instructedAmount = body.instructedAmount
                instructedCurrency = body.instructedCurrency
                sourceAccountNumberId = body.sourceAccountNumberId
                unstructuredRemittanceInformation = body.unstructuredRemittanceInformation
                requireApproval = body.requireApproval
                routingNumber = body.routingNumber
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

            /** The creditor's account number. */
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

            /**
             * The bank identification code (BIC) of the creditor. If it ends with the
             * three-character branch code, this must be 11 characters long. Otherwise this must be
             * 8 characters and the branch code will be assumed to be `XXX`.
             */
            fun bankIdentificationCode(bankIdentificationCode: String) =
                bankIdentificationCode(JsonField.of(bankIdentificationCode))

            /**
             * Sets [Builder.bankIdentificationCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bankIdentificationCode] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun bankIdentificationCode(bankIdentificationCode: JsonField<String>) = apply {
                this.bankIdentificationCode = bankIdentificationCode
            }

            /** The creditor's address. */
            fun creditorAddress(creditorAddress: CreditorAddress) =
                creditorAddress(JsonField.of(creditorAddress))

            /**
             * Sets [Builder.creditorAddress] to an arbitrary JSON value.
             *
             * You should usually call [Builder.creditorAddress] with a well-typed [CreditorAddress]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun creditorAddress(creditorAddress: JsonField<CreditorAddress>) = apply {
                this.creditorAddress = creditorAddress
            }

            /** The creditor's name. */
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

            /** The debtor's address. */
            fun debtorAddress(debtorAddress: DebtorAddress) =
                debtorAddress(JsonField.of(debtorAddress))

            /**
             * Sets [Builder.debtorAddress] to an arbitrary JSON value.
             *
             * You should usually call [Builder.debtorAddress] with a well-typed [DebtorAddress]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun debtorAddress(debtorAddress: JsonField<DebtorAddress>) = apply {
                this.debtorAddress = debtorAddress
            }

            /** The debtor's name. */
            fun debtorName(debtorName: String) = debtorName(JsonField.of(debtorName))

            /**
             * Sets [Builder.debtorName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.debtorName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun debtorName(debtorName: JsonField<String>) = apply { this.debtorName = debtorName }

            /** The amount, in minor units of `instructed_currency`, to send to the creditor. */
            fun instructedAmount(instructedAmount: Long) =
                instructedAmount(JsonField.of(instructedAmount))

            /**
             * Sets [Builder.instructedAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.instructedAmount] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun instructedAmount(instructedAmount: JsonField<Long>) = apply {
                this.instructedAmount = instructedAmount
            }

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code of the
             * instructed amount.
             */
            fun instructedCurrency(instructedCurrency: InstructedCurrency) =
                instructedCurrency(JsonField.of(instructedCurrency))

            /**
             * Sets [Builder.instructedCurrency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.instructedCurrency] with a well-typed
             * [InstructedCurrency] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun instructedCurrency(instructedCurrency: JsonField<InstructedCurrency>) = apply {
                this.instructedCurrency = instructedCurrency
            }

            /** The Account Number to include in the transfer as the debtor's account number. */
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

            /** Unstructured remittance information to include in the transfer. */
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
             * The creditor's bank account routing or transit number. Required in certain countries.
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
             * .accountNumber()
             * .bankIdentificationCode()
             * .creditorAddress()
             * .creditorName()
             * .debtorAddress()
             * .debtorName()
             * .instructedAmount()
             * .instructedCurrency()
             * .sourceAccountNumberId()
             * .unstructuredRemittanceInformation()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("accountId", accountId),
                    checkRequired("accountNumber", accountNumber),
                    checkRequired("bankIdentificationCode", bankIdentificationCode),
                    checkRequired("creditorAddress", creditorAddress),
                    checkRequired("creditorName", creditorName),
                    checkRequired("debtorAddress", debtorAddress),
                    checkRequired("debtorName", debtorName),
                    checkRequired("instructedAmount", instructedAmount),
                    checkRequired("instructedCurrency", instructedCurrency),
                    checkRequired("sourceAccountNumberId", sourceAccountNumberId),
                    checkRequired(
                        "unstructuredRemittanceInformation",
                        unstructuredRemittanceInformation,
                    ),
                    requireApproval,
                    routingNumber,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            accountId()
            accountNumber()
            bankIdentificationCode()
            creditorAddress().validate()
            creditorName()
            debtorAddress().validate()
            debtorName()
            instructedAmount()
            instructedCurrency().validate()
            sourceAccountNumberId()
            unstructuredRemittanceInformation()
            requireApproval()
            routingNumber()
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
                (if (accountNumber.asKnown().isPresent) 1 else 0) +
                (if (bankIdentificationCode.asKnown().isPresent) 1 else 0) +
                (creditorAddress.asKnown().getOrNull()?.validity() ?: 0) +
                (if (creditorName.asKnown().isPresent) 1 else 0) +
                (debtorAddress.asKnown().getOrNull()?.validity() ?: 0) +
                (if (debtorName.asKnown().isPresent) 1 else 0) +
                (if (instructedAmount.asKnown().isPresent) 1 else 0) +
                (instructedCurrency.asKnown().getOrNull()?.validity() ?: 0) +
                (if (sourceAccountNumberId.asKnown().isPresent) 1 else 0) +
                (if (unstructuredRemittanceInformation.asKnown().isPresent) 1 else 0) +
                (if (requireApproval.asKnown().isPresent) 1 else 0) +
                (if (routingNumber.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                accountId == other.accountId &&
                accountNumber == other.accountNumber &&
                bankIdentificationCode == other.bankIdentificationCode &&
                creditorAddress == other.creditorAddress &&
                creditorName == other.creditorName &&
                debtorAddress == other.debtorAddress &&
                debtorName == other.debtorName &&
                instructedAmount == other.instructedAmount &&
                instructedCurrency == other.instructedCurrency &&
                sourceAccountNumberId == other.sourceAccountNumberId &&
                unstructuredRemittanceInformation == other.unstructuredRemittanceInformation &&
                requireApproval == other.requireApproval &&
                routingNumber == other.routingNumber &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                accountId,
                accountNumber,
                bankIdentificationCode,
                creditorAddress,
                creditorName,
                debtorAddress,
                debtorName,
                instructedAmount,
                instructedCurrency,
                sourceAccountNumberId,
                unstructuredRemittanceInformation,
                requireApproval,
                routingNumber,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{accountId=$accountId, accountNumber=$accountNumber, bankIdentificationCode=$bankIdentificationCode, creditorAddress=$creditorAddress, creditorName=$creditorName, debtorAddress=$debtorAddress, debtorName=$debtorName, instructedAmount=$instructedAmount, instructedCurrency=$instructedCurrency, sourceAccountNumberId=$sourceAccountNumberId, unstructuredRemittanceInformation=$unstructuredRemittanceInformation, requireApproval=$requireApproval, routingNumber=$routingNumber, additionalProperties=$additionalProperties}"
    }

    /** The creditor's address. */
    class CreditorAddress
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val city: JsonField<String>,
        private val country: JsonField<String>,
        private val line1: JsonField<String>,
        private val line2: JsonField<String>,
        private val postalCode: JsonField<String>,
        private val state: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("city") @ExcludeMissing city: JsonField<String> = JsonMissing.of(),
            @JsonProperty("country") @ExcludeMissing country: JsonField<String> = JsonMissing.of(),
            @JsonProperty("line1") @ExcludeMissing line1: JsonField<String> = JsonMissing.of(),
            @JsonProperty("line2") @ExcludeMissing line2: JsonField<String> = JsonMissing.of(),
            @JsonProperty("postal_code")
            @ExcludeMissing
            postalCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("state") @ExcludeMissing state: JsonField<String> = JsonMissing.of(),
        ) : this(city, country, line1, line2, postalCode, state, mutableMapOf())

        /**
         * The city, district, town, or village of the address.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun city(): String = city.getRequired("city")

        /**
         * The two-letter [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)
         * code for the country of the address.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun country(): String = country.getRequired("country")

        /**
         * The first line of the address. This is usually the street number and street.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun line1(): String = line1.getRequired("line1")

        /**
         * The second line of the address. This might be the floor or room number.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun line2(): Optional<String> = line2.getOptional("line2")

        /**
         * The ZIP or postal code of the address. Required in certain countries.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun postalCode(): Optional<String> = postalCode.getOptional("postal_code")

        /**
         * The state, province, or region of the address. Required in certain countries.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun state(): Optional<String> = state.getOptional("state")

        /**
         * Returns the raw JSON value of [city].
         *
         * Unlike [city], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

        /**
         * Returns the raw JSON value of [country].
         *
         * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

        /**
         * Returns the raw JSON value of [line1].
         *
         * Unlike [line1], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("line1") @ExcludeMissing fun _line1(): JsonField<String> = line1

        /**
         * Returns the raw JSON value of [line2].
         *
         * Unlike [line2], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("line2") @ExcludeMissing fun _line2(): JsonField<String> = line2

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
             * Returns a mutable builder for constructing an instance of [CreditorAddress].
             *
             * The following fields are required:
             * ```java
             * .city()
             * .country()
             * .line1()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CreditorAddress]. */
        class Builder internal constructor() {

            private var city: JsonField<String>? = null
            private var country: JsonField<String>? = null
            private var line1: JsonField<String>? = null
            private var line2: JsonField<String> = JsonMissing.of()
            private var postalCode: JsonField<String> = JsonMissing.of()
            private var state: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(creditorAddress: CreditorAddress) = apply {
                city = creditorAddress.city
                country = creditorAddress.country
                line1 = creditorAddress.line1
                line2 = creditorAddress.line2
                postalCode = creditorAddress.postalCode
                state = creditorAddress.state
                additionalProperties = creditorAddress.additionalProperties.toMutableMap()
            }

            /** The city, district, town, or village of the address. */
            fun city(city: String) = city(JsonField.of(city))

            /**
             * Sets [Builder.city] to an arbitrary JSON value.
             *
             * You should usually call [Builder.city] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun city(city: JsonField<String>) = apply { this.city = city }

            /**
             * The two-letter [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)
             * code for the country of the address.
             */
            fun country(country: String) = country(JsonField.of(country))

            /**
             * Sets [Builder.country] to an arbitrary JSON value.
             *
             * You should usually call [Builder.country] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun country(country: JsonField<String>) = apply { this.country = country }

            /** The first line of the address. This is usually the street number and street. */
            fun line1(line1: String) = line1(JsonField.of(line1))

            /**
             * Sets [Builder.line1] to an arbitrary JSON value.
             *
             * You should usually call [Builder.line1] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

            /** The second line of the address. This might be the floor or room number. */
            fun line2(line2: String) = line2(JsonField.of(line2))

            /**
             * Sets [Builder.line2] to an arbitrary JSON value.
             *
             * You should usually call [Builder.line2] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

            /** The ZIP or postal code of the address. Required in certain countries. */
            fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

            /**
             * Sets [Builder.postalCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.postalCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun postalCode(postalCode: JsonField<String>) = apply { this.postalCode = postalCode }

            /** The state, province, or region of the address. Required in certain countries. */
            fun state(state: String) = state(JsonField.of(state))

            /**
             * Sets [Builder.state] to an arbitrary JSON value.
             *
             * You should usually call [Builder.state] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun state(state: JsonField<String>) = apply { this.state = state }

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
             * Returns an immutable instance of [CreditorAddress].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .city()
             * .country()
             * .line1()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): CreditorAddress =
                CreditorAddress(
                    checkRequired("city", city),
                    checkRequired("country", country),
                    checkRequired("line1", line1),
                    line2,
                    postalCode,
                    state,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): CreditorAddress = apply {
            if (validated) {
                return@apply
            }

            city()
            country()
            line1()
            line2()
            postalCode()
            state()
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
                (if (country.asKnown().isPresent) 1 else 0) +
                (if (line1.asKnown().isPresent) 1 else 0) +
                (if (line2.asKnown().isPresent) 1 else 0) +
                (if (postalCode.asKnown().isPresent) 1 else 0) +
                (if (state.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CreditorAddress &&
                city == other.city &&
                country == other.country &&
                line1 == other.line1 &&
                line2 == other.line2 &&
                postalCode == other.postalCode &&
                state == other.state &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(city, country, line1, line2, postalCode, state, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CreditorAddress{city=$city, country=$country, line1=$line1, line2=$line2, postalCode=$postalCode, state=$state, additionalProperties=$additionalProperties}"
    }

    /** The debtor's address. */
    class DebtorAddress
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val city: JsonField<String>,
        private val country: JsonField<String>,
        private val line1: JsonField<String>,
        private val line2: JsonField<String>,
        private val postalCode: JsonField<String>,
        private val state: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("city") @ExcludeMissing city: JsonField<String> = JsonMissing.of(),
            @JsonProperty("country") @ExcludeMissing country: JsonField<String> = JsonMissing.of(),
            @JsonProperty("line1") @ExcludeMissing line1: JsonField<String> = JsonMissing.of(),
            @JsonProperty("line2") @ExcludeMissing line2: JsonField<String> = JsonMissing.of(),
            @JsonProperty("postal_code")
            @ExcludeMissing
            postalCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("state") @ExcludeMissing state: JsonField<String> = JsonMissing.of(),
        ) : this(city, country, line1, line2, postalCode, state, mutableMapOf())

        /**
         * The city, district, town, or village of the address.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun city(): String = city.getRequired("city")

        /**
         * The two-letter [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)
         * code for the country of the address.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun country(): String = country.getRequired("country")

        /**
         * The first line of the address. This is usually the street number and street.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun line1(): String = line1.getRequired("line1")

        /**
         * The second line of the address. This might be the floor or room number.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun line2(): Optional<String> = line2.getOptional("line2")

        /**
         * The ZIP or postal code of the address. Required in certain countries.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun postalCode(): Optional<String> = postalCode.getOptional("postal_code")

        /**
         * The state, province, or region of the address. Required in certain countries.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun state(): Optional<String> = state.getOptional("state")

        /**
         * Returns the raw JSON value of [city].
         *
         * Unlike [city], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

        /**
         * Returns the raw JSON value of [country].
         *
         * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

        /**
         * Returns the raw JSON value of [line1].
         *
         * Unlike [line1], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("line1") @ExcludeMissing fun _line1(): JsonField<String> = line1

        /**
         * Returns the raw JSON value of [line2].
         *
         * Unlike [line2], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("line2") @ExcludeMissing fun _line2(): JsonField<String> = line2

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
             * Returns a mutable builder for constructing an instance of [DebtorAddress].
             *
             * The following fields are required:
             * ```java
             * .city()
             * .country()
             * .line1()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [DebtorAddress]. */
        class Builder internal constructor() {

            private var city: JsonField<String>? = null
            private var country: JsonField<String>? = null
            private var line1: JsonField<String>? = null
            private var line2: JsonField<String> = JsonMissing.of()
            private var postalCode: JsonField<String> = JsonMissing.of()
            private var state: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(debtorAddress: DebtorAddress) = apply {
                city = debtorAddress.city
                country = debtorAddress.country
                line1 = debtorAddress.line1
                line2 = debtorAddress.line2
                postalCode = debtorAddress.postalCode
                state = debtorAddress.state
                additionalProperties = debtorAddress.additionalProperties.toMutableMap()
            }

            /** The city, district, town, or village of the address. */
            fun city(city: String) = city(JsonField.of(city))

            /**
             * Sets [Builder.city] to an arbitrary JSON value.
             *
             * You should usually call [Builder.city] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun city(city: JsonField<String>) = apply { this.city = city }

            /**
             * The two-letter [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)
             * code for the country of the address.
             */
            fun country(country: String) = country(JsonField.of(country))

            /**
             * Sets [Builder.country] to an arbitrary JSON value.
             *
             * You should usually call [Builder.country] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun country(country: JsonField<String>) = apply { this.country = country }

            /** The first line of the address. This is usually the street number and street. */
            fun line1(line1: String) = line1(JsonField.of(line1))

            /**
             * Sets [Builder.line1] to an arbitrary JSON value.
             *
             * You should usually call [Builder.line1] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

            /** The second line of the address. This might be the floor or room number. */
            fun line2(line2: String) = line2(JsonField.of(line2))

            /**
             * Sets [Builder.line2] to an arbitrary JSON value.
             *
             * You should usually call [Builder.line2] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

            /** The ZIP or postal code of the address. Required in certain countries. */
            fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

            /**
             * Sets [Builder.postalCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.postalCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun postalCode(postalCode: JsonField<String>) = apply { this.postalCode = postalCode }

            /** The state, province, or region of the address. Required in certain countries. */
            fun state(state: String) = state(JsonField.of(state))

            /**
             * Sets [Builder.state] to an arbitrary JSON value.
             *
             * You should usually call [Builder.state] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun state(state: JsonField<String>) = apply { this.state = state }

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
             * Returns an immutable instance of [DebtorAddress].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .city()
             * .country()
             * .line1()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): DebtorAddress =
                DebtorAddress(
                    checkRequired("city", city),
                    checkRequired("country", country),
                    checkRequired("line1", line1),
                    line2,
                    postalCode,
                    state,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): DebtorAddress = apply {
            if (validated) {
                return@apply
            }

            city()
            country()
            line1()
            line2()
            postalCode()
            state()
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
                (if (country.asKnown().isPresent) 1 else 0) +
                (if (line1.asKnown().isPresent) 1 else 0) +
                (if (line2.asKnown().isPresent) 1 else 0) +
                (if (postalCode.asKnown().isPresent) 1 else 0) +
                (if (state.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DebtorAddress &&
                city == other.city &&
                country == other.country &&
                line1 == other.line1 &&
                line2 == other.line2 &&
                postalCode == other.postalCode &&
                state == other.state &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(city, country, line1, line2, postalCode, state, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DebtorAddress{city=$city, country=$country, line1=$line1, line2=$line2, postalCode=$postalCode, state=$state, additionalProperties=$additionalProperties}"
    }

    /**
     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code of the instructed
     * amount.
     */
    class InstructedCurrency
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

            /** United States Dollar */
            @JvmField val USD = of("USD")

            @JvmStatic fun of(value: String) = InstructedCurrency(JsonField.of(value))
        }

        /** An enum containing [InstructedCurrency]'s known values. */
        enum class Known {
            /** United States Dollar */
            USD
        }

        /**
         * An enum containing [InstructedCurrency]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [InstructedCurrency] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            /** United States Dollar */
            USD,
            /**
             * An enum member indicating that [InstructedCurrency] was instantiated with an unknown
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
                USD -> Value.USD
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
                USD -> Known.USD
                else -> throw IncreaseInvalidDataException("Unknown InstructedCurrency: $value")
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

        fun validate(): InstructedCurrency = apply {
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

            return other is InstructedCurrency && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SwiftTransferCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "SwiftTransferCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
