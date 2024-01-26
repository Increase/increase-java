// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.toUnmodifiable
import com.increase.api.errors.IncreaseInvalidDataException
import com.increase.api.models.*
import java.time.LocalDate
import java.util.Objects
import java.util.Optional

class AchTransferCreateParams
constructor(
    private val accountId: String,
    private val amount: Long,
    private val statementDescriptor: String,
    private val accountNumber: String?,
    private val addendum: String?,
    private val companyDescriptiveDate: String?,
    private val companyDiscretionaryData: String?,
    private val companyEntryDescription: String?,
    private val companyName: String?,
    private val effectiveDate: LocalDate?,
    private val externalAccountId: String?,
    private val funding: Funding?,
    private val individualId: String?,
    private val individualName: String?,
    private val requireApproval: Boolean?,
    private val routingNumber: String?,
    private val standardEntryClassCode: StandardEntryClassCode?,
    private val uniqueIdentifier: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun accountId(): String = accountId

    fun amount(): Long = amount

    fun statementDescriptor(): String = statementDescriptor

    fun accountNumber(): Optional<String> = Optional.ofNullable(accountNumber)

    fun addendum(): Optional<String> = Optional.ofNullable(addendum)

    fun companyDescriptiveDate(): Optional<String> = Optional.ofNullable(companyDescriptiveDate)

    fun companyDiscretionaryData(): Optional<String> = Optional.ofNullable(companyDiscretionaryData)

    fun companyEntryDescription(): Optional<String> = Optional.ofNullable(companyEntryDescription)

    fun companyName(): Optional<String> = Optional.ofNullable(companyName)

    fun effectiveDate(): Optional<LocalDate> = Optional.ofNullable(effectiveDate)

    fun externalAccountId(): Optional<String> = Optional.ofNullable(externalAccountId)

    fun funding(): Optional<Funding> = Optional.ofNullable(funding)

    fun individualId(): Optional<String> = Optional.ofNullable(individualId)

    fun individualName(): Optional<String> = Optional.ofNullable(individualName)

    fun requireApproval(): Optional<Boolean> = Optional.ofNullable(requireApproval)

    fun routingNumber(): Optional<String> = Optional.ofNullable(routingNumber)

    fun standardEntryClassCode(): Optional<StandardEntryClassCode> =
        Optional.ofNullable(standardEntryClassCode)

    fun uniqueIdentifier(): Optional<String> = Optional.ofNullable(uniqueIdentifier)

    @JvmSynthetic
    internal fun getBody(): AchTransferCreateBody {
        return AchTransferCreateBody(
            accountId,
            amount,
            statementDescriptor,
            accountNumber,
            addendum,
            companyDescriptiveDate,
            companyDiscretionaryData,
            companyEntryDescription,
            companyName,
            effectiveDate,
            externalAccountId,
            funding,
            individualId,
            individualName,
            requireApproval,
            routingNumber,
            standardEntryClassCode,
            uniqueIdentifier,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = AchTransferCreateBody.Builder::class)
    @NoAutoDetect
    class AchTransferCreateBody
    internal constructor(
        private val accountId: String?,
        private val amount: Long?,
        private val statementDescriptor: String?,
        private val accountNumber: String?,
        private val addendum: String?,
        private val companyDescriptiveDate: String?,
        private val companyDiscretionaryData: String?,
        private val companyEntryDescription: String?,
        private val companyName: String?,
        private val effectiveDate: LocalDate?,
        private val externalAccountId: String?,
        private val funding: Funding?,
        private val individualId: String?,
        private val individualName: String?,
        private val requireApproval: Boolean?,
        private val routingNumber: String?,
        private val standardEntryClassCode: StandardEntryClassCode?,
        private val uniqueIdentifier: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** The Increase identifier for the account that will send the transfer. */
        @JsonProperty("account_id") fun accountId(): String? = accountId

        /**
         * The transfer amount in cents. A positive amount originates a credit transfer pushing
         * funds to the receiving account. A negative amount originates a debit transfer pulling
         * funds from the receiving account.
         */
        @JsonProperty("amount") fun amount(): Long? = amount

        /**
         * A description you choose to give the transfer. This will be saved with the transfer
         * details, displayed in the dashboard, and returned by the API. If `individual_name` and
         * `company_name` are not explicitly set by this API, the `statement_descriptor` will be
         * sent in those fields to the receiving bank to help the customer recognize the transfer.
         * You are highly encouraged to pass `individual_name` and `company_name` instead of relying
         * on this fallback.
         */
        @JsonProperty("statement_descriptor")
        fun statementDescriptor(): String? = statementDescriptor

        /** The account number for the destination account. */
        @JsonProperty("account_number") fun accountNumber(): String? = accountNumber

        /**
         * Additional information that will be sent to the recipient. This is included in the
         * transfer data sent to the receiving bank.
         */
        @JsonProperty("addendum") fun addendum(): String? = addendum

        /**
         * The description of the date of the transfer, usually in the format `YYMMDD`. This is
         * included in the transfer data sent to the receiving bank.
         */
        @JsonProperty("company_descriptive_date")
        fun companyDescriptiveDate(): String? = companyDescriptiveDate

        /**
         * The data you choose to associate with the transfer. This is included in the transfer data
         * sent to the receiving bank.
         */
        @JsonProperty("company_discretionary_data")
        fun companyDiscretionaryData(): String? = companyDiscretionaryData

        /**
         * A description of the transfer. This is included in the transfer data sent to the
         * receiving bank.
         */
        @JsonProperty("company_entry_description")
        fun companyEntryDescription(): String? = companyEntryDescription

        /**
         * The name by which the recipient knows you. This is included in the transfer data sent to
         * the receiving bank.
         */
        @JsonProperty("company_name") fun companyName(): String? = companyName

        /**
         * The transfer effective date in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format.
         */
        @JsonProperty("effective_date") fun effectiveDate(): LocalDate? = effectiveDate

        /**
         * The ID of an External Account to initiate a transfer to. If this parameter is provided,
         * `account_number`, `routing_number`, and `funding` must be absent.
         */
        @JsonProperty("external_account_id") fun externalAccountId(): String? = externalAccountId

        /** The type of the account to which the transfer will be sent. */
        @JsonProperty("funding") fun funding(): Funding? = funding

        /** Your identifier for the transfer recipient. */
        @JsonProperty("individual_id") fun individualId(): String? = individualId

        /**
         * The name of the transfer recipient. This value is informational and not verified by the
         * recipient's bank.
         */
        @JsonProperty("individual_name") fun individualName(): String? = individualName

        /** Whether the transfer requires explicit approval via the dashboard or API. */
        @JsonProperty("require_approval") fun requireApproval(): Boolean? = requireApproval

        /**
         * The American Bankers' Association (ABA) Routing Transit Number (RTN) for the destination
         * account.
         */
        @JsonProperty("routing_number") fun routingNumber(): String? = routingNumber

        /** The Standard Entry Class (SEC) code to use for the transfer. */
        @JsonProperty("standard_entry_class_code")
        fun standardEntryClassCode(): StandardEntryClassCode? = standardEntryClassCode

        /**
         * A unique identifier you choose for the object. Reusing this identifier for another object
         * will result in an error. You can query for the object associated with this identifier
         * using the List endpoint.
         */
        @JsonProperty("unique_identifier") fun uniqueIdentifier(): String? = uniqueIdentifier

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AchTransferCreateBody &&
                this.accountId == other.accountId &&
                this.amount == other.amount &&
                this.statementDescriptor == other.statementDescriptor &&
                this.accountNumber == other.accountNumber &&
                this.addendum == other.addendum &&
                this.companyDescriptiveDate == other.companyDescriptiveDate &&
                this.companyDiscretionaryData == other.companyDiscretionaryData &&
                this.companyEntryDescription == other.companyEntryDescription &&
                this.companyName == other.companyName &&
                this.effectiveDate == other.effectiveDate &&
                this.externalAccountId == other.externalAccountId &&
                this.funding == other.funding &&
                this.individualId == other.individualId &&
                this.individualName == other.individualName &&
                this.requireApproval == other.requireApproval &&
                this.routingNumber == other.routingNumber &&
                this.standardEntryClassCode == other.standardEntryClassCode &&
                this.uniqueIdentifier == other.uniqueIdentifier &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        accountId,
                        amount,
                        statementDescriptor,
                        accountNumber,
                        addendum,
                        companyDescriptiveDate,
                        companyDiscretionaryData,
                        companyEntryDescription,
                        companyName,
                        effectiveDate,
                        externalAccountId,
                        funding,
                        individualId,
                        individualName,
                        requireApproval,
                        routingNumber,
                        standardEntryClassCode,
                        uniqueIdentifier,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "AchTransferCreateBody{accountId=$accountId, amount=$amount, statementDescriptor=$statementDescriptor, accountNumber=$accountNumber, addendum=$addendum, companyDescriptiveDate=$companyDescriptiveDate, companyDiscretionaryData=$companyDiscretionaryData, companyEntryDescription=$companyEntryDescription, companyName=$companyName, effectiveDate=$effectiveDate, externalAccountId=$externalAccountId, funding=$funding, individualId=$individualId, individualName=$individualName, requireApproval=$requireApproval, routingNumber=$routingNumber, standardEntryClassCode=$standardEntryClassCode, uniqueIdentifier=$uniqueIdentifier, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var accountId: String? = null
            private var amount: Long? = null
            private var statementDescriptor: String? = null
            private var accountNumber: String? = null
            private var addendum: String? = null
            private var companyDescriptiveDate: String? = null
            private var companyDiscretionaryData: String? = null
            private var companyEntryDescription: String? = null
            private var companyName: String? = null
            private var effectiveDate: LocalDate? = null
            private var externalAccountId: String? = null
            private var funding: Funding? = null
            private var individualId: String? = null
            private var individualName: String? = null
            private var requireApproval: Boolean? = null
            private var routingNumber: String? = null
            private var standardEntryClassCode: StandardEntryClassCode? = null
            private var uniqueIdentifier: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(achTransferCreateBody: AchTransferCreateBody) = apply {
                this.accountId = achTransferCreateBody.accountId
                this.amount = achTransferCreateBody.amount
                this.statementDescriptor = achTransferCreateBody.statementDescriptor
                this.accountNumber = achTransferCreateBody.accountNumber
                this.addendum = achTransferCreateBody.addendum
                this.companyDescriptiveDate = achTransferCreateBody.companyDescriptiveDate
                this.companyDiscretionaryData = achTransferCreateBody.companyDiscretionaryData
                this.companyEntryDescription = achTransferCreateBody.companyEntryDescription
                this.companyName = achTransferCreateBody.companyName
                this.effectiveDate = achTransferCreateBody.effectiveDate
                this.externalAccountId = achTransferCreateBody.externalAccountId
                this.funding = achTransferCreateBody.funding
                this.individualId = achTransferCreateBody.individualId
                this.individualName = achTransferCreateBody.individualName
                this.requireApproval = achTransferCreateBody.requireApproval
                this.routingNumber = achTransferCreateBody.routingNumber
                this.standardEntryClassCode = achTransferCreateBody.standardEntryClassCode
                this.uniqueIdentifier = achTransferCreateBody.uniqueIdentifier
                additionalProperties(achTransferCreateBody.additionalProperties)
            }

            /** The Increase identifier for the account that will send the transfer. */
            @JsonProperty("account_id")
            fun accountId(accountId: String) = apply { this.accountId = accountId }

            /**
             * The transfer amount in cents. A positive amount originates a credit transfer pushing
             * funds to the receiving account. A negative amount originates a debit transfer pulling
             * funds from the receiving account.
             */
            @JsonProperty("amount") fun amount(amount: Long) = apply { this.amount = amount }

            /**
             * A description you choose to give the transfer. This will be saved with the transfer
             * details, displayed in the dashboard, and returned by the API. If `individual_name`
             * and `company_name` are not explicitly set by this API, the `statement_descriptor`
             * will be sent in those fields to the receiving bank to help the customer recognize the
             * transfer. You are highly encouraged to pass `individual_name` and `company_name`
             * instead of relying on this fallback.
             */
            @JsonProperty("statement_descriptor")
            fun statementDescriptor(statementDescriptor: String) = apply {
                this.statementDescriptor = statementDescriptor
            }

            /** The account number for the destination account. */
            @JsonProperty("account_number")
            fun accountNumber(accountNumber: String) = apply { this.accountNumber = accountNumber }

            /**
             * Additional information that will be sent to the recipient. This is included in the
             * transfer data sent to the receiving bank.
             */
            @JsonProperty("addendum")
            fun addendum(addendum: String) = apply { this.addendum = addendum }

            /**
             * The description of the date of the transfer, usually in the format `YYMMDD`. This is
             * included in the transfer data sent to the receiving bank.
             */
            @JsonProperty("company_descriptive_date")
            fun companyDescriptiveDate(companyDescriptiveDate: String) = apply {
                this.companyDescriptiveDate = companyDescriptiveDate
            }

            /**
             * The data you choose to associate with the transfer. This is included in the transfer
             * data sent to the receiving bank.
             */
            @JsonProperty("company_discretionary_data")
            fun companyDiscretionaryData(companyDiscretionaryData: String) = apply {
                this.companyDiscretionaryData = companyDiscretionaryData
            }

            /**
             * A description of the transfer. This is included in the transfer data sent to the
             * receiving bank.
             */
            @JsonProperty("company_entry_description")
            fun companyEntryDescription(companyEntryDescription: String) = apply {
                this.companyEntryDescription = companyEntryDescription
            }

            /**
             * The name by which the recipient knows you. This is included in the transfer data sent
             * to the receiving bank.
             */
            @JsonProperty("company_name")
            fun companyName(companyName: String) = apply { this.companyName = companyName }

            /**
             * The transfer effective date in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * format.
             */
            @JsonProperty("effective_date")
            fun effectiveDate(effectiveDate: LocalDate) = apply {
                this.effectiveDate = effectiveDate
            }

            /**
             * The ID of an External Account to initiate a transfer to. If this parameter is
             * provided, `account_number`, `routing_number`, and `funding` must be absent.
             */
            @JsonProperty("external_account_id")
            fun externalAccountId(externalAccountId: String) = apply {
                this.externalAccountId = externalAccountId
            }

            /** The type of the account to which the transfer will be sent. */
            @JsonProperty("funding")
            fun funding(funding: Funding) = apply { this.funding = funding }

            /** Your identifier for the transfer recipient. */
            @JsonProperty("individual_id")
            fun individualId(individualId: String) = apply { this.individualId = individualId }

            /**
             * The name of the transfer recipient. This value is informational and not verified by
             * the recipient's bank.
             */
            @JsonProperty("individual_name")
            fun individualName(individualName: String) = apply {
                this.individualName = individualName
            }

            /** Whether the transfer requires explicit approval via the dashboard or API. */
            @JsonProperty("require_approval")
            fun requireApproval(requireApproval: Boolean) = apply {
                this.requireApproval = requireApproval
            }

            /**
             * The American Bankers' Association (ABA) Routing Transit Number (RTN) for the
             * destination account.
             */
            @JsonProperty("routing_number")
            fun routingNumber(routingNumber: String) = apply { this.routingNumber = routingNumber }

            /** The Standard Entry Class (SEC) code to use for the transfer. */
            @JsonProperty("standard_entry_class_code")
            fun standardEntryClassCode(standardEntryClassCode: StandardEntryClassCode) = apply {
                this.standardEntryClassCode = standardEntryClassCode
            }

            /**
             * A unique identifier you choose for the object. Reusing this identifier for another
             * object will result in an error. You can query for the object associated with this
             * identifier using the List endpoint.
             */
            @JsonProperty("unique_identifier")
            fun uniqueIdentifier(uniqueIdentifier: String) = apply {
                this.uniqueIdentifier = uniqueIdentifier
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): AchTransferCreateBody =
                AchTransferCreateBody(
                    checkNotNull(accountId) { "`accountId` is required but was not set" },
                    checkNotNull(amount) { "`amount` is required but was not set" },
                    checkNotNull(statementDescriptor) {
                        "`statementDescriptor` is required but was not set"
                    },
                    accountNumber,
                    addendum,
                    companyDescriptiveDate,
                    companyDiscretionaryData,
                    companyEntryDescription,
                    companyName,
                    effectiveDate,
                    externalAccountId,
                    funding,
                    individualId,
                    individualName,
                    requireApproval,
                    routingNumber,
                    standardEntryClassCode,
                    uniqueIdentifier,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AchTransferCreateParams &&
            this.accountId == other.accountId &&
            this.amount == other.amount &&
            this.statementDescriptor == other.statementDescriptor &&
            this.accountNumber == other.accountNumber &&
            this.addendum == other.addendum &&
            this.companyDescriptiveDate == other.companyDescriptiveDate &&
            this.companyDiscretionaryData == other.companyDiscretionaryData &&
            this.companyEntryDescription == other.companyEntryDescription &&
            this.companyName == other.companyName &&
            this.effectiveDate == other.effectiveDate &&
            this.externalAccountId == other.externalAccountId &&
            this.funding == other.funding &&
            this.individualId == other.individualId &&
            this.individualName == other.individualName &&
            this.requireApproval == other.requireApproval &&
            this.routingNumber == other.routingNumber &&
            this.standardEntryClassCode == other.standardEntryClassCode &&
            this.uniqueIdentifier == other.uniqueIdentifier &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            accountId,
            amount,
            statementDescriptor,
            accountNumber,
            addendum,
            companyDescriptiveDate,
            companyDiscretionaryData,
            companyEntryDescription,
            companyName,
            effectiveDate,
            externalAccountId,
            funding,
            individualId,
            individualName,
            requireApproval,
            routingNumber,
            standardEntryClassCode,
            uniqueIdentifier,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "AchTransferCreateParams{accountId=$accountId, amount=$amount, statementDescriptor=$statementDescriptor, accountNumber=$accountNumber, addendum=$addendum, companyDescriptiveDate=$companyDescriptiveDate, companyDiscretionaryData=$companyDiscretionaryData, companyEntryDescription=$companyEntryDescription, companyName=$companyName, effectiveDate=$effectiveDate, externalAccountId=$externalAccountId, funding=$funding, individualId=$individualId, individualName=$individualName, requireApproval=$requireApproval, routingNumber=$routingNumber, standardEntryClassCode=$standardEntryClassCode, uniqueIdentifier=$uniqueIdentifier, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var accountId: String? = null
        private var amount: Long? = null
        private var statementDescriptor: String? = null
        private var accountNumber: String? = null
        private var addendum: String? = null
        private var companyDescriptiveDate: String? = null
        private var companyDiscretionaryData: String? = null
        private var companyEntryDescription: String? = null
        private var companyName: String? = null
        private var effectiveDate: LocalDate? = null
        private var externalAccountId: String? = null
        private var funding: Funding? = null
        private var individualId: String? = null
        private var individualName: String? = null
        private var requireApproval: Boolean? = null
        private var routingNumber: String? = null
        private var standardEntryClassCode: StandardEntryClassCode? = null
        private var uniqueIdentifier: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(achTransferCreateParams: AchTransferCreateParams) = apply {
            this.accountId = achTransferCreateParams.accountId
            this.amount = achTransferCreateParams.amount
            this.statementDescriptor = achTransferCreateParams.statementDescriptor
            this.accountNumber = achTransferCreateParams.accountNumber
            this.addendum = achTransferCreateParams.addendum
            this.companyDescriptiveDate = achTransferCreateParams.companyDescriptiveDate
            this.companyDiscretionaryData = achTransferCreateParams.companyDiscretionaryData
            this.companyEntryDescription = achTransferCreateParams.companyEntryDescription
            this.companyName = achTransferCreateParams.companyName
            this.effectiveDate = achTransferCreateParams.effectiveDate
            this.externalAccountId = achTransferCreateParams.externalAccountId
            this.funding = achTransferCreateParams.funding
            this.individualId = achTransferCreateParams.individualId
            this.individualName = achTransferCreateParams.individualName
            this.requireApproval = achTransferCreateParams.requireApproval
            this.routingNumber = achTransferCreateParams.routingNumber
            this.standardEntryClassCode = achTransferCreateParams.standardEntryClassCode
            this.uniqueIdentifier = achTransferCreateParams.uniqueIdentifier
            additionalQueryParams(achTransferCreateParams.additionalQueryParams)
            additionalHeaders(achTransferCreateParams.additionalHeaders)
            additionalBodyProperties(achTransferCreateParams.additionalBodyProperties)
        }

        /** The Increase identifier for the account that will send the transfer. */
        fun accountId(accountId: String) = apply { this.accountId = accountId }

        /**
         * The transfer amount in cents. A positive amount originates a credit transfer pushing
         * funds to the receiving account. A negative amount originates a debit transfer pulling
         * funds from the receiving account.
         */
        fun amount(amount: Long) = apply { this.amount = amount }

        /**
         * A description you choose to give the transfer. This will be saved with the transfer
         * details, displayed in the dashboard, and returned by the API. If `individual_name` and
         * `company_name` are not explicitly set by this API, the `statement_descriptor` will be
         * sent in those fields to the receiving bank to help the customer recognize the transfer.
         * You are highly encouraged to pass `individual_name` and `company_name` instead of relying
         * on this fallback.
         */
        fun statementDescriptor(statementDescriptor: String) = apply {
            this.statementDescriptor = statementDescriptor
        }

        /** The account number for the destination account. */
        fun accountNumber(accountNumber: String) = apply { this.accountNumber = accountNumber }

        /**
         * Additional information that will be sent to the recipient. This is included in the
         * transfer data sent to the receiving bank.
         */
        fun addendum(addendum: String) = apply { this.addendum = addendum }

        /**
         * The description of the date of the transfer, usually in the format `YYMMDD`. This is
         * included in the transfer data sent to the receiving bank.
         */
        fun companyDescriptiveDate(companyDescriptiveDate: String) = apply {
            this.companyDescriptiveDate = companyDescriptiveDate
        }

        /**
         * The data you choose to associate with the transfer. This is included in the transfer data
         * sent to the receiving bank.
         */
        fun companyDiscretionaryData(companyDiscretionaryData: String) = apply {
            this.companyDiscretionaryData = companyDiscretionaryData
        }

        /**
         * A description of the transfer. This is included in the transfer data sent to the
         * receiving bank.
         */
        fun companyEntryDescription(companyEntryDescription: String) = apply {
            this.companyEntryDescription = companyEntryDescription
        }

        /**
         * The name by which the recipient knows you. This is included in the transfer data sent to
         * the receiving bank.
         */
        fun companyName(companyName: String) = apply { this.companyName = companyName }

        /**
         * The transfer effective date in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format.
         */
        fun effectiveDate(effectiveDate: LocalDate) = apply { this.effectiveDate = effectiveDate }

        /**
         * The ID of an External Account to initiate a transfer to. If this parameter is provided,
         * `account_number`, `routing_number`, and `funding` must be absent.
         */
        fun externalAccountId(externalAccountId: String) = apply {
            this.externalAccountId = externalAccountId
        }

        /** The type of the account to which the transfer will be sent. */
        fun funding(funding: Funding) = apply { this.funding = funding }

        /** Your identifier for the transfer recipient. */
        fun individualId(individualId: String) = apply { this.individualId = individualId }

        /**
         * The name of the transfer recipient. This value is informational and not verified by the
         * recipient's bank.
         */
        fun individualName(individualName: String) = apply { this.individualName = individualName }

        /** Whether the transfer requires explicit approval via the dashboard or API. */
        fun requireApproval(requireApproval: Boolean) = apply {
            this.requireApproval = requireApproval
        }

        /**
         * The American Bankers' Association (ABA) Routing Transit Number (RTN) for the destination
         * account.
         */
        fun routingNumber(routingNumber: String) = apply { this.routingNumber = routingNumber }

        /** The Standard Entry Class (SEC) code to use for the transfer. */
        fun standardEntryClassCode(standardEntryClassCode: StandardEntryClassCode) = apply {
            this.standardEntryClassCode = standardEntryClassCode
        }

        /**
         * A unique identifier you choose for the object. Reusing this identifier for another object
         * will result in an error. You can query for the object associated with this identifier
         * using the List endpoint.
         */
        fun uniqueIdentifier(uniqueIdentifier: String) = apply {
            this.uniqueIdentifier = uniqueIdentifier
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): AchTransferCreateParams =
            AchTransferCreateParams(
                checkNotNull(accountId) { "`accountId` is required but was not set" },
                checkNotNull(amount) { "`amount` is required but was not set" },
                checkNotNull(statementDescriptor) {
                    "`statementDescriptor` is required but was not set"
                },
                accountNumber,
                addendum,
                companyDescriptiveDate,
                companyDiscretionaryData,
                companyEntryDescription,
                companyName,
                effectiveDate,
                externalAccountId,
                funding,
                individualId,
                individualName,
                requireApproval,
                routingNumber,
                standardEntryClassCode,
                uniqueIdentifier,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    class Funding
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Funding && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val CHECKING = Funding(JsonField.of("checking"))

            @JvmField val SAVINGS = Funding(JsonField.of("savings"))

            @JvmStatic fun of(value: String) = Funding(JsonField.of(value))
        }

        enum class Known {
            CHECKING,
            SAVINGS,
        }

        enum class Value {
            CHECKING,
            SAVINGS,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                CHECKING -> Value.CHECKING
                SAVINGS -> Value.SAVINGS
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                CHECKING -> Known.CHECKING
                SAVINGS -> Known.SAVINGS
                else -> throw IncreaseInvalidDataException("Unknown Funding: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    class StandardEntryClassCode
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is StandardEntryClassCode && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField
            val CORPORATE_CREDIT_OR_DEBIT =
                StandardEntryClassCode(JsonField.of("corporate_credit_or_debit"))

            @JvmField
            val PREARRANGED_PAYMENTS_AND_DEPOSIT =
                StandardEntryClassCode(JsonField.of("prearranged_payments_and_deposit"))

            @JvmField
            val INTERNET_INITIATED = StandardEntryClassCode(JsonField.of("internet_initiated"))

            @JvmStatic fun of(value: String) = StandardEntryClassCode(JsonField.of(value))
        }

        enum class Known {
            CORPORATE_CREDIT_OR_DEBIT,
            PREARRANGED_PAYMENTS_AND_DEPOSIT,
            INTERNET_INITIATED,
        }

        enum class Value {
            CORPORATE_CREDIT_OR_DEBIT,
            PREARRANGED_PAYMENTS_AND_DEPOSIT,
            INTERNET_INITIATED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                CORPORATE_CREDIT_OR_DEBIT -> Value.CORPORATE_CREDIT_OR_DEBIT
                PREARRANGED_PAYMENTS_AND_DEPOSIT -> Value.PREARRANGED_PAYMENTS_AND_DEPOSIT
                INTERNET_INITIATED -> Value.INTERNET_INITIATED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                CORPORATE_CREDIT_OR_DEBIT -> Known.CORPORATE_CREDIT_OR_DEBIT
                PREARRANGED_PAYMENTS_AND_DEPOSIT -> Known.PREARRANGED_PAYMENTS_AND_DEPOSIT
                INTERNET_INITIATED -> Known.INTERNET_INITIATED
                else -> throw IncreaseInvalidDataException("Unknown StandardEntryClassCode: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
