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
import com.increase.api.core.toImmutable
import com.increase.api.errors.IncreaseInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

/** Inbound Mail Items represent pieces of physical mail delivered to a Lockbox. */
@JsonDeserialize(builder = InboundMailItem.Builder::class)
@NoAutoDetect
class InboundMailItem
private constructor(
    private val createdAt: JsonField<OffsetDateTime>,
    private val fileId: JsonField<String>,
    private val id: JsonField<String>,
    private val lockboxId: JsonField<String>,
    private val recipientName: JsonField<String>,
    private val rejectionReason: JsonField<RejectionReason>,
    private val status: JsonField<Status>,
    private val type: JsonField<Type>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Inbound Mail Item
     * was created.
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** The identifier for the File containing the scanned contents of the mail item. */
    fun fileId(): String = fileId.getRequired("file_id")

    /** The Inbound Mail Item identifier. */
    fun id(): String = id.getRequired("id")

    /**
     * The identifier for the Lockbox that received this mail item. For mail items that could not be
     * processed due to an invalid address, this will be null.
     */
    fun lockboxId(): Optional<String> = Optional.ofNullable(lockboxId.getNullable("lockbox_id"))

    /** The recipient name as written on the mail item. */
    fun recipientName(): Optional<String> =
        Optional.ofNullable(recipientName.getNullable("recipient_name"))

    /** If the mail item has been rejected, why it was rejected. */
    fun rejectionReason(): Optional<RejectionReason> =
        Optional.ofNullable(rejectionReason.getNullable("rejection_reason"))

    /** If the mail item has been processed. */
    fun status(): Status = status.getRequired("status")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `inbound_mail_item`.
     */
    fun type(): Type = type.getRequired("type")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Inbound Mail Item
     * was created.
     */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    /** The identifier for the File containing the scanned contents of the mail item. */
    @JsonProperty("file_id") @ExcludeMissing fun _fileId() = fileId

    /** The Inbound Mail Item identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /**
     * The identifier for the Lockbox that received this mail item. For mail items that could not be
     * processed due to an invalid address, this will be null.
     */
    @JsonProperty("lockbox_id") @ExcludeMissing fun _lockboxId() = lockboxId

    /** The recipient name as written on the mail item. */
    @JsonProperty("recipient_name") @ExcludeMissing fun _recipientName() = recipientName

    /** If the mail item has been rejected, why it was rejected. */
    @JsonProperty("rejection_reason") @ExcludeMissing fun _rejectionReason() = rejectionReason

    /** If the mail item has been processed. */
    @JsonProperty("status") @ExcludeMissing fun _status() = status

    /**
     * A constant representing the object's type. For this resource it will always be
     * `inbound_mail_item`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): InboundMailItem = apply {
        if (!validated) {
            createdAt()
            fileId()
            id()
            lockboxId()
            recipientName()
            rejectionReason()
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

        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var fileId: JsonField<String> = JsonMissing.of()
        private var id: JsonField<String> = JsonMissing.of()
        private var lockboxId: JsonField<String> = JsonMissing.of()
        private var recipientName: JsonField<String> = JsonMissing.of()
        private var rejectionReason: JsonField<RejectionReason> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(inboundMailItem: InboundMailItem) = apply {
            this.createdAt = inboundMailItem.createdAt
            this.fileId = inboundMailItem.fileId
            this.id = inboundMailItem.id
            this.lockboxId = inboundMailItem.lockboxId
            this.recipientName = inboundMailItem.recipientName
            this.rejectionReason = inboundMailItem.rejectionReason
            this.status = inboundMailItem.status
            this.type = inboundMailItem.type
            additionalProperties(inboundMailItem.additionalProperties)
        }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Inbound Mail
         * Item was created.
         */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Inbound Mail
         * Item was created.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The identifier for the File containing the scanned contents of the mail item. */
        fun fileId(fileId: String) = fileId(JsonField.of(fileId))

        /** The identifier for the File containing the scanned contents of the mail item. */
        @JsonProperty("file_id")
        @ExcludeMissing
        fun fileId(fileId: JsonField<String>) = apply { this.fileId = fileId }

        /** The Inbound Mail Item identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The Inbound Mail Item identifier. */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * The identifier for the Lockbox that received this mail item. For mail items that could
         * not be processed due to an invalid address, this will be null.
         */
        fun lockboxId(lockboxId: String) = lockboxId(JsonField.of(lockboxId))

        /**
         * The identifier for the Lockbox that received this mail item. For mail items that could
         * not be processed due to an invalid address, this will be null.
         */
        @JsonProperty("lockbox_id")
        @ExcludeMissing
        fun lockboxId(lockboxId: JsonField<String>) = apply { this.lockboxId = lockboxId }

        /** The recipient name as written on the mail item. */
        fun recipientName(recipientName: String) = recipientName(JsonField.of(recipientName))

        /** The recipient name as written on the mail item. */
        @JsonProperty("recipient_name")
        @ExcludeMissing
        fun recipientName(recipientName: JsonField<String>) = apply {
            this.recipientName = recipientName
        }

        /** If the mail item has been rejected, why it was rejected. */
        fun rejectionReason(rejectionReason: RejectionReason) =
            rejectionReason(JsonField.of(rejectionReason))

        /** If the mail item has been rejected, why it was rejected. */
        @JsonProperty("rejection_reason")
        @ExcludeMissing
        fun rejectionReason(rejectionReason: JsonField<RejectionReason>) = apply {
            this.rejectionReason = rejectionReason
        }

        /** If the mail item has been processed. */
        fun status(status: Status) = status(JsonField.of(status))

        /** If the mail item has been processed. */
        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `inbound_mail_item`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be
         * `inbound_mail_item`.
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

        fun build(): InboundMailItem =
            InboundMailItem(
                createdAt,
                fileId,
                id,
                lockboxId,
                recipientName,
                rejectionReason,
                status,
                type,
                additionalProperties.toImmutable(),
            )
    }

    class RejectionReason
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is RejectionReason && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val NO_MATCHING_LOCKBOX = RejectionReason(JsonField.of("no_matching_lockbox"))

            @JvmField val NO_CHECK = RejectionReason(JsonField.of("no_check"))

            @JvmField val LOCKBOX_NOT_ACTIVE = RejectionReason(JsonField.of("lockbox_not_active"))

            @JvmStatic fun of(value: String) = RejectionReason(JsonField.of(value))
        }

        enum class Known {
            NO_MATCHING_LOCKBOX,
            NO_CHECK,
            LOCKBOX_NOT_ACTIVE,
        }

        enum class Value {
            NO_MATCHING_LOCKBOX,
            NO_CHECK,
            LOCKBOX_NOT_ACTIVE,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                NO_MATCHING_LOCKBOX -> Value.NO_MATCHING_LOCKBOX
                NO_CHECK -> Value.NO_CHECK
                LOCKBOX_NOT_ACTIVE -> Value.LOCKBOX_NOT_ACTIVE
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                NO_MATCHING_LOCKBOX -> Known.NO_MATCHING_LOCKBOX
                NO_CHECK -> Known.NO_CHECK
                LOCKBOX_NOT_ACTIVE -> Known.LOCKBOX_NOT_ACTIVE
                else -> throw IncreaseInvalidDataException("Unknown RejectionReason: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
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

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val PENDING = Status(JsonField.of("pending"))

            @JvmField val PROCESSED = Status(JsonField.of("processed"))

            @JvmField val REJECTED = Status(JsonField.of("rejected"))

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            PENDING,
            PROCESSED,
            REJECTED,
        }

        enum class Value {
            PENDING,
            PROCESSED,
            REJECTED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                PENDING -> Value.PENDING
                PROCESSED -> Value.PROCESSED
                REJECTED -> Value.REJECTED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                PENDING -> Known.PENDING
                PROCESSED -> Known.PROCESSED
                REJECTED -> Known.REJECTED
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

            return /* spotless:off */ other is Type && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val INBOUND_MAIL_ITEM = Type(JsonField.of("inbound_mail_item"))

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            INBOUND_MAIL_ITEM,
        }

        enum class Value {
            INBOUND_MAIL_ITEM,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                INBOUND_MAIL_ITEM -> Value.INBOUND_MAIL_ITEM
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                INBOUND_MAIL_ITEM -> Known.INBOUND_MAIL_ITEM
                else -> throw IncreaseInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InboundMailItem && createdAt == other.createdAt && fileId == other.fileId && id == other.id && lockboxId == other.lockboxId && recipientName == other.recipientName && rejectionReason == other.rejectionReason && status == other.status && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(createdAt, fileId, id, lockboxId, recipientName, rejectionReason, status, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InboundMailItem{createdAt=$createdAt, fileId=$fileId, id=$id, lockboxId=$lockboxId, recipientName=$recipientName, rejectionReason=$rejectionReason, status=$status, type=$type, additionalProperties=$additionalProperties}"
}
