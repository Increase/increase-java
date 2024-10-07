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
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.toUnmodifiable
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
@JsonDeserialize(builder = IntrafiAccountEnrollment.Builder::class)
@NoAutoDetect
class IntrafiAccountEnrollment
private constructor(
    private val accountId: JsonField<String>,
    private val id: JsonField<String>,
    private val idempotencyKey: JsonField<String>,
    private val intrafiId: JsonField<String>,
    private val status: JsonField<Status>,
    private val type: JsonField<Type>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /** The identifier of the Increase Account being swept into the network. */
    fun accountId(): String = accountId.getRequired("account_id")

    /** The identifier of this enrollment at IntraFi. */
    fun id(): String = id.getRequired("id")

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

    /** The identifier of the Increase Account being swept into the network. */
    @JsonProperty("account_id") @ExcludeMissing fun _accountId() = accountId

    /** The identifier of this enrollment at IntraFi. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /**
     * The idempotency key you chose for this object. This value is unique across Increase and is
     * used to ensure that a request is only processed once. Learn more about
     * [idempotency](https://increase.com/documentation/idempotency-keys).
     */
    @JsonProperty("idempotency_key") @ExcludeMissing fun _idempotencyKey() = idempotencyKey

    /**
     * The identifier of the account in IntraFi's system. This identifier will be printed on any
     * IntraFi statements or documents.
     */
    @JsonProperty("intrafi_id") @ExcludeMissing fun _intrafiId() = intrafiId

    /**
     * The status of the account in the network. An account takes about one business day to go from
     * `pending_enrolling` to `enrolled`.
     */
    @JsonProperty("status") @ExcludeMissing fun _status() = status

    /**
     * A constant representing the object's type. For this resource it will always be
     * `intrafi_account_enrollment`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): IntrafiAccountEnrollment = apply {
        if (!validated) {
            accountId()
            id()
            idempotencyKey()
            intrafiId()
            status()
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
        private var id: JsonField<String> = JsonMissing.of()
        private var idempotencyKey: JsonField<String> = JsonMissing.of()
        private var intrafiId: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(intrafiAccountEnrollment: IntrafiAccountEnrollment) = apply {
            this.accountId = intrafiAccountEnrollment.accountId
            this.id = intrafiAccountEnrollment.id
            this.idempotencyKey = intrafiAccountEnrollment.idempotencyKey
            this.intrafiId = intrafiAccountEnrollment.intrafiId
            this.status = intrafiAccountEnrollment.status
            this.type = intrafiAccountEnrollment.type
            additionalProperties(intrafiAccountEnrollment.additionalProperties)
        }

        /** The identifier of the Increase Account being swept into the network. */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /** The identifier of the Increase Account being swept into the network. */
        @JsonProperty("account_id")
        @ExcludeMissing
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        /** The identifier of this enrollment at IntraFi. */
        fun id(id: String) = id(JsonField.of(id))

        /** The identifier of this enrollment at IntraFi. */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

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
        @JsonProperty("idempotency_key")
        @ExcludeMissing
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
        @JsonProperty("intrafi_id")
        @ExcludeMissing
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
        @JsonProperty("status")
        @ExcludeMissing
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

        fun build(): IntrafiAccountEnrollment =
            IntrafiAccountEnrollment(
                accountId,
                id,
                idempotencyKey,
                intrafiId,
                status,
                type,
                additionalProperties.toUnmodifiable(),
            )
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Status && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val PENDING_ENROLLING = Status(JsonField.of("pending_enrolling"))

            @JvmField val ENROLLED = Status(JsonField.of("enrolled"))

            @JvmField val PENDING_UNENROLLING = Status(JsonField.of("pending_unenrolling"))

            @JvmField val UNENROLLED = Status(JsonField.of("unenrolled"))

            @JvmField val REQUIRES_ATTENTION = Status(JsonField.of("requires_attention"))

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
    }

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Type && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField
            val INTRAFI_ACCOUNT_ENROLLMENT = Type(JsonField.of("intrafi_account_enrollment"))

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
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is IntrafiAccountEnrollment && this.accountId == other.accountId && this.id == other.id && this.idempotencyKey == other.idempotencyKey && this.intrafiId == other.intrafiId && this.status == other.status && this.type == other.type && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(accountId, id, idempotencyKey, intrafiId, status, type, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "IntrafiAccountEnrollment{accountId=$accountId, id=$id, idempotencyKey=$idempotencyKey, intrafiId=$intrafiId, status=$status, type=$type, additionalProperties=$additionalProperties}"
}
