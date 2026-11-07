// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.checkbooks

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

/** Checkbooks are sets of blank checks that Increase prints and mails on your behalf. */
class Checkbook
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val accountNumberId: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val idempotencyKey: JsonField<String>,
    private val mailingAddress: JsonField<MailingAddress>,
    private val payer: JsonField<List<Payer>>,
    private val returnAddress: JsonField<ReturnAddress>,
    private val status: JsonField<Status>,
    private val style: JsonField<Style>,
    private val trackingUpdates: JsonField<List<TrackingUpdate>>,
    private val type: JsonField<Type>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("account_number_id")
        @ExcludeMissing
        accountNumberId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("idempotency_key")
        @ExcludeMissing
        idempotencyKey: JsonField<String> = JsonMissing.of(),
        @JsonProperty("mailing_address")
        @ExcludeMissing
        mailingAddress: JsonField<MailingAddress> = JsonMissing.of(),
        @JsonProperty("payer") @ExcludeMissing payer: JsonField<List<Payer>> = JsonMissing.of(),
        @JsonProperty("return_address")
        @ExcludeMissing
        returnAddress: JsonField<ReturnAddress> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("style") @ExcludeMissing style: JsonField<Style> = JsonMissing.of(),
        @JsonProperty("tracking_updates")
        @ExcludeMissing
        trackingUpdates: JsonField<List<TrackingUpdate>> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
    ) : this(
        id,
        accountNumberId,
        createdAt,
        idempotencyKey,
        mailingAddress,
        payer,
        returnAddress,
        status,
        style,
        trackingUpdates,
        type,
        mutableMapOf(),
    )

    /**
     * The Checkbook's identifier.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The identifier of the Account Number the Checkbook is attached to.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountNumberId(): String = accountNumberId.getRequired("account_number_id")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the Checkbook
     * was created.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

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
     * The destination address that the Checkbook will be mailed to.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun mailingAddress(): MailingAddress = mailingAddress.getRequired("mailing_address")

    /**
     * The payer information printed on the top-left corner of each check.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun payer(): List<Payer> = payer.getRequired("payer")

    /**
     * The address the Checkbook will return to if there is a delivery issue.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun returnAddress(): ReturnAddress = returnAddress.getRequired("return_address")

    /**
     * The lifecycle status of the Checkbook.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * The physical format of the Checkbook.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun style(): Style = style.getRequired("style")

    /**
     * Tracking updates relating to the Checkbook's delivery.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun trackingUpdates(): List<TrackingUpdate> = trackingUpdates.getRequired("tracking_updates")

    /**
     * A constant representing the object's type. For this resource it will always be `checkbook`.
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
     * Returns the raw JSON value of [accountNumberId].
     *
     * Unlike [accountNumberId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("account_number_id")
    @ExcludeMissing
    fun _accountNumberId(): JsonField<String> = accountNumberId

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [idempotencyKey].
     *
     * Unlike [idempotencyKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idempotency_key")
    @ExcludeMissing
    fun _idempotencyKey(): JsonField<String> = idempotencyKey

    /**
     * Returns the raw JSON value of [mailingAddress].
     *
     * Unlike [mailingAddress], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mailing_address")
    @ExcludeMissing
    fun _mailingAddress(): JsonField<MailingAddress> = mailingAddress

    /**
     * Returns the raw JSON value of [payer].
     *
     * Unlike [payer], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("payer") @ExcludeMissing fun _payer(): JsonField<List<Payer>> = payer

    /**
     * Returns the raw JSON value of [returnAddress].
     *
     * Unlike [returnAddress], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("return_address")
    @ExcludeMissing
    fun _returnAddress(): JsonField<ReturnAddress> = returnAddress

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [style].
     *
     * Unlike [style], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("style") @ExcludeMissing fun _style(): JsonField<Style> = style

    /**
     * Returns the raw JSON value of [trackingUpdates].
     *
     * Unlike [trackingUpdates], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tracking_updates")
    @ExcludeMissing
    fun _trackingUpdates(): JsonField<List<TrackingUpdate>> = trackingUpdates

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
         * Returns a mutable builder for constructing an instance of [Checkbook].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .accountNumberId()
         * .createdAt()
         * .idempotencyKey()
         * .mailingAddress()
         * .payer()
         * .returnAddress()
         * .status()
         * .style()
         * .trackingUpdates()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Checkbook]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var accountNumberId: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var idempotencyKey: JsonField<String>? = null
        private var mailingAddress: JsonField<MailingAddress>? = null
        private var payer: JsonField<MutableList<Payer>>? = null
        private var returnAddress: JsonField<ReturnAddress>? = null
        private var status: JsonField<Status>? = null
        private var style: JsonField<Style>? = null
        private var trackingUpdates: JsonField<MutableList<TrackingUpdate>>? = null
        private var type: JsonField<Type>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(checkbook: Checkbook) = apply {
            id = checkbook.id
            accountNumberId = checkbook.accountNumberId
            createdAt = checkbook.createdAt
            idempotencyKey = checkbook.idempotencyKey
            mailingAddress = checkbook.mailingAddress
            payer = checkbook.payer.map { it.toMutableList() }
            returnAddress = checkbook.returnAddress
            status = checkbook.status
            style = checkbook.style
            trackingUpdates = checkbook.trackingUpdates.map { it.toMutableList() }
            type = checkbook.type
            additionalProperties = checkbook.additionalProperties.toMutableMap()
        }

        /** The Checkbook's identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The identifier of the Account Number the Checkbook is attached to. */
        fun accountNumberId(accountNumberId: String) =
            accountNumberId(JsonField.of(accountNumberId))

        /**
         * Sets [Builder.accountNumberId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountNumberId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun accountNumberId(accountNumberId: JsonField<String>) = apply {
            this.accountNumberId = accountNumberId
        }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
         * Checkbook was created.
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

        /** The destination address that the Checkbook will be mailed to. */
        fun mailingAddress(mailingAddress: MailingAddress) =
            mailingAddress(JsonField.of(mailingAddress))

        /**
         * Sets [Builder.mailingAddress] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mailingAddress] with a well-typed [MailingAddress] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun mailingAddress(mailingAddress: JsonField<MailingAddress>) = apply {
            this.mailingAddress = mailingAddress
        }

        /** The payer information printed on the top-left corner of each check. */
        fun payer(payer: List<Payer>) = payer(JsonField.of(payer))

        /**
         * Sets [Builder.payer] to an arbitrary JSON value.
         *
         * You should usually call [Builder.payer] with a well-typed `List<Payer>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun payer(payer: JsonField<List<Payer>>) = apply {
            this.payer = payer.map { it.toMutableList() }
        }

        /**
         * Adds a single [Payer] to [Builder.payer].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPayer(payer: Payer) = apply {
            this.payer =
                (this.payer ?: JsonField.of(mutableListOf())).also {
                    checkKnown("payer", it).add(payer)
                }
        }

        /** The address the Checkbook will return to if there is a delivery issue. */
        fun returnAddress(returnAddress: ReturnAddress) = returnAddress(JsonField.of(returnAddress))

        /**
         * Sets [Builder.returnAddress] to an arbitrary JSON value.
         *
         * You should usually call [Builder.returnAddress] with a well-typed [ReturnAddress] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun returnAddress(returnAddress: JsonField<ReturnAddress>) = apply {
            this.returnAddress = returnAddress
        }

        /** The lifecycle status of the Checkbook. */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** The physical format of the Checkbook. */
        fun style(style: Style) = style(JsonField.of(style))

        /**
         * Sets [Builder.style] to an arbitrary JSON value.
         *
         * You should usually call [Builder.style] with a well-typed [Style] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun style(style: JsonField<Style>) = apply { this.style = style }

        /** Tracking updates relating to the Checkbook's delivery. */
        fun trackingUpdates(trackingUpdates: List<TrackingUpdate>) =
            trackingUpdates(JsonField.of(trackingUpdates))

        /**
         * Sets [Builder.trackingUpdates] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trackingUpdates] with a well-typed
         * `List<TrackingUpdate>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun trackingUpdates(trackingUpdates: JsonField<List<TrackingUpdate>>) = apply {
            this.trackingUpdates = trackingUpdates.map { it.toMutableList() }
        }

        /**
         * Adds a single [TrackingUpdate] to [trackingUpdates].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTrackingUpdate(trackingUpdate: TrackingUpdate) = apply {
            trackingUpdates =
                (trackingUpdates ?: JsonField.of(mutableListOf())).also {
                    checkKnown("trackingUpdates", it).add(trackingUpdate)
                }
        }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `checkbook`.
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
         * Returns an immutable instance of [Checkbook].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .accountNumberId()
         * .createdAt()
         * .idempotencyKey()
         * .mailingAddress()
         * .payer()
         * .returnAddress()
         * .status()
         * .style()
         * .trackingUpdates()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Checkbook =
            Checkbook(
                checkRequired("id", id),
                checkRequired("accountNumberId", accountNumberId),
                checkRequired("createdAt", createdAt),
                checkRequired("idempotencyKey", idempotencyKey),
                checkRequired("mailingAddress", mailingAddress),
                checkRequired("payer", payer).map { it.toImmutable() },
                checkRequired("returnAddress", returnAddress),
                checkRequired("status", status),
                checkRequired("style", style),
                checkRequired("trackingUpdates", trackingUpdates).map { it.toImmutable() },
                checkRequired("type", type),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws IncreaseInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): Checkbook = apply {
        if (validated) {
            return@apply
        }

        id()
        accountNumberId()
        createdAt()
        idempotencyKey()
        mailingAddress().validate()
        payer().forEach { it.validate() }
        returnAddress().validate()
        status().validate()
        style().validate()
        trackingUpdates().forEach { it.validate() }
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
            (if (accountNumberId.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (idempotencyKey.asKnown().isPresent) 1 else 0) +
            (mailingAddress.asKnown().getOrNull()?.validity() ?: 0) +
            (payer.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (returnAddress.asKnown().getOrNull()?.validity() ?: 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (style.asKnown().getOrNull()?.validity() ?: 0) +
            (trackingUpdates.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0)

    /** The destination address that the Checkbook will be mailed to. */
    class MailingAddress
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val city: JsonField<String>,
        private val line1: JsonField<String>,
        private val line2: JsonField<String>,
        private val name: JsonField<String>,
        private val postalCode: JsonField<String>,
        private val state: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("city") @ExcludeMissing city: JsonField<String> = JsonMissing.of(),
            @JsonProperty("line1") @ExcludeMissing line1: JsonField<String> = JsonMissing.of(),
            @JsonProperty("line2") @ExcludeMissing line2: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("postal_code")
            @ExcludeMissing
            postalCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("state") @ExcludeMissing state: JsonField<String> = JsonMissing.of(),
        ) : this(city, line1, line2, name, postalCode, state, mutableMapOf())

        /**
         * The city of the destination address.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun city(): String = city.getRequired("city")

        /**
         * The first line of the destination address.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun line1(): String = line1.getRequired("line1")

        /**
         * The second line of the destination address.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun line2(): Optional<String> = line2.getOptional("line2")

        /**
         * The recipient at the destination address.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * The postal code of the destination address.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun postalCode(): String = postalCode.getRequired("postal_code")

        /**
         * The state of the destination address.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun state(): String = state.getRequired("state")

        /**
         * Returns the raw JSON value of [city].
         *
         * Unlike [city], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

        /**
         * Returns the raw JSON value of [line1].
         *
         * Unlike [line1], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("line1") @ExcludeMissing fun _line1(): JsonField<String> = line1

        /**
         * Returns the raw JSON value of [line2].
         *
         * Unlike [line2], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("line2") @ExcludeMissing fun _line2(): JsonField<String> = line2

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [postalCode].
         *
         * Unlike [postalCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("postal_code")
        @ExcludeMissing
        fun _postalCode(): JsonField<String> = postalCode

        /**
         * Returns the raw JSON value of [state].
         *
         * Unlike [state], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

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
             * Returns a mutable builder for constructing an instance of [MailingAddress].
             *
             * The following fields are required:
             * ```java
             * .city()
             * .line1()
             * .line2()
             * .name()
             * .postalCode()
             * .state()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [MailingAddress]. */
        class Builder internal constructor() {

            private var city: JsonField<String>? = null
            private var line1: JsonField<String>? = null
            private var line2: JsonField<String>? = null
            private var name: JsonField<String>? = null
            private var postalCode: JsonField<String>? = null
            private var state: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(mailingAddress: MailingAddress) = apply {
                city = mailingAddress.city
                line1 = mailingAddress.line1
                line2 = mailingAddress.line2
                name = mailingAddress.name
                postalCode = mailingAddress.postalCode
                state = mailingAddress.state
                additionalProperties = mailingAddress.additionalProperties.toMutableMap()
            }

            /** The city of the destination address. */
            fun city(city: String) = city(JsonField.of(city))

            /**
             * Sets [Builder.city] to an arbitrary JSON value.
             *
             * You should usually call [Builder.city] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun city(city: JsonField<String>) = apply { this.city = city }

            /** The first line of the destination address. */
            fun line1(line1: String) = line1(JsonField.of(line1))

            /**
             * Sets [Builder.line1] to an arbitrary JSON value.
             *
             * You should usually call [Builder.line1] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

            /** The second line of the destination address. */
            fun line2(line2: String?) = line2(JsonField.ofNullable(line2))

            /** Alias for calling [Builder.line2] with `line2.orElse(null)`. */
            fun line2(line2: Optional<String>) = line2(line2.getOrNull())

            /**
             * Sets [Builder.line2] to an arbitrary JSON value.
             *
             * You should usually call [Builder.line2] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

            /** The recipient at the destination address. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** The postal code of the destination address. */
            fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

            /**
             * Sets [Builder.postalCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.postalCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun postalCode(postalCode: JsonField<String>) = apply { this.postalCode = postalCode }

            /** The state of the destination address. */
            fun state(state: String) = state(JsonField.of(state))

            /**
             * Sets [Builder.state] to an arbitrary JSON value.
             *
             * You should usually call [Builder.state] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun state(state: JsonField<String>) = apply { this.state = state }

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
             * Returns an immutable instance of [MailingAddress].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .city()
             * .line1()
             * .line2()
             * .name()
             * .postalCode()
             * .state()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): MailingAddress =
                MailingAddress(
                    checkRequired("city", city),
                    checkRequired("line1", line1),
                    checkRequired("line2", line2),
                    checkRequired("name", name),
                    checkRequired("postalCode", postalCode),
                    checkRequired("state", state),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws IncreaseInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): MailingAddress = apply {
            if (validated) {
                return@apply
            }

            city()
            line1()
            line2()
            name()
            postalCode()
            state()
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
            (if (city.asKnown().isPresent) 1 else 0) +
                (if (line1.asKnown().isPresent) 1 else 0) +
                (if (line2.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (postalCode.asKnown().isPresent) 1 else 0) +
                (if (state.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is MailingAddress &&
                city == other.city &&
                line1 == other.line1 &&
                line2 == other.line2 &&
                name == other.name &&
                postalCode == other.postalCode &&
                state == other.state &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(city, line1, line2, name, postalCode, state, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "MailingAddress{city=$city, line1=$line1, line2=$line2, name=$name, postalCode=$postalCode, state=$state, additionalProperties=$additionalProperties}"
    }

    class Payer
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val contents: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("contents") @ExcludeMissing contents: JsonField<String> = JsonMissing.of()
        ) : this(contents, mutableMapOf())

        /**
         * The contents of the line.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun contents(): String = contents.getRequired("contents")

        /**
         * Returns the raw JSON value of [contents].
         *
         * Unlike [contents], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("contents") @ExcludeMissing fun _contents(): JsonField<String> = contents

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
             * Returns a mutable builder for constructing an instance of [Payer].
             *
             * The following fields are required:
             * ```java
             * .contents()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Payer]. */
        class Builder internal constructor() {

            private var contents: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(payer: Payer) = apply {
                contents = payer.contents
                additionalProperties = payer.additionalProperties.toMutableMap()
            }

            /** The contents of the line. */
            fun contents(contents: String) = contents(JsonField.of(contents))

            /**
             * Sets [Builder.contents] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contents] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun contents(contents: JsonField<String>) = apply { this.contents = contents }

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
             * Returns an immutable instance of [Payer].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .contents()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Payer =
                Payer(checkRequired("contents", contents), additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws IncreaseInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Payer = apply {
            if (validated) {
                return@apply
            }

            contents()
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
        @JvmSynthetic internal fun validity(): Int = (if (contents.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Payer &&
                contents == other.contents &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(contents, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Payer{contents=$contents, additionalProperties=$additionalProperties}"
    }

    /** The address the Checkbook will return to if there is a delivery issue. */
    class ReturnAddress
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val city: JsonField<String>,
        private val line1: JsonField<String>,
        private val line2: JsonField<String>,
        private val name: JsonField<String>,
        private val postalCode: JsonField<String>,
        private val state: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("city") @ExcludeMissing city: JsonField<String> = JsonMissing.of(),
            @JsonProperty("line1") @ExcludeMissing line1: JsonField<String> = JsonMissing.of(),
            @JsonProperty("line2") @ExcludeMissing line2: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("postal_code")
            @ExcludeMissing
            postalCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("state") @ExcludeMissing state: JsonField<String> = JsonMissing.of(),
        ) : this(city, line1, line2, name, postalCode, state, mutableMapOf())

        /**
         * The city of the return address.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun city(): String = city.getRequired("city")

        /**
         * The first line of the return address.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun line1(): String = line1.getRequired("line1")

        /**
         * The second line of the return address.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun line2(): Optional<String> = line2.getOptional("line2")

        /**
         * The recipient at the return address.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * The postal code of the return address.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun postalCode(): String = postalCode.getRequired("postal_code")

        /**
         * The state of the return address.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun state(): String = state.getRequired("state")

        /**
         * Returns the raw JSON value of [city].
         *
         * Unlike [city], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

        /**
         * Returns the raw JSON value of [line1].
         *
         * Unlike [line1], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("line1") @ExcludeMissing fun _line1(): JsonField<String> = line1

        /**
         * Returns the raw JSON value of [line2].
         *
         * Unlike [line2], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("line2") @ExcludeMissing fun _line2(): JsonField<String> = line2

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [postalCode].
         *
         * Unlike [postalCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("postal_code")
        @ExcludeMissing
        fun _postalCode(): JsonField<String> = postalCode

        /**
         * Returns the raw JSON value of [state].
         *
         * Unlike [state], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

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
             * Returns a mutable builder for constructing an instance of [ReturnAddress].
             *
             * The following fields are required:
             * ```java
             * .city()
             * .line1()
             * .line2()
             * .name()
             * .postalCode()
             * .state()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ReturnAddress]. */
        class Builder internal constructor() {

            private var city: JsonField<String>? = null
            private var line1: JsonField<String>? = null
            private var line2: JsonField<String>? = null
            private var name: JsonField<String>? = null
            private var postalCode: JsonField<String>? = null
            private var state: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(returnAddress: ReturnAddress) = apply {
                city = returnAddress.city
                line1 = returnAddress.line1
                line2 = returnAddress.line2
                name = returnAddress.name
                postalCode = returnAddress.postalCode
                state = returnAddress.state
                additionalProperties = returnAddress.additionalProperties.toMutableMap()
            }

            /** The city of the return address. */
            fun city(city: String) = city(JsonField.of(city))

            /**
             * Sets [Builder.city] to an arbitrary JSON value.
             *
             * You should usually call [Builder.city] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun city(city: JsonField<String>) = apply { this.city = city }

            /** The first line of the return address. */
            fun line1(line1: String) = line1(JsonField.of(line1))

            /**
             * Sets [Builder.line1] to an arbitrary JSON value.
             *
             * You should usually call [Builder.line1] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

            /** The second line of the return address. */
            fun line2(line2: String?) = line2(JsonField.ofNullable(line2))

            /** Alias for calling [Builder.line2] with `line2.orElse(null)`. */
            fun line2(line2: Optional<String>) = line2(line2.getOrNull())

            /**
             * Sets [Builder.line2] to an arbitrary JSON value.
             *
             * You should usually call [Builder.line2] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

            /** The recipient at the return address. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** The postal code of the return address. */
            fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

            /**
             * Sets [Builder.postalCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.postalCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun postalCode(postalCode: JsonField<String>) = apply { this.postalCode = postalCode }

            /** The state of the return address. */
            fun state(state: String) = state(JsonField.of(state))

            /**
             * Sets [Builder.state] to an arbitrary JSON value.
             *
             * You should usually call [Builder.state] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun state(state: JsonField<String>) = apply { this.state = state }

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
             * Returns an immutable instance of [ReturnAddress].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .city()
             * .line1()
             * .line2()
             * .name()
             * .postalCode()
             * .state()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ReturnAddress =
                ReturnAddress(
                    checkRequired("city", city),
                    checkRequired("line1", line1),
                    checkRequired("line2", line2),
                    checkRequired("name", name),
                    checkRequired("postalCode", postalCode),
                    checkRequired("state", state),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws IncreaseInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): ReturnAddress = apply {
            if (validated) {
                return@apply
            }

            city()
            line1()
            line2()
            name()
            postalCode()
            state()
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
            (if (city.asKnown().isPresent) 1 else 0) +
                (if (line1.asKnown().isPresent) 1 else 0) +
                (if (line2.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (postalCode.asKnown().isPresent) 1 else 0) +
                (if (state.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ReturnAddress &&
                city == other.city &&
                line1 == other.line1 &&
                line2 == other.line2 &&
                name == other.name &&
                postalCode == other.postalCode &&
                state == other.state &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(city, line1, line2, name, postalCode, state, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ReturnAddress{city=$city, line1=$line1, line2=$line2, name=$name, postalCode=$postalCode, state=$state, additionalProperties=$additionalProperties}"
    }

    /** The lifecycle status of the Checkbook. */
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

            /** The Checkbook is pending submission to the printer. */
            @JvmField val PENDING_SUBMISSION = of("pending_submission")

            /** The Checkbook has been submitted to the printer and is pending mailing. */
            @JvmField val PENDING_MAILING = of("pending_mailing")

            /** The Checkbook has been mailed. */
            @JvmField val MAILED = of("mailed")

            /** The Checkbook has been stopped and its checks can no longer be deposited. */
            @JvmField val STOPPED = of("stopped")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            /** The Checkbook is pending submission to the printer. */
            PENDING_SUBMISSION,
            /** The Checkbook has been submitted to the printer and is pending mailing. */
            PENDING_MAILING,
            /** The Checkbook has been mailed. */
            MAILED,
            /** The Checkbook has been stopped and its checks can no longer be deposited. */
            STOPPED,
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
            /** The Checkbook is pending submission to the printer. */
            PENDING_SUBMISSION,
            /** The Checkbook has been submitted to the printer and is pending mailing. */
            PENDING_MAILING,
            /** The Checkbook has been mailed. */
            MAILED,
            /** The Checkbook has been stopped and its checks can no longer be deposited. */
            STOPPED,
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
                PENDING_SUBMISSION -> Value.PENDING_SUBMISSION
                PENDING_MAILING -> Value.PENDING_MAILING
                MAILED -> Value.MAILED
                STOPPED -> Value.STOPPED
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
                PENDING_SUBMISSION -> Known.PENDING_SUBMISSION
                PENDING_MAILING -> Known.PENDING_MAILING
                MAILED -> Known.MAILED
                STOPPED -> Known.STOPPED
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws IncreaseInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
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

    /** The physical format of the Checkbook. */
    class Style @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            /** A half-inch three-ring binder holding 75 pages of checks with 3 checks per page. */
            @JvmField val THREE_RING_BINDER = of("three_ring_binder")

            /** A folder holding 15 pages of checks with 3 checks per page. */
            @JvmField val FOLDER = of("folder")

            @JvmStatic fun of(value: String) = Style(JsonField.of(value))
        }

        /** An enum containing [Style]'s known values. */
        enum class Known {
            /** A half-inch three-ring binder holding 75 pages of checks with 3 checks per page. */
            THREE_RING_BINDER,
            /** A folder holding 15 pages of checks with 3 checks per page. */
            FOLDER,
        }

        /**
         * An enum containing [Style]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Style] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            /** A half-inch three-ring binder holding 75 pages of checks with 3 checks per page. */
            THREE_RING_BINDER,
            /** A folder holding 15 pages of checks with 3 checks per page. */
            FOLDER,
            /** An enum member indicating that [Style] was instantiated with an unknown value. */
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
                THREE_RING_BINDER -> Value.THREE_RING_BINDER
                FOLDER -> Value.FOLDER
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
                THREE_RING_BINDER -> Known.THREE_RING_BINDER
                FOLDER -> Known.FOLDER
                else -> throw IncreaseInvalidDataException("Unknown Style: $value")
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws IncreaseInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Style = apply {
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

            return other is Style && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class TrackingUpdate
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val category: JsonField<Category>,
        private val country: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val postalCode: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("category")
            @ExcludeMissing
            category: JsonField<Category> = JsonMissing.of(),
            @JsonProperty("country") @ExcludeMissing country: JsonField<String> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("postal_code")
            @ExcludeMissing
            postalCode: JsonField<String> = JsonMissing.of(),
        ) : this(category, country, createdAt, postalCode, mutableMapOf())

        /**
         * The type of tracking event.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun category(): Category = category.getRequired("category")

        /**
         * The ISO 3166-1 alpha-2 country code for the country where the event took place.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun country(): String = country.getRequired("country")

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
         * tracking event took place.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        /**
         * The postal code where the event took place.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun postalCode(): String = postalCode.getRequired("postal_code")

        /**
         * Returns the raw JSON value of [category].
         *
         * Unlike [category], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("category") @ExcludeMissing fun _category(): JsonField<Category> = category

        /**
         * Returns the raw JSON value of [country].
         *
         * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [postalCode].
         *
         * Unlike [postalCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("postal_code")
        @ExcludeMissing
        fun _postalCode(): JsonField<String> = postalCode

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
             * Returns a mutable builder for constructing an instance of [TrackingUpdate].
             *
             * The following fields are required:
             * ```java
             * .category()
             * .country()
             * .createdAt()
             * .postalCode()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [TrackingUpdate]. */
        class Builder internal constructor() {

            private var category: JsonField<Category>? = null
            private var country: JsonField<String>? = null
            private var createdAt: JsonField<OffsetDateTime>? = null
            private var postalCode: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(trackingUpdate: TrackingUpdate) = apply {
                category = trackingUpdate.category
                country = trackingUpdate.country
                createdAt = trackingUpdate.createdAt
                postalCode = trackingUpdate.postalCode
                additionalProperties = trackingUpdate.additionalProperties.toMutableMap()
            }

            /** The type of tracking event. */
            fun category(category: Category) = category(JsonField.of(category))

            /**
             * Sets [Builder.category] to an arbitrary JSON value.
             *
             * You should usually call [Builder.category] with a well-typed [Category] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun category(category: JsonField<Category>) = apply { this.category = category }

            /** The ISO 3166-1 alpha-2 country code for the country where the event took place. */
            fun country(country: String) = country(JsonField.of(country))

            /**
             * Sets [Builder.country] to an arbitrary JSON value.
             *
             * You should usually call [Builder.country] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun country(country: JsonField<String>) = apply { this.country = country }

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * tracking event took place.
             */
            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            /** The postal code where the event took place. */
            fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

            /**
             * Sets [Builder.postalCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.postalCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun postalCode(postalCode: JsonField<String>) = apply { this.postalCode = postalCode }

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
             * Returns an immutable instance of [TrackingUpdate].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .category()
             * .country()
             * .createdAt()
             * .postalCode()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): TrackingUpdate =
                TrackingUpdate(
                    checkRequired("category", category),
                    checkRequired("country", country),
                    checkRequired("createdAt", createdAt),
                    checkRequired("postalCode", postalCode),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws IncreaseInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): TrackingUpdate = apply {
            if (validated) {
                return@apply
            }

            category().validate()
            country()
            createdAt()
            postalCode()
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
            (category.asKnown().getOrNull()?.validity() ?: 0) +
                (if (country.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (postalCode.asKnown().isPresent) 1 else 0)

        /** The type of tracking event. */
        class Category @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                /** The checkbook is in transit. */
                @JvmField val IN_TRANSIT = of("in_transit")

                /** The checkbook has been processed for delivery. */
                @JvmField val PROCESSED_FOR_DELIVERY = of("processed_for_delivery")

                /**
                 * The checkbook has been delivered. Note that some couriers track delivery status
                 * based on driver location data rather than an explicit scan. While uncommon, a
                 * single checkbook may have more than one delivered event.
                 */
                @JvmField val DELIVERED = of("delivered")

                /**
                 * There is an issue preventing delivery. The delivery will be attempted again if
                 * possible. If the issue cannot be resolved, the checkbook will be rerouted to the
                 * return address.
                 */
                @JvmField val DELIVERY_ISSUE = of("delivery_issue")

                /** The checkbook has been rerouted to the return address. */
                @JvmField val RETURNING_TO_SENDER = of("returning_to_sender")

                /** The checkbook has been delivered to the return address. */
                @JvmField val RETURNED_TO_SENDER = of("returned_to_sender")

                @JvmStatic fun of(value: String) = Category(JsonField.of(value))
            }

            /** An enum containing [Category]'s known values. */
            enum class Known {
                /** The checkbook is in transit. */
                IN_TRANSIT,
                /** The checkbook has been processed for delivery. */
                PROCESSED_FOR_DELIVERY,
                /**
                 * The checkbook has been delivered. Note that some couriers track delivery status
                 * based on driver location data rather than an explicit scan. While uncommon, a
                 * single checkbook may have more than one delivered event.
                 */
                DELIVERED,
                /**
                 * There is an issue preventing delivery. The delivery will be attempted again if
                 * possible. If the issue cannot be resolved, the checkbook will be rerouted to the
                 * return address.
                 */
                DELIVERY_ISSUE,
                /** The checkbook has been rerouted to the return address. */
                RETURNING_TO_SENDER,
                /** The checkbook has been delivered to the return address. */
                RETURNED_TO_SENDER,
            }

            /**
             * An enum containing [Category]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Category] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /** The checkbook is in transit. */
                IN_TRANSIT,
                /** The checkbook has been processed for delivery. */
                PROCESSED_FOR_DELIVERY,
                /**
                 * The checkbook has been delivered. Note that some couriers track delivery status
                 * based on driver location data rather than an explicit scan. While uncommon, a
                 * single checkbook may have more than one delivered event.
                 */
                DELIVERED,
                /**
                 * There is an issue preventing delivery. The delivery will be attempted again if
                 * possible. If the issue cannot be resolved, the checkbook will be rerouted to the
                 * return address.
                 */
                DELIVERY_ISSUE,
                /** The checkbook has been rerouted to the return address. */
                RETURNING_TO_SENDER,
                /** The checkbook has been delivered to the return address. */
                RETURNED_TO_SENDER,
                /**
                 * An enum member indicating that [Category] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    IN_TRANSIT -> Value.IN_TRANSIT
                    PROCESSED_FOR_DELIVERY -> Value.PROCESSED_FOR_DELIVERY
                    DELIVERED -> Value.DELIVERED
                    DELIVERY_ISSUE -> Value.DELIVERY_ISSUE
                    RETURNING_TO_SENDER -> Value.RETURNING_TO_SENDER
                    RETURNED_TO_SENDER -> Value.RETURNED_TO_SENDER
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws IncreaseInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    IN_TRANSIT -> Known.IN_TRANSIT
                    PROCESSED_FOR_DELIVERY -> Known.PROCESSED_FOR_DELIVERY
                    DELIVERED -> Known.DELIVERED
                    DELIVERY_ISSUE -> Known.DELIVERY_ISSUE
                    RETURNING_TO_SENDER -> Known.RETURNING_TO_SENDER
                    RETURNED_TO_SENDER -> Known.RETURNED_TO_SENDER
                    else -> throw IncreaseInvalidDataException("Unknown Category: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws IncreaseInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    IncreaseInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws IncreaseInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): Category = apply {
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

                return other is Category && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is TrackingUpdate &&
                category == other.category &&
                country == other.country &&
                createdAt == other.createdAt &&
                postalCode == other.postalCode &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(category, country, createdAt, postalCode, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "TrackingUpdate{category=$category, country=$country, createdAt=$createdAt, postalCode=$postalCode, additionalProperties=$additionalProperties}"
    }

    /**
     * A constant representing the object's type. For this resource it will always be `checkbook`.
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

            @JvmField val CHECKBOOK = of("checkbook")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            CHECKBOOK
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
            CHECKBOOK,
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
                CHECKBOOK -> Value.CHECKBOOK
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
                CHECKBOOK -> Known.CHECKBOOK
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws IncreaseInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
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

        return other is Checkbook &&
            id == other.id &&
            accountNumberId == other.accountNumberId &&
            createdAt == other.createdAt &&
            idempotencyKey == other.idempotencyKey &&
            mailingAddress == other.mailingAddress &&
            payer == other.payer &&
            returnAddress == other.returnAddress &&
            status == other.status &&
            style == other.style &&
            trackingUpdates == other.trackingUpdates &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            accountNumberId,
            createdAt,
            idempotencyKey,
            mailingAddress,
            payer,
            returnAddress,
            status,
            style,
            trackingUpdates,
            type,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Checkbook{id=$id, accountNumberId=$accountNumberId, createdAt=$createdAt, idempotencyKey=$idempotencyKey, mailingAddress=$mailingAddress, payer=$payer, returnAddress=$returnAddress, status=$status, style=$style, trackingUpdates=$trackingUpdates, type=$type, additionalProperties=$additionalProperties}"
}
