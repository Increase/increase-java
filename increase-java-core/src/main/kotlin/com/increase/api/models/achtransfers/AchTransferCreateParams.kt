// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.achtransfers

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
import com.increase.api.core.checkKnown
import com.increase.api.core.checkRequired
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.core.toImmutable
import com.increase.api.errors.IncreaseInvalidDataException
import java.time.LocalDate
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Create an ACH Transfer */
class AchTransferCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The Increase identifier for the account that will send the transfer.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountId(): String = body.accountId()

    /**
     * The transfer amount in USD cents. A positive amount originates a credit transfer pushing
     * funds to the receiving account. A negative amount originates a debit transfer pulling funds
     * from the receiving account.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amount(): Long = body.amount()

    /**
     * A description you choose to give the transfer. This will be saved with the transfer details,
     * displayed in the dashboard, and returned by the API. If `individual_name` and `company_name`
     * are not explicitly set by this API, the `statement_descriptor` will be sent in those fields
     * to the receiving bank to help the customer recognize the transfer. You are highly encouraged
     * to pass `individual_name` and `company_name` instead of relying on this fallback.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun statementDescriptor(): String = body.statementDescriptor()

    /**
     * The account number for the destination account.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accountNumber(): Optional<String> = body.accountNumber()

    /**
     * Additional information that will be sent to the recipient. This is included in the transfer
     * data sent to the receiving bank.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun addenda(): Optional<Addenda> = body.addenda()

    /**
     * The description of the date of the transfer, usually in the format `YYMMDD`. This is included
     * in the transfer data sent to the receiving bank.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun companyDescriptiveDate(): Optional<String> = body.companyDescriptiveDate()

    /**
     * The data you choose to associate with the transfer. This is included in the transfer data
     * sent to the receiving bank.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun companyDiscretionaryData(): Optional<String> = body.companyDiscretionaryData()

    /**
     * A description of the transfer, included in the transfer data sent to the receiving bank.
     * Standardized formatting may be required, for example `PAYROLL` for payroll-related
     * Prearranged Payments and Deposits (PPD) credit transfers.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun companyEntryDescription(): Optional<String> = body.companyEntryDescription()

    /**
     * The name by which the recipient knows you. This is included in the transfer data sent to the
     * receiving bank.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun companyName(): Optional<String> = body.companyName()

    /**
     * The type of entity that owns the account to which the ACH Transfer is being sent.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun destinationAccountHolder(): Optional<DestinationAccountHolder> =
        body.destinationAccountHolder()

    /**
     * The ID of an External Account to initiate a transfer to. If this parameter is provided,
     * `account_number`, `routing_number`, and `funding` must be absent.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun externalAccountId(): Optional<String> = body.externalAccountId()

    /**
     * The type of the account to which the transfer will be sent.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun funding(): Optional<Funding> = body.funding()

    /**
     * Your identifier for the transfer recipient.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun individualId(): Optional<String> = body.individualId()

    /**
     * The name of the transfer recipient. This value is informational and not verified by the
     * recipient's bank.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun individualName(): Optional<String> = body.individualName()

    /**
     * Configuration for how the effective date of the transfer will be set. This determines
     * same-day vs future-dated settlement timing. If not set, defaults to a `settlement_schedule`
     * of `same_day`. If set, exactly one of the child attributes must be set.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun preferredEffectiveDate(): Optional<PreferredEffectiveDate> = body.preferredEffectiveDate()

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
     * The [Standard Entry Class (SEC) code](/documentation/ach-standard-entry-class-codes) to use
     * for the transfer.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun standardEntryClassCode(): Optional<StandardEntryClassCode> = body.standardEntryClassCode()

    /**
     * The timing of the transaction.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun transactionTiming(): Optional<TransactionTiming> = body.transactionTiming()

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
     * Returns the raw JSON value of [statementDescriptor].
     *
     * Unlike [statementDescriptor], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _statementDescriptor(): JsonField<String> = body._statementDescriptor()

    /**
     * Returns the raw JSON value of [accountNumber].
     *
     * Unlike [accountNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _accountNumber(): JsonField<String> = body._accountNumber()

    /**
     * Returns the raw JSON value of [addenda].
     *
     * Unlike [addenda], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _addenda(): JsonField<Addenda> = body._addenda()

    /**
     * Returns the raw JSON value of [companyDescriptiveDate].
     *
     * Unlike [companyDescriptiveDate], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _companyDescriptiveDate(): JsonField<String> = body._companyDescriptiveDate()

    /**
     * Returns the raw JSON value of [companyDiscretionaryData].
     *
     * Unlike [companyDiscretionaryData], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _companyDiscretionaryData(): JsonField<String> = body._companyDiscretionaryData()

    /**
     * Returns the raw JSON value of [companyEntryDescription].
     *
     * Unlike [companyEntryDescription], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _companyEntryDescription(): JsonField<String> = body._companyEntryDescription()

    /**
     * Returns the raw JSON value of [companyName].
     *
     * Unlike [companyName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _companyName(): JsonField<String> = body._companyName()

    /**
     * Returns the raw JSON value of [destinationAccountHolder].
     *
     * Unlike [destinationAccountHolder], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _destinationAccountHolder(): JsonField<DestinationAccountHolder> =
        body._destinationAccountHolder()

    /**
     * Returns the raw JSON value of [externalAccountId].
     *
     * Unlike [externalAccountId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _externalAccountId(): JsonField<String> = body._externalAccountId()

    /**
     * Returns the raw JSON value of [funding].
     *
     * Unlike [funding], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _funding(): JsonField<Funding> = body._funding()

    /**
     * Returns the raw JSON value of [individualId].
     *
     * Unlike [individualId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _individualId(): JsonField<String> = body._individualId()

    /**
     * Returns the raw JSON value of [individualName].
     *
     * Unlike [individualName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _individualName(): JsonField<String> = body._individualName()

    /**
     * Returns the raw JSON value of [preferredEffectiveDate].
     *
     * Unlike [preferredEffectiveDate], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _preferredEffectiveDate(): JsonField<PreferredEffectiveDate> =
        body._preferredEffectiveDate()

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
     * Returns the raw JSON value of [standardEntryClassCode].
     *
     * Unlike [standardEntryClassCode], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _standardEntryClassCode(): JsonField<StandardEntryClassCode> =
        body._standardEntryClassCode()

    /**
     * Returns the raw JSON value of [transactionTiming].
     *
     * Unlike [transactionTiming], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _transactionTiming(): JsonField<TransactionTiming> = body._transactionTiming()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AchTransferCreateParams].
         *
         * The following fields are required:
         * ```java
         * .accountId()
         * .amount()
         * .statementDescriptor()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AchTransferCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(achTransferCreateParams: AchTransferCreateParams) = apply {
            body = achTransferCreateParams.body.toBuilder()
            additionalHeaders = achTransferCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = achTransferCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [accountId]
         * - [amount]
         * - [statementDescriptor]
         * - [accountNumber]
         * - [addenda]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The Increase identifier for the account that will send the transfer. */
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
         * The transfer amount in USD cents. A positive amount originates a credit transfer pushing
         * funds to the receiving account. A negative amount originates a debit transfer pulling
         * funds from the receiving account.
         */
        fun amount(amount: Long) = apply { body.amount(amount) }

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<Long>) = apply { body.amount(amount) }

        /**
         * A description you choose to give the transfer. This will be saved with the transfer
         * details, displayed in the dashboard, and returned by the API. If `individual_name` and
         * `company_name` are not explicitly set by this API, the `statement_descriptor` will be
         * sent in those fields to the receiving bank to help the customer recognize the transfer.
         * You are highly encouraged to pass `individual_name` and `company_name` instead of relying
         * on this fallback.
         */
        fun statementDescriptor(statementDescriptor: String) = apply {
            body.statementDescriptor(statementDescriptor)
        }

        /**
         * Sets [Builder.statementDescriptor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.statementDescriptor] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun statementDescriptor(statementDescriptor: JsonField<String>) = apply {
            body.statementDescriptor(statementDescriptor)
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

        /**
         * Additional information that will be sent to the recipient. This is included in the
         * transfer data sent to the receiving bank.
         */
        fun addenda(addenda: Addenda) = apply { body.addenda(addenda) }

        /**
         * Sets [Builder.addenda] to an arbitrary JSON value.
         *
         * You should usually call [Builder.addenda] with a well-typed [Addenda] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun addenda(addenda: JsonField<Addenda>) = apply { body.addenda(addenda) }

        /**
         * The description of the date of the transfer, usually in the format `YYMMDD`. This is
         * included in the transfer data sent to the receiving bank.
         */
        fun companyDescriptiveDate(companyDescriptiveDate: String) = apply {
            body.companyDescriptiveDate(companyDescriptiveDate)
        }

        /**
         * Sets [Builder.companyDescriptiveDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.companyDescriptiveDate] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun companyDescriptiveDate(companyDescriptiveDate: JsonField<String>) = apply {
            body.companyDescriptiveDate(companyDescriptiveDate)
        }

        /**
         * The data you choose to associate with the transfer. This is included in the transfer data
         * sent to the receiving bank.
         */
        fun companyDiscretionaryData(companyDiscretionaryData: String) = apply {
            body.companyDiscretionaryData(companyDiscretionaryData)
        }

        /**
         * Sets [Builder.companyDiscretionaryData] to an arbitrary JSON value.
         *
         * You should usually call [Builder.companyDiscretionaryData] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun companyDiscretionaryData(companyDiscretionaryData: JsonField<String>) = apply {
            body.companyDiscretionaryData(companyDiscretionaryData)
        }

        /**
         * A description of the transfer, included in the transfer data sent to the receiving bank.
         * Standardized formatting may be required, for example `PAYROLL` for payroll-related
         * Prearranged Payments and Deposits (PPD) credit transfers.
         */
        fun companyEntryDescription(companyEntryDescription: String) = apply {
            body.companyEntryDescription(companyEntryDescription)
        }

        /**
         * Sets [Builder.companyEntryDescription] to an arbitrary JSON value.
         *
         * You should usually call [Builder.companyEntryDescription] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun companyEntryDescription(companyEntryDescription: JsonField<String>) = apply {
            body.companyEntryDescription(companyEntryDescription)
        }

        /**
         * The name by which the recipient knows you. This is included in the transfer data sent to
         * the receiving bank.
         */
        fun companyName(companyName: String) = apply { body.companyName(companyName) }

        /**
         * Sets [Builder.companyName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.companyName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun companyName(companyName: JsonField<String>) = apply { body.companyName(companyName) }

        /** The type of entity that owns the account to which the ACH Transfer is being sent. */
        fun destinationAccountHolder(destinationAccountHolder: DestinationAccountHolder) = apply {
            body.destinationAccountHolder(destinationAccountHolder)
        }

        /**
         * Sets [Builder.destinationAccountHolder] to an arbitrary JSON value.
         *
         * You should usually call [Builder.destinationAccountHolder] with a well-typed
         * [DestinationAccountHolder] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun destinationAccountHolder(
            destinationAccountHolder: JsonField<DestinationAccountHolder>
        ) = apply { body.destinationAccountHolder(destinationAccountHolder) }

        /**
         * The ID of an External Account to initiate a transfer to. If this parameter is provided,
         * `account_number`, `routing_number`, and `funding` must be absent.
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

        /** The type of the account to which the transfer will be sent. */
        fun funding(funding: Funding) = apply { body.funding(funding) }

        /**
         * Sets [Builder.funding] to an arbitrary JSON value.
         *
         * You should usually call [Builder.funding] with a well-typed [Funding] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun funding(funding: JsonField<Funding>) = apply { body.funding(funding) }

        /** Your identifier for the transfer recipient. */
        fun individualId(individualId: String) = apply { body.individualId(individualId) }

        /**
         * Sets [Builder.individualId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.individualId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun individualId(individualId: JsonField<String>) = apply {
            body.individualId(individualId)
        }

        /**
         * The name of the transfer recipient. This value is informational and not verified by the
         * recipient's bank.
         */
        fun individualName(individualName: String) = apply { body.individualName(individualName) }

        /**
         * Sets [Builder.individualName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.individualName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun individualName(individualName: JsonField<String>) = apply {
            body.individualName(individualName)
        }

        /**
         * Configuration for how the effective date of the transfer will be set. This determines
         * same-day vs future-dated settlement timing. If not set, defaults to a
         * `settlement_schedule` of `same_day`. If set, exactly one of the child attributes must be
         * set.
         */
        fun preferredEffectiveDate(preferredEffectiveDate: PreferredEffectiveDate) = apply {
            body.preferredEffectiveDate(preferredEffectiveDate)
        }

        /**
         * Sets [Builder.preferredEffectiveDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.preferredEffectiveDate] with a well-typed
         * [PreferredEffectiveDate] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun preferredEffectiveDate(preferredEffectiveDate: JsonField<PreferredEffectiveDate>) =
            apply {
                body.preferredEffectiveDate(preferredEffectiveDate)
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

        /**
         * The [Standard Entry Class (SEC) code](/documentation/ach-standard-entry-class-codes) to
         * use for the transfer.
         */
        fun standardEntryClassCode(standardEntryClassCode: StandardEntryClassCode) = apply {
            body.standardEntryClassCode(standardEntryClassCode)
        }

        /**
         * Sets [Builder.standardEntryClassCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.standardEntryClassCode] with a well-typed
         * [StandardEntryClassCode] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun standardEntryClassCode(standardEntryClassCode: JsonField<StandardEntryClassCode>) =
            apply {
                body.standardEntryClassCode(standardEntryClassCode)
            }

        /** The timing of the transaction. */
        fun transactionTiming(transactionTiming: TransactionTiming) = apply {
            body.transactionTiming(transactionTiming)
        }

        /**
         * Sets [Builder.transactionTiming] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transactionTiming] with a well-typed [TransactionTiming]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun transactionTiming(transactionTiming: JsonField<TransactionTiming>) = apply {
            body.transactionTiming(transactionTiming)
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
         * Returns an immutable instance of [AchTransferCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .accountId()
         * .amount()
         * .statementDescriptor()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AchTransferCreateParams =
            AchTransferCreateParams(
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
        private val statementDescriptor: JsonField<String>,
        private val accountNumber: JsonField<String>,
        private val addenda: JsonField<Addenda>,
        private val companyDescriptiveDate: JsonField<String>,
        private val companyDiscretionaryData: JsonField<String>,
        private val companyEntryDescription: JsonField<String>,
        private val companyName: JsonField<String>,
        private val destinationAccountHolder: JsonField<DestinationAccountHolder>,
        private val externalAccountId: JsonField<String>,
        private val funding: JsonField<Funding>,
        private val individualId: JsonField<String>,
        private val individualName: JsonField<String>,
        private val preferredEffectiveDate: JsonField<PreferredEffectiveDate>,
        private val requireApproval: JsonField<Boolean>,
        private val routingNumber: JsonField<String>,
        private val standardEntryClassCode: JsonField<StandardEntryClassCode>,
        private val transactionTiming: JsonField<TransactionTiming>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("account_id")
            @ExcludeMissing
            accountId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("statement_descriptor")
            @ExcludeMissing
            statementDescriptor: JsonField<String> = JsonMissing.of(),
            @JsonProperty("account_number")
            @ExcludeMissing
            accountNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("addenda") @ExcludeMissing addenda: JsonField<Addenda> = JsonMissing.of(),
            @JsonProperty("company_descriptive_date")
            @ExcludeMissing
            companyDescriptiveDate: JsonField<String> = JsonMissing.of(),
            @JsonProperty("company_discretionary_data")
            @ExcludeMissing
            companyDiscretionaryData: JsonField<String> = JsonMissing.of(),
            @JsonProperty("company_entry_description")
            @ExcludeMissing
            companyEntryDescription: JsonField<String> = JsonMissing.of(),
            @JsonProperty("company_name")
            @ExcludeMissing
            companyName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("destination_account_holder")
            @ExcludeMissing
            destinationAccountHolder: JsonField<DestinationAccountHolder> = JsonMissing.of(),
            @JsonProperty("external_account_id")
            @ExcludeMissing
            externalAccountId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("funding") @ExcludeMissing funding: JsonField<Funding> = JsonMissing.of(),
            @JsonProperty("individual_id")
            @ExcludeMissing
            individualId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("individual_name")
            @ExcludeMissing
            individualName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("preferred_effective_date")
            @ExcludeMissing
            preferredEffectiveDate: JsonField<PreferredEffectiveDate> = JsonMissing.of(),
            @JsonProperty("require_approval")
            @ExcludeMissing
            requireApproval: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("routing_number")
            @ExcludeMissing
            routingNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("standard_entry_class_code")
            @ExcludeMissing
            standardEntryClassCode: JsonField<StandardEntryClassCode> = JsonMissing.of(),
            @JsonProperty("transaction_timing")
            @ExcludeMissing
            transactionTiming: JsonField<TransactionTiming> = JsonMissing.of(),
        ) : this(
            accountId,
            amount,
            statementDescriptor,
            accountNumber,
            addenda,
            companyDescriptiveDate,
            companyDiscretionaryData,
            companyEntryDescription,
            companyName,
            destinationAccountHolder,
            externalAccountId,
            funding,
            individualId,
            individualName,
            preferredEffectiveDate,
            requireApproval,
            routingNumber,
            standardEntryClassCode,
            transactionTiming,
            mutableMapOf(),
        )

        /**
         * The Increase identifier for the account that will send the transfer.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun accountId(): String = accountId.getRequired("account_id")

        /**
         * The transfer amount in USD cents. A positive amount originates a credit transfer pushing
         * funds to the receiving account. A negative amount originates a debit transfer pulling
         * funds from the receiving account.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun amount(): Long = amount.getRequired("amount")

        /**
         * A description you choose to give the transfer. This will be saved with the transfer
         * details, displayed in the dashboard, and returned by the API. If `individual_name` and
         * `company_name` are not explicitly set by this API, the `statement_descriptor` will be
         * sent in those fields to the receiving bank to help the customer recognize the transfer.
         * You are highly encouraged to pass `individual_name` and `company_name` instead of relying
         * on this fallback.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun statementDescriptor(): String = statementDescriptor.getRequired("statement_descriptor")

        /**
         * The account number for the destination account.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun accountNumber(): Optional<String> = accountNumber.getOptional("account_number")

        /**
         * Additional information that will be sent to the recipient. This is included in the
         * transfer data sent to the receiving bank.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun addenda(): Optional<Addenda> = addenda.getOptional("addenda")

        /**
         * The description of the date of the transfer, usually in the format `YYMMDD`. This is
         * included in the transfer data sent to the receiving bank.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun companyDescriptiveDate(): Optional<String> =
            companyDescriptiveDate.getOptional("company_descriptive_date")

        /**
         * The data you choose to associate with the transfer. This is included in the transfer data
         * sent to the receiving bank.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun companyDiscretionaryData(): Optional<String> =
            companyDiscretionaryData.getOptional("company_discretionary_data")

        /**
         * A description of the transfer, included in the transfer data sent to the receiving bank.
         * Standardized formatting may be required, for example `PAYROLL` for payroll-related
         * Prearranged Payments and Deposits (PPD) credit transfers.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun companyEntryDescription(): Optional<String> =
            companyEntryDescription.getOptional("company_entry_description")

        /**
         * The name by which the recipient knows you. This is included in the transfer data sent to
         * the receiving bank.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun companyName(): Optional<String> = companyName.getOptional("company_name")

        /**
         * The type of entity that owns the account to which the ACH Transfer is being sent.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun destinationAccountHolder(): Optional<DestinationAccountHolder> =
            destinationAccountHolder.getOptional("destination_account_holder")

        /**
         * The ID of an External Account to initiate a transfer to. If this parameter is provided,
         * `account_number`, `routing_number`, and `funding` must be absent.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun externalAccountId(): Optional<String> =
            externalAccountId.getOptional("external_account_id")

        /**
         * The type of the account to which the transfer will be sent.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun funding(): Optional<Funding> = funding.getOptional("funding")

        /**
         * Your identifier for the transfer recipient.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun individualId(): Optional<String> = individualId.getOptional("individual_id")

        /**
         * The name of the transfer recipient. This value is informational and not verified by the
         * recipient's bank.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun individualName(): Optional<String> = individualName.getOptional("individual_name")

        /**
         * Configuration for how the effective date of the transfer will be set. This determines
         * same-day vs future-dated settlement timing. If not set, defaults to a
         * `settlement_schedule` of `same_day`. If set, exactly one of the child attributes must be
         * set.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun preferredEffectiveDate(): Optional<PreferredEffectiveDate> =
            preferredEffectiveDate.getOptional("preferred_effective_date")

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
         * The [Standard Entry Class (SEC) code](/documentation/ach-standard-entry-class-codes) to
         * use for the transfer.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun standardEntryClassCode(): Optional<StandardEntryClassCode> =
            standardEntryClassCode.getOptional("standard_entry_class_code")

        /**
         * The timing of the transaction.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun transactionTiming(): Optional<TransactionTiming> =
            transactionTiming.getOptional("transaction_timing")

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
         * Returns the raw JSON value of [statementDescriptor].
         *
         * Unlike [statementDescriptor], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("statement_descriptor")
        @ExcludeMissing
        fun _statementDescriptor(): JsonField<String> = statementDescriptor

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
         * Returns the raw JSON value of [addenda].
         *
         * Unlike [addenda], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("addenda") @ExcludeMissing fun _addenda(): JsonField<Addenda> = addenda

        /**
         * Returns the raw JSON value of [companyDescriptiveDate].
         *
         * Unlike [companyDescriptiveDate], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("company_descriptive_date")
        @ExcludeMissing
        fun _companyDescriptiveDate(): JsonField<String> = companyDescriptiveDate

        /**
         * Returns the raw JSON value of [companyDiscretionaryData].
         *
         * Unlike [companyDiscretionaryData], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("company_discretionary_data")
        @ExcludeMissing
        fun _companyDiscretionaryData(): JsonField<String> = companyDiscretionaryData

        /**
         * Returns the raw JSON value of [companyEntryDescription].
         *
         * Unlike [companyEntryDescription], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("company_entry_description")
        @ExcludeMissing
        fun _companyEntryDescription(): JsonField<String> = companyEntryDescription

        /**
         * Returns the raw JSON value of [companyName].
         *
         * Unlike [companyName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("company_name")
        @ExcludeMissing
        fun _companyName(): JsonField<String> = companyName

        /**
         * Returns the raw JSON value of [destinationAccountHolder].
         *
         * Unlike [destinationAccountHolder], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("destination_account_holder")
        @ExcludeMissing
        fun _destinationAccountHolder(): JsonField<DestinationAccountHolder> =
            destinationAccountHolder

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
         * Returns the raw JSON value of [funding].
         *
         * Unlike [funding], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("funding") @ExcludeMissing fun _funding(): JsonField<Funding> = funding

        /**
         * Returns the raw JSON value of [individualId].
         *
         * Unlike [individualId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("individual_id")
        @ExcludeMissing
        fun _individualId(): JsonField<String> = individualId

        /**
         * Returns the raw JSON value of [individualName].
         *
         * Unlike [individualName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("individual_name")
        @ExcludeMissing
        fun _individualName(): JsonField<String> = individualName

        /**
         * Returns the raw JSON value of [preferredEffectiveDate].
         *
         * Unlike [preferredEffectiveDate], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("preferred_effective_date")
        @ExcludeMissing
        fun _preferredEffectiveDate(): JsonField<PreferredEffectiveDate> = preferredEffectiveDate

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
         * Returns the raw JSON value of [standardEntryClassCode].
         *
         * Unlike [standardEntryClassCode], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("standard_entry_class_code")
        @ExcludeMissing
        fun _standardEntryClassCode(): JsonField<StandardEntryClassCode> = standardEntryClassCode

        /**
         * Returns the raw JSON value of [transactionTiming].
         *
         * Unlike [transactionTiming], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("transaction_timing")
        @ExcludeMissing
        fun _transactionTiming(): JsonField<TransactionTiming> = transactionTiming

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
             * .statementDescriptor()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var accountId: JsonField<String>? = null
            private var amount: JsonField<Long>? = null
            private var statementDescriptor: JsonField<String>? = null
            private var accountNumber: JsonField<String> = JsonMissing.of()
            private var addenda: JsonField<Addenda> = JsonMissing.of()
            private var companyDescriptiveDate: JsonField<String> = JsonMissing.of()
            private var companyDiscretionaryData: JsonField<String> = JsonMissing.of()
            private var companyEntryDescription: JsonField<String> = JsonMissing.of()
            private var companyName: JsonField<String> = JsonMissing.of()
            private var destinationAccountHolder: JsonField<DestinationAccountHolder> =
                JsonMissing.of()
            private var externalAccountId: JsonField<String> = JsonMissing.of()
            private var funding: JsonField<Funding> = JsonMissing.of()
            private var individualId: JsonField<String> = JsonMissing.of()
            private var individualName: JsonField<String> = JsonMissing.of()
            private var preferredEffectiveDate: JsonField<PreferredEffectiveDate> = JsonMissing.of()
            private var requireApproval: JsonField<Boolean> = JsonMissing.of()
            private var routingNumber: JsonField<String> = JsonMissing.of()
            private var standardEntryClassCode: JsonField<StandardEntryClassCode> = JsonMissing.of()
            private var transactionTiming: JsonField<TransactionTiming> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                accountId = body.accountId
                amount = body.amount
                statementDescriptor = body.statementDescriptor
                accountNumber = body.accountNumber
                addenda = body.addenda
                companyDescriptiveDate = body.companyDescriptiveDate
                companyDiscretionaryData = body.companyDiscretionaryData
                companyEntryDescription = body.companyEntryDescription
                companyName = body.companyName
                destinationAccountHolder = body.destinationAccountHolder
                externalAccountId = body.externalAccountId
                funding = body.funding
                individualId = body.individualId
                individualName = body.individualName
                preferredEffectiveDate = body.preferredEffectiveDate
                requireApproval = body.requireApproval
                routingNumber = body.routingNumber
                standardEntryClassCode = body.standardEntryClassCode
                transactionTiming = body.transactionTiming
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The Increase identifier for the account that will send the transfer. */
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
             * The transfer amount in USD cents. A positive amount originates a credit transfer
             * pushing funds to the receiving account. A negative amount originates a debit transfer
             * pulling funds from the receiving account.
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

            /**
             * A description you choose to give the transfer. This will be saved with the transfer
             * details, displayed in the dashboard, and returned by the API. If `individual_name`
             * and `company_name` are not explicitly set by this API, the `statement_descriptor`
             * will be sent in those fields to the receiving bank to help the customer recognize the
             * transfer. You are highly encouraged to pass `individual_name` and `company_name`
             * instead of relying on this fallback.
             */
            fun statementDescriptor(statementDescriptor: String) =
                statementDescriptor(JsonField.of(statementDescriptor))

            /**
             * Sets [Builder.statementDescriptor] to an arbitrary JSON value.
             *
             * You should usually call [Builder.statementDescriptor] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun statementDescriptor(statementDescriptor: JsonField<String>) = apply {
                this.statementDescriptor = statementDescriptor
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

            /**
             * Additional information that will be sent to the recipient. This is included in the
             * transfer data sent to the receiving bank.
             */
            fun addenda(addenda: Addenda) = addenda(JsonField.of(addenda))

            /**
             * Sets [Builder.addenda] to an arbitrary JSON value.
             *
             * You should usually call [Builder.addenda] with a well-typed [Addenda] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun addenda(addenda: JsonField<Addenda>) = apply { this.addenda = addenda }

            /**
             * The description of the date of the transfer, usually in the format `YYMMDD`. This is
             * included in the transfer data sent to the receiving bank.
             */
            fun companyDescriptiveDate(companyDescriptiveDate: String) =
                companyDescriptiveDate(JsonField.of(companyDescriptiveDate))

            /**
             * Sets [Builder.companyDescriptiveDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.companyDescriptiveDate] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun companyDescriptiveDate(companyDescriptiveDate: JsonField<String>) = apply {
                this.companyDescriptiveDate = companyDescriptiveDate
            }

            /**
             * The data you choose to associate with the transfer. This is included in the transfer
             * data sent to the receiving bank.
             */
            fun companyDiscretionaryData(companyDiscretionaryData: String) =
                companyDiscretionaryData(JsonField.of(companyDiscretionaryData))

            /**
             * Sets [Builder.companyDiscretionaryData] to an arbitrary JSON value.
             *
             * You should usually call [Builder.companyDiscretionaryData] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun companyDiscretionaryData(companyDiscretionaryData: JsonField<String>) = apply {
                this.companyDiscretionaryData = companyDiscretionaryData
            }

            /**
             * A description of the transfer, included in the transfer data sent to the receiving
             * bank. Standardized formatting may be required, for example `PAYROLL` for
             * payroll-related Prearranged Payments and Deposits (PPD) credit transfers.
             */
            fun companyEntryDescription(companyEntryDescription: String) =
                companyEntryDescription(JsonField.of(companyEntryDescription))

            /**
             * Sets [Builder.companyEntryDescription] to an arbitrary JSON value.
             *
             * You should usually call [Builder.companyEntryDescription] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun companyEntryDescription(companyEntryDescription: JsonField<String>) = apply {
                this.companyEntryDescription = companyEntryDescription
            }

            /**
             * The name by which the recipient knows you. This is included in the transfer data sent
             * to the receiving bank.
             */
            fun companyName(companyName: String) = companyName(JsonField.of(companyName))

            /**
             * Sets [Builder.companyName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.companyName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun companyName(companyName: JsonField<String>) = apply {
                this.companyName = companyName
            }

            /** The type of entity that owns the account to which the ACH Transfer is being sent. */
            fun destinationAccountHolder(destinationAccountHolder: DestinationAccountHolder) =
                destinationAccountHolder(JsonField.of(destinationAccountHolder))

            /**
             * Sets [Builder.destinationAccountHolder] to an arbitrary JSON value.
             *
             * You should usually call [Builder.destinationAccountHolder] with a well-typed
             * [DestinationAccountHolder] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun destinationAccountHolder(
                destinationAccountHolder: JsonField<DestinationAccountHolder>
            ) = apply { this.destinationAccountHolder = destinationAccountHolder }

            /**
             * The ID of an External Account to initiate a transfer to. If this parameter is
             * provided, `account_number`, `routing_number`, and `funding` must be absent.
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

            /** The type of the account to which the transfer will be sent. */
            fun funding(funding: Funding) = funding(JsonField.of(funding))

            /**
             * Sets [Builder.funding] to an arbitrary JSON value.
             *
             * You should usually call [Builder.funding] with a well-typed [Funding] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun funding(funding: JsonField<Funding>) = apply { this.funding = funding }

            /** Your identifier for the transfer recipient. */
            fun individualId(individualId: String) = individualId(JsonField.of(individualId))

            /**
             * Sets [Builder.individualId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.individualId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun individualId(individualId: JsonField<String>) = apply {
                this.individualId = individualId
            }

            /**
             * The name of the transfer recipient. This value is informational and not verified by
             * the recipient's bank.
             */
            fun individualName(individualName: String) =
                individualName(JsonField.of(individualName))

            /**
             * Sets [Builder.individualName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.individualName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun individualName(individualName: JsonField<String>) = apply {
                this.individualName = individualName
            }

            /**
             * Configuration for how the effective date of the transfer will be set. This determines
             * same-day vs future-dated settlement timing. If not set, defaults to a
             * `settlement_schedule` of `same_day`. If set, exactly one of the child attributes must
             * be set.
             */
            fun preferredEffectiveDate(preferredEffectiveDate: PreferredEffectiveDate) =
                preferredEffectiveDate(JsonField.of(preferredEffectiveDate))

            /**
             * Sets [Builder.preferredEffectiveDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.preferredEffectiveDate] with a well-typed
             * [PreferredEffectiveDate] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun preferredEffectiveDate(preferredEffectiveDate: JsonField<PreferredEffectiveDate>) =
                apply {
                    this.preferredEffectiveDate = preferredEffectiveDate
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

            /**
             * The [Standard Entry Class (SEC) code](/documentation/ach-standard-entry-class-codes)
             * to use for the transfer.
             */
            fun standardEntryClassCode(standardEntryClassCode: StandardEntryClassCode) =
                standardEntryClassCode(JsonField.of(standardEntryClassCode))

            /**
             * Sets [Builder.standardEntryClassCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.standardEntryClassCode] with a well-typed
             * [StandardEntryClassCode] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun standardEntryClassCode(standardEntryClassCode: JsonField<StandardEntryClassCode>) =
                apply {
                    this.standardEntryClassCode = standardEntryClassCode
                }

            /** The timing of the transaction. */
            fun transactionTiming(transactionTiming: TransactionTiming) =
                transactionTiming(JsonField.of(transactionTiming))

            /**
             * Sets [Builder.transactionTiming] to an arbitrary JSON value.
             *
             * You should usually call [Builder.transactionTiming] with a well-typed
             * [TransactionTiming] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun transactionTiming(transactionTiming: JsonField<TransactionTiming>) = apply {
                this.transactionTiming = transactionTiming
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
             * .statementDescriptor()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("accountId", accountId),
                    checkRequired("amount", amount),
                    checkRequired("statementDescriptor", statementDescriptor),
                    accountNumber,
                    addenda,
                    companyDescriptiveDate,
                    companyDiscretionaryData,
                    companyEntryDescription,
                    companyName,
                    destinationAccountHolder,
                    externalAccountId,
                    funding,
                    individualId,
                    individualName,
                    preferredEffectiveDate,
                    requireApproval,
                    routingNumber,
                    standardEntryClassCode,
                    transactionTiming,
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
            statementDescriptor()
            accountNumber()
            addenda().ifPresent { it.validate() }
            companyDescriptiveDate()
            companyDiscretionaryData()
            companyEntryDescription()
            companyName()
            destinationAccountHolder().ifPresent { it.validate() }
            externalAccountId()
            funding().ifPresent { it.validate() }
            individualId()
            individualName()
            preferredEffectiveDate().ifPresent { it.validate() }
            requireApproval()
            routingNumber()
            standardEntryClassCode().ifPresent { it.validate() }
            transactionTiming().ifPresent { it.validate() }
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
                (if (statementDescriptor.asKnown().isPresent) 1 else 0) +
                (if (accountNumber.asKnown().isPresent) 1 else 0) +
                (addenda.asKnown().getOrNull()?.validity() ?: 0) +
                (if (companyDescriptiveDate.asKnown().isPresent) 1 else 0) +
                (if (companyDiscretionaryData.asKnown().isPresent) 1 else 0) +
                (if (companyEntryDescription.asKnown().isPresent) 1 else 0) +
                (if (companyName.asKnown().isPresent) 1 else 0) +
                (destinationAccountHolder.asKnown().getOrNull()?.validity() ?: 0) +
                (if (externalAccountId.asKnown().isPresent) 1 else 0) +
                (funding.asKnown().getOrNull()?.validity() ?: 0) +
                (if (individualId.asKnown().isPresent) 1 else 0) +
                (if (individualName.asKnown().isPresent) 1 else 0) +
                (preferredEffectiveDate.asKnown().getOrNull()?.validity() ?: 0) +
                (if (requireApproval.asKnown().isPresent) 1 else 0) +
                (if (routingNumber.asKnown().isPresent) 1 else 0) +
                (standardEntryClassCode.asKnown().getOrNull()?.validity() ?: 0) +
                (transactionTiming.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                accountId == other.accountId &&
                amount == other.amount &&
                statementDescriptor == other.statementDescriptor &&
                accountNumber == other.accountNumber &&
                addenda == other.addenda &&
                companyDescriptiveDate == other.companyDescriptiveDate &&
                companyDiscretionaryData == other.companyDiscretionaryData &&
                companyEntryDescription == other.companyEntryDescription &&
                companyName == other.companyName &&
                destinationAccountHolder == other.destinationAccountHolder &&
                externalAccountId == other.externalAccountId &&
                funding == other.funding &&
                individualId == other.individualId &&
                individualName == other.individualName &&
                preferredEffectiveDate == other.preferredEffectiveDate &&
                requireApproval == other.requireApproval &&
                routingNumber == other.routingNumber &&
                standardEntryClassCode == other.standardEntryClassCode &&
                transactionTiming == other.transactionTiming &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                accountId,
                amount,
                statementDescriptor,
                accountNumber,
                addenda,
                companyDescriptiveDate,
                companyDiscretionaryData,
                companyEntryDescription,
                companyName,
                destinationAccountHolder,
                externalAccountId,
                funding,
                individualId,
                individualName,
                preferredEffectiveDate,
                requireApproval,
                routingNumber,
                standardEntryClassCode,
                transactionTiming,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{accountId=$accountId, amount=$amount, statementDescriptor=$statementDescriptor, accountNumber=$accountNumber, addenda=$addenda, companyDescriptiveDate=$companyDescriptiveDate, companyDiscretionaryData=$companyDiscretionaryData, companyEntryDescription=$companyEntryDescription, companyName=$companyName, destinationAccountHolder=$destinationAccountHolder, externalAccountId=$externalAccountId, funding=$funding, individualId=$individualId, individualName=$individualName, preferredEffectiveDate=$preferredEffectiveDate, requireApproval=$requireApproval, routingNumber=$routingNumber, standardEntryClassCode=$standardEntryClassCode, transactionTiming=$transactionTiming, additionalProperties=$additionalProperties}"
    }

    /**
     * Additional information that will be sent to the recipient. This is included in the transfer
     * data sent to the receiving bank.
     */
    class Addenda
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val category: JsonField<Category>,
        private val freeform: JsonField<Freeform>,
        private val paymentOrderRemittanceAdvice: JsonField<PaymentOrderRemittanceAdvice>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("category")
            @ExcludeMissing
            category: JsonField<Category> = JsonMissing.of(),
            @JsonProperty("freeform")
            @ExcludeMissing
            freeform: JsonField<Freeform> = JsonMissing.of(),
            @JsonProperty("payment_order_remittance_advice")
            @ExcludeMissing
            paymentOrderRemittanceAdvice: JsonField<PaymentOrderRemittanceAdvice> = JsonMissing.of(),
        ) : this(category, freeform, paymentOrderRemittanceAdvice, mutableMapOf())

        /**
         * The type of addenda to pass with the transfer.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun category(): Category = category.getRequired("category")

        /**
         * Unstructured `payment_related_information` passed through with the transfer. Required if
         * and only if `category` is `freeform`.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun freeform(): Optional<Freeform> = freeform.getOptional("freeform")

        /**
         * Structured ASC X12 820 remittance advice records. Please reach out to
         * [support@increase.com](mailto:support@increase.com) for more information. Required if and
         * only if `category` is `payment_order_remittance_advice`.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun paymentOrderRemittanceAdvice(): Optional<PaymentOrderRemittanceAdvice> =
            paymentOrderRemittanceAdvice.getOptional("payment_order_remittance_advice")

        /**
         * Returns the raw JSON value of [category].
         *
         * Unlike [category], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("category") @ExcludeMissing fun _category(): JsonField<Category> = category

        /**
         * Returns the raw JSON value of [freeform].
         *
         * Unlike [freeform], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("freeform") @ExcludeMissing fun _freeform(): JsonField<Freeform> = freeform

        /**
         * Returns the raw JSON value of [paymentOrderRemittanceAdvice].
         *
         * Unlike [paymentOrderRemittanceAdvice], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("payment_order_remittance_advice")
        @ExcludeMissing
        fun _paymentOrderRemittanceAdvice(): JsonField<PaymentOrderRemittanceAdvice> =
            paymentOrderRemittanceAdvice

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
             * Returns a mutable builder for constructing an instance of [Addenda].
             *
             * The following fields are required:
             * ```java
             * .category()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Addenda]. */
        class Builder internal constructor() {

            private var category: JsonField<Category>? = null
            private var freeform: JsonField<Freeform> = JsonMissing.of()
            private var paymentOrderRemittanceAdvice: JsonField<PaymentOrderRemittanceAdvice> =
                JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(addenda: Addenda) = apply {
                category = addenda.category
                freeform = addenda.freeform
                paymentOrderRemittanceAdvice = addenda.paymentOrderRemittanceAdvice
                additionalProperties = addenda.additionalProperties.toMutableMap()
            }

            /** The type of addenda to pass with the transfer. */
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
             * Unstructured `payment_related_information` passed through with the transfer. Required
             * if and only if `category` is `freeform`.
             */
            fun freeform(freeform: Freeform) = freeform(JsonField.of(freeform))

            /**
             * Sets [Builder.freeform] to an arbitrary JSON value.
             *
             * You should usually call [Builder.freeform] with a well-typed [Freeform] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun freeform(freeform: JsonField<Freeform>) = apply { this.freeform = freeform }

            /**
             * Structured ASC X12 820 remittance advice records. Please reach out to
             * [support@increase.com](mailto:support@increase.com) for more information. Required if
             * and only if `category` is `payment_order_remittance_advice`.
             */
            fun paymentOrderRemittanceAdvice(
                paymentOrderRemittanceAdvice: PaymentOrderRemittanceAdvice
            ) = paymentOrderRemittanceAdvice(JsonField.of(paymentOrderRemittanceAdvice))

            /**
             * Sets [Builder.paymentOrderRemittanceAdvice] to an arbitrary JSON value.
             *
             * You should usually call [Builder.paymentOrderRemittanceAdvice] with a well-typed
             * [PaymentOrderRemittanceAdvice] value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun paymentOrderRemittanceAdvice(
                paymentOrderRemittanceAdvice: JsonField<PaymentOrderRemittanceAdvice>
            ) = apply { this.paymentOrderRemittanceAdvice = paymentOrderRemittanceAdvice }

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
             * Returns an immutable instance of [Addenda].
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
            fun build(): Addenda =
                Addenda(
                    checkRequired("category", category),
                    freeform,
                    paymentOrderRemittanceAdvice,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Addenda = apply {
            if (validated) {
                return@apply
            }

            category().validate()
            freeform().ifPresent { it.validate() }
            paymentOrderRemittanceAdvice().ifPresent { it.validate() }
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
                (freeform.asKnown().getOrNull()?.validity() ?: 0) +
                (paymentOrderRemittanceAdvice.asKnown().getOrNull()?.validity() ?: 0)

        /** The type of addenda to pass with the transfer. */
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

                /** Unstructured `payment_related_information` passed through with the transfer. */
                @JvmField val FREEFORM = of("freeform")

                /**
                 * Structured ASC X12 820 remittance advice records. Please reach out to
                 * [support@increase.com](mailto:support@increase.com) for more information.
                 */
                @JvmField
                val PAYMENT_ORDER_REMITTANCE_ADVICE = of("payment_order_remittance_advice")

                @JvmStatic fun of(value: String) = Category(JsonField.of(value))
            }

            /** An enum containing [Category]'s known values. */
            enum class Known {
                /** Unstructured `payment_related_information` passed through with the transfer. */
                FREEFORM,
                /**
                 * Structured ASC X12 820 remittance advice records. Please reach out to
                 * [support@increase.com](mailto:support@increase.com) for more information.
                 */
                PAYMENT_ORDER_REMITTANCE_ADVICE,
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
                /** Unstructured `payment_related_information` passed through with the transfer. */
                FREEFORM,
                /**
                 * Structured ASC X12 820 remittance advice records. Please reach out to
                 * [support@increase.com](mailto:support@increase.com) for more information.
                 */
                PAYMENT_ORDER_REMITTANCE_ADVICE,
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
                    FREEFORM -> Value.FREEFORM
                    PAYMENT_ORDER_REMITTANCE_ADVICE -> Value.PAYMENT_ORDER_REMITTANCE_ADVICE
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
                    FREEFORM -> Known.FREEFORM
                    PAYMENT_ORDER_REMITTANCE_ADVICE -> Known.PAYMENT_ORDER_REMITTANCE_ADVICE
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
         * Unstructured `payment_related_information` passed through with the transfer. Required if
         * and only if `category` is `freeform`.
         */
        class Freeform
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val entries: JsonField<List<Entry>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("entries")
                @ExcludeMissing
                entries: JsonField<List<Entry>> = JsonMissing.of()
            ) : this(entries, mutableMapOf())

            /**
             * Each entry represents an addendum sent with the transfer. In general, you should send
             * at most one addendum–most ACH recipients cannot access beyond the first 80 characters
             * sent. Please reach out to [support@increase.com](mailto:support@increase.com) to send
             * 2 or more addenda to a recipient expecting a specific addendum format.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun entries(): List<Entry> = entries.getRequired("entries")

            /**
             * Returns the raw JSON value of [entries].
             *
             * Unlike [entries], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("entries")
            @ExcludeMissing
            fun _entries(): JsonField<List<Entry>> = entries

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
                 * Returns a mutable builder for constructing an instance of [Freeform].
                 *
                 * The following fields are required:
                 * ```java
                 * .entries()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Freeform]. */
            class Builder internal constructor() {

                private var entries: JsonField<MutableList<Entry>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(freeform: Freeform) = apply {
                    entries = freeform.entries.map { it.toMutableList() }
                    additionalProperties = freeform.additionalProperties.toMutableMap()
                }

                /**
                 * Each entry represents an addendum sent with the transfer. In general, you should
                 * send at most one addendum–most ACH recipients cannot access beyond the first 80
                 * characters sent. Please reach out to
                 * [support@increase.com](mailto:support@increase.com) to send 2 or more addenda to
                 * a recipient expecting a specific addendum format.
                 */
                fun entries(entries: List<Entry>) = entries(JsonField.of(entries))

                /**
                 * Sets [Builder.entries] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.entries] with a well-typed `List<Entry>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun entries(entries: JsonField<List<Entry>>) = apply {
                    this.entries = entries.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Entry] to [entries].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addEntry(entry: Entry) = apply {
                    entries =
                        (entries ?: JsonField.of(mutableListOf())).also {
                            checkKnown("entries", it).add(entry)
                        }
                }

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
                 * Returns an immutable instance of [Freeform].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .entries()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Freeform =
                    Freeform(
                        checkRequired("entries", entries).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Freeform = apply {
                if (validated) {
                    return@apply
                }

                entries().forEach { it.validate() }
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
                (entries.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

            class Entry
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val paymentRelatedInformation: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("payment_related_information")
                    @ExcludeMissing
                    paymentRelatedInformation: JsonField<String> = JsonMissing.of()
                ) : this(paymentRelatedInformation, mutableMapOf())

                /**
                 * The payment related information passed in the addendum.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun paymentRelatedInformation(): String =
                    paymentRelatedInformation.getRequired("payment_related_information")

                /**
                 * Returns the raw JSON value of [paymentRelatedInformation].
                 *
                 * Unlike [paymentRelatedInformation], this method doesn't throw if the JSON field
                 * has an unexpected type.
                 */
                @JsonProperty("payment_related_information")
                @ExcludeMissing
                fun _paymentRelatedInformation(): JsonField<String> = paymentRelatedInformation

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
                     * Returns a mutable builder for constructing an instance of [Entry].
                     *
                     * The following fields are required:
                     * ```java
                     * .paymentRelatedInformation()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Entry]. */
                class Builder internal constructor() {

                    private var paymentRelatedInformation: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(entry: Entry) = apply {
                        paymentRelatedInformation = entry.paymentRelatedInformation
                        additionalProperties = entry.additionalProperties.toMutableMap()
                    }

                    /** The payment related information passed in the addendum. */
                    fun paymentRelatedInformation(paymentRelatedInformation: String) =
                        paymentRelatedInformation(JsonField.of(paymentRelatedInformation))

                    /**
                     * Sets [Builder.paymentRelatedInformation] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.paymentRelatedInformation] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun paymentRelatedInformation(paymentRelatedInformation: JsonField<String>) =
                        apply {
                            this.paymentRelatedInformation = paymentRelatedInformation
                        }

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
                     * Returns an immutable instance of [Entry].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .paymentRelatedInformation()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Entry =
                        Entry(
                            checkRequired("paymentRelatedInformation", paymentRelatedInformation),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Entry = apply {
                    if (validated) {
                        return@apply
                    }

                    paymentRelatedInformation()
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
                    (if (paymentRelatedInformation.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Entry &&
                        paymentRelatedInformation == other.paymentRelatedInformation &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(paymentRelatedInformation, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Entry{paymentRelatedInformation=$paymentRelatedInformation, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Freeform &&
                    entries == other.entries &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(entries, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Freeform{entries=$entries, additionalProperties=$additionalProperties}"
        }

        /**
         * Structured ASC X12 820 remittance advice records. Please reach out to
         * [support@increase.com](mailto:support@increase.com) for more information. Required if and
         * only if `category` is `payment_order_remittance_advice`.
         */
        class PaymentOrderRemittanceAdvice
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val invoices: JsonField<List<Invoice>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("invoices")
                @ExcludeMissing
                invoices: JsonField<List<Invoice>> = JsonMissing.of()
            ) : this(invoices, mutableMapOf())

            /**
             * ASC X12 RMR records for this specific transfer.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun invoices(): List<Invoice> = invoices.getRequired("invoices")

            /**
             * Returns the raw JSON value of [invoices].
             *
             * Unlike [invoices], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("invoices")
            @ExcludeMissing
            fun _invoices(): JsonField<List<Invoice>> = invoices

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
                 * Returns a mutable builder for constructing an instance of
                 * [PaymentOrderRemittanceAdvice].
                 *
                 * The following fields are required:
                 * ```java
                 * .invoices()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [PaymentOrderRemittanceAdvice]. */
            class Builder internal constructor() {

                private var invoices: JsonField<MutableList<Invoice>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(paymentOrderRemittanceAdvice: PaymentOrderRemittanceAdvice) =
                    apply {
                        invoices = paymentOrderRemittanceAdvice.invoices.map { it.toMutableList() }
                        additionalProperties =
                            paymentOrderRemittanceAdvice.additionalProperties.toMutableMap()
                    }

                /** ASC X12 RMR records for this specific transfer. */
                fun invoices(invoices: List<Invoice>) = invoices(JsonField.of(invoices))

                /**
                 * Sets [Builder.invoices] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.invoices] with a well-typed `List<Invoice>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun invoices(invoices: JsonField<List<Invoice>>) = apply {
                    this.invoices = invoices.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Invoice] to [invoices].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addInvoice(invoice: Invoice) = apply {
                    invoices =
                        (invoices ?: JsonField.of(mutableListOf())).also {
                            checkKnown("invoices", it).add(invoice)
                        }
                }

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
                 * Returns an immutable instance of [PaymentOrderRemittanceAdvice].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .invoices()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): PaymentOrderRemittanceAdvice =
                    PaymentOrderRemittanceAdvice(
                        checkRequired("invoices", invoices).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): PaymentOrderRemittanceAdvice = apply {
                if (validated) {
                    return@apply
                }

                invoices().forEach { it.validate() }
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
                (invoices.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

            class Invoice
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val invoiceNumber: JsonField<String>,
                private val paidAmount: JsonField<Long>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("invoice_number")
                    @ExcludeMissing
                    invoiceNumber: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("paid_amount")
                    @ExcludeMissing
                    paidAmount: JsonField<Long> = JsonMissing.of(),
                ) : this(invoiceNumber, paidAmount, mutableMapOf())

                /**
                 * The invoice number for this reference, determined in advance with the receiver.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun invoiceNumber(): String = invoiceNumber.getRequired("invoice_number")

                /**
                 * The amount that was paid for this invoice in the minor unit of its currency. For
                 * dollars, for example, this is cents.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun paidAmount(): Long = paidAmount.getRequired("paid_amount")

                /**
                 * Returns the raw JSON value of [invoiceNumber].
                 *
                 * Unlike [invoiceNumber], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("invoice_number")
                @ExcludeMissing
                fun _invoiceNumber(): JsonField<String> = invoiceNumber

                /**
                 * Returns the raw JSON value of [paidAmount].
                 *
                 * Unlike [paidAmount], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("paid_amount")
                @ExcludeMissing
                fun _paidAmount(): JsonField<Long> = paidAmount

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
                     * Returns a mutable builder for constructing an instance of [Invoice].
                     *
                     * The following fields are required:
                     * ```java
                     * .invoiceNumber()
                     * .paidAmount()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Invoice]. */
                class Builder internal constructor() {

                    private var invoiceNumber: JsonField<String>? = null
                    private var paidAmount: JsonField<Long>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(invoice: Invoice) = apply {
                        invoiceNumber = invoice.invoiceNumber
                        paidAmount = invoice.paidAmount
                        additionalProperties = invoice.additionalProperties.toMutableMap()
                    }

                    /**
                     * The invoice number for this reference, determined in advance with the
                     * receiver.
                     */
                    fun invoiceNumber(invoiceNumber: String) =
                        invoiceNumber(JsonField.of(invoiceNumber))

                    /**
                     * Sets [Builder.invoiceNumber] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.invoiceNumber] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun invoiceNumber(invoiceNumber: JsonField<String>) = apply {
                        this.invoiceNumber = invoiceNumber
                    }

                    /**
                     * The amount that was paid for this invoice in the minor unit of its currency.
                     * For dollars, for example, this is cents.
                     */
                    fun paidAmount(paidAmount: Long) = paidAmount(JsonField.of(paidAmount))

                    /**
                     * Sets [Builder.paidAmount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.paidAmount] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun paidAmount(paidAmount: JsonField<Long>) = apply {
                        this.paidAmount = paidAmount
                    }

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
                     * Returns an immutable instance of [Invoice].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .invoiceNumber()
                     * .paidAmount()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Invoice =
                        Invoice(
                            checkRequired("invoiceNumber", invoiceNumber),
                            checkRequired("paidAmount", paidAmount),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Invoice = apply {
                    if (validated) {
                        return@apply
                    }

                    invoiceNumber()
                    paidAmount()
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
                    (if (invoiceNumber.asKnown().isPresent) 1 else 0) +
                        (if (paidAmount.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Invoice &&
                        invoiceNumber == other.invoiceNumber &&
                        paidAmount == other.paidAmount &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(invoiceNumber, paidAmount, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Invoice{invoiceNumber=$invoiceNumber, paidAmount=$paidAmount, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PaymentOrderRemittanceAdvice &&
                    invoices == other.invoices &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(invoices, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PaymentOrderRemittanceAdvice{invoices=$invoices, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Addenda &&
                category == other.category &&
                freeform == other.freeform &&
                paymentOrderRemittanceAdvice == other.paymentOrderRemittanceAdvice &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(category, freeform, paymentOrderRemittanceAdvice, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Addenda{category=$category, freeform=$freeform, paymentOrderRemittanceAdvice=$paymentOrderRemittanceAdvice, additionalProperties=$additionalProperties}"
    }

    /** The type of entity that owns the account to which the ACH Transfer is being sent. */
    class DestinationAccountHolder
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

            /** The External Account is owned by a business. */
            @JvmField val BUSINESS = of("business")

            /** The External Account is owned by an individual. */
            @JvmField val INDIVIDUAL = of("individual")

            /** It's unknown what kind of entity owns the External Account. */
            @JvmField val UNKNOWN = of("unknown")

            @JvmStatic fun of(value: String) = DestinationAccountHolder(JsonField.of(value))
        }

        /** An enum containing [DestinationAccountHolder]'s known values. */
        enum class Known {
            /** The External Account is owned by a business. */
            BUSINESS,
            /** The External Account is owned by an individual. */
            INDIVIDUAL,
            /** It's unknown what kind of entity owns the External Account. */
            UNKNOWN,
        }

        /**
         * An enum containing [DestinationAccountHolder]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [DestinationAccountHolder] can contain an unknown value in a couple of
         * cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            /** The External Account is owned by a business. */
            BUSINESS,
            /** The External Account is owned by an individual. */
            INDIVIDUAL,
            /** It's unknown what kind of entity owns the External Account. */
            UNKNOWN,
            /**
             * An enum member indicating that [DestinationAccountHolder] was instantiated with an
             * unknown value.
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
                BUSINESS -> Value.BUSINESS
                INDIVIDUAL -> Value.INDIVIDUAL
                UNKNOWN -> Value.UNKNOWN
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
                BUSINESS -> Known.BUSINESS
                INDIVIDUAL -> Known.INDIVIDUAL
                UNKNOWN -> Known.UNKNOWN
                else ->
                    throw IncreaseInvalidDataException("Unknown DestinationAccountHolder: $value")
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

        fun validate(): DestinationAccountHolder = apply {
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

            return other is DestinationAccountHolder && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The type of the account to which the transfer will be sent. */
    class Funding @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            /** A checking account. */
            @JvmField val CHECKING = of("checking")

            /** A savings account. */
            @JvmField val SAVINGS = of("savings")

            /** A bank's general ledger. Uncommon. */
            @JvmField val GENERAL_LEDGER = of("general_ledger")

            @JvmStatic fun of(value: String) = Funding(JsonField.of(value))
        }

        /** An enum containing [Funding]'s known values. */
        enum class Known {
            /** A checking account. */
            CHECKING,
            /** A savings account. */
            SAVINGS,
            /** A bank's general ledger. Uncommon. */
            GENERAL_LEDGER,
        }

        /**
         * An enum containing [Funding]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Funding] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            /** A checking account. */
            CHECKING,
            /** A savings account. */
            SAVINGS,
            /** A bank's general ledger. Uncommon. */
            GENERAL_LEDGER,
            /** An enum member indicating that [Funding] was instantiated with an unknown value. */
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
                CHECKING -> Value.CHECKING
                SAVINGS -> Value.SAVINGS
                GENERAL_LEDGER -> Value.GENERAL_LEDGER
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
                CHECKING -> Known.CHECKING
                SAVINGS -> Known.SAVINGS
                GENERAL_LEDGER -> Known.GENERAL_LEDGER
                else -> throw IncreaseInvalidDataException("Unknown Funding: $value")
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

        fun validate(): Funding = apply {
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

            return other is Funding && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Configuration for how the effective date of the transfer will be set. This determines
     * same-day vs future-dated settlement timing. If not set, defaults to a `settlement_schedule`
     * of `same_day`. If set, exactly one of the child attributes must be set.
     */
    class PreferredEffectiveDate
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val date: JsonField<LocalDate>,
        private val settlementSchedule: JsonField<SettlementSchedule>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("date") @ExcludeMissing date: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("settlement_schedule")
            @ExcludeMissing
            settlementSchedule: JsonField<SettlementSchedule> = JsonMissing.of(),
        ) : this(date, settlementSchedule, mutableMapOf())

        /**
         * A specific date in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format to use as
         * the effective date when submitting this transfer.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun date(): Optional<LocalDate> = date.getOptional("date")

        /**
         * A schedule by which Increase will choose an effective date for the transfer.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun settlementSchedule(): Optional<SettlementSchedule> =
            settlementSchedule.getOptional("settlement_schedule")

        /**
         * Returns the raw JSON value of [date].
         *
         * Unlike [date], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("date") @ExcludeMissing fun _date(): JsonField<LocalDate> = date

        /**
         * Returns the raw JSON value of [settlementSchedule].
         *
         * Unlike [settlementSchedule], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("settlement_schedule")
        @ExcludeMissing
        fun _settlementSchedule(): JsonField<SettlementSchedule> = settlementSchedule

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
             * Returns a mutable builder for constructing an instance of [PreferredEffectiveDate].
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [PreferredEffectiveDate]. */
        class Builder internal constructor() {

            private var date: JsonField<LocalDate> = JsonMissing.of()
            private var settlementSchedule: JsonField<SettlementSchedule> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(preferredEffectiveDate: PreferredEffectiveDate) = apply {
                date = preferredEffectiveDate.date
                settlementSchedule = preferredEffectiveDate.settlementSchedule
                additionalProperties = preferredEffectiveDate.additionalProperties.toMutableMap()
            }

            /**
             * A specific date in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format to use
             * as the effective date when submitting this transfer.
             */
            fun date(date: LocalDate) = date(JsonField.of(date))

            /**
             * Sets [Builder.date] to an arbitrary JSON value.
             *
             * You should usually call [Builder.date] with a well-typed [LocalDate] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun date(date: JsonField<LocalDate>) = apply { this.date = date }

            /** A schedule by which Increase will choose an effective date for the transfer. */
            fun settlementSchedule(settlementSchedule: SettlementSchedule) =
                settlementSchedule(JsonField.of(settlementSchedule))

            /**
             * Sets [Builder.settlementSchedule] to an arbitrary JSON value.
             *
             * You should usually call [Builder.settlementSchedule] with a well-typed
             * [SettlementSchedule] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun settlementSchedule(settlementSchedule: JsonField<SettlementSchedule>) = apply {
                this.settlementSchedule = settlementSchedule
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
             * Returns an immutable instance of [PreferredEffectiveDate].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): PreferredEffectiveDate =
                PreferredEffectiveDate(
                    date,
                    settlementSchedule,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): PreferredEffectiveDate = apply {
            if (validated) {
                return@apply
            }

            date()
            settlementSchedule().ifPresent { it.validate() }
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
                (settlementSchedule.asKnown().getOrNull()?.validity() ?: 0)

        /** A schedule by which Increase will choose an effective date for the transfer. */
        class SettlementSchedule
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

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

                /**
                 * The chosen effective date will be the same as the ACH processing date on which
                 * the transfer is submitted. This is necessary, but not sufficient for the transfer
                 * to be settled same-day: it must also be submitted before the last same-day cutoff
                 * and be less than or equal to $1,000.000.00.
                 */
                @JvmField val SAME_DAY = of("same_day")

                /**
                 * The chosen effective date will be the business day following the ACH processing
                 * date on which the transfer is submitted. The transfer will be settled on that
                 * future day.
                 */
                @JvmField val FUTURE_DATED = of("future_dated")

                @JvmStatic fun of(value: String) = SettlementSchedule(JsonField.of(value))
            }

            /** An enum containing [SettlementSchedule]'s known values. */
            enum class Known {
                /**
                 * The chosen effective date will be the same as the ACH processing date on which
                 * the transfer is submitted. This is necessary, but not sufficient for the transfer
                 * to be settled same-day: it must also be submitted before the last same-day cutoff
                 * and be less than or equal to $1,000.000.00.
                 */
                SAME_DAY,
                /**
                 * The chosen effective date will be the business day following the ACH processing
                 * date on which the transfer is submitted. The transfer will be settled on that
                 * future day.
                 */
                FUTURE_DATED,
            }

            /**
             * An enum containing [SettlementSchedule]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [SettlementSchedule] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /**
                 * The chosen effective date will be the same as the ACH processing date on which
                 * the transfer is submitted. This is necessary, but not sufficient for the transfer
                 * to be settled same-day: it must also be submitted before the last same-day cutoff
                 * and be less than or equal to $1,000.000.00.
                 */
                SAME_DAY,
                /**
                 * The chosen effective date will be the business day following the ACH processing
                 * date on which the transfer is submitted. The transfer will be settled on that
                 * future day.
                 */
                FUTURE_DATED,
                /**
                 * An enum member indicating that [SettlementSchedule] was instantiated with an
                 * unknown value.
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
                    SAME_DAY -> Value.SAME_DAY
                    FUTURE_DATED -> Value.FUTURE_DATED
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
                    SAME_DAY -> Known.SAME_DAY
                    FUTURE_DATED -> Known.FUTURE_DATED
                    else -> throw IncreaseInvalidDataException("Unknown SettlementSchedule: $value")
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

            fun validate(): SettlementSchedule = apply {
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

                return other is SettlementSchedule && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PreferredEffectiveDate &&
                date == other.date &&
                settlementSchedule == other.settlementSchedule &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(date, settlementSchedule, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PreferredEffectiveDate{date=$date, settlementSchedule=$settlementSchedule, additionalProperties=$additionalProperties}"
    }

    /**
     * The [Standard Entry Class (SEC) code](/documentation/ach-standard-entry-class-codes) to use
     * for the transfer.
     */
    class StandardEntryClassCode
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

            /** Corporate Credit and Debit (CCD) is used for business-to-business payments. */
            @JvmField val CORPORATE_CREDIT_OR_DEBIT = of("corporate_credit_or_debit")

            /**
             * Corporate Trade Exchange (CTX) allows for including extensive remittance information
             * with business-to-business payments.
             */
            @JvmField val CORPORATE_TRADE_EXCHANGE = of("corporate_trade_exchange")

            /**
             * Prearranged Payments and Deposits (PPD) is used for credits or debits originated by
             * an organization to a consumer, such as payroll direct deposits.
             */
            @JvmField val PREARRANGED_PAYMENTS_AND_DEPOSIT = of("prearranged_payments_and_deposit")

            /**
             * Internet Initiated (WEB) is used for consumer payments initiated or authorized via
             * the Internet. Debits can only be initiated by non-consumers to debit a consumer’s
             * account. Credits can only be used for consumer to consumer transactions.
             */
            @JvmField val INTERNET_INITIATED = of("internet_initiated")

            @JvmStatic fun of(value: String) = StandardEntryClassCode(JsonField.of(value))
        }

        /** An enum containing [StandardEntryClassCode]'s known values. */
        enum class Known {
            /** Corporate Credit and Debit (CCD) is used for business-to-business payments. */
            CORPORATE_CREDIT_OR_DEBIT,
            /**
             * Corporate Trade Exchange (CTX) allows for including extensive remittance information
             * with business-to-business payments.
             */
            CORPORATE_TRADE_EXCHANGE,
            /**
             * Prearranged Payments and Deposits (PPD) is used for credits or debits originated by
             * an organization to a consumer, such as payroll direct deposits.
             */
            PREARRANGED_PAYMENTS_AND_DEPOSIT,
            /**
             * Internet Initiated (WEB) is used for consumer payments initiated or authorized via
             * the Internet. Debits can only be initiated by non-consumers to debit a consumer’s
             * account. Credits can only be used for consumer to consumer transactions.
             */
            INTERNET_INITIATED,
        }

        /**
         * An enum containing [StandardEntryClassCode]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [StandardEntryClassCode] can contain an unknown value in a couple of
         * cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            /** Corporate Credit and Debit (CCD) is used for business-to-business payments. */
            CORPORATE_CREDIT_OR_DEBIT,
            /**
             * Corporate Trade Exchange (CTX) allows for including extensive remittance information
             * with business-to-business payments.
             */
            CORPORATE_TRADE_EXCHANGE,
            /**
             * Prearranged Payments and Deposits (PPD) is used for credits or debits originated by
             * an organization to a consumer, such as payroll direct deposits.
             */
            PREARRANGED_PAYMENTS_AND_DEPOSIT,
            /**
             * Internet Initiated (WEB) is used for consumer payments initiated or authorized via
             * the Internet. Debits can only be initiated by non-consumers to debit a consumer’s
             * account. Credits can only be used for consumer to consumer transactions.
             */
            INTERNET_INITIATED,
            /**
             * An enum member indicating that [StandardEntryClassCode] was instantiated with an
             * unknown value.
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
                CORPORATE_CREDIT_OR_DEBIT -> Value.CORPORATE_CREDIT_OR_DEBIT
                CORPORATE_TRADE_EXCHANGE -> Value.CORPORATE_TRADE_EXCHANGE
                PREARRANGED_PAYMENTS_AND_DEPOSIT -> Value.PREARRANGED_PAYMENTS_AND_DEPOSIT
                INTERNET_INITIATED -> Value.INTERNET_INITIATED
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
                CORPORATE_CREDIT_OR_DEBIT -> Known.CORPORATE_CREDIT_OR_DEBIT
                CORPORATE_TRADE_EXCHANGE -> Known.CORPORATE_TRADE_EXCHANGE
                PREARRANGED_PAYMENTS_AND_DEPOSIT -> Known.PREARRANGED_PAYMENTS_AND_DEPOSIT
                INTERNET_INITIATED -> Known.INTERNET_INITIATED
                else -> throw IncreaseInvalidDataException("Unknown StandardEntryClassCode: $value")
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

        fun validate(): StandardEntryClassCode = apply {
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

            return other is StandardEntryClassCode && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The timing of the transaction. */
    class TransactionTiming @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            /** A Transaction will be created immediately. */
            @JvmField val SYNCHRONOUS = of("synchronous")

            /** A Transaction will be created when the funds settle at the Federal Reserve. */
            @JvmField val ASYNCHRONOUS = of("asynchronous")

            @JvmStatic fun of(value: String) = TransactionTiming(JsonField.of(value))
        }

        /** An enum containing [TransactionTiming]'s known values. */
        enum class Known {
            /** A Transaction will be created immediately. */
            SYNCHRONOUS,
            /** A Transaction will be created when the funds settle at the Federal Reserve. */
            ASYNCHRONOUS,
        }

        /**
         * An enum containing [TransactionTiming]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [TransactionTiming] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            /** A Transaction will be created immediately. */
            SYNCHRONOUS,
            /** A Transaction will be created when the funds settle at the Federal Reserve. */
            ASYNCHRONOUS,
            /**
             * An enum member indicating that [TransactionTiming] was instantiated with an unknown
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
                SYNCHRONOUS -> Value.SYNCHRONOUS
                ASYNCHRONOUS -> Value.ASYNCHRONOUS
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
                SYNCHRONOUS -> Known.SYNCHRONOUS
                ASYNCHRONOUS -> Known.ASYNCHRONOUS
                else -> throw IncreaseInvalidDataException("Unknown TransactionTiming: $value")
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

        fun validate(): TransactionTiming = apply {
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

            return other is TransactionTiming && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AchTransferCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "AchTransferCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
