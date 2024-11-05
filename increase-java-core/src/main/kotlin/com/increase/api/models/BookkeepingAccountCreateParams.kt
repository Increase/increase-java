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

class BookkeepingAccountCreateParams
constructor(
    private val name: String,
    private val accountId: String?,
    private val complianceCategory: ComplianceCategory?,
    private val entityId: String?,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun name(): String = name

    fun accountId(): Optional<String> = Optional.ofNullable(accountId)

    fun complianceCategory(): Optional<ComplianceCategory> = Optional.ofNullable(complianceCategory)

    fun entityId(): Optional<String> = Optional.ofNullable(entityId)

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

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JsonDeserialize(builder = BookkeepingAccountCreateBody.Builder::class)
    @NoAutoDetect
    class BookkeepingAccountCreateBody
    internal constructor(
        private val name: String?,
        private val accountId: String?,
        private val complianceCategory: ComplianceCategory?,
        private val entityId: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The name you choose for the account. */
        @JsonProperty("name") fun name(): String? = name

        /** The entity, if `compliance_category` is `commingled_cash`. */
        @JsonProperty("account_id") fun accountId(): String? = accountId

        /** The account compliance category. */
        @JsonProperty("compliance_category")
        fun complianceCategory(): ComplianceCategory? = complianceCategory

        /** The entity, if `compliance_category` is `customer_balance`. */
        @JsonProperty("entity_id") fun entityId(): String? = entityId

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
                this.name = bookkeepingAccountCreateBody.name
                this.accountId = bookkeepingAccountCreateBody.accountId
                this.complianceCategory = bookkeepingAccountCreateBody.complianceCategory
                this.entityId = bookkeepingAccountCreateBody.entityId
                additionalProperties(bookkeepingAccountCreateBody.additionalProperties)
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
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
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

            return /* spotless:off */ other is BookkeepingAccountCreateBody && this.name == other.name && this.accountId == other.accountId && this.complianceCategory == other.complianceCategory && this.entityId == other.entityId && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(name, accountId, complianceCategory, entityId, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "BookkeepingAccountCreateBody{name=$name, accountId=$accountId, complianceCategory=$complianceCategory, entityId=$entityId, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BookkeepingAccountCreateParams && this.name == other.name && this.accountId == other.accountId && this.complianceCategory == other.complianceCategory && this.entityId == other.entityId && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(name, accountId, complianceCategory, entityId, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "BookkeepingAccountCreateParams{name=$name, accountId=$accountId, complianceCategory=$complianceCategory, entityId=$entityId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

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
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(bookkeepingAccountCreateParams: BookkeepingAccountCreateParams) = apply {
            this.name = bookkeepingAccountCreateParams.name
            this.accountId = bookkeepingAccountCreateParams.accountId
            this.complianceCategory = bookkeepingAccountCreateParams.complianceCategory
            this.entityId = bookkeepingAccountCreateParams.entityId
            additionalHeaders(bookkeepingAccountCreateParams.additionalHeaders)
            additionalQueryParams(bookkeepingAccountCreateParams.additionalQueryParams)
            additionalBodyProperties(bookkeepingAccountCreateParams.additionalBodyProperties)
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

        fun build(): BookkeepingAccountCreateParams =
            BookkeepingAccountCreateParams(
                checkNotNull(name) { "`name` is required but was not set" },
                accountId,
                complianceCategory,
                entityId,
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

    class ComplianceCategory
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ComplianceCategory && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val COMMINGLED_CASH = ComplianceCategory(JsonField.of("commingled_cash"))

            @JvmField val CUSTOMER_BALANCE = ComplianceCategory(JsonField.of("customer_balance"))

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
    }
}
