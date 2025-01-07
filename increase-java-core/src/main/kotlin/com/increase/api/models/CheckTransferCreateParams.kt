// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.increase.api.core.Enum
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.core.immutableEmptyMap
import com.increase.api.core.toImmutable
import com.increase.api.errors.IncreaseInvalidDataException
import java.util.Objects
import java.util.Optional

/** Create a Check Transfer */
class CheckTransferCreateParams
constructor(
    private val body: CheckTransferCreateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    /** The identifier for the account that will send the transfer. */
    fun accountId(): String = body.accountId()

    /** The transfer amount in USD cents. */
    fun amount(): Long = body.amount()

    /**
     * The identifier of the Account Number from which to send the transfer and print on the check.
     */
    fun sourceAccountNumberId(): String = body.sourceAccountNumberId()

    /** Whether Increase will print and mail the check or if you will do it yourself. */
    fun fulfillmentMethod(): Optional<FulfillmentMethod> = body.fulfillmentMethod()

    /**
     * Details relating to the physical check that Increase will print and mail. This is required if
     * `fulfillment_method` is equal to `physical_check`. It must not be included if any other
     * `fulfillment_method` is provided.
     */
    fun physicalCheck(): Optional<PhysicalCheck> = body.physicalCheck()

    /** Whether the transfer requires explicit approval via the dashboard or API. */
    fun requireApproval(): Optional<Boolean> = body.requireApproval()

    /**
     * Details relating to the custom fulfillment you will perform. This is required if
     * `fulfillment_method` is equal to `third_party`. It must not be included if any other
     * `fulfillment_method` is provided.
     */
    fun thirdParty(): Optional<ThirdParty> = body.thirdParty()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    @JvmSynthetic internal fun getBody(): CheckTransferCreateBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class CheckTransferCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("account_id") private val accountId: String,
        @JsonProperty("amount") private val amount: Long,
        @JsonProperty("source_account_number_id") private val sourceAccountNumberId: String,
        @JsonProperty("fulfillment_method") private val fulfillmentMethod: FulfillmentMethod?,
        @JsonProperty("physical_check") private val physicalCheck: PhysicalCheck?,
        @JsonProperty("require_approval") private val requireApproval: Boolean?,
        @JsonProperty("third_party") private val thirdParty: ThirdParty?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The identifier for the account that will send the transfer. */
        @JsonProperty("account_id") fun accountId(): String = accountId

        /** The transfer amount in USD cents. */
        @JsonProperty("amount") fun amount(): Long = amount

        /**
         * The identifier of the Account Number from which to send the transfer and print on the
         * check.
         */
        @JsonProperty("source_account_number_id")
        fun sourceAccountNumberId(): String = sourceAccountNumberId

        /** Whether Increase will print and mail the check or if you will do it yourself. */
        @JsonProperty("fulfillment_method")
        fun fulfillmentMethod(): Optional<FulfillmentMethod> =
            Optional.ofNullable(fulfillmentMethod)

        /**
         * Details relating to the physical check that Increase will print and mail. This is
         * required if `fulfillment_method` is equal to `physical_check`. It must not be included if
         * any other `fulfillment_method` is provided.
         */
        @JsonProperty("physical_check")
        fun physicalCheck(): Optional<PhysicalCheck> = Optional.ofNullable(physicalCheck)

        /** Whether the transfer requires explicit approval via the dashboard or API. */
        @JsonProperty("require_approval")
        fun requireApproval(): Optional<Boolean> = Optional.ofNullable(requireApproval)

        /**
         * Details relating to the custom fulfillment you will perform. This is required if
         * `fulfillment_method` is equal to `third_party`. It must not be included if any other
         * `fulfillment_method` is provided.
         */
        @JsonProperty("third_party")
        fun thirdParty(): Optional<ThirdParty> = Optional.ofNullable(thirdParty)

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
                accountId = checkTransferCreateBody.accountId
                amount = checkTransferCreateBody.amount
                sourceAccountNumberId = checkTransferCreateBody.sourceAccountNumberId
                fulfillmentMethod = checkTransferCreateBody.fulfillmentMethod
                physicalCheck = checkTransferCreateBody.physicalCheck
                requireApproval = checkTransferCreateBody.requireApproval
                thirdParty = checkTransferCreateBody.thirdParty
                additionalProperties = checkTransferCreateBody.additionalProperties.toMutableMap()
            }

            /** The identifier for the account that will send the transfer. */
            fun accountId(accountId: String) = apply { this.accountId = accountId }

            /** The transfer amount in USD cents. */
            fun amount(amount: Long) = apply { this.amount = amount }

            /**
             * The identifier of the Account Number from which to send the transfer and print on the
             * check.
             */
            fun sourceAccountNumberId(sourceAccountNumberId: String) = apply {
                this.sourceAccountNumberId = sourceAccountNumberId
            }

            /** Whether Increase will print and mail the check or if you will do it yourself. */
            fun fulfillmentMethod(fulfillmentMethod: FulfillmentMethod?) = apply {
                this.fulfillmentMethod = fulfillmentMethod
            }

            /** Whether Increase will print and mail the check or if you will do it yourself. */
            fun fulfillmentMethod(fulfillmentMethod: Optional<FulfillmentMethod>) =
                fulfillmentMethod(fulfillmentMethod.orElse(null))

            /**
             * Details relating to the physical check that Increase will print and mail. This is
             * required if `fulfillment_method` is equal to `physical_check`. It must not be
             * included if any other `fulfillment_method` is provided.
             */
            fun physicalCheck(physicalCheck: PhysicalCheck?) = apply {
                this.physicalCheck = physicalCheck
            }

            /**
             * Details relating to the physical check that Increase will print and mail. This is
             * required if `fulfillment_method` is equal to `physical_check`. It must not be
             * included if any other `fulfillment_method` is provided.
             */
            fun physicalCheck(physicalCheck: Optional<PhysicalCheck>) =
                physicalCheck(physicalCheck.orElse(null))

            /** Whether the transfer requires explicit approval via the dashboard or API. */
            fun requireApproval(requireApproval: Boolean?) = apply {
                this.requireApproval = requireApproval
            }

            /** Whether the transfer requires explicit approval via the dashboard or API. */
            fun requireApproval(requireApproval: Boolean) =
                requireApproval(requireApproval as Boolean?)

            /** Whether the transfer requires explicit approval via the dashboard or API. */
            @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
            fun requireApproval(requireApproval: Optional<Boolean>) =
                requireApproval(requireApproval.orElse(null) as Boolean?)

            /**
             * Details relating to the custom fulfillment you will perform. This is required if
             * `fulfillment_method` is equal to `third_party`. It must not be included if any other
             * `fulfillment_method` is provided.
             */
            fun thirdParty(thirdParty: ThirdParty?) = apply { this.thirdParty = thirdParty }

            /**
             * Details relating to the custom fulfillment you will perform. This is required if
             * `fulfillment_method` is equal to `third_party`. It must not be included if any other
             * `fulfillment_method` is provided.
             */
            fun thirdParty(thirdParty: Optional<ThirdParty>) = thirdParty(thirdParty.orElse(null))

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
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CheckTransferCreateBody && accountId == other.accountId && amount == other.amount && sourceAccountNumberId == other.sourceAccountNumberId && fulfillmentMethod == other.fulfillmentMethod && physicalCheck == other.physicalCheck && requireApproval == other.requireApproval && thirdParty == other.thirdParty && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(accountId, amount, sourceAccountNumberId, fulfillmentMethod, physicalCheck, requireApproval, thirdParty, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CheckTransferCreateBody{accountId=$accountId, amount=$amount, sourceAccountNumberId=$sourceAccountNumberId, fulfillmentMethod=$fulfillmentMethod, physicalCheck=$physicalCheck, requireApproval=$requireApproval, thirdParty=$thirdParty, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var body: CheckTransferCreateBody.Builder = CheckTransferCreateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(checkTransferCreateParams: CheckTransferCreateParams) = apply {
            body = checkTransferCreateParams.body.toBuilder()
            additionalHeaders = checkTransferCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = checkTransferCreateParams.additionalQueryParams.toBuilder()
        }

        /** The identifier for the account that will send the transfer. */
        fun accountId(accountId: String) = apply { body.accountId(accountId) }

        /** The transfer amount in USD cents. */
        fun amount(amount: Long) = apply { body.amount(amount) }

        /**
         * The identifier of the Account Number from which to send the transfer and print on the
         * check.
         */
        fun sourceAccountNumberId(sourceAccountNumberId: String) = apply {
            body.sourceAccountNumberId(sourceAccountNumberId)
        }

        /** Whether Increase will print and mail the check or if you will do it yourself. */
        fun fulfillmentMethod(fulfillmentMethod: FulfillmentMethod?) = apply {
            body.fulfillmentMethod(fulfillmentMethod)
        }

        /** Whether Increase will print and mail the check or if you will do it yourself. */
        fun fulfillmentMethod(fulfillmentMethod: Optional<FulfillmentMethod>) =
            fulfillmentMethod(fulfillmentMethod.orElse(null))

        /**
         * Details relating to the physical check that Increase will print and mail. This is
         * required if `fulfillment_method` is equal to `physical_check`. It must not be included if
         * any other `fulfillment_method` is provided.
         */
        fun physicalCheck(physicalCheck: PhysicalCheck?) = apply {
            body.physicalCheck(physicalCheck)
        }

        /**
         * Details relating to the physical check that Increase will print and mail. This is
         * required if `fulfillment_method` is equal to `physical_check`. It must not be included if
         * any other `fulfillment_method` is provided.
         */
        fun physicalCheck(physicalCheck: Optional<PhysicalCheck>) =
            physicalCheck(physicalCheck.orElse(null))

        /** Whether the transfer requires explicit approval via the dashboard or API. */
        fun requireApproval(requireApproval: Boolean?) = apply {
            body.requireApproval(requireApproval)
        }

        /** Whether the transfer requires explicit approval via the dashboard or API. */
        fun requireApproval(requireApproval: Boolean) = requireApproval(requireApproval as Boolean?)

        /** Whether the transfer requires explicit approval via the dashboard or API. */
        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun requireApproval(requireApproval: Optional<Boolean>) =
            requireApproval(requireApproval.orElse(null) as Boolean?)

        /**
         * Details relating to the custom fulfillment you will perform. This is required if
         * `fulfillment_method` is equal to `third_party`. It must not be included if any other
         * `fulfillment_method` is provided.
         */
        fun thirdParty(thirdParty: ThirdParty?) = apply { body.thirdParty(thirdParty) }

        /**
         * Details relating to the custom fulfillment you will perform. This is required if
         * `fulfillment_method` is equal to `third_party`. It must not be included if any other
         * `fulfillment_method` is provided.
         */
        fun thirdParty(thirdParty: Optional<ThirdParty>) = thirdParty(thirdParty.orElse(null))

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

        fun build(): CheckTransferCreateParams =
            CheckTransferCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    class FulfillmentMethod
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val PHYSICAL_CHECK = of("physical_check")

            @JvmField val THIRD_PARTY = of("third_party")

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is FulfillmentMethod && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Details relating to the physical check that Increase will print and mail. This is required if
     * `fulfillment_method` is equal to `physical_check`. It must not be included if any other
     * `fulfillment_method` is provided.
     */
    @NoAutoDetect
    class PhysicalCheck
    @JsonCreator
    private constructor(
        @JsonProperty("mailing_address") private val mailingAddress: MailingAddress,
        @JsonProperty("memo") private val memo: String,
        @JsonProperty("recipient_name") private val recipientName: String,
        @JsonProperty("note") private val note: String?,
        @JsonProperty("return_address") private val returnAddress: ReturnAddress?,
        @JsonProperty("signature_text") private val signatureText: String?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Details for where Increase will mail the check. */
        @JsonProperty("mailing_address") fun mailingAddress(): MailingAddress = mailingAddress

        /** The descriptor that will be printed on the memo field on the check. */
        @JsonProperty("memo") fun memo(): String = memo

        /** The name that will be printed on the check in the 'To:' field. */
        @JsonProperty("recipient_name") fun recipientName(): String = recipientName

        /** The descriptor that will be printed on the letter included with the check. */
        @JsonProperty("note") fun note(): Optional<String> = Optional.ofNullable(note)

        /**
         * The return address to be printed on the check. If omitted this will default to an
         * Increase-owned address that will mark checks as delivery failed and shred them.
         */
        @JsonProperty("return_address")
        fun returnAddress(): Optional<ReturnAddress> = Optional.ofNullable(returnAddress)

        /**
         * The text that will appear as the signature on the check in cursive font. If not provided,
         * the check will be printed with 'No signature required'.
         */
        @JsonProperty("signature_text")
        fun signatureText(): Optional<String> = Optional.ofNullable(signatureText)

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
            private var recipientName: String? = null
            private var note: String? = null
            private var returnAddress: ReturnAddress? = null
            private var signatureText: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(physicalCheck: PhysicalCheck) = apply {
                mailingAddress = physicalCheck.mailingAddress
                memo = physicalCheck.memo
                recipientName = physicalCheck.recipientName
                note = physicalCheck.note
                returnAddress = physicalCheck.returnAddress
                signatureText = physicalCheck.signatureText
                additionalProperties = physicalCheck.additionalProperties.toMutableMap()
            }

            /** Details for where Increase will mail the check. */
            fun mailingAddress(mailingAddress: MailingAddress) = apply {
                this.mailingAddress = mailingAddress
            }

            /** The descriptor that will be printed on the memo field on the check. */
            fun memo(memo: String) = apply { this.memo = memo }

            /** The name that will be printed on the check in the 'To:' field. */
            fun recipientName(recipientName: String) = apply { this.recipientName = recipientName }

            /** The descriptor that will be printed on the letter included with the check. */
            fun note(note: String?) = apply { this.note = note }

            /** The descriptor that will be printed on the letter included with the check. */
            fun note(note: Optional<String>) = note(note.orElse(null))

            /**
             * The return address to be printed on the check. If omitted this will default to an
             * Increase-owned address that will mark checks as delivery failed and shred them.
             */
            fun returnAddress(returnAddress: ReturnAddress?) = apply {
                this.returnAddress = returnAddress
            }

            /**
             * The return address to be printed on the check. If omitted this will default to an
             * Increase-owned address that will mark checks as delivery failed and shred them.
             */
            fun returnAddress(returnAddress: Optional<ReturnAddress>) =
                returnAddress(returnAddress.orElse(null))

            /**
             * The text that will appear as the signature on the check in cursive font. If not
             * provided, the check will be printed with 'No signature required'.
             */
            fun signatureText(signatureText: String?) = apply { this.signatureText = signatureText }

            /**
             * The text that will appear as the signature on the check in cursive font. If not
             * provided, the check will be printed with 'No signature required'.
             */
            fun signatureText(signatureText: Optional<String>) =
                signatureText(signatureText.orElse(null))

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

            fun build(): PhysicalCheck =
                PhysicalCheck(
                    checkNotNull(mailingAddress) { "`mailingAddress` is required but was not set" },
                    checkNotNull(memo) { "`memo` is required but was not set" },
                    checkNotNull(recipientName) { "`recipientName` is required but was not set" },
                    note,
                    returnAddress,
                    signatureText,
                    additionalProperties.toImmutable(),
                )
        }

        /** Details for where Increase will mail the check. */
        @NoAutoDetect
        class MailingAddress
        @JsonCreator
        private constructor(
            @JsonProperty("city") private val city: String,
            @JsonProperty("line1") private val line1: String,
            @JsonProperty("postal_code") private val postalCode: String,
            @JsonProperty("state") private val state: String,
            @JsonProperty("line2") private val line2: String?,
            @JsonProperty("name") private val name: String?,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The city component of the check's destination address. */
            @JsonProperty("city") fun city(): String = city

            /** The first line of the address component of the check's destination address. */
            @JsonProperty("line1") fun line1(): String = line1

            /** The postal code component of the check's destination address. */
            @JsonProperty("postal_code") fun postalCode(): String = postalCode

            /** The US state component of the check's destination address. */
            @JsonProperty("state") fun state(): String = state

            /** The second line of the address component of the check's destination address. */
            @JsonProperty("line2") fun line2(): Optional<String> = Optional.ofNullable(line2)

            /**
             * The name component of the check's destination address. Defaults to the provided
             * `recipient_name` parameter.
             */
            @JsonProperty("name") fun name(): Optional<String> = Optional.ofNullable(name)

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
                private var postalCode: String? = null
                private var state: String? = null
                private var line2: String? = null
                private var name: String? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(mailingAddress: MailingAddress) = apply {
                    city = mailingAddress.city
                    line1 = mailingAddress.line1
                    postalCode = mailingAddress.postalCode
                    state = mailingAddress.state
                    line2 = mailingAddress.line2
                    name = mailingAddress.name
                    additionalProperties = mailingAddress.additionalProperties.toMutableMap()
                }

                /** The city component of the check's destination address. */
                fun city(city: String) = apply { this.city = city }

                /** The first line of the address component of the check's destination address. */
                fun line1(line1: String) = apply { this.line1 = line1 }

                /** The postal code component of the check's destination address. */
                fun postalCode(postalCode: String) = apply { this.postalCode = postalCode }

                /** The US state component of the check's destination address. */
                fun state(state: String) = apply { this.state = state }

                /** The second line of the address component of the check's destination address. */
                fun line2(line2: String?) = apply { this.line2 = line2 }

                /** The second line of the address component of the check's destination address. */
                fun line2(line2: Optional<String>) = line2(line2.orElse(null))

                /**
                 * The name component of the check's destination address. Defaults to the provided
                 * `recipient_name` parameter.
                 */
                fun name(name: String?) = apply { this.name = name }

                /**
                 * The name component of the check's destination address. Defaults to the provided
                 * `recipient_name` parameter.
                 */
                fun name(name: Optional<String>) = name(name.orElse(null))

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): MailingAddress =
                    MailingAddress(
                        checkNotNull(city) { "`city` is required but was not set" },
                        checkNotNull(line1) { "`line1` is required but was not set" },
                        checkNotNull(postalCode) { "`postalCode` is required but was not set" },
                        checkNotNull(state) { "`state` is required but was not set" },
                        line2,
                        name,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is MailingAddress && city == other.city && line1 == other.line1 && postalCode == other.postalCode && state == other.state && line2 == other.line2 && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(city, line1, postalCode, state, line2, name, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "MailingAddress{city=$city, line1=$line1, postalCode=$postalCode, state=$state, line2=$line2, name=$name, additionalProperties=$additionalProperties}"
        }

        /**
         * The return address to be printed on the check. If omitted this will default to an
         * Increase-owned address that will mark checks as delivery failed and shred them.
         */
        @NoAutoDetect
        class ReturnAddress
        @JsonCreator
        private constructor(
            @JsonProperty("city") private val city: String,
            @JsonProperty("line1") private val line1: String,
            @JsonProperty("name") private val name: String,
            @JsonProperty("postal_code") private val postalCode: String,
            @JsonProperty("state") private val state: String,
            @JsonProperty("line2") private val line2: String?,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The city of the return address. */
            @JsonProperty("city") fun city(): String = city

            /** The first line of the return address. */
            @JsonProperty("line1") fun line1(): String = line1

            /** The name of the return address. */
            @JsonProperty("name") fun name(): String = name

            /** The postal code of the return address. */
            @JsonProperty("postal_code") fun postalCode(): String = postalCode

            /** The US state of the return address. */
            @JsonProperty("state") fun state(): String = state

            /** The second line of the return address. */
            @JsonProperty("line2") fun line2(): Optional<String> = Optional.ofNullable(line2)

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
                private var name: String? = null
                private var postalCode: String? = null
                private var state: String? = null
                private var line2: String? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(returnAddress: ReturnAddress) = apply {
                    city = returnAddress.city
                    line1 = returnAddress.line1
                    name = returnAddress.name
                    postalCode = returnAddress.postalCode
                    state = returnAddress.state
                    line2 = returnAddress.line2
                    additionalProperties = returnAddress.additionalProperties.toMutableMap()
                }

                /** The city of the return address. */
                fun city(city: String) = apply { this.city = city }

                /** The first line of the return address. */
                fun line1(line1: String) = apply { this.line1 = line1 }

                /** The name of the return address. */
                fun name(name: String) = apply { this.name = name }

                /** The postal code of the return address. */
                fun postalCode(postalCode: String) = apply { this.postalCode = postalCode }

                /** The US state of the return address. */
                fun state(state: String) = apply { this.state = state }

                /** The second line of the return address. */
                fun line2(line2: String?) = apply { this.line2 = line2 }

                /** The second line of the return address. */
                fun line2(line2: Optional<String>) = line2(line2.orElse(null))

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): ReturnAddress =
                    ReturnAddress(
                        checkNotNull(city) { "`city` is required but was not set" },
                        checkNotNull(line1) { "`line1` is required but was not set" },
                        checkNotNull(name) { "`name` is required but was not set" },
                        checkNotNull(postalCode) { "`postalCode` is required but was not set" },
                        checkNotNull(state) { "`state` is required but was not set" },
                        line2,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ReturnAddress && city == other.city && line1 == other.line1 && name == other.name && postalCode == other.postalCode && state == other.state && line2 == other.line2 && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(city, line1, name, postalCode, state, line2, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ReturnAddress{city=$city, line1=$line1, name=$name, postalCode=$postalCode, state=$state, line2=$line2, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PhysicalCheck && mailingAddress == other.mailingAddress && memo == other.memo && recipientName == other.recipientName && note == other.note && returnAddress == other.returnAddress && signatureText == other.signatureText && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(mailingAddress, memo, recipientName, note, returnAddress, signatureText, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PhysicalCheck{mailingAddress=$mailingAddress, memo=$memo, recipientName=$recipientName, note=$note, returnAddress=$returnAddress, signatureText=$signatureText, additionalProperties=$additionalProperties}"
    }

    /**
     * Details relating to the custom fulfillment you will perform. This is required if
     * `fulfillment_method` is equal to `third_party`. It must not be included if any other
     * `fulfillment_method` is provided.
     */
    @NoAutoDetect
    class ThirdParty
    @JsonCreator
    private constructor(
        @JsonProperty("check_number") private val checkNumber: String?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * The check number you will print on the check. This should not contain leading zeroes. If
         * this is omitted, Increase will generate a check number for you; you should inspect the
         * response and use that check number.
         */
        @JsonProperty("check_number")
        fun checkNumber(): Optional<String> = Optional.ofNullable(checkNumber)

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
                checkNumber = thirdParty.checkNumber
                additionalProperties = thirdParty.additionalProperties.toMutableMap()
            }

            /**
             * The check number you will print on the check. This should not contain leading zeroes.
             * If this is omitted, Increase will generate a check number for you; you should inspect
             * the response and use that check number.
             */
            fun checkNumber(checkNumber: String?) = apply { this.checkNumber = checkNumber }

            /**
             * The check number you will print on the check. This should not contain leading zeroes.
             * If this is omitted, Increase will generate a check number for you; you should inspect
             * the response and use that check number.
             */
            fun checkNumber(checkNumber: Optional<String>) = checkNumber(checkNumber.orElse(null))

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

            fun build(): ThirdParty = ThirdParty(checkNumber, additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ThirdParty && checkNumber == other.checkNumber && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(checkNumber, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ThirdParty{checkNumber=$checkNumber, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CheckTransferCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "CheckTransferCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
