// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.intrafiexclusions

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.increase.api.core.Enum
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.checkRequired
import com.increase.api.errors.IncreaseInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Certain institutions may be excluded per Entity when sweeping funds into the IntraFi network.
 * This is useful when an Entity already has deposits at a particular bank, and does not want to
 * sweep additional funds to it. It may take 5 business days for an exclusion to be processed.
 */
class IntrafiExclusion
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val bankName: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val entityId: JsonField<String>,
    private val excludedAt: JsonField<OffsetDateTime>,
    private val fdicCertificateNumber: JsonField<String>,
    private val idempotencyKey: JsonField<String>,
    private val status: JsonField<Status>,
    private val submittedAt: JsonField<OffsetDateTime>,
    private val type: JsonField<Type>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("bank_name") @ExcludeMissing bankName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("entity_id") @ExcludeMissing entityId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("excluded_at")
        @ExcludeMissing
        excludedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("fdic_certificate_number")
        @ExcludeMissing
        fdicCertificateNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("idempotency_key")
        @ExcludeMissing
        idempotencyKey: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("submitted_at")
        @ExcludeMissing
        submittedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
    ) : this(
        id,
        bankName,
        createdAt,
        entityId,
        excludedAt,
        fdicCertificateNumber,
        idempotencyKey,
        status,
        submittedAt,
        type,
        mutableMapOf(),
    )

    /**
     * The identifier of this exclusion request.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The name of the excluded institution.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun bankName(): Optional<String> = bankName.getOptional("bank_name")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the exclusion
     * was created.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * The entity for which this institution is excluded.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun entityId(): String = entityId.getRequired("entity_id")

    /**
     * When this was exclusion was confirmed by IntraFi.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun excludedAt(): Optional<OffsetDateTime> = excludedAt.getOptional("excluded_at")

    /**
     * The Federal Deposit Insurance Corporation's certificate number for the institution.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fdicCertificateNumber(): Optional<String> =
        fdicCertificateNumber.getOptional("fdic_certificate_number")

    /**
     * The idempotency key you chose for this object. This value is unique across Increase and is
     * used to ensure that a request is only processed once. Learn more about
     * [idempotency](https://increase.com/documentation/idempotency-keys).
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun idempotencyKey(): Optional<String> = idempotencyKey.getOptional("idempotency_key")

    /**
     * The status of the exclusion request.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * When this was exclusion was submitted to IntraFi by Increase.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun submittedAt(): Optional<OffsetDateTime> = submittedAt.getOptional("submitted_at")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `intrafi_exclusion`.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [bankName].
     *
     * Unlike [bankName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bank_name") @ExcludeMissing fun _bankName(): JsonField<String> = bankName

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [entityId].
     *
     * Unlike [entityId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("entity_id") @ExcludeMissing fun _entityId(): JsonField<String> = entityId

    /**
     * Returns the raw JSON value of [excludedAt].
     *
     * Unlike [excludedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("excluded_at")
    @ExcludeMissing
    fun _excludedAt(): JsonField<OffsetDateTime> = excludedAt

    /**
     * Returns the raw JSON value of [fdicCertificateNumber].
     *
     * Unlike [fdicCertificateNumber], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("fdic_certificate_number")
    @ExcludeMissing
    fun _fdicCertificateNumber(): JsonField<String> = fdicCertificateNumber

    /**
     * Returns the raw JSON value of [idempotencyKey].
     *
     * Unlike [idempotencyKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idempotency_key")
    @ExcludeMissing
    fun _idempotencyKey(): JsonField<String> = idempotencyKey

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [submittedAt].
     *
     * Unlike [submittedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("submitted_at")
    @ExcludeMissing
    fun _submittedAt(): JsonField<OffsetDateTime> = submittedAt

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

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

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The name of the excluded institution. */
        fun bankName(bankName: String?) = bankName(JsonField.ofNullable(bankName))

        /** Alias for calling [Builder.bankName] with `bankName.orElse(null)`. */
        fun bankName(bankName: Optional<String>) = bankName(bankName.getOrNull())

        /**
         * Sets [Builder.bankName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bankName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun bankName(bankName: JsonField<String>) = apply { this.bankName = bankName }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
         * exclusion was created.
         */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The entity for which this institution is excluded. */
        fun entityId(entityId: String) = entityId(JsonField.of(entityId))

        /**
         * Sets [Builder.entityId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.entityId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun entityId(entityId: JsonField<String>) = apply { this.entityId = entityId }

        /** When this was exclusion was confirmed by IntraFi. */
        fun excludedAt(excludedAt: OffsetDateTime?) = excludedAt(JsonField.ofNullable(excludedAt))

        /** Alias for calling [Builder.excludedAt] with `excludedAt.orElse(null)`. */
        fun excludedAt(excludedAt: Optional<OffsetDateTime>) = excludedAt(excludedAt.getOrNull())

        /**
         * Sets [Builder.excludedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.excludedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun excludedAt(excludedAt: JsonField<OffsetDateTime>) = apply {
            this.excludedAt = excludedAt
        }

        /** The Federal Deposit Insurance Corporation's certificate number for the institution. */
        fun fdicCertificateNumber(fdicCertificateNumber: String?) =
            fdicCertificateNumber(JsonField.ofNullable(fdicCertificateNumber))

        /**
         * Alias for calling [Builder.fdicCertificateNumber] with
         * `fdicCertificateNumber.orElse(null)`.
         */
        fun fdicCertificateNumber(fdicCertificateNumber: Optional<String>) =
            fdicCertificateNumber(fdicCertificateNumber.getOrNull())

        /**
         * Sets [Builder.fdicCertificateNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fdicCertificateNumber] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
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

        /** Alias for calling [Builder.idempotencyKey] with `idempotencyKey.orElse(null)`. */
        fun idempotencyKey(idempotencyKey: Optional<String>) =
            idempotencyKey(idempotencyKey.getOrNull())

        /**
         * Sets [Builder.idempotencyKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idempotencyKey] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun idempotencyKey(idempotencyKey: JsonField<String>) = apply {
            this.idempotencyKey = idempotencyKey
        }

        /** The status of the exclusion request. */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** When this was exclusion was submitted to IntraFi by Increase. */
        fun submittedAt(submittedAt: OffsetDateTime?) =
            submittedAt(JsonField.ofNullable(submittedAt))

        /** Alias for calling [Builder.submittedAt] with `submittedAt.orElse(null)`. */
        fun submittedAt(submittedAt: Optional<OffsetDateTime>) =
            submittedAt(submittedAt.getOrNull())

        /**
         * Sets [Builder.submittedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.submittedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun submittedAt(submittedAt: JsonField<OffsetDateTime>) = apply {
            this.submittedAt = submittedAt
        }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `intrafi_exclusion`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
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

        /**
         * Returns an immutable instance of [IntrafiExclusion].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
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
         *
         * @throws IllegalStateException if any required field is unset.
         */
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
                additionalProperties.toMutableMap(),
            )
    }

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
        status().validate()
        submittedAt()
        type().validate()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: IncreaseInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (bankName.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (entityId.asKnown().isPresent) 1 else 0) +
            (if (excludedAt.asKnown().isPresent) 1 else 0) +
            (if (fdicCertificateNumber.asKnown().isPresent) 1 else 0) +
            (if (idempotencyKey.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (submittedAt.asKnown().isPresent) 1 else 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0)

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

            /** The exclusion wasn't eligible to be added to the IntraFi network. */
            @JvmField val INELIGIBLE = of("ineligible")

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
            /** The exclusion wasn't eligible to be added to the IntraFi network. */
            INELIGIBLE,
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
            /** The exclusion wasn't eligible to be added to the IntraFi network. */
            INELIGIBLE,
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
                INELIGIBLE -> Value.INELIGIBLE
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
                INELIGIBLE -> Known.INELIGIBLE
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

        private var validated: Boolean = false

        fun validate(): Status = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: IncreaseInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Status && value == other.value
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

        private var validated: Boolean = false

        fun validate(): Type = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: IncreaseInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Type && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is IntrafiExclusion &&
            id == other.id &&
            bankName == other.bankName &&
            createdAt == other.createdAt &&
            entityId == other.entityId &&
            excludedAt == other.excludedAt &&
            fdicCertificateNumber == other.fdicCertificateNumber &&
            idempotencyKey == other.idempotencyKey &&
            status == other.status &&
            submittedAt == other.submittedAt &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            bankName,
            createdAt,
            entityId,
            excludedAt,
            fdicCertificateNumber,
            idempotencyKey,
            status,
            submittedAt,
            type,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "IntrafiExclusion{id=$id, bankName=$bankName, createdAt=$createdAt, entityId=$entityId, excludedAt=$excludedAt, fdicCertificateNumber=$fdicCertificateNumber, idempotencyKey=$idempotencyKey, status=$status, submittedAt=$submittedAt, type=$type, additionalProperties=$additionalProperties}"
}
