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
import com.increase.api.core.immutableEmptyMap
import com.increase.api.core.toImmutable
import com.increase.api.errors.IncreaseInvalidDataException
import java.util.Objects
import java.util.Optional

/**
 * Accounts are T-accounts. They can store accounting entries. Your compliance setup might require
 * annotating money movements using this API. Learn more in our
 * [guide to Bookkeeping](https://increase.com/documentation/bookkeeping#bookkeeping).
 */
@NoAutoDetect
class BookkeepingAccount
@JsonCreator
private constructor(
    @JsonProperty("account_id")
    @ExcludeMissing
    private val accountId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("compliance_category")
    @ExcludeMissing
    private val complianceCategory: JsonField<ComplianceCategory> = JsonMissing.of(),
    @JsonProperty("entity_id")
    @ExcludeMissing
    private val entityId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("idempotency_key")
    @ExcludeMissing
    private val idempotencyKey: JsonField<String> = JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The API Account associated with this bookkeeping account. */
    fun accountId(): Optional<String> = Optional.ofNullable(accountId.getNullable("account_id"))

    /** The compliance category of the account. */
    fun complianceCategory(): Optional<ComplianceCategory> =
        Optional.ofNullable(complianceCategory.getNullable("compliance_category"))

    /** The Entity associated with this bookkeeping account. */
    fun entityId(): Optional<String> = Optional.ofNullable(entityId.getNullable("entity_id"))

    /** The account identifier. */
    fun id(): String = id.getRequired("id")

    /**
     * The idempotency key you chose for this object. This value is unique across Increase and is
     * used to ensure that a request is only processed once. Learn more about
     * [idempotency](https://increase.com/documentation/idempotency-keys).
     */
    fun idempotencyKey(): Optional<String> =
        Optional.ofNullable(idempotencyKey.getNullable("idempotency_key"))

    /** The name you choose for the account. */
    fun name(): String = name.getRequired("name")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `bookkeeping_account`.
     */
    fun type(): Type = type.getRequired("type")

    /** The API Account associated with this bookkeeping account. */
    @JsonProperty("account_id") @ExcludeMissing fun _accountId() = accountId

    /** The compliance category of the account. */
    @JsonProperty("compliance_category")
    @ExcludeMissing
    fun _complianceCategory() = complianceCategory

    /** The Entity associated with this bookkeeping account. */
    @JsonProperty("entity_id") @ExcludeMissing fun _entityId() = entityId

    /** The account identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /**
     * The idempotency key you chose for this object. This value is unique across Increase and is
     * used to ensure that a request is only processed once. Learn more about
     * [idempotency](https://increase.com/documentation/idempotency-keys).
     */
    @JsonProperty("idempotency_key") @ExcludeMissing fun _idempotencyKey() = idempotencyKey

    /** The name you choose for the account. */
    @JsonProperty("name") @ExcludeMissing fun _name() = name

    /**
     * A constant representing the object's type. For this resource it will always be
     * `bookkeeping_account`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): BookkeepingAccount = apply {
        if (!validated) {
            accountId()
            complianceCategory()
            entityId()
            id()
            idempotencyKey()
            name()
            type()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var accountId: JsonField<String> = JsonMissing.of()
        private var complianceCategory: JsonField<ComplianceCategory> = JsonMissing.of()
        private var entityId: JsonField<String> = JsonMissing.of()
        private var id: JsonField<String> = JsonMissing.of()
        private var idempotencyKey: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(bookkeepingAccount: BookkeepingAccount) = apply {
            accountId = bookkeepingAccount.accountId
            complianceCategory = bookkeepingAccount.complianceCategory
            entityId = bookkeepingAccount.entityId
            id = bookkeepingAccount.id
            idempotencyKey = bookkeepingAccount.idempotencyKey
            name = bookkeepingAccount.name
            type = bookkeepingAccount.type
            additionalProperties = bookkeepingAccount.additionalProperties.toMutableMap()
        }

        /** The API Account associated with this bookkeeping account. */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /** The API Account associated with this bookkeeping account. */
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        /** The compliance category of the account. */
        fun complianceCategory(complianceCategory: ComplianceCategory) =
            complianceCategory(JsonField.of(complianceCategory))

        /** The compliance category of the account. */
        fun complianceCategory(complianceCategory: JsonField<ComplianceCategory>) = apply {
            this.complianceCategory = complianceCategory
        }

        /** The Entity associated with this bookkeeping account. */
        fun entityId(entityId: String) = entityId(JsonField.of(entityId))

        /** The Entity associated with this bookkeeping account. */
        fun entityId(entityId: JsonField<String>) = apply { this.entityId = entityId }

        /** The account identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The account identifier. */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * The idempotency key you chose for this object. This value is unique across Increase and
         * is used to ensure that a request is only processed once. Learn more about
         * [idempotency](https://increase.com/documentation/idempotency-keys).
         */
        fun idempotencyKey(idempotencyKey: String) = idempotencyKey(JsonField.of(idempotencyKey))

        /**
         * The idempotency key you chose for this object. This value is unique across Increase and
         * is used to ensure that a request is only processed once. Learn more about
         * [idempotency](https://increase.com/documentation/idempotency-keys).
         */
        fun idempotencyKey(idempotencyKey: JsonField<String>) = apply {
            this.idempotencyKey = idempotencyKey
        }

        /** The name you choose for the account. */
        fun name(name: String) = name(JsonField.of(name))

        /** The name you choose for the account. */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `bookkeeping_account`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be
         * `bookkeeping_account`.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

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

        fun build(): BookkeepingAccount =
            BookkeepingAccount(
                accountId,
                complianceCategory,
                entityId,
                id,
                idempotencyKey,
                name,
                type,
                additionalProperties.toImmutable(),
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

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val BOOKKEEPING_ACCOUNT = of("bookkeeping_account")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            BOOKKEEPING_ACCOUNT,
        }

        enum class Value {
            BOOKKEEPING_ACCOUNT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                BOOKKEEPING_ACCOUNT -> Value.BOOKKEEPING_ACCOUNT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                BOOKKEEPING_ACCOUNT -> Known.BOOKKEEPING_ACCOUNT
                else -> throw IncreaseInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Type && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BookkeepingAccount && accountId == other.accountId && complianceCategory == other.complianceCategory && entityId == other.entityId && id == other.id && idempotencyKey == other.idempotencyKey && name == other.name && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(accountId, complianceCategory, entityId, id, idempotencyKey, name, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BookkeepingAccount{accountId=$accountId, complianceCategory=$complianceCategory, entityId=$entityId, id=$id, idempotencyKey=$idempotencyKey, name=$name, type=$type, additionalProperties=$additionalProperties}"
}
