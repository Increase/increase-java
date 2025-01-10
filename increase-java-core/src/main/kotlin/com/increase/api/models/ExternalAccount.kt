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
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

/**
 * External Accounts represent accounts at financial institutions other than Increase. You can use
 * this API to store their details for reuse.
 */
@NoAutoDetect
class ExternalAccount
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("account_holder")
    @ExcludeMissing
    private val accountHolder: JsonField<AccountHolder> = JsonMissing.of(),
    @JsonProperty("account_number")
    @ExcludeMissing
    private val accountNumber: JsonField<String> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("description")
    @ExcludeMissing
    private val description: JsonField<String> = JsonMissing.of(),
    @JsonProperty("funding")
    @ExcludeMissing
    private val funding: JsonField<Funding> = JsonMissing.of(),
    @JsonProperty("idempotency_key")
    @ExcludeMissing
    private val idempotencyKey: JsonField<String> = JsonMissing.of(),
    @JsonProperty("routing_number")
    @ExcludeMissing
    private val routingNumber: JsonField<String> = JsonMissing.of(),
    @JsonProperty("status")
    @ExcludeMissing
    private val status: JsonField<Status> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonProperty("verification_status")
    @ExcludeMissing
    private val verificationStatus: JsonField<VerificationStatus> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The External Account's identifier. */
    fun id(): String = id.getRequired("id")

    /** The type of entity that owns the External Account. */
    fun accountHolder(): AccountHolder = accountHolder.getRequired("account_holder")

    /** The destination account number. */
    fun accountNumber(): String = accountNumber.getRequired("account_number")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the External
     * Account was created.
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** The External Account's description for display purposes. */
    fun description(): String = description.getRequired("description")

    /** The type of the account to which the transfer will be sent. */
    fun funding(): Funding = funding.getRequired("funding")

    /**
     * The idempotency key you chose for this object. This value is unique across Increase and is
     * used to ensure that a request is only processed once. Learn more about
     * [idempotency](https://increase.com/documentation/idempotency-keys).
     */
    fun idempotencyKey(): Optional<String> =
        Optional.ofNullable(idempotencyKey.getNullable("idempotency_key"))

    /** The American Bankers' Association (ABA) Routing Transit Number (RTN). */
    fun routingNumber(): String = routingNumber.getRequired("routing_number")

    /** The External Account's status. */
    fun status(): Status = status.getRequired("status")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `external_account`.
     */
    fun type(): Type = type.getRequired("type")

    /** If you have verified ownership of the External Account. */
    fun verificationStatus(): VerificationStatus =
        verificationStatus.getRequired("verification_status")

    /** The External Account's identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /** The type of entity that owns the External Account. */
    @JsonProperty("account_holder")
    @ExcludeMissing
    fun _accountHolder(): JsonField<AccountHolder> = accountHolder

    /** The destination account number. */
    @JsonProperty("account_number")
    @ExcludeMissing
    fun _accountNumber(): JsonField<String> = accountNumber

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the External
     * Account was created.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /** The External Account's description for display purposes. */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /** The type of the account to which the transfer will be sent. */
    @JsonProperty("funding") @ExcludeMissing fun _funding(): JsonField<Funding> = funding

    /**
     * The idempotency key you chose for this object. This value is unique across Increase and is
     * used to ensure that a request is only processed once. Learn more about
     * [idempotency](https://increase.com/documentation/idempotency-keys).
     */
    @JsonProperty("idempotency_key")
    @ExcludeMissing
    fun _idempotencyKey(): JsonField<String> = idempotencyKey

    /** The American Bankers' Association (ABA) Routing Transit Number (RTN). */
    @JsonProperty("routing_number")
    @ExcludeMissing
    fun _routingNumber(): JsonField<String> = routingNumber

    /** The External Account's status. */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * A constant representing the object's type. For this resource it will always be
     * `external_account`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    /** If you have verified ownership of the External Account. */
    @JsonProperty("verification_status")
    @ExcludeMissing
    fun _verificationStatus(): JsonField<VerificationStatus> = verificationStatus

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): ExternalAccount = apply {
        if (validated) {
            return@apply
        }

        id()
        accountHolder()
        accountNumber()
        createdAt()
        description()
        funding()
        idempotencyKey()
        routingNumber()
        status()
        type()
        verificationStatus()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String>? = null
        private var accountHolder: JsonField<AccountHolder>? = null
        private var accountNumber: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var description: JsonField<String>? = null
        private var funding: JsonField<Funding>? = null
        private var idempotencyKey: JsonField<String>? = null
        private var routingNumber: JsonField<String>? = null
        private var status: JsonField<Status>? = null
        private var type: JsonField<Type>? = null
        private var verificationStatus: JsonField<VerificationStatus>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(externalAccount: ExternalAccount) = apply {
            id = externalAccount.id
            accountHolder = externalAccount.accountHolder
            accountNumber = externalAccount.accountNumber
            createdAt = externalAccount.createdAt
            description = externalAccount.description
            funding = externalAccount.funding
            idempotencyKey = externalAccount.idempotencyKey
            routingNumber = externalAccount.routingNumber
            status = externalAccount.status
            type = externalAccount.type
            verificationStatus = externalAccount.verificationStatus
            additionalProperties = externalAccount.additionalProperties.toMutableMap()
        }

        /** The External Account's identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The External Account's identifier. */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The type of entity that owns the External Account. */
        fun accountHolder(accountHolder: AccountHolder) = accountHolder(JsonField.of(accountHolder))

        /** The type of entity that owns the External Account. */
        fun accountHolder(accountHolder: JsonField<AccountHolder>) = apply {
            this.accountHolder = accountHolder
        }

        /** The destination account number. */
        fun accountNumber(accountNumber: String) = accountNumber(JsonField.of(accountNumber))

        /** The destination account number. */
        fun accountNumber(accountNumber: JsonField<String>) = apply {
            this.accountNumber = accountNumber
        }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
         * External Account was created.
         */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
         * External Account was created.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The External Account's description for display purposes. */
        fun description(description: String) = description(JsonField.of(description))

        /** The External Account's description for display purposes. */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** The type of the account to which the transfer will be sent. */
        fun funding(funding: Funding) = funding(JsonField.of(funding))

        /** The type of the account to which the transfer will be sent. */
        fun funding(funding: JsonField<Funding>) = apply { this.funding = funding }

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
            idempotencyKey(idempotencyKey.orElse(null))

        /**
         * The idempotency key you chose for this object. This value is unique across Increase and
         * is used to ensure that a request is only processed once. Learn more about
         * [idempotency](https://increase.com/documentation/idempotency-keys).
         */
        fun idempotencyKey(idempotencyKey: JsonField<String>) = apply {
            this.idempotencyKey = idempotencyKey
        }

        /** The American Bankers' Association (ABA) Routing Transit Number (RTN). */
        fun routingNumber(routingNumber: String) = routingNumber(JsonField.of(routingNumber))

        /** The American Bankers' Association (ABA) Routing Transit Number (RTN). */
        fun routingNumber(routingNumber: JsonField<String>) = apply {
            this.routingNumber = routingNumber
        }

        /** The External Account's status. */
        fun status(status: Status) = status(JsonField.of(status))

        /** The External Account's status. */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `external_account`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be
         * `external_account`.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /** If you have verified ownership of the External Account. */
        fun verificationStatus(verificationStatus: VerificationStatus) =
            verificationStatus(JsonField.of(verificationStatus))

        /** If you have verified ownership of the External Account. */
        fun verificationStatus(verificationStatus: JsonField<VerificationStatus>) = apply {
            this.verificationStatus = verificationStatus
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

        fun build(): ExternalAccount =
            ExternalAccount(
                checkNotNull(id) { "`id` is required but was not set" },
                checkNotNull(accountHolder) { "`accountHolder` is required but was not set" },
                checkNotNull(accountNumber) { "`accountNumber` is required but was not set" },
                checkNotNull(createdAt) { "`createdAt` is required but was not set" },
                checkNotNull(description) { "`description` is required but was not set" },
                checkNotNull(funding) { "`funding` is required but was not set" },
                checkNotNull(idempotencyKey) { "`idempotencyKey` is required but was not set" },
                checkNotNull(routingNumber) { "`routingNumber` is required but was not set" },
                checkNotNull(status) { "`status` is required but was not set" },
                checkNotNull(type) { "`type` is required but was not set" },
                checkNotNull(verificationStatus) {
                    "`verificationStatus` is required but was not set"
                },
                additionalProperties.toImmutable(),
            )
    }

    class AccountHolder
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val BUSINESS = of("business")

            @JvmField val INDIVIDUAL = of("individual")

            @JvmField val UNKNOWN = of("unknown")

            @JvmStatic fun of(value: String) = AccountHolder(JsonField.of(value))
        }

        enum class Known {
            BUSINESS,
            INDIVIDUAL,
            UNKNOWN,
        }

        enum class Value {
            BUSINESS,
            INDIVIDUAL,
            UNKNOWN,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                BUSINESS -> Value.BUSINESS
                INDIVIDUAL -> Value.INDIVIDUAL
                UNKNOWN -> Value.UNKNOWN
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                BUSINESS -> Known.BUSINESS
                INDIVIDUAL -> Known.INDIVIDUAL
                UNKNOWN -> Known.UNKNOWN
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

    class Funding
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val CHECKING = of("checking")

            @JvmField val SAVINGS = of("savings")

            @JvmField val OTHER = of("other")

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Funding && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val ACTIVE = of("active")

            @JvmField val ARCHIVED = of("archived")

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
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

            @JvmField val EXTERNAL_ACCOUNT = of("external_account")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            EXTERNAL_ACCOUNT,
        }

        enum class Value {
            EXTERNAL_ACCOUNT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                EXTERNAL_ACCOUNT -> Value.EXTERNAL_ACCOUNT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                EXTERNAL_ACCOUNT -> Known.EXTERNAL_ACCOUNT
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

    class VerificationStatus
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val UNVERIFIED = of("unverified")

            @JvmField val PENDING = of("pending")

            @JvmField val VERIFIED = of("verified")

            @JvmStatic fun of(value: String) = VerificationStatus(JsonField.of(value))
        }

        enum class Known {
            UNVERIFIED,
            PENDING,
            VERIFIED,
        }

        enum class Value {
            UNVERIFIED,
            PENDING,
            VERIFIED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                UNVERIFIED -> Value.UNVERIFIED
                PENDING -> Value.PENDING
                VERIFIED -> Value.VERIFIED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                UNVERIFIED -> Known.UNVERIFIED
                PENDING -> Known.PENDING
                VERIFIED -> Known.VERIFIED
                else -> throw IncreaseInvalidDataException("Unknown VerificationStatus: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is VerificationStatus && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ExternalAccount && id == other.id && accountHolder == other.accountHolder && accountNumber == other.accountNumber && createdAt == other.createdAt && description == other.description && funding == other.funding && idempotencyKey == other.idempotencyKey && routingNumber == other.routingNumber && status == other.status && type == other.type && verificationStatus == other.verificationStatus && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, accountHolder, accountNumber, createdAt, description, funding, idempotencyKey, routingNumber, status, type, verificationStatus, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExternalAccount{id=$id, accountHolder=$accountHolder, accountNumber=$accountNumber, createdAt=$createdAt, description=$description, funding=$funding, idempotencyKey=$idempotencyKey, routingNumber=$routingNumber, status=$status, type=$type, verificationStatus=$verificationStatus, additionalProperties=$additionalProperties}"
}
