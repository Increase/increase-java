// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.increase.api.core.Enum
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonMissing
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

    /** The identifier for the account that will send the transfer. */
    fun _accountId(): JsonField<String> = body._accountId()

    /** The transfer amount in USD cents. */
    fun _amount(): JsonField<Long> = body._amount()

    /**
     * The identifier of the Account Number from which to send the transfer and print on the check.
     */
    fun _sourceAccountNumberId(): JsonField<String> = body._sourceAccountNumberId()

    /** Whether Increase will print and mail the check or if you will do it yourself. */
    fun _fulfillmentMethod(): JsonField<FulfillmentMethod> = body._fulfillmentMethod()

    /**
     * Details relating to the physical check that Increase will print and mail. This is required if
     * `fulfillment_method` is equal to `physical_check`. It must not be included if any other
     * `fulfillment_method` is provided.
     */
    fun _physicalCheck(): JsonField<PhysicalCheck> = body._physicalCheck()

    /** Whether the transfer requires explicit approval via the dashboard or API. */
    fun _requireApproval(): JsonField<Boolean> = body._requireApproval()

    /**
     * Details relating to the custom fulfillment you will perform. This is required if
     * `fulfillment_method` is equal to `third_party`. It must not be included if any other
     * `fulfillment_method` is provided.
     */
    fun _thirdParty(): JsonField<ThirdParty> = body._thirdParty()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun getBody(): CheckTransferCreateBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class CheckTransferCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("account_id")
        @ExcludeMissing
        private val accountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("amount")
        @ExcludeMissing
        private val amount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("source_account_number_id")
        @ExcludeMissing
        private val sourceAccountNumberId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("fulfillment_method")
        @ExcludeMissing
        private val fulfillmentMethod: JsonField<FulfillmentMethod> = JsonMissing.of(),
        @JsonProperty("physical_check")
        @ExcludeMissing
        private val physicalCheck: JsonField<PhysicalCheck> = JsonMissing.of(),
        @JsonProperty("require_approval")
        @ExcludeMissing
        private val requireApproval: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("third_party")
        @ExcludeMissing
        private val thirdParty: JsonField<ThirdParty> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The identifier for the account that will send the transfer. */
        fun accountId(): String = accountId.getRequired("account_id")

        /** The transfer amount in USD cents. */
        fun amount(): Long = amount.getRequired("amount")

        /**
         * The identifier of the Account Number from which to send the transfer and print on the
         * check.
         */
        fun sourceAccountNumberId(): String =
            sourceAccountNumberId.getRequired("source_account_number_id")

        /** Whether Increase will print and mail the check or if you will do it yourself. */
        fun fulfillmentMethod(): Optional<FulfillmentMethod> =
            Optional.ofNullable(fulfillmentMethod.getNullable("fulfillment_method"))

        /**
         * Details relating to the physical check that Increase will print and mail. This is
         * required if `fulfillment_method` is equal to `physical_check`. It must not be included if
         * any other `fulfillment_method` is provided.
         */
        fun physicalCheck(): Optional<PhysicalCheck> =
            Optional.ofNullable(physicalCheck.getNullable("physical_check"))

        /** Whether the transfer requires explicit approval via the dashboard or API. */
        fun requireApproval(): Optional<Boolean> =
            Optional.ofNullable(requireApproval.getNullable("require_approval"))

        /**
         * Details relating to the custom fulfillment you will perform. This is required if
         * `fulfillment_method` is equal to `third_party`. It must not be included if any other
         * `fulfillment_method` is provided.
         */
        fun thirdParty(): Optional<ThirdParty> =
            Optional.ofNullable(thirdParty.getNullable("third_party"))

        /** The identifier for the account that will send the transfer. */
        @JsonProperty("account_id") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

        /** The transfer amount in USD cents. */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

        /**
         * The identifier of the Account Number from which to send the transfer and print on the
         * check.
         */
        @JsonProperty("source_account_number_id")
        @ExcludeMissing
        fun _sourceAccountNumberId(): JsonField<String> = sourceAccountNumberId

        /** Whether Increase will print and mail the check or if you will do it yourself. */
        @JsonProperty("fulfillment_method")
        @ExcludeMissing
        fun _fulfillmentMethod(): JsonField<FulfillmentMethod> = fulfillmentMethod

        /**
         * Details relating to the physical check that Increase will print and mail. This is
         * required if `fulfillment_method` is equal to `physical_check`. It must not be included if
         * any other `fulfillment_method` is provided.
         */
        @JsonProperty("physical_check")
        @ExcludeMissing
        fun _physicalCheck(): JsonField<PhysicalCheck> = physicalCheck

        /** Whether the transfer requires explicit approval via the dashboard or API. */
        @JsonProperty("require_approval")
        @ExcludeMissing
        fun _requireApproval(): JsonField<Boolean> = requireApproval

        /**
         * Details relating to the custom fulfillment you will perform. This is required if
         * `fulfillment_method` is equal to `third_party`. It must not be included if any other
         * `fulfillment_method` is provided.
         */
        @JsonProperty("third_party")
        @ExcludeMissing
        fun _thirdParty(): JsonField<ThirdParty> = thirdParty

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): CheckTransferCreateBody = apply {
            if (!validated) {
                accountId()
                amount()
                sourceAccountNumberId()
                fulfillmentMethod()
                physicalCheck().map { it.validate() }
                requireApproval()
                thirdParty().map { it.validate() }
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var accountId: JsonField<String>? = null
            private var amount: JsonField<Long>? = null
            private var sourceAccountNumberId: JsonField<String>? = null
            private var fulfillmentMethod: JsonField<FulfillmentMethod> = JsonMissing.of()
            private var physicalCheck: JsonField<PhysicalCheck> = JsonMissing.of()
            private var requireApproval: JsonField<Boolean> = JsonMissing.of()
            private var thirdParty: JsonField<ThirdParty> = JsonMissing.of()
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
            fun accountId(accountId: String) = accountId(JsonField.of(accountId))

            /** The identifier for the account that will send the transfer. */
            fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

            /** The transfer amount in USD cents. */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /** The transfer amount in USD cents. */
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            /**
             * The identifier of the Account Number from which to send the transfer and print on the
             * check.
             */
            fun sourceAccountNumberId(sourceAccountNumberId: String) =
                sourceAccountNumberId(JsonField.of(sourceAccountNumberId))

            /**
             * The identifier of the Account Number from which to send the transfer and print on the
             * check.
             */
            fun sourceAccountNumberId(sourceAccountNumberId: JsonField<String>) = apply {
                this.sourceAccountNumberId = sourceAccountNumberId
            }

            /** Whether Increase will print and mail the check or if you will do it yourself. */
            fun fulfillmentMethod(fulfillmentMethod: FulfillmentMethod) =
                fulfillmentMethod(JsonField.of(fulfillmentMethod))

            /** Whether Increase will print and mail the check or if you will do it yourself. */
            fun fulfillmentMethod(fulfillmentMethod: JsonField<FulfillmentMethod>) = apply {
                this.fulfillmentMethod = fulfillmentMethod
            }

            /**
             * Details relating to the physical check that Increase will print and mail. This is
             * required if `fulfillment_method` is equal to `physical_check`. It must not be
             * included if any other `fulfillment_method` is provided.
             */
            fun physicalCheck(physicalCheck: PhysicalCheck) =
                physicalCheck(JsonField.of(physicalCheck))

            /**
             * Details relating to the physical check that Increase will print and mail. This is
             * required if `fulfillment_method` is equal to `physical_check`. It must not be
             * included if any other `fulfillment_method` is provided.
             */
            fun physicalCheck(physicalCheck: JsonField<PhysicalCheck>) = apply {
                this.physicalCheck = physicalCheck
            }

            /** Whether the transfer requires explicit approval via the dashboard or API. */
            fun requireApproval(requireApproval: Boolean) =
                requireApproval(JsonField.of(requireApproval))

            /** Whether the transfer requires explicit approval via the dashboard or API. */
            fun requireApproval(requireApproval: JsonField<Boolean>) = apply {
                this.requireApproval = requireApproval
            }

            /**
             * Details relating to the custom fulfillment you will perform. This is required if
             * `fulfillment_method` is equal to `third_party`. It must not be included if any other
             * `fulfillment_method` is provided.
             */
            fun thirdParty(thirdParty: ThirdParty) = thirdParty(JsonField.of(thirdParty))

            /**
             * Details relating to the custom fulfillment you will perform. This is required if
             * `fulfillment_method` is equal to `third_party`. It must not be included if any other
             * `fulfillment_method` is provided.
             */
            fun thirdParty(thirdParty: JsonField<ThirdParty>) = apply {
                this.thirdParty = thirdParty
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

        /** The identifier for the account that will send the transfer. */
        fun accountId(accountId: JsonField<String>) = apply { body.accountId(accountId) }

        /** The transfer amount in USD cents. */
        fun amount(amount: Long) = apply { body.amount(amount) }

        /** The transfer amount in USD cents. */
        fun amount(amount: JsonField<Long>) = apply { body.amount(amount) }

        /**
         * The identifier of the Account Number from which to send the transfer and print on the
         * check.
         */
        fun sourceAccountNumberId(sourceAccountNumberId: String) = apply {
            body.sourceAccountNumberId(sourceAccountNumberId)
        }

        /**
         * The identifier of the Account Number from which to send the transfer and print on the
         * check.
         */
        fun sourceAccountNumberId(sourceAccountNumberId: JsonField<String>) = apply {
            body.sourceAccountNumberId(sourceAccountNumberId)
        }

        /** Whether Increase will print and mail the check or if you will do it yourself. */
        fun fulfillmentMethod(fulfillmentMethod: FulfillmentMethod) = apply {
            body.fulfillmentMethod(fulfillmentMethod)
        }

        /** Whether Increase will print and mail the check or if you will do it yourself. */
        fun fulfillmentMethod(fulfillmentMethod: JsonField<FulfillmentMethod>) = apply {
            body.fulfillmentMethod(fulfillmentMethod)
        }

        /**
         * Details relating to the physical check that Increase will print and mail. This is
         * required if `fulfillment_method` is equal to `physical_check`. It must not be included if
         * any other `fulfillment_method` is provided.
         */
        fun physicalCheck(physicalCheck: PhysicalCheck) = apply {
            body.physicalCheck(physicalCheck)
        }

        /**
         * Details relating to the physical check that Increase will print and mail. This is
         * required if `fulfillment_method` is equal to `physical_check`. It must not be included if
         * any other `fulfillment_method` is provided.
         */
        fun physicalCheck(physicalCheck: JsonField<PhysicalCheck>) = apply {
            body.physicalCheck(physicalCheck)
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
         * Details relating to the custom fulfillment you will perform. This is required if
         * `fulfillment_method` is equal to `third_party`. It must not be included if any other
         * `fulfillment_method` is provided.
         */
        fun thirdParty(thirdParty: ThirdParty) = apply { body.thirdParty(thirdParty) }

        /**
         * Details relating to the custom fulfillment you will perform. This is required if
         * `fulfillment_method` is equal to `third_party`. It must not be included if any other
         * `fulfillment_method` is provided.
         */
        fun thirdParty(thirdParty: JsonField<ThirdParty>) = apply { body.thirdParty(thirdParty) }

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
        @JsonProperty("mailing_address")
        @ExcludeMissing
        private val mailingAddress: JsonField<MailingAddress> = JsonMissing.of(),
        @JsonProperty("memo")
        @ExcludeMissing
        private val memo: JsonField<String> = JsonMissing.of(),
        @JsonProperty("recipient_name")
        @ExcludeMissing
        private val recipientName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("note")
        @ExcludeMissing
        private val note: JsonField<String> = JsonMissing.of(),
        @JsonProperty("return_address")
        @ExcludeMissing
        private val returnAddress: JsonField<ReturnAddress> = JsonMissing.of(),
        @JsonProperty("signature_text")
        @ExcludeMissing
        private val signatureText: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Details for where Increase will mail the check. */
        fun mailingAddress(): MailingAddress = mailingAddress.getRequired("mailing_address")

        /** The descriptor that will be printed on the memo field on the check. */
        fun memo(): String = memo.getRequired("memo")

        /** The name that will be printed on the check in the 'To:' field. */
        fun recipientName(): String = recipientName.getRequired("recipient_name")

        /** The descriptor that will be printed on the letter included with the check. */
        fun note(): Optional<String> = Optional.ofNullable(note.getNullable("note"))

        /**
         * The return address to be printed on the check. If omitted this will default to an
         * Increase-owned address that will mark checks as delivery failed and shred them.
         */
        fun returnAddress(): Optional<ReturnAddress> =
            Optional.ofNullable(returnAddress.getNullable("return_address"))

        /**
         * The text that will appear as the signature on the check in cursive font. If not provided,
         * the check will be printed with 'No signature required'.
         */
        fun signatureText(): Optional<String> =
            Optional.ofNullable(signatureText.getNullable("signature_text"))

        /** Details for where Increase will mail the check. */
        @JsonProperty("mailing_address")
        @ExcludeMissing
        fun _mailingAddress(): JsonField<MailingAddress> = mailingAddress

        /** The descriptor that will be printed on the memo field on the check. */
        @JsonProperty("memo") @ExcludeMissing fun _memo(): JsonField<String> = memo

        /** The name that will be printed on the check in the 'To:' field. */
        @JsonProperty("recipient_name")
        @ExcludeMissing
        fun _recipientName(): JsonField<String> = recipientName

        /** The descriptor that will be printed on the letter included with the check. */
        @JsonProperty("note") @ExcludeMissing fun _note(): JsonField<String> = note

        /**
         * The return address to be printed on the check. If omitted this will default to an
         * Increase-owned address that will mark checks as delivery failed and shred them.
         */
        @JsonProperty("return_address")
        @ExcludeMissing
        fun _returnAddress(): JsonField<ReturnAddress> = returnAddress

        /**
         * The text that will appear as the signature on the check in cursive font. If not provided,
         * the check will be printed with 'No signature required'.
         */
        @JsonProperty("signature_text")
        @ExcludeMissing
        fun _signatureText(): JsonField<String> = signatureText

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): PhysicalCheck = apply {
            if (!validated) {
                mailingAddress().validate()
                memo()
                recipientName()
                note()
                returnAddress().map { it.validate() }
                signatureText()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var mailingAddress: JsonField<MailingAddress>? = null
            private var memo: JsonField<String>? = null
            private var recipientName: JsonField<String>? = null
            private var note: JsonField<String> = JsonMissing.of()
            private var returnAddress: JsonField<ReturnAddress> = JsonMissing.of()
            private var signatureText: JsonField<String> = JsonMissing.of()
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
            fun mailingAddress(mailingAddress: MailingAddress) =
                mailingAddress(JsonField.of(mailingAddress))

            /** Details for where Increase will mail the check. */
            fun mailingAddress(mailingAddress: JsonField<MailingAddress>) = apply {
                this.mailingAddress = mailingAddress
            }

            /** The descriptor that will be printed on the memo field on the check. */
            fun memo(memo: String) = memo(JsonField.of(memo))

            /** The descriptor that will be printed on the memo field on the check. */
            fun memo(memo: JsonField<String>) = apply { this.memo = memo }

            /** The name that will be printed on the check in the 'To:' field. */
            fun recipientName(recipientName: String) = recipientName(JsonField.of(recipientName))

            /** The name that will be printed on the check in the 'To:' field. */
            fun recipientName(recipientName: JsonField<String>) = apply {
                this.recipientName = recipientName
            }

            /** The descriptor that will be printed on the letter included with the check. */
            fun note(note: String) = note(JsonField.of(note))

            /** The descriptor that will be printed on the letter included with the check. */
            fun note(note: JsonField<String>) = apply { this.note = note }

            /**
             * The return address to be printed on the check. If omitted this will default to an
             * Increase-owned address that will mark checks as delivery failed and shred them.
             */
            fun returnAddress(returnAddress: ReturnAddress) =
                returnAddress(JsonField.of(returnAddress))

            /**
             * The return address to be printed on the check. If omitted this will default to an
             * Increase-owned address that will mark checks as delivery failed and shred them.
             */
            fun returnAddress(returnAddress: JsonField<ReturnAddress>) = apply {
                this.returnAddress = returnAddress
            }

            /**
             * The text that will appear as the signature on the check in cursive font. If not
             * provided, the check will be printed with 'No signature required'.
             */
            fun signatureText(signatureText: String) = signatureText(JsonField.of(signatureText))

            /**
             * The text that will appear as the signature on the check in cursive font. If not
             * provided, the check will be printed with 'No signature required'.
             */
            fun signatureText(signatureText: JsonField<String>) = apply {
                this.signatureText = signatureText
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
            @JsonProperty("city")
            @ExcludeMissing
            private val city: JsonField<String> = JsonMissing.of(),
            @JsonProperty("line1")
            @ExcludeMissing
            private val line1: JsonField<String> = JsonMissing.of(),
            @JsonProperty("postal_code")
            @ExcludeMissing
            private val postalCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("state")
            @ExcludeMissing
            private val state: JsonField<String> = JsonMissing.of(),
            @JsonProperty("line2")
            @ExcludeMissing
            private val line2: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name")
            @ExcludeMissing
            private val name: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The city component of the check's destination address. */
            fun city(): String = city.getRequired("city")

            /** The first line of the address component of the check's destination address. */
            fun line1(): String = line1.getRequired("line1")

            /** The postal code component of the check's destination address. */
            fun postalCode(): String = postalCode.getRequired("postal_code")

            /** The US state component of the check's destination address. */
            fun state(): String = state.getRequired("state")

            /** The second line of the address component of the check's destination address. */
            fun line2(): Optional<String> = Optional.ofNullable(line2.getNullable("line2"))

            /**
             * The name component of the check's destination address. Defaults to the provided
             * `recipient_name` parameter.
             */
            fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

            /** The city component of the check's destination address. */
            @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

            /** The first line of the address component of the check's destination address. */
            @JsonProperty("line1") @ExcludeMissing fun _line1(): JsonField<String> = line1

            /** The postal code component of the check's destination address. */
            @JsonProperty("postal_code")
            @ExcludeMissing
            fun _postalCode(): JsonField<String> = postalCode

            /** The US state component of the check's destination address. */
            @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

            /** The second line of the address component of the check's destination address. */
            @JsonProperty("line2") @ExcludeMissing fun _line2(): JsonField<String> = line2

            /**
             * The name component of the check's destination address. Defaults to the provided
             * `recipient_name` parameter.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): MailingAddress = apply {
                if (!validated) {
                    city()
                    line1()
                    postalCode()
                    state()
                    line2()
                    name()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var city: JsonField<String>? = null
                private var line1: JsonField<String>? = null
                private var postalCode: JsonField<String>? = null
                private var state: JsonField<String>? = null
                private var line2: JsonField<String> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
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
                fun city(city: String) = city(JsonField.of(city))

                /** The city component of the check's destination address. */
                fun city(city: JsonField<String>) = apply { this.city = city }

                /** The first line of the address component of the check's destination address. */
                fun line1(line1: String) = line1(JsonField.of(line1))

                /** The first line of the address component of the check's destination address. */
                fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

                /** The postal code component of the check's destination address. */
                fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

                /** The postal code component of the check's destination address. */
                fun postalCode(postalCode: JsonField<String>) = apply {
                    this.postalCode = postalCode
                }

                /** The US state component of the check's destination address. */
                fun state(state: String) = state(JsonField.of(state))

                /** The US state component of the check's destination address. */
                fun state(state: JsonField<String>) = apply { this.state = state }

                /** The second line of the address component of the check's destination address. */
                fun line2(line2: String) = line2(JsonField.of(line2))

                /** The second line of the address component of the check's destination address. */
                fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

                /**
                 * The name component of the check's destination address. Defaults to the provided
                 * `recipient_name` parameter.
                 */
                fun name(name: String) = name(JsonField.of(name))

                /**
                 * The name component of the check's destination address. Defaults to the provided
                 * `recipient_name` parameter.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

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
            @JsonProperty("city")
            @ExcludeMissing
            private val city: JsonField<String> = JsonMissing.of(),
            @JsonProperty("line1")
            @ExcludeMissing
            private val line1: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name")
            @ExcludeMissing
            private val name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("postal_code")
            @ExcludeMissing
            private val postalCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("state")
            @ExcludeMissing
            private val state: JsonField<String> = JsonMissing.of(),
            @JsonProperty("line2")
            @ExcludeMissing
            private val line2: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The city of the return address. */
            fun city(): String = city.getRequired("city")

            /** The first line of the return address. */
            fun line1(): String = line1.getRequired("line1")

            /** The name of the return address. */
            fun name(): String = name.getRequired("name")

            /** The postal code of the return address. */
            fun postalCode(): String = postalCode.getRequired("postal_code")

            /** The US state of the return address. */
            fun state(): String = state.getRequired("state")

            /** The second line of the return address. */
            fun line2(): Optional<String> = Optional.ofNullable(line2.getNullable("line2"))

            /** The city of the return address. */
            @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

            /** The first line of the return address. */
            @JsonProperty("line1") @ExcludeMissing fun _line1(): JsonField<String> = line1

            /** The name of the return address. */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /** The postal code of the return address. */
            @JsonProperty("postal_code")
            @ExcludeMissing
            fun _postalCode(): JsonField<String> = postalCode

            /** The US state of the return address. */
            @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

            /** The second line of the return address. */
            @JsonProperty("line2") @ExcludeMissing fun _line2(): JsonField<String> = line2

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): ReturnAddress = apply {
                if (!validated) {
                    city()
                    line1()
                    name()
                    postalCode()
                    state()
                    line2()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var city: JsonField<String>? = null
                private var line1: JsonField<String>? = null
                private var name: JsonField<String>? = null
                private var postalCode: JsonField<String>? = null
                private var state: JsonField<String>? = null
                private var line2: JsonField<String> = JsonMissing.of()
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
                fun city(city: String) = city(JsonField.of(city))

                /** The city of the return address. */
                fun city(city: JsonField<String>) = apply { this.city = city }

                /** The first line of the return address. */
                fun line1(line1: String) = line1(JsonField.of(line1))

                /** The first line of the return address. */
                fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

                /** The name of the return address. */
                fun name(name: String) = name(JsonField.of(name))

                /** The name of the return address. */
                fun name(name: JsonField<String>) = apply { this.name = name }

                /** The postal code of the return address. */
                fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

                /** The postal code of the return address. */
                fun postalCode(postalCode: JsonField<String>) = apply {
                    this.postalCode = postalCode
                }

                /** The US state of the return address. */
                fun state(state: String) = state(JsonField.of(state))

                /** The US state of the return address. */
                fun state(state: JsonField<String>) = apply { this.state = state }

                /** The second line of the return address. */
                fun line2(line2: String) = line2(JsonField.of(line2))

                /** The second line of the return address. */
                fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

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
        @JsonProperty("check_number")
        @ExcludeMissing
        private val checkNumber: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * The check number you will print on the check. This should not contain leading zeroes. If
         * this is omitted, Increase will generate a check number for you; you should inspect the
         * response and use that check number.
         */
        fun checkNumber(): Optional<String> =
            Optional.ofNullable(checkNumber.getNullable("check_number"))

        /**
         * The check number you will print on the check. This should not contain leading zeroes. If
         * this is omitted, Increase will generate a check number for you; you should inspect the
         * response and use that check number.
         */
        @JsonProperty("check_number")
        @ExcludeMissing
        fun _checkNumber(): JsonField<String> = checkNumber

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): ThirdParty = apply {
            if (!validated) {
                checkNumber()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var checkNumber: JsonField<String> = JsonMissing.of()
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
            fun checkNumber(checkNumber: String) = checkNumber(JsonField.of(checkNumber))

            /**
             * The check number you will print on the check. This should not contain leading zeroes.
             * If this is omitted, Increase will generate a check number for you; you should inspect
             * the response and use that check number.
             */
            fun checkNumber(checkNumber: JsonField<String>) = apply {
                this.checkNumber = checkNumber
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
