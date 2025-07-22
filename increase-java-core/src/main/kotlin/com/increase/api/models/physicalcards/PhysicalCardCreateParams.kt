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
import com.increase.api.core.Params
import com.increase.api.core.checkRequired
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.errors.IncreaseInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Create a Physical Card */
class PhysicalCardCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The underlying card representing this physical card.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun cardId(): String = body.cardId()

    /**
     * Details about the cardholder, as it will appear on the physical card.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun cardholder(): Cardholder = body.cardholder()

    /**
     * The details used to ship this physical card.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun shipment(): Shipment = body.shipment()

    /**
     * The physical card profile to use for this physical card. The latest default physical card
     * profile will be used if not provided.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun physicalCardProfileId(): Optional<String> = body.physicalCardProfileId()

    /**
     * Returns the raw JSON value of [cardId].
     *
     * Unlike [cardId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _cardId(): JsonField<String> = body._cardId()

    /**
     * Returns the raw JSON value of [cardholder].
     *
     * Unlike [cardholder], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _cardholder(): JsonField<Cardholder> = body._cardholder()

    /**
     * Returns the raw JSON value of [shipment].
     *
     * Unlike [shipment], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _shipment(): JsonField<Shipment> = body._shipment()

    /**
     * Returns the raw JSON value of [physicalCardProfileId].
     *
     * Unlike [physicalCardProfileId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _physicalCardProfileId(): JsonField<String> = body._physicalCardProfileId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PhysicalCardCreateParams].
         *
         * The following fields are required:
         * ```java
         * .cardId()
         * .cardholder()
         * .shipment()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PhysicalCardCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(physicalCardCreateParams: PhysicalCardCreateParams) = apply {
            body = physicalCardCreateParams.body.toBuilder()
            additionalHeaders = physicalCardCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = physicalCardCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [cardId]
         * - [cardholder]
         * - [shipment]
         * - [physicalCardProfileId]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The underlying card representing this physical card. */
        fun cardId(cardId: String) = apply { body.cardId(cardId) }

        /**
         * Sets [Builder.cardId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cardId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun cardId(cardId: JsonField<String>) = apply { body.cardId(cardId) }

        /** Details about the cardholder, as it will appear on the physical card. */
        fun cardholder(cardholder: Cardholder) = apply { body.cardholder(cardholder) }

        /**
         * Sets [Builder.cardholder] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cardholder] with a well-typed [Cardholder] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun cardholder(cardholder: JsonField<Cardholder>) = apply { body.cardholder(cardholder) }

        /** The details used to ship this physical card. */
        fun shipment(shipment: Shipment) = apply { body.shipment(shipment) }

        /**
         * Sets [Builder.shipment] to an arbitrary JSON value.
         *
         * You should usually call [Builder.shipment] with a well-typed [Shipment] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun shipment(shipment: JsonField<Shipment>) = apply { body.shipment(shipment) }

        /**
         * The physical card profile to use for this physical card. The latest default physical card
         * profile will be used if not provided.
         */
        fun physicalCardProfileId(physicalCardProfileId: String) = apply {
            body.physicalCardProfileId(physicalCardProfileId)
        }

        /**
         * Sets [Builder.physicalCardProfileId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.physicalCardProfileId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun physicalCardProfileId(physicalCardProfileId: JsonField<String>) = apply {
            body.physicalCardProfileId(physicalCardProfileId)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [PhysicalCardCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .cardId()
         * .cardholder()
         * .shipment()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PhysicalCardCreateParams =
            PhysicalCardCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val cardId: JsonField<String>,
        private val cardholder: JsonField<Cardholder>,
        private val shipment: JsonField<Shipment>,
        private val physicalCardProfileId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("card_id") @ExcludeMissing cardId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("cardholder")
            @ExcludeMissing
            cardholder: JsonField<Cardholder> = JsonMissing.of(),
            @JsonProperty("shipment")
            @ExcludeMissing
            shipment: JsonField<Shipment> = JsonMissing.of(),
            @JsonProperty("physical_card_profile_id")
            @ExcludeMissing
            physicalCardProfileId: JsonField<String> = JsonMissing.of(),
        ) : this(cardId, cardholder, shipment, physicalCardProfileId, mutableMapOf())

        /**
         * The underlying card representing this physical card.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun cardId(): String = cardId.getRequired("card_id")

        /**
         * Details about the cardholder, as it will appear on the physical card.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun cardholder(): Cardholder = cardholder.getRequired("cardholder")

        /**
         * The details used to ship this physical card.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun shipment(): Shipment = shipment.getRequired("shipment")

        /**
         * The physical card profile to use for this physical card. The latest default physical card
         * profile will be used if not provided.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun physicalCardProfileId(): Optional<String> =
            physicalCardProfileId.getOptional("physical_card_profile_id")

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
         * Returns the raw JSON value of [shipment].
         *
         * Unlike [shipment], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("shipment") @ExcludeMissing fun _shipment(): JsonField<Shipment> = shipment

        /**
         * Returns the raw JSON value of [physicalCardProfileId].
         *
         * Unlike [physicalCardProfileId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("physical_card_profile_id")
        @ExcludeMissing
        fun _physicalCardProfileId(): JsonField<String> = physicalCardProfileId

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .cardId()
             * .cardholder()
             * .shipment()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var cardId: JsonField<String>? = null
            private var cardholder: JsonField<Cardholder>? = null
            private var shipment: JsonField<Shipment>? = null
            private var physicalCardProfileId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                cardId = body.cardId
                cardholder = body.cardholder
                shipment = body.shipment
                physicalCardProfileId = body.physicalCardProfileId
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The underlying card representing this physical card. */
            fun cardId(cardId: String) = cardId(JsonField.of(cardId))

            /**
             * Sets [Builder.cardId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cardId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cardId(cardId: JsonField<String>) = apply { this.cardId = cardId }

            /** Details about the cardholder, as it will appear on the physical card. */
            fun cardholder(cardholder: Cardholder) = cardholder(JsonField.of(cardholder))

            /**
             * Sets [Builder.cardholder] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cardholder] with a well-typed [Cardholder] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cardholder(cardholder: JsonField<Cardholder>) = apply {
                this.cardholder = cardholder
            }

            /** The details used to ship this physical card. */
            fun shipment(shipment: Shipment) = shipment(JsonField.of(shipment))

            /**
             * Sets [Builder.shipment] to an arbitrary JSON value.
             *
             * You should usually call [Builder.shipment] with a well-typed [Shipment] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun shipment(shipment: JsonField<Shipment>) = apply { this.shipment = shipment }

            /**
             * The physical card profile to use for this physical card. The latest default physical
             * card profile will be used if not provided.
             */
            fun physicalCardProfileId(physicalCardProfileId: String) =
                physicalCardProfileId(JsonField.of(physicalCardProfileId))

            /**
             * Sets [Builder.physicalCardProfileId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.physicalCardProfileId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun physicalCardProfileId(physicalCardProfileId: JsonField<String>) = apply {
                this.physicalCardProfileId = physicalCardProfileId
            }

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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .cardId()
             * .cardholder()
             * .shipment()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("cardId", cardId),
                    checkRequired("cardholder", cardholder),
                    checkRequired("shipment", shipment),
                    physicalCardProfileId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            cardId()
            cardholder().validate()
            shipment().validate()
            physicalCardProfileId()
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
            (if (cardId.asKnown().isPresent) 1 else 0) +
                (cardholder.asKnown().getOrNull()?.validity() ?: 0) +
                (shipment.asKnown().getOrNull()?.validity() ?: 0) +
                (if (physicalCardProfileId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && cardId == other.cardId && cardholder == other.cardholder && shipment == other.shipment && physicalCardProfileId == other.physicalCardProfileId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(cardId, cardholder, shipment, physicalCardProfileId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{cardId=$cardId, cardholder=$cardholder, shipment=$shipment, physicalCardProfileId=$physicalCardProfileId, additionalProperties=$additionalProperties}"
    }

    /** Details about the cardholder, as it will appear on the physical card. */
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

            return /* spotless:off */ other is Cardholder && firstName == other.firstName && lastName == other.lastName && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(firstName, lastName, additionalProperties) }
        /* spotless:on */

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
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("address") @ExcludeMissing address: JsonField<Address> = JsonMissing.of(),
            @JsonProperty("method") @ExcludeMissing method: JsonField<Method> = JsonMissing.of(),
            @JsonProperty("schedule")
            @ExcludeMissing
            schedule: JsonField<Schedule> = JsonMissing.of(),
        ) : this(address, method, schedule, mutableMapOf())

        /**
         * The address to where the card should be shipped.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun address(): Address = address.getRequired("address")

        /**
         * The shipping method to use.
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
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun schedule(): Optional<Schedule> = schedule.getOptional("schedule")

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
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Shipment]. */
        class Builder internal constructor() {

            private var address: JsonField<Address>? = null
            private var method: JsonField<Method>? = null
            private var schedule: JsonField<Schedule> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(shipment: Shipment) = apply {
                address = shipment.address
                method = shipment.method
                schedule = shipment.schedule
                additionalProperties = shipment.additionalProperties.toMutableMap()
            }

            /** The address to where the card should be shipped. */
            fun address(address: Address) = address(JsonField.of(address))

            /**
             * Sets [Builder.address] to an arbitrary JSON value.
             *
             * You should usually call [Builder.address] with a well-typed [Address] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun address(address: JsonField<Address>) = apply { this.address = address }

            /** The shipping method to use. */
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
             * Returns an immutable instance of [Shipment].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .address()
             * .method()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Shipment =
                Shipment(
                    checkRequired("address", address),
                    checkRequired("method", method),
                    schedule,
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
            schedule().ifPresent { it.validate() }
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
                (schedule.asKnown().getOrNull()?.validity() ?: 0)

        /** The address to where the card should be shipped. */
        class Address
        private constructor(
            private val city: JsonField<String>,
            private val line1: JsonField<String>,
            private val name: JsonField<String>,
            private val postalCode: JsonField<String>,
            private val state: JsonField<String>,
            private val country: JsonField<String>,
            private val line2: JsonField<String>,
            private val line3: JsonField<String>,
            private val phoneNumber: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("city") @ExcludeMissing city: JsonField<String> = JsonMissing.of(),
                @JsonProperty("line1") @ExcludeMissing line1: JsonField<String> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("postal_code")
                @ExcludeMissing
                postalCode: JsonField<String> = JsonMissing.of(),
                @JsonProperty("state") @ExcludeMissing state: JsonField<String> = JsonMissing.of(),
                @JsonProperty("country")
                @ExcludeMissing
                country: JsonField<String> = JsonMissing.of(),
                @JsonProperty("line2") @ExcludeMissing line2: JsonField<String> = JsonMissing.of(),
                @JsonProperty("line3") @ExcludeMissing line3: JsonField<String> = JsonMissing.of(),
                @JsonProperty("phone_number")
                @ExcludeMissing
                phoneNumber: JsonField<String> = JsonMissing.of(),
            ) : this(
                city,
                line1,
                name,
                postalCode,
                state,
                country,
                line2,
                line3,
                phoneNumber,
                mutableMapOf(),
            )

            /**
             * The city of the shipping address.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun city(): String = city.getRequired("city")

            /**
             * The first line of the shipping address.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun line1(): String = line1.getRequired("line1")

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
             * The two-character ISO 3166-1 code of the country where the card should be shipped
             * (e.g., `US`). Please reach out to [support@increase.com](mailto:support@increase.com)
             * to ship cards internationally.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun country(): Optional<String> = country.getOptional("country")

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
             * The phone number of the recipient.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun phoneNumber(): Optional<String> = phoneNumber.getOptional("phone_number")

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

            /**
             * Returns the raw JSON value of [country].
             *
             * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

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
             * Returns the raw JSON value of [phoneNumber].
             *
             * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("phone_number")
            @ExcludeMissing
            fun _phoneNumber(): JsonField<String> = phoneNumber

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
                 * .line1()
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
                private var line1: JsonField<String>? = null
                private var name: JsonField<String>? = null
                private var postalCode: JsonField<String>? = null
                private var state: JsonField<String>? = null
                private var country: JsonField<String> = JsonMissing.of()
                private var line2: JsonField<String> = JsonMissing.of()
                private var line3: JsonField<String> = JsonMissing.of()
                private var phoneNumber: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(address: Address) = apply {
                    city = address.city
                    line1 = address.line1
                    name = address.name
                    postalCode = address.postalCode
                    state = address.state
                    country = address.country
                    line2 = address.line2
                    line3 = address.line3
                    phoneNumber = address.phoneNumber
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

                /**
                 * The two-character ISO 3166-1 code of the country where the card should be shipped
                 * (e.g., `US`). Please reach out to
                 * [support@increase.com](mailto:support@increase.com) to ship cards
                 * internationally.
                 */
                fun country(country: String) = country(JsonField.of(country))

                /**
                 * Sets [Builder.country] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.country] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun country(country: JsonField<String>) = apply { this.country = country }

                /** The second line of the shipping address. */
                fun line2(line2: String) = line2(JsonField.of(line2))

                /**
                 * Sets [Builder.line2] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.line2] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

                /** The third line of the shipping address. */
                fun line3(line3: String) = line3(JsonField.of(line3))

                /**
                 * Sets [Builder.line3] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.line3] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun line3(line3: JsonField<String>) = apply { this.line3 = line3 }

                /** The phone number of the recipient. */
                fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

                /**
                 * Sets [Builder.phoneNumber] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.phoneNumber] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun phoneNumber(phoneNumber: JsonField<String>) = apply {
                    this.phoneNumber = phoneNumber
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
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
                 * .line1()
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
                        checkRequired("line1", line1),
                        checkRequired("name", name),
                        checkRequired("postalCode", postalCode),
                        checkRequired("state", state),
                        country,
                        line2,
                        line3,
                        phoneNumber,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Address = apply {
                if (validated) {
                    return@apply
                }

                city()
                line1()
                name()
                postalCode()
                state()
                country()
                line2()
                line3()
                phoneNumber()
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
                    (if (name.asKnown().isPresent) 1 else 0) +
                    (if (postalCode.asKnown().isPresent) 1 else 0) +
                    (if (state.asKnown().isPresent) 1 else 0) +
                    (if (country.asKnown().isPresent) 1 else 0) +
                    (if (line2.asKnown().isPresent) 1 else 0) +
                    (if (line3.asKnown().isPresent) 1 else 0) +
                    (if (phoneNumber.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Address && city == other.city && line1 == other.line1 && name == other.name && postalCode == other.postalCode && state == other.state && country == other.country && line2 == other.line2 && line3 == other.line3 && phoneNumber == other.phoneNumber && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(city, line1, name, postalCode, state, country, line2, line3, phoneNumber, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Address{city=$city, line1=$line1, name=$name, postalCode=$postalCode, state=$state, country=$country, line2=$line2, line3=$line3, phoneNumber=$phoneNumber, additionalProperties=$additionalProperties}"
        }

        /** The shipping method to use. */
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

                return /* spotless:off */ other is Method && value == other.value /* spotless:on */
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

                return /* spotless:off */ other is Schedule && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Shipment && address == other.address && method == other.method && schedule == other.schedule && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(address, method, schedule, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Shipment{address=$address, method=$method, schedule=$schedule, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PhysicalCardCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "PhysicalCardCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
