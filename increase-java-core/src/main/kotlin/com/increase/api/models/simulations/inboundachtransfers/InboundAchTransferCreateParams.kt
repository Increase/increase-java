// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.simulations.inboundachtransfers

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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Simulates an inbound ACH transfer to your account. This imitates initiating a transfer to an
 * Increase account from a different financial institution. The transfer may be either a credit or a
 * debit depending on if the `amount` is positive or negative. The result of calling this API will
 * contain the created transfer. You can pass a `resolve_at` parameter to allow for a window to
 * [action on the Inbound ACH Transfer](https://increase.com/documentation/receiving-ach-transfers).
 * Alternatively, if you don't pass the `resolve_at` parameter the result will contain either a
 * [Transaction](#transactions) or a [Declined Transaction](#declined-transactions) depending on
 * whether or not the transfer is allowed.
 */
class InboundAchTransferCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The identifier of the Account Number the inbound ACH Transfer is for.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountNumberId(): String = body.accountNumberId()

    /**
     * The transfer amount in cents. A positive amount originates a credit transfer pushing funds to
     * the receiving account. A negative amount originates a debit transfer pulling funds from the
     * receiving account.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amount(): Long = body.amount()

    /**
     * The description of the date of the transfer.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun companyDescriptiveDate(): Optional<String> = body.companyDescriptiveDate()

    /**
     * Data associated with the transfer set by the sender.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun companyDiscretionaryData(): Optional<String> = body.companyDiscretionaryData()

    /**
     * The description of the transfer set by the sender.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun companyEntryDescription(): Optional<String> = body.companyEntryDescription()

    /**
     * The sender's company ID.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun companyId(): Optional<String> = body.companyId()

    /**
     * The name of the sender.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun companyName(): Optional<String> = body.companyName()

    /**
     * The ID of the receiver of the transfer.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun receiverIdNumber(): Optional<String> = body.receiverIdNumber()

    /**
     * The name of the receiver of the transfer.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun receiverName(): Optional<String> = body.receiverName()

    /**
     * The time at which the transfer should be resolved. If not provided will resolve immediately.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun resolveAt(): Optional<OffsetDateTime> = body.resolveAt()

    /**
     * The standard entry class code for the transfer.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun standardEntryClassCode(): Optional<StandardEntryClassCode> = body.standardEntryClassCode()

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
     * Returns the raw JSON value of [companyId].
     *
     * Unlike [companyId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _companyId(): JsonField<String> = body._companyId()

    /**
     * Returns the raw JSON value of [companyName].
     *
     * Unlike [companyName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _companyName(): JsonField<String> = body._companyName()

    /**
     * Returns the raw JSON value of [receiverIdNumber].
     *
     * Unlike [receiverIdNumber], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _receiverIdNumber(): JsonField<String> = body._receiverIdNumber()

    /**
     * Returns the raw JSON value of [receiverName].
     *
     * Unlike [receiverName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _receiverName(): JsonField<String> = body._receiverName()

    /**
     * Returns the raw JSON value of [resolveAt].
     *
     * Unlike [resolveAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _resolveAt(): JsonField<OffsetDateTime> = body._resolveAt()

    /**
     * Returns the raw JSON value of [standardEntryClassCode].
     *
     * Unlike [standardEntryClassCode], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _standardEntryClassCode(): JsonField<StandardEntryClassCode> =
        body._standardEntryClassCode()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [InboundAchTransferCreateParams].
         *
         * The following fields are required:
         * ```java
         * .accountNumberId()
         * .amount()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InboundAchTransferCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(inboundAchTransferCreateParams: InboundAchTransferCreateParams) = apply {
            body = inboundAchTransferCreateParams.body.toBuilder()
            additionalHeaders = inboundAchTransferCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = inboundAchTransferCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [accountNumberId]
         * - [amount]
         * - [companyDescriptiveDate]
         * - [companyDiscretionaryData]
         * - [companyEntryDescription]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The identifier of the Account Number the inbound ACH Transfer is for. */
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

        /**
         * The transfer amount in cents. A positive amount originates a credit transfer pushing
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

        /** The description of the date of the transfer. */
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

        /** Data associated with the transfer set by the sender. */
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

        /** The description of the transfer set by the sender. */
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

        /** The sender's company ID. */
        fun companyId(companyId: String) = apply { body.companyId(companyId) }

        /**
         * Sets [Builder.companyId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.companyId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun companyId(companyId: JsonField<String>) = apply { body.companyId(companyId) }

        /** The name of the sender. */
        fun companyName(companyName: String) = apply { body.companyName(companyName) }

        /**
         * Sets [Builder.companyName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.companyName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun companyName(companyName: JsonField<String>) = apply { body.companyName(companyName) }

        /** The ID of the receiver of the transfer. */
        fun receiverIdNumber(receiverIdNumber: String) = apply {
            body.receiverIdNumber(receiverIdNumber)
        }

        /**
         * Sets [Builder.receiverIdNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.receiverIdNumber] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun receiverIdNumber(receiverIdNumber: JsonField<String>) = apply {
            body.receiverIdNumber(receiverIdNumber)
        }

        /** The name of the receiver of the transfer. */
        fun receiverName(receiverName: String) = apply { body.receiverName(receiverName) }

        /**
         * Sets [Builder.receiverName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.receiverName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun receiverName(receiverName: JsonField<String>) = apply {
            body.receiverName(receiverName)
        }

        /**
         * The time at which the transfer should be resolved. If not provided will resolve
         * immediately.
         */
        fun resolveAt(resolveAt: OffsetDateTime) = apply { body.resolveAt(resolveAt) }

        /**
         * Sets [Builder.resolveAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.resolveAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun resolveAt(resolveAt: JsonField<OffsetDateTime>) = apply { body.resolveAt(resolveAt) }

        /** The standard entry class code for the transfer. */
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
         * Returns an immutable instance of [InboundAchTransferCreateParams].
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
        fun build(): InboundAchTransferCreateParams =
            InboundAchTransferCreateParams(
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
        private val companyDescriptiveDate: JsonField<String>,
        private val companyDiscretionaryData: JsonField<String>,
        private val companyEntryDescription: JsonField<String>,
        private val companyId: JsonField<String>,
        private val companyName: JsonField<String>,
        private val receiverIdNumber: JsonField<String>,
        private val receiverName: JsonField<String>,
        private val resolveAt: JsonField<OffsetDateTime>,
        private val standardEntryClassCode: JsonField<StandardEntryClassCode>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("account_number_id")
            @ExcludeMissing
            accountNumberId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("company_descriptive_date")
            @ExcludeMissing
            companyDescriptiveDate: JsonField<String> = JsonMissing.of(),
            @JsonProperty("company_discretionary_data")
            @ExcludeMissing
            companyDiscretionaryData: JsonField<String> = JsonMissing.of(),
            @JsonProperty("company_entry_description")
            @ExcludeMissing
            companyEntryDescription: JsonField<String> = JsonMissing.of(),
            @JsonProperty("company_id")
            @ExcludeMissing
            companyId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("company_name")
            @ExcludeMissing
            companyName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("receiver_id_number")
            @ExcludeMissing
            receiverIdNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("receiver_name")
            @ExcludeMissing
            receiverName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("resolve_at")
            @ExcludeMissing
            resolveAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("standard_entry_class_code")
            @ExcludeMissing
            standardEntryClassCode: JsonField<StandardEntryClassCode> = JsonMissing.of(),
        ) : this(
            accountNumberId,
            amount,
            companyDescriptiveDate,
            companyDiscretionaryData,
            companyEntryDescription,
            companyId,
            companyName,
            receiverIdNumber,
            receiverName,
            resolveAt,
            standardEntryClassCode,
            mutableMapOf(),
        )

        /**
         * The identifier of the Account Number the inbound ACH Transfer is for.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun accountNumberId(): String = accountNumberId.getRequired("account_number_id")

        /**
         * The transfer amount in cents. A positive amount originates a credit transfer pushing
         * funds to the receiving account. A negative amount originates a debit transfer pulling
         * funds from the receiving account.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun amount(): Long = amount.getRequired("amount")

        /**
         * The description of the date of the transfer.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun companyDescriptiveDate(): Optional<String> =
            companyDescriptiveDate.getOptional("company_descriptive_date")

        /**
         * Data associated with the transfer set by the sender.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun companyDiscretionaryData(): Optional<String> =
            companyDiscretionaryData.getOptional("company_discretionary_data")

        /**
         * The description of the transfer set by the sender.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun companyEntryDescription(): Optional<String> =
            companyEntryDescription.getOptional("company_entry_description")

        /**
         * The sender's company ID.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun companyId(): Optional<String> = companyId.getOptional("company_id")

        /**
         * The name of the sender.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun companyName(): Optional<String> = companyName.getOptional("company_name")

        /**
         * The ID of the receiver of the transfer.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun receiverIdNumber(): Optional<String> =
            receiverIdNumber.getOptional("receiver_id_number")

        /**
         * The name of the receiver of the transfer.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun receiverName(): Optional<String> = receiverName.getOptional("receiver_name")

        /**
         * The time at which the transfer should be resolved. If not provided will resolve
         * immediately.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun resolveAt(): Optional<OffsetDateTime> = resolveAt.getOptional("resolve_at")

        /**
         * The standard entry class code for the transfer.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun standardEntryClassCode(): Optional<StandardEntryClassCode> =
            standardEntryClassCode.getOptional("standard_entry_class_code")

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
         * Returns the raw JSON value of [companyId].
         *
         * Unlike [companyId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("company_id") @ExcludeMissing fun _companyId(): JsonField<String> = companyId

        /**
         * Returns the raw JSON value of [companyName].
         *
         * Unlike [companyName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("company_name")
        @ExcludeMissing
        fun _companyName(): JsonField<String> = companyName

        /**
         * Returns the raw JSON value of [receiverIdNumber].
         *
         * Unlike [receiverIdNumber], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("receiver_id_number")
        @ExcludeMissing
        fun _receiverIdNumber(): JsonField<String> = receiverIdNumber

        /**
         * Returns the raw JSON value of [receiverName].
         *
         * Unlike [receiverName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("receiver_name")
        @ExcludeMissing
        fun _receiverName(): JsonField<String> = receiverName

        /**
         * Returns the raw JSON value of [resolveAt].
         *
         * Unlike [resolveAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("resolve_at")
        @ExcludeMissing
        fun _resolveAt(): JsonField<OffsetDateTime> = resolveAt

        /**
         * Returns the raw JSON value of [standardEntryClassCode].
         *
         * Unlike [standardEntryClassCode], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("standard_entry_class_code")
        @ExcludeMissing
        fun _standardEntryClassCode(): JsonField<StandardEntryClassCode> = standardEntryClassCode

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
            private var companyDescriptiveDate: JsonField<String> = JsonMissing.of()
            private var companyDiscretionaryData: JsonField<String> = JsonMissing.of()
            private var companyEntryDescription: JsonField<String> = JsonMissing.of()
            private var companyId: JsonField<String> = JsonMissing.of()
            private var companyName: JsonField<String> = JsonMissing.of()
            private var receiverIdNumber: JsonField<String> = JsonMissing.of()
            private var receiverName: JsonField<String> = JsonMissing.of()
            private var resolveAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var standardEntryClassCode: JsonField<StandardEntryClassCode> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                accountNumberId = body.accountNumberId
                amount = body.amount
                companyDescriptiveDate = body.companyDescriptiveDate
                companyDiscretionaryData = body.companyDiscretionaryData
                companyEntryDescription = body.companyEntryDescription
                companyId = body.companyId
                companyName = body.companyName
                receiverIdNumber = body.receiverIdNumber
                receiverName = body.receiverName
                resolveAt = body.resolveAt
                standardEntryClassCode = body.standardEntryClassCode
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The identifier of the Account Number the inbound ACH Transfer is for. */
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

            /**
             * The transfer amount in cents. A positive amount originates a credit transfer pushing
             * funds to the receiving account. A negative amount originates a debit transfer pulling
             * funds from the receiving account.
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

            /** The description of the date of the transfer. */
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

            /** Data associated with the transfer set by the sender. */
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

            /** The description of the transfer set by the sender. */
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

            /** The sender's company ID. */
            fun companyId(companyId: String) = companyId(JsonField.of(companyId))

            /**
             * Sets [Builder.companyId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.companyId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun companyId(companyId: JsonField<String>) = apply { this.companyId = companyId }

            /** The name of the sender. */
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

            /** The ID of the receiver of the transfer. */
            fun receiverIdNumber(receiverIdNumber: String) =
                receiverIdNumber(JsonField.of(receiverIdNumber))

            /**
             * Sets [Builder.receiverIdNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.receiverIdNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun receiverIdNumber(receiverIdNumber: JsonField<String>) = apply {
                this.receiverIdNumber = receiverIdNumber
            }

            /** The name of the receiver of the transfer. */
            fun receiverName(receiverName: String) = receiverName(JsonField.of(receiverName))

            /**
             * Sets [Builder.receiverName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.receiverName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun receiverName(receiverName: JsonField<String>) = apply {
                this.receiverName = receiverName
            }

            /**
             * The time at which the transfer should be resolved. If not provided will resolve
             * immediately.
             */
            fun resolveAt(resolveAt: OffsetDateTime) = resolveAt(JsonField.of(resolveAt))

            /**
             * Sets [Builder.resolveAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.resolveAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun resolveAt(resolveAt: JsonField<OffsetDateTime>) = apply {
                this.resolveAt = resolveAt
            }

            /** The standard entry class code for the transfer. */
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
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("accountNumberId", accountNumberId),
                    checkRequired("amount", amount),
                    companyDescriptiveDate,
                    companyDiscretionaryData,
                    companyEntryDescription,
                    companyId,
                    companyName,
                    receiverIdNumber,
                    receiverName,
                    resolveAt,
                    standardEntryClassCode,
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
            companyDescriptiveDate()
            companyDiscretionaryData()
            companyEntryDescription()
            companyId()
            companyName()
            receiverIdNumber()
            receiverName()
            resolveAt()
            standardEntryClassCode().ifPresent { it.validate() }
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
                (if (companyDescriptiveDate.asKnown().isPresent) 1 else 0) +
                (if (companyDiscretionaryData.asKnown().isPresent) 1 else 0) +
                (if (companyEntryDescription.asKnown().isPresent) 1 else 0) +
                (if (companyId.asKnown().isPresent) 1 else 0) +
                (if (companyName.asKnown().isPresent) 1 else 0) +
                (if (receiverIdNumber.asKnown().isPresent) 1 else 0) +
                (if (receiverName.asKnown().isPresent) 1 else 0) +
                (if (resolveAt.asKnown().isPresent) 1 else 0) +
                (standardEntryClassCode.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && accountNumberId == other.accountNumberId && amount == other.amount && companyDescriptiveDate == other.companyDescriptiveDate && companyDiscretionaryData == other.companyDiscretionaryData && companyEntryDescription == other.companyEntryDescription && companyId == other.companyId && companyName == other.companyName && receiverIdNumber == other.receiverIdNumber && receiverName == other.receiverName && resolveAt == other.resolveAt && standardEntryClassCode == other.standardEntryClassCode && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(accountNumberId, amount, companyDescriptiveDate, companyDiscretionaryData, companyEntryDescription, companyId, companyName, receiverIdNumber, receiverName, resolveAt, standardEntryClassCode, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{accountNumberId=$accountNumberId, amount=$amount, companyDescriptiveDate=$companyDescriptiveDate, companyDiscretionaryData=$companyDiscretionaryData, companyEntryDescription=$companyEntryDescription, companyId=$companyId, companyName=$companyName, receiverIdNumber=$receiverIdNumber, receiverName=$receiverName, resolveAt=$resolveAt, standardEntryClassCode=$standardEntryClassCode, additionalProperties=$additionalProperties}"
    }

    /** The standard entry class code for the transfer. */
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

            /** Corporate Credit and Debit (CCD). */
            @JvmField val CORPORATE_CREDIT_OR_DEBIT = of("corporate_credit_or_debit")

            /** Corporate Trade Exchange (CTX). */
            @JvmField val CORPORATE_TRADE_EXCHANGE = of("corporate_trade_exchange")

            /** Prearranged Payments and Deposits (PPD). */
            @JvmField val PREARRANGED_PAYMENTS_AND_DEPOSIT = of("prearranged_payments_and_deposit")

            /** Internet Initiated (WEB). */
            @JvmField val INTERNET_INITIATED = of("internet_initiated")

            /** Point of Sale (POS). */
            @JvmField val POINT_OF_SALE = of("point_of_sale")

            /** Telephone Initiated (TEL). */
            @JvmField val TELEPHONE_INITIATED = of("telephone_initiated")

            /** Customer Initiated (CIE). */
            @JvmField val CUSTOMER_INITIATED = of("customer_initiated")

            /** Accounts Receivable (ARC). */
            @JvmField val ACCOUNTS_RECEIVABLE = of("accounts_receivable")

            /** Machine Transfer (MTE). */
            @JvmField val MACHINE_TRANSFER = of("machine_transfer")

            /** Shared Network Transaction (SHR). */
            @JvmField val SHARED_NETWORK_TRANSACTION = of("shared_network_transaction")

            /** Represented Check (RCK). */
            @JvmField val REPRESENTED_CHECK = of("represented_check")

            /** Back Office Conversion (BOC). */
            @JvmField val BACK_OFFICE_CONVERSION = of("back_office_conversion")

            /** Point of Purchase (POP). */
            @JvmField val POINT_OF_PURCHASE = of("point_of_purchase")

            /** Check Truncation (TRC). */
            @JvmField val CHECK_TRUNCATION = of("check_truncation")

            /** Destroyed Check (XCK). */
            @JvmField val DESTROYED_CHECK = of("destroyed_check")

            /** International ACH Transaction (IAT). */
            @JvmField val INTERNATIONAL_ACH_TRANSACTION = of("international_ach_transaction")

            @JvmStatic fun of(value: String) = StandardEntryClassCode(JsonField.of(value))
        }

        /** An enum containing [StandardEntryClassCode]'s known values. */
        enum class Known {
            /** Corporate Credit and Debit (CCD). */
            CORPORATE_CREDIT_OR_DEBIT,
            /** Corporate Trade Exchange (CTX). */
            CORPORATE_TRADE_EXCHANGE,
            /** Prearranged Payments and Deposits (PPD). */
            PREARRANGED_PAYMENTS_AND_DEPOSIT,
            /** Internet Initiated (WEB). */
            INTERNET_INITIATED,
            /** Point of Sale (POS). */
            POINT_OF_SALE,
            /** Telephone Initiated (TEL). */
            TELEPHONE_INITIATED,
            /** Customer Initiated (CIE). */
            CUSTOMER_INITIATED,
            /** Accounts Receivable (ARC). */
            ACCOUNTS_RECEIVABLE,
            /** Machine Transfer (MTE). */
            MACHINE_TRANSFER,
            /** Shared Network Transaction (SHR). */
            SHARED_NETWORK_TRANSACTION,
            /** Represented Check (RCK). */
            REPRESENTED_CHECK,
            /** Back Office Conversion (BOC). */
            BACK_OFFICE_CONVERSION,
            /** Point of Purchase (POP). */
            POINT_OF_PURCHASE,
            /** Check Truncation (TRC). */
            CHECK_TRUNCATION,
            /** Destroyed Check (XCK). */
            DESTROYED_CHECK,
            /** International ACH Transaction (IAT). */
            INTERNATIONAL_ACH_TRANSACTION,
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
            /** Corporate Credit and Debit (CCD). */
            CORPORATE_CREDIT_OR_DEBIT,
            /** Corporate Trade Exchange (CTX). */
            CORPORATE_TRADE_EXCHANGE,
            /** Prearranged Payments and Deposits (PPD). */
            PREARRANGED_PAYMENTS_AND_DEPOSIT,
            /** Internet Initiated (WEB). */
            INTERNET_INITIATED,
            /** Point of Sale (POS). */
            POINT_OF_SALE,
            /** Telephone Initiated (TEL). */
            TELEPHONE_INITIATED,
            /** Customer Initiated (CIE). */
            CUSTOMER_INITIATED,
            /** Accounts Receivable (ARC). */
            ACCOUNTS_RECEIVABLE,
            /** Machine Transfer (MTE). */
            MACHINE_TRANSFER,
            /** Shared Network Transaction (SHR). */
            SHARED_NETWORK_TRANSACTION,
            /** Represented Check (RCK). */
            REPRESENTED_CHECK,
            /** Back Office Conversion (BOC). */
            BACK_OFFICE_CONVERSION,
            /** Point of Purchase (POP). */
            POINT_OF_PURCHASE,
            /** Check Truncation (TRC). */
            CHECK_TRUNCATION,
            /** Destroyed Check (XCK). */
            DESTROYED_CHECK,
            /** International ACH Transaction (IAT). */
            INTERNATIONAL_ACH_TRANSACTION,
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
                POINT_OF_SALE -> Value.POINT_OF_SALE
                TELEPHONE_INITIATED -> Value.TELEPHONE_INITIATED
                CUSTOMER_INITIATED -> Value.CUSTOMER_INITIATED
                ACCOUNTS_RECEIVABLE -> Value.ACCOUNTS_RECEIVABLE
                MACHINE_TRANSFER -> Value.MACHINE_TRANSFER
                SHARED_NETWORK_TRANSACTION -> Value.SHARED_NETWORK_TRANSACTION
                REPRESENTED_CHECK -> Value.REPRESENTED_CHECK
                BACK_OFFICE_CONVERSION -> Value.BACK_OFFICE_CONVERSION
                POINT_OF_PURCHASE -> Value.POINT_OF_PURCHASE
                CHECK_TRUNCATION -> Value.CHECK_TRUNCATION
                DESTROYED_CHECK -> Value.DESTROYED_CHECK
                INTERNATIONAL_ACH_TRANSACTION -> Value.INTERNATIONAL_ACH_TRANSACTION
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
                POINT_OF_SALE -> Known.POINT_OF_SALE
                TELEPHONE_INITIATED -> Known.TELEPHONE_INITIATED
                CUSTOMER_INITIATED -> Known.CUSTOMER_INITIATED
                ACCOUNTS_RECEIVABLE -> Known.ACCOUNTS_RECEIVABLE
                MACHINE_TRANSFER -> Known.MACHINE_TRANSFER
                SHARED_NETWORK_TRANSACTION -> Known.SHARED_NETWORK_TRANSACTION
                REPRESENTED_CHECK -> Known.REPRESENTED_CHECK
                BACK_OFFICE_CONVERSION -> Known.BACK_OFFICE_CONVERSION
                POINT_OF_PURCHASE -> Known.POINT_OF_PURCHASE
                CHECK_TRUNCATION -> Known.CHECK_TRUNCATION
                DESTROYED_CHECK -> Known.DESTROYED_CHECK
                INTERNATIONAL_ACH_TRANSACTION -> Known.INTERNATIONAL_ACH_TRANSACTION
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

            return /* spotless:off */ other is StandardEntryClassCode && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InboundAchTransferCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "InboundAchTransferCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
