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
 * Certain institutions may be excluded per Entity when sweeping funds into the IntraFi network.
 * This is useful when an Entity already has deposits at a particular bank, and does not want to
 * sweep additional funds to it. It may take 5 business days for an exclusion to be processed.
 */
@NoAutoDetect
class IntrafiExclusion
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("bank_name")
    @ExcludeMissing
    private val bankName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("entity_id")
    @ExcludeMissing
    private val entityId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("excluded_at")
    @ExcludeMissing
    private val excludedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("fdic_certificate_number")
    @ExcludeMissing
    private val fdicCertificateNumber: JsonField<String> = JsonMissing.of(),
    @JsonProperty("idempotency_key")
    @ExcludeMissing
    private val idempotencyKey: JsonField<String> = JsonMissing.of(),
    @JsonProperty("status")
    @ExcludeMissing
    private val status: JsonField<Status> = JsonMissing.of(),
    @JsonProperty("submitted_at")
    @ExcludeMissing
    private val submittedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The identifier of this exclusion request. */
    fun id(): String = id.getRequired("id")

    /** The name of the excluded institution. */
    fun bankName(): String = bankName.getRequired("bank_name")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the exclusion
     * was created.
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** The entity for which this institution is excluded. */
    fun entityId(): String = entityId.getRequired("entity_id")

    /** When this was exclusion was confirmed by IntraFi. */
    fun excludedAt(): Optional<OffsetDateTime> =
        Optional.ofNullable(excludedAt.getNullable("excluded_at"))

    /** The Federal Deposit Insurance Corporation's certificate number for the institution. */
    fun fdicCertificateNumber(): Optional<String> =
        Optional.ofNullable(fdicCertificateNumber.getNullable("fdic_certificate_number"))

    /**
     * The idempotency key you chose for this object. This value is unique across Increase and is
     * used to ensure that a request is only processed once. Learn more about
     * [idempotency](https://increase.com/documentation/idempotency-keys).
     */
    fun idempotencyKey(): Optional<String> =
        Optional.ofNullable(idempotencyKey.getNullable("idempotency_key"))

    /** The status of the exclusion request. */
    fun status(): Status = status.getRequired("status")

    /** When this was exclusion was submitted to IntraFi by Increase. */
    fun submittedAt(): Optional<OffsetDateTime> =
        Optional.ofNullable(submittedAt.getNullable("submitted_at"))

    /**
     * A constant representing the object's type. For this resource it will always be
     * `intrafi_exclusion`.
     */
    fun type(): Type = type.getRequired("type")

    /** The identifier of this exclusion request. */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /** The name of the excluded institution. */
    @JsonProperty("bank_name") @ExcludeMissing fun _bankName(): JsonField<String> = bankName

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the exclusion
     * was created.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /** The entity for which this institution is excluded. */
    @JsonProperty("entity_id") @ExcludeMissing fun _entityId(): JsonField<String> = entityId

    /** When this was exclusion was confirmed by IntraFi. */
    @JsonProperty("excluded_at")
    @ExcludeMissing
    fun _excludedAt(): JsonField<OffsetDateTime> = excludedAt

    /** The Federal Deposit Insurance Corporation's certificate number for the institution. */
    @JsonProperty("fdic_certificate_number")
    @ExcludeMissing
    fun _fdicCertificateNumber(): JsonField<String> = fdicCertificateNumber

    /**
     * The idempotency key you chose for this object. This value is unique across Increase and is
     * used to ensure that a request is only processed once. Learn more about
     * [idempotency](https://increase.com/documentation/idempotency-keys).
     */
    @JsonProperty("idempotency_key")
    @ExcludeMissing
    fun _idempotencyKey(): JsonField<String> = idempotencyKey

    /** The status of the exclusion request. */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /** When this was exclusion was submitted to IntraFi by Increase. */
    @JsonProperty("submitted_at")
    @ExcludeMissing
    fun _submittedAt(): JsonField<OffsetDateTime> = submittedAt

    /**
     * A constant representing the object's type. For this resource it will always be
     * `intrafi_exclusion`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): IntrafiExclusion = apply {
        if (validated) {
            return@apply
        }

        id()
        bankName()
        createdAt()
        entityId()
        excludedAt()
        fdicCertificateNumber()
        idempotencyKey()
        status()
        submittedAt()
        type()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [IntrafiExclusion].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .bankName()
         * .createdAt()
         * .entityId()
         * .excludedAt()
         * .fdicCertificateNumber()
         * .idempotencyKey()
         * .status()
         * .submittedAt()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [IntrafiExclusion]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var bankName: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var entityId: JsonField<String>? = null
        private var excludedAt: JsonField<OffsetDateTime>? = null
        private var fdicCertificateNumber: JsonField<String>? = null
        private var idempotencyKey: JsonField<String>? = null
        private var status: JsonField<Status>? = null
        private var submittedAt: JsonField<OffsetDateTime>? = null
        private var type: JsonField<Type>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(intrafiExclusion: IntrafiExclusion) = apply {
            id = intrafiExclusion.id
            bankName = intrafiExclusion.bankName
            createdAt = intrafiExclusion.createdAt
            entityId = intrafiExclusion.entityId
            excludedAt = intrafiExclusion.excludedAt
            fdicCertificateNumber = intrafiExclusion.fdicCertificateNumber
            idempotencyKey = intrafiExclusion.idempotencyKey
            status = intrafiExclusion.status
            submittedAt = intrafiExclusion.submittedAt
            type = intrafiExclusion.type
            additionalProperties = intrafiExclusion.additionalProperties.toMutableMap()
        }

        /** The identifier of this exclusion request. */
        fun id(id: String) = id(JsonField.of(id))

        /** The identifier of this exclusion request. */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The name of the excluded institution. */
        fun bankName(bankName: String) = bankName(JsonField.of(bankName))

        /** The name of the excluded institution. */
        fun bankName(bankName: JsonField<String>) = apply { this.bankName = bankName }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
         * exclusion was created.
         */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
         * exclusion was created.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The entity for which this institution is excluded. */
        fun entityId(entityId: String) = entityId(JsonField.of(entityId))

        /** The entity for which this institution is excluded. */
        fun entityId(entityId: JsonField<String>) = apply { this.entityId = entityId }

        /** When this was exclusion was confirmed by IntraFi. */
        fun excludedAt(excludedAt: OffsetDateTime?) = excludedAt(JsonField.ofNullable(excludedAt))

        /** When this was exclusion was confirmed by IntraFi. */
        fun excludedAt(excludedAt: Optional<OffsetDateTime>) = excludedAt(excludedAt.getOrNull())

        /** When this was exclusion was confirmed by IntraFi. */
        fun excludedAt(excludedAt: JsonField<OffsetDateTime>) = apply {
            this.excludedAt = excludedAt
        }

        /** The Federal Deposit Insurance Corporation's certificate number for the institution. */
        fun fdicCertificateNumber(fdicCertificateNumber: String?) =
            fdicCertificateNumber(JsonField.ofNullable(fdicCertificateNumber))

        /** The Federal Deposit Insurance Corporation's certificate number for the institution. */
        fun fdicCertificateNumber(fdicCertificateNumber: Optional<String>) =
            fdicCertificateNumber(fdicCertificateNumber.getOrNull())

        /** The Federal Deposit Insurance Corporation's certificate number for the institution. */
        fun fdicCertificateNumber(fdicCertificateNumber: JsonField<String>) = apply {
            this.fdicCertificateNumber = fdicCertificateNumber
        }

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

        /** The status of the exclusion request. */
        fun status(status: Status) = status(JsonField.of(status))

        /** The status of the exclusion request. */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** When this was exclusion was submitted to IntraFi by Increase. */
        fun submittedAt(submittedAt: OffsetDateTime?) =
            submittedAt(JsonField.ofNullable(submittedAt))

        /** When this was exclusion was submitted to IntraFi by Increase. */
        fun submittedAt(submittedAt: Optional<OffsetDateTime>) =
            submittedAt(submittedAt.getOrNull())

        /** When this was exclusion was submitted to IntraFi by Increase. */
        fun submittedAt(submittedAt: JsonField<OffsetDateTime>) = apply {
            this.submittedAt = submittedAt
        }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `intrafi_exclusion`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be
         * `intrafi_exclusion`.
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

        fun build(): IntrafiExclusion =
            IntrafiExclusion(
                checkRequired("id", id),
                checkRequired("bankName", bankName),
                checkRequired("createdAt", createdAt),
                checkRequired("entityId", entityId),
                checkRequired("excludedAt", excludedAt),
                checkRequired("fdicCertificateNumber", fdicCertificateNumber),
                checkRequired("idempotencyKey", idempotencyKey),
                checkRequired("status", status),
                checkRequired("submittedAt", submittedAt),
                checkRequired("type", type),
                additionalProperties.toImmutable(),
            )
    }

    /** The status of the exclusion request. */
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

            /** The exclusion is being added to the IntraFi network. */
            @JvmField val PENDING = of("pending")

            /** The exclusion has been added to the IntraFi network. */
            @JvmField val COMPLETED = of("completed")

            /** The exclusion has been removed from the IntraFi network. */
            @JvmField val ARCHIVED = of("archived")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            /** The exclusion is being added to the IntraFi network. */
            PENDING,
            /** The exclusion has been added to the IntraFi network. */
            COMPLETED,
            /** The exclusion has been removed from the IntraFi network. */
            ARCHIVED,
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
            /** The exclusion is being added to the IntraFi network. */
            PENDING,
            /** The exclusion has been added to the IntraFi network. */
            COMPLETED,
            /** The exclusion has been removed from the IntraFi network. */
            ARCHIVED,
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
                PENDING -> Value.PENDING
                COMPLETED -> Value.COMPLETED
                ARCHIVED -> Value.ARCHIVED
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
                PENDING -> Known.PENDING
                COMPLETED -> Known.COMPLETED
                ARCHIVED -> Known.ARCHIVED
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
     * `intrafi_exclusion`.
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

            @JvmField val INTRAFI_EXCLUSION = of("intrafi_exclusion")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            INTRAFI_EXCLUSION
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
            INTRAFI_EXCLUSION,
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
                INTRAFI_EXCLUSION -> Value.INTRAFI_EXCLUSION
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
                INTRAFI_EXCLUSION -> Known.INTRAFI_EXCLUSION
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

        return /* spotless:off */ other is IntrafiExclusion && id == other.id && bankName == other.bankName && createdAt == other.createdAt && entityId == other.entityId && excludedAt == other.excludedAt && fdicCertificateNumber == other.fdicCertificateNumber && idempotencyKey == other.idempotencyKey && status == other.status && submittedAt == other.submittedAt && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, bankName, createdAt, entityId, excludedAt, fdicCertificateNumber, idempotencyKey, status, submittedAt, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "IntrafiExclusion{id=$id, bankName=$bankName, createdAt=$createdAt, entityId=$entityId, excludedAt=$excludedAt, fdicCertificateNumber=$fdicCertificateNumber, idempotencyKey=$idempotencyKey, status=$status, submittedAt=$submittedAt, type=$type, additionalProperties=$additionalProperties}"
}
