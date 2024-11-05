// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.toImmutable
import com.increase.api.models.*
import java.util.Objects
import java.util.Optional

class RealTimePaymentsTransferCreateParams
constructor(
    private val amount: Long,
    private val creditorName: String,
    private val remittanceInformation: String,
    private val sourceAccountNumberId: String,
    private val debtorName: String?,
    private val destinationAccountNumber: String?,
    private val destinationRoutingNumber: String?,
    private val externalAccountId: String?,
    private val requireApproval: Boolean?,
    private val ultimateCreditorName: String?,
    private val ultimateDebtorName: String?,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun amount(): Long = amount

    fun creditorName(): String = creditorName

    fun remittanceInformation(): String = remittanceInformation

    fun sourceAccountNumberId(): String = sourceAccountNumberId

    fun debtorName(): Optional<String> = Optional.ofNullable(debtorName)

    fun destinationAccountNumber(): Optional<String> = Optional.ofNullable(destinationAccountNumber)

    fun destinationRoutingNumber(): Optional<String> = Optional.ofNullable(destinationRoutingNumber)

    fun externalAccountId(): Optional<String> = Optional.ofNullable(externalAccountId)

    fun requireApproval(): Optional<Boolean> = Optional.ofNullable(requireApproval)

    fun ultimateCreditorName(): Optional<String> = Optional.ofNullable(ultimateCreditorName)

    fun ultimateDebtorName(): Optional<String> = Optional.ofNullable(ultimateDebtorName)

    @JvmSynthetic
    internal fun getBody(): RealTimePaymentsTransferCreateBody {
        return RealTimePaymentsTransferCreateBody(
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
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JsonDeserialize(builder = RealTimePaymentsTransferCreateBody.Builder::class)
    @NoAutoDetect
    class RealTimePaymentsTransferCreateBody
    internal constructor(
        private val amount: Long?,
        private val creditorName: String?,
        private val remittanceInformation: String?,
        private val sourceAccountNumberId: String?,
        private val debtorName: String?,
        private val destinationAccountNumber: String?,
        private val destinationRoutingNumber: String?,
        private val externalAccountId: String?,
        private val requireApproval: Boolean?,
        private val ultimateCreditorName: String?,
        private val ultimateDebtorName: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The transfer amount in USD cents. For Real-Time Payments transfers, must be positive. */
        @JsonProperty("amount") fun amount(): Long? = amount

        /** The name of the transfer's recipient. */
        @JsonProperty("creditor_name") fun creditorName(): String? = creditorName

        /** Unstructured information that will show on the recipient's bank statement. */
        @JsonProperty("remittance_information")
        fun remittanceInformation(): String? = remittanceInformation

        /** The identifier of the Account Number from which to send the transfer. */
        @JsonProperty("source_account_number_id")
        fun sourceAccountNumberId(): String? = sourceAccountNumberId

        /**
         * The name of the transfer's sender. If not provided, defaults to the name of the account's
         * entity.
         */
        @JsonProperty("debtor_name") fun debtorName(): String? = debtorName

        /** The destination account number. */
        @JsonProperty("destination_account_number")
        fun destinationAccountNumber(): String? = destinationAccountNumber

        /** The destination American Bankers' Association (ABA) Routing Transit Number (RTN). */
        @JsonProperty("destination_routing_number")
        fun destinationRoutingNumber(): String? = destinationRoutingNumber

        /**
         * The ID of an External Account to initiate a transfer to. If this parameter is provided,
         * `destination_account_number` and `destination_routing_number` must be absent.
         */
        @JsonProperty("external_account_id") fun externalAccountId(): String? = externalAccountId

        /** Whether the transfer requires explicit approval via the dashboard or API. */
        @JsonProperty("require_approval") fun requireApproval(): Boolean? = requireApproval

        /**
         * The name of the ultimate recipient of the transfer. Set this if the creditor is an
         * intermediary receiving the payment for someone else.
         */
        @JsonProperty("ultimate_creditor_name")
        fun ultimateCreditorName(): String? = ultimateCreditorName

        /**
         * The name of the ultimate sender of the transfer. Set this if the funds are being sent on
         * behalf of someone who is not the account holder at Increase.
         */
        @JsonProperty("ultimate_debtor_name") fun ultimateDebtorName(): String? = ultimateDebtorName

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var amount: Long? = null
            private var creditorName: String? = null
            private var remittanceInformation: String? = null
            private var sourceAccountNumberId: String? = null
            private var debtorName: String? = null
            private var destinationAccountNumber: String? = null
            private var destinationRoutingNumber: String? = null
            private var externalAccountId: String? = null
            private var requireApproval: Boolean? = null
            private var ultimateCreditorName: String? = null
            private var ultimateDebtorName: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                realTimePaymentsTransferCreateBody: RealTimePaymentsTransferCreateBody
            ) = apply {
                this.amount = realTimePaymentsTransferCreateBody.amount
                this.creditorName = realTimePaymentsTransferCreateBody.creditorName
                this.remittanceInformation =
                    realTimePaymentsTransferCreateBody.remittanceInformation
                this.sourceAccountNumberId =
                    realTimePaymentsTransferCreateBody.sourceAccountNumberId
                this.debtorName = realTimePaymentsTransferCreateBody.debtorName
                this.destinationAccountNumber =
                    realTimePaymentsTransferCreateBody.destinationAccountNumber
                this.destinationRoutingNumber =
                    realTimePaymentsTransferCreateBody.destinationRoutingNumber
                this.externalAccountId = realTimePaymentsTransferCreateBody.externalAccountId
                this.requireApproval = realTimePaymentsTransferCreateBody.requireApproval
                this.ultimateCreditorName = realTimePaymentsTransferCreateBody.ultimateCreditorName
                this.ultimateDebtorName = realTimePaymentsTransferCreateBody.ultimateDebtorName
                additionalProperties(realTimePaymentsTransferCreateBody.additionalProperties)
            }

            /**
             * The transfer amount in USD cents. For Real-Time Payments transfers, must be positive.
             */
            @JsonProperty("amount") fun amount(amount: Long) = apply { this.amount = amount }

            /** The name of the transfer's recipient. */
            @JsonProperty("creditor_name")
            fun creditorName(creditorName: String) = apply { this.creditorName = creditorName }

            /** Unstructured information that will show on the recipient's bank statement. */
            @JsonProperty("remittance_information")
            fun remittanceInformation(remittanceInformation: String) = apply {
                this.remittanceInformation = remittanceInformation
            }

            /** The identifier of the Account Number from which to send the transfer. */
            @JsonProperty("source_account_number_id")
            fun sourceAccountNumberId(sourceAccountNumberId: String) = apply {
                this.sourceAccountNumberId = sourceAccountNumberId
            }

            /**
             * The name of the transfer's sender. If not provided, defaults to the name of the
             * account's entity.
             */
            @JsonProperty("debtor_name")
            fun debtorName(debtorName: String) = apply { this.debtorName = debtorName }

            /** The destination account number. */
            @JsonProperty("destination_account_number")
            fun destinationAccountNumber(destinationAccountNumber: String) = apply {
                this.destinationAccountNumber = destinationAccountNumber
            }

            /** The destination American Bankers' Association (ABA) Routing Transit Number (RTN). */
            @JsonProperty("destination_routing_number")
            fun destinationRoutingNumber(destinationRoutingNumber: String) = apply {
                this.destinationRoutingNumber = destinationRoutingNumber
            }

            /**
             * The ID of an External Account to initiate a transfer to. If this parameter is
             * provided, `destination_account_number` and `destination_routing_number` must be
             * absent.
             */
            @JsonProperty("external_account_id")
            fun externalAccountId(externalAccountId: String) = apply {
                this.externalAccountId = externalAccountId
            }

            /** Whether the transfer requires explicit approval via the dashboard or API. */
            @JsonProperty("require_approval")
            fun requireApproval(requireApproval: Boolean) = apply {
                this.requireApproval = requireApproval
            }

            /**
             * The name of the ultimate recipient of the transfer. Set this if the creditor is an
             * intermediary receiving the payment for someone else.
             */
            @JsonProperty("ultimate_creditor_name")
            fun ultimateCreditorName(ultimateCreditorName: String) = apply {
                this.ultimateCreditorName = ultimateCreditorName
            }

            /**
             * The name of the ultimate sender of the transfer. Set this if the funds are being sent
             * on behalf of someone who is not the account holder at Increase.
             */
            @JsonProperty("ultimate_debtor_name")
            fun ultimateDebtorName(ultimateDebtorName: String) = apply {
                this.ultimateDebtorName = ultimateDebtorName
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

            fun build(): RealTimePaymentsTransferCreateBody =
                RealTimePaymentsTransferCreateBody(
                    checkNotNull(amount) { "`amount` is required but was not set" },
                    checkNotNull(creditorName) { "`creditorName` is required but was not set" },
                    checkNotNull(remittanceInformation) {
                        "`remittanceInformation` is required but was not set"
                    },
                    checkNotNull(sourceAccountNumberId) {
                        "`sourceAccountNumberId` is required but was not set"
                    },
                    debtorName,
                    destinationAccountNumber,
                    destinationRoutingNumber,
                    externalAccountId,
                    requireApproval,
                    ultimateCreditorName,
                    ultimateDebtorName,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is RealTimePaymentsTransferCreateBody && this.amount == other.amount && this.creditorName == other.creditorName && this.remittanceInformation == other.remittanceInformation && this.sourceAccountNumberId == other.sourceAccountNumberId && this.debtorName == other.debtorName && this.destinationAccountNumber == other.destinationAccountNumber && this.destinationRoutingNumber == other.destinationRoutingNumber && this.externalAccountId == other.externalAccountId && this.requireApproval == other.requireApproval && this.ultimateCreditorName == other.ultimateCreditorName && this.ultimateDebtorName == other.ultimateDebtorName && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(amount, creditorName, remittanceInformation, sourceAccountNumberId, debtorName, destinationAccountNumber, destinationRoutingNumber, externalAccountId, requireApproval, ultimateCreditorName, ultimateDebtorName, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "RealTimePaymentsTransferCreateBody{amount=$amount, creditorName=$creditorName, remittanceInformation=$remittanceInformation, sourceAccountNumberId=$sourceAccountNumberId, debtorName=$debtorName, destinationAccountNumber=$destinationAccountNumber, destinationRoutingNumber=$destinationRoutingNumber, externalAccountId=$externalAccountId, requireApproval=$requireApproval, ultimateCreditorName=$ultimateCreditorName, ultimateDebtorName=$ultimateDebtorName, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is RealTimePaymentsTransferCreateParams && this.amount == other.amount && this.creditorName == other.creditorName && this.remittanceInformation == other.remittanceInformation && this.sourceAccountNumberId == other.sourceAccountNumberId && this.debtorName == other.debtorName && this.destinationAccountNumber == other.destinationAccountNumber && this.destinationRoutingNumber == other.destinationRoutingNumber && this.externalAccountId == other.externalAccountId && this.requireApproval == other.requireApproval && this.ultimateCreditorName == other.ultimateCreditorName && this.ultimateDebtorName == other.ultimateDebtorName && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(amount, creditorName, remittanceInformation, sourceAccountNumberId, debtorName, destinationAccountNumber, destinationRoutingNumber, externalAccountId, requireApproval, ultimateCreditorName, ultimateDebtorName, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "RealTimePaymentsTransferCreateParams{amount=$amount, creditorName=$creditorName, remittanceInformation=$remittanceInformation, sourceAccountNumberId=$sourceAccountNumberId, debtorName=$debtorName, destinationAccountNumber=$destinationAccountNumber, destinationRoutingNumber=$destinationRoutingNumber, externalAccountId=$externalAccountId, requireApproval=$requireApproval, ultimateCreditorName=$ultimateCreditorName, ultimateDebtorName=$ultimateDebtorName, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var amount: Long? = null
        private var creditorName: String? = null
        private var remittanceInformation: String? = null
        private var sourceAccountNumberId: String? = null
        private var debtorName: String? = null
        private var destinationAccountNumber: String? = null
        private var destinationRoutingNumber: String? = null
        private var externalAccountId: String? = null
        private var requireApproval: Boolean? = null
        private var ultimateCreditorName: String? = null
        private var ultimateDebtorName: String? = null
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            realTimePaymentsTransferCreateParams: RealTimePaymentsTransferCreateParams
        ) = apply {
            this.amount = realTimePaymentsTransferCreateParams.amount
            this.creditorName = realTimePaymentsTransferCreateParams.creditorName
            this.remittanceInformation = realTimePaymentsTransferCreateParams.remittanceInformation
            this.sourceAccountNumberId = realTimePaymentsTransferCreateParams.sourceAccountNumberId
            this.debtorName = realTimePaymentsTransferCreateParams.debtorName
            this.destinationAccountNumber =
                realTimePaymentsTransferCreateParams.destinationAccountNumber
            this.destinationRoutingNumber =
                realTimePaymentsTransferCreateParams.destinationRoutingNumber
            this.externalAccountId = realTimePaymentsTransferCreateParams.externalAccountId
            this.requireApproval = realTimePaymentsTransferCreateParams.requireApproval
            this.ultimateCreditorName = realTimePaymentsTransferCreateParams.ultimateCreditorName
            this.ultimateDebtorName = realTimePaymentsTransferCreateParams.ultimateDebtorName
            additionalHeaders(realTimePaymentsTransferCreateParams.additionalHeaders)
            additionalQueryParams(realTimePaymentsTransferCreateParams.additionalQueryParams)
            additionalBodyProperties(realTimePaymentsTransferCreateParams.additionalBodyProperties)
        }

        /** The transfer amount in USD cents. For Real-Time Payments transfers, must be positive. */
        fun amount(amount: Long) = apply { this.amount = amount }

        /** The name of the transfer's recipient. */
        fun creditorName(creditorName: String) = apply { this.creditorName = creditorName }

        /** Unstructured information that will show on the recipient's bank statement. */
        fun remittanceInformation(remittanceInformation: String) = apply {
            this.remittanceInformation = remittanceInformation
        }

        /** The identifier of the Account Number from which to send the transfer. */
        fun sourceAccountNumberId(sourceAccountNumberId: String) = apply {
            this.sourceAccountNumberId = sourceAccountNumberId
        }

        /**
         * The name of the transfer's sender. If not provided, defaults to the name of the account's
         * entity.
         */
        fun debtorName(debtorName: String) = apply { this.debtorName = debtorName }

        /** The destination account number. */
        fun destinationAccountNumber(destinationAccountNumber: String) = apply {
            this.destinationAccountNumber = destinationAccountNumber
        }

        /** The destination American Bankers' Association (ABA) Routing Transit Number (RTN). */
        fun destinationRoutingNumber(destinationRoutingNumber: String) = apply {
            this.destinationRoutingNumber = destinationRoutingNumber
        }

        /**
         * The ID of an External Account to initiate a transfer to. If this parameter is provided,
         * `destination_account_number` and `destination_routing_number` must be absent.
         */
        fun externalAccountId(externalAccountId: String) = apply {
            this.externalAccountId = externalAccountId
        }

        /** Whether the transfer requires explicit approval via the dashboard or API. */
        fun requireApproval(requireApproval: Boolean) = apply {
            this.requireApproval = requireApproval
        }

        /**
         * The name of the ultimate recipient of the transfer. Set this if the creditor is an
         * intermediary receiving the payment for someone else.
         */
        fun ultimateCreditorName(ultimateCreditorName: String) = apply {
            this.ultimateCreditorName = ultimateCreditorName
        }

        /**
         * The name of the ultimate sender of the transfer. Set this if the funds are being sent on
         * behalf of someone who is not the account holder at Increase.
         */
        fun ultimateDebtorName(ultimateDebtorName: String) = apply {
            this.ultimateDebtorName = ultimateDebtorName
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.putAll(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::putAdditionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replaceValues(name, listOf(value))
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replaceValues(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::replaceAdditionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.removeAll(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            names.forEach(::removeAdditionalHeaders)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.putAll(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::putAdditionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replaceValues(key, listOf(value))
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replaceValues(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::replaceAdditionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply {
            additionalQueryParams.removeAll(key)
        }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalQueryParams)
        }

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

        fun build(): RealTimePaymentsTransferCreateParams =
            RealTimePaymentsTransferCreateParams(
                checkNotNull(amount) { "`amount` is required but was not set" },
                checkNotNull(creditorName) { "`creditorName` is required but was not set" },
                checkNotNull(remittanceInformation) {
                    "`remittanceInformation` is required but was not set"
                },
                checkNotNull(sourceAccountNumberId) {
                    "`sourceAccountNumberId` is required but was not set"
                },
                debtorName,
                destinationAccountNumber,
                destinationRoutingNumber,
                externalAccountId,
                requireApproval,
                ultimateCreditorName,
                ultimateDebtorName,
                additionalHeaders
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalQueryParams
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalBodyProperties.toImmutable(),
            )
    }
}
