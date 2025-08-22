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
import com.increase.api.core.checkKnown
import com.increase.api.core.checkRequired
import com.increase.api.core.toImmutable
import com.increase.api.errors.IncreaseInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Inbound Mail Items represent pieces of physical mail delivered to a Lockbox. */
class InboundMailItem
private constructor(
    private val id: JsonField<String>,
    private val checks: JsonField<List<Check>>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val fileId: JsonField<String>,
    private val lockboxId: JsonField<String>,
    private val recipientName: JsonField<String>,
    private val rejectionReason: JsonField<RejectionReason>,
    private val status: JsonField<Status>,
    private val type: JsonField<Type>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("checks") @ExcludeMissing checks: JsonField<List<Check>> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("file_id") @ExcludeMissing fileId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("lockbox_id") @ExcludeMissing lockboxId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("recipient_name")
        @ExcludeMissing
        recipientName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("rejection_reason")
        @ExcludeMissing
        rejectionReason: JsonField<RejectionReason> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
    ) : this(
        id,
        checks,
        createdAt,
        fileId,
        lockboxId,
        recipientName,
        rejectionReason,
        status,
        type,
        mutableMapOf(),
    )

    /**
     * The Inbound Mail Item identifier.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The checks in the mail item.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun checks(): List<Check> = checks.getRequired("checks")

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
    fun lockboxId(): Optional<String> = lockboxId.getOptional("lockbox_id")

    /**
     * The recipient name as written on the mail item.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recipientName(): Optional<String> = recipientName.getOptional("recipient_name")

    /**
     * If the mail item has been rejected, why it was rejected.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rejectionReason(): Optional<RejectionReason> =
        rejectionReason.getOptional("rejection_reason")

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
     * Returns the raw JSON value of [checks].
     *
     * Unlike [checks], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("checks") @ExcludeMissing fun _checks(): JsonField<List<Check>> = checks

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
         * Returns a mutable builder for constructing an instance of [InboundMailItem].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .checks()
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
        private var checks: JsonField<MutableList<Check>>? = null
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
            checks = inboundMailItem.checks.map { it.toMutableList() }
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

        /** The checks in the mail item. */
        fun checks(checks: List<Check>) = checks(JsonField.of(checks))

        /**
         * Sets [Builder.checks] to an arbitrary JSON value.
         *
         * You should usually call [Builder.checks] with a well-typed `List<Check>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun checks(checks: JsonField<List<Check>>) = apply {
            this.checks = checks.map { it.toMutableList() }
        }

        /**
         * Adds a single [Check] to [checks].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCheck(check: Check) = apply {
            checks =
                (checks ?: JsonField.of(mutableListOf())).also {
                    checkKnown("checks", it).add(check)
                }
        }

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
            putAlladditional_properties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAlladditional_properties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAlladditional_properties(keys: Set<String>) = apply {
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
         * .checks()
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
                checkRequired("checks", checks).map { it.toImmutable() },
                checkRequired("createdAt", createdAt),
                checkRequired("fileId", fileId),
                checkRequired("lockboxId", lockboxId),
                checkRequired("recipientName", recipientName),
                checkRequired("rejectionReason", rejectionReason),
                checkRequired("status", status),
                checkRequired("type", type),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): InboundMailItem = apply {
        if (validated) {
            return@apply
        }

        id()
        checks().forEach { it.validate() }
        createdAt()
        fileId()
        lockboxId()
        recipientName()
        rejectionReason().ifPresent { it.validate() }
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
            (checks.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (fileId.asKnown().isPresent) 1 else 0) +
            (if (lockboxId.asKnown().isPresent) 1 else 0) +
            (if (recipientName.asKnown().isPresent) 1 else 0) +
            (rejectionReason.asKnown().getOrNull()?.validity() ?: 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0)

    /** Inbound Mail Item Checks represent the checks in an Inbound Mail Item. */
    class Check
    private constructor(
        private val amount: JsonField<Long>,
        private val backFileId: JsonField<String>,
        private val frontFileId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("back_file_id")
            @ExcludeMissing
            backFileId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("front_file_id")
            @ExcludeMissing
            frontFileId: JsonField<String> = JsonMissing.of(),
        ) : this(amount, backFileId, frontFileId, mutableMapOf())

        /**
         * The amount of the check.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun amount(): Long = amount.getRequired("amount")

        /**
         * The identifier for the File containing the back of the check.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun backFileId(): Optional<String> = backFileId.getOptional("back_file_id")

        /**
         * The identifier for the File containing the front of the check.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun frontFileId(): Optional<String> = frontFileId.getOptional("front_file_id")

        /**
         * Returns the raw JSON value of [amount].
         *
         * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

        /**
         * Returns the raw JSON value of [backFileId].
         *
         * Unlike [backFileId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("back_file_id")
        @ExcludeMissing
        fun _backFileId(): JsonField<String> = backFileId

        /**
         * Returns the raw JSON value of [frontFileId].
         *
         * Unlike [frontFileId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("front_file_id")
        @ExcludeMissing
        fun _frontFileId(): JsonField<String> = frontFileId

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
             * Returns a mutable builder for constructing an instance of [Check].
             *
             * The following fields are required:
             * ```java
             * .amount()
             * .backFileId()
             * .frontFileId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Check]. */
        class Builder internal constructor() {

            private var amount: JsonField<Long>? = null
            private var backFileId: JsonField<String>? = null
            private var frontFileId: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(check: Check) = apply {
                amount = check.amount
                backFileId = check.backFileId
                frontFileId = check.frontFileId
                additionalProperties = check.additionalProperties.toMutableMap()
            }

            /** The amount of the check. */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            /** The identifier for the File containing the back of the check. */
            fun backFileId(backFileId: String?) = backFileId(JsonField.ofNullable(backFileId))

            /** Alias for calling [Builder.backFileId] with `backFileId.orElse(null)`. */
            fun backFileId(backFileId: Optional<String>) = backFileId(backFileId.getOrNull())

            /**
             * Sets [Builder.backFileId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.backFileId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun backFileId(backFileId: JsonField<String>) = apply { this.backFileId = backFileId }

            /** The identifier for the File containing the front of the check. */
            fun frontFileId(frontFileId: String?) = frontFileId(JsonField.ofNullable(frontFileId))

            /** Alias for calling [Builder.frontFileId] with `frontFileId.orElse(null)`. */
            fun frontFileId(frontFileId: Optional<String>) = frontFileId(frontFileId.getOrNull())

            /**
             * Sets [Builder.frontFileId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.frontFileId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun frontFileId(frontFileId: JsonField<String>) = apply {
                this.frontFileId = frontFileId
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAlladditional_properties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAlladditional_properties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAlladditional_properties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Check].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .amount()
             * .backFileId()
             * .frontFileId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Check =
                Check(
                    checkRequired("amount", amount),
                    checkRequired("backFileId", backFileId),
                    checkRequired("frontFileId", frontFileId),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Check = apply {
            if (validated) {
                return@apply
            }

            amount()
            backFileId()
            frontFileId()
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
        @JvmSynthetic
        internal fun validity(): Int =
            (if (amount.asKnown().isPresent) 1 else 0) +
                (if (backFileId.asKnown().isPresent) 1 else 0) +
                (if (frontFileId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Check &&
                amount == other.amount &&
                backFileId == other.backFileId &&
                frontFileId == other.frontFileId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(amount, backFileId, frontFileId, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Check{amount=$amount, backFileId=$backFileId, frontFileId=$frontFileId, additionalProperties=$additionalProperties}"
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

        private var validated: Boolean = false

        fun validate(): RejectionReason = apply {
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

            return other is RejectionReason && value == other.value
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

        return other is InboundMailItem &&
            id == other.id &&
            checks == other.checks &&
            createdAt == other.createdAt &&
            fileId == other.fileId &&
            lockboxId == other.lockboxId &&
            recipientName == other.recipientName &&
            rejectionReason == other.rejectionReason &&
            status == other.status &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            checks,
            createdAt,
            fileId,
            lockboxId,
            recipientName,
            rejectionReason,
            status,
            type,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InboundMailItem{id=$id, checks=$checks, createdAt=$createdAt, fileId=$fileId, lockboxId=$lockboxId, recipientName=$recipientName, rejectionReason=$rejectionReason, status=$status, type=$type, additionalProperties=$additionalProperties}"
}
