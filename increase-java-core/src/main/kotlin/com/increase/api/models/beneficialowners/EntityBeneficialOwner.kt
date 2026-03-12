// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.beneficialowners

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
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Beneficial owners are the individuals who control or own 25% or more of a `corporation` entity.
 * Beneficial owners are always people, and never organizations. Generally, you will need to submit
 * between 1 and 5 beneficial owners for every `corporation` entity. You should update and archive
 * beneficial owners for a corporation entity as their details change.
 */
class EntityBeneficialOwner
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val companyTitle: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val entityId: JsonField<String>,
    private val idempotencyKey: JsonField<String>,
    private val individual: JsonField<Individual>,
    private val prongs: JsonField<List<Prong>>,
    private val type: JsonField<Type>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("company_title")
        @ExcludeMissing
        companyTitle: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("entity_id") @ExcludeMissing entityId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("idempotency_key")
        @ExcludeMissing
        idempotencyKey: JsonField<String> = JsonMissing.of(),
        @JsonProperty("individual")
        @ExcludeMissing
        individual: JsonField<Individual> = JsonMissing.of(),
        @JsonProperty("prongs") @ExcludeMissing prongs: JsonField<List<Prong>> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
    ) : this(
        id,
        companyTitle,
        createdAt,
        entityId,
        idempotencyKey,
        individual,
        prongs,
        type,
        mutableMapOf(),
    )

    /**
     * The identifier of this beneficial owner.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * This person's role or title within the entity.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun companyTitle(): Optional<String> = companyTitle.getOptional("company_title")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Beneficial Owner was
     * created.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * The identifier of the Entity to which this beneficial owner belongs.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun entityId(): String = entityId.getRequired("entity_id")

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
     * Personal details for the beneficial owner.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun individual(): Individual = individual.getRequired("individual")

    /**
     * Why this person is considered a beneficial owner of the entity.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun prongs(): List<Prong> = prongs.getRequired("prongs")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `entity_beneficial_owner`.
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
     * Returns the raw JSON value of [companyTitle].
     *
     * Unlike [companyTitle], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("company_title")
    @ExcludeMissing
    fun _companyTitle(): JsonField<String> = companyTitle

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
     * Returns the raw JSON value of [idempotencyKey].
     *
     * Unlike [idempotencyKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idempotency_key")
    @ExcludeMissing
    fun _idempotencyKey(): JsonField<String> = idempotencyKey

    /**
     * Returns the raw JSON value of [individual].
     *
     * Unlike [individual], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("individual")
    @ExcludeMissing
    fun _individual(): JsonField<Individual> = individual

    /**
     * Returns the raw JSON value of [prongs].
     *
     * Unlike [prongs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("prongs") @ExcludeMissing fun _prongs(): JsonField<List<Prong>> = prongs

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
         * Returns a mutable builder for constructing an instance of [EntityBeneficialOwner].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .companyTitle()
         * .createdAt()
         * .entityId()
         * .idempotencyKey()
         * .individual()
         * .prongs()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EntityBeneficialOwner]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var companyTitle: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var entityId: JsonField<String>? = null
        private var idempotencyKey: JsonField<String>? = null
        private var individual: JsonField<Individual>? = null
        private var prongs: JsonField<MutableList<Prong>>? = null
        private var type: JsonField<Type>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(entityBeneficialOwner: EntityBeneficialOwner) = apply {
            id = entityBeneficialOwner.id
            companyTitle = entityBeneficialOwner.companyTitle
            createdAt = entityBeneficialOwner.createdAt
            entityId = entityBeneficialOwner.entityId
            idempotencyKey = entityBeneficialOwner.idempotencyKey
            individual = entityBeneficialOwner.individual
            prongs = entityBeneficialOwner.prongs.map { it.toMutableList() }
            type = entityBeneficialOwner.type
            additionalProperties = entityBeneficialOwner.additionalProperties.toMutableMap()
        }

        /** The identifier of this beneficial owner. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** This person's role or title within the entity. */
        fun companyTitle(companyTitle: String?) = companyTitle(JsonField.ofNullable(companyTitle))

        /** Alias for calling [Builder.companyTitle] with `companyTitle.orElse(null)`. */
        fun companyTitle(companyTitle: Optional<String>) = companyTitle(companyTitle.getOrNull())

        /**
         * Sets [Builder.companyTitle] to an arbitrary JSON value.
         *
         * You should usually call [Builder.companyTitle] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun companyTitle(companyTitle: JsonField<String>) = apply {
            this.companyTitle = companyTitle
        }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Beneficial Owner
         * was created.
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

        /** The identifier of the Entity to which this beneficial owner belongs. */
        fun entityId(entityId: String) = entityId(JsonField.of(entityId))

        /**
         * Sets [Builder.entityId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.entityId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun entityId(entityId: JsonField<String>) = apply { this.entityId = entityId }

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

        /** Personal details for the beneficial owner. */
        fun individual(individual: Individual) = individual(JsonField.of(individual))

        /**
         * Sets [Builder.individual] to an arbitrary JSON value.
         *
         * You should usually call [Builder.individual] with a well-typed [Individual] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun individual(individual: JsonField<Individual>) = apply { this.individual = individual }

        /** Why this person is considered a beneficial owner of the entity. */
        fun prongs(prongs: List<Prong>) = prongs(JsonField.of(prongs))

        /**
         * Sets [Builder.prongs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.prongs] with a well-typed `List<Prong>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun prongs(prongs: JsonField<List<Prong>>) = apply {
            this.prongs = prongs.map { it.toMutableList() }
        }

        /**
         * Adds a single [Prong] to [prongs].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addProng(prong: Prong) = apply {
            prongs =
                (prongs ?: JsonField.of(mutableListOf())).also {
                    checkKnown("prongs", it).add(prong)
                }
        }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `entity_beneficial_owner`.
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
         * Returns an immutable instance of [EntityBeneficialOwner].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .companyTitle()
         * .createdAt()
         * .entityId()
         * .idempotencyKey()
         * .individual()
         * .prongs()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EntityBeneficialOwner =
            EntityBeneficialOwner(
                checkRequired("id", id),
                checkRequired("companyTitle", companyTitle),
                checkRequired("createdAt", createdAt),
                checkRequired("entityId", entityId),
                checkRequired("idempotencyKey", idempotencyKey),
                checkRequired("individual", individual),
                checkRequired("prongs", prongs).map { it.toImmutable() },
                checkRequired("type", type),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): EntityBeneficialOwner = apply {
        if (validated) {
            return@apply
        }

        id()
        companyTitle()
        createdAt()
        entityId()
        idempotencyKey()
        individual().validate()
        prongs().forEach { it.validate() }
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
            (if (companyTitle.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (entityId.asKnown().isPresent) 1 else 0) +
            (if (idempotencyKey.asKnown().isPresent) 1 else 0) +
            (individual.asKnown().getOrNull()?.validity() ?: 0) +
            (prongs.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0)

    /** Personal details for the beneficial owner. */
    class Individual
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val address: JsonField<Address>,
        private val dateOfBirth: JsonField<LocalDate>,
        private val identification: JsonField<Identification>,
        private val name: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("address") @ExcludeMissing address: JsonField<Address> = JsonMissing.of(),
            @JsonProperty("date_of_birth")
            @ExcludeMissing
            dateOfBirth: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("identification")
            @ExcludeMissing
            identification: JsonField<Identification> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        ) : this(address, dateOfBirth, identification, name, mutableMapOf())

        /**
         * The person's address.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun address(): Address = address.getRequired("address")

        /**
         * The person's date of birth in YYYY-MM-DD format.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun dateOfBirth(): LocalDate = dateOfBirth.getRequired("date_of_birth")

        /**
         * A means of verifying the person's identity.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun identification(): Identification = identification.getRequired("identification")

        /**
         * The person's legal name.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * Returns the raw JSON value of [address].
         *
         * Unlike [address], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("address") @ExcludeMissing fun _address(): JsonField<Address> = address

        /**
         * Returns the raw JSON value of [dateOfBirth].
         *
         * Unlike [dateOfBirth], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("date_of_birth")
        @ExcludeMissing
        fun _dateOfBirth(): JsonField<LocalDate> = dateOfBirth

        /**
         * Returns the raw JSON value of [identification].
         *
         * Unlike [identification], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("identification")
        @ExcludeMissing
        fun _identification(): JsonField<Identification> = identification

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
             * Returns a mutable builder for constructing an instance of [Individual].
             *
             * The following fields are required:
             * ```java
             * .address()
             * .dateOfBirth()
             * .identification()
             * .name()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Individual]. */
        class Builder internal constructor() {

            private var address: JsonField<Address>? = null
            private var dateOfBirth: JsonField<LocalDate>? = null
            private var identification: JsonField<Identification>? = null
            private var name: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(individual: Individual) = apply {
                address = individual.address
                dateOfBirth = individual.dateOfBirth
                identification = individual.identification
                name = individual.name
                additionalProperties = individual.additionalProperties.toMutableMap()
            }

            /** The person's address. */
            fun address(address: Address) = address(JsonField.of(address))

            /**
             * Sets [Builder.address] to an arbitrary JSON value.
             *
             * You should usually call [Builder.address] with a well-typed [Address] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun address(address: JsonField<Address>) = apply { this.address = address }

            /** The person's date of birth in YYYY-MM-DD format. */
            fun dateOfBirth(dateOfBirth: LocalDate) = dateOfBirth(JsonField.of(dateOfBirth))

            /**
             * Sets [Builder.dateOfBirth] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dateOfBirth] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dateOfBirth(dateOfBirth: JsonField<LocalDate>) = apply {
                this.dateOfBirth = dateOfBirth
            }

            /** A means of verifying the person's identity. */
            fun identification(identification: Identification) =
                identification(JsonField.of(identification))

            /**
             * Sets [Builder.identification] to an arbitrary JSON value.
             *
             * You should usually call [Builder.identification] with a well-typed [Identification]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun identification(identification: JsonField<Identification>) = apply {
                this.identification = identification
            }

            /** The person's legal name. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

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
             * Returns an immutable instance of [Individual].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .address()
             * .dateOfBirth()
             * .identification()
             * .name()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Individual =
                Individual(
                    checkRequired("address", address),
                    checkRequired("dateOfBirth", dateOfBirth),
                    checkRequired("identification", identification),
                    checkRequired("name", name),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Individual = apply {
            if (validated) {
                return@apply
            }

            address().validate()
            dateOfBirth()
            identification().validate()
            name()
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
                (if (dateOfBirth.asKnown().isPresent) 1 else 0) +
                (identification.asKnown().getOrNull()?.validity() ?: 0) +
                (if (name.asKnown().isPresent) 1 else 0)

        /** The person's address. */
        class Address
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val city: JsonField<String>,
            private val country: JsonField<String>,
            private val line1: JsonField<String>,
            private val line2: JsonField<String>,
            private val state: JsonField<String>,
            private val zip: JsonField<String>,
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
                @JsonProperty("state") @ExcludeMissing state: JsonField<String> = JsonMissing.of(),
                @JsonProperty("zip") @ExcludeMissing zip: JsonField<String> = JsonMissing.of(),
            ) : this(city, country, line1, line2, state, zip, mutableMapOf())

            /**
             * The city, district, town, or village of the address.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun city(): Optional<String> = city.getOptional("city")

            /**
             * The two-letter ISO 3166-1 alpha-2 code for the country of the address.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun country(): String = country.getRequired("country")

            /**
             * The first line of the address.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun line1(): String = line1.getRequired("line1")

            /**
             * The second line of the address.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun line2(): Optional<String> = line2.getOptional("line2")

            /**
             * The two-letter United States Postal Service (USPS) abbreviation for the US state,
             * province, or region of the address.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun state(): Optional<String> = state.getOptional("state")

            /**
             * The ZIP or postal code of the address.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun zip(): Optional<String> = zip.getOptional("zip")

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
             * Returns the raw JSON value of [state].
             *
             * Unlike [state], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

            /**
             * Returns the raw JSON value of [zip].
             *
             * Unlike [zip], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("zip") @ExcludeMissing fun _zip(): JsonField<String> = zip

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
                 * .state()
                 * .zip()
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
                private var state: JsonField<String>? = null
                private var zip: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(address: Address) = apply {
                    city = address.city
                    country = address.country
                    line1 = address.line1
                    line2 = address.line2
                    state = address.state
                    zip = address.zip
                    additionalProperties = address.additionalProperties.toMutableMap()
                }

                /** The city, district, town, or village of the address. */
                fun city(city: String?) = city(JsonField.ofNullable(city))

                /** Alias for calling [Builder.city] with `city.orElse(null)`. */
                fun city(city: Optional<String>) = city(city.getOrNull())

                /**
                 * Sets [Builder.city] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.city] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun city(city: JsonField<String>) = apply { this.city = city }

                /** The two-letter ISO 3166-1 alpha-2 code for the country of the address. */
                fun country(country: String) = country(JsonField.of(country))

                /**
                 * Sets [Builder.country] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.country] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun country(country: JsonField<String>) = apply { this.country = country }

                /** The first line of the address. */
                fun line1(line1: String) = line1(JsonField.of(line1))

                /**
                 * Sets [Builder.line1] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.line1] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

                /** The second line of the address. */
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

                /**
                 * The two-letter United States Postal Service (USPS) abbreviation for the US state,
                 * province, or region of the address.
                 */
                fun state(state: String?) = state(JsonField.ofNullable(state))

                /** Alias for calling [Builder.state] with `state.orElse(null)`. */
                fun state(state: Optional<String>) = state(state.getOrNull())

                /**
                 * Sets [Builder.state] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.state] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun state(state: JsonField<String>) = apply { this.state = state }

                /** The ZIP or postal code of the address. */
                fun zip(zip: String?) = zip(JsonField.ofNullable(zip))

                /** Alias for calling [Builder.zip] with `zip.orElse(null)`. */
                fun zip(zip: Optional<String>) = zip(zip.getOrNull())

                /**
                 * Sets [Builder.zip] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.zip] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun zip(zip: JsonField<String>) = apply { this.zip = zip }

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
                 * .country()
                 * .line1()
                 * .line2()
                 * .state()
                 * .zip()
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
                        checkRequired("state", state),
                        checkRequired("zip", zip),
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
                state()
                zip()
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
                    (if (state.asKnown().isPresent) 1 else 0) +
                    (if (zip.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Address &&
                    city == other.city &&
                    country == other.country &&
                    line1 == other.line1 &&
                    line2 == other.line2 &&
                    state == other.state &&
                    zip == other.zip &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(city, country, line1, line2, state, zip, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Address{city=$city, country=$country, line1=$line1, line2=$line2, state=$state, zip=$zip, additionalProperties=$additionalProperties}"
        }

        /** A means of verifying the person's identity. */
        class Identification
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val method: JsonField<Method>,
            private val numberLast4: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("method")
                @ExcludeMissing
                method: JsonField<Method> = JsonMissing.of(),
                @JsonProperty("number_last4")
                @ExcludeMissing
                numberLast4: JsonField<String> = JsonMissing.of(),
            ) : this(method, numberLast4, mutableMapOf())

            /**
             * A method that can be used to verify the individual's identity.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun method(): Method = method.getRequired("method")

            /**
             * The last 4 digits of the identification number that can be used to verify the
             * individual's identity.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun numberLast4(): String = numberLast4.getRequired("number_last4")

            /**
             * Returns the raw JSON value of [method].
             *
             * Unlike [method], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("method") @ExcludeMissing fun _method(): JsonField<Method> = method

            /**
             * Returns the raw JSON value of [numberLast4].
             *
             * Unlike [numberLast4], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("number_last4")
            @ExcludeMissing
            fun _numberLast4(): JsonField<String> = numberLast4

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
                 * Returns a mutable builder for constructing an instance of [Identification].
                 *
                 * The following fields are required:
                 * ```java
                 * .method()
                 * .numberLast4()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Identification]. */
            class Builder internal constructor() {

                private var method: JsonField<Method>? = null
                private var numberLast4: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(identification: Identification) = apply {
                    method = identification.method
                    numberLast4 = identification.numberLast4
                    additionalProperties = identification.additionalProperties.toMutableMap()
                }

                /** A method that can be used to verify the individual's identity. */
                fun method(method: Method) = method(JsonField.of(method))

                /**
                 * Sets [Builder.method] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.method] with a well-typed [Method] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun method(method: JsonField<Method>) = apply { this.method = method }

                /**
                 * The last 4 digits of the identification number that can be used to verify the
                 * individual's identity.
                 */
                fun numberLast4(numberLast4: String) = numberLast4(JsonField.of(numberLast4))

                /**
                 * Sets [Builder.numberLast4] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.numberLast4] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun numberLast4(numberLast4: JsonField<String>) = apply {
                    this.numberLast4 = numberLast4
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
                 * Returns an immutable instance of [Identification].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .method()
                 * .numberLast4()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Identification =
                    Identification(
                        checkRequired("method", method),
                        checkRequired("numberLast4", numberLast4),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Identification = apply {
                if (validated) {
                    return@apply
                }

                method().validate()
                numberLast4()
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
                (method.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (numberLast4.asKnown().isPresent) 1 else 0)

            /** A method that can be used to verify the individual's identity. */
            class Method @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    /** A social security number. */
                    @JvmField val SOCIAL_SECURITY_NUMBER = of("social_security_number")

                    /** An individual taxpayer identification number (ITIN). */
                    @JvmField
                    val INDIVIDUAL_TAXPAYER_IDENTIFICATION_NUMBER =
                        of("individual_taxpayer_identification_number")

                    /** A passport number. */
                    @JvmField val PASSPORT = of("passport")

                    /** A driver's license number. */
                    @JvmField val DRIVERS_LICENSE = of("drivers_license")

                    /** Another identifying document. */
                    @JvmField val OTHER = of("other")

                    @JvmStatic fun of(value: String) = Method(JsonField.of(value))
                }

                /** An enum containing [Method]'s known values. */
                enum class Known {
                    /** A social security number. */
                    SOCIAL_SECURITY_NUMBER,
                    /** An individual taxpayer identification number (ITIN). */
                    INDIVIDUAL_TAXPAYER_IDENTIFICATION_NUMBER,
                    /** A passport number. */
                    PASSPORT,
                    /** A driver's license number. */
                    DRIVERS_LICENSE,
                    /** Another identifying document. */
                    OTHER,
                }

                /**
                 * An enum containing [Method]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Method] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    /** A social security number. */
                    SOCIAL_SECURITY_NUMBER,
                    /** An individual taxpayer identification number (ITIN). */
                    INDIVIDUAL_TAXPAYER_IDENTIFICATION_NUMBER,
                    /** A passport number. */
                    PASSPORT,
                    /** A driver's license number. */
                    DRIVERS_LICENSE,
                    /** Another identifying document. */
                    OTHER,
                    /**
                     * An enum member indicating that [Method] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        SOCIAL_SECURITY_NUMBER -> Value.SOCIAL_SECURITY_NUMBER
                        INDIVIDUAL_TAXPAYER_IDENTIFICATION_NUMBER ->
                            Value.INDIVIDUAL_TAXPAYER_IDENTIFICATION_NUMBER
                        PASSPORT -> Value.PASSPORT
                        DRIVERS_LICENSE -> Value.DRIVERS_LICENSE
                        OTHER -> Value.OTHER
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws IncreaseInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        SOCIAL_SECURITY_NUMBER -> Known.SOCIAL_SECURITY_NUMBER
                        INDIVIDUAL_TAXPAYER_IDENTIFICATION_NUMBER ->
                            Known.INDIVIDUAL_TAXPAYER_IDENTIFICATION_NUMBER
                        PASSPORT -> Known.PASSPORT
                        DRIVERS_LICENSE -> Known.DRIVERS_LICENSE
                        OTHER -> Known.OTHER
                        else -> throw IncreaseInvalidDataException("Unknown Method: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws IncreaseInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Identification &&
                    method == other.method &&
                    numberLast4 == other.numberLast4 &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(method, numberLast4, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Identification{method=$method, numberLast4=$numberLast4, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Individual &&
                address == other.address &&
                dateOfBirth == other.dateOfBirth &&
                identification == other.identification &&
                name == other.name &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(address, dateOfBirth, identification, name, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Individual{address=$address, dateOfBirth=$dateOfBirth, identification=$identification, name=$name, additionalProperties=$additionalProperties}"
    }

    class Prong @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            /** A person with 25% or greater direct or indirect ownership of the entity. */
            @JvmField val OWNERSHIP = of("ownership")

            /** A person who manages, directs, or has significant control of the entity. */
            @JvmField val CONTROL = of("control")

            @JvmStatic fun of(value: String) = Prong(JsonField.of(value))
        }

        /** An enum containing [Prong]'s known values. */
        enum class Known {
            /** A person with 25% or greater direct or indirect ownership of the entity. */
            OWNERSHIP,
            /** A person who manages, directs, or has significant control of the entity. */
            CONTROL,
        }

        /**
         * An enum containing [Prong]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Prong] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            /** A person with 25% or greater direct or indirect ownership of the entity. */
            OWNERSHIP,
            /** A person who manages, directs, or has significant control of the entity. */
            CONTROL,
            /** An enum member indicating that [Prong] was instantiated with an unknown value. */
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
                OWNERSHIP -> Value.OWNERSHIP
                CONTROL -> Value.CONTROL
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
                OWNERSHIP -> Known.OWNERSHIP
                CONTROL -> Known.CONTROL
                else -> throw IncreaseInvalidDataException("Unknown Prong: $value")
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

        fun validate(): Prong = apply {
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

            return other is Prong && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * A constant representing the object's type. For this resource it will always be
     * `entity_beneficial_owner`.
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

            @JvmField val ENTITY_BENEFICIAL_OWNER = of("entity_beneficial_owner")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            ENTITY_BENEFICIAL_OWNER
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
            ENTITY_BENEFICIAL_OWNER,
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
                ENTITY_BENEFICIAL_OWNER -> Value.ENTITY_BENEFICIAL_OWNER
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
                ENTITY_BENEFICIAL_OWNER -> Known.ENTITY_BENEFICIAL_OWNER
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

        return other is EntityBeneficialOwner &&
            id == other.id &&
            companyTitle == other.companyTitle &&
            createdAt == other.createdAt &&
            entityId == other.entityId &&
            idempotencyKey == other.idempotencyKey &&
            individual == other.individual &&
            prongs == other.prongs &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            companyTitle,
            createdAt,
            entityId,
            idempotencyKey,
            individual,
            prongs,
            type,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EntityBeneficialOwner{id=$id, companyTitle=$companyTitle, createdAt=$createdAt, entityId=$entityId, idempotencyKey=$idempotencyKey, individual=$individual, prongs=$prongs, type=$type, additionalProperties=$additionalProperties}"
}
