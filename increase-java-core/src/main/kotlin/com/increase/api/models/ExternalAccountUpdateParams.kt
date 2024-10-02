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

class ExternalAccountUpdateParams
constructor(
    private val externalAccountId: String,
    private val accountHolder: AccountHolder?,
    private val description: String?,
    private val funding: Funding?,
    private val status: Status?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun externalAccountId(): String = externalAccountId

    fun accountHolder(): Optional<AccountHolder> = Optional.ofNullable(accountHolder)

    fun description(): Optional<String> = Optional.ofNullable(description)

    fun funding(): Optional<Funding> = Optional.ofNullable(funding)

    fun status(): Optional<Status> = Optional.ofNullable(status)

    @JvmSynthetic
    internal fun getBody(): ExternalAccountUpdateBody {
        return ExternalAccountUpdateBody(
            accountHolder,
            description,
            funding,
            status,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> externalAccountId
            else -> ""
        }
    }

    @JsonDeserialize(builder = ExternalAccountUpdateBody.Builder::class)
    @NoAutoDetect
    class ExternalAccountUpdateBody
    internal constructor(
        private val accountHolder: AccountHolder?,
        private val description: String?,
        private val funding: Funding?,
        private val status: Status?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The type of entity that owns the External Account. */
        @JsonProperty("account_holder") fun accountHolder(): AccountHolder? = accountHolder

        /** The description you choose to give the external account. */
        @JsonProperty("description") fun description(): String? = description

        /** The funding type of the External Account. */
        @JsonProperty("funding") fun funding(): Funding? = funding

        /** The status of the External Account. */
        @JsonProperty("status") fun status(): Status? = status

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var accountHolder: AccountHolder? = null
            private var description: String? = null
            private var funding: Funding? = null
            private var status: Status? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(externalAccountUpdateBody: ExternalAccountUpdateBody) = apply {
                this.accountHolder = externalAccountUpdateBody.accountHolder
                this.description = externalAccountUpdateBody.description
                this.funding = externalAccountUpdateBody.funding
                this.status = externalAccountUpdateBody.status
                additionalProperties(externalAccountUpdateBody.additionalProperties)
            }

            /** The type of entity that owns the External Account. */
            @JsonProperty("account_holder")
            fun accountHolder(accountHolder: AccountHolder) = apply {
                this.accountHolder = accountHolder
            }

            /** The description you choose to give the external account. */
            @JsonProperty("description")
            fun description(description: String) = apply { this.description = description }

            /** The funding type of the External Account. */
            @JsonProperty("funding")
            fun funding(funding: Funding) = apply { this.funding = funding }

            /** The status of the External Account. */
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

            fun build(): ExternalAccountUpdateBody =
                ExternalAccountUpdateBody(
                    accountHolder,
                    description,
                    funding,
                    status,
                    additionalProperties.toUnmodifiable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ExternalAccountUpdateBody &&
                this.accountHolder == other.accountHolder &&
                this.description == other.description &&
                this.funding == other.funding &&
                this.status == other.status &&
                this.additionalProperties == other.additionalProperties
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        accountHolder,
                        description,
                        funding,
                        status,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "ExternalAccountUpdateBody{accountHolder=$accountHolder, description=$description, funding=$funding, status=$status, additionalProperties=$additionalProperties}"
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExternalAccountUpdateParams &&
            this.externalAccountId == other.externalAccountId &&
            this.accountHolder == other.accountHolder &&
            this.description == other.description &&
            this.funding == other.funding &&
            this.status == other.status &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            externalAccountId,
            accountHolder,
            description,
            funding,
            status,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "ExternalAccountUpdateParams{externalAccountId=$externalAccountId, accountHolder=$accountHolder, description=$description, funding=$funding, status=$status, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var externalAccountId: String? = null
        private var accountHolder: AccountHolder? = null
        private var description: String? = null
        private var funding: Funding? = null
        private var status: Status? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(externalAccountUpdateParams: ExternalAccountUpdateParams) = apply {
            this.externalAccountId = externalAccountUpdateParams.externalAccountId
            this.accountHolder = externalAccountUpdateParams.accountHolder
            this.description = externalAccountUpdateParams.description
            this.funding = externalAccountUpdateParams.funding
            this.status = externalAccountUpdateParams.status
            additionalQueryParams(externalAccountUpdateParams.additionalQueryParams)
            additionalHeaders(externalAccountUpdateParams.additionalHeaders)
            additionalBodyProperties(externalAccountUpdateParams.additionalBodyProperties)
        }

        /** The external account identifier. */
        fun externalAccountId(externalAccountId: String) = apply {
            this.externalAccountId = externalAccountId
        }

        /** The type of entity that owns the External Account. */
        fun accountHolder(accountHolder: AccountHolder) = apply {
            this.accountHolder = accountHolder
        }

        /** The description you choose to give the external account. */
        fun description(description: String) = apply { this.description = description }

        /** The funding type of the External Account. */
        fun funding(funding: Funding) = apply { this.funding = funding }

        /** The status of the External Account. */
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

        fun build(): ExternalAccountUpdateParams =
            ExternalAccountUpdateParams(
                checkNotNull(externalAccountId) {
                    "`externalAccountId` is required but was not set"
                },
                accountHolder,
                description,
                funding,
                status,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    class AccountHolder
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AccountHolder && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val BUSINESS = AccountHolder(JsonField.of("business"))

            @JvmField val INDIVIDUAL = AccountHolder(JsonField.of("individual"))

            @JvmStatic fun of(value: String) = AccountHolder(JsonField.of(value))
        }

        enum class Known {
            BUSINESS,
            INDIVIDUAL,
        }

        enum class Value {
            BUSINESS,
            INDIVIDUAL,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                BUSINESS -> Value.BUSINESS
                INDIVIDUAL -> Value.INDIVIDUAL
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                BUSINESS -> Known.BUSINESS
                INDIVIDUAL -> Known.INDIVIDUAL
                else -> throw IncreaseInvalidDataException("Unknown AccountHolder: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    class Funding
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Funding && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val CHECKING = Funding(JsonField.of("checking"))

            @JvmField val SAVINGS = Funding(JsonField.of("savings"))

            @JvmField val OTHER = Funding(JsonField.of("other"))

            @JvmStatic fun of(value: String) = Funding(JsonField.of(value))
        }

        enum class Known {
            CHECKING,
            SAVINGS,
            OTHER,
        }

        enum class Value {
            CHECKING,
            SAVINGS,
            OTHER,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                CHECKING -> Value.CHECKING
                SAVINGS -> Value.SAVINGS
                OTHER -> Value.OTHER
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                CHECKING -> Known.CHECKING
                SAVINGS -> Known.SAVINGS
                OTHER -> Known.OTHER
                else -> throw IncreaseInvalidDataException("Unknown Funding: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
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

            return other is Status && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val ACTIVE = Status(JsonField.of("active"))

            @JvmField val ARCHIVED = Status(JsonField.of("archived"))

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            ACTIVE,
            ARCHIVED,
        }

        enum class Value {
            ACTIVE,
            ARCHIVED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ACTIVE -> Value.ACTIVE
                ARCHIVED -> Value.ARCHIVED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ACTIVE -> Known.ACTIVE
                ARCHIVED -> Known.ARCHIVED
                else -> throw IncreaseInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
