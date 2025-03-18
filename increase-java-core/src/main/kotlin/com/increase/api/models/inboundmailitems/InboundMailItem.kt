// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.inboundmailitems

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

/** Inbound Mail Items represent pieces of physical mail delivered to a Lockbox. */
@NoAutoDetect
class InboundMailItem
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("file_id")
    @ExcludeMissing
    private val fileId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("lockbox_id")
    @ExcludeMissing
    private val lockboxId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("recipient_name")
    @ExcludeMissing
    private val recipientName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("rejection_reason")
    @ExcludeMissing
    private val rejectionReason: JsonField<RejectionReason> = JsonMissing.of(),
    @JsonProperty("status")
    @ExcludeMissing
    private val status: JsonField<Status> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * The Inbound Mail Item identifier.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Inbound Mail Item
     * was created.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * The identifier for the File containing the scanned contents of the mail item.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun fileId(): String = fileId.getRequired("file_id")

    /**
     * The identifier for the Lockbox that received this mail item. For mail items that could not be
     * processed due to an invalid address, this will be null.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lockboxId(): Optional<String> = Optional.ofNullable(lockboxId.getNullable("lockbox_id"))

    /**
     * The recipient name as written on the mail item.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recipientName(): Optional<String> =
        Optional.ofNullable(recipientName.getNullable("recipient_name"))

    /**
     * If the mail item has been rejected, why it was rejected.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rejectionReason(): Optional<RejectionReason> =
        Optional.ofNullable(rejectionReason.getNullable("rejection_reason"))

    /**
     * If the mail item has been processed.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `inbound_mail_item`.
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
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [fileId].
     *
     * Unlike [fileId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("file_id") @ExcludeMissing fun _fileId(): JsonField<String> = fileId

    /**
     * Returns the raw JSON value of [lockboxId].
     *
     * Unlike [lockboxId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lockbox_id") @ExcludeMissing fun _lockboxId(): JsonField<String> = lockboxId

    /**
     * Returns the raw JSON value of [recipientName].
     *
     * Unlike [recipientName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("recipient_name")
    @ExcludeMissing
    fun _recipientName(): JsonField<String> = recipientName

    /**
     * Returns the raw JSON value of [rejectionReason].
     *
     * Unlike [rejectionReason], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rejection_reason")
    @ExcludeMissing
    fun _rejectionReason(): JsonField<RejectionReason> = rejectionReason

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

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): InboundMailItem = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        fileId()
        lockboxId()
        recipientName()
        rejectionReason()
        status()
        type()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [InboundMailItem].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .fileId()
         * .lockboxId()
         * .recipientName()
         * .rejectionReason()
         * .status()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InboundMailItem]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var fileId: JsonField<String>? = null
        private var lockboxId: JsonField<String>? = null
        private var recipientName: JsonField<String>? = null
        private var rejectionReason: JsonField<RejectionReason>? = null
        private var status: JsonField<Status>? = null
        private var type: JsonField<Type>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(inboundMailItem: InboundMailItem) = apply {
            id = inboundMailItem.id
            createdAt = inboundMailItem.createdAt
            fileId = inboundMailItem.fileId
            lockboxId = inboundMailItem.lockboxId
            recipientName = inboundMailItem.recipientName
            rejectionReason = inboundMailItem.rejectionReason
            status = inboundMailItem.status
            type = inboundMailItem.type
            additionalProperties = inboundMailItem.additionalProperties.toMutableMap()
        }

        /** The Inbound Mail Item identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Inbound Mail
         * Item was created.
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

        /** The identifier for the File containing the scanned contents of the mail item. */
        fun fileId(fileId: String) = fileId(JsonField.of(fileId))

        /**
         * Sets [Builder.fileId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fileId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fileId(fileId: JsonField<String>) = apply { this.fileId = fileId }

        /**
         * The identifier for the Lockbox that received this mail item. For mail items that could
         * not be processed due to an invalid address, this will be null.
         */
        fun lockboxId(lockboxId: String?) = lockboxId(JsonField.ofNullable(lockboxId))

        /** Alias for calling [Builder.lockboxId] with `lockboxId.orElse(null)`. */
        fun lockboxId(lockboxId: Optional<String>) = lockboxId(lockboxId.getOrNull())

        /**
         * Sets [Builder.lockboxId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lockboxId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun lockboxId(lockboxId: JsonField<String>) = apply { this.lockboxId = lockboxId }

        /** The recipient name as written on the mail item. */
        fun recipientName(recipientName: String?) =
            recipientName(JsonField.ofNullable(recipientName))

        /** Alias for calling [Builder.recipientName] with `recipientName.orElse(null)`. */
        fun recipientName(recipientName: Optional<String>) =
            recipientName(recipientName.getOrNull())

        /**
         * Sets [Builder.recipientName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recipientName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun recipientName(recipientName: JsonField<String>) = apply {
            this.recipientName = recipientName
        }

        /** If the mail item has been rejected, why it was rejected. */
        fun rejectionReason(rejectionReason: RejectionReason?) =
            rejectionReason(JsonField.ofNullable(rejectionReason))

        /** Alias for calling [Builder.rejectionReason] with `rejectionReason.orElse(null)`. */
        fun rejectionReason(rejectionReason: Optional<RejectionReason>) =
            rejectionReason(rejectionReason.getOrNull())

        /**
         * Sets [Builder.rejectionReason] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rejectionReason] with a well-typed [RejectionReason]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun rejectionReason(rejectionReason: JsonField<RejectionReason>) = apply {
            this.rejectionReason = rejectionReason
        }

        /** If the mail item has been processed. */
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
         * `inbound_mail_item`.
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
         * Returns an immutable instance of [InboundMailItem].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .fileId()
         * .lockboxId()
         * .recipientName()
         * .rejectionReason()
         * .status()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): InboundMailItem =
            InboundMailItem(
                checkRequired("id", id),
                checkRequired("createdAt", createdAt),
                checkRequired("fileId", fileId),
                checkRequired("lockboxId", lockboxId),
                checkRequired("recipientName", recipientName),
                checkRequired("rejectionReason", rejectionReason),
                checkRequired("status", status),
                checkRequired("type", type),
                additionalProperties.toImmutable(),
            )
    }

    /** If the mail item has been rejected, why it was rejected. */
    class RejectionReason @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            /** The mail item does not match any lockbox. */
            @JvmField val NO_MATCHING_LOCKBOX = of("no_matching_lockbox")

            /** The mail item does not contain a check. */
            @JvmField val NO_CHECK = of("no_check")

            /** The Lockbox or its associated Account is not active. */
            @JvmField val LOCKBOX_NOT_ACTIVE = of("lockbox_not_active")

            @JvmStatic fun of(value: String) = RejectionReason(JsonField.of(value))
        }

        /** An enum containing [RejectionReason]'s known values. */
        enum class Known {
            /** The mail item does not match any lockbox. */
            NO_MATCHING_LOCKBOX,
            /** The mail item does not contain a check. */
            NO_CHECK,
            /** The Lockbox or its associated Account is not active. */
            LOCKBOX_NOT_ACTIVE,
        }

        /**
         * An enum containing [RejectionReason]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [RejectionReason] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            /** The mail item does not match any lockbox. */
            NO_MATCHING_LOCKBOX,
            /** The mail item does not contain a check. */
            NO_CHECK,
            /** The Lockbox or its associated Account is not active. */
            LOCKBOX_NOT_ACTIVE,
            /**
             * An enum member indicating that [RejectionReason] was instantiated with an unknown
             * value.
             */
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
                NO_MATCHING_LOCKBOX -> Value.NO_MATCHING_LOCKBOX
                NO_CHECK -> Value.NO_CHECK
                LOCKBOX_NOT_ACTIVE -> Value.LOCKBOX_NOT_ACTIVE
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
                NO_MATCHING_LOCKBOX -> Known.NO_MATCHING_LOCKBOX
                NO_CHECK -> Known.NO_CHECK
                LOCKBOX_NOT_ACTIVE -> Known.LOCKBOX_NOT_ACTIVE
                else -> throw IncreaseInvalidDataException("Unknown RejectionReason: $value")
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

            return /* spotless:off */ other is RejectionReason && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** If the mail item has been processed. */
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

            /** The mail item is pending processing. */
            @JvmField val PENDING = of("pending")

            /** The mail item has been processed. */
            @JvmField val PROCESSED = of("processed")

            /** The mail item has been rejected. */
            @JvmField val REJECTED = of("rejected")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            /** The mail item is pending processing. */
            PENDING,
            /** The mail item has been processed. */
            PROCESSED,
            /** The mail item has been rejected. */
            REJECTED,
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
            /** The mail item is pending processing. */
            PENDING,
            /** The mail item has been processed. */
            PROCESSED,
            /** The mail item has been rejected. */
            REJECTED,
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
                PROCESSED -> Value.PROCESSED
                REJECTED -> Value.REJECTED
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
                PROCESSED -> Known.PROCESSED
                REJECTED -> Known.REJECTED
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
     * `inbound_mail_item`.
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

            @JvmField val INBOUND_MAIL_ITEM = of("inbound_mail_item")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            INBOUND_MAIL_ITEM
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
            INBOUND_MAIL_ITEM,
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
                INBOUND_MAIL_ITEM -> Value.INBOUND_MAIL_ITEM
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
                INBOUND_MAIL_ITEM -> Known.INBOUND_MAIL_ITEM
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

        return /* spotless:off */ other is InboundMailItem && id == other.id && createdAt == other.createdAt && fileId == other.fileId && lockboxId == other.lockboxId && recipientName == other.recipientName && rejectionReason == other.rejectionReason && status == other.status && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, createdAt, fileId, lockboxId, recipientName, rejectionReason, status, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InboundMailItem{id=$id, createdAt=$createdAt, fileId=$fileId, lockboxId=$lockboxId, recipientName=$recipientName, rejectionReason=$rejectionReason, status=$status, type=$type, additionalProperties=$additionalProperties}"
}
