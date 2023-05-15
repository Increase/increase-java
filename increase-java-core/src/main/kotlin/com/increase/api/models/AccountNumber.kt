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
import java.time.OffsetDateTime
import java.util.Objects

/**
 * Each account can have multiple account and routing numbers. We recommend that you use a set per
 * vendor. This is similar to how you use different passwords for different websites. Account
 * numbers can also be used to seamlessly reconcile inbound payments. Generating a unique account
 * number per vendor ensures you always know the originator of an incoming payment.
 */
@JsonDeserialize(builder = AccountNumber.Builder::class)
@NoAutoDetect
class AccountNumber
private constructor(
    private val accountId: JsonField<String>,
    private val accountNumber: JsonField<String>,
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val name: JsonField<String>,
    private val routingNumber: JsonField<String>,
    private val status: JsonField<Status>,
    private val type: JsonField<Type>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** The identifier for the account this Account Number belongs to. */
    fun accountId(): String = accountId.getRequired("account_id")

    /** The account number. */
    fun accountNumber(): String = accountNumber.getRequired("account_number")

    /** The Account Number identifier. */
    fun id(): String = id.getRequired("id")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Account Number was
     * created.
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** The name you choose for the Account Number. */
    fun name(): String = name.getRequired("name")

    /** The American Bankers' Association (ABA) Routing Transit Number (RTN). */
    fun routingNumber(): String = routingNumber.getRequired("routing_number")

    /** This indicates if payments can be made to the Account Number. */
    fun status(): Status = status.getRequired("status")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `account_number`.
     */
    fun type(): Type = type.getRequired("type")

    /** The identifier for the account this Account Number belongs to. */
    @JsonProperty("account_id") @ExcludeMissing fun _accountId() = accountId

    /** The account number. */
    @JsonProperty("account_number") @ExcludeMissing fun _accountNumber() = accountNumber

    /** The Account Number identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Account Number was
     * created.
     */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    /** The name you choose for the Account Number. */
    @JsonProperty("name") @ExcludeMissing fun _name() = name

    /** The American Bankers' Association (ABA) Routing Transit Number (RTN). */
    @JsonProperty("routing_number") @ExcludeMissing fun _routingNumber() = routingNumber

    /** This indicates if payments can be made to the Account Number. */
    @JsonProperty("status") @ExcludeMissing fun _status() = status

    /**
     * A constant representing the object's type. For this resource it will always be
     * `account_number`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): AccountNumber = apply {
        if (!validated) {
            accountId()
            accountNumber()
            id()
            createdAt()
            name()
            routingNumber()
            status()
            type()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AccountNumber &&
            this.accountId == other.accountId &&
            this.accountNumber == other.accountNumber &&
            this.id == other.id &&
            this.createdAt == other.createdAt &&
            this.name == other.name &&
            this.routingNumber == other.routingNumber &&
            this.status == other.status &&
            this.type == other.type &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    accountId,
                    accountNumber,
                    id,
                    createdAt,
                    name,
                    routingNumber,
                    status,
                    type,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "AccountNumber{accountId=$accountId, accountNumber=$accountNumber, id=$id, createdAt=$createdAt, name=$name, routingNumber=$routingNumber, status=$status, type=$type, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var accountId: JsonField<String> = JsonMissing.of()
        private var accountNumber: JsonField<String> = JsonMissing.of()
        private var id: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var routingNumber: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(accountNumber: AccountNumber) = apply {
            this.accountId = accountNumber.accountId
            this.accountNumber = accountNumber.accountNumber
            this.id = accountNumber.id
            this.createdAt = accountNumber.createdAt
            this.name = accountNumber.name
            this.routingNumber = accountNumber.routingNumber
            this.status = accountNumber.status
            this.type = accountNumber.type
            additionalProperties(accountNumber.additionalProperties)
        }

        /** The identifier for the account this Account Number belongs to. */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /** The identifier for the account this Account Number belongs to. */
        @JsonProperty("account_id")
        @ExcludeMissing
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        /** The account number. */
        fun accountNumber(accountNumber: String) = accountNumber(JsonField.of(accountNumber))

        /** The account number. */
        @JsonProperty("account_number")
        @ExcludeMissing
        fun accountNumber(accountNumber: JsonField<String>) = apply {
            this.accountNumber = accountNumber
        }

        /** The Account Number identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The Account Number identifier. */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Account Number
         * was created.
         */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Account Number
         * was created.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The name you choose for the Account Number. */
        fun name(name: String) = name(JsonField.of(name))

        /** The name you choose for the Account Number. */
        @JsonProperty("name")
        @ExcludeMissing
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** The American Bankers' Association (ABA) Routing Transit Number (RTN). */
        fun routingNumber(routingNumber: String) = routingNumber(JsonField.of(routingNumber))

        /** The American Bankers' Association (ABA) Routing Transit Number (RTN). */
        @JsonProperty("routing_number")
        @ExcludeMissing
        fun routingNumber(routingNumber: JsonField<String>) = apply {
            this.routingNumber = routingNumber
        }

        /** This indicates if payments can be made to the Account Number. */
        fun status(status: Status) = status(JsonField.of(status))

        /** This indicates if payments can be made to the Account Number. */
        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `account_number`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be
         * `account_number`.
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

        fun build(): AccountNumber =
            AccountNumber(
                accountId,
                accountNumber,
                id,
                createdAt,
                name,
                routingNumber,
                status,
                type,
                additionalProperties.toUnmodifiable(),
            )
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

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

            @JvmField val DISABLED = Status(JsonField.of("disabled"))

            @JvmField val CANCELED = Status(JsonField.of("canceled"))

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

            @JvmField val ACCOUNT_NUMBER = Type(JsonField.of("account_number"))

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            ACCOUNT_NUMBER,
        }

        enum class Value {
            ACCOUNT_NUMBER,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ACCOUNT_NUMBER -> Value.ACCOUNT_NUMBER
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ACCOUNT_NUMBER -> Known.ACCOUNT_NUMBER
                else -> throw IncreaseInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
