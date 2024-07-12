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
    private val returnAddress: JsonField<ReturnAddress>,
    private val status: JsonField<Status>,
    private val type: JsonField<Type>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

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

    /** The return address as written on the mail item. */
    fun returnAddress(): Optional<ReturnAddress> =
        Optional.ofNullable(returnAddress.getNullable("return_address"))

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

    /** The return address as written on the mail item. */
    @JsonProperty("return_address") @ExcludeMissing fun _returnAddress() = returnAddress

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
            returnAddress().map { it.validate() }
            status()
            type()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InboundMailItem &&
            this.createdAt == other.createdAt &&
            this.fileId == other.fileId &&
            this.id == other.id &&
            this.lockboxId == other.lockboxId &&
            this.recipientName == other.recipientName &&
            this.rejectionReason == other.rejectionReason &&
            this.returnAddress == other.returnAddress &&
            this.status == other.status &&
            this.type == other.type &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    createdAt,
                    fileId,
                    id,
                    lockboxId,
                    recipientName,
                    rejectionReason,
                    returnAddress,
                    status,
                    type,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "InboundMailItem{createdAt=$createdAt, fileId=$fileId, id=$id, lockboxId=$lockboxId, recipientName=$recipientName, rejectionReason=$rejectionReason, returnAddress=$returnAddress, status=$status, type=$type, additionalProperties=$additionalProperties}"

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
        private var returnAddress: JsonField<ReturnAddress> = JsonMissing.of()
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
            this.returnAddress = inboundMailItem.returnAddress
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

        /** The return address as written on the mail item. */
        fun returnAddress(returnAddress: ReturnAddress) = returnAddress(JsonField.of(returnAddress))

        /** The return address as written on the mail item. */
        @JsonProperty("return_address")
        @ExcludeMissing
        fun returnAddress(returnAddress: JsonField<ReturnAddress>) = apply {
            this.returnAddress = returnAddress
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
                returnAddress,
                status,
                type,
                additionalProperties.toUnmodifiable(),
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

            return other is RejectionReason && this.value == other.value
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

    /** The return address as written on the mail item. */
    @JsonDeserialize(builder = ReturnAddress.Builder::class)
    @NoAutoDetect
    class ReturnAddress
    private constructor(
        private val name: JsonField<String>,
        private val line1: JsonField<String>,
        private val line2: JsonField<String>,
        private val city: JsonField<String>,
        private val state: JsonField<String>,
        private val postalCode: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /** The return address name. */
        fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

        /** The return address line1. */
        fun line1(): Optional<String> = Optional.ofNullable(line1.getNullable("line1"))

        /** The return address line2. */
        fun line2(): Optional<String> = Optional.ofNullable(line2.getNullable("line2"))

        /** The return address city. */
        fun city(): Optional<String> = Optional.ofNullable(city.getNullable("city"))

        /** The return address state. */
        fun state(): Optional<String> = Optional.ofNullable(state.getNullable("state"))

        /** The return address postal code. */
        fun postalCode(): Optional<String> =
            Optional.ofNullable(postalCode.getNullable("postal_code"))

        /** The return address name. */
        @JsonProperty("name") @ExcludeMissing fun _name() = name

        /** The return address line1. */
        @JsonProperty("line1") @ExcludeMissing fun _line1() = line1

        /** The return address line2. */
        @JsonProperty("line2") @ExcludeMissing fun _line2() = line2

        /** The return address city. */
        @JsonProperty("city") @ExcludeMissing fun _city() = city

        /** The return address state. */
        @JsonProperty("state") @ExcludeMissing fun _state() = state

        /** The return address postal code. */
        @JsonProperty("postal_code") @ExcludeMissing fun _postalCode() = postalCode

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): ReturnAddress = apply {
            if (!validated) {
                name()
                line1()
                line2()
                city()
                state()
                postalCode()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ReturnAddress &&
                this.name == other.name &&
                this.line1 == other.line1 &&
                this.line2 == other.line2 &&
                this.city == other.city &&
                this.state == other.state &&
                this.postalCode == other.postalCode &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        name,
                        line1,
                        line2,
                        city,
                        state,
                        postalCode,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "ReturnAddress{name=$name, line1=$line1, line2=$line2, city=$city, state=$state, postalCode=$postalCode, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var name: JsonField<String> = JsonMissing.of()
            private var line1: JsonField<String> = JsonMissing.of()
            private var line2: JsonField<String> = JsonMissing.of()
            private var city: JsonField<String> = JsonMissing.of()
            private var state: JsonField<String> = JsonMissing.of()
            private var postalCode: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(returnAddress: ReturnAddress) = apply {
                this.name = returnAddress.name
                this.line1 = returnAddress.line1
                this.line2 = returnAddress.line2
                this.city = returnAddress.city
                this.state = returnAddress.state
                this.postalCode = returnAddress.postalCode
                additionalProperties(returnAddress.additionalProperties)
            }

            /** The return address name. */
            fun name(name: String) = name(JsonField.of(name))

            /** The return address name. */
            @JsonProperty("name")
            @ExcludeMissing
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** The return address line1. */
            fun line1(line1: String) = line1(JsonField.of(line1))

            /** The return address line1. */
            @JsonProperty("line1")
            @ExcludeMissing
            fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

            /** The return address line2. */
            fun line2(line2: String) = line2(JsonField.of(line2))

            /** The return address line2. */
            @JsonProperty("line2")
            @ExcludeMissing
            fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

            /** The return address city. */
            fun city(city: String) = city(JsonField.of(city))

            /** The return address city. */
            @JsonProperty("city")
            @ExcludeMissing
            fun city(city: JsonField<String>) = apply { this.city = city }

            /** The return address state. */
            fun state(state: String) = state(JsonField.of(state))

            /** The return address state. */
            @JsonProperty("state")
            @ExcludeMissing
            fun state(state: JsonField<String>) = apply { this.state = state }

            /** The return address postal code. */
            fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

            /** The return address postal code. */
            @JsonProperty("postal_code")
            @ExcludeMissing
            fun postalCode(postalCode: JsonField<String>) = apply { this.postalCode = postalCode }

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

            fun build(): ReturnAddress =
                ReturnAddress(
                    name,
                    line1,
                    line2,
                    city,
                    state,
                    postalCode,
                    additionalProperties.toUnmodifiable(),
                )
        }
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

            return other is Type && this.value == other.value
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
}
