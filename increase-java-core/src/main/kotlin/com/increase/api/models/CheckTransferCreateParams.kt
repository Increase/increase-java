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

class CheckTransferCreateParams
constructor(
    private val accountId: String,
    private val addressLine1: String,
    private val addressLine2: String?,
    private val addressCity: String,
    private val addressState: String,
    private val addressZip: String,
    private val returnAddress: ReturnAddress?,
    private val amount: Long,
    private val message: String,
    private val note: String?,
    private val recipientName: String,
    private val requireApproval: Boolean?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun accountId(): String = accountId

    fun addressLine1(): String = addressLine1

    fun addressLine2(): Optional<String> = Optional.ofNullable(addressLine2)

    fun addressCity(): String = addressCity

    fun addressState(): String = addressState

    fun addressZip(): String = addressZip

    fun returnAddress(): Optional<ReturnAddress> = Optional.ofNullable(returnAddress)

    fun amount(): Long = amount

    fun message(): String = message

    fun note(): Optional<String> = Optional.ofNullable(note)

    fun recipientName(): String = recipientName

    fun requireApproval(): Optional<Boolean> = Optional.ofNullable(requireApproval)

    @JvmSynthetic
    internal fun getBody(): CheckTransferCreateBody {
        return CheckTransferCreateBody(
            accountId,
            addressLine1,
            addressLine2,
            addressCity,
            addressState,
            addressZip,
            returnAddress,
            amount,
            message,
            note,
            recipientName,
            requireApproval,
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
        private val addressLine1: String?,
        private val addressLine2: String?,
        private val addressCity: String?,
        private val addressState: String?,
        private val addressZip: String?,
        private val returnAddress: ReturnAddress?,
        private val amount: Long?,
        private val message: String?,
        private val note: String?,
        private val recipientName: String?,
        private val requireApproval: Boolean?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** The identifier for the account that will send the transfer. */
        @JsonProperty("account_id") fun accountId(): String? = accountId

        /** The street address of the check's destination. */
        @JsonProperty("address_line1") fun addressLine1(): String? = addressLine1

        /** The second line of the address of the check's destination. */
        @JsonProperty("address_line2") fun addressLine2(): String? = addressLine2

        /** The city of the check's destination. */
        @JsonProperty("address_city") fun addressCity(): String? = addressCity

        /** The state of the check's destination. */
        @JsonProperty("address_state") fun addressState(): String? = addressState

        /** The postal code of the check's destination. */
        @JsonProperty("address_zip") fun addressZip(): String? = addressZip

        /**
         * The return address to be printed on the check. If omitted this will default to the
         * address of the Entity of the Account used to make the Check Transfer.
         */
        @JsonProperty("return_address") fun returnAddress(): ReturnAddress? = returnAddress

        /** The transfer amount in cents. */
        @JsonProperty("amount") fun amount(): Long? = amount

        /** The descriptor that will be printed on the memo field on the check. */
        @JsonProperty("message") fun message(): String? = message

        /** The descriptor that will be printed on the letter included with the check. */
        @JsonProperty("note") fun note(): String? = note

        /** The name that will be printed on the check. */
        @JsonProperty("recipient_name") fun recipientName(): String? = recipientName

        /** Whether the transfer requires explicit approval via the dashboard or API. */
        @JsonProperty("require_approval") fun requireApproval(): Boolean? = requireApproval

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CheckTransferCreateBody &&
                this.accountId == other.accountId &&
                this.addressLine1 == other.addressLine1 &&
                this.addressLine2 == other.addressLine2 &&
                this.addressCity == other.addressCity &&
                this.addressState == other.addressState &&
                this.addressZip == other.addressZip &&
                this.returnAddress == other.returnAddress &&
                this.amount == other.amount &&
                this.message == other.message &&
                this.note == other.note &&
                this.recipientName == other.recipientName &&
                this.requireApproval == other.requireApproval &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        accountId,
                        addressLine1,
                        addressLine2,
                        addressCity,
                        addressState,
                        addressZip,
                        returnAddress,
                        amount,
                        message,
                        note,
                        recipientName,
                        requireApproval,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "CheckTransferCreateBody{accountId=$accountId, addressLine1=$addressLine1, addressLine2=$addressLine2, addressCity=$addressCity, addressState=$addressState, addressZip=$addressZip, returnAddress=$returnAddress, amount=$amount, message=$message, note=$note, recipientName=$recipientName, requireApproval=$requireApproval, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var accountId: String? = null
            private var addressLine1: String? = null
            private var addressLine2: String? = null
            private var addressCity: String? = null
            private var addressState: String? = null
            private var addressZip: String? = null
            private var returnAddress: ReturnAddress? = null
            private var amount: Long? = null
            private var message: String? = null
            private var note: String? = null
            private var recipientName: String? = null
            private var requireApproval: Boolean? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(checkTransferCreateBody: CheckTransferCreateBody) = apply {
                this.accountId = checkTransferCreateBody.accountId
                this.addressLine1 = checkTransferCreateBody.addressLine1
                this.addressLine2 = checkTransferCreateBody.addressLine2
                this.addressCity = checkTransferCreateBody.addressCity
                this.addressState = checkTransferCreateBody.addressState
                this.addressZip = checkTransferCreateBody.addressZip
                this.returnAddress = checkTransferCreateBody.returnAddress
                this.amount = checkTransferCreateBody.amount
                this.message = checkTransferCreateBody.message
                this.note = checkTransferCreateBody.note
                this.recipientName = checkTransferCreateBody.recipientName
                this.requireApproval = checkTransferCreateBody.requireApproval
                additionalProperties(checkTransferCreateBody.additionalProperties)
            }

            /** The identifier for the account that will send the transfer. */
            @JsonProperty("account_id")
            fun accountId(accountId: String) = apply { this.accountId = accountId }

            /** The street address of the check's destination. */
            @JsonProperty("address_line1")
            fun addressLine1(addressLine1: String) = apply { this.addressLine1 = addressLine1 }

            /** The second line of the address of the check's destination. */
            @JsonProperty("address_line2")
            fun addressLine2(addressLine2: String) = apply { this.addressLine2 = addressLine2 }

            /** The city of the check's destination. */
            @JsonProperty("address_city")
            fun addressCity(addressCity: String) = apply { this.addressCity = addressCity }

            /** The state of the check's destination. */
            @JsonProperty("address_state")
            fun addressState(addressState: String) = apply { this.addressState = addressState }

            /** The postal code of the check's destination. */
            @JsonProperty("address_zip")
            fun addressZip(addressZip: String) = apply { this.addressZip = addressZip }

            /**
             * The return address to be printed on the check. If omitted this will default to the
             * address of the Entity of the Account used to make the Check Transfer.
             */
            @JsonProperty("return_address")
            fun returnAddress(returnAddress: ReturnAddress) = apply {
                this.returnAddress = returnAddress
            }

            /** The transfer amount in cents. */
            @JsonProperty("amount") fun amount(amount: Long) = apply { this.amount = amount }

            /** The descriptor that will be printed on the memo field on the check. */
            @JsonProperty("message") fun message(message: String) = apply { this.message = message }

            /** The descriptor that will be printed on the letter included with the check. */
            @JsonProperty("note") fun note(note: String) = apply { this.note = note }

            /** The name that will be printed on the check. */
            @JsonProperty("recipient_name")
            fun recipientName(recipientName: String) = apply { this.recipientName = recipientName }

            /** Whether the transfer requires explicit approval via the dashboard or API. */
            @JsonProperty("require_approval")
            fun requireApproval(requireApproval: Boolean) = apply {
                this.requireApproval = requireApproval
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

            fun build(): CheckTransferCreateBody =
                CheckTransferCreateBody(
                    checkNotNull(accountId) { "`accountId` is required but was not set" },
                    checkNotNull(addressLine1) { "`addressLine1` is required but was not set" },
                    addressLine2,
                    checkNotNull(addressCity) { "`addressCity` is required but was not set" },
                    checkNotNull(addressState) { "`addressState` is required but was not set" },
                    checkNotNull(addressZip) { "`addressZip` is required but was not set" },
                    returnAddress,
                    checkNotNull(amount) { "`amount` is required but was not set" },
                    checkNotNull(message) { "`message` is required but was not set" },
                    note,
                    checkNotNull(recipientName) { "`recipientName` is required but was not set" },
                    requireApproval,
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

        return other is CheckTransferCreateParams &&
            this.accountId == other.accountId &&
            this.addressLine1 == other.addressLine1 &&
            this.addressLine2 == other.addressLine2 &&
            this.addressCity == other.addressCity &&
            this.addressState == other.addressState &&
            this.addressZip == other.addressZip &&
            this.returnAddress == other.returnAddress &&
            this.amount == other.amount &&
            this.message == other.message &&
            this.note == other.note &&
            this.recipientName == other.recipientName &&
            this.requireApproval == other.requireApproval &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            accountId,
            addressLine1,
            addressLine2,
            addressCity,
            addressState,
            addressZip,
            returnAddress,
            amount,
            message,
            note,
            recipientName,
            requireApproval,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "CheckTransferCreateParams{accountId=$accountId, addressLine1=$addressLine1, addressLine2=$addressLine2, addressCity=$addressCity, addressState=$addressState, addressZip=$addressZip, returnAddress=$returnAddress, amount=$amount, message=$message, note=$note, recipientName=$recipientName, requireApproval=$requireApproval, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var accountId: String? = null
        private var addressLine1: String? = null
        private var addressLine2: String? = null
        private var addressCity: String? = null
        private var addressState: String? = null
        private var addressZip: String? = null
        private var returnAddress: ReturnAddress? = null
        private var amount: Long? = null
        private var message: String? = null
        private var note: String? = null
        private var recipientName: String? = null
        private var requireApproval: Boolean? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(checkTransferCreateParams: CheckTransferCreateParams) = apply {
            this.accountId = checkTransferCreateParams.accountId
            this.addressLine1 = checkTransferCreateParams.addressLine1
            this.addressLine2 = checkTransferCreateParams.addressLine2
            this.addressCity = checkTransferCreateParams.addressCity
            this.addressState = checkTransferCreateParams.addressState
            this.addressZip = checkTransferCreateParams.addressZip
            this.returnAddress = checkTransferCreateParams.returnAddress
            this.amount = checkTransferCreateParams.amount
            this.message = checkTransferCreateParams.message
            this.note = checkTransferCreateParams.note
            this.recipientName = checkTransferCreateParams.recipientName
            this.requireApproval = checkTransferCreateParams.requireApproval
            additionalQueryParams(checkTransferCreateParams.additionalQueryParams)
            additionalHeaders(checkTransferCreateParams.additionalHeaders)
            additionalBodyProperties(checkTransferCreateParams.additionalBodyProperties)
        }

        /** The identifier for the account that will send the transfer. */
        fun accountId(accountId: String) = apply { this.accountId = accountId }

        /** The street address of the check's destination. */
        fun addressLine1(addressLine1: String) = apply { this.addressLine1 = addressLine1 }

        /** The second line of the address of the check's destination. */
        fun addressLine2(addressLine2: String) = apply { this.addressLine2 = addressLine2 }

        /** The city of the check's destination. */
        fun addressCity(addressCity: String) = apply { this.addressCity = addressCity }

        /** The state of the check's destination. */
        fun addressState(addressState: String) = apply { this.addressState = addressState }

        /** The postal code of the check's destination. */
        fun addressZip(addressZip: String) = apply { this.addressZip = addressZip }

        /**
         * The return address to be printed on the check. If omitted this will default to the
         * address of the Entity of the Account used to make the Check Transfer.
         */
        fun returnAddress(returnAddress: ReturnAddress) = apply {
            this.returnAddress = returnAddress
        }

        /** The transfer amount in cents. */
        fun amount(amount: Long) = apply { this.amount = amount }

        /** The descriptor that will be printed on the memo field on the check. */
        fun message(message: String) = apply { this.message = message }

        /** The descriptor that will be printed on the letter included with the check. */
        fun note(note: String) = apply { this.note = note }

        /** The name that will be printed on the check. */
        fun recipientName(recipientName: String) = apply { this.recipientName = recipientName }

        /** Whether the transfer requires explicit approval via the dashboard or API. */
        fun requireApproval(requireApproval: Boolean) = apply {
            this.requireApproval = requireApproval
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

        fun build(): CheckTransferCreateParams =
            CheckTransferCreateParams(
                checkNotNull(accountId) { "`accountId` is required but was not set" },
                checkNotNull(addressLine1) { "`addressLine1` is required but was not set" },
                addressLine2,
                checkNotNull(addressCity) { "`addressCity` is required but was not set" },
                checkNotNull(addressState) { "`addressState` is required but was not set" },
                checkNotNull(addressZip) { "`addressZip` is required but was not set" },
                returnAddress,
                checkNotNull(amount) { "`amount` is required but was not set" },
                checkNotNull(message) { "`message` is required but was not set" },
                note,
                checkNotNull(recipientName) { "`recipientName` is required but was not set" },
                requireApproval,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    /**
     * The return address to be printed on the check. If omitted this will default to the address of
     * the Entity of the Account used to make the Check Transfer.
     */
    @JsonDeserialize(builder = ReturnAddress.Builder::class)
    @NoAutoDetect
    class ReturnAddress
    private constructor(
        private val name: String?,
        private val line1: String?,
        private val line2: String?,
        private val city: String?,
        private val state: String?,
        private val zip: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** The name of the return address. */
        @JsonProperty("name") fun name(): String? = name

        /** The first line of the return address. */
        @JsonProperty("line1") fun line1(): String? = line1

        /** The second line of the return address. */
        @JsonProperty("line2") fun line2(): String? = line2

        /** The city of the return address. */
        @JsonProperty("city") fun city(): String? = city

        /** The US state of the return address. */
        @JsonProperty("state") fun state(): String? = state

        /** The postal code of the return address. */
        @JsonProperty("zip") fun zip(): String? = zip

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ReturnAddress &&
                this.name == other.name &&
                this.line1 == other.line1 &&
                this.line2 == other.line2 &&
                this.city == other.city &&
                this.state == other.state &&
                this.zip == other.zip &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        name,
                        line1,
                        line2,
                        city,
                        state,
                        zip,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "ReturnAddress{name=$name, line1=$line1, line2=$line2, city=$city, state=$state, zip=$zip, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var name: String? = null
            private var line1: String? = null
            private var line2: String? = null
            private var city: String? = null
            private var state: String? = null
            private var zip: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(returnAddress: ReturnAddress) = apply {
                this.name = returnAddress.name
                this.line1 = returnAddress.line1
                this.line2 = returnAddress.line2
                this.city = returnAddress.city
                this.state = returnAddress.state
                this.zip = returnAddress.zip
                additionalProperties(returnAddress.additionalProperties)
            }

            /** The name of the return address. */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            /** The first line of the return address. */
            @JsonProperty("line1") fun line1(line1: String) = apply { this.line1 = line1 }

            /** The second line of the return address. */
            @JsonProperty("line2") fun line2(line2: String) = apply { this.line2 = line2 }

            /** The city of the return address. */
            @JsonProperty("city") fun city(city: String) = apply { this.city = city }

            /** The US state of the return address. */
            @JsonProperty("state") fun state(state: String) = apply { this.state = state }

            /** The postal code of the return address. */
            @JsonProperty("zip") fun zip(zip: String) = apply { this.zip = zip }

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

            fun build(): ReturnAddress =
                ReturnAddress(
                    checkNotNull(name) { "`name` is required but was not set" },
                    checkNotNull(line1) { "`line1` is required but was not set" },
                    line2,
                    checkNotNull(city) { "`city` is required but was not set" },
                    checkNotNull(state) { "`state` is required but was not set" },
                    checkNotNull(zip) { "`zip` is required but was not set" },
                    additionalProperties.toUnmodifiable(),
                )
        }
    }
}
