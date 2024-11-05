// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import com.increase.api.core.Enum
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.toImmutable
import com.increase.api.errors.IncreaseInvalidDataException
import com.increase.api.models.*
import java.util.Objects
import java.util.Optional

class AccountNumberCreateParams
constructor(
    private val accountId: String,
    private val name: String,
    private val inboundAch: InboundAch?,
    private val inboundChecks: InboundChecks?,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun accountId(): String = accountId

    fun name(): String = name

    fun inboundAch(): Optional<InboundAch> = Optional.ofNullable(inboundAch)

    fun inboundChecks(): Optional<InboundChecks> = Optional.ofNullable(inboundChecks)

    @JvmSynthetic
    internal fun getBody(): AccountNumberCreateBody {
        return AccountNumberCreateBody(
            accountId,
            name,
            inboundAch,
            inboundChecks,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JsonDeserialize(builder = AccountNumberCreateBody.Builder::class)
    @NoAutoDetect
    class AccountNumberCreateBody
    internal constructor(
        private val accountId: String?,
        private val name: String?,
        private val inboundAch: InboundAch?,
        private val inboundChecks: InboundChecks?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The Account the Account Number should belong to. */
        @JsonProperty("account_id") fun accountId(): String? = accountId

        /** The name you choose for the Account Number. */
        @JsonProperty("name") fun name(): String? = name

        /** Options related to how this Account Number should handle inbound ACH transfers. */
        @JsonProperty("inbound_ach") fun inboundAch(): InboundAch? = inboundAch

        /** Options related to how this Account Number should handle inbound check withdrawals. */
        @JsonProperty("inbound_checks") fun inboundChecks(): InboundChecks? = inboundChecks

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var accountId: String? = null
            private var name: String? = null
            private var inboundAch: InboundAch? = null
            private var inboundChecks: InboundChecks? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(accountNumberCreateBody: AccountNumberCreateBody) = apply {
                this.accountId = accountNumberCreateBody.accountId
                this.name = accountNumberCreateBody.name
                this.inboundAch = accountNumberCreateBody.inboundAch
                this.inboundChecks = accountNumberCreateBody.inboundChecks
                additionalProperties(accountNumberCreateBody.additionalProperties)
            }

            /** The Account the Account Number should belong to. */
            @JsonProperty("account_id")
            fun accountId(accountId: String) = apply { this.accountId = accountId }

            /** The name you choose for the Account Number. */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            /** Options related to how this Account Number should handle inbound ACH transfers. */
            @JsonProperty("inbound_ach")
            fun inboundAch(inboundAch: InboundAch) = apply { this.inboundAch = inboundAch }

            /**
             * Options related to how this Account Number should handle inbound check withdrawals.
             */
            @JsonProperty("inbound_checks")
            fun inboundChecks(inboundChecks: InboundChecks) = apply {
                this.inboundChecks = inboundChecks
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

            fun build(): AccountNumberCreateBody =
                AccountNumberCreateBody(
                    checkNotNull(accountId) { "`accountId` is required but was not set" },
                    checkNotNull(name) { "`name` is required but was not set" },
                    inboundAch,
                    inboundChecks,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AccountNumberCreateBody && this.accountId == other.accountId && this.name == other.name && this.inboundAch == other.inboundAch && this.inboundChecks == other.inboundChecks && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(accountId, name, inboundAch, inboundChecks, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "AccountNumberCreateBody{accountId=$accountId, name=$name, inboundAch=$inboundAch, inboundChecks=$inboundChecks, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AccountNumberCreateParams && this.accountId == other.accountId && this.name == other.name && this.inboundAch == other.inboundAch && this.inboundChecks == other.inboundChecks && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(accountId, name, inboundAch, inboundChecks, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "AccountNumberCreateParams{accountId=$accountId, name=$name, inboundAch=$inboundAch, inboundChecks=$inboundChecks, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var accountId: String? = null
        private var name: String? = null
        private var inboundAch: InboundAch? = null
        private var inboundChecks: InboundChecks? = null
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(accountNumberCreateParams: AccountNumberCreateParams) = apply {
            this.accountId = accountNumberCreateParams.accountId
            this.name = accountNumberCreateParams.name
            this.inboundAch = accountNumberCreateParams.inboundAch
            this.inboundChecks = accountNumberCreateParams.inboundChecks
            additionalHeaders(accountNumberCreateParams.additionalHeaders)
            additionalQueryParams(accountNumberCreateParams.additionalQueryParams)
            additionalBodyProperties(accountNumberCreateParams.additionalBodyProperties)
        }

        /** The Account the Account Number should belong to. */
        fun accountId(accountId: String) = apply { this.accountId = accountId }

        /** The name you choose for the Account Number. */
        fun name(name: String) = apply { this.name = name }

        /** Options related to how this Account Number should handle inbound ACH transfers. */
        fun inboundAch(inboundAch: InboundAch) = apply { this.inboundAch = inboundAch }

        /** Options related to how this Account Number should handle inbound check withdrawals. */
        fun inboundChecks(inboundChecks: InboundChecks) = apply {
            this.inboundChecks = inboundChecks
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

        fun build(): AccountNumberCreateParams =
            AccountNumberCreateParams(
                checkNotNull(accountId) { "`accountId` is required but was not set" },
                checkNotNull(name) { "`name` is required but was not set" },
                inboundAch,
                inboundChecks,
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

    /** Options related to how this Account Number should handle inbound ACH transfers. */
    @JsonDeserialize(builder = InboundAch.Builder::class)
    @NoAutoDetect
    class InboundAch
    private constructor(
        private val debitStatus: DebitStatus?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /**
         * Whether ACH debits are allowed against this Account Number. Note that ACH debits will be
         * declined if this is `allowed` but the Account Number is not active. If you do not specify
         * this field, the default is `allowed`.
         */
        @JsonProperty("debit_status") fun debitStatus(): DebitStatus? = debitStatus

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

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
             * be declined if this is `allowed` but the Account Number is not active. If you do not
             * specify this field, the default is `allowed`.
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

            fun build(): InboundAch =
                InboundAch(
                    checkNotNull(debitStatus) { "`debitStatus` is required but was not set" },
                    additionalProperties.toImmutable()
                )
        }

        class DebitStatus
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is DebitStatus && this.value == other.value /* spotless:on */
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is InboundAch && this.debitStatus == other.debitStatus && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(debitStatus, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "InboundAch{debitStatus=$debitStatus, additionalProperties=$additionalProperties}"
    }

    /** Options related to how this Account Number should handle inbound check withdrawals. */
    @JsonDeserialize(builder = InboundChecks.Builder::class)
    @NoAutoDetect
    class InboundChecks
    private constructor(
        private val status: Status?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /**
         * How Increase should process checks with this account number printed on them. If you do
         * not specify this field, the default is `check_transfers_only`.
         */
        @JsonProperty("status") fun status(): Status? = status

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var status: Status? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(inboundChecks: InboundChecks) = apply {
                this.status = inboundChecks.status
                additionalProperties(inboundChecks.additionalProperties)
            }

            /**
             * How Increase should process checks with this account number printed on them. If you
             * do not specify this field, the default is `check_transfers_only`.
             */
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

            fun build(): InboundChecks =
                InboundChecks(
                    checkNotNull(status) { "`status` is required but was not set" },
                    additionalProperties.toImmutable()
                )
        }

        class Status
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Status && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val ALLOWED = Status(JsonField.of("allowed"))

                @JvmField val CHECK_TRANSFERS_ONLY = Status(JsonField.of("check_transfers_only"))

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            enum class Known {
                ALLOWED,
                CHECK_TRANSFERS_ONLY,
            }

            enum class Value {
                ALLOWED,
                CHECK_TRANSFERS_ONLY,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    ALLOWED -> Value.ALLOWED
                    CHECK_TRANSFERS_ONLY -> Value.CHECK_TRANSFERS_ONLY
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    ALLOWED -> Known.ALLOWED
                    CHECK_TRANSFERS_ONLY -> Known.CHECK_TRANSFERS_ONLY
                    else -> throw IncreaseInvalidDataException("Unknown Status: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is InboundChecks && this.status == other.status && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(status, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "InboundChecks{status=$status, additionalProperties=$additionalProperties}"
    }
}
