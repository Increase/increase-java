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
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.core.toImmutable
import com.increase.api.errors.IncreaseInvalidDataException
import java.util.Objects
import java.util.Optional

class BookkeepingAccountCreateParams
constructor(
    private val name: String,
    private val accountId: String?,
    private val complianceCategory: ComplianceCategory?,
    private val entityId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun name(): String = name

    fun accountId(): Optional<String> = Optional.ofNullable(accountId)

    fun complianceCategory(): Optional<ComplianceCategory> = Optional.ofNullable(complianceCategory)

    fun entityId(): Optional<String> = Optional.ofNullable(entityId)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    @JvmSynthetic
    internal fun getBody(): BookkeepingAccountCreateBody {
        return BookkeepingAccountCreateBody(
            name,
            accountId,
            complianceCategory,
            entityId,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @JsonDeserialize(builder = BookkeepingAccountCreateBody.Builder::class)
    @NoAutoDetect
    class BookkeepingAccountCreateBody
    internal constructor(
        private val name: String,
        private val accountId: String?,
        private val complianceCategory: ComplianceCategory?,
        private val entityId: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The name you choose for the account. */
        @JsonProperty("name") fun name(): String = name

        /** The entity, if `compliance_category` is `commingled_cash`. */
        @JsonProperty("account_id")
        fun accountId(): Optional<String> = Optional.ofNullable(accountId)

        /** The account compliance category. */
        @JsonProperty("compliance_category")
        fun complianceCategory(): Optional<ComplianceCategory> =
            Optional.ofNullable(complianceCategory)

        /** The entity, if `compliance_category` is `customer_balance`. */
        @JsonProperty("entity_id") fun entityId(): Optional<String> = Optional.ofNullable(entityId)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var name: String? = null
            private var accountId: String? = null
            private var complianceCategory: ComplianceCategory? = null
            private var entityId: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(bookkeepingAccountCreateBody: BookkeepingAccountCreateBody) = apply {
                name = bookkeepingAccountCreateBody.name
                accountId = bookkeepingAccountCreateBody.accountId
                complianceCategory = bookkeepingAccountCreateBody.complianceCategory
                entityId = bookkeepingAccountCreateBody.entityId
                additionalProperties =
                    bookkeepingAccountCreateBody.additionalProperties.toMutableMap()
            }

            /** The name you choose for the account. */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            /** The entity, if `compliance_category` is `commingled_cash`. */
            @JsonProperty("account_id")
            fun accountId(accountId: String) = apply { this.accountId = accountId }

            /** The account compliance category. */
            @JsonProperty("compliance_category")
            fun complianceCategory(complianceCategory: ComplianceCategory) = apply {
                this.complianceCategory = complianceCategory
            }

            /** The entity, if `compliance_category` is `customer_balance`. */
            @JsonProperty("entity_id")
            fun entityId(entityId: String) = apply { this.entityId = entityId }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            @JsonAnySetter
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

            fun build(): BookkeepingAccountCreateBody =
                BookkeepingAccountCreateBody(
                    checkNotNull(name) { "`name` is required but was not set" },
                    accountId,
                    complianceCategory,
                    entityId,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is BookkeepingAccountCreateBody && name == other.name && accountId == other.accountId && complianceCategory == other.complianceCategory && entityId == other.entityId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(name, accountId, complianceCategory, entityId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "BookkeepingAccountCreateBody{name=$name, accountId=$accountId, complianceCategory=$complianceCategory, entityId=$entityId, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var name: String? = null
        private var accountId: String? = null
        private var complianceCategory: ComplianceCategory? = null
        private var entityId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(bookkeepingAccountCreateParams: BookkeepingAccountCreateParams) = apply {
            name = bookkeepingAccountCreateParams.name
            accountId = bookkeepingAccountCreateParams.accountId
            complianceCategory = bookkeepingAccountCreateParams.complianceCategory
            entityId = bookkeepingAccountCreateParams.entityId
            additionalHeaders = bookkeepingAccountCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = bookkeepingAccountCreateParams.additionalQueryParams.toBuilder()
            additionalBodyProperties =
                bookkeepingAccountCreateParams.additionalBodyProperties.toMutableMap()
        }

        /** The name you choose for the account. */
        fun name(name: String) = apply { this.name = name }

        /** The entity, if `compliance_category` is `commingled_cash`. */
        fun accountId(accountId: String) = apply { this.accountId = accountId }

        /** The account compliance category. */
        fun complianceCategory(complianceCategory: ComplianceCategory) = apply {
            this.complianceCategory = complianceCategory
        }

        /** The entity, if `compliance_category` is `customer_balance`. */
        fun entityId(entityId: String) = apply { this.entityId = entityId }

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
            this.additionalBodyProperties.clear()
            putAllAdditionalBodyProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            additionalBodyProperties.remove(key)
        }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalBodyProperty)
        }

        fun build(): BookkeepingAccountCreateParams =
            BookkeepingAccountCreateParams(
                checkNotNull(name) { "`name` is required but was not set" },
                accountId,
                complianceCategory,
                entityId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    class ComplianceCategory
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val COMMINGLED_CASH = of("commingled_cash")

            @JvmField val CUSTOMER_BALANCE = of("customer_balance")

            @JvmStatic fun of(value: String) = ComplianceCategory(JsonField.of(value))
        }

        enum class Known {
            COMMINGLED_CASH,
            CUSTOMER_BALANCE,
        }

        enum class Value {
            COMMINGLED_CASH,
            CUSTOMER_BALANCE,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                COMMINGLED_CASH -> Value.COMMINGLED_CASH
                CUSTOMER_BALANCE -> Value.CUSTOMER_BALANCE
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                COMMINGLED_CASH -> Known.COMMINGLED_CASH
                CUSTOMER_BALANCE -> Known.CUSTOMER_BALANCE
                else -> throw IncreaseInvalidDataException("Unknown ComplianceCategory: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ComplianceCategory && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BookkeepingAccountCreateParams && name == other.name && accountId == other.accountId && complianceCategory == other.complianceCategory && entityId == other.entityId && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(name, accountId, complianceCategory, entityId, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "BookkeepingAccountCreateParams{name=$name, accountId=$accountId, complianceCategory=$complianceCategory, entityId=$entityId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
