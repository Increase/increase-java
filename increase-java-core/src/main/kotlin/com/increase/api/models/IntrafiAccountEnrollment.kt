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
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * IntraFi is a [network of financial institutions](https://www.intrafi.com/network-banks) that
 * allows Increase users to sweep funds to multiple banks, in addition to Increase's main bank
 * partners. This enables accounts to become eligible for additional Federal Deposit Insurance
 * Corporation (FDIC) insurance. An IntraFi Account Enrollment object represents the status of an
 * account in the network. Sweeping an account to IntraFi doesn't affect funds availability.
 */
@NoAutoDetect
class IntrafiAccountEnrollment
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("account_id")
    @ExcludeMissing
    private val accountId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("idempotency_key")
    @ExcludeMissing
    private val idempotencyKey: JsonField<String> = JsonMissing.of(),
    @JsonProperty("intrafi_id")
    @ExcludeMissing
    private val intrafiId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("status")
    @ExcludeMissing
    private val status: JsonField<Status> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The identifier of this enrollment at IntraFi. */
    fun id(): String = id.getRequired("id")

    /** The identifier of the Increase Account being swept into the network. */
    fun accountId(): String = accountId.getRequired("account_id")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the enrollment
     * was created.
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * The idempotency key you chose for this object. This value is unique across Increase and is
     * used to ensure that a request is only processed once. Learn more about
     * [idempotency](https://increase.com/documentation/idempotency-keys).
     */
    fun idempotencyKey(): Optional<String> =
        Optional.ofNullable(idempotencyKey.getNullable("idempotency_key"))

    /**
     * The identifier of the account in IntraFi's system. This identifier will be printed on any
     * IntraFi statements or documents.
     */
    fun intrafiId(): String = intrafiId.getRequired("intrafi_id")

    /**
     * The status of the account in the network. An account takes about one business day to go from
     * `pending_enrolling` to `enrolled`.
     */
    fun status(): Status = status.getRequired("status")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `intrafi_account_enrollment`.
     */
    fun type(): Type = type.getRequired("type")

    /** The identifier of this enrollment at IntraFi. */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /** The identifier of the Increase Account being swept into the network. */
    @JsonProperty("account_id") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the enrollment
     * was created.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * The idempotency key you chose for this object. This value is unique across Increase and is
     * used to ensure that a request is only processed once. Learn more about
     * [idempotency](https://increase.com/documentation/idempotency-keys).
     */
    @JsonProperty("idempotency_key")
    @ExcludeMissing
    fun _idempotencyKey(): JsonField<String> = idempotencyKey

    /**
     * The identifier of the account in IntraFi's system. This identifier will be printed on any
     * IntraFi statements or documents.
     */
    @JsonProperty("intrafi_id") @ExcludeMissing fun _intrafiId(): JsonField<String> = intrafiId

    /**
     * The status of the account in the network. An account takes about one business day to go from
     * `pending_enrolling` to `enrolled`.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * A constant representing the object's type. For this resource it will always be
     * `intrafi_account_enrollment`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): IntrafiAccountEnrollment = apply {
        if (validated) {
            return@apply
        }

        id()
        accountId()
        createdAt()
        idempotencyKey()
        intrafiId()
        status()
        type()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [IntrafiAccountEnrollment].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .accountId()
         * .createdAt()
         * .idempotencyKey()
         * .intrafiId()
         * .status()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [IntrafiAccountEnrollment]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var accountId: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var idempotencyKey: JsonField<String>? = null
        private var intrafiId: JsonField<String>? = null
        private var status: JsonField<Status>? = null
        private var type: JsonField<Type>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(intrafiAccountEnrollment: IntrafiAccountEnrollment) = apply {
            id = intrafiAccountEnrollment.id
            accountId = intrafiAccountEnrollment.accountId
            createdAt = intrafiAccountEnrollment.createdAt
            idempotencyKey = intrafiAccountEnrollment.idempotencyKey
            intrafiId = intrafiAccountEnrollment.intrafiId
            status = intrafiAccountEnrollment.status
            type = intrafiAccountEnrollment.type
            additionalProperties = intrafiAccountEnrollment.additionalProperties.toMutableMap()
        }

        /** The identifier of this enrollment at IntraFi. */
        fun id(id: String) = id(JsonField.of(id))

        /** The identifier of this enrollment at IntraFi. */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The identifier of the Increase Account being swept into the network. */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /** The identifier of the Increase Account being swept into the network. */
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
         * enrollment was created.
         */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
         * enrollment was created.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

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

        /**
         * The identifier of the account in IntraFi's system. This identifier will be printed on any
         * IntraFi statements or documents.
         */
        fun intrafiId(intrafiId: String) = intrafiId(JsonField.of(intrafiId))

        /**
         * The identifier of the account in IntraFi's system. This identifier will be printed on any
         * IntraFi statements or documents.
         */
        fun intrafiId(intrafiId: JsonField<String>) = apply { this.intrafiId = intrafiId }

        /**
         * The status of the account in the network. An account takes about one business day to go
         * from `pending_enrolling` to `enrolled`.
         */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * The status of the account in the network. An account takes about one business day to go
         * from `pending_enrolling` to `enrolled`.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `intrafi_account_enrollment`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be
         * `intrafi_account_enrollment`.
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

        fun build(): IntrafiAccountEnrollment =
            IntrafiAccountEnrollment(
                checkRequired("id", id),
                checkRequired("accountId", accountId),
                checkRequired("createdAt", createdAt),
                checkRequired("idempotencyKey", idempotencyKey),
                checkRequired("intrafiId", intrafiId),
                checkRequired("status", status),
                checkRequired("type", type),
                additionalProperties.toImmutable(),
            )
    }

    /**
     * The status of the account in the network. An account takes about one business day to go from
     * `pending_enrolling` to `enrolled`.
     */
    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            /** The account is being added to the IntraFi network. */
            @JvmField val PENDING_ENROLLING = of("pending_enrolling")

            /** The account has been enrolled with IntraFi. */
            @JvmField val ENROLLED = of("enrolled")

            /** The account is being unenrolled from IntraFi's deposit sweep. */
            @JvmField val PENDING_UNENROLLING = of("pending_unenrolling")

            /** The account was once enrolled, but is no longer enrolled at IntraFi. */
            @JvmField val UNENROLLED = of("unenrolled")

            /** Something unexpected happened with this account. Contact Increase support. */
            @JvmField val REQUIRES_ATTENTION = of("requires_attention")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            /** The account is being added to the IntraFi network. */
            PENDING_ENROLLING,
            /** The account has been enrolled with IntraFi. */
            ENROLLED,
            /** The account is being unenrolled from IntraFi's deposit sweep. */
            PENDING_UNENROLLING,
            /** The account was once enrolled, but is no longer enrolled at IntraFi. */
            UNENROLLED,
            /** Something unexpected happened with this account. Contact Increase support. */
            REQUIRES_ATTENTION,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            /** The account is being added to the IntraFi network. */
            PENDING_ENROLLING,
            /** The account has been enrolled with IntraFi. */
            ENROLLED,
            /** The account is being unenrolled from IntraFi's deposit sweep. */
            PENDING_UNENROLLING,
            /** The account was once enrolled, but is no longer enrolled at IntraFi. */
            UNENROLLED,
            /** Something unexpected happened with this account. Contact Increase support. */
            REQUIRES_ATTENTION,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
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
                PENDING_ENROLLING -> Value.PENDING_ENROLLING
                ENROLLED -> Value.ENROLLED
                PENDING_UNENROLLING -> Value.PENDING_UNENROLLING
                UNENROLLED -> Value.UNENROLLED
                REQUIRES_ATTENTION -> Value.REQUIRES_ATTENTION
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
                PENDING_ENROLLING -> Known.PENDING_ENROLLING
                ENROLLED -> Known.ENROLLED
                PENDING_UNENROLLING -> Known.PENDING_UNENROLLING
                UNENROLLED -> Known.UNENROLLED
                REQUIRES_ATTENTION -> Known.REQUIRES_ATTENTION
                else -> throw IncreaseInvalidDataException("Unknown Status: $value")
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

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * A constant representing the object's type. For this resource it will always be
     * `intrafi_account_enrollment`.
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

            @JvmField val INTRAFI_ACCOUNT_ENROLLMENT = of("intrafi_account_enrollment")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            INTRAFI_ACCOUNT_ENROLLMENT
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
            INTRAFI_ACCOUNT_ENROLLMENT,
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
                INTRAFI_ACCOUNT_ENROLLMENT -> Value.INTRAFI_ACCOUNT_ENROLLMENT
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
                INTRAFI_ACCOUNT_ENROLLMENT -> Known.INTRAFI_ACCOUNT_ENROLLMENT
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

        return /* spotless:off */ other is IntrafiAccountEnrollment && id == other.id && accountId == other.accountId && createdAt == other.createdAt && idempotencyKey == other.idempotencyKey && intrafiId == other.intrafiId && status == other.status && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, accountId, createdAt, idempotencyKey, intrafiId, status, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "IntrafiAccountEnrollment{id=$id, accountId=$accountId, createdAt=$createdAt, idempotencyKey=$idempotencyKey, intrafiId=$intrafiId, status=$status, type=$type, additionalProperties=$additionalProperties}"
}
