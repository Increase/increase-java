// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.core.immutableEmptyMap
import com.increase.api.core.toImmutable
import java.util.Objects
import java.util.Optional

class WireTransferCreateParams
constructor(
    private val body: WireTransferCreateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    /** The identifier for the account that will send the transfer. */
    fun accountId(): String = body.accountId()

    /** The transfer amount in USD cents. */
    fun amount(): Long = body.amount()

    /** The beneficiary's name. */
    fun beneficiaryName(): String = body.beneficiaryName()

    /** The message that will show on the recipient's bank statement. */
    fun messageToRecipient(): String = body.messageToRecipient()

    /** The account number for the destination account. */
    fun accountNumber(): Optional<String> = body.accountNumber()

    /** The beneficiary's address line 1. */
    fun beneficiaryAddressLine1(): Optional<String> = body.beneficiaryAddressLine1()

    /** The beneficiary's address line 2. */
    fun beneficiaryAddressLine2(): Optional<String> = body.beneficiaryAddressLine2()

    /** The beneficiary's address line 3. */
    fun beneficiaryAddressLine3(): Optional<String> = body.beneficiaryAddressLine3()

    /**
     * The ID of an External Account to initiate a transfer to. If this parameter is provided,
     * `account_number` and `routing_number` must be absent.
     */
    fun externalAccountId(): Optional<String> = body.externalAccountId()

    /**
     * The originator's address line 1. This is only necessary if you're transferring from a
     * commingled account. Otherwise, we'll use the associated entity's details.
     */
    fun originatorAddressLine1(): Optional<String> = body.originatorAddressLine1()

    /**
     * The originator's address line 2. This is only necessary if you're transferring from a
     * commingled account. Otherwise, we'll use the associated entity's details.
     */
    fun originatorAddressLine2(): Optional<String> = body.originatorAddressLine2()

    /**
     * The originator's address line 3. This is only necessary if you're transferring from a
     * commingled account. Otherwise, we'll use the associated entity's details.
     */
    fun originatorAddressLine3(): Optional<String> = body.originatorAddressLine3()

    /**
     * The originator's name. This is only necessary if you're transferring from a commingled
     * account. Otherwise, we'll use the associated entity's details.
     */
    fun originatorName(): Optional<String> = body.originatorName()

    /** Whether the transfer requires explicit approval via the dashboard or API. */
    fun requireApproval(): Optional<Boolean> = body.requireApproval()

    /**
     * The American Bankers' Association (ABA) Routing Transit Number (RTN) for the destination
     * account.
     */
    fun routingNumber(): Optional<String> = body.routingNumber()

    /** The ID of an Account Number that will be passed to the wire's recipient */
    fun sourceAccountNumberId(): Optional<String> = body.sourceAccountNumberId()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    @JvmSynthetic internal fun getBody(): WireTransferCreateBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class WireTransferCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("account_id") private val accountId: String,
        @JsonProperty("amount") private val amount: Long,
        @JsonProperty("beneficiary_name") private val beneficiaryName: String,
        @JsonProperty("message_to_recipient") private val messageToRecipient: String,
        @JsonProperty("account_number") private val accountNumber: String?,
        @JsonProperty("beneficiary_address_line1") private val beneficiaryAddressLine1: String?,
        @JsonProperty("beneficiary_address_line2") private val beneficiaryAddressLine2: String?,
        @JsonProperty("beneficiary_address_line3") private val beneficiaryAddressLine3: String?,
        @JsonProperty("external_account_id") private val externalAccountId: String?,
        @JsonProperty("originator_address_line1") private val originatorAddressLine1: String?,
        @JsonProperty("originator_address_line2") private val originatorAddressLine2: String?,
        @JsonProperty("originator_address_line3") private val originatorAddressLine3: String?,
        @JsonProperty("originator_name") private val originatorName: String?,
        @JsonProperty("require_approval") private val requireApproval: Boolean?,
        @JsonProperty("routing_number") private val routingNumber: String?,
        @JsonProperty("source_account_number_id") private val sourceAccountNumberId: String?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The identifier for the account that will send the transfer. */
        @JsonProperty("account_id") fun accountId(): String = accountId

        /** The transfer amount in USD cents. */
        @JsonProperty("amount") fun amount(): Long = amount

        /** The beneficiary's name. */
        @JsonProperty("beneficiary_name") fun beneficiaryName(): String = beneficiaryName

        /** The message that will show on the recipient's bank statement. */
        @JsonProperty("message_to_recipient") fun messageToRecipient(): String = messageToRecipient

        /** The account number for the destination account. */
        @JsonProperty("account_number")
        fun accountNumber(): Optional<String> = Optional.ofNullable(accountNumber)

        /** The beneficiary's address line 1. */
        @JsonProperty("beneficiary_address_line1")
        fun beneficiaryAddressLine1(): Optional<String> =
            Optional.ofNullable(beneficiaryAddressLine1)

        /** The beneficiary's address line 2. */
        @JsonProperty("beneficiary_address_line2")
        fun beneficiaryAddressLine2(): Optional<String> =
            Optional.ofNullable(beneficiaryAddressLine2)

        /** The beneficiary's address line 3. */
        @JsonProperty("beneficiary_address_line3")
        fun beneficiaryAddressLine3(): Optional<String> =
            Optional.ofNullable(beneficiaryAddressLine3)

        /**
         * The ID of an External Account to initiate a transfer to. If this parameter is provided,
         * `account_number` and `routing_number` must be absent.
         */
        @JsonProperty("external_account_id")
        fun externalAccountId(): Optional<String> = Optional.ofNullable(externalAccountId)

        /**
         * The originator's address line 1. This is only necessary if you're transferring from a
         * commingled account. Otherwise, we'll use the associated entity's details.
         */
        @JsonProperty("originator_address_line1")
        fun originatorAddressLine1(): Optional<String> = Optional.ofNullable(originatorAddressLine1)

        /**
         * The originator's address line 2. This is only necessary if you're transferring from a
         * commingled account. Otherwise, we'll use the associated entity's details.
         */
        @JsonProperty("originator_address_line2")
        fun originatorAddressLine2(): Optional<String> = Optional.ofNullable(originatorAddressLine2)

        /**
         * The originator's address line 3. This is only necessary if you're transferring from a
         * commingled account. Otherwise, we'll use the associated entity's details.
         */
        @JsonProperty("originator_address_line3")
        fun originatorAddressLine3(): Optional<String> = Optional.ofNullable(originatorAddressLine3)

        /**
         * The originator's name. This is only necessary if you're transferring from a commingled
         * account. Otherwise, we'll use the associated entity's details.
         */
        @JsonProperty("originator_name")
        fun originatorName(): Optional<String> = Optional.ofNullable(originatorName)

        /** Whether the transfer requires explicit approval via the dashboard or API. */
        @JsonProperty("require_approval")
        fun requireApproval(): Optional<Boolean> = Optional.ofNullable(requireApproval)

        /**
         * The American Bankers' Association (ABA) Routing Transit Number (RTN) for the destination
         * account.
         */
        @JsonProperty("routing_number")
        fun routingNumber(): Optional<String> = Optional.ofNullable(routingNumber)

        /** The ID of an Account Number that will be passed to the wire's recipient */
        @JsonProperty("source_account_number_id")
        fun sourceAccountNumberId(): Optional<String> = Optional.ofNullable(sourceAccountNumberId)

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
            private var sourceAccountNumberId: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(wireTransferCreateBody: WireTransferCreateBody) = apply {
                accountId = wireTransferCreateBody.accountId
                amount = wireTransferCreateBody.amount
                beneficiaryName = wireTransferCreateBody.beneficiaryName
                messageToRecipient = wireTransferCreateBody.messageToRecipient
                accountNumber = wireTransferCreateBody.accountNumber
                beneficiaryAddressLine1 = wireTransferCreateBody.beneficiaryAddressLine1
                beneficiaryAddressLine2 = wireTransferCreateBody.beneficiaryAddressLine2
                beneficiaryAddressLine3 = wireTransferCreateBody.beneficiaryAddressLine3
                externalAccountId = wireTransferCreateBody.externalAccountId
                originatorAddressLine1 = wireTransferCreateBody.originatorAddressLine1
                originatorAddressLine2 = wireTransferCreateBody.originatorAddressLine2
                originatorAddressLine3 = wireTransferCreateBody.originatorAddressLine3
                originatorName = wireTransferCreateBody.originatorName
                requireApproval = wireTransferCreateBody.requireApproval
                routingNumber = wireTransferCreateBody.routingNumber
                sourceAccountNumberId = wireTransferCreateBody.sourceAccountNumberId
                additionalProperties = wireTransferCreateBody.additionalProperties.toMutableMap()
            }

            /** The identifier for the account that will send the transfer. */
            fun accountId(accountId: String) = apply { this.accountId = accountId }

            /** The transfer amount in USD cents. */
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
             * The ID of an External Account to initiate a transfer to. If this parameter is
             * provided, `account_number` and `routing_number` must be absent.
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
             * The originator's name. This is only necessary if you're transferring from a
             * commingled account. Otherwise, we'll use the associated entity's details.
             */
            fun originatorName(originatorName: String) = apply {
                this.originatorName = originatorName
            }

            /** Whether the transfer requires explicit approval via the dashboard or API. */
            fun requireApproval(requireApproval: Boolean) = apply {
                this.requireApproval = requireApproval
            }

            /**
             * The American Bankers' Association (ABA) Routing Transit Number (RTN) for the
             * destination account.
             */
            fun routingNumber(routingNumber: String) = apply { this.routingNumber = routingNumber }

            /** The ID of an Account Number that will be passed to the wire's recipient */
            fun sourceAccountNumberId(sourceAccountNumberId: String) = apply {
                this.sourceAccountNumberId = sourceAccountNumberId
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
                    sourceAccountNumberId,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is WireTransferCreateBody && accountId == other.accountId && amount == other.amount && beneficiaryName == other.beneficiaryName && messageToRecipient == other.messageToRecipient && accountNumber == other.accountNumber && beneficiaryAddressLine1 == other.beneficiaryAddressLine1 && beneficiaryAddressLine2 == other.beneficiaryAddressLine2 && beneficiaryAddressLine3 == other.beneficiaryAddressLine3 && externalAccountId == other.externalAccountId && originatorAddressLine1 == other.originatorAddressLine1 && originatorAddressLine2 == other.originatorAddressLine2 && originatorAddressLine3 == other.originatorAddressLine3 && originatorName == other.originatorName && requireApproval == other.requireApproval && routingNumber == other.routingNumber && sourceAccountNumberId == other.sourceAccountNumberId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(accountId, amount, beneficiaryName, messageToRecipient, accountNumber, beneficiaryAddressLine1, beneficiaryAddressLine2, beneficiaryAddressLine3, externalAccountId, originatorAddressLine1, originatorAddressLine2, originatorAddressLine3, originatorName, requireApproval, routingNumber, sourceAccountNumberId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "WireTransferCreateBody{accountId=$accountId, amount=$amount, beneficiaryName=$beneficiaryName, messageToRecipient=$messageToRecipient, accountNumber=$accountNumber, beneficiaryAddressLine1=$beneficiaryAddressLine1, beneficiaryAddressLine2=$beneficiaryAddressLine2, beneficiaryAddressLine3=$beneficiaryAddressLine3, externalAccountId=$externalAccountId, originatorAddressLine1=$originatorAddressLine1, originatorAddressLine2=$originatorAddressLine2, originatorAddressLine3=$originatorAddressLine3, originatorName=$originatorName, requireApproval=$requireApproval, routingNumber=$routingNumber, sourceAccountNumberId=$sourceAccountNumberId, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var body: WireTransferCreateBody.Builder = WireTransferCreateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(wireTransferCreateParams: WireTransferCreateParams) = apply {
            body = wireTransferCreateParams.body.toBuilder()
            additionalHeaders = wireTransferCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = wireTransferCreateParams.additionalQueryParams.toBuilder()
        }

        /** The identifier for the account that will send the transfer. */
        fun accountId(accountId: String) = apply { body.accountId(accountId) }

        /** The transfer amount in USD cents. */
        fun amount(amount: Long) = apply { body.amount(amount) }

        /** The beneficiary's name. */
        fun beneficiaryName(beneficiaryName: String) = apply {
            body.beneficiaryName(beneficiaryName)
        }

        /** The message that will show on the recipient's bank statement. */
        fun messageToRecipient(messageToRecipient: String) = apply {
            body.messageToRecipient(messageToRecipient)
        }

        /** The account number for the destination account. */
        fun accountNumber(accountNumber: String) = apply { body.accountNumber(accountNumber) }

        /** The beneficiary's address line 1. */
        fun beneficiaryAddressLine1(beneficiaryAddressLine1: String) = apply {
            body.beneficiaryAddressLine1(beneficiaryAddressLine1)
        }

        /** The beneficiary's address line 2. */
        fun beneficiaryAddressLine2(beneficiaryAddressLine2: String) = apply {
            body.beneficiaryAddressLine2(beneficiaryAddressLine2)
        }

        /** The beneficiary's address line 3. */
        fun beneficiaryAddressLine3(beneficiaryAddressLine3: String) = apply {
            body.beneficiaryAddressLine3(beneficiaryAddressLine3)
        }

        /**
         * The ID of an External Account to initiate a transfer to. If this parameter is provided,
         * `account_number` and `routing_number` must be absent.
         */
        fun externalAccountId(externalAccountId: String) = apply {
            body.externalAccountId(externalAccountId)
        }

        /**
         * The originator's address line 1. This is only necessary if you're transferring from a
         * commingled account. Otherwise, we'll use the associated entity's details.
         */
        fun originatorAddressLine1(originatorAddressLine1: String) = apply {
            body.originatorAddressLine1(originatorAddressLine1)
        }

        /**
         * The originator's address line 2. This is only necessary if you're transferring from a
         * commingled account. Otherwise, we'll use the associated entity's details.
         */
        fun originatorAddressLine2(originatorAddressLine2: String) = apply {
            body.originatorAddressLine2(originatorAddressLine2)
        }

        /**
         * The originator's address line 3. This is only necessary if you're transferring from a
         * commingled account. Otherwise, we'll use the associated entity's details.
         */
        fun originatorAddressLine3(originatorAddressLine3: String) = apply {
            body.originatorAddressLine3(originatorAddressLine3)
        }

        /**
         * The originator's name. This is only necessary if you're transferring from a commingled
         * account. Otherwise, we'll use the associated entity's details.
         */
        fun originatorName(originatorName: String) = apply { body.originatorName(originatorName) }

        /** Whether the transfer requires explicit approval via the dashboard or API. */
        fun requireApproval(requireApproval: Boolean) = apply {
            body.requireApproval(requireApproval)
        }

        /**
         * The American Bankers' Association (ABA) Routing Transit Number (RTN) for the destination
         * account.
         */
        fun routingNumber(routingNumber: String) = apply { body.routingNumber(routingNumber) }

        /** The ID of an Account Number that will be passed to the wire's recipient */
        fun sourceAccountNumberId(sourceAccountNumberId: String) = apply {
            body.sourceAccountNumberId(sourceAccountNumberId)
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

        fun build(): WireTransferCreateParams =
            WireTransferCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is WireTransferCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "WireTransferCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
