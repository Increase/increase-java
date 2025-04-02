// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.realtimepaymentstransfers

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

/** Create a Real-Time Payments Transfer */
class RealTimePaymentsTransferCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The transfer amount in USD cents. For Real-Time Payments transfers, must be positive.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amount(): Long = body.amount()

    /**
     * The name of the transfer's recipient.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun creditorName(): String = body.creditorName()

    /**
     * Unstructured information that will show on the recipient's bank statement.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun remittanceInformation(): String = body.remittanceInformation()

    /**
     * The identifier of the Account Number from which to send the transfer.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sourceAccountNumberId(): String = body.sourceAccountNumberId()

    /**
     * The name of the transfer's sender. If not provided, defaults to the name of the account's
     * entity.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun debtorName(): Optional<String> = body.debtorName()

    /**
     * The destination account number.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun destinationAccountNumber(): Optional<String> = body.destinationAccountNumber()

    /**
     * The destination American Bankers' Association (ABA) Routing Transit Number (RTN).
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun destinationRoutingNumber(): Optional<String> = body.destinationRoutingNumber()

    /**
     * The ID of an External Account to initiate a transfer to. If this parameter is provided,
     * `destination_account_number` and `destination_routing_number` must be absent.
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
     * The name of the ultimate recipient of the transfer. Set this if the creditor is an
     * intermediary receiving the payment for someone else.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun ultimateCreditorName(): Optional<String> = body.ultimateCreditorName()

    /**
     * The name of the ultimate sender of the transfer. Set this if the funds are being sent on
     * behalf of someone who is not the account holder at Increase.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun ultimateDebtorName(): Optional<String> = body.ultimateDebtorName()

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
     * Returns the raw JSON value of [remittanceInformation].
     *
     * Unlike [remittanceInformation], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _remittanceInformation(): JsonField<String> = body._remittanceInformation()

    /**
     * Returns the raw JSON value of [sourceAccountNumberId].
     *
     * Unlike [sourceAccountNumberId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _sourceAccountNumberId(): JsonField<String> = body._sourceAccountNumberId()

    /**
     * Returns the raw JSON value of [debtorName].
     *
     * Unlike [debtorName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _debtorName(): JsonField<String> = body._debtorName()

    /**
     * Returns the raw JSON value of [destinationAccountNumber].
     *
     * Unlike [destinationAccountNumber], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _destinationAccountNumber(): JsonField<String> = body._destinationAccountNumber()

    /**
     * Returns the raw JSON value of [destinationRoutingNumber].
     *
     * Unlike [destinationRoutingNumber], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _destinationRoutingNumber(): JsonField<String> = body._destinationRoutingNumber()

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
     * Returns the raw JSON value of [ultimateCreditorName].
     *
     * Unlike [ultimateCreditorName], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _ultimateCreditorName(): JsonField<String> = body._ultimateCreditorName()

    /**
     * Returns the raw JSON value of [ultimateDebtorName].
     *
     * Unlike [ultimateDebtorName], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _ultimateDebtorName(): JsonField<String> = body._ultimateDebtorName()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [RealTimePaymentsTransferCreateParams].
         *
         * The following fields are required:
         * ```java
         * .amount()
         * .creditorName()
         * .remittanceInformation()
         * .sourceAccountNumberId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RealTimePaymentsTransferCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            realTimePaymentsTransferCreateParams: RealTimePaymentsTransferCreateParams
        ) = apply {
            body = realTimePaymentsTransferCreateParams.body.toBuilder()
            additionalHeaders = realTimePaymentsTransferCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                realTimePaymentsTransferCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [amount]
         * - [creditorName]
         * - [remittanceInformation]
         * - [sourceAccountNumberId]
         * - [debtorName]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The transfer amount in USD cents. For Real-Time Payments transfers, must be positive. */
        fun amount(amount: Long) = apply { body.amount(amount) }

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<Long>) = apply { body.amount(amount) }

        /** The name of the transfer's recipient. */
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

        /** Unstructured information that will show on the recipient's bank statement. */
        fun remittanceInformation(remittanceInformation: String) = apply {
            body.remittanceInformation(remittanceInformation)
        }

        /**
         * Sets [Builder.remittanceInformation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.remittanceInformation] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun remittanceInformation(remittanceInformation: JsonField<String>) = apply {
            body.remittanceInformation(remittanceInformation)
        }

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

        /**
         * The name of the transfer's sender. If not provided, defaults to the name of the account's
         * entity.
         */
        fun debtorName(debtorName: String) = apply { body.debtorName(debtorName) }

        /**
         * Sets [Builder.debtorName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.debtorName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun debtorName(debtorName: JsonField<String>) = apply { body.debtorName(debtorName) }

        /** The destination account number. */
        fun destinationAccountNumber(destinationAccountNumber: String) = apply {
            body.destinationAccountNumber(destinationAccountNumber)
        }

        /**
         * Sets [Builder.destinationAccountNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.destinationAccountNumber] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun destinationAccountNumber(destinationAccountNumber: JsonField<String>) = apply {
            body.destinationAccountNumber(destinationAccountNumber)
        }

        /** The destination American Bankers' Association (ABA) Routing Transit Number (RTN). */
        fun destinationRoutingNumber(destinationRoutingNumber: String) = apply {
            body.destinationRoutingNumber(destinationRoutingNumber)
        }

        /**
         * Sets [Builder.destinationRoutingNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.destinationRoutingNumber] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun destinationRoutingNumber(destinationRoutingNumber: JsonField<String>) = apply {
            body.destinationRoutingNumber(destinationRoutingNumber)
        }

        /**
         * The ID of an External Account to initiate a transfer to. If this parameter is provided,
         * `destination_account_number` and `destination_routing_number` must be absent.
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

        /**
         * The name of the ultimate recipient of the transfer. Set this if the creditor is an
         * intermediary receiving the payment for someone else.
         */
        fun ultimateCreditorName(ultimateCreditorName: String) = apply {
            body.ultimateCreditorName(ultimateCreditorName)
        }

        /**
         * Sets [Builder.ultimateCreditorName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ultimateCreditorName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun ultimateCreditorName(ultimateCreditorName: JsonField<String>) = apply {
            body.ultimateCreditorName(ultimateCreditorName)
        }

        /**
         * The name of the ultimate sender of the transfer. Set this if the funds are being sent on
         * behalf of someone who is not the account holder at Increase.
         */
        fun ultimateDebtorName(ultimateDebtorName: String) = apply {
            body.ultimateDebtorName(ultimateDebtorName)
        }

        /**
         * Sets [Builder.ultimateDebtorName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ultimateDebtorName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun ultimateDebtorName(ultimateDebtorName: JsonField<String>) = apply {
            body.ultimateDebtorName(ultimateDebtorName)
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
         * Returns an immutable instance of [RealTimePaymentsTransferCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .amount()
         * .creditorName()
         * .remittanceInformation()
         * .sourceAccountNumberId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RealTimePaymentsTransferCreateParams =
            RealTimePaymentsTransferCreateParams(
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
        private val amount: JsonField<Long>,
        private val creditorName: JsonField<String>,
        private val remittanceInformation: JsonField<String>,
        private val sourceAccountNumberId: JsonField<String>,
        private val debtorName: JsonField<String>,
        private val destinationAccountNumber: JsonField<String>,
        private val destinationRoutingNumber: JsonField<String>,
        private val externalAccountId: JsonField<String>,
        private val requireApproval: JsonField<Boolean>,
        private val ultimateCreditorName: JsonField<String>,
        private val ultimateDebtorName: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("creditor_name")
            @ExcludeMissing
            creditorName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("remittance_information")
            @ExcludeMissing
            remittanceInformation: JsonField<String> = JsonMissing.of(),
            @JsonProperty("source_account_number_id")
            @ExcludeMissing
            sourceAccountNumberId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("debtor_name")
            @ExcludeMissing
            debtorName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("destination_account_number")
            @ExcludeMissing
            destinationAccountNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("destination_routing_number")
            @ExcludeMissing
            destinationRoutingNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("external_account_id")
            @ExcludeMissing
            externalAccountId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("require_approval")
            @ExcludeMissing
            requireApproval: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("ultimate_creditor_name")
            @ExcludeMissing
            ultimateCreditorName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ultimate_debtor_name")
            @ExcludeMissing
            ultimateDebtorName: JsonField<String> = JsonMissing.of(),
        ) : this(
            amount,
            creditorName,
            remittanceInformation,
            sourceAccountNumberId,
            debtorName,
            destinationAccountNumber,
            destinationRoutingNumber,
            externalAccountId,
            requireApproval,
            ultimateCreditorName,
            ultimateDebtorName,
            mutableMapOf(),
        )

        /**
         * The transfer amount in USD cents. For Real-Time Payments transfers, must be positive.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun amount(): Long = amount.getRequired("amount")

        /**
         * The name of the transfer's recipient.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun creditorName(): String = creditorName.getRequired("creditor_name")

        /**
         * Unstructured information that will show on the recipient's bank statement.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun remittanceInformation(): String =
            remittanceInformation.getRequired("remittance_information")

        /**
         * The identifier of the Account Number from which to send the transfer.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun sourceAccountNumberId(): String =
            sourceAccountNumberId.getRequired("source_account_number_id")

        /**
         * The name of the transfer's sender. If not provided, defaults to the name of the account's
         * entity.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun debtorName(): Optional<String> =
            Optional.ofNullable(debtorName.getNullable("debtor_name"))

        /**
         * The destination account number.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun destinationAccountNumber(): Optional<String> =
            Optional.ofNullable(destinationAccountNumber.getNullable("destination_account_number"))

        /**
         * The destination American Bankers' Association (ABA) Routing Transit Number (RTN).
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun destinationRoutingNumber(): Optional<String> =
            Optional.ofNullable(destinationRoutingNumber.getNullable("destination_routing_number"))

        /**
         * The ID of an External Account to initiate a transfer to. If this parameter is provided,
         * `destination_account_number` and `destination_routing_number` must be absent.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun externalAccountId(): Optional<String> =
            Optional.ofNullable(externalAccountId.getNullable("external_account_id"))

        /**
         * Whether the transfer requires explicit approval via the dashboard or API.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun requireApproval(): Optional<Boolean> =
            Optional.ofNullable(requireApproval.getNullable("require_approval"))

        /**
         * The name of the ultimate recipient of the transfer. Set this if the creditor is an
         * intermediary receiving the payment for someone else.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun ultimateCreditorName(): Optional<String> =
            Optional.ofNullable(ultimateCreditorName.getNullable("ultimate_creditor_name"))

        /**
         * The name of the ultimate sender of the transfer. Set this if the funds are being sent on
         * behalf of someone who is not the account holder at Increase.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun ultimateDebtorName(): Optional<String> =
            Optional.ofNullable(ultimateDebtorName.getNullable("ultimate_debtor_name"))

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
         * Returns the raw JSON value of [remittanceInformation].
         *
         * Unlike [remittanceInformation], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("remittance_information")
        @ExcludeMissing
        fun _remittanceInformation(): JsonField<String> = remittanceInformation

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
         * Returns the raw JSON value of [debtorName].
         *
         * Unlike [debtorName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("debtor_name")
        @ExcludeMissing
        fun _debtorName(): JsonField<String> = debtorName

        /**
         * Returns the raw JSON value of [destinationAccountNumber].
         *
         * Unlike [destinationAccountNumber], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("destination_account_number")
        @ExcludeMissing
        fun _destinationAccountNumber(): JsonField<String> = destinationAccountNumber

        /**
         * Returns the raw JSON value of [destinationRoutingNumber].
         *
         * Unlike [destinationRoutingNumber], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("destination_routing_number")
        @ExcludeMissing
        fun _destinationRoutingNumber(): JsonField<String> = destinationRoutingNumber

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
         * Returns the raw JSON value of [ultimateCreditorName].
         *
         * Unlike [ultimateCreditorName], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("ultimate_creditor_name")
        @ExcludeMissing
        fun _ultimateCreditorName(): JsonField<String> = ultimateCreditorName

        /**
         * Returns the raw JSON value of [ultimateDebtorName].
         *
         * Unlike [ultimateDebtorName], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("ultimate_debtor_name")
        @ExcludeMissing
        fun _ultimateDebtorName(): JsonField<String> = ultimateDebtorName

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
             * .creditorName()
             * .remittanceInformation()
             * .sourceAccountNumberId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var amount: JsonField<Long>? = null
            private var creditorName: JsonField<String>? = null
            private var remittanceInformation: JsonField<String>? = null
            private var sourceAccountNumberId: JsonField<String>? = null
            private var debtorName: JsonField<String> = JsonMissing.of()
            private var destinationAccountNumber: JsonField<String> = JsonMissing.of()
            private var destinationRoutingNumber: JsonField<String> = JsonMissing.of()
            private var externalAccountId: JsonField<String> = JsonMissing.of()
            private var requireApproval: JsonField<Boolean> = JsonMissing.of()
            private var ultimateCreditorName: JsonField<String> = JsonMissing.of()
            private var ultimateDebtorName: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                amount = body.amount
                creditorName = body.creditorName
                remittanceInformation = body.remittanceInformation
                sourceAccountNumberId = body.sourceAccountNumberId
                debtorName = body.debtorName
                destinationAccountNumber = body.destinationAccountNumber
                destinationRoutingNumber = body.destinationRoutingNumber
                externalAccountId = body.externalAccountId
                requireApproval = body.requireApproval
                ultimateCreditorName = body.ultimateCreditorName
                ultimateDebtorName = body.ultimateDebtorName
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * The transfer amount in USD cents. For Real-Time Payments transfers, must be positive.
             */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            /** The name of the transfer's recipient. */
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

            /** Unstructured information that will show on the recipient's bank statement. */
            fun remittanceInformation(remittanceInformation: String) =
                remittanceInformation(JsonField.of(remittanceInformation))

            /**
             * Sets [Builder.remittanceInformation] to an arbitrary JSON value.
             *
             * You should usually call [Builder.remittanceInformation] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun remittanceInformation(remittanceInformation: JsonField<String>) = apply {
                this.remittanceInformation = remittanceInformation
            }

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

            /**
             * The name of the transfer's sender. If not provided, defaults to the name of the
             * account's entity.
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

            /** The destination account number. */
            fun destinationAccountNumber(destinationAccountNumber: String) =
                destinationAccountNumber(JsonField.of(destinationAccountNumber))

            /**
             * Sets [Builder.destinationAccountNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.destinationAccountNumber] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun destinationAccountNumber(destinationAccountNumber: JsonField<String>) = apply {
                this.destinationAccountNumber = destinationAccountNumber
            }

            /** The destination American Bankers' Association (ABA) Routing Transit Number (RTN). */
            fun destinationRoutingNumber(destinationRoutingNumber: String) =
                destinationRoutingNumber(JsonField.of(destinationRoutingNumber))

            /**
             * Sets [Builder.destinationRoutingNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.destinationRoutingNumber] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun destinationRoutingNumber(destinationRoutingNumber: JsonField<String>) = apply {
                this.destinationRoutingNumber = destinationRoutingNumber
            }

            /**
             * The ID of an External Account to initiate a transfer to. If this parameter is
             * provided, `destination_account_number` and `destination_routing_number` must be
             * absent.
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

            /**
             * The name of the ultimate recipient of the transfer. Set this if the creditor is an
             * intermediary receiving the payment for someone else.
             */
            fun ultimateCreditorName(ultimateCreditorName: String) =
                ultimateCreditorName(JsonField.of(ultimateCreditorName))

            /**
             * Sets [Builder.ultimateCreditorName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ultimateCreditorName] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun ultimateCreditorName(ultimateCreditorName: JsonField<String>) = apply {
                this.ultimateCreditorName = ultimateCreditorName
            }

            /**
             * The name of the ultimate sender of the transfer. Set this if the funds are being sent
             * on behalf of someone who is not the account holder at Increase.
             */
            fun ultimateDebtorName(ultimateDebtorName: String) =
                ultimateDebtorName(JsonField.of(ultimateDebtorName))

            /**
             * Sets [Builder.ultimateDebtorName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ultimateDebtorName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ultimateDebtorName(ultimateDebtorName: JsonField<String>) = apply {
                this.ultimateDebtorName = ultimateDebtorName
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
             * .creditorName()
             * .remittanceInformation()
             * .sourceAccountNumberId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("amount", amount),
                    checkRequired("creditorName", creditorName),
                    checkRequired("remittanceInformation", remittanceInformation),
                    checkRequired("sourceAccountNumberId", sourceAccountNumberId),
                    debtorName,
                    destinationAccountNumber,
                    destinationRoutingNumber,
                    externalAccountId,
                    requireApproval,
                    ultimateCreditorName,
                    ultimateDebtorName,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            amount()
            creditorName()
            remittanceInformation()
            sourceAccountNumberId()
            debtorName()
            destinationAccountNumber()
            destinationRoutingNumber()
            externalAccountId()
            requireApproval()
            ultimateCreditorName()
            ultimateDebtorName()
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
                (if (creditorName.asKnown().isPresent) 1 else 0) +
                (if (remittanceInformation.asKnown().isPresent) 1 else 0) +
                (if (sourceAccountNumberId.asKnown().isPresent) 1 else 0) +
                (if (debtorName.asKnown().isPresent) 1 else 0) +
                (if (destinationAccountNumber.asKnown().isPresent) 1 else 0) +
                (if (destinationRoutingNumber.asKnown().isPresent) 1 else 0) +
                (if (externalAccountId.asKnown().isPresent) 1 else 0) +
                (if (requireApproval.asKnown().isPresent) 1 else 0) +
                (if (ultimateCreditorName.asKnown().isPresent) 1 else 0) +
                (if (ultimateDebtorName.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && amount == other.amount && creditorName == other.creditorName && remittanceInformation == other.remittanceInformation && sourceAccountNumberId == other.sourceAccountNumberId && debtorName == other.debtorName && destinationAccountNumber == other.destinationAccountNumber && destinationRoutingNumber == other.destinationRoutingNumber && externalAccountId == other.externalAccountId && requireApproval == other.requireApproval && ultimateCreditorName == other.ultimateCreditorName && ultimateDebtorName == other.ultimateDebtorName && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(amount, creditorName, remittanceInformation, sourceAccountNumberId, debtorName, destinationAccountNumber, destinationRoutingNumber, externalAccountId, requireApproval, ultimateCreditorName, ultimateDebtorName, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{amount=$amount, creditorName=$creditorName, remittanceInformation=$remittanceInformation, sourceAccountNumberId=$sourceAccountNumberId, debtorName=$debtorName, destinationAccountNumber=$destinationAccountNumber, destinationRoutingNumber=$destinationRoutingNumber, externalAccountId=$externalAccountId, requireApproval=$requireApproval, ultimateCreditorName=$ultimateCreditorName, ultimateDebtorName=$ultimateDebtorName, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is RealTimePaymentsTransferCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "RealTimePaymentsTransferCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
