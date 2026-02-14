// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.physicalcardprofiles

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
 * This contains artwork and metadata relating to a Physical Card's appearance. For more
 * information, see our guide on
 * [physical card artwork](https://increase.com/documentation/card-art-physical-cards).
 */
class PhysicalCardProfile
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val backImageFileId: JsonField<String>,
    private val carrierImageFileId: JsonField<String>,
    private val contactPhone: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val creator: JsonField<Creator>,
    private val description: JsonField<String>,
    private val frontImageFileId: JsonField<String>,
    private val idempotencyKey: JsonField<String>,
    private val isDefault: JsonField<Boolean>,
    private val programId: JsonField<String>,
    private val status: JsonField<Status>,
    private val type: JsonField<Type>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("back_image_file_id")
        @ExcludeMissing
        backImageFileId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("carrier_image_file_id")
        @ExcludeMissing
        carrierImageFileId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("contact_phone")
        @ExcludeMissing
        contactPhone: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("creator") @ExcludeMissing creator: JsonField<Creator> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("front_image_file_id")
        @ExcludeMissing
        frontImageFileId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("idempotency_key")
        @ExcludeMissing
        idempotencyKey: JsonField<String> = JsonMissing.of(),
        @JsonProperty("is_default")
        @ExcludeMissing
        isDefault: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("program_id") @ExcludeMissing programId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
    ) : this(
        id,
        backImageFileId,
        carrierImageFileId,
        contactPhone,
        createdAt,
        creator,
        description,
        frontImageFileId,
        idempotencyKey,
        isDefault,
        programId,
        status,
        type,
        mutableMapOf(),
    )

    /**
     * The Card Profile identifier.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The identifier of the File containing the physical card's back image. This will be missing
     * until the image has been post-processed.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun backImageFileId(): Optional<String> = backImageFileId.getOptional("back_image_file_id")

    /**
     * The identifier of the File containing the physical card's carrier image. This will be missing
     * until the image has been post-processed.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun carrierImageFileId(): Optional<String> =
        carrierImageFileId.getOptional("carrier_image_file_id")

    /**
     * A phone number the user can contact to receive support for their card.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun contactPhone(): Optional<String> = contactPhone.getOptional("contact_phone")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the Physical
     * Card Profile was created.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * The creator of this Physical Card Profile.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun creator(): Creator = creator.getRequired("creator")

    /**
     * A description you can use to identify the Physical Card Profile.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun description(): String = description.getRequired("description")

    /**
     * The identifier of the File containing the physical card's front image. This will be missing
     * until the image has been post-processed.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun frontImageFileId(): Optional<String> = frontImageFileId.getOptional("front_image_file_id")

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
     * Whether this Physical Card Profile is the default for all cards in its Increase group.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isDefault(): Boolean = isDefault.getRequired("is_default")

    /**
     * The identifier for the Program this Physical Card Profile belongs to.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun programId(): String = programId.getRequired("program_id")

    /**
     * The status of the Physical Card Profile.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `physical_card_profile`.
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
     * Returns the raw JSON value of [backImageFileId].
     *
     * Unlike [backImageFileId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("back_image_file_id")
    @ExcludeMissing
    fun _backImageFileId(): JsonField<String> = backImageFileId

    /**
     * Returns the raw JSON value of [carrierImageFileId].
     *
     * Unlike [carrierImageFileId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("carrier_image_file_id")
    @ExcludeMissing
    fun _carrierImageFileId(): JsonField<String> = carrierImageFileId

    /**
     * Returns the raw JSON value of [contactPhone].
     *
     * Unlike [contactPhone], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("contact_phone")
    @ExcludeMissing
    fun _contactPhone(): JsonField<String> = contactPhone

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [creator].
     *
     * Unlike [creator], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("creator") @ExcludeMissing fun _creator(): JsonField<Creator> = creator

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [frontImageFileId].
     *
     * Unlike [frontImageFileId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("front_image_file_id")
    @ExcludeMissing
    fun _frontImageFileId(): JsonField<String> = frontImageFileId

    /**
     * Returns the raw JSON value of [idempotencyKey].
     *
     * Unlike [idempotencyKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idempotency_key")
    @ExcludeMissing
    fun _idempotencyKey(): JsonField<String> = idempotencyKey

    /**
     * Returns the raw JSON value of [isDefault].
     *
     * Unlike [isDefault], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("is_default") @ExcludeMissing fun _isDefault(): JsonField<Boolean> = isDefault

    /**
     * Returns the raw JSON value of [programId].
     *
     * Unlike [programId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("program_id") @ExcludeMissing fun _programId(): JsonField<String> = programId

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

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
         * Returns a mutable builder for constructing an instance of [PhysicalCardProfile].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .backImageFileId()
         * .carrierImageFileId()
         * .contactPhone()
         * .createdAt()
         * .creator()
         * .description()
         * .frontImageFileId()
         * .idempotencyKey()
         * .isDefault()
         * .programId()
         * .status()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PhysicalCardProfile]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var backImageFileId: JsonField<String>? = null
        private var carrierImageFileId: JsonField<String>? = null
        private var contactPhone: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var creator: JsonField<Creator>? = null
        private var description: JsonField<String>? = null
        private var frontImageFileId: JsonField<String>? = null
        private var idempotencyKey: JsonField<String>? = null
        private var isDefault: JsonField<Boolean>? = null
        private var programId: JsonField<String>? = null
        private var status: JsonField<Status>? = null
        private var type: JsonField<Type>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(physicalCardProfile: PhysicalCardProfile) = apply {
            id = physicalCardProfile.id
            backImageFileId = physicalCardProfile.backImageFileId
            carrierImageFileId = physicalCardProfile.carrierImageFileId
            contactPhone = physicalCardProfile.contactPhone
            createdAt = physicalCardProfile.createdAt
            creator = physicalCardProfile.creator
            description = physicalCardProfile.description
            frontImageFileId = physicalCardProfile.frontImageFileId
            idempotencyKey = physicalCardProfile.idempotencyKey
            isDefault = physicalCardProfile.isDefault
            programId = physicalCardProfile.programId
            status = physicalCardProfile.status
            type = physicalCardProfile.type
            additionalProperties = physicalCardProfile.additionalProperties.toMutableMap()
        }

        /** The Card Profile identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * The identifier of the File containing the physical card's back image. This will be
         * missing until the image has been post-processed.
         */
        fun backImageFileId(backImageFileId: String?) =
            backImageFileId(JsonField.ofNullable(backImageFileId))

        /** Alias for calling [Builder.backImageFileId] with `backImageFileId.orElse(null)`. */
        fun backImageFileId(backImageFileId: Optional<String>) =
            backImageFileId(backImageFileId.getOrNull())

        /**
         * Sets [Builder.backImageFileId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.backImageFileId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun backImageFileId(backImageFileId: JsonField<String>) = apply {
            this.backImageFileId = backImageFileId
        }

        /**
         * The identifier of the File containing the physical card's carrier image. This will be
         * missing until the image has been post-processed.
         */
        fun carrierImageFileId(carrierImageFileId: String?) =
            carrierImageFileId(JsonField.ofNullable(carrierImageFileId))

        /**
         * Alias for calling [Builder.carrierImageFileId] with `carrierImageFileId.orElse(null)`.
         */
        fun carrierImageFileId(carrierImageFileId: Optional<String>) =
            carrierImageFileId(carrierImageFileId.getOrNull())

        /**
         * Sets [Builder.carrierImageFileId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.carrierImageFileId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun carrierImageFileId(carrierImageFileId: JsonField<String>) = apply {
            this.carrierImageFileId = carrierImageFileId
        }

        /** A phone number the user can contact to receive support for their card. */
        fun contactPhone(contactPhone: String?) = contactPhone(JsonField.ofNullable(contactPhone))

        /** Alias for calling [Builder.contactPhone] with `contactPhone.orElse(null)`. */
        fun contactPhone(contactPhone: Optional<String>) = contactPhone(contactPhone.getOrNull())

        /**
         * Sets [Builder.contactPhone] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contactPhone] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun contactPhone(contactPhone: JsonField<String>) = apply {
            this.contactPhone = contactPhone
        }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
         * Physical Card Profile was created.
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

        /** The creator of this Physical Card Profile. */
        fun creator(creator: Creator) = creator(JsonField.of(creator))

        /**
         * Sets [Builder.creator] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creator] with a well-typed [Creator] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun creator(creator: JsonField<Creator>) = apply { this.creator = creator }

        /** A description you can use to identify the Physical Card Profile. */
        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /**
         * The identifier of the File containing the physical card's front image. This will be
         * missing until the image has been post-processed.
         */
        fun frontImageFileId(frontImageFileId: String?) =
            frontImageFileId(JsonField.ofNullable(frontImageFileId))

        /** Alias for calling [Builder.frontImageFileId] with `frontImageFileId.orElse(null)`. */
        fun frontImageFileId(frontImageFileId: Optional<String>) =
            frontImageFileId(frontImageFileId.getOrNull())

        /**
         * Sets [Builder.frontImageFileId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.frontImageFileId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun frontImageFileId(frontImageFileId: JsonField<String>) = apply {
            this.frontImageFileId = frontImageFileId
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

        /**
         * Whether this Physical Card Profile is the default for all cards in its Increase group.
         */
        fun isDefault(isDefault: Boolean) = isDefault(JsonField.of(isDefault))

        /**
         * Sets [Builder.isDefault] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isDefault] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isDefault(isDefault: JsonField<Boolean>) = apply { this.isDefault = isDefault }

        /** The identifier for the Program this Physical Card Profile belongs to. */
        fun programId(programId: String) = programId(JsonField.of(programId))

        /**
         * Sets [Builder.programId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.programId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun programId(programId: JsonField<String>) = apply { this.programId = programId }

        /** The status of the Physical Card Profile. */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `physical_card_profile`.
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
         * Returns an immutable instance of [PhysicalCardProfile].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .backImageFileId()
         * .carrierImageFileId()
         * .contactPhone()
         * .createdAt()
         * .creator()
         * .description()
         * .frontImageFileId()
         * .idempotencyKey()
         * .isDefault()
         * .programId()
         * .status()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PhysicalCardProfile =
            PhysicalCardProfile(
                checkRequired("id", id),
                checkRequired("backImageFileId", backImageFileId),
                checkRequired("carrierImageFileId", carrierImageFileId),
                checkRequired("contactPhone", contactPhone),
                checkRequired("createdAt", createdAt),
                checkRequired("creator", creator),
                checkRequired("description", description),
                checkRequired("frontImageFileId", frontImageFileId),
                checkRequired("idempotencyKey", idempotencyKey),
                checkRequired("isDefault", isDefault),
                checkRequired("programId", programId),
                checkRequired("status", status),
                checkRequired("type", type),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PhysicalCardProfile = apply {
        if (validated) {
            return@apply
        }

        id()
        backImageFileId()
        carrierImageFileId()
        contactPhone()
        createdAt()
        creator().validate()
        description()
        frontImageFileId()
        idempotencyKey()
        isDefault()
        programId()
        status().validate()
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
            (if (backImageFileId.asKnown().isPresent) 1 else 0) +
            (if (carrierImageFileId.asKnown().isPresent) 1 else 0) +
            (if (contactPhone.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (creator.asKnown().getOrNull()?.validity() ?: 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (frontImageFileId.asKnown().isPresent) 1 else 0) +
            (if (idempotencyKey.asKnown().isPresent) 1 else 0) +
            (if (isDefault.asKnown().isPresent) 1 else 0) +
            (if (programId.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0)

    /** The creator of this Physical Card Profile. */
    class Creator @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            /** This Physical Card Profile was created by Increase. */
            @JvmField val INCREASE = of("increase")

            /** This Physical Card Profile was created by you. */
            @JvmField val USER = of("user")

            @JvmStatic fun of(value: String) = Creator(JsonField.of(value))
        }

        /** An enum containing [Creator]'s known values. */
        enum class Known {
            /** This Physical Card Profile was created by Increase. */
            INCREASE,
            /** This Physical Card Profile was created by you. */
            USER,
        }

        /**
         * An enum containing [Creator]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Creator] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            /** This Physical Card Profile was created by Increase. */
            INCREASE,
            /** This Physical Card Profile was created by you. */
            USER,
            /** An enum member indicating that [Creator] was instantiated with an unknown value. */
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
                INCREASE -> Value.INCREASE
                USER -> Value.USER
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
                INCREASE -> Known.INCREASE
                USER -> Known.USER
                else -> throw IncreaseInvalidDataException("Unknown Creator: $value")
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

        fun validate(): Creator = apply {
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

            return other is Creator && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The status of the Physical Card Profile. */
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

            /** The Card Profile has not yet been processed by Increase. */
            @JvmField val PENDING_CREATING = of("pending_creating")

            /** The card profile is awaiting review by Increase. */
            @JvmField val PENDING_REVIEWING = of("pending_reviewing")

            /** There is an issue with the Physical Card Profile preventing it from use. */
            @JvmField val REJECTED = of("rejected")

            /** The card profile is awaiting submission to the fulfillment provider. */
            @JvmField val PENDING_SUBMITTING = of("pending_submitting")

            /**
             * The Physical Card Profile has been submitted to the fulfillment provider and is ready
             * to use.
             */
            @JvmField val ACTIVE = of("active")

            /** The Physical Card Profile has been archived. */
            @JvmField val ARCHIVED = of("archived")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            /** The Card Profile has not yet been processed by Increase. */
            PENDING_CREATING,
            /** The card profile is awaiting review by Increase. */
            PENDING_REVIEWING,
            /** There is an issue with the Physical Card Profile preventing it from use. */
            REJECTED,
            /** The card profile is awaiting submission to the fulfillment provider. */
            PENDING_SUBMITTING,
            /**
             * The Physical Card Profile has been submitted to the fulfillment provider and is ready
             * to use.
             */
            ACTIVE,
            /** The Physical Card Profile has been archived. */
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
            /** The Card Profile has not yet been processed by Increase. */
            PENDING_CREATING,
            /** The card profile is awaiting review by Increase. */
            PENDING_REVIEWING,
            /** There is an issue with the Physical Card Profile preventing it from use. */
            REJECTED,
            /** The card profile is awaiting submission to the fulfillment provider. */
            PENDING_SUBMITTING,
            /**
             * The Physical Card Profile has been submitted to the fulfillment provider and is ready
             * to use.
             */
            ACTIVE,
            /** The Physical Card Profile has been archived. */
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
                PENDING_CREATING -> Value.PENDING_CREATING
                PENDING_REVIEWING -> Value.PENDING_REVIEWING
                REJECTED -> Value.REJECTED
                PENDING_SUBMITTING -> Value.PENDING_SUBMITTING
                ACTIVE -> Value.ACTIVE
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
                PENDING_CREATING -> Known.PENDING_CREATING
                PENDING_REVIEWING -> Known.PENDING_REVIEWING
                REJECTED -> Known.REJECTED
                PENDING_SUBMITTING -> Known.PENDING_SUBMITTING
                ACTIVE -> Known.ACTIVE
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
     * `physical_card_profile`.
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

            @JvmField val PHYSICAL_CARD_PROFILE = of("physical_card_profile")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            PHYSICAL_CARD_PROFILE
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
            PHYSICAL_CARD_PROFILE,
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
                PHYSICAL_CARD_PROFILE -> Value.PHYSICAL_CARD_PROFILE
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
                PHYSICAL_CARD_PROFILE -> Known.PHYSICAL_CARD_PROFILE
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

        return other is PhysicalCardProfile &&
            id == other.id &&
            backImageFileId == other.backImageFileId &&
            carrierImageFileId == other.carrierImageFileId &&
            contactPhone == other.contactPhone &&
            createdAt == other.createdAt &&
            creator == other.creator &&
            description == other.description &&
            frontImageFileId == other.frontImageFileId &&
            idempotencyKey == other.idempotencyKey &&
            isDefault == other.isDefault &&
            programId == other.programId &&
            status == other.status &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            backImageFileId,
            carrierImageFileId,
            contactPhone,
            createdAt,
            creator,
            description,
            frontImageFileId,
            idempotencyKey,
            isDefault,
            programId,
            status,
            type,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PhysicalCardProfile{id=$id, backImageFileId=$backImageFileId, carrierImageFileId=$carrierImageFileId, contactPhone=$contactPhone, createdAt=$createdAt, creator=$creator, description=$description, frontImageFileId=$frontImageFileId, idempotencyKey=$idempotencyKey, isDefault=$isDefault, programId=$programId, status=$status, type=$type, additionalProperties=$additionalProperties}"
}
