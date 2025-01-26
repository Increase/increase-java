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
import com.increase.api.core.checkRequired
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.core.immutableEmptyMap
import com.increase.api.core.toImmutable
import com.increase.api.errors.IncreaseInvalidDataException
import java.util.Objects
import java.util.Optional

/** Update an External Account */
class ExternalAccountUpdateParams
private constructor(
    private val externalAccountId: String,
    private val body: ExternalAccountUpdateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    /** The external account identifier. */
    fun externalAccountId(): String = externalAccountId

    /** The type of entity that owns the External Account. */
    fun accountHolder(): Optional<AccountHolder> = body.accountHolder()

    /** The description you choose to give the external account. */
    fun description(): Optional<String> = body.description()

    /** The funding type of the External Account. */
    fun funding(): Optional<Funding> = body.funding()

    /** The status of the External Account. */
    fun status(): Optional<Status> = body.status()

    /** The type of entity that owns the External Account. */
    fun _accountHolder(): JsonField<AccountHolder> = body._accountHolder()

    /** The description you choose to give the external account. */
    fun _description(): JsonField<String> = body._description()

    /** The funding type of the External Account. */
    fun _funding(): JsonField<Funding> = body._funding()

    /** The status of the External Account. */
    fun _status(): JsonField<Status> = body._status()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun getBody(): ExternalAccountUpdateBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> externalAccountId
            else -> ""
        }
    }

    @NoAutoDetect
    class ExternalAccountUpdateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("account_holder")
        @ExcludeMissing
        private val accountHolder: JsonField<AccountHolder> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        private val description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("funding")
        @ExcludeMissing
        private val funding: JsonField<Funding> = JsonMissing.of(),
        @JsonProperty("status")
        @ExcludeMissing
        private val status: JsonField<Status> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The type of entity that owns the External Account. */
        fun accountHolder(): Optional<AccountHolder> =
            Optional.ofNullable(accountHolder.getNullable("account_holder"))

        /** The description you choose to give the external account. */
        fun description(): Optional<String> =
            Optional.ofNullable(description.getNullable("description"))

        /** The funding type of the External Account. */
        fun funding(): Optional<Funding> = Optional.ofNullable(funding.getNullable("funding"))

        /** The status of the External Account. */
        fun status(): Optional<Status> = Optional.ofNullable(status.getNullable("status"))

        /** The type of entity that owns the External Account. */
        @JsonProperty("account_holder")
        @ExcludeMissing
        fun _accountHolder(): JsonField<AccountHolder> = accountHolder

        /** The description you choose to give the external account. */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /** The funding type of the External Account. */
        @JsonProperty("funding") @ExcludeMissing fun _funding(): JsonField<Funding> = funding

        /** The status of the External Account. */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): ExternalAccountUpdateBody = apply {
            if (validated) {
                return@apply
            }

            accountHolder()
            description()
            funding()
            status()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder internal constructor() {

            private var accountHolder: JsonField<AccountHolder> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var funding: JsonField<Funding> = JsonMissing.of()
            private var status: JsonField<Status> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(externalAccountUpdateBody: ExternalAccountUpdateBody) = apply {
                accountHolder = externalAccountUpdateBody.accountHolder
                description = externalAccountUpdateBody.description
                funding = externalAccountUpdateBody.funding
                status = externalAccountUpdateBody.status
                additionalProperties = externalAccountUpdateBody.additionalProperties.toMutableMap()
            }

            /** The type of entity that owns the External Account. */
            fun accountHolder(accountHolder: AccountHolder) =
                accountHolder(JsonField.of(accountHolder))

            /** The type of entity that owns the External Account. */
            fun accountHolder(accountHolder: JsonField<AccountHolder>) = apply {
                this.accountHolder = accountHolder
            }

            /** The description you choose to give the external account. */
            fun description(description: String) = description(JsonField.of(description))

            /** The description you choose to give the external account. */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /** The funding type of the External Account. */
            fun funding(funding: Funding) = funding(JsonField.of(funding))

            /** The funding type of the External Account. */
            fun funding(funding: JsonField<Funding>) = apply { this.funding = funding }

            /** The status of the External Account. */
            fun status(status: Status) = status(JsonField.of(status))

            /** The status of the External Account. */
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

            fun build(): ExternalAccountUpdateBody =
                ExternalAccountUpdateBody(
                    accountHolder,
                    description,
                    funding,
                    status,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ExternalAccountUpdateBody && accountHolder == other.accountHolder && description == other.description && funding == other.funding && status == other.status && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(accountHolder, description, funding, status, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ExternalAccountUpdateBody{accountHolder=$accountHolder, description=$description, funding=$funding, status=$status, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder internal constructor() {

        private var externalAccountId: String? = null
        private var body: ExternalAccountUpdateBody.Builder = ExternalAccountUpdateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(externalAccountUpdateParams: ExternalAccountUpdateParams) = apply {
            externalAccountId = externalAccountUpdateParams.externalAccountId
            body = externalAccountUpdateParams.body.toBuilder()
            additionalHeaders = externalAccountUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = externalAccountUpdateParams.additionalQueryParams.toBuilder()
        }

        /** The external account identifier. */
        fun externalAccountId(externalAccountId: String) = apply {
            this.externalAccountId = externalAccountId
        }

        /** The type of entity that owns the External Account. */
        fun accountHolder(accountHolder: AccountHolder) = apply {
            body.accountHolder(accountHolder)
        }

        /** The type of entity that owns the External Account. */
        fun accountHolder(accountHolder: JsonField<AccountHolder>) = apply {
            body.accountHolder(accountHolder)
        }

        /** The description you choose to give the external account. */
        fun description(description: String) = apply { body.description(description) }

        /** The description you choose to give the external account. */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        /** The funding type of the External Account. */
        fun funding(funding: Funding) = apply { body.funding(funding) }

        /** The funding type of the External Account. */
        fun funding(funding: JsonField<Funding>) = apply { body.funding(funding) }

        /** The status of the External Account. */
        fun status(status: Status) = apply { body.status(status) }

        /** The status of the External Account. */
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

        fun build(): ExternalAccountUpdateParams =
            ExternalAccountUpdateParams(
                checkRequired("externalAccountId", externalAccountId),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    /** The type of entity that owns the External Account. */
    class AccountHolder
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            /** The External Account is owned by a business. */
            @JvmField val BUSINESS = of("business")

            /** The External Account is owned by an individual. */
            @JvmField val INDIVIDUAL = of("individual")

            @JvmStatic fun of(value: String) = AccountHolder(JsonField.of(value))
        }

        enum class Known {
            /** The External Account is owned by a business. */
            BUSINESS,
            /** The External Account is owned by an individual. */
            INDIVIDUAL,
        }

        enum class Value {
            /** The External Account is owned by a business. */
            BUSINESS,
            /** The External Account is owned by an individual. */
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AccountHolder && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The funding type of the External Account. */
    class Funding
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            /** A checking account. */
            @JvmField val CHECKING = of("checking")

            /** A savings account. */
            @JvmField val SAVINGS = of("savings")

            /** A different type of account. */
            @JvmField val OTHER = of("other")

            @JvmStatic fun of(value: String) = Funding(JsonField.of(value))
        }

        enum class Known {
            /** A checking account. */
            CHECKING,
            /** A savings account. */
            SAVINGS,
            /** A different type of account. */
            OTHER,
        }

        enum class Value {
            /** A checking account. */
            CHECKING,
            /** A savings account. */
            SAVINGS,
            /** A different type of account. */
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Funding && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The status of the External Account. */
    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            /** The External Account is active. */
            @JvmField val ACTIVE = of("active")

            /** The External Account is archived and won't appear in the dashboard. */
            @JvmField val ARCHIVED = of("archived")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            /** The External Account is active. */
            ACTIVE,
            /** The External Account is archived and won't appear in the dashboard. */
            ARCHIVED,
        }

        enum class Value {
            /** The External Account is active. */
            ACTIVE,
            /** The External Account is archived and won't appear in the dashboard. */
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

        return /* spotless:off */ other is ExternalAccountUpdateParams && externalAccountId == other.externalAccountId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(externalAccountId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ExternalAccountUpdateParams{externalAccountId=$externalAccountId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
