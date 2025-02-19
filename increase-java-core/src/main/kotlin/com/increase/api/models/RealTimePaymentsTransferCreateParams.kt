// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.Params
import com.increase.api.core.checkRequired
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.core.immutableEmptyMap
import com.increase.api.core.toImmutable
import java.util.Objects
import java.util.Optional

/** Create a Real-Time Payments Transfer */
class RealTimePaymentsTransferCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** The transfer amount in USD cents. For Real-Time Payments transfers, must be positive. */
    fun amount(): Long = body.amount()

    /** The name of the transfer's recipient. */
    fun creditorName(): String = body.creditorName()

    /** Unstructured information that will show on the recipient's bank statement. */
    fun remittanceInformation(): String = body.remittanceInformation()

    /** The identifier of the Account Number from which to send the transfer. */
    fun sourceAccountNumberId(): String = body.sourceAccountNumberId()

    /**
     * The name of the transfer's sender. If not provided, defaults to the name of the account's
     * entity.
     */
    fun debtorName(): Optional<String> = body.debtorName()

    /** The destination account number. */
    fun destinationAccountNumber(): Optional<String> = body.destinationAccountNumber()

    /** The destination American Bankers' Association (ABA) Routing Transit Number (RTN). */
    fun destinationRoutingNumber(): Optional<String> = body.destinationRoutingNumber()

    /**
     * The ID of an External Account to initiate a transfer to. If this parameter is provided,
     * `destination_account_number` and `destination_routing_number` must be absent.
     */
    fun externalAccountId(): Optional<String> = body.externalAccountId()

    /** Whether the transfer requires explicit approval via the dashboard or API. */
    fun requireApproval(): Optional<Boolean> = body.requireApproval()

    /**
     * The name of the ultimate recipient of the transfer. Set this if the creditor is an
     * intermediary receiving the payment for someone else.
     */
    fun ultimateCreditorName(): Optional<String> = body.ultimateCreditorName()

    /**
     * The name of the ultimate sender of the transfer. Set this if the funds are being sent on
     * behalf of someone who is not the account holder at Increase.
     */
    fun ultimateDebtorName(): Optional<String> = body.ultimateDebtorName()

    /** The transfer amount in USD cents. For Real-Time Payments transfers, must be positive. */
    fun _amount(): JsonField<Long> = body._amount()

    /** The name of the transfer's recipient. */
    fun _creditorName(): JsonField<String> = body._creditorName()

    /** Unstructured information that will show on the recipient's bank statement. */
    fun _remittanceInformation(): JsonField<String> = body._remittanceInformation()

    /** The identifier of the Account Number from which to send the transfer. */
    fun _sourceAccountNumberId(): JsonField<String> = body._sourceAccountNumberId()

    /**
     * The name of the transfer's sender. If not provided, defaults to the name of the account's
     * entity.
     */
    fun _debtorName(): JsonField<String> = body._debtorName()

    /** The destination account number. */
    fun _destinationAccountNumber(): JsonField<String> = body._destinationAccountNumber()

    /** The destination American Bankers' Association (ABA) Routing Transit Number (RTN). */
    fun _destinationRoutingNumber(): JsonField<String> = body._destinationRoutingNumber()

    /**
     * The ID of an External Account to initiate a transfer to. If this parameter is provided,
     * `destination_account_number` and `destination_routing_number` must be absent.
     */
    fun _externalAccountId(): JsonField<String> = body._externalAccountId()

    /** Whether the transfer requires explicit approval via the dashboard or API. */
    fun _requireApproval(): JsonField<Boolean> = body._requireApproval()

    /**
     * The name of the ultimate recipient of the transfer. Set this if the creditor is an
     * intermediary receiving the payment for someone else.
     */
    fun _ultimateCreditorName(): JsonField<String> = body._ultimateCreditorName()

    /**
     * The name of the ultimate sender of the transfer. Set this if the funds are being sent on
     * behalf of someone who is not the account holder at Increase.
     */
    fun _ultimateDebtorName(): JsonField<String> = body._ultimateDebtorName()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("amount")
        @ExcludeMissing
        private val amount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("creditor_name")
        @ExcludeMissing
        private val creditorName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("remittance_information")
        @ExcludeMissing
        private val remittanceInformation: JsonField<String> = JsonMissing.of(),
        @JsonProperty("source_account_number_id")
        @ExcludeMissing
        private val sourceAccountNumberId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("debtor_name")
        @ExcludeMissing
        private val debtorName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("destination_account_number")
        @ExcludeMissing
        private val destinationAccountNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("destination_routing_number")
        @ExcludeMissing
        private val destinationRoutingNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("external_account_id")
        @ExcludeMissing
        private val externalAccountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("require_approval")
        @ExcludeMissing
        private val requireApproval: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("ultimate_creditor_name")
        @ExcludeMissing
        private val ultimateCreditorName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ultimate_debtor_name")
        @ExcludeMissing
        private val ultimateDebtorName: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The transfer amount in USD cents. For Real-Time Payments transfers, must be positive. */
        fun amount(): Long = amount.getRequired("amount")

        /** The name of the transfer's recipient. */
        fun creditorName(): String = creditorName.getRequired("creditor_name")

        /** Unstructured information that will show on the recipient's bank statement. */
        fun remittanceInformation(): String =
            remittanceInformation.getRequired("remittance_information")

        /** The identifier of the Account Number from which to send the transfer. */
        fun sourceAccountNumberId(): String =
            sourceAccountNumberId.getRequired("source_account_number_id")

        /**
         * The name of the transfer's sender. If not provided, defaults to the name of the account's
         * entity.
         */
        fun debtorName(): Optional<String> =
            Optional.ofNullable(debtorName.getNullable("debtor_name"))

        /** The destination account number. */
        fun destinationAccountNumber(): Optional<String> =
            Optional.ofNullable(destinationAccountNumber.getNullable("destination_account_number"))

        /** The destination American Bankers' Association (ABA) Routing Transit Number (RTN). */
        fun destinationRoutingNumber(): Optional<String> =
            Optional.ofNullable(destinationRoutingNumber.getNullable("destination_routing_number"))

        /**
         * The ID of an External Account to initiate a transfer to. If this parameter is provided,
         * `destination_account_number` and `destination_routing_number` must be absent.
         */
        fun externalAccountId(): Optional<String> =
            Optional.ofNullable(externalAccountId.getNullable("external_account_id"))

        /** Whether the transfer requires explicit approval via the dashboard or API. */
        fun requireApproval(): Optional<Boolean> =
            Optional.ofNullable(requireApproval.getNullable("require_approval"))

        /**
         * The name of the ultimate recipient of the transfer. Set this if the creditor is an
         * intermediary receiving the payment for someone else.
         */
        fun ultimateCreditorName(): Optional<String> =
            Optional.ofNullable(ultimateCreditorName.getNullable("ultimate_creditor_name"))

        /**
         * The name of the ultimate sender of the transfer. Set this if the funds are being sent on
         * behalf of someone who is not the account holder at Increase.
         */
        fun ultimateDebtorName(): Optional<String> =
            Optional.ofNullable(ultimateDebtorName.getNullable("ultimate_debtor_name"))

        /** The transfer amount in USD cents. For Real-Time Payments transfers, must be positive. */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

        /** The name of the transfer's recipient. */
        @JsonProperty("creditor_name")
        @ExcludeMissing
        fun _creditorName(): JsonField<String> = creditorName

        /** Unstructured information that will show on the recipient's bank statement. */
        @JsonProperty("remittance_information")
        @ExcludeMissing
        fun _remittanceInformation(): JsonField<String> = remittanceInformation

        /** The identifier of the Account Number from which to send the transfer. */
        @JsonProperty("source_account_number_id")
        @ExcludeMissing
        fun _sourceAccountNumberId(): JsonField<String> = sourceAccountNumberId

        /**
         * The name of the transfer's sender. If not provided, defaults to the name of the account's
         * entity.
         */
        @JsonProperty("debtor_name")
        @ExcludeMissing
        fun _debtorName(): JsonField<String> = debtorName

        /** The destination account number. */
        @JsonProperty("destination_account_number")
        @ExcludeMissing
        fun _destinationAccountNumber(): JsonField<String> = destinationAccountNumber

        /** The destination American Bankers' Association (ABA) Routing Transit Number (RTN). */
        @JsonProperty("destination_routing_number")
        @ExcludeMissing
        fun _destinationRoutingNumber(): JsonField<String> = destinationRoutingNumber

        /**
         * The ID of an External Account to initiate a transfer to. If this parameter is provided,
         * `destination_account_number` and `destination_routing_number` must be absent.
         */
        @JsonProperty("external_account_id")
        @ExcludeMissing
        fun _externalAccountId(): JsonField<String> = externalAccountId

        /** Whether the transfer requires explicit approval via the dashboard or API. */
        @JsonProperty("require_approval")
        @ExcludeMissing
        fun _requireApproval(): JsonField<Boolean> = requireApproval

        /**
         * The name of the ultimate recipient of the transfer. Set this if the creditor is an
         * intermediary receiving the payment for someone else.
         */
        @JsonProperty("ultimate_creditor_name")
        @ExcludeMissing
        fun _ultimateCreditorName(): JsonField<String> = ultimateCreditorName

        /**
         * The name of the ultimate sender of the transfer. Set this if the funds are being sent on
         * behalf of someone who is not the account holder at Increase.
         */
        @JsonProperty("ultimate_debtor_name")
        @ExcludeMissing
        fun _ultimateDebtorName(): JsonField<String> = ultimateDebtorName

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

        fun toBuilder() = Builder().from(this)

        companion object {

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
             * The transfer amount in USD cents. For Real-Time Payments transfers, must be positive.
             */
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            /** The name of the transfer's recipient. */
            fun creditorName(creditorName: String) = creditorName(JsonField.of(creditorName))

            /** The name of the transfer's recipient. */
            fun creditorName(creditorName: JsonField<String>) = apply {
                this.creditorName = creditorName
            }

            /** Unstructured information that will show on the recipient's bank statement. */
            fun remittanceInformation(remittanceInformation: String) =
                remittanceInformation(JsonField.of(remittanceInformation))

            /** Unstructured information that will show on the recipient's bank statement. */
            fun remittanceInformation(remittanceInformation: JsonField<String>) = apply {
                this.remittanceInformation = remittanceInformation
            }

            /** The identifier of the Account Number from which to send the transfer. */
            fun sourceAccountNumberId(sourceAccountNumberId: String) =
                sourceAccountNumberId(JsonField.of(sourceAccountNumberId))

            /** The identifier of the Account Number from which to send the transfer. */
            fun sourceAccountNumberId(sourceAccountNumberId: JsonField<String>) = apply {
                this.sourceAccountNumberId = sourceAccountNumberId
            }

            /**
             * The name of the transfer's sender. If not provided, defaults to the name of the
             * account's entity.
             */
            fun debtorName(debtorName: String) = debtorName(JsonField.of(debtorName))

            /**
             * The name of the transfer's sender. If not provided, defaults to the name of the
             * account's entity.
             */
            fun debtorName(debtorName: JsonField<String>) = apply { this.debtorName = debtorName }

            /** The destination account number. */
            fun destinationAccountNumber(destinationAccountNumber: String) =
                destinationAccountNumber(JsonField.of(destinationAccountNumber))

            /** The destination account number. */
            fun destinationAccountNumber(destinationAccountNumber: JsonField<String>) = apply {
                this.destinationAccountNumber = destinationAccountNumber
            }

            /** The destination American Bankers' Association (ABA) Routing Transit Number (RTN). */
            fun destinationRoutingNumber(destinationRoutingNumber: String) =
                destinationRoutingNumber(JsonField.of(destinationRoutingNumber))

            /** The destination American Bankers' Association (ABA) Routing Transit Number (RTN). */
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
             * The ID of an External Account to initiate a transfer to. If this parameter is
             * provided, `destination_account_number` and `destination_routing_number` must be
             * absent.
             */
            fun externalAccountId(externalAccountId: JsonField<String>) = apply {
                this.externalAccountId = externalAccountId
            }

            /** Whether the transfer requires explicit approval via the dashboard or API. */
            fun requireApproval(requireApproval: Boolean) =
                requireApproval(JsonField.of(requireApproval))

            /** Whether the transfer requires explicit approval via the dashboard or API. */
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
             * The name of the ultimate recipient of the transfer. Set this if the creditor is an
             * intermediary receiving the payment for someone else.
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
             * The name of the ultimate sender of the transfer. Set this if the funds are being sent
             * on behalf of someone who is not the account holder at Increase.
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
                    additionalProperties.toImmutable(),
                )
        }

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

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RealTimePaymentsTransferCreateParams]. */
    @NoAutoDetect
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

        /** The transfer amount in USD cents. For Real-Time Payments transfers, must be positive. */
        fun amount(amount: Long) = apply { body.amount(amount) }

        /** The transfer amount in USD cents. For Real-Time Payments transfers, must be positive. */
        fun amount(amount: JsonField<Long>) = apply { body.amount(amount) }

        /** The name of the transfer's recipient. */
        fun creditorName(creditorName: String) = apply { body.creditorName(creditorName) }

        /** The name of the transfer's recipient. */
        fun creditorName(creditorName: JsonField<String>) = apply {
            body.creditorName(creditorName)
        }

        /** Unstructured information that will show on the recipient's bank statement. */
        fun remittanceInformation(remittanceInformation: String) = apply {
            body.remittanceInformation(remittanceInformation)
        }

        /** Unstructured information that will show on the recipient's bank statement. */
        fun remittanceInformation(remittanceInformation: JsonField<String>) = apply {
            body.remittanceInformation(remittanceInformation)
        }

        /** The identifier of the Account Number from which to send the transfer. */
        fun sourceAccountNumberId(sourceAccountNumberId: String) = apply {
            body.sourceAccountNumberId(sourceAccountNumberId)
        }

        /** The identifier of the Account Number from which to send the transfer. */
        fun sourceAccountNumberId(sourceAccountNumberId: JsonField<String>) = apply {
            body.sourceAccountNumberId(sourceAccountNumberId)
        }

        /**
         * The name of the transfer's sender. If not provided, defaults to the name of the account's
         * entity.
         */
        fun debtorName(debtorName: String) = apply { body.debtorName(debtorName) }

        /**
         * The name of the transfer's sender. If not provided, defaults to the name of the account's
         * entity.
         */
        fun debtorName(debtorName: JsonField<String>) = apply { body.debtorName(debtorName) }

        /** The destination account number. */
        fun destinationAccountNumber(destinationAccountNumber: String) = apply {
            body.destinationAccountNumber(destinationAccountNumber)
        }

        /** The destination account number. */
        fun destinationAccountNumber(destinationAccountNumber: JsonField<String>) = apply {
            body.destinationAccountNumber(destinationAccountNumber)
        }

        /** The destination American Bankers' Association (ABA) Routing Transit Number (RTN). */
        fun destinationRoutingNumber(destinationRoutingNumber: String) = apply {
            body.destinationRoutingNumber(destinationRoutingNumber)
        }

        /** The destination American Bankers' Association (ABA) Routing Transit Number (RTN). */
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
         * The ID of an External Account to initiate a transfer to. If this parameter is provided,
         * `destination_account_number` and `destination_routing_number` must be absent.
         */
        fun externalAccountId(externalAccountId: JsonField<String>) = apply {
            body.externalAccountId(externalAccountId)
        }

        /** Whether the transfer requires explicit approval via the dashboard or API. */
        fun requireApproval(requireApproval: Boolean) = apply {
            body.requireApproval(requireApproval)
        }

        /** Whether the transfer requires explicit approval via the dashboard or API. */
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
         * The name of the ultimate recipient of the transfer. Set this if the creditor is an
         * intermediary receiving the payment for someone else.
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
         * The name of the ultimate sender of the transfer. Set this if the funds are being sent on
         * behalf of someone who is not the account holder at Increase.
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

        fun build(): RealTimePaymentsTransferCreateParams =
            RealTimePaymentsTransferCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
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
