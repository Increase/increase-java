// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.increase.api.core.Enum
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.toUnmodifiable
import com.increase.api.errors.IncreaseInvalidDataException
import com.increase.api.models.*
import java.util.Objects
import java.util.Optional

class CheckTransferCreateParams
constructor(
    private val accountId: String,
    private val amount: Long,
    private val sourceAccountNumberId: String,
    private val fulfillmentMethod: FulfillmentMethod?,
    private val physicalCheck: PhysicalCheck?,
    private val requireApproval: Boolean?,
    private val thirdParty: ThirdParty?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun accountId(): String = accountId

    fun amount(): Long = amount

    fun sourceAccountNumberId(): String = sourceAccountNumberId

    fun fulfillmentMethod(): Optional<FulfillmentMethod> = Optional.ofNullable(fulfillmentMethod)

    fun physicalCheck(): Optional<PhysicalCheck> = Optional.ofNullable(physicalCheck)

    fun requireApproval(): Optional<Boolean> = Optional.ofNullable(requireApproval)

    fun thirdParty(): Optional<ThirdParty> = Optional.ofNullable(thirdParty)

    @JvmSynthetic
    internal fun getBody(): CheckTransferCreateBody {
        return CheckTransferCreateBody(
            accountId,
            amount,
            sourceAccountNumberId,
            fulfillmentMethod,
            physicalCheck,
            requireApproval,
            thirdParty,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = CheckTransferCreateBody.Builder::class)
    @NoAutoDetect
    class CheckTransferCreateBody
    internal constructor(
        private val accountId: String?,
        private val amount: Long?,
        private val sourceAccountNumberId: String?,
        private val fulfillmentMethod: FulfillmentMethod?,
        private val physicalCheck: PhysicalCheck?,
        private val requireApproval: Boolean?,
        private val thirdParty: ThirdParty?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The identifier for the account that will send the transfer. */
        @JsonProperty("account_id") fun accountId(): String? = accountId

        /** The transfer amount in cents. */
        @JsonProperty("amount") fun amount(): Long? = amount

        /**
         * The identifier of the Account Number from which to send the transfer and print on the
         * check.
         */
        @JsonProperty("source_account_number_id")
        fun sourceAccountNumberId(): String? = sourceAccountNumberId

        /** Whether Increase will print and mail the check or if you will do it yourself. */
        @JsonProperty("fulfillment_method")
        fun fulfillmentMethod(): FulfillmentMethod? = fulfillmentMethod

        /**
         * Details relating to the physical check that Increase will print and mail. This is
         * required if `fulfillment_method` is equal to `physical_check`. It must not be included if
         * any other `fulfillment_method` is provided.
         */
        @JsonProperty("physical_check") fun physicalCheck(): PhysicalCheck? = physicalCheck

        /** Whether the transfer requires explicit approval via the dashboard or API. */
        @JsonProperty("require_approval") fun requireApproval(): Boolean? = requireApproval

        /**
         * Details relating to the custom fulfillment you will perform. This is required if
         * `fulfillment_method` is equal to `third_party`. It must not be included if any other
         * `fulfillment_method` is provided.
         */
        @JsonProperty("third_party") fun thirdParty(): ThirdParty? = thirdParty

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
            private var sourceAccountNumberId: String? = null
            private var fulfillmentMethod: FulfillmentMethod? = null
            private var physicalCheck: PhysicalCheck? = null
            private var requireApproval: Boolean? = null
            private var thirdParty: ThirdParty? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(checkTransferCreateBody: CheckTransferCreateBody) = apply {
                this.accountId = checkTransferCreateBody.accountId
                this.amount = checkTransferCreateBody.amount
                this.sourceAccountNumberId = checkTransferCreateBody.sourceAccountNumberId
                this.fulfillmentMethod = checkTransferCreateBody.fulfillmentMethod
                this.physicalCheck = checkTransferCreateBody.physicalCheck
                this.requireApproval = checkTransferCreateBody.requireApproval
                this.thirdParty = checkTransferCreateBody.thirdParty
                additionalProperties(checkTransferCreateBody.additionalProperties)
            }

            /** The identifier for the account that will send the transfer. */
            @JsonProperty("account_id")
            fun accountId(accountId: String) = apply { this.accountId = accountId }

            /** The transfer amount in cents. */
            @JsonProperty("amount") fun amount(amount: Long) = apply { this.amount = amount }

            /**
             * The identifier of the Account Number from which to send the transfer and print on the
             * check.
             */
            @JsonProperty("source_account_number_id")
            fun sourceAccountNumberId(sourceAccountNumberId: String) = apply {
                this.sourceAccountNumberId = sourceAccountNumberId
            }

            /** Whether Increase will print and mail the check or if you will do it yourself. */
            @JsonProperty("fulfillment_method")
            fun fulfillmentMethod(fulfillmentMethod: FulfillmentMethod) = apply {
                this.fulfillmentMethod = fulfillmentMethod
            }

            /**
             * Details relating to the physical check that Increase will print and mail. This is
             * required if `fulfillment_method` is equal to `physical_check`. It must not be
             * included if any other `fulfillment_method` is provided.
             */
            @JsonProperty("physical_check")
            fun physicalCheck(physicalCheck: PhysicalCheck) = apply {
                this.physicalCheck = physicalCheck
            }

            /** Whether the transfer requires explicit approval via the dashboard or API. */
            @JsonProperty("require_approval")
            fun requireApproval(requireApproval: Boolean) = apply {
                this.requireApproval = requireApproval
            }

            /**
             * Details relating to the custom fulfillment you will perform. This is required if
             * `fulfillment_method` is equal to `third_party`. It must not be included if any other
             * `fulfillment_method` is provided.
             */
            @JsonProperty("third_party")
            fun thirdParty(thirdParty: ThirdParty) = apply { this.thirdParty = thirdParty }

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

            fun build(): CheckTransferCreateBody =
                CheckTransferCreateBody(
                    checkNotNull(accountId) { "`accountId` is required but was not set" },
                    checkNotNull(amount) { "`amount` is required but was not set" },
                    checkNotNull(sourceAccountNumberId) {
                        "`sourceAccountNumberId` is required but was not set"
                    },
                    fulfillmentMethod,
                    physicalCheck,
                    requireApproval,
                    thirdParty,
                    additionalProperties.toUnmodifiable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CheckTransferCreateBody && this.accountId == other.accountId && this.amount == other.amount && this.sourceAccountNumberId == other.sourceAccountNumberId && this.fulfillmentMethod == other.fulfillmentMethod && this.physicalCheck == other.physicalCheck && this.requireApproval == other.requireApproval && this.thirdParty == other.thirdParty && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(accountId, amount, sourceAccountNumberId, fulfillmentMethod, physicalCheck, requireApproval, thirdParty, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "CheckTransferCreateBody{accountId=$accountId, amount=$amount, sourceAccountNumberId=$sourceAccountNumberId, fulfillmentMethod=$fulfillmentMethod, physicalCheck=$physicalCheck, requireApproval=$requireApproval, thirdParty=$thirdParty, additionalProperties=$additionalProperties}"
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CheckTransferCreateParams && this.accountId == other.accountId && this.amount == other.amount && this.sourceAccountNumberId == other.sourceAccountNumberId && this.fulfillmentMethod == other.fulfillmentMethod && this.physicalCheck == other.physicalCheck && this.requireApproval == other.requireApproval && this.thirdParty == other.thirdParty && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(accountId, amount, sourceAccountNumberId, fulfillmentMethod, physicalCheck, requireApproval, thirdParty, additionalQueryParams, additionalHeaders, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "CheckTransferCreateParams{accountId=$accountId, amount=$amount, sourceAccountNumberId=$sourceAccountNumberId, fulfillmentMethod=$fulfillmentMethod, physicalCheck=$physicalCheck, requireApproval=$requireApproval, thirdParty=$thirdParty, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var accountId: String? = null
        private var amount: Long? = null
        private var sourceAccountNumberId: String? = null
        private var fulfillmentMethod: FulfillmentMethod? = null
        private var physicalCheck: PhysicalCheck? = null
        private var requireApproval: Boolean? = null
        private var thirdParty: ThirdParty? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(checkTransferCreateParams: CheckTransferCreateParams) = apply {
            this.accountId = checkTransferCreateParams.accountId
            this.amount = checkTransferCreateParams.amount
            this.sourceAccountNumberId = checkTransferCreateParams.sourceAccountNumberId
            this.fulfillmentMethod = checkTransferCreateParams.fulfillmentMethod
            this.physicalCheck = checkTransferCreateParams.physicalCheck
            this.requireApproval = checkTransferCreateParams.requireApproval
            this.thirdParty = checkTransferCreateParams.thirdParty
            additionalQueryParams(checkTransferCreateParams.additionalQueryParams)
            additionalHeaders(checkTransferCreateParams.additionalHeaders)
            additionalBodyProperties(checkTransferCreateParams.additionalBodyProperties)
        }

        /** The identifier for the account that will send the transfer. */
        fun accountId(accountId: String) = apply { this.accountId = accountId }

        /** The transfer amount in cents. */
        fun amount(amount: Long) = apply { this.amount = amount }

        /**
         * The identifier of the Account Number from which to send the transfer and print on the
         * check.
         */
        fun sourceAccountNumberId(sourceAccountNumberId: String) = apply {
            this.sourceAccountNumberId = sourceAccountNumberId
        }

        /** Whether Increase will print and mail the check or if you will do it yourself. */
        fun fulfillmentMethod(fulfillmentMethod: FulfillmentMethod) = apply {
            this.fulfillmentMethod = fulfillmentMethod
        }

        /**
         * Details relating to the physical check that Increase will print and mail. This is
         * required if `fulfillment_method` is equal to `physical_check`. It must not be included if
         * any other `fulfillment_method` is provided.
         */
        fun physicalCheck(physicalCheck: PhysicalCheck) = apply {
            this.physicalCheck = physicalCheck
        }

        /** Whether the transfer requires explicit approval via the dashboard or API. */
        fun requireApproval(requireApproval: Boolean) = apply {
            this.requireApproval = requireApproval
        }

        /**
         * Details relating to the custom fulfillment you will perform. This is required if
         * `fulfillment_method` is equal to `third_party`. It must not be included if any other
         * `fulfillment_method` is provided.
         */
        fun thirdParty(thirdParty: ThirdParty) = apply { this.thirdParty = thirdParty }

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

        fun build(): CheckTransferCreateParams =
            CheckTransferCreateParams(
                checkNotNull(accountId) { "`accountId` is required but was not set" },
                checkNotNull(amount) { "`amount` is required but was not set" },
                checkNotNull(sourceAccountNumberId) {
                    "`sourceAccountNumberId` is required but was not set"
                },
                fulfillmentMethod,
                physicalCheck,
                requireApproval,
                thirdParty,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    class FulfillmentMethod
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is FulfillmentMethod && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val PHYSICAL_CHECK = FulfillmentMethod(JsonField.of("physical_check"))

            @JvmField val THIRD_PARTY = FulfillmentMethod(JsonField.of("third_party"))

            @JvmStatic fun of(value: String) = FulfillmentMethod(JsonField.of(value))
        }

        enum class Known {
            PHYSICAL_CHECK,
            THIRD_PARTY,
        }

        enum class Value {
            PHYSICAL_CHECK,
            THIRD_PARTY,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                PHYSICAL_CHECK -> Value.PHYSICAL_CHECK
                THIRD_PARTY -> Value.THIRD_PARTY
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                PHYSICAL_CHECK -> Known.PHYSICAL_CHECK
                THIRD_PARTY -> Known.THIRD_PARTY
                else -> throw IncreaseInvalidDataException("Unknown FulfillmentMethod: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    /**
     * Details relating to the physical check that Increase will print and mail. This is required if
     * `fulfillment_method` is equal to `physical_check`. It must not be included if any other
     * `fulfillment_method` is provided.
     */
    @JsonDeserialize(builder = PhysicalCheck.Builder::class)
    @NoAutoDetect
    class PhysicalCheck
    private constructor(
        private val mailingAddress: MailingAddress?,
        private val memo: String?,
        private val note: String?,
        private val recipientName: String?,
        private val returnAddress: ReturnAddress?,
        private val signatureText: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** Details for where Increase will mail the check. */
        @JsonProperty("mailing_address") fun mailingAddress(): MailingAddress? = mailingAddress

        /** The descriptor that will be printed on the memo field on the check. */
        @JsonProperty("memo") fun memo(): String? = memo

        /** The descriptor that will be printed on the letter included with the check. */
        @JsonProperty("note") fun note(): String? = note

        /** The name that will be printed on the check in the 'To:' field. */
        @JsonProperty("recipient_name") fun recipientName(): String? = recipientName

        /**
         * The return address to be printed on the check. If omitted this will default to an
         * Increase-owned address that will mark checks as delivery failed and shred them.
         */
        @JsonProperty("return_address") fun returnAddress(): ReturnAddress? = returnAddress

        /**
         * The text that will appear as the signature on the check in cursive font. If not provided,
         * the check will be printed with 'No signature required'.
         */
        @JsonProperty("signature_text") fun signatureText(): String? = signatureText

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var mailingAddress: MailingAddress? = null
            private var memo: String? = null
            private var note: String? = null
            private var recipientName: String? = null
            private var returnAddress: ReturnAddress? = null
            private var signatureText: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(physicalCheck: PhysicalCheck) = apply {
                this.mailingAddress = physicalCheck.mailingAddress
                this.memo = physicalCheck.memo
                this.note = physicalCheck.note
                this.recipientName = physicalCheck.recipientName
                this.returnAddress = physicalCheck.returnAddress
                this.signatureText = physicalCheck.signatureText
                additionalProperties(physicalCheck.additionalProperties)
            }

            /** Details for where Increase will mail the check. */
            @JsonProperty("mailing_address")
            fun mailingAddress(mailingAddress: MailingAddress) = apply {
                this.mailingAddress = mailingAddress
            }

            /** The descriptor that will be printed on the memo field on the check. */
            @JsonProperty("memo") fun memo(memo: String) = apply { this.memo = memo }

            /** The descriptor that will be printed on the letter included with the check. */
            @JsonProperty("note") fun note(note: String) = apply { this.note = note }

            /** The name that will be printed on the check in the 'To:' field. */
            @JsonProperty("recipient_name")
            fun recipientName(recipientName: String) = apply { this.recipientName = recipientName }

            /**
             * The return address to be printed on the check. If omitted this will default to an
             * Increase-owned address that will mark checks as delivery failed and shred them.
             */
            @JsonProperty("return_address")
            fun returnAddress(returnAddress: ReturnAddress) = apply {
                this.returnAddress = returnAddress
            }

            /**
             * The text that will appear as the signature on the check in cursive font. If not
             * provided, the check will be printed with 'No signature required'.
             */
            @JsonProperty("signature_text")
            fun signatureText(signatureText: String) = apply { this.signatureText = signatureText }

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

            fun build(): PhysicalCheck =
                PhysicalCheck(
                    checkNotNull(mailingAddress) { "`mailingAddress` is required but was not set" },
                    checkNotNull(memo) { "`memo` is required but was not set" },
                    note,
                    checkNotNull(recipientName) { "`recipientName` is required but was not set" },
                    returnAddress,
                    signatureText,
                    additionalProperties.toUnmodifiable(),
                )
        }

        /** Details for where Increase will mail the check. */
        @JsonDeserialize(builder = MailingAddress.Builder::class)
        @NoAutoDetect
        class MailingAddress
        private constructor(
            private val city: String?,
            private val line1: String?,
            private val line2: String?,
            private val name: String?,
            private val postalCode: String?,
            private val state: String?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** The city component of the check's destination address. */
            @JsonProperty("city") fun city(): String? = city

            /** The first line of the address component of the check's destination address. */
            @JsonProperty("line1") fun line1(): String? = line1

            /** The second line of the address component of the check's destination address. */
            @JsonProperty("line2") fun line2(): String? = line2

            /**
             * The name component of the check's destination address. Defaults to the provided
             * `recipient_name` parameter.
             */
            @JsonProperty("name") fun name(): String? = name

            /** The postal code component of the check's destination address. */
            @JsonProperty("postal_code") fun postalCode(): String? = postalCode

            /** The US state component of the check's destination address. */
            @JsonProperty("state") fun state(): String? = state

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var city: String? = null
                private var line1: String? = null
                private var line2: String? = null
                private var name: String? = null
                private var postalCode: String? = null
                private var state: String? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(mailingAddress: MailingAddress) = apply {
                    this.city = mailingAddress.city
                    this.line1 = mailingAddress.line1
                    this.line2 = mailingAddress.line2
                    this.name = mailingAddress.name
                    this.postalCode = mailingAddress.postalCode
                    this.state = mailingAddress.state
                    additionalProperties(mailingAddress.additionalProperties)
                }

                /** The city component of the check's destination address. */
                @JsonProperty("city") fun city(city: String) = apply { this.city = city }

                /** The first line of the address component of the check's destination address. */
                @JsonProperty("line1") fun line1(line1: String) = apply { this.line1 = line1 }

                /** The second line of the address component of the check's destination address. */
                @JsonProperty("line2") fun line2(line2: String) = apply { this.line2 = line2 }

                /**
                 * The name component of the check's destination address. Defaults to the provided
                 * `recipient_name` parameter.
                 */
                @JsonProperty("name") fun name(name: String) = apply { this.name = name }

                /** The postal code component of the check's destination address. */
                @JsonProperty("postal_code")
                fun postalCode(postalCode: String) = apply { this.postalCode = postalCode }

                /** The US state component of the check's destination address. */
                @JsonProperty("state") fun state(state: String) = apply { this.state = state }

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

                fun build(): MailingAddress =
                    MailingAddress(
                        checkNotNull(city) { "`city` is required but was not set" },
                        checkNotNull(line1) { "`line1` is required but was not set" },
                        line2,
                        name,
                        checkNotNull(postalCode) { "`postalCode` is required but was not set" },
                        checkNotNull(state) { "`state` is required but was not set" },
                        additionalProperties.toUnmodifiable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is MailingAddress && this.city == other.city && this.line1 == other.line1 && this.line2 == other.line2 && this.name == other.name && this.postalCode == other.postalCode && this.state == other.state && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(city, line1, line2, name, postalCode, state, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "MailingAddress{city=$city, line1=$line1, line2=$line2, name=$name, postalCode=$postalCode, state=$state, additionalProperties=$additionalProperties}"
        }

        /**
         * The return address to be printed on the check. If omitted this will default to an
         * Increase-owned address that will mark checks as delivery failed and shred them.
         */
        @JsonDeserialize(builder = ReturnAddress.Builder::class)
        @NoAutoDetect
        class ReturnAddress
        private constructor(
            private val city: String?,
            private val line1: String?,
            private val line2: String?,
            private val name: String?,
            private val postalCode: String?,
            private val state: String?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** The city of the return address. */
            @JsonProperty("city") fun city(): String? = city

            /** The first line of the return address. */
            @JsonProperty("line1") fun line1(): String? = line1

            /** The second line of the return address. */
            @JsonProperty("line2") fun line2(): String? = line2

            /** The name of the return address. */
            @JsonProperty("name") fun name(): String? = name

            /** The postal code of the return address. */
            @JsonProperty("postal_code") fun postalCode(): String? = postalCode

            /** The US state of the return address. */
            @JsonProperty("state") fun state(): String? = state

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var city: String? = null
                private var line1: String? = null
                private var line2: String? = null
                private var name: String? = null
                private var postalCode: String? = null
                private var state: String? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(returnAddress: ReturnAddress) = apply {
                    this.city = returnAddress.city
                    this.line1 = returnAddress.line1
                    this.line2 = returnAddress.line2
                    this.name = returnAddress.name
                    this.postalCode = returnAddress.postalCode
                    this.state = returnAddress.state
                    additionalProperties(returnAddress.additionalProperties)
                }

                /** The city of the return address. */
                @JsonProperty("city") fun city(city: String) = apply { this.city = city }

                /** The first line of the return address. */
                @JsonProperty("line1") fun line1(line1: String) = apply { this.line1 = line1 }

                /** The second line of the return address. */
                @JsonProperty("line2") fun line2(line2: String) = apply { this.line2 = line2 }

                /** The name of the return address. */
                @JsonProperty("name") fun name(name: String) = apply { this.name = name }

                /** The postal code of the return address. */
                @JsonProperty("postal_code")
                fun postalCode(postalCode: String) = apply { this.postalCode = postalCode }

                /** The US state of the return address. */
                @JsonProperty("state") fun state(state: String) = apply { this.state = state }

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

                fun build(): ReturnAddress =
                    ReturnAddress(
                        checkNotNull(city) { "`city` is required but was not set" },
                        checkNotNull(line1) { "`line1` is required but was not set" },
                        line2,
                        checkNotNull(name) { "`name` is required but was not set" },
                        checkNotNull(postalCode) { "`postalCode` is required but was not set" },
                        checkNotNull(state) { "`state` is required but was not set" },
                        additionalProperties.toUnmodifiable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ReturnAddress && this.city == other.city && this.line1 == other.line1 && this.line2 == other.line2 && this.name == other.name && this.postalCode == other.postalCode && this.state == other.state && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(city, line1, line2, name, postalCode, state, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "ReturnAddress{city=$city, line1=$line1, line2=$line2, name=$name, postalCode=$postalCode, state=$state, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PhysicalCheck && this.mailingAddress == other.mailingAddress && this.memo == other.memo && this.note == other.note && this.recipientName == other.recipientName && this.returnAddress == other.returnAddress && this.signatureText == other.signatureText && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(mailingAddress, memo, note, recipientName, returnAddress, signatureText, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "PhysicalCheck{mailingAddress=$mailingAddress, memo=$memo, note=$note, recipientName=$recipientName, returnAddress=$returnAddress, signatureText=$signatureText, additionalProperties=$additionalProperties}"
    }

    /**
     * Details relating to the custom fulfillment you will perform. This is required if
     * `fulfillment_method` is equal to `third_party`. It must not be included if any other
     * `fulfillment_method` is provided.
     */
    @JsonDeserialize(builder = ThirdParty.Builder::class)
    @NoAutoDetect
    class ThirdParty
    private constructor(
        private val checkNumber: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /**
         * The check number you will print on the check. This should not contain leading zeroes. If
         * this is omitted, Increase will generate a check number for you; you should inspect the
         * response and use that check number.
         */
        @JsonProperty("check_number") fun checkNumber(): String? = checkNumber

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var checkNumber: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(thirdParty: ThirdParty) = apply {
                this.checkNumber = thirdParty.checkNumber
                additionalProperties(thirdParty.additionalProperties)
            }

            /**
             * The check number you will print on the check. This should not contain leading zeroes.
             * If this is omitted, Increase will generate a check number for you; you should inspect
             * the response and use that check number.
             */
            @JsonProperty("check_number")
            fun checkNumber(checkNumber: String) = apply { this.checkNumber = checkNumber }

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

            fun build(): ThirdParty = ThirdParty(checkNumber, additionalProperties.toUnmodifiable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ThirdParty && this.checkNumber == other.checkNumber && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(checkNumber, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "ThirdParty{checkNumber=$checkNumber, additionalProperties=$additionalProperties}"
    }
}
