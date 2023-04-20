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

class BookkeepingAccountCreateParams
constructor(
    private val complianceCategory: ComplianceCategory?,
    private val entityId: String?,
    private val accountId: String?,
    private val name: String,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun complianceCategory(): Optional<ComplianceCategory> = Optional.ofNullable(complianceCategory)

    fun entityId(): Optional<String> = Optional.ofNullable(entityId)

    fun accountId(): Optional<String> = Optional.ofNullable(accountId)

    fun name(): String = name

    @JvmSynthetic
    internal fun getBody(): BookkeepingAccountCreateBody {
        return BookkeepingAccountCreateBody(
            complianceCategory,
            entityId,
            accountId,
            name,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = BookkeepingAccountCreateBody.Builder::class)
    @NoAutoDetect
    class BookkeepingAccountCreateBody
    internal constructor(
        private val complianceCategory: ComplianceCategory?,
        private val entityId: String?,
        private val accountId: String?,
        private val name: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** The account compliance category. */
        @JsonProperty("compliance_category")
        fun complianceCategory(): ComplianceCategory? = complianceCategory

        /** The entity, if `compliance_category` is `customer_balance`. */
        @JsonProperty("entity_id") fun entityId(): String? = entityId

        /** The entity, if `compliance_category` is `commingled_cash`. */
        @JsonProperty("account_id") fun accountId(): String? = accountId

        /** The name you choose for the account. */
        @JsonProperty("name") fun name(): String? = name

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is BookkeepingAccountCreateBody &&
                this.complianceCategory == other.complianceCategory &&
                this.entityId == other.entityId &&
                this.accountId == other.accountId &&
                this.name == other.name &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        complianceCategory,
                        entityId,
                        accountId,
                        name,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "BookkeepingAccountCreateBody{complianceCategory=$complianceCategory, entityId=$entityId, accountId=$accountId, name=$name, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var complianceCategory: ComplianceCategory? = null
            private var entityId: String? = null
            private var accountId: String? = null
            private var name: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(bookkeepingAccountCreateBody: BookkeepingAccountCreateBody) = apply {
                this.complianceCategory = bookkeepingAccountCreateBody.complianceCategory
                this.entityId = bookkeepingAccountCreateBody.entityId
                this.accountId = bookkeepingAccountCreateBody.accountId
                this.name = bookkeepingAccountCreateBody.name
                additionalProperties(bookkeepingAccountCreateBody.additionalProperties)
            }

            /** The account compliance category. */
            @JsonProperty("compliance_category")
            fun complianceCategory(complianceCategory: ComplianceCategory) = apply {
                this.complianceCategory = complianceCategory
            }

            /** The entity, if `compliance_category` is `customer_balance`. */
            @JsonProperty("entity_id")
            fun entityId(entityId: String) = apply { this.entityId = entityId }

            /** The entity, if `compliance_category` is `commingled_cash`. */
            @JsonProperty("account_id")
            fun accountId(accountId: String) = apply { this.accountId = accountId }

            /** The name you choose for the account. */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

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
                    complianceCategory,
                    entityId,
                    accountId,
                    checkNotNull(name) { "`name` is required but was not set" },
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

        return other is BookkeepingAccountCreateParams &&
            this.complianceCategory == other.complianceCategory &&
            this.entityId == other.entityId &&
            this.accountId == other.accountId &&
            this.name == other.name &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            complianceCategory,
            entityId,
            accountId,
            name,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "BookkeepingAccountCreateParams{complianceCategory=$complianceCategory, entityId=$entityId, accountId=$accountId, name=$name, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var complianceCategory: ComplianceCategory? = null
        private var entityId: String? = null
        private var accountId: String? = null
        private var name: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(bookkeepingAccountCreateParams: BookkeepingAccountCreateParams) = apply {
            this.complianceCategory = bookkeepingAccountCreateParams.complianceCategory
            this.entityId = bookkeepingAccountCreateParams.entityId
            this.accountId = bookkeepingAccountCreateParams.accountId
            this.name = bookkeepingAccountCreateParams.name
            additionalQueryParams(bookkeepingAccountCreateParams.additionalQueryParams)
            additionalHeaders(bookkeepingAccountCreateParams.additionalHeaders)
            additionalBodyProperties(bookkeepingAccountCreateParams.additionalBodyProperties)
        }

        /** The account compliance category. */
        fun complianceCategory(complianceCategory: ComplianceCategory) = apply {
            this.complianceCategory = complianceCategory
        }

        /** The entity, if `compliance_category` is `customer_balance`. */
        fun entityId(entityId: String) = apply { this.entityId = entityId }

        /** The entity, if `compliance_category` is `commingled_cash`. */
        fun accountId(accountId: String) = apply { this.accountId = accountId }

        /** The name you choose for the account. */
        fun name(name: String) = apply { this.name = name }

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

        fun build(): BookkeepingAccountCreateParams =
            BookkeepingAccountCreateParams(
                complianceCategory,
                entityId,
                accountId,
                checkNotNull(name) { "`name` is required but was not set" },
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    class ComplianceCategory
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ComplianceCategory && this.value == other.value
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
