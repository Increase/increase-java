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

class RealTimePaymentsTransferCreateParams
constructor(
    private val sourceAccountNumberId: String,
    private val destinationAccountNumber: String?,
    private val destinationRoutingNumber: String?,
    private val externalAccountId: String?,
    private val amount: Long,
    private val creditorName: String,
    private val remittanceInformation: String,
    private val requireApproval: Boolean?,
    private val uniqueIdentifier: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun sourceAccountNumberId(): String = sourceAccountNumberId

    fun destinationAccountNumber(): Optional<String> = Optional.ofNullable(destinationAccountNumber)

    fun destinationRoutingNumber(): Optional<String> = Optional.ofNullable(destinationRoutingNumber)

    fun externalAccountId(): Optional<String> = Optional.ofNullable(externalAccountId)

    fun amount(): Long = amount

    fun creditorName(): String = creditorName

    fun remittanceInformation(): String = remittanceInformation

    fun requireApproval(): Optional<Boolean> = Optional.ofNullable(requireApproval)

    fun uniqueIdentifier(): Optional<String> = Optional.ofNullable(uniqueIdentifier)

    @JvmSynthetic
    internal fun getBody(): RealTimePaymentsTransferCreateBody {
        return RealTimePaymentsTransferCreateBody(
            sourceAccountNumberId,
            destinationAccountNumber,
            destinationRoutingNumber,
            externalAccountId,
            amount,
            creditorName,
            remittanceInformation,
            requireApproval,
            uniqueIdentifier,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = RealTimePaymentsTransferCreateBody.Builder::class)
    @NoAutoDetect
    class RealTimePaymentsTransferCreateBody
    internal constructor(
        private val sourceAccountNumberId: String?,
        private val destinationAccountNumber: String?,
        private val destinationRoutingNumber: String?,
        private val externalAccountId: String?,
        private val amount: Long?,
        private val creditorName: String?,
        private val remittanceInformation: String?,
        private val requireApproval: Boolean?,
        private val uniqueIdentifier: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** The identifier of the Account Number from which to send the transfer. */
        @JsonProperty("source_account_number_id")
        fun sourceAccountNumberId(): String? = sourceAccountNumberId

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

        /** The transfer amount in USD cents. For Real Time Payments transfers, must be positive. */
        @JsonProperty("amount") fun amount(): Long? = amount

        /** The name of the transfer's recipient. */
        @JsonProperty("creditor_name") fun creditorName(): String? = creditorName

        /** Unstructured information that will show on the recipient's bank statement. */
        @JsonProperty("remittance_information")
        fun remittanceInformation(): String? = remittanceInformation

        /** Whether the transfer requires explicit approval via the dashboard or API. */
        @JsonProperty("require_approval") fun requireApproval(): Boolean? = requireApproval

        /**
         * A unique identifier you choose for the transfer. Reusing this identifer for another
         * transfer will result in an error. You can query for the transfer associated with this
         * identifier using the List endpoint.
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

            return other is RealTimePaymentsTransferCreateBody &&
                this.sourceAccountNumberId == other.sourceAccountNumberId &&
                this.destinationAccountNumber == other.destinationAccountNumber &&
                this.destinationRoutingNumber == other.destinationRoutingNumber &&
                this.externalAccountId == other.externalAccountId &&
                this.amount == other.amount &&
                this.creditorName == other.creditorName &&
                this.remittanceInformation == other.remittanceInformation &&
                this.requireApproval == other.requireApproval &&
                this.uniqueIdentifier == other.uniqueIdentifier &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        sourceAccountNumberId,
                        destinationAccountNumber,
                        destinationRoutingNumber,
                        externalAccountId,
                        amount,
                        creditorName,
                        remittanceInformation,
                        requireApproval,
                        uniqueIdentifier,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "RealTimePaymentsTransferCreateBody{sourceAccountNumberId=$sourceAccountNumberId, destinationAccountNumber=$destinationAccountNumber, destinationRoutingNumber=$destinationRoutingNumber, externalAccountId=$externalAccountId, amount=$amount, creditorName=$creditorName, remittanceInformation=$remittanceInformation, requireApproval=$requireApproval, uniqueIdentifier=$uniqueIdentifier, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var sourceAccountNumberId: String? = null
            private var destinationAccountNumber: String? = null
            private var destinationRoutingNumber: String? = null
            private var externalAccountId: String? = null
            private var amount: Long? = null
            private var creditorName: String? = null
            private var remittanceInformation: String? = null
            private var requireApproval: Boolean? = null
            private var uniqueIdentifier: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                realTimePaymentsTransferCreateBody: RealTimePaymentsTransferCreateBody
            ) = apply {
                this.sourceAccountNumberId =
                    realTimePaymentsTransferCreateBody.sourceAccountNumberId
                this.destinationAccountNumber =
                    realTimePaymentsTransferCreateBody.destinationAccountNumber
                this.destinationRoutingNumber =
                    realTimePaymentsTransferCreateBody.destinationRoutingNumber
                this.externalAccountId = realTimePaymentsTransferCreateBody.externalAccountId
                this.amount = realTimePaymentsTransferCreateBody.amount
                this.creditorName = realTimePaymentsTransferCreateBody.creditorName
                this.remittanceInformation =
                    realTimePaymentsTransferCreateBody.remittanceInformation
                this.requireApproval = realTimePaymentsTransferCreateBody.requireApproval
                this.uniqueIdentifier = realTimePaymentsTransferCreateBody.uniqueIdentifier
                additionalProperties(realTimePaymentsTransferCreateBody.additionalProperties)
            }

            /** The identifier of the Account Number from which to send the transfer. */
            @JsonProperty("source_account_number_id")
            fun sourceAccountNumberId(sourceAccountNumberId: String) = apply {
                this.sourceAccountNumberId = sourceAccountNumberId
            }

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

            /**
             * The transfer amount in USD cents. For Real Time Payments transfers, must be positive.
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

            /** Whether the transfer requires explicit approval via the dashboard or API. */
            @JsonProperty("require_approval")
            fun requireApproval(requireApproval: Boolean) = apply {
                this.requireApproval = requireApproval
            }

            /**
             * A unique identifier you choose for the transfer. Reusing this identifer for another
             * transfer will result in an error. You can query for the transfer associated with this
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

            fun build(): RealTimePaymentsTransferCreateBody =
                RealTimePaymentsTransferCreateBody(
                    checkNotNull(sourceAccountNumberId) {
                        "`sourceAccountNumberId` is required but was not set"
                    },
                    destinationAccountNumber,
                    destinationRoutingNumber,
                    externalAccountId,
                    checkNotNull(amount) { "`amount` is required but was not set" },
                    checkNotNull(creditorName) { "`creditorName` is required but was not set" },
                    checkNotNull(remittanceInformation) {
                        "`remittanceInformation` is required but was not set"
                    },
                    requireApproval,
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

        return other is RealTimePaymentsTransferCreateParams &&
            this.sourceAccountNumberId == other.sourceAccountNumberId &&
            this.destinationAccountNumber == other.destinationAccountNumber &&
            this.destinationRoutingNumber == other.destinationRoutingNumber &&
            this.externalAccountId == other.externalAccountId &&
            this.amount == other.amount &&
            this.creditorName == other.creditorName &&
            this.remittanceInformation == other.remittanceInformation &&
            this.requireApproval == other.requireApproval &&
            this.uniqueIdentifier == other.uniqueIdentifier &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            sourceAccountNumberId,
            destinationAccountNumber,
            destinationRoutingNumber,
            externalAccountId,
            amount,
            creditorName,
            remittanceInformation,
            requireApproval,
            uniqueIdentifier,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "RealTimePaymentsTransferCreateParams{sourceAccountNumberId=$sourceAccountNumberId, destinationAccountNumber=$destinationAccountNumber, destinationRoutingNumber=$destinationRoutingNumber, externalAccountId=$externalAccountId, amount=$amount, creditorName=$creditorName, remittanceInformation=$remittanceInformation, requireApproval=$requireApproval, uniqueIdentifier=$uniqueIdentifier, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var sourceAccountNumberId: String? = null
        private var destinationAccountNumber: String? = null
        private var destinationRoutingNumber: String? = null
        private var externalAccountId: String? = null
        private var amount: Long? = null
        private var creditorName: String? = null
        private var remittanceInformation: String? = null
        private var requireApproval: Boolean? = null
        private var uniqueIdentifier: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            realTimePaymentsTransferCreateParams: RealTimePaymentsTransferCreateParams
        ) = apply {
            this.sourceAccountNumberId = realTimePaymentsTransferCreateParams.sourceAccountNumberId
            this.destinationAccountNumber =
                realTimePaymentsTransferCreateParams.destinationAccountNumber
            this.destinationRoutingNumber =
                realTimePaymentsTransferCreateParams.destinationRoutingNumber
            this.externalAccountId = realTimePaymentsTransferCreateParams.externalAccountId
            this.amount = realTimePaymentsTransferCreateParams.amount
            this.creditorName = realTimePaymentsTransferCreateParams.creditorName
            this.remittanceInformation = realTimePaymentsTransferCreateParams.remittanceInformation
            this.requireApproval = realTimePaymentsTransferCreateParams.requireApproval
            this.uniqueIdentifier = realTimePaymentsTransferCreateParams.uniqueIdentifier
            additionalQueryParams(realTimePaymentsTransferCreateParams.additionalQueryParams)
            additionalHeaders(realTimePaymentsTransferCreateParams.additionalHeaders)
            additionalBodyProperties(realTimePaymentsTransferCreateParams.additionalBodyProperties)
        }

        /** The identifier of the Account Number from which to send the transfer. */
        fun sourceAccountNumberId(sourceAccountNumberId: String) = apply {
            this.sourceAccountNumberId = sourceAccountNumberId
        }

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

        /** The transfer amount in USD cents. For Real Time Payments transfers, must be positive. */
        fun amount(amount: Long) = apply { this.amount = amount }

        /** The name of the transfer's recipient. */
        fun creditorName(creditorName: String) = apply { this.creditorName = creditorName }

        /** Unstructured information that will show on the recipient's bank statement. */
        fun remittanceInformation(remittanceInformation: String) = apply {
            this.remittanceInformation = remittanceInformation
        }

        /** Whether the transfer requires explicit approval via the dashboard or API. */
        fun requireApproval(requireApproval: Boolean) = apply {
            this.requireApproval = requireApproval
        }

        /**
         * A unique identifier you choose for the transfer. Reusing this identifer for another
         * transfer will result in an error. You can query for the transfer associated with this
         * identifier using the List endpoint.
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

        fun build(): RealTimePaymentsTransferCreateParams =
            RealTimePaymentsTransferCreateParams(
                checkNotNull(sourceAccountNumberId) {
                    "`sourceAccountNumberId` is required but was not set"
                },
                destinationAccountNumber,
                destinationRoutingNumber,
                externalAccountId,
                checkNotNull(amount) { "`amount` is required but was not set" },
                checkNotNull(creditorName) { "`creditorName` is required but was not set" },
                checkNotNull(remittanceInformation) {
                    "`remittanceInformation` is required but was not set"
                },
                requireApproval,
                uniqueIdentifier,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }
}
