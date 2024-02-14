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
    private val addenda: Addenda?,
    private val companyDescriptiveDate: String?,
    private val companyDiscretionaryData: String?,
    private val companyEntryDescription: String?,
    private val companyName: String?,
    private val destinationAccountHolder: DestinationAccountHolder?,
    private val effectiveDate: LocalDate?,
    private val externalAccountId: String?,
    private val funding: Funding?,
    private val individualId: String?,
    private val individualName: String?,
    private val requireApproval: Boolean?,
    private val routingNumber: String?,
    private val standardEntryClassCode: StandardEntryClassCode?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun accountId(): String = accountId

    fun amount(): Long = amount

    fun statementDescriptor(): String = statementDescriptor

    fun accountNumber(): Optional<String> = Optional.ofNullable(accountNumber)

    fun addenda(): Optional<Addenda> = Optional.ofNullable(addenda)

    fun companyDescriptiveDate(): Optional<String> = Optional.ofNullable(companyDescriptiveDate)

    fun companyDiscretionaryData(): Optional<String> = Optional.ofNullable(companyDiscretionaryData)

    fun companyEntryDescription(): Optional<String> = Optional.ofNullable(companyEntryDescription)

    fun companyName(): Optional<String> = Optional.ofNullable(companyName)

    fun destinationAccountHolder(): Optional<DestinationAccountHolder> =
        Optional.ofNullable(destinationAccountHolder)

    fun effectiveDate(): Optional<LocalDate> = Optional.ofNullable(effectiveDate)

    fun externalAccountId(): Optional<String> = Optional.ofNullable(externalAccountId)

    fun funding(): Optional<Funding> = Optional.ofNullable(funding)

    fun individualId(): Optional<String> = Optional.ofNullable(individualId)

    fun individualName(): Optional<String> = Optional.ofNullable(individualName)

    fun requireApproval(): Optional<Boolean> = Optional.ofNullable(requireApproval)

    fun routingNumber(): Optional<String> = Optional.ofNullable(routingNumber)

    fun standardEntryClassCode(): Optional<StandardEntryClassCode> =
        Optional.ofNullable(standardEntryClassCode)

    @JvmSynthetic
    internal fun getBody(): AchTransferCreateBody {
        return AchTransferCreateBody(
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
            effectiveDate,
            externalAccountId,
            funding,
            individualId,
            individualName,
            requireApproval,
            routingNumber,
            standardEntryClassCode,
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
        private val addenda: Addenda?,
        private val companyDescriptiveDate: String?,
        private val companyDiscretionaryData: String?,
        private val companyEntryDescription: String?,
        private val companyName: String?,
        private val destinationAccountHolder: DestinationAccountHolder?,
        private val effectiveDate: LocalDate?,
        private val externalAccountId: String?,
        private val funding: Funding?,
        private val individualId: String?,
        private val individualName: String?,
        private val requireApproval: Boolean?,
        private val routingNumber: String?,
        private val standardEntryClassCode: StandardEntryClassCode?,
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
        @JsonProperty("addenda") fun addenda(): Addenda? = addenda

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

        /** The type of entity that owns the account to which the ACH Transfer is being sent. */
        @JsonProperty("destination_account_holder")
        fun destinationAccountHolder(): DestinationAccountHolder? = destinationAccountHolder

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
                this.addenda == other.addenda &&
                this.companyDescriptiveDate == other.companyDescriptiveDate &&
                this.companyDiscretionaryData == other.companyDiscretionaryData &&
                this.companyEntryDescription == other.companyEntryDescription &&
                this.companyName == other.companyName &&
                this.destinationAccountHolder == other.destinationAccountHolder &&
                this.effectiveDate == other.effectiveDate &&
                this.externalAccountId == other.externalAccountId &&
                this.funding == other.funding &&
                this.individualId == other.individualId &&
                this.individualName == other.individualName &&
                this.requireApproval == other.requireApproval &&
                this.routingNumber == other.routingNumber &&
                this.standardEntryClassCode == other.standardEntryClassCode &&
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
                        addenda,
                        companyDescriptiveDate,
                        companyDiscretionaryData,
                        companyEntryDescription,
                        companyName,
                        destinationAccountHolder,
                        effectiveDate,
                        externalAccountId,
                        funding,
                        individualId,
                        individualName,
                        requireApproval,
                        routingNumber,
                        standardEntryClassCode,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "AchTransferCreateBody{accountId=$accountId, amount=$amount, statementDescriptor=$statementDescriptor, accountNumber=$accountNumber, addenda=$addenda, companyDescriptiveDate=$companyDescriptiveDate, companyDiscretionaryData=$companyDiscretionaryData, companyEntryDescription=$companyEntryDescription, companyName=$companyName, destinationAccountHolder=$destinationAccountHolder, effectiveDate=$effectiveDate, externalAccountId=$externalAccountId, funding=$funding, individualId=$individualId, individualName=$individualName, requireApproval=$requireApproval, routingNumber=$routingNumber, standardEntryClassCode=$standardEntryClassCode, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var accountId: String? = null
            private var amount: Long? = null
            private var statementDescriptor: String? = null
            private var accountNumber: String? = null
            private var addenda: Addenda? = null
            private var companyDescriptiveDate: String? = null
            private var companyDiscretionaryData: String? = null
            private var companyEntryDescription: String? = null
            private var companyName: String? = null
            private var destinationAccountHolder: DestinationAccountHolder? = null
            private var effectiveDate: LocalDate? = null
            private var externalAccountId: String? = null
            private var funding: Funding? = null
            private var individualId: String? = null
            private var individualName: String? = null
            private var requireApproval: Boolean? = null
            private var routingNumber: String? = null
            private var standardEntryClassCode: StandardEntryClassCode? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(achTransferCreateBody: AchTransferCreateBody) = apply {
                this.accountId = achTransferCreateBody.accountId
                this.amount = achTransferCreateBody.amount
                this.statementDescriptor = achTransferCreateBody.statementDescriptor
                this.accountNumber = achTransferCreateBody.accountNumber
                this.addenda = achTransferCreateBody.addenda
                this.companyDescriptiveDate = achTransferCreateBody.companyDescriptiveDate
                this.companyDiscretionaryData = achTransferCreateBody.companyDiscretionaryData
                this.companyEntryDescription = achTransferCreateBody.companyEntryDescription
                this.companyName = achTransferCreateBody.companyName
                this.destinationAccountHolder = achTransferCreateBody.destinationAccountHolder
                this.effectiveDate = achTransferCreateBody.effectiveDate
                this.externalAccountId = achTransferCreateBody.externalAccountId
                this.funding = achTransferCreateBody.funding
                this.individualId = achTransferCreateBody.individualId
                this.individualName = achTransferCreateBody.individualName
                this.requireApproval = achTransferCreateBody.requireApproval
                this.routingNumber = achTransferCreateBody.routingNumber
                this.standardEntryClassCode = achTransferCreateBody.standardEntryClassCode
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
            @JsonProperty("addenda")
            fun addenda(addenda: Addenda) = apply { this.addenda = addenda }

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

            /** The type of entity that owns the account to which the ACH Transfer is being sent. */
            @JsonProperty("destination_account_holder")
            fun destinationAccountHolder(destinationAccountHolder: DestinationAccountHolder) =
                apply {
                    this.destinationAccountHolder = destinationAccountHolder
                }

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
                    addenda,
                    companyDescriptiveDate,
                    companyDiscretionaryData,
                    companyEntryDescription,
                    companyName,
                    destinationAccountHolder,
                    effectiveDate,
                    externalAccountId,
                    funding,
                    individualId,
                    individualName,
                    requireApproval,
                    routingNumber,
                    standardEntryClassCode,
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
            this.addenda == other.addenda &&
            this.companyDescriptiveDate == other.companyDescriptiveDate &&
            this.companyDiscretionaryData == other.companyDiscretionaryData &&
            this.companyEntryDescription == other.companyEntryDescription &&
            this.companyName == other.companyName &&
            this.destinationAccountHolder == other.destinationAccountHolder &&
            this.effectiveDate == other.effectiveDate &&
            this.externalAccountId == other.externalAccountId &&
            this.funding == other.funding &&
            this.individualId == other.individualId &&
            this.individualName == other.individualName &&
            this.requireApproval == other.requireApproval &&
            this.routingNumber == other.routingNumber &&
            this.standardEntryClassCode == other.standardEntryClassCode &&
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
            addenda,
            companyDescriptiveDate,
            companyDiscretionaryData,
            companyEntryDescription,
            companyName,
            destinationAccountHolder,
            effectiveDate,
            externalAccountId,
            funding,
            individualId,
            individualName,
            requireApproval,
            routingNumber,
            standardEntryClassCode,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "AchTransferCreateParams{accountId=$accountId, amount=$amount, statementDescriptor=$statementDescriptor, accountNumber=$accountNumber, addenda=$addenda, companyDescriptiveDate=$companyDescriptiveDate, companyDiscretionaryData=$companyDiscretionaryData, companyEntryDescription=$companyEntryDescription, companyName=$companyName, destinationAccountHolder=$destinationAccountHolder, effectiveDate=$effectiveDate, externalAccountId=$externalAccountId, funding=$funding, individualId=$individualId, individualName=$individualName, requireApproval=$requireApproval, routingNumber=$routingNumber, standardEntryClassCode=$standardEntryClassCode, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

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
        private var addenda: Addenda? = null
        private var companyDescriptiveDate: String? = null
        private var companyDiscretionaryData: String? = null
        private var companyEntryDescription: String? = null
        private var companyName: String? = null
        private var destinationAccountHolder: DestinationAccountHolder? = null
        private var effectiveDate: LocalDate? = null
        private var externalAccountId: String? = null
        private var funding: Funding? = null
        private var individualId: String? = null
        private var individualName: String? = null
        private var requireApproval: Boolean? = null
        private var routingNumber: String? = null
        private var standardEntryClassCode: StandardEntryClassCode? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(achTransferCreateParams: AchTransferCreateParams) = apply {
            this.accountId = achTransferCreateParams.accountId
            this.amount = achTransferCreateParams.amount
            this.statementDescriptor = achTransferCreateParams.statementDescriptor
            this.accountNumber = achTransferCreateParams.accountNumber
            this.addenda = achTransferCreateParams.addenda
            this.companyDescriptiveDate = achTransferCreateParams.companyDescriptiveDate
            this.companyDiscretionaryData = achTransferCreateParams.companyDiscretionaryData
            this.companyEntryDescription = achTransferCreateParams.companyEntryDescription
            this.companyName = achTransferCreateParams.companyName
            this.destinationAccountHolder = achTransferCreateParams.destinationAccountHolder
            this.effectiveDate = achTransferCreateParams.effectiveDate
            this.externalAccountId = achTransferCreateParams.externalAccountId
            this.funding = achTransferCreateParams.funding
            this.individualId = achTransferCreateParams.individualId
            this.individualName = achTransferCreateParams.individualName
            this.requireApproval = achTransferCreateParams.requireApproval
            this.routingNumber = achTransferCreateParams.routingNumber
            this.standardEntryClassCode = achTransferCreateParams.standardEntryClassCode
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
        fun addenda(addenda: Addenda) = apply { this.addenda = addenda }

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

        /** The type of entity that owns the account to which the ACH Transfer is being sent. */
        fun destinationAccountHolder(destinationAccountHolder: DestinationAccountHolder) = apply {
            this.destinationAccountHolder = destinationAccountHolder
        }

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
                addenda,
                companyDescriptiveDate,
                companyDiscretionaryData,
                companyEntryDescription,
                companyName,
                destinationAccountHolder,
                effectiveDate,
                externalAccountId,
                funding,
                individualId,
                individualName,
                requireApproval,
                routingNumber,
                standardEntryClassCode,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    /**
     * Additional information that will be sent to the recipient. This is included in the transfer
     * data sent to the receiving bank.
     */
    @JsonDeserialize(builder = Addenda.Builder::class)
    @NoAutoDetect
    class Addenda
    private constructor(
        private val category: Category?,
        private val freeform: Freeform?,
        private val paymentOrderRemittanceAdvice: PaymentOrderRemittanceAdvice?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** The type of addenda to pass with the transfer. */
        @JsonProperty("category") fun category(): Category? = category

        /** Unstructured `payment_related_information` passed through with the transfer. */
        @JsonProperty("freeform") fun freeform(): Freeform? = freeform

        /**
         * Structured ASC X12 820 remittance advice records. Please reach out to
         * [support@increase.com](mailto:support@increase.com) for more information.
         */
        @JsonProperty("payment_order_remittance_advice")
        fun paymentOrderRemittanceAdvice(): PaymentOrderRemittanceAdvice? =
            paymentOrderRemittanceAdvice

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Addenda &&
                this.category == other.category &&
                this.freeform == other.freeform &&
                this.paymentOrderRemittanceAdvice == other.paymentOrderRemittanceAdvice &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        category,
                        freeform,
                        paymentOrderRemittanceAdvice,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Addenda{category=$category, freeform=$freeform, paymentOrderRemittanceAdvice=$paymentOrderRemittanceAdvice, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var category: Category? = null
            private var freeform: Freeform? = null
            private var paymentOrderRemittanceAdvice: PaymentOrderRemittanceAdvice? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(addenda: Addenda) = apply {
                this.category = addenda.category
                this.freeform = addenda.freeform
                this.paymentOrderRemittanceAdvice = addenda.paymentOrderRemittanceAdvice
                additionalProperties(addenda.additionalProperties)
            }

            /** The type of addenda to pass with the transfer. */
            @JsonProperty("category")
            fun category(category: Category) = apply { this.category = category }

            /** Unstructured `payment_related_information` passed through with the transfer. */
            @JsonProperty("freeform")
            fun freeform(freeform: Freeform) = apply { this.freeform = freeform }

            /**
             * Structured ASC X12 820 remittance advice records. Please reach out to
             * [support@increase.com](mailto:support@increase.com) for more information.
             */
            @JsonProperty("payment_order_remittance_advice")
            fun paymentOrderRemittanceAdvice(
                paymentOrderRemittanceAdvice: PaymentOrderRemittanceAdvice
            ) = apply { this.paymentOrderRemittanceAdvice = paymentOrderRemittanceAdvice }

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

            fun build(): Addenda =
                Addenda(
                    checkNotNull(category) { "`category` is required but was not set" },
                    freeform,
                    paymentOrderRemittanceAdvice,
                    additionalProperties.toUnmodifiable(),
                )
        }

        class Category
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Category && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val FREEFORM = Category(JsonField.of("freeform"))

                @JvmField
                val PAYMENT_ORDER_REMITTANCE_ADVICE =
                    Category(JsonField.of("payment_order_remittance_advice"))

                @JvmStatic fun of(value: String) = Category(JsonField.of(value))
            }

            enum class Known {
                FREEFORM,
                PAYMENT_ORDER_REMITTANCE_ADVICE,
            }

            enum class Value {
                FREEFORM,
                PAYMENT_ORDER_REMITTANCE_ADVICE,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    FREEFORM -> Value.FREEFORM
                    PAYMENT_ORDER_REMITTANCE_ADVICE -> Value.PAYMENT_ORDER_REMITTANCE_ADVICE
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    FREEFORM -> Known.FREEFORM
                    PAYMENT_ORDER_REMITTANCE_ADVICE -> Known.PAYMENT_ORDER_REMITTANCE_ADVICE
                    else -> throw IncreaseInvalidDataException("Unknown Category: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        /** Unstructured `payment_related_information` passed through with the transfer. */
        @JsonDeserialize(builder = Freeform.Builder::class)
        @NoAutoDetect
        class Freeform
        private constructor(
            private val entries: List<Entry>?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var hashCode: Int = 0

            /**
             * Each entry represents an addendum sent with the transfer. Please reach out to
             * [support@increase.com](mailto:support@increase.com) to send more than one addendum.
             */
            @JsonProperty("entries") fun entries(): List<Entry>? = entries

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Freeform &&
                    this.entries == other.entries &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = Objects.hash(entries, additionalProperties)
                }
                return hashCode
            }

            override fun toString() =
                "Freeform{entries=$entries, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var entries: List<Entry>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(freeform: Freeform) = apply {
                    this.entries = freeform.entries
                    additionalProperties(freeform.additionalProperties)
                }

                /**
                 * Each entry represents an addendum sent with the transfer. Please reach out to
                 * [support@increase.com](mailto:support@increase.com) to send more than one
                 * addendum.
                 */
                @JsonProperty("entries")
                fun entries(entries: List<Entry>) = apply { this.entries = entries }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Freeform =
                    Freeform(
                        checkNotNull(entries) { "`entries` is required but was not set" }
                            .toUnmodifiable(),
                        additionalProperties.toUnmodifiable()
                    )
            }

            @JsonDeserialize(builder = Entry.Builder::class)
            @NoAutoDetect
            class Entry
            private constructor(
                private val paymentRelatedInformation: String?,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var hashCode: Int = 0

                /** The payment related information passed in the addendum. */
                @JsonProperty("payment_related_information")
                fun paymentRelatedInformation(): String? = paymentRelatedInformation

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Entry &&
                        this.paymentRelatedInformation == other.paymentRelatedInformation &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = Objects.hash(paymentRelatedInformation, additionalProperties)
                    }
                    return hashCode
                }

                override fun toString() =
                    "Entry{paymentRelatedInformation=$paymentRelatedInformation, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var paymentRelatedInformation: String? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(entry: Entry) = apply {
                        this.paymentRelatedInformation = entry.paymentRelatedInformation
                        additionalProperties(entry.additionalProperties)
                    }

                    /** The payment related information passed in the addendum. */
                    @JsonProperty("payment_related_information")
                    fun paymentRelatedInformation(paymentRelatedInformation: String) = apply {
                        this.paymentRelatedInformation = paymentRelatedInformation
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): Entry =
                        Entry(
                            checkNotNull(paymentRelatedInformation) {
                                "`paymentRelatedInformation` is required but was not set"
                            },
                            additionalProperties.toUnmodifiable()
                        )
                }
            }
        }

        /**
         * Structured ASC X12 820 remittance advice records. Please reach out to
         * [support@increase.com](mailto:support@increase.com) for more information.
         */
        @JsonDeserialize(builder = PaymentOrderRemittanceAdvice.Builder::class)
        @NoAutoDetect
        class PaymentOrderRemittanceAdvice
        private constructor(
            private val invoices: List<Invoice>?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var hashCode: Int = 0

            /** ASC X12 RMR records for this specific transfer. */
            @JsonProperty("invoices") fun invoices(): List<Invoice>? = invoices

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PaymentOrderRemittanceAdvice &&
                    this.invoices == other.invoices &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = Objects.hash(invoices, additionalProperties)
                }
                return hashCode
            }

            override fun toString() =
                "PaymentOrderRemittanceAdvice{invoices=$invoices, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var invoices: List<Invoice>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(paymentOrderRemittanceAdvice: PaymentOrderRemittanceAdvice) =
                    apply {
                        this.invoices = paymentOrderRemittanceAdvice.invoices
                        additionalProperties(paymentOrderRemittanceAdvice.additionalProperties)
                    }

                /** ASC X12 RMR records for this specific transfer. */
                @JsonProperty("invoices")
                fun invoices(invoices: List<Invoice>) = apply { this.invoices = invoices }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): PaymentOrderRemittanceAdvice =
                    PaymentOrderRemittanceAdvice(
                        checkNotNull(invoices) { "`invoices` is required but was not set" }
                            .toUnmodifiable(),
                        additionalProperties.toUnmodifiable()
                    )
            }

            @JsonDeserialize(builder = Invoice.Builder::class)
            @NoAutoDetect
            class Invoice
            private constructor(
                private val invoiceNumber: String?,
                private val paidAmount: Long?,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var hashCode: Int = 0

                /**
                 * The invoice number for this reference, determined in advance with the receiver.
                 */
                @JsonProperty("invoice_number") fun invoiceNumber(): String? = invoiceNumber

                /**
                 * The amount that was paid for this invoice in the minor unit of its currency. For
                 * dollars, for example, this is cents.
                 */
                @JsonProperty("paid_amount") fun paidAmount(): Long? = paidAmount

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Invoice &&
                        this.invoiceNumber == other.invoiceNumber &&
                        this.paidAmount == other.paidAmount &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                invoiceNumber,
                                paidAmount,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "Invoice{invoiceNumber=$invoiceNumber, paidAmount=$paidAmount, additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var invoiceNumber: String? = null
                    private var paidAmount: Long? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(invoice: Invoice) = apply {
                        this.invoiceNumber = invoice.invoiceNumber
                        this.paidAmount = invoice.paidAmount
                        additionalProperties(invoice.additionalProperties)
                    }

                    /**
                     * The invoice number for this reference, determined in advance with the
                     * receiver.
                     */
                    @JsonProperty("invoice_number")
                    fun invoiceNumber(invoiceNumber: String) = apply {
                        this.invoiceNumber = invoiceNumber
                    }

                    /**
                     * The amount that was paid for this invoice in the minor unit of its currency.
                     * For dollars, for example, this is cents.
                     */
                    @JsonProperty("paid_amount")
                    fun paidAmount(paidAmount: Long) = apply { this.paidAmount = paidAmount }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): Invoice =
                        Invoice(
                            checkNotNull(invoiceNumber) {
                                "`invoiceNumber` is required but was not set"
                            },
                            checkNotNull(paidAmount) { "`paidAmount` is required but was not set" },
                            additionalProperties.toUnmodifiable(),
                        )
                }
            }
        }
    }

    class DestinationAccountHolder
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DestinationAccountHolder && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val BUSINESS = DestinationAccountHolder(JsonField.of("business"))

            @JvmField val INDIVIDUAL = DestinationAccountHolder(JsonField.of("individual"))

            @JvmField val UNKNOWN = DestinationAccountHolder(JsonField.of("unknown"))

            @JvmStatic fun of(value: String) = DestinationAccountHolder(JsonField.of(value))
        }

        enum class Known {
            BUSINESS,
            INDIVIDUAL,
            UNKNOWN,
        }

        enum class Value {
            BUSINESS,
            INDIVIDUAL,
            UNKNOWN,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                BUSINESS -> Value.BUSINESS
                INDIVIDUAL -> Value.INDIVIDUAL
                UNKNOWN -> Value.UNKNOWN
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                BUSINESS -> Known.BUSINESS
                INDIVIDUAL -> Known.INDIVIDUAL
                UNKNOWN -> Known.UNKNOWN
                else ->
                    throw IncreaseInvalidDataException("Unknown DestinationAccountHolder: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
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
