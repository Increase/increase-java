// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.fednowtransfers

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
import kotlin.jvm.optionals.getOrNull

/** Create a FedNow Transfer */
class FednowTransferCreateParams
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
     * The amount, in minor units, to send to the creditor.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amount(): Long = body.amount()

    /**
     * The creditor's name.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun creditorName(): String = body.creditorName()

    /**
     * The debtor's name.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun debtorName(): String = body.debtorName()

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
     * The creditor's account number.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accountNumber(): Optional<String> = body.accountNumber()

    /**
     * The creditor's address.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun creditorAddress(): Optional<CreditorAddress> = body.creditorAddress()

    /**
     * The debtor's address.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun debtorAddress(): Optional<DebtorAddress> = body.debtorAddress()

    /**
     * The ID of an External Account to initiate a transfer to. If this parameter is provided,
     * `account_number` and `routing_number` must be absent.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun externalAccountId(): Optional<String> = body.externalAccountId()

    /**
     * Whether the transfer requires explicit approval via the dashboard or API.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun requireApproval(): Optional<Boolean> = body.requireApproval()

    /**
     * The creditor's bank account routing number.
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
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _amount(): JsonField<Long> = body._amount()

    /**
     * Returns the raw JSON value of [creditorName].
     *
     * Unlike [creditorName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _creditorName(): JsonField<String> = body._creditorName()

    /**
     * Returns the raw JSON value of [debtorName].
     *
     * Unlike [debtorName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _debtorName(): JsonField<String> = body._debtorName()

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
     * Returns the raw JSON value of [accountNumber].
     *
     * Unlike [accountNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _accountNumber(): JsonField<String> = body._accountNumber()

    /**
     * Returns the raw JSON value of [creditorAddress].
     *
     * Unlike [creditorAddress], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _creditorAddress(): JsonField<CreditorAddress> = body._creditorAddress()

    /**
     * Returns the raw JSON value of [debtorAddress].
     *
     * Unlike [debtorAddress], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _debtorAddress(): JsonField<DebtorAddress> = body._debtorAddress()

    /**
     * Returns the raw JSON value of [externalAccountId].
     *
     * Unlike [externalAccountId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _externalAccountId(): JsonField<String> = body._externalAccountId()

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
         * Returns a mutable builder for constructing an instance of [FednowTransferCreateParams].
         *
         * The following fields are required:
         * ```java
         * .accountId()
         * .amount()
         * .creditorName()
         * .debtorName()
         * .sourceAccountNumberId()
         * .unstructuredRemittanceInformation()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FednowTransferCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(fednowTransferCreateParams: FednowTransferCreateParams) = apply {
            body = fednowTransferCreateParams.body.toBuilder()
            additionalHeaders = fednowTransferCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = fednowTransferCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [accountId]
         * - [amount]
         * - [creditorName]
         * - [debtorName]
         * - [sourceAccountNumberId]
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

        /** The amount, in minor units, to send to the creditor. */
        fun amount(amount: Long) = apply { body.amount(amount) }

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<Long>) = apply { body.amount(amount) }

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

        /** The creditor's bank account routing number. */
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
         * Returns an immutable instance of [FednowTransferCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .accountId()
         * .amount()
         * .creditorName()
         * .debtorName()
         * .sourceAccountNumberId()
         * .unstructuredRemittanceInformation()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FednowTransferCreateParams =
            FednowTransferCreateParams(
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
        private val amount: JsonField<Long>,
        private val creditorName: JsonField<String>,
        private val debtorName: JsonField<String>,
        private val sourceAccountNumberId: JsonField<String>,
        private val unstructuredRemittanceInformation: JsonField<String>,
        private val accountNumber: JsonField<String>,
        private val creditorAddress: JsonField<CreditorAddress>,
        private val debtorAddress: JsonField<DebtorAddress>,
        private val externalAccountId: JsonField<String>,
        private val requireApproval: JsonField<Boolean>,
        private val routingNumber: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("account_id")
            @ExcludeMissing
            accountId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("creditor_name")
            @ExcludeMissing
            creditorName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("debtor_name")
            @ExcludeMissing
            debtorName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("source_account_number_id")
            @ExcludeMissing
            sourceAccountNumberId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("unstructured_remittance_information")
            @ExcludeMissing
            unstructuredRemittanceInformation: JsonField<String> = JsonMissing.of(),
            @JsonProperty("account_number")
            @ExcludeMissing
            accountNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("creditor_address")
            @ExcludeMissing
            creditorAddress: JsonField<CreditorAddress> = JsonMissing.of(),
            @JsonProperty("debtor_address")
            @ExcludeMissing
            debtorAddress: JsonField<DebtorAddress> = JsonMissing.of(),
            @JsonProperty("external_account_id")
            @ExcludeMissing
            externalAccountId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("require_approval")
            @ExcludeMissing
            requireApproval: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("routing_number")
            @ExcludeMissing
            routingNumber: JsonField<String> = JsonMissing.of(),
        ) : this(
            accountId,
            amount,
            creditorName,
            debtorName,
            sourceAccountNumberId,
            unstructuredRemittanceInformation,
            accountNumber,
            creditorAddress,
            debtorAddress,
            externalAccountId,
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
         * The amount, in minor units, to send to the creditor.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun amount(): Long = amount.getRequired("amount")

        /**
         * The creditor's name.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun creditorName(): String = creditorName.getRequired("creditor_name")

        /**
         * The debtor's name.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun debtorName(): String = debtorName.getRequired("debtor_name")

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
         * The creditor's account number.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun accountNumber(): Optional<String> = accountNumber.getOptional("account_number")

        /**
         * The creditor's address.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun creditorAddress(): Optional<CreditorAddress> =
            creditorAddress.getOptional("creditor_address")

        /**
         * The debtor's address.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun debtorAddress(): Optional<DebtorAddress> = debtorAddress.getOptional("debtor_address")

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
         * Whether the transfer requires explicit approval via the dashboard or API.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun requireApproval(): Optional<Boolean> = requireApproval.getOptional("require_approval")

        /**
         * The creditor's bank account routing number.
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
         * Returns the raw JSON value of [amount].
         *
         * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

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
         * Returns the raw JSON value of [debtorName].
         *
         * Unlike [debtorName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("debtor_name")
        @ExcludeMissing
        fun _debtorName(): JsonField<String> = debtorName

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
         * Returns the raw JSON value of [accountNumber].
         *
         * Unlike [accountNumber], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("account_number")
        @ExcludeMissing
        fun _accountNumber(): JsonField<String> = accountNumber

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
         * Returns the raw JSON value of [debtorAddress].
         *
         * Unlike [debtorAddress], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("debtor_address")
        @ExcludeMissing
        fun _debtorAddress(): JsonField<DebtorAddress> = debtorAddress

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
             * .amount()
             * .creditorName()
             * .debtorName()
             * .sourceAccountNumberId()
             * .unstructuredRemittanceInformation()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var accountId: JsonField<String>? = null
            private var amount: JsonField<Long>? = null
            private var creditorName: JsonField<String>? = null
            private var debtorName: JsonField<String>? = null
            private var sourceAccountNumberId: JsonField<String>? = null
            private var unstructuredRemittanceInformation: JsonField<String>? = null
            private var accountNumber: JsonField<String> = JsonMissing.of()
            private var creditorAddress: JsonField<CreditorAddress> = JsonMissing.of()
            private var debtorAddress: JsonField<DebtorAddress> = JsonMissing.of()
            private var externalAccountId: JsonField<String> = JsonMissing.of()
            private var requireApproval: JsonField<Boolean> = JsonMissing.of()
            private var routingNumber: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                accountId = body.accountId
                amount = body.amount
                creditorName = body.creditorName
                debtorName = body.debtorName
                sourceAccountNumberId = body.sourceAccountNumberId
                unstructuredRemittanceInformation = body.unstructuredRemittanceInformation
                accountNumber = body.accountNumber
                creditorAddress = body.creditorAddress
                debtorAddress = body.debtorAddress
                externalAccountId = body.externalAccountId
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

            /** The amount, in minor units, to send to the creditor. */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

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

            /** The creditor's bank account routing number. */
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
             * .amount()
             * .creditorName()
             * .debtorName()
             * .sourceAccountNumberId()
             * .unstructuredRemittanceInformation()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("accountId", accountId),
                    checkRequired("amount", amount),
                    checkRequired("creditorName", creditorName),
                    checkRequired("debtorName", debtorName),
                    checkRequired("sourceAccountNumberId", sourceAccountNumberId),
                    checkRequired(
                        "unstructuredRemittanceInformation",
                        unstructuredRemittanceInformation,
                    ),
                    accountNumber,
                    creditorAddress,
                    debtorAddress,
                    externalAccountId,
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
            amount()
            creditorName()
            debtorName()
            sourceAccountNumberId()
            unstructuredRemittanceInformation()
            accountNumber()
            creditorAddress().ifPresent { it.validate() }
            debtorAddress().ifPresent { it.validate() }
            externalAccountId()
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
                (if (amount.asKnown().isPresent) 1 else 0) +
                (if (creditorName.asKnown().isPresent) 1 else 0) +
                (if (debtorName.asKnown().isPresent) 1 else 0) +
                (if (sourceAccountNumberId.asKnown().isPresent) 1 else 0) +
                (if (unstructuredRemittanceInformation.asKnown().isPresent) 1 else 0) +
                (if (accountNumber.asKnown().isPresent) 1 else 0) +
                (creditorAddress.asKnown().getOrNull()?.validity() ?: 0) +
                (debtorAddress.asKnown().getOrNull()?.validity() ?: 0) +
                (if (externalAccountId.asKnown().isPresent) 1 else 0) +
                (if (requireApproval.asKnown().isPresent) 1 else 0) +
                (if (routingNumber.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                accountId == other.accountId &&
                amount == other.amount &&
                creditorName == other.creditorName &&
                debtorName == other.debtorName &&
                sourceAccountNumberId == other.sourceAccountNumberId &&
                unstructuredRemittanceInformation == other.unstructuredRemittanceInformation &&
                accountNumber == other.accountNumber &&
                creditorAddress == other.creditorAddress &&
                debtorAddress == other.debtorAddress &&
                externalAccountId == other.externalAccountId &&
                requireApproval == other.requireApproval &&
                routingNumber == other.routingNumber &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                accountId,
                amount,
                creditorName,
                debtorName,
                sourceAccountNumberId,
                unstructuredRemittanceInformation,
                accountNumber,
                creditorAddress,
                debtorAddress,
                externalAccountId,
                requireApproval,
                routingNumber,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{accountId=$accountId, amount=$amount, creditorName=$creditorName, debtorName=$debtorName, sourceAccountNumberId=$sourceAccountNumberId, unstructuredRemittanceInformation=$unstructuredRemittanceInformation, accountNumber=$accountNumber, creditorAddress=$creditorAddress, debtorAddress=$debtorAddress, externalAccountId=$externalAccountId, requireApproval=$requireApproval, routingNumber=$routingNumber, additionalProperties=$additionalProperties}"
    }

    /** The creditor's address. */
    class CreditorAddress
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val city: JsonField<String>,
        private val postalCode: JsonField<String>,
        private val state: JsonField<String>,
        private val line1: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("city") @ExcludeMissing city: JsonField<String> = JsonMissing.of(),
            @JsonProperty("postal_code")
            @ExcludeMissing
            postalCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("state") @ExcludeMissing state: JsonField<String> = JsonMissing.of(),
            @JsonProperty("line1") @ExcludeMissing line1: JsonField<String> = JsonMissing.of(),
        ) : this(city, postalCode, state, line1, mutableMapOf())

        /**
         * The city, district, town, or village of the address.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun city(): String = city.getRequired("city")

        /**
         * The postal code component of the address.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun postalCode(): String = postalCode.getRequired("postal_code")

        /**
         * The US state component of the address.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun state(): String = state.getRequired("state")

        /**
         * The first line of the address. This is usually the street number and street.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun line1(): Optional<String> = line1.getOptional("line1")

        /**
         * Returns the raw JSON value of [city].
         *
         * Unlike [city], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

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

        /**
         * Returns the raw JSON value of [line1].
         *
         * Unlike [line1], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("line1") @ExcludeMissing fun _line1(): JsonField<String> = line1

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
             * .postalCode()
             * .state()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CreditorAddress]. */
        class Builder internal constructor() {

            private var city: JsonField<String>? = null
            private var postalCode: JsonField<String>? = null
            private var state: JsonField<String>? = null
            private var line1: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(creditorAddress: CreditorAddress) = apply {
                city = creditorAddress.city
                postalCode = creditorAddress.postalCode
                state = creditorAddress.state
                line1 = creditorAddress.line1
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

            /** The postal code component of the address. */
            fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

            /**
             * Sets [Builder.postalCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.postalCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun postalCode(postalCode: JsonField<String>) = apply { this.postalCode = postalCode }

            /** The US state component of the address. */
            fun state(state: String) = state(JsonField.of(state))

            /**
             * Sets [Builder.state] to an arbitrary JSON value.
             *
             * You should usually call [Builder.state] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun state(state: JsonField<String>) = apply { this.state = state }

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
             * .postalCode()
             * .state()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): CreditorAddress =
                CreditorAddress(
                    checkRequired("city", city),
                    checkRequired("postalCode", postalCode),
                    checkRequired("state", state),
                    line1,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): CreditorAddress = apply {
            if (validated) {
                return@apply
            }

            city()
            postalCode()
            state()
            line1()
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
                (if (postalCode.asKnown().isPresent) 1 else 0) +
                (if (state.asKnown().isPresent) 1 else 0) +
                (if (line1.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CreditorAddress &&
                city == other.city &&
                postalCode == other.postalCode &&
                state == other.state &&
                line1 == other.line1 &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(city, postalCode, state, line1, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CreditorAddress{city=$city, postalCode=$postalCode, state=$state, line1=$line1, additionalProperties=$additionalProperties}"
    }

    /** The debtor's address. */
    class DebtorAddress
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val city: JsonField<String>,
        private val postalCode: JsonField<String>,
        private val state: JsonField<String>,
        private val line1: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("city") @ExcludeMissing city: JsonField<String> = JsonMissing.of(),
            @JsonProperty("postal_code")
            @ExcludeMissing
            postalCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("state") @ExcludeMissing state: JsonField<String> = JsonMissing.of(),
            @JsonProperty("line1") @ExcludeMissing line1: JsonField<String> = JsonMissing.of(),
        ) : this(city, postalCode, state, line1, mutableMapOf())

        /**
         * The city, district, town, or village of the address.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun city(): String = city.getRequired("city")

        /**
         * The postal code component of the address.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun postalCode(): String = postalCode.getRequired("postal_code")

        /**
         * The US state component of the address.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun state(): String = state.getRequired("state")

        /**
         * The first line of the address. This is usually the street number and street.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun line1(): Optional<String> = line1.getOptional("line1")

        /**
         * Returns the raw JSON value of [city].
         *
         * Unlike [city], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

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

        /**
         * Returns the raw JSON value of [line1].
         *
         * Unlike [line1], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("line1") @ExcludeMissing fun _line1(): JsonField<String> = line1

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
             * .postalCode()
             * .state()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [DebtorAddress]. */
        class Builder internal constructor() {

            private var city: JsonField<String>? = null
            private var postalCode: JsonField<String>? = null
            private var state: JsonField<String>? = null
            private var line1: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(debtorAddress: DebtorAddress) = apply {
                city = debtorAddress.city
                postalCode = debtorAddress.postalCode
                state = debtorAddress.state
                line1 = debtorAddress.line1
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

            /** The postal code component of the address. */
            fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

            /**
             * Sets [Builder.postalCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.postalCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun postalCode(postalCode: JsonField<String>) = apply { this.postalCode = postalCode }

            /** The US state component of the address. */
            fun state(state: String) = state(JsonField.of(state))

            /**
             * Sets [Builder.state] to an arbitrary JSON value.
             *
             * You should usually call [Builder.state] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun state(state: JsonField<String>) = apply { this.state = state }

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
             * .postalCode()
             * .state()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): DebtorAddress =
                DebtorAddress(
                    checkRequired("city", city),
                    checkRequired("postalCode", postalCode),
                    checkRequired("state", state),
                    line1,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): DebtorAddress = apply {
            if (validated) {
                return@apply
            }

            city()
            postalCode()
            state()
            line1()
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
                (if (postalCode.asKnown().isPresent) 1 else 0) +
                (if (state.asKnown().isPresent) 1 else 0) +
                (if (line1.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DebtorAddress &&
                city == other.city &&
                postalCode == other.postalCode &&
                state == other.state &&
                line1 == other.line1 &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(city, postalCode, state, line1, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DebtorAddress{city=$city, postalCode=$postalCode, state=$state, line1=$line1, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FednowTransferCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "FednowTransferCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
