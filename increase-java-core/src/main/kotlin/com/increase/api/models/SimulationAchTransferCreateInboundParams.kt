package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.toUnmodifiable
import com.increase.api.models.*
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

class SimulationAchTransferCreateInboundParams
constructor(
    private val accountNumberId: String,
    private val amount: Long,
    private val companyDescriptiveDate: String?,
    private val companyDiscretionaryData: String?,
    private val companyEntryDescription: String?,
    private val companyId: String?,
    private val companyName: String?,
    private val resolveAt: OffsetDateTime?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun accountNumberId(): String = accountNumberId

    fun amount(): Long = amount

    fun companyDescriptiveDate(): Optional<String> = Optional.ofNullable(companyDescriptiveDate)

    fun companyDiscretionaryData(): Optional<String> = Optional.ofNullable(companyDiscretionaryData)

    fun companyEntryDescription(): Optional<String> = Optional.ofNullable(companyEntryDescription)

    fun companyId(): Optional<String> = Optional.ofNullable(companyId)

    fun companyName(): Optional<String> = Optional.ofNullable(companyName)

    fun resolveAt(): Optional<OffsetDateTime> = Optional.ofNullable(resolveAt)

    @JvmSynthetic
    internal fun getBody(): SimulationAchTransferCreateInboundBody {
        return SimulationAchTransferCreateInboundBody(
            accountNumberId,
            amount,
            companyDescriptiveDate,
            companyDiscretionaryData,
            companyEntryDescription,
            companyId,
            companyName,
            resolveAt,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = SimulationAchTransferCreateInboundBody.Builder::class)
    @NoAutoDetect
    class SimulationAchTransferCreateInboundBody
    internal constructor(
        private val accountNumberId: String?,
        private val amount: Long?,
        private val companyDescriptiveDate: String?,
        private val companyDiscretionaryData: String?,
        private val companyEntryDescription: String?,
        private val companyId: String?,
        private val companyName: String?,
        private val resolveAt: OffsetDateTime?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** The identifier of the Account Number the inbound ACH Transfer is for. */
        @JsonProperty("account_number_id") fun accountNumberId(): String? = accountNumberId

        /**
         * The transfer amount in cents. A positive amount originates a credit transfer pushing
         * funds to the receiving account. A negative amount originates a debit transfer pulling
         * funds from the receiving account.
         */
        @JsonProperty("amount") fun amount(): Long? = amount

        /** The description of the date of the transfer. */
        @JsonProperty("company_descriptive_date")
        fun companyDescriptiveDate(): String? = companyDescriptiveDate

        /** Data associated with the transfer set by the sender. */
        @JsonProperty("company_discretionary_data")
        fun companyDiscretionaryData(): String? = companyDiscretionaryData

        /** The description of the transfer set by the sender. */
        @JsonProperty("company_entry_description")
        fun companyEntryDescription(): String? = companyEntryDescription

        /** The sender's company id. */
        @JsonProperty("company_id") fun companyId(): String? = companyId

        /** The name of the sender. */
        @JsonProperty("company_name") fun companyName(): String? = companyName

        /**
         * The time at which the transfer should be resolved. If not provided will resolve
         * immediately.
         */
        @JsonProperty("resolve_at") fun resolveAt(): OffsetDateTime? = resolveAt

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SimulationAchTransferCreateInboundBody &&
                this.accountNumberId == other.accountNumberId &&
                this.amount == other.amount &&
                this.companyDescriptiveDate == other.companyDescriptiveDate &&
                this.companyDiscretionaryData == other.companyDiscretionaryData &&
                this.companyEntryDescription == other.companyEntryDescription &&
                this.companyId == other.companyId &&
                this.companyName == other.companyName &&
                this.resolveAt == other.resolveAt &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        accountNumberId,
                        amount,
                        companyDescriptiveDate,
                        companyDiscretionaryData,
                        companyEntryDescription,
                        companyId,
                        companyName,
                        resolveAt,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "SimulationAchTransferCreateInboundBody{accountNumberId=$accountNumberId, amount=$amount, companyDescriptiveDate=$companyDescriptiveDate, companyDiscretionaryData=$companyDiscretionaryData, companyEntryDescription=$companyEntryDescription, companyId=$companyId, companyName=$companyName, resolveAt=$resolveAt, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var accountNumberId: String? = null
            private var amount: Long? = null
            private var companyDescriptiveDate: String? = null
            private var companyDiscretionaryData: String? = null
            private var companyEntryDescription: String? = null
            private var companyId: String? = null
            private var companyName: String? = null
            private var resolveAt: OffsetDateTime? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                simulationAchTransferCreateInboundBody: SimulationAchTransferCreateInboundBody
            ) = apply {
                this.accountNumberId = simulationAchTransferCreateInboundBody.accountNumberId
                this.amount = simulationAchTransferCreateInboundBody.amount
                this.companyDescriptiveDate =
                    simulationAchTransferCreateInboundBody.companyDescriptiveDate
                this.companyDiscretionaryData =
                    simulationAchTransferCreateInboundBody.companyDiscretionaryData
                this.companyEntryDescription =
                    simulationAchTransferCreateInboundBody.companyEntryDescription
                this.companyId = simulationAchTransferCreateInboundBody.companyId
                this.companyName = simulationAchTransferCreateInboundBody.companyName
                this.resolveAt = simulationAchTransferCreateInboundBody.resolveAt
                additionalProperties(simulationAchTransferCreateInboundBody.additionalProperties)
            }

            /** The identifier of the Account Number the inbound ACH Transfer is for. */
            @JsonProperty("account_number_id")
            fun accountNumberId(accountNumberId: String) = apply {
                this.accountNumberId = accountNumberId
            }

            /**
             * The transfer amount in cents. A positive amount originates a credit transfer pushing
             * funds to the receiving account. A negative amount originates a debit transfer pulling
             * funds from the receiving account.
             */
            @JsonProperty("amount") fun amount(amount: Long) = apply { this.amount = amount }

            /** The description of the date of the transfer. */
            @JsonProperty("company_descriptive_date")
            fun companyDescriptiveDate(companyDescriptiveDate: String) = apply {
                this.companyDescriptiveDate = companyDescriptiveDate
            }

            /** Data associated with the transfer set by the sender. */
            @JsonProperty("company_discretionary_data")
            fun companyDiscretionaryData(companyDiscretionaryData: String) = apply {
                this.companyDiscretionaryData = companyDiscretionaryData
            }

            /** The description of the transfer set by the sender. */
            @JsonProperty("company_entry_description")
            fun companyEntryDescription(companyEntryDescription: String) = apply {
                this.companyEntryDescription = companyEntryDescription
            }

            /** The sender's company id. */
            @JsonProperty("company_id")
            fun companyId(companyId: String) = apply { this.companyId = companyId }

            /** The name of the sender. */
            @JsonProperty("company_name")
            fun companyName(companyName: String) = apply { this.companyName = companyName }

            /**
             * The time at which the transfer should be resolved. If not provided will resolve
             * immediately.
             */
            @JsonProperty("resolve_at")
            fun resolveAt(resolveAt: OffsetDateTime) = apply { this.resolveAt = resolveAt }

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

            fun build(): SimulationAchTransferCreateInboundBody =
                SimulationAchTransferCreateInboundBody(
                    checkNotNull(accountNumberId) {
                        "`accountNumberId` is required but was not set"
                    },
                    checkNotNull(amount) { "`amount` is required but was not set" },
                    companyDescriptiveDate,
                    companyDiscretionaryData,
                    companyEntryDescription,
                    companyId,
                    companyName,
                    resolveAt,
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

        return other is SimulationAchTransferCreateInboundParams &&
            this.accountNumberId == other.accountNumberId &&
            this.amount == other.amount &&
            this.companyDescriptiveDate == other.companyDescriptiveDate &&
            this.companyDiscretionaryData == other.companyDiscretionaryData &&
            this.companyEntryDescription == other.companyEntryDescription &&
            this.companyId == other.companyId &&
            this.companyName == other.companyName &&
            this.resolveAt == other.resolveAt &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            accountNumberId,
            amount,
            companyDescriptiveDate,
            companyDiscretionaryData,
            companyEntryDescription,
            companyId,
            companyName,
            resolveAt,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "SimulationAchTransferCreateInboundParams{accountNumberId=$accountNumberId, amount=$amount, companyDescriptiveDate=$companyDescriptiveDate, companyDiscretionaryData=$companyDiscretionaryData, companyEntryDescription=$companyEntryDescription, companyId=$companyId, companyName=$companyName, resolveAt=$resolveAt, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var accountNumberId: String? = null
        private var amount: Long? = null
        private var companyDescriptiveDate: String? = null
        private var companyDiscretionaryData: String? = null
        private var companyEntryDescription: String? = null
        private var companyId: String? = null
        private var companyName: String? = null
        private var resolveAt: OffsetDateTime? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            simulationAchTransferCreateInboundParams: SimulationAchTransferCreateInboundParams
        ) = apply {
            this.accountNumberId = simulationAchTransferCreateInboundParams.accountNumberId
            this.amount = simulationAchTransferCreateInboundParams.amount
            this.companyDescriptiveDate =
                simulationAchTransferCreateInboundParams.companyDescriptiveDate
            this.companyDiscretionaryData =
                simulationAchTransferCreateInboundParams.companyDiscretionaryData
            this.companyEntryDescription =
                simulationAchTransferCreateInboundParams.companyEntryDescription
            this.companyId = simulationAchTransferCreateInboundParams.companyId
            this.companyName = simulationAchTransferCreateInboundParams.companyName
            this.resolveAt = simulationAchTransferCreateInboundParams.resolveAt
            additionalQueryParams(simulationAchTransferCreateInboundParams.additionalQueryParams)
            additionalHeaders(simulationAchTransferCreateInboundParams.additionalHeaders)
            additionalBodyProperties(
                simulationAchTransferCreateInboundParams.additionalBodyProperties
            )
        }

        /** The identifier of the Account Number the inbound ACH Transfer is for. */
        fun accountNumberId(accountNumberId: String) = apply {
            this.accountNumberId = accountNumberId
        }

        /**
         * The transfer amount in cents. A positive amount originates a credit transfer pushing
         * funds to the receiving account. A negative amount originates a debit transfer pulling
         * funds from the receiving account.
         */
        fun amount(amount: Long) = apply { this.amount = amount }

        /** The description of the date of the transfer. */
        fun companyDescriptiveDate(companyDescriptiveDate: String) = apply {
            this.companyDescriptiveDate = companyDescriptiveDate
        }

        /** Data associated with the transfer set by the sender. */
        fun companyDiscretionaryData(companyDiscretionaryData: String) = apply {
            this.companyDiscretionaryData = companyDiscretionaryData
        }

        /** The description of the transfer set by the sender. */
        fun companyEntryDescription(companyEntryDescription: String) = apply {
            this.companyEntryDescription = companyEntryDescription
        }

        /** The sender's company id. */
        fun companyId(companyId: String) = apply { this.companyId = companyId }

        /** The name of the sender. */
        fun companyName(companyName: String) = apply { this.companyName = companyName }

        /**
         * The time at which the transfer should be resolved. If not provided will resolve
         * immediately.
         */
        fun resolveAt(resolveAt: OffsetDateTime) = apply { this.resolveAt = resolveAt }

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

        fun build(): SimulationAchTransferCreateInboundParams =
            SimulationAchTransferCreateInboundParams(
                checkNotNull(accountNumberId) { "`accountNumberId` is required but was not set" },
                checkNotNull(amount) { "`amount` is required but was not set" },
                companyDescriptiveDate,
                companyDiscretionaryData,
                companyEntryDescription,
                companyId,
                companyName,
                resolveAt,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }
}
