// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.physicalcards

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

/**
 * Custom physical Visa cards that are shipped to your customers. The artwork is configurable by a
 * connected [Card Profile](/documentation/api#card-profiles). The same Card can be used for
 * multiple Physical Cards. Printing cards incurs a fee. Please contact
 * [support@increase.com](mailto:support@increase.com) for pricing!
 */
class PhysicalCard
private constructor(
    private val id: JsonField<String>,
    private val cardId: JsonField<String>,
    private val cardholder: JsonField<Cardholder>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val idempotencyKey: JsonField<String>,
    private val physicalCardProfileId: JsonField<String>,
    private val shipment: JsonField<Shipment>,
    private val status: JsonField<Status>,
    private val type: JsonField<Type>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("card_id") @ExcludeMissing cardId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("cardholder")
        @ExcludeMissing
        cardholder: JsonField<Cardholder> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("idempotency_key")
        @ExcludeMissing
        idempotencyKey: JsonField<String> = JsonMissing.of(),
        @JsonProperty("physical_card_profile_id")
        @ExcludeMissing
        physicalCardProfileId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("shipment") @ExcludeMissing shipment: JsonField<Shipment> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
    ) : this(
        id,
        cardId,
        cardholder,
        createdAt,
        idempotencyKey,
        physicalCardProfileId,
        shipment,
        status,
        type,
        mutableMapOf(),
    )

    /**
     * The physical card identifier.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The identifier for the Card this Physical Card represents.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun cardId(): String = cardId.getRequired("card_id")

    /**
     * Details about the cardholder, as it appears on the printed card.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun cardholder(): Cardholder = cardholder.getRequired("cardholder")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the Physical
     * Card was created.
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
     * The Physical Card Profile used for this Physical Card.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun physicalCardProfileId(): Optional<String> =
        physicalCardProfileId.getOptional("physical_card_profile_id")

    /**
     * The details used to ship this physical card.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun shipment(): Shipment = shipment.getRequired("shipment")

    /**
     * The status of the Physical Card.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `physical_card`.
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
     * Returns the raw JSON value of [cardId].
     *
     * Unlike [cardId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("card_id") @ExcludeMissing fun _cardId(): JsonField<String> = cardId

    /**
     * Returns the raw JSON value of [cardholder].
     *
     * Unlike [cardholder], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cardholder")
    @ExcludeMissing
    fun _cardholder(): JsonField<Cardholder> = cardholder

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
     * Returns the raw JSON value of [physicalCardProfileId].
     *
     * Unlike [physicalCardProfileId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("physical_card_profile_id")
    @ExcludeMissing
    fun _physicalCardProfileId(): JsonField<String> = physicalCardProfileId

    /**
     * Returns the raw JSON value of [shipment].
     *
     * Unlike [shipment], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("shipment") @ExcludeMissing fun _shipment(): JsonField<Shipment> = shipment

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
         * Returns a mutable builder for constructing an instance of [PhysicalCard].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .cardId()
         * .cardholder()
         * .createdAt()
         * .idempotencyKey()
         * .physicalCardProfileId()
         * .shipment()
         * .status()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PhysicalCard]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var cardId: JsonField<String>? = null
        private var cardholder: JsonField<Cardholder>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var idempotencyKey: JsonField<String>? = null
        private var physicalCardProfileId: JsonField<String>? = null
        private var shipment: JsonField<Shipment>? = null
        private var status: JsonField<Status>? = null
        private var type: JsonField<Type>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(physicalCard: PhysicalCard) = apply {
            id = physicalCard.id
            cardId = physicalCard.cardId
            cardholder = physicalCard.cardholder
            createdAt = physicalCard.createdAt
            idempotencyKey = physicalCard.idempotencyKey
            physicalCardProfileId = physicalCard.physicalCardProfileId
            shipment = physicalCard.shipment
            status = physicalCard.status
            type = physicalCard.type
            additionalProperties = physicalCard.additionalProperties.toMutableMap()
        }

        /** The physical card identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The identifier for the Card this Physical Card represents. */
        fun cardId(cardId: String) = cardId(JsonField.of(cardId))

        /**
         * Sets [Builder.cardId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cardId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun cardId(cardId: JsonField<String>) = apply { this.cardId = cardId }

        /** Details about the cardholder, as it appears on the printed card. */
        fun cardholder(cardholder: Cardholder) = cardholder(JsonField.of(cardholder))

        /**
         * Sets [Builder.cardholder] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cardholder] with a well-typed [Cardholder] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun cardholder(cardholder: JsonField<Cardholder>) = apply { this.cardholder = cardholder }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
         * Physical Card was created.
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

        /** The Physical Card Profile used for this Physical Card. */
        fun physicalCardProfileId(physicalCardProfileId: String?) =
            physicalCardProfileId(JsonField.ofNullable(physicalCardProfileId))

        /**
         * Alias for calling [Builder.physicalCardProfileId] with
         * `physicalCardProfileId.orElse(null)`.
         */
        fun physicalCardProfileId(physicalCardProfileId: Optional<String>) =
            physicalCardProfileId(physicalCardProfileId.getOrNull())

        /**
         * Sets [Builder.physicalCardProfileId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.physicalCardProfileId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun physicalCardProfileId(physicalCardProfileId: JsonField<String>) = apply {
            this.physicalCardProfileId = physicalCardProfileId
        }

        /** The details used to ship this physical card. */
        fun shipment(shipment: Shipment) = shipment(JsonField.of(shipment))

        /**
         * Sets [Builder.shipment] to an arbitrary JSON value.
         *
         * You should usually call [Builder.shipment] with a well-typed [Shipment] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun shipment(shipment: JsonField<Shipment>) = apply { this.shipment = shipment }

        /** The status of the Physical Card. */
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
         * `physical_card`.
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
         * Returns an immutable instance of [PhysicalCard].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .cardId()
         * .cardholder()
         * .createdAt()
         * .idempotencyKey()
         * .physicalCardProfileId()
         * .shipment()
         * .status()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PhysicalCard =
            PhysicalCard(
                checkRequired("id", id),
                checkRequired("cardId", cardId),
                checkRequired("cardholder", cardholder),
                checkRequired("createdAt", createdAt),
                checkRequired("idempotencyKey", idempotencyKey),
                checkRequired("physicalCardProfileId", physicalCardProfileId),
                checkRequired("shipment", shipment),
                checkRequired("status", status),
                checkRequired("type", type),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PhysicalCard = apply {
        if (validated) {
            return@apply
        }

        id()
        cardId()
        cardholder().validate()
        createdAt()
        idempotencyKey()
        physicalCardProfileId()
        shipment().validate()
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
            (if (cardId.asKnown().isPresent) 1 else 0) +
            (cardholder.asKnown().getOrNull()?.validity() ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (idempotencyKey.asKnown().isPresent) 1 else 0) +
            (if (physicalCardProfileId.asKnown().isPresent) 1 else 0) +
            (shipment.asKnown().getOrNull()?.validity() ?: 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0)

    /** Details about the cardholder, as it appears on the printed card. */
    class Cardholder
    private constructor(
        private val firstName: JsonField<String>,
        private val lastName: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("first_name")
            @ExcludeMissing
            firstName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("last_name")
            @ExcludeMissing
            lastName: JsonField<String> = JsonMissing.of(),
        ) : this(firstName, lastName, mutableMapOf())

        /**
         * The cardholder's first name.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun firstName(): String = firstName.getRequired("first_name")

        /**
         * The cardholder's last name.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun lastName(): String = lastName.getRequired("last_name")

        /**
         * Returns the raw JSON value of [firstName].
         *
         * Unlike [firstName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("first_name") @ExcludeMissing fun _firstName(): JsonField<String> = firstName

        /**
         * Returns the raw JSON value of [lastName].
         *
         * Unlike [lastName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("last_name") @ExcludeMissing fun _lastName(): JsonField<String> = lastName

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
             * Returns a mutable builder for constructing an instance of [Cardholder].
             *
             * The following fields are required:
             * ```java
             * .firstName()
             * .lastName()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Cardholder]. */
        class Builder internal constructor() {

            private var firstName: JsonField<String>? = null
            private var lastName: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(cardholder: Cardholder) = apply {
                firstName = cardholder.firstName
                lastName = cardholder.lastName
                additionalProperties = cardholder.additionalProperties.toMutableMap()
            }

            /** The cardholder's first name. */
            fun firstName(firstName: String) = firstName(JsonField.of(firstName))

            /**
             * Sets [Builder.firstName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.firstName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

            /** The cardholder's last name. */
            fun lastName(lastName: String) = lastName(JsonField.of(lastName))

            /**
             * Sets [Builder.lastName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lastName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

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
             * Returns an immutable instance of [Cardholder].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .firstName()
             * .lastName()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Cardholder =
                Cardholder(
                    checkRequired("firstName", firstName),
                    checkRequired("lastName", lastName),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Cardholder = apply {
            if (validated) {
                return@apply
            }

            firstName()
            lastName()
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
            (if (firstName.asKnown().isPresent) 1 else 0) +
                (if (lastName.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Cardholder &&
                firstName == other.firstName &&
                lastName == other.lastName &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(firstName, lastName, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Cardholder{firstName=$firstName, lastName=$lastName, additionalProperties=$additionalProperties}"
    }

    /** The details used to ship this physical card. */
    class Shipment
    private constructor(
        private val address: JsonField<Address>,
        private val method: JsonField<Method>,
        private val schedule: JsonField<Schedule>,
        private val status: JsonField<Status>,
        private val tracking: JsonField<Tracking>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("address") @ExcludeMissing address: JsonField<Address> = JsonMissing.of(),
            @JsonProperty("method") @ExcludeMissing method: JsonField<Method> = JsonMissing.of(),
            @JsonProperty("schedule")
            @ExcludeMissing
            schedule: JsonField<Schedule> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
            @JsonProperty("tracking")
            @ExcludeMissing
            tracking: JsonField<Tracking> = JsonMissing.of(),
        ) : this(address, method, schedule, status, tracking, mutableMapOf())

        /**
         * The location to where the card's packing label is addressed.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun address(): Address = address.getRequired("address")

        /**
         * The shipping method.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun method(): Method = method.getRequired("method")

        /**
         * When this physical card should be produced by the card printer. The default timeline is
         * the day after the card printer receives the order, except for `FEDEX_PRIORITY_OVERNIGHT`
         * cards, which default to `SAME_DAY`. To use faster production methods, please reach out to
         * [support@increase.com](mailto:support@increase.com).
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun schedule(): Schedule = schedule.getRequired("schedule")

        /**
         * The status of this shipment.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun status(): Status = status.getRequired("status")

        /**
         * Tracking details for the shipment.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun tracking(): Optional<Tracking> = tracking.getOptional("tracking")

        /**
         * Returns the raw JSON value of [address].
         *
         * Unlike [address], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("address") @ExcludeMissing fun _address(): JsonField<Address> = address

        /**
         * Returns the raw JSON value of [method].
         *
         * Unlike [method], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("method") @ExcludeMissing fun _method(): JsonField<Method> = method

        /**
         * Returns the raw JSON value of [schedule].
         *
         * Unlike [schedule], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("schedule") @ExcludeMissing fun _schedule(): JsonField<Schedule> = schedule

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

        /**
         * Returns the raw JSON value of [tracking].
         *
         * Unlike [tracking], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tracking") @ExcludeMissing fun _tracking(): JsonField<Tracking> = tracking

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
             * Returns a mutable builder for constructing an instance of [Shipment].
             *
             * The following fields are required:
             * ```java
             * .address()
             * .method()
             * .schedule()
             * .status()
             * .tracking()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Shipment]. */
        class Builder internal constructor() {

            private var address: JsonField<Address>? = null
            private var method: JsonField<Method>? = null
            private var schedule: JsonField<Schedule>? = null
            private var status: JsonField<Status>? = null
            private var tracking: JsonField<Tracking>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(shipment: Shipment) = apply {
                address = shipment.address
                method = shipment.method
                schedule = shipment.schedule
                status = shipment.status
                tracking = shipment.tracking
                additionalProperties = shipment.additionalProperties.toMutableMap()
            }

            /** The location to where the card's packing label is addressed. */
            fun address(address: Address) = address(JsonField.of(address))

            /**
             * Sets [Builder.address] to an arbitrary JSON value.
             *
             * You should usually call [Builder.address] with a well-typed [Address] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun address(address: JsonField<Address>) = apply { this.address = address }

            /** The shipping method. */
            fun method(method: Method) = method(JsonField.of(method))

            /**
             * Sets [Builder.method] to an arbitrary JSON value.
             *
             * You should usually call [Builder.method] with a well-typed [Method] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun method(method: JsonField<Method>) = apply { this.method = method }

            /**
             * When this physical card should be produced by the card printer. The default timeline
             * is the day after the card printer receives the order, except for
             * `FEDEX_PRIORITY_OVERNIGHT` cards, which default to `SAME_DAY`. To use faster
             * production methods, please reach out to
             * [support@increase.com](mailto:support@increase.com).
             */
            fun schedule(schedule: Schedule) = schedule(JsonField.of(schedule))

            /**
             * Sets [Builder.schedule] to an arbitrary JSON value.
             *
             * You should usually call [Builder.schedule] with a well-typed [Schedule] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun schedule(schedule: JsonField<Schedule>) = apply { this.schedule = schedule }

            /** The status of this shipment. */
            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

            /** Tracking details for the shipment. */
            fun tracking(tracking: Tracking?) = tracking(JsonField.ofNullable(tracking))

            /** Alias for calling [Builder.tracking] with `tracking.orElse(null)`. */
            fun tracking(tracking: Optional<Tracking>) = tracking(tracking.getOrNull())

            /**
             * Sets [Builder.tracking] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tracking] with a well-typed [Tracking] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tracking(tracking: JsonField<Tracking>) = apply { this.tracking = tracking }

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
             * Returns an immutable instance of [Shipment].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .address()
             * .method()
             * .schedule()
             * .status()
             * .tracking()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Shipment =
                Shipment(
                    checkRequired("address", address),
                    checkRequired("method", method),
                    checkRequired("schedule", schedule),
                    checkRequired("status", status),
                    checkRequired("tracking", tracking),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Shipment = apply {
            if (validated) {
                return@apply
            }

            address().validate()
            method().validate()
            schedule().validate()
            status().validate()
            tracking().ifPresent { it.validate() }
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
            (address.asKnown().getOrNull()?.validity() ?: 0) +
                (method.asKnown().getOrNull()?.validity() ?: 0) +
                (schedule.asKnown().getOrNull()?.validity() ?: 0) +
                (status.asKnown().getOrNull()?.validity() ?: 0) +
                (tracking.asKnown().getOrNull()?.validity() ?: 0)

        /** The location to where the card's packing label is addressed. */
        class Address
        private constructor(
            private val city: JsonField<String>,
            private val country: JsonField<String>,
            private val line1: JsonField<String>,
            private val line2: JsonField<String>,
            private val line3: JsonField<String>,
            private val name: JsonField<String>,
            private val postalCode: JsonField<String>,
            private val state: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("city") @ExcludeMissing city: JsonField<String> = JsonMissing.of(),
                @JsonProperty("country")
                @ExcludeMissing
                country: JsonField<String> = JsonMissing.of(),
                @JsonProperty("line1") @ExcludeMissing line1: JsonField<String> = JsonMissing.of(),
                @JsonProperty("line2") @ExcludeMissing line2: JsonField<String> = JsonMissing.of(),
                @JsonProperty("line3") @ExcludeMissing line3: JsonField<String> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("postal_code")
                @ExcludeMissing
                postalCode: JsonField<String> = JsonMissing.of(),
                @JsonProperty("state") @ExcludeMissing state: JsonField<String> = JsonMissing.of(),
            ) : this(city, country, line1, line2, line3, name, postalCode, state, mutableMapOf())

            /**
             * The city of the shipping address.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun city(): String = city.getRequired("city")

            /**
             * The country of the shipping address.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun country(): String = country.getRequired("country")

            /**
             * The first line of the shipping address.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun line1(): String = line1.getRequired("line1")

            /**
             * The second line of the shipping address.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun line2(): Optional<String> = line2.getOptional("line2")

            /**
             * The third line of the shipping address.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun line3(): Optional<String> = line3.getOptional("line3")

            /**
             * The name of the recipient.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun name(): String = name.getRequired("name")

            /**
             * The postal code of the shipping address.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun postalCode(): String = postalCode.getRequired("postal_code")

            /**
             * The state of the shipping address.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun state(): String = state.getRequired("state")

            /**
             * Returns the raw JSON value of [city].
             *
             * Unlike [city], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

            /**
             * Returns the raw JSON value of [country].
             *
             * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

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
             * Returns the raw JSON value of [line3].
             *
             * Unlike [line3], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("line3") @ExcludeMissing fun _line3(): JsonField<String> = line3

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [postalCode].
             *
             * Unlike [postalCode], this method doesn't throw if the JSON field has an unexpected
             * type.
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
                 * Returns a mutable builder for constructing an instance of [Address].
                 *
                 * The following fields are required:
                 * ```java
                 * .city()
                 * .country()
                 * .line1()
                 * .line2()
                 * .line3()
                 * .name()
                 * .postalCode()
                 * .state()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Address]. */
            class Builder internal constructor() {

                private var city: JsonField<String>? = null
                private var country: JsonField<String>? = null
                private var line1: JsonField<String>? = null
                private var line2: JsonField<String>? = null
                private var line3: JsonField<String>? = null
                private var name: JsonField<String>? = null
                private var postalCode: JsonField<String>? = null
                private var state: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(address: Address) = apply {
                    city = address.city
                    country = address.country
                    line1 = address.line1
                    line2 = address.line2
                    line3 = address.line3
                    name = address.name
                    postalCode = address.postalCode
                    state = address.state
                    additionalProperties = address.additionalProperties.toMutableMap()
                }

                /** The city of the shipping address. */
                fun city(city: String) = city(JsonField.of(city))

                /**
                 * Sets [Builder.city] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.city] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun city(city: JsonField<String>) = apply { this.city = city }

                /** The country of the shipping address. */
                fun country(country: String) = country(JsonField.of(country))

                /**
                 * Sets [Builder.country] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.country] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun country(country: JsonField<String>) = apply { this.country = country }

                /** The first line of the shipping address. */
                fun line1(line1: String) = line1(JsonField.of(line1))

                /**
                 * Sets [Builder.line1] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.line1] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

                /** The second line of the shipping address. */
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

                /** The third line of the shipping address. */
                fun line3(line3: String?) = line3(JsonField.ofNullable(line3))

                /** Alias for calling [Builder.line3] with `line3.orElse(null)`. */
                fun line3(line3: Optional<String>) = line3(line3.getOrNull())

                /**
                 * Sets [Builder.line3] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.line3] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun line3(line3: JsonField<String>) = apply { this.line3 = line3 }

                /** The name of the recipient. */
                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                /** The postal code of the shipping address. */
                fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

                /**
                 * Sets [Builder.postalCode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.postalCode] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun postalCode(postalCode: JsonField<String>) = apply {
                    this.postalCode = postalCode
                }

                /** The state of the shipping address. */
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
                    putAlladditional_properties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAlladditional_properties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAlladditional_properties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Address].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .city()
                 * .country()
                 * .line1()
                 * .line2()
                 * .line3()
                 * .name()
                 * .postalCode()
                 * .state()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Address =
                    Address(
                        checkRequired("city", city),
                        checkRequired("country", country),
                        checkRequired("line1", line1),
                        checkRequired("line2", line2),
                        checkRequired("line3", line3),
                        checkRequired("name", name),
                        checkRequired("postalCode", postalCode),
                        checkRequired("state", state),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Address = apply {
                if (validated) {
                    return@apply
                }

                city()
                country()
                line1()
                line2()
                line3()
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
                    (if (country.asKnown().isPresent) 1 else 0) +
                    (if (line1.asKnown().isPresent) 1 else 0) +
                    (if (line2.asKnown().isPresent) 1 else 0) +
                    (if (line3.asKnown().isPresent) 1 else 0) +
                    (if (name.asKnown().isPresent) 1 else 0) +
                    (if (postalCode.asKnown().isPresent) 1 else 0) +
                    (if (state.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Address &&
                    city == other.city &&
                    country == other.country &&
                    line1 == other.line1 &&
                    line2 == other.line2 &&
                    line3 == other.line3 &&
                    name == other.name &&
                    postalCode == other.postalCode &&
                    state == other.state &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    city,
                    country,
                    line1,
                    line2,
                    line3,
                    name,
                    postalCode,
                    state,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Address{city=$city, country=$country, line1=$line1, line2=$line2, line3=$line3, name=$name, postalCode=$postalCode, state=$state, additionalProperties=$additionalProperties}"
        }

        /** The shipping method. */
        class Method @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                /** USPS Post. */
                @JvmField val USPS = of("usps")

                /** FedEx Priority Overnight, no signature. */
                @JvmField val FEDEX_PRIORITY_OVERNIGHT = of("fedex_priority_overnight")

                /** FedEx 2-day. */
                @JvmField val FEDEX_2_DAY = of("fedex_2_day")

                /** DHL Worldwide Express, international shipping only. */
                @JvmField val DHL_WORLDWIDE_EXPRESS = of("dhl_worldwide_express")

                @JvmStatic fun of(value: String) = Method(JsonField.of(value))
            }

            /** An enum containing [Method]'s known values. */
            enum class Known {
                /** USPS Post. */
                USPS,
                /** FedEx Priority Overnight, no signature. */
                FEDEX_PRIORITY_OVERNIGHT,
                /** FedEx 2-day. */
                FEDEX_2_DAY,
                /** DHL Worldwide Express, international shipping only. */
                DHL_WORLDWIDE_EXPRESS,
            }

            /**
             * An enum containing [Method]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Method] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /** USPS Post. */
                USPS,
                /** FedEx Priority Overnight, no signature. */
                FEDEX_PRIORITY_OVERNIGHT,
                /** FedEx 2-day. */
                FEDEX_2_DAY,
                /** DHL Worldwide Express, international shipping only. */
                DHL_WORLDWIDE_EXPRESS,
                /**
                 * An enum member indicating that [Method] was instantiated with an unknown value.
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
                    USPS -> Value.USPS
                    FEDEX_PRIORITY_OVERNIGHT -> Value.FEDEX_PRIORITY_OVERNIGHT
                    FEDEX_2_DAY -> Value.FEDEX_2_DAY
                    DHL_WORLDWIDE_EXPRESS -> Value.DHL_WORLDWIDE_EXPRESS
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
                    USPS -> Known.USPS
                    FEDEX_PRIORITY_OVERNIGHT -> Known.FEDEX_PRIORITY_OVERNIGHT
                    FEDEX_2_DAY -> Known.FEDEX_2_DAY
                    DHL_WORLDWIDE_EXPRESS -> Known.DHL_WORLDWIDE_EXPRESS
                    else -> throw IncreaseInvalidDataException("Unknown Method: $value")
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

            fun validate(): Method = apply {
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

                return other is Method && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * When this physical card should be produced by the card printer. The default timeline is
         * the day after the card printer receives the order, except for `FEDEX_PRIORITY_OVERNIGHT`
         * cards, which default to `SAME_DAY`. To use faster production methods, please reach out to
         * [support@increase.com](mailto:support@increase.com).
         */
        class Schedule @JsonCreator private constructor(private val value: JsonField<String>) :
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

                /**
                 * The physical card will be shipped one business day after the order is received by
                 * the card printer. A card that is submitted to Increase on a Monday evening
                 * (Pacific Time) will ship out on Wednesday.
                 */
                @JvmField val NEXT_DAY = of("next_day")

                /**
                 * The physical card will be shipped on the same business day that the order is
                 * received by the card printer. A card that is submitted to Increase on a Monday
                 * evening (Pacific Time) will ship out on Tuesday.
                 */
                @JvmField val SAME_DAY = of("same_day")

                @JvmStatic fun of(value: String) = Schedule(JsonField.of(value))
            }

            /** An enum containing [Schedule]'s known values. */
            enum class Known {
                /**
                 * The physical card will be shipped one business day after the order is received by
                 * the card printer. A card that is submitted to Increase on a Monday evening
                 * (Pacific Time) will ship out on Wednesday.
                 */
                NEXT_DAY,
                /**
                 * The physical card will be shipped on the same business day that the order is
                 * received by the card printer. A card that is submitted to Increase on a Monday
                 * evening (Pacific Time) will ship out on Tuesday.
                 */
                SAME_DAY,
            }

            /**
             * An enum containing [Schedule]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Schedule] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /**
                 * The physical card will be shipped one business day after the order is received by
                 * the card printer. A card that is submitted to Increase on a Monday evening
                 * (Pacific Time) will ship out on Wednesday.
                 */
                NEXT_DAY,
                /**
                 * The physical card will be shipped on the same business day that the order is
                 * received by the card printer. A card that is submitted to Increase on a Monday
                 * evening (Pacific Time) will ship out on Tuesday.
                 */
                SAME_DAY,
                /**
                 * An enum member indicating that [Schedule] was instantiated with an unknown value.
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
                    NEXT_DAY -> Value.NEXT_DAY
                    SAME_DAY -> Value.SAME_DAY
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
                    NEXT_DAY -> Known.NEXT_DAY
                    SAME_DAY -> Known.SAME_DAY
                    else -> throw IncreaseInvalidDataException("Unknown Schedule: $value")
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

            fun validate(): Schedule = apply {
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

                return other is Schedule && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** The status of this shipment. */
        class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                /** The physical card has not yet been shipped. */
                @JvmField val PENDING = of("pending")

                /** The physical card shipment was canceled prior to submission. */
                @JvmField val CANCELED = of("canceled")

                /**
                 * The physical card shipment has been submitted to the card fulfillment provider.
                 */
                @JvmField val SUBMITTED = of("submitted")

                /**
                 * The physical card shipment has been acknowledged by the card fulfillment provider
                 * and will be processed in their next batch.
                 */
                @JvmField val ACKNOWLEDGED = of("acknowledged")

                /** The physical card shipment was rejected by the card printer due to an error. */
                @JvmField val REJECTED = of("rejected")

                /** The physical card has been shipped. */
                @JvmField val SHIPPED = of("shipped")

                /**
                 * The physical card shipment was returned to the sender and destroyed by the
                 * production facility.
                 */
                @JvmField val RETURNED = of("returned")

                /**
                 * The physical card shipment requires attention from Increase before progressing.
                 */
                @JvmField val REQUIRES_ATTENTION = of("requires_attention")

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                /** The physical card has not yet been shipped. */
                PENDING,
                /** The physical card shipment was canceled prior to submission. */
                CANCELED,
                /**
                 * The physical card shipment has been submitted to the card fulfillment provider.
                 */
                SUBMITTED,
                /**
                 * The physical card shipment has been acknowledged by the card fulfillment provider
                 * and will be processed in their next batch.
                 */
                ACKNOWLEDGED,
                /** The physical card shipment was rejected by the card printer due to an error. */
                REJECTED,
                /** The physical card has been shipped. */
                SHIPPED,
                /**
                 * The physical card shipment was returned to the sender and destroyed by the
                 * production facility.
                 */
                RETURNED,
                /**
                 * The physical card shipment requires attention from Increase before progressing.
                 */
                REQUIRES_ATTENTION,
            }

            /**
             * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Status] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /** The physical card has not yet been shipped. */
                PENDING,
                /** The physical card shipment was canceled prior to submission. */
                CANCELED,
                /**
                 * The physical card shipment has been submitted to the card fulfillment provider.
                 */
                SUBMITTED,
                /**
                 * The physical card shipment has been acknowledged by the card fulfillment provider
                 * and will be processed in their next batch.
                 */
                ACKNOWLEDGED,
                /** The physical card shipment was rejected by the card printer due to an error. */
                REJECTED,
                /** The physical card has been shipped. */
                SHIPPED,
                /**
                 * The physical card shipment was returned to the sender and destroyed by the
                 * production facility.
                 */
                RETURNED,
                /**
                 * The physical card shipment requires attention from Increase before progressing.
                 */
                REQUIRES_ATTENTION,
                /**
                 * An enum member indicating that [Status] was instantiated with an unknown value.
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
                    PENDING -> Value.PENDING
                    CANCELED -> Value.CANCELED
                    SUBMITTED -> Value.SUBMITTED
                    ACKNOWLEDGED -> Value.ACKNOWLEDGED
                    REJECTED -> Value.REJECTED
                    SHIPPED -> Value.SHIPPED
                    RETURNED -> Value.RETURNED
                    REQUIRES_ATTENTION -> Value.REQUIRES_ATTENTION
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
                    PENDING -> Known.PENDING
                    CANCELED -> Known.CANCELED
                    SUBMITTED -> Known.SUBMITTED
                    ACKNOWLEDGED -> Known.ACKNOWLEDGED
                    REJECTED -> Known.REJECTED
                    SHIPPED -> Known.SHIPPED
                    RETURNED -> Known.RETURNED
                    REQUIRES_ATTENTION -> Known.REQUIRES_ATTENTION
                    else -> throw IncreaseInvalidDataException("Unknown Status: $value")
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

        /** Tracking details for the shipment. */
        class Tracking
        private constructor(
            private val number: JsonField<String>,
            private val returnNumber: JsonField<String>,
            private val returnReason: JsonField<String>,
            private val shippedAt: JsonField<OffsetDateTime>,
            private val updates: JsonField<List<Update>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("number")
                @ExcludeMissing
                number: JsonField<String> = JsonMissing.of(),
                @JsonProperty("return_number")
                @ExcludeMissing
                returnNumber: JsonField<String> = JsonMissing.of(),
                @JsonProperty("return_reason")
                @ExcludeMissing
                returnReason: JsonField<String> = JsonMissing.of(),
                @JsonProperty("shipped_at")
                @ExcludeMissing
                shippedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("updates")
                @ExcludeMissing
                updates: JsonField<List<Update>> = JsonMissing.of(),
            ) : this(number, returnNumber, returnReason, shippedAt, updates, mutableMapOf())

            /**
             * The tracking number.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun number(): String = number.getRequired("number")

            /**
             * For returned shipments, the tracking number of the return shipment.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun returnNumber(): Optional<String> = returnNumber.getOptional("return_number")

            /**
             * For returned shipments, this describes why the package was returned.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun returnReason(): Optional<String> = returnReason.getOptional("return_reason")

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * fulfillment provider marked the card as ready for pick-up by the shipment carrier.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun shippedAt(): OffsetDateTime = shippedAt.getRequired("shipped_at")

            /**
             * Tracking updates relating to the physical card's delivery.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun updates(): List<Update> = updates.getRequired("updates")

            /**
             * Returns the raw JSON value of [number].
             *
             * Unlike [number], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("number") @ExcludeMissing fun _number(): JsonField<String> = number

            /**
             * Returns the raw JSON value of [returnNumber].
             *
             * Unlike [returnNumber], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("return_number")
            @ExcludeMissing
            fun _returnNumber(): JsonField<String> = returnNumber

            /**
             * Returns the raw JSON value of [returnReason].
             *
             * Unlike [returnReason], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("return_reason")
            @ExcludeMissing
            fun _returnReason(): JsonField<String> = returnReason

            /**
             * Returns the raw JSON value of [shippedAt].
             *
             * Unlike [shippedAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("shipped_at")
            @ExcludeMissing
            fun _shippedAt(): JsonField<OffsetDateTime> = shippedAt

            /**
             * Returns the raw JSON value of [updates].
             *
             * Unlike [updates], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("updates")
            @ExcludeMissing
            fun _updates(): JsonField<List<Update>> = updates

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
                 * Returns a mutable builder for constructing an instance of [Tracking].
                 *
                 * The following fields are required:
                 * ```java
                 * .number()
                 * .returnNumber()
                 * .returnReason()
                 * .shippedAt()
                 * .updates()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Tracking]. */
            class Builder internal constructor() {

                private var number: JsonField<String>? = null
                private var returnNumber: JsonField<String>? = null
                private var returnReason: JsonField<String>? = null
                private var shippedAt: JsonField<OffsetDateTime>? = null
                private var updates: JsonField<MutableList<Update>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(tracking: Tracking) = apply {
                    number = tracking.number
                    returnNumber = tracking.returnNumber
                    returnReason = tracking.returnReason
                    shippedAt = tracking.shippedAt
                    updates = tracking.updates.map { it.toMutableList() }
                    additionalProperties = tracking.additionalProperties.toMutableMap()
                }

                /** The tracking number. */
                fun number(number: String) = number(JsonField.of(number))

                /**
                 * Sets [Builder.number] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.number] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun number(number: JsonField<String>) = apply { this.number = number }

                /** For returned shipments, the tracking number of the return shipment. */
                fun returnNumber(returnNumber: String?) =
                    returnNumber(JsonField.ofNullable(returnNumber))

                /** Alias for calling [Builder.returnNumber] with `returnNumber.orElse(null)`. */
                fun returnNumber(returnNumber: Optional<String>) =
                    returnNumber(returnNumber.getOrNull())

                /**
                 * Sets [Builder.returnNumber] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.returnNumber] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun returnNumber(returnNumber: JsonField<String>) = apply {
                    this.returnNumber = returnNumber
                }

                /** For returned shipments, this describes why the package was returned. */
                fun returnReason(returnReason: String?) =
                    returnReason(JsonField.ofNullable(returnReason))

                /** Alias for calling [Builder.returnReason] with `returnReason.orElse(null)`. */
                fun returnReason(returnReason: Optional<String>) =
                    returnReason(returnReason.getOrNull())

                /**
                 * Sets [Builder.returnReason] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.returnReason] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun returnReason(returnReason: JsonField<String>) = apply {
                    this.returnReason = returnReason
                }

                /**
                 * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
                 * fulfillment provider marked the card as ready for pick-up by the shipment
                 * carrier.
                 */
                fun shippedAt(shippedAt: OffsetDateTime) = shippedAt(JsonField.of(shippedAt))

                /**
                 * Sets [Builder.shippedAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.shippedAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun shippedAt(shippedAt: JsonField<OffsetDateTime>) = apply {
                    this.shippedAt = shippedAt
                }

                /** Tracking updates relating to the physical card's delivery. */
                fun updates(updates: List<Update>) = updates(JsonField.of(updates))

                /**
                 * Sets [Builder.updates] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.updates] with a well-typed `List<Update>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun updates(updates: JsonField<List<Update>>) = apply {
                    this.updates = updates.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Update] to [updates].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addUpdate(update: Update) = apply {
                    updates =
                        (updates ?: JsonField.of(mutableListOf())).also {
                            checkKnown("updates", it).add(update)
                        }
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAlladditional_properties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAlladditional_properties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAlladditional_properties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Tracking].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .number()
                 * .returnNumber()
                 * .returnReason()
                 * .shippedAt()
                 * .updates()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Tracking =
                    Tracking(
                        checkRequired("number", number),
                        checkRequired("returnNumber", returnNumber),
                        checkRequired("returnReason", returnReason),
                        checkRequired("shippedAt", shippedAt),
                        checkRequired("updates", updates).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Tracking = apply {
                if (validated) {
                    return@apply
                }

                number()
                returnNumber()
                returnReason()
                shippedAt()
                updates().forEach { it.validate() }
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
                (if (number.asKnown().isPresent) 1 else 0) +
                    (if (returnNumber.asKnown().isPresent) 1 else 0) +
                    (if (returnReason.asKnown().isPresent) 1 else 0) +
                    (if (shippedAt.asKnown().isPresent) 1 else 0) +
                    (updates.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

            class Update
            private constructor(
                private val carrierEstimatedDeliveryAt: JsonField<OffsetDateTime>,
                private val category: JsonField<Category>,
                private val city: JsonField<String>,
                private val createdAt: JsonField<OffsetDateTime>,
                private val postalCode: JsonField<String>,
                private val state: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("carrier_estimated_delivery_at")
                    @ExcludeMissing
                    carrierEstimatedDeliveryAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                    @JsonProperty("category")
                    @ExcludeMissing
                    category: JsonField<Category> = JsonMissing.of(),
                    @JsonProperty("city")
                    @ExcludeMissing
                    city: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("created_at")
                    @ExcludeMissing
                    createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                    @JsonProperty("postal_code")
                    @ExcludeMissing
                    postalCode: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("state")
                    @ExcludeMissing
                    state: JsonField<String> = JsonMissing.of(),
                ) : this(
                    carrierEstimatedDeliveryAt,
                    category,
                    city,
                    createdAt,
                    postalCode,
                    state,
                    mutableMapOf(),
                )

                /**
                 * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time when the
                 * carrier expects the card to be delivered.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun carrierEstimatedDeliveryAt(): Optional<OffsetDateTime> =
                    carrierEstimatedDeliveryAt.getOptional("carrier_estimated_delivery_at")

                /**
                 * The type of tracking event.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun category(): Category = category.getRequired("category")

                /**
                 * The city where the event took place.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun city(): Optional<String> = city.getOptional("city")

                /**
                 * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
                 * tracking event took place.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

                /**
                 * The postal code where the event took place.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun postalCode(): Optional<String> = postalCode.getOptional("postal_code")

                /**
                 * The state where the event took place.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun state(): Optional<String> = state.getOptional("state")

                /**
                 * Returns the raw JSON value of [carrierEstimatedDeliveryAt].
                 *
                 * Unlike [carrierEstimatedDeliveryAt], this method doesn't throw if the JSON field
                 * has an unexpected type.
                 */
                @JsonProperty("carrier_estimated_delivery_at")
                @ExcludeMissing
                fun _carrierEstimatedDeliveryAt(): JsonField<OffsetDateTime> =
                    carrierEstimatedDeliveryAt

                /**
                 * Returns the raw JSON value of [category].
                 *
                 * Unlike [category], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("category")
                @ExcludeMissing
                fun _category(): JsonField<Category> = category

                /**
                 * Returns the raw JSON value of [city].
                 *
                 * Unlike [city], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

                /**
                 * Returns the raw JSON value of [createdAt].
                 *
                 * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("created_at")
                @ExcludeMissing
                fun _createdAt(): JsonField<OffsetDateTime> = createdAt

                /**
                 * Returns the raw JSON value of [postalCode].
                 *
                 * Unlike [postalCode], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("postal_code")
                @ExcludeMissing
                fun _postalCode(): JsonField<String> = postalCode

                /**
                 * Returns the raw JSON value of [state].
                 *
                 * Unlike [state], this method doesn't throw if the JSON field has an unexpected
                 * type.
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
                     * Returns a mutable builder for constructing an instance of [Update].
                     *
                     * The following fields are required:
                     * ```java
                     * .carrierEstimatedDeliveryAt()
                     * .category()
                     * .city()
                     * .createdAt()
                     * .postalCode()
                     * .state()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Update]. */
                class Builder internal constructor() {

                    private var carrierEstimatedDeliveryAt: JsonField<OffsetDateTime>? = null
                    private var category: JsonField<Category>? = null
                    private var city: JsonField<String>? = null
                    private var createdAt: JsonField<OffsetDateTime>? = null
                    private var postalCode: JsonField<String>? = null
                    private var state: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(update: Update) = apply {
                        carrierEstimatedDeliveryAt = update.carrierEstimatedDeliveryAt
                        category = update.category
                        city = update.city
                        createdAt = update.createdAt
                        postalCode = update.postalCode
                        state = update.state
                        additionalProperties = update.additionalProperties.toMutableMap()
                    }

                    /**
                     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time when the
                     * carrier expects the card to be delivered.
                     */
                    fun carrierEstimatedDeliveryAt(carrierEstimatedDeliveryAt: OffsetDateTime?) =
                        carrierEstimatedDeliveryAt(JsonField.ofNullable(carrierEstimatedDeliveryAt))

                    /**
                     * Alias for calling [Builder.carrierEstimatedDeliveryAt] with
                     * `carrierEstimatedDeliveryAt.orElse(null)`.
                     */
                    fun carrierEstimatedDeliveryAt(
                        carrierEstimatedDeliveryAt: Optional<OffsetDateTime>
                    ) = carrierEstimatedDeliveryAt(carrierEstimatedDeliveryAt.getOrNull())

                    /**
                     * Sets [Builder.carrierEstimatedDeliveryAt] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.carrierEstimatedDeliveryAt] with a
                     * well-typed [OffsetDateTime] value instead. This method is primarily for
                     * setting the field to an undocumented or not yet supported value.
                     */
                    fun carrierEstimatedDeliveryAt(
                        carrierEstimatedDeliveryAt: JsonField<OffsetDateTime>
                    ) = apply { this.carrierEstimatedDeliveryAt = carrierEstimatedDeliveryAt }

                    /** The type of tracking event. */
                    fun category(category: Category) = category(JsonField.of(category))

                    /**
                     * Sets [Builder.category] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.category] with a well-typed [Category] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun category(category: JsonField<Category>) = apply { this.category = category }

                    /** The city where the event took place. */
                    fun city(city: String?) = city(JsonField.ofNullable(city))

                    /** Alias for calling [Builder.city] with `city.orElse(null)`. */
                    fun city(city: Optional<String>) = city(city.getOrNull())

                    /**
                     * Sets [Builder.city] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.city] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun city(city: JsonField<String>) = apply { this.city = city }

                    /**
                     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which
                     * the tracking event took place.
                     */
                    fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

                    /**
                     * Sets [Builder.createdAt] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.createdAt] with a well-typed
                     * [OffsetDateTime] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                        this.createdAt = createdAt
                    }

                    /** The postal code where the event took place. */
                    fun postalCode(postalCode: String?) =
                        postalCode(JsonField.ofNullable(postalCode))

                    /** Alias for calling [Builder.postalCode] with `postalCode.orElse(null)`. */
                    fun postalCode(postalCode: Optional<String>) =
                        postalCode(postalCode.getOrNull())

                    /**
                     * Sets [Builder.postalCode] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.postalCode] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun postalCode(postalCode: JsonField<String>) = apply {
                        this.postalCode = postalCode
                    }

                    /** The state where the event took place. */
                    fun state(state: String?) = state(JsonField.ofNullable(state))

                    /** Alias for calling [Builder.state] with `state.orElse(null)`. */
                    fun state(state: Optional<String>) = state(state.getOrNull())

                    /**
                     * Sets [Builder.state] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.state] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun state(state: JsonField<String>) = apply { this.state = state }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAlladditional_properties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAlladditional_properties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAlladditional_properties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Update].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .carrierEstimatedDeliveryAt()
                     * .category()
                     * .city()
                     * .createdAt()
                     * .postalCode()
                     * .state()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Update =
                        Update(
                            checkRequired("carrierEstimatedDeliveryAt", carrierEstimatedDeliveryAt),
                            checkRequired("category", category),
                            checkRequired("city", city),
                            checkRequired("createdAt", createdAt),
                            checkRequired("postalCode", postalCode),
                            checkRequired("state", state),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Update = apply {
                    if (validated) {
                        return@apply
                    }

                    carrierEstimatedDeliveryAt()
                    category().validate()
                    city()
                    createdAt()
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
                    (if (carrierEstimatedDeliveryAt.asKnown().isPresent) 1 else 0) +
                        (category.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (city.asKnown().isPresent) 1 else 0) +
                        (if (createdAt.asKnown().isPresent) 1 else 0) +
                        (if (postalCode.asKnown().isPresent) 1 else 0) +
                        (if (state.asKnown().isPresent) 1 else 0)

                /** The type of tracking event. */
                class Category
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        /** The physical card is in transit. */
                        @JvmField val IN_TRANSIT = of("in_transit")

                        /** The physical card has been processed for delivery. */
                        @JvmField val PROCESSED_FOR_DELIVERY = of("processed_for_delivery")

                        /** The physical card has been delivered. */
                        @JvmField val DELIVERED = of("delivered")

                        /** Delivery failed and the physical card was returned to sender. */
                        @JvmField val RETURNED_TO_SENDER = of("returned_to_sender")

                        @JvmStatic fun of(value: String) = Category(JsonField.of(value))
                    }

                    /** An enum containing [Category]'s known values. */
                    enum class Known {
                        /** The physical card is in transit. */
                        IN_TRANSIT,
                        /** The physical card has been processed for delivery. */
                        PROCESSED_FOR_DELIVERY,
                        /** The physical card has been delivered. */
                        DELIVERED,
                        /** Delivery failed and the physical card was returned to sender. */
                        RETURNED_TO_SENDER,
                    }

                    /**
                     * An enum containing [Category]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [Category] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        /** The physical card is in transit. */
                        IN_TRANSIT,
                        /** The physical card has been processed for delivery. */
                        PROCESSED_FOR_DELIVERY,
                        /** The physical card has been delivered. */
                        DELIVERED,
                        /** Delivery failed and the physical card was returned to sender. */
                        RETURNED_TO_SENDER,
                        /**
                         * An enum member indicating that [Category] was instantiated with an
                         * unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            IN_TRANSIT -> Value.IN_TRANSIT
                            PROCESSED_FOR_DELIVERY -> Value.PROCESSED_FOR_DELIVERY
                            DELIVERED -> Value.DELIVERED
                            RETURNED_TO_SENDER -> Value.RETURNED_TO_SENDER
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws IncreaseInvalidDataException if this class instance's value is a not
                     *   a known member.
                     */
                    fun known(): Known =
                        when (this) {
                            IN_TRANSIT -> Known.IN_TRANSIT
                            PROCESSED_FOR_DELIVERY -> Known.PROCESSED_FOR_DELIVERY
                            DELIVERED -> Known.DELIVERED
                            RETURNED_TO_SENDER -> Known.RETURNED_TO_SENDER
                            else -> throw IncreaseInvalidDataException("Unknown Category: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws IncreaseInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            IncreaseInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

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

                    return other is Update &&
                        carrierEstimatedDeliveryAt == other.carrierEstimatedDeliveryAt &&
                        category == other.category &&
                        city == other.city &&
                        createdAt == other.createdAt &&
                        postalCode == other.postalCode &&
                        state == other.state &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        carrierEstimatedDeliveryAt,
                        category,
                        city,
                        createdAt,
                        postalCode,
                        state,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Update{carrierEstimatedDeliveryAt=$carrierEstimatedDeliveryAt, category=$category, city=$city, createdAt=$createdAt, postalCode=$postalCode, state=$state, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Tracking &&
                    number == other.number &&
                    returnNumber == other.returnNumber &&
                    returnReason == other.returnReason &&
                    shippedAt == other.shippedAt &&
                    updates == other.updates &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    number,
                    returnNumber,
                    returnReason,
                    shippedAt,
                    updates,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Tracking{number=$number, returnNumber=$returnNumber, returnReason=$returnReason, shippedAt=$shippedAt, updates=$updates, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Shipment &&
                address == other.address &&
                method == other.method &&
                schedule == other.schedule &&
                status == other.status &&
                tracking == other.tracking &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(address, method, schedule, status, tracking, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Shipment{address=$address, method=$method, schedule=$schedule, status=$status, tracking=$tracking, additionalProperties=$additionalProperties}"
    }

    /** The status of the Physical Card. */
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

            /** The physical card is active. */
            @JvmField val ACTIVE = of("active")

            /** The physical card is temporarily disabled. */
            @JvmField val DISABLED = of("disabled")

            /** The physical card is permanently canceled. */
            @JvmField val CANCELED = of("canceled")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            /** The physical card is active. */
            ACTIVE,
            /** The physical card is temporarily disabled. */
            DISABLED,
            /** The physical card is permanently canceled. */
            CANCELED,
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
            /** The physical card is active. */
            ACTIVE,
            /** The physical card is temporarily disabled. */
            DISABLED,
            /** The physical card is permanently canceled. */
            CANCELED,
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
                ACTIVE -> Value.ACTIVE
                DISABLED -> Value.DISABLED
                CANCELED -> Value.CANCELED
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
                ACTIVE -> Known.ACTIVE
                DISABLED -> Known.DISABLED
                CANCELED -> Known.CANCELED
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
     * `physical_card`.
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

            @JvmField val PHYSICAL_CARD = of("physical_card")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            PHYSICAL_CARD
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
            PHYSICAL_CARD,
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
                PHYSICAL_CARD -> Value.PHYSICAL_CARD
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
                PHYSICAL_CARD -> Known.PHYSICAL_CARD
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

        return other is PhysicalCard &&
            id == other.id &&
            cardId == other.cardId &&
            cardholder == other.cardholder &&
            createdAt == other.createdAt &&
            idempotencyKey == other.idempotencyKey &&
            physicalCardProfileId == other.physicalCardProfileId &&
            shipment == other.shipment &&
            status == other.status &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            cardId,
            cardholder,
            createdAt,
            idempotencyKey,
            physicalCardProfileId,
            shipment,
            status,
            type,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PhysicalCard{id=$id, cardId=$cardId, cardholder=$cardholder, createdAt=$createdAt, idempotencyKey=$idempotencyKey, physicalCardProfileId=$physicalCardProfileId, shipment=$shipment, status=$status, type=$type, additionalProperties=$additionalProperties}"
}
