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
        idempotencyKey()
        intrafiId()
        status()
        type()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String>? = null
        private var accountId: JsonField<String>? = null
        private var idempotencyKey: JsonField<String>? = null
        private var intrafiId: JsonField<String>? = null
        private var status: JsonField<Status>? = null
        private var type: JsonField<Type>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(intrafiAccountEnrollment: IntrafiAccountEnrollment) = apply {
            id = intrafiAccountEnrollment.id
            accountId = intrafiAccountEnrollment.accountId
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
                checkRequired("idempotencyKey", idempotencyKey),
                checkRequired("intrafiId", intrafiId),
                checkRequired("status", status),
                checkRequired("type", type),
                additionalProperties.toImmutable(),
            )
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val PENDING_ENROLLING = of("pending_enrolling")

            @JvmField val ENROLLED = of("enrolled")

            @JvmField val PENDING_UNENROLLING = of("pending_unenrolling")

            @JvmField val UNENROLLED = of("unenrolled")

            @JvmField val REQUIRES_ATTENTION = of("requires_attention")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            PENDING_ENROLLING,
            ENROLLED,
            PENDING_UNENROLLING,
            UNENROLLED,
            REQUIRES_ATTENTION,
        }

        enum class Value {
            PENDING_ENROLLING,
            ENROLLED,
            PENDING_UNENROLLING,
            UNENROLLED,
            REQUIRES_ATTENTION,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                PENDING_ENROLLING -> Value.PENDING_ENROLLING
                ENROLLED -> Value.ENROLLED
                PENDING_UNENROLLING -> Value.PENDING_UNENROLLING
                UNENROLLED -> Value.UNENROLLED
                REQUIRES_ATTENTION -> Value.REQUIRES_ATTENTION
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                PENDING_ENROLLING -> Known.PENDING_ENROLLING
                ENROLLED -> Known.ENROLLED
                PENDING_UNENROLLING -> Known.PENDING_UNENROLLING
                UNENROLLED -> Known.UNENROLLED
                REQUIRES_ATTENTION -> Known.REQUIRES_ATTENTION
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

            @JvmField val INTRAFI_ACCOUNT_ENROLLMENT = of("intrafi_account_enrollment")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            INTRAFI_ACCOUNT_ENROLLMENT,
        }

        enum class Value {
            INTRAFI_ACCOUNT_ENROLLMENT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                INTRAFI_ACCOUNT_ENROLLMENT -> Value.INTRAFI_ACCOUNT_ENROLLMENT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                INTRAFI_ACCOUNT_ENROLLMENT -> Known.INTRAFI_ACCOUNT_ENROLLMENT
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

        return /* spotless:off */ other is IntrafiAccountEnrollment && id == other.id && accountId == other.accountId && idempotencyKey == other.idempotencyKey && intrafiId == other.intrafiId && status == other.status && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, accountId, idempotencyKey, intrafiId, status, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "IntrafiAccountEnrollment{id=$id, accountId=$accountId, idempotencyKey=$idempotencyKey, intrafiId=$intrafiId, status=$status, type=$type, additionalProperties=$additionalProperties}"
}
