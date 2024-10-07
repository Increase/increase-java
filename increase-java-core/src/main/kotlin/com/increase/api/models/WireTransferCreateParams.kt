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

class WireTransferCreateParams
constructor(
    private val accountId: String,
    private val amount: Long,
    private val beneficiaryName: String,
    private val messageToRecipient: String,
    private val accountNumber: String?,
    private val beneficiaryAddressLine1: String?,
    private val beneficiaryAddressLine2: String?,
    private val beneficiaryAddressLine3: String?,
    private val externalAccountId: String?,
    private val originatorAddressLine1: String?,
    private val originatorAddressLine2: String?,
    private val originatorAddressLine3: String?,
    private val originatorName: String?,
    private val requireApproval: Boolean?,
    private val routingNumber: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun accountId(): String = accountId

    fun amount(): Long = amount

    fun beneficiaryName(): String = beneficiaryName

    fun messageToRecipient(): String = messageToRecipient

    fun accountNumber(): Optional<String> = Optional.ofNullable(accountNumber)

    fun beneficiaryAddressLine1(): Optional<String> = Optional.ofNullable(beneficiaryAddressLine1)

    fun beneficiaryAddressLine2(): Optional<String> = Optional.ofNullable(beneficiaryAddressLine2)

    fun beneficiaryAddressLine3(): Optional<String> = Optional.ofNullable(beneficiaryAddressLine3)

    fun externalAccountId(): Optional<String> = Optional.ofNullable(externalAccountId)

    fun originatorAddressLine1(): Optional<String> = Optional.ofNullable(originatorAddressLine1)

    fun originatorAddressLine2(): Optional<String> = Optional.ofNullable(originatorAddressLine2)

    fun originatorAddressLine3(): Optional<String> = Optional.ofNullable(originatorAddressLine3)

    fun originatorName(): Optional<String> = Optional.ofNullable(originatorName)

    fun requireApproval(): Optional<Boolean> = Optional.ofNullable(requireApproval)

    fun routingNumber(): Optional<String> = Optional.ofNullable(routingNumber)

    @JvmSynthetic
    internal fun getBody(): WireTransferCreateBody {
        return WireTransferCreateBody(
            accountId,
            amount,
            beneficiaryName,
            messageToRecipient,
            accountNumber,
            beneficiaryAddressLine1,
            beneficiaryAddressLine2,
            beneficiaryAddressLine3,
            externalAccountId,
            originatorAddressLine1,
            originatorAddressLine2,
            originatorAddressLine3,
            originatorName,
            requireApproval,
            routingNumber,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = WireTransferCreateBody.Builder::class)
    @NoAutoDetect
    class WireTransferCreateBody
    internal constructor(
        private val accountId: String?,
        private val amount: Long?,
        private val beneficiaryName: String?,
        private val messageToRecipient: String?,
        private val accountNumber: String?,
        private val beneficiaryAddressLine1: String?,
        private val beneficiaryAddressLine2: String?,
        private val beneficiaryAddressLine3: String?,
        private val externalAccountId: String?,
        private val originatorAddressLine1: String?,
        private val originatorAddressLine2: String?,
        private val originatorAddressLine3: String?,
        private val originatorName: String?,
        private val requireApproval: Boolean?,
        private val routingNumber: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The identifier for the account that will send the transfer. */
        @JsonProperty("account_id") fun accountId(): String? = accountId

        /** The transfer amount in cents. */
        @JsonProperty("amount") fun amount(): Long? = amount

        /** The beneficiary's name. */
        @JsonProperty("beneficiary_name") fun beneficiaryName(): String? = beneficiaryName

        /** The message that will show on the recipient's bank statement. */
        @JsonProperty("message_to_recipient") fun messageToRecipient(): String? = messageToRecipient

        /** The account number for the destination account. */
        @JsonProperty("account_number") fun accountNumber(): String? = accountNumber

        /** The beneficiary's address line 1. */
        @JsonProperty("beneficiary_address_line1")
        fun beneficiaryAddressLine1(): String? = beneficiaryAddressLine1

        /** The beneficiary's address line 2. */
        @JsonProperty("beneficiary_address_line2")
        fun beneficiaryAddressLine2(): String? = beneficiaryAddressLine2

        /** The beneficiary's address line 3. */
        @JsonProperty("beneficiary_address_line3")
        fun beneficiaryAddressLine3(): String? = beneficiaryAddressLine3

        /**
         * The ID of an External Account to initiate a transfer to. If this parameter is provided,
         * `account_number` and `routing_number` must be absent.
         */
        @JsonProperty("external_account_id") fun externalAccountId(): String? = externalAccountId

        /**
         * The originator's address line 1. This is only necessary if you're transferring from a
         * commingled account. Otherwise, we'll use the associated entity's details.
         */
        @JsonProperty("originator_address_line1")
        fun originatorAddressLine1(): String? = originatorAddressLine1

        /**
         * The originator's address line 2. This is only necessary if you're transferring from a
         * commingled account. Otherwise, we'll use the associated entity's details.
         */
        @JsonProperty("originator_address_line2")
        fun originatorAddressLine2(): String? = originatorAddressLine2

        /**
         * The originator's address line 3. This is only necessary if you're transferring from a
         * commingled account. Otherwise, we'll use the associated entity's details.
         */
        @JsonProperty("originator_address_line3")
        fun originatorAddressLine3(): String? = originatorAddressLine3

        /**
         * The originator's name. This is only necessary if you're transferring from a commingled
         * account. Otherwise, we'll use the associated entity's details.
         */
        @JsonProperty("originator_name") fun originatorName(): String? = originatorName

        /** Whether the transfer requires explicit approval via the dashboard or API. */
        @JsonProperty("require_approval") fun requireApproval(): Boolean? = requireApproval

        /**
         * The American Bankers' Association (ABA) Routing Transit Number (RTN) for the destination
         * account.
         */
        @JsonProperty("routing_number") fun routingNumber(): String? = routingNumber

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var accountId: String? = null
            private var amount: Long? = null
            private var beneficiaryName: String? = null
            private var messageToRecipient: String? = null
            private var accountNumber: String? = null
            private var beneficiaryAddressLine1: String? = null
            private var beneficiaryAddressLine2: String? = null
            private var beneficiaryAddressLine3: String? = null
            private var externalAccountId: String? = null
            private var originatorAddressLine1: String? = null
            private var originatorAddressLine2: String? = null
            private var originatorAddressLine3: String? = null
            private var originatorName: String? = null
            private var requireApproval: Boolean? = null
            private var routingNumber: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(wireTransferCreateBody: WireTransferCreateBody) = apply {
                this.accountId = wireTransferCreateBody.accountId
                this.amount = wireTransferCreateBody.amount
                this.beneficiaryName = wireTransferCreateBody.beneficiaryName
                this.messageToRecipient = wireTransferCreateBody.messageToRecipient
                this.accountNumber = wireTransferCreateBody.accountNumber
                this.beneficiaryAddressLine1 = wireTransferCreateBody.beneficiaryAddressLine1
                this.beneficiaryAddressLine2 = wireTransferCreateBody.beneficiaryAddressLine2
                this.beneficiaryAddressLine3 = wireTransferCreateBody.beneficiaryAddressLine3
                this.externalAccountId = wireTransferCreateBody.externalAccountId
                this.originatorAddressLine1 = wireTransferCreateBody.originatorAddressLine1
                this.originatorAddressLine2 = wireTransferCreateBody.originatorAddressLine2
                this.originatorAddressLine3 = wireTransferCreateBody.originatorAddressLine3
                this.originatorName = wireTransferCreateBody.originatorName
                this.requireApproval = wireTransferCreateBody.requireApproval
                this.routingNumber = wireTransferCreateBody.routingNumber
                additionalProperties(wireTransferCreateBody.additionalProperties)
            }

            /** The identifier for the account that will send the transfer. */
            @JsonProperty("account_id")
            fun accountId(accountId: String) = apply { this.accountId = accountId }

            /** The transfer amount in cents. */
            @JsonProperty("amount") fun amount(amount: Long) = apply { this.amount = amount }

            /** The beneficiary's name. */
            @JsonProperty("beneficiary_name")
            fun beneficiaryName(beneficiaryName: String) = apply {
                this.beneficiaryName = beneficiaryName
            }

            /** The message that will show on the recipient's bank statement. */
            @JsonProperty("message_to_recipient")
            fun messageToRecipient(messageToRecipient: String) = apply {
                this.messageToRecipient = messageToRecipient
            }

            /** The account number for the destination account. */
            @JsonProperty("account_number")
            fun accountNumber(accountNumber: String) = apply { this.accountNumber = accountNumber }

            /** The beneficiary's address line 1. */
            @JsonProperty("beneficiary_address_line1")
            fun beneficiaryAddressLine1(beneficiaryAddressLine1: String) = apply {
                this.beneficiaryAddressLine1 = beneficiaryAddressLine1
            }

            /** The beneficiary's address line 2. */
            @JsonProperty("beneficiary_address_line2")
            fun beneficiaryAddressLine2(beneficiaryAddressLine2: String) = apply {
                this.beneficiaryAddressLine2 = beneficiaryAddressLine2
            }

            /** The beneficiary's address line 3. */
            @JsonProperty("beneficiary_address_line3")
            fun beneficiaryAddressLine3(beneficiaryAddressLine3: String) = apply {
                this.beneficiaryAddressLine3 = beneficiaryAddressLine3
            }

            /**
             * The ID of an External Account to initiate a transfer to. If this parameter is
             * provided, `account_number` and `routing_number` must be absent.
             */
            @JsonProperty("external_account_id")
            fun externalAccountId(externalAccountId: String) = apply {
                this.externalAccountId = externalAccountId
            }

            /**
             * The originator's address line 1. This is only necessary if you're transferring from a
             * commingled account. Otherwise, we'll use the associated entity's details.
             */
            @JsonProperty("originator_address_line1")
            fun originatorAddressLine1(originatorAddressLine1: String) = apply {
                this.originatorAddressLine1 = originatorAddressLine1
            }

            /**
             * The originator's address line 2. This is only necessary if you're transferring from a
             * commingled account. Otherwise, we'll use the associated entity's details.
             */
            @JsonProperty("originator_address_line2")
            fun originatorAddressLine2(originatorAddressLine2: String) = apply {
                this.originatorAddressLine2 = originatorAddressLine2
            }

            /**
             * The originator's address line 3. This is only necessary if you're transferring from a
             * commingled account. Otherwise, we'll use the associated entity's details.
             */
            @JsonProperty("originator_address_line3")
            fun originatorAddressLine3(originatorAddressLine3: String) = apply {
                this.originatorAddressLine3 = originatorAddressLine3
            }

            /**
             * The originator's name. This is only necessary if you're transferring from a
             * commingled account. Otherwise, we'll use the associated entity's details.
             */
            @JsonProperty("originator_name")
            fun originatorName(originatorName: String) = apply {
                this.originatorName = originatorName
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

            fun build(): WireTransferCreateBody =
                WireTransferCreateBody(
                    checkNotNull(accountId) { "`accountId` is required but was not set" },
                    checkNotNull(amount) { "`amount` is required but was not set" },
                    checkNotNull(beneficiaryName) {
                        "`beneficiaryName` is required but was not set"
                    },
                    checkNotNull(messageToRecipient) {
                        "`messageToRecipient` is required but was not set"
                    },
                    accountNumber,
                    beneficiaryAddressLine1,
                    beneficiaryAddressLine2,
                    beneficiaryAddressLine3,
                    externalAccountId,
                    originatorAddressLine1,
                    originatorAddressLine2,
                    originatorAddressLine3,
                    originatorName,
                    requireApproval,
                    routingNumber,
                    additionalProperties.toUnmodifiable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is WireTransferCreateBody && this.accountId == other.accountId && this.amount == other.amount && this.beneficiaryName == other.beneficiaryName && this.messageToRecipient == other.messageToRecipient && this.accountNumber == other.accountNumber && this.beneficiaryAddressLine1 == other.beneficiaryAddressLine1 && this.beneficiaryAddressLine2 == other.beneficiaryAddressLine2 && this.beneficiaryAddressLine3 == other.beneficiaryAddressLine3 && this.externalAccountId == other.externalAccountId && this.originatorAddressLine1 == other.originatorAddressLine1 && this.originatorAddressLine2 == other.originatorAddressLine2 && this.originatorAddressLine3 == other.originatorAddressLine3 && this.originatorName == other.originatorName && this.requireApproval == other.requireApproval && this.routingNumber == other.routingNumber && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(accountId, amount, beneficiaryName, messageToRecipient, accountNumber, beneficiaryAddressLine1, beneficiaryAddressLine2, beneficiaryAddressLine3, externalAccountId, originatorAddressLine1, originatorAddressLine2, originatorAddressLine3, originatorName, requireApproval, routingNumber, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "WireTransferCreateBody{accountId=$accountId, amount=$amount, beneficiaryName=$beneficiaryName, messageToRecipient=$messageToRecipient, accountNumber=$accountNumber, beneficiaryAddressLine1=$beneficiaryAddressLine1, beneficiaryAddressLine2=$beneficiaryAddressLine2, beneficiaryAddressLine3=$beneficiaryAddressLine3, externalAccountId=$externalAccountId, originatorAddressLine1=$originatorAddressLine1, originatorAddressLine2=$originatorAddressLine2, originatorAddressLine3=$originatorAddressLine3, originatorName=$originatorName, requireApproval=$requireApproval, routingNumber=$routingNumber, additionalProperties=$additionalProperties}"
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is WireTransferCreateParams && this.accountId == other.accountId && this.amount == other.amount && this.beneficiaryName == other.beneficiaryName && this.messageToRecipient == other.messageToRecipient && this.accountNumber == other.accountNumber && this.beneficiaryAddressLine1 == other.beneficiaryAddressLine1 && this.beneficiaryAddressLine2 == other.beneficiaryAddressLine2 && this.beneficiaryAddressLine3 == other.beneficiaryAddressLine3 && this.externalAccountId == other.externalAccountId && this.originatorAddressLine1 == other.originatorAddressLine1 && this.originatorAddressLine2 == other.originatorAddressLine2 && this.originatorAddressLine3 == other.originatorAddressLine3 && this.originatorName == other.originatorName && this.requireApproval == other.requireApproval && this.routingNumber == other.routingNumber && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(accountId, amount, beneficiaryName, messageToRecipient, accountNumber, beneficiaryAddressLine1, beneficiaryAddressLine2, beneficiaryAddressLine3, externalAccountId, originatorAddressLine1, originatorAddressLine2, originatorAddressLine3, originatorName, requireApproval, routingNumber, additionalQueryParams, additionalHeaders, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "WireTransferCreateParams{accountId=$accountId, amount=$amount, beneficiaryName=$beneficiaryName, messageToRecipient=$messageToRecipient, accountNumber=$accountNumber, beneficiaryAddressLine1=$beneficiaryAddressLine1, beneficiaryAddressLine2=$beneficiaryAddressLine2, beneficiaryAddressLine3=$beneficiaryAddressLine3, externalAccountId=$externalAccountId, originatorAddressLine1=$originatorAddressLine1, originatorAddressLine2=$originatorAddressLine2, originatorAddressLine3=$originatorAddressLine3, originatorName=$originatorName, requireApproval=$requireApproval, routingNumber=$routingNumber, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var accountId: String? = null
        private var amount: Long? = null
        private var beneficiaryName: String? = null
        private var messageToRecipient: String? = null
        private var accountNumber: String? = null
        private var beneficiaryAddressLine1: String? = null
        private var beneficiaryAddressLine2: String? = null
        private var beneficiaryAddressLine3: String? = null
        private var externalAccountId: String? = null
        private var originatorAddressLine1: String? = null
        private var originatorAddressLine2: String? = null
        private var originatorAddressLine3: String? = null
        private var originatorName: String? = null
        private var requireApproval: Boolean? = null
        private var routingNumber: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(wireTransferCreateParams: WireTransferCreateParams) = apply {
            this.accountId = wireTransferCreateParams.accountId
            this.amount = wireTransferCreateParams.amount
            this.beneficiaryName = wireTransferCreateParams.beneficiaryName
            this.messageToRecipient = wireTransferCreateParams.messageToRecipient
            this.accountNumber = wireTransferCreateParams.accountNumber
            this.beneficiaryAddressLine1 = wireTransferCreateParams.beneficiaryAddressLine1
            this.beneficiaryAddressLine2 = wireTransferCreateParams.beneficiaryAddressLine2
            this.beneficiaryAddressLine3 = wireTransferCreateParams.beneficiaryAddressLine3
            this.externalAccountId = wireTransferCreateParams.externalAccountId
            this.originatorAddressLine1 = wireTransferCreateParams.originatorAddressLine1
            this.originatorAddressLine2 = wireTransferCreateParams.originatorAddressLine2
            this.originatorAddressLine3 = wireTransferCreateParams.originatorAddressLine3
            this.originatorName = wireTransferCreateParams.originatorName
            this.requireApproval = wireTransferCreateParams.requireApproval
            this.routingNumber = wireTransferCreateParams.routingNumber
            additionalQueryParams(wireTransferCreateParams.additionalQueryParams)
            additionalHeaders(wireTransferCreateParams.additionalHeaders)
            additionalBodyProperties(wireTransferCreateParams.additionalBodyProperties)
        }

        /** The identifier for the account that will send the transfer. */
        fun accountId(accountId: String) = apply { this.accountId = accountId }

        /** The transfer amount in cents. */
        fun amount(amount: Long) = apply { this.amount = amount }

        /** The beneficiary's name. */
        fun beneficiaryName(beneficiaryName: String) = apply {
            this.beneficiaryName = beneficiaryName
        }

        /** The message that will show on the recipient's bank statement. */
        fun messageToRecipient(messageToRecipient: String) = apply {
            this.messageToRecipient = messageToRecipient
        }

        /** The account number for the destination account. */
        fun accountNumber(accountNumber: String) = apply { this.accountNumber = accountNumber }

        /** The beneficiary's address line 1. */
        fun beneficiaryAddressLine1(beneficiaryAddressLine1: String) = apply {
            this.beneficiaryAddressLine1 = beneficiaryAddressLine1
        }

        /** The beneficiary's address line 2. */
        fun beneficiaryAddressLine2(beneficiaryAddressLine2: String) = apply {
            this.beneficiaryAddressLine2 = beneficiaryAddressLine2
        }

        /** The beneficiary's address line 3. */
        fun beneficiaryAddressLine3(beneficiaryAddressLine3: String) = apply {
            this.beneficiaryAddressLine3 = beneficiaryAddressLine3
        }

        /**
         * The ID of an External Account to initiate a transfer to. If this parameter is provided,
         * `account_number` and `routing_number` must be absent.
         */
        fun externalAccountId(externalAccountId: String) = apply {
            this.externalAccountId = externalAccountId
        }

        /**
         * The originator's address line 1. This is only necessary if you're transferring from a
         * commingled account. Otherwise, we'll use the associated entity's details.
         */
        fun originatorAddressLine1(originatorAddressLine1: String) = apply {
            this.originatorAddressLine1 = originatorAddressLine1
        }

        /**
         * The originator's address line 2. This is only necessary if you're transferring from a
         * commingled account. Otherwise, we'll use the associated entity's details.
         */
        fun originatorAddressLine2(originatorAddressLine2: String) = apply {
            this.originatorAddressLine2 = originatorAddressLine2
        }

        /**
         * The originator's address line 3. This is only necessary if you're transferring from a
         * commingled account. Otherwise, we'll use the associated entity's details.
         */
        fun originatorAddressLine3(originatorAddressLine3: String) = apply {
            this.originatorAddressLine3 = originatorAddressLine3
        }

        /**
         * The originator's name. This is only necessary if you're transferring from a commingled
         * account. Otherwise, we'll use the associated entity's details.
         */
        fun originatorName(originatorName: String) = apply { this.originatorName = originatorName }

        /** Whether the transfer requires explicit approval via the dashboard or API. */
        fun requireApproval(requireApproval: Boolean) = apply {
            this.requireApproval = requireApproval
        }

        /**
         * The American Bankers' Association (ABA) Routing Transit Number (RTN) for the destination
         * account.
         */
        fun routingNumber(routingNumber: String) = apply { this.routingNumber = routingNumber }

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

        fun build(): WireTransferCreateParams =
            WireTransferCreateParams(
                checkNotNull(accountId) { "`accountId` is required but was not set" },
                checkNotNull(amount) { "`amount` is required but was not set" },
                checkNotNull(beneficiaryName) { "`beneficiaryName` is required but was not set" },
                checkNotNull(messageToRecipient) {
                    "`messageToRecipient` is required but was not set"
                },
                accountNumber,
                beneficiaryAddressLine1,
                beneficiaryAddressLine2,
                beneficiaryAddressLine3,
                externalAccountId,
                originatorAddressLine1,
                originatorAddressLine2,
                originatorAddressLine3,
                originatorName,
                requireApproval,
                routingNumber,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }
}
