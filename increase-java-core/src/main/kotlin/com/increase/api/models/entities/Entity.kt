// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.entities

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
import com.increase.api.models.supplementaldocuments.EntitySupplementalDocument
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Entities are the legal entities that own accounts. They can be people, corporations,
 * partnerships, government authorities, or trusts.
 */
class Entity
private constructor(
    private val id: JsonField<String>,
    private val corporation: JsonField<Corporation>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val description: JsonField<String>,
    private val detailsConfirmedAt: JsonField<OffsetDateTime>,
    private val governmentAuthority: JsonField<GovernmentAuthority>,
    private val idempotencyKey: JsonField<String>,
    private val joint: JsonField<Joint>,
    private val naturalPerson: JsonField<NaturalPerson>,
    private val status: JsonField<Status>,
    private val structure: JsonField<Structure>,
    private val supplementalDocuments: JsonField<List<EntitySupplementalDocument>>,
    private val thirdPartyVerification: JsonField<ThirdPartyVerification>,
    private val trust: JsonField<Trust>,
    private val type: JsonField<Type>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("corporation")
        @ExcludeMissing
        corporation: JsonField<Corporation> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("details_confirmed_at")
        @ExcludeMissing
        detailsConfirmedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("government_authority")
        @ExcludeMissing
        governmentAuthority: JsonField<GovernmentAuthority> = JsonMissing.of(),
        @JsonProperty("idempotency_key")
        @ExcludeMissing
        idempotencyKey: JsonField<String> = JsonMissing.of(),
        @JsonProperty("joint") @ExcludeMissing joint: JsonField<Joint> = JsonMissing.of(),
        @JsonProperty("natural_person")
        @ExcludeMissing
        naturalPerson: JsonField<NaturalPerson> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("structure")
        @ExcludeMissing
        structure: JsonField<Structure> = JsonMissing.of(),
        @JsonProperty("supplemental_documents")
        @ExcludeMissing
        supplementalDocuments: JsonField<List<EntitySupplementalDocument>> = JsonMissing.of(),
        @JsonProperty("third_party_verification")
        @ExcludeMissing
        thirdPartyVerification: JsonField<ThirdPartyVerification> = JsonMissing.of(),
        @JsonProperty("trust") @ExcludeMissing trust: JsonField<Trust> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
    ) : this(
        id,
        corporation,
        createdAt,
        description,
        detailsConfirmedAt,
        governmentAuthority,
        idempotencyKey,
        joint,
        naturalPerson,
        status,
        structure,
        supplementalDocuments,
        thirdPartyVerification,
        trust,
        type,
        mutableMapOf(),
    )

    /**
     * The entity's identifier.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Details of the corporation entity. Will be present if `structure` is equal to `corporation`.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun corporation(): Optional<Corporation> = corporation.getOptional("corporation")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Entity was created.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * The entity's description for display purposes.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Entity's details
     * were most recently confirmed.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun detailsConfirmedAt(): Optional<OffsetDateTime> =
        detailsConfirmedAt.getOptional("details_confirmed_at")

    /**
     * Details of the government authority entity. Will be present if `structure` is equal to
     * `government_authority`.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun governmentAuthority(): Optional<GovernmentAuthority> =
        governmentAuthority.getOptional("government_authority")

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
     * Details of the joint entity. Will be present if `structure` is equal to `joint`.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun joint(): Optional<Joint> = joint.getOptional("joint")

    /**
     * Details of the natural person entity. Will be present if `structure` is equal to
     * `natural_person`.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun naturalPerson(): Optional<NaturalPerson> = naturalPerson.getOptional("natural_person")

    /**
     * The status of the entity.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * The entity's legal structure.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun structure(): Structure = structure.getRequired("structure")

    /**
     * Additional documentation associated with the entity. This is limited to the first 10
     * documents for an entity. If an entity has more than 10 documents, use the GET
     * /entity_supplemental_documents list endpoint to retrieve them.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun supplementalDocuments(): List<EntitySupplementalDocument> =
        supplementalDocuments.getRequired("supplemental_documents")

    /**
     * A reference to data stored in a third-party verification service. Your integration may or may
     * not use this field.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun thirdPartyVerification(): Optional<ThirdPartyVerification> =
        thirdPartyVerification.getOptional("third_party_verification")

    /**
     * Details of the trust entity. Will be present if `structure` is equal to `trust`.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun trust(): Optional<Trust> = trust.getOptional("trust")

    /**
     * A constant representing the object's type. For this resource it will always be `entity`.
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
     * Returns the raw JSON value of [corporation].
     *
     * Unlike [corporation], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("corporation")
    @ExcludeMissing
    fun _corporation(): JsonField<Corporation> = corporation

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [detailsConfirmedAt].
     *
     * Unlike [detailsConfirmedAt], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("details_confirmed_at")
    @ExcludeMissing
    fun _detailsConfirmedAt(): JsonField<OffsetDateTime> = detailsConfirmedAt

    /**
     * Returns the raw JSON value of [governmentAuthority].
     *
     * Unlike [governmentAuthority], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("government_authority")
    @ExcludeMissing
    fun _governmentAuthority(): JsonField<GovernmentAuthority> = governmentAuthority

    /**
     * Returns the raw JSON value of [idempotencyKey].
     *
     * Unlike [idempotencyKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idempotency_key")
    @ExcludeMissing
    fun _idempotencyKey(): JsonField<String> = idempotencyKey

    /**
     * Returns the raw JSON value of [joint].
     *
     * Unlike [joint], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("joint") @ExcludeMissing fun _joint(): JsonField<Joint> = joint

    /**
     * Returns the raw JSON value of [naturalPerson].
     *
     * Unlike [naturalPerson], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("natural_person")
    @ExcludeMissing
    fun _naturalPerson(): JsonField<NaturalPerson> = naturalPerson

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [structure].
     *
     * Unlike [structure], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("structure") @ExcludeMissing fun _structure(): JsonField<Structure> = structure

    /**
     * Returns the raw JSON value of [supplementalDocuments].
     *
     * Unlike [supplementalDocuments], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("supplemental_documents")
    @ExcludeMissing
    fun _supplementalDocuments(): JsonField<List<EntitySupplementalDocument>> =
        supplementalDocuments

    /**
     * Returns the raw JSON value of [thirdPartyVerification].
     *
     * Unlike [thirdPartyVerification], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("third_party_verification")
    @ExcludeMissing
    fun _thirdPartyVerification(): JsonField<ThirdPartyVerification> = thirdPartyVerification

    /**
     * Returns the raw JSON value of [trust].
     *
     * Unlike [trust], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("trust") @ExcludeMissing fun _trust(): JsonField<Trust> = trust

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
         * Returns a mutable builder for constructing an instance of [Entity].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .corporation()
         * .createdAt()
         * .description()
         * .detailsConfirmedAt()
         * .governmentAuthority()
         * .idempotencyKey()
         * .joint()
         * .naturalPerson()
         * .status()
         * .structure()
         * .supplementalDocuments()
         * .thirdPartyVerification()
         * .trust()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Entity]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var corporation: JsonField<Corporation>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var description: JsonField<String>? = null
        private var detailsConfirmedAt: JsonField<OffsetDateTime>? = null
        private var governmentAuthority: JsonField<GovernmentAuthority>? = null
        private var idempotencyKey: JsonField<String>? = null
        private var joint: JsonField<Joint>? = null
        private var naturalPerson: JsonField<NaturalPerson>? = null
        private var status: JsonField<Status>? = null
        private var structure: JsonField<Structure>? = null
        private var supplementalDocuments: JsonField<MutableList<EntitySupplementalDocument>>? =
            null
        private var thirdPartyVerification: JsonField<ThirdPartyVerification>? = null
        private var trust: JsonField<Trust>? = null
        private var type: JsonField<Type>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(entity: Entity) = apply {
            id = entity.id
            corporation = entity.corporation
            createdAt = entity.createdAt
            description = entity.description
            detailsConfirmedAt = entity.detailsConfirmedAt
            governmentAuthority = entity.governmentAuthority
            idempotencyKey = entity.idempotencyKey
            joint = entity.joint
            naturalPerson = entity.naturalPerson
            status = entity.status
            structure = entity.structure
            supplementalDocuments = entity.supplementalDocuments.map { it.toMutableList() }
            thirdPartyVerification = entity.thirdPartyVerification
            trust = entity.trust
            type = entity.type
            additionalProperties = entity.additionalProperties.toMutableMap()
        }

        /** The entity's identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * Details of the corporation entity. Will be present if `structure` is equal to
         * `corporation`.
         */
        fun corporation(corporation: Corporation?) = corporation(JsonField.ofNullable(corporation))

        /** Alias for calling [Builder.corporation] with `corporation.orElse(null)`. */
        fun corporation(corporation: Optional<Corporation>) = corporation(corporation.getOrNull())

        /**
         * Sets [Builder.corporation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.corporation] with a well-typed [Corporation] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun corporation(corporation: JsonField<Corporation>) = apply {
            this.corporation = corporation
        }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Entity was
         * created.
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

        /** The entity's description for display purposes. */
        fun description(description: String?) = description(JsonField.ofNullable(description))

        /** Alias for calling [Builder.description] with `description.orElse(null)`. */
        fun description(description: Optional<String>) = description(description.getOrNull())

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Entity's details
         * were most recently confirmed.
         */
        fun detailsConfirmedAt(detailsConfirmedAt: OffsetDateTime?) =
            detailsConfirmedAt(JsonField.ofNullable(detailsConfirmedAt))

        /**
         * Alias for calling [Builder.detailsConfirmedAt] with `detailsConfirmedAt.orElse(null)`.
         */
        fun detailsConfirmedAt(detailsConfirmedAt: Optional<OffsetDateTime>) =
            detailsConfirmedAt(detailsConfirmedAt.getOrNull())

        /**
         * Sets [Builder.detailsConfirmedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.detailsConfirmedAt] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun detailsConfirmedAt(detailsConfirmedAt: JsonField<OffsetDateTime>) = apply {
            this.detailsConfirmedAt = detailsConfirmedAt
        }

        /**
         * Details of the government authority entity. Will be present if `structure` is equal to
         * `government_authority`.
         */
        fun governmentAuthority(governmentAuthority: GovernmentAuthority?) =
            governmentAuthority(JsonField.ofNullable(governmentAuthority))

        /**
         * Alias for calling [Builder.governmentAuthority] with `governmentAuthority.orElse(null)`.
         */
        fun governmentAuthority(governmentAuthority: Optional<GovernmentAuthority>) =
            governmentAuthority(governmentAuthority.getOrNull())

        /**
         * Sets [Builder.governmentAuthority] to an arbitrary JSON value.
         *
         * You should usually call [Builder.governmentAuthority] with a well-typed
         * [GovernmentAuthority] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun governmentAuthority(governmentAuthority: JsonField<GovernmentAuthority>) = apply {
            this.governmentAuthority = governmentAuthority
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

        /** Details of the joint entity. Will be present if `structure` is equal to `joint`. */
        fun joint(joint: Joint?) = joint(JsonField.ofNullable(joint))

        /** Alias for calling [Builder.joint] with `joint.orElse(null)`. */
        fun joint(joint: Optional<Joint>) = joint(joint.getOrNull())

        /**
         * Sets [Builder.joint] to an arbitrary JSON value.
         *
         * You should usually call [Builder.joint] with a well-typed [Joint] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun joint(joint: JsonField<Joint>) = apply { this.joint = joint }

        /**
         * Details of the natural person entity. Will be present if `structure` is equal to
         * `natural_person`.
         */
        fun naturalPerson(naturalPerson: NaturalPerson?) =
            naturalPerson(JsonField.ofNullable(naturalPerson))

        /** Alias for calling [Builder.naturalPerson] with `naturalPerson.orElse(null)`. */
        fun naturalPerson(naturalPerson: Optional<NaturalPerson>) =
            naturalPerson(naturalPerson.getOrNull())

        /**
         * Sets [Builder.naturalPerson] to an arbitrary JSON value.
         *
         * You should usually call [Builder.naturalPerson] with a well-typed [NaturalPerson] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun naturalPerson(naturalPerson: JsonField<NaturalPerson>) = apply {
            this.naturalPerson = naturalPerson
        }

        /** The status of the entity. */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** The entity's legal structure. */
        fun structure(structure: Structure) = structure(JsonField.of(structure))

        /**
         * Sets [Builder.structure] to an arbitrary JSON value.
         *
         * You should usually call [Builder.structure] with a well-typed [Structure] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun structure(structure: JsonField<Structure>) = apply { this.structure = structure }

        /**
         * Additional documentation associated with the entity. This is limited to the first 10
         * documents for an entity. If an entity has more than 10 documents, use the GET
         * /entity_supplemental_documents list endpoint to retrieve them.
         */
        fun supplementalDocuments(supplementalDocuments: List<EntitySupplementalDocument>) =
            supplementalDocuments(JsonField.of(supplementalDocuments))

        /**
         * Sets [Builder.supplementalDocuments] to an arbitrary JSON value.
         *
         * You should usually call [Builder.supplementalDocuments] with a well-typed
         * `List<EntitySupplementalDocument>` value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun supplementalDocuments(
            supplementalDocuments: JsonField<List<EntitySupplementalDocument>>
        ) = apply { this.supplementalDocuments = supplementalDocuments.map { it.toMutableList() } }

        /**
         * Adds a single [EntitySupplementalDocument] to [supplementalDocuments].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSupplementalDocument(supplementalDocument: EntitySupplementalDocument) = apply {
            supplementalDocuments =
                (supplementalDocuments ?: JsonField.of(mutableListOf())).also {
                    checkKnown("supplementalDocuments", it).add(supplementalDocument)
                }
        }

        /**
         * A reference to data stored in a third-party verification service. Your integration may or
         * may not use this field.
         */
        fun thirdPartyVerification(thirdPartyVerification: ThirdPartyVerification?) =
            thirdPartyVerification(JsonField.ofNullable(thirdPartyVerification))

        /**
         * Alias for calling [Builder.thirdPartyVerification] with
         * `thirdPartyVerification.orElse(null)`.
         */
        fun thirdPartyVerification(thirdPartyVerification: Optional<ThirdPartyVerification>) =
            thirdPartyVerification(thirdPartyVerification.getOrNull())

        /**
         * Sets [Builder.thirdPartyVerification] to an arbitrary JSON value.
         *
         * You should usually call [Builder.thirdPartyVerification] with a well-typed
         * [ThirdPartyVerification] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun thirdPartyVerification(thirdPartyVerification: JsonField<ThirdPartyVerification>) =
            apply {
                this.thirdPartyVerification = thirdPartyVerification
            }

        /** Details of the trust entity. Will be present if `structure` is equal to `trust`. */
        fun trust(trust: Trust?) = trust(JsonField.ofNullable(trust))

        /** Alias for calling [Builder.trust] with `trust.orElse(null)`. */
        fun trust(trust: Optional<Trust>) = trust(trust.getOrNull())

        /**
         * Sets [Builder.trust] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trust] with a well-typed [Trust] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun trust(trust: JsonField<Trust>) = apply { this.trust = trust }

        /**
         * A constant representing the object's type. For this resource it will always be `entity`.
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
         * Returns an immutable instance of [Entity].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .corporation()
         * .createdAt()
         * .description()
         * .detailsConfirmedAt()
         * .governmentAuthority()
         * .idempotencyKey()
         * .joint()
         * .naturalPerson()
         * .status()
         * .structure()
         * .supplementalDocuments()
         * .thirdPartyVerification()
         * .trust()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Entity =
            Entity(
                checkRequired("id", id),
                checkRequired("corporation", corporation),
                checkRequired("createdAt", createdAt),
                checkRequired("description", description),
                checkRequired("detailsConfirmedAt", detailsConfirmedAt),
                checkRequired("governmentAuthority", governmentAuthority),
                checkRequired("idempotencyKey", idempotencyKey),
                checkRequired("joint", joint),
                checkRequired("naturalPerson", naturalPerson),
                checkRequired("status", status),
                checkRequired("structure", structure),
                checkRequired("supplementalDocuments", supplementalDocuments).map {
                    it.toImmutable()
                },
                checkRequired("thirdPartyVerification", thirdPartyVerification),
                checkRequired("trust", trust),
                checkRequired("type", type),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Entity = apply {
        if (validated) {
            return@apply
        }

        id()
        corporation().ifPresent { it.validate() }
        createdAt()
        description()
        detailsConfirmedAt()
        governmentAuthority().ifPresent { it.validate() }
        idempotencyKey()
        joint().ifPresent { it.validate() }
        naturalPerson().ifPresent { it.validate() }
        status().validate()
        structure().validate()
        supplementalDocuments().forEach { it.validate() }
        thirdPartyVerification().ifPresent { it.validate() }
        trust().ifPresent { it.validate() }
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
            (corporation.asKnown().getOrNull()?.validity() ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (detailsConfirmedAt.asKnown().isPresent) 1 else 0) +
            (governmentAuthority.asKnown().getOrNull()?.validity() ?: 0) +
            (if (idempotencyKey.asKnown().isPresent) 1 else 0) +
            (joint.asKnown().getOrNull()?.validity() ?: 0) +
            (naturalPerson.asKnown().getOrNull()?.validity() ?: 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (structure.asKnown().getOrNull()?.validity() ?: 0) +
            (supplementalDocuments.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (thirdPartyVerification.asKnown().getOrNull()?.validity() ?: 0) +
            (trust.asKnown().getOrNull()?.validity() ?: 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0)

    /**
     * Details of the corporation entity. Will be present if `structure` is equal to `corporation`.
     */
    class Corporation
    private constructor(
        private val address: JsonField<Address>,
        private val beneficialOwners: JsonField<List<BeneficialOwner>>,
        private val incorporationState: JsonField<String>,
        private val industryCode: JsonField<String>,
        private val name: JsonField<String>,
        private val taxIdentifier: JsonField<String>,
        private val website: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("address") @ExcludeMissing address: JsonField<Address> = JsonMissing.of(),
            @JsonProperty("beneficial_owners")
            @ExcludeMissing
            beneficialOwners: JsonField<List<BeneficialOwner>> = JsonMissing.of(),
            @JsonProperty("incorporation_state")
            @ExcludeMissing
            incorporationState: JsonField<String> = JsonMissing.of(),
            @JsonProperty("industry_code")
            @ExcludeMissing
            industryCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tax_identifier")
            @ExcludeMissing
            taxIdentifier: JsonField<String> = JsonMissing.of(),
            @JsonProperty("website") @ExcludeMissing website: JsonField<String> = JsonMissing.of(),
        ) : this(
            address,
            beneficialOwners,
            incorporationState,
            industryCode,
            name,
            taxIdentifier,
            website,
            mutableMapOf(),
        )

        /**
         * The corporation's address.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun address(): Address = address.getRequired("address")

        /**
         * The identifying details of anyone controlling or owning 25% or more of the corporation.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun beneficialOwners(): List<BeneficialOwner> =
            beneficialOwners.getRequired("beneficial_owners")

        /**
         * The two-letter United States Postal Service (USPS) abbreviation for the corporation's
         * state of incorporation.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun incorporationState(): Optional<String> =
            incorporationState.getOptional("incorporation_state")

        /**
         * The numeric North American Industry Classification System (NAICS) code submitted for the
         * corporation.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun industryCode(): Optional<String> = industryCode.getOptional("industry_code")

        /**
         * The legal name of the corporation.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * The Employer Identification Number (EIN) for the corporation.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun taxIdentifier(): Optional<String> = taxIdentifier.getOptional("tax_identifier")

        /**
         * The website of the corporation.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun website(): Optional<String> = website.getOptional("website")

        /**
         * Returns the raw JSON value of [address].
         *
         * Unlike [address], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("address") @ExcludeMissing fun _address(): JsonField<Address> = address

        /**
         * Returns the raw JSON value of [beneficialOwners].
         *
         * Unlike [beneficialOwners], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("beneficial_owners")
        @ExcludeMissing
        fun _beneficialOwners(): JsonField<List<BeneficialOwner>> = beneficialOwners

        /**
         * Returns the raw JSON value of [incorporationState].
         *
         * Unlike [incorporationState], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("incorporation_state")
        @ExcludeMissing
        fun _incorporationState(): JsonField<String> = incorporationState

        /**
         * Returns the raw JSON value of [industryCode].
         *
         * Unlike [industryCode], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("industry_code")
        @ExcludeMissing
        fun _industryCode(): JsonField<String> = industryCode

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [taxIdentifier].
         *
         * Unlike [taxIdentifier], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("tax_identifier")
        @ExcludeMissing
        fun _taxIdentifier(): JsonField<String> = taxIdentifier

        /**
         * Returns the raw JSON value of [website].
         *
         * Unlike [website], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("website") @ExcludeMissing fun _website(): JsonField<String> = website

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
             * Returns a mutable builder for constructing an instance of [Corporation].
             *
             * The following fields are required:
             * ```java
             * .address()
             * .beneficialOwners()
             * .incorporationState()
             * .industryCode()
             * .name()
             * .taxIdentifier()
             * .website()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Corporation]. */
        class Builder internal constructor() {

            private var address: JsonField<Address>? = null
            private var beneficialOwners: JsonField<MutableList<BeneficialOwner>>? = null
            private var incorporationState: JsonField<String>? = null
            private var industryCode: JsonField<String>? = null
            private var name: JsonField<String>? = null
            private var taxIdentifier: JsonField<String>? = null
            private var website: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(corporation: Corporation) = apply {
                address = corporation.address
                beneficialOwners = corporation.beneficialOwners.map { it.toMutableList() }
                incorporationState = corporation.incorporationState
                industryCode = corporation.industryCode
                name = corporation.name
                taxIdentifier = corporation.taxIdentifier
                website = corporation.website
                additionalProperties = corporation.additionalProperties.toMutableMap()
            }

            /** The corporation's address. */
            fun address(address: Address) = address(JsonField.of(address))

            /**
             * Sets [Builder.address] to an arbitrary JSON value.
             *
             * You should usually call [Builder.address] with a well-typed [Address] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun address(address: JsonField<Address>) = apply { this.address = address }

            /**
             * The identifying details of anyone controlling or owning 25% or more of the
             * corporation.
             */
            fun beneficialOwners(beneficialOwners: List<BeneficialOwner>) =
                beneficialOwners(JsonField.of(beneficialOwners))

            /**
             * Sets [Builder.beneficialOwners] to an arbitrary JSON value.
             *
             * You should usually call [Builder.beneficialOwners] with a well-typed
             * `List<BeneficialOwner>` value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun beneficialOwners(beneficialOwners: JsonField<List<BeneficialOwner>>) = apply {
                this.beneficialOwners = beneficialOwners.map { it.toMutableList() }
            }

            /**
             * Adds a single [BeneficialOwner] to [beneficialOwners].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addBeneficialOwner(beneficialOwner: BeneficialOwner) = apply {
                beneficialOwners =
                    (beneficialOwners ?: JsonField.of(mutableListOf())).also {
                        checkKnown("beneficialOwners", it).add(beneficialOwner)
                    }
            }

            /**
             * The two-letter United States Postal Service (USPS) abbreviation for the corporation's
             * state of incorporation.
             */
            fun incorporationState(incorporationState: String?) =
                incorporationState(JsonField.ofNullable(incorporationState))

            /**
             * Alias for calling [Builder.incorporationState] with
             * `incorporationState.orElse(null)`.
             */
            fun incorporationState(incorporationState: Optional<String>) =
                incorporationState(incorporationState.getOrNull())

            /**
             * Sets [Builder.incorporationState] to an arbitrary JSON value.
             *
             * You should usually call [Builder.incorporationState] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun incorporationState(incorporationState: JsonField<String>) = apply {
                this.incorporationState = incorporationState
            }

            /**
             * The numeric North American Industry Classification System (NAICS) code submitted for
             * the corporation.
             */
            fun industryCode(industryCode: String?) =
                industryCode(JsonField.ofNullable(industryCode))

            /** Alias for calling [Builder.industryCode] with `industryCode.orElse(null)`. */
            fun industryCode(industryCode: Optional<String>) =
                industryCode(industryCode.getOrNull())

            /**
             * Sets [Builder.industryCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.industryCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun industryCode(industryCode: JsonField<String>) = apply {
                this.industryCode = industryCode
            }

            /** The legal name of the corporation. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** The Employer Identification Number (EIN) for the corporation. */
            fun taxIdentifier(taxIdentifier: String?) =
                taxIdentifier(JsonField.ofNullable(taxIdentifier))

            /** Alias for calling [Builder.taxIdentifier] with `taxIdentifier.orElse(null)`. */
            fun taxIdentifier(taxIdentifier: Optional<String>) =
                taxIdentifier(taxIdentifier.getOrNull())

            /**
             * Sets [Builder.taxIdentifier] to an arbitrary JSON value.
             *
             * You should usually call [Builder.taxIdentifier] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun taxIdentifier(taxIdentifier: JsonField<String>) = apply {
                this.taxIdentifier = taxIdentifier
            }

            /** The website of the corporation. */
            fun website(website: String?) = website(JsonField.ofNullable(website))

            /** Alias for calling [Builder.website] with `website.orElse(null)`. */
            fun website(website: Optional<String>) = website(website.getOrNull())

            /**
             * Sets [Builder.website] to an arbitrary JSON value.
             *
             * You should usually call [Builder.website] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun website(website: JsonField<String>) = apply { this.website = website }

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
             * Returns an immutable instance of [Corporation].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .address()
             * .beneficialOwners()
             * .incorporationState()
             * .industryCode()
             * .name()
             * .taxIdentifier()
             * .website()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Corporation =
                Corporation(
                    checkRequired("address", address),
                    checkRequired("beneficialOwners", beneficialOwners).map { it.toImmutable() },
                    checkRequired("incorporationState", incorporationState),
                    checkRequired("industryCode", industryCode),
                    checkRequired("name", name),
                    checkRequired("taxIdentifier", taxIdentifier),
                    checkRequired("website", website),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Corporation = apply {
            if (validated) {
                return@apply
            }

            address().validate()
            beneficialOwners().forEach { it.validate() }
            incorporationState()
            industryCode()
            name()
            taxIdentifier()
            website()
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
                (beneficialOwners.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (incorporationState.asKnown().isPresent) 1 else 0) +
                (if (industryCode.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (taxIdentifier.asKnown().isPresent) 1 else 0) +
                (if (website.asKnown().isPresent) 1 else 0)

        /** The corporation's address. */
        class Address
        private constructor(
            private val city: JsonField<String>,
            private val line1: JsonField<String>,
            private val line2: JsonField<String>,
            private val state: JsonField<String>,
            private val zip: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("city") @ExcludeMissing city: JsonField<String> = JsonMissing.of(),
                @JsonProperty("line1") @ExcludeMissing line1: JsonField<String> = JsonMissing.of(),
                @JsonProperty("line2") @ExcludeMissing line2: JsonField<String> = JsonMissing.of(),
                @JsonProperty("state") @ExcludeMissing state: JsonField<String> = JsonMissing.of(),
                @JsonProperty("zip") @ExcludeMissing zip: JsonField<String> = JsonMissing.of(),
            ) : this(city, line1, line2, state, zip, mutableMapOf())

            /**
             * The city of the address.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun city(): String = city.getRequired("city")

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
             * The two-letter United States Postal Service (USPS) abbreviation for the state of the
             * address.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun state(): String = state.getRequired("state")

            /**
             * The ZIP code of the address.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun zip(): String = zip.getRequired("zip")

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
                private var line1: JsonField<String>? = null
                private var line2: JsonField<String>? = null
                private var state: JsonField<String>? = null
                private var zip: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(address: Address) = apply {
                    city = address.city
                    line1 = address.line1
                    line2 = address.line2
                    state = address.state
                    zip = address.zip
                    additionalProperties = address.additionalProperties.toMutableMap()
                }

                /** The city of the address. */
                fun city(city: String) = city(JsonField.of(city))

                /**
                 * Sets [Builder.city] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.city] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun city(city: JsonField<String>) = apply { this.city = city }

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
                 * The two-letter United States Postal Service (USPS) abbreviation for the state of
                 * the address.
                 */
                fun state(state: String) = state(JsonField.of(state))

                /**
                 * Sets [Builder.state] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.state] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun state(state: JsonField<String>) = apply { this.state = state }

                /** The ZIP code of the address. */
                fun zip(zip: String) = zip(JsonField.of(zip))

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
                    (if (line1.asKnown().isPresent) 1 else 0) +
                    (if (line2.asKnown().isPresent) 1 else 0) +
                    (if (state.asKnown().isPresent) 1 else 0) +
                    (if (zip.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Address && city == other.city && line1 == other.line1 && line2 == other.line2 && state == other.state && zip == other.zip && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(city, line1, line2, state, zip, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Address{city=$city, line1=$line1, line2=$line2, state=$state, zip=$zip, additionalProperties=$additionalProperties}"
        }

        class BeneficialOwner
        private constructor(
            private val beneficialOwnerId: JsonField<String>,
            private val companyTitle: JsonField<String>,
            private val individual: JsonField<Individual>,
            private val prong: JsonField<Prong>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("beneficial_owner_id")
                @ExcludeMissing
                beneficialOwnerId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("company_title")
                @ExcludeMissing
                companyTitle: JsonField<String> = JsonMissing.of(),
                @JsonProperty("individual")
                @ExcludeMissing
                individual: JsonField<Individual> = JsonMissing.of(),
                @JsonProperty("prong") @ExcludeMissing prong: JsonField<Prong> = JsonMissing.of(),
            ) : this(beneficialOwnerId, companyTitle, individual, prong, mutableMapOf())

            /**
             * The identifier of this beneficial owner.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun beneficialOwnerId(): String = beneficialOwnerId.getRequired("beneficial_owner_id")

            /**
             * This person's role or title within the entity.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun companyTitle(): Optional<String> = companyTitle.getOptional("company_title")

            /**
             * Personal details for the beneficial owner.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun individual(): Individual = individual.getRequired("individual")

            /**
             * Why this person is considered a beneficial owner of the entity.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun prong(): Prong = prong.getRequired("prong")

            /**
             * Returns the raw JSON value of [beneficialOwnerId].
             *
             * Unlike [beneficialOwnerId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("beneficial_owner_id")
            @ExcludeMissing
            fun _beneficialOwnerId(): JsonField<String> = beneficialOwnerId

            /**
             * Returns the raw JSON value of [companyTitle].
             *
             * Unlike [companyTitle], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("company_title")
            @ExcludeMissing
            fun _companyTitle(): JsonField<String> = companyTitle

            /**
             * Returns the raw JSON value of [individual].
             *
             * Unlike [individual], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("individual")
            @ExcludeMissing
            fun _individual(): JsonField<Individual> = individual

            /**
             * Returns the raw JSON value of [prong].
             *
             * Unlike [prong], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("prong") @ExcludeMissing fun _prong(): JsonField<Prong> = prong

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
                 * Returns a mutable builder for constructing an instance of [BeneficialOwner].
                 *
                 * The following fields are required:
                 * ```java
                 * .beneficialOwnerId()
                 * .companyTitle()
                 * .individual()
                 * .prong()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [BeneficialOwner]. */
            class Builder internal constructor() {

                private var beneficialOwnerId: JsonField<String>? = null
                private var companyTitle: JsonField<String>? = null
                private var individual: JsonField<Individual>? = null
                private var prong: JsonField<Prong>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(beneficialOwner: BeneficialOwner) = apply {
                    beneficialOwnerId = beneficialOwner.beneficialOwnerId
                    companyTitle = beneficialOwner.companyTitle
                    individual = beneficialOwner.individual
                    prong = beneficialOwner.prong
                    additionalProperties = beneficialOwner.additionalProperties.toMutableMap()
                }

                /** The identifier of this beneficial owner. */
                fun beneficialOwnerId(beneficialOwnerId: String) =
                    beneficialOwnerId(JsonField.of(beneficialOwnerId))

                /**
                 * Sets [Builder.beneficialOwnerId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.beneficialOwnerId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun beneficialOwnerId(beneficialOwnerId: JsonField<String>) = apply {
                    this.beneficialOwnerId = beneficialOwnerId
                }

                /** This person's role or title within the entity. */
                fun companyTitle(companyTitle: String?) =
                    companyTitle(JsonField.ofNullable(companyTitle))

                /** Alias for calling [Builder.companyTitle] with `companyTitle.orElse(null)`. */
                fun companyTitle(companyTitle: Optional<String>) =
                    companyTitle(companyTitle.getOrNull())

                /**
                 * Sets [Builder.companyTitle] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.companyTitle] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun companyTitle(companyTitle: JsonField<String>) = apply {
                    this.companyTitle = companyTitle
                }

                /** Personal details for the beneficial owner. */
                fun individual(individual: Individual) = individual(JsonField.of(individual))

                /**
                 * Sets [Builder.individual] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.individual] with a well-typed [Individual] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun individual(individual: JsonField<Individual>) = apply {
                    this.individual = individual
                }

                /** Why this person is considered a beneficial owner of the entity. */
                fun prong(prong: Prong) = prong(JsonField.of(prong))

                /**
                 * Sets [Builder.prong] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.prong] with a well-typed [Prong] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun prong(prong: JsonField<Prong>) = apply { this.prong = prong }

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
                 * Returns an immutable instance of [BeneficialOwner].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .beneficialOwnerId()
                 * .companyTitle()
                 * .individual()
                 * .prong()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): BeneficialOwner =
                    BeneficialOwner(
                        checkRequired("beneficialOwnerId", beneficialOwnerId),
                        checkRequired("companyTitle", companyTitle),
                        checkRequired("individual", individual),
                        checkRequired("prong", prong),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): BeneficialOwner = apply {
                if (validated) {
                    return@apply
                }

                beneficialOwnerId()
                companyTitle()
                individual().validate()
                prong().validate()
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
                (if (beneficialOwnerId.asKnown().isPresent) 1 else 0) +
                    (if (companyTitle.asKnown().isPresent) 1 else 0) +
                    (individual.asKnown().getOrNull()?.validity() ?: 0) +
                    (prong.asKnown().getOrNull()?.validity() ?: 0)

            /** Personal details for the beneficial owner. */
            class Individual
            private constructor(
                private val address: JsonField<Address>,
                private val dateOfBirth: JsonField<LocalDate>,
                private val identification: JsonField<Identification>,
                private val name: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("address")
                    @ExcludeMissing
                    address: JsonField<Address> = JsonMissing.of(),
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
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun address(): Address = address.getRequired("address")

                /**
                 * The person's date of birth in YYYY-MM-DD format.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun dateOfBirth(): LocalDate = dateOfBirth.getRequired("date_of_birth")

                /**
                 * A means of verifying the person's identity.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun identification(): Identification = identification.getRequired("identification")

                /**
                 * The person's legal name.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun name(): String = name.getRequired("name")

                /**
                 * Returns the raw JSON value of [address].
                 *
                 * Unlike [address], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("address")
                @ExcludeMissing
                fun _address(): JsonField<Address> = address

                /**
                 * Returns the raw JSON value of [dateOfBirth].
                 *
                 * Unlike [dateOfBirth], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("date_of_birth")
                @ExcludeMissing
                fun _dateOfBirth(): JsonField<LocalDate> = dateOfBirth

                /**
                 * Returns the raw JSON value of [identification].
                 *
                 * Unlike [identification], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("identification")
                @ExcludeMissing
                fun _identification(): JsonField<Identification> = identification

                /**
                 * Returns the raw JSON value of [name].
                 *
                 * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                 * type.
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
                     * You should usually call [Builder.address] with a well-typed [Address] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun address(address: JsonField<Address>) = apply { this.address = address }

                    /** The person's date of birth in YYYY-MM-DD format. */
                    fun dateOfBirth(dateOfBirth: LocalDate) = dateOfBirth(JsonField.of(dateOfBirth))

                    /**
                     * Sets [Builder.dateOfBirth] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.dateOfBirth] with a well-typed [LocalDate]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
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
                     * You should usually call [Builder.identification] with a well-typed
                     * [Identification] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun identification(identification: JsonField<Identification>) = apply {
                        this.identification = identification
                    }

                    /** The person's legal name. */
                    fun name(name: String) = name(JsonField.of(name))

                    /**
                     * Sets [Builder.name] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.name] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun name(name: JsonField<String>) = apply { this.name = name }

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
                        @JsonProperty("city")
                        @ExcludeMissing
                        city: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("country")
                        @ExcludeMissing
                        country: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("line1")
                        @ExcludeMissing
                        line1: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("line2")
                        @ExcludeMissing
                        line2: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("state")
                        @ExcludeMissing
                        state: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("zip")
                        @ExcludeMissing
                        zip: JsonField<String> = JsonMissing.of(),
                    ) : this(city, country, line1, line2, state, zip, mutableMapOf())

                    /**
                     * The city, district, town, or village of the address.
                     *
                     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun city(): Optional<String> = city.getOptional("city")

                    /**
                     * The two-letter ISO 3166-1 alpha-2 code for the country of the address.
                     *
                     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun country(): String = country.getRequired("country")

                    /**
                     * The first line of the address.
                     *
                     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun line1(): String = line1.getRequired("line1")

                    /**
                     * The second line of the address.
                     *
                     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun line2(): Optional<String> = line2.getOptional("line2")

                    /**
                     * The two-letter United States Postal Service (USPS) abbreviation for the US
                     * state, province, or region of the address.
                     *
                     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun state(): Optional<String> = state.getOptional("state")

                    /**
                     * The ZIP or postal code of the address.
                     *
                     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun zip(): Optional<String> = zip.getOptional("zip")

                    /**
                     * Returns the raw JSON value of [city].
                     *
                     * Unlike [city], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

                    /**
                     * Returns the raw JSON value of [country].
                     *
                     * Unlike [country], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("country")
                    @ExcludeMissing
                    fun _country(): JsonField<String> = country

                    /**
                     * Returns the raw JSON value of [line1].
                     *
                     * Unlike [line1], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("line1") @ExcludeMissing fun _line1(): JsonField<String> = line1

                    /**
                     * Returns the raw JSON value of [line2].
                     *
                     * Unlike [line2], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("line2") @ExcludeMissing fun _line2(): JsonField<String> = line2

                    /**
                     * Returns the raw JSON value of [state].
                     *
                     * Unlike [state], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

                    /**
                     * Returns the raw JSON value of [zip].
                     *
                     * Unlike [zip], this method doesn't throw if the JSON field has an unexpected
                     * type.
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
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

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
                         * You should usually call [Builder.city] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun city(city: JsonField<String>) = apply { this.city = city }

                        /**
                         * The two-letter ISO 3166-1 alpha-2 code for the country of the address.
                         */
                        fun country(country: String) = country(JsonField.of(country))

                        /**
                         * Sets [Builder.country] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.country] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun country(country: JsonField<String>) = apply { this.country = country }

                        /** The first line of the address. */
                        fun line1(line1: String) = line1(JsonField.of(line1))

                        /**
                         * Sets [Builder.line1] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.line1] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

                        /** The second line of the address. */
                        fun line2(line2: String?) = line2(JsonField.ofNullable(line2))

                        /** Alias for calling [Builder.line2] with `line2.orElse(null)`. */
                        fun line2(line2: Optional<String>) = line2(line2.getOrNull())

                        /**
                         * Sets [Builder.line2] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.line2] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

                        /**
                         * The two-letter United States Postal Service (USPS) abbreviation for the
                         * US state, province, or region of the address.
                         */
                        fun state(state: String?) = state(JsonField.ofNullable(state))

                        /** Alias for calling [Builder.state] with `state.orElse(null)`. */
                        fun state(state: Optional<String>) = state(state.getOrNull())

                        /**
                         * Sets [Builder.state] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.state] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun state(state: JsonField<String>) = apply { this.state = state }

                        /** The ZIP or postal code of the address. */
                        fun zip(zip: String?) = zip(JsonField.ofNullable(zip))

                        /** Alias for calling [Builder.zip] with `zip.orElse(null)`. */
                        fun zip(zip: Optional<String>) = zip(zip.getOrNull())

                        /**
                         * Sets [Builder.zip] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.zip] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun zip(zip: JsonField<String>) = apply { this.zip = zip }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

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

                        return /* spotless:off */ other is Address && city == other.city && country == other.country && line1 == other.line1 && line2 == other.line2 && state == other.state && zip == other.zip && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(city, country, line1, line2, state, zip, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Address{city=$city, country=$country, line1=$line1, line2=$line2, state=$state, zip=$zip, additionalProperties=$additionalProperties}"
                }

                /** A means of verifying the person's identity. */
                class Identification
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
                     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun method(): Method = method.getRequired("method")

                    /**
                     * The last 4 digits of the identification number that can be used to verify the
                     * individual's identity.
                     *
                     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun numberLast4(): String = numberLast4.getRequired("number_last4")

                    /**
                     * Returns the raw JSON value of [method].
                     *
                     * Unlike [method], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("method")
                    @ExcludeMissing
                    fun _method(): JsonField<Method> = method

                    /**
                     * Returns the raw JSON value of [numberLast4].
                     *
                     * Unlike [numberLast4], this method doesn't throw if the JSON field has an
                     * unexpected type.
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
                         * Returns a mutable builder for constructing an instance of
                         * [Identification].
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
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(identification: Identification) = apply {
                            method = identification.method
                            numberLast4 = identification.numberLast4
                            additionalProperties =
                                identification.additionalProperties.toMutableMap()
                        }

                        /** A method that can be used to verify the individual's identity. */
                        fun method(method: Method) = method(JsonField.of(method))

                        /**
                         * Sets [Builder.method] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.method] with a well-typed [Method] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun method(method: JsonField<Method>) = apply { this.method = method }

                        /**
                         * The last 4 digits of the identification number that can be used to verify
                         * the individual's identity.
                         */
                        fun numberLast4(numberLast4: String) =
                            numberLast4(JsonField.of(numberLast4))

                        /**
                         * Sets [Builder.numberLast4] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.numberLast4] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun numberLast4(numberLast4: JsonField<String>) = apply {
                            this.numberLast4 = numberLast4
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

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
                    class Method
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

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
                         * An enum containing [Method]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Method] can contain an unknown value in a couple of
                         * cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
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
                             * An enum member indicating that [Method] was instantiated with an
                             * unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
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
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws IncreaseInvalidDataException if this class instance's value is a
                         *   not a known member.
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
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws IncreaseInvalidDataException if this class instance's value does
                         *   not have the expected primitive type.
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Method && value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Identification && method == other.method && numberLast4 == other.numberLast4 && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(method, numberLast4, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Identification{method=$method, numberLast4=$numberLast4, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Individual && address == other.address && dateOfBirth == other.dateOfBirth && identification == other.identification && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(address, dateOfBirth, identification, name, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Individual{address=$address, dateOfBirth=$dateOfBirth, identification=$identification, name=$name, additionalProperties=$additionalProperties}"
            }

            /** Why this person is considered a beneficial owner of the entity. */
            class Prong @JsonCreator private constructor(private val value: JsonField<String>) :
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
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    /** A person with 25% or greater direct or indirect ownership of the entity. */
                    OWNERSHIP,
                    /** A person who manages, directs, or has significant control of the entity. */
                    CONTROL,
                    /**
                     * An enum member indicating that [Prong] was instantiated with an unknown
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
                        OWNERSHIP -> Value.OWNERSHIP
                        CONTROL -> Value.CONTROL
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
                        OWNERSHIP -> Known.OWNERSHIP
                        CONTROL -> Known.CONTROL
                        else -> throw IncreaseInvalidDataException("Unknown Prong: $value")
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

                    return /* spotless:off */ other is Prong && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is BeneficialOwner && beneficialOwnerId == other.beneficialOwnerId && companyTitle == other.companyTitle && individual == other.individual && prong == other.prong && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(beneficialOwnerId, companyTitle, individual, prong, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "BeneficialOwner{beneficialOwnerId=$beneficialOwnerId, companyTitle=$companyTitle, individual=$individual, prong=$prong, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Corporation && address == other.address && beneficialOwners == other.beneficialOwners && incorporationState == other.incorporationState && industryCode == other.industryCode && name == other.name && taxIdentifier == other.taxIdentifier && website == other.website && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(address, beneficialOwners, incorporationState, industryCode, name, taxIdentifier, website, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Corporation{address=$address, beneficialOwners=$beneficialOwners, incorporationState=$incorporationState, industryCode=$industryCode, name=$name, taxIdentifier=$taxIdentifier, website=$website, additionalProperties=$additionalProperties}"
    }

    /**
     * Details of the government authority entity. Will be present if `structure` is equal to
     * `government_authority`.
     */
    class GovernmentAuthority
    private constructor(
        private val address: JsonField<Address>,
        private val authorizedPersons: JsonField<List<AuthorizedPerson>>,
        private val category: JsonField<Category>,
        private val name: JsonField<String>,
        private val taxIdentifier: JsonField<String>,
        private val website: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("address") @ExcludeMissing address: JsonField<Address> = JsonMissing.of(),
            @JsonProperty("authorized_persons")
            @ExcludeMissing
            authorizedPersons: JsonField<List<AuthorizedPerson>> = JsonMissing.of(),
            @JsonProperty("category")
            @ExcludeMissing
            category: JsonField<Category> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tax_identifier")
            @ExcludeMissing
            taxIdentifier: JsonField<String> = JsonMissing.of(),
            @JsonProperty("website") @ExcludeMissing website: JsonField<String> = JsonMissing.of(),
        ) : this(address, authorizedPersons, category, name, taxIdentifier, website, mutableMapOf())

        /**
         * The government authority's address.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun address(): Address = address.getRequired("address")

        /**
         * The identifying details of authorized persons of the government authority.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun authorizedPersons(): List<AuthorizedPerson> =
            authorizedPersons.getRequired("authorized_persons")

        /**
         * The category of the government authority.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun category(): Category = category.getRequired("category")

        /**
         * The government authority's name.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * The Employer Identification Number (EIN) of the government authority.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun taxIdentifier(): Optional<String> = taxIdentifier.getOptional("tax_identifier")

        /**
         * The government authority's website.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun website(): Optional<String> = website.getOptional("website")

        /**
         * Returns the raw JSON value of [address].
         *
         * Unlike [address], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("address") @ExcludeMissing fun _address(): JsonField<Address> = address

        /**
         * Returns the raw JSON value of [authorizedPersons].
         *
         * Unlike [authorizedPersons], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("authorized_persons")
        @ExcludeMissing
        fun _authorizedPersons(): JsonField<List<AuthorizedPerson>> = authorizedPersons

        /**
         * Returns the raw JSON value of [category].
         *
         * Unlike [category], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("category") @ExcludeMissing fun _category(): JsonField<Category> = category

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [taxIdentifier].
         *
         * Unlike [taxIdentifier], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("tax_identifier")
        @ExcludeMissing
        fun _taxIdentifier(): JsonField<String> = taxIdentifier

        /**
         * Returns the raw JSON value of [website].
         *
         * Unlike [website], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("website") @ExcludeMissing fun _website(): JsonField<String> = website

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
             * Returns a mutable builder for constructing an instance of [GovernmentAuthority].
             *
             * The following fields are required:
             * ```java
             * .address()
             * .authorizedPersons()
             * .category()
             * .name()
             * .taxIdentifier()
             * .website()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [GovernmentAuthority]. */
        class Builder internal constructor() {

            private var address: JsonField<Address>? = null
            private var authorizedPersons: JsonField<MutableList<AuthorizedPerson>>? = null
            private var category: JsonField<Category>? = null
            private var name: JsonField<String>? = null
            private var taxIdentifier: JsonField<String>? = null
            private var website: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(governmentAuthority: GovernmentAuthority) = apply {
                address = governmentAuthority.address
                authorizedPersons = governmentAuthority.authorizedPersons.map { it.toMutableList() }
                category = governmentAuthority.category
                name = governmentAuthority.name
                taxIdentifier = governmentAuthority.taxIdentifier
                website = governmentAuthority.website
                additionalProperties = governmentAuthority.additionalProperties.toMutableMap()
            }

            /** The government authority's address. */
            fun address(address: Address) = address(JsonField.of(address))

            /**
             * Sets [Builder.address] to an arbitrary JSON value.
             *
             * You should usually call [Builder.address] with a well-typed [Address] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun address(address: JsonField<Address>) = apply { this.address = address }

            /** The identifying details of authorized persons of the government authority. */
            fun authorizedPersons(authorizedPersons: List<AuthorizedPerson>) =
                authorizedPersons(JsonField.of(authorizedPersons))

            /**
             * Sets [Builder.authorizedPersons] to an arbitrary JSON value.
             *
             * You should usually call [Builder.authorizedPersons] with a well-typed
             * `List<AuthorizedPerson>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun authorizedPersons(authorizedPersons: JsonField<List<AuthorizedPerson>>) = apply {
                this.authorizedPersons = authorizedPersons.map { it.toMutableList() }
            }

            /**
             * Adds a single [AuthorizedPerson] to [authorizedPersons].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAuthorizedPerson(authorizedPerson: AuthorizedPerson) = apply {
                authorizedPersons =
                    (authorizedPersons ?: JsonField.of(mutableListOf())).also {
                        checkKnown("authorizedPersons", it).add(authorizedPerson)
                    }
            }

            /** The category of the government authority. */
            fun category(category: Category) = category(JsonField.of(category))

            /**
             * Sets [Builder.category] to an arbitrary JSON value.
             *
             * You should usually call [Builder.category] with a well-typed [Category] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun category(category: JsonField<Category>) = apply { this.category = category }

            /** The government authority's name. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** The Employer Identification Number (EIN) of the government authority. */
            fun taxIdentifier(taxIdentifier: String?) =
                taxIdentifier(JsonField.ofNullable(taxIdentifier))

            /** Alias for calling [Builder.taxIdentifier] with `taxIdentifier.orElse(null)`. */
            fun taxIdentifier(taxIdentifier: Optional<String>) =
                taxIdentifier(taxIdentifier.getOrNull())

            /**
             * Sets [Builder.taxIdentifier] to an arbitrary JSON value.
             *
             * You should usually call [Builder.taxIdentifier] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun taxIdentifier(taxIdentifier: JsonField<String>) = apply {
                this.taxIdentifier = taxIdentifier
            }

            /** The government authority's website. */
            fun website(website: String?) = website(JsonField.ofNullable(website))

            /** Alias for calling [Builder.website] with `website.orElse(null)`. */
            fun website(website: Optional<String>) = website(website.getOrNull())

            /**
             * Sets [Builder.website] to an arbitrary JSON value.
             *
             * You should usually call [Builder.website] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun website(website: JsonField<String>) = apply { this.website = website }

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
             * Returns an immutable instance of [GovernmentAuthority].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .address()
             * .authorizedPersons()
             * .category()
             * .name()
             * .taxIdentifier()
             * .website()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): GovernmentAuthority =
                GovernmentAuthority(
                    checkRequired("address", address),
                    checkRequired("authorizedPersons", authorizedPersons).map { it.toImmutable() },
                    checkRequired("category", category),
                    checkRequired("name", name),
                    checkRequired("taxIdentifier", taxIdentifier),
                    checkRequired("website", website),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): GovernmentAuthority = apply {
            if (validated) {
                return@apply
            }

            address().validate()
            authorizedPersons().forEach { it.validate() }
            category().validate()
            name()
            taxIdentifier()
            website()
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
                (authorizedPersons.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (category.asKnown().getOrNull()?.validity() ?: 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (taxIdentifier.asKnown().isPresent) 1 else 0) +
                (if (website.asKnown().isPresent) 1 else 0)

        /** The government authority's address. */
        class Address
        private constructor(
            private val city: JsonField<String>,
            private val line1: JsonField<String>,
            private val line2: JsonField<String>,
            private val state: JsonField<String>,
            private val zip: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("city") @ExcludeMissing city: JsonField<String> = JsonMissing.of(),
                @JsonProperty("line1") @ExcludeMissing line1: JsonField<String> = JsonMissing.of(),
                @JsonProperty("line2") @ExcludeMissing line2: JsonField<String> = JsonMissing.of(),
                @JsonProperty("state") @ExcludeMissing state: JsonField<String> = JsonMissing.of(),
                @JsonProperty("zip") @ExcludeMissing zip: JsonField<String> = JsonMissing.of(),
            ) : this(city, line1, line2, state, zip, mutableMapOf())

            /**
             * The city of the address.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun city(): String = city.getRequired("city")

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
             * The two-letter United States Postal Service (USPS) abbreviation for the state of the
             * address.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun state(): String = state.getRequired("state")

            /**
             * The ZIP code of the address.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun zip(): String = zip.getRequired("zip")

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
                private var line1: JsonField<String>? = null
                private var line2: JsonField<String>? = null
                private var state: JsonField<String>? = null
                private var zip: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(address: Address) = apply {
                    city = address.city
                    line1 = address.line1
                    line2 = address.line2
                    state = address.state
                    zip = address.zip
                    additionalProperties = address.additionalProperties.toMutableMap()
                }

                /** The city of the address. */
                fun city(city: String) = city(JsonField.of(city))

                /**
                 * Sets [Builder.city] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.city] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun city(city: JsonField<String>) = apply { this.city = city }

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
                 * The two-letter United States Postal Service (USPS) abbreviation for the state of
                 * the address.
                 */
                fun state(state: String) = state(JsonField.of(state))

                /**
                 * Sets [Builder.state] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.state] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun state(state: JsonField<String>) = apply { this.state = state }

                /** The ZIP code of the address. */
                fun zip(zip: String) = zip(JsonField.of(zip))

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
                    (if (line1.asKnown().isPresent) 1 else 0) +
                    (if (line2.asKnown().isPresent) 1 else 0) +
                    (if (state.asKnown().isPresent) 1 else 0) +
                    (if (zip.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Address && city == other.city && line1 == other.line1 && line2 == other.line2 && state == other.state && zip == other.zip && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(city, line1, line2, state, zip, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Address{city=$city, line1=$line1, line2=$line2, state=$state, zip=$zip, additionalProperties=$additionalProperties}"
        }

        class AuthorizedPerson
        private constructor(
            private val authorizedPersonId: JsonField<String>,
            private val name: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("authorized_person_id")
                @ExcludeMissing
                authorizedPersonId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            ) : this(authorizedPersonId, name, mutableMapOf())

            /**
             * The identifier of this authorized person.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun authorizedPersonId(): String =
                authorizedPersonId.getRequired("authorized_person_id")

            /**
             * The person's legal name.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun name(): String = name.getRequired("name")

            /**
             * Returns the raw JSON value of [authorizedPersonId].
             *
             * Unlike [authorizedPersonId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("authorized_person_id")
            @ExcludeMissing
            fun _authorizedPersonId(): JsonField<String> = authorizedPersonId

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
                 * Returns a mutable builder for constructing an instance of [AuthorizedPerson].
                 *
                 * The following fields are required:
                 * ```java
                 * .authorizedPersonId()
                 * .name()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [AuthorizedPerson]. */
            class Builder internal constructor() {

                private var authorizedPersonId: JsonField<String>? = null
                private var name: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(authorizedPerson: AuthorizedPerson) = apply {
                    authorizedPersonId = authorizedPerson.authorizedPersonId
                    name = authorizedPerson.name
                    additionalProperties = authorizedPerson.additionalProperties.toMutableMap()
                }

                /** The identifier of this authorized person. */
                fun authorizedPersonId(authorizedPersonId: String) =
                    authorizedPersonId(JsonField.of(authorizedPersonId))

                /**
                 * Sets [Builder.authorizedPersonId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.authorizedPersonId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun authorizedPersonId(authorizedPersonId: JsonField<String>) = apply {
                    this.authorizedPersonId = authorizedPersonId
                }

                /** The person's legal name. */
                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

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
                 * Returns an immutable instance of [AuthorizedPerson].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .authorizedPersonId()
                 * .name()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): AuthorizedPerson =
                    AuthorizedPerson(
                        checkRequired("authorizedPersonId", authorizedPersonId),
                        checkRequired("name", name),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): AuthorizedPerson = apply {
                if (validated) {
                    return@apply
                }

                authorizedPersonId()
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
                (if (authorizedPersonId.asKnown().isPresent) 1 else 0) +
                    (if (name.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is AuthorizedPerson && authorizedPersonId == other.authorizedPersonId && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(authorizedPersonId, name, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AuthorizedPerson{authorizedPersonId=$authorizedPersonId, name=$name, additionalProperties=$additionalProperties}"
        }

        /** The category of the government authority. */
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

                /** The Public Entity is a Municipality. */
                @JvmField val MUNICIPALITY = of("municipality")

                @JvmStatic fun of(value: String) = Category(JsonField.of(value))
            }

            /** An enum containing [Category]'s known values. */
            enum class Known {
                /** The Public Entity is a Municipality. */
                MUNICIPALITY
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
                /** The Public Entity is a Municipality. */
                MUNICIPALITY,
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
                    MUNICIPALITY -> Value.MUNICIPALITY
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
                    MUNICIPALITY -> Known.MUNICIPALITY
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

                return /* spotless:off */ other is Category && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is GovernmentAuthority && address == other.address && authorizedPersons == other.authorizedPersons && category == other.category && name == other.name && taxIdentifier == other.taxIdentifier && website == other.website && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(address, authorizedPersons, category, name, taxIdentifier, website, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "GovernmentAuthority{address=$address, authorizedPersons=$authorizedPersons, category=$category, name=$name, taxIdentifier=$taxIdentifier, website=$website, additionalProperties=$additionalProperties}"
    }

    /** Details of the joint entity. Will be present if `structure` is equal to `joint`. */
    class Joint
    private constructor(
        private val individuals: JsonField<List<Individual>>,
        private val name: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("individuals")
            @ExcludeMissing
            individuals: JsonField<List<Individual>> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        ) : this(individuals, name, mutableMapOf())

        /**
         * The two individuals that share control of the entity.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun individuals(): List<Individual> = individuals.getRequired("individuals")

        /**
         * The entity's name.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * Returns the raw JSON value of [individuals].
         *
         * Unlike [individuals], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("individuals")
        @ExcludeMissing
        fun _individuals(): JsonField<List<Individual>> = individuals

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
             * Returns a mutable builder for constructing an instance of [Joint].
             *
             * The following fields are required:
             * ```java
             * .individuals()
             * .name()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Joint]. */
        class Builder internal constructor() {

            private var individuals: JsonField<MutableList<Individual>>? = null
            private var name: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(joint: Joint) = apply {
                individuals = joint.individuals.map { it.toMutableList() }
                name = joint.name
                additionalProperties = joint.additionalProperties.toMutableMap()
            }

            /** The two individuals that share control of the entity. */
            fun individuals(individuals: List<Individual>) = individuals(JsonField.of(individuals))

            /**
             * Sets [Builder.individuals] to an arbitrary JSON value.
             *
             * You should usually call [Builder.individuals] with a well-typed `List<Individual>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun individuals(individuals: JsonField<List<Individual>>) = apply {
                this.individuals = individuals.map { it.toMutableList() }
            }

            /**
             * Adds a single [Individual] to [individuals].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addIndividual(individual: Individual) = apply {
                individuals =
                    (individuals ?: JsonField.of(mutableListOf())).also {
                        checkKnown("individuals", it).add(individual)
                    }
            }

            /** The entity's name. */
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
             * Returns an immutable instance of [Joint].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .individuals()
             * .name()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Joint =
                Joint(
                    checkRequired("individuals", individuals).map { it.toImmutable() },
                    checkRequired("name", name),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Joint = apply {
            if (validated) {
                return@apply
            }

            individuals().forEach { it.validate() }
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
            (individuals.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (name.asKnown().isPresent) 1 else 0)

        class Individual
        private constructor(
            private val address: JsonField<Address>,
            private val dateOfBirth: JsonField<LocalDate>,
            private val identification: JsonField<Identification>,
            private val name: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("address")
                @ExcludeMissing
                address: JsonField<Address> = JsonMissing.of(),
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
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun address(): Address = address.getRequired("address")

            /**
             * The person's date of birth in YYYY-MM-DD format.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun dateOfBirth(): LocalDate = dateOfBirth.getRequired("date_of_birth")

            /**
             * A means of verifying the person's identity.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun identification(): Identification = identification.getRequired("identification")

            /**
             * The person's legal name.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
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
             * Unlike [dateOfBirth], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("date_of_birth")
            @ExcludeMissing
            fun _dateOfBirth(): JsonField<LocalDate> = dateOfBirth

            /**
             * Returns the raw JSON value of [identification].
             *
             * Unlike [identification], this method doesn't throw if the JSON field has an
             * unexpected type.
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
                 * You should usually call [Builder.address] with a well-typed [Address] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun address(address: JsonField<Address>) = apply { this.address = address }

                /** The person's date of birth in YYYY-MM-DD format. */
                fun dateOfBirth(dateOfBirth: LocalDate) = dateOfBirth(JsonField.of(dateOfBirth))

                /**
                 * Sets [Builder.dateOfBirth] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.dateOfBirth] with a well-typed [LocalDate] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                 * You should usually call [Builder.identification] with a well-typed
                 * [Identification] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun identification(identification: JsonField<Identification>) = apply {
                    this.identification = identification
                }

                /** The person's legal name. */
                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

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
            private constructor(
                private val city: JsonField<String>,
                private val line1: JsonField<String>,
                private val line2: JsonField<String>,
                private val state: JsonField<String>,
                private val zip: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("city")
                    @ExcludeMissing
                    city: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("line1")
                    @ExcludeMissing
                    line1: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("line2")
                    @ExcludeMissing
                    line2: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("state")
                    @ExcludeMissing
                    state: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("zip") @ExcludeMissing zip: JsonField<String> = JsonMissing.of(),
                ) : this(city, line1, line2, state, zip, mutableMapOf())

                /**
                 * The city of the address.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun city(): String = city.getRequired("city")

                /**
                 * The first line of the address.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun line1(): String = line1.getRequired("line1")

                /**
                 * The second line of the address.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun line2(): Optional<String> = line2.getOptional("line2")

                /**
                 * The two-letter United States Postal Service (USPS) abbreviation for the state of
                 * the address.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun state(): String = state.getRequired("state")

                /**
                 * The ZIP code of the address.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun zip(): String = zip.getRequired("zip")

                /**
                 * Returns the raw JSON value of [city].
                 *
                 * Unlike [city], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

                /**
                 * Returns the raw JSON value of [line1].
                 *
                 * Unlike [line1], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("line1") @ExcludeMissing fun _line1(): JsonField<String> = line1

                /**
                 * Returns the raw JSON value of [line2].
                 *
                 * Unlike [line2], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("line2") @ExcludeMissing fun _line2(): JsonField<String> = line2

                /**
                 * Returns the raw JSON value of [state].
                 *
                 * Unlike [state], this method doesn't throw if the JSON field has an unexpected
                 * type.
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
                    private var line1: JsonField<String>? = null
                    private var line2: JsonField<String>? = null
                    private var state: JsonField<String>? = null
                    private var zip: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(address: Address) = apply {
                        city = address.city
                        line1 = address.line1
                        line2 = address.line2
                        state = address.state
                        zip = address.zip
                        additionalProperties = address.additionalProperties.toMutableMap()
                    }

                    /** The city of the address. */
                    fun city(city: String) = city(JsonField.of(city))

                    /**
                     * Sets [Builder.city] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.city] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun city(city: JsonField<String>) = apply { this.city = city }

                    /** The first line of the address. */
                    fun line1(line1: String) = line1(JsonField.of(line1))

                    /**
                     * Sets [Builder.line1] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.line1] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

                    /** The second line of the address. */
                    fun line2(line2: String?) = line2(JsonField.ofNullable(line2))

                    /** Alias for calling [Builder.line2] with `line2.orElse(null)`. */
                    fun line2(line2: Optional<String>) = line2(line2.getOrNull())

                    /**
                     * Sets [Builder.line2] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.line2] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

                    /**
                     * The two-letter United States Postal Service (USPS) abbreviation for the state
                     * of the address.
                     */
                    fun state(state: String) = state(JsonField.of(state))

                    /**
                     * Sets [Builder.state] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.state] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun state(state: JsonField<String>) = apply { this.state = state }

                    /** The ZIP code of the address. */
                    fun zip(zip: String) = zip(JsonField.of(zip))

                    /**
                     * Sets [Builder.zip] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.zip] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
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
                        (if (line1.asKnown().isPresent) 1 else 0) +
                        (if (line2.asKnown().isPresent) 1 else 0) +
                        (if (state.asKnown().isPresent) 1 else 0) +
                        (if (zip.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Address && city == other.city && line1 == other.line1 && line2 == other.line2 && state == other.state && zip == other.zip && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(city, line1, line2, state, zip, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Address{city=$city, line1=$line1, line2=$line2, state=$state, zip=$zip, additionalProperties=$additionalProperties}"
            }

            /** A means of verifying the person's identity. */
            class Identification
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
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun method(): Method = method.getRequired("method")

                /**
                 * The last 4 digits of the identification number that can be used to verify the
                 * individual's identity.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun numberLast4(): String = numberLast4.getRequired("number_last4")

                /**
                 * Returns the raw JSON value of [method].
                 *
                 * Unlike [method], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("method") @ExcludeMissing fun _method(): JsonField<Method> = method

                /**
                 * Returns the raw JSON value of [numberLast4].
                 *
                 * Unlike [numberLast4], this method doesn't throw if the JSON field has an
                 * unexpected type.
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
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
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
                     * You should usually call [Builder.numberLast4] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
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
                class Method
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
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
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
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
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
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws IncreaseInvalidDataException if this class instance's value is a not
                     *   a known member.
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
                     * @throws IncreaseInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Method && value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Identification && method == other.method && numberLast4 == other.numberLast4 && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(method, numberLast4, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Identification{method=$method, numberLast4=$numberLast4, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Individual && address == other.address && dateOfBirth == other.dateOfBirth && identification == other.identification && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(address, dateOfBirth, identification, name, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Individual{address=$address, dateOfBirth=$dateOfBirth, identification=$identification, name=$name, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Joint && individuals == other.individuals && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(individuals, name, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Joint{individuals=$individuals, name=$name, additionalProperties=$additionalProperties}"
    }

    /**
     * Details of the natural person entity. Will be present if `structure` is equal to
     * `natural_person`.
     */
    class NaturalPerson
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
             * Returns a mutable builder for constructing an instance of [NaturalPerson].
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

        /** A builder for [NaturalPerson]. */
        class Builder internal constructor() {

            private var address: JsonField<Address>? = null
            private var dateOfBirth: JsonField<LocalDate>? = null
            private var identification: JsonField<Identification>? = null
            private var name: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(naturalPerson: NaturalPerson) = apply {
                address = naturalPerson.address
                dateOfBirth = naturalPerson.dateOfBirth
                identification = naturalPerson.identification
                name = naturalPerson.name
                additionalProperties = naturalPerson.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [NaturalPerson].
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
            fun build(): NaturalPerson =
                NaturalPerson(
                    checkRequired("address", address),
                    checkRequired("dateOfBirth", dateOfBirth),
                    checkRequired("identification", identification),
                    checkRequired("name", name),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): NaturalPerson = apply {
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
        private constructor(
            private val city: JsonField<String>,
            private val line1: JsonField<String>,
            private val line2: JsonField<String>,
            private val state: JsonField<String>,
            private val zip: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("city") @ExcludeMissing city: JsonField<String> = JsonMissing.of(),
                @JsonProperty("line1") @ExcludeMissing line1: JsonField<String> = JsonMissing.of(),
                @JsonProperty("line2") @ExcludeMissing line2: JsonField<String> = JsonMissing.of(),
                @JsonProperty("state") @ExcludeMissing state: JsonField<String> = JsonMissing.of(),
                @JsonProperty("zip") @ExcludeMissing zip: JsonField<String> = JsonMissing.of(),
            ) : this(city, line1, line2, state, zip, mutableMapOf())

            /**
             * The city of the address.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun city(): String = city.getRequired("city")

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
             * The two-letter United States Postal Service (USPS) abbreviation for the state of the
             * address.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun state(): String = state.getRequired("state")

            /**
             * The ZIP code of the address.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun zip(): String = zip.getRequired("zip")

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
                private var line1: JsonField<String>? = null
                private var line2: JsonField<String>? = null
                private var state: JsonField<String>? = null
                private var zip: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(address: Address) = apply {
                    city = address.city
                    line1 = address.line1
                    line2 = address.line2
                    state = address.state
                    zip = address.zip
                    additionalProperties = address.additionalProperties.toMutableMap()
                }

                /** The city of the address. */
                fun city(city: String) = city(JsonField.of(city))

                /**
                 * Sets [Builder.city] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.city] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun city(city: JsonField<String>) = apply { this.city = city }

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
                 * The two-letter United States Postal Service (USPS) abbreviation for the state of
                 * the address.
                 */
                fun state(state: String) = state(JsonField.of(state))

                /**
                 * Sets [Builder.state] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.state] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun state(state: JsonField<String>) = apply { this.state = state }

                /** The ZIP code of the address. */
                fun zip(zip: String) = zip(JsonField.of(zip))

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
                    (if (line1.asKnown().isPresent) 1 else 0) +
                    (if (line2.asKnown().isPresent) 1 else 0) +
                    (if (state.asKnown().isPresent) 1 else 0) +
                    (if (zip.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Address && city == other.city && line1 == other.line1 && line2 == other.line2 && state == other.state && zip == other.zip && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(city, line1, line2, state, zip, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Address{city=$city, line1=$line1, line2=$line2, state=$state, zip=$zip, additionalProperties=$additionalProperties}"
        }

        /** A means of verifying the person's identity. */
        class Identification
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

                    return /* spotless:off */ other is Method && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Identification && method == other.method && numberLast4 == other.numberLast4 && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(method, numberLast4, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Identification{method=$method, numberLast4=$numberLast4, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is NaturalPerson && address == other.address && dateOfBirth == other.dateOfBirth && identification == other.identification && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(address, dateOfBirth, identification, name, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "NaturalPerson{address=$address, dateOfBirth=$dateOfBirth, identification=$identification, name=$name, additionalProperties=$additionalProperties}"
    }

    /** The status of the entity. */
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

            /** The entity is active. */
            @JvmField val ACTIVE = of("active")

            /** The entity is archived, and can no longer be used to create accounts. */
            @JvmField val ARCHIVED = of("archived")

            /** The entity is temporarily disabled and cannot be used for financial activity. */
            @JvmField val DISABLED = of("disabled")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            /** The entity is active. */
            ACTIVE,
            /** The entity is archived, and can no longer be used to create accounts. */
            ARCHIVED,
            /** The entity is temporarily disabled and cannot be used for financial activity. */
            DISABLED,
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
            /** The entity is active. */
            ACTIVE,
            /** The entity is archived, and can no longer be used to create accounts. */
            ARCHIVED,
            /** The entity is temporarily disabled and cannot be used for financial activity. */
            DISABLED,
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
                ARCHIVED -> Value.ARCHIVED
                DISABLED -> Value.DISABLED
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
                ARCHIVED -> Known.ARCHIVED
                DISABLED -> Known.DISABLED
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

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The entity's legal structure. */
    class Structure @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            /** A corporation. */
            @JvmField val CORPORATION = of("corporation")

            /** An individual person. */
            @JvmField val NATURAL_PERSON = of("natural_person")

            /** Multiple individual people. */
            @JvmField val JOINT = of("joint")

            /** A trust. */
            @JvmField val TRUST = of("trust")

            /** A government authority. */
            @JvmField val GOVERNMENT_AUTHORITY = of("government_authority")

            @JvmStatic fun of(value: String) = Structure(JsonField.of(value))
        }

        /** An enum containing [Structure]'s known values. */
        enum class Known {
            /** A corporation. */
            CORPORATION,
            /** An individual person. */
            NATURAL_PERSON,
            /** Multiple individual people. */
            JOINT,
            /** A trust. */
            TRUST,
            /** A government authority. */
            GOVERNMENT_AUTHORITY,
        }

        /**
         * An enum containing [Structure]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Structure] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            /** A corporation. */
            CORPORATION,
            /** An individual person. */
            NATURAL_PERSON,
            /** Multiple individual people. */
            JOINT,
            /** A trust. */
            TRUST,
            /** A government authority. */
            GOVERNMENT_AUTHORITY,
            /**
             * An enum member indicating that [Structure] was instantiated with an unknown value.
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
                CORPORATION -> Value.CORPORATION
                NATURAL_PERSON -> Value.NATURAL_PERSON
                JOINT -> Value.JOINT
                TRUST -> Value.TRUST
                GOVERNMENT_AUTHORITY -> Value.GOVERNMENT_AUTHORITY
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
                CORPORATION -> Known.CORPORATION
                NATURAL_PERSON -> Known.NATURAL_PERSON
                JOINT -> Known.JOINT
                TRUST -> Known.TRUST
                GOVERNMENT_AUTHORITY -> Known.GOVERNMENT_AUTHORITY
                else -> throw IncreaseInvalidDataException("Unknown Structure: $value")
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

        fun validate(): Structure = apply {
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

            return /* spotless:off */ other is Structure && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * A reference to data stored in a third-party verification service. Your integration may or may
     * not use this field.
     */
    class ThirdPartyVerification
    private constructor(
        private val reference: JsonField<String>,
        private val vendor: JsonField<Vendor>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("reference")
            @ExcludeMissing
            reference: JsonField<String> = JsonMissing.of(),
            @JsonProperty("vendor") @ExcludeMissing vendor: JsonField<Vendor> = JsonMissing.of(),
        ) : this(reference, vendor, mutableMapOf())

        /**
         * The reference identifier for the third party verification.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun reference(): String = reference.getRequired("reference")

        /**
         * The vendor that was used to perform the verification.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun vendor(): Vendor = vendor.getRequired("vendor")

        /**
         * Returns the raw JSON value of [reference].
         *
         * Unlike [reference], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reference") @ExcludeMissing fun _reference(): JsonField<String> = reference

        /**
         * Returns the raw JSON value of [vendor].
         *
         * Unlike [vendor], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("vendor") @ExcludeMissing fun _vendor(): JsonField<Vendor> = vendor

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
             * Returns a mutable builder for constructing an instance of [ThirdPartyVerification].
             *
             * The following fields are required:
             * ```java
             * .reference()
             * .vendor()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ThirdPartyVerification]. */
        class Builder internal constructor() {

            private var reference: JsonField<String>? = null
            private var vendor: JsonField<Vendor>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(thirdPartyVerification: ThirdPartyVerification) = apply {
                reference = thirdPartyVerification.reference
                vendor = thirdPartyVerification.vendor
                additionalProperties = thirdPartyVerification.additionalProperties.toMutableMap()
            }

            /** The reference identifier for the third party verification. */
            fun reference(reference: String) = reference(JsonField.of(reference))

            /**
             * Sets [Builder.reference] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reference] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reference(reference: JsonField<String>) = apply { this.reference = reference }

            /** The vendor that was used to perform the verification. */
            fun vendor(vendor: Vendor) = vendor(JsonField.of(vendor))

            /**
             * Sets [Builder.vendor] to an arbitrary JSON value.
             *
             * You should usually call [Builder.vendor] with a well-typed [Vendor] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun vendor(vendor: JsonField<Vendor>) = apply { this.vendor = vendor }

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
             * Returns an immutable instance of [ThirdPartyVerification].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .reference()
             * .vendor()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ThirdPartyVerification =
                ThirdPartyVerification(
                    checkRequired("reference", reference),
                    checkRequired("vendor", vendor),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ThirdPartyVerification = apply {
            if (validated) {
                return@apply
            }

            reference()
            vendor().validate()
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
            (if (reference.asKnown().isPresent) 1 else 0) +
                (vendor.asKnown().getOrNull()?.validity() ?: 0)

        /** The vendor that was used to perform the verification. */
        class Vendor @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                /** Alloy. See https://alloy.com for more information. */
                @JvmField val ALLOY = of("alloy")

                /** Middesk. See https://middesk.com for more information. */
                @JvmField val MIDDESK = of("middesk")

                @JvmStatic fun of(value: String) = Vendor(JsonField.of(value))
            }

            /** An enum containing [Vendor]'s known values. */
            enum class Known {
                /** Alloy. See https://alloy.com for more information. */
                ALLOY,
                /** Middesk. See https://middesk.com for more information. */
                MIDDESK,
            }

            /**
             * An enum containing [Vendor]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Vendor] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /** Alloy. See https://alloy.com for more information. */
                ALLOY,
                /** Middesk. See https://middesk.com for more information. */
                MIDDESK,
                /**
                 * An enum member indicating that [Vendor] was instantiated with an unknown value.
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
                    ALLOY -> Value.ALLOY
                    MIDDESK -> Value.MIDDESK
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
                    ALLOY -> Known.ALLOY
                    MIDDESK -> Known.MIDDESK
                    else -> throw IncreaseInvalidDataException("Unknown Vendor: $value")
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

            fun validate(): Vendor = apply {
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

                return /* spotless:off */ other is Vendor && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ThirdPartyVerification && reference == other.reference && vendor == other.vendor && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(reference, vendor, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ThirdPartyVerification{reference=$reference, vendor=$vendor, additionalProperties=$additionalProperties}"
    }

    /** Details of the trust entity. Will be present if `structure` is equal to `trust`. */
    class Trust
    private constructor(
        private val address: JsonField<Address>,
        private val category: JsonField<Category>,
        private val formationDocumentFileId: JsonField<String>,
        private val formationState: JsonField<String>,
        private val grantor: JsonField<Grantor>,
        private val name: JsonField<String>,
        private val taxIdentifier: JsonField<String>,
        private val trustees: JsonField<List<Trustee>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("address") @ExcludeMissing address: JsonField<Address> = JsonMissing.of(),
            @JsonProperty("category")
            @ExcludeMissing
            category: JsonField<Category> = JsonMissing.of(),
            @JsonProperty("formation_document_file_id")
            @ExcludeMissing
            formationDocumentFileId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("formation_state")
            @ExcludeMissing
            formationState: JsonField<String> = JsonMissing.of(),
            @JsonProperty("grantor") @ExcludeMissing grantor: JsonField<Grantor> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tax_identifier")
            @ExcludeMissing
            taxIdentifier: JsonField<String> = JsonMissing.of(),
            @JsonProperty("trustees")
            @ExcludeMissing
            trustees: JsonField<List<Trustee>> = JsonMissing.of(),
        ) : this(
            address,
            category,
            formationDocumentFileId,
            formationState,
            grantor,
            name,
            taxIdentifier,
            trustees,
            mutableMapOf(),
        )

        /**
         * The trust's address.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun address(): Address = address.getRequired("address")

        /**
         * Whether the trust is `revocable` or `irrevocable`.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun category(): Category = category.getRequired("category")

        /**
         * The ID for the File containing the formation document of the trust.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun formationDocumentFileId(): Optional<String> =
            formationDocumentFileId.getOptional("formation_document_file_id")

        /**
         * The two-letter United States Postal Service (USPS) abbreviation for the state in which
         * the trust was formed.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun formationState(): Optional<String> = formationState.getOptional("formation_state")

        /**
         * The grantor of the trust. Will be present if the `category` is `revocable`.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun grantor(): Optional<Grantor> = grantor.getOptional("grantor")

        /**
         * The trust's name.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * The Employer Identification Number (EIN) of the trust itself.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun taxIdentifier(): Optional<String> = taxIdentifier.getOptional("tax_identifier")

        /**
         * The trustees of the trust.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun trustees(): List<Trustee> = trustees.getRequired("trustees")

        /**
         * Returns the raw JSON value of [address].
         *
         * Unlike [address], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("address") @ExcludeMissing fun _address(): JsonField<Address> = address

        /**
         * Returns the raw JSON value of [category].
         *
         * Unlike [category], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("category") @ExcludeMissing fun _category(): JsonField<Category> = category

        /**
         * Returns the raw JSON value of [formationDocumentFileId].
         *
         * Unlike [formationDocumentFileId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("formation_document_file_id")
        @ExcludeMissing
        fun _formationDocumentFileId(): JsonField<String> = formationDocumentFileId

        /**
         * Returns the raw JSON value of [formationState].
         *
         * Unlike [formationState], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("formation_state")
        @ExcludeMissing
        fun _formationState(): JsonField<String> = formationState

        /**
         * Returns the raw JSON value of [grantor].
         *
         * Unlike [grantor], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("grantor") @ExcludeMissing fun _grantor(): JsonField<Grantor> = grantor

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [taxIdentifier].
         *
         * Unlike [taxIdentifier], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("tax_identifier")
        @ExcludeMissing
        fun _taxIdentifier(): JsonField<String> = taxIdentifier

        /**
         * Returns the raw JSON value of [trustees].
         *
         * Unlike [trustees], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("trustees")
        @ExcludeMissing
        fun _trustees(): JsonField<List<Trustee>> = trustees

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
             * Returns a mutable builder for constructing an instance of [Trust].
             *
             * The following fields are required:
             * ```java
             * .address()
             * .category()
             * .formationDocumentFileId()
             * .formationState()
             * .grantor()
             * .name()
             * .taxIdentifier()
             * .trustees()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Trust]. */
        class Builder internal constructor() {

            private var address: JsonField<Address>? = null
            private var category: JsonField<Category>? = null
            private var formationDocumentFileId: JsonField<String>? = null
            private var formationState: JsonField<String>? = null
            private var grantor: JsonField<Grantor>? = null
            private var name: JsonField<String>? = null
            private var taxIdentifier: JsonField<String>? = null
            private var trustees: JsonField<MutableList<Trustee>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(trust: Trust) = apply {
                address = trust.address
                category = trust.category
                formationDocumentFileId = trust.formationDocumentFileId
                formationState = trust.formationState
                grantor = trust.grantor
                name = trust.name
                taxIdentifier = trust.taxIdentifier
                trustees = trust.trustees.map { it.toMutableList() }
                additionalProperties = trust.additionalProperties.toMutableMap()
            }

            /** The trust's address. */
            fun address(address: Address) = address(JsonField.of(address))

            /**
             * Sets [Builder.address] to an arbitrary JSON value.
             *
             * You should usually call [Builder.address] with a well-typed [Address] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun address(address: JsonField<Address>) = apply { this.address = address }

            /** Whether the trust is `revocable` or `irrevocable`. */
            fun category(category: Category) = category(JsonField.of(category))

            /**
             * Sets [Builder.category] to an arbitrary JSON value.
             *
             * You should usually call [Builder.category] with a well-typed [Category] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun category(category: JsonField<Category>) = apply { this.category = category }

            /** The ID for the File containing the formation document of the trust. */
            fun formationDocumentFileId(formationDocumentFileId: String?) =
                formationDocumentFileId(JsonField.ofNullable(formationDocumentFileId))

            /**
             * Alias for calling [Builder.formationDocumentFileId] with
             * `formationDocumentFileId.orElse(null)`.
             */
            fun formationDocumentFileId(formationDocumentFileId: Optional<String>) =
                formationDocumentFileId(formationDocumentFileId.getOrNull())

            /**
             * Sets [Builder.formationDocumentFileId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.formationDocumentFileId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun formationDocumentFileId(formationDocumentFileId: JsonField<String>) = apply {
                this.formationDocumentFileId = formationDocumentFileId
            }

            /**
             * The two-letter United States Postal Service (USPS) abbreviation for the state in
             * which the trust was formed.
             */
            fun formationState(formationState: String?) =
                formationState(JsonField.ofNullable(formationState))

            /** Alias for calling [Builder.formationState] with `formationState.orElse(null)`. */
            fun formationState(formationState: Optional<String>) =
                formationState(formationState.getOrNull())

            /**
             * Sets [Builder.formationState] to an arbitrary JSON value.
             *
             * You should usually call [Builder.formationState] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun formationState(formationState: JsonField<String>) = apply {
                this.formationState = formationState
            }

            /** The grantor of the trust. Will be present if the `category` is `revocable`. */
            fun grantor(grantor: Grantor?) = grantor(JsonField.ofNullable(grantor))

            /** Alias for calling [Builder.grantor] with `grantor.orElse(null)`. */
            fun grantor(grantor: Optional<Grantor>) = grantor(grantor.getOrNull())

            /**
             * Sets [Builder.grantor] to an arbitrary JSON value.
             *
             * You should usually call [Builder.grantor] with a well-typed [Grantor] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun grantor(grantor: JsonField<Grantor>) = apply { this.grantor = grantor }

            /** The trust's name. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** The Employer Identification Number (EIN) of the trust itself. */
            fun taxIdentifier(taxIdentifier: String?) =
                taxIdentifier(JsonField.ofNullable(taxIdentifier))

            /** Alias for calling [Builder.taxIdentifier] with `taxIdentifier.orElse(null)`. */
            fun taxIdentifier(taxIdentifier: Optional<String>) =
                taxIdentifier(taxIdentifier.getOrNull())

            /**
             * Sets [Builder.taxIdentifier] to an arbitrary JSON value.
             *
             * You should usually call [Builder.taxIdentifier] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun taxIdentifier(taxIdentifier: JsonField<String>) = apply {
                this.taxIdentifier = taxIdentifier
            }

            /** The trustees of the trust. */
            fun trustees(trustees: List<Trustee>) = trustees(JsonField.of(trustees))

            /**
             * Sets [Builder.trustees] to an arbitrary JSON value.
             *
             * You should usually call [Builder.trustees] with a well-typed `List<Trustee>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun trustees(trustees: JsonField<List<Trustee>>) = apply {
                this.trustees = trustees.map { it.toMutableList() }
            }

            /**
             * Adds a single [Trustee] to [trustees].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addTrustee(trustee: Trustee) = apply {
                trustees =
                    (trustees ?: JsonField.of(mutableListOf())).also {
                        checkKnown("trustees", it).add(trustee)
                    }
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
             * Returns an immutable instance of [Trust].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .address()
             * .category()
             * .formationDocumentFileId()
             * .formationState()
             * .grantor()
             * .name()
             * .taxIdentifier()
             * .trustees()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Trust =
                Trust(
                    checkRequired("address", address),
                    checkRequired("category", category),
                    checkRequired("formationDocumentFileId", formationDocumentFileId),
                    checkRequired("formationState", formationState),
                    checkRequired("grantor", grantor),
                    checkRequired("name", name),
                    checkRequired("taxIdentifier", taxIdentifier),
                    checkRequired("trustees", trustees).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Trust = apply {
            if (validated) {
                return@apply
            }

            address().validate()
            category().validate()
            formationDocumentFileId()
            formationState()
            grantor().ifPresent { it.validate() }
            name()
            taxIdentifier()
            trustees().forEach { it.validate() }
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
                (category.asKnown().getOrNull()?.validity() ?: 0) +
                (if (formationDocumentFileId.asKnown().isPresent) 1 else 0) +
                (if (formationState.asKnown().isPresent) 1 else 0) +
                (grantor.asKnown().getOrNull()?.validity() ?: 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (taxIdentifier.asKnown().isPresent) 1 else 0) +
                (trustees.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        /** The trust's address. */
        class Address
        private constructor(
            private val city: JsonField<String>,
            private val line1: JsonField<String>,
            private val line2: JsonField<String>,
            private val state: JsonField<String>,
            private val zip: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("city") @ExcludeMissing city: JsonField<String> = JsonMissing.of(),
                @JsonProperty("line1") @ExcludeMissing line1: JsonField<String> = JsonMissing.of(),
                @JsonProperty("line2") @ExcludeMissing line2: JsonField<String> = JsonMissing.of(),
                @JsonProperty("state") @ExcludeMissing state: JsonField<String> = JsonMissing.of(),
                @JsonProperty("zip") @ExcludeMissing zip: JsonField<String> = JsonMissing.of(),
            ) : this(city, line1, line2, state, zip, mutableMapOf())

            /**
             * The city of the address.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun city(): String = city.getRequired("city")

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
             * The two-letter United States Postal Service (USPS) abbreviation for the state of the
             * address.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun state(): String = state.getRequired("state")

            /**
             * The ZIP code of the address.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun zip(): String = zip.getRequired("zip")

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
                private var line1: JsonField<String>? = null
                private var line2: JsonField<String>? = null
                private var state: JsonField<String>? = null
                private var zip: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(address: Address) = apply {
                    city = address.city
                    line1 = address.line1
                    line2 = address.line2
                    state = address.state
                    zip = address.zip
                    additionalProperties = address.additionalProperties.toMutableMap()
                }

                /** The city of the address. */
                fun city(city: String) = city(JsonField.of(city))

                /**
                 * Sets [Builder.city] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.city] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun city(city: JsonField<String>) = apply { this.city = city }

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
                 * The two-letter United States Postal Service (USPS) abbreviation for the state of
                 * the address.
                 */
                fun state(state: String) = state(JsonField.of(state))

                /**
                 * Sets [Builder.state] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.state] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun state(state: JsonField<String>) = apply { this.state = state }

                /** The ZIP code of the address. */
                fun zip(zip: String) = zip(JsonField.of(zip))

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
                    (if (line1.asKnown().isPresent) 1 else 0) +
                    (if (line2.asKnown().isPresent) 1 else 0) +
                    (if (state.asKnown().isPresent) 1 else 0) +
                    (if (zip.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Address && city == other.city && line1 == other.line1 && line2 == other.line2 && state == other.state && zip == other.zip && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(city, line1, line2, state, zip, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Address{city=$city, line1=$line1, line2=$line2, state=$state, zip=$zip, additionalProperties=$additionalProperties}"
        }

        /** Whether the trust is `revocable` or `irrevocable`. */
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

                /** The trust is revocable by the grantor. */
                @JvmField val REVOCABLE = of("revocable")

                /** The trust cannot be revoked. */
                @JvmField val IRREVOCABLE = of("irrevocable")

                @JvmStatic fun of(value: String) = Category(JsonField.of(value))
            }

            /** An enum containing [Category]'s known values. */
            enum class Known {
                /** The trust is revocable by the grantor. */
                REVOCABLE,
                /** The trust cannot be revoked. */
                IRREVOCABLE,
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
                /** The trust is revocable by the grantor. */
                REVOCABLE,
                /** The trust cannot be revoked. */
                IRREVOCABLE,
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
                    REVOCABLE -> Value.REVOCABLE
                    IRREVOCABLE -> Value.IRREVOCABLE
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
                    REVOCABLE -> Known.REVOCABLE
                    IRREVOCABLE -> Known.IRREVOCABLE
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

                return /* spotless:off */ other is Category && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** The grantor of the trust. Will be present if the `category` is `revocable`. */
        class Grantor
        private constructor(
            private val address: JsonField<Address>,
            private val dateOfBirth: JsonField<LocalDate>,
            private val identification: JsonField<Identification>,
            private val name: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("address")
                @ExcludeMissing
                address: JsonField<Address> = JsonMissing.of(),
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
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun address(): Address = address.getRequired("address")

            /**
             * The person's date of birth in YYYY-MM-DD format.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun dateOfBirth(): LocalDate = dateOfBirth.getRequired("date_of_birth")

            /**
             * A means of verifying the person's identity.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun identification(): Identification = identification.getRequired("identification")

            /**
             * The person's legal name.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
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
             * Unlike [dateOfBirth], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("date_of_birth")
            @ExcludeMissing
            fun _dateOfBirth(): JsonField<LocalDate> = dateOfBirth

            /**
             * Returns the raw JSON value of [identification].
             *
             * Unlike [identification], this method doesn't throw if the JSON field has an
             * unexpected type.
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
                 * Returns a mutable builder for constructing an instance of [Grantor].
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

            /** A builder for [Grantor]. */
            class Builder internal constructor() {

                private var address: JsonField<Address>? = null
                private var dateOfBirth: JsonField<LocalDate>? = null
                private var identification: JsonField<Identification>? = null
                private var name: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(grantor: Grantor) = apply {
                    address = grantor.address
                    dateOfBirth = grantor.dateOfBirth
                    identification = grantor.identification
                    name = grantor.name
                    additionalProperties = grantor.additionalProperties.toMutableMap()
                }

                /** The person's address. */
                fun address(address: Address) = address(JsonField.of(address))

                /**
                 * Sets [Builder.address] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.address] with a well-typed [Address] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun address(address: JsonField<Address>) = apply { this.address = address }

                /** The person's date of birth in YYYY-MM-DD format. */
                fun dateOfBirth(dateOfBirth: LocalDate) = dateOfBirth(JsonField.of(dateOfBirth))

                /**
                 * Sets [Builder.dateOfBirth] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.dateOfBirth] with a well-typed [LocalDate] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                 * You should usually call [Builder.identification] with a well-typed
                 * [Identification] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun identification(identification: JsonField<Identification>) = apply {
                    this.identification = identification
                }

                /** The person's legal name. */
                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

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
                 * Returns an immutable instance of [Grantor].
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
                fun build(): Grantor =
                    Grantor(
                        checkRequired("address", address),
                        checkRequired("dateOfBirth", dateOfBirth),
                        checkRequired("identification", identification),
                        checkRequired("name", name),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Grantor = apply {
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
            private constructor(
                private val city: JsonField<String>,
                private val line1: JsonField<String>,
                private val line2: JsonField<String>,
                private val state: JsonField<String>,
                private val zip: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("city")
                    @ExcludeMissing
                    city: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("line1")
                    @ExcludeMissing
                    line1: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("line2")
                    @ExcludeMissing
                    line2: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("state")
                    @ExcludeMissing
                    state: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("zip") @ExcludeMissing zip: JsonField<String> = JsonMissing.of(),
                ) : this(city, line1, line2, state, zip, mutableMapOf())

                /**
                 * The city of the address.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun city(): String = city.getRequired("city")

                /**
                 * The first line of the address.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun line1(): String = line1.getRequired("line1")

                /**
                 * The second line of the address.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun line2(): Optional<String> = line2.getOptional("line2")

                /**
                 * The two-letter United States Postal Service (USPS) abbreviation for the state of
                 * the address.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun state(): String = state.getRequired("state")

                /**
                 * The ZIP code of the address.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun zip(): String = zip.getRequired("zip")

                /**
                 * Returns the raw JSON value of [city].
                 *
                 * Unlike [city], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

                /**
                 * Returns the raw JSON value of [line1].
                 *
                 * Unlike [line1], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("line1") @ExcludeMissing fun _line1(): JsonField<String> = line1

                /**
                 * Returns the raw JSON value of [line2].
                 *
                 * Unlike [line2], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("line2") @ExcludeMissing fun _line2(): JsonField<String> = line2

                /**
                 * Returns the raw JSON value of [state].
                 *
                 * Unlike [state], this method doesn't throw if the JSON field has an unexpected
                 * type.
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
                    private var line1: JsonField<String>? = null
                    private var line2: JsonField<String>? = null
                    private var state: JsonField<String>? = null
                    private var zip: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(address: Address) = apply {
                        city = address.city
                        line1 = address.line1
                        line2 = address.line2
                        state = address.state
                        zip = address.zip
                        additionalProperties = address.additionalProperties.toMutableMap()
                    }

                    /** The city of the address. */
                    fun city(city: String) = city(JsonField.of(city))

                    /**
                     * Sets [Builder.city] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.city] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun city(city: JsonField<String>) = apply { this.city = city }

                    /** The first line of the address. */
                    fun line1(line1: String) = line1(JsonField.of(line1))

                    /**
                     * Sets [Builder.line1] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.line1] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

                    /** The second line of the address. */
                    fun line2(line2: String?) = line2(JsonField.ofNullable(line2))

                    /** Alias for calling [Builder.line2] with `line2.orElse(null)`. */
                    fun line2(line2: Optional<String>) = line2(line2.getOrNull())

                    /**
                     * Sets [Builder.line2] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.line2] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

                    /**
                     * The two-letter United States Postal Service (USPS) abbreviation for the state
                     * of the address.
                     */
                    fun state(state: String) = state(JsonField.of(state))

                    /**
                     * Sets [Builder.state] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.state] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun state(state: JsonField<String>) = apply { this.state = state }

                    /** The ZIP code of the address. */
                    fun zip(zip: String) = zip(JsonField.of(zip))

                    /**
                     * Sets [Builder.zip] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.zip] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
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
                        (if (line1.asKnown().isPresent) 1 else 0) +
                        (if (line2.asKnown().isPresent) 1 else 0) +
                        (if (state.asKnown().isPresent) 1 else 0) +
                        (if (zip.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Address && city == other.city && line1 == other.line1 && line2 == other.line2 && state == other.state && zip == other.zip && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(city, line1, line2, state, zip, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Address{city=$city, line1=$line1, line2=$line2, state=$state, zip=$zip, additionalProperties=$additionalProperties}"
            }

            /** A means of verifying the person's identity. */
            class Identification
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
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun method(): Method = method.getRequired("method")

                /**
                 * The last 4 digits of the identification number that can be used to verify the
                 * individual's identity.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun numberLast4(): String = numberLast4.getRequired("number_last4")

                /**
                 * Returns the raw JSON value of [method].
                 *
                 * Unlike [method], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("method") @ExcludeMissing fun _method(): JsonField<Method> = method

                /**
                 * Returns the raw JSON value of [numberLast4].
                 *
                 * Unlike [numberLast4], this method doesn't throw if the JSON field has an
                 * unexpected type.
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
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
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
                     * You should usually call [Builder.numberLast4] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
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
                class Method
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
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
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
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
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
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws IncreaseInvalidDataException if this class instance's value is a not
                     *   a known member.
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
                     * @throws IncreaseInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Method && value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Identification && method == other.method && numberLast4 == other.numberLast4 && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(method, numberLast4, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Identification{method=$method, numberLast4=$numberLast4, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Grantor && address == other.address && dateOfBirth == other.dateOfBirth && identification == other.identification && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(address, dateOfBirth, identification, name, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Grantor{address=$address, dateOfBirth=$dateOfBirth, identification=$identification, name=$name, additionalProperties=$additionalProperties}"
        }

        class Trustee
        private constructor(
            private val individual: JsonField<Individual>,
            private val structure: JsonField<Structure>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("individual")
                @ExcludeMissing
                individual: JsonField<Individual> = JsonMissing.of(),
                @JsonProperty("structure")
                @ExcludeMissing
                structure: JsonField<Structure> = JsonMissing.of(),
            ) : this(individual, structure, mutableMapOf())

            /**
             * The individual trustee of the trust. Will be present if the trustee's `structure` is
             * equal to `individual`.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun individual(): Optional<Individual> = individual.getOptional("individual")

            /**
             * The structure of the trustee. Will always be equal to `individual`.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun structure(): Structure = structure.getRequired("structure")

            /**
             * Returns the raw JSON value of [individual].
             *
             * Unlike [individual], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("individual")
            @ExcludeMissing
            fun _individual(): JsonField<Individual> = individual

            /**
             * Returns the raw JSON value of [structure].
             *
             * Unlike [structure], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("structure")
            @ExcludeMissing
            fun _structure(): JsonField<Structure> = structure

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
                 * Returns a mutable builder for constructing an instance of [Trustee].
                 *
                 * The following fields are required:
                 * ```java
                 * .individual()
                 * .structure()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Trustee]. */
            class Builder internal constructor() {

                private var individual: JsonField<Individual>? = null
                private var structure: JsonField<Structure>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(trustee: Trustee) = apply {
                    individual = trustee.individual
                    structure = trustee.structure
                    additionalProperties = trustee.additionalProperties.toMutableMap()
                }

                /**
                 * The individual trustee of the trust. Will be present if the trustee's `structure`
                 * is equal to `individual`.
                 */
                fun individual(individual: Individual?) =
                    individual(JsonField.ofNullable(individual))

                /** Alias for calling [Builder.individual] with `individual.orElse(null)`. */
                fun individual(individual: Optional<Individual>) =
                    individual(individual.getOrNull())

                /**
                 * Sets [Builder.individual] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.individual] with a well-typed [Individual] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun individual(individual: JsonField<Individual>) = apply {
                    this.individual = individual
                }

                /** The structure of the trustee. Will always be equal to `individual`. */
                fun structure(structure: Structure) = structure(JsonField.of(structure))

                /**
                 * Sets [Builder.structure] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.structure] with a well-typed [Structure] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun structure(structure: JsonField<Structure>) = apply {
                    this.structure = structure
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
                 * Returns an immutable instance of [Trustee].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .individual()
                 * .structure()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Trustee =
                    Trustee(
                        checkRequired("individual", individual),
                        checkRequired("structure", structure),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Trustee = apply {
                if (validated) {
                    return@apply
                }

                individual().ifPresent { it.validate() }
                structure().validate()
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
                (individual.asKnown().getOrNull()?.validity() ?: 0) +
                    (structure.asKnown().getOrNull()?.validity() ?: 0)

            /**
             * The individual trustee of the trust. Will be present if the trustee's `structure` is
             * equal to `individual`.
             */
            class Individual
            private constructor(
                private val address: JsonField<Address>,
                private val dateOfBirth: JsonField<LocalDate>,
                private val identification: JsonField<Identification>,
                private val name: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("address")
                    @ExcludeMissing
                    address: JsonField<Address> = JsonMissing.of(),
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
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun address(): Address = address.getRequired("address")

                /**
                 * The person's date of birth in YYYY-MM-DD format.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun dateOfBirth(): LocalDate = dateOfBirth.getRequired("date_of_birth")

                /**
                 * A means of verifying the person's identity.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun identification(): Identification = identification.getRequired("identification")

                /**
                 * The person's legal name.
                 *
                 * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun name(): String = name.getRequired("name")

                /**
                 * Returns the raw JSON value of [address].
                 *
                 * Unlike [address], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("address")
                @ExcludeMissing
                fun _address(): JsonField<Address> = address

                /**
                 * Returns the raw JSON value of [dateOfBirth].
                 *
                 * Unlike [dateOfBirth], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("date_of_birth")
                @ExcludeMissing
                fun _dateOfBirth(): JsonField<LocalDate> = dateOfBirth

                /**
                 * Returns the raw JSON value of [identification].
                 *
                 * Unlike [identification], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("identification")
                @ExcludeMissing
                fun _identification(): JsonField<Identification> = identification

                /**
                 * Returns the raw JSON value of [name].
                 *
                 * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                 * type.
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
                     * You should usually call [Builder.address] with a well-typed [Address] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun address(address: JsonField<Address>) = apply { this.address = address }

                    /** The person's date of birth in YYYY-MM-DD format. */
                    fun dateOfBirth(dateOfBirth: LocalDate) = dateOfBirth(JsonField.of(dateOfBirth))

                    /**
                     * Sets [Builder.dateOfBirth] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.dateOfBirth] with a well-typed [LocalDate]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
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
                     * You should usually call [Builder.identification] with a well-typed
                     * [Identification] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun identification(identification: JsonField<Identification>) = apply {
                        this.identification = identification
                    }

                    /** The person's legal name. */
                    fun name(name: String) = name(JsonField.of(name))

                    /**
                     * Sets [Builder.name] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.name] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun name(name: JsonField<String>) = apply { this.name = name }

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
                private constructor(
                    private val city: JsonField<String>,
                    private val line1: JsonField<String>,
                    private val line2: JsonField<String>,
                    private val state: JsonField<String>,
                    private val zip: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("city")
                        @ExcludeMissing
                        city: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("line1")
                        @ExcludeMissing
                        line1: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("line2")
                        @ExcludeMissing
                        line2: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("state")
                        @ExcludeMissing
                        state: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("zip")
                        @ExcludeMissing
                        zip: JsonField<String> = JsonMissing.of(),
                    ) : this(city, line1, line2, state, zip, mutableMapOf())

                    /**
                     * The city of the address.
                     *
                     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun city(): String = city.getRequired("city")

                    /**
                     * The first line of the address.
                     *
                     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun line1(): String = line1.getRequired("line1")

                    /**
                     * The second line of the address.
                     *
                     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun line2(): Optional<String> = line2.getOptional("line2")

                    /**
                     * The two-letter United States Postal Service (USPS) abbreviation for the state
                     * of the address.
                     *
                     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun state(): String = state.getRequired("state")

                    /**
                     * The ZIP code of the address.
                     *
                     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun zip(): String = zip.getRequired("zip")

                    /**
                     * Returns the raw JSON value of [city].
                     *
                     * Unlike [city], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

                    /**
                     * Returns the raw JSON value of [line1].
                     *
                     * Unlike [line1], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("line1") @ExcludeMissing fun _line1(): JsonField<String> = line1

                    /**
                     * Returns the raw JSON value of [line2].
                     *
                     * Unlike [line2], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("line2") @ExcludeMissing fun _line2(): JsonField<String> = line2

                    /**
                     * Returns the raw JSON value of [state].
                     *
                     * Unlike [state], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

                    /**
                     * Returns the raw JSON value of [zip].
                     *
                     * Unlike [zip], this method doesn't throw if the JSON field has an unexpected
                     * type.
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
                        private var line1: JsonField<String>? = null
                        private var line2: JsonField<String>? = null
                        private var state: JsonField<String>? = null
                        private var zip: JsonField<String>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(address: Address) = apply {
                            city = address.city
                            line1 = address.line1
                            line2 = address.line2
                            state = address.state
                            zip = address.zip
                            additionalProperties = address.additionalProperties.toMutableMap()
                        }

                        /** The city of the address. */
                        fun city(city: String) = city(JsonField.of(city))

                        /**
                         * Sets [Builder.city] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.city] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun city(city: JsonField<String>) = apply { this.city = city }

                        /** The first line of the address. */
                        fun line1(line1: String) = line1(JsonField.of(line1))

                        /**
                         * Sets [Builder.line1] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.line1] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

                        /** The second line of the address. */
                        fun line2(line2: String?) = line2(JsonField.ofNullable(line2))

                        /** Alias for calling [Builder.line2] with `line2.orElse(null)`. */
                        fun line2(line2: Optional<String>) = line2(line2.getOrNull())

                        /**
                         * Sets [Builder.line2] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.line2] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

                        /**
                         * The two-letter United States Postal Service (USPS) abbreviation for the
                         * state of the address.
                         */
                        fun state(state: String) = state(JsonField.of(state))

                        /**
                         * Sets [Builder.state] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.state] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun state(state: JsonField<String>) = apply { this.state = state }

                        /** The ZIP code of the address. */
                        fun zip(zip: String) = zip(JsonField.of(zip))

                        /**
                         * Sets [Builder.zip] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.zip] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun zip(zip: JsonField<String>) = apply { this.zip = zip }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

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
                            (if (line1.asKnown().isPresent) 1 else 0) +
                            (if (line2.asKnown().isPresent) 1 else 0) +
                            (if (state.asKnown().isPresent) 1 else 0) +
                            (if (zip.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Address && city == other.city && line1 == other.line1 && line2 == other.line2 && state == other.state && zip == other.zip && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(city, line1, line2, state, zip, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Address{city=$city, line1=$line1, line2=$line2, state=$state, zip=$zip, additionalProperties=$additionalProperties}"
                }

                /** A means of verifying the person's identity. */
                class Identification
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
                     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun method(): Method = method.getRequired("method")

                    /**
                     * The last 4 digits of the identification number that can be used to verify the
                     * individual's identity.
                     *
                     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun numberLast4(): String = numberLast4.getRequired("number_last4")

                    /**
                     * Returns the raw JSON value of [method].
                     *
                     * Unlike [method], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("method")
                    @ExcludeMissing
                    fun _method(): JsonField<Method> = method

                    /**
                     * Returns the raw JSON value of [numberLast4].
                     *
                     * Unlike [numberLast4], this method doesn't throw if the JSON field has an
                     * unexpected type.
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
                         * Returns a mutable builder for constructing an instance of
                         * [Identification].
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
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(identification: Identification) = apply {
                            method = identification.method
                            numberLast4 = identification.numberLast4
                            additionalProperties =
                                identification.additionalProperties.toMutableMap()
                        }

                        /** A method that can be used to verify the individual's identity. */
                        fun method(method: Method) = method(JsonField.of(method))

                        /**
                         * Sets [Builder.method] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.method] with a well-typed [Method] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun method(method: JsonField<Method>) = apply { this.method = method }

                        /**
                         * The last 4 digits of the identification number that can be used to verify
                         * the individual's identity.
                         */
                        fun numberLast4(numberLast4: String) =
                            numberLast4(JsonField.of(numberLast4))

                        /**
                         * Sets [Builder.numberLast4] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.numberLast4] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun numberLast4(numberLast4: JsonField<String>) = apply {
                            this.numberLast4 = numberLast4
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

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
                    class Method
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

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
                         * An enum containing [Method]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Method] can contain an unknown value in a couple of
                         * cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
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
                             * An enum member indicating that [Method] was instantiated with an
                             * unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
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
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws IncreaseInvalidDataException if this class instance's value is a
                         *   not a known member.
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
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws IncreaseInvalidDataException if this class instance's value does
                         *   not have the expected primitive type.
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Method && value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Identification && method == other.method && numberLast4 == other.numberLast4 && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(method, numberLast4, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Identification{method=$method, numberLast4=$numberLast4, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Individual && address == other.address && dateOfBirth == other.dateOfBirth && identification == other.identification && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(address, dateOfBirth, identification, name, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Individual{address=$address, dateOfBirth=$dateOfBirth, identification=$identification, name=$name, additionalProperties=$additionalProperties}"
            }

            /** The structure of the trustee. Will always be equal to `individual`. */
            class Structure @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    /** The trustee is an individual. */
                    @JvmField val INDIVIDUAL = of("individual")

                    @JvmStatic fun of(value: String) = Structure(JsonField.of(value))
                }

                /** An enum containing [Structure]'s known values. */
                enum class Known {
                    /** The trustee is an individual. */
                    INDIVIDUAL
                }

                /**
                 * An enum containing [Structure]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Structure] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    /** The trustee is an individual. */
                    INDIVIDUAL,
                    /**
                     * An enum member indicating that [Structure] was instantiated with an unknown
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
                        INDIVIDUAL -> Value.INDIVIDUAL
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
                        INDIVIDUAL -> Known.INDIVIDUAL
                        else -> throw IncreaseInvalidDataException("Unknown Structure: $value")
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

                fun validate(): Structure = apply {
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

                    return /* spotless:off */ other is Structure && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Trustee && individual == other.individual && structure == other.structure && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(individual, structure, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Trustee{individual=$individual, structure=$structure, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Trust && address == other.address && category == other.category && formationDocumentFileId == other.formationDocumentFileId && formationState == other.formationState && grantor == other.grantor && name == other.name && taxIdentifier == other.taxIdentifier && trustees == other.trustees && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(address, category, formationDocumentFileId, formationState, grantor, name, taxIdentifier, trustees, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Trust{address=$address, category=$category, formationDocumentFileId=$formationDocumentFileId, formationState=$formationState, grantor=$grantor, name=$name, taxIdentifier=$taxIdentifier, trustees=$trustees, additionalProperties=$additionalProperties}"
    }

    /** A constant representing the object's type. For this resource it will always be `entity`. */
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

            @JvmField val ENTITY = of("entity")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            ENTITY
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
            ENTITY,
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
                ENTITY -> Value.ENTITY
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
                ENTITY -> Known.ENTITY
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

            return /* spotless:off */ other is Type && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Entity && id == other.id && corporation == other.corporation && createdAt == other.createdAt && description == other.description && detailsConfirmedAt == other.detailsConfirmedAt && governmentAuthority == other.governmentAuthority && idempotencyKey == other.idempotencyKey && joint == other.joint && naturalPerson == other.naturalPerson && status == other.status && structure == other.structure && supplementalDocuments == other.supplementalDocuments && thirdPartyVerification == other.thirdPartyVerification && trust == other.trust && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, corporation, createdAt, description, detailsConfirmedAt, governmentAuthority, idempotencyKey, joint, naturalPerson, status, structure, supplementalDocuments, thirdPartyVerification, trust, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Entity{id=$id, corporation=$corporation, createdAt=$createdAt, description=$description, detailsConfirmedAt=$detailsConfirmedAt, governmentAuthority=$governmentAuthority, idempotencyKey=$idempotencyKey, joint=$joint, naturalPerson=$naturalPerson, status=$status, structure=$structure, supplementalDocuments=$supplementalDocuments, thirdPartyVerification=$thirdPartyVerification, trust=$trust, type=$type, additionalProperties=$additionalProperties}"
}
