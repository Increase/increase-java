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

/** Update an Account Number */
class AccountNumberUpdateParams
constructor(
    private val accountNumberId: String,
    private val body: AccountNumberUpdateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    /** The identifier of the Account Number. */
    fun accountNumberId(): String = accountNumberId

    /** Options related to how this Account Number handles inbound ACH transfers. */
    fun inboundAch(): Optional<InboundAch> = body.inboundAch()

    /** Options related to how this Account Number should handle inbound check withdrawals. */
    fun inboundChecks(): Optional<InboundChecks> = body.inboundChecks()

    /** The name you choose for the Account Number. */
    fun name(): Optional<String> = body.name()

    /** This indicates if transfers can be made to the Account Number. */
    fun status(): Optional<Status> = body.status()

    /** Options related to how this Account Number handles inbound ACH transfers. */
    fun _inboundAch(): JsonField<InboundAch> = body._inboundAch()

    /** Options related to how this Account Number should handle inbound check withdrawals. */
    fun _inboundChecks(): JsonField<InboundChecks> = body._inboundChecks()

    /** The name you choose for the Account Number. */
    fun _name(): JsonField<String> = body._name()

    /** This indicates if transfers can be made to the Account Number. */
    fun _status(): JsonField<Status> = body._status()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun getBody(): AccountNumberUpdateBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> accountNumberId
            else -> ""
        }
    }

    @NoAutoDetect
    class AccountNumberUpdateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("inbound_ach")
        @ExcludeMissing
        private val inboundAch: JsonField<InboundAch> = JsonMissing.of(),
        @JsonProperty("inbound_checks")
        @ExcludeMissing
        private val inboundChecks: JsonField<InboundChecks> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status")
        @ExcludeMissing
        private val status: JsonField<Status> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Options related to how this Account Number handles inbound ACH transfers. */
        fun inboundAch(): Optional<InboundAch> =
            Optional.ofNullable(inboundAch.getNullable("inbound_ach"))

        /** Options related to how this Account Number should handle inbound check withdrawals. */
        fun inboundChecks(): Optional<InboundChecks> =
            Optional.ofNullable(inboundChecks.getNullable("inbound_checks"))

        /** The name you choose for the Account Number. */
        fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

        /** This indicates if transfers can be made to the Account Number. */
        fun status(): Optional<Status> = Optional.ofNullable(status.getNullable("status"))

        /** Options related to how this Account Number handles inbound ACH transfers. */
        @JsonProperty("inbound_ach")
        @ExcludeMissing
        fun _inboundAch(): JsonField<InboundAch> = inboundAch

        /** Options related to how this Account Number should handle inbound check withdrawals. */
        @JsonProperty("inbound_checks")
        @ExcludeMissing
        fun _inboundChecks(): JsonField<InboundChecks> = inboundChecks

        /** The name you choose for the Account Number. */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /** This indicates if transfers can be made to the Account Number. */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): AccountNumberUpdateBody = apply {
            if (!validated) {
                inboundAch().map { it.validate() }
                inboundChecks().map { it.validate() }
                name()
                status()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var inboundAch: JsonField<InboundAch> = JsonMissing.of()
            private var inboundChecks: JsonField<InboundChecks> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var status: JsonField<Status> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(accountNumberUpdateBody: AccountNumberUpdateBody) = apply {
                inboundAch = accountNumberUpdateBody.inboundAch
                inboundChecks = accountNumberUpdateBody.inboundChecks
                name = accountNumberUpdateBody.name
                status = accountNumberUpdateBody.status
                additionalProperties = accountNumberUpdateBody.additionalProperties.toMutableMap()
            }

            /** Options related to how this Account Number handles inbound ACH transfers. */
            fun inboundAch(inboundAch: InboundAch) = inboundAch(JsonField.of(inboundAch))

            /** Options related to how this Account Number handles inbound ACH transfers. */
            fun inboundAch(inboundAch: JsonField<InboundAch>) = apply {
                this.inboundAch = inboundAch
            }

            /**
             * Options related to how this Account Number should handle inbound check withdrawals.
             */
            fun inboundChecks(inboundChecks: InboundChecks) =
                inboundChecks(JsonField.of(inboundChecks))

            /**
             * Options related to how this Account Number should handle inbound check withdrawals.
             */
            fun inboundChecks(inboundChecks: JsonField<InboundChecks>) = apply {
                this.inboundChecks = inboundChecks
            }

            /** The name you choose for the Account Number. */
            fun name(name: String) = name(JsonField.of(name))

            /** The name you choose for the Account Number. */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** This indicates if transfers can be made to the Account Number. */
            fun status(status: Status) = status(JsonField.of(status))

            /** This indicates if transfers can be made to the Account Number. */
            fun status(status: JsonField<Status>) = apply { this.status = status }

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

            fun build(): AccountNumberUpdateBody =
                AccountNumberUpdateBody(
                    inboundAch,
                    inboundChecks,
                    name,
                    status,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AccountNumberUpdateBody && inboundAch == other.inboundAch && inboundChecks == other.inboundChecks && name == other.name && status == other.status && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(inboundAch, inboundChecks, name, status, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AccountNumberUpdateBody{inboundAch=$inboundAch, inboundChecks=$inboundChecks, name=$name, status=$status, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var accountNumberId: String? = null
        private var body: AccountNumberUpdateBody.Builder = AccountNumberUpdateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(accountNumberUpdateParams: AccountNumberUpdateParams) = apply {
            accountNumberId = accountNumberUpdateParams.accountNumberId
            body = accountNumberUpdateParams.body.toBuilder()
            additionalHeaders = accountNumberUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = accountNumberUpdateParams.additionalQueryParams.toBuilder()
        }

        /** The identifier of the Account Number. */
        fun accountNumberId(accountNumberId: String) = apply {
            this.accountNumberId = accountNumberId
        }

        /** Options related to how this Account Number handles inbound ACH transfers. */
        fun inboundAch(inboundAch: InboundAch) = apply { body.inboundAch(inboundAch) }

        /** Options related to how this Account Number handles inbound ACH transfers. */
        fun inboundAch(inboundAch: JsonField<InboundAch>) = apply { body.inboundAch(inboundAch) }

        /** Options related to how this Account Number should handle inbound check withdrawals. */
        fun inboundChecks(inboundChecks: InboundChecks) = apply {
            body.inboundChecks(inboundChecks)
        }

        /** Options related to how this Account Number should handle inbound check withdrawals. */
        fun inboundChecks(inboundChecks: JsonField<InboundChecks>) = apply {
            body.inboundChecks(inboundChecks)
        }

        /** The name you choose for the Account Number. */
        fun name(name: String) = apply { body.name(name) }

        /** The name you choose for the Account Number. */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /** This indicates if transfers can be made to the Account Number. */
        fun status(status: Status) = apply { body.status(status) }

        /** This indicates if transfers can be made to the Account Number. */
        fun status(status: JsonField<Status>) = apply { body.status(status) }

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

        fun build(): AccountNumberUpdateParams =
            AccountNumberUpdateParams(
                checkNotNull(accountNumberId) { "`accountNumberId` is required but was not set" },
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    /** Options related to how this Account Number handles inbound ACH transfers. */
    @NoAutoDetect
    class InboundAch
    @JsonCreator
    private constructor(
        @JsonProperty("debit_status")
        @ExcludeMissing
        private val debitStatus: JsonField<DebitStatus> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * Whether ACH debits are allowed against this Account Number. Note that ACH debits will be
         * declined if this is `allowed` but the Account Number is not active.
         */
        fun debitStatus(): Optional<DebitStatus> =
            Optional.ofNullable(debitStatus.getNullable("debit_status"))

        /**
         * Whether ACH debits are allowed against this Account Number. Note that ACH debits will be
         * declined if this is `allowed` but the Account Number is not active.
         */
        @JsonProperty("debit_status")
        @ExcludeMissing
        fun _debitStatus(): JsonField<DebitStatus> = debitStatus

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): InboundAch = apply {
            if (!validated) {
                debitStatus()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var debitStatus: JsonField<DebitStatus> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(inboundAch: InboundAch) = apply {
                debitStatus = inboundAch.debitStatus
                additionalProperties = inboundAch.additionalProperties.toMutableMap()
            }

            /**
             * Whether ACH debits are allowed against this Account Number. Note that ACH debits will
             * be declined if this is `allowed` but the Account Number is not active.
             */
            fun debitStatus(debitStatus: DebitStatus) = debitStatus(JsonField.of(debitStatus))

            /**
             * Whether ACH debits are allowed against this Account Number. Note that ACH debits will
             * be declined if this is `allowed` but the Account Number is not active.
             */
            fun debitStatus(debitStatus: JsonField<DebitStatus>) = apply {
                this.debitStatus = debitStatus
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

            fun build(): InboundAch = InboundAch(debitStatus, additionalProperties.toImmutable())
        }

        class DebitStatus
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val ALLOWED = of("allowed")

                @JvmField val BLOCKED = of("blocked")

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is DebitStatus && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is InboundAch && debitStatus == other.debitStatus && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(debitStatus, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "InboundAch{debitStatus=$debitStatus, additionalProperties=$additionalProperties}"
    }

    /** Options related to how this Account Number should handle inbound check withdrawals. */
    @NoAutoDetect
    class InboundChecks
    @JsonCreator
    private constructor(
        @JsonProperty("status")
        @ExcludeMissing
        private val status: JsonField<Status> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** How Increase should process checks with this account number printed on them. */
        fun status(): Status = status.getRequired("status")

        /** How Increase should process checks with this account number printed on them. */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): InboundChecks = apply {
            if (!validated) {
                status()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var status: JsonField<Status>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(inboundChecks: InboundChecks) = apply {
                status = inboundChecks.status
                additionalProperties = inboundChecks.additionalProperties.toMutableMap()
            }

            /** How Increase should process checks with this account number printed on them. */
            fun status(status: Status) = status(JsonField.of(status))

            /** How Increase should process checks with this account number printed on them. */
            fun status(status: JsonField<Status>) = apply { this.status = status }

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

            companion object {

                @JvmField val ALLOWED = of("allowed")

                @JvmField val CHECK_TRANSFERS_ONLY = of("check_transfers_only")

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Status && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is InboundChecks && status == other.status && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(status, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "InboundChecks{status=$status, additionalProperties=$additionalProperties}"
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val ACTIVE = of("active")

            @JvmField val DISABLED = of("disabled")

            @JvmField val CANCELED = of("canceled")

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AccountNumberUpdateParams && accountNumberId == other.accountNumberId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(accountNumberId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "AccountNumberUpdateParams{accountNumberId=$accountNumberId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
