// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.achprenotifications

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

/** Create an ACH Prenotification */
class AchPrenotificationCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The Increase identifier for the account that will send the ACH Prenotification.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountId(): String = body.accountId()

    /**
     * The account number for the destination account.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountNumber(): String = body.accountNumber()

    /**
     * The American Bankers' Association (ABA) Routing Transit Number (RTN) for the destination
     * account.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun routingNumber(): String = body.routingNumber()

    /**
     * Additional information that will be sent to the recipient.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun addendum(): Optional<String> = body.addendum()

    /**
     * The description of the date of the ACH Prenotification.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun companyDescriptiveDate(): Optional<String> = body.companyDescriptiveDate()

    /**
     * The data you choose to associate with the ACH Prenotification.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun companyDiscretionaryData(): Optional<String> = body.companyDiscretionaryData()

    /**
     * The description you wish to be shown to the recipient.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun companyEntryDescription(): Optional<String> = body.companyEntryDescription()

    /**
     * The name by which the recipient knows you.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun companyName(): Optional<String> = body.companyName()

    /**
     * Whether the Prenotification is for a future debit or credit.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun creditDebitIndicator(): Optional<CreditDebitIndicator> = body.creditDebitIndicator()

    /**
     * The ACH Prenotification effective date in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
     * format.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun effectiveDate(): Optional<LocalDate> = body.effectiveDate()

    /**
     * Your identifier for the recipient.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun individualId(): Optional<String> = body.individualId()

    /**
     * The name of therecipient. This value is informational and not verified by the recipient's
     * bank.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun individualName(): Optional<String> = body.individualName()

    /**
     * The [Standard Entry Class (SEC) code](/documentation/ach-standard-entry-class-codes) to use
     * for the ACH Prenotification.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun standardEntryClassCode(): Optional<StandardEntryClassCode> = body.standardEntryClassCode()

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
     * Returns the raw JSON value of [routingNumber].
     *
     * Unlike [routingNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _routingNumber(): JsonField<String> = body._routingNumber()

    /**
     * Returns the raw JSON value of [addendum].
     *
     * Unlike [addendum], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _addendum(): JsonField<String> = body._addendum()

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
     * Returns the raw JSON value of [creditDebitIndicator].
     *
     * Unlike [creditDebitIndicator], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _creditDebitIndicator(): JsonField<CreditDebitIndicator> = body._creditDebitIndicator()

    /**
     * Returns the raw JSON value of [effectiveDate].
     *
     * Unlike [effectiveDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _effectiveDate(): JsonField<LocalDate> = body._effectiveDate()

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
     * Returns the raw JSON value of [standardEntryClassCode].
     *
     * Unlike [standardEntryClassCode], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _standardEntryClassCode(): JsonField<StandardEntryClassCode> =
        body._standardEntryClassCode()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [AchPrenotificationCreateParams].
         *
         * The following fields are required:
         * ```java
         * .accountId()
         * .accountNumber()
         * .routingNumber()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AchPrenotificationCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(achPrenotificationCreateParams: AchPrenotificationCreateParams) = apply {
            body = achPrenotificationCreateParams.body.toBuilder()
            additionalHeaders = achPrenotificationCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = achPrenotificationCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [accountId]
         * - [accountNumber]
         * - [routingNumber]
         * - [addendum]
         * - [companyDescriptiveDate]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The Increase identifier for the account that will send the ACH Prenotification. */
        fun accountId(accountId: String) = apply { body.accountId(accountId) }

        /**
         * Sets [Builder.accountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accountId(accountId: JsonField<String>) = apply { body.accountId(accountId) }

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

        /** Additional information that will be sent to the recipient. */
        fun addendum(addendum: String) = apply { body.addendum(addendum) }

        /**
         * Sets [Builder.addendum] to an arbitrary JSON value.
         *
         * You should usually call [Builder.addendum] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun addendum(addendum: JsonField<String>) = apply { body.addendum(addendum) }

        /** The description of the date of the ACH Prenotification. */
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

        /** The data you choose to associate with the ACH Prenotification. */
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

        /** The description you wish to be shown to the recipient. */
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

        /** The name by which the recipient knows you. */
        fun companyName(companyName: String) = apply { body.companyName(companyName) }

        /**
         * Sets [Builder.companyName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.companyName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun companyName(companyName: JsonField<String>) = apply { body.companyName(companyName) }

        /** Whether the Prenotification is for a future debit or credit. */
        fun creditDebitIndicator(creditDebitIndicator: CreditDebitIndicator) = apply {
            body.creditDebitIndicator(creditDebitIndicator)
        }

        /**
         * Sets [Builder.creditDebitIndicator] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creditDebitIndicator] with a well-typed
         * [CreditDebitIndicator] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun creditDebitIndicator(creditDebitIndicator: JsonField<CreditDebitIndicator>) = apply {
            body.creditDebitIndicator(creditDebitIndicator)
        }

        /**
         * The ACH Prenotification effective date in
         * [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format.
         */
        fun effectiveDate(effectiveDate: LocalDate) = apply { body.effectiveDate(effectiveDate) }

        /**
         * Sets [Builder.effectiveDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.effectiveDate] with a well-typed [LocalDate] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun effectiveDate(effectiveDate: JsonField<LocalDate>) = apply {
            body.effectiveDate(effectiveDate)
        }

        /** Your identifier for the recipient. */
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
         * The name of therecipient. This value is informational and not verified by the recipient's
         * bank.
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
         * The [Standard Entry Class (SEC) code](/documentation/ach-standard-entry-class-codes) to
         * use for the ACH Prenotification.
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
         * Returns an immutable instance of [AchPrenotificationCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .accountId()
         * .accountNumber()
         * .routingNumber()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AchPrenotificationCreateParams =
            AchPrenotificationCreateParams(
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
        private val routingNumber: JsonField<String>,
        private val addendum: JsonField<String>,
        private val companyDescriptiveDate: JsonField<String>,
        private val companyDiscretionaryData: JsonField<String>,
        private val companyEntryDescription: JsonField<String>,
        private val companyName: JsonField<String>,
        private val creditDebitIndicator: JsonField<CreditDebitIndicator>,
        private val effectiveDate: JsonField<LocalDate>,
        private val individualId: JsonField<String>,
        private val individualName: JsonField<String>,
        private val standardEntryClassCode: JsonField<StandardEntryClassCode>,
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
            @JsonProperty("routing_number")
            @ExcludeMissing
            routingNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("addendum")
            @ExcludeMissing
            addendum: JsonField<String> = JsonMissing.of(),
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
            @JsonProperty("credit_debit_indicator")
            @ExcludeMissing
            creditDebitIndicator: JsonField<CreditDebitIndicator> = JsonMissing.of(),
            @JsonProperty("effective_date")
            @ExcludeMissing
            effectiveDate: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("individual_id")
            @ExcludeMissing
            individualId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("individual_name")
            @ExcludeMissing
            individualName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("standard_entry_class_code")
            @ExcludeMissing
            standardEntryClassCode: JsonField<StandardEntryClassCode> = JsonMissing.of(),
        ) : this(
            accountId,
            accountNumber,
            routingNumber,
            addendum,
            companyDescriptiveDate,
            companyDiscretionaryData,
            companyEntryDescription,
            companyName,
            creditDebitIndicator,
            effectiveDate,
            individualId,
            individualName,
            standardEntryClassCode,
            mutableMapOf(),
        )

        /**
         * The Increase identifier for the account that will send the ACH Prenotification.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun accountId(): String = accountId.getRequired("account_id")

        /**
         * The account number for the destination account.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun accountNumber(): String = accountNumber.getRequired("account_number")

        /**
         * The American Bankers' Association (ABA) Routing Transit Number (RTN) for the destination
         * account.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun routingNumber(): String = routingNumber.getRequired("routing_number")

        /**
         * Additional information that will be sent to the recipient.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun addendum(): Optional<String> = addendum.getOptional("addendum")

        /**
         * The description of the date of the ACH Prenotification.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun companyDescriptiveDate(): Optional<String> =
            companyDescriptiveDate.getOptional("company_descriptive_date")

        /**
         * The data you choose to associate with the ACH Prenotification.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun companyDiscretionaryData(): Optional<String> =
            companyDiscretionaryData.getOptional("company_discretionary_data")

        /**
         * The description you wish to be shown to the recipient.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun companyEntryDescription(): Optional<String> =
            companyEntryDescription.getOptional("company_entry_description")

        /**
         * The name by which the recipient knows you.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun companyName(): Optional<String> = companyName.getOptional("company_name")

        /**
         * Whether the Prenotification is for a future debit or credit.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun creditDebitIndicator(): Optional<CreditDebitIndicator> =
            creditDebitIndicator.getOptional("credit_debit_indicator")

        /**
         * The ACH Prenotification effective date in
         * [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun effectiveDate(): Optional<LocalDate> = effectiveDate.getOptional("effective_date")

        /**
         * Your identifier for the recipient.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun individualId(): Optional<String> = individualId.getOptional("individual_id")

        /**
         * The name of therecipient. This value is informational and not verified by the recipient's
         * bank.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun individualName(): Optional<String> = individualName.getOptional("individual_name")

        /**
         * The [Standard Entry Class (SEC) code](/documentation/ach-standard-entry-class-codes) to
         * use for the ACH Prenotification.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun standardEntryClassCode(): Optional<StandardEntryClassCode> =
            standardEntryClassCode.getOptional("standard_entry_class_code")

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
         * Returns the raw JSON value of [routingNumber].
         *
         * Unlike [routingNumber], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("routing_number")
        @ExcludeMissing
        fun _routingNumber(): JsonField<String> = routingNumber

        /**
         * Returns the raw JSON value of [addendum].
         *
         * Unlike [addendum], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("addendum") @ExcludeMissing fun _addendum(): JsonField<String> = addendum

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
         * Returns the raw JSON value of [creditDebitIndicator].
         *
         * Unlike [creditDebitIndicator], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("credit_debit_indicator")
        @ExcludeMissing
        fun _creditDebitIndicator(): JsonField<CreditDebitIndicator> = creditDebitIndicator

        /**
         * Returns the raw JSON value of [effectiveDate].
         *
         * Unlike [effectiveDate], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("effective_date")
        @ExcludeMissing
        fun _effectiveDate(): JsonField<LocalDate> = effectiveDate

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
             * .accountId()
             * .accountNumber()
             * .routingNumber()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var accountId: JsonField<String>? = null
            private var accountNumber: JsonField<String>? = null
            private var routingNumber: JsonField<String>? = null
            private var addendum: JsonField<String> = JsonMissing.of()
            private var companyDescriptiveDate: JsonField<String> = JsonMissing.of()
            private var companyDiscretionaryData: JsonField<String> = JsonMissing.of()
            private var companyEntryDescription: JsonField<String> = JsonMissing.of()
            private var companyName: JsonField<String> = JsonMissing.of()
            private var creditDebitIndicator: JsonField<CreditDebitIndicator> = JsonMissing.of()
            private var effectiveDate: JsonField<LocalDate> = JsonMissing.of()
            private var individualId: JsonField<String> = JsonMissing.of()
            private var individualName: JsonField<String> = JsonMissing.of()
            private var standardEntryClassCode: JsonField<StandardEntryClassCode> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                accountId = body.accountId
                accountNumber = body.accountNumber
                routingNumber = body.routingNumber
                addendum = body.addendum
                companyDescriptiveDate = body.companyDescriptiveDate
                companyDiscretionaryData = body.companyDiscretionaryData
                companyEntryDescription = body.companyEntryDescription
                companyName = body.companyName
                creditDebitIndicator = body.creditDebitIndicator
                effectiveDate = body.effectiveDate
                individualId = body.individualId
                individualName = body.individualName
                standardEntryClassCode = body.standardEntryClassCode
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The Increase identifier for the account that will send the ACH Prenotification. */
            fun accountId(accountId: String) = accountId(JsonField.of(accountId))

            /**
             * Sets [Builder.accountId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

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

            /** Additional information that will be sent to the recipient. */
            fun addendum(addendum: String) = addendum(JsonField.of(addendum))

            /**
             * Sets [Builder.addendum] to an arbitrary JSON value.
             *
             * You should usually call [Builder.addendum] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun addendum(addendum: JsonField<String>) = apply { this.addendum = addendum }

            /** The description of the date of the ACH Prenotification. */
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

            /** The data you choose to associate with the ACH Prenotification. */
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

            /** The description you wish to be shown to the recipient. */
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

            /** The name by which the recipient knows you. */
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

            /** Whether the Prenotification is for a future debit or credit. */
            fun creditDebitIndicator(creditDebitIndicator: CreditDebitIndicator) =
                creditDebitIndicator(JsonField.of(creditDebitIndicator))

            /**
             * Sets [Builder.creditDebitIndicator] to an arbitrary JSON value.
             *
             * You should usually call [Builder.creditDebitIndicator] with a well-typed
             * [CreditDebitIndicator] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun creditDebitIndicator(creditDebitIndicator: JsonField<CreditDebitIndicator>) =
                apply {
                    this.creditDebitIndicator = creditDebitIndicator
                }

            /**
             * The ACH Prenotification effective date in
             * [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format.
             */
            fun effectiveDate(effectiveDate: LocalDate) = effectiveDate(JsonField.of(effectiveDate))

            /**
             * Sets [Builder.effectiveDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.effectiveDate] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun effectiveDate(effectiveDate: JsonField<LocalDate>) = apply {
                this.effectiveDate = effectiveDate
            }

            /** Your identifier for the recipient. */
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
             * The name of therecipient. This value is informational and not verified by the
             * recipient's bank.
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
             * The [Standard Entry Class (SEC) code](/documentation/ach-standard-entry-class-codes)
             * to use for the ACH Prenotification.
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
             * .routingNumber()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("accountId", accountId),
                    checkRequired("accountNumber", accountNumber),
                    checkRequired("routingNumber", routingNumber),
                    addendum,
                    companyDescriptiveDate,
                    companyDiscretionaryData,
                    companyEntryDescription,
                    companyName,
                    creditDebitIndicator,
                    effectiveDate,
                    individualId,
                    individualName,
                    standardEntryClassCode,
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
            routingNumber()
            addendum()
            companyDescriptiveDate()
            companyDiscretionaryData()
            companyEntryDescription()
            companyName()
            creditDebitIndicator().ifPresent { it.validate() }
            effectiveDate()
            individualId()
            individualName()
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
            (if (accountId.asKnown().isPresent) 1 else 0) +
                (if (accountNumber.asKnown().isPresent) 1 else 0) +
                (if (routingNumber.asKnown().isPresent) 1 else 0) +
                (if (addendum.asKnown().isPresent) 1 else 0) +
                (if (companyDescriptiveDate.asKnown().isPresent) 1 else 0) +
                (if (companyDiscretionaryData.asKnown().isPresent) 1 else 0) +
                (if (companyEntryDescription.asKnown().isPresent) 1 else 0) +
                (if (companyName.asKnown().isPresent) 1 else 0) +
                (creditDebitIndicator.asKnown().getOrNull()?.validity() ?: 0) +
                (if (effectiveDate.asKnown().isPresent) 1 else 0) +
                (if (individualId.asKnown().isPresent) 1 else 0) +
                (if (individualName.asKnown().isPresent) 1 else 0) +
                (standardEntryClassCode.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                accountId == other.accountId &&
                accountNumber == other.accountNumber &&
                routingNumber == other.routingNumber &&
                addendum == other.addendum &&
                companyDescriptiveDate == other.companyDescriptiveDate &&
                companyDiscretionaryData == other.companyDiscretionaryData &&
                companyEntryDescription == other.companyEntryDescription &&
                companyName == other.companyName &&
                creditDebitIndicator == other.creditDebitIndicator &&
                effectiveDate == other.effectiveDate &&
                individualId == other.individualId &&
                individualName == other.individualName &&
                standardEntryClassCode == other.standardEntryClassCode &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                accountId,
                accountNumber,
                routingNumber,
                addendum,
                companyDescriptiveDate,
                companyDiscretionaryData,
                companyEntryDescription,
                companyName,
                creditDebitIndicator,
                effectiveDate,
                individualId,
                individualName,
                standardEntryClassCode,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{accountId=$accountId, accountNumber=$accountNumber, routingNumber=$routingNumber, addendum=$addendum, companyDescriptiveDate=$companyDescriptiveDate, companyDiscretionaryData=$companyDiscretionaryData, companyEntryDescription=$companyEntryDescription, companyName=$companyName, creditDebitIndicator=$creditDebitIndicator, effectiveDate=$effectiveDate, individualId=$individualId, individualName=$individualName, standardEntryClassCode=$standardEntryClassCode, additionalProperties=$additionalProperties}"
    }

    /** Whether the Prenotification is for a future debit or credit. */
    class CreditDebitIndicator
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

            /** The Prenotification is for an anticipated credit. */
            @JvmField val CREDIT = of("credit")

            /** The Prenotification is for an anticipated debit. */
            @JvmField val DEBIT = of("debit")

            @JvmStatic fun of(value: String) = CreditDebitIndicator(JsonField.of(value))
        }

        /** An enum containing [CreditDebitIndicator]'s known values. */
        enum class Known {
            /** The Prenotification is for an anticipated credit. */
            CREDIT,
            /** The Prenotification is for an anticipated debit. */
            DEBIT,
        }

        /**
         * An enum containing [CreditDebitIndicator]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [CreditDebitIndicator] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            /** The Prenotification is for an anticipated credit. */
            CREDIT,
            /** The Prenotification is for an anticipated debit. */
            DEBIT,
            /**
             * An enum member indicating that [CreditDebitIndicator] was instantiated with an
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
                CREDIT -> Value.CREDIT
                DEBIT -> Value.DEBIT
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
                CREDIT -> Known.CREDIT
                DEBIT -> Known.DEBIT
                else -> throw IncreaseInvalidDataException("Unknown CreditDebitIndicator: $value")
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

        fun validate(): CreditDebitIndicator = apply {
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

            return other is CreditDebitIndicator && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * The [Standard Entry Class (SEC) code](/documentation/ach-standard-entry-class-codes) to use
     * for the ACH Prenotification.
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AchPrenotificationCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "AchPrenotificationCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
