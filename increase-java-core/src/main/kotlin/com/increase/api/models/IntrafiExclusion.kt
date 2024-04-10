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
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

/**
 * Certain institutions may be excluded per Entity when sweeping funds into the IntraFi network.
 * This is useful when an Entity already has deposits at a particular bank, and does not want to
 * sweep additional funds to it. It may take 5 business days for an exclusion to be processed.
 */
@JsonDeserialize(builder = IntrafiExclusion.Builder::class)
@NoAutoDetect
class IntrafiExclusion
private constructor(
    private val id: JsonField<String>,
    private val submittedAt: JsonField<OffsetDateTime>,
    private val excludedAt: JsonField<OffsetDateTime>,
    private val bankName: JsonField<String>,
    private val fdicCertificateNumber: JsonField<String>,
    private val entityId: JsonField<String>,
    private val status: JsonField<Status>,
    private val idempotencyKey: JsonField<String>,
    private val type: JsonField<Type>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** The identifier of this exclusion request. */
    fun id(): String = id.getRequired("id")

    /** When this was exclusion was submitted to IntraFi by Increase. */
    fun submittedAt(): Optional<OffsetDateTime> =
        Optional.ofNullable(submittedAt.getNullable("submitted_at"))

    /** When this was exclusion was confirmed by IntraFi. */
    fun excludedAt(): Optional<OffsetDateTime> =
        Optional.ofNullable(excludedAt.getNullable("excluded_at"))

    /** The name of the excluded institution. */
    fun bankName(): String = bankName.getRequired("bank_name")

    /** The Federal Deposit Insurance Corporation's certificate number for the institution. */
    fun fdicCertificateNumber(): Optional<String> =
        Optional.ofNullable(fdicCertificateNumber.getNullable("fdic_certificate_number"))

    /** The entity for which this institution is excluded. */
    fun entityId(): String = entityId.getRequired("entity_id")

    /** The status of the exclusion request. */
    fun status(): Status = status.getRequired("status")

    /**
     * The idempotency key you chose for this object. This value is unique across Increase and is
     * used to ensure that a request is only processed once. Learn more about
     * [idempotency](https://increase.com/documentation/idempotency-keys).
     */
    fun idempotencyKey(): Optional<String> =
        Optional.ofNullable(idempotencyKey.getNullable("idempotency_key"))

    /**
     * A constant representing the object's type. For this resource it will always be
     * `intrafi_exclusion`.
     */
    fun type(): Type = type.getRequired("type")

    /** The identifier of this exclusion request. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /** When this was exclusion was submitted to IntraFi by Increase. */
    @JsonProperty("submitted_at") @ExcludeMissing fun _submittedAt() = submittedAt

    /** When this was exclusion was confirmed by IntraFi. */
    @JsonProperty("excluded_at") @ExcludeMissing fun _excludedAt() = excludedAt

    /** The name of the excluded institution. */
    @JsonProperty("bank_name") @ExcludeMissing fun _bankName() = bankName

    /** The Federal Deposit Insurance Corporation's certificate number for the institution. */
    @JsonProperty("fdic_certificate_number")
    @ExcludeMissing
    fun _fdicCertificateNumber() = fdicCertificateNumber

    /** The entity for which this institution is excluded. */
    @JsonProperty("entity_id") @ExcludeMissing fun _entityId() = entityId

    /** The status of the exclusion request. */
    @JsonProperty("status") @ExcludeMissing fun _status() = status

    /**
     * The idempotency key you chose for this object. This value is unique across Increase and is
     * used to ensure that a request is only processed once. Learn more about
     * [idempotency](https://increase.com/documentation/idempotency-keys).
     */
    @JsonProperty("idempotency_key") @ExcludeMissing fun _idempotencyKey() = idempotencyKey

    /**
     * A constant representing the object's type. For this resource it will always be
     * `intrafi_exclusion`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): IntrafiExclusion = apply {
        if (!validated) {
            id()
            submittedAt()
            excludedAt()
            bankName()
            fdicCertificateNumber()
            entityId()
            status()
            idempotencyKey()
            type()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is IntrafiExclusion &&
            this.id == other.id &&
            this.submittedAt == other.submittedAt &&
            this.excludedAt == other.excludedAt &&
            this.bankName == other.bankName &&
            this.fdicCertificateNumber == other.fdicCertificateNumber &&
            this.entityId == other.entityId &&
            this.status == other.status &&
            this.idempotencyKey == other.idempotencyKey &&
            this.type == other.type &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    id,
                    submittedAt,
                    excludedAt,
                    bankName,
                    fdicCertificateNumber,
                    entityId,
                    status,
                    idempotencyKey,
                    type,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "IntrafiExclusion{id=$id, submittedAt=$submittedAt, excludedAt=$excludedAt, bankName=$bankName, fdicCertificateNumber=$fdicCertificateNumber, entityId=$entityId, status=$status, idempotencyKey=$idempotencyKey, type=$type, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var submittedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var excludedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var bankName: JsonField<String> = JsonMissing.of()
        private var fdicCertificateNumber: JsonField<String> = JsonMissing.of()
        private var entityId: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var idempotencyKey: JsonField<String> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(intrafiExclusion: IntrafiExclusion) = apply {
            this.id = intrafiExclusion.id
            this.submittedAt = intrafiExclusion.submittedAt
            this.excludedAt = intrafiExclusion.excludedAt
            this.bankName = intrafiExclusion.bankName
            this.fdicCertificateNumber = intrafiExclusion.fdicCertificateNumber
            this.entityId = intrafiExclusion.entityId
            this.status = intrafiExclusion.status
            this.idempotencyKey = intrafiExclusion.idempotencyKey
            this.type = intrafiExclusion.type
            additionalProperties(intrafiExclusion.additionalProperties)
        }

        /** The identifier of this exclusion request. */
        fun id(id: String) = id(JsonField.of(id))

        /** The identifier of this exclusion request. */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        /** When this was exclusion was submitted to IntraFi by Increase. */
        fun submittedAt(submittedAt: OffsetDateTime) = submittedAt(JsonField.of(submittedAt))

        /** When this was exclusion was submitted to IntraFi by Increase. */
        @JsonProperty("submitted_at")
        @ExcludeMissing
        fun submittedAt(submittedAt: JsonField<OffsetDateTime>) = apply {
            this.submittedAt = submittedAt
        }

        /** When this was exclusion was confirmed by IntraFi. */
        fun excludedAt(excludedAt: OffsetDateTime) = excludedAt(JsonField.of(excludedAt))

        /** When this was exclusion was confirmed by IntraFi. */
        @JsonProperty("excluded_at")
        @ExcludeMissing
        fun excludedAt(excludedAt: JsonField<OffsetDateTime>) = apply {
            this.excludedAt = excludedAt
        }

        /** The name of the excluded institution. */
        fun bankName(bankName: String) = bankName(JsonField.of(bankName))

        /** The name of the excluded institution. */
        @JsonProperty("bank_name")
        @ExcludeMissing
        fun bankName(bankName: JsonField<String>) = apply { this.bankName = bankName }

        /** The Federal Deposit Insurance Corporation's certificate number for the institution. */
        fun fdicCertificateNumber(fdicCertificateNumber: String) =
            fdicCertificateNumber(JsonField.of(fdicCertificateNumber))

        /** The Federal Deposit Insurance Corporation's certificate number for the institution. */
        @JsonProperty("fdic_certificate_number")
        @ExcludeMissing
        fun fdicCertificateNumber(fdicCertificateNumber: JsonField<String>) = apply {
            this.fdicCertificateNumber = fdicCertificateNumber
        }

        /** The entity for which this institution is excluded. */
        fun entityId(entityId: String) = entityId(JsonField.of(entityId))

        /** The entity for which this institution is excluded. */
        @JsonProperty("entity_id")
        @ExcludeMissing
        fun entityId(entityId: JsonField<String>) = apply { this.entityId = entityId }

        /** The status of the exclusion request. */
        fun status(status: Status) = status(JsonField.of(status))

        /** The status of the exclusion request. */
        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<Status>) = apply { this.status = status }

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
         * A constant representing the object's type. For this resource it will always be
         * `intrafi_exclusion`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be
         * `intrafi_exclusion`.
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

        fun build(): IntrafiExclusion =
            IntrafiExclusion(
                id,
                submittedAt,
                excludedAt,
                bankName,
                fdicCertificateNumber,
                entityId,
                status,
                idempotencyKey,
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

            return other is Status && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val PENDING = Status(JsonField.of("pending"))

            @JvmField val COMPLETED = Status(JsonField.of("completed"))

            @JvmField val ARCHIVED = Status(JsonField.of("archived"))

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            PENDING,
            COMPLETED,
            ARCHIVED,
        }

        enum class Value {
            PENDING,
            COMPLETED,
            ARCHIVED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                PENDING -> Value.PENDING
                COMPLETED -> Value.COMPLETED
                ARCHIVED -> Value.ARCHIVED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                PENDING -> Known.PENDING
                COMPLETED -> Known.COMPLETED
                ARCHIVED -> Known.ARCHIVED
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

            return other is Type && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val INTRAFI_EXCLUSION = Type(JsonField.of("intrafi_exclusion"))

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            INTRAFI_EXCLUSION,
        }

        enum class Value {
            INTRAFI_EXCLUSION,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                INTRAFI_EXCLUSION -> Value.INTRAFI_EXCLUSION
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                INTRAFI_EXCLUSION -> Known.INTRAFI_EXCLUSION
                else -> throw IncreaseInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
