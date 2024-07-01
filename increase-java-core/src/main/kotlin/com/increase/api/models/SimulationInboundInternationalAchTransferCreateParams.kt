// File generated from our OpenAPI spec by Stainless.

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
import java.util.Objects
import java.util.Optional

class SimulationInboundInternationalAchTransferCreateParams
constructor(
    private val accountNumberId: String,
    private val amount: Long,
    private val foreignPaymentAmount: Long,
    private val originatingCurrencyCode: String,
    private val originatorCompanyEntryDescription: String?,
    private val originatorName: String?,
    private val receivingCompanyOrIndividualName: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun accountNumberId(): String = accountNumberId

    fun amount(): Long = amount

    fun foreignPaymentAmount(): Long = foreignPaymentAmount

    fun originatingCurrencyCode(): String = originatingCurrencyCode

    fun originatorCompanyEntryDescription(): Optional<String> =
        Optional.ofNullable(originatorCompanyEntryDescription)

    fun originatorName(): Optional<String> = Optional.ofNullable(originatorName)

    fun receivingCompanyOrIndividualName(): Optional<String> =
        Optional.ofNullable(receivingCompanyOrIndividualName)

    @JvmSynthetic
    internal fun getBody(): SimulationInboundInternationalAchTransferCreateBody {
        return SimulationInboundInternationalAchTransferCreateBody(
            accountNumberId,
            amount,
            foreignPaymentAmount,
            originatingCurrencyCode,
            originatorCompanyEntryDescription,
            originatorName,
            receivingCompanyOrIndividualName,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = SimulationInboundInternationalAchTransferCreateBody.Builder::class)
    @NoAutoDetect
    class SimulationInboundInternationalAchTransferCreateBody
    internal constructor(
        private val accountNumberId: String?,
        private val amount: Long?,
        private val foreignPaymentAmount: Long?,
        private val originatingCurrencyCode: String?,
        private val originatorCompanyEntryDescription: String?,
        private val originatorName: String?,
        private val receivingCompanyOrIndividualName: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** The identifier of the Account Number the inbound international ACH Transfer is for. */
        @JsonProperty("account_number_id") fun accountNumberId(): String? = accountNumberId

        /**
         * The transfer amount in cents. A positive amount originates a credit transfer pushing
         * funds to the receiving account. A negative amount originates a debit transfer pulling
         * funds from the receiving account.
         */
        @JsonProperty("amount") fun amount(): Long? = amount

        /**
         * The amount in the minor unit of the foreign payment currency. For dollars, for example,
         * this is cents.
         */
        @JsonProperty("foreign_payment_amount")
        fun foreignPaymentAmount(): Long? = foreignPaymentAmount

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code for the originating
         * bank account.
         */
        @JsonProperty("originating_currency_code")
        fun originatingCurrencyCode(): String? = originatingCurrencyCode

        /** A description field set by the originator. */
        @JsonProperty("originator_company_entry_description")
        fun originatorCompanyEntryDescription(): String? = originatorCompanyEntryDescription

        /** Either the name of the originator or an intermediary money transmitter. */
        @JsonProperty("originator_name") fun originatorName(): String? = originatorName

        /** The name of the receiver of the transfer. */
        @JsonProperty("receiving_company_or_individual_name")
        fun receivingCompanyOrIndividualName(): String? = receivingCompanyOrIndividualName

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SimulationInboundInternationalAchTransferCreateBody &&
                this.accountNumberId == other.accountNumberId &&
                this.amount == other.amount &&
                this.foreignPaymentAmount == other.foreignPaymentAmount &&
                this.originatingCurrencyCode == other.originatingCurrencyCode &&
                this.originatorCompanyEntryDescription == other.originatorCompanyEntryDescription &&
                this.originatorName == other.originatorName &&
                this.receivingCompanyOrIndividualName == other.receivingCompanyOrIndividualName &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        accountNumberId,
                        amount,
                        foreignPaymentAmount,
                        originatingCurrencyCode,
                        originatorCompanyEntryDescription,
                        originatorName,
                        receivingCompanyOrIndividualName,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "SimulationInboundInternationalAchTransferCreateBody{accountNumberId=$accountNumberId, amount=$amount, foreignPaymentAmount=$foreignPaymentAmount, originatingCurrencyCode=$originatingCurrencyCode, originatorCompanyEntryDescription=$originatorCompanyEntryDescription, originatorName=$originatorName, receivingCompanyOrIndividualName=$receivingCompanyOrIndividualName, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var accountNumberId: String? = null
            private var amount: Long? = null
            private var foreignPaymentAmount: Long? = null
            private var originatingCurrencyCode: String? = null
            private var originatorCompanyEntryDescription: String? = null
            private var originatorName: String? = null
            private var receivingCompanyOrIndividualName: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                simulationInboundInternationalAchTransferCreateBody:
                    SimulationInboundInternationalAchTransferCreateBody
            ) = apply {
                this.accountNumberId =
                    simulationInboundInternationalAchTransferCreateBody.accountNumberId
                this.amount = simulationInboundInternationalAchTransferCreateBody.amount
                this.foreignPaymentAmount =
                    simulationInboundInternationalAchTransferCreateBody.foreignPaymentAmount
                this.originatingCurrencyCode =
                    simulationInboundInternationalAchTransferCreateBody.originatingCurrencyCode
                this.originatorCompanyEntryDescription =
                    simulationInboundInternationalAchTransferCreateBody
                        .originatorCompanyEntryDescription
                this.originatorName =
                    simulationInboundInternationalAchTransferCreateBody.originatorName
                this.receivingCompanyOrIndividualName =
                    simulationInboundInternationalAchTransferCreateBody
                        .receivingCompanyOrIndividualName
                additionalProperties(
                    simulationInboundInternationalAchTransferCreateBody.additionalProperties
                )
            }

            /**
             * The identifier of the Account Number the inbound international ACH Transfer is for.
             */
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

            /**
             * The amount in the minor unit of the foreign payment currency. For dollars, for
             * example, this is cents.
             */
            @JsonProperty("foreign_payment_amount")
            fun foreignPaymentAmount(foreignPaymentAmount: Long) = apply {
                this.foreignPaymentAmount = foreignPaymentAmount
            }

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code for the
             * originating bank account.
             */
            @JsonProperty("originating_currency_code")
            fun originatingCurrencyCode(originatingCurrencyCode: String) = apply {
                this.originatingCurrencyCode = originatingCurrencyCode
            }

            /** A description field set by the originator. */
            @JsonProperty("originator_company_entry_description")
            fun originatorCompanyEntryDescription(originatorCompanyEntryDescription: String) =
                apply {
                    this.originatorCompanyEntryDescription = originatorCompanyEntryDescription
                }

            /** Either the name of the originator or an intermediary money transmitter. */
            @JsonProperty("originator_name")
            fun originatorName(originatorName: String) = apply {
                this.originatorName = originatorName
            }

            /** The name of the receiver of the transfer. */
            @JsonProperty("receiving_company_or_individual_name")
            fun receivingCompanyOrIndividualName(receivingCompanyOrIndividualName: String) = apply {
                this.receivingCompanyOrIndividualName = receivingCompanyOrIndividualName
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

            fun build(): SimulationInboundInternationalAchTransferCreateBody =
                SimulationInboundInternationalAchTransferCreateBody(
                    checkNotNull(accountNumberId) {
                        "`accountNumberId` is required but was not set"
                    },
                    checkNotNull(amount) { "`amount` is required but was not set" },
                    checkNotNull(foreignPaymentAmount) {
                        "`foreignPaymentAmount` is required but was not set"
                    },
                    checkNotNull(originatingCurrencyCode) {
                        "`originatingCurrencyCode` is required but was not set"
                    },
                    originatorCompanyEntryDescription,
                    originatorName,
                    receivingCompanyOrIndividualName,
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

        return other is SimulationInboundInternationalAchTransferCreateParams &&
            this.accountNumberId == other.accountNumberId &&
            this.amount == other.amount &&
            this.foreignPaymentAmount == other.foreignPaymentAmount &&
            this.originatingCurrencyCode == other.originatingCurrencyCode &&
            this.originatorCompanyEntryDescription == other.originatorCompanyEntryDescription &&
            this.originatorName == other.originatorName &&
            this.receivingCompanyOrIndividualName == other.receivingCompanyOrIndividualName &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            accountNumberId,
            amount,
            foreignPaymentAmount,
            originatingCurrencyCode,
            originatorCompanyEntryDescription,
            originatorName,
            receivingCompanyOrIndividualName,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "SimulationInboundInternationalAchTransferCreateParams{accountNumberId=$accountNumberId, amount=$amount, foreignPaymentAmount=$foreignPaymentAmount, originatingCurrencyCode=$originatingCurrencyCode, originatorCompanyEntryDescription=$originatorCompanyEntryDescription, originatorName=$originatorName, receivingCompanyOrIndividualName=$receivingCompanyOrIndividualName, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var accountNumberId: String? = null
        private var amount: Long? = null
        private var foreignPaymentAmount: Long? = null
        private var originatingCurrencyCode: String? = null
        private var originatorCompanyEntryDescription: String? = null
        private var originatorName: String? = null
        private var receivingCompanyOrIndividualName: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            simulationInboundInternationalAchTransferCreateParams:
                SimulationInboundInternationalAchTransferCreateParams
        ) = apply {
            this.accountNumberId =
                simulationInboundInternationalAchTransferCreateParams.accountNumberId
            this.amount = simulationInboundInternationalAchTransferCreateParams.amount
            this.foreignPaymentAmount =
                simulationInboundInternationalAchTransferCreateParams.foreignPaymentAmount
            this.originatingCurrencyCode =
                simulationInboundInternationalAchTransferCreateParams.originatingCurrencyCode
            this.originatorCompanyEntryDescription =
                simulationInboundInternationalAchTransferCreateParams
                    .originatorCompanyEntryDescription
            this.originatorName =
                simulationInboundInternationalAchTransferCreateParams.originatorName
            this.receivingCompanyOrIndividualName =
                simulationInboundInternationalAchTransferCreateParams
                    .receivingCompanyOrIndividualName
            additionalQueryParams(
                simulationInboundInternationalAchTransferCreateParams.additionalQueryParams
            )
            additionalHeaders(
                simulationInboundInternationalAchTransferCreateParams.additionalHeaders
            )
            additionalBodyProperties(
                simulationInboundInternationalAchTransferCreateParams.additionalBodyProperties
            )
        }

        /** The identifier of the Account Number the inbound international ACH Transfer is for. */
        fun accountNumberId(accountNumberId: String) = apply {
            this.accountNumberId = accountNumberId
        }

        /**
         * The transfer amount in cents. A positive amount originates a credit transfer pushing
         * funds to the receiving account. A negative amount originates a debit transfer pulling
         * funds from the receiving account.
         */
        fun amount(amount: Long) = apply { this.amount = amount }

        /**
         * The amount in the minor unit of the foreign payment currency. For dollars, for example,
         * this is cents.
         */
        fun foreignPaymentAmount(foreignPaymentAmount: Long) = apply {
            this.foreignPaymentAmount = foreignPaymentAmount
        }

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code for the originating
         * bank account.
         */
        fun originatingCurrencyCode(originatingCurrencyCode: String) = apply {
            this.originatingCurrencyCode = originatingCurrencyCode
        }

        /** A description field set by the originator. */
        fun originatorCompanyEntryDescription(originatorCompanyEntryDescription: String) = apply {
            this.originatorCompanyEntryDescription = originatorCompanyEntryDescription
        }

        /** Either the name of the originator or an intermediary money transmitter. */
        fun originatorName(originatorName: String) = apply { this.originatorName = originatorName }

        /** The name of the receiver of the transfer. */
        fun receivingCompanyOrIndividualName(receivingCompanyOrIndividualName: String) = apply {
            this.receivingCompanyOrIndividualName = receivingCompanyOrIndividualName
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

        fun build(): SimulationInboundInternationalAchTransferCreateParams =
            SimulationInboundInternationalAchTransferCreateParams(
                checkNotNull(accountNumberId) { "`accountNumberId` is required but was not set" },
                checkNotNull(amount) { "`amount` is required but was not set" },
                checkNotNull(foreignPaymentAmount) {
                    "`foreignPaymentAmount` is required but was not set"
                },
                checkNotNull(originatingCurrencyCode) {
                    "`originatingCurrencyCode` is required but was not set"
                },
                originatorCompanyEntryDescription,
                originatorName,
                receivingCompanyOrIndividualName,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }
}
