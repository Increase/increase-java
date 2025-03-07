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
import com.increase.api.core.immutableEmptyMap
import com.increase.api.core.toImmutable
import com.increase.api.errors.IncreaseInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Accounts are T-accounts. They can store accounting entries. Your compliance setup might require
 * annotating money movements using this API. Learn more in our
 * [guide to Bookkeeping](https://increase.com/documentation/bookkeeping#bookkeeping).
 */
@NoAutoDetect
class BookkeepingAccount
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("account_id")
    @ExcludeMissing
    private val accountId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("compliance_category")
    @ExcludeMissing
    private val complianceCategory: JsonField<ComplianceCategory> = JsonMissing.of(),
    @JsonProperty("entity_id")
    @ExcludeMissing
    private val entityId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("idempotency_key")
    @ExcludeMissing
    private val idempotencyKey: JsonField<String> = JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The account identifier. */
    fun id(): String = id.getRequired("id")

    /** The API Account associated with this bookkeeping account. */
    fun accountId(): Optional<String> = Optional.ofNullable(accountId.getNullable("account_id"))

    /** The compliance category of the account. */
    fun complianceCategory(): Optional<ComplianceCategory> =
        Optional.ofNullable(complianceCategory.getNullable("compliance_category"))

    /** The Entity associated with this bookkeeping account. */
    fun entityId(): Optional<String> = Optional.ofNullable(entityId.getNullable("entity_id"))

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

    /** The account identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /** The API Account associated with this bookkeeping account. */
    @JsonProperty("account_id") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

    /** The compliance category of the account. */
    @JsonProperty("compliance_category")
    @ExcludeMissing
    fun _complianceCategory(): JsonField<ComplianceCategory> = complianceCategory

    /** The Entity associated with this bookkeeping account. */
    @JsonProperty("entity_id") @ExcludeMissing fun _entityId(): JsonField<String> = entityId

    /**
     * The idempotency key you chose for this object. This value is unique across Increase and is
     * used to ensure that a request is only processed once. Learn more about
     * [idempotency](https://increase.com/documentation/idempotency-keys).
     */
    @JsonProperty("idempotency_key")
    @ExcludeMissing
    fun _idempotencyKey(): JsonField<String> = idempotencyKey

    /** The name you choose for the account. */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * A constant representing the object's type. For this resource it will always be
     * `bookkeeping_account`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): BookkeepingAccount = apply {
        if (validated) {
            return@apply
        }

        id()
        accountId()
        complianceCategory()
        entityId()
        idempotencyKey()
        name()
        type()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BookkeepingAccount]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var accountId: JsonField<String>? = null
        private var complianceCategory: JsonField<ComplianceCategory>? = null
        private var entityId: JsonField<String>? = null
        private var idempotencyKey: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var type: JsonField<Type>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(bookkeepingAccount: BookkeepingAccount) = apply {
            id = bookkeepingAccount.id
            accountId = bookkeepingAccount.accountId
            complianceCategory = bookkeepingAccount.complianceCategory
            entityId = bookkeepingAccount.entityId
            idempotencyKey = bookkeepingAccount.idempotencyKey
            name = bookkeepingAccount.name
            type = bookkeepingAccount.type
            additionalProperties = bookkeepingAccount.additionalProperties.toMutableMap()
        }

        /** The account identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The account identifier. */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The API Account associated with this bookkeeping account. */
        fun accountId(accountId: String?) = accountId(JsonField.ofNullable(accountId))

        /** The API Account associated with this bookkeeping account. */
        fun accountId(accountId: Optional<String>) = accountId(accountId.getOrNull())

        /** The API Account associated with this bookkeeping account. */
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        /** The compliance category of the account. */
        fun complianceCategory(complianceCategory: ComplianceCategory?) =
            complianceCategory(JsonField.ofNullable(complianceCategory))

        /** The compliance category of the account. */
        fun complianceCategory(complianceCategory: Optional<ComplianceCategory>) =
            complianceCategory(complianceCategory.getOrNull())

        /** The compliance category of the account. */
        fun complianceCategory(complianceCategory: JsonField<ComplianceCategory>) = apply {
            this.complianceCategory = complianceCategory
        }

        /** The Entity associated with this bookkeeping account. */
        fun entityId(entityId: String?) = entityId(JsonField.ofNullable(entityId))

        /** The Entity associated with this bookkeeping account. */
        fun entityId(entityId: Optional<String>) = entityId(entityId.getOrNull())

        /** The Entity associated with this bookkeeping account. */
        fun entityId(entityId: JsonField<String>) = apply { this.entityId = entityId }

        /**
         * The idempotency key you chose for this object. This value is unique across Increase and
         * is used to ensure that a request is only processed once. Learn more about
         * [idempotency](https://increase.com/documentation/idempotency-keys).
         */
        fun idempotencyKey(idempotencyKey: String?) =
            idempotencyKey(JsonField.ofNullable(idempotencyKey))

        /**
         * The idempotency key you chose for this object. This value is unique across Increase and
         * is used to ensure that a request is only processed once. Learn more about
         * [idempotency](https://increase.com/documentation/idempotency-keys).
         */
        fun idempotencyKey(idempotencyKey: Optional<String>) =
            idempotencyKey(idempotencyKey.getOrNull())

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
                checkRequired("id", id),
                checkRequired("accountId", accountId),
                checkRequired("complianceCategory", complianceCategory),
                checkRequired("entityId", entityId),
                checkRequired("idempotencyKey", idempotencyKey),
                checkRequired("name", name),
                checkRequired("type", type),
                additionalProperties.toImmutable(),
            )
    }

    /** The compliance category of the account. */
    class ComplianceCategory
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            /** A cash in an commingled Increase Account. */
            @JvmField val COMMINGLED_CASH = of("commingled_cash")

            /** A customer balance. */
            @JvmField val CUSTOMER_BALANCE = of("customer_balance")

            @JvmStatic fun of(value: String) = ComplianceCategory(JsonField.of(value))
        }

        /** An enum containing [ComplianceCategory]'s known values. */
        enum class Known {
            /** A cash in an commingled Increase Account. */
            COMMINGLED_CASH,
            /** A customer balance. */
            CUSTOMER_BALANCE,
        }

        /**
         * An enum containing [ComplianceCategory]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ComplianceCategory] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            /** A cash in an commingled Increase Account. */
            COMMINGLED_CASH,
            /** A customer balance. */
            CUSTOMER_BALANCE,
            /**
             * An enum member indicating that [ComplianceCategory] was instantiated with an unknown
             * value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                COMMINGLED_CASH -> Value.COMMINGLED_CASH
                CUSTOMER_BALANCE -> Value.CUSTOMER_BALANCE
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws IncreaseInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                COMMINGLED_CASH -> Known.COMMINGLED_CASH
                CUSTOMER_BALANCE -> Known.CUSTOMER_BALANCE
                else -> throw IncreaseInvalidDataException("Unknown ComplianceCategory: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws IncreaseInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                IncreaseInvalidDataException("Value is not a String")
            }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ComplianceCategory && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * A constant representing the object's type. For this resource it will always be
     * `bookkeeping_account`.
     */
    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val BOOKKEEPING_ACCOUNT = of("bookkeeping_account")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            BOOKKEEPING_ACCOUNT
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            BOOKKEEPING_ACCOUNT,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                BOOKKEEPING_ACCOUNT -> Value.BOOKKEEPING_ACCOUNT
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws IncreaseInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                BOOKKEEPING_ACCOUNT -> Known.BOOKKEEPING_ACCOUNT
                else -> throw IncreaseInvalidDataException("Unknown Type: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws IncreaseInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                IncreaseInvalidDataException("Value is not a String")
            }

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

        return /* spotless:off */ other is BookkeepingAccount && id == other.id && accountId == other.accountId && complianceCategory == other.complianceCategory && entityId == other.entityId && idempotencyKey == other.idempotencyKey && name == other.name && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, accountId, complianceCategory, entityId, idempotencyKey, name, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BookkeepingAccount{id=$id, accountId=$accountId, complianceCategory=$complianceCategory, entityId=$entityId, idempotencyKey=$idempotencyKey, name=$name, type=$type, additionalProperties=$additionalProperties}"
}
