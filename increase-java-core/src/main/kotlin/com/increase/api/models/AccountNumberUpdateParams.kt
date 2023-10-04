// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.toUnmodifiable
import com.increase.api.errors.IncreaseInvalidDataException
import com.increase.api.models.*
import java.util.Objects
import java.util.Optional

class AccountNumberUpdateParams
constructor(
    private val accountNumberId: String,
    private val inboundAch: InboundAch?,
    private val name: String?,
    private val status: Status?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun accountNumberId(): String = accountNumberId

    fun inboundAch(): Optional<InboundAch> = Optional.ofNullable(inboundAch)

    fun name(): Optional<String> = Optional.ofNullable(name)

    fun status(): Optional<Status> = Optional.ofNullable(status)

    @JvmSynthetic
    internal fun getBody(): AccountNumberUpdateBody {
        return AccountNumberUpdateBody(
            inboundAch,
            name,
            status,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> accountNumberId
            else -> ""
        }
    }

    @JsonDeserialize(builder = AccountNumberUpdateBody.Builder::class)
    @NoAutoDetect
    class AccountNumberUpdateBody
    internal constructor(
        private val inboundAch: InboundAch?,
        private val name: String?,
        private val status: Status?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** Options related to how this Account Number handles inbound ACH transfers. */
        @JsonProperty("inbound_ach") fun inboundAch(): InboundAch? = inboundAch

        /** The name you choose for the Account Number. */
        @JsonProperty("name") fun name(): String? = name

        /** This indicates if transfers can be made to the Account Number. */
        @JsonProperty("status") fun status(): Status? = status

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AccountNumberUpdateBody &&
                this.inboundAch == other.inboundAch &&
                this.name == other.name &&
                this.status == other.status &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        inboundAch,
                        name,
                        status,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "AccountNumberUpdateBody{inboundAch=$inboundAch, name=$name, status=$status, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var inboundAch: InboundAch? = null
            private var name: String? = null
            private var status: Status? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(accountNumberUpdateBody: AccountNumberUpdateBody) = apply {
                this.inboundAch = accountNumberUpdateBody.inboundAch
                this.name = accountNumberUpdateBody.name
                this.status = accountNumberUpdateBody.status
                additionalProperties(accountNumberUpdateBody.additionalProperties)
            }

            /** Options related to how this Account Number handles inbound ACH transfers. */
            @JsonProperty("inbound_ach")
            fun inboundAch(inboundAch: InboundAch) = apply { this.inboundAch = inboundAch }

            /** The name you choose for the Account Number. */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            /** This indicates if transfers can be made to the Account Number. */
            @JsonProperty("status") fun status(status: Status) = apply { this.status = status }

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

            fun build(): AccountNumberUpdateBody =
                AccountNumberUpdateBody(
                    inboundAch,
                    name,
                    status,
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

        return other is AccountNumberUpdateParams &&
            this.accountNumberId == other.accountNumberId &&
            this.inboundAch == other.inboundAch &&
            this.name == other.name &&
            this.status == other.status &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            accountNumberId,
            inboundAch,
            name,
            status,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "AccountNumberUpdateParams{accountNumberId=$accountNumberId, inboundAch=$inboundAch, name=$name, status=$status, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var accountNumberId: String? = null
        private var inboundAch: InboundAch? = null
        private var name: String? = null
        private var status: Status? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(accountNumberUpdateParams: AccountNumberUpdateParams) = apply {
            this.accountNumberId = accountNumberUpdateParams.accountNumberId
            this.inboundAch = accountNumberUpdateParams.inboundAch
            this.name = accountNumberUpdateParams.name
            this.status = accountNumberUpdateParams.status
            additionalQueryParams(accountNumberUpdateParams.additionalQueryParams)
            additionalHeaders(accountNumberUpdateParams.additionalHeaders)
            additionalBodyProperties(accountNumberUpdateParams.additionalBodyProperties)
        }

        /** The identifier of the Account Number. */
        fun accountNumberId(accountNumberId: String) = apply {
            this.accountNumberId = accountNumberId
        }

        /** Options related to how this Account Number handles inbound ACH transfers. */
        fun inboundAch(inboundAch: InboundAch) = apply { this.inboundAch = inboundAch }

        /** The name you choose for the Account Number. */
        fun name(name: String) = apply { this.name = name }

        /** This indicates if transfers can be made to the Account Number. */
        fun status(status: Status) = apply { this.status = status }

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

        fun build(): AccountNumberUpdateParams =
            AccountNumberUpdateParams(
                checkNotNull(accountNumberId) { "`accountNumberId` is required but was not set" },
                inboundAch,
                name,
                status,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    /** Options related to how this Account Number handles inbound ACH transfers. */
    @JsonDeserialize(builder = InboundAch.Builder::class)
    @NoAutoDetect
    class InboundAch
    private constructor(
        private val debitStatus: DebitStatus?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /**
         * Whether ACH debits are allowed against this Account Number. Note that ACH debits will be
         * declined if this is `allowed` but the Account Number is not active.
         */
        @JsonProperty("debit_status") fun debitStatus(): DebitStatus? = debitStatus

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is InboundAch &&
                this.debitStatus == other.debitStatus &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(debitStatus, additionalProperties)
            }
            return hashCode
        }

        override fun toString() =
            "InboundAch{debitStatus=$debitStatus, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var debitStatus: DebitStatus? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(inboundAch: InboundAch) = apply {
                this.debitStatus = inboundAch.debitStatus
                additionalProperties(inboundAch.additionalProperties)
            }

            /**
             * Whether ACH debits are allowed against this Account Number. Note that ACH debits will
             * be declined if this is `allowed` but the Account Number is not active.
             */
            @JsonProperty("debit_status")
            fun debitStatus(debitStatus: DebitStatus) = apply { this.debitStatus = debitStatus }

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

            fun build(): InboundAch = InboundAch(debitStatus, additionalProperties.toUnmodifiable())
        }

        class DebitStatus
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is DebitStatus && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val ALLOWED = DebitStatus(JsonField.of("allowed"))

                @JvmField val BLOCKED = DebitStatus(JsonField.of("blocked"))

                @JvmStatic fun of(value: String) = DebitStatus(JsonField.of(value))
            }

            enum class Known {
                ALLOWED,
                BLOCKED,
            }

            enum class Value {
                ALLOWED,
                BLOCKED,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    ALLOWED -> Value.ALLOWED
                    BLOCKED -> Value.BLOCKED
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    ALLOWED -> Known.ALLOWED
                    BLOCKED -> Known.BLOCKED
                    else -> throw IncreaseInvalidDataException("Unknown DebitStatus: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Status && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val ACTIVE = Status(JsonField.of("active"))

            @JvmField val DISABLED = Status(JsonField.of("disabled"))

            @JvmField val CANCELED = Status(JsonField.of("canceled"))

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            ACTIVE,
            DISABLED,
            CANCELED,
        }

        enum class Value {
            ACTIVE,
            DISABLED,
            CANCELED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ACTIVE -> Value.ACTIVE
                DISABLED -> Value.DISABLED
                CANCELED -> Value.CANCELED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ACTIVE -> Known.ACTIVE
                DISABLED -> Known.DISABLED
                CANCELED -> Known.CANCELED
                else -> throw IncreaseInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
