package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.toUnmodifiable
import com.increase.api.errors.IncreaseInvalidDataException
import java.util.Objects
import java.util.Optional

/** Accounts are T-accounts. They can store accounting entries. */
@JsonDeserialize(builder = BookkeepingAccount.Builder::class)
@NoAutoDetect
class BookkeepingAccount
private constructor(
    private val id: JsonField<String>,
    private val complianceCategory: JsonField<ComplianceCategory>,
    private val accountId: JsonField<String>,
    private val entityId: JsonField<String>,
    private val name: JsonField<String>,
    private val type: JsonField<Type>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** The account identifier. */
    fun id(): String = id.getRequired("id")

    /** The compliance category of the account. */
    fun complianceCategory(): Optional<ComplianceCategory> =
        Optional.ofNullable(complianceCategory.getNullable("compliance_category"))

    /** The API Account associated with this bookkeeping account. */
    fun accountId(): Optional<String> = Optional.ofNullable(accountId.getNullable("account_id"))

    /** The Entity associated with this bookkeeping account. */
    fun entityId(): Optional<String> = Optional.ofNullable(entityId.getNullable("entity_id"))

    /** The name you choose for the account. */
    fun name(): String = name.getRequired("name")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `bookkeeping_account`.
     */
    fun type(): Type = type.getRequired("type")

    /** The account identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /** The compliance category of the account. */
    @JsonProperty("compliance_category")
    @ExcludeMissing
    fun _complianceCategory() = complianceCategory

    /** The API Account associated with this bookkeeping account. */
    @JsonProperty("account_id") @ExcludeMissing fun _accountId() = accountId

    /** The Entity associated with this bookkeeping account. */
    @JsonProperty("entity_id") @ExcludeMissing fun _entityId() = entityId

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

    fun validate(): BookkeepingAccount = apply {
        if (!validated) {
            id()
            complianceCategory()
            accountId()
            entityId()
            name()
            type()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BookkeepingAccount &&
            this.id == other.id &&
            this.complianceCategory == other.complianceCategory &&
            this.accountId == other.accountId &&
            this.entityId == other.entityId &&
            this.name == other.name &&
            this.type == other.type &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    id,
                    complianceCategory,
                    accountId,
                    entityId,
                    name,
                    type,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "BookkeepingAccount{id=$id, complianceCategory=$complianceCategory, accountId=$accountId, entityId=$entityId, name=$name, type=$type, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var complianceCategory: JsonField<ComplianceCategory> = JsonMissing.of()
        private var accountId: JsonField<String> = JsonMissing.of()
        private var entityId: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(bookkeepingAccount: BookkeepingAccount) = apply {
            this.id = bookkeepingAccount.id
            this.complianceCategory = bookkeepingAccount.complianceCategory
            this.accountId = bookkeepingAccount.accountId
            this.entityId = bookkeepingAccount.entityId
            this.name = bookkeepingAccount.name
            this.type = bookkeepingAccount.type
            additionalProperties(bookkeepingAccount.additionalProperties)
        }

        /** The account identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The account identifier. */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        /** The compliance category of the account. */
        fun complianceCategory(complianceCategory: ComplianceCategory) =
            complianceCategory(JsonField.of(complianceCategory))

        /** The compliance category of the account. */
        @JsonProperty("compliance_category")
        @ExcludeMissing
        fun complianceCategory(complianceCategory: JsonField<ComplianceCategory>) = apply {
            this.complianceCategory = complianceCategory
        }

        /** The API Account associated with this bookkeeping account. */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /** The API Account associated with this bookkeeping account. */
        @JsonProperty("account_id")
        @ExcludeMissing
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        /** The Entity associated with this bookkeeping account. */
        fun entityId(entityId: String) = entityId(JsonField.of(entityId))

        /** The Entity associated with this bookkeeping account. */
        @JsonProperty("entity_id")
        @ExcludeMissing
        fun entityId(entityId: JsonField<String>) = apply { this.entityId = entityId }

        /** The name you choose for the account. */
        fun name(name: String) = name(JsonField.of(name))

        /** The name you choose for the account. */
        @JsonProperty("name")
        @ExcludeMissing
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
        @JsonProperty("type")
        @ExcludeMissing
        fun type(type: JsonField<Type>) = apply { this.type = type }

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

        fun build(): BookkeepingAccount =
            BookkeepingAccount(
                id,
                complianceCategory,
                accountId,
                entityId,
                name,
                type,
                additionalProperties.toUnmodifiable(),
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

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Type && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val BOOKKEEPING_ACCOUNT = Type(JsonField.of("bookkeeping_account"))

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
    }
}
